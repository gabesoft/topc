package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 216 Division II Level Three - 1000
// recursion, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2985&rd=5862
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm216
public class TournamentRanker {
    public String[] rankTeams(String[] names, String[] lostTo) {
        int n = names.length;

        Player players[] = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(names[i], lostTo);
        }
        for (int i = 0; i < n; i++) {
            players[i].populateLostTo(i, lostTo, players);
        }

        Arrays.sort(players);

        String sorted[] = new String[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = players[i].name;
        }

        return sorted;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Player implements Comparable<Player> {
        public final String name;
        private int wins;
        private Player lostTo;

        public Player(String name, String[] lostTo) {
            this.name = name;
            this.wins = 0;

            for (int i = 0; i < lostTo.length; i++) {
                if (lostTo[i].equals(name)) {
                    wins++;
                }
            }
        }

        public void populateLostTo(int index, String[] lostTo, Player[] players) {
            for (int i = 0; i < lostTo.length; i++) {
                if (players[i].name.equals(lostTo[index])) {
                    this.lostTo = players[i];
                    break;
                }
            }
        }

        public int compareTo(Player o) {
            return wins != o.wins ? o.wins - wins : lostTo.compareTo(o.lostTo);
        }
    }
}
