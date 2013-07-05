package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 220 Division II Level Three - 1100
// string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3070&rd=5866
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm220
public class TaglishTranslator {
    public String translate(String sentence) {
        return (new Sentence(sentence)).toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    private String join(String[] words, int k) {
        String r = "";

        for (int i = k; i < words.length; i++) {
            r += words[i];
            if (i < words.length - 1) {
                r += " ";
            }
        }

        return r;
    }

    private String[] toWords(String text) {
        return text.split("\\s+");
    }

    public class Subject {
        public String name;
        public String pre;

        public String parse(String text) {
            String[] words = toWords(text);
            boolean thing  = words[0].toLowerCase().equals("the");

            pre  = thing ? "ang" : "si";
            name = thing ? words[1] : words[0];

            return thing ? join(words, 2) : join(words, 1);
        }

        public boolean thing() {
            return pre.equals("ang");
        }

        public String toString() {
            return String.format("%s %s", pre, name);
        }
    }

    public class Verb {
        public String name;
        public String pre;
        public String syl;

        public String parse(String text) {
            String[] words    = toWords(text);
            boolean future = words[0].toLowerCase().equals("will");

            name = future ? words[1] : words[0];
            pre  = future ? "mag" : "nag";

            boolean past = name.toLowerCase().endsWith("ed");

            name = (past && !future) ? name.substring(0, name.length() - 2) : name;
            syl  = (past && !future) ? "" : firstSyl(name);

            return future ? join(words, 2) : join(words, 1);
        }

        public String toString() {
            return String.format("%s%s%s", pre, syl, name);
        }

        private String firstSyl(String text) {
            String syl = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                syl += c;
                if (vowel(c)) {
                    return syl;
                }
            }
            return syl;
        }

        private boolean vowel(char c) {
            return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
        }
    }

    public class Obj {
        public String name;
        public String pre;

        public String parse(String text) {
            String[] words = toWords(text);
            Subject s      = new Subject();
            boolean to = words[0].toLowerCase().equals("to");

            if (to) {
                s.parse(join(words, 1));
            } else {
                s.parse(text);
            }

            boolean thing = s.thing();

            name = s.name;
            pre  = to
                ? (thing ? "sa" : "kay")
                : (thing ? "ng" : "ni");

            return "";
        }

        public String toString() {
            return String.format("%s %s", pre, name);
        }
    }

    public class Sentence {
        Subject s;
        Obj o;
        Verb v;

        public Sentence(String text) {
            parse(text);
        }

        private void parse(String text) {
            s = new Subject();
            text = s.parse(text);

            v = new Verb();
            text = v.parse(text);

            o = null;
            if (text != null && text.length() > 0) {
                o = new Obj();
                o.parse(text);
            }
        }

        public String toString() {
            return o == null
                ? String.format("%s %s", v, s)
                : String.format("%s %s %s", v, s, o);
        }
    }
}
