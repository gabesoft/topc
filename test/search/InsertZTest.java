package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class InsertZTest {
  InsertZ insertz = new InsertZ();

  @Test
  public void case1() {
    String init = "fox";
    String goal = "fozx";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case2() {
    String init = "fox";
    String goal = "zfzoxzz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case3() {
    String init = "topcoder";
    String goal = "zopzoder";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case4() {
    String init = "aaaaaaaaaa";
    String goal = "a";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case5() {
    String init = "mvixrdnrpxowkasufnvxaq";
    String goal = "mvizzxzzzrdzznzrpxozzwzzkazzzszzuzzfnvxzzzazzq";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case6() {
    String init = "opdlfmvuicjsierjowdvnx";
    String goal = "zzopzdlfmvzuicjzzsizzeijzowvznxzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case7() {
    String init = "x";
    String goal = "x";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case8() {
    String init = "ndan";
    String goal = "nzdan";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case9() {
    String init = "bxcvums";
    String goal = "bxzzcvzums";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case10() {
    String init = "fcqgmppogt";
    String goal = "fcqzzgmzppozgt";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case11() {
    String init = "wpnimxqiaxylw";
    String goal = "wzpnimzzxzqiazxyzlw";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case12() {
    String init = "ahsibfwkstkurdfj";
    String goal = "zahzzsizbfwkzsztkzurdfj";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case13() {
    String init = "ghsmcdarcupumnoulky";
    String goal = "ghsmcdazrcuzzpumzznzoulzzkyz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case14() {
    String init = "wvifonhhyqafvemhxivpip";
    String goal = "wvizzzzzzfonhzhzyqzafzvemhxivpip";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case15() {
    String init = "ngrfrekumpnciibqwvaegapkg";
    String goal = "nzgrfrzezkzzzumpncizizbzqwvaegapkzzzg";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case16() {
    String init = "vusmnfldjhxtpvppxhwubwpbehau";
    String goal = "vzuzsmnzfzzldjhzxtzzpvpzpzxhzwubwpbzzehau";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case17() {
    String init = "vvmvytymubymxwssblendjvwhuxygqv";
    String goal = "zzvvzmvyztzzyzmzubyzmzxwzzssblendjvzwzhuxygzqv";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case18() {
    String init = "cvajeeugmdwyllxptyxfmkkhcipklmuihtofaqnnhqystdkewe";
    String goal = "cvajeeugmdwyllxptyxfmkkhcipklmuihtofaqnnhqystdkewe";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case19() {
    String init = "q";
    String goal = "zzzzzzzzzzzzzqzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case20() {
    String init = "eg";
    String goal = "zzzzzzzzzzzzzzezzzzzzzzzzzzzzzzzzzzzzzzzzzzzzgzzzz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case21() {
    String init = "qrl";
    String goal = "zzzzzzzzzzzqzzzzzzzzzzzzzzzzzzzzrzzzzzzzzzlzzzzzzz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case22() {
    String init = "pkwvedmmsscwqtrmqxnlwevxjppkeckchjnbqdeaffwngahmt";
    String goal = "pkwvedmmsscwqtzrmqxnlwevxjppkeckchjnbqdeaffwngahmt";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case23() {
    String init = "uydqvkkobpsqflbwpqijkmtexorlrsuvkwexppumruvwgtif";
    String goal = "uydqzvkkobpsqflbwpqijkmtexorlrsuvzkwexppumruvwgtif";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case24() {
    String init = "lhdnxjvcvnmgbcbdhlogvvkukvunommrjwcexurcevwghot";
    String goal = "lhdnxzjvcvnmgbzcbdhlogvvkuzkvunommrjwcexurcevwghot";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case25() {
    String init = "wctuyccvjqphbtikemcprjrwt";
    String goal = "wctuzyczzczvzjqphbztzzzzizzzkzemzcprjzzrzzzzwzztzz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case26() {
    String init = "fyjuklwagdcwegctokydjmeoe";
    String goal = "fzyzjuzkzzlwazzzzgzdczzwzegczzzztokzydjmzzzezzzzoe";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case27() {
    String init = "nnbwepkoafduxkkmljwevnrxc";
    String goal = "nznbzwezpkzzozzzazfduxzkzkzmzzzljwzevzzzzzzznzrxcz";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case28() {
    String init = "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
    String goal = "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrzrrrrrrrrrrrrrr";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case29() {
    String init = "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
    String goal = "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case30() {
    String init = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String goal = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case31() {
    String init = "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
    String goal = "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case32() {
    String init = "l";
    String goal = "illzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case33() {
    String init = "vppvo";
    String goal = "vvypzzpv";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case34() {
    String init = "mfxxvfxvx";
    String goal = "fmzffvvvmvz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case35() {
    String init = "dodpovdpodooo";
    String goal = "zvodovpzddpodp";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case36() {
    String init = "guguiugccicguicuu";
    String goal = "ciggzuccgzugiguuc";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case37() {
    String init = "ggkfkgifgkkgfkfkkfiig";
    String goal = "gigiiikikzzkkffgggkf";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case38() {
    String init = "ibccibybiyiyybcibicbycici";
    String goal = "ciyizbzcccyybicciycyyyb";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case39() {
    String init = "piixppixiqppxiqpxqpxppxiqxxxq";
    String goal = "xqqxxzqqpipixpxixpizqiipqp";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case40() {
    String init = "sxxxxaaxsaaaaaapxpsappxxxsssxssap";
    String goal = "paaapasspaasaapzxpapapssaazps";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case41() {
    String init = "bpbipbsppbsbbibiiiipbppbbpisipibsbipb";
    String goal = "pzppsbbsbsbbsssbspppbbziipbbiipi";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case42() {
    String init = "yyyxyxxxxyyxyyxxyyxxxyyyxyyyyyxyxxyyxxxxyxxxxxxxxy";
    String goal = "yyxxyxxyyyxxxyyyxyxxyyxyyxyyxyxyxyyyxyyyxxxyyxxxxx";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case43() {
    String init = "pppgpjgjpjjgpgppjpggpjggpppgjjgpppppjggpjpppgjpgpp";
    String goal = "jpppggggggggpjggpjpjgpjjgpjpgggpgjpggjgppggjjppjgp";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case44() {
    String init = "lolbdlllbobbolboddoddblollbbbldlbblobddlloolldlbbd";
    String goal = "bbbdoobbdodbblobbobobloldooololddlddblboblodbobbol";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case45() {
    String init = "hhcifkiihfikcckkkhikffhihikfifkfikckfciifkikickchk";
    String goal = "kifcfhficihihchichkckihkffichkcihfikchififikiifckc";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case46() {
    String init = "s";
    String goal = "stsssttstttssttsttttsststttttttststtstttsssssststt";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case47() {
    String init = "a";
    String goal = "maapaammpmmamappmmmmammaamppammppaappppmppaaapmmap";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case48() {
    String init = "s";
    String goal = "vsyvvyymmysvsyvysyssyvsvymmyysyvsymvsymsvvvvyssvmv";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case49() {
    String init = "s";
    String goal = "ddsfsmsfismfmidfiimsdimmdmmdmfimdimssdmsimddmdfmss";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case50() {
    String init = "g";
    String goal = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case51() {
    String init = "bdjblplvwmldthuytgcptorlswoyplhiuhjdkrnqssrdnwhwlu";
    String goal = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case52() {
    String init = "deproefcgvwbxtlyprvouovpklucrnsytexffhqjuhdiyutamp";
    String goal = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzszz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case53() {
    String init = "bibymqkuhqmnnamafgjcnnshhugiyljrsqacjvpabovpxwfwbg";
    String goal = "zzzzzzzzzzzzkzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzozz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case54() {
    String init = "lhbwjwvtstnutpyvriqoiblggniaignipjtbetodiprgwtpids";
    String goal = "zzjzzzzzzzzzzznzzzzzzzzzzzjzzzzzzzzzzzzzzzzzzzzzzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case55() {
    String init = "vhcxsicvhoharvkawougxaiqihgawfhhfeifxongenhiuxwvmw";
    String goal = "szzzkzzzzzzzzzzzzzzzzzzzzzzzzzzzzzlzzzzzzzzfzzzzzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case56() {
    String init = "foon";
    String goal = "foon";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case57() {
    String init = "abc";
    String goal = "abc";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case58() {
    String init = "ab";
    String goal = "zba";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case59() {
    String init = "asdf";
    String goal = "asdf";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case60() {
    String init = "aaaaaaaa";
    String goal = "a";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case61() {
    String init = "as";
    String goal = "sa";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case62() {
    String init = "ab";
    String goal = "ba";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case63() {
    String init = "kcythetopcoder";
    String goal = "topthekcycoder";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case64() {
    String init = "fox";
    String goal = "xof";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case65() {
    String init = "baa";
    String goal = "aabz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case66() {
    String init = "aba";
    String goal = "aabz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case67() {
    String init = "f";
    String goal = "ff";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case68() {
    String init = "xof";
    String goal = "fzox";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case69() {
    String init = "fox";
    String goal = "zzxof";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case70() {
    String init = "fox";
    String goal = "foxn";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case71() {
    String init = "fox";
    String goal = "fozxx";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case72() {
    String init = "cc";
    String goal = "czc";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case73() {
    String init = "abcd";
    String goal = "dcba";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case74() {
    String init = "ab";
    String goal = "az";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case75() {
    String init = "a";
    String goal = "aa";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case76() {
    String init = "aba";
    String goal = "baa";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case77() {
    String init = "aaa";
    String goal = "aa";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case78() {
    String init = "f";
    String goal = "zzzzzzzzk";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case79() {
    String init = "abc";
    String goal = "abcza";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case80() {
    String init = "b";
    String goal = "az";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case81() {
    String init = "a";
    String goal = "a";
    assertEquals("Yes", insertz.canTransform(init, goal));
  }

  @Test
  public void case82() {
    String init = "abc";
    String goal = "cba";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case83() {
    String init = "fox";
    String goal = "foxxyz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case84() {
    String init = "abc";
    String goal = "abczzzzzzzzzzzzzzza";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case85() {
    String init = "abc";
    String goal = "abcd";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case86() {
    String init = "aaabaaa";
    String goal = "aaaaaba";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case87() {
    String init = "fox";
    String goal = "wfzoxzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case88() {
    String init = "a";
    String goal = "ak";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case89() {
    String init = "a";
    String goal = "zba";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case90() {
    String init = "fox";
    String goal = "chchfox";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case91() {
    String init = "fox";
    String goal = "fxo";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case92() {
    String init = "fox";
    String goal = "fxozzzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case93() {
    String init = "xy";
    String goal = "zyxzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case94() {
    String init = "abcd";
    String goal = "aabcd";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case95() {
    String init = "abc";
    String goal = "abcdz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case96() {
    String init = "fox";
    String goal = "foxxxxxxx";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case97() {
    String init = "ab";
    String goal = "baz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case98() {
    String init = "aaa";
    String goal = "aaaa";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case99() {
    String init = "fox";
    String goal = "foxx";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case100() {
    String init = "abca";
    String goal = "aazzbc";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case101() {
    String init = "ab";
    String goal = "zzatab";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case102() {
    String init = "fox";
    String goal = "fobx";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case103() {
    String init = "aa";
    String goal = "aaa";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case104() {
    String init = "fox";
    String goal = "foxzy";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case105() {
    String init = "abcd";
    String goal = "zzbcdazz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case106() {
    String init = "fox";
    String goal = "zozfxzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case107() {
    String init = "abc";
    String goal = "abdz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case108() {
    String init = "top";
    String goal = "potz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case109() {
    String init = "fox";
    String goal = "fooooox";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case110() {
    String init = "ba";
    String goal = "ab";
    assertEquals("No", insertz.canTransform(init, goal));
  }

  @Test
  public void case111() {
    String init = "ba";
    String goal = "abzz";
    assertEquals("No", insertz.canTransform(init, goal));
  }

}
