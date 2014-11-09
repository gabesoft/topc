package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class StampTest {
    Stamp stamp = new Stamp();

    @Test
    public void case1() {
        String desiredColor = "RRGGBB";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(5, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case2() {
        String desiredColor = "R**GB*";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(5, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case3() {
        String desiredColor = "BRRB";
        int stampCost = 2;
        int pushCost = 7;
        assertEquals(30, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case4() {
        String desiredColor = "R*RR*GG";
        int stampCost = 10;
        int pushCost = 58;
        assertEquals(204, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case5() {
        String desiredColor = "*B**B**B*BB*G*BBB**B**B*";
        int stampCost = 5;
        int pushCost = 2;
        assertEquals(33, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case6() {
        String desiredColor = "*R*RG*G*GR*RGG*G*GGR***RR*GG";
        int stampCost = 7;
        int pushCost = 1;
        assertEquals(30, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case7() {
        String desiredColor = "R";
        int stampCost = 123;
        int pushCost = 234;
        assertEquals(357, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case8() {
        String desiredColor = "*";
        int stampCost = 987;
        int pushCost = 876;
        assertEquals(1863, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case9() {
        String desiredColor = "RR*GG";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(300002, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case10() {
        String desiredColor = "RR*GG*BB*RR*GG*BB*RR*GG*BB*RR*GG*BB*RR*GG*BB*RR*GG";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(2500002, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case11() {
        String desiredColor = "RR*GG*BB*RR*GG*BB*RR*GG*BB*RR*GG*BB*RR*GG*BB*RR*";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(1600003, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case12() {
        String desiredColor = "R**G**B**R**G**B**R**G**B**R**G**B**R**G**B**R*";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(2400002, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case13() {
        String desiredColor = "*R**G**B**R**G**B**R**G**B**R**G**B**R**G**B**R";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(2400002, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case14() {
        String desiredColor = "*********R*********G*********R*********B*********";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(500010, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case15() {
        String desiredColor = "************************B************************";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(100049, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case16() {
        String desiredColor = "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRG";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(5100000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case17() {
        String desiredColor = "**************************************************";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(1500000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case18() {
        String desiredColor = "**************************************************";
        int stampCost = 10000;
        int pushCost = 40000;
        assertEquals(290000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case19() {
        String desiredColor = "**************************************************";
        int stampCost = 10000;
        int pushCost = 70000;
        assertEquals(380000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case20() {
        String desiredColor = "*************************************************";
        int stampCost = 100;
        int pushCost = 151;
        assertEquals(1755, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case21() {
        String desiredColor = "*************************************************";
        int stampCost = 100;
        int pushCost = 150;
        assertEquals(1750, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case22() {
        String desiredColor = "R************************************************G";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(1500000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case23() {
        String desiredColor = "*****R**********G**********B*****R***************G";
        int stampCost = 10000;
        int pushCost = 100000;
        assertEquals(600000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case24() {
        String desiredColor = "*****R**********G**********B*****R***************G";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(1500000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case25() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGGG";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(300024, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case26() {
        String desiredColor = "G";
        int stampCost = 89113;
        int pushCost = 79630;
        assertEquals(168743, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case27() {
        String desiredColor = "RB";
        int stampCost = 47185;
        int pushCost = 16261;
        assertEquals(79707, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case28() {
        String desiredColor = "GGBBRR";
        int stampCost = 75529;
        int pushCost = 91787;
        assertEquals(426419, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case29() {
        String desiredColor = "BBRRGGBB";
        int stampCost = 47574;
        int pushCost = 53214;
        assertEquals(308004, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case30() {
        String desiredColor = "RRRBBBGGGRRRBBB";
        int stampCost = 24969;
        int pushCost = 20906;
        assertEquals(179437, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case31() {
        String desiredColor = "*****";
        int stampCost = 85934;
        int pushCost = 3191;
        assertEquals(101889, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case32() {
        String desiredColor = "**B***";
        int stampCost = 52636;
        int pushCost = 27801;
        assertEquals(188675, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case33() {
        String desiredColor = "B*****R";
        int stampCost = 33491;
        int pushCost = 48378;
        assertEquals(245607, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case34() {
        String desiredColor = "RRRGGBBBB";
        int stampCost = 2431;
        int pushCost = 608;
        assertEquals(7902, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case35() {
        String desiredColor = "RRRGGBBBB";
        int stampCost = 2431;
        int pushCost = 607;
        assertEquals(7894, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case36() {
        String desiredColor = "RRR*RR*RRRRRR*RRBBBBBB*B*BBBBBB*G*GG*GG*GG*GGGGG";
        int stampCost = 89322;
        int pushCost = 89202;
        assertEquals(1249788, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case37() {
        String desiredColor = "GG****G*****G*G*BBBB*B****BBBBB**RRR*R***R*R**RR";
        int stampCost = 91259;
        int pushCost = 77666;
        assertEquals(1196068, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case38() {
        String desiredColor = "**R****RR*R*RR***B*B******B*B*BB***GGGGGGG****GG";
        int stampCost = 67617;
        int pushCost = 63581;
        assertEquals(918386, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case39() {
        String desiredColor = "**GG*GG*GGGGGGGG*GGGGGG*GGGGGGGGGGG**G*G*GGGGGG";
        int stampCost = 18541;
        int pushCost = 45191;
        assertEquals(403256, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case40() {
        String desiredColor = "RRRRR**R*RRRRR**RR***RRR*RRR****RR*RRR*R*RR*RRR";
        int stampCost = 76962;
        int pushCost = 93536;
        assertEquals(1176912, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case41() {
        String desiredColor = "R*RR*RR**R****R*RR*R**R**R*R*R**RRR*R***R**R*RR";
        int stampCost = 76733;
        int pushCost = 19856;
        assertEquals(545204, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case42() {
        String desiredColor = "R*RR*RRB*BBB*BGGG*G***RR*R*RBB*BB**GGGGGGGRRRRRRR";
        int stampCost = 20379;
        int pushCost = 21843;
        assertEquals(295554, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case43() {
        String desiredColor = "R**R**RB*BBBBB*GGGG*GRR**RR*B*BBBBBGG*GGGG**RRR*R";
        int stampCost = 99687;
        int pushCost = 97099;
        assertEquals(1377502, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case44() {
        String desiredColor = "***G*GG*BBB*BBR*R***R******G**B******R***R*G*GGG*";
        int stampCost = 56435;
        int pushCost = 49338;
        assertEquals(740411, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case45() {
        String desiredColor = "*RR*R*RR*RRRRR**RRRR*RR*GGGGG*GGGGG*G**GGG*GG*";
        int stampCost = 52922;
        int pushCost = 60897;
        assertEquals(788758, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case46() {
        String desiredColor = "G*G**GGG*GG*GG***GGG**GR*RRR*RRRR*R***R*RRRR**";
        int stampCost = 35667;
        int pushCost = 36890;
        assertEquals(506676, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case47() {
        String desiredColor = "*G*G***********G*GGG***RR*RRR**RRRR**RRRR*R*R*";
        int stampCost = 18414;
        int pushCost = 29955;
        assertEquals(327042, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case48() {
        String desiredColor = "B*RRGGB**RGG*BRRGGBBRRGGB**RG*BB**GGBB*RG*BBRRGG";
        int stampCost = 12524;
        int pushCost = 48143;
        assertEquals(1180480, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case49() {
        String desiredColor = "*B*R***BR*GGB*R*G***R*GG**R*G**B*R*GB**R*GBB****";
        int stampCost = 16490;
        int pushCost = 12745;
        assertEquals(338860, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case50() {
        String desiredColor = "**GGBB*R*******G****G*BB*R***BR****B*R**B**R**B*";
        int stampCost = 62615;
        int pushCost = 99861;
        assertEquals(1885482, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case51() {
        String desiredColor = "*********B**R***************************G*********";
        int stampCost = 57169;
        int pushCost = 20171;
        assertEquals(487555, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case52() {
        String desiredColor = "*B***********************G**RB******************R";
        int stampCost = 26694;
        int pushCost = 94313;
        assertEquals(1683403, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case53() {
        String desiredColor = "****R********GB*************G**R*R*B************";
        int stampCost = 7245;
        int pushCost = 51166;
        assertEquals(547885, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case54() {
        String desiredColor = "*********B**G**R*******G********R****B*********";
        int stampCost = 42925;
        int pushCost = 5343;
        assertEquals(214082, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case55() {
        String desiredColor = "*******G*B******R****G*RB***R***G*G*R******B**B";
        int stampCost = 95614;
        int pushCost = 32088;
        assertEquals(961340, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case56() {
        String desiredColor = "BR*R*R**B***R***BRG***G*BB*G***G****G*R***GB***";
        int stampCost = 13610;
        int pushCost = 7350;
        assertEquals(359060, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case57() {
        String desiredColor = "RR****BBBB****R***R*R*G**GR**BGG**B*GB*GRRBG**G";
        int stampCost = 76223;
        int pushCost = 87458;
        assertEquals(4186749, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case58() {
        String desiredColor = "RRRRRRRRRRRRRGGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBBB";
        int stampCost = 138;
        int pushCost = 7;
        assertEquals(458, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case59() {
        String desiredColor = "RRRRRRRRRRRRRGGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBBB";
        int stampCost = 138;
        int pushCost = 6;
        assertEquals(432, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case60() {
        String desiredColor = "RRRRRRRRRRRRRGGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBBB";
        int stampCost = 1115;
        int pushCost = 49;
        assertEquals(3504, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case61() {
        String desiredColor = "RRRRRRRRRRRRRGGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBBB";
        int stampCost = 1115;
        int pushCost = 48;
        assertEquals(3467, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case62() {
        String desiredColor = "RRRRRRRRRRRRRGGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBBB";
        int stampCost = 5;
        int pushCost = 4;
        assertEquals(67, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case63() {
        String desiredColor = "RRRRRRRRRRRRRGGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBBB";
        int stampCost = 5;
        int pushCost = 3;
        assertEquals(58, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case64() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGG";
        int stampCost = 1385;
        int pushCost = 58;
        assertEquals(4278, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case65() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGG";
        int stampCost = 1385;
        int pushCost = 57;
        assertEquals(4235, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case66() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGG";
        int stampCost = 1351;
        int pushCost = 2027;
        assertEquals(24996, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case67() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGG";
        int stampCost = 1351;
        int pushCost = 2026;
        assertEquals(24990, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case68() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGG";
        int stampCost = 2887;
        int pushCost = 722;
        assertEquals(20934, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case69() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGG";
        int stampCost = 2887;
        int pushCost = 721;
        assertEquals(20918, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case70() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGBBBB";
        int stampCost = 919;
        int pushCost = 184;
        assertEquals(6068, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case71() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGBBBB";
        int stampCost = 919;
        int pushCost = 183;
        assertEquals(6051, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case72() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGBBBB";
        int stampCost = 1481;
        int pushCost = 186;
        assertEquals(7791, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case73() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGBBBB";
        int stampCost = 1481;
        int pushCost = 185;
        assertEquals(7772, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case74() {
        String desiredColor = "****RRRRR***B*BBB***GGGG*GGGBBB**BBGGGG***RR*RR*RR";
        int stampCost = 48;
        int pushCost = 52;
        assertEquals(804, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case75() {
        String desiredColor = "R*****";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(100006, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case76() {
        String desiredColor = "R**GGBBB";
        int stampCost = 5;
        int pushCost = 10;
        assertEquals(60, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case77() {
        String desiredColor = "*R*G*B*";
        int stampCost = 11;
        int pushCost = 100;
        assertEquals(422, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case78() {
        String desiredColor = "R*G*B*R*G*B*R*G*B*R*G*B*R*G*B*R*G*B*R*G*B*R*G*B*RB";
        int stampCost = 13;
        int pushCost = 3;
        assertEquals(163, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case79() {
        String desiredColor = "RRR***G";
        int stampCost = 5;
        int pushCost = 10;
        assertEquals(45, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case80() {
        String desiredColor = "*R*RG*G*GR*RGG*G*GG****R***RRGGGRRRR*G**G";
        int stampCost = 35;
        int pushCost = 142;
        assertEquals(2377, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case81() {
        String desiredColor = "RBGRBGRBGRBGRBGRBGRBGRBGRBGRBGRBGRBGRBGRBGRBGRGBRG";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(5100000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case82() {
        String desiredColor = "****B*GB****R";
        int stampCost = 10000;
        int pushCost = 1;
        assertEquals(10013, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case83() {
        String desiredColor = "*********R**********B*********G***********R*******";
        int stampCost = 3;
        int pushCost = 5;
        assertEquals(55, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case84() {
        String desiredColor = "RR*BB";
        int stampCost = 100;
        int pushCost = 10000;
        assertEquals(30200, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case85() {
        String desiredColor = "***";
        int stampCost = 10000;
        int pushCost = 1;
        assertEquals(10003, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case86() {
        String desiredColor = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(100050, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case87() {
        String desiredColor = "**************************************";
        int stampCost = 12;
        int pushCost = 6;
        assertEquals(108, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case88() {
        String desiredColor = "**R***BG**G*R**B*G*G***RB**G****";
        int stampCost = 1;
        int pushCost = 20;
        assertEquals(263, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case89() {
        String desiredColor = "RR*B";
        int stampCost = 1;
        int pushCost = 5;
        assertEquals(12, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case90() {
        String desiredColor = "R***G";
        int stampCost = 1;
        int pushCost = 100;
        assertEquals(302, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case91() {
        String desiredColor = "*R*RG*G*GR*RGG*G*GGR***RR*GG*R*RG****GR***RR*GG";
        int stampCost = 43;
        int pushCost = 54;
        assertEquals(1101, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case92() {
        String desiredColor = "R************************GB***********************";
        int stampCost = 1;
        int pushCost = 20;
        assertEquals(93, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case93() {
        String desiredColor = "******B***R***R*B**";
        int stampCost = 2;
        int pushCost = 7;
        assertEquals(43, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case94() {
        String desiredColor = "GG*RR";
        int stampCost = 1;
        int pushCost = 1000;
        assertEquals(3002, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case95() {
        String desiredColor = "G****BR**B";
        int stampCost = 25142;
        int pushCost = 76188;
        assertEquals(431224, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case96() {
        String desiredColor = "RR*GGBBB";
        int stampCost = 1;
        int pushCost = 10;
        assertEquals(52, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case97() {
        String desiredColor = "G**RB*R*B*BG*B*B*B******R*R*****BG**";
        int stampCost = 14;
        int pushCost = 1;
        assertEquals(47, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case98() {
        String desiredColor = "**RR*GGGRRR***********BB***R";
        int stampCost = 66576;
        int pushCost = 2671;
        assertEquals(141364, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case99() {
        String desiredColor = "R*G";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(300001, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case100() {
        String desiredColor = "RRRRRR";
        int stampCost = 1;
        int pushCost = 1000;
        assertEquals(1006, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case101() {
        String desiredColor = "**************************************************";
        int stampCost = 986;
        int pushCost = 34123;
        assertEquals(83423, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case102() {
        String desiredColor = "RRRRRR";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(100006, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case103() {
        String desiredColor = "**RR*R**R*G****RRBB****BB****R*G*G*GG****BBBBB***";
        int stampCost = 20;
        int pushCost = 30;
        assertEquals(500, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case104() {
        String desiredColor = "R*BGGRRBB";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(900001, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case105() {
        String desiredColor = "RG";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(300000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case106() {
        String desiredColor = "R*B";
        int stampCost = 1;
        int pushCost = 100;
        assertEquals(301, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case107() {
        String desiredColor = "RR**R**BB";
        int stampCost = 1;
        int pushCost = 1000;
        assertEquals(3003, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case108() {
        String desiredColor = "R*****G";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(300003, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case109() {
        String desiredColor = "**************************************************";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(15, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case110() {
        String desiredColor = "******";
        int stampCost = 1;
        int pushCost = 100;
        assertEquals(106, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case111() {
        String desiredColor = "R";
        int stampCost = 1;
        int pushCost = 2;
        assertEquals(3, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case112() {
        String desiredColor = "***********************************************RGR";
        int stampCost = 10000;
        int pushCost = 1;
        assertEquals(10050, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case113() {
        String desiredColor = "*************B*********G************GG";
        int stampCost = 4;
        int pushCost = 10;
        assertEquals(80, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case114() {
        String desiredColor = "R****BGGGG";
        int stampCost = 1;
        int pushCost = 999;
        assertEquals(3999, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case115() {
        String desiredColor = "G*GR**B*BRBG*RRBG*RGGR**";
        int stampCost = 79052;
        int pushCost = 13175;
        assertEquals(395252, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case116() {
        String desiredColor = "BR*B*";
        int stampCost = 98;
        int pushCost = 513;
        assertEquals(2663, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case117() {
        String desiredColor = "R*G";
        int stampCost = 1;
        int pushCost = 100;
        assertEquals(301, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case118() {
        String desiredColor = "****************G*********************************";
        int stampCost = 1000;
        int pushCost = 1000;
        assertEquals(15000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case119() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRGRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int stampCost = 10000;
        int pushCost = 10000;
        assertEquals(510000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case120() {
        String desiredColor = "RGBRGBRGB";
        int stampCost = 65536;
        int pushCost = 65536;
        assertEquals(655360, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case121() {
        String desiredColor = "RRRRRRRRRRBRRRRRRRRRR";
        int stampCost = 7;
        int pushCost = 98744;
        assertEquals(2073631, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case122() {
        String desiredColor = "*";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(2, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case123() {
        String desiredColor = "RR*R*B***";
        int stampCost = 12190;
        int pushCost = 25377;
        assertEquals(124891, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case124() {
        String desiredColor = "************************************R*************";
        int stampCost = 11;
        int pushCost = 12;
        assertEquals(170, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case125() {
        String desiredColor = "B*G";
        int stampCost = 1;
        int pushCost = 10000;
        assertEquals(30001, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case126() {
        String desiredColor = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        int stampCost = 1;
        int pushCost = 50000;
        assertEquals(50050, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case127() {
        String desiredColor = "R*G";
        int stampCost = 1;
        int pushCost = 10000;
        assertEquals(30001, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case128() {
        String desiredColor = "RRR*GGG";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(300003, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case129() {
        String desiredColor = "R**RRRR***GGGGG";
        int stampCost = 13;
        int pushCost = 19;
        assertEquals(122, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case130() {
        String desiredColor = "*****************************************RR**GR*G*";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(2700000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case131() {
        String desiredColor = "**";
        int stampCost = 1;
        int pushCost = 100;
        assertEquals(102, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case132() {
        String desiredColor = "*RGB*";
        int stampCost = 4;
        int pushCost = 4;
        assertEquals(24, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case133() {
        String desiredColor = "RRRBBBBGGGGRRRRBBBB";
        int stampCost = 1;
        int pushCost = 10000;
        assertEquals(90003, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case134() {
        String desiredColor = "*GG*B**B**B*BB*G*BBB**B**B**B**B**B*BB*G*BBB**B**B";
        int stampCost = 7;
        int pushCost = 1;
        assertEquals(38, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case135() {
        String desiredColor = "RRRR";
        int stampCost = 2;
        int pushCost = 1000;
        assertEquals(1008, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case136() {
        String desiredColor = "RRBRR";
        int stampCost = 1;
        int pushCost = 100;
        assertEquals(501, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case137() {
        String desiredColor = "R*B";
        int stampCost = 3;
        int pushCost = 100;
        assertEquals(303, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case138() {
        String desiredColor = "*R*G*RGG*RRB*B***B**R**G**R**R**R**RGGG*R*G*BG*GR*";
        int stampCost = 100000;
        int pushCost = 100000;
        assertEquals(2900000, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case139() {
        String desiredColor = "BB*R*G*BBR*GRR*";
        int stampCost = 39197;
        int pushCost = 70687;
        assertEquals(1099502, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case140() {
        String desiredColor = "**************************************************";
        int stampCost = 1;
        int pushCost = 100000;
        assertEquals(100050, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case141() {
        String desiredColor = "RR**GRRRR*";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(8, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case142() {
        String desiredColor = "R***B";
        int stampCost = 1;
        int pushCost = 1000;
        assertEquals(3002, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case143() {
        String desiredColor = "*************";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(8, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case144() {
        String desiredColor = "BRR***BBRR***GGG**RR**BBB****RRR";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(33, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case145() {
        String desiredColor = "**************************************************";
        int stampCost = 4;
        int pushCost = 7;
        assertEquals(75, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void case146() {
        String desiredColor = "*R*G*B*GR*B*RG*B";
        int stampCost = 1;
        int pushCost = 1867;
        assertEquals(29873, stamp.getMinimumCost(desiredColor, stampCost, pushCost));
    }

}
