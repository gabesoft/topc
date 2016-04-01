package topc.search;

import java.util.*;

// SRM 645 Division II Level Two - 500
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13602&rd=16277
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+645
public class ConnectingCars {
    public long minimizeCost(int[] positions, int[] lengths) {
        long best  = -1;
        int n      = lengths.length;
        Car cars[] = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(positions[i], lengths[i]);
        }

        Arrays.sort(cars);

        for (int i = 0; i < n; i++) {
            long cost = 0;
            long last = 0;
            Car c = cars[i];

            last = c.x;
            for (int j = i - 1; j > -1; j--) {
                cost += (last - (cars[j].x + cars[j].l));
                last -= cars[j].l;
            }

            last = c.x + c.l;
            for (int j = i + 1; j < n; j++) {
                cost += (cars[j].x - last);
                last += cars[j].l;
            }

            if (best == -1) {
                best = cost;
            } else {
                best = Math.min(best, cost);
            }
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Car implements Comparable<Car>  {
        public int x;
        public int l;

        public Car (int x, int l) {
            this.x = x;
            this.l = l;
        }

        @Override
		public int compareTo(Car o) {
            return this.x - o.x;
        }

        @Override
		public String toString() {
            return x + "," + l;
        }
    }
}
