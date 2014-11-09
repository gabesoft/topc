package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CombinationLockDiv2Test {
  CombinationLockDiv2 combinationlockdiv2 = new CombinationLockDiv2();

  @Test
  public void case1() {
    String S = "123";
    String T = "112";
    assertEquals(1, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case2() {
    String S = "1";
    String T = "7";
    assertEquals(4, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case3() {
    String S = "607";
    String T = "607";
    assertEquals(0, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case4() {
    String S = "1234";
    String T = "4567";
    assertEquals(3, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case5() {
    String S = "020";
    String T = "909";
    assertEquals(2, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case6() {
    String S = "4423232218340";
    String T = "6290421476245";
    assertEquals(18, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case7() {
    String S = "0183785";
    String T = "0000000";
    assertEquals(11, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case8() {
    String S = "33333222322233333";
    String T = "00000000000000000";
    assertEquals(5, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case9() {
    String S = "0123456789876543210";
    String T = "0000000000000000000";
    assertEquals(9, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case10() {
    String S = "1234567890987654321";
    String T = "0000000000000000000";
    assertEquals(10, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case11() {
    String S = "3789656";
    String T = "5159478";
    assertEquals(10, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case12() {
    String S = "9277824328";
    String T = "5457494629";
    assertEquals(16, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case13() {
    String S = "351832397";
    String T = "783933521";
    assertEquals(8, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case14() {
    String S = "355070204";
    String T = "676060327";
    assertEquals(7, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case15() {
    String S = "7426453582937390990599";
    String T = "5243281321698807518024";
    assertEquals(36, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case16() {
    String S = "176734746409328221083";
    String T = "164499178500552788873";
    assertEquals(10, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case17() {
    String S = "574149036467923059067";
    String T = "340682246346935394635";
    assertEquals(12, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case18() {
    String S = "605671109043778650486220152344964";
    String T = "052157799605842052820321751543033";
    assertEquals(36, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case19() {
    String S = "996315769104193210743926563394033848332";
    String T = "873969080192858642844150020184156294011";
    assertEquals(20, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case20() {
    String S = "690221017521430132366153071208355064400";
    String T = "466764227408084453356276427987367309078";
    assertEquals(21, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case21() {
    String S = "22109241798036080249208643709135880975390863";
    String T = "80152752534914222910829807569979861784561356";
    assertEquals(64, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case22() {
    String S = "91764076679014302854836840311218635202200369261782";
    String T = "10590882164643449864431120142394117791098627375510";
    assertEquals(70, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case23() {
    String S = "3893718543803167289010912803640497820625097763959";
    String T = "7114706208235266055553122926096176832960665664183";
    assertEquals(28, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case24() {
    String S = "4199201645518106482753617475793802816510517321777";
    String T = "6298077188728083036074605376927369606633963000789";
    assertEquals(26, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case25() {
    String S = "42323221834062904";
    String T = "21476245378965651";
    assertEquals(21, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case26() {
    String S = "94789277824328545749462";
    String T = "97839335216760603277426";
    assertEquals(34, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case27() {
    String S = "453582937390990599524328132169880751802416449917";
    String T = "850055278887334068224634693539463560567110904377";
    assertEquals(58, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case28() {
    String S = "650486220152344964052157799605842052";
    String T = "820321751543033873969080192858642844";
    assertEquals(41, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case29() {
    String S = "500201";
    String T = "841562";
    assertEquals(9, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case30() {
    String S = "4011466764227408084453356276427987367309";
    String T = "0782210924179803608024920864370913588097";
    assertEquals(52, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case31() {
    String S = "5390863801527525349142229108298075699798617845613";
    String T = "5691764076679014302854836840311218635202200369261";
    assertEquals(61, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case32() {
    String S = "82105908821646434498644311201423";
    String T = "94117791098627375510711470620823";
    assertEquals(38, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case33() {
    String S = "26605555312292609617683";
    String T = "29606656641836298077188";
    assertEquals(28, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case34() {
    String S = "72808303607460537692736960663396300078966827177";
    String T = "97188800723106837706034782220291427370931711916";
    assertEquals(62, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case35() {
    String S = "2390069375279223989186826963447017";
    String T = "7324073849890926537064120570111519";
    assertEquals(45, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case36() {
    String S = "2979790780958516619352192169474637319864014737006";
    String T = "8179431995047028504606260522563487301520334596840";
    assertEquals(63, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case37() {
    String S = "3";
    String T = "4";
    assertEquals(1, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case38() {
    String S = "83216";
    String T = "67458";
    assertEquals(8, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case39() {
    String S = "16436173113153215";
    String T = "63398511567666159";
    assertEquals(24, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case40() {
    String S = "16903571944946235956386790292932226";
    String T = "82446781821590556968621368193166783";
    assertEquals(20, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case41() {
    String S = "25934843597600221049999827170062208";
    String T = "91477053474254542051234495071296765";
    assertEquals(20, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case42() {
    String S = "44980990286683930856871328173960974";
    String T = "10423100163237251868116996074194431";
    assertEquals(20, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case43() {
    String S = "030493936306021114157883801666813551900";
    String T = "917047257394786546258017368456936907689";
    assertEquals(20, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case44() {
    String S = "112095956";
    String T = "544196180";
    assertEquals(8, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case45() {
    String S = "123456789";
    String T = "000000000";
    assertEquals(9, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case46() {
    String S = "01234567890123456789";
    String T = "00000000000000000000";
    assertEquals(18, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case47() {
    String S = "132";
    String T = "000";
    assertEquals(3, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case48() {
    String S = "555555546555";
    String T = "000000000000";
    assertEquals(7, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case49() {
    String S = "1233321";
    String T = "0000000";
    assertEquals(3, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case50() {
    String S = "91919191";
    String T = "00000000";
    assertEquals(8, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case51() {
    String S = "919191919";
    String T = "000000000";
    assertEquals(9, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case52() {
    String S = "1213141516171819";
    String T = "0000000000000000";
    assertEquals(24, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case53() {
    String S = "12123234345456567678789890901012123234345456567678";
    String T = "00000000000000000000000000000000000000000000000000";
    assertEquals(33, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case54() {
    String S = "121232343454565676787898909010";
    String T = "000000000000000000000000000000";
    assertEquals(19, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case55() {
    String S = "01234567890123456789012345678901234567890123456789";
    String T = "00000000000000000000000000000000000000000000000000";
    assertEquals(45, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case56() {
    String S = "07418529630741852963074185296307418529630741852963";
    String T = "00000000000000000000000000000000000000000000000000";
    assertEquals(105, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case57() {
    String S = "00236123469719800";
    String T = "00000000000000000";
    assertEquals(16, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case58() {
    String S = "1";
    String T = "0";
    assertEquals(1, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case59() {
    String S = "9";
    String T = "0";
    assertEquals(1, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case60() {
    String S = "00000000000000000000000000000000000000000000000000";
    String T = "50505050505050505050505050505050505050505050505050";
    assertEquals(125, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case61() {
    String S = "12347987984732789432009090909090904218989432814923";
    String T = "21447812739923746784821749837498209099098423788737";
    assertEquals(63, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case62() {
    String S = "12345678901234567890123456789012345678901234567890";
    String T = "22222222222222222222222222222222222222222222222222";
    assertEquals(45, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case63() {
    String S = "44232322184423232218442323221844232322184423232218";
    String T = "90421476245629042147624562904214762456290421476245";
    assertEquals(68, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case64() {
    String S = "11111111";
    String T = "33344444";
    assertEquals(3, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case65() {
    String S = "01234567890123456789012345678901234567890123456789";
    String T = "01234567896290420123456789147012345678962012345645";
    assertEquals(24, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case66() {
    String S = "3094850397852098742039840329840239840329840329840";
    String T = "2093802398403274983247320987402398402759328649328";
    assertEquals(57, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case67() {
    String S = "1234567891234567891234567891234567891234567897648";
    String T = "5476541654324532416543213245215446564554324132416";
    assertEquals(54, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case68() {
    String S = "045515484151269715154154697784178841520215461";
    String T = "788415202154610215454113645548704551548415124";
    assertEquals(52, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case69() {
    String S = "123";
    String T = "135";
    assertEquals(2, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case70() {
    String S = "61245315859136861998168131400331549386718533622839";
    String T = "34852109789707835297031580091362740674655155564356";
    assertEquals(67, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case71() {
    String S = "90834571634876398763898762123214789098764859860987";
    String T = "09847564987456321456098374623432345687654758909874";
    assertEquals(46, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case72() {
    String S = "36753562912709360626187920237592289736129319478450";
    String T = "00000000000000000000000000000000000000000000000000";
    assertEquals(69, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case73() {
    String S = "0550";
    String T = "5005";
    assertEquals(5, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case74() {
    String S = "119088";
    String T = "880911";
    assertEquals(8, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case75() {
    String S = "11223344556677889";
    String T = "99323253555786869";
    assertEquals(11, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case76() {
    String S = "11111";
    String T = "23232";
    assertEquals(3, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case77() {
    String S = "87895715891234567890123456789087219851691234567890";
    String T = "49386571094961830527496183052784759817584961830527";
    assertEquals(85, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case78() {
    String S = "87589123761512387652875891237615123876528758912376";
    String T = "42167128923471982741892374918278149471231212321348";
    assertEquals(67, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case79() {
    String S = "123456789";
    String T = "987654321";
    assertEquals(16, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case80() {
    String S = "12221212156546121336664666464566465400000001115511";
    String T = "11221313465464640012215454100008448779451512121212";
    assertEquals(50, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case81() {
    String S = "590";
    String T = "681";
    assertEquals(3, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case82() {
    String S = "5555559555555";
    String T = "0000007000000";
    assertEquals(8, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case83() {
    String S = "472547254725472547254725472547254725472547254725";
    String T = "000000000000000000000000000000000000000000000000";
    assertEquals(76, combinationlockdiv2.minimumMoves(S, T));
  }

  @Test
  public void case84() {
    String S = "0168511300";
    String T = "0947977456";
    assertEquals(12, combinationlockdiv2.minimumMoves(S, T));
  }

}
