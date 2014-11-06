package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FoxPaintingBallsTest {
    FoxPaintingBalls foxpaintingballs = new FoxPaintingBalls();

    //@Test
    public void case1() {
        long R = 2L;
        long G = 2L;
        long B = 2L;
        int N = 3;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case2() {
        long R = 1L;
        long G = 2L;
        long B = 3L;
        int N = 3;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case3() {
        long R = 8L;
        long G = 6L;
        long B = 6L;
        int N = 4;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case4() {
        long R = 7L;
        long G = 6L;
        long B = 7L;
        int N = 4;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case5() {
        long R = 100L;
        long G = 100L;
        long B = 100L;
        int N = 4;
        assertEquals(30L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case6() {
        long R = 1L;
        long G = 0L;
        long B = 0L;
        int N = 1;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case7() {
        long R = 0L;
        long G = 1L;
        long B = 0L;
        int N = 1;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case8() {
        long R = 0L;
        long G = 0L;
        long B = 0L;
        int N = 1;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case9() {
        long R = 1L;
        long G = 1L;
        long B = 1L;
        int N = 1;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case10() {
        long R = 1L;
        long G = 1L;
        long B = 1L;
        int N = 2;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case11() {
        long R = 0L;
        long G = 1L;
        long B = 2L;
        int N = 2;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case12() {
        long R = 1L;
        long G = 0L;
        long B = 1L;
        int N = 1;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case13() {
        long R = 2L;
        long G = 2L;
        long B = 2L;
        int N = 1;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case14() {
        long R = 2L;
        long G = 2L;
        long B = 2L;
        int N = 2;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case15() {
        long R = 3L;
        long G = 3L;
        long B = 3L;
        int N = 1;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case16() {
        long R = 3L;
        long G = 3L;
        long B = 3L;
        int N = 2;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case17() {
        long R = 3L;
        long G = 3L;
        long B = 3L;
        int N = 3;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case18() {
        long R = 4L;
        long G = 3L;
        long B = 3L;
        int N = 2;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case19() {
        long R = 4L;
        long G = 4L;
        long B = 3L;
        int N = 2;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case20() {
        long R = 1000000000000000000L;
        long G = 0L;
        long B = 0L;
        int N = 2;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case21() {
        long R = 0L;
        long G = 1000000000000000000L;
        long B = 0L;
        int N = 1;
        assertEquals(1000000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case22() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 3L;
        int N = 4;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case23() {
        long R = 5L;
        long G = 5L;
        long B = 5L;
        int N = 5;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case24() {
        long R = 6L;
        long G = 6L;
        long B = 6L;
        int N = 6;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case25() {
        long R = 7L;
        long G = 7L;
        long B = 7L;
        int N = 6;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case26() {
        long R = 9L;
        long G = 9L;
        long B = 9L;
        int N = 7;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case27() {
        long R = 10L;
        long G = 9L;
        long B = 9L;
        int N = 7;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case28() {
        long R = 20L;
        long G = 18L;
        long B = 18L;
        int N = 7;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case29() {
        long R = 19L;
        long G = 19L;
        long B = 18L;
        int N = 7;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case30() {
        long R = 30L;
        long G = 27L;
        long B = 27L;
        int N = 7;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case31() {
        long R = 28L;
        long G = 29L;
        long B = 27L;
        int N = 7;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case32() {
        long R = 28L;
        long G = 28L;
        long B = 28L;
        int N = 7;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case33() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 1;
        assertEquals(3000000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case34() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 4;
        assertEquals(300000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case35() {
        long R = 949185738472857384L;
        long G = 819402738175983874L;
        long B = 905384829619493856L;
        int N = 4;
        assertEquals(267397330626833511L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case36() {
        long R = 434532807763425372L;
        long G = 912245252707409536L;
        long B = 721365743254593093L;
        int N = 31414801;
        assertEquals(2641L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case37() {
        long R = 678784925379051339L;
        long G = 10400178261775338L;
        long B = 596597756820352946L;
        int N = 219585852;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case38() {
        long R = 410337216597617089L;
        long G = 386302845330165482L;
        long B = 418056928079112265L;
        int N = 706013973;
        assertEquals(4L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case39() {
        long R = 972188503299304012L;
        long G = 409126227317276821L;
        long B = 995258269701504023L;
        int N = 49615093;
        assertEquals(997L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case40() {
        long R = 599621438406050095L;
        long G = 698609304892017589L;
        long B = 787796959604382653L;
        int N = 690733962;
        assertEquals(7L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case41() {
        long R = 141432426644410478L;
        long G = 523068564992268257L;
        long B = 3968030436189050L;
        int N = 515162458;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case42() {
        long R = 254628413341806822L;
        long G = 566715091027788844L;
        long B = 879582218386129339L;
        int N = 675919335;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case43() {
        long R = 507439108017966407L;
        long G = 215717761963116220L;
        long B = 945999661289213983L;
        int N = 366606129;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case44() {
        long R = 199071957438966662L;
        long G = 39288696435238117L;
        long B = 284416158721260667L;
        int N = 18754549;
        assertEquals(670L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case45() {
        long R = 983736091909044788L;
        long G = 702333263235925397L;
        long B = 7736674995425306L;
        int N = 132651710;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case46() {
        long R = 569236532697503079L;
        long G = 359905201510005491L;
        long B = 368202917314669897L;
        int N = 729169499;
        assertEquals(4L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case47() {
        long R = 10467327035807453L;
        long G = 880124072793239679L;
        long B = 990334133647510853L;
        int N = 522284156;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case48() {
        long R = 869468770771426074L;
        long G = 654142812520614050L;
        long B = 316191939090744226L;
        int N = 271490006;
        assertEquals(25L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case49() {
        long R = 581857340557919457L;
        long G = 126509045080352385L;
        long B = 552851871392234657L;
        int N = 326592752;
        assertEquals(7L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case50() {
        long R = 647366618592656593L;
        long G = 256087226025013360L;
        long B = 640836616989961093L;
        int N = 543804583;
        assertEquals(5L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case51() {
        long R = 766158796809697016L;
        long G = 366549826517977430L;
        long B = 739434029035185553L;
        int N = 502785481;
        assertEquals(8L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case52() {
        long R = 171859595078689544L;
        long G = 94382729514372910L;
        long B = 873631019476369348L;
        int N = 559594700;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case53() {
        long R = 850357130417442178L;
        long G = 54925571384856154L;
        long B = 925783176400092567L;
        int N = 180057968;
        assertEquals(10L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case54() {
        long R = 415939394452830858L;
        long G = 825021880708597642L;
        long B = 439171514174899099L;
        int N = 472920443;
        assertEquals(11L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case55() {
        long R = 20761386065312160L;
        long G = 350806678810220275L;
        long B = 235110673638246110L;
        int N = 534340919;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case56() {
        long R = 300247799199144451L;
        long G = 298066591896670306L;
        long B = 906025349749616686L;
        int N = 17;
        assertEquals(5844442978366084L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case57() {
        long R = 721673323105071141L;
        long G = 203949908126125056L;
        long B = 377546143339611000L;
        int N = 2;
        assertEquals(203949908126125056L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case58() {
        long R = 424089261602786391L;
        long G = 228127905195220341L;
        long B = 867852640395653859L;
        int N = 20;
        assertEquals(3258970074217433L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case59() {
        long R = 597666940660802864L;
        long G = 353285014788433562L;
        long B = 796366346613886003L;
        int N = 20;
        assertEquals(5046928782691908L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case60() {
        long R = 875395507329539035L;
        long G = 361768382604152564L;
        long B = 732770400499242701L;
        int N = 24;
        assertEquals(3617683826041525L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case61() {
        long R = 469629003818947099L;
        long G = 466014803897807155L;
        long B = 8740647170953527L;
        int N = 15;
        assertEquals(218516179273838L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case62() {
        long R = 714394451425081416L;
        long G = 934383015997870113L;
        long B = 437765390693388432L;
        int N = 16;
        assertEquals(9728119793186409L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case63() {
        long R = 868134492197118126L;
        long G = 838282259575541163L;
        long B = 693354686219975066L;
        int N = 17;
        assertEquals(13595189925881864L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case64() {
        long R = 741245874030733510L;
        long G = 364572418091271939L;
        long B = 120695531315088765L;
        int N = 28;
        assertEquals(894040972704361L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case65() {
        long R = 978517292632498505L;
        long G = 288013197731675107L;
        long B = 867413781183444535L;
        int N = 8;
        assertEquals(24001099810972925L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case66() {
        long R = 21149663609246215L;
        long G = 768508198421360005L;
        long B = 417798430934155076L;
        int N = 7;
        assertEquals(2349962623249579L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case67() {
        long R = 394281996341375734L;
        long G = 911909099833936580L;
        long B = 87140857515851980L;
        int N = 13;
        assertEquals(2904695250528399L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case68() {
        long R = 960944295171171344L;
        long G = 687623549733004805L;
        long B = 513199817045212536L;
        int N = 24;
        assertEquals(5131998170452125L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case69() {
        long R = 595165730234648309L;
        long G = 57201505479204008L;
        long B = 112537623951448996L;
        int N = 20;
        assertEquals(817164363988628L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case70() {
        long R = 525482445223521345L;
        long G = 623000890791532501L;
        long B = 601360662936882125L;
        int N = 11;
        assertEquals(23885565691978242L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case71() {
        long R = 414003689480975178L;
        long G = 444893071864914782L;
        long B = 911216048589144303L;
        int N = 18;
        assertEquals(7263222622473248L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case72() {
        long R = 388214781534238435L;
        long G = 296926208814985411L;
        long B = 759202342234524695L;
        int N = 17;
        assertEquals(5822082525784027L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case73() {
        long R = 745787960733907063L;
        long G = 751612625711023250L;
        long B = 873841571278977575L;
        int N = 20;
        assertEquals(10654113724770100L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case74() {
        long R = 242760377566309954L;
        long G = 528576742527990434L;
        long B = 170285625210596976L;
        int N = 18;
        assertEquals(2987467108957841L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case75() {
        long R = 573220895197092962L;
        long G = 342556405012238046L;
        long B = 57017734782977031L;
        int N = 14;
        assertEquals(1629078136656486L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case76() {
        long R = 866371492869738380L;
        long G = 866371492869738437L;
        long B = 866371492869738418L;
        int N = 478076429;
        assertEquals(22L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case77() {
        long R = 90640277124104481L;
        long G = 90640277124104500L;
        long B = 90640277124104553L;
        int N = 194606200;
        assertEquals(14L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case78() {
        long R = 921015884493001641L;
        long G = 921015884493001653L;
        long B = 921015884493001661L;
        int N = 606524717;
        assertEquals(15L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case79() {
        long R = 426095736033883130L;
        long G = 426095736033883165L;
        long B = 426095736033883077L;
        int N = 390495974;
        assertEquals(16L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case80() {
        long R = 841146992876139473L;
        long G = 841146992876139407L;
        long B = 841146992876139291L;
        int N = 912691565;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case81() {
        long R = 568627451507658226L;
        long G = 568627451507658085L;
        long B = 568627451507658064L;
        int N = 862083986;
        assertEquals(4L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case82() {
        long R = 383098163497752052L;
        long G = 383098163497752107L;
        long B = 383098163497752123L;
        int N = 649123799;
        assertEquals(5L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case83() {
        long R = 469397376150686270L;
        long G = 469397376150686319L;
        long B = 469397376150686191L;
        int N = 977494083;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case84() {
        long R = 338594055324770179L;
        long G = 338594055324770216L;
        long B = 338594055324770203L;
        int N = 464735843;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case85() {
        long R = 770226248969126024L;
        long G = 770226248969126067L;
        long B = 770226248969125965L;
        int N = 127140587;
        assertEquals(285L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case86() {
        long R = 48932907154432024L;
        long G = 48932907154432174L;
        long B = 48932907154432072L;
        int N = 523579054;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case87() {
        long R = 953756049150593126L;
        long G = 953756049150593155L;
        long B = 953756049150593254L;
        int N = 945836614;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case88() {
        long R = 921567783946494978L;
        long G = 921567783946495044L;
        long B = 921567783946494938L;
        int N = 67103100;
        assertEquals(1227L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case89() {
        long R = 938603508209546223L;
        long G = 938603508209546327L;
        long B = 938603508209546190L;
        int N = 246728026;
        assertEquals(92L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case90() {
        long R = 180563567070190582L;
        long G = 180563567070190700L;
        long B = 180563567070190663L;
        int N = 78419658;
        assertEquals(176L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case91() {
        long R = 765178045830717532L;
        long G = 765178045830717546L;
        long B = 765178045830717479L;
        int N = 704612361;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case92() {
        long R = 590733514181997590L;
        long G = 590733514181997558L;
        long B = 590733514181997593L;
        int N = 695340729;
        assertEquals(7L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case93() {
        long R = 540849015002207908L;
        long G = 540849015002207889L;
        long B = 540849015002207770L;
        int N = 733793060;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case94() {
        long R = 448232396775595482L;
        long G = 448232396775595511L;
        long B = 448232396775595525L;
        int N = 908506983;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case95() {
        long R = 750925177042368293L;
        long G = 750925177042368234L;
        long B = 750925177042368167L;
        int N = 403311295;
        assertEquals(27L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case96() {
        long R = 440104302960949798L;
        long G = 440104302960949652L;
        long B = 440104302960949818L;
        int N = 935144910;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case97() {
        long R = 128219221160872551L;
        long G = 128219221160872532L;
        long B = 128219221160872513L;
        int N = 249402199;
        assertEquals(12L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case98() {
        long R = 926803537328012521L;
        long G = 926803537328012590L;
        long B = 926803537328012509L;
        int N = 886385758;
        assertEquals(7L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case99() {
        long R = 638355527147559025L;
        long G = 638355527147559108L;
        long B = 638355527147558983L;
        int N = 402165992;
        assertEquals(23L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case100() {
        long R = 671505422387382102L;
        long G = 671505422387381991L;
        long B = 671505422387382010L;
        int N = 414785576;
        assertEquals(23L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case101() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 3456;
        assertEquals(5750952686L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case102() {
        long R = 1L;
        long G = 1L;
        long B = 1L;
        int N = 1;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case103() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case104() {
        long R = 1000000000000000000L;
        long G = 500000000000000000L;
        long B = 250000000000000000L;
        int N = 4;
        assertEquals(83333333333333333L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case105() {
        long R = 1000000000000000000L;
        long G = 1000000000L;
        long B = 1000000000000000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case106() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 4;
        assertEquals(3817160339732976L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case107() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 345600;
        assertEquals(575260L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case108() {
        long R = 458775L;
        long G = 4874487L;
        long B = 4588754L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case109() {
        long R = 543556563565654567L;
        long G = 23423454565656L;
        long B = 23463453472345L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case110() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 3457;
        assertEquals(5747627475L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case111() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 2342352;
        assertEquals(1093L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case112() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1L;
        int N = 1;
        assertEquals(2000000000000000001L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case113() {
        long R = 100000L;
        long G = 404040L;
        long B = 202020L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case114() {
        long R = 1000000000000L;
        long G = 1000000000000L;
        long B = 1000000000000L;
        int N = 5000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case115() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 1000000000;
        assertEquals(5L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case116() {
        long R = 500L;
        long G = 500L;
        long B = 500L;
        int N = 1;
        assertEquals(1500L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case117() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 1000000;
        assertEquals(5999994L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case118() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 1;
        assertEquals(3000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case119() {
        long R = 100L;
        long G = 0L;
        long B = 0L;
        int N = 1;
        assertEquals(100L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case120() {
        long R = 999999999999999999L;
        long G = 999999999999999999L;
        long B = 999999999999999997L;
        int N = 999878477;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case121() {
        long R = 3265873456834L;
        long G = 6354857389734L;
        long B = 345345847583L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case122() {
        long R = 1247612373918741L;
        long G = 273593827409184L;
        long B = 2385789472398L;
        int N = 20394;
        assertEquals(34415L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case123() {
        long R = 1000000000000000000L;
        long G = 10000000000000000L;
        long B = 100000000000000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case124() {
        long R = 1000000000000000000L;
        long G = 90000000000000000L;
        long B = 800000000000000L;
        int N = 1000000;
        assertEquals(4799L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case125() {
        long R = 10L;
        long G = 0L;
        long B = 0L;
        int N = 1;
        assertEquals(10L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case126() {
        long R = 4324324234234234L;
        long G = 4324234324234324L;
        long B = 42324324424324344L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case127() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 100000000;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case128() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 100000000;
        assertEquals(599L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case129() {
        long R = 1000000000L;
        long G = 1000000000L;
        long B = 1000000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case130() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 100000;
        assertEquals(599994000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case131() {
        long R = 9L;
        long G = 9L;
        long B = 12L;
        int N = 4;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case132() {
        long R = 100000000L;
        long G = 100000000L;
        long B = 100000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case133() {
        long R = 2L;
        long G = 4L;
        long B = 4L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case134() {
        long R = 10L;
        long G = 10L;
        long B = 10L;
        int N = 1;
        assertEquals(30L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case135() {
        long R = 1000000000000000L;
        long G = 1000000000000023L;
        long B = 1000000000000015L;
        int N = 10000000;
        assertEquals(59L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case136() {
        long R = 4564121L;
        long G = 1111111L;
        long B = 47711L;
        int N = 4;
        assertEquals(15903L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case137() {
        long R = 100L;
        long G = 100L;
        long B = 1L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case138() {
        long R = 12L;
        long G = 12L;
        long B = 12L;
        int N = 1;
        assertEquals(36L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case139() {
        long R = 50000000500000003L;
        long G = 50000000500000003L;
        long B = 50000000500000003L;
        int N = 100000000;
        assertEquals(30L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case140() {
        long R = 100L;
        long G = 10000000000L;
        long B = 10000000000L;
        int N = 4;
        assertEquals(33L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case141() {
        long R = 100000000000000L;
        long G = 100000000000000L;
        long B = 100000000000000L;
        int N = 1000000;
        assertEquals(599L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case142() {
        long R = 100L;
        long G = 100L;
        long B = 1L;
        int N = 7;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case143() {
        long R = 100000000000L;
        long G = 100000000000L;
        long B = 200000000000L;
        int N = 4;
        assertEquals(33333333333L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case144() {
        long R = 400L;
        long G = 30L;
        long B = 30L;
        int N = 4;
        assertEquals(10L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case145() {
        long R = 1000000000000000000L;
        long G = 1L;
        long B = 1L;
        int N = 1;
        assertEquals(1000000000000000002L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case146() {
        long R = 1000L;
        long G = 1000L;
        long B = 1000L;
        int N = 999999999;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case147() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 1000000;
        assertEquals(5999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case148() {
        long R = 0L;
        long G = 100L;
        long B = 200L;
        int N = 1;
        assertEquals(300L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case149() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198999L;
        int N = 345634;
        assertEquals(575146L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case150() {
        long R = 30L;
        long G = 30L;
        long B = 40L;
        int N = 4;
        assertEquals(10L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case151() {
        long R = 100000000000000L;
        long G = 100000000000000L;
        long B = 100000000000000L;
        int N = 7;
        assertEquals(10714285714285L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case152() {
        long R = 7L;
        long G = 6L;
        long B = 6L;
        int N = 4;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case153() {
        long R = 100000000000000L;
        long G = 100000000000000L;
        long B = 100000000000000L;
        int N = 100000002;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case154() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 4;
        assertEquals(300000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case155() {
        long R = 900000000000000041L;
        long G = 800000000000018467L;
        long B = 700000000000006334L;
        int N = 650019169;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case156() {
        long R = 19330428391852493L;
        long G = 48815737585554113L;
        long B = 11451481019198999L;
        int N = 345634232;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case157() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 999999999999999L;
        int N = 4;
        assertEquals(299999999999999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case158() {
        long R = 1L;
        long G = 2L;
        long B = 1000000000L;
        int N = 2;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case159() {
        long R = 100000000000006700L;
        long G = 111000000000000000L;
        long B = 100000000990000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case160() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 100000;
        assertEquals(599994L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case161() {
        long R = 100L;
        long G = 102L;
        long B = 140L;
        int N = 4;
        assertEquals(33L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case162() {
        long R = 100L;
        long G = 100L;
        long B = 1432L;
        int N = 4;
        assertEquals(33L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case163() {
        long R = 19330428391852493L;
        long G = 48815737585554113L;
        long B = 11451481019198999L;
        int N = 345634231;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case164() {
        long R = 350000000000000000L;
        long G = 320000000000000000L;
        long B = 330000000000000000L;
        int N = 4;
        assertEquals(100000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case165() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 999999998;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case166() {
        long R = 0L;
        long G = 1L;
        long B = 1L;
        int N = 1;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case167() {
        long R = 19000L;
        long G = 18000L;
        long B = 18000L;
        int N = 10;
        assertEquals(1000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case168() {
        long R = 100L;
        long G = 100L;
        long B = 0L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case169() {
        long R = 8L;
        long G = 1L;
        long B = 11L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case170() {
        long R = 999999999L;
        long G = 888888888L;
        long B = 777777777L;
        int N = 999999999;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case171() {
        long R = 100000000000000000L;
        long G = 100000000000000000L;
        long B = 100000000000000000L;
        int N = 1000000;
        assertEquals(599999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case172() {
        long R = 100000000000000000L;
        long G = 100000000000000000L;
        long B = 100000000000000000L;
        int N = 4;
        assertEquals(30000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case173() {
        long R = 1000000000000000000L;
        long G = 999999999999999999L;
        long B = 999999999999999998L;
        int N = 1000000000;
        assertEquals(5L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case174() {
        long R = 3L;
        long G = 10L;
        long B = 10L;
        int N = 4;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case175() {
        long R = 3L;
        long G = 3L;
        long B = 4L;
        int N = 7;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case176() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 10000000;
        assertEquals(59999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case177() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 900000000;
        assertEquals(7L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case178() {
        long R = 2345L;
        long G = 334563635L;
        long B = 434534L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case179() {
        long R = 19330428391852493L;
        long G = 48815737582834113L;
        long B = 11451481019198930L;
        int N = 345666;
        assertEquals(575040L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case180() {
        long R = 100L;
        long G = 1L;
        long B = 1L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case181() {
        long R = 9999999999999999L;
        long G = 10000000000000000L;
        long B = 10000000000000000L;
        int N = 100;
        assertEquals(5940594059405L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case182() {
        long R = 1000000000000000000L;
        long G = 500000000000000000L;
        long B = 700000000000000002L;
        int N = 1;
        assertEquals(2200000000000000002L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case183() {
        long R = 0L;
        long G = 100L;
        long B = 100L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case184() {
        long R = 1000L;
        long G = 0L;
        long B = 0L;
        int N = 1;
        assertEquals(1000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case185() {
        long R = 0L;
        long G = 100000000000000000L;
        long B = 100000000000000000L;
        int N = 1;
        assertEquals(200000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case186() {
        long R = 999999999999999999L;
        long G = 999999999999999999L;
        long B = 999999999999999999L;
        int N = 4;
        assertEquals(299999999999999999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case187() {
        long R = 123L;
        long G = 456L;
        long B = 789L;
        int N = 4;
        assertEquals(41L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case188() {
        long R = 2L;
        long G = 3L;
        long B = 4L;
        int N = 1;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case189() {
        long R = 11L;
        long G = 10L;
        long B = 9L;
        int N = 1;
        assertEquals(30L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case190() {
        long R = 856674609788912520L;
        long G = 791809296233191086L;
        long B = 711066335916901716L;
        int N = 11380;
        assertEquals(32941144942L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case191() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 7;
        assertEquals(107142857142857142L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case192() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case193() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 999999;
        assertEquals(6000006L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case194() {
        long R = 32L;
        long G = 32L;
        long B = 36L;
        int N = 4;
        assertEquals(10L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case195() {
        long R = 16683300000000000L;
        long G = 166833000000L;
        long B = 166833L;
        int N = 1000;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case196() {
        long R = 1000000000000000L;
        long G = 1000000000000000L;
        long B = 1000000000000000L;
        int N = 7;
        assertEquals(107142857142857L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case197() {
        long R = 400L;
        long G = 300L;
        long B = 300L;
        int N = 4;
        assertEquals(100L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case198() {
        long R = 324234L;
        long G = 2333L;
        long B = 5666232552L;
        int N = 12534523;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case199() {
        long R = 10000000000000L;
        long G = 1000000000000L;
        long B = 10000000000000L;
        int N = 1;
        assertEquals(21000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case200() {
        long R = 0L;
        long G = 0L;
        long B = 2L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case201() {
        long R = 29L;
        long G = 28L;
        long B = 27L;
        int N = 7;
        assertEquals(3L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case202() {
        long R = 100L;
        long G = 100000000L;
        long B = 100000000L;
        int N = 4;
        assertEquals(33L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case203() {
        long R = 567L;
        long G = 1246L;
        long B = 2871L;
        int N = 64;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case204() {
        long R = 100000000000000000L;
        long G = 100000000000000000L;
        long B = 100000000000000000L;
        int N = 6395098;
        assertEquals(14670L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case205() {
        long R = 2L;
        long G = 2L;
        long B = 0L;
        int N = 1;
        assertEquals(4L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case206() {
        long R = 5L;
        long G = 100L;
        long B = 10000000000000L;
        int N = 4;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case207() {
        long R = 1L;
        long G = 1L;
        long B = 1001L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case208() {
        long R = 1000000000000000000L;
        long G = 999999999999999999L;
        long B = 999999999999999998L;
        int N = 4;
        assertEquals(299999999999999999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case209() {
        long R = 100000000000000000L;
        long G = 100000000000000000L;
        long B = 100000000000000000L;
        int N = 1;
        assertEquals(300000000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case210() {
        long R = 100000000000000L;
        long G = 100000000000000L;
        long B = 100000000000000L;
        int N = 1;
        assertEquals(300000000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case211() {
        long R = 1000000000231213L;
        long G = 10000000002311345L;
        long B = 10000000002312139L;
        int N = 999999997;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case212() {
        long R = 22L;
        long G = 22L;
        long B = 19L;
        int N = 4;
        assertEquals(6L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case213() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 1000000000000000000L;
        int N = 1000001;
        assertEquals(5999982L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case214() {
        long R = 93L;
        long G = 1L;
        long B = 1L;
        int N = 13;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case215() {
        long R = 822981258385599122L;
        long G = 28316248989464292L;
        long B = 779547115376367011L;
        int N = 57307;
        assertEquals(51732569L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case216() {
        long R = 9L;
        long G = 9L;
        long B = 11L;
        int N = 4;
        assertEquals(2L, foxpaintingballs.theMax(R, G, B, N));
    }

    @Test
    public void case217() {
        long R = 10001L;
        long G = 10010L;
        long B = 10005L;
        int N = 4;
        assertEquals(3001L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case218() {
        long R = 1000000000000000000L;
        long G = 1000000000000000000L;
        long B = 999999999999999999L;
        int N = 4;
        assertEquals(299999999999999999L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case219() {
        long R = 100000000000L;
        long G = 100000000000L;
        long B = 100000000000L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case220() {
        long R = 66630362332990648L;
        long G = 79343508172661713L;
        long B = 73842408503145400L;
        int N = 4;
        assertEquals(21981627900879776L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case221() {
        long R = 1000000000L;
        long G = 1000000000L;
        long B = 10000000L;
        int N = 4;
        assertEquals(3333333L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case222() {
        long R = 18L;
        long G = 19L;
        long B = 19L;
        int N = 4;
        assertEquals(5L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case223() {
        long R = 33L;
        long G = 33L;
        long B = 33L;
        int N = 4;
        assertEquals(9L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case224() {
        long R = 1L;
        long G = 100L;
        long B = 199L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case225() {
        long R = 1000000000000L;
        long G = 1000000000000L;
        long B = 1000000000000L;
        int N = 4;
        assertEquals(300000000000L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case226() {
        long R = 3L;
        long G = 3L;
        long B = 3L;
        int N = 4;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case227() {
        long R = 100000000000000000L;
        long G = 1000000L;
        long B = 1000000L;
        int N = 4;
        assertEquals(333333L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case228() {
        long R = 6L;
        long G = 6L;
        long B = 6L;
        int N = 4;
        assertEquals(1L, foxpaintingballs.theMax(R, G, B, N));
    }

    //@Test
    public void case229() {
        long R = 2L;
        long G = 2L;
        long B = 2L;
        int N = 1000000000;
        assertEquals(0L, foxpaintingballs.theMax(R, G, B, N));
    }

}
