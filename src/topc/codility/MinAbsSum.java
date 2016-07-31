package topc.codility;

import java.util.*;

public class MinAbsSum {
    // O(N  * M^2)
    // https://codility.com/media/train/solution-min-abs-sum.pdf
    public int solution(int[] A) {
        int n = A.length;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            A[i] = Math.abs(A[i]);
            sum += A[i];
            max = Math.max(max, A[i]);
        }

        int cnt[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            cnt[A[i]]++;
        }

        int S[] = new int[sum + 1];

        Arrays.fill(S, -1);

        S[0] = 0;

        for (int i = 1; i < max + 1; i++) {
            if (cnt[i] > 0) {
                for (int j = 0; j < sum; j++) {
                    if (S[j] >= 0) {
                        S[j] = cnt[i];
                    } else if (j >= i && S[j - i] > 0) {
                        S[j] = S[j - i] - 1;
                    }
                }
            }
        }

        int result = sum;
        for (int i = 0; i <= sum / 2; i++) {
            if (S[i] >= 0) {
                result = Math.min(result, sum - 2 * i);
            }
        }

        return result;
    }

    // O(N * M^2)
    public int solution2(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            A[i] = Math.abs(A[i]);
            max = Math.max(max, A[i]);
        }

        boolean V[] = new boolean[max * max + 1];
        V[A[0]] = true;

        for (int i = 1; i < n; i++) {
            boolean C[] = new boolean[V.length];

            for (int j = 0; j < V.length; j++) {
                if (V[j]) {
                    int y = Math.abs(j + A[i]);
                    int z = Math.abs(j - A[i]);

                    if (y < C.length) {
                        C[y] = true;
                    }

                    if (z < C.length) {
                        C[z] = true;
                    }
                }
            }

            V = C;
        }

        for (int i = 0; i < V.length; i++) {
            if (V[i]) {
                return i;
            }
        }

        return V.length;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}