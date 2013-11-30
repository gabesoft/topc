package topc.dynamic;

import java.util.*;
import java.io.*;

// Member Single Round Match 474 Division I Level One - 250
// dynamic programming, encryption/compression
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10804&rd=14185
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class RouteIntersection {
    public String isValid(int N, int[] coords, String moves) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = coords.length;
        int[] path = new int[n];

        int id = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(coords[i])) {
                map.put(coords[i], id++);
            }
            path[i] = map.get(coords[i]);
        }

        HashSet<String> set = new HashSet<String>();
        int[] vect = new int[map.size()];

        set.add(Arrays.toString(vect));

        for (int i = 0; i < moves.length(); i++) {
            int c = map.get(coords[i]);
            int d = moves.charAt(i) == '-' ? -1 : +1;

            vect[c] += d;

            String key = Arrays.toString(vect);
            if (set.contains(key)) {
                return "NOT VALID";
            }
            set.add(key);
        }

        return "VALID";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
