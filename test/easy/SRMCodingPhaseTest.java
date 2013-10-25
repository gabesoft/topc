package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SRMCodingPhaseTest {
    SRMCodingPhase srmcodingphase = new SRMCodingPhase();

    @Test
    public void case1() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 10, 25, 40 };
        int luck = 0;
        assertEquals(1310, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case2() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 30, 65, 90 };
        int luck = 25;
        assertEquals(680, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case3() {
        int[] points = { 250, 450, 1100 };
        int[] skills = { 50, 70, 90 };
        int luck = 20;
        assertEquals(540, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case4() {
        int[] points = { 250, 550, 950 };
        int[] skills = { 10, 25, 40 };
        int luck = 75;
        assertEquals(1736, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case5() {
        int[] points = { 256, 512, 1024 };
        int[] skills = { 35, 30, 25 };
        int luck = 0;
        assertEquals(1216, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case6() {
        int[] points = { 300, 600, 1100 };
        int[] skills = { 80, 90, 100 };
        int luck = 4;
        assertEquals(0, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case7() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 1, 1, 1 };
        int luck = 0;
        assertEquals(1586, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case8() {
        int[] points = { 271, 549, 942 };
        int[] skills = { 75, 100, 100 };
        int luck = 0;
        assertEquals(121, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case9() {
        int[] points = { 256, 555, 999 };
        int[] skills = { 100, 75, 100 };
        int luck = 0;
        assertEquals(255, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case10() {
        int[] points = { 300, 600, 1100 };
        int[] skills = { 100, 100, 75 };
        int luck = 0;
        assertEquals(500, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case11() {
        int[] points = { 299, 460, 1002 };
        int[] skills = { 77, 77, 77 };
        int luck = 1;
        assertEquals(0, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case12() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 26, 26, 26 };
        int luck = 0;
        assertEquals(1188, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case13() {
        int[] points = { 300, 500, 999 };
        int[] skills = { 75, 75, 75 };
        int luck = 100;
        assertEquals(1295, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case14() {
        int[] points = { 300, 600, 1100 };
        int[] skills = { 100, 100, 100 };
        int luck = 100;
        assertEquals(1092, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case15() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 76, 76, 76 };
        int luck = 1;
        assertEquals(400, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case16() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 40, 100, 35 };
        int luck = 0;
        assertEquals(890, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case17() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 100, 35, 40 };
        int luck = 0;
        assertEquals(1040, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case18() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 25, 50, 100 };
        int luck = 0;
        assertEquals(500, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case19() {
        int[] points = { 266, 457, 991 };
        int[] skills = { 80, 82, 61 };
        int luck = 78;
        assertEquals(1184, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case20() {
        int[] points = { 253, 492, 1043 };
        int[] skills = { 75, 71, 30 };
        int luck = 9;
        assertEquals(875, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case21() {
        int[] points = { 275, 468, 1064 };
        int[] skills = { 92, 39, 72 };
        int luck = 98;
        assertEquals(1476, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case22() {
        int[] points = { 296, 538, 930 };
        int[] skills = { 25, 74, 7 };
        int luck = 54;
        assertEquals(1602, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case23() {
        int[] points = { 285, 564, 963 };
        int[] skills = { 33, 54, 94 };
        int luck = 33;
        assertEquals(699, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case24() {
        int[] points = { 288, 498, 910 };
        int[] skills = { 30, 12, 3 };
        int luck = 28;
        assertEquals(1654, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case25() {
        int[] points = { 269, 600, 1098 };
        int[] skills = { 92, 46, 95 };
        int luck = 17;
        assertEquals(484, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case26() {
        int[] points = { 282, 501, 910 };
        int[] skills = { 35, 15, 97 };
        int luck = 59;
        assertEquals(1047, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case27() {
        int[] points = { 296, 587, 958 };
        int[] skills = { 100, 36, 71 };
        int luck = 5;
        assertEquals(463, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case28() {
        int[] points = { 284, 503, 955 };
        int[] skills = { 12, 7, 13 };
        int luck = 100;
        assertEquals(1728, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case29() {
        int[] points = { 284, 590, 923 };
        int[] skills = { 12, 62, 66 };
        int luck = 92;
        assertEquals(1625, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case30() {
        int[] points = { 269, 479, 1053 };
        int[] skills = { 18, 94, 16 };
        int luck = 20;
        assertEquals(1288, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case31() {
        int[] points = { 267, 599, 933 };
        int[] skills = { 52, 59, 4 };
        int luck = 3;
        assertEquals(1288, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case32() {
        int[] points = { 256, 481, 994 };
        int[] skills = { 13, 95, 45 };
        int luck = 99;
        assertEquals(1537, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case33() {
        int[] points = { 264, 466, 988 };
        int[] skills = { 54, 50, 29 };
        int luck = 15;
        assertEquals(1142, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case34() {
        int[] points = { 266, 556, 922 };
        int[] skills = { 97, 15, 59 };
        int luck = 16;
        assertEquals(1074, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case35() {
        int[] points = { 284, 475, 993 };
        int[] skills = { 52, 19, 45 };
        int luck = 1;
        assertEquals(1040, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case36() {
        int[] points = { 261, 594, 937 };
        int[] skills = { 47, 26, 62 };
        int luck = 14;
        assertEquals(1043, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case37() {
        int[] points = { 262, 514, 927 };
        int[] skills = { 80, 57, 68 };
        int luck = 38;
        assertEquals(687, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case38() {
        int[] points = { 293, 496, 997 };
        int[] skills = { 95, 34, 58 };
        int luck = 77;
        assertEquals(1429, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case39() {
        int[] points = { 271, 529, 975 };
        int[] skills = { 47, 6, 28 };
        int luck = 57;
        assertEquals(1719, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case40() {
        int[] points = { 252, 461, 1093 };
        int[] skills = { 79, 95, 45 };
        int luck = 71;
        assertEquals(1274, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case41() {
        int[] points = { 296, 470, 902 };
        int[] skills = { 46, 15, 12 };
        int luck = 34;
        assertEquals(1582, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case42() {
        int[] points = { 259, 561, 904 };
        int[] skills = { 80, 62, 2 };
        int luck = 0;
        assertEquals(1201, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case43() {
        int[] points = { 280, 476, 964 };
        int[] skills = { 43, 12, 29 };
        int luck = 69;
        assertEquals(1682, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case44() {
        int[] points = { 253, 471, 919 };
        int[] skills = { 63, 98, 85 };
        int luck = 90;
        assertEquals(1050, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case45() {
        int[] points = { 253, 517, 1033 };
        int[] skills = { 33, 79, 58 };
        int luck = 80;
        assertEquals(1318, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case46() {
        int[] points = { 270, 504, 1050 };
        int[] skills = { 12, 35, 75 };
        int luck = 10;
        assertEquals(650, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case47() {
        int[] points = { 290, 536, 1034 };
        int[] skills = { 41, 42, 37 };
        int luck = 54;
        assertEquals(1674, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case48() {
        int[] points = { 292, 581, 950 };
        int[] skills = { 14, 23, 86 };
        int luck = 9;
        assertEquals(789, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case49() {
        int[] points = { 264, 487, 1016 };
        int[] skills = { 19, 88, 89 };
        int luck = 30;
        assertEquals(544, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case50() {
        int[] points = { 257, 533, 1021 };
        int[] skills = { 3, 99, 99 };
        int luck = 39;
        assertEquals(792, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case51() {
        int[] points = { 272, 527, 1097 };
        int[] skills = { 39, 1, 32 };
        int luck = 68;
        assertEquals(1880, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case52() {
        int[] points = { 287, 551, 1026 };
        int[] skills = { 16, 69, 70 };
        int luck = 5;
        assertEquals(506, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case53() {
        int[] points = { 274, 559, 906 };
        int[] skills = { 87, 86, 69 };
        int luck = 94;
        assertEquals(1217, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case54() {
        int[] points = { 255, 554, 904 };
        int[] skills = { 82, 5, 97 };
        int luck = 26;
        assertEquals(685, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case55() {
        int[] points = { 291, 549, 1037 };
        int[] skills = { 6, 94, 26 };
        int luck = 21;
        assertEquals(1276, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case56() {
        int[] points = { 252, 596, 980 };
        int[] skills = { 88, 96, 51 };
        int luck = 15;
        assertEquals(692, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case57() {
        int[] points = { 270, 555, 1072 };
        int[] skills = { 62, 96, 91 };
        int luck = 30;
        assertEquals(584, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case58() {
        int[] points = { 276, 491, 1027 };
        int[] skills = { 57, 98, 72 };
        int luck = 0;
        assertEquals(451, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case59() {
        int[] points = { 278, 526, 1045 };
        int[] skills = { 56, 83, 78 };
        int luck = 0;
        assertEquals(166, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case60() {
        int[] points = { 288, 547, 1022 };
        int[] skills = { 44, 21, 12 };
        int luck = 1;
        assertEquals(1397, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case61() {
        int[] points = { 296, 490, 910 };
        int[] skills = { 13, 65, 1 };
        int luck = 100;
        assertEquals(1682, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case62() {
        int[] points = { 257, 580, 907 };
        int[] skills = { 22, 49, 31 };
        int luck = 32;
        assertEquals(1504, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case63() {
        int[] points = { 278, 499, 962 };
        int[] skills = { 13, 81, 34 };
        int luck = 10;
        assertEquals(1022, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case64() {
        int[] points = { 294, 569, 1092 };
        int[] skills = { 94, 55, 82 };
        int luck = 90;
        assertEquals(1469, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case65() {
        int[] points = { 279, 458, 976 };
        int[] skills = { 66, 99, 66 };
        int luck = 41;
        assertEquals(776, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case66() {
        int[] points = { 294, 571, 983 };
        int[] skills = { 55, 75, 34 };
        int luck = 7;
        assertEquals(767, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case67() {
        int[] points = { 285, 486, 1051 };
        int[] skills = { 82, 68, 50 };
        int luck = 19;
        assertEquals(803, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case68() {
        int[] points = { 271, 505, 919 };
        int[] skills = { 21, 30, 70 };
        int luck = 23;
        assertEquals(772, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case69() {
        int[] points = { 250, 550, 950 };
        int[] skills = { 10, 25, 40 };
        int luck = 75;
        assertEquals(1736, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case70() {
        int[] points = { 300, 600, 1100 };
        int[] skills = { 80, 90, 100 };
        int luck = 4;
        assertEquals(0, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case71() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 50, 50, 100 };
        int luck = 25;
        assertEquals(700, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case72() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 80, 30, 30 };
        int luck = 0;
        assertEquals(1140, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case73() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 30, 65, 90 };
        int luck = 25;
        assertEquals(680, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case74() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 77, 2, 2 };
        int luck = 4;
        assertEquals(1488, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case75() {
        int[] points = { 250, 500, 900 };
        int[] skills = { 25, 50, 100 };
        int luck = 0;
        assertEquals(500, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case76() {
        int[] points = { 284, 568, 1066 };
        int[] skills = { 65, 46, 28 };
        int luck = 68;
        assertEquals(1760, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case77() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 100, 55, 3 };
        int luck = 65;
        assertEquals(1338, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case78() {
        int[] points = { 250, 450, 1100 };
        int[] skills = { 74, 74, 100 };
        int luck = 85;
        assertEquals(980, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case79() {
        int[] points = { 300, 500, 1000 };
        int[] skills = { 10, 10, 10 };
        int luck = 5;
        assertEquals(1700, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case80() {
        int[] points = { 250, 550, 950 };
        int[] skills = { 10, 25, 40 };
        int luck = 55;
        assertEquals(1686, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case81() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 76, 76, 75 };
        int luck = 1;
        assertEquals(408, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case82() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 75, 75, 75 };
        int luck = 0;
        assertEquals(400, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case83() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 76, 76, 76 };
        int luck = 75;
        assertEquals(992, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case84() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 30, 99, 99 };
        int luck = 0;
        assertEquals(190, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case85() {
        int[] points = { 250, 450, 1100 };
        int[] skills = { 26, 26, 100 };
        int luck = 25;
        assertEquals(644, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case86() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 1, 99, 40 };
        int luck = 60;
        assertEquals(1240, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case87() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 71, 71, 5 };
        int luck = 0;
        assertEquals(960, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case88() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 65, 100, 100 };
        int luck = 0;
        assertEquals(120, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case89() {
        int[] points = { 300, 450, 1100 };
        int[] skills = { 1, 74, 1 };
        int luck = 0;
        assertEquals(1390, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case90() {
        int[] points = { 250, 450, 1100 };
        int[] skills = { 42, 32, 2 };
        int luck = 0;
        assertEquals(1406, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case91() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 75, 100, 5 };
        int luck = 10;
        assertEquals(1104, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case92() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 10, 10, 10 };
        int luck = 11;
        assertEquals(1690, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case93() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 1, 1, 1 };
        int luck = 1;
        assertEquals(1586, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case94() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 10, 99, 99 };
        int luck = 20;
        assertEquals(248, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case95() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 100, 100, 100 };
        int luck = 0;
        assertEquals(0, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case96() {
        int[] points = { 250, 500, 1100 };
        int[] skills = { 30, 45, 30 };
        int luck = 0;
        assertEquals(1180, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case97() {
        int[] points = { 250, 550, 950 };
        int[] skills = { 60, 60, 60 };
        int luck = 60;
        assertEquals(1256, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case98() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 10, 100, 10 };
        int luck = 0;
        assertEquals(1150, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case99() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 100, 100, 100 };
        int luck = 50;
        assertEquals(500, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case100() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 90, 90, 10 };
        int luck = 0;
        assertEquals(920, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case101() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 60, 100, 100 };
        int luck = 0;
        assertEquals(130, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case102() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 10, 25, 40 };
        int luck = 40;
        assertEquals(1626, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case103() {
        int[] points = { 250, 450, 1100 };
        int[] skills = { 35, 40, 76 };
        int luck = 4;
        assertEquals(524, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case104() {
        int[] points = { 300, 500, 1000 };
        int[] skills = { 15, 75, 60 };
        int luck = 75;
        assertEquals(1526, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case105() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 100, 45, 50 };
        int luck = 10;
        assertEquals(680, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case106() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 20, 20, 20 };
        int luck = 20;
        assertEquals(1626, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case107() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 75, 100, 100 };
        int luck = 1;
        assertEquals(102, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case108() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 31, 26, 21 };
        int luck = 74;
        assertEquals(1784, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case109() {
        int[] points = { 250, 500, 990 };
        int[] skills = { 30, 65, 10 };
        int luck = 11;
        assertEquals(1230, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case110() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 65, 65, 65 };
        int luck = 65;
        assertEquals(1236, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case111() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 40, 40, 40 };
        int luck = 100;
        assertEquals(1752, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case112() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 80, 80, 80 };
        int luck = 100;
        assertEquals(1256, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case113() {
        int[] points = { 266, 511, 1022 };
        int[] skills = { 11, 14, 50 };
        int luck = 50;
        assertEquals(1717, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case114() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 100, 100, 1 };
        int luck = 1;
        assertEquals(992, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case115() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 30, 30, 30 };
        int luck = 15;
        assertEquals(1450, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case116() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 40, 40, 40 };
        int luck = 20;
        assertEquals(1180, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case117() {
        int[] points = { 250, 450, 900 };
        int[] skills = { 10, 10, 10 };
        int luck = 12;
        assertEquals(1544, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case118() {
        int[] points = { 256, 512, 1024 };
        int[] skills = { 35, 30, 25 };
        int luck = 0;
        assertEquals(1216, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case119() {
        int[] points = { 250, 550, 950 };
        int[] skills = { 20, 30, 40 };
        int luck = 50;
        assertEquals(1626, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case120() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 25, 51, 76 };
        int luck = 1;
        assertEquals(650, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case121() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 1, 100, 1 };
        int luck = 1;
        assertEquals(1240, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case122() {
        int[] points = { 300, 450, 1000 };
        int[] skills = { 40, 100, 40 };
        int luck = 50;
        assertEquals(1234, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case123() {
        int[] points = { 250, 500, 1000 };
        int[] skills = { 75, 76, 75 };
        int luck = 0;
        assertEquals(400, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case124() {
        int[] points = { 250, 450, 1100 };
        int[] skills = { 80, 90, 75 };
        int luck = 75;
        assertEquals(1092, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case125() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 100, 100, 75 };
        int luck = 0;
        assertEquals(300, srmcodingphase.countScore(points, skills, luck));
    }

    @Test
    public void case126() {
        int[] points = { 300, 600, 900 };
        int[] skills = { 1, 1, 75 };
        int luck = 0;
        assertEquals(894, srmcodingphase.countScore(points, skills, luck));
    }

}
