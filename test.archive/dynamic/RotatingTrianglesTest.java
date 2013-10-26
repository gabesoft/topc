package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RotatingTrianglesTest {
    RotatingTriangles rotatingtriangles = new RotatingTriangles();

    @Test 
    public void case1() {
        String [] input = {
            ".../...",
            "..///./",
            ".//#/./"
        };

        assertEquals(46, rotatingtriangles.count(input));
    }
}
