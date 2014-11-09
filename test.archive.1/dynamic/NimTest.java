package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NimTest {
  Nim nim = new Nim();

  @Test
  public void case1() {
    int K = 3;
    int L = 7;
    assertEquals(6, nim.count(K, L));
  }

  @Test
  public void case2() {
    int K = 4;
    int L = 13;
    assertEquals(120, nim.count(K, L));
  }

  @Test
  public void case3() {
    int K = 10;
    int L = 100;
    assertEquals(294844622, nim.count(K, L));
  }

  @Test
  public void case4() {
    int K = 123456789;
    int L = 12345;
    assertEquals(235511047, nim.count(K, L));
  }

  @Test
  public void case5() {
    int K = 1000000000;
    int L = 50000;
    assertEquals(428193537, nim.count(K, L));
  }

  @Test
  public void case6() {
    int K = 536870911;
    int L = 50000;
    assertEquals(876223480, nim.count(K, L));
  }

  @Test
  public void case7() {
    int K = 851074452;
    int L = 2;
    assertEquals(1, nim.count(K, L));
  }

  @Test
  public void case8() {
    int K = 730089759;
    int L = 2;
    assertEquals(0, nim.count(K, L));
  }

  @Test
  public void case9() {
    int K = 1;
    int L = 40896;
    assertEquals(0, nim.count(K, L));
  }

  @Test
  public void case10() {
    int K = 47019195;
    int L = 34646;
    assertEquals(934738423, nim.count(K, L));
  }

  @Test
  public void case11() {
    int K = 28936827;
    int L = 7782;
    assertEquals(40794182, nim.count(K, L));
  }

  @Test
  public void case12() {
    int K = 15812775;
    int L = 27956;
    assertEquals(283434976, nim.count(K, L));
  }

  @Test
  public void case13() {
    int K = 190196934;
    int L = 14059;
    assertEquals(123197951, nim.count(K, L));
  }

  @Test
  public void case14() {
    int K = 716672276;
    int L = 38338;
    assertEquals(882439375, nim.count(K, L));
  }

  @Test
  public void case15() {
    int K = 564627688;
    int L = 40604;
    assertEquals(665233567, nim.count(K, L));
  }

  @Test
  public void case16() {
    int K = 551590996;
    int L = 22234;
    assertEquals(363992923, nim.count(K, L));
  }

  @Test
  public void case17() {
    int K = 501224365;
    int L = 44457;
    assertEquals(11964323, nim.count(K, L));
  }

  @Test
  public void case18() {
    int K = 750221573;
    int L = 36803;
    assertEquals(555800014, nim.count(K, L));
  }

  @Test
  public void case19() {
    int K = 122533725;
    int L = 19341;
    assertEquals(975271918, nim.count(K, L));
  }

  @Test
  public void case20() {
    int K = 227305387;
    int L = 38046;
    assertEquals(971447731, nim.count(K, L));
  }

  @Test
  public void case21() {
    int K = 565831594;
    int L = 2631;
    assertEquals(268604770, nim.count(K, L));
  }

  @Test
  public void case22() {
    int K = 481490246;
    int L = 13783;
    assertEquals(757550261, nim.count(K, L));
  }

  @Test
  public void case23() {
    int K = 228141633;
    int L = 36534;
    assertEquals(485594440, nim.count(K, L));
  }

  @Test
  public void case24() {
    int K = 54449353;
    int L = 9112;
    assertEquals(91977500, nim.count(K, L));
  }

  @Test
  public void case25() {
    int K = 194584965;
    int L = 19828;
    assertEquals(308223866, nim.count(K, L));
  }

  @Test
  public void case26() {
    int K = 550322371;
    int L = 45058;
    assertEquals(244221498, nim.count(K, L));
  }

  @Test
  public void case27() {
    int K = 171797431;
    int L = 34438;
    assertEquals(323320897, nim.count(K, L));
  }

  @Test
  public void case28() {
    int K = 281798688;
    int L = 7792;
    assertEquals(852963488, nim.count(K, L));
  }

  @Test
  public void case29() {
    int K = 321381352;
    int L = 10171;
    assertEquals(428007308, nim.count(K, L));
  }

  @Test
  public void case30() {
    int K = 85887988;
    int L = 4263;
    assertEquals(683469806, nim.count(K, L));
  }

  @Test
  public void case31() {
    int K = 323770191;
    int L = 45291;
    assertEquals(982869581, nim.count(K, L));
  }

  @Test
  public void case32() {
    int K = 699092237;
    int L = 28631;
    assertEquals(736598097, nim.count(K, L));
  }

  @Test
  public void case33() {
    int K = 16549543;
    int L = 34382;
    assertEquals(985165586, nim.count(K, L));
  }

  @Test
  public void case34() {
    int K = 767705040;
    int L = 32768;
    assertEquals(547625054, nim.count(K, L));
  }

  @Test
  public void case35() {
    int K = 666736613;
    int L = 27191;
    assertEquals(22019280, nim.count(K, L));
  }

  @Test
  public void case36() {
    int K = 31716843;
    int L = 22317;
    assertEquals(733222216, nim.count(K, L));
  }

  @Test
  public void case37() {
    int K = 365187752;
    int L = 2470;
    assertEquals(606299899, nim.count(K, L));
  }

  @Test
  public void case38() {
    int K = 481611498;
    int L = 49584;
    assertEquals(575100255, nim.count(K, L));
  }

  @Test
  public void case39() {
    int K = 668594414;
    int L = 16577;
    assertEquals(144766160, nim.count(K, L));
  }

  @Test
  public void case40() {
    int K = 387434732;
    int L = 16918;
    assertEquals(94933056, nim.count(K, L));
  }

  @Test
  public void case41() {
    int K = 766926204;
    int L = 41335;
    assertEquals(879472853, nim.count(K, L));
  }

  @Test
  public void case42() {
    int K = 904008961;
    int L = 3484;
    assertEquals(243215073, nim.count(K, L));
  }

  @Test
  public void case43() {
    int K = 458414142;
    int L = 13935;
    assertEquals(322381875, nim.count(K, L));
  }

  @Test
  public void case44() {
    int K = 341109512;
    int L = 41310;
    assertEquals(334115532, nim.count(K, L));
  }

  @Test
  public void case45() {
    int K = 505789848;
    int L = 44167;
    assertEquals(28677620, nim.count(K, L));
  }

  @Test
  public void case46() {
    int K = 10679065;
    int L = 43320;
    assertEquals(629488938, nim.count(K, L));
  }

  @Test
  public void case47() {
    int K = 953574649;
    int L = 41567;
    assertEquals(5594684, nim.count(K, L));
  }

  @Test
  public void case48() {
    int K = 43207634;
    int L = 12019;
    assertEquals(332758612, nim.count(K, L));
  }

  @Test
  public void case49() {
    int K = 398226368;
    int L = 47292;
    assertEquals(472446227, nim.count(K, L));
  }

  @Test
  public void case50() {
    int K = 873001961;
    int L = 22611;
    assertEquals(951945451, nim.count(K, L));
  }

  @Test
  public void case51() {
    int K = 373230639;
    int L = 28921;
    assertEquals(67506826, nim.count(K, L));
  }

  @Test
  public void case52() {
    int K = 745069818;
    int L = 27514;
    assertEquals(209099483, nim.count(K, L));
  }

  @Test
  public void case53() {
    int K = 334207492;
    int L = 26341;
    assertEquals(583664177, nim.count(K, L));
  }

  @Test
  public void case54() {
    int K = 358114336;
    int L = 46180;
    assertEquals(492261604, nim.count(K, L));
  }

  @Test
  public void case55() {
    int K = 953932640;
    int L = 22668;
    assertEquals(463193303, nim.count(K, L));
  }

  @Test
  public void case56() {
    int K = 319284696;
    int L = 7511;
    assertEquals(956907403, nim.count(K, L));
  }

  @Test
  public void case57() {
    int K = 49192562;
    int L = 28763;
    assertEquals(601521510, nim.count(K, L));
  }

  @Test
  public void case58() {
    int K = 249031141;
    int L = 34952;
    assertEquals(658152522, nim.count(K, L));
  }

  @Test
  public void case59() {
    int K = 211399923;
    int L = 13944;
    assertEquals(884881845, nim.count(K, L));
  }

  @Test
  public void case60() {
    int K = 845326618;
    int L = 41943;
    assertEquals(506577188, nim.count(K, L));
  }

  @Test
  public void case61() {
    int K = 955614049;
    int L = 43395;
    assertEquals(741376939, nim.count(K, L));
  }

  @Test
  public void case62() {
    int K = 910405120;
    int L = 46728;
    assertEquals(997288401, nim.count(K, L));
  }

  @Test
  public void case63() {
    int K = 814826499;
    int L = 41505;
    assertEquals(955918704, nim.count(K, L));
  }

  @Test
  public void case64() {
    int K = 858808349;
    int L = 41094;
    assertEquals(527296394, nim.count(K, L));
  }

  @Test
  public void case65() {
    int K = 911564481;
    int L = 48531;
    assertEquals(585709562, nim.count(K, L));
  }

  @Test
  public void case66() {
    int K = 953774422;
    int L = 49539;
    assertEquals(74925937, nim.count(K, L));
  }

  @Test
  public void case67() {
    int K = 866980373;
    int L = 45595;
    assertEquals(740963104, nim.count(K, L));
  }

  @Test
  public void case68() {
    int K = 812971224;
    int L = 43152;
    assertEquals(844436000, nim.count(K, L));
  }

  @Test
  public void case69() {
    int K = 964955356;
    int L = 47010;
    assertEquals(400946565, nim.count(K, L));
  }

  @Test
  public void case70() {
    int K = 2;
    int L = 50000;
    assertEquals(5133, nim.count(K, L));
  }

}
