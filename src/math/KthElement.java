package topc.math;

import java.util.*;
import java.io.*;

// SRM 255 Division II Level Three - 1000
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4622&rd=7228
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm255
public class KthElement {
    public int find(int A, int B, int K) {
        int data[] = new int[50];

        for (int i = 1; i < data.length; i++) {
            data[i] = A * Integer.bitCount(data[i - 1]) + B;
        }

        int k = 0;
        int p = 0;
        for (int i = 0; i < data.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] == data[i]) {
                    found = true;
                    k     = i;
                    p     = j - i;
                    i     = data.length;
                    break;
                }
            }
        }

        if (K < k) { 
            return data[K];
        } else {
            return data[(K - k) % p + k];
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
