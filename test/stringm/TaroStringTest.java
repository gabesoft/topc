package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class TaroStringTest {
  TaroString tarostring = new TaroString();

  @Test
  public void case1() {
    String S = "XCYAZTX";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case2() {
    String S = "CTA";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case3() {
    String S = "ACBBAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case4() {
    String S = "SGHDJHFIOPUFUHCHIOJBHAUINUIT";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case5() {
    String S = "CCCATT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case6() {
    String S = "HQGHUMEAYLNLFDXFIRCVSCXGGBWKFNQDUXWFNFOZVS";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case7() {
    String S = "TKJPREPGGXRPNRVYSTMWCYSYYCQPEVIKEF";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case8() {
    String S = "MZNIMKKASVWSRENZKYCXFXTLSGYPSFADPOOEFXZBCOEJ";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case9() {
    String S = "VPVABOYGPOEYLFPBNPLJVRVIPYAMYEHWQNQRQ";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case10() {
    String S = "MXUJJLOOVA";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case11() {
    String S = "WUXWHMSNCBXCOKSFZKVATXDKN";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case12() {
    String S = "YJYHFIXJSWNKKU";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case13() {
    String S = "ATCACCACAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case14() {
    String S = "CCCCTTTTTAACCAATTATTTCAACTCTCCTATTTACCCTCTCATTCAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case15() {
    String S = "TTTCATCCCCAAATAAACCATTCTTT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case16() {
    String S = "ACTATAATACACTCAAAAAACAATCATATA";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case17() {
    String S = "CCATAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case18() {
    String S = "XLHSMPXOHGMGNKEUFDXOOGABGXTPEYNFEUKEPZSHKCLJUGG";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case19() {
    String S = "ADTCQZJENPEVQGXIEPJSRDZJZUJLLHHBFQMKIMWZOBIWYBX";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case20() {
    String S = "FSKSRSTREKMQDCYZAJ";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case21() {
    String S = "MSRQOZIJIPFIOATCNEED";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case22() {
    String S = "RNVYMMBDZQSOEMTUVNPPCPASUBZUXMHEHLEGRPUNKDMB";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case23() {
    String S = "QGJOPRMOWZDQYOXYJBBCHWADYDPRJBXPHOOHPKWQYUHRQZHNTB";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case24() {
    String S = "QNQQLRZJPXICOGVLIETXDZUZOSRKRUSVAOJBRZMWZPOWKJILEF";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case25() {
    String S = "DIGPNPUUHGXPQNJWJAMWXXMNSNHTHLQQCRZUDLFZOJNZXUGLSD";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case26() {
    String S = "NOKCVFJFRMXOHAOWKBJZWUTWLJFRIMPMYHHZRIWKBRXBGFBEYH";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case27() {
    String S = "XTCWBVREHBBPXIFBXVFBGAKFQKOZGKUBMJRMBSZSSHFROEFWSJ";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case28() {
    String S = "GUZYTUPZWWEIQURCPIXIQFLDUUVEOOWQUDHNEAFNJHIMUZFSKU";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case29() {
    String S = "URISWBREUTYKBFVAKDZEZOIDUKUHJZCEFZZZBFKQDPQZIKFOBU";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case30() {
    String S = "HXDJGKJELRLPXMEROSWIDPPLIFKELCJYIHARQYBNEFXNXVGZTE";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case31() {
    String S = "NGYDRUDMPHMEKORWCOSPOFGHFAOZQVLQFXWWKMFXDYYGMTDSZS";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case32() {
    String S = "ODKJGHWMBMXRMHUYFYQGJQKKLTZNYXQKQOYZWMYCAUBZZPKHKK";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case33() {
    String S = "CAVT";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case34() {
    String S = "CURAFMBISGEKTYRGZ";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case35() {
    String S = "CPOAMTVFY";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case36() {
    String S = "SVKHQDIHERCSIGABHZJZUJXMMYSPNTREWKEG";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case37() {
    String S = "HHRJVBJSCQDAJOOGPTKNFPF";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case38() {
    String S = "ICEOWQARWWWPZSQMEOTGEPSPXNVJIUPLYYNMKMNUVKLH";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case39() {
    String S = "WRGFMCZKGIPDFODKJAMJQWIQPUOTQHIMVFVUZWYVIJGFUL";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case40() {
    String S = "UHSJFBLKMFQRMYJFJNHCHSSQYDAEMTDJB";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case41() {
    String S = "NCEAGYIWTX";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case42() {
    String S = "CLGATR";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case43() {
    String S = "ERWVCJSJATB";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case44() {
    String S = "JLCWHAYPTNVRUIHOSWKIFYGYDHW";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case45() {
    String S = "EWZMGONZLJHGCUHNIHREQGAJFWKJSMPJHEFTQ";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case46() {
    String S = "LDCRHJDATYR";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case47() {
    String S = "IVUYEEGFICVDRYGURQDREADKUBNFGUTPRO";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case48() {
    String S = "BWQXKZMUSJGMHMHGDNMPHNQKMHUCRKRFAFTLVGRZKKLDLLEOJO";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case49() {
    String S = "RQYJZGINRNNCZWXXEDRWUADXZRFUSEWJBOXTVYNFHKSENUMNDD";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case50() {
    String S = "VZUDKCXYDZSXOBABGQNGVVPJTGOJOGLMKXGBFPYPKQHBDDZWRX";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case51() {
    String S = "RLXVOBWHXGINFGFRLMZNMJUGWCWBSQFAIHUBSJOLLMSQSGHMPT";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case52() {
    String S = "OFLBGSFNPUZSCRUPHYNVZHPQUAGRIWNIQXDTFJPWPXFBLKPNPE";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case53() {
    String S = "CMKUQPZOMWNLMBUPMKLPNDMPDSAYDSGVFPENEMWBORIFSUQHET";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case54() {
    String S = "HSSMVNONWFXWHCAGBIBBVQOPQFOVIUSSQFQWEHXDZUTJLNXMRJ";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case55() {
    String S = "LGGKYBIOLYDNILQDOJCSKKVFXAHHJMBOLJRINDWLDVDTXROPBY";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case56() {
    String S = "YOJUOHWMLVRGLFCZDZDBUBXUOFFVNRASWSZNMOIJOIVVGOBQPT";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case57() {
    String S = "VNHCKEBMDHVYGKJIASUXHMUUTDQBHMKNHFXXQXKJLZZQSJFEED";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case58() {
    String S = "KOLXJOQKDVFEPVLCHVHRWFDUKXFFJPSSWYXLIAJJHEVRTYXOZB";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case59() {
    String S = "MOWGRGONUDCQLHYGGYLJADTDJHMLEDZLODSRKEUGNKNRJKPXIN";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case60() {
    String S = "DHUNWOOXVJJCMPSVKNHKWJOPMMLEBKSUVZQALYTQNWMBVBHRML";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case61() {
    String S = "BWYVWGOQNMIXCPZARKNNXUUFRZROSDQWSMJGHEQUDTOSRJXYYK";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case62() {
    String S = "RXUWJXNPQJNBKPDMOKLXPCEMVBQLZSVXZKUPPWGZPDPYZAKTZV";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case63() {
    String S = "CATT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case64() {
    String S = "TAC";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case65() {
    String S = "CCAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case66() {
    String S = "ACT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case67() {
    String S = "C";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case68() {
    String S = "HIHI";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case69() {
    String S = "CATTTTT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case70() {
    String S = "CCCAAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case71() {
    String S = "AT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case72() {
    String S = "BAAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case73() {
    String S = "ACRT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case74() {
    String S = "CAT";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

  @Test
  public void case75() {
    String S = "CCCAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case76() {
    String S = "CATTT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case77() {
    String S = "CATCAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case78() {
    String S = "BGF";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case79() {
    String S = "B";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case80() {
    String S = "XXXX";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case81() {
    String S = "CATAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case82() {
    String S = "ACAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case83() {
    String S = "LOL";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case84() {
    String S = "XYZ";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case85() {
    String S = "CATTTT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case86() {
    String S = "CATA";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case87() {
    String S = "CCAATT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case88() {
    String S = "WAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case89() {
    String S = "WE";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case90() {
    String S = "X";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case91() {
    String S = "CATCATCCCCAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case92() {
    String S = "BAT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case93() {
    String S = "XXCAXYZTT";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case94() {
    String S = "CGIGI";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case95() {
    String S = "TTAACACATACTATC";
    assertEquals("Impossible", tarostring.getAnswer(S));
  }

  @Test
  public void case96() {
    String S = "CXSAT";
    assertEquals("Possible", tarostring.getAnswer(S));
  }

}
