package topc.easy;

import java.util.*;
import java.io.*;

// SRM 446 Division II Level Three - 1000
// brute force, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10573&rd=13900
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+446
public class HanoiTower {
    public int moves(String pegA, String pegB, String pegC) {
        long pegs[] = new long[] { toNumber(pegA), toNumber(pegB), toNumber(pegC) };
        long ends[] = new long[pegs.length];

        for (int i = 0; i < pegs.length; i++) {
            long peg = pegs[i];
            while (peg > 0) {
                long key = peg % 10L - 1L;
                ends[(int)key] = ends[(int)key] * 10L + key + 1L;
                peg /= 10;
            }
        }

        State state                  = new State(pegs);
        Queue<State> states          = new LinkedList<State>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        states.offer(state);
        map.put(state.toString(), 0);

        int cnt = 0;

        while (true) {
            State top = states.poll();
            cnt       = map.get(top.toString());

            if (arraysEqual(top.pegs, ends)) {
                return cnt;
            }

            for (int i = 0; i < pegs.length; i++) {
                for (int j = 0; j < pegs.length; j++) {
                    if (i != j && top.pegs[i] > 0) {
                        State next = top.move(i, j);
                        if (!map.containsKey(next.toString())) {
                            map.put(next.toString(), cnt + 1);
                            states.offer(next);
                        }
                    }
                }
            }
        }

    }

    long toNumber(String str) {
        long res = 0;
        int len  = str.length();

        for (int i = 0; i < len; i++) {
            res = res * 10 + (str.charAt(i) - 'A' + 1);
        }

        return res;
    }

    boolean arraysEqual(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class State {
        public long[] pegs;

        public State(long[] pegs) {
            this.pegs = pegs;
        }

        public State move(int from, int to) {
            long next[] = pegs.clone();
            next[to] = next[to] * 10 + next[from] % 10;
            next[from] /= 10;
            return new State(next);
        }

        public String toString() {
            return Arrays.toString(pegs);
        }
    }

}
