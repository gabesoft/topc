package topc.math;

import java.util.*;
import java.io.*;

// SRM 630 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13287&rd=16061
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+630
public class SuffixArrayDiv2 {
    public String smallerOne(String s) {
        Node[] sfx = suffixArray(s);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'a') {
                chars[i]--;
                Node[] sf = suffixArray(new String(chars));
                if (equal(sfx, sf)) {
                    return "Exists";
                }
                chars[i]++;
            }
        }

        return "Does not exist";
    }

    private boolean equal(Node[] a, Node[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].p != b[i].p) {
                return false;
            }
        }
        return true;
    }

    private Node[] suffixArray(String s) {
        int n = s.length();
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i, s.substring(i));
        }

        Arrays.sort(nodes);

        return nodes;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node implements Comparable<Node>  {
        public String s;
        public int p;

        public Node (int p, String s) {
            this.s = s;
            this.p = p;
        }

        public int compareTo(Node o) {
            return s.compareTo(o.s);
        }

        public String toString() {
            return p + ":" + s;
        }
    }
}
