package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class LeftOrRightTest {
  LeftOrRight leftorright = new LeftOrRight();

  @Test
  public void case1() {
    String program = "LLLRLRRR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case2() {
    String program = "R???L";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case3() {
    String program = "??????";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case4() {
    String program = "LL???RRRRRRR???";
    assertEquals(11, leftorright.maxDistance(program));
  }

  @Test
  public void case5() {
    String program = "L?L?";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case6() {
    String program = "?";
    assertEquals(1, leftorright.maxDistance(program));
  }

  @Test
  public void case7() {
    String program = "L";
    assertEquals(1, leftorright.maxDistance(program));
  }

  @Test
  public void case8() {
    String program = "R";
    assertEquals(1, leftorright.maxDistance(program));
  }

  @Test
  public void case9() {
    String program = "??????????????????????????????????????????????????";
    assertEquals(50, leftorright.maxDistance(program));
  }

  @Test
  public void case10() {
    String program = "R?LRRRLLRLRLLLR??L??RRRLRL??L?RLR";
    assertEquals(9, leftorright.maxDistance(program));
  }

  @Test
  public void case11() {
    String program = "L??RL?LR?LRL?RLLL?L?L??RLR?R";
    assertEquals(15, leftorright.maxDistance(program));
  }

  @Test
  public void case12() {
    String program = "?LR???R?R?LLLLLRLR?RR?????LL??RR?R?LR??RL??LL?";
    assertEquals(22, leftorright.maxDistance(program));
  }

  @Test
  public void case13() {
    String program = "??R";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case14() {
    String program = "?RLRL?LL???LR?R?L?RRRL?????R?LRLR";
    assertEquals(15, leftorright.maxDistance(program));
  }

  @Test
  public void case15() {
    String program = "??RL?RLLL???L???L?R?LLLLRL??LRRLRRRL";
    assertEquals(21, leftorright.maxDistance(program));
  }

  @Test
  public void case16() {
    String program = "R?";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case17() {
    String program = "LRRLRRL???R?RL??L?LR?R??R??R?R";
    assertEquals(18, leftorright.maxDistance(program));
  }

  @Test
  public void case18() {
    String program = "?L??LLLR???LLLR?";
    assertEquals(12, leftorright.maxDistance(program));
  }

  @Test
  public void case19() {
    String program = "LRLRRRLRRLL?RRR?L??L?R???L?R?RLL";
    assertEquals(14, leftorright.maxDistance(program));
  }

  @Test
  public void case20() {
    String program = "LL???LRRLLLL??LLLL??RL?????R??L?LR?RLR?L?RL?LR";
    assertEquals(29, leftorright.maxDistance(program));
  }

  @Test
  public void case21() {
    String program = "RLLLLR?RL?LR?LRRL???LR??RL";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case22() {
    String program = "LRLR????RR?L?LL?R?R?LL?LR?R??RL?RLR?RL?LRR???RRLL";
    assertEquals(23, leftorright.maxDistance(program));
  }

  @Test
  public void case23() {
    String program = "?L";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case24() {
    String program = "R?L?R??L?R??LR??L??LLL?LL??LRL?R?LL?";
    assertEquals(24, leftorright.maxDistance(program));
  }

  @Test
  public void case25() {
    String program = "?RR?RLL?RRR???RL?R??RL?LR????";
    assertEquals(19, leftorright.maxDistance(program));
  }

  @Test
  public void case26() {
    String program = "?LR??LR?LL??RLRL??L?LLLR?L?RRRL?RRL";
    assertEquals(17, leftorright.maxDistance(program));
  }

  @Test
  public void case27() {
    String program = "LRL?RLRL?RL?LR?????LR?LR?LL";
    assertEquals(13, leftorright.maxDistance(program));
  }

  @Test
  public void case28() {
    String program = "RLRRLL??R?RL?R?RL?LRLLL?RLRLL?";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case29() {
    String program = "?LL??LLRRLLLLRRLL?L?RL?RLLLLRRR?L";
    assertEquals(16, leftorright.maxDistance(program));
  }

  @Test
  public void case30() {
    String program = "?LRR?RRLLRLR?RRRLRRR?R??RR???L";
    assertEquals(19, leftorright.maxDistance(program));
  }

  @Test
  public void case31() {
    String program = "????R?RRLLRL?LR?RRR?LRRR?RRLR??LR??LLL";
    assertEquals(21, leftorright.maxDistance(program));
  }

  @Test
  public void case32() {
    String program = "R???L?????RLL?LLRL";
    assertEquals(12, leftorright.maxDistance(program));
  }

  @Test
  public void case33() {
    String program = "???L?LRRR?R???RR???LL?R?RLR???L?R??L?LR?LR?RRRRRL";
    assertEquals(30, leftorright.maxDistance(program));
  }

  @Test
  public void case34() {
    String program = "RRL????LLLL???RL?R?R?R";
    assertEquals(11, leftorright.maxDistance(program));
  }

  @Test
  public void case35() {
    String program = "RRRL??R?R?L?RRL??RL?R?LR???R???LRLL?";
    assertEquals(21, leftorright.maxDistance(program));
  }

  @Test
  public void case36() {
    String program = "???RR?LRLRLLRR?R??L?LRL?LLR?RLLL?L?LL??LL?";
    assertEquals(22, leftorright.maxDistance(program));
  }

  @Test
  public void case37() {
    String program = "L?RRR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case38() {
    String program = "LL?RR?RLR?LLRLLL??RLR?RR????";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case39() {
    String program = "RRRLR???RRLR?L???LR";
    assertEquals(11, leftorright.maxDistance(program));
  }

  @Test
  public void case40() {
    String program = "?RLLLLLRRLLLR??L?RL?RL?RLR?LRLRRLL?LR?R";
    assertEquals(14, leftorright.maxDistance(program));
  }

  @Test
  public void case41() {
    String program = "??RL??RRLRL?L?RRL?LRRRR?LR??LR????L??R?RLRLL??LR";
    assertEquals(22, leftorright.maxDistance(program));
  }

  @Test
  public void case42() {
    String program = "L?LL?R?RLL??LRL?R?LL?RLL?L????LR";
    assertEquals(21, leftorright.maxDistance(program));
  }

  @Test
  public void case43() {
    String program = "R??R?R?L??L??LRR?";
    assertEquals(11, leftorright.maxDistance(program));
  }

  @Test
  public void case44() {
    String program = "??LRL?RLRL?LR?LRRRL?RRLL";
    assertEquals(8, leftorright.maxDistance(program));
  }

  @Test
  public void case45() {
    String program = "LLR?RRL?R?RL?LLRL?L?LL?R?LR??";
    assertEquals(13, leftorright.maxDistance(program));
  }

  @Test
  public void case46() {
    String program = "RLLRLRLLL?RL??R??R?R?RRL???RLL?";
    assertEquals(12, leftorright.maxDistance(program));
  }

  @Test
  public void case47() {
    String program = "?RRRLR???L?RL?LRRR?RRRRRL?LL";
    assertEquals(16, leftorright.maxDistance(program));
  }

  @Test
  public void case48() {
    String program = "?RL????";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case49() {
    String program = "L?RLRRLRL?L";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case50() {
    String program = "LRLL?RL?LRR??";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case51() {
    String program = "L?LLLLLLRR?RLL?R?R?LRLLRRL??LRR??L???L";
    assertEquals(18, leftorright.maxDistance(program));
  }

  @Test
  public void case52() {
    String program = "RRLRL?RRLLR?LR?L?RLRR?L???LLLLL?L??LRLL?";
    assertEquals(18, leftorright.maxDistance(program));
  }

  @Test
  public void case53() {
    String program = "?LL????R";
    assertEquals(7, leftorright.maxDistance(program));
  }

  @Test
  public void case54() {
    String program = "??LL??";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case55() {
    String program = "LR?LR??R??LLL";
    assertEquals(7, leftorright.maxDistance(program));
  }

  @Test
  public void case56() {
    String program = "RLLLRL?L?LLL?L???R?LR?R?LRRR??LLLRL?LRLRR?LRLRL???";
    assertEquals(22, leftorright.maxDistance(program));
  }

  @Test
  public void case57() {
    String program = "R??LLL?R?L";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case58() {
    String program = "R???R?R?R?RLLLLL?L?LRR??L???L????RRLL?RR?LRLL";
    assertEquals(21, leftorright.maxDistance(program));
  }

  @Test
  public void case59() {
    String program = "LLR??LLR???R?L?L";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case60() {
    String program = "?R???????R?L???L?????R?L???R?R?L???????????R??????";
    assertEquals(42, leftorright.maxDistance(program));
  }

  @Test
  public void case61() {
    String program = "????L??LR??????R?R?R?????R?????????L????R???R";
    assertEquals(39, leftorright.maxDistance(program));
  }

  @Test
  public void case62() {
    String program = "?R??L??L??????L???L???????L?????L????R??L?????R?";
    assertEquals(42, leftorright.maxDistance(program));
  }

  @Test
  public void case63() {
    String program = "?????R??????L???R???????LRL?L??L?L?RL??R??????R?";
    assertEquals(36, leftorright.maxDistance(program));
  }

  @Test
  public void case64() {
    String program = "??????L??????R?RLLR?????R?????L?????R?RL?";
    assertEquals(31, leftorright.maxDistance(program));
  }

  @Test
  public void case65() {
    String program = "R???L?RR?R???????RR????????????R?L??????LR???";
    assertEquals(39, leftorright.maxDistance(program));
  }

  @Test
  public void case66() {
    String program = "???L??R????L???????RR???????L????????????R?";
    assertEquals(37, leftorright.maxDistance(program));
  }

  @Test
  public void case67() {
    String program = "L?L?R???R????????L?L????????????????????????";
    assertEquals(40, leftorright.maxDistance(program));
  }

  @Test
  public void case68() {
    String program = "L??????L????????L?????L???R?L?L??L??????RL???";
    assertEquals(41, leftorright.maxDistance(program));
  }

  @Test
  public void case69() {
    String program = "RR?L????RL???L??????LL???????????????????RL?????";
    assertEquals(40, leftorright.maxDistance(program));
  }

  @Test
  public void case70() {
    String program = "LRRLRLRRLRRRRLRLLRRRLRLRRLLLRRRLLRRLRRRR";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case71() {
    String program = "RRLLLLLRLRRLLRLLRRLLLLRRRRLLRRLLRLRRRLLRLLRRRRL";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case72() {
    String program = "LLLRLLRLRLLRLRLLRRLRRRLRRLLRRLLRRRRLLRRRLLRRL";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case73() {
    String program = "RLLLRRRRRLLLLLLLRRRRLLLLRLRRRRLLRLLRRRRRLLRRLRRLL";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case74() {
    String program = "RLLLLRLLRLRRRRLLRLLLRRLLRRLRRRLLLLRRLRRLLRLRLLRLRR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case75() {
    String program = "RRLRRRLLRRLLLLRLLRRRLRRLLLRLRLLRRLLRRLRLLLRLR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case76() {
    String program = "LRRRLLRRLLLRLLRRLRRLLLRRLRLRRLLRLLRRLRLLLRLLL";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case77() {
    String program = "RRLLRLLLRRLLLLRLRLRRRLLLRRLLRRRRLLRRRLLLLLLRLR";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case78() {
    String program = "LLLLLRRLLLLRLRRRLLLRRRLRLRRRRRLRLLLLRLLRRLRLRRLRRL";
    assertEquals(7, leftorright.maxDistance(program));
  }

  @Test
  public void case79() {
    String program = "LLLRRRLRRRLRLLRLLRRLLRRLLLLLRRLLRLRLRRRRRRRLR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case80() {
    String program = "?LLRLLL?LLLLLLLR?LLRLRLLRRLRRRRRR?L?LLLLRRLLRRR";
    assertEquals(16, leftorright.maxDistance(program));
  }

  @Test
  public void case81() {
    String program = "LLRRRLLLRRLL?LLLRLRLRR?RRLRRRLLLL?LRLLLLL?LLLR";
    assertEquals(15, leftorright.maxDistance(program));
  }

  @Test
  public void case82() {
    String program = "LLLRLLLLLLLLRRRLLRLLLR??RLLLRRLRRRLRR?LLRLLRLLLLR?";
    assertEquals(16, leftorright.maxDistance(program));
  }

  @Test
  public void case83() {
    String program = "LRLLRRRRLRLRRLLLRLRRRL?LL?RLLRRLLLLLRLLL?LRRLLR";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case84() {
    String program = "LLLLLRRRRLRRRRLRLRRRL?LRLRLLRLLLRLRLLRL?RRLRRLRRR";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case85() {
    String program = "L?RLRL??RRRRLLLRLLRRRRLLRRLRRRRRRLRRLLRRLLRLRRR";
    assertEquals(13, leftorright.maxDistance(program));
  }

  @Test
  public void case86() {
    String program = "R?RRLRRRRRLRRRLLRLRRRLRRRRRRRLRRLLRLRRLRLLRLR";
    assertEquals(18, leftorright.maxDistance(program));
  }

  @Test
  public void case87() {
    String program = "LLLLRRRRLRLRLRLRLLRRLLLLLLLRLLL?RRRRRLRLRLL?LRLLRL";
    assertEquals(10, leftorright.maxDistance(program));
  }

  @Test
  public void case88() {
    String program = "LRLRLRRR?RLRLLRRRLRRLLRLRLRLLRRLRLRLRRRRR?LRR";
    assertEquals(11, leftorright.maxDistance(program));
  }

  @Test
  public void case89() {
    String program = "RLRLRRL?LLRRLRLLRRL?RLRRRRRRLL?RLRLRRLLRLRLLRLR";
    assertEquals(9, leftorright.maxDistance(program));
  }

  @Test
  public void case90() {
    String program = "RRLL?";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case91() {
    String program = "?LL?RRR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case92() {
    String program = "L??????L????R??R??RR????R?R???R?RR?LL?L???????R?";
    assertEquals(38, leftorright.maxDistance(program));
  }

  @Test
  public void case93() {
    String program = "RRRR????LLL";
    assertEquals(8, leftorright.maxDistance(program));
  }

  @Test
  public void case94() {
    String program = "L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?";
    assertEquals(26, leftorright.maxDistance(program));
  }

  @Test
  public void case95() {
    String program = "????????????????????????????????????????????????LL";
    assertEquals(50, leftorright.maxDistance(program));
  }

  @Test
  public void case96() {
    String program = "LLRR??R";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case97() {
    String program = "RRR???LLL";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case98() {
    String program = "RL??RL";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case99() {
    String program = "R?????????????L????????L???????????????????????L";
    assertEquals(46, leftorright.maxDistance(program));
  }

  @Test
  public void case100() {
    String program = "L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?L?";
    assertEquals(50, leftorright.maxDistance(program));
  }

  @Test
  public void case101() {
    String program = "LLR?";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case102() {
    String program = "LLLLLRR?";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case103() {
    String program = "LR??????";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case104() {
    String program = "L??RR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case105() {
    String program = "LLRRLLRRR";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case106() {
    String program = "RL???";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case107() {
    String program = "LRLRLRLLLL???RRRRR";
    assertEquals(7, leftorright.maxDistance(program));
  }

  @Test
  public void case108() {
    String program = "L?R??";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case109() {
    String program = "LL?RRR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case110() {
    String program = "RR???????????????????????????????????LLL";
    assertEquals(37, leftorright.maxDistance(program));
  }

  @Test
  public void case111() {
    String program = "?LL?R?R";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case112() {
    String program = "L?R?LR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case113() {
    String program = "RRLLL";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case114() {
    String program = "RR??LL??LL??R?R";
    assertEquals(8, leftorright.maxDistance(program));
  }

  @Test
  public void case115() {
    String program = "LRR??RRRLLLLLLL";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case116() {
    String program = "R?LL?R";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case117() {
    String program = "LL?RR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case118() {
    String program = "LLLR??RRR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case119() {
    String program = "L???RR?L";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case120() {
    String program = "L??R";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case121() {
    String program = "L?RL?RL?RL?RL?RL?RL?R";
    assertEquals(8, leftorright.maxDistance(program));
  }

  @Test
  public void case122() {
    String program = "??????????????????????????????????????????????L???";
    assertEquals(50, leftorright.maxDistance(program));
  }

  @Test
  public void case123() {
    String program = "LRR?LLLLLLLL";
    assertEquals(8, leftorright.maxDistance(program));
  }

  @Test
  public void case124() {
    String program = "?LLRR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case125() {
    String program = "LR?";
    assertEquals(1, leftorright.maxDistance(program));
  }

  @Test
  public void case126() {
    String program = "LLLRRR????";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case127() {
    String program = "LL?RRR??";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case128() {
    String program = "L???R";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case129() {
    String program = "RRR?";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case130() {
    String program = "?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L?R?L";
    assertEquals(26, leftorright.maxDistance(program));
  }

  @Test
  public void case131() {
    String program = "L?L?RR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case132() {
    String program = "L?R?";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case133() {
    String program = "???R??L";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case134() {
    String program = "?LR";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case135() {
    String program = "LL???RRR";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case136() {
    String program = "RRRRRLL??";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case137() {
    String program = "LRR";
    assertEquals(1, leftorright.maxDistance(program));
  }

  @Test
  public void case138() {
    String program = "R?L?";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case139() {
    String program = "LL???RRR???R?RR???L";
    assertEquals(14, leftorright.maxDistance(program));
  }

  @Test
  public void case140() {
    String program = "LL?RLRR";
    assertEquals(3, leftorright.maxDistance(program));
  }

  @Test
  public void case141() {
    String program = "L?R";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case142() {
    String program = "??LL??RR";
    assertEquals(6, leftorright.maxDistance(program));
  }

  @Test
  public void case143() {
    String program = "RRRRLL?";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case144() {
    String program = "LLRR??";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case145() {
    String program = "LLLLLLLLLLLLLLLRRRLLLLLLLLLL";
    assertEquals(22, leftorright.maxDistance(program));
  }

  @Test
  public void case146() {
    String program = "RRLLLL?LRRR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case147() {
    String program = "RRRRRLL?";
    assertEquals(5, leftorright.maxDistance(program));
  }

  @Test
  public void case148() {
    String program = "?L?R?L?R?RLR?R?R?L?R?LLL?L?RLRL?RL?L?L?R?L?R?L?R?L";
    assertEquals(24, leftorright.maxDistance(program));
  }

  @Test
  public void case149() {
    String program = "LR?RL";
    assertEquals(2, leftorright.maxDistance(program));
  }

  @Test
  public void case150() {
    String program = "LL??RR";
    assertEquals(4, leftorright.maxDistance(program));
  }

  @Test
  public void case151() {
    String program = "RRL";
    assertEquals(2, leftorright.maxDistance(program));
  }

}
