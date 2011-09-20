package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 170 Division II Level Three - 1000
// string manipulation
// http://community.topcoder.com/stat?c=problem_statement&pm=1835&rd=4655
public class Poetry {
  char[] LABELS = new char [] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

  public String rhymeScheme(String[] poem) {
    int n = poem.length;
    char[] labels = new char[n];
    String[] ends = new String[n];

    Arrays.fill(labels, ' ');

    for (int i = 0; i < n; i++) {
      if (!isEmpty(poem[i])) {
        ends[i] = getEnding(poem[i]);
      }
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (ends[i] == null) { continue; }
      for (int j = i - 1; j > -1; j--) {
        if (ends[i].equals(ends[j])) {
          labels[i] = labels[j];
          break;
        }
      }
      if (labels[i] == ' ') {
        labels[i] = LABELS[count++];
      }
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      builder.append(labels[i]);
    }

    return builder.toString();
  }

  String getEnding(String line) {
    String[] parts = line.toLowerCase().split("\\s+");
    String last = parts[parts.length - 1];

    int n = last.length();
    int s = 0;
    boolean vowelSeen = false;
    for (int i = n - 1; i > -1; i--) {
      char c = last.charAt(i);
      if (vowelSeen && !isVowel(c, i, n)) { 
        s = i + 1; 
        break;
      }
      if (!vowelSeen && isVowel(c, i, n)) { 
        vowelSeen = true; 
      }
    }

    return last.substring(s);
  }

  boolean isVowel(char c, int i, int n) {
    return (c == 'a')
        || (c == 'e')
        || (c == 'i')
        || (c == 'o')
        || (c == 'u')
        || (c == 'y' && i > 0 && i < n - 1);
  }

  boolean isEmpty(String str) {
    return str == null || str.trim().length() == 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
