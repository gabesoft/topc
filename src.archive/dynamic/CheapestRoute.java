package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 407 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9794&rd=12179
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm407
public class CheapestRoute {
    int N;
    int TP;
    int [] CP;
    int [][] graph;

    public int[] routePrice(int[] cellPrice, int[] enterCell, int[] exitCell, int teleportPrice) {
        N     = cellPrice.length;
        TP    = teleportPrice;
        CP    = cellPrice;
        graph = new int[N][N]; 

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == i - 1 || j == i + 1) {
                    if (cellPrice[j] > -1) {
                        graph[i][j] = 1;
                    }
                }
            }
        }

        for (int k = 0; k < enterCell.length; k++) {
            int i = enterCell[k];
            int j = exitCell[k];
            if (cellPrice[j] > -1) {
                graph[i][j] = (graph[i][j] == 1 || graph[i][j] == 3) ? 3 : 2;
            }
        }

        for (int i = 0; i < N; i++) {
            graph[i][i] = 0;
        }

        Node last         = null;
        boolean [][] seen = new boolean[N][N];
        Queue<Node> nodes = new PriorityQueue<Node>();

        nodes.offer(new Node(0, 0, 0, 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.cell == N - 1) {
                last = top;
                break;
            }

            if (top.tp >= N || seen[top.cell][top.tp]) { continue; }

            seen[top.cell][top.tp] = true;

            int cell  = top.cell;
            int price = top.price;
            int moves = top.moves;
            int tp    = top.tp;

            for (int i = 0; i < N; i++) {
                if (graph[cell][i] == 1) {          // adj only
                    nodes.offer(new Node(i, price + CP[i], moves + 1, tp));
                } else if (graph[cell][i] == 2) {   // teleport only
                    nodes.offer(new Node(i, price + TP + tp, moves + 1, tp + 1));
                } else if (graph[cell][i] > 2) {    // both adj & teleport
                    nodes.offer(new Node(i, price + CP[i], moves + 1, tp));
                    nodes.offer(new Node(i, price + TP + tp, moves + 1, tp + 1));
                }
            }
        }

        int[] res = last == null ? new int[] {} : new int[] { last.price, last.moves };

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int cell;
        public final int price;
        public final int moves;
        public final int tp;

        public Node(int cell, int price, int moves, int tp) {
            this.cell  = cell;
            this.price = price;
            this.moves = moves;
            this.tp    = tp;
        }

        public int compareTo(Node other) {
            if (price != other.price) { 
                return Integer.valueOf(price).compareTo(other.price);
            } else {
                return Integer.valueOf(moves).compareTo(other.moves);
            }
        }
    }
}
