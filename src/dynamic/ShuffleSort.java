package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 568 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11156&rd=15488
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+568
public class ShuffleSort {
    public double shuffle(int[] cards) {
        Arrays.sort(cards);
        reverse(cards);

        double f = 1;
        double t = 1;

        for (int i = 2; i <= cards.length; i++) {
            if (cards[i - 1] == cards[i - 2]) {
                t = t + 1.0;
            } else {
                t = 1.0;
            }
            f = i / t + f - 1;
        }

        return f;
    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
