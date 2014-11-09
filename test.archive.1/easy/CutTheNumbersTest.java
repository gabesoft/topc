package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CutTheNumbersTest {
  CutTheNumbers cutthenumbers = new CutTheNumbers();

  @Test
  public void case1() {
    String[] board = { "123", "312" };
    assertEquals(435, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case2() {
    String[] board = { "99", "11" };
    assertEquals(182, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case3() {
    String[] board = { "001", "010", "111", "100" };
    assertEquals(1131, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case4() {
    String[] board = { "8" };
    assertEquals(8, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case5() {
    String[] board = { "0011", "0011", "0011", "1111" };
    assertEquals(2233, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case6() {
    String[] board = { "0002", "0101", "1011", "0202" };
    assertEquals(2243, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case7() {
    String[] board = { "0001", "0000", "1011", "2002" };
    assertEquals(3023, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case8() {
    String[] board = { "0002", "0011", "0012", "2210" };
    assertEquals(2433, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case9() {
    String[] board = { "0011", "0001", "1021", "2021" };
    assertEquals(3063, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case10() {
    String[] board = { "0020", "0011", "0002", "2211" };
    assertEquals(2433, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case11() {
    String[] board = { "0011", "0102", "0101", "2110" };
    assertEquals(2342, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case12() {
    String[] board = { "0021", "0000", "0012", "2201" };
    assertEquals(3053, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case13() {
    String[] board = { "0020", "0011", "0000", "1002" };
    assertEquals(2212, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case14() {
    String[] board = { "0" };
    assertEquals(0, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case15() {
    String[] board = { "0000" };
    assertEquals(0, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case16() {
    String[] board = { "9999" };
    assertEquals(9999, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case17() {
    String[] board = { "9999", "9999", "9999", "9999" };
    assertEquals(39996, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case18() {
    String[] board = { "0341", "5155", "7470", "6513" };
    assertEquals(19479, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case19() {
    String[] board = { "0003", "0121", "0032", "3122" };
    assertEquals(3467, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case20() {
    String[] board = { "2003", "1002", "0103", "1201" };
    assertEquals(5362, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case21() {
    String[] board = { "0023", "0020", "0230", "3200" };
    assertEquals(5264, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case22() {
    String[] board = { "0000", "0001", "0002", "1022" };
    assertEquals(1034, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case23() {
    String[] board = { "0013", "0022", "3111", "2203" };
    assertEquals(5358, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case24() {
    String[] board = { "2220", "0012", "0011" };
    assertEquals(2252, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case25() {
    String[] board = { "1200", "0002", "0001" };
    assertEquals(1221, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case26() {
    String[] board = { "2020", "0012", "0002" };
    assertEquals(2052, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case27() {
    String[] board = { "2000", "0022", "0010" };
    assertEquals(2041, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case28() {
    String[] board = { "2202", "0002", "0010" };
    assertEquals(2223, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case29() {
    String[] board = { "0022", "0011", "1002" };
    assertEquals(1044, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case30() {
    String[] board = { "0002", "0012", "2210" };
    assertEquals(2233, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case31() {
    String[] board = { "1211", "0012", "0010" };
    assertEquals(1242, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case32() {
    String[] board = { "002", "001", "202", "211" };
    assertEquals(2162, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case33() {
    String[] board = { "100", "000", "001", "020" };
    assertEquals(1021, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case34() {
    String[] board = { "001", "000", "000", "222" };
    assertEquals(1024, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case35() {
    String[] board = { "009", "013", "888" };
    assertEquals(1027, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case36() {
    String[] board = { "009", "322", "605" };
    assertEquals(1017, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case37() {
    String[] board = { "003", "108", "269" };
    assertEquals(425, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case38() {
    String[] board = { "027", "017", "996" };
    assertEquals(1094, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case39() {
    String[] board = { "082", "000", "952" };
    assertEquals(1052, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case40() {
    String[] board = { "015", "026", "929" };
    assertEquals(997, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case41() {
    String[] board = { "044", "038", "863" };
    assertEquals(954, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case42() {
    String[] board = { "027", "010", "984" };
    assertEquals(1075, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case43() {
    String[] board = { "009", "331", "533" };
    assertEquals(999, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case44() {
    String[] board = { "007", "219", "474" };
    assertEquals(862, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case45() {
    String[] board = { "013", "003", "938" };
    assertEquals(981, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case46() {
    String[] board = { "008", "142", "746" };
    assertEquals(914, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case47() {
    String[] board = { "005", "020", "890" };
    assertEquals(942, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case48() {
    String[] board = { "002", "008", "481" };
    assertEquals(509, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case49() {
    String[] board = { "008", "126", "690" };
    assertEquals(941, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case50() {
    String[] board = { "041", "004", "576" };
    assertEquals(630, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case51() {
    String[] board = { "004", "019", "719" };
    assertEquals(769, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case52() {
    String[] board = { "002", "011", "823" };
    assertEquals(845, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case53() {
    String[] board = { "009", "400", "573" };
    assertEquals(1000, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case54() {
    String[] board = { "004", "015", "632" };
    assertEquals(678, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case55() {
    String[] board = { "042", "012", "791" };
    assertEquals(854, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case56() {
    String[] board = { "007", "215", "466" };
    assertEquals(823, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case57() {
    String[] board = { "004", "009", "252" };
    assertEquals(517, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case58() {
    String[] board = { "041", "009", "956" };
    assertEquals(1015, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case59() {
    String[] board = { "026", "043", "817" };
    assertEquals(904, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case60() {
    String[] board = { "008", "145", "688" };
    assertEquals(940, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case61() {
    String[] board = { "042", "016", "638" };
    assertEquals(705, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case62() {
    String[] board = { "007", "316", "417" };
    assertEquals(839, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case63() {
    String[] board = { "004", "028", "886" };
    assertEquals(936, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case64() {
    String[] board = { "052", "017", "803" };
    assertEquals(881, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case65() {
    String[] board = { "005", "126", "376" };
    assertEquals(615, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case66() {
    String[] board = { "018", "044", "908" };
    assertEquals(1006, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case67() {
    String[] board = { "008", "337", "619" };
    assertEquals(973, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case68() {
    String[] board = { "007", "109", "688" };
    assertEquals(876, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case69() {
    String[] board = { "006", "102", "374" };
    assertEquals(671, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case70() {
    String[] board = { "026", "008", "891" };
    assertEquals(979, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case71() {
    String[] board = { "034", "035", "781" };
    assertEquals(859, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case72() {
    String[] board = { "003", "010", "763" };
    assertEquals(794, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case73() {
    String[] board = { "027", "015", "900" };
    assertEquals(996, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case74() {
    String[] board = { "005", "134", "448" };
    assertEquals(605, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case75() {
    String[] board = { "007", "220", "304" };
    assertEquals(756, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case76() {
    String[] board = { "044", "022", "933" };
    assertEquals(1017, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case77() {
    String[] board = { "007", "022", "879" };
    assertEquals(953, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case78() {
    String[] board = { "037", "007", "997" };
    assertEquals(1104, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case79() {
    String[] board = { "041", "003", "563" };
    assertEquals(616, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case80() {
    String[] board = { "034", "039", "849" };
    assertEquals(931, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case81() {
    String[] board = { "007", "110", "337" };
    assertEquals(751, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case82() {
    String[] board = { "009", "304", "320" };
    assertEquals(1002, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case83() {
    String[] board = { "006", "048", "650" };
    assertEquals(749, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case84() {
    String[] board = { "008", "142", "626" };
    assertEquals(902, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case85() {
    String[] board = { "009", "024", "507" };
    assertEquals(999, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case86() {
    String[] board = { "004", "037", "426" };
    assertEquals(521, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case87() {
    String[] board = { "033", "025", "643" };
    assertEquals(710, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case88() {
    String[] board = { "052", "008", "871" };
    assertEquals(949, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case89() {
    String[] board = { "043", "017", "971" };
    assertEquals(1049, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case90() {
    String[] board = { "022", "015", "513" };
    assertEquals(559, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case91() {
    String[] board = { "032", "017", "880" };
    assertEquals(938, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case92() {
    String[] board = { "006", "025", "911" };
    assertEquals(978, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case93() {
    String[] board = { "009", "413", "523" };
    assertEquals(1026, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case94() {
    String[] board = { "009", "016", "379" };
    assertEquals(1007, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case95() {
    String[] board = { "008", "014", "685" };
    assertEquals(914, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case96() {
    String[] board = { "045", "002", "860" };
    assertEquals(952, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case97() {
    String[] board = { "005", "100", "132" };
    assertEquals(525, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case98() {
    String[] board = { "002", "008", "881" };
    assertEquals(909, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case99() {
    String[] board = { "004", "209", "195" };
    assertEquals(534, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case100() {
    String[] board = { "007", "224", "389" };
    assertEquals(809, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case101() {
    String[] board = { "023", "006", "550" };
    assertEquals(606, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case102() {
    String[] board = { "015", "004", "699" };
    assertEquals(763, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case103() {
    String[] board = { "021", "001", "440" };
    assertEquals(471, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case104() {
    String[] board = { "004", "123", "310" };
    assertEquals(473, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case105() {
    String[] board = { "002", "101", "100" };
    assertEquals(230, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case106() {
    String[] board = { "001", "000", "320" };
    assertEquals(330, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case107() {
    String[] board = { "002", "101", "103" };
    assertEquals(233, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case108() {
    String[] board = { "022", "013", "432" };
    assertEquals(476, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case109() {
    String[] board = { "004", "204", "232" };
    assertEquals(485, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case110() {
    String[] board = { "001", "000", "110" };
    assertEquals(120, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case111() {
    String[] board = { "001", "000", "100" };
    assertEquals(110, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case112() {
    String[] board = { "001", "001", "101" };
    assertEquals(121, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case113() {
    String[] board = { "001", "000", "111" };
    assertEquals(121, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case114() {
    String[] board = { "0018", "0026", "7020" };
    assertEquals(7118, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case115() {
    String[] board = { "5325", "1242" };
    assertEquals(6567, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case116() {
    String[] board = { "1", "2", "3", "1" };
    assertEquals(1231, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case117() {
    String[] board = { "001", "002", "301", "302" };
    assertEquals(1272, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case118() {
    String[] board = { "200", "200", "010", "311" };
    assertEquals(2224, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case119() {
    String[] board = { "002", "004", "021", "443" };
    assertEquals(2459, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case120() {
    String[] board = { "100", "200", "331", "230" };
    assertEquals(1293, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case121() {
    String[] board = { "372" };
    assertEquals(372, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case122() {
    String[] board = { "2", "4", "6" };
    assertEquals(246, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case123() {
    String[] board = { "9", "1", "8", "6" };
    assertEquals(9186, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case124() {
    String[] board = { "403", "027", "245" };
    assertEquals(801, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case125() {
    String[] board = { "569", "339", "053", "679" };
    assertEquals(21602, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case126() {
    String[] board = { "27", "19" };
    assertEquals(100, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case127() {
    String[] board = { "24" };
    assertEquals(24, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case128() {
    String[] board = { "8761" };
    assertEquals(8761, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case129() {
    String[] board = { "975", "656", "271" };
    assertEquals(2280, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case130() {
    String[] board = { "188", "964" };
    assertEquals(1152, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case131() {
    String[] board = { "175" };
    assertEquals(175, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case132() {
    String[] board = { "8769", "3043", "3841", "7303" };
    assertEquals(31173, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case133() {
    String[] board = { "9", "8" };
    assertEquals(98, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case134() {
    String[] board = { "0679", "5936" };
    assertEquals(6615, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case135() {
    String[] board = { "21" };
    assertEquals(21, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case136() {
    String[] board = { "1855", "3436", "5720" };
    assertEquals(11011, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case137() {
    String[] board = { "8", "9", "9", "5" };
    assertEquals(8995, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case138() {
    String[] board = { "9006", "0211" };
    assertEquals(9217, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case139() {
    String[] board = { "0264", "7702", "5816", "5552" };
    assertEquals(19334, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case140() {
    String[] board = { "8", "8", "2", "4" };
    assertEquals(8824, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case141() {
    String[] board = { "9289", "4508", "6731" };
    assertEquals(20528, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case142() {
    String[] board = { "8", "1", "6" };
    assertEquals(816, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case143() {
    String[] board = { "576" };
    assertEquals(576, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case144() {
    String[] board = { "755", "523", "389" };
    assertEquals(1820, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case145() {
    String[] board = { "710", "778", "716" };
    assertEquals(2204, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case146() {
    String[] board = { "6", "5", "5" };
    assertEquals(655, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case147() {
    String[] board = { "9322" };
    assertEquals(9322, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case148() {
    String[] board = { "6392", "2555", "6517" };
    assertEquals(15464, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case149() {
    String[] board = { "317", "111" };
    assertEquals(428, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case150() {
    String[] board = { "83", "72" };
    assertEquals(155, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case151() {
    String[] board = { "517", "919", "840" };
    assertEquals(2276, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case152() {
    String[] board = { "995", "586" };
    assertEquals(1581, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case153() {
    String[] board = { "8" };
    assertEquals(8, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case154() {
    String[] board = { "294", "431", "599" };
    assertEquals(1603, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case155() {
    String[] board = { "09", "48" };
    assertEquals(102, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case156() {
    String[] board = { "01", "83", "04" };
    assertEquals(214, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case157() {
    String[] board = { "55", "84" };
    assertEquals(139, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case158() {
    String[] board = { "584", "925", "839", "839" };
    assertEquals(18820, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case159() {
    String[] board = { "62", "51", "30" };
    assertEquals(863, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case160() {
    String[] board = { "571" };
    assertEquals(571, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case161() {
    String[] board = { "6750" };
    assertEquals(6750, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case162() {
    String[] board = { "97" };
    assertEquals(97, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case163() {
    String[] board = { "17" };
    assertEquals(17, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case164() {
    String[] board = { "8666", "7620", "8661" };
    assertEquals(24947, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case165() {
    String[] board = { "0403", "0343" };
    assertEquals(746, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case166() {
    String[] board = { "529", "689", "216", "038" };
    assertEquals(18401, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case167() {
    String[] board = { "730", "159", "385", "183" };
    assertEquals(11672, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case168() {
    String[] board = { "30", "31", "95" };
    assertEquals(354, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case169() {
    String[] board = { "32" };
    assertEquals(32, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case170() {
    String[] board = { "9418", "4862" };
    assertEquals(14280, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case171() {
    String[] board = { "5", "4" };
    assertEquals(54, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case172() {
    String[] board = { "8", "7" };
    assertEquals(87, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case173() {
    String[] board = { "5", "2" };
    assertEquals(52, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case174() {
    String[] board = { "5372", "3704", "2834", "4080" };
    assertEquals(18582, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case175() {
    String[] board = { "59", "53", "95", "06" };
    assertEquals(14946, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case176() {
    String[] board = { "0212" };
    assertEquals(212, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case177() {
    String[] board = { "4" };
    assertEquals(4, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case178() {
    String[] board = { "68", "14" };
    assertEquals(145, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case179() {
    String[] board = { "9", "6", "8", "9" };
    assertEquals(9689, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case180() {
    String[] board = { "2", "4", "6" };
    assertEquals(246, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case181() {
    String[] board = { "20" };
    assertEquals(20, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case182() {
    String[] board = { "1485", "4766", "2590", "7677" };
    assertEquals(20487, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case183() {
    String[] board = { "4805", "9760" };
    assertEquals(14565, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case184() {
    String[] board = { "07", "64", "83", "28" };
    assertEquals(8120, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case185() {
    String[] board = { "2", "5", "2" };
    assertEquals(252, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case186() {
    String[] board = { "74", "84" };
    assertEquals(158, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case187() {
    String[] board = { "499" };
    assertEquals(499, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case188() {
    String[] board = { "4608", "8295" };
    assertEquals(12903, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case189() {
    String[] board = { "55" };
    assertEquals(55, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case190() {
    String[] board = { "9", "4", "7" };
    assertEquals(947, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case191() {
    String[] board = { "5060", "9149" };
    assertEquals(14209, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case192() {
    String[] board = { "19", "08", "40", "83" };
    assertEquals(10851, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case193() {
    String[] board = { "36", "98", "48", "35" };
    assertEquals(10828, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case194() {
    String[] board = { "794", "708", "850" };
    assertEquals(2352, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case195() {
    String[] board = { "7785", "2218", "2406" };
    assertEquals(12409, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case196() {
    String[] board = { "411", "028", "277", "394" };
    assertEquals(7176, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case197() {
    String[] board = { "6658", "1220" };
    assertEquals(7878, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case198() {
    String[] board = { "3" };
    assertEquals(3, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case199() {
    String[] board = { "4850", "0082", "5473" };
    assertEquals(10405, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case200() {
    String[] board = { "95", "05", "43" };
    assertEquals(1457, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case201() {
    String[] board = { "3572", "9386", "8698" };
    assertEquals(21656, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case202() {
    String[] board = { "71" };
    assertEquals(71, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case203() {
    String[] board = { "14", "98" };
    assertEquals(112, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case204() {
    String[] board = { "3002" };
    assertEquals(3002, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case205() {
    String[] board = { "07", "75" };
    assertEquals(82, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case206() {
    String[] board = { "9281", "3409", "6814" };
    assertEquals(19504, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case207() {
    String[] board = { "88", "96", "68", "27" };
    assertEquals(17649, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case208() {
    String[] board = { "514", "984" };
    assertEquals(1498, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case209() {
    String[] board = { "0022", "0011", "0030", "1000" };
    assertEquals(4240, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case210() {
    String[] board = { "0003", "0012", "2122", "0012" };
    assertEquals(3436, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case211() {
    String[] board = { "0023", "0013", "1231", "3311" };
    assertEquals(5487, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case212() {
    String[] board = { "0031", "0030", "1030", "2000" };
    assertEquals(4360, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case213() {
    String[] board = { "0012", "0013", "1033", "3212" };
    assertEquals(4279, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case214() {
    String[] board = { "0033", "0033", "2003", "1230" };
    assertEquals(6665, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case215() {
    String[] board = { "0021", "0022", "1023", "2013" };
    assertEquals(3484, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case216() {
    String[] board = { "0020", "0020", "0021", "3012" };
    assertEquals(3235, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case217() {
    String[] board = { "0110", "0102", "0001", "2201" };
    assertEquals(2432, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case218() {
    String[] board = { "0003", "1010", "0003", "1321" };
    assertEquals(3264, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case219() {
    String[] board = { "0003", "0113", "3223", "0003" };
    assertEquals(3666, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case220() {
    String[] board = { "0102", "0102", "0022", "3122" };
    assertEquals(3456, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case221() {
    String[] board = { "0003", "1011", "1122", "1013" };
    assertEquals(3437, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case222() {
    String[] board = { "0001", "0002", "1231", "1111" };
    assertEquals(2354, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case223() {
    String[] board = { "0003", "0210", "0021", "3300" };
    assertEquals(3633, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case224() {
    String[] board = { "0020", "0001", "1003", "1010" };
    assertEquals(2151, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case225() {
    String[] board = { "0003", "0020", "3023", "0320" };
    assertEquals(3375, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case226() {
    String[] board = { "0032", "0032", "0100", "2120" };
    assertEquals(5524, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case227() {
    String[] board = { "8" };
    assertEquals(8, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case228() {
    String[] board = { "009", "219", "219" };
    assertEquals(1041, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case229() {
    String[] board = { "0009", "1111", "4111", "1111" };
    assertEquals(9744, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case230() {
    String[] board = { "0001", "0001", "0001", "1111" };
    assertEquals(1222, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case231() {
    String[] board = { "001", "000", "000", "990" };
    assertEquals(1099, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case232() {
    String[] board = { "123", "312" };
    assertEquals(435, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case233() {
    String[] board = { "0009", "0008", "0009", "0199" };
    assertEquals(9918, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case234() {
    String[] board = { "0099", "0090", "0000", "9010" };
    assertEquals(18991, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case235() {
    String[] board = { "3003", "2004", "1112", "0340" };
    assertEquals(6675, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case236() {
    String[] board = { "1000", "0001", "0000" };
    assertEquals(1010, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case237() {
    String[] board = { "9026", "0018", "9978", "0999" };
    assertEquals(20021, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case238() {
    String[] board = { "0088", "0000", "0000", "9000" };
    assertEquals(16090, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case239() {
    String[] board = { "001", "010", "111", "100" };
    assertEquals(1131, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case240() {
    String[] board = { "0009", "0009", "1234", "0000" };
    assertEquals(10063, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case241() {
    String[] board = { "001", "000", "001", "110" };
    assertEquals(1021, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case242() {
    String[] board = { "0009", "2112", "2114", "2112" };
    assertEquals(9875, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case243() {
    String[] board = { "009", "009", "999" };
    assertEquals(1098, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case244() {
    String[] board = { "001", "000", "000", "661" };
    assertEquals(1067, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case245() {
    String[] board = { "1000", "0099", "0000", "1100" };
    assertEquals(2811, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case246() {
    String[] board = { "0001", "0001", "0001" };
    assertEquals(111, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case247() {
    String[] board = { "001", "000", "100" };
    assertEquals(110, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case248() {
    String[] board = { "0009", "0000", "0000", "0990" };
    assertEquals(9099, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case249() {
    String[] board = { "0009", "0000", "0000", "9990" };
    assertEquals(10890, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case250() {
    String[] board = { "9308", "4076", "9490", "5561" };
    assertEquals(28435, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case251() {
    String[] board = { "0009", "0000", "2000", "2000" };
    assertEquals(9400, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case252() {
    String[] board = { "1000", "0099", "0000" };
    assertEquals(1180, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case253() {
    String[] board = { "009", "009", "789" };
    assertEquals(1077, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case254() {
    String[] board = { "0020", "0001", "0213", "0821" };
    assertEquals(2171, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case255() {
    String[] board = { "012", "009" };
    assertEquals(39, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case256() {
    String[] board = { "9000", "0001", "0001" };
    assertEquals(9011, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case257() {
    String[] board = { "0007", "0001", "0006", "9150" };
    assertEquals(9866, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case258() {
    String[] board = { "0001", "0003", "0004", "0220" };
    assertEquals(1362, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case259() {
    String[] board = { "0009", "0009", "0009", "0999" };
    assertEquals(10098, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case260() {
    String[] board = { "009", "009", "009", "999" };
    assertEquals(10098, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case261() {
    String[] board = { "0009", "0009", "0009", "0119" };
    assertEquals(10010, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case262() {
    String[] board = { "0020", "0010", "0000", "2000" };
    assertEquals(2210, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case263() {
    String[] board = { "0001", "0001", "0110" };
    assertEquals(121, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case264() {
    String[] board = { "0001", "0000", "9000", "0000" };
    assertEquals(9010, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case265() {
    String[] board = { "001", "001", "999" };
    assertEquals(1010, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case266() {
    String[] board = { "0001", "0000", "0000", "9999" };
    assertEquals(10099, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case267() {
    String[] board = { "0009", "0000", "0000", "1000" };
    assertEquals(9100, cutthenumbers.maximumSum(board));
  }

  @Test
  public void case268() {
    String[] board = { "0001", "0000", "0000", "1000" };
    assertEquals(1100, cutthenumbers.maximumSum(board));
  }

}
