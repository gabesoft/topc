package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PowerPlantsTest {
  PowerPlants powerplants = new PowerPlants();

  @Test
  public void case1() {
    String[] connectionCost = { "024", "203", "430" };
    String plantList = "YNN";
    int numPlants = 3;
    assertEquals(5, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case2() {
    String[] connectionCost = { "0AB", "A0C", "CD0" };
    String plantList = "YNN";
    int numPlants = 3;
    assertEquals(21, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case3() {
    String[] connectionCost = { "1ABCD", "35HF8", "FDM31", "AME93", "01390" };
    String plantList = "NYNNN";
    int numPlants = 5;
    assertEquals(14, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case4() {
    String[] connectionCost = { "012", "123", "234" };
    String plantList = "NNY";
    int numPlants = 2;
    assertEquals(2, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case5() {
    String[] connectionCost = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    String plantList = "NNNNYNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(150, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case6() {
    String[] connectionCost = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    String plantList = "NNNNYNNNNNNNNNNN";
    int numPlants = 10;
    assertEquals(90, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case7() {
    String[] connectionCost = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    String plantList = "NNNNYNNNNNNNNNNN";
    int numPlants = 3;
    assertEquals(20, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case8() {
    String[] connectionCost = { "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA", "ZZZZZAAAAAAAAAAA" };
    String plantList = "NNNNNNNNNNYNNNNY";
    int numPlants = 7;
    assertEquals(35, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case9() {
    String[] connectionCost = { "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "00000ZZZZZZZZZZZ", "ZZZZZBACBACBADDD", "ZZZZZBACBACBADDD", "ZZZZZBACBACBADDD", "ZZZZZBACBACBADDD", "ZZZZZBACBACBADZZ", "ZZZZZBACBACBADZZ", "ZZZZZBACBACBADZZ", "ZZZZZBACBACBADZZ", "DDDDDDDDDDD11111", "DDDDDDDDDDD11111", "DDDDDDDDDDD11111", "DDDDDDDDDDD11111" };
    String plantList = "NNNNNNNYNNNNNNNN";
    int numPlants = 6;
    assertEquals(14, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case10() {
    String[] connectionCost = { "1309328", "DS2389U", "92EJFAN", "928FJNS", "FJS0DJF", "9FWJW0E", "23JFNFS" };
    String plantList = "YYNYYNY";
    int numPlants = 4;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case11() {
    String[] connectionCost = { "123", "456", "789" };
    String plantList = "YYN";
    int numPlants = 2;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case12() {
    String[] connectionCost = { "28FJ0J203", "20JF230J0", "S09JFWEFF", "29FHSOFND", "0JWEEWFJN", "SJ09WEFIW", "SODIFNNWE", "DNLKSNWE9", "AWNE23NSS" };
    String plantList = "YNNNNNNNN";
    int numPlants = 7;
    assertEquals(6, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case13() {
    String[] connectionCost = { "5" };
    String plantList = "Y";
    int numPlants = 1;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case14() {
    String[] connectionCost = { "Y4", "HS" };
    String plantList = "YY";
    int numPlants = 1;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case15() {
    String[] connectionCost = { "KHT", "PFP", "N7Q" };
    String plantList = "NYN";
    int numPlants = 3;
    assertEquals(48, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case16() {
    String[] connectionCost = { "E94Y", "XWQN", "BIBI", "X4ZJ" };
    String plantList = "NYNN";
    int numPlants = 3;
    assertEquals(37, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case17() {
    String[] connectionCost = { "LXKL7", "TSNWA", "XL7BL", "PM4BE", "60A4E" };
    String plantList = "NNNNY";
    int numPlants = 3;
    assertEquals(4, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case18() {
    String[] connectionCost = { "XYEUXL", "K9N0A0", "WYWZSO", "32JTAQ", "UXH9BV", "UOU92T" };
    String plantList = "YNNNNY";
    int numPlants = 4;
    assertEquals(11, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case19() {
    String[] connectionCost = { "TLLOA6H", "OZZ3MZS", "QYLGYA3", "N7XDBXF", "5HP2TCE", "Y2YX80B", "6ZMNCHK" };
    String plantList = "NNNNNNY";
    int numPlants = 2;
    assertEquals(6, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case20() {
    String[] connectionCost = { "E4O9OFC4", "1IHJU2O8", "JZKPOJN9", "ITPAHKZR", "8TVKARWS", "CTDER1XF", "V3AZW0UU", "OW2H5Q1D" };
    String plantList = "YYNNNNNN";
    int numPlants = 7;
    assertEquals(12, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case21() {
    String[] connectionCost = { "ZFS4R2683", "O2AQBTPIC", "CTUQ3DBT0", "SHZK8QFD5", "09XR7Y1QP", "GYXX48TUH", "HW9S057EP", "P8DOA9B37", "4J1DDUPDB" };
    String plantList = "NNNNNNNYY";
    int numPlants = 7;
    assertEquals(7, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case22() {
    String[] connectionCost = { "W7QNTJ91C8", "WTT0PAUAD4", "CQ11R2DQKN", "CF98IQTLAX", "AE8EV5UBEP", "HMQCUQ0ZPQ", "Z1U5PEZ4KH", "6KHVEVZXVG", "7KTX709H9Z", "WYE2WGZ8LE" };
    String plantList = "NNNNNNNNNY";
    int numPlants = 10;
    assertEquals(36, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case23() {
    String[] connectionCost = { "WEVOB18MEMJ", "2YLJWAON4SF", "SIA5MB0NJ60", "XYM9VL2XVDW", "78QMF8TD7H4", "GAGQMVR3NLS", "IKKJ87E5C1M", "ADBTCUVZGPK", "XWHJ1QO0XO1", "O7CJSOAVD0W", "6XU1XF1L8QP" };
    String plantList = "NNYNNNNNNNN";
    int numPlants = 11;
    assertEquals(17, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case24() {
    String[] connectionCost = { "BT6KYUG15WBF", "ZB7NOVER2UVP", "F35HE62DVIAV", "LPQH2CDO1E05", "CD9JF2EZPCQO", "B01WPBK2Y9SW", "NTZOSTALXYPL", "I3SCQBBW9SDR", "DFGOLH01JNLT", "SLE9TJ75GCLS", "R64JGVUIMNFO", "ZHJINAVLOWIN" };
    String plantList = "NNNYNYNNNNNN";
    int numPlants = 4;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case25() {
    String[] connectionCost = { "C4J8HNHKEU5YN", "HTWL0PKM6PR0S", "8VMRL3NZ85BLS", "F30R1H39142WK", "HU28Y6TRAOSV0", "BZ6TIPXSGFB1Y", "CFQ2V1F5DS8B0", "EBLEKOGEQ1L49", "Y47X5GCHYICSW", "MYNRFEL9VLAYU", "AYLLWO4QLIV2N", "040511G4K6A2Z", "50N4FHYXD0M92" };
    String plantList = "YNNNNNNYNNNNN";
    int numPlants = 11;
    assertEquals(10, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case26() {
    String[] connectionCost = { "8X529EYT2X6GPZ", "D3XPXMC3KXF336", "F8K2ATA46S7VP7", "NAEXW1O4XD0HMV", "FSKA0VDERT7H3K", "HS5U6XD6K09RG3", "G9H6CS6AZXK8Y9", "YXG53ATO1LAJRI", "SUMB7944QUPGCE", "H8SA1KW3WJIN2Q", "4B8XRMZIUJQASA", "TQYUW51RAERU2O", "K6RS0M0J3ERG1Q", "PGRW2L5AD4W4RY" };
    String plantList = "NNYNNYNNYNNNNN";
    int numPlants = 12;
    assertEquals(14, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case27() {
    String[] connectionCost = { "17R8M65W9IDWL96", "RI5T29SDI946CJ5", "JLHWTV8YC4LT8DW", "MCUSCLOER7VXLVL", "PPGMVHCM9I9O3X1", "LW4Y3OMYIUVM86B", "F4AWYVW6O1MNDX9", "RIUZYX483086R0N", "0FNAK2ZM5MUGRG7", "KSERHVER0ZKFIMG", "47YOEX46LLFAHO0", "VC7GNEV58JBW14L", "Y9J11U0NYXWETXX", "Z1TMKK6P2THUI0D", "U35VVZ9NIQU66JE" };
    String plantList = "NNNNNNNYYNYNNYN";
    int numPlants = 15;
    assertEquals(16, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case28() {
    String[] connectionCost = { "PU95YUMIXZWZADVT", "ZQIL8AK08D8Y7A7T", "4EKCTWEK0J8V8O5N", "1JL98CCJFUDBKIIT", "NW670SNZPNU41SRC", "U4XDP4DR0YDEFBP1", "X052SQU6Z6TFT00C", "8VKXZYRCE6BBX42N", "F0O05M9ISGNW7C0I", "WN44PEUPIDV69TVO", "GIQ721635X7EGXJC", "DX0GBDQGFVXUGZ6K", "U5LD06NPGALJNL1C", "OKJJEAZZ6C55TT9E", "IUS3FXQNPITL5227", "04NAMM1VR9ZLMV7G" };
    String plantList = "NNNNNYNNYNYNNNNN";
    int numPlants = 16;
    assertEquals(15, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case29() {
    String[] connectionCost = { "M1MQDLM9LA34JS", "LC53OQBKDUHZEM", "2B6M1WX3BQE9S7", "EA1ZWGB1DYHXYL", "BKWODZFMUSYFRX", "UQV6WH8Y0Y14OP", "98ED0NDNL3POOK", "KZDU83OCAEA0XE", "W5SJJLKX0MM3L3", "FXBQ8UTLKTX1W8", "9B6P5H2OR3PEBN", "IHOY1GFKQ479NU", "GT97CLWYNF11T4", "4VD4I8SDCHKRDP" };
    String plantList = "NYYNNYNYNNNNNN";
    int numPlants = 13;
    assertEquals(14, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case30() {
    String[] connectionCost = { "L6ISY3D4KO0OMN", "DUTW4IPTEMPLAZ", "L14PBUQDR4G5WB", "O2QSNYDYZD1TQ9", "SIHZYHCBV4L3UT", "FGWLD6IYVMV2CC", "5GP5B8PPSAPTI0", "Y9WX9KSWECJO0C", "8ZC7KYKBMD69UG", "0FMPYF27RQO6GP", "U7FQMEYV6FIYIE", "NSA398OWDQQCS1", "SK74PJZ82S72ZV", "0VPF1PFMV0596L" };
    String plantList = "NNNNNNNNNNNYNN";
    int numPlants = 8;
    assertEquals(6, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case31() {
    String[] connectionCost = { "7TEKCCJ9", "577FR82O", "GFTY5JU1", "7AP458PJ", "UQF7Z86N", "9OK60DGG", "UOP51LIJ", "6SIS0IT8" };
    String plantList = "NYNNNNNN";
    int numPlants = 2;
    assertEquals(2, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case32() {
    String[] connectionCost = { "R7VCL0", "Z80552", "YN6SHY", "LRC5AT", "GT21AH", "Q871JO" };
    String plantList = "NNYNNY";
    int numPlants = 3;
    assertEquals(1, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case33() {
    String[] connectionCost = { "SYZSLGCHE22USOQH", "MM4GTXU62192ELRC", "M3WPZX0HMOTJNTPL", "N1G8PPRMJ13YC5FD", "WIJQ6AFBTA0AEMXS", "P649ESAKARGIUI0D", "FNJL7IC7BG5WPL9C", "ZAA35JRGOWSG7D95", "BBW41HJCZ32HRI0V", "Q44UDXEPCI39WP51", "793XLV071AUSWBWU", "28SP7EJKVKUAPEY1", "3MUEZD3H2HWFQY0D", "MJ12QAYXSZJSHC7X", "LOERQYCS6PY06ESB", "UW6B7U7G01NUSKG5" };
    String plantList = "NNNYNNYYNNNNNNYN";
    int numPlants = 8;
    assertEquals(2, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case34() {
    String[] connectionCost = { "1HM9", "NHR8", "IIRP", "XODD" };
    String plantList = "YNNY";
    int numPlants = 2;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case35() {
    String[] connectionCost = { "3892J2FJ0", "98JF92JF9", "F0JF092JF", "0392JFNAJ", "9FJ093J39", "W0NWFWE09", "09J20JF2N", "232ON4NIN", "143097490" };
    String plantList = "YYYYYYYYY";
    int numPlants = 9;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case36() {
    String[] connectionCost = { "RM", "9L" };
    String plantList = "NY";
    int numPlants = 2;
    assertEquals(9, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case37() {
    String[] connectionCost = { "ZZZZZZZZZZZZZZZZ", "YYYYYYYYYYYYYYYY", "XXXXXXXXXXXXXXXX", "WWWWWWWWWWWWWWWW", "UUUUUUUUUUUUUUUU", "SSSSSSSSSSSSSSSS", "QQQQQQQQQQQQQQQQ", "PPPPPPPPPPPPPPPP", "OOOOOOOOOOOOOOOO", "MMMMMMMMMMMMMMMM", "LLLLLLLLLLLLLLLL", "KKKKKKKKKKKKKKKK", "JJJJJJJJJJJJJJJJ", "IIIIIIIIIIIIIIII", "HHHHHHHHHHHHHHHH", "GGGGGGGGGGGGGGGG" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 2;
    assertEquals(35, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case38() {
    String[] connectionCost = { "01", "20" };
    String plantList = "YN";
    int numPlants = 2;
    assertEquals(1, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case39() {
    String[] connectionCost = { "011", "202", "330" };
    String plantList = "NNY";
    int numPlants = 2;
    assertEquals(3, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case40() {
    String[] connectionCost = { "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ" };
    String plantList = "NNNNNNNNNNNNNNNY";
    int numPlants = 16;
    assertEquals(525, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case41() {
    String[] connectionCost = { "ZZZZZYZZ", "ZZZZZYZZ", "ZZZZZZZZ", "ZZZZZZZZ", "ZZZZZZZZ", "ZZZZZZZZ", "ZZZZZZZZ", "ZZZZZZZZ" };
    String plantList = "NNNNNNYN";
    int numPlants = 7;
    assertEquals(209, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case42() {
    String[] connectionCost = { "ZZAAZZZ", "RRRRRZR", "GOJIMZQ", "ZNVZOZP", "POJPOZU", "Z0Z00Z0", "ZZZZZZZ" };
    String plantList = "YNNNNNN";
    int numPlants = 4;
    assertEquals(35, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case43() {
    String[] connectionCost = { "1ABCD", "35HF8", "FDM31", "AME93", "01390" };
    String plantList = "NYNNN";
    int numPlants = 5;
    assertEquals(14, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case44() {
    String[] connectionCost = { "0AB", "A0C", "CD0" };
    String plantList = "YNN";
    int numPlants = 3;
    assertEquals(21, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case45() {
    String[] connectionCost = { "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ" };
    String plantList = "NNNYNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(525, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case46() {
    String[] connectionCost = { "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZ333ZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFKKKZZZZZZ", "0ABCCCCZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ", "0ABCDEFZZZZZZZZZ" };
    String plantList = "NNNNNYNNNYNNNNNN";
    int numPlants = 16;
    assertEquals(258, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case47() {
    String[] connectionCost = { "4WKNS01AWMNWY7FI", "BWUVLWPYPSVC5C27", "N4OWJU23CNS5QVLM", "YHD8LQJGGEYGUQC4", "G1YJ147X3KPSC6TL", "TV9B14IHJVGRRB3B", "3CP7JLJMJS851OJY", "LUL8BAH5HAJJVDMH", "PKANXGG3VEMONHXI", "KWE272JSSLGTOLLC", "37IWL7A1H7XRI3FN", "8O4NVXHGY68TTGMJ", "7P7HSACNPXMGN7DR", "RQBNTO7R0T3K2XKQ", "BXPIBJ9MW49HSEH7", "3P3M89H208S4CXWD" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(33, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case48() {
    String[] connectionCost = { "1ABCE", "Q5HF8", "F1M3F", "AMED3", "01390" };
    String plantList = "NYNYN";
    int numPlants = 4;
    assertEquals(3, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case49() {
    String[] connectionCost = { "024", "203", "430" };
    String plantList = "YNN";
    int numPlants = 3;
    assertEquals(5, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case50() {
    String[] connectionCost = { "046PDKSUIPUAGFC6", "D05TAC4TQ3QE7W2P", "940FXK7UMAT5USJD", "G4Q06VZMOILB8JY5", "86VR0BRYDVJ3Y1C6", "UBTZ70VWC1DYNOO7", "4TBSQS0RG7AHXJL7", "DDDXI4C0RMIUA2UT", "IO1SSOBK0QOJYZEC", "S77GWV2HQ0544AQ2", "LSTTD427JJ02RR8A", "D766XOBFB2M0ER19", "MAGVDO2EP9FS09RT", "F9URV7D5ISK470GI", "BCESCS9RWDG7PF0H", "GP2MM7X2CYRLW3M0" };
    String plantList = "NNNNYNNNNNNNYNNY";
    int numPlants = 15;
    assertEquals(34, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case51() {
    String[] connectionCost = { "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(15, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case52() {
    String[] connectionCost = { "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ" };
    String plantList = "NNNNNNNNNNNNNNNY";
    int numPlants = 16;
    assertEquals(525, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case53() {
    String[] connectionCost = { "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG", "123456789ABCDEFG" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(135, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case54() {
    String[] connectionCost = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(150, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case55() {
    String[] connectionCost = { "0ABCDEABCDE", "A0BCDEABCDE", "AB0CDEABCDE", "ABC0DEABCDE", "ABCD0EABCDE", "ABCDE0ABCDE", "ABCDEA0BCDE", "ABCDEAB0CDE", "ABCDEABC0DE", "ABCDEABCD0E", "ABCDEABCDE0" };
    String plantList = "NNNNNNYNNNN";
    int numPlants = 11;
    assertEquals(116, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case56() {
    String[] connectionCost = { "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890", "ABCDEF1234567890" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(110, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case57() {
    String[] connectionCost = { "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF" };
    String plantList = "NYNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(119, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case58() {
    String[] connectionCost = { "0996743796449420", "3019830466581936", "5000815977758154", "0690145561276406", "8894079663528737", "2879207624889083", "1182490377200774", "6235127030618205", "9269668400938415", "5792974630147815", "9763757629068432", "9515103753005539", "2040695654000973", "8850086044265003", "6242077250670802", "1989937989057480" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(4, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case59() {
    String[] connectionCost = { "0999999999999999", "9099999999999999", "9909999999999999", "9990999999999999", "9999099999999999", "9999909999999999", "9999990999999999", "9999999099999999", "9999999909999999", "9999999990999999", "9999999999099999", "9999999999909999", "9999999999990999", "9999999999999099", "9999999999999909", "9999999999999990" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(135, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case60() {
    String[] connectionCost = { "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000", "0000000000000000" };
    String plantList = "NNYNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case61() {
    String[] connectionCost = { "65GY5YQHAMV3KTSS", "4EW7O348SECMFJ1I", "J1W07HGAHQ30BXDN", "WVX9AYPHGIEGO42A", "OH9HL1WIEKKNQ3I1", "JQ1C5CCFSJPBHEBR", "LKII5IIA296URUI8", "BH24GQGUKJG0L4MK", "R7EDG8R5VPEF58U4", "TBKAC2P5VCDDTD4T", "3X885NFAROC8JE63", "69NKVGW7CI09QIV7", "S90COLBCYLT5JU83", "V68RYEXHUFELW6DU", "MBE0H4GI4RA3ODWJ", "RKPNHJXWSACBR81J" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(38, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case62() {
    String[] connectionCost = { "011", "101", "110" };
    String plantList = "YYN";
    int numPlants = 3;
    assertEquals(1, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case63() {
    String[] connectionCost = { "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 14;
    assertEquals(455, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case64() {
    String[] connectionCost = { "0CCIBHDIJ2GGDCEE", "J0CH9ABDEBE2JEBB", "HD0BE79IFAIDGGIA", "DAG0EFDAFIHEGGCC", "AHCB0I9IBJDBGEAC", "EGCCA0IJFGGDG8JG", "BCFAAI0EEBEFGGCF", "GAFADD20CAIJIF2D", "IBHDCD0H0AF0GECG", "E0HEBHGDA0GBBJDH", "JFHJJJCIEE0HBCHA", "HGJBDBHBF6J08ADB", "HGDGCIHCFADD0JAD", "GJCIDCEAABCCD0HA", "BAFE1JIF9FEIBC0C", "ADEBHAIHFB0EHAH0" };
    String plantList = "YNNNNNNNNNNNNNYN";
    int numPlants = 14;
    assertEquals(57, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case65() {
    String[] connectionCost = { "0A", "A0" };
    String plantList = "YY";
    int numPlants = 2;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case66() {
    String[] connectionCost = { "Z3Z3Z", "ZZ2ZZ", "ZZZZZ", "ZZZZ1", "ZZZZZ" };
    String plantList = "YNNNN";
    int numPlants = 3;
    assertEquals(4, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case67() {
    String[] connectionCost = { "0111111111111111", "1011111111111111", "1101111111111111", "1110111111111111", "1111011111111111", "1111101111111111", "1111110111111111", "1111111011111111", "1111111101111111", "1111111110111111", "1111111111011111", "1111111111101111", "1111111111110111", "1111111111111011", "1111111111111101", "1111111111111110" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(15, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case68() {
    String[] connectionCost = { "01", "10" };
    String plantList = "YN";
    int numPlants = 1;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case69() {
    String[] connectionCost = { "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567", "89ABCDEF01234567" };
    String plantList = "NNNNNNNNNNYNNNNN";
    int numPlants = 16;
    assertEquals(118, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case70() {
    String[] connectionCost = { "F0FFFFFFFFFFFFFF", "FF0FFFFFFFFFFFFF", "FFF0FFFFFFFFFFFF", "FFFF0FFFFFFFFFFF", "FFFFF0FFFFFFFFFF", "FFFFFF0FFFFFFFFF", "FFFFFFF0FFFFFFFF", "FFFFFFFF0FFFFFFF", "FFFFFFFFF0FFFFFF", "FFFFFFFFFF0FFFFF", "FFFFFFFFFFF0FFFF", "FFFFFFFFFFFF0FFF", "FFFFFFFFFFFFF0FF", "FFFFFFFFFFFFFF0F", "FFFFFFFFFFFFFFF0", "FFFFFFFFFFFFFFFF" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case71() {
    String[] connectionCost = { "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF", "0123456789ABCDEF" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(120, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case72() {
    String[] connectionCost = { "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ", "ZZZZZZZZZZZZZZZZ" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(525, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case73() {
    String[] connectionCost = { "130932813093280F", "DS2389U928FJNS6F", "92EJFANFJS0DJF3F", "928FJNS928FJNS2F", "FJS0DJF9FWJW0ERF", "9FWJW0E928FJNS6F", "DS2389U928FJNS6F", "92EJFANFJS0DJF3F", "928FJNS928FJNS2F", "FJS0DJF9FWJW0ERF", "9FWJW0E928FJNS6F", "DS2389U928FJNS6F", "92EJFANFJS0DJF3F", "928FJNS928FJNS2F", "FJS0DJF9FWJW0ERF", "23JFNFS23JFNFSEF" };
    String plantList = "NNNNNNYNNNNNNNNN";
    int numPlants = 16;
    assertEquals(36, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case74() {
    String[] connectionCost = { "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111", "1111111111111111" };
    String plantList = "NNNNNNYNNNNNNNNN";
    int numPlants = 16;
    assertEquals(15, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case75() {
    String[] connectionCost = { "02Y", "Z0Z", "Z10" };
    String plantList = "YNN";
    int numPlants = 3;
    assertEquals(35, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case76() {
    String[] connectionCost = { "047", "904", "900" };
    String plantList = "YNN";
    int numPlants = 3;
    assertEquals(7, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case77() {
    String[] connectionCost = { "PHQGHUMEAYLNLFDX", "FIRCVSCXGGBWKFNQ", "DUXWFNFOZVSRTKJP", "REPGGXRPNRVYSTMW", "CYSYYCQPEVIKEFFM", "ZNIMKKASVWSRENZK", "YCXFXTLSGYPSFADP", "OOEFXZBCOEJUVPVA", "BOYGPOEYLFPBNPLJ", "VRVIPYAMYEHWQNQR", "QPMXUJJLOOVAOWUX", "WHMSNCBXCOKSFZKV", "ATXDKNLYJYHFIXJS", "WNKKUFNUXXZRZBMN", "MGQOOKETLYHNKOAU", "GZQRCDDIUTEIOJWA" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(178, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case78() {
    String[] connectionCost = { "11", "11" };
    String plantList = "YY";
    int numPlants = 1;
    assertEquals(0, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case79() {
    String[] connectionCost = { "0ZZZZZZZZZZZZZZZ", "90ZZZZZZZZZZZZZZ", "990ZZZZZZZZZZZZZ", "9990ZZZZZZZZZZZZ", "99990ZZZZZZZZZZZ", "999990ZZZZZZZZZZ", "9999990ZZZZZZZZZ", "99999990ZZZZZZZZ", "999999990ZZZZZZZ", "9999999990ZZZZZZ", "99999999990ZZZZZ", "999999999990ZZZZ", "9999999999990ZZZ", "99999999999990ZZ", "999999999999990Z", "9999999999999990" };
    String plantList = "YNNNNNNNNNNNNNNN";
    int numPlants = 16;
    assertEquals(161, powerplants.minCost(connectionCost, plantList, numPlants));
  }

  @Test
  public void case80() {
    String[] connectionCost = { "0ZZZZZZZZZZZZZZZ", "Z0ZZZZZZZZZZZZZZ", "ZZ0ZZZZZZZZZZZZZ", "ZZZ0ZZZZZZZZZZZZ", "ZZZZ0ZZZZZZZZZZZ", "ZZZZZ0ZZZZZZZZZZ", "ZZZZZZ0ZZZZZZZZZ", "ZZZZZZZ0ZZZZZZZZ", "ZZZZZ1ZZ0ZZZZZZZ", "ZZZZ1ZZZZ0ZZZZZZ", "ZZZ1ZZZZZZ0ZZZZZ", "ZZ1ZZZZZZZZ0ZZZZ", "Z1ZZZZZZZZZZ0ZZZ", "1ZZZZZZZZZZZZ0ZZ", "555555555555550Z", "AAAAAAAAAAAAAAA0" };
    String plantList = "NNNNNNNNNNNNNNNY";
    int numPlants = 14;
    assertEquals(46, powerplants.minCost(connectionCost, plantList, numPlants));
  }

}
