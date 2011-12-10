package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FairWorkloadTest {
  FairWorkload fairworkload = new FairWorkload();

  @Test
  public void case1() {
    int[] folders = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    int workers = 3;
    assertEquals(170, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case2() {
    int[] folders = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    int workers = 5;
    assertEquals(110, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case3() {
    int[] folders = { 568, 712, 412, 231, 241, 393, 865, 287, 128, 457, 238, 98, 980, 23, 782 };
    int workers = 4;
    assertEquals(1785, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case4() {
    int[] folders = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000 };
    int workers = 2;
    assertEquals(1000, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case5() {
    int[] folders = { 50, 50, 50, 50, 50, 50, 50 };
    int workers = 2;
    assertEquals(200, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case6() {
    int[] folders = { 1, 1, 1, 1, 100 };
    int workers = 5;
    assertEquals(100, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case7() {
    int[] folders = { 950, 650, 250, 250, 350, 100, 650, 150, 150, 700 };
    int workers = 6;
    assertEquals(950, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case8() {
    int[] folders = { 689, 516, 776, 244, 991, 797 };
    int workers = 5;
    assertEquals(1020, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case9() {
    int[] folders = { 444, 976, 369 };
    int workers = 1;
    assertEquals(1789, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case10() {
    int[] folders = { 845, 335, 950, 324, 345, 558 };
    int workers = 2;
    assertEquals(2130, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case11() {
    int[] folders = { 208, 916, 724, 185, 33, 292, 792, 23, 720 };
    int workers = 1;
    assertEquals(3893, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case12() {
    int[] folders = { 961, 37, 126, 508, 247, 572, 286 };
    int workers = 3;
    assertEquals(961, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case13() {
    int[] folders = { 496, 477, 832, 670, 367, 231, 36, 741, 648, 259, 773, 557, 784 };
    int workers = 5;
    assertEquals(1680, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case14() {
    int[] folders = { 962, 400, 598, 497, 873, 671, 465, 372, 922, 965, 645 };
    int workers = 5;
    assertEquals(1759, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case15() {
    int[] folders = { 646, 321, 347, 684, 273, 718, 429, 842, 559, 893, 717, 971 };
    int workers = 2;
    assertEquals(3982, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case16() {
    int[] folders = { 101, 653, 661, 310, 977 };
    int workers = 5;
    assertEquals(977, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case17() {
    int[] folders = { 669, 331 };
    int workers = 1;
    assertEquals(1000, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case18() {
    int[] folders = { 64, 498, 364, 970, 901, 352, 289, 76, 67, 805, 471, 787, 983, 649 };
    int workers = 8;
    assertEquals(1253, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case19() {
    int[] folders = { 613, 723, 680, 518, 727, 60, 495, 322, 707, 94, 582, 755, 410, 340 };
    int workers = 7;
    assertEquals(1336, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case20() {
    int[] folders = { 759, 746, 460, 92, 283, 739, 502, 501, 980, 86, 212, 276, 306, 571, 940 };
    int workers = 8;
    assertEquals(1206, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case21() {
    int[] folders = { 30, 142, 706, 67, 303, 474, 930, 959, 325, 14, 995, 103, 113, 433, 564 };
    int workers = 8;
    assertEquals(995, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case22() {
    int[] folders = { 320, 543, 187, 87, 710, 653, 333, 135, 674, 54, 739, 528, 930, 807, 503 };
    int workers = 8;
    assertEquals(1267, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case23() {
    int[] folders = { 261, 575, 597, 217, 623, 620, 11, 946, 912, 575, 8, 728, 244, 248, 802 };
    int workers = 7;
    assertEquals(1311, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case24() {
    int[] folders = { 722, 235, 642, 251, 105, 860, 532, 980, 483, 256, 226, 256, 799, 761, 200 };
    int workers = 9;
    assertEquals(980, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case25() {
    int[] folders = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    int workers = 3;
    assertEquals(170, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case26() {
    int[] folders = { 1000, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int workers = 4;
    assertEquals(1000, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case27() {
    int[] folders = { 100, 1, 1, 1, 1 };
    int workers = 5;
    assertEquals(100, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case28() {
    int[] folders = { 1, 1, 1, 1, 1, 1, 1, 1000 };
    int workers = 3;
    assertEquals(1000, fairworkload.getMostWork(folders, workers));
  }

  @Test
  public void case29() {
    int[] folders = { 950, 650, 250, 250, 350, 100, 650, 150, 150, 700, 200, 170, 320, 100 };
    int workers = 7;
    assertEquals(950, fairworkload.getMostWork(folders, workers));
  }

}
