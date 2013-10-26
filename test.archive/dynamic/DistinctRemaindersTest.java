package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DistinctRemaindersTest {
  DistinctRemainders distinctremainders = new DistinctRemainders();

  @Test
  public void case1() {
    long N = 3L;
    int M = 2;
    assertEquals(5, distinctremainders.howMany(N, M));
  }

  @Test
  public void case2() {
    long N = 3L;
    int M = 3;
    assertEquals(9, distinctremainders.howMany(N, M));
  }

  @Test
  public void case3() {
    long N = 58L;
    int M = 1;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case4() {
    long N = 572L;
    int M = 7;
    assertEquals(922572833, distinctremainders.howMany(N, M));
  }

  @Test
  public void case5() {
    long N = 1000000000000000000L;
    int M = 20;
    assertEquals(240297629, distinctremainders.howMany(N, M));
  }

  @Test
  public void case6() {
    long N = 1L;
    int M = 1;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case7() {
    long N = 1000000000000000000L;
    int M = 50;
    assertEquals(46857165, distinctremainders.howMany(N, M));
  }

  @Test
  public void case8() {
    long N = 14L;
    int M = 7;
    assertEquals(643, distinctremainders.howMany(N, M));
  }

  @Test
  public void case9() {
    long N = 7L;
    int M = 14;
    assertEquals(57, distinctremainders.howMany(N, M));
  }

  @Test
  public void case10() {
    long N = 15L;
    int M = 15;
    assertEquals(2121, distinctremainders.howMany(N, M));
  }

  @Test
  public void case11() {
    long N = 97L;
    int M = 23;
    assertEquals(768934218, distinctremainders.howMany(N, M));
  }

  @Test
  public void case12() {
    long N = 1L;
    int M = 20;
    assertEquals(3, distinctremainders.howMany(N, M));
  }

  @Test
  public void case13() {
    long N = 1L;
    int M = 50;
    assertEquals(3, distinctremainders.howMany(N, M));
  }

  @Test
  public void case14() {
    long N = 2L;
    int M = 7;
    assertEquals(3, distinctremainders.howMany(N, M));
  }

  @Test
  public void case15() {
    long N = 93L;
    int M = 14;
    assertEquals(718116655, distinctremainders.howMany(N, M));
  }

  @Test
  public void case16() {
    long N = 6L;
    int M = 2;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case17() {
    long N = 8473L;
    int M = 3;
    assertEquals(5651, distinctremainders.howMany(N, M));
  }

  @Test
  public void case18() {
    long N = 40059L;
    int M = 37;
    assertEquals(914138702, distinctremainders.howMany(N, M));
  }

  @Test
  public void case19() {
    long N = 858756L;
    int M = 14;
    assertEquals(698140627, distinctremainders.howMany(N, M));
  }

  @Test
  public void case20() {
    long N = 3325264L;
    int M = 2;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case21() {
    long N = 99726960L;
    int M = 20;
    assertEquals(602857538, distinctremainders.howMany(N, M));
  }

  @Test
  public void case22() {
    long N = 405046580L;
    int M = 2;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case23() {
    long N = 6709199525L;
    int M = 13;
    assertEquals(312260183, distinctremainders.howMany(N, M));
  }

  @Test
  public void case24() {
    long N = 92774141998L;
    int M = 29;
    assertEquals(555712049, distinctremainders.howMany(N, M));
  }

  @Test
  public void case25() {
    long N = 912490109202L;
    int M = 3;
    assertEquals(326883271, distinctremainders.howMany(N, M));
  }

  @Test
  public void case26() {
    long N = 5073951506241L;
    int M = 6;
    assertEquals(598861277, distinctremainders.howMany(N, M));
  }

  @Test
  public void case27() {
    long N = 64433690240928L;
    int M = 2;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case28() {
    long N = 173767058179049L;
    int M = 35;
    assertEquals(487236212, distinctremainders.howMany(N, M));
  }

  @Test
  public void case29() {
    long N = 7737496696886829L;
    int M = 26;
    assertEquals(843624497, distinctremainders.howMany(N, M));
  }

  @Test
  public void case30() {
    long N = 95549062400722057L;
    int M = 33;
    assertEquals(293405701, distinctremainders.howMany(N, M));
  }

  @Test
  public void case31() {
    long N = 319690881584892264L;
    int M = 30;
    assertEquals(626187333, distinctremainders.howMany(N, M));
  }

  @Test
  public void case32() {
    long N = 4L;
    int M = 1;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case33() {
    long N = 10L;
    int M = 12;
    assertEquals(299, distinctremainders.howMany(N, M));
  }

  @Test
  public void case34() {
    long N = 991L;
    int M = 23;
    assertEquals(695583054, distinctremainders.howMany(N, M));
  }

  @Test
  public void case35() {
    long N = 3130L;
    int M = 4;
    assertEquals(922030094, distinctremainders.howMany(N, M));
  }

  @Test
  public void case36() {
    long N = 6998L;
    int M = 14;
    assertEquals(493245411, distinctremainders.howMany(N, M));
  }

  @Test
  public void case37() {
    long N = 884994L;
    int M = 21;
    assertEquals(24078637, distinctremainders.howMany(N, M));
  }

  @Test
  public void case38() {
    long N = 5615879L;
    int M = 13;
    assertEquals(798441238, distinctremainders.howMany(N, M));
  }

  @Test
  public void case39() {
    long N = 93750616L;
    int M = 13;
    assertEquals(313501897, distinctremainders.howMany(N, M));
  }

  @Test
  public void case40() {
    long N = 667860488L;
    int M = 3;
    assertEquals(445240327, distinctremainders.howMany(N, M));
  }

  @Test
  public void case41() {
    long N = 5707439769L;
    int M = 1;
    assertEquals(1, distinctremainders.howMany(N, M));
  }

  @Test
  public void case42() {
    long N = 64272166814L;
    int M = 14;
    assertEquals(243544564, distinctremainders.howMany(N, M));
  }

  @Test
  public void case43() {
    long N = 477986576516L;
    int M = 11;
    assertEquals(98094246, distinctremainders.howMany(N, M));
  }

  @Test
  public void case44() {
    long N = 4606736991870L;
    int M = 9;
    assertEquals(111082852, distinctremainders.howMany(N, M));
  }

  @Test
  public void case45() {
    long N = 60881169868247L;
    int M = 4;
    assertEquals(723892939, distinctremainders.howMany(N, M));
  }

  @Test
  public void case46() {
    long N = 392598014505174L;
    int M = 12;
    assertEquals(192249185, distinctremainders.howMany(N, M));
  }

  @Test
  public void case47() {
    long N = 1429671065610848L;
    int M = 13;
    assertEquals(717138391, distinctremainders.howMany(N, M));
  }

  @Test
  public void case48() {
    long N = 34533278621946847L;
    int M = 31;
    assertEquals(586731273, distinctremainders.howMany(N, M));
  }

  @Test
  public void case49() {
    long N = 245299575173742828L;
    int M = 14;
    assertEquals(357350463, distinctremainders.howMany(N, M));
  }

  @Test
  public void case50() {
    long N = 427783988761240522L;
    int M = 47;
    assertEquals(371449307, distinctremainders.howMany(N, M));
  }

  @Test
  public void case51() {
    long N = 482273829627639113L;
    int M = 4;
    assertEquals(248716576, distinctremainders.howMany(N, M));
  }

  @Test
  public void case52() {
    long N = 227091392807824344L;
    int M = 19;
    assertEquals(433082854, distinctremainders.howMany(N, M));
  }

  @Test
  public void case53() {
    long N = 927736909704583337L;
    int M = 10;
    assertEquals(396475076, distinctremainders.howMany(N, M));
  }

  @Test
  public void case54() {
    long N = 476282457179118177L;
    int M = 35;
    assertEquals(161075241, distinctremainders.howMany(N, M));
  }

  @Test
  public void case55() {
    long N = 127572008851308845L;
    int M = 5;
    assertEquals(71426118, distinctremainders.howMany(N, M));
  }

  @Test
  public void case56() {
    long N = 124918559510750750L;
    int M = 16;
    assertEquals(622052085, distinctremainders.howMany(N, M));
  }

  @Test
  public void case57() {
    long N = 732591068249655412L;
    int M = 22;
    assertEquals(449342301, distinctremainders.howMany(N, M));
  }

  @Test
  public void case58() {
    long N = 668126003465555919L;
    int M = 8;
    assertEquals(371382139, distinctremainders.howMany(N, M));
  }

  @Test
  public void case59() {
    long N = 423953064949530647L;
    int M = 15;
    assertEquals(798649911, distinctremainders.howMany(N, M));
  }

  @Test
  public void case60() {
    long N = 721181777663307639L;
    int M = 46;
    assertEquals(5816363, distinctremainders.howMany(N, M));
  }

  @Test
  public void case61() {
    long N = 955361208302576247L;
    int M = 37;
    assertEquals(37396509, distinctremainders.howMany(N, M));
  }

  @Test
  public void case62() {
    long N = 776066125740417664L;
    int M = 16;
    assertEquals(616443748, distinctremainders.howMany(N, M));
  }

  @Test
  public void case63() {
    long N = 282399450093718453L;
    int M = 30;
    assertEquals(706241491, distinctremainders.howMany(N, M));
  }

  @Test
  public void case64() {
    long N = 793663430571841969L;
    int M = 6;
    assertEquals(611994722, distinctremainders.howMany(N, M));
  }

  @Test
  public void case65() {
    long N = 116764009883140394L;
    int M = 42;
    assertEquals(398644261, distinctremainders.howMany(N, M));
  }

  @Test
  public void case66() {
    long N = 90403892428491992L;
    int M = 37;
    assertEquals(869771677, distinctremainders.howMany(N, M));
  }

  @Test
  public void case67() {
    long N = 490189236877093361L;
    int M = 48;
    assertEquals(527504284, distinctremainders.howMany(N, M));
  }

  @Test
  public void case68() {
    long N = 655845410602572598L;
    int M = 43;
    assertEquals(221794262, distinctremainders.howMany(N, M));
  }

  @Test
  public void case69() {
    long N = 781804787448477614L;
    int M = 49;
    assertEquals(589605840, distinctremainders.howMany(N, M));
  }

  @Test
  public void case70() {
    long N = 720343730613591728L;
    int M = 7;
    assertEquals(208289671, distinctremainders.howMany(N, M));
  }

  @Test
  public void case71() {
    long N = 993293851500934210L;
    int M = 9;
    assertEquals(957411041, distinctremainders.howMany(N, M));
  }

  @Test
  public void case72() {
    long N = 140402649375493885L;
    int M = 50;
    assertEquals(784795354, distinctremainders.howMany(N, M));
  }

  @Test
  public void case73() {
    long N = 196693153802145406L;
    int M = 11;
    assertEquals(250848519, distinctremainders.howMany(N, M));
  }

  @Test
  public void case74() {
    long N = 756378842767465288L;
    int M = 21;
    assertEquals(806609037, distinctremainders.howMany(N, M));
  }

  @Test
  public void case75() {
    long N = 571702284006185944L;
    int M = 44;
    assertEquals(185789492, distinctremainders.howMany(N, M));
  }

  @Test
  public void case76() {
    long N = 829124358688175621L;
    int M = 43;
    assertEquals(959786252, distinctremainders.howMany(N, M));
  }

  @Test
  public void case77() {
    long N = 410293588970904228L;
    int M = 29;
    assertEquals(455746555, distinctremainders.howMany(N, M));
  }

  @Test
  public void case78() {
    long N = 850011684922242067L;
    int M = 37;
    assertEquals(861781979, distinctremainders.howMany(N, M));
  }

  @Test
  public void case79() {
    long N = 782811923016652338L;
    int M = 46;
    assertEquals(906670156, distinctremainders.howMany(N, M));
  }

  @Test
  public void case80() {
    long N = 783877770011034090L;
    int M = 23;
    assertEquals(866276678, distinctremainders.howMany(N, M));
  }

  @Test
  public void case81() {
    long N = 727737286228695814L;
    int M = 16;
    assertEquals(212815630, distinctremainders.howMany(N, M));
  }

  @Test
  public void case82() {
    long N = 649920229735208654L;
    int M = 28;
    assertEquals(79599807, distinctremainders.howMany(N, M));
  }

  @Test
  public void case83() {
    long N = 777517989043429657L;
    int M = 29;
    assertEquals(722198808, distinctremainders.howMany(N, M));
  }

  @Test
  public void case84() {
    long N = 814895441298133647L;
    int M = 30;
    assertEquals(109189308, distinctremainders.howMany(N, M));
  }

  @Test
  public void case85() {
    long N = 14963006823662992L;
    int M = 16;
    assertEquals(22445463, distinctremainders.howMany(N, M));
  }

  @Test
  public void case86() {
    long N = 505292692323842888L;
    int M = 42;
    assertEquals(36508528, distinctremainders.howMany(N, M));
  }

  @Test
  public void case87() {
    long N = 410803061604391380L;
    int M = 25;
    assertEquals(473478163, distinctremainders.howMany(N, M));
  }

  @Test
  public void case88() {
    long N = 17341098467994024L;
    int M = 36;
    assertEquals(752034595, distinctremainders.howMany(N, M));
  }

  @Test
  public void case89() {
    long N = 216404853972400785L;
    int M = 37;
    assertEquals(624762120, distinctremainders.howMany(N, M));
  }

  @Test
  public void case90() {
    long N = 208575354064882855L;
    int M = 38;
    assertEquals(669159206, distinctremainders.howMany(N, M));
  }

  @Test
  public void case91() {
    long N = 715034367818813278L;
    int M = 38;
    assertEquals(115471281, distinctremainders.howMany(N, M));
  }

  @Test
  public void case92() {
    long N = 467771077419410734L;
    int M = 21;
    assertEquals(131733081, distinctremainders.howMany(N, M));
  }

  @Test
  public void case93() {
    long N = 19479558867415190L;
    int M = 6;
    assertEquals(871083309, distinctremainders.howMany(N, M));
  }

  @Test
  public void case94() {
    long N = 875931307701255497L;
    int M = 18;
    assertEquals(299370617, distinctremainders.howMany(N, M));
  }

  @Test
  public void case95() {
    long N = 830789743755355385L;
    int M = 20;
    assertEquals(324571030, distinctremainders.howMany(N, M));
  }

  @Test
  public void case96() {
    long N = 554074811793238223L;
    int M = 45;
    assertEquals(928845747, distinctremainders.howMany(N, M));
  }

  @Test
  public void case97() {
    long N = 912818363093652897L;
    int M = 37;
    assertEquals(245478616, distinctremainders.howMany(N, M));
  }

  @Test
  public void case98() {
    long N = 173837593383949663L;
    int M = 40;
    assertEquals(202744994, distinctremainders.howMany(N, M));
  }

  @Test
  public void case99() {
    long N = 216349954416444224L;
    int M = 50;
    assertEquals(589161980, distinctremainders.howMany(N, M));
  }

  @Test
  public void case100() {
    long N = 99999999999999999L;
    int M = 50;
    assertEquals(577168021, distinctremainders.howMany(N, M));
  }

  @Test
  public void case101() {
    long N = 1000000000000L;
    int M = 23;
    assertEquals(558640185, distinctremainders.howMany(N, M));
  }

  @Test
  public void case102() {
    long N = 1000000000000L;
    int M = 30;
    assertEquals(859815476, distinctremainders.howMany(N, M));
  }

  @Test
  public void case103() {
    long N = 1000000000000000000L;
    int M = 31;
    assertEquals(293376536, distinctremainders.howMany(N, M));
  }

}
