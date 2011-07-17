package topc.test.easy;

import junit.framework.*;
import topc.easy.*;

public class BusinessTasksTest extends TestCase {
  public BusinessTasksTest(String name) {
    super(name);
  }

  public void testCase1() throws Exception {
    String[] list = { "a","b","c","d" };
    int n = 2;
    BusinessTasks tasks = new BusinessTasks();
    String task = tasks.getTask(list, n);
    Assert.assertEquals("task", "a", task);
  }
}
