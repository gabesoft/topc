package topc.greedy;

import java.util.*;
import java.io.*;

// TCO04 Semifinal 1 Division I Level Two - 500
// greedy
// http://community.topcoder.com/stat?c=problem_statement&pm=3038&rd=5882
public class BioScore {
  public double maxAvg(String[] knownSet) {
    double[] freq = getFrequency(knownSet);
    double[] score = new double[10];
    double n = knownSet.length;
    double best = Integer.MIN_VALUE;

    for (int i = 1; i < 11; i++) {
      for (int j = 1; j < 11; j++) {
        for (int k = 1; k < 11; k++) {
          for (int l = 1; l < 11; l++) {
            if ((i + j + k + l) % 2 == 0) {
              score[0] = i;
              score[1] = j;
              score[2] = k;
              score[3] = l;
              score[4] = 10.0;
              score[5] = 10.0;
              score[6] = 10.0 - (score[0] + score[1] + score[2] + score[3]) / 2.0;
              score[7] = -10.0;
              score[8] = -10.0;
              score[9] = -10.0;
              best = Math.max(best, avgScore(freq, score));
            }
          }
        }
      }
    }

    return (2.0 * best) / (n * (n - 1));
  }

  double avgScore(double[] freq, double[] score) {
    double res = 0.0;
    for (int i = 0; i < 10; i++) {
      res += freq[i] * score[i];
    }
    return res;
  }

  double[] getFrequency(String[] knownSet) {
    double[] freq = new double[10];
    int n = knownSet.length;
    int m = knownSet[0].length();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = 0; k < m; k++) {
          String a = Character.toString(knownSet[i].charAt(k));
          String b = Character.toString(knownSet[j].charAt(k));
          Pair p = Pair.valueOf(a + b);

          switch (p) {
            case AA: freq[0]++; break;
            case CC: freq[1]++; break;
            case GG: freq[2]++; break;
            case TT: freq[3]++; break;
            case AC: case CA: freq[4]++; break;
            case AG: case GA: freq[5]++; break;
            case AT: case TA: freq[6]++; break;
            case CG: case GC: freq[7]++; break;
            case CT: case TC: freq[8]++; break;
            case GT: case TG: freq[9]++; break;
          }
        }
      }
    }

    Arrays.sort(freq, 4, 10);
    for (int i = 4; i < 7; i++) { 
      swap(freq, i, 9 - i + 4);
    }
    return freq;
  }

  void swap(double[] arr, int i, int j) {
    double temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  enum Pair {
    AA, CC, GG, TT, AC, CA, AG, GA, AT, TA, CG, GC, CT, TC, GT, TG
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
