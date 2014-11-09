package topc.math;

import java.util.*;
import java.io.*;

// SRM 622 Division II Level Three - 1000
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10554&rd=15855
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+622
public class Subsets {
    int[] numbers;
    int[] nextdiff;

    public int findSubset(int[] numbers) {
        Arrays.sort(numbers);

        int n = numbers.length;
        int[] nextdiff = new int[n];

        int t = n;
        nextdiff[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            if (numbers[i] != numbers[i + 1]) {
                t = i + 1;
            }
            nextdiff[i] = t;
        }

        this.numbers = numbers;
        this.nextdiff = nextdiff;

        return backtrack(0, 0, 1);
    }

    private int backtrack(int i, int s, int p) {
        if ((i == numbers.length) || (p * numbers[i] > s + numbers[i])) {
            return s > p ? 1 : 0;
        } else {
            return
                backtrack(i + 1, s + numbers[i], p * numbers[i]) +
                backtrack(nextdiff[i], s, p);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
