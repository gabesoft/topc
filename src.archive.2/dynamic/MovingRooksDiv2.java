package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 618 Division II Level Three - 900
// advanced math, dynamic programming, graph theory, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13065&rd=15851
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+618
public class MovingRooksDiv2 {
    int n;

    public String move(int[] Y1, int[] Y2) {
        n = Y1.length;

        HashSet<String> seen = new HashSet<String>();
        Queue<String> Q = new LinkedList<String>();

        Q.offer(str(Y1));
        seen.add(str(Y1));

        while (Q.size() > 0) {
            char[] x = Q.poll().toCharArray();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int xi = x[i] - '0';
                    int xj = x[j] - '0';
                    if (xi > xj) {
                        swap(x, i, j);
                        String nx = new String(x);
                        if (!seen.contains(nx)) {
                            seen.add(nx);
                            Q.offer(nx);
                        }
                        swap(x, i, j);
                    }
                }
            }
        }

        return seen.contains(str(Y2)) ? "Possible" : "Impossible";
    }

    private void swap(char[] x, int i, int j) {
        char c = x[i];
        x[i] = x[j];
        x[j] = c;
    }

    private String str(int[] a) {
        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = (char)(a[i] + '0');
        }
        return new String(chars);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
