package topc.math;

import java.util.*;
import java.io.*;

// SRM 577 Division I Level One - 250
// simple math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12514&rd=15497
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+577
public class EllysRoomAssignmentsDiv1 {
    public double getAverage(String[] ratings) {
        String all[] = join(ratings).split("\\s++");

        int values[] = new int[all.length];
        int N = values.length;

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(all[i]);
        }

        int ellyRating = values[0];

        Arrays.sort(values);
        reverse(values);

        int elly = 0;
        for (int i = 0; i < N; i++) {
            if (values[i] == ellyRating) {
                elly = i;
                break;
            }
        }

        int R = (N + 19) / 20;
        ArrayList<Double> avg = new ArrayList<Double>();

        int k = 0;
        while (k < N) {
            int j = Math.min(k + R, N);
            if (k <= elly && elly < j) {
                avg.add((double)ellyRating);
            } else {
                double sum = 0;
                for (int i = k; i < j; i++) {
                    sum += values[i];
                }
                avg.add(sum / (j - k));
            }
            k = j;
        }

        double sumAll = 0;
        for (int i = 0; i < avg.size(); i++) {
            sumAll += avg.get(i);
        }

        int T = N / R;
        double res = 0;

        if (N % R == 0) {
            res = sumAll / T;
        } else if (elly / R == T) {
            res = sumAll / (T + 1);
        } else {
            double p1 = (N % R) / (double)R;
            double p0 = 1 - p1;

            res = p1 * (sumAll / (T + 1))
                + p0 * (sumAll - avg.get(T)) / T;
        }

        return res;
    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
