package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division I Level Three - 1000
// dynamic programming
// http://community.topcoder.com/stat?c=problem_statement&pm=1996&rd=4710
public class MiniPaint {
  byte[][] pic;
  byte[][][] paint;
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

    // TODO: remove debug code below
    for (int i = 0; i < N; i++) {
      debug("pic[i]", pic[i]);
      for (int k = 0; k < pic[i][M]; k++) {
        debug("\tk", k, paint[i][0][k]);
      }
    }

    // TODO: case8, case10 fails

    int all = sumAll();
    int strokes = allStrokes();

    if (strokes <= S) { 
      return 0;
    } else {
      int max = getMax();

      debug("all", all);
      debug("max", max);

      return all - max;
    }
  }

  int getMax() {
    int all = sumAll();
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    //int[][] seen = new int[N][M + 1];
    int[] seen = new int[N];
    int max = 0;

    nodes.offer(new Node(0, 0, 0, 0));
    for (int k = 0; k < pic[0][M]; k++) {
      int curStrokes = k + 1;
      nodes.offer(new Node(paint[0][0][k], 0, curStrokes, curStrokes));
    }

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      //if (top.totPainted == 140) {
      //debug(top.row, top.curStrokes, top.totStrokes, top.totPainted);
      //}

      debug(top.row, top.curStrokes, top.totStrokes, top.totPainted);

      // TODO: order the nodes better and remove this if statement
      // TODO: remove curStrokes from Node
      //if (top.totStrokes == S) {
      //max = Math.max(max, top.totPainted);
      //}

      if (top.totStrokes == S) { return top.totPainted; }
      if (top.totPainted == all && top.totStrokes < S) { return top.totPainted; }
      if (top.totStrokes > S) { continue; }
      if (top.totPainted <= seen[top.row] || top.row == N - 1) { continue; }
      //if (seen[top.row][top.curStrokes] > 0 || top.row == N - 1) { continue; }
      // TODO: stop the ones with same totStrokes that have totPainted < max

      //seen[top.row][top.curStrokes] = top.totPainted;
      seen[top.row] = top.totPainted;
      int row = top.row + 1;
      nodes.offer(new Node(top.totPainted, row, 0, top.totStrokes));
      for (int k = 0; k < pic[row][M]; k++) {
        int curStrokes = k + 1;
        int totPainted = top.totPainted + paint[row][0][k]; 
        int totStrokes = top.totStrokes + curStrokes;
        if (totStrokes > S) { break; }
        nodes.offer(new Node(totPainted, row, curStrokes, totStrokes));
      }
    }

    return 0;
  }

  int allStrokes() {
    int all = 0;
    for (int i = 0; i < N; i++) {
      all += pic[i][M];
    }
    return all;
  }

  int sumAll() {
    int all = 0;
    for (int i = 0; i < N; i++) {
      byte strokes = pic[i][M];
      all += paint[i][0][strokes - 1];
    }
    return all;
  }

  void computeStrokes() {
    paint = new byte[N][M][M];

    for (int i = 0; i < N; i++) {
      byte strokes = pic[i][M];
      byte[][] row = paint[i];

      for (int j = strokes - 1; j > -1; j--) {
        for (int k = 0; k < strokes; k++) {

          if (j == strokes - 1) {
            row[j][k] = pic[i][j];
          } else {
            byte prev = k == 0 ? 0 : row[j + 1][k - 1];
            row[j][k] = (byte)Math.max(pic[i][j] + prev, row[j + 1][k]);

            if (j == strokes - 2) { continue; }
            row[j][k] = (byte)Math.max(row[j][k], pic[i][j] + row[j + 2][k]);
          }
        }
      }

      assert row[0][strokes - 1] == M : "compute strokes malfunction";
    }
  }

  class Node implements Comparable<Node> {
    public int curStrokes;
    public int totStrokes;
    public int totPainted;
    public int row;

    public Node(int totPainted, int row, int curStrokes, int totStrokes) {
      this.totPainted = totPainted;
      this.curStrokes = curStrokes;
      this.totStrokes = totStrokes;
      this.row = row;
    }

    public int compareTo(Node other) {
      //Integer value = totStrokes == 0 
      //? Integer.valueOf(totPainted) 
      //: Integer.valueOf(totPainted / totStrokes);
      //Integer otherValue = other.totStrokes == 0 
      //? Integer.valueOf(other.totPainted) 
      //: Integer.valueOf(other.totPainted / other.totStrokes);

      if (totStrokes != other.totStrokes) {
        return Integer.valueOf(totStrokes).compareTo(other.totStrokes);
      } else {
        return Integer.valueOf(other.totPainted).compareTo(totPainted);
      }


      //Integer value = Integer.valueOf(totPainted - totStrokes);
      //Integer otherValue = Integer.valueOf(other.totPainted - other.totStrokes);
      //return otherValue.compareTo(value);

      //return Integer.valueOf(other.totPainted).compareTo(Integer.valueOf(totPainted));
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
