package topc.graph;

import java.util.*;
import java.io.*;

// SRM 350 Division II Level Three - 1000
// graph theory, simulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7587&rd=10674
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm350
public class BagsQuiz {
    HashMap<Integer, Bag> map; 

    public int checkIfProper(int n, String[] actions) {
        map = new HashMap<Integer, Bag>();

        for (int i = 0; i < n; i++) {
            map.put(i + 1, new Bag(i + 1));
        }

        for (int i = 0; i < actions.length; i++) {
            if (!perform(new Action(actions[i]))) {
                return -1;
            }
        }

        for (Bag b : map.values()) {
            if (!b.proper()) {
                return -1;
            }
        }

        return map.size();
    }

    boolean perform(Action action) {
        int t  = action.type;
        int i1 = action.i1;
        int i2 = action.i2;

        switch (t) {
            case 0:
                if (map.containsKey(i1) && map.containsKey(i2)) {
                    Bag b1 = map.get(i1);
                    Bag b2 = map.get(i2);

                    map.remove(i1);

                    b2.add(b1);

                    return true;
                } else {
                    return false;
                }
            case 1: 
                if (map.containsKey(i1)) {
                    Bag b = map.get(i1);
                    List<Bag> contents = b.clear();
                    for (Bag c : contents) {
                        map.put(c.index, c);
                    }
                    return true;
                } else {
                    return false;
                }
            case 2: 
                if (map.containsKey(i1) && map.containsKey(i2)) {
                    Bag b1 = map.get(i1);
                    Bag b2 = map.get(i2);

                    List<Bag> l1 = b1.clear();
                    List<Bag> l2 = b2.clear();

                    b1.add(l2);
                    b2.add(l1);

                    return true;
                } else {
                    return false;
                }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Action {
        public final int type;
        public final int i1;
        public final int i2;

        public Action(String action) {
            String parts[] = action.split("\\s+");

            if (parts[0].equals("PUT")) {
                type = 0;
                i1   = Integer.parseInt(parts[1]);
                i2   = Integer.parseInt(parts[3]);
            }
            else if (parts[0].equals("SET")) {
                type = 1;
                i1   = Integer.parseInt(parts[1]);
                i2   = -1;
            }
            else if (parts[0].equals("SWAP")) {
                type = 2;
                i1   = Integer.parseInt(parts[1]);
                i2   = Integer.parseInt(parts[3]);
            } else {
                type = -1;
                i1   = -1;
                i2   = -1;
            }
        }
    }

    class Bag {
        ArrayList<Bag> contents;
        public final int index;

        public Bag(int index) {
            this.index    = index;
            this.contents = new ArrayList<Bag>();
        }

        public void add(Bag bag) {
            contents.add(bag);
        }

        public void add(List<Bag> bags) {
            contents.addAll(bags);
        }

        public List<Bag> clear() {
            ArrayList<Bag> temp = contents;
            contents = new ArrayList<Bag>();
            return temp;
        }

        public boolean proper() {
            for (int i = 0; i < contents.size(); i++) {
                Bag b = contents.get(i);
                if (b.index > index || !b.proper()) {
                    return false;
                }
            }
            return true;
        }
    }
}
