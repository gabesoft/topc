package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 224 Division II Level Three - 1100
// string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3035&rd=5870
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm224
public class ParenReduction {
    public String pretty(String expr) {
        Node node = new Node(expr, null, 0);
        node.clearParen();
        return node.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        boolean hasParen;
        int side;
        public final char value;
        public final Node parent;
        public final Node l;
        public final Node r;

        public Node(String expr, Node p, int s) {
            int len = expr.length();

            parent = p;
            side   = s;

            if (len == 1) {
                value = expr.charAt(0);
                l     = null;
                r     = null;
            } else {
                expr    = expr.substring(1, len - 1);
                int pos = findOp(expr);

                value = expr.charAt(pos);
                l     = new Node(expr.substring(0, pos), this, 2);
                r     = new Node(expr.substring(pos + 1), this, 1);
            }

            hasParen = l != null;
        }

        private int findOp(String expr) {
            int paren = 0;
            int len   = expr.length();

            for (int i = 0; i < len; i++) {
                if (expr.charAt(i) == '(') {
                    paren++;
                }
                if (expr.charAt(i) == ')') {
                    paren--;
                }
                if (isOp(expr.charAt(i)) && paren == 0) {
                    return i;
                }
            }

            return -1;
        }

        private boolean isOp(char c) {
            return prec(c) != -1;
        }

        public void clearParen() {
            if (!hasParen) { return; }

            if (parent == null) {
                hasParen = false;
            } else {
                char op1 = parent.value;
                char op2 = value;

                if (prec(op1) > prec(op2)) {
                    hasParen = false;
                } else if (prec(op1) == prec(op2)) {
                    if (assoc(op1) == 0 || side == assoc(op2) || side == assoc(op1)) {
                        hasParen = false;
                    }
                }
            }

            l.clearParen();
            r.clearParen();
        }

        private int prec(int c) {
            switch (c) {
                case '^': return 1;
                case '*': return 2;
                case '/': return 2;
                case '+': return 3;
                case '-': return 3;
            }
            return -1;
        }

        private int assoc(int c) {
            switch (c) {
                case '^': return 1;
                case '*': return 0;
                case '/': return 2;
                case '+': return 0;
                case '-': return 2;
            }
            return -1;
        }

        public String toString() {
            if (l != null) {
                String v = String.format("%s%s%s", l.toString(), value, r.toString());
                return hasParen ? String.format("(%s)", v) : v;
            } else {
                return value + "";
            }
        }
    }
}
