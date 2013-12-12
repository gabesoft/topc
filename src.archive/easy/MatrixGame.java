package topc.easy;

import java.util.*;
import java.io.*;

// SRM 466 Division II Level Three - 1000
// brute force, sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10861&rd=14150
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+466
public class MatrixGame {
    public String[] getMinimal(String[] matrix) {
        Permutation perm = new Permutation(matrix[0].length());
        String bestStr   = join(matrix);
        String best[]    = matrix;

        while (perm.hasNext()) {
            int[] p       = perm.next();
            String next[] = colPerm(matrix, p);

            Arrays.sort(next);
            String str = join(next);

            if (str.compareTo(bestStr) < 0) {
                bestStr = str;
                best = next;
            }
        }

        return best;
    }

    String[] colPerm(String[] matrix, int[] perm) {
        int n         = matrix.length;
        String next[] = new String[n];

        for (int i = 0; i < n; i++) {
            next[i] = strPerm(matrix[i], perm);
        }

        return next;
    }

    String strPerm(String str, int[] perm) {
        int n       = str.length();
        char next[] = new char[n];

        for (int i = 0; i < n; i++) {
            next[i] = str.charAt(perm[i] - 1);
        }

        return new String(next);
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Permutation {
        boolean next;
        int size;
        int data[];

        public Permutation(int size) {
            this.size = size;
            this.data = new int[size + 1];
            this.next = true;

            for (int i = 0; i < data.length; i++) {
                data[i] = i;
            }
        }

        public boolean hasNext() {
            return next;
        }

        public int[] next() {
            int i = size - 1;
            while (data[i] > data[i + 1]) {
                i--;
            }

            if (i == 0) {
                next = false;
                for (int j = 0; j < size + 1; j++) {
                    data[j] = j;
                }
                return result();
            }

            int j = size;
            while (data[i] > data[j]) {
                j--;
            }

            swap(i, j);
            int r = size;
            int s = i + 1;
            while (r > s) {
                swap(r, s);
                r--;
                s++;
            }

            return result();
        }

        int[] result() {
            int res[] = new int[size];
            for (int k = 0; k < size; k++) {
                res[k] = data[k + 1];
            }
            return res;
        }

        void swap(int i, int j) {
            int temp = data[i];
            data[i]  = data[j];
            data[j]  = temp;
        }
    }
}
