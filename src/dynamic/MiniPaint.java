package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division I Level Three - 1000
// dynamic programming
// http://community.topcoder.com/stat?c=problem_statement&pm=1996&rd=4710
public class MiniPaint {
  byte[][] pic;
  byte[][][][] paint;
  int N;    // row count
  int M;    // col count
  int S;    // max strokes

  public int leastBad(String[] picture, int maxStrokes) {
    N = picture.length;
    M = picture[0].length();
    S = maxStrokes;
    pic = new byte[N][M + 1];

    for (int i = 0; i < N; i++) {
      String row = picture[i];
      char prev = row.charAt(0);
      int count = 1;
      int index = 0;
      for (int j = 1; j < M; j++) {
        char curr = row.charAt(j);
        if (prev != curr) {
          pic[i][index++] = (byte)count;
          prev = curr;
          count = 1;
        } else {
          count++;
        }
      }
      pic[i][index++] = (byte)count;

      // strokes needed to paint entire row
      pic[i][M] = (byte)index;    
    }

    computeStrokes();

    int strokes = allStrokes();
    if (strokes <= S) { 
      return 0;
    } else {
      int spaces = allSpaces();
      int painted = maxPainted();
      return spaces - painted;
    }
  }

  int maxPainted() {
    int all = allSpaces();
    int[] seen = new int[N];
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();

    for (int k = 0; k < pic[0][M]; k++) {
      nodes.offer(new Node(0, maxPainted(0, k), k + 1));
    }

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (top.totStrokes == S) { return top.totPainted; }
      if (top.totPainted == all && top.totStrokes < S) { return top.totPainted; }
      if (top.totStrokes > S) { continue; }
      if (top.totPainted <= seen[top.row] || top.row == N - 1) { continue; }

      seen[top.row] = top.totPainted;
      int row = top.row + 1;
      for (int k = 0; k < pic[row][M]; k++) {
        int totPainted = top.totPainted + maxPainted(row, k);
        int totStrokes = top.totStrokes + k + 1;
        nodes.offer(new Node(row, totPainted, totStrokes));
      }
    }

    return 0;
  }

  int maxPainted(int row, int strokes) {
    return Math.max(paint[row][0][strokes][0], paint[row][0][strokes][1]);
  }

  int allStrokes() {
    int all = 0;
    for (int i = 0; i < N; i++) { all += pic[i][M]; }
    return all;
  }

  int allSpaces() {
    int all = 0;
    for (int i = 0; i < N; i++) { all += maxPainted(i, pic[i][M] - 1); }
    return all;
  }

  void computeStrokes() {
    paint = new byte[N][M][M][2];

    for (int i = 0; i < N; i++) {
      byte strokes = pic[i][M];
      byte[][][] row = paint[i];

      for (int j = strokes - 1; j > -1; j--) {
        byte c1 = (byte)(j % 2);
        byte c2 = (byte)(c1 == 0 ? 1 : 0);

        for (int k = 0; k < strokes; k++) {
          if (j == strokes - 1) {
            row[j][k][c1] = pic[i][j];
          } else {
            byte[] prev = k == 0 ? (new byte[2]) : row[j + 1][k - 1];
            row[j][k][c1] = (byte)Math.max(pic[i][j] + prev[c2], row[j + 1][k][c1]);
            row[j][k][c2] = row[j + 1][k][c2];

            if (j == strokes - 2) { continue; }
            row[j][k][c1] = (byte)Math.max(row[j][k][c1], pic[i][j] + row[j + 2][k][c1]);
          }
        }
      }

      assert maxPainted(i, 0) == maxAltSum(pic[i], 0) : "invalid computation for k = 1";
      assert maxPainted(i, strokes - 1) == M          : "invalid computation for k = M";
    }
  }

  int maxAltSum(byte[] row, int index) {
    int s1 = 0;
    int s2 = 0;

    for (int i = index; i < M; i++) {
      s1 += i % 2 == 0 ? row[i] : 0;
      s2 += i % 2 != 0 ? row[i] : 0;
    }

    return Math.max(s1, s2);
  }

  class Node implements Comparable<Node> {
    public int totStrokes;
    public int totPainted;
    public int row;

    public Node(int row, int totPainted, int totStrokes) {
      this.row = row;
      this.totPainted = totPainted;
      this.totStrokes = totStrokes;
    }

    public int compareTo(Node other) {
      if (totStrokes != other.totStrokes) {
        return Integer.valueOf(totStrokes).compareTo(other.totStrokes);
      } else {
        return Integer.valueOf(other.totPainted).compareTo(totPainted);
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
