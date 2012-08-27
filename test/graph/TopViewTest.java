package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class TopViewTest {
  TopView topview = new TopView();

  @Test
  public void case1() {
    String[] grid = { "..AA..", ".CAAC.", ".CAAC." };
    assertEquals("CA", topview.findOrder(grid));
  }

  @Test
  public void case2() {
    String[] grid = { "..47..", "..74.." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case3() {
    String[] grid = { 
        "bbb666", 
        ".655X5", 
        "a65AA5", 
        "a65AA5", 
        "a65555" };
    assertEquals("65AXab", topview.findOrder(grid));
  }

  @Test
  public void case4() {
    String[] grid = { 
        "aabbaaaaaaaaaaaaaaaaaa", 
        "aabbccccccccccccccaaaa", 
        "aab11111ccccccccccaaaa", 
        "aab12221ccccccccccaaaa", 
        "aab12221ccccccccccaaaa", 
        "aab12221ccccccccccaaaa",  
        "aab12221ccccccccccaaaa",  
        "aab12221ccccccccccaaaa", 
        "aab12221ddddddddddaaaa", 
        "aab13331DDDDDDDDDDaaaa", 
        "aab13331DDDDDDDDDDaaaa", 
        "aa.11111DDDDDDDDDDaaaa", 
        "aaaaaaaaaaaaaaaaaaaaaa" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case5() {
    String[] grid = { "1" };
    assertEquals("1", topview.findOrder(grid));
  }

  @Test
  public void case6() {
    String[] grid = { "z9999999999999999999999999999999999999999999999991", "2A888888888888888888888888888888888888888888888888", "5ABEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEC8", "5ADEFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG8", "5ADEJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJHHG8", "5ADEJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJHHG8", "5ADEJKMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNIIG8", "5ADEJLPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPONIIG8", "5ADEJLPQSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTNIIG8", "5ADEJLPRUVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVTNIIG8", "7ADEJLPRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXWVTNIIG8", "7ADEJLPRXYYYZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZVTNIIG8", "7ADEJLPRXYYYZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZVTNIIG8", "7ADEJLPRXYYYZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZVTNIIG8", "7ADEJLPRXYYYZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZVTNIIG8", "7ADEJLPRXaffffffffffffffffffffffffffffffeZZVTNIIG8", "7ADEJLPRXbfimnnnnnnnnnnnnnrrrrrrrrrrrrrrqZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "7ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "5ADEJLPRXbfj0000000000000nrwwwwwwwwwwwwwwZZVTNIIG8", "5ADEJLPRXbfj0000000000000mqwwwwwwwwwwwwwwZZVTNIIG8", "5ADEJLPRXbejjjjjjjjjjjjjjjjjjjjjjjjjjjjjiZZVTNIIG8", "5ADEJLPRXbcddddddddddddddddddddddddddddddZZVTNIIG8", "5ADEJLPRXbgklllllllllllllllllllllllllllldZZVTNIIG8", "5ADEJLPRXbhovvvvvvvvvvvvvvvuttttttttttsldZZVTNIIG8", "5ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "5ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpvyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpuyyyyyyyyyyyyyyytxxxxxxxxxxldZZVTNIIG8", "6ADEJLPRXbhpppppppppppppppposxxxxxxxxxxkdZZVTNIIG8", "6ADEJLPRXbhhhhhhhhhhhhhhhhhhhhhhhhhhhhhgcYYVTNIIG8", "5ADEJLPRWbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaYYUSNIIG8", "5ADEJLORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRQMIIG8", "5ADEJLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLKIIG8", "5ADCHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIF8", "51DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDB8", "2333333333333333334444444444444444443333333333333z" };
    assertEquals("z123456789ABDCEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmn0opqrstuvwxy", topview.findOrder(grid));
  }

  @Test
  public void case7() {
    String[] grid = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "...................................ZZZ............", "..................................YZZaa...........", ".................................XYY.abb..........", "................................WXX...bcc.........", "...............................VWW.....cdd........", "..............................UVV.......dee.......", ".............................TUU.........eff......", "............................STT...........fgg.....", "...........................RSS.............ghh....", "..........................QRR...............hii...", ".........................PQQ.................ijj..", "........................OPP...................jkk.", ".......................NOO.....................kk.", "......................MNN......................kk.", ".....................LMM......................llk.", "....................KLL......................mml..", "...................JKK......................nnm...", "..................IJJ......................oon....", ".................HII......................ppo.....", "................GHH......................qqp......", "...............FGG.................rrrrrrrq.......", "..............EFF..................rrrrrrr........", ".............DEE..................ssrrrrrr........", "............CDD...................ss..............", "...........BCC....................ss..............", "..........ABB.....................ss..............", ".........9AA......................ss..............", "........899....................tttts..............", ".......788.....................tttt...............", "......677................uuuuuuuutt...............", ".....566.................uuuuuuuutt...............", ".....550..............vvvvuuuuuuu.................", "......001......zzzzz..wwvv........................", ".......112.....zzzzz..wwvv........................", "........223....zzzzz.xxw..........................", ".........3344444zzzzyyx...........................", "..........444444...yyy............................" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case8() {
    String[] grid = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "...................................ZZZ............", "..................................YZZaa...........", ".................................XYY.abb..........", "................................WXX...bcc.........", "...............................VWW.....cdd........", "..............................UVV.......dee.......", ".............................TUU.........eff......", "............................STT...........fgg.....", "...........................RSS.............ghh....", "..........................QRR...............hii...", ".........................PQQ.................ijj..", "........................OPP...................jkk.", ".......................NOO.....................kk.", "......................MNN......................kk.", ".....................LMM......................llk.", "....................KLL......................mml..", "...................JKK......................nnm...", "..................IJJ......................oon....", ".................HII......................ppo.....", "................GHH......................qqp......", "...............FGG.................rrrrrrrq.......", "..............EFF..................rrrrrrr........", ".............DEE..................ssrrrrrr........", "............CDD...................ss..............", "...........BCC....................ss..............", "..........ABB.....................ss..............", ".........9AA......................ss..............", "........899....................tttts..............", ".......788.....................tttt...............", "......677................uuuuuuuutt...............", ".....566.................uuuuuuuutt...............", ".....550..............vvvvuuuuuuu.................", "......001.......zzzz..wwvv........................", ".......112......zzzz..wwvv........................", "........223.....zzzz.xxw..........................", ".........3344444zzzzyyx...........................", "..........444444...yyy............................" };
    assertEquals("4321056789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", topview.findOrder(grid));
  }

  @Test
  public void case9() {
    String[] grid = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "...................................ZZZ............", "..................................YZZaa...........", ".................................XYY.abb..........", "................................WXX...bcc.........", "...............................VWW.....cdd........", "..............................UVV.......dee.......", ".............................TUU.........eff......", "............................STT...........fgg.....", "...........................RSS.............ghh....", "..........................QRR...............hii...", ".........................PQQ.................ijj..", "........................OPP...................jkk.", ".......................NOO.....................kk.", "......................MNN......................kk.", ".....................LMM......................llk.", "....................KLL......................mml..", "...................JKK......................nnm...", "..................IJJ......................oon....", ".................HII......................ppo.....", "................GHHGGGGGGGGGGGGGGGG......qqp......", "...............FGGGGGGGGGGGGGGGGGGGrrrrrrrq.......", "..............EFGGGGGGGGGGGGGGGGGGGrrrrrrr........", ".............DEE..................srrrrrrr........", "............CDD...................ss..............", "...........BCC....................ss..............", "..........ABB.....................ss..............", ".........9AA......................ss..............", "........899....................tttts..............", ".......788.....................tttt...............", "......677................uuuuuuuutt...............", ".....566.................uuuuuuuutt...............", ".....550..............vvvvuuuuuuu.................", "......001.......zzzz..wwvv........................", ".......112......zzzz..wwvv........................", "........223.....zzzz.xxw..........................", ".........3344444zzzzyyx...........................", "..........444444...yyy............................" };
    assertEquals("4321056789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqsrtuvwxyz", topview.findOrder(grid));
  }

  @Test
  public void case10() {
    String[] grid = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "...................................ZZZ............", "..................................YZZaa...........", ".................................XYY.abb..........", "................................WXX...bcc.........", "...............................VWW.....cdd........", "..............................UVV.......dee.......", ".............................TUU.........eff......", "............................STT...........fgg.....", "...........................RSS.............ghh....", "..........................QRR...............hii...", ".........................PQQ.................ijj..", "........................OPP...................jkk.", ".......................NOO.....................kk.", "......................MNN......................kk.", ".....................LMM......................llk.", "....................KLL......................mml..", "...................JKK......................nnm...", "..................IJJ......................oon....", ".................HII......................ppo.....", "................GHHGGGGGGGGGGGGGGGGG.....qqp......", "...............FGGGGGGGGGGGGGGGGGGGGrrrrrrq.......", "..............EFGGGGGGGGGGGGGGGGGGGGrrrrrr........", ".............DEE..................srrrrrrr........", "............CDD...................ss..............", "...........BCC....................ss..............", "..........ABB.....................ss..............", ".........9AA......................ss..............", "........899....................tttts..............", ".......788.....................tttt...............", "......677................uuuuuuuutt...............", ".....566.................uuuuuuuutt...............", ".....550..............vvvvuuuuuuu.................", "......001.......zzzz..wwvv........................", ".......112......zzzz..wwvv........................", "........223.....zzzz.xxw..........................", ".........3344444zzzzyyx...........................", "..........444444...yyy............................" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case11() {
    String[] grid = { "12121" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case12() {
    String[] grid = { "1111111111111.1" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case13() {
    String[] grid = { "210125434587678BA9ABEDCDEHGFGHKJIJKNMLMNQPOPQTSRST", "WVUVWZYXYZcbabcfedefihghilkjklonmnorqpqrutstuxwvwx" };
    assertEquals("210543876BA9EDCHGFKJINMLQPOTSRWVUZYXcbafedihglkjonmrqputsxwv", topview.findOrder(grid));
  }

  @Test
  public void case14() {
    String[] grid = { "yyyyyyyyyyyyyyyyyy..", "yyyyyyyyyyyyyyyyyyTT", "yyyyyyyyyyyyyyyyyyTT", "yyyyyyyyyyyyyyyyyyTT", "yyyyyyyyyyyyyyyyyyTT", "yyyyyyyyyyyyyyyyyyTT", "mmFFFJppppp7777qJJV.", "mmFFFJpppwwwwwwwwwww", "mmFFFJpppwwwwwwwwwww", "eeeeeeeeewwwwwwwwwww", "eeeeeeeeewwwwwwwwwww", "eeeeeeeeewwwwwwwwwww", "eeeeeeeeeeelllllllll", "eeeeeeeeeeelllllllll", "eeeeeeeeeeelllllllll", "eeeeeeeeeeelllllllll", "eeeeeeeeeeelllllllll", "eeeeeeeeeeelllllllll", "eeeeeeeeeeeUUUjjjet6", "bvFAAAEEAAAUUUjjjAt3", "bvFGGGEEGGGUUUGG.NZ3", "bvFGGGEEGGGUUUGG.NN3", "..FGGGEEGGGGGGGG.NN." };
    assertEquals("36FAGEJ7NTVZbeUjlmpqtvwy", topview.findOrder(grid));
  }

  @Test
  public void case15() {
    String[] grid = { ".......................................", ".......................................", ".......................................", ".......................................", ".....................77777777777777....", ".....................77777777777777....", ".....................777777777777778888", ".....................777777777777778888", ".....................777777777777778888", ".....................777777777777778888", ".....................777777777777778888", ".....................777777777777778888", ".....................777777777777778888", "............zzzzzzzzzzzzVVVVVVVVV888888", "............zzzzzzzzzzzzVVVVVVVVV888888", "............zzzzzzzzzzzzVVVVVVVVV888888", "............zzzzzzzzzzzzVVVVVVVVV888888", ".....................VVVVVVVVVVVV888888", ".....................VVVVVVVVVVVV888888", ".................................888888", ".............LLL.................888888", ".............Looooooooooooooo....888888", ".............Looooooooooooooo..........", ".............Looooooooooooooo..........", ".............Looooooooooooooo..........", ".............Looooooooooooooo..........", ".............Looooooooooooooo..........", ".............Looooooooooooooo..........", "..............ooooooooooooooo..........", "..............ooooooooooooooo..........", "..............ooooooooooooooo..........", "..............ooooooooooooooo..........", "..............ooooooooooooooo..........", "..............ooooooooooooooo..........", "..............ooooooooooooooo..........", ".......................................", "......................................." };
    assertEquals("87LVoz", topview.findOrder(grid));
  }

  @Test
  public void case16() {
    String[] grid = { "...NNNN...", "...NNNN...", "...NNNN...", "...NNNN...", "...NNNN...", "...NNNNh..", "...NNNNhL.", "...NNNNhL.", "...NNNNhL.", "...NNNN22.", "...NNNN22.", "...NNNN22.", "...NNNN22.", "...NNNN22e", "..gNNNNgge", "..gNNNNggW", "rrgNNNNggW", "...NNNN22W", "...NNNN22W", "...NNNN22W", "...NNNN22W", "...NNNN22W", "..8NNNN22W", "V..i2zz22W", "V..i2zz22W", "V..iqzz4qq", "Vddiqzz4qq", ".ddiqqqqqq", ".ddiqqqqqq", ".ddiqqqqqq", "...ii..f.W", "...ii..f.W", "SSSSS..X.W" };
    assertEquals("8LSVWXdefhi2gNq4rz", topview.findOrder(grid));
  }

  @Test
  public void case17() {
    String[] grid = { ".nnnnnn....", ".nnnnnn....", ".nnnnnnrXr.", ".nnnnnnrXr.", ".nnnnnnRXr.", ".nnnnnnRRr.", "lnnnnnnRRr.", "VVVVVVVVRr.", "VVVVVVVVRr.", "VVVVVVVVRr.", "VVVVVVVVRry", "VVVVVVVVRry", "VVVBBBBVRry", "VVVBBBBxxxy", "VVVBBBBxxx.", "KKnBBBBxxx.", "KKnBBBBxxx.", "KK.BBBBxxmm", "KK.BBBBxxmm", "KK.xxxxxxmm", "KKcxxxxxxmm", "KKcxxxxxxmm", "..cxxxxxxmm", "..c44cccrmm", "..c44ccc.mm", "..cWWWWWWmm", "...WWWWWWOO" };
    assertEquals("OlnKrRVXc4WxBmy", topview.findOrder(grid));
  }

  @Test
  public void case18() {
    String[] grid = { "................UU444444UU.......", "................66666666666666PP.", "................66666666666666MMW", ".......kkkkkkkkk66666666666666MM.", "GGGGGGGGGGGGGGGGGGGGGJJJJJJJJJMM.", "GGGGGGGGGGGGGGGGGGGGGJJJJJhhhhhhh", "GGGGGGGGGGGGGGGGGGGGGJJJJJhhhhhhh", "GGGGGGGGGGGGGGGGGGGGGJJJJJhhhhhhh", "GGGGGGGGGGGGGGGGGGGGGJJJJJhhhhhhh", "GGGGGGGGGGGGGGGGGGGGGJJJJJhhhhhhh", "GGGGGGGGGGGGGGGGGGGGGYYYYYhhhhhhh", "aaaa111111XXsssssssssssppqhhhhhhh", "BBBBBBBBBBBBBBBBBBBssssppqhhhhhhh", "BBBBBBBBBBBBBBBBBBBXXppppqhhhhhhh", "XXXXZZZZZZZZZZIIIXXcEEEpp55555555" };
    assertEquals("56GJMPU4WX1IYZachkpEqsB", topview.findOrder(grid));
  }

  @Test
  public void case19() {
    String[] grid = { "...lll.......L.", "mmmqll.......L.", "mmmqll77.....L.", "mmbqbbbbbbbbbbs", "mmmqFFF7aavvvLs", "mRRReeRRaavvvLB", "mRRReeRRdKKKKKd", "mmZNNNNDaKKKKKB", "mmiNNNNiiKKKKKB", "mmiNNNNiWKKKKKW", "mmmPPzzhxKKKKKB", "gmmP00000KKKKKB", "gmmP00000KKKKKB", "gmmP00ppppppppp", "mmmPUTTTUKKKKKG", ".PPIIIIIIrrx99G" };
    assertEquals("79BDFGLPadhlmRZbegiNWqsvx0IKUTprz", topview.findOrder(grid));
  }

  @Test
  public void case20() {
    String[] grid = { "............", "............", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxAA", "......xxxxxx", "......xxxxxx", "......xxxxxx", "......xxxxxx", "......xxxxxx", "......xxxxxx", "......xxxxxu", "......xxxx3u", "......xxxx3u", "......xxxx3u", ".qqqqqxxxx3u", ".qqqqqxxxxtu", ".qqqqPxxxxtu", ".qqqqPvvvvtu", ".qqqqPvvvvtu", ".qqqqPvvvvtu", ".qqqqPvvvvtu", ".qqqqPvvvvtu", ".qqqqPvvvvtu", ".qqqqCCCCCtu", "pppppCCCCCtu", "pppppCCCCCtu", "pppppCCCCCtu", "pppppppppptu", "ppppp77ppptu", "ppppp77ppptt", "pppppppppptt" };
    assertEquals("p7qCPvx3Atu", topview.findOrder(grid));
  }

  @Test
  public void case21() {
    String[] grid = { "..LL", "..LL", ".zLL", ".zLL", ".WWW", ".WWW", ".WWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "tWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "IWWW", "sWWW", "sWWW", "sWWW", "sWWW", "sWWW", "sWWW", "sWWW", "ssff", "ssff", "ssff", "ssff", "ssff", "ssff", "5xff", "5xff", "Czff" };
    assertEquals("5CILftzsWx", topview.findOrder(grid));
  }

  @Test
  public void case22() {
    String[] grid = { ".......dddd.", "......Xdddd.", "......XddddE", "...YYYYddddE", "...YYYYddHHE", "...YYYYddHHE", "WWWWYYYddHHE", "WWWWYYYddHJP", "WWWWYYYddHJP", "WWWWvvvvvvJa", "WWWWvvvvvvJa", "..CCvvvvvvJa", "..CCvvvvvvJa", "IICCvvvvvvJa", "IICCvvvvvvJa", "IICCvvvvvvJa", "..CCY2bbbbJa", "..CCY2bbbbJa", "..CCY2bbbbJa", "..CCY2bbbbuu", "..CCY2bbbbuu", "..CCi2bbbbuu", "..GGG2bbbbuu", "xxGGG2bbbbuu", "xxGGG2bbbbuu", ".1CC42bbbbuu", "..CCF2bbbbuu", "..CCi2222Zuu", "..CC82222Zuu", "qqqqq2222yuu", "qqqqq2222hSS", "qqqqq2222huu", "qqqqq2222Auu", "qqqqq9999AAA", "qqqqq9999AAA", "qqqqq8yhhAAA", "qqqqq8yyyyt3", "qqqqq.yyyyt3" };
    assertEquals("138EIPXYCWZadHJi4FGqtvxyh29AbuS", topview.findOrder(grid));
  }

  @Test
  public void case23() {
    String[] grid = { "........", "........", "........", "........", "........", "........", "........", "........", "........", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "ffffffff", "....MMM.", "....MMM.", "....MMM.", "....MMM.", "..55....", "..55....", "........", "........" };
    assertEquals("5Mf", topview.findOrder(grid));
  }

  @Test
  public void case24() {
    String[] grid = { ".......BBMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMwwww", ".......BBMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMwwww", ".......BBBBBBBBBBBBBBBB............wwwwwwwwww", ".......BBBBBBBBBBBBBBBB6...........wwwwwwwwww", ".......BBBBBBBBBBBBBBBB6......SSSSSwwwwwwwjjj", ".......BBBBBBBBBBBBBBBB6...........wwwwwwwjjj", ".5UUUUUUUUUUUUUUUUBBBBB6fffffIIIIffwwwwwwwjjj", ".5UUUUUUUUUUUUUUUUBBBBB6ffffffflllllllllllllO", ".5UUUUUUUUUUUUUUUUBBBBB6ffffffflllllllllllllO", ".5UUUUUUUUUUUUUUUUBBBBB99999999lllllllllllllE", ".5UUUUUUUooooooooooBBBB99999999994444tttttttt", ".5UUUUUVVVVVVVVVVVoBBBB99999999994444tttttttt", "..UUU11VVVVVVVVVVV1111111111111111111tttttttt", "..UUUUUVVVVVVVVVVVBBBBB99999999994444tttttttt", "..UUUUUVVVVVVVVVVVBBBBB644444444444qqtttttttt", "..UUUUUUUUUUUUUUUU66666644444444444qqtttttttt", "..UUUUUUURRRRRRRRRRRRRRRRRRRRRRRRRRRRtttttttt", ".........RRRRRRRRRRRRRRRRRRRRRRRRRRRRtttttttt", ".........RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR.nnn." };
    assertEquals("4569BEOSU1RfIlnoVqtwMj", topview.findOrder(grid));
  }

  @Test
  public void case25() {
    String[] grid = { "...", ".hh" };
    assertEquals("h", topview.findOrder(grid));
  }

  @Test
  public void case26() {
    String[] grid = { "..................................................", "................................iiiiiii...........", "................................iwwwwwwwwwww......", ".......qqqqqqqqqqqqqqqqqqqqqqqqqiwwwwwwwwwwwqqqqqq", ".......qqqqqqqqqqqqqqqqqqqqqqqqqiwwwwwwwwwwwqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbqiiiiiiiqqqqqqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbqiiiiiiiqqqqqqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiiiFqqqqqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiiiFqqqqqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiiiFqqqqqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiiiFqqqqqqqqqq", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii11111111111", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii1EEEEEEEEE1", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii1EEEEEEEEE1", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii1EEEEEEEEE1", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii1EEEEEEEEE1", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii1EEEEEEEEE1", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbFiiiiiii11111111111", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbb0000000000000000000", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiii11111111111", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqqqq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiFqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbKiiiiiiiqqqqqqqqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbBiiiiiiiBBBBBBBqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbBiiiiiiiBBBBBBBqUUq", "KKKbbbbbbbbbbbbbbbbbbbbbbbbbbbbBiiiiiiiBBBBBBBMUU.", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbBiiiiiiiBBBBBBBMMz.", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbBBBBBBBBBBBBBBBzzz.", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbBBBBBBBBBBBBBBBzzz.", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbBBBBBBBBBBBBBBBzzz.", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbBBBBBBBBBBBBBBBO...", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbb...............O...", "...bbbbbbbbbbbbbbbbbbbbbbbbbbbbjjjjjjjjjjjjjjjjj..", "..........................jjjjjjjjjjjjjjjjjjjjjj..", "...eeeeeeeeeeeeeeeeeeeeeeejjjjjjjjjjjjjjjjjjjjjj.." };
    assertEquals("OejqF1EKBbi0wzMU", topview.findOrder(grid));
  }

  @Test
  public void case27() {
    String[] grid = { ".......................................", ".......................................", ".......................sssssss.........", ".......................spppppppppppp...", ".......................spppppppppppp...", "......vvvvvvvvvvvvvvvvvvvvvppppppppp...", ".......................sppphhhhhhhhhh..", ".......................sppphhhhhhhhhh..", ".......................sppphhhhhhhhhh..", ".......................sppphhhhhhhhhh..", ".......................spppppppppppp...", ".......................spppppppppppp...", ".......................spppppppppppp...", ".......................spppppppppppp...", "...rrrrrrrrrr7777rrrrr..ppppppppppppq..", "...rrrrrrrr5555555555555ppppppppppppq55", "...........5555555555555pppppppppppp555", "...........5555555555555pppppppppppp555", "...........5555555555555555555555555555", ".......................................", "......................................." };
    assertEquals("r57qsphv", topview.findOrder(grid));
  }

  @Test
  public void case28() {
    String[] grid = { "......zqqqq", "......zqqqq", "......zqqqq", "......zqqqq", "......zxxz.", ".....MMMMMM", ".....MMMMMA", ".....MMMMMA", ".....MMMMMA", ".....MMMMMA", "....JMMMMMA", "....JMMMMMA", "....JMMMMMA", "....JMMMMMA", "....JMMMMIA", "..33JMMMMIA", "..33TMMMyyA", "FFFFFMMMyyA", "FFFFFMMMyyA", "FFFFFMMMycA", "BBhXTMMMycA", "BBhXTMMMycA", "BBhXTMMMycA", "B7777777ycA", "B7777777ycA", "B7777777ycA", "B7777774ycA", "B7777774ycA", "ggg77774ycA", "ggg77774ycA", "ggg77774ycA", "B7777777ycA", "B999TMMMMcA", "WWWWTMMMMcA", "WWWWTMiiMcA", "KKKKKKKKKcA", "KKKKKKKKKcc", "BB33TMiiMcc", "BB33TMiincc", "BB33TMiiwcc", "BB33TMiiMcc", "BB33TMiiMcc", "..333MMMMIM" };
    assertEquals("3B9JMIT74FWXghiKnwycAzqx", topview.findOrder(grid));
  }

  @Test
  public void case29() {
    String[] grid = { "............................e.......", "............................e.......", "............................e.....jj", "............................e.......", "............................e......6", "...........KKKKKKKKKKKK...o.eC.UU..6", "........qqqKKKKKKKhhhhhh..o.eC.UU..6", "........qqqKvvvvvvhhhhhhvvvvvvvUUgH7", "........qqqKvvvvvvhhhhhhvvvvvvvUUgH7", "........qqqKvvvvvvhhhhhhvZZZZZZZZZH7", "........qqq.vvvvvvhhhhhhvvvvvvvUURH7", "........qqq.vvvvvvhhhhhhvvvvvvvUURH7", "GG......qqq.vvvvvvhhhhhhvvvvvvvUUgH7", ".....NNNqqqNvvvvvvhhhhIIIIIIIIIIIgH7", ".....NNNqqqNNN22ffhhhhIIIIMMIIIIIgH7", ".....NNNqqqNNN22ffhhhhIIIIMMIIIIIcH7", ".....NNNNNNNNN22ffhhhhIIIIMMIIIIIcH7", "...AAAAAAAAAAAAAffhhhhIIIIMMIIIIIAAc", "...AAAAAAAAAAAAAffhhhhIIIIIIIIIIIAAc", "...AAAAAAAAAAAAAffhhhhIIIIIIIIIIIAA.", "...AAAAAAAAAAAAAffhhhhIIIIIIIIIIIAA.", "..................hhhhIIIIIIIIIII..." };
    assertEquals("26CGKNUc7AHefgRjoqvZhIM", topview.findOrder(grid));
  }

  @Test
  public void case30() {
    String[] grid = { "..............KKK", ".....IIIIIIId.KKK", "..iiiI555555d5KKK", "..iimm555555d5KKK", "..iimm555555d5KKK", "....mm555555d5KKK", "....mm5QQQQQQQQQK", "....mm5QQQQQQQQQK", "....mm5QQQQQQQQQa", "....mm5QQQQQQQQQa", "....mm5QQQQQQQQQa", "..xxxx5QQQQQQQQQa", "..xxxx5QQQQQQQQQa", "..xxxx5QQQQQQQQQa", "..xxxx5QQQQQQQQQa", "..xxwwwQQQQQQQQQa", "..xxwwwaaaaaaaaaa", "..xxwwwaaaaaaaaaa", "..xxxx5aaaaaaaaaa", "..xxxx5aaaaaaaaaa", "..xxxx5aaaaaaaaaa", "..xxxx5aaaaaaaaaa", "..xxxx5aaaaaaaaaa", "..xoxx5aaaaaaaaaa", "..xoxx5aaaaaaaaaa", "..xoxx5aaaaaaaaaa", "..xoxx555555d5mmJ", "..xoxx555555d5mmJ", "..xoxx555555d5mmJ", "..xoxx555555d5mmJ", "..xoxx555555d5mmJ", "..xoxxxxxxxxdJJJJ", "...zz1111qq1dJJJJ", ".......2222222JJJ" };
    assertEquals("1IJ2imKqx5daQowz", topview.findOrder(grid));
  }

  @Test
  public void case31() {
    String[] grid = { "............XX", "............XX", "TTTTTTTTTuuuuT", "TTTTTTTTTuuuuT", "TTJJJTTTTuuuuT", "..JJJ....uuuuX", "..JJJ....uuuuX", "..JJJ....uuuuX", "..JJJ...EuuuuX", "..JJJ...EuuuuX", "..JJJ.mmEuuuuX", ".dJJJdmmEuuuuX", ".dJJJdmmEuuuuX", ".dJJJdmmEuuuuX", ".dJJJ111EuuuuX", ".dJJJ111EuuuuX", ".GJJJ111Euuuuh", ".GJJJ111Euuuuh", ".GJSSSSSSSSSSS", ".GJSSSSSSSSSSS", ".GJSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".ccSSSSSSSSSSS", ".cccccccccee.." };
    assertEquals("EGXTcd1JSehmu", topview.findOrder(grid));
  }

  @Test
  public void case32() {
    String[] grid = { ".......eeeeeeeeeeeeeeee........vvv.....", ".FFFGGGeeeeeeeeaaaaaaaaaaaaaaaaaaa.....", ".FFFG77eeeeeeeeeeeNNNNNNNNNNNNNNNv..nn.", ".FFF.77eeeeeeeeeeeNNNNNNNNNNNNNNNWWWWWW", ".OOOOOOeeeeeeeeeeeNNNNNNNNNNNNNNNhhhhhh", "rrrrrrreeeeeeeeeeeNNNNNNNNNNNNNNNhhhhhh", "cFFFc77eeeeeeeeeeeNNNNNNNNNNNNNNNhhhhhh", "cFFFc77eeeeeeeeeeeNNNNNNNNNNNNNNNhhhhhh", ".FFF.77eeeeeeeeeeeNNNNNNNNNNNNNNNhhhhhh", ".FFF.77eeeeeeeeeeeeeeeeEiiEhhhhhhhhhhhh", ".....77eeeeeeeeeeeeeeeeEiiEhhhhhhhhhhAh", ".....777777777777777777EiiEhhhhhhhhhhAh", ".....777777777777777777EEEHHHHHHHHHHHAH", ".....7777777777777777777777xxxhhhhhhhhh" };
    assertEquals("G7EWcFOehHAinrvNax", topview.findOrder(grid));
  }

  @Test
  public void case33() {
    String[] grid = { ".......ggggggggggggggggg...............oooo..", ".fffffffffffffffffffffffffffffffffff...oooo..", ".fffffffffffffffffffffffffffffffffffZZZooooZ.", ".fffffffffffffffffffffffflllllll55555llllllll", "kfffffffffffffffffffffffflllllll55555llllllll", "kff33333333333333333333333llllll55555llllllll", "kff33333333333333333333333UUUUlllllllllllllll", "kff33333333333333333333333UUUDDDlllllllllllPl", "kff33333333333333333333333cccDDDccAAAAlllplll", "kff33333333333333333333333rrrDDDrrrrrrrrrrrrr", "kff33333333333333333333333rrrrrrrrrrOOOOrrrrr", "kff33333333333333333333333rrrrrrrrrrOOOOrrrrr", ".ffffffffffffffffffffffffllllxxxxxxxxxxxxxlll" };
    assertEquals("Zfgkl35APUcoprDOx", topview.findOrder(grid));
  }

  @Test
  public void case34() {
    String[] grid = { "..yyyyyyyyy................EEEEEEEEEEEEEEEj", "...........................EEEEEEEEEEEEEEE9", ".......................ttttEYYYYYYYYY6666E9", ".NNN...................ttttEYYYYYYYYY666eee", ".NNN...................ttttEYYYYYYYYa666eee", ".NNN...................ttttEYYYYYYYYa666eee", ".NNN.......RRRRRRRRRRRRRRRREYYYYYYYYa666eee", ".NNN.......RRRRRRRRRRRRRRRREYYY77777a666eee", ".NNN....rrrrrrrrrrrrrrrrrrrrrrrQQQ77a666677", ".NNN....rrrrrrrrrrrrrrrrrrrrrrrQQQYYa6666z9", ".NNN....3..RRRRRRRRQQQQQQQQQQQQQQQYYa6666z9", ".NNN....3..RRRRRRRRRRRRRRRRiYYYYYYYYYYYYzz9", ".NNN....3...iikkkkkkki111111111111111111119", ".NNN....3...iiiiiiiiii111111111111111111119", ".NNN....3...iiiiiiiiii11111111111111111111B", ".NNN....3.........zzzz11111111111118888811B", ".NNN....3.........zzzz1111111111111888881gB", ".nnnnnnn3nnnnsssssssss1111111111111111O11g.", ".NNN....3....sssssssss1111111111111111111g." };
    assertEquals("9BENjn3styzY76aei18ORQgkr", topview.findOrder(grid));
  }

  @Test
  public void case35() {
    String[] grid = { "......", "......", "f.....", "f7..k.", ".7ggk.", ".7ggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "NNggk.", "RRRRk.", "RRRRk.", "RRRRk.", "RRRRk.", "RRRRR.", "RRRRRQ", "..gga.", "ttggt.", ".....G" };
    assertEquals("7GNQaftgRk", topview.findOrder(grid));
  }

  @Test
  public void case36() {
    String[] grid = { ".........", "44...YYYY", "JJJJJYYYY", "JjjjjjYYY", "JjjjjjYYY", "JJJJJYYYY", "JJJJiiiig", "JJJJiiiig", "JJJJiiiig", "JJMNiiiig", "..MNNNDQY", "..MNNNDQY", "CCCNNNZQY", "COOOOObbb", "COOOOObbb", ".OOOOOZWW" };
    assertEquals("4CJMOWYDNQZbgij", topview.findOrder(grid));
  }

  @Test
  public void case37() {
    String[] grid = { ".vbbbbbbbbbbbbbbbbbb9", "FvbbbbbbbbHHHHHHHHHHH", "yPbbbbbbbbHHHHHHHHHHH" };
    assertEquals("9FPbHvy", topview.findOrder(grid));
  }

  @Test
  public void case38() {
    String[] grid = { "...........", "...........", "...........", "...........", "...........", "...........", "...........", "...........", "...........", "...........", "......vvv..", "...........", "..........." };
    assertEquals("v", topview.findOrder(grid));
  }

  @Test
  public void case39() {
    String[] grid = { "................................", "...........lllllllllllllllllllll", ".....EEEEEElllllllllllllllllllll", ".....EEEEEEllllllllllllllllllnll", ".....EEEEEEllllllllllllllllllnll", ".....EEEEEElllllllllllllllllllll", ".....EEEEEElllllllllllllllllllll", ".....EEEEEElllllllllllllllllllll", ".....EEEEEElllllllllllllllllllll", ".....EEEEETlllllllllllllllllwwww", ".....EEEEETTTTTTTTTooooooooowwww", ".....EEEEETTTTTTTTTooooooooowwww", ".....EEEEETTTTTTTTTooooooooowwww", ".....EEEEETTTTTTTTTooooooooowwww", ".....EEEEETTTTTTKKDDDDDDDDDDDwww", "UU...EEEEETTTTTTKKKKKKooooAAwwww", "UU..2EEEEETTTTTTKKKKKKooooAAwwww", "UU...EEEEEEIooooKKKKKKooooAAwwww", "UU...EEEEgggggggKKKKKKooooAAwwww", "UU.JJJJvvvvvvvvvKKKKKKJoooAAwwww", "UU.JJJJvvvvvvvvvKKKKKKJoooAAoom.", "UU.JJJJvvGGGGGGGKKKKHHHHHHHHHHHH", "UU.JJJJvvGGGGGGGKKKKHHHHHHHHHHHH", "UU.JJJJvvGGGGGGGKKKKHHHHHHHHHHHH", "...JJJJvvGGGGGGGKKKKKKGGGGAAGVm1", "...JJJJJJGGGGGGGKKKKKKGGGGAAGVm1", "......XXXXXXXXIIPPPPPPPPPPAA...1" };
    assertEquals("12EIPUVXmoJTglnvGAKHwD", topview.findOrder(grid));
  }

  @Test
  public void case40() {
    String[] grid = { ".", ".", ".", ".", ".", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", ".", ".", ".", ".", ".", ".", ".", ".", "." };
    assertEquals("M", topview.findOrder(grid));
  }

  @Test
  public void case41() {
    String[] grid = { ".................", ".....UUUUUUq.....", ".....UUUUUUqLLLL.", ".....UUUUUUqLLLLf", ".....UUUUUUqLLLLf", ".....UUUUUUqLLLLf", ".....UUUUUUqLLLLf", "...ttUUUUUUtLLLLf", "11WttUUUUUUt1999f", "11WttUUUUUUt1999f", "11WooUUUUUUt1999f", "11WooUUUUUUtr9T9f", "11WooUUUUUUtr9T94", "11WooUUUUUUtr9T94", "11WooUUUUUUtr9T94", "11WooUUbbUUtr9T94", "11WooUUbbUUtr9T94", "1PWooUUbbUUtr9T94", "1PWooUUbbUUtddT94", "1PWooUUbbUUtddT94", "1PWttUUbbUUtddT94", "1PWttUUbbUUtr9T94", "1PWt888bb88888894", "1PPt888bbxxxxxx94", "1PPt888bbxxxxxx94", "222t888bbxxxxxx22", "222t888bbxxxxxx22", "222t888bbxxxxxxG2", "222t888bb888888G2", "222t888bb888888G2", "222t888bb888888G2", "222t888bb888888G2", "222t888bb888888G2", "222t888bb888888G2", "222t88888888888G2", "222t88888888888G2", "222t88888888888G2", "222288888888888G2", "222288888888888G2", "22228888ggggggggg", "22222EEEEEEEEEGG2" };
    assertEquals("1249EGLPTWfqrdt8Ubgox", topview.findOrder(grid));
  }

  @Test
  public void case42() {
    String[] grid = { "......", "......", "......", "......", "...d..", "...d5.", "...d5.", "tttd5.", "tttd66", "tttd66", "ttTd66", "ttTnn6", "ttTnn6", "ttTnnG", "ttTnnG", "ttTnnG", "ttTnnG", "ttNnnN", "tiNnnN", "tfNnnN", "HHNnnN", "HHNnnN", "111nn1", "111nn1", "bbNnnN", "bbNnnN", "bbNnn0", "EbNnn0", "EbNNNN", "EbNNNN", "EbNNNN", "uuHHww", "uuHHww", "uuHHww", "uuHHww", "uuffww", "....ww" };
    assertEquals("56GdtTfHN01bEinuw", topview.findOrder(grid));
  }

  @Test
  public void case43() {
    String[] grid = { "......................QQ...................", "..................DDDDQQDDDD333333333DDD...", "..................DDDDQQDDDD333v00000DDD...", ".......UUUUUUUUUUUUUUUUUUUkUUU5555555555...", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUU5555555555WWW", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUU5555555555WWW", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUU5555555555qqW", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUUUUwwU00EEqqqW", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUUUUUUU00EEqqqW", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUUUUUUU00EEqqqW", "..WWWWWUUUUUUUUUUUUUUUUUUUkUUUUUUUUEEEE9911", "..WWWWWWWWWWWWEEfffffffffffffffffffEEEE9911", "..WWWWWWWWWWWWEEfffffffffffffffffffEEEE9911", "..WWWWWWWWWWWWEEfffffffffffffffffffEEEE9911", "..WWWWWWWWWWWWEEfffffffffffffffffffEEE88899", "..WWWWWWWWWWWWEEfffffffffffffffffffEEE88899", "..............EEfffffffffffffffffff22288899", "..............EEfffffffffffffffffff22288899", "..............EEEEEE222777k7772222222288899", "......444tttttEEEEEE222777k77722222222888S9", "......444tttttEEEEEE222777k7772IIIIII2888S9", "......444tttttEEEEEE222777k7772IIIIII2888Sx", ".........tttttEEEEEEEEEEEBkBBBBBBBBMMM888xx", ".........tttttEEEEEEEEEEEBBBBBBBBBBMMMExggg", ".ZZZZZZZ......EEEEEEEEEEEBBBBBBBBBBMMMEHggg" };
    assertEquals("4D3HQW91E027BIMUZkfq5tvwx8Sg", topview.findOrder(grid));
  }

  @Test
  public void case44() {
    String[] grid = { ".............", "...........4.", "...........4.", "v...1.cccc.4.", "v..e1.cccc.4.", "v..e1.cccc.4.", "vPPP1PccccP4M", "vPPP1PccccP4b", "CPPP1PccccP4J", "CPPP1PccccP4J", "CPPP1PccccP4J", "CPPP1PiiccP4J", "CPPP1PiiccP4J", "CPPmmmmiccPTT", "CPPmmmmiccPTT", "CPPmmmmiccPTT", "CPPmmmmicQPTT", "CPPmmmmiccPTT", "CPPmmmmiccPTT", "CPPzzmmZccPTT", ".PPmmmmHHHPTT", ".PPmmmmHHHqTT", ".PPmmmmHHHqTT", ".PPmmmmHHHPTT", ".PPmmmmHHHWTT", ".PPmmmmHHHPTT", "..ammmmHHHMTT", ".77mmmmHHH79X", ".77777cHHH799", ".7777RcHHH799", ".77777cHHH799", ".77777cHHH7..", ".77777cHHH7..", "..aaaacHHH...", "..aaAAAHHHfff", "..kk........2" };
    assertEquals("29CM4JP1TWXa7ARbcHQZefikmqvz", topview.findOrder(grid));
  }

  @Test
  public void case45() {
    String[] grid = { ".......", ".k.R...", "...QwwL", ".ccRww.", ".ccRww.", ".WfWww.", "...Rww.", "...Rww.", "...Rww.", "...Rww.", "...Rww.", "....ww.", "....ww.", ".......", ".......", ".......", ".......", "..4444x" };
    assertEquals("4LRQWcfkwx", topview.findOrder(grid));
  }

  @Test
  public void case46() {
    String[] grid = { ".....................", "...........77........", "...........77000.uuu.", "...VVVVVVVV77000Vuuu.", "...VVVVVVVH77000HcuuH", "...QVVVVVMM77000MuuuH", "...VVVVVVMM75000MuuuH", ".TYOOOOOOOOOOO00MuuuH", ".TTOOOOOOOOOOO00MuuuH", "...OOOOOOOOOOO00Muuu.", "gggOOOODOOOOOOBBBBBu.", "gggOOOOOOOOOO200Muuu.", "gggOOOOOOOdOOO00Muuu.", "gggOOOOOOOOOOOMMMuuu.", "gggOOOOOOOOOOOMMMuuu.", "gggOOuOOOOOOOOMMMuuu.", "gggOOOOOOOOOOOggguuu.", "gggOOOOOOOOOOOg33uuul", "ggg6OOOOOAAAAOg33uuul", "gggOOOOOOAAAAOg33uuul", "gggOOOOOOOOOOO44S4445", "gggOOOOOOOOOOO4444445", "gggOOOOOOOeOOOg33uuu5", "66666666666wwnwwwwuu5", "g666666666666n633uuu5", ".6666666666666666uuu5", ".6666666666666P66ooo.", "..FFFFFFFFFFCCCCCCCCr" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case47() {
    String[] grid = { "....................................", "....................................", ".............p1111111111..RRRRRR....", ".............p111CMMMMMMM1RRRRRR....", ".........hhhhp77777MMMMMMMRRRRRRTT..", ".........hhhhp77777CC111hhh....TTT..", ".................CCCC.SSSSS....TTT.." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case48() {
    String[] grid = { ".................................", ".................................", "..........S......................", ".................................", ".................................", ".................................", ".................................", ".................................", ".................................", "......X...........G..............", ".................................", ".................................", ".................................", ".................................", ".................................", ".................................", "...........M.....................", ".............................i...", ".................................", ".................................", ".................................", "................p................", ".................................", ".................................", "............LLLLLLLLLLLLLLLLL....", ".................................", ".t...............X..............." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case49() {
    String[] grid = { ".....................d..Z..........WW.", "n.....0000000kkkkkkk.d........99999WW9", "......0000000kkkkkkk.d........99999WW9", "......0000000kkrrrrr.d......JJJJJJJJW9", "......0000000kkrrrrrbd......JJJJJJJJW9", ".....o000000066rrrrr66666oooJJJJJJJJW9", ".....o000000066rrrrr66666oooJJJJJJJJW9", ".....o00llll066rrrrr66666VooJJJJJJJJW9", "......00llll066rrrrr66.66...JJJJJJJJW9", "......00llll0kkrrrrrXXXXXXXXJJJJJJJJ99", "......00llll0kkrrrrrEEEEEEEEEEEeeee999", "......0Ullll0kkpppppppppppEEEEEE999999", "......00llll0kkpppppppppppyyyyyyyyyyyy", "....xhxxxxxxxxcpppppppppppcccccccyyyyy", ".PPPxxxxxxxxxxcpppppppppppcccCCCCCCCyy", "uuuuxxxxxxxxxxcpppppppppppzccCCCCCCCyy", "uuRRxxxxxxxxxxVpppppppppppcccCCCCCCCyy", "uuRRxxoxexxxxxVpppppppppppiccCCCCCCCyy", "uuRRxxxxxxxxxxVpppppppppppcccCCCCCCCyy", "uuRRxxxxxxxxxxVpppppppppppcccCCCCCCC.w", "uuuuxxxxxxxxxxVpppppppppppcccCCCCCCCjw", "uuuuxxxxxxxxxxVpppppppppppcccCCCCCCCjw", "uuuuxxxxxxxxxxVpppppppxpppcccCCCCCCCjw", ".OOOOO00llll0cVpppppppppppcccCCCCCCCjw", ".OOOOO00llll0cVpppppppppppcccCCCCdCCjw", ".OOOOO0000000cVpppppppppppcccCCCCCCCjw", ".OOOOOOOOOPPPcVpppppppppppcccCCCCCCCjw", ".OOOOOOOOO...cVpppppppppppcccCCCCCCCjw", ".OOOOOOOOO...cVpppppppppppcccCCCCCCCjS", ".OOOOOOOOO...cVVZZZZZZZZZZZZZZZccSSSSS", ".OOOOOOOOO...kVVZZZZZZZZZZZZZZZzSSSSSS", ".............ggHZZZZZZZZZZZZZZZzSSSSSS", "................ZZZZZZZZZZZZZZZSSSSSvv", ".........................fffffffff22vv", "....mmmm........888BBBBBBBBBBBBBBB22Sh" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case50() {
    String[] grid = { ".................................", ".................................", ".................................", ".................................", "........................d........", "........................d........", "........................d........", "........................d........", "........................d........", "........................d........", "........................d........", "........................d........", "........................d........", "........lllllllllllllllldl.......", "........lllllllllllllllldl.......", "........lllllllllllllllldl.......", "........lllllllllllllllldl.......", "........lllllllllllllllldleeeeee.", "........lllllllllllllllldleeeeee.", "........lllllllllllllllldleeeeee.", "........lllllllllllllllldleeeeee.", "..yyyyyyyyyyyylllllllllldleeeeee.", "..yyyyyyyyyyyylllllllllldl.......", "..yyyyyyyyyyyylllllllllldl.......", "..yyyyyyyyyyyylllllllllldl.......", "..yyyyyyyyyyyylllllllllldl..0....", "..yyyyyyyyyyyylllllllllldl.......", "..yyyyyyyyyyyylllllllllldl.......", "..yyyyyyyyyyyylllllllllldl.......", "....YYYYYYYllllllllllllldl.......", "....YYYYYYYlllllllllll77d77777777", "....YYYYYYYlllllllllll77d77777777", "....YYYYYYYlllllllllll77d77777777", "....YYYYYYYlllllllllll77777777u77", "......4.llllllllllllll77777777777", "........llllllllllllll77777777777", "...o.ZZZZZZZZZZZZZZZZZ77777777777", "...o....llllllllllllll77777777777", "...o....llllllllllllll77777777777", "...o....llllllllllllllllll.......", "........lllllllVllllllllll9......", "........llllllllllllllllll.......", "........llllllllllllllllll.......", "........llllllllllllllllll.......", ".................................", "................................." };
    assertEquals("049el7VYZdouy", topview.findOrder(grid));
  }

  @Test
  public void case51() {
    String[] grid = { "..................................ZZZZ..", "....BBBBBBBBBBBB1BBBB...r4rrrrrrrrrrry..", "....BBpBBBBBBBBBBBBBB...rurrrrrrrrrrrZ..", "....BBBBXXXXXXBBBsBBBeeeeueeeemeeqqqqq..", "....BBBBXXXXXXBBBBBBBeeeeueeeeeeeqqqqq..", "....BBBBXXXXXXBBBBBBBeeeeueeeeeeeqqqqq.H", "....BBBBXXXXXXBBBBBBBee11u111eeeeqqqqq..", "....BBBBXXXXXXBBBBBBBee11uEEEEEEEqqqqq..", "....BBBBXXXXXXBBBBBBBee11uEEEEEEEEEEee..", "....BBBBXXeXXXBBBBBBB3333333E7EEEEEEee..", "....BBBBXXXXXYBBBBBBB3333333EtEEEEEEee..", "....BBBBXXXXXXBBBBBBB3333333E7TTTTmmmmmm", "....BBBBXXXXXXBBBBBBB3333333E7TTTTmmmmmm", "....BBBBXXXXXXBBBBBBB3333333E7TTTTmmmmmm", "....BBBBXXXXXfBBBBBBB3333333E7TTTTmmmmmm", ".sssBBBBXXXXXXBBBBBBB3333333E7TTTTmmmmmm", ".sssBBBBXXXXXXBBBBBBB3333333K7TTTTmmmmmm", ".sssBBBBXXXXXXBBBBBBB3333333K7TTTTmmmmmm", ".sssBBBBXXXXXXBBBBBBB333333.K7TTTTmm2222", "ffffBBBBXXXXXXBBBBBBBffffffffffffffm2222", "ffffBBBBXXXXXXBBBBBBBffffffffffffffc2222", "ffffBBBBXXXXXXBBBBBBBffffffffffffffm2222", "ffffffffXXXXXXfffffffffffffffffffffm22.2", "ffffffffXXXXXXfffffffffffffffffffffm2222", ".......xXXXXXX33333333333333i7immmmm2222", ".......xXXXXXX33333333333333i7immmmm2222", ".hhhhhhhh3333333333333333333h7hmmmmm2222", ".hhhhhhhh3333333333333333333h7hmmmmm2222", ".hhhhhhhh3333333333333333333h7hmmmmmmmmm", ".hhhhhhhh33333333333333333m3h7hmmmmmmmmm", ".hhhhhhhh3333333333333333333h7hmmmmmmmmm", "Ohhhhhhhhhhhhhhhhhhhhhhhhhhhhhhmmmmmmmmm", "OhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhmmmJJJmmm", "OhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhmmmJJJmmm", "OOOOOOOOOOOOFFFFF4AAAAAAASSSSSSmmmJJJmmm", ".nnnnnnnnnnnFFFFF4AAAAAAAAAAAMMmmmJJJaam", "................................666....t" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case52() {
    String[] grid = { "............................", "............................", "............................", "............................", "..........JJJJJJJJJJJJJJJJ..", "nnnnnnnn..JJJJJJJJJJJJJJJJ..", "nnnnnnnn..JJJJJJJJJJJJJJJJ..", "nnnnnnnn..JJJJJJJJJJJJJJJJ..", "nnnnnnnn..JJJJJJJJJJJJJJJJ..", "nnnnnnnn..JJJJJJJJJJJJJJJJ..", "nnnnnnnnlll.ddddddddddddddd.", "nnnnnnnnlll.dddddddddddddddo", "nnnnnnnn88w888888888888888d.", "nnnnnnnn88w888888888888888d.", "nnnnnnnn88w888888888888888ff", "nnnnnnnn88w888888888888888ff", "nnnnnnnn88wttttttttttt8888ff", "nnnnnnnn88wttttttttttt8888ff", "nnnnnnnn888888888888888888ff", "nnnnnnnn888888888888888888ff", "nnnnnnoo888J88888888888888ff", "333nnnoo888888888888888888ff", "333nnnoo888888888888888888ff", "333llloo888888888888888888ff", "333llloo888888888888888888ff", "333llloKKKKKKKKKKKKK888888ff", "333llloKKKKKKKKKKKKK888888ff", "333llloKKKKKKKKKKKKK888888ff", "333llloKKhhhhhhhhhhhhhhh88ff", "333sssoo8hhhhhhhhhhhhhhh88ff", "333sssoo8hhhhhhhhhhhhhhh88ff", "333sOOOOOOOOOOOOOOOOOhhh88ff", "lllsOOOOOOOOOOOOOOOOOhhh88ff", "...sOOOOOOOOOOOOOOOOOhhh88ff", ".1zzOOOOOOOOOOOOOOOOOhhh88ff", "CCCCOOOOOOOOOOOOOOOOO88888d.", "CCCCOOOOOOOOOOOOOOOOO88888p.", "CCCCOOOOOOOOOOOOOOOOO88888p.", "CCCCOOOOOOOOOOOOOOOOO88888p.", "CCCCOOOOOOOOOOOOOOOOO88888p.", "CCCCOOOOOOOOOOOOOOOOO88888p.", "CCCCCCCC888888888888888888p.", ".jzzzzzz888888888F88888888d.", ".jzzzzzz8888888888888aaaaaaa", ".jzzzzzq8888888888888aaaaaaa", ".jzzzzzqqqqqqqqqqzuuujj.....", ".jzzzzzqqqqqqqqqqzuuujj.....", ".jjjjjjqqqqqqqqqqjuuujj.....", "..................uuu.......", "..........iiiiiiiiuuuiiiiii." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case53() {
    String[] grid = { "ccccPPPPPPszPPPP.PPPPPPPPPPrPPP.PP009.", ".LcccLSSSSlKKKKLLVLLCXTTTTTr33337777h." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case54() {
    String[] grid = { "..UU", "..UU", "..UU", "GGUU", "JGUY", "GGUU", "GGUU", "..UU", "rYUU", "JJJJ", "J.JJ", "JJJJ", "JJAJ", "J1JJ", "JJJJ", "JJJJ", "JJJJ", "JJJJ", "JJJJ", "JJJ.", "JJJJ", "JJJJ", "JJJJ", "JJJJ", "JJwJ", "JJwJ", "JWwJ", "JJwg", "JJwJ", "JJwJ", "JUwJ", "JJwJ", "JJwJ", "RJwz", "JRwJ", "JRwe", "JRwJ", "JJwJ", "JJwJ", "JAwJ", "JffJ", ".ffs" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case55() {
    String[] grid = { ".........", "......aaa", ".UYYYYaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYBBBaaa", ".UYYYYaaa", ".UYYYYaaa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".UJJJJJJa", ".zJJJJJJ6", ".zJJJJJJ6", ".zJJJJJJ6", ".zJJJJJJ6", ".zJJJJJJ6", ".yyJJJJi6", ".yy666666", ".yy666666", "Kyy666666", "Kyy666666", "Kyy666666", "KKK666666", "KKK666666", "KKKKtKK.n", "....t..sn", "........n" };
    assertEquals("K6UYBaJinstyz", topview.findOrder(grid));
  }

  @Test
  public void case56() {
    String[] grid = { ".....PPPPPPPPPNNNNPPYY", ".....PPPPPPPPPANnnnnn8", ".11FFFFFFFFFF1AN444nx.", "b111111111111qAqqqqqqq", "b111111111111qAeeeqqWW", "bbbbbPPPPPPPPqAeee22WW", "bbK3333333333qAeee22WW", "bbbbbPPccccccqAeee22WW", ".......cccccCCCeee22WW", "..IIIddddddddCCeee2222", ".....ddddddddqAeee2222", ".....ddddddddrAeee2222", ".....dd00000drreee2222", ".vvvvdd00000drrVVV2222", "Zvvvvdd00000drrVVV2222", ".vvvvdd00000drrVVV5www", ".....ddddddzzzzzzz5www", "DDgggdddddUzzzzzzz5www" };
    assertEquals("58DIPNVYZb13FKcgn4q2WerACd0Uvwxz", topview.findOrder(grid));
  }

  @Test
  public void case57() {
    String[] grid = { ".GGGGGFbbbbbkFGGK", ".GGGGGHbbbbbkFXXK", ".Gjjjjjjjjjjjjjjt", ".GGMMMMMkkkVVVVnt", "..0MMM33WWW.VVVnH" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case58() {
    String[] grid = { "..........................................", "....fffffffffffffff.......................", "....fffffffffffffff.........sssssss......E", "....fwfffffffffffffzzzz.....sssssss......E", "....fffffffffffffffzzzz.....sssssss......E", "............zzzzzzzzzzz.....sssssss......E", "............zzzzzzzzzzzccccccccccccc.....E", "..............cccHcccccccccccccccccc.....E", "..............cccccccccncccccccccccc.....E", "..............cccccRRRRRcccccccccccc.....E", ".........IIIIIIIIIIIIIIIIIIIIIIIcccc.....E", ".........IIIIIIIIIIIIIIIIIIIIIIIcccc.....E", ".........IIIIIIIIIIIIIIIIIIIIIIIBBBBBBBBll", ".........IIII0IIIIIIIIIIIIIIIIIIBBBBBBBBll", ".........IIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........IIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........IIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........IIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........IIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........IIIIIINNNNNNNNNNNNNNNNNNNNNNNNNNl", ".......ddIII777NNNNNNNNNNNNNNNNNNNNNNNNNNq", "......LddIII777NNNNNNNNNNNNNNNNNNNNNNNNNNl", ".......ddIII777NNNNNNNNNNNNNNNNNNNNNNNNNNl", ".......ddIII777NNNNNNNNNNNNNNNNNNNNNNNNNNl", ".......ddIII777NNNNNNNNNNNNNNNNNNNNNNNNNNl", ".......ddIII777NNNNNNNCNNNNNNNNNNNNNNNNNNl", ".......ddIII777NNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........III777NNNNNNNNNNNNNNNNNNNNNNNNNNl", ".........III777NNNNNNNNNNNNNNNNNNNNNNNNNNl", "..4444444III777NNNNNNNNNNNNNNNNNNNNNNNNNNl", "..4444444III777NNNNNNNNNNNNNNNNNNNNNNNNNNl", "..4444444III777NNNNNNNNNNNNnNNNNNNNNNNNNNS", "..4444444III777NNNNNNNNNNNNNNNNNNNNNNNNNNS", "..4444444III777NNNNNNNNNNNNNNNNNNNNNNNNNNS", "..4444444III777NNNNNNNNNNNNNNNNNDNNNNNNNNS", "..4444444III777777777777IIIIIIIICCCSSSSSSS", "..444444444444444qTTTTTTTCCCCCCCCCCeee....", "..444444444444444qqqnnqqqqqqqqqqyy.yee...t", "..444444444444444................n.......t" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case59() {
    String[] grid = { "......................2.........................", ".................E..............................", "................................................", "................................................", ".......V......................................cc", "t.......................m........SSSSSSSS......F", ".........L.......................SSSSSSSS......F", "........qqqqqqq..................SSSSSSSS......F", ".....YZZqqqqqqqZ.................SSSS8SSS......F", ".....ZZZqqqqqqqZ.....333333333333333333KKKKKK..F", ".....qZZqqqqqqqZ.....333333333333363333KKKKKK...", ".....tZZqqqqqqqZmmmmm333333333333333333.........", "........qqqqqqqmmmmmmmmmmmmmmNmm............TTT.", "........qqqqqqqmmmmmmmmmmmmmssssssssssss........", "........qqqqqqqmmmmmmmmmmmmmssssssssssss........", "........qqqqqqqmmmmmmmmmmmmmssCsssssssss........", "........qqqqqqqmmmmmmmmmmmmmmmmm................" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case60() {
    String[] grid = { ".................bbbbbbbbbbbbb......", ".................bbbbbbbbbbbbb......", ".................bbbbbbbbbbbbb....KK", "kkkkkkkkkkkkkkkkkbbbbbbbbbbbbb....KK", "kkkkkkkkkkkkkkkkkbbbbbbbbbbbbb....KK", "kkkkkkkkkmkkkkkkkbbbbbbbbbbbbb....KK", "kkkAkkkkkkkkkkkkkbbbbbbbbbbbbb....KK", "kkkkkkkkkkkkkkkkkbbbbbbbbbbbbb....KK", "kkkkkkkkkkkkkkkkkbbbbbbbbbbbbbOO..KK", "kkkkkkkkkkkkWWWWobbbbbbbbbbbbbOO..KK", "kkkkkkkkkkkkWWWWWbbbbbbbbbbbbbOO..KK", "kkkkkkkkkkkkWWWWrbbbbbbbbbbbbbOO..KK", "kkkkkkkkkkkkWWWWWbbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkkkWWWWWbbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkkkkk666666bbbbbbbbbbbbbOO.PPP", "kkkkkkkk333666666bbbbbbbbbbbbbOO.PPP", "ooooooooooooooooobbbbbbbbbbbbbOO.PPP", "oooooVVVVVVVVVVVVbbbbbbbbbbbbbOOZPPP", "oooooVVVVVVVVVVVVbbbbbbbbbbbbbOOppPP", "ooooooooooooooooobbbbbbbbbbbbbOOppPP", "oooooooooooooooo2bbbbbbbbbbbbbOOppPP", "ooooooooooooooooobbbbbbbbbbbbbOOppPP", "ooooooomooooooooobbbbbbbbbbbbbOOppPP", "ooooooooooooooooobbbbbbbbbbbbbOOppPP", "ooooooooooooooooobbbbbbbbbbbbbOOppPP", "ooooooooooooooooobbbbbbbbbbbbbOOppPP", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbppppKK", "ooooooooooooooooobbbbbbbbbbbbbZZZQKK", "...9999999999999qbbbbbbbbbbbbb....KK", "...9999999999999qbbbbbbbbbbbbb....KK", ".................bbbbbbbbbbbbb......" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case61() {
    String[] grid = { "...................................", "................vvvvvvvv...........", "................vvvvvvvv...........", "................vvvvvvvv...........", "................vvvvvvvv...........", "................vvvvvvvv......r....", "................vvvvvvvv...........", ".eeeeeeeeeeeeeeevvvvvvvveeee6aaaa..", ".eeeeeeeeeeeeeeevvvvvvvveeee6aaaa2.", ".eeeeeeeeeeeeeeevvvvvvvveeee6aaaa2.", ".eeeeee.eeeeeeeevvvvvvvveeeX6aaaa2.", ".eeeeeeeeeeeeeeevvvvvvvveeeX6aaaa2.", ".eeeeeeeeeeeeeeevvvvvvvveeeX6aaaa2.", ".eeeeeeeeeeeeeeevvvvvvvveeee644aa2.", ".eeeeeeeeereeeeevvvvvvvveeee644aa2.", ".eeeeeeeeeeeeeeevvvvvvvveeee644aa2.", ".eeeeeeeeeeeeeeevvvvvvvveeee644aa2.", ".eeeeeeeeeeeeeeevvvvvvvveeee644aa2.", ".eeeeeeeeeeeeeeevvvvvvvveeee644aa2.", ".eeeeeeeeeeeeeeevvvVvvvveeee644aa2.", ".NNNNNeeeeeeeeeevvvvvvvveeee644aa2.", ".NNNNNeeeeeeeeeevvvvvvvveeee644aa2.", ".NNNNNeeeeeZZZZZvvvvvvvvZZZZZZZZZ2.", ".NNNNNeeeeeZZZZZZZZZZZZZZZZZZZZZZ2.", ".NNNNNeeeeeeeeeeeeeeeeeeeYYY6Kjja2.", ".eeeeeeeeeeeeeeeeeeeeeeeeYYY6jjja2.", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRR2.", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRR2.", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRR2.", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRR..", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRYRRVV", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRRVV", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRRVV", ".eeeeeeeeeeeeeeeeeeeeeeeeYYYRRRRR.M", "AAAAAAAAeeeeeeeeeeeeeeeeeYYYRRRRR..", "AAAAAAAAeeeeeeeeeeeeeeeeeeeeRRRRR..", ".eeeeeeeeeeeeeeeeeeeeeeeeeeeLLLLa.9", ".............aaaaaaa7fffffLLLLLLa..", ".............aaaaaaa7aaaLLLLLLLLa.." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case62() {
    String[] grid = { "........................llllllllllllQQQQQQ", "........................l6llllllllllQQQQQQ", "........................llllllllllllQQQQQm", "..R.............T.......3lllllllllllQQQQQm", ".....6..................llll5lllllllQQQQQQ", "........................llllllllllllQQQQQQ", "......................22llllllllllllQQQQLQ", "......................22llllllllllllQQGGQQ", "dddddddddddddddddddddd22llllllllllllQQQQQQ", "dddddddddddddddddddddd22llllllllllllQQQQQQ", "dddddddddddddddddddddd22llllllllllllQ.QQQQ", "dddddddddddddddRdddddd22llllllllllllQQQQQQ", "dddddbddkddddddddddddd22llllllllllllQQQQQQ", "dddddddddddddddddddddd22llllllllllllQQQQQQ", "dddddddddddddddddddddd22llllllllllllQQQQQQ", "ddddddddddsdddddSSSddd22llllllllllllQQQQQQ", "dddddjddddddddddSSSddd22llllllllllllQQQQQQ", "ddddddddddddddddSSSddd22llllllllFlllQQQQQQ", "dddddddddddddddddddddd22222hhhhhhhhhhhhhhQ", "........WWWWWWWW......22222hhhhhhhhhhhhhhQ", "......OOOOOOOOOOO.....22222hhhhhhhhhhhhhhQ", "......OOOOOOOOOOO.....2j222hhhhhhhhhhJJhhQ", "......OOOOOOOOOOO.....22222hhhhhhhhhhhhhhQ", "......................22222........QQQQQQQ", "......................22222........QQQQtQQ", "..A...................22222........QQQQQQQ", ".H.........aaaaaaaaaaa22222aaaaaaaaaaaQQQQ", "..yyyyyyyyyyyyyyyyyyyyyyyyyaaaaaaaaaaa...." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case63() {
    String[] grid = { "4.kkk.", "a.kkk.", "a.kkkT", "a.tckT", "Zykkk.", "aykkk.", "8888k.", "8888m.", "8888mB", "8888mB", "8888mv", "8888kv", "8888kv", "8888kv", "8888kv", "8888kv", "8888.v", "8888kb", "8888kv", "888zkE", "88.8gE", "8888gE", "8888NE", "rYzNNE", "rYANNE", "33zNNE", "33YJPj", "UUYJPj", "UUYJ2j", "UUpJ2j", "UUpJqj", "UUrJqj", "rrrJTj", "rrr6.u", "...6.u", ".ee67u" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case64() {
    String[] grid = { "........DDDDDDDDDDDDDDDDDDDDDDDDD.......", "........DDDDVVVVVVVVVVVVVDDDDDDDD.......", "........DDQDVVVVVVVVVVVVVDDDDDDDD.HHHHH.", "........DDDDVVVVVKVVVVVVVDDDDDDDD.HHHHH.", "........DDDDVVVVVVVVVVVVVDDDDDDDWWWWWHH.", "........DDDDVVVVVVVVVVVVVDDDDDvvWWWWWHH.", "........DDDDVVVVVVVVVVVVVAADDDvvWWWWWHH.", "...ddddddddddddddddddDooDAADDDvlWWWWWHH.", "...ddddddddddddddddddDooDAADDDvvWWWMWHHt", "...ddddddddddddddddddDooDAADDDvvWWWWWHHt", "...ddddddddddddddddddDooDAADDDvvWWWWWHHt", "...ddddddddddddddddddDooDAADDDvvWWWWW4tt", "...dddddddddddddddddd0oo0AADDDvvWWWWW4tt", "...SSSSS00000000000000oo0AADDDvvWWWWW4tt", "...SSSSS00000000000000oo0AADDDvvWWWWW4tt", "...SSSSS00000000000000oo0AA4TTvvWWWWW4tt", "...SSSSS00000000000000oo0AA4TTGGWWWWWGtt", "...SSSSSSSSSSSSIIIIIIIoo4AA4TTGGWWWWWGtt", "...SSSSSRSSSSxxxxxSxIIoo4AA4TTGGWWWWWGtt", "...SSSSSSSSSSxxxxx9xIIoo4444TTGGGGGGGGtt", "...SSSSSSSSSSSSIIIIIIIoo4444TTGGGGGG8888", "...SaaaaaaaaaaaaaaaIIIoo4444TTGGGGGG88X8", "...SaaaaaaaaaaaaaaaIIIoo4444Tkkkkv4488X8", "...SaaaaaaaaaaaaaaaIIIoo4444Tkkkkv422228", "...SmmmmmmaaaaaaaaaIIIoo4444Tkkkk4422228", "...SmmmmmmaaaaaaaaalIIoo4444Tkkkk4422228", "...SmmmmmmaaaaaaaaaIIIoo4444Tkkkk4422228", "...SmmmmmmaaaaaaUUUUUUooUUUUUEEEEE422e28", "...SmmmmmmaaaaaaUUUUUUooUUUUUEEEEE422e28", ".NNNNNNNNNNNNNNNNNNNNNooNNNNNNNEEE422e28", ".NcNrNNNNNNNNNNNNNNNNNooNNlllNNEEEc22228", ".NNNNNNNNNNNNNNNNNNNNNooNNlllNNEEEc22228", ".NNNNNNNNNNNNNNNNwNNNNooNNlllNNEEEc22228", ".NNNNNNNNNNNNNNNNNNNNNooNNNNNNNEEE.2222t", ".NNNNNNNNNNNWNNNNNNNNNNNNNNNN0N....2222.", ".NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNMMMM2222.", "....mmmmmm.........L...qqqqqq......2222.", "....mmmmmm.........L...qqqqqq..........." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case65() {
    String[] grid = { "...............", "....88.........", "....88.........", "....88dddd.....", "....iiiiiiiiii.", "....iiiiiiiiii.", "....iiiiiiiiiis", "....iiiiiiiiiis", "....44444444iis", "....44444444iis", "...944444444iiD", "...944444444iiD", "LLLL44444444iiD", "LLkk44444XXXiin", "LLkk44444XXXiiH", "LLkk44444XXXiiH", "LLkk444ttXXXiiH", "LLLL444ttXXXiiH", "LLLL444ttXXXQQG", "LLLy40000XXXQQG", "LLLy444ttttQQQG", "LLLy444ttttQQQG", "LLLyiiittttQQQH", "LLLSSSSttttQQQH", "LLLSSSSttttQQQD", ".ccSSSSttttQQQD", ".ccSSSSttttQQQD", ".ccSSSSttttQQQD", ".ccSSSSttttQQQD", ".ccSSSSttttQQQD", ".ccSSSStttttiiD", ".ccSSSItttttiiD", ".ccSSSItttttiiD", ".ccSSSItttttiis", ".ccZiiitttttii.", ".ccZiiittttt11T", ".ccZiiittttt11T", ".ccZiiittttt11T", ".ccZiiittttt11T", ".ccZiiittttt11T", ".RRRiiittttt11.", ".RRRiiittttt11.", "5RRRiiittttt11.", "5RRRiiitttttii.", ".ccciiitttttii.", "WWWWWWWWWWJJc..", "xccccJJJJJJJ66." };
    assertEquals("589LTc6JRWZdi14SIksDHGnt0QXxy", topview.findOrder(grid));
  }

  @Test
  public void case66() {
    String[] grid = { "...................................mmmmmmmm....", "...................................mmmmmmmm...z", "...CCCCCwwwwwwwwwwwwwwwwCCCCCCCCCCCmmmmmmmm...z", "...CCCCCwwwwwwwwwwwwwwwwCCCCCCCCCCCmmmmmmmm...z", "...CCCCCwww9999999999999999999999999999999mOOOz", "...NNNNNwww9999999999999999999999999999999mOOOz", "...NNNNNZww9999999999999999999999999999999mfOOz", "...NNNNNwww9999999999999999999999999999999mOOOz", "...CCBBBwww999999999K999999999999999999999mOOOz", "...CCBBBwww999999999999999pppppppppp999999mOOOf", "...CCBBBwww999999999999999pppppppppp999999mOOO.", "...CCBBBwww999999999999999pppppppppp999999mOOO.", "...CCBBBwww999999999999999pppppppppp999999mOOO.", "...CCBBBwww999999999999999pppppppppp999999mOOO.", "...CCBBBwww9999999v9999999pppppppppp999999mOOO.", "...CXXXXwwwwwwwwwwwwwwwwPXppppppppppmmmmmmmOOO.", "LLLCXXXXwwwwwwwwwwwwwwwwXXXXXXXxxxxmmmmmmmmOOO.", "LL00000000kkkkkkkkk00000000XXXXxxxxmmmmmmmmOOO.", "..00000000kkkkkkkkk00000000XXXXxxxxmmmmmmmmXXX.", "..00000000kkkkkkkkk00000000XXXXXXXXmmmmmmmmXXX.", "...CXXXXwjjjjjjjjjjjjjwwXXXXXXXXXXXmsmmmmmmXXX.", "....XXXXwjjjjjjjjjjjjjwwXXXXXXXXXXXmmmbmmmmXXX.", "....XXXXwjjjjjjjjjjjjjwwXXXXXXXXXXXmmmbmmmmXXX.", "....XXXXwjjjjjjjjjjjjjww666XXXXXXXXyy444444444.", ".....BBBwjjjjjjjjj1jjjww666..YYYYYYyy444444444.", ".....BBBwjjjjjddddddddddddddddddddddd444444Y44.", ".....ZBBwjjjjjddddddddddddddddddddddd444444444s", ".cc..ZBBwjjjjjddddddddddddddddddddddd444444444s", ".cc..ZBBwjjjjjdddddddddddiddddBddddddiiiiuuu...", ".cc..Z..wjjjj.dddddddddddddddddddddddiiiiuuu...", ".cchhZhhwjjjjjddddddddddddddddddddddduuuuuuu...", ".cchhhhhwjjjjjddddddddddddddddddddddduuuuuuu...", ".cc.....wjjjjjddddddddddddddddddddddduuuuuuu...", ".ggggggggjjjjjddddddddddddddddddddddduuuuuuu...", ".ggggggggjjjjjjjjjjjjjgg.33333333YYYYYYYYY....t", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFdFFFFrrr55......." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case67() {
    String[] grid = { "...FFFFFFFFFFffxxxxFFFFFGG..", "..kFcccccccccfQxxxxQQQQQGGQQ", "...F888888666fQxxxxQQQQQGGQQ", "...F888888666fQxxxxQQQQQGGQQ", "...F88888866mffxxxxtFqqqG002", ".rrrrRrrrr66mffxxxxrrqqqG00q", "....888bbbbbbbbxxxxb9999999C", "....88Mbbbbbbbbxxxxb9999999q", "....88MMMMzzzzzzzzzz9999999q", "....88MMMMMMMkkAAAAA9999999q", "....OOOOOOOOOOOOOOOOOOOOOOOO", "...wwwwwwwwwwwjwwwwwwwwwwwww", "...wwddddddddddddddddddwwwww" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case68() {
    String[] grid = { "..ssssssssssssssssssssssssss.", "..ssssssssssvssssssssUssssss.", "..ssssssssssssssssssssssssss.", "..ssssssssssssssssssssssssss.", "..ssssssssssssssssssssssssss.", "..sdddddddddddddddddddddddOO.", "...dddddddddddddddddddddddOO.", "...dddddddddddddddddddddddOO.", "...dddddddddddddddddddddddOO.", "...ddddddddddddddddddddddduuu", "...ddddddddddddddddddddddduuu", "...ddddddddddddddddddddddduuu", "...ddddddddddddddddddddddduuu", "qqqddddddddddddddkdddddddduuu", "qqqdddddddd.ddddddddddddddCuu", "qqqdddddddddddddrddddddddduuu", "qqqddddddddddddddddddddddduuu", "qqqdddKddddddddddddddddddduuu", "333ddddddddddddddddddddddduuu", "333ddddddddddddddddd5ddddduuu", "33333333AAAAAAAkkkkkkkk55uuuu", "qqEAAAAAAAAAAAAkkkkkkkk55uuuu", ".IIcccccccccccckkkkkkkkccuhhu", ".IIcccccccccccckkkkkkkkccuhhu", ".IIIIHHwwJwwwwNkkkkkkkk555hh5", ".......wwwwwwwNkkkkkkkk55Ghh5", "............jjNNNSSSSSNNNGhhl", "QQQQQQ.QQQQ...NNNNNNNNNNNGhhl", "QQQQQQQQQQQ9999FFFFFFFWWWZhhl", ".K...........883FFFFFF8888888" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case69() {
    String[] grid = { "........wwww.....", "........wwww..JJ.", "OOOOK...wggg..JJ.", "OOOOK...wggg..JJ.", "OOOd....wggg..JJM", "OOOO....wggg..JJM", "OOOOFFFF3FFXXXXXM", "OOOOFFFNNNNXXXXXM", "OOOOFFFNNNNXXXXXM", "OOOOFFFNccccXXXXM", "OOOOFFFNccccXXXXM", "OOO6FFFNccccXXXXq", "OOOOFFFNccccXXXXq", "OOOO332LccccXXXXD", "OOOO332NccccXXXXu", "3333332NccccZXXXu", "3333332NccccXXXXA", "3333333NccccXXXXA", "3333333NccccXXXXA", "33333.3NccccXXXXA", "3333333NcccGXXXXA", "33v3333NccccXXvvA", "ooooooooccccoovvA", "oooooooJccccoovvA", "ooooooooccccooTQA", "ooooooooccccoo5SA", "..tt..Pxl4ccG55SA", ".......xccHc555aA", ".......xcccc111aA", "..........Y....Ck", ".kkkkkkk......HHH" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case70() {
    String[] grid = { "...........D", ".......2....", "..TJ..R.....", "..FS........", "..SS.......x", "..SS....LmLx", ".yyyyyyyyLLx", ".yyyyyybyZL.", "gyyyyyyyyLT.", "RyYykyyyyLL.", "JyyyVyyyyLL.", ".yyyyyy3yLL.", ".yyyyy444444", ".yyyty4f4444", ".yyyyy444444", ".KQQQQQQ4414", ".QQM2zQQ4M04", "CQQQQQQ14444", "CQQQQQQQ4444", "CQQQQQQQ4444", "Cyyyyy44444T", "Cyyyyy444644", "Cyyyyy444444", "Cyyyyy444444", "Cyyyyy444444", "Cyyyyy444444", "Cayyyy444444", "Cyeyyy444444", "Cyyyey4444Q4", "Cyyyyy444444", "Cyyyyy441444", "Cyyyyy4444b4", "Cyyyyy444444", "Cyyyyyyyya66", "Cyyyyyyyy666", "CNnnnnnCTTEE" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case71() {
    String[] grid = { "..............................P...............", "................................qqqqqqqqqqq...", "................................qqqqqqqqqqq...", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ..", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ..", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ..", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQFQQQQQQQQQQ..", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ..", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ..", "QlQQQQQQQQQQQQTQQIQQQQQQQQQQQQQhQQQQQQQQQQQQVV", "pQdQQQQQQQQQQZQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQVV", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQVV", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQccccV", "QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQccccV", "QQQQQQRQQQQQQQlQQQQQQQQQQrrrrrrrrrrrQQQQ4ccccV", "QQQQQaQQQQQQQQQQQQQQQQQQQrrrrrrrrrrrQQQQQccccV", "QQQQfQQQQQQQQQQQQQQQQQQQQrrrJrrrrrrrQQQQQcccc5", "QQQQQQQQQQQQQQQQQQQQQQQQQrrrrrrrrrrrQQQQQcccc5", "IIImmmmmmmmmmmmmmmmmmmmmmrrrrrrrrrrrVVVVVcccc5", "IIImmmmmmmmmmmmmmwmmnmmmmrrrrrrPrrrrVVVVVcccc5", "IIImmmmmmmmmmmmmmmmmmmmmmrrrbrrrrrrrVVVVVcccc5", "IIImFFFFFFFFFmmmmmmmmmmmmmmmmmmVVVVVVVVVVccccV", "IIImFFFFFFFFFmmmmmmmmmmmmmmmmmmVVVVVVVVVVccccV", "IIImFFFFFFFFpmmmmmmmmmmmmmmmmmmVVVVVVVVVVdcccV", "IIImFFFFFFFFFmmmmmmmmmmmmmmmmmmVVVVVVVVVVccccV", "IIImFFFFFFFFFRRRRRRRRRRRRRRRRllllllRRRVVVccccV", "IIImFFFFFFkFFRRRRRRRRRRRRRRRRllllllRRRVVVccccV", "IIImFFFFFFFFFRRRRRRRRRRRRRRRRllllllRRRVVVVVVVV", "IIImFFFFFFFFFRRRRRRRRRRRRR6666666llRRRVVVVVVVV", "IIImFFFFFFFFFRRRRRRRRRRRRR66q6666llRRRVVVOVVVV", "IIIIFFFFFFFFFRRRRRRRRRRRRR6666666llRRRVVVVVVVV", "IIIIFFFFFFFFFRRRRRRRRRRRRR6666666llRRRVVVVVVVV", "....TJTTTRRRRRRRRRRRRRRRRR6666666RRRRRsssss...", "....TTTTTRRRRRRRRRRRRRRRRR6666666RRRRRsssss...", "........DDDDDDDDDDDDDDDDDh6666666hhhhhhhh.....", "..........N..............hhhhhSSSSSSSSSSS....." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case72() {
    String[] grid = { ".....................55.", "..A..................55.", ".QA..................55.", "..A..................55.", "..A..................55.", "..A.........SSSS.....55.", "..A.........SSSS.....55.", ".9A999999...SSSS.....55.", "yyAyy9999...SSSS.....55.", "yyAyy99991..SSSS7....55.", "yyAyy9999...SSSS.....55.", "2yAyyU999...SSSS.N...55.", "yyAyy.......SSSS.....55.", "yyAyy.......SSSS.....55.", "yyAyy.......SSSS.....55.", "yyAyy.......SSSS.....55.", "yyAyy.......SSSS.....55.", "yyAyy.......SSSS.....55V", "yyyyy.......SSSS.....55V", "yyyyy.......SSSS.9...55V", "yyyyy....F..SSSS.....55V", "yyyyy.......SSSS.I.....V", "............SSSS.......V", "............SSSS.......V", "............SSSS.......V", "............SSSS.......V", "............SSSS.......V", "............SSSS.......V", "............SSSS....Y..V", "............SSSST...Y..V", "............SSSS....Y..V", "............SSSS....Y..V", "............SSSS....Y..V", ".66666666t666666...LY...", ".666666666666666mmmLY...", ".666666666666zM6mmmLY...", ".666666666666666mmmL....", ".666666666666666mmmLpppp", ".666666666666666mmmLpppp", ".666666666666666mmmLpppp", "x666666666666666mmmLpppp", ".666666666666666mmmppppp", ".666666L66666666mmmppppp", ".666666666666666mmm.....", "...TTTttttttttttttt.....", "......ttttttttttttt....." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case73() {
    String[] grid = { ".............hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.", ".............hhhhhhhiiiiiiJiiiiii8iiiiiiiihhhh.", "J.........uuuuuuuquuviiiiiTiiiiiiiiiyiiiwihhhh.", "..........uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiwihhhh.", "..........uuuuuuuuuuiiiiiiiiiiiiiiiniiiiwihhhh.", "..........uuuuuuuuuuiiiiimiiiiiiiiiiiiiiwihhhh.", "..........uuuuuuuuuuiggggggggggggggggiiiwihhhh.", "..........uuuuuuuuuuiggggggggggggggggiiiwihhhh.", "b.........uuuuuuwuuppggggggggggggggggpppwppeee.", ".AAAAAAAAAAAAAAAAAAAnggggggggggggggggAAAwppOee.", ".AAAAAAAAAAAAAAAAAAAAngggggggggggggggAAAwppeeeS", ".AAAAAAAAAAAAAAAAzAAAggggggggggggggggAAAwppeeeS", ".AAAAAAAAAAAAAAAAAAAAggggggggggggggggAAAwiheeeS", ".AAAAAAAAAAAAAAAAAAAAggggggggggggggggAAAwiheee.", ".AAAAAAAAAAAAAAAAAAAAggggggggggggggggAAAwiheee.", ".AAAAAAAAAAAAAAAAAJAAggggggggggggggggAAAwiheee.", ".AAAAAAAAAAAAAAAAAAAAggggggggggggggggAAAwiLeee.", ".AAAAAAAAAAAAAAAAAAAAggggggggggqgggggAAAwiLeee.", ".AAA6AAAAAAAAAAAAAAAAggggggggggggggggAAAwiLeek.", ".AAAAAAAAAAAAAAAAAbAAAAAAAAfAAAAAAAAAAAAwiLeee.", ".AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwiLeee.", ".AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwiLeee.", ".AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwiaeee.", ".AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwaaeee.", ".AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwaa3ee.", ".AALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAVAAAwaaeeeD", ".AAAA4AAAAAAAAAAAAAAAAAAAAAA7AAAAAAAAAAAwaaeeeD", ".....4.cc....hPPPPPPPPDPPPPPPPrrrrrrlaaawaaeeeD", ".....4.cc...qqqqqqqPPPPPPPPPPPrrrrrrraHHwHHeeeD", ".....4.cc...qqqqqqqPPPPPPPPPPPrrrrrrraHHwHHeeeD", ".....4.cc...qqqqqqqPPPPPPPPPPPrrrrrrraHHoHHeeeD", ".....4.cc...qqqqqqqhhhhhhhhhhhrrrrrrraHHwHHeeeD", ".....4Pcc...qqqqqqqhhhhhhhhhhhrrrrrrraHHwHHeeeD", ".....4.cc...qqqqqqqhhhhhhhhhhhrrrrrrraHHwHHeeeD", ".....4.cc...qqqqqqqhhhhhhhhhhhrrrrrmraaaaaaeeeD", ".....4.cc...qqqqqqqhhhhhhhhhhhhhhhhLLaaaaaaeeeD", ".....4.cc...qqqqqqqhhhhhhhhhhhhhhhhLLaaaaaaeee.", ".....4.cc...qqqqqqqhhhhhhhhhhhhhhhhhhaaaaaaeee.", ".....4.cc...qqqqqqqhhhhhhhhhhhhhhhhhhaaaaaaeee.", ".....4.cc...qqqqqqqhhhhhhhhhhhhhhhhhhaaaaaaeee.", ".......cc...qqqqqqqhhhhhhhhhhhhhhhhhhaaaaaahhh.", ".......cc...qqqqqqqhhhhhhhhhhhhhhhhhhhhhhhhhhh.", ".......cUU..qqqqqqqhhhhhhhhhhhhhhhhhhhhhhhh5hh.", ".......cUU..qqqqqqq......................222...", "..e....cUU...............................222..." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case74() {
    String[] grid = { "...c......I.................L...............", "..p5............x...........................", "...................V..............b.........", "......y...c.......M.........................", "......y...............................p...N.", "......y999999999999999999999.......s........", "s.....y99999M999999C99999999................", ".....c.99999999999999999999S................", ".......999999999S9p9999D9999....T...........", ".Q.....999999999999999999999................", ".......999999999999999999399................", ".......999999999F99999999999......4........h", "B....................D......................", "..Y............R..................H......0..", ".......D..........MMMMMMMMMMM.............G.", "..................MMMMMMMCMMM......h........" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case75() {
    String[] grid = { "jyk.", "vfib", "mqii", "8qpi", "qqil", "qqii", "qqii", "qqii", "Dqii", "qqii", "EqwX", "qqwi", "qPwi", "Kow6", "qUw1", "qKoq", "qUqq", "qzzz", "GGY9" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case76() {
    String[] grid = { "..bbbbmmmmmmmrrrrmyyy", "..bbqqmmmmmmccrrrmyyy", "..bbqqmTmDDDccrrrmyyy", "..mbqooooDDDccrrroyyy", "..GbqooooDDDccrrllyyy", "..GAA00C0oooccrrllyyy", "..GAA0000zzaccrrllyyy", "...oAAYTYzzPccPPPPPPl", "...AAAYTYC0CPPPPPPPPl", "...AAAzTzCCCaaaelllll", ".....NNTNCCC55WWWWkkk", ".....NNTNNuaaaaeeekkk" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case77() {
    String[] grid = { ".....", ".....", "gggg.", "glgg.", "ggg6.", "gggg.", "gggg.", "gggg.", ".xx..", ".xx..", ".xxXX", "uuuXX", "uuuXX", "uuaaa", "uuaaa", "uuaaa", "uuaaa", "uEaaa", "uuaaa", "ZZaaa", "ZSSSS", "ZSSSS", "ZSSSS", "ZSSSS", "ZSSSS", "ZSVSS", "ZSSSS", "ZSSSS", "ZSSSS", "ZSSSS", ".SSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSShS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", "lSSSS", ".SSSS", ".SSSS" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case78() {
    String[] grid = { "..............................", "..................oooUUUUU....", ".....SSSSSSS.....noooUUUUU....", ".....SSSSSSS..KKKnoooUbbbbba.v", ".....SSSSSSHHHHHHHoooHbbXXXa..", ".....SSSSSSHHHHHHHoooHbbXXXa..", "...LLLLLLLSHHHHHHHoooHbbXXXa.5", "...LLLLLLLSHHHHHHHoooHbbbbba.5", "...LLLLLLLSHHHHHHHooolbbbbbgg5", "...LLLLLLLSHHHHHHHoooHbbbbbgg5", "...LLLzLLLSHHHxHHHoooHbbbbbgg5", "...LLLLLLLSHHHHHHHoooHbbbbbgg5", "...LLLLLLLSHHHHHHHoooHbbbbbgg5", "...LLLLLLLSHHHHHHHoooHbbbbbgg5", "...LLLLLLLQHHHHHHHoooHbbbbbgg5", "...LLLLLLLQHHHHHHHoooHbbbbbgg5", "...LLLLLLLQHHHHHHHHHHHbbbbbgg5", "...LLLLLLLQHHHHHHHHHHHbbbbbgg5", "...LLLLLLLQHHHHHHHHHHHb1111115", "cccLLLLLLLQHzzzzzzzzzzz1111115", "cccLLLLLLL3Hzzzzzzzzzzz1111115", "cccLLLLLLL3Hzzzzzzzzzzz1111115", "cccLLLLLLL3Hzzzzzzzzzzz1111115", "...LLLLLLL3Hzzzzzzzzzzz1111115", "..NLLLPPPPPPPPPPPPPPPPP1111115", "...LLBBBBBBBBBBBBBBBPPPPPPPPP5", "lllLLBBBBBBBBBBBBBBBPPPPPPPPP5", "...LLLPPPPPPPPPPPPPPPPPPPPPPP5", "...LLLPPPPPPPPPPPPPPPPPPPPPPP5", "...EddddddQQQQQAQQQQQQQQQ....5", "...EdddddddddddAddddd.4...TTT." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case79() {
    String[] grid = { "z..", "...", "..p", "...", "..d", "..y", "..y", "X.4", "X.y", "XCC", "XTC", "XCC", "XCC", "XCC", "XCC", "SCC", "dCC", "XCC", "XqC", "XCC", "XCC", "XCC", "XCC", "XCC", "XCC", "XCC", "XCC", "XLC", "XCC", "XCC", "X.x", "..3", "o.3", "o.3", "o.3", "o.3", "b..", "..." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case80() {
    String[] grid = { "............................", "..........g.................", "...................D........", ".....K........F....3........", ".I..........................", ".n..V.................a.....", "...Mn......................4", "............F...............", "...............ccccccxxxx...", "..F............ccccccxxxx...", ".I.H......3.........xxxxx...", "......D...AAAAAAAAAAxxxxA...", "..........AAAAAAAAAAxxxxx...", "..........AAAAAAAAAAxxxrx...", "..........AAAAAAAAAAxxxxx...", "............................", "..........Ekkkkkkkk.........", ".......f...Bkkkkkkk.........", "...........kkkkwkkk.....c..U" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case81() {
    String[] grid = { "......WWWWWWWW0WWWWWWWWWDDDDDDDDDDDgggD...2.O2..", "......WWWCCCCgCCCCCCCCCCJJJJJJ.....gBg..vvvvvvvv", "......WWWC4CCLLLLLLLLLLLLLjLLLLLLLLLL44444Ummvnv", "..PPPPPPVrrrrLLLLLLLLLULLLLLLLLLLLLLL44444wwwwnv", "..PPPPPPHVVVVLLLLLLLLLLGLLLLLLLLLLLgL44444wwwwnF", "..PPPPPPVVVViLLLLLLLLLLLLTLLLLLLLLLLL44444wwwZZ7", "..PPPPPPqqzvqqqppppppppyyyyyyyyyyyyyy44444RRop77" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case82() {
    String[] grid = { "...OOOOO.", "...OOOOO4", ".CCCCXCC4", ".CCCCxCV4", ".tCCCxCC4", "0zzzzzzC4", ".zzzzzzC4", ".zzzUzgCn", "jzzzzkzC4", "fzzzzzzC4", ".zzzmzww4", ".zzCzezD4", ".zzzzzzD4", "QzzzzzzD4", "QzzzzzzD4", "bbzzzzZD4", "bbzzzzzDH", "bb7zzzzDJ", "bbzzzzzDL", "bbzzzzzDH", "bbzzzzJuu", "pbzzzTzuu", "bbzzzJiMu", "bbzzzzzMu", "QzzzzzbMz", ".z4zzzzDo", ".zzzzzzHo", "CzzzzzzHN", ".XyWabHHN", ".yyyaB6zN", ".yyyFBRRN", ".taaasRRR" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case83() {
    String[] grid = { "..FFvvvvvvOvvvUfff..", "..Fnvvvvvvd6vvQuggzg", "IIIIvvvaXqvavvT111gg", "IIKCCCCvXvvvvvxgDggP", "VoyC6Cwww9999999zdwG", "VVVeCCRbw999999Onwww", "GGGCCCwwk99N99Y99www", "uvG8fEEEv99999999aaa" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case84() {
    String[] grid = { "..........................", "..........................", ".....aa....S..............", ".....aa....Sw.............", "..pUUUUUUUUSUUUUUU4444444.", ".ZZUUUUUUUUSUUUUUU4AAAAA4.", ".ZZUUUUdUUUSUUUUUU4AAABBBB", ".ZZUUUUUUUUSUUUUUU4AAABBBB", ".ZZUUUUUUUUSHHHHHHHHHHBBBB", ".ZZUUUUUUUUSHHHHHHHHHHBBBB", ".ZZUUUUUUUUSHHHHHHHHHHBBBB", ".ZZUUUUUUUUSHHHHHHHHHHBBBB", ".ZZZZaa....S7777HHHHHHBBBB", ".ZZ5Zaa....S7777HHHHgHBBBB", ".ZZZZaa....S7777HHHHHHBBBB", ".ZZZZaa.bbbS7777HHHHHHBBBB", ".ZZZZaa.bbbS7777644AAABBBB", ".ZZZZaa.bbbS7777644AAABBBB", ".ZZZZaLLLLLLLLLLKK4AAABBBB", ".ZZZZaLLLLLLLLLL044AAABBBB", ".ZZZZaLLLLLLLLLL644AAABBBB", ".ZZZZaLLLYYYYYYYYYYYYYIII6", ".ZZZZaLLLYYYYYYYYYYYYYIII6", ".ZZZZaLLLYYYYYYYYYYYYYIII6", ".ZZZZaLLLYYYYYYYYYYYYYIII6", ".ZZZZaa.bbbS..66644AIIIII6", ".ZZZZaanbbbSnn66644AIIIII6", ".lllllllbhblllll644AAAAA46", ".lllllllbzzzzzzzzzzzzzzzFF", ".lllllllbzzzzzzzzzzzzzzzFF", ".lllllllbbbllllln44AAAAAFF", ".lllllllbbbllllln44AAAAAFF", ".llllallbbbllllln44AAAAAFF", ".llllBllbbblllll000AAAAAFF", ".lllllllbbblllll000AAAAAFF", "...0000000000000000AAAAAFF", "RRRRRRRRRRRRRRRRRRRAAACAWW" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case85() {
    String[] grid = { "..DDDDDDD......................", "..DDDDGDD.......0..............", "..DDDDDDD......................", "666DDDDDD......................", "666DDDDDD......................", "666DDDDDD......................", "6z6DDDDDD..........d...uuuuluuu", "666DDDDDDAAAAAAAAAAAAAKBAAAAAuu", "..DDDDDDDlAAAAAAAAAAAAAAAAAAAuu", "..DDDDDDDAAAAAAAAAAAAAAAAAAAAuu", "88pDDDDDDAAAAAAAAAAAAAAAAAAAAuu", "88DDDDDDDAAAAAAAAAAAAAAAAAsAAuu", "88DDDDDDDAAAAAAAAlAAAAAAAAAAAuu", "88DDDDDDDAAAAAAAAAAAAAAAAAAAAuu", "88DDDD1DDAkAAAzAAAAAAAAAAAAAAuu", "88DDDDDDDAAAAAAAAAAAAAAAAAAAAiu", "88DDDDDDDAAAAAAAAAAAAAIAAAAApCu", "88DDDDDDDAAAAAAAAAAAAAAAAAAAACu", "88DDDDDDDAAAAAAAAAAAAAAAAAAAACu", "88DDDDDDDSSBBBBBBBBBBBBeCCCCCCu", "8PDDDTDsssssssssssssDssssssssss", "88DDDDDssssssssssssssssssssssss", "88DDDDDssssssssssssssssssssssss", "88DDDDDssssssssssssssssssssssss", "888q222sssssssssssssssfsssssssu", "888q888ssss5sssssssssssssssssss", "888q888sssssscsssslssssssssssss", "....zSSsssqs5ssssssssvssss61sss", "....zSSssssssssssssssssssssssss", "..jjjajjjjjjjjjjjjjjjjjjj.MM..5", ".....SSSSSSQQQQQQQQQQQQQQQQQQQ5" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case86() {
    String[] grid = { "..y.", "M.yt", ".ayt", "YYyt", "YYyt", "YYyt", "YYjt", "YYut", "WWWt", "WWWt", "YXpt", "YXyt", "YXdt", "YXdt", "YXut", "YXut", "YXut", "YXut", "YX3t", "6Xut", "YkZt", "Ykkt", "Ukkt", "UXqt", "39ut", "5Xut", "hXut", "UXut", "Usut", "Ysut", "Usut", "UFut", "UFut", "UFut", "UFut", "8Fut", "8Fut", "8odT", "8FdT", "8Fdt", "8Fdt", "gppt", "gppt", "gpph", "gppt", "rppt", "Ppp8", "Mpp8", "8RR8", "8RR8" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case87() {
    String[] grid = { "49F2l22NNrrpNNN8NNLq6v8zeeeeeeeO" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case88() {
    String[] grid = { "............hhhhhhhh8888888s888888888888888..", "........YYYYYYYWWWWWWWWWWWWWWWWWWWWWWW88888A.", "........YYYYYYYWWWWWWWWWWWWpppppppppWW88888A.", "...........BBBBBBBBBBBBBBWWpppppppppWW8V888A.", "...........BBBBBBBBBBBBBB..pppppp3ppe......A.", ".nKKKKKKKKKBBBBBBBBBBBBBB..pppppppppe......A.", "..KKKKKKKKKBBBBBBBBBBBBBB..pppppppppe......A.", "xxKKKKKKlllBcBBBBBBBBBBBB.......77eee......A.", "xxKKKKKKlllBBBBBBBBBBBBBB.......77eee......A.", "xxKKKKKKlllBBBBBBBBBBBBBBvvvvvv111111111XXXX.", "xxKKKKKwwwwBBBBBBBBBBBBBBvvvvvv111111111XXXXn", "xxKKKKKKKKKBBBBBBBBBBBBBBvvvvvv111111111XXXXn", "xxKKK1KKKKKBBBBBBBBBBBBBBvvvvvv111111111XXXXn", "xxKKKKKKKKKBBBBBBBBBBBBBBvvvvvv111111111nnnnn", "xxKKKKKKKKKBBBBBBBBBBBBBBvvvvvv111111114nnnnn", "xxKKKKKKKKKBBBBBBBBBBBBBBvvvvvv111ttttttttnnn", "xxKKGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGn", "xxKKGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGn", "xxKKGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGg", "xxxxGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGg", "xTTTGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGg", "xxxxGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG.", "xxxxGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG.", "xxxxGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case89() {
    String[] grid = { ".fQR", ".DRR", "5DDR", "5VRR", "RFRR", "wVRR", "weRZ", "bVRR", "w8RG", "w8RR", "9tfR", "ttIR", "tlRR", "JJTR", "JJjR", "XERR", "ttRR", "otR9", "odRR", "odRR", "oXRR", "oZvR", "odtR", "dd2l", "ttUk", "tt6l", "tt2l", "ot2l", "xx2E", "Wt2E", "f62E", "QaaP" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case90() {
    String[] grid = { "h....RwmsmmmmmmmKKWGdGpLB.", ".....mmmmmmmMmmmKKxGG55555", "H.....rl.EKKGKKKK1c9c55555", ".z.1..........9..Nd..55555", "vs.V...zslllwlnNy..SSL0SSS" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case91() {
    String[] grid = { ".................K...............", "..VJbJJJJJJJJJJJJJJJJJJJJJJJJJ.7.", "..JJJJJJJJJJJJJJJJJJJJJ9JJJJJJbb.", "..JJJJJJJJJJJJJJJJJgpJJJJJJJJJbb.", "ssJJJJJJJJJJJJJJJJJJJJJJJJJJJJIb.", "0sJJJJJJJJJJJJJJJJJJJJJJJJJJJJIb.", "ssJJJJJJJJJmJJJJJJJJJJJJJJJJJJIb.", "ssJJJJJJJJJJJJJJUJJJJJJJJJJJJJIb.", "ssJJJJJJJJJJJJJJJJJJyJJJJJJJJJIb.", "ssJJJJJJJJJJJJJJJJJJJJJJJJJJJJIt.", "ssJbJJJJJJJJJJJJJJJJJJJJJJJJJJIb.", "ssJJJJJJJJJJJJ7JJJJJJGJJJJJJJJIQ.", "ssUJFJJJJJJJJJJJJJJJJJJJJJJJJJIb.", "slJJJJJJJJJJJJJLJAJJJJJJJbJJJJIb.", "slJJJJJJJJJJJJJJJJJJJJJJJJJJJJIb.", "slHJJJJJJJJJJJJJJJJJJJJJJJJJJJI2v", "slJJJJJJJJJcJJJJJJJJJJJJJJJqJJR2y", "slJJJJJJJJJJJJJJJJDJJ0JJJJuJJJR2v", "slJJJJJJJJJJJJJJJJJJJJJJJJJJJJR2v", "slJJJJJJJJJJJJJJJYJJJJJJJhJJJJR2v", "ssJJJJJJJJJJJJJJJJJJJJJJJJJJJJR2.", "..JJJJJJJJJJJJJJJJJJJJJJJJJJJJR2.", "XXX77777ZZZZZZZZZZZWWIIIIRRRRRR2.", "XXX7777776HH3333WWWKWIRIIRRRRRR2.", "XXX777777TTT3333WWOOOOOOORRRRRRP.", "TTT777777TTT3333WWWWWIIIIRRRRR7..", "TTT777777TTT3333IIIIIIIIIRRRNRR..", "TTT777777yyyyyyyyyyyyKdddRRRRRRc.", "......KKKK111CCCCCCCCCCsCRRRRRR.." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case92() {
    String[] grid = { ".......9.......5555555555................J....ott", ".K.........W.zzzzz0555555..........mmmmww...rrrEr", "...vUUUUUUUUVzzzzz0555555qCCCCCCCCImmm7CCCNCCCCCm", "..f.UUuuuuuyuuuuuuuVuuuuu1WCCCCCC0CmmmmCCCCCCCCCC", "...XUUuuuuuuAuWubuuuuuuEEFFFFFFFFEEmmmmEEE22EEERE", "....UUuuKuuuuuuuuTuuuuuEEFFuFFFFFE8mmmmEEEYYYYYEE", "WWWWWWuoKKKK7KuuuuuuuuuEEBBBBBBEEEEmmmZEEEEEEEEEE" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case93() {
    String[] grid = { ".................................................", "...........................33333333333333333.....", ".....oooooooommoooooooooooo3333333RRRRRRRRRRRyoo.", ".....ooooooo7mm7777ff000000000eeeeRRRRRRRRRRRyIoN", "..APPPPPPPPPPmmPPPPPP000000000eemeRRRRJRRRRRRyIoN", "..APPPPPPPPPPmmPPPPPP000000000eeeeRRRRJRRRRRRyIxN", "..APPPPPPPPPPmmPPPPPP000000000eeeeRRRRJRRRRRRyIxN", "..APPPPPPPPPKKKKKKKKKKKKK00000eeeeRRRRJRRRRRRyIxN", "..APPPPPPPPPKKKKKKKKWKKKKPPPPeeeeeRRRRJRRRRRRywww", "44A444444444KKKKKKKKKKKKK4444epppppppppppppppppww", "..ALLLLLLLLLKKKKKKKKKKKKK111111PPPRRRRRRRRRRRy..N", "..ALLLLLLLLLKKKKKKKKKKKKKLLLLLLPuPRRRRRRiRRRRR..N", "..ALLLLLLLLLKKKKKKKKKKKKKLLLLLLPPPRRRRRRiRRRRR..N", "....22222222KKKKKKKKKKKKK222222222RRRRRRiRRRRRlll" };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case94() {
    String[] grid = { "IIIIIIIIIIII....n.....", "IIIIIIIIIIII..........", "IIIIIIII4444444444b444", "IIIIIIII44444444444444", "IIvIIIII44444444WWCWW4", "......FFFFFkkkkkkWWWW4", "........444kk4kkkWWiW4", "........444444d4WWWWW4", "..1.....44c44444WWcWW4", "........44444444WyWWR4", ".......q..........H8.." };
    assertEquals("ERROR!", topview.findOrder(grid));
  }

  @Test
  public void case95() {
    String[] grid = { "bbb666", ".655X5", "a65AA5", "a65AA5", "a65555" };
    assertEquals("65AXab", topview.findOrder(grid));
  }

  @Test
  public void case96() {
    String[] grid = { "..AA..", ".CAAC.", ".CAAC." };
    assertEquals("CA", topview.findOrder(grid));
  }

  @Test
  public void case97() {
    String[] grid = { 
        "A000666444bbbggghikj", 
        "A0106264a4cccfffhikj", 
        "A000666444dddeeehikj" };
    assertEquals("01462Aabcdefghijk", topview.findOrder(grid));
  }

}
