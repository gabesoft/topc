package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class BestApproximationDiv2Test {
  BestApproximationDiv2 bestapproximationdiv2 = new BestApproximationDiv2();

  @Test
  public void case1() {
    int maxDen = 42;
    String number = "0.141592658";
    assertEquals("1/7 has 3 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case2() {
    int maxDen = 3;
    String number = "0.1337";
    assertEquals("0/1 has 1 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case3() {
    int maxDen = 80000;
    String number = "0.1234567891011121314151617181920";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case4() {
    int maxDen = 1000;
    String number = "0.42";
    assertEquals("3/7 has 3 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case5() {
    int maxDen = 100;
    String number = "0.420";
    assertEquals("21/50 has 4 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case6() {
    int maxDen = 115;
    String number = "0.141592658";
    assertEquals("16/113 has 7 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case7() {
    int maxDen = 512;
    String number = "0.000000000000";
    assertEquals("0/1 has 13 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case8() {
    int maxDen = 1000;
    String number = "0.272727272727272727272727272727272727272727272727";
    assertEquals("3/11 has 49 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case9() {
    int maxDen = 100000;
    String number = "0.99979980180378574789041150739232438957325345";
    assertEquals("99881/99901 has 32 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case10() {
    int maxDen = 99999;
    String number = "0.00001";
    assertEquals("1/50001 has 6 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case11() {
    int maxDen = 100000;
    String number = "0.00001";
    assertEquals("1/50001 has 6 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case12() {
    int maxDen = 100000;
    String number = "0.999999999999";
    assertEquals("99999/100000 has 6 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case13() {
    int maxDen = 100000;
    String number = "0.000099999999999999999999999999999999999999999999";
    assertEquals("1/10001 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case14() {
    int maxDen = 100000;
    String number = "0.000009999999999999999999999999999999999999999999";
    assertEquals("0/1 has 6 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case15() {
    int maxDen = 9172;
    String number = "0.618927954312334";
    assertEquals("739/1194 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case16() {
    int maxDen = 13016;
    String number = "0.13893446066184";
    assertEquals("1609/11581 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case17() {
    int maxDen = 98926;
    String number = "0.165754120014607177";
    assertEquals("5873/35432 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case18() {
    int maxDen = 38912;
    String number = "0.6406189841439880877";
    assertEquals("8321/12989 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case19() {
    int maxDen = 35131;
    String number = "0.74380880681";
    assertEquals("19763/26570 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case20() {
    int maxDen = 17422;
    String number = "0.618211976295";
    assertEquals("7081/11454 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case21() {
    int maxDen = 58425;
    String number = "0.4912508393967997693576658254416163355328253";
    assertEquals("10977/22345 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case22() {
    int maxDen = 38467;
    String number = "0.75812574444429307787303825";
    assertEquals("27360/36089 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case23() {
    int maxDen = 57549;
    String number = "0.05310675004549564821683148492070607056";
    assertEquals("1847/34779 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case24() {
    int maxDen = 29588;
    String number = "0.11173004830129";
    assertEquals("1043/9335 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case25() {
    int maxDen = 96723;
    String number = "0.0356667677191627276513995926532444279237";
    assertEquals("1528/42841 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case26() {
    int maxDen = 75536;
    String number = "0.65281031552217482363035280722591085079053";
    assertEquals("33717/51649 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case27() {
    int maxDen = 43779;
    String number = "0.32412908745";
    assertEquals("7583/23395 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case28() {
    int maxDen = 89529;
    String number = "0.481435526892959";
    assertEquals("30653/63670 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case29() {
    int maxDen = 8171;
    String number = "0.9182801848609300876356583948397";
    assertEquals("3225/3512 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case30() {
    int maxDen = 48997;
    String number = "0.566144626825510151760";
    assertEquals("22485/39716 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case31() {
    int maxDen = 25785;
    String number = "0.39219823402319898913514253892870148193597980";
    assertEquals("6505/16586 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case32() {
    int maxDen = 24510;
    String number = "0.81033848015413735856908936069789415666667";
    assertEquals("4405/5436 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case33() {
    int maxDen = 55122;
    String number = "0.603624588121";
    assertEquals("10625/17602 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case34() {
    int maxDen = 27491;
    String number = "0.20892820552767878160958900072552148646";
    assertEquals("4039/19332 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case35() {
    int maxDen = 80251;
    String number = "0.64419557473408815232466629049311995556059";
    assertEquals("11792/18305 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case36() {
    int maxDen = 70197;
    String number = "0.4212779554034122982278583944";
    assertEquals("6593/15650 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case37() {
    int maxDen = 19371;
    String number = "0.4679347881638";
    assertEquals("861/1840 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case38() {
    int maxDen = 55854;
    String number = "0.2012770241037395972028670818303620284183";
    assertEquals("7597/37744 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case39() {
    int maxDen = 79772;
    String number = "0.972282944827258473";
    assertEquals("23573/24245 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case40() {
    int maxDen = 76080;
    String number = "0.0407590512098917330";
    assertEquals("2193/53804 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case41() {
    int maxDen = 87842;
    String number = "0.62214326054";
    assertEquals("7704/12383 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case42() {
    int maxDen = 52802;
    String number = "0.8639453823948513281646779641926315970261762";
    assertEquals("29991/34714 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case43() {
    int maxDen = 80980;
    String number = "0.0117591817";
    assertEquals("576/48983 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case44() {
    int maxDen = 19897;
    String number = "0.5649843253832706801195363153403179035291261701";
    assertEquals("5586/9887 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case45() {
    int maxDen = 47434;
    String number = "0.8780956900135580177467074121835714";
    assertEquals("36981/42115 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case46() {
    int maxDen = 47730;
    String number = "0.126633008138";
    assertEquals("2433/19213 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case47() {
    int maxDen = 27110;
    String number = "0.5206728006";
    assertEquals("5541/10642 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case48() {
    int maxDen = 17827;
    String number = "0.8887400599530995111233972330484392490574";
    assertEquals("10616/11945 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case49() {
    int maxDen = 7402;
    String number = "0.1577941785788";
    assertEquals("578/3663 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case50() {
    int maxDen = 8517;
    String number = "0.92842758409443584103340675";
    assertEquals("5993/6455 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case51() {
    int maxDen = 48298;
    String number = "0.37658789771650132605744906119042197093331356959";
    assertEquals("2757/7321 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case52() {
    int maxDen = 32413;
    String number = "0.025607209543256088157579";
    assertEquals("233/9099 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case53() {
    int maxDen = 68919;
    String number = "0.21335290485733030321108187289230282558124988271";
    assertEquals("9884/46327 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case54() {
    int maxDen = 98584;
    String number = "0.7198832933283402012";
    assertEquals("33309/46270 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case55() {
    int maxDen = 99238;
    String number = "0.929130819202475810071693037304323";
    assertEquals("40931/44053 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case56() {
    int maxDen = 93370;
    String number = "0.794980018508928085147361680865710283556";
    assertEquals("17705/22271 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case57() {
    int maxDen = 15278;
    String number = "0.14145763463";
    assertEquals("1314/9289 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case58() {
    int maxDen = 81395;
    String number = "0.6200651619735006518272452258698";
    assertEquals("21125/34069 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case59() {
    int maxDen = 25240;
    String number = "0.7852729763159895495252230872837541829689";
    assertEquals("6228/7931 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case60() {
    int maxDen = 69275;
    String number = "0.4352915567902319878";
    assertEquals("17998/41347 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case61() {
    int maxDen = 98617;
    String number = "0.0286814764987386280980";
    assertEquals("2018/70359 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case62() {
    int maxDen = 98083;
    String number = "0.201038733145612191804774119810";
    assertEquals("14206/70663 has 12 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case63() {
    int maxDen = 57270;
    String number = "0.32978011";
    assertEquals("6404/19419 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case64() {
    int maxDen = 24763;
    String number = "0.3091876840379622730730736467401244";
    assertEquals("1336/4321 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case65() {
    int maxDen = 4907;
    String number = "0.0395711003318866479448557569568547357671687";
    assertEquals("155/3917 has 44 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case66() {
    int maxDen = 41477;
    String number = "0.97424025591379745769845946628504082835";
    assertEquals("11573/11879 has 39 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case67() {
    int maxDen = 11910;
    String number = "0.6210866057019903";
    assertEquals("5773/9295 has 17 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case68() {
    int maxDen = 27441;
    String number = "0.6524317912218268";
    assertEquals("550/843 has 17 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case69() {
    int maxDen = 44336;
    String number = "0.96422494125273478648407";
    assertEquals("23799/24682 has 24 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case70() {
    int maxDen = 57214;
    String number = "0.894353369763205828";
    assertEquals("491/549 has 19 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case71() {
    int maxDen = 33476;
    String number = "0.21199119911991199119911991199119";
    assertEquals("1927/9090 has 33 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case72() {
    int maxDen = 79581;
    String number = "0.9109475267087478799111748352013428686331765";
    assertEquals("52098/57191 has 44 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case73() {
    int maxDen = 73372;
    String number = "0.2176248108925869894";
    assertEquals("2877/13220 has 20 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case74() {
    int maxDen = 53660;
    String number = "0.62094155844155844155844155844155";
    assertEquals("765/1232 has 33 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case75() {
    int maxDen = 21494;
    String number = "0.686157117278424350940017905";
    assertEquals("12263/17872 has 28 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case76() {
    int maxDen = 87056;
    String number = "0.47009345794392";
    assertEquals("503/1070 has 15 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case77() {
    int maxDen = 74811;
    String number = "0.3210181580848931260343581";
    assertEquals("13772/42901 has 26 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case78() {
    int maxDen = 44372;
    String number = "0.5918419052444894";
    assertEquals("2336/3947 has 17 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case79() {
    int maxDen = 3415;
    String number = "0.1873767258382642998027613412228796844181459";
    assertEquals("95/507 has 44 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case80() {
    int maxDen = 94278;
    String number = "0.33965632";
    assertEquals("1522/4481 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case81() {
    int maxDen = 59923;
    String number = "0.13319661071833342328242214906";
    assertEquals("2468/18529 has 30 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case82() {
    int maxDen = 34618;
    String number = "0.936594202898550724637681";
    assertEquals("517/552 has 25 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case83() {
    int maxDen = 82162;
    String number = "0.567176560374290738958755";
    assertEquals("17093/30137 has 25 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case84() {
    int maxDen = 63217;
    String number = "0.2695081967213";
    assertEquals("411/1525 has 14 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case85() {
    int maxDen = 24689;
    String number = "0.5195467183418";
    assertEquals("12333/23738 has 14 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case86() {
    int maxDen = 79173;
    String number = "0.98250056342882899603611247365141652636184062255";
    assertEquals("74111/75431 has 48 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case87() {
    int maxDen = 70587;
    String number = "0.59505530253741054001301236174365647364996";
    assertEquals("4573/7685 has 42 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case88() {
    int maxDen = 13180;
    String number = "0.73997821350762527233115468409586056";
    assertEquals("6793/9180 has 36 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case89() {
    int maxDen = 36081;
    String number = "0.0752759675488761803431";
    assertEquals("566/7519 has 23 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case90() {
    int maxDen = 50188;
    String number = "0.7273240105697";
    assertEquals("24497/33681 has 14 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case91() {
    int maxDen = 27875;
    String number = "0.798645013450234133705290425425924080";
    assertEquals("8016/10037 has 37 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case92() {
    int maxDen = 65469;
    String number = "0.704744525547445255474452554744525547445";
    assertEquals("1931/2740 has 40 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case93() {
    int maxDen = 12099;
    String number = "0.3366159355416293643688451208594449";
    assertEquals("376/1117 has 35 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case94() {
    int maxDen = 27810;
    String number = "0.8070713809206137424949966644429619746497665110";
    assertEquals("6049/7495 has 47 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case95() {
    int maxDen = 55554;
    String number = "0.398797734459154244414329";
    assertEquals("11477/28779 has 25 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case96() {
    int maxDen = 76250;
    String number = "0.900650075";
    assertEquals("13716/15229 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case97() {
    int maxDen = 6732;
    String number = "0.705340699815837937384898710865561694290";
    assertEquals("383/543 has 40 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case98() {
    int maxDen = 51863;
    String number = "0.259480696";
    assertEquals("1519/5854 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case99() {
    int maxDen = 37241;
    String number = "0.13618587531631009";
    assertEquals("592/4347 has 18 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case100() {
    int maxDen = 68961;
    String number = "0.5211327272134780200084726431";
    assertEquals("15992/30687 has 29 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case101() {
    int maxDen = 90254;
    String number = "0.318529141071466792";
    assertEquals("14882/46721 has 19 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case102() {
    int maxDen = 80270;
    String number = "0.4997191565588329057428688537033382417682510";
    assertEquals("32918/65873 has 44 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case103() {
    int maxDen = 24828;
    String number = "0.65424979817783415984";
    assertEquals("5673/8671 has 21 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case104() {
    int maxDen = 90368;
    String number = "0.77611137172659289";
    assertEquals("56251/72478 has 18 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case105() {
    int maxDen = 99977;
    String number = "0.00058286134235501324108919045627906387400058";
    assertEquals("46/78921 has 45 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case106() {
    int maxDen = 78041;
    String number = "0.58433079434167573449401523394994";
    assertEquals("537/919 has 33 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case107() {
    int maxDen = 52549;
    String number = "0.82138526826311003334";
    assertEquals("10839/13196 has 21 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case108() {
    int maxDen = 8726;
    String number = "0.10144927536231884057971014492";
    assertEquals("7/69 has 30 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case109() {
    int maxDen = 55255;
    String number = "0.0355531971345184399044839479";
    assertEquals("134/3769 has 29 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case110() {
    int maxDen = 87473;
    String number = "0.4873304782298358315488936473";
    assertEquals("2731/5604 has 29 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case111() {
    int maxDen = 81767;
    String number = "0.30067047016199558572439928372";
    assertEquals("7220/24013 has 30 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case112() {
    int maxDen = 27640;
    String number = "0.427052785923753665689149560117302052785923";
    assertEquals("1165/2728 has 43 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case113() {
    int maxDen = 87295;
    String number = "0.9467016605259173270075203149447332559430676828";
    assertEquals("18757/19813 has 47 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case114() {
    int maxDen = 48498;
    String number = "0.32833353017597731372741";
    assertEquals("2780/8467 has 17 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case115() {
    int maxDen = 44559;
    String number = "0.19457615637700793497193728436810528353009483259";
    assertEquals("8043/41336 has 26 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case116() {
    int maxDen = 12575;
    String number = "0.46418402205844323765192655805534005689164";
    assertEquals("1957/4216 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case117() {
    int maxDen = 81449;
    String number = "0.30790927253496298037372194137373369373";
    assertEquals("2620/8509 has 28 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case118() {
    int maxDen = 4675;
    String number = "0.182266009852216748768472906403940886699507379";
    assertEquals("37/203 has 44 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case119() {
    int maxDen = 71759;
    String number = "0.570346996695";
    assertEquals("27647/48474 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case120() {
    int maxDen = 36635;
    String number = "0.646241124";
    assertEquals("17201/26617 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case121() {
    int maxDen = 93850;
    String number = "0.0457983771145647091184146237106312749277";
    assertEquals("333/7271 has 24 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case122() {
    int maxDen = 88064;
    String number = "0.841890367989215672566734500771";
    assertEquals("64951/77149 has 18 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case123() {
    int maxDen = 53299;
    String number = "0.223230876432331990328";
    assertEquals("11533/51664 has 18 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case124() {
    int maxDen = 42727;
    String number = "0.4131731821";
    assertEquals("5263/12738 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case125() {
    int maxDen = 84127;
    String number = "0.040621714962";
    assertEquals("541/13318 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case126() {
    int maxDen = 29247;
    String number = "0.330873644893867998815705566183838935957";
    assertEquals("3632/10977 has 15 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case127() {
    int maxDen = 54200;
    String number = "0.638610885171694309853139654135870";
    assertEquals("18058/28277 has 20 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case128() {
    int maxDen = 80581;
    String number = "0.5212874312487268282735976777347728661641882";
    assertEquals("2559/4909 has 21 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case129() {
    int maxDen = 2758;
    String number = "0.792682926829268292682926829268292672";
    assertEquals("65/82 has 35 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case130() {
    int maxDen = 65085;
    String number = "0.800731780299764919996966709638280";
    assertEquals("45082/56301 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case131() {
    int maxDen = 12588;
    String number = "0.473855030652722683014785430941208896501";
    assertEquals("1314/2773 has 32 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case132() {
    int maxDen = 45023;
    String number = "0.341266512895785279932899969031243447263577269";
    assertEquals("3255/9538 has 26 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case133() {
    int maxDen = 43846;
    String number = "0.410276438760452533202164289227742252";
    assertEquals("12081/29446 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case134() {
    int maxDen = 67667;
    String number = "0.587024377166274104287547155358855209590011";
    assertEquals("30655/52221 has 31 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case135() {
    int maxDen = 89397;
    String number = "0.628603032077558722102834478495";
    assertEquals("9661/15369 has 22 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case136() {
    int maxDen = 87516;
    String number = "0.448562084533077387935018307205473922007749457";
    assertEquals("25237/56262 has 31 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case137() {
    int maxDen = 7378;
    String number = "0.819248826291069812206";
    assertEquals("349/426 has 14 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case138() {
    int maxDen = 21726;
    String number = "0.2888446215039442231075697";
    assertEquals("145/502 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case139() {
    int maxDen = 52943;
    String number = "0.9705317114420243433696348494554772581";
    assertEquals("1515/1561 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case140() {
    int maxDen = 87474;
    String number = "0.61636409480584972264246081780131114";
    assertEquals("4889/7932 has 25 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case141() {
    int maxDen = 7312;
    String number = "0.35064578180818906292937610225336630942";
    assertEquals("1276/3639 has 25 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case142() {
    int maxDen = 13885;
    String number = "0.7087496438021";
    assertEquals("7590/10709 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case143() {
    int maxDen = 63781;
    String number = "0.092734733756717147044455300";
    assertEquals("1921/20715 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case144() {
    int maxDen = 81871;
    String number = "0.594873150105708245233";
    assertEquals("2251/3784 has 20 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case145() {
    int maxDen = 3102;
    String number = "0.7668918918908";
    assertEquals("227/296 has 12 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case146() {
    int maxDen = 26880;
    String number = "0.6339525000520878548485111554822467228";
    assertEquals("6621/10444 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case147() {
    int maxDen = 94216;
    String number = "0.3979401507393479847538723542291";
    assertEquals("4907/12331 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case148() {
    int maxDen = 44801;
    String number = "0.45505778966472432449135543031808195";
    assertEquals("4764/10469 has 16 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case149() {
    int maxDen = 48301;
    String number = "0.885265903736115775930663076405250";
    assertEquals("21041/23768 has 17 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case150() {
    int maxDen = 44169;
    String number = "0.949226755";
    assertEquals("10189/10734 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case151() {
    int maxDen = 31197;
    String number = "0.9353734217847206";
    assertEquals("4371/4673 has 16 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case152() {
    int maxDen = 69996;
    String number = "0.91565106743955888590404251378481549554644422";
    assertEquals("32382/35365 has 22 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case153() {
    int maxDen = 85587;
    String number = "0.20299298519085869056897895";
    assertEquals("6511/32075 has 13 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case154() {
    int maxDen = 4029;
    String number = "0.59782607695652173913043";
    assertEquals("55/92 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case155() {
    int maxDen = 3440;
    String number = "0.575727676269018253576714356191415885545140601";
    assertEquals("1167/2027 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case156() {
    int maxDen = 31867;
    String number = "0.94760857842120545898531";
    assertEquals("22844/24107 has 20 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case157() {
    int maxDen = 41800;
    String number = "0.92095996718060920994153";
    assertEquals("26939/29251 has 23 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case158() {
    int maxDen = 10960;
    String number = "0.6936538056082648113007644317942230655703141471";
    assertEquals("3290/4743 has 22 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case159() {
    int maxDen = 94241;
    String number = "0.42815716437043398075";
    assertEquals("34402/80349 has 18 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case160() {
    int maxDen = 31956;
    String number = "0.1376730165619154508043396932285821";
    assertEquals("3183/23120 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case161() {
    int maxDen = 71539;
    String number = "0.960522386886894752557715577884";
    assertEquals("61119/63631 has 27 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case162() {
    int maxDen = 25651;
    String number = "0.4440343262971";
    assertEquals("4812/10837 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case163() {
    int maxDen = 60924;
    String number = "0.4876482624390730780344850531499010197461447607";
    assertEquals("29314/60113 has 18 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case164() {
    int maxDen = 100;
    String number = "0.909";
    assertEquals("10/11 has 4 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case165() {
    int maxDen = 99991;
    String number = "0.999979998599901993139519766383646855279869590871";
    assertEquals("49995/49996 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case166() {
    int maxDen = 100000;
    String number = "0.314159265358979323846264338327950288419716939937";
    assertEquals("71/226 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case167() {
    int maxDen = 45234;
    String number = "0.2341235423123234234";
    assertEquals("4859/20754 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case168() {
    int maxDen = 97567;
    String number = "0.6876098797632487238476328437629876";
    assertEquals("23858/34697 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case169() {
    int maxDen = 99999;
    String number = "0.599067439767013706591197847890228232979542625952";
    assertEquals("17473/29167 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case170() {
    int maxDen = 100000;
    String number = "0.4200";
    assertEquals("21/50 has 5 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case171() {
    int maxDen = 100000;
    String number = "0.0000000083458734652746";
    assertEquals("0/1 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case172() {
    int maxDen = 10000;
    String number = "0.98493849148959862134119850850968234150985123095";
    assertEquals("4643/4714 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case173() {
    int maxDen = 100000;
    String number = "0.43489090314967484371609146097601981960471390493";
    assertEquals("4365/10037 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case174() {
    int maxDen = 100000;
    String number = "0.141592658";
    assertEquals("4783/33780 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case175() {
    int maxDen = 99999;
    String number = "0.1234567899998777776666666666";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case176() {
    int maxDen = 98;
    String number = "0.1337";
    assertEquals("2/15 has 4 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case177() {
    int maxDen = 7;
    String number = "0.141592658";
    assertEquals("1/7 has 3 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case178() {
    int maxDen = 100000;
    String number = "0.448305799387298197748392834724989823468";
    assertEquals("18073/40314 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case179() {
    int maxDen = 100000;
    String number = "0.123456789";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case180() {
    int maxDen = 100000;
    String number = "0.141592658979323846264338326950288419716931418591";
    assertEquals("4783/33780 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case181() {
    int maxDen = 100;
    String number = "0.0000000067860687";
    assertEquals("0/1 has 9 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case182() {
    int maxDen = 89329;
    String number = "0.10290340007656086753";
    assertEquals("6089/59172 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case183() {
    int maxDen = 97567;
    String number = "0.68760987976324872398757832998476328437629876";
    assertEquals("23858/34697 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case184() {
    int maxDen = 100000;
    String number = "0.222222222222222222222222222222222222222222222222";
    assertEquals("2/9 has 49 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case185() {
    int maxDen = 100000;
    String number = "0.123456789123456789123456789123456789";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case186() {
    int maxDen = 100000;
    String number = "0.123213213213123123345435354";
    assertEquals("4103/33300 has 13 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case187() {
    int maxDen = 100000;
    String number = "0.4567876545678765456787652345687906758495";
    assertEquals("13705/30003 has 25 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case188() {
    int maxDen = 20;
    String number = "0.333333333333333333333333333333333333333333333333";
    assertEquals("1/3 has 49 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case189() {
    int maxDen = 100000;
    String number = "0.254654864646546784321346546546546456";
    assertEquals("21117/82924 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case190() {
    int maxDen = 99999;
    String number = "0.45689894566568897312323156448897897895";
    assertEquals("6583/14408 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case191() {
    int maxDen = 100000;
    String number = "0.12345678910111213134343434151617181920";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case192() {
    int maxDen = 99999;
    String number = "0.123637461672645389056432785432123456783929239596";
    assertEquals("12284/99355 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case193() {
    int maxDen = 100000;
    String number = "0.197367625619736762561973676256197367625677";
    assertEquals("9792/49613 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case194() {
    int maxDen = 100000;
    String number = "0.000000000000000000000000000000000000000000000001";
    assertEquals("0/1 has 48 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case195() {
    int maxDen = 100000;
    String number = "0.032794242021506118715156117852149748865146624782";
    assertEquals("1900/57937 has 49 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case196() {
    int maxDen = 100000;
    String number = "0.948576017495810295639485064104982057391749059938";
    assertEquals("33074/34867 has 11 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case197() {
    int maxDen = 100;
    String number = "0.0";
    assertEquals("0/1 has 2 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case198() {
    int maxDen = 100000;
    String number = "0.1234567891234567899876543223456789765213567";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case199() {
    int maxDen = 100000;
    String number = "0.784829027240752875472985719875981759187985719869";
    assertEquals("5256/6697 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case200() {
    int maxDen = 100000;
    String number = "0.618726487192648172648716348971648761284361183643";
    assertEquals("22203/35885 has 10 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case201() {
    int maxDen = 99999;
    String number = "0.123456789012345678901234567890123456000";
    assertEquals("10/81 has 8 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case202() {
    int maxDen = 100000;
    String number = "0.123451234512345123451234512345123451234512345123";
    assertEquals("4115/33333 has 49 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case203() {
    int maxDen = 99999;
    String number = "0.98765987659876598765987659876599";
    assertEquals("98765/99999 has 32 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

  @Test
  public void case204() {
    int maxDen = 100000;
    String number = "0.999999999999999999999999999999999999999999999999";
    assertEquals("99999/100000 has 6 exact digits", bestapproximationdiv2.findFraction(maxDen, number));
  }

}
