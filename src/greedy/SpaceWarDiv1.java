package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 582 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12604&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class SpaceWarDiv1 {
    public long minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, long[] enemyCount) {
        int n = magicalGirlStrength.length;
        int m = enemyStrength.length;

        MGirl strength[]       = new MGirl[10001];
        int mstrength[]        = new int[n];
        ArrayList<MGirl> girls = new ArrayList<MGirl>();

        long total = 0;

        for (int j = 0; j < m; j++) {
            total += enemyCount[j];

            for (int i = 0; i < n; i++) {
                if (magicalGirlStrength[i] >= enemyStrength[j]) {
                    mstrength[i] = Math.max(mstrength[i], enemyStrength[j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int s = mstrength[i];

            if (strength[s] == null) {
                strength[s] = new MGirl(s);
                girls.add(strength[s]);

                for (int j = 0; j < m; j++) {
                    if (enemyStrength[j] <= mstrength[i]) {
                        strength[s].canDefeat += enemyCount[j];
                    }
                }
            }

            strength[s].count++;
        }

        Collections.sort(girls);

        long soFar   = 0;
        long fatigue = 0;
        int k        = girls.size();
        int gcount[] = new int[k];

        if (girls.get(k - 1).canDefeat < total) { return -1; }

        gcount[k - 1] = girls.get(k - 1).count;
        for (int i = k - 2; i > -1; i--) {
            gcount[i] = gcount[i + 1] + girls.get(i).count;
        }

        for (int i = 0; i < k; i++) {
            MGirl g     = girls.get(i);
            long t = total / gcount[i];

            if (total % gcount[i] != 0) {
                t++;
            }

            long defeat    = g.count * t;
            long canDefeat = g.canDefeat - soFar;

            if (canDefeat >= defeat) {
                total   -= defeat;
                soFar   += defeat;
                fatigue  = Math.max(fatigue, defeat / g.count);
            } else {
                total -= canDefeat;
                soFar += canDefeat;

                long f = canDefeat / g.count;
                if (canDefeat % g.count != 0) {
                    f++;
                }
                fatigue = Math.max(fatigue, f);
            }
        }

        return fatigue;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class MGirl implements Comparable<MGirl> {
        public final int strength;
        public int count;
        public long canDefeat;

        public MGirl(int strength) {
            this.strength  = strength;
            this.canDefeat = 0;
            this.count     = 0;
        }

        public int compareTo(MGirl g) {
            return strength - g.strength;
        }

        public String toString() {
            return String.format("%s:%s-%s", count, strength, canDefeat);
        }
    }
}
