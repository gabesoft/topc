package topc.greedy;

import java.util.*;
import java.io.*;

// Life's too short to do anything below awesome.
// SRM 232 Division II Level Three - 1000
// greedy, math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3971&rd=6521
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm232
public class StockHistory {
    int monthly;
    double price[];
    double memo[][];

    public int maximumEarnings(int initialInvestment, int monthlyContribution, String[] stockPrices) {
        int n = stockPrices.length;
        int m = stockPrices[0].split("\\s+").length;

        int value[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            String prices[] = stockPrices[i].split("\\s+");
            for (int j = 0; j < m; j++) {
                value[i][j] = Integer.parseInt(prices[j]);
            }
        }

        price = new double[n - 1];
        for (int i = 0; i < n - 1; i++) {
            price[i] = 0;
            for (int j = 0; j < m; j++) {
                price[i] = Math.max(price[i], value[n - 1][j] / (double) value[i][j]);
            }
        }

        monthly = monthlyContribution;
        memo    = new double[n][initialInvestment + n * monthlyContribution + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -2);
        }

        double profit = invest(0, initialInvestment);

        return (int)Math.round(profit);
    }

    private double invest(int k, int amt) {
        if (k == price.length) { return 0; }
        if (memo[k][amt] > -1) { return memo[k][amt]; }

        double profit = amt * price[k] - amt;
        double a = 0;
        double b = invest(k + 1, amt + monthly);

        if (profit > 0) {
            a = profit + invest(k + 1, monthly);
        }

        memo[k][amt] = Math.max(a, b);
        return memo[k][amt];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
