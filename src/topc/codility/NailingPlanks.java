package topc.codility;

import java.util.*;

public class NailingPlanks {
    public int solution(int A[], int B[], int C[]) {
        int N = A.length;
        int M = C.length;
        int S[] = new int[M * 2 + 1];
        int V[] = new int[M * 2 + 1];

        Arrays.fill(V, -1);
        Arrays.fill(S, -1);

        for (int i = 0; i < N; i++) {
            S[A[i]] = (S[A[i]] == -1) ? B[i] : Math.min(S[A[i]], B[i]);
        }

        int hi = M;
        int lo = 0;

        int res = -1;

        while (lo <= hi) {
            int md = (lo + hi) / 2;
            // if (verify(S, V, C, md)) {
            if (verifyPrefixSum(A, B, V, C, md)) {
                hi = md - 1;
                res = md;
            } else {
                lo = md + 1;
            }
        }

        return res;
    }

    private boolean verifyPrefixSum(int[] A, int[] B, int[] V, int[] C, int k) {
        Arrays.fill(V, 0);
        for (int i = 0; i < k; i++) {
            V[C[i]]++;
        }

        for (int i = 1; i < V.length; i++) {
            V[i] += V[i - 1];
        }

        for (int i = 0; i < A.length; i++) {
            if (V[A[i] - 1] == V[B[i]]) {
                return false;
            }
        }

        return true;
    }

    private boolean verify(int[] S, int[] V, int[] C, int k) {
        for (int i = 0; i < k; i++) {
            V[C[i]] = k;
        }

        int end = Integer.MAX_VALUE;
        for (int i = 0; i < S.length; i++) {
            if (S[i] > 0) {
                end = Math.min(end, S[i]);
            }
            if (end < i) {
                return false;
            }
            if (V[i] == k) {
                end = Integer.MAX_VALUE;
            }
        }

        return end == Integer.MAX_VALUE;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
