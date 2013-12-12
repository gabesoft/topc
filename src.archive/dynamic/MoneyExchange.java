package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 240 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3529&rd=6539
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm240
public class MoneyExchange {
    int stype;
    int etype;
    boolean processing[];
    double R[][];

    public double bestRate(String[] rates, String type1, String type2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int k = 0;
        for (int i = 0; i < rates.length; i++) {
            String parts[] = rates[i].split("\\s+");

            String c1 = parts[0];
            String c2 = parts[2];

            if (!map.containsKey(c1)) { map.put(c1, k++); }
            if (!map.containsKey(c2)) { map.put(c2, k++); }
        }

        R = new double[k][k];
        for (int i = 0; i < rates.length; i++) {
            String parts[] = rates[i].split("\\s+");
            int c1 = map.get(parts[0]);
            int c2 = map.get(parts[2]);
            double v1 = Double.parseDouble(parts[1]);
            double v2 = Double.parseDouble(parts[3]);
            R[c1][c2] = Math.max(R[c1][c2], v2 / v1);
        }

        if (type1.equals(type2)) { return 1.0; }
        if (!map.containsKey(type1) || !map.containsKey(type2)) { return -1; }

        stype = map.get(type1);
        etype = map.get(type2);

        processing = new boolean[k];
        return find(stype, 1.0);
    }

    private double find(int curr, double amt) {
        if (curr == etype) { return amt; }
        if (processing[curr]) { return 0.0; }

        processing[curr] = true;
        double best      = -1.0;

        for (int i = 0; i < R[curr].length; i++) {
            if (R[curr][i] > 0) {
                best = Math.max(best, find(i, amt * R[curr][i]));
            }
        }

        processing[curr] = false;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
