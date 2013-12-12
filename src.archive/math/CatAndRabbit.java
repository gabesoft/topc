package topc.math;

import java.util.*;
import java.io.*;

// SRM 558 Division II Level Three - 900
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12187&rd=15180
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+558
public class CatAndRabbit {
    public String getWinner(String tiles) {
        if (tiles.indexOf('#') == -1) { return "Rabbit"; }

        String white[] = tiles.split("#+");

        int n = 0;
        for (int i = 0; i < white.length; i++) {
            n ^= white[i].length();
        }

        return n == 0 ? "Rabbit" : "Cat";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
