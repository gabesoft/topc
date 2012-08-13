package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 308 Division II Level Three - 1000
// dynamic programming, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6476&rd=9988
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm308
public class TreasuresPacking {
    int n;
    Item[] items;
    double[][] memo;

    public double maximizeCost(String[] treasures, int W) {
        n     = treasures.length;
        items = new Item[n];
        memo  = new double[n][W + 1];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(treasures[i]);
        }

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        Arrays.sort(items);

        return cost(0, W);
    }

    double cost(int i, int w) {
        if (w == 0) { return 0; }
        if (i == n) { return 0; }
        if (memo[i][w] > -1.0) { return memo[i][w]; }

        double res = 0;

        if (items[i].w <= w) {
            res = items[i].c + cost(i + 1, w - items[i].w);
        } else if (items[i].p) {
            res = ((double)w / items[i].w) * items[i].c;
        } 

        res = Math.max(res, cost(i + 1, w));

        memo[i][w] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Item implements Comparable<Item> {
        public final int w;
        public final double c;
        public final boolean p;

        public Item(String treasure) {
            String[] parts = treasure.split(" ");
            w = Integer.parseInt(parts[0]);
            c = Double.parseDouble(parts[1]);
            p = parts[2].charAt(0) == 'Y';
        }

        public int compareTo(Item other) {
            if (p && !other.p) { return 1; }
            if (other.p && !p) { return -1; }

            double x1 = c / w;
            double x2 = other.c / other.w;
            return Double.valueOf(x2).compareTo(x1);
        }

        public String toString() {
            return String.format("%s %s %s", w, c, p ? 'Y' : 'N');
        }
    }
}
