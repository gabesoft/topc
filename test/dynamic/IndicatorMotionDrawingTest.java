package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class IndicatorMotionDrawingTest {
    IndicatorMotionDrawing indicatormotiondrawing = new IndicatorMotionDrawing();

    @Test 
    public void case1() {
        String[] desiredState = { "///", "///", "---"};
        char startState = '-';
        assertEquals(10, indicatormotiondrawing.getMinSteps(desiredState, startState));
    }

    @Test 
    public void case2() {
        String[] desiredState = {" ||", "|||", "|||"};
        char startState = '|';
        assertEquals(-1, indicatormotiondrawing.getMinSteps(desiredState, startState));
    }

    @Test 
    public void case3() {
        String[] desiredState = {"/- ", "/  ", "/--"};
        char startState = '/';
        assertEquals(9, indicatormotiondrawing.getMinSteps(desiredState, startState));
    }

    @Test 
    public void case4() {
        String[] desiredState = {"/-|/", "/ |/", "-/\\/"};
        char startState = '\\';
        assertEquals(18, indicatormotiondrawing.getMinSteps(desiredState, startState));
    }
}
