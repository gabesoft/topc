package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 218 Division II Level Three - 1000
// recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3093&rd=5864
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm218
public class PermissionTree {
  Node tree;

  public int[] findHome(String[] folders, String[] users) {
    buildTree(folders);

    int[] homes = new int[users.length];
    for (int i = 0; i < users.length; i++) {
      homes[i] = find(tree, users[i]);
    }

    return homes;
  }

  int find(Node tree, String user) {
    if (tree.users.contains(user)) { return tree.index; }

    int index = 0;
    int count = 0;

    for (Node son : tree.sons) {
      int temp = find(son, user);
      if (temp > -1) {
        index = temp;
        count++;
      }
    }

    if (count == 0) { return -1; }
    if (count == 1) { return index; }
    return tree.index;
  }

  void buildTree(String[] folders) {
    int n = folders.length;
    Node[] nodes = new Node[n];

    for (int i = 0; i < n; i++) {
      String[] parts = folders[i].split("\\s+");
      String[] users = parts[1].split(",");
      int parent = Integer.parseInt(parts[0]);
      nodes[i] = new Node(i, parent);
      for (int j = 0; j < users.length; j++) {
        nodes[i].users.add(users[j]);
      }
    }

    for (int i = 1; i < n; i++) {
      Node node = nodes[i];
      nodes[node.parent].sons.add(node);
    }

    tree = nodes[0];
  }

  void printTree(Node tree) {
    debug(tree);
    for (int i = 0; i < tree.sons.size(); i++) {
      printTree(tree.sons.get(i));
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final Set<String> users;
    public final List<Node> sons;
    public final int index;
    public final int parent;

    public Node(int index, int parent) {
      this.users  = new HashSet<String>();
      this.sons   = new ArrayList<Node>();
      this.index  = index;
      this.parent = parent;
    }

    public String toString() {
      return String.format("I:%s, P:%s, S:%s, U:%s", index, parent, sons.size(), users.size());
    }
  }
}
