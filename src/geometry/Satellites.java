package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 180 Division I Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1812&rd=4720
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm180
public class Satellites {
    double earthr  = 6400.0;
    double rocketh = 400.0;

    public int[] detectable(String[] rockets, String[] satellites) {
        int n = rockets.length;
        int m = satellites.length;

        double rlng[] = new double[n];
        double rlat[] = new double[n];

        double slng[] = new double[m];
        double slat[] = new double[m];
        double salt[] = new double[m];

        for (int i = 0; i < n; i++) {
            String[] coords = rockets[i].split("\\s+");
            rlat[i] = Double.parseDouble(coords[0]);
            rlng[i] = Double.parseDouble(coords[1]);
        }

        for (int i = 0; i < m; i++) {
            String[] coords = satellites[i].split("\\s+");
            slat[i] = Double.parseDouble(coords[0]);
            slng[i] = Double.parseDouble(coords[1]);
            salt[i] = Double.parseDouble(coords[2]);
        }

        double ralt  = earthr + rocketh;
        int c        = 0;
        boolean ok[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                if (count > 2) {
                    ok[i] = true;
                    count = 0;
                    c++;
                    break;
                }

                double dist = centerDist(rlat[i], rlng[i], ralt, slat[j], slng[j], earthr + salt[j]);

                if (dist > earthr) { count++; }
            }

            if (count > 2) {
                ok[i] = true;
                c++;
            }
        }

        int res[] = new int[c];
        for (int i = n - 1; i > -1; i--) {
            if (ok[i]) {
                res[--c] = i;
            }
        }

        return res;
    }

    double centerDist(double rlat, double rlng, double ralt, double slat, double slng, double salt) {
        double R[] = latLongToCoord(rlat, rlng, ralt);
        double S[] = latLongToCoord(slat, slng, salt);

        double normR = norm(R);
        double normS = norm(S);
        double delta = norm(diff(R, S));


        if (sq(normR) + sq(delta) <= sq(normS)) { return normR; }
        if (sq(normS) + sq(delta) <= sq(normR)) { return normS; }

        return norm(cross(R, S)) / delta;
    }

    double[] diff(double[] a, double[] b) {
        double[] d = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            d[i] = a[i] - b[i];
        }
        return d;
    }

    double norm(double[] v) {
        return Math.sqrt(sq(v[0]) + sq(v[1]) + sq(v[2]));
    }

    double[] cross(double[] a, double[] b) {
        double x = a[1] * b[2] - b[1] * a[2];
        double y = b[0] * a[2] - a[0] * b[2];
        double z = a[0] * b[1] - b[0] * a[1];
        return new double[] { x, y, z };
    }

    double[] latLongToCoord(double lat, double lng, double alt) {
        double d = Math.PI / 180;
        double x = Math.sin(lng * d) * Math.cos(lat * d) * alt;
        double y = Math.cos(lng * d) * Math.cos(lat * d) * alt;
        double z = Math.sin(lat * d) * alt;
        return new double[] { x, y, z };
    }

    double sq(double n) {
        return n * n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
