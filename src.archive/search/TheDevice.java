package topc.search;

import java.util.*;
import java.io.*;

// SRM 569 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12388&rd=15489
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+569
public class TheDevice {
    public int minimumAdditional(String[] plates) {
        int n = plates[0].length();

        int need = 0;
        for (int i = 0; i < n; i++) {
            int z = 0;
            for (int j = 0; j < plates.length; j++) {
                if (plates[j].charAt(i) == '0') {
                    z++;
                }
            }

            int o = plates.length - z;
            int x = 2 - Math.min(2, o) + 1 - Math.min(1, z);
            need = Math.max(need, x);
        }

        return need;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
