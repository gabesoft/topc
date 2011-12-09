package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LastMarbleTest {
  double DELTA = 1.0e-09;
  LastMarble lastmarble = new LastMarble();

  @Test
  public void case1() {
    int red = 1;
    int blue = 1;
    int removed = 0;
    assertEquals(0.5, lastmarble.winningChance(red, blue, removed), DELTA * 0.5);
  }

  @Test
  public void case1a() {
    int red = 1;
    int blue = 3;
    int removed = 0;
    assertEquals(0.5, lastmarble.winningChance(red, blue, removed), DELTA * 0.5);
  }

  @Test
  public void case2() {
    int red = 1;
    int blue = 2;
    int removed = 0;
    assertEquals(0.3333333333333333, lastmarble.winningChance(red, blue, removed), DELTA * 0.3333333333333333);
  }

  @Test
  public void case3() {
    int red = 2;
    int blue = 1;
    int removed = 0;
    assertEquals(0.6666666666666666, lastmarble.winningChance(red, blue, removed), DELTA * 0.6666666666666666);
  }

  @Test
  public void case4() {
    int red = 2;
    int blue = 2;
    int removed = 1;
    assertEquals(0.5, lastmarble.winningChance(red, blue, removed), DELTA * 0.5);
  }

  @Test
  public void case5() {
    int red = 2;
    int blue = 2;
    int removed = 0;
    assertEquals(0.5, lastmarble.winningChance(red, blue, removed), DELTA * 0.5);
  }

  @Test
  public void case6() {
    int red = 2;
    int blue = 3;
    int removed = 1;
    assertEquals(0.5, lastmarble.winningChance(red, blue, removed), DELTA * 0.5);
  }

  @Test
  public void case7() {
    int red = 100;
    int blue = 80;
    int removed = 43;
    assertEquals(0.4216037078891402, lastmarble.winningChance(red, blue, removed), DELTA * 0.4216037078891402);
  }

  @Test
  public void case8() {
    int red = 62;
    int blue = 100;
    int removed = 61;
    assertEquals(0.4994504504862716, lastmarble.winningChance(red, blue, removed), DELTA * 0.4994504504862716);
  }

  @Test
  public void case9() {
    int red = 13;
    int blue = 54;
    int removed = 12;
    assertEquals(0.5000024219602255, lastmarble.winningChance(red, blue, removed), DELTA * 0.5000024219602255);
  }

  @Test
  public void case10() {
    int red = 82;
    int blue = 11;
    int removed = 8;
    assertEquals(0.11817521401399665, lastmarble.winningChance(red, blue, removed), DELTA * 0.11817521401399665);
  }

  @Test
  public void case11() {
    int red = 9;
    int blue = 88;
    int removed = 7;
    assertEquals(0.5000002259107094, lastmarble.winningChance(red, blue, removed), DELTA * 0.5000002259107094);
  }

  @Test
  public void case12() {
    int red = 13;
    int blue = 13;
    int removed = 10;
    assertEquals(0.5386014268407592, lastmarble.winningChance(red, blue, removed), DELTA * 0.5386014268407592);
  }

  @Test
  public void case13() {
    int red = 85;
    int blue = 81;
    int removed = 4;
    assertEquals(0.5764413967652542, lastmarble.winningChance(red, blue, removed), DELTA * 0.5764413967652542);
  }

  @Test
  public void case14() {
    int red = 64;
    int blue = 22;
    int removed = 7;
    assertEquals(0.7472351111929894, lastmarble.winningChance(red, blue, removed), DELTA * 0.7472351111929894);
  }

  @Test
  public void case15() {
    int red = 65;
    int blue = 83;
    int removed = 20;
    assertEquals(0.5185751124455752, lastmarble.winningChance(red, blue, removed), DELTA * 0.5185751124455752);
  }

  @Test
  public void case16() {
    int red = 96;
    int blue = 12;
    int removed = 10;
    assertEquals(0.8889741569425456, lastmarble.winningChance(red, blue, removed), DELTA * 0.8889741569425456);
  }

  @Test
  public void case17() {
    int red = 86;
    int blue = 31;
    int removed = 3;
    assertEquals(0.7421302778328819, lastmarble.winningChance(red, blue, removed), DELTA * 0.7421302778328819);
  }

  @Test
  public void case18() {
    int red = 24;
    int blue = 57;
    int removed = 23;
    assertEquals(0.5000522970849155, lastmarble.winningChance(red, blue, removed), DELTA * 0.5000522970849155);
  }

  @Test
  public void case19() {
    int red = 97;
    int blue = 75;
    int removed = 73;
    assertEquals(0.5845540351942131, lastmarble.winningChance(red, blue, removed), DELTA * 0.5845540351942131);
  }

  @Test
  public void case20() {
    int red = 51;
    int blue = 9;
    int removed = 0;
    assertEquals(0.8524317274632858, lastmarble.winningChance(red, blue, removed), DELTA * 0.8524317274632858);
  }

  @Test
  public void case21() {
    int red = 86;
    int blue = 59;
    int removed = 55;
    assertEquals(0.6091897261664498, lastmarble.winningChance(red, blue, removed), DELTA * 0.6091897261664498);
  }

  @Test
  public void case22() {
    int red = 80;
    int blue = 100;
    int removed = 46;
    assertEquals(0.5121978695297171, lastmarble.winningChance(red, blue, removed), DELTA * 0.5121978695297171);
  }

  @Test
  public void case23() {
    int red = 78;
    int blue = 44;
    int removed = 31;
    assertEquals(0.6497194757614986, lastmarble.winningChance(red, blue, removed), DELTA * 0.6497194757614986);
  }

  @Test
  public void case24() {
    int red = 41;
    int blue = 11;
    int removed = 5;
    assertEquals(0.7896418621330925, lastmarble.winningChance(red, blue, removed), DELTA * 0.7896418621330925);
  }

  @Test
  public void case25() {
    int red = 40;
    int blue = 29;
    int removed = 9;
    assertEquals(0.6036529019611552, lastmarble.winningChance(red, blue, removed), DELTA * 0.6036529019611552);
  }

  @Test
  public void case26() {
    int red = 16;
    int blue = 56;
    int removed = 2;
    assertEquals(0.5061612336024184, lastmarble.winningChance(red, blue, removed), DELTA * 0.5061612336024184);
  }

  @Test
  public void case27() {
    int red = 83;
    int blue = 91;
    int removed = 66;
    assertEquals(0.5218310463315513, lastmarble.winningChance(red, blue, removed), DELTA * 0.5218310463315513);
  }

  @Test
  public void case28() {
    int red = 20;
    int blue = 20;
    int removed = 7;
    assertEquals(0.44732431189847655, lastmarble.winningChance(red, blue, removed), DELTA * 0.44732431189847655);
  }

  @Test
  public void case29() {
    int red = 95;
    int blue = 5;
    int removed = 50;
    assertEquals(0.9500012618293173, lastmarble.winningChance(red, blue, removed), DELTA * 0.9500012618293173);
  }

  @Test
  public void case30() {
    int red = 57;
    int blue = 43;
    int removed = 32;
    assertEquals(0.5897527114919747, lastmarble.winningChance(red, blue, removed), DELTA * 0.5897527114919747);
  }

  @Test
  public void case31() {
    int red = 98;
    int blue = 99;
    int removed = 9;
    assertEquals(0.5549408716962372, lastmarble.winningChance(red, blue, removed), DELTA * 0.5549408716962372);
  }

  @Test
  public void case32() {
    int red = 100;
    int blue = 99;
    int removed = 55;
    assertEquals(0.538811607390127, lastmarble.winningChance(red, blue, removed), DELTA * 0.538811607390127);
  }

  @Test
  public void case33() {
    int red = 11;
    int blue = 6;
    int removed = 3;
    assertEquals(0.6585326438267612, lastmarble.winningChance(red, blue, removed), DELTA * 0.6585326438267612);
  }

  @Test
  public void case34() {
    int red = 100;
    int blue = 99;
    int removed = 50;
    assertEquals(0.46051427662540095, lastmarble.winningChance(red, blue, removed), DELTA * 0.46051427662540095);
  }

  @Test
  public void case35() {
    int red = 100;
    int blue = 100;
    int removed = 1;
    assertEquals(0.5991135714248399, lastmarble.winningChance(red, blue, removed), DELTA * 0.5991135714248399);
  }

  @Test
  public void case36() {
    int red = 100;
    int blue = 91;
    int removed = 47;
    assertEquals(0.5538946523677721, lastmarble.winningChance(red, blue, removed), DELTA * 0.5538946523677721);
  }

  @Test
  public void case37() {
    int red = 99;
    int blue = 99;
    int removed = 67;
    assertEquals(0.5358956739211858, lastmarble.winningChance(red, blue, removed), DELTA * 0.5358956739211858);
  }

  @Test
  public void case38() {
    int red = 97;
    int blue = 99;
    int removed = 31;
    assertEquals(0.46114625866018377, lastmarble.winningChance(red, blue, removed), DELTA * 0.46114625866018377);
  }

  @Test
  public void case39() {
    int red = 92;
    int blue = 47;
    int removed = 32;
    assertEquals(0.6701217445821144, lastmarble.winningChance(red, blue, removed), DELTA * 0.6701217445821144);
  }

  @Test
  public void case40() {
    int red = 64;
    int blue = 72;
    int removed = 19;
    assertEquals(0.46922254012169823, lastmarble.winningChance(red, blue, removed), DELTA * 0.46922254012169823);
  }

  @Test
  public void case41() {
    int red = 99;
    int blue = 97;
    int removed = 45;
    assertEquals(0.5417278743133329, lastmarble.winningChance(red, blue, removed), DELTA * 0.5417278743133329);
  }

  @Test
  public void case42() {
    int red = 2;
    int blue = 1;
    int removed = 1;
    assertEquals(0.6666666666666666, lastmarble.winningChance(red, blue, removed), DELTA * 0.6666666666666666);
  }

  @Test
  public void case43() {
    int red = 100;
    int blue = 90;
    int removed = 50;
    assertEquals(0.5556434375451796, lastmarble.winningChance(red, blue, removed), DELTA * 0.5556434375451796);
  }

  @Test
  public void case44() {
    int red = 89;
    int blue = 97;
    int removed = 7;
    assertEquals(0.5490389082233603, lastmarble.winningChance(red, blue, removed), DELTA * 0.5490389082233603);
  }

  @Test
  public void case45() {
    int red = 97;
    int blue = 45;
    int removed = 90;
    assertEquals(0.6895963308978859, lastmarble.winningChance(red, blue, removed), DELTA * 0.6895963308978859);
  }

  @Test
  public void case46() {
    int red = 99;
    int blue = 99;
    int removed = 55;
    assertEquals(0.5371934243880638, lastmarble.winningChance(red, blue, removed), DELTA * 0.5371934243880638);
  }

  @Test
  public void case47() {
    int red = 83;
    int blue = 65;
    int removed = 70;
    assertEquals(0.5818289225880415, lastmarble.winningChance(red, blue, removed), DELTA * 0.5818289225880415);
  }

  @Test
  public void case48() {
    int red = 80;
    int blue = 90;
    int removed = 30;
    assertEquals(0.5265547855427535, lastmarble.winningChance(red, blue, removed), DELTA * 0.5265547855427535);
  }

  @Test
  public void case49() {
    int red = 34;
    int blue = 24;
    int removed = 4;
    assertEquals(0.6185907036904856, lastmarble.winningChance(red, blue, removed), DELTA * 0.6185907036904856);
  }

  @Test
  public void case50() {
    int red = 100;
    int blue = 95;
    int removed = 99;
    assertEquals(0.543295133829118, lastmarble.winningChance(red, blue, removed), DELTA * 0.543295133829118);
  }

  @Test
  public void case51() {
    int red = 100;
    int blue = 99;
    int removed = 23;
    assertEquals(0.5458414709117274, lastmarble.winningChance(red, blue, removed), DELTA * 0.5458414709117274);
  }

  @Test
  public void case52() {
    int red = 89;
    int blue = 45;
    int removed = 67;
    assertEquals(0.6721964691215772, lastmarble.winningChance(red, blue, removed), DELTA * 0.6721964691215772);
  }

  @Test
  public void case53() {
    int red = 43;
    int blue = 23;
    int removed = 12;
    assertEquals(0.6606590541851276, lastmarble.winningChance(red, blue, removed), DELTA * 0.6606590541851276);
  }

  @Test
  public void case54() {
    int red = 100;
    int blue = 100;
    int removed = 99;
    assertEquals(0.46611076490934306, lastmarble.winningChance(red, blue, removed), DELTA * 0.46611076490934306);
  }

  @Test
  public void case55() {
    int red = 98;
    int blue = 99;
    int removed = 97;
    assertEquals(0.532127978872529, lastmarble.winningChance(red, blue, removed), DELTA * 0.532127978872529);
  }

  @Test
  public void case56() {
    int red = 100;
    int blue = 97;
    int removed = 53;
    assertEquals(0.5423598480282926, lastmarble.winningChance(red, blue, removed), DELTA * 0.5423598480282926);
  }

  @Test
  public void case57() {
    int red = 100;
    int blue = 100;
    int removed = 67;
    assertEquals(0.46407275859308333, lastmarble.winningChance(red, blue, removed), DELTA * 0.46407275859308333);
  }

  @Test
  public void case58() {
    int red = 100;
    int blue = 85;
    int removed = 95;
    assertEquals(0.5652234349709567, lastmarble.winningChance(red, blue, removed), DELTA * 0.5652234349709567);
  }

  @Test
  public void case59() {
    int red = 98;
    int blue = 95;
    int removed = 47;
    assertEquals(0.5431138786479115, lastmarble.winningChance(red, blue, removed), DELTA * 0.5431138786479115);
  }

  @Test
  public void case60() {
    int red = 100;
    int blue = 97;
    int removed = 41;
    assertEquals(0.544132855739659, lastmarble.winningChance(red, blue, removed), DELTA * 0.544132855739659);
  }

  @Test
  public void case61() {
    int red = 99;
    int blue = 100;
    int removed = 93;
    assertEquals(0.5323520244419836, lastmarble.winningChance(red, blue, removed), DELTA * 0.5323520244419836);
  }

  @Test
  public void case62() {
    int red = 100;
    int blue = 100;
    int removed = 20;
    assertEquals(0.5461277302537406, lastmarble.winningChance(red, blue, removed), DELTA * 0.5461277302537406);
  }

  @Test
  public void case63() {
    int red = 100;
    int blue = 95;
    int removed = 90;
    assertEquals(0.4564560792013996, lastmarble.winningChance(red, blue, removed), DELTA * 0.4564560792013996);
  }

  @Test
  public void case64() {
    int red = 100;
    int blue = 80;
    int removed = 35;
    assertEquals(0.4208854408462597, lastmarble.winningChance(red, blue, removed), DELTA * 0.4208854408462597);
  }

  @Test
  public void case65() {
    int red = 10;
    int blue = 15;
    int removed = 4;
    assertEquals(0.47801674029295527, lastmarble.winningChance(red, blue, removed), DELTA * 0.47801674029295527);
  }

  @Test
  public void case66() {
    int red = 100;
    int blue = 100;
    int removed = 50;
    assertEquals(0.5379240275007613, lastmarble.winningChance(red, blue, removed), DELTA * 0.5379240275007613);
  }

  @Test
  public void case67() {
    int red = 95;
    int blue = 92;
    int removed = 76;
    assertEquals(0.5405565613774832, lastmarble.winningChance(red, blue, removed), DELTA * 0.5405565613774832);
  }

  @Test
  public void case68() {
    int red = 25;
    int blue = 5;
    int removed = 9;
    assertEquals(0.16649123545675287, lastmarble.winningChance(red, blue, removed), DELTA * 0.16649123545675287);
  }

  @Test
  public void case69() {
    int red = 100;
    int blue = 17;
    int removed = 96;
    assertEquals(0.14501501783998333, lastmarble.winningChance(red, blue, removed), DELTA * 0.14501501783998333);
  }

  @Test
  public void case70() {
    int red = 89;
    int blue = 79;
    int removed = 53;
    assertEquals(0.5576735547339124, lastmarble.winningChance(red, blue, removed), DELTA * 0.5576735547339124);
  }

  @Test
  public void case71() {
    int red = 100;
    int blue = 1;
    int removed = 99;
    assertEquals(0.9900990099009901, lastmarble.winningChance(red, blue, removed), DELTA * 0.9900990099009901);
  }

  @Test
  public void case72() {
    int red = 32;
    int blue = 25;
    int removed = 9;
    assertEquals(0.5895628928952114, lastmarble.winningChance(red, blue, removed), DELTA * 0.5895628928952114);
  }

  @Test
  public void case73() {
    int red = 100;
    int blue = 99;
    int removed = 30;
    assertEquals(0.45633154203507437, lastmarble.winningChance(red, blue, removed), DELTA * 0.45633154203507437);
  }

  @Test
  public void case74() {
    int red = 100;
    int blue = 99;
    int removed = 15;
    assertEquals(0.5506563357381343, lastmarble.winningChance(red, blue, removed), DELTA * 0.5506563357381343);
  }

}
