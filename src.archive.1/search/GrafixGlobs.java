package topc.search;

import java.util.*;
import java.io.*;

// SRM 211 Division II Level Three - 900
// search, simulation, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2999&rd=5857
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm211
public class GrafixGlobs {
    public int[] execute(String[] commands, int sel) {
        Glob[] globs = new Glob[1000];

        for (int i = 0; i < commands.length; i++) {
            run(commands[i], globs);
        }

        if (globs[sel] == null) { return new int[0]; }

        return globs[sel].data;
    }

    private void run(String command, Glob[] globs) {
        String[] cmd = command.split("\\s+");
        if (cmd[0].equals("make")) {
            make(cmd[1], globs);
        }
        if (cmd[0].equals("delete")) {
            delete(Integer.parseInt(cmd[1]), globs);
        }
        if (cmd[0].equals("merge")) {
            merge(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), globs);
        }
        if (cmd[0].equals("split")) {
            split(Integer.parseInt(cmd[1]), globs);
        }
    }

    private String numToObj(int k) {
        switch (k) {
            case 0: return "arc";
            case 1: return "circle";
            case 2: return "polygon";
            default: return null;
        }
    }

    private void split(int id, Glob[] globs) {
        Glob g    = globs[id];
        globs[id] = null;

        for (int i = 0; i < g.data.length; i++) {
            String obj = numToObj(i);
            for (int j = 0; j < g.data[i]; j++) {
                make(obj, globs);
            }
        }
    }

    private void merge(int dst, int src, Glob[] globs) {
        globs[dst].add(globs[src]);
        delete(src, globs);
    }

    private void delete(int id, Glob[] globs) {
        globs[id] = null;
    }

    private void make(String obj, Glob[] globs) {
        Glob g = new Glob(obj);
        for (int i = 0; i < globs.length; i++) {
            if (globs[i] == null) {
                globs[i] = g;
                return;
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Glob {
        public final int[] data;

        public Glob(String obj) {
            data = new int[3];
            if (obj.equals("arc")) {
                data[0]++;
            }
            if (obj.equals("circle")) {
                data[1]++;
            }
            if (obj.equals("polygon")) {
                data[2]++;
            }
        }

        public void add(Glob g) {
            for (int i = 0; i < g.data.length; i++) {
                data[i] += g.data[i];
            }
        }
    }
}
