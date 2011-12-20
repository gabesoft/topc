package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 235 Division I Level Three - 900
// geometry, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4022&rd=6534
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm235
public class RemoteRover {
  int[] width;
  int[] speed;
  int n;

  public double optimalTravel(int[] width, int[] speed, int offset) {
    this.n = width.length;
    this.width = width;
    this.speed = speed;

    double[] theta = calcTheta(offset);
    double time = calcTime(theta);

    return time;
  }

  double[] calcTheta(double offset) {
    double[] theta = new double[n];

    if (offset == 0) { return theta; }

    double lo = 0.0;
    double hi = 90.0;

    int count = 0;
    while (count++ < 100) {
      double mid = lo + (hi - lo) / 2.0;

      theta[0] = sin(mid);
      for (int i = 1; i < n; i++) {
        theta[i] = theta[i - 1] * (speed[i] / (double)speed[i - 1]);
      }

      if (calcOffset(theta) > offset) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    return theta;
  }

  double calcTime(double[] theta) {
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      double ts = theta[i] * theta[i];
      double ws = width[i] * width[i];
      double dx = (ts * ws) / (1.0 - ts);
      sum += Math.sqrt(dx + ws) / speed[i];
    }
    return sum;
  }

  double calcOffset(double[] theta) {
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += theta[i] * width[i] / Math.sqrt(1.0 - theta[i] * theta[i]);
    }
    return Double.isNaN(sum) ? Double.MAX_VALUE / 2.0 : sum;
  }

  double sin(double deg) {
    return Math.sin(Math.toRadians(deg));
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
