package topc.recursion;

import java.util.*;
import java.util.regex.*;
import java.io.*;

// SRM 214 Division I Level Two - 600
// recursion, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3025&rd=5860
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm214
public class bloggoDocStructure {
  public String compare(String[] docA, String[] docB) {
    String a = join(docA);
    String b = join(docB);

    Node treea = parse(a);
    Node treeb = parse(b);

    boolean ainb = intree(treea, treeb, 0, 0);
    boolean bina = intree(treeb, treea, 0, 0);

    if (ainb && bina)   { 
      return "equivalent";
    }
    if (!ainb && !bina) { 
      return "incompatible";
    }
    if (ainb) {
      return "intree " +  (treeb.size() - treea.size());
    } else {
      return "outtree " + (treea.size() - treeb.size());
    }
  }

  boolean intree(Node a, Node b, int aix, int bix) {
    if (aix == 0 && bix == 0 && !a.text.equals(b.text)) { 
      return false;
    }
    if (aix == a.sons.size()) {
      return true;
    }
    if (bix == b.sons.size()) {
      return false;
    }
    if (intree(a.sons.get(aix), b.sons.get(bix), 0, 0)) {
      return intree(a, b, aix + 1, bix + 1);
    }
    return intree(a, b, aix, bix + 1);
  }

  Node parse(String html) {
    Stack<Node> stack = new Stack<Node>();

    html = trimWS(html);

    stack.push(new Node("root"));
    while (html.length() > 0) {
      html = trimText(html);
      String[] st = stag(html);
      String[] en = etag(html);

      if (st != null) {
        stack.push(new Node(st[0]));
        html = st[1];
      } 

      if (en != null) {
        Node last = stack.pop();
        html = en[1];
        stack.peek().sons.add(last);
      }
    }

    return stack.pop().sons.get(0);
  }

  String trimWS(String text) {
    return text.replaceAll("\\s+", "");
  }

  String trimText(String html) {
    return process(html, "^([^<]*)(.*)")[1];
  }

  String[] stag(String html) {
    return process(html, "^<([^/>]+)>(.*)");
  }

  String[] etag(String html) {
    return process(html, "^</([^>]+)>(.*)");
  }

  String[] process(String text, String pattern) {
    Pattern pat = Pattern.compile(pattern);
    Matcher mat = pat.matcher(text);
    if (mat.matches()) {
      return new String[] { mat.group(1), mat.group(2) };
    } else {
      return null;
    }
  }

  String join(String[] elements) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < elements.length; i++) {
      builder.append(elements[i]);
    }
    return builder.toString();
  }

  void print(Node t, String pre) {
    System.out.println(pre + t.text);
    for (Node c : t.sons) {
      print(c, pre + "  ");
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final String text;
    public final List<Node> sons;

    public Node(String text) {
      this.text = text;
      this.sons = new ArrayList<Node>();
    }

    public int size() {
      int sum = 1;
      for (Node c : sons) { sum += c.size(); }
      return sum;
    }
  }
}
