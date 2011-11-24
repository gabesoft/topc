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

    return find(N, index - 1);
  }

  String find(int n, int index) {
    if (index >= T[n]) { return ""; }

    int seen = 0;
    for (int i = 0; i < n; i++) {
      if (seen + T[n - i - 1] * T[i] > index) {

        int dindex = index - seen;
        int indexl = dindex / T[n - i - 1];
        int indexr = dindex % T[n - i - 1];
        
        String r1 = find(i, indexl);
        String shifted = find(n - i - 1, indexr);
        String r2 = "";

        for (int j = 0; j < shifted.length(); j++) {
          r2 += (char)(i + 1 + (int)shifted.charAt(j));
        }

        return (char)(i + 'a') + r1 + r2;
      }

      seen += T[n - i - 1] * T[i];
    }

    return "";
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
