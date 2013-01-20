package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 374 Division I Level Two - 500
// sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8225&rd=10793
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm374
public class PlayerExtraction {
    int dx[] = new int[] {-1, +1, 0, 0};
    int dy[] = new int[] {0, 0, -1, +1};

    public String[] extractPlayers(String[] photo, int k, int threshold) {
        int m = photo.length;
        int n = photo[0].length();

        char ph[][] = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ph[i][j] = photo[i].charAt(j);
            }
        }

        ArrayList<Player> players = new ArrayList<Player>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ph[i][j] == k + '0') {
                    Player p = extract(ph, j, i, k);

                    if (p.area >= threshold) {
                        players.add(p);
                    }
                }
            }
        }

        Collections.sort(players);

        String res[] = new String[players.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = players.get(i).toString();
        }

        return res;
    }

    Player extract(char[][] photo, int x, int y, int k) {
        int m = photo.length;
        int n = photo[0].length;

        int x1   = 2 * x;
        int y1   = 2 * y;
        int x2   = 2 * (x + 1);
        int y2   = 2 * (y + 1);
        int area = 4;

        Queue<Integer> xq = new LinkedList<Integer>();
        Queue<Integer> yq = new LinkedList<Integer>();

        xq.offer(x);
        yq.offer(y);

        photo[y][x] = '.';

        while (xq.size() > 0) {
            int xt = xq.poll();
            int yt = yq.poll();

            for (int i = 0; i < dx.length; i++) {
                int xn = xt + dx[i];
                int yn = yt + dy[i];

                if (xn < 0 || xn >= n || yn < 0 || yn >= m || photo[yn][xn] != k + '0') {
                    continue;
                }

                x1 = Math.min(x1, xn * 2);
                y1 = Math.min(y1, yn * 2);
                x2 = Math.max(x2, (xn + 1) * 2);
                y2 = Math.max(y2, (yn + 1) * 2);

                area += 4;

                photo[yn][xn] = '.';
                xq.offer(xn);
                yq.offer(yn);
            }
        }

        int xc = (x1 + x2) / 2;
        int yc = (y1 + y2) / 2;

        return new Player(xc, yc, area);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Player implements Comparable<Player> {
        public final int x;
        public final int y;
        public final int area;

        public Player(int x, int y, int area) {
            this.x    = x;
            this.y    = y;
            this.area = area;
        }

        public int compareTo(Player other) {
            return (x != other.x) ? x - other.x : y - other.y;
        }

        public String toString() {
            return x + " " + y;
        }
    }
}
