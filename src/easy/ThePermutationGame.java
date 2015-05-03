package topc.easy;

import java.util.*;
import java.io.*;

// SRM 652 Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13229&rd=16316
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+652
public class ThePermutationGame {
    long MOD = 1000000007L;

    public int findMin(int N) {
        int firstPrime[] = new int[N + 1];
        Arrays.fill(firstPrime, -1);

        for (int i = 2; i <= N; i++) {
            if (firstPrime[i] == -1) {
                for (int j = i; j <= N; j += i) {
                    firstPrime[j] = i;
                }
            }
        }

        int primeAppears[] = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            int x = i;
            while (x != 1) {
                int y = firstPrime[x];
                int r = 0;
                while (x % y == 0) {
                    r++;
                    x /= y;
                }
                primeAppears[y] = Math.max(primeAppears[y], r);
            }
        }

        long r = 1;
        for (int i = 2; i <= N; i++) {
            if (firstPrime[i] == i) {
                for (int j = 0; j < primeAppears[i]; j++) {
                    r = (r * i)  %  MOD;
                }
            }
        }

        return (int)r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
