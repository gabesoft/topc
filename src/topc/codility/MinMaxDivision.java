package topc.codility;

import java.util.*;

public class MinMaxDivision {
    public int solution(int K, int M, int[] A) {
        int lo = 0;
        int hi = M * A.length;
        int result = -1;

        for (int x: A) {
            lo = Math.max(lo, x);
        }

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (check(A, mid) <= K) {
                hi = mid - 1;
                result = mid;
            } else {
                lo = mid + 1;
            }
        }

        return result;
    }

    private int check(int[] A, int max) {
        int k = 1;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum + A[i] <= max) {
                sum += A[i];
            } else {
                k++;
                sum = A[i];
            }
        }

        return k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
