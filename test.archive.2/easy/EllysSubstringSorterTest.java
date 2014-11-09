package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class EllysSubstringSorterTest {
  EllysSubstringSorter ellyssubstringsorter = new EllysSubstringSorter();

  @Test
  public void case1() {
    String S = "TOPCODER";
    int L = 4;
    assertEquals("COPTODER", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case2() {
    String S = "ESPRIT";
    int L = 3;
    assertEquals("EPRSIT", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case3() {
    String S = "AAAAAAAAA";
    int L = 2;
    assertEquals("AAAAAAAAA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case4() {
    String S = "ABRACADABRA";
    int L = 5;
    assertEquals("AAABCRDABRA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case5() {
    String S = "BAZINGA";
    int L = 6;
    assertEquals("ABGINZA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case6() {
    String S = "AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD";
    int L = 21;
    assertEquals("AAAAAABDDDEEIIIJOOSUWWWWDBPOAWDUISAWDOOPAWD", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case7() {
    String S = "AAAAAAAAAAAAAAAAAACB";
    int L = 13;
    assertEquals("AAAAAAAAAAAAAAAAAABC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case8() {
    String S = "WITHOUTITIMJUSTESPRIT";
    int L = 21;
    assertEquals("EHIIIIJMOPRSSTTTTTUUW", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case9() {
    String S = "RIGHTNOWYOUSHOULDBELAUGHING";
    int L = 5;
    assertEquals("GHIRTNOWYOUSHOULDBELAUGHING", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case10() {
    String S = "ZZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    int L = 2;
    assertEquals("ZAZAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case11() {
    String S = "ZZZZZZZZZZZZZZAAAAAAAAAAAAAAA";
    int L = 7;
    assertEquals("ZZZZZZZZAZZZZZZAAAAAAAAAAAAAA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case12() {
    String S = "GOOGLE";
    int L = 3;
    assertEquals("GGOOLE", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case13() {
    String S = "GGNORE";
    int L = 5;
    assertEquals("GEGNOR", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case14() {
    String S = "AZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZ";
    int L = 25;
    assertEquals("AAAAAAAAAAAAAZZZZZZZZZZZZZAZAZAZAZAZAZAZAZAZAZAZAZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case15() {
    String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int L = 13;
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case16() {
    String S = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    int L = 13;
    assertEquals("NOPQRSTUVWXYZMLKJIHGFEDCBA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case17() {
    String S = "TOPCODER";
    int L = 2;
    assertEquals("OTPCODER", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case18() {
    String S = "TOPCODER";
    int L = 3;
    assertEquals("OPTCODER", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case19() {
    String S = "TOPCODER";
    int L = 5;
    assertEquals("COOPTDER", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case20() {
    String S = "TOPCODER";
    int L = 6;
    assertEquals("CDOOPTER", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case21() {
    String S = "TOPCODER";
    int L = 7;
    assertEquals("CDEOOPTR", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case22() {
    String S = "TOPCODER";
    int L = 8;
    assertEquals("CDEOOPRT", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case23() {
    String S = "AAAAAABCDEFKYDETREZAZZYYYRRZ";
    int L = 5;
    assertEquals("AAAAAABCDDEFKYETREZAZZYYYRRZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case24() {
    String S = "HAPJIABBNYDBWHYKZUPCUXMUSH";
    int L = 26;
    assertEquals("AABBBCDHHHIJKMNPPSUUUWXYYZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case25() {
    String S = "WJCZCZBMDDNXROMTVTPUGPDKBKTQDTGFUJCUTPFFMSLDRD";
    int L = 46;
    assertEquals("BBCCCDDDDDDFFFGGJJKKLMMMNOPPPQRRSTTTTTUUUVWXZZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case26() {
    String S = "ODEBLEEALCAPOVM";
    int L = 10;
    assertEquals("ABCDEEELLOAPOVM", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case27() {
    String S = "QLWGMCYVDIKTSXRLBOYUWLNSPYVOPUUFKSXDPYO";
    int L = 18;
    assertEquals("BCDGIKLLMOQRSTVWXYYUWLNSPYVOPUUFKSXDPYO", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case28() {
    String S = "NYGUYUDMVZBMHXVJBRTKBXYCBBJOKET";
    int L = 28;
    assertEquals("BBBBBCDGHJJKMMNORTUUVVXXYYYZKET", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case29() {
    String S = "EEZFSLIPRLZGUKFGGZGGZFYBZYUXGPNTIDXFZTRL";
    int L = 39;
    assertEquals("BDEEFFFFGGGGGGIIKLLNPPRRSTTUUXXYYZZZZZZL", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case30() {
    String S = "MJQKVBP";
    int L = 2;
    assertEquals("JMQKVBP", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case31() {
    String S = "BSIUJWDAWZQSQEFRRZEHTXNGZNKVDFPKEQJRRSJJCNAF";
    int L = 7;
    assertEquals("BADIJSUWWZQSQEFRRZEHTXNGZNKVDFPKEQJRRSJJCNAF", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case32() {
    String S = "JNEHGBWWZAXTOSNCWPMPGBAKSHPLRCUHRZVGLJFM";
    int L = 22;
    assertEquals("ABBCEGGHJMNNOPPSTWWWXZAKSHPLRCUHRZVGLJFM", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case33() {
    String S = "XUUJOMPFJHREEPWJMOJKEXJ";
    int L = 5;
    assertEquals("JOUUXMPFJHREEPWJMOJKEXJ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case34() {
    String S = "MOXPKAYZENMLCTGMQNPKXNADCZDI";
    int L = 23;
    assertEquals("AACEGKKLMMMNNNOPPQTXXYZDCZDI", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case35() {
    String S = "WTBHGHTUHHLETIVAMSDRLOJRAPGVLNRAZKHRPUVTLVFFB";
    int L = 25;
    assertEquals("AABDEGHHHHIJLLMORRSTTTUVWPGVLNRAZKHRPUVTLVFFB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case36() {
    String S = "ISKZBEPWHPIGAEYPLMINCKDMFYQQRQIJHIPRUSEMPAJBZHQWJM";
    int L = 49;
    assertEquals("AABBCDEEEFGHHHIIIIIJJJKKLMMMNPPPPPQQQQRRSSUWWYYZZM", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case37() {
    String S = "PTAJXZEIGOBEDYKBATQDNLBWQXOHKDXTIFMRRREWOPHCCLYCFB";
    int L = 49;
    assertEquals("AABBBCCCDDDEEEFFGHHIIJKKLLMNOOOPPQQRRRTTTWWXXXYYZB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case38() {
    String S = "MQWPJEOFXLIORCZDFMOXPGGOQJVOBDFYM";
    int L = 25;
    assertEquals("CDEFFGGIJLMMOOOOPPQQRWXXZJVOBDFYM", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case39() {
    String S = "PIKPWZSIXCELWZHWPPOIEYKWDYYIMXEMBXXROICIEFPRYZJJJU";
    int L = 49;
    assertEquals("BCCDEEEEFHIIIIIIJJJKKLMMOOPPPPPRRSWWWWXXXXYYYYZZZU", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case40() {
    String S = "VKXMBOODNVBCHECYYZURLLYSPXNMKSDAAMVGNF";
    int L = 22;
    assertEquals("BBCCDEHKLLMNOORUVVXYYZYSPXNMKSDAAMVGNF", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case41() {
    String S = "FZHRQTGBRWVXFXGWGRFXKOMHZMSJVOFZGLOCJTRZSZXDO";
    int L = 34;
    assertEquals("BFFFFGGGGHHJKLMMOOQRRRSTVVWWXXXZZZOCJTRZSZXDO", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case42() {
    String S = "DUZKAAKPDBEIEFLDMLVYOUQBW";
    int L = 10;
    assertEquals("AABDDKKPUZEIEFLDMLVYOUQBW", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case43() {
    String S = "OAEKRSQIMCERSQBCTQKMIXDGXSPUYQLLRTZEATAYVZZ";
    int L = 41;
    assertEquals("AAABCCDEEEGIIKKLLMMOPQQQQRRRSSSTTTUVXXYYZZZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case44() {
    String S = "AHIPXPDIJMUAVVPVIDFITSTZBCRAYSXNIKASIUQBNXFJ";
    int L = 43;
    assertEquals("AAAABBCDDFFHIIIIIIJJKMNNPPPQRSSSTTUUVVVXXXYZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case45() {
    String S = "DEIFIHROLLRMRLQBOPHHMKLIRHHPFQIOAZRCFTCP";
    int L = 17;
    assertEquals("BDEFHIILLLMOOQRRRPHHMKLIRHHPFQIOAZRCFTCP", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case46() {
    String S = "MGSSULCRLYNZVWCJIWELRDONGTTSRCHSXCWSDFCHCIHFM";
    int L = 45;
    assertEquals("CCCCCCDDEFFGGHHHIIJLLLMMNNORRRSSSSSTTUVWWWXYZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case47() {
    String S = "QSBTHMGRJWYMODEWHJWFJEBWMJTYQQHEBHVVKCPQZMB";
    int L = 33;
    assertEquals("BBBDEEEFGHHHJJJJMMMOQQQRSTTWWWWYYHVVKCPQZMB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case48() {
    String S = "QJMYZCMJCTPISYGNRFGZCCCKSZXTJYZPFWQRRKFDXSDJGUXXCP";
    int L = 50;
    assertEquals("CCCCCCDDFFFGGGIJJJJKKMMNPPPQQRRRSSSTTUWXXXXYYYZZZZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case49() {
    String S = "MZJSVLKIGNBLNFKUYBMXKRIXGTIIRSFKY";
    int L = 16;
    assertEquals("BFGIJKKLLMNNSUVZYBMXKRIXGTIIRSFKY", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case50() {
    String S = "DKTNAFKYABRGWVILOU";
    int L = 10;
    assertEquals("AABDFKKNTYRGWVILOU", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case51() {
    String S = "PXUCQGKQLXMDZAICPRGSGGTWLPWUI";
    int L = 4;
    assertEquals("CPUXQGKQLXMDZAICPRGSGGTWLPWUI", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case52() {
    String S = "JQYHZENAWZRMGYLZDPMQCBRJIMJFPVXZJGIRMKHYTGAGHBYM";
    int L = 43;
    assertEquals("AABCDEFGGGHHIIJJJJKLMMMMNPPQQRRRTVWXYYYZZZZGHBYM", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case53() {
    String S = "XFAMNMWNOTCCYBQLGPPUKRCWMBSQUIQZOPGAEQOITLTLUK";
    int L = 35;
    assertEquals("ABBCCCFGGIKLMMMNNOOPPPQQQRSTUUWWXYZAEQOITLTLUK", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case54() {
    String S = "UVUZWGRPMBVXAXJXLMYHNMHWTYIIYVIZVMZRF";
    int L = 12;
    assertEquals("BGMPRUUVVWXZAXJXLMYHNMHWTYIIYVIZVMZRF", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case55() {
    String S = "OBHTIZWOXONCPDPPXFOGEFMZMYXOAMDN";
    int L = 9;
    assertEquals("BHIOOTWXZONCPDPPXFOGEFMZMYXOAMDN", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case56() {
    String S = "OQQEWFJCLOZZZKEDSFKNGIVKGTFJJVTQXGEAFDINNOLSX";
    int L = 11;
    assertEquals("CEFJLOOQQWZZZKEDSFKNGIVKGTFJJVTQXGEAFDINNOLSX", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case57() {
    String S = "ORXQBGZTYPWYTIXLLMJWMIGHAEELTSBGXFYCGSSXPM";
    int L = 13;
    assertEquals("BGOPQRTTWXYYZIXLLMJWMIGHAEELTSBGXFYCGSSXPM", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case58() {
    String S = "SKPAXJRYLEJXWKZMNIVMRZQGJNBOEOJJFXHBZMWMPFO";
    int L = 15;
    assertEquals("AEJJKKLPRSWXXYZMNIVMRZQGJNBOEOJJFXHBZMWMPFO", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case59() {
    String S = "HXQNEGDBUXOHWDDFTADDPMSVLGDPRQGPWWVQFBVQGH";
    int L = 25;
    assertEquals("ABDDDDDEFGHHLMNOPQSTUVWXXGDPRQGPWWVQFBVQGH", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case60() {
    String S = "PHLFDAJNQAJSGEQYWHQXYSIOVWPTOJCGJHMUHZTAYLRJGTN";
    int L = 46;
    assertEquals("AAACDEFGGGHHHHIJJJJJLLMNOOPPQQQRSSTTTUVWWXYYYZN", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case61() {
    String S = "IKWVPQURSOCJNVMJEYRQDHVIMPLUBYTMHWGKRF";
    int L = 36;
    assertEquals("BCDEGHHIIJJKKLMMMNOPPQQRRSTUUVVVWWYYRF", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case62() {
    String S = "WRAVHGANOXWKJUZTZRTXVZZTOXZASJIAOVKIBDFBBOUTKW";
    int L = 38;
    assertEquals("AAAABDGHIIJJKKNOOORRSTTTUVVVWWXXXZZZZZFBBOUTKW", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case63() {
    String S = "RHDNHQUTRLSVDMOHKVJLHJEAZYIY";
    int L = 3;
    assertEquals("DHRNHQUTRLSVDMOHKVJLHJEAZYIY", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case64() {
    String S = "LDHEKMVWCJQVDXGQGSXWEV";
    int L = 21;
    assertEquals("CDDEEGGHJKLMQQSVVWWXXV", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case65() {
    String S = "IPMTQVMSHOTAWBZEAFYFPDDSLKMLCBBXWDNFZYICHQCHMTKSYH";
    int L = 10;
    assertEquals("HIMMOPQSTVTAWBZEAFYFPDDSLKMLCBBXWDNFZYICHQCHMTKSYH", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case66() {
    String S = "HYRTJKBRMWXVRGMWHNSHYYYPIFEWVGOUYFQLBWZIBUVHLGOJJN";
    int L = 49;
    assertEquals("BBBEFFGGGHHHHIIJJJKLLMMNOOPQRRRSTUUVVVWWWWXYYYYYZN", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case67() {
    String S = "PKOFTFGPVCVKXREAGOAYYHIGBFWFXVIWFRKGYVBNGTZBSGVZTH";
    int L = 11;
    assertEquals("CFFGKOPPTVVKXREAGOAYYHIGBFWFXVIWFRKGYVBNGTZBSGVZTH", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case68() {
    String S = "ZQIIHRCGAJEIQAUYSXJCIHSQAKUUJMVAZGYNGKIMXTCFVLCNAT";
    int L = 33;
    assertEquals("AAAACCEGHHIIIIJJJKMQQQRSSUUUVXYZZGYNGKIMXTCFVLCNAT", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case69() {
    String S = "YJKWNCXVJSPTHTLQUCWHDJLTKPOBMZMOSJBFTTGRISCWEYMYKT";
    int L = 3;
    assertEquals("JKYWNCXVJSPTHTLQUCWHDJLTKPOBMZMOSJBFTTGRISCWEYMYKT", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case70() {
    String S = "JIPQODMZBHRSXIPVJRAQHIGKBUWLTTFXPCWQPJAPWNNFYHRAJB";
    int L = 3;
    assertEquals("IJPQODMZBHRSXIPVJRAQHIGKBUWLTTFXPCWQPJAPWNNFYHRAJB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case71() {
    String S = "PCXMHTZFTVUIEFOPUSNDILYBVJLWHWDECFQIBVWTDCLMPUPUOV";
    int L = 30;
    assertEquals("BCDEFFHHIIJLLMNOPPSTTUUVVWWXYZDECFQIBVWTDCLMPUPUOV", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case72() {
    String S = "XJPTWEMUDOMFVWNWXXDBPFRPZSNQRSIFPPYFKGRTWWIVDXKVAR";
    int L = 20;
    assertEquals("BDDEFJMMNOPTUVWWWXXXPFRPZSNQRSIFPPYFKGRTWWIVDXKVAR", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case73() {
    String S = "AIYOXTGHGLWWGVPTERSTGHMELPZBLFIBOEKVQVZHDLNJWUIMSL";
    int L = 16;
    assertEquals("AEGGGHILOPTTVWWXYRSTGHMELPZBLFIBOEKVQVZHDLNJWUIMSL", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case74() {
    String S = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZYX";
    int L = 20;
    assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAXYZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case75() {
    String S = "XXYYWWVVUUTTSSRRQQPPOONNMMLLKKJJIIHHGGFFEEDDCCBBAA";
    int L = 50;
    assertEquals("AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYY", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case76() {
    String S = "ABA";
    int L = 2;
    assertEquals("AAB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case77() {
    String S = "NITIN";
    int L = 2;
    assertEquals("INTIN", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case78() {
    String S = "AAACBA";
    int L = 3;
    assertEquals("AAAABC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case79() {
    String S = "ZZZA";
    int L = 2;
    assertEquals("ZZAZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case80() {
    String S = "TC";
    int L = 2;
    assertEquals("CT", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case81() {
    String S = "AAZYX";
    int L = 3;
    assertEquals("AAXYZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case82() {
    String S = "ACA";
    int L = 2;
    assertEquals("AAC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case83() {
    String S = "DADADSABSCS";
    int L = 5;
    assertEquals("AADDDSABSCS", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case84() {
    String S = "ACBA";
    int L = 3;
    assertEquals("AABC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case85() {
    String S = "ZA";
    int L = 2;
    assertEquals("AZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case86() {
    String S = "ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDAB";
    int L = 2;
    assertEquals("ABCADBCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDAB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case87() {
    String S = "BBBA";
    int L = 2;
    assertEquals("BBAB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case88() {
    String S = "EFGHA";
    int L = 4;
    assertEquals("EAFGH", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case89() {
    String S = "AAACCB";
    int L = 4;
    assertEquals("AAABCC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case90() {
    String S = "BBBBBBA";
    int L = 2;
    assertEquals("BBBBBAB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case91() {
    String S = "BA";
    int L = 2;
    assertEquals("AB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case92() {
    String S = "DCBA";
    int L = 4;
    assertEquals("ABCD", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case93() {
    String S = "AA";
    int L = 2;
    assertEquals("AA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case94() {
    String S = "AAAWQEA";
    int L = 4;
    assertEquals("AAAAEQW", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case95() {
    String S = "ADBC";
    int L = 3;
    assertEquals("ABCD", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case96() {
    String S = "ABCDC";
    int L = 2;
    assertEquals("ABCCD", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case97() {
    String S = "ZZZZZZZCBA";
    int L = 3;
    assertEquals("ZZZZZCZZBA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case98() {
    String S = "SALAM";
    int L = 5;
    assertEquals("AALMS", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case99() {
    String S = "ZZA";
    int L = 2;
    assertEquals("ZAZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case100() {
    String S = "ZZZBC";
    int L = 3;
    assertEquals("ZBZZC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case101() {
    String S = "AAAABA";
    int L = 2;
    assertEquals("AAAAAB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case102() {
    String S = "CCCCCA";
    int L = 2;
    assertEquals("CCCCAC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case103() {
    String S = "BBA";
    int L = 2;
    assertEquals("BAB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case104() {
    String S = "OQPWEKPAFKPDOWAEKPRAAAAASSDS";
    int L = 4;
    assertEquals("OEPQWKPAFKPDOWAEKPRAAAAASSDS", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case105() {
    String S = "AAACBA";
    int L = 2;
    assertEquals("AAABCA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case106() {
    String S = "BCA";
    int L = 3;
    assertEquals("ABC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case107() {
    String S = "AAAZB";
    int L = 2;
    assertEquals("AAABZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case108() {
    String S = "ZZZZZZZZZZA";
    int L = 3;
    assertEquals("ZZZZZZZZAZZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case109() {
    String S = "RA";
    int L = 2;
    assertEquals("AR", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case110() {
    String S = "ZZZZZCBA";
    int L = 3;
    assertEquals("ZZZCZZBA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case111() {
    String S = "ACB";
    int L = 2;
    assertEquals("ABC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case112() {
    String S = "CBAD";
    int L = 4;
    assertEquals("ABCD", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case113() {
    String S = "BCA";
    int L = 2;
    assertEquals("BAC", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case114() {
    String S = "ZZZZZZZCBA";
    int L = 10;
    assertEquals("ABCZZZZZZZ", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case115() {
    String S = "AAA";
    int L = 3;
    assertEquals("AAA", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case116() {
    String S = "XYZAB";
    int L = 4;
    assertEquals("AXYZB", ellyssubstringsorter.getMin(S, L));
  }

  @Test
  public void case117() {
    String S = "AABAB";
    int L = 2;
    assertEquals("AAABB", ellyssubstringsorter.getMin(S, L));
  }

}
