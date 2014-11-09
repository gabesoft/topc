package topc.easy;

import java.util.*;
import java.io.*;

// SRM 620 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13160&rd=15853
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+620
public class CandidatesSelectionEasy {
    public int[] sort(String[] score, int x) {
        int n = score.length;
        Candidate[] cs = new Candidate[n];

        for (int i = 0; i < n; i++) {
            cs[i] = new Candidate(i, score[i]);
        }

        Arrays.sort(cs, new CandidateSorter(x));

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = cs[i].index;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class CandidateSorter implements Comparator<Candidate> {
        private int x;

        public CandidateSorter(int x) {
            this.x = x;
        }

        @Override
        public int compare(Candidate a, Candidate b) {
            return a.score.charAt(x) - b.score.charAt(x);
        }
    }

    public class Candidate {
        public int index;
        public String score;

        public Candidate(int i, String s) {
            this.index = i;
            this.score = s;
        }
    }
}
