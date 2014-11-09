package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 164 Division I Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1856&rd=4625
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm164
public class WhatSort {
    public String sortType(String[] name, int[] age, int[] wt) {
        int n = name.length;

        Record[] original = new Record[n];
        for (int i = 0; i < n; i++) {
            original[i] = new Record(name[i], age[i], wt[i]);
        }

        Record[] sorted = original.clone();
        String method   = "NOT";

        method = sortAndCompare(original, sorted, method, new RecordCompare("NAW"));
        method = sortAndCompare(original, sorted, method, new RecordCompare("NWA"));
        method = sortAndCompare(original, sorted, method, new RecordCompare("ANW"));
        method = sortAndCompare(original, sorted, method, new RecordCompare("AWN"));
        method = sortAndCompare(original, sorted, method, new RecordCompare("WAN"));
        method = sortAndCompare(original, sorted, method, new RecordCompare("WNA"));

        return method;
    }

    private String sortAndCompare(Record[] original, Record[] sorted, String method, RecordCompare comp) {
        Arrays.sort(sorted, comp);
        if (arraysEqual(original, sorted)) {
            return method.equals("NOT") ? comp.order : "IND";
        } else {
            return method;
        }
    }

    private boolean arraysEqual(Record[] a1, Record[] a2) {
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].toString().equals(a2[i].toString())) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class RecordCompare implements Comparator<Record> {
        public final String order;

        public RecordCompare(String order) {
            this.order = order;
        }

        public int compare(Record x, Record y) {
            int[] data = new int[3];
            data[0] = x.name.compareTo(y.name);
            data[1] = x.age - y.age;
            data[2] = y.weight - x.weight;
            return compare(data);
        }

        private int compare(int[] data) {
            int d0 = code(order.charAt(0));
            int d1 = code(order.charAt(1));
            int d2 = code(order.charAt(2));

            if (data[d0] != 0) { return data[d0]; }
            if (data[d1] != 0) { return data[d1]; }
            if (data[d2] != 0) { return data[d2]; }

            return 0;
        }

        private int code(char c) {
            if (c == 'N') { return 0; }
            if (c == 'A') { return 1; }
            if (c == 'W') { return 2; }
            return -1;
        }
    }

    public class Record {
        public final String name;
        public final int age;
        public final int weight;

        public Record(String name, int age, int weight) {
            this.name   = name;
            this.age    = age;
            this.weight = weight;
        }

        public String toString() {
            return String.format("%s:(%s,%s)", name, age, weight);
        }
    }
}
