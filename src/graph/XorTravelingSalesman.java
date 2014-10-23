package topc.graph;

import java.util.*;
import java.io.*;

// SRM 556 Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12175&rd=15178
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+556
public class XorTravelingSalesman {
    public int maxProfit(int[] cityValues, String[] roads) {
        int n = cityValues.length;
        boolean[] seen = new boolean[n];

        dfs(roads, seen, 0);

        int vals[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (seen[i] && cityValues[i] > 0) {
                vals[i] = cityValues[i];
            }
        }

        Arrays.sort(vals);

        reverse(vals);

        return maxXOR(vals);
    }

    private int maxXOR(int[] vals) {
        int row = 0;
        int col = highestBit(vals[row]);

        while (row < vals.length && col >= 0) {
            if (!bitAt(vals[row], col)) {
                for (int i = row + 1; i < vals.length; i++) {
                    if (bitAt(vals[i], col)) {
                        swap(vals, row, i);
                        break;
                    }
                }
            }

            if (bitAt(vals[row], col)) {
                for (int i = row + 1; i < vals.length; i++) {
                    if (bitAt(vals[i], col)) {
                        vals[i] = (vals[i] ^ vals[row]);
                    }
                }
            }

            if (bitAt(vals[row], col)) {
                row++;
            }

            col--;
        }

        int max = 0;

        for (int i = 0; i < vals.length; i++) {
            int b = highestBit(vals[i]);
            if (b > -1 && !bitAt(max, b)) {
                max ^= vals[i];
            }
        }

        return max;
    }

    private boolean bitAt(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private int highestBit(int n) {
        if (n == 0) { return -1; }

        int bit = 0;
        int k = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                bit = k;
            }
            k++;
            n >>= 1;
        }

        return bit;
    }

    private void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private void dfs(String[] roads, boolean[] seen, int u) {
        if (seen[u]) { return; }

        seen[u] = true;
        for (int i = 0; i < seen.length; i++) {
            if (roads[u].charAt(i) == 'Y') {
                dfs(roads, seen, i);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
