package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 497 Division I Level Two - 550
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8779&rd=14426
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+497
public class CssRules {
  static public final int COLORS = 7;
  static public final int TAGS = 3;

  public int getMinimalCssRuleCount(String[] xhtml) {
    String html = join(xhtml);
    Tag root    = parse(html);

    int res = 0;
    for (Tag t : root.sons) {
      res += countRules(t, new int[] { -1, -1, -1 }, 0);
    }

    return res;
  }

  int countRules(Tag t, int[] colors, int phase) {
    int a = colors[0], b = colors[1], c = colors[2];

    if (t.memo[a + 1][b + 1][c + 1][phase] > -1) {
      return t.memo[a + 1][b + 1][c + 1][phase];
    }

    int count = 0; 

    if (phase == 3) {
      for (Tag s : t.sons) {
        count += countRules(s, colors, 0);
      }
    } else {
      int best   = Integer.MAX_VALUE / 4;
      int[] next = colors.clone();
      int cost   = 0;

      for (int color = -1; color < COLORS; color++) {
        next[phase] = color == -1 ? colors[phase] : color;
        cost        = color == -1 ? 0 : 1;
        best        = Math.min(best, cost + countRules(t, next, phase + 1));
      }

      count += (phase == 0 && colors[t.name] != t.color) ? 1 : 0;
      count += best;
    }

    t.memo[a + 1][b + 1][c + 1][phase] = count;
    return count;
  }

  Tag parse(String input) {
    Tag root = new Tag("root", "", "");
    Stack<Tag> tags = new Stack<Tag>();

    tags.push(root);
    while (input.length() > 0) {
      Result next = parseTag(input);
      input = next.rest;
      if (next.tag == null) {
        tags.pop();
      } else {
        tags.peek().sons.add(next.tag);
        tags.push(next.tag);
      }
    }

    return root;
  }

  Result parseTag(String text) {
    int endIndex = text.indexOf(">");
    String tag   = text.substring(1, endIndex);
    String rest  = text.substring(endIndex + 1, text.length());

    if (tag.charAt(0) == '/') {
      return new Result(null, rest);
    } else {
      String[] parts = tag.split("\\s+");
      String name = parts[0];
      String id = parseAttr(parts[1]);
      String color = parseAttr(parts[2]);
      return new Result(new Tag(name, id, color), rest);
    }
  }

  String parseAttr(String input) {
    int index      = input.indexOf("'");
    String attr    = input.substring(index + 1, input.length() - 1);
    String[] parts = attr.split(":");
    return parts.length == 2 ? parts[1] : parts[0];
  }

  String join(String[] input) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < input.length; i++) {
      builder.append(input[i]);
    }
    return builder.toString();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Result {
    public final Tag tag;
    public final String rest;

    public Result(Tag tag, String rest) {
      this.tag  = tag;
      this.rest = rest;
    }
  }

  class Tag {
    public final int name;
    public final int color;
    public final String id;
    public final List<Tag> sons;
    public int[][][][] memo;

    public Tag(String name, String id, String color) {
      this.name  = getNameValue(name);
      this.color = getColorValue(color);
      this.id    = id;
      this.sons  = new ArrayList<Tag>();
      this.memo  = new int[COLORS + 1][COLORS + 1][COLORS + 1][4];

      for (int i = 0; i < memo.length; i++) {
        for (int j = 0; j < memo[0].length; j++) {
          for (int k = 0; k < memo[0][0].length; k++) {
            Arrays.fill(memo[i][j][k], -1);
          }
        }
      }
    }

    private int getNameValue(String name) {
      if (name.equals("b")) { return 0; }
      if (name.equals("u")) { return 1; }
      if (name.equals("i")) { return 2; }
      return -1;
    }

    private int getColorValue(String color) {
      if (color.equals("black"))  { return 0; }
      if (color.equals("blue"))   { return 1; }
      if (color.equals("gray"))   { return 2; }
      if (color.equals("green"))  { return 3; }
      if (color.equals("red"))    { return 4; }
      if (color.equals("white"))  { return 5; }
      if (color.equals("yellow")) { return 6; }
      return -1;
    }

    public void print(String pad) {
      System.out.println(pad + this.toString());
      for (Tag t : sons) {
        t.print(pad + "  ");
      }
    }

    public String toString() {
      return String.format("%s %s:%s", name, id, color);
    }
  }
}
