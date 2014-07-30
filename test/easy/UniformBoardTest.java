package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class UniformBoardTest {
  UniformBoard uniformboard = new UniformBoard();

  @Test
  public void case1() {
    String[] board = { "AP", ".A" };
    int K = 0;
    assertEquals(1, uniformboard.getBoard(board, K));
  }

  @Test
  public void case2() {
    String[] board = { "AP", ".A" };
    int K = 1;
    assertEquals(2, uniformboard.getBoard(board, K));
  }

  @Test
  public void case3() {
    String[] board = { "PPP", "APA", "A.P" };
    int K = 2;
    assertEquals(3, uniformboard.getBoard(board, K));
  }

  @Test
  public void case4() {
    String[] board = { "AAA", "PPP", "AAA" };
    int K = 10;
    assertEquals(3, uniformboard.getBoard(board, K));
  }

  @Test
  public void case5() {
    String[] board = { "PPAAPA..AP", "PPA.APAP..", "..P.AA.PPP", "P.P..APAA.", "P.P..P.APA", "PPA..AP.AA", "APP..AAPAA", "P.P.AP...P", ".P.A.PAPPA", "..PAPAP..P" };
    int K = 10;
    assertEquals(15, uniformboard.getBoard(board, K));
  }

  @Test
  public void case6() {
    String[] board = { ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A." };
    int K = 0;
    assertEquals(1, uniformboard.getBoard(board, K));
  }

  @Test
  public void case7() {
    String[] board = { ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A.", ".A.A.A.A.A.A.A.A.A.A", "A.A.A.A.A.A.A.A.A.A." };
    int K = 99;
    assertEquals(198, uniformboard.getBoard(board, K));
  }

  @Test
  public void case8() {
    String[] board = { "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP" };
    int K = 1000;
    assertEquals(1, uniformboard.getBoard(board, K));
  }

  @Test
  public void case9() {
    String[] board = { "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPAP", "PAPAPAPAPAPAPAPAPAPA", "APAPAPAPAPAPAPAPAPA." };
    int K = 199;
    assertEquals(200, uniformboard.getBoard(board, K));
  }

  @Test
  public void case10() {
    String[] board = { "AP.PA", "AP.PA", "AP.PA", "AP.PA", "AP.PA" };
    int K = 7;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case11() {
    String[] board = { "APAPA", "APAPA", "APAPA", "APAPA", "APAPA" };
    int K = 1000;
    assertEquals(5, uniformboard.getBoard(board, K));
  }

  @Test
  public void case12() {
    String[] board = { "AAAAA", "PPPPP", "AAAAA", "PPPPP", "AAAAA" };
    int K = 100;
    assertEquals(5, uniformboard.getBoard(board, K));
  }

  @Test
  public void case13() {
    String[] board = { "PP..P.....PPPPPPP.P.", "P..P..P..PP.P.P.PPP.", "PP.PP.PPP.P..PPPPPP.", ".P.........P.P...PP.", "PP......P..P.PP...PP", "PPP...P.P.PP...PPPP.", "..P.PPP.P...P...PPPP", "PPPPPPP.P.....P..P.P", ".P.P.PPP..P....P.P..", "P.PP....PP.P.PPP.PP.", "P.PP.PP..P...PP.PPPP", "PP.P.......PP.PP....", ".P.P.PP..P...P....PP", "P...P..PPPP..PP...PP", "P.PPPP.P.P..PP..P.PP", ".P..PP.PP.P..PPPP.PP", "PP.PPPP..P..P..P.P.P", "PPPP...PP.P...P...PP", "P.P..P.PP...PP.P....", "PP.P.PP......PP.PP.P" };
    int K = 1000;
    assertEquals(0, uniformboard.getBoard(board, K));
  }

  @Test
  public void case14() {
    String[] board = { "." };
    int K = 1000;
    assertEquals(0, uniformboard.getBoard(board, K));
  }

  @Test
  public void case15() {
    String[] board = { "PPPPP", "PPPPP", "PPPPP", "PPPPP", "PPPPP" };
    int K = 345;
    assertEquals(0, uniformboard.getBoard(board, K));
  }

  @Test
  public void case16() {
    String[] board = { "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA" };
    int K = 0;
    assertEquals(400, uniformboard.getBoard(board, K));
  }

  @Test
  public void case17() {
    String[] board = { "..AA.AAAAA.......A.A", ".AA.AA.AA..A.A.A...A", "..A..A...A.AA......A", "A.AAAAAAAAA.A.AAA..A", "..AAAAAA.AA.A..AAA..", "...AAA.A.A..AAA....A", "AA.A...A.AAA.AAA....", ".......A.AAAAA.AA.A.", "A.A.A...AA.AAAA.A.AA", ".A..AAAA..A.A...A..A", ".A..A..AA.AAA..A....", "..A.AAAAAAA..A..AAAA", "A.A.A..AA.AAA.AAAA..", ".AAA.AA....AA..AAA..", ".A....A.A.AA..AA.A..", "A.AA..A..A.AA....A..", "..A....AA.AA.AA.A.A.", "....AAA..A.AAA.AAA..", ".A.AA.A..AAA..A.AAAA", "..A.A..AAAAAA..A..A." };
    int K = 1000;
    assertEquals(200, uniformboard.getBoard(board, K));
  }

  @Test
  public void case18() {
    String[] board = { "AAAAAAAAAAA", "AAAAAAAA.AA", "AAAAAA..AAA", "AAAAAA.AAAA", "AA.AAAAAAAA", "AAAAAAAAAAA", "AAAAAAAAAAA", "AAA.AAAAAAA", "AA.AAAAAAAA", "AA.AAAAAAAA", "AAAAAAAAAAA" };
    int K = 30;
    assertEquals(110, uniformboard.getBoard(board, K));
  }

  @Test
  public void case19() {
    String[] board = { ".........A..........", "...............A....", ".....A..............", "....A.A.AA..........", ".....A.A..A.........", "....A........A.....A", "....................", "...............A....", "..A.................", "..........A.A.......", ".A..A.....AA........", "....AA..........A...", ".......A....A.A.....", "...A...........AA...", ".A........A...A.....", "A.A......A..........", ".......A..A.........", "....AAA........A....", ".........A........A.", ".........A.........A" };
    int K = 1000;
    assertEquals(45, uniformboard.getBoard(board, K));
  }

  @Test
  public void case20() {
    String[] board = { "APPPPPAAAPPAPPPPPPPA", "PPPPPPAPPPAPPP.PPPPP", "PPPPPAPPPPPPPPPPPAPP", "PPPPPAPPPPPPPPAPPPAP", "PPPPPPPPPPPPPPAPPPAP", "PAPPPPAPPPPPPPPPPPPA", "PPAPPAPAPPPPPPPAPPPP", "PPPPAPPPPPPPPPPPAAPP", "PPPPPPPPPPPPPAPPPPAP", "PPAPPPPPPPPPPPPPPPPP", "PPPAPPAPPPPPPAAPPPPP", "PPPPPAPPPPPAAPPPPPPA", "PPAPPAPPPPPPPAPPPPPA", "PPPPPPPPPPPPPPAPPPPA", "PPPPAPPPPAPPPAPPPPPP", "PPPPPPPPPPAPPPAPPPPP", "PPAAPPPPAPPPPPPPPPPP", "PPPAPPPAPPPAPPPPPPPP", "PPAPPAAPPAPPPPPAPPPP", "PPPPAPPPPPPPPPPPPPPP" };
    int K = 1000;
    assertEquals(57, uniformboard.getBoard(board, K));
  }

  @Test
  public void case21() {
    String[] board = { "APPPPPAAAPPAPPPPPPPA", "PPPPPPAPPPAPPP.PPPPP", "PPPPPAPPPPPPPPPPPAPP", "PPPPPAPPPPPPPPAPPPAP", "PPPPPPPPPPPPPPAPPPAP", "PAPPPPAPPPPPPPPPPPPA", "PPAPPAPAPPPPPPPAPPPP", "PPPPAPPPPPPPPPPPAAPP", "PPPPPPPPPPPPPAPPPPAP", "PPAPPPPPPPPPPPPPPPPP", "PPPAPPAPPPPPPAAPPPPP", "PPPPPAPPPPPAAPPPPPPA", "PPAPPAPPPPPPPAPPPPPA", "PPPPPPPPPPPPPPAPPPPA", "PPPPAPPPPAPPPAPPPPPP", "PPPPPPPPPPAPPPAPPPPP", "PPAAPPPPAPPPPPPPPPPP", "PPPAPPPAPPPAPPPPPPPP", "PPAPPAAPPAPPPPPAPPPP", "PPPPAPPPPPPPPPPPPPPP" };
    int K = 15;
    assertEquals(12, uniformboard.getBoard(board, K));
  }

  @Test
  public void case22() {
    String[] board = { "PAAAAAAAAAAAPAAPAAAA", "AAAAAAAAAPAPAAAAAAAP", "PPPAAAAAAAAAAPAAAPPA", "AAAAAAAPAAAAAAAAAAAA", "AAAAPAAAPAAAAAAAAAAA", "AAAAAPAAPAAAAPAAAAAA", "APAAAAAAAPAAAAAAAPAA", "AAAAAPAAAAAAPAPAAPAA", "AAPAAPAAAAAAPAAPAPAA", "APAAAAAAAAAAPAAAAAPA", "AAAPAAAAAPPAAAAAPAAA", "AAAAAAAAPPAAPAAAAAAA", "AAAPAAAPAAAAAAAPAAAA", "PAPAAAAAPAAAAAAAPAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAPAAAAA", "PAAAAPAAAAAPAAAAAAAP", "AAAAPAAAAAAAAAAAAAAP", "AAPAAAAAAAAPAAAAAAAA", "AAAAAPAAAAAAPAAA.PAP" };
    int K = 59;
    assertEquals(224, uniformboard.getBoard(board, K));
  }

  @Test
  public void case23() {
    String[] board = { ".P.PP...PP.P", "P.P....P.P.P", "....P.PP...P", ".P.PP.PPP...", "....PP....P.", "P..PP.PPP.P.", "...P.P.PP.PP", ".PP.P.......", "..P.PP.PPPPP", "PPP....PP.PP", "..P.P...PPP.", "APPP.P.PP.PP" };
    int K = 998;
    assertEquals(1, uniformboard.getBoard(board, K));
  }

  @Test
  public void case24() {
    String[] board = { "..PPAA...AAP", "P.AA.P....P.", ".P.P.AP.A.AP", ".A.PAAA..A.P", "AAP.APPAPPAA", ".AP..A.PAPPA", "PPPA.PPPA.PA", "A..A....P.A.", "A.APAAPAP.AP", "APA.APAAPPPA", "AAPA.A.PAPP.", "P....AP.AA.." };
    int K = 12;
    assertEquals(20, uniformboard.getBoard(board, K));
  }

  @Test
  public void case25() {
    String[] board = { "AAA.AAPPPA", "P.P.A.PAA.", "AAAA..A..P", ".PP.APP.PP", "A.PPA.P...", "PA.APP.PPA", "A..PAPAAP.", "AAA.P.P.P.", ".PAP.AA...", "AAAAPPP.AP" };
    int K = 11;
    assertEquals(18, uniformboard.getBoard(board, K));
  }

  @Test
  public void case26() {
    String[] board = { "A.APAPAA.A.", "A.PPP...PP.", ".PPPP.P.PP.", "P.PPP.PPP.P", "P..P...P.P.", "P.PPPP...PP", "..P.PPP..PP", "...PP.P..P.", ".PP..P..PP.", "P.PPP.P.P..", "P.P....P.PP" };
    int K = 261;
    assertEquals(7, uniformboard.getBoard(board, K));
  }

  @Test
  public void case27() {
    String[] board = { "APPAA.P..A.PP", "PA..AA.AP.AAA", "..PP.P..PPP.P", "P.P...PP...PP", ".PP....P.P.PP", ".P.PPPP.P..PP", "P.P.P..PPPPP.", "P..P.P.PP....", "PP..PP.PPP.PP", ".P..PP..P..P.", "...P....P....", "..PP.P.PP.P.P", "PPPP.P.P....P" };
    int K = 659;
    assertEquals(11, uniformboard.getBoard(board, K));
  }

  @Test
  public void case28() {
    String[] board = { "PP.AAAA....APA.", "A.AAA..AA.PP.A.", "..PPPP..P..PP.P", "..PP.PPP....PPP", "...PPPP.P..PPPP", ".P.....P.P....P", "PP.......P..P..", "..PP..P.PP...PP", "P.P...P.PP.P.PP", "P.P..PPP.PP..P.", "PP.......PPPP.P", "P.PP..PPP.P.P..", "..PP.PPPP..P...", ".PP...PP.PPPP..", "P.P...P....PPPP" };
    int K = 123;
    assertEquals(13, uniformboard.getBoard(board, K));
  }

  @Test
  public void case29() {
    String[] board = { "AAPPA.AAAAA.A", "AAAPAPPPA..P.", "P..PPPPPP.P..", "..P...P...P..", "P.P.P.PPPP.PP", "PP.P.P.PP...P", ".....P..P..PP", "P.P..P..PP...", "PPP.P.PP.P..P", "P.PPPPPPP..P.", ".P.....P..PPP", "P.PP..PP..P.P", "..P..P.P..P.." };
    int K = 221;
    assertEquals(14, uniformboard.getBoard(board, K));
  }

  @Test
  public void case30() {
    String[] board = { "PA...PAPAA...A", "APAA.A.PA..P..", "..AAPAAPA.P.P.", ".....P.P.P....", "P.PPP.P.PPPP..", ".P.PPPPPP..P.P", "P..PPP..PPPP.P", "..P...P.PP...P", ".P..PPP..P.P..", "P.P.....PPP...", "..PP..PPPP..P.", "....PP...PPPPP", "PP.PPPP.P...P.", "P...PPP..P.PPP" };
    int K = 155;
    assertEquals(15, uniformboard.getBoard(board, K));
  }

  @Test
  public void case31() {
    String[] board = { "...AAPAPAAAAAP.A", "..PAAA.PAAPA.PP.", "APPPPP.....PP.P.", "PP.PP...P.P...PP", "PPPP.....P..PP..", "..PP.PPP.P.PP.P.", "P.P.P.PP..P.P.PP", ".P...PPPP..PPP.P", ".PPP...P.P....P.", "...PP.PPPP.PPPP.", "PPP.PPPPPPP.P.PP", "....PP.P.P.PPP.P", "...PP.P.......P.", ".P.P.PPP..P.P.P.", "..PP..P.P..PPPP.", "PP.PPP..P..PP..." };
    int K = 169;
    assertEquals(16, uniformboard.getBoard(board, K));
  }

  @Test
  public void case32() {
    String[] board = { "PAPAAAAP.PP.PP.AAP", "AAAAA.PPP.AAAAP.AP", "...P.P.PPPPP.P.PP.", "PP.PP..P........P.", "PPP.PPP.PPPP..PP.P", "PPPPP...P..P..PP.P", ".....PP..PP.PPPP..", ".PP.PPPP...PPP...P", "PPPPP....PPPPPP.PP", "....P.PPPPPPP.P.P.", "PPP.PP.P..PP.P.PPP", "P.P...P.PPP.PPP..P", "..PP.PPPP.PP.P..PP", ".....PPP.P.P.P.P..", ".PP..PP.P..P..PPPP", "PPPPPP.PP..P.P..P.", "..P.P.P.PPP.PPPP..", ".PPPPP..P.P.PPP.P." };
    int K = 899;
    assertEquals(17, uniformboard.getBoard(board, K));
  }

  @Test
  public void case33() {
    String[] board = { "AAA.AA.AAA.PAA", "PP.APPA.A.AAAA", "PA..P..P.P....", "P.PPPPP..P..PP", "P..PP.PP.PP...", ".P.PP.P.P..PP.", "....P...P.PP.P", "...PPP.PP.PP..", "..P....PPPP..P", "...P.P..P....P", ".P.P.P..P.P.PP", ".P.P.PP..PPP..", ".PPPPP.PPP.P..", "..PPPPP...PP.." };
    int K = 678;
    assertEquals(18, uniformboard.getBoard(board, K));
  }

  @Test
  public void case34() {
    String[] board = { ".PAAAA..APP.A.AP", ".PPAPPAPAAA..APP", "AAA.PAAAP..PPP..", ".PPP..P....PPP.P", "P..P.PP.P.P.PP..", "PP..PPPPPPP.P...", "..P..PP...P.....", "P.PPP..P...P.PP.", "..P....PPPP....P", "P.PP.PP..P.P....", "PPP.P..PPPP..PPP", "P.PP..PP..P.P.PP", "PP.PPPP...P.P..P", "PP...P.P...P.P.P", "..P..P...P.PP...", ".PPPPP...PP.PP.." };
    int K = 133;
    assertEquals(18, uniformboard.getBoard(board, K));
  }

  @Test
  public void case35() {
    String[] board = { "A.AAA.APA.P.PPAPA.PA", "AAAPA..AAA.P.PPPPAAA", "PP.PP..PP.P...P...PP", "....P..P...PP..P.P..", "P.P.PPP.PPPP.PPP..PP", "P..PPP.P....P.P.....", "PPP..PP..PP..P.PPP.P", "P.PP.PP.PPPP.PP..PPP", ".PP.PPP.P.PP.P.P.PP.", ".P..P.P.P..PPP...PPP", ".P.PPPPPP.PP..PP...P", "...PP.PPP..PP.PPPP..", ".P....P..P.P.PPP...P", "P.PPPP.PP......P....", "...P.P.PPPP..PPPP...", "..P.PPP..PPPP..PPP..", "..P.P....P..PP......", "PPP..P.P..P.......P.", "P...P.P..P...P.P.P.P", "PPP..PPPPP.P...PP..." };
    int K = 131;
    assertEquals(19, uniformboard.getBoard(board, K));
  }

  @Test
  public void case36() {
    String[] board = { "AAAAPA.APAAP.AAAAPAA", "P.A.A.AA.AA...PP..P.", "P..P.PPPP.PP..P.PP..", "P..P.PPPPP..P..PP..P", ".P.PP.PP.....PPPPP.P", "..PPPP.PPPPPP..P....", "...PPPPP..P.PP...P..", "PP...PPPP..PP...PPP.", "PP....PPP.P.P.PPPPPP", ".....P..........PPPP", "P..PP..P..P..PPP.PP.", "...P.P.P..P.P.P...P.", "PP.P..P.P.PP.PP..PPP", "....PP.P.PP.PP......", "PPP.PP...P..P....P.P", ".P.P...P..PPPPPPPP.P", ".P....PP.P.PP.P.P..P", "PP..P.PPP.PPPP..P.PP", "P...PP...P.P..P.P...", "PPPP...P.PP....P.P.P" };
    int K = 531;
    assertEquals(20, uniformboard.getBoard(board, K));
  }

  @Test
  public void case37() {
    String[] board = { ".PPPAA..P.", "A.AAAAAP.A", "AAP.PAP.PP", "AAA...P.A.", ".AAPPAA.P.", "P..PPPPP.P", "P...P.....", "P...PPPPP.", "PP..P...PP", "..P.P.PP.P" };
    int K = 341;
    assertEquals(20, uniformboard.getBoard(board, K));
  }

  @Test
  public void case38() {
    String[] board = { "AAAAA", "AAAAA", "AAAAA", "AAAAA", ".P..P" };
    int K = 1;
    assertEquals(20, uniformboard.getBoard(board, K));
  }

  @Test
  public void case39() {
    String[] board = { "AAAAAA", "AAAAAA", "AAAAAA", "P.PP.P", "....P.", "PP.P.P" };
    int K = 1;
    assertEquals(18, uniformboard.getBoard(board, K));
  }

  @Test
  public void case40() {
    String[] board = { "AAP.A.P.P", ".AA.PA.AP", ".A.PPAA..", "APPPAA.A.", "A.PAPAA..", "PP.P..PPP", "PPP.P.PPP", ".PPP.PPP.", "P...P.P.P" };
    int K = 123;
    assertEquals(18, uniformboard.getBoard(board, K));
  }

  @Test
  public void case41() {
    String[] board = { ".PA.AAPA", "A...P.AA", "A..APA.P", "A.AAAAA.", "..P.P.P.", ".P.P...P", "...P....", "PPP..PPP" };
    int K = 795;
    assertEquals(16, uniformboard.getBoard(board, K));
  }

  @Test
  public void case42() {
    String[] board = { "AAAAA", "AAAAA", "AAAAA", ".P..P", "PP.P." };
    int K = 189;
    assertEquals(15, uniformboard.getBoard(board, K));
  }

  @Test
  public void case43() {
    String[] board = { "AAP.A", ".AAA.", "AA.AA", "..PP.", "PPPP." };
    int K = 11;
    assertEquals(10, uniformboard.getBoard(board, K));
  }

  @Test
  public void case44() {
    String[] board = { ".A.A", "PPAP", "A.PP", "APA." };
    int K = 99;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case45() {
    String[] board = { "A.AA.", "AAAA.", "AAPAP", "A..P.", ".P..." };
    int K = 677;
    assertEquals(10, uniformboard.getBoard(board, K));
  }

  @Test
  public void case46() {
    String[] board = { "AAAAA", ".PAAP", ".PP..", "P...P", ".PPPP" };
    int K = 333;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case47() {
    String[] board = { "AAAAP.PA", "PPAAP...", "PPP.P.P.", "PP.P..PP", ".P.P....", "P....PPP", "..P.P...", ".P.P.P.P" };
    int K = 11;
    assertEquals(7, uniformboard.getBoard(board, K));
  }

  @Test
  public void case48() {
    String[] board = { "A..AAPPPAAAAPA.P", "PPPAAA..AP..PAPP", "A.PAAAPAAPA.PA.A", "AP.PAAA.A.PAAAAA", "....P..A..AP..AP", ".PA.A.AAP.P.P.AA", "A.AP.....A.PAPA.", ".AAPA..AAA.PA.A.", ".P.PAPAAPPAPAAA.", "PA.APA...AAAPPPP", ".P.PP..A.PP..A.A", "APP.A.PP.APPPPAA", "...AAAAPPPPPAP.A", "PP.PPAP.PAAA.AP.", "PAAP.AAP.AA.APPA", "AA.PPPAAA.PAPAAA" };
    int K = 1000;
    assertEquals(100, uniformboard.getBoard(board, K));
  }

  @Test
  public void case49() {
    String[] board = { "AAAAA", "AAAAA", "AAAAA", "AA...", "....." };
    int K = 1000;
    assertEquals(16, uniformboard.getBoard(board, K));
  }

  @Test
  public void case50() {
    String[] board = { "AAAA", "AAPP", "PPPP", "PAA." };
    int K = 4;
    assertEquals(8, uniformboard.getBoard(board, K));
  }

  @Test
  public void case51() {
    String[] board = { "AAPAAP.PPP", "AAPAAPPPPA", "AAPAAPPPAA", "PPPPPPPPPP", "PPPPPPPPPP", "PPPPPPPPPP", "PPPPPPPPPP", "PPPPPPPPPP", "PPPPPPPPPP", "PPPPPPPPPP" };
    int K = 6;
    assertEquals(15, uniformboard.getBoard(board, K));
  }

  @Test
  public void case52() {
    String[] board = { "AAAP", "PPAP", "AAAP", "P.AA" };
    int K = 1000;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case53() {
    String[] board = { ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".A.A.A.A.A.A.A.A.A.A", ".AAAAAAAAAAAAAAAAAP.", ".A.A.A.A.A.A.A.A.A.A" };
    int K = 10;
    assertEquals(36, uniformboard.getBoard(board, K));
  }

  @Test
  public void case54() {
    String[] board = { "PP", "PP" };
    int K = 1;
    assertEquals(0, uniformboard.getBoard(board, K));
  }

  @Test
  public void case55() {
    String[] board = { ".AAA", "APPP", "AAAA", "APPP" };
    int K = 20;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case56() {
    String[] board = { "AP.A", "PPPP", "PPAA", "PPPP" };
    int K = 3;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case57() {
    String[] board = { "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAPA", "PAPAPAPAPAPAPAPAPAP." };
    int K = 1000;
    assertEquals(198, uniformboard.getBoard(board, K));
  }

  @Test
  public void case58() {
    String[] board = { "APA", "PP.", "AAP" };
    int K = 1000;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case59() {
    String[] board = { ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA", ".AAAPPPAAA" };
    int K = 60;
    assertEquals(60, uniformboard.getBoard(board, K));
  }

  @Test
  public void case60() {
    String[] board = { "APPPPP", "PAAAAP", "PAAAAP", "PAAP.P", "PPPPPA", "PPPPPP" };
    int K = 3;
    assertEquals(12, uniformboard.getBoard(board, K));
  }

  @Test
  public void case61() {
    String[] board = { "AA", "A." };
    int K = 100;
    assertEquals(2, uniformboard.getBoard(board, K));
  }

  @Test
  public void case62() {
    String[] board = { "APPP", "PAPP", ".PAP", "PPPA" };
    int K = 4;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case63() {
    String[] board = { "AAA..", "AAA..", "A....", ".....", "....." };
    int K = 100;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case64() {
    String[] board = { "PPPPPPPPAPAP", "AAAAPPPAPAPP", "AAAPPPPA.PAA", "APAAPAPAPPAP", "PPAAAPAPPAAA", "PAAPAAPAPAAP", "AAAPPAPPAPPP", "AAPAAAAPPPPP", "AAPAAAPPAPAP", "APPPAPPPPPAP", "PAPPAPAAAPAA", "PAPPPAPPAAAP" };
    int K = 376;
    assertEquals(66, uniformboard.getBoard(board, K));
  }

  @Test
  public void case65() {
    String[] board = { "APP", "A.A", "PPA" };
    int K = 3;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case66() {
    String[] board = { "AAA...", "A.A...", "AAA...", "...AAA", "...AAA", "...AAA" };
    int K = 0;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case67() {
    String[] board = { "AA.P", "PPAP", "PPPA", "PPPP" };
    int K = 3;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case68() {
    String[] board = { "A.AP", "PPAA", "AAAA", "AAAA" };
    int K = 4;
    assertEquals(12, uniformboard.getBoard(board, K));
  }

  @Test
  public void case69() {
    String[] board = { "AA.A", "PPPA", "PPPA", "AAAA" };
    int K = 13;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case70() {
    String[] board = { "AAAP", "APAA", "AAAP", "PPPP" };
    int K = 100;
    assertEquals(3, uniformboard.getBoard(board, K));
  }

  @Test
  public void case71() {
    String[] board = { "APA", "A.P", "AAA" };
    int K = 50;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case72() {
    String[] board = { "..AAA", "A..AA", "AAA.A", "....A", "AAAAA" };
    int K = 10;
    assertEquals(16, uniformboard.getBoard(board, K));
  }

  @Test
  public void case73() {
    String[] board = { "APAP", "PAPA", "APAP", "PPP." };
    int K = 6;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case74() {
    String[] board = { "APAP", "PAPA", "APAP", "PAP." };
    int K = 400;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case75() {
    String[] board = { "AAAA", "A.PA", "APPA", "AAAA" };
    int K = 15;
    assertEquals(12, uniformboard.getBoard(board, K));
  }

  @Test
  public void case76() {
    String[] board = { "PPPA.", "PAAAP", "PAAAP", "PAPPP", "APPPP" };
    int K = 100;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case77() {
    String[] board = { "AAAA", "..PP", "AAAA", "PPPP" };
    int K = 6;
    assertEquals(8, uniformboard.getBoard(board, K));
  }

  @Test
  public void case78() {
    String[] board = { "PPP", "APA", "A.A" };
    int K = 10;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case79() {
    String[] board = { "PAP", "A.A", "PAP" };
    int K = 1000;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case80() {
    String[] board = { "AAAPP", "A.PPP", "AAAPP", "PPPPP", "PPPAA" };
    int K = 3;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case81() {
    String[] board = { "...", ".A.", "..A" };
    int K = 1000;
    assertEquals(2, uniformboard.getBoard(board, K));
  }

  @Test
  public void case82() {
    String[] board = { "P.....P", "PAP..PP", "PA.APAP", "..AAAP.", ".PPPP.P", "..PAP..", "APPA.P." };
    int K = 9;
    assertEquals(10, uniformboard.getBoard(board, K));
  }

  @Test
  public void case83() {
    String[] board = { "APP", "PAP", ".PA" };
    int K = 3;
    assertEquals(3, uniformboard.getBoard(board, K));
  }

  @Test
  public void case84() {
    String[] board = { "AAA", "AAA", "PPP" };
    int K = 100;
    assertEquals(6, uniformboard.getBoard(board, K));
  }

  @Test
  public void case85() {
    String[] board = { "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP..........", "AAAAAAAAAA..........", "PPPPPPPPPP.........." };
    int K = 1000;
    assertEquals(100, uniformboard.getBoard(board, K));
  }

  @Test
  public void case86() {
    String[] board = { "AAAA", "APP.", "PPAA", "APPP" };
    int K = 7;
    assertEquals(8, uniformboard.getBoard(board, K));
  }

  @Test
  public void case87() {
    String[] board = { "AAP", "PPP", ".AA" };
    int K = 4;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case88() {
    String[] board = { "AAP", ".PA", "APP" };
    int K = 3;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case89() {
    String[] board = { "AAA", "P.P", "PPA" };
    int K = 3;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

  @Test
  public void case90() {
    String[] board = { "AAAAAP", "AAAAAP", "AAAAAP", "AAAAAP", "AAAA.P", "PPPPAA" };
    int K = 1;
    assertEquals(25, uniformboard.getBoard(board, K));
  }

  @Test
  public void case91() {
    String[] board = { "AAA", "PPP", "AAA" };
    int K = 10;
    assertEquals(3, uniformboard.getBoard(board, K));
  }

  @Test
  public void case92() {
    String[] board = { "AAAP", "AP.P", "AAAP", "PAPA" };
    int K = 3;
    assertEquals(9, uniformboard.getBoard(board, K));
  }

  @Test
  public void case93() {
    String[] board = { "AAP", ".PA", "PPA" };
    int K = 3;
    assertEquals(4, uniformboard.getBoard(board, K));
  }

}
