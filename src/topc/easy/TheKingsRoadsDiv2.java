package topc.easy;

import java.util.*;

// SRM 650 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13667&rd=16314
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+650
public class TheKingsRoadsDiv2 {
    public String getAnswer(int h, int[] a, int[] b) {
        int g[][] = new int[1 << h][];
        int len[] = new int[1 << h];
        int idx[] = new int[1 << h];

        boolean hasDup = false;
        HashMap<String, Integer[]> seen = new HashMap<String, Integer[]>();

        for (int i = 0; i < a.length; i++) {
            Integer[] ns = new Integer[] { a[i], b[i] };
            Arrays.sort(ns);
            String key = ns[0] + ":" + ns[1];

            if (seen.containsKey(key)) {
                hasDup = true;
            } else {
                len[a[i]]++;
                len[b[i]]++;
                seen.put(key, ns);
            }
        }

        for (int i = 0; i < len.length; i++) {
            g[i] = new int[len[i]];
        }

        for (Integer[] ns : seen.values()) {
            int x = ns[0];
            int y = ns[1];
            g[x][idx[x]++] = y;
            g[y][idx[y]++] = x;
        }

        if (hasDup) {
            return binaryTree(g, -1, -1) ? "Correct" : "Incorrect";
        }

        for (Integer[] ns : seen.values()) {
            if (binaryTree(g, ns[0], ns[1])) {
                return "Correct";
            }
        }

        return "Incorrect";
    }

    private boolean binaryTree(int[][] g, int x, int y) {
        for (int i = 1; i < g.length; i++) {
            if (trav(i, g, x, y)) {
                return true;
            }
        }
        return false;
    }

    private boolean trav(int root, int[][] g, int x, int y) {
        int len = 0;
        for (int i = 0; i < g[root].length; i++) {
            if (root == x && g[root][i] == y) { continue; }
            if (root == y && g[root][i] == x) { continue; }
            len++;
        }
        if (len != 2) {
            return false;
        }

        int n          = g.length;
        boolean seen[] = new boolean[n];
        int node[]     = new int[n];
        int parent[]   = new int[n];
        int children[] = new int[n];
        int size       = 0;
        int h          = 0;
        int t          = 0;

        Arrays.fill(children, -1);

        node[t++] = root;
        while (h < t) {
            int u = node[h++];

            if (seen[u]) { return false; }
            seen[u] = true;
            size++;

            int cnt = 0;
            for (int i = 0; i < g[u].length; i++) {
                int v = g[u][i];

                if (u == x && v == y) { continue; }
                if (u == y && v == x) { continue; }

                if (v != parent[u] && seen[v]) {
                    return false;
                }

                if (v != parent[u]) {
                    parent[v] = u;
                    node[t++] = v;
                    cnt++;
                }
            }

            if (parent[u] != -1) {
                if (children[parent[u]] == -1) {
                    children[parent[u]] = cnt;
                } else if (children[parent[u]] != cnt) {
                    return false;
                }
            }

            if (cnt != 2 && cnt != 0) {
                return false;
            }
        }

        return size == n - 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
