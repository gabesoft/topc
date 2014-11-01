package topc.easy;

import java.util.*;
import java.io.*;

// SRM 631 Division II Level Two - 500
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13392&rd=16062
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+631
public class CatsOnTheLineDiv2 {
    public String getAnswer(int[] position, int[] count, int time) {
        int n = position.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (position[j] < position[i]) {
                    swap(position, i, j);
                    swap(count, i, j);
                }
            }
        }

        int x = -1000000000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count[i]; j++) {
                int nx = Math.max(x + 1, position[i] - time);
                if (nx > position[i] + time) {
                    return "Impossible";
                } else {
                    x = nx;
                }
            }
        }

        return "Possible";
    }

    private void swap(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
