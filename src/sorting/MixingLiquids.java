package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 355 Division I Level One - 300
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7886&rd=10712
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm355
public class MixingLiquids {
    double EPS = 10e-15;

    public double howMuch(int[] percent, int[] amount, int need) {
        long totalSubst  = 0;
        long totalAmount = 0;
        int n            = percent.length;

        Solution sol[] = new Solution[n];

        for (int i = 0; i < n; i++) {
            totalSubst  += amount[i] * percent[i];
            totalAmount += amount[i];
            sol[i] = new Solution(percent[i], amount[i]);
        }

        Arrays.sort(sol);

        int i1 = 0;
        int i2 = n -1;
        while (i1 <= i2) {
            if (totalSubst == need * totalAmount) { return totalAmount; }

            if (totalSubst < need * totalAmount) {
                long ntotalSubst  = totalSubst - sol[i1].amount * sol[i1].percent;
                long ntotalAmount = totalAmount - sol[i1].amount;

                if (ntotalSubst > need * ntotalAmount) {
                    return (double)(sol[i1].percent * ntotalAmount - ntotalSubst) / (sol[i1].percent - need);
                } else {
                    totalSubst  = ntotalSubst;
                    totalAmount = ntotalAmount;
                    i1++;
                }
            }

            if (totalSubst > need * totalAmount) {
                long ntotalSubst  = totalSubst - sol[i2].amount * sol[i2].percent;
                long ntotalAmount = totalAmount - sol[i2].amount;

                if (ntotalSubst < need * ntotalAmount) {
                    return (double)(sol[i2].percent * ntotalAmount - ntotalSubst) / (sol[i2].percent - need);
                } else {
                    totalSubst  = ntotalSubst;
                    totalAmount = ntotalAmount;
                    i2--;
                }
            }
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Solution implements Comparable<Solution> {
        public final int percent;
        public final int amount;

        public Solution(int percent, int amount) {
            this.percent = percent;
            this.amount  = amount;
        }

        public int compareTo(Solution other) {
            //return percent == other.percent ? other.amount - amount : percent - other.percent;
            return percent == other.percent ? amount - other.amount : percent - other.percent;
        }

        public String toString() {
            return String.format("%s%%:%s", percent, amount);
        }
    }
}
