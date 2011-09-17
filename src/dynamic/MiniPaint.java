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

    // TODO: remove debug code below
    //for (int i = 0; i < N; i++) {
      //debug("pic[i]", i, pic[i]);
    //}

    //for (int i = 0; i < N; i++) {
      //debug("pic[i]", i, pic[i]);
      //for (int k = 0; k < pic[i][M]; k++) {
        //debug("\tk", k, paint[i][0][k]);
      //}
    //}

    int spaces = allSpaces();
    int strokes = allStrokes();

    if (strokes <= S) { 
      return 0;
    } else {
      int painted = maxPainted();

      debug("all", spaces, N, M, S);
      debug("max", painted);

      return spaces - painted;
    }

    //return 0;
  }

  int maxPainted() {
    int all = allSpaces();
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    //int[][] seen = new int[N][M + 1];
    int[] seen = new int[N];
    int max = 0;

    //nodes.offer(new Node(0, 0, 0, 0));
    for (int k = 0; k < pic[0][M]; k++) {
      int curStrokes = k + 1;
      int totPainted = Math.max(paint[0][0][k][0], paint[0][1][k][1]);
      nodes.offer(new Node(totPainted, 0, curStrokes, curStrokes));
    }

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      //if (top.totPainted == 140) {
      //debug(top.row, top.curStrokes, top.totStrokes, top.totPainted);
      //}

      //debug(top.row, top.curStrokes, top.totStrokes, top.totPainted);

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
      //nodes.offer(new Node(top.totPainted, row, 0, top.totStrokes));
      for (int k = 0; k < pic[row][M]; k++) {
        int curStrokes = k + 1;
        int totPainted = top.totPainted + Math.max(paint[row][0][k][0], paint[row][0][k][1]); 
        int totStrokes = top.totStrokes + curStrokes;

        // TODO: this if statement should be unnecessary
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

  int allSpaces() {
    int all = 0;
    for (int i = 0; i < N; i++) {
      byte strokes = pic[i][M];
      //all += paint[i][0][strokes - 1][(M + 1) % 2];
      all += Math.max(paint[i][0][strokes - 1][0], paint[i][0][strokes - 1][1]);
    }
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
        //byte c1 = 0;
        //byte c2 = 1;

        //row[j][0] = (byte)maxAltSum(pic[i], j);
        //for (int k = 1; k < strokes; k++) {

        for (int k = 0; k < strokes; k++) {

          if (j == strokes - 1) {
            row[j][k][c1] = pic[i][j];
            //row[j][k][c2] = 0;
          } else {
            byte[] prev = k == 0 ? (new byte[2]) : row[j + 1][k - 1];
            row[j][k][c1] = (byte)Math.max(pic[i][j] + prev[c2], row[j + 1][k][c1]);
            row[j][k][c2] = row[j + 1][k][c2];
            //row[j][k][c2] = (byte)Math.max(pic[i][j] + prev[c1], row[j + 1][k][c2]);

            if (j == strokes - 2) { continue; }
            row[j][k][c1] = (byte)Math.max(row[j][k][c1], pic[i][j] + row[j + 2][k][c1]);
            //row[j][k][c2] = (byte)Math.max(row[j][k][c2], pic[i][j] + row[j + 2][k][c2]);
          }
        }
      }

      //for (int p = 0; p < M; p++) {
        //debug(p, row[p][0]);
        //debug(p, row[p]);
      //}
      //debug(i, pic[i]);
      //debug(row[0][0], maxAltSum(pic[i], 0));
      //debug(row[0][strokes - 1], M);

      assert Math.max(row[0][0][0], row[0][0][1]) == maxAltSum(pic[i], 0) : "compute strokes malfunction - start";
      assert Math.max(row[0][strokes - 1][0], row[0][strokes - 1][1]) == M : "compute strokes malfunction - end";
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
