package topc.search;

import java.util.*;
import java.io.*;

// TCO12 Round 1A Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11843&rd=15090
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+1a
public class EllysJuice {
    int n;
    int[] perm;
    int level;
    String[] players;
    HashSet<String> winners;

    public String[] getWinners(String[] players) {
        n = players.length;

        this.players = players;
        this.winners = new HashSet<String>();
        this.perm    = new int[n];
        this.level   = -1;

        permute(0);

        String r[] = new String[winners.size()];
        int k = 0;

        for (String winner : winners) {
            r[k++] = winner;
        }

        Arrays.sort(r);

        return r;
    }

    private String getWinner(int[] perm) {
        int drinks[] = new int[] { 1 << (n + 1), 1 << (n + 1) };

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            int k = perm[i] - 1;
            String name = players[k];

            drinks[i % 2] /= 2;
            int amt = drinks[i % 2];

            if (!map.containsKey(name)) {
                map.put(name, 0);
            }
            map.put(name, map.get(name) + amt);
        }

        String winner = "";
        int best = 0;
        for (String name : map.keySet()) {
            if (map.get(name) > best) {
                best = map.get(name);
                winner = name;
            }
        }
        for (String name : map.keySet()) {
            if (name != winner && map.get(name) == best) {
                return null;
            }
        }

        return winner;
    }

    private void permute(int k) {
        level++;
        perm[k] = level;
        if (level == perm.length) {
            String winner = getWinner(perm);
            if (winner != null) {
                winners.add(winner);
            }
        } else {
            for (int i = 0; i < perm.length; i++) {
                if (perm[i] == 0) {
                    permute(i);
                }
            }
        }
        level--;
        perm[k] = 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
