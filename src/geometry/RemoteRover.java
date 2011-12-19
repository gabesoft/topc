package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 235 Division I Level Three - 900
// geometry, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4022&rd=6534
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm235
public class RemoteRover {
  static public final double R = 0.61803399;
  static public final double C = 1.0 - R;
  int[] width;
  int[] speed;
  double[][] memo;
  int n;

  public double optimalTravel(int[] width, int[] speed, int offset) {
    this.n = width.length;
    this.width = width;
    this.speed = speed;
    this.memo = new double[n + 1][offset + 1];

    //debug(n, width, speed);
    return calcRaw(0, offset);

    //return calc(0, offset);
  }

  double calcRaw(int index, int offset) {
    if (memo[index][offset] > 0.0) { return memo[index][offset]; }
    if (index  == n - 1) { return time(index, offset); }
    if (offset == 0.0)   { return time(index, offset) + calcRaw(index + 1, offset); }

    double best = Double.MAX_VALUE / 2.0;
    int lo = 0;
    int hi = offset;
    while (lo < hi) {
      int mid = (hi + lo) / 2;
      double cur = time(index, mid) + calcRaw(index + 1, offset - mid);

      if (cur < best) {
        best = cur;
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    memo[index][offset] = best;
    return best;
  }

  double calc(int index, double offset) {
    if (index  == n - 1) { return time(index, offset); }
    if (offset == 0.0)   { return time(index, offset) + calc(index + 1, offset); }

    //double raw = memo[index][(int)offset];

    double er = 7.0e-4;

    double ax = 0.0;
    double cx = offset;
    double bx = ax + (cx - ax) / 2.0;

    double x0 = ax;
    double x1;
    double x2;
    double x3 = cx;

    if (Math.abs(cx - bx) > Math.abs(bx - ax)) {
      x1 = bx;
      x2 = bx + C * (cx - bx);
    } else {
      x2 = bx;
      x1 = bx - C * (bx - ax);
    }

    double f1 = func(x1, offset, index);
    double f2 = func(x2, offset, index);

    int count = 0;
    while (Math.abs(x3 - x0) > er * (Math.abs(x1) + Math.abs(x2))) {
      count++;
      if (f2 < f1) {
        x0 = x1;
        x1 = x2;
        x2 = R * x2 + C * x3;
        f1 = f2;
        f2 = func(x2, offset, index);
      } else {
        x3 = x2;
        x2 = x1;
        x1 = R * x1 + C * x0;
        f2 = f1;
        f1 = func(x1, offset, index);
      }
    }

    return f1 < f2 ? f1 : f2;

    //double best = Double.MAX_VALUE / 2.0;
    //double lo = 0.0;
    //double hi = offset;
    //while (true) {
    //double mid = lo + (hi - lo) / 2.0;
    //double cur = time(index, mid) + calc(index + 1, offset - mid);

    //if (Math.abs(cur - best) < 1.0e-12) { break; }

    //if (cur < best) {
    //best = cur;
    //hi = mid;
    //} else {
    //lo = mid;
    //}
    //}

    //return best;
  }

  double func(double x, double offset, int index) {
    assert x > 0.0    : "negative x";
    assert x < offset : "x greater than offset";
    return time(index, x) + calc(index + 1, offset - x);
  }

  double time(int index, double offset) {
    double dist = Math.sqrt(offset * offset + width[index] * width[index]);
    return dist / speed[index];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
