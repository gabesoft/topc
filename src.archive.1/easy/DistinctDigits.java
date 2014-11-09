package topc.easy;

import java.util.*;
import java.io.*;

// SRM 426 Division II Level Three - 1000
// brute force, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10186&rd=13517
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm426
public class DistinctDigits {
    int cnt = 0;

    public int count(int low, int high) {
        cnt = 0;

        search("", 0, low, high);

        return cnt;
    }

    void search(String seq, int digit, int lo, int hi) {
        if (digit > 9) { return; }
        if (seq.length() > Integer.toString(hi).length()) { return; }

        if (seq.length() > 0 && digit == seq.charAt(seq.length() - 1) - '0') {
            boolean ok = inRange(seq, lo, hi);
            if (ok) { cnt++; }
        }

        search(seq + digit, digit, lo, hi);
        search(seq, digit + 1, lo, hi);
    }

    boolean inRange(String seq, int lo, int hi) {
        if (Integer.parseInt(seq) == 0) { return lo <= 0 && 0 <= hi; }

        int len    = seq.length();
        String slo = Integer.toString(lo);
        String shi = Integer.toString(hi);

        if (len < slo.length() || len > shi.length()) { return false; }

        if (len < shi.length()) { return checkLo(seq, lo); }
        if (len > slo.length()) { return checkHi(seq, hi); }

        if (slo.charAt(0) == shi.charAt(0)) {
            char c    = slo.charAt(0);
            int index = seq.indexOf(c);

            if (index == -1) {
                return false;
            } else {
                String nseq = seq.substring(0, index) + seq.substring(index + 1);
                int nlo = trimFirst(slo);
                int nhi = trimFirst(shi);
                return inRange(nseq, nlo, nhi);
            }
        } else {
            char dlo = slo.charAt(0);
            char dhi = shi.charAt(0);

            boolean below = len <= slo.length();
            boolean above = len >= shi.length();

            int ilo = -1;
            int ihi = -1;

            for (int i = 0; i < seq.length(); i++) {
                char d = seq.charAt(i);

                if (dlo < d && d < dhi) { return true; }

                below &= d < dlo;
                above &= d > dhi;

                if (dlo == d) {
                    ilo = i;
                }
                if (dhi == d) {
                    ihi = i;
                }
            }

            if (below || above) { return false; }

            boolean loOk = false;
            boolean hiOk = false;

            if (ilo != -1) {
                String next = seq.substring(0, ilo) + seq.substring(ilo + 1); 

                int nlo = trimFirst(slo);
                loOk    = checkLo(next, nlo);
            }

            if (ihi != -1) {
                String next = seq.substring(0, ihi) + seq.substring(ihi + 1); 

                while (next.length() > 1 && next.charAt(0) == '0') {
                    next = next.substring(1);
                }

                int nhi = trimFirst(shi);
                hiOk    = checkHi(next, nhi);
            }

            return loOk || hiOk;
        }
    }

    int trimFirst(String n) {
        return Integer.parseInt(n.length() > 1 ? n.substring(1) : "0");
    }

    boolean checkLo(String seq, int x) {
        int n = 0;
        int k = 10;

        for (int i = seq.length() - 1; i > -1; i--) {
            n *= k;
            n += seq.charAt(i) - '0';
        }

        return n >= x;
    }

    boolean checkHi(String seq, int x) {
        int m = -1;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) != '0') {
                m = i;
                break;
            }
        }

        if (m == -1) { return 0 <= x; }

        int n = seq.charAt(m) - '0';
        int k = 10;

        for (int i = 0; i < m; i++) {
            n *= k;
        }

        for (int i = m + 1; i < seq.length(); i++) {
            n *= k;
            n += seq.charAt(i) - '0';
        }

        return n <= x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
