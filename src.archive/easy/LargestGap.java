package topc.easy;

import java.util.*;
import java.io.*;

// SRM 402 Division I Level Two - 450
// brute force, greedy, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8508&rd=12174
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm402
public class LargestGap {
    int G;

    public int getLargest(String[] board) {
        List<Piece> list = new ArrayList<Piece>();
        String line      = join(board);

        int n = line.length();
        for (int i = 0; i < n; i++) {
            char c        = line.charAt(i);
            boolean block = c == 'X';

            int index  = i;
            int length = 0;
            while (i < n && line.charAt(i) == c) {
                length++;
                i++;
            }

            if (i == n - 1 && line.charAt(i) == c) {
                length++;
            } else {
                i--;
            }

            if (i == n - 1 && list.size() > 0 && (
                        list.get(0).block && line.charAt(i) == 'X' || 
                        !list.get(0).block && line.charAt(i) == '.'
                        )
               ) {
                list.get(0).length += length;
            } else {
                list.add(new Piece(index, length, block));
            }
        }

        if (!list.get(0).block) {
            Piece first = list.get(0);
            list.remove(0);
            list.add(first);
        }

        Piece[] data = list.toArray(new Piece[] {});

        G = 0;
        for (int i = 0; i < data.length; i++) {
            if (!data[i].block) {
                G++;
            }
        }

        int [] best = null;
        int index   = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i].block) {
                int [] curr = gaps(data, i);
                if (better(best, curr)) {
                    best  = curr;
                    index = data[i].index;
                }
            }
        }

        return index;
    }

    int[] gaps(Piece[] data, int i) {
        int[] res = new int[G - 1];
        int g     = 0;

        for (int j = 0; j < data.length; j++) {
            if (!data[j].block) {
                if (i == 0 && g == G - 1) {
                    res[0] += data[j].length;
                } else if (j == i + 1 && g > 0) {
                    res[g - 1] += data[j].length;
                } else {
                    res[g++] = data[j].length;
                }
            }
        }

        return res;
    }

    void sort(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        for(int i = 0; i < n / 2; i++) {
            int temp       = arr[i];
            arr[i]         = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    boolean better(int[] best, int[] arr) {
        sort(arr);

        if (best == null) { 
            sort(arr);
            return true;
        } else {
            for (int i = 0; i < best.length; i++) {
                if (arr[i] > best[i]) {
                    return true;
                } else if (arr[i] < best[i]) {
                    break;
                }
            }
            return false;
        }
    }

    String join(String[] s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            builder.append(s[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Piece {
        int index;
        boolean block;
        int length;

        public Piece(int index, int length, boolean block) {
            this.index  = index;
            this.block  = block;
            this.length = length;
        }
    }
}
