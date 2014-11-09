package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 260 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4749&rd=7994
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm260
public class RollingBlock {
    int[][] dr = { { 0, 1, 0, -3 }, { 0, 1, 0, -1 }, { 0, 3, 0, -1 } };
    int[][] dc = { { 1, 0, -3, 0 }, { 3, 0, -1, 0 }, { 1, 0, -1, 0 } };
    int[][] ds = { { 1, 2, 1, 2 }, { 0, 1, 0, 1 }, { 2, 0, 2, 0 } };

    public int minMoves(int rows, int cols, int[] start, int[] target) {
        Queue<State> states = new LinkedList<State>();
        boolean seen[][][]  = new boolean[rows][cols][3];

        states.offer(new State(start[0], start[1], 0));

        while (states.size() > 0) {
            State top = states.poll();

            if (top.row == target[0] && top.col == target[1] && top.side == 0) {
                return top.count;
            }
            if (outside(top, rows, cols)) {
                continue;
            }

            if (seen[top.row][top.col][top.side]) {
                continue;
            }

            seen[top.row][top.col][top.side] = true;

            int s = top.side;
            for (int i = 0; i < dr[s].length; i++) {
                int nr = top.row + dr[s][i];
                int nc = top.col + dc[s][i];
                int ns = ds[s][i];
                states.offer(top.create(nr, nc, ns));
            }
        }

        return -1;
    }

    private boolean outside(State s, int rows, int cols) {
        int r = s.row;
        int c = s.col;

        if (r < 0 || c < 0) { return true; }

        if (s.side == 1) { c += 2; }
        if (s.side == 2) { r += 2; }

        if (r >= rows || c >= cols) { return true; }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class State {
        public int row;
        public int col;
        public int side; // 0: 1x1, 1: 1x3, 2: 3x1
        public int count;

        public State (int r, int c, int s) {
            row   = r;
            col   = c;
            count = 0;
            side  = s;
        }

        public State create(int r, int c, int s) {
            State next = new State(r, c, s);
            next.count = count + 1;
            return next;
        }

        public String toString() {
            String sstr = "1x1";
            if (side == 1) { sstr = "1x3"; }
            if (side == 2) { sstr = "3x1"; }
            return String.format("(%s,%s):%s", row, col, sstr);
        }
    }
}
