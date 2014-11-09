package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class NextOrPrevTest {
  NextOrPrev nextorprev = new NextOrPrev();

  @Test
  public void case1() {
    int nextCost = 5;
    int prevCost = 8;
    String start = "ae";
    String goal = "bc";
    assertEquals(21, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case2() {
    int nextCost = 5;
    int prevCost = 8;
    String start = "ae";
    String goal = "cb";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case3() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "srm";
    String goal = "srm";
    assertEquals(0, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case4() {
    int nextCost = 10;
    int prevCost = 1;
    String start = "acb";
    String goal = "bdc";
    assertEquals(30, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case5() {
    int nextCost = 10;
    int prevCost = 1;
    String start = "zyxw";
    String goal = "vuts";
    assertEquals(16, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case6() {
    int nextCost = 1000;
    int prevCost = 1000;
    String start = "abcdefghijklmnopqrstuvwxyz";
    String goal = "abcdefghijklmnopqrstuvwxyz";
    assertEquals(0, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case7() {
    int nextCost = 1000;
    int prevCost = 1000;
    String start = "abcdefghijklm";
    String goal = "nopqrstuvwxyz";
    assertEquals(169000, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case8() {
    int nextCost = 1000;
    int prevCost = 1000;
    String start = "nopqrstuvwxyz";
    String goal = "abcdefghijklm";
    assertEquals(169000, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case9() {
    int nextCost = 150;
    int prevCost = 328;
    String start = "c";
    String goal = "j";
    assertEquals(1050, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case10() {
    int nextCost = 189;
    int prevCost = 105;
    String start = "hj";
    String goal = "fu";
    assertEquals(2289, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case11() {
    int nextCost = 676;
    int prevCost = 594;
    String start = "zq";
    String goal = "bv";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case12() {
    int nextCost = 137;
    int prevCost = 80;
    String start = "np";
    String goal = "va";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case13() {
    int nextCost = 217;
    int prevCost = 14;
    String start = "pzm";
    String goal = "uya";
    assertEquals(1267, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case14() {
    int nextCost = 607;
    int prevCost = 663;
    String start = "ogw";
    String goal = "pce";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case15() {
    int nextCost = 242;
    int prevCost = 434;
    String start = "kvq";
    String goal = "lnp";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case16() {
    int nextCost = 879;
    int prevCost = 940;
    String start = "hetu";
    String goal = "dcgo";
    assertEquals(23500, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case17() {
    int nextCost = 42;
    int prevCost = 440;
    String start = "oria";
    String goal = "uwst";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case18() {
    int nextCost = 417;
    int prevCost = 149;
    String start = "djvkh";
    String goal = "akysg";
    assertEquals(5600, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case19() {
    int nextCost = 976;
    int prevCost = 588;
    String start = "ypubd";
    String goal = "tqpai";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case20() {
    int nextCost = 494;
    int prevCost = 615;
    String start = "gimjhx";
    String goal = "afqkbt";
    assertEquals(14155, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case21() {
    int nextCost = 210;
    int prevCost = 438;
    String start = "bipgzoy";
    String goal = "alsbzpt";
    assertEquals(6288, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case22() {
    int nextCost = 586;
    int prevCost = 935;
    String start = "ilwjdpfn";
    String goal = "emxgaubs";
    assertEquals(20122, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case23() {
    int nextCost = 359;
    int prevCost = 525;
    String start = "sueqyxthl";
    String goal = "orbntspdf";
    assertEquals(19425, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case24() {
    int nextCost = 273;
    int prevCost = 578;
    String start = "ufagnqxeso";
    String goal = "tfbjmrxesp";
    assertEquals(2794, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case25() {
    int nextCost = 156;
    int prevCost = 106;
    String start = "knpucjavzef";
    String goal = "qruvhpeyzln";
    assertEquals(7644, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case26() {
    int nextCost = 582;
    int prevCost = 48;
    String start = "sadebkfnotx";
    String goal = "tbhigqnsuvx";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case27() {
    int nextCost = 563;
    int prevCost = 440;
    String start = "ptrbgcnlaizo";
    String goal = "rtscedkiahul";
    assertEquals(10295, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case28() {
    int nextCost = 126;
    int prevCost = 311;
    String start = "yovlkwpjgsna";
    String goal = "zpwnkytjisob";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case29() {
    int nextCost = 920;
    int prevCost = 627;
    String start = "ikxunovswelrt";
    String goal = "ghyvknwrxbjos";
    assertEquals(15593, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case30() {
    int nextCost = 193;
    int prevCost = 494;
    String start = "mxltredcabswv";
    String goal = "ozmsqlkhbirut";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case31() {
    int nextCost = 884;
    int prevCost = 512;
    String start = "nufaseixrzbqh";
    String goal = "deifukhtxcanb";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case32() {
    int nextCost = 235;
    int prevCost = 986;
    String start = "ykesljtouvbfic";
    String goal = "ypjtrouswxbmni";
    assertEquals(11515, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case33() {
    int nextCost = 907;
    int prevCost = 213;
    String start = "tlqxpyswvfhmkb";
    String goal = "rknymzpwvbflhc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case34() {
    int nextCost = 520;
    int prevCost = 88;
    String start = "nslqpfvwmkrcgb";
    String goal = "kxgcrhznyovwep";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case35() {
    int nextCost = 398;
    int prevCost = 548;
    String start = "noaixgtydurkcvq";
    String goal = "lmbhxgszetpjdun";
    assertEquals(9264, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case36() {
    int nextCost = 768;
    int prevCost = 666;
    String start = "faugpikqnodxvbzy";
    String goal = "gbshoijrmnevudzw";
    assertEquals(12702, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case37() {
    int nextCost = 27;
    int prevCost = 314;
    String start = "rxswhmdiyvfeoatpb";
    String goal = "qwrvhjdiztfekbsnc";
    assertEquals(5105, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case38() {
    int nextCost = 743;
    int prevCost = 756;
    String start = "lvnbxeqpodizwshkcf";
    String goal = "kulawdpnmcgzvqfhbe";
    assertEquals(18900, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case39() {
    int nextCost = 123;
    int prevCost = 367;
    String start = "cuqypviwjterxzbogdn";
    String goal = "ernxmsivjqgpwyblhfk";
    assertEquals(10770, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case40() {
    int nextCost = 731;
    int prevCost = 657;
    String start = "vwmgosyetihqkrlapxfd";
    String goal = "wxniotzeukjqlrmbpyhc";
    assertEquals(13815, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case41() {
    int nextCost = 42;
    int prevCost = 267;
    String start = "lcxpvsuhoqejimfytkgzb";
    String goal = "lbwpvruhoqdjinfyskgza";
    assertEquals(1644, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case42() {
    int nextCost = 886;
    int prevCost = 199;
    String start = "jyvlqpwbifagxsuzkmtcn";
    String goal = "jxumqovdhfcgwrtyknsep";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case43() {
    int nextCost = 279;
    int prevCost = 449;
    String start = "sfugtrekbzaxypwijlhmcn";
    String goal = "retfsqdkbzavwouhjlgmcn";
    assertEquals(7184, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case44() {
    int nextCost = 80;
    int prevCost = 760;
    String start = "nywurdavxcfthkozbegilm";
    String goal = "nywspdatxcgqjkozbehilm";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case45() {
    int nextCost = 652;
    int prevCost = 855;
    String start = "umrzwesxjotcpqgkiynfla";
    String goal = "tvqkicabjesmopwlfxhdrz";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case46() {
    int nextCost = 36;
    int prevCost = 729;
    String start = "xfjkimhprtbcnudzywegsvq";
    String goal = "xfkljniprtacoudzywegsvq";
    assertEquals(945, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case47() {
    int nextCost = 96;
    int prevCost = 626;
    String start = "zdohrxqgklvutpsmayniefw";
    String goal = "zbohrxpgjkvutqslaynicfw";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case48() {
    int nextCost = 816;
    int prevCost = 305;
    String start = "pwolgbicnytfaumqzjrsvekd";
    String goal = "qxpmibjcoyugavnrzkstweld";
    assertEquals(14688, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case49() {
    int nextCost = 177;
    int prevCost = 675;
    String start = "altzrmbidjnkhevqofwsucxp";
    String goal = "aktzrlbheinjgdwqofxsucyp";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case50() {
    int nextCost = 607;
    int prevCost = 12;
    String start = "mgsdalrxqypiuvtzfocbkhnj";
    String goal = "uwxeqrpmcdslkbhayzgfjvot";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case51() {
    int nextCost = 87;
    int prevCost = 958;
    String start = "kmrjqsatfudhxognypcvbeiwl";
    String goal = "kmrjqtaufvdhyognzpcwbeixl";
    assertEquals(609, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case52() {
    int nextCost = 106;
    int prevCost = 886;
    String start = "qxmfedgojlurcwptyniakshvb";
    String goal = "qxmfedgojlvrcyptzniakshwb";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case53() {
    int nextCost = 845;
    int prevCost = 299;
    String start = "pavknqfozxmydglehirtjcuwsb";
    String goal = "pavknqfozxmydglehirtjcuwsb";
    assertEquals(0, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case54() {
    int nextCost = 899;
    int prevCost = 293;
    String start = "iqyopksawrhlxtceumdfgvnzbj";
    String goal = "iqyopksawrhlxtbeumdfgvnzcj";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case55() {
    int nextCost = 696;
    int prevCost = 39;
    String start = "qfhobpxvjntureigkzalscmdwy";
    String goal = "qmhxbpuljgkoreintvazscfdwy";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case56() {
    int nextCost = 12;
    int prevCost = 56;
    String start = "wvu";
    String goal = "xyz";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case57() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ab";
    String goal = "ba";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case58() {
    int nextCost = 10;
    int prevCost = 10;
    String start = "hm";
    String goal = "mh";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case59() {
    int nextCost = 1;
    int prevCost = 2;
    String start = "abc";
    String goal = "xyz";
    assertEquals(69, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case60() {
    int nextCost = 4;
    int prevCost = 2;
    String start = "abc";
    String goal = "abc";
    assertEquals(0, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case61() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ab";
    String goal = "de";
    assertEquals(6, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case62() {
    int nextCost = 1000;
    int prevCost = 1;
    String start = "aeiou";
    String goal = "bcjzv";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case63() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ab";
    String goal = "ac";
    assertEquals(1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case64() {
    int nextCost = 999;
    int prevCost = 998;
    String start = "abcdefghijklmnopqrstuvwxyz";
    String goal = "bcdefghijklmnopqrstuvwxyza";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case65() {
    int nextCost = 10;
    int prevCost = 10;
    String start = "ac";
    String goal = "eg";
    assertEquals(80, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case66() {
    int nextCost = 5;
    int prevCost = 10;
    String start = "bc";
    String goal = "da";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case67() {
    int nextCost = 5;
    int prevCost = 8;
    String start = "ab";
    String goal = "dc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case68() {
    int nextCost = 1000;
    int prevCost = 1000;
    String start = "zxcvbnmas";
    String goal = "xcvbnmasr";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case69() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ah";
    String goal = "ha";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case70() {
    int nextCost = 1000;
    int prevCost = 1;
    String start = "ab";
    String goal = "yz";
    assertEquals(48000, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case71() {
    int nextCost = 1000;
    int prevCost = 1000;
    String start = "zywx";
    String goal = "vust";
    assertEquals(16000, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case72() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ab";
    String goal = "dc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case73() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ba";
    String goal = "cd";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case74() {
    int nextCost = 3;
    int prevCost = 4;
    String start = "ab";
    String goal = "dc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case75() {
    int nextCost = 2;
    int prevCost = 2;
    String start = "ac";
    String goal = "cd";
    assertEquals(6, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case76() {
    int nextCost = 7;
    int prevCost = 15;
    String start = "ab";
    String goal = "dc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case77() {
    int nextCost = 123;
    int prevCost = 123;
    String start = "ab";
    String goal = "cf";
    assertEquals(738, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case78() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "sq";
    String goal = "qs";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case79() {
    int nextCost = 10;
    int prevCost = 100;
    String start = "db";
    String goal = "ac";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case80() {
    int nextCost = 5;
    int prevCost = 8;
    String start = "abc";
    String goal = "def";
    assertEquals(45, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case81() {
    int nextCost = 10;
    int prevCost = 12;
    String start = "ac";
    String goal = "ef";
    assertEquals(70, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case82() {
    int nextCost = 10;
    int prevCost = 5;
    String start = "ab";
    String goal = "dc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case83() {
    int nextCost = 2;
    int prevCost = 2;
    String start = "ba";
    String goal = "ca";
    assertEquals(2, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case84() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "zb";
    String goal = "ya";
    assertEquals(2, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case85() {
    int nextCost = 1000;
    int prevCost = 1000;
    String start = "abcdefghijklz";
    String goal = "mnopqrstuvwxy";
    assertEquals(145000, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case86() {
    int nextCost = 5;
    int prevCost = 10;
    String start = "ab";
    String goal = "zc";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case87() {
    int nextCost = 2;
    int prevCost = 3;
    String start = "ab";
    String goal = "zy";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case88() {
    int nextCost = 100;
    int prevCost = 250;
    String start = "cdef";
    String goal = "bacd";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case89() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "d";
    String goal = "e";
    assertEquals(1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case90() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "zy";
    String goal = "wx";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case91() {
    int nextCost = 5;
    int prevCost = 10;
    String start = "dc";
    String goal = "ac";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case92() {
    int nextCost = 1;
    int prevCost = 999;
    String start = "b";
    String goal = "a";
    assertEquals(999, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case93() {
    int nextCost = 1;
    int prevCost = 1;
    String start = "ac";
    String goal = "zb";
    assertEquals(-1, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

  @Test
  public void case94() {
    int nextCost = 25;
    int prevCost = 15;
    String start = "ac";
    String goal = "de";
    assertEquals(125, nextorprev.getMinimum(nextCost, prevCost, start, goal));
  }

}
