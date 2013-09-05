package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 549 Division I Level One - 250
// geometry, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11965&rd=15171
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+549
public class PointyWizardHats {
    public int getNumHats(int[] topHeight, int[] topRadius, int[] bottomHeight, int[] bottomRadius) {
        int n = topHeight.length;
        int m = bottomHeight.length;

        Cone[] tops = new Cone[n];
        Cone[] bots = new Cone[m];

        for (int i = 0; i < n; i++) {
            tops[i] = new Cone(topHeight[i], topRadius[i]);
        }
        for (int i = 0; i < m; i++) {
            bots[i] = new Cone(bottomHeight[i], bottomRadius[i]);
        }

        Arrays.sort(tops, new Comparator<Cone>() {
            @Override
            public int compare(Cone a, Cone b) {
                return a.radius == b.radius ? a.height - b.height : b.radius - a.radius;
            }
        });

        Arrays.sort(bots, new Comparator<Cone>() {
            @Override
            public int compare(Cone a, Cone b) {
                double ratioA = a.height / (double) a.radius;
                double ratioB = b.height / (double) b.radius;
                return Double.valueOf(ratioB).compareTo(ratioA);
            }
        });

        int count = 0;

        boolean[] taken = new boolean[m];
        for (int i = 0; i < n; i++) {
            Cone top = tops[i];
            for (int j = 0; j < m; j++) {
                if (!taken[j] && top.canTop(bots[j])) {
                    taken[j] = true;
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Cone {
        public final int radius;
        public final int height;

        public Cone(int h, int r) {
            radius = r;
            height = h;
        }

        public boolean canTop(Cone bottom) {
            return bottom.radius > radius && radius * bottom.height < bottom.radius * height;
        }

        public String toString() {
            return String.format("%s:%s", radius, height);
        }
    }
}
