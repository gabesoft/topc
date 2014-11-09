package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class KingXNewCurrencyTest {
    KingXNewCurrency kingxnewcurrency = new KingXNewCurrency();

    @Test
    public void test1() {
        assertEquals(5, kingxnewcurrency.howMany(5, 8, 5));
    }

    @Test
	public void test2() {
        assertEquals(-1, kingxnewcurrency.howMany(8, 4, 2));
    }

    @Test
	public void test3() {
        assertEquals(1, kingxnewcurrency.howMany(7, 4, 13));
    }

    @Test
	public void test4() {
        assertEquals(2, kingxnewcurrency.howMany(47, 74, 44));
    }

    @Test
	public void test5() {
        assertEquals(65, kingxnewcurrency.howMany(128, 96, 3));
    }
}
