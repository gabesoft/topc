package topc.math;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 267 Division I Level Three - 1000
// math, simulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4721&rd=8000
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm267
public class HairCuts {
  public double maxCut(String[] enter, String lastExit) {
    Calendar[] dates = new Calendar[enter.length + 1];

    dates[0] = parseDate(lastExit);
    for (int i = 0; i < enter.length; i++) {
      dates[i + 1] = parseDate(enter[i]);
    }

    double[] mins = getMins(dates);

    double lo = 5;
    double hi = 24 * 60;
    int count = 0;

    while (count++ < 200) {
      double mid = lo + (hi - lo) / 2.0;
      double val = calc(mins, mid);
      if (val < 1.0e-15) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    double dx = calc(mins, lo);
    return dx >= 0 ? lo : -1;
  }

  double calc(double[] mins, double time) {
    mins = mins.clone();

    for (int i = 1; i < mins.length - 1; i++) {
      if (mins[i] - mins[i - 1] < time) {
        mins[i] = mins[i - 1] + time;
      }
    }

    double dx = mins[mins.length - 1] - mins[mins.length - 2];
    return dx - time;
  }

  double[] getMins(Calendar[] dates) {
    Arrays.sort(dates);
    double[] mins = new double[dates.length];
    for (int i = 1; i < dates.length; i++) {
      mins[i] = dates[i].getTimeInMillis() - dates[0].getTimeInMillis();
      mins[i] = mins[i] / (60 * 1000);
    }
    return mins;
  }

  Calendar parseDate(String date) {
    try {
      DateFormat formatter = new SimpleDateFormat("hh:mm a");
      boolean am = date.startsWith("09") || date.startsWith("10") || date.startsWith("11");
      date = date + (am ? " AM" : " PM");
      Calendar cal = Calendar.getInstance();
      cal.setTime(formatter.parse(date));
      return cal;
    } catch(ParseException e) {
      System.out.println(e.toString());
    }
    return null;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
