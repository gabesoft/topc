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
    //return find(index, chars);
  }

  String find(int index, char[] chars) {
    if (chars.length == 0) { return ""; }

    int n = chars.length;
    int r = 0;
    int s = 0;

    for (int i = 1; i < n + 1; i++) {
      if (s + T[n - i] * T[i - 1] >= index) {
        r = i - 1;
        break;
      }
      s += T[n - i] * T[i - 1];
    }

    char[] next1 = new char[r];
    char[] next2 = new char[n - (r + 1)];
    for (int i = 0; i < r; i++) { next1[i] = chars[i]; }
    for (int i = r + 1; i < n; i++) { next2[i - (r + 1)] = chars[i]; }

    int t1 = T[r];
    int t2 = T[n - (r + 1)];

    int dindex = index - s;
    int index1 = 0;
    int index2 = 0; 
    
    for (int i = 1; i < t1 + 1; i++) {
      if (i * t2 == dindex) {
        index1 = i;
        index2 = t2;
        break;
      }
      if (i * t2 > dindex) {
        index1 = i;
        index2 = dindex - (i - 1) * t2;
        break;
      }
    }

    return "" + chars[r] + find(index1, next1) + find(index2, next2);
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
