package topc.easy;

import java.util.*;
import java.io.*;

// SRM 422 Division II Level Three - 1000
// brute force, string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10036&rd=13513
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm422
public class BirthdayCake {
    public int howManyFriends(String[] availableFruits, String[] friendsDislikings, int K) {
        int n = availableFruits.length;
        int m = friendsDislikings.length;

        HashSet<String> available = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            available.add(availableFruits[i]);
        }

        String dislikings[][] = new String[m][];
        for (int i = 0; i < m; i++) {
            String[] parts           = friendsDislikings[i].split("\\s+");
            ArrayList<String> fruits = new ArrayList<String>();

            for (int j = 0; j < parts.length; j++) {
                if (available.contains(parts[j])) {
                    fruits.add(parts[j]);
                }
            }

            dislikings[i] = toArray(fruits);
        }

        int best = 0;
        for (int i = 1; i < (1 << m); i++) {
            int next = Integer.bitCount(i);
            if (next > best) {
                HashSet<String> set = getSet(dislikings, i);
                if (canMake(availableFruits, set, K)) {
                    best = next;
                }
            }
        }

        return best;
    }

    boolean canMake(String[] fruits, HashSet<String> set, int k) {
        return fruits.length - set.size() >= k;
    }

    HashSet<String> getSet(String[][] data, int mask) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < data.length; i++) {
            if (((mask >> i) & 1) == 1) {
                String parts[] = data[i];
                for (int j = 0; j < parts.length; j++) {
                    set.add(parts[j]);
                }
            }
        }
        return set;
    }

    String[] toArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
