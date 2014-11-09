package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class LittleElephantAndDoubleTest {
  LittleElephantAndDouble littleelephantanddouble = new LittleElephantAndDouble();

  @Test
  public void case1() {
    int[] A = { 1, 2 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case2() {
    int[] A = { 1, 2, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case3() {
    int[] A = { 4, 8, 2, 1, 16 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case4() {
    int[] A = { 94, 752, 94, 376, 1504 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case5() {
    int[] A = { 148, 298, 1184 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case6() {
    int[] A = { 7, 7, 7, 7 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case7() {
    int[] A = { 169, 208, 674, 775, 224, 27, 301, 904, 894, 711, 146, 668, 628, 996, 445, 316, 412, 454, 747, 32, 483, 281, 86, 411, 414, 618, 176, 909, 775, 191, 821, 749, 690, 59, 271, 956, 940, 849, 877, 949, 862, 543, 664, 357, 683, 177, 629, 685, 881 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case8() {
    int[] A = { 922, 232, 352, 288, 360, 756, 451, 591, 939, 802, 586, 607, 567, 62, 342, 828, 947, 882, 453, 987, 276, 209, 528, 610, 726, 469, 559, 150, 77, 196, 89, 667, 120, 595, 392, 25, 445, 278, 413, 859, 857, 648, 833, 55, 882, 724, 734, 250 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case9() {
    int[] A = { 221, 411, 721, 184, 842, 705, 896, 89, 973, 828, 952, 432, 815, 233, 906, 174, 290, 88, 422, 623, 550, 77, 516, 708, 946, 852, 678, 632, 177, 554, 751, 428, 118, 867, 841, 258, 575, 433, 69, 632, 791, 618, 52, 167, 499, 879, 14 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case10() {
    int[] A = { 558017747, 707412184, 571476824, 27885972, 347137128, 534455142, 266330082, 381698014, 939365541, 506551897, 225052521, 672800684, 64370521, 756181857, 592652322, 228887401, 599530996, 111233973, 330484393, 490574767, 309080152, 39589626, 763859303, 515779418, 857884239, 413041773, 131315151, 512215539, 928427585, 94435842, 33406756, 609835791, 487402355, 166452913, 499376588, 897716502, 326057450, 61190422, 970933314, 569598840, 513628820, 813343928, 217617307, 25607210, 543256089, 157579238, 279363811, 687651296, 615413851, 921335291 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case11() {
    int[] A = { 485733031, 321108188, 289230283, 558124989, 271795035, 15342330, 492490450, 853230172, 988329333, 834020122, 76680589, 957322201, 231687729, 795929131, 819202476, 810071694, 37304324, 102771308, 36319562, 510973082, 517179499, 1850893, 808514737, 168086572, 28355615, 938323374, 14878990, 791958970, 331414577, 346383428, 890140735, 945689900, 708456937, 200651620, 735006519, 272452259, 698355059, 150734157, 417040611, 552583279, 527297632, 598954953, 522308729, 375418297, 898163755, 101228547, 773449184, 879711436, 291556791 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case12() {
    int[] A = { 231987845, 435802950, 835043526, 777440412, 540286815, 764987387, 280980497, 828479408, 481822147, 693813646, 220103874, 314561220, 180477412, 981032504, 226336159, 219397214, 209274504, 297801148, 439967621, 962303520, 679275683, 463091877, 840379623, 730730737, 467401245, 634502017, 937915245, 134688704, 446718122, 231110892, 97745168, 839313964, 752071707, 717548176, 217531001, 500786492, 480899800, 960638037, 942044370, 189118636, 91082269, 977893057, 397743584, 336104743, 715722704, 609896403, 903224775, 531334353 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case13() {
    int[] A = { 169884146, 730277703, 8645016, 732791141, 331583052, 25104065, 895622218, 478600214, 924154067, 813310590, 389843997, 977252329, 338578814, 512086554, 953548504, 508435813, 602216502, 773835133, 194230149, 661387945, 354427757, 690709868, 320153566, 468158534, 287696464, 210587004, 734620117, 534953438, 709154008, 123773340, 158880245, 336766149, 165968720, 167637128, 947182489, 162048595, 449945322, 743190739, 426987749, 783219375, 443513281, 903494440, 853812390, 851061819, 772823670, 651380762, 603104316 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case14() {
    int[] A = { 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case15() {
    int[] A = { 3, 3, 1, 2, 3, 3, 1, 3, 2, 1, 3, 1, 1, 2, 2, 3, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2, 2, 3, 1, 3, 3, 3, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 2, 3, 1, 3, 2, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case16() {
    int[] A = { 319232, 1276928, 319232, 653787136, 40861696, 1276928, 19952, 81723392, 326893568, 79808, 159616, 10215424, 9976, 2553856, 159616, 10215424, 2494, 10215424, 20430848, 4988, 159616, 163446784, 9976, 10215424, 79808, 40861696, 40861696, 10215424, 79808, 1276928, 653787136, 39904, 81723392, 10215424, 9976, 5107712, 653787136, 653787136, 79808, 10215424, 39904, 39904, 2553856, 19952, 159616, 2553856, 159616, 653787136, 653787136, 81723392 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case17() {
    int[] A = { 500224, 31264, 62528, 512229376, 512229376, 8003584, 32014336, 250112, 1954, 250112, 500224, 64028672, 2000896, 256114688, 16007168, 32014336, 7816, 16007168, 64028672, 15632, 2000896, 31264, 3908, 2000896, 128057344, 32014336, 16007168, 256114688, 7816, 256114688, 32014336, 3908, 7816, 2000896, 7816, 4001792, 977, 1000448, 977, 250112, 31264, 3908, 256114688, 256114688, 128057344, 1954, 977, 250112, 64028672, 8003584 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case18() {
    int[] A = { 33900, 34713600, 69427200, 17356800, 271200, 34713600, 135600, 1084800, 271200, 8475, 34713600, 33900, 4339200, 1084800, 4339200, 34713600, 1084800, 17356800, 16950, 34713600, 4339200, 69427200, 17356800, 271200, 16950, 277708800, 2169600, 1084800, 271200, 8475, 1084800, 1084800, 16950, 8678400, 17356800, 67800, 1084800, 17356800, 1084800, 4339200, 138854400, 67800, 135600, 8678400, 8678400, 69427200, 1084800, 1084800, 8678400, 1084800 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case19() {
    int[] A = { 13360, 54722560, 109445120, 13680640, 1710080, 6680, 875560960, 6840320, 109445120, 26720, 109445120, 6680, 13680640, 13680640, 26720, 6840320, 437780480, 427520, 27361280, 13680640, 3420160, 106880, 427520, 26720, 106880, 1710080, 218890240, 6840320, 106880, 27361280, 13680640, 109445120, 1710080, 109445120, 109445120, 13360, 437780480, 13680640, 1710080, 53440, 13680640, 213760, 26720, 1710080, 53440, 26720, 54722560, 6680, 54722560, 13360 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case20() {
    int[] A = { 89325568, 89325568, 714604544, 5582848, 1395712, 11165696, 21808, 43616, 5452, 714604544, 174464, 1395712, 89325568, 87232, 348928, 714604544, 5452, 178651136, 22331392, 5582848, 44662784, 2791424, 2791424, 2791424, 5582848, 348928, 1395712, 178651136, 5452, 43616, 89325568, 5452, 357302272, 348928, 11165696, 5452, 87232, 22331392, 10904, 714604544, 43616, 22331392, 2791424, 174464, 44662784, 43616, 44662784, 89325568, 10904, 714604544 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case21() {
    int[] A = { 7936, 32505856, 1984, 65011712, 253952, 65011712, 3968, 507904, 65011712, 4063232, 65011712, 4063232, 260046848, 1015808, 7936, 507904, 260046848, 32505856, 65011712, 63488, 62, 15872, 130023424, 124, 1015808, 253952, 520093696, 65011712, 124, 32505856, 248, 253952, 130023424, 520093696, 3968, 16252928, 15872, 520093696, 253952, 507904, 507904, 507904, 126976, 1015808, 496, 65011712, 65011712, 15872, 126976, 8126464 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case22() {
    int[] A = { 679477248, 82944, 20736, 81, 84934656, 84934656, 162, 169869312, 82944, 21233664, 20736, 1296, 679477248, 5308416, 324, 81, 679477248, 41472, 82944, 2592, 20736, 169869312, 10616832, 165888, 331776, 1327104, 663552, 20736, 339738624, 679477248, 5308416, 331776, 81, 339738624, 324, 5184, 663552, 648, 162, 81, 324, 162, 41472, 339738624, 648, 339738624, 10368, 169869312, 42467328, 339738624 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case23() {
    int[] A = { 253633508, 253633508, 126816754, 63408377, 63408377, 126816754, 126816754, 253633508, 63408377, 126816754, 507267016, 63408377, 63408377, 63408377, 253633508, 126816754, 507267016, 63408377, 253633508, 63408377, 126816754, 253633508, 253633508, 507267016, 507267016, 253633508, 507267016, 63408377, 253633508, 63408377, 126816754, 507267016, 253633508, 507267016, 126816754, 126816754, 253633508, 63408377, 126816754, 507267016, 507267016, 126816754, 63408377, 126816754, 253633508, 253633508, 126816754, 63408377, 126816754, 507267016 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case24() {
    int[] A = { 120286960, 962295680, 60143480, 240573920, 60143480, 60143480, 962295680, 962295680, 962295680, 240573920, 60143480, 962295680, 240573920, 481147840, 481147840, 240573920, 240573920, 60143480, 60143480, 481147840, 120286960, 240573920, 120286960, 962295680, 240573920, 962295680, 120286960, 60143480, 481147840, 60143480, 240573920, 240573920, 120286960, 120286960, 962295680, 962295680, 120286960, 60143480, 962295680, 481147840, 240573920, 481147840, 962295680, 60143480, 240573920, 962295680, 60143480, 60143480, 481147840, 240573920 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case25() {
    int[] A = { 950348672, 29698396, 59396792, 475174336, 118793584, 950348672, 475174336, 950348672, 475174336, 237587168, 118793584, 475174336, 59396792, 59396792, 29698396, 475174336, 475174336, 950348672, 237587168, 29698396, 237587168, 118793584, 237587168, 59396792, 950348672, 118793584, 59396792, 118793584, 59396792, 950348672, 118793584, 237587168, 59396792, 950348672, 29698396, 950348672, 237587168, 950348672, 475174336, 237587168, 950348672, 237587168, 950348672, 118793584, 118793584, 475174336, 237587168, 29698396, 950348672, 59396792 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case26() {
    int[] A = { 292347324, 292347324, 146173662, 584694648, 146173662, 292347324, 73086831, 292347324, 584694648, 73086831, 584694648, 73086831, 584694648, 292347324, 292347324, 584694648, 146173662, 584694648, 146173662, 146173662, 146173662, 292347324, 292347324, 292347324, 292347324, 584694648, 146173662, 146173662, 73086831, 73086831, 584694648, 73086831, 292347324, 292347324, 73086831, 146173662, 146173662, 73086831, 146173662, 584694648, 146173662, 292347324, 292347324, 73086831, 146173662, 292347324, 146173662, 73086831, 146173662, 584694648 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case27() {
    int[] A = { 593877072, 74234634, 593877072, 148469268, 148469268, 37117317, 296938536, 74234634, 593877072, 593877072, 148469268, 37117317, 74234634, 296938536, 74234634, 74234634, 593877072, 593877072, 593877072, 37117317, 593877072, 296938536, 37117317, 74234634, 74234634, 593877072, 296938536, 593877072, 37117317, 593877072, 37117317, 37117317, 37117317, 296938536, 148469268, 148469268, 148469268, 593877072, 296938536, 37117317, 37117317, 296938536, 37117317, 296938536, 37117317, 74234634, 37117317, 593877072, 37117317, 296938536 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case28() {
    int[] A = { 311240, 79677440, 19919360, 311240, 77810, 1244960, 26273160, 19919360, 318709760, 2489920, 311240, 318709760, 4979840, 318709760, 77810, 4979840, 77810, 318709760, 19919360, 622480, 79677440, 9959680, 318709760, 622480, 311240, 989740848, 1244960, 19919360, 159354880, 318709760, 617705613, 77810, 610553313, 2489920, 318709760, 721712281, 77810, 155620, 9959680, 4979840, 499587549, 79677440, 88602392, 793312563, 9959680, 591844652, 9959680, 9959680, 4979840, 4979840 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case29() {
    int[] A = { 926941184, 113152, 7241728, 28288, 905216, 14144, 452608, 113152, 226304, 737498881, 7241728, 14144, 463470592, 452608, 905216, 115867648, 14144, 28288, 463470592, 57933824, 28966912, 226304, 28288, 231735296, 226304, 115867648, 14144, 452608, 56576, 730761243, 7241728, 3620864, 56576, 1810432, 463470592, 226304, 231735296, 28966912, 905216, 452608, 14144, 226304, 115867648, 1810432, 463470592, 28966912, 452608, 7241728, 639835110, 57933824 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case30() {
    int[] A = { 341272, 147513985, 514021517, 85318, 85318, 124060200, 1365088, 21841408, 174731264, 85318, 349462528, 85318, 115051724, 440174176, 349462528, 682544, 10920704, 10920704, 341272, 698925056, 87365632, 698925056, 43682816, 705608580, 1365088, 87365632, 682544, 341272, 174731264, 43682816, 87365632, 682544, 21841408, 82564246, 5460352, 10920704, 87365632, 309844951, 2730176, 174731264, 958127097, 26909600, 349462528, 85318, 698925056, 349462528, 87365632, 341272, 43682816, 349462528 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case31() {
    int[] A = { 174358528, 5448704, 43589632, 340544, 85136, 87179264, 708341923, 85136, 388847213, 21794816, 728059892, 135110813, 340544, 85136, 87179264, 207608690, 43589632, 10897408, 10897408, 170272, 1362176, 174358528, 348717056, 348717056, 174358528, 348717056, 340544, 21794816, 340544, 87179264, 340544, 681088, 373159182, 10897408, 681088, 43589632, 170272, 2724352, 21794816, 1362176, 174358528, 697434112, 340544, 174358528, 450553090, 5448704, 85136, 174358528, 340544, 10897408 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case32() {
    int[] A = { 743383040, 90745, 2903840, 5807680, 362980, 5807680, 11615360, 181490, 11615360, 362980, 46461440, 266374226, 2903840, 1451920, 1451920, 23230720, 23230720, 46461440, 371691520, 759815523, 181490, 185845760, 5807680, 11615360, 627731298, 725960, 737947250, 46461440, 2903840, 371691520, 743383040, 569189299, 90745, 725960, 362980, 1451920, 725960, 46461440, 428617315, 743383040, 743383040, 725960, 185845760, 742196800, 46461440, 1451920, 743383040, 1451920, 92922880, 1451920 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case33() {
    int[] A = { 1, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case34() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case35() {
    int[] A = { 7, 1, 1, 1, 1, 1, 1 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case36() {
    int[] A = { 2, 2, 2 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case37() {
    int[] A = { 500000000, 1000000000 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case38() {
    int[] A = { 883, 153, 222, 893, 234, 428, 651, 866, 390, 619, 830, 77, 98, 658, 147, 734, 267, 510, 202, 985, 88, 108, 100, 993, 439, 199, 891, 125, 540, 120, 4, 326, 230, 256, 840, 770, 826, 336, 362, 292, 294, 343, 258, 931, 383, 976, 326, 641, 532, 455 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case39() {
    int[] A = { 6, 2 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case40() {
    int[] A = { 3, 9 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case41() {
    int[] A = { 4, 8, 2, 1, 16, 128 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case42() {
    int[] A = { 1, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case43() {
    int[] A = { 5, 2 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case44() {
    int[] A = { 1, 2, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case45() {
    int[] A = { 2, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case46() {
    int[] A = { 2, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case47() {
    int[] A = { 1, 3, 6, 9 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case48() {
    int[] A = { 2, 12 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case49() {
    int[] A = { 1, 5 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case50() {
    int[] A = { 3, 6, 9 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case51() {
    int[] A = { 9, 3, 1 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case52() {
    int[] A = { 1, 3, 9 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case53() {
    int[] A = { 2, 24 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case54() {
    int[] A = { 1, 1, 7 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case55() {
    int[] A = { 3, 9, 18 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case56() {
    int[] A = { 9, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case57() {
    int[] A = { 805306368, 805306368, 805306368 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case58() {
    int[] A = { 1, 3, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case59() {
    int[] A = { 7, 21 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case60() {
    int[] A = { 40, 4 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case61() {
    int[] A = { 6, 18 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case62() {
    int[] A = { 3, 30 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case63() {
    int[] A = { 17, 2 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case64() {
    int[] A = { 5, 25 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case65() {
    int[] A = { 2, 5 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case66() {
    int[] A = { 4, 12 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case67() {
    int[] A = { 21, 7 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case68() {
    int[] A = { 6, 4 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case69() {
    int[] A = { 94, 282 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case70() {
    int[] A = { 6, 12, 60 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case71() {
    int[] A = { 2, 4, 8 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case72() {
    int[] A = { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case73() {
    int[] A = { 5, 35 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case74() {
    int[] A = { 1, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case75() {
    int[] A = { 1, 1 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case76() {
    int[] A = { 4, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case77() {
    int[] A = { 18, 3, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case78() {
    int[] A = { 3, 6, 18 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case79() {
    int[] A = { 4, 8, 2, 1, 16 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case80() {
    int[] A = { 2, 4, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case81() {
    int[] A = { 2, 20 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case82() {
    int[] A = { 1, 1000000000, 1000000000, 1000000000 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case83() {
    int[] A = { 3, 15 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case84() {
    int[] A = { 18, 36, 12 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case85() {
    int[] A = { 3, 2, 4 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case86() {
    int[] A = { 148, 298, 1184 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case87() {
    int[] A = { 3, 18 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case88() {
    int[] A = { 5, 15 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case89() {
    int[] A = { 1, 2, 536870912 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case90() {
    int[] A = { 3, 5, 15 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case91() {
    int[] A = { 1, 4 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case92() {
    int[] A = { 1, 6, 36 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case93() {
    int[] A = { 4, 24 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case94() {
    int[] A = { 12, 2 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case95() {
    int[] A = { 3, 3, 9 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case96() {
    int[] A = { 5, 30, 60 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case97() {
    int[] A = { 1, 2, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case98() {
    int[] A = { 11, 5 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case99() {
    int[] A = { 1, 7, 14 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case100() {
    int[] A = { 12, 4 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case101() {
    int[] A = { 5, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case102() {
    int[] A = { 3, 4, 8 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case103() {
    int[] A = { 6, 1 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case104() {
    int[] A = { 10, 60 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case105() {
    int[] A = { 1, 2, 12, 72 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case106() {
    int[] A = { 4, 20 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case107() {
    int[] A = { 2, 8 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case108() {
    int[] A = { 1, 2 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case109() {
    int[] A = { 999999733, 999999733 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case110() {
    int[] A = { 4, 1 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case111() {
    int[] A = { 33, 4 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case112() {
    int[] A = { 2, 20, 28 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case113() {
    int[] A = { 2, 10 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case114() {
    int[] A = { 1, 23 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case115() {
    int[] A = { 1 };
    assertEquals("YES", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case116() {
    int[] A = { 1, 1, 3 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case117() {
    int[] A = { 5, 30 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case118() {
    int[] A = { 3, 2 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case119() {
    int[] A = { 1, 1, 2, 5, 10 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case120() {
    int[] A = { 13, 78 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

  @Test
  public void case121() {
    int[] A = { 1, 2, 3, 6 };
    assertEquals("NO", littleelephantanddouble.getAnswer(A));
  }

}
