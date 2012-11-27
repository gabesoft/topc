package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 438 Division I Level Two - 500
// recursion, simulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10355&rd=13803
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+438
public class EndlessStringMachine {
    String _input;
    String _program;
    long[] len;

    public String getFragment(String input, String program, int s, int min, int max) {
        _input   = input;
        _program = program;

        int wcards = 0;
        String cst = "";

        for (int i = 0; i < program.length(); i++) {
            char c = program.charAt(i);
            if (c == '$') {
                wcards++;
            } else {
                cst += c;
            }
        }

        if (wcards == 1) { return get1(input, cst, s, min - 1, max - 1); }

        s   = Math.min(s, 40);
        len = new long[s];

        int i = 0;

        len[0] = input.length();
        for (i = 1; i < s; i++) {
            len[i] = len[i - 1] * wcards + (program.length() - wcards);
            if (len[i] > max) { break; }
        }

        String ans = "";
        s          = i;

        for (int j = min - 1; j < max; j++) {
            ans += get(s, j);
        }

        return ans;
    }

    String get1(String input, String program, int s, int from, int to) {
        long len   = input.length() + (program.length() * 1L * s);
        long isz   = input.length();
        int plen   = program.length();
        String ans = "";

        for (int i = from; i < to + 1; i++) {
            if (i < len) {
                if (i < isz) {
                    ans += input.charAt(i);
                } else {
                    ans += program.charAt((int)((i - isz) % plen));
                }
            } else {
                ans += "-";
            }
        }

        return ans;
    }

    char get(int s, long pos) {
        if (s == 0) {
            if (pos < _input.length()) {
                return _input.charAt((int)pos);
            } else {
                return '-';
            }
        }

        for (int i = 0; i < _program.length(); i++) {
            if (_program.charAt(i) == '$') {
                if (len[s - 1] > pos) {
                    return get(s - 1, pos);
                } else {
                    pos = pos - len[s - 1];
                }
            } else {
                if (pos == 0) {
                    return _program.charAt(i);
                } else {
                    pos--;
                }
            }
        }

        return '-';
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
