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

        //debug("ORG", sorted);

        String method = "NOT";

        Arrays.sort(sorted, new Naw());
        if (arraysEqual(original, sorted)) {
            method = method.equals("NOT") ? "NAW" : "IND";
        }
        Arrays.sort(sorted, new Nwa());
        if (arraysEqual(original, sorted)) {
            method = method.equals("NOT") ? "NWA" : "IND";
        }
        Arrays.sort(sorted, new Anw());
        if (arraysEqual(original, sorted)) {
            method = method.equals("NOT") ? "ANW" : "IND";
        }
        Arrays.sort(sorted, new Awn());
        if (arraysEqual(original, sorted)) {
            method = method.equals("NOT") ? "AWN" : "IND";
        }
        Arrays.sort(sorted, new Wan());
        if (arraysEqual(original, sorted)) {
            method = method.equals("NOT") ? "WAN" : "IND";
        }
        Arrays.sort(sorted, new Wna());
        if (arraysEqual(original, sorted)) {
            method = method.equals("NOT") ? "WNA" : "IND";
        }

        return method;
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

    public class Wna implements Comparator<Record> {
        public int compare(Record x, Record y) {
            int w = y.weight - x.weight;
            if (w != 0) { return w; }
            int n = x.name.compareTo(y.name);
            if (n != 0) { return n; }
            int a = x.age - y.age;
            if (a != 0) { return a; }
            return 0;
        }
    }

    public class Wan implements Comparator<Record> {
        public int compare(Record x, Record y) {
            int w = y.weight - x.weight;
            if (w != 0) { return w; }
            int a = x.age - y.age;
            if (a != 0) { return a; }
            int n = x.name.compareTo(y.name);
            if (n != 0) { return n; }
            return 0;
        }
    }

    public class Awn implements Comparator<Record> {
        public int compare(Record x, Record y) {
            int a = x.age - y.age;
            if (a != 0) { return a; }
            int w = y.weight - x.weight;
            if (w != 0) { return w; }
            int n = x.name.compareTo(y.name);
            if (n != 0) { return n; }
            return 0;
        }
    }

    public class Anw implements Comparator<Record> {
        public int compare(Record x, Record y) {
            int a = x.age - y.age;
            if (a != 0) { return a; }
            int n = x.name.compareTo(y.name);
            if (n != 0) { return n; }
            int w = y.weight - x.weight;
            if (w != 0) { return w; }
            return 0;
        }
    }

    public class Nwa implements Comparator<Record> {
        public int compare(Record x, Record y) {
            int n = x.name.compareTo(y.name);
            if (n != 0) { return n; }
            int w = y.weight - x.weight;
            if (w != 0) { return w; }
            int a = x.age - y.age;
            if (a != 0) { return a; }
            return 0;
        }
    }

    public class Naw implements Comparator<Record> {
        public int compare(Record x, Record y) {
            int n = x.name.compareTo(y.name);
            if (n != 0) { return n; }
            int a = x.age - y.age;
            if (a != 0) { return a; }
            int w = y.weight - x.weight;
            if (w != 0) { return w; }
            return 0;
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
