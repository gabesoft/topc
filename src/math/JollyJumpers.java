package topc.math;

import java.util.*;
import java.io.*;

// SRM 376 Division II Level Three - 1000
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8261&rd=10796
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm376
public class JollyJumpers {
    public int maxScore(String[] layout) {
        int board = 0;

        for (int i = 0; i < layout.length; i++) {
            String row = layout[i];
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '#') {
                    board = on(board, bit(i, j));
                }
            }
        }

        return bfs(board);
    }

    int bfs(int board) {
        Queue<Integer> nodes = new LinkedList<Integer>();
        int seen[]           = new int[1 << 16];
        int best             = 0;

        Arrays.fill(seen, -10000);

        seen[board] = 0;
        nodes.offer(board);

        while (nodes.size() > 0) {
            int state = nodes.poll();
            int score = seen[state];

            best = Math.max(best, score);

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (isOn(state, bit(i, j))) {
                        if (canMoveVertical(state, i, j, true)) {
                            update(nodes, seen, state, moveVertical(state, i, j, true), 2);
                        }
                        if (canMoveVertical(state, i, j, false)) {
                            update(nodes, seen, state, moveVertical(state, i, j, false), 2);
                        }
                        if (canMoveHorizontal(state, i, j, true)) {
                            update(nodes, seen, state, moveHorizontal(state, i, j, true), -1);
                        }
                        if (canMoveHorizontal(state, i, j, false)) {
                            update(nodes, seen, state, moveHorizontal(state, i, j, false), -1);
                        }
                    }
                }
            }
        }

        return best;
    }

    void update(Queue<Integer> q, int[] scores, int curr, int next, int offset) {
        if (scores[next] < scores[curr] + offset) {
            q.offer(next);
            scores[next] = scores[curr] + offset;
        }
    }

    boolean canMoveVertical(int board, int r, int c, boolean up) {
        int r1 = r + (up ? -1 : 1);
        int r2 = r + (up ? -2 : 2);
        return r2 > -1 && r2 < 4 && isOn(board, bit(r1, c)) && isOff(board, bit(r2, c));
    }

    boolean canMoveHorizontal(int board, int r, int c, boolean left) {
        int nc = c + (left ? 1 : -1);
        return nc > -1 && nc < 4 && isOff(board, bit(r, nc));
    }

    int moveHorizontal(int board, int r, int c, boolean left) {
        int temp = off(board, bit(r, c));
        int nc   = c + (left ? 1 : -1);
        return on(temp, bit(r, nc));
    }

    int moveVertical(int board, int r, int c, boolean up) {
        int r1 = r + (up ? -1 : 1);
        int r2 = r + (up ? -2 : 2);
        int t1 = off(board, bit(r, c));
        int t2 = off(t1, bit(r1, c));
        return on(t2, bit(r2, c));
    }

    boolean isOn(int n, int bit) {
        return ((n >> bit) & 1) == 1;
    }

    boolean isOff(int n, int bit) {
        return !isOn(n, bit);
    }

    int on(int n, int bit) {
        return n | (1 << bit);
    }

    int off(int n, int bit) {
        return n & ~(1 << bit);
    }

    int toggle(int n, int bit) {
        return n ^ (1 << bit);
    }

    int bit(int r, int c) {
        return r * 4 + c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
