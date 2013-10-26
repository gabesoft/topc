package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MarbleCollectionGameTest {
    MarbleCollectionGame marblecollectiongame = new MarbleCollectionGame();

    @Test 
    public void case0() {
        String [] board = { "264", "3LL" };
        assertEquals(15, marblecollectiongame.collectMarble(board));
    }

    @Test 
    public void case3() {
        String [] board = {
            "1234",
            "U5L6",
            "UL78"
        };

        assertEquals(29, marblecollectiongame.collectMarble(board));
    }

    @Test 
    public void case1() {
        String [] board = {
            "8U4L9",
            "0183U",
            "U8#38",
            "2158#",
            "L65U7"
        };

        assertEquals(44, marblecollectiongame.collectMarble(board));
    }

    @Test 
    public void case2() {
        String [] board = {
            "039LLLU",
            "953348#",
            "0L87#29",
            "718#4#U",
            "594U196" 
        };

        assertEquals(55, marblecollectiongame.collectMarble(board));
    }
}
