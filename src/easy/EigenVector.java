package topc.easy;

import java.util.*;
import java.io.*;

// SRM 192 Division I Level Two - 500
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2423&rd=4780
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm192
public class EigenVector {
    int n;
    int X[];
    int M[][];

    public int[] findEigenVector(String[] A) {
        n = A.length;

        M = new int[n][n];
        for (int i = 0; i < n; i++) {
            String nums[] = A[i].split("\\s+");
            for (int j = 0; j < n; j++) {
                M[i][j] = Integer.parseInt(nums[j]);
            }
        }

        for (int norm = 0; norm < 10; norm++) {
            for (Vector v : vectors(norm, n)) {
                if (isEigenVector(v.data)) {
                    return v.data;
                }
            }
        }

        return null;
    }

    private Collection<Vector> vectors(int norm, int n) {
        ArrayList<Vector> vec = new ArrayList<Vector>();

        int[] data = new int[n];
        for (int i = n > 0 ? -norm : 0; i < (n > 0 ? norm + 1 : 1); i++) {
            for (int j = n > 1 ? -norm : 0; j < (n > 1 ? norm + 1 : 1); j++) {
                for (int k = n > 2 ? -norm : 0; k < (n > 2 ? norm + 1 : 1); k++) {
                    for (int l = n > 3 ? -norm : 0; l < (n > 3 ? norm + 1 : 1); l++) {
                        for (int p = n > 4 ? -norm : 0; p < (n > 4 ? norm + 1 : 1); p++) {
                            if (n > 0) data[0] = i;
                            if (n > 1) data[1] = j;
                            if (n > 2) data[2] = k;
                            if (n > 3) data[3] = l;
                            if (n > 4) data[4] = p;
                            Vector v = new Vector(norm, data.clone());
                            if (v.valid()) {
                                vec.add(v);
                            }
                        }
                    }
                }
            }
        }

        Collections.sort(vec);
        return vec;
    }

    private boolean isEigenVector(int[] X) {
        int[] Y = mult(M, X);

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (Y[i] != 0 && X[i] != 0) {
                k = Y[i] / X[i];
                break;
            }
        }

        if (k == 0) { return false; }

        for (int i = 0; i < n; i++) {
            if (X[i] * k != Y[i]) {
                return false;
            }
        }

        return true;
    }

    private int[] mult(int[][] A, int[] X) {
        int[] Y = new int[n];

        for (int i = 0; i < n; i++) {
            Y[i] = 0;
            for (int j = 0; j < n; j++) {
                Y[i] += A[i][j] * X[j];
            }
        }

        return Y;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Vector implements Comparable<Vector> {
        public final int[] data;
        public final int norm;

        public Vector(int norm, int[] data) {
            this.norm = norm;
            this.data = data;
        }

        public boolean valid() {
            int s = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i] < 0 && s == 0) {
                    return false;
                }
                s += Math.abs(data[i]);
                if (s > norm) {
                    return false;
                }
            }
            return s == norm;
        }

        public int compareTo(Vector o) {
            int[] d1 = data;
            int[] d2 = o.data;

            assert d1.length == d2.length : "incompatible vectors";

            for (int i = 0; i < d1.length; i++) {
                if (d1[i] != d2[i]) {
                    return d1[i] - d2[i];
                }
            }

            return 0;
        }
    }
}
