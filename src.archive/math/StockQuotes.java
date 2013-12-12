package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

// SRM 257 Division I Level Two - 450
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4706&rd=8005
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm257
public class StockQuotes {
    public String[] report(String[] quotes) {
        Exch exs[] = new Exch[11];
        exs[10]    = new Exch(10);

        int bestBid[] = new int[10];
        int bestAsk[] = new int[10];

        Arrays.fill(bestAsk, 1001);

        int k = 0;
        for (int i = 0; i < quotes.length; i++) {
            String parts[] = quotes[i].split("\\s+");

            int exch = Integer.parseInt(parts[0]);
            int bid  = Integer.parseInt(parts[1]);
            int ask  = Integer.parseInt(parts[2]);

            bestBid[exch] = bid;
            bestAsk[exch] = ask;

            if (exs[exch] == null) {
                k++;
                exs[exch] = new Exch(exch);
            }

            int bestb = 0;
            int besta = 1001;

            for (int j = 0; j < 10; j++) {
                besta = Math.min(besta, bestAsk[j]);
                bestb = Math.max(bestb, bestBid[j]);
            }

            exs[exch].add(bid, ask);
            exs[10].add(bestb, besta);
        }

        String res[] = new String[k + 1];

        k = 0;
        for (int i = 0; i < exs.length; i++) {
            if (exs[i] != null) {
                res[k++] = exs[i].toString();
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Exch {
        int exch;
        int count;
        int spread;
        int bid;
        int ask;

        public Exch (int exch) {
            this.exch   = exch;
            this.count  = 0;
            this.spread = 0;
            this.bid    = 0;
            this.ask    = 0;
        }

        public void add(int b, int a) {
            if (b != bid || a != ask) {
                count++;
                bid    = b;
                ask    = a;
                spread += a - b;
            }
        }

        private double round(double n) {
            BigDecimal d = new BigDecimal(n);
            BigDecimal r = d.setScale(2, BigDecimal.ROUND_HALF_UP);
            return r.doubleValue();
        }

        public String toString() {
            double avg = round(spread / (double) count);
            DecimalFormat formatter = new DecimalFormat("0.00");
            return String.format("%s %s %s", exch, count, formatter.format(avg));
        }
    }
}
