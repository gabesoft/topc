package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TreePlantingTest {
  TreePlanting treeplanting = new TreePlanting();

  @Test
  public void case1() {
    int total = 4;
    int fancy = 2;
    assertEquals(3L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case2() {
    int total = 3;
    int fancy = 1;
    assertEquals(3L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case3() {
    int total = 4;
    int fancy = 3;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case4() {
    int total = 10;
    int fancy = 4;
    assertEquals(35L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case5() {
    int total = 60;
    int fancy = 17;
    assertEquals(686353797976L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case6() {
    int total = 55;
    int fancy = 20;
    assertEquals(7307872110L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case7() {
    int total = 41;
    int fancy = 19;
    assertEquals(8855L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case8() {
    int total = 10;
    int fancy = 3;
    assertEquals(56L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case9() {
    int total = 55;
    int fancy = 35;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case10() {
    int total = 19;
    int fancy = 17;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case11() {
    int total = 58;
    int fancy = 21;
    assertEquals(28781143380L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case12() {
    int total = 45;
    int fancy = 20;
    assertEquals(230230L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case13() {
    int total = 36;
    int fancy = 12;
    assertEquals(5200300L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case14() {
    int total = 22;
    int fancy = 5;
    assertEquals(8568L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case15() {
    int total = 58;
    int fancy = 12;
    assertEquals(52251400851L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case16() {
    int total = 60;
    int fancy = 60;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case17() {
    int total = 60;
    int fancy = 59;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case18() {
    int total = 60;
    int fancy = 31;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case19() {
    int total = 60;
    int fancy = 30;
    assertEquals(31L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case20() {
    int total = 1;
    int fancy = 1;
    assertEquals(1L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case21() {
    int total = 2;
    int fancy = 2;
    assertEquals(0L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case22() {
    int total = 60;
    int fancy = 15;
    assertEquals(511738760544L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case23() {
    int total = 60;
    int fancy = 10;
    assertEquals(12777711870L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case24() {
    int total = 60;
    int fancy = 20;
    assertEquals(269128937220L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case25() {
    int total = 60;
    int fancy = 29;
    assertEquals(4960L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case26() {
    int total = 60;
    int fancy = 30;
    assertEquals(31L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case27() {
    int total = 60;
    int fancy = 22;
    assertEquals(51021117810L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case28() {
    int total = 3;
    int fancy = 2;
    assertEquals(1L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case29() {
    int total = 51;
    int fancy = 15;
    assertEquals(9364199760L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case30() {
    int total = 60;
    int fancy = 17;
    assertEquals(686353797976L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case31() {
    int total = 60;
    int fancy = 12;
    assertEquals(92263734836L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case32() {
    int total = 10;
    int fancy = 4;
    assertEquals(35L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case33() {
    int total = 59;
    int fancy = 20;
    assertEquals(137846528820L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case34() {
    int total = 60;
    int fancy = 25;
    assertEquals(600805296L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case35() {
    int total = 60;
    int fancy = 18;
    assertEquals(608359048206L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case36() {
    int total = 5;
    int fancy = 3;
    assertEquals(1L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case37() {
    int total = 9;
    int fancy = 5;
    assertEquals(1L, treeplanting.countArrangements(total, fancy));
  }

  @Test
  public void case38() {
    int total = 18;
    int fancy = 1;
    assertEquals(18L, treeplanting.countArrangements(total, fancy));
  }

}
