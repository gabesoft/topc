package topc.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import topc.test.easy.*;
import topc.test.bfs.*;
import topc.test.bkt.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  //BusinessTasksTest.class,
  //TallPeopleTest.class,
  //TableSeatingTest.class,
  //MedalTableTest.class,
  //SmartWordToyTest.class,
  //RevolvingDoorsTest.class,
  BridgeCrossingTest.class
})
public class AllTests { }
