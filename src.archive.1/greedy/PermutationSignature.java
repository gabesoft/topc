package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 497 Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11115&rd=14426
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+497
public class PermutationSignature {
    public int[] reconstruct(String signature) {
        int n = signature.length() + 1;

        if (n == 1) { return new int[] { 1 }; }

        int[] next = reconstruct(signature.substring(1));
        int[] perm = new int[n];

        perm[0] = signature.charAt(0) == 'D' ? (next[0] + 1) : 1;
        for (int i = 1; i < n; i++) {
            perm[i] = next[i - 1] + (next[i - 1] >= perm[0] ? 1 : 0);
        }

        return perm;
    }
}
