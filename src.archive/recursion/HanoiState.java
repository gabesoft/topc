package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 378 Division II Level Three - 1000
// recursion, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8303&rd=10798
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm378
public class HanoiState {
    int other[][] = new int[][] { 
        { 0, 2, 1 }, 
        { 2, 0, 0 }, 
        { 1, 0, 0 } 
    };

    public String partwayState(String target, int moves) {
        int n        = target.length();
        char state[] = new char[n];
        char goal[]  = target.toCharArray();

        Arrays.fill(state, 'A');

        for (int i = n - 1; i > -1; i--) {
            if (moves == 0) { return new String(state); }
            if (goal[i] == state[i]) { continue; }

            int k = (1 << i);
            
            if (k <= moves) {
                for (int j = 0; j < i; j++) {
                    state[j] = (char)('A' + other[state[i] - 'A'][goal[i] - 'A']);
                }
                state[i] = goal[i];
                moves -= k;
            } else {
                for (int j = 0; j < i; j++) {
                    goal[j] = (char)('A' + other[state[i] - 'A'][goal[i] - 'A']);
                }
            }
        }

        return new String(state);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
