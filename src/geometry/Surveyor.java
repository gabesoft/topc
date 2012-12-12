package topc.geometry;

import java.util.*;
import java.io.*;

// TCCC '04 Qual. 1 Division I Level Two - 550
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1359&rd=5000
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tccc04_qual_1
public class Surveyor {
    public int area(String direction, int[] length) {
        ArrayList<Integer> xs = new ArrayList<Integer>();
        ArrayList<Integer> ys = new ArrayList<Integer>();

        int x  = 0;
        int y  = 0;

        xs.add(x);
        ys.add(y);

        for (int i = 0; i < direction.length() - 1; i++) {
            char dir   = direction.charAt(i);
            int len    = length[i];
            int next[] = move(x, y, dir, len);

            x = next[0];
            y = next[1];

            if (dir != direction.charAt(i + 1)) {
                xs.add(x);
                ys.add(y);
            }
        }

        return area(toArray(xs), toArray(ys));
    }

    int area(int[] x, int [] y) {
        int a = 0;

        for (int i = 1; i < x.length - 1; i++) {

            int x1 = x[i] - x[0];
            int y1 = y[i] - y[0];
            int x2 = x[i + 1] - x[0];
            int y2 = y[i + 1] - y[0];

            a += (x1 * y2 - x2 * y1);
        }

        return (int)Math.abs(a / 2.0);
    }

    int[] move(int x, int y, char dir, int len) {
        switch (dir) {
            case 'N':
                y += len;
                break;
            case 'S':
                y -= len;
                break;
            case 'E':
                x += len;
                break;
            case 'W':
                x -= len;
                break;
        }

        return new int[] { x, y };
    }

    int[] toArray(ArrayList<Integer> list) {
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
