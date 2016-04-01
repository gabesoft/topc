package topc.math;

// SRM 661 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13766&rd=16464
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+661
public class MissingLCM {
    public int getMin(int N) {
        // if (N == 1) { return 2; }

        int[] primes = getPrimes(N);
        int M = 2;

        for (int p : primes) {
            if (p == 0) { break; }

            int max = 0;
            int i = p;
            while (i <= N) {
                max = Math.max(max, getExponent(i, p));
                i += p;
            }
            while (getExponent(i, p) < max) {
                i += p;
            }

            M = Math.max(M, i);
        }

        return M;
    }

    private int getExponent(int x, int p) {
        int exp = 0;
        while (x % p == 0) {
            exp++;
            x /= p;
        }
        return exp;
    }

    private int[] getPrimes(int n) {
        int[] res = new int[80000];
        int j = 0;
        boolean[] composite = new boolean[n + 1];

        for (int p = 2; p <= n; p++) {
            if (!composite[p]) {
                for (int i = p + p; i <= n; i += p) {
                    composite[i] = true;
                }
                res[j++] = p;
            }
        }

        return res;
    }
}
