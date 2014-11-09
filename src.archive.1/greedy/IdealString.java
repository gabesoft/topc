package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 405 Division II Level Three - 1000
// greedy, simple math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9757&rd=12177
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm405
public class IdealString {
    public String construct(int length) {
        int letters[] = find(length);
        return letters == null ? "" : makeString(letters, length);
    }

    String makeString(int[] letters, int len) {
        char[] chars = new char[len];

        Arrays.fill(chars, '.');

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > 0) {
                letters[i]--;
                chars[letters[i]] = (char)(i + 'A');
            }
        }

        int k = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i]; j++) {
                while (chars[k] != '.') {
                    k++;
                }
                chars[k] = (char)(i + 'A');
            }
        }

        return new String(chars);
    }

    int[] find(int len) {
        Queue<Node> nodes = new LinkedList<Node>();

        nodes.offer(new Node(letters(0, 1), 1, 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.len == len) { return top.letters; }
            if (top.len >  len) { continue; }

            int letter = top.letter + 1;
            int prev   = top.letters[top.letter];

            for (int i = prev + prev; i > prev ; i--) {
                int nextLetters[] = top.letters.clone();
                nextLetters[letter] = i;
                nodes.offer(new Node(nextLetters, top.len + i, letter));
            }
        }

        return null;
    }

    int[] letters(int i, int v) {
        int[] data = new int[26];
        data[i] = v;
        return data;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node {
        public final int[] letters;
        public final int len;
        public final int letter;

        public Node(int[] letters, int len, int letter) {
            this.letters = letters;
            this.len     = len;
            this.letter  = letter;
        }
    }
}
