package topc.dp;

import java.util.*;

// SRM 181 Div 1 : 1000 (dynamic programming)
public class KiloManX {
  int _n;
  int[][] _weight;
  int[] _cost;

  public int leastShots(String[] damageChart, int[] bossHealth) {
    _n = damageChart.length;
    _weight = new int[_n][_n];
    _cost = new int[_n];

    for (int i = 0; i < _n; i++) {
      _cost[i] = bossHealth[i];
      char[] chars = damageChart[i].toCharArray();
      for (int j = 0; j < _n; j++) {
        _weight[i][j] = Math.max(1, Character.getNumericValue(chars[j]));
      }
    }

    return solve();
  }

  int solve() {
    HashMap<String, Node> map1 = new HashMap<String, Node>();
    HashMap<String, Node> map2 = new HashMap<String, Node>();

    for (int i = 0; i < _n; i++) {
      Node node = new Node(new int[] {i}, _weight[i], _cost[i]);
      map1.put(node.key, node);
    }

    for (int i = 2; i <= _n; i++) {
      for (String key : map1.keySet()) {
        Node node = map1.get(key);

        for (int j = node.last + 1; j < _n; j++) {
          int[] values = expand(node.values, j);
          int[] weight = null;
          int cost = Integer.MAX_VALUE;
          for (int k = 0; k < values.length; k++) {
            int boss = values[k];
            int[] prevValues = compact(values, k);
            Node prev = map1.get(GetKey(prevValues));
            int prevCost = prev.cost + (int)Math.ceil((double)_cost[boss] / (double)prev.weight[boss]);
            if (prevCost < cost) {
              cost = prevCost;
              weight = addWeights(prev.weight, boss);
            }
          }

          Node next = new Node(values, weight, cost);
          map2.put(next.key, next);
        }   
      }

      map1 = map2;
      map2 = new HashMap<String, Node>();
    }

    assert map1.size() == 1 : "more than one item found in map";
    return map1.get(map1.keySet().toArray()[0]).cost;
  }

  int[] addWeights(int[] weight, int boss) {
    int[] w = new int[_n];
    int[] bossWeight = _weight[boss];
    for (int i = 0; i < _n; i++) {
      w[i] = Math.max(weight[i], bossWeight[i]);
    }
    return w;
  }
  int[] expand(int[] xs, int x) {
    int[] ys = new int[xs.length + 1];
    for (int i = 0; i < xs.length; i++) {
      ys[i] = xs[i];
    }
    ys[xs.length] = x;
    return ys;
  }

  int[] compact(int[] xs, int i) {
    int[] ys = new int[xs.length - 1];
    int count = 0;
    for (int j = 0; j < xs.length; j++) {
      if (i != j) {
        ys[count++] = xs[j];
      }
    }
    return ys;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  String GetKey(int[] xs) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < xs.length; i++) {
      str.append(xs[i]);
    }
    return str.toString();
  }

  class Node {
    public int[] values;
    public int[] weight;
    public int cost;
    public int last;
    public String key;

    public Node(int[] values, int[] weight, int cost) {
      this.values = values;
      this.key = GetKey(values);
      this.weight = weight;
      this.cost = cost;
      this.last = values[values.length - 1];
    }
  }
}
