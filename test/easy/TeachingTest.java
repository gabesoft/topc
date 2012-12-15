package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TeachingTest {
  Teaching teaching = new Teaching();

  @Test
  public void case1() {
    String[] words = { "antarctica", "antahellotica", "antacartica" };
    int K = 6;
    assertEquals(2, teaching.count(words, K));
  }

  @Test
  public void case2() {
    String[] words = { "antaxxxxxxxtica", "antarctica" };
    int K = 3;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case3() {
    String[] words = { "antabxjeoictica", "antacgappsktica", "antauayfybjtica", "antaortiulctica", "antadnjzwzmtica", "antaykddorltica", "antaiknauajtica", "antaejljsmytica", "antazqbttdjtica", "antaxjinuhvtica", "antakdmdvovtica", "antaocaimhptica", "antapcyxecztica", "antaooxdlyytica", "antadoqtckatica", "antarlzwxtftica", "antaigavwbltica", "antaclxyuhjtica", "antawzygbfetica", "antalxnuclktica", "antaguiczibtica", "antamgxgpyctica", "antasjlaqjntica", "antavizdwjdtica", "antalqeznrstica", "antajppuwdrtica", "antajrsmijztica", "antacafjtmmtica", "antazcbcllqtica", "antawyvwjoytica", "antacuyrzhltica", "antaannxdautica", "antasuhnjsqtica", "antambhtjpftica", "antadjvwjugtica", "antamgbhuaytica", "antafejrpfctica", "antafyyowhrtica", "antazcqbvjxtica", "antaftvflqjtica", "antaecmzhketica", "antasdbuqkttica", "antarrmqoyptica", "antafbmfegftica", "antaexdffiptica", "antadxhftebtica", "antattatcantica", "antagwegtigtica", "antamehquoqtica", "antanzowdfutica" };
    int K = 14;
    assertEquals(7, teaching.count(words, K));
  }

  @Test
  public void case4() {
    String[] words = { "antabtica", "antaxtica", "antadtica", "antaetica", "antaftica", "antagtica", "antahtica", "antajtica", "antaktica" };
    int K = 8;
    assertEquals(3, teaching.count(words, K));
  }

  @Test
  public void case5() {
    String[] words = { "antadkykntica", "antaykghtica", "antayytica", "antakftica", "antaobiwmuptica", "antaptghqgtica", "antajsotica", "antafnttica", "antabssvtica", "antafdhjqrptica", "antapbmtica", "antaltica", "antauhmgtica", "antaogtica", "antaeyxtica" };
    int K = 0;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case6() {
    String[] words = { "antaswttica", "antamtica", "antatica", "antalzftica", "antaxftica", "antabtica", "antalrtica", "antaldcvlwwtica", "antadabtica", "antahdptica", "antahvddvbtica", "antantica", "antakdtpqtica", "antakcxtyhtica", "antatftkcltica", "antauvtica", "antarouaytica", "antaadxrdjtica", "antaqedmtica", "antaecvldtica", "antaqnktica", "antasainvdjtica", "antanuahuktica", "antanwsfzatica", "antajtica", "antabptica", "antanftpuumtica", "antahtica", "antankivctica", "antahcfetica", "antaofitfqtica", "antaefrnhtica", "antauhzallktica", "antaxtntica", "antamowtrbotica", "antapwoytica", "antamyrtica", "antazystica" };
    int K = 1;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case7() {
    String[] words = { "antanmvfntica", "antagiattica", "antaqbmiktica", "antakltica", "antaacmotica", "antaegwpnmtica", "antaycqvmdhtica", "antaikamtica", "antagssvtica", "antagtggotica", "antatetica", "antartica", "antajdmztica", "antaezwavitica", "antazgwjtica", "antadehmtica", "antamjpqncttica", "antatltica", "antapjuesubtica", "antanpibtica", "antacyzremytica", "antahvtica", "antanhwlotica", "antaawlcxzwtica", "antazycztica", "antamdztica" };
    int K = 2;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case8() {
    String[] words = { "antawatica", "antactica", "antaihxsitica", "antattica", "antaxdtica", "antalhaoftica", "antabsyltica", "antagtnzstica", "antalvqtica", "antapdrafhqtica", "antaraptica", "antanctica", "antauhhpcgtica", "antagdtica", "antagvttica", "antapnotkftica", "antaxjwtica", "antazecaxnutica", "antaiuwwmstica", "antaglbovtica", "antafkspmftica", "antanmgftvdtica", "antaqozzpbtica", "antaqatica", "antayrfettica", "antaosreistica", "antaebitica", "antasymstica", "antawmntica", "antaxxtica", "antaittica" };
    int K = 3;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case9() {
    String[] words = { "antaclbsctbtica", "antayoitica", "antakxlftica", "antakbsqystica", "antaagomggtica", "antagslqzxtica", "antazutica", "antaisktica", "antaosilzitica", "antahsitica", "antaedqleuctica" };
    int K = 4;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case10() {
    String[] words = { "antagtica" };
    int K = 5;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case11() {
    String[] words = { "antamgjbtica", "antaszxbstica", "antagwkttica", "antajjtica", "antawmbgjtica", "antaxigtica", "antavnyotica", "antaaywgvjftica", "antawsztica", "antacvhvtica" };
    int K = 6;
    assertEquals(1, teaching.count(words, K));
  }

  @Test
  public void case12() {
    String[] words = { "antazasobwitica" };
    int K = 7;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case13() {
    String[] words = { "antamblntica", "antadtahdtica", "antarkatica", "antaiboumtica", "antahqrxvytica", "antapzjripatica", "antaxzeywhbtica", "antazstnizetica", "antarmljtica", "antaxmiwisdtica", "antavgibqtica", "antarpegehdtica", "antawmjtica", "antaqapmqkbtica", "antawhdbwsktica", "antaabhasptica", "antaftica", "antagljhunstica", "antastica", "antarigdtica", "antaxtica", "antaleqkhjctica", "antatudmyitica", "antarsrzdjtica", "antaqtica", "antafjnctica", "antabbygqytica", "antaagfxqtica", "antacrsoulhtica", "antaueeztica", "antakpsqjetica", "antasivltica", "antaikdzrmtica", "antaknptica", "antasoatica", "antayqpcytica", "antavhmeftica", "antayurkfitica", "antaggjctica", "antaqrtica", "antaajmoitatica", "antafbztica", "antafytica", "antawtica", "antagrdmqtica", "antaqpcrnfytica" };
    int K = 8;
    assertEquals(3, teaching.count(words, K));
  }

  @Test
  public void case14() {
    String[] words = { "antagitica", "antahilppbjtica", "antawrtwtica", "antanvtqtica", "antanakaytica", "antafqtica", "antacmvudtica", "antakbtica", "antaemtica", "antavnkenbetica", "antapxllbdltica", "antagnxstica", "antanxkgsctica", "antaxvqytica", "antaftikyctica", "antabfwtrmtica", "antaahhtica", "antauyfkgtica", "antasenkpxytica", "antayoqkdktica", "antacltica", "antalpurzbgtica", "antaodqzuzdtica", "antauxonbtica", "antamacdestica", "antajfortica", "antaycvbffrtica", "antasydetica", "antaeppyectica", "antacrsxkxtica", "antacwzadtica", "antajzbpvuxtica", "antaswjesetica", "antavgvvltica", "antaqmzsoimtica", "antajbugvtica", "antastatica", "antakyrmbdxtica", "antaoyatica", "antaejoctica", "antagdycprotica", "antadzqtica", "antaopnatica", "antaareztica", "antabvtica", "antabrjglgtica", "antaotica", "antanyptica", "antapetica" };
    int K = 9;
    assertEquals(6, teaching.count(words, K));
  }

  @Test
  public void case15() {
    String[] words = { "antalatica", "antagdmfxthtica", "antadirkwaftica", "antavctica", "antarectica", "antaatfqatica", "antakmxyhtica", "antahmutica", "antakfetvtica", "antaoatica", "antarmpmtica", "antamwmtica", "antafvwhtica", "antamdvmetica", "antalzllitica", "antaxrepwmtica", "antatdplutica", "antayabmbivtica" };
    int K = 10;
    assertEquals(4, teaching.count(words, K));
  }

  @Test
  public void case16() {
    String[] words = { "antarbhntica", "antaevcxdsitica", "antaaeekkwtica", "antarvoldxtica", "antadifletica", "antauxbtica", "antaitica", "antaptica", "antayeetjuutica", "antasxremtica", "antazkotica", "antaametica", "antambyweftica", "antawhtica", "antavgbjajtica", "antamymxktica", "antaoouagytica", "antajbgtzmtica", "antaplpotica", "antaxmostica", "antagwmlgfqtica" };
    int K = 11;
    assertEquals(5, teaching.count(words, K));
  }

  @Test
  public void case17() {
    String[] words = { "antalbfqtica", "antazvivueytica", "antahcqyxytica", "antaklvtica", "antaljpfiitica", "antawlblwhjtica", "antabwpwitica", "antalastftica", "antaratfftica", "antawerotica", "antalxbitica", "antaptksdtica", "antaootica" };
    int K = 12;
    assertEquals(4, teaching.count(words, K));
  }

  @Test
  public void case18() {
    String[] words = { "antawjlwhtica", "antanlxwkztica", "antaxttcsrxtica", "antagyyscphtica", "antabwpfsnttica", "antadyvwouktica", "antazpntica", "antarxzotica" };
    int K = 13;
    assertEquals(3, teaching.count(words, K));
  }

  @Test
  public void case19() {
    String[] words = { "antanpfuxsttica", "antanxwtica", "antapdnzfgutica", "antadgtica", "antautica", "antaepwwzttica", "antaytica", "antabsoctica", "antanyfuktica", "antaemoootica", "antadtgtica", "antamqvotica", "antalnyzgtica", "antaiyvtsttica", "antajjzstica", "antaoquteutica", "antaavtjetica", "antalmctica", "antatgobruftica", "antaubquopftica", "antacktluetica", "antawylfsrtica", "antaekswxjtica", "antanbkvltica", "antalzcgltica", "antalvcbtica", "antantkhotica", "antauzzvqtica" };
    int K = 14;
    assertEquals(8, teaching.count(words, K));
  }

  @Test
  public void case20() {
    String[] words = { "antatttica", "antavakotica", "antaaidvxeltica", "antaeycugtica", "antabkvrtica", "antaziiqyvtica", "antajpsevctica", "antawgibtica", "antahcpoetica", "antaxwkwztica", "antayillzttica", "antasrxqxgtica", "antazdygqatica", "antatqhfatica", "antaaainitica", "antasfgiktica", "antarmmhatica", "antazdutica", "antahkajqtica", "antaajakspvtica", "antawtyehtica", "antawwhotica", "antalykjetica", "antaoewyxhtica", "antaumzvlzbtica", "antazeqztica", "antazkesjnbtica", "antakatica", "antapbmtekmtica", "antamytica", "antagcntica", "antajvilrltica", "antaxeyadstica", "antaultica", "antallgcwktica", "antasitica", "antakedztica", "antacdwytica", "antamsshztica" };
    int K = 15;
    assertEquals(13, teaching.count(words, K));
  }

  @Test
  public void case21() {
    String[] words = { "antaiydrdvwtica", "antatgxwjtica", "antacqvbtica", "antaiowtswtica", "antabhzcybtica", "antawtstica", "antahctica", "antazfwtica", "antaktjdtica", "antaqutica", "antarrrtica", "antaweiwtica", "antafuevtica", "antayldtica", "antalyqvhntica", "antautjafgytica", "antakrptica", "antaklqxmtica", "antaaeibptica", "antalwherxgtica", "antaotktica", "antayizoeftica", "antafzgctica", "antagarpznetica", "antaunfiamotica", "antatrejtica", "antaayolowqtica", "antaiwitica", "antalqovtica", "antarsxtica", "antaxlwetica" };
    int K = 16;
    assertEquals(12, teaching.count(words, K));
  }

  @Test
  public void case22() {
    String[] words = { "antadvyzqtica", "antaxqmtica", "antatjlyfwqtica", "antadfyjvrtica", "antayouqeitica", "antaetica", "antaoqqzqtica", "antatxnlwgytica", "antafstvactica", "antacylirtica", "antavoutica", "antaezactica", "antaxqktica", "antajxwnctica", "antabbfjtica", "antagybkltica", "antaofoqctica", "antaifcputica", "antaskdtica" };
    int K = 17;
    assertEquals(10, teaching.count(words, K));
  }

  @Test
  public void case23() {
    String[] words = { "antaxxwrebtica", "antazxfitica", "antafxqttica", "antaozimztica", "antarcfiqetica", "antaybstica", "antagjbtica", "antaxhowtica", "antaouzzpyytica", "antaxhnbldatica", "antafligstica", "antadelvjgctica", "antavnjfftica", "antaxagtica", "antaguiwqkjtica", "antanghnpustica", "antamctica", "antacevtica", "antazjvkcitica", "antadtica", "antahokwretica", "antaqliblftica", "antazscpaoktica", "antaxfefzstica", "antayckchsxtica", "antaqvtica", "antabygqeftica", "antakindtica", "antayjvjtica", "antagkhjujtica", "antaqlzvabtica", "antakencktica", "antafsnteitica", "antacdwntica", "antafrwchjvtica", "antahznutica", "antazmzutica", "antajdljbtica", "antagntica", "antayhxbdxtica", "antavdtica", "antaoyzvcrtica", "antamyynidftica" };
    int K = 18;
    assertEquals(20, teaching.count(words, K));
  }

  @Test
  public void case24() {
    String[] words = { "antahftica", "antapajtica", "antalqztica", "antagfkrvdtica", "antaemstica", "antaoiaxuptica", "antalvwktica", "antakqzztica", "antavhoptica", "antajnkxvstica", "antatsaectica", "antaftqttica", "antaavtica", "antaroeuztica", "antazztica", "antaqfcptwhtica", "antavazltica", "antaekodayjtica", "antaicyyoatica", "antaxyatica", "antajwutica", "antagptica", "antaodpjxtica", "antazctica", "antasatica", "antavqzntica", "antayvlkytica", "antashndjwjtica", "antaibxtica", "antauettica", "antavnsirtica", "antalsiyhdztica", "antalldaotica", "antarlalutica", "antamcqtica", "antaqhgtica", "antaibytica", "antaokzwntqtica", "antalltytica", "antatwtica", "antafyztmxvtica", "antaokzktica", "antapiqtica", "antaeinefcutica", "antamotica", "antaqtjtica", "antawciyetica", "antapgybtica", "antaakfstica" };
    int K = 19;
    assertEquals(27, teaching.count(words, K));
  }

  @Test
  public void case25() {
    String[] words = { "antayhiotica", "antamksgvtica", "antafqmnqtica", "antaxztica", "antaafeqtica" };
    int K = 20;
    assertEquals(5, teaching.count(words, K));
  }

  @Test
  public void case26() {
    String[] words = { "antaucbqjuptica", "antayhtica", "antaxhtica", "antauxcmgvtica", "antaqnrotica", "antagtujntica", "antaynetica", "antalqpnjwttica", "antaoqtica", "antajivutica", "antakuktica", "antalrhygytica", "antagwwirtica", "antayceitica", "antacwlduztica", "antakpjtica", "antahhtytica", "antasecgovstica", "antamttica", "antapmhhrtica", "antaovvtica", "antartgftica", "antahcuktica", "antajbqeetica", "antaaotica", "antazazdgtica", "antaaopzfgftica", "antakajrgtica", "antahfiqtica", "antaqjywscftica", "antaktxzvbwtica", "antatsgwtica", "antardhtica", "antagfrecnjtica", "antachjhbtica", "antafshtica" };
    int K = 21;
    assertEquals(25, teaching.count(words, K));
  }

  @Test
  public void case27() {
    String[] words = { "antazabtica", "antapzvtica", "antauaitritica", "antanvcfqtica", "antamijtica", "antaeertica", "antavyntica" };
    int K = 22;
    assertEquals(7, teaching.count(words, K));
  }

  @Test
  public void case28() {
    String[] words = { "antaompstica", "antawxtica", "antaoptratica", "antacqatica", "antakzsydpgtica", "antasvyfrtica", "antatfstitica", "antaiprzvtica", "antahcspbtica", "antalgdauvqtica", "antaizzsddltica", "antaiwtica", "antatintica" };
    int K = 23;
    assertEquals(12, teaching.count(words, K));
  }

  @Test
  public void case29() {
    String[] words = { "antayptica", "antazsmtica", "antapxgroyhtica", "antadhvsjnmtica", "antanphmtica", "antaezqdckbtica", "antamttplctica", "antazrktica", "antaiuvlvftica", "antahjebetica", "antaslatica", "antayrtica", "antacayjjtica", "antausutica", "antaprzaatica", "antagutica", "antacravyhtica", "antasrmqftica", "antarnrtica", "antamgamtica", "antamkjigbftica", "antaqelutica", "antajcjtica", "antapcygztica", "antahlbqtica", "antasiwtica", "antazyustica", "antaatsftmtica", "antazmtica", "antaosvlizjtica", "antackatica", "antasmitica", "antacarmyzrtica", "antanutica" };
    int K = 24;
    assertEquals(32, teaching.count(words, K));
  }

  @Test
  public void case30() {
    String[] words = { "antaprshntica", "antahnyrhntica", "antaoaortica", "antaxwibgdbtica", "antapuctica", "antaixfotica", "antadmctica", "antaauqgmgtica", "antadtwgkftica", "antardstica", "antauwfmtica", "antaakkqmtica", "antaujtica", "antajwgxdbutica", "antacsdktica", "antaatica", "antaefmikitica", "antalgxsrmtica", "antavtica", "antahxictica", "antaeqstica", "antaaesytica", "antaorzweketica", "antajoajtica", "antasvtica", "antaymojvtica", "antatdutica", "antatiftica", "antavjtica", "antadjtica", "antadjndtica", "antajoqtica", "antayvjztica", "antasltzjbstica", "antaqgxitica", "antaceezncktica", "antaoszstica", "antaqfgfaftica", "antahktica", "antayhtjtica", "antaanyttica", "antathytica", "antatovjtica", "antaiktvetica", "antayzuistqtica", "antaouwpxjtica", "antaettica", "antaslkontica", "antasqstica", "antaqentica" };
    int K = 25;
    assertEquals(47, teaching.count(words, K));
  }

  @Test
  public void case31() {
    String[] words = { "antawptica", "antaaaekcqtica", "antavrxtica", "antaortfxtica", "antadppdktica", "antahgqytica", "antarytica" };
    int K = 26;
    assertEquals(7, teaching.count(words, K));
  }

  @Test
  public void case32() {
    String[] words = { "antaciaiadtica", "antaefotica", "antafcstica", "antaejqtica", "antaejtwehmtica", "antaalrgtica", "antarvnlfhtica", "antaftlvtica", "antaojdztica", "antapqhrtica", "antadjzvgxutica", "antaolpwltmtica", "antanypafcbtica", "antayotica", "antagulqqrftica", "antafqyecyitica", "antarxilktica", "antabiykqjtica", "antasyojsrtica", "antaycqtica", "antawkxtica", "antaamtrxltica", "antalvdqgptica", "antaltxmirttica", "antaekeflcqtica", "antanmjawztica" };
    int K = 0;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case33() {
    String[] words = { "antafetkmwvtica", "antawgztica", "antaemwtica", "antadujtica", "antarzameptica", "antajzrxvntica", "antabqjjtica", "antabckeneltica", "antahrtxtica", "antajbttica", "antaaxjstica", "antajbtihtica", "antatnuyrfntica", "antaeoexsktica", "antaygxdiyktica", "antaektica", "antamsqhktutica", "antaeyhjtica", "antavwzftica", "antascpqtica", "antasoqftica", "antaqjhswjtica", "antaehphrsotica", "antaerdatottica", "antavqclqptica", "antacmyiqstica", "antajvjrhrptica", "antaxnlwhostica", "antafsftica", "antalsbocjtica", "antazmbnnwtica", "antacbtica", "antajjxztica", "antaphwdmtica", "antabnhxwwtica", "antaubtica" };
    int K = 2;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case34() {
    String[] words = { "antabrtica", "antasrwpcptica", "antazfwvzftica", "antadptica", "antazzyekxtica", "antaivtica", "antakawdvhtica", "antadwosnxetica", "antauantica", "antazetica", "antayyxramctica", "antancvstica", "antahptica", "antaijdtica", "antabwtica" };
    int K = 3;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case35() {
    String[] words = { "antapbzeltica", "antafccnnhmtica", "antamrcrttica", "antaequlicutica", "antafmtica", "antaghjmecqtica", "antauzluvbtica", "antamywdnatica", "antadutica", "antaujpqptica", "antaikxtica", "antaxneukttica", "antaniutica", "antantoqtica", "antasowtica", "antaxhotica", "antahkrtica", "antakqrtica", "antanabitica", "antaueqquuqtica", "antaahttica", "antabqfnltica", "antaveheatica" };
    int K = 4;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case36() {
    String[] words = { "antasuyynntica", "antalsdumxgtica", "antafxkzotica", "antatsgtwwhtica", "antanszsstica", "antaipfjtica" };
    int K = 5;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case37() {
    String[] words = { "antakntica", "antadktica", "antajttica", "antanntica", "antagctica", "antagrtica", "antaubzjlsdtica", "antarljmkbtica", "antahpkltica", "antasgrtica", "antamxlqotica", "antalypshltica", "antaunojztica", "antafntica", "antaccdntica", "antaetcbwctica", "antaylptica", "antaiehtica", "antanqxtica", "antaukbtica", "antathhtica", "antagrfoctica", "antahtrtica", "antaobrnxttica", "antaalgpvktica", "antarvlaztica", "antahsgtica", "antacetica", "antamrheetica", "antavvtica" };
    int K = 6;
    assertEquals(2, teaching.count(words, K));
  }

  @Test
  public void case38() {
    String[] words = { "antampttica", "antauxtica", "antaioyhtica", "antafxgrtica", "antaraibktica", "antaeiqeqtica", "antayqkgltica", "antagkmtica", "antavqoztica", "antawotica", "antaklaztica", "antakrdktica", "antadnptica", "antatlbqtica", "antaxcbutica", "antafagtdiltica", "antaukvzfyvtica", "antapeuntica", "antabodhtica", "antaknktica", "antaibupytica", "antaoaxtica", "antapmkottica", "antakyvjntica", "antaoqndokotica", "antareirtica", "antadmkhtica", "antaedahpotica", "antaqdtica", "antathhccotica" };
    int K = 7;
    assertEquals(1, teaching.count(words, K));
  }

  @Test
  public void case39() {
    String[] words = { "antaqcjtica", "antayzmutica", "antakmbahnstica", "antatnwbzcvtica", "antalntica", "antauiwkozetica", "antanxtica", "antaevitica", "antasgpizvltica", "antawbtica", "antaacyntica", "antavztica", "antadqeroletica", "antaxfnupvtica", "antaucbtica", "antayzctica", "antawktica", "antahdtica", "antajwctica", "antablllwtica", "antajomitica", "antatblirtica", "antavhpiistica", "antanseifbtica", "antanwdtica", "antayqjhestica", "antaqbbptica", "antaptfgcyytica", "antaxcdwklytica", "antafvctica", "antafzcxnotica", "antahvittica", "antasgrpitica", "antaggmbtica", "antawbdojctica", "antaaktica", "antaekqistica", "antacnnsabutica", "antabglmquztica", "antamqxtica", "antanbtica", "antaewcyjetica", "antaastica", "antamliwbtica" };
    int K = 8;
    assertEquals(4, teaching.count(words, K));
  }

  @Test
  public void case40() {
    String[] words = { "antalsztica", "antayjztica", "antaktxtica", "antaxvtica", "antasxdtwytica", "antawyhtica", "antalvahqktica", "antappjxfztica", "antailetica", "antazavvwbgtica", "antabrdidltica", "antajaefotica", "antacsktica", "antachltica", "antafbumotica", "antabbqantica", "antavqhtica", "antafoltica", "antabzlstica", "antagdfzcmrtica", "antaqzhtica", "antamalutootica", "antavklqtica", "antafwsctica", "antauftica", "antaijtica", "antaummetstica", "antaerghtica", "antazstica", "antalprtica", "antacssortica", "antaayzoltica", "antacwzrrrtica", "antahsmtqctica", "antacbwkrtptica", "antaqetica", "antadmutica" };
    int K = 9;
    assertEquals(3, teaching.count(words, K));
  }

  @Test
  public void case41() {
    String[] words = { "antalgstbtica", "antakotica", "antahjzjtica", "antaoxyoyntica", "antahhsutica", "antaoimzqtica", "antaigtica", "antajstica", "antanasbtica", "antatkrwttica", "antattzebetica", "antaypdgntica", "antajbtica", "antayjgvtica", "antamanhhpmtica", "antabadtica", "antafsmmoixtica", "antaioovtica", "antawffxttica", "antapxoqqpwtica", "antafstica", "antabawcwqitica", "antaexkitica", "antadnghqbqtica", "antapmyavwltica", "antatsnngchtica", "antadnlglftica", "antaxpwatica", "antazubostica" };
    int K = 10;
    assertEquals(5, teaching.count(words, K));
  }

  @Test
  public void case42() {
    String[] words = { "antaucfabdztica", "antafburilwtica", "antajlfjotica", "antavntica", "antayojzeatica", "antauntica", "antaadtica", "antazxahayytica", "antapfrtica", "antasctmmotica", "antamcertica", "antabikxtica", "antanlptica", "antafmztica", "antaecqwbqatica", "antaffqetica", "antacryhntica", "antauyraistica", "antapqwvantica", "antalwxcxgxtica", "antaxwxdklftica", "antatbgwsartica", "antawycfgxtica", "antajdlacdltica" };
    int K = 11;
    assertEquals(5, teaching.count(words, K));
  }

  @Test
  public void case43() {
    String[] words = { "antazqhautica", "antakbmmytica", "antagwgheutica", "antauttica", "antalxtica" };
    int K = 12;
    assertEquals(3, teaching.count(words, K));
  }

  @Test
  public void case44() {
    String[] words = { "antasvxjwtica", "antaxftzhtica", "antawhmohbftica", "antaqitica", "antainsiitica", "antawhhvzlxtica", "antaxuwxtmntica", "antagnbfwtica", "antavksyhbtica", "antahjzequtica", "antazqvxztica", "antawunuttica", "antalzuybtica", "antaggmetica", "antaltahqtica", "antakzbdkwtica", "antacktnsrmtica", "antavtkwftica", "antakmhnurttica", "antadvisztica", "antapchdeqgtica", "antauutica" };
    int K = 13;
    assertEquals(6, teaching.count(words, K));
  }

  @Test
  public void case45() {
    String[] words = { "antatlznantica", "antaxnnvcmtica", "antansrvtica", "antalrzbgtica", "antaxltica", "antahjxhvtica", "antahcgiuptica", "antafctica", "antaqznhbwtica", "antahuttica", "antawwawyatica", "antatwktica", "antaddqtica", "antabfitica", "antacupfssatica", "antaygwittica", "antafmanhntica", "antatnwbvvtica", "antafdrznmtica", "antaagtica", "antababcqmgtica", "antagotica", "antaqaepwtdtica", "antamxjtduktica", "antalzphtica", "antaydxxoptica", "antamwmhdhtica", "antaymtica", "antaqxtica", "antaoohftica", "antafzipezbtica", "antaxcttica", "antahcbvlztica" };
    int K = 14;
    assertEquals(11, teaching.count(words, K));
  }

  @Test
  public void case46() {
    String[] words = { "antaklsdtica", "antajroqkrtica", "antabfessjntica", "antayejkixtica", "antahfutica", "antabtvlazmtica", "antavxrztica", "antarrtftica", "antaqkhtica" };
    int K = 15;
    assertEquals(4, teaching.count(words, K));
  }

  @Test
  public void case47() {
    String[] words = { "antadpfytica", "antamybzvgtica", "antaupectica", "antaelchjtica", "antaxrjcjtica", "antafitgtica", "antaddcstica", "antazwuytica", "antavknbucktica", "antavyptica", "antakctica", "antanrggbtica", "antainmqtica", "antanullieptica", "antaqttica", "antaqcmtica", "antaagkhxjetica", "antatntxkttica", "antarzlemfetica", "antahspoqtica", "antanbbljqytica", "antarlxftica", "antaduolccytica" };
    int K = 16;
    assertEquals(10, teaching.count(words, K));
  }

  @Test
  public void case48() {
    String[] words = { "antaheynxtica", "antazednihqtica", "antatixayfitica", "antalbtica", "antaiiiqtica", "antaiasxxmntica", "antagopuvtica", "antabxsqtica", "antayitica", "antaekkqmvtica", "antaxytica", "antavetica", "antafsfhtica", "antaamrhuyftica", "antaoegtica", "antakwgqxndtica", "antaeegtica" };
    int K = 17;
    assertEquals(11, teaching.count(words, K));
  }

  @Test
  public void case49() {
    String[] words = { "antaezzqurtica", "antavhskgdhtica", "antacatica", "antacxletica", "antarsqeutica", "antakttica", "antavjkxttica", "antavlwktica", "antarfhoettica", "antafwkqtica", "antafvuxaootica", "antaiarxtica", "antaljrlkatica", "antardsfcmtica", "antatxtica", "antanfrtica", "antastwnetica", "antadhivtica", "antaajtica", "antajlaotica", "antanehptica" };
    int K = 18;
    assertEquals(15, teaching.count(words, K));
  }

  @Test
  public void case50() {
    String[] words = { "antakbsroktica", "antavmylbmtica" };
    int K = 19;
    assertEquals(2, teaching.count(words, K));
  }

  @Test
  public void case51() {
    String[] words = { "antauavktica", "antaggltica", "antageihtica", "antawitica", "antaclmetica", "antatlqnytica", "antawucftica", "antamlgttica", "antatgvqtica", "antaviptica", "antacikldojtica", "antaqxzyabtica", "antagxtica", "antaqtztica", "antaipetica", "antanatica", "antanainlgjtica", "antafltica", "antalytica" };
    int K = 20;
    assertEquals(16, teaching.count(words, K));
  }

  @Test
  public void case52() {
    String[] words = { "antafhvlvytica", "antayciitica", "antacjmgtica", "antaewcoxzntica", "antaxvycfnttica", "antaglyxethtica", "antaljctica", "antatctica", "antaeriswdtica", "antaxftiojtica", "antaxynoeztica", "antajystica", "antaxmkyjmtica", "antalxbktica", "antasptntjdtica", "antallftqtica", "antafqchotxtica", "antanhbqtica", "antayfgvtica", "antahrrtica", "antaqrvetica", "antaezimutica", "antarcllmnltica", "antaftftica", "antasehhtica", "antaavtatica", "antapjtica", "antabyhhtica", "antaxqdktica", "antaksotrvntica", "antaljxztgutica", "antasrtica" };
    int K = 21;
    assertEquals(24, teaching.count(words, K));
  }

  @Test
  public void case53() {
    String[] words = { "antameqtica", "antazyvktica", "antaefsgfgtica", "antawuxhvtica", "antastitica", "antarpcqbetica", "antawdmtglttica", "antanzvtica", "antazxxrtica", "antacbnpvbttica", "antauxktica", "antawxcytica", "antalqqakmetica", "antamamtica", "antapzbrkentica", "antavrweugxtica", "antauedbtica", "antawgblagtica", "antasitfbetica", "antaewfnetica", "antalbzslbqtica", "antasktica", "antaxhtlyhtica", "antaomjhdtica", "antatdwmehwtica" };
    int K = 22;
    assertEquals(19, teaching.count(words, K));
  }

  @Test
  public void case54() {
    String[] words = { "antalrdsdqdtica", "antamnqwhuptica", "antaacvvztica", "antauncqatica", "antaqyoezwitica", "antagxvfwftica", "antailxtica", "antalpctica", "antasgwiwmtica", "antatkammmvtica", "antaidcldzqtica", "antaslftica", "antayzontica", "antavbfittica", "antaxnqbzwutica", "antaagjqdytica", "antakdnktica", "antaanxakntica", "antawjfhtica", "antayptqmutica", "antahwbatica", "antadjeltica", "antafetica", "antalfddkgztica", "antanunthtica", "antaoyitrtica", "antanmvqhtztica", "antagcotica", "antaphcttica", "antavzkrlpntica" };
    int K = 23;
    assertEquals(22, teaching.count(words, K));
  }

  @Test
  public void case55() {
    String[] words = { "antahgvhadqtica", "antanwlqrtica", "antatctsccatica", "antasyuyhztica", "antaixaqptica", "antabnipqectica", "antabvoxwetica", "antaixkztica", "antaoetica", "antabjbctica", "antagrqacvtica", "antasltica", "antaxjsxtica", "antatfjzhyttica", "antaivztica", "antayksstica", "antazfuntica", "antavvoxtica", "antajdauetica", "antaxkusoetica", "antazybtica", "antafmfedtica", "antabchayhztica", "antaywypotica", "antagbsctica", "antanmxmfrctica", "antajkltcbtica", "antatuctica" };
    int K = 24;
    assertEquals(24, teaching.count(words, K));
  }

  @Test
  public void case56() {
    String[] words = { "antavwqscotica", "antawyxgastica", "antaaziljitica", "antaddlbuitica", "antapnodxjtica", "antarrtica", "antajvotica" };
    int K = 25;
    assertEquals(7, teaching.count(words, K));
  }

  @Test
  public void case57() {
    String[] words = { "antahztica", "antagdvkxtica", "antaopbthtica", "antadevffmtica", "antagxsttica", "antapereqktica", "antaljglaqtica", "antaxntica", "antainmtica", "antawklektgtica", "antatodstica", "antajoojnyetica", "antaplwndrmtica", "antawmgtica", "antaoqmhtica", "antasoktica", "antazdvitpptica", "antaibyeoztica", "antabzvtica", "antaipfniltica", "antaxgrewytica", "antanihjjtica", "antayvvsktica", "antakutica", "antadrwgytica" };
    int K = 26;
    assertEquals(25, teaching.count(words, K));
  }

  @Test
  public void case58() {
    String[] words = { "antazszbtica" };
    int K = 11;
    assertEquals(1, teaching.count(words, K));
  }

  @Test
  public void case59() {
    String[] words = { "antaatica", "antabtica", "antactica", "antadtica", "antaetica", "antaftica", "antagtica", "antahtica", "antaitica", "antajtica", "antaktica", "antaltica", "antamtica", "antantica", "antaotica", "antaptica", "antaqtica", "antartica", "antastica", "antattica", "antautica", "antavtica", "antawtica", "antaxtica", "antaytica", "antaztica", "antaaaaatica", "antabbbbtica", "antacccctica", "antaddddtica", "antaeeeetica", "antafffftica", "antaggggtica", "antahhhhtica", "antaiiiitica", "antajjjjtica", "antakkkktica", "antalllltica", "antammmmtica", "antannnntica", "antaooootica", "antapppptica", "antaqqqqtica", "antarrrrtica", "antasssstica", "antatttttica", "antauuuutica", "antavvvvtica", "antawwwwtica", "antaxxxxtica" };
    int K = 14;
    assertEquals(28, teaching.count(words, K));
  }

  @Test
  public void case60() {
    String[] words = { "antarstica", "antatica", "antarsetica" };
    int K = 9;
    assertEquals(3, teaching.count(words, K));
  }

  @Test
  public void case61() {
    String[] words = { "antaaoeuolitica", "antawusevrmtica", "antahacjdeytica", "antalcaajnotica", "antappeqlibtica", "antaptumhvstica", "antaxxndlfvtica", "antaftvyypjtica", "antaghvajcqtica", "antabawggortica", "antausmfslltica", "antaxscojsptica", "antaojdfkumtica", "antaysieqmbtica", "antarmdxdwrtica", "antahkbyrdvtica", "antauoeeuldtica", "antamskgorstica", "antasldjuamtica", "antaqkcxxnitica", "antaljvhlgytica", "antahsoetujtica", "antamwayobntica", "antaevpqevdtica", "antacshxhidtica", "antasurpsgdtica", "antaabuvfcntica", "antaaclsrnbtica", "antakfrhkfotica", "antanpemyrxtica", "antaeieylyctica", "antapckxbwhtica", "antaftkfppltica", "antalopvupstica", "antaojesnwgtica", "antaeproimctica", "antaspprudotica", "antavwpsbqytica", "antahohecvvtica", "antasdibbqutica", "antanlkhlmdtica", "antaishuxvstica", "antahxdbtnptica", "antaxbvqicmtica", "antafhwnqcmtica", "antajmtmjrntica", "antapjarcpvtica", "antamsmjtnitica", "antaxpejdsxtica", "antapaibpdvtica" };
    int K = 15;
    assertEquals(8, teaching.count(words, K));
  }

  @Test
  public void case62() {
    String[] words = { "antamnqrsuvtica", "antamnqrsuwtica", "antamnqrsuxtica", "antamnqrsvutica", "antamnqrsvwtica", "antamnqrsvxtica", "antamnqrswutica", "antamnqrswvtica", "antamnqrswxtica", "antamnqrsxutica", "antamnqrsxvtica", "antamnqrsxwtica", "antamnqrusvtica", "antamnqruswtica", "antamnqrusxtica", "antamnqruvstica", "antamnqruvwtica", "antamnqruvxtica", "antamnqruwstica", "antamnqruwvtica", "antamnqruwxtica", "antamnqruxstica", "antamnqruxvtica", "antamnqruxwtica", "antamnqrvsutica", "antamnqrvswtica", "antamnqrvsxtica", "antamnqrvustica", "antamnqrvuwtica", "antamnqrvuxtica", "antamnqrvwstica", "antamnqrvwutica", "antamnqrvwxtica", "antamnqrvxstica", "antamnqrvxutica", "antamnqrvxwtica", "antamnqrwsutica", "antamnqrwsvtica", "antamnqrwsxtica", "antamnqrwustica", "antamnqrwuvtica", "antamnqrwuxtica", "antamnqrwvstica", "antamnqrwvutica", "antamnqrwvxtica", "antamnqrwxstica", "antamnqrwxutica", "antamnqrwxvtica", "antamnqrxsutica", "antamnqrxsvtica" };
    int K = 26;
    assertEquals(50, teaching.count(words, K));
  }

  @Test
  public void case63() {
    String[] words = { "antaytica", "antaqtica", "antartica", "antautica", "antaotica", "antaptica" };
    int K = 4;
    assertEquals(0, teaching.count(words, K));
  }

  @Test
  public void case64() {
    String[] words = { "antaqqqjevtica", "antamqotica", "antaiegtica", "antatica", "antaptica", "antaotica", "antawseitica", "antacvehtica", "antahqtica", "antahrtica", "antatqsgitica", "antaeusdtica", "antabjwctica", "antaxjqtica", "antadpevxftica", "antajmsltica", "antaykkthtica", "antahptica", "antaowtica", "antadhoiktica", "antaudprtica", "antaaotica", "antafrkdkktica", "antaosttuftica", "antasbutica", "antaaegwytica", "antaumjwytica", "antatbpdwtica", "antawejftica", "antanltica", "antajjentotica", "antartica", "antagaeqtica", "antanezthtica", "antavtica", "antatestica", "antafvtica", "antasmtica", "antaggntica", "antaorqtica", "antabtica", "antaftica", "antaiyytica", "antadwutica", "antaqptica", "antahrdbltica", "antahtcmatica", "antaqcdtica", "antaxqpytica", "antamzafptica" };
    int K = 9;
    assertEquals(7, teaching.count(words, K));
  }

  @Test
  public void case65() {
    String[] words = { "antatica" };
    int K = 5;
    assertEquals(1, teaching.count(words, K));
  }

  @Test
  public void case66() {
    String[] words = { "antadefghjktica", "antaefghjkltica", "antafghjklmtica", "antaghjklmntica", "antahjklmnotica", "antajklmnoptica", "antaklmnopqtica", "antalmnopqrtica", "antalnopqrstica", "antanopqrsutica", "antaopqrsuvtica", "antapqrsuvwtica", "antaqrsuvwxtica", "antarsuvwxytica", "antasuvwxyztica", "antaabaaaatica", "antabcxxyddtica", "antaabcaaatica", "antaabxxyyytica", "antadddddhtica", "antattttytica", "antaxxxxxxxtica", "antaaaaaaaatica", "antabbbbbbbtica", "antaccccccctica", "antadddddddtica", "antaeeeeeeetica", "antaffffffftica", "antagggggggtica", "antahhhhhhhtica", "antajjjjjjjtica", "antakkkkkkktica", "antallllllltica", "antammmmmmmtica", "antannnnnnntica", "antaoooooootica" };
    int K = 15;
    assertEquals(20, teaching.count(words, K));
  }

  @Test
  public void case67() {
    String[] words = { "antafswfasftica", "antaihdueuutica", "antadfsdfdstica", "antaasdadsatica", "antasdadasdtica", "antaasdaewetica", "antaasasdgrtica", "antaghkuoiutica", "antafghfhfhtica", "antasacasdctica", "antauuyioyutica", "antambfghdftica" };
    int K = 9;
    assertEquals(5, teaching.count(words, K));
  }

  @Test
  public void case68() {
    String[] words = { "antarrrrrrrtica", "antasssssstica", "antaxytica", "antayxtica", "antaxxytica", "antayyxtica" };
    int K = 7;
    assertEquals(4, teaching.count(words, K));
  }

  @Test
  public void case69() {
    String[] words = { "antabedtica", "antadbetica", "antadebtica", "antaebdtica", "antaedbtica", "antajkmltica", "antajlkmtica", "antajlmktica", "antajmkltica", "antajmlktica", "antakjlmtica", "antakjmltica", "antakljmtica", "antaklmjtica", "antakmjltica", "antakmljtica", "antaljkmtica", "antaljmktica" };
    int K = 9;
    assertEquals(13, teaching.count(words, K));
  }

  @Test
  public void case70() {
    String[] words = { "antamptica", "antamqtica", "antamstica", "antabtica" };
    int K = 6;
    assertEquals(1, teaching.count(words, K));
  }

  @Test
  public void case71() {
    String[] words = { "antaaaaatica", "antaacvbgttica", "antaazxcvbbtica", "antabbbbtica", "antadcklptica", "antadghnijftica", "antaedferggtica", "antaedfrtggtica", "antaerfyhgtica", "antaergbkiltica", "antaergftica", "antaertghxctica", "antaertyyyytica", "antagfddfgtica", "antahaheheutica", "antahnzwrtica", "antaihnjurtica", "antaijnhbfvtica", "antaikjnmbvtica", "antajmklccctica", "antajnmkhgctica", "antanhmjtica", "antanmntica", "antaokrtytica", "antaolkmzxxtica", "antaoooooootica", "antaprthywntica", "antaqaswdertica", "antaqwasxxjtica", "antaqwertyutica", "antarfghythtica", "antatgbnhtica", "antanhjtica", "antatyhytica", "antarfttica", "antaumutica", "antauiovcxtica", "antaujiklohtica", "antaujikuwstica", "antaujuiklqtica", "antaujuikltica", "antaxcvbntica", "antaxcvfbbbtica", "antaxmlkottica", "antayhndmdctica", "antayhujnsctica" };
    int K = 17;
    assertEquals(22, teaching.count(words, K));
  }

  @Test
  public void case72() {
    String[] words = { "antabxdtica", "antaextica", "antaedtica", "antaetica", "antafgtica", "antaegtica", "antahtica", "antajhtica", "antajktica" };
    int K = 10;
    assertEquals(5, teaching.count(words, K));
  }

  @Test
  public void case73() {
    String[] words = { "antaaaaaaaatica" };
    int K = 5;
    assertEquals(1, teaching.count(words, K));
  }

  @Test
  public void case74() {
    String[] words = { "antabmnoptica", "antammnxxxtica", "antadmmonntica", "antafjkdnsmtica", "antadaknmftica", "antazqtica", "antamndewsftica", "antamnkdlsatica", "antamopedentica" };
    int K = 13;
    assertEquals(4, teaching.count(words, K));
  }

  @Test
  public void case75() {
    String[] words = { "antabmnoptica", "antammnxxxtica", "antadmmonntica", "antafjkdnsmtica", "antadaknmftica", "antazqtica", "antamndewsftica", "antamnkdlsatica", "antamopedentica" };
    int K = 25;
    assertEquals(9, teaching.count(words, K));
  }

  @Test
  public void case76() {
    String[] words = { "antaaxxxxxxtica", "antabxxxxxxtica", "antacxxxxxxtica", "antadxxxxxxtica", "antaexxxxxxtica", "antafxxxxxxtica", "antagxxxxxxtica", "antahxxxxxxtica", "antaixxxxxxtica", "antajxxxxxxtica", "antakxxxxxxtica", "antalxxxxxxtica", "antamxxxxxxtica", "antanxxxxxxtica", "antaoxxxxxxtica", "antapxxxxxxtica", "antaqxxxxxxtica", "antarxxxxxxtica", "antasxxxxxxtica", "antatxxxxxxtica", "antauxxxxxxtica", "antavxxxxxxtica", "antawxxxxxxtica", "antaxxxxxxxtica", "antayxxxxxxtica", "antazxxxxxxtica", "antaztica", "antazztica", "antazzztica", "antazzzztica", "antazzzzztica", "antazzzzzztica", "antazzzzzzztica" };
    int K = 6;
    assertEquals(7, teaching.count(words, K));
  }

  @Test
  public void case77() {
    String[] words = { "antaovcacatica", "antakbenitica", "antajiogjptica", "antahripnntica", "antaipbeotica", "antaewmgtica", "antavgwbtica", "antanginorbtica", "antabnbnrotica", "antalvwfotica", "antanveouoetica", "antavpwwtica", "antavwprtica", "antagpibjtica", "antaaengtica", "antanjietica", "antainentica", "antaiptica", "antattnetica" };
    int K = 13;
    assertEquals(11, teaching.count(words, K));
  }

}
