package topc.parsing;

import java.util.*;
import java.io.*;

// SRM 234 Division II Level Three - 1000
// string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4021&rd=6533
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm234
public class DerivationDisplay {
    HashMap<Character, String> rules;

    public String[] getDerivation(String input) {
        rules = new HashMap<Character, String>();

        rules.put('S', "T:bUa");
        rules.put('T', "aTb:A:B");
        rules.put('U', "aU:bU:a:b");
        rules.put('A', "aA:a");
        rules.put('B', "bB:b");

        String used = parse("S#", input + "#");
        used        = "S:" + used.substring(0, used.length() - 1);

        String res[] = used.split(":");

        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1].replaceAll("(S|T|U|A|B)", res[i]);
        }

        return res;
    }

    private String parse(String rule, String input) {
        if (input.equals(rule)) { return ""; }

        if (Character.isUpperCase(rule.charAt(0))) {
            String next[] = rules.get(rule.charAt(0)).split(":");

            for (int i = 0; i < next.length; i++) {
                String rest = parse(next[i] + rule.substring(1), input);
                if (rest != null) {
                    return next[i] + ":" + rest;
                }
            }

            return null;
        } else {
            return (rule.charAt(0) == input.charAt(0))
                ? parse(rule.substring(1), input.substring(1))
                : null;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
