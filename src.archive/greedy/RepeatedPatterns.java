package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 333 Division I Level Two - 500
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7294&rd=10657
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm333
public class RepeatedPatterns {
    final int P1COUNT = 1000000;

    public long findZeroSegment(String P1, String P2, String zeroCount) {
        long zcount = Long.parseLong(zeroCount);

        // both strings contain only zeros
        if (P1.indexOf("1") == -1 && P2.indexOf("1") == -1) {
            return 0L;
        }

        // both strings contain at least a one
        if (P1.indexOf("1") != -1 && P2.indexOf("1") != -1) {
            int x = -1;

            x = checkString(P1 + P1, zcount); 
            if (x > -1) { return x; }

            x = checkString(P1 + P2, zcount);
            if (x > -1) { return x + (P1COUNT - 1) * P1.length(); }

            x = checkString(P2 + P1, zcount);
            if (x > -1) { return x + P1COUNT * P1.length(); }

            x = checkString(P2 + P2, zcount);
            if (x > -1) { return x + (2 * P1COUNT) * P1.length() + P2.length(); }

            return -1;
        }

        int p1head = 0;
        int p1tail = 0;
        int p2head = 0;
        int p2tail = 0;

        String zeroes = "";
        for (int i = 1; i < 51; i++) {
            zeroes += "0";

            if (P1.startsWith(zeroes)) { p1head = i; }
            if (P2.startsWith(zeroes)) { p2head = i; }

            if (P1.endsWith(zeroes)) { p1tail = i; }
            if (P2.endsWith(zeroes)) { p2tail = i; }
        }

        // P1 contains only zeros and P2 contains at least a one
        if (P1.indexOf("1") == -1 && P2.indexOf("1") != -1) {
            int beginning = P1COUNT * P1.length() + p2head;
            int between   = p2tail + P1COUNT * P1.length() + p2head;

            if (beginning >= zcount) { return 0; }

            if (between >= zcount) { return P1COUNT * P1.length() + P2.length() - p2tail; }

            return -1;
        }

        // P1 contains at least a one and P2 contains only zeroes
        int x = checkString(P1 + P1, zcount);
        if (x >= 0) { return x; }

        zcount -= p1tail;
        zcount -= p1head;

        long lo = 0;
        long hi = 1;

        long TEN_TO_SIXTEEN = 1;
        for (int i = 0; i < 16; i++) {
            TEN_TO_SIXTEEN *= 10;
        }

        while (getLength(P1.length(), P2.length(), hi) < TEN_TO_SIXTEEN) {
            hi *= 2;
        }

        while (hi - lo > 1) {
            long md = (lo + hi) / 2;
            if (getLength(P1.length(), P2.length(), md) < TEN_TO_SIXTEEN) {
                lo = md;
            } else {
                hi = md;
            }
        }

        long mostP2s = hi;
        long needP2s = (zcount + P2.length() - 1) / P2.length();
        if (mostP2s < needP2s) { return -1; }

        long index = needP2s * P1COUNT * P1.length() + (needP2s * (needP2s - 1)) * P2.length() / 2 - p1tail;
        if (index < 0 || index + zcount > TEN_TO_SIXTEEN) {
            return -1;
        } else {
            return index;
        }
    }

    long getLength(long p1, long p2, long k) {
        return P1COUNT * p1 + k * p2;
    }

    int checkString(String s, long zcount) {
        if (zcount > s.length()) { return -1; }

        String zs = "";
        for (int i = 0; i < zcount; i++) {
            zs += "0";
        }

        return s.indexOf(zs);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
