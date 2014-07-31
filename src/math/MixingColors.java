package topc.math;

import java.util.*;
import java.io.*;

// SRM 621 Division II Level Three - 1000
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10409&rd=15854
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+621
public class MixingColors {
    public int minColors(int[] colors) {
        int n = colors.length;
        int j = 0;

        for (int i = 0; i < 32; i++) {
           int k = j;

           while (k < n && (((colors[k] >> i) & 1) == 0)) {
               k++;
           }

           if (k < n) {
               swap(colors, k, j);

               for (int p = j + 1; p < n; p++) {
                   if (((colors[p] >> i) & 1) == 1) {
                       colors[p] = colors[p] ^ colors[j];
                   }
               }

               j++;
           }
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            if (colors[i] != 0) {
                res++;
            }
        }

        return res;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i]  = a[j];
        a[j]  = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
