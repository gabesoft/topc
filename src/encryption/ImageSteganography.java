package topc.encryption;

import java.util.*;
import java.io.*;

// SRM 225 Division II Level Three - 1000
// encryption/compression, simple math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3094&rd=5871
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm225
public class ImageSteganography {
    public String[] encode(String[] image, String message) {
        int rows[] = new int[image.length];

        rows[0] = image[0].length();
        for (int i = 1; i < rows.length; i++) {
            rows[i] = rows[i - 1] + image[i].length();
        }

        char img[] = new char[rows[rows.length - 1]];
        for (int i = 0; i < image.length; i++) {
            int s = i == 0 ? 0 : rows[i - 1];
            for (int j = 0; j < image[i].length(); j++) {
                img[s + j] = image[i].charAt(j);
            }
        }

        int px    = img.length / 3;
        int msg[] = new int[px * 2];
        convert(message, msg);

        for (int i = 0; i < msg.length / 2; i++) {
            int mi = i * 2;
            int ii = i * 3;

            int b1 = msg[mi];
            int b2 = msg[mi + 1];

            set(img, ii, b1, b2);
        }

        String res[] = new String[image.length];
        for (int i = 0; i < rows.length; i++) {
            int s    = i == 0 ? 0 : rows[i - 1];
            char c[] = Arrays.copyOfRange(img, s, rows[i]);
            res[i]   = new String(c);
        }

        return res;
    }

    private void convert(String message, int[] msg) {
        Arrays.fill(msg, 1);

        int k = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int n  = 0;

            if (Character.isUpperCase(c)) { n = c - 'A' + 1; }
            else if (Character.isLowerCase(c)) { n = c - 'a' + 27; }
            else if (Character.isDigit(c)) { n = c - '0' + 53; }

            int[] bytes = toBytes(n, 6);
            for (int j = bytes.length - 1; j > -1; j--) {
                msg[k++] = bytes[j];
            }
        }
    }

    private char[] set(char img[], int pos, int a, int b) {
        int n = 0;
        for (int i = pos; i < pos + 3; i++) {
            n *= 10;
            n += (int)(img[i] - '0');
        }

        int bytes[] = toBytes(n, 8);

        bytes[7] = a;
        bytes[6] = b;

        int k = toInt(bytes);
        for (int i = pos + 2; i > pos - 1; i--) {
            img[i] = (char)((k % 10) + '0');
            k /= 10;
        }

        return img;
    }

    private int[] toBytes(int n, int l) {
        int bytes[] = new int[l];
        int k       = l - 1;
        while (n > 0) {
            bytes[k--] = n % 2;
            n /= 2;
        }
        return bytes;
    }

    private int toInt(int[] bytes) {
        int n = 0;
        for (int i = 0; i < bytes.length; i++) {
            n *= 2;
            n += bytes[i];
        }
        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
