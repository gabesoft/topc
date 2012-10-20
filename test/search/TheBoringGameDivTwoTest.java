package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheBoringGameDivTwoTest {
    TheBoringGameDivTwo theboringgamedivtwo = new TheBoringGameDivTwo();

    @Test 
    public void case1() {
        int ans[] = { 2, 3 };
        assertArrayEquals(ans, theboringgamedivtwo.find(1, 1, 1, 1, 2, 2));
    }

    @Test 
    public void case2() {
        int ans[] = { 8, 9 };
        assertArrayEquals(ans, theboringgamedivtwo.find(1, 5, -1, 4, 3, 6));
    }
}
