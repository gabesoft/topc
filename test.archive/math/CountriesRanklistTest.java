package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CountriesRanklistTest {
  CountriesRanklist countriesranklist = new CountriesRanklist();

  @Test
  public void case1() {
    String[] knownPoints = { "Poland Krzysztof 101", "Ukraine Evgeni 30", "Ukraine Ivan 24" };
    assertArrayEquals(new String[] { "Poland 1 1", "Ukraine 2 2" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case2() {
    String[] knownPoints = { "Poland Krzysztof 100", "CzechRep Martin 30", "CzechRep Jirka 25" };
    assertArrayEquals(new String[] { "CzechRep 1 2", "Poland 1 2" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case3() {
    String[] knownPoints = { "Slovakia Marian 270", "Hungary Istvan 24", "Poland Krzysztof 100", "Hungary Gyula 30", "Germany Tobias 27", "Germany Juergen 27" };
    assertArrayEquals(new String[] { "Germany 2 4", "Hungary 2 4", "Poland 2 2", "Slovakia 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case4() {
    String[] knownPoints = { "usa Jack 14", "USA Jim 10", "USA Jim 10", "USA Jim 10", "USA Jim 10", "usa Jack 14", "usa Jack 14", "Zimbabwe Jack 10" };
    assertArrayEquals(new String[] { "USA 2 2", "Zimbabwe 3 3", "usa 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case5() {
    String[] knownPoints = { "a a 1", "b b 1", "d d 1", "c c 1" };
    assertArrayEquals(new String[] { "a 1 1", "b 1 1", "c 1 1", "d 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case6() {
    String[] knownPoints = { "a a 1", "b b 2", "d d 1", "c c 1" };
    assertArrayEquals(new String[] { "a 2 2", "b 1 1", "c 2 2", "d 2 2" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case7() {
    String[] knownPoints = { "a a 600" };
    assertArrayEquals(new String[] { "a 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case8() {
    String[] knownPoints = { "a a 100", "b b 200", "d d 100", "c c 100", "e e 10", "e f 10" };
    assertArrayEquals(new String[] { "a 2 4", "b 1 1", "c 2 4", "d 2 4", "e 5 5" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case9() {
    String[] knownPoints = { "a a 100", "b b 200", "d d 100", "c c 100", "e e 90", "e f 90" };
    assertArrayEquals(new String[] { "a 1 5", "b 1 5", "c 1 5", "d 1 5", "e 1 5" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case10() {
    String[] knownPoints = { "a a 47", "a b 50", "a c 11", "a d 547" };
    assertArrayEquals(new String[] { "a 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case11() {
    String[] knownPoints = { "abcdefghij klmnoPqrst 100", "abcdefghik jlmnoPqrst 40", "ACBDEFGHIJ KLMNOPQRST 140" };
    assertArrayEquals(new String[] { "ACBDEFGHIJ 1 3", "abcdefghij 1 3", "abcdefghik 1 3" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case12() {
    String[] knownPoints = { "r vS 452", "r WD 422", "t Ie 97", "q KM 421", "q aA 268", "w or 157", "e le 399", "e Kp 472", "e vy 245", "r LP 180" };
    assertArrayEquals(new String[] { "e 1 2", "q 3 3", "r 1 2", "t 4 5", "w 4 5" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case13() {
    String[] knownPoints = { "r vS 452", "r WD 422", "t Ie 97", "q KM 421", "q aA 268", "w or 157", "e le 399", "e Kp 472", "e vy 245", "r LP 180", "t SR 146", "t yl 534", "q ew 380", "w tE 388", "e uU 370", "q HA 528", "w kT 514", "r fd 253", "t Yv 279", "w eG 419" };
    assertArrayEquals(new String[] { "e 2 2", "q 1 1", "r 4 4", "t 5 5", "w 3 3" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case14() {
    String[] knownPoints = { "r vS 596", "r WD 595", "p Ie 596", "q KM 599", "q aA 599", "w or 598", "e le 596", "i Kp 595", "e vy 598", "r LP 599", "p SR 600", "t yl 597", "y ew 599", "w tE 598", "e uU 596", "y HA 598", "u kT 598", "r fd 598", "e HJ 598", "t Ai 597" };
    assertArrayEquals(new String[] { "e 1 1", "i 3 9", "p 3 9", "q 3 9", "r 1 1", "t 3 9", "u 3 9", "w 3 9", "y 3 9" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case15() {
    String[] knownPoints = { "I vS 116", "K WD 493", "B Ie 428", "G KM 527", "G aA 137", "s or 430", "U le 524", "k Kp 403", "v vy 568", "K LP 443", "R SR 120", "O yl 525", "h ew 527", "H tE 274", "d uU 482", "y HA 328", "A kT 130", "f fd 496", "U HJ 568", "O Ai 351", "S Ad 579", "D ji 252", "t FA 61", "Q Vi 413", "Q Du 540", "Z XJ 179", "k pp 303", "k LV 357", "w AJ 242", "h Bo 420", "G cz 518", "C WS 276", "p zF 257", "C yv 366", "u YP 225", "E Yq 30", "r Kv 169", "o YL 550", "X FX 446", "X iy 156", "R Lq 429", "H vH 101", "O qE 515", "S Ei 292", "W yK 137", "U sf 29", "m Pa 122", "o hB 38", "P Ba 429", "K Mn 130" };
    assertArrayEquals(new String[] { "A 25 31", "B 14 19", "C 9 12", "D 20 26", "E 31 32", "G 2 2", "H 16 20", "I 25 31", "K 4 5", "O 1 1", "P 14 19", "Q 6 7", "R 10 15", "S 8 8", "U 3 3", "W 25 31", "X 9 13", "Z 21 30", "d 13 18", "f 12 18", "h 6 7", "k 4 5", "m 25 31", "o 9 13", "p 20 25", "r 22 30", "s 14 19", "t 27 32", "u 21 26", "v 9 14", "w 21 26", "y 19 22" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case16() {
    String[] knownPoints = { "f vS 587", "o WD 157", "p Ie 539", "y KM 353", "q aA 128", "s or 511", "e le 326", "i Kp 136", "d vy 466", "f LP 299", "p SR 573", "g yl 114", "y ew 257", "w tE 481", "e uU 428", "q HA 550", "s kT 103", "f fd 124", "d HJ 181", "g Ai 258", "i Ad 429", "o ji 405", "g FA 517", "s Vi 113", "w Du 354", "q XJ 446", "e pp 480", "d LV 471", "w AJ 491", "q Bo 300", "a cz 521", "d WS 279", "p zF 392", "e yv 288", "w YP 555", "f Yq 303", "r Kv 523", "y Lw 202", "o Xc 300", "u yY 510", "g jB 117", "a eq 247", "t iE 187", "u Cy 367", "i sf 410", "y Pa 161", "o hB 539", "r Mn 475", "s EW 284", "a je 328" };
    assertArrayEquals(new String[] { "a 8 9", "d 6 6", "e 2 3", "f 7 7", "g 10 13", "i 9 13", "o 5 5", "p 2 3", "q 4 4", "r 8 13", "s 9 12", "t 15 15", "u 9 14", "w 1 1", "y 13 14" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case17() {
    String[] knownPoints = { "o vS 413", "l WD 577", "n Ie 422", "h KM 408", "h aA 223", "s or 405", "i le 217", "k Kp 287", "v vy 241", "l LP 575", "t SR 293", "p yl 443", "h ew 470", "j tE 440", "d uU 383", "y HA 379", "s kT 554", "f fd 537", "i HJ 236", "p Ai 306", "d Ad 293", "f ji 556", "t FA 504", "w Vi 458", "w Du 392", "x XJ 597", "k pp 253", "k LV 421", "w AJ 316", "h Bo 594", "t zk 236", "c SP 446", "e FL 374", "r vm 348", "o Pd 598", "c qR 439", "z vL 600", "n EF 527", "x Ji 467", "y WL 215", "r Bv 596", "q eq 304", "g iE 260", "j Cy 509", "s ds 404", "r MP 227", "c Jh 364", "d PB 328" };
    assertArrayEquals(new String[] { "c 2 11", "d 4 18", "e 10 22", "f 2 16", "g 15 22", "h 1 1", "i 15 22", "j 2 18", "k 4 18", "l 2 16", "n 2 18", "o 2 18", "p 4 22", "q 15 22", "r 2 16", "s 2 11", "t 4 16", "v 15 22", "w 2 16", "x 2 16", "y 10 22", "z 4 22" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case18() {
    String[] knownPoints = { "c c 600", "c c 600", "c c 600", "c c 600", "b b 600", "b b 600", "a a 600", "a a 600", "a a 600", "a a 600", "b b 600", "d d 600", "d d 600", "d d 600", "d d 600", "b b 600" };
    assertArrayEquals(new String[] { "a 1 1", "b 1 1", "c 1 1", "d 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case19() {
    String[] knownPoints = { "c c 600", "c c 600", "c c 600", "c c 600", "b b 600", "b b 600", "a a 600", "a a 600", "a a 600", "a a 600", "b b 600", "d d 600", "d d 600", "d d 600", "d d 600" };
    assertArrayEquals(new String[] { "a 1 1", "b 4 4", "c 1 1", "d 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case20() {
    String[] knownPoints = { "c c 599", "c c 599", "c c 600", "c c 600", "b b 600", "b b 600", "a a 599", "a a 600", "a a 600", "a a 599", "b b 600", "d d 599", "d d 600", "d d 599", "d d 600" };
    assertArrayEquals(new String[] { "a 1 1", "b 1 4", "c 1 1", "d 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case21() {
    String[] knownPoints = { "a a 100", "a a 100", "a a 100", "a a 100", "b b 134", "b b 133", "b b 133" };
    assertArrayEquals(new String[] { "a 1 2", "b 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case22() {
    String[] knownPoints = { "i vS 413", "y WD 577", "p Ie 422", "e KM 408", "q aA 223", "s or 405", "e le 217", "i Kp 287", "u vy 241", "w LP 575", "p SR 293", "o yl 443", "s ew 470", "i tE 440", "e uU 383", "p HA 379", "o kT 554", "w fd 537", "u HJ 236", "e Ai 306", "i Ad 293", "o ji 556", "q xt 281", "t JD 485", "s WX 328", "a sp 305", "p LV 421", "w AJ 316", "y ob 526", "r kk 325", "s Hz 244", "t fy 290", "y JY 401", "o qY 221", "y KK 406", "q GY 436", "q FX 287", "r yY 274", "t qj 355", "w je 469", "a iE 260", "r Cy 509", "t ds 404", "u HJ 494", "r Ba 304", "a Gt 504", "u rv 278" };
    assertArrayEquals(new String[] { "a 10 12", "e 9 9", "i 7 7", "o 3 3", "p 5 5", "q 11 12", "r 8 8", "s 6 6", "t 4 4", "u 10 11", "w 2 2", "y 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case23() {
    String[] knownPoints = { "e vS 413", "a WD 577", "e Ie 422", "w KM 408", "i aA 223", "a or 405", "i le 217", "y Kp 287", "k vy 241", "g LP 575", "q SR 293", "e yl 443", "j ew 470", "o tE 440", "g uU 383", "y HA 379", "f kT 554", "h fd 537", "a HJ 236", "y Ai 306", "f Ad 293", "l ji 556", "d FA 504", "t Vi 458", "s Du 392", "w XJ 597", "i pp 253", "s LV 421", "g AJ 316", "f Bo 594", "a cz 529", "e WS 379", "t zF 221", "h yv 275", "t YP 328", "d Yq 290", "d Kv 369", "f YL 526", "p FX 287", "o iy 521", "k Lq 521", "p vH 577", "q qE 571", "g Ei 340", "l yK 406", "p sf 540", "d Pa 370" };
    assertArrayEquals(new String[] { "a 2 2", "d 5 6", "e 3 3", "f 1 1", "g 4 5", "h 7 17", "i 12 17", "j 7 17", "k 7 17", "l 7 16", "o 7 16", "p 4 7", "q 7 17", "s 7 17", "t 7 16", "w 6 16", "y 7 16" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case24() {
    String[] knownPoints = { "E vS 413", "b WD 577", "r Ie 422", "y KM 408", "p aA 223", "U or 405", "Q le 217", "m Kp 287", "c vy 241", "i LP 575", "l SR 293", "s yl 443", "R ew 470", "f tE 440", "k uU 383", "h HA 379", "k kT 554", "t fd 537", "p HJ 236", "b Ai 306", "i Ad 293", "g ji 556", "g FA 504", "x Vi 458", "j Du 392", "T XJ 597", "y pp 253", "l LV 421", "a AJ 316", "u Bo 594", "t cz 529", "c WS 379", "c zF 221", "s yv 275", "a YP 328", "a Yq 290", "c Kv 369", "m YL 526", "l FX 287", "y iy 521", "U Lq 521", "v vH 577", "s qE 571", "Q Ei 340", "e yK 406", "i sf 540", "g Pa 370" };
    assertArrayEquals(new String[] { "E 7 25", "Q 8 25", "R 6 25", "T 4 25", "U 3 24", "a 6 24", "b 3 25", "c 4 14", "e 7 25", "f 6 25", "g 1 4", "h 7 25", "i 1 4", "j 7 25", "k 3 24", "l 4 23", "m 4 25", "p 11 25", "r 6 25", "s 1 8", "t 1 19", "u 4 25", "v 4 25", "x 6 25", "y 3 14" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case25() {
    String[] knownPoints = { "D vS 413", "k WD 577", "E Ie 422", "L KM 408", "v aA 223", "O or 405", "x le 217", "x Kp 287", "s vy 241", "r LP 575", "j SR 293", "u yl 443", "p ew 470", "w tE 440", "J uU 383", "t HA 379", "v kT 554", "D fd 537", "h HJ 236", "t Ai 306", "r Ad 293", "x ji 556", "v FA 504", "F Vi 458", "t Du 392", "F XJ 597", "R pp 253", "W LV 421", "b AJ 316", "h Bo 594", "k cz 529", "E WS 379", "x zF 221", "P yv 275", "R YP 328", "Y Yq 290", "w Kv 369", "O YL 526", "I FX 287", "y iy 521", "m Lq 521", "U vH 577", "p qE 571", "Y Ei 340", "z yK 406", "f sf 540", "b Pa 370" };
    assertArrayEquals(new String[] { "D 1 24", "E 3 28", "F 1 21", "I 8 28", "J 7 28", "L 5 28", "O 1 26", "P 9 28", "R 7 28", "U 3 28", "W 5 28", "Y 5 28", "b 3 28", "f 3 28", "h 3 28", "j 8 28", "k 1 17", "m 3 28", "p 1 22", "r 1 28", "s 9 28", "t 1 18", "u 4 28", "v 1 8", "w 3 28", "x 1 9", "y 3 28", "z 6 28" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case26() {
    String[] knownPoints = { "i vS 116", "y WD 493", "p Ie 428", "e KM 527", "q aA 137", "s or 430", "e le 524", "i Kp 403", "u vy 568", "w LP 443", "p SR 120", "o yl 525", "s ew 527", "i tE 274", "e uU 482", "p HA 328", "o kT 130", "w fd 496", "u HJ 568", "e Ai 351", "i Ad 579", "o ji 252", "q xt 169", "t JD 295", "s WX 435", "a sp 498", "p LV 357", "w AJ 242", "y ob 41", "r kk 372", "s Hz 568", "t fy 187", "y JY 420", "o qY 333", "y KK 271", "q GY 341", "q FX 446", "r yY 180", "t qj 242", "w je 365", "a iE 544", "r Cy 460", "t ds 438", "u HJ 596", "r Ba 429", "a Gt 370", "u rv 300" };
    assertArrayEquals(new String[] { "a 5 6", "e 3 3", "i 7 7", "o 8 8", "p 9 9", "q 12 12", "r 5 6", "s 2 2", "t 11 11", "u 1 1", "w 4 4", "y 10 10" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case27() {
    String[] knownPoints = { "e vS 116", "a WD 493", "e Ie 428", "w KM 527", "i aA 137", "a or 430", "i le 524", "y Kp 403", "k vy 568", "g LP 443", "q SR 120", "e yl 525", "j ew 527", "o tE 274", "g uU 482", "y HA 328", "f kT 130", "h fd 496", "a HJ 568", "y Ai 351", "f Ad 579", "l ji 252", "d FA 61", "t Vi 413", "s Du 540", "w XJ 179", "i pp 303", "s LV 357", "g AJ 242", "f Bo 420", "a cz 518", "e WS 276", "t zF 257", "h yv 366", "t YP 225", "d Yq 30", "d Kv 169", "f YL 550", "p FX 446", "o iy 156", "k Lq 429", "p vH 101", "q qE 515", "g Ei 292", "l yK 137", "p sf 29", "d Pa 122" };
    assertArrayEquals(new String[] { "a 1 1", "d 17 17", "e 4 4", "f 2 2", "g 3 3", "h 8 10", "i 7 7", "j 13 14", "k 6 6", "l 15 16", "o 15 16", "p 13 14", "q 12 12", "s 8 10", "t 8 10", "w 11 11", "y 5 5" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case28() {
    String[] knownPoints = { "E vS 116", "b WD 493", "r Ie 428", "y KM 527", "p aA 137", "U or 430", "Q le 524", "m Kp 403", "c vy 568", "i LP 443", "l SR 120", "s yl 525", "R ew 527", "f tE 274", "k uU 482", "h HA 328", "k kT 130", "t fd 496", "p HJ 568", "b Ai 351", "i Ad 579", "g ji 252", "g FA 61", "x Vi 413", "j Du 540", "T XJ 179", "y pp 303", "l LV 357", "a AJ 242", "u Bo 420", "t cz 518", "c WS 276", "c zF 257", "s yv 366", "a YP 225", "a Yq 30", "c Kv 169", "m YL 550", "l FX 446", "y iy 156", "U Lq 429", "v vH 101", "s qE 515", "Q Ei 292", "e yK 137", "i sf 29", "g Pa 122" };
    assertArrayEquals(new String[] { "E 22 25", "Q 8 10", "R 13 14", "T 22 25", "U 8 10", "a 15 17", "b 8 10", "c 2 2", "e 22 25", "f 20 21", "g 16 19", "h 20 21", "i 3 4", "j 12 14", "k 12 13", "l 7 7", "m 5 6", "p 11 11", "r 15 19", "s 1 1", "t 3 4", "u 15 19", "v 22 25", "x 15 19", "y 4 6" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case29() {
    String[] knownPoints = { "D vS 116", "k WD 493", "E Ie 428", "L KM 527", "v aA 137", "O or 430", "x le 524", "x Kp 403", "s vy 568", "r LP 443", "j SR 120", "u yl 525", "p ew 527", "w tE 274", "J uU 482", "t HA 328", "v kT 130", "D fd 496", "h HJ 568", "t Ai 351", "r Ad 579", "x ji 252", "v FA 61", "F Vi 413", "t Du 540", "F XJ 179", "R pp 303", "W LV 357", "b AJ 242", "h Bo 420", "k cz 518", "E WS 276", "x zF 257", "P yv 366", "R YP 225", "Y Yq 30", "w Kv 169", "O YL 550", "I FX 446", "y iy 156", "m Lq 429", "U vH 101", "p qE 515", "Y Ei 292", "z yK 137", "f sf 29", "b Pa 122" };
    assertArrayEquals(new String[] { "D 9 11", "E 8 8", "F 9 13", "I 12 19", "J 12 18", "L 10 16", "O 4 7", "P 16 22", "R 11 16", "U 24 28", "W 18 22", "Y 19 23", "b 19 22", "f 27 28", "h 3 7", "j 24 27", "k 3 7", "m 15 20", "p 3 6", "r 3 7", "s 9 14", "t 2 2", "u 10 16", "v 22 23", "w 15 19", "x 1 1", "y 24 27", "z 24 27" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case30() {
    String[] knownPoints = { "i vS 592", "y WD 596", "p Ie 597", "e KM 594", "q aA 590", "s or 590", "e le 600", "i Kp 597", "u vy 599", "w LP 600", "p SR 591", "o yl 599", "s ew 596", "i tE 596", "e uU 597", "p HA 593", "o kT 592", "w fd 600", "u HJ 600", "e Ai 599", "i Ad 599", "o ji 600", "q xt 598", "t JD 595", "s WX 598", "a sp 594", "p LV 591", "w AJ 590", "y ob 594", "r kk 593", "s Hz 600", "t fy 600", "y JY 590", "o qY 596", "y KK 599", "q GY 592", "q FX 594", "r yY 600", "t qj 590", "w je 591", "a iE 596", "r Cy 599", "t ds 591", "u HJ 594", "r Ba 596", "a Gt 600", "u rv 597" };
    assertArrayEquals(new String[] { "a 8 12", "e 1 1", "i 5 5", "o 4 4", "p 11 12", "q 10 11", "r 3 3", "s 5 5", "t 9 10", "u 1 1", "w 7 7", "y 8 8" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case31() {
    String[] knownPoints = { "e vS 592", "a WD 596", "e Ie 597", "w KM 594", "i aA 590", "a or 590", "i le 600", "y Kp 597", "k vy 599", "g LP 600", "q SR 591", "e yl 599", "j ew 596", "o tE 596", "g uU 597", "y HA 593", "f kT 592", "h fd 600", "a HJ 600", "y Ai 599", "f Ad 599", "l ji 600", "d FA 598", "t Vi 594", "s Du 599", "w XJ 597", "i pp 597", "s LV 591", "g AJ 590", "f Bo 599", "a cz 593", "e WS 592", "t zF 595", "h yv 596", "t YP 597", "d Yq 599", "d Kv 595", "f YL 598", "p FX 594", "o iy 594", "k Lq 598", "p vH 599", "q qE 598", "g Ei 594", "l yK 596", "p sf 593", "d Pa 598" };
    assertArrayEquals(new String[] { "a 5 5", "d 1 1", "e 4 4", "f 2 2", "g 3 3", "h 6 17", "i 6 17", "j 6 17", "k 6 17", "l 6 17", "o 6 17", "p 6 17", "q 6 17", "s 6 17", "t 6 17", "w 6 17", "y 6 17" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case32() {
    String[] knownPoints = { "E vS 592", "b WD 596", "r Ie 597", "y KM 594", "p aA 590", "U or 590", "Q le 600", "m Kp 597", "c vy 599", "i LP 600", "l SR 591", "s yl 599", "R ew 596", "f tE 596", "k uU 597", "h HA 593", "k kT 592", "t fd 600", "p HJ 600", "b Ai 599", "i Ad 599", "g ji 600", "g FA 598", "x Vi 594", "j Du 599", "T XJ 597", "y pp 597", "l LV 591", "a AJ 590", "u Bo 599", "t cz 593", "c WS 592", "c zF 595", "s yv 596", "a YP 597", "a Yq 599", "c Kv 595", "m YL 598", "l FX 594", "y iy 594", "U Lq 598", "v vH 599", "s qE 598", "Q Ei 594", "e yK 596", "i sf 593", "g Pa 598" };
    assertArrayEquals(new String[] { "E 2 25", "Q 2 25", "R 2 25", "T 2 25", "U 2 25", "a 2 25", "b 2 25", "c 1 3", "e 2 25", "f 2 25", "g 1 25", "h 2 25", "i 1 25", "j 2 25", "k 2 25", "l 2 25", "m 2 25", "p 2 25", "r 2 25", "s 1 25", "t 2 25", "u 2 25", "v 2 25", "x 2 25", "y 2 25" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case33() {
    String[] knownPoints = { "D vS 592", "k WD 596", "E Ie 597", "L KM 594", "v aA 590", "O or 590", "x le 600", "x Kp 597", "s vy 599", "r LP 600", "j SR 591", "u yl 599", "p ew 596", "w tE 596", "J uU 597", "t HA 593", "v kT 592", "D fd 600", "h HJ 600", "t Ai 599", "r Ad 599", "x ji 600", "v FA 598", "F Vi 594", "t Du 599", "F XJ 597", "R pp 597", "W LV 591", "b AJ 590", "h Bo 599", "k cz 593", "E WS 592", "x zF 595", "P yv 596", "R YP 597", "Y Yq 599", "w Kv 595", "O YL 598", "I FX 594", "y iy 594", "m Lq 598", "U vH 599", "p qE 598", "Y Ei 594", "z yK 596", "f sf 593", "b Pa 598" };
    assertArrayEquals(new String[] { "D 2 28", "E 2 28", "F 2 28", "I 2 28", "J 2 28", "L 2 28", "O 2 28", "P 2 28", "R 2 28", "U 2 28", "W 2 28", "Y 2 28", "b 2 28", "f 2 28", "h 2 28", "j 2 28", "k 2 28", "m 2 28", "p 2 28", "r 2 28", "s 2 28", "t 2 28", "u 2 28", "v 2 28", "w 2 28", "x 1 1", "y 2 28", "z 2 28" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case34() {
    String[] knownPoints = { "e vS 600", "a WD 600", "e Ie 600", "w KM 600", "i aA 600", "a or 600", "i le 600", "y Kp 600", "k vy 600", "g LP 600", "q SR 600", "e yl 600", "j ew 600", "o tE 600", "g uU 600", "y HA 600", "f kT 600", "h fd 600", "a HJ 600", "y Ai 600", "f Ad 600", "l ji 600", "d FA 600", "t Vi 600", "s Du 600", "w XJ 600", "i pp 600", "s LV 600", "g AJ 600", "a cz 600", "e WS 600", "t zF 600", "t YP 600", "d Yq 600", "d Kv 600", "f YL 600", "p FX 600", "o iy 600", "k Lq 600", "p vH 600", "q qE 600", "g Ei 600", "l yK 600", "p sf 600", "d Pa 600" };
    assertArrayEquals(new String[] { "a 1 1", "d 1 1", "e 1 1", "f 5 17", "g 1 1", "h 5 17", "i 5 17", "j 5 17", "k 5 17", "l 5 17", "o 5 17", "p 5 17", "q 5 17", "s 5 17", "t 5 17", "w 5 17", "y 5 17" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case35() {
    String[] knownPoints = { "A a 9", "A b 9", "A c 9", "A d 9", "B e 9", "B f 9", "B g 8", "B h 8", "C i 9", "C j 9", "C k 9", "C l 7", "D m 1", "D n 1", "D o 1", "D p 1" };
    assertArrayEquals(new String[] { "A 1 1", "B 2 2", "C 2 2", "D 4 4" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case36() {
    String[] knownPoints = { "Slovakia Marian 270", "Hungary Istvan 24", "Poland Krzysztof 100", "Hungary Gyula 30", "Germany Tobias 27", "Germany Juergen 27" };
    assertArrayEquals(new String[] { "Germany 2 4", "Hungary 2 4", "Poland 2 2", "Slovakia 1 1" }, countriesranklist.findPlaces(knownPoints));
  }

  @Test
  public void case37() {
    String[] knownPoints = { "A a 10", "B a 10", "C a 10", "D a 20", "D b 20", "D c 20", "D d 20", "d a 10", "E a 50" };
    assertArrayEquals(new String[] { "A 3 6", "B 3 6", "C 3 6", "D 1 1", "E 2 2", "d 3 6" }, countriesranklist.findPlaces(knownPoints));
  }

}
