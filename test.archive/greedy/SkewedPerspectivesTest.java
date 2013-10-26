package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class SkewedPerspectivesTest {
  SkewedPerspectives skewedperspectives = new SkewedPerspectives();

  @Test
  public void case1() {
    int[] cubes = { 1, 1, 1 };
    int B = 1;
    int w = 2;
    String[] views = { "012", "012bb", "bb0", "21bb", "21b", "1bb20" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case2() {
    int[] cubes = { 0, 1, 0 };
    int B = 3;
    int w = 2;
    String[] views = { "b", "bb", "bbb", "bbbb", "bbbbb", "bbbbbb", "1", "1b", "1bb", "1bbb", "1bbbb", "1bbbbb", "1bbbbbb", "b1", "b1b", "b1bb", "b1bbb", "b1bbbb", "b1bbbbb", "bb1", "bb1b", "bb1bb", "bb1bbb", "bb1bbbb", "bbb1", "bbb1b", "bbb1bb", "bbb1bbb", "bbbb1", "bbbb1b", "bbbb1bb", "bbbbb1", "bbbbb1b", "bbbbbb1" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case3() {
    int[] cubes = { 100, 0, 0 };
    int B = 20;
    int w = 3;
    String[] views = { "00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000b00000000000000", "0000000000000000000000000000000000000000000000000b", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb0000000000000" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case4() {
    int[] cubes = { 5, 6, 3 };
    int B = 0;
    int w = 1;
    String[] views = { "00000111111222", "0000111111222", "0000011111222", "000001111111222", "0000011111122", "b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case5() {
    int[] cubes = { 100, 100, 100 };
    int B = 100;
    int w = 50;
    String[] views = { "2", "bb1b012012012012012012012", "bb1b012012012012012012012b", "bb1b012012012b012b012b012012b", "bb1b0b1b2b0b1b2b0b1b2bb012b012b012012b", "b1b0b1b2b0b1b2b0b1b2bb012b012b012012b", "bbb1b012012012012012012012" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case6() {
    int[] cubes = { 0, 0, 0 };
    int B = 0;
    int w = 1;
    String[] views = { "0", "bb" };
    assertArrayEquals(new String[] { "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case7() {
    int[] cubes = { 91, 30, 85 };
    int B = 84;
    int w = 26;
    String[] views = { "012210020b2b0bb2222bb222", "2022bb2200b20220bb2bb222", "2120bb0bb0020bbbb02bb0bb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case8() {
    int[] cubes = { 78, 22, 24 };
    int B = 84;
    int w = 49;
    String[] views = { "10b0b00bbbbb", "1b0b0000bbbbbb", "2b1bb000bb0bbbb0", "22000b0b0000", "00bbbb0bbbbb0", "bbbb00bb00bbb", "1000b0bbbbbbb", "000bbb00b00bbbb", "000b00b0bbbbbb", "2b00b0bb0bb00bb", "00000bb0b00bbbbbbb", "00b0bb0bbbbb", "00000bb0bbb0", "010bb0bbbbbbb", "bb00bb00bbbbb", "0b2bb0bbbbbbb", "bbb00bbbbbbbbbb", "110bbb00bbbb", "2b0bbb0bbb0bb0", "1b20b0bbbbb", "0bb0b0bbbbb0000b", "2000b1bbbb00bb", "10b0000b00bbb", "0000bb0bb0bb", "200bbbbb000b", "02b00b0bb0bbb", "000b00bb000b", "00bb000b0bbbbb0", "010bbbb0b00bbb", "0bbb0bb0b0000", "2bbbbbbbb00bbbb", "000bbbb0bbbbbbb", "0b0200bbbb0bbbb0", "0b0000b0b0b000", "2b0bbbbbbbbb", "000bbbb0bbbb", "1000bb0bbbbb", "2bb0b0bbbbbbb", "00bbb0bbb0bbb", "000b0bbbbbbbb", "0b0b0b0bbb0b0b0", "01bbb0bbb0b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case9() {
    int[] cubes = { 28, 36, 35 };
    int B = 5;
    int w = 25;
    String[] views = { "211211121", "012101201", "2212111000", "10210012", "201112200", "11011212", "120201212", "0211122", "01212211012", "22211200", "022001200", "01121211", "110201221", "2022111112", "1212101", "2001111220", "02011001", "112222021", "2221112212", "10111101", "11200111122", "12111022", "1101211111", "12022022", "1221110", "001211111", "200001202", "00100001", "211101111" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case10() {
    int[] cubes = { 14, 44, 38 };
    int B = 14;
    int w = 4;
    String[] views = { "10102bb110112212112221212212211212122", "012bb202bb112211212122b122122122112", "201bb0bb200012122122212112121112121112111", "bb12bbbbbb2bb100222221111111111111", "20211121022bb121222111121111111212121", "000210111bb1bbbb11222211111222211122111", "bb110bb1210bb121111222111221122221122", "bb20101bb0122120211222121111111111", "22002121211bb1121121222211221b12212111112", "bbbb22bb1122022221222111121211bb21121112112212221", "bbbb1bb1122002011212121122121122122222", "20012212112111122222212111222212121122", "20bb1bb221211111222221121211221212", "1122220220000121bb2bb12222111111111", "2102bb22101bbbb12222221111111111", "10201200bb11212211112111211121111111111", "1212bb1211212222122222222212212112111111122122", "bb20bb1bbbb20222112122221111121111", "1100121022bb01bb11111112221121111", "11bb212020bb02112122221222111121", "1211bb2bb01222202111122122212221222111", "0110bb101111bb2bb1111211122112111", "21210bb1211111bb11212222111111112211", "21bb010200202bb1211121221121112111122211211", "bb1220bb210bbbb2122221112122111112112111", "0bb0101bb1121221211121112221122221122", "2bb121022021bb022111211111112121112112", "20bb102212111111221112121112112112222", "1101bbbb1220122102012112121112212121", "020211002122022222112111112111112121", "bb0111bb01002bb222111211121121211121", "210010bbbb21222111111111111112111111111", "2010201012221121212212112122111111111", "010bb000121bb22121222221221211111", "bbbb0bb10bb2bb22121211111111112111", "20bb10bb012211212121122222222222112122", "212211021220bb12112211222111111221111", "222bbbb1bb0bb21100022221111112112121", "2021012bbbb2bb12212111112222121122211", "2121bb10bbbb1122122121221112221222221121121", "211bb11bb010bb21202111122211121112122", "2bb02011bb0122bb01bb12112121221122" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case11() {
    int[] cubes = { 59, 84, 15 };
    int B = 60;
    int w = 44;
    String[] views = { "1b11bb1b11111", "11bbb111100bbbb", "0101001b00b11", "101101111111", "bb011001110bbb", "b11bbb10b11", "11111bb111001", "b111bb1111111b11111", "111011bb1110", "11111001bb111", "111011101b11", "00b101b10011bb1", "0101b111b01bbb1", "1b10110111001", "1b111111b112b", "1111100bb110111", "11b111111b100", "bbbbbb0bbb1111", "20111b0bb101b11", "1111111b011", "110111b11011111" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case12() {
    int[] cubes = { 93, 44, 50 };
    int B = 20;
    int w = 32;
    String[] views = { "00000000020101", "002000002002020", "0000001000000000", "10100000000000", "10020b001011000", "022000000020200", "221200000000", "bb200000000000", "110000000000000000", "100010022000000", "020000200000100", "0000020000000", "100000000001000", "0200200200002", "010002201000", "000000000102000", "211000000100", "0000002002000", "200002000000", "2022000020b2100", "2001000100000", "20002000001000", "0102000000000000", "bb100000000110", "0100000000000100", "1012000000010", "00000002020100", "00000210000010", "0020000000000", "102000020200", "000001100020", "20000000000022", "002000010000", "000000000200010", "120201002000", "1200100200", "00210000000000", "00000110000100", "11000000001202100" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case13() {
    int[] cubes = { 55, 56, 42 };
    int B = 18;
    int w = 41;
    String[] views = { "11211010011", "0020101000", "012000111", "210011112", "021b10000", "012012110120", "2101110110", "221010001000", "02100111211", "121111001", "11120222", "001010121111", "1b01200100101", "0201012200", "110220121021", "120020121", "102221120", "1001000110", "1211011021", "1011212001", "010101121", "0100010020", "210102211001", "022111011110", "12011111221", "0b00111121", "001122010010", "11111210011", "011220200", "1111101220", "20011100111", "00120210", "2002102200", "1001100100", "010021001021", "1011110100" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case14() {
    int[] cubes = { 34, 35, 26 };
    int B = 94;
    int w = 38;
    String[] views = { "221bbb1bbbbbbbbbb", "bb11bb1bbbbbbbbb", "b0b2bbbbbbbb12b", "bbbbbb1bbbbbbbbbb", "b10b0bbbbbbbbb", "11b0bbbbbbbbbbbbbbbbbb", "b1bbb2bbbb2bbbbbb", "bbb1bbbb0bbb0bb", "0010b2bbbbbbb", "bbbbb2bbbb1bbbb", "2b2bbbbbbbbbb2", "011b0bbbbbbbbb", "b1bb0bbb2bbbbbbb", "bbbbbbbb21b2bbbb", "20b20bbbbbbbbbbb", "bb0bbbbb0b0b1bb", "bbbbbb1bbbbbbbbb", "22bbbbbbbbbbbbb", "210bbbbbbbbbbbbbbb", "1b00bbbbbbbbbbbb", "0010bbbbbbbbbb", "bbbbbb0bbbbbbb1bb", "00bbbbbbb1bbbbbb", "bbbbbbbbbbbbbb", "011111bbbbbbbbbbbb", "021bb2bbbbbbbbbb", "12bb1bbb10bbbbbbbb", "bbbb0bbbbbbbbb", "b0bbbbb0bbbbbb2bb1", "0bbbbbbbbbbbb1", "bb0bbb0bbbbbbbbbbb", "bbbbbbbbbbbb0bb", "21bbbbbbbbbbbbb", "221b1bbbbbbbbbbbbbb", "10201bbbbbbbbbbbbbbb", "bb0bbbbb1bb0bbb", "bb1bbbbb0bbbbbb", "2bb211bbbbbbbbbbb", "bb0bbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case15() {
    int[] cubes = { 42, 80, 77 };
    int B = 62;
    int w = 33;
    String[] views = { "b021102021112b1111", "1221111b21122211b1", "011120212220121111", "1bb2bb112bbb22b2b2b21b2", "b12222122b1221121b", "021b222b2b2b12b2b1112", "210121211b1012111", "222121b12b1b1b12202", "b211122212110b1122", "21121211111b12211", "b2112b012221111112111", "b20b21211221211b10011", "21121b122012202222", "21112222112012211211", "1bb1b1b2b21202b21b2b", "221022b112b111211111", "222122022212b11211", "002101211212121211", "122bb122b222212112", "1bb1112b1121b1b2bb21", "10020121222211b212", "22b212b1211b1b2122b2", "bb212121b212bb2", "21211102212b2211221", "20022022b22222bb22", "b2111111212b121221bb", "2111012b0b112bb111b", "2011122111b1111b1" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case16() {
    int[] cubes = { 92, 50, 84 };
    int B = 56;
    int w = 13;
    String[] views = { "1bb12200bb000200022200220202000200", "0bb1bb21222001200bbbb2002000200", "12202122bb1bb12bb00b22010200020", "202b000000002000202b20bb22102000022b221", "212111021202020002202000202220b0022022020", "1120bb10022bb0bb220020000222020220000", "bb202112002000002222020222222000022022", "bbbb1200002bb12202222020220202222", "112b00bb2bb222b0bb02b0bb2022b20", "2bb21000211020022020220222220020020", "10202b220b00220b22200220b2220222000220", "20bb1001100bbbb00bb020200200222b2000", "20101202bb02011122000200bb000200bb0bb220000", "20bb02bbbbbb0200000222220202100022220", "021bb2221200000002000000000000222000000", "20b0202b1b0b0b012b00b000b02002200bb0", "20b02b0bbb1202b222b2202202b22b22b00", "2000b02222002b02202200bb0bb21bb01020", "0b21002000121b00201222000bb00020022210", "b200002bb0b01020b0020b220020b200201b", "2b22122000222b21b220102022222b20bb12", "2002022bbbb10022220020002000000", "20bb12122222bb0002002000020000000002" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case17() {
    int[] cubes = { 10, 11, 7 };
    int B = 78;
    int w = 9;
    String[] views = { "bb110bbbbbbbbbbbbbbbbbbbbbbbb", "bb1bb2bbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbb2b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case18() {
    int[] cubes = { 68, 12, 60 };
    int B = 66;
    int w = 8;
    String[] views = { "1011222bb222202220200000bb0bbbbbbb0b0000bb0bb0", "bbb000000b2bbbbbbbbb0b2020bb0002bb000bb0b2b", "00b200b0200bbb022b0b00202bb2bbb0b020bbb0b", "0112bb1022bb2200bbb002bbbb222bb2bbb200202020bbbb2", "2020bbb202b02bb0b22b2bb0000b0220bbb22b2bb0", "b0200001b010bb000020bb0b0bb2b00b10b22b0b0" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case19() {
    int[] cubes = { 28, 18, 42 };
    int B = 32;
    int w = 35;
    String[] views = { "02bb2b2b2", "22bb22b222", "222b22222b", "b22b22bb2b", "2b22b2bb2b", "2122b2b02b2" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case20() {
    int[] cubes = { 62, 1, 37 };
    int B = 89;
    int w = 33;
    String[] views = { "bb2b0202bb0bbbbbbb", "20bbbbbb2bb0b0", "0000bbbbbbbbbbbbbb", "220bbbbb0b0bbbb0b", "bbb0bb0b0bb0bb0bb", "02bbbbb0bb0bbbb", "200bb0bbbbbbb0bb", "022bbbbbb0bbbbbb", "0bb02bbbb2b0bbbbb0", "b000bbb0bbbbbb0b", "0b0b0bbbb22b0bb", "bbbbb0bbbbb00bbbb0b2bbbb", "0022b00b000b00", "220bbbb0bbbbbb", "b0bb2bbbbbb2bb2bb", "00200bb2bbbbbb0bbbbb", "b00bbb0bb0220bb", "bb00bbbbbbbbbbbbb", "200bb0bb0bbbb00bbbb", "20bbbbbb0bbbbbbbb", "2bb0bbbbbbbbbbb", "bbbbb0bb0b0b0bb0b", "2bbb0bb0bbbbbb0bbbb", "0bbbb0bb00bbbb2b2", "0200bbbbb0bbbbbb", "0b0bbb0b2bbb0bb0bbbb0", "0bbbbbbbbbbbbbbb00", "2b0bbbb2bb2bbb00" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case21() {
    int[] cubes = { 62, 71, 42 };
    int B = 7;
    int w = 5;
    String[] views = { "1101120b011102012110011012111210011110102b00021", "10122020100100112110001111001011b001bb10000b001", "00bbbb001102101002202111002011011100111111", "010211b01211112100b010200110101000111011210010", "10010bb0222101012211011110111111111111111", "1bb20211010001220020111201001120111111111", "0101221021010000001112120000100110100111110", "000010200112211102110201100101100111011000010101", "1000010211b1211220020021011111201211100100b10010", "0010110010100121b11111211b12001211201000000011", "bb1212112011101012121010000011000100001110000", "b010111101201b11b120221010120102012b1011", "bb12100111210211001210112122100010111001011", "1210022101021011001200011110001001111110111111", "12bb11020211222002121001001011111110111111", "b10112200102111111b010111101101b20b1011201010", "002bb00101122111111212120012011bb211010110010", "01222111000011100000121111120011011111110111111", "21001011011200b12010010210b2110111102b2b2112101201", "0020bb2bb0020020102001001211011010011000111", "10211100112110220211101211121111021201101112012110", "1201001111121110000201100111011211221100", "0101110b01011012010111011b211112102101110100010101", "0111010211021120212011111111210011111101201", "bb22bb00000001211222102011111110111111111111", "02101bb1bb12020022110120011112021110111010001111", "221b21211121011011211112101012210b0121221", "1000021120110202110101100210111111200011210", "0220000111112220120021102110110001111000100", "011000012220011111110001000001000001101010001100", "1020001101221002201020101010200001122000111", "101002110112122002011111011210121221111020011201", "b0111010012100012010011b0121201122120112000111", "102111210202111211112001000011b0b101110010202", "10111b120b21111012111210120112111100100001211", "0020020bb2202001011010011011111100011111011111", "11bb0bb2202112021211202011100111111111001100110111", "02bb1021002001212101101111111111011110111", "012012220211b10100bb111210122110010b111", "bbbb011020021010111210010100110111011101001", "1200b201000101012111001100121b10211110112111201", "02bb2110120112211111110011002000101001111011", "200022101220111112221221000100110101101111011", "b20112000011111110b1211012102010112011001", "020111120011200011010101222101001101011210001", "0012012212001121211121010011100111111111110111111", "102002101001122b00120222121100111101b110111" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case22() {
    int[] cubes = { 25, 91, 11 };
    int B = 94;
    int w = 42;
    String[] views = { "21b1bb11bbb11b", "11bb1b1b1bb11bb1", "1201b1b111111bb1", "11b1bb1bb1b1bbbb", "011b1b1b1b11bbbb", "111b11bb11b1bbb1", "bbb111b11b111b", "011bbbbbbb1bbbbb1bb", "bbbbbbb1bb1111", "b11bbbb1b11bb", "1b11b1bbb1b11bbbbb", "01111111b1bbbbbbbb", "1b11b1bb111bbbbb", "1111bbbb1b11b1bb", "bb1bb11b1b1b1b1", "11bb11b1bb1bbbbb1", "1b11b1bbbbbbb1bb", "11b1bb11bb1111bb1", "1bb10bbb1bbbb", "1b1bbb1bbbbbbbbb", "1bbbbbbb1bb1b", "111b1b11111111b", "bbb1bb1bb1bb111", "211bbbb11b1111", "bbbbb11b1bb1bbb11", "11b1b111bbbbb1bbb", "1bb1bbb1bbbb1bb11", "0b1bbbb111111bbb1bbbb1", "211bb11b1bbbbbbb", "021bbb1b1b11bbb", "b11bbb1b111b1111", "01111bb11b1b1b", "0121bbbbb11b11", "111bbbbb1bb11bbb", "b11bbbbb11bbb11b", "11011b1b11b1111", "b1b11b11bbbbb111bbb", "11b111b11b11b11b1bbb", "001b1b111b1bb1b", "111b11bb1bbbb1b1", "bb1bb1b1bbb1bb1bb", "1b1b11b111bbbb11", "b11bbbbb1bb1bbbbbb", "2101bb111bbb1b0b1", "111b111b1b1b11bb1" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case23() {
    int[] cubes = { 14, 55, 2 };
    int B = 32;
    int w = 24;
    String[] views = { "11b1111b111", "1111111b11b" };
    assertArrayEquals(new String[] { "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case24() {
    int[] cubes = { 73, 53, 37 };
    int B = 78;
    int w = 42;
    String[] views = { "212bbb000b00b10bb0b", "bb00000b0000bbb", "20000bb00b0bbbb", "0bbbb00bbb1bbb10bb", "b01bbb00bbbb0bb", "b00b00b01b1b", "020bbbb0bbb110bb", "01b010bb0bbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case25() {
    int[] cubes = { 16, 39, 31 };
    int B = 38;
    int w = 5;
    String[] views = { "12bbbb011122bb221bbbb221bb1bb1bb1bb111bbbb", "1bb020bb1bbbb111bb2bb12211222bb11b2", "2b1101b12112bb21bb2bb110101b1bbbb0bb", "0111b111b1b012b2b0b0b1bb1bb2bbb1bbbb12bb0bbb", "1bb2111b1bb1bbb11bb2bb2bbb11b12101b01b1b2", "bb22b21b2b021b0b1bbbbbbbbb12b1222bbbbb012", "2bb0022212bb12bbbb11bb1bb11bbbbbbb1bbbbbb111", "10bbbb2001222121bb11bbbb2bb111111bb111", "201bb2bb1bb1210221bbbbbbbb1bbbbbb1bbbb11bbbb", "12bbbb2102bb1bb21212bb11111bb2bb11bbbbbbbbbbbbb", "2b01bbb1b0b011bb2b0b12b111010bbb21bb21", "020120121112222bbbb211bb2bbbbbb1b1bbbbbbbbbb11", "bb12bb221122bb1bb2bb1221bbb1111bb121bb2", "1201bb111bb11bb1bb222bbbbbbbbbbbbbbbbbbbbbbbbb", "2bbb2bb1b12bb0b11b22bb2b10bbb2221b", "22102011110bb22221bb1bbbb11bb1b11bb", "0bb2100121bb021bbbbbb11b2bb1bb1bb11bb1", "bb2bbbb211222bb121212bb1bb2bbbb1bbbbbbbbbb", "bbb21b1bb111b1210bbb2b112bbb0b12bb11122bb1", "220001bb0bb002221bb11211bb1bbbb1b11bb1", "bb011bbbb210bb22122122111bbb1bbb1b221bbbbbbbb", "b011bbb1b1b11b12b111bb1b21b11111bb0bb02bb22b", "102221b0bbb1b21bbb2b1bb21b1b222b1b1b2", "010001bb1211221bb21222bbbb22bbbbbbbbb2", "1b2bb2bb1b2b21bbb2bbb1b1b211b111b1bb21b110", "02bb1221212bb1212bbbb111bbbb11121bb11111", "122121221bb2bb1222221221111bb111111111", "12b1b21b2bb21bb1bb1b02bb1bb01b10101111b", "bb022bb011bb2122211122bb11221b11bb11b11", "220011bb220112bbbb21111111bb111bbbbbbbb", "10020011bb12bb12bb2bb2211bbb111b1bbbbbb", "121bb102121bb2122bbbb222bb2b2bb2b2bbbb", "b2210b11bb01b1bb1b11b2b2b2bb0bb11112b111", "1bb2210bb21120bbbb211bbbbbb1121bb2221bb11b", "1001bb211221bb11bbbb2222bb111bb22bbbb2bb", "0bb2010bb102bb0022bbbb2b21bb1121112bb1121111221", "112210bb200000122bb2bb11bbbb11bbbbbbb", "2122bb21112bb11bb1bbbb22bbbb1bbbb111bb1bb", "111bbb10b2b211b1b011112bb121b22101b2120111" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case26() {
    int[] cubes = { 3, 12, 3 };
    int B = 47;
    int w = 6;
    String[] views = { "bbbb1bbbbbbbbbbbbbbbbbb", "bbbbbb1bbbbbbb0bbbb1bbbb0bbbbb0" };
    assertArrayEquals(new String[] { "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case27() {
    int[] cubes = { 61, 23, 39 };
    int B = 11;
    int w = 4;
    String[] views = { "00bbbb1bb202102020220020022200000000000", "2011bb11bb20221202202200020000200020000000000000", "02b02b2b200b0002100101b000010b02b210120b00", "0200bb210022001002122220220000000000220000000", "bb20220002112021102200000000002000000220000000", "0221200200002101120000001200200000020000", "101bb201122201220121022000000000000000000000", "102202202110110002020000002022000000200000", "01112bb2bb012102210121002000200000000000000", "0000000b0020002011b0100001b022bbb200021010", "100010b20200200000002202220000021000b22200", "0001001bbbb12202220000000220022000000000000", "bb0001000212000000b010000202200000000022000b000020", "22bb12110020200000202000000022000220000000", "200b0200002220000b0bbb1222000202210b100", "02001202000b200b020010b2020002200b210120000100220", "0002221bb11201212022002000000000000000000200000", "1000201112112010220102200000000000000200000000000", "0202bbbb01012221202220200000000000000000000", "b1020020b002120b0b0100b0010020002001121000b" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case28() {
    int[] cubes = { 34, 75, 89 };
    int B = 65;
    int w = 8;
    String[] views = { "01bbbb2bb0bbbb00020bb222122bb211212112121121121", "01bb0bb1bbbb210110210122bbbbbbbb222b1222222bb22222", "bbbb2bb10201212bb121bb1bb22222122112112212121122", "1122012002022bb1bb1222bb212bb1b1bb1112212222222bbb", "2b22222221212222b2122202b2200b101bb222b11122b22102", "bb02bb02bbbbbb2bb2bb21bbbb212112222222222122222222", "bb22b2b1bbbb2b2bb1b11211111b2b21b12101221102111121", "222222222b2122b22211122b122b2022bb01b22b2b11b22122", "bb210bb111bbbb20201bb2112222221212bbb1212222222222", "2bbb2001bbb2bb12b12bb1b121b1bbb1222b1b122102121121", "0bb11bb11022bb2121112211122121222222211122bbb11121" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case29() {
    int[] cubes = { 0, 85, 4 };
    int B = 58;
    int w = 17;
    String[] views = { "11111b111111111b111111111", "bb111bb11111111111111", "b1b1111b111bb11bbbb1", "111111b111111b1111111", "111111111111111b1b11111", "1b1b1b111b1111bb1b1", "11b1111111111111b1", "1211111111112111b1", "b1b11111b1111b111b1111", "2111111b11b11111111111", "11bb1bb111b11111b1", "21bb111b11111111111", "11111bb111111111111", "1bb111111111111111", "111bbbb11bbbb111bb1", "11b11b112111b11bb1111", "b1bbb111111b1b111b111b1bbb", "111111111111b111211b1", "1bb111111111111bb1111111", "1111b11bb11111b11bbbbb1bb1111", "11bb11b11bbb11111", "111b1bbb1bbbbb1b111", "111b11111111bb111b111", "1111111111b1bbb111111", "21bb1bbb1111bb1111", "2111bb1bb111111111111", "bbb111b1b111b1111111b1b1b", "111b1bb1bbbbbb1bbbbbbb", "11bb11bb1b11b11111b", "11b11111bbb1111111111111b11", "bb1bbbb111b11111bb1", "1bb1111111111111111bbb1", "11111bb1111111111bb2b1", "111111111b11111111", "1bbb111111111111111bbbb1bb", "111b1b111b11111b11b", "1111111121111111b11b", "11bbbbb1111b11111bbb1", "111111b1111111b1111", "bb1b11b11bb1111b1111b", "1bb11bb111111111bb1111", "11111b1bb1b11b111111111", "11b1bb11111b1b11b1b" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case30() {
    int[] cubes = { 2, 2, 2 };
    int B = 100;
    int w = 33;
    String[] views = { "2bbbbbbbbbbbbbbb", "0bbbbbbbbbbb", "bbbbbbbbbbbbbbb", "bbbbbbbbbb2bbbbbbb", "bbbbbbbbbbbb2bbbbb", "bbbbbbbbbbbbb", "bbbbbbbbb0bbbbb", "bbbbbbbbbb2bbbbbbbbb", "02bbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb", "0bbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "bb2bbbbbbbbbb", "bbbbbb1bbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbb", "2bbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case31() {
    int[] cubes = { 1, 1, 1 };
    int B = 100;
    int w = 44;
    String[] views = { "2bbbbbbbbbbbbb", "bbbbbbbbbbbbb2", "bbbbbbbbbbbbb", "0bbbbbbbbb", "bbbbbbbbbbb1", "bbbbbbbbbbb2bb", "bbbbb0bbbbbb", "bbbbbbbbb1", "bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbb", "0bbbbbbbbbbbbbbb", "bbbbbbbb", "0bbbbbbbbbbbbb", "bbbbbbb2bbbbbb", "1bbbbbbbbbbb", "bbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case32() {
    int[] cubes = { 2, 1, 1 };
    int B = 100;
    int w = 16;
    String[] views = { "0bbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbb", "bb1bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbb", "bbbbb2bbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbb2b", "bbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb1bbbbbbbbbb", "bbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case33() {
    int[] cubes = { 1, 1, 1 };
    int B = 99;
    int w = 15;
    String[] views = { "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbb0bbbb2bbbbbbb", "bbbbbbbbbbbb2bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbb", "1bbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbb1bbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbb2b", "bbbbbbbbbbbbbbbb0bb", "bbbbbbbbbbbbbbbbbbb2bb", "bbbbbbbbbbbbb0bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "2bbbbbbbbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case34() {
    int[] cubes = { 1, 2, 2 };
    int B = 100;
    int w = 35;
    String[] views = { "2bbbbbbbbbbbbbbb", "2bbbbbbbbbbbbb", "b0bbbbbbbbbbbbbbbbbb", "bbb0bbbbbbbb", "bbbbbbbbbbbbb", "bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbb", "bbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case35() {
    int[] cubes = { 2, 1, 1 };
    int B = 100;
    int w = 49;
    String[] views = { "bbb0bb0bbbbb", "0bbbbbbbbbbb", "2bbbbbbbbbbb", "0bbbbbbbbbbbb", "0bbbbbbbbbbbbb", "bbbbbbbbbbbbb", "0bbbbbbbbb", "bbbbbbbbbb0", "bbbb0bbbbbbb", "bbbbbbbbbbb0bbb", "bbbbbb1bbbbb", "bbbbbbbbbbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbb", "bbbbb0bbb", "bbbbbbbbbbbbbbb", "bbbbbb0bbbbb", "bbb0bbbbbbbb", "1bbbbbbbbbbb", "bbbbbbbbbb", "1bbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case36() {
    int[] cubes = { 1, 1, 1 };
    int B = 100;
    int w = 29;
    String[] views = { "0bbbbbbbbbbbbbbbbb", "2bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb1b", "bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbb", "1bbbbbbbbbbb", "bbbbbbb0bbbbbbbbbbbb", "1bbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case37() {
    int[] cubes = { 2, 1, 2 };
    int B = 99;
    int w = 37;
    String[] views = { "bbbbb0bbbbbbbb", "bbbbbbbbb0bbbb", "bbbb2bbbbbbbbb", "bbbbbbbbb2bb", "0bbbbbbbbbbbb", "0bbbbbbbbbbbbb", "bbbbbbbbbbbbb", "bbb2bbbbbbbb", "bb0bbbbbbbbb", "bbbbbbbbbbbbbbb", "bbbb0bbbbbbb", "bbbbbbbb1bbbbb", "bbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbb", "bbbbb1bbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb", "2bbbbbbbbbbbb", "2bbbbbbbbbbb", "bbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case38() {
    int[] cubes = { 1, 2, 2 };
    int B = 99;
    int w = 46;
    String[] views = { "1bbbbbbbbbbbbb", "0bbbbbbbbbbbbbb", "2bbbbbbbbbbb", "bbbbbbbbbbbbb", "0bbbbbbbbb", "2bbbbbbbbb", "bbbbbbbbbbb0bbb", "bb1bbbbbbbbbb", "b0bbbbbbbbbb", "bbbbbbbbbbbbbb", "bbbbb1bbbbbb", "bbbbbbbbbbbb", "bbbbbbbbbbb", "1bbbbbbbbb", "1bbbbbbbbbbb", "bbbbbbbbbb", "bbbb1bbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case39() {
    int[] cubes = { 1, 2, 1 };
    int B = 100;
    int w = 5;
    String[] views = { "1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbb2bbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bb21bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbb1bbbbbbbb2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbb2bbbbbbbbbbbbbbbbbbbb", "bb2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbb2bbbbbbbbbbbbbbbbbbbbbbbb1bbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbb1bbbbbbbbbbbb0bbbbbbbbbbbbbbbbbbbbb", "b2bbbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbb1bbbbbbbbbb", "2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbb1bbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb1bbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb0bbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb1bbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case40() {
    int[] cubes = { 1, 0, 1 };
    int B = 100;
    int w = 5;
    String[] views = { "20bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb2bbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbb2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bb2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "02bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbb2bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case41() {
    int[] cubes = { 0, 0, 0 };
    int B = 100;
    int w = 5;
    String[] views = { "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case42() {
    int[] cubes = { 1, 1, 0 };
    int B = 100;
    int w = 5;
    String[] views = { "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbb0bbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb0bbbbb1bbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb1bbbbbbbbbbb", "bbbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb0bbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb0bbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case43() {
    int[] cubes = { 0, 1, 0 };
    int B = 100;
    int w = 5;
    String[] views = { "1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbb1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "1bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case44() {
    int[] cubes = { 1, 0, 0 };
    int B = 100;
    int w = 5;
    String[] views = { "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbb0bbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bb0bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case45() {
    int[] cubes = { 100, 99, 85 };
    int B = 91;
    int w = 11;
    String[] views = { "01b2121b2b10222bb0b021b00b0b0000000bb0001110020b00", "0bb0bbbb00bb00bbbb20bb02bb111120002022212222122221", "00b102211011bbb01b2b2110b1b0111001bb110012bb001210", "202112000022bb1102122bbbb021100bbbb1b1bbbbbb11bb01", "11101022bb2001bbbb01212bb02bb111110111000110b11111", "001012b2b110110bbb1010001b01010bb10bbb00220b11b0bb", "0bb0bbbbbbbb0bb00221021bb1221102011b02100bb2011212", "0000b1011200b10201b2bb0bb1bb0b11b2b010102bb002bbbb", "b0bbb1b0b0bb0bb2bb200b00b12bb210110221b12001b001b0", "21110bb2210111bbbb10022010bb00000011101010bb110010", "0b01b122001220b0001101b100b1001b2bb200bb2bb02b1201", "bb010bb1200112110bb1bb0bb010102bb20101211021010101", "201012102000010010bb1022111022101bbbbbbbb11bb11b11", "bbb10112000b02bbb0bbb1bb200b1b020b02b00b0b000021b0", "bb10110b0b0110bb1bbb0bb012112011212b1b122112111b10", "002b0202b00020021b0bb0001001bb210112010010202b2b02", "111100211222bb112012220002222b122021bb22b12bbbb21b", "0bb0bb21110220bb12001101bb020bbbb000bb1111111bb111", "002b20b2b1b0221bb11bbbbbbb11b1b1b110bb0211b1b1211b", "121b11b1b1b2122022001b11bb01b121b0b0001bb211bb02bb", "b1b21b0012b111121b11111b11b10b12b111b1bb100b1b1111", "012b101b1111b111bb21bb002b10b0102221020b0bb0021000", "2bbbb211211022122bb2112bb1201bb1000002111bb0001000", "0112121bb0001201b1100001b101b2010111002111b1011101", "2bbbbbb011220112111210bb2bb2bb102bb100002001000012", "1b1bb11bb12bb0b11b11bb01b1bbb11b2bbb1002121b1202b1", "b2111110111100b01b2101b2bb120bbb1b1210210211111020", "10bb0bb1000b1bbb000b1b0b0112bb02b0020211bb21bbbbbb", "bb121bb100012bb0220111bbbb2bb0100100100010000bb221", "20021220bb0bbbb1bb100110bb000202010001100020000002", "20bb212120bb1210101122211bb0001011100010101100101b", "1222bb120102221bbbb01bbbb000121010bb000bb1bbbbbbbb", "b0b01b110b0b10100121022b02bbb1101bbbb2011111b0bb0b", "bb001bbbb11010222010100200bb1010021000101bb1111b1b", "22bbbb102bb221222211201bb1bb0000000bbbb0bb00001000", "bb11b2b122022b1b00bb12b2111b210bb011b22222bb01b10b", "002b0bbb00b11b0011b10b0b0bb11020120bbb10b1bb0b0b00", "110bbb0011b00002010b1bbbb2001121001b000111b20000bb", "0b110011b10210bbb010b22b2bb21202100bbb0101b11b120", "101002bb211100112bb2bb20020bb00bb1110bb0000bb00bbb", "1122bb0bb02bb02bb001bbbbbbbb10221b12b1112110111110", "222012bbbb1122210102022111bb1bb000000110001100b00b", "211102202b2b01000000b1b0010b10100b0001000102201112", "bbbb211bb20bb21bb1bbbb0102021001001120101111011001", "b01b1100b0200022bbbbbbb202b210b10b2b01201b0b0b10b2", "010000bbb1001bbb0bbb20b220bbb00b0b000b0012b021b020", "22222bbbb122000bbbb220bb0bb000bb1b1b0110001010bbb1", "120121bb11bbb1220b22021b1b01b01100200b20b2b1210011", "0b0bbb01b1bbb0bb22bbb2bbb02b2b200bbb02bbb0b0bbb02b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case46() {
    int[] cubes = { 93, 85, 98 };
    int B = 100;
    int w = 14;
    String[] views = { "211bb02b1010b21022b0bbb0bb1202211b2221201bb0222b10", "b11b22b02bbbb1b2b202222bbb1022b2b221bb1200b222", "22b0b01200b0bbb2b1bbb20b1bb000b20bb012bbb0b22b0bb1", "11022bb2bb2102bb101bb02bbb2bbb2202bbb2b2222", "bbb0222222b202122b20122122202bb2201bb2b2b2220b", "bb1bb2bb2002b12bbb2b2b2b2b1bbbbbbb20bb01b1b2b", "bbbb2b0bbb21bb01b0bbb010b0b10bb00bb1b201bb", "bb120bb1bbb0b1b200bb0bbb020bb20bbbb0bb1bbbb0bb", "b021bb00b010b120010b11b212b2102b20b12bb02b11022b0b", "bbbb12011010220112122bb0bb12bbbbbbbbbb20b000", "00001bb2bb21bb0222110bb22200221022201bbbb0221bb12", "0bb001bb1bb122bb0bbbbbb02bb10b0010000bb010", "01002b011b21b22b011bb0111002bb1b2112b02220220", "0120112bb0bb01b021220bb0b00b221112120b222b1b2b2101", "22212bb21221bb20011bb00b010b00b00bbbb211211bb00", "b2b01112b1b1b02bb101b11b2b1b22b11bb100bb011111b", "bb012bbbb0bb01001bb0bbbbb10b00b0b2b000bbbbb000bb", "122212000bb2200200001100bbbbbbbbbbbbbb00bb00", "00bbbb20b10022bb0bb1b0b0b000b00bbb01110bb101b0100b", "b02b1202b101bb120bb00b0b0b010b0112110100b12101111b", "2b00b002100000bb1bb00bbbbb2b2012b102b20012b22b1", "bb2bb0bb2bb0bb0220bbbb0bb000000002200222100b01bb01", "002020022bb2b02212210b2b200222b0b002bbb1b212222", "b21bb2b0bbb02bbbb2b222bb00bbbbbb0102b2b11bb2bb0b22", "2120010bb0bb01121120102bbbbbbbbbbbbbbbb0bbbb2", "2bb211020202bbbb000b210220bbb0bbb0bbb2000bbbb", "0011001bb2bb1100bbbbbb0bbbb00bbbbbbbbbbbbbb", "20b2111b01b12bbbbb112b12bbb20bb0b2b1bb0b2bb", "12bb1bb00bbbbbb11022112222b02212222222002112122210", "00111220120bbbb2bb0212001bb21200001220222020bb2102", "bbbb20bbbbb011bb0b2bb22bbbbbb01bb1b02b021bbb0bb", "22b112bbb2201b0b2220bb22bbb1b22bb10b11bb202b2b010b", "21bbbb2020bb0112bb1210022022bb12221212021222", "bb2b022102bb0200b2bb12bb200b2bb002222bb122b2bbbb", "0001b10202b02bbbbbb022bb0b2b2221b20222bbbb00bb2b", "10020bb2bbbb10bb221200222bbbbb2bb22b22bbb2222", "02bb102200200bbbb22bb2022bbb22bbb222bbbbb2b", "bb21bb102bb22202bb1222bbbb2bbbb2b221222222b2bbbbbb", "b0222112021220b22b101110bb0bb102bb02b20b102b", "01bb2b20b22b002b202bb001bbb211b002b0b01200200bb1bb", "21bbbbbbbb22202bb0012bb112b2bbbbbbbb22bbbbbbbbb", "0b1211b201b1010112b11020000002b212212b000012b0", "112bb2bb0102bb1212022021111b11110220222212121111", "101202101bb1bb11bb1002bb01122b02b22b101bb2", "bb12bb22b0022bbbb222b2bb22012b02bb022b2bbb0122", "21012bbbb2bb21011bb2021bb22bb10bb22122bbbbbb", "0bb00bb2bbbbb22002b1b00000b02bbbbbb10100bb20b", "bbb0102b12211bb2b221bbbbb2bb0022b2bbbbbbb2bb2b02b", "1020022121210200b2b2012b22b01b221021b2bbb2201", "0b22bb202b1202b020bb2bbbb2b00b0b1bbb1b0b1bb20b" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case47() {
    int[] cubes = { 100, 99, 98 };
    int B = 91;
    int w = 11;
    String[] views = { "121b2210b021100122bb20b10121021100221212211020010b", "2bb0212b22112101222bb2121111b22bb2112b202b22012111", "10bb0001022bb22211bb211122221111000010001001000000", "b20120111b22bb1b1bb2b0000b002b12bb11b2b002b01b0220", "122201bbbb10bbbb12bb12022bb11101001122222211112111", "0112b0b012b1010121b002101b0021b20022021110b0bb0200", "112b2010b1111021100121211b000b1210b11000b01020b21b", "1012000102bb20bb00bb20bb1211021bb0bb10221000001000", "21b1bb0200b20b2001011100b1b20b0101212b1b0bb21b0000", "bb2110bb222110bb1012022021010102222b21b211bbbbbb21", "2bb10101bb120110120022211bb221bbbbbbbbbbbb00bbb001", "bbbb120200212bb112211bb2bb002bb22bb0bb2022bb2bbbbb", "122121bb010bb1222122100bb222bb20000020000000022200", "01b2201bb220b22122b0b222100b222b1221b1121bb21b1202", "bb2bb220bb221012001bb12220210bb0bbbb2120bbbbb02200", "100200102bb002010bb2bbbb22211220200bbbbbbbbbbbbbb2", "0bbbb12011bb1100001021bb2bb01202222020202222222102", "0bb102b01010b1bb000b201bb0012b00b12b020b2bb0000b0b", "12112b1110220122b2122b1b12b2201b00b21020111b101000", "11112221001111bb20112bbbb0bb022210112bbbb0022b2001", "2202101222122020bb202001202bb0102bb02b2bb001010b20", "b1bbb22022b1201b111b122021202b020b012b2112bb1b112b", "120212122b0b201b0b0bb20b1b2021bbb2022100b1bbb10000", "bb10120011221bb1102010bb1212111112112222bb22112222", "21211b220b10bb010b221b212122220bb021201bb202bb1201", "11bb22bbbb1bb0bb10bb20222001220bb00210000212201100", "bb00bb2bb10bb0022bb0bbbb1220bb11111022211111102020", "11011b0b210220b0b02122010000001b1020b2001b12220222", "bb10bb022220bb1200bb0bb11210220bb2002bbbb002202210", "00211bbbb0211bbbb1012bb202100100221110122222122211", "b202b2010b222221210bb21222121211b021212b20b1b12b02", "01b021b11b1121201bbb201b120121bb2b1101b010b1210001", "bb100bb1120000bb20bb2bb01120222b11222222222220b200", "b1110b1bb1b2b22b021bb10b00221b110b01bbb022b2122002", "2021021bb11002202201bb2211122bb1111bb11111111bb111", "21b200b02002bbbbbb2b1b12b2b000bb0000220012b1b00bb", "00b1b201bb2b01b112001100b11bb101b00101112201b1b11b", "0221222bbbb1010bb1002110211111bb011111bbbb111111bb", "2221022b2210000002b21bb111b00011211b0b00b2b1bb120b", "211101bb120bbbbbbbb1212bb00211bbb21100000100000b20", "20012b021202021bb11b12222b222200100021012220120101", "110222b102112020111100bb21b1110002012b2121112011b2", "0012202b20b0010b10021010b12bb1b0b00000b1012b120b0b", "212201022b2102b01211b2b11101b20002100002212011b100", "12122000212b0b211021220b200022200b0110b100b1210221", "020002b022bbbb210bb20b10bbb12bbbbb2b2b11bbbb0bb000", "0211bb212b0122211211bb121221bb01220211b12b2221b002", "0211121222100bb21001bb011bb0100000bbbb2000b00bb210" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case48() {
    int[] cubes = { 86, 91, 98 };
    int B = 91;
    int w = 15;
    String[] views = { "0b0110b01200b011212b11b21b0112121b000b0bb", "0bb1bbbb12122202bb2212b21bbb1bbbbbbbbbbbbbbbb", "b2bb2bb2b1202b2b1bb11b12212bb22b220b01021b0022", "20010bb1001bb110bb222bb00b20b22bbbb2222bbbbbb2bb2", "010bbbbb020b2b121212b220bb0b2bb1bb2bb0b2", "00011bbbb0001200021b21bb12221bb12121bbb", "bb1102bb20bb020012bb2212222bbbbb2b12bb212", "bb2101000202121221bb1bbbb11bb1bb2b2bbbbbb", "0bb1122bb102101bb212211bb21b2b1221222b022", "00211b1b00bb2bbb11bb12b2bb0b2bb21bbb221bb1b20bbbbb", "12210200bb11bb222bb2121212111212111211", "202b22b1bbbb0b1b2bb1b0121b21b012012b20b", "1110bb20bb001bb02022b2b200bb222bb2bb2221122", "bb12bb0222bb011021222221bb221222022022bb212bb12012", "1210201212011202bbbb00b0bbbbbbbbbb010bbbbbbbbb", "2bb22b0b0bb1b20b2020121bb20b2b022b101", "b2b21b102bb1b0212bbbbb2b00121b1b101121110b1bbbb", "bbbbbb1bb22002122112b222111221111211222", "bb2202202102bbbb2102b120210022222022222", "020112001200121220bbbb212bbbbb1bb222bb2bb22b", "0bb200bbbb201001bb0021121212b122bb22111", "222bb200120202010021120001221111201b0011", "020b2022211100b0b11bbb10002b0212002", "002112bb120010bbbbbb2012112222bbb11122bbb", "b022212bbbbb010b02bbb2b01bbb2b22022220220bb1", "10bbbb0bb11bb0200bb11221202212112220002002", "b10b22bb1b10bb012b1b02b00002202b01220bb0b0bbbb020b", "11b12111201b111111bb0b110b11b010212b1b020bb1", "10b00b12b1bb0222b22b2112b21222bb21b01222b2100", "0120bbbb1b21121b111bb00b1bbb1bb22211220b101bb2b22", "bbbb0bb202121b210b1b2bbbbb00bb02211b02200b211bb20b", "b12b001b202b2bb0b2bb22bb222b0b0bb2b01b", "200bb2b20b02b212020020010b02002b2b020b021bb", "212121b12bb1b12b2bb12200b202121b11121bbb0b1b", "122121211bbbb1112121122201120220b0bb0111", "0102bbbb211bb212bb21212bb222bb0200222b222b0010022", "1bb112bb22bbbb121220012bbb2212212111b21bbbb2", "1bb22bbbbb21bbb2b00b0b2b0bb2bb2bb001b0b1", "20b11b1bb01000b2bb121121b2bb11b212b1122b1b2211", "0bbbb11bb12bbbb021bbbb2bb22bbb12211bb1bbb", "2110b1bbb220b1bb2b1211b2b1bbbbb2b11bb0b22b102b2bb", "22111b1b211211211b121222b2b212b11b22b2b1", "1121201222bb201012bb20222b2b1222222bb222", "0202bb2b02b212b1bb1b0000b22b22bb0bb2222b2", "0b2b0210bb2212bbbb22b20022b22b201b1002bbb0b0bb0", "211120bb220bb2021122b2b2121102112b0b0b02010", "1b1b1000101210b22001202001b2b20200120000b1b", "1b02200222b2b0bbb01120bb010b10212120010b", "22bbbb2222bb2b1bb22b11221b2b1b1222b221b", "121002200bb2bb12222bb22212222222b2b221bb2bb1bb222" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case49() {
    int[] cubes = { 93, 91, 93 };
    int B = 96;
    int w = 11;
    String[] views = { "110bb121201002bb012022021022bb10bbbbb0101002101110", "bb22bb0bb00211bb20002012bbbb0121120bb22b02220bbbb0", "102b0220bb1200b12bbbb21110b22b11b022b0b10112012121", "bb0bb002bbbb10bb2222bb010111bbbbbb2022220000202020", "2bb1122222200012bb20110101201bb1101bb11bbbb011bb10", "bbbb210bbbbb12bb0b0bbb20b012202102b11b0bbbb1b1bbbb", "b001bb11012bb1bb220b120b110b00b1b2bbbbbb21b000b0bb", "b0b00221022bbb1bb021111b2110b0b20b0b211b0b1bbbb2bb", "bbb1bb012bb22111b1b10b00bb22b00001b100b0bb20021bb0", "010b0000b0bb202b11bb121121b001001b202b0b02bb1b0002", "1bbb22b22bb210b0001b112b20202bb12b010b2110bb0b0bbb", "1210201bb201bb110bb122122112120000200202022222b212", "0bb02bbbb0bb22bb1bb02220b120bbbbbb200b0b02b0bb0b0b", "b0b020b2020b22022b21bbb0b1102bbb2112212b20bb220220", "0120bb20200bb112110bb1122bb112211bbb2bbbbbbb200bb0", "00202bb200202100001bb1bb02bbbbb222bb22bb21bbb2bbb2", "b2bbbbbb21120b0012b02b201bb22bbb022111b202b211b022", "120122222bb2bb0bb0bbbb1210211220212010011110122111", "bbb0b211bb1bbb0b2b0bb2bb10201bb0bbb0b0bbb2bbb100b0", "112111bb0bb10bb1bb20222bb211bb1bb2bb211b11b1bb111b", "2b1b21b20bb0b10bb0b01121bb1b0bb011bbb10b22b1b1b2b2", "1bb2bb02bb0011bb111112221bb122bb222202022200bb1bb2", "122bb020bb2bb20b01011021102200021000bb01b122b00b2b", "b22bbb22bb1120b221bb210bb11bbb2b101bb22202021b1b11", "2bb00b10211bbb2b220b110b2b0b2bbbbbb1bbbbbbb102bb20", "0101102bb1101101020121bb0bbbbbbbb0bbbb10bbbbbbbbbb", "010bb221b2b001b0002bbb10b012b1211b0021b21200221bb1", "02bb2bb11bb012210002bb002210000112200100211011bb20", "b1b2b0bbbb0b010b10222200102bb0bb1b20001b10b002bb01", "bb0bb12bb2bb122110bb20122bb00bb2022122211bb2120011", "bbbb01bbbb12bb2122002110bb011202bb2bb2222bbb02bbb0", "21bb02012220bb002bbbb12bb12002000bb100200002002100", "1121002b1bbbb2022110b1201bb21b1bb0bbb0012bbb1b22bb", "1bb11221bbbb12bbbb112bbbbbb20bbbb000b00b0bb0bb0000", "200bb1bb10200bbbb1212022bb0bb222022bbbb2bb2b202000", "02bb1bb21bb2011122112bbbb220101bb20222222022202120", "2bb0bb2212bbb0b2100b1b02bb20bb01b0b1bb1b100100bb1b", "bb21bbbb11210bb10bb022110021222bb21bb2222102b20122", "b00b0b11bbb101bbbbbbb2bb1bb211b2bbbb20bb112102b11b", "1201220000bb12112bb1bb10000bb1bb02211bb10b11bbb1bb", "00b1b2220020bb0202b2bb221bbb202b0bbb2bb020b022b120", "122bbbb202101bb021021022000bb0022101bb011001b01bbb", "0bb10b002bb0120b011b1b1b000b0b00bb0010b0bbb22bbb01", "bb02bbbb22120b2bbb21212bb01121bbb1221b2012bb0221b2", "10b20122bb012b12bb00bb1b12bb02bbb1211b2b21bb0b1b1b", "bb2bb000bb0020110020bb2221222bb20bbb20220bb022002", "1222bbbb101bb2bb1001200bb00b00211121b012122000121b", "bb0112bb2201002bbbb220111bbbb1bb122bbbb112bbb11bbb", "bb20000102bb121201bbbbbb1bbbbbbbbb1bbb11bbb1bb11bb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case50() {
    int[] cubes = { 92, 93, 89 };
    int B = 93;
    int w = 11;
    String[] views = { "00bb102b1b0bb21bb2012220bbbb222b2b02bb2b21b010b10b", "b20bb01bb2bb01b222b0b001bb0220b2bbbbb0120b01b0bbb1", "b1b01b2b00b012011002b0b1012b001b000000bbb0011201b0", "0110b202bb21bbb201b1211bb12112bbb10b100bb10000211", "12102112222111bbbb1100101bb0100bbbbbbbb0bb0bbbbbb2", "1bbbb0200002bb101bb00bb01012002111120121111b1121", "00b1001bb2bbbbb0bbbb2b0bb0b1bbbb2b2bbb20bb20bbbb10", "bb11110bbbb110bb00020bb20001bbbb0210011211201bbbbb", "bb1bb2001bb220bb210bbbb02bb12201000bb122b1bb22b122", "112201b10122b121b111010011b01022bb0bb2b000112b221", "b21b121bb1b001211112102b2012201b1222b20b2020120220", "121bbbb200bb01bb110bbbb212bbbb2212bb2201bb222222b2", "201010020002201122b2b102b122bb00212201bb201212b222", "2bb221222b1201112b10b20111b101bb0000b21bb0b2b10012", "012b0bbbb1bb00b1010022bbb2bbbbbbb001bb0b10b1b20000", "2bb2bb1bb21102021bb102111201bb0bb00bbbbbbbbbbbbbb", "b100112101212120b2210011222112bbb1b102212bb21b1110", "01bb10bb10bb111002bb01b01b12122b21211b111b0b121110", "010120100b0101211112bb1100021b021b011b0b1012212b11", "bb11110b020b0b01b1210bbbb0b002012221120b0112211112", "bbbb011111bbbb1bb2bb2bb210bbbb22bbbbbb2bb2bbbbbbbb", "02b102b112121bb221020b0000b022bb0200220bb200202200", "2bb0bb2001bb01101121121000010102bb0bbbb000210000", "b0b00b212bb221bb200b0bb121b1201b1111b011100b202021", "21121bb0bb2b22021000bb221bbb10bbb2b12221b0020bb221", "1bbbb1b20b002b11bb2000b11b111b12b020b10bb1bb11bb10", "bbbb00bb2120bb0bb1001bb2120bb0bb01bb1bbbbb10b21bb0", "bb0102b2bb000b1b0b02b2110b1bbb21bbb0b0b01bbbbbb0b2", "1bb1211bb011100020bb1101bb212b2bbb2bbb10b2bbb2bbbb", "b0211b1bb200b2b2b1b1b21201200022b01011012b21122b02", "2202bb0010bb2201211021bb11bb20200222022b22b2210222", "10022b0110110b012bb11bbb200b0bb12021110001bbb10b11", "bb1002bb0121200021201bbbb01bbbbb21bb1b0bbb202bb201", "2bb2bb0112001bb1102112200bb20202111bb102001100201b", "bbbb2b0121221bb2b011210b221101222bb2b221b22001b200", "11022bb00201bb1bbbbbb0bbbb022bb02bbbb222b2bbb22222", "221bb20bb0bb220112bb0211bbbb0222211002201021120002", "bb00120002bb0020021102201001001b0bbb012111bbbb1100", "1b21111b221bbb2121b102b0b0010101000111212bbb0111bb", "2b112002210b1012b11b0bbb1b10b20bb0b10b1bb0bb0b2021", "b011101bbbb122b0b0b1001101b1bb1b2b12001b222b1201bb", "bb0bb22bb11010bb221bb1121bb212022bb00101011000b111", "200100010bb122bb10122bb220bb00bb1bbbbbb1000bbbbbbb", "1011bb220202021122112121bb201bb0b0bb00020bbb022bb0", "112bbb0b01b220bb10b2200b20bb20b2b00000b010111b01b1", "2bb0022021bb221bbbb0100111021222b102b2022bb121bb02", "000b202b0bbbb22bbb2bbbbb022b1b1b1b012b1b12000bb0b0", "2bb0201bb11bbbb00200210200221bbb011bb11bb1bbbbbbb", "b111b20b0121021212b22110012211bb10b000bb020b0" };
    assertArrayEquals(new String[] { "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case51() {
    int[] cubes = { 94, 94, 99 };
    int B = 94;
    int w = 10;
    String[] views = { "21121220bb01bb100bb021bbbb102bb1102102001101bb10b0", "b2200b2b121bbb0bb2bb22201b021b0bb2bbb01122122b2201", "020220010221210020201bb202bbbb221bbbb1bb1bbbbbbbb1", "bb012bb01bbbb0202220122202121021222022222112111220", "1112bb10bbbb0102bb011200bbbb1121bb2bb0120002222001", "b12b121b1b222b1b2100bbbb1b201b2b1bb2b102bb002bbbb1", "1112102bb01bb211212bb21000bb12bbbb11222b12220001bb", "b201b2b201b1b2201b111012bb2b2212110b222022122bbb1b", "22bb00221bb1202bb0022bbbbbb00211bb121211122212222b", "022b112b022bb000b0bbbbbbb22bb1bbb01b0021110b20211b", "1b2b12b0b11b1bbb21bbb000121b111212bb2b2b0bbb002000", "bb001bbb1bb22bb100bb1bbbbb22bbb2bbb221202022bbb202", "1bb0bb0102bb21122010101020bb0bb0bb0200bb02bb22222b", "b1220b12111b01bb22111020210bbbb101211b1b01221b1112", "2bb2002b2b2b00bbb0012b0b00bbb2bb001bb01b200b0110bb", "00b1212202b210b222b1b0b21bbbbb2b01bb0b1b22bb21b20b", "2200b0b122b2002010b12bb22021bb2b0100b21b01b021b022", "1102bb2122bb0bb0bb11bbbb0110bb02bb22bb020222222001", "0020bbbb022002210200bb00122011000bb212221122222220", "12000bb0121bbbbb1bbb202b1b1b022210b0b02bb2122bbbbb", "111220022210110bb12212bbbbbb0102bb102bbbb0bbbb000b", "b1b201bb02bb02b10b0011b12bb1b0b2bb02010210100b0b11", "21b120112222b2100210b00bbb01201bb1120b2b21bb0b2011", "21200bb1200222000001bb2122bb2110bbbb22bbbbb22222bb", "0bb1bbb2b0220b20b0b21b10b20001b00bb1bb2bb0b020002b", "222102012101bb0bb102bb1bb2bb0202222202222222222220", "2b2010b2210b1bb120002bb101012b022bb001b1b11b02bb0b", "10bbb020bb2b1001b1bbb00b002b0b12122bbbb1bb000b202b", "1b1b20220b2110b2202122221b22222b01b0bb20bb22b21bb2", "b112b2100222bb121b02112221220020b2b21b002b1b02b0b0", "0b122202222bbb12b221b1b2b2021b12bb2022bbb2b2bb11bb", "2b22b2bb002bb022001b0211bb0b202bb22102010bb2b0000b", "1bb02b2b2b0bb10021b2bb1212b1b0b0022b2110b00b2b1001", "102b2020121111b0b12111b1121121b2b2b2120112bbb1222b", "b222b00b2022b0bb2b000010001021000b2b10011102b20110", "2bb10000bb121101202bb12010002bbbb2bb2bbbb02bbbb120", "1200b20b02bb22b10b1100bb20b22bb2b0010b21212bb0210b", "1010001bbbb20bb00021120011bbbb2bb222222bb22bbbbbb2", "0222122100b112b1b22020b2121211b2220b120012102b0b21", "bb1bbbb200000bb202101012bbbb201bb2bbbb021bb02bb222", "12b020b021b200bb02220212b00100222b220001b0b220b012", "bb102022bbbb010111000201bb001110002222222222222121", "2020111b0bb10b201b0b012211b2b0bb1b10b02bbbbb1002b0", "2bb11bb012bb121bb201bbbb1bb002221012bb000002001bbb", "02bb1bbbb0bbbb220220bbbb121020bb110112211211122210", "120b01210002021b110001001201bb0110b0b02120210b11b1", "221000bb20022010121000121000bb201bb110bb22bb22bbb0", "012101022bbbb22001212bb011201002bb022201bbbb122222", "b1b1b011b2b0020bb22bb10bb20b22210b2bb0bb22bb2bb1b1", "b102012011bb02111bb021b20b011220100120b0bb0bb10220" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case52() {
    int[] cubes = { 99, 93, 98 };
    int B = 93;
    int w = 14;
    String[] views = { "bb20101022021bbbbbb02bb0bb11bbbb2212bbbb00211bb1bb", "2bb021bb1bb021000011221000122bbbb220121b0bb2bb", "111bb101012101020bb222001001110100bbb000bb00000", "2112122bb20b112001b111b0b200101bbb112010111bbb20", "1bb22211012022012221122bb12122020b0112222", "0101220121212012022121112202022b121201b1210001222", "0bb2bb0010bb11002bbbb002011b1110111b1bb0bb1bb10010", "1b12200b22222b02110120bb0b0b2bbbbb221bbb0212221bb2", "bb2bb011001000bb01021100bbbbb1111bb2bbbbb00bbbb", "bb2012bb111bb201bb2bb00b20010000bb00000020bbbb0000", "bb1221bb20111022211020bb1000bb0b010110bb1bb012", "1bb02112bb122bbbb000b01002bb2b20000122bb000", "02112b02bb02b1b2bb1b2b11110b2bb1b11b12120b101b", "11b00bbb20bb0b02b1210b12bb0b000001b0bb00b1b22", "1b210bbb101011b120b01b1b00012222b20b1020212bb", "11bb211120bb0021bb0bb22bb222bbb2202bbbbbb0bbbb2", "00022200012011bb00010102121100000000010001bb1", "12222220b0101b211222b22212122022bbb22210b1b1", "01bb1bb1211010bb1212bb1200002b2b22002b2200", "110bb202120110bb1bb2bb00111b221bbbb012bbbb22bb", "00bb0bb0bb12bb100002222020bb00bb10000000b201", "200022b1b120bbb002b2010b0002b12202b21b20b021bb112b", "102b0b000b02200111b2002b111bb211bb10001b", "b2002b0b100b202b2000b102200b21b01b00b12b110b22b1", "00bb20bb1202011110020bb2b2bb2b0bbbbbbb0bbb2bb", "1022bbbb2bb22000100111bb01bbb1bb021b1bb1", "bb101bb2001bbbbbb200bb00111110102111021221210011", "212122011020bb2bb2bb1bbbb1bbb222b2b2222bb222bb22", "10bb1101201bb101bbbb020bb2222222222bb2222", "21bb222bbbb200001bb112bb220020100bbbb220bb0bb", "b1110bb2bb10220220122b1b10b22bb22221b2b2b02", "22bb212bb20bb0010bb122200120010200021001200", "0b2b000bbb101bbb0000bbb1b1022020b001bbb0b11b0", "22222b112b212b0b122202b2222221220b112012220b11202", "0120222222b1b1b0b0bb210b2b02bbb020bbbb0b01001b011", "bb00bb110010121201bb211022202222bb2222022", "2b0b20bb0b20bb000bbb002210b2b020b22022b000bb12", "2b2010b1b0b0b1110b0112b1210b12020b0201b222b00200b2", "20bb0bb12bbbb0bb211121022011101001000201110", "01bb122001bb2010211022bb1b0201b2b2b200020bb", "00b2b220bb220bb1bb002b20201200b021101001000b00", "0bb1010bb12bb2bb1bb1201200021102b220221bb2bb01bb11", "b00100bb0bb2bb00b100b00b1b212bb100b112b020bbb0b0", "11200b212100101210b000110b1010b10b10b211bb1", "10211011bb1b00122b22200b210111b11120121b10b2", "2bb02bb02212bb11bb0bb2200b2001bb000b012b0bb2", "2bbbb0011bb112bb210202bb1210000101201210", "2202bb2bb11bb010bb0bb1211021100122b22010bb200" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case53() {
    int[] cubes = { 90, 88, 96 };
    int B = 97;
    int w = 11;
    String[] views = { "0210120bbbbbb111101bbbb22010bb2022210bb22222022222", "201bb200bbb1b2bb11b1b120b2021022b0bbb1b2bbb211221b", "bb10002bb01bb0222020112121002202222222bb2bbbb22bbb", "1111202120102122bb1bb11201001102120021020102b21022", "110bbbb22020221112b11b22b221b001000b012011b0b11111", "0b1bb0b20010b2b01212202bb01b0201021b20bbb2b2b02212", "bb21bbbb12bb010211bb2202111221bb10bb0bbbbbbbbbbbbb", "212021bb0101bb20bb2021bb2bbbb11021bb22b2222b212bbb", "02b2b2bbb1bbb20b02bbbbb12101bb02bbb1bb1bb22b21b012", "02221bb1bb002b212b0b2020b2b0b22b0b0000bb2b0bb2b0b2", "202202120b01222221b1b012bb0b211b202b2222b1b221221b", "01bb110bbbb2bb2001120bb2bb2bb20bb0bbbb020bb20bb202", "bbbbbbbb1b0b220b2b2b2bb22202bbb200202b2b1bb22220bb", "b02bb210bb112bb0b02b01b0b0b1bb11bb012bb2b22b012000", "0201220021020221002bb00bbb0012022bbb2bb2bb222b2bb0", "02b11b0b12bbb2b0b0bbbb011b20bb2201b22b221222010212", "0bb110bb2bb212bbbb22bb2bb200bb200bbbbbb221bbbbb021", "0210b02b22bbb02b1bb1000022bb22bb12b2b02222bbb0b1bb", "212bb1bb2122bb0bb120202bb0bb221bb2b211111bbbbb12bb", "0bb11b1b20b01bbbb10bbbbb22b211bbb00110b0b1bbbbbb1", "b2b02121b20b1b21b0b1bbbbb02101b1202bb10b2212b1b1bb", "010220b12bbbbb2bb1bb0b0b111bbb0b222b211b11b1110bbb", "b20020200000112011222b2022120100b20bb0b22110120021", "2bb000bb112bbbbbb1122bb12bb211bb2021001022bb211201", "bb112bbbb220bb011bb012bb00bbbb1bbbbbb2bbb2bbbbbbb2", "2b000002200bb1b12b22001b1b0000212202002101bb2211b1", "222000002202021bb1bbbb211bb0bb22bbbbbbbbbbbbbbbbb", "1102002bbbb1b0bb00b00bbb22b21b0022211bb12bb2b00bbb", "22bb1b1b1b2b001bb212b011b00210bb0b0bbb2b0bb10bb000", "b0221b00b2010b0202022b111212bbb1b0bb12b2b00b21122", "22002bb101010bb0212bbbb221022020210212020022021202", "02bb110001bb200202bb0bbbb02120210bbbb0bbb0bb022b20", "bbbb200bb001b2bbbb1b1b2bb1b00bb20002b1b0021bb11", "b001b0b02b0210bbbb2000bb022b0b10b22b2bb0000b000b1b", "12bb0bb2bb12b2bbb2002012b01b121012b1bb2bbb0220021b", "02b1102b212b2b2b21bb121b2bb2bbbb02211b0b1bb1b00b11", "20000bb00120bb000121bb001bb1001bbbbbb21bbbbbbbbbbb", "b2bbb2102b0111000b0b2120b21b010bb200000022011bb00b", "122112202bb2002112bb1112002bbbbb0bbbbbb0bbb220bb0b", "b10b1b110b22b121b10021b121b0b2b1b1112102b210bb0101", "200bb110110bb01bb1001020bbbb21101bbbbbbb22bbbbbbbb", "1bb12bbb1bb0b122b0101bbbbbbb0b2bb2b20bbbb2bb1b121b", "200bb212bb212102222bb00bb1210012bbbbbbbbbbbbbbbb2b", "bb00111012000bbbbbb222200b021002bb001002b1bb020002", "0b0021b2002111b1b012b222200b21b0b2b2b01b11202221b2", "001bbbb1bb1b02bb2bbb20101121bbb1bbb211bb11b01012bb", "b1b010201b0bb021b1011b21bbb2b221b2012bb1020b0b1121", "bb0112121bb01b002b2b0bb220b20220b1b011b20b12b02222" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case54() {
    int[] cubes = { 97, 87, 96 };
    int B = 94;
    int w = 15;
    String[] views = { "022b21bbbbbb0b011bb200bb201010b00b1b022222012", "20bb00012bb0210bb02221b22220100012b0110212112000", "bbbbbb01220021bb11bbbb1bbbbbbbb11bbbbbbb22bbbb", "bb220bb221220bb0bb1bb222220bb22bb222b2222", "111100bb2202bb2bb0bb22bb0b000020b02000b000220", "bb0b0b20bbb0bbb201b0bb0bb121020b0b1b011bbbb", "bbb0bb1202b0bb10b2b2220121011b2b00b02bb201b", "120201b2022210212112021110022b201122002211", "002010212bb020022b20102bb200002220202121bbbb2", "1bb0bbbb0bb22bb102111000100022222022102021200", "222112bbbbbb1221bb0bb0210bb000010bb1b00", "211100210bb12202110220bbbb12bbbbbb21bbbb", "100bb100b0b102b21b2bb0bb00b02bb2bb12bb22bbbbbb2b22", "2220b2bbb120b0b202b2bbbbb2012b211b12b1202b2b2", "201110bb1bbbb2001bb12000002022120012000000", "200101211bb122bb0001bbb0220bb2022b02b11bb22", "b00b0001012bb0020bb110002000021b0b00bb0002", "1bb1b002b011001bbb101b2220bb0222b221b02b0", "2bb221bb2021200bb22002b022b222222222b22", "02bbbbbb002bb20101bb22001b1bb12111bb12b", "10b2bbb00b20bbbbb22b0b2b2bb1bbbb0b1001bb2", "0102bb2020b12bb000b2b00b0b0b00b2bb0b0bb000001012", "02211112bb21bb22bb20021100002bbb02bbbbbbbb", "1010001210202011201001bbbbbbb22bb1bbb01", "012112b1bb2021bbb2b122222002bbbb10b222bbb", "b2222b1b222b22201b121b2b22020b00b1121b222221200b0", "0210220b000bb22022bbbb10001b0b12b2b2bb11", "101022220b02b010b0b00bb0b22020b02b221b0", "bb00bbbb2b01bb2200bb2b0b2b0b0bbb221210", "221112022000bb201bb0bb121b1112122bbb012bb22", "1bb2110bb21bb1bbb212000b201200221000112210", "b10bb010000b1121bb0bbbbbb0b11b00b0bbb10", "1221bb0bb1000020022bbbb0b02bbbbbbbbbbbb", "0bb1bb02020121121101011b00001010001000bb0", "bbbb002b01122bb0bb00bb201bb1b0b1b0bb1bb22bbbb", "11111bb0000bb1bb02bb22b22221bb222bbbbb2bb", "1221bb11220010bbbb12100011200021110000000bb1111bb1", "112bb01bbbb011022102bb0bb00b00200000bbbb0b2122bb00", "b1bb02bbb2b2bbb2bbb01bbbbbb0bbb10120100", "2b0bb2b000012b0b1000200b0100b2200000b100b", "b2000b022202b000b000b0000100bb20b00b000000b", "2111bbbb02bb11bb12bb0bb020100bb20bbbb202bb2bb", "2bb22bb0bb01bb1bb10b20110020000000200000", "222101111020bb00bbbb222bbb222202bbbbb2220bb", "111b2bb2b22b02120b0bbbbb0bbbb1100bb1b00bb", "221bb221bb10bb00022222221201222bb221bbbb21bb11bb22", "0020212020bb2111b02bb211221b022121bbbb11", "1200bbbb111bb12bb011bbb12b22bbbbbbbbbbbbbbbbb", "0101bb222000bbbb1020212b22b10bb2222b2", "21bbbb0112222101bb200120110b2b1bbbb1211110201" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case55() {
    int[] cubes = { 94, 87, 85 };
    int B = 96;
    int w = 15;
    String[] views = { "01100bb1bb11110221011bbbb020bb0bbbbbbbbb", "010bb0112b1b00b20010b1b002bbbbb0b10bb00b0010b002b", "2b20b1000b22201bb2220bb000b2220b20020200202b1110", "b011bb101bb112b0bbb00bb1022bb02bbb0bbb00bb", "212bbb0b0bb00b0b2bbb11bb211b0bbb0bbb001b00", "12bb0110bb001000bb2002100b0b1021bb00bbbb", "b001bb1bbb12bb02bb0bbb110000b01b0bb0b01", "bb1000222111222bb1120bb0b0b000b0001b2bb2bb000", "00bb1bb1011010bb001010210201b00bbbbbb00b", "000bb0bb0001bb0bb200b21bb012bbb0bbbbb00", "b2bbbbb122bb100b1bb02bbb0b00bb0b21b0b2bb010b", "1bb20bb00b1022010b0101b00bb1b02220b0b1101001", "10020bb001bbbb020b0bb0bb10bbbbbbbbbbbb01b", "00b110b012b1b10bbbb12111bb001b2b2b22000b0002b1112", "011bbbb120021000bb0002b002bb02000022b200", "012b2bb0bb0b2b2010b1bbb2bb1bb0bbbbb102bbb", "01bb1bb220012bbbb02222211bbbbbb01112bb2121", "21b1bbbbb2bb2b11b22b2b2b0b1bb2b11bbb2bb2122b", "10b12021b1b100bb112122b21b220b211021b", "220211101022bbbbbb112bb0b0bb0bbb00bbb0", "22b0b2b01b2b2bbbb2b00b000b1b00bbb01bbb120b", "bb1100bb02bb11200bb2111bb12111bbbbb1b2b2bbbb", "bb20221bb21212202bb00bb0002bb0b0bbbb0bbb", "b10bb011b2112bbb12b121bbb011b11bbb111b0bb01b", "101122bb1bb110bb100b0bb01100bbbbbbbbbbbb", "2b0bb2b12b0b0102bb1bbbb01bb0bbb1b001020", "12bb222bbbb1012bb212000bb00bbb00bbb00001bbbb", "01bb22bb0bb0021110bbb0bbbbbbbbbbbb100bbbbb10bb0", "021b01bb1202bbbb020bb0bbbbb222b00b02bbb0b", "2202120bb22bb1201bbbbbb0100b000000bbbb1bb", "bbbb1bbbb12010bb120021221022202222b2221bb", "1100201000bb2bb00bb022b000bb0bbbbb0b02b02", "bbbbb2bbbbb212bbbbbbb1bb1b1bb21bbb20bb202b", "2021bb01201101212bbbbbbbbbbbbbbb2bbbb", "22100b0bbb00121220b202bb00b000201000200b2b00b", "10bbbb121bb1020011011bbbb0b00b0b010bbb1bb210110bb", "bbb0b0b11b02b0b2b100bbbbbbb00b1b0b01000b0bbbb", "0bb2bb2021bb001bb011bb00b1bbb0bb2b00bbb", "02bb212222bb10010010bb00200bb0bb0bb0b02bb00", "012bb2102bb1011bb000bb211bb20b0bb010bbbb", "22bb121bbbb0bb1222bb1000201122b2002", "211010000221001bb2000bb0b0bbb000b0000bb000", "2002122222221bb0bb0000bb0bb0bbbbbbb0bb0bb0", "12bb1bbbb0bb00211bb0bbbbbbb2bbbbb01b10bbb", "0bb11b0bbb00bb2111b202bb1b0bbb0000b221b2bb0", "01b0b0b00b1bb0bb0b0111bb011011b2b12011b02", "b02b1bb201bbbbb21b2bbb0bbbb1bb02bbbb122", "1211001bb202bb1101100010202201100bbbb0", "bb11000bbbb11211102bbbb0bbb220bb2b2222", "b1b0b2bbbb0b00b21b22b0bbb0bbbbb210bbbbb1" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case56() {
    int[] cubes = { 88, 87, 86 };
    int B = 99;
    int w = 11;
    String[] views = { "200bbbb2bb02bbbb021bbbb0212bb2121000bbbb0bb1bbbbbb", "01bb2000212200bbbbbb1201bb22bb1b1bb1bbbbbb11b11bb1", "bb200bbb0bbb0000bb0202bbbbbb20b210bbbb201bbb12222b", "bb02220201bb11bb11202bb2122bb00b1100200bb00b0bbb01", "210bb21200000bbbb121bb2bb21b020bbbb11bbbbb1bb11112", "2002000000000bbb222210220000b01b120200001b0b0b00b0", "1001bb0bb1211bbbb02100022112002bbbbb2b1222bb2bbbb2", "0bb2bb11bb122011102002bb0011bb2bbbb00bb0bbbb0000b0", "201bb2bbbbbbbb1110bb10bb0010bb1bb011000011b11b11b0", "0b01b2221bb10b0bbb0b2b10b2101b02bb2b1bb1bb0bbb1bb1", "02000bb2bb102100bb0000bb201bbbb2bbbbb00bbbbbbb0bb0", "10b200b0b0bbb2020020122b00b11b11b2bbbb2b00b0bb1bb2", "2b0b22bbbb0022201222b0bbb0bb10b011b21b0b2000b01b20", "011bb12201bb01000012bb1bb2122bbbbbb1bb22bbbbbbbbb", "bbb02b02b211bbbb0bb1b21b0b2101b1122b010b21b2b111bb", "1bb012012011bb02bbbb0121002bbbbb11111111b111010bb1", "b2b10bbb1bb12bb22bbbb21bb01b12bb10b2001b2bb22b20", "bbb12021bb20bb22b0bbbbb212bb10bbb12b002bb0b1b2b0b2", "bb2b2b1bbbbbbbb2bbbb002bbb1010bb2b2bbbb0bb0bb2bbb", "00bb0011102bb21012001bb202bb2221212111212211111022", "2b2bbbb1b0b00bbb22bb12b022b0b0b1b0bb00bb2b0bb1220b", "0122011bbbb02101bb112bb110101102bbb12bb2220bb10bb1", "bbb1b021b2200b0b20b12b12b0bbb00b0b0b0bb100b00bb02b", "122bb01bb12101222101bb0bbbb0bb0222222bb2b0bb12bb02", "101bb2bb11011022000102bb2bbbbbbbbbbb2bbbb00bbbbbbb", "b1020bbb0bb0b0bbb1bb01bb0b221b0bbb12b1b0b1b2bbb010", "b12bb0bb0bbbbb010bbb0bb1212b0b10b12bbbbbb11b12b011", "21210bb2100bb201202000221210bb0100110bb11111bbbb11", "10210bb20bb02222bb202222001000bbbbbbbbb21bb2bbbb2", "110002221022bb210212bbbb20bbbb00bb0bbbbbbbbbbbbbb0", "22b02b2121b2b0b22bbbb0b22b2bbbbbb1b2b201bb1010b2b0", "b02bbbb1bbbbbb122b2221022bb021021020bbb1b0b0bbb1b1", "0bb210222bb020bb22bbbbbb100020211b1b121bbbbbb1012b", "011000020bb12bbbb1002bbbbbb122bbb0122b00b0bbb0bbbb", "bb002bbbb1222100101bb202bbbb100b1bb0bbbbbbbb0bbb01", "b2020b2b20bbbb01201bb20bb00b1bb2000bb2bb2b02bbb22b", "b122b22b1b1bb012b2b2bbb212bbbbbb0000bb122bb1b22bb2", "b120b222bbb2b121b00bbbb0b001bbb2b0bbb00bb1bb0bb10", "b02b10b202122b211b201bbb20b012b00b22b0b0bb012b1bb0", "012122212101bb000bb210bb2111bbbb0200bbbbb0bbbbb0bb", "2bbbb220bb2bbbb220bb20bb11bb00000bbbbbbb00bb00bbb0", "bb121bbbb022111bbbb0bb2102bb22222bbb2bbbbbbbb11bb0", "221bb02b1b01221bb122222bb2bb1b0b0b010bb2b0122222", "0bbb20b1b2bbb2bb0b110010b1b2b1bb1bb2b1b001bb12bb21", "220b0b2b10b02b20011bb001011b1bb120b2b0221b212000b1", "1b212b0b0b20b022bb12111bb11bbbb10bbbbbb122bb1222bb", "bb222bb0bb1bb02121111121101bb210bb2bbbb0bb0bb010bb", "2022bb120bb02102bb20bb2bb21100bbbbbb1bb0bbb110111", "b1b1201010bb0bb000000bb0bbb2bbbbbb22b2bbbbb22b02bb", "10122bb00bb1bbbb1bb102101bb200bb22b2222b2bb2bb2bb0" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case57() {
    int[] cubes = { 99, 100, 92 };
    int B = 94;
    int w = 12;
    String[] views = { "bb0bb001122bb121bb21bb201bb0bb10111001111211101011", "bb20bb210221bbbb12010012002200000220bb0000000bb200", "122b11bbb112200b1b010211bbbb0b100b10b11bb0211b1b01", "2112002102bb01bb1022100011bbbb01bb2b01111112112221", "0b11b2102bbb1101b1b110b1bb0b1b01b02020b0bbb210120b", "bb1101122bb1bbbb0bb0bb00bb1020bb0bb000b0b01bbb00", "2b10b11b2b2b1112b2bb21b01b1bb0001b12b2b11b1000bb1b", "2110bb0bb2bb01bb10111000210201111201111bbb21001020", "1bb02bb012bb0112120bb1021122bb00020101100001bb0010", "bb00bb021bb02bb11bb2bb00bb0000b20bb00bb1200b000002", "bb220002112001bbbbbb22010bb000110010011bb01010b000", "20bb20bb2000bb0bb111120120b01200bb12201bb0b00b0bb0", "10bbbbbbbb0201bb1bbbb012022bb010110110001011bbbb11", "1222121120220101bb0bb2bbbb20010bb202220222022220", "1022110010022bb2100bb0001101bbbb221bb0b020b01", "bb110bb1201022bb02bb0022bb10102122001111101110101b", "0b02b020202b22212122b1b2bb110b0012201b00012b01122", "220bb1bb1b00bb2020112b0102bb020101111b1bb01bbb20", "b02b21b1020221102120b0b00012b10112011111011100b012", "bb101b011bb1b11bb0120022bb010220b21b1222012020201b", "00bb2b1002b1b200202b12b100120bb12bb0020b112011", "200bb0b0b2bb11b01b1100b02b1b1bb00bb20bbb00bb110bbb", "11b00b102b2100111b001110b100011b1011b2b2110b1b11bb", "11b0bb0bb1b0200bbb2b1b1022bb1011b2b1120bbb22bbbbbb", "0bb1bb2bb2220bb1221211021100000020012100202b221021", "1b202222220b21012b0bb1bbb1b2211b02b0222b222bb22122", "1210bb0bb12002bb0bb220011bb1bb01101111210bb01b11", "11012111bb11100bbbb0011b0001b21b011bb1211bb11", "11122b11b2021110102110102b0200bbbbb02112b0121b", "11b20b101b01100bb200b11b001b2bb21bb102200b0b220000", "b201111b1bb1222b120002100111b11211b20b21b2101212bb", "2201211b02020120111111121021002101020110b22111", "bb1b2b21b0bbb111b1bb0b12bb021112bb1b212b1b20b121", "1bb200bbbb011bb21bb11bb20bb200010222212bb2b21122", "2bb1bb021bb221011bb2bb1102100bb020112020012022112", "1b2201b121111b201b21b212b12001b10110b0b102b2221120", "bbb2b01b2b1bb02b02b0bb20b0bb100b0bbb1b011bb2b1b11b", "20122000120bb2000100112bb01210002bb2001120120201bb", "b2b01200120022b021b21b0bb10001012b1020001000bb", "0001001b0b20b12bbb211b011022bbbb1102bb00021b01b0b1", "b0000122bb21b21bb1bbbb1b1b1200b211b2222b2bb2200210", "021010000210b11120202b110101121110b0b1010001b00b10", "2000bb0121022bb101bb21bb120110011010b211111bb1011b", "2221b00121b11020112bbb00b010b2bb10b02bb0020b22b020", "bb10000b1b21b00bb22000b01b0011020110010110b2211120", "10bb2bb1bb221bb02bb002bb0122110bb111111111101110", "1bb012b00b1bb2bb220021002200bb0020b00b2b1b200b2b10", "bbbb012bb01bb0200202122200010100100212b0010bbbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case58() {
    int[] cubes = { 88, 96, 97 };
    int B = 93;
    int w = 12;
    String[] views = { "0bb021bb211bbb21b0bb1bbb11bbbb1bb220b1bbb2bb1b012b", "112b11b0b21bb2b2212021b1bbb22bbbb2b01b0bb22b21b10b", "10bb0121bbbb2bb110bbbb2211bb200bb211bb0000bbbbb000", "10220bb0200110bb20002012bb11210111211bb12110112122", "0121101121bb021bbbbbbbbbb11bb111b112bb1bb11bbb121b", "20b220b02b1121bbb1b1012bb1110b1bb20221221b22121120", "0bb02bb202b0b11bb000b20b1b1b2bb12102bbbbbb2b", "02221220120bb002bb010210211212120bb112212211102111", "2bbbbbb1bbbb212bb0021222bb02bbbb21bb1bbb11bbbb1122", "12bb0bb00122bbbbbbbb0101222bb1111bbb11bb111112211", "202222bbbb2bb11212020bbbb002212110122122111121", "2bb11bbbb0bb020011211111101bb020bbb2b2202bb2", "0bb20bb0bb2bb2002000011bb022222221bb2220222bb2b2", "bbb0b222121bb1bbb20bb0b0b021222112bb22bbbb1b2bb2", "222bbb1b21b21b2bb1102012b1b0110b112b1221b00bbb1110", "02bb211000210bbbb20bbbb1bb122222bbbb122b21b2001111", "2212bb022b2bb1b01bb122bbb22111bb122b11b21bb1bbbbbb", "0112bb0020012bb2bb00212201bb12121121111121111122bb", "b1b0bbbbb2bbb20bb2112b02bb21b2b2b011bbb11bb2bbb0bb", "20221bb110112bb011bb2221bb22222200bb22b22b222200bb", "2120bbbb1bb021bb212022202212bb1101210122b012022bb2", "2002010b2110220b00b00b012012b02022000bbb02b1b2bb22", "1011bb01bb12022121bb22b1b02200b12b122b1b1202bbbbb", "bb0101bb2211202bb0bb02bb10211000022120200000220200", "2b21120b2bb122b20b2bbbbb2210112b121bb0b2b22111211b", "201221111bb21bb0bb12000002000002200202002020201202", "bb1202b12b01b1220111101b111b101112bbb01b0200102011", "21222b00200bb02222b22222b21b2b2b202bbbbbb211b22bb2", "2b00bb2b0b022b10201b00bb110b1b12bbb212b22b122", "211220022121112bb201bb2bb2bb111bbb111bbb0bb1bb1bb1", "201bb21bb01bb12121211bb00111bbb21100102bbbb11bb111", "01020222110bb0022011bb22102b222bb112112bbbb11bb1bb", "2222110bb2bb111101002bb120111100100b00b2000000b220", "1b1bbbbb22b22202b202b2120220b21bb1b21b2bb0002", "201bb110bb21011220bbbb0bb01bb1100020010bb10000111b", "0bb2bb011bb11bb1110201bbbbbb222222021220112221121", "022bb221221b012b1011b21222bbb202111022bb220b012", "21212122120bb0222200bb2101bb22110bbb0bbb0000b011bb", "1020bb201bb2120112bb022b0012002bb21222bbb2b21bbbb2", "2120bb2002010100bbbb11100000100b2100001000bb122111", "22b2111201010211210010bb21b21201b11111b1bb2200", "bb02bb12021bb22121001022221bb121b21112122111bbb122", "2b22212122b210bb11b11110b102101222b2b210102b2012b", "bb2220120110100112bb00bb2bb21bb01121222b2211222110", "222b2b12111bbb0b1b2b00212bb1112bb2112121bbb1b21b1b", "12211120011b212b012b0bb010200122b12021110b21b00", "2101110bbb1210bbb121211111b0210120b22bb1b11bbbb22", "2bbbbbb2bbbb111110bbbb0201210002bb01222222012002", "bb22212220bb00022bb1bb120bbb2b22112bb2212222b21122", "1110011bb2bb2012bb2bb112bb0bb2222202b222022bbbb22" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case59() {
    int[] cubes = { 92, 92, 100 };
    int B = 91;
    int w = 12;
    String[] views = { "221121b00b1bb0b220bb0bb22b1bb10b2b21b2002b22100bb0", "01002bb002222201010bb10b1002bb0000bb00000210110b10", "bbb1b2b0b222022022020bb212b222220022b0220020120bb1", "2012b22bb1202102bb20bb111b1b2b010212b1112102221b", "0022bbbb211202bb0bb021bb2bb0bbbbbb2b2b0b22bbb1202", "222b00b20bb00b1bbb120b20bb2121bb110222b0212b2020", "2bbbb02012bb120bb12201bb00100bbbb122b1022020bb0122", "00002bb22bb02bb10101bb110111200201222110221b2011", "00201b121b10b010121b0111bb01b10bb21b2bbb0b2bb00b2b", "110021221bb1bb210101202020000220222221001022102", "01b222bb01bb100bb11b122bbb0010b122100b2b12b222120b", "2020022020122bb02bb0b121011101b00002bb211b0b110001", "222bb12b210bb10b22022110b1bb01b0b2b10b1bbb2b010b0", "b2b12111bbb2bb2b20b12bbb21212bb021221b21b222211b2b", "b010b0bb001b0b1002b1b2211210212bb0b0b20bb200b22b1b", "1122110bbb2202100b2b1b20bbb112b201b02b2bb120bb1200", "20bb11212bb012bbbb1bb2bb0012bb001110121211011202", "101bbbb11001002bb01bb2bb202bbbbbb010bb010b00bb0", "bb2bbbb1bb110bb11bb02222200022b0022222222222220bb2", "bb1bb11001201011bb010bb01bb2022222b20bb200b2b1bb20", "bb001bb1200bb000200bb00001012222212022222122b0121", "2bb11b1222b220210000222222bb1202212bbbb12220222b0b", "120120022bb0bb120bb01b211bb202bb01bbb02b01bb020122", "bb1bbbbbb2210012000112011bb2122111211b22b22b0212", "22b2bb2bb2b221bb200b0bb0100bbbb2b22b21b2b2b0b1b2", "201221222210121222bbb2122020b211111221002100b11022", "12b100b20b222bbbb1001121b12b212bbb1022b1bb202b121b", "20021021b012022112b00b2b1bbb22bb2110120b00111bb221", "10101bbbb0002bb1bb1bb11102b212020220121112bbbbb210", "1bb20bb1000211bb02bb00021212212221211210021101", "2bb0bbbb1b2bb0bb112b1b221b221b0b1b2bbb0bb2b2b1", "21b21bb1b0b22bb2211bb11bb222b2b212bbbb0b201b0b20b2", "21021011b102b1b0b00b12001b2011b1020121b2022102022b", "12220021222001120122b22220b1bb0200010bb020200b02b0", "b00bbb2212101100b10bbb0120011b2b02b1b22b00bbb2b210", "11b20b101b2bb212b022bbb101001222bb12010bb0010b0", "2022bb0202bb12bbbb102101111201210122021221bb212022", "222b1b2b22200122b212220b2b1221b2bb1b22b0202b1b1112", "2111bbbb1bb20111bb02bb00020bb2120222222222210bb011", "0001100bbbb2201bb011220bb22221122221bb222222212b1", "2b20b112221bbb221012bb1220bb0b0b0bb122bbb1b2b021bb", "1bb1201002bbbbbb10202bb1001101111bb21b1b2bb111bb1", "b112222100b111b10bb2121b1b211b212121b1b11bb22b2b1b", "2b020b2110011212001b0000bb220100bbb1011b2b2bb21b0", "120b11bbb1b0b0bb1111b120b01112001b11b02101112", "211102b12211bbb2bb11b2b21b000b2b1212b211b021b12112", "2bb101bb1bb01011bb0200bbbb2212222bbbb222bbb2bb12b2", "bb102020000210120210120bbb21bbbb22222bb2b22bb22" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case60() {
    int[] cubes = { 100, 97, 90 };
    int B = 100;
    int w = 12;
    String[] views = { "112b120210bbb11b212011b111b01b10b01b2b210b10121200", "b2b10100021bbbb10b11111bb0001bbb01020bb0b0000bbb2b", "10bbbbbbb02b111b1b11bbb001bbb011b1b2bb2b1b0b12b212", "22212bb210bbbb22212200bb110002222221220222b22bb111", "21bb1120021bb2021bb0bb2bb1bbbbbb1110010b1b0100b000", "011b021bb0010bb0b221b1bb02b100b0b0b0b0b02b001b0bbb", "b1110bb100b0011001002202211b20111b20bb0112bb00b01b", "0bbb100bbb0200bbb1bb01bb0bb1bb0102bb0000b2bb0120b2", "12211bb20bb0bb011212110bbbb10010bbbbbbbbbbbbbb111b", "022bb112210111200111bbbb02120022002202202212222bb1", "1111102b2010111202b0020102120210022202220120110112", "0021bb12221021121bb0012bbbb120010011b21b00bb0022bb", "21022bb0012bb122bb0bbbb0bbbb1bb1bbbb1bbbbb1bb1bbb2", "bb120002112bb2002bbbb220bb2bb22bbbbb222bbb0b2120bb", "011122120021011011bb2201bb100bb0b00b0b00000010bb0", "11bb000bb20010bb002022222210001b100011111111111111", "221102bb000111020211bbbb0bb20202211bb0111b02100b1", "bbb0b0bb011201bb2bbbbbb200b00bbb2bb000bb02b00010bb", "00011011b1bbb02000021b121bbbb2b1b1b2200b0b22b1122b", "0bb1bbb2bb1bb2b0111b101b1b212b0b1b12bbbbbb0bb1bbb2", "bb02bb1120bb10100bbbb112122012bb20111bb2001bb02201", "bb201bb222bb102bb1011bb0bb0bb11bb0bbb1bb011bb1bb00", "21bb2201bb10bb022bb2022bb0bb00bbb0bb02bb0bb022bb20", "120b0bbb0bb11202121020bb0b22bbb1b12121bb2b21212100", "b21b110b020121b22b0bb2bbbb00b22b2bb0b10011101122", "121bb11122222201bb2bb1010bb1bbbbbbb00bb000bbbb21bb", "b21b0b010bb101bb2b2bb20b22bbbbb100b10bbbb2b1b2bb20", "bb1110bb10010bb21112bbbb110111111bb0bb1111bbbbbb01", "0bb12bbbb1200000122bb22210bb212bb1bbbbb1bb2b1bb1b1", "bbbb101221202202020bb01bb01b00110bb0bbbbbb0bb0bb", "b00200bb12b221b0b200b221bb0b111b2221b0011010200b00", "00b012b00021121b021211102b0b0120bb121012b201b12210", "2bbbb022220bbbb2211bbbb1bb0111b11bb111bb11b1b", "bbbb1bb22bbbb1020120bb2bb1111111bb0011210111112111", "0bb0122211b1010b0001b2000b000bb2b0b010120200022002", "22000001b111bb22000002b01b20b01001bb00102122bb0002", "12bbbbbb2011010bb1bbbb220bbbb21100101000000b000210", "12b1b00120bb0022b1020200201b02bbbb000101210bb0bb12", "201b0bb10b0b0bb10b1b2bb12bb21b101000bbb22021001100", "0bbbbb02b0bb2002b2000b01110b000b00b00b2b000bbbb0b0", "0bbbbbb2bb01222bb10bb2020bbbbb120bbbbbbb00b0bbbbb", "0210b110b0b0b20b2bb10200b2bbb122b0bb0b0101b11b0022", "11b001b1b00b01110bbb10b01011211b01011012bb121b0120", "2000012b000200b0000b0b02b02b0b000b1b01b0b1b00b12b0", "01b102121bb0bbbb01b1b021bbbbbb00b10bb1b0b12bb1b20", "b1b222bb12b001b01bb010b2b002b012b122bb0bb0222020b2", "21b01bb20bb1bb0b10b0020b10b0b0012bbbb210bbbbb2b1b1", "22bb0011bbbbbb01220bbbb2121bb022bb21b0bb10201bbbbb", "bb200b0bb2b1102201b200010110211020000001200b00b012", "20011b102bb2b2bbbbbbb0b2b1b0bb10b0b11021120101b0b0" };
    assertArrayEquals(new String[] { "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case61() {
    int[] cubes = { 96, 94, 89 };
    int B = 90;
    int w = 15;
    String[] views = { "02bb120bb0bbbb2bb22200001000000220000b110", "21bb101bb01bb211012bb002b0000bb220b2022200", "000bb20bb02000bb211b1010b1b112010b01bbb", "1001bb1b1b2111111110b011b01020102b1b01", "0b12001b200bbb0bb211101112b002b1bb01bb", "20010bbbb1bb01bb0212bbbbbb212bb2222022122", "02020111bbbb0122bbbbb01100101bb0010bbbb0bb0bb", "11020bb112bb010021010bb112001000bb000001bb111bb000", "200bb112b2b12100b210bb1b0b200021b21b0", "2bb1120101bb22210bbb1bbbb0bb00b0001010bb0b0bb", "21221101002000bb121bbbb0bbb10b0bbbbbb1bbbbbbb", "1101021201202b1b1200200201b11b012220b02010", "12b0110bb022111bbb00121b121122b0b220111", "b01bb1b1b21100101b002b20bb2b1b1b11b0010b", "b0bb1b100b0b2b0b020b000b2b21b0120b00bbb11", "101bb22bb222010000b00bb000101011000b10100100", "bb2121111011bb0222bb0220222bbbbbb1000b2b", "bb0112bb11bbbb20002bb100001200020bb0011012", "bb021bb221b111b221111212121b011b0b11111211", "1112bb00010001b0b11010121bb00202b101b0110", "b02b00b02000b0bb0bb2bbb000bb0bbbb1112bb0bb2", "0211bb2bbbbbb212001bbbb02211100121011b210", "001102b0b00bbbb0b1bbb20100021012b00b2bb1", "bb22bb11000110022120001bb10bb001000bb00bbbbbb000", "201bb221bb012bb01110000120010110101110001010", "022bb02bb211110bb21000111b210b00b0b0112", "11bb2222bb10bb1bbbb222000b2bbbbbbbb202bb0", "020bb00bb0100101011220bb0010100010001", "22b212b2bb101002011b0212bbbb111b0b202bb0b", "b11bbbb1001b1b1b1b1bb1b20bb20b2bb12bbb0101", "bb011bbbb1b02211b0bb0b001bb00bbb000100", "b102b21bbbb1b1b222bb21b220011b112101b0b0bbb2bb", "10bb21002bb011121100000011011011b0000001111", "b11b11bbbb0bbb211001bb110bbb1b20bb11b02bb2b101", "bb100bb100bb102100020220012012021200121bb222", "0110bb20021bbbb1bb12210111b01bb210100011", "200bb02000b12000122bb020b20201b1001b0000", "2220210000bb010bb1222b22b22bb1111220bb1bb11", "0b02b11010bb1b2bb11bb01b2000b10bbbbb10bbbb0", "1211b211111b1bbb0bb0b1b0011bb0bb11b001", "0bb11bbbbbb1111bb2100002000b00011bb022210", "bb2bb00bbbb220bbbb000bb100bb1212bbb0001010", "bb00bb0bb2bb11212bb021b010100202010010101", "1211100000211bb201bb120b020bb2020bb00bbbb0bb", "bb2212011bb010bb022210020b0bb0110bbbbb", "110bb12211bb02bb0111bb12200000101bb11bbbb002100", "bb211bb2122100bb101bbbb20220000b00000000bb2000", "b0b10102b10110bb2bbbbb00b0bb2bbb1b220b20bbb", "2020bbbb0010b1b2b1000b10b110b00111b20b01b11b", "2b22bb10b0bb1b22220bb1122b1bb2222b1bb12b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case62() {
    int[] cubes = { 93, 85, 88 };
    int B = 93;
    int w = 10;
    String[] views = { "121bb1bbbb0010bbbb010bbbbbbbb02202bb02b0222222bb00", "01212bbbb11bb110bb11010bb0200022bb12bb1102bbbbbb2b", "bbb1bbb0b001b1bbbb1bb2bbbb11bb11bb121bbb00b1bb2b02", "012bb0bbbb11100110bb0bbbb220bbbb2bb1120020222222b2", "001020b222bb2b0202111000b12b02b01b2200020b11b22200", "11120bbb01b02b2b1102b0b11220bb211b222b1bb2b1bbb1b2", "00202bbbb00bb2211000010bbbb22bbbbbb210bb101121bb2b", "11bb212200020bb20201121211bbbbbb220bbbbb000bbbb0b0", "1bb1bbbb211020222bb022111220bbbb1bbbb22bb2bb22b222", "02bb0202111bbbb020bb0bb2bb12bb2bb002122002002022bb", "bb21bb2b11002b011b2b2b1bbbbbb0bbb2b00212bbb1b2b0bb", "b1b101b11100b222bbbbb1bbb20b111111bb2000bb2b122102", "bb12b0011bbb02110211b2b11221b2b1b12b1b10b22b010202", "111021bb2020bbbb21bb1111012bb0bb22020220022222222b", "01bb02bb21010bb202121bb10200000bbbb0bb100bbbbbbb0b", "b2122bb2b1b1b211211bb02001202b10b0bb21b11101bbb0bb", "1bb1000200bb11bb21201211210220bb1122bb2222b22b2222", "0bb211002221bbbb22b022b2bb000b2b2b2000bbbb0020bb1b", "b0bbbb11222bb1b1bb1020bb102bbbb1b1b012bb02b1b022b2", "b1002012200b0b1b002bbb110002210121b00b2102b1102020", "1222bb211bb11010111bbbb12222bbbb0000bbb00000000bb0", "bbbb0012bb202202bbbbbb10bb220001bb1210111011111111", "b01b0bb2b2b0bb011101110b1210bb1b200b11b1bbb1b00bb0", "1b221b02b1000bbb0112bb1bb010b0b0b0b1b2bbbb20b02b01", "21bb0020bbbb1bb01bb122bb001bb1bb0110200222111221bb", "02220bbbb0bb2bb2000001bb2022121011b211102111111111", "b2b20bbb0b020bbbbbb2b0bbbbbb22b2bb0b220212bb0b2bbb", "2bb010b20b0221b2b1bb221b0b01110b1021bbb01b022bbb0b", "01bbb02b1bbbb0b0bb12b2bb0b112000bb10b1bbbbb2b00bbb", "2bb2b000212b0211b0b0212b002b2002b0001102122b12b2b0", "0bb0b002b2b1b2b20000000bb1b2bb2010bbb2b2021bbb0100", "0bb1bb12bb1bbbbbbbb11bb2bb00000212212112222222b221", "12022101012bb01bb01bb20021bb2bb2bbbbbbbbbbbbbbbbb2", "bb21112211bb200212211010000221bb000bbbb0bbbb0bbbb2", "02bb000b2b20bb20200b212bb201b0020bb01010bb11121202", "210bbbb1010bb211bb10bbbbbb0bb21bb12120222210222202", "bb001200bb11bb1bb1bb112bb0201022bb1bb1022200220100", "b2202bbb1bbb20b1110b102bbbb11101bbb2b221b11bb2b221", "2012201b01b0b00b0212b00b201bb0b00b01b222b0b2b1b1b0", "2bbbbbb22bbbb1bbbb10121bb012bb22bbbbbbbbbbbb2bb22b", "b0bb2b1bbbbb122b2bb1bb2b1b02b21b0b1bb2bbbb200b2b00", "2010bb20bb0bbbbbbbb10bb212bbbb010000bb0010bbb10020", "01b100bb002b1b1b2b220211bbb1bb201211b1bb2b20220002", "bb00010b2b0b21101022b220b200bb01bb122bbbbbb2021012", "0b11000b20b000b2221b002b0220210b02b0111001b1b2bb00", "b20bb1022bbb0bb20202b2b0b01b1bbb01b22b22bb00b2bbb0", "1bb011bbbb222220122000020bbbb120110111011001112011", "10bb2bb2bbbb022bbbb10101220002202000200201102200b0", "bb122210121bb022bbbb00022021bb0100bb0000bb2002bb01" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case63() {
    int[] cubes = { 91, 89, 93 };
    int B = 92;
    int w = 12;
    String[] views = { "bb2bb2bb2000000120bbbb21bb01020bb1bbb01bbbbbbbb011", "2110201b01210bb212b212222bb012b200212b11102b1", "002110bb0bb0bb0110bb1bb2bbbb112bbb22221222122121", "20002010000112110012bb1bb1bb111bbb12b1bb11bbbb21bb", "b2bb000b20bb1bbb00210b1b2b212b121001bb11022bb21b0b", "111bbb20221121101bb0b111b11bbb02b2111b21b122bbbbb2", "b1bb10b201022111b2b20b0b2202111b010b2100b21b111", "1b020bb2b1b120202b120b220210102112b2bbb2b2bb10b020", "bb0b10bb1bb0bbbbb1b1b2bbbbb12b1bb10bbb21bbbb1b2", "2bb02222210bbbbbb2002212bbb2212bbbbbbbbbbbbbb11bb", "0b2b1010bb00bb0002b1010b1b110212bbb11b1b011b100b0", "2210001011bb01bb21bb20122bbbb22bb2bbbbbbbbbbb10222", "bb0200100100bb0020002bb21101bb2bb1020bb2222bb21221", "2b2bbb20b22b202110b2b0bb111bbb0b202bbb2b12b1bbb", "2b22bbb121b12b000122b000bbbbb22bbb102b12bbb1", "0b1bbb20b1b10b20bb01bb122112bb22b1b02b2b0112bbb220", "220022b1b102b120b00001011221b001002010222212221", "020b22222020bb21222b202b0b1b220bb0110102111200012", "012110102bb01010210b201001001bbbbbbbb2bb2001b02b0b", "002bb012200212200201bb1bbbb1bb11bbb01bbbbbbbbbb", "2bb0021bb22bb1bb12bb1bbbb220020bb00b0000b0b0000022", "210bbbb020bb0bb00002112bb00b02122100211b10210bb022", "bb1bb212112001bb0bbbb01120bbbbbbbbbbbbbbbbbbbbbb10", "2bb1222b22b222201b12b2b210200b22b20b1b21b22bb2b2b", "00bbbbbb2200221bb11000221000bbb00001bb0bb000bb0", "bbbb10110112bb12211bb02210bb1221212b2222022222222", "bb20bbbb1bb1bb1bb1212bb121bb2bb100222010b122b0bbbb", "01bbbbbbbb11200bbbb02bb2bb11222022020b022002b2bb00", "1bb2111000bb100bb2111222bb2112022b0bb222bb20bb22", "11bb1bb2222221bb12bb0222000001bb0021000000b0100bbb", "b01b1bb2b021b11100011bb2b002bbbb1b1bbbb11bb", "11bb101bb1bb210bb002120bb22bbb22222201220bb2221200", "10bbbb221101021bb0bb11bbbb1010000b00000000010b2bb0", "22002200b002bb1bb000220bb1bbb02b0b122b0b0bbbb220bb", "b11b0b200b2b01b222bb201bb21220b1022002b002b2210022", "bb00b222b1bb1b22122b2221b0bb000b00b2bbbbbb22b", "200222b12bb222bb0221b02211222b21b2210bb0b0b1bbb11b", "000b02bb1b1b0b2012101b2121b0120002bbb21b021b2011bb", "21bb0222bb02bb0bb22122010bb21bbbbbbbbbbbbbbbbbbbb", "1b00bbb202bbb2bb0b1b21000b1b0b0112b1102b02022bb", "00120112bb1bb01212200102bbb221bb12bbbbbbbbbb02012", "bbbb1bbb2112bbbbb121b0bb01b10bb0b1111bbb0b1bb2bbb2", "200b0bbb0002b1b00bb22bb00b21022b0b0b00bb21bb000b0b", "111bb100102102bb1211bb02bbbb022b22bbb002202bbbb2", "101200bb20bb1002222bb1121bb2220022212b112120012212", "0101bb02b00b1b10bb0bb010bb1101001b2b1021bb022b10bb", "00bb02100bb211201011002202221b12212211b121bb111122", "00201112bb1bb10bb1020bb1222bbbb2bb2bb22bbb20022" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case64() {
    int[] cubes = { 100, 88, 98 };
    int B = 92;
    int w = 13;
    String[] views = { "0bb20bb00bb220bb20002220bb11121110bb10222200121", "b1bb022bb2b0bbb20210102120b2bb02120bb2b2b200112200", "2bb000020bb1bb0bbbb100121bb020020202b220002", "12020bb12bb000002bb000bb1bb1121bb00b0bbb00b01111bb", "b012b102b2b0b11000bb00b000b0022b01b111bbb0b0102b", "bbbb0122122111211222bbbb0020b02200000002020000", "bbbb1222bbbb0100bb10002bb0021222022200220202001020", "210bb0221bb2bb122020bb2bbbb002bb00bb200b1bb0bbbbb", "112bb1bbbb0bb1121bbbb01010000010100002000bb0b10", "12b0bb11bb0b12212b202b20bb2bbb2b2b0bbbbb02b1b0bb", "021bb2bb00200bbbbbb2bb212bb0000b202000b22bbbb00", "b0222bb2122b1bb2bb212b0bb21bb1bbb20bbbbb01b2b0bbbb", "b0bb12120b001b00102b2b1bb00b2b10b0b1101bbbbbbbb", "2102121bb0120102000bb210bbbb212bb22bb0122222", "020202b0202b0022b122b0000b01bb002222110b1202b0b", "00bbbb12b11bb100bbbbb20022bbb2120b10b00202120", "002bb2211120bbbb0bbbb0bb010222b20200022202b002bb", "2200b02bb2111bb20b2b0bb0b0201b2101b0b0112b022", "111020bb02bb001bb002bb12122001222001112221201", "000b20bbbb001220b11bb02b0200b1220b10b0001b22b", "0bbbb0011200bbbbbb022bb2bb200001b20b0202200b100010", "201002bb00100bb1000bb0bb1bb20202202220b0022202", "02bb12bb011000bbbbbb121101bb1120022222bb0220", "01bbbb1112112120bbbb2bbbbbb0bb02bbbbb2bbbb120bb2bb", "110bbb22bb1b1b1b00b2b0b01b1bb02b001121b202bb0", "1b02bb2bbb0b012022b2b0b121b011010021100100bb12", "120bb200bb112bb1102bb20220bb202000b0220202bb001120", "bb2bb12022212022bb22221bb0bb0b2000000200112bb2b000", "bb12bb002bb21bb00102002022200220002222222b0bbbb", "0b00002012bb2bbb0001b00b0002010b0b0b1110bb102b2b00", "00bb11222bb222bb000bb210010bb000000001010bbbb01", "1bb00020bb0bb00010bb00120b10020022202bb2002bb22", "112bb12211200121201010bbbb000b000b2bb020b22222", "2bbbb221020bbbb0bb12022220b10000200021202000002120", "10bb0bbbb10200210211001000220bb000b101000000b220bb", "11bb2102120bb1000bb211bbbb020002222022220", "bb1b0200b0b00b01b011bb1201210110b10210b110b1b11011", "00b1bb02111b2b0bb202122110b2b2200b2b2b11bb220bb020", "221b1b00b2221b1b1220b0010bbb2021b1212010b02bb0", "201bb211221bb002111222100020100200002b0bb000b000", "bb200010122020001bb22221100122000bbb0bb00b0bb1bbbb", "0bb22bbbbbb121bbbbbb2bbbbbb020bbb0bbb0bbbbbbbb00bb", "1bb2b010b2b12bb021001bbb020b00bbb11bb222bb2b1b12", "010b20b02222220bb00100b0222022b1b220022b22210222bb", "10122010212002101111bb2bb22b2200022122b2002210212", "b22b20b0bb111b12221bb2b2b222222bb200b012002bb2b", "b112222221222222b1b0201221011b20110220b1111000212b", "b2022b20100200010bb0b00021b2221012020bb10200010" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case65() {
    int[] cubes = { 99, 86, 94 };
    int B = 91;
    int w = 14;
    String[] views = { "bb1bb201110002012bb2020bb220002022022222222020", "b0b0b10020b2b021b10002002b1b00b2b12b1b010", "bb0bb00bb22221bbbbb00b1200b20bbbbb2122b00012b", "00120200222b222b0200b0b002002002011b000", "1011002bbbb2bb1110b01bb0000000002100000000", "00bb22bbb0b0bb12bbb10bb2b01b0b01b1001020bbb", "b22b12012001b2222b001220b1bbb0bb02b02bb100b2b", "1bb00bb2122110221bb00001201202b2222000020020b020", "bb122020bb200111021bb211021b21bb0211221bbb02", "21102bb2bbbbbb21012222100bb20b2b2bb200b0", "2bbbb222102121112bb000000bbb20b20020b00bbbb", "21b02bb0bbb122bbb11bb11b2b0b2002020201b2b2b", "bbb0b00b00100b0101bb10b00bb22022b00b020002", "202b0101b2b0022200020b22112201b120b021b21b", "bb11bbbb2bb1222bb1100022022002020002bbbb0bb0", "bb2bb2bb202110bb00bb21bb22bb20220102b12bb00022", "bbbbbbbb1022210bb0bb01bb20bb10020b0000bb02222bb020", "002bbbb1021bb1002bbbb2bbb00bb0bbbbbbbbbb", "00002bb10222012bb0011b00001b21011bb0100110021bb", "2000bb20bb01bb20112bb20212b022111b2bb021b2bb10bbbb", "11b010222bb20022bbb1b2202022b010b000020b2220210", "222bb02000020bb2120010111bb1000011001200222101bb01", "0012bb0010002bb022010212201220122120200200", "0bb1bb2bb01bb0bb0bb0212bbbb0b00b0bb000000bbbb", "bb010202001002212112bb01bb2b120bbb11bbbbb0bb", "bb0b0bb21bb1b0022b22b12022011b0b22b2b02b2b02", "011bb2bb222bb121020200122002000000b02001000", "bb1b20bb20bb02b001b0bbb10bbbb000b0bb20112001bbb", "22b10010bb21102000bb02b002bb0b00b0bb012002b002b", "020020bb021bbb2b1221bbb1b2bb0b0bbbb212b1222b2", "2b2b01101b001120111b010100212210b011022000b20", "10bb0b01b0bb0012000bb122b102b1bb00001100120", "2000021212b002bb11bbb220b22000221222112210b", "10bb121221210001bb2000200022220200000b002210bb200", "1001b02b0bb1bb010001002b0000bb0022000220b002010", "111200b10001b0bb1000b02bb00b1b0bb022b2b0b", "1bb000121102bb1bb121b22bb100bb2bb00b0100", "120022102bb220bb020111100bb2220bb2bbb2b2", "b0020020221b0020b2202b0bbb1111022b00002b0b0", "2bb211bb12001021bb1120020bb020bb000000000b1bbbb020", "02b0b2020b200b12b0bb200b000b01bb22b220bb200b2000", "1022b2220112b22bbb11001002bb01b01002b112102101001b", "0bb020002000bbbb0212b1bbb21b0011b0202001", "12121bb2120222bb20202022bb22bb20b0001000000000", "12b0b222b02012b22b2002b0b022001200b1b122b20", "22bb221bb22bb12bb0200bb022bb1b220b2202022bb", "12b102002b1021110101001102002200bb11211bb1", "bbb2bbb211b0b0222102bbb00bbb2bb0bb202bb20b22" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case66() {
    int[] cubes = { 100, 86, 87 };
    int B = 96;
    int w = 13;
    String[] views = { "00bb1bb102102bb02010bbbbbb00010000bbb0b0b100bb00bb", "bb10b21b202bbbbb0bb200b22bbbbbbbb2b0b12bb2bbbb221", "b1bb011b2b1201b11000010100021b0b0b11000b01b011b", "121102010100122020211bb1bbb1bb11b101b0b1bbbbbbbb0", "00bb001bb1bbbb00bb01bb0020220002222002200b1bb1bbbb", "1bb0b1210b1b1b0211bb2bbb011b121100b0bb2bb00b", "b00011b011000b0b1b2b00b11100120b1b0b0bb200bb", "1112bb020bb21bb0bb202100002bbbb2bb0bb2bbbb2bb0bbbb", "b2b2112b02b22bb02b020220200bb0020b0101bb2bb10b00", "12210bbbb0bb10bb102220210220bbbb2bb01b1101000", "b22bb2221b01b1b2b22b0bb1b011b21bb1b112b00b0b1", "011bbb01b0bb001201b0bb1b2222b1b2bbbb22222020b20102", "101111bbbbbb1bb2110201110121202121bbbbb0b", "bb22b0b120b0220200120b112b200210012112212b1bb", "b12100bbbb22bbb10b0b1b220bb0000212021100bb11b", "2bb020b1112bbbb0b0bbbbbbb00221bb0bb112bbb1b01b1b1", "2b0000b20bb2000b0020020000221000012b2001b22000", "0100bb12bb21bb1bbbb100120bbbbbb11bbbb0bbbbbb", "2bbbbb2022bb1b00221bb0bb0002101000b2bb0bb1bbb0b002", "1000bb12202b20b000bb2221bb0bb0100b012bbbbbbb012b02", "201021022bb0bb2020bbbb1000100111101011102111", "0b01b2bb00100bb10100b00b200b0b000010002b0b0221", "02bbbb10010bb2210220bb0202101200bb100000202bb0", "b101bb1bb201bbb220b1b01b0bb11bb1bb2bb20bbbb22b01b2", "01022b110bbbb0b101110b121110bbbb11211b1b101120", "101b000b1010bbb1b1bbbbb0b0111101b2b1b21bb001", "12bb22022200bb200bb2220bb1bb000101000100b100", "2002202202110002b1100001212bb2b11b2002bb00b00020", "012bbbb202011022bb01111002220020000b000200", "b2222b2200b0021b000b20b2b0b221b2112b212b10100", "112b0000b1bbb000100b2b20b0b00bbb1b0bb2b0bb200b02bb", "b2bb0b0b1b0b00bb1bb10b0012b10b000b1b210000b11b0b2", "bb0b02020bbb0bbb0b2bb0bb012b22b0b2b2bbbb100202b20", "2b0bb0bbb220b1b2bbbb0bbbb01001b1bb0bb211b01", "b12020010b2120b0b1201212b10b0b1bb200bb2b2b110b2b02", "11bb201bbbb200bb001010bbbb0b020000002bb0000020", "0b0102222b0b20bb0022b02bb0b10b10001bb000bb02b00111", "120bb02bbbb210bb22102b021bb2112b201bbb1bb210120bb0", "1bbb002b01022bbbbbb1000bbb0bb002002212b01b20121b02", "21020bb22211222bb2bb10bb1112200b0bbb00bb0b00", "2bb0011bb10bbbb0bb2012001000b00b00000000bb02bbbb00", "10bbb0bbb0b100bbbbbbbb0b0bb1bbb000bb1bb1bbb011b2b", "1000bb0bb0112220111bbbbbbbb21100bb2001bbbbbbbb", "bb02bb01021bb2bb222201bb22212000002000000200010222", "0b111110bb1b01b1bb002b0bbbbbb2b0b0bbb01b0b020020", "1bb112012bbbb2111bb00bb000bb0bbbbb2bb0000b0bbbb0bb", "bb1bb121bb0bb221bb2121bb1bb2020022000bb200bb2bbbb", "0212b20b20011b0bbb121012211121001211bb11111202bb00" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case67() {
    int[] cubes = { 90, 87, 98 };
    int B = 96;
    int w = 15;
    String[] views = { "00200bb00b220b2220222bbbbb202bbbb20bb2bbbb22", "2b2b022bb2202b12bb02010220b22b2212200b2", "2bb1bb2bb111110bbbbbb00211222bb212b21012", "10bb01bbbb2022bb10bb02bbb00b1b102b110202bb22202", "0b2210b0222bb0b22112b220b2211b020b1b02220", "102bb2011101002020bb2b220b22b000222b22bbbbb", "11101111bb1bb202bb02bb2200bbbbbb0bbb202bb", "bb021bb02bbbbbb21100bbbbbbbbbbbb2b2bbbbb2022bb", "200bb1012bb00bbbb2212bbbb0bb1bbbbbbbb2bbb", "202021bbb1b2b0b02002001222b20122121201bb0", "00011bb001111bb2bbbb2222bbbbb2222222bbb2bb22222", "bb2000011202b10bb011b21b001b100011b1b1200", "b22b2b2012b0b2b112bbb200b2b021220b0b10bb1b122b", "bbbb01bb01122bb00022bbbbb2bbbb2bb2bbb020bb22bb", "bb0120b02b021021121b202bb2122b2012b22012", "2bb200bb100021110112221bb121b22222b021022", "b0b2020222bb11b1bb2222222b20bb0b22b2202bb22b", "1211100112b1110b2220bbbb2212010002100b001112", "bb20bbbb02bb220122010200202bb1120220100200111", "2b00bb22b0b1bbb2bbb2b22b2101bb2b22b2b1222b", "00bb2b021b1bb2b00bb1b02b00bb1bbbb121b22201b121", "0bb000020121b02022b120101b111222b210b101b2", "b2b2bbb22b2bb01b21bbb10bb1b01b0bb1bbb22b1b112", "200b21022bbb12b1b221bbb2b0b22022b001bb0bbb0b011b", "b1bbb2222b2210110bbbb22b22b0b2bb0b122010202", "b1111b1bbb12b121b121bbbb020bbb2212011b110b2bb1b11", "202bb1002bb21bb101012bbb00bbbbbbbbbbb2bbbb", "12b222b000b21b2b01122b222b0b21111bb10bb11b0", "22b10b20020b0b001bb112b001021b00011b220bb", "12bbb122bb1b122b12211b2bbb2bb20221bb022", "020211bb1bb202bb21bb021bb00bb0bbbbbbbb000bb", "2222b22b2221b22b2000b222222bb012bb21b21212", "22bb102bb110bb002202002bbbbbb022b002bbb2bb", "b1201bbb111bb22bb1b12222b010121210bb1bbb1bb022b2", "bb021bb10bbbb012011b11b01111222bb001100bb1", "bb2bb2bb0120bb11bbbb1210220222222222012", "21112bb00200221bb0211202022022b220220b1bb0bb", "bb001020bb011bb0212b021bb2b22012221100bb2b2", "2bb011bbbbbb12222221bb0bb0b010b022000bb0", "bb2bb02bb2bbbb12101102111111102121211bbbb111", "01bb02001012120212bbbb2bb2222bb2112222", "bb2bbbb0b22bbb01bbb1b2b20200bbb22b200bb1b2b2b1011b", "bb0bb1b200b1bbb1b22b12b2022b2bb2b0b2b0bb0b", "0bbbb1210021bbbb101b220bbbb22b0bb2b01bbbb", "bb100220bb110022bbbb22bb222bbb222200b22bb2002", "0b20b012000bb110b1122201002b02b12bb02b201b2b", "bbb122112b21200221bbbbb011b21220b122011b10b02", "02bb200bb001111bb02222022b2bbbbbb2bb20202bbbb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case68() {
    int[] cubes = { 94, 97, 94 };
    int B = 100;
    int w = 11;
    String[] views = { "210bb02210100bb00bb20bb0bb1bb10011200111110110bbb0", "bb000b012b00b2b110022202b00b10001101bb0110020bb01b", "bbbbbb12b010b0111122bbb0b2102b10b10bb00bb121221b01", "22bbb2021b0b21b121212222b1b21b112b021b200b111221bb", "0b020bb22b0022b211bb2bb20b00bb100bbb010bb10b2b122b", "10bbbb001112001bb2121121bbbb12bbbb0bb000bbb2b02021", "b02b212b201b11b01b1b0b0102011b2b11bbb2b22b11b0bb12", "221bb2202bb122bb011121bb102bbbb021bbbb12b1bbbbb011", "20bb22101120101220bb0bb2bbbbbb111bb11200121bb1bbb2", "100221bb102112112bbbb22bb0102212000010000000001100", "0b0b0100bb012b02b2bbb2b2bb2b22001bb0b0bb2b102112bb", "00001202bb1020bb0110bb0bb10bb222211bbbb1b111bbb1b1", "101b112121b20bbb10210b211012220b0b0b2b210b1102102b", "10bbbb10bb1b2b12b11b21bb222b0b202bbbb0b1bb12b0220", "10100bbbb01bb202212bb2bbbb1bb111100100bb11b0100bb1", "2b022b202b1212110022b2b12bb02122b0b1b2022102210b20", "101bb02bb2bb1bb02bb01010bb1bbbbbbbbbbbbbbbbbbb0bbb", "0102bb001bbbb212012120bb10bb00022211bb02222bb20201", "22bb01bb0100bb1112201202bb01bbbb21bbbbbbbbbbbbb0bb", "bb2bbb11b2b2bb1b1bb22b0022b1b0bb211bbbbb0002bb0bb1", "bb21122000210bb2bb0021210bbbbbb00001121bbbbbbbbb10", "2010212b1bbb11b0010b10bb01bbb0b1bb0b120011bb0b2b0b", "012101221102021120bb101bb200202b0001bb122022200222", "21bb2bb1bbbb012bb01bb02bb222bb10001010121011bb2000", "000001bb1bb12112bbbb1110bbbb2010121bb202bb11bb11bb", "22bb012bb122201bb121bbbb02011200222122002220002221", "0110b1b2b222bbb2012bb1bb1b200b12b1b2101bb11bbb1001", "21bb001220bb22bb0022100bbbb201200011101101120101b0", "00110bb12bbbb221bb202bb112b0110111b1b21202121bb12b", "2011021100bb00bbbb1bb21100bbbbbbb0bbbbbbbbbbbbbbb0", "2b211102210bb0102102b0b121b12b11bbb2bb1b20bbbbb11", "2110bb1002bb201bb20210001bb1bb11111110bb0011111020", "b1110b012bb0b1b22b1002b012b122011b2021b20101121211", "20bb12bbbbb0b2bb220b12bbbb11b00b0bb21210b202bb2102", "11210bbbb222022011bbbbbbbb1bb020bb1bbbbbbbbbbbbb1b", "211102221100101011bb1222bb02bb22000bbb200022bb0220", "20bb2112102bb12bb22011221bbbb220021bbbb22102b2bb2b", "bb1110b0bb21bb2bb110bb2bb021bbbbbb2b001bbb0bbbbb20", "212121012b10b01011b02bb100110bbb110b1111112b01b111", "bbb220101bb2bb0b010b2b0b1b1b2bb1b0b0b1bb1bbb222bb1", "b12110bbb2b0b2bbb02bbbbbbb20bb11b1bbbb11b0b1bbb2bb", "100b001b12b0bb10b0bb200202002bb20b00bbb011bb2bbb22", "bbb2b22bb21bb0112bb221b1bbbbbbbbbb1b2b22b11022bb1b", "100bb11bb11111bb2bb010bb22bbbbbb02bbbb01bbbbbbbbbb", "0b1b2b110b11b112b1bb2b21bbbbb1221210121bbbb111b2b2", "02bb212110002bb201111bb10010bbbb121121112111111112", "22bb0102bb221bb0121bb2001bb01212221120102212120110", "212111b110b1bb1b1b00bb002b0b0b0b00b02002010bb0222b", "0021bb1222bb1220210022210222202bb12100100120010001" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case69() {
    int[] cubes = { 93, 90, 99 };
    int B = 91;
    int w = 13;
    String[] views = { "b2b1bbbb0b0202bb2200220b2b2b00bb2b02bbb22010b0", "000122022b110b000b210b111b210b1b101120011102102010", "2b220121b2b2221111bb1b22b212b020b02bbbb02b", "bb12bb22bb110102bb11212022102222122211220122", "00000bb12bbbb0122bb0bb02211212b202211210bb2201111", "1b1202120210bbbbb10b2021122212001122222222220b", "0bb12b10010012bb22b22100b101211210b211b00220b11bbb", "011020bb2210100bb2bb002bb2211112b21111b0bbbb221", "002102bb22bb12000bb2bbbb200100b1010022b10b02b020", "02bb0bbbb1210010202022bbbbbbbb22bbb0bbbbb2bbbbbb", "01120b21011b1b11211222b122b1b0201101020122bb211", "01000120222001000bb02220112bb2200200000100002202bb", "0b12212bb210122b221b202220221201b1b2022221b2b2", "0b2100bb21202b0b022bbb00212b20222202b2bb011", "20b20211222bbbbb1bb220bb1b2212b122b2bbbbb21b1b0", "1011010222bb0bb1020211222bb00202bb02200bbbbb20002", "12212b11b0200bb1b112100bb0b0b101b001011111bb011", "bb2bb121b22b1022b22bb01221b22011b0b22b2122b22bbb02", "bb0bb21bb11110bbbb122211bb0002bb121021212bbb0bb020", "0b1b22b012220b112b110000002b2211202110b222b1", "02b00b1b0120b100b021022200212022bb02202b002010bb1b", "22112b02221b1bbbb22b212bb2212b2b022bb0120012b1b", "1211bb1101212bb2bb222221022222b0122222bbbbb2bbb2bb", "2bb002b1021bb110b12bbbb01b12b220b1b12bbb0b", "202120221200010bbbb21bbbbbbb1bb1b222bbb2bbbbb", "0010bb2100011100212bb12102221221021120212120221", "0010120bb0bb2bb2bbbbbb12220212bbb122110bb10022bb12", "bb10bb0bbbbbb01000021100bb01bb00b01bb12010b10", "0b120b112210b1bb220bb21011211bb2012bbb0b0111001bb1", "b0bbb1b0102b002bbb122bb1b2b0b2bb12b102021000121", "bbbb11020bbbb10020001220b2221bb20bb20bb200bb02200", "000bb2bb1110bb121bb2bb02bb00200022202201022020", "002122200b2b1bbbbb2bb1b1222200001b2022b0b2b12122", "222b12121b221220bb2bb01122b012b012b2220b2b2b1bb022", "221bbb1b00b22bb20b20b22b10b22b120b0bbbb221bbb2bb2b", "102bbbb10bb2020bb0120102b22bb112bb122bb222bb2", "122222000111211002bbbbbb210122b222bbbbb222b22bbbb2", "bb100122bbb02b2221100b212b12110112b012b2b21b21", "2b220022022220b0b22b22bb2210b20b2bb0b2022b220102", "2bb00001bb1bb210022221011212bb200bb10121bbb1121bb2", "1020bb0110001002bb112bb01bb0bb00bbbb00012bb0b00", "02bb2bb2121b101002222b0b0012202b10222111202000", "bbbb01021bb01bb12200bb202021002200110211212222022", "b10b222bb212b02b220b00b20b011122bb10b01022b221", "10212bbbb002100bb011121110112210010022222b2222", "1b1b2bbb10bb100b1b102b21bbb2b222b2bb1bbbbbbbb1b200", "0b211102021000bb001110101012000b2122210bb121201201", "01101bb0200112b12012100001b1010202122100201b2100" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case70() {
    int[] cubes = { 100, 85, 94 };
    int B = 98;
    int w = 13;
    String[] views = { "01bbbbbb121bb1bbbb2bb220bb2000202200000bb00bb200", "022212bb11121122bb100bb0100212bb012000bb0bb2", "bb11b1bb22bbbbb00b0bbb2b110b0bbbbb20121001b2b00bbb", "1101220bbbbbb220211100201bb02bbb22bbb02bb001201bbb", "1bbbb000b121bb2000b2bbb02b000b1b1011bbb0b012b022b", "bb2201011b2b111121b2b11222b1b221220b000220b11", "11200b1221201bbbbb2bb220021b1b2202b0b022b2bbbb", "10bb20122bbbb110bb11000210121012bb200112220bb212", "111210211bb02bb1bbbb00bb2222222222222222bbbb022222", "10bb00b11b02b0000b00b0bb1bbbbbb0bb0b12bb0bbb00b1b", "2bbbb1102bb102b1120bb02022202222bbb00200000202bb2", "101210bb200010112020bb00bb021102002bb0000b0220b", "b0102b0b12221112b21000b102022b2b20121bb2b210101101", "020bb10010bb112222bb000100220201bb2102202022202202", "bbb010010110011bb11b2b2110bbbb0b1bbbb2000b2bb1b2bb", "12011bb0bb2221bb102bb00bb220bb0000000b000bbb", "02b2b002bb2bb2202b22b110bb200b1bb2210b2b2222b2bb", "2100bb0bbbb2bb2221bb00122b221020010bb120222022", "b0b11b20bb0bbb1bbbbbb00220bbb1111bb2b20bb01b", "bbbb2bbbb0bb22111020bbbb00bb20bbbb2bbbbbb2bbb0012", "22010bbbbbbbb1bb1bb112212b021222111222211101bb0121", "020bb0bbbb2021120bb2210bbbb0bb0bb000bbb00bb0", "2b00b012bb000bbb1201bbb2100210b00101b0b000b2010b0", "2211100bb00101101200002bb202b02010b02000bb22bb20", "20000100220b10bbbbb0bb210b10b0bb00bb20002bbb2bb0bb", "0b0000b210bb21b1bbb2bbb1022bbb01bbbbbbbb02bb0", "bb101020bbbbb0b0b0b01bbb0b2002bbb1bb01b0b0bb00b0b0", "012121212bb10220bbbb20bbbbb1202000b0020bbbb0200", "1102210102bb2bb002bb02010021111bb100100110120bb212", "b02220b210b02b2bb0202b100b12b2001b0b0b2b12b10", "02bbb1101b20021bbbb0b202b2bbbb100bb0222b000bb12b", "1bb0221bb22bbbb021bb1211bb11121bb12bbbbb2bb2b22", "bb2bb012121bb0002bb0211201bb002222200b22bb0101202", "120bb1bb1012bb1101bb02bbbb122bb220bbb200bbbb222bb2", "2b20bb20b1b02b10b11221b2221b220b1b0bbb1b22222", "0bb011122bb2002110bb00221012000000bbbbb00bb0110bbb", "010bb22010220bb22bb22222b2110020220022000bb0bb1bb", "1bb00bbbbbbb1b0220bb10b022220b22001bb2020b100bbb", "0bb00b00bbb1bbb200b00b0bb2bbbb000bb0bbbbb011bb0b02", "b2222bb121b00202b1bb2122200b021b21b00000202bbb000b", "10112bb01002221bb11bb02bbbb22bbbb2b22bb22bbbbbb", "0220b00110210220022b122121212222b221010b010b0", "bb0bb0012bb12011002102222200bbb00000b00b00bb0", "20101020220bb00bb100bb0200022b022b220b20b000022", "0bb00100200202bbbb000101220202bbbbbbbbbbbbbbbb", "0020bb2bb2bbbb222bb10111bb2201bb02200bb00000", "b2bb1b20b00220b200002b1bbbbb1b2002b122bbb0bbb1", "2122bbbb1bbbb00020bb12bb2bbbbbbbbbbbbbbb2bbbb", "1022022bb21022bb2b22bb12bbbbb12bbbbbbb202bb0bb20b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case71() {
    int[] cubes = { 96, 86, 94 };
    int B = 98;
    int w = 10;
    String[] views = { "bb0012000bb210bb12000bb0012020bb2bb022bbbbbb0001bb", "22bb2110bb220112021bb0bb002bbbbbbb22111bb2bbbbbb21", "0bb02201bb2122210001bb02bbbb022bb112bbbbbbbb222222", "100bb2010bb022bb01bb1bb1bbbb1bb1022000000101000000", "0201b21b2b200012bb00b112222202bbbb0b001b00011222bb", "20120111bb01bb0bb0bb0bb1202100001222bbbbbb2b2bb2b2", "200bbbb2022021200bb02bb000000222bb2bb00bb000022002", "1b1bb2b20bb12211b222b221bbb1202bb200b22b0b000001bb", "bb1b1bbb1201bb00b1b001b001b200b0001b00bb20bb0b122b", "022220bb1b12b2122020222110bb0bb00b222212202b100220", "bbbbbb00bb0bb11bb2bb0bb02bb22bbbb210bb1b2112bbbb11", "2bb2222020222011021221bb1220bb02222bbbbb2bbbbb2bb0", "b2b0b2bbb111bb20b22bbb0bbb2b22bb1b22112002bbb00001", "0bb220bb1002bb020111221bb100bb012010bbbb2010001002", "1bbbbbbb0b02002bb1b20bbbb2b0b01bbb10bb11bb2001121b", "b1b0b000b12bb10b00b0022b001b002020201010bbbb0000bb", "122bb22212201010bb101bb0bb2bb102200bb00bbbb0bbbb1b", "bbb0b121b20bb22bb22100100b0202bb112bb2bb10bb0b0010", "bb1bb2bb202212bb0102102bbbb00200bbbb0bbbbbbb222bb0", "2010bb222bb21b1b2bbb211b1bbbb001b2b00b2bb01bbb022b", "002b0b20b00012001b1b0201bbb0bb000121b1000b22210000", "0020bb1001bb121111bb21020bb21bb022bbbbbbbb2bb00b20", "00b2b02100002122bbbb20bb2bbb11b2222b02b1b1bbb2bb00", "2201100bb11200012bb200120bb2222002000bb000002bbbb2", "20102bb0bb010bb121bb01102bb2bb0bb00002bb2bb20bb00b", "bbbb0221bb2201201bb2bb2011bb0201bb22bbbbbbbbb2bb20", "bb2201021222bb2200011bb02bb202bb00bb01b201bb110bbb", "0bbbb0bb10002bb21220110200112bb20bb00bbbb00bbb00bb", "21bb0020bb212bb2bb1002202bb0100211b2bb0221111bb110", "0b01022bbb0211bb0011bb022b2bb01200b220bb222b1220b0", "bb001b10bbb101bbbbbbbb2bb00202b2bbbb2222bb00bbbbbb", "02002bb112220bb122bbbb01bb2022bb22bbbb001020000bb0", "02bb11001bb00bbbbbb12121202112bbbb0020000220bb2020", "220202b02b202bbbb2222021b001b00b020b0020002200b10b", "b0222bb2b0020bb22b20b0011b12b0b2001b0020bb02b22022", "0012bb2012212bb1bb1bb220021bbbb01bb1bb011bbbbbbb0b", "2012bbbb2bb02002bb00121221112112bbbbbb1bb000000000", "111222bb102120bb2bb100bbbbbb202222222bbbb022022202", "121110110210202bb00bb201bb0202bb02bbbb10011bb0bb2b", "b0b2bbb1021110b1001b0b20b02b21b10bb22b00bbb00b0001", "bb21bb2b1012b00b000b2110b22bb01200bb00210b0bb122b1", "11121201bb2201111bb00bbbb0201bb2bb222bb0002200000b", "0b0bbb020100b1b202b000bb20010212002b200b2b1b0012b0", "022bb20021010000bb2221111bbbb0100010bbbb1001000bbb", "02bb1101bb11b1211bb1200bb21bbb2b2b00bbb2bb110020b0", "22b00b2b00b01bb212b0211b0bb12bb000b121121bb0b2b2b2", "b02b201b0b212bbb2bb1bb02b2bbb01bb2b22202bbb00bb0b1", "1b1bbbbbbb0b2bbb0b0102bbbbbb1b0102b1b2bb1b121bb0b0", "22022112bb1210021201bb11bbbb11bb2bb0bb0bbbbbbbb000" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case72() {
    int[] cubes = { 92, 90, 98 };
    int B = 100;
    int w = 13;
    String[] views = { "bbb21010222bbb2bb0bbb2bb1120b0b22b21bbb2bb02b0b", "1b11bb2bb010011b012021b01010b10b01b0000bb012b111", "011bb00012bb2bb0010bb221bbbbb22bbb1bbb22bbb22b22", "002b0202b2102101112bb00012b20b1bbbb2110bb0b1b012b1", "0220bb0bbbbbb2bb1bb22002022012b101120bb112102211bb", "1020b2020202b12200b22b222b21121212b10201222bb0b", "1b02b0b012002b22b2bb2b2000b0100bb2b12b0220112002", "02bb221bb20bb20bb00121bbbbb1222222bb22211bbb122bb2", "b0010b2b220b2b012b2b210bb020b0b22bb1b0012bbbbb", "bb10bbbbb2bbb2bbbbbbb1bb0b0bb1220bb0bbb10021b2b", "b0b011122b0001b12bbb00001020121210bb10b02bb0b0b20", "02bb11bbbb2bb22212111bb20120101121b1220b122b20021b", "0020220bb11121bb10bb110111bb02021bbbbb111bb211bbb", "bb222b01b0b10012202bb201b2212bb022bb2b0b22b22220b1", "b1b2b2bb2b1bb211b2b20122b2b1b1101bb20b1bbb0111b000", "0bb2bbb20b2bb01b1b00002bb2b00110121b20bbbb1000b", "20221bbbbbbbb1bb211121bbbbbb0112bbbbbbb2bb1210211", "bb20bb000b1bb020b222bb1bb002bbb0b1b122020b00b0b00b", "20bb201111bb0110000211bb2bbbbbbbbbbbbbbbb20b022112", "000bb2200bbb2b00b220021b01220100b1b1b0b2120b2b22bb", "120000112bbbbbb0bb0202bbbbb0bb10b1bbb02111bb111bb1", "202020bbb1221b02b2bb22b1b00bb2b00b0bb01b01220122", "021bb111121002020202bbbb2220bb000b0b11100bbb0000", "0110211002022011010200102bbbb2b22bbbb2bbbb2001bb22", "12001100bb0211bb0bb1200112221222202202b22222222", "22011b2b1200b100202b20b11b1b2100b2bb12b2bb1bb2bb00", "20222122bb11bbbb0bb0bb002202bb0120b0bbb0002bb0bb00", "02bb211bb00122bbbb12021000bbb12bb02000220bbbbb10bb", "2010bb10bb20bbbbbb022122b21210bb020021bbbbbb12bbbb", "00bb102bb0211210211bb2000110110020bbb2222100", "bb222020bbbb2100200bb101bbbb121bb1bbbb1b201bbbbb11", "21bbb1bb1bbb21b0b112b2b2b12bbbb0101202102bbb22b2b1", "200bb020bbbb1102bb211bb1112bb2222211222b20bb12bbbb", "20012bb1bbbb1022bb120bbbb00022bb0bbbbbbb0bb2200220", "bb0000020bb11bb00bb000211bb122bb121b2bbb210111bb1", "1bb00bb21bbbb101120101222022202bb2220022222021222", "2bb1b01b2b21b20200bbb100b2b0bb1b2b221201b20b01", "2bb121002011bb1010200bbbb02121222b2bbbb20000", "b222002bbbb00b2bbb221bbb2bbb0b1bbb1bb000bbbb022", "bb21102bb21bbbb122222bb0bbbb01bbb0bb00b0bbb000bb00", "bb1bb11bb2bb11bbbbbbbb210bb000000b01210111000bb021", "012bb1120bb1221212b2bb20b122bb1b20b101bbbbb01b2", "b0b11bb212bb22bbb111011b1bb2221bb101b1bb2b202b22b0", "21bb21b1022b0b2011220b1b221b1202122021220010b", "012bbb200002b0b20b210bb0bb000bbb22b12b222b20bbb1b0", "0b222bbb0b2bbbb2b0b2220bbbb2b0220021b1bb2b2b2b00b", "202bbbb2211102bb22bb0bb0bb0102b02bb21221112101", "b2bb0bbb0b0b0b22bbbbbbbbbbb0bbbbb10bb0b11bbbb1bb0", "2bb112012bb2202bbbbbb0bbbb222222b11221bbbb1bb2bb" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case73() {
    int[] cubes = { 100, 86, 98 };
    int B = 90;
    int w = 11;
    String[] views = { "2bb11bb11020220120212bb120011bbbbbb0bb20221010bb02", "22000bb2112221bb21221121bb2bb022222bb222b22b22b012", "122bb11bb101112bb01bb21000b02102bbb0102000000000b1", "12110101112120202bb00bbbb202222000bbbb002bb2020002", "1bb2bb201211bb1bb021bbbbbb211112222222222122222221", "b10b121120212bb101112011b001b000200b0001112202021b", "0bb2bb02220002120021201020bb00110b210b011100bb0bb0", "bb02211120bb010020200211020002b1bb0212200222002b00", "10bb0bbbb0b200001b0b0001001b022bb010b0b10202b020", "211b2bbb00bb2b0b21b22b0b22b20212020002b2b0b2b10b00", "00000bb21210120122102bb010bb000010bb0bb0b00bbbbb02", "0b012b0b0b200bbbb0b11221b2122b22b211b202b1211b1b1b", "0202bb22bb10112bb100111202100200002001010000011120", "110002b0001b000222b1b0b10bb020b0bb100b1b101221000b", "00200122b21010212b20bb01b0b1222b1022b0b01020202bb0", "0bb12bbbb21012001bb1bb0bbbb12210122021121222222211", "bb1bb200221bb1220bb2120112202021200002022222222122", "10100112bb0bb2bb021bb2bbbbbbbb00200022220bb0222222", "0201b221b02222220b1200b02012bb2bbb02b2b0120b02b12b", "020002b0bb002b22200022020102120b02b000000120bb0001", "2100bbbbbb02bb220bb1020bb20200002020bb00bb0bb20200", "b000112200b2b022b2b2b2022220b0b2bb0b0b122bb1b200", "bb22bb10bbbb2102bb100bbbb0bb0000000000000000000000", "bbbbbb12101bb021020121222bb02020201200bb022b2bb2bb", "1222001001121201bbbb02bb2bbbb0bb0bb20bb000b0bbb02", "1101b02010211b1010b0b01211102b2bb0bbbb12b1b1b02220", "122bb001bb0201bb1002221bbbbbbbbbbbb1bbbbbb10bbbb0", "02021b000b00b0000b00b2bb02b100212b0000220bbbb0112b", "11b2b000b21b1b0b00b021112b011121bbb01201011b01bbb0", "0220b0121b1122b011bb00121002bb00b02000bb0b1222b0b2", "202bbb2b0b00b1100b102222b00220b2001b020b0012b1b022", "bb2121bb112bb0011bb11bb122bb02bb1bbb2bb212b22211bb", "bb101012bb1121212120220bb02bb000000000020002bb0000", "bb0002120011bbbb12bbbb00bb02bb0bb00b22bb0bb0b0b2bb", "0b1201b10bb112111122221b1bbbb2bbb20b2101b01b2b1b2", "10b0b02b020b02b00b0b00022b0b101020002020b2bb111012", "012020222bb1b0b2b0bb0b2b000b2b120120220112220210bb", "bbbb000b01b10bbb20b22bb0b0b000b0022b2b000bbb00b0b2", "1b00bb10b0b0bbb00b220221b2bb012b0b012220022020210", "b110101b000bbb2102b12bbbb012b0b1bbbbb2b2b2bb1bb1bb", "02b22bb2bbbbb01bb02122220bbbb20212b2b00b20b0b0b022", "bb20bbb0bbbb210bbb22bb0b020b01bbbbb0122000bb201", "0b20000b22b0b0b11bb1b0b1b1b22b020bbbb2b122b2002b02", "01bb101bb11bb202200bb11001bb2001021210bb2011210010", "1bb011bb201bb0202022bb22002002220bb2b1202022b2b02", "001b200b2001b1210bb21000201002bbbb020b20b11b001b00", "01bb20122110bb111bb012bb21020002000bb22222210110", "b22b20b20120020112b1202120b21222bbbb2b2100bb020222", "b0101b0b01021222b2bb0b121b1120bb0bb1221b200bb1bb1b", "bbb00bb0bb200b210bb21b0bb21120b210b220b0bbb1bbbb1b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case74() {
    int[] cubes = { 93, 86, 89 };
    int B = 92;
    int w = 11;
    String[] views = { "bbbb1bbbb022122111bb2211001121001b2bb1021000000000", "bb01b200221bb1b0b21001b200b2b022bbb12001200b2001b2", "00bb00b101b01bb020102b100101120011210012b0bb001b21", "bb1121211121bbbb222bbbb2111bb1101bb2bb11b112bb1bb0", "12211112102bb2000b11120100220bbbb00bbbbbbbbbbbbbbb", "011bb212bbbb122212bb0100bb111112021111212bb11b2bb1", "bb22b20b2200b02201020b0bbb022b2b0b02b0020b0200bb12", "1b0222110b1b02b11bb01bbbbb22b121bbbb210b1bb21121bb", "1121b221bb11b2b2bb11222221122221021102022b21b210b1", "b0b1b1112221221bb1b11111b21bb0b20200211021b1b2b2b0", "021210220b2012b10b21021b011b2b1b01101022b01201122b", "bb21b11bbb2010b011101201b1001b0bbbb12b0bb1b11b20bb", "00120bb21bbbb1bb00bb01212bb201122221221122b0022122", "2bbbbbb0bb220bb000111bb1bb112022bb22bb22b22bb2b202", "10021b20b0110b0bb000b21b001001b0bb2022b210b02120b1", "1bb2bb1010022011bbbb0bb01102bbbbbb222bbbb222bb22b", "22201122bb2012bb0222110bbbb10001111bbbbbbb1011bbb", "022200120002200b002021bb011b2121b2021bb0100120021b", "b020bb1bb00bb0212b0201bb1202b02b2b00bbb12bbb10202b", "222212bb11112100121212bb022220000110bbbbb000b00b", "bb102bb00000bb11200000102222b00bb1011b02bbb00b2b0", "b0b2201b0bb1212bb22bb02b2b0b100bbb0b02bb210bb2b2b0", "0100011bb20bb0b0200b0220bbb02100bbbbbbbb000b2000b2", "02b1bb122b221b220b2b1b0bb001bbbb12b000bb0b00b022b2", "22b20bbb020b02b00bb21b0100bb1bb100b20b2bbbb222bbbb", "00b12120b222b101b2002b0b02b0b1bb1b20b2020b0b2bb010", "bb10112bb20021200bb221212bb102221200100bb1100010b1", "212bb220111110201011bbbbbbbbbb0bb00bbb0bbbbbbbbb11", "bb001bb0120002201bb2bb2212021bbbbbb122bb122222b1", "bb10110012bb11bb02bbbb02bb2122bb2000000bb022bb10b0", "bbbb000201bb011bbbb101bb111021222101bb000010111102", "220bb1011bbbb0bb220110bb10222bb02bbbbbbb22bbbbbbbb", "b01b2bb221202012bb2b2bbbb210b01bb0bbb0bbb1b22101b2", "0b10bb02b001b0bbb2b02bbb02b0bb0b010b000bbb020000bb", "0b1b10212b0b1021020000bb2120bb0b0bb0bb2101bb200b11", "021b0b222200bb2b2b0101bb0100b2b00bb1b0b02b2202b2b2", "bbbb2122bbbb1bb2bb202bbbb12002bbbb22000b200bbbb20", "0200bb10bb0020212bb2122122bb1001bb111110010bb01220", "10002002020bb211bb11211bb0010000001bb202002200020", "0102bbbb0bb200021bb0bbbb0202222bbb212bbb001200022", "bb210bbbbbb200bb11112bbbb20102bb00bb1bbbbbbbbbbbbb", "bb222bb1112022120012bbbb22bb0200002202110200010220", "0bb0200b2011b1bb21bbb00b2b2b0bb120b21b1b2000bbbb1b", "0bb02bb01bb0bb21bbbb2bbbb0bb1bb1bb10bb21bbbbbb12", "2b211bb0bbb2bb2b11100000bbbb00bb2b1bb01bbb2022b022", "21122222201bb12000bb011bbbb12210010020222020b20020", "0bb0b201bbb0b11120b1bbbbbb0bbbb1000b001bb00bbbbb0b", "01bb01bb120bb112111010100020022bb1002222222202b202", "bb01b20b10b02bbb1000b01b00b1bb02b21bb2b2b12b2bb02b", "01110001122bb0201bb00020b20bbbb0bbbbbbb002bb020bb1" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case75() {
    int[] cubes = { 89, 0, 0 };
    int B = 58;
    int w = 17;
    String[] views = { "bbb000b0b000b0000000b0b0b" };
    assertArrayEquals(new String[] { "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case76() {
    int[] cubes = { 3, 0, 0 };
    int B = 4;
    int w = 3;
    String[] views = { "00b0b", "bbbbbbbb", "000b" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case77() {
    int[] cubes = { 1, 0, 0 };
    int B = 2;
    int w = 2;
    String[] views = { "0bbb" };
    assertArrayEquals(new String[] { "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case78() {
    int[] cubes = { 33, 67, 13 };
    int B = 15;
    int w = 13;
    String[] views = { "bbb02bb21b22bb201b110bbbb2111bbbbbb22b2b2" };
    assertArrayEquals(new String[] { "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case79() {
    int[] cubes = { 0, 2, 1 };
    int B = 2;
    int w = 2;
    String[] views = { "2bbb" };
    assertArrayEquals(new String[] { "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case80() {
    int[] cubes = { 22, 20, 17 };
    int B = 20;
    int w = 50;
    String[] views = { "0b000bb202bb20012220b000b00b2" };
    assertArrayEquals(new String[] { "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case81() {
    int[] cubes = { 3, 1, 0 };
    int B = 5;
    int w = 19;
    String[] views = { "bbb1bbbbb" };
    assertArrayEquals(new String[] { "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case82() {
    int[] cubes = { 2, 44, 17 };
    int B = 54;
    int w = 37;
    String[] views = { "b2b01bb", "11000b01", "1b1bbb11bb", "0b001010", "b0000b1b10121b1110", "1b1011210", "1bb", "b0000b20211", "b10101111000", "1bb0", "1b1b", "01102", "000100", "010111110b0b100b2", "0101b112b1", "b0100022110000", "0111", "020", "011b0021002b", "0b11000011b", "111000bb0bb2101b", "100b1b1", "10100b101b0", "b10", "11010100b2", "b0b11111101bbb00b", "01111110b2110b0", "00", "10", "1001b01b", "b10110b2201", "0101012", "10111002b1112", "0b02b21201012011b", "0b20b21212020", "1", "0b01101200100", "200111010111", "100011b01" };
    assertArrayEquals(new String[] { "invalid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case83() {
    int[] cubes = { 7, 24, 38 };
    int B = 14;
    int w = 48;
    String[] views = { "2", "b1bbb102bbbb1b2bb21bbb12b01211012", "bbbbb20bbb200b", "1bbb2210b2bb1b212bb2bb", "1b1b12b", "2bb2", "2bb20b20bb1122b1", "01b21b1b221bbbbb2bb1bb20", "2bb22b21b020b2b2b11bbb000b2bb12b2b0", "bb20b1", "bb222b2bb1", "bbbbb2b0bb121b12bbbbb1b1b", "bb1212222", "2b20b1b0bb121bb0b21b2bbbbbbb122211", "bb21bb1211212bbbbbb022b1bb2b", "11bb1bb1b121b201bbb222b112bbb1b2", "bbbb22b21b", "2bb11b100b10b22bbbbbb11bb22bbb", "b1b1222b22bbb2b1b22bb1", "11bb020bb1bbb2bb2122bbbb211b00bbb", "bbbbbbbb22", "bb22b2bbb21b0b220bb0", "b1bbb122bbbb2bb221bb12bbb1b20bb2111bb", "1bb2211bb", "b2bb211212b0bbbbbbbb20b1b1b1b1b1b", "bbb2bb021212b1bbb211b1212b", "2b2bbb2bbbbbb212bb", "bb1bb20bb2b1b122bbbbbbb22bbbb", "22b21b22b21", "2b1b2bbbbb0b22bbbbb012", "12b", "1b222bb10b2b2b2", "b1b2bbb1bbbbbbb02b211b", "22b2b12bbb2bb21b2bbbb2bb1", "bbbb2b22b2b222bb0b2", "21bb221bb02bbb221bbbb1", "bb21b2bbb1b1bbb2bbbbb222", "b12bbbb20bb12bbbbbb", "02b1bbb1b112bb2b102210b112b2b", "12b2bbbb2bbb1020b2110", "2221bbbb0b0bbbb0", "bbbbbbbbbb22bb1bb1bb2b210bb", "2bbbbbb1bb22b12", "b2b1b2bb2bbbb201bb2bb21b1bb", "bb0", "21b200122b0bbbbb12bb1bb2122b22b2b1221", "1bbb2bb2bbbb0bb222b0bb2b1b2" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case84() {
    int[] cubes = { 25, 51, 46 };
    int B = 10;
    int w = 46;
    String[] views = { "b2b220", "2b22bb22bb00bb220bbbbb2b", "b2b2bb22b2002", "b2bbb2222b0", "b222b20bb0b222222000b1222bb2b2b2100b2b2b1", "202212b1b01bb202bb", "02bb02220", "b2b02b1b00b", "2bb2bb00020002b2b2bb10bbbbbb222", "02b022bbbb20022002bb0b0b1b0b", "b20b02122222b210b22b2b1202bb", "bbb1b2", "0022bbb2b00", "bb2b20220b2b22b012bbbb02220bb22b22b2b222", "b22bb20b2222b2", "b2b2", "22220b02b2bb20b0020", "b20222bb0bb0bbb202b020", "00b", "b2b2200bb2bb2020222021b2b22bb02", "0b2bbb2222b22b0b20b2b2b02b2b222b0b2b2b00", "bbbb200b22b", "bbbb20b022bb2b02b22222b02bb2bbb2202", "22", "22b0222b02bb20bbbb2bbb0220", "02bbb22bb2b02202222b2bb0bbb202b2212b2bb0", "02bb22bb20b122b", "2202", "2b2220", "b", "2b0b00b02b012b2bb2200bb202121bb2220b", "bbb20b2bb", "b2bbb0b222020b22bb200222122bb100b22b1", "b2b002bbbb22b0b0bb222b02220b2b21b220", "0b22b0b222b0b20b220", "2bb", "02b22200", "22bb22bb2202b20bb", "122b0bbbbb2b2b", "02bb2b200122b12b0b22bb0b2bb0b022bb2", "22bbbb0b2b2222bbbb2bbb2222bb", "20222", "2bb20b0b22b2b2b21bb00bb", "b0b", "2020222002200bbb220b20" };
    assertArrayEquals(new String[] { "invalid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case85() {
    int[] cubes = { 26, 1, 10 };
    int B = 2;
    int w = 47;
    String[] views = { "10001", "b100b2", "111b1b", "bb0b21b", "11", "010b01b1", "12b001", "bb1", "20", "10b0", "02", "1b0", "0001b", "1b01", "1b0122b10", "0b1", "0b0", "0111110", "b21001112", "122", "1111b1", "120110b", "201", "0b11211b", "b0", "001002100", "b00b1b2", "11221b1b0", "1", "bb1b", "1", "11002111b", "0", "b", "00bb11020", "1bb00020", "b12101b0" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case86() {
    int[] cubes = { 2, 3, 11 };
    int B = 46;
    int w = 49;
    String[] views = { "b00222", "20b1121", "0211b200101011210002b200022", "012202100221112bb000102000", "2022b20", "210b002b21100b1", "201", "20021000b1112201000202bb2b1", "200b122b22b110222121212", "0001020b", "022110220022212220", "b20122b0020b02201102000221b12", "0011200bb22120121b00", "20200b1202100b", "221221", "11b000b2b10b201b2000b00210200", "202200b21020221002001", "2b021bbb1b1000212212b011b22002", "2", "b0121022b211011012210", "b222b0b11b", "2b2200b0b1bb0002", "b0222bbb2010", "2000b1b102222b01120b021212220", "10122101b2", "1020b001202120202b02122220220221", "1200", "2111200012221b21bbb21", "2b201b0", "02000b", "110b21", "b12", "2222012022b010120122b2101", "11bb2000bb2", "11", "22b021b2bb012" };
    assertArrayEquals(new String[] { "invalid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case87() {
    int[] cubes = { 11, 19, 11 };
    int B = 68;
    int w = 6;
    String[] views = { "2100002102202200221200210", "222122000022002", "222022201001012211202", "00b01202222221220", "222b1120", "2", "22201200b2020220220", "201222222b220220220022", "22222012000102010020", "2220201", "02020220222210b2210022", "2b2012212002210220002220220", "22222021", "202000202200000b", "2222020100b22100222000222202222", "020021022020000", "02101200210222b0222201022", "1200212022021222b0200", "0022", "2222b2120002000200b2020100222020", "20222201", "01020012112021", "20", "12222002220002022002000222222222", "20102221200002000220202022200202", "0222", "22210b12", "22021222020002022b2120", "10012220220222222", "22220210122222220202", "22200220020200121", "02000020222221202000102002121", "1b222222122", "220202022012220021220000212", "00b020202222222002", "200002202201221202002", "0022122120200222002", "112bb0220b22002100002000b", "22", "220102022221222220220102", "2200200100200202", "2122200", "20", "21210222022222202", "0222021022222b2020220202202200", "221002022002" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case88() {
    int[] cubes = { 7, 4, 4 };
    int B = 21;
    int w = 19;
    String[] views = { "12011b0b11", "0101bbb1", "bbbb0", "1", "12b01b", "1101b2b00", "0b10", "0b01b2", "bbb0b", "b", "0b", "11b", "0bb11", "b1100b0b0", "10", "011b", "00b1bbb0", "b0b0bbb", "b1b0b", "010b" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case89() {
    int[] cubes = { 25, 8, 20 };
    int B = 4;
    int w = 33;
    String[] views = { "0210bb002121022b01bb", "00", "10b2102b01021212", "22bb1110b020b2bb212bbb12bb0", "1bb22212021b1b000", "02bb221b01121b001b22bbb210b12", "2121b2101000120bb12b021b00120", "b0", "12201100212b00221", "0b0b", "000021220", "11010111210b11b12b121b00", "b0b200202001b", "120202b02002121", "12bbb1bb0100121b210220b2201", "0bb200120222b00b1bb2", "0b1b02", "200120111b111bb1", "b2b0100211", "1b", "001bb001222222bbbb00", "10bb2b01b111b02b1b220" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case90() {
    int[] cubes = { 3, 4, 0 };
    int B = 78;
    int w = 28;
    String[] views = { "b", "2", "bb211bbb", "00b1bb21", "0b222", "1b12b2", "b112b2", "bb2", "0b2bb", "2b1", "0b2bb", "222", "b1102bb2", "b2b0b1", "b", "bb2b2b", "12b2bb", "2bb21b1", "b1212b", "2110221", "bb1020", "0122b2", "bbb122b2", "b22bb", "b1", "b221b", "bbbbbbb", "2b", "12bb", "01bbbb", "22", "2b22b", "b0", "b2bbb11b", "bb", "2b122", "12b20", "2b22bb2", "b", "bb2bb0", "2210b1", "bb201b2", "021bb22b", "21bb11", "b202b2" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case91() {
    int[] cubes = { 33, 2, 5 };
    int B = 15;
    int w = 26;
    String[] views = { "02022201b2222b220022220220220", "02b220222210b2201221020002201", "1220b2", "202120b0220", "212b00", "201210200", "0220", "2020b220022000b2120", "220", "b1210b20012200002020021", "10121222222220020212002b", "022220022022220", "0200202212", "01022222b22222221", "20100222b202202022b220", "0020120212202222b00222b220", "022122220222222000022022", "2202020b02200222122222212000220", "22222220", "22202020200222b0222", "02220012000b22b212020122000b02", "20b222011220222122200000", "00201002102", "1012022220b0200222222012100202", "2201220001b00220002220", "0212212020b222200222", "000", "12022222010221b200", "022220220", "b", "2100201bb", "1022002222222012202", "202002221222221210102", "0000", "0202200b", "20022b22112022b0222020222022b", "2220202002b022200022", "22b02b0", "02200022000200b210212222222211" };
    assertArrayEquals(new String[] { "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case92() {
    int[] cubes = { 30, 26, 51 };
    int B = 7;
    int w = 3;
    String[] views = { "2b1b20b01b0b0bbbb1", "b211bb0b", "01b100bbbb2b00000b2", "20120b00", "b22220210bbb0bbbbb0b", "2bb20022b0100b20b", "00b000020", "b2bbb2bbb00bbb0b2b20", "b0b02b0", "2bbb001b2bb0022b1200b", "bb02bbbb10b", "1b0b00220b00bb0b01bb0", "000b200bb2b", "b", "2", "10bb2bb1b01bbbb20", "b112", "b0", "21b0b0012b20b21001b02b", "2020bb", "b2b201b0bbb221b", "10b1010022bb22b", "b2bb2b2bb2", "1b2020bbbb1", "22b220b0b200bb", "b002bbb1b2b0b0b1", "00b", "2200b", "b002210b200bb1bb2", "0", "0bb02bb00", "0b0bbb0b10001b", "0bbbbbbb00b00020b020", "0bb1000", "0020b2b1bbb000bbb", "bbb0bb2b2bbbbbb0b1", "b000bb20b0202b2b0b2bb02" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case93() {
    int[] cubes = { 7, 11, 21 };
    int B = 99;
    int w = 4;
    String[] views = { "1b12220b012bb21", "00b01b111bb2021000121210b0bb101210", "01b021b0b1212002bb01", "11b210b121b1", "0bb21b2011b0111b1b02", "1122110b12b1b02", "021bb212201110b", "12b100b112b0bb21", "2110b02b", "bb2", "2000021bb102011221b002", "2220210b020000b", "bb0b1b1b1bbb112bb12b1211", "b20012b010210210211001", "b110b1bbb1b2b020b1112b111bb21b012", "112b0b21bb", "b0b0b", "0b200122b1b0", "112", "1b2b212112001b10010021b", "21b0012b21bbb011b100011bbb2bbb", "1b1112b11bb010bb" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case94() {
    int[] cubes = { 0, 1, 3 };
    int B = 44;
    int w = 7;
    String[] views = { "0b1210b1", "bb12bb20", "12211b1", "b2b1b01bb", "121bb22bbb", "2b2", "b2bb11b", "b2", "1", "2bb", "bb2221b", "222bb11b1", "b1220", "bb2", "12bbb", "b22111", "01102b1" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case95() {
    int[] cubes = { 5, 1, 3 };
    int B = 49;
    int w = 17;
    String[] views = { "0b0122b01110b0b", "000b00bb010222bb002bb", "2021", "0b0", "2b210bbbbb0bb002", "000b0020122b0b02b", "0b0", "bb22b0bb1022b00bb210", "00101b12b2b011110bb0bb", "b0b0b110b2200b10201b", "0202000000002201002022", "b00b000102bb00b1b0", "02020bb020b", "2b02012020b201bb00020", "20", "12b2b0b22bb020b221", "b20" };
    assertArrayEquals(new String[] { "invalid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case96() {
    int[] cubes = { 10, 21, 13 };
    int B = 18;
    int w = 47;
    String[] views = { "0200", "20002020b01b11", "1b01bb1001010202b0222", "b01000b2b0200220222201b121b", "0000100000020120002101102122100bbb010220", "0200b222112100b2000b", "21020210b0b20b0111202b00010b0", "002b0022221220220b0220b10b10", "22001b0b02001", "2200000001", "0200000", "22", "b0021b0000000210200010", "0122010022112200b10202022020", "10200b00102b2010021b120000b1000211010210", "212111100102120120002b022200101102000012202221", "002b201222222200b000022020020100021b011112", "b000", "b2010010001201001220b02b222020", "11b2b2022b1201012020b1b2200221001b010b1022b2", "121202200200b0b1bb20120022bb01b20b1b012002", "11010011012120120212221221002b100", "1", "0102", "222b011b1121100001b202b22022212", "10111122012", "22011222201b0020112022220", "1", "0101000022201101002", "12220202b", "00211220b22012210b01220222012", "010b2b00121120010", "02010202b1", "20122022120b2", "00002002b1020111011120b221b22201211102002102001", "202b2", "20210202b122200b1b102002000202b00202", "022202020210011021b10", "2b2021b2002010202", "2021020101220020b1b0100122b2022200001" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case97() {
    int[] cubes = { 13, 30, 17 };
    int B = 2;
    int w = 37;
    String[] views = { "1", "121121022221001222210021b0", "020202202b2112222120", "12b221bb222", "01002b1b21b122b012220121202221101", "1110002", "212", "2121212002", "0012020", "12210b120b110b10102b2202", "21101100110b1212200221b0011", "12022b11011b20022b20122100220022", "b22202b1", "10200b", "20020200b12220b2010002211201022220102", "b10221221211100012b", "110b200102", "11121100", "10111012222102b02002000120b001212b022", "01120020b1121222b100122", "b122012200000", "1210", "101b000222210122201001222b000", "000202b11222100112122222b2", "0110122200bb201101", "021110b0021111002120101100011b21222", "1bbb2122b0010021b0b2bb1101122100122", "21222b2121b22122201102b112", "220b2212120222b122111bb0121", "21202200211202220b010b0021121111120", "b12b22201002212222112", "12010001011200002200002020012b11b2120", "000021200b2100010122122b01220012", "2202110202211122101b021202b1100201", "0111121220221222", "20200", "b2211021200b10112220112211b2110200b12", "0b11122122020010b202b000000222200b12", "11111121b20202111b2b01220b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case98() {
    int[] cubes = { 12, 12, 1 };
    int B = 3;
    int w = 7;
    String[] views = { "100b11101010101011", "b01001b10bb0100110111010", "000b100111b002000b0b1", "00011b00", "100bb0011011111", "111000001101", "011110b0b0", "000000111", "110b01101110b0bb1", "1000011100b0010000", "00111000100110011100", "b1101b01000100b", "b0110110000b", "b1b0b1b01", "101b1b010100", "1010b11b0", "bbb101010000b1111111110b", "0b0110011b0b01b001b", "001111b010b", "0b0100", "011bb00b1101", "110b", "112b101b0001111b1100b111", "0b0", "000b0000b011110201010b1", "00b11bbb11" };
    assertArrayEquals(new String[] { "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case99() {
    int[] cubes = { 4, 7, 2 };
    int B = 1;
    int w = 28;
    String[] views = { "10", "0", "0", "b0", "b", "b11", "b00", "0", "2bb", "2", "b11", "2b2", "b1", "2b", "0b", "b", "020", "1b", "b20", "b0b", "b0b", "b", "b0", "bb", "212", "b0b", "2b0", "bb0", "2b", "0", "2", "002", "b", "b2", "2bb", "0", "1b", "bb", "0", "b0", "2b", "b", "1b", "b", "bb", "0bb", "2b", "02", "0", "b" };
    assertArrayEquals(new String[] { "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case100() {
    int[] cubes = { 3, 7, 0 };
    int B = 42;
    int w = 32;
    String[] views = { "011110011", "0", "1b01b1b0b111bbbb1", "b0b0b1111001", "1b11101bb0bb11", "1b11bb0bb111111bb1b", "111b121b1b11", "1b10b1bb1101b0", "101bb1bbb1101", "0bb", "0110111b111bb", "1111bb", "0b1", "011bbb12b002b10b1", "b2b11b0bbb110b0110", "10010211", "b1bb11b0bb10b101", "010b1b0bb", "b1bb1bb1", "0111bbbbb", "0011b111bb1", "b0b11011b211bb110", "b0", "120b0110bb0101001", "1bb", "0011110101b2011b", "bb101", "0bb", "bbb11b11010b1110b", "1111bb01b1bb21", "b11bbb1b11bb1b0b", "b1b10b1", "b1b11000b11b", "110110bb", "bbb1" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case101() {
    int[] cubes = { 0, 1, 0 };
    int B = 63;
    int w = 10;
    String[] views = { "1b", "110b102b1b10", "b", "0b200b20b0000100b10b100202b0b000001", "2021200000b1b21111", "0b100b01", "110200b11", "bbb10b110110001002b11b0bbbbb02b0", "1120202b00b" };
    assertArrayEquals(new String[] { "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case102() {
    int[] cubes = { 14, 41, 38 };
    int B = 38;
    int w = 29;
    String[] views = { "1b1211b211211211121111221b211", "2bbb1bb2b1b1b21bbb1b211121112bb1212b1bbbb11b", "12111", "1b11b12bb11b22bb11b1b221111bb111b1b2b1", "111bbbb11b12bbb11bbbb1bbb111b11b11b2212", "b2b11b11bb2bb1111bb11bb1b112b111b2b21", "bbbbb2211bb2b2bb21bb11212b0211b1b11b1121111b1", "21b1111bbb1b2b21112111112", "2b22bb1b2b11211b", "11b11bbbb221112111b11b111121b111", "1b222212", "11bb11bb11b1bb1b21112b11111212bb121102bbbb", "11bb1b11b12b2121b2b1122b1212b2b", "b", "b21b1211121221b1112121b11211bb1b122b", "2bb211bb121122111221111b11b21bb11b22bbbbb", "1", "1b1bbbb1b111b11122b12b11b22b22b1" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case103() {
    int[] cubes = { 5, 7, 16 };
    int B = 26;
    int w = 11;
    String[] views = { "00b20b20b012002120b0b101000102b002011120b2", "0b12121002000200021b022bb101", "2200b0000", "b222222b020b010", "0112200002011b22b0bbb01200200b000000", "00b00", "100221b1b2", "2022b12020b011000b2b00011220bb2bb2b001", "2bb000120b0101b1b20001000b00100b0220210", "b00b10bbb1b00b22211201b212102222b021221011b22012", "22210001020b122002020bb2", "b21010", "0b02b2022210121202202212b", "b2b20200b22b0bb2b1220021b012b2b10b22b", "000", "00", "2200b1101102102022202b201202", "22100000000b100020b1010002", "b2020", "22b2b012b120b20110b10202bb20b20200b221b0022022b", "0b0101000", "020220020202b222021100201b20b20022001012b222", "221220b01bb22b11b2bb0b20", "10b020002102b012bb222b02100002b1002b0b000121200", "002000b0100022001220b2000bb21b1200b0b1020", "b00002000b20b002211b1120bbbb21b2bb0b002000020bb2", "012002111002b22220110220112bb0b1200020010", "b2220200", "0002002222bb00b0000002b222002b0b2002002bb22", "222b122bb0012001b0b021020210000100bb12222010b", "1022010022b2200010001b", "0200221", "02022b10", "2200bbb2b2b00b002b0222b2120" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case104() {
    int[] cubes = { 31, 10, 75 };
    int B = 22;
    int w = 4;
    String[] views = { "bb", "22011bb2b211bbb1", "b102b2", "01012122012", "2bb1022b02b1", "10b12b10", "1b211012b1b2210120021012", "bb1bbb20b", "111b2b1bb1212022b", "bbb000122b2b2b122b201011b2", "0b1202b1b0b20111b110b0b210001", "b1bbb21b1200021b2101111b", "bb2b", "221211200bb", "11b0110121120102b0", "01b11b12200bbbb1b212", "121b210b01b1b1222b01b", "0b211", "b1212121221bbb11211b1112202", "112b112b21212b0b211", "0111220100b111b2b0", "222b2022202012b0b11", "b2bb02b1bbb210202011", "12b0211222", "2121111b2b22", "20b22b0b010b0022", "b1b01212b11b12111", "b110", "2bb2", "b2", "12b1b022000" };
    assertArrayEquals(new String[] { "valid", "valid", "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case105() {
    int[] cubes = { 10, 18, 14 };
    int B = 28;
    int w = 1;
    String[] views = { "0" };
    assertArrayEquals(new String[] { "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case106() {
    int[] cubes = { 83, 20, 2 };
    int B = 5;
    int w = 10;
    String[] views = { "1020010bb020b01bb0b1b1", "2022b010010b01011bbb11", "01100", "011001200bbb111bb000bb", "1201b1b1bb210010b21001b00b00", "0bbb11b102b00112000bb00b1100120", "1000b120b0b0022020b1011", "10210b2b02b", "b1b1bb0102b020b0022b1100b01b111", "b11111000b212b", "1020b11", "10102", "b1011bb0b20b10", "0110201b2102b0", "1111101", "11bb2b", "21100b20000", "11b00bb0b0b1110212200000", "011221212", "0101212000b0b112b1", "211b022bb1101b0bb1000", "110b201", "bbb1b0bbbbb2", "0b1b00", "0221bb00111b0220", "010b012b221b011012b102111b0", "1b21120", "b02b10b110001b0012b2", "11b22bbb2112000012", "b0b0b11201b0b1b1b00", "2b11111021001001b2b0122112221b", "110", "02b2000", "000b22b000101112021b00b01b120", "121102b02b12b01", "10b000b1bb002101211", "bb0211202bb01011b2b0b1210021", "b2b01b0b", "1b0bbb010bb1120102b", "b00b11", "b0bb10b10bb11110bbb0021101bb1", "1b000", "001bb0101b1b0b", "01b111100", "010b2b0b1100b011bb11b011bb", "b01bb1001bbb110bb11b00200", "00b00100000b", "1b1020b0111" };
    assertArrayEquals(new String[] { "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case107() {
    int[] cubes = { 19, 26, 37 };
    int B = 2;
    int w = 37;
    String[] views = { "1bb1b010b1b1bbbb00bb011b1", "1000b0bb000001", "b0b1b10b01000b01bbb1101", "b010002112bbb0bb00b10b", "0b0b10b02", "1bbb1011b1000bb001b0bb00", "b010", "01110b0012001b", "0b0000bb0b0bb1b0b100b10", "b100b12bb1000b0b001b11b0000", "0100bbb1b100bb0b0b01b00b001", "b0b00bbb210bb01bb00", "011110b", "10b1b1b101bb100b01100b0b0bbb", "01b0bb1b0b0b0010110bb", "0bbb0bb0b10101bb10bb0b00bb1bb1b10", "b01001bbb1b2bb1bb01b00", "010bbb00b0bbb00bb11b011bb00bb00001", "00b0bbbb01", "1b00b000b1bbb201b1010b10", "b100bb0b10b0b00b111bb1b1b0bbb1b0011", "b00002011bb0", "120b", "0b000b1011111011b1bbb111b01b0000", "bbb0b1100b0000101" };
    assertArrayEquals(new String[] { "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case108() {
    int[] cubes = { 1, 3, 2 };
    int B = 99;
    int w = 11;
    String[] views = { "100", "020201", "0b02b11", "1", "0120b11", "121b", "101b12", "1110210", "11b12", "22", "2", "1b2221", "210212", "022b0", "22b1", "12", "10", "0111011", "b01", "2111", "020", "112212", "1122", "000102", "1", "11b11", "b", "2", "10210", "1b01212", "b11", "010122", "210", "b0", "201", "1b2202", "10221", "0b2122" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case109() {
    int[] cubes = { 58, 27, 39 };
    int B = 20;
    int w = 11;
    String[] views = { "b22b0202211bb2b221bb2b1b00010bb0", "b2bb2b22000bb020b22001212b201", "b10", "b2b0020b00bbbbbbbb002", "0b2b0b22b2b2", "b0b202bbbb0b12", "0b002b2b2bbbb0bb2", "00b0bb1b1bbb220bb0b", "000b22100222220bbb0b00", "b00bb10bbbb2b2b0bbb0212b20b0", "02bbb002202000b20bbb02bb00b020bb220bb000b0b0b200", "21bb0b020bbbbb0bb0001bb0b2bb10bb2221b02b", "20b22b022202020122000b0b020b2bb202bbbb120", "b22b0bbbb0b002b0", "01b0b2b22b0b02bb0b00b1b002b2b00b12", "2", "02b02102000bbb000b0bbbb22b20b202b1b12bbbb0b2b0bb", "0b000b22120b0bb22bbbb2000b1000b120b2b0020", "01bb2bb1bbbb20bbb00b2202bbb2", "b222210010b2b11bbb10b222b00b1120b2b02bb0b00b", "b0b01b0222bb2b12bb02bb0b0", "b020b00220b0b0200b20bbb1b02b2bb0020bb", "20b1bb2", "21bbb2202222bb1bb020b0b211bb02001bbb20b2b22", "12021bb0222022012b2bb0bb21001b2b2200bbbb212", "20bb2b0b22210010bbbb220b2122b02b20", "bb11bbbbb212bb0b221002b21000bbb00212bb1b2b2", "bb", "02bbb10bb2bb0bbb0bbb2020b0110b00b0020b01", "02bb02bb0b0b21bb00022b1b0200bb0bb120bb0b0b0b", "2b021bb2b00002000b21", "0b112b0bb0b", "00b02b201b1010b00b02b00b0bb20bbb2122", "2b0b120011", "20b202b0021b0200b0b0b110b02b21b1b002bb0b2b", "0202001b2b0b1b", "b101bbbbbbb2200210bb21", "0b02bb2b1b0b1bb0b0", "b0", "2bb00bb0", "12011002b0b020bbb000b200102b02b021", "b2bb2021b000b0b0b002b02b0bbbb2200b0b20021b222b0", "b0b02", "b02bb0bb2bb2bb2bb200bb1bbbb22b20b2b201b0b0b2bb1", "2b0b21bbbbb0b0b20b1bbb0222b2", "bb20bbbb12bbb12bbb02bbb1212b00bb0b", "b022b002b2bb22010022200b12b0bb1b20bb0b20b02bb2bbb", "b000bb022220bbbb0b1b100bbb0b2b200bbb021bb02", "2bb2bbb00bbb2b1bb1b000202b12b000b022", "0b" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "valid", "valid", "valid", "valid", "invalid", "valid", "invalid", "valid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid", "valid", "invalid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case110() {
    int[] cubes = { 28, 34, 20 };
    int B = 8;
    int w = 1;
    String[] views = { "10b110010bb0000b", "b01112101b1000000bb01100", "01101100001100010111b000", "11b011100b0", "0110bb021001b1b12000001010b1b110b01000", "0b01", "0100", "bb01", "00121020110", "11100bb00001000101001b1111", "0010110b0110b1100b10210101111b1011b100", "0101b00100110100000011010", "00b110001000110b0", "010000b10111", "00b11100100011101001000b000b0100011000", "0100b01000010b010011011000b", "100010020100011010000", "bb000101000b0200011b100b10bb00101000", "b001111000b00b001b01b0b01020210020b11", "1110100bb10b1000b101", "111012bb0", "0000110bb001bbb00", "0b010110b10001111100101", "0b0b", "011000", "210001001b001010001b0010b0", "01b1b010", "001b10b0b101010", "b100000", "010b10101000001010b1b1b1bb", "b11b01001b10b0b01b01b", "00b0b110020010000011002b0", "100001bb1b0b00000", "1b1b00101001100010000001100b1001b", "0000bb00b010010011b10010001b101101000b", "000", "0101001b000110001001210", "b01101bb001001101101b11b01021001010", "0b200102b0001000111bb01b0001211b1b00b1", "00bb0001110001011b1011b01", "110b0211111b10012b", "11112010b010bb00b22b0010b00b20010bb", "00b0b00110b", "01b111bb000b10011101bb0b1011b00", "101101110b1bb100110", "000101000110100b01000b1000", "00100201bb210111001000b01111001", "0" };
    assertArrayEquals(new String[] { "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case111() {
    int[] cubes = { 31, 5, 43 };
    int B = 27;
    int w = 2;
    String[] views = { "1bb1b21120111b0b112b222b", "21012bbb120", "121b21", "1111", "11b1b21b112111b1b1bbb210212", "1b11b220122", "1b1bb111b", "01b1b112212b1b10212", "12122b" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case112() {
    int[] cubes = { 0, 1, 0 };
    int B = 3;
    int w = 2;
    String[] views = { "b", "bb", "bbb", "bbbb", "bbbbb", "bbbbbb", "1", "1b", "1bb", "1bbb", "1bbbb", "1bbbbb", "1bbbbbb", "b1", "b1b", "b1bb", "b1bbb", "b1bbbb", "b1bbbbb", "bb1", "bb1b", "bb1bb", "bb1bbb", "bb1bbbb", "bbb1", "bbb1b", "bbb1bb", "bbb1bbb", "bbbb1", "bbbb1b", "bbbb1bb", "bbbbb1", "bbbbb1b", "bbbbbb1" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "valid", "valid", "valid", "invalid", "valid", "invalid", "invalid", "invalid", "invalid", "valid", "invalid", "valid", "invalid", "invalid", "valid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case113() {
    int[] cubes = { 2, 0, 1 };
    int B = 2;
    int w = 2;
    String[] views = { "b", "bb", "bbb", "bbbb", "bbbbb", "bbbbbb", "1", "1b", "1bb", "1bbb", "1bbbb", "1bbbbb", "1bbbbbb", "b1", "b1b", "b1bb", "b1bbb", "b1bbbb", "b1bbbbb", "bb1", "bb1b", "bb1bb", "bb1bbb", "bb1bbbb", "bbb1", "bbb1b", "bbb1bb", "bbb1bbb", "bbbb1", "bbbb1b", "bbbb1bb", "bbbbb1", "bbbbb1b", "bbbbbb1" };
    assertArrayEquals(new String[] { "invalid", "valid", "valid", "valid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid", "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

  @Test
  public void case114() {
    int[] cubes = { 1, 0, 1 };
    int B = 1;
    int w = 1;
    String[] views = { "0bb1" };
    assertArrayEquals(new String[] { "invalid" }, skewedperspectives.areTheyPossible(cubes, B, w, views));
  }

}
