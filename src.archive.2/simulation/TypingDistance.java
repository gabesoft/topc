package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 560 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12297&rd=15182
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+560
public class TypingDistance {
  public int minDistance(String keyboard, String word) {
    int[] chars = new int[26];
    for (int i = 0; i < keyboard.length(); i++) {
      chars[keyboard.charAt(i)- 'a'] = i + 1;
    }

    int dist = 0;
    int loc = chars[word.charAt(0) - 'a'];
    for (char c : word.toCharArray()) {
      int l = chars[c - 'a'];
      dist += Math.abs(l - loc);
      loc = l;
    }

    return dist;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
