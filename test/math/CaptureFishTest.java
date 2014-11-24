package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CaptureFishTest {
  CaptureFish capturefish = new CaptureFish();

  @Test
  public void case1() {
    String fish = "OXOXO";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case2() {
    String fish = "OO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case3() {
    String fish = "**OX**";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case4() {
    String fish = "O***O***O***O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case5() {
    String fish = "O*X**X***X*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case6() {
    String fish = "O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case7() {
    String fish = "OX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case8() {
    String fish = "XO";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case9() {
    String fish = "*O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case10() {
    String fish = "O*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case11() {
    String fish = "O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case12() {
    String fish = "X*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*O*X";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case13() {
    String fish = "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case14() {
    String fish = "OXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case15() {
    String fish = "***********************************************O**";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case16() {
    String fish = "*************O************************************";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case17() {
    String fish = "O************************************************O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case18() {
    String fish = "O***********************X************************O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case19() {
    String fish = "O**********************X************************O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case20() {
    String fish = "O*********************X************************O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case21() {
    String fish = "XOOXOXXOOO";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case22() {
    String fish = "XOXXXXOXXOXXOXX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case23() {
    String fish = "OXOXXOOXXXXXXOXXOOXX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case24() {
    String fish = "OOOXXOXOOOOXOXOXXXOOOXOOO";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case25() {
    String fish = "OOOXXXXOOXXXOOOXOXOXOOXXOOXXOO";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case26() {
    String fish = "XOOXXXXOXXXXOXXXOXOXOOXOOOOOXXXOOOX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case27() {
    String fish = "***OXX*X*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case28() {
    String fish = "XO*OOO*XO*O*XXXX*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case29() {
    String fish = "XX*X*OXXXXXO*XOXOXXXOOX*X";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case30() {
    String fish = "*O*XX*XO**XXXXXOXXOX*X********OOX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case31() {
    String fish = "*OXXO**X**OX*X*O**X*XXOX*X*XX**X*XX*XO**X";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case32() {
    String fish = "XX**OOXX**OO*O*XXO*XOXXXXOXXO*X*XXX*OX**X*XXXX*OX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case33() {
    String fish = "*X*OXX*O*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case34() {
    String fish = "**O*OX***OXXO**O*X";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case35() {
    String fish = "*XOXX*X****XX*O***XO***OOX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case36() {
    String fish = "*XOOOXOO***O**XOX*X*OOO**OOO***O**";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case37() {
    String fish = "*OO*O**O**X***OXOOOO*O***OX*OOX**O*X*XOO*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case38() {
    String fish = "O***OOOXX**XOXOOO***OX****OXOX*OXO*XXOO***XOO*XO*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case39() {
    String fish = "****XXO**X********O**OO**X****";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case40() {
    String fish = "O*X***X*O***************X*****X*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case41() {
    String fish = "O***O**X*****OX**OXO****O*********X*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case42() {
    String fish = "*********X**X********O*****X******O**X*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case43() {
    String fish = "**OO**XX******O**********O****X**OX***X*XX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case44() {
    String fish = "*X***********X**OX*X**O******O*O********X****";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case45() {
    String fish = "******O***";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case46() {
    String fish = "**O****O*O**O**OOO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case47() {
    String fish = "O*O**O**O*****O*OOO*****O*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case48() {
    String fish = "**O*****O*O**O*O*OO****O*OO******O";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case49() {
    String fish = "**O**O******O*OO*OOOO***O*O*OO****O***OOO*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case50() {
    String fish = "OO**OO*OOOOOOOOOO*OOO*O**OOO****OOO*O*OOO*OO***OO*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case51() {
    String fish = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXOOOOOXXXXXXXXXXXXXXX";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case52() {
    String fish = "XXXXXXXXXXXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOXXX";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case53() {
    String fish = "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case54() {
    String fish = "OOOOOOOOOOOOOXXXXXXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case55() {
    String fish = "OOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXOO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case56() {
    String fish = "XXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case57() {
    String fish = "*O*O*OOO**OO**O*******X**X*XOO*O***OOOO*******OO*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case58() {
    String fish = "XXXXX*XX*XX***XX*X*X*XXX*XXOOOOO*XXX*XXXXX*XX*XXX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case59() {
    String fish = "O**O**OOOOO*O*XXXXXXXX*XXXX**XXXXX**XXXXXXXXOOO*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case60() {
    String fish = "XX*XXXXXXXX*XXXXOOOOOXX**XXXXX*XXXXXXX*X***XXX*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case61() {
    String fish = "*OOXXXXXXX*XXX*XXXX*XXX*X***X*X***O*OOO*OOOO*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case62() {
    String fish = "*OO*O*XX*XX**XXX**XX*XX**XOOO*OO*O*OOOOO**O*O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case63() {
    String fish = "*X**XX**X*X*******O*OO**OO**********X*************";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case64() {
    String fish = "*XX**XX**XX*XX****OOO*****O***O********X**********";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case65() {
    String fish = "*******O****O*****XX******X***X*X*X***OOO****OOO**";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case66() {
    String fish = "OO***O***O*******X****X*******X*X*********O****O**";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case67() {
    String fish = "***********O******X***X*****X***X**XOO*O****O*O*O*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case68() {
    String fish = "**O***OO****OOO************XX**X*X**O*****OO******";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case69() {
    String fish = "O*O***O**O**O*OO****OOO*O**O**O*O*****X*XXX*XX****";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case70() {
    String fish = "**O***O*O*****OO******O*O***OOO*OO**X**X****XXXX**";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case71() {
    String fish = "***OOO***O*****OO*OOO*OO**OOO*OOO**X*X*****X***X**";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case72() {
    String fish = "O*O******OO******OOOOO*****OO**********XX**X**X***";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case73() {
    String fish = "***XX**XX*X**XXXXXXX*XX*XX*XXXX*XXOO**O*****O*OOO*";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case74() {
    String fish = "X*********XXXX*XX**XX****X***XX*X*OOO****OOO*O***O";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case75() {
    String fish = "OXOXOXOOO";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case76() {
    String fish = "OX*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case77() {
    String fish = "*O*O**";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case78() {
    String fish = "XOX";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case79() {
    String fish = "OOOX*";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case80() {
    String fish = "OOOOOOO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case81() {
    String fish = "OXO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case82() {
    String fish = "*OX";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case83() {
    String fish = "X*OX";
    assertEquals(0, capturefish.getParity(fish));
  }

  @Test
  public void case84() {
    String fish = "OXXO";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case85() {
    String fish = "XOOX";
    assertEquals(1, capturefish.getParity(fish));
  }

  @Test
  public void case86() {
    String fish = "O*O";
    assertEquals(0, capturefish.getParity(fish));
  }

}
