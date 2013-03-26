package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 293 Division I Level Two - 450
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4499&rd=9814
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm293
public class Bingo {
    public String winner(String[] card, String[] calls) {
        char[] top      = new char [] { 'B', 'I', 'N', 'G', 'O' };
        String[][] data = new String[5][5];
        BingoSeq[] seq  = new BingoSeq[12];

        for (int r = 1; r < card.length; r++) {
            String[] parts = card[r].trim().split("\\s+");

            for (int c = 0; c < parts.length; c++) {
                data[r - 1][c] = top[c] + parts[c];
            }
        }

        int k = 0;
        seq[k++] = new BingoSeq(new String[] { data[0][4], data[1][3], data[3][1], data[4][0] });
        seq[k++] = new BingoSeq(new String[] { data[0][0], data[1][1], data[3][3], data[4][4] });
        seq[k++] = new BingoSeq(new String[] { data[2][0], data[2][1], data[2][3], data[2][4] });
        seq[k++] = new BingoSeq(new String[] { data[0][2], data[1][2], data[3][2], data[4][2] });

        for (int i = 0; i < data.length; i++) {
            if (i == 2) { continue; }

            seq[k++] = new BingoSeq(data[i]);

            String[] col = new String[5];
            for (int j = 0; j < data[i].length; j++) {
                col[j] = data[j][i];
            }

            seq[k++] = new BingoSeq(col);
        }

        String[] res = new String[calls.length];
        boolean done = false;
        for (int i = 0; i < calls.length; i++) {
            for (int j = 0; j < seq.length; j++) {
                seq[j].check(calls[i], i);

                if (seq[j].complete()) {
                    res[seq[j].first] = seq[j].toString();
                    done = true;
                }
            }

            if (done) {
                break;
            }
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] != null) {
                return res[i];
            }
        }

        return "YOU LOSE";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class BingoSeq {
        public String[] cards;
        public int first;
        private HashMap<String, Boolean> map;
        private int count;

        public BingoSeq(String[] cards) {
            this.cards = new String[cards.length];
            this.map   = new HashMap<String, Boolean>();
            this.count = 0;

            for (int i = 0; i < cards.length; i++) {
                map.put(cards[i], false);
            }
        }

        public void check(String card, int k) {
            if (map.containsKey(card) && !map.get(card)) {
                if (count == 0) { first = k; }
                cards[count++] = card;
                map.put(card, true);
            }
        }

        public boolean complete() {
            return count == cards.length;
        }

        public String toString() {
            String s = "";
            for (int i = 0; i < cards.length; i++) {
                s += cards[i];
                if (i < cards.length - 1) {
                    s += ",";
                }
            }
            return s;
        }
    }
}
