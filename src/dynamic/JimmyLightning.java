package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 295 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6102&rd=9816
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm295
public class JimmyLightning {
    int n;
    int[] times;
    int[] doors;
    int[][] memo;
    Room[] rooms;

    public int robTheBank(int[] doors, String[] diamonds) {
        this.n     = doors.length;
        this.doors = doors;
        this.rooms = new Room[n];
        this.memo  = new int[n][doors[0] + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        for (int i = 0; i < n; i++) {
            rooms[i] = new Room();
        }

        for (int i = 0; i < diamonds.length; i++) {
            String[] parts = diamonds[i].split(" ");
            int room       = Integer.parseInt(parts[2]) - 1;
            int value      = Integer.parseInt(parts[0]);
            int time       = Integer.parseInt(parts[1]);
            rooms[room].add(value, time);
        }

        return count(0, doors[0]);
    }

    int count(int door, int maxtime) {
        if (door == n) { return 0; }
        if (maxtime == 1) { return 0; }
        if (memo[door][maxtime] > -1) { return memo[door][maxtime]; }

        int time = Math.min(maxtime, doors[door]);
        int best = count(door + 1, time);

        for (int i = 0; i < rooms[door].n; i++) {
            int t = rooms[door].times[i];
            int v = rooms[door].values[i];

            if (t < time) {
                best = Math.max(best, v + count(door, time - t));
            }
        }

        memo[door][maxtime] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Room {
        public int n;
        public int[] times;
        public int[] values;

        public Room() {
            n = 0;
            times  = new int[0];
            values = new int[0];
        }

        public void add(int value, int time) {
            int[] t1 = times;
            int[] t2 = values;
            times    = new int[n + 1];
            values   = new int[n + 1];

            for (int i = 0; i < n; i++) {
                times[i]  = t1[i];
                values[i] = t2[i];
            }

            times[n]  = time;
            values[n] = value;

            n++;
        }
    }
}
