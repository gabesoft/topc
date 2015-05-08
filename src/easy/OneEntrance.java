package topc.easy;

import java.util.*;
import java.io.*;

// SRM 654 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13698&rd=16318
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+654
public class OneEntrance {
    public int count(int[] a, int[] b, int s) {
        return count(makeTree(a, b, s, new boolean[10]), new boolean[10]);
    }

    private int count(Node n, boolean[] used) {
        ArrayList<Node> l = new ArrayList<Node>();

        findLeaves(n, l, used);
        if (l.size() == 1) { return 1; }

        int c = 0;
        for (Node x : l) {
            if (!used[x.id] && x.id != n.id) {
                used[x.id] = true;
                c += count(n, used);
                used[x.id] = false;
            }
        }

        return c;
    }

    private void findLeaves(Node n, ArrayList<Node> leaves, boolean[] used) {
        if (used[n.id]) { return; }

        boolean isLeaf = true;
        for (Node c : n.ch) {
            if (!used[c.id]) {
                isLeaf = false;
                findLeaves(c, leaves, used);
            }
        }

        if (isLeaf) {
            leaves.add(n);
        }
    }

    private Node makeTree(int[] a, int[] b, int s, boolean[] seen) {
        seen[s] = true;

        Node n = new Node(s);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s && !seen[b[i]]) {
                n.add(makeTree(a, b, b[i], seen));
            }
            if (b[i] == s && !seen[a[i]]) {
                n.add(makeTree(a, b, a[i], seen));
            }
        }
        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        public int id;
        public ArrayList<Node> ch;

        public Node (int id) {
            this.id = id;
            this.ch = new ArrayList<Node>();
        }

        public void add(Node n) {
            this.ch.add(n);
        }
    }
}
