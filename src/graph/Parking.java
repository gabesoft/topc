package topc.graph;

import java.util.*;
import java.io.*;

// SRM 236 Division I Level Three - 1000
// graph theory
// http://community.topcoder.com/stat?c=problem_statement&pm=3530&rd=6535
public class Parking {
  int[][] park;
  int[][] match;
  int[][] cars;
  int[][] spots;
  int m;
  int n;
  int carslen;
  int spotslen;

  public int minTime(String[] parking) {
    n         = parking.length;
    m         = parking[0].length();
    carslen   = 0;
    spotslen  = 0;

    park  = new int[n][m];
    cars  = new int[100][2];
    spots = new int[100][2];

    for (int i = 0; i < n; i++) {
      char[] chars = parking[i].toCharArray();
      for (int j = 0; j < m; j++) {
        switch (chars[j]) {
          case 'X': park[i][j] = -1;              break;
          case '.': park[i][j] =  0;              break;
          case 'C': park[i][j] =  1;              break;
          case 'P': park[i][j] =  2 + spotslen;   break;
        }
        if (park[i][j] == 1) { cars[carslen++]    = new int[] { i, j }; }
        if (park[i][j] >= 2) { spots[spotslen++]  = new int[] { i, j }; }
      }
    }

    match = new int[carslen][spotslen];
    for (int i = 0; i < carslen; i++) {
      computeWeights(i);
    }

    //int[][] clone = cloneMatch();
    //clone[0][0] = -1;
    debug("match", match);
    //debug("clone", clone);

    return -2;
  }

  void computeWeights(int car) {
    Queue<Node> nodes = new LinkedList<Node>();
    HashSet<String> seen = new HashSet<String>();
    Node start = new Node(cars[car][0], cars[car][1], 0);
    nodes.offer(start);

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (seen.contains(top.toString())) { continue; }
      if (top.x < 0 || top.x > n - 1 || top.y < 0 || top.y > m - 1) { continue; }
      if (park[top.x][top.y] < 0) { continue; }

      seen.add(top.toString());
      if (park[top.x][top.y] >= 2) {
        int spot = park[top.x][top.y] - 2;
        match[car][spot] = top.time;
      }

      nodes.add(new Node(top.x - 1, top.y, top.time + 1));
      nodes.add(new Node(top.x + 1, top.y, top.time + 1));
      nodes.add(new Node(top.x, top.y - 1, top.time + 1));
      nodes.add(new Node(top.x, top.y + 1, top.time + 1));
    }
  }

  int[][] cloneMatch() {
    int[][] clone = new int[carslen][spotslen];
    for (int i = 0; i < carslen; i++) {
      clone[i] = match[i].clone();
    }
    return clone;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final int x;
    public final int y;
    public final int time;

    public Node(int x, int y, int time) {
      this.x = x;
      this.y = y;
      this.time = time;
    }

    public String toString() {
      return String.format("%s:%s", x, y);
    }
  }
}
