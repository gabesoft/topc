package topc.math;

import java.util.*;
import java.io.*;

// SRM 472 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10759&rd=14154
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+472
public class PotatoGame {
    public String theWinner(int n) {
        return ((n % 5) == 0 || (n % 5) == 2) ? "Hanako" : "Taro";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
