package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class ColorfulBricksTest {
  ColorfulBricks colorfulbricks = new ColorfulBricks();

  @Test
  public void case1() {
    String bricks = "ABAB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case2() {
    String bricks = "AAA";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case3() {
    String bricks = "WXYZ";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case4() {
    String bricks = "Z";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case5() {
    String bricks = "LL";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case6() {
    String bricks = "UV";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case7() {
    String bricks = "BBABC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case8() {
    String bricks = "CCCCCCCCCCC";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case9() {
    String bricks = "PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case10() {
    String bricks = "HQQHHQQQHQHQQQQQQ";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case11() {
    String bricks = "IIIPIIIPIPIPIPIPPPIPIIIIIIPIPIPIPIIIIPP";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case12() {
    String bricks = "UUJJJUUJJUJJJUUUJJJUUJJUUJUJJJUUUUUJUUJUUJJUJUUJ";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case13() {
    String bricks = "OAOAAOAAOAOAOOAAOOOOOOAOAAAOAAOOAAOOOAOAAOOOAOAOAO";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case14() {
    String bricks = "VXXVXXXXVVXVXVXVVXXVVVVVXVXXXVXVXVVVXVVXVXVXXXVVVX";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case15() {
    String bricks = "CKKKKKCKKKKKKKKKKKCCCCKCCKCCCCKKKKKKKKKCKKCCCCCCKK";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case16() {
    String bricks = "LILIIILIILIIILIILLLLLIIIILIIIILILILLLLIIILLLLLILLL";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case17() {
    String bricks = "JEEEJJJEEEJJJJJJJEJEEJEJJEJJEEEJJEEEJJEJJJEEEJEJJJ";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case18() {
    String bricks = "OOAOOOAOAAOOAOOOAOOAAOAAOAOAOOAAAOAAAOOOOOOAOOOAOO";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case19() {
    String bricks = "XXXXKXXXKKKXXXKKXKKXKKXKKXKKXKXXKXKKXKKKXXKXXKKXXX";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case20() {
    String bricks = "VVVAVAVVAVVVVAAAVVVAVVAVAAAAAVAAAAAVAAAAVVAVAAVVAA";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case21() {
    String bricks = "DRDDRDRRRRRRRDDDDDDRRDDRRRRRDDDRDRRDDRRDRRDDDRRRDD";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case22() {
    String bricks = "VYYVVYVYYYYVVYVYYVYVVVYVYYVVVYVYVYVYYYYYVYYYVVYVYY";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case23() {
    String bricks = "TTTTTTGTTGTGGTGGTGTGTTGGGTTGTGTTGGTTGTTGGTGTTTGGTG";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case24() {
    String bricks = "IEIEEIIEEEIEIIEEIEIEEEEIIEEIIEIIEEIEIIIEIEEEIEEIEI";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case25() {
    String bricks = "QQNNQNQNQNQQNQNQNQQQQQQNQQQQNQNNQQQQQQNQNQQQQNNNNN";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case26() {
    String bricks = "HBBHBBBHBHHBHHBHBBHHBBBBHHHHBBBBHHHBHBBBBBBBHHHBBH";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case27() {
    String bricks = "VYVYYVYYYVVYYVVYYVVVYYVYVVVYVVVVVYVYYVYYYVVYVYYVVY";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case28() {
    String bricks = "SSSLLSSSLLLSLSSLLSSSSLSLLLSLLLLLLLLSLLLSSSLLLLLSSX";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case29() {
    String bricks = "GQQQGQGQQQGGQQQGGGQGGGGQQQGQGGQGQGQQGGGQQQQGGGQQGY";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case30() {
    String bricks = "ABABABABCCBABACBABCB";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case31() {
    String bricks = "ABABCBABACBDBABADBDBABADBADABADBDBADAB";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case32() {
    String bricks = "YGTJZUANYLBPZFUFCKTPAJYYSZFNIEHJTIWNLOJYXMNY";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case33() {
    String bricks = "DWVZOXIMWCLBQUHZFCHBQVQBUQSWVVD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case34() {
    String bricks = "APOTGCBVKVPRKJLINEVOVLJDONYAINTSWHQJDX";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case35() {
    String bricks = "QPCBZJLJBNMJCFDZMVKQTLMJAQMBZXQOHSACIPMJEY";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case36() {
    String bricks = "FZIUVSKOGYXIPLKOKTVVRSFGFPXPRE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case37() {
    String bricks = "NCRMJFUREPXYWEEMDTFHCRUEKJPQDIILOLQBUKHYB";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case38() {
    String bricks = "YLCMQWRZYLVEVEVNJEWXSHNUBYDBZKYZXCLNYDMYOIEJOAXAEV";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case39() {
    String bricks = "CKSGKWHMIHLGKXTKAIJQSNBGPAGTVFSASKGCIPOTZAZJZUVBCG";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case40() {
    String bricks = "WUDLVLFQRXSJJYNUQCNPEOAFIVGNCZJYTOLOAQHTPZCBARXQVK";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case41() {
    String bricks = "AHGIEMXILHIFXUVXMCQECUFEOCWJODLOMRYSEWBRFLYCHUCUWU";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case42() {
    String bricks = "RFEFHAOXFZNTRLMXJPQQCPTKJXEHREIIJONSRCPYDCSWPGVZXM";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case43() {
    String bricks = "BKJKHPRZTBJCQZWJDLHGPZFFHAEEMVENGPZPFTQAUAFMZBXCPF";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case44() {
    String bricks = "GPJOQPUCLASTQRIXMZZJZEVAITCXAMBGELWUCRYNRQGJKPIYQK";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case45() {
    String bricks = "QFPYYTXAHZGLMFHOWGEPYMBKDLJTVQIMVZMVUKVCLEPXJZNHHT";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case46() {
    String bricks = "GZSJNBDITNWRPJOJTMNESFDDESKLOKSUKKFZNKHJAECPPSAKEO";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case47() {
    String bricks = "VTBZNNMDYGXKRFJGPQRPWTGNMHXSXNRSIUTYIHBGNBQGGZNXRE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case48() {
    String bricks = "AVDOEDIBQZVZWQZEXAKLBCTHBGHUNWMPTQDATLDLNZMJPLPPMB";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case49() {
    String bricks = "DVXGCEARCNGXFLXAYBLLCAWTLLIXMKNRGKXKQYBUNJTUURUSUH";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case50() {
    String bricks = "HCPTQYSEKFWQRTAJTBFIKZCGSYZMGFKPJBIBBDGMKECEZFNVIV";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case51() {
    String bricks = "ABABABBBBABBABBBACCDEDFFFE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case52() {
    String bricks = "AB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case53() {
    String bricks = "AAAAAAAAAAAABBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCDDDDDDD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case54() {
    String bricks = "AAABBBCCCDDDEEEFFF";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case55() {
    String bricks = "AAAAAAAAAAAAAAA";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case56() {
    String bricks = "AABB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case57() {
    String bricks = "AABBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case58() {
    String bricks = "A";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case59() {
    String bricks = "ABCABABCABABCABABCABABCABABCAB";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case60() {
    String bricks = "AABBCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case61() {
    String bricks = "ABABAB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case62() {
    String bricks = "AABBCCDD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case63() {
    String bricks = "ABACADABRAAADAJA";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case64() {
    String bricks = "AAABBBCCCDDD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case65() {
    String bricks = "AAAAAAAAAAAAAAAAABBBBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case66() {
    String bricks = "ABDSDWERWE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case67() {
    String bricks = "ABC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case68() {
    String bricks = "AAAABBBBCCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case69() {
    String bricks = "ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case70() {
    String bricks = "WWXXYYZZ";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case71() {
    String bricks = "AAABBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case72() {
    String bricks = "AAAAABBBBBCCCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case73() {
    String bricks = "AAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case74() {
    String bricks = "AAAAAAA";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case75() {
    String bricks = "AAAAAAAAAABBBBBBBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case76() {
    String bricks = "ABCDFABCDFABCDFABCDFABCDFABCDFABCDFABCDFABCDFABCD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case77() {
    String bricks = "AAB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case78() {
    String bricks = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case79() {
    String bricks = "AAAABBBBCCCCDDEEEEFFFFFYYY";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case80() {
    String bricks = "AABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case81() {
    String bricks = "AABBCCDDEEE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case82() {
    String bricks = "AAAAAABB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case83() {
    String bricks = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUV";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case84() {
    String bricks = "AAAABBBBCCCCDDDD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case85() {
    String bricks = "AAABB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case86() {
    String bricks = "AAAAAAABBBBCCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case87() {
    String bricks = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case88() {
    String bricks = "ABBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case89() {
    String bricks = "ABABAABCCDE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case90() {
    String bricks = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case91() {
    String bricks = "AAAAAA";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case92() {
    String bricks = "WWXXYY";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case93() {
    String bricks = "ABGADGGGABCDDDDABBGGABCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case94() {
    String bricks = "AAABABBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case95() {
    String bricks = "AAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case96() {
    String bricks = "ABCDEFGHIJKLMNOPQRSTUVWXYZINJHUGNHCUBDKOUJHE";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case97() {
    String bricks = "XXWWXXYYZZ";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case98() {
    String bricks = "AAABBBCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case99() {
    String bricks = "AAAABBBCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case100() {
    String bricks = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAABB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case101() {
    String bricks = "AAAAAAABCD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case102() {
    String bricks = "AAAABBBBCCCCCDDDDDEEEEFFFF";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case103() {
    String bricks = "AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYZ";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case104() {
    String bricks = "AAAABBBBCCCCAAAABBBBCCCCAAAABBBBCCCCAAAABBBBCCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case105() {
    String bricks = "QAZWSXEDCRFVTGBYHNUJMIKOLPQAZWSXEDCRFVTGBYHNUJMIKO";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case106() {
    String bricks = "AAAAAAAAAABBBBBBBBBBBBCCCCCCCCCDDDDDDDDDAA";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case107() {
    String bricks = "ABB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case108() {
    String bricks = "AABBCCCDDDAABBCCCDDDAABBCCCDDDAABBCCCDDDAABBCCCDDD";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case109() {
    String bricks = "ABBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case110() {
    String bricks = "ABABDEF";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case111() {
    String bricks = "ABCABCABCAB";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case112() {
    String bricks = "ABCAAAA";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case113() {
    String bricks = "AAAAAAABBBBBBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case114() {
    String bricks = "ABBA";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case115() {
    String bricks = "XYZABA";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case116() {
    String bricks = "AZ";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case117() {
    String bricks = "ABBBC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case118() {
    String bricks = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHI";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case119() {
    String bricks = "AAAAAAAAAAAAAAAAAAA";
    assertEquals(1, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case120() {
    String bricks = "AAABBBCCCCDDDEEEEFFFF";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case121() {
    String bricks = "AAAABBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case122() {
    String bricks = "ABCCCCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case123() {
    String bricks = "AABCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case124() {
    String bricks = "AAABBBCC";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case125() {
    String bricks = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQ";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case126() {
    String bricks = "AAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBAAAAAAAA";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case127() {
    String bricks = "AAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBB";
    assertEquals(2, colorfulbricks.countLayouts(bricks));
  }

  @Test
  public void case128() {
    String bricks = "ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCBCACA";
    assertEquals(0, colorfulbricks.countLayouts(bricks));
  }

}
