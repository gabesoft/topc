package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 168 Division I Level Two - 500
// string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1874&rd=4645
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm168
public class DirectoryTree {
  public String[] display(String[] files) {
    Arrays.sort(files);

    String[][] paths = new String[files.length][];

    for (int i = 0; i < files.length; i++) {
      paths[i] = files[i].split("/");
      paths[i][0] = "ROOT";
    }

    Node root = new Node("ROOT", 0);
    parse(root, paths, 0, 0);
    
    ArrayList<String> res = root.display();
    return res.toArray(new String[res.size()]);
  }

  int parse(Node parent, String[][] paths, int index, int start) {
    Node node = null;

    for (int i = start; i < paths.length; i++) {
      if (paths[i].length < index + 1) { return i - 1; }

      for (int j = index; j > -1; j--) {
        if (!paths[i][j].equals(paths[parent.index][j])) {
          return i - 1;
        }
      }

      if (paths[i].length > index + 1) {
        if (node == null || !node.name.equals(paths[i][index + 1])) {
          node = new Node(paths[i][index + 1], i);
          i = parse(node, paths, index + 1, i);
          parent.items.add(node);
        }
      }
    }

    return paths.length - 1;
  }


  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final int index;
    public final String name;
    public ArrayList<Node> items;

    public Node(String name, int index) {
      this.name  = name;
      this.index = index;
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
