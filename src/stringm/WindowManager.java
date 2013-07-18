package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 200 Division I Level One - 300
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2415&rd=5075
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm200
public class WindowManager {
    public String[] screen(int height, int width, String[] windows) {
        char[][] data = new char[height][width];

        for (int i = 0; i < data.length; i++) {
            Arrays.fill(data[i], ' ');
        }

        for (int i = 0; i < windows.length; i++) {
            String[] parts = windows[i].split("\\s+");

            int tlv   = Integer.parseInt(parts[0]);
            int tlh   = Integer.parseInt(parts[1]);
            int vs    = Integer.parseInt(parts[2]);
            int hs    = Integer.parseInt(parts[3]);
            char fill = parts.length == 5 ? parts[4].charAt(0) : ' ';

            drawWindow(data, tlv, tlh, vs, hs, fill);
        }

        String[] r = new String[height];
        for (int i = 0; i < height; i++) {
            r[i] = new String(data[i]);
        }

        return r;
    }

    private void drawWindow(char[][] screen, int tlv, int tlh, int vs, int hs, char fill) {
        if (tlv < 0 && tlh < 0) {
            draw(screen, 0, 0, -tlv, -tlh, vs, hs, fill);
        }
        else if (tlv < 0 && tlh >= 0) {
            draw(screen, 0, tlh, -tlv, 0, vs, hs, fill);
        }
        else if (tlv >= 0 && tlh < 0) {
            draw(screen, tlv, 0, 0, -tlh, vs, hs, fill);
        }
        else if (tlv >= 0 && tlh >= 0) {
            draw(screen, tlv, tlh, 0, 0, vs, hs, fill);
        }
    }

    private void draw(char[][] screen, int dr, int dc, int wr, int wc, int vs, int hs, char fill) {
        for (int i = 0; i + dr < screen.length && i + wr < vs; i++) {
            for (int j = 0; j + dc < screen[0].length && j + wc < hs; j++) {
                screen[dr + i][dc + j] = getFillChar(wr + i, wc + j, vs ,hs, fill);
            }
        }
    }

    private char getFillChar(int r, int c, int vs, int hs, char fill) {
        if (r == 0 && c == 0) { return '+'; }
        if (r == 0 && c == hs - 1) { return '+'; }
        if (r == vs - 1 && c == 0) { return '+'; }
        if (r == vs - 1 && c == hs - 1) { return '+'; }
        if (r == 0 || r == vs - 1) { return '-'; }
        if (c == 0 || c == hs - 1) { return '|'; }
        return fill;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
