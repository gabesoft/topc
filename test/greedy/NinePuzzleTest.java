package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class NinePuzzleTest {
  NinePuzzle ninepuzzle = new NinePuzzle();

  @Test
  public void case1() {
    String init = "BG*YRGRRYR";
    String goal = "BGGY*YRRRR";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case2() {
    String init = "GBBB*BGBBG";
    String goal = "RYYY*YRYYR";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case3() {
    String init = "RRBR*BRBBB";
    String goal = "BBRB*RBRRR";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case4() {
    String init = "RRRRRRRRR*";
    String goal = "RRRRRRRRR*";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case5() {
    String init = "YBB*GRGYGB";
    String goal = "YBB*GRGYGB";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case6() {
    String init = "YYBBGGGRR*";
    String goal = "*RRRBBYYGG";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case7() {
    String init = "RYYGYB*YYY";
    String goal = "BYBB*GBBRB";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case8() {
    String init = "YYYY*YYYYY";
    String goal = "B*GGRRGBRG";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case9() {
    String init = "RR*GGGRRRG";
    String goal = "GBGBGBGBG*";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case10() {
    String init = "YYYYYYYYG*";
    String goal = "GYYYYYYY*G";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case11() {
    String init = "R*YGGRBYBR";
    String goal = "R*RGYRYBBR";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case12() {
    String init = "RBGRYGYB*G";
    String goal = "*RYGRBGYGB";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case13() {
    String init = "RRRGGGRRR*";
    String goal = "*RRGRRGRRG";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case14() {
    String init = "*YRRRRRRRR";
    String goal = "*RYRRRRRRR";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case15() {
    String init = "RRRRRRR*RR";
    String goal = "BYGYBGB*YG";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case16() {
    String init = "GB*YBBGYGY";
    String goal = "RRRRRRRRR*";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case17() {
    String init = "YGGGRYRG*R";
    String goal = "BBBBB*BBBB";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case18() {
    String init = "YRYRYRYR*R";
    String goal = "BBG*BBBBBB";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case19() {
    String init = "Y*YGGYGYYY";
    String goal = "*RRBRRBRRR";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case20() {
    String init = "BRRYRR*RRY";
    String goal = "GGGG*GGGGG";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case21() {
    String init = "*YYGYYYYBR";
    String goal = "YY*GRYBYYB";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case22() {
    String init = "GBRYGYY*GG";
    String goal = "GGYGGRR*BG";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case23() {
    String init = "YG*GRYYBYY";
    String goal = "BBRGBBY*YB";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case24() {
    String init = "GYG*GGRYGB";
    String goal = "BRBYYYYYG*";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case25() {
    String init = "GRGYRY*BRR";
    String goal = "RGBRGRYRR*";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case26() {
    String init = "*GRBGYRGRR";
    String goal = "GYGBYYRYG*";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case27() {
    String init = "GGBGGRG*GY";
    String goal = "RB*YGGBRGG";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case28() {
    String init = "YGGR*YGYYB";
    String goal = "BYRBRRGR*R";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case29() {
    String init = "GBGRGBY*GR";
    String goal = "GGRYRBGG*R";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case30() {
    String init = "Y*GYYYYBRB";
    String goal = "B*BGRYBBGR";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case31() {
    String init = "YYYY*GYYRB";
    String goal = "GRGBYYB*YG";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case32() {
    String init = "BB*YYYGRGY";
    String goal = "RRR*BYRGRR";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case33() {
    String init = "GBGBGY*GRB";
    String goal = "G*BYRRGGGB";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case34() {
    String init = "G*YYBYGYGR";
    String goal = "YBY*YBBRYG";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case35() {
    String init = "YYRBRR*GGR";
    String goal = "RBRRGRYRB*";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case36() {
    String init = "GBGYGRYRG*";
    String goal = "GGGGRGBYG*";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case37() {
    String init = "GGGYGB*RGR";
    String goal = "RYYGB*RYGY";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case38() {
    String init = "BR*YBGBRYR";
    String goal = "RBRR*RRGYR";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case39() {
    String init = "BGYGRGRYR*";
    String goal = "BBGBBBG*RY";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case40() {
    String init = "BYY*GGRBYB";
    String goal = "BRBYRGYBB*";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case41() {
    String init = "Y*BRRRGGYG";
    String goal = "GBGGRRRYB*";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case42() {
    String init = "BR*GYBBGRG";
    String goal = "RB*BGRYRGG";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case43() {
    String init = "BRGRBRRYR*";
    String goal = "RB*GYGGGGG";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case44() {
    String init = "YYRYBBY*GR";
    String goal = "YYR*BYGRYR";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case45() {
    String init = "RYRBR*GBGB";
    String goal = "GGRRR*YGBR";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case46() {
    String init = "*BGGRGGGYB";
    String goal = "YYBYYYRG*Y";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case47() {
    String init = "RYR*BGRGBY";
    String goal = "RRYGYRGR*B";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case48() {
    String init = "YGRY*YRYRB";
    String goal = "GRYGBGYG*Y";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case49() {
    String init = "YBBRGRRRB*";
    String goal = "YYGRRY*YRB";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case50() {
    String init = "RYBYB*RGBR";
    String goal = "BRGRGYGR*R";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case51() {
    String init = "YBG*RBYGRB";
    String goal = "GGYBYR*BRY";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case52() {
    String init = "R*YGBGBYBR";
    String goal = "R*GYGYGBBG";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case53() {
    String init = "BBYGRGRY*B";
    String goal = "YY*GBBRYYY";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case54() {
    String init = "BRYYB*RGGB";
    String goal = "RRGYGBR*RR";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case55() {
    String init = "GBBRYR*BYG";
    String goal = "BBYGYRRRB*";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case56() {
    String init = "*RBBYGGRBR";
    String goal = "*GYYRGBRGB";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case57() {
    String init = "YRYBBGY*YB";
    String goal = "RYRBYBG*GG";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case58() {
    String init = "YGBGG*BRYY";
    String goal = "RBGYB*RGYG";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case59() {
    String init = "BGRRB*RYBB";
    String goal = "*BRYGGRBGY";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case60() {
    String init = "YRRBRBYBG*";
    String goal = "YYBRGGB*GR";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case61() {
    String init = "R*GGGGBGGY";
    String goal = "*RGGGGBGGY";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case62() {
    String init = "RG*GGGBGGY";
    String goal = "*GRGGGBGGY";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case63() {
    String init = "RGG*GGBGGY";
    String goal = "RGGBGG*GGY";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case64() {
    String init = "RGGGGGB*GY";
    String goal = "RGGGGG*BGY";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case65() {
    String init = "RGGGG*BGGY";
    String goal = "RGGGGYBGG*";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case66() {
    String init = "RGGGGGBG*Y";
    String goal = "RGGGGGBGY*";
    assertEquals(0, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case67() {
    String init = "*BRRYRGRYR";
    String goal = "BGGRB*BGBG";
    assertEquals(6, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case68() {
    String init = "BBB*BRRBYY";
    String goal = "*GGRYGGGBG";
    assertEquals(6, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case69() {
    String init = "B*YBBRBBBR";
    String goal = "BG*YYYYYYR";
    assertEquals(6, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case70() {
    String init = "RRGRRRR*GR";
    String goal = "GBBBBBBBY*";
    assertEquals(8, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case71() {
    String init = "GRGRRGRR*R";
    String goal = "Y*RBYYBBYB";
    assertEquals(8, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case72() {
    String init = "RRRRGGRRG*";
    String goal = "Y*YBRBYBYY";
    assertEquals(8, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case73() {
    String init = "RYGBYRBY*R";
    String goal = "RGGG*GGGGY";
    assertEquals(6, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case74() {
    String init = "Y*GBYRBGRR";
    String goal = "YY*YYYYYYY";
    assertEquals(7, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case75() {
    String init = "GBBGRYR*YB";
    String goal = "G*GGGGRGGG";
    assertEquals(6, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case76() {
    String init = "B*BBBRBBBB";
    String goal = "GYR*GGYRBB";
    assertEquals(6, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case77() {
    String init = "RRRRRRRRR*";
    String goal = "GGGGGGGGG*";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case78() {
    String init = "BBBBGGGGR*";
    String goal = "YYYYGGGGR*";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case79() {
    String init = "GBBB*BGBBG";
    String goal = "RYYBBBBY*R";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case80() {
    String init = "GBBB*BGBBG";
    String goal = "RYYY*YRYYR";
    assertEquals(9, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case81() {
    String init = "RRGGBBBBB*";
    String goal = "RGBBBBBBB*";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case82() {
    String init = "BBGYYYYYY*";
    String goal = "BGYYYYYYY*";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case83() {
    String init = "BBBGGRRRR*";
    String goal = "BBGGRRRRY*";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case84() {
    String init = "RRBBG*GGYY";
    String goal = "YY*GGGGGGG";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case85() {
    String init = "BBBB*RRRRR";
    String goal = "RRRR*YYYYY";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case86() {
    String init = "*BBBBBBBRR";
    String goal = "*BBBBBRRYY";
    assertEquals(2, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case87() {
    String init = "BG*YRGRRYR";
    String goal = "BBBBBBBBB*";
    assertEquals(8, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case88() {
    String init = "GYYRRBBBB*";
    String goal = "GYRRBBBBB*";
    assertEquals(1, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case89() {
    String init = "RRBBGG*RGR";
    String goal = "GGGYYRR*RY";
    assertEquals(3, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case90() {
    String init = "RGGG*RGBYY";
    String goal = "*GGGGGGGGR";
    assertEquals(4, ninepuzzle.getMinimumCost(init, goal));
  }

  @Test
  public void case91() {
    String init = "BBBBB*GGGG";
    String goal = "GGGG*YYYYY";
    assertEquals(5, ninepuzzle.getMinimumCost(init, goal));
  }

}
