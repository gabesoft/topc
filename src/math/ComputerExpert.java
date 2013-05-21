package topc.math;

import java.util.*;
import java.io.*;

// SRM 236 Division II Level Three - 1000
// simple math, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4460&rd=6535
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm236
public class ComputerExpert {
    public String[] operate(String[] facts, String[] rules) {
        HashSet<String> state = new HashSet<String>();

        for (int i = 0; i < facts.length; i++) {
            state.add(facts[i]);
        }

        Rule[] R = new Rule[rules.length];
        for (int i = 0; i < rules.length; i++) {
            R[i] = new Rule(rules[i]);
        }

        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < R.length; i++) {
                changed |= R[i].fire(state);
            }
        }

        int k = 0;

        state.removeAll(Arrays.asList(facts));

        String outcome[] = new String[state.size()];
        for (String fact : state) {
            outcome[k++] = fact;
        }

        Arrays.sort(outcome);
        return outcome;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Rule {
        String[][] input;
        String output;

        public Rule(String definition) {
            String parts[] = definition.split("\\s+->\\s+");
            parseInput(parts[0]);
            output = parts[1];
        }

        private void parseInput(String data) {
            String[] facts = data.split(",");

            input = new String[facts.length][];
            for (int i = 0; i < facts.length; i++) {
                input[i] = facts[i].split("/");
            }
        }

        public boolean fire(HashSet state) {
            for (int i = 0; i < input.length; i++) {
                boolean found = false;
                for (int j = 0; j < input[i].length; j++) {
                    if (state.contains(input[i][j])) {
                        found = true;
                        break;
                    }
                }
                if (!found) { return false; }
            }

            return state.add(output);
        }
    }
}
