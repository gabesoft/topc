package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 151 Division I Level Two - 500
// simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1705&rd=4560
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm151
public class MergeSort {
    int count;
    public int howManyComparisons(int[] numbers) {
        count = 0;
        sort(numbers);
        return count;
    }

    private int[] sort(int[] numbers) {
        if (numbers.length <= 1) { return numbers; }

        int n   = numbers.length;
        int[] a = new int [n / 2];
        int[] b = new int [n - a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = numbers[i];
        }
        for (int i = a.length; i < n; i++) {
            b[i - a.length] = numbers[i];
        }

        int[] sa = sort(a);
        int[] sb = sort(b);

        return merge(sa, sb);
    }

    private int[] merge(int[] a, int[] b) {
        int[] sorted = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            count++;
            if (a[i] < b[j]) {
                sorted[k++] = a[i++];
            } else if (a[i] > b[j]) {
                sorted[k++] = b[j++];
            } else {
                sorted[k++] = a[i++];
                sorted[k++] = b[j++];
            }
        }

        while (i < a.length) {
            sorted[k++] = a[i++];
        }
        while (j < b.length) {
            sorted[k++] = b[j++];
        }

        return sorted;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
