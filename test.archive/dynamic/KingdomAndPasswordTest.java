package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class KingdomAndPasswordTest {
  KingdomAndPassword kingdomandpassword = new KingdomAndPassword();

  @Test
  public void case1() {
    long oldPassword = 548L;
    int[] restrictedDigits = { 5, 1, 8 };
    assertEquals(485L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case2() {
    long oldPassword = 7777L;
    int[] restrictedDigits = { 4, 7, 4, 7 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case3() {
    long oldPassword = 58L;
    int[] restrictedDigits = { 4, 7 };
    assertEquals(58L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case4() {
    long oldPassword = 172L;
    int[] restrictedDigits = { 4, 7, 4 };
    assertEquals(127L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case5() {
    long oldPassword = 241529363573463L;
    int[] restrictedDigits = { 1, 4, 5, 7, 3, 9, 8, 1, 7, 6, 3, 2, 6, 4, 5 };
    assertEquals(239676554423331L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case6() {
    long oldPassword = 172L;
    int[] restrictedDigits = { 1, 7, 2 };
    assertEquals(217L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case7() {
    long oldPassword = 1L;
    int[] restrictedDigits = { 1 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case8() {
    long oldPassword = 9999999999999999L;
    int[] restrictedDigits = { 8, 3, 6, 6, 2, 1, 4, 6, 1, 2, 6, 5, 1, 7, 6, 7 };
    assertEquals(9999999999999999L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case9() {
    long oldPassword = 9999999999999999L;
    int[] restrictedDigits = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case10() {
    long oldPassword = 6669982649L;
    int[] restrictedDigits = { 9, 6, 9, 4, 6, 6, 6, 9, 8, 2 };
    assertEquals(6826499669L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case11() {
    long oldPassword = 2371232579661552L;
    int[] restrictedDigits = { 5, 5, 7, 6, 3, 7, 2, 1, 2, 3, 6, 2, 1, 5, 9, 2 };
    assertEquals(2369767555312221L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case12() {
    long oldPassword = 4689479974398L;
    int[] restrictedDigits = { 7, 4, 3, 8, 9, 9, 6, 9, 8, 7, 4, 9, 4 };
    assertEquals(4689479899743L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case13() {
    long oldPassword = 46128L;
    int[] restrictedDigits = { 2, 6, 1, 8, 4 };
    assertEquals(48216L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case14() {
    long oldPassword = 64271513L;
    int[] restrictedDigits = { 5, 7, 6, 1, 2, 1, 3, 4 };
    assertEquals(64271513L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case15() {
    long oldPassword = 9151L;
    int[] restrictedDigits = { 9, 1, 5, 1 };
    assertEquals(1915L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case16() {
    long oldPassword = 23171L;
    int[] restrictedDigits = { 1, 7, 1, 3, 2 };
    assertEquals(23711L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case17() {
    long oldPassword = 441462224L;
    int[] restrictedDigits = { 1, 4, 2, 2, 4, 4, 6, 4, 2 };
    assertEquals(426422414L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case18() {
    long oldPassword = 1985196L;
    int[] restrictedDigits = { 9, 9, 8, 5, 6, 1, 1 };
    assertEquals(1899165L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case19() {
    long oldPassword = 4338746596458L;
    int[] restrictedDigits = { 3, 4, 5, 6, 8, 8, 3, 6, 4, 7, 9, 4, 5 };
    assertEquals(4338746596458L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case20() {
    long oldPassword = 66259L;
    int[] restrictedDigits = { 5, 6, 9, 2, 6 };
    assertEquals(65692L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case21() {
    long oldPassword = 589326L;
    int[] restrictedDigits = { 3, 6, 9, 5, 8, 2 };
    assertEquals(586923L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case22() {
    long oldPassword = 544823589767L;
    int[] restrictedDigits = { 3, 6, 2, 5, 4, 8, 5, 7, 9, 8, 7, 4 };
    assertEquals(544823657789L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case23() {
    long oldPassword = 855313355L;
    int[] restrictedDigits = { 3, 3, 5, 5, 8, 5, 3, 1, 5 };
    assertEquals(853353551L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case24() {
    long oldPassword = 7993235L;
    int[] restrictedDigits = { 9, 9, 3, 5, 3, 2, 7 };
    assertEquals(7599233L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case25() {
    long oldPassword = 841689983651673L;
    int[] restrictedDigits = { 8, 3, 5, 9, 6, 3, 9, 8, 1, 8, 4, 1, 6, 6, 7 };
    assertEquals(799888666534311L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case26() {
    long oldPassword = 6651564386L;
    int[] restrictedDigits = { 1, 5, 6, 8, 6, 5, 6, 3, 6, 4 };
    assertEquals(6651564638L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case27() {
    long oldPassword = 7L;
    int[] restrictedDigits = { 7 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case28() {
    long oldPassword = 938394L;
    int[] restrictedDigits = { 9, 3, 3, 9, 4, 8 };
    assertEquals(899433L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case29() {
    long oldPassword = 8433L;
    int[] restrictedDigits = { 3, 8, 3, 4 };
    assertEquals(8343L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case30() {
    long oldPassword = 9356434931967561L;
    int[] restrictedDigits = { 9, 3, 5, 3, 4, 3, 1, 3, 4, 3, 5, 7, 6, 6, 9, 6 };
    assertEquals(7999666554433311L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case31() {
    long oldPassword = 27799539L;
    int[] restrictedDigits = { 4, 1, 7, 7, 3, 6, 2, 9 };
    assertEquals(27935997L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case32() {
    long oldPassword = 89994662991474L;
    int[] restrictedDigits = { 9, 6, 9, 7, 9, 2, 1, 8, 4, 6, 4, 9, 7, 9 };
    assertEquals(89796999642441L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case33() {
    long oldPassword = 1395981945L;
    int[] restrictedDigits = { 4, 5, 5, 9, 1, 3, 5, 8, 9, 8 };
    assertEquals(1395981945L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case34() {
    long oldPassword = 83L;
    int[] restrictedDigits = { 8, 4 };
    assertEquals(38L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case35() {
    long oldPassword = 9735633893326L;
    int[] restrictedDigits = { 3, 1, 8, 5, 1, 7, 3, 6, 8, 5, 9, 9, 3 };
    assertEquals(9736235333689L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case36() {
    long oldPassword = 568519L;
    int[] restrictedDigits = { 9, 5, 7, 1, 5, 6 };
    assertEquals(568519L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case37() {
    long oldPassword = 578396383741221L;
    int[] restrictedDigits = { 3, 4, 8, 8, 7, 5, 3, 1, 6, 2, 8, 1, 3, 7, 7 };
    assertEquals(577988643332211L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case38() {
    long oldPassword = 19793192822L;
    int[] restrictedDigits = { 4, 1, 5, 5, 9, 7, 2, 3, 3, 9, 1 };
    assertEquals(19793192822L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case39() {
    long oldPassword = 811632227185915L;
    int[] restrictedDigits = { 1, 1, 2, 7, 5, 1, 4, 8, 3, 1, 6, 2, 5, 8, 9 };
    assertEquals(821112125356798L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case40() {
    long oldPassword = 659L;
    int[] restrictedDigits = { 5, 8, 8 };
    assertEquals(659L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case41() {
    long oldPassword = 54338445672426L;
    int[] restrictedDigits = { 8, 5, 4, 3, 6, 1, 2, 5, 4, 8, 6, 4, 4, 8 };
    assertEquals(54342234547686L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case42() {
    long oldPassword = 64454L;
    int[] restrictedDigits = { 5, 4, 5, 3, 4 };
    assertEquals(46445L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case43() {
    long oldPassword = 79637946132L;
    int[] restrictedDigits = { 3, 9, 2, 7, 7, 1, 7, 4, 2, 6, 8 };
    assertEquals(77996643321L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case44() {
    long oldPassword = 4516632961524187L;
    int[] restrictedDigits = { 4, 3, 7, 8, 3, 1, 1, 5, 1, 5, 5, 9, 2, 4, 2, 4 };
    assertEquals(3987666454251211L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case45() {
    long oldPassword = 8L;
    int[] restrictedDigits = { 8 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case46() {
    long oldPassword = 9868564685726583L;
    int[] restrictedDigits = { 2, 6, 5, 3, 3, 2, 2, 5, 1, 8, 6, 3, 4, 8, 8, 7 };
    assertEquals(9868564685726538L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case47() {
    long oldPassword = 174L;
    int[] restrictedDigits = { 9, 1, 7 };
    assertEquals(174L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case48() {
    long oldPassword = 91296294L;
    int[] restrictedDigits = { 2, 3, 9, 7, 2, 2, 9, 4 };
    assertEquals(91296429L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case49() {
    long oldPassword = 766455314942L;
    int[] restrictedDigits = { 8, 6, 5, 6, 4, 3, 6, 2, 6, 5, 8, 4 };
    assertEquals(759566444321L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case50() {
    long oldPassword = 78937768633L;
    int[] restrictedDigits = { 6, 5, 8, 3, 6, 5, 8, 7, 6, 5, 3 };
    assertEquals(78963336778L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case51() {
    long oldPassword = 31588534453243L;
    int[] restrictedDigits = { 8, 6, 5, 5, 3, 5, 3, 4, 6, 8, 3, 5, 8, 4 };
    assertEquals(31488455542333L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case52() {
    long oldPassword = 9962L;
    int[] restrictedDigits = { 9, 6, 6, 5 };
    assertEquals(6992L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case53() {
    long oldPassword = 227187615844L;
    int[] restrictedDigits = { 6, 2, 1, 1, 9, 7, 9, 1, 4, 8, 4, 2 };
    assertEquals(218876752414L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case54() {
    long oldPassword = 411L;
    int[] restrictedDigits = { 1, 2, 8 };
    assertEquals(411L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case55() {
    long oldPassword = 6646113L;
    int[] restrictedDigits = { 9, 6, 1, 2, 1, 6, 3 };
    assertEquals(6466311L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case56() {
    long oldPassword = 2952L;
    int[] restrictedDigits = { 2, 3, 5, 2 };
    assertEquals(5229L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case57() {
    long oldPassword = 39659883423L;
    int[] restrictedDigits = { 5, 3, 6, 6, 7, 8, 3, 3, 5, 9, 5 };
    assertEquals(39598684332L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case58() {
    long oldPassword = 483L;
    int[] restrictedDigits = { 5, 5, 2 };
    assertEquals(483L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case59() {
    long oldPassword = 54L;
    int[] restrictedDigits = { 5, 1 };
    assertEquals(45L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case60() {
    long oldPassword = 172L;
    int[] restrictedDigits = { 3, 7, 3 };
    assertEquals(127L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case61() {
    long oldPassword = 132251342515551L;
    int[] restrictedDigits = { 4, 5, 5, 5, 5, 5, 2, 5, 3, 5, 1, 5, 4, 5, 5 };
    assertEquals(511112525253534L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case62() {
    long oldPassword = 3345411115342361L;
    int[] restrictedDigits = { 4, 1, 1, 3, 1, 1, 1, 6, 2, 1, 4, 1, 1, 1, 1, 1 };
    assertEquals(1651544114133332L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case63() {
    long oldPassword = 1542545132141325L;
    int[] restrictedDigits = { 4, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 5, 5, 5 };
    assertEquals(5551111222335444L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case64() {
    long oldPassword = 6119193531479171L;
    int[] restrictedDigits = { 8, 1, 8, 1, 1, 1, 1, 6, 4, 1, 1, 2, 7, 1, 1, 1 };
    assertEquals(1919977116511433L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case65() {
    long oldPassword = 6119193531479171L;
    int[] restrictedDigits = { 8, 1, 8, 1, 1, 1, 1, 6, 4, 1, 1, 2, 6, 1, 1, 1 };
    assertEquals(1919977116511433L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case66() {
    long oldPassword = 6118192831479171L;
    int[] restrictedDigits = { 8, 1, 8, 1, 1, 1, 1, 6, 4, 1, 1, 2, 6, 1, 1, 1 };
    assertEquals(1919887117611432L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case67() {
    long oldPassword = 6118192831579171L;
    int[] restrictedDigits = { 8, 1, 8, 1, 1, 1, 1, 6, 4, 1, 1, 2, 6, 1, 1, 1 };
    assertEquals(1919887117611532L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case68() {
    long oldPassword = 6118192831579171L;
    int[] restrictedDigits = { 1, 1, 8, 1, 1, 1, 1, 6, 4, 1, 1, 2, 6, 1, 1, 1 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case69() {
    long oldPassword = 6118192831519771L;
    int[] restrictedDigits = { 1, 1, 5, 1, 1, 1, 1, 9, 4, 1, 1, 2, 6, 1, 1, 1 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case70() {
    long oldPassword = 6119152831519771L;
    int[] restrictedDigits = { 1, 1, 5, 1, 1, 1, 1, 4, 4, 1, 1, 2, 6, 1, 1, 1 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case71() {
    long oldPassword = 6119152833519771L;
    int[] restrictedDigits = { 1, 1, 5, 1, 1, 1, 1, 4, 4, 1, 1, 1, 6, 1, 1, 1 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case72() {
    long oldPassword = 6119182833519771L;
    int[] restrictedDigits = { 1, 1, 5, 1, 1, 1, 1, 4, 4, 1, 1, 1, 6, 1, 1, 1 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case73() {
    long oldPassword = 6119182833519741L;
    int[] restrictedDigits = { 8, 1, 5, 1, 1, 1, 1, 4, 4, 1, 1, 1, 6, 1, 1, 1 };
    assertEquals(1919887116541332L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case74() {
    long oldPassword = 6119182833519741L;
    int[] restrictedDigits = { 8, 1, 5, 1, 1, 1, 1, 4, 2, 1, 1, 1, 6, 1, 1, 1 };
    assertEquals(1919887116541332L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case75() {
    long oldPassword = 6919182833519741L;
    int[] restrictedDigits = { 8, 1, 1, 1, 1, 1, 1, 4, 4, 1, 1, 1, 6, 1, 1, 1 };
    assertEquals(1999887116541332L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case76() {
    long oldPassword = 5176858323464289L;
    int[] restrictedDigits = { 9, 7, 8, 9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
    assertEquals(8818223344556679L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case77() {
    long oldPassword = 4752914625388618L;
    int[] restrictedDigits = { 9, 8, 7, 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
    assertEquals(8188122344556679L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case78() {
    long oldPassword = 241529363573463L;
    int[] restrictedDigits = { 1, 4, 5, 7, 3, 9, 8, 1, 7, 6, 3, 2, 6, 4, 5 };
    assertEquals(239676554423331L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case79() {
    long oldPassword = 548L;
    int[] restrictedDigits = { 5, 1, 8 };
    assertEquals(485L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case80() {
    long oldPassword = 9999912399945698L;
    int[] restrictedDigits = { 1, 4, 9, 9, 3, 9, 8, 1, 7, 6, 3, 2, 6, 4, 9, 8 };
    assertEquals(9986959999994321L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case81() {
    long oldPassword = 1234567899787L;
    int[] restrictedDigits = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 7 };
    assertEquals(2143658777989L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case82() {
    long oldPassword = 1234567891234567L;
    int[] restrictedDigits = { 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1 };
    assertEquals(1234567891234567L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case83() {
    long oldPassword = 123456781234567L;
    int[] restrictedDigits = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    assertEquals(123456781234567L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case84() {
    long oldPassword = 123456789123451L;
    int[] restrictedDigits = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
    assertEquals(-1L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

  @Test
  public void case85() {
    long oldPassword = 3941L;
    int[] restrictedDigits = { 5, 9, 5, 5 };
    assertEquals(4139L, kingdomandpassword.newPassword(oldPassword, restrictedDigits));
  }

}
