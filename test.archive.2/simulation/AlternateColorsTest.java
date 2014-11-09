package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class AlternateColorsTest {
    AlternateColors alternatecolors = new AlternateColors();

    @Test
    public void case1() {
        long r = 1L;
        long g = 1L;
        long b = 1L;
        long k = 3L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case2() {
        long r = 3L;
        long g = 4L;
        long b = 5L;
        long k = 4L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case3() {
        long r = 7L;
        long g = 7L;
        long b = 1L;
        long k = 7L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case4() {
        long r = 1000000000000L;
        long g = 1L;
        long b = 1L;
        long k = 1000000000002L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case5() {
        long r = 653L;
        long g = 32L;
        long b = 1230L;
        long k = 556L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case6() {
        long r = 39L;
        long g = 4L;
        long b = 29L;
        long k = 7L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case7() {
        long r = 35L;
        long g = 41L;
        long b = 37L;
        long k = 106L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case8() {
        long r = 29L;
        long g = 48L;
        long b = 24L;
        long k = 94L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case9() {
        long r = 32L;
        long g = 29L;
        long b = 25L;
        long k = 30L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case10() {
        long r = 26L;
        long g = 36L;
        long b = 22L;
        long k = 74L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case11() {
        long r = 4L;
        long g = 15L;
        long b = 34L;
        long k = 50L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case12() {
        long r = 19L;
        long g = 36L;
        long b = 31L;
        long k = 25L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case13() {
        long r = 20L;
        long g = 11L;
        long b = 6L;
        long k = 24L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case14() {
        long r = 28L;
        long g = 4L;
        long b = 16L;
        long k = 40L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case15() {
        long r = 21L;
        long g = 38L;
        long b = 50L;
        long k = 22L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case16() {
        long r = 38L;
        long g = 26L;
        long b = 21L;
        long k = 70L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case17() {
        long r = 33L;
        long g = 38L;
        long b = 18L;
        long k = 85L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case18() {
        long r = 1362806L;
        long g = 9637722L;
        long b = 7058502L;
        long k = 1977778L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case19() {
        long r = 1159652L;
        long g = 9711153L;
        long b = 312878L;
        long k = 1495426L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case20() {
        long r = 3377413L;
        long g = 9950084L;
        long b = 2868413L;
        long k = 11985971L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case21() {
        long r = 689008L;
        long g = 3508527L;
        long b = 5686348L;
        long k = 615514L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case22() {
        long r = 4140848L;
        long g = 5815343L;
        long b = 5146349L;
        long k = 14109660L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case23() {
        long r = 7048211L;
        long g = 8685039L;
        long b = 7549598L;
        long k = 22481440L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case24() {
        long r = 4430179L;
        long g = 9355845L;
        long b = 4672706L;
        long k = 12194599L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case25() {
        long r = 7985930L;
        long g = 9569776L;
        long b = 6121529L;
        long k = 18475752L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case26() {
        long r = 2010344L;
        long g = 3004454L;
        long b = 1800498L;
        long k = 6278167L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case27() {
        long r = 5885057L;
        long g = 2687399L;
        long b = 8951175L;
        long k = 5035557L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case28() {
        long r = 4792000L;
        long g = 1785765L;
        long b = 4144844L;
        long k = 8883598L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case29() {
        long r = 2810158L;
        long g = 4898812L;
        long b = 406946L;
        long k = 7000645L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case30() {
        long r = 18190633489L;
        long g = 83578833264L;
        long b = 20863098676L;
        long k = 52515023334L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case31() {
        long r = 57814135262L;
        long g = 46171158951L;
        long b = 13343448109L;
        long k = 68951653520L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case32() {
        long r = 20846177809L;
        long g = 30860288026L;
        long b = 987779564L;
        long k = 46565755486L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case33() {
        long r = 17964018705L;
        long g = 65273511246L;
        long b = 31105494141L;
        long k = 50314587302L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case34() {
        long r = 28133773839L;
        long g = 72608065996L;
        long b = 5681311908L;
        long k = 43120633686L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case35() {
        long r = 66977089037L;
        long g = 56944425814L;
        long b = 82337384434L;
        long k = 197258589648L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case36() {
        long r = 98564133914L;
        long g = 53043597217L;
        long b = 21180174395L;
        long k = 34013735008L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case37() {
        long r = 64139288192L;
        long g = 34311997200L;
        long b = 48112755322L;
        long k = 121348738051L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case38() {
        long r = 51741562991L;
        long g = 99687325033L;
        long b = 13939616071L;
        long k = 144233234402L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case39() {
        long r = 72283793455L;
        long g = 66061351779L;
        long b = 86535283095L;
        long k = 355975292L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case40() {
        long r = 47897402498L;
        long g = 58932763704L;
        long b = 55080125866L;
        long k = 152946315811L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case41() {
        long r = 43310090212L;
        long g = 21475482273L;
        long b = 20328413513L;
        long k = 70841109725L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case42() {
        long r = 626333460107L;
        long g = 666760469323L;
        long b = 313414761518L;
        long k = 656725177609L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case43() {
        long r = 503832174890L;
        long g = 917383384318L;
        long b = 845748922941L;
        long k = 1647508415774L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case44() {
        long r = 706484443531L;
        long g = 466016836073L;
        long b = 435981479176L;
        long k = 1514977500901L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case45() {
        long r = 100489160883L;
        long g = 923912918759L;
        long b = 462258494532L;
        long k = 95912411851L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case46() {
        long r = 392857606821L;
        long g = 404636675251L;
        long b = 534279348968L;
        long k = 1179342316622L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case47() {
        long r = 844166403055L;
        long g = 777778961952L;
        long b = 108199579541L;
        long k = 1722942659245L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case48() {
        long r = 410989660016L;
        long g = 590114992301L;
        long b = 572561515508L;
        long k = 763788223944L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case49() {
        long r = 418496129223L;
        long g = 300609398790L;
        long b = 530300495241L;
        long k = 1015225961325L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case50() {
        long r = 244407534832L;
        long g = 956536017325L;
        long b = 744413242574L;
        long k = 1797565825952L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case51() {
        long r = 892437032669L;
        long g = 635246552291L;
        long b = 194241815394L;
        long k = 105429236738L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case52() {
        long r = 580783397299L;
        long g = 349383150298L;
        long b = 207889734969L;
        long k = 690164647590L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case53() {
        long r = 271281576404L;
        long g = 789227539981L;
        long b = 962212822048L;
        long k = 1863718050608L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case54() {
        long r = 26L;
        long g = 26L;
        long b = 26L;
        long k = 33L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case55() {
        long r = 61L;
        long g = 61L;
        long b = 61L;
        long k = 97L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case56() {
        long r = 85L;
        long g = 85L;
        long b = 85L;
        long k = 119L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case57() {
        long r = 79L;
        long g = 79L;
        long b = 79L;
        long k = 216L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case58() {
        long r = 32L;
        long g = 32L;
        long b = 32L;
        long k = 18L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case59() {
        long r = 31L;
        long g = 31L;
        long b = 31L;
        long k = 12L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case60() {
        long r = 68L;
        long g = 68L;
        long b = 68L;
        long k = 191L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case61() {
        long r = 45L;
        long g = 45L;
        long b = 45L;
        long k = 129L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case62() {
        long r = 86L;
        long g = 86L;
        long b = 86L;
        long k = 82L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case63() {
        long r = 13L;
        long g = 13L;
        long b = 13L;
        long k = 12L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case64() {
        long r = 32701729912L;
        long g = 32701729912L;
        long b = 32701729912L;
        long k = 98064180824L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case65() {
        long r = 46291568432L;
        long g = 46291568432L;
        long b = 46291568432L;
        long k = 79822121054L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case66() {
        long r = 60221394423L;
        long g = 60221394423L;
        long b = 60221394423L;
        long k = 20767837386L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case67() {
        long r = 35489922699L;
        long g = 35489922699L;
        long b = 35489922699L;
        long k = 4913886416L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case68() {
        long r = 56555791800L;
        long g = 56555791800L;
        long b = 56555791800L;
        long k = 23213053963L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case69() {
        long r = 68260176158L;
        long g = 68260176158L;
        long b = 68260176158L;
        long k = 52267160656L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case70() {
        long r = 85106989680L;
        long g = 85106989680L;
        long b = 85106989680L;
        long k = 20509960668L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case71() {
        long r = 18121898115L;
        long g = 18121898115L;
        long b = 18121898115L;
        long k = 22097435614L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case72() {
        long r = 55551446643L;
        long g = 55551446643L;
        long b = 55551446643L;
        long k = 37599143362L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case73() {
        long r = 56305412628L;
        long g = 56305412628L;
        long b = 56305412628L;
        long k = 65705003776L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case74() {
        long r = 65647735755L;
        long g = 65647735755L;
        long b = 65647735755L;
        long k = 180537813277L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case75() {
        long r = 66821215108L;
        long g = 66821215108L;
        long b = 66821215108L;
        long k = 26015361630L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case76() {
        long r = 422956283443L;
        long g = 422956283443L;
        long b = 422956283443L;
        long k = 87027816312L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case77() {
        long r = 228133154414L;
        long g = 228133154414L;
        long b = 228133154414L;
        long k = 507231850784L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case78() {
        long r = 222181153250L;
        long g = 222181153250L;
        long b = 222181153250L;
        long k = 428718850508L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case79() {
        long r = 330907710080L;
        long g = 330907710080L;
        long b = 330907710080L;
        long k = 632493751189L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case80() {
        long r = 680476675966L;
        long g = 680476675966L;
        long b = 680476675966L;
        long k = 670069102921L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case81() {
        long r = 891982839604L;
        long g = 891982839604L;
        long b = 891982839604L;
        long k = 1781660401300L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case82() {
        long r = 737297275510L;
        long g = 737297275510L;
        long b = 737297275510L;
        long k = 1043058569267L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case83() {
        long r = 924923630217L;
        long g = 924923630217L;
        long b = 924923630217L;
        long k = 235115274967L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case84() {
        long r = 915754740899L;
        long g = 915754740899L;
        long b = 915754740899L;
        long k = 1685177154207L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case85() {
        long r = 898069788816L;
        long g = 898069788816L;
        long b = 898069788816L;
        long k = 1650509712088L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case86() {
        long r = 726158833853L;
        long g = 726158833853L;
        long b = 726158833853L;
        long k = 932704193638L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case87() {
        long r = 654823868612L;
        long g = 654823868612L;
        long b = 654823868612L;
        long k = 1464208169353L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case88() {
        long r = 12L;
        long g = 12L;
        long b = 59L;
        long k = 21L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case89() {
        long r = 39L;
        long g = 49L;
        long b = 39L;
        long k = 70L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case90() {
        long r = 98L;
        long g = 77L;
        long b = 77L;
        long k = 239L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case91() {
        long r = 67L;
        long g = 67L;
        long b = 75L;
        long k = 23L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case92() {
        long r = 14L;
        long g = 14L;
        long b = 6L;
        long k = 10L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case93() {
        long r = 47L;
        long g = 47L;
        long b = 49L;
        long k = 143L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case94() {
        long r = 62L;
        long g = 62L;
        long b = 18L;
        long k = 20L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case95() {
        long r = 75L;
        long g = 8L;
        long b = 8L;
        long k = 20L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case96() {
        long r = 45L;
        long g = 58L;
        long b = 45L;
        long k = 137L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case97() {
        long r = 19L;
        long g = 19L;
        long b = 9L;
        long k = 5L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case98() {
        long r = 91L;
        long g = 91L;
        long b = 9L;
        long k = 29L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case99() {
        long r = 54L;
        long g = 54L;
        long b = 75L;
        long k = 168L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case100() {
        long r = 37946L;
        long g = 37946L;
        long b = 92329L;
        long k = 35350L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case101() {
        long r = 92424L;
        long g = 58936L;
        long b = 92424L;
        long k = 144202L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case102() {
        long r = 82153L;
        long g = 9362L;
        long b = 9362L;
        long k = 22355L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case103() {
        long r = 99913L;
        long g = 2753L;
        long b = 2753L;
        long k = 25082L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case104() {
        long r = 28973L;
        long g = 83433L;
        long b = 28973L;
        long k = 124635L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case105() {
        long r = 28257L;
        long g = 28257L;
        long b = 27927L;
        long k = 83919L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case106() {
        long r = 3654L;
        long g = 3654L;
        long b = 31248L;
        long k = 18552L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case107() {
        long r = 88535L;
        long g = 59293L;
        long b = 88535L;
        long k = 44603L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case108() {
        long r = 3924L;
        long g = 70696L;
        long b = 70696L;
        long k = 24199L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case109() {
        long r = 24369L;
        long g = 24369L;
        long b = 27043L;
        long k = 30105L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case110() {
        long r = 6183L;
        long g = 83041L;
        long b = 6183L;
        long k = 5679L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case111() {
        long r = 1077L;
        long g = 1077L;
        long b = 40737L;
        long k = 25362L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case112() {
        long r = 63930398284L;
        long g = 63930398284L;
        long b = 30378117417L;
        long k = 48312793795L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case113() {
        long r = 45571515417L;
        long g = 45571515417L;
        long b = 29456008186L;
        long k = 91869353001L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case114() {
        long r = 92090466298L;
        long g = 31190728339L;
        long b = 31190728339L;
        long k = 128742689017L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case115() {
        long r = 23998268886L;
        long g = 91584426694L;
        long b = 91584426694L;
        long k = 196164386862L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case116() {
        long r = 90694269533L;
        long g = 92351177L;
        long b = 90694269533L;
        long k = 26997767L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case117() {
        long r = 24865128007L;
        long g = 53593715204L;
        long b = 24865128007L;
        long k = 89477595470L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case118() {
        long r = 43118509150L;
        long g = 43118509150L;
        long b = 42502386666L;
        long k = 128416263047L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case119() {
        long r = 39177990775L;
        long g = 39177990775L;
        long b = 7640149761L;
        long k = 4511435474L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case120() {
        long r = 21580785752L;
        long g = 21580785752L;
        long b = 28080423121L;
        long k = 19325998009L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case121() {
        long r = 31043135663L;
        long g = 831337362L;
        long b = 31043135663L;
        long k = 1376466048L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case122() {
        long r = 89284296662L;
        long g = 40657861169L;
        long b = 40657861169L;
        long k = 154805329697L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case123() {
        long r = 46152004189L;
        long g = 46152004189L;
        long b = 42079772218L;
        long k = 130145169291L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case124() {
        long r = 460837220854L;
        long g = 460837220854L;
        long b = 299774813721L;
        long k = 325014188660L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case125() {
        long r = 884634120889L;
        long g = 437379550020L;
        long b = 437379550020L;
        long k = 1306653465466L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case126() {
        long r = 151369432901L;
        long g = 151369432901L;
        long b = 182241941000L;
        long k = 462720469723L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case127() {
        long r = 119755690359L;
        long g = 119755690359L;
        long b = 878819376049L;
        long k = 276314988056L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case128() {
        long r = 777229231787L;
        long g = 365144179599L;
        long b = 777229231787L;
        long k = 127733006877L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case129() {
        long r = 411818993712L;
        long g = 171482843497L;
        long b = 411818993712L;
        long k = 641325335864L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case130() {
        long r = 267800814278L;
        long g = 267800814278L;
        long b = 505207425358L;
        long k = 951345112894L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case131() {
        long r = 769229758967L;
        long g = 769229758967L;
        long b = 836214927899L;
        long k = 168741377475L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case132() {
        long r = 579190957167L;
        long g = 579190957167L;
        long b = 362324512540L;
        long k = 968643772132L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case133() {
        long r = 826093310321L;
        long g = 826093310321L;
        long b = 771643087115L;
        long k = 1390815007575L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case134() {
        long r = 496424179646L;
        long g = 289161382390L;
        long b = 289161382390L;
        long k = 613723873622L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case135() {
        long r = 957887351385L;
        long g = 247067893127L;
        long b = 247067893127L;
        long k = 611944281520L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case136() {
        long r = 40099900800L;
        long g = 40099900800L;
        long b = 40099900800L;
        long k = 99999999999L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case137() {
        long r = 100000000000L;
        long g = 100000000000L;
        long b = 100000000000L;
        long k = 245489794516L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case138() {
        long r = 1000000000L;
        long g = 1000000000L;
        long b = 1000000000L;
        long k = 3000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case139() {
        long r = 1000000000000L;
        long g = 1000000000000L;
        long b = 1000000000000L;
        long k = 3000000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case140() {
        long r = 1000000000000L;
        long g = 1000000000000L;
        long b = 1000000000000L;
        long k = 1000000000000L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case141() {
        long r = 1000000000000L;
        long g = 1000000000000L;
        long b = 1000000000000L;
        long k = 1000000000002L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case142() {
        long r = 999999999999L;
        long g = 999999999999L;
        long b = 999999999999L;
        long k = 999999999999L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case143() {
        long r = 10000000000L;
        long g = 10000000000L;
        long b = 10000000000L;
        long k = 30000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case144() {
        long r = 999999999999L;
        long g = 999999999999L;
        long b = 999999999999L;
        long k = 2874536542514L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case145() {
        long r = 1000000000000L;
        long g = 1000000000000L;
        long b = 1000000000000L;
        long k = 200000000007L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case146() {
        long r = 1000000000000L;
        long g = 100000000000L;
        long b = 10000000000L;
        long k = 23423434L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case147() {
        long r = 100000000000L;
        long g = 100000000000L;
        long b = 99999999999L;
        long k = 200000009000L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case148() {
        long r = 250000000000L;
        long g = 500000000000L;
        long b = 1000000000000L;
        long k = 999999987655L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case149() {
        long r = 1000000000000L;
        long g = 1000000000000L;
        long b = 1000000000000L;
        long k = 2999999999999L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case150() {
        long r = 300000000000L;
        long g = 300000000000L;
        long b = 300000000000L;
        long k = 900000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case151() {
        long r = 9L;
        long g = 8L;
        long b = 7L;
        long k = 1L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case152() {
        long r = 1000000000000L;
        long g = 100000000000L;
        long b = 1L;
        long k = 1100000000001L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case153() {
        long r = 3L;
        long g = 3L;
        long b = 3L;
        long k = 5L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case154() {
        long r = 1000000000000L;
        long g = 1L;
        long b = 1000000000000L;
        long k = 1000000000000L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case155() {
        long r = 3L;
        long g = 7L;
        long b = 5L;
        long k = 15L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case156() {
        long r = 1000000000000L;
        long g = 1000000000000L;
        long b = 300000000000L;
        long k = 900000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case157() {
        long r = 10000000000L;
        long g = 100000000000L;
        long b = 900000000000L;
        long k = 100000000005L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case158() {
        long r = 2L;
        long g = 1000L;
        long b = 1L;
        long k = 1000L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case159() {
        long r = 2L;
        long g = 1L;
        long b = 3L;
        long k = 1L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case160() {
        long r = 1L;
        long g = 2L;
        long b = 4L;
        long k = 1L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case161() {
        long r = 999999999L;
        long g = 999999999L;
        long b = 999999999L;
        long k = 999999999L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case162() {
        long r = 1L;
        long g = 1L;
        long b = 1L;
        long k = 2L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case163() {
        long r = 100L;
        long g = 101L;
        long b = 300L;
        long k = 449L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case164() {
        long r = 999999999997L;
        long g = 999999999859L;
        long b = 999999999869L;
        long k = 2999999999720L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case165() {
        long r = 1L;
        long g = 2L;
        long b = 2L;
        long k = 4L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case166() {
        long r = 10L;
        long g = 20L;
        long b = 30L;
        long k = 31L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case167() {
        long r = 4L;
        long g = 4L;
        long b = 4L;
        long k = 3L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case168() {
        long r = 1L;
        long g = 2L;
        long b = 1000L;
        long k = 10L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case169() {
        long r = 2L;
        long g = 3L;
        long b = 4L;
        long k = 7L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case170() {
        long r = 100000000000L;
        long g = 100000000000L;
        long b = 100000000000L;
        long k = 300000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case171() {
        long r = 1230L;
        long g = 32L;
        long b = 653L;
        long k = 1915L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case172() {
        long r = 1L;
        long g = 10L;
        long b = 100L;
        long k = 60L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case173() {
        long r = 1466076707L;
        long g = 205375936L;
        long b = 1303299017L;
        long k = 820489468L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case174() {
        long r = 100L;
        long g = 100L;
        long b = 200L;
        long k = 350L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case175() {
        long r = 1L;
        long g = 2L;
        long b = 100L;
        long k = 6L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case176() {
        long r = 4L;
        long g = 4L;
        long b = 4L;
        long k = 5L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case177() {
        long r = 1000000000000L;
        long g = 999999999999L;
        long b = 999999999999L;
        long k = 1999999999999L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case178() {
        long r = 2L;
        long g = 3L;
        long b = 5L;
        long k = 7L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case179() {
        long r = 1000000000000L;
        long g = 99999999999L;
        long b = 999999999999L;
        long k = 999999999999L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case180() {
        long r = 1L;
        long g = 1000000000000L;
        long b = 1000000000000L;
        long k = 1000000000009L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case181() {
        long r = 7L;
        long g = 4L;
        long b = 3L;
        long k = 10L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case182() {
        long r = 10000000000L;
        long g = 20000000000L;
        long b = 30000000000L;
        long k = 50000000000L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case183() {
        long r = 1L;
        long g = 2L;
        long b = 3L;
        long k = 5L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case184() {
        long r = 9999999999L;
        long g = 9999999999L;
        long b = 9999999999L;
        long k = 10000000000L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case185() {
        long r = 4L;
        long g = 4L;
        long b = 2L;
        long k = 9L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case186() {
        long r = 3L;
        long g = 4L;
        long b = 5L;
        long k = 10L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case187() {
        long r = 2L;
        long g = 5L;
        long b = 5L;
        long k = 9L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case188() {
        long r = 1L;
        long g = 3L;
        long b = 3L;
        long k = 5L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case189() {
        long r = 2L;
        long g = 1L;
        long b = 1L;
        long k = 2L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case190() {
        long r = 100L;
        long g = 100L;
        long b = 50L;
        long k = 151L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case191() {
        long r = 1000000000L;
        long g = 1000000000L;
        long b = 1000000000L;
        long k = 2L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case192() {
        long r = 100L;
        long g = 300L;
        long b = 200L;
        long k = 401L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case193() {
        long r = 10000000000L;
        long g = 10000000000L;
        long b = 10000000000L;
        long k = 10000000000L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case194() {
        long r = 1000000000000L;
        long g = 999999999999L;
        long b = 99999999999L;
        long k = 1999999999999L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case195() {
        long r = 7L;
        long g = 3L;
        long b = 3L;
        long k = 10L;
        assertEquals("RED", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case196() {
        long r = 2L;
        long g = 5L;
        long b = 8L;
        long k = 11L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case197() {
        long r = 2L;
        long g = 2L;
        long b = 1L;
        long k = 3L;
        assertEquals("BLUE", alternatecolors.getColor(r, g, b, k));
    }

    @Test
    public void case198() {
        long r = 3L;
        long g = 6L;
        long b = 4L;
        long k = 13L;
        assertEquals("GREEN", alternatecolors.getColor(r, g, b, k));
    }

}
