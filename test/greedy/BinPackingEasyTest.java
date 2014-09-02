package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class BinPackingEasyTest {
    BinPackingEasy binpackingeasy = new BinPackingEasy();

    @Test
    public void case1() {
        int[] item = { 150, 150, 150, 150, 150 };
        assertEquals(3, binpackingeasy.minBins(item));
    }

    @Test
    public void case2() {
        int[] item = { 130, 140, 150, 160 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case3() {
        int[] item = { 101, 101, 101, 101, 101, 101, 101, 101, 101 };
        assertEquals(5, binpackingeasy.minBins(item));
    }

    @Test
    public void case4() {
        int[] item = { 101, 200, 101, 101, 101, 101, 200, 101, 200 };
        assertEquals(6, binpackingeasy.minBins(item));
    }

    @Test
    public void case5() {
        int[] item = { 123, 145, 167, 213, 245, 267, 289, 132, 154, 176, 198 };
        assertEquals(8, binpackingeasy.minBins(item));
    }

    @Test
    public void case6() {
        int[] item = { 193, 193, 198, 197, 188, 188, 185, 190, 191, 195, 191, 188, 198, 189, 186, 195, 199, 200, 186, 189, 187, 200, 188, 198, 194, 192, 193, 197, 190, 198, 188 };
        assertEquals(31, binpackingeasy.minBins(item));
    }

    @Test
    public void case7() {
        int[] item = { 263, 229, 244, 249 };
        assertEquals(4, binpackingeasy.minBins(item));
    }

    @Test
    public void case8() {
        int[] item = { 185, 166, 194, 201, 220, 198, 176, 179, 160, 138, 196, 150, 149, 157, 160, 222, 109, 169, 196, 197, 124, 119, 224, 152, 123, 116, 142, 119, 218, 123, 131, 188, 187, 177, 210, 205, 196, 166, 120, 214, 165, 192, 154, 200 };
        assertEquals(32, binpackingeasy.minBins(item));
    }

    @Test
    public void case9() {
        int[] item = { 159, 155, 157, 163, 155, 164, 154, 164, 160, 162, 157, 156, 155, 156, 161, 163, 165 };
        assertEquals(17, binpackingeasy.minBins(item));
    }

    @Test
    public void case10() {
        int[] item = { 226, 225, 253, 240, 231, 253, 243, 231, 222, 229, 254, 228, 246, 262, 242, 226, 251, 260, 242, 242, 231, 261, 252, 248, 245, 228, 261, 242, 241, 226, 264, 258, 263, 230, 257 };
        assertEquals(35, binpackingeasy.minBins(item));
    }

    @Test
    public void case11() {
        int[] item = { 255, 246, 166, 204, 200, 219, 179, 183, 262, 213, 191 };
        assertEquals(11, binpackingeasy.minBins(item));
    }

    @Test
    public void case12() {
        int[] item = { 217, 204, 214, 218, 221, 211, 211, 223, 224, 218, 217, 206, 212, 216, 214, 225, 213, 224, 205, 213, 223, 219, 205, 210, 205, 218, 218 };
        assertEquals(27, binpackingeasy.minBins(item));
    }

    @Test
    public void case13() {
        int[] item = { 163, 162, 166, 166, 164, 168, 169, 161, 161, 164, 162, 161 };
        assertEquals(12, binpackingeasy.minBins(item));
    }

    @Test
    public void case14() {
        int[] item = { 126, 158, 181, 132 };
        assertEquals(3, binpackingeasy.minBins(item));
    }

    @Test
    public void case15() {
        int[] item = { 224, 227, 221, 225, 222, 225, 225, 219, 228, 228, 225, 225, 223, 228, 222, 219, 227, 221, 220, 219, 219, 228, 224, 225, 227, 222, 224, 223, 219, 228, 219, 219 };
        assertEquals(32, binpackingeasy.minBins(item));
    }

    @Test
    public void case16() {
        int[] item = { 207, 226, 208, 247, 200, 173, 223, 163, 200, 240, 209, 162, 178, 253, 169, 174, 200, 254, 188, 190, 172, 161, 221, 183, 168, 223, 206, 196, 178, 216, 219, 167, 228, 171 };
        assertEquals(34, binpackingeasy.minBins(item));
    }

    @Test
    public void case17() {
        int[] item = { 179, 184, 211, 178, 165, 190, 173, 206, 204, 153, 153, 177 };
        assertEquals(12, binpackingeasy.minBins(item));
    }

    @Test
    public void case18() {
        int[] item = { 204, 216, 231, 239, 299, 273, 268, 249, 256, 279, 253, 228, 281, 289, 277, 291, 269, 215, 252, 272, 273, 264, 212, 231, 271, 295, 244, 214, 241, 216, 254, 208, 231, 289, 239, 224, 220, 250, 279, 220, 227 };
        assertEquals(41, binpackingeasy.minBins(item));
    }

    @Test
    public void case19() {
        int[] item = { 179, 141, 151, 160, 184, 177, 157, 167, 147, 158, 173 };
        assertEquals(9, binpackingeasy.minBins(item));
    }

    @Test
    public void case20() {
        int[] item = { 232, 206, 236, 226, 241, 214, 214, 238, 207, 215, 239, 206, 215, 229, 212, 237, 224, 242, 211, 230, 242, 227, 208, 208, 208, 228, 229, 208, 229, 236, 237, 214, 235, 223 };
        assertEquals(34, binpackingeasy.minBins(item));
    }

    @Test
    public void case21() {
        int[] item = { 197, 199, 152, 176, 198, 193, 165, 208, 204, 164, 137, 148, 148, 201, 171, 204, 169, 187, 188, 207, 184, 187, 194, 196, 160, 138, 139, 184, 180, 180, 150 };
        assertEquals(27, binpackingeasy.minBins(item));
    }

    @Test
    public void case22() {
        int[] item = { 191, 192, 164, 177, 170, 152, 201, 145, 171, 150, 120, 224, 172, 212, 123, 121, 222, 149, 206, 134, 167, 152, 182, 140, 136, 152, 169, 214, 203, 220, 166, 154, 166, 117, 199, 226, 224, 157 };
        assertEquals(29, binpackingeasy.minBins(item));
    }

    @Test
    public void case23() {
        int[] item = { 251, 254, 254, 232, 206, 241, 236, 257, 240, 243, 212, 259, 228, 213, 226, 238, 243, 238, 238, 249, 196, 238, 229, 212, 214, 204, 215, 228, 224, 206, 242, 230, 201, 214, 203, 240, 202, 216, 242, 255, 232 };
        assertEquals(41, binpackingeasy.minBins(item));
    }

    @Test
    public void case24() {
        int[] item = { 137, 174, 155, 140, 241, 243, 222, 167, 135, 200, 133, 180, 212, 166, 209, 234, 201, 161, 140, 138, 165, 171, 135, 126, 146, 230, 214, 182, 133, 135, 200 };
        assertEquals(23, binpackingeasy.minBins(item));
    }

    @Test
    public void case25() {
        int[] item = { 224, 281, 220, 284, 276, 239, 230, 251, 257, 255, 255, 252, 219, 226, 253, 282, 232, 230, 223, 284, 257, 232, 242, 270, 271, 235, 264, 256, 250, 288, 265, 289, 248, 248, 234, 276, 252, 231, 226, 264, 258 };
        assertEquals(41, binpackingeasy.minBins(item));
    }

    @Test
    public void case26() {
        int[] item = { 214, 235, 235, 189, 218, 230, 183, 211, 209, 208, 191, 189, 206, 184, 225, 190, 235, 230, 172, 212, 215, 197, 216, 224, 226, 187, 200, 213, 201, 196, 195, 185, 177, 201, 231, 211, 201, 195, 192, 194, 214, 188, 182, 214, 239, 215, 173, 215, 213, 180 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case27() {
        int[] item = { 205, 246, 206, 218, 203, 222, 241, 229, 232, 243, 236, 213, 247, 206, 245, 241, 209, 240, 242, 213, 204, 221, 210, 227, 204, 243, 203, 250, 237, 248, 232, 217, 205, 218, 218, 220, 226, 249, 241, 222, 245, 206, 221, 241, 212, 233, 226, 239, 229, 236 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case28() {
        int[] item = { 133, 149, 257, 243, 213, 253, 254, 253, 189, 219, 161, 179, 155, 214, 186, 154, 173, 186, 252, 253, 257, 167, 210, 173, 142, 152, 222, 141, 164, 154, 242, 252, 257, 156, 144, 204, 135, 232, 251, 167, 253, 162, 150, 148, 159, 233, 162, 168, 193, 237 };
        assertEquals(43, binpackingeasy.minBins(item));
    }

    @Test
    public void case29() {
        int[] item = { 263, 235, 133, 144, 253, 128, 223, 113, 135, 250, 107, 264, 219, 182, 130, 123, 147, 253, 173, 219, 132, 174, 259, 268, 124, 148, 117, 221, 265, 172, 161, 126, 101, 126, 254, 170, 203, 237, 222, 126, 170, 207, 185, 160, 193, 264, 268, 221, 159, 164 };
        assertEquals(36, binpackingeasy.minBins(item));
    }

    @Test
    public void case30() {
        int[] item = { 154, 148, 234, 209, 269, 192, 274, 156, 209, 169, 160, 288, 162, 287, 161, 168, 261, 207, 285, 282, 175, 136, 189, 232, 218, 285, 225, 254, 130, 204, 203, 130, 204, 188, 258, 209, 190, 136, 165, 181, 284, 163, 185, 151, 234, 254, 218, 275, 162, 282 };
        assertEquals(45, binpackingeasy.minBins(item));
    }

    @Test
    public void case31() {
        int[] item = { 142, 148, 190, 141, 163, 176, 150, 145, 134, 180, 134, 193, 198, 126, 125, 153, 143, 146, 169, 172, 134, 145, 184, 164, 162, 194, 176, 167, 181, 167, 193, 158, 159, 181, 176, 187, 169, 149, 127, 140, 161, 142, 170, 177, 169, 191, 129, 147, 179, 168 };
        assertEquals(36, binpackingeasy.minBins(item));
    }

    @Test
    public void case32() {
        int[] item = { 137, 141, 121, 132, 130, 122, 120, 120, 127, 123, 139, 126, 130, 128, 142, 127, 137, 140, 123, 142, 139, 127, 122, 125, 128, 142, 141, 140, 117, 124, 126, 129, 117, 124, 136, 118, 117, 133, 141, 117, 127, 125, 120, 141, 120, 120, 140, 132, 129, 117 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case33() {
        int[] item = { 164, 164, 165, 165, 165, 164, 165, 164, 164, 164, 164, 165, 164, 164, 164, 165, 165, 165, 164, 165, 165, 164, 164, 164, 165, 165, 164, 164, 164, 164, 164, 165, 165, 164, 164, 165, 165, 164, 165, 164, 164, 164, 164, 165, 164, 165, 165, 165, 164, 164 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case34() {
        int[] item = { 161, 229, 146, 219, 221, 187, 123, 150, 202, 171, 134, 157, 150, 140, 214, 237, 185, 243, 176, 206, 123, 223, 200, 176, 144, 162, 204, 246, 197, 171, 237, 199, 138, 212, 174, 142, 172, 202, 206, 203, 190, 220, 246, 156, 144, 126, 193, 235, 183, 140 };
        assertEquals(40, binpackingeasy.minBins(item));
    }

    @Test
    public void case35() {
        int[] item = { 219, 194, 190, 242, 229, 273, 249, 238, 202, 267, 194, 172, 194, 209, 202, 177, 236, 169, 166, 264, 258, 180, 247, 238, 223, 281, 162, 204, 269, 258, 193, 234, 204, 212, 257, 265, 266, 198, 276, 231, 218, 225, 226, 275, 276, 249, 184, 241, 199, 263 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case36() {
        int[] item = { 125, 133, 137, 135, 146, 153, 123, 142, 153, 144, 150, 139, 137, 127, 156, 128, 124, 132, 135, 152, 126, 150, 142, 155, 156, 147, 138, 135, 142, 146, 151, 121, 141, 123, 129, 137, 146, 147, 124, 125, 136, 150, 122, 128, 136, 143, 138, 132, 147, 121 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case37() {
        int[] item = { 126, 129, 125, 125, 119, 128, 128, 124, 128, 129, 121, 117, 117, 125, 123, 127, 127, 127, 116, 118, 122, 129, 114, 115, 129, 120, 119, 116, 115, 126, 118, 116, 126, 116, 121, 129, 114, 116, 124, 115, 122, 117, 129, 126, 121, 121, 117, 116, 127, 129 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case38() {
        int[] item = { 152, 123, 124, 128, 120, 118, 157, 144, 158, 164, 127, 116, 157, 122, 120, 130, 152, 135, 146, 147, 148, 145, 129, 164, 140, 143, 118, 148, 139, 135, 147, 122, 147, 119, 162, 121, 158, 133, 138, 135, 127, 142, 143, 122, 164, 157, 143, 151, 127, 132 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case39() {
        int[] item = { 172, 142, 136, 143, 180, 146, 180, 184, 182, 183, 160, 164, 156, 162, 132, 136, 171, 185, 194, 143, 130, 151, 130, 185, 195, 128, 174, 152, 133, 151, 189, 164, 139, 165, 137, 127, 178, 152, 174, 168, 194, 196, 188, 134, 156, 127, 157, 141, 170, 129 };
        assertEquals(33, binpackingeasy.minBins(item));
    }

    @Test
    public void case40() {
        int[] item = { 211, 239, 191, 276, 257, 291, 219, 243, 241, 271, 198, 210, 251, 242, 185, 282, 284, 250, 182, 215, 273, 221, 261, 205, 254, 180, 236, 223, 291, 226, 185, 214, 207, 187, 276, 220, 261, 185, 228, 198, 248, 293, 224, 242, 293, 275, 272, 216, 206, 225 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case41() {
        int[] item = { 230, 231, 246, 215, 215, 220, 249, 242, 231, 214, 237, 249, 232, 254, 227, 233, 226, 254, 250, 239, 243, 235, 220, 241, 231, 234, 233, 231, 235, 235, 251, 223, 228, 218, 215, 224, 242, 228, 238, 217, 217, 220, 252, 250, 256, 249, 227, 226, 218, 216 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case42() {
        int[] item = { 215, 192, 211, 242, 217, 243, 167, 221, 252, 191, 242, 228, 185, 170, 221, 217, 198, 181, 209, 147, 231, 213, 162, 154, 159, 173, 244, 177, 253, 222, 162, 166, 172, 218, 195, 172, 217, 164, 156, 178, 145, 184, 186, 249, 222, 241, 237, 187, 189, 188 };
        assertEquals(49, binpackingeasy.minBins(item));
    }

    @Test
    public void case43() {
        int[] item = { 180, 148, 155, 238, 170, 247, 220, 177, 206, 230, 169, 165, 154, 175, 230, 215, 191, 247, 197, 213, 189, 186, 207, 152, 181, 147, 166, 224, 194, 183, 222, 220, 180, 161, 237, 222, 247, 184, 155, 175, 184, 179, 191, 164, 145, 243, 151, 152, 219, 175 };
        assertEquals(47, binpackingeasy.minBins(item));
    }

    @Test
    public void case44() {
        int[] item = { 117, 119, 128, 111, 151, 140, 143, 130, 153, 112, 142, 120, 148, 143, 144, 145, 114, 122, 121, 148, 120, 148, 149, 147, 119, 124, 146, 113, 120, 148, 128, 135, 143, 127, 123, 123, 144, 140, 146, 127, 111, 148, 141, 132, 117, 127, 134, 125, 148, 130 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case45() {
        int[] item = { 158, 159, 164, 148, 169, 166, 130, 141, 135, 131, 139, 171, 132, 157, 128, 159, 144, 128, 158, 152, 168, 163, 155, 141, 132, 145, 145, 166, 128, 157, 144, 144, 136, 155, 128, 130, 142, 172, 152, 158, 157, 155, 136, 126, 147, 160, 147, 140, 162, 163 };
        assertEquals(26, binpackingeasy.minBins(item));
    }

    @Test
    public void case46() {
        int[] item = { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
        assertEquals(50, binpackingeasy.minBins(item));
    }

    @Test
    public void case47() {
        int[] item = { 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case48() {
        int[] item = { 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case49() {
        int[] item = { 200, 200 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case50() {
        int[] item = { 199, 199 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case51() {
        int[] item = { 175, 175 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case52() {
        int[] item = { 101, 188, 150, 101 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case53() {
        int[] item = { 300, 101, 200 };
        assertEquals(3, binpackingeasy.minBins(item));
    }

    @Test
    public void case54() {
        int[] item = { 300 };
        assertEquals(1, binpackingeasy.minBins(item));
    }

    @Test
    public void case55() {
        int[] item = { 120, 120, 150, 150, 150, 150 };
        assertEquals(3, binpackingeasy.minBins(item));
    }

    @Test
    public void case56() {
        int[] item = { 198, 198 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case57() {
        int[] item = { 160, 190, 140, 110 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case58() {
        int[] item = { 199, 199, 199, 199, 199, 199 };
        assertEquals(6, binpackingeasy.minBins(item));
    }

    @Test
    public void case59() {
        int[] item = { 160, 160, 160, 160, 160, 160, 160, 160, 160, 160, 160 };
        assertEquals(11, binpackingeasy.minBins(item));
    }

    @Test
    public void case60() {
        int[] item = { 199, 199, 199, 199, 199, 199, 199, 199, 199, 199 };
        assertEquals(10, binpackingeasy.minBins(item));
    }

    @Test
    public void case61() {
        int[] item = { 102, 199 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case62() {
        int[] item = { 123, 145, 167, 213, 245, 267, 289, 132, 154, 176, 198 };
        assertEquals(8, binpackingeasy.minBins(item));
    }

    @Test
    public void case63() {
        int[] item = { 105, 160, 185, 135 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

    @Test
    public void case64() {
        int[] item = { 151, 151, 151, 151, 149 };
        assertEquals(4, binpackingeasy.minBins(item));
    }

    @Test
    public void case65() {
        int[] item = { 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120 };
        assertEquals(25, binpackingeasy.minBins(item));
    }

    @Test
    public void case66() {
        int[] item = { 101 };
        assertEquals(1, binpackingeasy.minBins(item));
    }

    @Test
    public void case67() {
        int[] item = { 150, 110, 150, 190 };
        assertEquals(2, binpackingeasy.minBins(item));
    }

}
