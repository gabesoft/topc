package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class BinPackingTest {
    BinPacking binpacking = new BinPacking();

    @Test
    public void case1() {
        int[] item = { 150, 150, 150, 150, 150 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case2() {
        int[] item = { 130, 140, 150, 160 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case3() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case4() {
        int[] item = { 100, 200, 100, 100, 100, 100, 200, 100, 200 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case5() {
        int[] item = { 123, 145, 167, 213, 245, 267, 289, 132, 154, 176, 198 };
        assertEquals(8, binpacking.minBins(item));
    }

    @Test
    public void case6() {
        int[] item = { 208 };
        assertEquals(1, binpacking.minBins(item));
    }

    @Test
    public void case7() {
        int[] item = { 100, 100 };
        assertEquals(1, binpacking.minBins(item));
    }

    @Test
    public void case8() {
        int[] item = { 100, 100, 100 };
        assertEquals(1, binpacking.minBins(item));
    }

    @Test
    public void case9() {
        int[] item = { 100, 100, 100, 280 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case10() {
        int[] item = { 100, 251, 244, 248, 257 };
        assertEquals(5, binpacking.minBins(item));
    }

    @Test
    public void case11() {
        int[] item = { 100, 100, 100, 100, 232, 280 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case12() {
        int[] item = { 100, 100, 100, 100, 100, 210, 219 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case13() {
        int[] item = { 100, 100, 100, 157, 211, 191, 251, 236 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case14() {
        int[] item = { 149, 114, 247, 204, 256, 251, 214, 202, 169 };
        assertEquals(8, binpacking.minBins(item));
    }

    @Test
    public void case15() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 211, 279, 244 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case16() {
        int[] item = { 100, 100, 100, 100, 100, 100, 234, 246, 246, 217, 249 };
        assertEquals(7, binpacking.minBins(item));
    }

    @Test
    public void case17() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 152, 152 };
        assertEquals(5, binpacking.minBins(item));
    }

    @Test
    public void case18() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 235, 249, 252, 248, 238 };
        assertEquals(8, binpacking.minBins(item));
    }

    @Test
    public void case19() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 167, 164, 176 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case20() {
        int[] item = { 100, 100, 184, 196, 181, 175, 176, 193, 180, 180, 175, 187, 183, 181, 192 };
        assertEquals(13, binpacking.minBins(item));
    }

    @Test
    public void case21() {
        int[] item = { 157, 142, 167, 133, 135, 157, 143, 160, 141, 123, 162, 159, 165, 137, 138, 152 };
        assertEquals(8, binpacking.minBins(item));
    }

    @Test
    public void case22() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 256, 268, 283, 291, 253, 253, 267 };
        assertEquals(11, binpacking.minBins(item));
    }

    @Test
    public void case23() {
        int[] item = { 100, 100, 100, 260, 243, 234, 209, 262, 248, 250, 260, 208, 241, 220, 250, 211, 261, 216 };
        assertEquals(16, binpacking.minBins(item));
    }

    @Test
    public void case24() {
        int[] item = { 100, 224, 230, 231, 224, 213, 220, 221, 226, 232, 231, 229, 216, 219, 226, 225, 227, 213, 224 };
        assertEquals(19, binpacking.minBins(item));
    }

    @Test
    public void case25() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 235, 234, 242, 242, 251, 243, 256, 234, 241, 238, 244, 235 };
        assertEquals(15, binpacking.minBins(item));
    }

    @Test
    public void case26() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 252, 236, 280, 266, 217, 228 };
        assertEquals(11, binpacking.minBins(item));
    }

    @Test
    public void case27() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 263, 226, 272, 274, 255, 238, 236, 227, 245 };
        assertEquals(14, binpacking.minBins(item));
    }

    @Test
    public void case28() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 189, 126, 158, 181, 132 };
        assertEquals(9, binpacking.minBins(item));
    }

    @Test
    public void case29() {
        int[] item = { 100, 100, 248, 263, 241, 221, 250, 229, 235, 249, 272, 236, 243, 221, 267, 270, 250, 253, 271, 219, 266, 229, 273, 270 };
        assertEquals(23, binpacking.minBins(item));
    }

    @Test
    public void case30() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 240, 249, 248, 248, 244, 239, 243, 242, 244, 238 };
        assertEquals(15, binpacking.minBins(item));
    }

    @Test
    public void case31() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 188, 243, 224, 186, 211, 248, 170, 230, 188, 216, 220, 223 };
        assertEquals(16, binpacking.minBins(item));
    }

    @Test
    public void case32() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 206, 196, 236, 247, 248, 194, 204, 251, 204, 199, 239, 228, 204, 252, 218, 193, 232 };
        assertEquals(19, binpacking.minBins(item));
    }

    @Test
    public void case33() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 182, 181, 248, 155, 244, 195, 220, 130, 143, 191, 131, 253, 125 };
        assertEquals(15, binpacking.minBins(item));
    }

    @Test
    public void case34() {
        int[] item = { 134, 168, 145, 157, 201, 196, 213, 207, 212, 178, 220, 162, 182, 141, 152, 213, 203, 215, 163, 149, 138, 210, 160, 189, 130, 139, 212, 159, 182 };
        assertEquals(23, binpacking.minBins(item));
    }

    @Test
    public void case35() {
        int[] item = { 100, 100, 100, 100, 100, 151, 254, 135, 195, 186, 126, 163, 207, 182, 117, 218, 168, 232, 191, 119, 130, 226, 206, 214, 175, 112, 189, 210, 198, 196 };
        assertEquals(19, binpacking.minBins(item));
    }

    @Test
    public void case36() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 279, 279, 273, 282, 290, 298, 286, 274, 271, 273 };
        assertEquals(17, binpacking.minBins(item));
    }

    @Test
    public void case37() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 240, 247, 202, 258, 211, 268, 174, 274, 236, 279, 196 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case38() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 152, 165, 167, 165, 161, 151, 158, 155, 163, 157, 158 };
        assertEquals(15, binpacking.minBins(item));
    }

    @Test
    public void case39() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 204, 210, 201, 212, 213, 194, 203, 222, 192, 226, 209 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case40() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 193, 160, 124, 178, 105, 150, 140, 117, 219, 126, 153, 183, 212, 179, 140, 103, 195 };
        assertEquals(16, binpacking.minBins(item));
    }

    @Test
    public void case41() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 225, 226, 221, 227, 232, 218, 211, 223, 216, 225, 211, 228, 237, 207, 231, 220, 207, 231, 218, 222, 214 };
        assertEquals(26, binpacking.minBins(item));
    }

    @Test
    public void case42() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 203, 190, 198, 226, 188, 207, 212, 258, 215, 174, 210, 245, 244, 195, 257, 195, 250, 229 };
        assertEquals(23, binpacking.minBins(item));
    }

    @Test
    public void case43() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(13, binpacking.minBins(item));
    }

    @Test
    public void case44() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 172, 223, 190, 216, 179, 174, 193, 192, 201, 223 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case45() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 177, 177, 202, 141, 239, 132, 136, 121, 143, 136, 272, 125, 219, 159, 250, 188, 217, 138, 157, 176, 243, 221, 150, 201, 255, 122, 133, 148, 236, 272, 147, 208, 209 };
        assertEquals(27, binpacking.minBins(item));
    }

    @Test
    public void case46() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 161, 191, 172, 219, 206, 182 };
        assertEquals(17, binpacking.minBins(item));
    }

    @Test
    public void case47() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 217, 222, 178, 237, 158, 221, 188, 207 };
        assertEquals(19, binpacking.minBins(item));
    }

    @Test
    public void case48() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 289, 286, 288, 286, 286, 287, 286, 289, 288, 289, 287, 289, 286, 287, 288, 287, 289, 289, 286, 286, 287, 287 };
        assertEquals(29, binpacking.minBins(item));
    }

    @Test
    public void case49() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 192, 149, 175, 181, 173 };
        assertEquals(17, binpacking.minBins(item));
    }

    @Test
    public void case50() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 226, 180, 124, 175, 139, 192, 224, 222, 183, 235, 188, 164, 186, 197, 180, 170, 123, 189, 222, 203, 176, 187, 221, 157, 164, 210, 177, 129, 219, 156, 225, 182, 182, 157, 132, 190, 190, 146 };
        assertEquals(33, binpacking.minBins(item));
    }

    @Test
    public void case51() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 126, 128, 185, 145, 132, 137, 183, 173, 139, 133, 157, 125 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case52() {
        int[] item = { 205, 246, 206, 218, 203, 222, 241, 229, 232, 243, 236, 213, 247, 206, 245, 241, 209, 240, 242, 213, 204, 221, 210, 227, 204, 243, 203, 250, 237, 248, 232, 217, 205, 218, 218, 220, 226, 249, 241, 222, 245, 206, 221, 241, 212, 233, 226 };
        assertEquals(47, binpacking.minBins(item));
    }

    @Test
    public void case53() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 222, 237, 233, 227, 221, 229, 215, 215, 216, 235, 221, 237, 223, 227, 217, 222, 230, 226 };
        assertEquals(28, binpacking.minBins(item));
    }

    @Test
    public void case54() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 212, 181, 204, 193, 204, 182, 218, 182, 211, 220, 222, 210, 195, 208, 179, 215, 176, 192, 212, 220, 201, 203, 187, 191, 220, 206, 178, 187, 182, 201, 222, 198, 188, 210, 204, 187, 209 };
        assertEquals(37, binpacking.minBins(item));
    }

    @Test
    public void case55() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 259, 231, 296, 259, 244, 233, 262, 207, 232, 208, 265, 210, 292, 289, 283, 220 };
        assertEquals(28, binpacking.minBins(item));
    }

    @Test
    public void case56() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 212, 152, 194, 167, 152, 218, 158, 230, 240, 181, 218, 249, 211, 134, 251, 183, 137, 218 };
        assertEquals(25, binpacking.minBins(item));
    }

    @Test
    public void case57() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 209, 151, 230, 219, 187, 176, 211, 148, 190, 186, 217, 208 };
        assertEquals(23, binpacking.minBins(item));
    }

    @Test
    public void case58() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 159, 157, 147, 160, 141, 150, 153, 155, 159, 156, 140, 154, 146 };
        assertEquals(20, binpacking.minBins(item));
    }

    @Test
    public void case59() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 143, 128, 130, 116, 119, 132, 141, 138, 148, 144, 122, 124, 129, 116, 137, 118, 107, 131, 131, 107, 116, 133, 151, 140, 123, 146, 107, 119, 111, 136, 114, 119, 131, 140, 137, 125, 137, 120, 117, 139, 138, 118 };
        assertEquals(24, binpacking.minBins(item));
    }

    @Test
    public void case60() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 171, 283, 226, 247, 273, 149, 203, 155, 228, 216, 154, 254, 279, 290, 222, 155, 188, 216, 128, 290, 293, 198, 197, 129, 128, 220 };
        assertEquals(30, binpacking.minBins(item));
    }

    @Test
    public void case61() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 228, 231, 237, 233, 234, 231, 239, 238, 237, 235, 224, 214, 244, 214, 215, 230, 235, 239, 218, 216, 235, 245, 233, 238, 232, 243, 242, 228 };
        assertEquals(36, binpacking.minBins(item));
    }

    @Test
    public void case62() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 186, 235, 186 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case63() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 247, 239, 253, 243, 232, 244, 245, 216, 238, 219, 208, 256, 214, 222, 249, 245, 252, 243, 244, 210, 220, 220, 260, 269, 247, 213, 205, 213, 256, 236, 228, 229, 263, 239, 267, 248, 220, 256, 217, 265, 269, 250 };
        assertEquals(45, binpacking.minBins(item));
    }

    @Test
    public void case64() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 233, 286, 255, 255, 294, 280, 246, 239, 214, 274, 233, 272, 267, 265, 227, 266, 232, 257, 222, 288, 274, 235, 231, 228, 224, 228, 227, 265, 230, 285, 232, 223, 232, 229, 272, 218, 273, 252, 256, 240, 224, 262, 228 };
        assertEquals(46, binpacking.minBins(item));
    }

    @Test
    public void case65() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 203, 203, 203, 200, 203, 200, 200, 201, 201 };
        assertEquals(22, binpacking.minBins(item));
    }

    @Test
    public void case66() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 120, 122, 119, 121, 119, 119, 119, 121, 119, 121, 120, 121, 121, 121, 120, 120, 121, 119, 119, 121, 122, 121, 120, 120, 122, 122, 122, 120, 122, 120, 121, 120, 120, 119, 120, 120, 121, 120, 121, 121 };
        assertEquals(24, binpacking.minBins(item));
    }

    @Test
    public void case67() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 242, 134, 191, 137, 204, 206, 210, 190, 166, 165, 107, 123, 190, 220, 241, 245, 206, 229, 147, 144, 172, 214, 117, 105, 120, 125, 121, 119, 229, 140, 165, 246, 104, 181, 236, 171 };
        assertEquals(30, binpacking.minBins(item));
    }

    @Test
    public void case68() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 241, 237, 246, 242, 248, 234, 243, 250, 250, 238, 247, 249, 252, 234, 243, 229, 239, 251, 230, 245, 243, 249, 240, 240, 233, 239, 244, 252, 249, 233, 239, 247 };
        assertEquals(38, binpacking.minBins(item));
    }

    @Test
    public void case69() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 215, 228 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case70() {
        int[] item = { 100, 100, 100, 100, 100, 123, 128, 124, 125, 127, 124, 121, 124, 122, 129, 124, 121, 127, 121, 124, 123, 126, 122, 122, 125, 126, 128, 129, 129, 128, 129, 124, 124, 125, 123, 121, 123, 127, 128, 125, 124, 124, 124, 123, 128, 125, 121, 121, 128, 127 };
        assertEquals(25, binpacking.minBins(item));
    }

    @Test
    public void case71() {
        int[] item = { 100, 100, 244, 253, 249, 256, 260, 251, 252, 244, 260, 251, 246, 252, 245, 256, 247, 252, 245, 252, 259, 245, 245, 259, 260, 247, 251, 252, 248, 249, 256, 247, 248, 260, 245, 252, 250, 259, 245, 249, 253, 246, 251, 256, 247, 250, 257, 257, 248, 248 };
        assertEquals(49, binpacking.minBins(item));
    }

    @Test
    public void case72() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 156, 142, 129, 140, 131, 140, 125, 132, 116, 124, 131, 154, 148, 154, 130, 156, 129, 148, 124, 144, 150, 120, 124, 117, 145, 140, 131, 132, 139, 146, 131, 127, 116, 148, 154, 149, 139, 149, 138 };
        assertEquals(24, binpacking.minBins(item));
    }

    @Test
    public void case73() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 128, 123, 128, 138, 152, 136, 143, 124, 124, 126, 154, 136, 148, 126, 153, 152, 137, 156 };
        assertEquals(20, binpacking.minBins(item));
    }

    @Test
    public void case74() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 256, 262, 260, 242, 261, 263, 253, 265, 257, 255, 247, 253, 262, 242, 251, 263, 251, 255, 246, 260, 246, 242 };
        assertEquals(32, binpacking.minBins(item));
    }

    @Test
    public void case75() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 111, 116, 117, 126, 116, 107, 120, 118, 110, 128, 116, 106, 106, 103, 105, 116, 107, 115, 107, 119, 103, 126, 129, 120, 126, 129, 127, 115, 124, 106, 104, 112, 112, 105, 121, 120, 105, 119, 110, 119, 124, 116 };
        assertEquals(24, binpacking.minBins(item));
    }

    @Test
    public void case76() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(17, binpacking.minBins(item));
    }

    @Test
    public void case77() {
        int[] item = { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
        assertEquals(50, binpacking.minBins(item));
    }

    @Test
    public void case78() {
        int[] item = { 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150 };
        assertEquals(25, binpacking.minBins(item));
    }

    @Test
    public void case79() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 106, 103, 159, 143, 130, 183, 137, 140, 155, 163, 188, 103, 129, 105, 171, 119, 126, 151, 121, 106, 122, 105, 172, 117, 175 };
        assertEquals(21, binpacking.minBins(item));
    }

    @Test
    public void case80() {
        int[] item = { 251, 220, 179, 260, 160, 174, 157, 102, 175, 262, 123, 161, 220, 100, 148, 175, 196, 100, 174, 109, 260, 234, 141, 121, 186, 176, 198, 142, 238, 139, 242, 200, 198, 165, 175, 227, 123, 199, 100, 237, 101, 100, 110, 134, 175, 134, 207, 186, 157, 146 };
        assertEquals(33, binpacking.minBins(item));
    }

    @Test
    public void case81() {
        int[] item = { 100, 199, 100, 199, 100, 199 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case82() {
        int[] item = { 155, 155, 155 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case83() {
        int[] item = { 100, 100 };
        assertEquals(1, binpacking.minBins(item));
    }

    @Test
    public void case84() {
        int[] item = { 199, 199 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case85() {
        int[] item = { 100, 100, 100, 151, 151, 151 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case86() {
        int[] item = { 200, 200, 200, 200, 200, 200, 200, 200, 200, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 140, 140, 140, 140, 140, 140, 140, 160, 160, 160, 160, 160, 160, 160, 160, 160 };
        assertEquals(25, binpacking.minBins(item));
    }

    @Test
    public void case87() {
        int[] item = { 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200 };
        assertEquals(50, binpacking.minBins(item));
    }

    @Test
    public void case88() {
        int[] item = { 100, 197, 100, 100, 100, 100, 198, 100, 199 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case89() {
        int[] item = { 100, 100, 100, 100, 100, 199, 199, 199, 199, 199 };
        assertEquals(5, binpacking.minBins(item));
    }

    @Test
    public void case90() {
        int[] item = { 100, 100, 100, 120, 120, 180, 180 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case91() {
        int[] item = { 100, 100, 100, 101, 101 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case92() {
        int[] item = { 100, 100, 100, 150, 150 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case93() {
        int[] item = { 160, 160, 140, 140, 100, 100, 100 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case94() {
        int[] item = { 199, 100, 199, 100, 199, 100 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case95() {
        int[] item = { 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201, 201 };
        assertEquals(50, binpacking.minBins(item));
    }

    @Test
    public void case96() {
        int[] item = { 180, 180, 180, 180, 180, 180 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case97() {
        int[] item = { 100, 100, 100, 200, 200, 200 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case98() {
        int[] item = { 180, 180, 180 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case99() {
        int[] item = { 100, 100, 100, 100, 100, 100, 150, 150 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case100() {
        int[] item = { 180, 110, 120, 190, 100, 100, 100 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case101() {
        int[] item = { 151, 151, 151, 151, 151, 151 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case102() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 124, 150, 164, 161, 208, 288, 252, 297, 145, 298, 155, 104, 258, 265, 206, 219, 160, 116, 232, 262, 290, 278, 242, 171, 250 };
        assertEquals(29, binpacking.minBins(item));
    }

    @Test
    public void case103() {
        int[] item = { 100, 100, 100, 100, 100, 150, 150 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case104() {
        int[] item = { 237, 100, 100, 228, 268, 257, 202, 100, 218, 211, 100, 100, 129, 279, 100, 100, 100, 100, 100, 275, 100, 240, 225, 100, 145, 147, 239, 100, 100, 232, 100, 100, 202, 100, 282, 284, 268, 197, 100, 217, 172, 181, 206, 256, 100 };
        assertEquals(30, binpacking.minBins(item));
    }

    @Test
    public void case105() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 199, 199, 199, 199, 199 };
        assertEquals(8, binpacking.minBins(item));
    }

    @Test
    public void case106() {
        int[] item = { 199, 199, 199, 199 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case107() {
        int[] item = { 150, 150, 100, 100, 100 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case108() {
        int[] item = { 100, 100, 100, 101, 199 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case109() {
        int[] item = { 100 };
        assertEquals(1, binpacking.minBins(item));
    }

    @Test
    public void case110() {
        int[] item = { 100, 100, 100, 140, 160 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case111() {
        int[] item = { 149, 149, 149, 149, 149, 160, 160, 160, 160, 160, 160 };
        assertEquals(9, binpacking.minBins(item));
    }

    @Test
    public void case112() {
        int[] item = { 160, 160 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case113() {
        int[] item = { 100, 100, 100, 100, 100, 100, 199, 199, 199 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case114() {
        int[] item = { 100, 100, 100, 140, 140, 160, 160 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case115() {
        int[] item = { 100, 200, 200, 200, 200, 200, 200 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case116() {
        int[] item = { 220, 260, 260, 280, 140, 220 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case117() {
        int[] item = { 100, 100, 100, 100, 100, 100, 101, 101, 101, 101, 101, 101 };
        assertEquals(5, binpacking.minBins(item));
    }

    @Test
    public void case118() {
        int[] item = { 100, 100, 100, 199, 199, 199, 101, 101, 101, 299 };
        assertEquals(5, binpacking.minBins(item));
    }

    @Test
    public void case119() {
        int[] item = { 100, 102, 102, 102, 198, 198, 198, 199, 200 };
        assertEquals(5, binpacking.minBins(item));
    }

    @Test
    public void case120() {
        int[] item = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 150, 150, 150, 150, 150, 150, 150, 150, 150 };
        assertEquals(18, binpacking.minBins(item));
    }

    @Test
    public void case121() {
        int[] item = { 101, 102, 199 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case122() {
        int[] item = { 100, 200, 100, 100, 100, 100, 200, 100, 200 };
        assertEquals(4, binpacking.minBins(item));
    }

    @Test
    public void case123() {
        int[] item = { 120, 110, 100, 100, 100 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case124() {
        int[] item = { 150 };
        assertEquals(1, binpacking.minBins(item));
    }

    @Test
    public void case125() {
        int[] item = { 300, 213, 234, 100, 101, 102, 103, 155, 150, 145, 160, 199, 201, 200, 101, 175, 112, 158, 117, 121, 100, 100, 200, 300, 300, 300, 300, 300, 213, 234, 231, 100, 101, 102, 103, 155, 150, 145, 160, 199, 299, 201, 200, 101, 175, 152, 112, 158, 117, 121 };
        assertEquals(32, binpacking.minBins(item));
    }

    @Test
    public void case126() {
        int[] item = { 180, 120, 100, 100, 100 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case127() {
        int[] item = { 100, 100, 100, 201, 202, 100, 101, 102, 198, 199, 200 };
        assertEquals(6, binpacking.minBins(item));
    }

    @Test
    public void case128() {
        int[] item = { 100, 100, 100, 189, 199, 199 };
        assertEquals(3, binpacking.minBins(item));
    }

    @Test
    public void case129() {
        int[] item = { 199, 105 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case130() {
        int[] item = { 100, 100, 100, 101, 190 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case131() {
        int[] item = { 100, 100, 100, 120, 120 };
        assertEquals(2, binpacking.minBins(item));
    }

    @Test
    public void case132() {
        int[] item = { 100, 100, 100, 199 };
        assertEquals(2, binpacking.minBins(item));
    }

}
