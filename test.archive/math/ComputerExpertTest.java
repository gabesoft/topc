package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ComputerExpertTest {
  ComputerExpert computerexpert = new ComputerExpert();

  @Test
  public void case1() {
    String[] facts = { "SKY_IS_CLOUDY", "HAVE_MONEY" };
    String[] rules = { "HAVE_MONEY,BAD_WEATHER -> WATCH_MOVIE", "SKY_IS_CLOUDY -> BAD_WEATHER", "GOOD_WEATHER -> PLAY_SOCCER" };
    assertArrayEquals(new String[] { "BAD_WEATHER", "WATCH_MOVIE" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case2() {
    String[] facts = { "NEEDLE_LEAF", "KEEPS_LEAVES" };
    String[] rules = { "KEEPS_LEAVES -> EVERGREEN", "NEEDLE_LEAF -> GYMNOSPERM", "EVERGREEN,GYMNOSPERM -> PINE_TREE" };
    assertArrayEquals(new String[] { "EVERGREEN", "GYMNOSPERM", "PINE_TREE" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case3() {
    String[] facts = { "I" };
    String[] rules = { "I -> I", "P -> CONSONANT", "Z -> CONSONANT", "A/E/I/O/U -> VOWEL" };
    assertArrayEquals(new String[] { "VOWEL" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case4() {
    String[] facts = { "Y", "W", "L", "T", "H", "J", "G", "T", "F", "P", "T", "P", "P", "N" };
    String[] rules = { "C/V,J,F/T,N,W,L -> M", "N/L,F,B/N/E,Y -> C", "M,G,G,S/F/Q,G,S/G,H/Z,W,F,C,Q/F,M -> E" };
    assertArrayEquals(new String[] { "C", "E", "M" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case5() {
    String[] facts = { "G", "H" };
    String[] rules = { "A/B/C/D/E/F/G,Z -> Y", "H,H,H,H,H,H,H,H -> Z" };
    assertArrayEquals(new String[] { "Y", "Z" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case6() {
    String[] facts = { "G", "H" };
    String[] rules = { "A/B/C/D/E/F,G/Z -> Y", "H,H,H,H,H,H,H,H -> Z" };
    assertArrayEquals(new String[] { "Z" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case7() {
    String[] facts = { "B", "N", "I", "J", "G", "T", "Q", "D", "T", "O", "S", "T", "U", "R", "M", "C", "P", "N", "G", "G", "Y", "V", "K", "C", "T", "K", "W", "J", "A", "F", "Y", "Y", "N", "G", "R", "P", "C", "T", "T", "P" };
    String[] rules = { "J,V,A -> D", "J,F/Z,H,C,I/C,K,E/C,X,R -> V", "T,S/X,W/Q -> F", "Q,Z,A,O,M/H,T,S,M/A,A,U/I,M,N,E -> D", "U/V,C,C,D/R,L,E -> K", "F,Y,Q/I,O,E,X,W/W,H,D,G -> V", "V,H,I,F,P/H,H,C/Z,O/B,O,U,J/V,E -> B", "M/Y/Z,N/E,J,C,L,N -> P", "A,X,S,G/K/B,R,C/W,H,J,E,K/P,Q,H -> S", "M -> S", "E,Z/N,M,C,H,C/Z,S,K,L/X,C/Z,X,C,Z,J -> N", "A,S,F -> H", "M,Y -> G", "P,K,R,Z/Z,F,O -> T", "B,Z,D/W,N/S/O,W -> G", "I/H -> R", "N,U,J,H,F/L,H -> Y", "D,O/R,X/M,S/C,X/G -> O", "D/P/N/E,C,Z,N/V,I,R,R -> W" };
    assertArrayEquals(new String[] { "H" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case8() {
    String[] facts = { "I", "W", "M", "D", "F", "M", "S", "T", "Q", "U", "X", "V", "X", "T", "W", "I", "O", "M", "N", "G", "O", "S", "K", "P", "O", "O" };
    String[] rules = { "I/W,F,V -> J", "P,T,D/W,M,N/L/E -> N", "R,P -> G", "X/I,P/D -> L", "A,U,Z,U/M,T,Z,B,K -> B" };
    assertArrayEquals(new String[] { "J", "L" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case9() {
    String[] facts = { "S", "Q", "I", "G", "U", "Q", "Z", "E", "K", "O", "V", "O", "K", "Q", "C", "S", "Q", "G", "I", "K", "O", "E", "Q", "A", "A", "M", "C" };
    String[] rules = { "U,K/D,E,N/V,O,U/T -> K", "D,J,P/X,E/G,F,C,S -> D", "F,W,I -> S", "H,Q,M -> X", "Y,V,H,A -> B", "L,P,D/D,X,L,R/S,F,D,T -> W", "T,I -> L", "L,V/L,E,W,H/F,Y,R,L,X/K,U,X -> D", "X,M,B/M,C,X -> A", "S,Z,X/L,F,C,C,X -> X", "F,U,M/A,G,C,E,U/A,C,D,Z,M/G,T,O,L,G/X,R,G,Y -> H", "H/N/I -> A", "D,P/S,F,S,D,K/I -> L", "I/T,G,U/A,C,R -> M", "A,B,O,E,A/E/O,W/O,B,T,Y -> G", "F,A,Z,J -> L", "Z,U,N,V,B/E/Q,D,I/X/C,O,X -> T", "T/L,D,C,X/E,X,J/S,C,C,S,B -> S", "N,T,E,T/R,W,F -> K", "C,W,C,Z,V/G,F,R/B -> O", "P,Z/Z,S,Z/C,H,E,U,Y/P,Z/J -> N", "B,X/Q,N/O,M,W/U,T -> L", "H,W -> O", "X,B/X,N,L -> I", "Z/T,K,N,S/M,I,X,D/G,I,I,B -> P", "E,B,N,U,Y/D,O,L,V,L/C,J,M,U/L,Z,I,Y/C,C,Y -> M", "H/A,Q/L/B,C,R,B,S -> M", "Y,M,H,Q/C,R,C,W/J,F,F,I,L/X,B,G,H -> U", "U,H,D,K,E/D,B/R,Z,L,Z,G -> M", "S,D,S,Q/C,A,B/R,L/V,T,O -> L", "R,X,Z,E,B/F,A,H -> O", "E,G -> I", "N/D,E,K,D,F/K,A,J -> S", "E,B/T/F,E -> C", "B,P,O,R,J/A,U,C,C,J/P,V,H,M,X/Y,V,R -> U", "I -> A", "N -> Y", "T,P/K,W,K,A/I,Z,H,P -> Z", "X,L,W,N/Q,F,T,J,W/X,Y -> J", "Q,O,L,R/Q,W,I,M,B -> U", "A,D,F,O,L/I,L,B,L/X -> K", "U,R,A,U,E/U,A,F/Z -> B", "B,F,W,K,O -> D", "E,N/J,I -> P", "P,S,R,M,T/C/P,C,A/X,I,Y/I,T,S,N,M -> S" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case10() {
    String[] facts = { "P", "O", "K", "Q", "F", "S", "D", "R", "K", "H", "G", "D", "L", "V", "V", "M", "R", "S", "Y", "J", "X", "S", "M", "A", "A", "I", "R", "E", "Z", "U", "F", "R", "L", "C", "M", "R", "G", "V", "G" };
    String[] rules = { "L,E,H/I/A,D,L,B/W,C,Q,H,E/M,F,G -> T", "F,V,S/O/M,W -> C", "A,E/R,M,V,X,D/Q,P,K,Z -> E", "E,D/S,F,I,T/N,L,N/I,G,R,M/V,R,H -> A", "Y,N,L/O,X,U/A/Q/L,R -> T", "F,A,M,O -> O", "D,T,Z/G,S/C,P,O/G,Y -> C", "N,H,T,E,I/T,V,H,K,U/A,K,M,C,P/A,M,F,M/W,T,I,F -> M", "G,C/Z,K,N,S,T -> Z", "Y,A,Z,N/C,Z,O,A,P/K,H,F,N,W/Z,G,D,F -> V", "X,I,C,O,O/M,Q/W,U,R/N -> P", "V,V,Q -> H", "M,U,S,H,P/X,O,H,F,M/G,D -> C", "L,Y,G,E -> K", "N/Z,D,I,N,K/D,F,V,P,Q -> H", "V,W,U,W -> A", "B,U -> V", "J,W,N/B/B,V,X,P/W,V,W/R,N,C,G -> E", "V,D/E,J,V/P,I,U/S,U,O,E -> B", "M,R,K,J,W/S,S,N,B,Z/K,E,C,H/T,J -> Q", "D,M,G,O,J -> J", "Y,Q,S/H/M,A,U,H/X,Q,C,R -> U", "Y,U/C,N,T,T,F -> Q" };
    assertArrayEquals(new String[] { "B", "T" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case11() {
    String[] facts = { "M", "L", "K", "S", "V", "C", "X", "K", "B", "B", "F", "B", "Q", "G", "N", "L", "R", "C" };
    String[] rules = { "O,S,N,M,X/L,W,E -> J", "P,E,Q/N,M,R,B,Y/J,R -> Q", "D/J/F/K -> Z", "H,E,L,E/I,Q,R,W,R/R -> N", "O,F,M/G -> O", "D/L,K,E,N -> P", "M,W -> V", "B,O,T,M/O,X,Q,D,M -> W", "J,C,G/H,Q/W,R,Q,E/J,B -> U", "N,N/F,L,H/N,N,G,L/J,A -> G", "Q,L/K,Y,W,D,A -> J", "X,P,D,H/P,N,G/D -> I", "W,I/O,B,X,L/H,T,Y,N,V/R,U,L/C,Q,M -> C", "S/K,A -> Z", "E,Q,A/P,I,S,O/L,Y,R,F,Z/U,L,Y/D,T,T -> M", "E,F,E,U,V/V,L/Z,J/Q,I,M,H,S -> U", "C,C,I/N,A,D/W,S,P/V,X/V,V,G,A -> W", "L,G,M,V/V,M/J/C,H,W -> H", "P,O,I/L,K,J,H,N -> P", "I,H,G/B/F,Q -> C", "R,W/R,C,P,W,A/U,I,O -> Z", "B,G,Y/T,Q,G/O,G,H -> C", "N,Q,L,U,B/Z/N,U,Q,E,O/N,Z,R,S,J/X,F -> Z", "C,R,T,H/D,B,N/C,H,C,S/V,V,Q/B,Y -> E", "N,E,B,G,F/Y,T,K,V,N/X/H,U,E,T,J -> X", "V,Z/U,O,Z/F,S,X/H/G,C,O,Q -> F", "E,A/U,U/N,A,T,T,E/D,I,W,V,X/U,N,I -> V", "C,K,M/C,V/J,M/C,C,Y,U/Z,Y,W -> P", "H,L,R,J,D/W,R,J,Z -> H", "W,Z,F,I,V/A,D,P,J/A,D,Y,S/Z,V,B,E,P/E,H,Q -> A", "C,O -> G", "W/H,S,K,D -> K" };
    assertArrayEquals(new String[] { "Z" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case12() {
    String[] facts = { "G", "B", "Z", "P", "X", "Z", "T", "U", "H", "E", "J", "L", "J", "X", "N", "S", "D", "V", "A", "F", "W", "K", "W", "S" };
    String[] rules = { "P,I/U,D/A,G,M/N,C,G,D/A -> T", "B,V/R/K,E,W,C/O,R,F -> G", "O,H -> U" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case13() {
    String[] facts = { "K", "I", "F", "T", "Y", "I", "X", "S", "H", "I", "V", "K", "T", "L", "Y", "K", "L", "S", "P", "B", "C", "D", "H", "X", "F", "T", "Z", "K", "M", "O", "Y", "B", "L", "Z", "W" };
    String[] rules = { "N,I,K,G/V,L -> E", "Y,U,Z,A/M,I/I -> P", "D -> B", "T,E,W/W/G/T,R,B -> U", "J,K,Q,L,Y -> B", "Z,G,Z/J,J,B,B,G/P,D -> Y", "H,H,L/Q,N,M -> W", "F,R/O/J,X,H,F/D,W,U/W,L,F,V -> K", "X,J,G,B/K,G,B,Q/J,W,C,H/W,C,F,F,A/R -> G", "H,W,F/E,Y,C,H/V,J,B,T/Z,Q,V,U,D/T,N,S,P -> V", "V,A,N,Q,D/B,N,E,U,B/H,H,O/C,L/Y,H -> P", "U,J,Q,G/I,J,T,G,T/O/C -> L", "P,C,Y,E,U/O/F,X/L,F,A,O/W,U,V -> E", "J,N,I,S/L,S,O,N/T,Q,E,U,H/X -> A", "F/R,P,K/C,N,Q,Z,A/S,D,I/R,R,Q,S -> S", "I,S,Q,R,Q/E,L,I/S,P/Y,L -> I", "F -> Q", "I,Z,C/Y,Y,Q,F,G/Q/G,J/L -> K", "Q,Z,G/I,H,Y/Z,D,Z,B,H/V/I,E,Z -> P", "E,J,U,P,V/K,J -> F", "D,A,P,D/K,U,Z,H/B,V/Q,L,K,X -> B", "O,O,X,F/A/Y,N,U/O,P -> Z", "N,F,W,I,G/M,F -> T", "J,D/C,G,C,J,N/U,E/L,P -> P", "I,T,B,Y/P,C/Z,X/Y,U,K,Q,L/F,N,K,K,C -> Y", "Z/V/E,C -> A", "J,E,X,V/A/M,Q -> X", "K,R,Q/M/L -> L", "J,T,L,G,E -> T", "C,B -> O", "L/F,N,K,Q,K -> N", "E,W,B,A/Z,F,E,J/B,N,M -> K", "E,Q,Y,M,Z/D -> J", "R,F/X,Y,R/E,Y,E/J,P,A,V/N,A -> J", "I,G,I,Y/G/H -> E", "U/W/K,A,V/K,Q,N,M,W -> S", "V,A,K,Z,L/I,U,G,Z -> H", "B,P,J/P,V,H,P,P/V,N,X/E,X,F,T/D,M,U -> U", "N/B/Y,J/J,G,N,R,T -> H", "X -> S", "N -> M", "P,D/M,B,M/D,T,M,Q,H/Z,P,R,L -> A" };
    assertArrayEquals(new String[] { "A", "Q" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case14() {
    String[] facts = { "C", "Z", "P", "M", "X", "T", "T", "E", "L", "P", "J", "P", "A", "I", "W", "H", "T", "H", "X", "H", "A", "C", "Z", "V", "I", "M", "I", "L", "T", "A", "L", "V" };
    String[] rules = { "V,K/V,Q/R,L,Q,C -> U", "Q,U,H,W/O,M,Z/U/H/V,J,Q,X -> J", "M,C,Z,N/P,H/E,C -> U", "Z,A,B,P,F/X,S/M,R,A/P,S,O/E -> T", "X/G,Z -> G", "E/E,Z,X,L,D/G/L,T/A,W,E -> H", "M,P,R,J,P/Q,P,R,N/F,Q,B,L -> K", "O,K/Y,L,D/O,C/C,M,L,A/C -> T", "R/U,M,C,S,N/M,B/F,T/Y,E,T,K -> Y" };
    assertArrayEquals(new String[] { "G", "U" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case15() {
    String[] facts = { "D", "U", "F", "J", "A", "L", "C", "U", "I", "W", "V", "B", "I", "X", "C", "X", "K", "B", "O", "V", "S", "T", "V", "F", "V", "I", "L", "H", "S", "C", "Q", "O", "W", "S", "G", "Y", "A", "I", "I", "U", "H", "E", "F", "S", "X", "X", "W", "Y", "P", "C" };
    String[] rules = { "L,Z,S/L,E/Y,W,B,G,D/X,J,C -> D", "F,Z,Q/T -> Z", "P -> L", "R,M,Z,S,Q/P,L,S,V,T/V,X,A,B/M,O,I,V -> H", "U/B/A/B,W -> F", "L,E,V,T,B/V,W,F -> G", "D,Q,J/M -> T", "Q,J,J,P,A/R/Q,N,Y -> N", "K,E,N,F,B/A,D/Y,E,Q,G/R,I -> A", "Y,C,C,L/E,P,W,I -> X", "T,E,D -> S", "G,V,E,W -> R", "M,A,F,M,M/A,W -> E", "Y,R/A,X,Z,H,V -> S", "A,H,Z,M,V/M,H,B/O,V,W/N,W,X,I,G/K,J,U -> P", "C,U,J,D/B/G,I,O,V,E/S,E,A,C,Z/X,X,V,Z,N -> J", "F,T,H,H/I,T,K/I,D,N,A,B -> V", "A,K/A,X -> S", "S,N/K,D/A/R,Y/R,Z -> N", "Y/B,S,R,Y,R/X,D,V/D,I,U/U,T,Q -> C", "J,E,U,M,O -> G", "R,G,V,E -> B", "I,I/Y,A,E,S/I,K,Q,F,F -> N", "S -> H", "X/F,Q/A/Z,G,T/N -> E", "W,N,Q,Y,C/K,W,D,J,L/W,I,B,T -> Q", "E,K,Y/A,L/E,B,H,O,W -> M", "F,M,K,W,P/W,H,M,E/E,B,U,S,T -> L", "I/N,Q,L,D/E,X,F,G,K/R,Y -> O", "S,F,A,T,L -> B", "L,I,J/M,S,E,N/R,Z,O,S/M,F,S,W,T/M -> X", "P,Z,Y,Q,M/L,Q/C,D,T,U/Y/T,Z,C -> C", "K,H,E,B -> H", "F,G,G/W,Q,T,L/Q,U,J,L,U -> J", "F/E,O/Y,U,Y,T,P -> U", "T,Y,R,F,L/N,U,R/Q,W,W,Q,Q/P,G,V,M/J,T,Q -> W", "Y,V,D,L,E/X,G -> V", "V/F,V,Y/G,I/P,E -> E", "N,W/T -> T", "K,X/D,M,L,M/V/G,N,M,B/O,V,Q,I -> S", "E,I,H,C,P/V,V,U,C,L/R,V,Z/L -> S", "R/I,G,H,K,X/U,D -> X", "G,I/N,R,W,Y,H/I,O,P -> P", "Y/Z,L/E,B,E,W,R/V/S -> J", "B,U,P,M,J/G,Q/W,E,E,D,S/Z,P,N,P -> X", "A,F,E/I/T,M,H,C,A -> Y" };
    assertArrayEquals(new String[] { "M", "N", "R" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case16() {
    String[] facts = { "S", "C", "C", "E", "Q", "H", "Q", "E" };
    String[] rules = { "T,J,U,M/C/N,X,C,H,Z/P,R,V -> B", "N,P,Z/T,N,C/P,L,J,G,O/N,P/L -> Q", "M,V/O,K,C,M,J/D,K,T,B,S/G,C,O,C,P -> L", "Z,Z,L/I,H/B,D/T,G,M,Y -> W", "M,N/Z,A,S,W -> S", "Z,V,R/K,D,M/W/U,N,X -> K", "P,F,A/D,Y,H,G,S/M,L,F,Z -> B", "G,M,O,D,J/Q -> Z", "J,Q -> N", "W,P,Q/D,T,D/C,X,H/J,D -> M", "G/R,X/O,O,I -> P", "B/I,T/H,S,W/D,Z,O -> G", "L/I,K,X,I,Q/C -> Y", "X -> N", "J,S,E,P/C,H/H,B,Z/P,S,E,P,E -> N", "B,T,T,R,J/B,B,O/M,R,D -> K", "A,B,R,F/M,V,Q,W/A,J,B,B,M/M,D -> Z", "X/M,O,H,S,R/Y,N,A/D,U,I,I -> C", "A,Z/X,G/G/K,T,J,T,T -> G", "N,K,K,I,U/A,I/R/Y,Q,U -> A", "K,E,F,U,E/V,Y,J,P,H/K/B,P,A,Z,L/J,Y -> Z", "K,C/T,Y,L/C,Z,W/M,B/C,Q,E,J,T -> M", "K,N,M,U,L/Q,G,M/N,Y,Q,E -> U", "K,Y,M,S,F -> E", "Q,W,V/T,S -> E", "Q,W,P,Y/A,S,J -> K", "P,O,T,R/Q,C,E,G,G/N,Q,H,S/B,A,Y/D -> Q", "D,W/A -> D", "X/F,R,G,P,T/U/P,M,K,C,A/R,Y,U,M -> L", "Y,T,D/E,M/Z,P,F/Q -> P" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case17() {
    String[] facts = { "Y", "T", "I", "T", "W", "P", "H", "H", "C", "R", "M", "N", "T", "W", "N", "O", "A", "O", "B", "G", "M", "D", "D", "B", "T", "S", "Q", "R", "D", "F", "D", "F", "V", "F", "E", "M", "X", "M", "H", "M", "V" };
    String[] rules = { "H,X,C,W,D -> C", "V,H/N,D/J/D,Q/X,B,Z -> N", "G,X,S,J,B/Q/L -> W", "P/G,C,C,M,X/H,M/F,P,S,D,L/D -> A", "O,N,S,K,R/Z,V,S,S,Z/G,V,S,T/Z,T,P,M,Q -> T", "G,H,C,C,A/M -> Q", "X -> S", "R,M,S,M/S,U,Z,F/I,F,Y/J,P/P,L,D,Z -> W", "V,S,C,X,X/X/G,Y,A,W,P/C,C -> W", "M/T,K,T,L -> C", "W,Z,C,C/B,D,P,F/K,I,S/Q,I -> A", "Y,W,E,T/Q,Z,N -> B", "W,M/X,O,W,J,G/Q,W,W,P,G/H,Y,W,D -> O", "H,B,L/E,L/K,B -> S" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case18() {
    String[] facts = { "L", "W", "Y", "K", "Z", "K", "H", "M", "J", "N" };
    String[] rules = { "C,P -> X", "E,U,K/I -> A", "K,L,A,V/Y,Q/Q -> P", "R,M,T/C,W,B,I/H,Y/Y,Y,L,W -> V", "M,S,Y,B/B,G,R,P,M/L,B,B,B,X/T,W,Y,M,R/W,B -> P", "X,W,L,I,R -> Y", "H,H,J/X/F,Y,H -> V", "M,Y,L/B,C,X,W,P/I,T,Q,O,B/E,M,O/W,O,C,W,D -> F", "Y,B,J -> R", "M,W,S,K/U,V,B,J,A -> O", "U,T,D/E,G,T,K,D/Q,P,E/V,Z,Z -> E", "X,I -> U", "V,O,T,R -> P", "N,C,V,E,D/U,I/G,A/Z,B,T/Y -> P", "C,N/K,E,D,H,P -> R", "T,B,C,P,N/G,N,H,S,B/E/T,N,B/C -> D", "Z,J,U,D/S -> P", "K,Z,W,J/Z,P,O,U,F -> F", "X,D,D,Z,H -> N", "L,V,P -> B", "D,J,E,D,G/B/B,F,Y,Y/C,P,W,W,U/U -> Z", "Z,Q,D,V,P/N,K -> A", "Y/Q,O,V,A,Z/X,N,F/C/R,U,J -> P", "Z,G,R,V/E,L/B,C,B -> Y", "D,S,G/X,H,O,G/H,V,P,D -> O", "C,Q/R,G,K -> G", "T,X,F,E/C,L,D,C,P -> H", "Z,O -> R", "F,R,V,T,Q/K,L,V,T/U,W/G,M -> I", "F,B/O,V/Y/B,S,H,B -> O", "W,N,R/W,G,W,D,F -> O", "S,G,N,Y -> B", "H,A/O,M,R,O,J/A,C,E/E,T,C -> E" };
    assertArrayEquals(new String[] { "V" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case19() {
    String[] facts = { "M", "P", "E", "C", "Q", "A", "Q", "R", "D", "C", "G", "A", "B", "F", "G", "N", "M" };
    String[] rules = { "F,I,P,O -> A", "B/F,V,M,A,P -> A", "W/N/L/B,U,T,X,N -> V", "X,P,S/C,E,U,K/T,M,V,I,X/E -> G", "W,Z,A,P/C,V,W/I,Y,V,W,B -> I", "C,F/M,F/A,F,V,S,J -> D", "O/A,M,G,O/B,L,K,P,E/X,L,F,N/T,I,T,C,B -> H", "E/T,X -> L", "I,V,L/A,J,T/V,P,I,X,G/I,I -> L", "O,Y/H/E/W -> C", "M,T,X,T,Q/U,N,Q/V,S -> C", "Z,G,I,Q,D/Z,D,B,V,E/N,F,N,X,E/S,Q/A,N,Z -> I", "U,G/O,C,B,C/T,V,R,C/X/Q -> S", "B,P,K,F,R/M,Y/D,A,P,J -> Z", "Q,I,S,C,O/A,Y,S,X,X -> F", "J,P,C,F/P,O,Y/C,Z,O,I/C,Y,V -> D", "M,H,T,U,Z/U/C,Q -> X", "L,I,T,D -> K", "E,A,X,T,M/E,A/D,W,H,K,R -> J", "G,W/Q/M,Q,N -> Q", "P,M,N/W,R,E/X,P/D,G,O,O,F -> U", "X,P,S,D,H/B,Y -> P", "L,X/C,E,D,K,L/V/Z,F,Y -> K", "P,S,M/C,D,K/M/V -> U", "E/R,H,I,M -> Y", "A -> H", "C,D,C/V,Z,K/U,D -> L", "R,Y,S/D,P,T,W,N/D,W,N/O,O,P,C,E -> H", "S/C,Y,C,V/F/E,M,J/H -> Q", "F/M,I,X,D/B,K,I -> R", "V,F,X/T,L,K/T/L -> G", "R,Q -> C", "O/I/P,W,K,K,H -> W", "L,D,N,Q/X,H,E,K -> U", "I/E,S,F,B,Y/C,H -> U", "Y,H,Z,A -> O", "E,R/Y,D -> Z", "D,H,N,K,K/N,I/L,D,U -> K", "J,L/M -> G" };
    assertArrayEquals(new String[] { "H", "Z" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case20() {
    String[] facts = { "G", "V", "A", "Z", "T", "I", "T", "H" };
    String[] rules = { "M/K/X,K/S,H,O,B -> U", "D,L,J,J,E/M,H/K -> O", "R,N,H/F,F,B,O,Y/Q/L/V,Q,M -> Z", "D,O/W,N -> A", "R,Q,S,R/J,R,D,A -> A", "K,E,C,O/X/V/F,L,A -> F", "D,O,H,S -> J", "Q/A,R,U -> L", "G/M,B,N/X,C,E,Y,U/F,S,C,G/L,R,Q,A,L -> H", "G/F,S,F -> C", "M,J,I/E,X,A/G/J,V/B,I -> A", "Y/I,O,I,O,W -> H", "S,U -> X", "M,K,Y,Z,G/R,X,A -> X", "Q/S,A,R,S,W/F/M,X,M,J/S,W,P,Q -> Q", "P,O,U/G -> Y", "X,X,E/E,R,B,A/L/I,T,T,G,P/V,Z,G,L,H -> D", "C,U,K,I,T -> A", "J/A,B,T,D/G/K,G,F,E,G -> X", "Q,A -> X", "Z,V,D,B,T/P -> U", "P,D,A/Z,O,Y -> C", "I,I,Z,Q/N,V/B,D/H,X,B,F -> F", "N,W,C,L,T/L,W,U/L,V,K,E,L -> P", "F,U,L,N/D,P,C,Y/K,F,Q,Q,L/G,U/P,E -> M", "H,S/N/N,G,D/C/S,V -> K", "B/R,G -> U", "V,F,E,D/B/Q,Q,S,P/W,A,J,T,U -> F", "B,C,J,P,I/O,D,U,P -> R", "W,I -> N" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case21() {
    String[] facts = { "Q", "T", "K", "L", "U", "P", "I", "E", "T", "Y", "W", "B" };
    String[] rules = { "F,N,K,Z,Q/M,O,T,L -> F", "Z,I,G,N,F/V,F,V,H,R -> U", "L,X,F,H/Y,Y,A -> N", "G,G,G,D -> C", "Q,P,I,H/V,Z,J -> E", "Z/C,E,E/Z/N,O,B,Q,I/Y,E,F,B,Y -> R", "O,Z/J,M/V,Y,T/Y,X,W,U -> Z", "Y,B,U,M -> X", "F,D,Q,N/W,S,B,G -> L", "Q/L,K,H/Z,W,H,D,M -> D", "K,B,D/Y,C,F,P -> S", "F,M,L/B,O/J,Q -> D", "L,V,J,A,W/G,R,D,Z -> J", "B,D -> U", "X,D,Q/S,F,Q,B,D -> R", "O,P,H,M,D/W,W/J,M,G,Q/C,V,B,T/O,R -> O", "H,X/F,L -> Q", "H,S,G,B,R -> Y", "T,X,C,X,N/N,D,D/O,J,G,D/Y -> E", "Y/K,X -> F", "O,Z,U,N/E/C/A/A,E,O -> L", "F,L,X/S,C/M/D,G/E,S,J -> F", "B,L/C -> O", "E,A,P -> C", "H,Z/U,G,M/W,F/N/P,R,F -> W", "J,Z,R,R,B/B,Y,Q,P -> X", "L,U,Y/X,D,L,D/O,O/O,G,E -> L", "K,V,V,S,C/V,P,M/Z,Y,W/F,F,S,G,K -> U", "B,U,W,D,D/J,D/Y,J,P -> A", "I/J,F -> Q", "X,H,R/S,S,H,T,E/V,M,F,X,Q -> D", "O,F,E,Z -> Y", "D,Z,H,N,U/D,O,R,U -> I", "R,B,V/F,W,J,V,E/H,W -> S", "O,H,B,A,B -> C" };
    assertArrayEquals(new String[] { "O" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case22() {
    String[] facts = { "A" };
    String[] rules = { "A -> A" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case23() {
    String[] facts = { "A" };
    String[] rules = { "XA -> YA", "WA -> XA", "VA -> WA", "UA -> VA", "TA -> UA", "SA -> TA", "RA -> SA", "QA -> RA", "PA -> QA", "OA -> PA", "NA -> OA", "MA -> NA", "LA -> MA", "KA -> LA", "JA -> KA", "IA -> JA", "HA -> IA", "GA -> HA", "FA -> GA", "EA -> FA", "DA -> EA", "CA -> DA", "BA -> CA", "AA -> BA", "Z -> AA", "Y -> Z", "X -> Y", "W -> X", "V -> W", "U -> V", "T -> U", "S -> T", "R -> S", "Q -> R", "P -> Q", "O -> P", "N -> O", "M -> N", "L -> M", "K -> L", "J -> K", "I -> J", "H -> I", "G -> H", "F -> G", "E -> F", "D -> E", "C -> D", "B -> C", "A -> B" };
    assertArrayEquals(new String[] { "AA", "B", "BA", "C", "CA", "D", "DA", "E", "EA", "F", "FA", "G", "GA", "H", "HA", "I", "IA", "J", "JA", "K", "KA", "L", "LA", "M", "MA", "N", "NA", "O", "OA", "P", "PA", "Q", "QA", "R", "RA", "S", "SA", "T", "TA", "U", "UA", "V", "VA", "W", "WA", "X", "XA", "Y", "YA", "Z" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case24() {
    String[] facts = { "A" };
    String[] rules = { "A -> H", "A -> G", "A -> F", "A -> E", "A -> D", "A -> C", "A -> B" };
    assertArrayEquals(new String[] { "B", "C", "D", "E", "F", "G", "H" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case25() {
    String[] facts = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA", "GA", "HA", "IA", "JA", "KA", "LA", "MA", "NA", "OA", "PA", "QA", "RA", "SA", "TA", "UA", "VA", "WA", "XA" };
    String[] rules = { "WA -> XZ", "VA -> WZ", "UA -> VZ", "TA -> UZ", "SA -> TZ", "RA -> SZ", "QA -> RZ", "PA -> QZ", "OA -> PZ", "NA -> OZ", "MA -> NZ", "LA -> MZ", "KA -> LZ", "JA -> KZ", "IA -> JZ", "HA -> IZ", "GA -> HZ", "FA -> GZ", "EA -> FZ", "DA -> EZ", "CA -> DZ", "BA -> CZ", "AA -> BZ", "Z -> AQ", "Y -> ZQ", "X -> YQ", "W -> XQ", "V -> WQ", "U -> VQ", "T -> UQ", "S -> TQ", "R -> SQ", "Q -> RQ", "P -> QQ", "O -> PQ", "N -> OQ", "M -> NQ", "L -> MQ", "K -> LQ", "J -> KQ", "I -> JQ", "H -> IQ", "G -> HQ", "F -> GQ", "E -> FQ", "D -> EQ", "C -> DQ", "B -> CQ", "A -> BQ" };
    assertArrayEquals(new String[] { "AQ", "BQ", "BZ", "CQ", "CZ", "DQ", "DZ", "EQ", "EZ", "FQ", "FZ", "GQ", "GZ", "HQ", "HZ", "IQ", "IZ", "JQ", "JZ", "KQ", "KZ", "LQ", "LZ", "MQ", "MZ", "NQ", "NZ", "OQ", "OZ", "PQ", "PZ", "QQ", "QZ", "RQ", "RZ", "SQ", "SZ", "TQ", "TZ", "UQ", "UZ", "VQ", "VZ", "WQ", "WZ", "XQ", "XZ", "YQ", "ZQ" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case26() {
    String[] facts = { "A", "B", "_X", "X_" };
    String[] rules = { "A/B,C -> D", "A,B,C -> D", "X -> Y", "_X_ -> Y" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case27() {
    String[] facts = { "X_" };
    String[] rules = { "X_ -> X" };
    assertArrayEquals(new String[] { "X" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case28() {
    String[] facts = { "Y", "W", "L", "T", "H", "J", "G", "T", "F", "P", "T", "P", "P", "N" };
    String[] rules = { "C/V,J,F/T,N,W,L -> M", "N/L,F,B/N/E,Y -> C", "M,G,G,S/F/Q,G,S/G,H/Z,W,F,C,Q/F,M -> E" };
    assertArrayEquals(new String[] { "C", "E", "M" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case29() {
    String[] facts = { "A" };
    String[] rules = { "A -> C", "C -> B" };
    assertArrayEquals(new String[] { "B", "C" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case30() {
    String[] facts = { "A", "C", "E" };
    String[] rules = { "A/D -> F", "A,A -> G", "C,G -> H", "H,B -> D", "H/B -> C" };
    assertArrayEquals(new String[] { "F", "G", "H" }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case31() {
    String[] facts = { "A" };
    String[] rules = { "B,C/A -> D" };
    assertArrayEquals(new String[] {  }, computerexpert.operate(facts, rules));
  }

  @Test
  public void case32() {
    String[] facts = { "A", "B", "C" };
    String[] rules = { "A -> A", "B -> A", "C -> D", "A,B -> D", "D -> A", "A -> B", "B -> A", "A/B -> E", "A,C -> F", "A,B,C/A,B -> Z" };
    assertArrayEquals(new String[] { "D", "E", "F", "Z" }, computerexpert.operate(facts, rules));
  }

}
