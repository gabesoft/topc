package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 154 Division I Level Two - 500
// sorting, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1760&rd=4575
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm154
public class ContestScore {
    public String[] sortResults(String[] data) {
        if (data.length == 0) { return new String[0]; }

        int n = data.length;
        int m = data[0].split("\\s+").length - 1;

        int ranks[][]  = new int[m][n];
        Score scores[] = new Score[n];

        for (int i = 0; i < n; i++) {
            String[] parts = data[i].split("\\s+");
            int total      = 0;
            int score[]    = new int[m];

            for (int j = 1; j < parts.length; j++) {
                int k            = (int)(Double.parseDouble(parts[j]) * 10);
                ranks[j - 1][i]  = k;
                total           += k;
                score[j - 1]     = k;
            }

            scores[i] = new Score(parts[0], total, score);
        }

        for (int i = 0; i < n; i++) {
            Score s = scores[i];
            for (int j = 0; j < m; j++) {
                s.rank += getRank(ranks[j], s.score[j]);
            }
        }

        Arrays.sort(scores);

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = scores[i].toString();
        }

        return res;
    }

    private int getRank(int[] ranks, int rank) {
        int r = 0;
        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i] > rank) {
                r++;
            }
        }
        return r + 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Score implements Comparable<Score> {
        public final String name;
        public final int total;
        public final int[] score;
        public int rank;

        public Score(String name, int total, int[] score) {
            this.name  = name;
            this.total = total;
            this.score = score;
            this.rank  = 0;
        }

        public int compareTo(Score s) {
            if (rank != s.rank) {
                return rank - s.rank;
            }
            if (total != s.total) {
                return s.total - total;
            }
            return name.compareTo(s.name);
        }

        public String toString() {
            return String.format("%s %s %.1f", name, rank, total / 10.0);
        }
    }
}
