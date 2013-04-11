package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class GreedyGovernmentTest {
  double DELTA = 1.0e-09;
  GreedyGovernment greedygovernment = new GreedyGovernment();

  @Test
  public void case1() {
    String[] tolls = { "X324", "XXX2", "12X5", "991X" };
    int tollHike = 9;
    assertEquals(10.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 10.0);
  }

  @Test
  public void case2() {
    String[] tolls = { "X324", "5X22", "12X5", "991X" };
    int tollHike = 57;
    assertEquals(29.2, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 29.2);
  }

  @Test
  public void case3() {
    String[] tolls = { "X11", "2X1", "37X" };
    int tollHike = 76;
    assertEquals(39.5, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 39.5);
  }

  @Test
  public void case4() {
    String[] tolls = { "X32X", "XXXX", "XXXX", "XXXX" };
    int tollHike = 99;
    assertEquals(0.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA);
  }

  @Test
  public void case5() {
    String[] tolls = { "X561324534", "1X82346123", "98X1641451", "982X412355", "9812X31235", "82359X8371", "283659X112", "9832465X12", "98246892X1", "982468926X" };
    int tollHike = 17;
    assertEquals(33.75003877701846, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 33.75003877701846);
  }

  @Test
  public void case6() {
    String[] tolls = { "X9791", "5X5X4", "84X95", "554X3", "9215X" };
    int tollHike = 29;
    assertEquals(28.307692307692307, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 28.307692307692307);
  }

  @Test
  public void case7() {
    String[] tolls = { "XX49", "9X99", "47X6", "511X" };
    int tollHike = 77;
    assertEquals(64.33333333333333, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 64.33333333333333);
  }

  @Test
  public void case8() {
    String[] tolls = { "X45864X71", "4X9916233", "58X357392", "351X3X613", "1687XX235", "16495X195", "737387XX2", "285516XX8", "22978484X" };
    int tollHike = 68;
    assertEquals(48.42628722311867, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 48.42628722311867);
  }

  @Test
  public void case9() {
    String[] tolls = { "XX745", "3X373", "X9X23", "154X4", "7349X" };
    int tollHike = 76;
    assertEquals(48.81818181818182, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 48.81818181818182);
  }

  @Test
  public void case10() {
    String[] tolls = { "XX7X45355", "5X1362732", "57X982581", "835X53753", "1355X3599", "75281X287", "479136X51", "1927285XX", "X5852753X" };
    int tollHike = 67;
    assertEquals(49.19266595920293, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 49.19266595920293);
  }

  @Test
  public void case11() {
    String[] tolls = { "X482X3892", "7X4756585", "27XX291X9", "576X625X2", "64X7X5755", "55978X445", "334343X34", "5521543X5", "324575XXX" };
    int tollHike = 34;
    assertEquals(41.6393372982158, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 41.6393372982158);
  }

  @Test
  public void case12() {
    String[] tolls = { "X49X1586", "XX582836", "59XX5456", "216X9455", "3X65X243", "42241X51", "X3X146X2", "9465892X" };
    int tollHike = 7;
    assertEquals(27.956398104265404, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 27.956398104265404);
  }

  @Test
  public void case13() {
    String[] tolls = { "X16889", "XX54X8", "29X496", "755X19", "5482X5", "68292X" };
    int tollHike = 66;
    assertEquals(42.407407407407405, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 42.407407407407405);
  }

  @Test
  public void case14() {
    String[] tolls = { "X8X71218", "7XX59X22", "86X32358", "291X3987", "5713X138", "77X45X35", "785539X5", "34X3187X" };
    int tollHike = 33;
    assertEquals(34.56659619450317, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 34.56659619450317);
  }

  @Test
  public void case15() {
    String[] tolls = { "X3355991", "1X3475X4", "33X47833", "745X8967", "56X7X894", "5X891X55", "553432X7", "4998X9XX" };
    int tollHike = 32;
    assertEquals(37.762199845081334, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 37.762199845081334);
  }

  @Test
  public void case16() {
    String[] tolls = { "X6347", "1X585", "33X57", "X77X8", "4136X" };
    int tollHike = 80;
    assertEquals(42.3125, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 42.3125);
  }

  @Test
  public void case17() {
    String[] tolls = { "X833939X", "7X5X44XX", "97X69582", "221X44XX", "3799X644", "92467X5X", "8X2259X8", "1953828X" };
    int tollHike = 87;
    assertEquals(57.67484662576687, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 57.67484662576687);
  }

  @Test
  public void case18() {
    String[] tolls = { "X71X95X6", "4X553942", "66X366X3", "384X6363", "2289X116", "6998XXX4", "577776X2", "9222X58X" };
    int tollHike = 35;
    assertEquals(41.4024064171123, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 41.4024064171123);
  }

  @Test
  public void case19() {
    String[] tolls = { "XX79", "XXX2", "2XX3", "95XX" };
    int tollHike = 79;
    assertEquals(49.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 49.0);
  }

  @Test
  public void case20() {
    String[] tolls = { "XXX2649", "5X34494", "32X9XX8", "475X28X", "9359XX4", "25917XX", "124116X" };
    int tollHike = 14;
    assertEquals(30.933333333333334, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 30.933333333333334);
  }

  @Test
  public void case21() {
    String[] tolls = { "X1", "4X" };
    int tollHike = 60;
    assertEquals(61.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 61.0);
  }

  @Test
  public void case22() {
    String[] tolls = { "X2X89", "9X72X", "X5X98", "627X8", "2974X" };
    int tollHike = 98;
    assertEquals(67.375, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 67.375);
  }

  @Test
  public void case23() {
    String[] tolls = { "X1X665", "XXX257", "78X415", "557X19", "84X3X6", "729X5X" };
    int tollHike = 57;
    assertEquals(41.44444444444444, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 41.44444444444444);
  }

  @Test
  public void case24() {
    String[] tolls = { "X568474", "7X3X126", "54X1196", "X76X975", "3886X55", "X5658X8", "657355X" };
    int tollHike = 44;
    assertEquals(37.66064981949459, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 37.66064981949459);
  }

  @Test
  public void case25() {
    String[] tolls = { "XX698855", "5X111547", "75X76535", "68XX4336", "7625X559", "X6787X59", "41765XX8", "9939686X" };
    int tollHike = 17;
    assertEquals(36.831042845594176, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 36.831042845594176);
  }

  @Test
  public void case26() {
    String[] tolls = { "X7X3", "7X63", "X3X3", "55XX" };
    int tollHike = 55;
    assertEquals(46.333333333333336, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 46.333333333333336);
  }

  @Test
  public void case27() {
    String[] tolls = { "XXX8", "2X73", "5XX3", "477X" };
    int tollHike = 23;
    assertEquals(31.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 31.0);
  }

  @Test
  public void case28() {
    String[] tolls = { "X625", "5X86", "45X8", "335X" };
    int tollHike = 38;
    assertEquals(27.6, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 27.6);
  }

  @Test
  public void case29() {
    String[] tolls = { "X5325555", "9X492845", "4XXX3764", "873X9766", "315XX625", "5453XX29", "358972XX", "X928252X" };
    int tollHike = 31;
    assertEquals(37.91270718232044, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 37.91270718232044);
  }

  @Test
  public void case30() {
    String[] tolls = { "X8392583", "1XX51698", "56X2527X", "X53X1595", "8756X19X", "8546XX62", "465868X7", "X484291X" };
    int tollHike = 32;
    assertEquals(39.88704965920156, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 39.88704965920156);
  }

  @Test
  public void case31() {
    String[] tolls = { "X54934693", "4X3366915", "83X546816", "793X54628", "8715X4232", "89968X834", "866982X69", "1715248X3", "15759958X" };
    int tollHike = 87;
    assertEquals(48.784963503649635, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 48.784963503649635);
  }

  @Test
  public void case32() {
    String[] tolls = { "X2656", "2X996", "87X82", "785X3", "8455X" };
    int tollHike = 85;
    assertEquals(43.0625, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 43.0625);
  }

  @Test
  public void case33() {
    String[] tolls = { "X998576", "3X31239", "62X8525", "283X122", "5149X35", "76646X7", "296948X" };
    int tollHike = 39;
    assertEquals(32.828220858895705, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 32.828220858895705);
  }

  @Test
  public void case34() {
    String[] tolls = { "X3462", "2X669", "65X24", "157X5", "8784X" };
    int tollHike = 97;
    assertEquals(45.9375, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 45.9375);
  }

  @Test
  public void case35() {
    String[] tolls = { "X34", "8X7", "85X" };
    int tollHike = 81;
    assertEquals(47.5, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 47.5);
  }

  @Test
  public void case36() {
    String[] tolls = { "X2976445", "3X592614", "51X15876", "382X9299", "7262X627", "85345X21", "994573X7", "9865985X" };
    int tollHike = 30;
    assertEquals(34.66581502299438, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 34.66581502299438);
  }

  @Test
  public void case37() {
    String[] tolls = { "X86", "5X8", "43X" };
    int tollHike = 69;
    assertEquals(45.5, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 45.5);
  }

  @Test
  public void case38() {
    String[] tolls = { "X57978", "5X4592", "11X454", "174X46", "2179X2", "58159X" };
    int tollHike = 36;
    assertEquals(29.476923076923075, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 29.476923076923075);
  }

  @Test
  public void case39() {
    String[] tolls = { "X978331", "7X26297", "82X6287", "724X678", "2557X42", "52567X6", "616563X" };
    int tollHike = 94;
    assertEquals(45.28834355828221, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 45.28834355828221);
  }

  @Test
  public void case40() {
    String[] tolls = { "X29143567", "5X8532555", "88X635519", "185X54266", "1529X1522", "25275X357", "845178X13", "5984155X3", "59155997X" };
    int tollHike = 22;
    assertEquals(35.64313868613139, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 35.64313868613139);
  }

  @Test
  public void case41() {
    String[] tolls = { "X62", "8X9", "37X" };
    int tollHike = 33;
    assertEquals(25.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 25.0);
  }

  @Test
  public void case42() {
    String[] tolls = { "X9289547", "7X145758", "82X27566", "583X7765", "4678X527", "55435X18", "199397X5", "8328474X" };
    int tollHike = 33;
    assertEquals(39.23300970873787, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 39.23300970873787);
  }

  @Test
  public void case43() {
    String[] tolls = { "X7655", "7X462", "87X83", "741X6", "1554X" };
    int tollHike = 47;
    assertEquals(29.6875, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 29.6875);
  }

  @Test
  public void case44() {
    String[] tolls = { "X38586375", "3X7577778", "28X222745", "921X26876", "3811X5564", "94125X921", "157564X99", "5685728X1", "99313558X" };
    int tollHike = 83;
    assertEquals(47.666131386861316, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 47.666131386861316);
  }

  @Test
  public void case45() {
    String[] tolls = { "X523268", "6X72375", "11X4285", "779X655", "5425X75", "18687X8", "749375X" };
    int tollHike = 75;
    assertEquals(40.38343558282209, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 40.38343558282209);
  }

  @Test
  public void case46() {
    String[] tolls = { "X3XX5XX235", "6X22XX86X6", "17X3733X6X", "5XXX921X57", "233XX2X295", "46X7XXX28X", "68X4X4X16X", "XX87XXXXX6", "4X1X8823X9", "X854X5793X" };
    int tollHike = 23;
    assertEquals(44.62383770076078, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 44.62383770076078);
  }

  @Test
  public void case47() {
    String[] tolls = { "XX9X2X65X3", "XXX554X69X", "X6X55294X4", "X45X67X295", "85X6X549X8", "75XX3X9821", "X44XXXXX71", "97685XXX5X", "XX92558XX7", "X95XX8X42X" };
    int tollHike = 14;
    assertEquals(45.600969305331176, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 45.600969305331176);
  }

  @Test
  public void case48() {
    String[] tolls = { "X57XX6XX51", "XX475X76X5", "24X44XX575", "5X7X885XX9", "5553X15297", "X5763X6X26", "5X7135XXX8", "21X639XX9X", "XX9X5957X5", "9XX911247X" };
    int tollHike = 43;
    assertEquals(55.56570987257047, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 55.56570987257047);
  }

  @Test
  public void case49() {
    String[] tolls = { "XXX6758838", "3XX2X9X553", "81XX29X56X", "9X6XX97XX4", "X63XX274X6", "1X9X3X585X", "15X94XX52X", "X1X9199X69", "X22X2451X5", "96X779X65X" };
    int tollHike = 5;
    assertEquals(40.406764027671024, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 40.406764027671024);
  }

  @Test
  public void case50() {
    String[] tolls = { "XX5X7X156X", "XX8X421959", "X7X1575X57", "981XXX7X68", "XXX1XX23XX", "1X3X9X8785", "4X5365X83X", "X8389X5X22", "6X11X455X4", "553574X58X" };
    int tollHike = 21;
    assertEquals(44.390405904059044, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 44.390405904059044);
  }

  @Test
  public void case51() {
    String[] tolls = { "XXXX3XX478", "2XX981X7X7", "95X455691X", "X33X6X4282", "6X41X55247", "639X1XX572", "1515X2XX11", "X25XX4XXX4", "568915X2X7", "5X98X5XX3X" };
    int tollHike = 11;
    assertEquals(38.9973474801061, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 38.9973474801061);
  }

  @Test
  public void case52() {
    String[] tolls = { "X52XX928X8", "5XX1X68XXX", "X5X5XX9516", "X28XXX5X37", "X5X1X13651", "73556X397X", "5XXX33XX81", "43X592XXXX", "512X5X94X5", "554XXX922X" };
    int tollHike = 91;
    assertEquals(59.286014169509315, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 59.286014169509315);
  }

  @Test
  public void case53() {
    String[] tolls = { "X55X29X599", "4X2XXX8X51", "76X8XXX5X2", "392X4X4X26", "791XX758X7", "XXX4XX9X68", "5XX41XXX35", "5175X52X55", "51X55X9XX5", "92XXXX95XX" };
    int tollHike = 55;
    assertEquals(53.45491932932616, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 53.45491932932616);
  }

  @Test
  public void case54() {
    String[] tolls = { "XX9XX5659X", "7XX975X5XX", "93X49858X5", "X5XX67581X", "8645X3X624", "454X9XX718", "656416XX43", "5X465XXXX2", "XX54235XX4", "5X7X17X17X" };
    int tollHike = 95;
    assertEquals(66.7055124431362, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 66.7055124431362);
  }

  @Test
  public void case55() {
    String[] tolls = { "XX483X79X5", "7X1X152996", "52XX88X753", "95XX624762", "2512XX3X45", "9X864XX916", "613765X765", "X891877X28", "2534X444X3", "929X54739X" };
    int tollHike = 96;
    assertEquals(61.031095123900876, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 61.031095123900876);
  }

  @Test
  public void case56() {
    String[] tolls = { "X198514486", "5X38531767", "32X5595353", "171X615445", "8141X22716", "12542X8555", "137219X554", "5211815X21", "23474564X4", "572627591X" };
    int tollHike = 97;
    assertEquals(46.0356474849682, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 46.0356474849682);
  }

  @Test
  public void case57() {
    String[] tolls = { "X543212677", "4X53452576", "51X3755522", "232X738512", "9956X65484", "31316X1956", "149379X453", "2738683X31", "78159547X5", "879225196X" };
    int tollHike = 15;
    assertEquals(38.714354796032886, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 38.714354796032886);
  }

  @Test
  public void case58() {
    String[] tolls = { "X973725637", "5X58571757", "18X5342554", "585X461632", "7437X72445", "95425X1865", "846589X523", "3875141X81", "65319996X7", "331348853X" };
    int tollHike = 19;
    assertEquals(41.87504676052226, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 41.87504676052226);
  }

  @Test
  public void case59() {
    String[] tolls = { "X664111745", "7X56923248", "77X2569869", "281X217778", "7245X41253", "99971X3987", "184839X415", "9428429X62", "99856795X8", "555123533X" };
    int tollHike = 80;
    assertEquals(51.82138849098092, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 51.82138849098092);
  }

  @Test
  public void case60() {
    String[] tolls = { "X525986369", "7X28585395", "16X9989957", "455X771355", "7912X58947", "35468X8758", "348585X245", "2522753X15", "55469213X4", "595835321X" };
    int tollHike = 95;
    assertEquals(55.267826023485185, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 55.267826023485185);
  }

  @Test
  public void case61() {
    String[] tolls = { "X255739723", "3X51253585", "99X4556585", "756X243386", "5762X95315", "52324X2275", "839561X182", "3951159X39", "56586283X3", "154535382X" };
    int tollHike = 9;
    assertEquals(39.089296630505196, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 39.089296630505196);
  }

  @Test
  public void case62() {
    String[] tolls = { "X522684593", "8X27978128", "56X5532665", "487X955124", "2635X56599", "38181X4532", "513571X813", "3555879X75", "56478675X2", "456551598X" };
    int tollHike = 4;
    assertEquals(41.44645578051295, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 41.44645578051295);
  }

  @Test
  public void case63() {
    String[] tolls = { "X714517452", "6X77439185", "88X8348856", "596X321582", "6358X79583", "71725X3529", "879255X445", "6725561X42", "85555827X5", "655899451X" };
    int tollHike = 55;
    assertEquals(46.821397614985266, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 46.821397614985266);
  }

  @Test
  public void case64() {
    String[] tolls = { "X831915326", "5X15468442", "59X3237719", "125X576899", "1863X56974", "58362X7695", "781357X728", "9897859X26", "27246523X7", "652172715X" };
    int tollHike = 67;
    assertEquals(50.87498289249186, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 50.87498289249186);
  }

  @Test
  public void case65() {
    String[] tolls = { "X274253172", "6X55475885", "36X6474639", "554X145141", "9454X92951", "57611X5466", "576528X418", "8255269X25", "86946234X9", "577875988X" };
    int tollHike = 49;
    assertEquals(44.214249869982936, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 44.214249869982936);
  }

  @Test
  public void case66() {
    String[] tolls = { "X2XX", "XX44", "X1XX", "XXXX" };
    int tollHike = 4;
    assertEquals(10.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 10.0);
  }

  @Test
  public void case67() {
    String[] tolls = { "X23X", "XX44", "X1XX", "111X" };
    int tollHike = 4;
    assertEquals(11.0, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 11.0);
  }

  @Test
  public void case68() {
    String[] tolls = { "X111111111", "1X11111111", "11X1111111", "111X111111", "1111X11111", "11111X1111", "111111X111", "1111111X11", "11111111X1", "111111111X" };
    int tollHike = 1;
    assertEquals(8.1250079835038, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 8.1250079835038);
  }

  @Test
  public void case69() {
    String[] tolls = { "X324", "5X22", "12X5", "991X" };
    int tollHike = 57;
    assertEquals(29.2, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 29.2);
  }

  @Test
  public void case70() {
    String[] tolls = { "X123456789", "1X23456789", "11X3456789", "112X456789", "1123X56789", "11234X6789", "112345X789", "1123456X89", "11234567X9", "112345678X" };
    int tollHike = 100;
    assertEquals(52.999927007965255, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 52.999927007965255);
  }

  @Test
  public void case71() {
    String[] tolls = { "X324", "5X22", "12X5", "991X" };
    int tollHike = 82;
    assertEquals(39.2, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 39.2);
  }

  @Test
  public void case72() {
    String[] tolls = { "X999999999", "9X99999999", "99X9999999", "999X999999", "9999X99999", "99999X9999", "999999X999", "9999999X99", "99999999X9", "999999999X" };
    int tollHike = 100;
    assertEquals(84.4999680659848, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 84.4999680659848);
  }

  @Test
  public void case73() {
    String[] tolls = { "X11", "2X1", "37X" };
    int tollHike = 76;
    assertEquals(39.5, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 39.5);
  }

  @Test
  public void case74() {
    String[] tolls = { "X32445", "5X2223", "12X589", "991X11", "6321X5", "86942X" };
    int tollHike = 98;
    assertEquals(38.261538461538464, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 38.261538461538464);
  }

  @Test
  public void case75() {
    String[] tolls = { "X123456789", "1X23456789", "12X3456789", "123X456789", "1234X56789", "12345X6789", "123456X789", "1234567X89", "12345678X9", "123456789X" };
    int tollHike = 98;
    assertEquals(55.749938412970685, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 55.749938412970685);
  }

  @Test
  public void case76() {
    String[] tolls = { "X123456789", "9X12345678", "94X2345678", "192X345678", "9123X45678", "91234X5678", "912345X678", "9123444X67", "91234333X7", "912345678X" };
    int tollHike = 10;
    assertEquals(37.28574556801489, greedygovernment.maxAverageCost(tolls, tollHike), DELTA * 37.28574556801489);
  }

}
