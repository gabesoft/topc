package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 381 Division II Level Three - 1000
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8419&rd=10804
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm381
public class TheNumbersLord {
    public String create(int[] numbers, int n) {
        int m = numbers.length;
        Num nums[] = new Num[m];

        for (int i = 0; i < m; i++) {
            nums[i] = new Num(numbers[i]);
        }

        Arrays.sort(nums);

        Val pick[] = new Val[n];
        for (int i = 0; i < n; i++) {
            pick[i] = i < m ? new Val(nums[i]) : new Val(nums[m - 1]);
        }

        Arrays.sort(pick);

        String res = "";
        for (int i = n - 1; i > -1; i--) {
            res += pick[i];
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Num implements Comparable<Num> {
        public final String value;

        public Num(int v) {
            value = v + "";
        }

        public int compareTo(Num other) {
            String o = other.value;
            return (value.length() == o.length()) ? value.compareTo(o) : value.length() - o.length();
        }

        public String toString() {
            return value;
        }
    }

    class Val implements Comparable<Val> {
        public final String value;

        public Val(Num n) {
            value = n.value;
        }

        public int  compareTo(Val other) {
            String o = other.value;
            String v = value;

            String a = o + v;
            String b = v + o;

            return b.compareTo(a);
        }

        public String toString() {
            return value;
        }
    }
}
