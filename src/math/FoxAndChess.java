package topc.math;

import java.util.*;
import java.io.*;

// SRM 590 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12725&rd=15702
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+590
public class FoxAndChess {
    public String ableToMove(String begin, String target) {
        ArrayList<Integer> x = extract(begin);
        ArrayList<Integer> y = extract(target);

        if (x.size() != y.size()) {
            return "Impossible";
        }

        for (int i = 0; i < x.size(); i++) {
            if (begin.charAt(x.get(i)) != target.charAt(y.get(i))) {
                return "Impossible";
            }
            if (begin.charAt(x.get(i)) == 'R' && y.get(i) < x.get(i)) {
                return "Impossible";
            }
            if (begin.charAt(x.get(i)) == 'L' && y.get(i) > x.get(i)) {
                return "Impossible";
            }
        }

        return "Possible";
    }

    private ArrayList<Integer> extract(String str) {
        ArrayList<Integer> seq = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                seq.add(i);
            }
        }
        return seq;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
