package topc.math;

import java.util.*;
import java.io.*;

// SRM 222 Division II Level Three - 1000
// advanced math, brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3439&rd=5868
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm222
public class YahtzeeRoll {
  int D = 5;        // number of dice
  int V = 6;        // highest dice value
  double[] best;

  public double bestChoice(int[] dice) {
    int n = 1 << D;
    best = new double[n];

    for (int i = 0; i < n; i++) {
      roll(i, 0, 1.0, dice);
    }

    double res = 0.0;
    for (int i = 0; i < n; i++) {
      res = Math.max(res, best[i]);
    }

    return res;
  }

  void roll(int set, int d, double prob, int[] dice) {
    if (d == D) {
      best[set] += prob * points(dice);
    } else {
      for (int i = d; i < D; i++) {
        if (((set >> i) & 1) == 1) {
          for (int j = 1; j < V + 1; j++) {
            int[] next = dice.clone();
            next[i] = j;
            roll(set, i + 1, prob / 6.0, next);
          }
          break;
        }
        else if (i == D - 1) {
          roll(set, D, prob, dice);
        }
      }
    }
  }

  int points(int[] dice) {
    if (yahtzee(dice)) { return 50; }
    if (largeStraight(dice)) { return 40; }
    if (smallStraight(dice)) { return 30; }
    if (fullHouse(dice)) { return 25; }
    return 0;
  }

  boolean yahtzee(int[] dice) {
    int x = dice[0];
    for (int i = 1; i < dice.length; i++) {
      if (dice[i] != x) { 
        return false; 
      }
    }
    return true;
  }

  boolean largeStraight(int[] dice) {
    return straight(dice);
  }

  boolean smallStraight(int[] dice) {
    for (int i = 0; i < dice.length; i++) {
      int[] next = new int[dice.length - 1];
      int j = 0;
      for (int k = 0; k < dice.length; k++) {
        if (k != i) {
          next[j++] = dice[k];
        }
      }
      if (straight(next)) { 
        return true; 
      }
    }
    return false;
  }

  boolean fullHouse(int[] dice) {
    int[] temp = new int[V];
    for (int i = 0; i < dice.length; i++) {
      temp[dice[i] - 1]++;
    }
    for (int i = 0; i < temp.length; i++) {
      if (!(temp[i] == 0 || temp[i] == 2 || temp[i] == 3)) { 
        return false; 
      }
    }
    return true;
  }

  boolean straight(int[] dice) {
    Arrays.sort(dice);
    for (int i = 1; i < dice.length; i++) {
      if (dice[i] != dice[i - 1] + 1) { return false; }
    }
    return true;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
