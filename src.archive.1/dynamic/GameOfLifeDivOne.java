package topc.dynamic;

import java.util.*;

// SRM 511 Div 1 : 1000 (dynamic programming)
public class GameOfLifeDivOne {
  long[][][] cache;
  char[] state;
  int T;
  int K;
  int N;

  public long theCount(String init, int t, int k) {
    N = init.length();
    T = t;
    K = k;
    return outerRec(init.toCharArray(), 0);
  }

  long outerRec(char[] init, int pos) {
    if (pos >= N) {
      return willHave(init) >= K ? 1 : 0;
    }

    long res = 0;
    if (init[pos] == '?') {
      init[pos] = '0';
      res += outerRec(init, pos);
      init[pos] = '1';
      res += outerRec(init, pos);
      init[pos] = '?';
    } else {
      if (pos >= 2 && init[pos] != init[pos - 1] && init[pos - 1] == init[pos - 2]) {
        char[] rotated = new char[N];
        int at = pos;
        for (int i = 0; i < N; i++) {
          at--;
          if (at < 0) { at += N; }
          rotated[i] = init[at];
        }
        res += innerRec(rotated);
      } else {
        res += outerRec(init, pos + 1);
      }
    }

    return res;
  }

  int willHave(char[] state) {
    int start;
    for (start = 0; start < state.length; start++) {
      if (state[start] != state[(start + state.length - 1) % state.length]) {
        break;
      }
    }

    if (start >= state.length) {
      return state[0] == '1' ? state.length : 0;
    }

    int[] blocks = new int[state.length];
    int numBlocks = 0;
    char curBlock = '2';
    for (int i = 0; i < state.length; i++) {
      char cur = state[(i + start) % state.length];
      if (cur == curBlock) {
        blocks[numBlocks - 1]++;
      } else {
        numBlocks++;
        blocks[numBlocks - 1] = 1;
        curBlock = cur;
      }
    }

    char firstBlock = state[start];
    for (start = 0; start < numBlocks; start++) {
      if (blocks[start] > 1) { break; }
    }
    if (start >= numBlocks) {
      return state.length / 2;
    }

    int numOnes = 0;
    int res = 0;
    for (int i = 0; i <= numBlocks; i++) {
      int curSize = blocks[(i + start) % numBlocks];
      char curKind = ((i + start) % 2 == 0) ? firstBlock : (char) (firstBlock ^ 1);
      if (curSize > 1) {
        if (numOnes % 2 == 0) {
          res += numOnes / 2;
        } else {
          int numThisKind = Math.min(numOnes, numOnes / 2 + T);
          res += (curKind == '1') ? numThisKind : (numOnes - numThisKind);
        }
        numOnes = 0;
        if (curKind == '1' && i < numBlocks) {
          res += curSize;
        }
      } else {
        numOnes++;
      }
    }

    return res;
  }

  long innerRec(char[] state) {
    this.state = state;
    cache = new long[4][state.length + 1][state.length + 1];
    for (int i = 0; i < cache.length; i++) {
      for (int j = 0; j <= state.length; j++) {
        Arrays.fill(cache[i][j], -1);
      }
    }
    return rec(2 + state[0] - '0', 0, 0);
  }

  long rec(int stage, int at, int have) {
    if (cache[stage][at][have] >= 0) { 
      return cache[stage][at][have]; 
    }

    long res = 0;
    char need = (char) ('0' + (stage % 2));

    if (stage >= 2) {
      if (at == state.length) {
        assert need == state[0] : "need and state differ";
        return have >= K ? 1 : 0;
      }
      if (state[at] == (need ^ 1)) {
        res = 0;
      } else {
        for (int blockSize = 2; at + blockSize <= state.length; blockSize++) {
          if (state[at + blockSize - 1] == (need ^ 1)) { break; }
          res += rec(stage ^ 3, at + blockSize, have + (need == '1' ? blockSize : 0));
        }
      }
    } else {
      for (int numOnes = 0; at + numOnes <= state.length; numOnes++) {
        int willGive;
        if (numOnes % 2 == 0) {
          willGive = numOnes / 2;
        } else {
          int numThisKind = Math.min(numOnes, numOnes / 2 + T);
          willGive = (need == '1') ? numThisKind : (numOnes - numThisKind);
        }
        res += rec(2 + need - '0', at + numOnes, have + willGive);
        if (at + numOnes >= state.length) { break; }
        if (state[at + numOnes] == (need ^ 1)) { break; }
        need ^= 1;
      }
    }

    cache[stage][at][have] = res;
    return res;
  }

  void printGen(int n, int t) {
    int[][] counts = new int[t][n+1];
    int lim = (int)Math.pow(2, n);

    for (int i = 0; i < lim; i++) {
      long next = i;
      for (int j = 0; j < t; j++) {
        counts[j][ones(next, n)]++;
        next = nextGen(next, n);
      }
    }

    for (int i = 0; i < counts.length; i++) {
      debug(i, counts[i], sum(counts[i]));
    }
  }

  int sum(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res += arr[i];
    }
    return res;
  }

  long nextGen(long curr, int n) {
    int[] GEN = { 0, 0, 0, 1, 0, 1, 1, 1 };
    long next = 0;
    int mask = 7;
    long fst = (curr & (1 << (n - 1))) == 0 ? 0 : 1;
    long snd = (curr & (1 << (n - 2))) == 0 ? 0 : 1;
    long bst = (curr & 2) == 0 ? 0 : 1;
    long lst = curr & 1;

    next = fst != bst ? lst : fst;
    for (int i = 0; i < n - 2; i++) {
      next <<= 1;
      next += GEN[(int)curr & mask];
      curr >>= 1;
    }
    next <<= 1;
    next += snd != lst ? fst : snd;

    long res = 0;
    for (int i = 0; i < n; i++) {
      res <<= 1;
      res += next & 1;
      next >>= 1;
    }

    return res;
  }

  int ones(long k, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      count += k & 1;
      k >>= 1;
    }
    return count;
  }

  String toBits(long k, int n) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < n; i++) {
      str.append((k & 1) == 1 ? "1" : "0");
      k >>= 1;
    }
    return str.reverse().toString();
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
