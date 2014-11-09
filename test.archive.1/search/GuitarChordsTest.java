package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class GuitarChordsTest {
  GuitarChords guitarchords = new GuitarChords();

  @Test
  public void case1() {
    String[] strings = { "D#" };
    String[] chord = { "D#" };
    assertEquals(0, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case2() {
    String[] strings = { "C", "C#", "F" };
    String[] chord = { "C#", "D", "G" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case3() {
    String[] strings = { "D", "E", "C", "A#" };
    String[] chord = { "A", "B", "C#", "F" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case4() {
    String[] strings = { "C", "C" };
    String[] chord = { "B", "C#" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case5() {
    String[] strings = { "B", "A", "F#", "D", "C#", "E" };
    String[] chord = { "D#", "A#", "G" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case6() {
    String[] strings = { "E", "F" };
    String[] chord = { "F#", "D#" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case7() {
    String[] strings = { "A", "A", "A", "A", "A", "A" };
    String[] chord = { "G", "A", "A#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case8() {
    String[] strings = { "A", "A" };
    String[] chord = { "G#", "B" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case9() {
    String[] strings = { "E", "A", "D", "G", "F#", "F" };
    String[] chord = { "E", "G#", "B", "A#" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case10() {
    String[] strings = { "C", "C", "C" };
    String[] chord = { "C", "E", "G" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case11() {
    String[] strings = { "A" };
    String[] chord = { "B" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case12() {
    String[] strings = { "A", "A#", "B" };
    String[] chord = { "F" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case13() {
    String[] strings = { "A", "A", "A", "A", "A" };
    String[] chord = { "A#", "A", "G#", "G", "F#" };
    assertEquals(5, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case14() {
    String[] strings = { "D#", "G#", "A#", "C#", "F#" };
    String[] chord = { "A", "B", "C" };
    assertEquals(7, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case15() {
    String[] strings = { "D", "E" };
    String[] chord = { "D" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case16() {
    String[] strings = { "A", "B", "C", "D", "E", "F" };
    String[] chord = { "D" };
    assertEquals(9, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case17() {
    String[] strings = { "A", "B", "C", "D#", "F#", "D" };
    String[] chord = { "C", "E", "G", "A", "B" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case18() {
    String[] strings = { "B", "A", "F#", "D", "C#", "E" };
    String[] chord = { "D#", "A#", "G", "E", "A" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case19() {
    String[] strings = { "A", "B" };
    String[] chord = { "C" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case20() {
    String[] strings = { "A", "A", "A", "A", "A", "A" };
    String[] chord = { "A", "B", "C", "D", "E", "F" };
    assertEquals(7, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case21() {
    String[] strings = { "A", "A", "A", "A", "A", "A" };
    String[] chord = { "G", "B", "C" };
    assertEquals(6, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case22() {
    String[] strings = { "B", "C", "C#", "D", "D#", "E" };
    String[] chord = { "A#", "B", "C", "C#", "D", "F" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case23() {
    String[] strings = { "A", "A", "A" };
    String[] chord = { "A", "D", "G#" };
    assertEquals(7, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case24() {
    String[] strings = { "A", "A", "A", "A", "A", "A" };
    String[] chord = { "A", "E", "F", "F#", "G" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case25() {
    String[] strings = { "A#", "B", "B" };
    String[] chord = { "A", "C", "C#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case26() {
    String[] strings = { "A", "A", "A" };
    String[] chord = { "A#", "G#", "D" };
    assertEquals(7, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case27() {
    String[] strings = { "E", "A#", "B", "C#", "A", "G" };
    String[] chord = { "D#", "D", "G#", "F" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case28() {
    String[] strings = { "F", "A#", "D", "D#", "E", "B" };
    String[] chord = { "G", "G#", "A", "C", "D" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case29() {
    String[] strings = { "A", "B", "C", "D", "E", "G" };
    String[] chord = { "A#", "C#", "D#", "F#", "G#" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case30() {
    String[] strings = { "E", "A", "D", "G", "B", "E" };
    String[] chord = { "E", "G#", "B", "C#", "A", "D" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case31() {
    String[] strings = { "A#", "F", "G#", "F", "G#", "G#" };
    String[] chord = { "G#", "G", "A", "F", "B", "D#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case32() {
    String[] strings = { "F", "A#", "D", "D#", "E", "B" };
    String[] chord = { "G", "G#", "A", "C", "D", "E" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case33() {
    String[] strings = { "E", "A", "D", "G", "B", "E" };
    String[] chord = { "C" };
    assertEquals(10, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case34() {
    String[] strings = { "A", "G#" };
    String[] chord = { "B", "C" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case35() {
    String[] strings = { "A", "C", "F" };
    String[] chord = { "C#", "F#", "A#" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case36() {
    String[] strings = { "E", "A", "D", "G", "B", "E" };
    String[] chord = { "E", "G#", "B" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case37() {
    String[] strings = { "D#" };
    String[] chord = { "D#" };
    assertEquals(0, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case38() {
    String[] strings = { "E", "F" };
    String[] chord = { "F#", "D#" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case39() {
    String[] strings = { "C", "C", "C" };
    String[] chord = { "C", "E", "G" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case40() {
    String[] strings = { "G" };
    String[] chord = { "G#" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case41() {
    String[] strings = { "B", "B" };
    String[] chord = { "F#", "C" };
    assertEquals(7, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case42() {
    String[] strings = { "C#", "E", "F", "A", "G#", "B" };
    String[] chord = { "C" };
    assertEquals(10, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case43() {
    String[] strings = { "C", "D", "E", "G", "A", "C" };
    String[] chord = { "G#", "C#", "D#", "D", "C", "E" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case44() {
    String[] strings = { "D", "G", "F" };
    String[] chord = { "C#", "B", "F#" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case45() {
    String[] strings = { "G", "A", "F#", "C", "F#", "F" };
    String[] chord = { "G#", "C#", "B", "A", "A#" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case46() {
    String[] strings = { "A", "A#", "F#", "G", "C#" };
    String[] chord = { "C#", "D", "F#", "F" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case47() {
    String[] strings = { "D#", "A#", "E", "G", "B" };
    String[] chord = { "G", "A#", "F" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case48() {
    String[] strings = { "F#", "F", "E", "D#", "B", "B" };
    String[] chord = { "G", "D", "G#", "F#", "A", "C" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case49() {
    String[] strings = { "D#", "F#", "B" };
    String[] chord = { "F#", "D", "C#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case50() {
    String[] strings = { "E", "F#", "A#", "A#", "A", "D" };
    String[] chord = { "D", "C", "G#", "B", "F#", "G" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case51() {
    String[] strings = { "C", "A#", "D#", "C#", "G", "G" };
    String[] chord = { "F#", "C#", "D#", "B", "F", "D" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case52() {
    String[] strings = { "A#", "G", "D", "A#" };
    String[] chord = { "F#", "F", "D", "C#" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case53() {
    String[] strings = { "F#", "F#", "F#", "D#", "G#", "A#" };
    String[] chord = { "F", "G#", "D" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case54() {
    String[] strings = { "C#", "D#", "A#", "D#", "F#", "A" };
    String[] chord = { "C#", "C", "F", "F#", "B", "G#" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case55() {
    String[] strings = { "D#", "G#", "E" };
    String[] chord = { "A", "G#", "C#" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case56() {
    String[] strings = { "E", "B", "E", "G#", "G#", "E" };
    String[] chord = { "B", "G#" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case57() {
    String[] strings = { "D", "G#", "C", "F", "G#", "D#" };
    String[] chord = { "A#", "G#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case58() {
    String[] strings = { "C", "A", "G", "E", "F", "E" };
    String[] chord = { "A", "B" };
    assertEquals(6, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case59() {
    String[] strings = { "E", "G#", "G#", "F", "D#", "D" };
    String[] chord = { "A", "E", "D#", "G#", "D", "F" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case60() {
    String[] strings = { "A", "F", "F", "A", "C#", "G" };
    String[] chord = { "G#", "C", "E", "F#", "A#", "D#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case61() {
    String[] strings = { "C#", "F", "G", "C#", "D", "D" };
    String[] chord = { "D", "G#", "D#", "G", "B", "F#" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case62() {
    String[] strings = { "E", "D#", "F#", "G#", "B", "E" };
    String[] chord = { "C#", "A", "A#" };
    assertEquals(5, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case63() {
    String[] strings = { "D", "B", "F", "D#", "G#", "F#" };
    String[] chord = { "A#", "C", "B" };
    assertEquals(5, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case64() {
    String[] strings = { "F#", "C#", "D", "E", "G#", "E" };
    String[] chord = { "B", "C#", "E" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case65() {
    String[] strings = { "G#", "C#", "F#", "G", "B", "F#" };
    String[] chord = { "E" };
    assertEquals(8, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case66() {
    String[] strings = { "E" };
    String[] chord = { "G#" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case67() {
    String[] strings = { "G#", "G", "E", "A#", "A#", "C" };
    String[] chord = { "C", "F" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case68() {
    String[] strings = { "D#", "B", "E", "G#", "F#", "A#" };
    String[] chord = { "F", "C#", "D", "E", "G#", "F#" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case69() {
    String[] strings = { "G", "C#", "A" };
    String[] chord = { "G", "C" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case70() {
    String[] strings = { "A", "C", "C#", "E", "C#", "F#" };
    String[] chord = { "C", "E", "A#", "F" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case71() {
    String[] strings = { "A#", "E", "A#", "A#", "A#" };
    String[] chord = { "F", "A" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case72() {
    String[] strings = { "C", "C", "C#" };
    String[] chord = { "A#" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case73() {
    String[] strings = { "C", "F", "G#", "B", "D" };
    String[] chord = { "F", "C" };
    assertEquals(4, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case74() {
    String[] strings = { "F", "F", "F", "F", "F", "F" };
    String[] chord = { "E", "F", "F#", "A#", "B", "C" };
    assertEquals(9, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case75() {
    String[] strings = { "D", "D", "D", "D", "D", "D" };
    String[] chord = { "C#", "E", "G", "A#" };
    assertEquals(10, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case76() {
    String[] strings = { "G", "G", "G", "G", "G", "G" };
    String[] chord = { "G#", "A#", "C", "D", "E", "F#" };
    assertEquals(11, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case77() {
    String[] strings = { "G#", "G#", "G#", "G#", "G#", "G#" };
    String[] chord = { "G#", "A#", "C", "D", "E", "F#" };
    assertEquals(9, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case78() {
    String[] strings = { "F#", "B", "G", "A" };
    String[] chord = { "C#", "A", "B" };
    assertEquals(2, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case79() {
    String[] strings = { "B", "G", "B", "C", "D" };
    String[] chord = { "G", "F#", "D", "B" };
    assertEquals(1, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case80() {
    String[] strings = { "C#", "C", "D#", "A#", "D#", "A" };
    String[] chord = { "F", "G#", "E" };
    assertEquals(3, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case81() {
    String[] strings = { "D#", "D#", "D#", "D#", "D#", "D#" };
    String[] chord = { "C#", "E", "G", "A#" };
    assertEquals(10, guitarchords.stretch(strings, chord));
  }

  @Test
  public void case82() {
    String[] strings = { "C", "A#", "G", "B", "F#", "D" };
    String[] chord = { "B", "F#", "A#", "G", "D", "C" };
    assertEquals(0, guitarchords.stretch(strings, chord));
  }

}
