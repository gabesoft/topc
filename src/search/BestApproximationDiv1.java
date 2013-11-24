package topc.search;

import java.util.*;
import java.io.*;

// SRM 483 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11023&rd=14236
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+483
public class BestApproximationDiv1 {
    public String findFraction(int maxDen, String number) {
        int qual = 0;
        int nom = 0;
        int den = 0;

        for (int n = 0; n <= maxDen; n++) {
            for (int d = n + 1; d <= maxDen; d++) {
                int q = quality(n, d, number);
                if (q > qual) {
                    qual = q;
                    nom  = n;
                    den  = d;
                }
            }
        }

        return String.format("%s/%s has %s exact digits", nom, den, qual - 1) ;
    }

    private int quality(int nom, int den, String number) {
        double d = nom / (double) den;
        String s = "" + d;

        while (s.length() < 8) {
            s += '0';
        }

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != s.charAt(i)) {
                return i;
            }
        }

        return 8;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
