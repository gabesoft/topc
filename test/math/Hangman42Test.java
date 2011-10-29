package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class Hangman42Test {
  double DELTA = 1.0e-09;
  Hangman42 hangman42 = new Hangman42();

  @Test
  public void case1() {
    String[] words = { "top", "web", "cam", "buy", "now" };
    assertEquals(0.6, hangman42.probability(words), DELTA * 0.6);
  }

  @Test
  public void case2() {
    String[] words = { "wwtkmcoj", "lgsyduoi", "oiqisear", "hntxjrkf" };
    assertEquals(0.75, hangman42.probability(words), DELTA * 0.75);
  }

  @Test
  public void case3() {
    String[] words = { "a" };
    assertEquals(1.0, hangman42.probability(words), DELTA * 1.0);
  }

  @Test
  public void case4() {
    String[] words = { "ppk", "bez", "ltm", "nev", "roo" };
    assertEquals(0.6, hangman42.probability(words), DELTA * 0.6);
  }

  @Test
  public void case5() {
    String[] words = { "advanced", "absolute", "anything", "accepted", "reflects", "cleverly", "coaching", "winnings", "overflow" };
    assertEquals(0.6666666666666666, hangman42.probability(words), DELTA * 0.6666666666666666);
  }

  @Test
  public void case6() {
    String[] words = { "abcdefghiz", "abcdefghyj", "abcdefgxik", "abcdefwhil", "abcdevghim", "abcdufghin", "abctefghio", "absdefghio", "arcdefghip", "qbcdefghip" };
    assertEquals(0.5, hangman42.probability(words), DELTA * 0.5);
  }

  @Test
  public void case7() {
    String[] words = { "aa", "ab", "ac", "ad", "ae", "fg", "fh", "fi", "fj", "fk" };
    assertEquals(0.5, hangman42.probability(words), DELTA * 0.5);
  }

  @Test
  public void case8() {
    String[] words = { "aaab", "aaba", "aabb", "abaa", "abab", "abba", "abbb", "baaa", "baab", "baba" };
    assertEquals(1.0, hangman42.probability(words), DELTA * 1.0);
  }

  @Test
  public void case9() {
    String[] words = { "hllba", "zvcjh", "fjftl", "rrxld", "lkodz", "vwugd", "jfodw" };
    assertEquals(0.7142857142857143, hangman42.probability(words), DELTA * 0.7142857142857143);
  }

  @Test
  public void case10() {
    String[] words = { "jmmmarhhpvdpopplneruuzjjiaibwbvzogqjaatzs", "adfnkwylckfnlqhspqllqwysjpgefbmrhfekdkgmp", "liaxgnqakfrvuajtogylkxopoabiuavkvxifqmbkb", "qstebvlupnzioarhygtmoefnhmyrfsbhtzuvasuvz", "eaiupcapffctsmziczotdzbwbntdvjifmqzemfajw", "fkuxnlwdvkhfnlwtncsuvjkvfhxsoyxhjgfquxllz", "gcghokcmhsrxzpemihtstabomyfkprduumxbwbbip", "mseqrnzafqdxczihsrlmondelbittrdgeysvbdxee" };
    assertEquals(0.875, hangman42.probability(words), DELTA * 0.875);
  }

  @Test
  public void case11() {
    String[] words = { "scuzzlaxugqpzcpqqzrzyfgkgqajmxnmchoukvnmfwx", "wdyjtwfohvktljkjiuwszjusgorbjsigusombmlfoxs", "lercedfuauzdrcwrljhvnxzeuhvtfxgfjvecddjqfhr", "sbzxptkjpfneysdqcmxqsftdmdiapqottkgkjmssgza", "uvuubbqnbmjrllhkrnhgykdjdnmjjycyblbjtbvgtlk", "byiqklubhrydhkhdnpqgzlnaiukuhpiundgqwfnllwu", "jrwptqxnowbusyvmsvlkujayjscqaklmbkwusvwdrek", "xhjjgeopmutacxdoodjivsmjvsgpzjecymiueeuxzex" };
    assertEquals(0.875, hangman42.probability(words), DELTA * 0.875);
  }

  @Test
  public void case12() {
    String[] words = { "abcdefghizqbcdefghizalcdefghizabckefgoizpbndefmhiz", "abcdefghyjabcdefghyjalcdefghyjabckefgoyjpbndefmhyj", "abcdefgxijabcdefgxijalcdefgxijabckefgxijpbndefmxij", "abcdefwhijabcdefwhijalcdefwhijabckefwoijpbndefwhij", "abcdevghijabcdevghijalcdevghijabckevgoijpbndevmhij", "abcdufghijabcdufghijalcdufghijabckufgoijpbndufmhij", "abctefghijabctefghijalctefghijabctefgoijpbntefmhij", "absdefghijabsdefghijalsdefghijabskefgoijpbsdefmhij", "arcdefghijarcdefghijarcdefghijarckefgoijprndefmhij", "qbcdefghijqbcdefghizqlcdefghijqbckefgoijqbndefmhij" };
    assertEquals(0.6, hangman42.probability(words), DELTA * 0.6);
  }

  @Test
  public void case13() {
    String[] words = { "ozeexsuaihtuucqghqsjzqzugmaebvdrddyztehr", "lvjvwhqyeqpapbjusjtxfbcgfbsudrbhpydzryyp", "cigacdzesqanrlflmsxvhvtvtnzelbzlopcchdob", "edqogzausmjxzoagpsssxwnmfranrrswjsdgqcqv", "ptvbnhdcecegnnsofcxaqtizrkwvazfngvzgcsqb", "guiqkikpwwbzgpvtikaaxxjitqkqfughdlmjtdax", "gbubcxhxscszrcuzbggjmnzlzihftpmpmaamtxcp", "tuijqvgvbiwbyjhjmkmmqlmhayvdqhlkpptqqide", "yidryvjmpbjkdzhmhtoynhbwlbsehcbymltrddsj" };
    assertEquals(0.8888888888888888, hangman42.probability(words), DELTA * 0.8888888888888888);
  }

  @Test
  public void case14() {
    String[] words = { "vjbaglrfkwjyuzdrxvhompvpmypqhhaqgjlutukb", "lgujpiqdaxfxoxjavsdlmlsafemjkfglswpcsgiv", "omqhozfneccvlqkscqwtqdxcknvchollwimvncvx", "rmtatqhipgfvwlcpfbmsgmzejgnaefjbmzvrembv", "ocvidozoyrbwptxbwdtgxhhkaxflolwsolwapmzm", "dduisyvjstkhplfexwzbavkqhxgatjxieeatlspt", "ehhpoczjutgnhhzmrsyibaczppytzzrhadtynyhq", "vlrkjqvlnwwdismlggsbouzgneqloddaxxcbjrxz", "uqxfisaynbrvrwwfqtmperqhnljolxpacxdbeetd" };
    assertEquals(0.8888888888888888, hangman42.probability(words), DELTA * 0.8888888888888888);
  }

  @Test
  public void case15() {
    String[] words = { "cxrkapsjxnsetbbhgtwxjejfyqdewkdnvgqzcetpalykfn", "vwlaaghwciwahrnxrzkyaftiyasylnphntskssrlmpmcgx", "htjmhyaqcyyrowoxpbmaviicyxlwayonlvmpqznbwwjgam", "wkbcpbpcehadjhqoaroogmjvmmkehshtwvdxxbbgorphrq", "awojqoxbevoeseodeiruiwjuuthiufipdioonwnbfmfpez", "fdmcgwixmchdzqwiqyzgnbeulzosujvjwymdxdlkcvhtvr", "yftzeifmfkekjtioegtkpgtnoeghmpcunpbtqjtuylynzh", "xesxqgqzepssdxywpmgjmxsqlvcxsxivksjncyneiksimg", "qvrvxkzbsskmiltqsoptivlsgknxkywaikcbaxfdoixjsx", "wpqwpnktbocedlfwsxkxbyqhixqpjlevyixaarumojamtw" };
    assertEquals(0.9, hangman42.probability(words), DELTA * 0.9);
  }

  @Test
  public void case16() {
    String[] words = { "lscozjmdsjwehokektmcrmujmterlxnhbftluhvuv", "rpsdofichtxulskmszribwdbfshfwvejllxdcjvvi", "smrazccwqdlffkczndjfiywfdbzjvimzsmhfixlgz", "cfibnlblfsvuhweulbxyirvnhxwijlofbkdvlwrih", "tatlewxofjppobtuimtcnkclettzumhmnubknjkgt", "kddnfuxeefhcyfhacfghigaagoxbboooonsagmolr", "lggvqmkjwgfysqrdmcscoycwshbizxsmxrfukqumf", "meudentdjdbvxnvwwlsphqgsitrijyataqseyuxit", "ucbhqgspfqyghyjludaauuapfdlkcntimhblqojzd", "wemsyifmrufqssywwgmxggadqogkrizmjcwnwfesk" };
    assertEquals(0.9, hangman42.probability(words), DELTA * 0.9);
  }

  @Test
  public void case17() {
    String[] words = { "gkverxxipmbwoevwhpvolnrsfafrkohfmknjeslgyvyssepls", "elcuebyrnrhdydzouubocadpjdidbfrysqyezfjoerrxzzjrz", "rbjyjaqjjlyvlesnxdnpcsoidmzovqekqsgfduzkpankhizqa", "ljylhfsqkbeqzavicoyauphthxpjsaaxkyrmlxponwmypvame", "aogxehfrwujrmniensugbzsjicbpxjryrryzqmoabgldevejq", "gbellobqmlxurznewqlendnlcaspnougrzjeesaafttkavqem", "nmiymlusdtrcolqqndkpshnrjdirtkbxfkzezledosannngcv", "sogczbexhfoeldoukpajojexkcihtxlsbrzvjgfkxbqrvbdhe", "nmbbzrnonmyhshmtbirqbrzvmvobaoddtukoakpberqlaywrd", "jyesgpgaovcohfhynfwzbhmcqkktphplvefcrihxawqzkqiuk" };
    assertEquals(1.0, hangman42.probability(words), DELTA * 1.0);
  }

  @Test
  public void case18() {
    String[] words = { "bjvwmoqbytwkiadrsvhgnwoqrtpjzxpwjtwlipvsbr", "kehqyctlitxccxxvjoattvxxfjdlseqhkrqtglpmpv", "pivicslylnkvoebcncsjfcmimlxprewtzpdyyjszzy", "qearhjnwaminbcsjidlpwplvmllsxjckprefqrkira", "bfmlyirhjnmjwpggjhswjfylcxpzlfqpxxwfcwxtwt", "byoctzknvnvugtrmtgpehoyczzxhpcaalfamnxpzjk", "akrafkdjaqpmnoodnznqrlhaswfmqbisbyincwnbek", "fwqmmcrddhcdskqvgbwbhjcdxpnwzqiqiezezsuwts", "yveqcbvwoguvtwvydcjwpqoupzofnairgcnxlnjrim", "swabzsmamxcrxrannadcemaofohulfsmproezrovcr" };
    assertEquals(1.0, hangman42.probability(words), DELTA * 1.0);
  }

  @Test
  public void case19() {
    String[] words = { "fnsna", "emrop", "epdkg", "tergs", "ttvjc" };
    assertEquals(0.8, hangman42.probability(words), DELTA * 0.8);
  }

  @Test
  public void case20() {
    String[] words = { "qkqrfcsusgpffrxmbzpeeuwwehw", "vzgrbbngjxolqwoidtpkhvfisza", "dggyrtuvbgqazgmxmhzaugggmkb", "uyjcntivluwtcgjaepdwlecdaen", "srmalbwzhymeidavnmmtzhucflj", "mwxevwjibfnkcwovuafhnihagji" };
    assertEquals(0.8333333333333334, hangman42.probability(words), DELTA * 0.8333333333333334);
  }

  @Test
  public void case21() {
    String[] words = { "wikzqaojoxtocrdxf", "lgpugnymrwdhrrqqu", "rzuktdxkxximhanpd", "blsymwicllfzpxtxm", "rdopaqpogozgbepfu", "vjmooyngmxtppkzel", "ryerfbrdgxlqcffsc" };
    assertEquals(0.7142857142857143, hangman42.probability(words), DELTA * 0.7142857142857143);
  }

  @Test
  public void case22() {
    String[] words = { "t", "k", "v", "a", "l", "w", "b" };
    assertEquals(0.5714285714285714, hangman42.probability(words), DELTA * 0.5714285714285714);
  }

  @Test
  public void case23() {
    String[] words = { "pufohuonaheyevlivuhecdr", "igtzepuuwqfizueuvjehagh", "dbapygjxtkvziliafjspbfj", "aezitwcoxxqdznlujrcnynr", "kapzpsohxzgdbljtdkldphm", "oqsijuezxxrijfoifmytxsy", "blyxyyezoqukkwuorgwvfdp" };
    assertEquals(0.8571428571428571, hangman42.probability(words), DELTA * 0.8571428571428571);
  }

  @Test
  public void case24() {
    String[] words = { "tkzcfs", "ojyfeq", "xvahzo", "kxxikc", "tnxmfo", "pheqys", "gbjprb", "vwwtlz" };
    assertEquals(0.625, hangman42.probability(words), DELTA * 0.625);
  }

  @Test
  public void case25() {
    String[] words = { "zkmcbdod", "iypouxhr", "lbkqplay", "kcxhnhgc", "panzjwfx", "iilsuvwx", "azczjblc", "ntvahxlb", "xywdcxni", "fhrfvwls" };
    assertEquals(0.7, hangman42.probability(words), DELTA * 0.7);
  }

  @Test
  public void case26() {
    String[] words = { "vjghmnritvyswxo", "zywbrtqipfgryou", "jlenewmenfludzq", "jryzlxpcawofauh", "ljjovaxbghhzceo", "caglxmgryvayzbv", "nqtpstjzynbvwrm", "xolsyzsefgvdqzb", "xfodtoyqvowykso" };
    assertEquals(0.7777777777777778, hangman42.probability(words), DELTA * 0.7777777777777778);
  }

  @Test
  public void case27() {
    String[] words = { "sct", "oii", "rmi", "dap", "yba", "tsb", "ifp", "smu", "dwo" };
    assertEquals(0.5555555555555556, hangman42.probability(words), DELTA * 0.5555555555555556);
  }

  @Test
  public void case28() {
    String[] words = { "caaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad" };
    assertEquals(1.0, hangman42.probability(words), DELTA * 1.0);
  }

  @Test
  public void case29() {
    String[] words = { "ozeexsuaihtuucqghqsjzqzugmaebvdrddyztehr", "lvjvwhqyeqpapbjusjtxfbcgfbsudrbhpydzryyp", "cigacdzesqanrlflmsxvhvtvtnzelbzlopcchdob", "edqogzausmjxzoagpsssxwnmfranrrswjsdgqcqv", "ptvbnhdcecegnnsofcxaqtizrkwvazfngvzgcsqb", "guiqkikpwwbzgpvtikaaxxjitqkqfughdlmjtdax", "gbubcxhxscszrcuzbggjmnzlzihftpmpmaamtxcp", "tuijqvgvbiwbyjhjmkmmqlmhayvdqhlkpptqqide", "yidryvjmpbjkdzhmhtoynhbwlbsehcbymltrddsj" };
    assertEquals(0.8888888888888888, hangman42.probability(words), DELTA * 0.8888888888888888);
  }

  @Test
  public void case30() {
    String[] words = { "abcdefgh", "ghghghgh", "fgfgfgfg", "efefefef", "ztztztzt", "tztztztz", "zyzyzyzy", "rrrrrrrr", "rererere", "abdczfgh" };
    assertEquals(0.7, hangman42.probability(words), DELTA * 0.7);
  }

  @Test
  public void case31() {
    String[] words = { "aab", "aba", "abb" };
    assertEquals(1.0, hangman42.probability(words), DELTA * 1.0);
  }

  @Test
  public void case32() {
    String[] words = { "top", "web", "cam", "buy", "now" };
    assertEquals(0.6, hangman42.probability(words), DELTA * 0.6);
  }

  @Test
  public void case33() {
    String[] words = { "a", "b" };
    assertEquals(0.5, hangman42.probability(words), DELTA * 0.5);
  }

}
