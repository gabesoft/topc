package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 206 Division II Level Three - 1000
// recursion, simple math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2919&rd=5852
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm206
public class Untypeset {
    char[][] data;

    public int evaluate(String[] expression) {
        data = new char[expression.length][];

        for (int i = 0; i < data.length; i++) {
            data[i] = expression[i].toCharArray();
        }

        return extract(0, 0, data.length, data[0].length).eval();
    }

    private Expr extract(int row, int col, int rowCount, int colCount) {
        int n = row + rowCount;
        int m = col + colCount;

        for (int c = col; c < m; c++) {
            if (empty(row, c, rowCount)) {
                col++;
                colCount--;
            } else {
                break;
            }
        }

        for (int c = m - 1; c > col - 1; c--) {
            if (empty(row, c, rowCount)) {
                colCount--;
            } else {
                break;
            }
        }

        int plus = checkPlus(row, col, rowCount, colCount);
        if (plus > -1) {
            Expr left  = extract(row, col, rowCount, plus - col - 1);
            Expr right = extract(row, plus + 2, rowCount, colCount - (plus - col + 2));
            return new Expr("+", left, right);
        }

        int div = checkDiv(row, col, rowCount, colCount);
        if (div > -1) {
            Expr num = extract(row, col, div - row, colCount);
            Expr den = extract(div + 1, col, rowCount - (div - row + 1), colCount);
            return new Expr("/", num, den);
        }

        n = row + rowCount;
        m = col + colCount;

        String num = "";
        for (int i = row; i < n; i++) {
            for (int j = col; j < m; j++) {
                if (data[i][j] != ' ') {
                    num += data[i][j];
                }
            }
        }

        return new Expr(num, null, null);
    }

    private boolean empty(int row, int col, int rowCount) {
        int n = row + rowCount;
        for (int i = row; i < n; i++) {
            if (data[i][col] != ' ') {
                return false;
            }
        }
        return true;
    }

    private int checkDiv(int row, int col, int rowCount, int colCount) {
        int n = row + rowCount;
        int m = col + colCount;

        for (int i = row; i < n; i++) {
            if (data[i][col] == '-') {
                boolean found = true;
                for (int k = col; k < m; k++) {
                    if (data[i][k] != '-') {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;
    }

    private int checkPlus(int row, int col, int rowCount, int colCount) {
        int n = row + rowCount;
        int m = col + colCount;

        for (int i = row; i < n; i++) {
            for (int j = col; j < m; j++) {
                if (data[i][j] == '+') {
                    boolean found = true;
                    for (int k = row; k < n; k++) {
                        if (k != i && data[k][j] != ' ') {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Expr {
        String data;
        Expr e1;
        Expr e2;

        public Expr(String data, Expr e1, Expr e2) {
            this.data = data;
            this.e1   = e1;
            this.e2   = e2;
        }

        public int eval() {
            if (this.data.equals("+")) {
                return e1.eval() + e2.eval();
            }
            if (this.data.equals("/")) {
                return e1.eval() / e2.eval();
            }
            return Integer.parseInt(data);
        }
    }
}
