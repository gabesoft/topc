package topc.easy;

import java.util.*;
import java.io.*;

// SRM 243 Division II Level Three - 1000
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4004&rd=7218
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm243
public class FastSpider {
    public int findTime(double spiderSpeed, double manSpeed) {
        double t = (Math.exp(manSpeed / spiderSpeed) - 1) / manSpeed;
        return (int)Math.round(t);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
