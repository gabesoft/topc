package topc.test.encryption;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.encryption.*;

public class UTF8DecodeTest {
  UTF8Decode utf8decode = new UTF8Decode();

  @Test
  public void case1() {
    int[] bytes = { 10, 207, 168, 226, 156, 144, 240, 152, 154, 160 };
    assertArrayEquals(new int[] { 10, 1000, 10000, 100000 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case2() {
    int[] bytes = { 10, 255, 207, 17, 168, 193, 226, 156, 144, 240, 143, 152, 154, 160, 240, 152, 154 };
    assertArrayEquals(new int[] { 10, 1000, 10000, 100000 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case3() {
    int[] bytes = { 191, 192, 193, 245, 255, 128, 129, 130, 189, 190, 191, 1 };
    assertArrayEquals(new int[] { 1 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case4() {
    int[] bytes = { 192, 170, 193, 191, 194, 128 };
    assertArrayEquals(new int[] { 128 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case5() {
    int[] bytes = { 224, 159, 191, 160 };
    assertArrayEquals(new int[] { 4064 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case6() {
    int[] bytes = { 225, 159, 128 };
    assertArrayEquals(new int[] { 6080 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case7() {
    int[] bytes = { 240, 143, 160, 127, 255, 175, 175 };
    assertArrayEquals(new int[] { 134127 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case8() {
    int[] bytes = { 242, 242, 128, 128, 128 };
    assertArrayEquals(new int[] { 524288 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case9() {
    int[] bytes = { 244, 144, 160, 136, 191, 191 };
    assertArrayEquals(new int[] { 1085439 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case10() {
    int[] bytes = { 245, 242, 191, 191, 191, 194 };
    assertArrayEquals(new int[] { 786431 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case11() {
    int[] bytes = { 93, 44, 118, 4, 111, 116, 98, 49, 106, 124, 87, 101, 60, 55, 47, 35, 81, 66, 34, 2, 29, 51, 3, 116, 96, 31, 36, 84, 36, 43, 11, 75, 110, 96, 103, 97, 70, 20, 95, 71, 62, 114, 1, 1, 103, 65, 12, 82, 12, 8 };
    assertArrayEquals(new int[] { 93, 44, 118, 4, 111, 116, 98, 49, 106, 124, 87, 101, 60, 55, 47, 35, 81, 66, 34, 2, 29, 51, 3, 116, 96, 31, 36, 84, 36, 43, 11, 75, 110, 96, 103, 97, 70, 20, 95, 71, 62, 114, 1, 1, 103, 65, 12, 82, 12, 8 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case12() {
    int[] bytes = { 192, 243, 27, 159, 223, 109, 193, 93, 125, 126, 5, 69, 19, 114, 139, 101, 112, 38, 207, 106, 161, 9, 169, 153, 226, 216, 33, 34, 154, 207, 252, 0, 56, 163, 214, 239, 110, 244, 255, 185, 213, 83, 175, 249, 35, 32, 246, 73, 90, 85 };
    assertArrayEquals(new int[] { 914145, 9, 9891, 1465, 1391, 35, 32, 73, 90, 85 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case13() {
    int[] bytes = { 76, 95, 228, 250, 1, 100, 167, 59, 165, 27, 87, 32, 49, 22, 100, 236, 1, 111, 209, 100, 155, 35, 156, 47, 135, 56, 114, 131, 32, 73, 24, 104, 92, 221, 107, 12, 222, 60, 24, 113, 130, 217, 180, 144, 106, 136, 137, 234, 24, 173 };
    assertArrayEquals(new int[] { 76, 95, 18917, 27, 87, 32, 49, 22, 100, 50908, 47, 56, 114, 32, 73, 24, 104, 92, 1858, 1652, 106 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case14() {
    int[] bytes = { 109, 16, 227, 154, 196, 94, 22, 112, 200, 163, 56, 115, 85, 118, 156, 140, 2, 62, 209, 98, 251, 8, 92, 70, 96, 50, 46, 223, 73, 135, 11, 88, 200, 80, 147, 55, 139, 9, 230, 147, 154, 242, 74, 128, 147, 188, 16, 10, 41, 148 };
    assertArrayEquals(new int[] { 109, 16, 13987, 56, 115, 85, 118, 2, 62, 1095, 11, 88, 531, 55, 9, 25818, 525564, 16, 10, 41 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case15() {
    int[] bytes = { 193, 20, 15, 189, 185, 110, 243, 114, 241, 7, 203, 52, 201, 150, 152, 103, 143, 232, 76, 194, 201, 228, 67, 129, 38, 214, 68, 93, 205, 239, 95, 213, 253, 213, 80, 173, 22, 53, 137, 86, 56, 236, 77, 167, 71, 80, 34, 78, 208, 33 };
    assertArrayEquals(new int[] { 20, 15, 110, 878095, 32877, 22, 53, 86, 56 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case16() {
    int[] bytes = { 155, 116, 113, 203, 167, 149, 90, 141, 113, 218, 254, 73, 177, 12, 205, 194, 187, 18, 150, 200, 226, 190, 130, 213, 156, 152, 185, 145, 253, 101, 156, 126, 40, 233, 34, 126, 148, 188, 20, 146, 26, 91, 119, 17, 78, 232, 21, 111, 101, 201 };
    assertArrayEquals(new int[] { 116, 113, 743, 90, 113, 1713, 12, 891, 18, 574, 1372, 101, 126, 40, 38204, 20, 26, 91, 119, 17, 78 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case17() {
    int[] bytes = { 170, 159, 154, 248, 242, 141, 218, 197, 216, 132, 248, 138, 200, 200, 161, 253, 226, 199, 239, 136, 248, 188, 140, 204, 231, 172, 150, 203, 160, 236, 250, 128, 177, 240, 232, 234, 202, 156, 248, 216, 189, 174, 236, 201, 200, 205, 220, 138, 203, 201 };
    assertArrayEquals(new int[] { 577802, 545, 8764, 812, 736, 49201, 118638 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case18() {
    int[] bytes = { 181, 181, 156, 186, 150, 154, 146, 132, 164, 178, 190, 157, 179, 186, 191, 164, 187, 141, 135, 167, 147, 149, 185, 142, 168, 173, 191, 189, 183, 150, 188, 165, 138, 151, 162, 174, 175, 179, 186, 186, 166, 176, 164, 145, 183, 129, 150, 167, 173, 144 };
    assertArrayEquals(new int[] {  }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case19() {
    int[] bytes = { 218, 195, 216, 200, 243, 232, 226, 252, 247, 218, 228, 235, 232, 238, 251, 213, 237, 219, 205, 221, 199, 198, 246, 212, 230, 232, 255, 244, 250, 223, 235, 196, 215, 192, 220, 237, 217, 238, 202, 204, 252, 240, 245, 220, 244, 203, 232, 192, 215, 193 };
    assertArrayEquals(new int[] {  }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case20() {
    int[] bytes = { 159, 182, 134, 76, 152, 190, 139, 179, 180, 74, 183, 156, 79, 92, 112, 113, 101, 117, 68, 138, 110, 132, 164, 118, 101, 74, 189, 64, 184, 158, 180, 173, 103, 114, 167, 166, 73, 158, 171, 87, 77, 154, 131, 110, 137, 115, 94, 118, 170, 187 };
    assertArrayEquals(new int[] { 76, 74, 79, 92, 112, 113, 101, 117, 68, 110, 118, 101, 74, 64, 103, 114, 73, 87, 77, 110, 115, 94, 118 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case21() {
    int[] bytes = { 91, 67, 93, 149, 175, 156, 194, 91, 143, 190, 178, 131, 77, 109, 85, 96, 97, 153, 117, 187, 130, 150, 193, 116, 108, 106, 78, 70, 92, 182, 111, 110, 189, 186, 131, 125, 198, 84, 144, 83, 151, 113, 170, 183, 103, 164, 108, 72, 117, 172 };
    assertArrayEquals(new int[] { 91, 67, 93, 143, 77, 109, 85, 96, 97, 117, 116, 108, 106, 78, 70, 92, 111, 110, 125, 400, 83, 113, 103, 108, 72, 117 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case22() {
    int[] bytes = { 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245, 245 };
    assertArrayEquals(new int[] {  }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case23() {
    int[] bytes = { 240, 1 };
    assertArrayEquals(new int[] {  }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case24() {
    int[] bytes = {  };
    assertArrayEquals(new int[] {  }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case25() {
    int[] bytes = { 76, 95, 228, 250, 1, 100, 167, 59, 165, 27, 87, 32, 49, 22, 100, 236, 1, 111, 209, 100, 155, 35, 156, 47, 135, 56, 114, 131, 32, 73, 24, 104, 92, 221, 107, 12, 222, 60, 24, 113, 130, 217, 180, 144, 106, 136, 137, 234, 24, 173 };
    assertArrayEquals(new int[] { 76, 95, 18917, 27, 87, 32, 49, 22, 100, 50908, 47, 56, 114, 32, 73, 24, 104, 92, 1858, 1652, 106 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case26() {
    int[] bytes = { 1, 228, 250, 1, 100, 167, 59, 165, 191, 1, 10, 255, 1, 123, 207, 34, 17, 2, 168, 168, 193, 3, 168, 226, 156, 4, 191, 144, 240, 5, 143, 152, 191, 6, 154, 160, 7, 240, 191, 152, 8, 154, 69, 191, 1 };
    assertArrayEquals(new int[] { 1, 18917, 1, 10, 1, 123, 1000, 3, 10047, 102362, 7, 259610, 69, 1 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case27() {
    int[] bytes = { 10, 207, 168, 226, 156, 144, 240, 152, 154, 160 };
    assertArrayEquals(new int[] { 10, 1000, 10000, 100000 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case28() {
    int[] bytes = { 33, 46, 192, 140, 188, 210, 3, 111, 228, 80, 203, 169, 45, 207, 174, 54, 165, 30, 16, 176, 224, 69, 208, 185, 50, 206, 225, 216, 234, 167, 28, 213, 72, 103, 131, 242, 206, 203, 85, 64, 18, 112, 118, 38, 49, 19, 70, 168, 120, 155 };
    assertArrayEquals(new int[] { 33, 46, 1193, 45, 1006, 54, 30, 16, 3687, 28, 1347 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case29() {
    int[] bytes = { 240, 192 };
    assertArrayEquals(new int[] {  }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case30() {
    int[] bytes = { 193, 128, 224, 159, 191, 240, 143, 191, 191, 244, 144, 128, 128 };
    assertArrayEquals(new int[] { 4047 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case31() {
    int[] bytes = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 255, 255, 255, 255 };
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, utf8decode.decodeString(bytes));
  }

  @Test
  public void case32() {
    int[] bytes = { 244, 144, 143, 191, 191 };
    assertArrayEquals(new int[] { 1114111 }, utf8decode.decodeString(bytes));
  }

}
