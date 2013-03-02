package topc.graph;

import java.util.*;
import java.io.*;

// SRM 340 Division I Level Two - 500
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7505&rd=10664
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm340
public class CsCourses {
    int bound;
    int n;
    int val1[];
    int val2[];
    int exp[];

    public int[] getOrder(int[] theoreticalValue, int[] practicalValue, int[] expire, int skillBound) {
        if (skillBound == 0) { return new int[] {}; }

        n     = theoreticalValue.length;
        bound = skillBound;
        val1  = theoreticalValue;
        val2  = practicalValue;
        exp   = expire;

        int res[] = null;

        for (int i = 0; i < n; i++) {
            if (val1[i] > 1 || val2[i] > 1 || exp[i] == 0) { continue; }

            int courses[] = findCourses(i);

            if (courses == null) { 
                continue;
            } else if (res == null) {
                res = courses;
            } else if (res.length > courses.length) {
                res = courses;
            }
        }

        return res == null ? new int[] {} : res;
    }

    int[] findCourses(int v) {
        Queue<Node> nodes  = new LinkedList<Node>(); 
        boolean seen[][][] = new boolean[51][51][51];

        nodes.offer(new Node(v, val1[v], val2[v], 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.v1 >= bound && top.v2 >= bound) { return top.courses; }
            if (seen[top.month][top.v1][top.v2]) { continue; }

            seen[top.month][top.v1][top.v2] = true;

            int month = top.month + 1;
            for (int i = 0; i < n; i++) {
                if (!top.seen(i) && month < exp[i] && top.v1 >= val1[i] - 1 && top.v2 >= val2[i] - 1) {
                    nodes.offer(top.next(i, val1[i], val2[i], month));
                }
            }
        }

        return null;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node {
        public final int v;
        public final int v1;
        public final int v2;
        public final int month;
        public int courses[];

        public Node(int v, int v1, int v2, int month) {
            this.v       = v;
            this.v1      = v1;
            this.v2      = v2;
            this.month   = month;
            this.courses = new int[] { v };
        }

        public Node next(int v, int v1, int v2, int month) {
            Node n    = new Node(v, Math.max(this.v1, v1), Math.max(this.v2, v2), month);
            n.courses = new int[this.courses.length + 1];

            for (int i = 0; i < this.courses.length; i++) {
                n.courses[i] = this.courses[i];
            }

            n.courses[this.courses.length] = v;

            return n;
        }

        public boolean seen(int v) {
            for (int i = 0; i < courses.length; i++) {
                if (courses[i] == v) {
                    return true;
                }
            }
            return false;
        }
    }
}
