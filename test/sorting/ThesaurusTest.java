package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class ThesaurusTest {
  Thesaurus thesaurus = new Thesaurus();

  @Test
  public void case1() {
    String[] entry = { "ape monkey wrench", "wrench twist strain" };
    assertArrayEquals(new String[] { "ape monkey wrench", "strain twist wrench" }, thesaurus.edit(entry));
  }

  @Test
  public void case2() {
    String[] entry = { "ape monkey wrench", "wrench twist strain", "monkey twist frugue" };
    assertArrayEquals(new String[] { "ape monkey wrench", "frugue monkey twist", "strain twist wrench" }, thesaurus.edit(entry));
  }

  @Test
  public void case3() {
    String[] entry = { "ape monkey wrench", "wrench twist strain", "monkey twist frugue strain" };
    assertArrayEquals(new String[] { "ape frugue monkey strain twist wrench" }, thesaurus.edit(entry));
  }

  @Test
  public void case4() {
    String[] entry = { "a" };
    assertArrayEquals(new String[] { "a" }, thesaurus.edit(entry));
  }

  @Test
  public void case5() {
    String[] entry = { "c b a", "a b c", "c d", "d e", "e d b" };
    assertArrayEquals(new String[] { "a b c", "b d e", "c d" }, thesaurus.edit(entry));
  }

  @Test
  public void case6() {
    String[] entry = { "point run score", "point dot", "cut run tear score", "cut valley", "cute pretty" };
    assertArrayEquals(new String[] { "cut point run score tear", "cut valley", "cute pretty", "dot point" }, thesaurus.edit(entry));
  }

  @Test
  public void case7() {
    String[] entry = { "a b c", "d e f", "g h i", "b g c e f" };
    assertArrayEquals(new String[] { "a b c d e f g", "g h i" }, thesaurus.edit(entry));
  }

  @Test
  public void case8() {
    String[] entry = { "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g", "d o u g" };
    assertArrayEquals(new String[] { "d g o u" }, thesaurus.edit(entry));
  }

  @Test
  public void case9() {
    String[] entry = { "a b c d e f g h i j k l m n o p q r s t u v w x y", "a z", "b c bob", "tom x k", "a z" };
    assertArrayEquals(new String[] { "a b bob c d e f g h i j k l m n o p q r s t tom u v w x y", "a z" }, thesaurus.edit(entry));
  }

  @Test
  public void case10() {
    String[] entry = { "asdladkljfhafakjhfdsakadslksdakfadslkhdah a", "afdsakjfhdsafsakasddsf" };
    assertArrayEquals(new String[] { "a asdladkljfhafakjhfdsakadslksdakfadslkhdah", "afdsakjfhdsafsakasddsf" }, thesaurus.edit(entry));
  }

  @Test
  public void case11() {
    String[] entry = { "a b x", "h z x", "k l m", "h a t", "x t a" };
    assertArrayEquals(new String[] { "a b h t x z", "k l m" }, thesaurus.edit(entry));
  }

  @Test
  public void case12() {
    String[] entry = { "a aa aaa aaaa", "aaaaa aaa a", "aa aaaaaa" };
    assertArrayEquals(new String[] { "a aa aaa aaaa aaaaa", "aa aaaaaa" }, thesaurus.edit(entry));
  }

  @Test
  public void case13() {
    String[] entry = { "abc cba bac", "abc cab acb" };
    assertArrayEquals(new String[] { "abc acb cab", "abc bac cba" }, thesaurus.edit(entry));
  }

  @Test
  public void case14() {
    String[] entry = { "bob tom joe cal", "tom tim eve jed", "jed dj jd bob" };
    assertArrayEquals(new String[] { "bob cal joe tom", "bob dj jd jed", "eve jed tim tom" }, thesaurus.edit(entry));
  }

  @Test
  public void case15() {
    String[] entry = { "all every many lots", "lots parcels estates grounds", "grounds" };
    assertArrayEquals(new String[] { "all every lots many", "estates grounds lots parcels", "grounds" }, thesaurus.edit(entry));
  }

  @Test
  public void case16() {
    String[] entry = { "a b c d e f g h i j k l m n o p q r s t u v w x y", "z aa bb cc dd ee ff gg hh ii jj kk ll mm nn oo at", "z pp qq rr ss tt uu vv ww xx yy zz aa tr rt op po", "this is a test whee hehehehehehehehhehehehheheheh", "test abcdefghijklmnopqrstuvwxyz x z ppppppppppppp", "hehehhehehehehehhehehhehehhhhheheh mpmpmpmpmpmpmp", "tt rrrrrrrrrrrrrrrrrrrr sssssssssssssss ssssssssss", "lllllll llllllll llllllllz lllllllll pppppppppppp", "aa nn dd a b test mmmmmmmmmmmmmmmmmmmmmmmmmm yyyyy", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz zzzzzzz", "a d c o p m n r e at oo test rrrrrrrrrr rrrrrrrrr", "yyyyyyyyyyyyyyyyy yyyyyyyyyyyyyy yyyyyyy yyy y at", "ab ba ca ac tj jt lm ml no on er re qw wq tr rt yu", "uy cv vc zx xz sa as ks sk md dm pz zp cp at test", "xp px pc cp gt tg yh hy jy yj ki ik po lm nb bn", "vb bv xe ex bbbbbbbbbbbbbb nnnnnnnnnnnn oooooooooo", "slkfjsl lskfjdlsk oitporit aslkfjsldk ncnsjlkfs aa", "tirutoi reoiuksldf slkdjfls calskdfj slkdfj eeeeee", "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "yyyy mmmm wwww llll eeee qqqq aaaa vvvv cccc rrrrr", "la al mc cm zx xm mx re tr yr ur ir or pr fd df gh", "ffffffffff nnnnnnnn ooooooooo kkkkkkkkk jjjjjjjjjj", "wwwwweeeeeeeee ewwwwwwwweweweewew eeeeeeeeeee aaaa", "aa b c d e f g h i j k l m n o p q r ss u v w x y", "bbbbbbbbbbbbbbbbb vvvvvvvvvvvvvvv eeeeeeeee aaaaaa", "z aa bb cc dd ee ff gg hh ii jj kk ll mm nn zz at", "c cc qq rr ss tt uu vv ww xx yy w aa tr rt op po", "qwerty qwertp qwertyy qwertya qwertyb qwertyn mmmk", "hhhhhhhhhhhhhhh hhhhhhhhhhhhhhhhhhhhhhhh fffffffff", "f ff gg cc dd ee re ta hh ii jj kk ll mm lk ok at", "y uu gg jh dd nv re ta hh hj yy kk ll mm lk ok at", "q qq jn oc dd ee co ta hh ii jj kk ll nj lk ok b", "z hg gh cc cx ee ff iy hh ii jj kk ll mm yi lj at", "t ty bb yw dd yt ff rr hh hy yh df fd as sa oo at", "ppppppppppppppppppppwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", "mnmnmnmnmnm nmnmnmnmnmnm nnnmnmnmnmnm mnmnmmmmnmn", "z b a e p o l mm ee tt fffg gg hj jh lk kl mmmmm", "pppp rere erer u z c v j k l m w r q d f g test", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa z", "gggggggg uuuuuuuuuuuuuuu pppppppp rrrrrrrrrrrrrrr", "slfk slkd xzmc pewir skdf alskd hdfkj whekj sd ds", "ds n m k pp rr tt ss zz xx aa ww qq qqqq ffff lklk", "pipopppipo lskjflks rueyreu wtewyet w s a z f d h", "pw wp re er tr rt yg gy br rb vd dv sc cs as sa qa", "aq mz zm yu hg bf dv sm ls kd sv cu yhf sgd ldf t", "m n o p q r s t u v w x y z aa bb cc dd ee ff gg h", "gg hh ii jj kk ll tt uu vv ww xx yy zz aa ki ik", "po lm nb d e f g h i j k l m n o p q r s t u v w a", "px pc cp gt tg yh hy jy yj ki d e f g h i v w x y", "ab ba ca ac tj jt lm ml no on er re qw wq tr rt yy" };
    assertArrayEquals(new String[] { "a aa ab abcdefghijklmnopqrstuvwxyz ac al aq as at b ba bb bf bn br c ca cc cm co cp cs cu cv cx d dd df dm ds dv e ee er erer f fd ff ffff fffg g gg gh gt gy h hehehehehehehehhehehehheheheh hg hh hj hy i ii ik ir is iy j jh jj jn jt jy k kd ki kk kl ks l la ldf lj lk lklk ll lm ls lskjflks m mc md ml mm mmmmm mmmmmmmmmmmmmmmmmmmmmmmmmm mx mz n nb nj nn no nv o oc ok on oo op or p pc pipopppipo po pp pppp ppppppppppppp pr pw px pz q qa qq qqqq qw r rb re rere rr rrrrrrrrr rrrrrrrrrr rt rueyreu s sa sc sgd sk sm ss sv t ta test tg this tj tr tt ty u ur uu uy v vc vd vv w whee wp wq wtewyet ww x xm xp xx xz y yg yh yhf yi yj yr yt yu yw yy yyy yyyyy yyyyyyy yyyyyyyyyyyyyy yyyyyyyyyyyyyyyyy z zm zp zx zz", "aa aslkfjsldk lskfjdlsk ncnsjlkfs oitporit slkfjsl", "aaaa cccc eeee llll mmmm qqqq rrrrr vvvv wwww yyyy", "aaaa eeeeeeeeeee ewwwwwwwweweweewew wwwwweeeeeeeee", "aaaaaa bbbbbbbbbbbbbbbbb eeeeeeeee vvvvvvvvvvvvvvv", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa z", "alskd ds hdfkj pewir sd skdf slfk slkd whekj xzmc", "bbbbbbbbbbbbbb bv ex nnnnnnnnnnnn oooooooooo vb xe", "calskdfj eeeeee reoiuksldf slkdfj slkdjfls tirutoi", "fffffffff hhhhhhhhhhhhhhh hhhhhhhhhhhhhhhhhhhhhhhh", "ffffffffff jjjjjjjjjj kkkkkkkkk nnnnnnnn ooooooooo", "gggggggg pppppppp rrrrrrrrrrrrrrr uuuuuuuuuuuuuuu", "hehehhehehehehehhehehhehehhhhheheh mpmpmpmpmpmpmp", "lllllll llllllll lllllllll llllllllz pppppppppppp", "mmmk qwertp qwerty qwertya qwertyb qwertyn qwertyy", "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "mnmnmmmmnmn mnmnmnmnmnm nmnmnmnmnmnm nnnmnmnmnmnm", "ppppppppppppppppppppwwwwwwwwwwwwwwwwwwwwwwwwwwwwww", "rrrrrrrrrrrrrrrrrrrr ssssssssss sssssssssssssss tt", "zzzzzzz zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" }, thesaurus.edit(entry));
  }

  @Test
  public void case17() {
    String[] entry = { "ape monkey wrench", "wrench twist strain", "monkey twist frugue strain" };
    assertArrayEquals(new String[] { "ape frugue monkey strain twist wrench" }, thesaurus.edit(entry));
  }

  @Test
  public void case18() {
    String[] entry = { "a b", "b c", "c d", "d a", "aa", "aaa", "da" };
    assertArrayEquals(new String[] { "a b", "a d", "aa", "aaa", "b c", "c d", "da" }, thesaurus.edit(entry));
  }

  @Test
  public void case19() {
    String[] entry = { "a aa aaa", "a aaa", "aa aaa", "a aa aaaa", "aaaa", "a" };
    assertArrayEquals(new String[] { "a", "a aa aaa aaaa", "aaaa" }, thesaurus.edit(entry));
  }

  @Test
  public void case20() {
    String[] entry = { "a", "a" };
    assertArrayEquals(new String[] { "a", "a" }, thesaurus.edit(entry));
  }

  @Test
  public void case21() {
    String[] entry = { "abc def ghi", "abc def", "abc efg hui" };
    assertArrayEquals(new String[] { "abc def ghi", "abc efg hui" }, thesaurus.edit(entry));
  }

}
