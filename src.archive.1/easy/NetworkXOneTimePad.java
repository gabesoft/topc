package topc.easy;

import java.util.*;
import java.io.*;

// SRM 516 Division I Level One - 250
// brute force, encryption/compression, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10846&rd=14541
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+516
public class NetworkXOneTimePad {
    HashSet<String> set;

    public int crack(String[] plaintexts, String[] ciphertexts) {

        set = new HashSet<String>();
        for (int i = 0; i < plaintexts.length; i++) {
            set.add(plaintexts[i]);
        }

        int count = 0;
        for (int i = 0; i < plaintexts.length; i++) {
            String key = xor(plaintexts[i], ciphertexts[0]);
            if (isKey(key, ciphertexts)) {
                count++;
            }
        }

        return count;
    }

    private boolean isKey(String key, String[] ciphertexts) {
        for (int i = 0; i < ciphertexts.length; i++) {
            String x = xor(key, ciphertexts[i]);
            if (!set.contains(x)) {
                return false;
            }
        }
        return true;
    }

    private String xor(String a, String b) {
        int n = a.length();
        char x[] = new char[n];

        for (int i = 0; i < n; i++) {
            x[i] = a.charAt(i) == b.charAt(i) ? '0' : '1';
        }

        return new String(x);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
