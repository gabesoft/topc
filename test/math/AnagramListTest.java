package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class AnagramListTest {
  AnagramList anagramlist = new AnagramList();

  @Test
  public void case1() {
    String s = "tree";
    int i = 1;
    assertEquals("eetr", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case2() {
    String s = "tree";
    int i = 6;
    assertEquals("reet", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case3() {
    String s = "tree";
    int i = 12;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case4() {
    String s = "abcabfebda";
    int i = 5000;
    assertEquals("aadfcabbbe", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case5() {
    String s = "sdoijgfasdkhaiw";
    int i = 2000000000;
    assertEquals("adsdghwiiokfjas", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case6() {
    String s = "a";
    int i = 0;
    assertEquals("a", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case7() {
    String s = "pppppppppppppppppp";
    int i = 1;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case8() {
    String s = "abcdefghijkja";
    int i = 1556755199;
    assertEquals("kjjihgfedcbaa", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case9() {
    String s = "kabfcdefghijk";
    int i = 1556755200;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case10() {
    String s = "f";
    int i = 2000000000;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case11() {
    String s = "wcwwczwwrrzwrcwrcwwz";
    int i = 1876512680;
    assertEquals("zwwwwczrwwwwzcccrrrw", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case12() {
    String s = "uunmuhhhou";
    int i = 14116;
    assertEquals("ouhhuuumhn", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case13() {
    String s = "hrsrqzsrfhhhfhtss";
    int i = 790187153;
    assertEquals("fshhhrzshfsqtrrhs", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case14() {
    String s = "rmqqhmmmnvnarala";
    int i = 1133061591;
    assertEquals("amlnammmvhqrqnra", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case15() {
    String s = "zrxdczabxpuqcmcxbqpm";
    int i = 950222756;
    assertEquals("abbccdcxmzqpurxqpxmz", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case16() {
    String s = "sbkuboddswrwuk";
    int i = 2242816;
    assertEquals("bbdwrsdkksuowu", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case17() {
    String s = "ybjjqlpdbjkljpbqokdp";
    int i = 595439104;
    assertEquals("bbbddlyjkjjpjkplpqoq", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case18() {
    String s = "gtkkvgakgaak";
    int i = 554400;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case19() {
    String s = "vlxfffflxxxxtxxq";
    int i = 86486399;
    assertEquals("xxxxxxxvtqllffff", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case20() {
    String s = "aa";
    int i = 0;
    assertEquals("aa", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case21() {
    String s = "zx";
    int i = 1;
    assertEquals("zx", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case22() {
    String s = "pf";
    int i = 2;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case23() {
    String s = "dtdidtdttitiiitdidti";
    int i = 133024319;
    assertEquals("tttttttiiiiiiidddddd", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case24() {
    String s = "ppppmp";
    int i = 5;
    assertEquals("pppppm", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case25() {
    String s = "tztt";
    int i = 3;
    assertEquals("zttt", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case26() {
    String s = "hkihhhikhihhhkkhhkhk";
    int i = 4537612;
    assertEquals("hihkhhhhkihhkkhkhihk", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case27() {
    String s = "nnnn";
    int i = 0;
    assertEquals("nnnn", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case28() {
    String s = "lnl";
    int i = 1;
    assertEquals("lnl", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case29() {
    String s = "rrrrgggrggrrrrgrrrrr";
    int i = 22066;
    assertEquals("rrgrgggrrrrrggrrrrrr", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case30() {
    String s = "bbt";
    int i = 1;
    assertEquals("btb", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case31() {
    String s = "sisiiiisssissiiiiiis";
    int i = 94579;
    assertEquals("siisssisiiiisssiiiii", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case32() {
    String s = "yyyyy";
    int i = 0;
    assertEquals("yyyyy", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case33() {
    String s = "iua";
    int i = 3;
    assertEquals("iua", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case34() {
    String s = "zzddv";
    int i = 23;
    assertEquals("zdzvd", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case35() {
    String s = "aavva";
    int i = 8;
    assertEquals("vavaa", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case36() {
    String s = "titqtititiitqiitqtii";
    int i = 489115504;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case37() {
    String s = "jjbjbbjbbjjjbjbj";
    int i = 672739871;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case38() {
    String s = "aogtakhatkkoxht";
    int i = 1524299588;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case39() {
    String s = "qhhqhqhqhhhqqhqqhqqh";
    int i = 664745666;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case40() {
    String s = "ieeippeieepiiieipei";
    int i = 551878429;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case41() {
    String s = "ebejbcjb";
    int i = 657997256;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case42() {
    String s = "tyyyyittytittiyytitt";
    int i = 385031039;
    assertEquals("", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case43() {
    String s = "evmtmeececcvpktunpdt";
    int i = 125188934;
    assertEquals("cccdeeevttpumepktnmv", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case44() {
    String s = "lklssjf";
    int i = 855;
    assertEquals("lslfksj", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case45() {
    String s = "eebdttbebbdtdettbd";
    int i = 144060124;
    assertEquals("betebbdebbetdtddtt", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case46() {
    String s = "gbb";
    int i = 2;
    assertEquals("gbb", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case47() {
    String s = "kikikicdbkhbsdsicsod";
    int i = 128695557;
    assertEquals("bbccdksdisikiihsodkk", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case48() {
    String s = "xxrtjdjlyydjlj";
    int i = 175233866;
    assertEquals("xjxryjyldtjljd", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case49() {
    String s = "glgggltgttlgltt";
    int i = 209282;
    assertEquals("gtllggtlggtgttl", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case50() {
    String s = "jssozzsejeioaiorijsj";
    int i = 372066532;
    assertEquals("aeeijossijrsjoojzzis", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case51() {
    String s = "ufcckpuceqqfuecft";
    int i = 16534971;
    assertEquals("ccccfuuqufkftepqe", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case52() {
    String s = "roffficcifcocrof";
    int i = 166950261;
    assertEquals("frocffccciiorffo", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case53() {
    String s = "qwyrwywwqwywhwryh";
    int i = 124438823;
    assertEquals("rywwhwhryywwwwqqy", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case54() {
    String s = "obbtbtoootobttttobto";
    int i = 45688004;
    assertEquals("otbbotttototobottbob", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case55() {
    String s = "xccxcc";
    int i = 13;
    assertEquals("xcxccc", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case56() {
    String s = "mkupqtxfpdydtzxthzdd";
    int i = 1882733733;
    assertEquals("ddddfkhtzqxputzxyptm", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case57() {
    String s = "jimrrzmire";
    int i = 96446;
    assertEquals("riemzmirrj", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case58() {
    String s = "kkkyykikyd";
    int i = 1914;
    assertEquals("kkkidykyyk", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case59() {
    String s = "bbthsdatst";
    int i = 52545;
    assertEquals("dsbashtbtt", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case60() {
    String s = "qnkgylnkzbfyyrqoxypi";
    int i = 453055661;
    assertEquals("bfgikkqzyxryyyqonnlp", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case61() {
    String s = "iyohiohbiozwx";
    int i = 47978149;
    assertEquals("oioyxozhhiwbi", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case62() {
    String s = "vppoyriyiysyiynnyq";
    int i = 742273005;
    assertEquals("iinpyypqonrvysyiyy", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case63() {
    String s = "rrftr";
    int i = 19;
    assertEquals("trrrf", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case64() {
    String s = "nxkjjkjkacenrhjfqqpf";
    int i = 1830109640;
    assertEquals("aceffqkrkjjpnxqjjkhn", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case65() {
    String s = "zzkzhcizhtzkzh";
    int i = 9384197;
    assertEquals("zzkzzkhczhtzih", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case66() {
    String s = "koconcvdkwawwapupa";
    int i = 1996234354;
    assertEquals("aaadkopuwncpovwwck", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case67() {
    String s = "fdvujiutmghoyiufum";
    int i = 338122546;
    assertEquals("dffgmuivhumjyuouit", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case68() {
    String s = "gakgywdjujjjwqmaywky";
    int i = 1901266440;
    assertEquals("aadgjkyjwmjqjwygkuwy", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case69() {
    String s = "fejotloio";
    int i = 34154;
    assertEquals("oeiofoljt", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case70() {
    String s = "mwwmomcgauajcw";
    int i = 283485650;
    assertEquals("mccmmowawwjgau", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case71() {
    String s = "abcdefghijklmnopqrst";
    int i = 2000000000;
    assertEquals("abcdefgljikpmosrnqht", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case72() {
    String s = "abcdefghijklmnopqsr";
    int i = 2000000000;
    assertEquals("abcdefkihjolnrqmpgs", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case73() {
    String s = "aaazzcccdddfffff";
    int i = 403603199;
    assertEquals("zzfffffdddcccaaa", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case74() {
    String s = "sdoijgfasdkhaiw";
    int i = 2000000000;
    assertEquals("adsdghwiiokfjas", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case75() {
    String s = "abcjdaoiemnzdfqpldf";
    int i = 2000000000;
    assertEquals("aabcddnifemflqpjodz", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case76() {
    String s = "ammzadgawagrawdpoawd";
    int i = 2000000000;
    assertEquals("aaaaadwgdgwmdowrmpaz", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case77() {
    String s = "zjghaghsdjgasyuftpid";
    int i = 2000000000;
    assertEquals("aaddfgjgpjszhyhtisgu", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case78() {
    String s = "abcdefghijkmnopqrstu";
    int i = 2000000000;
    assertEquals("abcdefgmjikqnptsorhu", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case79() {
    String s = "abcdesghijslmmobqrst";
    int i = 2000000000;
    assertEquals("abbcdejsrmitlshqmogs", anagramlist.getAnagram(s, i));
  }

  @Test
  public void case80() {
    String s = "abcdefgthiyuhgitvfth";
    int i = 2000000000;
    assertEquals("abcdehvgfituthfgyiht", anagramlist.getAnagram(s, i));
  }

}
