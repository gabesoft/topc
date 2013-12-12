package topc.search;

import java.util.*;
import java.io.*;

// TCO11 Round 1 Division I Level One - 250
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11374&rd=14560
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Online+Round+1
public class TripleStrings {
    public int getMinimumOperations(String init, String goal) {
        int n = init.length();

        for (int i = 0; i < n; i++) {
            if (goal.startsWith(init.substring(i))) {
                return i * 2;
            }
        }

        return n * 2;
    }
}
