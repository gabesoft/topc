package topc.graph;

import java.util.*;
import java.io.*;

// SRM 591 Division I Level One - 275
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12746&rd=15703
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+591
public class TheTree {
    public int maximumDiameter(int[] cnt) {
        Node tree = new Node();
        build(tree, cnt, 0);
        return diameter(tree);
    }

    private int height(Node tree) {
        if (tree == null) { return 0; }
        return 1 + Math.max(height(tree.left), height(tree.right));
    }

    private int diameter(Node tree) {
        if (tree == null) { return 0; }

        int a = diameter(tree.left);
        int b = diameter(tree.right);
        int c = height(tree.left) + height(tree.right);

        return Math.max(a, Math.max(b, c));
    }

    private void build(Node root, int[] cnt, int index) {
        if (index == cnt.length) { return; }
        if (cnt[index] <= 0) { return; }

        if (cnt[index] == 1) {
            cnt[index]--;
            root.right = new Node();
            build(root.right, cnt, index + 1);
        } else {
            cnt[index] -= 2;

            int[] copy = cnt.clone();
            for (int i = index + 1; i < cnt.length && cnt[i] > 1; i++) {
                copy[i] = Math.min(1, cnt[i]);
            }

            root.right = new Node();
            build(root.right, copy, index + 1);

            for (int i = index + 1; i < cnt.length; i++) {
                cnt[i]--;
            }

            root.left = new Node();
            build(root.left, cnt, index + 1);
        }
    }

    private void print(Node tree, int level, String indent) {
        if (tree == null) { return; }

        debug(indent + level);
        print(tree.left, level + 1, indent + ' ');
        print(tree.right, level + 1, indent + ' ');
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        public Node left;
        public Node right;
        public Node() { }
    }
}
