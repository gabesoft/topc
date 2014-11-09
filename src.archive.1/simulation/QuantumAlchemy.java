package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 344 Division I Level Two - 500
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7540&rd=10668
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm344
public class QuantumAlchemy {
    HashMap<Integer, String> map;
    int INF = 1000000000;
    int n   = 0;

    public int minSteps(String initial, String[] reactions) {
        map = new HashMap<Integer, String>();
        n   = initial.length();

        for (int i = 0; i < reactions.length; i++) {
            String parts[] = reactions[i].split("->");
            map.put((parts[1].charAt(0) - 'A'), parts[0]);
        }

        int data[] = new int[26];
        int need[] = new int[26];

        for (int i = 0; i < initial.length(); i++) {
            data[initial.charAt(i) - 'A']++;
        }

        need['X' - 'A'] = 1;

        int res = find(data, need, 1);

        return res >= INF ? -1 : res;
    }

    int find(int[] data, int[] need, int len) {
        if (len > n) { return INF; }

        int k = -1;
        for (int i = 0; i < need.length; i++) {
            if (need[i] > data[i]) {
                k = i;
                break;
            }
        }

        if (k == -1) { return 0; }

        need[k]--;

        String reaction = map.get(k);
        if (reaction != null) {
            int rlen = reaction.length();
            for (int i = 0; i < rlen; i++) {
                need[reaction.charAt(i) - 'A']++;
            }
            return 1 + find(data, need, len + rlen - 1);
        } else {
            return INF;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
