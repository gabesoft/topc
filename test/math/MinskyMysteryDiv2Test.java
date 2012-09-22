package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MinskyMysteryDiv2Test {
  MinskyMysteryDiv2 minskymysterydiv2 = new MinskyMysteryDiv2();

  @Test
  public void case1() {
    long N = 2L;
    assertEquals(3L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case2() {
    long N = 3L;
    assertEquals(4L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case3() {
    long N = 4L;
    assertEquals(4L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case4() {
    long N = 15L;
    assertEquals(8L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case5() {
    long N = 0L;
    assertEquals(-1L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case6() {
    long N = 1L;
    assertEquals(-1L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case7() {
    long N = 5L;
    assertEquals(6L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case8() {
    long N = 6L;
    assertEquals(5L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case9() {
    long N = 7L;
    assertEquals(8L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case10() {
    long N = 8L;
    assertEquals(6L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case11() {
    long N = 9L;
    assertEquals(6L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case12() {
    long N = 10L;
    assertEquals(7L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case13() {
    long N = 11L;
    assertEquals(12L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case14() {
    long N = 12L;
    assertEquals(8L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case15() {
    long N = 13L;
    assertEquals(14L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case16() {
    long N = 14L;
    assertEquals(9L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case17() {
    long N = 15L;
    assertEquals(8L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case18() {
    long N = 16L;
    assertEquals(10L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case19() {
    long N = 17L;
    assertEquals(18L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case20() {
    long N = 18L;
    assertEquals(11L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case21() {
    long N = 19L;
    assertEquals(20L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case22() {
    long N = 20L;
    assertEquals(12L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case23() {
    long N = 21L;
    assertEquals(10L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case24() {
    long N = 22L;
    assertEquals(13L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case25() {
    long N = 23L;
    assertEquals(24L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case26() {
    long N = 24L;
    assertEquals(14L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case27() {
    long N = 25L;
    assertEquals(10L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case28() {
    long N = 26L;
    assertEquals(15L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case29() {
    long N = 27L;
    assertEquals(12L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case30() {
    long N = 28L;
    assertEquals(16L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case31() {
    long N = 29L;
    assertEquals(30L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case32() {
    long N = 30L;
    assertEquals(17L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case33() {
    long N = 999999974243L;
    assertEquals(10972236L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case34() {
    long N = 999966000289L;
    assertEquals(1999966L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case35() {
    long N = 999932000987L;
    assertEquals(1999932L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case36() {
    long N = 549697684831L;
    assertEquals(1482832L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case37() {
    long N = 999992456923L;
    assertEquals(2090164L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case38() {
    long N = 999985999949L;
    assertEquals(1999986L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case39() {
    long N = 999663912463L;
    assertEquals(999663912464L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case40() {
    long N = 549755813888L;
    assertEquals(274877906946L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case41() {
    long N = 998295347921L;
    assertEquals(100170030L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case42() {
    long N = 990728680597L;
    assertEquals(99410858L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case43() {
    long N = 991325085943L;
    assertEquals(99470696L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case44() {
    long N = 990132634063L;
    assertEquals(99351056L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case45() {
    long N = 23899065817L;
    assertEquals(2172642358L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case46() {
    long N = 501286585121L;
    assertEquals(71612369310L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case47() {
    long N = 79418294653L;
    assertEquals(79418294654L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case48() {
    long N = 857742881383L;
    assertEquals(5680416584L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case49() {
    long N = 847288609443L;
    assertEquals(282429536484L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case50() {
    long N = 961346991611L;
    assertEquals(961346991612L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case51() {
    long N = 289721913119L;
    assertEquals(289721913120L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case52() {
    long N = 1000000000000L;
    assertEquals(500000000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case53() {
    long N = 56604L;
    assertEquals(28304L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case54() {
    long N = 639L;
    assertEquals(216L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case55() {
    long N = 940489420L;
    assertEquals(470244712L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case56() {
    long N = 181681L;
    assertEquals(1970L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case57() {
    long N = 2509315L;
    assertEquals(501868L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case58() {
    long N = 61008809L;
    assertEquals(859350L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case59() {
    long N = 307882L;
    assertEquals(153943L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case60() {
    long N = 9657166375L;
    assertEquals(1931433280L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case61() {
    long N = 632511669L;
    assertEquals(210837226L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case62() {
    long N = 1140L;
    assertEquals(572L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case63() {
    long N = 473785794118L;
    assertEquals(236892897061L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case64() {
    long N = 85426L;
    assertEquals(42715L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case65() {
    long N = 823L;
    assertEquals(824L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case66() {
    long N = 9691L;
    assertEquals(892L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case67() {
    long N = 32677176439L;
    assertEquals(32677176440L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case68() {
    long N = 66634240L;
    assertEquals(33317122L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case69() {
    long N = 8742164973L;
    assertEquals(2914054994L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case70() {
    long N = 7740L;
    assertEquals(3872L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case71() {
    long N = 35679235033L;
    assertEquals(2744556554L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case72() {
    long N = 912L;
    assertEquals(458L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case73() {
    long N = 62058L;
    assertEquals(31031L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case74() {
    long N = 68313523682L;
    assertEquals(34156761843L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case75() {
    long N = 167483122L;
    assertEquals(83741563L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case76() {
    long N = 73316810814L;
    assertEquals(36658405409L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case77() {
    long N = 25780653L;
    assertEquals(8593554L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case78() {
    long N = 50123L;
    assertEquals(50124L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case79() {
    long N = 95066L;
    assertEquals(47535L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case80() {
    long N = 1141118L;
    assertEquals(570561L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case81() {
    long N = 641536L;
    assertEquals(320770L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case82() {
    long N = 1303791137L;
    assertEquals(118526478L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case83() {
    long N = 934L;
    assertEquals(469L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case84() {
    long N = 3979L;
    assertEquals(196L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case85() {
    long N = 8544095L;
    assertEquals(1708824L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case86() {
    long N = 1716L;
    assertEquals(860L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case87() {
    long N = 708L;
    assertEquals(356L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case88() {
    long N = 37222940L;
    assertEquals(18611472L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case89() {
    long N = 255270L;
    assertEquals(127637L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case90() {
    long N = 194934L;
    assertEquals(97469L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case91() {
    long N = 35020L;
    assertEquals(17512L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case92() {
    long N = 4921L;
    assertEquals(710L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case93() {
    long N = 22198161106L;
    assertEquals(11099080555L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case94() {
    long N = 793869339907L;
    assertEquals(113409905708L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case95() {
    long N = 455750691863L;
    assertEquals(455750691864L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case96() {
    long N = 88458156143L;
    assertEquals(12636879456L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case97() {
    long N = 743531953133L;
    assertEquals(10185369294L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case98() {
    long N = 67336661975L;
    assertEquals(13467332400L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case99() {
    long N = 55858966335L;
    assertEquals(18619655448L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case100() {
    long N = 462398666113L;
    assertEquals(20104289854L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case101() {
    long N = 414917635852L;
    assertEquals(207458817928L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case102() {
    long N = 80399258354L;
    assertEquals(40199629179L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case103() {
    long N = 804762276120L;
    assertEquals(402381138062L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case104() {
    long N = 41071462606L;
    assertEquals(20535731305L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case105() {
    long N = 411282164164L;
    assertEquals(205641082084L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case106() {
    long N = 80052724013L;
    assertEquals(80052724014L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case107() {
    long N = 657164428388L;
    assertEquals(328582214196L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case108() {
    long N = 253690000746L;
    assertEquals(126845000375L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case109() {
    long N = 63345060786L;
    assertEquals(31672530395L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case110() {
    long N = 86775214293L;
    assertEquals(28925071434L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case111() {
    long N = 703837870306L;
    assertEquals(351918935155L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case112() {
    long N = 86567864778L;
    assertEquals(43283932391L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case113() {
    long N = 84631031817L;
    assertEquals(28210343942L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case114() {
    long N = 636455831109L;
    assertEquals(212151943706L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case115() {
    long N = 132336486706L;
    assertEquals(66168243355L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case116() {
    long N = 72724370282L;
    assertEquals(36362185143L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case117() {
    long N = 661765556521L;
    assertEquals(22819501978L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case118() {
    long N = 475808264703L;
    assertEquals(158602754904L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case119() {
    long N = 45572770802L;
    assertEquals(22786385403L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case120() {
    long N = 257935587385L;
    assertEquals(51587117482L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case121() {
    long N = 29460618561L;
    assertEquals(9820206190L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case122() {
    long N = 866070866297L;
    assertEquals(123724409478L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case123() {
    long N = 47539168631L;
    assertEquals(1011471720L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case124() {
    long N = 33346970931L;
    assertEquals(11115656980L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case125() {
    long N = 234250059026L;
    assertEquals(117125029515L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case126() {
    long N = 456203051683L;
    assertEquals(350118764L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case127() {
    long N = 655050458446L;
    assertEquals(327525229225L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case128() {
    long N = 154332755733L;
    assertEquals(51444251914L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case129() {
    long N = 97860137303L;
    assertEquals(1378311864L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case130() {
    long N = 948237557684L;
    assertEquals(474118778844L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case131() {
    long N = 72541902122L;
    assertEquals(36270951063L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case132() {
    long N = 375775526335L;
    assertEquals(75155105272L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case133() {
    long N = 1000000007L;
    assertEquals(1000000008L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case134() {
    long N = 92225672626L;
    assertEquals(46112836315L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case135() {
    long N = 1500450271L;
    assertEquals(1500450272L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case136() {
    long N = 999999999991L;
    assertEquals(1321004720L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case137() {
    long N = 1234567891L;
    assertEquals(1234567892L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case138() {
    long N = 999999999901L;
    assertEquals(142857142850L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case139() {
    long N = 99987898781L;
    assertEquals(4347299970L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case140() {
    long N = 999999999999L;
    assertEquals(333333333336L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case141() {
    long N = 100000000000L;
    assertEquals(50000000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case142() {
    long N = 999999999989L;
    assertEquals(999999999990L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case143() {
    long N = 2147483647L;
    assertEquals(2147483648L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case144() {
    long N = 111111378917L;
    assertEquals(15873054138L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case145() {
    long N = 999999898799L;
    assertEquals(90909081720L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case146() {
    long N = 982451653L;
    assertEquals(982451654L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case147() {
    long N = 1000000000L;
    assertEquals(500000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case148() {
    long N = 25459215277L;
    assertEquals(25459215278L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case149() {
    long N = 10000000001L;
    assertEquals(99010002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case150() {
    long N = 999999999959L;
    assertEquals(999999999960L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case151() {
    long N = 10000000000L;
    assertEquals(5000000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case152() {
    long N = 24000000000L;
    assertEquals(12000000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case153() {
    long N = 100000000003L;
    assertEquals(100000000004L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case154() {
    long N = 5463458053L;
    assertEquals(5463458054L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case155() {
    long N = 99999999998L;
    assertEquals(50000000001L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case156() {
    long N = 4564841564L;
    assertEquals(2282420784L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case157() {
    long N = 99999999977L;
    assertEquals(99999999978L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case158() {
    long N = 45810138910L;
    assertEquals(22905069457L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case159() {
    long N = 2000000000L;
    assertEquals(1000000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case160() {
    long N = 99999999999L;
    assertEquals(33333333336L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case161() {
    long N = 1002000001L;
    assertEquals(1002000002L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case162() {
    long N = 999999999990L;
    assertEquals(499999999997L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case163() {
    long N = 92937447289L;
    assertEquals(1575211030L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case164() {
    long N = 32416190071L;
    assertEquals(32416190072L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case165() {
    long N = 464112462563L;
    assertEquals(1362516L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case166() {
    long N = 824633720831L;
    assertEquals(824633720832L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case167() {
    long N = 999781420691L;
    assertEquals(999781420692L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case168() {
    long N = 53L;
    assertEquals(54L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case169() {
    long N = 999999999937L;
    assertEquals(999999999938L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case170() {
    long N = 1000003L;
    assertEquals(1000004L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case171() {
    long N = 199999999L;
    assertEquals(2247280L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case172() {
    long N = 10000000033L;
    assertEquals(10000000034L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case173() {
    long N = 763L;
    assertEquals(116L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case174() {
    long N = 9234511L;
    assertEquals(839512L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case175() {
    long N = 94143178827L;
    assertEquals(31381059612L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case176() {
    long N = 200560490131L;
    assertEquals(200560490132L, minskymysterydiv2.computeAnswer(N));
  }

  @Test
  public void case177() {
    long N = 7000105037L;
    assertEquals(7000105038L, minskymysterydiv2.computeAnswer(N));
  }

}
