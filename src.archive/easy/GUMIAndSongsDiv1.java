package topc.easy;

import java.util.*;
import java.io.*;

// SRM 588 Division I Level One - 250
// brute force, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12706&rd=15700
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+588
public class GUMIAndSongsDiv1 {
    int n;
    Tune[] tunes;

    public int maxSongs(int[] duration, int[] tone, int T) {
        n     = duration.length;
        tunes = new Tune[n];

        for (int i = 0; i < n; i++) {
            tunes[i] = new Tune(duration[i], tone[i]);
        }

        Arrays.sort(tunes, new Comparator<Tune>() {
            @Override
            public int compare(Tune t1, Tune t2) {
                return t1.tone - t2.tone;
            }
        });

        int best = 0;
        for (int first = 0; first < n; first++) {
            for (int last = first; last < n; last++) {
                int timeLeft = T - (tunes[last].tone - tunes[first].tone);
                if (timeLeft < 0) { continue; }

                Tune[] curr = new Tune[last - first + 1];
                System.arraycopy(tunes, first, curr, 0, curr.length);

                Arrays.sort(curr, new Comparator<Tune>() {
                    @Override
                    public int compare(Tune t1, Tune t2) {
                        return t1.duration - t2.duration;
                    }
                });

                int count = 0;
                for (Tune t : curr) {
                    if (t.duration <= timeLeft) {
                        timeLeft -= t.duration;
                        count++;
                    } else {
                        break;
                    }
                }

                best = Math.max(best, count);
            }
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Tune {
        public final int duration;
        public final int tone;

        public Tune(int d, int t) {
            duration = d;
            tone     = t;
        }
    }
}
