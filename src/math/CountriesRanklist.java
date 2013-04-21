package topc.math;

import java.util.*;
import java.io.*;

// SRM 270 Division I Level One - 300
// simple math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4658&rd=8067
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm270
public class CountriesRanklist {
    public String[] findPlaces(String[] knownPoints) {
        HashMap<String, Integer> index = new HashMap<String, Integer>();
        Country[] countries = new Country[knownPoints.length];

        int k   = 0;
        int lim = 601;

        for (int i = 0; i < knownPoints.length; i++) {
            String parts[] = knownPoints[i].split("\\s+");
            String name    = parts[0];

            if (!index.containsKey(name)) {
                index.put(name, k);
                k++;
            }

            int j = index.get(name);
            if (countries[j] == null) {
                countries[j] = new Country(parts);
            } else {
                countries[j].add(parts);
            }

            lim = Math.min(lim, countries[j].min());
        }

        for (int i = 0; i < k; i++) {
            countries[i].fill(lim - 1);
        }

        for (int i = 0; i < k; i++) {
            int lo = 0;
            int hi = 0;
            for (int j = 0; j < k; j++) {
                if (i == j) { continue; }
                if (countries[j].sumlo() > countries[i].sumhi()) { hi++; }
                if (countries[j].sumhi() > countries[i].sumlo()) { lo++; }
            }
            countries[i].rankhi = hi + 1;
            countries[i].ranklo = lo + 1;
        }

        Country[] sorted = new Country[k];
        for (int i = 0; i < k; i++) {
            sorted[i] = countries[i];
        }

        Arrays.sort(sorted);

        String[] ranks = new String[k];
        for (int i = 0; i < k; i++) {
            ranks[i] = sorted[i].toString();
        }

        return ranks;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Country implements Comparable<Country> {
        public final String name;
        public final int[] hi;
        public final int[] lo;

        public int rankhi;
        public int ranklo;
        public int k;

        public Country(String[] parts) {
            name   = parts[0];
            k      = 0;
            rankhi = -1;
            ranklo = -1;
            hi     = new int[4];
            lo     = new int[4];
            add(parts);
        }

        public int compareTo(Country o) {
            return name.compareTo(o.name);
        }

        public String toString() {
            return String.format("%s %s %s", name, rankhi, ranklo);
        }

        public void add(String[] parts) {
            hi[k] = Integer.parseInt(parts[2]);
            lo[k] = hi[k];
            k++;
        }

        public int min() {
            int r = hi[0];
            for (int i = 1; i < k; i++) {
                r = Math.min(r, hi[i]);
            }
            return r;
        }

        public void fill(int max) {
            for (int i = k; i < hi.length; i++) {
                hi[i] = max;
                lo[i] = 0;
            }
        }

        public int sumhi() { return sum(hi); }
        public int sumlo() { return sum(lo); }

        private int sum(int[] a) {
            int s = 0;
            for (int i = 0; i < a.length; i++) {
                s += a[i];
            }
            return s;
        }
    }
}
