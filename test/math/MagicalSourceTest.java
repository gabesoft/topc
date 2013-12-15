package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MagicalSourceTest {
    MagicalSource magicalsource = new MagicalSource();

    @Test
    public void case1() {
        long x = 1371110974L;
        assertEquals(1234L, magicalsource.calculate(x));
    }

    @Test
    public void case2() {
        long x = 111111L;
        assertEquals(1L, magicalsource.calculate(x));
    }

    @Test
    public void case3() {
        long x = 10989L;
        assertEquals(99L, magicalsource.calculate(x));
    }

    @Test
    public void case4() {
        long x = 120L;
        assertEquals(120L, magicalsource.calculate(x));
    }

    @Test
    public void case5() {
        long x = 999999999988L;
        assertEquals(90909090908L, magicalsource.calculate(x));
    }

    @Test
    public void case6() {
        long x = 109999999989L;
        assertEquals(99L, magicalsource.calculate(x));
    }

    @Test
    public void case7() {
        long x = 33333333333L;
        assertEquals(3L, magicalsource.calculate(x));
    }

    @Test
    public void case8() {
        long x = 66666666666L;
        assertEquals(6L, magicalsource.calculate(x));
    }

    @Test
    public void case9() {
        long x = 55555555555L;
        assertEquals(5L, magicalsource.calculate(x));
    }

    @Test
    public void case10() {
        long x = 11111111111L;
        assertEquals(1L, magicalsource.calculate(x));
    }

    @Test
    public void case11() {
        long x = 77777777777L;
        assertEquals(7L, magicalsource.calculate(x));
    }

    @Test
    public void case12() {
        long x = 99999999999L;
        assertEquals(9L, magicalsource.calculate(x));
    }

    @Test
    public void case13() {
        long x = 22222222222L;
        assertEquals(2L, magicalsource.calculate(x));
    }

    @Test
    public void case14() {
        long x = 46666666662L;
        assertEquals(42L, magicalsource.calculate(x));
    }

    @Test
    public void case15() {
        long x = 41111111107L;
        assertEquals(37L, magicalsource.calculate(x));
    }

    @Test
    public void case16() {
        long x = 29999999997L;
        assertEquals(27L, magicalsource.calculate(x));
    }

    @Test
    public void case17() {
        long x = 65555555549L;
        assertEquals(59L, magicalsource.calculate(x));
    }

    @Test
    public void case18() {
        long x = 26666666664L;
        assertEquals(24L, magicalsource.calculate(x));
    }

    @Test
    public void case19() {
        long x = 74444444437L;
        assertEquals(67L, magicalsource.calculate(x));
    }

    @Test
    public void case20() {
        long x = 95555555546L;
        assertEquals(86L, magicalsource.calculate(x));
    }

    @Test
    public void case21() {
        long x = 54444444439L;
        assertEquals(49L, magicalsource.calculate(x));
    }

    @Test
    public void case22() {
        long x = 77777777770L;
        assertEquals(70L, magicalsource.calculate(x));
    }

    @Test
    public void case23() {
        long x = 58888888883L;
        assertEquals(53L, magicalsource.calculate(x));
    }

    @Test
    public void case24() {
        long x = 1111111111L;
        assertEquals(1L, magicalsource.calculate(x));
    }

    @Test
    public void case25() {
        long x = 83333333325L;
        assertEquals(75L, magicalsource.calculate(x));
    }

    @Test
    public void case26() {
        long x = 69999999993L;
        assertEquals(63L, magicalsource.calculate(x));
    }

    @Test
    public void case27() {
        long x = 93333333324L;
        assertEquals(84L, magicalsource.calculate(x));
    }

    @Test
    public void case28() {
        long x = 28888888886L;
        assertEquals(26L, magicalsource.calculate(x));
    }

    @Test
    public void case29() {
        long x = 86666666658L;
        assertEquals(78L, magicalsource.calculate(x));
    }

    @Test
    public void case30() {
        long x = 95888888793L;
        assertEquals(863L, magicalsource.calculate(x));
    }

    @Test
    public void case31() {
        long x = 98555555457L;
        assertEquals(887L, magicalsource.calculate(x));
    }

    @Test
    public void case32() {
        long x = 91111111020L;
        assertEquals(820L, magicalsource.calculate(x));
    }

    @Test
    public void case33() {
        long x = 59666666607L;
        assertEquals(537L, magicalsource.calculate(x));
    }

    @Test
    public void case34() {
        long x = 28999999971L;
        assertEquals(261L, magicalsource.calculate(x));
    }

    @Test
    public void case35() {
        long x = 58444444386L;
        assertEquals(526L, magicalsource.calculate(x));
    }

    @Test
    public void case36() {
        long x = 12444444432L;
        assertEquals(112L, magicalsource.calculate(x));
    }

    @Test
    public void case37() {
        long x = 22888888866L;
        assertEquals(206L, magicalsource.calculate(x));
    }

    @Test
    public void case38() {
        long x = 97999999902L;
        assertEquals(882L, magicalsource.calculate(x));
    }

    @Test
    public void case39() {
        long x = 29888888859L;
        assertEquals(269L, magicalsource.calculate(x));
    }

    @Test
    public void case40() {
        long x = 11777777766L;
        assertEquals(106L, magicalsource.calculate(x));
    }

    @Test
    public void case41() {
        long x = 73555555482L;
        assertEquals(662L, magicalsource.calculate(x));
    }

    @Test
    public void case42() {
        long x = 41111111070L;
        assertEquals(370L, magicalsource.calculate(x));
    }

    @Test
    public void case43() {
        long x = 58777777719L;
        assertEquals(529L, magicalsource.calculate(x));
    }

    @Test
    public void case44() {
        long x = 74999999925L;
        assertEquals(675L, magicalsource.calculate(x));
    }

    @Test
    public void case45() {
        long x = 9555555546L;
        assertEquals(86L, magicalsource.calculate(x));
    }

    @Test
    public void case46() {
        long x = 666666666L;
        assertEquals(6L, magicalsource.calculate(x));
    }

    @Test
    public void case47() {
        long x = 57111111054L;
        assertEquals(514L, magicalsource.calculate(x));
    }

    @Test
    public void case48() {
        long x = 95444444349L;
        assertEquals(859L, magicalsource.calculate(x));
    }

    @Test
    public void case49() {
        long x = 30888888858L;
        assertEquals(278L, magicalsource.calculate(x));
    }

    @Test
    public void case50() {
        long x = 85599999144L;
        assertEquals(7704L, magicalsource.calculate(x));
    }

    @Test
    public void case51() {
        long x = 89555554660L;
        assertEquals(8060L, magicalsource.calculate(x));
    }

    @Test
    public void case52() {
        long x = 30466666362L;
        assertEquals(2742L, magicalsource.calculate(x));
    }

    @Test
    public void case53() {
        long x = 10488888784L;
        assertEquals(944L, magicalsource.calculate(x));
    }

    @Test
    public void case54() {
        long x = 19499999805L;
        assertEquals(1755L, magicalsource.calculate(x));
    }

    @Test
    public void case55() {
        long x = 32411110787L;
        assertEquals(2917L, magicalsource.calculate(x));
    }

    @Test
    public void case56() {
        long x = 32944444115L;
        assertEquals(2965L, magicalsource.calculate(x));
    }

    @Test
    public void case57() {
        long x = 71111110400L;
        assertEquals(6400L, magicalsource.calculate(x));
    }

    @Test
    public void case58() {
        long x = 86833332465L;
        assertEquals(7815L, magicalsource.calculate(x));
    }

    @Test
    public void case59() {
        long x = 30899999691L;
        assertEquals(2781L, magicalsource.calculate(x));
    }

    @Test
    public void case60() {
        long x = 30333333030L;
        assertEquals(2730L, magicalsource.calculate(x));
    }

    @Test
    public void case61() {
        long x = 75422221468L;
        assertEquals(6788L, magicalsource.calculate(x));
    }

    @Test
    public void case62() {
        long x = 16144444283L;
        assertEquals(1453L, magicalsource.calculate(x));
    }

    @Test
    public void case63() {
        long x = 70599999294L;
        assertEquals(6354L, magicalsource.calculate(x));
    }

    @Test
    public void case64() {
        long x = 63166666035L;
        assertEquals(5685L, magicalsource.calculate(x));
    }

    @Test
    public void case65() {
        long x = 311111108L;
        assertEquals(28L, magicalsource.calculate(x));
    }

    @Test
    public void case66() {
        long x = 50999999490L;
        assertEquals(4590L, magicalsource.calculate(x));
    }

    @Test
    public void case67() {
        long x = 15722222065L;
        assertEquals(1415L, magicalsource.calculate(x));
    }

    @Test
    public void case68() {
        long x = 3833333295L;
        assertEquals(345L, magicalsource.calculate(x));
    }

    @Test
    public void case69() {
        long x = 12655555429L;
        assertEquals(1139L, magicalsource.calculate(x));
    }

    @Test
    public void case70() {
        long x = 61457771632L;
        assertEquals(55312L, magicalsource.calculate(x));
    }

    @Test
    public void case71() {
        long x = 55917772186L;
        assertEquals(50326L, magicalsource.calculate(x));
    }

    @Test
    public void case72() {
        long x = 7306665936L;
        assertEquals(6576L, magicalsource.calculate(x));
    }

    @Test
    public void case73() {
        long x = 93254435119L;
        assertEquals(83929L, magicalsource.calculate(x));
    }

    @Test
    public void case74() {
        long x = 50719994928L;
        assertEquals(45648L, magicalsource.calculate(x));
    }

    @Test
    public void case75() {
        long x = 28041108307L;
        assertEquals(25237L, magicalsource.calculate(x));
    }

    @Test
    public void case76() {
        long x = 74966659170L;
        assertEquals(67470L, magicalsource.calculate(x));
    }

    @Test
    public void case77() {
        long x = 43231106788L;
        assertEquals(38908L, magicalsource.calculate(x));
    }

    @Test
    public void case78() {
        long x = 46773328656L;
        assertEquals(42096L, magicalsource.calculate(x));
    }

    @Test
    public void case79() {
        long x = 89365546619L;
        assertEquals(80429L, magicalsource.calculate(x));
    }

    @Test
    public void case80() {
        long x = 73295548226L;
        assertEquals(65966L, magicalsource.calculate(x));
    }

    @Test
    public void case81() {
        long x = 19954442449L;
        assertEquals(17959L, magicalsource.calculate(x));
    }

    @Test
    public void case82() {
        long x = 64771104634L;
        assertEquals(58294L, magicalsource.calculate(x));
    }

    @Test
    public void case83() {
        long x = 86707769107L;
        assertEquals(78037L, magicalsource.calculate(x));
    }

    @Test
    public void case84() {
        long x = 38014440643L;
        assertEquals(34213L, magicalsource.calculate(x));
    }

    @Test
    public void case85() {
        long x = 28206663846L;
        assertEquals(25386L, magicalsource.calculate(x));
    }

    @Test
    public void case86() {
        long x = 33263330007L;
        assertEquals(29937L, magicalsource.calculate(x));
    }

    @Test
    public void case87() {
        long x = 79901103121L;
        assertEquals(71911L, magicalsource.calculate(x));
    }

    @Test
    public void case88() {
        long x = 11563332177L;
        assertEquals(10407L, magicalsource.calculate(x));
    }

    @Test
    public void case89() {
        long x = 48959995104L;
        assertEquals(44064L, magicalsource.calculate(x));
    }

    @Test
    public void case90() {
        long x = 7870881018L;
        assertEquals(70838L, magicalsource.calculate(x));
    }

    @Test
    public void case91() {
        long x = 48968951031L;
        assertEquals(440721L, magicalsource.calculate(x));
    }

    @Test
    public void case92() {
        long x = 95294793594L;
        assertEquals(857654L, magicalsource.calculate(x));
    }

    @Test
    public void case93() {
        long x = 91226130996L;
        assertEquals(821036L, magicalsource.calculate(x));
    }

    @Test
    public void case94() {
        long x = 41002958997L;
        assertEquals(369027L, magicalsource.calculate(x));
    }

    @Test
    public void case95() {
        long x = 17687760090L;
        assertEquals(159190L, magicalsource.calculate(x));
    }

    @Test
    public void case96() {
        long x = 69645374799L;
        assertEquals(626809L, magicalsource.calculate(x));
    }

    @Test
    public void case97() {
        long x = 40299404145L;
        assertEquals(362695L, magicalsource.calculate(x));
    }

    @Test
    public void case98() {
        long x = 84937581729L;
        assertEquals(764439L, magicalsource.calculate(x));
    }

    @Test
    public void case99() {
        long x = 74206592460L;
        assertEquals(667860L, magicalsource.calculate(x));
    }

    @Test
    public void case100() {
        long x = 84277471278L;
        assertEquals(758498L, magicalsource.calculate(x));
    }

    @Test
    public void case101() {
        long x = 66784044327L;
        assertEquals(601057L, magicalsource.calculate(x));
    }

    @Test
    public void case102() {
        long x = 84265804623L;
        assertEquals(758393L, magicalsource.calculate(x));
    }

    @Test
    public void case103() {
        long x = 63069936930L;
        assertEquals(567630L, magicalsource.calculate(x));
    }

    @Test
    public void case104() {
        long x = 67613599053L;
        assertEquals(608523L, magicalsource.calculate(x));
    }

    @Test
    public void case105() {
        long x = 73831592835L;
        assertEquals(664485L, magicalsource.calculate(x));
    }

    @Test
    public void case106() {
        long x = 10763322570L;
        assertEquals(96870L, magicalsource.calculate(x));
    }

    @Test
    public void case107() {
        long x = 17191427253L;
        assertEquals(154723L, magicalsource.calculate(x));
    }

    @Test
    public void case108() {
        long x = 40739292594L;
        assertEquals(366654L, magicalsource.calculate(x));
    }

    @Test
    public void case109() {
        long x = 50351616315L;
        assertEquals(453165L, magicalsource.calculate(x));
    }

    @Test
    public void case110() {
        long x = 32699050784L;
        assertEquals(2942944L, magicalsource.calculate(x));
    }

    @Test
    public void case111() {
        long x = 59916723049L;
        assertEquals(5392559L, magicalsource.calculate(x));
    }

    @Test
    public void case112() {
        long x = 15941662804L;
        assertEquals(1434764L, magicalsource.calculate(x));
    }

    @Test
    public void case113() {
        long x = 9385239480L;
        assertEquals(844680L, magicalsource.calculate(x));
    }

    @Test
    public void case114() {
        long x = 539494605L;
        assertEquals(48555L, magicalsource.calculate(x));
    }

    @Test
    public void case115() {
        long x = 10483306277L;
        assertEquals(943507L, magicalsource.calculate(x));
    }

    @Test
    public void case116() {
        long x = 92893071060L;
        assertEquals(8360460L, magicalsource.calculate(x));
    }

    @Test
    public void case117() {
        long x = 85345635424L;
        assertEquals(7681184L, magicalsource.calculate(x));
    }

    @Test
    public void case118() {
        long x = 27130395360L;
        assertEquals(2441760L, magicalsource.calculate(x));
    }

    @Test
    public void case119() {
        long x = 39626325955L;
        assertEquals(3566405L, magicalsource.calculate(x));
    }

    @Test
    public void case120() {
        long x = 73517175932L;
        assertEquals(6616612L, magicalsource.calculate(x));
    }

    @Test
    public void case121() {
        long x = 17587124127L;
        assertEquals(1582857L, magicalsource.calculate(x));
    }

    @Test
    public void case122() {
        long x = 27107117815L;
        assertEquals(2439665L, magicalsource.calculate(x));
    }

    @Test
    public void case123() {
        long x = 17972886936L;
        assertEquals(1617576L, magicalsource.calculate(x));
    }

    @Test
    public void case124() {
        long x = 1682938726L;
        assertEquals(151466L, magicalsource.calculate(x));
    }

    @Test
    public void case125() {
        long x = 92446097752L;
        assertEquals(8320232L, magicalsource.calculate(x));
    }

    @Test
    public void case126() {
        long x = 80731559343L;
        assertEquals(7265913L, magicalsource.calculate(x));
    }

    @Test
    public void case127() {
        long x = 87105506714L;
        assertEquals(7839574L, magicalsource.calculate(x));
    }

    @Test
    public void case128() {
        long x = 29399517113L;
        assertEquals(2645983L, magicalsource.calculate(x));
    }

    @Test
    public void case129() {
        long x = 79567537650L;
        assertEquals(7161150L, magicalsource.calculate(x));
    }

    @Test
    public void case130() {
        long x = 72523051414L;
        assertEquals(65277274L, magicalsource.calculate(x));
    }

    @Test
    public void case131() {
        long x = 6461123823L;
        assertEquals(5815593L, magicalsource.calculate(x));
    }

    @Test
    public void case132() {
        long x = 97056697804L;
        assertEquals(87359764L, magicalsource.calculate(x));
    }

    @Test
    public void case133() {
        long x = 5819433554L;
        assertEquals(5238014L, magicalsource.calculate(x));
    }

    @Test
    public void case134() {
        long x = 88772009689L;
        assertEquals(79902799L, magicalsource.calculate(x));
    }

    @Test
    public void case135() {
        long x = 68937326689L;
        assertEquals(62049799L, magicalsource.calculate(x));
    }

    @Test
    public void case136() {
        long x = 97852662644L;
        assertEquals(88076204L, magicalsource.calculate(x));
    }

    @Test
    public void case137() {
        long x = 68309912770L;
        assertEquals(61485070L, magicalsource.calculate(x));
    }

    @Test
    public void case138() {
        long x = 80276783741L;
        assertEquals(72256331L, magicalsource.calculate(x));
    }

    @Test
    public void case139() {
        long x = 50116611171L;
        assertEquals(45109461L, magicalsource.calculate(x));
    }

    @Test
    public void case140() {
        long x = 95708951481L;
        assertEquals(86146671L, magicalsource.calculate(x));
    }

    @Test
    public void case141() {
        long x = 44165030833L;
        assertEquals(39752503L, magicalsource.calculate(x));
    }

    @Test
    public void case142() {
        long x = 13042756705L;
        assertEquals(11739655L, magicalsource.calculate(x));
    }

    @Test
    public void case143() {
        long x = 24567190813L;
        assertEquals(22112683L, magicalsource.calculate(x));
    }

    @Test
    public void case144() {
        long x = 9677204405L;
        assertEquals(8710355L, magicalsource.calculate(x));
    }

    @Test
    public void case145() {
        long x = 30935211725L;
        assertEquals(27844475L, magicalsource.calculate(x));
    }

    @Test
    public void case146() {
        long x = 17068179678L;
        assertEquals(15362898L, magicalsource.calculate(x));
    }

    @Test
    public void case147() {
        long x = 93296358320L;
        assertEquals(83975120L, magicalsource.calculate(x));
    }

    @Test
    public void case148() {
        long x = 60977225001L;
        assertEquals(54884991L, magicalsource.calculate(x));
    }

    @Test
    public void case149() {
        long x = 44750840024L;
        assertEquals(40279784L, magicalsource.calculate(x));
    }

    @Test
    public void case150() {
        long x = 42644966901L;
        assertEquals(384188891L, magicalsource.calculate(x));
    }

    @Test
    public void case151() {
        long x = 83056393023L;
        assertEquals(748255793L, magicalsource.calculate(x));
    }

    @Test
    public void case152() {
        long x = 7689064461L;
        assertEquals(69270851L, magicalsource.calculate(x));
    }

    @Test
    public void case153() {
        long x = 71625791400L;
        assertEquals(645277400L, magicalsource.calculate(x));
    }

    @Test
    public void case154() {
        long x = 66252874806L;
        assertEquals(596872746L, magicalsource.calculate(x));
    }

    @Test
    public void case155() {
        long x = 99873599538L;
        assertEquals(899762158L, magicalsource.calculate(x));
    }

    @Test
    public void case156() {
        long x = 48429826029L;
        assertEquals(436304739L, magicalsource.calculate(x));
    }

    @Test
    public void case157() {
        long x = 93984092496L;
        assertEquals(846703536L, magicalsource.calculate(x));
    }

    @Test
    public void case158() {
        long x = 18125501577L;
        assertEquals(163292807L, magicalsource.calculate(x));
    }

    @Test
    public void case159() {
        long x = 64618612038L;
        assertEquals(582149658L, magicalsource.calculate(x));
    }

    @Test
    public void case160() {
        long x = 72518473047L;
        assertEquals(653319577L, magicalsource.calculate(x));
    }

    @Test
    public void case161() {
        long x = 78630900279L;
        assertEquals(708386489L, magicalsource.calculate(x));
    }

    @Test
    public void case162() {
        long x = 51949137972L;
        assertEquals(468010252L, magicalsource.calculate(x));
    }

    @Test
    public void case163() {
        long x = 29686345605L;
        assertEquals(267444555L, magicalsource.calculate(x));
    }

    @Test
    public void case164() {
        long x = 94307502096L;
        assertEquals(849617136L, magicalsource.calculate(x));
    }

    @Test
    public void case165() {
        long x = 31000969332L;
        assertEquals(279288012L, magicalsource.calculate(x));
    }

    @Test
    public void case166() {
        long x = 69449929884L;
        assertEquals(625675044L, magicalsource.calculate(x));
    }

    @Test
    public void case167() {
        long x = 7746559464L;
        assertEquals(69788824L, magicalsource.calculate(x));
    }

    @Test
    public void case168() {
        long x = 5602834002L;
        assertEquals(50475982L, magicalsource.calculate(x));
    }

    @Test
    public void case169() {
        long x = 44292276720L;
        assertEquals(399029520L, magicalsource.calculate(x));
    }

    @Test
    public void case170() {
        long x = 92881718908L;
        assertEquals(8443792628L, magicalsource.calculate(x));
    }

    @Test
    public void case171() {
        long x = 46386918061L;
        assertEquals(4216992551L, magicalsource.calculate(x));
    }

    @Test
    public void case172() {
        long x = 91581700298L;
        assertEquals(8325609118L, magicalsource.calculate(x));
    }

    @Test
    public void case173() {
        long x = 33164462067L;
        assertEquals(3014951097L, magicalsource.calculate(x));
    }

    @Test
    public void case174() {
        long x = 97805839890L;
        assertEquals(8891439990L, magicalsource.calculate(x));
    }

    @Test
    public void case175() {
        long x = 92126459249L;
        assertEquals(8375132659L, magicalsource.calculate(x));
    }

    @Test
    public void case176() {
        long x = 36209615079L;
        assertEquals(3291783189L, magicalsource.calculate(x));
    }

    @Test
    public void case177() {
        long x = 30010378233L;
        assertEquals(2728216203L, magicalsource.calculate(x));
    }

    @Test
    public void case178() {
        long x = 644635684L;
        assertEquals(58603244L, magicalsource.calculate(x));
    }

    @Test
    public void case179() {
        long x = 17428002251L;
        assertEquals(1584363841L, magicalsource.calculate(x));
    }

    @Test
    public void case180() {
        long x = 14353281547L;
        assertEquals(1304843777L, magicalsource.calculate(x));
    }

    @Test
    public void case181() {
        long x = 30593629825L;
        assertEquals(2781239075L, magicalsource.calculate(x));
    }

    @Test
    public void case182() {
        long x = 12498852322L;
        assertEquals(1136259302L, magicalsource.calculate(x));
    }

    @Test
    public void case183() {
        long x = 33948190529L;
        assertEquals(3086199139L, magicalsource.calculate(x));
    }

    @Test
    public void case184() {
        long x = 89389617152L;
        assertEquals(8126328832L, magicalsource.calculate(x));
    }

    @Test
    public void case185() {
        long x = 75787735540L;
        assertEquals(6889794140L, magicalsource.calculate(x));
    }

    @Test
    public void case186() {
        long x = 3741734370L;
        assertEquals(340157670L, magicalsource.calculate(x));
    }

    @Test
    public void case187() {
        long x = 47212986062L;
        assertEquals(4292089642L, magicalsource.calculate(x));
    }

    @Test
    public void case188() {
        long x = 76715817134L;
        assertEquals(6974165194L, magicalsource.calculate(x));
    }

    @Test
    public void case189() {
        long x = 38830219296L;
        assertEquals(3530019936L, magicalsource.calculate(x));
    }

    @Test
    public void case190() {
        long x = 62424683757L;
        assertEquals(62424683757L, magicalsource.calculate(x));
    }

    @Test
    public void case191() {
        long x = 92681421258L;
        assertEquals(92681421258L, magicalsource.calculate(x));
    }

    @Test
    public void case192() {
        long x = 51373342511L;
        assertEquals(51373342511L, magicalsource.calculate(x));
    }

    @Test
    public void case193() {
        long x = 30234219672L;
        assertEquals(30234219672L, magicalsource.calculate(x));
    }

    @Test
    public void case194() {
        long x = 44867375625L;
        assertEquals(44867375625L, magicalsource.calculate(x));
    }

    @Test
    public void case195() {
        long x = 52756642751L;
        assertEquals(52756642751L, magicalsource.calculate(x));
    }

    @Test
    public void case196() {
        long x = 92177116771L;
        assertEquals(92177116771L, magicalsource.calculate(x));
    }

    @Test
    public void case197() {
        long x = 42210025245L;
        assertEquals(42210025245L, magicalsource.calculate(x));
    }

    @Test
    public void case198() {
        long x = 69382451719L;
        assertEquals(69382451719L, magicalsource.calculate(x));
    }

    @Test
    public void case199() {
        long x = 30717363925L;
        assertEquals(30717363925L, magicalsource.calculate(x));
    }

    @Test
    public void case200() {
        long x = 52589587409L;
        assertEquals(52589587409L, magicalsource.calculate(x));
    }

    @Test
    public void case201() {
        long x = 48886323507L;
        assertEquals(48886323507L, magicalsource.calculate(x));
    }

    @Test
    public void case202() {
        long x = 68600280996L;
        assertEquals(68600280996L, magicalsource.calculate(x));
    }

    @Test
    public void case203() {
        long x = 22097727412L;
        assertEquals(22097727412L, magicalsource.calculate(x));
    }

    @Test
    public void case204() {
        long x = 5594775364L;
        assertEquals(5594775364L, magicalsource.calculate(x));
    }

    @Test
    public void case205() {
        long x = 69933432952L;
        assertEquals(69933432952L, magicalsource.calculate(x));
    }

    @Test
    public void case206() {
        long x = 61492392322L;
        assertEquals(61492392322L, magicalsource.calculate(x));
    }

    @Test
    public void case207() {
        long x = 90918032507L;
        assertEquals(90918032507L, magicalsource.calculate(x));
    }

    @Test
    public void case208() {
        long x = 34231813010L;
        assertEquals(34231813010L, magicalsource.calculate(x));
    }

    @Test
    public void case209() {
        long x = 27341102484L;
        assertEquals(27341102484L, magicalsource.calculate(x));
    }

    @Test
    public void case210() {
        long x = 13566531L;
        assertEquals(1221L, magicalsource.calculate(x));
    }

    @Test
    public void case211() {
        long x = 16850581551L;
        assertEquals(151807041L, magicalsource.calculate(x));
    }

    @Test
    public void case212() {
        long x = 642222L;
        assertEquals(642222L, magicalsource.calculate(x));
    }

    @Test
    public void case213() {
        long x = 88888888888L;
        assertEquals(8L, magicalsource.calculate(x));
    }

    @Test
    public void case214() {
        long x = 598349270794L;
        assertEquals(54395388254L, magicalsource.calculate(x));
    }

    @Test
    public void case215() {
        long x = 137037035790L;
        assertEquals(1234567890L, magicalsource.calculate(x));
    }

    @Test
    public void case216() {
        long x = 109998899879L;
        assertEquals(9999899989L, magicalsource.calculate(x));
    }

    @Test
    public void case217() {
        long x = 13574L;
        assertEquals(1234L, magicalsource.calculate(x));
    }

    @Test
    public void case218() {
        long x = 999999999999L;
        assertEquals(9L, magicalsource.calculate(x));
    }

    @Test
    public void case219() {
        long x = 123435873813L;
        assertEquals(123435873813L, magicalsource.calculate(x));
    }

    @Test
    public void case220() {
        long x = 222222222222L;
        assertEquals(2L, magicalsource.calculate(x));
    }

    @Test
    public void case221() {
        long x = 10864197531L;
        assertEquals(987654321L, magicalsource.calculate(x));
    }

    @Test
    public void case222() {
        long x = 92341234123L;
        assertEquals(92341234123L, magicalsource.calculate(x));
    }

    @Test
    public void case223() {
        long x = 258439393908L;
        assertEquals(2328282828L, magicalsource.calculate(x));
    }

    @Test
    public void case224() {
        long x = 1474436986L;
        assertEquals(1327126L, magicalsource.calculate(x));
    }

    @Test
    public void case225() {
        long x = 87579L;
        assertEquals(789L, magicalsource.calculate(x));
    }

    @Test
    public void case226() {
        long x = 1353L;
        assertEquals(123L, magicalsource.calculate(x));
    }

    @Test
    public void case227() {
        long x = 120000100000L;
        assertEquals(10909100000L, magicalsource.calculate(x));
    }

    @Test
    public void case228() {
        long x = 122222222903L;
        assertEquals(11111111173L, magicalsource.calculate(x));
    }

    @Test
    public void case229() {
        long x = 21L;
        assertEquals(21L, magicalsource.calculate(x));
    }

    @Test
    public void case230() {
        long x = 24242424242L;
        assertEquals(24242424242L, magicalsource.calculate(x));
    }

}
