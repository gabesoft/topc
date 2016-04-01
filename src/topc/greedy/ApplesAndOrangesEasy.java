package topc.greedy;

import java.util.*;

// SRM 659 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13791&rd=16462
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+659
public class ApplesAndOrangesEasy {
    public int maximumApples(int N, int K, int[] info) {
        boolean[] apple = new boolean[N];
        for (int x : info) {
            apple[x - 1] = true;
        }

        int[] can = new int[N];
        Arrays.fill(can, K / 2);

        for (int i = 0; i < N; i++) {
            for (int j  = i; j < N && j < i + K; j++) {
                if (apple[j]) {
                    can[i]--;
                }
            }

            if (!apple[i]) {
                boolean ok = true;
                for (int j = Math.max(0, i - K + 1); j <= i; j++) {
                    if (can[j] == 0) {
                        ok = false;
                    }
                }
                if (ok) {
                    apple[i] = true;
                    for (int j = Math.max(0, i - K + 1); j <= i; j++) {
                        can[j]--;
                    }
                }
            }
        }

        int cnt = 0;
        for (boolean x : apple) {
            cnt += (x ? 1 : 0);
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
