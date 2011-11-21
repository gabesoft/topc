package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 168 Division I Level Two - 500
// string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1874&rd=4645
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm168
public class DirectoryTree {
  String[][] paths;

  public String[] display(String[] files) {
    Arrays.sort(files);

    paths = new String[files.length][];

    for (int i = 0; i < files.length; i++) {
      paths[i] = files[i].split("/");
      paths[i][0] = "ROOT";
    }

    Node root = new Node(paths[0][0]);
    parse(root, 0, 0);

    ArrayList<String> res = root.display();
    return res.toArray(new String[res.size()]);
  }

  int parse(Node parent, int index, int start) {
    Node node = null;

    for (int i = start; i < paths.length; i++) {
      String[] path = paths[i];

      if (path.length < index + 1 || !samePrefix(start, i, index)) {
        return i - 1;
      }

      if (path.length > index + 1) {
        node = new Node(path[index + 1]);
        parent.items.add(node);
        i    = parse(node, index + 1, i);
      }
    }

    return paths.length;
  }

  boolean samePrefix(int i, int j, int index) {
    for (int k = index; k > -1; k--) {
      if (!paths[i][k].equals(paths[j][k])) {
        return false;
      }
    }
    return true;
  }


  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final String name;
    public ArrayList<Node> items;

    public Node(String name) {
      this.name  = name;
      this.items = new ArrayList<Node>();
    }

    public ArrayList<String> display() {
      ArrayList<String> lines = new ArrayList<String>();
      String lead = name == "ROOT" ? "" : "-";
      lines.add(lead + name);

      int count = 0;
      for (Node n : items) {
        count++;
        lead = "+";
        for (String l : n.display()) {
          lines.add(lead + l);
          lead = count < items.size() ? "| " : "  ";
        }
      }

      return lines;
    }

    public String toString() {
      return String.format("%s:%s", name, items.size());
    }
  }
}
