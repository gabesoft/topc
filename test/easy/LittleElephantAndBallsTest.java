package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndBallsTest {
    LittleElephantAndBalls littleelephantandballs = new LittleElephantAndBalls();

    @Test
    public void case1() {
        String S = "RGB";
        assertEquals(3, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case2() {
        String S = "RGGRBBB";
        assertEquals(21, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case3() {
        String S = "RRRGBRR";
        assertEquals(16, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case4() {
        String S = "RRRR";
        assertEquals(5, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case5() {
        String S = "GGRRRGR";
        assertEquals(18, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case6() {
        String S = "G";
        assertEquals(0, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case7() {
        String S = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(97, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case8() {
        String S = "RRRRRRRRRRRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGGGGGGGGGG";
        assertEquals(144, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case9() {
        String S = "RRRRRRRRRRRRRRRRGGGGGGGGGGGGGGGGBBBBBBBBBBBBBBBBBB";
        assertEquals(195, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case10() {
        String S = "RRGGBBRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(279, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case11() {
        String S = "RGRBGRBRGGRBRGRGGBRGRB";
        assertEquals(110, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case12() {
        String S = "G";
        assertEquals(0, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case13() {
        String S = "B";
        assertEquals(0, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case14() {
        String S = "RGGGRGGRGRGGRGRGRGBBB";
        assertEquals(76, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case15() {
        String S = "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRG";
        assertEquals(279, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case16() {
        String S = "RGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRGRG";
        assertEquals(190, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case17() {
        String S = "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRBG";
        assertEquals(98, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case18() {
        String S = "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG";
        assertEquals(97, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case19() {
        String S = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(97, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case20() {
        String S = "RRRRRRRRRGRRRRRRGGRGRGGRGBGRRRGRGGRGRBBBRGRGRGGRGR";
        assertEquals(206, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case21() {
        String S = "RRRRRRRRRRRGRRRRRRRRRRRRRRRRRRRRBRRRRRRRRRRRRRRRGB";
        assertEquals(153, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case22() {
        String S = "BBGGBGRRGBBBGRGBGBRRRRBRGGRBBBBRBRRGBGGRBRBRRBRGBG";
        assertEquals(275, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case23() {
        String S = "BBGRRGBRGGGBBRRGGBGGBRBRGBRRRBRBRGRBGBBGRRBGBGBRRB";
        assertEquals(279, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case24() {
        String S = "RBGRRRRBBRBBBGRRBRRRGRBRBBRGBGBGRGGGRBGRGBRRBBGBBR";
        assertEquals(268, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case25() {
        String S = "BGBGRBRBRBGBRBBRGRBBGBBGRRRRRGGRBGRBRBGBBGRGBRRBGG";
        assertEquals(278, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case26() {
        String S = "BBBRBBGBGRBGRBGBRGRRGRGBBRRRRBBBBBGGRRGGBBGBBBRGGR";
        assertEquals(267, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case27() {
        String S = "BRBRRBGBBBGRRRBRBRGBBRGBBBBBRGBRRRRGGGBGGGRRGBBRBB";
        assertEquals(272, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case28() {
        String S = "BRGRBGBGGBGRGRBRGGGGGGRGGBRGBGBGBRRGBGBBBGRGRBBBBR";
        assertEquals(279, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case29() {
        String S = "GGRGGGRBGGRBGBBBRRRBRBBRGRGBBBGBRBBGBGBRRBRBGBBGRB";
        assertEquals(267, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case30() {
        String S = "GBBGBBRBBGBGBRGGGBBRGRRBRBBGBBBGBBRBBGGBGBBBGGBBGR";
        assertEquals(269, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case31() {
        String S = "BGBGBGGBGRGBGRBGGRGRGBGBRBGRRRGGRGRBRGGBGBBGRBB";
        assertEquals(248, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case32() {
        String S = "GGBGGGGBGGRRBRGRBBGBGBBRGGGGBBRR";
        assertEquals(155, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case33() {
        String S = "GBGGBRBBGGBRRRRGRGRGGRGGGRBRRRGRRGRBBGBRRBBRRGBGG";
        assertEquals(265, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case34() {
        String S = "RBBRBGRGGBBBRBBGBRGBRBRGGRRBBBRBGGRGGRGBBBRGRGBR";
        assertEquals(264, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case35() {
        String S = "BRGRGRBBBGRBRBR";
        assertEquals(68, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case36() {
        String S = "GBGBBBGRGBBBBRG";
        assertEquals(58, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case37() {
        String S = "BGRRGGRRRGRBBBB";
        assertEquals(63, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case38() {
        String S = "RGGRGRGRRBRGGBRBGRBRB";
        assertEquals(92, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case39() {
        String S = "BGBBBBBBBBBBBBBBBBBBBBBBBBBBRGBGBGBGBRRGBGBRGBGBRR";
        assertEquals(197, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case40() {
        String S = "GGGBGGGRRRRRRRRRBGGGGGGGGGRRRRRRRRRRBBBBGGGRRBGRGR";
        assertEquals(259, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case41() {
        String S = "GGGGGGGGGGGGGGGGGGGGRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(154, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case42() {
        String S = "RBRBGGGGG";
        assertEquals(33, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case43() {
        String S = "RRRGGGBBB";
        assertEquals(27, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case44() {
        String S = "RGBRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
        assertEquals(142, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case45() {
        String S = "RBBBBRGGGGGRRRGB";
        assertEquals(69, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case46() {
        String S = "BRRBBRGGRGRGGRBRGBRRRRRGBBRGBGRBGGGBBGRRBRBGGRGGBG";
        assertEquals(275, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case47() {
        String S = "RRGRGRRRR";
        assertEquals(25, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case48() {
        String S = "RGRGRG";
        assertEquals(14, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case49() {
        String S = "RRRGGBB";
        assertEquals(17, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case50() {
        String S = "RGRRRGG";
        assertEquals(16, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case51() {
        String S = "RR";
        assertEquals(1, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case52() {
        String S = "RGRGRGRGRGRG";
        assertEquals(38, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case53() {
        String S = "GRGBGB";
        assertEquals(14, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case54() {
        String S = "RGRRGGRRGG";
        assertEquals(29, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case55() {
        String S = "RGBGRGRR";
        assertEquals(25, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case56() {
        String S = "GRRGGRRGRGGBRGBGGGGRBRGGBRBRBRRGGGRBRGRBBGRRRGRRBR";
        assertEquals(263, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case57() {
        String S = "RRRRBBBB";
        assertEquals(18, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case58() {
        String S = "RRBGGBBGBRGGRRGBGRBBBGRGBBGGGBRBRG";
        assertEquals(183, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case59() {
        String S = "RRRGBGRRGBRRGBBRGBGBBGBRBRGBGGRGRGBBGRRGBGBBGBBRGG";
        assertEquals(272, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case60() {
        String S = "BBBBBBBB";
        assertEquals(13, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case61() {
        String S = "BBBBBBBBBBR";
        assertEquals(19, littleelephantandballs.getNumber(S));
    }

    @Test
    public void case62() {
        String S = "RRRRGGGGBBBB";
        assertEquals(39, littleelephantandballs.getNumber(S));
    }

}
