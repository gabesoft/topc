package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PaternityTestTest {
  PaternityTest paternitytest = new PaternityTest();

  @Test
  public void case1() {
    String child = "ABCD";
    String mother = "AXCY";
    String[] men = { "SBTD", "QRCD" };
    assertArrayEquals(new int[] { 0 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case2() {
    String child = "ABCD";
    String mother = "ABCX";
    String[] men = { "ABCY", "ASTD", "QBCD" };
    assertArrayEquals(new int[] { 1, 2 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case3() {
    String child = "ABABAB";
    String mother = "ABABAB";
    String[] men = { "ABABAB", "ABABCC", "ABCCDD", "CCDDEE" };
    assertArrayEquals(new int[] { 0, 1 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case4() {
    String child = "ABCDEFGH";
    String mother = "ABCDEFGH";
    String[] men = { "ABCDEFGH" };
    assertArrayEquals(new int[] { 0 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case5() {
    String child = "ABCDEF";
    String mother = "ABCDEF";
    String[] men = { "FEDCBA" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case6() {
    String child = "ABCDEF";
    String mother = "XBCXXF";
    String[] men = { "ABCDEF" };
    assertArrayEquals(new int[] { 0 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case7() {
    String child = "YZGLSYQT";
    String mother = "YUQRWYQT";
    String[] men = { "YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT", "WQJLSMQT" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case8() {
    String child = "EHAPPOYCLXQH";
    String mother = "HXRPPJYGLXQW";
    String[] men = { "QMAPPKFHLDQH", "ERVPROACLYQD", "ORAIPUYPLXQY", "UHAPELYJBXQU", "JGAPABYCZXQH" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case9() {
    String child = "XCIHGTUYLYAXZHRDPUKJ";
    String mother = "XWIEPKUWLYCFZDMGPUKJ";
    String[] men = { "XFIEGTUYSJAXAHLIIAKJ", "QNIHMTAYKYAIZHRTPUIJ", "XCIYGUMYLYJXZYVTBUJE", "XIIHGHIYVYADZHUTPJTO", "WCIHGTVBBYKASXXDPUKJ" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case10() {
    String child = "YDHXMKFWTYWSPGTVDBYG";
    String mother = "ODHXJTFWTHWDPGLSZBEX";
    String[] men = { "YMHXMKFHTYOSRGTVDBYG", "YDHSMKQDTYWSOGTVDBYG", "YPHAMKDWOYWSPGTVDUYG", "YDHMMKMWTYJSPXTVDJYG", "YDVXMKZUOYCSPMTVDBYG" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case11() {
    String child = "BBBBBBBBBBAAAAAAAAAA";
    String mother = "BBBBBBBBBBBBBBBBBBBB";
    String[] men = { "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case12() {
    String child = "ABCDEFGHIJKLMNOPQRST";
    String mother = "ABCDEFGHIJKLMNOPQRSX";
    String[] men = { "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case13() {
    String child = "WXETPYCHUWSQEMKKYNVP";
    String mother = "AXQTUQVAUOSQEEKCYNVP";
    String[] men = { "WNELPYCHXWXPCMNKDDXD", "WFEEPYCHFWDNPMKKALIW", "WSEFPYCHEWEFGMPKIQCK", "WAEXPYCHAWEQXMSKYARN", "WKEXPYCHYWLLFMGKKFBB" };
    assertArrayEquals(new int[] { 1, 3 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case14() {
    String child = "PREDNTRKUKRLFLENKX";
    String mother = "NRFXNTRUJSUFWLENKX";
    String[] men = { "PTJDZBCKUKRLFHAXLM", "QIEDYMSKUKRLFPRHGG", "PYEDQZVKUKRLFZVCVB", "POEDTUKKUKRLFOKJTR", "PAEDRYLKUKRLFLHHKV" };
    assertArrayEquals(new int[] { 2, 3, 4 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case15() {
    String child = "IVKEWOVNQKCCREDO";
    String mother = "IXKLWOVNTGCQRRWW";
    String[] men = { "BVGEPMMNQKVCBEDO", "MVWEGRIEQKBCXEDO", "VVKEZJYHQKBCEEDO", "RVJEBGIXQKPCPEDO", "OVZEWKPGQKNCBEDO" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case16() {
    String child = "AAAAAA";
    String mother = "AAAAAB";
    String[] men = { "AAAAAB", "AAAAAC" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case17() {
    String child = "ABCD";
    String mother = "ABXY";
    String[] men = { "CDAB" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case18() {
    String child = "QNBEYZBRQQ";
    String mother = "QBBKFZFHQQ";
    String[] men = { "QNMWYZHRVQ", "HDBCUZBRAQ", "NVBEOZBRFV", "OPMHYZBRYQ" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case19() {
    String child = "XOKXPZKAAW";
    String mother = "TOKXPTSASG";
    String[] men = { "XMKVBCUAAW", "XFKCIMKOAW", "XFFKEZKJAW", "XMKIIZKAIX" };
    assertArrayEquals(new int[] { 2 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case20() {
    String child = "EASSMBHEBGQBGP";
    String mother = "CPFSPBHTBGQUOP";
    String[] men = { "JLSSMBHTDRQUGM", "EASSMSUELWWBGQ", "CAGSMBXEBAAKAP", "EASGMYMEAKHBGI" };
    assertArrayEquals(new int[] { 1, 3 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case21() {
    String child = "FJGGTQWUTURYXBXK";
    String mother = "BJHGTRWUCSRPJBXE";
    String[] men = { "FXGQOQZGTUJYXXNK", "FQLGQOWUXJRRXEXK", "FJGGFLWJTARUXVEG", "FGGVXQPZTUBYXKYK" };
    assertArrayEquals(new int[] { 0, 3 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case22() {
    String child = "XY";
    String mother = "YY";
    String[] men = { "YY", "XX", "XQ", "QY", "YX" };
    assertArrayEquals(new int[] { 1, 2 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case23() {
    String child = "ABCDEFGHIJKLMNOPQRST";
    String mother = "ABCDEFGHIJKLMNOPQRST";
    String[] men = { "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRSU", "ABCDEFGHIJKLMNOPQRSX", "ABCDEFGHIJKLMNOPQRSZ", "ABCDEFGHIJKLMNOPQRST" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case24() {
    String child = "ABABAB";
    String mother = "ABABAB";
    String[] men = { "ABCCDD", "CCDDEE" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case25() {
    String child = "WXETPYCHUWSQEMKKYNVP";
    String mother = "AXQTUQVAUOSQEEKCYNVP";
    String[] men = { "WNELPYCHXWXPCMNKDDXD", "WFEEPYCHFWDNPMKKALIW", "WSEFPYCHEWEFGMPKIQCK", "WAEXPYCHAWEQXMSKYARN", "WKEXPYCHYWLLFMGKKFBB" };
    assertArrayEquals(new int[] { 1, 3 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case26() {
    String child = "ABABAB";
    String mother = "ABABAB";
    String[] men = { "ABABAB", "ABABCC", "ABCCDD", "CCDDEE" };
    assertArrayEquals(new int[] { 0, 1 }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case27() {
    String child = "ABCD";
    String mother = "ABEF";
    String[] men = { "CDEF" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case28() {
    String child = "ABCDEF";
    String mother = "ABCDEF";
    String[] men = { "AXXXXX", "XBXXXX" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

  @Test
  public void case29() {
    String child = "ABABAB";
    String mother = "ADADAD";
    String[] men = { "ACACAC" };
    assertArrayEquals(new int[] {  }, paternitytest.possibleFathers(child, mother, men));
  }

}
