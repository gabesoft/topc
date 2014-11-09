package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FizzBuzzTurboTest {
    FizzBuzzTurbo fizzbuzzturbo = new FizzBuzzTurbo();

    @Test
    public void case1() {
        long A = 1L;
        long B = 4L;
        assertArrayEquals(new long[] { 1L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case2() {
        long A = 2L;
        long B = 6L;
        assertArrayEquals(new long[] { 2L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case3() {
        long A = 150L;
        long B = 165L;
        assertArrayEquals(new long[] { 4L, 2L, 2L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case4() {
        long A = 474747L;
        long B = 747474L;
        assertArrayEquals(new long[] { 72728L, 36363L, 18182L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case5() {
        long A = 1L;
        long B = 1L;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case6() {
        long A = 2L;
        long B = 2L;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case7() {
        long A = 3L;
        long B = 3L;
        assertArrayEquals(new long[] { 1L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case8() {
        long A = 10L;
        long B = 10L;
        assertArrayEquals(new long[] { 0L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case9() {
        long A = 15L;
        long B = 15L;
        assertArrayEquals(new long[] { 0L, 0L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case10() {
        long A = 29L;
        long B = 29L;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case11() {
        long A = 30L;
        long B = 30L;
        assertArrayEquals(new long[] { 0L, 0L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case12() {
        long A = 31L;
        long B = 31L;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case13() {
        long A = 40L;
        long B = 40L;
        assertArrayEquals(new long[] { 0L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case14() {
        long A = 47L;
        long B = 47L;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case15() {
        long A = 1L;
        long B = 961574729077486878L;
        assertArrayEquals(new long[] { 256419927753996501L, 128209963876998250L, 64104981938499125L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case16() {
        long A = 1L;
        long B = 969690745985575352L;
        assertArrayEquals(new long[] { 258584198929486760L, 129292099464743380L, 64646049732371690L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case17() {
        long A = 2L;
        long B = 932572744790738365L;
        assertArrayEquals(new long[] { 248686065277530231L, 124343032638765116L, 62171516319382557L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case18() {
        long A = 2L;
        long B = 942493741554318791L;
        assertArrayEquals(new long[] { 251331664414485011L, 125665832207242506L, 62832916103621252L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case19() {
        long A = 2L;
        long B = 956161331128091222L;
        assertArrayEquals(new long[] { 254976354967490992L, 127488177483745496L, 63744088741872748L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case20() {
        long A = 3L;
        long B = 916644652962961635L;
        assertArrayEquals(new long[] { 244438574123456436L, 122219287061728218L, 61109643530864109L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case21() {
        long A = 1L;
        long B = 903634696377824051L;
        assertArrayEquals(new long[] { 240969252367419747L, 120484626183709874L, 60242313091854936L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case22() {
        long A = 1L;
        long B = 997897124971294393L;
        assertArrayEquals(new long[] { 266105899992345172L, 133052949996172586L, 66526474998086292L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case23() {
        long A = 2L;
        long B = 920481086823903147L;
        assertArrayEquals(new long[] { 245461623153040840L, 122730811576520420L, 61365405788260209L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case24() {
        long A = 4L;
        long B = 964058125459890556L;
        assertArrayEquals(new long[] { 257082166789304147L, 128541083394652074L, 64270541697326037L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case25() {
        long A = 3L;
        long B = 931653762392195762L;
        assertArrayEquals(new long[] { 248441003304585536L, 124220501652292768L, 62110250826146384L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case26() {
        long A = 4L;
        long B = 955444493333250458L;
        assertArrayEquals(new long[] { 254785198222200121L, 127392599111100061L, 63696299555550030L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case27() {
        long A = 397478970173037155L;
        long B = 539466146345280224L;
        assertArrayEquals(new long[] { 37863246979264819L, 18931623489632410L, 9465811744816204L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case28() {
        long A = 419288862274313963L;
        long B = 790969176712720462L;
        assertArrayEquals(new long[] { 99114750516908400L, 49557375258454200L, 24778687629227100L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case29() {
        long A = 161780629001183449L;
        long B = 792845347608024286L;
        assertArrayEquals(new long[] { 168283924961824223L, 84141962480912112L, 42070981240456056L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case30() {
        long A = 434696931263743538L;
        long B = 444647743199529483L;
        assertArrayEquals(new long[] { 2653549849542919L, 1326774924771459L, 663387462385730L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case31() {
        long A = 321413177499911855L;
        long B = 649669244483624756L;
        assertArrayEquals(new long[] { 87534951195656774L, 43767475597828388L, 21883737798914193L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case32() {
        long A = 139242337281418962L;
        long B = 860605271493493969L;
        assertArrayEquals(new long[] { 192363449123220002L, 96181724561610000L, 48090862280805001L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case33() {
        long A = 167206637142521893L;
        long B = 346688750102520063L;
        assertArrayEquals(new long[] { 47861896789332845L, 23930948394666422L, 11965474197333212L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case34() {
        long A = 290368704958546069L;
        long B = 457487148054284990L;
        assertArrayEquals(new long[] { 44564918158863712L, 22282459079431857L, 11141229539715928L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case35() {
        long A = 359791099760826346L;
        long B = 642920662487020178L;
        assertArrayEquals(new long[] { 75501216726985022L, 37750608363492511L, 18875304181746255L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case36() {
        long A = 722912705312276976L;
        long B = 911866031060439261L;
        assertArrayEquals(new long[] { 50387553532843277L, 25193776766421638L, 12596888383210819L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case37() {
        long A = 853427743008756103L;
        long B = 879888482135011683L;
        assertArrayEquals(new long[] { 7056197100334821L, 3528098550167410L, 1764049275083706L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case38() {
        long A = 299387440688073929L;
        long B = 348413117061600967L;
        assertArrayEquals(new long[] { 13073513699607210L, 6536756849803605L, 3268378424901803L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case39() {
        long A = 326580842749285661L;
        long B = 909699510083828883L;
        assertArrayEquals(new long[] { 155498311289211526L, 77749155644605762L, 38874577822302882L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case40() {
        long A = 192441344361172571L;
        long B = 933187129330394372L;
        assertArrayEquals(new long[] { 197532209325125813L, 98766104662562906L, 49383052331281454L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case41() {
        long A = 314629682787953603L;
        long B = 764176844988746931L;
        assertArrayEquals(new long[] { 119879243253544888L, 59939621626772444L, 29969810813386222L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case42() {
        long A = 267545852315582004L;
        long B = 297985012303716089L;
        assertArrayEquals(new long[] { 8117109330169090L, 4058554665084545L, 2029277332542272L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case43() {
        long A = 142081782556603160L;
        long B = 413837186186015024L;
        assertArrayEquals(new long[] { 72468107634509831L, 36234053817254916L, 18117026908627457L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case44() {
        long A = 664219828511882442L;
        long B = 692370293763552053L;
        assertArrayEquals(new long[] { 7506790733778563L, 3753395366889281L, 1876697683444641L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case45() {
        long A = 378563365237109259L;
        long B = 761899675828236788L;
        assertArrayEquals(new long[] { 102223016157634008L, 51111508078817004L, 25555754039408502L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case46() {
        long A = 49151622844844413L;
        long B = 488242673204329915L;
        assertArrayEquals(new long[] { 117090946762529467L, 58545473381264734L, 29272736690632367L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case47() {
        long A = 306007182394072344L;
        long B = 518835169807946873L;
        assertArrayEquals(new long[] { 56754129977033208L, 28377064988516604L, 14188532494258302L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case48() {
        long A = 195616889028066345L;
        long B = 478903385241094354L;
        assertArrayEquals(new long[] { 75543065656807469L, 37771532828403734L, 18885766414201868L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case49() {
        long A = 67445786431842557L;
        long B = 626112604768032264L;
        assertArrayEquals(new long[] { 148977818222983923L, 74488909111491961L, 37244454555745980L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case50() {
        long A = 101238876615718648L;
        long B = 480743165053709728L;
        assertArrayEquals(new long[] { 101201143583464288L, 50600571791732144L, 25300285895866072L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case51() {
        long A = 82451605275412784L;
        long B = 415325919307210627L;
        assertArrayEquals(new long[] { 88766483741812758L, 44383241870906379L, 22191620935453190L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case52() {
        long A = 208223567685839269L;
        long B = 372594759786848683L;
        assertArrayEquals(new long[] { 43832317893602511L, 21916158946801256L, 10958079473400627L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case53() {
        long A = 838740078257909273L;
        long B = 931180210957050015L;
        assertArrayEquals(new long[] { 24650702053104198L, 12325351026552099L, 6162675513276050L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case54() {
        long A = 252361299542933329L;
        long B = 495535777509654126L;
        assertArrayEquals(new long[] { 64846527457792213L, 32423263728896107L, 16211631864448053L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case55() {
        long A = 709302378159832689L;
        long B = 834851837874070572L;
        assertArrayEquals(new long[] { 33479855923796770L, 16739927961898385L, 8369963980949192L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case56() {
        long A = 487924215477189966L;
        long B = 529348735718046729L;
        assertArrayEquals(new long[] { 11046538730895138L, 5523269365447568L, 2761634682723784L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case57() {
        long A = 21857780802393468L;
        long B = 477351058865690896L;
        assertArrayEquals(new long[] { 121464874150212648L, 60732437075106324L, 30366218537553162L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case58() {
        long A = 186632354130213084L;
        long B = 742376154314155338L;
        assertArrayEquals(new long[] { 148198346715717935L, 74099173357858967L, 37049586678929484L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case59() {
        long A = 539640619758087395L;
        long B = 924674358693185075L;
        assertArrayEquals(new long[] { 102675663716026048L, 51337831858013025L, 25668915929006512L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case60() {
        long A = 700317928484694715L;
        long B = 745791327586173994L;
        assertArrayEquals(new long[] { 12126239760394474L, 6063119880197237L, 3031559940098619L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case61() {
        long A = 13173508402927929L;
        long B = 236913933996190656L;
        assertArrayEquals(new long[] { 59664113491536728L, 29832056745768364L, 14916028372884182L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case62() {
        long A = 668230156617098997L;
        long B = 739271183936145495L;
        assertArrayEquals(new long[] { 18944273951745733L, 9472136975872866L, 4736068487936434L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case63() {
        long A = 479061995247225973L;
        long B = 883329982691655739L;
        assertArrayEquals(new long[] { 107804796651847937L, 53902398325923968L, 26951199162961985L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case64() {
        long A = 254595297271140395L;
        long B = 767046507505855292L;
        assertArrayEquals(new long[] { 136653656062590639L, 68326828031295320L, 34163414015647660L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case65() {
        long A = 662315051377427551L;
        long B = 926459760700470193L;
        assertArrayEquals(new long[] { 70438589152811372L, 35219294576405686L, 17609647288202842L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case66() {
        long A = 279550177551909522L;
        long B = 314286211699960353L;
        assertArrayEquals(new long[] { 9262942439480222L, 4631471219740110L, 2315735609870056L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case67() {
        long A = 63524787742327251L;
        long B = 419228954663410715L;
        assertArrayEquals(new long[] { 94854444512288924L, 47427222256144462L, 23713611128072231L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case68() {
        long A = 474896471944502178L;
        long B = 650353451230197547L;
        assertArrayEquals(new long[] { 46788527809518766L, 23394263904759383L, 11697131952379691L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case69() {
        long A = 502596589167164656L;
        long B = 595932444826925350L;
        assertArrayEquals(new long[] { 24889561509269519L, 12444780754634760L, 6222390377317379L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case70() {
        long A = 560240637400990012L;
        long B = 707254615545708373L;
        assertArrayEquals(new long[] { 39203727505258230L, 19601863752629115L, 9800931876314557L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case71() {
        long A = 59447034043076949L;
        long B = 144897967789338044L;
        assertArrayEquals(new long[] { 22786915665669626L, 11393457832834813L, 5696728916417406L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case72() {
        long A = 510327613223700161L;
        long B = 585834264851678456L;
        assertArrayEquals(new long[] { 20135107100794212L, 10067553550397106L, 5033776775198553L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case73() {
        long A = 669372155538435004L;
        long B = 776734092865104488L;
        assertArrayEquals(new long[] { 28629849953778529L, 14314924976889265L, 7157462488444632L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case74() {
        long A = 395501921694716987L;
        long B = 456119285092003500L;
        assertArrayEquals(new long[] { 16164630239276404L, 8082315119638202L, 4041157559819101L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case75() {
        long A = 151606123488146145L;
        long B = 439548322064777662L;
        assertArrayEquals(new long[] { 76784586287101738L, 38392293143550869L, 19196146571775435L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case76() {
        long A = 996287155999621052L;
        long B = 997183739489986253L;
        assertArrayEquals(new long[] { 239088930764054L, 119544465382027L, 59772232691013L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case77() {
        long A = 1L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 266666666666666667L, 133333333333333334L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case78() {
        long A = 1000000000000000L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 266400000000000000L, 133200000000000001L, 66600000000000000L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case79() {
        long A = 1L;
        long B = 999999999999999990L;
        assertArrayEquals(new long[] { 266666666666666664L, 133333333333333332L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case80() {
        long A = 1L;
        long B = 100000000000000000L;
        assertArrayEquals(new long[] { 26666666666666667L, 13333333333333334L, 6666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case81() {
        long A = 1L;
        long B = 1000000000000L;
        assertArrayEquals(new long[] { 266666666667L, 133333333334L, 66666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case82() {
        long A = 1L;
        long B = 10000000000000L;
        assertArrayEquals(new long[] { 2666666666667L, 1333333333334L, 666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case83() {
        long A = 15L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 266666666666666663L, 133333333333333332L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case84() {
        long A = 3L;
        long B = 1234567890123456L;
        assertArrayEquals(new long[] { 329218104032922L, 164609052016461L, 82304526008230L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case85() {
        long A = 7L;
        long B = 999999999999999991L;
        assertArrayEquals(new long[] { 266666666666666662L, 133333333333333331L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case86() {
        long A = 1L;
        long B = 10000000000000000L;
        assertArrayEquals(new long[] { 2666666666666667L, 1333333333333334L, 666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case87() {
        long A = 2L;
        long B = 100000000000L;
        assertArrayEquals(new long[] { 26666666667L, 13333333334L, 6666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case88() {
        long A = 5L;
        long B = 18518518368518518L;
        assertArrayEquals(new long[] { 4938271564938271L, 2469135782469136L, 1234567891234567L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case89() {
        long A = 150000000000000003L;
        long B = 150000000000000003L;
        assertArrayEquals(new long[] { 1L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case90() {
        long A = 1L;
        long B = 1000000000L;
        assertArrayEquals(new long[] { 266666667L, 133333334L, 66666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case91() {
        long A = 1L;
        long B = 100000000000L;
        assertArrayEquals(new long[] { 26666666667L, 13333333334L, 6666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case92() {
        long A = 1L;
        long B = 1000000000000000L;
        assertArrayEquals(new long[] { 266666666666667L, 133333333333334L, 66666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case93() {
        long A = 1000000000000L;
        long B = 2000000000000L;
        assertArrayEquals(new long[] { 266666666666L, 133333333334L, 66666666667L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case94() {
        long A = 1L;
        long B = 999999999999999999L;
        assertArrayEquals(new long[] { 266666666666666667L, 133333333333333333L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case95() {
        long A = 15L;
        long B = 9000000000000000L;
        assertArrayEquals(new long[] { 2399999999999996L, 1199999999999998L, 600000000000000L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case96() {
        long A = 1L;
        long B = 100000000000000L;
        assertArrayEquals(new long[] { 26666666666667L, 13333333333334L, 6666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case97() {
        long A = 15L;
        long B = 250157725494998535L;
        assertArrayEquals(new long[] { 66708726798666272L, 33354363399333136L, 16677181699666569L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case98() {
        long A = 17L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 266666666666666663L, 133333333333333332L, 66666666666666665L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case99() {
        long A = 1L;
        long B = 10000000000L;
        assertArrayEquals(new long[] { 2666666667L, 1333333334L, 666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case100() {
        long A = 1L;
        long B = 123456789123456L;
        assertArrayEquals(new long[] { 32921810432922L, 16460905216461L, 8230452608230L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case101() {
        long A = 7L;
        long B = 9L;
        assertArrayEquals(new long[] { 1L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case102() {
        long A = 10000L;
        long B = 10000000000L;
        assertArrayEquals(new long[] { 2666664000L, 1333332001L, 666666000L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case103() {
        long A = 7L;
        long B = 987654321987654321L;
        assertArrayEquals(new long[] { 263374485863374484L, 131687242931687242L, 65843621465843621L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case104() {
        long A = 1L;
        long B = 99999999999999999L;
        assertArrayEquals(new long[] { 26666666666666667L, 13333333333333333L, 6666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case105() {
        long A = 1L;
        long B = 1111111111111111L;
        assertArrayEquals(new long[] { 296296296296296L, 148148148148148L, 74074074074074L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case106() {
        long A = 10000000000000L;
        long B = 6666666666666666L;
        assertArrayEquals(new long[] { 1775111111111111L, 887555555555556L, 443777777777778L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case107() {
        long A = 21L;
        long B = 39L;
        assertArrayEquals(new long[] { 6L, 2L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case108() {
        long A = 1000000000000L;
        long B = 5000000000000L;
        assertArrayEquals(new long[] { 1066666666666L, 533333333334L, 266666666667L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case109() {
        long A = 3L;
        long B = 5L;
        assertArrayEquals(new long[] { 1L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case110() {
        long A = 15L;
        long B = 16L;
        assertArrayEquals(new long[] { 0L, 0L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case111() {
        long A = 3L;
        long B = 7L;
        assertArrayEquals(new long[] { 2L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case112() {
        long A = 15L;
        long B = 35L;
        assertArrayEquals(new long[] { 5L, 3L, 2L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case113() {
        long A = 1234567890L;
        long B = 999888777666555444L;
        assertArrayEquals(new long[] { 266637007048530015L, 133318503524265007L, 66659251762132504L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case114() {
        long A = 5546L;
        long B = 85910293850192845L;
        assertArrayEquals(new long[] { 22909411693383280L, 11454705846691640L, 5727352923345820L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case115() {
        long A = 3L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 266666666666666667L, 133333333333333334L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case116() {
        long A = 1L;
        long B = 15L;
        assertArrayEquals(new long[] { 4L, 2L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case117() {
        long A = 10000000000000L;
        long B = 10000000050000L;
        assertArrayEquals(new long[] { 13333L, 6667L, 3334L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case118() {
        long A = 100000000000000000L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 240000000000000000L, 120000000000000001L, 60000000000000000L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case119() {
        long A = 15L;
        long B = 31L;
        assertArrayEquals(new long[] { 4L, 2L, 2L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case120() {
        long A = 30L;
        long B = 46L;
        assertArrayEquals(new long[] { 4L, 2L, 2L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case121() {
        long A = 3L;
        long B = 8L;
        assertArrayEquals(new long[] { 2L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case122() {
        long A = 351435665634543L;
        long B = 7432653265436326L;
        assertArrayEquals(new long[] { 1888324693280476L, 944162346640238L, 472081173320119L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case123() {
        long A = 2L;
        long B = 1000000000000000000L;
        assertArrayEquals(new long[] { 266666666666666667L, 133333333333333334L, 66666666666666666L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case124() {
        long A = 10L;
        long B = 12L;
        assertArrayEquals(new long[] { 1L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case125() {
        long A = 10L;
        long B = 15L;
        assertArrayEquals(new long[] { 1L, 1L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case126() {
        long A = 99999999999999L;
        long B = 999999999999999999L;
        assertArrayEquals(new long[] { 266640000000000001L, 133320000000000000L, 66660000000000000L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case127() {
        long A = 3L;
        long B = 4L;
        assertArrayEquals(new long[] { 1L, 0L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case128() {
        long A = 15L;
        long B = 29L;
        assertArrayEquals(new long[] { 4L, 2L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case129() {
        long A = 14L;
        long B = 31L;
        assertArrayEquals(new long[] { 4L, 2L, 2L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case130() {
        long A = 15L;
        long B = 18L;
        assertArrayEquals(new long[] { 1L, 0L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case131() {
        long A = 222L;
        long B = 225L;
        assertArrayEquals(new long[] { 1L, 0L, 1L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case132() {
        long A = 1L;
        long B = 11L;
        assertArrayEquals(new long[] { 3L, 2L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case133() {
        long A = 4L;
        long B = 6L;
        assertArrayEquals(new long[] { 1L, 1L, 0L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case134() {
        long A = 2L;
        long B = 300000000000000000L;
        assertArrayEquals(new long[] { 80000000000000000L, 40000000000000000L, 20000000000000000L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case135() {
        long A = 1242543221516688L;
        long B = 337457997509021202L;
        assertArrayEquals(new long[] { 89657454476667872L, 44828727238333936L, 22414363619166967L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case136() {
        long A = 1L;
        long B = 10000000000000129L;
        assertArrayEquals(new long[] { 2666666666666701L, 1333333333333350L, 666666666666675L }, fizzbuzzturbo.counts(A, B));
    }

    @Test
    public void case137() {
        long A = 2119855817433555L;
        long B = 2119855817434086L;
        assertArrayEquals(new long[] { 142L, 71L, 36L }, fizzbuzzturbo.counts(A, B));
    }

}
