package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 210 Division I Level Two - 500
// graph theory, recursion, sorting, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2930&rd=5856
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm210
public class HierarchicalTree {
  public String[] countDescendants(String[] parentData) {
    Map<String, Node> nodes = new HashMap<String, Node>();
    Set<String> seen        = new HashSet<String>();
    nodes.put("ROOT", new Node("ROOT"));

    String data = join(parentData);
    String[] items = data.split("\\s+");

    for (int i = 0; i < items.length; i++) {
      if (seen.contains(items[i])) { continue; }

      seen.add(items[i]);
      String[] parts  = items[i].split(",");

      if (parts.length < 2) { continue; }

      String child    = parts[0];
      String parent   = parts[1];
      if (!nodes.containsKey(parent)) {
        nodes.put(parent, new Node(parent));
      }
      if (!nodes.containsKey(child)) {
        nodes.put(child, new Node(child));
      }
      nodes.get(parent).sons.add(nodes.get(child));
    }

    Node root = nodes.get("ROOT");

    if (!valid(root, new HashSet<String>())) { return new String[0]; }
    if (root.size() < nodes.size()) { return new String[0]; }

    Object[] vals  = nodes.values().toArray();
    String[] sizes = new String[nodes.size()];

    for (int i = 0; i < sizes.length; i++) {
      Node n = (Node)vals[i];
      sizes[i] = String.format("%s: %s", n.name, n.size() - 1);
    }
    
    Arrays.sort(sizes);

    return sizes;
  }

  boolean valid(Node t, HashSet<String> set) {
    if (set.contains(t.name)) { return false; }
    set.add(t.name);

    boolean ok = true;
    for (Node c : t.sons) {
      if (c.name.equals("ROOT")) { return false; }
      ok = ok && valid(c, set);
    }

    return ok;
  }

  String join(String[] elements) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < elements.length; i++) {
      builder.append(elements[i]);
    }
    return builder.toString();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final String name;
    public final List<Node> sons;

    public Node(String name) {
      this.name = name;
      this.sons = new ArrayList<Node>();
    }

    public void print(String pre) {
      System.out.println(pre + name + "(" + size() + ")");
      for (Node c : sons) {
        c.print(pre + " ");
      }
    }

    public int size() {
      int sum = 1;
      for (Node c : sons) {
        sum += c.size();
      }
      return sum;
    }
  }
}
