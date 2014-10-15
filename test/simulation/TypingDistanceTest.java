package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class TypingDistanceTest {
  TypingDistance typingdistance = new TypingDistance();

  @Test
  public void case1() {
    String keyboard = "qwertyuiop";
    String word = "potter";
    assertEquals(8, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case2() {
    String keyboard = "kwadrutove";
    String word = "rowerowe";
    assertEquals(39, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case3() {
    String keyboard = "qwertyuiopasdfghjklzxcvbnm";
    String word = "topcodersingleroundmatchgoodluckhavefun";
    assertEquals(322, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case4() {
    String keyboard = "tc";
    String word = "tctcttccctccccttc";
    assertEquals(9, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case5() {
    String keyboard = "a";
    String word = "aaaaaaaaaaa";
    assertEquals(0, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case6() {
    String keyboard = "d";
    String word = "dddddddddddddddddddddddddddddddddddddddddddddddddd";
    assertEquals(0, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case7() {
    String keyboard = "co";
    String word = "coccooccocoococoocccoo";
    assertEquals(13, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case8() {
    String keyboard = "vej";
    String word = "ejevvevevjjjejvevvvevvejeeeejjjejjveevjjvjejevveve";
    assertEquals(40, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case9() {
    String keyboard = "lsit";
    String word = "sltittsltiitststsitlltitltiilsillltiliitiss";
    assertEquals(58, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case10() {
    String keyboard = "xkumo";
    String word = "xmmxuuuxmxooxxumkxokuxokkxkmoxxkkumukkxkxkkmxmxoom";
    assertEquals(81, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case11() {
    String keyboard = "tqlbdo";
    String word = "oboq";
    assertEquals(8, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case12() {
    String keyboard = "ecjskyi";
    String word = "eesjjyykeysccsseyskkejeeyciikkcesejjeejysyycceyies";
    assertEquals(101, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case13() {
    String keyboard = "awcyepqf";
    String word = "ppfywwyceayfyaacaypfyecpcqyywfafqyp";
    assertEquals(90, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case14() {
    String keyboard = "kdqtbmnep";
    String word = "bpnkdqtdnq";
    assertEquals(26, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case15() {
    String keyboard = "vhtgywqkem";
    String word = "wvkkvwqqtqetevqqmhqmvmythemmvhtmtwvkhqvvgegekmhkwy";
    assertEquals(209, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case16() {
    String keyboard = "tqrgnikvyxj";
    String word = "gjtynnynyviitjyikgxrgjivyir";
    assertEquals(103, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case17() {
    String keyboard = "cahvkibdmejt";
    String word = "vhejijvabvimajedbhtackvabvmkitjceatchtjbvtijbeckvi";
    assertEquals(226, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case18() {
    String keyboard = "kfsqvzpwbtmhg";
    String word = "qqphwmzzkbpmvbhggbfzpkwwbbfvwggkhkzwwvfvvmhpsspwtf";
    assertEquals(182, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case19() {
    String keyboard = "izkldmubhqonrg";
    String word = "zzoimlbgrgdkhirdgdigbl";
    assertEquals(128, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case20() {
    String keyboard = "qilwphgasdcfvun";
    String word = "hcpflldugvslficifnvvwahcuqhiacpsgispvvvqdgwlavcwsp";
    assertEquals(259, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case21() {
    String keyboard = "efsxwdybtivcpurk";
    String word = "yidkxkbifcvbbtpkfyyyrxvdpurcfssbepibcykyxwrwpcb";
    assertEquals(247, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case22() {
    String keyboard = "sipndlwvyzcxtemkg";
    String word = "ntekzwvgxyewygenltgvmssvgmcnytcelcnvmdxexlnglypykw";
    assertEquals(275, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case23() {
    String keyboard = "weiuosvgkhtbjdymrx";
    String word = "drbdetjgitumrduhhdwdshohxeehtyewjrytwy";
    assertEquals(239, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case24() {
    String keyboard = "uatspmolvizqnhryedg";
    String word = "vqgaahssnnmeepmuqevhdhovooqeezeqszinpvahooazganumt";
    assertEquals(296, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case25() {
    String keyboard = "phjafsgzoirxqevkcumy";
    String word = "earxykijjrcjcfryygucfh";
    assertEquals(152, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case26() {
    String keyboard = "zdpvagwsouileyjnfqrcm";
    String word = "alqnueweyiqsnszzczagdoiuquivpugrvenszjccicvqzrlnaa";
    assertEquals(352, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case27() {
    String keyboard = "damgreuvtjiqswkfxzopbc";
    String word = "tticddvdizidsfqjgmicwwqojjisofsrpvwggmzrazsfofpffs";
    assertEquals(294, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case28() {
    String keyboard = "pnmjsqldkwfhoyxrzibvtug";
    String word = "mnkqjwbqbptdzinxzjrytrfuqvsvdqpskglxqbyrtixgqdkvfz";
    assertEquals(420, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case29() {
    String keyboard = "tfqvbawsdeuypcgxmirlokjz";
    String word = "zayapdleckjikgoflvwykzktkdpwsmrc";
    assertEquals(254, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case30() {
    String keyboard = "ijzqafksuobcmlypgthrdwnex";
    String word = "obyhorcajwymhsfotmhyqodtm";
    assertEquals(157, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case31() {
    String keyboard = "ljkhuogfrqwycvabszxptiendm";
    String word = "feiusvgkvwdocbciqktviclbsgvzdonuzmlktyybolrjxynilc";
    assertEquals(481, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case32() {
    String keyboard = "flcmhuzedpkatjwoigbxsvqnyr";
    String word = "ktvnnhiaasmqxfddocosnoshwn";
    assertEquals(213, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case33() {
    String keyboard = "tfvpkgomeuyriqhjzwnaxscbdl";
    String word = "hkzdbfsouxxhkmxdfydgwqqyalosqxvykafgldxxgogejayqln";
    assertEquals(442, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case34() {
    String keyboard = "kdliovyxcuajrnpsmthbfqgezw";
    String word = "vlkbyzrjbuwslnoshdmxoumbngatishhqthviysyihxwjztnil";
    assertEquals(421, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case35() {
    String keyboard = "mxcqsfkpbawgzlrtdynheojiuv";
    String word = "ffpaceimfkarzthgjtevemdenvkuyvmkexzwcktluustvkersq";
    assertEquals(422, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case36() {
    String keyboard = "xabuvlzychokmnpsdirqewftgj";
    String word = "imwrqmzipxtlvvmeqjovhwpeslpjbtwyoxrurxaahspdukeaei";
    assertEquals(438, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case37() {
    String keyboard = "mwnruqchglsofaybitdvxejzkp";
    String word = "wwwfoirbrycfkvpstvtswsctykkqjotylrwrusfrpwxtulpuqz";
    assertEquals(412, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case38() {
    String keyboard = "uwjseliorkqdtngfbamyvhzpxc";
    String word = "jnhtcg";
    assertEquals(52, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case39() {
    String keyboard = "qdawxopznfimuvlsehrjytckbg";
    String word = "itgfggtzjopoqzyxfeamkyeqhiqmxbxpcrhxgcptcytnnxqcou";
    assertEquals(458, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case40() {
    String keyboard = "isyrwvdnlbqjzcthumaxgpkfeo";
    String word = "ukjokxadbbzhaoqxopvlhrsztgqeytezrg";
    assertEquals(268, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case41() {
    String keyboard = "xeplifckyhaodrmqzbuvwsjngt";
    String word = "yvvwzxkypuabekenotjttubcfjofciunddidotsaegnpzziyto";
    assertEquals(407, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case42() {
    String keyboard = "pfxrlngakdjzcheyobmwsuivtq";
    String word = "rcdgbgkwet";
    assertEquals(65, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case43() {
    String keyboard = "uswzhvxckleagipbydtjornfmq";
    String word = "wzmyntnsjynqpzehrccgljxtegwcqtkoctsp";
    assertEquals(330, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case44() {
    String keyboard = "jgkmapryeobtxihnvcfulsdwqz";
    String word = "ybizsclklgaommexhetojxjbcnsdzpxcqwapzaigcpbfdqxrjb";
    assertEquals(385, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case45() {
    String keyboard = "anbqfskrldzgjotyvwemxhcipu";
    String word = "vmpjscntltpaifjdgvlfqxfxaduhqrmhzbekymhpevrpgjaqhp";
    assertEquals(480, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case46() {
    String keyboard = "gnyrlobmixsvcutejhdpkfzawq";
    String word = "wvasjmytqikqkmpqbshqutbbhjlgvuiqeskxhmpqivfzczxobi";
    assertEquals(416, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case47() {
    String keyboard = "tdxayljmpungcrzhvqsoiebwfk";
    String word = "jlwqqpndnbbdggonfocrvxbmlnycjduvuxwlyenlntquaadbwu";
    assertEquals(411, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case48() {
    String keyboard = "jzkyoavrswfnqdlpbxeucimtgh";
    String word = "oqnfywrsuvqwumjmaffgvynpevkzmog";
    assertEquals(264, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case49() {
    String keyboard = "poeayickhxzfbdqlnrmstjwuvg";
    String word = "hmwjcvzwwujhzzingowbooukvvgpicfeafuixolqipyinruyui";
    assertEquals(443, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case50() {
    String keyboard = "eucbakgtsrpxhqvflwomniydjz";
    String word = "vagcvydmdjnzkwzziasqporzqemqwdsvvzgrxtsnfktzwic";
    assertEquals(360, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case51() {
    String keyboard = "wocnthkgupysamdjxvqizbferl";
    String word = "glvovglzznskvwzxarqrpqhodoaciqbcpafdwmlsnvhekkmcot";
    assertEquals(501, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case52() {
    String keyboard = "qwertyuiopasdfghjklzxcvbnm";
    String word = "qmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqmqm";
    assertEquals(1225, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case53() {
    String keyboard = "ab";
    String word = "b";
    assertEquals(0, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case54() {
    String keyboard = "abcdefg";
    String word = "cb";
    assertEquals(1, typingdistance.minDistance(keyboard, word));
  }

  @Test
  public void case55() {
    String keyboard = "abcdefghijklmnopqrstuvwx";
    String word = "abcdefghijklmnopqrstuvwx";
    assertEquals(23, typingdistance.minDistance(keyboard, word));
  }

}
