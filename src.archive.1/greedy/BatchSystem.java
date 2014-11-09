package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 481 Division II Level Three - 900
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10808&rd=14234
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+481
public class BatchSystem {
    public int[] schedule(int[] duration, String[] user) {
        int n = duration.length;
        HashMap<String, User> userMap = new HashMap<String, User>();

        for (int i = 0; i < n; i++) {
            String name = user[i];
            if (!userMap.containsKey(name)) {
                userMap.put(name, new User());
            }
            User u = userMap.get(name);
            u.addJob(i, duration[i]);
        }

        User[] users = new User[userMap.size()];
        int i = 0;
        for (User u : userMap.values()) {
            users[i++] = u;
        }

        Arrays.sort(users);

        int res[] = new int[n];
        i = 0;

        for (int j = 0; j < users.length; j++) {
            for (int k = 0; k < users[j].jobs.length; k++) {
                res[i++] = users[j].jobs[k];
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class User implements Comparable<User> {
        long time;
        public int jobs[];

        public User() {
            jobs = new int[0];
            time = 0;
        }

        public void addJob(int index, long value) {
            int temp[] = new int[jobs.length + 1];

            for (int i = 0; i < jobs.length; i++) {
                temp[i] = jobs[i];
            }

            temp[temp.length - 1] = index;

            jobs = temp;
            time += value;
        }

        public int compareTo(User other) {
            return (time == other.time) 
                ? Integer.valueOf(jobs[0]).compareTo(other.jobs[0])
                : Long.valueOf(time).compareTo(other.time);
        }

        public String toString() {
            return String.format("%s:%s", time, Arrays.toString(jobs));
        }
    }
}
