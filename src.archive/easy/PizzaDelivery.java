package topc.easy;

import java.util.*;
import java.io.*;

// SRM 451 Division II Level Three - 1000
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10634&rd=13905
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+451
public class PizzaDelivery {
    int [] dx = {0, 0, 1, -1};
    int [] dy = {1, -1, 0, 0}; 

    HashMap<String, Integer> ids;
    int loc[][];
    int n;
    int m;
    int k;
    int sr;
    int sc;

    public int deliverAll(String[] terrain) {
        n   = terrain.length;
        m   = terrain[0].length();
        k   = 0;
        ids = new HashMap<String, Integer>();
        loc = new int[20][];
        sr  = -1;
        sc  = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (terrain[i].charAt(j) == 'X') {
                    sr = i;
                    sc = j;
                }
                if (terrain[i].charAt(j) == '$') {
                    loc[k] = new int[] { i, j };
                    ids.put(i + ":" + j, k++);
                }
            }
        }

        int times[] = calcBestTimes(terrain);
        for (int i = 0; i < times.length; i++) {
            if (times[i] == -1) { return -1; }
        }

        int best = Integer.MAX_VALUE / 4;
        for (int i = 0; i < (1 << k); i++) {
            int fst = calc(i, times);
            int snd = calc(~i, times);
            best    = Math.min(best, Math.max(fst, snd));
        }

        return best;
    }

    int calc(int mask, int[] times) {
        ArrayList<Integer> tasks = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) {
            if (((mask >> i) & 1) == 1) {
                tasks.add(times[i]);
            }
        }

        Collections.sort(tasks);

        int sum = 0;
        int len = tasks.size();

        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                sum += tasks.get(i);
            } else {
                sum += 2 * tasks.get(i);
            }
        }

        return sum;
    }

    int[] calcBestTimes(String[] terrain) {
        int times[] = new int[k];

        for (int i = 0; i < k; i++) {
            int r    = loc[i][0];
            int c    = loc[i][1];
            times[i] = bfs(terrain, sr, sc, r, c);
        }

        return times;
    }

    int bfs(String[] terrain, int sr, int sc, int er, int ec) {
        Queue<Node> nodes = new PriorityQueue<Node>();
        boolean seen[][]  = new boolean[n][m];

        nodes.offer(new Node(sr, sc, 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();
            int r    = top.r;
            int c    = top.c;
            int cost = top.cost;

            if (r == er && c == ec) { return cost; }
            if (seen[r][c]) { continue; }

            seen[r][c] = true;

            for (int i = 0; i < dx.length; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (0 <= nr && nr < n && 0 <= nc && nc < m) {
                    char u = terrain[r].charAt(c);
                    char v = terrain[nr].charAt(nc);

                    if (u == 'X' || u == '$' || v == 'X' || v == '$') {
                        nodes.offer(new Node(nr, nc, cost + 2));
                    } else {
                        int uval = u - '0';
                        int vval = v - '0';
                        int dv = Math.abs(uval - vval);

                        if (dv <= 1) {
                            nodes.offer(new Node(nr, nc, cost + (dv == 0 ? 1 : 3)));
                        }
                    }
                }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int r;
        public final int c;
        public final int cost;

        public Node(int r, int c, int cost) {
            this.r    = r;
            this.c    = c;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return Integer.valueOf(cost).compareTo(other.cost);
        }
    }
}
