package topc.codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class FibFrog {
    final Integer[] FIB  =  new Integer[] {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269};
    final int MAX = 2 << 29;
    int[] cache;
    boolean[] fib;

    public int solution(int[] A) {
        int n = A.length;
        cache = new int[n + 1];
        fib = new boolean[FIB[FIB.length  -  1] + 1];

        Arrays.fill(cache, -1);

        for (int i = 0; i < FIB.length; i++) {
            fib[FIB[i]] = true;
        }

        // int min = run(A, -1);
        int min = iter(A);

        return min >= MAX ? -1 : min;
    }

    private int iter(int[] A) {
        int n = A.length;
        int[] best = new int[n + 1];

        Arrays.fill(best, MAX);

        for (int i = -1; i <= n; i++) {
            for (int j = 1; FIB[j] + i <= n; j++) {
                int x = FIB[j] + i;
                if (x >= 0 && (x == n || A[x] == 1)) {
                    int b = (i == -1) ? 0 : best[i];
                    best[x] = Math.min(best[x], b + 1);
                }
            }
        }

        return best[n];
    }

    private int run(int[] A, int s) {
        int n = A.length;

        if (fib[n - s]) {
            return 1;
        }

        int key = s + 1;

        if (cache[key] > -1) { return cache[key]; }

        int best = MAX;
        for (int i = s + 1; i < n; i++) {
            if (A[i] == 1 && fib[i - s]) {
                best = Math.min(best, 1 + run(A, i));
            }
        }

        cache[key] = best;

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}