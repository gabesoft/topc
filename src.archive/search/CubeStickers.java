package topc.search;

import java.util.*;
import java.io.*;

// SRM 507 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11315&rd=14436
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+507
public class CubeStickers {
    public String isPossible(String[] sticker) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < sticker.length; i++) {
            String c = sticker[i];
            if (set.contains(c + 1) && set.contains(c + 2)) {
                continue;
            } else if (set.contains(c + 1)) {
                set.add(c + 2);
            } else {
                set.add(c + 1);
            }
        }
        return set.size() >= 6 ? "YES" : "NO";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
