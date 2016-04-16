package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class AdditiveNumberTest {
    AdditiveNumber istr = new AdditiveNumber();

    @Test
    public void case1() {
        assertEquals(true, istr.isAdditiveNumber("112358132134"));
    }

    @Test
    public void case2() {
        assertEquals(false, istr.isAdditiveNumber("112358132132"));
    }

    @Test
    public void case3() {
        assertEquals(true, istr.isAdditiveNumber("199100199"));
    }

    @Test
    public void case4() {
        assertEquals(true, istr.isAdditiveNumber("35725760148522453730597597051568025385"));
    }

    @Test
    public void case5() {
        assertEquals(true, istr.isAdditiveNumber("101"));
    }

    @Test
    public void case6() {
        assertEquals(true, istr.isAdditiveNumber("198019823962"));
    }
}
