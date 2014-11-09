package topc.math;

import java.util.*;
import java.io.*;

// SRM 507 Division II Level Three - 1000
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11322&rd=14436
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+507
public class CubeRoll {
    final int INF = 1000000000;

    public int getMinimumSteps(int initPos, int goalPos, int[] holePos) {
        int left  = -INF;
        int right = INF;

        if (initPos > goalPos) {
            int temp = goalPos;
            goalPos  = initPos;
            initPos  = temp;
        }

        for (int i = 0; i < holePos.length; i++) {
            int x = holePos[i];
            if (x < initPos) {
                left = Math.max(left, x);
            } else if (x > goalPos) {
                right = Math.min(right, x);
            } else {
                return -1;
            }
        }

        if (left == -INF || right == INF) {
            return unboundedCase(goalPos - initPos);
        } else {
            return boundedCase(left, initPos, goalPos, right);
        }
    }

    int unboundedCase(int dist) {
        int res = boundedCase(0, 1, 1 + dist, 2 + dist);
        if (dist % 4 != 2) {
            res = Math.min(res, 2);
        } else {
            res = Math.min(res, 3);
        }
        return res;
    }

    int boundedCase(int left, int init, int goal, int right) {
        int dist[] = new int[right + 1];
        Queue<Integer> q = new LinkedList<Integer>();

        Arrays.fill(dist, INF);
        q.offer(init);
        dist[init] = 0;

        while (q.size() > 0) {
            int x = q.poll();

            for (int y = 1; y <= right / y && x + y * y < right; y++) {
                int z = x + y * y;
                if (dist[z] > dist[x] + 1) {
                    q.offer(z);
                    dist[z] = dist[x] + 1;
                }
            }

            for (int y = 1; y <= x / y && left + y * y < x; y++) {
                int z = x - y * y;
                if (dist[z] > dist[x] + 1) {
                    q.offer(z);
                    dist[z] = dist[x] + 1;
                }
            }
        }

        return dist[goal];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
