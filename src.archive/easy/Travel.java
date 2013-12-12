package topc.easy;

import java.util.*;
import java.io.*;

// TCI '02 Semifinals 3 Division I Level One - 300
// brute force, geometry, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=996&rd=4372
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tci02&d3=semiprob3
public class Travel {
    double R;
    int n;

    public int shortest(String[] cities, int radius) {
        R = radius;
        n = cities.length;

        double coord[][] = new double[n][];

        for (int i = 0; i < n; i++) {
            String c[] = cities[i].split("\\s+");
            double lat = Double.parseDouble(c[0]);
            double lng = Double.parseDouble(c[1]);
            coord[i] = toCoord(lat, lng);
        }

        double best = find(coord, -1, -1, 0);

        return (int)Math.round(best);
    }

    double find(double[][] coord, int first, int last, long selected) {
        if (selected == (1 << n) - 1) { return dist(coord[last], coord[first]); }

        double best = Double.MAX_VALUE / 4;

        for (int i = 0; i < n; i++) {
            if (((selected >> i) & 1) == 0) {
                double next = find(coord, first == -1 ? i : first, i, selected | (1 << i));
                if (last > -1) {
                    next += dist(coord[last], coord[i]);
                }
                best = Math.min(best, next);
            }
        }

        return best;
    }

    double dist(double[] a, double[] b) {
        double dot = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
        double na  = norm(a);
        double nb  = norm(b);
        return R * Math.acos(dot / (na * nb));
    }

    double norm(double[] v) {
        double sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += (v[i] * v[i]);
        }
        return Math.sqrt(sum);
    }

    double radians(double degrees) {
        return degrees / 180 * Math.PI;
    }

    double degrees(double radians) {
        return radians * 180 / Math.PI;
    }

    double[] toCoord(double lat, double lng) {
        lat = radians(lat);
        lng = radians(lng);
        double x = R * Math.cos(lat) * Math.cos(lng);
        double y = R * Math.cos(lat) * Math.sin(lng);
        double z = R * Math.sin(lat);
        return new double[] { x, y, z };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
