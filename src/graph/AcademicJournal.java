package topc.graph;

import java.util.*;
import java.io.*;

// SRM 235 Division II Level Three - 1000
// graph theory, sorting, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4020&rd=6534
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm235
public class AcademicJournal {
    public String[] rankByImpact(String[] papers) {
        HashMap<String, Journal> map = new HashMap<String, Journal>();

        for (int i = 0; i < papers.length; i++) {
            String parts[] = papers[i].split("\\.\\s*");
            if (!map.containsKey(parts[0])) {
                map.put(parts[0], new Journal(parts[0]));
            }

            Journal jo = map.get(parts[0]);
            jo.addPaper();
        }

        for (int i = 0; i < papers.length; i++) {
            String parts1[] = papers[i].split("\\.\\s*");
            String parts2[] = parts1.length > 1 ? parts1[1].split("\\s+") : null;

            if (parts2 != null) {
                for (int j = 0; j < parts2.length; j++) {
                    int c = Integer.parseInt(parts2[j]);

                    String paper = papers[c];
                    String name  = paper.split("\\.\\s*")[0];
                    Journal jo   = map.get(name);
                    jo.addCitation(papers[i], c, i);
                }
            }
        }

        Journal journals[] = new Journal[map.size()];
        int k = 0;

        for (Journal j : map.values()) {
            journals[k++] = j;
        }

        Arrays.sort(journals);

        String[] res = new String[k];
        for (int i = 0; i < k; i++) {
            res[i] = journals[i].name;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Journal implements Comparable<Journal> {
        int papers;
        HashSet<String> citations;
        String name;

        public Journal(String name) {
            this.name      = name;
            this.citations = new HashSet<String>();
            this.papers    = 0;
        }

        public void addPaper() {
            this.papers++;
        }

        public void addCitation(String paper, int referenced, int c) {
            String paperName = paper.split("\\.")[0];
            if (!name.equals(paperName)) {
                citations.add(referenced + ":" + c);
            }
        }

        public int compareTo(Journal o) {
            if (citations.size() * o.papers != o.citations.size() * papers) {
                return o.citations.size() * papers - citations.size() * o.papers;
            }
            if (papers != o.papers) {
                return o.papers - papers;
            }
            return name.compareTo(o.name);
        }
    }
}
