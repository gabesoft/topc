package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ChickenOracleTest {
    ChickenOracle chickenoracle = new ChickenOracle();

    @Test
    public void case1() {
        int n = 10;
        int eggCount = 10;
        int lieCount = 0;
        int liarCount = 0;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case2() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 0;
        int liarCount = 30;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case3() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 5;
        int liarCount = 25;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case4() {
        int n = 1000;
        int eggCount = 500;
        int lieCount = 250;
        int liarCount = 250;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case5() {
        int n = 1;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case6() {
        int n = 396517;
        int eggCount = 28344;
        int lieCount = 199491;
        int liarCount = 161224;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case7() {
        int n = 762085;
        int eggCount = 174382;
        int lieCount = 591906;
        int liarCount = 731022;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case8() {
        int n = 245559;
        int eggCount = 225911;
        int lieCount = 154421;
        int liarCount = 4998;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case9() {
        int n = 519706;
        int eggCount = 277311;
        int lieCount = 364769;
        int liarCount = 257393;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case10() {
        int n = 72385;
        int eggCount = 31903;
        int lieCount = 7837;
        int liarCount = 10658;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case11() {
        int n = 559116;
        int eggCount = 187570;
        int lieCount = 443186;
        int liarCount = 60279;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case12() {
        int n = 621417;
        int eggCount = 180385;
        int lieCount = 641;
        int liarCount = 450302;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case13() {
        int n = 498424;
        int eggCount = 25415;
        int lieCount = 45906;
        int liarCount = 448391;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case14() {
        int n = 325835;
        int eggCount = 238497;
        int lieCount = 114888;
        int liarCount = 85492;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case15() {
        int n = 497223;
        int eggCount = 236730;
        int lieCount = 70808;
        int liarCount = 471449;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case16() {
        int n = 338919;
        int eggCount = 310645;
        int lieCount = 70422;
        int liarCount = 304279;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case17() {
        int n = 560054;
        int eggCount = 91058;
        int lieCount = 139916;
        int liarCount = 12375;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case18() {
        int n = 131781;
        int eggCount = 102924;
        int lieCount = 71553;
        int liarCount = 55554;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case19() {
        int n = 756935;
        int eggCount = 331458;
        int lieCount = 620003;
        int liarCount = 751210;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case20() {
        int n = 298057;
        int eggCount = 282337;
        int lieCount = 59551;
        int liarCount = 196826;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case21() {
        int n = 348407;
        int eggCount = 128958;
        int lieCount = 128612;
        int liarCount = 125877;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case22() {
        int n = 933615;
        int eggCount = 357697;
        int lieCount = 739848;
        int liarCount = 43938;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case23() {
        int n = 768469;
        int eggCount = 426448;
        int lieCount = 235987;
        int liarCount = 333412;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case24() {
        int n = 300410;
        int eggCount = 257594;
        int lieCount = 5989;
        int liarCount = 224034;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case25() {
        int n = 765658;
        int eggCount = 438802;
        int lieCount = 505627;
        int liarCount = 145878;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case26() {
        int n = 1;
        int eggCount = 0;
        int lieCount = 0;
        int liarCount = 0;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case27() {
        int n = 1;
        int eggCount = 0;
        int lieCount = 0;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case28() {
        int n = 1;
        int eggCount = 0;
        int lieCount = 1;
        int liarCount = 0;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case29() {
        int n = 1;
        int eggCount = 0;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case30() {
        int n = 1;
        int eggCount = 1;
        int lieCount = 0;
        int liarCount = 0;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case31() {
        int n = 1;
        int eggCount = 1;
        int lieCount = 0;
        int liarCount = 1;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case32() {
        int n = 1;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 0;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case33() {
        int n = 1;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case34() {
        int n = 962850;
        int eggCount = 19055;
        int lieCount = 64313;
        int liarCount = 85888;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case35() {
        int n = 862583;
        int eggCount = 486499;
        int lieCount = 301630;
        int liarCount = 493215;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case36() {
        int n = 957641;
        int eggCount = 676883;
        int lieCount = 540997;
        int liarCount = 238519;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case37() {
        int n = 813451;
        int eggCount = 375748;
        int lieCount = 414019;
        int liarCount = 259012;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case38() {
        int n = 945090;
        int eggCount = 793978;
        int lieCount = 512433;
        int liarCount = 54330;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case39() {
        int n = 835921;
        int eggCount = 339171;
        int lieCount = 513339;
        int liarCount = 776135;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case40() {
        int n = 965509;
        int eggCount = 361898;
        int lieCount = 778610;
        int liarCount = 858544;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case41() {
        int n = 849225;
        int eggCount = 184371;
        int lieCount = 641096;
        int liarCount = 611762;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case42() {
        int n = 802246;
        int eggCount = 37329;
        int lieCount = 473034;
        int liarCount = 165902;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case43() {
        int n = 969311;
        int eggCount = 361659;
        int lieCount = 296286;
        int liarCount = 208426;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case44() {
        int n = 819514;
        int eggCount = 421564;
        int lieCount = 230281;
        int liarCount = 54819;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case45() {
        int n = 925310;
        int eggCount = 874810;
        int lieCount = 775864;
        int liarCount = 411750;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case46() {
        int n = 811502;
        int eggCount = 533611;
        int lieCount = 171872;
        int liarCount = 75650;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case47() {
        int n = 916436;
        int eggCount = 817088;
        int lieCount = 178455;
        int liarCount = 579562;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case48() {
        int n = 951774;
        int eggCount = 929187;
        int lieCount = 897231;
        int liarCount = 57006;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case49() {
        int n = 852037;
        int eggCount = 577253;
        int lieCount = 340259;
        int liarCount = 177278;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case50() {
        int n = 920552;
        int eggCount = 64517;
        int lieCount = 595740;
        int liarCount = 454457;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case51() {
        int n = 950051;
        int eggCount = 8270;
        int lieCount = 743079;
        int liarCount = 430550;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case52() {
        int n = 819775;
        int eggCount = 399440;
        int lieCount = 777548;
        int liarCount = 482922;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case53() {
        int n = 892059;
        int eggCount = 795464;
        int lieCount = 486421;
        int liarCount = 142293;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case54() {
        int n = 87;
        int eggCount = 49;
        int lieCount = 44;
        int liarCount = 44;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case55() {
        int n = 7;
        int eggCount = 5;
        int lieCount = 4;
        int liarCount = 1;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case56() {
        int n = 97;
        int eggCount = 49;
        int lieCount = 42;
        int liarCount = 57;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case57() {
        int n = 53;
        int eggCount = 26;
        int lieCount = 24;
        int liarCount = 25;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case58() {
        int n = 100;
        int eggCount = 52;
        int lieCount = 57;
        int liarCount = 41;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case59() {
        int n = 36;
        int eggCount = 25;
        int lieCount = 17;
        int liarCount = 16;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case60() {
        int n = 64;
        int eggCount = 37;
        int lieCount = 29;
        int liarCount = 28;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case61() {
        int n = 88;
        int eggCount = 48;
        int lieCount = 42;
        int liarCount = 40;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case62() {
        int n = 4;
        int eggCount = 1;
        int lieCount = 2;
        int liarCount = 1;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case63() {
        int n = 58;
        int eggCount = 27;
        int lieCount = 30;
        int liarCount = 23;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case64() {
        int n = 29;
        int eggCount = 17;
        int lieCount = 15;
        int liarCount = 12;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case65() {
        int n = 90;
        int eggCount = 44;
        int lieCount = 44;
        int liarCount = 46;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case66() {
        int n = 116434;
        int eggCount = 58220;
        int lieCount = 58285;
        int liarCount = 57939;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case67() {
        int n = 244034;
        int eggCount = 122250;
        int lieCount = 121998;
        int liarCount = 122176;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case68() {
        int n = 995016;
        int eggCount = 497109;
        int lieCount = 497790;
        int liarCount = 497099;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case69() {
        int n = 535929;
        int eggCount = 267649;
        int lieCount = 267975;
        int liarCount = 268246;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case70() {
        int n = 479389;
        int eggCount = 239192;
        int lieCount = 239314;
        int liarCount = 239727;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case71() {
        int n = 142582;
        int eggCount = 71453;
        int lieCount = 71321;
        int liarCount = 70944;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case72() {
        int n = 632259;
        int eggCount = 316275;
        int lieCount = 315904;
        int liarCount = 315926;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case73() {
        int n = 494254;
        int eggCount = 246683;
        int lieCount = 247645;
        int liarCount = 247370;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case74() {
        int n = 849338;
        int eggCount = 424843;
        int lieCount = 424517;
        int liarCount = 425628;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case75() {
        int n = 91724;
        int eggCount = 46223;
        int lieCount = 45983;
        int liarCount = 45750;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case76() {
        int n = 917800;
        int eggCount = 458527;
        int lieCount = 458464;
        int liarCount = 459925;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case77() {
        int n = 914513;
        int eggCount = 457351;
        int lieCount = 456571;
        int liarCount = 456982;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case78() {
        int n = 931608;
        int eggCount = 465692;
        int lieCount = 465780;
        int liarCount = 466326;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case79() {
        int n = 926724;
        int eggCount = 464301;
        int lieCount = 463897;
        int liarCount = 463006;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case80() {
        int n = 921449;
        int eggCount = 460204;
        int lieCount = 459308;
        int liarCount = 460862;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case81() {
        int n = 899919;
        int eggCount = 449839;
        int lieCount = 450367;
        int liarCount = 449254;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case82() {
        int n = 849424;
        int eggCount = 424813;
        int lieCount = 424458;
        int liarCount = 424837;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case83() {
        int n = 894545;
        int eggCount = 447647;
        int lieCount = 447092;
        int liarCount = 448149;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case84() {
        int n = 903469;
        int eggCount = 451657;
        int lieCount = 452056;
        int liarCount = 451551;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case85() {
        int n = 998912;
        int eggCount = 499229;
        int lieCount = 498025;
        int liarCount = 499226;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case86() {
        int n = 980666;
        int eggCount = 416750;
        int lieCount = 300673;
        int liarCount = 301195;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case87() {
        int n = 891946;
        int eggCount = 512498;
        int lieCount = 273483;
        int liarCount = 273821;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case88() {
        int n = 982760;
        int eggCount = 417827;
        int lieCount = 301373;
        int liarCount = 301904;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case89() {
        int n = 864732;
        int eggCount = 368502;
        int lieCount = 265772;
        int liarCount = 266006;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case90() {
        int n = 927095;
        int eggCount = 532371;
        int lieCount = 284804;
        int liarCount = 283940;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case91() {
        int n = 950896;
        int eggCount = 913780;
        int lieCount = 19042;
        int liarCount = 18860;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case92() {
        int n = 833259;
        int eggCount = 800804;
        int lieCount = 16670;
        int liarCount = 16409;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case93() {
        int n = 985823;
        int eggCount = 947734;
        int lieCount = 19414;
        int liarCount = 19401;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case94() {
        int n = 943694;
        int eggCount = 906696;
        int lieCount = 18872;
        int liarCount = 18914;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case95() {
        int n = 932042;
        int eggCount = 36179;
        int lieCount = 18482;
        int liarCount = 18473;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case96() {
        int n = 909322;
        int eggCount = 26763;
        int lieCount = 17953;
        int liarCount = 900154;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case97() {
        int n = 888081;
        int eggCount = 862023;
        int lieCount = 17577;
        int liarCount = 879298;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case98() {
        int n = 981719;
        int eggCount = 28783;
        int lieCount = 19506;
        int liarCount = 972012;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case99() {
        int n = 936606;
        int eggCount = 909272;
        int lieCount = 18588;
        int liarCount = 927464;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case100() {
        int n = 851974;
        int eggCount = 25238;
        int lieCount = 17057;
        int liarCount = 843425;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case101() {
        int n = 909322;
        int eggCount = 26763;
        int lieCount = 17953;
        int liarCount = 900154;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case102() {
        int n = 888081;
        int eggCount = 862023;
        int lieCount = 17577;
        int liarCount = 879298;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case103() {
        int n = 981719;
        int eggCount = 28783;
        int lieCount = 19506;
        int liarCount = 972012;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case104() {
        int n = 936606;
        int eggCount = 909272;
        int lieCount = 18588;
        int liarCount = 927464;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case105() {
        int n = 851974;
        int eggCount = 25238;
        int lieCount = 17057;
        int liarCount = 843425;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case106() {
        int n = 3;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case107() {
        int n = 10;
        int eggCount = 8;
        int lieCount = 2;
        int liarCount = 3;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case108() {
        int n = 10;
        int eggCount = 7;
        int lieCount = 4;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case109() {
        int n = 60;
        int eggCount = 23;
        int lieCount = 5;
        int liarCount = 25;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case110() {
        int n = 60;
        int eggCount = 24;
        int lieCount = 20;
        int liarCount = 5;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case111() {
        int n = 10;
        int eggCount = 3;
        int lieCount = 8;
        int liarCount = 7;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case112() {
        int n = 6;
        int eggCount = 6;
        int lieCount = 4;
        int liarCount = 4;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case113() {
        int n = 999;
        int eggCount = 500;
        int lieCount = 250;
        int liarCount = 250;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case114() {
        int n = 10;
        int eggCount = 7;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case115() {
        int n = 6;
        int eggCount = 0;
        int lieCount = 3;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case116() {
        int n = 10;
        int eggCount = 7;
        int lieCount = 8;
        int liarCount = 9;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case117() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 5;
        int liarCount = 21;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case118() {
        int n = 1000000;
        int eggCount = 1000000;
        int lieCount = 1000000;
        int liarCount = 1000000;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case119() {
        int n = 2;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case120() {
        int n = 60;
        int eggCount = 22;
        int lieCount = 5;
        int liarCount = 25;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case121() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 40;
        int liarCount = 4;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case122() {
        int n = 12833;
        int eggCount = 3;
        int lieCount = 823;
        int liarCount = 283;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case123() {
        int n = 10;
        int eggCount = 8;
        int lieCount = 3;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case124() {
        int n = 10;
        int eggCount = 0;
        int lieCount = 10;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case125() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 0;
        int liarCount = 0;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case126() {
        int n = 6;
        int eggCount = 3;
        int lieCount = 3;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case127() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 6;
        int liarCount = 25;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case128() {
        int n = 100;
        int eggCount = 96;
        int lieCount = 4;
        int liarCount = 5;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case129() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 5;
        int liarCount = 23;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case130() {
        int n = 6;
        int eggCount = 3;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case131() {
        int n = 5;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case132() {
        int n = 5;
        int eggCount = 3;
        int lieCount = 1;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case133() {
        int n = 60;
        int eggCount = 30;
        int lieCount = 20;
        int liarCount = 0;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case134() {
        int n = 1000;
        int eggCount = 345;
        int lieCount = 234;
        int liarCount = 123;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case135() {
        int n = 500;
        int eggCount = 251;
        int lieCount = 250;
        int liarCount = 250;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case136() {
        int n = 100;
        int eggCount = 90;
        int lieCount = 99;
        int liarCount = 99;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case137() {
        int n = 10;
        int eggCount = 5;
        int lieCount = 3;
        int liarCount = 4;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case138() {
        int n = 100;
        int eggCount = 40;
        int lieCount = 95;
        int liarCount = 35;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case139() {
        int n = 100;
        int eggCount = 50;
        int lieCount = 50;
        int liarCount = 2;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case140() {
        int n = 100;
        int eggCount = 100;
        int lieCount = 100;
        int liarCount = 100;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case141() {
        int n = 501;
        int eggCount = 1;
        int lieCount = 2;
        int liarCount = 1;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case142() {
        int n = 10000;
        int eggCount = 1000;
        int lieCount = 2000;
        int liarCount = 1004;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case143() {
        int n = 1000;
        int eggCount = 501;
        int lieCount = 799;
        int liarCount = 298;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case144() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 7;
        int liarCount = 25;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case145() {
        int n = 4;
        int eggCount = 3;
        int lieCount = 4;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case146() {
        int n = 100;
        int eggCount = 55;
        int lieCount = 50;
        int liarCount = 10;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case147() {
        int n = 100;
        int eggCount = 90;
        int lieCount = 5;
        int liarCount = 5;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case148() {
        int n = 3;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case149() {
        int n = 40;
        int eggCount = 25;
        int lieCount = 10;
        int liarCount = 5;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case150() {
        int n = 10;
        int eggCount = 10;
        int lieCount = 0;
        int liarCount = 10;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case151() {
        int n = 2;
        int eggCount = 1;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case152() {
        int n = 10;
        int eggCount = 0;
        int lieCount = 10;
        int liarCount = 0;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case153() {
        int n = 60;
        int eggCount = 4;
        int lieCount = 2;
        int liarCount = 3;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case154() {
        int n = 5;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case155() {
        int n = 3;
        int eggCount = 1;
        int lieCount = 0;
        int liarCount = 0;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case156() {
        int n = 10;
        int eggCount = 0;
        int lieCount = 10;
        int liarCount = 10;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case157() {
        int n = 3;
        int eggCount = 2;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case158() {
        int n = 5;
        int eggCount = 1;
        int lieCount = 4;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case159() {
        int n = 7;
        int eggCount = 5;
        int lieCount = 2;
        int liarCount = 3;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case160() {
        int n = 10;
        int eggCount = 4;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case161() {
        int n = 2;
        int eggCount = 0;
        int lieCount = 2;
        int liarCount = 0;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case162() {
        int n = 80;
        int eggCount = 20;
        int lieCount = 10;
        int liarCount = 5;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case163() {
        int n = 3;
        int eggCount = 2;
        int lieCount = 0;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case164() {
        int n = 986;
        int eggCount = 466;
        int lieCount = 967;
        int liarCount = 735;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case165() {
        int n = 2;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 2;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case166() {
        int n = 10;
        int eggCount = 3;
        int lieCount = 1;
        int liarCount = 3;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case167() {
        int n = 5;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case168() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 5;
        int liarCount = 15;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case169() {
        int n = 444136;
        int eggCount = 434320;
        int lieCount = 330890;
        int liarCount = 388736;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case170() {
        int n = 50;
        int eggCount = 41;
        int lieCount = 10;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case171() {
        int n = 40;
        int eggCount = 20;
        int lieCount = 20;
        int liarCount = 20;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case172() {
        int n = 100;
        int eggCount = 30;
        int lieCount = 30;
        int liarCount = 32;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case173() {
        int n = 100;
        int eggCount = 9;
        int lieCount = 10;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case174() {
        int n = 40;
        int eggCount = 12;
        int lieCount = 23;
        int liarCount = 35;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case175() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 5;
        int liarCount = 24;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case176() {
        int n = 3;
        int eggCount = 1;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case177() {
        int n = 9;
        int eggCount = 5;
        int lieCount = 3;
        int liarCount = 4;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case178() {
        int n = 2;
        int eggCount = 1;
        int lieCount = 0;
        int liarCount = 1;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case179() {
        int n = 10;
        int eggCount = 10;
        int lieCount = 10;
        int liarCount = 10;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case180() {
        int n = 1000;
        int eggCount = 200;
        int lieCount = 400;
        int liarCount = 400;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case181() {
        int n = 10;
        int eggCount = 4;
        int lieCount = 7;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case182() {
        int n = 1000;
        int eggCount = 500;
        int lieCount = 350;
        int liarCount = 300;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case183() {
        int n = 4;
        int eggCount = 0;
        int lieCount = 2;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case184() {
        int n = 9170;
        int eggCount = 6554;
        int lieCount = 2308;
        int liarCount = 1848;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case185() {
        int n = 4;
        int eggCount = 2;
        int lieCount = 1;
        int liarCount = 3;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case186() {
        int n = 100;
        int eggCount = 10;
        int lieCount = 10;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case187() {
        int n = 10;
        int eggCount = 8;
        int lieCount = 0;
        int liarCount = 0;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case188() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 5;
        int liarCount = 25;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case189() {
        int n = 60;
        int eggCount = 59;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case190() {
        int n = 100;
        int eggCount = 2;
        int lieCount = 75;
        int liarCount = 25;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case191() {
        int n = 100;
        int eggCount = 5;
        int lieCount = 3;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case192() {
        int n = 60;
        int eggCount = 30;
        int lieCount = 0;
        int liarCount = 30;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case193() {
        int n = 10;
        int eggCount = 5;
        int lieCount = 4;
        int liarCount = 3;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case194() {
        int n = 5;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 3;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case195() {
        int n = 60;
        int eggCount = 10;
        int lieCount = 7;
        int liarCount = 13;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case196() {
        int n = 100;
        int eggCount = 10;
        int lieCount = 90;
        int liarCount = 0;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case197() {
        int n = 100;
        int eggCount = 100;
        int lieCount = 1;
        int liarCount = 100;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case198() {
        int n = 6;
        int eggCount = 2;
        int lieCount = 4;
        int liarCount = 2;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case199() {
        int n = 10;
        int eggCount = 4;
        int lieCount = 4;
        int liarCount = 2;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case200() {
        int n = 14;
        int eggCount = 4;
        int lieCount = 2;
        int liarCount = 4;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case201() {
        int n = 4;
        int eggCount = 1;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case202() {
        int n = 60;
        int eggCount = 30;
        int lieCount = 5;
        int liarCount = 30;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case203() {
        int n = 10;
        int eggCount = 0;
        int lieCount = 1;
        int liarCount = 3;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case204() {
        int n = 10;
        int eggCount = 10;
        int lieCount = 10;
        int liarCount = 0;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case205() {
        int n = 10;
        int eggCount = 1;
        int lieCount = 3;
        int liarCount = 6;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case206() {
        int n = 17;
        int eggCount = 10;
        int lieCount = 8;
        int liarCount = 7;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case207() {
        int n = 20;
        int eggCount = 15;
        int lieCount = 2;
        int liarCount = 5;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case208() {
        int n = 10;
        int eggCount = 5;
        int lieCount = 3;
        int liarCount = 3;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case209() {
        int n = 10;
        int eggCount = 3;
        int lieCount = 5;
        int liarCount = 8;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case210() {
        int n = 10;
        int eggCount = 6;
        int lieCount = 0;
        int liarCount = 6;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case211() {
        int n = 100000;
        int eggCount = 19;
        int lieCount = 20;
        int liarCount = 13;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case212() {
        int n = 11;
        int eggCount = 10;
        int lieCount = 0;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case213() {
        int n = 60;
        int eggCount = 38;
        int lieCount = 5;
        int liarCount = 25;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case214() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 60;
        int liarCount = 50;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case215() {
        int n = 8;
        int eggCount = 5;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case216() {
        int n = 60;
        int eggCount = 8;
        int lieCount = 6;
        int liarCount = 4;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case217() {
        int n = 6;
        int eggCount = 6;
        int lieCount = 6;
        int liarCount = 6;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case218() {
        int n = 1000000;
        int eggCount = 1000000;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case219() {
        int n = 60;
        int eggCount = 60;
        int lieCount = 10;
        int liarCount = 20;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case220() {
        int n = 100;
        int eggCount = 75;
        int lieCount = 56;
        int liarCount = 23;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case221() {
        int n = 6;
        int eggCount = 4;
        int lieCount = 3;
        int liarCount = 1;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case222() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 35;
        int liarCount = 25;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case223() {
        int n = 10;
        int eggCount = 3;
        int lieCount = 4;
        int liarCount = 6;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case224() {
        int n = 10;
        int eggCount = 10;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case225() {
        int n = 60;
        int eggCount = 32;
        int lieCount = 5;
        int liarCount = 25;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case226() {
        int n = 10;
        int eggCount = 4;
        int lieCount = 3;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case227() {
        int n = 10;
        int eggCount = 10;
        int lieCount = 7;
        int liarCount = 7;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case228() {
        int n = 4;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case229() {
        int n = 30;
        int eggCount = 20;
        int lieCount = 5;
        int liarCount = 15;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case230() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 10;
        int liarCount = 20;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case231() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 8;
        int liarCount = 26;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case232() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 25;
        int liarCount = 5;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case233() {
        int n = 271;
        int eggCount = 65;
        int lieCount = 239;
        int liarCount = 80;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case234() {
        int n = 10;
        int eggCount = 2;
        int lieCount = 1;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case235() {
        int n = 6;
        int eggCount = 3;
        int lieCount = 1;
        int liarCount = 3;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case236() {
        int n = 60;
        int eggCount = 10;
        int lieCount = 50;
        int liarCount = 30;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case237() {
        int n = 4;
        int eggCount = 0;
        int lieCount = 2;
        int liarCount = 1;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case238() {
        int n = 16;
        int eggCount = 9;
        int lieCount = 8;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case239() {
        int n = 700;
        int eggCount = 200;
        int lieCount = 400;
        int liarCount = 300;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case240() {
        int n = 11;
        int eggCount = 0;
        int lieCount = 4;
        int liarCount = 9;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case241() {
        int n = 10;
        int eggCount = 6;
        int lieCount = 5;
        int liarCount = 1;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case242() {
        int n = 6;
        int eggCount = 5;
        int lieCount = 4;
        int liarCount = 3;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case243() {
        int n = 20;
        int eggCount = 8;
        int lieCount = 10;
        int liarCount = 10;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case244() {
        int n = 60;
        int eggCount = 20;
        int lieCount = 5;
        int liarCount = 35;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case245() {
        int n = 100;
        int eggCount = 10;
        int lieCount = 100;
        int liarCount = 100;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case246() {
        int n = 4;
        int eggCount = 1;
        int lieCount = 2;
        int liarCount = 3;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case247() {
        int n = 50;
        int eggCount = 50;
        int lieCount = 50;
        int liarCount = 50;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case248() {
        int n = 10;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case249() {
        int n = 8144;
        int eggCount = 7808;
        int lieCount = 4902;
        int liarCount = 7152;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case250() {
        int n = 6;
        int eggCount = 5;
        int lieCount = 4;
        int liarCount = 4;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case251() {
        int n = 4;
        int eggCount = 2;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case252() {
        int n = 1000;
        int eggCount = 600;
        int lieCount = 700;
        int liarCount = 100;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case253() {
        int n = 5;
        int eggCount = 3;
        int lieCount = 4;
        int liarCount = 2;
        assertEquals("The egg", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case254() {
        int n = 3282;
        int eggCount = 417;
        int lieCount = 115;
        int liarCount = 491;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case255() {
        int n = 60;
        int eggCount = 40;
        int lieCount = 40;
        int liarCount = 30;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case256() {
        int n = 30;
        int eggCount = 20;
        int lieCount = 6;
        int liarCount = 14;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case257() {
        int n = 16;
        int eggCount = 8;
        int lieCount = 2;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case258() {
        int n = 6;
        int eggCount = 3;
        int lieCount = 3;
        int liarCount = 4;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case259() {
        int n = 20;
        int eggCount = 8;
        int lieCount = 10;
        int liarCount = 2;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case260() {
        int n = 5;
        int eggCount = 2;
        int lieCount = 3;
        int liarCount = 1;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case261() {
        int n = 240;
        int eggCount = 100;
        int lieCount = 120;
        int liarCount = 24;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case262() {
        int n = 10;
        int eggCount = 0;
        int lieCount = 6;
        int liarCount = 6;
        assertEquals("The chicken", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case263() {
        int n = 2;
        int eggCount = 2;
        int lieCount = 1;
        int liarCount = 1;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case264() {
        int n = 8;
        int eggCount = 0;
        int lieCount = 4;
        int liarCount = 2;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case265() {
        int n = 8;
        int eggCount = 4;
        int lieCount = 3;
        int liarCount = 3;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case266() {
        int n = 1000;
        int eggCount = 499;
        int lieCount = 300;
        int liarCount = 300;
        assertEquals("The oracle is a lie", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

    @Test
    public void case267() {
        int n = 50;
        int eggCount = 25;
        int lieCount = 26;
        int liarCount = 1;
        assertEquals("Ambiguous", chickenoracle.theTruth(n, eggCount, lieCount, liarCount));
    }

}
