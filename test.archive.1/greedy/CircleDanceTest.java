package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class CircleDanceTest {
  CircleDance circledance = new CircleDance();

  @Test
  public void case1() {
    int[] heights = { 180, 183, 178, 185 };
    assertEquals(5, circledance.arrangeDancers(heights));
  }

  @Test
  public void case2() {
    int[] heights = { 170, 180, 190 };
    assertEquals(20, circledance.arrangeDancers(heights));
  }

  @Test
  public void case3() {
    int[] heights = { 180, 180, 180, 180, 180 };
    assertEquals(0, circledance.arrangeDancers(heights));
  }

  @Test
  public void case4() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 205, 201 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case5() {
    int[] heights = { 155, 192, 169, 162, 174, 155, 180, 184, 150, 180, 192, 198, 199 };
    assertEquals(14, circledance.arrangeDancers(heights));
  }

  @Test
  public void case6() {
    int[] heights = { 171, 189, 206, 164, 196, 205, 168, 175, 202, 170, 159, 151, 173, 153, 198, 184, 169, 168, 153 };
    assertEquals(14, circledance.arrangeDancers(heights));
  }

  @Test
  public void case7() {
    int[] heights = { 173, 163, 156, 199, 156, 193, 206 };
    assertEquals(30, circledance.arrangeDancers(heights));
  }

  @Test
  public void case8() {
    int[] heights = { 179, 189, 156, 150, 186, 199, 170, 171, 202, 208, 205, 151, 207, 172, 193 };
    assertEquals(19, circledance.arrangeDancers(heights));
  }

  @Test
  public void case9() {
    int[] heights = { 161, 154, 164 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case10() {
    int[] heights = { 159, 171, 183, 154 };
    assertEquals(24, circledance.arrangeDancers(heights));
  }

  @Test
  public void case11() {
    int[] heights = { 152, 158, 179, 187, 174, 206, 165, 195, 161, 167, 186, 182, 174, 153, 203 };
    assertEquals(16, circledance.arrangeDancers(heights));
  }

  @Test
  public void case12() {
    int[] heights = { 188, 181, 196, 183, 167, 175, 189, 181, 168, 210 };
    assertEquals(21, circledance.arrangeDancers(heights));
  }

  @Test
  public void case13() {
    int[] heights = { 204, 161, 207, 165, 179, 164, 151, 178, 160, 180, 194, 157, 173 };
    assertEquals(24, circledance.arrangeDancers(heights));
  }

  @Test
  public void case14() {
    int[] heights = { 209, 171, 182, 180, 165, 190, 199, 151, 153, 207, 169, 177 };
    assertEquals(17, circledance.arrangeDancers(heights));
  }

  @Test
  public void case15() {
    int[] heights = { 154, 208, 160, 204, 190, 206, 210, 156, 169, 208, 197 };
    assertEquals(30, circledance.arrangeDancers(heights));
  }

  @Test
  public void case16() {
    int[] heights = { 151, 173, 151 };
    assertEquals(22, circledance.arrangeDancers(heights));
  }

  @Test
  public void case17() {
    int[] heights = { 179, 151, 168, 157 };
    assertEquals(22, circledance.arrangeDancers(heights));
  }

  @Test
  public void case18() {
    int[] heights = { 189, 155, 191, 203, 155, 169, 175, 175, 205, 183, 185, 200, 171, 198 };
    assertEquals(16, circledance.arrangeDancers(heights));
  }

  @Test
  public void case19() {
    int[] heights = { 162, 151, 187, 209, 197, 172, 159, 189, 194, 163, 186 };
    assertEquals(23, circledance.arrangeDancers(heights));
  }

  @Test
  public void case20() {
    int[] heights = { 172, 208, 153, 176, 197, 205, 206, 165, 156, 172, 189, 210 };
    assertEquals(21, circledance.arrangeDancers(heights));
  }

  @Test
  public void case21() {
    int[] heights = { 159, 168, 175, 209, 203, 153, 207, 159, 198 };
    assertEquals(30, circledance.arrangeDancers(heights));
  }

  @Test
  public void case22() {
    int[] heights = { 195, 190, 190, 201, 210, 168 };
    assertEquals(22, circledance.arrangeDancers(heights));
  }

  @Test
  public void case23() {
    int[] heights = { 201, 169, 150, 163, 161, 171 };
    assertEquals(32, circledance.arrangeDancers(heights));
  }

  @Test
  public void case24() {
    int[] heights = { 182, 198, 208, 164, 209, 185, 204, 157, 199, 164, 169, 179, 166, 158, 190, 152 };
    assertEquals(13, circledance.arrangeDancers(heights));
  }

  @Test
  public void case25() {
    int[] heights = { 210, 209, 208, 207, 206, 205, 204, 203, 202, 201, 200, 199, 198, 197, 195 };
    assertEquals(3, circledance.arrangeDancers(heights));
  }

  @Test
  public void case26() {
    int[] heights = { 210, 209, 208, 207, 206, 205, 204, 203, 202, 201, 200, 199, 198, 197, 195, 194 };
    assertEquals(3, circledance.arrangeDancers(heights));
  }

  @Test
  public void case27() {
    int[] heights = { 170, 180, 190 };
    assertEquals(20, circledance.arrangeDancers(heights));
  }

  @Test
  public void case28() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 205, 201 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case29() {
    int[] heights = { 180, 183, 178, 185 };
    assertEquals(5, circledance.arrangeDancers(heights));
  }

  @Test
  public void case30() {
    int[] heights = { 156, 200, 197, 203, 199, 198, 186, 196, 189, 205, 190, 156, 189, 190, 191, 192, 193, 194, 200, 210 };
    assertEquals(33, circledance.arrangeDancers(heights));
  }

  @Test
  public void case31() {
    int[] heights = { 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150 };
    assertEquals(0, circledance.arrangeDancers(heights));
  }

  @Test
  public void case32() {
    int[] heights = { 151, 161, 171, 210, 198, 167, 188, 197, 190, 200, 209, 208, 150, 152, 187, 199, 201, 205, 153, 154 };
    assertEquals(20, circledance.arrangeDancers(heights));
  }

  @Test
  public void case33() {
    int[] heights = { 150, 150, 151, 151, 152, 152, 153, 153, 154, 154, 155, 155, 156, 156, 157, 157, 158, 158, 159, 159 };
    assertEquals(1, circledance.arrangeDancers(heights));
  }

  @Test
  public void case34() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 205, 201, 201, 201, 201, 201, 201, 201, 201, 201 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case35() {
    int[] heights = { 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 169, 168, 167, 166, 165, 164, 163, 162, 161, 160 };
    assertEquals(2, circledance.arrangeDancers(heights));
  }

  @Test
  public void case36() {
    int[] heights = { 202, 192, 152, 198, 152, 173, 203, 174, 166, 195, 200, 168, 193, 202, 163, 187, 189, 185, 157, 166 };
    assertEquals(13, circledance.arrangeDancers(heights));
  }

  @Test
  public void case37() {
    int[] heights = { 200, 199, 197, 194, 190, 185, 179, 172, 160, 159, 157, 157, 190, 160, 159, 158, 157, 156, 155, 154 };
    assertEquals(19, circledance.arrangeDancers(heights));
  }

  @Test
  public void case38() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 205, 201, 176, 195, 205, 201, 194, 184, 181, 199 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case39() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 205, 201, 175, 185, 186, 194, 195, 195, 187, 193 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case40() {
    int[] heights = { 151, 152, 153, 160, 171, 184, 192, 193, 194, 195 };
    assertEquals(24, circledance.arrangeDancers(heights));
  }

  @Test
  public void case41() {
    int[] heights = { 161, 204, 187, 155, 199, 201, 165, 188, 174, 150, 191, 159, 163, 209, 187, 185, 162, 159, 173, 191 };
    assertEquals(13, circledance.arrangeDancers(heights));
  }

  @Test
  public void case42() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 205, 201, 180, 180, 180, 180, 180, 180, 180, 180 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case43() {
    int[] heights = { 184, 165, 175, 186, 192, 200, 176, 192, 194, 168, 186, 162, 177, 182, 199, 209, 179, 199, 192, 166 };
    assertEquals(10, circledance.arrangeDancers(heights));
  }

  @Test
  public void case44() {
    int[] heights = { 177, 196, 157, 195, 172, 182, 154, 207, 179, 164, 152, 186, 160, 162, 160, 192, 196, 178, 192, 153 };
    assertEquals(13, circledance.arrangeDancers(heights));
  }

  @Test
  public void case45() {
    int[] heights = { 155, 155, 155, 167, 194, 185, 175, 201, 193, 167, 201, 209, 168, 183, 192, 183, 164, 193, 200, 192 };
    assertEquals(15, circledance.arrangeDancers(heights));
  }

  @Test
  public void case46() {
    int[] heights = { 157, 210, 201, 170, 191, 195, 181, 200, 163, 188, 191, 166, 206, 177, 184, 174, 204, 206, 163, 202 };
    assertEquals(9, circledance.arrangeDancers(heights));
  }

}
