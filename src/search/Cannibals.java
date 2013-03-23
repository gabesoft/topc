package topc.search;

import java.util.*;
import java.io.*;

// SRM 305 Division II Level Three - 1050
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6410&rd=9826
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm305
public class Cannibals {
    int M;
    int C;

    public int minCrossings(int M, int C, int R) {
        this.M = M;
        this.C = C;

        Queue<State> nodes = new LinkedList<State>();
        boolean seen[][][] = new boolean[M + 1][C + 1][2];

        nodes.offer(new State(M, C, 0, 0));

        while (nodes.size() > 0) {
            State state = nodes.poll();

            if (state.ml == 0 && state.cl == 0) { return state.trips; }
            if (state.ml <= 1 && state.cl <= 1 && state.side == 0) { return state.trips + 1; }
            if (seen[state.ml][state.cl][state.side]) { continue; }

            seen[state.ml][state.cl][state.side] = true;

            int ml = state.ml;
            int cl = state.cl;
            int mr = M - ml;
            int cr = C - cl;

            if (state.side == 0) {
                int start = Math.min(R, ml + cl);

                for (int r = start; r > 1; r--) {
                    for (int m = 0; m < ml + 1; m++) {

                        int c = r - m;
                        if (valid(state, m, c)) {
                            nodes.offer(state.next(m, c));
                        }
                    }
                }
            } else {
                int end = Math.min(R, mr + cr);

                for (int r = 1; r < end + 1; r++) {
                    for (int m = 0; m < mr + 1; m++) {

                        int c = r - m;
                        if (valid(state, m, c)) {
                            nodes.offer(state.next(m, c));
                        }
                    }
                }
            }
        }

        return -1;
    }

    private boolean valid(State s, int m, int c) {
        if (m < 0 || c < 0) { return false; }
        if (m > 0 && m < c) { return false; }

        int ml = s.ml;
        int cl = s.cl;
        int mr = M - ml;
        int cr = C - cl;

        int nml = s.side == 0 ? ml - m : ml + m;
        int ncl = s.side == 0 ? cl - c : cl + c;
        int nmr = s.side == 0 ? mr + m : mr - m;
        int ncr = s.side == 0 ? cr + c : cr - c;

        if (nml < 0 || ncl < 0 || nmr < 0 || ncr < 0) { return false; }
        if (nml > 0 && nml < ncl) { return false; }
        if (nmr > 0 && nmr < ncr) { return false; }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class State {
        public final int ml;
        public final int cl;
        public final int trips;
        public final int side;

        public State(int ml, int cl, int trips, int side) {
            this.ml    = ml;
            this.cl    = cl;
            this.trips = trips;
            this.side  = side;
        }

        public State next(int m, int c) {
            int nml = side == 0 ? ml - m : ml + m;
            int ncl = side == 0 ? cl - c : cl + c;
            return new State(nml, ncl, trips + 1, ~side & 1); // flip side
        }
    }
}
