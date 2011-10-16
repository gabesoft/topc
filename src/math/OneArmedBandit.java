package topc.math;

import java.util.*;
import java.io.*;

// SRM 226 Division I Level Two - 500
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3443&rd=6515
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm226
public class OneArmedBandit {
  int A = (int) 'A';
  int Z = (int) 'Z';

  public double progressiveJackpot(String[] wheels, String jackpotLine, String[] payoffTable) {
    double[][] probSym = new double[wheels.length][Z + 1];

    for (int i = 0; i < wheels.length; i++) {
      for (int j = 0; j < wheels[i].length(); j++) {
        int sym = (int)wheels[i].charAt(j);
        probSym[i][sym] += 1.0 / wheels[i].length();
      }
    }

    double probPayoff = 0.0;
    for (int i = 0; i < payoffTable.length; i++) {
      String[] payoff = payoffTable[i].split("\\s+");
      String line = payoff[0];
      double amt = Double.parseDouble(payoff[1]);
      probPayoff += amt * probLine(line, probSym);
    }

    double probJackpot = probLine(jackpotLine, probSym);

    if (probPayoff >= 1.0) { return 0.0; }
    if (probJackpot == 0.0) { return -1.0; }

    return (1.0 - probPayoff) / probJackpot;
  }

  double probLine(String line, double[][] probSym) {
    double prob = 1.0;

    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) != '-') {
        int sym = (int)line.charAt(i);
        prob *= probSym[i][sym];
      }
    }

    return prob;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
