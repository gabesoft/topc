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

        String[] parts = tiles.split("#+");

        int a[] = new int[parts.length];
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = parts[i].length();
            xor ^= parts[i].length();
        }

        return xor == 0 ? "Rabbit" : "Cat";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
