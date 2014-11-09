package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ConvertibleStringsTest {
  ConvertibleStrings convertiblestrings = new ConvertibleStrings();

  @Test
  public void case1() {
    String A = "DD";
    String B = "FF";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case2() {
    String A = "AAAA";
    String B = "ABCD";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case3() {
    String A = "AAIAIA";
    String B = "BCDBEE";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case4() {
    String A = "ABACDCECDCDAAABBFBEHBDFDDHHD";
    String B = "GBGCDCECDCHAAIBBFHEBBDFHHHHE";
    assertEquals(9, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case5() {
    String A = "H";
    String B = "H";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case6() {
    String A = "GE";
    String B = "DC";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case7() {
    String A = "AA";
    String B = "AA";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case8() {
    String A = "BBB";
    String B = "CAC";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case9() {
    String A = "FHA";
    String B = "III";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case10() {
    String A = "GBFAAHIG";
    String B = "ADEADEDG";
    assertEquals(4, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case11() {
    String A = "AAABBBAABB";
    String B = "BABABBBABA";
    assertEquals(5, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case12() {
    String A = "CBDCBACDBD";
    String B = "DBCCDBABAC";
    assertEquals(5, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case13() {
    String A = "AFHIHFBDIHEFIFDBEFIA";
    String B = "FGFEFAFDCCACDBIFHEIF";
    assertEquals(13, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case14() {
    String A = "HBEFCIADAHIAEGGCGHDCE";
    String B = "ICECEFBGIFACBIEIIHAFG";
    assertEquals(12, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case15() {
    String A = "FEDEIGCGHFFAHIEBIHFEED";
    String B = "DCFAGGBCBAFABAIGGIAFBD";
    assertEquals(13, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case16() {
    String A = "ICEBAAHDAHBICCDDCEHIGGB";
    String B = "EIDFGAGHBDEIAFFGIGDIHAF";
    assertEquals(12, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case17() {
    String A = "HCAIDAEHBHDCBIAIHDEHHGBF";
    String B = "EEEAEECDBFDGHGFEFFIGFEAH";
    assertEquals(13, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case18() {
    String A = "FHDHIFFAECCAHICCDFFBFHEHB";
    String B = "GGGHAGEIDHICFCFHEIDCDBBBH";
    assertEquals(14, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case19() {
    String A = "GAFCBDHACBGCFAICCICGHEDEHE";
    String B = "IABCIAHIBIEAAFCDFDAHAACHGF";
    assertEquals(15, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case20() {
    String A = "ECIDGIEBFBFFFGGBAAHBFIACAFH";
    String B = "BIGHAEBHCHAGIFHHIFBEEBHFCDC";
    assertEquals(16, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case21() {
    String A = "HIGHFCIDAAIGGABADFDBABHAIEAC";
    String B = "DAEFBBFDHFCBHHFFFBDDHDDBDBBF";
    assertEquals(18, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case22() {
    String A = "IGIIHFCGCABFGEFCHDIDCHCDCEFEG";
    String B = "HFHBBDDIDDCFBCHBDDDHIABFIABBB";
    assertEquals(19, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case23() {
    String A = "GEBADHGBBHCDDEFGAIBGBIHHFHGADC";
    String B = "CGIHGBHEEDHFEFFHCAFAGGCIECAIBE";
    assertEquals(19, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case24() {
    String A = "BGGHFFDEBIEFHDDFAFHFFAAFFHEFCDG";
    String B = "EBFDCGCIDHAIFAGGHEDFCEGFEGIFDGC";
    assertEquals(19, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case25() {
    String A = "GABFBFCIEIDEDEIBGGBCBCCDFIEHIHGC";
    String B = "BIBDFIAFEGCDDCEHAACBCAIGDIEBAHFI";
    assertEquals(19, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case26() {
    String A = "IDCHCFHGGDBHFBEDCBCECAHBIHGHAEGCI";
    String B = "FCCIIHBIECFFFGDAHAABCEECDCICEADAI";
    assertEquals(20, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case27() {
    String A = "BFDBEFCFFHBHHBFDCHGFBAIIFBDFEAAEAD";
    String B = "CFHAAHAEFIGFCFBHGAIDAAAEGEGFCGDAFE";
    assertEquals(22, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case28() {
    String A = "CADEFIECDHEDCDIDGFCAEFFBGIHIIHGIBIH";
    String B = "DGBIHADCBDAHEBFGHFAHAIDCDACFAAADBEI";
    assertEquals(22, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case29() {
    String A = "EACDBBCBFEDFAACBGDIEHFIGAGCGEDFCFCDB";
    String B = "FDGIHEEFABIAEIAGAFICEADFECGCFIABIECH";
    assertEquals(18, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case30() {
    String A = "GFBHEIFEFBECGCDHBFIHHADCAHABHIBFHEDGC";
    String B = "CHDIAGFGADDCHCCGIHEAGFGHEEDBHAIEECEHI";
    assertEquals(25, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case31() {
    String A = "AHEFGCBGCEBBGFEGACCDBBIAGBIBGAGICBFGHI";
    String B = "GFCIIADCIGFICEBDFDGHEHIIHBFIAIFFHHFEGF";
    assertEquals(25, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case32() {
    String A = "CDBACCFAHIGEEIFCAIEEHFCACBBCCBAEBIGBIGI";
    String B = "GBAFIDFHFHGAEIGHGCIFDFBFDEGBADBIBAAEIBB";
    assertEquals(27, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case33() {
    String A = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String B = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case34() {
    String A = "BBBABAABBAABBBBAAAABAABBBBAAAAAABBBABBAAABBABBAABA";
    String B = "BBBBBAABABBBBAABBBBAABBAABBBAAABBBAAABABAAAABBBBAB";
    assertEquals(24, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case35() {
    String A = "BBBBBABAABABBAAAABBBBABAABBBBABAABAABABABAABBBBBBA";
    String B = "BBBBBAAAAAABBAABABBABABAABABABBBAABAAAAAABBABBBABA";
    assertEquals(17, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case36() {
    String A = "ABBAAABBBBCBABCCABBBBCBCCACBCACACCAAACBBCBCBCABBAC";
    String B = "CBCCCBABAAACCAACCACBAABBBBCABCCBBACBACCABABCBBCACC";
    assertEquals(25, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case37() {
    String A = "CABCBABCCCBBCCABABBACAAAABCBCAACCBABAABACBCBCBCABB";
    String B = "CCABACAACAAACABCCCCACBBACBAAABBBCBABBAAAAACCABCBAB";
    assertEquals(27, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case38() {
    String A = "CCBACBCBDADACBCBAADBCAACCACCAADBCCACBDBCBCAADBBDAC";
    String B = "CABACABDBDADDDCBBDDBCCCDBDDCDABCBDCDCAABDDBBBACDDD";
    assertEquals(33, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case39() {
    String A = "AECCEADBECCEEADDADEDBBAEBCDEEDBDECCEDDDBEECCEDADEB";
    String B = "EABCEBDADCEDCEAADCEABBDDBBDDACEAAAEAEBBEEABDBAABDA";
    assertEquals(33, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case40() {
    String A = "HDHIAEEFEEGGAFIHAFGIIDIAHDGIHCAFIIHHHEBBAFHHGHEAEI";
    String B = "EEIGDIABBHECAIIICIGBEBECGGACBCIHGCEEHHGEAAECEDDFAF";
    assertEquals(36, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case41() {
    String A = "EHEBBGEBGDCADHIBAHEBHEFIADEBHAACECGIGFIFHFGACCHIHB";
    String B = "CAGAECGBBAHGHHHGAABIDFHDHFAGDABCCIFHEGHIGACFBHFABH";
    assertEquals(35, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case42() {
    String A = "IDEGADDIIBGDAFEIBBBGAHDHEBFBICCAHBCBHBIEGFCGFEDFHD";
    String B = "AIFACDDGEAEGGFDHCEIDCHACCIEHHCFDHEIAAAAAGHHAIBDHFF";
    assertEquals(35, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case43() {
    String A = "ABACDCECDCDAAABBFBEHBDFDDHHDGHFHEIDICIAIABCDE";
    String B = "GBICFFBGDCHAAIBBFHEBBDFHHHHEADFGHICBBCCDAAABB";
    assertEquals(27, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case44() {
    String A = "ABACDGHACBD";
    String B = "BCADCBDGABD";
    assertEquals(6, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case45() {
    String A = "GIEIHIGHIAGDGGIFIIACHGDEFBCACEBEFHAHAIIEFFEAAHHFEC";
    String B = "DAGIEGGCCGIHFGBHBHFGDGHFGGGCAHHIIAEIFIBCBEEADEAHED";
    assertEquals(34, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case46() {
    String A = "AAAAABBBBBCCC";
    String B = "BBEEEBBEEBBEE";
    assertEquals(7, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case47() {
    String A = "ACHHCEBCICBCGDHCDCDGAAIIIGECFIEFEEEGGHCCACEHGFEICA";
    String B = "FEFEIAFFHCADGEIIEBFHFFDIAHEHHDBGFIEHBBFEBECDGFDEEB";
    assertEquals(34, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case48() {
    String A = "AAAAAAAAAABBBBBBBBBB";
    String B = "IABCDEFGHIIABCDEFGHI";
    assertEquals(17, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case49() {
    String A = "ABCDE";
    String B = "AAAAA";
    assertEquals(4, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case50() {
    String A = "ABABABBBB";
    String B = "AAAAAAAAA";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case51() {
    String A = "AAAA";
    String B = "BCAA";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case52() {
    String A = "ABCA";
    String B = "EEEE";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case53() {
    String A = "ABCCDEFGCDEFGHIDDEFGCABCCFGHIDEFDEFGCF";
    String B = "BDFCAADFCGCDEFAAAABEFGCEFGCAHIIIIBBCCA";
    assertEquals(23, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case54() {
    String A = "AAABBBB";
    String B = "ABBBBBB";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case55() {
    String A = "ABACACA";
    String B = "BBCBDBD";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case56() {
    String A = "AAABBB";
    String B = "CCCCCC";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case57() {
    String A = "ACC";
    String B = "BBB";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case58() {
    String A = "ABDEFHIABEFIHFEADFEGHABDEFHIABEFIHFEADFEGHABDEFHI";
    String B = "BAEDFGHIIHGHIABCDBAEDFGHIIHGHIABCDBAEDFGHIIHGHIAB";
    assertEquals(34, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case59() {
    String A = "BBBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String B = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case60() {
    String A = "ABBBB";
    String B = "EEEEE";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case61() {
    String A = "BI";
    String B = "AA";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case62() {
    String A = "AAAAADDDDD";
    String B = "CCBBBEFFFF";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case63() {
    String A = "AB";
    String B = "CC";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case64() {
    String A = "AAAAAAABBBB";
    String B = "AAAABBBAAAB";
    assertEquals(5, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case65() {
    String A = "ABCABCABCABC";
    String B = "BAACBBCBBCBC";
    assertEquals(5, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case66() {
    String A = "AABB";
    String B = "AAAA";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case67() {
    String A = "ABCDEFGHIGHIDEFDEFGHABCDEFGIIDEFDEFGHABCDEFGIEFG";
    String B = "BCDEFGIEFGGHIDEFDEFGHABCBCDEFGHIGHIDHABCDEFGIEGI";
    assertEquals(34, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case68() {
    String A = "AAAAEEEA";
    String B = "CBBBBBBC";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case69() {
    String A = "DAC";
    String B = "HAA";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case70() {
    String A = "ABDGEIAEABCEDFGHIEEEEBBBBBCCCCCCCDDDDDBBBABCDEF";
    String B = "BCEHFFCIBDCAIADBCFGHICDEFGADEFGHIEFGHICDBABCDEF";
    assertEquals(33, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case71() {
    String A = "AACCCAC";
    String B = "IIIIIBG";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case72() {
    String A = "CCCBBBEEEEEF";
    String B = "AIIIIIDDDBBB";
    assertEquals(4, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case73() {
    String A = "ABCDEFGHI";
    String B = "ABCDEFGHI";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case74() {
    String A = "AAAAA";
    String B = "BCCCB";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case75() {
    String A = "AAIAIA";
    String B = "BCEEEE";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case76() {
    String A = "ABCCC";
    String B = "ABBBB";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case77() {
    String A = "ABBBB";
    String B = "BBBBA";
    assertEquals(2, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case78() {
    String A = "ABB";
    String B = "AAA";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case79() {
    String A = "AAB";
    String B = "CCC";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case80() {
    String A = "AABBCC";
    String B = "DEFGHI";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case81() {
    String A = "AAIIIAA";
    String B = "BBBBBEF";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case82() {
    String A = "AAA";
    String B = "BAA";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case83() {
    String A = "AAABBBBBBAII";
    String B = "CCCCCCCCCDII";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case84() {
    String A = "ABCABABCDAB";
    String B = "EEDEEEEDFBG";
    assertEquals(4, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case85() {
    String A = "ABAA";
    String B = "EEEE";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case86() {
    String A = "A";
    String B = "B";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case87() {
    String A = "AAAAEEEA";
    String B = "BCBBBBBC";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case88() {
    String A = "ABCD";
    String B = "AAAA";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case89() {
    String A = "AABBC";
    String B = "AABBA";
    assertEquals(1, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case90() {
    String A = "ABBBBCDF";
    String B = "ADDEFDDA";
    assertEquals(5, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case91() {
    String A = "AAAAB";
    String B = "ABCAA";
    assertEquals(3, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case92() {
    String A = "AAAACCCCCC";
    String B = "BBBCBBBBBD";
    assertEquals(4, convertiblestrings.leastRemovals(A, B));
  }

  @Test
  public void case93() {
    String A = "ABCDEFGHI";
    String B = "IHGFEDCBA";
    assertEquals(0, convertiblestrings.leastRemovals(A, B));
  }

}
