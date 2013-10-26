package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class HammingNumbersTest {
  HammingNumbers hammingnumbers = new HammingNumbers();

  @Test
  public void case1() {
    int[] factors = { 2, 3, 5 };
    int n = 15;
    assertEquals(24, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case2() {
    int[] factors = { 2, 2, 2, 4, 4, 4, 8, 8, 8 };
    int n = 11;
    assertEquals(1024, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case3() {
    int[] factors = { 7, 9, 14, 6 };
    int n = 52;
    assertEquals(4802, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case4() {
    int[] factors = { 4, 11, 15, 21, 29, 28 };
    int n = 2841;
    assertEquals(2146636800, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case5() {
    int[] factors = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 };
    int n = 100000;
    assertEquals(532287, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case6() {
    int[] factors = { 127, 119, 194, 265, 281, 42, 79, 97, 220, 171, 74, 104, 99, 46, 259, 132, 179, 126, 88, 9, 156, 280, 118, 139, 166, 276, 46, 222, 266 };
    int n = 34849;
    assertEquals(975813210, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case7() {
    int[] factors = { 195, 219, 224, 228, 157, 148, 183, 49, 193, 257, 218, 16 };
    int n = 53742;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case8() {
    int[] factors = { 17, 285, 75, 67, 19, 50, 152, 150, 178, 121, 153, 50, 126, 104, 179, 74, 160, 47, 214, 268, 74, 194, 295, 107, 238, 38, 28, 232, 285, 253, 136, 185, 224, 174 };
    int n = 26354;
    assertEquals(184208192, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case9() {
    int[] factors = { 232, 70, 230, 136, 51, 28, 227, 236, 146, 47, 209, 184, 11, 285, 27, 102, 89, 130 };
    int n = 91429;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case10() {
    int[] factors = { 46, 217, 90, 90, 155, 31, 41, 295, 261, 13, 274, 111, 281, 20, 68, 93, 111, 264, 202, 88, 285, 180, 56, 258, 65, 242, 164, 141, 245, 248, 56, 215, 73 };
    int n = 1418;
    assertEquals(436480, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case11() {
    int[] factors = { 265, 19, 129, 109, 73, 185, 237, 53, 103, 135, 240, 106, 215, 266, 191, 72, 272, 182, 63, 171, 86, 296, 82, 7, 275, 227, 153, 258, 257, 76, 7, 271, 150, 274, 164, 217, 42, 27, 87, 290, 263, 238, 267, 222, 147, 3, 148, 68, 161 };
    int n = 79514;
    assertEquals(72886485, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case12() {
    int[] factors = { 21, 108, 258, 262, 211, 22, 53, 60, 103, 239, 290, 122 };
    int n = 35059;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case13() {
    int[] factors = { 192, 48, 203, 194, 46, 76, 31, 30, 26, 165, 188, 122, 245, 171, 153, 18, 54, 207, 84, 266, 180, 182, 262, 155, 286, 279, 248, 42, 70, 106, 220, 81, 215, 276, 101, 75, 185, 60 };
    int n = 7870;
    assertEquals(3636360, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case14() {
    int[] factors = { 251, 39, 162, 13, 94, 120, 237, 208, 83, 291, 249, 226, 263, 82, 7, 231, 279, 45, 256, 54, 238, 121, 195, 45, 40, 28, 96, 275, 269, 102, 288, 109, 244, 173, 285 };
    int n = 69394;
    assertEquals(623143521, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case15() {
    int[] factors = { 271, 256, 38, 297, 293, 106, 69, 45, 100, 86, 251, 272, 34, 136, 129, 38, 239, 150, 249, 188, 229, 159, 273, 272, 156, 149, 268, 120, 165, 149, 216, 70, 173, 177, 115, 168, 143, 288, 141, 231, 132, 206, 284, 275, 169, 81, 230 };
    int n = 71453;
    assertEquals(454989312, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case16() {
    int[] factors = { 120, 23, 89, 225, 42, 188, 211, 51, 238, 154, 260, 135, 89, 143, 81, 89, 251, 259, 41, 112, 240, 231, 109, 272, 249, 4, 199, 173, 291, 119, 204, 22, 115, 41, 289, 251, 33, 104 };
    int n = 70556;
    assertEquals(445800996, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case17() {
    int[] factors = { 215, 130, 24, 222, 125, 99, 253, 240, 120, 269, 237, 50, 246, 95, 292, 14, 215, 205, 166, 8, 182, 65, 94, 64, 106, 277, 138, 128, 5, 38, 138, 85, 17, 32, 289, 192, 88, 260, 280, 227, 130, 82, 26, 157 };
    int n = 79742;
    assertEquals(194457424, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case18() {
    int[] factors = { 194, 93, 47, 206, 103, 82, 48, 287, 27, 138, 17, 233, 204, 210, 172, 125, 50, 10, 12, 126, 17, 115, 233, 252, 297, 115, 225, 283, 157, 95, 84, 288, 19, 229, 108, 111, 282, 13, 244 };
    int n = 65123;
    assertEquals(147993318, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case19() {
    int[] factors = { 60, 294, 234, 204, 92, 60, 99, 284, 236, 173, 262, 270, 213, 3, 69, 158, 109, 96, 10, 90, 281, 224, 198, 126, 235, 237, 143, 135, 160, 131 };
    int n = 30336;
    assertEquals(382153200, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case20() {
    int[] factors = { 192, 216, 16, 129, 285, 160, 261, 233, 104, 8, 20, 295, 298, 70, 288, 277, 49, 19, 221 };
    int n = 66311;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case21() {
    int[] factors = { 296, 138, 233, 118, 219, 169, 66, 235, 139, 171, 266, 175, 184, 206, 50, 44, 272, 34, 274, 264, 29, 124, 44, 73, 190, 112, 244, 208, 249, 22, 126, 87, 296, 236, 166, 297, 201, 142, 19, 6, 178, 74 };
    int n = 40430;
    assertEquals(57438444, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case22() {
    int[] factors = { 140, 87, 134, 106, 263, 4, 60, 18, 119, 40, 34, 177, 50, 193, 4, 46, 204, 54, 24, 256, 245, 123, 84, 223, 265, 171, 52, 227, 81, 3, 80, 92, 42, 296, 13, 177, 260, 196, 95, 270, 291, 21 };
    int n = 76514;
    assertEquals(98585550, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case23() {
    int[] factors = { 273, 251, 130, 44, 185, 188, 110, 18, 84, 83, 8, 203, 291, 244, 168, 111, 161, 270, 272, 247, 169, 201, 170 };
    int n = 96227;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case24() {
    int[] factors = { 268, 259, 84, 60, 221, 261, 5, 68, 30, 120, 267, 55, 195, 40, 90, 298, 100, 142, 298, 67, 264, 230, 134 };
    int n = 27552;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case25() {
    int[] factors = { 292, 8, 277, 182, 39, 145, 187, 237, 290, 230, 198, 231, 70, 68 };
    int n = 57096;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case26() {
    int[] factors = { 33, 268, 291, 136, 250, 36, 233, 148, 258, 215, 133, 109, 187, 192, 17, 159, 184, 220, 124, 130, 47, 7, 90, 186, 71, 149, 148, 145, 212, 247, 195, 99, 177, 277, 248, 90, 81, 186, 62, 238 };
    int n = 24615;
    assertEquals(39261500, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case27() {
    int[] factors = { 178, 170, 164, 65, 142, 189, 239, 5, 144, 170, 15, 285, 272, 120, 150, 89, 57, 189, 167, 294, 66, 109, 81, 101, 79, 194, 185, 202, 85, 121, 32, 189, 200, 61, 248, 124, 268 };
    int n = 31992;
    assertEquals(86658000, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case28() {
    int[] factors = { 150, 2, 43, 16, 154, 201, 280, 180, 3, 89, 180, 255, 13, 235, 181, 222, 63, 190, 236, 228, 203, 128, 54, 42, 144, 73 };
    int n = 12950;
    assertEquals(7539840, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case29() {
    int[] factors = { 295, 43, 155, 189, 266, 206, 155, 19, 212, 124 };
    int n = 96342;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case30() {
    int[] factors = { 300, 299, 298, 297, 296, 295 };
    int n = 1;
    assertEquals(1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case31() {
    int[] factors = { 300, 299, 298, 297, 296, 295 };
    int n = 2;
    assertEquals(295, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case32() {
    int[] factors = { 81, 280, 137, 169, 267, 215 };
    int n = 3;
    assertEquals(137, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case33() {
    int[] factors = { 191, 208, 69, 107, 192, 138, 227, 296, 37, 183 };
    int n = 72083;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case34() {
    int[] factors = { 139, 178, 4, 77, 93, 198, 163 };
    int n = 74642;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case35() {
    int[] factors = { 270, 199, 21, 122, 78, 209, 266, 276, 216 };
    int n = 57864;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case36() {
    int[] factors = { 88, 133, 185 };
    int n = 59344;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case37() {
    int[] factors = { 280, 36, 76, 207, 281, 241, 112 };
    int n = 322;
    assertEquals(2137608063, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case38() {
    int[] factors = { 280, 36, 76, 207, 281, 241, 112 };
    int n = 323;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case39() {
    int[] factors = { 68, 224, 38, 45, 288, 241, 176, 100, 277 };
    int n = 779;
    assertEquals(2138137600, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case40() {
    int[] factors = { 68, 224, 38, 45, 288, 241, 176, 100, 277 };
    int n = 780;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case41() {
    int[] factors = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 2, 3, 5, 7, 11, 2, 3, 5, 7, 11 };
    int n = 100000;
    assertEquals(3247398, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case42() {
    int[] factors = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int n = 100000;
    assertEquals(7381125, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case43() {
    int[] factors = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 6, 10, 14, 22, 26, 34, 46, 58, 62, 74, 82, 86, 94, 106, 15, 21, 33, 39, 51, 57, 69, 87, 93, 111, 123, 129, 141, 159, 35, 55, 65, 85, 95, 115 };
    int n = 100000;
    assertEquals(7381125, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case44() {
    int[] factors = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 };
    int n = 100000;
    assertEquals(532287, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case45() {
    int[] factors = { 7, 9, 14, 6 };
    int n = 52;
    assertEquals(4802, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case46() {
    int[] factors = { 4, 11, 15, 21, 29, 28 };
    int n = 2841;
    assertEquals(2146636800, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case47() {
    int[] factors = { 144, 100, 300 };
    int n = 33;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case48() {
    int[] factors = { 300 };
    int n = 100000;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case49() {
    int[] factors = { 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 231, 295, 300 };
    int n = 100000;
    assertEquals(12112947, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case50() {
    int[] factors = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int n = 15;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case51() {
    int[] factors = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74 };
    int n = 30000;
    assertEquals(42750240, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case52() {
    int[] factors = { 154 };
    int n = 6;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

  @Test
  public void case53() {
    int[] factors = { 4 };
    int n = 17;
    assertEquals(-1, hammingnumbers.getNumber(factors, n));
  }

}
