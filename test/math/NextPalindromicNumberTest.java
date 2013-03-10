package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class NextPalindromicNumberTest {
  NextPalindromicNumber nextpalindromicnumber = new NextPalindromicNumber();

  @Test
  public void case1() {
    String n = "12345";
    assertEquals("12421", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case2() {
    String n = "858";
    assertEquals("868", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case3() {
    String n = "1999";
    assertEquals("2002", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case4() {
    String n = "1";
    assertEquals("2", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case5() {
    String n = "9999";
    assertEquals("10001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case6() {
    String n = "91";
    assertEquals("99", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case7() {
    String n = "9999999999999999998";
    assertEquals("9999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case8() {
    String n = "9";
    assertEquals("11", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case9() {
    String n = "123999321";
    assertEquals("124000421", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case10() {
    String n = "98999989";
    assertEquals("99000099", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case11() {
    String n = "99000099";
    assertEquals("99011099", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case12() {
    String n = "990000099";
    assertEquals("990010099", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case13() {
    String n = "2";
    assertEquals("3", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case14() {
    String n = "8";
    assertEquals("9", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case15() {
    String n = "9";
    assertEquals("11", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case16() {
    String n = "99999999999999999999999990000000000000000000000000";
    assertEquals("99999999999999999999999999999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case17() {
    String n = "99999999999999999999999999999999999999999999999999";
    assertEquals("100000000000000000000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case18() {
    String n = "9999999999999999999999999999999999999999999999999";
    assertEquals("10000000000000000000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case19() {
    String n = "9999999999999999999999990000000000000000000000000";
    assertEquals("9999999999999999999999990999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case20() {
    String n = "9999999999999999999999999000000000000000000000000";
    assertEquals("9999999999999999999999999999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case21() {
    String n = "9899999999999999999999999999999999999999999999999";
    assertEquals("9900000000000000000000000000000000000000000000099", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case22() {
    String n = "699996";
    assertEquals("700007", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case23() {
    String n = "199999999999999991";
    assertEquals("200000000000000002", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case24() {
    String n = "66";
    assertEquals("77", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case25() {
    String n = "4999999999999999999999999994";
    assertEquals("5000000000000000000000000005", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case26() {
    String n = "20771985438476749999999999999999994767483458917702";
    assertEquals("20771985438476750000000000000000005767483458917702", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case27() {
    String n = "1168889999999999999999999999999999999999888611";
    assertEquals("1168890000000000000000000000000000000000988611", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case28() {
    String n = "8716627456669779999999779666547266178";
    assertEquals("8716627456669780000000879666547266178", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case29() {
    String n = "18395199159381";
    assertEquals("18395200259381", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case30() {
    String n = "5704058999999998504075";
    assertEquals("5704059000000009504075", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case31() {
    String n = "9071999999999999999999999999999999999999999991709";
    assertEquals("9072000000000000000000000000000000000000000002709", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case32() {
    String n = "98709999999999990789";
    assertEquals("98710000000000001789", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case33() {
    String n = "42107148129999992184170124";
    assertEquals("42107148130000003184170124", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case34() {
    String n = "575999999999999999999999999999999999999575";
    assertEquals("576000000000000000000000000000000000000675", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case35() {
    String n = "77170999999999999907177";
    assertEquals("77171000000000000017177", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case36() {
    String n = "43345258980805999999999999999999999950808985254334";
    assertEquals("43345258980806000000000000000000000060808985254334", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case37() {
    String n = "69996";
    assertEquals("70007", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case38() {
    String n = "338999833";
    assertEquals("339000933", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case39() {
    String n = "3524992709999999999999999999999999999999072994253";
    assertEquals("3524992710000000000000000000000000000000172994253", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case40() {
    String n = "899998";
    assertEquals("900009", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case41() {
    String n = "96637781267099999999999999999999999999076218773669";
    assertEquals("96637781267100000000000000000000000000176218773669", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case42() {
    String n = "6999996";
    assertEquals("7000007", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case43() {
    String n = "57915794481550999999999999999999905518449751975";
    assertEquals("57915794481551000000000000000000015518449751975", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case44() {
    String n = "3821239261387583870039999999300783857831629321283";
    assertEquals("3821239261387583870040000000400783857831629321283", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case45() {
    String n = "67581050873349049994094337805018576";
    assertEquals("67581050873349050005094337805018576", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case46() {
    String n = "65423364178363795925630388303652959736387146332456";
    assertEquals("65423364178363795925630399303652959736387146332456", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case47() {
    String n = "9127624432536804703369633074086352344267219";
    assertEquals("9127624432536804703370733074086352344267219", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case48() {
    String n = "363021120363";
    assertEquals("363022220363", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case49() {
    String n = "7012778579385320035189659569815300235839758772107";
    assertEquals("7012778579385320035189660669815300235839758772107", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case50() {
    String n = "88450614171917141605488";
    assertEquals("88450614172027141605488", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case51() {
    String n = "41516678381749083449813499431894438094718387661513";
    assertEquals("41516678381749083449813499431894438094718387661514", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case52() {
    String n = "509477171696171774904";
    assertEquals("509477171696171774905", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case53() {
    String n = "990939658249868877079681186970778868942856939098";
    assertEquals("990939658249868877079681186970778868942856939099", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case54() {
    String n = "1275218346474647543420209020243457464746438125720";
    assertEquals("1275218346474647543420209020243457464746438125721", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case55() {
    String n = "17084841422414848070";
    assertEquals("17084841422414848071", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case56() {
    String n = "89391827921002007224158499485142270020012972819399";
    assertEquals("89391827921002007224158500585142270020012972819398", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case57() {
    String n = "21175039311393057113";
    assertEquals("21175039322393057112", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case58() {
    String n = "895975058184632533033002200330335236481850579599";
    assertEquals("895975058184632533033003300330335236481850579598", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case59() {
    String n = "7104258297143952728239729279328272593417928524018";
    assertEquals("7104258297143952728239730379328272593417928524017", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case60() {
    String n = "1679561335772489503113059842775331659762";
    assertEquals("1679561335772489503223059842775331659761", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case61() {
    String n = "4";
    assertEquals("5", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case62() {
    String n = "93194561262582880252342621064817238452832276413792";
    assertEquals("93194561262582880252342622624325208828526216549139", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case63() {
    String n = "6661574544684912681299937581232154";
    assertEquals("6661574544684912772194864454751666", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case64() {
    String n = "5885352903460612030342171510491318604";
    assertEquals("5885352903460612031302160643092535885", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case65() {
    String n = "2878515948517711390467772034511832445241228298252";
    assertEquals("2878515948517711390467772777640931177158495158782", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case66() {
    String n = "2245767100126388949954834";
    assertEquals("2245767100127210017675422", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case67() {
    String n = "67865438";
    assertEquals("67866876", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case68() {
    String n = "78651257269418359230269404760145921966973956412606";
    assertEquals("78651257269418359230269411496203295381496275215687", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case69() {
    String n = "9841673418009141942691323";
    assertEquals("9841673418010108143761489", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case70() {
    String n = "3149733518890244926";
    assertEquals("3149733519153379413", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case71() {
    String n = "5290768517175280951176426748798698395003449409851";
    assertEquals("5290768517175280951176427246711590825717158670925", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case72() {
    String n = "10000000000000000000000000000000000000000000000000";
    assertEquals("10000000000000000000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case73() {
    String n = "1000000000000000000000000000000000000000000000000";
    assertEquals("1000000000000000000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case74() {
    String n = "10000000000000000000000000000000000000000000000001";
    assertEquals("10000000000000000000000011000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case75() {
    String n = "1000000000000000000000000000000000000000000000001";
    assertEquals("1000000000000000000000001000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case76() {
    String n = "10000000000000000000000190000000000000000000000009";
    assertEquals("10000000000000000000000199100000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case77() {
    String n = "10000000000000000000000199100000000000000000000001";
    assertEquals("10000000000000000000000200200000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case78() {
    String n = "19999999999999999999999999999999999999999999999999";
    assertEquals("20000000000000000000000000000000000000000000000002", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case79() {
    String n = "1999999999999999999999999999999999999999999999999";
    assertEquals("2000000000000000000000000000000000000000000000002", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case80() {
    String n = "99999";
    assertEquals("100001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case81() {
    String n = "99999999999999999999999999999999999999999999999999";
    assertEquals("100000000000000000000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case82() {
    String n = "12345123451234512345123451234512345123451234512345";
    assertEquals("12345123451234512345123455432154321543215432154321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case83() {
    String n = "99999999999999999999990999999999999999999999999999";
    assertEquals("99999999999999999999991000019999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case84() {
    String n = "1285999999999999999999999999999999999999999999921";
    assertEquals("1286000000000000000000000000000000000000000006821", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case85() {
    String n = "99999999999999999999999999999999999999999999999979";
    assertEquals("99999999999999999999999999999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case86() {
    String n = "19999999999999999999999999999999999999999999999999";
    assertEquals("20000000000000000000000000000000000000000000000002", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case87() {
    String n = "12358152091235815209123581520912358152091235815209";
    assertEquals("12358152091235815209123588532190251853219025185321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case88() {
    String n = "1234567893458739491832474742381949387543978654321";
    assertEquals("1234567893458739491832475742381949378543987654321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case89() {
    String n = "12345";
    assertEquals("12421", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case90() {
    String n = "9999999999999999999999999000000000000000000000000";
    assertEquals("9999999999999999999999999999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case91() {
    String n = "32525638967986969698867098987";
    assertEquals("32525638967987078976983652523", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case92() {
    String n = "9";
    assertEquals("11", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case93() {
    String n = "9875559891231239567893987653321321989555789";
    assertEquals("9875559891231239567893987659321321989555789", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case94() {
    String n = "111111113111111111112345678999999999999";
    assertEquals("111111113111111111121111111111311111111", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case95() {
    String n = "11233366558566332545551123336655856633254555";
    assertEquals("11233366558566332545555554523366585566333211", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case96() {
    String n = "3";
    assertEquals("4", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case97() {
    String n = "999";
    assertEquals("1001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case98() {
    String n = "999999999999999999999999";
    assertEquals("1000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case99() {
    String n = "999999999999999999999999999";
    assertEquals("1000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case100() {
    String n = "2599971";
    assertEquals("2600062", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case101() {
    String n = "99999999999999999999999990000000000000000000000000";
    assertEquals("99999999999999999999999999999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case102() {
    String n = "11111111111111111111111111111111111111111111111111";
    assertEquals("11111111111111111111111122111111111111111111111111", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case103() {
    String n = "123456789123456789123456789123456789";
    assertEquals("123456789123456789987654321987654321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case104() {
    String n = "9999999978399999999999999000000000000000000000000";
    assertEquals("9999999978399999999999999999999999999938799999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case105() {
    String n = "32122";
    assertEquals("32123", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case106() {
    String n = "956321214512195632121451219563212145121658";
    assertEquals("956321214512195632122221236591215412123659", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case107() {
    String n = "80099294579248428914712983742613570009999999191990";
    assertEquals("80099294579248428914712988921741982484297549299008", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case108() {
    String n = "92999999999999999999999999999999999999799999999997";
    assertEquals("92999999999999999999999999999999999999999999999929", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case109() {
    String n = "999995421856548654218565486542189999999985654899";
    assertEquals("999995421856548654218565565812456845658124599999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case110() {
    String n = "74658764359872037438647865874365694835943875984366";
    assertEquals("74658764359872037438647866874683473027895346785647", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case111() {
    String n = "12345678901234567890123456789012345678901234567890";
    assertEquals("12345678901234567890123466432109876543210987654321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case112() {
    String n = "99999999999999999999999999999999999999999999999991";
    assertEquals("99999999999999999999999999999999999999999999999999", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case113() {
    String n = "111111111111111111111111";
    assertEquals("111111111112211111111111", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case114() {
    String n = "12345555555555555555555555555555555555555555555555";
    assertEquals("12345555555555555555555566555555555555555555554321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case115() {
    String n = "99999999999999999999999999999999999999999999999";
    assertEquals("100000000000000000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case116() {
    String n = "9988776655676752431111111111111111111111";
    assertEquals("9988776655676752431111342576765566778899", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case117() {
    String n = "99999999999999999999999";
    assertEquals("100000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case118() {
    String n = "11111111111011111111111111111111";
    assertEquals("11111111111011122111011111111111", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case119() {
    String n = "487747873897374738643687737583466265426524652538";
    assertEquals("487747873897374738643687786346837473798378747784", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case120() {
    String n = "1111111111111111111111111111111111111111111111";
    assertEquals("1111111111111111111111221111111111111111111111", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case121() {
    String n = "1235434342568506854569889";
    assertEquals("1235434342568652434345321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case122() {
    String n = "11111111111111111111111111111111111111111111111112";
    assertEquals("11111111111111111111111122111111111111111111111111", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case123() {
    String n = "10000000000000000000000000000000000002";
    assertEquals("10000000000000000011000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case124() {
    String n = "124932";
    assertEquals("125521", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case125() {
    String n = "99999999999999999999999999999999999";
    assertEquals("100000000000000000000000000000000001", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case126() {
    String n = "12345678998765432112345678998765412332165498798765";
    assertEquals("12345678998765432112345688654321123456789987654321", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case127() {
    String n = "900000000000000001000000000000000000";
    assertEquals("900000000000000001100000000000000009", nextpalindromicnumber.getNext(n));
  }

  @Test
  public void case128() {
    String n = "2121";
    assertEquals("2222", nextpalindromicnumber.getNext(n));
  }

}
