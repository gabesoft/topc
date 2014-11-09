package topc.stringm;

import java.util.*;
import java.io.*;

// TCHS10 Round 3 Division I Level One - 250
// string manipulation
// statement: http://community.topcoder.com/tc?module=HSProblemStatement&pm=10584&rd=14229
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TextFrames {
    public String[] generateFrame(int width, int height, String phrase, int x1, int y1, int x2, int y2) {
        int m = x2 - x1;
        int n = y2 - y1;

        phrase = phrase + '.';

        char[][] chars = new char[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(chars[i], '.');
        }

        if (y1 == 0) {
            fillHFwd(chars, phrase, x1);
        }

        if (y2 == height) {
            fillHBack(chars, getPhrase(phrase, width + height - 2), x2, width);
        }

        if (x1 == 0) {
            fillVUp(chars, getPhrase(phrase, 2 * width + height - 3), y2, height);
        }

        if (x2 == width) {
            fillVDown(chars, getPhrase(phrase, width - 1), y1);
        }

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = new String(chars[i]);
        }

        return res;
    }

    private String getPhrase(String str, int start) {
        int l = str.length();
        int s = start % l;

        String r = "";
        for (int i = 0; i < l; i++) {
            r += str.charAt((s + i) % l);
        }

        return r;
    }

    private void fillVUp(char[][] chars, String phrase, int start, int h) {
        int l = phrase.length();
        int s = (h - start) % l;

        int c = 0;
        int e = chars[0][c] == '.' ? -1 : 0;
        for (int i = chars.length - 1; i > e; i--) {
            int j = chars.length - i - 1;
            chars[i][c] = phrase.charAt((s + j) % l);
        }
    }

    private void fillHBack(char[][] chars, String phrase, int start, int w) {
        int l = phrase.length();
        int s = (w - start) % l;

        int r = chars.length - 1;
        for (int i = chars[r].length - 1; i > -1; i--) {
            int j = chars[r].length - i - 1;
            chars[r][i] = phrase.charAt((s + j) % l);
        }
    }

    private void fillVDown(char[][] chars, String phrase, int start) {
        int l = phrase.length();
        int s = start % l;

        int c = chars[0].length - 1;
        for (int i = 0; i < chars.length; i++) {
            chars[i][c] = phrase.charAt((s + i) % l);
        }
    }

    private void fillHFwd(char[][] chars, String phrase, int start) {
        int l = phrase.length();
        int s = start % l;

        int r = 0;
        for (int i = 0; i < chars[r].length; i++) {
            chars[r][i] = phrase.charAt((s + i) % l);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
