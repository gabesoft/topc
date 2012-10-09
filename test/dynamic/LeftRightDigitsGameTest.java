package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class LeftRightDigitsGameTest {
  LeftRightDigitsGame leftrightdigitsgame = new LeftRightDigitsGame();

  @Test
  public void case1() {
    String digits = "565";
    assertEquals("556", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case2() {
    String digits = "9876543210";
    assertEquals("1234567890", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case3() {
    String digits = "8016352";
    assertEquals("1086352", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case4() {
    String digits = "1";
    assertEquals("1", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case5() {
    String digits = "01";
    assertEquals("10", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case6() {
    String digits = "901";
    assertEquals("109", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case7() {
    String digits = "109";
    assertEquals("109", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case8() {
    String digits = "380";
    assertEquals("380", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case9() {
    String digits = "3928360770";
    assertEquals("2398360770", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case10() {
    String digits = "284571068549373";
    assertEquals("128457068549373", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case11() {
    String digits = "69727879252051753520";
    assertEquals("10222697787955753520", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case12() {
    String digits = "53013652946745933727468097755950461";
    assertEquals("10003513652946745933727468977559546", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case13() {
    String digits = "7482528283429368756946791671134092246285";
    assertEquals("1112222478588349368756946796734092246285", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case14() {
    String digits = "849977772669238327630051487226702890699855771";
    assertEquals("100002224899777766938376351487226728969985577", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case15() {
    String digits = "82358880314196476696612703282192340320351990759311";
    assertEquals("10000028358883141964766966127328219234323519975931", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case16() {
    String digits = "09246590521466069264983001526938055924978335933152";
    assertEquals("10000009246595214666926498315269385592497833593352", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case17() {
    String digits = "57017243424714583743738007458176899623185588138523";
    assertEquals("10005717243424714583743738745817689962318558838523", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case18() {
    String digits = "01682858369148036469534345822052230638496300323191";
    assertEquals("10000001682858369148364695343458225223638496332319", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case19() {
    String digits = "0446";
    assertEquals("4046", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case20() {
    String digits = "73890136300";
    assertEquals("10378936300", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case21() {
    String digits = "9921454865020000";
    assertEquals("1299454865020000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case22() {
    String digits = "917043802938059265000";
    assertEquals("197043802938059265000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case23() {
    String digits = "69250700000000000000000000";
    assertEquals("26950700000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case24() {
    String digits = "7983118308482670950633434269600";
    assertEquals("1137988308482670950633434269600", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case25() {
    String digits = "792086082908829300000000000000000000";
    assertEquals("200027986829889300000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case26() {
    String digits = "6839813778566800435979730544509492376873629420000";
    assertEquals("1368983778566800435979730544509492376873629420000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case27() {
    String digits = "42793539048451947810651184791197366812826683980000";
    assertEquals("10024793539484519478165118479119736682826683980000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case28() {
    String digits = "61768559846114246084877077858914291066143954400000";
    assertEquals("10001116768559846424684877778589142916643954400000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case29() {
    String digits = "66033001916429687820706397816532137759000000000000";
    assertEquals("10000066331916429687827639781653237759000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case30() {
    String digits = "84291027751908867839544430938728149252129230000000";
    assertEquals("10001248927751988678395444393872814925229230000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case31() {
    String digits = "05307";
    assertEquals("30507", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case32() {
    String digits = "007534679";
    assertEquals("300754679", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case33() {
    String digits = "00090228349336";
    assertEquals("20000928349336", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case34() {
    String digits = "0000000000868862883";
    assertEquals("2000000000086886883", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case35() {
    String digits = "005298559466821452550331";
    assertEquals("100052985594668214525533", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case36() {
    String digits = "00009804003774430273936408859";
    assertEquals("20000000098437744373936408859", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case37() {
    String digits = "00000000000000000000000000000000000007301376";
    assertEquals("10000000000000000000000000000000000000073376", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case38() {
    String digits = "000008119208188278916481616375140448269301319248";
    assertEquals("100000000811928188278916481616375144482693139248", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case39() {
    String digits = "009090";
    assertEquals("900090", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case40() {
    String digits = "005461207440";
    assertEquals("100546207440", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case41() {
    String digits = "0031351452000000";
    assertEquals("1003135452000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case42() {
    String digits = "0000000033528753020000";
    assertEquals("2000000000335287530000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case43() {
    String digits = "00005816178913475263885000";
    assertEquals("10000581617893475263885000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case44() {
    String digits = "00000000004000000000000000700000";
    assertEquals("40000000000000000000000000700000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case45() {
    String digits = "0000000008877678200000000000000000000000000000";
    assertEquals("2000000000887767800000000000000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case46() {
    String digits = "00000161981928999392773240000000000000000000000";
    assertEquals("10000016198928999392773240000000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case47() {
    String digits = "00000000000000000000000000000000000019543005591400";
    assertEquals("10000000000000000000000000000000000000019543559400", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case48() {
    String digits = "00021700814855832354004145445069391684775100000000";
    assertEquals("10000000021781485583235441454456939168477500000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case49() {
    String digits = "00000031262631020759000000000000000000000000000000";
    assertEquals("10000003126263020759000000000000000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case50() {
    String digits = "00000016518063134132359866000000000000000000000000";
    assertEquals("10000000165186313432359866000000000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case51() {
    String digits = "0000040000";
    assertEquals("4000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case52() {
    String digits = "00007050000000000000";
    assertEquals("50000070000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case53() {
    String digits = "000000000000100000000001000070";
    assertEquals("100000000000000000000001000070", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case54() {
    String digits = "000000000000000000000000907000";
    assertEquals("700000000000000000000000009000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case55() {
    String digits = "0000000010000600000007000000000000000000";
    assertEquals("1000000000000600000007000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case56() {
    String digits = "0000000080003010000000000000009000700000";
    assertEquals("1000000000000830000000000000009000700000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case57() {
    String digits = "02800000007000060000006000000000000000000000000000";
    assertEquals("20800000007000060000006000000000000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case58() {
    String digits = "00007000000002000000000000300000000000030000000800";
    assertEquals("20000000000007000000000000300000000000030000000800", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case59() {
    String digits = "00000000000000000000000000000000000000000007000000";
    assertEquals("70000000000000000000000000000000000000000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case60() {
    String digits = "00000000004000000000040206009800070004000000000807";
    assertEquals("20000000000000000000004406009800070004000000000807", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case61() {
    String digits = "04000080781005700670000060008000000000300040009500";
    assertEquals("10000004878005700670000060008000000000300040009500", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case62() {
    String digits = "00000090220307000005200060950071860480030100020001";
    assertEquals("10000000000000000000000000000009223752695718648312", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case63() {
    String digits = "09900658900028087062800327052300300063500509267033";
    assertEquals("20000000000000000000996589288762832752336355967033", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case64() {
    String digits = "80201111118020111111802011111180201111118020111900";
    assertEquals("10000000000821111118211111182111111821111118211900", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case65() {
    String digits = "100218000475729999884";
    assertEquals("100128000475729999884", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case66() {
    String digits = "7701020304050607080900010203040506070809001234589";
    assertEquals("1000000000000000000000077123456789123456789234589", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case67() {
    String digits = "00056168912543213261112346598646132900065198440000";
    assertEquals("10000005616891254321326111234659864613296598440000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case68() {
    String digits = "18412038135123";
    assertEquals("10118423813523", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case69() {
    String digits = "504030306090805020105030605040450260990";
    assertEquals("100000000054336985205030605040450260990", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case70() {
    String digits = "0000000000000012345678909876543211234567890000000";
    assertEquals("1000000000000000123456789987654321234567890000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case71() {
    String digits = "124012051250012540001200";
    assertEquals("100000001241251251254200", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case72() {
    String digits = "00090501000";
    assertEquals("10000095000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case73() {
    String digits = "10234567891023456789102345678910234567891023456789";
    assertEquals("10000123456789123456789123456789123456789023456789", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case74() {
    String digits = "1840001230005550006660007070888802030608090102011";
    assertEquals("1000000000000000000000018412355566677888823689121", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case75() {
    String digits = "2155124120152012501205000";
    assertEquals("1000111255242152125205000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case76() {
    String digits = "12345678901234567890123456789012345678901234567890";
    assertEquals("10000123456789123456789123456789123456789234567890", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case77() {
    String digits = "123423255412342325541234232554123042325540000";
    assertEquals("111123423255423423255423423255423042325540000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case78() {
    String digits = "00021";
    assertEquals("10002", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case79() {
    String digits = "000005000020001";
    assertEquals("100000000000052", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case80() {
    String digits = "02011";
    assertEquals("10021", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case81() {
    String digits = "900000000000000000000000000000000080000000000000";
    assertEquals("800000000000000000000000000000000090000000000000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case82() {
    String digits = "1010101";
    assertEquals("1000111", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case83() {
    String digits = "78965436914785196321956498759265398418523100187546";
    assertEquals("10011111345678969478596329564987592653984852387546", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case84() {
    String digits = "010201";
    assertEquals("100012", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case85() {
    String digits = "8016352000";
    assertEquals("1086352000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case86() {
    String digits = "7812211207816731125133548112591212139";
    assertEquals("1011178222781673112513354811259121239", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case87() {
    String digits = "99999999999999999999999999999999999999999909999999";
    assertEquals("90999999999999999999999999999999999999999999999999", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case88() {
    String digits = "10003";
    assertEquals("10003", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case89() {
    String digits = "1234567890000123456789123456789123456789123456789";
    assertEquals("1000012345678912345678912345678912345678923456789", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case90() {
    String digits = "5009001200010000029870010023311000";
    assertEquals("1000000000000000059121298712331000", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case91() {
    String digits = "081016352";
    assertEquals("100816352", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case92() {
    String digits = "010203040506070809090807060504030201010203040506";
    assertEquals("100000000000000000001234567899876543210203040506", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case93() {
    String digits = "10101098";
    assertEquals("10011098", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case94() {
    String digits = "80101010101052";
    assertEquals("10000081111052", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case95() {
    String digits = "1009";
    assertEquals("1009", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case96() {
    String digits = "3874533543545353445645663286786780000004553544";
    assertEquals("2333333387455454554456456686786780000004553544", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case97() {
    String digits = "102030111";
    assertEquals("100012311", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case98() {
    String digits = "01234067890123456789002345678901234067890123406089";
    assertEquals("10000000012346789123456789234567891234678923406089", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case99() {
    String digits = "801010101010101010101010101010101010101010101052";
    assertEquals("100000000000000000000008111111111111111111111052", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case100() {
    String digits = "030101";
    assertEquals("100031", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case101() {
    String digits = "3675356291270936062618792023759228973612931947845";
    assertEquals("1000123367556927936626187922375922897361293947845", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case102() {
    String digits = "987654321005200154661234567895464312121544545459";
    assertEquals("100001234567895215466123456789546431212544545459", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case103() {
    String digits = "00206090951905040454010502228822022088022910283";
    assertEquals("10000000000000026995195445415222882222882290283", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case104() {
    String digits = "01921021201";
    assertEquals("10001921212", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case105() {
    String digits = "20430";
    assertEquals("20430", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case106() {
    String digits = "000500048787687787876787853401234510867687045600";
    assertEquals("100000005487876877878767878534123450867687045600", leftrightdigitsgame.minNumber(digits));
  }

  @Test
  public void case107() {
    String digits = "00321";
    assertEquals("10032", leftrightdigitsgame.minNumber(digits));
  }

}
