package topc.graph;

import java.util.*;
import java.io.*;

// Member Beta Division I Level One - 250
// graph theory, string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10377&rd=13935
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class ErdosNumber {
    public String[] calculateNumbers(String[] pub) {
        HashMap<String, Integer> en = new HashMap<String, Integer>();

        LinkedList<String> queue = new LinkedList<String>();

        queue.offer("ERDOS");
        en.put("ERDOS", 0);

        while (queue.size() > 0) {
            String top = queue.poll();

            //if (en.containsKey(top)) { continue; }

            //en.put(top, n++);

            int n = en.get(top) + 1;
            for (int i = 0; i < pub.length; i++) {
                String[] names = pub[i].split("\\s+");
                boolean match = false;

                for (String name : names) {
                    if (name.equals(top)) {
                        match = true;
                    }
                }

                if (!match) { continue; }

                for (String name : names) {
                    if (!en.containsKey(name)) {
                        queue.offer(name);
                        en.put(name, n);
                    }
                }
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        HashSet<String> added = new HashSet<String>();
        for (String p : pub) {
            String[] names = p.split("\\s+");
            for (String name : names) {
                if (added.contains(name)) { continue; }
                if (en.containsKey(name)) {
                    res.add(name + " " + en.get(name));
                } else {
                    res.add(name);
                }
                added.add(name);
            }
        }

        Collections.sort(res);

        return res.toArray(new String[0]);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
