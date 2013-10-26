package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class BooksTest {
  Books books = new Books();

  @Test
  public void case1() {
    String[] titles = { "Algorithms", "Purely Functional Data Structures", "Intro to C", "Automata and Computability" };
    assertEquals(2, books.sortMoves(titles));
  }

  @Test
  public void case2() {
    String[] titles = { "the fellowship of the ring", "the return of the king", "The two towers" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case3() {
    String[] titles = { "Basic Engineering Circuit Analysis", "A Course in Combinatorics", "Artificial Intelligence", "Asimovs Guide to Shakespeare", "The Nature of Space and Time", "A Time for Trumpets", "Essentials of Artificial Intelligence", "Life by the Numbers", "Cognitive Psychology", "ColdFusion" };
    assertEquals(5, books.sortMoves(titles));
  }

  @Test
  public void case4() {
    String[] titles = { "A", "B", "A", "A", "B" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case5() {
    String[] titles = { "BNBURPJQBE", "YUQSYFXKJV", "NMLBUBRXZX", "SSCNSNSNWS", "GWGFPSJBBC", "HNYWQSPBKL", "CKUPYOHTRC", "EVPVEMXOYZ", "FMPTJWXXMQ" };
    assertEquals(5, books.sortMoves(titles));
  }

  @Test
  public void case6() {
    String[] titles = { "BKWYYNGLYL", "HTETBIEKZM", "USWXLDDPJY", "ZLDKXSATZY" };
    assertEquals(0, books.sortMoves(titles));
  }

  @Test
  public void case7() {
    String[] titles = { "SQWYMIZZFH", "UFQPRDDSBI", "SJOUQEWGRO", "WLPEQHTGLD", "QBZFWXXKJQ", "LQROYGRAWY", "ONENMYHGGA", "PMMBUFQPIG", "XJNQGNUITI", "SXUMISPBAQ", "CMBKZUQZTA", "HFDOOXGENI", "BJUSUTVVCN" };
    assertEquals(9, books.sortMoves(titles));
  }

  @Test
  public void case8() {
    String[] titles = { "BWQZQIGTAL", "RAKVMRGOPV" };
    assertEquals(0, books.sortMoves(titles));
  }

  @Test
  public void case9() {
    String[] titles = { "BPPBYEHBFN", "RSROUBCWHF", "HIXZNHCSSA", "ANVFOTVEMD", "WTTCVWDDDX", "CUKAQBNTDT", "FRSRTSPLIR", "RBLHHAOLQG", "LLXYXNGSNL", "ZOZVYOVJKJ", "YFNRUZLYLZ", "ZAOFPYFLOG", "JDJEJKNMFT", "ZDJAIBTBIR", "RIJJGYJWBY" };
    assertEquals(8, books.sortMoves(titles));
  }

  @Test
  public void case10() {
    String[] titles = { "GWAQTXABON", "OESCEENPAP", "MMYKIRPCVI", "LDMNLQFEBU", "QJRHIGWQYX", "CQBINXUVRG", "IHYZUODVZG", "MHWPUZPYGQ", "CXGYDCSCGO" };
    assertEquals(6, books.sortMoves(titles));
  }

  @Test
  public void case11() {
    String[] titles = { "ZVFSOIOPEP", "LVQXNFBBCM", "OXOBQITDLI", "URVVKXTKKN", "IVANZBVQLK", "YEXSQIOXAS", "JSKPXXPFAD" };
    assertEquals(3, books.sortMoves(titles));
  }

  @Test
  public void case12() {
    String[] titles = { "ASVSJWIVNX", "ZZSKFJXGTP", "NCQZTIRQJK", "UZXANECZVY", "VAEICNHQLV", "LBKPVVIFIW", "NPDBQCFFNE" };
    assertEquals(3, books.sortMoves(titles));
  }

  @Test
  public void case13() {
    String[] titles = { "YKDZCFWCBH" };
    assertEquals(0, books.sortMoves(titles));
  }

  @Test
  public void case14() {
    String[] titles = { "KCGTIJRAJL", "ODOQEJJACR", "BYDHTSFGSX", "IPGHQOARPJ", "QCJBZOHFVO", "QWPZJOHIIG", "GSTCBKCGLE", "UHCTRSGZBT", "OZLRKVGAZW", "EWEINOGMNB", "BQTTOWLUGP", "JKQLVQCLJU", "SNVQARUSPA", "MMMOPCROLR", "HGSIJFIXZA" };
    assertEquals(10, books.sortMoves(titles));
  }

  @Test
  public void case15() {
    String[] titles = { "HRQUMUJJRY", "TJBNIUWZVG", "OBSSOIEHPY", "ERDZEZXIER", "TFOLBGEDPQ", "TQXJVXMKTI", "EKVUKAHELJ", "YDIXKDRRYH", "IYYTPDHBXZ", "SLAYLJXRAT", "FAQSIZSZMH", "CVEKQXEYKH", "JEYYQIENVJ", "PKCYYGHOFN", "ZUIAREKMCW", "KIJWCVLNWI", "NGIUPHTSXO", "QINGENHYAD" };
    assertEquals(12, books.sortMoves(titles));
  }

  @Test
  public void case16() {
    String[] titles = { "JGWKCTZXAT", "JFLIDPRNDH", "UODEHIJXBU" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case17() {
    String[] titles = { "NSKBYIZLQP", "BTFZLZFGYW", "NLIWKAJOKO", "XVXMFGENWD", "AIGRGAHSXT", "ZYGNIGEBPJ", "SWEKWEWRAY", "ZGAORAXBXU", "BXAOVVPXNG" };
    assertEquals(5, books.sortMoves(titles));
  }

  @Test
  public void case18() {
    String[] titles = { "PEUQRLJZBJ", "ZRHVGWIUXK", "CYLSUSINHH", "CXXXWVFQKL", "NLBPIXMWYB", "QVARLOVXQT", "DYHLGNFWMH", "SZPEVKYUIZ", "FYHRSSTUUH", "KVBYUYAKYX", "IVXBIWQQNR", "QSMPHPKXNK", "OPVGTIDWWV", "LAPLRVLVEZ", "YTYJSITACG", "GUCZZJVLKY", "LNWOLHJPVN", "ZAYAKAXWBM" };
    assertEquals(11, books.sortMoves(titles));
  }

  @Test
  public void case19() {
    String[] titles = { "OUSKAZTPXQ", "DIKGZRHZXZ", "SYWICILKIW", "IKKRIPROBW", "QEDWZRFBUW", "JUCCWSLRPO", "WFAHUOSAEV" };
    assertEquals(3, books.sortMoves(titles));
  }

  @Test
  public void case20() {
    String[] titles = { "XPIUDZLZFU", "IJYRCUVGBO", "QMETLSLQYB", "YVOLQMQUQY", "RXNHEABHHK", "ZLFCQHQHAG", "WDRLGMARKS" };
    assertEquals(3, books.sortMoves(titles));
  }

  @Test
  public void case21() {
    String[] titles = { "XTHUBBFHJU", "DTIFKWZLEK", "TYZWHPGSTQ", "GVRPMVIKZX", "FEHBCDCGLN", "JDITHIOMZS", "ATLTOJUUDE", "NWTLFBZMHF", "HGWNNMKXRB" };
    assertEquals(5, books.sortMoves(titles));
  }

  @Test
  public void case22() {
    String[] titles = { "QGKNMTGJBK", "HHOYUMFALG", "SOZLRPCVXP", "NEFVTVQGAX", "AKUOUZHOMB", "XRRYZHHWAO", "TBRFTYLSNM", "XAGXWEVHEL", "FANYLXMPLA", "CHGDJJPBFK", "ZYICCLGPBP", "VLQRJOPGNF", "VYPFLMHQVN", "BZCWDXMZLT", "FEUJFZOMDY", "APUIWVNKOF", "RUFAMJGAWL" };
    assertEquals(12, books.sortMoves(titles));
  }

  @Test
  public void case23() {
    String[] titles = { "QGVQQAWDHA", "HQUUPUJIWG", "ZELKKLVDTY", "GFSKBRYLLP", "VVNTYJREKW", "WBCQGUNAIM", "GAAJOIXHNN", "VBMEDJXAWT", "LKTNFPJAJL", "ZXUNDXPFPS", "LEGZLWDXNF" };
    assertEquals(7, books.sortMoves(titles));
  }

  @Test
  public void case24() {
    String[] titles = { "PGKMQKRTRR", "OLSHXHKIXC", "AJNROFCNBI", "WFLPGKAPGM", "VEUHUNIORF", "ZKESEJLGDK", "XEAPIPUMKF", "HTLFIAJIZK", "SQKWIIHYPQ", "EGNDNIPBRF", "SCBURQLZFS", "ACCLZWNBNA", "ZKTEPRLPTT", "KKCTDJJJXJ", "OBCUCTSZYM" };
    assertEquals(11, books.sortMoves(titles));
  }

  @Test
  public void case25() {
    String[] titles = { "JKNISVGRCY", "FAQKPISUDD", "BYUJZBZCPM" };
    assertEquals(2, books.sortMoves(titles));
  }

  @Test
  public void case26() {
    String[] titles = { "ONYEELBKFC" };
    assertEquals(0, books.sortMoves(titles));
  }

  @Test
  public void case27() {
    String[] titles = { "KHOSFHDPNY", "YYFXLOWEFC", "LJPKHOLKDH", "LDLMPXWLXQ", "EEVAQNUXYQ", "DOHDABSNVE", "STDBWEEDBD", "EHCALWMAVD", "JLGRXDWRIU", "GZZYLOQXXY", "LFDUJVSSBT", "KXNBHHFANX", "WRDBWBHVGY", "PWXFSZRMDC" };
    assertEquals(9, books.sortMoves(titles));
  }

  @Test
  public void case28() {
    String[] titles = { "RIICZNMNYJ", "RIIHQUZGEE", "GQLOYDQZLU", "XLJKZQRNHI", "XBYKUDZGGX", "AXRRRTCPWK", "AQJYOUZKPS", "MRPDUEWWIG", "OOCTQSWCJU", "PHUDKMGUGB", "FJISWTTGLV", "PMLNBIWWXT", "ABGVEAMTPO", "BPIHSZJSMQ" };
    assertEquals(9, books.sortMoves(titles));
  }

  @Test
  public void case29() {
    String[] titles = { "TYEWQKITWG", "YVZYITGFMU", "JBEBHMJGAF", "BJQAXWTVDM", "XVCUGGQWGK", "WFKJFLLAKN", "YZANJRUCQJ", "XAMVAIVJXN", "MVPBOIDAIV" };
    assertEquals(6, books.sortMoves(titles));
  }

  @Test
  public void case30() {
    String[] titles = { "PCABZEWBSP", "ZFXECXPBYO", "VUIZEWURYW", "JOSAJAREWY" };
    assertEquals(2, books.sortMoves(titles));
  }

  @Test
  public void case31() {
    String[] titles = { "KMOUOYOZCJ", "GDBNLEECPK", "OGHVEHLYZM", "YEJBEOJXOP", "ENSVYGFWGH", "RYMKTEUSIH", "WXYMNAFQUT", "PDPTZAFTBI", "WCSAHNITWP", "XENRUVJWLD", "CEIDZBXBWL", "QIZSZYMVHJ", "EDPEFRSHZA", "KTQOLYDBEK", "OWVKPYKWIR" };
    assertEquals(10, books.sortMoves(titles));
  }

  @Test
  public void case32() {
    String[] titles = { "SGZPIANEYW", "NYWVIQAKYU", "AEMEEDIZET", "TMWBANEDRP", "FOGQVSMUVI", "MSIJRDJHLJ", "UXHSZZYLVJ", "LOKAZHNJUC", "ZGCFAPLOCQ", "IXURLTJDSU", "GVYZEIBJJV", "GCXLDWBHXQ" };
    assertEquals(7, books.sortMoves(titles));
  }

  @Test
  public void case33() {
    String[] titles = { "AVLKETSJHK", "PJOUMPFXSK", "IGEMJHFMDH", "EGTPCWGEUK", "MKZXFGMJVY", "HWRVVBVJOA", "OTMBZWDCJY", "ZFOMQZNZTX", "MPJROXPUDQ", "YRYHEEKXMM", "YTDEUYOUYU", "HYABFWYCEK", "JNOFWNBEES", "WGQXQTVVCC", "PWPTRYPOSA", "VIFDNQNLUZ" };
    assertEquals(9, books.sortMoves(titles));
  }

  @Test
  public void case34() {
    String[] titles = { "This Book Has No Title", " This Book Does Have A Title" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case35() {
    String[] titles = { "What Is The", "What Is The ", "What Is The Title Of This Book" };
    assertEquals(0, books.sortMoves(titles));
  }

  @Test
  public void case36() {
    String[] titles = { "z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g" };
    assertEquals(19, books.sortMoves(titles));
  }

  @Test
  public void case37() {
    String[] titles = { "the fellowship of the ring", "the return of the king", "The two towers" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case38() {
    String[] titles = { "Basic Engineering Circuit Analysis", "A Course in Combinatorics", "Artificial Intelligence", "Asimovs Guide to Shakespeare", "The Nature of Space and Time", "A Time for Trumpets", "Essentials of Artificial Intelligence", "Life by the Numbers", "Cognitive Psychology", "ColdFusion" };
    assertEquals(5, books.sortMoves(titles));
  }

  @Test
  public void case39() {
    String[] titles = { "A", "B", "A", "A", "B" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case40() {
    String[] titles = { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAT", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAS", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAR", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAO", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAN", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAM", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAL", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAK", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAG", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAF", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAE", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" };
    assertEquals(19, books.sortMoves(titles));
  }

  @Test
  public void case41() {
    String[] titles = { "Basic Engineering Circuit Analysis", "A Course in Combinatorics", "Artificial Intelligence", "Asimovs Guide to Shakespeare", "The Nature of Space and Time", "A Time for Trumpets", "Essentials of Artificial Intelligence", "Life by the Numbers", "Cognitive Psychology", "ColdFusion", "ColdFusion", "A Course in Combinatorics", "A Course in Combinatorics" };
    assertEquals(7, books.sortMoves(titles));
  }

  @Test
  public void case42() {
    String[] titles = { "z", "a", "b", "c", "d", "e" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case43() {
    String[] titles = { "C", "B", "A", "D" };
    assertEquals(2, books.sortMoves(titles));
  }

  @Test
  public void case44() {
    String[] titles = { "z", "a", "b", "c", "d" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case45() {
    String[] titles = { "A", "B", "C", "D", "E", "A", "B", "C", "D", "E", "A", "B", "C", "D", "E", "A", "B", "C", "D", "E" };
    assertEquals(12, books.sortMoves(titles));
  }

  @Test
  public void case46() {
    String[] titles = { "Z", "Y", "X", "W", "V", "U", "T", "Q", "N", "M", "L", "K", "J", "I", "H", "G", "F", "D", "C", "E" };
    assertEquals(18, books.sortMoves(titles));
  }

  @Test
  public void case47() {
    String[] titles = { "Z", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "A" };
    assertEquals(2, books.sortMoves(titles));
  }

  @Test
  public void case48() {
    String[] titles = { "Basic Engineering Circuit Analysis", "A Course in Combinatorics", "Artificial Intelligence", "Asimovs Guide to Shakespeare", "The Nature of Space and Time", "A Time for Trumpets", "Essentials of Artificial Intelligence", "Life by the Numbers", "Cognitive Psychology", "ColdFusion", "Crognitive Psychology", "asdf", "dfghf", "eartyrt", "re", "hr", "hrt", "h", "d", "rteryetyertyey" };
    assertEquals(8, books.sortMoves(titles));
  }

  @Test
  public void case49() {
    String[] titles = { "D", "C", "B", "A" };
    assertEquals(3, books.sortMoves(titles));
  }

  @Test
  public void case50() {
    String[] titles = { "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A" };
    assertEquals(19, books.sortMoves(titles));
  }

  @Test
  public void case51() {
    String[] titles = { "B", "C", "A", "D" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case52() {
    String[] titles = { "B", "C", "D", "A", "E" };
    assertEquals(1, books.sortMoves(titles));
  }

  @Test
  public void case53() {
    String[] titles = { "A", "B", "C", "D", "E", "S", "R", "Q", "L", "M", "N", "O", "P", "K", "J", "I", "H", "G", "F" };
    assertEquals(9, books.sortMoves(titles));
  }

  @Test
  public void case54() {
    String[] titles = { "D", "D", "C", "A", "A" };
    assertEquals(3, books.sortMoves(titles));
  }

}
