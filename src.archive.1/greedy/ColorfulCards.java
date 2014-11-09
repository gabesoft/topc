package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 495 Division I Level One - 275
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11302&rd=14424
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+495
public class ColorfulCards {
    public int[] theCards(int N, String colors) {
        int n = colors.length();

        int sieve[] = buildSieve(N + 1);
        int input[] = new int[n];
        int cards[] = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = (colors.charAt(i) == 'R') ? 1 : 0;
        }

        int min[] = new int[n];
        int max[] = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            do {
                x++;
            } while (sieve[x] != input[i]);
            min[i] = x;
        }

        int y = N + 1;
        for (int i = n - 1; i > -1; i--) {
            do { 
                y--;
            } while (sieve[y] != input[i]);
            max[i] = y;
        }

        for (int i = 0; i < n; i++) {
            cards[i] = (min[i] == max[i]) ? min[i] : -1;
        }

        return cards;
    }

    int[] buildSieve(int n) {
        int sieve[] = new int[n + 1];

        Arrays.fill(sieve, 1);

        sieve[1] = 0;

        for (int i = 2; i < n + 1; i++) {
            if (sieve[i] == 1) {
                for (int j = i * i; j < n + 1; j += i) {
                    sieve[j] = 0;
                }
            }
        }

        return sieve;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
