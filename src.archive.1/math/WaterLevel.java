package topc.math;

import java.util.*;
import java.io.*;

// SRM 196 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2263&rd=5071
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm196
public class WaterLevel {
    public double netAmt(int evapNormal, int evapFlood, int[] rain) {
        int n = rain.length;

        double level = 0;

        for (int d = 0; d < n; d++) {
            if (level <= 0) {
                if (rain[d] - evapNormal > (-1 * level)) {
                    double ratio     = (-1 * level) / (rain[d] - evapNormal);
                    double remaining = 1 - ratio;
                    double nextLevel = remaining * (rain[d] - evapFlood);
                    if (nextLevel < 0) {
                        nextLevel = 0;
                    }
                    level = nextLevel;
                } else {
                    level = level + rain[d] - evapNormal;
                }
            } else {
                if (rain[d] - evapFlood < (-1 * level)) {
                    double ratio     = (-1 * level) / (rain[d] - evapFlood);
                    double remaining = 1 - ratio;
                    double nextLevel = remaining * (rain[d] - evapNormal);
                    if (nextLevel > 0) {
                        nextLevel = 0;
                    }
                    level = nextLevel;
                } else {
                    level = level + rain[d] - evapFlood;
                }
            }
        }

        return level;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
