package topc.math;

import java.util.*;
import java.io.*;

// TCO04 Qual 3 Division I Level Three - 950
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2974&rd=5875
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco04_qual_3
public class GeneticCrossover {
  int n;
  char[][] gene;
  double[] prob;
  int[] dependencies;

  public double cross(String p1a, String p1b, String p2a, String p2b, int[] dom, int[] rec, int[] dependencies) {
    this.dependencies = dependencies;

    n = p1a.length();
    gene = new char[4][];
    prob = new double[n];

    gene[0] = p1a.toCharArray();
    gene[1] = p1b.toCharArray();
    gene[2] = p2a.toCharArray();
    gene[3] = p2b.toCharArray();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 2; k < 4; k++) {
          char ch1 = gene[j][i];
          char ch2 = gene[k][i];
          if (Character.isUpperCase(ch1) || Character.isUpperCase(ch2)) { 
            prob[i] += 0.25;
          }
        }
      }
    }

    double exp = 0.0;
    for (int i = 0; i < n; i++) {
      double p = pdom(i);
      exp += p * dom[i] + (1 - p) * rec[i];
    }

    return exp;
  }

  double pdom(int i) {
    if (dependencies[i] == -1) { return prob[i]; }
    return prob[i] * pdom(dependencies[i]);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
