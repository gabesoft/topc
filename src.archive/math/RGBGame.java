package topc.math;

import java.util.*;
import java.io.*;

// TCO11 Semifinal 2 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11559&rd=14650
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class RGBGame {
    int n;

    public double[] probabilities(String[] board) {
        n = board.length;

        double probNoFullRedRows = 1;
        for (int i = 0; i < n; i++) {
            probNoFullRedRows *= (1.0 - probAllR(board, i));
        }

        double probEveryRowHasBlue = 1;
        for (int i = 0; i < n; i++) {
            probEveryRowHasBlue *= (1.0 - probNoB(board, i));
        }

        return new double [] { 1.0 - probNoFullRedRows, probEveryRowHasBlue };
    }

    private double probNoB(String[] board, int row) {
        double prob = 1;

        for (int i = 0; i < n; i++) {
            if (board[row].charAt(i) == '?') {
                prob *= 2.0;
                prob /= 3.0;
            } else if (board[row].charAt(i) == 'B') {
                return 0;
            }
        }

        return prob;
    }

    private double probAllR(String[] board, int row) {
        double prob = 1;

        for (int i = 0; i < n; i++) {
            if (board[row].charAt(i) == '?') {
                prob /= 3.0;
            } else if (board[row].charAt(i) != 'R') {
               return 0;
            }
        }

        return prob;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
