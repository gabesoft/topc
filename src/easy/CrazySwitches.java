package topc.easy;

import java.util.*;
import java.io.*;

// SRM 291 Division I Level Two - 500
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6071&rd=9812
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm291
public class CrazySwitches {
    public int minimumActions(int[] switches) {
        int n      = switches.length;
        int last   = n - 1;
        int lastOn = 1 << last;

        Queue<Integer> rooms  = new LinkedList<Integer>();
        Queue<Integer> lights = new LinkedList<Integer>();
        Queue<Integer> counts = new LinkedList<Integer>();
        boolean seen[][]      = new boolean[n][1 << n];

        rooms.offer(0);
        lights.offer(1);
        counts.offer(0);

        while (rooms.size() > 0) {
            int room  = rooms.poll();
            int light = lights.poll();
            int count = counts.poll();

            if (room == last && light == lastOn) { return count; }
            if (seen[room][light]) { continue; }

            seen[room][light] = true;

            for (int i = 0; i < n; i++) {
                if (i != room && isOn(light, i)) {
                    rooms.offer(i);
                    lights.offer(light);
                    counts.offer(count + 1);
                }
            }


            for (int i = 0; i < n; i++) {
                if (i != room && switches[i] == room) {
                    rooms.offer(room);
                    lights.offer(flip(light, i));
                    counts.offer(count);
                }
            }
        }

        return -1;
    }

    boolean isOff(int mask, int bit) {
        return !isOn(mask, bit);
    }

    boolean isOn(int mask, int bit) {
        return ((mask >> bit) & 1) == 1;
    }

    int flip(int mask, int bit) {
        return isOn(mask, bit) ? off(mask, bit) : on(mask, bit);
    }

    int on(int mask, int bit) {
        return mask | (1 << bit);
    }

    int off(int mask, int bit) {
        return mask & ~(1 << bit);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
