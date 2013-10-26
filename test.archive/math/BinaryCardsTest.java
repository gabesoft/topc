package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BinaryCardsTest {
  BinaryCards binarycards = new BinaryCards();

  @Test
  public void case1() {
    long A = 6L;
    long B = 6L;
    assertEquals(6L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case2() {
    long A = 6L;
    long B = 7L;
    assertEquals(7L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case3() {
    long A = 6L;
    long B = 8L;
    assertEquals(15L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case4() {
    long A = 1L;
    long B = 11L;
    assertEquals(15L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case5() {
    long A = 35L;
    long B = 38L;
    assertEquals(39L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case6() {
    long A = 337007621073450791L;
    long B = 337259621176923563L;
    assertEquals(337769972052787199L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case7() {
    long A = 337007621073450791L;
    long B = 363243549783774699L;
    assertEquals(432345564227567615L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case8() {
    long A = 337007621073450700L;
    long B = 576460752303429290L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case9() {
    long A = 13L;
    long B = 999999999999999947L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case10() {
    long A = 1L;
    long B = 1000000000000000000L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case11() {
    long A = 1L;
    long B = 1L;
    assertEquals(1L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case12() {
    long A = 1000000000000000000L;
    long B = 1000000000000000000L;
    assertEquals(1000000000000000000L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case13() {
    long A = 1L;
    long B = 2L;
    assertEquals(3L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case14() {
    long A = 1L;
    long B = 3L;
    assertEquals(3L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case15() {
    long A = 2L;
    long B = 2L;
    assertEquals(2L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case16() {
    long A = 2L;
    long B = 3L;
    assertEquals(3L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case17() {
    long A = 3L;
    long B = 3L;
    assertEquals(3L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case18() {
    long A = 3L;
    long B = 4L;
    assertEquals(7L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case19() {
    long A = 4L;
    long B = 4L;
    assertEquals(4L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case20() {
    long A = 13435118322293023L;
    long B = 13435118322293023L;
    assertEquals(13435118322293023L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case21() {
    long A = 252967131130464888L;
    long B = 252967131130464888L;
    assertEquals(252967131130464888L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case22() {
    long A = 469891784347835618L;
    long B = 469891784347835618L;
    assertEquals(469891784347835618L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case23() {
    long A = 258474518727344664L;
    long B = 258474518727344664L;
    assertEquals(258474518727344664L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case24() {
    long A = 71857669457162785L;
    long B = 71857669457162785L;
    assertEquals(71857669457162785L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case25() {
    long A = 176818103997872891L;
    long B = 176818103997873439L;
    assertEquals(176818103997874175L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case26() {
    long A = 673336125333327877L;
    long B = 673336125333328868L;
    assertEquals(673336125333328895L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case27() {
    long A = 21184812552106628L;
    long B = 21184812552106728L;
    assertEquals(21184812552106751L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case28() {
    long A = 906611261103360176L;
    long B = 906611261103360326L;
    assertEquals(906611261103360511L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case29() {
    long A = 631896407723188043L;
    long B = 631896407723188737L;
    assertEquals(631896407723196415L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case30() {
    long A = 247024732614360996L;
    long B = 247024732614361943L;
    assertEquals(247024732614426623L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case31() {
    long A = 280721490791747993L;
    long B = 280721490791748763L;
    assertEquals(280721490791749631L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case32() {
    long A = 461657559838062496L;
    long B = 461657559838062968L;
    assertEquals(461657559838064639L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case33() {
    long A = 620089089696830274L;
    long B = 620089089696830603L;
    assertEquals(620089089696831487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case34() {
    long A = 43566986678135226L;
    long B = 43566986678135833L;
    assertEquals(43566986678136831L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case35() {
    long A = 528042601210849297L;
    long B = 528042601210849469L;
    assertEquals(528042601210849535L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case36() {
    long A = 84536132133068665L;
    long B = 84536132133069319L;
    assertEquals(84536132133076991L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case37() {
    long A = 942126680384630477L;
    long B = 942126680384631202L;
    assertEquals(942126680384634879L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case38() {
    long A = 829161406158550903L;
    long B = 829161406158551053L;
    assertEquals(829161406158553087L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case39() {
    long A = 192864567966073284L;
    long B = 192864567966074101L;
    assertEquals(192864567966074879L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case40() {
    long A = 399896204401903756L;
    long B = 399896204401903959L;
    assertEquals(399896204401904127L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case41() {
    long A = 655725947309379779L;
    long B = 655725947309380452L;
    assertEquals(655725947309380607L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case42() {
    long A = 60991707593202488L;
    long B = 60991707593202638L;
    assertEquals(60991707593202687L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case43() {
    long A = 972578212996605153L;
    long B = 972578212996605632L;
    assertEquals(972578212996605951L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case44() {
    long A = 104679898968505965L;
    long B = 104679898968506109L;
    assertEquals(104679898968506111L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case45() {
    long A = 729958436560262555L;
    long B = 729958436560262795L;
    assertEquals(729958436560263167L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case46() {
    long A = 507500148014589508L;
    long B = 507500148014590374L;
    assertEquals(507500148014591999L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case47() {
    long A = 91417475999865401L;
    long B = 91417475999865740L;
    assertEquals(91417475999865855L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case48() {
    long A = 333840733864662438L;
    long B = 333840733864663435L;
    assertEquals(333840733864665087L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case49() {
    long A = 826286096177798903L;
    long B = 826286096177799662L;
    assertEquals(826286096177807359L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case50() {
    long A = 592225194635090984L;
    long B = 592225194635091352L;
    assertEquals(592225194635091455L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case51() {
    long A = 977759016201489584L;
    long B = 977759016201490202L;
    assertEquals(977759016201490431L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case52() {
    long A = 246644132110493584L;
    long B = 246644132110494535L;
    assertEquals(246644132110495743L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case53() {
    long A = 439335986138523394L;
    long B = 439335986138524105L;
    assertEquals(439335986138525695L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case54() {
    long A = 438788899128495824L;
    long B = 438788899128496339L;
    assertEquals(438788899128500223L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case55() {
    long A = 732687986402108031L;
    long B = 836087143253585095L;
    assertEquals(864691128455135231L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case56() {
    long A = 92645752026305337L;
    long B = 550113554666774577L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case57() {
    long A = 602049742558610199L;
    long B = 951600406774886073L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case58() {
    long A = 706337757793877497L;
    long B = 726719184543046995L;
    assertEquals(864691128455135231L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case59() {
    long A = 818371022660510048L;
    long B = 980626001687600036L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case60() {
    long A = 80766787368399593L;
    long B = 370922704980929886L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case61() {
    long A = 414364532474145686L;
    long B = 535084885568801990L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case62() {
    long A = 749924328780360702L;
    long B = 916969508550056468L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case63() {
    long A = 767103813160910190L;
    long B = 937414842315000059L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case64() {
    long A = 824229608922636783L;
    long B = 938157792592406450L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case65() {
    long A = 211914680349424630L;
    long B = 567698046964858784L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case66() {
    long A = 513120303067513709L;
    long B = 799984384704765630L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case67() {
    long A = 804032651298292590L;
    long B = 986393890336885097L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case68() {
    long A = 565003508511569449L;
    long B = 651915890827597517L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case69() {
    long A = 384546583644785051L;
    long B = 928758421871023805L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case70() {
    long A = 236803334965751562L;
    long B = 530175526899960478L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case71() {
    long A = 959666360481658390L;
    long B = 983713329931865150L;
    assertEquals(1008806316530991103L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case72() {
    long A = 973589585442451164L;
    long B = 999944508749318888L;
    assertEquals(1008806316530991103L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case73() {
    long A = 342003499769379916L;
    long B = 498421883622934710L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case74() {
    long A = 767693274074903870L;
    long B = 979738263141363679L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case75() {
    long A = 382513839723571656L;
    long B = 410584681057222251L;
    assertEquals(432345564227567615L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case76() {
    long A = 506496661205795359L;
    long B = 541653773009968970L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case77() {
    long A = 318241991786901344L;
    long B = 340649515483168172L;
    assertEquals(360287970189639679L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case78() {
    long A = 541827877884334214L;
    long B = 543084169345761379L;
    assertEquals(544935554911830015L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case79() {
    long A = 520945445163048875L;
    long B = 521672253894060363L;
    assertEquals(522417556774977535L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case80() {
    long A = 337661893084541764L;
    long B = 553806635450033820L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case81() {
    long A = 565112646848659645L;
    long B = 568912171862912374L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case82() {
    long A = 312840585181419594L;
    long B = 314902478955996726L;
    assertEquals(315251973915934719L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case83() {
    long A = 365535731318166037L;
    long B = 401109390394047050L;
    assertEquals(432345564227567615L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case84() {
    long A = 399447785612834554L;
    long B = 411816984965413976L;
    assertEquals(414331165718085631L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case85() {
    long A = 423078048015223971L;
    long B = 533193151865080675L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case86() {
    long A = 291746566948275431L;
    long B = 376667410053414057L;
    assertEquals(432345564227567615L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case87() {
    long A = 469070680029655150L;
    long B = 471666199184921483L;
    assertEquals(472877960873902079L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case88() {
    long A = 426305944372602670L;
    long B = 482177657795403892L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case89() {
    long A = 345447906666288848L;
    long B = 349191855013225804L;
    assertEquals(351280770934898687L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case90() {
    long A = 350037591335932507L;
    long B = 355584378117889903L;
    assertEquals(360287970189639679L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case91() {
    long A = 484233815016952022L;
    long B = 485024458018296310L;
    assertEquals(485262859849170943L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case92() {
    long A = 329644275178521849L;
    long B = 330818761457996727L;
    assertEquals(331014572611731455L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case93() {
    long A = 533986048966540507L;
    long B = 564712102537874406L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case94() {
    long A = 435417121318038471L;
    long B = 435561360106135103L;
    assertEquals(435723263948095487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case95() {
    long A = 381905962783887868L;
    long B = 382181453033419638L;
    assertEquals(382243018373070847L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case96() {
    long A = 314290554338338618L;
    long B = 314927847485414766L;
    assertEquals(315251973915934719L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case97() {
    long A = 442177711350763352L;
    long B = 442308151667821598L;
    assertEquals(442478663389151231L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case98() {
    long A = 390483612063517613L;
    long B = 423352170914714474L;
    assertEquals(432345564227567615L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case99() {
    long A = 361239667840171496L;
    long B = 395555987834915904L;
    assertEquals(396316767208603647L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case100() {
    long A = 549741646066376252L;
    long B = 550994623595740861L;
    assertEquals(551690954352885759L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case101() {
    long A = 333541150425770125L;
    long B = 334168082337383463L;
    assertEquals(334392272332259327L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case102() {
    long A = 475673970210278164L;
    long B = 476859012438865115L;
    assertEquals(477381560501272575L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case103() {
    long A = 369689640656221229L;
    long B = 413380679774870573L;
    assertEquals(432345564227567615L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case104() {
    long A = 545397602878199236L;
    long B = 559459808989470809L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case105() {
    long A = 298971176024131434L;
    long B = 301092822522968189L;
    assertEquals(301741175033823231L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case106() {
    long A = 498292963987240092L;
    long B = 503456801495253550L;
    assertEquals(504403158265495551L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case107() {
    long A = 314601835217001986L;
    long B = 517160390750787098L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case108() {
    long A = 536116186576008757L;
    long B = 536472320040157462L;
    assertEquals(536491305610510335L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case109() {
    long A = 444641271288504247L;
    long B = 493850093000353894L;
    assertEquals(504403158265495551L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case110() {
    long A = 1125899906842630L;
    long B = 1125899906842632L;
    assertEquals(1125899906842639L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case111() {
    long A = 1L;
    long B = 100000000000000000L;
    assertEquals(144115188075855871L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case112() {
    long A = 1L;
    long B = 1125899906842632L;
    assertEquals(2251799813685247L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case113() {
    long A = 1L;
    long B = 1000000000000000L;
    assertEquals(1125899906842623L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case114() {
    long A = 1L;
    long B = 1099511627776L;
    assertEquals(2199023255551L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case115() {
    long A = 1L;
    long B = 1000000230213021L;
    assertEquals(1125899906842623L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case116() {
    long A = 237L;
    long B = 834457658766989797L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case117() {
    long A = 1L;
    long B = 100000000000000L;
    assertEquals(140737488355327L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case118() {
    long A = 999999999999999999L;
    long B = 1000000000000000000L;
    assertEquals(1000000000000262143L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case119() {
    long A = 1L;
    long B = 1000000000000L;
    assertEquals(1099511627775L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case120() {
    long A = 7L;
    long B = 8L;
    assertEquals(15L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case121() {
    long A = 1L;
    long B = 37124508045065437L;
    assertEquals(72057594037927935L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case122() {
    long A = 1125899906842630L;
    long B = 1688849860263942L;
    assertEquals(2251799813685247L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case123() {
    long A = 6419838068042L;
    long B = 6432741199874L;
    assertEquals(6459630813183L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case124() {
    long A = 1L;
    long B = 10000000000000000L;
    assertEquals(18014398509481983L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case125() {
    long A = 12L;
    long B = 100000000000000000L;
    assertEquals(144115188075855871L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case126() {
    long A = 16L;
    long B = 16L;
    assertEquals(16L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case127() {
    long A = 11L;
    long B = 13L;
    assertEquals(15L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case128() {
    long A = 576460752303423487L;
    long B = 576460752303423488L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case129() {
    long A = 1L;
    long B = 3475385758524527L;
    assertEquals(4503599627370495L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case130() {
    long A = 8L;
    long B = 13L;
    assertEquals(15L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case131() {
    long A = 10L;
    long B = 1000000000000008L;
    assertEquals(1125899906842623L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case132() {
    long A = 8L;
    long B = 9L;
    assertEquals(9L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case133() {
    long A = 1125899906842623L;
    long B = 1125899906842624L;
    assertEquals(2251799813685247L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case134() {
    long A = 2147483648L;
    long B = 2394967295L;
    assertEquals(2415919103L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case135() {
    long A = 1L;
    long B = 999999999999999999L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case136() {
    long A = 9876543212345678L;
    long B = 12345678987654321L;
    assertEquals(13510798882111487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case137() {
    long A = 50L;
    long B = 52L;
    assertEquals(55L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case138() {
    long A = 128L;
    long B = 147L;
    assertEquals(159L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case139() {
    long A = 288230376151711744L;
    long B = 576460752303423488L;
    assertEquals(1152921504606846975L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case140() {
    long A = 10L;
    long B = 10L;
    assertEquals(10L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case141() {
    long A = 37L;
    long B = 45L;
    assertEquals(47L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case142() {
    long A = 149533581377535L;
    long B = 167125767421951L;
    assertEquals(175921860444159L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case143() {
    long A = 144115188075855872L;
    long B = 288230376151711744L;
    assertEquals(576460752303423487L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case144() {
    long A = 22L;
    long B = 25L;
    assertEquals(31L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case145() {
    long A = 71L;
    long B = 73L;
    assertEquals(79L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case146() {
    long A = 139480814L;
    long B = 139546340L;
    assertEquals(139591679L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case147() {
    long A = 19L;
    long B = 21L;
    assertEquals(23L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case148() {
    long A = 1099511627775L;
    long B = 1099511627776L;
    assertEquals(2199023255551L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case149() {
    long A = 64L;
    long B = 84L;
    assertEquals(95L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case150() {
    long A = 4L;
    long B = 6L;
    assertEquals(7L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case151() {
    long A = 35L;
    long B = 36L;
    assertEquals(39L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case152() {
    long A = 33L;
    long B = 37L;
    assertEquals(39L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case153() {
    long A = 1125899906842624L;
    long B = 1688849860263936L;
    assertEquals(2251799813685247L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case154() {
    long A = 234L;
    long B = 34234L;
    assertEquals(65535L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case155() {
    long A = 8L;
    long B = 8L;
    assertEquals(8L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case156() {
    long A = 19009999990999995L;
    long B = 19909919990909995L;
    assertEquals(20266198323167231L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case157() {
    long A = 288230376151711742L;
    long B = 288230376151711743L;
    assertEquals(288230376151711743L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case158() {
    long A = 8L;
    long B = 10L;
    assertEquals(11L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case159() {
    long A = 576460752504758272L;
    long B = 576601524285743104L;
    assertEquals(576742227280134143L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case160() {
    long A = 123456789123456789L;
    long B = 234567892345678900L;
    assertEquals(288230376151711743L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case161() {
    long A = 24L;
    long B = 26L;
    assertEquals(27L, binarycards.largestNumber(A, B));
  }

  @Test
  public void case162() {
    long A = 2L;
    long B = 13L;
    assertEquals(15L, binarycards.largestNumber(A, B));
  }

}
