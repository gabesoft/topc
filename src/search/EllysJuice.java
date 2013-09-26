package topc.search;

import java.util.*;
import java.io.*;

// TCO12 Round 1A Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11843&rd=15090
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+1a
public class EllysJuice {
    public String[] getWinners(String[] players) {
        int n = players.length;
        if (n == 1) { return players; }

        Arrays.sort(players);

        int len = 0;
        for (int i = 0; i < n - 1; i++) {
            if (players[i].compareTo(players[i + 1]) == 0) {
                if (len == 0 || players[len - 1].compareTo(players[i]) != 0) {
                    players[len++] = players[i];
                }
            }
        }

        String[] r = new String[len];
        for (int i = 0; i < len; i++) {
            r[i] = players[i];
        }

        return r;
    }
}
