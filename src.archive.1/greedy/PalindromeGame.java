package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 499 Division II Level Three - 950
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11331&rd=14428
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+499
public class PalindromeGame {
    public int getMaximum(String[] front, int[] back) {
        int n            = front.length;
        boolean picked[] =  new boolean[n];
        Card cards[]     = new Card[n];

        for (int i = 0; i < n; i++) {
            cards[i] = new Card(front[i], back[i]);
        }

        Arrays.sort(cards);

        for (int i = 0; i < n; i++) {
            if (picked[i]) { continue; }
            for (int j = 0; j < n; j++) {
                if (picked[j]) { continue; }
                if (i != j && pali(cards[i].f + cards[j].f)) {
                    picked[i] = true;
                    picked[j] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!picked[i]) {
                if (pali(cards[i].f)) {
                    picked[i] = true;
                    break;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (picked[i]) {
                sum += cards[i].b;
            }
        }

        return sum;
    }

    boolean pali(String s) {
        int n = s.length();

        if (n <= 1) { return true; }

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Card implements Comparable<Card> {
        public String f;
        public int b;

        public Card(String f, int b) {
            this.f = f;
            this.b = b;
        }

        public int compareTo(Card other) {
            return Integer.valueOf(other.b).compareTo(b);
        }
    }
}
