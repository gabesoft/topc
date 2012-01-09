package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MarbleMachineTest {
  MarbleMachine marblemachine = new MarbleMachine();

  @Test
  public void case1() {
    String[] layout = { "0101", "1010", "0101" };
    String[] actions = { "4", "5353" };
    int t = 5;
    assertEquals(21L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case2() {
    String[] layout = { "011112" };
    String[] actions = { "1E", "E", "0" };
    int t = 1000;
    assertEquals(498L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case3() {
    String[] layout = { "01", "32" };
    String[] actions = { "1E", "SSDSS", "W", "00000W" };
    int t = 23;
    assertEquals(3L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case4() {
    String[] layout = { "0101" };
    String[] actions = { "4", "5353" };
    int t = 5;
    assertEquals(21L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case5() {
    String[] layout = { "102" };
    String[] actions = { "1E1W", "D", "0" };
    int t = 20;
    assertEquals(5L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case6() {
    String[] layout = { "40001", "03222" };
    String[] actions = { "EEE", "SS", "W", "NNNND", "11E" };
    int t = 2000;
    assertEquals(4L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case7() {
    String[] layout = { "51111112", "11111122", "41111222", "44112222", "44403222", "44433322", "44333332", "43333333" };
    String[] actions = { "000000", "00000E", "00000S", "00000W", "00000N", "10000E" };
    int t = 390;
    assertEquals(3L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case8() {
    String[] layout = { "51111112", "11111122", "41111222", "44112222", "44403222", "44433322", "44333332", "43333333" };
    String[] actions = { "000000", "00000E", "00000S", "00000W", "00000N", "10000E" };
    int t = 38400000;
    assertEquals(6399938L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case9() {
    String[] layout = { "51111112", "11111122", "41111222", "44112222", "44403222", "44433322", "44333332", "43333333" };
    String[] actions = { "000000", "00000E", "00000S", "00000W", "00000N", "99999E" };
    int t = 38399999;
    assertEquals(287997165L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case10() {
    String[] layout = { "51111112", "11111122", "41111222", "44112222", "44403222", "44433322", "44333332", "43333333" };
    String[] actions = { "000000", "00000E", "00000S", "00000W", "00000N", "10000E" };
    int t = 389;
    assertEquals(2L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case11() {
    String[] layout = { "30000001", "03333330", "06222240", "07219240", "06281240", "06222240", "05555540", "20000004" };
    String[] actions = { "0", "1ESENW", "S2WEE", "WE3NS", "N4SW", "DWE6SN", "N5SWW", "ESW7W", "N8S", "9NEW" };
    int t = 6000005;
    assertEquals(37399929L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case12() {
    String[] layout = { "30000001", "03333330", "06222240", "07219240", "06281240", "06222240", "05555540", "20000004" };
    String[] actions = { "1", "DW6WN", "N5SDW", "ESN7W", "3WSENW", "S2WEE", "WE3NS", "N4SS", "E8SW", "9NW" };
    int t = 100000000;
    assertEquals(403333321L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case13() {
    String[] layout = { "12000000", "71120120", "13020320", "00011320", "00000020", "06544440", "00000000", "00000000" };
    String[] actions = { "D", "EEE", "SSS", "NNNNN", "W", "DWD", "0", "1N2S" };
    int t = 60;
    assertEquals(9L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case14() {
    String[] layout = { "75633808", "87049849", "19458165", "36633886", "92725170", "61183034", "39432264", "59384396" };
    String[] actions = { "11SS", "564N", "76W", "7N9W0", "N2DS", "3SS", "628E", "9S1N", "31NN6", "NS" };
    int t = 987273;
    assertEquals(25685297L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case15() {
    String[] layout = { "43973731", "03832533", "05296793", "51641963", "15210359", "54887735", "47245854", "31526495" };
    String[] actions = { "S99", "SEE", "WW4S", "EE2N", "8S6", "S83", "WN14", "718D3", "0DW", "SNS" };
    int t = 77738377;
    assertEquals(285040712L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case16() {
    String[] layout = { "27768282", "91184511", "20756257", "74971670", "44916312", "14955244", "35156974", "71775223" };
    String[] actions = { "NWW0E", "S21", "93", "WN6", "526", "E", "N", "E1", "16NE", "DWE4" };
    int t = 100000000;
    assertEquals(799999998L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case17() {
    String[] layout = { "83879245", "42661168", "64258455", "44747523", "13638382", "31546031", "38685629", "36687783" };
    String[] actions = { "0N5WD", "EWN", "E8N", "S75", "3S", "N", "6S", "0S", "N0", "72" };
    int t = 6000;
    assertEquals(42997L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case18() {
    String[] layout = { "78415614", "54932535", "43164594", "64111183", "10785851", "63374429", "14657130", "89329244" };
    String[] actions = { "8W1N", "W9N8", "WE0", "EN", "18", "W76", "4W0W", "EW16", "W0S", "038" };
    int t = 606060;
    assertEquals(10151433L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case19() {
    String[] layout = { "39165948", "81658417", "77582739", "74161731", "65689217", "56833932", "22254372", "73093744" };
    String[] actions = { "SS", "0E", "W7D", "45", "5E6", "9N", "6", "DNN", "N4", "1ED" };
    int t = 2520;
    assertEquals(40721L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case20() {
    String[] layout = { "57398512", "59081678", "48293136", "29249548", "72278643", "82762987", "15178505", "69336456" };
    String[] actions = { "5W85", "3", "DWS6", "W5SW", "9N3", "NE", "D", "109EW", "S0E", "918" };
    int t = 2521;
    assertEquals(44696L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case21() {
    String[] layout = { "62798913", "73998929", "18795925", "46037121", "82885731", "32436485", "54673983", "95295083" };
    String[] actions = { "D4N5", "0EES", "N056", "96", "87WN", "64WEE", "WNS", "70E8", "S5", "DS" };
    int t = 4000;
    assertEquals(70914L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case22() {
    String[] layout = { "00", "01" };
    String[] actions = { "0", "1" };
    int t = 6065;
    assertEquals(6065L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case23() {
    String[] layout = { "00", "00" };
    String[] actions = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    int t = 99886772;
    assertEquals(0L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case24() {
    String[] layout = { "0", "0", "0", "0", "0", "0", "0", "0" };
    String[] actions = { "1S" };
    int t = 18;
    assertEquals(7L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case25() {
    String[] layout = { "0", "0", "0", "0", "0", "0", "0", "0" };
    String[] actions = { "1S" };
    int t = 19;
    assertEquals(8L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case26() {
    String[] layout = { "0", "0", "0", "0", "0", "0", "0", "0" };
    String[] actions = { "1S" };
    int t = 99778991;
    assertEquals(8L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case27() {
    String[] layout = { "01", "01", "01", "21", "01", "01", "01" };
    String[] actions = { "0", "NNNSSS", "1E11E", "D0WN", "W0NDE4" };
    int t = 1001003;
    assertEquals(200202L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case28() {
    String[] layout = { "012345" };
    String[] actions = { "1", "01", "001", "0001", "00001", "000001" };
    int t = 60;
    assertEquals(60L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case29() {
    String[] layout = { "012345" };
    String[] actions = { "1", "02", "003", "0004", "00005", "000006" };
    int t = 99999959;
    assertEquals(99999959L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case30() {
    String[] layout = { "01", "32" };
    String[] actions = { "1E", "S", "W", "00000W" };
    int t = 66666623;
    assertEquals(3L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case31() {
    String[] layout = { "00000001", "00000001", "00000001", "00000001", "00000001", "00000002" };
    String[] actions = { "99999E", "99999S", "999999" };
    int t = 6;
    assertEquals(144L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case32() {
    String[] layout = { "00000001", "00000001", "00000001", "00000001", "00000001", "00000001", "00000001", "00000002" };
    String[] actions = { "99999E", "99999S", "999999" };
    int t = 99999996;
    assertEquals(48149980749L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case33() {
    String[] layout = { "01111111", "22222222", "22222222", "22222222", "22222222", "22222222", "22222222", "22222222" };
    String[] actions = { "9", "9W", "9S" };
    int t = 100000000;
    assertEquals(4049999811L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case34() {
    String[] layout = { "13983779", "56620380", "91254988", "20656288", "43363525", "67824559", "93351733", "15817451" };
    String[] actions = { "5EE8", "7", "37S", "S4", "85N5S", "D", "5DD1", "7E9N8S", "5E0", "9" };
    int t = 100000000;
    assertEquals(2184999955L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case35() {
    String[] layout = { "01", "32" };
    String[] actions = { "1E", "SSDSS", "W", "00000W" };
    int t = 100000000;
    assertEquals(3L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case36() {
    String[] layout = { "055556", "189996", "289996", "389996", "487777" };
    String[] actions = { "1E", "2E1E", "3EE4", "9EEEE1", "E5E6E", "E", "S", "W", "N", "1D" };
    int t = 100000000;
    assertEquals(63750000L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case37() {
    String[] layout = { "01111112", "23333333", "11111112", "23333333", "11111112", "23333333", "11111112", "43333333" };
    String[] actions = { "0000E1", "E0EW0W", "N0NSS0", "0EW0WE", "0000E0" };
    int t = 100000000;
    assertEquals(16666666L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case38() {
    String[] layout = { "12311114", "12311114", "12311114", "12311114", "12311114", "12311114", "12311114", "12311110" };
    String[] actions = { "9", "99999E", "9999E", "999E", "99999S" };
    int t = 100000000;
    assertEquals(47309982228L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case39() {
    String[] layout = { "011112" };
    String[] actions = { "1E", "E", "0" };
    int t = 100000000;
    assertEquals(49999998L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case40() {
    String[] layout = { "01111112", "01111112", "01111112", "01111112", "01111112", "01111112", "01111112", "01111112" };
    String[] actions = { "1E", "E", "0" };
    int t = 100000000;
    assertEquals(49999997L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case41() {
    String[] layout = { "0001", "3001", "3001", "3222" };
    String[] actions = { "1EEE", "1SSS", "1WWW", "1NNN" };
    int t = 100000000;
    assertEquals(37500000L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case42() {
    String[] layout = { "10000002", "10000002", "10000002", "10000002", "10000002", "10000002", "10000002", "10000003" };
    String[] actions = { "E", "9E", "S", "9" };
    int t = 100000000;
    assertEquals(4499999640L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case43() {
    String[] layout = { "01010101", "10101010", "01010101", "01010101", "10101010", "01010201", "10101010", "01010101" };
    String[] actions = { "4NWD", "5353S", "9" };
    int t = 100000000;
    assertEquals(1299999980L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case44() {
    String[] layout = { "0101", "1010", "0101" };
    String[] actions = { "4", "5353" };
    int t = 31231231;
    assertEquals(124924925L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case45() {
    String[] layout = { "01234567", "80124567", "11124567", "11124567", "89014567", "88884567", "99012367", "90123407" };
    String[] actions = { "1E", "SSDSS", "W", "00W", "98SS65", "923D3", "9NNN1", "8S1", "7E374", "45456" };
    int t = 98765431;
    assertEquals(888888860L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case46() {
    String[] layout = { "01234567", "90123456", "89012345", "78901234", "67890123", "56789012", "45678901", "34567890" };
    String[] actions = { "9E9E9E", "9W9W9W", "9S9S9S", "9N9N9", "9E9E9E", "9W9W9W", "9S9S9S", "9N9N9", "9E9E9E", "9W9W9W" };
    int t = 100000000;
    assertEquals(945000000L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case47() {
    String[] layout = { "01234568", "76503210", "56549214", "26563210", "76043212", "46529910", "70343210", "16749610" };
    String[] actions = { "99WWN9", "77", "WWN99", "999999", "NWSE", "E", "000123", "887EE9", "9", "WWN9N" };
    int t = 100000000;
    assertEquals(1799999937L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case48() {
    String[] layout = { "00100010", "00010000", "10000100", "00100001", "00010000", "00001000", "01000100", "00010010" };
    String[] actions = { "95S9WD", "8E7N9" };
    int t = 100000000;
    assertEquals(141L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case49() {
    String[] layout = { "00000001", "00000001", "00000001", "00020001", "00000001", "00000001", "00000001", "00000002" };
    String[] actions = { "9E", "0000S", "0" };
    int t = 100000000;
    assertEquals(23399995284L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case50() {
    String[] layout = { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000" };
    String[] actions = { "9" };
    int t = 100000000;
    assertEquals(900000000L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case51() {
    String[] layout = { "01" };
    String[] actions = { "1E", "0E" };
    int t = 100000;
    assertEquals(1L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case52() {
    String[] layout = { "035872", "179234", "235872", "239583", "238957", "328953", "238957", "892370" };
    String[] actions = { "DNEWE5", "23NEE7", "SSWW39", "927NE", "23", "3253NE", "237", "3256NE", "235WN", "4" };
    int t = 99999999;
    assertEquals(2026666513L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case53() {
    String[] layout = { "01111111", "04444442", "04444442", "04444442", "04444442", "04444442", "04444442", "33333332" };
    String[] actions = { "9E99E9", "8S98S", "9W", "8N99", "5NESW8" };
    int t = 98765443;
    assertEquals(2423045223L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case54() {
    String[] layout = { "0" };
    String[] actions = { "D7" };
    int t = 100000000;
    assertEquals(7L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case55() {
    String[] layout = { "0101", "1010", "0101" };
    String[] actions = { "4", "5353" };
    int t = 100000000;
    assertEquals(400000000L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case56() {
    String[] layout = { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000" };
    String[] actions = { "999999" };
    int t = 100000000;
    assertEquals(900000000L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case57() {
    String[] layout = { "21212121", "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "42020203" };
    String[] actions = { "8N", "8S", "8E", "8", "9N" };
    int t = 100000000;
    assertEquals(26049984314L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case58() {
    String[] layout = { "011111", "000003", "004003", "000003", "222223" };
    String[] actions = { "SSSSS", "WW", "EEE", "NNNN", "12N39W" };
    int t = 100000000;
    assertEquals(83333340L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case59() {
    String[] layout = { "01234567", "98765432", "01234567", "98765432", "01234567", "98765432", "01234567", "98765432" };
    String[] actions = { "978", "47W", "9E8", "6DE", "9", "87N", "978", "9EE", "97S", "97E" };
    int t = 99999998;
    assertEquals(2233333212L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case60() {
    String[] layout = { "012345", "543210", "010203", "302020", "102020", "120203" };
    String[] actions = { "423315", "ENNS12", "ENS2", "999", "9999", "119SEW", "WN90", "00" };
    int t = 100000000;
    assertEquals(974999997L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case61() {
    String[] layout = { "00200", "00200", "11533", "00400", "00400" };
    String[] actions = { "9N9E9S", "9E", "9S", "9W", "9N", "9" };
    int t = 100000000;
    assertEquals(8099999748L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case62() {
    String[] layout = { "4000001", "3222222" };
    String[] actions = { "E", "S", "W", "N", "1E" };
    int t = 100000000;
    assertEquals(7142858L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case63() {
    String[] layout = { "0" };
    String[] actions = { "D1" };
    int t = 5040;
    assertEquals(1L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case64() {
    String[] layout = { "01" };
    String[] actions = { "1E", "E" };
    int t = 80640;
    assertEquals(1L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case65() {
    String[] layout = { "00000001", "00000001", "00000001", "00000001", "00000001", "00000001", "00000001", "22222223" };
    String[] actions = { "99999W", "99999S", "99999W", "9999" };
    int t = 99999999;
    assertEquals(6149998836L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case66() {
    String[] layout = { "46298429", "53329479", "49219310", "34912321", "42131221", "41234125", "32409401", "21349401" };
    String[] actions = { "E", "D0", "SED", "5321", "9WW78", "040123", "219312", "NSEWSE", "243213", "NEWSSE" };
    int t = 100000000;
    assertEquals(914999969L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case67() {
    String[] layout = { "010101", "010101", "212102", "324324", "010101" };
    String[] actions = { "1EE3W", "2E", "3W4", "4NE2", "2" };
    int t = 100000000;
    assertEquals(796666630L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case68() {
    String[] layout = { "0111" };
    String[] actions = { "1E", "E" };
    int t = 72000;
    assertEquals(1L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case69() {
    String[] layout = { "29298511", "70673258", "59922002", "63633048", "32740689", "41912685", "77960880", "91136945" };
    String[] actions = { "SWSDWS", "EDDDSD", "DDEWWS", "ESDEWS", "EWSWWW", "WESSWD", "EENEDS", "SWDWSE", "DWSNEN", "DWEWDS" };
    int t = 100000000;
    assertEquals(0L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case70() {
    String[] layout = { "0" };
    String[] actions = { "12345" };
    int t = 37;
    assertEquals(108L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case71() {
    String[] layout = { "40000001", "31222222", "30001000", "32222000" };
    String[] actions = { "E", "S", "W", "N", "1E" };
    int t = 100000000;
    assertEquals(3846154L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case72() {
    String[] layout = { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000001" };
    String[] actions = { "9D", "9D" };
    int t = 100000000;
    assertEquals(0L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case73() {
    String[] layout = { "67293572", "02959182", "59591914", "19293911", "90123456", "19201001", "11929317", "95919291" };
    String[] actions = { "987651", "S1ENW9", "451W2", "91WN99", "765432", "582858", "NEWSD9", "85818", "9", "9591EW" };
    int t = 100000000;
    assertEquals(1599999927L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case74() {
    String[] layout = { "32321", "32312", "13434" };
    String[] actions = { "ED987W", "3D40SN", "12D", "18DES", "E", "0", "1234", "WWWEEE", "EWS", "3477" };
    int t = 100000000;
    assertEquals(4L, marblemachine.maxMarbles(layout, actions, t));
  }

  @Test
  public void case75() {
    String[] layout = { "40000001", "31222222", "30001005", "32222006", "40000031", "31222222", "30000001", "32222222" };
    String[] actions = { "E", "S", "W", "N", "1E", "10000E", "SSSSSN" };
    int t = 100000000;
    assertEquals(3846154L, marblemachine.maxMarbles(layout, actions, t));
  }

}
