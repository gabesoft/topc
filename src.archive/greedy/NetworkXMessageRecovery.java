package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 516 Division II Level Three - 1000
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11239&rd=14541
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+516
public class NetworkXMessageRecovery {
    public String recover(String[] messages) {
        String topsort = "";
        int n          = messages.length;
        char INF       = '~';

        while (true) {
            char best = INF;
            for (int i = 0; i < n; i++) {
                if (messages[i].length() > 0) {
                    char ch = messages[i].charAt(0);

                    for (int j = 0; j < n; j++) {
                        for (int k = 1; k < messages[j].length(); k++) {
                            if (messages[j].charAt(k) == ch) {
                                ch = INF;
                            }
                        }
                    }

                    best = (char)Math.min(best, ch);
                }
            }

            if (best == INF) {
                break;
            }

            topsort += best;
            for (int i = 0; i < n; i++) {
                if (messages[i].length() > 0 && messages[i].charAt(0) == best) {
                    messages[i] = messages[i].substring(1);
                }
            }
        }

        return topsort;
    }
}
