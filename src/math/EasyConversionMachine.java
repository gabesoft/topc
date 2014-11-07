package topc.math;

import java.util.*;
import java.io.*;

// SRM 550 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12125&rd=15172
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+550
public class EasyConversionMachine {
  public String isItPossible(String originalWord, String finalWord, int k) {
    int cnt = 0;
    for (int i = 0; i < originalWord.length(); i++) {
      if (originalWord.charAt(i) != finalWord.charAt(i)) {
        cnt++;
      }
    }

    if (cnt > k) {
      return "IMPOSSIBLE";
    }
    if ((k - cnt) % 2 == 0) {
      return "POSSIBLE";
    }
    
    return "IMPOSSIBLE";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
