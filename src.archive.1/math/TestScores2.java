package topc.math;

import java.util.*;
import java.io.*;

// SRM 226 Division I Level Three - 800
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3486&rd=6515
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm226
public class TestScores2 {
  public double weightedScore(double[] questions, int testScore) {
    double MEAN = 1000.0;
    double SD = 300.0;

    double[] probs = computeProbs(questions);

    double mean = 0.0;
    for (int i = 0; i < questions.length; i++) {
      mean += questions[i];
    }

    double sd = 0.0;
    for (int i = 0; i < probs.length; i++) {
      double deviation = i - mean;
      sd += probs[i] * (deviation * deviation);
    }
    sd = Math.sqrt(sd);

    double raw = (testScore - mean) / sd;

    return raw * SD + MEAN;
  }

  double[] computeProbs(double[] questions) {
    int n = questions.length;
    double[][] probs = new double[n + 1][n + 1];

    probs[0][0] = 1.0;

    for (int i = 1; i < n + 1; i++) {
      probs[i][0] = 1.0;
      double p = questions[i - 1];
      for (int j = 1; j < i + 1; j++) {
        probs[i][j] = p * probs[i - 1][j - 1] + (1 - p) * probs[i - 1][j];
        probs[i][0] -= probs[i][j];
      }
    }
    
    return probs[n];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

