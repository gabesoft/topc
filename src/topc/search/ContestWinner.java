package topc.search;

import java.util.*;

// SRM 546 Division II Level One - 250
// simple search, iteration, simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12048&rd=14738
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+546
public class ContestWinner {
    public int getWinner(int[] events) {
        int tasks[] = new int[1000001];
        int last[] = new int[1000001];

        for (int i = 0; i < events.length; i++) {
            tasks[events[i]]++;
            last[events[i]] = i;
        }

        int most = -1;
        int task = -1;

        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] > most) {
                most = tasks[i];
                task = i;
            } else if (tasks[i] == most && last[i] < last[task]) {
                task = i;
            }
        }

        return task;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
