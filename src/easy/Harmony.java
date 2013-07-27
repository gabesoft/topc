package topc.easy;

import java.util.*;
import java.io.*;

// SRM 176 Division II Level Three - 900
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2015&rd=4685
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm176
public class Harmony {
    public int[] mostHarmonious(int[] frequencies) {
        int n = frequencies.length;

        ArrayList<Chord> chords = new ArrayList<Chord>();
        Arrays.sort(frequencies);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    chords.add(new Chord(frequencies[i], frequencies[j], frequencies[k]));
                }
            }
        }

        Collections.sort(chords);
        return chords.get(0).data();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Chord implements Comparable<Chord> {
        int n1;
        int n2;
        int n3;

        public Chord(int n1, int n2, int n3) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }

        public int compareTo(Chord c) {
            int d1[] = this.getDenominators();
            int d2[] = c.getDenominators();

            for (int i = 2; i > -1; i--) {
                if (d1[i] != d2[i]) {
                    return d1[i] - d2[i];
                }
            }

            if (n1 != c.n1) { return n1 - c.n1; }
            if (n2 != c.n2) { return n2 - c.n2; }
            if (n3 != c.n3) { return n3 - c.n3; }

            return 0;
        }

        public int[] data() {
            return new int[] { n1, n2, n3 };
        }

        public String toString() {
            return String.format("(%s,%s,%s)", n1, n2, n3);
        }

        private int[] getDenominators() {
            int d1  = n1 / gcd(n1, n3);
            int d2  = n2 / gcd(n2, n3);
            int d3  = n1 / gcd(n1, n2);
            int d[] = new int[] { d1, d2, d3 };

            Arrays.sort(d);
            return d;
        }

        int gcd(int n, int m) {
            return m > 0 ? gcd(m, n % m) : n;
        }
    }
}
