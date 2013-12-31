package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BigFatIntegerTest {
    BigFatInteger bigfatinteger = new BigFatInteger();

    @Test
    public void case1() {
        int A = 6;
        int B = 1;
        assertEquals(2, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case2() {
        int A = 162;
        int B = 1;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case3() {
        int A = 999983;
        int B = 9;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case4() {
        int A = 360;
        int B = 8;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case5() {
        int A = 524288;
        int B = 1000000;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case6() {
        int A = 65536;
        int B = 524288;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case7() {
        int A = 16384;
        int B = 599186;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case8() {
        int A = 1024;
        int B = 838861;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case9() {
        int A = 379970;
        int B = 263530;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case10() {
        int A = 455613;
        int B = 850419;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case11() {
        int A = 1854;
        int B = 452226;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case12() {
        int A = 754246;
        int B = 850987;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case13() {
        int A = 697793;
        int B = 479254;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case14() {
        int A = 493081;
        int B = 441207;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case15() {
        int A = 887624;
        int B = 946668;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case16() {
        int A = 961298;
        int B = 769572;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case17() {
        int A = 19682;
        int B = 306509;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case18() {
        int A = 445612;
        int B = 999460;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case19() {
        int A = 622658;
        int B = 20132;
        assertEquals(17, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case20() {
        int A = 210482;
        int B = 880822;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case21() {
        int A = 797631;
        int B = 443335;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case22() {
        int A = 668882;
        int B = 81002;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case23() {
        int A = 428445;
        int B = 270660;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case24() {
        int A = 710858;
        int B = 363565;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case25() {
        int A = 44916;
        int B = 166469;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case26() {
        int A = 848879;
        int B = 804577;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case27() {
        int A = 841356;
        int B = 162093;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case28() {
        int A = 213201;
        int B = 968049;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case29() {
        int A = 254707;
        int B = 965564;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case30() {
        int A = 686279;
        int B = 257820;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case31() {
        int A = 460121;
        int B = 142942;
        assertEquals(20, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case32() {
        int A = 621718;
        int B = 603423;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case33() {
        int A = 185512;
        int B = 439925;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case34() {
        int A = 594994;
        int B = 377489;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case35() {
        int A = 73092;
        int B = 588660;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case36() {
        int A = 737962;
        int B = 493538;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case37() {
        int A = 857375;
        int B = 135794;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case38() {
        int A = 794031;
        int B = 507542;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case39() {
        int A = 935818;
        int B = 922290;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case40() {
        int A = 952441;
        int B = 124485;
        assertEquals(20, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case41() {
        int A = 916856;
        int B = 264083;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case42() {
        int A = 289575;
        int B = 210001;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case43() {
        int A = 163891;
        int B = 489461;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case44() {
        int A = 111953;
        int B = 312746;
        assertEquals(20, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case45() {
        int A = 900817;
        int B = 639346;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case46() {
        int A = 668031;
        int B = 979819;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case47() {
        int A = 164082;
        int B = 554344;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case48() {
        int A = 435906;
        int B = 992603;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case49() {
        int A = 33248;
        int B = 345993;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case50() {
        int A = 302982;
        int B = 226042;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case51() {
        int A = 515647;
        int B = 495465;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case52() {
        int A = 446823;
        int B = 421924;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case53() {
        int A = 191011;
        int B = 523830;
        assertEquals(21, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case54() {
        int A = 226953;
        int B = 620987;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case55() {
        int A = 638897;
        int B = 359602;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case56() {
        int A = 422949;
        int B = 565107;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case57() {
        int A = 795322;
        int B = 838149;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case58() {
        int A = 622176;
        int B = 150605;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case59() {
        int A = 502320;
        int B = 325115;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case60() {
        int A = 446040;
        int B = 553481;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case61() {
        int A = 822360;
        int B = 567775;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case62() {
        int A = 252420;
        int B = 775779;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case63() {
        int A = 590940;
        int B = 876037;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case64() {
        int A = 124740;
        int B = 689286;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case65() {
        int A = 308280;
        int B = 841345;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case66() {
        int A = 994140;
        int B = 468144;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case67() {
        int A = 771540;
        int B = 403026;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case68() {
        int A = 567420;
        int B = 246984;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case69() {
        int A = 937860;
        int B = 133259;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case70() {
        int A = 557340;
        int B = 825067;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case71() {
        int A = 148260;
        int B = 76492;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case72() {
        int A = 338520;
        int B = 608233;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case73() {
        int A = 463680;
        int B = 4674;
        assertEquals(20, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case74() {
        int A = 773640;
        int B = 834346;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case75() {
        int A = 97860;
        int B = 3880;
        assertEquals(18, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case76() {
        int A = 62160;
        int B = 649464;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case77() {
        int A = 800100;
        int B = 751399;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case78() {
        int A = 499800;
        int B = 317719;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case79() {
        int A = 555660;
        int B = 470053;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case80() {
        int A = 476280;
        int B = 741441;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case81() {
        int A = 569940;
        int B = 980627;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case82() {
        int A = 78540;
        int B = 773600;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case83() {
        int A = 800520;
        int B = 944597;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case84() {
        int A = 161280;
        int B = 571059;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case85() {
        int A = 206220;
        int B = 943239;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case86() {
        int A = 688380;
        int B = 70534;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case87() {
        int A = 418320;
        int B = 938754;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case88() {
        int A = 843360;
        int B = 714263;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case89() {
        int A = 252000;
        int B = 119821;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case90() {
        int A = 68040;
        int B = 283105;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case91() {
        int A = 719460;
        int B = 8065;
        assertEquals(19, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case92() {
        int A = 159180;
        int B = 679816;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case93() {
        int A = 333060;
        int B = 296934;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case94() {
        int A = 858900;
        int B = 678889;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case95() {
        int A = 413700;
        int B = 102879;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case96() {
        int A = 744240;
        int B = 792734;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case97() {
        int A = 154560;
        int B = 481290;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case98() {
        int A = 27300;
        int B = 407728;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case99() {
        int A = 96600;
        int B = 827279;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case100() {
        int A = 836220;
        int B = 587346;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case101() {
        int A = 526260;
        int B = 83989;
        assertEquals(23, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case102() {
        int A = 541800;
        int B = 484661;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case103() {
        int A = 930720;
        int B = 512980;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case104() {
        int A = 24360;
        int B = 357852;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case105() {
        int A = 899640;
        int B = 128206;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case106() {
        int A = 879480;
        int B = 346627;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case107() {
        int A = 963480;
        int B = 533980;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case108() {
        int A = 414960;
        int B = 216678;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case109() {
        int A = 288;
        int B = 10000;
        assertEquals(18, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case110() {
        int A = 777600;
        int B = 1000000;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case111() {
        int A = 32768;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case112() {
        int A = 32;
        int B = 3;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case113() {
        int A = 1000000;
        int B = 1000000;
        assertEquals(25, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case114() {
        int A = 2;
        int B = 15;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case115() {
        int A = 32;
        int B = 5;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case116() {
        int A = 2;
        int B = 255;
        assertEquals(9, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case117() {
        int A = 2;
        int B = 7;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case118() {
        int A = 72;
        int B = 17;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case119() {
        int A = 216;
        int B = 5;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case120() {
        int A = 432000;
        int B = 24;
        assertEquals(11, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case121() {
        int A = 8;
        int B = 5;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case122() {
        int A = 9;
        int B = 7;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case123() {
        int A = 210;
        int B = 254;
        assertEquals(12, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case124() {
        int A = 840;
        int B = 10;
        assertEquals(9, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case125() {
        int A = 216;
        int B = 1;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case126() {
        int A = 265837;
        int B = 5;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case127() {
        int A = 737280;
        int B = 1000000;
        assertEquals(27, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case128() {
        int A = 64;
        int B = 657;
        assertEquals(13, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case129() {
        int A = 360;
        int B = 21;
        assertEquals(9, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case130() {
        int A = 216;
        int B = 12345;
        assertEquals(18, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case131() {
        int A = 8;
        int B = 21;
        assertEquals(7, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case132() {
        int A = 1440;
        int B = 5;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case133() {
        int A = 3;
        int B = 7;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case134() {
        int A = 579428;
        int B = 146145;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case135() {
        int A = 512;
        int B = 9;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case136() {
        int A = 27;
        int B = 5;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case137() {
        int A = 2;
        int B = 31;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case138() {
        int A = 432;
        int B = 1;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case139() {
        int A = 6;
        int B = 7;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case140() {
        int A = 32;
        int B = 6;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case141() {
        int A = 648;
        int B = 1;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case142() {
        int A = 9;
        int B = 1;
        assertEquals(2, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case143() {
        int A = 67500;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case144() {
        int A = 315000;
        int B = 47;
        assertEquals(12, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case145() {
        int A = 40;
        int B = 5;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case146() {
        int A = 7;
        int B = 127;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case147() {
        int A = 4;
        int B = 1;
        assertEquals(2, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case148() {
        int A = 2;
        int B = 1023;
        assertEquals(11, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case149() {
        int A = 900000;
        int B = 3;
        assertEquals(7, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case150() {
        int A = 170100;
        int B = 424242;
        assertEquals(26, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case151() {
        int A = 840;
        int B = 125;
        assertEquals(13, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case152() {
        int A = 52488;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case153() {
        int A = 2;
        int B = 27;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case154() {
        int A = 128;
        int B = 1;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case155() {
        int A = 20182;
        int B = 1;
        assertEquals(2, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case156() {
        int A = 33750;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case157() {
        int A = 29934;
        int B = 745159;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case158() {
        int A = 1536;
        int B = 9;
        assertEquals(9, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case159() {
        int A = 2048;
        int B = 11;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case160() {
        int A = 6912;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case161() {
        int A = 567808;
        int B = 334575;
        assertEquals(24, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case162() {
        int A = 6;
        int B = 859593;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case163() {
        int A = 80;
        int B = 59;
        assertEquals(10, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case164() {
        int A = 8;
        int B = 9;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case165() {
        int A = 59049;
        int B = 10;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case166() {
        int A = 8;
        int B = 10;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case167() {
        int A = 279936;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case168() {
        int A = 131072;
        int B = 17;
        assertEquals(10, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case169() {
        int A = 399964;
        int B = 27893;
        assertEquals(18, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case170() {
        int A = 16;
        int B = 7;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case171() {
        int A = 2;
        int B = 63;
        assertEquals(7, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case172() {
        int A = 864;
        int B = 3;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case173() {
        int A = 7776;
        int B = 3;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case174() {
        int A = 32;
        int B = 17;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case175() {
        int A = 2;
        int B = 127;
        assertEquals(8, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case176() {
        int A = 23328;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case177() {
        int A = 27;
        int B = 10;
        assertEquals(6, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case178() {
        int A = 7;
        int B = 7;
        assertEquals(4, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case179() {
        int A = 559872;
        int B = 1;
        assertEquals(5, bigfatinteger.minOperations(A, B));
    }

    @Test
    public void case180() {
        int A = 478034;
        int B = 1000000;
        assertEquals(22, bigfatinteger.minOperations(A, B));
    }

}
