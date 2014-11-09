package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class MiniatureDachshundTest {
    MiniatureDachshund miniaturedachshund = new MiniatureDachshund();

    @Test
    public void case1() {
        int[] mikan = { 100, 100, 100, 100, 100 };
        int weight = 4750;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case2() {
        int[] mikan = { 100, 100, 100, 100, 50 };
        int weight = 4750;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case3() {
        int[] mikan = { 120, 90, 130, 100, 110, 80 };
        int weight = 3000;
        assertEquals(6, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case4() {
        int[] mikan = { 50 };
        int weight = 5000;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case5() {
        int[] mikan = { 200, 50, 200, 50, 200, 50, 200, 50 };
        int weight = 4800;
        assertEquals(4, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case6() {
        int[] mikan = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        int weight = 3000;
        assertEquals(40, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case7() {
        int[] mikan = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        int weight = 3001;
        assertEquals(39, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case8() {
        int[] mikan = { 50 };
        int weight = 4950;
        assertEquals(1, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case9() {
        int[] mikan = { 50 };
        int weight = 4951;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case10() {
        int[] mikan = { 51 };
        int weight = 4950;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case11() {
        int[] mikan = { 175, 102, 194 };
        int weight = 5000;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case12() {
        int[] mikan = { 137, 124, 154, 85, 60, 63, 189, 184, 161, 86, 200, 143, 54, 159, 104, 122, 52 };
        int weight = 4948;
        assertEquals(1, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case13() {
        int[] mikan = { 173, 133, 96, 55, 131, 158, 122, 156, 128, 182, 163, 120, 114, 137, 119, 81, 86, 192, 78, 137, 77, 163, 172, 156, 109, 142, 146, 148, 87, 77, 95, 191, 153, 119, 107, 185, 178, 110, 121, 86 };
        int weight = 4792;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case14() {
        int[] mikan = { 196, 83, 109, 100, 131, 79, 148, 129, 165, 134, 190, 164, 193, 156, 54, 200 };
        int weight = 4685;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case15() {
        int[] mikan = { 63, 93, 141, 53, 131, 60, 193, 140, 191 };
        int weight = 4731;
        assertEquals(4, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case16() {
        int[] mikan = { 106, 183, 56, 159, 103, 188, 168, 160, 142, 181, 97, 119, 66, 79, 119, 133, 69, 141, 140, 116, 94, 59, 66, 55, 149, 191, 139, 156, 169, 52, 129, 127, 80, 116, 76, 107, 195, 110, 117, 156, 64, 85, 113, 182, 147, 167, 145 };
        int weight = 4714;
        assertEquals(5, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case17() {
        int[] mikan = { 133, 176, 72, 192, 96, 129, 196, 107, 60, 68, 125, 136, 88, 155, 113, 71, 136, 166, 119, 186, 193, 108, 189, 186, 98, 55, 140, 178, 199, 68, 148, 195, 167, 75, 154, 105, 131, 82, 77, 194, 195, 173, 85, 153, 184, 90, 170, 146 };
        int weight = 4606;
        assertEquals(6, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case18() {
        int[] mikan = { 75, 91, 191, 100, 192, 127, 198, 151, 96 };
        int weight = 4169;
        assertEquals(7, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case19() {
        int[] mikan = { 76, 85, 181, 151, 193, 145, 69, 127, 89, 179, 150, 75, 99, 133, 69, 131, 109, 193, 157, 57, 84, 196, 96, 87, 186, 64, 200, 103 };
        int weight = 4421;
        assertEquals(8, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case20() {
        int[] mikan = { 157, 124, 147, 51, 57, 63, 190, 59, 116, 60, 51, 148, 105, 106, 188, 118, 125, 158, 95 };
        int weight = 4238;
        assertEquals(9, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case21() {
        int[] mikan = { 183, 144, 50, 107, 72, 192, 144, 142, 174, 118, 54, 83, 77, 115, 131, 120, 147 };
        int weight = 3932;
        assertEquals(10, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case22() {
        int[] mikan = { 131, 106, 85, 114, 190, 163, 158, 106, 132, 96, 74, 62, 134, 90, 100, 178, 173, 119, 139, 69, 74, 62, 56, 63, 77, 90, 143, 131, 153, 144, 64, 53, 115, 200, 123, 144 };
        int weight = 4261;
        assertEquals(11, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case23() {
        int[] mikan = { 125, 116, 104, 144, 113, 109, 144, 52, 56, 99, 74, 100, 52, 111 };
        int weight = 3889;
        assertEquals(12, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case24() {
        int[] mikan = { 161, 61, 141, 59, 171, 122, 115, 81, 115, 125, 81, 62, 70, 61, 145, 185, 148, 53, 168, 88, 117, 143, 72, 51, 89, 121, 106, 100, 184, 130 };
        int weight = 3967;
        assertEquals(13, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case25() {
        int[] mikan = { 74, 96, 134, 141, 178, 131, 149, 69, 64, 65, 118, 63, 75, 53, 88, 142, 72, 188, 60, 125, 69 };
        int weight = 3909;
        assertEquals(14, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case26() {
        int[] mikan = { 60, 130, 68, 128, 92, 68, 156, 92, 65, 108, 115, 114, 77, 153, 182, 85, 126, 55, 175, 102, 68, 159, 52, 104, 98, 111, 64, 147, 153, 163, 84, 187, 151, 187, 71, 54, 127, 103 };
        int weight = 3848;
        assertEquals(15, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case27() {
        int[] mikan = { 53, 168, 66, 132, 146, 93, 157, 180, 180, 107, 100, 78, 152, 163, 148, 71, 106, 142, 110, 186, 59, 81, 92, 109, 188, 94, 57, 61, 81, 55, 111, 52, 78, 197, 147, 136, 168, 119, 64, 168, 62 };
        int weight = 3804;
        assertEquals(16, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case28() {
        int[] mikan = { 164, 97, 67, 181, 109, 103, 113, 135, 107, 50, 126, 180, 101, 53, 69, 100, 52, 100, 68, 98, 188, 149, 88, 155, 193, 147, 89, 93, 161, 163, 90, 59, 54, 63, 162, 187, 110, 115, 163, 63, 94, 109 };
        int weight = 3654;
        assertEquals(17, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case29() {
        int[] mikan = { 68, 52, 70, 100, 60, 102, 68, 83, 61, 52, 73, 62, 86, 98, 95, 99, 81, 53 };
        int weight = 3637;
        assertEquals(18, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case30() {
        int[] mikan = { 105, 105, 65, 69, 94, 149, 70, 184, 137, 72, 68, 81, 98, 67, 86, 84, 63, 71, 99, 93, 61, 58, 52, 68, 93, 87 };
        int weight = 3501;
        assertEquals(19, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case31() {
        int[] mikan = { 63, 65, 72, 80, 92, 60, 93, 83, 90, 70, 93, 70, 97, 52, 76, 58, 69, 64, 83, 53 };
        int weight = 3517;
        assertEquals(20, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case32() {
        int[] mikan = { 143, 95, 60, 78, 131, 82, 137, 173, 110, 79, 153, 122, 189, 51, 80, 187, 194, 147, 112, 78, 183, 69, 53, 81, 200, 86, 125, 79, 85, 92, 141, 92, 63, 83, 161, 91, 68, 57, 187, 71, 77, 121, 153, 69, 81 };
        int weight = 3380;
        assertEquals(21, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case33() {
        int[] mikan = { 68, 139, 86, 134, 86, 66, 182, 74, 115, 70, 50, 62, 50, 73, 68, 72, 55, 80, 168, 85, 64, 123, 119, 73, 67, 65, 82, 77, 186, 112, 63, 60, 58, 112 };
        int weight = 3518;
        assertEquals(22, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case34() {
        int[] mikan = { 56, 161, 136, 78, 75, 57, 159, 53, 81, 167, 196, 61, 69, 151, 63, 78, 153, 159, 160, 82, 85, 120, 75, 78, 123, 182, 73, 69, 51, 78, 85, 56, 64, 140, 67, 61, 53, 76, 66, 51, 175, 131, 76, 65, 185, 95 };
        int weight = 3507;
        assertEquals(23, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case35() {
        int[] mikan = { 141, 60, 189, 162, 70, 58, 79, 120, 55, 72, 82, 94, 123, 82, 113, 69, 50, 60, 55, 60, 162, 67, 64, 59, 79, 70, 195, 51, 115, 191, 59, 57, 72, 98, 83, 65, 62, 54, 66, 153 };
        int weight = 3487;
        assertEquals(24, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case36() {
        int[] mikan = { 76, 120, 198, 76, 51, 129, 65, 131, 79, 162, 60, 63, 70, 97, 142, 193, 70, 72, 163, 61, 105, 54, 58, 51, 188, 60, 66, 80, 56, 153, 108, 88, 51, 124, 72, 117, 50, 55, 77, 77, 66, 64, 65, 125, 78, 51 };
        int weight = 3364;
        assertEquals(25, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case37() {
        int[] mikan = { 54, 72, 54, 56, 76, 71, 51, 105, 148, 79, 55, 103, 53, 75, 56, 70, 188, 67, 101, 192, 69, 186, 158, 70, 155, 81, 54, 71, 61, 73, 136, 54, 155, 55, 55, 55, 65, 129, 68, 75, 73, 53, 50, 69 };
        int weight = 3419;
        assertEquals(26, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case38() {
        int[] mikan = { 60, 106, 61, 87, 68, 69, 68, 65, 52, 186, 68, 55, 139, 174, 52, 67, 112, 71, 63, 64, 52, 147, 199, 119, 119, 61, 59, 60, 82, 135, 116, 68, 154, 160, 55, 145, 74, 60, 51, 79, 88, 60, 72, 63, 57 };
        int weight = 3325;
        assertEquals(27, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case39() {
        int[] mikan = { 68, 58, 60, 60, 64, 59, 59, 61, 67, 64, 61, 55, 64, 57, 68, 53, 62, 66, 71, 65, 65, 57, 54, 53, 71, 60, 68, 58 };
        int weight = 3272;
        assertEquals(28, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case40() {
        int[] mikan = { 51, 58, 63, 55, 140, 52, 55, 83, 61, 68, 64, 65, 67, 199, 58, 57, 58, 55, 180, 56, 54, 153, 59, 63, 59, 62, 53, 68, 54, 56, 52, 62, 63, 59, 184, 58, 58, 166 };
        int weight = 3246;
        assertEquals(29, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case41() {
        int[] mikan = { 51, 57, 89, 160, 62, 59, 58, 50, 56, 199, 62, 62, 51, 65, 60, 55, 191, 61, 80, 56, 50, 113, 180, 51, 169, 121, 135, 84, 66, 84, 65, 56, 51, 58, 175, 51, 63, 176, 51, 63, 63, 57, 189, 50, 57, 66, 192 };
        int weight = 3283;
        assertEquals(30, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case42() {
        int[] mikan = { 66, 179, 60, 55, 62, 50, 64, 55, 60, 50, 58, 56, 59, 51, 183, 51, 55, 173, 56, 54, 62, 200, 50, 70, 59, 82, 62, 60, 52, 63, 54, 59, 58, 59, 51, 55, 51, 194, 64, 50 };
        int weight = 3196;
        assertEquals(31, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case43() {
        int[] mikan = { 69, 55, 61, 52, 55, 168, 55, 56, 200, 71, 110, 55, 52, 102, 50, 61, 58, 198, 50, 59, 135, 199, 53, 102, 53, 93, 51, 116, 51, 50, 54, 60, 57, 62, 50, 56, 63, 78, 50, 126, 54, 56, 51, 50, 58, 59, 58, 55, 53, 54 };
        int weight = 3270;
        assertEquals(32, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case44() {
        int[] mikan = { 53, 57, 56, 52, 52, 53, 55, 50, 68, 51, 189, 175, 143, 53, 130, 59, 57, 175, 51, 50, 56, 54, 123, 59, 52, 60, 103, 52, 53, 56, 58, 55, 54, 53, 59, 56, 56, 50, 56, 58, 51 };
        int weight = 3136;
        assertEquals(33, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case45() {
        int[] mikan = { 55, 57, 55, 51, 57, 55, 58, 51, 55, 58, 57, 51, 52, 53, 200, 50, 58, 57, 55, 51, 52, 54, 51, 51, 58, 53, 54, 52, 53, 52, 54, 58, 58, 50, 56 };
        int weight = 3158;
        assertEquals(34, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case46() {
        int[] mikan = { 56, 102, 53, 51, 56, 57, 56, 54, 52, 53, 53, 53, 53, 57, 199, 54, 121, 52, 128, 50, 51, 92, 51, 51, 50, 113, 50, 50, 55, 57, 53, 57, 52, 55, 55, 55, 136, 50, 56, 50, 50, 50 };
        int weight = 3051;
        assertEquals(35, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case47() {
        int[] mikan = { 54, 185, 50, 55, 199, 55, 55, 51, 53, 66, 53, 53, 53, 53, 51, 54, 51, 50, 54, 52, 51, 51, 55, 52, 52, 129, 54, 50, 55, 50, 55, 109, 79, 50, 51, 54, 133, 55, 53, 173, 52, 52, 85, 51, 99, 111, 126, 128, 53 };
        int weight = 3107;
        assertEquals(36, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case48() {
        int[] mikan = { 50, 51, 53, 52, 54, 104, 51, 51, 51, 53, 51, 54, 173, 50, 50, 51, 51, 52, 52, 53, 98, 53, 50, 52, 51, 54, 50, 52, 53, 53, 53, 53, 51, 54, 54, 50, 52, 50, 93, 54, 77, 54 };
        int weight = 3001;
        assertEquals(37, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case49() {
        int[] mikan = { 50, 169, 51, 50, 51, 50, 51, 52, 103, 89, 50, 51, 52, 51, 51, 51, 116, 52, 50, 51, 50, 51, 147, 52, 52, 50, 191, 52, 52, 50, 52, 50, 51, 109, 163, 51, 50, 51, 50, 52, 51, 74, 52, 52, 52, 51, 52, 154 };
        int weight = 3000;
        assertEquals(38, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case50() {
        int[] mikan = { 50, 51, 50, 50, 51, 51, 50, 50, 50, 51, 50, 51, 51, 51, 51, 51, 192, 51, 51, 51, 51, 50, 51, 82, 50, 51, 50, 51, 51, 50, 50, 50, 50, 50, 50, 51, 50, 50, 51, 50, 50 };
        int weight = 3031;
        assertEquals(39, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case51() {
        int[] mikan = { 50, 50, 50, 50, 50, 50, 187, 50, 50, 50, 50, 50, 54, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 155, 50, 161, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        int weight = 3000;
        assertEquals(40, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case52() {
        int[] mikan = { 78, 135, 91, 64, 125, 177, 175, 158, 66, 165, 80, 195, 105, 50, 192, 50, 149, 108, 180, 97, 132, 141, 144, 125, 173, 99, 120, 184, 142, 57, 131, 172, 65, 100, 158, 106, 186, 129, 126, 70 };
        int weight = 4524;
        assertEquals(7, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case53() {
        int[] mikan = { 77, 192, 111, 125, 56, 150, 52, 54, 65, 196, 52, 117, 69, 142, 86, 57, 81, 98, 85, 145, 53, 143, 155, 96, 133, 149, 132, 71, 64, 160, 96, 163, 101, 131, 188, 160, 78 };
        int weight = 4421;
        assertEquals(9, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case54() {
        int[] mikan = { 162, 200, 67, 57, 129 };
        int weight = 3470;
        assertEquals(5, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case55() {
        int[] mikan = { 161, 179, 144, 59, 63, 137, 184, 191, 157, 126, 59, 79, 142, 133, 56, 89, 73, 191, 129, 130, 50, 96, 58, 144, 95, 155, 125, 58, 137, 93, 171, 134, 111, 175 };
        int weight = 3375;
        assertEquals(18, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case56() {
        int[] mikan = { 56, 82, 121, 183, 185, 194, 75, 100, 197, 57, 143, 186, 126 };
        int weight = 3769;
        assertEquals(10, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case57() {
        int[] mikan = { 186, 100, 89, 142, 141, 196, 78, 84, 98, 127, 113, 119, 78, 112, 118, 96, 146, 197, 163, 129, 185, 91, 185, 104, 110, 164, 190, 149, 79, 160, 101, 65, 142, 64, 115, 140 };
        int weight = 4761;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case58() {
        int[] mikan = { 55, 123, 100, 146, 105, 119, 176, 199, 138, 125, 180, 50, 174, 97, 144, 50, 147, 180, 139, 161, 167, 57, 183, 60, 185, 183, 91, 143, 65, 146, 178, 73, 174, 133, 161, 162, 185, 71, 147, 98, 110, 74, 72, 162, 54, 172, 78 };
        int weight = 4176;
        assertEquals(12, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case59() {
        int[] mikan = { 159, 143, 139, 148, 56, 152, 161, 116, 73, 190, 90, 93 };
        int weight = 4234;
        assertEquals(7, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case60() {
        int[] mikan = { 173, 134, 143, 133, 115, 96, 122, 139, 112, 193, 73, 137, 150, 139, 68, 163, 140, 139, 65, 87, 106, 150, 115, 163, 144, 199, 170, 169, 71, 142, 174 };
        int weight = 4814;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case61() {
        int[] mikan = { 59, 141, 65, 143, 188, 166, 90, 167, 176, 178, 95, 159, 176, 65, 131, 71, 120, 63, 96, 59, 181, 80, 80, 118, 191, 93, 64, 183, 181, 103, 178, 108 };
        int weight = 3098;
        assertEquals(20, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case62() {
        int[] mikan = { 197, 72, 82, 62, 154, 179, 166, 198, 140, 117, 80, 142, 57, 156, 76, 92, 160, 51, 88, 83, 135, 144, 186, 64, 200, 82, 178, 182, 124, 54, 129, 192, 155, 191, 189, 158, 181, 130, 196, 98, 87, 163, 171, 64, 185, 174, 103, 119, 149, 125 };
        int weight = 4958;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case63() {
        int[] mikan = { 126, 183, 182, 57, 142, 157, 81, 161, 152, 139, 190, 164, 59, 136, 194, 116, 133, 199, 142, 73, 195, 55, 190, 197, 89, 64, 75, 107, 106, 146, 110, 127, 176, 147, 123, 188, 100, 199, 136, 182, 76, 78, 153, 157, 88, 167, 71, 90, 111, 200 };
        int weight = 3386;
        assertEquals(19, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case64() {
        int[] mikan = { 125, 177, 119, 194, 58, 99, 113, 57, 65, 148, 77, 73, 103, 168, 121, 78, 140, 164, 146, 117, 123, 87, 198, 104, 81, 166, 122, 91, 187, 55, 127, 129, 94, 80, 143, 168, 112, 110, 75, 180, 139, 101, 118, 127, 104, 184, 138, 100, 169, 89 };
        int weight = 3856;
        assertEquals(14, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case65() {
        int[] mikan = { 165, 177, 101, 125, 78, 90, 57, 200, 188, 77, 114, 121, 104, 137, 161, 105, 86, 189, 139, 139, 93, 168, 147, 85, 124, 139, 159, 179, 105, 137, 117, 94, 86, 153, 166, 85, 192, 64, 88, 195, 71, 116, 191, 157, 177, 135, 103, 80, 186, 186 };
        int weight = 4758;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case66() {
        int[] mikan = { 192, 178, 146, 187, 192, 106, 96, 117, 61, 192, 193, 154, 162, 79, 59, 187, 174, 194, 191, 132, 172, 175, 63, 177, 162, 94, 172, 96, 139, 90, 110, 123, 66, 126, 77, 200, 185, 147, 61, 200, 84, 171, 97, 114, 92, 51, 118, 116, 90, 153 };
        int weight = 3920;
        assertEquals(14, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case67() {
        int[] mikan = { 165, 154, 147, 156, 100, 192, 143, 83, 69, 200, 69, 163, 112, 156, 173, 142, 167, 181, 180, 188, 103, 127, 178, 190, 63, 130, 196, 139, 97, 173, 176, 134, 71, 84, 105, 175, 57, 115, 146, 151, 193, 163, 99, 139, 168, 175, 120, 137, 81, 184 };
        int weight = 3967;
        assertEquals(12, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case68() {
        int[] mikan = { 80, 104, 124, 51, 71, 96, 115, 200, 158, 160, 60, 171, 76, 84, 89, 116, 159, 115, 92, 83, 143, 177, 92, 193, 139, 62, 132, 185, 83, 50, 111, 81, 51, 169, 142, 195, 77, 192, 102, 116, 114, 169, 61, 196, 116, 177, 76, 100, 108, 156 };
        int weight = 4473;
        assertEquals(8, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case69() {
        int[] mikan = { 196, 155, 110, 89, 151, 172, 148, 166, 185, 108, 147, 200, 162, 110, 193, 123, 132, 160, 197, 157, 96, 60, 188, 185, 71, 177, 51, 147, 139, 71, 102, 122, 65, 124, 72, 65, 131, 165, 134, 110, 56, 130, 129, 181, 100, 116, 153, 147, 66, 60 };
        int weight = 3585;
        assertEquals(17, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case70() {
        int[] mikan = { 155, 168, 146, 152, 114, 103, 161, 180, 62, 102, 50, 175, 139, 86, 103, 124, 159, 169, 112, 92, 178, 115, 180, 159, 50, 50, 188, 191, 148, 77, 124, 187, 65, 62, 147, 196, 78, 149, 171, 151, 57, 98, 96, 123, 188, 69, 55, 65, 160, 155 };
        int weight = 3989;
        assertEquals(14, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case71() {
        int[] mikan = { 162, 148, 166, 109, 86, 158, 55, 53, 101, 73, 53, 183, 134, 103, 149, 181, 177, 170, 56, 83, 117, 68, 147, 174, 162, 194, 84, 180, 156, 162, 93, 75, 93, 143, 53, 92, 173, 196, 152, 50, 172, 157, 57, 57, 153, 60, 181, 95, 69, 95 };
        int weight = 5000;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case72() {
        int[] mikan = { 103, 82, 104, 168, 66, 78, 101, 172, 90 };
        int weight = 4037;
        assertEquals(8, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case73() {
        int[] mikan = { 194, 53, 133, 60, 71, 73, 157, 154, 138, 110 };
        int weight = 4363;
        assertEquals(6, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case74() {
        int[] mikan = { 157, 111, 96, 102, 77, 142, 169, 63, 106, 180, 171, 149, 181, 150, 125, 195, 125, 141, 156, 94, 114, 156, 151, 178, 76, 115, 117, 87, 145, 130, 129, 175, 184, 82 };
        int weight = 4107;
        assertEquals(9, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case75() {
        int[] mikan = { 195, 80 };
        int weight = 4725;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case76() {
        int[] mikan = { 166 };
        int weight = 4835;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case77() {
        int[] mikan = { 125, 144, 172, 60, 196, 71, 142, 136, 97, 95, 61, 60, 135, 85, 113, 75, 191, 66, 115, 162, 91, 60, 100, 50, 199, 118, 72, 90, 131, 180, 149, 86, 108, 83, 154, 86 };
        int weight = 4951;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case78() {
        int[] mikan = { 126, 142, 141, 138, 165, 133, 186, 119, 173, 144, 132, 60, 198 };
        int weight = 4695;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case79() {
        int[] mikan = { 176, 145, 149, 193, 127, 82, 151, 173, 126, 124, 112, 189, 173, 85, 166, 62, 117, 131, 87, 82, 115, 82, 181 };
        int weight = 4176;
        assertEquals(9, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case80() {
        int[] mikan = { 150, 168, 158, 59, 115, 182, 149, 141, 86, 161, 78, 134, 116, 182, 106, 168, 166, 131, 145, 62, 102, 126, 65, 143, 197, 59, 82, 135, 177, 157, 99, 155, 117, 200, 60, 140, 149, 121, 56, 195, 199, 61, 112, 165, 110, 97 };
        int weight = 4332;
        assertEquals(10, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case81() {
        int[] mikan = { 115, 165, 168, 158, 191, 104, 193, 113, 176, 87, 57, 198, 110, 96, 142, 83, 145, 58, 104, 98, 121, 87, 172, 133, 135, 182, 156, 51, 112, 51, 52, 66, 199, 108, 83, 87, 139, 66, 75, 60, 188, 188, 131 };
        int weight = 4540;
        assertEquals(7, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case82() {
        int[] mikan = { 175, 72, 102, 104, 102, 55, 165, 82, 81, 106, 130, 191, 168, 193, 62, 148, 123, 50, 131, 177, 84, 169, 56, 66, 95, 182, 94, 145, 174, 97, 74, 197, 100, 53, 167, 145, 171, 166, 145, 179, 104, 108, 112, 136, 71, 62, 94, 154, 140, 141 };
        int weight = 3449;
        assertEquals(19, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case83() {
        int[] mikan = { 172, 89, 91, 115, 183, 117, 192, 135, 130, 91, 86, 98, 148, 103, 186, 156, 129, 52, 121, 59, 88, 69, 120, 187, 179, 198, 113, 75, 138, 63, 131, 133, 187, 188, 99, 131, 143, 162, 102, 180, 73, 138, 146, 60, 184, 152, 191, 153, 102, 135 };
        int weight = 3487;
        assertEquals(18, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case84() {
        int[] mikan = { 76, 184, 93, 129, 59, 161, 89, 200, 101, 102, 69, 77, 118, 94, 69, 155, 94, 90, 52, 173, 127, 78, 197, 178, 140, 184, 156, 108, 199, 75, 167, 167, 153, 190, 157, 78, 164, 83, 73, 113, 86, 57, 198, 181, 56, 79, 119, 105, 128, 155 };
        int weight = 3755;
        assertEquals(16, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case85() {
        int[] mikan = { 102, 114, 118, 59, 188, 141, 183, 89, 150, 114, 119, 79, 111, 150, 188, 136, 90, 174, 89, 85, 187, 188, 64, 192, 191, 152, 69, 105, 199, 179, 195, 167, 52, 74, 62, 51, 141, 129, 190, 51, 167, 187, 151, 65, 97, 133, 137, 176, 55, 130 };
        int weight = 3663;
        assertEquals(17, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case86() {
        int[] mikan = { 171, 197, 146, 127, 76, 127, 168, 154, 188, 178, 50, 177, 134, 200, 108, 100, 161, 116, 125, 120, 98, 178, 191, 85, 190, 195, 57, 96, 63, 60, 70, 166, 61, 88, 104, 155, 115, 140, 77, 124, 143, 180, 189, 64, 165, 77, 182, 181, 167, 140 };
        int weight = 4893;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case87() {
        int[] mikan = { 127, 190, 62, 127, 112, 123, 162, 64, 186, 145, 67, 149, 172, 112, 53, 174, 171, 123, 77, 158, 89, 189, 68, 146, 50, 92, 112, 122, 195, 148, 126, 181, 80, 173, 183, 148, 124, 77, 164, 191, 169, 157, 172, 59, 64, 197, 106, 75, 56, 98 };
        int weight = 3968;
        assertEquals(14, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case88() {
        int[] mikan = { 155, 96, 72, 163, 165, 146, 103, 75, 191, 156, 151, 185, 116, 82, 198, 199, 156, 162, 134, 177, 129, 163, 151, 60, 79, 186, 86, 143, 73, 160, 69, 158, 84, 56, 133, 97, 177, 77, 104, 108, 103, 123, 82, 179, 159, 62, 173, 186, 112, 182 };
        int weight = 4884;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case89() {
        int[] mikan = { 90, 57, 147, 181, 56, 89, 63, 143, 57, 132, 130, 71, 99, 57, 195, 137, 157, 139, 118, 162, 136, 95, 91, 96, 183, 63, 192, 109, 148, 90, 135, 159, 74, 149, 166, 177, 126, 105, 57, 158, 69, 176, 118, 140, 171, 153, 142, 86, 69, 188 };
        int weight = 4590;
        assertEquals(7, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case90() {
        int[] mikan = { 92, 72, 186, 125, 65, 168, 145, 118, 146, 125, 50, 115, 53, 101, 75, 60, 69, 139, 125, 143, 100, 156, 67, 177, 84, 185, 134, 64, 81, 53, 81, 185, 59, 178, 155, 197, 104, 194, 193, 124, 101, 123, 125, 124, 194, 126, 142, 181, 192, 129 };
        int weight = 3090;
        assertEquals(22, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case91() {
        int[] mikan = { 97, 81, 78, 54, 63, 133, 73, 157, 77, 147, 149, 92, 188, 68, 148, 101, 175, 101, 63, 81, 196, 106, 73, 147, 62, 193, 163, 189, 127, 136, 154, 174, 57, 171, 58, 141, 173, 93, 71, 157, 70, 111, 71, 86, 181, 71, 129, 56, 169, 72 };
        int weight = 4092;
        assertEquals(13, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case92() {
        int[] mikan = { 54, 50, 52, 55, 54, 50, 55, 54, 50, 55, 51, 51, 51, 50, 54, 52, 53, 52, 52, 53, 51, 53, 53, 55, 53, 50, 51, 50, 54, 54, 54, 52, 53, 54, 52, 54, 54, 50, 55, 52, 55, 54, 54, 50, 51, 55, 51, 54, 50, 55 };
        int weight = 3079;
        assertEquals(37, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case93() {
        int[] mikan = { 51, 54, 52, 55, 54, 51, 55, 54, 55, 50, 51, 55, 53, 51, 55, 51, 51, 50, 55, 55, 52, 54, 55, 53, 53, 50, 53, 53, 51, 50, 50, 52, 53, 53, 53, 53, 51, 55, 51, 52, 54, 51, 52, 52, 51, 55, 53, 53, 51, 50 };
        int weight = 3031;
        assertEquals(38, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case94() {
        int[] mikan = { 51, 50, 51, 53, 54, 50, 54, 51, 54, 54, 54, 55, 50, 55, 53, 52, 53, 50, 50, 51, 53, 51, 51, 55, 55, 52, 54, 55, 54, 53, 53, 54, 51, 53, 53, 52, 51, 54, 52, 51, 51, 50, 54, 51, 54, 52, 50, 51, 50, 52 };
        int weight = 3036;
        assertEquals(38, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case95() {
        int[] mikan = { 53, 51, 53, 53, 55, 53, 53, 53, 50, 55, 50, 52, 51, 52, 50, 50, 51, 55, 54, 51, 55, 51, 55, 50, 55, 51, 54, 50, 54, 53, 50, 50, 50, 50, 51, 53, 53, 53, 50, 54, 51, 51, 55, 52, 54, 50, 55, 54, 51, 50 };
        int weight = 3100;
        assertEquals(37, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case96() {
        int[] mikan = { 54, 52, 55, 53, 51, 53, 54, 51, 50, 51, 52, 55, 50, 50, 55, 53, 54, 51, 55, 52, 51, 55, 50, 52, 51, 52, 54, 51, 53, 53, 50, 51, 55, 51, 53, 55, 51, 51, 54, 54, 55, 51, 53, 51, 52, 54, 55, 55, 52, 52 };
        int weight = 3085;
        assertEquals(36, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case97() {
        int[] mikan = { 54, 51, 50, 54, 50, 55, 50, 55, 51, 50, 50, 53, 53, 52, 51, 50, 54, 53, 52, 50, 51, 51, 53, 55, 53, 55, 51, 52, 51, 52, 53, 53, 53, 53, 52, 53, 55, 51, 55, 51, 53, 53, 51, 50, 54, 51, 50, 52, 55, 55 };
        int weight = 3042;
        assertEquals(37, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case98() {
        int[] mikan = { 52, 51, 51, 50, 55, 54, 51, 51, 52, 54, 54, 54, 50, 52, 53, 54, 55, 53, 51, 53, 53, 52, 55, 55, 55, 51, 51, 51, 50, 50, 51, 51, 54, 55, 51, 53, 51, 51, 52, 51, 54, 54, 52, 52, 52, 52, 50, 52, 50, 53 };
        int weight = 3041;
        assertEquals(37, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case99() {
        int[] mikan = { 55, 51, 55, 50, 54, 50, 54, 50, 51, 55, 54, 55, 55, 51, 54, 51, 52, 53, 54, 51, 51, 52, 50, 55, 52, 53, 50, 53, 51, 54, 50, 50, 53, 55, 53, 53, 50, 54, 53, 50, 52, 55, 53, 51, 54, 52, 51, 55, 53, 55 };
        int weight = 3085;
        assertEquals(36, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case100() {
        int[] mikan = { 52, 55, 50, 55, 52, 55, 52, 52, 55, 51, 51, 51, 52, 50, 52, 51, 53, 54, 52, 54, 54, 55, 54, 55, 55, 52, 51, 54, 53, 53, 51, 50, 51, 53, 50, 51, 55, 55, 52, 51, 54, 54, 52, 54, 52, 55, 55, 54, 55, 52 };
        int weight = 3074;
        assertEquals(36, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case101() {
        int[] mikan = { 52, 50, 55, 53, 50, 53, 54, 55, 55, 50, 50, 53, 51, 55, 50, 54, 53, 55, 51, 52, 53, 52, 53, 51, 55, 53, 50, 51, 52, 53, 55, 52, 50, 54, 52, 51, 55, 53, 50, 55, 54, 55, 55, 55, 55, 51, 53, 51, 55, 55 };
        int weight = 3020;
        assertEquals(38, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case102() {
        int[] mikan = { 100, 100, 100, 100, 100 };
        int weight = 4750;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case103() {
        int[] mikan = { 100, 50, 50 };
        int weight = 4900;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case104() {
        int[] mikan = { 50 };
        int weight = 5000;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case105() {
        int[] mikan = { 100, 50, 50 };
        int weight = 4899;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case106() {
        int[] mikan = { 200, 50, 200, 50, 200, 50, 200, 50 };
        int weight = 4800;
        assertEquals(4, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case107() {
        int[] mikan = { 51 };
        int weight = 4999;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case108() {
        int[] mikan = { 50, 50 };
        int weight = 4900;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case109() {
        int[] mikan = { 100 };
        int weight = 4900;
        assertEquals(1, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case110() {
        int[] mikan = { 50, 50 };
        int weight = 3000;
        assertEquals(2, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case111() {
        int[] mikan = { 50, 50, 50, 50, 50 };
        int weight = 4750;
        assertEquals(5, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case112() {
        int[] mikan = { 50, 50, 50 };
        int weight = 3000;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case113() {
        int[] mikan = { 150, 150, 150, 150 };
        int weight = 3000;
        assertEquals(4, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case114() {
        int[] mikan = { 200, 200 };
        int weight = 4700;
        assertEquals(1, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case115() {
        int[] mikan = { 51, 52 };
        int weight = 4995;
        assertEquals(0, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case116() {
        int[] mikan = { 100, 100, 100 };
        int weight = 3001;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case117() {
        int[] mikan = { 120, 90, 130, 100, 110, 80 };
        int weight = 3000;
        assertEquals(6, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case118() {
        int[] mikan = { 100, 100, 100 };
        int weight = 4900;
        assertEquals(1, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case119() {
        int[] mikan = { 100, 100, 100, 100, 50 };
        int weight = 4750;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

    @Test
    public void case120() {
        int[] mikan = { 100, 100, 50 };
        int weight = 4750;
        assertEquals(3, miniaturedachshund.maxMikan(mikan, weight));
    }

}
