package topc.graph;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 247 Division I Level Two - 500
// graph theory, sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=875&rd=7222
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm247
public class WordTrain {
    public String hookUp(String[] input) {
        int n = input.length;

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            String car = input[i];
            String rac = reverse(car);
            char s = car.charAt(0);
            char e = car.charAt(car.length() - 1);

            if (s > e || (s == e && rac.compareTo(car) < 0)) {
                cars[i] = new Car(rac);
            } else {
                cars[i] = new Car(car);
            }
        }

        Arrays.sort(cars);

        String best[] = new String[n];
        String res    = null;

        for (int i = 0; i < n; i++) {
            best[i] = cars[i].value;
            for (int j = 0; j < i; j++) {
                if (cars[i].s == cars[j].e) {
                    best[i] = better(best[i], best[j] + "-" + cars[i].value);
                }
            }
            res = better(res, best[i]);
        }

        return res;
    }

    private String better(String s1, String s2) {
        if (s1 == null) { return s2; }

        int l1 = s1.split("-").length;
        int l2 = s2.split("-").length;

        if (l1 != l2) {
            return l1 > l2 ? s1 : s2;
        } else {
            return s1.compareTo(s2) < 0 ? s1 : s2;
        }
    }

    private String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Car implements Comparable<Car> {
        public final String value;
        public final char s;
        public final char e;

        public Car(String v) {
            value = v;
            s = v.charAt(0);
            e = v.charAt(v.length() - 1);
        }

        public int compareTo(Car other) {
            if (s != other.s) { return s - other.s; }
            if (s == e && other.s != other.e) { return -1; }
            if (s != e && other.s == other.e) { return  1; }
            return value.compareTo(other.value);
        }

        public String toString() {
            return value;
        }
    }
}
