package topc.easy;

import java.util.*;
import java.io.*;

// SRM 520 Division I Level One - 250
// brute force, greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11381&rd=14545
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+520
public class SRMCodingPhase {
    int penalty[] = new int[] { 2, 4, 8 };
    int points[];
    int skills[];

    public int countScore(int[] points, int[] skills, int luck) {
        this.points = points;
        this.skills = skills;

        return solve(2, luck, 75);
    }

    private int solve(int index, int luck, int time) {
        if (index < 0) { return 0; }
        if (time <= 0) { return 0; }

        int best = solve(index - 1, luck, time); // don't solve

        if (time >= skills[index]) {             // solve without luck
            int v = points[index] - penalty[index] * skills[index];
            best = Math.max(best, v + solve(index - 1, luck, time - skills[index]));
        }

        int l = Math.min(skills[index] - 1, luck);

        if (time >= skills[index] - l) {         // solve with luck
            int v = points[index] - penalty[index] * (skills[index] - l);
            best = Math.max(best, v + solve(index - 1, luck - l, time - (skills[index] - l)));
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
