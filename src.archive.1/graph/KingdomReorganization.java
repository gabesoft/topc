package topc.graph;

import java.util.*;
import java.io.*;

// SRM 531 Division II Level Three - 950
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11282&rd=14724
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+531
public class KingdomReorganization {
    public int getCost(String[] kingdom, String[] build, String[] destroy) {
        int n           = kingdom.length;
        int massiveCost = 0;
        int mstCost     = 0;

        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (kingdom[i].charAt(j) == '0') {
                    edges.add(new Edge(i, j, getValue(build[i].charAt(j))));
                } else {
                    int val = getValue(destroy[i].charAt(j));
                    edges.add(new Edge(i, j, -val));
                    massiveCost += val;
                }
            }
        }

        Collections.sort(edges);
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = i;
        }

        for (int i = 0; i < edges.size(); i++) {
            Edge e = edges.get(i);

            if (color[e.a] != color[e.b]) {
                mstCost += e.cost;

                int oldColor = color[e.b];
                for (int j = 0; j < n; j++) {
                    if (color[j] == oldColor) {
                        color[j] = color[e.a];
                    }
                }
            }
        }

        return massiveCost + mstCost;
    }

    int getValue(char c) {
        return (c >= 'A' && c <= 'Z') ? c - 'A' : c - 'a' + 26;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Edge implements Comparable<Edge> {
        public int a;
        public int b;
        public int cost;

        public Edge(int a, int b, int cost) {
            this.a    = a;
            this.b    = b;
            this.cost = cost;
        }

        public int compareTo(Edge e) {
            return cost - e.cost;
        }
    }
}
