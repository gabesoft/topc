package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 270 Division I Level Three - 900
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4751&rd=8067
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm270
public class PackingShapes {
  int W;
  int H;

  public String[] tryToFit(int width, int height, String[] shapes) {
    W = width;
    H = height;

    String[] fit = new String[shapes.length];
    for (int i = 0; i < fit.length; i++) { 
      fit[i] = fits(shapes[i]);
    }

    return fit;
  }

  String fits(String shape) {
    String[] tokens = shape.split("\\s+");
    boolean fits = false;
    if (tokens[0].equals("CIRCLE")) {
      fits = circleFits(Integer.parseInt(tokens[1]));
    } else {
      int rw = Integer.parseInt(tokens[1]);
      int rh = Integer.parseInt(tokens[2]);
      fits = rectFits(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
    }
    return fits ? "YES" : "NO";
  }

  boolean circleFits(int radius) {
    return 2 * radius <= Math.min(W, H);
  }

  boolean rectFits(int width, int height) {
    return fitsHorizontal(width, height) || fitsVertical(width, height) || fitsRotated(width, height);
  }

  boolean fitsRotated(int width, int height) {
    double fw = Math.min(W, H);
    double fl = Math.max(W, H);
    double rw = Math.min(width, height);
    double rl = Math.max(width, height);

    double fr = Math.sqrt(fw * fw + fl * fl) / 2.0;
    double rr = Math.sqrt(rw * rw + rl * rl) / 2.0;

    if (rr >= fr) { 
      return false; 
    } else {
      double u = Math.sqrt(sq(rr) - sq(fw / 2.0));
      double v = Math.sqrt(sq(rr) - sq(fl / 2.0));
      double w = Math.sqrt(sq(fl / 2.0 - u) + sq(v - fw / 2.0));

      return rw <= w;
    }
  }

  boolean fitsVertical(int width, int height) {
    return width <= H && height <= W;
  }

  boolean fitsHorizontal(int width, int height) {
    return width <= W && height <= H;
  }

  double sq(double n) {
    return n * n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
