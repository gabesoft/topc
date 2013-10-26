package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class RemovingDigitsTest {
  RemovingDigits removingdigits = new RemovingDigits();

  @Test
  public void case1() {
    String number = "12345";
    String digits = "513";
    assertEquals("24", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case2() {
    String number = "112352";
    String digits = "1123";
    assertEquals("52", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case3() {
    String number = "123456654321";
    String digits = "612534";
    assertEquals("654321", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case4() {
    String number = "654321123456";
    String digits = "612534";
    assertEquals("654321", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case5() {
    String number = "2654982765982365";
    String digits = "2345978";
    assertEquals("698265265", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case6() {
    String number = "19919293";
    String digits = "1132";
    assertEquals("9999", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case7() {
    String number = "2834284798354";
    String digits = "";
    assertEquals("2834284798354", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case8() {
    String number = "1627346856394756487394857463748593872718624";
    String digits = "112245647593";
    assertEquals("7686397648739485746374853878624", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case9() {
    String number = "112";
    String digits = "1";
    assertEquals("12", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case10() {
    String number = "67";
    String digits = "";
    assertEquals("67", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case11() {
    String number = "52565";
    String digits = "2";
    assertEquals("5565", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case12() {
    String number = "14683252";
    String digits = "826";
    assertEquals("14352", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case13() {
    String number = "88746889659";
    String digits = "678869898";
    assertEquals("45", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case14() {
    String number = "29889232193237";
    String digits = "8392228199233";
    assertEquals("7", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case15() {
    String number = "87283878457688339";
    String digits = "7788893834";
    assertEquals("8728563", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case16() {
    String number = "96949171972825919472";
    String digits = "9779249281511";
    assertEquals("9699742", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case17() {
    String number = "94769124617372135977258";
    String digits = "77937283475492";
    assertEquals("976161215", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case18() {
    String number = "13283889825213517114725573";
    String digits = "13253521572493";
    assertEquals("888853171172", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case19() {
    String number = "96621384976426847917861718424";
    String digits = "4499664117288867896";
    assertEquals("6374271142", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case20() {
    String number = "63948242229649179794785535958628";
    String digits = "3885947849645725546998129";
    assertEquals("9227362", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case21() {
    String number = "88975381139391321535871435441653578";
    String digits = "4143589814179533313";
    assertEquals("9833258715165578", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case22() {
    String number = "69221355545295117949465859399554889731";
    String digits = "138152121869443575994";
    assertEquals("95555299969554873", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case23() {
    String number = "32136392761328166213138275575345131411252";
    String digits = "191226156528315137243354";
    assertEquals("86633277531311122", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case24() {
    String number = "68569657831934818124522155187229135529614332";
    String digits = "58835729956121532482212567852413635";
    assertEquals("998411613", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case25() {
    String number = "33257212876142487923324949965131895716459126931";
    String digits = "9115217672583";
    assertEquals("3728764249233249499653189516491231", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case26() {
    String number = "15817371143718659984352444646293885924219925618152";
    String digits = "1";
    assertEquals("5817371143718659984352444646293885924219925618152", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case27() {
    String number = "4512662372147424494846615339527745862687";
    String digits = "129442268461762778594634753263454864";
    assertEquals("7215", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case28() {
    String number = "44182882939243692312166314948157233491561";
    String digits = "9229793154613843324412916491316516228";
    assertEquals("8843", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case29() {
    String number = "619646946696729432186628869914553157975535";
    String digits = "69893825463966162696";
    assertEquals("9949743218661455177555", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case30() {
    String number = "3597295411957252375755621371819212983145919";
    String digits = "9912122521143821725594979355759837553";
    assertEquals("976111", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case31() {
    String number = "27256881971492548195588821717668937618636782";
    String digits = "612548586277167717355998";
    assertEquals("99248888217186186362", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case32() {
    String number = "428257596197582243488843949876582354934925879";
    String digits = "9893855619428729782233469854549894452828";
    assertEquals("77543", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case33() {
    String number = "1376917715759221241513721961534698539655655666";
    String digits = "7713752199";
    assertEquals("769715922141513219615346853655655666", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case34() {
    String number = "92561243695236753989413744234548379339291363463";
    String digits = "33726546337";
    assertEquals("961295275989414423454839339291363463", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case35() {
    String number = "162725575229241779383391335271974927622374559787";
    String digits = "2474277529757291399357629331717755638892245272";
    assertEquals("31", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case36() {
    String number = "2165296726141463852622838344911192267919488882288";
    String digits = "213896884421882622322";
    assertEquals("6597641856883491119267914822", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case37() {
    String number = "33822185421845685447412783725133438895729547478948";
    String digits = "8348841";
    assertEquals("3822854218568547412783725133439572954747948", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case38() {
    String number = "2312";
    String digits = "23";
    assertEquals("21", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case39() {
    String number = "122232232124324221222";
    String digits = "2223232";
    assertEquals("13222144221222", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case40() {
    String number = "81234578961229139393931234567898765432198762134";
    String digits = "12345667895";
    assertEquals("896122913939393123478987654321872134", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case41() {
    String number = "663539473627384927364738283747637273434621475";
    String digits = "2345857373723432476";
    assertEquals("69769767388374763234346214", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case42() {
    String number = "123456789123456789123456789123456789123456";
    String digits = "1234566789123455679123498761225";
    assertEquals("98834713456", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case43() {
    String number = "7863274619324325786437856438756438756348";
    String digits = "12345678923";
    assertEquals("87643278643785643875643875634", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case44() {
    String number = "12345678912345678912345678912345678912345678912345";
    String digits = "1111223344556677889";
    assertEquals("9923456789234567891234567812345", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case45() {
    String number = "123456789123456789123456789123456789123456789";
    String digits = "123456789123456789123456789";
    assertEquals("998123456781234567", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case46() {
    String number = "96324823648325471325426483245732834852345825432458";
    String digits = "182343284583246583245327";
    assertEquals("98687648324532452345254324", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case47() {
    String number = "93919353216243561277542961447639692577889623397251";
    String digits = "9995264517526473627892375";
    assertEquals("9995321643619614738233721", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case48() {
    String number = "69617738813683866442384143539389328426849931699266";
    String digits = "2962426937544369131897913";
    assertEquals("9888866844339383864316266", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case49() {
    String number = "12345678911234567891123456789112345678911234567891";
    String digits = "1234567891123456789112345678911234567891123456789";
    assertEquals("1", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case50() {
    String number = "18957615728297624857926196512491856784163851186577";
    String digits = "261965186573895761579";
    assertEquals("98297624872665124188418511577", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case51() {
    String number = "123456789123456789123456789123456789123456789";
    String digits = "339998845511122";
    assertEquals("679467923456781234567812345678", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case52() {
    String number = "12345678912345678912345678912345678912345678912345";
    String digits = "12345678912345678912345691234567891234567891";
    assertEquals("875432", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case53() {
    String number = "6578923421435365435643765364573266786786723452345";
    String digits = "892342143536543567886536432623";
    assertEquals("7765645776763452345", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case54() {
    String number = "341248623646327632457843653345123123453475347573";
    String digits = "12312312764568567";
    assertEquals("4866437324743533452323453475343", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case55() {
    String number = "324125";
    String digits = "2354";
    assertEquals("21", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case56() {
    String number = "123456789123456789123456789123456789123456789";
    String digits = "123456789987654321123456789";
    assertEquals("998123456781234567", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case57() {
    String number = "191";
    String digits = "1";
    assertEquals("91", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case58() {
    String number = "123897651236912873663763745614669834";
    String digits = "2865136374646";
    assertEquals("97651291287366376341983", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case59() {
    String number = "123456789123456789123456789123456789123456789";
    String digits = "12345678912345678912345678912345679123456789";
    assertEquals("8", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case60() {
    String number = "68765167964657653132468764565753461987614165196873";
    String digits = "131687987465649";
    assertEquals("96657653326876456575461876141651673", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case61() {
    String number = "9182736455463782911467899753125895765433";
    String digits = "997875511223344";
    assertEquals("9876691468975312585765433", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case62() {
    String number = "11111111111111111111111111111111111111111111111111";
    String digits = "11111111111111111111111";
    assertEquals("111111111111111111111111111", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case63() {
    String number = "1234567891234567891234567891234567891234567891234";
    String digits = "1";
    assertEquals("234567891234567891234567891234567891234567891234", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case64() {
    String number = "12345678911111111111111111111111111111111111111";
    String digits = "111111";
    assertEquals("23456789111111111111111111111111111111111", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case65() {
    String number = "123456789123456789123456789123456789123456789";
    String digits = "987654321";
    assertEquals("912345678912345678912345678912345678", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case66() {
    String number = "935231";
    String digits = "35";
    assertEquals("9321", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case67() {
    String number = "1129591444444444444444444444444444444444444444444";
    String digits = "119444444444444444";
    assertEquals("2951444444444444444444444444444", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case68() {
    String number = "345";
    String digits = "4";
    assertEquals("35", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case69() {
    String number = "4975615589463567455681945874574854549747523141";
    String digits = "87691534587345194";
    assertEquals("99656755684587457454547452141", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case70() {
    String number = "21232";
    String digits = "2";
    assertEquals("2132", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case71() {
    String number = "11223344556677889911223344556677889911223344556677";
    String digits = "1122334455667788991122334455667788991122334455667";
    assertEquals("7", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case72() {
    String number = "91827364554637829114678997531253456645764895765433";
    String digits = "1122334455789";
    assertEquals("9876691467899753125345664576485765433", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case73() {
    String number = "52152";
    String digits = "21";
    assertEquals("552", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case74() {
    String number = "96324823648325471325426483245732834852345825432458";
    String digits = "182343284582465845327";
    assertEquals("98687354268324532345234524324", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case75() {
    String number = "91919";
    String digits = "9";
    assertEquals("9191", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case76() {
    String number = "3923";
    String digits = "39";
    assertEquals("32", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case77() {
    String number = "24124879687945";
    String digits = "9789";
    assertEquals("2412487645", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case78() {
    String number = "211221112";
    String digits = "11";
    assertEquals("2221112", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case79() {
    String number = "12539859892349896878433468634444446223492398234322";
    String digits = "123459387833423493";
    assertEquals("98599996886864444446224238234322", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case80() {
    String number = "5645";
    String digits = "56";
    assertEquals("54", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case81() {
    String number = "26121";
    String digits = "26";
    assertEquals("211", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case82() {
    String number = "112312";
    String digits = "1123";
    assertEquals("21", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case83() {
    String number = "123456789123456789123456789123456789123456789";
    String digits = "123456789123456789123456789123456789";
    assertEquals("987612345", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case84() {
    String number = "59415";
    String digits = "59";
    assertEquals("541", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case85() {
    String number = "12345678912345678912345678912345678912345678912345";
    String digits = "1234567891234567891234567891234567891234567891234";
    assertEquals("5", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case86() {
    String number = "1236549873214568798975463214653128799786451232233";
    String digits = "795479832";
    assertEquals("1698732145698975463214653128786451232233", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case87() {
    String number = "123";
    String digits = "";
    assertEquals("123", removingdigits.maxNumber(number, digits));
  }

  @Test
  public void case88() {
    String number = "12345665432111911119112654982765982365";
    String digits = "1116125342345978";
    assertEquals("6911119112654982652365", removingdigits.maxNumber(number, digits));
  }

}
