package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RationalizationTest {
  Rationalization rationalization = new Rationalization();

  @Test
  public void case1() {
    int[] weights = { 3, 2, 1, 1 };
    String[] scores = { "6354", "5532", "4626" };
    int desired = 0;
    assertEquals(0, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case2() {
    int[] weights = { 3, 2, 1, 1 };
    String[] scores = { "6354", "5532", "4626" };
    int desired = 2;
    assertEquals(1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case3() {
    int[] weights = { 3, 2, 1, 1 };
    String[] scores = { "6354", "5532", "4626" };
    int desired = 1;
    assertEquals(2, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case4() {
    int[] weights = { 2, 3, 2, 1, 5 };
    String[] scores = { "12345", "54321", "33333", "32415", "15243", "43215", "51234", "14532" };
    int desired = 7;
    assertEquals(3, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case5() {
    int[] weights = { 3, 2, 1 };
    String[] scores = { "555", "333" };
    int desired = 1;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case6() {
    int[] weights = { 1, 2, 3, 3 };
    String[] scores = { "9234", "1334" };
    int desired = 1;
    assertEquals(3, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case7() {
    int[] weights = { 8, 2 };
    String[] scores = { "55", "92" };
    int desired = 0;
    assertEquals(6, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case8() {
    int[] weights = { 1, 1 };
    String[] scores = { "11", "11" };
    int desired = 1;
    assertEquals(1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case9() {
    int[] weights = { 4, 8, 7, 7, 4, 2 };
    String[] scores = { "921961", "896416", "151826", "519269", "374165", "627436", "245262", "974685", "374456", "557483" };
    int desired = 7;
    assertEquals(0, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case10() {
    int[] weights = { 2, 8, 7, 3, 6, 5, 2, 4, 7, 2 };
    String[] scores = { "9197287893", "9492555365", "3459972761", "4886112198", "5963616776", "6325897129", "3248793133", "7984474438", "4518544769", "1592681682" };
    int desired = 5;
    assertEquals(17, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case11() {
    int[] weights = { 5, 5, 9, 9, 2, 2, 2, 7, 4, 4 };
    String[] scores = { "3446959682", "6176565698", "2875421926", "4627263127", "3432379859", "9362688749", "6789893163", "6657516458", "4158845661", "2661862316" };
    int desired = 1;
    assertEquals(1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case12() {
    int[] weights = { 5, 6, 1, 5, 5, 4, 8, 2, 5, 5 };
    String[] scores = { "7599175216", "3787782992", "2776166974", "7132523697", "5539346185", "8295358999", "2765989779", "1563646481", "4872499562", "8634217338" };
    int desired = 9;
    assertEquals(19, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case13() {
    int[] weights = { 7, 2, 3, 9, 7, 8, 1, 6, 5, 8 };
    String[] scores = { "3139559725", "3482838459", "1652354923", "3179724198", "6477827997", "9897826118", "2579494275", "3729489369" };
    int desired = 4;
    assertEquals(0, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case14() {
    int[] weights = { 3, 8, 8, 7, 5, 1, 3 };
    String[] scores = { "6691573", "9479887", "9761697", "1773382", "5435969", "6915663", "6395814", "7376514", "3568592", "2557215" };
    int desired = 3;
    assertEquals(14, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case15() {
    int[] weights = { 7, 6, 6, 4, 8 };
    String[] scores = { "14825", "47164", "25513", "91759", "21837", "48838" };
    int desired = 2;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case16() {
    int[] weights = { 3, 1, 3, 1 };
    String[] scores = { "5679", "9923", "6113", "9733", "8172" };
    int desired = 0;
    assertEquals(0, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case17() {
    int[] weights = { 9, 2, 4, 4, 7, 1, 3, 9, 7, 2 };
    String[] scores = { "3855253319", "6549449728", "6542579932", "9715215356", "7153563354", "3813148624", "5896952988" };
    int desired = 5;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case18() {
    int[] weights = { 8, 3, 7 };
    String[] scores = { "563", "767", "768", "969", "696", "795" };
    int desired = 0;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case19() {
    int[] weights = { 6, 7, 3, 7 };
    String[] scores = { "6997", "5412", "1197", "4689", "2846" };
    int desired = 3;
    assertEquals(4, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case20() {
    int[] weights = { 5, 7, 1, 8, 6, 7, 1, 5 };
    String[] scores = { "48567251", "43778955", "54559915", "22345261", "36878627", "87166827", "39861672", "34314388", "29446616", "56893958" };
    int desired = 8;
    assertEquals(12, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case21() {
    int[] weights = { 5, 2 };
    String[] scores = { "45", "33", "96", "92", "82", "78", "24", "44", "47", "28" };
    int desired = 3;
    assertEquals(2, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case22() {
    int[] weights = { 8, 1, 4, 8, 6, 4, 2, 5 };
    String[] scores = { "46142991", "83822815" };
    int desired = 0;
    assertEquals(6, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case23() {
    int[] weights = { 2, 3, 3, 5, 1, 7 };
    String[] scores = { "483392", "779687", "295938" };
    int desired = 1;
    assertEquals(1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case24() {
    int[] weights = { 6, 8, 5, 3, 4, 8, 9, 8 };
    String[] scores = { "98629181", "18246861", "84513971", "55995526", "52326245", "17717737", "71512388" };
    int desired = 4;
    assertEquals(30, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case25() {
    int[] weights = { 9, 5 };
    String[] scores = { "75", "43", "96" };
    int desired = 0;
    assertEquals(4, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case26() {
    int[] weights = { 2, 8, 3, 9, 2, 4, 9, 2, 4, 7 };
    String[] scores = { "1471889894", "5913874159" };
    int desired = 0;
    assertEquals(1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case27() {
    int[] weights = { 3, 1, 1, 3, 9, 5, 6 };
    String[] scores = { "9495754", "8523868", "7251812" };
    int desired = 2;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case28() {
    int[] weights = { 1, 5, 5, 8, 5, 1, 4, 3, 5 };
    String[] scores = { "442957226", "743331799", "742347134", "743529394", "459596863", "693686254", "125313322", "565913537", "452492657", "693542823" };
    int desired = 0;
    assertEquals(9, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case29() {
    int[] weights = { 3, 4, 4, 9, 2, 1, 2, 8, 2 };
    String[] scores = { "852582151", "117463368" };
    int desired = 1;
    assertEquals(1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case30() {
    int[] weights = { 4, 5 };
    String[] scores = { "67", "97", "11", "57", "65", "99", "26", "61" };
    int desired = 1;
    assertEquals(3, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case31() {
    int[] weights = { 5, 9, 8, 1, 9, 4 };
    String[] scores = { "147588", "911146", "258395", "912457", "946138", "917352", "661642", "687218", "859989", "998739" };
    int desired = 4;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case32() {
    int[] weights = { 5, 9, 6, 1, 9, 8, 8, 6, 1, 5 };
    String[] scores = { "4478422853", "2897887124", "8629871664", "4167515979", "2639545938", "9772214736", "1344458515" };
    int desired = 2;
    assertEquals(6, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case33() {
    int[] weights = { 9, 5, 5, 4, 3 };
    String[] scores = { "28765", "72324" };
    int desired = 1;
    assertEquals(4, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case34() {
    int[] weights = { 9, 5 };
    String[] scores = { "18", "23" };
    int desired = 1;
    assertEquals(3, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case35() {
    int[] weights = { 8, 5 };
    String[] scores = { "95", "98" };
    int desired = 0;
    assertEquals(3, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case36() {
    int[] weights = { 6, 6, 6, 3, 8, 9, 1, 7, 1, 9 };
    String[] scores = { "1555676553", "5762144469", "3781699245", "6537359853", "2545367364", "8635462198", "8899863576", "3864726617", "4748491934", "9139367188" };
    int desired = 5;
    assertEquals(14, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case37() {
    int[] weights = { 3, 2, 1, 9, 6, 4, 2, 9, 6, 4 };
    String[] scores = { "8197448655", "7693887585", "8939874259", "8756544567", "7919352319", "5658522462", "1567481381", "8358434747", "2841449495", "6419659635" };
    int desired = 5;
    assertEquals(12, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case38() {
    int[] weights = { 1, 8, 5, 1, 4, 4, 9, 3, 4, 8 };
    String[] scores = { "4642226161", "6258284218", "8527616278", "5859832866", "1138943559", "4675163994", "7736842852", "1342421381", "3625642862", "4916692339" };
    int desired = 8;
    assertEquals(17, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case39() {
    int[] weights = { 8, 5, 5, 5, 8, 3, 3, 1, 2, 1 };
    String[] scores = { "9379611787", "4535841694", "9985783716", "8324717464", "4735474385", "6418977992", "5235275743", "8317829781", "1952182227", "8253153869" };
    int desired = 4;
    assertEquals(23, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case40() {
    int[] weights = { 6, 1, 4, 2, 7, 1, 9, 3, 8, 5 };
    String[] scores = { "6653175887", "8684296217", "9771388615", "8555285146", "9276215612", "4261266289", "1421497471", "9227926892", "4978956565", "7799395471" };
    int desired = 4;
    assertEquals(-1, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case41() {
    int[] weights = { 3, 4, 2, 2, 7, 6, 7, 8, 4, 9 };
    String[] scores = { "9494571689", "9786526717", "2137826273", "6888459526", "8565142875", "1739798593", "9383519114", "7784412844", "4589462674", "1656628452" };
    int desired = 4;
    assertEquals(14, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case42() {
    int[] weights = { 9, 5, 3, 4, 1, 3, 5, 1, 2, 5 };
    String[] scores = { "8778685233", "5467736274", "3426238288", "2945213718", "1945755834", "6185395369", "3598665631", "7775742425", "9717485741", "1865225743" };
    int desired = 2;
    assertEquals(9, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case43() {
    int[] weights = { 1, 3, 1, 3, 7, 6, 8, 5, 8, 4 };
    String[] scores = { "3927159126", "5782687711", "2578248918", "9439939495", "5493434227", "6275259565", "3654354543", "5144986362", "5371215456", "4849447994" };
    int desired = 9;
    assertEquals(3, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case44() {
    int[] weights = { 7, 6, 2, 2, 3, 3, 3, 5, 4, 5 };
    String[] scores = { "1355156453", "5433476233", "2136175215", "2818772938", "2824827143", "7322337582", "4255192597", "8872799779", "6772144256", "1814756626" };
    int desired = 3;
    assertEquals(16, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case45() {
    int[] weights = { 8, 8, 7, 1, 3, 1, 1, 4, 3, 3 };
    String[] scores = { "7628184337", "5294578611", "7413999573", "2233683363", "2491569671", "1483254498", "7621684952", "8465432474", "5165285992", "8448834736" };
    int desired = 7;
    assertEquals(2, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case46() {
    int[] weights = { 2, 2, 2, 2, 2, 2, 2, 3, 3, 2 };
    String[] scores = { "5555555554", "8888888882", "8888888882", "8888888882", "8888888882", "8888888882", "8888888882", "8888888882", "8888888882", "8888888882" };
    int desired = 0;
    assertEquals(110, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case47() {
    int[] weights = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 1 };
    String[] scores = { "4444444445", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666" };
    int desired = 0;
    assertEquals(100, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case48() {
    int[] weights = { 3, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    String[] scores = { "4444444444", "7666666665", "7666666656", "7666666566", "7666665666", "7666656666", "7666566666", "7665666666", "7656666666", "7566666666" };
    int desired = 0;
    assertEquals(110, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case49() {
    int[] weights = { 2, 8, 7, 3, 6, 5, 2, 4, 7, 2 };
    String[] scores = { "9197287893", "9492555365", "3459972761", "4886112198", "5963616776", "6325897129", "3248793133", "7984474438", "4518544769", "1592681682" };
    int desired = 5;
    assertEquals(17, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case50() {
    int[] weights = { 2, 3, 5, 3, 6, 7, 9, 1, 6, 9 };
    String[] scores = { "1111111122", "1111111119", "1111111121", "1111111211", "1111112111", "1111121111", "1111211111", "1121111111", "1211111111", "1111111191" };
    int desired = 1;
    assertEquals(0, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case51() {
    int[] weights = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 8 };
    String[] scores = { "9976666666", "4444444445", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666", "6666666666" };
    int desired = 1;
    assertEquals(44, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case52() {
    int[] weights = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    String[] scores = { "1111111111", "2333333333", "2333333333", "2333333333", "2333333333", "2333333333", "2333333333", "2333333333", "2333333333", "2333333333" };
    int desired = 0;
    assertEquals(92, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case53() {
    int[] weights = { 9, 1, 1, 1 };
    String[] scores = { "7111", "8222" };
    int desired = 0;
    assertEquals(2, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case54() {
    int[] weights = { 2, 3, 4, 5, 6, 7, 7, 7, 7, 7 };
    String[] scores = { "1234567778", "3456789999", "3456789999", "3456789999", "3456789999", "3456789999", "3456789999", "3456789999", "3456789999", "3456789999" };
    int desired = 0;
    assertEquals(76, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case55() {
    int[] weights = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    String[] scores = { "4444444444", "6665666666", "6656666666", "6566666666", "5666666666", "6666566666", "6666656666", "6666665666", "6666666566", "6666666656" };
    int desired = 0;
    assertEquals(92, rationalization.minTweaks(weights, scores, desired));
  }

  @Test
  public void case56() {
    int[] weights = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    String[] scores = { "4444444441", "4444444441", "4444444441", "4444444441", "4444444441", "4444444441", "4444444441", "4444444441", "4444444441", "1111111129" };
    int desired = 9;
    assertEquals(13, rationalization.minTweaks(weights, scores, desired));
  }

}
