package topc.math;

import java.util.*;
import java.io.*;

// SRM 226 Division I Level Three - 800
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3486&rd=6515
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm226
public class TestScores {
  public double weightedScore(double[] questions, int testScore) {
    double MEAN = 1000.0;
    double SD = 300.0;

    double[] answers = computeAnswers(questions);

    double sum = 0.0;
    double mean = 0.0;
    for (int i = 0; i < answers.length; i++) {
      mean += i * answers[i];
      sum += answers[i];
    }
    mean /= sum;

    double sd = 0.0;
    for (int i = 0; i < answers.length; i++) {
      double deviation = i - mean;
      sd += answers[i] * (deviation * deviation);
    }
    sd = Math.sqrt(sd / sum);

    double raw = (testScore - mean) / sd;

    return raw * SD + MEAN;
  }

  double[] computeAnswers(double[] questions) {
    int n = questions.length;
    double seed = 4990000;
    double[] ans = new double[n + 1];

    ans[0] = seed;
    for (int i = 0; i < n; i++) {
      double[] work = new double[n + 1];
      double p = questions[i];
      for (int j = 0; j < n; j++) {
        double answers = ans[j] * p;
        work[j] -= answers;
        work[j + 1] += answers;
      }
      for (int j = 0; j < n + 1; j++) {
        ans[j] += work[j];
      }
    }

    return ans;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
