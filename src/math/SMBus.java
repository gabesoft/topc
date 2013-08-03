package topc.math;

import java.util.*;
import java.io.*;

// SRM 162 Division II Level Three - 1000
// simple math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1841&rd=4615
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm162
public class SMBus {
    public int transmitTime(String[] messages, int[] times) {
        return solve1(messages, times);
        //return solve2(messages, times);
    }

    private int solve2(String[] messages, int[] times) {
        int n = times.length;

        Message[] msg = new Message[n];
        for (int i = 0; i < n; i++) {
            msg[i] = new Message(messages[i], times[i]);
        }

        int transmitted = 0;
        int time = 0;
        while (transmitted < n) {
            for (int i = 0; i < n; i++) {
                if (!msg[i].done) {
                    msg[i].transmitting = true;
                }
            }

            int bit = 0;
            boolean transmitting = true;
            while (transmitting) {
                int t  = 0;
                char k = '9';

                for (int i = 0; i < n; i++) {
                    if (msg[i].transmitting) {
                        t = Math.max(t, msg[i].time);
                        if (bit < msg[i].data.length()) {
                            char c = msg[i].data.charAt(bit);
                            if (c < k) {
                                k = c;
                            }
                        } else {
                            msg[i].transmitting = false;
                            msg[i].done = true;
                            transmitted++;
                            transmitting = false;
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    if (msg[i].transmitting && msg[i].data.charAt(bit) > k) {
                        msg[i].transmitting = false;
                    }
                }

                if (transmitting) {
                    time += t;
                    bit++;
                }
            }
        }

        return time;
    }

    public int solve1(String[] messages, int[] times) {
        int n = times.length;

        Message[] msg = new Message[n];
        for (int i = 0; i < n; i++) {
            msg[i] = new Message(messages[i], times[i]);
        }

        Arrays.sort(msg);

        int[][] slowest = new int[n][n];
        for (int i = 0; i < n; i++) {
            int best = msg[i].time;
            slowest[i][i] = best;
            for (int j = i + 1; j < n; j++) {
                best = Math.max(best, msg[j].time);
                slowest[i][j] = best;
            }
        }

        int time = 0;
        for (int i = 0; i < n; i++) {
            String d1 = msg[i].data;

            int l = d1.length();
            int r = 0;
            int k = 0;

            for (int j = n - 1; j > i; j--) {
                int t     = slowest[i][j];
                String d2 = msg[j].data;

                if (k >= d2.length()) { continue; }
                if (k >= l) {
                    k = l;
                    break;
                }
                if (k > 0 && d1.charAt(k - 1) != d2.charAt(k - 1)) {
                    continue;
                }

                while (k < l && d1.charAt(k) == d2.charAt(k)) {
                    k++;
                    time += t;
                }

                if (k < l) {
                    k++;
                    time += t;
                }
            }

            time += (l - k) * msg[i].time;
        }

        return time;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Message implements Comparable<Message> {
        public final String data;
        public final int time;
        public boolean transmitting;
        public boolean done;

        public Message(String d, int t) {
            data = d;
            time = t;
        }

        public int compareTo(Message m) {
            return data.compareTo(m.data);
        }

        public String toString() {
            return String.format("%s:%s:%s", data, time, done ? 'D' : (transmitting ? 'T' : 'S'));
        }
    }
}
