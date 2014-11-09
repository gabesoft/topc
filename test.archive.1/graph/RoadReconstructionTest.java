package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class RoadReconstructionTest {
  RoadReconstruction roadreconstruction = new RoadReconstruction();

  @Test
  public void case1() {
    String[] roads = { "M1 Moscow Kiev 1", "M2 Minsk Kiev", "M3 Minsk Warsaw" };
    assertEquals("M1", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case2() {
    String[] roads = { "R1 NY Washington", "M1 Moscow StPetersburg 1000" };
    assertEquals("IMPOSSIBLE", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case3() {
    String[] roads = { "B1 Bratislava Havka" };
    assertEquals("", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case4() {
    String[] roads = { "M1 Moscow StPetersburg 1", "M2 Moscow Saratov 2", "S0 Saratov StPetersburg" };
    assertEquals("M1", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case5() {
    String[] roads = { "O1 Beetown Fearnot 6", "N7 Fearnot Hornytown", "M8 Hornytown Belcher 10", "L5 Belcher Fearnot 8", "C7 Fearnot Beetown 4", "K7 Quiggleville Beetown 12", "H4 Beetown DryFork 6", "Z0 Hornytown Belcher 1", "O5 Belcher Quiggleville 10", "U7 Quiggleville Fearnot 2", "A8 Fearnot Quiggleville 8", "T6 Beetown DryFork 17", "E8 Quiggleville DryFork 8", "Y4 DryFork Quiggleville 4", "Q8 Hornytown DryFork 2", "J9 Quiggleville DryFork 19", "M4 DryFork Quiggleville 7", "T1 DryFork Fearnot 9", "G4 Fearnot DryFork 6", "V9 Hornytown Beetown 5", "O6 Quiggleville Beetown 4", "L8 Beetown Roachtown 5", "D5 Belcher DryFork 8", "W5 Belcher DryFork 1" };
    assertEquals("C7 L8 U7 W5 Z0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case6() {
    String[] roads = { "U1 Odd Fearnot 4", "L7 Beetown Odd 10", "M8 Odd Ogle 1", "V6 Beetown Ogle 9", "B6 Odd Beetown", "L2 Odd Fearnot", "B0 Beetown Fearnot 10", "U0 Fearnot Odd 2", "Y0 Fearnot Beetown 5", "Z4 Beetown Fearnot 3" };
    assertEquals("M8", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case7() {
    String[] roads = { "L0 Ogle Fearnot 5", "U5 Ogle Okay", "E6 Okay Ogle 3", "G6 Odd Fearnot 1", "Y9 Okay Ogle 10", "R6 Odd Okay", "B8 Okay Odd 9", "T8 Fearnot Ogle 5", "X1 Okay Ogle 3", "A1 Okay Fearnot", "B2 Okay Ogle 4" };
    assertEquals("", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case8() {
    String[] roads = { "H8 Beetown Ogle 7", "I8 Okay Odd 3", "U3 Okay Ogle 3", "A9 Fearnot Odd 1", "K1 Beetown Odd 3", "O8 Okay Beetown 1", "N4 Beetown Okay 1", "Q7 Fearnot Ogle 4", "N1 Beetown Okay 8", "J0 Ogle Okay 8", "Q3 Beetown Ogle 3", "X3 Belcher Fearnot" };
    assertEquals("A9 I8 N4 Q3", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case9() {
    String[] roads = { "U5 Ogle Belcher 4", "P5 Okay Ogle 9", "X0 Belcher Fearnot 4", "R5 Okay Odd 2", "H0 Belcher Fearnot", "P1 Beetown Frankenstein 5", "N3 Ogle Odd 2", "N8 Fearnot Ogle 1", "R3 Belcher Ogle", "R1 Odd Okay 3", "V8 Fearnot Okay 2", "B8 Belcher Fearnot 9", "T1 Belcher Ogle" };
    assertEquals("IMPOSSIBLE", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case10() {
    String[] roads = { "F7 Frankenstein Ogle 3", "F2 Fearnot Okay", "U6 Odd Fearnot 2", "C0 Belcher Fearnot", "N3 Belcher Beetown", "T4 Okay Odd 4", "H0 Ogle Panic 6", "L5 Beetown Odd 10", "F6 Frankenstein Beetown 7", "R1 Ogle Okay 7", "U5 Fearnot Panic", "V9 Belcher Beetown 5", "V8 Frankenstein Ogle", "U4 Odd Okay 6" };
    assertEquals("H0 U6", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case11() {
    String[] roads = { "F0 Ogle Footville 4", "N4 Footville Belcher", "M1 Footville Frankenstein 1", "Q0 Belcher Odd 3", "O5 Panic Frankenstein 6" };
    assertEquals("F0 M1 O5 Q0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case12() {
    String[] roads = { "L2 Panic Ogle", "B6 Beetown Panic", "U1 Belcher Frankenstein 4", "M5 Frankenstein Odd", "B0 Belcher Okay 10", "T1 Footville Peculiar 9", "U0 Ogle Footville 1", "M8 Peculiar Okay 1", "V6 Beetown Ogle 9", "X6 Okay Odd 10" };
    assertEquals("B0 M8 T1 U0 U1", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case13() {
    String[] roads = { "Q8 Fearnot Odd 4", "L5 Fearnot Ogle 5", "J7 Fearnot Odd 10", "A9 Ogle Odd", "A2 Ogle Odd 2", "M9 Odd Fearnot 2", "W9 Fearnot Odd 10", "S2 Odd Ogle", "G1 Odd Fearnot 6", "F4 Fearnot Odd 9", "Z7 Fearnot Odd 8" };
    assertEquals("M9", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case14() {
    String[] roads = { "K3 Beetown Fearnot 2", "D5 Beetown Fearnot", "Q8 Fearnot Odd 4", "J8 Beetown Ogle", "Y8 Beetown Fearnot 1", "O9 Beetown Ogle 7", "W3 Beetown Ogle 9", "E8 Odd Beetown 9", "Y4 Ogle Odd 1", "B3 Fearnot Odd 7", "R5 Odd Ogle 2", "O3 Beetown Fearnot 7" };
    assertEquals("Y4", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case15() {
    String[] roads = { "Q0 Beetown Fearnot 7", "U2 Odd Okay 2", "X6 Beetown Okay 3", "I7 Odd Fearnot 7", "M9 Okay Beetown 4", "W3 Okay Ogle", "S1 Ogle Odd 3", "A6 Beetown Odd 10", "E4 Ogle Fearnot 7", "Y3 Beetown Fearnot 7", "A1 Fearnot Okay 5", "L8 Beetown Ogle 2", "N4 Beetown Fearnot 9" };
    assertEquals("A1 L8 U2", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case16() {
    String[] roads = { "E1 Okay Belcher 3", "Z0 Beetown Okay 3", "H1 Fearnot Beetown 2", "M5 Okay Fearnot 8", "N7 Belcher Ogle 2", "U4 Fearnot Okay 6", "W6 Fearnot Beetown", "S5 Ogle Beetown 2", "J6 Odd Ogle 8", "H6 Okay Belcher 2", "Q9 Ogle Okay 8", "O5 Okay Odd 1", "R1 Odd Beetown 9", "A0 Fearnot Okay 8" };
    assertEquals("H6 N7 O5 S5", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case17() {
    String[] roads = { "T6 Fearnot Beetown 8", "V7 Ogle Odd 4", "I8 Beetown Odd 9", "S6 Ogle Fearnot 2", "A1 Okay Belcher 5" };
    assertEquals("IMPOSSIBLE", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case18() {
    String[] roads = { "R8 Fearnot Belcher 1", "C2 Ogle Beetown 9", "Q4 Panic Frankenstein", "L7 Odd Beetown", "Z6 Frankenstein Fearnot 3", "V6 Okay Beetown 3", "T3 Beetown Ogle 10", "F0 Fearnot Odd 7", "A5 Okay Fearnot 1", "X5 Frankenstein Okay 8" };
    assertEquals("A5 C2 R8 V6 Z6", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case19() {
    String[] roads = { "O5 Okay Belcher", "D7 Frankenstein Okay", "G8 Belcher Fearnot 9", "Y8 Frankenstein Odd 9", "K9 Frankenstein Ogle 9", "B1 Okay Belcher 9", "R2 Frankenstein Ogle 3", "V2 Belcher Fearnot 5", "Z2 Footville Beetown 7", "S1 Fearnot Beetown 7", "E2 Okay Ogle 6" };
    assertEquals("R2 S1 V2 Y8 Z2", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case20() {
    String[] roads = { "G1 Okay Belcher 2", "Q2 Peculiar Ogle 3", "U5 Footville Peculiar 5", "P1 Panic Frankenstein 6", "A1 Ogle Peculiar 6", "I7 Okay Belcher 7", "S9 Peculiar Footville 6", "R4 Frankenstein Footville 5", "N2 Panic Belcher 6", "G7 Frankenstein Beetown 9", "D6 Ogle Belcher 4", "C2 Odd Footville 7", "K4 Fearnot Frankenstein 3", "L8 Okay Frankenstein 6", "X9 Belcher Odd 9", "C4 Frankenstein Footville", "E5 Panic Peculiar 7", "G2 Odd Beetown 7", "R8 Ogle Frankenstein 4", "Q0 Odd Peculiar 1" };
    assertEquals("D6 G1 G2 K4 N2 Q0 Q2 R8", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case21() {
    String[] roads = { "F4 Odd Frankenstein 8", "T9 Okay Odd 7", "N9 Panic Beetown", "J1 Belcher Ogle 8", "G0 Ogle Belcher 10", "R4 Belcher Beetown 6", "L4 Belcher Footville 8", "I6 Panic Ogle 3", "O8 Odd Peculiar 10", "V4 Ogle Belcher 10", "V7 Fearnot Peculiar 4", "U7 Beetown Fearnot 10", "S0 Belcher Frankenstein 1", "L7 Belcher Ogle 3", "Z6 Ogle Belcher 10", "G5 Peculiar Beetown 6", "L1 Beetown Footville 8", "J2 Peculiar Panic 3", "U5 Peculiar Odd 7", "W5 Odd Beetown 6", "C4 Frankenstein Peculiar 3", "F5 Beetown Footville 3", "O3 Okay Ogle 10", "W0 Okay Panic 1", "G8 Okay Odd 5", "H9 Belcher Ogle 7", "O0 Fearnot Frankenstein 2", "M9 Odd Belcher 5", "D1 Belcher Beetown 5", "A7 Frankenstein Belcher 8" };
    assertEquals("C4 F5 G8 I6 J2 O0 S0 W0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case22() {
    String[] roads = { "A1 Panic Ogle", "K9 Footville Frankenstein 10", "V3 Odd Okay", "W3 Okay Peculiar 1", "T2 Panic Fearnot", "C4 Okay Beetown 7", "E6 Belcher Panic", "Y4 Okay Belcher 3", "R9 Ogle Frankenstein 10", "J2 Panic Beetown 1", "D5 Footville Panic 3", "A4 Footville Panic 5", "Y1 Fearnot Odd 4", "T8 Footville Frankenstein 9", "U5 Footville Okay 7", "N1 Odd Footville 10", "G5 Okay Odd 4", "X3 Frankenstein Okay", "H5 Okay Frankenstein 8", "H3 Belcher Okay 6", "Q0 Odd Peculiar 4", "X7 Frankenstein Belcher 1", "W0 Okay Ogle 3", "C2 Beetown Ogle 5", "F2 Belcher Footville 9", "D7 Footville Frankenstein 9", "G1 Peculiar Frankenstein 3", "C6 Peculiar Ogle 4", "F4 Okay Frankenstein 8", "U0 Ogle Frankenstein 9", "F6 Ogle Footville 9", "X1 Ogle Okay 1", "O4 Footville Panic 5", "K6 Fearnot Ogle 1", "K7 Frankenstein Okay 2", "B2 Footville Fearnot 7", "S7 Ogle Footville 10", "E7 Fearnot Peculiar 9", "R1 Belcher Beetown 10", "L4 Okay Belcher 4" };
    assertEquals("D5 J2 W3 X1", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case23() {
    String[] roads = { "J8 Fearnot Odd", "A1 Ogle Fearnot 3", "H4 Ogle Odd 6", "V4 Fearnot Odd", "B6 Fearnot Odd 8", "F9 Odd Ogle 2", "W7 Fearnot Ogle", "D9 Fearnot Odd", "A3 Fearnot Ogle 7", "W1 Fearnot Ogle 2", "D3 Odd Ogle 1", "T5 Ogle Fearnot 8", "S6 Ogle Odd", "G1 Fearnot Odd", "N9 Ogle Odd", "Q7 Ogle Odd 5", "O2 Fearnot Odd 1", "R5 Ogle Fearnot 3", "O7 Odd Fearnot", "P0 Odd Ogle 3" };
    assertEquals("", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case24() {
    String[] roads = { "L9 Beetown Odd 10", "L1 Odd Fearnot 9", "B7 Beetown Fearnot 5", "O0 Odd Ogle", "T7 Odd Beetown 4", "I0 Odd Ogle 8", "Z4 Ogle Fearnot 6", "K1 Ogle Fearnot", "Q6 Odd Beetown 9", "G0 Ogle Odd", "V5 Beetown Ogle 9", "H8 Beetown Ogle 4", "H4 Fearnot Odd", "Q7 Fearnot Ogle", "J4 Odd Ogle 10", "B3 Beetown Fearnot 4", "D7 Odd Ogle 10", "P3 Beetown Odd", "Q1 Odd Fearnot 8", "Z1 Ogle Odd" };
    assertEquals("", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case25() {
    String[] roads = { "H8 Beetown Okay 4", "Z7 Ogle Beetown", "F5 Okay Fearnot", "G5 Ogle Okay 5", "K8 Beetown Fearnot 6", "V6 Fearnot Odd", "D8 Beetown Ogle", "N4 Ogle Fearnot 6", "G1 Odd Ogle 3", "A9 Fearnot Beetown 7", "Z1 Okay Ogle 2", "T0 Ogle Fearnot 9", "L1 Fearnot Beetown 6", "Z5 Ogle Odd 4", "R3 Okay Fearnot 9", "F8 Beetown Okay 5", "T8 Odd Ogle 6", "W6 Beetown Fearnot 2", "H4 Ogle Beetown 4", "P4 Ogle Fearnot" };
    assertEquals("", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case26() {
    String[] roads = { "B7 Ogle Fearnot 10", "G1 Ogle Odd", "F0 Ogle Fearnot", "Q7 Fearnot Ogle 5", "L5 Odd Fearnot 2" };
    assertEquals("", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case27() {
    String[] roads = { "B1 Ogle Beetown 2", "W2 Fearnot Ogle 2", "V0 Belcher Beetown 3", "A2 Fearnot Ogle 7", "W0 Belcher Beetown", "R1 Belcher Okay 4", "I1 Beetown Belcher 7", "X6 Odd Belcher", "O6 Fearnot Odd 9", "X3 Frankenstein Odd 8", "J9 Frankenstein Fearnot 8", "M3 Frankenstein Fearnot 2", "E6 Odd Okay 5", "G7 Belcher Ogle 10", "J1 Okay Odd 6", "R6 Frankenstein Okay 4", "F6 Fearnot Belcher 3", "R3 Okay Odd 2", "W4 Ogle Odd 1", "G0 Ogle Okay 9", "Q1 Belcher Beetown 6", "Z4 Beetown Okay", "Z1 Okay Belcher 6", "D4 Fearnot Okay 4", "H6 Belcher Frankenstein 3" };
    assertEquals("M3 W2 W4", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case28() {
    String[] roads = { "Q5 Ogle Fearnot 4", "O1 Ogle Belcher 4", "R4 Fearnot Odd", "P8 Odd Okay", "K0 Beetown Fearnot 5", "H1 Okay Fearnot 1", "B8 Ogle Beetown 7", "X4 Panic Okay 4", "B9 Odd Panic 3", "I6 Belcher Odd 1", "L9 Belcher Frankenstein 6", "L0 Okay Frankenstein 3", "F7 Belcher Fearnot", "N5 Frankenstein Panic 10", "O8 Frankenstein Fearnot 6", "S7 Frankenstein Ogle", "E9 Okay Frankenstein 6", "J2 Frankenstein Fearnot 7", "G0 Okay Panic 7", "U0 Beetown Odd 10", "V1 Frankenstein Panic 6", "L6 Frankenstein Okay 3", "G9 Fearnot Odd 3", "J4 Odd Panic 9", "U9 Belcher Frankenstein 1" };
    assertEquals("B9 K0 U9", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case29() {
    String[] roads = { "K6 Odd Frankenstein 10", "W0 Footville Belcher 6", "C4 Okay Frankenstein 3", "Z3 Okay Footville 1", "Q2 Panic Footville 9", "M1 Footville Ogle 3", "P6 Odd Fearnot", "V6 Odd Okay 5", "J0 Ogle Panic 3", "Z7 Frankenstein Ogle 8", "B8 Belcher Footville 7", "W6 Fearnot Frankenstein 1", "T5 Footville Fearnot 6", "X8 Footville Okay", "Y8 Frankenstein Belcher 7", "C5 Frankenstein Footville 10", "J9 Frankenstein Panic 1", "I1 Beetown Fearnot 10", "J4 Okay Beetown 10", "F9 Footville Okay 2", "W2 Ogle Fearnot 9", "J6 Frankenstein Ogle 8", "S4 Fearnot Okay 9", "V0 Okay Frankenstein 8", "G7 Okay Fearnot 4", "Y5 Panic Beetown 7", "P3 Okay Ogle 2", "Y4 Ogle Panic 8", "R6 Panic Okay 6", "F6 Frankenstein Fearnot 1", "N7 Footville Okay 7", "V2 Frankenstein Beetown 2", "R2 Okay Fearnot 6", "Z1 Belcher Okay 10", "G8 Beetown Ogle 7", "I4 Okay Footville 4", "A4 Beetown Panic 2", "Q1 Ogle Okay 2", "V3 Frankenstein Belcher 9", "Z8 Beetown Fearnot 5", "H0 Frankenstein Ogle 9", "O0 Belcher Odd 2", "N2 Fearnot Panic 4", "T3 Fearnot Frankenstein 4", "W8 Panic Beetown 7", "X3 Fearnot Footville 8", "Y0 Frankenstein Okay", "L9 Panic Okay 1", "T1 Ogle Panic 3", "K4 Footville Beetown 3" };
    assertEquals("A4 F6 J9 O0 P3", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case30() {
    String[] roads = { "U9 Odd Okay 1", "K4 Frankenstein Panic 2", "J6 Ogle Belcher 7", "E1 Odd Beetown 5", "K7 Beetown Peculiar 9", "F5 Peculiar Odd 10", "P6 Panic Okay 5", "N0 Footville Peculiar 2", "V3 Footville Frankenstein 10", "T7 Ogle Beetown 5", "R9 Okay Frankenstein 8", "C6 Footville Odd 1", "V5 Panic Okay 10", "M0 Okay Panic 4", "H9 Ogle Odd 9", "F1 Okay Panic 8", "D2 Ogle Panic 3", "P5 Okay Ogle 10", "L4 Peculiar Belcher 4", "E7 Footville Beetown 9", "X2 Beetown Peculiar 3", "A8 Okay Ogle 2", "Z8 Footville Belcher 3", "S8 Belcher Beetown 2", "T3 Footville Frankenstein 7", "D6 Panic Odd 5", "N9 Peculiar Fearnot 1", "P9 Panic Fearnot 4", "M4 Peculiar Ogle", "L7 Ogle Peculiar 4", "Y1 Frankenstein Fearnot 10", "K3 Okay Frankenstein 4", "N3 Footville Peculiar 1", "C8 Frankenstein Okay 4", "N7 Belcher Ogle 4", "Z0 Okay Frankenstein 2", "M7 Beetown Okay 9", "M3 Belcher Fearnot 3", "W7 Okay Fearnot 9", "J7 Beetown Okay", "E6 Belcher Ogle 2", "S2 Panic Ogle 5", "H3 Frankenstein Belcher 4", "N2 Belcher Peculiar 7", "G4 Frankenstein Ogle 10", "O6 Ogle Panic 7", "B7 Ogle Odd 5", "L3 Okay Belcher 3", "D8 Ogle Panic 8", "B0 Ogle Frankenstein 2" };
    assertEquals("B0 C6 E6 K4 N3 N9 U9", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case31() {
    String[] roads = { "S2 Odd Beetown 10", "U3 Fearnot Frankenstein 9", "U0 Frankenstein Fearnot 9", "D5 Belcher Odd 5", "B3 Footville Beetown 7", "O4 Beetown Okay 6", "P1 Panic Fearnot 6", "N3 Frankenstein Odd 1", "O8 Odd Beetown 2", "R2 Panic Okay 1", "Q8 Odd Beetown 6", "Y7 Footville Frankenstein 3", "U8 Odd Belcher 5", "M9 Blueballs Panic 10", "W4 Porkey Belcher 6", "H2 Ogle Gaylordsville 4", "V8 Footville Gaylordsville 5", "D8 Gaylordsville Odd 7", "Q9 Beetown Fearnot 4", "N8 Ogle Gaylordsville 11", "G3 Ogle Blueballs 5", "B1 Ogle Porkey 1", "J7 Frankenstein Panic 5", "I0 Fearnot Okay 5", "S3 Blueballs Peculiar 9", "P3 Beetown Porkey 8", "D9 Blueballs Footville 4", "Y1 Beetown Peculiar 3", "W5 Footville Frankenstein 3", "V3 Panic Footville 3", "P4 Okay Beetown 4", "K2 Odd Porkey 8", "R4 Fearnot Okay 11", "O3 Beetown Footville 3", "A7 Frankenstein Porkey 2", "C3 Porkey Panic 7", "M5 Gaylordsville Peculiar 3", "L0 Fearnot Odd 9", "S4 Porkey Belcher 11", "E0 Frankenstein Fearnot 3", "T1 Gaylordsville Beetown 9", "Y0 Ogle Odd 8", "B0 Beetown Odd 6", "Z7 Frankenstein Odd 10", "I7 Gaylordsville Belcher 3", "E1 Frankenstein Panic 8", "Z3 Belcher Porkey 2", "L1 Footville Odd 9", "F2 Ogle Blueballs 4", "Q7 Beetown Porkey 1" };
    assertEquals("A7 B1 D9 E0 I7 M5 N3 O3 Q7 R2 V3 Z3", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case32() {
    String[] roads = { "H0 Peculiar Panic 2", "S0 Porkey Frankenstein 9", "P1 Panic Porkey 8", "W9 Fearnot Ogle 1", "G0 Beetown Fearnot 8", "Q8 Porkey Belcher 4", "P9 Peculiar Beetown 4", "F6 Beetown Okay 5", "F3 Okay Peculiar 7", "N7 Footville Beetown 5", "C6 Beetown Frankenstein 2", "R7 Belcher Gaylordsville 3", "T5 Porkey Fearnot 9", "A5 Belcher Peculiar 3", "O7 Beetown Frankenstein 9", "B5 Quiggleville Frankenstein 4", "F9 Panic Porkey 4", "X2 Frankenstein Okay 1", "K6 Beetown Okay 9", "S6 Peculiar Frankenstein 4", "Q7 Odd Footville 10", "B0 Gaylordsville Fearnot 6", "N6 Peculiar Panic 2", "G2 Panic Ogle 10", "D4 Odd Quiggleville 1", "F8 Okay Odd", "R9 Blueballs Panic 1", "X9 Blueballs Frankenstein 6", "R8 Ogle Blueballs 4", "L7 Gaylordsville Porkey 1", "G3 Quiggleville Odd 3", "Z6 Ogle Quiggleville 5", "H7 Gaylordsville Blueballs 10", "W7 Blueballs Ogle", "U1 Footville Porkey", "U6 Peculiar Ogle 3", "L9 Belcher Panic 3", "E6 Fearnot Okay 3", "M0 Porkey Panic 3", "G9 Belcher Quiggleville 8", "S5 Odd Belcher 2", "I6 Okay Blueballs", "S3 Frankenstein Odd 4", "D8 Beetown Peculiar 8", "G8 Odd Ogle 4", "M1 Beetown Okay 5", "N3 Odd Blueballs 5", "E1 Porkey Gaylordsville 9", "K4 Porkey Blueballs 8", "S9 Belcher Beetown 5" };
    assertEquals("C6 D4 H0 L7 M0 R9 S5 W9 X2", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case33() {
    String[] roads = { "O7 Blueballs Quiggleville 4", "C7 Frankenstein Quiggleville 1", "H6 Boring Frankenstein 7", "U8 Panic Fearnot 8", "Q2 Gaylordsville Odd 5", "Z7 Okay Beetown 6", "D9 Odd Frankenstein 10", "K0 Peculiar Beetown 10", "J4 Belcher Frankenstein 2", "O6 Peculiar Okay 10", "Y4 Belcher Beetown 2", "G6 Odd Blueballs", "M5 Panic Porkey 7", "Y9 Beetown Boring 2", "L0 Panic Blueballs 10", "S7 Beetown Ogle 8", "H1 Porkey Panic 6", "O4 Boring Beetown 3", "Z5 Panic Ogle", "T4 Porkey Ogle 6", "Q1 Footville Quiggleville 6", "A7 Frankenstein Fearnot 3", "K3 Quiggleville Fearnot 7", "B6 Gaylordsville Belcher", "I0 Ogle Frankenstein 3", "L4 Ogle Quiggleville 8", "A6 Okay Beetown 3", "J3 Ogle Odd 8", "F0 Porkey Odd 6", "B9 Peculiar Quiggleville 1", "H4 Gaylordsville Frankenstein 6", "C1 Blueballs Boring 6", "T0 Fearnot Footville 1", "D6 Beetown Gaylordsville 5", "D3 Peculiar Odd 4", "W0 Boring Porkey 2", "L3 Frankenstein Odd 2", "L6 Blueballs Panic 2", "F7 Blueballs Quiggleville", "P6 Gaylordsville Quiggleville 9", "M0 Blueballs Gaylordsville", "E1 Fearnot Frankenstein 7", "Y1 Porkey Beetown 9", "Y5 Beetown Blueballs 6", "E9 Odd Frankenstein 9", "K9 Panic Boring 5", "H7 Belcher Blueballs 7", "C2 Odd Blueballs 4", "B1 Frankenstein Boring 10", "T8 Beetown Okay 4" };
    assertEquals("A6 A7 B9 C7 L6 T0 W0 Y4 Y9", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case34() {
    String[] roads = { "A3 Gaylordsville Quiggleville 9", "W5 Belcher Blueballs 16", "G1 Porkey Buddha 8", "Z0 Peculiar Panic 5", "N2 Odd Porkey 9", "P0 Porkey Footville", "O1 Buddha Beetown 14", "F9 Buddha Porkey 13", "I5 Ogle Peculiar 13", "Q4 Porkey Blueballs 16", "N9 Peculiar Panic 17", "E5 Gaylordsville Buddha 1", "B1 Peculiar Blueballs 5", "L8 Blueballs Okay", "H9 Fearnot Gaylordsville", "D3 Belcher Ogle", "Q2 Beetown Belcher 7", "G0 Panic Buddha", "J2 Beetown Gaylordsville 13", "G2 Boring Fearnot 9", "B2 Belcher Frankenstein", "S8 Peculiar Ogle 8", "T3 Odd Ogle", "A8 Peculiar Panic 17", "L1 Odd Boring 12", "H0 Beetown Porkey 9", "H7 Buddha Boring 2", "Z6 Blueballs Gaylordsville", "W7 Ogle Beetown 10", "C3 Porkey Footville 6", "B3 Footville Buddha 10", "I1 Okay Frankenstein 14", "U2 Blueballs Buddha 14", "T2 Panic Fearnot", "Y6 Blueballs Peculiar 9", "D7 Buddha Gaylordsville 15", "Q7 Porkey Beetown 8", "Q8 Peculiar Ogle 1", "K3 Footville Quiggleville", "H5 Okay Quiggleville", "T4 Belcher Panic 4", "S4 Quiggleville Panic", "F6 Porkey Beetown 7", "G6 Ogle Frankenstein 10", "A9 Porkey Ogle 8", "F0 Panic Belcher", "R2 Beetown Buddha", "H4 Odd Porkey 2", "K9 Okay Ogle 15", "L4 Belcher Ogle 5" };
    assertEquals("H7 Q8", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case35() {
    String[] roads = { "Z0 Porkey Quiggleville", "D4 Footville Blueballs", "Q8 Porkey Hooker 271", "U1 Buddha Ogle 399", "O1 Gaylordsville Peculiar 607", "C4 Quiggleville Peculiar 328", "T6 Porkey Panic", "S9 Beetown Blueballs 718", "X9 Beetown Okay 837", "W8 Gaylordsville Boring 805", "G5 Panic Ogle 436", "M8 Fearnot Gaylordsville 836", "A1 Boring Quiggleville 977", "A8 Ogle Blueballs 705", "F5 Odd Footville 877", "T4 Buddha Ogle 636", "X8 Footville Buddha 708", "G4 Ogle Gaylordsville 737", "W1 Fearnot Gaylordsville 608", "Y7 Beetown Belcher 772", "J0 Fearnot Footville 203", "T0 Panic Buddha 594", "R1 Peculiar Belcher 302", "D0 Footville Panic 451", "K1 Quiggleville Footville 349", "L0 Buddha Okay 528", "X1 Buddha Porkey 777", "W3 Beetown Panic 64", "S7 Quiggleville Hooker 191", "X0 Gaylordsville Footville 433", "L2 Ogle Panic 588", "O7 Panic Buddha 608", "P6 Boring Ogle", "K5 Fearnot Gaylordsville 362", "I2 Beetown Belcher 279", "X6 Belcher Peculiar 390", "W7 Frankenstein Blueballs 668", "S8 Peculiar Okay 63", "F8 Belcher Buddha 113", "C7 Belcher Porkey 363", "X3 Blueballs Beetown 475", "N1 Okay Ogle 293", "A5 Panic Gaylordsville 653", "V9 Peculiar Hooker 196", "E9 Buddha Hooker 318", "I7 Blueballs Footville 271", "J7 Buddha Belcher 424", "G6 Gaylordsville Okay 435", "N8 Footville Beetown 241", "L4 Blueballs Ogle 992" };
    assertEquals("F5 F8 I2 J0 K5 N1 N8 S7 S8 V9 W3 W7", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case36() {
    String[] roads = { "T6 Roachtown Panic 1", "R4 Belcher Boring", "Z8 Porkey Fearnot 1", "L3 Hooker Roachtown 9", "S6 Panic Boring", "X9 Footville Roachtown", "L1 Footville Quiggleville 7", "I4 Porkey Fearnot 10", "F3 Fearnot Roachtown 8", "P4 Beetown Footville 10", "T7 Gaylordsville Fearnot 2", "M1 Blueballs Odd 5", "V3 Odd Hooker 10", "R2 Panic Ogle 2", "W3 Peculiar Roachtown 8", "Y8 Footville Gaylordsville 3", "Z0 Belcher Frankenstein 2", "D5 Porkey Blueballs 9", "B2 Gaylordsville Belcher 2", "L9 Beetown Roachtown", "H8 Porkey Buddha 2", "Y1 Buddha Gaylordsville 1", "W1 Quiggleville Gaylordsville 1", "C1 Panic Frankenstein 7", "H2 Fearnot Gaylordsville 10", "Z5 Porkey Belcher", "B5 Gaylordsville Ogle", "K8 Beetown Belcher 3", "D7 Okay Peculiar 3", "R5 Roachtown Ogle 8", "D4 Peculiar Odd 2", "C9 Fearnot Boring 8", "T4 Buddha Footville", "Z4 Panic Blueballs 1", "H9 Roachtown Peculiar 10", "L6 Blueballs Gaylordsville 10", "X5 Peculiar Footville 2", "X8 Fearnot Boring 10", "O7 Buddha Okay 9", "R3 Belcher Roachtown 9", "E0 Buddha Porkey 10", "X7 Frankenstein Boring 7", "U0 Frankenstein Panic 2", "M3 Okay Quiggleville 1", "F1 Peculiar Odd", "Y7 Belcher Porkey 10", "N7 Belcher Odd 9", "M0 Fearnot Hooker 1", "O6 Peculiar Hooker 9", "P3 Buddha Footville" };
    assertEquals("M0 M3 T6 U0 W1 X5 Y1 Z4 Z8", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case37() {
    String[] roads = { "S1 Boring Beetown 782", "M4 Beetown Quiggleville 849", "R3 Chestnut Gaylordsville 246", "O9 Panic Ogle 997", "F8 Peculiar Gaylordsville 199", "P1 Chestnut Okay 864", "D2 Porkey Buddha 280", "D8 Boring Quiggleville 428", "Y4 Gaylordsville Beetown 506", "I2 Okay Porkey 522", "O3 Ogle Quiggleville 727", "G0 Buddha Beetown 487", "T7 Okay Belcher 429", "J0 Odd Quiggleville 946", "C9 Buddha Boring 827", "R8 Footville Boring 192", "A7 Hooker Gaylordsville 145", "V0 Blueballs Quiggleville 274", "N1 Hooker Boring 175", "M2 Fearnot Ogle 87", "Y5 Quiggleville Belcher 653", "A4 Buddha Boring 331", "J7 Panic Roachtown", "Q5 Ogle Panic 999", "O6 Odd Fearnot 294", "Q6 Frankenstein Blueballs 101", "K4 Frankenstein Blueballs 150", "A9 Hooker Boring 909", "G7 Odd Ogle 480", "X7 Okay Frankenstein", "O1 Fearnot Chestnut", "N4 Porkey Fearnot 370", "M8 Buddha Beetown 490", "B1 Footville Chestnut", "H9 Quiggleville Footville 675", "R0 Okay Frankenstein 599", "X2 Panic Hooker 581", "Z8 Panic Buddha 564", "V7 Blueballs Quiggleville 644", "L3 Footville Chestnut 181", "U8 Okay Chestnut 661", "S0 Porkey Odd 62", "C5 Belcher Buddha 878", "F9 Panic Boring 327", "U0 Frankenstein Quiggleville 520", "O5 Blueballs Gaylordsville 627", "H5 Belcher Chestnut 196", "W6 Blueballs Buddha 650", "P8 Hooker Porkey 747", "J2 Peculiar Roachtown 963" };
    assertEquals("A7 D2 D8 F8 F9 G0 H5 M2 N1 O6 Q6 R8 S0 V0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case38() {
    String[] roads = { "A0 Sandwich Buddha 7", "S6 Peculiar Uncertain 3", "Z0 Chestnut Belcher 5", "Y4 Ogle Boring 6", "N1 Odd Quiggleville 6", "A5 Climax Intercourse 10", "O1 Romance Quiggleville 1", "R9 Panic Okay 5", "D0 Roachtown Panic 8", "T1 Hooker Belcher 4", "L8 Gaylordsville Panic 6", "T2 Uncertain Romance 8", "C2 Panic Chugwater 9", "Q6 Blueballs Okay 7", "I6 Odd Ogle 2", "O9 Sandwich Chicken 4", "L6 Chestnut Ogle 7", "I2 Hornytown Intercourse 8", "I7 Intercourse Peculiar 3", "B7 Frankenstein Climax 3", "P8 Buddha Jupiter 3", "D1 Jupiter Footville 3", "E5 Jupiter Roachtown 6", "K0 Chestnut Sandwich 7", "F8 Frankenstein Footville", "U9 Hooker Gaylordsville 6", "G6 Roachtown Boring 1", "N0 Romance Belcher 3", "P1 Roachtown Peculiar 10", "X4 Buddha Panic 5", "U1 Uncertain Quiggleville 9", "Z7 Okay Smackover 8", "L7 Chicken Quiggleville 8", "D6 Gaylordsville Buddha 3", "P9 Hornytown Beetown 9", "T4 Sandwich Uncertain 9", "E2 Footville Chestnut 8", "K6 Chugwater Smackover 6", "J4 Umpire Peculiar 8", "H8 Odd Umpire 5", "U4 Peculiar Umpire 8", "B3 Intercourse Smackover 1", "V4 Hooker Belcher 5", "G0 Climax Boring 1", "B6 Gaylordsville Chugwater 6", "O5 Belcher Ogle 1", "J6 Chugwater Porkey 2", "E7 Hornytown Jupiter 3", "I5 Climax Panic 4", "R8 Chicken Romance 5" };
    assertEquals("B3 B6 B7 D1 D6 E7 G0 G6 H8 I5 I6 I7 J6 K6 N0 O1 O5 O9 P8 P9 Q6 R8 R9 S6 T1 U9 Z0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case39() {
    String[] roads = { "L8 Belcher Peculiar 333", "D5 Intercourse Disco 149", "K3 Footville Panic 128", "F5 Uncertain Romance 156", "O1 Gaylordsville Mars 641", "Z0 Climax Odd 492", "X3 Frankenstein Boring 974", "U2 Intercourse Ogle 481", "E0 Jupiter Odd 643", "X1 Frankenstein Okay 764", "V6 Odd Chugwater 105", "L3 Blueballs Dismal 126", "L5 Chicken Boring 889", "Q2 Ogle Porkey 544", "F2 Buddha Frankenstein 345", "C8 Peculiar Beetown 615", "F7 Quiggleville Odd 757", "G5 Chestnut Intercourse 520", "F1 Buddha Quiggleville", "A7 Smackover Sandwich 732", "I2 Mars Climax 882", "K6 Quiggleville Fearnot 247", "F3 Koopa Lollipop 331", "J9 Smackover Gaylordsville 442", "Q7 Chestnut Magazine 183", "A9 Ogle Quiggleville 326", "O9 Porkey Blueballs 594", "L7 Lawyersville Quiggleville 717", "T4 Porkey Hooker 112", "G0 Panic Yeehaw 688", "R3 Dismal Koopa 555", "J7 Beetown Sandwich 729", "Q9 Dismal Hornytown 892", "F4 Blueballs Footville 224", "X9 Sandwich Hooker 785", "L1 Chicken Umpire", "R6 Smackover Dismal", "E8 Smackover Hooker 905", "Y3 Blueballs Lollipop 958", "H1 Magazine Chugwater", "H8 Panic Yazoo 500", "V8 Jupiter Footville 699", "V9 Footville Blueballs 609", "C1 Hooker Dickeyville 556", "P3 Yeehaw Chestnut 117", "X0 Beetown Lollipop 110", "Z3 Smackover Romance 955", "G9 Intercourse Koopa 359", "Y7 Koopa Okay 443", "T6 Intercourse Climax 233" };
    assertEquals("A9 C1 C8 D5 E0 F2 F3 F4 F5 G9 H8 J7 J9 K3 K6 L3 L5 L7 L8 O1 P3 Q2 Q7 Q9 R3 T4 T6 U2 V6 X0 X3 Y7 Z0 Z3", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case40() {
    String[] roads = { "W8 Lollipop Romance 46", "N9 Panic Mars 76", "M0 Odd Okay 91", "F3 RiverStyx Jupiter 74", "O2 Eclectic Hornytown 24", "V2 Eclectic It 54", "J1 Hell Frankenstein 42", "Q0 Fearnot Porkey 15", "B1 Boring Chicken 12", "P8 Ogle Disco 2", "S0 Smackover Porkey 82", "G9 Lawyersville Umpire 34", "A7 Romance Koopa 77", "O7 Gaylordsville It 13", "X9 Peculiar Elbow 20", "H1 Odd Yazoo", "T0 Intercourse Jupiter 96", "W4 Porkey Peculiar 69", "G2 Umpire Lollipop 89", "V8 Yazoo Frankenstein 10", "I7 Elbow Belcher", "Z3 Hell Jupiter 46", "Z7 Hornytown Eek 82", "I2 Mars Romance 94", "I8 Buddha Frankenstein 54", "P3 Roachtown Dismal", "J7 Quiggleville Elbow 22", "Z1 Elbow Mars 13", "W5 Elbow Hell 84", "Q8 Koopa It 2", "R1 Okay MuckCity 18", "B5 Quiggleville Okay 41", "I1 Buddha Odd 88", "S9 Dismal Romance 15", "G3 Smackover Odd", "O0 Boring Sandwich 42", "E9 It Hooker 83", "V7 Intercourse Boring 98", "T7 Dickeyville Smackover 38", "A0 Peculiar Smackover 10", "J3 Gaylordsville Chugwater 13", "L3 Yeehaw Footville", "T3 DryFork Lawyersville", "E4 Dismal Yazoo 6", "A5 Eclectic Porkey 65", "M1 Noname Chugwater 96", "Q7 Uncertain Frankenstein 20", "I6 Mars Okay 16", "F1 Lollipop Eclectic 40", "M3 RiverStyx Chestnut 9" };
    assertEquals("IMPOSSIBLE", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case41() {
    String[] roads = { "W8 Lollipop Romance 46", "N9 Panic Mars 76", "M0 Odd Okay 91", "F3 RiverStyx Jupiter 74", "O2 Eclectic Hornytown 24", "V2 Eclectic It 54", "J1 Hell Frankenstein 42", "Q0 Fearnot Porkey 15", "B1 Boring Chicken 12", "P8 Ogle Disco 2", "S0 Smackover Porkey 82", "G9 Lawyersville Umpire 34", "A7 Romance Koopa 77", "O7 Gaylordsville It 13", "X9 Peculiar Elbow 20", "H1 Odd Yazoo", "T0 Intercourse Jupiter 96", "W4 Porkey Peculiar 69", "G2 Umpire Lollipop 89", "V8 Yazoo Frankenstein 10", "I7 Elbow Belcher", "Z3 Hell Jupiter 46", "Z7 Hornytown Eek 82", "I2 Mars Romance 94", "I8 Buddha Frankenstein 54", "P3 Roachtown Dismal", "J7 Quiggleville Elbow 22", "Z1 Elbow Mars 13", "W5 Elbow Hell 84", "Q8 Koopa It 2", "R1 Okay MuckCity 18", "B5 Quiggleville Okay 41", "I1 Buddha Odd 88", "S9 Dismal Romance 15", "G3 Smackover Odd", "O0 Boring Sandwich 42", "E9 It Hooker 83", "V7 Intercourse Boring 98", "T7 Dickeyville Smackover 38", "A0 Peculiar Smackover 10", "J3 Gaylordsville Chugwater 13", "L3 Yeehaw Footville", "T3 DryFork Lawyersville", "E4 Dismal Yazoo 6", "A5 Eclectic Porkey 65", "M1 Noname Chugwater 96", "Q7 Uncertain Frankenstein 20", "I6 Mars Okay 16", "F1 Lollipop Eclectic 40", "M3 RiverStyx Chestnut 9" };
    assertEquals("IMPOSSIBLE", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case42() {
    String[] roads = { "V0 Fearnot Jupiter 91", "L7 Footville Uncertain 14", "S9 Jupiter Yazoo 47", "I5 Hornytown Magazine 24", "V1 Magazine DryFork 71", "Z7 Chestnut Chicken", "F6 Lawyersville Eclectic 70", "H8 Uncertain Okay 9", "I9 Quiggleville Sandwich 98", "A0 MuckCity Eclectic 81", "C2 Hooker Noname 2", "T9 Uncertain Koopa 8", "S1 Chestnut Eek 30", "P9 Lollipop Smackover 31", "X6 Odd Buddha 41", "N2 Disco DryFork 71", "N0 Quiggleville Eek 30", "G3 Blueballs Yeehaw 42", "M6 Ogle Chestnut 70", "H5 Okay Smackover 53", "C6 Mars Chestnut 54", "K0 Sandwich Footville 74", "Z8 Chugwater Okay 60", "O9 Sandwich Jupiter", "G6 Sandwich MuckCity 45", "S5 Porkey Hornytown 1", "Z9 Lollipop Noname 45", "G9 Climax Dismal 37", "D6 Eek Blueballs 65", "R6 Fearnot Panic 35", "N8 Gaylordsville Blueballs 13", "C1 Intercourse Noname 68", "P0 Chicken Eclectic", "A5 Eek Climax", "D0 Yazoo Fearnot 22", "T5 Panic Smackover", "V4 Roachtown Disco 37", "M1 Frankenstein Beetown 20", "F0 Eclectic RiverStyx", "E8 Belcher Chestnut 82", "I8 Footville Fearnot 89", "O1 Odd Lollipop 11", "J8 Beetown Blueballs", "J2 Panic RiverStyx", "A1 Noname Lollipop 69", "N5 DryFork Quiggleville 27", "P5 Intercourse Chugwater 65", "W9 Lollipop Ogle 86", "R3 Eek Porkey 40", "V8 Buddha MuckCity 34" };
    assertEquals("C2 C6 D0 D6 E8 F6 G3 G6 G9 H5 H8 I5 L7 M1 M6 N0 N2 N5 N8 O1 P5 P9 R3 R6 S1 S5 T9 V4 V8 X6 Z8 Z9", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case43() {
    String[] roads = { "I3 Panic Eclectic", "U4 Yeehaw Gaylordsville 5", "K4 Blueballs Elbow 75", "P4 Jupiter Odd 99", "V5 It Magazine 55", "K7 Yazoo Intercourse", "L3 Romance Hell 98", "I0 Buddha Hooker", "T5 Elbow Smackover 78", "F6 Chestnut Lollipop 89", "V0 Koopa Mars 52", "T7 Chicken Mars 99", "E4 Frankenstein Dismal 10", "U5 Eek It 93", "Z9 Climax Yeehaw 46", "U8 Boring Okay 4", "N9 Mars It 2", "E9 Footville Disco 36", "T1 Beetown Hooker 78", "B4 Gaylordsville Quiggleville", "I6 Eclectic Quiggleville 3", "W6 Uncertain Noname 19", "F9 Eek Okay 62", "J5 It Chestnut 49", "Y4 Hooker DryFork 29", "K2 Dickeyville Embarrass 2", "R2 Frankenstein Intercourse 68", "G1 Yeehaw Eek 2", "H0 Blueballs Umpire 8", "P9 Lawyersville Noname 60", "H4 Smackover Blueballs 79", "S6 Blueballs Beetown 57", "N2 Dickeyville Odd 87", "H9 Frankenstein Okay 71", "C0 Blueballs Lollipop 5", "N1 Chestnut Hooker 77", "L4 Yazoo Lawyersville", "C8 Odd Peculiar 30", "D5 Disco Okay 9", "T8 Yeehaw Odd 17", "L0 MuckCity Mars 7", "M3 Dickeyville Buddha 22", "S2 Hornytown Gaylordsville 14", "S0 Mars Buddha 19", "V8 Yazoo Uncertain", "O4 Eclectic Beetown", "T4 Magazine Lawyersville 7", "B0 Yazoo It 66", "C1 Porkey Roachtown 12", "H5 Frankenstein Koopa 42" };
    assertEquals("IMPOSSIBLE", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case44() {
    String[] roads = { "N2 Hell Intercourse 76", "G4 Yeehaw Boring 39", "P0 Elbow Odd 85", "J0 Odd Dickeyville 38", "L0 Buddha Koopa 26", "V1 Yeehaw Boring 82", "H8 DryFork Dismal 1", "B3 Disco Okay", "P6 DryFork RiverStyx 43", "K0 Noname Uncertain 23", "H7 Beetown Gaylordsville 49", "K5 Chugwater DryFork", "I0 Peculiar Yeehaw 79", "S8 Okay Quiggleville 65", "F8 Ogle Umpire 89", "Z0 Noname Jupiter 59", "R8 Yeehaw Roachtown 94", "J9 Elbow Peculiar 48", "I7 Yeehaw Disco 76", "N3 Eclectic Buddha 29", "R3 Smackover Odd 35", "X9 Porkey Chicken 11", "V9 Frankenstein MuckCity 71", "K8 Eek Buddha 56", "X1 Hornytown Gaylordsville 83", "G7 Smackover Chestnut 48", "N5 Chicken Gaylordsville 79", "R1 Frankenstein Jupiter 79", "W5 Footville Hornytown 50", "S1 Lawyersville Chestnut 37", "I1 Odd Belcher 47", "T8 Disco Noname 3", "E1 Beetown MuckCity 61", "D0 Romance Odd 1", "G5 Hornytown Jupiter 67", "K1 Embarrass Magazine 68", "A2 DryFork Gaylordsville 97", "D8 MuckCity DryFork 69", "U3 Embarrass Peculiar 52", "R2 It Elbow 52", "Q6 Gaylordsville Koopa 99", "J3 Chugwater Jupiter 1", "R5 Umpire Magazine 51", "Y9 Lollipop Buddha", "M0 Uncertain Mars 40", "H2 Quiggleville Jupiter 35", "K9 Blueballs Beetown 56", "E8 Hell Uncertain 56", "W3 Romance Noname 38", "H1 Chestnut Smackover 38" };
    assertEquals("D0 D8 E1 E8 F8 G4 G5 H1 H2 H7 H8 I0 I1 I7 J0 J3 J9 K0 K1 K8 K9 L0 M0 N2 N3 N5 P6 Q6 R2 R3 R5 R8 S1 T8 U3 V9 W3 W5 X9 Z0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case45() {
    String[] roads = { "P4 Buddha Fearnot 69", "F5 Boring Romance 53", "S8 Belcher Panic 97", "A1 Belcher Footville 50", "Z9 Hooker Gaylordsville 59", "V6 Fearnot Ogle", "G4 Footville Quiggleville 86", "O4 Panic Boring 92", "W4 Frankenstein Blueballs 96", "B1 Porkey Frankenstein 81", "G9 Boring Roachtown 37", "K2 Ogle Peculiar 67", "S9 Okay Footville 21", "B9 Odd Fearnot 78", "Q5 Odd Romance 64", "J1 Gaylordsville Fearnot", "P9 Footville Porkey 2", "S6 Ogle Peculiar 74", "R1 Belcher Gaylordsville 28", "P2 Ogle Okay 29", "J0 Chestnut Odd 37", "Z4 Ogle Belcher 71", "D6 Ogle Blueballs 65", "Z7 Chestnut Gaylordsville", "T5 Roachtown Frankenstein", "C7 Frankenstein Gaylordsville 99", "F0 Gaylordsville Chestnut", "S1 Quiggleville Fearnot 84", "B0 Ogle Quiggleville 7", "F6 Quiggleville Fearnot 70", "K0 Quiggleville Romance 27", "M6 Blueballs Footville 70", "G6 Quiggleville Roachtown 45", "X9 Frankenstein Gaylordsville 27", "J8 Fearnot Footville 16", "K6 Hooker Okay 78", "C6 Romance Chestnut 54", "K8 Roachtown Peculiar 4", "C2 Frankenstein Buddha 2", "Q8 Buddha Okay 31", "W7 Ogle Blueballs", "I3 Fearnot Odd 38", "N5 Hooker Quiggleville 27", "R5 Okay Romance 10", "P3 Fearnot Panic 82", "M2 Okay Odd 26", "I5 Odd Footville 24", "R7 Gaylordsville Buddha 89", "Z2 Panic Quiggleville 19" };
    assertEquals("B0 C2 G9 I5 J8 K8 N5 P9 R1 R5 S9 X9 Z2", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case46() {
    String[] roads = { "N3 Frankenstein Roachtown 66", "L3 Romance Roachtown 85", "H8 Porkey Roachtown 70", "F3 Footville Chestnut 87", "V4 Boring Roachtown 19", "P6 Panic Odd 99", "H4 Hooker Blueballs 79", "O0 Buddha Quiggleville 5", "Y4 Frankenstein Hooker 29", "X8 Ogle Gaylordsville 93", "M8 Beetown Frankenstein 37", "S4 Odd Gaylordsville 14", "A1 Belcher Gaylordsville 31", "T7 Fearnot Romance 99", "H5 Frankenstein Gaylordsville 42", "G2 Fearnot Beetown", "F5 Footville Belcher 89", "S8 Ogle Beetown 57", "X5 Boring Odd 76", "G0 Boring Okay", "I8 Peculiar Buddha 10", "O4 Gaylordsville Quiggleville", "O6 Chestnut Fearnot 5", "I0 Belcher Hooker", "I3 Panic Gaylordsville", "I4 Belcher Chestnut", "Q1 Beetown Buddha 60", "Z9 Okay Belcher 37", "N4 Chestnut Hooker 77", "D6 Odd Romance 30", "P7 Roachtown Porkey 14", "W5 Peculiar Buddha 19", "U8 Okay Boring 4", "T8 Boring Porkey 17", "L1 Panic Peculiar 7", "E1 Footville Hooker 51", "E2 Panic Porkey 91", "P8 Okay Quiggleville 45", "R4 Frankenstein Belcher 68", "N5 Ogle Porkey 87", "T3 Quiggleville Hooker 78", "C5 Okay Buddha 37", "K4 Boring Hooker 55", "V5 Boring Footville 55", "F9 Blueballs Boring 62", "E4 Hooker Roachtown 10", "S0 Romance Belcher 19", "U5 Blueballs Boring 93", "Z8 Roachtown Ogle" };
    assertEquals("D6 E1 E4 F9 L1 O0 O6 P7 S0 S4 T8 Y4", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case47() {
    String[] roads = { "P0 Romance Porkey 7", "J7 Fearnot Porkey 43", "Q5 Chestnut Boring 22", "N2 Buddha Panic 55", "D0 Romance Porkey 1", "I7 Panic Chestnut", "N5 Gaylordsville Fearnot 79", "Y6 Beetown Peculiar 2", "W3 Romance Buddha 38", "E4 Footville Okay 9", "G0 Quiggleville Gaylordsville 91", "N1 Gaylordsville Chestnut 5", "H5 Roachtown Boring 21", "O3 Ogle Blueballs 98", "U7 Ogle Chestnut 100", "R2 Boring Porkey 52", "E7 Odd Gaylordsville 50", "F8 Belcher Okay 42", "H2 Quiggleville Roachtown 35", "L8 Buddha Roachtown 14", "B3 Fearnot Chestnut 68", "T0 Footville Roachtown", "H4 Chestnut Odd 30", "M0 Romance Panic", "J5 Panic Odd 27", "K7 Roachtown Blueballs", "I1 Porkey Buddha 47", "V1 Boring Okay 82", "V2 Peculiar Roachtown 71", "U9 Buddha Peculiar 73", "X6 Footville Peculiar", "O2 Beetown Quiggleville 34", "K0 Belcher Peculiar 23", "Z0 Belcher Roachtown 59", "X1 Gaylordsville Buddha", "Z6 Panic Boring 25", "V5 Footville Quiggleville 95", "O0 Odd Blueballs", "X9 Porkey Fearnot 11", "J9 Peculiar Footville 35", "F9 Chestnut Porkey 61", "I0 Peculiar Boring 79", "K8 Ogle Belcher 56", "P6 Frankenstein Chestnut 43", "R6 Odd Peculiar 13", "B1 Buddha Hooker 36", "Y1 Buddha Okay 44", "C0 Belcher Peculiar 95" };
    assertEquals("B1 D0 E4 H5 K0 K8 L8 N1 O2 P6 X9 Y6", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case48() {
    String[] roads = { "O1 Beetown Fearnot 6", "N7 Fearnot Hornytown", "M8 Hornytown Belcher 10", "L5 Belcher Fearnot 8", "U7 Fearnot Beetown 4", "K7 Quiggleville Beetown 12", "H4 Beetown DryFork 6", "Z0 Hornytown Belcher 1", "T6 Beetown DryFork 17", "C7 Quiggleville Fearnot 2", "A8 Fearnot Quiggleville 8", "O5 Belcher Quiggleville 10", "E8 Quiggleville DryFork 8", "Y4 DryFork Quiggleville 4", "Q8 Hornytown DryFork 2", "J9 Quiggleville DryFork 19", "M4 DryFork Quiggleville 7", "T1 DryFork Fearnot 9", "G4 Fearnot DryFork 6", "V9 Hornytown Beetown 5", "O6 Quiggleville Beetown 4", "L8 Beetown Quiggleville 5", "D5 Belcher DryFork 8", "W5 Belcher DryFork 1", "Z4 Beetown DryFork 9" };
    assertEquals("C7 O6 W5 Z0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case49() {
    String[] roads = { "A0 A B 11", "B0 B C 1" };
    assertEquals("A0 B0", roadreconstruction.selectReconstruction(roads));
  }

  @Test
  public void case50() {
    String[] roads = { "O1 Beetown Fearnot 6", "N7 Fearnot Hornytown", "M8 Hornytown Belcher 10", "L5 Belcher Fearnot 8", "C7 Fearnot Beetown 4", "K7 Quiggleville Beetown 12", "H4 Beetown DryFork 6", "Z0 Hornytown Belcher 1", "O5 Belcher Quiggleville 10", "U7 Quiggleville Fearnot 2", "A8 Fearnot Quiggleville 8", "T6 Beetown DryFork 17", "E8 Quiggleville DryFork 8", "Y4 DryFork Quiggleville 4", "Q8 Hornytown DryFork 2", "J9 Quiggleville DryFork 19", "M4 DryFork Quiggleville 7", "T1 DryFork Fearnot 9", "G4 Fearnot DryFork 6", "V9 Hornytown Beetown 5", "O6 Quiggleville Beetown 4", "L8 Beetown Roachtown 5", "D5 Belcher DryFork 8", "W5 Belcher DryFork 1" };
    assertEquals("C7 L8 U7 W5 Z0", roadreconstruction.selectReconstruction(roads));
  }

}
