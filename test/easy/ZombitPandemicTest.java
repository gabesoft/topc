package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ZombitPandemicTest {
    @Test
    public void case1() {
        assertEquals("106/27", ZombitPandemic.answer(4));
    }

    @Test
    public void case2() {
        assertEquals("2/1", ZombitPandemic.answer(2));
    }

    @Test
    public void case3() {
        assertEquals("3/1", ZombitPandemic.answer(3));
    }

    @Test
    public void case4() {
        assertEquals("38563/5832", ZombitPandemic.answer(7));
    }

    @Test
    public void case5() {
        assertEquals("17494593/2097152", ZombitPandemic.answer(9));
    }

    @Test
    public void case6() {
        assertEquals("18625944786006435/1389000853194752", ZombitPandemic.answer(15));
    }

    @Test
    public void case7() {
        assertEquals("34718513354331762959383530/1978419655660313589123979", ZombitPandemic.answer(20));
    }

    @Test
    public void case8() {
        assertEquals("155/32", ZombitPandemic.answer(5));
    }

    @Test
    public void case9() {
        assertEquals("17886/3125", ZombitPandemic.answer(6));
    }

    @Test
    public void case10() {
        assertEquals("2760193150860512039773534794580172563788128162694566629462545301385874784598772926370/66009724686219550843768321818371771650147004059278069406814190436565131829325062449",
                     ZombitPandemic.answer(50));
    }
}
