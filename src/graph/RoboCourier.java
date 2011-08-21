package topc.graph;

import java.util.*;

// SRM 150 Div 1 : 1000 (graph dijkstra)
public class RoboCourier {
  static public final int[] RDIR = { -1, -1, -1, -1, -1, 20, 10, -1, -1, 5, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, 6, -1, -1, -1, 9 };
  static public final int[] LDIR = { -1, -1, -1, -1, -1, 9, 20, -1, -1, 24, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, 10 };
  Node end;
  HashMap<String, ArrayList<String>> safe;
  HashSet<String> seen;

  public int timeToDeliver(String[] path) {
    safe = new HashMap<String, ArrayList<String>>();
    seen = new HashSet<String>();
    buildGraph(path);
    return solve();
  }

  int solve() {
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    Node start = new Node(0, 0, 24);

    nodes.offer(start);
    while (nodes.size() > 0) {
      Node top = nodes.poll();
      String key = top.toString();
      if (seen.contains(top.extendedKey())) { continue; }
      if (!top.fast && top.hasLoc(end.x, end.y)) { return top.cost; }

      seen.add(top.extendedKey());
      for (String ckey : safe.get(key)) {
        for (Node c : top.move(ckey)) {
          nodes.offer(c);
        }
      }
    }

    return 0;
  }

  void buildGraph(String[] path) {
    Node start = new Node(0, 0, 24);
    end = start;
    safe.put(start.toString(), new ArrayList<String>());

    for (int i = 0; i < path.length; i++) {
      for (int j = 0; j < path[i].length(); j++) {
        switch (path[i].charAt(j)) {
          case 'R':
            end.dir = RDIR[end.dir];
            break;
          case 'L':
            end.dir = LDIR[end.dir];
            break;
          case 'F':
            assert end.dir > -1 : "invalid dir";
            String startKey = start.toString();
            end = end.move(end.dir, 0);
            start = end;
            String endKey = end.toString();

            if (!safe.containsKey(endKey)) {
              safe.put(endKey, new ArrayList<String>());
            }

            safe.get(startKey).add(endKey);
            safe.get(endKey).add(startKey);
            break;
        }
      }
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node implements Comparable<Node> {
    public int x;
    public int y;
    public int dir;
    public int cost;
    public boolean fast = false;

    public Node(int x, int y) {
      this(x, y, 24);
    }

    public Node(int x, int y, int dir) {
      this.x = x;
      this.y = y;
      this.dir = dir;
    }

    public Node move(int dir, int cost) {
      return move(dir, cost, false);
    }

    public Node move(int dir, int cost, boolean fast) {
      int v = ((dir >> 4) & 1) + ((dir >> 3) & 1) + ((dir >> 2) & 1);
      int h = ((dir >> 1) & 1) + (dir & 1);
      v *= ((dir >> 3) & 1) == 1 ? 1 : -1;
      h *= ((dir >> 0) & 1) == 1 ? 1 : -1;
      Node node = new Node(x + h, y + v, dir);
      node.cost = this.cost + cost;
      node.fast = fast;
      return node;
    }

    public Node[] move(String to) {
      String[] coord = to.split("\\|");
      int x = Integer.parseInt(coord[0]);
      int y = Integer.parseInt(coord[1]);
      Node next;

      next = this.move(dir, 4);
      if (next.hasLoc(x, y)) {
        boolean cantSpeed = this.hasLoc(0, 0) || this.hasLoc(end.x, end.y);
        return cantSpeed ? new Node[] { next } : new Node[] { next, this.move(dir, 2, true) };
      }
      if (fast) { return new Node[0]; }

      next = this.move(RDIR[dir], 7);
      if (next.hasLoc(x, y)) { return new Node[] { next }; }
      next = this.move(LDIR[dir], 7);
      if (next.hasLoc(x, y)) { return new Node[] { next }; }
      next = this.move(RDIR[RDIR[dir]], 10);
      if (next.hasLoc(x, y)) { return new Node[] { next }; }
      next = this.move(LDIR[LDIR[dir]], 10);
      if (next.hasLoc(x, y)) { return new Node[] { next }; }
      next = this.move(RDIR[RDIR[RDIR[dir]]], 13);
      if (next.hasLoc(x, y)) { return new Node[] { next }; }

      return new Node[0];
    }

    public boolean hasLoc(int x, int y) {
      return this.x == x && this.y == y;
    }

    public int compareTo(Node other) {
      return Integer.valueOf(cost).compareTo(Integer.valueOf(other.cost));
    }

    public String extendedKey() {
      return String.format("(%s, %s, %s, %s)", x, y, fast, dir);
    }

    public String toString() {
      return String.format("%s|%s", x, y);
    }
  }
}
