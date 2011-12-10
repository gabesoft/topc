package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class TwainTest {
  Twain twain = new Twain();

  @Test
  public void case1() {
    int year = 1;
    String phrase = "i fixed the chrome xerox by the cyclical church";
    assertEquals("i fiksed the chrome zeroks by the cyclical church", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case2() {
    int year = 2;
    String phrase = "i fixed the chrome xerox by the cyclical church";
    assertEquals("i fiksed the chrome zeroks bi the ciclical church", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case3() {
    int year = 0;
    String phrase = "this is unchanged";
    assertEquals("this is unchanged", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case4() {
    int year = 7;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sk n z zskrks nchk sik zksesi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case5() {
    int year = 7;
    String phrase = "  concoction   convalescence   cyclical   cello   ";
    assertEquals("  konkoktion   konvalesense   siklikal   selo   ", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case6() {
    int year = 7;
    String phrase = "";
    assertEquals("", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case7() {
    int year = 7;
    String phrase = "a sly gypsy yelled loudly by the gym yesterday";
    assertEquals("a sli gipsi ieled loudli bi the gim iesterdai", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case8() {
    int year = 0;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sch kn x xschrx cknnchc cyck xxceci", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case9() {
    int year = 1;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sch kn z zschrks cknnchc cyck zksceci", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case10() {
    int year = 2;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sch kn z zschrks cknnchc cick zksceci", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case11() {
    int year = 3;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sch kn z zschrks cknnchc sick zkssesi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case12() {
    int year = 4;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sch kn z zschrks knnchc sik zkssesi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case13() {
    int year = 5;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sk kn z zskrks knnchk sik zkssesi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case14() {
    int year = 6;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sk n z zskrks nnchk sik zkssesi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case15() {
    int year = 6;
    String phrase = "magic circus giraffes suffer dazzling performances";
    assertEquals("magik sirkus giraffes suffer dazzling performanses", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case16() {
    int year = 7;
    String phrase = "x";
    assertEquals("z", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case17() {
    int year = 7;
    String phrase = "kn";
    assertEquals("n", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case18() {
    int year = 7;
    String phrase = "aabbccddeeffgghhiijjkkll";
    assertEquals("aabkdeefghiijkl", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case19() {
    int year = 7;
    String phrase = "mmnnooppqqrrssttuuvvwwxxyyzz";
    assertEquals("mnoopqrstuuvwksksiiz", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case20() {
    int year = 7;
    String phrase = "the bookkeeper recalled rearranging the bookcase";
    assertEquals("the bookeeper rekaled rearanging the bookase", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case21() {
    int year = 6;
    String phrase = "carcass circus caucus catchy catch chance charisma";
    assertEquals("karkass sirkus kaukus katchi katch chanse charisma", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case22() {
    int year = 5;
    String phrase = "chancellor chocolate chaotic chronological chuckle";
    assertEquals("chansellor chokolate chaotik kronologikal chukle", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case23() {
    int year = 4;
    String phrase = "church circa circle circuit circumstance chronicle";
    assertEquals("church sirca sircle sircuit sircumstanse chronicle", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case24() {
    int year = 3;
    String phrase = "circumcise circumference cockroach clench chicken";
    assertEquals("sircumsise sircumferense cockroach clench chicken", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case25() {
    int year = 7;
    String phrase = "chaos choice character charade chasm chemical";
    assertEquals("chaos choise charakter charade chasm chemikal", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case26() {
    int year = 1;
    String phrase = "xylophone xenon xanthum exclaim expert sioux";
    assertEquals("zylophone zenon zanthum eksclaim ekspert siouks", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case27() {
    int year = 7;
    String phrase = "scholar school schooner scholastic schwab";
    assertEquals("skolar skool skooner skolastik skwab", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case28() {
    int year = 7;
    String phrase = "sch";
    assertEquals("sk", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case29() {
    int year = 7;
    String phrase = "  chandelier tom cellocck xzz zzx cck ";
    assertEquals("  chandelier tom selok z zks k ", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case30() {
    int year = 7;
    String phrase = "could my mighty knight always protect castles";
    assertEquals("kould mi mighti night alwais protekt kastles", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case31() {
    int year = 7;
    String phrase = "cck xzz aaaaa";
    assertEquals("k z aaaaa", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case32() {
    int year = 5;
    String phrase = "cchh";
    assertEquals("kchh", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case33() {
    int year = 7;
    String phrase = "abba";
    assertEquals("aba", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case34() {
    int year = 7;
    String phrase = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case35() {
    int year = 7;
    String phrase = "  concoction   convalescence   cyclical   cello   ";
    assertEquals("  konkoktion   konvalesense   siklikal   selo   ", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case36() {
    int year = 7;
    String phrase = "cck xzz aaaaa";
    assertEquals("k z aaaaa", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case37() {
    int year = 7;
    String phrase = "vv";
    assertEquals("v", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case38() {
    int year = 1;
    String phrase = "x";
    assertEquals("z", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case39() {
    int year = 7;
    String phrase = "a     b     c     d     e";
    assertEquals("a     b     k     d     e", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case40() {
    int year = 7;
    String phrase = "sch kn x xschrx cknnchc cyck xxceci";
    assertEquals("sk n z zskrks nchk sik zksesi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case41() {
    int year = 1;
    String phrase = "xoxox";
    assertEquals("zoksoks", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case42() {
    int year = 6;
    String phrase = "kooc cooc cooc cooc cooc";
    assertEquals("kook kook kook kook kook", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case43() {
    int year = 2;
    String phrase = "i fixed the chrome xerox by the cyclical church";
    assertEquals("i fiksed the chrome zeroks bi the ciclical church", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case44() {
    int year = 5;
    String phrase = "    concatenation   cck";
    assertEquals("    konkatenation   k", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case45() {
    int year = 7;
    String phrase = "sch   chr zzbzzb aa  bccb xx cei cb ci chr chk";
    assertEquals("sk   kr zbzb aa  bkb zks sei kb si kr chk", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case46() {
    int year = 6;
    String phrase = "cooc cooc cooc cooc";
    assertEquals("kook kook kook kook", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case47() {
    int year = 5;
    String phrase = "c";
    assertEquals("k", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case48() {
    int year = 1;
    String phrase = "xenon xenon";
    assertEquals("zenon zenon", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case49() {
    int year = 7;
    String phrase = " xx xx xxdxx knndsch sch     schrrhc  yiiyy knnsc ";
    assertEquals(" zks zks zksdksks ndsch sk     skrhk  iiiii nsk ", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case50() {
    int year = 7;
    String phrase = "thsx xstt cic tess ofc knkn zzoopp xox cyci";
    assertEquals("thsks zst sik tes ofk nkn zoop zoks sisi", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case51() {
    int year = 7;
    String phrase = "aaa iii eeknee";
    assertEquals("aaa iii eeknee", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case52() {
    int year = 1;
    String phrase = "xfdkjf xdksax";
    assertEquals("zfdkjf zdksaks", twain.getNewSpelling(year, phrase));
  }

  @Test
  public void case53() {
    int year = 7;
    String phrase = "ch";
    assertEquals("ch", twain.getNewSpelling(year, phrase));
  }

}
