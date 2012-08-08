package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class LexStringWriterTest {
  LexStringWriter lexstringwriter = new LexStringWriter();

  @Test
  public void case1() {
    String s = "aaa";
    assertEquals(5, lexstringwriter.minMoves(s));
  }

  @Test
  public void case2() {
    String s = "ba";
    assertEquals(4, lexstringwriter.minMoves(s));
  }

  @Test
  public void case3() {
    String s = "abba";
    assertEquals(9, lexstringwriter.minMoves(s));
  }

  @Test
  public void case4() {
    String s = "acbbc";
    assertEquals(12, lexstringwriter.minMoves(s));
  }

  @Test
  public void case5() {
    String s = "a";
    assertEquals(1, lexstringwriter.minMoves(s));
  }

  @Test
  public void case6() {
    String s = "bb";
    assertEquals(3, lexstringwriter.minMoves(s));
  }

  @Test
  public void case7() {
    String s = "bba";
    assertEquals(7, lexstringwriter.minMoves(s));
  }

  @Test
  public void case8() {
    String s = "abbc";
    assertEquals(7, lexstringwriter.minMoves(s));
  }

  @Test
  public void case9() {
    String s = "abbcc";
    assertEquals(9, lexstringwriter.minMoves(s));
  }

  @Test
  public void case10() {
    String s = "cdaccb";
    assertEquals(17, lexstringwriter.minMoves(s));
  }

  @Test
  public void case11() {
    String s = "cdaccbc";
    assertEquals(20, lexstringwriter.minMoves(s));
  }

  @Test
  public void case12() {
    String s = "adecadbb";
    assertEquals(26, lexstringwriter.minMoves(s));
  }

  @Test
  public void case13() {
    String s = "adecadbbe";
    assertEquals(33, lexstringwriter.minMoves(s));
  }

  @Test
  public void case14() {
    String s = "aebffffddc";
    assertEquals(32, lexstringwriter.minMoves(s));
  }

  @Test
  public void case15() {
    String s = "aebffffddcf";
    assertEquals(37, lexstringwriter.minMoves(s));
  }

  @Test
  public void case16() {
    String s = "fceceacbgcbc";
    assertEquals(48, lexstringwriter.minMoves(s));
  }

  @Test
  public void case17() {
    String s = "fceceacbgcbca";
    assertEquals(59, lexstringwriter.minMoves(s));
  }

  @Test
  public void case18() {
    String s = "fgbefceaegccde";
    assertEquals(61, lexstringwriter.minMoves(s));
  }

  @Test
  public void case19() {
    String s = "fgbefceaegccdeh";
    assertEquals(67, lexstringwriter.minMoves(s));
  }

  @Test
  public void case20() {
    String s = "ghecicidgcficbif";
    assertEquals(90, lexstringwriter.minMoves(s));
  }

  @Test
  public void case21() {
    String s = "ghecicidgcficbife";
    assertEquals(93, lexstringwriter.minMoves(s));
  }

  @Test
  public void case22() {
    String s = "aijhfdbbjehhdcfeef";
    assertEquals(88, lexstringwriter.minMoves(s));
  }

  @Test
  public void case23() {
    String s = "aijhfdbbjehhdcfeefb";
    assertEquals(99, lexstringwriter.minMoves(s));
  }

  @Test
  public void case24() {
    String s = "agifgccgcacccfcbgfjk";
    assertEquals(95, lexstringwriter.minMoves(s));
  }

  @Test
  public void case25() {
    String s = "agifgccgcacccfcbgfjkk";
    assertEquals(97, lexstringwriter.minMoves(s));
  }

  @Test
  public void case26() {
    String s = "aebllfljdcfffkliedfiha";
    assertEquals(145, lexstringwriter.minMoves(s));
  }

  @Test
  public void case27() {
    String s = "aebllfljdcfffkliedfihai";
    assertEquals(150, lexstringwriter.minMoves(s));
  }

  @Test
  public void case28() {
    String s = "ffkiajhcdddkiceafgilbcji";
    assertEquals(169, lexstringwriter.minMoves(s));
  }

  @Test
  public void case29() {
    String s = "ffkiajhcdddkiceafgilbcjim";
    assertEquals(175, lexstringwriter.minMoves(s));
  }

  @Test
  public void case30() {
    String s = "mcljlhjbncbjhclakhnabkklcc";
    assertEquals(172, lexstringwriter.minMoves(s));
  }

  @Test
  public void case31() {
    String s = "mcljlhjbncbjhclakhnabkklccn";
    assertEquals(181, lexstringwriter.minMoves(s));
  }

  @Test
  public void case32() {
    String s = "anecfilgjoccihfoealfndocckdh";
    assertEquals(255, lexstringwriter.minMoves(s));
  }

  @Test
  public void case33() {
    String s = "anecfilgjoccihfoealfndocckdhm";
    assertEquals(287, lexstringwriter.minMoves(s));
  }

  @Test
  public void case34() {
    String s = "lndjkeibjmfegjppoapcefcfclaaia";
    assertEquals(284, lexstringwriter.minMoves(s));
  }

  @Test
  public void case35() {
    String s = "lndjkeibjmfegjppoapcefcfclaaiap";
    assertEquals(297, lexstringwriter.minMoves(s));
  }

  @Test
  public void case36() {
    String s = "bldcnqcdbajqlmiqdgdgnnbqdpdjcekm";
    assertEquals(297, lexstringwriter.minMoves(s));
  }

  @Test
  public void case37() {
    String s = "bldcnqcdbajqlmiqdgdgnnbqdpdjcekmk";
    assertEquals(302, lexstringwriter.minMoves(s));
  }

  @Test
  public void case38() {
    String s = "gqnlrlrdpcfrlkroepfcnacfikpqarllfl";
    assertEquals(329, lexstringwriter.minMoves(s));
  }

  @Test
  public void case39() {
    String s = "gqnlrlrdpcfrlkroepfcnacfikpqarllflo";
    assertEquals(355, lexstringwriter.minMoves(s));
  }

  @Test
  public void case40() {
    String s = "gfhlkoffgcsrphrhikssasdpkrdmcgkjerob";
    assertEquals(387, lexstringwriter.minMoves(s));
  }

  @Test
  public void case41() {
    String s = "gfhlkoffgcsrphrhikssasdpkrdmcgkjerobm";
    assertEquals(392, lexstringwriter.minMoves(s));
  }

  @Test
  public void case42() {
    String s = "aijhpnlbtorrncpeepbadiehmadcmdffrhccfn";
    assertEquals(350, lexstringwriter.minMoves(s));
  }

  @Test
  public void case43() {
    String s = "aijhpnlbtorrncpeepbadiehmadcmdffrhccfns";
    assertEquals(377, lexstringwriter.minMoves(s));
  }

  @Test
  public void case44() {
    String s = "mqeclocpgcicoqlokauobdrlcqgtjuorcolrdokp";
    assertEquals(412, lexstringwriter.minMoves(s));
  }

  @Test
  public void case45() {
    String s = "mqeclocpgcicoqlokauobdrlcqgtjuorcolrdokpo";
    assertEquals(415, lexstringwriter.minMoves(s));
  }

  @Test
  public void case46() {
    String s = "agtfrnnrnannnqnmgfjkvssjkebgopblbvmqpdcnil";
    assertEquals(391, lexstringwriter.minMoves(s));
  }

  @Test
  public void case47() {
    String s = "agtfrnnrnannnqnmgfjkvssjkebgopblbvmqpdcnilb";
    assertEquals(400, lexstringwriter.minMoves(s));
  }

  @Test
  public void case48() {
    String s = "ijwnkwmffprrreuimahbpjhwidmdubjemdcqpbobklwe";
    assertEquals(510, lexstringwriter.minMoves(s));
  }

  @Test
  public void case49() {
    String s = "ijwnkwmffprrreuimahbpjhwidmdubjemdcqpbobklweg";
    assertEquals(557, lexstringwriter.minMoves(s));
  }

  @Test
  public void case50() {
    String s = "aenxlfljpoffrwxuedrihauluepkmxrfflcovfkdihlcwd";
    assertEquals(575, lexstringwriter.minMoves(s));
  }

  @Test
  public void case51() {
    String s = "aenxlfljpoffrwxuedrihauluepkmxrfflcovfkdihlcwdk";
    assertEquals(584, lexstringwriter.minMoves(s));
  }

  @Test
  public void case52() {
    String s = "kxewpdqlteccxmutjaqusnywckdhrxuummcmadnkkaffxqyl";
    assertEquals(618, lexstringwriter.minMoves(s));
  }

  @Test
  public void case53() {
    String s = "kxewpdqlteccxmutjaqusnywckdhrxuummcmadnkkaffxqylm";
    assertEquals(639, lexstringwriter.minMoves(s));
  }

  @Test
  public void case54() {
    String s = "ssxvnjhpdqdxvcrastvybcwvmgnykrxvzxkgxtspsjdgyluegq";
    assertEquals(642, lexstringwriter.minMoves(s));
  }

  @Test
  public void case55() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertEquals(99, lexstringwriter.minMoves(s));
  }

  @Test
  public void case56() {
    String s = "bbabbababbaaabbbbabaaaaaabaababbaabaaabbbbabbbbbba";
    assertEquals(148, lexstringwriter.minMoves(s));
  }

  @Test
  public void case57() {
    String s = "abbccccaaccccbccbaccbacccbabacccccccacbacbccbabbba";
    assertEquals(189, lexstringwriter.minMoves(s));
  }

  @Test
  public void case58() {
    String s = "cdaccbcacdbbbcdddadabbabacaacadcabcbbadddcbdcdccda";
    assertEquals(243, lexstringwriter.minMoves(s));
  }

  @Test
  public void case59() {
    String s = "adecadbbeeccdcaeeabaddeccadccdaaccccaddaaaaadbebcc";
    assertEquals(280, lexstringwriter.minMoves(s));
  }

  @Test
  public void case60() {
    String s = "aebffffddcfffefcedfcbacfcedeafffffccdfedcbfcedeeea";
    assertEquals(325, lexstringwriter.minMoves(s));
  }

  @Test
  public void case61() {
    String s = "fceceacbgcbcaceadagabddeccgfcgadcaeddadbafdagbfaga";
    assertEquals(350, lexstringwriter.minMoves(s));
  }

  @Test
  public void case62() {
    String s = "fgbefceaegccdehhhahbccbcbfaaeaheacfcdaghhfdgfhfega";
    assertEquals(398, lexstringwriter.minMoves(s));
  }

  @Test
  public void case63() {
    String s = "ghecicidgcficbifegfceacfibghaiccfcfcgcegchicbdbhbg";
    assertEquals(440, lexstringwriter.minMoves(s));
  }

  @Test
  public void case64() {
    String s = "aijhfdbbjehhdcfeefbadiehcadccdffhhccfdifaffaibegcc";
    assertEquals(474, lexstringwriter.minMoves(s));
  }

  @Test
  public void case65() {
    String s = "agifgccgcacccfcbgfjkkhhjkebgdebabkbfedcciabcfbgcif";
    assertEquals(451, lexstringwriter.minMoves(s));
  }

  @Test
  public void case66() {
    String s = "aebllfljdcfffkliedfihailiedkalffflccjfkdihlckdkeeg";
    assertEquals(489, lexstringwriter.minMoves(s));
  }

  @Test
  public void case67() {
    String s = "ffkiajhcdddkiceafgilbcjimgalkekimkkgkgfcfjdgllhegd";
    assertEquals(516, lexstringwriter.minMoves(s));
  }

  @Test
  public void case68() {
    String s = "mcljlhjbncbjhclakhnabkklccnmcnhdjhekdhkbafdagbmaga";
    assertEquals(426, lexstringwriter.minMoves(s));
  }

  @Test
  public void case69() {
    String s = "anecfilgjoccihfoealfndocckdhmiffccccainafkffngebhm";
    assertEquals(576, lexstringwriter.minMoves(s));
  }

  @Test
  public void case70() {
    String s = "lndjkeibjmfegjppoapcefcfclaaiapjbekegampplhnlpljna";
    assertEquals(603, lexstringwriter.minMoves(s));
  }

  @Test
  public void case71() {
    String s = "bldcnqcdbajqlmiqdgdgnnbqdpdjcekmkfedplbjmiepfehehg";
    assertEquals(519, lexstringwriter.minMoves(s));
  }

  @Test
  public void case72() {
    String s = "gqnlrlrdpcfrlkroepfcnacfikpqarllflocplepchrckdkqkg";
    assertEquals(580, lexstringwriter.minMoves(s));
  }

  @Test
  public void case73() {
    String s = "gfhlkoffgcsrphrhikssasdpkrdmcgkjerobmmhmmoifleacgs";
    assertEquals(609, lexstringwriter.minMoves(s));
  }

  @Test
  public void case74() {
    String s = "aijhpnlbtorrncpeepbadiehmadcmdffrhccfnspappksloqmc";
    assertEquals(688, lexstringwriter.minMoves(s));
  }

  @Test
  public void case75() {
    String s = "mqeclocpgcicoqlokauobdrlcqgtjuorcolrdokpotronpthna";
    assertEquals(636, lexstringwriter.minMoves(s));
  }

  @Test
  public void case76() {
    String s = "agtfrnnrnannnqnmgfjkvssjkebgopblbvmqpdcnilbcqbgciq";
    assertEquals(459, lexstringwriter.minMoves(s));
  }

  @Test
  public void case77() {
    String s = "ijwnkwmffprrreuimahbpjhwidmdubjemdcqpbobklwegqkjtt";
    assertEquals(676, lexstringwriter.minMoves(s));
  }

  @Test
  public void case78() {
    String s = "aenxlfljpoffrwxuedrihauluepkmxrfflcovfkdihlcwdkqqg";
    assertEquals(651, lexstringwriter.minMoves(s));
  }

  @Test
  public void case79() {
    String s = "kxewpdqlteccxmutjaqusnywckdhrxuummcmadnkkaffxqylmm";
    assertEquals(642, lexstringwriter.minMoves(s));
  }

  @Test
  public void case80() {
    String s = "ssxvnjhpdqdxvcrastvybcwvmgnykrxvzxkgxtspsjdgyluegq";
    assertEquals(642, lexstringwriter.minMoves(s));
  }

  @Test
  public void case81() {
    String s = "azzbcdzzzzzzzzzzzzzzzzzzzazzzbdzzzzzzzzzzzzzzzzzza";
    assertEquals(237, lexstringwriter.minMoves(s));
  }

  @Test
  public void case82() {
    String s = "sdfhfdhuifwheifhsidhfkjshdfkjhsdfuiwhifuhdkvnbn";
    assertEquals(429, lexstringwriter.minMoves(s));
  }

  @Test
  public void case83() {
    String s = "cbab";
    assertEquals(10, lexstringwriter.minMoves(s));
  }

  @Test
  public void case84() {
    String s = "aabbbbabbzbzzzzeoirutotriyuoriuytbazbabzabzzzzaaab";
    assertEquals(285, lexstringwriter.minMoves(s));
  }

  @Test
  public void case85() {
    String s = "dcabcd";
    assertEquals(19, lexstringwriter.minMoves(s));
  }

  @Test
  public void case86() {
    String s = "dabdcdee";
    assertEquals(23, lexstringwriter.minMoves(s));
  }

  @Test
  public void case87() {
    String s = "abcasdadasdadasdasd";
    assertEquals(81, lexstringwriter.minMoves(s));
  }

  @Test
  public void case88() {
    String s = "abdghihihihihiijkjkjihihbegfegdegddhehdebgbcabacah";
    assertEquals(428, lexstringwriter.minMoves(s));
  }

  @Test
  public void case89() {
    String s = "acbbcd";
    assertEquals(15, lexstringwriter.minMoves(s));
  }

  @Test
  public void case90() {
    String s = "abbcadadb";
    assertEquals(30, lexstringwriter.minMoves(s));
  }

  @Test
  public void case91() {
    String s = "dfafasfasfsadfdsfsdafdsahdsgfd";
    assertEquals(143, lexstringwriter.minMoves(s));
  }

  @Test
  public void case92() {
    String s = "bbabc";
    assertEquals(13, lexstringwriter.minMoves(s));
  }

  @Test
  public void case93() {
    String s = "ffffffggggaaakkkgggaaaggggfff";
    assertEquals(122, lexstringwriter.minMoves(s));
  }

  @Test
  public void case94() {
    String s = "acbabbbb";
    assertEquals(21, lexstringwriter.minMoves(s));
  }

  @Test
  public void case95() {
    String s = "acbbc";
    assertEquals(12, lexstringwriter.minMoves(s));
  }

  @Test
  public void case96() {
    String s = "bdabccc";
    assertEquals(22, lexstringwriter.minMoves(s));
  }

  @Test
  public void case97() {
    String s = "pzzapaxxdsaspdfsdzzadpasdddazzpaazpzdd";
    assertEquals(225, lexstringwriter.minMoves(s));
  }

  @Test
  public void case98() {
    String s = "zxyzxyzxyfedcba";
    assertEquals(57, lexstringwriter.minMoves(s));
  }

  @Test
  public void case99() {
    String s = "abcdzefghmijklamnopqrstouvwxyz";
    assertEquals(128, lexstringwriter.minMoves(s));
  }

  @Test
  public void case100() {
    String s = "dhhhffjemffhcfmkledcfhlevlgmefgt";
    assertEquals(248, lexstringwriter.minMoves(s));
  }

  @Test
  public void case101() {
    String s = "adcbcef";
    assertEquals(19, lexstringwriter.minMoves(s));
  }

  @Test
  public void case102() {
    String s = "accb";
    assertEquals(9, lexstringwriter.minMoves(s));
  }

  @Test
  public void case103() {
    String s = "acbadb";
    assertEquals(18, lexstringwriter.minMoves(s));
  }

  @Test
  public void case104() {
    String s = "bcdebahb";
    assertEquals(28, lexstringwriter.minMoves(s));
  }

  @Test
  public void case105() {
    String s = "zxcvbnmasadfghjklpoiuytrewqwertyyuuioighcbvxzsfgfg";
    assertEquals(698, lexstringwriter.minMoves(s));
  }

  @Test
  public void case106() {
    String s = "ababc";
    assertEquals(11, lexstringwriter.minMoves(s));
  }

  @Test
  public void case107() {
    String s = "asdffdsedfsxcsdsaasdfxz";
    assertEquals(135, lexstringwriter.minMoves(s));
  }

  @Test
  public void case108() {
    String s = "baabc";
    assertEquals(13, lexstringwriter.minMoves(s));
  }

  @Test
  public void case109() {
    String s = "uabcdefabcdefeasddaqedzasqszadueqezcgsadsfudasdfu";
    assertEquals(465, lexstringwriter.minMoves(s));
  }

  @Test
  public void case110() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertEquals(99, lexstringwriter.minMoves(s));
  }

}
