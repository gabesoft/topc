package topc.search;

import java.util.*;
import java.io.*;

// SRM 208 Division I Level Two - 500
// simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2935&rd=5854
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm208
public class QueenInterference {
    long last;
    int steps = 0;
    int Q[][];
    int n;

    public int numSteps(int n) {
        this.n = n;
        this.Q = new int[n][n];
        this.last = -1;

        S1(0);
        S2();

        return steps;
    }

    private void S1(int c) {
        if (c == n) { return; }

        int r = rand(n);
        Q[r - 1][c] = 1;

        S1(c + 1);
    }

    private void S2() {
        int t = 0;

        for (int i = 0; i < n; i++) {
            if (reachable(i)) {
                t++;
            }
        }

        if (t == 0) { return; }

        steps++;
        int k = rand(t);
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (reachable(i)) {
                if (--k == 0) {
                    c = i;
                    break;
                }
            }
        }

        S3(c);
    }

    private void S3(int col) {
        int cr[] = new int[n];
        int best = 1000;
        for (int i = 0; i < n; i++) {
            cr[i] = countReach(i, col);
            best = Math.min(best, cr[i]);
        }

        S4(col, best, cr);
    }

    private void S4(int col, int min, int count[]) {
        ArrayList<Integer> ties = new ArrayList<Integer>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == min) {
                ties.add(i);
            }
        }

        if (ties.size() == 1) {
            int r = ties.get(0);
            move(r, col);
            S2();
        } else {
            S5(col, ties);
        }
    }

    private void S5(int col, ArrayList<Integer> ties) {
        int k = rand(ties.size());
        int r = ties.get(k - 1);
        move(r, col);
        S2();
    }

    private void move(int r, int c) {
        for (int i = 0; i < n; i++) {
            Q[i][c] = i == r ? 1 : 0;
        }
    }

    private int countReach(int row, int col) {
       int count = 0; 
       for (int c = 0; c < n; c++) {
           if (c != col && Q[row][c] == 1) {
               count++;
           }
       }
       for (int i = 1; i < n; i++) {
           if (valid(row + i, col + i) && Q[row + i][col + i] == 1) {
               count++;
           }
           if (valid(row - i, col - i) && Q[row - i][col - i] == 1) {
               count++;
           }
           if (valid(row - i, col + i) && Q[row - i][col + i] == 1) {
               count++;
           }
           if (valid(row + i, col - i) && Q[row + i][col - i] == 1) {
               count++;
           }
       }
       return count;
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }

    private boolean reachable(int c) {
        for (int i = 0; i < n; i++) {
            if (Q[i][c] == 1) {
                return countReach(i, c) > 0;
            }
        }
        return false;
    }

    private int rand(long max) {
        if (last < 0) {
            last = 1;
        } else {
            last = (16807L * last) % 2147483647L;
        }
        long r = (last % max) + 1;
        return (int)r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
