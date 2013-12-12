package topc.math;

import java.util.*;
import java.io.*;

// TCO10 Qual 3 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10948&rd=14278
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Qualification+Round+3
public class SumRectangle {
    public int getCorner(int[] leftColumn, int[] topRow) {
        int n = topRow.length;
        int m = leftColumn.length;

        int row[] = topRow;
        for (int i = 1; i < m; i++) {
            int temp[] = new int[n];
            temp[0] = leftColumn[i];

            for (int j = 1; j < n; j++) {
                temp[j] = row[j - 1] - row[j] - temp[j - 1];
            }

            row = temp;
        }

        return row[n - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
