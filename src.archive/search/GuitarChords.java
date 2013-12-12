package topc.search;

import java.util.*;
import java.io.*;

// SRM 389 Division I Level Two - 500
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8545&rd=11123
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm389
public class GuitarChords {
    int[] strings;
    int[] chord;
    int best;

    public int stretch(String[] strings, String[] chord) {
        HashMap<String, Integer> map = getMap();

        this.strings = new int[strings.length];
        this.chord   = new int[chord.length];

        for (int i = 0; i < strings.length; i++) {
            this.strings[i] = map.get(strings[i]);
        }

        for (int i = 0; i < chord.length; i++) {
            this.chord[i] = map.get(chord[i]);
        }

        best = 13;
        find((1 << chord.length) - 1, 0, 0, 0);

        return best;
    }

    void find(int mask, int index, int min, int max) {
        if (index == strings.length) {
            if (mask == 0) {
                if (min == 0 && max == 0) {
                    best = 0;
                }
                else if (min == 0 || max == 0) {
                    best = 1;
                }
                else {
                    best = Math.min(best, max - min + 1);
                }
            }
            return;
        }

        for (int i = 0; i < 24; i++) {
            int s = strings[index];
            int n = (s + i) % 12;
            int c = indexOf(chord, n);

            if (c == -1) { continue; }

            int nmin  = min;
            int nmax  = max;
            int nmask = off(mask, c);

            if (i > 0) {
                nmin = min == 0 ? i : Math.min(min, i);
                nmax = max == 0 ? i : Math.max(max, i);
            }

            find(nmask, index + 1, nmin, nmax);
        }
    }

    int indexOf(int[] array, int x) {
        for (int j = 0; j < array.length; j++) {
            if (x == array[j]) {
                return j;
            }
        }
        return -1;
    }

    boolean isOff(int n, int bit) {
        return ((n >> bit) & 1) == 0;
    }

    int off(int n, int bit) {
        return n & ~(1 << bit);
    }

    HashMap<String, Integer> getMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("A#", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("C#", 4);
        map.put("D", 5);
        map.put("D#", 6);
        map.put("E", 7);
        map.put("F", 8);
        map.put("F#", 9);
        map.put("G", 10);
        map.put("G#", 11);
        return map;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
