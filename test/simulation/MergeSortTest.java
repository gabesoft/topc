package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class MergeSortTest {
  MergeSort mergesort = new MergeSort();

  @Test
  public void case1() {
    int[] numbers = { 1, 2, 3, 4 };
    assertEquals(4, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case2() {
    int[] numbers = { 2, 3, 2 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case3() {
    int[] numbers = { -17 };
    assertEquals(0, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case4() {
    int[] numbers = {  };
    assertEquals(0, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case5() {
    int[] numbers = { -20 };
    assertEquals(0, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case6() {
    int[] numbers = { 7, 7 };
    assertEquals(1, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case7() {
    int[] numbers = { 4, 3 };
    assertEquals(1, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case8() {
    int[] numbers = { 3, 4 };
    assertEquals(1, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case9() {
    int[] numbers = { 1, 2, 3 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case10() {
    int[] numbers = { 1, 3, 2 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case11() {
    int[] numbers = { 2, 1, 3 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case12() {
    int[] numbers = { 2, 3, 1 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case13() {
    int[] numbers = { 3, 1, 2 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case14() {
    int[] numbers = { 3, 2, 1 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case15() {
    int[] numbers = { 1, 1, 2 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case16() {
    int[] numbers = { 1, 2, 1 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case17() {
    int[] numbers = { 2, 1, 1 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case18() {
    int[] numbers = { 1, 1, 1 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case19() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
    assertEquals(9, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case20() {
    int[] numbers = { 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(11, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case21() {
    int[] numbers = { 47, 36 };
    assertEquals(1, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case22() {
    int[] numbers = { 16, 30, 46 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case23() {
    int[] numbers = { 36, 26, 33, 14 };
    assertEquals(5, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case24() {
    int[] numbers = { 23, 18, 37, 37, 5 };
    assertEquals(7, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case25() {
    int[] numbers = { 20, 25, 1, 41, 42, 23 };
    assertEquals(10, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case26() {
    int[] numbers = { 25, 39, 0, 37, 30, 12, 47 };
    assertEquals(14, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case27() {
    int[] numbers = { 41, 32, 33, 30, 31, 19, 48, 14 };
    assertEquals(17, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case28() {
    int[] numbers = { 17, 34, 42, 1, 1, 15, 21, 38, 2 };
    assertEquals(19, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case29() {
    int[] numbers = { 29, 11, 29, 30, 2, 23, 5, 30, 13, 6 };
    assertEquals(24, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case30() {
    int[] numbers = { 17, 45, 20, 16, 36, 4, 49, 18, 38, 21, 16 };
    assertEquals(27, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case31() {
    int[] numbers = { 2, 38, 3, 44, 41, 4, 11, 15, 44, 15, 44, 5 };
    assertEquals(28, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case32() {
    int[] numbers = { 44, 26, 8, 20, 34, 38, 35, 40, 7, 30, 12, 24, 17 };
    assertEquals(35, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case33() {
    int[] numbers = { 17, 25, 37, 5, 46, 4, 9, 37, 9, 3, 28, 15, 14, 43 };
    assertEquals(38, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case34() {
    int[] numbers = { 9, 29, 39, 15, 25, 18, 25, 45, 2, 15, 32, 44, 24, 13, 6 };
    assertEquals(40, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case35() {
    int[] numbers = { 0, 32, 23, 26, 19, 30, 24, 25, 39, 11, 34, 42, 42, 49, 8, 37 };
    assertEquals(42, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case36() {
    int[] numbers = { 11, 39, 29, 26, 17, 47, 3, 14, 49, 18, 47, 43, 42, 10, 49, 45, 44 };
    assertEquals(49, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case37() {
    int[] numbers = { 25, 21, 13, 5, 47, 41, 45, 9, 25, 39, 3, 27, 0, 40, 38, 41, 21, 16 };
    assertEquals(51, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case38() {
    int[] numbers = { 8, 18, 19, 23, 19, 39, 22, 14, 33, 34, 16, 28, 28, 41, 49, 43, 48, 49, 34 };
    assertEquals(52, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case39() {
    int[] numbers = { -1437091263, 1501670972, 716373032, 1116631301, -732859106, -1539331901, -1281417393, -1167652725, 688931660, -1441761044, 688931660, -1126886511, -569924439, 253060386, 193039816, -372592555, 929210903, -183615805, 552793671, 668036989 };
    assertEquals(62, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case40() {
    int[] numbers = { 1479524095, 1479524095, 1082981104, 513056665, 766117051, 959156867, 586564313, 513056665, 754211028, 839080859, -534601298, -1202560850, 1572022689, -19854097, -538011812, 134453198, -328364711, 754211028, -623506431, 708652979, -1701361236, 754211028, -534601298, -979453453, 498820948 };
    assertEquals(84, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case41() {
    int[] numbers = { 850374041, -452435125, -270833029, 1173484882, -452435125, -270833029, 850374041, -83443999, -226230674, 575905448, 802580611, 1009401678, -452435125, 1464808776, -308404349, 74068174, -166965734, 300653338, 1214394821, -452435125, 51672587, 854253198, -283828773, 854253198, -452435125, -1683252938, 752923527, -1133859689, -1348417877, 501063584 };
    assertEquals(107, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case42() {
    int[] numbers = { -399528715, -129194197, -188173052, -77644332, 545060329, 485090118, 116715558, -177590827, 116715558, 603913596, -1042506467, -1065675744, 1110311214, -154415927, 485090118, 454460883, 939551001, 1056266559, -1268807917, -1065675744, -1095268856, 9708325, -1055967419, 454460883, 485090118, -314749888, -1095268856, -365222270, 794281223, 360209526, 412316241, 1188086959, 520314879, 156954934, -31187073 };
    assertEquals(132, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case43() {
    int[] numbers = { 359892402, 45142513, -472198782, 676905441, 1530755522, -1266908324, 1530755522, 344976064, 865290943, -1125237771, -1156424844, 758774610, 234793849, -126422596, 1530755522, -743898339, 136676985, -1332110341, 196921771, 438514350, 484183625, -126422596, -229036475, 5757374, 196921771, -386575532, -1130473871, 1153686762, -178423579, 18498192, -1332110341, 107190669, 1266863233, 1266863233, 814951337, -1591937630, 168970486, -961503385, 192183377, 13759798 };
    assertEquals(157, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case44() {
    int[] numbers = { -843345432, 1242715126, 1349905796, 469285381, -640371509, 403212624, 1242715126, 1406111146, 444607761, 636791138, 650550936, 682808926, 1172079458, 455062509, -1079968531, -1234818498, -193549724, 1362567385, 639417677, 64548718, 1608948, -904676255, -568246332, 1118089387, -1021256809, 493992782, -843345432, 330284767, -305385506, 1172079458, -1330539815, 818552781, -86123475, -654369806, -1683764067, -557537227, -63544446, 201426902, -583975296, 323310462, 650550936, -379933362, 665626807, 636791138, 682808926 };
    assertEquals(181, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case45() {
    int[] numbers = { 676157473, -879213711, 676157473, 68274365, 68274365, -1840185910, 474531788, 145317820, 676157473, -758150407, 121855856, 347492313, -1110635297, -978816486, -910542121, 1506642794, 1192368765, -946078450, -582816538, 572732409, -175352012, -1545704746, 444286033, 61384307, 1518309623, 662429473, -2033636587, 39796437, 111063632, -52284714, 68274365, 550690124, 1046450888, 550690124, 170713070, -458460955, 203968518, -1829668069, 357612016, -1678808000, 416390934, 631769139, 741129694, 1046949504, -758150407, 1518309623, -176138463, 27830055, -946078450, 385398478 };
    assertEquals(215, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case46() {
    int[] numbers = { -2000000000, 2000000000, 0, 0, 0, -2000000000, 2000000000, 0, 0, 0 };
    assertEquals(19, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case47() {
    int[] numbers = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(153, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case48() {
    int[] numbers = { 4, 2, 3, 1 };
    assertEquals(5, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case49() {
    int[] numbers = { 12, 144, 151, 40 };
    assertEquals(5, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case50() {
    int[] numbers = { -20000, 20000, 0, 0, 0, -20000, 20000, 0, 0, 0 };
    assertEquals(19, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case51() {
    int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    assertEquals(151, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case52() {
    int[] numbers = { 23947, 20, -102, 30, 30, 20, 340, -122, 0, 0, 3, 0, 0, 489, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(63, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case53() {
    int[] numbers = { 200000000, 2, 3, 4, -2000000, 0, 0, 99, 99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 100, 200000 };
    assertEquals(58, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case54() {
    int[] numbers = { 2, 3, 3 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case55() {
    int[] numbers = { 5, 4, 3 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case56() {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    assertEquals(7, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case57() {
    int[] numbers = { 4, 2, 3, 1 };
    assertEquals(5, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case58() {
    int[] numbers = { 12, 144, 151, 40 };
    assertEquals(5, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case59() {
    int[] numbers = { -20000, 20000, 0, 0, 0, -20000, 20000, 0, 0, 0 };
    assertEquals(19, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case60() {
    int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    assertEquals(151, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case61() {
    int[] numbers = { 23947, 20, -102, 30, 30, 20, 340, -122, 0, 0, 3, 0, 0, 489, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(63, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case62() {
    int[] numbers = { 200000000, 2, 3, 4, -2000000, 0, 0, 99, 99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 100, 200000 };
    assertEquals(58, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case63() {
    int[] numbers = { 2, 3, 3 };
    assertEquals(2, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case64() {
    int[] numbers = { 5, 4, 3 };
    assertEquals(3, mergesort.howManyComparisons(numbers));
  }

  @Test
  public void case65() {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    assertEquals(7, mergesort.howManyComparisons(numbers));
  }

}
