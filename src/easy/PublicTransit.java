package topc.easy;

import java.util.*;
import java.io.*;

// SRM 659 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13793&rd=16462
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+659
public class PublicTransit {
    public int minimumLongestDistance(int R, int C) {
        return (Math.min(R, C) + (Math.max(R, C) >> 1) + (Math.max(R, C) % 2)) - 2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
