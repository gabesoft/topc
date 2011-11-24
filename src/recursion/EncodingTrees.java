package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 261 Division I Level Two - 550
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4700&rd=7995
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm261
public class EncodingTrees {
  int[] T;

  public String getCode(int N, int index) {
    buildt(N);

    char[] chars = new char[N];
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(i + 'a');
    }

    return index <= T[N] ? find(index, chars) : "";
  }

  String find(int index, char[] chars) {
    if (chars.length == 0) { return ""; }

    int n = chars.length;
    int j = 0;
    int s = 0;

    for (int i = 1; i < n + 1; i++) {
      if (s + T[n - i] * T[i - 1] >= index) {
        j = i - 1;
        break;
      }
      s += T[n - i] * T[i - 1];
    }

    int tl = T[j];
    int tr = T[n - (j + 1)];

    int dindex = index - s;
    int indexl = 0;
    int indexr = 0; 
    
    for (int i = 1; i < tl + 1; i++) {
      if (i * tr >= dindex) {
        indexl = i;
        indexr = dindex - (i - 1) * tr;
        break;
      }
    }

    char[] nextl = new char[j];
    char[] nextr = new char[n - (j + 1)];

    for (int i = 0; i < j; i++) { nextl[i] = chars[i]; }
    for (int i = j + 1; i < n; i++) { nextr[i - (j + 1)] = chars[i]; }

    return "" + chars[j] + find(indexl, nextl) + find(indexr, nextr);
  }

  void buildt(int n) {
    T = new int[n + 1];
    T[0] = 1;
    T[1] = 1; 

    for (int i = 2; i < n + 1; i++) {
      for (int j = 1; j < i + 1; j++) {
        T[i] += T[i - j] * T[j - 1];
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
