package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 225 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3098&rd=5871
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm225
public class ComboBoxKeystrokes {
    char[] items;
    int[][] jump;
    int n;

    public int minimumKeystrokes(String[] elements) {
        n     = elements.length;
        items = new char[n];

        for (int i = 0; i < n; i++) {
            items[i] = elements[i].toLowerCase().charAt(0);
        }

        jump = new int[n][26];
        for (int i = 0; i < n; i++) {
            Arrays.fill(jump[i], -1);

            for (int j = i + 1; j < 2 * n; j++) {
                int c = items[j % n] - 'a';
                if (jump[i][c] == -1) {
                    jump[i][c] = j % n;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, bfs(i, j));
            }
        }

        return max;
    }

    private int bfs(int s, int e) {
        boolean seen[] = new boolean[n];

        int pos[] = new int[n * n];
        int len[] = new int[n * n];

        int h = 0;
        int t = 1;

        pos[h] = s;
        len[h] = 0;

        while (h < t) {
            int u = pos[h];
            int l = len[h];
            h++;

            if (u == e) { return l; }
            if (seen[u]) { continue; }

            seen[u] = true;
            for (int i = 0; i < jump[u].length; i++) {
                if (jump[u][i] > -1) {
                    pos[t] = jump[u][i];
                    len[t] = l + 1;
                    t++;
                }
            }
        }

        return 1000;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
