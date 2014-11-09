package topc.easy;

import java.util.*;
import java.io.*;

// SRM 629 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13363&rd=16060
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+629
public class RectangleCoveringEasy {
    public int solve(int holeH, int holeW, int boardH, int boardW) {
        if (boardH > holeH && boardW > holeW) { return 1; }
        if (boardH > holeW && boardW > holeH) { return 1; }
        if (boardH >= holeH && boardW > holeW) { return 1; }
        if (boardH >= holeW && boardW > holeH) { return 1; }
        if (boardH > holeH && boardW >= holeW) { return 1; }
        if (boardH > holeW && boardW >= holeH) { return 1; }
        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
