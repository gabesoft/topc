package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 171 Division II Level Three - 900
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1942&rd=4660
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm171
public class TextEditor {
    public String[] twoColumn(String[] text, int width) {
        String all = "";
        for (int i = 0; i < text.length; i++) {
            all += text[i];
            all += " ";
        }

        String words[] = all.split("\\s+");
        ArrayList<String> column = new ArrayList<String>();

        String line = "";
        for (int i = 0; i < words.length; i++) {
            int len = line.length();
            if (len == 0) {
                line = words[i];
            } else if (len + words[i].length() + 1 <= width) {
                line += " ";
                line += words[i];
            } else {
                column.add(line);
                line = words[i];
            }
        }

        if (line.length() > 0) {
            column.add(line);
        }

        String[] res = new String[column.size()];
        int k = res.length - (res.length / 2);
        int j = 0;

        for (int i = 0; i < k; i++) {
            res[j++] = column.get(i);
            if (i + k < column.size()) {
                res[j++] = column.get(i + k);
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
