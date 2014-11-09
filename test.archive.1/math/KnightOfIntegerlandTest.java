package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KnightOfIntegerlandTest {
    KnightOfIntegerland knightofintegerland = new KnightOfIntegerland();

    @Test
    public void case1() {
        int d = 25;
        int x = 1;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case2() {
        int d = 25;
        int x = 2276;
        int y = -9059;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case3() {
        int d = 5;
        int x = 58585858;
        int y = 85858585;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case4() {
        int d = 4;
        int x = 47474747;
        int y = 74747474;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case5() {
        int d = 169;
        int x = 2;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case6() {
        int d = 3;
        int x = 1;
        int y = 1;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case7() {
        int d = 382621149;
        int x = 838804090;
        int y = -451572978;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case8() {
        int d = 77843137;
        int x = 522507003;
        int y = -951731302;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case9() {
        int d = 838915904;
        int x = -42156413;
        int y = -723603296;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case10() {
        int d = 383801202;
        int x = -969518505;
        int y = 69443379;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case11() {
        int d = 127457370;
        int x = -9008670;
        int y = -573217785;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case12() {
        int d = 329195605;
        int x = 60167613;
        int y = -30706393;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case13() {
        int d = 817027042;
        int x = 859734983;
        int y = -635985221;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case14() {
        int d = 658593989;
        int x = 279149883;
        int y = 940017988;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case15() {
        int d = 967357453;
        int x = -857923323;
        int y = -660311840;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case16() {
        int d = 399864644;
        int x = 749823176;
        int y = -682616672;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case17() {
        int d = 30193553;
        int x = -75250549;
        int y = 797404855;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case18() {
        int d = 789203780;
        int x = 373464307;
        int y = -983802252;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case19() {
        int d = 229997941;
        int x = -710840161;
        int y = -561945280;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case20() {
        int d = 527041709;
        int x = -599445342;
        int y = 857549976;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case21() {
        int d = 876922996;
        int x = 445482252;
        int y = 353476416;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case22() {
        int d = 831212980;
        int x = -757226114;
        int y = 123863830;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case23() {
        int d = 660387562;
        int x = -338640403;
        int y = 261592188;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case24() {
        int d = 195892225;
        int x = 666311240;
        int y = -993018054;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case25() {
        int d = 248748320;
        int x = 756675240;
        int y = 444512744;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case26() {
        int d = 256670933;
        int x = 401208468;
        int y = -615244468;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case27() {
        int d = 657357128;
        int x = 827331300;
        int y = -781395323;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case28() {
        int d = 852344642;
        int x = -687473411;
        int y = 665625643;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case29() {
        int d = 942127658;
        int x = -842641042;
        int y = 695551100;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case30() {
        int d = 314230432;
        int x = 44975892;
        int y = -919414300;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case31() {
        int d = 552709705;
        int x = -11887766;
        int y = -655351176;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case32() {
        int d = 78391997;
        int x = -397477992;
        int y = 540427150;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case33() {
        int d = 895511908;
        int x = -82307108;
        int y = -963546636;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case34() {
        int d = 725054177;
        int x = 833339776;
        int y = -750573758;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case35() {
        int d = 63308457;
        int x = 103324299;
        int y = 407721492;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case36() {
        int d = 933445330;
        int x = -624373454;
        int y = 579362905;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case37() {
        int d = 659780840;
        int x = -18659410;
        int y = 887664316;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case38() {
        int d = 308680228;
        int x = 485077662;
        int y = 896710896;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case39() {
        int d = 880431578;
        int x = -635666821;
        int y = 115296660;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case40() {
        int d = 957822085;
        int x = -948619468;
        int y = -315411971;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case41() {
        int d = 406054853;
        int x = -413599179;
        int y = 618060325;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case42() {
        int d = 504631400;
        int x = 138839022;
        int y = -136009580;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case43() {
        int d = 887411362;
        int x = -467213451;
        int y = 521490704;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case44() {
        int d = 707306036;
        int x = 506388610;
        int y = -553380316;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case45() {
        int d = 348288274;
        int x = -175167580;
        int y = 835836681;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case46() {
        int d = 433803177;
        int x = -521399793;
        int y = -655893240;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case47() {
        int d = 271286362;
        int x = -314895797;
        int y = -191271319;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case48() {
        int d = 446210665;
        int x = 85761404;
        int y = -216556645;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case49() {
        int d = 430689586;
        int x = 876908676;
        int y = 381376737;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case50() {
        int d = 412600282;
        int x = -927355248;
        int y = -533052521;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case51() {
        int d = 118657633;
        int x = 591546792;
        int y = 538147411;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case52() {
        int d = 74364001;
        int x = 558878644;
        int y = -130350416;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case53() {
        int d = 493817994;
        int x = -997285452;
        int y = -706059378;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case54() {
        int d = 7455769;
        int x = -544134025;
        int y = 703784191;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case55() {
        int d = 112430953;
        int x = 571577696;
        int y = -358058781;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case56() {
        int d = 723712393;
        int x = 269897098;
        int y = 507984841;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case57() {
        int d = 81692441;
        int x = 10718678;
        int y = -308896102;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case58() {
        int d = 332302626;
        int x = -247539516;
        int y = -331706672;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case59() {
        int d = 895216378;
        int x = -133081354;
        int y = -334482876;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case60() {
        int d = 660945105;
        int x = 999377376;
        int y = -658224270;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case61() {
        int d = 238555088;
        int x = -360946228;
        int y = 312350045;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case62() {
        int d = 988254368;
        int x = -60652500;
        int y = -896151668;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case63() {
        int d = 864245205;
        int x = -947030109;
        int y = 315314670;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case64() {
        int d = 534280986;
        int x = -558551361;
        int y = 54121634;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case65() {
        int d = 645605057;
        int x = 538901413;
        int y = -651425269;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case66() {
        int d = 824319445;
        int x = 107797381;
        int y = -493435287;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case67() {
        int d = 282461593;
        int x = -903821151;
        int y = 246511132;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case68() {
        int d = 735787130;
        int x = 83745570;
        int y = 762572631;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case69() {
        int d = 150010666;
        int x = -161303318;
        int y = -455269434;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case70() {
        int d = 190818037;
        int x = -243378430;
        int y = -101730249;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case71() {
        int d = 96884749;
        int x = -185531543;
        int y = -43088554;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case72() {
        int d = 870984916;
        int x = 651904146;
        int y = -409074166;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case73() {
        int d = 602879146;
        int x = -918803100;
        int y = -560933098;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case74() {
        int d = 984939106;
        int x = 5595086;
        int y = -628396326;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case75() {
        int d = 332654578;
        int x = -234373185;
        int y = -330168300;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case76() {
        int d = 44154473;
        int x = 541757953;
        int y = 371836960;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case77() {
        int d = 118024052;
        int x = -635052052;
        int y = 429850500;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case78() {
        int d = 312714569;
        int x = 862027535;
        int y = -930350497;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case79() {
        int d = 887641988;
        int x = 735011516;
        int y = -620577818;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case80() {
        int d = 790024040;
        int x = 72759802;
        int y = 714800088;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case81() {
        int d = 520097293;
        int x = 348491966;
        int y = -538586716;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case82() {
        int d = 323667920;
        int x = -486219064;
        int y = 970997537;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case83() {
        int d = 487093802;
        int x = 77984837;
        int y = 548233097;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case84() {
        int d = 791523092;
        int x = 238149478;
        int y = 598265260;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case85() {
        int d = 600926690;
        int x = -807241372;
        int y = -789987604;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case86() {
        int d = 76401121;
        int x = 897577973;
        int y = -692144610;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case87() {
        int d = 109197992;
        int x = -94413504;
        int y = -139488045;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case88() {
        int d = 236370752;
        int x = -899165212;
        int y = 967070133;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case89() {
        int d = 111383144;
        int x = -140167122;
        int y = -25709756;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case90() {
        int d = 396758468;
        int x = 12136564;
        int y = 643481544;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case91() {
        int d = 348123994;
        int x = -298566188;
        int y = 69286009;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case92() {
        int d = 814395829;
        int x = 364747611;
        int y = 284101150;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case93() {
        int d = 936523114;
        int x = 724987185;
        int y = -393715882;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case94() {
        int d = 297335284;
        int x = 573405008;
        int y = -965274879;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case95() {
        int d = 901117274;
        int x = 90122836;
        int y = 306302865;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case96() {
        int d = 539393777;
        int x = 951122401;
        int y = 32934275;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case97() {
        int d = 408228893;
        int x = -32239051;
        int y = -956287045;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case98() {
        int d = 6008026;
        int x = 140030205;
        int y = -636780312;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case99() {
        int d = 667425082;
        int x = 662553261;
        int y = 897088368;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case100() {
        int d = 563594330;
        int x = 554638651;
        int y = -929771967;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case101() {
        int d = 700273192;
        int x = -609388040;
        int y = -352611100;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case102() {
        int d = 262623556;
        int x = 854358976;
        int y = 404817775;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case103() {
        int d = 660522842;
        int x = 826018333;
        int y = -437741377;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case104() {
        int d = 382044941;
        int x = 579083895;
        int y = 487504573;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case105() {
        int d = 105387154;
        int x = 771633711;
        int y = -305334395;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case106() {
        int d = 601692634;
        int x = 832305765;
        int y = -842663809;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case107() {
        int d = 228295066;
        int x = -87102195;
        int y = 335595969;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case108() {
        int d = 279124841;
        int x = -4958666;
        int y = -151653371;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case109() {
        int d = 981612532;
        int x = 497623150;
        int y = -676312688;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case110() {
        int d = 358798410;
        int x = -414214020;
        int y = 865993022;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case111() {
        int d = 772627069;
        int x = -534820376;
        int y = 398895169;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case112() {
        int d = 802684882;
        int x = -100210860;
        int y = 941708834;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case113() {
        int d = 783189520;
        int x = -32758388;
        int y = -283715404;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case114() {
        int d = 630644957;
        int x = -846451327;
        int y = -424656804;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case115() {
        int d = 547913232;
        int x = -677058144;
        int y = 557711088;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case116() {
        int d = 493720884;
        int x = 982964385;
        int y = -410833284;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case117() {
        int d = 190111336;
        int x = -739925582;
        int y = 607689206;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case118() {
        int d = 623339848;
        int x = -186388453;
        int y = -97435524;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case119() {
        int d = 845616932;
        int x = -475137162;
        int y = 669419184;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case120() {
        int d = 252531709;
        int x = -323500977;
        int y = 804210169;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case121() {
        int d = 362740993;
        int x = 366037019;
        int y = -200236263;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case122() {
        int d = 615578944;
        int x = 157366008;
        int y = 314184232;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case123() {
        int d = 338146721;
        int x = -919735190;
        int y = -490529446;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case124() {
        int d = 817035653;
        int x = 865593111;
        int y = -355432245;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case125() {
        int d = 101976074;
        int x = -386406428;
        int y = 575880963;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case126() {
        int d = 47833970;
        int x = -36630907;
        int y = -371420086;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case127() {
        int d = 636102378;
        int x = -730933650;
        int y = 592467708;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case128() {
        int d = 614182185;
        int x = -662903584;
        int y = -298661664;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case129() {
        int d = 894936149;
        int x = -781624220;
        int y = 326422976;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case130() {
        int d = 932427418;
        int x = -825348834;
        int y = -539507416;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case131() {
        int d = 701851761;
        int x = 789865032;
        int y = 830870493;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case132() {
        int d = 401548148;
        int x = 613146704;
        int y = -234871982;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case133() {
        int d = 809366084;
        int x = 236433208;
        int y = -76381218;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case134() {
        int d = 92782457;
        int x = 314590629;
        int y = -873580104;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case135() {
        int d = 380945933;
        int x = -928390233;
        int y = 160282977;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case136() {
        int d = 451874692;
        int x = -986740662;
        int y = -729489304;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case137() {
        int d = 803722162;
        int x = 815477714;
        int y = 97394611;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case138() {
        int d = 713126681;
        int x = -671512856;
        int y = -932332590;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case139() {
        int d = 500480528;
        int x = -851595280;
        int y = 465378804;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case140() {
        int d = 866343626;
        int x = 51076585;
        int y = 414421034;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case141() {
        int d = 762706720;
        int x = -89644306;
        int y = -465946876;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case142() {
        int d = 705958093;
        int x = 938368125;
        int y = 235926151;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case143() {
        int d = 610055186;
        int x = -482093547;
        int y = 107546675;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case144() {
        int d = 967905940;
        int x = 573773200;
        int y = -221122762;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case145() {
        int d = 652837138;
        int x = -634739114;
        int y = -291443651;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case146() {
        int d = 693269768;
        int x = 837770408;
        int y = 361065288;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case147() {
        int d = 260899733;
        int x = 858685723;
        int y = 882261889;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case148() {
        int d = 696091181;
        int x = 527764929;
        int y = -828758049;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case149() {
        int d = 93314537;
        int x = 561445843;
        int y = -969302645;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case150() {
        int d = 808368101;
        int x = 214312811;
        int y = -992032009;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case151() {
        int d = 386889632;
        int x = 104975596;
        int y = 303601116;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case152() {
        int d = 439795610;
        int x = 586081949;
        int y = 617661909;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case153() {
        int d = 900985797;
        int x = 956670156;
        int y = 217050647;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case154() {
        int d = 236439242;
        int x = 540372333;
        int y = -973089579;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case155() {
        int d = 859662137;
        int x = -349146000;
        int y = -107140677;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case156() {
        int d = 653905850;
        int x = -129066335;
        int y = 214008281;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case157() {
        int d = 416802739;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case158() {
        int d = 652288857;
        int x = -10909100;
        int y = 305176751;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case159() {
        int d = 901153200;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case160() {
        int d = 341098945;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case161() {
        int d = 17832333;
        int x = 647066828;
        int y = 921704665;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case162() {
        int d = 302095078;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case163() {
        int d = 403836725;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case164() {
        int d = 231431616;
        int x = -212086254;
        int y = 13128434;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case165() {
        int d = 289017735;
        int x = 865691753;
        int y = -557509609;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case166() {
        int d = 4599156;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case167() {
        int d = 865139025;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case168() {
        int d = 182659321;
        int x = -472710248;
        int y = 670624417;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case169() {
        int d = 42788805;
        int x = 46060021;
        int y = 127933275;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case170() {
        int d = 789026343;
        int x = 971410095;
        int y = -283752980;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case171() {
        int d = 849081444;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case172() {
        int d = 176155788;
        int x = 900777271;
        int y = -603095887;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case173() {
        int d = 401727674;
        int x = -632486089;
        int y = 187535773;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case174() {
        int d = 147440196;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case175() {
        int d = 757934938;
        int x = 931814457;
        int y = 312665062;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case176() {
        int d = 817843749;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case177() {
        int d = 95;
        int x = 674172982;
        int y = -56560424;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case178() {
        int d = 86;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case179() {
        int d = 44;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case180() {
        int d = 41;
        int x = -814680773;
        int y = -848463431;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case181() {
        int d = 13;
        int x = 959649524;
        int y = -945200693;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case182() {
        int d = 78;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case183() {
        int d = 61;
        int x = 362406214;
        int y = 236313467;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case184() {
        int d = 17;
        int x = -389230929;
        int y = -783906988;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case185() {
        int d = 91;
        int x = -563581813;
        int y = -269489479;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case186() {
        int d = 19;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case187() {
        int d = 34;
        int x = -310825858;
        int y = -501694713;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case188() {
        int d = 60;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case189() {
        int d = 40;
        int x = 439958574;
        int y = -337131708;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case190() {
        int d = 62;
        int x = -46226775;
        int y = 607201139;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case191() {
        int d = 36;
        int x = -889784838;
        int y = 514192854;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case192() {
        int d = 8;
        int x = 621751804;
        int y = -25664498;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case193() {
        int d = 72;
        int x = -295892286;
        int y = 747464298;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case194() {
        int d = 18;
        int x = 412739457;
        int y = -647544482;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case195() {
        int d = 83;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case196() {
        int d = 67;
        int x = 856515253;
        int y = -115875378;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case197() {
        int d = 3;
        int x = 0;
        int y = 0;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case198() {
        int d = 98;
        int x = 14;
        int y = 7;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case199() {
        int d = 10;
        int x = 1;
        int y = 0;
        assertEquals("NO", knightofintegerland.able(d, x, y));
    }

    @Test
    public void case200() {
        int d = 1;
        int x = 1;
        int y = 1;
        assertEquals("YES", knightofintegerland.able(d, x, y));
    }

}
