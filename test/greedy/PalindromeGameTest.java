package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class PalindromeGameTest {
  PalindromeGame palindromegame = new PalindromeGame();

  @Test
  public void case1() {
    String[] front = { "topcoder", "redcoder", "redocpot" };
    int[] back = { 7, 5, 3 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case2() {
    String[] front = { "rabbit" };
    int[] back = { 1000000 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case3() {
    String[] front = { "abc", "abc", "def", "cba", "fed" };
    int[] back = { 24, 7, 63, 222, 190 };
    assertEquals(499, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case4() {
    String[] front = { "abc", "cba", "def", "abc", "fed" };
    int[] back = { 24, 7, 63, 222, 190 };
    assertEquals(482, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case5() {
    String[] front = { "a" };
    int[] back = { 1 };
    assertEquals(1, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case6() {
    String[] front = { "xyx", "xyx", "xyx", "zzz", "zzz", "zzz" };
    int[] back = { 5, 7, 2, 1, 6, 4 };
    assertEquals(24, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case7() {
    String[] front = { "aaaaaaaaaaaa", "nopalindrome", "steponnopets", "emordnilapon", "aaaaaaaaaaaa", "steponnopets", "nopalindrome", "steponnopets", "nopalindrome", "bbbbbbbbbbbb", "cannotbeused", "cannotbeused", "steponnopets", "aaaaaaaaaaaa", "nopalindrome", "aaaaaaaaaaaa", "nopalindrome", "emordnilapon", "steponnopets", "nopalindrome" };
    int[] back = { 4096, 131072, 64, 262144, 512, 1024, 65536, 2048, 32768, 1, 524288, 16384, 32, 4, 16, 2, 8, 128, 8192, 256 };
    assertEquals(474854, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case8() {
    String[] front = { "thequickbrownfoxjumpsoverthelazydog" };
    int[] back = { 1000000 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case9() {
    String[] front = { "thequickbrownfoxjumpsoverthelazydog", "godyzalehtrevospmujxofnworbkciuqeht" };
    int[] back = { 19, 76 };
    assertEquals(95, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case10() {
    String[] front = { "fhequickbrownfoxjumpsoverthelazydog", "godyzalehtrevospmujxofnworbkciuqeht" };
    int[] back = { 19, 76 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case11() {
    String[] front = { "thequickbrownfoxjumpsoverthelazydoq", "godyzalehtrevospmujxofnworbkciuqeht" };
    int[] back = { 19, 76 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case12() {
    String[] front = { "thequickbrownfoxjumpsoverthelazydog", "qodyzalehtrevospmujxofnworbkciuqeht" };
    int[] back = { 19, 76 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case13() {
    String[] front = { "thequickbrownfoxjumpsoverthelazydog", "godyzalehtrevospmujxofnworbkciuqehf" };
    int[] back = { 19, 76 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case14() {
    String[] front = { "thiswillbealongpalindromemordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(499, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case15() {
    String[] front = { "dhiswillbealongpalindromemordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case16() {
    String[] front = { "thiswillbealongpalindronemordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case17() {
    String[] front = { "thiswillbealongpalindromenordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case18() {
    String[] front = { "thiswillbealongpalindromemordnilapgnolaeblliwsihd" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case19() {
    String[] front = { "thiswillbealongpalindromeemordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(499, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case20() {
    String[] front = { "phiswillbealongpalindromeemordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case21() {
    String[] front = { "thiswillbealongpalindromoemordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case22() {
    String[] front = { "thiswillbealongpalindromeomordnilapgnolaeblliwsiht" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case23() {
    String[] front = { "thiswillbealongpalindromeemordnilapgnolaeblliwsihp" };
    int[] back = { 499 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case24() {
    String[] front = { "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "lfctktrygedlpmbooatphlicywlfybdiuaxxogkpeujgeiasft", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "ixzlnswijawcksnthxwggjsjdznfgrqetphgxmcjofuhyaqobg", "gboqayhufojcmxghpteqrgfnzdjsjggwxhtnskcwajiwsnlzxi", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "ixzlnswijawcksnthxwggjsjdznfgrqetphgxmcjofuhyaqobg", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "ixzlnswijawcksnthxwggjsjdznfgrqetphgxmcjofuhyaqobg", "gboqayhufojcmxghpteqrgfnzdjsjggwxhtnskcwajiwsnlzxi", "lastcjhxwdxxilxdbxawfaxtkjyfeucaticrrevixwthwwkute", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "ixzlnswijawcksnthxwggjsjdznfgrqetphgxmcjofuhyaqobg", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "etukwwhtwxiverrcitacuefyjktxafwaxbdxlixxdwxhjctsal", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "ixzlnswijawcksnthxwggjsjdznfgrqetphgxmcjofuhyaqobg", "ixzlnswijawcksnthxwggjsjdznfgrqetphgxmcjofuhyaqobg", "ziiavkadexabdiwxhqjbhgyzddzyghbjqhxwidbaxedakvaiiz", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "gboqayhufojcmxghpteqrgfnzdjsjggwxhtnskcwajiwsnlzxi", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "hjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmpmp", "tfsaiegjuepkgoxxauidbyflwycilhptaoobmpldegyrtktcfl", "gboqayhufojcmxghpteqrgfnzdjsjggwxhtnskcwajiwsnlzxi", "gboqayhufojcmxghpteqrgfnzdjsjggwxhtnskcwajiwsnlzxi", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "pmpmmwmvprkxydgtjxcqmpszdszepaoebeegqmfnxrkwwuymjh", "ziiavkadexabdiwxhqjbhgyzddzyghbjqhxwidbaxedakvaiiz", "gboqayhufojcmxghpteqrgfnzdjsjggwxhtnskcwajiwsnlzxi" };
    int[] back = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(50000000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case25() {
    String[] front = { "bptjtizbjdfmukyxxbmileaksskaelimbxxykumfdjbzitjtpb", "rbjavldthitldfowirhhruatggtaurhhriwofdltihtdlvajbr", "shxbxtidyjofgpqrnabgdknittinkdgbanrqpgfojyditxbxhs", "cmfllyppaymgdgfwvvvpjncqhhqcnjpvvvwfgdgmyappyllfmc", "xuaukuhwruwvtdajqopxhacjxxjcahxpoqjadtvwurwhukuaux", "vqohkuovpmxoxeveypmwbwfziizfwbwmpyevexoxmpvoukhoqv", "zedvmxsfhhoslqlukxgoavchvvhcvaogxkulqlsohhfsxmvdez", "dvgyloealfpunupqkwlqctlullultcqlwkqpunupflaeolygvd", "pliywrbgdwbxvtdlgtxlhahcnnchahlxtgldtvxbwdgbrwyilp", "ppkbyxahzbgizpsprwjwiymmxxmmyiwjwrpspzigbzhaxybkpp", "iznckjdrhiujhpemagerzwhavvahwzregamephjuihrdjkcnzi", "dbqxptyyvxfvicehzhqchghqaaqhghcqhzhecivfxvyytpxqbd", "aaigsxhhuvarwdfkpistrdevhhvedrtsipkfdwravuhhxsgiaa", "kgomneqlahxgkgcxlhvykmkfllfkmkyvhlxcgkgxhalqenmogk", "xyhqrpletzpmpmebilnlhavokkovahlnlibempmpztelprqhyx", "alutlssyaxalnmmtxmeeyrubmmburyeemxtmmnlaxayssltula", "fjwtavbkqcnaaanhzafpwcsrhhrscwpfazhnaaancqkbvatwjf", "jasdhqycfutuswyzyodvpbsxyyxsbpvdoyzywsutufcyqhdsaj", "qhuueksvynyimboqjlhdjfhdnndhfjdhljqobmiynyvskeuuhq", "wbruxzbvoualqdqlrqdjweupllpuewjdqrlqdqlauovbzxurbw", "ityexmrfylrjshcpctlmkswassawskmltcpchsjrlyfrmxeyti", "werngnsyixujjtygzizhhycfjjfcyhhzizgytjjuxiysngnrew", "kolhcsckjzypplxyblitgphvkkvhpgtilbyxlppyzjkcschlok", "jlgpfexzsfhttjklvlbxpacessecapxblvlkjtthfszxefpglj", "klbamhvcwhqchtaymjmklckgkkgkclkmjmyathcqhwcvhmablk", "lfhpellbxhhukpnktlvuhmmzhhzmmhuvltknpkuhhxbllephfl", "rxyqsxuepfcymcegbjsukzzovvozzkusjbgecmycfpeuxsqyxr", "lmdvlfxyqrshiswkwozybijujjujibyzowkwsihsrqyxflvdml", "pbehptugjdabeyqhxktqyesgzzgseyqtkxhqyebadjgutphebp", "lbymvxgkabtqmoktunltddyilliyddtlnutkomqtbakgxvmybl", "kcunlniqeissjsfpnmxwcdznaanzdcwxmnpfsjssieqinlnuck", "ebufnclmvzqwzwhyxgsgcvmaeeamvcgsgxyhwzwqzvmlcnfube", "yeofsydykuvviihkihkvtuzmttmzutvkhikhiivvukydysfoey", "jmgmmopcwybediwosomgrnrryyrrnrgmosowidebywcpommgmj", "qjbbdsgmomenpbidlntcbwevxxvewbctnldibpnemomgsdbbjq", "ujqcthnokczyugjkwgrtmsywbbwysmtrgwkjguyzckonhtcqju", "nbocykjrjysvxpxvhbqhtaryggyrathqbhvxpxvsyjrjkycobn", "lwvhylvxpxjjtxdatfcrgmtauuatmgrcftadxtjjxpxvlyhvwl", "jpnkoqvdcmlbuzyfiyeukznrggrnzkueyifyzublmcdvqoknpj", "dbgcnntfjdyfjzvwuaycisxhjjhxsicyauwvzjfydjftnncgbd", "xcylfwhgwqhxefrgbnozadmsiismdazonbgrfexhqwghwflycx", "grqwyonfygheejgbtfoljycwwwwcyjloftbgjeehgyfnoywqrg", "ygckjbbrpxizzpyjifokscekzzkecskofijypzzixprbbjkcgy", "skyeyftvldfdgvqvxcbietaxffxateibcxvqvgdfdlvtfyeyks", "ovzvklydseowcevrstbbeyhgjjghyebbtsrvecwoesdylkvzvo", "eattvzichqilhfydzpfkqyquaauqyqkfpzdyfhliqhcizvttae", "vhsfkwdopjawpuosgtgtbxpfhhfpxbtgtgsoupwajpodwkfshv", "nfnizinzdduumtnkwiybfvugllguvfbyiwkntmuuddznizinfn", "uzfbzudusdawgvftkgkszmupccpumzskgktfvgwadsuduzbfzu", "zivihsufyoxsdvbeqojhugerhhreguhjoqebvdsxoyfushiviz" };
    int[] back = { 3530, 4030, 1276, 4088, 3075, 3861, 1366, 2181, 3283, 3353, 4611, 4688, 5093, 2999, 1579, 5323, 4052, 4931, 616, 1822, 5209, 5200, 5949, 1531, 3436, 3357, 2676, 1999, 2938, 3105, 863, 1705, 177, 5458, 1276, 3137, 5779, 3530, 479, 4236, 5909, 180, 3780, 174, 5410, 4598, 1390, 3192, 2276, 437 };
    assertEquals(5949, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case26() {
    String[] front = { "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv", "vtampzmroiijokmzbxsqpclkmmklcpqsxbzmkojiiormzpmatv" };
    int[] back = { 427, 756, 992, 241, 370, 692, 621, 723, 989, 587, 994, 284, 660, 531, 1022, 707, 597, 840, 308, 597, 840, 681, 242, 992, 421, 1021, 943, 681, 621, 810, 640, 1022, 840, 958, 692, 663, 588, 835, 876, 663, 810, 513, 707, 979, 694, 958, 274, 421, 733, 900 };
    assertEquals(34956, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case27() {
    String[] front = { "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx", "efiezjynivqjmbgcmmmylpdqvkfdbqiybegqcbieyyphjoasqx" };
    int[] back = { 76229, 227374, 133120, 84094, 230319, 154315, 223494, 251667, 166774, 245312, 172504, 67485, 75771, 139727, 230319, 154315, 230351, 253235, 288866, 184067, 302578, 193146, 139727, 144578, 231766, 308253, 262335, 230228, 144578, 153813, 227374, 184067, 210948, 227930, 186982, 363168, 302578, 288866, 338220, 193146, 317461, 212743, 313755, 318635, 200688, 26395, 270839, 251667, 105055, 266022 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case28() {
    String[] front = { "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "tpekppxqtpigriasudscmlwxbbaaeoxxcnyepmsmrylafawlsv", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept", "vslwafalyrmsmpeyncxxoeaabbxwlmcsdusairgiptqxppkept" };
    int[] back = { 1, 5, 8, 10, 42, 38, 36, 33, 48, 28, 26, 36, 25, 43, 50, 16, 31, 5, 36, 24, 20, 36, 39, 39, 34, 26, 31, 6, 34, 15, 21, 20, 32, 31, 11, 8, 41, 16, 29, 30, 47, 12, 47, 37, 38, 31, 17, 32, 4, 32 };
    assertEquals(902, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case29() {
    String[] front = { "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "lhfmufqdtawfkilsewisiheqvqsfgjdyqxskqnfmbsritrskkd", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl", "dkksrtirsbmfnqksxqydjgfsqvqehisiweslikfwatdqfumfhl" };
    int[] back = { 1861, 2376, 1125, 86, 797, 2613, 2140, 1679, 1421, 2034, 92, 2111, 412, 2445, 772, 628, 23, 249, 1733, 847, 2649, 1239, 2347, 211, 2218, 1111, 1401, 1688, 2406, 397, 2693, 1025, 842, 197, 2670, 2068, 1143, 1769, 2226, 973, 2673, 1767, 738, 750, 920, 213, 1998, 2667, 936, 1707 };
    assertEquals(71086, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case30() {
    String[] front = { "mcjqdteeuimiqltjsmjvegkfidgdqpqxjvifarrdmcfayypjcg", "ubzirkuiexmubaqytnulztupdawsxrkrfjbzmrehsesssydfls", "lkgbuvmsvwwrphxfvnfusvdoonumpwgvubcnwnawhyuntiiivt", "cuvbpkbdqxspgwtioefmlvtwwfgpxqgplwhmsobmcahfusqtho", "lkgbuvmsvwwrphxfvnfusvdoonumpwgvubcnwnawhyuntiiivt", "cuvbpkbdqxspgwtioefmlvtwwfgpxqgplwhmsobmcahfusqtho", "lkgbuvmsvwwrphxfvnfusvdoonumpwgvubcnwnawhyuntiiivt", "mcjqdteeuimiqltjsmjvegkfidgdqpqxjvifarrdmcfayypjcg", "rssovkmhdaskeufcraevaftjzsijkdbczhvcwkzwdbjazpdmxz", "wcuzmjojsvalacrvimunavxtmbcmqfjxjnkjebfsvpjryfvtif", "najkhodrphvlyrbhfslncfxmpkfnzjmtpdbegxsbhubvwwbskk", "gcjpyyafcmdrrafivjxqpqdgdifkgevjmsjtlqimiueetdqjcm", "wcgwyvvbmnaozccdcffdqbaqlprtpngyesrlwmjevlnhvvnjhl", "tviiitnuyhwanwncbuvgwpmunoodvsufnvfxhprwwvsmvubgkl", "hfndgkhltykeqkkdoikiplsoysgvdnrajnlpqavjadehtfpzxz", "lhjnvvhnlvejmwlrseygnptrplqabqdffcdcczoanmbvvywgcw", "fitvfyrjpvsfbejknjxjfqmcbmtxvanumivrcalavsjojmzucw", "slfdyssseshermzbjfrkrxswadputzluntyqabumxeiukrizbu", "lkgbuvmsvwwrphxfvnfusvdoonumpwgvubcnwnawhyuntiiivt", "ubzirkuiexmubaqytnulztupdawsxrkrfjbzmrehsesssydfls", "fitvfyrjpvsfbejknjxjfqmcbmtxvanumivrcalavsjojmzucw", "kksbwwvbuhbsxgebdptmjznfkpmxfcnlsfhbrylvhprdohkjan", "rssovkmhdaskeufcraevaftjzsijkdbczhvcwkzwdbjazpdmxz", "najkhodrphvlyrbhfslncfxmpkfnzjmtpdbegxsbhubvwwbskk", "hfndgkhltykeqkkdoikiplsoysgvdnrajnlpqavjadehtfpzxz", "ubzirkuiexmubaqytnulztupdawsxrkrfjbzmrehsesssydfls", "ubzirkuiexmubaqytnulztupdawsxrkrfjbzmrehsesssydfls", "cuvbpkbdqxspgwtioefmlvtwwfgpxqgplwhmsobmcahfusqtho", "rssovkmhdaskeufcraevaftjzsijkdbczhvcwkzwdbjazpdmxz", "ohtqsufhacmbosmhwlpgqxpgfwwtvlmfeoitwgpsxqdbkpbvuc", "wcgwyvvbmnaozccdcffdqbaqlprtpngyesrlwmjevlnhvvnjhl", "nfrizjawupejbwtvlhuncilmruhssifycgkmpxqobbxvffnhfv", "nfrizjawupejbwtvlhuncilmruhssifycgkmpxqobbxvffnhfv", "wcgwyvvbmnaozccdcffdqbaqlprtpngyesrlwmjevlnhvvnjhl", "zxzpfthedajvaqplnjarndvgsyoslpikiodkkqekytlhkgdnfh", "hfndgkhltykeqkkdoikiplsoysgvdnrajnlpqavjadehtfpzxz", "najkhodrphvlyrbhfslncfxmpkfnzjmtpdbegxsbhubvwwbskk", "fitvfyrjpvsfbejknjxjfqmcbmtxvanumivrcalavsjojmzucw", "hfndgkhltykeqkkdoikiplsoysgvdnrajnlpqavjadehtfpzxz", "nfrizjawupejbwtvlhuncilmruhssifycgkmpxqobbxvffnhfv", "cuvbpkbdqxspgwtioefmlvtwwfgpxqgplwhmsobmcahfusqtho", "fitvfyrjpvsfbejknjxjfqmcbmtxvanumivrcalavsjojmzucw", "mcjqdteeuimiqltjsmjvegkfidgdqpqxjvifarrdmcfayypjcg", "najkhodrphvlyrbhfslncfxmpkfnzjmtpdbegxsbhubvwwbskk", "zxmdpzajbdwzkwcvhzcbdkjiszjtfavearcfueksadhmkvossr", "vfhnffvxbboqxpmkgcyfisshurmlicnuhlvtwbjepuwajzirfn", "wcgwyvvbmnaozccdcffdqbaqlprtpngyesrlwmjevlnhvvnjhl", "rssovkmhdaskeufcraevaftjzsijkdbczhvcwkzwdbjazpdmxz", "mcjqdteeuimiqltjsmjvegkfidgdqpqxjvifarrdmcfayypjcg", "nfrizjawupejbwtvlhuncilmruhssifycgkmpxqobbxvffnhfv" };
    int[] back = { 35479, 12818, 21951, 7816, 9694, 320, 29268, 21147, 28796, 22306, 21846, 42032, 27962, 39742, 37303, 25620, 23571, 33623, 10552, 29268, 22484, 15191, 18531, 26313, 29336, 15582, 25376, 26489, 26928, 24365, 10905, 10998, 21901, 27943, 24104, 35586, 33310, 24104, 40601, 27062, 29434, 2121, 26928, 21846, 20830, 21951, 8372, 19310, 6194, 21901 };
    assertEquals(575048, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case31() {
    String[] front = { "jjnneixpabakgnuvvancfggfcnavvungkabapxiennjj" };
    int[] back = { 3565 };
    assertEquals(3565, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case32() {
    String[] front = { "nzmnxzanbwypdtkamqeemwsbakpcxjcfkdlk" };
    int[] back = { 6626 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case33() {
    String[] front = { "apwcwpa", "apwcwpa" };
    int[] back = { 19542, 40862 };
    assertEquals(60404, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case34() {
    String[] front = { "kpguhwkvwzrvjrvgppgvrjvrzwvkwhugpk", "epkemelzgbcdhqpwxxwpqhdcbgzlemekpe" };
    int[] back = { 589, 1038 };
    assertEquals(1038, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case35() {
    String[] front = { "prffwfiphkrsaoacuucaoasrkhpifwffrp", "qbvvxewxxzwprwxwzdsyvxibsabldfzmgt" };
    int[] back = { 8867, 49314 };
    assertEquals(8867, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case36() {
    String[] front = { "zkxzpofixooclx", "zkxzpofixooclx" };
    int[] back = { 13480, 13818 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case37() {
    String[] front = { "vtplaawtsxovadnvzcgmsnqweamkiaastxbkse", "eskbxtsaaikmaewqnsmgczvndavoxstwaalptv" };
    int[] back = { 206564, 12813 };
    assertEquals(219377, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case38() {
    String[] front = { "xvvenxcbirkjuxr", "nzojtskdkstjozn" };
    int[] back = { 10894, 63723 };
    assertEquals(63723, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case39() {
    String[] front = { "lbnqtifwxbgwdtwyrlulgbbictvwpn", "dysykadagjmyxsmialibycsdynkual" };
    int[] back = { 742, 1843 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case40() {
    String[] front = { "gxsyzyhiqnvzuftfuzvnqihyzysxg", "gxsyzyhiqnvzuftfuzvnqihyzysxg", "gxsyzyhiqnvzuftfuzvnqihyzysxg" };
    int[] back = { 238851, 755008, 363549 };
    assertEquals(1357408, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case41() {
    String[] front = { "lgzfuzuppsbswenvkkvnewsbsppuzufzgl", "lgzfuzuppsbswenvkkvnewsbsppuzufzgl", "deqtbzyoctxfodyappaydofxtcoyzbtqed" };
    int[] back = { 57108, 25434, 12868 };
    assertEquals(95410, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case42() {
    String[] front = { "wzsugerxatesnnsetaxreguszw", "wzsugerxatesnnsetaxreguszw", "djnboriqnhlnmvemxrlqtmxcls" };
    int[] back = { 37791, 50026, 56212 };
    assertEquals(87817, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case43() {
    String[] front = { "shhsgdtfadwiubadjeimuycggcyumiejdabuiwdaftdgshhs", "nungkwsoivpworqqgynxqssqqssqxnygqqrowpvioswkgnun", "shhsgdtfadwiubadjeimuycggcyumiejdabuiwdaftdgshhs" };
    int[] back = { 12674, 3574, 10965 };
    assertEquals(27213, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case44() {
    String[] front = { "bznvskvwplrezvgiqigvzerlpwvksvnzb", "mkkhyjvpizfjeegxhxgeejfzipvjyhkkm", "mkkhyjvpizfjeegxhxgeejfzipvjyhkkm" };
    int[] back = { 82542, 195879, 38694 };
    assertEquals(317115, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case45() {
    String[] front = { "hpcivkfpkwpbijrzukbxgcjjcgxbkuzrjibpwkpfkvicph", "zwfcmuqjwjvztvhkdjdreqvvqerdjdkhvtzvjwjqumcfwz", "hlcplrstcnkbrshsbyzezjbbjzezybshsrbknctsrlpclh" };
    int[] back = { 100511, 69338, 121368 };
    assertEquals(121368, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case46() {
    String[] front = { "dieosmjjgsaasgjjmsoeid", "qdhpxukhokffkohkuxphdq", "ezshxtzieiphpecrwyerbu" };
    int[] back = { 378287, 277267, 70267 };
    assertEquals(378287, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case47() {
    String[] front = { "zjbcflhwdshsaashsdwhlfcbjz", "rztretkxcusbhmckzsgmfzrcff", "zjbcflhwdshsaashsdwhlfcbjz" };
    int[] back = { 2448, 1503, 210 };
    assertEquals(2658, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case48() {
    String[] front = { "zvtgdwxxwdgtvz", "jdqfusznfflnha", "jdqfusznfflnha" };
    int[] back = { 6236, 3738, 15029 };
    assertEquals(6236, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case49() {
    String[] front = { "bdjuqwihyqnggnqyhiwqujdb", "rytwphmyvtkcrdihmmcpvozx", "xzovpcmmhidrcktvymhpwtyr" };
    int[] back = { 4948, 8311, 3475 };
    assertEquals(16734, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case50() {
    String[] front = { "bmtlupfeoliknonkiloefpultmb", "atxwfacwivkztissdirjnxmpusk", "pimhenglknuavovaunklgnehmip" };
    int[] back = { 3837, 5841, 33416 };
    assertEquals(33416, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case51() {
    String[] front = { "sybwstztswbys", "nagydkhftghcy", "cnwcgnvhdcanb" };
    int[] back = { 3059, 16854, 22962 };
    assertEquals(3059, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case52() {
    String[] front = { "ndozzquvvyjzblzsuynvczkcusvpilineecs", "ndozzquvvyjzblzsuynvczkcusvpilineecs", "ndozzquvvyjzblzsuynvczkcusvpilineecs" };
    int[] back = { 4604, 18894, 26435 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case53() {
    String[] front = { "kbfgojlmzccjlhsaydbomssrwpnuosrkmidvpowe", "kbfgojlmzccjlhsaydbomssrwpnuosrkmidvpowe", "ewopvdimkrsounpwrssmobdyashljcczmljogfbk" };
    int[] back = { 3934, 1188, 5014 };
    assertEquals(8948, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case54() {
    String[] front = { "tjjtcjqwht", "tjjtcjqwht", "ykqussuqky" };
    int[] back = { 4600, 3451, 7397 };
    assertEquals(7397, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case55() {
    String[] front = { "gtlsyunntlceu", "gtlsyunntlceu", "zevijutpvtvnj" };
    int[] back = { 22572, 7437, 36102 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case56() {
    String[] front = { "zmtrifcoqswcbkaolqkslzkozoprjkzffwokasgigo", "ogigsakowffzkjrpozokzlskqloakbcwsqocfirtmz", "zmtrifcoqswcbkaolqkslzkozoprjkzffwokasgigo" };
    int[] back = { 4454, 5121, 5025 };
    assertEquals(10146, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case57() {
    String[] front = { "lpzwoocquwta", "atwuqcoowzpl", "atwuqcoowzpl" };
    int[] back = { 37988, 26565, 72548 };
    assertEquals(110536, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case58() {
    String[] front = { "askmj", "jmksa", "wipiw" };
    int[] back = { 98889, 84196, 95265 };
    assertEquals(278350, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case59() {
    String[] front = { "mbdfucznlwqrllurlttietigwxufkuqtfihjwjgwpfrrfia", "aifrrfpwgjwjhiftqukfuxwgiteittlrullrqwlnzcufdbm", "obphcqwxkrfboyzyyqkueglyynkzycgzngfbauepwcfqifj" };
    int[] back = { 408535, 228487, 174836 };
    assertEquals(637022, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case60() {
    String[] front = { "fjxmkgvtfntbcrrhwxe", "dyxsuhiususuihusxyd", "fjxmkgvtfntbcrrhwxe" };
    int[] back = { 10581, 48080, 31717 };
    assertEquals(48080, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case61() {
    String[] front = { "rvptkrqbhmrcvqrnlovdbwjwqrqymyfauoblrwdpxfprak", "mwhzgkimzgeibdynxhzqcthhtcqzhxnydbiegzmikgzhwm", "karpfxpdwrlbouafymyqrqwjwbdvolnrqvcrmhbqrktpvr" };
    int[] back = { 65, 13375, 10690 };
    assertEquals(24130, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case62() {
    String[] front = { "blpztdsptxarfdel", "incgvsjffjsvgcni", "incgvsjffjsvgcni" };
    int[] back = { 41441, 10543, 47353 };
    assertEquals(57896, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case63() {
    String[] front = { "yotblftphklamyyfdm", "ifcvfsmjjjjmsfvcfi", "mcwpflywvvwylfpwcm" };
    int[] back = { 105843, 1074, 14116 };
    assertEquals(14116, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case64() {
    String[] front = { "rhthtqlcwfvrvxzcopunixtdgpybbisdpulwjursjaazwkadhx", "wuickozwtnffredorvunzzbfssfbzznuvroderffntwzokciuw", "uzlxobsnjwaieyzffyvnujhdvmnuxdeatspcumxmkkeahlwiaq" };
    int[] back = { 23837, 19160, 22751 };
    assertEquals(19160, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case65() {
    String[] front = { "rheivwppdwxvvnq", "lnbzctxqawqngvn", "rheivwppdwxvvnq" };
    int[] back = { 2065, 2103, 580 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case66() {
    String[] front = { "jopdcsufcezogczpqpbjxlhoqgcaldoxqmjyegijidqgtuq", "cbvyphypajtcgohyvyikxfnnbluneumtxofafzbtanurdhp", "qutgqdijigeyjmqxodlacgqohlxjbpqpzcgozecfuscdpoj" };
    int[] back = { 1157, 1983, 3236 };
    assertEquals(4393, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case67() {
    String[] front = { "rlemxgusgucogotjeihsfx", "yingnnxuafffmcbiavlbjm", "yingnnxuafffmcbiavlbjm" };
    int[] back = { 19297, 77245, 55762 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case68() {
    String[] front = { "rvlo", "ckek", "kekc" };
    int[] back = { 26379, 30373, 18854 };
    assertEquals(49227, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case69() {
    String[] front = { "sfnztgydadkcxsszydmvjemqbbweedjnqpdsspc", "whmgccuxymeyoxfjoifcbgrtdgsrbeesshrtpvp", "laazzutbyzrgeojizgvrvgzijoegrzybtuzzaal" };
    int[] back = { 5377, 7809, 1596 };
    assertEquals(1596, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case70() {
    String[] front = { "pfmoxenvxhhcawabitabsmlkqsschmqsw", "ybrdmybmxwmedkdngguzthgtcrffkrbbv", "xbcqzpwazbhiovhisovlgackkqulfsacx" };
    int[] back = { 60487, 54222, 88005 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case71() {
    String[] front = { "wnteftexemkrrjxzj", "wnteftexemkrrjxzj", "dyfvdlrancofegpiz", "uvfbsitwewtisbfvu", "nsyrjtwpjikskybyh", "lvuhskvdojqmcrrny", "yepsnwwjzrqyznkjf", "qdgdzymwhbzpmvmri", "nqrxagfpbvclcalam", "wnteftexemkrrjxzj", "dyfvdlrancofegpiz", "uvfbsitwewtisbfvu", "noepfvsjeuilfgues", "nsyrjtwpjikskybyh", "hldzgqapnpaqgzdlh", "noepfvsjeuilfgues", "ynrrcmqjodvkshuvl", "hldzgqapnpaqgzdlh", "uvfbsitwewtisbfvu", "uvfbsitwewtisbfvu", "ebfgktggoucjoping", "rrcribarwrabircrr", "ebfgktggoucjoping", "qdgdzymwhbzpmvmri", "noepfvsjeuilfgues", "uvfbsitwewtisbfvu", "nsyrjtwpjikskybyh", "rrcribarwrabircrr", "rrcribarwrabircrr", "lvuhskvdojqmcrrny", "dyfvdlrancofegpiz", "rrcribarwrabircrr", "nqrxagfpbvclcalam", "lvuhskvdojqmcrrny", "uvfbsitwewtisbfvu", "rrcribarwrabircrr", "nqrxagfpbvclcalam", "yepsnwwjzrqyznkjf", "hiqdwkmvkbefxmsen", "hiqdwkmvkbefxmsen", "yepsnwwjzrqyznkjf", "wnteftexemkrrjxzj", "hldzgqapnpaqgzdlh", "hldzgqapnpaqgzdlh", "rrcribarwrabircrr", "hiqdwkmvkbefxmsen", "gkjgyvtkqlamdbnrf", "dyfvdlrancofegpiz", "noepfvsjeuilfgues", "rrcribarwrabircrr" };
    int[] back = { 95590, 90328, 21769, 25048, 29486, 97060, 108874, 99847, 47341, 108055, 36140, 50195, 78855, 31181, 104654, 60673, 41362, 37118, 109227, 104059, 101993, 84665, 59520, 23106, 82062, 54236, 8923, 103851, 69384, 82972, 71920, 95356, 35312, 43247, 106662, 59956, 64851, 16140, 56913, 34866, 105514, 27253, 78742, 68776, 49788, 37132, 12637, 55634, 9549, 3842 };
    assertEquals(1343981, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case72() {
    String[] front = { "jlouxawxfaumdipkgejxelpvmnecubgzywknbjhdhtbnse", "oglwoxvkgqvogymmtejdcztkfowqohxqrocutxkmqpztds", "xesmlclsuphyoewtvpaknrwwrnkapvtweoyhpuslclmsex", "dhhxjjssmylgwqhrffzczejhvpyzlamkxsndhdmqavocjm", "xesmlclsuphyoewtvpaknrwwrnkapvtweoyhpuslclmsex", "jlouxawxfaumdipkgejxelpvmnecubgzywknbjhdhtbnse", "negfotpmqovnddaofenmcxcehnezdccfkmpxplchdnlvth", "dhhxjjssmylgwqhrffzczejhvpyzlamkxsndhdmqavocjm", "liocyuhguizvwxugdizckollokczidguxwvziughuycoil", "mjcovaqmdhdnsxkmalzypvhjezczffrhqwglymssjjxhhd" };
    int[] back = { 145092, 152341, 180204, 143143, 152341, 138284, 146548, 198511, 146548, 143143 };
    assertEquals(820747, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case73() {
    String[] front = { "gfkdwurtcbitxxtibctruwdkfg", "eigqalzpsqdzmmzdqspzlaqgie", "tuhamotccvxhbbhxvcctomahut", "zrsierjkdidqyyqdidkjreisrz", "ovylherqshxzppzxhsqrehlyvo", "etxmjvaifgolyylogfiavjmxte", "vnrtzrakqfobxxbofqkarztrnv", "ieyfnjpfbclddbfhqhqkjtxbrv", "xvnkhhzlhwsdvvdswhlzhhknvx", "gnpybizztuvnoonvutzzibypng", "aemikttbbzfmeemfzbbttkimea", "bcobjejewijbaabjiwejejbocb", "suslhrgqenilrygvupxaqfudmh", "cmeekoagehvlwibenkcczuyywx", "tuhamotccvxhbbhxvcctomahut", "ruimegefdtguoougtdfegemiur", "vosicbqqtqefggfeqtqqbcisov", "rqgwhznkoxceddecxoknzhwgqr", "ekbgcbajmwndkkdnwmjabcgbke", "xvnkhhzlhwsdvvdswhlzhhknvx", "vrbxtjkqhqhfbddlcbfpjnfyei", "sqxnmilbnaezttzeanblimnxqs", "vholqbmgcdcloolcdcgmbqlohv", "rqgwhznkoxceddecxoknzhwgqr", "vnrtzrakqfobxxbofqkarztrnv" };
    int[] back = { 8558, 3523, 3227, 709, 6739, 7601, 3815, 6109, 4641, 6073, 7479, 5004, 6682, 7585, 5287, 4905, 4055, 2763, 859, 1968, 8799, 6218, 2974, 3147, 7706 };
    assertEquals(56020, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case74() {
    String[] front = { "zpdifnukixi", "zpdifnukixi", "wtmqcvcqmtw", "wtmqcvcqmtw", "wtmqcvcqmtw", "wtmqcvcqmtw", "wtmqcvcqmtw", "sjmunhwlmpv", "sjmunhwlmpv", "sjmunhwlmpv", "sdlkriyxqcs", "sdlkriyxqcs", "scqxyirklds", "scqxyirklds", "scqxyirklds", "omucwtwcumo", "omucwtwcumo", "omucwtwcumo", "omucwtwcumo", "omucwtwcumo", "omucwtwcumo", "mvuhgpghuvm", "mvuhgpghuvm", "mvuhgpghuvm", "mvuhgpghuvm", "mvuhgpghuvm", "mvuhgpghuvm", "mgbhjkegzef", "mgbhjkegzef", "mgbhjkegzef", "mgbhjkegzef", "mgbhjkegzef", "mgbhjkegzef", "lpgelklegpl", "lpgelklegpl", "lpgelklegpl", "ixikunfidpz", "ixikunfidpz", "ixikunfidpz", "ixikunfidpz", "ixikunfidpz", "fezgekjhbgm", "fezgekjhbgm", "fezgekjhbgm", "fezgekjhbgm", "fezgekjhbgm" };
    int[] back = { 2837, 2087, 4551, 1455, 313, 4408, 210, 1369, 4089, 4265, 4553, 2934, 539, 1548, 885, 3196, 452, 2559, 453, 2182, 403, 3952, 3287, 1542, 237, 1093, 473, 533, 518, 968, 159, 3854, 931, 1005, 2545, 1196, 1907, 2521, 1539, 3589, 1359, 1741, 3132, 1055, 611, 3512 };
    assertEquals(73111, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case75() {
    String[] front = { "twtteevjzoumciixdnfcksbnethnfub", "dbjtbkcdsiaxsfnwnfsxaisdckbtjbd", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "dbjtbkcdsiaxsfnwnfsxaisdckbtjbd", "twtteevjzoumciixdnfcksbnethnfub", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "twtteevjzoumciixdnfcksbnethnfub", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "dbjtbkcdsiaxsfnwnfsxaisdckbtjbd", "bufnhtenbskcfndxiicmuozjveettwt", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "dbjtbkcdsiaxsfnwnfsxaisdckbtjbd", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "cojwmxcttecsyjxrxjyscettcxmwjoc", "bufnhtenbskcfndxiicmuozjveettwt", "bufnhtenbskcfndxiicmuozjveettwt", "cojwmxcttecsyjxrxjyscettcxmwjoc", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "twtteevjzoumciixdnfcksbnethnfub", "bufnhtenbskcfndxiicmuozjveettwt", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "cojwmxcttecsyjxrxjyscettcxmwjoc", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "bufnhtenbskcfndxiicmuozjveettwt", "bufnhtenbskcfndxiicmuozjveettwt", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "bufnhtenbskcfndxiicmuozjveettwt", "bufnhtenbskcfndxiicmuozjveettwt", "twtteevjzoumciixdnfcksbnethnfub", "twtteevjzoumciixdnfcksbnethnfub", "twtteevjzoumciixdnfcksbnethnfub", "twtteevjzoumciixdnfcksbnethnfub", "twtteevjzoumciixdnfcksbnethnfub", "dbjtbkcdsiaxsfnwnfsxaisdckbtjbd", "bufnhtenbskcfndxiicmuozjveettwt", "twtteevjzoumciixdnfcksbnethnfub", "cojwmxcttecsyjxrxjyscettcxmwjoc", "twtteevjzoumciixdnfcksbnethnfub", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "fwtqfwsnyojlasmnguwrtdjwzbosbpi", "dbjtbkcdsiaxsfnwnfsxaisdckbtjbd", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "ipbsobzwjdtrwugnmsaljoynswfqtwf", "twtteevjzoumciixdnfcksbnethnfub", "twtteevjzoumciixdnfcksbnethnfub" };
    int[] back = { 973668, 914559, 140599, 300625, 824221, 230480, 389527, 66722, 177642, 563778, 50591, 344152, 952389, 681607, 709703, 637522, 526735, 12274, 948668, 930438, 872964, 536625, 351472, 345157, 815463, 841718, 727927, 314638, 569295, 172013, 142069, 213481, 174480, 482335, 503419, 592771, 535587, 413773, 4333, 855242, 674163, 504927, 398529, 99888, 696670, 692392, 468622, 55432, 369067, 517274 };
    assertEquals(23252828, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case76() {
    String[] front = { "kibcqdpmlweccpjmfcwiojgzcwzgvaienxnidxjlamsqvv", "emcumbcvoabqhnxympctkiggiktcpmyxnhqbaovcbmucme", "rtynrqfkqiehmhyurjankqtumzfjwysiqgiuqjmsttjlpe", "tesnathynatyaygkxjsyijkmkwkxaupkwkxrbyeyhhxhec", "gpoupunryfalskhiuniifmxghmvofchbshykvftqogcqhg", "xirytgajpgrnpyizfovkdxivsvdfwzisjazrcnuakuvrzz", "rtynrqfkqiehmhyurjankqtumzfjwysiqgiuqjmsttjlpe", "sogqfykcvppdikillubxngfmnqdmskjtkiuftqoryxwegj", "oimnyofaexstemceqepgzyhpkqsvbbnkylofjkkxjacgyr", "sxudmqletsicytaeuaanedjrqncmocljnpfyoiynjbgwxz", "kqmjfktfxtwgsachykanvfcbcpsttniujbgznawznkapzq", "ejpetvhqsdhljmlwhwdpsriyoaorhuehtdkdznmsjvhwfn", "jbrrcrnnwbkgmppbtxgjcgnubawkrowpkznefzppuwwkle", "zgdarnqhvxlruhdkeryqdprjrnuzzgvfiuuubwyzbrowfo", "ghqcgoqtfvkyhsbhcfovmhgxmfiinuihkslafyrnupuopg", "tesnathynatyaygkxjsyijkmkwkxaupkwkxrbyeyhhxhec", "pllytrxnezkhwjvrspgogewtdtslmefzblirgqzdqsznob", "pllytrxnezkhwjvrspgogewtdtslmefzblirgqzdqsznob", "eicjejjwgejipspvwcxantiitnaxcwvpspijegwjjejcie", "fqtxstqwwgkjdopoxpsambjilssfpkfudrlgsfkwelawaw", "jelwfympzrvtjfjcecuoerppndszffsnwoeotyonycyigc", "oimnyofaexstemceqepgzyhpkqsvbbnkylofjkkxjacgyr", "ejpetvhqsdhljmlwhwdpsriyoaorhuehtdkdznmsjvhwfn", "sxudmqletsicytaeuaanedjrqncmocljnpfyoiynjbgwxz", "recbvgajoywpxiqivthntydpxcodclnknilquwtvnprjzp", "ghqcgoqtfvkyhsbhcfovmhgxmfiinuihkslafyrnupuopg", "eicjejjwgejipspvwcxantiitnaxcwvpspijegwjjejcie", "fqtxstqwwgkjdopoxpsambjilssfpkfudrlgsfkwelawaw", "fqtxstqwwgkjdopoxpsambjilssfpkfudrlgsfkwelawaw", "kibcqdpmlweccpjmfcwiojgzcwzgvaienxnidxjlamsqvv" };
    int[] back = { 9956, 10376, 4683, 3306, 9880, 6789, 8832, 3564, 12548, 5517, 9893, 5155, 2486, 6726, 4672, 10028, 6577, 5227, 9612, 4929, 7411, 1938, 3196, 7172, 13347, 3597, 771, 11692, 3471, 2335 };
    assertEquals(35311, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case77() {
    String[] front = { "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "trcnfrnorsrosocnjzubazgzdfbfrhdrur", "tpremyjgqzgvhxopllpoxhvgzqgjymerpt", "tpremyjgqzgvhxopllpoxhvgzqgjymerpt", "tpremyjgqzgvhxopllpoxhvgzqgjymerpt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "rurdhrfbfdzgzabuzjncosorsronrfncrt", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "pxuevgoymjtpgrwyaaywrgptjmyogveuxp", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cwkmfjerzqbirweyelwsnjagwryulicwfc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc", "cfwciluyrwgajnswleyewribqzrejfmkwc" };
    int[] back = { 592, 770, 855, 987, 629, 1299, 819, 218, 770, 702, 1204, 855, 1565, 479, 643, 846, 980, 727, 1307, 477, 702, 1112, 984, 500, 829, 471, 1400, 1220, 1112, 980, 562, 1242, 683, 846, 1242, 611, 1025, 1039, 477, 506, 1186, 819, 302, 1053, 921, 1557, 1046, 1420, 1333, 786 };
    assertEquals(42407, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case78() {
    String[] front = { "pobsyhohxupuxhohysbop", "mjxzwtqyltfcjgultqdiu", "mjxzwtqyltfcjgultqdiu", "pobsyhohxupuxhohysbop", "uidqtlugjcftlyqtwzxjm", "mjxzwtqyltfcjgultqdiu", "mwdpkssbzcqmdupryzzsf", "mjxzwtqyltfcjgultqdiu", "mwdpkssbzcqmdupryzzsf", "uidqtlugjcftlyqtwzxjm", "uidqtlugjcftlyqtwzxjm", "kewjmsztyujuytzsmjwek", "uidqtlugjcftlyqtwzxjm", "kewjmsztyujuytzsmjwek", "fszzyrpudmqczbsskpdwm", "pobsyhohxupuxhohysbop", "mjxzwtqyltfcjgultqdiu", "mjxzwtqyltfcjgultqdiu", "uidqtlugjcftlyqtwzxjm", "mjxzwtqyltfcjgultqdiu", "uidqtlugjcftlyqtwzxjm", "mjxzwtqyltfcjgultqdiu", "mwdpkssbzcqmdupryzzsf", "fszzyrpudmqczbsskpdwm", "mjxzwtqyltfcjgultqdiu", "kewjmsztyujuytzsmjwek", "uidqtlugjcftlyqtwzxjm", "mwdpkssbzcqmdupryzzsf", "mjxzwtqyltfcjgultqdiu", "uidqtlugjcftlyqtwzxjm", "fszzyrpudmqczbsskpdwm", "uidqtlugjcftlyqtwzxjm", "mjxzwtqyltfcjgultqdiu", "uidqtlugjcftlyqtwzxjm", "fszzyrpudmqczbsskpdwm", "uidqtlugjcftlyqtwzxjm", "kewjmsztyujuytzsmjwek", "kewjmsztyujuytzsmjwek", "mwdpkssbzcqmdupryzzsf", "kewjmsztyujuytzsmjwek", "mwdpkssbzcqmdupryzzsf", "mjxzwtqyltfcjgultqdiu", "fszzyrpudmqczbsskpdwm", "mwdpkssbzcqmdupryzzsf", "mwdpkssbzcqmdupryzzsf", "mwdpkssbzcqmdupryzzsf", "mwdpkssbzcqmdupryzzsf", "fszzyrpudmqczbsskpdwm", "mjxzwtqyltfcjgultqdiu", "pobsyhohxupuxhohysbop" };
    int[] back = { 390281, 312240, 270429, 303257, 210175, 594465, 332025, 360307, 625927, 599978, 211672, 570374, 635361, 247817, 345107, 385285, 621545, 420631, 390381, 242304, 292295, 163222, 44112, 46604, 589644, 133538, 605457, 39962, 644497, 368355, 543119, 462574, 548031, 22471, 31851, 318115, 392193, 60788, 585525, 195274, 631467, 202852, 454688, 10393, 282224, 601320, 83485, 652567, 175372, 603687 };
    assertEquals(17338697, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case79() {
    String[] front = { "ucaadvpcfwri", "mvuduttuduvm", "sjeqyddyqejs", "xogngjjgngox", "sccnygcvowbw", "fiixevvexiif", "ooeunmmnueoo", "bhiihpphiihb", "gicfyffyfcig", "ucaadvpcfwri", "oluktcctkulo", "ztfqdgulbdaf", "xogngjjgngox", "gvzmkkkkmzvg", "xgxfdioqxxne", "twzdvxxvdzwt", "ggsrjzzjrsgg", "lcrsqrrqsrcl", "drhkpddpkhrd", "tuexzxrayxrg", "lmxilgmmblgm", "ovdehtthedvo", "nmszoyyozsmn", "udorvuuvrodu", "muyfvcmexhgq", "sfuugaaguufs", "hgtgfyyfgtgh", "nozholdswkyv", "vpykjcqwzjye", "svekzrrzkevs", "naakdhhdkaan", "ooeunmmnueoo", "kbzoqffqozbk", "lfiayrohclxo", "dmnudiidunmd", "gaqgiffigqag", "qnhcossochnq", "ubhbqzzqbhbu", "ujjzzcczzjju", "vpykjcqwzjye", "epmpcjjcpmpe", "cxdasccsadxc", "gggzautkciev", "vcuwttttwucv", "prlxqeeqxlrp", "gsnjhcchjnsg" };
    int[] back = { 557394, 346623, 334763, 330961, 623522, 287120, 612231, 466003, 108951, 325922, 457228, 297309, 134821, 495627, 352930, 590817, 144763, 4857, 421751, 278947, 402401, 454570, 291555, 81988, 579098, 245385, 588440, 34703, 400799, 21196, 147823, 509416, 157271, 279843, 134458, 334258, 324528, 307907, 100365, 575037, 414250, 357632, 536179, 89445, 143634, 637752 };
    assertEquals(2225181, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case80() {
    String[] front = { "xmsthissssihtsmx", "jneqjxwqqwxjqenj", "hhzlnfdiidfnlzhh", "skselrjppjrlesks", "ykpqiwlrrlwiqpky", "nfoyoiazzaioyofn", "ykpqiwlrrlwiqpky", "hucchjmttoaiakrs", "kjltofprrpfotljk", "hhzlnfdiidfnlzhh", "skselrjppjrlesks", "ppfhvyuqquyvhfpp", "xmsthissssihtsmx", "mjhrznguzdwjspns", "hucchjmttoaiakrs", "ebynqfednnmihqws", "mqjnzeyzzyeznjqm", "swqhimnndefqnybe", "drnnotfzzftonnrd", "tyvuqbmhhmbquvyt", "kqlmbzjkkjzbmlqk", "nujkjafoofajkjun", "kjltofprrpfotljk", "drnnotfzzftonnrd", "jneqjxwqqwxjqenj", "nujkjafoofajkjun", "swqhimnndefqnybe", "tyvuqbmhhmbquvyt", "kqlmbzjkkjzbmlqk", "jneqjxwqqwxjqenj", "xpzgwxxggxxwgzpx", "vwkfhdlufeetbvzs", "wyoilvawwavlioyw", "szvbteefuldhfkwv", "okjwdxmjjmxdwjko", "okjwdxmjjmxdwjko", "xmsthissssihtsmx", "hhzlnfdiidfnlzhh", "hgjjqrkstcpdgzwn", "nwzgdpctskrqjjgh", "ptdoljqbbqjlodtp", "ppfhvyuqquyvhfpp", "skselrjppjrlesks", "swqhimnndefqnybe" };
    int[] back = { 116218, 543416, 516519, 306926, 360922, 327080, 400802, 190507, 341548, 206553, 129776, 624598, 680579, 396840, 94419, 12898, 262421, 81924, 409250, 528435, 542795, 228145, 317353, 92653, 455496, 383432, 195452, 34344, 564691, 322107, 237401, 540513, 444995, 51093, 72889, 394922, 273479, 444288, 382931, 386818, 334063, 529793, 403086, 434911 };
    assertEquals(11704520, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case81() {
    String[] front = { "yljetsktoxqksxuujfjuuxskqxotkstejly", "wumaunvtfyigpdjcrpztheqytovrmoqctxr", "wumaunvtfyigpdjcrpztheqytovrmoqctxr", "vvjfzlobvhpckxefnggcbznipfkbpftnbpe", "vsknpebkkucxnohvjbjvhonxcukkbepnksv", "vopqrqfnmouaeejclqlcjeeauomnfqrqpov", "vnwyusubxakvmfyhqtpwjchofxxourpoqsr", "vdpdgqtwbisfwxuvhdpvdqcxmcbuhtsnvzm", "vdpdgqtwbisfwxuvhdpvdqcxmcbuhtsnvzm", "uteenvglamvmtqbzaaazbqtmvmalgvneetu", "ruetqyorvwbneooxmqsuqkcumeweohlmkpl", "rkbarjwbifqducftkemtxxdsqmrehdeeskn", "rkbarjwbifqducftkemtxxdsqmrehdeeskn", "qyjjydqohzxjmmplstslpmmjxzhoqdyjjyq", "pqzkrkfjfhigtbuxgagxubtgihfjfkrkzqp", "npdnsfrbnzymcuwyqcqywucmyznbrfsndpn", "nkseedhermqsdxxtmektfcudqfibwjrabkr", "kwiclzwqapgwedjzgdgzjdewgpaqwzlciwk", "kwiclzwqapgwedjzgdgzjdewgpaqwzlciwk", "jvicdvmnqicwmfuqwgwqufmwciqnmvdcivj", "jvicdvmnqicwmfuqwgwqufmwciqnmvdcivj", "janzgyxtlbftcuuqctsbuipzsqgggozzroy", "janzgyxtlbftcuuqctsbuipzsqgggozzroy", "isrbnxmgiejgrpnrefernprgjeigmxnbrsi", "isrbnxmgiejgrpnrefernprgjeigmxnbrsi", "iosvzwsxgdwheztzaaztvznjnifejtdcrhu", "iosvzwsxgdwheztzaaztvznjnifejtdcrhu", "iosvzwsxgdwheztzaaztvznjnifejtdcrhu", "hzygigdtsacyqsrgsasgrsqycastdgigyzh", "hzygigdtsacyqsrgsasgrsqycastdgigyzh", "epbntfpbkfpinzbcggnfexkcphvbolzfjvv", "djdudasnssdstbenypynebtsdssnsadudjd", "djdudasnssdstbenypynebtsdssnsadudjd", "anhntnpmilatzqigqbqgiqztalimpntnhna", "anhntnpmilatzqigqbqgiqztalimpntnhna", "anhntnpmilatzqigqbqgiqztalimpntnhna" };
    int[] back = { 17138, 36372, 27852, 27852, 45337, 18607, 23170, 28919, 45494, 26089, 40852, 10952, 37117, 28242, 28919, 7590, 28242, 27859, 24998, 21988, 41836, 22951, 19403, 28786, 16815, 30972, 21316, 38542, 36838, 37878, 27859, 4845, 21847, 14618, 14618, 24998 };
    assertEquals(469713, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case82() {
    String[] front = { "blmdsltipfw", "blmdsltipfw", "kbnfyvyobyr", "afphpobziix", "afphpobziix", "uogfjtjfgou", "afphpobziix", "afphpobziix", "tovxbjdmqrf", "afphpobziix", "blmdsltipfw", "fbqhyyjooiq", "wfpitlsdmlb", "kbnfyvyobyr", "uogfjtjfgou", "frqmdjbxvot", "qioojyyhqbf", "fbqhyyjooiq", "frqmdjbxvot", "kbnfyvyobyr", "uogfjtjfgou", "tovxbjdmqrf" };
    int[] back = { 7312, 17059, 51411, 69598, 68944, 23078, 53983, 91104, 85673, 40468, 69196, 74185, 89251, 83564, 72477, 14741, 58602, 48925, 30190, 87137, 58804, 50468 };
    assertEquals(626665, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case83() {
    String[] front = { "femnjowaaeae", "drywdwwdwyrd", "rdkgzoozgkdr", "drywdwwdwyrd", "rnzshtacblvc", "fhfzyrryzfhf", "rnzshtacblvc", "rdkgzoozgkdr", "rdkgzoozgkdr", "pvvxbllbxvvp", "femnjowaaeae", "ckwpbbbbpwkc", "cvlbcathsznr", "lkxslsslsxkl", "fhfzyrryzfhf", "xmyohddhoymx", "guzoetqtmdij", "myoumrrmuoym", "ajpjnccnjpja", "pvvxbllbxvvp", "ckwpbbbbpwkc", "guzoetqtmdij", "ndnzussuzndn", "tnyzxhhxzynt", "yqxubttbuxqy", "dzkiyeeyikzd", "ndnzussuzndn", "ndnzussuzndn", "myoumrrmuoym", "qtibgllgbitq", "ajpjnccnjpja", "pjxgqbbqgxjp", "jidmtqteozug", "lkxslsslsxkl", "myoumrrmuoym", "rnzshtacblvc", "gakkooookkag", "yqxubttbuxqy", "pjxgqbbqgxjp", "gakkooookkag", "lkxslsslsxkl", "fhfzyrryzfhf", "tnyzxhhxzynt" };
    int[] back = { 1364, 2817, 1291, 758, 3255, 1559, 2014, 292, 885, 3295, 2989, 2560, 3107, 2919, 2372, 3371, 1721, 3275, 1780, 1915, 2827, 810, 592, 212, 1559, 1383, 1119, 898, 2626, 2940, 2306, 911, 2405, 1022, 1511, 2710, 204, 2338, 2074, 1303, 3252, 2667, 567 };
    assertEquals(62589, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case84() {
    String[] front = { "lbqrjiznoitwbqnqvuvsmolwqprca", "ivrdccxqsrbdciaicdbrsqxccdrvi", "lbqrjiznoitwbqnqvuvsmolwqprca", "lbqrjiznoitwbqnqvuvsmolwqprca", "acrpqwlomsvuvqnqbwtionzijrqbl", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "darpflzfnlcnqvasljnzjnodpulom", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "ivrdccxqsrbdciaicdbrsqxccdrvi", "lbqrjiznoitwbqnqvuvsmolwqprca", "bhjzqrwakrlmisgpfjfsrmcblpiiy", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "ivrdccxqsrbdciaicdbrsqxccdrvi", "bhjzqrwakrlmisgpfjfsrmcblpiiy", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "acrpqwlomsvuvqnqbwtionzijrqbl", "ivrdccxqsrbdciaicdbrsqxccdrvi", "darpflzfnlcnqvasljnzjnodpulom", "bhjzqrwakrlmisgpfjfsrmcblpiiy", "lbqrjiznoitwbqnqvuvsmolwqprca", "ivrdccxqsrbdciaicdbrsqxccdrvi", "ivrdccxqsrbdciaicdbrsqxccdrvi", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "bhjzqrwakrlmisgpfjfsrmcblpiiy", "lbqrjiznoitwbqnqvuvsmolwqprca", "yiiplbcmrsfjfpgsimlrkawrqzjhb", "acrpqwlomsvuvqnqbwtionzijrqbl", "acrpqwlomsvuvqnqbwtionzijrqbl", "acrpqwlomsvuvqnqbwtionzijrqbl", "bhjzqrwakrlmisgpfjfsrmcblpiiy" };
    int[] back = { 2979, 2770, 1745, 831, 125, 1960, 1630, 574, 1615, 461, 1740, 2575, 2855, 1461, 2495, 14, 2888, 3644, 3432, 2568, 1997, 581, 581, 3511, 333, 2393, 1942, 1427, 893, 1442, 3466, 608 };
    assertEquals(50313, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case85() {
    String[] front = { "ogfb", "ceec", "aytd", "epxk", "szmx", "dtya", "tonc", "adda", "ceec", "dfmi", "riir", "icci", "anwq", "nzrr", "gntj", "adda", "oxve", "riir", "pwwp", "mttm", "cnot", "oiio", "mttm", "diid", "ywrf", "frwy", "kuuk", "imfd", "jtcv", "atqc", "kuuk", "anwq", "jtcv", "duud", "jynn", "gevx", "dvlq", "oiio", "cnot", "kuuk", "nzrr", "mppm", "kxpe", "arra", "qjlz", "dztx", "qwna" };
    int[] back = { 8465, 6903, 7900, 7597, 7898, 426, 3358, 1261, 4471, 3608, 5527, 1610, 1546, 9321, 1209, 5090, 5527, 8725, 8574, 9612, 4421, 3507, 5774, 8850, 589, 8686, 3824, 237, 5537, 2150, 5894, 8083, 670, 2929, 5525, 4503, 5100, 7940, 6079, 8662, 1651, 6879, 1425, 4276, 2083, 1333, 6672 };
    assertEquals(136876, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case86() {
    String[] front = { "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "heekgkeeh", "kfloccjxw", "kfloccjxw", "sriwijxrx", "sriwijxrx", "sriwijxrx", "sriwijxrx", "sriwijxrx", "sriwijxrx", "sriwijxrx", "sriwijxrx", "sriwijxrx", "wwnpppnww", "wwnpppnww", "wwnpppnww", "wwnpppnww", "wwnpppnww", "wwnpppnww", "wwnpppnww", "wwnpppnww", "wxjccolfk", "wxjccolfk", "wxjccolfk", "wxjccolfk", "wxjccolfk", "wxjccolfk", "wxjccolfk", "wxjccolfk", "wxjccolfk", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs", "xrxjiwirs" };
    int[] back = { 291588, 88674, 186593, 345840, 343186, 195482, 287926, 323387, 370054, 521861, 260649, 370542, 438425, 255232, 130545, 355120, 322060, 322060, 79525, 108357, 370054, 281733, 109072, 323387, 389235, 344385, 343186, 44636, 75598, 102926, 222961, 389235, 186219, 516416, 186219, 64975, 545366, 10930, 318182, 13873, 222961, 10930, 264829, 344385, 68727, 418499, 263223, 358667, 79525, 430346 };
    assertEquals(11894427, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case87() {
    String[] front = { "cmzwyjyxlnsfgkwrbhlprflcmqpxiuyj", "cmzwyjyxlnsfgkwrbhlprflcmqpxiuyj", "djkzgyfopotaemgodwuctaprrpqnntoi", "dyralguuxdgakqwmmwqkagdxuuglaryd", "dyralguuxdgakqwmmwqkagdxuuglaryd", "fnohkqwgbabqyiipvxxekjqygrwbkdnp", "hluflnqdgfpvzadcgaihfacbrnzyyfqx", "hwwcbopfzpwrywyvwcyajernopiexohg", "iotnnqprrpatcuwdogmeatopofygzkjd", "jyuixpqmclfrplhbrwkgfsnlxyjywzmc", "lauvvxlwowszjofmmfojzswowlxvvual", "mslcwsheidjrnaewcxnhydtxdqrrfnlu", "oemrtlibirzckkoxkphcybjwhhgxawvl", "pndkbwrgyqjkexxvpiiyqbabgwqkhonf", "smcdtnyjzfdsidzddzdisdfzjyntdcms", "smcdtnyjzfdsidzddzdisdfzjyntdcms", "viquqzrblirtbkcwwckbtrilbrzquqiv", "viquqzrblirtbkcwwckbtrilbrzquqiv" };
    int[] back = { 190268, 109231, 158715, 180967, 143667, 65850, 78186, 142888, 150816, 7550, 142387, 220028, 2856, 10889, 200326, 18329, 33399, 219458 };
    assertEquals(1522621, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case88() {
    String[] front = { "zsnbmrmplplpmrmbnsz", "yznrijxgkjmdnoxwvim", "yvubnsqtadzgnwzxete", "yljzmxkofimhtebjoze", "yfrpussjgbvypnhjvop", "xrvaavzjlltdyhzdcix", "xcfoqkhxpapxhkqofcx", "wxlswakuixealioqkms", "vvggjwomghmzahsdzfv", "vlctnuiqlbdrpepxrbi", "shsbdjlzcwczljdbshs", "rtllbcfakxeqhybbiig", "reygnbnwkuntluxhakz", "ppjzfgsiztzisgfzjpp", "onfddtzceqgqmwggflq", "occdjthynqgqxiugevg", "nrmabbpxiptifxjzvuf", "nfcrmvijfmfjivmrcfn", "kzrsmqmkdjiobbhkqef", "khplhlckhbcailbdguc", "jwbasqklruqufumwdnk", "jqyieymkutvehxscgrg", "irlrrvfwxyoufpiqecy", "irfdcjktodkejyagpll", "imqvvjnunzakridvrgm", "ijmagrxbjbqltpertln", "grgcsxhevtukmyeiyqj", "ebsbquqwapbtgcjzmyv", "eaemnohdduddhonmeae", "dfzirqcmnkjsnyglrlx", "dewjotroiegexqrrxha", "dekfiyyokakoyyifked", "cpkpstzlfnflztspkpc", "aybejfkeoagozyobpog", "avvymvdsntfylpmpobm", "amlbianyciuvjattvhl" };
    int[] back = { 44597, 44863, 98628, 215813, 82394, 180514, 144563, 96161, 4932, 82707, 243511, 53869, 223450, 268414, 165252, 130637, 29569, 280986, 136911, 2330, 42303, 116948, 256209, 157799, 269801, 207606, 209146, 235683, 204049, 262055, 218947, 58113, 3001, 66931, 112577, 97114 };
    assertEquals(607080, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case89() {
    String[] front = { "obviwimtyqgptlydmzroa", "socdvghvhrlxpvnkmrdev", "dovgyjqfddhcteixcrfiy", "hxtsillmmxitisirwvwlj", "nvlyjyklvypyvlkyjylvn", "xhpdbwmdhsqshdmwbdphx", "hxtsillmmxitisirwvwlj", "jlwvwrisitixmmllistxh", "uehtutisyvmgkxlbomcbv", "snrjwjevnrsdnyljnbksz", "zyekxeefiztzifeexkeyz", "zyekxeefiztzifeexkeyz", "sxoapnliqnvnqilnpaoxs", "uehtutisyvmgkxlbomcbv", "jlwvwrisitixmmllistxh", "socdvghvhrlxpvnkmrdev", "xsztxcwxggjvkxuplxzqy", "hxtsillmmxitisirwvwlj", "mploknwelhfslqmxoxvis", "dovgyjqfddhcteixcrfiy" };
    int[] back = { 77729, 99477, 66238, 49028, 66238, 54747, 107287, 36484, 55720, 38183, 38451, 55720, 41679, 99277, 96351, 41679, 54834, 59205, 75314, 44906 };
    assertEquals(459736, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case90() {
    String[] front = { "rzppjimqangxrsmtkxrprle", "hzsxtmjulckgkclujmtxszh", "quhcbaagsvxriekposknpft", "rozhsqkdzcdavqhgybcnfoa", "ozlxvrqzjkssskjzqrvxlzo", "hzbsqdiywxwdtwvkfstyrev", "icdwpezugigvetnkvpemdwj", "uwhhjeqltgjkraeuhlpdftz", "cilikkssohcjyconfdalrmj", "jwdmepvkntevgiguzepwdci", "eipshyeertzaztreeyhspie" };
    int[] back = { 3974, 3571, 1447, 1149, 12077, 6467, 21022, 22121, 23934, 28268, 19607 };
    assertEquals(68897, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case91() {
    String[] front = { "yuqewzbelrrumvmcsdrpikzdnekqcitthgbnimgkcaqrkueqo", "sjxnnyplhofzwgkeotbbiuwxftmhgafininmwihyojgvbwtwd", "yuqewzbelrrumvmcsdrpikzdnekqcitthgbnimgkcaqrkueqo", "yuqewzbelrrumvmcsdrpikzdnekqcitthgbnimgkcaqrkueqo", "ruyohhlbmpwtipeuogyjgdjutujdgjygouepitwpmblhhoyur", "dnorjjryjqwywozwsqzfdfztxopeudrrdrdmjvsjdffbrxyfj", "dnorjjryjqwywozwsqzfdfztxopeudrrdrdmjvsjdffbrxyfj", "jfyxrbffdjsvjmdrdrrduepoxtzfdfzqswzowywqjyrjjrond", "jfyxrbffdjsvjmdrdrrduepoxtzfdfzqswzowywqjyrjjrond", "vqsejyhtrhloerpsozupyzxtfoddsopzsuvblfxwzpouabmqf", "ruyohhlbmpwtipeuogyjgdjutujdgjygouepitwpmblhhoyur", "jfyxrbffdjsvjmdrdrrduepoxtzfdfzqswzowywqjyrjjrond", "jfyxrbffdjsvjmdrdrrduepoxtzfdfzqswzowywqjyrjjrond", "dnorjjryjqwywozwsqzfdfztxopeudrrdrdmjvsjdffbrxyfj", "dnorjjryjqwywozwsqzfdfztxopeudrrdrdmjvsjdffbrxyfj", "vqsejyhtrhloerpsozupyzxtfoddsopzsuvblfxwzpouabmqf" };
    int[] back = { 464972, 445821, 496340, 343981, 478941, 480323, 619306, 153655, 91508, 89100, 300720, 524909, 367976, 259538, 448956, 612620 };
    assertEquals(3725832, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case92() {
    String[] front = { "wgojhrzwvxa", "qlifppldqta", "qnemcpsouha", "zirmlrniyac", "hksyixoshvd", "mqpcygrgvoy", "grbrwublqbk", "dknbuwubnkd", "mygzlwsaryk", "wmfnusuxkly", "kjxtppptxjk", "wgojhrzwvxa", "rswtwjycqxx", "ybhwzzunbhd", "euwoirhetjw", "yvvctujpxxm", "gwferdrefwg", "kyoflxlfoyk", "dhbnuzzwhby", "lvlgwgmnlbw", "plvmlrfhuvy", "pigbefniuxs", "zmybbbbbymz", "matcdfqdxho", "imldklqldgw", "jalbeqojwsk", "rswtwjycqxx", "gahiydlufsn", "opdaeneadpo", "iwbzoeghocn", "euwoirhetjw", "pgpqaxaqpgp", "benkwywkneb", "zmybbbbbymz", "axvwzrhjogw", "yvuhfrlmvlp", "wbswnznwsbw", "bjllfuflljb", "cpzdgvojkgt", "bydqzqzqdyb", "hzrwfsfwrzh", "tgjipmnmuzz", "mzqqruszudm", "tgjipmnmuzz", "dvhsoxiyskh", "zzumnmpijgt", "plvmlrfhuvy", "hksyixoshvd", "rmfionfpujv", "premvzwjtsf" };
    int[] back = { 921, 98, 143, 130, 736, 677, 863, 854, 637, 466, 458, 621, 1033, 248, 150, 394, 789, 1022, 555, 764, 664, 831, 357, 380, 998, 694, 15, 870, 848, 293, 103, 221, 308, 599, 842, 289, 656, 745, 724, 526, 1015, 991, 603, 41, 169, 931, 994, 664, 116, 19 };
    assertEquals(8654, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case93() {
    String[] front = { "baxbfmatowvkzursiflar", "njrpmmbshhdwjhisyttrj", "yymqubrlpeyrbbmhgurdc", "njrpmmbshhdwjhisyttrj", "baxbfmatowvkzursiflar", "njrpmmbshhdwjhisyttrj", "ekkjzzugowrwoguzzjkke", "yymqubrlpeyrbbmhgurdc", "ekkjzzugowrwoguzzjkke", "baxbfmatowvkzursiflar" };
    int[] back = { 102, 243, 30, 418, 283, 507, 1056, 1429, 804, 98 };
    assertEquals(1860, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case94() {
    String[] front = { "abc", "abc", "def", "cba", "fed" };
    int[] back = { 24, 7, 63, 222, 190 };
    assertEquals(499, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case95() {
    String[] front = { "a" };
    int[] back = { 1 };
    assertEquals(1, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case96() {
    String[] front = { "topcoder", "redcoder", "redocpot" };
    int[] back = { 7, 5, 3 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case97() {
    String[] front = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y" };
    int[] back = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000 };
    assertEquals(50000000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case98() {
    String[] front = { "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb", "bdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdbbdcaffacdb" };
    int[] back = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    assertEquals(150, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case99() {
    String[] front = { "aba" };
    int[] back = { 11 };
    assertEquals(11, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case100() {
    String[] front = { "a" };
    int[] back = { 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case101() {
    String[] front = { "cac", "bab" };
    int[] back = { 7, 6 };
    assertEquals(7, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case102() {
    String[] front = { "a", "b", "a", "a" };
    int[] back = { 1, 2, 3, 4 };
    assertEquals(9, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case103() {
    String[] front = { "a", "b", "b", "c", "d" };
    int[] back = { 1, 12, 14, 8, 5 };
    assertEquals(34, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case104() {
    String[] front = { "aba" };
    int[] back = { 1 };
    assertEquals(1, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case105() {
    String[] front = { "aaa", "aba" };
    int[] back = { 50, 12 };
    assertEquals(50, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case106() {
    String[] front = { "a" };
    int[] back = { 1000 };
    assertEquals(1000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case107() {
    String[] front = { "aaa" };
    int[] back = { 11 };
    assertEquals(11, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case108() {
    String[] front = { "topcoderaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "abaabaabaabaabaabaabaabaabaabaabaaba", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaredocpot" };
    int[] back = { 1000, 1000, 1000 };
    assertEquals(3000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case109() {
    String[] front = { "aaaa", "cbbc", "aaaa", "aaaa", "dawg" };
    int[] back = { 1, 2, 4, 3, 100 };
    assertEquals(9, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case110() {
    String[] front = { "ab", "ab", "ab", "ba", "ba", "ba", "ba" };
    int[] back = { 1, 2, 3, 4, 1000, 6, 10000 };
    assertEquals(11012, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case111() {
    String[] front = { "aba", "fef", "aba", "aba" };
    int[] back = { 1, 4, 2, 3 };
    assertEquals(9, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case112() {
    String[] front = { "aba" };
    int[] back = { 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case113() {
    String[] front = { "aaa", "aaa", "aaa" };
    int[] back = { 100, 10, 1 };
    assertEquals(111, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case114() {
    String[] front = { "ab", "aa", "ba" };
    int[] back = { 2, 2, 2 };
    assertEquals(6, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case115() {
    String[] front = { "abc", "abc", "def", "cba", "fed", "cba" };
    int[] back = { 7, 24, 63, 222, 190, 212 };
    assertEquals(718, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case116() {
    String[] front = { "aaa" };
    int[] back = { 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case117() {
    String[] front = { "ab", "ba", "ab" };
    int[] back = { 5, 6, 6 };
    assertEquals(12, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case118() {
    String[] front = { "aba", "bbc", "cbb" };
    int[] back = { 1, 2, 2 };
    assertEquals(5, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case119() {
    String[] front = { "abc", "sss", "cba" };
    int[] back = { 3, 433, 5 };
    assertEquals(441, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case120() {
    String[] front = { "aba", "ccc", "mmm" };
    int[] back = { 5, 7, 3 };
    assertEquals(7, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case121() {
    String[] front = { "aba", "cdc", "cdc", "cdc" };
    int[] back = { 5, 3, 7, 4 };
    assertEquals(16, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case122() {
    String[] front = { "abcba" };
    int[] back = { 1 };
    assertEquals(1, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case123() {
    String[] front = { "a", "a", "a", "b", "b", "b" };
    int[] back = { 10, 10, 5, 10, 10, 3 };
    assertEquals(45, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case124() {
    String[] front = { "abcd", "dcba", "abcd", "dcba" };
    int[] back = { 1, 2, 3, 4 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case125() {
    String[] front = { "abc", "abc", "def", "cba", "fed", "aba", "aba", "aba" };
    int[] back = { 24, 7, 63, 222, 190, 20, 10, 30 };
    assertEquals(559, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case126() {
    String[] front = { "abc", "aba", "cba" };
    int[] back = { 23, 24, 25 };
    assertEquals(72, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case127() {
    String[] front = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u" };
    int[] back = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 87, 9, 1, 2, 1 };
    assertEquals(87, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case128() {
    String[] front = { "aba" };
    int[] back = { 12 };
    assertEquals(12, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case129() {
    String[] front = { "abc", "eec", "cba", "cee", "abc", "ced", "cce" };
    int[] back = { 7, 8, 9, 11, 9, 7, 8 };
    assertEquals(37, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case130() {
    String[] front = { "a", "b", "a" };
    int[] back = { 1, 2, 1 };
    assertEquals(4, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case131() {
    String[] front = { "ab", "ba", "cc", "dd" };
    int[] back = { 1, 1, 500, 1000 };
    assertEquals(1002, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case132() {
    String[] front = { "aa", "ab", "ab", "ba", "cd", "dc", "dc" };
    int[] back = { 1, 1, 2, 3, 1, 2, 3 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case133() {
    String[] front = { "abc", "abc", "cba" };
    int[] back = { 1, 10, 100 };
    assertEquals(110, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case134() {
    String[] front = { "abc", "def", "ghi", "jkl", "mno", "onm", "lkj", "fed", "cba", "ihg", "pep", "mir", "rim" };
    int[] back = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(13, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case135() {
    String[] front = { "abc", "cba", "ccc" };
    int[] back = { 1, 2, 3 };
    assertEquals(6, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case136() {
    String[] front = { "aba", "ddd" };
    int[] back = { 5, 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case137() {
    String[] front = { "aaa", "aaa", "aaa", "aaa", "aaa" };
    int[] back = { 5, 3, 4, 5, 4 };
    assertEquals(21, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case138() {
    String[] front = { "aba", "aca" };
    int[] back = { 10, 20 };
    assertEquals(20, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case139() {
    String[] front = { "aaa" };
    int[] back = { 1 };
    assertEquals(1, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case140() {
    String[] front = { "aba", "cbc" };
    int[] back = { 20, 30 };
    assertEquals(30, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case141() {
    String[] front = { "aabbb", "aabaa", "aabaa", "aabaa", "bbbaa", "abbba" };
    int[] back = { 2, 1, 2, 1, 2, 5 };
    assertEquals(12, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case142() {
    String[] front = { "aba", "aka" };
    int[] back = { 5, 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case143() {
    String[] front = { "aaa", "bbb", "aaa", "aba", "bba", "abb", "bab", "bba", "aba", "aab", "bab", "abb", "bba", "aba", "bba", "ada" };
    int[] back = { 1, 3, 2, 1, 1, 2, 1, 3, 2, 1, 1, 2, 3, 1, 1, 3 };
    assertEquals(21, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case144() {
    String[] front = { "aaab", "baaa", "baaa" };
    int[] back = { 1, 2, 3 };
    assertEquals(4, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case145() {
    String[] front = { "abc", "cba", "aaa", "aaa", "bbb", "bbb", "ccc", "ddd", "eee" };
    int[] back = { 13, 13, 12, 11, 19, 17, 2, 7, 5 };
    assertEquals(92, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case146() {
    String[] front = { "aea" };
    int[] back = { 1000 };
    assertEquals(1000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case147() {
    String[] front = { "abc", "abc", "def", "cba", "fed" };
    int[] back = { 24, 77, 63, 222, 190 };
    assertEquals(552, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case148() {
    String[] front = { "xxx", "xex", "xxx" };
    int[] back = { 1, 1, 1 };
    assertEquals(3, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case149() {
    String[] front = { "abc", "cba", "cba" };
    int[] back = { 3, 2, 5 };
    assertEquals(8, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case150() {
    String[] front = { "aa", "aa", "aa", "bb", "bb", "bb", "cc", "cc", "cc", "dd", "dd", "ab", "ba" };
    int[] back = { 5, 6, 6, 10, 7, 10, 20, 6, 20, 30, 30, 10, 10 };
    assertEquals(159, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case151() {
    String[] front = { "a" };
    int[] back = { 99 };
    assertEquals(99, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case152() {
    String[] front = { "topot", "reder", "redoc" };
    int[] back = { 7, 5, 3 };
    assertEquals(7, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case153() {
    String[] front = { "aaa", "bbb" };
    int[] back = { 4, 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case154() {
    String[] front = { "a", "b", "c" };
    int[] back = { 3, 33, 333 };
    assertEquals(333, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case155() {
    String[] front = { "aaa" };
    int[] back = { 5 };
    assertEquals(5, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case156() {
    String[] front = { "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd", "absdfdasfasd" };
    int[] back = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case157() {
    String[] front = { "abc", "abc", "def", "cba", "fed", "aba", "xyx" };
    int[] back = { 24, 7, 63, 222, 190, 1000, 2000 };
    assertEquals(2499, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case158() {
    String[] front = { "aba", "aba" };
    int[] back = { 1, 10 };
    assertEquals(11, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case159() {
    String[] front = { "cac", "bab", "dad", "aaa", "bbb", "ccc", "aaa", "bbb" };
    int[] back = { 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(30, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case160() {
    String[] front = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
    int[] back = { 1000000, 999999, 999998, 999997, 999996, 999995, 999994, 999993, 999992, 999991, 999990, 999989, 999988, 999987, 999986, 999985, 999984, 999983, 999982, 999981, 999980, 999979, 999978, 999977, 999976, 999975, 999974, 999973, 999972, 999971, 999970, 999969, 999968, 999967, 999966, 999965, 999964, 999963, 999962, 999961, 999960, 999959, 999958, 999957, 999956, 999955, 999954, 999953, 999952, 999951 };
    assertEquals(49998775, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case161() {
    String[] front = { "ana" };
    int[] back = { 50 };
    assertEquals(50, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case162() {
    String[] front = { "a", "b", "a" };
    int[] back = { 5, 1, 2 };
    assertEquals(8, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case163() {
    String[] front = { "abbasabba", "laxmannnn" };
    int[] back = { 10, 1 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case164() {
    String[] front = { "abc", "abc", "def", "cba", "fed", "abc" };
    int[] back = { 24, 7, 63, 222, 190, 30 };
    assertEquals(505, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case165() {
    String[] front = { "bb", "bb" };
    int[] back = { 7, 7 };
    assertEquals(14, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case166() {
    String[] front = { "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "top", "pot", "tot", "tot", "tot", "tot", "tot", "tot", "tot", "tot", "tot", "tot" };
    int[] back = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(285, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case167() {
    String[] front = { "aaa", "aba", "aaa" };
    int[] back = { 1, 2, 3 };
    assertEquals(6, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case168() {
    String[] front = { "abccba", "deffed", "abcdef", "fedcba" };
    int[] back = { 1, 2, 3, 4 };
    assertEquals(9, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case169() {
    String[] front = { "anuj", "adda", "baab", "baab", "baab", "juna" };
    int[] back = { 5, 70, 5, 5, 5, 5 };
    assertEquals(90, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case170() {
    String[] front = { "ab", "ab", "cc", "ba" };
    int[] back = { 1, 30, 400, 1 };
    assertEquals(431, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case171() {
    String[] front = { "xyz", "xyz", "xyz", "aba" };
    int[] back = { 1, 5, 6, 20 };
    assertEquals(20, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case172() {
    String[] front = { "a", "b" };
    int[] back = { 10, 10 };
    assertEquals(10, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case173() {
    String[] front = { "a", "b", "a" };
    int[] back = { 7, 5, 3 };
    assertEquals(15, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case174() {
    String[] front = { "a", "b", "c", "c" };
    int[] back = { 1000, 10, 100, 100 };
    assertEquals(1200, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case175() {
    String[] front = { "aa", "bb" };
    int[] back = { 4, 4 };
    assertEquals(4, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case176() {
    String[] front = { "a", "a", "a" };
    int[] back = { 1, 1, 1 };
    assertEquals(3, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case177() {
    String[] front = { "noon" };
    int[] back = { 1000000 };
    assertEquals(1000000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case178() {
    String[] front = { "abc", "abc", "def", "cba", "fed", "cba", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa" };
    int[] back = { 7, 24, 63, 222, 190, 212, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
    assertEquals(1090, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case179() {
    String[] front = { "top", "red", "red", "aba", "bab" };
    int[] back = { 7, 5, 3, 2, 4 };
    assertEquals(4, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case180() {
    String[] front = { "aaa", "bbb", "aaa", "aaa" };
    int[] back = { 50, 60, 100, 150 };
    assertEquals(310, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case181() {
    String[] front = { "abc", "abc", "def", "cba", "fed" };
    int[] back = { 7, 24, 63, 222, 190 };
    assertEquals(499, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case182() {
    String[] front = { "abc", "abc", "def", "cba", "fed" };
    int[] back = { 24, 78, 63, 222, 190 };
    assertEquals(553, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case183() {
    String[] front = { "abcba" };
    int[] back = { 2 };
    assertEquals(2, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case184() {
    String[] front = { "a", "b", "a", "a" };
    int[] back = { 1, 2, 1, 3 };
    assertEquals(6, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case185() {
    String[] front = { "aa", "ab", "ab", "ba", "cd", "dc", "dc", "as", "sa", "sa", "ew", "ew", "we" };
    int[] back = { 1, 1, 2, 3, 1, 2, 3, 1, 3, 2, 3, 2, 1 };
    assertEquals(18, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case186() {
    String[] front = { "abc", "abc", "cba" };
    int[] back = { 1, 5, 10 };
    assertEquals(15, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case187() {
    String[] front = { "aaa", "bbb" };
    int[] back = { 1, 2 };
    assertEquals(2, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case188() {
    String[] front = { "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh", "qqqqqqqqqqqqqqqqqqqqqqqqqqqrrrgggggghhhh" };
    int[] back = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 100000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 100000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 4353, 45, 345, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 4567, 1000000, 1000000, 1000000 };
    assertEquals(0, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case189() {
    String[] front = { "asdsa", "werew", "qwert", "trewq", "zxcvb", "bvcxz", "qwert", "tgyht" };
    int[] back = { 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(24, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case190() {
    String[] front = { "aaa", "aba", "ccc", "top", "pot" };
    int[] back = { 1, 1, 1, 1, 1 };
    assertEquals(3, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case191() {
    String[] front = { "abc", "cba", "cba" };
    int[] back = { 10, 20, 30 };
    assertEquals(40, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case192() {
    String[] front = { "a", "b", "c" };
    int[] back = { 5, 5, 5 };
    assertEquals(5, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case193() {
    String[] front = { "aba", "aba", "xyx", "zyz", "abc", "cba", "cba", "def", "fed", "def" };
    int[] back = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };
    assertEquals(859, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case194() {
    String[] front = { "aa", "bb", "cc", "dd", "ee", "aa", "bb", "cc", "dd", "ff", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "zz" };
    int[] back = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(1244, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case195() {
    String[] front = { "abc", "abc", "cba" };
    int[] back = { 1, 100, 2 };
    assertEquals(102, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case196() {
    String[] front = { "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo", "oooooooooooooooooooooooooooooooooooooooooooooooooo" };
    int[] back = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 };
    assertEquals(2300000, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case197() {
    String[] front = { "fef" };
    int[] back = { 800 };
    assertEquals(800, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case198() {
    String[] front = { "abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba", "zyxwvutsrqponmlkjihgfedcba", "zyxwvutsrqponmlkjihgfedcba", "ayxwvutsrqponmlkjihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy", "yzxwvutsrqponmlkjihgfedcba", "zyxwvutsrqponmlkjihgfedcba", "ayxwvutsrqponmlkjihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "abcdfeghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy", "yzxwvutsrqponmlkjihgfedcba", "zyxwvutsrpqonmlkjihgfedcba", "ayxwvutsrqponmlkjihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "abcdefghijklmnopqrstuvwxzy", "yzxwvutsrqponmlkjihgfedcba", "zyxwvutsrpqonmlkjihgfedcba", "ayxwvutsrqponmlkjihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "abcdfeghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy", "yzxwvutsrqponmlkjihgfedcba", "zyxwvutsrpqonmlkjihgfedcba", "ayxwvutsrqponmlkjihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "abcdfeghijklmnopqrstuvwxyz", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "yzxwvutsrqponmlkjihgfedcba", "zyxwvutsrpqonmlkjihgfedcba", "ayxwvutsrqponmlkjhigfedcbz", "zbcdefghijklmnopqrstuvwxya", "abcdfeghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy", "yzxwvutsrqponmlkjihgfedcba", "zyxwvutsrpqonmlkjihgfedcba", "ayxwvutsrqponmlkjihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "abcdfeghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy", "yzxwvutsrqponmlkjiggfedcba", "bbbbbbbbbbbbbbbbbbbbbbbbbb", "ayxwvutsrqponmljkihgfedcbz", "zbcdefghijklmnopqrstuvwxya", "zzzzzzzzzzzzzzzzzzzzzzzzzz", "zzzzzzzzzzzzzzzzzzzzzzzzzz" };
    int[] back = { 99, 8, 888, 1, 100000, 2, 8, 10000, 999999, 234244, 987898, 1000000, 1000000, 99, 8, 888, 1, 100000, 2, 8, 10000, 999999, 234244, 987898, 1000000, 1000000, 99, 8, 888, 1989, 100000, 2, 8, 10000, 999999, 234244, 987898, 1000000, 1000000, 99, 8, 808, 1908, 100000, 10000, 999999, 234244, 987898, 100000, 1000000 };
    assertEquals(11090531, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case199() {
    String[] front = { "aaa", "aaa", "aaa" };
    int[] back = { 5, 6, 7 };
    assertEquals(18, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case200() {
    String[] front = { "aaa" };
    int[] back = { 23 };
    assertEquals(23, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case201() {
    String[] front = { "abba", "deed" };
    int[] back = { 123, 321 };
    assertEquals(321, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case202() {
    String[] front = { "abc", "aba", "cba" };
    int[] back = { 1, 100, 1 };
    assertEquals(102, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case203() {
    String[] front = { "ab", "ab", "ab", "ab", "ba", "ba", "ba", "ba" };
    int[] back = { 10, 11, 12, 13, 14, 14, 14, 15 };
    assertEquals(103, palindromegame.getMaximum(front, back));
  }

  @Test
  public void case204() {
    String[] front = { "aba", "aba" };
    int[] back = { 4, 7 };
    assertEquals(11, palindromegame.getMaximum(front, back));
  }

}
