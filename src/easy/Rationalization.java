package topc.easy;

import java.util.*;
import java.io.*;

// SRM 224 Division I Level Two - 600
// brute force, greedy
// http://community.topcoder.com/stat?c=problem_statement&pm=2347&rd=5870
public class Rationalization {
  int n;
  int m;
  int d;
  int best;
  int[][] scores;
  int[] weights;

  public int minTweaks(int[] weights, String[] scores, int desired) {
    n = weights.length;
    m = scores.length;
    d = desired;
    best = Integer.MAX_VALUE;
    this.scores = new int[m][n];
    this.weights = weights;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        this.scores[i][j] = scores[i].charAt(j) - '0';
      }
    }

    doWeights(0, 0);

    return best == Integer.MAX_VALUE ? -1 : best;
  }

  void doWeights(int i, int numTweaks) {
    if (i == n) {
      processScores(numTweaks);
    } else {
      doWeights(i + 1, numTweaks);
      if (weights[i] < 9) {
        weights[i]++;
        doWeights(i + 1, numTweaks + 1);
        weights[i]--;
      }
      if (weights[i] > 1) {
        weights[i]--;
        doWeights(i + 1, numTweaks + 1);
        weights[i]++;
      }
    }
  }

  void processScores(int numTweaks) {
    int[] sorted = sortWeights();
    int[][] optimal = new int[m][n + 1];

    for (int i = 0; i < m; i++) { Arrays.fill(optimal[i], -1); }
    
    for (int i = 0; i < m; i++) {
      int value = totalScore(i);
      int tweaks = 0;

      optimal[i][tweaks++] = value;
      for (int j = 0; j < n; j++) {
        int k = sorted[j];
        int w = weights[k];
        if (i == d && scores[i][k] < 9) {
          value += w;
          optimal[i][tweaks++] = value;
        }
        if (i != d && scores[i][k] > 1) {
          value -= w;
          optimal[i][tweaks++] = value;
        }
      }
    }

    for (int tw1 = 0; tw1 <= n; tw1++) {
      int total = numTweaks + tw1;
      int count = 1;
      for (int i = 0; i < m; i++) {
        if (i == d) { continue; }
        for (int tw2 = 0; tw2 <= n; tw2++) {
          if (optimal[d][tw1] == -1 || optimal[i][tw2] == -1) {
            break;
          }
          if (optimal[d][tw1] > optimal[i][tw2]) {
            total += tw2;
            count++;
            if (total > best) { i = m; }
            break;
          }
        }
      }

      if (count == m) {
        best = Math.min(best, total);
      }
    }
  }

  int totalScore(int i) {
    int score = 0;
    for (int j = 0; j < n; j++) {
      score += scores[i][j] * weights[j];
    }
    return score;
  }

  int[] sortWeights() {
    Weight[] w = new Weight[n];
    for (int i = 0; i < n; i++) {
      w[i] = new Weight(weights[i], i);
    }

    Arrays.sort(w);

    int[] indices = new int[n];
    for (int i = 0; i < n; i++) {
      indices[i] = w[i].index;
    }

    return indices;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Weight implements Comparable<Weight>{
    public final int value;
    public final int index;

    public Weight(int value, int index) {
      this.value = value;
      this.index = index;
    }

    public int compareTo(Weight other) {
      return Integer.valueOf(other.value).compareTo(Integer.valueOf(value));
    }
  }
}
