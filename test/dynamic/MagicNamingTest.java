package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MagicNamingTest {
  MagicNaming magicnaming = new MagicNaming();

  @Test
  public void case1() {
    String magicName = "aba";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case2() {
    String magicName = "babbaba";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case3() {
    String magicName = "philosophersstone";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case4() {
    String magicName = "knuthmorrispratt";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case5() {
    String magicName = "acrushpetrtourist";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case6() {
    String magicName = "makotoivan";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case7() {
    String magicName = "abcdefghijklmnopqrstuvwxyz";
    assertEquals(26, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case8() {
    String magicName = "x";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case9() {
    String magicName = "bba";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case10() {
    String magicName = "bbababaabaabaa";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case11() {
    String magicName = "abaababaaababaabba";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case12() {
    String magicName = "bbbaaaabbaabaabbbabaaaaaaabb";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case13() {
    String magicName = "ba";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case14() {
    String magicName = "babaaaba";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case15() {
    String magicName = "bbabbabaababbbababbbbaaaaaaabbabbbbaabbbbbbaaaa";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case16() {
    String magicName = "bbbaababbbbbbaababaabaaab";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case17() {
    String magicName = "abbaaaa";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case18() {
    String magicName = "bbaaababaaaabbbbbaabbbaa";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case19() {
    String magicName = "ababbbbaabaaaaabaabababaabbaaabaa";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case20() {
    String magicName = "abbababbabbbaa";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case21() {
    String magicName = "bababaa";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case22() {
    String magicName = "aaaaabbaaaabbaabab";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case23() {
    String magicName = "baabababbaaaabbaaaaaababaabbbabbaba";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case24() {
    String magicName = "aababbbbbaabbabaaaabbbbaababababbabbaaabbababbbbba";
    assertEquals(11, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case25() {
    String magicName = "aaabaaaaaa";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case26() {
    String magicName = "baabbaaabbbababba";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case27() {
    String magicName = "babaaaabbbabbabbaabaabbabaa";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case28() {
    String magicName = "baaaaaaaabbabbaaa";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case29() {
    String magicName = "aabbbababbabbbbaaaabaaaabaabaaaabbba";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case30() {
    String magicName = "abaababaabaabababbabaab";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case31() {
    String magicName = "abbabababbbaaaabbaaaabaaabbbabbabbaa";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case32() {
    String magicName = "aabbababbabbaababbaabbbababababbbaabaab";
    assertEquals(11, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case33() {
    String magicName = "baabbbbaaabaabaaabababbbaaabaabab";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case34() {
    String magicName = "aaababaaabaaaaaaababbbaababaabbbbbaabba";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case35() {
    String magicName = "bababb";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case36() {
    String magicName = "abbaabaabbbbabaaaabbabbaaabaaabbbbababba";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case37() {
    String magicName = "abaaaabbababaaababaaabbbaabbabbaabbbbbaabbaaabba";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case38() {
    String magicName = "aaabbaabbbbaabaaabbbaabbababbabbabaa";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case39() {
    String magicName = "aabbbbbbabbbbabbaaaabbbbbaaabaaaabaaab";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case40() {
    String magicName = "kgkjjihjkggjhkjijggh";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case41() {
    String magicName = "jhkjhjhgkghjhijjgggiijgkkjgghghikikigihkhkikhghkk";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case42() {
    String magicName = "ijhhkgihjigjhhkikghhkh";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case43() {
    String magicName = "hijjggggjhhgiihjkkijgii";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case44() {
    String magicName = "kjjkkgkkjhiihhhkkggjkhjjkijjhkhkghgigjjhijkhi";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case45() {
    String magicName = "jjikjgjgihkijigihjj";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case46() {
    String magicName = "ghhgkkjjighhhghhgh";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case47() {
    String magicName = "kkkjkiiikkijkihihigkkikhkgikjghgjjgkjjij";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case48() {
    String magicName = "ghkgkkgjihkjkggjgkkkikiijgjkjhikghgjihihhhghiig";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case49() {
    String magicName = "jihhgkjjhkkjiikjgg";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case50() {
    String magicName = "kj";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case51() {
    String magicName = "gjikjkikikjg";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case52() {
    String magicName = "ig";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case53() {
    String magicName = "jjjjkkjjghjgkkihjhijkjjgkhhgkjhkikghijjjkkgkgggkg";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case54() {
    String magicName = "kijjiihhgjkihghhgkjkjjkjhi";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case55() {
    String magicName = "khjghiijjgkgjkhigjgjggjijikjkiijki";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case56() {
    String magicName = "ihhhhgkghikkkkgjggj";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case57() {
    String magicName = "jjjgkigjggiihhggghiijkhikjkjghhii";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case58() {
    String magicName = "hhjgghgkigjkkiiijjjkikjjjghihhgjgjkijjhij";
    assertEquals(11, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case59() {
    String magicName = "ikhjjkjg";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case60() {
    String magicName = "kjhhikkggjkhkjkkhikhgghijiiigkiigjgijijkgjkgjh";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case61() {
    String magicName = "hgghijikghgjkjhkigggkjikghjghgkhghgijhjjki";
    assertEquals(10, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case62() {
    String magicName = "khggjgikigjkkjihkkkkhijkhiigigkjjik";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case63() {
    String magicName = "kigkjggiigkikjjghh";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case64() {
    String magicName = "jkghjjkhkkjkijkgihgjihgighhgggkghkihgggiikjkkihg";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case65() {
    String magicName = "iigigkihkhgjhjijkghhkjgjkjjigih";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case66() {
    String magicName = "jjhggggghhjihikkjj";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case67() {
    String magicName = "iihjhkjj";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case68() {
    String magicName = "iikijhihkiggggiihhkggkhghkhhikii";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case69() {
    String magicName = "kih";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case70() {
    String magicName = "fy";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case71() {
    String magicName = "zikjbkltvnakagmanazsyvsfxbgnvifkjghtczabqxkpf";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case72() {
    String magicName = "mrpewjulnovfikpggkhvpbjhnnuiefiubxpjtplupvixi";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case73() {
    String magicName = "ctoskkhzmjpvd";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case74() {
    String magicName = "hdvnaznbqwzljo";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case75() {
    String magicName = "lbjoqfnsozahrlpjjhxakkhofvwwsksmtyfobojrdc";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case76() {
    String magicName = "oykvlbosegruxmbj";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case77() {
    String magicName = "ofrbedconibeupaibqbhrsbfsyiiizbuzyswdcis";
    assertEquals(10, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case78() {
    String magicName = "tencergxvyaajtmssvnsighuvfdssnxmkscegxyvqeeixvnxze";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case79() {
    String magicName = "wtgtvejlbkxnzmxcbufwlikrpzt";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case80() {
    String magicName = "jssgaihkpjcplkkixvilr";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case81() {
    String magicName = "hbmfrmk";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case82() {
    String magicName = "esgqtvblarjegjcfvvl";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case83() {
    String magicName = "ldbgqrkal";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case84() {
    String magicName = "wvurzhgvpnnrlbzbbsijdgdxpjueticwbqnvnlrpkz";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case85() {
    String magicName = "tuylyhmajmdmbmgfgqxbgumjtcbqs";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case86() {
    String magicName = "fblwddghhsevzhuosjeusfafrwxaofk";
    assertEquals(10, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case87() {
    String magicName = "sqxmiybmdtvnfgysmanlealrs";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case88() {
    String magicName = "zshqbonnrmhuclfuzzi";
    assertEquals(2, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case89() {
    String magicName = "npsovhphzcghggzxkhmuzteo";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case90() {
    String magicName = "jefrytnowmrcvl";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case91() {
    String magicName = "kfdfalqejdkczoeyqifrmhrcrgrccvbjm";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case92() {
    String magicName = "scilsb";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case93() {
    String magicName = "nrlrgsewnysafebzhkrqmyobbdtkqgaakys";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case94() {
    String magicName = "oqgcmafzreciidbkalrcufuudtyhzwpjxnysz";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case95() {
    String magicName = "ufbmsartfadrobobrnvfdprtpunmwydygfi";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case96() {
    String magicName = "bcptxzukqamlqjqnnpesotnb";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case97() {
    String magicName = "axcbbhdhsuztecchhjyjfssydfajpnvxsxda";
    assertEquals(12, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case98() {
    String magicName = "bhwkoimhvomdmhlb";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case99() {
    String magicName = "qgzglsqxyntjkvofwegjzfsdpiucajpgkaeyqcsqteu";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case100() {
    String magicName = "rlksygnlmjyghjlwlrvmfpopkijpdyxsttwipopbuzkdaposfe";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case101() {
    String magicName = "kfxitbtsppvzelpcqyafygwefhnbxlvbktrroldrcfwicllxze";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case102() {
    String magicName = "tlensfbnbutucfygzezfrtdfgepanmrjkooysfnohsujbqugkh";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case103() {
    String magicName = "dnmywfaaiwruzlilgbiaybtdiledgwbyynwaxixvtjbgsivmwt";
    assertEquals(10, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case104() {
    String magicName = "sehqcxgckhjbuihrkpqiffvpzslhrlmtzglpsemskthxlqiady";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case105() {
    String magicName = "rzsoombuvcwtxczydqpgznqqnhkubylzspvwbsopucfmpsfnqm";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case106() {
    String magicName = "vzsrpttzrpnvbmxsxlderudrzmtrkprjgopapmmxqhyctdeouf";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case107() {
    String magicName = "bvonublagnfwdutpabtybplbyjsfyphmktksknfaxqetkcphnz";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case108() {
    String magicName = "wxaiuhxwweqmfhbplitafbmrketgbuhxiziktduccmknvwzpnt";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case109() {
    String magicName = "goibuohakixubdzfmxjfvcmvztlgrrsptddpqgruujkptkjocn";
    assertEquals(10, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case110() {
    String magicName = "oqkgwjeejkryphryhjpmperhvinwjtyjtajcbsdpyfjdkhntfc";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case111() {
    String magicName = "xbzmdhaabycsdklmampemxbwhtxbkkexqylacaeakuuhhqsbhm";
    assertEquals(3, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case112() {
    String magicName = "miuwrtwqulwvsmbeyrtvtkdyodpbttlvmlizgjrsbqtbqerctk";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case113() {
    String magicName = "uxjzyqnfocqulsyzkmdnnivghsamxlatwcnjpmjvsnuvutehje";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case114() {
    String magicName = "gqsstjukyaxhrjdieddbocfzmhjtvnejkgqtfajwpoepdsoatv";
    assertEquals(10, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case115() {
    String magicName = "wiagbotxzkxtnybgpqfgcasuhpjyzhjastspsfbulwqslzpjgm";
    assertEquals(6, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case116() {
    String magicName = "hhjkmyshucbsjcwrgjtuiqtfzesttiozihknniwibhyrdjxpqq";
    assertEquals(11, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case117() {
    String magicName = "pjwkmvurnjtgoggscxgxnfrvsynsjswowgerhspgeoldlohymq";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case118() {
    String magicName = "avypnpbejmosoymuatjzplygnjnyqelawbuhwbtzffxkvauadc";
    assertEquals(12, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case119() {
    String magicName = "eoliamiiowizghyrluqycfnuebfrkzvmuvzyyvtfwrtrstupxh";
    assertEquals(13, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case120() {
    String magicName = "zzzzz";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case121() {
    String magicName = "gmezsyfytjxyefasinzxyfdktwszdahqszixzbdeoadtrddasd";
    assertEquals(9, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case122() {
    String magicName = "rri";
    assertEquals(1, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case123() {
    String magicName = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    assertEquals(49, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case124() {
    String magicName = "gabzhijk";
    assertEquals(5, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case125() {
    String magicName = "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij";
    assertEquals(14, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case126() {
    String magicName = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertEquals(50, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case127() {
    String magicName = "ahahahdjflahahahdjflahahahdjflahahahdjflahahahdjfl";
    assertEquals(13, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case128() {
    String magicName = "abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde";
    assertEquals(12, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case129() {
    String magicName = "fdgsgfhasyufbdsjcvdshbuifsdhbfhsdbfhsfsfdsbvfhgsfh";
    assertEquals(8, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case130() {
    String magicName = "rubenjosesue";
    assertEquals(4, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case131() {
    String magicName = "qowiuerjsadhjasgdbmncbvjsafgwiueryweirqpefasdj";
    assertEquals(7, magicnaming.maxReindeers(magicName));
  }

  @Test
  public void case132() {
    String magicName = "ardebaoncadencedipingeerrorfghijklmnopqrstuvwxyouz";
    assertEquals(28, magicnaming.maxReindeers(magicName));
  }

}
