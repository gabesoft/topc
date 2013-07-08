package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 215 Division I Level Two - 500
// sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3037&rd=5861
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm215
public class Thesaurus {
    public String[] edit(String[] entry) {
        Entry[] entries = new Entry[entry.length];
        for (int i = 0; i < entry.length; i++) {
            entries[i] = new Entry(entry[i]);
        }

        boolean change = true;
        int k = entries.length;
        while (change) {
            change = false;

            for (int i = 0; i < entries.length; i++) {
                if (entries[i] == null) { continue; }

                for (int j = i + 1; j < entries.length; j++) {
                    if (entries[j] != null) {
                        Entry e = entries[i].combine(entries[j]);
                        if (e != null) {
                            entries[i] = e;
                            entries[j] = null;
                            change     = true;
                            k--;
                        }
                    }
                }
            }
        }

        String r[] = new String[k];
        int j      = 0;
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                r[j++] = entries[i].toString();
            }
        }

        Arrays.sort(r);
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Entry implements Comparable<Entry> {
        String[] words;
        HashSet<String> set;

        public Entry(String text) {
            this.words = text.split("\\s+");
            this.set   = new HashSet<String>(Arrays.asList(this.words));
            Arrays.sort(words);
        }

        public Entry combine(Entry e) {
            String[] words = differentWords(e);
            return (e.words.length - words.length > 1)
                ? new Entry(toString() + " " + join(words))
                : null;
        }

        public int compareTo(Entry o) {
            return this.toString().compareTo(o.toString());
        }

        public String toString() {
            return join(words);
        }

        private String[] differentWords(Entry e) {
            ArrayList<String> ws = new ArrayList<String>();

            for (int i = 0; i < e.words.length; i++) {
                if (!set.contains(e.words[i])) {
                    ws.add(e.words[i]);
                }
            }

            String[] diff = new String[ws.size()];
            for (int i = 0; i < diff.length; i++) {
                diff[i] = ws.get(i);
            }

            return diff;
        }

        private String join(String[] ws) {
            String r = "";
            for (int i = 0; i < ws.length; i++) {
                r += ws[i];
                if (i < ws.length - 1) {
                    r += " ";
                }
            }
            return r;
        }
    }
}
