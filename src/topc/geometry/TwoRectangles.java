package topc.geometry;

import java.util.*;

// SRM 546 Division II Level Two - 550
// geometry, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12046&rd=14738
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+546
public class TwoRectangles {
    public String describeIntersection(int[] A, int[] B) {
        boolean ix = intersect(A[0], A[2], B[0], B[2]);
        boolean iy = intersect(A[1], A[3], B[1], B[3]);
        boolean tx = touch(A[0], A[2], B[0], B[2]);
        boolean ty = touch(A[1], A[3], B[1], B[3]);

        if (ix && iy) {
            return "rectangle";
        } else if (tx && ty) {
            return "point";
        } else if ((ix && ty) || (iy && tx)) {
            return "segment";
        } else {
            return "none";
        }
    }

    private boolean intersect(int a, int b, int x, int y) {
        return x < b && a < y;
    }

    private boolean touch(int a, int b, int x, int y) {
        return a == y || b == x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
