package topc.easy;

import java.util.*;

// SRM 233 Div 1 : 250
public class SmartWordToy {
  public int minPresses(String start, String finish, String[] forbid) {
    HashSet<String> forbidden = getForbidden(forbid);
    HashSet<String> seen = new HashSet<String>();
    Queue<Word> tree = new LinkedList<Word>();
    tree.add(new Word(start, 0));
    while (tree.size() > 0) {
      Word curr = tree.remove();
      if (curr.getWord().equals(finish)) {
        return curr.getLevel();
      }
      Word[] next = curr.getNext();
      for (int i = 0; i < next.length; i++) {
        if (!seen.contains(next[i].getWord()) && !forbidden.contains(next[i].getWord())) {
          seen.add(next[i].getWord());
          tree.add(next[i]);
        }
      }
    }
    return -1;
  }

  public HashSet<String> getForbidden(String[] forbid) {
    HashSet<String> set = new HashSet<String>();
    for (int i = 0; i < forbid.length; i++) {
      String[] items = forbid[i].split(" ");
      char[] a = items[0].toCharArray();
      char[] b = items[1].toCharArray();
      char[] c = items[2].toCharArray();
      char[] d = items[3].toCharArray();
      for (int j = 0; j < a.length; j++) {
        for (int k = 0; k < b.length; k++) {
          for (int p = 0; p < c.length; p++) {
            for (int q = 0; q < d.length; q++) {
              char[] word = { a[j], b[k], c[p], d[q] };
              set.add(new String(word));
            }
          }
        }
      }
    }
    return set;
  }

  class Word {
    int _level;
    String _word;

    public Word(String word, int level) {
      _word = word;
      _level = level;
    }

    public String getWord() {
      return _word;
    }

    public int getLevel() {
      return _level;
    }

    public Word[] getNext() {
      char[] chars = _word.toCharArray();
      Word[] next = new Word[chars.length * 2];
      int count = 0;
      for (int i = 0; i < chars.length; i++) {
        char[] fw = arrayCopy(chars);
        char[] bk = arrayCopy(chars);
        fw[i] = (fw[i] == 'z') ? 'a' : (char)(fw[i] + 1);
        bk[i] = (bk[i] == 'a') ? 'z' : (char)(bk[i] - 1);
        next[count++] = new Word(new String(fw), _level + 1);
        next[count++] = new Word(new String(bk), _level + 1);
      }
      return next;
    }

    char[] arrayCopy(char[] source) {
      char[] copy = new char[source.length];
      System.arraycopy(source, 0, copy, 0, copy.length);
      return copy;
    }
  }
}
