package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 582 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12604&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class SpaceWarDiv1 {
    public long minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, long[] enemyCount) {
        return solve1(magicalGirlStrength, enemyStrength, enemyCount);
        //return solve2(magicalGirlStrength, enemyStrength, enemyCount);
    }

    private long solve2(int[] magicalGirlStrength, int[] enemyStrength, long[] enemyCount) {
        Enemy[] enemies = new Enemy[enemyStrength.length];

        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = new Enemy(enemyStrength[i], enemyCount[i]);
        }

        Arrays.sort(magicalGirlStrength);
        Arrays.sort(enemies);

        if (magicalGirlStrength[magicalGirlStrength.length - 1] < enemies[enemies.length - 1].strength) {
            return -1;
        }

        long lo = 0;
        long hi = (long)1e18;

        while (hi - lo > 1) {
            long mid = (lo + hi) / 2;
            if (!possible(mid, magicalGirlStrength, enemies)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }

        return lo + 1;
    }

    private boolean possible(long maxBattles, int[] magicalGirlStrength, Enemy[] enemies) {
        int gi = 0;
        int ei = 0;

        long nbattles = maxBattles;
        long nleft    = enemies[0].count;

        while (gi < magicalGirlStrength.length && ei < enemies.length) {
            if (nleft == 0) {
                ei++;
                if (ei < enemies.length) {
                    nleft = enemies[ei].count;
                }
                continue;
            }
            if (magicalGirlStrength[gi] < enemies[ei].strength || nbattles == 0) {
                gi++;
                nbattles = maxBattles;
                continue;
            }
            long batt  = Math.min(nleft, nbattles);
            nleft     -= batt;
            nbattles  -= batt;
        }

        return ei == enemies.length;
    }

    private long solve1(int[] magicalGirlStrength, int[] enemyStrength, long[] enemyCount) {
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

    public class Enemy implements Comparable<Enemy> {
        public final int strength;
        public final long count;

        public Enemy(int s, long c) {
            strength = s;
            count    = c;
        }

        public int compareTo(Enemy e) {
            return (strength != e.strength)
                ? strength - e.strength
                : Long.valueOf(count).compareTo(e.count);
        }
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
