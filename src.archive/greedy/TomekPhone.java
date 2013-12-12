package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 560 Division I Level One - 250
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12296&rd=15182
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+560
public class TomekPhone {
    public int minKeystrokes(int[] frequencies, int[] keySizes) {
        int n = keySizes.length;

        int[] keys = new int[n];
        Arrays.sort(frequencies);

        int sum = 0;
        for (int i = frequencies.length - 1; i > -1; i--) {
            int k = -1;

            for (int j = 0; j < n; j++) {
                if (keys[j] == keySizes[j]) { continue; }

                if (k == -1 || keys[k] > keys[j]) {
                    k = j;
                }
            }

            if (k == -1) { return -1; }

            keys[k]++;
            sum += frequencies[i] * keys[k];
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
