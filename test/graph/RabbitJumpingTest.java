package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class RabbitJumpingTest {
  RabbitJumping rabbitjumping = new RabbitJumping();

  @Test
  public void case1() {
    int[] holes = { 1, 2 };
    int largeJump = 3;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case2() {
    int[] holes = { 1, 2 };
    int largeJump = 4;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case3() {
    int[] holes = { 2, 3 };
    int largeJump = 3;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case4() {
    int[] holes = { 2, 17, 21, 36, 40, 55, 59, 74 };
    int largeJump = 19;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case5() {
    int[] holes = { 187640193, 187640493, 187640738, 187640845, 564588641, 564588679, 564588696, 564588907, 605671187, 605671278, 605671288, 605671386, 755723729, 755723774, 755723880, 755723920, 795077469, 795077625, 795077851, 795078039, 945654724, 945654815, 945655107, 945655323 };
    int largeJump = 475;
    assertEquals(9, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case6() {
    int[] holes = { 1, 999999997, 999999999, 1000000000 };
    int largeJump = 999999999;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case7() {
    int[] holes = { 4, 5, 6, 10 };
    int largeJump = 7;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case8() {
    int[] holes = { 5, 17, 27, 35, 37, 63, 83, 88, 182, 188, 207, 219, 359, 415, 435, 464, 479, 528, 532, 545, 584, 598, 610, 699, 723, 754, 757, 814, 854, 855, 867, 877, 894, 916, 958, 962, 995, 1001, 1022, 1038, 1084, 1109, 1152, 1275, 1309, 1355, 1449, 1489 };
    int largeJump = 155;
    assertEquals(13, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case9() {
    int[] holes = { 101557142, 210995878, 245344736, 257981537, 314968406, 363946193, 424279117, 435779304, 441820162, 498117144, 507089544, 553226276, 612496883, 675096026, 730940846, 819627580, 861535050, 862716271 };
    int largeJump = 123866101;
    assertEquals(9, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case10() {
    int[] holes = { 42322030, 50689348, 62518772, 68545993, 68562915, 69311612, 73663987, 82200888, 89600784, 196140907, 235809979, 242215865, 245031799, 259448202, 338202925, 362731317, 366327426, 430063787, 444000896, 469136442, 560736182, 594081463, 606232384, 659225445, 679971524, 729074017, 730075522, 762365078, 777064516, 907741546 };
    int largeJump = 167415737;
    assertEquals(9, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case11() {
    int[] holes = { 6387726, 17303810, 22055866, 35095444, 63260646, 68486216, 71027652, 92164844, 105469719, 114440949, 234916673, 330477752, 366145474, 380509385, 427540989, 466039800, 506534079, 530291784, 573153165, 666547093, 776169701, 785109057, 790535715, 803643627, 806727054, 852692028, 863654523, 885948044, 893162654, 908614733 };
    int largeJump = 121180295;
    assertEquals(9, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case12() {
    int[] holes = { 27938412, 31359201, 39985470, 262364087, 280050551, 333490036, 371051612, 432183173, 523771278, 549737536, 601376604, 603638993, 720197052, 765925838, 814177759, 964283791 };
    int largeJump = 233658225;
    assertEquals(9, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case13() {
    int[] holes = { 35818794, 35849307, 88865719, 273137293, 306696654, 333581373, 424700999, 475514616, 566338703, 620266935, 627602674, 833620719, 854038849, 993018087 };
    int largeJump = 217685129;
    assertEquals(7, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case14() {
    int[] holes = { 184726157, 333984400, 470651220, 473392292, 508485438, 630537246, 676771431, 702867259, 798565328, 950042774 };
    int largeJump = 199328509;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case15() {
    int[] holes = { 1, 2 };
    int largeJump = 3;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case16() {
    int[] holes = { 1, 2 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case17() {
    int[] holes = { 1, 3 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case18() {
    int[] holes = { 1, 3 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case19() {
    int[] holes = { 2, 3 };
    int largeJump = 3;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case20() {
    int[] holes = { 2, 3 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case21() {
    int[] holes = { 1, 4 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case22() {
    int[] holes = { 1, 4 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case23() {
    int[] holes = { 2, 4 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case24() {
    int[] holes = { 2, 4 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case25() {
    int[] holes = { 3, 4 };
    int largeJump = 3;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case26() {
    int[] holes = { 3, 4 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case27() {
    int[] holes = { 1, 2, 3, 4 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case28() {
    int[] holes = { 1, 2, 3, 4 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case29() {
    int[] holes = { 1, 5 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case30() {
    int[] holes = { 1, 5 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case31() {
    int[] holes = { 2, 5 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case32() {
    int[] holes = { 2, 5 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case33() {
    int[] holes = { 3, 5 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case34() {
    int[] holes = { 3, 5 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case35() {
    int[] holes = { 1, 2, 3, 5 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case36() {
    int[] holes = { 1, 2, 3, 5 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case37() {
    int[] holes = { 4, 5 };
    int largeJump = 3;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case38() {
    int[] holes = { 4, 5 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case39() {
    int[] holes = { 1, 2, 4, 5 };
    int largeJump = 3;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case40() {
    int[] holes = { 1, 2, 4, 5 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case41() {
    int[] holes = { 1, 3, 4, 5 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case42() {
    int[] holes = { 1, 3, 4, 5 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case43() {
    int[] holes = { 2, 3, 4, 5 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case44() {
    int[] holes = { 2, 3, 4, 5 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case45() {
    int[] holes = { 1, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case46() {
    int[] holes = { 1, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case47() {
    int[] holes = { 2, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case48() {
    int[] holes = { 2, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case49() {
    int[] holes = { 3, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case50() {
    int[] holes = { 3, 6 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case51() {
    int[] holes = { 1, 2, 3, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case52() {
    int[] holes = { 1, 2, 3, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case53() {
    int[] holes = { 4, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case54() {
    int[] holes = { 4, 6 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case55() {
    int[] holes = { 1, 2, 4, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case56() {
    int[] holes = { 1, 2, 4, 6 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case57() {
    int[] holes = { 1, 3, 4, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case58() {
    int[] holes = { 1, 3, 4, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case59() {
    int[] holes = { 2, 3, 4, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case60() {
    int[] holes = { 2, 3, 4, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case61() {
    int[] holes = { 5, 6 };
    int largeJump = 3;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case62() {
    int[] holes = { 5, 6 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case63() {
    int[] holes = { 1, 2, 5, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case64() {
    int[] holes = { 1, 2, 5, 6 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case65() {
    int[] holes = { 1, 3, 5, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case66() {
    int[] holes = { 1, 3, 5, 6 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case67() {
    int[] holes = { 2, 3, 5, 6 };
    int largeJump = 3;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case68() {
    int[] holes = { 2, 3, 5, 6 };
    int largeJump = 5;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case69() {
    int[] holes = { 1, 4, 5, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case70() {
    int[] holes = { 1, 4, 5, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case71() {
    int[] holes = { 2, 4, 5, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case72() {
    int[] holes = { 2, 4, 5, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case73() {
    int[] holes = { 3, 4, 5, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case74() {
    int[] holes = { 3, 4, 5, 6 };
    int largeJump = 5;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case75() {
    int[] holes = { 1, 2, 3, 4, 5, 6 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case76() {
    int[] holes = { 1, 2, 3, 4, 5, 6 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case77() {
    int[] holes = { 1, 269548984, 269548987, 715764586, 715764589, 1000000000 };
    int largeJump = 446215603;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case78() {
    int[] holes = { 1, 280641846, 280641849, 774970313, 774970316, 1000000000 };
    int largeJump = 494328467;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case79() {
    int[] holes = { 1, 246064253, 246064256, 777814905, 777814908, 1000000000 };
    int largeJump = 531750651;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case80() {
    int[] holes = { 1, 214504433, 214504436, 714906604, 714906608, 1000000000 };
    int largeJump = 500402173;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case81() {
    int[] holes = { 1, 278239977, 278239980, 726301747, 726301751, 1000000000 };
    int largeJump = 448061771;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case82() {
    int[] holes = { 1, 213136568, 213136571, 727998473, 727998477, 1000000000 };
    int largeJump = 514861905;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case83() {
    int[] holes = { 1, 269540316, 269540319, 742691264, 742691268, 1000000000 };
    int largeJump = 473150947;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case84() {
    int[] holes = { 1, 218345561, 218345564, 789861231, 789861236, 1000000000 };
    int largeJump = 571515673;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case85() {
    int[] holes = { 1, 234085591, 234085594, 756251260, 756251265, 1000000000 };
    int largeJump = 522165671;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case86() {
    int[] holes = { 1, 212368595, 212368598, 746012187, 746012192, 1000000000 };
    int largeJump = 533643593;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case87() {
    int[] holes = { 1, 252925375, 252925378, 762720332, 762720337, 1000000000 };
    int largeJump = 509794957;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case88() {
    int[] holes = { 1, 246289309, 246289312, 742179099, 742179104, 1000000000 };
    int largeJump = 495889789;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case89() {
    int[] holes = { 1, 231482673, 231482677, 792426957, 792426960, 1000000000 };
    int largeJump = 560944285;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case90() {
    int[] holes = { 1, 287665297, 287665301, 756420152, 756420155, 1000000000 };
    int largeJump = 468754855;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case91() {
    int[] holes = { 1, 249037436, 249037440, 758051302, 758051305, 1000000000 };
    int largeJump = 509013865;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case92() {
    int[] holes = { 1, 254713204, 254713208, 752742855, 752742858, 1000000000 };
    int largeJump = 498029649;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case93() {
    int[] holes = { 1, 217108799, 217108803, 790835004, 790835008, 1000000000 };
    int largeJump = 573726207;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case94() {
    int[] holes = { 1, 236611362, 236611366, 735683954, 735683958, 1000000000 };
    int largeJump = 499072593;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case95() {
    int[] holes = { 1, 212182688, 212182692, 739970819, 739970823, 1000000000 };
    int largeJump = 527788131;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case96() {
    int[] holes = { 1, 200138074, 200138078, 788202834, 788202838, 1000000000 };
    int largeJump = 588064759;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case97() {
    int[] holes = { 1, 292389414, 292389418, 766836661, 766836665, 1000000000 };
    int largeJump = 474447245;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case98() {
    int[] holes = { 1, 229213476, 229213480, 710420734, 710420739, 1000000000 };
    int largeJump = 481207261;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case99() {
    int[] holes = { 1, 210791476, 210791480, 730200589, 730200594, 1000000000 };
    int largeJump = 519409115;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case100() {
    int[] holes = { 1, 223424219, 223424223, 750289887, 750289892, 1000000000 };
    int largeJump = 526865669;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case101() {
    int[] holes = { 1, 297694499, 297694503, 713997356, 713997361, 1000000000 };
    int largeJump = 416302857;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case102() {
    int[] holes = { 1, 204991451, 204991455, 790622333, 790622338, 1000000000 };
    int largeJump = 585630881;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case103() {
    int[] holes = { 1, 234503675, 234503679, 761894056, 761894061, 1000000000 };
    int largeJump = 527390379;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case104() {
    int[] holes = { 1, 269422535, 269422540, 711235343, 711235346, 1000000000 };
    int largeJump = 441812809;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case105() {
    int[] holes = { 1, 239313357, 239313362, 750698228, 750698231, 1000000000 };
    int largeJump = 511384871;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case106() {
    int[] holes = { 1, 240048503, 240048508, 788558885, 788558888, 1000000000 };
    int largeJump = 548510381;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case107() {
    int[] holes = { 1, 238663599, 238663604, 708456152, 708456155, 1000000000 };
    int largeJump = 469792551;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case108() {
    int[] holes = { 1, 296655485, 296655490, 702788685, 702788688, 1000000000 };
    int largeJump = 406133197;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case109() {
    int[] holes = { 1, 222944597, 222944602, 767861994, 767861998, 1000000000 };
    int largeJump = 544917399;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case110() {
    int[] holes = { 1, 245837907, 245837912, 744234513, 744234517, 1000000000 };
    int largeJump = 498396607;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case111() {
    int[] holes = { 1, 282369864, 282369869, 746930527, 746930531, 1000000000 };
    int largeJump = 464560663;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case112() {
    int[] holes = { 1, 260493858, 260493863, 771817716, 771817720, 1000000000 };
    int largeJump = 511323857;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case113() {
    int[] holes = { 1, 291292614, 291292619, 779621059, 779621063, 1000000000 };
    int largeJump = 488328443;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case114() {
    int[] holes = { 1, 227049521, 227049526, 742974089, 742974093, 1000000000 };
    int largeJump = 515924565;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case115() {
    int[] holes = { 1, 247227191, 247227196, 716031727, 716031732, 1000000000 };
    int largeJump = 468804539;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case116() {
    int[] holes = { 1, 267297000, 267297005, 773039795, 773039800, 1000000000 };
    int largeJump = 505742797;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case117() {
    int[] holes = { 1, 227727687, 227727692, 739765561, 739765566, 1000000000 };
    int largeJump = 512037875;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case118() {
    int[] holes = { 1, 200698240, 200698245, 718364707, 718364712, 1000000000 };
    int largeJump = 517666467;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case119() {
    int[] holes = { 1, 211064484, 211064489, 731614070, 731614075, 1000000000 };
    int largeJump = 520549585;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case120() {
    int[] holes = { 1, 282306378, 282306383, 782624697, 782624702, 1000000000 };
    int largeJump = 500318317;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case121() {
    int[] holes = { 1, 272124758, 272124763, 742280812, 742280817, 1000000000 };
    int largeJump = 470156051;
    assertEquals(5, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case122() {
    int[] holes = { 2, 33037702, 55383456, 62187102, 82622909, 90191383, 110484546, 114086297, 131135442, 172718082, 178866556, 192859301, 235881859, 250547572, 257352377, 258958831, 262324870, 293841206, 353784157, 367668186, 370760531, 394149550, 401183059, 406974623, 439451514, 443965439, 449882237, 491348529, 501105294, 520718274, 540438122, 569416653, 570778748, 596865836, 624342627, 661624493, 694774022, 716422497, 720471711, 732109369, 770935022, 773212031, 779313235, 804553677, 886411581, 920807011, 951791511, 953316863, 995036097, 1000000000 };
    int largeJump = 1000000000;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case123() {
    int[] holes = { 2, 18812852, 34791534, 60388041, 93900346, 94127748, 118373038, 136256202, 193588278, 214212105, 265581938, 268883266, 281143235, 299818373, 324893004, 325310697, 329093773, 350262160, 355469963, 369015313, 374459098, 405132212, 405369162, 446629286, 483231895, 502361469, 502366596, 518365894, 519920593, 525947701, 547413866, 553428783, 571022712, 586902103, 609905036, 653341749, 670562685, 688879360, 725757829, 735683941, 769485446, 795972707, 800739352, 890552897, 917732311, 939358067, 950339365, 955426052, 994951848, 1000000000 };
    int largeJump = 999999999;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case124() {
    int[] holes = { 2, 38660982, 93850834, 129128438, 132933100, 134192942, 156822184, 159016712, 159129769, 180930022, 197986614, 210058351, 270105811, 281375245, 285553500, 297045108, 332806270, 378333806, 379505613, 460150202, 518843994, 556181318, 561195789, 567284946, 582597972, 598263889, 601298886, 603161269, 627265839, 640292030, 642368723, 698340164, 727256678, 758790141, 759829721, 773288704, 787635420, 807041957, 811778682, 824589738, 852096756, 853831978, 882146274, 904269156, 908885377, 918478944, 936866952, 937236271, 982903669, 1000000000 };
    int largeJump = 999999998;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case125() {
    int[] holes = { 2, 17935232, 52553501, 90294213, 166983653, 173329164, 187145968, 218252582, 237275139, 238478848, 240015335, 259113964, 266786714, 281466654, 304242172, 353926654, 380625856, 382360309, 383005891, 421689945, 433172914, 451963411, 464729773, 517966705, 522610590, 529323851, 533625564, 536680198, 557411827, 568790802, 596374112, 600524034, 658166767, 663449647, 670123140, 677365254, 725250168, 770157709, 788647223, 792709906, 794265614, 834057931, 881174508, 887372421, 948371515, 966849159, 968533389, 995232674, 996084023, 1000000000 };
    int largeJump = 999999997;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case126() {
    int[] holes = { 2, 14353009, 17166397, 27948626, 64572326, 68282426, 88139480, 90578024, 101055272, 107082216, 131801072, 134833292, 161936530, 175154655, 191947995, 213360976, 236810766, 281682908, 338509170, 353776782, 398322525, 422387297, 432529104, 518264207, 530623635, 549675613, 597215765, 620590501, 627752336, 636668312, 640151169, 679960919, 689230501, 692926812, 693526458, 712753614, 784488105, 793435374, 813086447, 844397995, 847903784, 860189972, 885388687, 891071242, 896865209, 911076908, 915779466, 924819530, 994784069, 1000000000 };
    int largeJump = 999999996;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case127() {
    int[] holes = { 2, 8748334, 44873213, 59971370, 77083678, 96645859, 191625205, 193929262, 222093412, 228853675, 279649465, 292601853, 366920772, 369980540, 377317082, 395651631, 408926311, 410359888, 485030492, 503529271, 513477168, 520284056, 535091900, 537507135, 544203274, 554243893, 575306252, 608551917, 618691566, 651475977, 657198276, 668575427, 670635509, 675735790, 677946505, 680805776, 781748353, 802397565, 808369375, 842823930, 894458084, 933278906, 954463313, 955187852, 956019460, 965691001, 968437616, 975106271, 976288821, 1000000000 };
    int largeJump = 999999995;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case128() {
    int[] holes = { 2, 49781765, 63636843, 69520176, 110757227, 119690979, 140439013, 159689854, 209240797, 213290853, 244170842, 248653781, 276960614, 296096607, 308120510, 329741857, 335486286, 359918246, 383674496, 438352917, 441044158, 459875146, 484396420, 489917278, 492141736, 520748762, 569612428, 572125507, 596524315, 652784432, 711420795, 719555326, 720819676, 725709887, 733183314, 739225179, 749494848, 790567969, 798736164, 833784390, 834789780, 840666314, 844763255, 847616981, 875260543, 893728392, 986791426, 987202872, 997892900, 1000000000 };
    int largeJump = 999999994;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case129() {
    int[] holes = { 2, 1651408, 1962746, 46119103, 63990112, 105801924, 114017356, 121543200, 139861923, 154698849, 169914269, 180455731, 185003918, 203747674, 227495839, 253579230, 278480486, 290705057, 301783542, 334102572, 335335797, 405466314, 406232647, 414725920, 414963301, 420679806, 431007871, 455123678, 463566926, 466393534, 474098447, 482268720, 494891034, 519588530, 596906834, 602445771, 674211103, 677133853, 678427683, 686568046, 749431812, 751853282, 786336307, 794037470, 888500990, 901133053, 914029377, 954770025, 973678186, 1000000000 };
    int largeJump = 999999993;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case130() {
    int[] holes = { 2, 9217681, 17348495, 24113068, 50677650, 59214479, 74904489, 85641419, 92303589, 111137621, 112358047, 160790215, 181936592, 201559666, 207407053, 209106141, 215554470, 224256412, 231293362, 309998936, 366499445, 367671899, 419712895, 448355122, 461300819, 486312884, 500423437, 511319852, 559486730, 586019190, 589666790, 604005315, 606016715, 645042832, 705152140, 751588544, 758315838, 758665436, 760254532, 773508862, 790511965, 795210294, 815749780, 872162786, 891642441, 948334571, 975118558, 990794023, 998734896, 1000000000 };
    int largeJump = 999999992;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case131() {
    int[] holes = { 2, 2887068, 85457794, 96469372, 103957051, 122127498, 129341880, 129836621, 154115298, 168968956, 202249582, 209830614, 217694558, 227891619, 256924540, 303601649, 341158906, 375614634, 386112873, 393099433, 413284075, 419476357, 478074387, 492317612, 502298193, 507127463, 511284255, 535335391, 538655462, 549146533, 595432615, 613219877, 629174044, 640305302, 710860081, 721815633, 733230989, 745891409, 749589663, 774541278, 774708527, 790266193, 796707547, 800606044, 889736659, 894585657, 901606842, 939972575, 990811831, 1000000000 };
    int largeJump = 999999991;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case132() {
    int[] holes = { 2, 923977, 29945108, 33128161, 34233230, 67037231, 85049873, 111766015, 115049766, 141193575, 176274057, 180968486, 190559787, 233696479, 278899151, 279105522, 303665218, 345308276, 353471942, 358674891, 370435770, 433906371, 437989279, 511344827, 520261890, 525573055, 542206331, 559326458, 568598614, 581390988, 601287232, 710220861, 715663677, 725116443, 742898553, 751148162, 799322768, 816799897, 856234253, 912996063, 915542469, 918214622, 927637425, 939218269, 940348184, 941348851, 968733276, 973214226, 976525007, 1000000000 };
    int largeJump = 999999990;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case133() {
    int[] holes = { 2, 12634077, 27296354, 31667142, 59405027, 73401029, 100861776, 105514150, 120612639, 136567882, 145600517, 175294342, 233669268, 246868896, 250098680, 286199829, 295201629, 314150651, 344522006, 345820018, 356870519, 359465995, 381426052, 411931944, 413967849, 490095650, 516638363, 528817523, 540075053, 575306929, 622935541, 656525782, 656716352, 657315004, 666165033, 704004523, 715418392, 737966680, 743391842, 771673879, 775985163, 788367256, 825090028, 829488170, 879670887, 885710917, 899374912, 910886514, 932432290, 1000000000 };
    int largeJump = 999999989;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case134() {
    int[] holes = { 2, 3864849, 26459466, 56139741, 66677344, 68854558, 96705496, 119040502, 139306330, 144717136, 185831892, 204316168, 207864833, 221525398, 229933035, 249798835, 292721429, 294330301, 355532379, 372354476, 426246395, 436399490, 549269509, 549986418, 563901312, 574956416, 581622476, 591167082, 606806541, 669350031, 670725253, 680907246, 688842402, 758821391, 765182018, 798941123, 803524274, 804532735, 826098833, 877407578, 880383587, 888003571, 907867819, 932285902, 960611386, 961475214, 980640900, 991317783, 999894381, 1000000000 };
    int largeJump = 999999988;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case135() {
    int[] holes = { 2, 19475, 19136922, 19156395, 50705048, 50724521, 52027692, 52047165, 122007268, 122026741, 134174726, 134194199, 209843484, 209862957, 278891302, 278910775, 308743464, 308762937, 385262370, 385281843, 397904816, 397924289, 424216904, 424236377, 440252800, 440272273, 499372384, 499391857, 544793860, 544813333, 581523934, 581543407, 641285352, 641304825, 709495486, 709514959, 782036960, 782056433, 806813102, 806832575, 818876430, 818895903, 844766132, 844785605, 850245746, 850265219, 902863316, 902882789, 999980526, 999999999 };
    int largeJump = 19475;
    assertEquals(51, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case136() {
    int[] holes = { 2, 19475, 19136922, 19156395, 50705048, 50724521, 52027693, 52047166, 122007269, 122026742, 134174726, 134194199, 209843485, 209862958, 278891303, 278910776, 308743465, 308762938, 385262371, 385281844, 397904816, 397924289, 424216904, 424236377, 440252801, 440272274, 499372384, 499391857, 544793861, 544813334, 581523934, 581543407, 641285353, 641304826, 709495487, 709514960, 782036960, 782056433, 806813103, 806832576, 818876430, 818895903, 844766132, 844785605, 850245747, 850265220, 902863317, 902882790, 999980526, 999999999 };
    int largeJump = 19475;
    assertEquals(37, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case137() {
    int[] holes = { 2, 19475, 19136923, 19156396, 50705049, 50724522, 52027693, 52047166, 122007269, 122026742, 134174726, 134194199, 209843485, 209862958, 278891304, 278910777, 308743466, 308762939, 385262372, 385281845, 397904817, 397924290, 424216904, 424236377, 440252801, 440272274, 499372385, 499391858, 544793861, 544813334, 581523934, 581543407, 641285353, 641304826, 709495487, 709514960, 782036961, 782056434, 806813103, 806832576, 818876430, 818895903, 844766132, 844785605, 850245747, 850265220, 902863318, 902882791, 999980526, 999999999 };
    int largeJump = 19475;
    assertEquals(39, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case138() {
    int[] holes = { 2, 19475, 19136924, 19156397, 50705049, 50724522, 52027693, 52047166, 122007269, 122026742, 134174726, 134194199, 209843486, 209862959, 278891304, 278910777, 308743466, 308762939, 385262372, 385281845, 397904818, 397924291, 424216904, 424236377, 440252802, 440272275, 499372386, 499391859, 544793861, 544813334, 581523934, 581543407, 641285353, 641304826, 709495488, 709514961, 782036961, 782056434, 806813104, 806832577, 818876430, 818895903, 844766132, 844785605, 850245748, 850265221, 902863319, 902882792, 999980526, 999999999 };
    int largeJump = 19475;
    assertEquals(41, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case139() {
    int[] holes = { 3, 19476, 19136925, 19156398, 50705050, 50724523, 52027693, 52047166, 122007269, 122026742, 134174726, 134194199, 209843486, 209862959, 278891304, 278910777, 308743467, 308762940, 385262372, 385281845, 397904818, 397924291, 424216904, 424236377, 440252802, 440272275, 499372387, 499391860, 544793861, 544813334, 581523935, 581543408, 641285354, 641304827, 709495489, 709514962, 782036961, 782056434, 806813105, 806832578, 818876430, 818895903, 844766133, 844785606, 850245748, 850265221, 902863319, 902882792, 999980526, 999999999 };
    int largeJump = 19475;
    assertEquals(37, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case140() {
    int[] holes = { 3, 19476, 19136925, 19156398, 50705050, 50724523, 52027693, 52047166, 122007270, 122026743, 134174727, 134194200, 209843486, 209862959, 278891305, 278910778, 308743467, 308762940, 385262372, 385281845, 397904818, 397924291, 424216904, 424236377, 440252802, 440272275, 499372388, 499391861, 544793862, 544813335, 581523936, 581543409, 641285354, 641304827, 709495490, 709514963, 782036962, 782056435, 806813106, 806832579, 818876431, 818895904, 844766134, 844785607, 850245748, 850265221, 902863319, 902882792, 999980526, 999999999 };
    int largeJump = 19475;
    assertEquals(39, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case141() {
    int[] holes = { 34792622, 34793569, 60388039, 60388070, 118373036, 118374099, 193588276, 193589248, 214212103, 214212222, 265581936, 265582513, 270106899, 270107064, 281144323, 281145231, 299818371, 299818538, 324894092, 324894576, 325311785, 325311860, 405370250, 405370898, 483231893, 483232898, 586903191, 586903332, 653341747, 653342207, 670563773, 670564394, 688879358, 688880095, 735685029, 735685820, 769486534, 769486997, 800739350, 800739418, 917732309, 917733246, 939358065, 939358207, 955427140, 955427590, 994952936, 994953868 };
    int largeJump = 1093;
    assertEquals(25, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case142() {
    int[] holes = { 38660980, 38661841, 93850832, 93851417, 134192940, 134193639, 159130943, 159131033, 210059525, 210060664, 332806268, 332807070, 378334980, 378335106, 379506787, 379506973, 518843992, 518844157, 567286120, 567287076, 582597970, 582598447, 603161267, 603161751, 640293204, 640294214, 758790139, 758790658, 773289878, 773290161, 787635418, 787636309, 852097930, 852098892, 904270330, 904270544, 918478942, 918478999, 936868126, 936868529, 982903667, 982903813 };
    int largeJump = 1179;
    assertEquals(21, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case143() {
    int[] holes = { 17021348, 17171220, 17935230, 19144628, 45604875, 52553499, 90294211, 100139628, 123205657, 142095025, 167455469, 181211271, 185855156, 220656393, 255210367, 263768600, 275813362, 281466652, 282158873, 283835067, 295975677, 319781051, 333367706, 338509168, 347308557, 348845044, 352046582, 361500706, 378613392, 385910783, 405398544, 422387295, 433172912, 433402275, 433427907, 466672031, 502789117, 528780163, 588673592, 662092506, 695171219, 719480718, 788977723, 802099272, 836389441, 861252758, 962496761, 972062906 };
    int largeJump = 554414857;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case144() {
    int[] holes = { 28279844, 28553968, 68282424, 68464208, 101386490, 101711191, 107082214, 107085610, 132132290, 132447740, 281682906, 281717598, 485361710, 485496380, 544534492, 544714793, 597546983, 597860746, 618691564, 618791172, 627752334, 628071304, 640482387, 640721066, 670966727, 670987094, 676067008, 676151624, 678277723, 678500986, 680805774, 680921426, 692926810, 693086272, 713084832, 713190178, 784488103, 784788783, 848235002, 848564497, 860189970, 860216313, 896865207, 897160632, 915779464, 915933766, 925150748, 925202137, 954463311, 954769905 };
    int largeJump = 331223;
    assertEquals(25, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case145() {
    int[] holes = { 7233584, 7241933, 25338518, 25346867, 30307246, 30315595, 45074038, 45082387, 158111552, 158119901, 318491466, 318499815, 346023978, 346032327, 348722098, 348730447, 409692216, 409700565, 470293840, 470302189, 482552630, 482560979, 518345590, 518353939, 604043854, 604052203, 607380530, 607388879, 637555220, 637563569, 645898482, 645906831, 710312550, 710320899, 740547806, 740556155, 742078434, 742086783, 784779024, 784787373, 785902296, 785910645, 822824644, 822832993, 898418430, 898426779, 919039078, 919047427, 972095864, 972104213 };
    int largeJump = 8351;
    assertEquals(51, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case146() {
    int[] holes = { 50313856, 50319479, 94705460, 94711083, 111602102, 111607725, 193444752, 193450375, 208945072, 208950695, 224525440, 224531063, 252185146, 252190769, 293566790, 293572413, 325915784, 325921407, 347109814, 347115437, 365985110, 365990733, 428474732, 428480355, 511838058, 511843681, 551462044, 551467667, 553302230, 553307853, 570255264, 570260887, 657794544, 657800167, 662979466, 662985089, 679047670, 679053293, 717721906, 717727529, 738741986, 738747609, 889111146, 889116769, 901182574, 901188197, 921910096, 921915719, 933485784, 933491407 };
    int largeJump = 5625;
    assertEquals(51, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case147() {
    int[] holes = { 62642776, 62643613, 67723510, 67724347, 72794360, 72795197, 81541470, 81542307, 92427208, 92428045, 94800302, 94801139, 125494600, 125495437, 209239980, 209240817, 268879442, 268880279, 275824010, 275824847, 276341670, 276342507, 297942944, 297943781, 323914802, 323915639, 383846678, 383847515, 390391224, 390392061, 514084740, 514085577, 713540316, 713541153, 743853860, 743854697, 763214330, 763215167, 819550284, 819551121, 823594330, 823595167, 834167436, 834168273, 884500164, 884501001, 885726880, 885727717, 890746698, 890747535 };
    int largeJump = 839;
    assertEquals(51, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case148() {
    int[] holes = { 125826848, 125835837, 242717274, 242726263, 242897020, 242906009, 249052196, 249061185, 257934192, 257943181, 323219658, 323228647, 329772480, 329781469, 385319646, 385328635, 451880912, 451889901, 466735826, 466744815, 499840910, 499849899, 546736498, 546745487, 548504930, 548513919, 613361082, 613370071, 663372664, 663381653, 672986186, 672995175, 703645498, 703654487, 723436808, 723445797, 773131926, 773140915, 860273022, 860282011, 888507964, 888516953, 914497020, 914506009, 926481740, 926490729, 962257348, 962266337, 973240654, 973249643 };
    int largeJump = 8991;
    assertEquals(51, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case149() {
    int[] holes = { 24914158, 24918459, 26840560, 26844861, 65355490, 65359791, 81447690, 81451991, 158132900, 158137201, 184727884, 184732185, 191248844, 191253145, 211810064, 211814365, 268297810, 268302111, 364161362, 364165663, 474674496, 474678797, 561500464, 561504765, 572679140, 572683441, 587644770, 587649071, 596972988, 596977289, 623092660, 623096961, 634655228, 634659529, 651564438, 651568739, 684460582, 684464883, 712647702, 712652003, 725237392, 725241693, 781849344, 781853645, 838878150, 838882451, 950425078, 950429379, 961810842, 961815143 };
    int largeJump = 4303;
    assertEquals(51, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case150() {
    int[] holes = { 2, 1525386, 1525389, 1525473, 1525562, 1525646, 1525735, 1525819, 1525908, 1525992, 1526081, 1526165, 1526254, 1526338, 1526427, 1526511, 1526600, 1526684, 1526773, 1526857, 1526946, 1527030, 1527119, 1527203, 1527292, 1527376, 1527465, 3050773, 3050863, 3050946, 3051036, 3051119, 3051209, 3051292, 3051382, 3051465, 3051555, 3051638, 3051728, 3051811, 3051901, 3051984, 3052074, 3052157, 3052247, 3052330, 3052420, 3052503, 3052593, 4577977 };
    int largeJump = 1525387;
    assertEquals(23, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case151() {
    int[] holes = { 2, 4388660, 4388663, 4388749, 4388840, 4388926, 4389017, 4389103, 4389194, 4389280, 4389371, 4389457, 4389548, 4389634, 4389725, 4389811, 4389902, 4389988, 4390079, 4390165, 4390256, 4390342, 4390433, 4390519, 4390610, 4390696, 4390787, 8777321, 8777413, 8777498, 8777590, 8777675, 8777767, 8777852, 8777944, 8778029, 8778121, 8778206, 8778298, 8778383, 8778475, 8778560, 8778652, 8778737, 8778829, 8778914, 8779006, 8779091, 8779183, 13167841 };
    int largeJump = 4388661;
    assertEquals(23, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case152() {
    int[] holes = { 2, 722456, 722459, 722477, 722500, 722518, 722541, 722559, 722582, 722600, 722623, 722641, 722664, 722682, 722705, 722723, 722746, 722764, 722787, 722805, 722828, 722846, 722869, 722887, 722910, 722928, 722951, 1444913, 1444937, 1444954, 1444978, 1444995, 1445019, 1445036, 1445060, 1445077, 1445101, 1445118, 1445142, 1445159, 1445183, 1445200, 1445224, 1445241, 1445265, 1445282, 1445306, 1445323, 1445347, 2167801 };
    int largeJump = 722457;
    assertEquals(23, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case153() {
    int[] holes = { 2, 2073708, 2073711, 2073801, 2073896, 2073986, 2074081, 2074171, 2074266, 2074356, 2074451, 2074541, 2074636, 2074726, 2074821, 2074911, 2075006, 2075096, 2075191, 2075281, 2075376, 2075466, 2075561, 2075651, 2075746, 2075836, 2075931, 4147417, 4147513, 4147602, 4147698, 4147787, 4147883, 4147972, 4148068, 4148157, 4148253, 4148342, 4148438, 4148527, 4148623, 4148712, 4148808, 4148897, 4148993, 4149082, 4149178, 4149267, 4149363, 6223069 };
    int largeJump = 2073709;
    assertEquals(23, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case154() {
    int[] holes = { 2, 2088322, 2088325, 2088421, 2088522, 2088618, 2088719, 2088815, 2088916, 2089012, 2089113, 2089209, 2089310, 2089406, 2089507, 2089603, 2089704, 2089800, 2089901, 2089997, 2090098, 2090194, 2090295, 2090391, 2090492, 2090588, 2090689, 4176645, 4176747, 4176842, 4176944, 4177039, 4177141, 4177236, 4177338, 4177433, 4177535, 4177630, 4177732, 4177827, 4177929, 4178024, 4178126, 4178221, 4178323, 4178418, 4178520, 4178615, 4178717, 6267037 };
    int largeJump = 2088323;
    assertEquals(23, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case155() {
    int[] holes = { 187640193, 187640493, 187640738, 187640845, 564588641, 564588679, 564588696, 564588907, 605671187, 605671278, 605671288, 605671386, 755723729, 755723774, 755723880, 755723920, 795077469, 795077625, 795077851, 795078039, 945654724, 945654815, 945655107, 945655323 };
    int largeJump = 475;
    assertEquals(9, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case156() {
    int[] holes = { 1, 2 };
    int largeJump = 3;
    assertEquals(1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case157() {
    int[] holes = { 187640193, 187640493, 187640738, 187640845, 564588641, 564588679, 564588696, 564588907, 605671187, 605671278, 605671288, 605671386, 755723729, 755723774, 755723880, 755723920, 795077469, 795077625, 795077851, 795078039, 945654724, 945654815, 945655107, 945655323 };
    int largeJump = 475988899;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case158() {
    int[] holes = { 2, 3 };
    int largeJump = 3;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case159() {
    int[] holes = { 1, 4, 7, 10 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case160() {
    int[] holes = { 1, 2, 10, 11 };
    int largeJump = 1000;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case161() {
    int[] holes = { 1, 1000000000 };
    int largeJump = 5;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case162() {
    int[] holes = { 2, 4 };
    int largeJump = 3;
    assertEquals(-1, rabbitjumping.getMinimum(holes, largeJump));
  }

  @Test
  public void case163() {
    int[] holes = { 3, 5, 8, 19, 27, 36, 101, 105, 109, 131, 240, 245, 246, 247, 248, 250, 251, 252 };
    int largeJump = 101;
    assertEquals(3, rabbitjumping.getMinimum(holes, largeJump));
  }

}
