package topc.easy;

import java.util.*;
import java.io.*;

// SRM 289 Division II Level Three - 1000
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5920&rd=9810
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm289
public class GreenWave {
    public int[] getFirstRed(int L, int[] speeds, int[] lights) {
        if (lights.length == 0) { return new int[0]; }

        int counter[]  = new int[lights.length];
        boolean change = true;

        Arrays.fill(counter, 1);

        int best = -1;
        int bestLights[] = counter.clone();

        if (speeds.length == 0) { return bestLights; }

        while (change) {
            change = false;

            int time = calculate(speeds, lights, counter, L);
            if (best == -1 || time < best) {
                bestLights = counter.clone();
                best       = time;
            }

            for (int i = counter.length - 1; i >= 0; i--) {
                if (counter[i] < 5) {
                    counter[i]++;
                    change = true;
                    for (int j = i + 1; j < counter.length; j++) {
                        counter[j] = 1;
                    }
                    break;
                }
            }
        }

        return bestLights;
    }

    private int calculate(int[] speeds, int[] lightPos, int[] lightTime, int len) {
        int time       = 0;
        int clen       = speeds.length;
        int llen       = lightPos.length;
        Light[] lights = new Light[llen];
        Car cars[]     = new Car[clen];

        for (int i = 0; i < llen; i++) {
            lights[i] = new Light(lightPos[i], lightTime[i]);
        }

        for (int i = 0; i < clen; i++) {
            cars[i] = new Car(-1, speeds[i]);
        }

        while (cars[clen - 1].pos < len) {
            time++;

            int last = len + 1;
            for (int i = 0; i < clen; i++) {
                if (cars[i].pos >= len) { continue; }
                if (last == -1) { break; }

                last = move(cars, lights, i, last);
                last = last == len ? len + 1 : last;

                cars[i].pos = last;
            }

            for (int i = 0; i < llen; i++) {
                lights[i].tick();
            }
        }

        return time;
    }

    private int move(Car[] cars, Light[] lights, int k, int last) {
        Car c = cars[k];

        if (c.pos == -1) { return last > 0 ? 0 : -1; }

        int next = Math.min(c.pos + c.speed, last - 1);

        for (int i = 0; i < lights.length; i++) {
            Light l = lights[i];
            if (l.isRed() && c.pos <= l.pos && l.pos <= next) {
                next = l.pos;
            }
        }

        return next;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Car implements Comparable<Car> {
        public int speed;
        public int pos;

        public Car(int pos, int speed) {
            this.pos   = pos;
            this.speed = speed;
        }

        public int compareTo(Car other) {
            return other.pos - pos;
        }
    }

    public class Light {
        private int time;
        private boolean red;
        public int pos;

        public Light(int pos, int time) {
            this.time = time;
            this.pos  = pos;
            this.red  = true;
        }

        public boolean isRed() {
            return red;
        }

        public boolean isGreen() {
            return !red;
        }

        public void tick() {
            time--;

            if (time == 0) {
                red  = !red;
                time = 5;
            } 
        }
    }
}
