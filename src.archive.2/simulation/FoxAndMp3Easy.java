package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 571 Division II Level Two - 500
// simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12437&rd=15491
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+571
public class FoxAndMp3Easy {
    public String[] playList(int n) {
        String[] all = new String[n];

        for (int i = 0; i < n; i++) {
            all[i] = (i + 1) + ".mp3";
        }

        Arrays.sort(all);

        if (n <= 50) {
            return all;
        } else {
            return Arrays.copyOfRange(all, 0, 50);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
