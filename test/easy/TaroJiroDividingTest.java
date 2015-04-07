package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TaroJiroDividingTest {
    TaroJiroDividing tarojirodividing = new TaroJiroDividing();

    @Test
    public void case1() {
        int A = 8;
        int B = 4;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case2() {
        int A = 4;
        int B = 7;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case3() {
        int A = 12;
        int B = 12;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case4() {
        int A = 24;
        int B = 96;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case5() {
        int A = 1000000000;
        int B = 999999999;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case6() {
        int A = 42;
        int B = 18468;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case7() {
        int A = 6335;
        int B = 26501;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case8() {
        int A = 19170;
        int B = 15725;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case9() {
        int A = 11479;
        int B = 29359;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case10() {
        int A = 26963;
        int B = 24465;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case11() {
        int A = 5706;
        int B = 28146;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case12() {
        int A = 23282;
        int B = 16828;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case13() {
        int A = 9962;
        int B = 492;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case14() {
        int A = 2996;
        int B = 11943;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case15() {
        int A = 4828;
        int B = 5437;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case16() {
        int A = 32392;
        int B = 14605;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case17() {
        int A = 3903;
        int B = 154;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case18() {
        int A = 293;
        int B = 12383;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case19() {
        int A = 17422;
        int B = 18717;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case20() {
        int A = 19719;
        int B = 19896;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case21() {
        int A = 5448;
        int B = 21727;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case22() {
        int A = 14772;
        int B = 11539;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case23() {
        int A = 1870;
        int B = 19913;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case24() {
        int A = 25668;
        int B = 26300;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case25() {
        int A = 17036;
        int B = 9895;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case26() {
        int A = 5632;
        int B = 2816;
        assertEquals(9, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case27() {
        int A = 2672;
        int B = 5344;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case28() {
        int A = 2272;
        int B = 284;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case29() {
        int A = 6952;
        int B = 869;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case30() {
        int A = 1326;
        int B = 1326;
        assertEquals(2, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case31() {
        int A = 6880;
        int B = 1720;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case32() {
        int A = 4240;
        int B = 1060;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case33() {
        int A = 1152;
        int B = 2304;
        assertEquals(8, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case34() {
        int A = 4624;
        int B = 4624;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case35() {
        int A = 943;
        int B = 943;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case36() {
        int A = 3812864;
        int B = 122011648;
        assertEquals(10, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case37() {
        int A = 441057280;
        int B = 110264320;
        assertEquals(16, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case38() {
        int A = 164069376;
        int B = 40056;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case39() {
        int A = 14196;
        int B = 454272;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case40() {
        int A = 4183040;
        int B = 4085;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case41() {
        int A = 117824;
        int B = 120651776;
        assertEquals(7, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case42() {
        int A = 4026368;
        int B = 251648;
        assertEquals(9, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case43() {
        int A = 9760;
        int B = 639631360;
        assertEquals(6, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case44() {
        int A = 5670912;
        int B = 1417728;
        assertEquals(10, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case45() {
        int A = 68255744;
        int B = 4265984;
        assertEquals(12, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case46() {
        int A = 9900032;
        int B = 39600128;
        assertEquals(13, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case47() {
        int A = 4945408;
        int B = 38636;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case48() {
        int A = 15912;
        int B = 8146944;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case49() {
        int A = 76384;
        int B = 312868864;
        assertEquals(6, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case50() {
        int A = 7091200;
        int B = 443200;
        assertEquals(7, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case51() {
        int A = 11939840;
        int B = 46640;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case52() {
        int A = 326272;
        int B = 5220352;
        assertEquals(8, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case53() {
        int A = 26328;
        int B = 215678976;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case54() {
        int A = 2412544;
        int B = 2356;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case55() {
        int A = 730726400;
        int B = 5708800;
        assertEquals(11, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case56() {
        int A = 481755136;
        int B = 58808;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case57() {
        int A = 110400;
        int B = 1766400;
        assertEquals(7, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case58() {
        int A = 2269184;
        int B = 141824;
        assertEquals(10, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case59() {
        int A = 175374336;
        int B = 171264;
        assertEquals(9, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case60() {
        int A = 63520768;
        int B = 31016;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case61() {
        int A = 18247680;
        int B = 8910;
        assertEquals(2, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case62() {
        int A = 17293312;
        int B = 69173248;
        assertEquals(14, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case63() {
        int A = 19788;
        int B = 324206592;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case64() {
        int A = 1641984;
        int B = 6414;
        assertEquals(2, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case65() {
        int A = 1327104;
        int B = 10368;
        assertEquals(8, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case66() {
        int A = 2228608;
        int B = 4457216;
        assertEquals(8, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case67() {
        int A = 84123648;
        int B = 164304;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case68() {
        int A = 14129152;
        int B = 110384;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case69() {
        int A = 194808;
        int B = 389616;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case70() {
        int A = 150000;
        int B = 600000;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case71() {
        int A = 384352;
        int B = 787152896;
        assertEquals(6, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case72() {
        int A = 314704;
        int B = 10070528;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case73() {
        int A = 620625920;
        int B = 9470;
        assertEquals(2, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case74() {
        int A = 105676;
        int B = 422704;
        assertEquals(3, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case75() {
        int A = 7578;
        int B = 7759872;
        assertEquals(2, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case76() {
        int A = 244383744;
        int B = 119328;
        assertEquals(6, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case77() {
        int A = 736755712;
        int B = 719488;
        assertEquals(8, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case78() {
        int A = 228976;
        int B = 937885696;
        assertEquals(5, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case79() {
        int A = 38973440;
        int B = 9515;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case80() {
        int A = 38780928;
        int B = 4847616;
        assertEquals(12, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case81() {
        int A = 43008000;
        int B = 21000;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case82() {
        int A = 747077632;
        int B = 22799;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case83() {
        int A = 90185728;
        int B = 88072;
        assertEquals(4, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case84() {
        int A = 30699520;
        int B = 982384640;
        assertEquals(13, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case85() {
        int A = 655552;
        int B = 2622208;
        assertEquals(7, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case86() {
        int A = 1;
        int B = 2;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case87() {
        int A = 7;
        int B = 7;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case88() {
        int A = 5;
        int B = 5;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case89() {
        int A = 15;
        int B = 15;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case90() {
        int A = 1;
        int B = 1;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case91() {
        int A = 1;
        int B = 8;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case92() {
        int A = 2;
        int B = 1;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case93() {
        int A = 124;
        int B = 512;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case94() {
        int A = 7;
        int B = 14;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case95() {
        int A = 10;
        int B = 5;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case96() {
        int A = 3;
        int B = 3;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case97() {
        int A = 6;
        int B = 3;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case98() {
        int A = 9;
        int B = 27;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case99() {
        int A = 6;
        int B = 8;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case100() {
        int A = 4;
        int B = 5;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case101() {
        int A = 3;
        int B = 5;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case102() {
        int A = 15;
        int B = 3;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case103() {
        int A = 14;
        int B = 7;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case104() {
        int A = 8;
        int B = 1;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case105() {
        int A = 4;
        int B = 12;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case106() {
        int A = 1;
        int B = 12;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case107() {
        int A = 24;
        int B = 16;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case108() {
        int A = 1;
        int B = 3;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case109() {
        int A = 1;
        int B = 4;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case110() {
        int A = 6;
        int B = 1;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case111() {
        int A = 10;
        int B = 2;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case112() {
        int A = 18;
        int B = 4;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case113() {
        int A = 7;
        int B = 6;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case114() {
        int A = 24;
        int B = 36;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case115() {
        int A = 9;
        int B = 18;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case116() {
        int A = 5;
        int B = 10;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case117() {
        int A = 3;
        int B = 6;
        assertEquals(1, tarojirodividing.getNumber(A, B));
    }

    @Test
    public void case118() {
        int A = 12;
        int B = 2;
        assertEquals(0, tarojirodividing.getNumber(A, B));
    }

}
