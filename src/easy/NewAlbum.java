package topc.easy;

import java.util.*;
import java.io.*;

// SRM 296 Division I Level One - 250
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6085&rd=9817
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm296
public class NewAlbum {
    int INF = Integer.MAX_VALUE / 4;
    int capacity;
    int length;
    int[] memo;

    public int leastAmountOfCDs(int nSongs, int length, int cdCapacity) {
        this.length   = length;
        this.capacity = cdCapacity;
        this.memo     = new int[nSongs + 1];

        Arrays.fill(memo, -1);
        return count(nSongs);
    }

    int count(int songs) {
        if (songs <= 0) { return 0; }
        if (memo[songs] > -1) { return memo[songs]; }

        int res = INF;
        int hi  = Math.min((capacity + 1) / (length + 1), songs);

        for (int i = 1; i < hi + 1; i++) {
            if (i % 13 != 0) {
                res = Math.min(res, 1 + count(songs - i));
            }
        }

        memo[songs] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
