package topc.easy;

import java.util.*;
import java.io.*;

// SRM 343 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7509&rd=10667
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm343
public class Mafia {
    int n;
    int amt[][];
    int index;

    public int play(int[] guilt, String[] responses, int playerIndex) {
        n     = guilt.length;
        index = playerIndex;
        amt   = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c    = responses[i].charAt(j);
                amt[i][j] = Character.isUpperCase(c) ? c - 'A' + 1 : -(c - 'a' + 1);
            }
        }

        return find(guilt, 0);
    }

    int find(int[] guilt, int removed) {
       int k = Integer.bitCount(removed); 
       if ((n - k) % 2 == 0) {    // night
           int best = 1;
           for (int i = 0; i < n; i++) {
               if (i != index && isOff(removed, i)) {
                   int a[] = amt[i];
                   updateGuilt(guilt, amt[i], 1);
                   best = Math.max(best, 1 + find(guilt, on(removed, i)));
                   updateGuilt(guilt, amt[i], -1);
               }
           }
           return best;
       } else {                   // day
           int j = -1;
           for (int i = 0; i < n; i++) {
               if (isOff(removed, i) && (j == -1 || guilt[i] > guilt[j])) {
                   j = i;
               }
           }
           return (j == index || j == -1) ? 0 : find(guilt, on(removed, j));
       }
    }

    void updateGuilt(int[] guilt, int[] amt, int mul) {
        for (int i = 0; i < guilt.length; i++) {
            guilt[i] += mul * amt[i];
        }
    }

    boolean isOff(int mask, int k) {
        return !isOn(mask, k);
    }

    boolean isOn(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    int on(int mask, int k) {
        return mask | (1 << k);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
