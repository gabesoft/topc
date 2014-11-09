package topc.search;

import java.util.*;
import java.io.*;

// SRM 214 Division II Level Three - 1000
// search, string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3023&rd=5860
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm214
public class BloggoSequenceSearch {
    public String[] findPassages(String[] documents, String query) {
        ArrayList<Match> matches = new ArrayList<Match>();
        String[] qw = query.split("\\.\\.\\.");

        for (int i = 0; i < documents.length; i++) {
            matches.addAll(findMatches(i, documents[i], qw));
        }

        Collections.sort(matches);

        int n        = Math.min(matches.size(), 5);
        String[] top = new String[n];

        for (int i = 0; i < n; i++) {
            top[i] = matches.get(i).toString();
        }

        return top;
    }

    private ArrayList<Match> findMatches(int doc, String text, String[] query) {
        ArrayList<Match> matches = new ArrayList<Match>();

        String[] words = text.split("\\s+");
        int n = text.length();
        int s = 0;

        for (int i = 0; i < n; i++) {
            int k = startsWith(i, text, query[0]);
            if (k > 0) {
                addMatches(doc, i, k, text, query, 1, matches);
            }
        }

        return matches;
    }

    private void addMatches(int doc, int start, int end, String text, String[] query, int q, ArrayList<Match> matches) {
        if (end >= text.length()) { return; }

        if (q >= query.length) {
            Match m = new Match(doc, start, text.substring(start, end));
            for (Match x : matches) {
                if (x.id.equals(m.id)) {
                    return;
                }
            }
            matches.add(m);
            return;
        }

        int k = startsWith(end, text, query[q]);
        if (k > 0) {
            addMatches(doc, start, k, text, query, q + 1, matches);
        }

        addMatches(doc, start, end + 1, text, query, q, matches);
    }

    private int startsWith(int k, String text, String query) {
        int n = query.length();
        int m = text.length();

        if (k + n > m) { return -1; }

        for (int i = 0; i < n; i++) {
            Character c1 = Character.toLowerCase(text.charAt(i + k));
            Character c2 = Character.toLowerCase(query.charAt(i));
            if (c1 != c2) { return -1; }
        }

        if (k + n < m) {
            return Character.isLetter(text.charAt(k + n)) ? -1 : k + n;
        }

        return k + n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Match implements Comparable<Match> {
        public final int doc;
        public final int len;
        public final int start;
        public final String text;
        public final String id;

        public Match(int doc, int start, String text) {
            this.doc   = doc;
            this.len   = text.length();
            this.start = start;
            this.text  = text;
            this.id    = doc + "|" + start + "|" + len;
        }

        public int compareTo(Match m) {
            if (len != m.len) { return len - m.len; }
            if (doc != m.doc) { return doc - m.doc; }
            return start - m.start;
        }

        public String toString() {
            return String.format("%s %s [%s]", doc, start, text);
        }
    }
}
