package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class YetAnotherORProblem2Test {
  YetAnotherORProblem2 yetanotherorproblem2 = new YetAnotherORProblem2();

  @Test
  public void case1() {
    int N = 2;
    int R = 2;
    assertEquals(7, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case2() {
    int N = 2;
    int R = 3;
    assertEquals(9, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case3() {
    int N = 3;
    int R = 3;
    assertEquals(16, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case4() {
    int N = 7;
    int R = 1023;
    assertEquals(73741815, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case5() {
    int N = 2;
    int R = 1;
    assertEquals(3, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case6() {
    int N = 2;
    int R = 1024;
    assertEquals(61097, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case7() {
    int N = 2;
    int R = 15000;
    assertEquals(4628299, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case8() {
    int N = 2;
    int R = 8192;
    assertEquals(1610707, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case9() {
    int N = 2;
    int R = 8191;
    assertEquals(1594323, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case10() {
    int N = 2;
    int R = 12414;
    assertEquals(3859991, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case11() {
    int N = 3;
    int R = 1;
    assertEquals(4, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case12() {
    int N = 3;
    int R = 7;
    assertEquals(64, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case13() {
    int N = 3;
    int R = 81;
    assertEquals(11980, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case14() {
    int N = 3;
    int R = 597;
    assertEquals(670708, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case15() {
    int N = 3;
    int R = 4235;
    assertEquals(30295792, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case16() {
    int N = 3;
    int R = 11111;
    assertEquals(208187968, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case17() {
    int N = 3;
    int R = 14336;
    assertEquals(256383985, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case18() {
    int N = 10;
    int R = 14336;
    assertEquals(713476067, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case19() {
    int N = 10;
    int R = 14335;
    assertEquals(713485067, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case20() {
    int N = 10;
    int R = 8192;
    assertEquals(710933233, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case21() {
    int N = 10;
    int R = 15000;
    assertEquals(604862946, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case22() {
    int N = 10;
    int R = 14889;
    assertEquals(122153261, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case23() {
    int N = 10;
    int R = 14999;
    assertEquals(504862946, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case24() {
    int N = 4;
    int R = 2;
    assertEquals(21, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case25() {
    int N = 4;
    int R = 412;
    assertEquals(1840049, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case26() {
    int N = 4;
    int R = 777;
    assertEquals(8797045, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case27() {
    int N = 4;
    int R = 1000;
    assertEquals(9762149, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case28() {
    int N = 4;
    int R = 10000;
    assertEquals(331991665, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case29() {
    int N = 5;
    int R = 5;
    assertEquals(186, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case30() {
    int N = 5;
    int R = 2048;
    assertEquals(606937681, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case31() {
    int N = 5;
    int R = 2166;
    assertEquals(236906422, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case32() {
    int N = 5;
    int R = 4842;
    assertEquals(524164130, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case33() {
    int N = 5;
    int R = 11555;
    assertEquals(153919913, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case34() {
    int N = 6;
    int R = 1;
    assertEquals(7, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case35() {
    int N = 6;
    int R = 124;
    assertEquals(823465, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case36() {
    int N = 6;
    int R = 8000;
    assertEquals(881512537, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case37() {
    int N = 6;
    int R = 8001;
    assertEquals(881792473, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case38() {
    int N = 6;
    int R = 8190;
    assertEquals(889009537, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case39() {
    int N = 6;
    int R = 8134;
    assertEquals(888746881, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case40() {
    int N = 6;
    int R = 14123;
    assertEquals(300553945, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case41() {
    int N = 7;
    int R = 9;
    assertEquals(3256, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case42() {
    int N = 7;
    int R = 898;
    assertEquals(66473638, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case43() {
    int N = 7;
    int R = 1900;
    assertEquals(575048607, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case44() {
    int N = 7;
    int R = 2011;
    assertEquals(589702008, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case45() {
    int N = 7;
    int R = 3093;
    assertEquals(991581192, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case46() {
    int N = 7;
    int R = 8900;
    assertEquals(987061820, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case47() {
    int N = 7;
    int R = 9999;
    assertEquals(721994547, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case48() {
    int N = 7;
    int R = 15000;
    assertEquals(536763508, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case49() {
    int N = 8;
    int R = 7;
    assertEquals(729, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case50() {
    int N = 8;
    int R = 8;
    assertEquals(4825, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case51() {
    int N = 8;
    int R = 13;
    assertEquals(6489, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case52() {
    int N = 8;
    int R = 422;
    assertEquals(382371713, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case53() {
    int N = 8;
    int R = 4774;
    assertEquals(38236942, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case54() {
    int N = 8;
    int R = 9041;
    assertEquals(696657728, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case55() {
    int N = 8;
    int R = 14336;
    assertEquals(463250579, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case56() {
    int N = 8;
    int R = 14136;
    assertEquals(164677824, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case57() {
    int N = 8;
    int R = 14333;
    assertEquals(743773888, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case58() {
    int N = 8;
    int R = 14408;
    assertEquals(362174879, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case59() {
    int N = 8;
    int R = 14493;
    assertEquals(949082868, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case60() {
    int N = 8;
    int R = 15000;
    assertEquals(621910852, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case61() {
    int N = 9;
    int R = 6;
    assertEquals(991, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case62() {
    int N = 9;
    int R = 99;
    assertEquals(9756100, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case63() {
    int N = 9;
    int R = 999;
    assertEquals(999828919, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case64() {
    int N = 9;
    int R = 9999;
    assertEquals(928944134, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case65() {
    int N = 9;
    int R = 8092;
    assertEquals(982796158, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case66() {
    int N = 9;
    int R = 14599;
    assertEquals(145822809, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case67() {
    int N = 9;
    int R = 14995;
    assertEquals(401807800, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case68() {
    int N = 9;
    int R = 15000;
    assertEquals(497998621, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case69() {
    int N = 10;
    int R = 13533;
    assertEquals(948229035, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case70() {
    int N = 10;
    int R = 13900;
    assertEquals(694816363, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case71() {
    int N = 10;
    int R = 14208;
    assertEquals(764767976, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case72() {
    int N = 10;
    int R = 12954;
    assertEquals(660459545, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case73() {
    int N = 9;
    int R = 12954;
    assertEquals(575289095, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case74() {
    int N = 10;
    int R = 13478;
    assertEquals(39129197, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case75() {
    int N = 9;
    int R = 14444;
    assertEquals(888515420, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case76() {
    int N = 2;
    int R = 10;
    assertEquals(59, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case77() {
    int N = 10;
    int R = 12345;
    assertEquals(846521329, yetanotherorproblem2.countSequences(N, R));
  }

  @Test
  public void case78() {
    int N = 9;
    int R = 14297;
    assertEquals(990869599, yetanotherorproblem2.countSequences(N, R));
  }

}
