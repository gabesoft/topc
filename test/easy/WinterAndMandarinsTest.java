package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class WinterAndMandarinsTest {
  WinterAndMandarins winterandmandarins = new WinterAndMandarins();

  @Test
  public void case1() {
    int[] bags = { 10, 20, 30 };
    int K = 2;
    assertEquals(10, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case2() {
    int[] bags = { 4, 7, 4 };
    int K = 3;
    assertEquals(3, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case3() {
    int[] bags = { 4, 1, 2, 3 };
    int K = 3;
    assertEquals(2, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case4() {
    int[] bags = { 5, 4, 6, 1, 9, 4, 2, 7, 5, 6 };
    int K = 4;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case5() {
    int[] bags = { 47, 1000000000, 1, 74 };
    int K = 2;
    assertEquals(27, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case6() {
    int[] bags = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case7() {
    int[] bags = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 1025 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case8() {
    int[] bags = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case9() {
    int[] bags = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    int K = 3;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case10() {
    int[] bags = { 25, 28, 17, 28, 35, 78, 3, 51, 94, 85, 92, 64, 74, 76, 61, 36, 61, 95, 17, 42, 78, 74, 97, 26, 81, 90, 8, 43, 93, 98, 40, 53, 95, 55, 94, 94, 55, 56, 19, 16, 35, 29 };
    int K = 33;
    assertEquals(69, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case11() {
    int[] bags = { 45, 79, 21, 44, 52, 4, 68, 57, 15, 61, 50, 80, 72, 62, 84, 86, 75, 84, 21, 78, 77, 27, 80, 86, 96, 90, 66, 53, 64, 23, 80, 86, 59, 20, 33, 46, 14, 30 };
    int K = 14;
    assertEquals(18, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case12() {
    int[] bags = { 33, 56, 95, 33, 38, 84, 81, 31, 59, 65, 97, 69, 63, 47, 2, 44, 35, 81, 37, 35, 90, 39, 82, 2, 29, 52, 73, 39, 38, 90, 95, 72, 96, 17, 61, 25, 99, 39, 83, 79, 21, 79 };
    int K = 34;
    assertEquals(64, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case13() {
    int[] bags = { 8, 65, 16, 22, 51, 42, 41, 47, 32, 6, 54, 61, 55, 13, 35, 79, 99 };
    int K = 13;
    assertEquals(49, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case14() {
    int[] bags = { 48, 33, 55, 82, 24, 34, 50 };
    int K = 3;
    assertEquals(7, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case15() {
    int[] bags = { 2013, 1038, 2029, 8304, 4184, 489, 9556, 8824, 7229, 2726, 5191, 3105, 1408, 3211, 513, 7331 };
    int K = 10;
    assertEquals(3695, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case16() {
    int[] bags = { 9000, 8731, 9161, 1433, 6083, 130, 6689, 9159, 3824, 3282, 9642, 5971, 2535, 1889, 5910, 2673, 5919, 9927, 3784, 6217, 8565, 5384, 120, 5341, 3530, 153, 8369 };
    int K = 20;
    assertEquals(6626, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case17() {
    int[] bags = { 4990, 6487, 5691, 8018, 7413, 1477, 7886 };
    int K = 4;
    assertEquals(1531, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case18() {
    int[] bags = { 3713, 5515, 3009, 9802, 6555, 5190, 5253, 69, 7053, 8186, 5233, 8741, 3100, 3398, 8440, 7477, 8016, 8963, 5931, 7942, 8424, 4178, 1516, 1554, 2759, 3585, 676, 3580, 236, 5292, 7659, 1651, 5745, 9043, 3332, 9884, 2882, 4393, 1731, 721, 5609, 7924, 6382, 5130, 1386, 3530, 3304, 819 };
    int K = 40;
    assertEquals(7527, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case19() {
    int[] bags = { 2826, 9883, 341 };
    int K = 2;
    assertEquals(2485, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case20() {
    int[] bags = { 534232950, 249044986, 323017199, 832933284, 402012108, 668058896, 732220024, 168772880, 592913082, 920247582, 7169304, 730432311, 277130704, 631956152, 97308152, 717949801, 185089281, 851473617, 808657103, 835561494, 832337302, 487898980, 195896934, 141457635, 638342790, 14073495, 568989971, 845693621, 65161974, 500651828, 245225870, 835505816, 73415642, 704061056, 258327853, 729763160, 895495253, 230872838, 541829690, 816375411, 122854678, 344918388, 971143530, 155679024, 198784444, 580294984, 504352578, 744041155, 28681477, 498738629 };
    int K = 7;
    assertEquals(35098206, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case21() {
    int[] bags = { 980496829, 479407482, 822146694, 813645221, 103873315, 561219181, 477411982, 32503227, 336158220, 397213210, 274503298, 801147440, 967620963, 303519680, 275682464, 91876841, 379622731, 730736468, 401244635, 502016938, 915244135, 688703447, 718121232, 110891098, 745167840, 313963753, 71706718, 548175218, 531000501, 786491481, 899799961, 638036943, 44369190, 118635092, 82268978, 893056398, 743583337, 104742716, 722703610, 896402904, 224774532, 334352170, 884145731, 277702009, 645015733, 791140332, 583051026, 104064896, 622217479, 600213925 };
    int K = 32;
    assertEquals(547643396, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case22() {
    int[] bags = { 540668134, 105893899, 439969773, 523283386, 788135121, 865539536, 485035085, 358126023, 165017739, 351321943, 301486614, 879443545, 277566908, 98673202, 535654682, 585332877, 964632106, 870037347, 201165350, 534377092, 540071238, 733391589, 802443368, 661481660, 687191677, 371279472, 824881621, 485944500, 453217432, 907384270, 877487833, 193744436, 132809035, 944398539, 123898511, 618187729, 236696514, 807616032, 43158955, 574467753, 688919806, 29602293, 673605218, 115326682, 586946629, 816878980, 58269718, 516449962, 556075080, 568537076 };
    int K = 33;
    assertEquals(524662333, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case23() {
    int[] bags = { 304985801, 977447593, 322319731, 437808813, 749193621, 720053578, 443386446, 924424254, 234023721, 776175680, 85742566, 882852768, 335694460, 692956179, 372691005, 563646764, 914750056, 886981561, 604786404, 410043611, 568676790, 451028671, 774622966, 640696292, 264708242, 3617981, 298974776, 391296115, 986974826, 825619372, 320689940, 113482492, 439495217, 725180758, 429184482, 284673159, 542664615, 46675812, 511907635, 457265630, 653216350, 56506534, 266062006, 205610495, 26640727, 685100214, 843508706, 356302994, 793930252, 183374672 };
    int K = 30;
    assertEquals(484485379, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case24() {
    int[] bags = { 461282578, 842065057, 72444051, 662631756, 548998128, 792182980, 900642536, 197849199, 796956475, 486514989, 734577514, 379653403, 498042616, 610504871, 817280120, 103232282, 875626475, 370543739, 56826813, 662430206, 105801383, 845723892, 622138567, 893576958, 700259304, 761525954, 553668522, 26896259, 866167126, 249270050, 81001736, 695066237, 752566679, 645580045, 228651000, 387151999, 523107389, 596931192, 246808951, 468673318, 313427734, 655360957, 332996356, 147179966, 223709770, 569935819, 961845347, 415217549, 385231321, 8528872 };
    int K = 21;
    assertEquals(303711344, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case25() {
    int[] bags = { 632227085, 743444606, 537219089, 809167866, 980546765, 18849465, 92912440, 977667940, 454698683, 675868244, 566264925, 296622566, 295744350, 213373306, 451285602, 892738427, 763029400, 222949485, 634283379, 375914918, 625228616, 596268907, 406635419, 844732433, 512495069, 541919233, 229175100, 898018069, 455086055 };
    int K = 16;
    assertEquals(380123894, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case26() {
    int[] bags = { 932563573, 854892869, 885994300, 878313067, 340837661, 520736880, 480857243, 920150141, 57477529, 359789610, 19160144, 479690756, 494209734, 770531265, 246035272, 149659879, 402905827, 296983958, 12076564, 285588020, 456771837, 338359612, 943919261 };
    int K = 21;
    assertEquals(886441732, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case27() {
    int[] bags = { 938730869, 306853987, 56389606, 991754885, 117025689, 53437561, 610987954, 711731692, 427086498, 13119996, 935614396, 455037225, 305803066, 408848178, 809000205, 542168467, 628852770, 216076006, 584439637, 841155430, 240576045, 755918447, 510499588, 548602628, 315959898, 408472089, 602391380, 331256207, 177056123, 610553313, 572171229, 94931415, 304873283, 398508352, 583716091, 531420160, 42605243, 385053298, 374988810, 730761243, 863983511 };
    int K = 14;
    assertEquals(202515865, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case28() {
    int[] bags = { 254853171, 804696853, 221785993, 969506253, 316102211, 355008017, 449092515, 21516309, 256424522, 150517238, 309844951, 512406020, 937056086, 791026910, 599114752, 398434402, 741750959, 127096789, 485135148, 246481487, 660979935, 140762287, 238937377, 413032024, 437520761, 868943934, 7072374, 159181839, 884721268, 83419222, 135110813, 445055309, 907280599, 911537908, 447214628, 112585847, 858597220, 723527966, 283573598, 910382862, 569189299, 842861732, 497598156, 226737948, 249374220, 679946278, 312971267 };
    int K = 3;
    assertEquals(4037206, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case29() {
    int[] bags = { 422564154, 232929796, 942902532, 904759089, 285441476, 914906074, 118603169, 415260431, 695635286, 65642256, 613603015, 370925229, 428582723, 39101545, 599269036, 688956915, 207878184, 351725159, 240815336, 857992442, 692685202, 282976888, 854591007, 187171078, 936034497, 598038644, 143120749, 493971574, 285979376, 19846214, 907280921, 942066462, 364589745, 167540234, 223989398, 552958971, 410382733, 356072967, 427596077, 150257842, 925293023, 609251655, 749219717, 431755530, 83992443, 553628413, 669143469, 438474647 };
    int K = 21;
    assertEquals(288216805, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case30() {
    int[] bags = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 49;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case31() {
    int[] bags = { 97, 1, 32, 44, 40, 55, 51, 63, 30, 34, 2, 35, 64, 51, 19, 21, 32, 29, 46, 76, 61, 43, 57, 15, 36, 63, 82, 31, 38, 66, 13, 2, 27, 11, 13, 20, 95, 39, 79, 6, 88, 50, 3, 37, 50, 54, 22, 68, 41, 10 };
    int K = 24;
    assertEquals(30, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case32() {
    int[] bags = { 41, 24, 10, 100, 4, 41, 69, 99, 59, 12, 81, 43, 26, 61, 51, 42, 48, 52, 23, 85, 51, 57, 69, 5, 1, 49, 85, 3, 1, 71, 64, 91, 80, 35, 28, 20, 57, 34, 56, 15, 100, 23, 19, 64, 92, 10, 48, 69, 72, 89 };
    int K = 26;
    assertEquals(44, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case33() {
    int[] bags = { 3, 6, 86, 66, 68, 4, 81, 83, 95, 12, 6, 96, 59, 90, 33, 19, 20, 17, 100, 40, 99, 21, 49, 88, 38, 17, 73, 45, 16, 94, 23, 34, 66, 86, 38, 53, 98, 80, 90, 76, 51, 59, 19, 19, 81, 55, 83, 75, 4, 38 };
    int K = 18;
    assertEquals(25, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case34() {
    int[] bags = { 23, 74, 90, 66, 61, 99, 44, 71, 61, 64, 51, 26, 46, 89, 22, 24, 91, 82, 94, 11, 96, 34, 34, 7, 81, 4, 2, 86, 14, 23, 53, 74, 31, 47, 31, 67, 69, 56, 3, 87, 89, 10, 34, 11, 61, 51, 36, 46, 1, 83 };
    int K = 27;
    assertEquals(47, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case35() {
    int[] bags = { 12, 87, 47, 80, 69, 51, 50, 15, 74, 92, 48, 49, 67, 34, 64, 13, 13, 88, 24, 67, 96, 21, 100, 17, 37, 39, 57, 39, 3, 65, 83, 29, 88, 49, 46, 78, 80, 81, 41, 81, 79, 34, 9, 76, 90, 81, 61, 10, 53, 56 };
    int K = 27;
    assertEquals(40, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case36() {
    int[] bags = { 736, 152, 566, 349, 656, 994, 821, 160, 998, 755, 753, 187, 222, 783, 880, 107, 979, 319, 753, 388, 854, 282, 98, 899, 443, 342, 428, 25, 55, 504, 478, 90, 509, 142, 785, 323, 139, 757, 686, 36, 831, 469, 284, 320, 216, 523, 99, 976, 662, 533 };
    int K = 9;
    assertEquals(95, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case37() {
    int[] bags = { 919, 859, 18, 322, 275, 517, 312, 114, 156, 837, 931, 313, 491, 551, 666, 886, 682, 130, 576, 259, 874, 685, 777, 25, 211, 849, 327, 301, 654, 334, 498, 8, 989, 305, 73, 966, 16, 385, 571, 911, 252, 387, 470, 645, 659, 243, 419, 602, 969, 123 };
    int K = 43;
    assertEquals(846, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case38() {
    int[] bags = { 339, 747, 198, 943, 221, 549, 464, 812, 297, 976, 591, 757, 410, 779, 995, 284, 347, 956, 844, 505, 677, 599, 207, 52, 133, 740, 666, 620, 251, 660, 682, 103, 894, 787, 51, 37, 945, 708, 601, 122, 799, 33, 999, 861, 180, 843, 213, 182, 779, 643 };
    int K = 47;
    assertEquals(923, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case39() {
    int[] bags = { 860, 348, 246, 632, 290, 787, 956, 360, 680, 791, 172, 463, 418, 329, 136, 812, 931, 188, 365, 459, 91, 36, 311, 359, 948, 294, 611, 434, 838, 813, 318, 278, 173, 114, 350, 719, 552, 886, 757, 997, 831, 575, 866, 70, 672, 5, 881, 544, 509, 94 };
    int K = 50;
    assertEquals(992, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case40() {
    int[] bags = { 821, 10, 420, 81, 669, 884, 861, 912, 350, 282, 91, 67, 492, 291, 385, 703, 707, 570, 731, 432, 865, 586, 558, 489, 139, 618, 929, 793, 627, 929, 253, 885, 750, 632, 596, 146, 660, 973, 298, 186, 520, 583, 536, 129, 620, 462, 865, 541, 423, 921 };
    int K = 39;
    assertEquals(638, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case41() {
    int[] bags = { 460357278, 933126183, 323585758, 442343500, 371895657, 228819837, 901007112, 893890818, 504674552, 855440592, 986118398, 864559070, 839197446, 273226260, 111430231, 971803573, 281883318, 688867374, 256859381, 404072448, 854261764, 383208420, 546562358, 755403037, 478942447, 104520961, 48612664, 904125416, 234201782, 410087911, 651185579, 563951575, 661172213, 511775011, 714217532, 886811090, 289398171, 306769346, 52661009, 890346432, 394483108, 752168555, 387671241, 108742445, 397695603, 976210315, 484883288, 342541594, 633421606, 400087208 };
    int K = 2;
    assertEquals(1178828, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case42() {
    int[] bags = { 233720520, 614457080, 426814522, 308279165, 903496496, 658544693, 814242798, 694143958, 705066620, 855134807, 553248825, 672100822, 72588528, 384096150, 887725536, 242300544, 617622842, 930831435, 948441350, 450422182, 982993988, 191423060, 370021623, 131586327, 432410418, 392842347, 13795553, 13475845, 71372559, 852224664, 301718101, 952490466, 497108308, 640259098, 557107507, 870530226, 80750463, 973654839, 487652819, 309911587, 471224348, 748644912, 324998389, 719177124, 958349624, 683754123, 968936303, 156042807, 656686014, 458087698 };
    int K = 2;
    assertEquals(319708, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case43() {
    int[] bags = { 960794413, 717559359, 621124486, 651250039, 99305590, 689763768, 987958572, 114325739, 111768203, 682491747, 98519990, 294086731, 199771361, 509295441, 56754986, 888684611, 143962955, 543726511, 449284737, 284218946, 770195661, 60777769, 182812839, 972252400, 860846544, 161220698, 147217448, 636066254, 895307724, 451856401, 442873976, 635246495, 155665805, 528433296, 680027086, 715377871, 691940747, 225607544, 507016660, 247311705, 4007935, 522642643, 562574525, 196118956, 714052233, 27825501, 946222114, 591124580, 122623759, 327441700 };
    int K = 5;
    assertEquals(24103769, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case44() {
    int[] bags = { 36447837, 78418455, 904876776, 345034834, 818138856, 988773425, 312909295, 237250094, 376002346, 726518929, 42910920, 505781625, 254231236, 349999896, 616386735, 744195174, 354351876, 965045307, 168188984, 337876248, 858261858, 695632427, 304230085, 387761116, 967666973, 450909316, 806359735, 645463245, 211726980, 233404246, 502170454, 505055462, 115701022, 85100051, 187250290, 52137508, 222856971, 191035280, 317169341, 955627628, 941931621, 888963864, 875345708, 852792108, 292350660, 409499894, 825048514, 797198670, 203731560, 875894002 };
    int K = 3;
    assertEquals(3611171, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case45() {
    int[] bags = { 222592196, 753753040, 722555856, 130615606, 273737198, 420725729, 628674110, 877541481, 973248255, 969332800, 54694583, 726385515, 518600472, 94827649, 970542522, 560417223, 992883898, 764334489, 609274023, 395374830, 291231582, 752181655, 764795324, 640287674, 57082911, 332990991, 462828198, 183700768, 933495927, 768774982, 956151958, 999148935, 371582981, 94799538, 878568106, 205450509, 706130628, 321842956, 839471828, 372483407, 387767046, 486812070, 635575847, 647108511, 452967900, 705887348, 587792412, 973465484, 743047927, 316932357 };
    int K = 3;
    assertEquals(2922962, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case46() {
    int[] bags = { 432, 527, 155, 66, 895, 829, 458, 860, 283, 828, 755, 28, 738, 923, 548, 532, 637, 796, 524, 820, 512, 828, 428, 322, 423, 640, 149, 342, 438, 249, 105, 451, 823, 784, 165, 496, 10, 728, 278, 15, 701, 121, 677, 135, 538, 842, 41, 362, 306, 55 };
    int K = 3;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case47() {
    int[] bags = { 884, 140, 20, 915, 512, 735, 282, 574, 100, 868, 296, 524, 502, 954, 804, 53, 871, 868, 781, 953, 923, 490, 831, 398, 579, 733, 316, 107, 72, 992, 283, 475, 673, 436, 936, 891, 526, 112, 306, 347, 102, 698, 989, 571, 994, 989, 60, 458, 487, 814 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case48() {
    int[] bags = { 841, 266, 324, 631, 711, 652, 519, 597, 59, 134, 814, 966, 607, 487, 205, 354, 608, 159, 540, 790, 751, 364, 288, 73, 592, 368, 31, 6, 452, 231, 127, 745, 586, 228, 313, 620, 589, 702, 733, 92, 532, 243, 186, 696, 431, 861, 506, 727, 960, 353 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case49() {
    int[] bags = { 268, 525, 598, 340, 348, 297, 664, 508, 81, 922, 812, 266, 346, 585, 689, 370, 540, 191, 388, 123, 661, 647, 572, 427, 853, 252, 169, 634, 336, 936, 692, 397, 693, 844, 995, 837, 324, 394, 897, 532, 186, 155, 91, 48, 639, 497, 740, 197, 297, 410 };
    int K = 3;
    assertEquals(4, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case50() {
    int[] bags = { 372, 463, 529, 103, 510, 309, 159, 553, 696, 402, 847, 490, 499, 861, 253, 918, 851, 835, 712, 640, 135, 542, 498, 33, 645, 690, 210, 708, 30, 899, 202, 33, 404, 62, 654, 628, 45, 715, 911, 358, 758, 62, 93, 322, 545, 836, 760, 320, 495, 575 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case51() {
    int[] bags = { 1, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    int K = 41;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case52() {
    int[] bags = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1, 1000000000, 1000000000, 1000000000, 1, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case53() {
    int[] bags = { 1000000000, 1, 1000000000, 1, 1, 1000000000, 1000000000, 1000000000, 1, 1000000000, 1000000000, 1000000000, 1000000000, 1, 1, 1000000000, 1000000000, 1000000000, 1000000000, 1, 1000000000, 1, 1, 1, 1000000000, 1000000000, 1000000000, 1, 1, 1, 1000000000, 1, 1, 1, 1, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1, 1, 1, 1, 1, 1, 1, 1000000000, 1000000000, 1 };
    int K = 31;
    assertEquals(999999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case54() {
    int[] bags = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000000000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 10;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case55() {
    int[] bags = { 257275284, 230818064, 305618295, 396306023, 689651441, 414555258, 338999981, 328821685, 862242614, 605352961, 73211043, 250857118, 368020147, 558934644, 208309460, 331957144, 677537841, 75712078, 880495127, 461151786, 866611336, 441103363, 292431269, 630939314, 433602266, 609811810, 456492065, 191345855, 990496099, 348869152, 740980358, 280632947, 965416837, 401082680, 912254918, 171603488, 27179252, 160609085, 793045742, 389014013, 89525786, 324188359, 443469535, 412958991, 661353773, 58160145, 383582036, 990716590, 662017209, 5365 };
    int K = 17;
    assertEquals(136963427, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case56() {
    int[] bags = { 570554232, 642776580, 9639, 944854354, 221158732, 289669365, 543548526, 649653216, 790381863, 184162160, 476510634, 249791126, 112112211, 589834918, 518624723, 401404985, 788519219, 229922277, 318284374, 902898233, 717776779, 688667666, 35794678, 861098251, 878470815, 642514788, 209973549, 636471864, 297624276, 26993545, 3328667, 889400618, 155975748, 17812697, 461216723, 349872761, 964292851, 762863886, 77779295, 733807292, 382641386, 244978223, 35387000, 597262932, 321441473, 119849995, 59932911, 677315215, 8214, 509499293 };
    int K = 2;
    assertEquals(1425, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case57() {
    int[] bags = { 5477, 488314314, 2348, 2239, 8854, 964, 869854388, 567952712, 2706, 5330, 468130553, 7670, 2170, 514470263, 694896182, 3508, 368668393, 719352983, 738860531, 762212720, 6719, 835321737, 8148, 962855052, 2918, 192, 7445, 569432079, 851044934, 660665943, 9153, 276, 1651, 5993, 372450539, 4293, 571913790, 169797972, 438096835, 418316487, 186688589, 9136, 7521, 5856, 161460072, 131158503, 3263, 876292913, 2265, 506318500 };
    int K = 3;
    assertEquals(95, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case58() {
    int[] bags = { 5391, 7269, 4177, 7965, 278, 9286, 8133, 2182, 9599, 6188, 4677, 6916, 591, 8116, 2372, 4507, 5079, 2057, 8634, 7857, 407, 9628, 4124, 4228, 5976, 7189, 4417, 9027, 91544829, 4084, 9682, 1476, 6632, 5236, 5418, 7846, 2452, 279, 7145, 9192, 6134, 2023, 4005, 721, 2855, 1454, 3745, 502, 8164, 7602 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case59() {
    int[] bags = { 1, 1000000000 };
    int K = 2;
    assertEquals(999999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case60() {
    int[] bags = { 10, 20, 30 };
    int K = 2;
    assertEquals(10, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case61() {
    int[] bags = { 1, 3, 4, 6 };
    int K = 3;
    assertEquals(3, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case62() {
    int[] bags = { 804289384, 846930887, 681692778, 714636916, 957747794, 424238336, 719885387, 649760493, 596516650, 189641422, 25202363, 350490028, 783368691, 102520060, 44897764, 967513927, 365180541, 540383427, 304089173, 303455737, 35005212, 521595369, 294702568, 726956430, 336465783, 861021531, 278722863, 233665124, 145174068, 468703136, 101513930, 801979803, 315634023, 635723059, 369133070, 125898168, 59961394, 89018457, 628175012, 656478043, 131176230, 653377374, 859484422, 914544920, 608413785, 756898538, 734575199, 973594325, 149798316, 38664371 };
    int K = 30;
    assertEquals(557565794, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case63() {
    int[] bags = { 30, 30, 21, 21 };
    int K = 3;
    assertEquals(9, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case64() {
    int[] bags = { 1, 2, 4, 5 };
    int K = 3;
    assertEquals(3, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case65() {
    int[] bags = { 1, 100000000 };
    int K = 2;
    assertEquals(99999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case66() {
    int[] bags = { 4, 7, 4, 5, 4, 67, 4, 4, 4, 4, 45, 87, 8, 65, 6, 6, 1, 321, 354, 37, 357, 357, 321, 321, 321, 374 };
    int K = 15;
    assertEquals(44, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case67() {
    int[] bags = { 1, 2, 3, 4, 5, 10000, 10000 };
    int K = 3;
    assertEquals(2, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case68() {
    int[] bags = { 1, 4, 6, 7 };
    int K = 3;
    assertEquals(3, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case69() {
    int[] bags = { 3, 100, 101, 102 };
    int K = 3;
    assertEquals(2, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case70() {
    int[] bags = { 5, 4, 6, 1, 9, 4, 2, 7, 5, 6 };
    int K = 4;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case71() {
    int[] bags = { 47, 1000000000, 1, 74 };
    int K = 2;
    assertEquals(27, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case72() {
    int[] bags = { 1, 2, 80, 100 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case73() {
    int[] bags = { 1, 1 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case74() {
    int[] bags = { 100, 200, 300 };
    int K = 2;
    assertEquals(100, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case75() {
    int[] bags = { 1, 5, 6 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case76() {
    int[] bags = { 1, 6, 7, 8 };
    int K = 3;
    assertEquals(2, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case77() {
    int[] bags = { 10, 20, 25 };
    int K = 2;
    assertEquals(5, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case78() {
    int[] bags = { 5, 6 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case79() {
    int[] bags = { 1, 10000000 };
    int K = 2;
    assertEquals(9999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case80() {
    int[] bags = { 1, 2 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case81() {
    int[] bags = { 2, 8, 9 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case82() {
    int[] bags = { 1, 999999999 };
    int K = 2;
    assertEquals(999999998, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case83() {
    int[] bags = { 1, 2, 4, 4, 4 };
    int K = 3;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case84() {
    int[] bags = { 1, 1000000 };
    int K = 2;
    assertEquals(999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case85() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 14, 1, 5, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 11, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int K = 25;
    assertEquals(22, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case86() {
    int[] bags = { 4, 4, 4 };
    int K = 3;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case87() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int K = 26;
    assertEquals(25, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case88() {
    int[] bags = { 1, 5, 10, 15, 20, 21 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case89() {
    int[] bags = { 1, 2000000 };
    int K = 2;
    assertEquals(1999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case90() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 15 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case91() {
    int[] bags = { 4, 7, 4 };
    int K = 3;
    assertEquals(3, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case92() {
    int[] bags = { 10, 20, 30, 30 };
    int K = 3;
    assertEquals(10, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case93() {
    int[] bags = { 1, 3, 5, 7, 9, 9 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case94() {
    int[] bags = { 1000000000, 1 };
    int K = 2;
    assertEquals(999999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case95() {
    int[] bags = { 3, 47, 52, 59, 60 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case96() {
    int[] bags = { 1, 10, 11 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case97() {
    int[] bags = { 1, 20, 50, 60, 61, 62 };
    int K = 3;
    assertEquals(2, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case98() {
    int[] bags = { 1, 3, 5, 6 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case99() {
    int[] bags = { 4, 6, 8, 9 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case100() {
    int[] bags = { 1, 500000000, 1000000000 };
    int K = 2;
    assertEquals(499999999, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case101() {
    int[] bags = { 10, 100000000 };
    int K = 2;
    assertEquals(99999990, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case102() {
    int[] bags = { 1, 999999999, 555555555 };
    int K = 2;
    assertEquals(444444444, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case103() {
    int[] bags = { 1, 5, 10, 11 };
    int K = 2;
    assertEquals(1, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case104() {
    int[] bags = { 2, 2, 3, 3, 4, 4 };
    int K = 2;
    assertEquals(0, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case105() {
    int[] bags = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 29, 29, 29, 29, 29, 29 };
    int K = 33;
    assertEquals(4, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case106() {
    int[] bags = { 1, 2, 10, 12, 21 };
    int K = 3;
    assertEquals(9, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case107() {
    int[] bags = { 10000, 12000 };
    int K = 2;
    assertEquals(2000, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case108() {
    int[] bags = { 1, 1000000000, 5, 7 };
    int K = 3;
    assertEquals(6, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case109() {
    int[] bags = { 30, 30, 21, 3 };
    int K = 3;
    assertEquals(9, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case110() {
    int[] bags = { 1, 5, 10, 15, 16 };
    int K = 3;
    assertEquals(6, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case111() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 50 };
    int K = 25;
    assertEquals(24, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case112() {
    int[] bags = { 2, 5, 8, 9 };
    int K = 3;
    assertEquals(4, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case113() {
    int[] bags = { 10, 20, 25, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 23, 34, 24, 46, 55, 45, 45, 1, 1, 1, 2, 4, 4, 7, 7, 77, 89, 99, 2, 2, 4, 6, 8, 90, 123, 234, 234, 456, 11, 11, 11, 23, 34 };
    int K = 45;
    assertEquals(233, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case114() {
    int[] bags = { 1, 5, 99, 100 };
    int K = 3;
    assertEquals(95, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case115() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int K = 25;
    assertEquals(4, winterandmandarins.getNumber(bags, K));
  }

  @Test
  public void case116() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int K = 30;
    assertEquals(29, winterandmandarins.getNumber(bags, K));
  }

}
