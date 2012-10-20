package topc.search;

import java.util.*;
import java.io.*;

// SRM 488 Division II Level Three - 1000
// simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11206&rd=14241
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+488
public class TheBoringGameDivTwo {
    public int[] find(int scoreJ, int killedJ, int scoreB, int killedB, int scoreF, int killedF) {
        int neg = killedJ + killedB - scoreF;
        if (neg != killedF - scoreJ - scoreB) { return new int[0]; }

        int minRounds = Integer.MAX_VALUE;
        int maxRounds = Integer.MIN_VALUE;
        int killed    = killedJ + killedB + killedF;

        for (int a = 0; a <= killedF;  a++) {
            for (int b = 0; a + b <= killedF; b++) {
                if ((killed + a + b) % 2 == 0) {
                    int numRounds = (killed + a + b) / 2;
                    int wonF      = numRounds - killedF;

                    int lower = Integer.MIN_VALUE;
                    int upper = Integer.MAX_VALUE;

                    int h = Math.max(0, scoreJ - a);
                    int g = Math.max(0, scoreB - b);

                    upper = Math.min(upper, numRounds - (h + a) - (g + b));

                    int e = h + a - scoreJ;
                    int f = g + b - scoreB;

                    lower = Math.max(lower, e + f);

                    upper = Math.min(upper, killedJ - g);
                    upper = Math.min(upper, killedB - h);

                    if (lower <= wonF && wonF <= upper) {
                        minRounds = Math.min(minRounds, numRounds);
                        maxRounds = Math.max(maxRounds, numRounds);
                    }
                }
            }
        }

        return (minRounds > maxRounds) ? new int[0] : new int[] { minRounds, maxRounds };

    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
