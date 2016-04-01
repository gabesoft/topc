package topc.geometry;

import java.util.*;

// SRM 646 Division II Level Two - 500
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13628&rd=16278
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+646
public class TheGridDivTwo {
    boolean[][] wall;
    int MIN  = -1000;
    int MAX  = 1000;
    int dx[] = new int[] { 0, 0, -1, 1 };
    int dy[] = new int[] { -1, 1, 0, 0 };

    public int find(int[] x, int[] y, int k) {
        this.wall = new boolean[MAX - MIN + 1][MAX - MIN + 1];

        for (int i = 0; i < x.length; i++) {
            wall[x[i] - MIN][y[i] - MIN] = true;
        }

        Queue<Integer> xs = new LinkedList<Integer>();
        Queue<Integer> ys = new LinkedList<Integer>();
        Queue<Integer> ts = new LinkedList<Integer>();

        xs.offer(0);
        ys.offer(0);
        ts.offer(0);

        int maxx = 0;

        wall[-MIN][-MIN] = true;
        while (xs.size() > 0) {
            int _x = xs.poll();
            int _y = ys.poll();
            int _t = ts.poll();

            maxx = Math.max(maxx, _x);

            if (_t >= k) { continue; }

            for (int nx = Math.max(MIN, _x - 1); nx <= Math.min(MAX, _x + 1); nx++) {
                for (int ny = Math.max(MIN, _y - 1); ny <= Math.min(MAX, _y + 1); ny++) {
                    if ((nx == _x || ny == _y) && !wall[nx - MIN][ny - MIN]) {
                        xs.offer(nx);
                        ys.offer(ny);
                        ts.offer(_t + 1);
                        wall[nx - MIN][ny - MIN] = true;
                    }
                }
            }
        }

        return maxx;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
