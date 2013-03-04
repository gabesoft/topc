package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MostLikelyTest {
  MostLikely mostlikely = new MostLikely();

  @Test
  public void case1() {
    int[] sc = { 3, 12, 4 };
    int low = 8;
    int high = 8;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case2() {
    int[] sc = { 3, 4, 5 };
    int low = 3;
    int high = 7;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case3() {
    int[] sc = { 3, 4, 5 };
    int low = 2;
    int high = 5;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case4() {
    int[] sc = { 121, 120, 119 };
    int low = 120;
    int high = 120;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case5() {
    int[] sc = { 5 };
    int low = 1;
    int high = 1;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case6() {
    int[] sc = { 11, 11 };
    int low = 0;
    int high = 0;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case7() {
    int[] sc = { 199999900 };
    int low = 201000000;
    int high = 201000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case8() {
    int[] sc = { 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117 };
    int low = 117;
    int high = 122;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case9() {
    int[] sc = { 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117 };
    int low = 112;
    int high = 117;
    assertEquals(51, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case10() {
    int[] sc = { 234, 1000000000, 333333333, 444444444, 555555555, 0, 1, 999999999, 333333333, 222222234 };
    int low = 0;
    int high = 922222222;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case11() {
    int[] sc = { 1, 6, 6, 7, 9 };
    int low = 5;
    int high = 7;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case12() {
    int[] sc = { 1, 6, 6, 8, 9 };
    int low = 5;
    int high = 7;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case13() {
    int[] sc = { 422000000, 1, 6, 6, 8, 9, 422000000 };
    int low = 0;
    int high = 843999989;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case14() {
    int[] sc = { 422000000, 1, 6, 6, 8, 9, 422000000 };
    int low = 0;
    int high = 843999989;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case15() {
    int[] sc = { 422000000, 1, 6, 6, 8, 9, 422000000 };
    int low = 0;
    int high = 843999990;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case16() {
    int[] sc = { 422000000, 1, 6, 6, 8, 9, 422000000 };
    int low = 0;
    int high = 843999991;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case17() {
    int[] sc = { 470428639, 509959133, 414860692, 413242890, 780165405, 239767459, 464007868, 371070014, 731943922, 689269959, 509784042, 654399067, 673028214, 294088218, 583790801, 770657866, 255898284, 627206520, 656746207, 303561142, 336677693, 387914137, 594557748 };
    int low = 388802647;
    int high = 549772527;
    assertEquals(15, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case18() {
    int[] sc = { 735997929, 796517922, 765116916, 750996250, 718838311, 731876524, 784419099, 792820808, 783012578, 694657742, 666018239, 749974911, 663954650, 792498123, 741457712, 652988147, 777263549 };
    int low = 684463254;
    int high = 775314794;
    assertEquals(14, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case19() {
    int[] sc = { 972170909, 969360620, 956557123, 951869529, 967431645, 961003682, 953501467, 968825402, 970138014, 952141397, 973178141, 952489767, 959058216, 963463212 };
    int low = 975020158;
    int high = 975271776;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case20() {
    int[] sc = { 787448972, 556899633, 740187190, 628565409, 779751361, 732770537, 761591015, 580617684, 694032886, 422852946, 628015314, 566198244, 522997061, 645300169, 784475698, 491649245, 598151186, 383768572, 544066096, 555808458, 433856273, 467170256, 526359360, 663033582, 505661062, 410581086, 528955273, 459387443, 713890682 };
    int low = 613213859;
    int high = 739130371;
    assertEquals(9, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case21() {
    int[] sc = { 410219923, 412221335, 385628651, 387987771, 413824751, 402226607, 376662458, 372231719, 360389205, 391025015, 368724278, 366110168, 381046179, 389819789, 396887877, 404964913, 398433009, 380810947, 369685929, 374033383, 366106213, 409732468, 365583264, 394508006, 365575318, 368499656, 411957453, 363730225, 405742629, 358293294, 414919512, 400159842, 395553353, 400990739, 400054521 };
    int low = 375741981;
    int high = 407888967;
    assertEquals(21, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case22() {
    int[] sc = { 597807872, 610128932, 666677511, 576034341, 694394295, 682182214, 553738342, 710612125, 512842605, 522380423 };
    int low = 606761675;
    int high = 665991627;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case23() {
    int[] sc = { 808120420, 853775370, 886587813, 704737127, 735027988, 795800300, 745042651, 730720416 };
    int low = 686025710;
    int high = 753499745;
    assertEquals(8, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case24() {
    int[] sc = { 391502477, 362307576, 366869628, 349181249, 356079764, 364982905, 385258069, 344042740, 360864208, 350243073, 395215253, 347824732, 343361880, 372562812, 356376215, 385484332, 377757702, 374368255, 392105119, 356058583 };
    int low = 396539029;
    int high = 397466982;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case25() {
    int[] sc = { 750869392, 742121543, 942379694, 913553270, 858208943, 822595946, 830142438, 786923935, 818653037, 922931697, 924631189, 920045175, 893129938, 886766297, 744152314, 924871798, 773827640, 762210234, 832432895, 801184249, 732958478, 743111992, 915309368, 830576861, 867532362, 951191084, 826004517, 751734319, 944439243 };
    int low = 764696499;
    int high = 896293839;
    assertEquals(14, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case26() {
    int[] sc = { 821958858, 813788242, 821821675, 818787706, 817253541, 815523732, 819954085, 819032527, 815199700, 820075582, 813417698, 817820658, 813121139, 814801658, 815430308, 813480791, 815889472, 821794717 };
    int low = 820139607;
    int high = 822415366;
    assertEquals(4, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case27() {
    int[] sc = { 701692403, 672656048, 631758149, 625908343, 716914442, 591012775, 708656593, 597298584, 628557999, 772506793, 666135170, 589177229, 571226468, 663516177, 709605533, 716235409, 605165522, 651885665, 764774147, 759133911, 755415842, 633261186, 732755564, 721072863, 633733698, 665875056, 713832675, 739997386, 696304904, 607849099, 739843125, 623242671, 581431892, 748215203, 600132575, 776036103, 769275693, 633708700, 765144376, 750487651, 661528843, 592587419, 745124914, 657177690, 752087369, 680725409, 583142588 };
    int low = 769569841;
    int high = 775990050;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case28() {
    int[] sc = { 464124194, 481355145, 503857876, 427482292, 477145267, 460390544, 486184582, 453634629, 454893310, 478980178, 487790265, 436874876, 516127764, 449068463, 510239757, 437446953, 463590162 };
    int low = 451253563;
    int high = 471720992;
    assertEquals(9, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case29() {
    int[] sc = { 333820877, 465542724, 170156947, 153580744, 369262072 };
    int low = 384758295;
    int high = 434790696;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case30() {
    int[] sc = { 941547037, 928672511, 949917052, 928246223, 936420656, 943167343, 933334299, 934193011, 946481145, 939866067, 928582142, 946185877, 934617100, 948350888 };
    int low = 944039707;
    int high = 947198360;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case31() {
    int[] sc = { 677437941, 563423024, 110888814, 121957020, 122691838, 699218935, 470696364, 744435297, 617960739, 439666422 };
    int low = 622355331;
    int high = 695005699;
    assertEquals(4, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case32() {
    int[] sc = { 541102735, 457482036, 468394345, 508312459, 342685763, 431136835, 492751351, 356401731, 350142359, 536661046, 354655363, 383081309, 339148472, 463057557, 358742615, 344732856, 534271086, 539762132, 409035801 };
    int low = 547325714;
    int high = 549925137;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case33() {
    int[] sc = { 922559787, 961158697, 932628777, 917747531, 960370091, 966391680, 910148897, 960568575, 914220516, 945528416, 951623746, 947013052, 920585795, 962333250, 919852828, 909973200, 908505420, 917287982, 934549272, 966424234, 948049841, 918709869, 942713487, 940080268, 960638492, 954280750, 943052277 };
    int low = 908301379;
    int high = 949705183;
    assertEquals(18, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case34() {
    int[] sc = { 601338069, 604929518, 594309071, 584048644, 575518463, 580765054, 605165269, 605785274 };
    int low = 583984683;
    int high = 584052855;
    assertEquals(7, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case35() {
    int[] sc = { 572651212, 540414388, 533767644, 589888606, 568398210, 594848493, 500977420, 459750174, 471213340 };
    int low = 505844436;
    int high = 574502588;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case36() {
    int[] sc = { 497331608, 505901179, 417827011, 503740508, 502087603, 498789877, 426939952, 493433356, 447840670, 426076026, 495652811, 488402523, 503103972, 444886247, 492976610, 421789063, 442599325, 509106644, 497268363, 428446452, 434095611, 493524262, 465341752, 410629563, 477644768, 449634212, 483343843, 508204226, 454543597, 469132580, 443386308, 421843460, 479401798, 457631202, 405478850, 501333868, 474990833, 434959740, 423841398, 488115139, 430532477, 513636989, 435388203 };
    int low = 487972720;
    int high = 503343927;
    assertEquals(16, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case37() {
    int[] sc = { 689371991, 468801824, 461017224, 474708669, 480747521, 416977571, 598759841, 622378900, 602354896, 435569359, 643950177, 668480503, 925259564, 656217145, 591558095, 674111557, 540195996, 519192082, 747285813, 804915657, 484560734, 670090277, 569801608, 527374083 };
    int low = 766976358;
    int high = 939161028;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case38() {
    int[] sc = { 533374732, 536428260, 499256478, 520143343, 605173842, 628768973, 608691311, 712696301, 583222739, 631630443, 653883252, 559777539, 703107480, 747490344, 638968084, 509223538, 542108202, 681364280, 556000376, 648370212, 626849889, 683470856, 606279591, 657897046, 584012021, 524318626 };
    int low = 730982666;
    int high = 736554607;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case39() {
    int[] sc = { 561117130, 597158716, 563991039, 579148710, 597217699, 568405016, 523382587, 514470369, 523659332, 551178965, 530565593, 509247529, 592868936, 556293402, 572789799, 512117605, 589607002, 594792824, 541096516, 543877713, 553840557, 572271809, 524818830, 540242473, 518511981, 517231160, 504563693, 532711822, 596449803, 575470498, 529169101, 559691903, 611967872 };
    int low = 539934762;
    int high = 583435587;
    assertEquals(19, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case40() {
    int[] sc = { 312718624, 632145508, 80604731, 531076041, 513376744, 566142578, 272373144, 580203595, 84671389, 468016512, 633989070, 437068938, 133726344, 251985819, 270909156, 415338466, 606288945, 528752110, 675335435, 398247835, 469882557, 554533133, 234349982, 545696236, 528622687, 480233537, 359713859, 263916580 };
    int low = 568615714;
    int high = 631281173;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case41() {
    int[] sc = { 527644094, 766735751, 788958718, 658948429, 753001505, 713708488, 539677203, 724538734, 596278771, 747645753, 837804087, 827512786 };
    int low = 698065592;
    int high = 830071307;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case42() {
    int[] sc = { 539447447, 814704703, 880562244, 753270189, 646389313, 484066732, 690330392, 793501532, 420117367, 741638385, 595249276, 862568944, 798777088, 591803805, 721866077, 398786242, 690124226, 403899333, 484220510, 495259104, 559369067, 526384875, 450200610, 473769742, 423433746, 635792953, 787914014, 611459461, 511571772, 347375859, 812220111, 739793955, 337904865, 386082046, 853079302, 334722628, 735351601, 322235141, 661879820, 650337453, 805110635, 681196550, 555408574, 631788650, 459338870, 493132689, 333465903 };
    int low = 789328330;
    int high = 794822353;
    assertEquals(9, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case43() {
    int[] sc = { 208955096, 117205214, 211527151, 206524899, 81909079, 202684263, 87346933, 194350652, 85422498, 186027450, 217857534, 102245837, 295311176, 170221012, 235910668, 272361876, 130451683, 202926087, 213267153, 268396222, 126806953, 171706471, 90077248, 274983399, 271855236, 255150855, 266823996, 106519962, 78983026, 146669059, 83401422, 132034677, 77317774, 224074263, 179854644, 240426029 };
    int low = 124269762;
    int high = 278104200;
    assertEquals(23, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case44() {
    int[] sc = { 383377355, 374653939, 347497026, 384672986, 292295495, 160680168, 308600371, 484818859, 430975587, 399676591, 524770056, 137227188, 169950024, 234851728, 305449780, 344704382, 244526411, 136736838, 327817020, 477127285, 382110124, 240339090, 264035691, 156262674, 241961200, 246935107, 414509827, 357930086, 413735845, 318709254, 181474484, 177599588, 325735316, 488114703, 281284631, 547791770, 156090945, 282057405, 317891223, 150587760, 487825090, 169493560, 143916496, 371569500, 236392674, 546884073, 174192568 };
    int low = 205544729;
    int high = 289760482;
    assertEquals(36, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case45() {
    int[] sc = { 848664536 };
    int low = 904882354;
    int high = 918264787;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case46() {
    int[] sc = { 581438554, 557054610, 619879460 };
    int low = 552144048;
    int high = 605547702;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case47() {
    int[] sc = { 443306060, 250641150, 612389273, 275078406, 278875045, 212408078, 223972631, 571729722, 213141018, 526276909, 400801488, 224925519, 566413491, 266707113, 450939822, 558140376, 330923786, 660575623, 518524986, 646991316, 279530000, 71217053, 243955535, 268700581, 162905398, 660261972, 162617187, 369028223, 463244903, 450555019, 405477748, 348562074, 658247431, 122826277, 681834661 };
    int low = 421165858;
    int high = 460866835;
    assertEquals(16, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case48() {
    int[] sc = { 526503303, 690614289, 369298884, 349790082, 576429685, 449557340, 283541322, 495004428, 583308235, 439619071, 469560254, 290555829, 301239044, 282502089, 400708934, 304144340, 242722222, 316497637, 418459455, 381412351, 663969044, 407358369, 229054239, 628616453, 647379706, 530814345, 636746855, 708967215, 434218292, 467612786, 358474910, 621599403, 419582025, 380599372, 675369155, 698746423, 232727565, 704201554, 251275734, 605977955, 613412566, 287704759, 369930710, 545411249, 441103376, 447731981, 669096856 };
    int low = 622384553;
    int high = 697681413;
    assertEquals(8, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case49() {
    int[] sc = { 870134703, 656505685, 339548016, 253321652, 553082102, 413587576, 634428398, 149660572, 311484298, 650812582, 458525490 };
    int low = 107054094;
    int high = 819587539;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case50() {
    int[] sc = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case51() {
    int[] sc = { 0, 10, 100, 200, 300, 400, 500, 1000, 2000, 3000, 4000, 5000, 10000, 20000, 30000, 40000, 50000, 100000, 200000, 300000, 400000, 500000, 600000, 700000, 1000000, 2000000, 3000000, 4000000, 5000000, 6000000, 7000000, 20000000, 30000000, 40000000, 50000000, 60000000, 10000000, 100000000, 555555555, 888888888, 999999999, 1000000000 };
    int low = 1;
    int high = 1000000000;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case52() {
    int[] sc = { 3, 4, 5 };
    int low = 2;
    int high = 5;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case53() {
    int[] sc = { 499999999, 500000000 };
    int low = 1;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case54() {
    int[] sc = { 3, 4, 5 };
    int low = 1;
    int high = 2;
    assertEquals(4, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case55() {
    int[] sc = { 3, 4, 5 };
    int low = 1;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case56() {
    int[] sc = { 1, 2, 222, 33, 333, 333, 44, 44, 444, 444, 4, 55555, 555, 55, 6, 66, 666, 666, 666, 66, 6 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case57() {
    int[] sc = { 400, 1000, 2000, 3000 };
    int low = 450;
    int high = 2500;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case58() {
    int[] sc = { 5, 5, 5, 5, 5 };
    int low = 1;
    int high = 7;
    assertEquals(6, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case59() {
    int[] sc = { 1, 2, 66, 1000000000 };
    int low = 1;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case60() {
    int[] sc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 999999999, 99999999, 9999999, 99900011 };
    int low = 0;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case61() {
    int[] sc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case62() {
    int[] sc = { 1324, 321111111, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(12, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case63() {
    int[] sc = { 200, 200, 200, 300, 300, 1000000000 };
    int low = 1;
    int high = 500000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case64() {
    int[] sc = { 0, 1, 2, 1000000000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case65() {
    int[] sc = { 0, 10, 20, 30 };
    int low = 11;
    int high = 28;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case66() {
    int[] sc = { 3, 4, 5 };
    int low = 2;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case67() {
    int[] sc = { 7, 8, 9 };
    int low = 6;
    int high = 7;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case68() {
    int[] sc = { 1, 100, 50000, 532333, 53323, 646463, 345566, 5000000, 50000000, 500000000, 1000000000, 52345, 523462, 378554, 233342, 6678888, 325, 552234, 623454, 6235252, 7453663, 236676, 34777788, 532355, 735778383, 32822356, 23567772, 2355666, 23312333, 4234555, 35626266, 523523523, 62562353, 342523627, 7, 7457735, 5235532, 3552, 42344, 266666, 635453, 5235, 845635, 234555, 23577, 8, 86477463, 523521, 2344 };
    int low = 10;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case69() {
    int[] sc = { 999999999, 999923999, 999999999, 999990000, 999999999, 1, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999 };
    int low = 0;
    int high = 1000000000;
    assertEquals(48, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case70() {
    int[] sc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case71() {
    int[] sc = { 3, 3, 3 };
    int low = 1;
    int high = 4;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case72() {
    int[] sc = { 1000000000, 999993101, 999997852, 999995393, 999992118, 999991877, 999993731, 999997869, 999993680, 999991420, 999998058, 999999856, 999991800, 999991815, 999992776, 999990749, 999990245, 999996578, 999998155, 999992124, 999997897, 999995505, 999990762, 999996760, 999990254, 999999716, 999992705, 999999388, 999999401, 999991844, 999999116, 999991159, 999999920, 999995588, 999998166, 999998726, 999999390, 999997909, 999995430, 999990565, 999998599, 999994033, 999992383, 999997700, 999998423, 999990137, 999996972, 999993349, 999997431, 1000000000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(51, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case73() {
    int[] sc = { 1, 10 };
    int low = 8;
    int high = 11;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case74() {
    int[] sc = { 3, 12, 4, 3, 4, 12, 12 };
    int low = 8;
    int high = 8;
    assertEquals(4, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case75() {
    int[] sc = { 5, 5, 5, 5, 5 };
    int low = 1;
    int high = 3;
    assertEquals(6, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case76() {
    int[] sc = { 2, 3, 4 };
    int low = 1;
    int high = 2;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case77() {
    int[] sc = { 2, 2 };
    int low = 1;
    int high = 2;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case78() {
    int[] sc = { 1, 15, 4000, 5000, 9000, 1000, 10000, 100000, 200000, 300000, 2, 3, 4, 999999, 1000000, 1000001, 1000002, 1000004, 1000005, 1000008, 1000009, 90000000, 90000001, 10000000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case79() {
    int[] sc = { 9, 234534534, 345345, 43534536, 546457657, 7867867, 4362, 34523, 423, 4, 23, 5, 34, 5, 4, 6, 546, 45, 66, 57567, 656, 756, 5656, 756, 999999900, 999990000 };
    int low = 1;
    int high = 99999999;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case80() {
    int[] sc = { 9, 234534534, 345345, 43534536, 546457657, 7867867, 4362, 34523, 423, 4, 23, 5, 34, 5, 4, 6, 546, 45, 66, 57567, 656, 756, 5656, 756, 1000000000 };
    int low = 1;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case81() {
    int[] sc = { 3, 12, 4 };
    int low = 1;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case82() {
    int[] sc = { 3, 4, 5, 2, 3, 4, 5, 10 };
    int low = 2;
    int high = 5;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case83() {
    int[] sc = { 1, 5, 200000000, 999999999 };
    int low = 1;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case84() {
    int[] sc = { 1, 5 };
    int low = 2;
    int high = 6;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case85() {
    int[] sc = { 3, 4, 6, 3, 4, 5, 76, 3, 3, 4, 3, 4, 43, 43, 34, 34, 34, 45, 54, 3, 23, 45, 5, 3, 23, 34, 34, 45, 45, 45, 45, 56, 4, 43, 2, 23, 5, 4, 45, 23, 345, 6, 56, 45, 43, 43, 34, 34 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case86() {
    int[] sc = { 4343, 22, 1, 10000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case87() {
    int[] sc = { 8, 8, 8, 8 };
    int low = 8;
    int high = 8;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case88() {
    int[] sc = { 1, 11, 111, 111, 2, 33, 55, 44, 88, 33, 5, 44, 77, 88, 899, 6, 66, 333, 22, 1, 55, 4, 54, 545, 45, 4 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case89() {
    int[] sc = { 5, 8, 11 };
    int low = 2;
    int high = 13;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case90() {
    int[] sc = { 3, 12, 4, 0, 1000000000 };
    int low = 0;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case91() {
    int[] sc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 30, 1231, 213, 214, 123, 123 };
    int low = 1;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case92() {
    int[] sc = { 3, 12, 4 };
    int low = 8;
    int high = 8;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case93() {
    int[] sc = { 9383, 10886, 12777, 16915, 7793, 18335, 5386, 492, 16649, 1421, 2362, 10027, 8690, 59, 17763, 13926, 540, 3426, 9172, 15736, 5211, 15368, 2567, 16429, 5782, 1530, 2862, 5123, 14067, 3135, 13929, 19802, 14022, 3058, 13069, 18167, 1393, 18456, 15011, 18042, 16229, 17373, 4421, 4919, 13784, 18537, 15198, 14324, 18315, 4370 };
    int low = 0;
    int high = 999999999;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case94() {
    int[] sc = { 1, 56456, 45645, 12654, 544, 546456, 456456, 4, 4, 4, 5, 6, 6, 7, 8, 9, 6456, 654645 };
    int low = 15;
    int high = 1000;
    assertEquals(9, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case95() {
    int[] sc = { 3, 12, 4 };
    int low = 8;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case96() {
    int[] sc = { 1, 5, 5, 5, 7 };
    int low = 6;
    int high = 6;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case97() {
    int[] sc = { 3, 4, 5, 500000000, 1000000000 };
    int low = 0;
    int high = 99999999;
    assertEquals(3, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case98() {
    int[] sc = { 1, 2, 3, 100, 1000000000, 1000000000 };
    int low = 999999999;
    int high = 1000000000;
    assertEquals(-1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case99() {
    int[] sc = { 1, 1, 1, 1, 12, 2, 2, 3, 55, 5, 5, 510, 1000000, 3434343, 434343 };
    int low = 0;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case100() {
    int[] sc = { 10, 20, 30, 30, 30, 10, 10, 10 };
    int low = 10;
    int high = 10;
    assertEquals(5, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case101() {
    int[] sc = { 3, 4, 5, 1, 1000000000 };
    int low = 1;
    int high = 1000000000;
    assertEquals(2, mostlikely.likelyRank(sc, low, high));
  }

  @Test
  public void case102() {
    int[] sc = { 1, 2, 3 };
    int low = 1;
    int high = 1000000000;
    assertEquals(1, mostlikely.likelyRank(sc, low, high));
  }

}
