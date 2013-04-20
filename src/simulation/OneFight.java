package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 271 Division I Level One - 250
// simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4518&rd=8068
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm271
public class OneFight {
    int[] damage;
    int[] life;
    int d;

    public int monsterKilling(int[] life, int[] damage, int yourDamage) {
        this.d      = yourDamage;
        this.damage = damage;
        this.life   = life;
        return search(0) + 1;
    }

    private int search(int dead) {
        int cost = 0;
        for (int i = 0; i < life.length; i++) {
            if (((dead >> i) & 1) == 0) {
                cost += damage[i];
            }
        }

        int next = -1;
        for (int i = 0; i < life.length; i++) {
            if (((dead >> i) & 1) == 0) {
                if (next == -1) {
                    next = i;
                } else {
                    int hi = hits(life[i]);
                    int hn = hits(life[next]);
                    if (hi * damage[next] < hn * damage[i]) {
                        next = i;
                    }
                }
            }
        }

        if (next == -1) { return 0; }

        return cost * hits(life[next]) + search(dead | (1 << next));
    }

    private int hits(int life) {
        int h = life / d;
        return (life % d == 0) ? h : h + 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
