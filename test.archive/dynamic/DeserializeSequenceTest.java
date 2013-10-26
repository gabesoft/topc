package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DeserializeSequenceTest {
  DeserializeSequence deserializesequence = new DeserializeSequence();

  @Test
  public void case1() {
    String str = "1234";
    assertEquals(5, deserializesequence.howMany(str));
  }

  @Test
  public void case2() {
    String str = "000000000001";
    assertEquals(1, deserializesequence.howMany(str));
  }

  @Test
  public void case3() {
    String str = "1000000000000";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case4() {
    String str = "9876543210";
    assertEquals(5, deserializesequence.howMany(str));
  }

  @Test
  public void case5() {
    String str = "11111111111111111111111111111111111111111111111111";
    assertEquals(9192, deserializesequence.howMany(str));
  }

  @Test
  public void case6() {
    String str = "99999999999999999999999999999999999999999999999999";
    assertEquals(9192, deserializesequence.howMany(str));
  }

  @Test
  public void case7() {
    String str = "01234567890123456789012345678901234567890123456789";
    assertEquals(1, deserializesequence.howMany(str));
  }

  @Test
  public void case8() {
    String str = "01234567890123456789012345678901234567890000006789";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case9() {
    String str = "91919191919191919191919191919191919191919191919191";
    assertEquals(261, deserializesequence.howMany(str));
  }

  @Test
  public void case10() {
    String str = "10010010010010010010010010010010010010010010010010";
    assertEquals(1217, deserializesequence.howMany(str));
  }

  @Test
  public void case11() {
    String str = "123456789876543212345678987654321";
    assertEquals(6, deserializesequence.howMany(str));
  }

  @Test
  public void case12() {
    String str = "056723859897809708891720897401235298";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case13() {
    String str = "54178991578409123049108759";
    assertEquals(3, deserializesequence.howMany(str));
  }

  @Test
  public void case14() {
    String str = "00000111112222233333444445555566666777778888899999";
    assertEquals(5942, deserializesequence.howMany(str));
  }

  @Test
  public void case15() {
    String str = "999998888877777666665555544444333332222211111";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case16() {
    String str = "11111111111111111111111119999999999999999999999999";
    assertEquals(9192, deserializesequence.howMany(str));
  }

  @Test
  public void case17() {
    String str = "64759785162140436046023132270364266132872271316731";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case18() {
    String str = "51804153084121281073270677068788574654138873291694";
    assertEquals(1, deserializesequence.howMany(str));
  }

  @Test
  public void case19() {
    String str = "48890210448421966175713942393846139557749131538637";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case20() {
    String str = "47972286581680292625312567567845873411519103224764";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case21() {
    String str = "98697462513682181855656910276118186569260153375644";
    assertEquals(1, deserializesequence.howMany(str));
  }

  @Test
  public void case22() {
    String str = "32305448697244425906003787901125406091914778415747";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case23() {
    String str = "22954446290943481540318236048644313856292315368595";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case24() {
    String str = "23175163484901846640490442727045766737634593035777";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case25() {
    String str = "35144059683169872903828335902343747528354620962516";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case26() {
    String str = "26054511613037193992817442536382125532833174709203";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case27() {
    String str = "65018221051981711016896996705078373883607688597363";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case28() {
    String str = "22119737326607545579442309386494435008392385807658";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case29() {
    String str = "23557333122166346129667878925081225693848801368342";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case30() {
    String str = "12046251738076865856641507882669212254883519388776";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case31() {
    String str = "72691177825989628891353457350628887248974976397227";
    assertEquals(0, deserializesequence.howMany(str));
  }

  @Test
  public void case32() {
    String str = "2205030653";
    assertEquals(13, deserializesequence.howMany(str));
  }

  @Test
  public void case33() {
    String str = "4120985914";
    assertEquals(9, deserializesequence.howMany(str));
  }

  @Test
  public void case34() {
    String str = "66057063275699";
    assertEquals(14, deserializesequence.howMany(str));
  }

  @Test
  public void case35() {
    String str = "9389274";
    assertEquals(4, deserializesequence.howMany(str));
  }

  @Test
  public void case36() {
    String str = "508851590880";
    assertEquals(16, deserializesequence.howMany(str));
  }

  @Test
  public void case37() {
    String str = "14723559267";
    assertEquals(17, deserializesequence.howMany(str));
  }

  @Test
  public void case38() {
    String str = "5709585563";
    assertEquals(13, deserializesequence.howMany(str));
  }

  @Test
  public void case39() {
    String str = "1202791389";
    assertEquals(20, deserializesequence.howMany(str));
  }

  @Test
  public void case40() {
    String str = "992476549";
    assertEquals(9, deserializesequence.howMany(str));
  }

  @Test
  public void case41() {
    String str = "706073155";
    assertEquals(6, deserializesequence.howMany(str));
  }

  @Test
  public void case42() {
    String str = "80563505";
    assertEquals(4, deserializesequence.howMany(str));
  }

  @Test
  public void case43() {
    String str = "6885368211532289452";
    assertEquals(24, deserializesequence.howMany(str));
  }

  @Test
  public void case44() {
    String str = "1343625288";
    assertEquals(17, deserializesequence.howMany(str));
  }

  @Test
  public void case45() {
    String str = "7810278789278";
    assertEquals(15, deserializesequence.howMany(str));
  }

  @Test
  public void case46() {
    String str = "93249";
    assertEquals(4, deserializesequence.howMany(str));
  }

  @Test
  public void case47() {
    String str = "32452365323233262";
    assertEquals(12, deserializesequence.howMany(str));
  }

  @Test
  public void case48() {
    String str = "9876543210";
    assertEquals(5, deserializesequence.howMany(str));
  }

  @Test
  public void case49() {
    String str = "10010010010010010010010010010010010010010010010010";
    assertEquals(1217, deserializesequence.howMany(str));
  }

  @Test
  public void case50() {
    String str = "1000000";
    assertEquals(1, deserializesequence.howMany(str));
  }

  @Test
  public void case51() {
    String str = "10001001010001000011001000100000011110100101010010";
    assertEquals(53, deserializesequence.howMany(str));
  }

  @Test
  public void case52() {
    String str = "0105177821993492100320022188860042353";
    assertEquals(0, deserializesequence.howMany(str));
  }

}
