package topc.easy;

import java.util.*;

// SRM 236 Div 1 : 250
public class BusinessTasks {
    public String getTask(String[] list, int n) {
      List<String> tasks = new ArrayList<String>();
      for (int i = 0; i < list.length; i++) {
        tasks.add(list[i]);
      }

      int index = 0;
      int size = tasks.size();
      while (tasks.size() > 1) {
          index = ((n + index - 1) % tasks.size());
          tasks.remove(index);
      }
      return tasks.get(0);     
    }
}
