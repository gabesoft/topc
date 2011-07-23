package topc.bkt;

import java.util.*;

// SRM 146 Div 1 : 1000 (backtracking)
public class BridgeCrossing {
  Queue<State> states;
  int time;

  public int minTime(int[] t) {
    int n = t.length;
    int[] b = new int[n];

    Arrays.sort(t);

    b[0] = t[0];
    if (n > 1) {
      b[1] = t[1];
    }
    for (int i = 2; i < n; i++) {
      int one = b[i - 2] + t[0] + t[i] + 2 * t[1];
      int two = b[i - 1] + t[0] + t[i];
      b[i] = Math.min(one, two);
    }
   
    return b[n - 1];
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  public int minTimeOld(int[] times) {
    time = Integer.MAX_VALUE;
    states = new LinkedList<State>();
    states.add(new State(times));

    while (states.size() > 0) {
      solve(states.poll());
    }

    return time;
  }

  void solve(State s) {
    if (s.done()) {
      time = time > s.getTime() ? s.getTime() : time;
    }
    if (s.getTime() > time) {
      return;
    }

    int[] moves = s.getTimes();
    for (int i = 0; i < moves.length; i++) {
      for (int j = 0; j < moves.length; j++) {
        if (i != j) {
          State next = s.copy();
          next.move(i, j);
          states.add(next);
        }
      }
    }
  }

  class State {
    int _time;
    int[] _right;
    Queue<Integer> _left;

    public State(int[] times) {
      _time = 0;
      _right = times;
      _left = new PriorityQueue<Integer>();
    }

    public int getTime() {
      return _time;
    }

    public int[] getTimes() {
      return _right;
    }

    public boolean done() {
      if (_right.length == 1) {
        _time += _right[0];
        _right = new int[0];
      }
      return _right.length == 0;
    }

    public void move(int i, int j) {
      _left.add(_right[i]);
      _left.add(_right[j]);
      _time += Math.max(_right[i], _right[j]);

      if (_right.length > 2) {

        int[] next = new int[_right.length - 1];
        int count = 1;
        next[0] = _left.poll();
        for (int k = 0; k < _right.length; k++) {
          if (k != i && k != j) {
            next[count++] = _right[k];
          }
        }

        _time += next[0];
        _right = next;
      } else {
        _right = new int[0];
      }
    }

    public State copy() {
      State copy = new State(_right);
      copy._time = _time;

      Object[] left = _left.toArray();
      for (int i = 0; i < left.length; i++) {
        copy._left.add((Integer)left[i]);
      }

      return copy;
    }
  }
}
