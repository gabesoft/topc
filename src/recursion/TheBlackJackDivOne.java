package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 448 Division I Level One - 250
// recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10615&rd=13902
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+448
public class TheBlackJackDivOne {
    public double expected(String[] input) {
        int value   = 0;
        int rest    = 52;
        int cards[] = new int[10];

        Arrays.fill(cards, 4);
        cards[8] = 16;

        for (int i = 0; i < input.length; i++) {
            int v = cardValue(input[i].charAt(0));

            rest--;
            cards[v - 2]--;
            value += v;
        }

        return exp(cards, value, rest);
    }

    private double exp(int[] cards, int value, double rest) {
        if (value >= 21) { return 0; }

        double sum = 1;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] > 0) {
                double prob = cards[i] / rest;

                cards[i]--;

                sum += prob * exp(cards, value + (i + 2), rest - 1);

                cards[i]++;
            }
        }

        return sum;
    }

    private int cardValue(char c) {
        if (Character.isDigit(c)) {
            return c - '0';
        } else {
            return c == 'A' ? 11 : 10;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
