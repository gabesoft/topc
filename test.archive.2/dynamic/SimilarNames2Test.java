package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SimilarNames2Test {
    SimilarNames2 similarnames2 = new SimilarNames2();

    @Test
    public void case1() {
        String[] names = { "kenta", "kentaro", "ken" };
        int L = 2;
        assertEquals(3, similarnames2.count(names, L));
    }

    @Test
    public void case2() {
        String[] names = { "hideo", "hideto", "hideki", "hide" };
        int L = 2;
        assertEquals(6, similarnames2.count(names, L));
    }

    @Test
    public void case3() {
        String[] names = { "aya", "saku", "emi", "ayane", "sakura", "emika", "sakurako" };
        int L = 3;
        assertEquals(24, similarnames2.count(names, L));
    }

    @Test
    public void case4() {
        String[] names = { "taro", "jiro", "hanako" };
        int L = 2;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case5() {
        String[] names = { "alice", "bob", "charlie" };
        int L = 1;
        assertEquals(6, similarnames2.count(names, L));
    }

    @Test
    public void case6() {
        String[] names = { "ryota", "ryohei", "ryotaro", "ryo", "ryoga", "ryoma", "ryoko", "ryosuke", "ciel", "lun", "ryuta", "ryuji", "ryuma", "ryujiro", "ryusuke", "ryutaro", "ryu", "ryuhei", "ryuichi", "evima" };
        int L = 3;
        assertEquals(276818566, similarnames2.count(names, L));
    }

    @Test
    public void case7() {
        String[] names = { "fjewoi", "fejwoifjewiefw", "f", "fewi", "few", "fweewe", "fldskds", "fefwwjo", "fww", "fewww" };
        int L = 2;
        assertEquals(443520, similarnames2.count(names, L));
    }

    @Test
    public void case8() {
        String[] names = { "fjewoi", "fejwoifjewiefw", "f", "fewi", "few", "fweewe", "fldskds", "fefwwjo", "fww", "fewww" };
        int L = 3;
        assertEquals(10080, similarnames2.count(names, L));
    }

    @Test
    public void case9() {
        String[] names = { "fjewoi", "fejwoifjewiefw", "f", "fewi", "few", "fweewe", "fldskds", "fefwwjo", "fww", "fewww" };
        int L = 4;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case10() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 50;
        assertEquals(1, similarnames2.count(names, L));
    }

    @Test
    public void case11() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 49;
        assertEquals(50, similarnames2.count(names, L));
    }

    @Test
    public void case12() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 25;
        assertEquals(875934861, similarnames2.count(names, L));
    }

    @Test
    public void case13() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 2;
        assertEquals(159304024, similarnames2.count(names, L));
    }

    @Test
    public void case14() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case15() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 8;
        assertEquals(385325365, similarnames2.count(names, L));
    }

    @Test
    public void case16() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 17;
        assertEquals(183404719, similarnames2.count(names, L));
    }

    @Test
    public void case17() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 24;
        assertEquals(898371378, similarnames2.count(names, L));
    }

    @Test
    public void case18() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 32;
        assertEquals(875441647, similarnames2.count(names, L));
    }

    @Test
    public void case19() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 41;
        assertEquals(774691803, similarnames2.count(names, L));
    }

    @Test
    public void case20() {
        String[] names = { "a", "b" };
        int L = 1;
        assertEquals(2, similarnames2.count(names, L));
    }

    @Test
    public void case21() {
        String[] names = { "a", "b" };
        int L = 2;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case22() {
        String[] names = { "a", "aa" };
        int L = 1;
        assertEquals(2, similarnames2.count(names, L));
    }

    @Test
    public void case23() {
        String[] names = { "a", "aa" };
        int L = 2;
        assertEquals(1, similarnames2.count(names, L));
    }

    @Test
    public void case24() {
        String[] names = { "a", "aa", "aaa" };
        int L = 1;
        assertEquals(6, similarnames2.count(names, L));
    }

    @Test
    public void case25() {
        String[] names = { "a", "aa", "aaa" };
        int L = 2;
        assertEquals(3, similarnames2.count(names, L));
    }

    @Test
    public void case26() {
        String[] names = { "a", "aa", "aaa" };
        int L = 3;
        assertEquals(1, similarnames2.count(names, L));
    }

    @Test
    public void case27() {
        String[] names = { "a", "aa", "ab" };
        int L = 2;
        assertEquals(2, similarnames2.count(names, L));
    }

    @Test
    public void case28() {
        String[] names = { "a", "aa", "ab" };
        int L = 3;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case29() {
        String[] names = { "a", "aa", "aaa", "aaaa" };
        int L = 2;
        assertEquals(12, similarnames2.count(names, L));
    }

    @Test
    public void case30() {
        String[] names = { "a", "aa", "aaa", "aaaa" };
        int L = 3;
        assertEquals(4, similarnames2.count(names, L));
    }

    @Test
    public void case31() {
        String[] names = { "a", "aa", "aaa", "aaaa" };
        int L = 4;
        assertEquals(1, similarnames2.count(names, L));
    }

    @Test
    public void case32() {
        String[] names = { "a", "aa", "ab", "aaa" };
        int L = 2;
        assertEquals(8, similarnames2.count(names, L));
    }

    @Test
    public void case33() {
        String[] names = { "a", "aa", "ab", "aaa" };
        int L = 3;
        assertEquals(1, similarnames2.count(names, L));
    }

    @Test
    public void case34() {
        String[] names = { "a", "aa", "ab", "aaa" };
        int L = 4;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case35() {
        String[] names = { "a", "aa", "b", "bb" };
        int L = 2;
        assertEquals(4, similarnames2.count(names, L));
    }

    @Test
    public void case36() {
        String[] names = { "a", "aa", "b", "bb" };
        int L = 3;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case37() {
        String[] names = { "a", "aa", "b", "bb" };
        int L = 1;
        assertEquals(24, similarnames2.count(names, L));
    }

    @Test
    public void case38() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa" };
        int L = 2;
        assertEquals(60, similarnames2.count(names, L));
    }

    @Test
    public void case39() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa" };
        int L = 3;
        assertEquals(20, similarnames2.count(names, L));
    }

    @Test
    public void case40() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa" };
        int L = 4;
        assertEquals(5, similarnames2.count(names, L));
    }

    @Test
    public void case41() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa" };
        int L = 5;
        assertEquals(1, similarnames2.count(names, L));
    }

    @Test
    public void case42() {
        String[] names = { "fkuxwu", "jkiekaajgr", "om", "necfhmw", "ookrihq", "fkusasqx", "fkuooeeimsi", "ggeyqxji", "ggeyq", "ggeosfwftss", "ggeyqcrxq", "necfhmwory", "fkuooeel", "gge", "jkie", "ggeyqzvef", "ggeyqveeg", "ggeoxok", "jkieqsl", "oo", "ggeyqxjibxn", "fku", "jkiedyfrd", "ne", "ootjf", "fkurvt", "jkietjyq", "ggeyqva", "jkiekaajg", "ggeo", "ggeyqv", "fkujstu", "fkuooee", "ootywl", "netty", "hhc", "g", "fkuug", "ggeosfw", "ggeyqvw", "fkuxw", "qab", "fkuooeeimsibgszh", "jkieq", "ggeyqxjim", "omcavc", "ggeyqzf", "jkiekaajgrpj", "jkieqya", "nedoy" };
        int L = 6;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case43() {
        String[] names = { "gfvtoqmt", "pwynnxavgelw", "pwynnxavvebyybdrbehbq", "gtwbzewoplstk", "pwynnxavcrblwxmdv", "g", "muemydnr", "gnfioebwxj", "pwynnxavvebyybuf", "pwynnxavvebyybzqguqkyoaijwuqxy", "pwynnxavvebyybdrfjgz", "pwynnxavvebyybdrcjsvsi", "gkuu", "gkuujbuft", "pwynnxavgelp", "gtuasxmzcu", "muemybrghcuykw", "pwynnxav", "pw", "gkuuj", "gt", "gnfioebw", "pwynnxavvebyybzqguqkyoaijwjnbv", "gfs", "gf", "gxatmn", "pwynnxavvebyyb", "gkuujq", "gxatmnv", "pwynnxavvebyybzqguqk", "pwynnxavvebyybdrcjsvsijury", "muemybrgkxd", "muemywftr", "gfjewls", "pwyd", "gtwbzewoplstkszcr", "gxatm", "muemy", "pwynnxavvebyybdr", "pwqi", "pwynnxavgel", "pwynnxavcrblw", "gnfio", "gtuasxm", "muemybrg", "gtua", "pwynnxavvebyybdrfjgzkqrxzn", "pwynnxavvebyybzqguqkyoaijw", "gtwbzewo", "pwynnxavvebyybdrbe" };
        int L = 8;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case44() {
        String[] names = { "kfrpxtlcavd", "kfrpnsiuonicn", "kfrpxthbgyyl", "kfrpxthbgyylabl", "kfrpxtlcakn", "kfrpxtlcavdizj", "kfrpxthbgyylo", "kfrpxtlcapw", "kfiyu", "kfrpxeqzlvj", "kfni", "kfrpxtlca", "kfrpxtlcav", "kfrpxeqzpkqaz", "kfrpnsiuonic", "kficd", "k", "kyic", "kfrp", "kfrpxthbgdq", "kfrpxt", "kfrpxeqzqwzcw", "kfrpxtuxolh", "ky", "kfrpxtuxogh", "kfrpxeq", "kfrpxthbg", "kfrpxeqzqw", "kfrpxeqzpk", "kfrpxthbgdqk", "kfrpxeqz", "kfrpnsi", "kfrpxtlcavpli", "zvw", "kfrpxtlcakngd", "kfrptvf", "kfrpxthbgyylab", "kfrpnsiuo", "kfnic", "kf", "kfrpxtlcavdtpe", "kfrpxeqzpkx", "kfrpmt", "kfrpxeqzqwwpc", "kfrpxeqlj", "kfrpxtuxo", "kfrpxtlcavdtpeqpf", "kfrpxthbgyylosd", "kfrpxtlcakngdn", "kfi" };
        int L = 8;
        assertEquals(149120794, similarnames2.count(names, L));
    }

    @Test
    public void case45() {
        String[] names = { "mfhulmrudkbl", "mfhulmrudkblmaqpcaifmivsjrsklfweoyzu", "mfhulmrudkblmaqpcaifmivsjrsklfweoyzummco", "ztntaajuhzjufp", "mfhulmrudkblvjog", "zt", "ztnta", "mfhulmrudkbpzqfjrpeas", "zthbbaxembwcckggyymw", "ztntaajuhzjufpuybkkmoljzv", "mfhulmrudkblmaqpcaifmivsjrsoypaxcxms", "ztntaajuhzjufpuybkkmoljzvqllci", "mfhulmrudkblmaqpcaifmivsjrf", "mfhulmrudkblmaqpcaifm", "mfhulmrudkblmaqpcaifmfugpasfobigzml", "ztntahkoujtgasg", "mfhulmrudkblvjoggbpjrhktbnkmeuxgwng", "onge", "mfhulmrudkbcbonp", "acmgsqq", "mfhulmrudkblaclaea", "mfhulmrudkblmaqpcaifmivsjrsoypaxcxmwvwurdns", "mfhulmrudkblmaqpcaifmivsjrs", "mfhulmrudkblfhebemqdy", "mfhulmrudkbpzqfjrpea", "ztxoknxt", "kdzofkmxlv", "mfhulmrudkbcbonprla", "ztntaa", "mfhulmrudkbpzqfjrpeasletmz", "mfhulmrudkblmaqpcaifmfugpasfobixopmqkyy", "mfhulmrudkb", "mfhulmrudkblmaqpcaifmivsjrsklfweoyzuzwgj", "mfhulmrudkblmaqpcaifmfugpasfobitbvra", "mfhulmrudkbcbonpkqinokkca", "mfhulmrudkblvjoggbpjrh", "zthbbaxembwcc", "ztntaajuhzjufpnombnblay", "mfhulmrudkblmaqpcaifmivsjrsoypaxcxm", "ztntahkoujtgasgcafbown", "mfhulmrudkblmaqpcaifmivsjrfdwjocvmgya", "mfhulmrudkblmaqpcaifmivsjr", "mfhulmrudkblvjoggbpjrhktbnkmeuxgw", "mfhulmrudkblfhebemqdyfjvcd", "mfhulmrudkblmaqpcaifmfugpasfobiyhnhzkv", "mfhulmrudkblvjoggbpjrhbspgg", "mfhulmrudkblmaqpcaifmfugpasfobixi", "ltvckzcmo", "mfhulmrudkblmaqpcaifmfugpasfobi", "mfhulmrudkblmaqpcaifmivsjrsoypaxcxmbcsxmla" };
        int L = 2;
        assertEquals(552047667, similarnames2.count(names, L));
    }

    @Test
    public void case46() {
        String[] names = { "giacozdx", "gixwtmjutysxltn", "ztoyj", "gixwtmjutysxcjfl", "giacoyr", "q", "gixwtmjutysxqys", "giigfvmw", "gixwtmjutysxcjflyis", "giigfzosqlglecnlkyahzsf", "gixwtmjutysxcjflsm", "gixwtmjutysxcjfly", "giacozdxy", "giigfzostbncjx", "gixwtmjutysx", "giac", "zt", "giigfvmwt", "gixwtmjutysxezp", "giigfzostbn", "giigfzosql", "gixwtmjutysxp", "giigfzosqlmcsih", "giigfzosqlglec", "giaco", "giigfzosgnn", "giigfvmwtd", "gixwsotv", "giigfzosqlglecnlkya", "bamn", "gixwtmjutysxezpcnq", "s", "qwv", "giackt", "giigfzosqlm", "giigfzos", "gixwtmjutysxcjflsbki", "giigfzosqlglecn", "gixw", "gixwtmjutysxpxkb", "giigf", "giigfvmwtaryv", "gixwtmjutysxcjfls", "gixwtmjutysxezpcn", "gi", "giigfzosg", "giigfzostbnc", "giigfl", "gixwtmjutysxs", "gixwtmju" };
        int L = 8;
        assertEquals(626855450, similarnames2.count(names, L));
    }

    @Test
    public void case47() {
        String[] names = { "s", "jcgfk", "jcgfandgax", "xdovw", "xdnxph", "xdnn", "sxqk", "jcgfan", "jcgfunr", "sxq", "sxqwd", "jcgfjhho", "jcgfandgprx", "jcgfjhxatd", "jcgf", "xdn", "xdnxy", "jcgfanq", "jcu", "xd", "jcgfaa", "jcgfjhhoerun", "jcgfun", "jcgfandgtg", "sxqeye", "jcgfjhxa", "jc", "jcgfundk", "sxqey", "jcgfjhhoer", "xdouej", "jcgfandgpr", "jcgfanqln", "jcct", "jcgfjh", "jcgfu", "xdsr", "xdo", "jcgfandgprejjg", "jcgfandgprej", "sxqjo", "sxqeyh", "jcumr", "jccd", "jcgfjhhox", "jcgfans", "xdoue", "xdnx", "jcc", "jcgfandg" };
        int L = 8;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case48() {
        String[] names = { "nakomgxnwttpgcuvzzqvpceie", "zsiu", "us", "nakomgxnwttpggjafbheliwldljsobi", "nakomgxnwttpgcuv", "nakomgxnwttpggjafbhel", "uxsbcrqoe", "natlh", "nakomgxnwttpgpz", "fbndmtte", "nakomgxoxr", "nakomgxjcxexbfznmlpo", "nakomgxnwttpg", "xj", "ywt", "nakomgxhcsqttwudcf", "nakomgxnwttpgpzpc", "nakomgxjcxexb", "natlhfhhghofa", "natlhjafxqhctiw", "nakomgx", "u", "naxugma", "na", "uyond", "ywieatxuhhqk", "nakomgxnwttpgcuvzzqvpceem", "nakomgxnwttpgcuvzzqvpce", "nakomgxhcs", "ulsylnt", "tnbbsafoqeee", "yw", "nakomgxhcsqttwudcfmn", "natlhjafxqhctiwyzcb", "nakomgxnwttpggjafbheli", "natlhjafxqh", "xjcqmikiu", "nakomgxnwttpggjafbheliwldljso", "nakomgxjcxexbfznmlposysf", "natlhfhhg", "nakomgxnwttpgpdajlwjlvm", "tnbbsa", "udgbqgupa", "nakomgxhcsqttwudcftys", "naxu", "xjmdpldnxi", "natlhj", "ulsy", "ywieat", "nakomgxnwttpgpdajlwj" };
        int L = 4;
        assertEquals(141270782, similarnames2.count(names, L));
    }

    @Test
    public void case49() {
        String[] names = { "aidjpprarxrlndhunoueqadr", "cdhgqy", "rjkehszhcqvsecxfxpagyz", "jcquyceqzjxwsnozgjflikvgmobrmt", "jcquyceqzjxngou", "jcquyceqzylhegvuhmfqvikguonthq", "jcquyceqzjxwsnojpvhft", "khbhcyfedhlwusmuglnda", "jcquyceqzjxwsno", "jcquyceqzjx", "jcquyceqzbcix", "jcquyceqzbcixqh", "khbhcyfedhlwsupagvuxl", "jcquyceqzjxfncfafrhuyrkpkdzbn", "kistqdpirvxkroqax", "ux", "jcquyceqzylhegvuhmn", "jcquyceqzjxwsnokbibov", "jcquyceqzjxfncfafrhuyrkp", "rjkehszhc", "aidjpprar", "aidjpprarxr", "rjkehszhcqvsecxfxpagyznxpp", "khbrslyphxar", "kistqdpirv", "jcquyceqzylhegvuhm", "jcquyceqzjxwsnozgjflikvg", "khb", "kistqdpirvxkro", "jcquyceqz", "jcquyceqzylhegvuhmfqvikguont", "jcquyceqzjxqbiagh", "jcquyceqzjxfncfafrh", "khbhcyfedhlwusmuglndaqysop", "jcquyceqzylhegvuhmfqvikguon", "jcquyceqzjxfncfafrhyx", "aidjpprarxrlndhoatfx", "khbhcyfedhlwusmuglndahuv", "khbhcyfed", "aidjpprarxrlndh", "uxzpu", "aidjpprarxrlndhpdnhqnx", "aidjppra", "rjkehszhcqvsecxf", "khbhcyfedhlw", "khbhcyfedhlwusmuglndaqysopcxlhmsy", "uxxcjwn", "jcquyceqzjxfncfafrhuyrkpdewpuyxw", "kistqd", "jcquyceqzylhegvuhmfqvikguontxxahesq" };
        int L = 7;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case50() {
        String[] names = { "hhjjxnrbpkkdyjjejk", "ezjlrweumrlaattet", "hhjjiympkmjimzfq", "hhjjxnrbpkkdyjjejkvobqio", "ezjlrweumr", "hhjjiyhbicwjtqojrknjmet", "ezjlrweumrlaattetuhvmgxjbzmt", "hhjjxnrbpkkdyjjejkgdiphubyf", "ez", "hhjjlauwx", "hhjjxnrbpkkdygkkcapaxmfdtfuakoh", "hhjjbjmvt", "hhjj", "hhjjiypqjvav", "ezjlrweumrlaattetktov", "hhjjrdjfwqxmgcbqz", "ezcrsmdr", "hhjjiympkmjimzf", "hhjjiymkfqd", "hhjjxnrbpkkdygkkcapaxmf", "hhjjrdjfwqxm", "hhjjou", "hhjjiy", "hhjjxnrbpkkdygkkcapaxdky", "hhjjxnrbpkkdygkkcapaxdkyxnrc", "ezjlrweumrrjrb", "hhjjiyhbicwjtqoylcc", "hhjjxnrbpkkdyjvpj", "hhjjrdjfwqxmssjhxj", "hhjjxnrbpkkdyepj", "hhjjxnrbpkkdygkkcapaxdkygilnfzjn", "ezjlrweumrlaattetuhvmgx", "hhjjxnrbpkkdygkkcapaxdkyvsz", "hhjjxnrbpkkdygkkcapaxmfdtfua", "hhjjxnrbpkkdygkkcapaxmfdtfuaragdgfjg", "hhjjxnrbpkkdygkkcapaxdkygilnfzjnd", "hhjjrdjfwqxmbvilzgu", "hhjjxnrbpkkdygkkcapax", "ezv", "hhjjiyah", "hhjjxnrbpkkdyowgjjby", "hhjjiyjirbk", "hhjjiyjirbkuud", "hhjjxnrbpkkdy", "hhjjiyhbicwjtqo", "hhjjxnrbpkkdygkkcapaxdkyume", "hhjjxnrbpkkdyjjejkasdimac", "hhjjxnrbpkkdygkkcapaxdkyxnrccrdohk", "hhjjbjmvtnmvoj", "hhjjiyhbicwjtqolx" };
        int L = 4;
        assertEquals(347365796, similarnames2.count(names, L));
    }

    @Test
    public void case51() {
        String[] names = { "hwradvgyvpmlavagnuobl", "hwradvgyvpmlavfrw", "hwraugyaaqkhpjrozekblmavffixodaq", "hwra", "hwraugyaaqkhpjrozekblmavffixoda", "hwradwtm", "hwraugyaaqkhpjrozekblmav", "hw", "hwraugyaaqkhpjrozekblmavffixodaylrbczjmli", "hwradpaep", "hwradpde", "hwraugyaaqkhpjrozekblmavffixodavzsccrjykwcnixvdcp", "hwradglaewmxwymtaksgmlvkixcpfdqjju", "hwradp", "hwraugyaaxqluzhczhcq", "hwradvgyvpmlavlwapykfab", "hwradvgyvpmlavlwapykfa", "fzryhitugvjou", "hwrafm", "hwqfu", "hwrafmax", "fzry", "hwraugyaaqkhpjrozekblmavffixodavzsccrjykwcnixv", "hwradglaewmxwymtaksgmlvkixcpfdqjjunj", "fzryxljfjttdadqum", "hwradvgyvpmlavlwapykfaio", "hwradvgyvpmlavlwapykfarifimzoxu", "hwraugyaaxqluzhczhcciczipciref", "hwradglaewmxwymta", "hwmdhzguocndqbtz", "hwrahjotoxuwuiy", "fzryhitugvjouitlibaerc", "hwradpa", "hwrahjotoxuwuiyoqjtckgo", "hwraugyaaxqluzhczhc", "hwraugyaa", "hwradvgyvpmlavq", "hwradvgyvpmlav", "hwradglaewmxwymt", "fzryxljfjttdadqumbbbebhw", "fzryhitugvjouitlibaercuseyidkv", "hwraugyaaxqluzhczhcqo", "hwqf", "hwraugyaaqkhpjrozekblmavxanbyzawamqg", "hwradwxjmtz", "hwradpaeprjjswrn", "fzryhitugvjouzhnkqjaydlh", "hwradpamyn", "hwradglaewmxwymtaksgm", "hwrad" };
        int L = 4;
        assertEquals(611764249, similarnames2.count(names, L));
    }

    @Test
    public void case52() {
        String[] names = { "fwgjtbllygebaofptsyt", "fwgjtbllygebpeniyvhyyjhybauktmpvqum", "fwgjtbllygeb", "fwg", "fwgjtbllygebpeniyvhyy", "fwgjtbllbhxds", "f", "fwgjtbllygebpeniyvhy", "fwgjtbllygebaofptsytn", "fwgjtbllygebp", "fwgjtbllygebpeniyvhyyjhybauloh", "fwgjtbllygebpeniyvhyyjhyba", "fwgjtbll", "fwgjtbllygebpeniyvhyyjhybaxmveky", "fwgjtbllygebpeniyvhyyjhybaul", "fwgjwzvveeftxbi", "fwgjtbllygebiqwpirhg", "fwgjtbllygebpeniyvhyyjhybaulo", "fwgjtbllygebpen", "fwgjtbllygebpeniyvhyyjhyb", "fwgjtbllygebpeniyvh", "fwgjtbllygebpenhzi", "fwgjtbllygebpeniyvhyyjhybbskhxd", "fwgjtbllygebpeniyvhyyjhy", "fwgjtbllygebpeniyvhyyjhybau", "fwgjtsw", "fwgjtbllygebaofptsytaaikf", "fwgjtb", "fwgjt", "fwgjtbllbhxdspcm", "fwgjtbllsnqz", "fwgjtbllygebpeniy", "fwgjtbllyge", "fwgjtbl", "fwgjwzvve", "fwgjtbllygebpeni", "fwgjtblliu", "fwgjtbllygebiqwpirhgvpber", "fwgjtbllygebpe", "fwgjtbllygebpeniyv", "fwgjtbllygebckfss", "fwgjtbllyg", "fwgjtbllsnqzpnc", "fwgj", "fwgjtbllygebpeniyvhyyjh", "fwgjtbllygebiqwpirhglls", "fw", "fwgjtblly", "fwgjtbllygebpeniyvhyyj", "draeo" };
        int L = 30;
        assertEquals(146326063, similarnames2.count(names, L));
    }

    @Test
    public void case53() {
        String[] names = { "zoydaontqynmqascxsm", "zoydaontqynmqas", "zoydaontqynm", "zoydaontq", "g", "zoydaontqynmqascxfjm", "zoydaontqnl", "zoydaonmgv", "zoydaontqynmqascxfjbeud", "zoydaontqynmqascxfjbeuds", "zoydaontqynmqax", "zoydaontqynmqascxfjbxr", "zoydaont", "zoydaontqynmq", "zoydaontqynmqascxfjbeudj", "zoydaontqynmqascyv", "zoydaontqynmqascxf", "zoydaontpu", "zoydaontqynmqascxfjbeu", "zoydaonm", "zoydaontqynmqascyvtt", "zoydaontqynmqjk", "zoydaontqyn", "zoydaontqynmqascxfjbeui", "zoy", "zoydaontqynmqa", "zoydaonttk", "zoydaontqynmqascxfjdu", "zoydaontqynmqascxfjb", "zoydaonla", "zoydaym", "zoydaontqy", "zoydaon", "zoydaontqynmqaszu", "zoydaontqynmqascxfjmdo", "zo", "zoydaonmg", "zoydao", "zoydaontqynmqasc", "zoydaontqynmqascxfjbew", "zoyd", "zoydaontqynmqascxfjbeudjm", "zoydaontqynmqascxfsy", "zoydaontqynmqascxfj", "zoydaontqynmqascxfjbeudjmo", "zoydaontqynmqascxfd", "zoydaontqynmqascxfjbe", "zoyda", "zoydaontqynmqascx", "z" };
        int L = 32;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case54() {
        String[] names = { "shauwykcdi", "tkvlb", "sha", "shauwykcdiqbzyrhgs", "s", "shauwykcdiq", "shauwykcdiqbzyrjmzzhizx", "shauwykcdfnllp", "shauwykcdiqbzyrjmzzh", "shauwykcdiqbzyrj", "shauwyk", "shauwykcdiqbzyrjmlad", "shauwykcdiqbybgkunefvj", "shaqcclcplzobrli", "shauwykcp", "shauwykcdiqbzyrjm", "shaqcclc", "shauwy", "shauwykcdiqbzyr", "shauwykcdiqbzyrjmzzhyzux", "shahm", "shau", "shauwykcdiqb", "shauwykcdiqmz", "shauwykcdiqbzyrjmzzqpxew", "shauwykcdiqbzyrjmlada", "shauwykcdiqbzyrjmzzhi", "shauwhr", "shauwykcdiqbzyrjmzzhiz", "shauwykcdiqbzyrjmz", "shauwykca", "shauwykcdiqbybg", "snjo", "shauw", "shauwykcdiqbz", "shao", "shauwykcdiqbfhx", "shauwykc", "shauwykcdiqbzyrjnsqlqa", "shauwykcdiqbzyrjmzz", "shbwymewx", "shauwykctog", "shauwykcdiqbzy", "shauwykcdiqbzyrjmzzhizxf", "shauwykcdiqbzyrjmzzqpxewmo", "shauwykcd", "sh", "shauwykcdiqbzyrjmzzhizkgwjepsr", "shauwykx", "shahmeckgut" };
        int L = 30;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case55() {
        String[] names = { "qgwxnbzxteq", "qgwxnbzxtekpgivz", "qgwxnbzxfj", "qgwxnbzxtekpw", "qgwxnbzxtexyg", "qgvy", "qgwxnbzxfjn", "qgwxnbzxtekpgivuz", "qgwxnbzx", "qgwxnbzxtekpgivuncxozs", "qgwxnbzxtekpg", "qgwxnbzxtexyk", "qgwxnbzxtekpgivuncxozsc", "qgwxnbzxtekpgivuncxo", "qgwxnbzxtekpgu", "qgwxnbu", "qgwxnbd", "qgwxnbzxtes", "qg", "qgwxnbzxtekpgivun", "qgv", "qgwx", "qgwxnbzxtekpgivuncxozsbi", "qgwxnbz", "qgwxnbzxtekpgi", "qgwxnbzxte", "qgwxnbzxtekpgiv", "qgwxnbzxtek", "qgwxnbzxtekpgivunc", "qgwxnbzxtekpgivuncxoz", "qgwxnbzxtex", "qgwxnbzxtekpgivuncxozsbir", "qgwxn", "qgwxnbzxtexw", "qgwxnbzxtekp", "qgwxnbzxtekpgivuncxozsb", "qgwxnbzxfjd", "qgwxnbzxtekpgib", "qgwxnbzxteqm", "qgwxnbzxtekpgivu", "qgwb", "qgwxnbzxtekpgivuncx", "qgw", "qgwxnbzxt", "q", "qgwxnbzxfjdv", "qgwxnbzxtekpwz", "qgwxnbzxf", "qgwxnbzxtexy", "qgwxnb" };
        int L = 4;
        assertEquals(592028584, similarnames2.count(names, L));
    }

    @Test
    public void case56() {
        String[] names = { "auxaaspzpvbfnlhlckwt", "auxaaspzpvbfnlhlckwimxbosgnvwnuoixt", "auxaaspzpvbfnlhlckwimxbosgsjjxojsllu", "auxaaspzpvbfnlhlckwimxbosgsjj", "auxaaspzpvbfnlhlckwimx", "auxaaspzpvbfnlhlckwimxbosgsjjxojsl", "aunddqy", "auxaaspzpv", "auxaaspzpvbfnlhlckwimxbosgsjjxojsll", "auxaaspzpvbfnlhlckwi", "auxaaspzpvbfnlhlckwimxbosgsjjxojs", "auxaaspzpvbfnlhlckwim", "auxaaspzpvbfnlhlckwimxbosgsjjxo", "auxaaspzpvbfnlhlc", "auxaaspzpvbfnlhlckwimxbosgsjjxoj", "auxaaspzpvbfnlhlckwimxb", "auxaaspzp", "auxaaspzpvbfnlhlckwimxbos", "auxohecdyvnob", "auxaaspzpvbfnlhlckwimxbosgsjjtzyngsw", "auxaaspzpvbfnl", "auxaaspzpvbfnlhlck", "au", "auxa", "auxaaspzpvbf", "a", "auxaaspzpvbfnlhlckwizng", "auxaaspzpvbfnlhlckwimxbosgsjjxojslluda", "auxaaspzpvbfnlhlckwimxbosgsj", "auxaaspzpvbfnlhlckwimxbo", "auxaaspzpvhjylwu", "auxaaspzpvbfnlhlckwimxbosgsjjx", "auxaaspz", "auxaaspzpvbfnlhl", "auxaaspzpvbfnlhlckwimxbwjswziqo", "auxaaspzpvbfnlhlckwimxbosg", "auxaaspzpvbfnlhlckwimxbosgsjjxojsllud", "auxaaspzpvbfnlh", "auxaas", "auxaaspzpvbfn", "aux", "auxaaspzpvbfnlhlckwimxbosgsjjma", "auxaasp", "auxaaspzpvbfnhxgfowsqh", "auxaaspzpvb", "auxaaspzw", "auxaaspzpvbfnlhlckwimxbosgs", "auxaaspzpvbfnlhlckwimxbosgsjjxojvbdekdsia", "auxaaspzpvbfnlhlckw", "auxaa" };
        int L = 15;
        assertEquals(315349501, similarnames2.count(names, L));
    }

    @Test
    public void case57() {
        String[] names = { "yxbhza", "yxbhzauyshgjob", "yxbhzauyshgjobzwqkkpn", "yxbhzauyshgjobzwqkkpnbxpqhtaz", "yxbhzauyshgjobzwqkkpnbzpolvofnmgk", "yxbhzauysh", "yxbhzauyshgjobzwqkkpnb", "yxbhzauyshgjobzwqkkpnbzpolvofsu", "yxbhzau", "yxbhzauyshgjobzwqk", "yxbhzauys", "yro", "yxbhzauyshgjobzwqkkpnbzp", "yxbhzauyshgjobzwqkkpnbzpo", "yxbhzauyshgjobz", "yxbhzauyshgjo", "yx", "yxbhzauyshg", "yxb", "yxbh", "yxbhzauyshgjobzw", "yxbhzauyshgjobzwqkkpnbzpolvofnmg", "yxbhzauyshgjobzwqkkgoytrziggg", "yxbhzauyshgjobzwqkkpnbzpolvofnmgkn", "yxbhz", "yxbhzauyshgjobzwqkkgoytrzi", "yxbhzauyshgj", "yxbhzauyshgjobzwqkgwuvia", "yxbhzauyshgjobzwq", "yxbhzauy", "ygiowbdv", "yxbhzauyshgjobzwqkkpnbzpolvofnmgknn", "yxbhzauyshgjobzwqkkpnbzpolvofn", "yxbkwvhil", "yxbhzauyshgjobzwqkkgoytrzirtukoy", "yxbhzauyshgjobzwqkkpnbz", "yxbhzauyshgjobzwqkkpnbxpq", "yxbhzauyshgjobzwqkkpnbai", "yxbhzauyshgjobzwqkkp", "yxbhzamvqdwa", "yxbhzauyshgjobzwqkkpnbzpolvof", "yxbhzauyshgjobzwqkkgoytrzirtukoyvw", "y", "yxbhzauyshgjobzwqkkpnbzpolv", "yxbhzauyshgjobzwqkkpnbzpolvo", "yxbhzauyshgjobzwqkkpnbzpolvofnm", "yxbhzauyshgjobzwqkk", "yxbhzauyshgjobzwqkkpnbzpol", "yxbhzauyshgjobzwqjjq", "yxbhzauyshgjobzwqkgwuvi" };
        int L = 39;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case58() {
        String[] names = { "stvvspyjxayijbnjkidqp", "st", "stvvspyjxay", "stvvspyjxayi", "stvvspyjxayijbnjkidqpjm", "stvvspyjxayij", "stvvspyjxayijbnjkidcirpzzqeg", "stvvspyjxayijb", "stvvspyjxalrgbffv", "stvvspyjxayijbnjkidqcylsrfwadevarmsmshpr", "stvvspyjxayijbnjkid", "smntnawmklik", "stvvspyjeblkizm", "stvvspyjxayijbnjkidqpjmxax", "stvvspyjxayijbnjkidq", "stvvspyjxayijbn", "stxssrasoxht", "stvvspyjxayijbnjkikz", "stv", "s", "stvvspyj", "stvvtdsmyqhposn", "stvvsbsuixvxpbtv", "stvvspyjxayijbnjkidqcylsdqafoozu", "stvvspyjxayijbnjk", "stvvvarkl", "stvvspyjxayijbnjkiptjaiiahoih", "stvvspyjxayijbwfh", "stvvspyjxwpcprufpdxjff", "stvvspyjxayijbnjkidqcylsrfwadecqo", "stvvspyjx", "wvtcweog", "stvvspyjxayijbnjki", "stvvspyjxayijbnjkidqpjmx", "stvvspyfbppdw", "stvvspyjxayijbnjkidqcylsrfwade", "stvvspyjxayijbnjkidqpjmzgzkjv", "stxssrasoxh", "stvvspyjxayijbnjkidqcyls", "stvvspyjxayijbnjkidx", "stvv", "stvvspyjxa", "stvvspyjxayijbnjkthhjwgp", "stvvspyjxayijbnjkidqpj", "stvvspy", "stvvspyjxayijbnjkidqpjmxa", "stvvsp", "stvvs", "stvvspyjxayijbnj", "stvvvarklixqx" };
        int L = 27;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case59() {
        String[] names = { "mpvlermltmsylshegfmbpuzbcliwmlsycpm", "mpvlermltmsylshegfmbpuzbcliwmlsycpmhipvln", "mpvlermltmsylshegf", "mpvlermltmsylshegfmbpuzbcliwml", "mogkireezsutpufo", "mphmqsxx", "mpvlermltmsylshegfmbpu", "mpvlermltmsylsh", "mpvlermltmsylshegfmbpuzbcli", "mpvlermltm", "mpvlermltmsylshegfmbpuzbcliwmlsyc", "mpvlermltmsylshegfmbpuzbclimayhjcporqfnp", "mpvlecrnpdf", "mpvlermltmsylshegfmbpuzbc", "mpvlermltmsylshegfmbpuzbcliwmlsycpmhi", "mp", "m", "mpvlermltmsylshegfmbpuzbcliwmlsy", "mpvlermltmsrklhqyxe", "mpvl", "mpvlermltmsylsheg", "mpvle", "mpvlermltmsrklhqy", "mpvlermltmsylshe", "mpvlermltmsylshegfm", "mpvlermltmsylshegfmbpuzylnab", "mpvlermltmsylshegfmbpuzbcliwmls", "mpvlermltmsylshegfmbpuzbcliwmlsycqbqdsvlibilp", "mpvlermltmsylshegfmbpuz", "mpvlermltmsylshegfmbp", "mpv", "mpvler", "mpvlerm", "mpvlermltmsyls", "mpvlermltmsylshegfmbpuzbcliwmlsycp", "mpvlermltms", "mpvlerml", "mpvlermltmsylshegfmbpuzb", "mpvlermltmsylshegfmbpuzbcliw", "mpvlermlt", "mpvlermltmsylshegfmbpuzbcliwmlsycpmhiy", "mpvlermltmsylshegfmbpuzbcliwmlsycpxbmfc", "mpvlermltmsy", "mpvlermltmsylshegfmbwyesl", "mpvlermltmsylshegfmb", "mpvlermltmsyl", "mpvlermltmsylshegfmbpuzbcliwm", "mpvlermltmsylshegfmbpuzbcliwoqp", "mpvlermltmsylshegfmbpuzbcl", "mpvlermltmsylshegfmbpuzbcliwmlsycpmh" };
        int L = 27;
        assertEquals(532559953, similarnames2.count(names, L));
    }

    @Test
    public void case60() {
        String[] names = { "znfufsvwkgumbnjmr", "znfufsvoje", "znfufsvvpcnbgneins", "znfufsvojehljletivwxxbmywrmduqlm", "znfufsvojeh", "znfufsvojehljcfkc", "znfufsvo", "okvqkughio", "znfufsvojehljcfkcr", "znfufsurxdnqxojjtss", "znfufsvoj", "znf", "znfufsvojehljcfkcruvujznhwgqzxjs", "znfuf", "znfufsvojehljletivwxx", "znfufsahlrc", "znfufsu", "znfufsvojehljc", "zbmjthcwtuzrke", "znfufsvojehlbkrp", "znfufsvojehlvmwfshgcxv", "lwpsjaxpmbi", "znfufsvojehl", "znfufsvojehlbkrpihbcgsblhtkwct", "znfufsvojehljcfkcru", "znfufsvojehljyvthd", "znfufsvojehljcf", "znfufsvojehljsedbfqkb", "zn", "znfufs", "znfufsvojehlj", "znfufsvojehljyvthdrbojli", "znfufsvojehljcfkcruo", "znfufsvojehlbkrpqobsdpajgkspfjctazpnhjyixqlufnnrsr", "znfufsv", "znfufsvojehlbkrpinatmeenr", "znfu", "znfufsvojehlbkrpqobsdpajgkspfjctazpnh", "z", "znfufsvojehljcfkcrutdjpawofq", "znfufsvojehcyou", "znfw", "znfufsvojehljcfk", "zubw", "znfufsvojehljletivwxxxsvqjazlwbml", "znfufsvojehljcfkcruos", "znfufsuxnvoihohwaigi", "znfutxgnm", "znfufsvojehlbkrpqobsdpajg", "znfufsvojehlbkrpi" };
        int L = 17;
        assertEquals(839600600, similarnames2.count(names, L));
    }

    @Test
    public void case61() {
        String[] names = { "cso", "csoskimpsmnohhtyipkhgrnrfekag", "csoskimpsmnohh", "csoskimp", "csoskimpsmnohhtyip", "csoskimpsmnohhtyipkhgrnrfekagzxkjqgqn", "csoskimpsmnohhtyipkhgrnrfekagzxksld", "csoski", "csoskimpsmnohhtyipkhgrnrf", "csoskimpsmnohhtyipkhgrnrfekagz", "csoskimpsmnohhtyipkhgrnrfe", "csoskimps", "csos", "csoskimpsmnohhtyipkhgrnrfekagzxksnsyyvgz", "csoskimpsmnohhtyipk", "csoskimpsmnohhtyi", "csoskimpsm", "csoskimpsmnohhtyipkhgrnrfekagzxks", "csoskimpsmnohhtyipkhgrnrfbagylvh", "csoskimpsmnohhtyipkhgrnrfekagzxksldc", "csoskimpsmnohhtyipkhgrnrfeka", "csoskimpsmno", "csoskimpsmnohhtykaouhu", "csosk", "csoskimpsmnohhtyipkhgrnrfvuqdetid", "cs", "csoskimpsmnohhtyipkh", "csoskimpsmnohhtyipkhgrnrfek", "csoskimpsmnohbhacc", "csoskimpsmnohhtyipkhgrnrfekagzxksldcv", "csoskimpsmnohhtyipkhgrnvtujb", "csoskimpssrasmg", "csoskimpsmnohhtyipkhgrnr", "csoskimpsmnohhtyiikdc", "csoskimpsmn", "csoskimpsmnohht", "csoskimpsmnohhtykaouhutfwxbnqq", "csoskimpsmnohhtyipkhgrnrfekagzxksnsyyvgzznovk", "csoskimpsmnohhtyipkhgrnrfekagzxk", "c", "csoskimpsmnoh", "csoskimpsmnohhtyipkhgr", "csoskimpsmnohhtyipkhgrnrucrr", "csoskimpsmnohhtyipkhgrnrfekagzx", "csoskimpsmnohhtyipkhg", "csoskim", "csoskimpsmnohhtyipkhgrnrfekagzxksl", "csoskimpsmnohhty", "cdiem", "csoskimpsmnohhtyipkhgrn" };
        int L = 27;
        assertEquals(494552978, similarnames2.count(names, L));
    }

    @Test
    public void case62() {
        String[] names = { "ygqyotcxtvqcsyr", "ygqyotcxtmo", "ygqyotcxtmoidxut", "ygqyotcxtmoidoyieceufesti", "ygqyotcxtvqcsyjactrbqws", "ygqyotcxtvqcsyj", "ygqyotsxmpdvtgl", "ygqyotcxtvqcs", "ygqyotcxtmoid", "ygqyotcx", "ygqyotcxtmoidxutveu", "ygqyo", "ygqyotcxtmoidxutveuyp", "ygqy", "yg", "ygqyotcxtvqcsyrccmwcqnnavksg", "ygqyotcxtmoidxhktl", "ygqyotcxtmoidxutveuypu", "ygqyotcxtmoidxu", "ygqyotcxtvqcsyjac", "ygqyotcxt", "ygqyotcxtm", "ygq", "ygqyotcxtvqcsyrcvq", "ygqyotcxtmesiqqmifzibm", "ygqyotcxtmoidxutveuy", "ygqyotcxtmoidxujiyby", "ygqyotcxtvqcsyrcc", "ygqyotc", "ygqyotcxtvqcsyrc", "ygqyotcxtvqcsyrcclaznuj", "ygqyotcxtmoidxutveuypuaferjig", "ygqyotcsowjpskbvuwd", "ygqyotcsow", "ygqyotcxtmoidxutve", "ygqyotcxtvq", "ygqyotcxtvqcsyrlunerr", "ygqyotcxtmoidxutv", "y", "ygqyotcxtv", "ygqyotcxtmoidivkax", "ygqyotcgt", "ygqyotcxtvqcsyviuvhkpq", "ygqyotcxtvqc", "ygqyotcxtvqcsy", "ygqyotcxtmoidoyie", "ygqyotcxtmoi", "ygqyotcxtmoidx", "ygqyot", "ygqyotcxtmoidxutveuypumajevfib" };
        int L = 13;
        assertEquals(781006024, similarnames2.count(names, L));
    }

    @Test
    public void case63() {
        String[] names = { "kcwilbdoqanfxkczkpwkh", "kcwi", "kcwilb", "kcwilbdoqanfdkirlujtkxdmhrzswvx", "kcwilbdoqanfxkczmbtnkhzodmyoevip", "kcwilbdoqanfxkczmbtn", "kcwilbdoqanfxkczmbtnk", "kcwilbdoqanfdkirlu", "kcwilbdo", "kcwil", "kcwilbdoqankpmzfhbt", "kcwilbdoqanfdkirlex", "k", "kcwilbdoqanfxkc", "kcwilbdoqanfdkirluj", "kcwilbdoqanfxkczmbt", "kcw", "kcwilbdoq", "kcwilbdoqanfdkirluji", "kcwilbdoqanfxkczm", "kcwilbdoqanfdkir", "kcwilbdoqanfxen", "kcwilbdoqanfdkirlujtkxdmhrzswvxlvztqleueqrid", "kcwilbdoqanfdkirlwwhmnibuhlw", "kcwilbdoqanfdkirlexhpe", "kcwilbdoqanfxkcz", "kcwilbdoqanfxkczmbtnkklkgwerzai", "kcwilbdoqanfd", "kcwilbdoqanfdkirl", "kcwilbdoqanfxkczmbtnkhzodmyoevipxmlfszuukr", "kcwilbdoqanfdkirlujtkxdmhrzswvxhbfthxudrg", "kcwilbdoqa", "kcwilbdoqanfxk", "kcwilbdoqanfxkczmbtnkerxzqg", "kcwilbd", "kcwilbdoqanfdkirlujaankjsurjfouplkonic", "kc", "kcwilbdoqanfdkirlujix", "kjhkdnbxxe", "kcwilbdoqanfx", "kcwilbdoqanfxkczmbtnkh", "kcwilbdoqanfdkirlujaankjsurjfoupl", "kcwilbdoqanfdkirlujixt", "kcwilbdoqanfdklsjbwpww", "kcwilbdoqanfdk", "kcwilbdoqanf", "kcwilbdoqan", "kcwilbdoqanfdki", "kcwilbdoqanfxkczmbtngtaedotlpqsa", "kcwilbdoqanfxkczmb" };
        int L = 10;
        assertEquals(165853970, similarnames2.count(names, L));
    }

    @Test
    public void case64() {
        String[] names = { "mlpk", "mlpkikeoqnhh", "mlpkikeoqnhclqhrezlhn", "mlpkikeoqnhclqmfzyystmcjfcnwz", "mlpkikeoqnhhrgwquhnim", "mlpkikeoqnhclqmfz", "mlpkikeoqn", "mlpkikeoqnhclq", "mlpkikeoqnhclqmf", "mlpkikeoqnhclqmfzyystme", "mlpkikeoqnhma", "mlpkikeoq", "jvuwvqeymc", "mlpkikeo", "mlpkikeoqnhhrgwqu", "mlpkikeoqnhclqmfzyy", "mlpkiyticw", "mlpkikeoqnhclqmfzywpmywdi", "mlpkikeoqnhclqmfzyystmej", "ml", "mlpkiccoqjvjr", "mlpkikeoqnh", "mlpkikeoqnhclqmfzyfg", "mlpkikeovyuigjye", "mlpkikeoqnhc", "mlpkikeoqnhhrgwquh", "mlpkikeoqnhclqmfzywpmywdiovalggue", "mlpkikeoqnhhrgwquhn", "mlpkiccoqjvjrfvfjjwquej", "mlpkikeoqnhclqmfzyystm", "m", "mlpkikeoqnhclqelgrjewuyo", "mlpkikeoqnhcl", "mlpkik", "mlpkikeoqnhclqmfzyys", "mlpkikeoqnhclqmfzy", "mlpki", "mlpkikeoqnhhrgwquhni", "mlpkikeoqnhhrggnzbz", "mlpkikeoqnhhrg", "mlpkikeoqnhclqmfzyyst", "mlpkikeoqnhcluppqlfwjt", "mlpkikeoqnhhrgwqlcsskahqi", "mlp", "mlpkikeoqnhhrgw", "mlpkikeoqnhhr", "mlpkike", "mlpkikeoqnhhrgwq", "mlpkikeoqnhclqmfzypthfi", "mlpkikeoqnhclqm" };
        int L = 23;
        assertEquals(853355262, similarnames2.count(names, L));
    }

    @Test
    public void case65() {
        String[] names = { "gscrugbbxetpl", "gscrugbbfjwxsjcnaihia", "gscrugbbxjxpjjqblequph", "gscrugbbfj", "gscrugbbfjwxsjcqdzpht", "gscrugbthsdczxjkjjb", "gscrugb", "gscrugbbfjwxsjcnaihiwfngfqmh", "gscrugbbxetplmbrhp", "g", "gscrugbbxettzjjybgajil", "gs", "gscrugbbxetplm", "gscrugbbxetplmbqfi", "gscrug", "gscrugbbxjxpjjq", "gsc", "gsw", "gscrugbbfjwxs", "gscru", "gscrugbbxet", "gscr", "gscrugbbfjwxsj", "gscrugbbfjw", "gscrugbbfjwxsjc", "gscrugbbfjwxsjcnai", "gscrugbbfjwxsjcqdzphtcfvapqv", "gscrugbbx", "gscrugbbfjwxsjcqdzphtcfvapqvupvducorolw", "gscrugbbfjwxsjcqdzphtcfvapq", "gscrugbbxetplmbqfimg", "gscrugbbxetplmbqfihfhkvk", "gsh", "gscrugbbxetplmbqfim", "gscrugbbfjwxsjcna", "gscrugbbxetplmb", "gscrugbbfjwxsjcn", "gscrugbbf", "gscrugbbfjwx", "gscrugbthsdczxjk", "gscrugbb", "gscrugbbfjwxsjcnaihi", "gscrugbbxetplmbq", "gscrugbbxe", "gscrugbbfjwxsjcnaih", "gscrugbbxetp", "gscrugoqxvxitxacb", "gscrugoqxvxitxacbngywsb", "gscrugbbxetplmbqf", "gscrugbbfjwxsjcqdzphtcfvapqcijfmidw" };
        int L = 15;
        assertEquals(827302343, similarnames2.count(names, L));
    }

    @Test
    public void case66() {
        String[] names = { "sxixusckjuukcc", "sxixusckjvwewoq", "sxixusckjyez", "sxixusckjuukccmihacgudwdaq", "sxix", "sxixusckjvwe", "sxixusckjvwewowcemroct", "sxixusckjuukccmiha", "sxixusckjvwewh", "sxixusckl", "sxixusckjvwewowcemro", "sxixusckjvwewowlhq", "sxixusckjuukccm", "sxixus", "sxixusckjuukccmihacgudw", "sxi", "sxixusckjvyjuq", "sxixusckjvyju", "sxixusckjvwewowcemr", "sxixusckjuukccmihac", "sxixusckjuuk", "sxixusckju", "sxixusckjuu", "sxixusckjvwewow", "sxixusckjuukccmi", "sxixusckjvw", "sxixusc", "s", "sxixusckjvwewowcem", "sxixusckjvwewo", "sxixusckj", "sxixu", "sxixusckjuukccmihacglo", "sxixusckjve", "sxixusckjuukccmihacglot", "sxixusckjv", "sxixusckjvyjuboj", "sxixusx", "sxixusckjvwewowcemroc", "sxixusckjuukc", "sxixusck", "sxixusj", "sxixusju", "sxixusckjvwew", "sxixusckjvwewowce", "sxixusckjvwewowc", "sxixusckjuukccmih", "sx", "sxixusckjvwewowcecb", "sxixusckjuukccmihacg" };
        int L = 25;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case67() {
        String[] names = { "dqfawgdsyogdo", "dq", "dqf", "dqfawgdvpubbjcfxx", "dqfaw", "dqfawgdsyogdie", "dqfawgdvpu", "dqfawgdsyogdoegq", "dqfawgdsykx", "dqfawgdvpubbjcfxft", "dqfawgd", "dqfawgdvp", "dqfawgdvpub", "stayyw", "st", "dqfawgdvpubbjcfxf", "dqj", "dqfawgdsyog", "v", "dqfawgdvpubbm", "dqfawgdsyogd", "dqfawok", "dqfawgdvpufp", "dqfawgdsyoeb", "dqfawgdvpubmb", "dqfawgdsyo", "dqfa", "dqfawgdsyogdoegqdq", "dqjha", "dqfawgdvpubbjc", "dqfawgdsyoe", "dqfawgdvpubbjcfxxi", "dqfawgdvpubb", "stayo", "dqfawgdsyogdoegqd", "dqfawgdvpubbj", "dqfawgds", "dqfawgdvpubbjcfx", "dqfawgdvpubbjcfxj", "dqfawgdvpubk", "dqfawgdsyogdoe", "dqfawgdvpubbjcf", "dqfawg", "dqfawgms", "dqfawgdsy", "d", "dqfawgdsyogdoeg", "dqfawgdsyogdoegqdql", "dqfawgdv", "stay" };
        int L = 8;
        assertEquals(4201197, similarnames2.count(names, L));
    }

    @Test
    public void case68() {
        String[] names = { "vphfytdzufftyo", "vphfytdzufftfedwrxltscav", "vphfytdzufftyquff", "vphfytdzufftfedwrxltsc", "vphfytdz", "v", "vphfytdzu", "vphfytdzufftfedwrxl", "vphfytdzufftyquffs", "vphfytdzufftyquffsa", "vphfytdzufftyquffsadmc", "vphfytdzufftyquffsad", "vphfdc", "vphfytdzufftyquffm", "vphfytp", "vphfytdzufftfedwrxltsca", "vph", "vphfytdzufftyq", "vphfytdzjo", "vphfytdzufftyqu", "vphfytdzufftyqunk", "vphfytdzufftfedwr", "vphfy", "vphfytdzufftfed", "vphf", "vphfytdzufftyquffsadmch", "vphfytd", "vphfytdzufftfedw", "vphfytdzufftfedwrxlt", "vphfytdzufftfedwrxltscavvda", "vphfytdzufftfedwrx", "vphfytdzufftyquffsadm", "vphfytdzuf", "vphfytdzufftf", "vphfytdzufftfedwrxltscfz", "vphfytdzufftfe", "vphfytdzufftfedwrxltscavvh", "vtw", "vphfytdzuff", "vphfytdzufftct", "vphfytdzufftfedwrxh", "vphfytdzufftfedwrz", "vp", "vphfytdzufftfedwrxltscavv", "vphfytdzufft", "vphfytdzufftfedwrpy", "vphfytdzuffty", "vphfytdzufftyquf", "vphfytdzufftfedwrxlts", "vphfyt" };
        int L = 6;
        assertEquals(295761820, similarnames2.count(names, L));
    }

    @Test
    public void case69() {
        String[] names = { "tgstncqzpqmlxp", "tgs", "tgstncqzpqmlqtziuozic", "tgstncqzpqmlxpijwoo", "ngaxoerdkjpuc", "tg", "tgstncqzpqmlxpijw", "tgstncqzpq", "tgstncqzpqmlxpooqav", "tgstncqzp", "tgstgbnmimnlh", "tgstn", "tgstncqzpqmlxpijwo", "tgstncqzpqmlx", "tgstncqzpqmltzyblnovhns", "tgstncqzpqml", "tgstncqzpqmlxpij", "tgstnxafv", "tgstncqzpqmlxndcirxrgrm", "tgstncqzpqmlxpijwoodjtjmhaws", "tgstnxafvxlbtfzievpzoj", "tgstncqzpqmlxpijwoolgbydwrrmovcjy", "tgstncqzpqmlxpijwoolgb", "tgstncqzpqm", "tgstncqzpqmlxnm", "tgstncqzpqmlxpipuxlkvozjl", "tgstncqzpqmlmnbszq", "tgstncqzpvnzvqwbnoxnw", "tgstncqzpqmlxnmkphw", "tgstncqzpqmlxnmkphwo", "tgstncqzpqmlxnmkph", "tgstncq", "tgstncqzpqmlxpijwool", "tgstncqzpqmlxpijwoolg", "tgstncqzpqmlxn", "tgstncqzpqmlxpijwoolgby", "tgstncqz", "tgstncqzpqmlxpi", "tgstncpr", "tgstncqzpqmlxpijwoolgbyd", "tgstncqzpqmlxpipuxlkvozjlspeq", "t", "tgstncqzpqmlxpijwoodjtjmhawspzufvtshpigy", "tgstncqzpqmloilxgbmokk", "tgstncqzpqmlxpifsffxbd", "tgstnc", "tgstncqzpqmlxnmk", "tgstncqzpqmlxnmkp", "tgstnclapw", "tgst" };
        int L = 31;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case70() {
        String[] names = { "xgehfqbmrpngcem", "xgehfqbmr", "xgehfqbmrpnjcwck", "xgehfqbmulbgfnh", "xgehfqbmrp", "xgehfqbmrpngce", "xgehfqbmul", "xgehfqbmjp", "xgehfqbmrpngcelw", "xgi", "xgehfqbmulbgf", "xgehfqbmrpnjcwwprt", "xgehfqbmulbgfnhaz", "x", "xgehfqbmulbgfnhazawnr", "xgehfqbmrpnjcw", "xgehfqbmulbgfnhazaw", "xgehfqb", "xgehfqbmulbgfnha", "xg", "xgehfqbmrpngcel", "xgehfqbmrpngcelkmin", "xgeh", "xgehfqbm", "xgehfqbmrpngcemozo", "xgehfqbmulgph", "xgehfqe", "xgehfqbmrpnjcww", "xgehfqbmrpngc", "xgehfqbmulbgfnhadmomv", "xgehfqbmulbgfnhadmhq", "xgehfqbmrpng", "xgehfqbmulb", "xgehfqbmu", "xgehfqbmrpngcelk", "xgehfqbmulqe", "xgehfqbmulbgfnhazawdtyc", "xgehfqbmrpngca", "xgehfqbmulbgfnhaza", "xgehfqbmulbgfnhadm", "xgehfqbmrpn", "xgehfqbmrpngcelkf", "xge", "xgehfqbmulbgfnhazawd", "xgehfqbmulbgfnhuz", "xgehfqbmulbgfn", "xgehfqbmrpngcelkfzrk", "xgehfq", "xgehfqbmulbg", "xgehf" };
        int L = 5;
        assertEquals(978958357, similarnames2.count(names, L));
    }

    @Test
    public void case71() {
        String[] names = { "srsy", "srkjcxeyx", "srssvnoujrmqdntuajtn", "s", "srssvnounl", "srssvno", "srssvnounlblc", "srssvnoujr", "srssvnounlblcv", "srssvnounlblcvyqf", "srssvnoun", "srssvnounlblcvyqfyfcceckn", "srssvnounlblcvyq", "sgidv", "sr", "srss", "srssv", "srssvnoujrm", "srssvnou", "srssvnounlblcvy", "srssvnounlblcvyqfyfc", "srssxffa", "sdzvpb", "sdzvpbdptwcg", "srs", "srssvnoujrmqdntuajypjzpo", "srssxffavxpumg", "srssvnoudord", "srssvnoujrmqdnt", "srssvnoujjusgeb", "srssvnounlblcvyqft", "srssvnounlblco", "srssvnoujrmqdn", "srssvnoujrmqdntuajyp", "srssvnounlb", "srssvnoujowfma", "srssvnounlblcvyqfyf", "srssvnoujrmqdntuaj", "srssvnounlbl", "sdzvpbdpt", "srssvnouj", "srssvnoujrmqd", "srssvn", "srsjsz", "srssvnoujrmqdntua", "srsyzoaw", "srssvnounlblcvyqglrz", "srssvnoujrmqdntuajy", "srssvnoujrmqdntu", "srssvnoujrmq" };
        int L = 13;
        assertEquals(198670219, similarnames2.count(names, L));
    }

    @Test
    public void case72() {
        String[] names = { "ddrgafnrx", "hihu", "ddrgafnrxpxqiln", "hihubfeturt", "hihubfeturvfusurldca", "hihub", "p", "h", "hihubfxgvdpcldp", "ddrgafncnjhcnwiuakskgukpjo", "hihubfe", "hihylehh", "ddrg", "hihbedjmcq", "hiwmjgnyfi", "he", "palyx", "ddrga", "d", "dd", "palyxmrwwab", "ddrgafnr", "pgntje", "hihubfeturto", "hihubfetur", "ddrgafnrxpxqililart", "hihuldiewwizp", "hihubf", "ddrgafnrxp", "hihubfet", "hih", "hihbedjmcqpjhckknpxx", "ddrgafnrxpxqi", "ddr", "hihubfetefwsf", "hiwmjgny", "hihvciqw", "hihbedj", "ddrgafnrxtnb", "ddrgafn", "ddrgafavhgigd", "hihuldiewwizpkdfwi", "hihbedjjydpem", "hihubfetu", "ddrgafnrxpx", "ddrgaf", "ddrgafnrxpxqil", "ddrgafncnjhcnwiua", "hi", "ddrgafnrxpxq" };
        int L = 9;
        assertEquals(258821703, similarnames2.count(names, L));
    }

    @Test
    public void case73() {
        String[] names = { "jmhsgapbkxwpjaa", "jmhsgapbkxwpja", "jmhsgapbkxwp", "fjjexeyq", "fjjexeyqxmupfmfeazhuusg", "fjjexeyqxmupfmfeazhuusgpku", "fjjexeyqxmupfmfeazhuusgoymg", "jmhsg", "jmhsgapbkx", "jmhsgapbk", "jm", "fjjexeyqyqjx", "j", "fjsrxchcfz", "jmhsgapbkxnqwr", "jmhsgapbkxwpjaaephy", "fjjexeyqx", "jmhsgapbkxwgftw", "jmhsgapbkxwpjczswejebperq", "fjj", "jmhsgapbkxwpjaae", "fjjexeymx", "fjjexeyqxmupfmfeazhuusgnvyk", "jmhsgapb", "fjjexeyqxmud", "jmhs", "fjjexeyqxmudus", "jmhsgapbkxwpjaaeph", "jmhsgapbkxwpjczswe", "fjjexe", "fjqdgbtn", "jmhsgodbrpypehqg", "fjjexeyqxm", "fjjex", "jmhsgap", "fjjexeyqxmu", "jmhsgapbkxwpj", "jmhsgapbkxwpjr", "jmhsgapbkxw", "f", "jmhsgapbkxwpjasrdvdccxdg", "fjjexey", "jmhsga", "fjjachqcyge", "fjjexeyqxmudu", "jmh", "fj", "jmhsgapbkxwpjaaep", "fjje", "jmhsgapbkxwpjtvv" };
        int L = 2;
        assertEquals(877179521, similarnames2.count(names, L));
    }

    @Test
    public void case74() {
        String[] names = { "txutwcpzpzbqpunynrmdmrvgkgu", "vewanyzncsew", "vewaphjciycigydmii", "txusa", "txusaxrpazoeiwclinaqmeprianb", "vewapvfxfj", "txuohklsmzaq", "t", "txusaxrpazoeiwclin", "txusaa", "txutwcpzpzmdjhepctx", "txusjc", "txutwcpzpz", "txusaaznaah", "txusaaznaahv", "vewapvf", "txusaazna", "vewapvfxhlwqoij", "vewapvfxhk", "txusaaznaahvyrgvgdgvgrqsxrafts", "vewapv", "vewa", "vew", "vewapvfx", "txu", "vewapvbsaaugimebtzoh", "txusaazn", "txusaxrpazoeiwclinaqmeprianbkidycqnwsfiwuz", "v", "trhlwrtbsyth", "vewapvfxh", "vewapwvcwerfyosl", "vewaptv", "txusaaznaxjncjumep", "txusaaznaahvyrgvgdgvgrqsx", "vewaphjciycigydmiiuhqcnqv", "vewxwydrhhzc", "ve", "vewap", "txusaaznaa", "vewapvfxfjoinsbkgid", "tx", "vewapvfxhkt", "vewaphjciycigydmiiuhqcnqvgljfrc", "txusaaz", "txus", "vewapvfkanidpezr", "vewapvbsaa", "txutwcpzpzbqpunynrmdmrvgk", "vewapvfxhv" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case75() {
        String[] names = { "zjibwdnqxtt", "zjibwdnqxasyah", "ykkovsajym", "zjibwdnqx", "zjibwdn", "zjibwdnqxttfot", "ykkovsajymeumer", "zjibwdnqxsz", "zjibwv", "zjibwdnqxttfotw", "zjibwdnq", "ykkhqwzop", "y", "ykkovsajymekizfpwnbo", "ykkovsajymeumuklu", "zji", "ykkovsajymeumukluwu", "ykkovsajymekizfpwnboetccg", "ykkovkoovkk", "ykkovsajymeumuk", "ykkovsaj", "ykkovsajymeumukl", "zjv", "ykkovsa", "ykkovsajy", "zjibwdnqxt", "zjibwd", "zjibwdnqxttfo", "zjvjef", "zj", "zjvjeffy", "ykkovsajyme", "zjibwdnqxttf", "ykko", "ykkovsajymeumu", "ykkovsajymqy", "ykkovsajymeumukluw", "ykk", "ykkovsajymeu", "ykkov", "zjibw", "ykkovs", "zjibwvw", "ykkovsajymekizf", "zjibwdnqxttfotwrylbc", "yk", "zjib", "ykkovsajymeum", "zjibwdnb", "z" };
        int L = 22;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case76() {
        String[] names = { "bprgijxtezs", "kdaywsobsmecphjzbfr", "kdaywsobsmecpowhr", "bprgiwgpgrs", "bprgxpeh", "bprgijx", "kdaywsobjkbmz", "bprgijxcgyasdc", "bprgijxcgyas", "kdaywsobsmecpkxdre", "b", "bprgijxcgyasdctmpgtp", "bprg", "k", "kdaywso", "bprgijxcgyasdct", "bprgijxcgya", "bpr", "kdaywsobsmec", "kdayw", "kdaywsobs", "bprgijxcgy", "bprgijxcg", "kdaywsobsmecpkxdreheex", "bprgijxcgyasd", "kdaywsobsmecpkxdr", "kdaywsob", "kdaywsoboqlui", "kdayws", "bprgi", "kdaywsobsm", "bprgijbcktnap", "kdaywsobsmess", "kdaywsobsme", "kd", "kdaywfddn", "kdaywsobsmecpkx", "kdaywsobsmejgdlzi", "kdaywsobsmecpkxdrep", "kdaywsobsmecpk", "bprgij", "bp", "kday", "bprgijxcgyasdctz", "kdaywsobsmecpowhrkqlnvyq", "kdaywsobsmecpkxd", "kdaywsobsmecpwo", "bprgijxc", "kdaywsobsmecp", "kda" };
        int L = 3;
        assertEquals(569604960, similarnames2.count(names, L));
    }

    @Test
    public void case77() {
        String[] names = { "xxwtezegnfoyflghobw", "wizbtnysyms", "wizbf", "xjwqyo", "x", "xxwtez", "xxwtezegnuvsrsmomqg", "xxw", "xxwtezegnf", "wizbtkujflbtjuhqztqvxaj", "xxwte", "xxwt", "wizb", "xxwtezegnuvsrsm", "xitr", "xxwtezegnuvsrsmrzuvsgpgumcjoup", "xxwtezegnuvsrsmrzuvsgpg", "wizbtnysy", "wizbtnysirplsglg", "wizhyrmg", "wizbtkujflbtju", "xxwtezegnsyo", "xkrbk", "mkauchoe", "wizbtnyzxdf", "xxwtezeg", "xxwtezegnfoyflghobwt", "wizbt", "xxwtezegnfo", "wizbtnysyprfxlrblcu", "xxwteze", "wi", "xxwtezegn", "xxwtezrciwwuah", "wizbtnysyg", "wizbtnyz", "xxwtezwbg", "bnjou", "wizbtn", "xxwtfsmwiyegtynap", "wizbtny", "w", "wizbtnys", "mkauchoejtyow", "wizbtnysydxxqwnepvo", "kndzr", "wiz", "xxwtfsm", "wizbtnysygsegatlgzjj", "xx" };
        int L = 17;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case78() {
        String[] names = { "w", "whwrvoc", "k", "whwrvochnk", "wh", "kddisfkgdutyhu", "kdd", "kddisfvb", "kddisfvbr", "kdc", "kddisfkgduto", "kddisfkgdutyg", "t", "whwrvochn", "kddp", "kddisfkgdutyhan", "whw", "kddisfkgdutyha", "whwb", "whwrvochnnai", "whwrvochnn", "kddisf", "kddisfkgdutyhaw", "kddis", "kddisfr", "whwr", "whwrvo", "kd", "kdl", "whwrv", "kddisfkgdutq", "kddisfkgdu", "kddisfkgd", "whwrzs", "kddisfkgdut", "kddisfk", "kddisfkgdutyh", "kddisfke", "whwrvoch", "whwrz", "kddisfkgdutyhv", "kddisfkgduty", "kddi", "kddx", "whwrvochnnaip", "whwri", "kddisfkg", "kddisfv", "whwrir", "whwrvochnna" };
        int L = 3;
        assertEquals(711529687, similarnames2.count(names, L));
    }

    @Test
    public void case79() {
        String[] names = { "qtefbnxopafkqcqrln", "qtefbnx", "qtefbnxopafkqcqpjlplmkoe", "qtefbnxopaa", "qtefbnxopafkqcqputoslb", "qtefbnxg", "qtefbnxo", "qtefbnxopafkqcqqbjvsl", "usnmwomgbc", "u", "usnmwomg", "qte", "usnmwomgb", "qtefbn", "usnmwomgbcn", "us", "usgmt", "qtefbnxopafkqcqqbjvvvmy", "qtefbnxgphy", "qtef", "qtefbnxnvoxn", "usnmwom", "usnmwvzpj", "qtefbnxopa", "qtefb", "ubxykfr", "qtefbnxopafkqcqrlnkfgj", "qtefwehrg", "qtefbnxopafk", "qtefbnxopafkqcqqbjv", "qtefbnxopafkqcq", "qtb", "umwexiqno", "uvbqgsj", "qtefbnxop", "qt", "qtefbnxopafkqcqp", "usnmw", "qtefbnxopafkqcisxog", "usnm", "usnmwo", "q", "qtefbnxopafkqchitbvu", "qtelileoiku", "usnmwomgbco", "qtefbnxopafe", "qtefbnxopaf", "qtefbnxopafkq", "qtefbnxopafkqc", "usn" };
        int L = 8;
        assertEquals(133744723, similarnames2.count(names, L));
    }

    @Test
    public void case80() {
        String[] names = { "vbotfgss", "vbotfgssnytypseu", "vbo", "vbotfglyvin", "oqpxrinikstifgwevr", "oqpxrinikstifgw", "oqpxrinikst", "vbotfgssnyicq", "oqpx", "oqpxr", "oqpxrinik", "vbotfgssnyicqxbh", "o", "vbotfgssnyicqxb", "oqpxrin", "vbotzmu", "a", "vbotfmqfxjf", "vbot", "oqpxrinikstifgwex", "v", "oqpxrinikstifgwexgd", "vbotfg", "oqpxrinikstifgwexg", "oqpxrinikstifg", "oqpxrinikstif", "vbotfgssnyi", "vbotfgs", "oqpxrinikstifgwexgdl", "vcpdcqlje", "vbotfgssny", "oqpxriniks", "oqpxricnq", "oqpxriniksti", "vbotfgssnyicqxbdmxlmi", "oqpxrinikstifggejl", "oqpxrinikstifgwe", "oqpxrsxnr", "vbotfgssn", "oqpxrini", "oqpxrinikstifgsgl", "vbotfgssnyic", "oq", "vbotfgjlgm", "oqp", "vbotfgssnyicqx", "oqpxri", "oqpxlcor", "vb", "vbotf" };
        int L = 4;
        assertEquals(11890492, similarnames2.count(names, L));
    }

    @Test
    public void case81() {
        String[] names = { "pahvdiwqldcqaiww", "pahvzmo", "ppoxd", "pahvdiwqi", "kbjiqdxyl", "pahvdgmwez", "kbjiqdxylbqpvnqwffxa", "pa", "kbjikbqf", "kb", "pah", "pahvdiwql", "k", "kbjiqdxylbq", "pahvdiwqdy", "kbjmkzkrrugjj", "pahvdiwqlddifhni", "pahvdiwqldc", "kbjiqdxylbqpv", "kbjiqdxylb", "kbjiqdxy", "ppoxdso", "kbjiqdxylbqpvnqwffxxj", "pahvdiwq", "kbjiqdxylbqp", "kbjiqdxylbqpvnq", "kbjiqdyebw", "kbjiqdxylbqpvnqwgv", "pahv", "kbjiqdx", "kbjiq", "kbjiqdxylbqpvnqwff", "p", "pahvdiwqld", "kbjiqdxylbqpvnqwffeu", "kbjiqdxylbqpvnqw", "pgxtf", "kbjiqdxylbqpvnqwf", "kbjiqd", "pahvd", "kbjiqdxylbqpvnqwffj", "kbjiqdy", "kbj", "kbji", "pahvdiw", "pahvdiwqlddi", "pahvdi", "kbjiqdxylbqpvnqwffx", "kbjmkzkr", "kbjiqdxylbqpvn" };
        int L = 17;
        assertEquals(86643322, similarnames2.count(names, L));
    }

    @Test
    public void case82() {
        String[] names = { "xido", "xcovnakhb", "b", "glpyitxhy", "vpnlvwuc", "blmdyzs", "inj", "jxh", "aiq", "vpnl", "xco", "q", "xcovna", "jxg", "lkcudyd", "rdtdjleutlbt", "rdtdjle", "injtihvrm", "xcol", "blnem", "lkc", "vfhwdr", "xe", "i", "glpyitxi", "injtihvrjrprn", "pfh", "blgc", "rdtdrnp", "bl", "xedppgb", "jx", "rdtd", "xedppg", "rdtdrn", "ih", "glpyi", "vfhw", "sgjxr", "injtihvr", "e", "xedppgbslxjm", "injtihvrmnxwz", "pkf", "igvv", "vpnlfbpu", "zqm", "qnhit", "qyg", "adbc" };
        int L = 3;
        assertEquals(467137146, similarnames2.count(names, L));
    }

    @Test
    public void case83() {
        String[] names = { "tdyd", "majh", "xtrjvgymhz", "zjnrmfrhc", "evtxbvg", "ncvfd", "chgzybjy", "go", "fnd", "m", "ohr", "sf", "bdgcxx", "gcadpv", "gc", "z", "oxwanfmcp", "gwxtbuqjgh", "xtrjv", "ma", "ncvfdnkkd", "zjn", "jaij", "oxw", "zch", "gcwtif", "ncvfdobft", "fl", "g", "yrxv", "hwvqzqmydh", "tmac", "tdydx", "gx", "c", "bdgcx", "chgzy", "hwvqz", "gxb", "xiddg", "bdgcxrr", "ev", "cs", "hwvqzqm", "argmp", "jaijisc", "jvl", "kyc", "epc", "gwx" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case84() {
        String[] names = { "fpviellnckj", "fpv", "hvdgy", "tgorqjlk", "acfr", "hvdgyzx", "awz", "zr", "srcjjhpfwfv", "baav", "srcepjdex", "baa", "bfqpy", "x", "ebapexfpjyntqeqs", "abpejvgypbqfg", "ebapexfp", "hvdgybnmicxuj", "tgorqj", "abp", "lrsgw", "bfqpyna", "cjzv", "srcjjhpfw", "shwwvger", "eb", "rg", "gqc", "omfq", "otnmuzc", "tpxat", "ebapexfppdz", "tgor", "zybry", "c", "abpejv", "ebapexfpy", "cmc", "bfqpyqmsq", "otnm", "b", "src", "hvdgyb", "sz", "tgorqjlkt", "t", "snvvf", "hvdgybj", "bdz", "shw" };
        int L = 5;
        assertEquals(472639410, similarnames2.count(names, L));
    }

    @Test
    public void case85() {
        String[] names = { "agnt", "r", "fbw", "npvmo", "lfkl", "cob", "kzh", "aahg", "gjai", "aahgthz", "mkdpzlwmat", "znja", "q", "lfklputtuku", "pcq", "lfklputtukuqoa", "z", "hu", "jruc", "mkdpz", "uksh", "ry", "lfkldpqjke", "ryrnclndqq", "za", "lwwlzlbqeuw", "npvmotydpxfvf", "fb", "dyf", "k", "dyfaegck", "hupo", "pmpl", "hbenf", "xz", "lwb", "t", "lw", "oul", "ktkodtmsh", "hbenfek", "u", "kjxn", "xuao", "hbenftewpqqrqe", "w", "hujcjz", "rcie", "ptkuk", "ktkodtmshceald" };
        int L = 2;
        assertEquals(930858136, similarnames2.count(names, L));
    }

    @Test
    public void case86() {
        String[] names = { "wdmw", "uiczkru", "skm", "s", "ycmjhpurxckhmvadvj", "skmuerm", "uic", "rcqe", "vg", "skq", "vgdzzz", "nchqxlnpidghti", "lucxjo", "xmbt", "hniz", "g", "zwkt", "capl", "lucxjrrahwfet", "nchqxlnpidght", "r", "cl", "vgdzzzgxb", "fb", "vbmm", "ykcx", "xj", "dezg", "femj", "pdjbt", "ycmjhdxxc", "ttrx", "dapnv", "nchqx", "lucx", "ycmjh", "wt", "dap", "ycmjhdxxceyvhpmgskka", "xq", "woh", "xqbbn", "wdm", "a", "mcu", "wtppwd", "pe", "wtpxfgwhqdwo", "docr", "o" };
        int L = 2;
        assertEquals(422582854, similarnames2.count(names, L));
    }

    @Test
    public void case87() {
        String[] names = { "netmrdrgj", "netmjqory", "hcsis", "prlp", "lhgmtwyotpqyniyncyqttbsvvlvk", "eyalhfsclyjozmn", "dbqzlptzocmjxppz", "prlpcclonakpnphtpmarashyevuddatuu", "ykowkrrs", "rvilm", "fxtvygtureiibhbyff", "ourmvsgsiul", "edncxoelancaavldcyhtegh", "qi", "lhgmt", "n", "ykbd", "yk", "lhgmtowzpfqzaw", "ourm", "vp", "vqo", "dbqz", "dbqzlptz", "fxtv", "vqoqexfnxljsfnc", "fxtvhkxymzsuuewuvs", "eoosn", "vg", "edncxoelancaavldcy", "exqy", "vgh", "bg", "prlpcclonakpnphtpm", "prlpcclonakpnphtpmb", "netmjqoryuvi", "netmdfvstdervlwa", "netmrdrgjmluxigorsscgy", "edncxoelancaavldcyasgv", "nmelme", "netm", "netmjqoryyredfhsxmljpyntlbgnl", "ey", "netmjqoryyredfhsx", "lhgmtwyotpqyniync", "ednc", "ykbdp", "lhgmtez", "i", "eyrwyqvweoowmbek" };
        int L = 2;
        assertEquals(353440983, similarnames2.count(names, L));
    }

    @Test
    public void case88() {
        String[] names = { "chm", "dgos", "njgnj", "lt", "ehty", "jda", "rfl", "fz", "m", "kf", "zp", "bkh", "heab", "xis", "exgda", "sui", "wpgby", "njgnjz", "vfe", "kflo", "oyvay", "inpczy", "brnd", "inpcz", "bkq", "vbito", "vbi", "iv", "wfdg", "gt", "ehtyc", "kfl", "bkv", "bk", "pzij", "njgnjzz", "vbio", "njgnjzl", "vfep", "hdq", "vfeh", "vbit", "kflm", "uzuef", "ehtycl", "lyxdi", "hdqw", "kflmk", "vbib", "chms" };
        int L = 3;
        assertEquals(617575408, similarnames2.count(names, L));
    }

    @Test
    public void case89() {
        String[] names = { "ck", "lehnx", "tzzo", "hnp", "fguaq", "jmk", "oue", "n", "ppdr", "safuxwffanu", "p", "zjedqwhpeipkkt", "safux", "bhvl", "jodb", "mo", "g", "aiz", "vppl", "niqhi", "lsnzunlrdztwib", "nbqe", "c", "hf", "safuxycwchtb", "safuxycw", "th", "sxoc", "xcft", "ixj", "snrtk", "hnpebd", "zac", "zjed", "fvezqhiexpscxfwaycp", "nbqeh", "a", "d", "jgd", "ukysk", "hfpv", "ou", "fve", "jmkbxiuvqvx", "fvezqhiexpscxf", "lsnzu", "fezgz", "mb", "u", "wav" };
        int L = 3;
        assertEquals(539191805, similarnames2.count(names, L));
    }

    @Test
    public void case90() {
        String[] names = { "yhuxjpdaiekfqkyi", "cs", "tgqo", "tpowphazosmpc", "jvdap", "jqms", "dutzvqzuu", "odner", "ii", "wxf", "dch", "w", "jzd", "iezbt", "b", "t", "bq", "hczkc", "d", "ttujahbs", "tpo", "v", "menj", "sv", "tjz", "oy", "xzco", "lcd", "pu", "tjzggsjzkfhr", "oxh", "g", "mwffxjukp", "gyt", "mwfegrgzat", "dchg", "gythaj", "khnxp", "nw", "jzdyqrziwkarsel", "cvf", "khn", "fr", "bqnyzgxi", "fqfvn", "yhuxj", "hqph", "lcdticrjkqsnn", "yhuxjqvgdrafmse", "mwf" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case91() {
        String[] names = { "xabulv", "qsfmwmke", "qsfmu", "pnjed", "gyc", "pnjedsadgl", "ffzgathu", "ffz", "qsfm", "pnjedigek", "xxtiyb", "w", "nusr", "crhcpfyus", "ynod", "ojlr", "wu", "wzsqra", "cfkcrf", "aaa", "xa", "ffzg", "cfk", "qsfmutmm", "iceow", "crhc", "theon", "nlbmuo", "nrdeu", "x", "iceowmbqif", "nbqjv", "pnjevnv", "uvv", "qsfmildt", "k", "xeu", "q", "uvvegj", "crh", "bcho", "pnjevn", "svn", "nrdeumadl", "cfkc", "t", "nlb", "qsfmyj", "crhcf", "pnje" };
        int L = 4;
        assertEquals(741412713, similarnames2.count(names, L));
    }

    @Test
    public void case92() {
        String[] names = { "b", "bbbab", "bbbba", "aabba", "aa", "babb", "bbbbb", "bbaab", "abab", "ab", "aab", "bbbb", "aaba", "aaaa", "aaa", "baaab", "abbbb", "aaabb", "aaab", "aabbb", "baaaa", "bbba", "bbaa", "bbb", "aaaaa", "bb", "abbab", "baaa", "baaba", "bbab", "abba", "a", "bba", "abbb", "baba", "bab", "ba", "abaab", "abb", "bbbaa", "aabab", "aba", "aabb", "bbaba", "abaa", "baabb", "abbaa", "abbba", "baab", "baa" };
        int L = 4;
        assertEquals(175619951, similarnames2.count(names, L));
    }

    @Test
    public void case93() {
        String[] names = { "aa", "ab", "abbaa", "aabbb", "ababa", "aaaab", "bbaba", "aaaa", "aab", "a", "abba", "bbbb", "aaa", "baba", "abb", "bbbab", "bbbbb", "bb", "abaab", "aabab", "abaa", "aaba", "baaaa", "baa", "bbbaa", "abbba", "aaabb", "abab", "abaaa", "baaba", "bbba", "b", "bba", "abbb", "bbbba", "aba", "baab", "babb", "bbab", "babab", "ba", "bab", "aabb", "baaa", "aaaba", "ababb", "baabb", "aaaaa", "abbbb", "bbb" };
        int L = 2;
        assertEquals(806185308, similarnames2.count(names, L));
    }

    @Test
    public void case94() {
        String[] names = { "abab", "baa", "aabba", "abbb", "baabb", "ab", "aaba", "aaa", "b", "bbbb", "abb", "aaaaa", "bab", "aabb", "ba", "bbba", "aaaab", "bbabb", "bbbba", "bbab", "abba", "bbaba", "aab", "baaab", "aaaa", "aaab", "babb", "aba", "aabaa", "bb", "bbb", "bbaa", "abbba", "baab", "babaa", "baba", "bba", "abbaa", "abaa", "babba", "aaaba", "bbbab", "abbab", "aabbb", "abaaa", "baaa", "aabab", "a", "aaabb", "aa" };
        int L = 2;
        assertEquals(806185308, similarnames2.count(names, L));
    }

    @Test
    public void case95() {
        String[] names = { "baaba", "abab", "bbbb", "aaa", "baaab", "ababa", "babab", "aaba", "aaab", "bb", "abbaa", "bbb", "b", "bbbaa", "babb", "bbba", "aab", "aabb", "abaa", "aabba", "aaabb", "aa", "bbbba", "aaaab", "abaaa", "abbab", "ababb", "bbbbb", "bbaba", "bab", "baab", "babba", "bbbab", "abb", "aabbb", "baaaa", "aabab", "abbbb", "bba", "ba", "aba", "abbba", "aabaa", "abba", "bbab", "baaa", "baa", "ab", "a", "bbaa" };
        int L = 4;
        assertEquals(951381833, similarnames2.count(names, L));
    }

    @Test
    public void case96() {
        String[] names = { "babbb", "bab", "aaba", "baaaa", "babaa", "bbbb", "baabb", "bbaaa", "baaab", "bb", "aaaa", "babab", "baa", "baab", "a", "bba", "aaa", "ab", "aaaaa", "abbbb", "bbab", "bbb", "aba", "aabaa", "aaaab", "babb", "baaa", "aabab", "aabba", "bbaa", "baaba", "baba", "aabbb", "aab", "ba", "abbba", "bbbab", "bbba", "bbaab", "aaabb", "abb", "bbabb", "b", "abba", "abbb", "aaab", "bbbba", "aabb", "aa", "abab" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case97() {
        String[] names = { "baca", "acac", "cca", "acaa", "ccb", "bb", "abbc", "bbcab", "baaa", "acb", "a", "b", "bcb", "aacc", "c", "bbaa", "abb", "abbbc", "bcccc", "bbcaa", "ccabb", "ccab", "aa", "ba", "cbcaa", "abcbc", "aab", "bacbb", "cbbb", "aabab", "abaa", "cb", "cabba", "ab", "cbc", "baa", "aabc", "bc", "cac", "bcaa", "abcaa", "caa", "aabb", "abca", "cc", "accba", "baacb", "cbba", "acbcc", "bacb" };
        int L = 5;
        assertEquals(472639410, similarnames2.count(names, L));
    }

    @Test
    public void case98() {
        String[] names = { "acac", "aaab", "bcb", "acacb", "bacbc", "c", "bcc", "aabc", "bacab", "baab", "baca", "bba", "abc", "cac", "cca", "bbaa", "baccb", "ba", "cbca", "cb", "bb", "cc", "a", "bcbba", "ac", "bbbab", "aa", "ccacb", "ca", "b", "cbcab", "bca", "acb", "ccc", "aaa", "bbcb", "bc", "cbc", "cab", "abbcc", "ab", "cbbc", "acbb", "bccb", "bab", "caaa", "acbc", "abaca", "cbbbb", "acaba" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case99() {
        String[] names = { "cca", "bcaa", "ab", "ccc", "acabb", "cbcac", "aaacc", "bbcab", "a", "babcb", "b", "aabca", "baaa", "abbc", "abbbc", "ccaa", "cbcb", "aabaa", "aacb", "baa", "aba", "ccb", "bbccc", "bb", "acc", "acaa", "ca", "abc", "aa", "cbca", "aaa", "c", "acca", "aacaa", "bcbba", "cc", "cac", "abca", "cbbc", "abb", "cbaa", "cb", "bacc", "cab", "bcb", "ba", "ccaab", "bccb", "ccbca", "ccca" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case100() {
        String[] names = { "abacc", "ccb", "aaac", "aa", "c", "aabb", "bc", "cbbcc", "abbab", "bba", "b", "bccbb", "ccac", "cbcb", "ccccc", "bbaa", "ca", "cccb", "bb", "abaa", "acaaa", "aab", "caba", "bbab", "bca", "acc", "aaaa", "babb", "a", "caabb", "baacc", "bac", "bab", "ba", "aaaba", "acbbc", "aabaa", "ccba", "ac", "cac", "abcba", "aacb", "abac", "cccaa", "bcabc", "bbcac", "cbcca", "aaccc", "cbac", "cc" };
        int L = 3;
        assertEquals(934274292, similarnames2.count(names, L));
    }

    @Test
    public void case101() {
        String[] names = { "acb", "aacc", "cbb", "cb", "a", "bcca", "ca", "ba", "bbb", "abaaa", "cab", "aaac", "aaaa", "abcc", "babaa", "bbbc", "bb", "c", "aab", "b", "caac", "acc", "bba", "acabb", "acaac", "cbcba", "abbab", "ccca", "abc", "aa", "baba", "cca", "acbbb", "acbc", "baa", "ab", "cbbb", "bbcac", "cbbc", "ccaba", "cc", "bc", "acaca", "cabbb", "cbaa", "ababa", "bcbac", "abaa", "acaaa", "aaaba" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case102() {
        String[] names = { "bb", "bcba", "c", "ccbc", "ccbca", "dd", "aabc", "a", "cc", "ba", "bccab", "bddb", "bbcd", "adabc", "dacc", "ddba", "dcb", "cab", "d", "baac", "adaad", "b", "dc", "cbdca", "cacac", "cdb", "db", "bccd", "cdbc", "dcaa", "dbadc", "dbbcd", "aa", "bca", "ad", "aac", "dcbb", "bddad", "cacb", "ddcad", "bcbb", "bcc", "da", "bbddc", "addbc", "acb", "accbc", "bcac", "bdd", "cbddd" };
        int L = 3;
        assertEquals(699123483, similarnames2.count(names, L));
    }

    @Test
    public void case103() {
        String[] names = { "acadb", "b", "bcac", "cdcb", "bdc", "aacc", "cbaa", "dba", "daab", "bc", "abbd", "cb", "adac", "cbbd", "aaa", "bac", "d", "a", "daa", "dca", "ad", "cdb", "cdaa", "cdac", "abdbd", "ccb", "abcc", "dbd", "cbcad", "da", "cdc", "ccbc", "aa", "bdb", "bbdd", "cbdcc", "cdd", "ca", "ccddb", "cbbb", "ddbb", "babdd", "c", "dada", "abac", "bcab", "ab", "aadb", "ccabd", "dcabb" };
        int L = 5;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case104() {
        String[] names = { "dbadd", "acd", "ccdb", "ba", "caddb", "bb", "caad", "acacb", "bda", "a", "ab", "dc", "cc", "aabdb", "cbaca", "bba", "cbb", "cbca", "cdc", "bdbbb", "acdbd", "c", "cacc", "abada", "dbd", "dd", "ddb", "ad", "aaaab", "aa", "d", "db", "adb", "dab", "adabd", "bd", "daaad", "abdac", "bbb", "cbad", "bdaa", "abda", "cb", "da", "b", "bbc", "ddcd", "bbd", "bdb", "bbbda" };
        int L = 6;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case105() {
        String[] names = { "dbd", "cdb", "ac", "a", "adcda", "bbbdc", "b", "bbaad", "bcca", "bada", "abad", "bdacb", "bbcb", "cdcba", "baab", "dccd", "cca", "aba", "bcccc", "ccac", "daacd", "aadc", "cbd", "dbdcd", "cc", "bcbcc", "bacdd", "d", "dac", "bcdcd", "ca", "dcddb", "bca", "dca", "bddcd", "bdbd", "cdcbc", "cd", "dbdb", "ddc", "aabd", "dcaa", "cccb", "ddd", "caacc", "bdac", "dda", "ddbc", "daab", "c" };
        int L = 6;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case106() {
        String[] names = { "ca", "ddb", "c", "ad", "dca", "bbccd", "abd", "cbad", "babb", "bacad", "dd", "ccc", "ddbcc", "cda", "dbc", "ac", "bcdd", "cb", "a", "d", "babdd", "db", "add", "da", "ccaac", "ba", "aca", "cbcd", "ada", "bbdb", "cab", "aadbc", "aa", "bddcd", "dc", "daadc", "dddbd", "bcd", "cc", "bc", "bd", "bcc", "bdada", "cbb", "cad", "cadc", "b", "bbbb", "bab", "ccdc" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case107() {
        String[] names = { "dbecc", "e", "eeada", "eba", "cee", "d", "aaaac", "ccd", "abe", "abbde", "ed", "addb", "ecbdd", "ecce", "bcc", "cd", "ebe", "dbd", "cba", "aabbd", "dc", "aaabb", "dea", "dabdb", "aed", "dbea", "dbee", "c", "bb", "bcbaa", "dbda", "cabe", "eac", "da", "ee", "acdb", "cac", "dad", "eaaee", "caab", "b", "ddc", "a", "eb", "aeedc", "cdbe", "bcbee", "be", "ddbce", "ccbc" };
        int L = 1;
        assertEquals(318608048, similarnames2.count(names, L));
    }

    @Test
    public void case108() {
        String[] names = { "eaa", "aaccd", "cbab", "cedca", "acda", "cb", "dad", "ca", "ae", "eeeb", "cddde", "ebecd", "cece", "dcdce", "bdad", "add", "ecebb", "ebd", "eb", "abd", "deab", "bde", "aecce", "bedaa", "a", "eac", "aebab", "c", "bbe", "eed", "e", "aeded", "bbeba", "baea", "acba", "eea", "cc", "bbbe", "deeb", "ebb", "aea", "caed", "eeabd", "ccdc", "ceca", "baac", "b", "cbb", "edec", "daab" };
        int L = 4;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case109() {
        String[] names = { "ca", "cdacd", "bdac", "bcec", "bebdd", "edd", "adb", "cdab", "bae", "aaeca", "edbbe", "bab", "eacbd", "cceb", "baaa", "d", "c", "cd", "dd", "bcae", "ebd", "ebc", "dadb", "bbb", "ceacb", "adbcd", "dce", "dab", "bbe", "ccece", "bda", "ccdea", "cecea", "eccb", "e", "be", "a", "cbb", "cde", "ab", "b", "cbc", "ad", "eaa", "dc", "daac", "bbda", "ababc", "da", "ba" };
        int L = 6;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case110() {
        String[] names = { "ebac", "daeac", "bacc", "bbca", "ddabb", "a", "bdbbd", "bccea", "c", "ec", "dc", "dcb", "aaca", "ddbdb", "bddb", "bbbc", "dcc", "dbbbd", "abe", "cccdd", "acc", "bd", "ee", "adbc", "ebea", "bedba", "cdade", "acad", "bedbd", "aeadc", "decdd", "eaab", "e", "acd", "debd", "cbcd", "d", "de", "eb", "cd", "dbed", "dddca", "dbb", "bdeaa", "bba", "adee", "dcae", "eeea", "abdad", "abb" };
        int L = 3;
        assertEquals(463972674, similarnames2.count(names, L));
    }

    @Test
    public void case111() {
        String[] names = { "ca", "aaace", "dae", "aaa", "bbbb", "dc", "abc", "bae", "debc", "eeddb", "c", "dcac", "bcdd", "ebbcc", "ac", "beaaa", "e", "edcd", "bee", "abddb", "adbdb", "cdcd", "eae", "aaec", "aed", "eaeac", "ccee", "cbb", "dec", "bddaa", "b", "ba", "ada", "ad", "caba", "cae", "bdc", "cc", "aa", "bbcaa", "adbdd", "bbc", "ddaac", "a", "d", "eabcc", "beae", "acac", "beeb", "ccdee" };
        int L = 3;
        assertEquals(235150809, similarnames2.count(names, L));
    }

    @Test
    public void case112() {
        String[] names = { "aecc", "d", "ced", "cfcdf", "aacdf", "dcb", "a", "ea", "f", "eaafc", "ffdd", "ec", "ddae", "fda", "afcfa", "aedbe", "e", "bfdd", "dbeea", "df", "edde", "cdaf", "afc", "cab", "db", "affb", "aec", "bff", "fc", "ecd", "ef", "ccbe", "b", "befc", "beab", "cbde", "ae", "c", "bc", "cbc", "daed", "faebb", "cdab", "dbca", "da", "afb", "eaee", "ad", "be", "cceed" };
        int L = 6;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case113() {
        String[] names = { "f", "bead", "bae", "d", "aee", "eaacc", "cced", "ebfdc", "bdd", "fdc", "acfbc", "ecbaf", "be", "ef", "aa", "dbddd", "cacdf", "cfbf", "aaf", "ae", "e", "eacb", "bc", "cbd", "ffeca", "cbba", "ea", "ead", "bffdd", "dff", "fba", "dda", "edde", "dbe", "afdc", "fac", "dd", "ccf", "caade", "bcdd", "eebb", "a", "cbe", "c", "addba", "cbb", "afa", "deac", "bf", "b" };
        int L = 3;
        assertEquals(463972674, similarnames2.count(names, L));
    }

    @Test
    public void case114() {
        String[] names = { "d", "ceb", "aaefd", "b", "defa", "a", "ccfeb", "eabdc", "bceac", "c", "cadaa", "f", "fedb", "dfd", "daea", "cd", "dda", "dfbc", "babb", "fddf", "ce", "aed", "bcfd", "ac", "dc", "bce", "ae", "ee", "ebffa", "ea", "cea", "acdfc", "facce", "e", "bb", "cecfe", "dbcf", "eec", "cf", "fbeb", "bc", "af", "abbfd", "da", "feec", "bf", "daef", "fd", "aff", "ba" };
        int L = 2;
        assertEquals(624129181, similarnames2.count(names, L));
    }

    @Test
    public void case115() {
        String[] names = { "bcada", "d", "dfb", "dbee", "abafc", "acaff", "fb", "ec", "edb", "eebfd", "fffcc", "aa", "daa", "fa", "be", "ddcbb", "bea", "bca", "fef", "ce", "de", "ccf", "abbcf", "bcece", "dcbfb", "afece", "ca", "faaa", "aadfd", "ddde", "cebed", "ccb", "aae", "f", "ebeef", "fedbd", "b", "dced", "cf", "dbafd", "a", "fbb", "ab", "aade", "faafd", "fd", "eebd", "ccded", "deb", "e" };
        int L = 3;
        assertEquals(310369940, similarnames2.count(names, L));
    }

    @Test
    public void case116() {
        String[] names = { "debfd", "fdedc", "cdaff", "aefdb", "edb", "feec", "dc", "cddfa", "aa", "dece", "edd", "c", "acfff", "dcae", "eee", "ba", "dcd", "ccbc", "ddbf", "cf", "f", "dfafe", "adfe", "fdbce", "dcab", "cfbe", "fdcb", "dfca", "cc", "a", "aaad", "fcefc", "eca", "ccef", "ff", "ddbef", "aad", "eb", "baf", "dafec", "ebdb", "fae", "aefe", "cdf", "ad", "d", "eecde", "bcad", "dddbe", "eed" };
        int L = 6;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case117() {
        String[] names = { "kenta", "kentaro", "ken" };
        int L = 2;
        assertEquals(3, similarnames2.count(names, L));
    }

    @Test
    public void case118() {
        String[] names = { "alice", "bob", "charlie" };
        int L = 1;
        assertEquals(6, similarnames2.count(names, L));
    }

    @Test
    public void case119() {
        String[] names = { "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "b", "bc", "bcd", "bcde", "bcdef", "bcdefg", "bcdefgh", "bcdefghi", "bcdefghij", "bcdefghijk", "c", "cd", "cde", "cdef", "cdefg", "cdefgh", "cdefghi", "cdefghij", "cdefghijk", "cdefghijkl", "d", "de", "def", "defg", "defgh", "defghi", "defghij", "defghijk", "defghijkl", "defghijklm", "e", "ef", "efg", "efgh", "efghi", "efghij", "efghijk", "efghijkl", "efghijklm", "efghijklmn" };
        int L = 8;
        assertEquals(42475263, similarnames2.count(names, L));
    }

    @Test
    public void case120() {
        String[] names = { "ryota", "ryohei", "ryotaro", "ryo", "ryoga", "ryoma", "ryoko", "ryosuke", "ciel", "lun", "ryuta", "ryuji", "ryuma", "ryujiro", "ryusuke", "ryutaro", "ryu", "ryuhei", "ryuichi", "evima" };
        int L = 3;
        assertEquals(276818566, similarnames2.count(names, L));
    }

    @Test
    public void case121() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 46;
        assertEquals(5527200, similarnames2.count(names, L));
    }

    @Test
    public void case122() {
        String[] names = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 40;
        assertEquals(762363706, similarnames2.count(names, L));
    }

    @Test
    public void case123() {
        String[] names = { "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        int L = 35;
        assertEquals(793470785, similarnames2.count(names, L));
    }

    @Test
    public void case124() {
        String[] names = { "taro", "jiro", "hanako" };
        int L = 2;
        assertEquals(0, similarnames2.count(names, L));
    }

    @Test
    public void case125() {
        String[] names = { "hideo", "hideto", "hideki", "hide" };
        int L = 2;
        assertEquals(6, similarnames2.count(names, L));
    }

    @Test
    public void case126() {
        String[] names = { "k", "kk", "kkk", "kkkk", "kkkkk", "kkkkkk", "kkkkkkk", "kkkkkkkk", "kkkkkkkkk", "kkkkkkkkkk", "kkkkkkkkkkk", "kkkkkkkkkkkk", "kkkkkkkkkkkkk", "kkkkkkkkkkkkkk", "kkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" };
        int L = 13;
        assertEquals(721549524, similarnames2.count(names, L));
    }

    @Test
    public void case127() {
        String[] names = { "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswexsexsd", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswexsexs", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswexsex", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswexse", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswexs", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswex", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdaswe", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdasw", "aswexsexsdaswexsexsdaswexsexsdaswexsexsdas", "aswexsexsdaswexsexsdaswexsexsdaswexsexsda", "aswexsexsdaswexsexsdaswexsexsdaswexsexsd", "aswexsexsdaswexsexsdaswexsexsdaswexsexs", "aswexsexsdaswexsexsdaswexsexsdaswexsex", "aswexsexsdaswexsexsdaswexsexsdaswexse", "aswexsexsdaswexsexsdaswexsexsdaswexs", "aswexsexsdaswexsexsdaswexsexsdaswex", "aswexsexsdaswexsexsdaswexsexsdaswe", "aswexsexsdaswexsexsdaswexsexsdasw", "aswexsexsdaswexsexsdaswexsexsdas", "aswexsexsdaswexsexsdaswexsexsda", "aswexsexsdaswexsexsdaswexsexsd", "aswexsexsdaswexsexsdaswexsexs", "aswexsexsdaswexsexsdaswexsex", "aswexsexsdaswexsexsdaswexse", "aswexsexsdaswexsexsdaswexs", "aswexsexsdaswexsexsdaswex", "aswexsexsdaswexsexsdaswe", "aswexsexsdaswexsexsdasw", "aswexsexsdaswexsexsdas", "aswexsexsdaswexsexsda", "aswexsexsdaswexsexsd", "aswexsexsdaswexsexs", "aswexsexsdaswexsex", "aswexsexsdaswexse", "aswexsexsdaswexs", "aswexsexsdaswex", "aswexsexsdaswe", "aswexsexsdasw", "aswexsexsdas", "aswexsexsda", "aswexsexsd", "aswexsexs", "aswexsex", "aswexse", "aswexs", "aswex", "aswe", "asw", "as", "a" };
        int L = 31;
        assertEquals(14132508, similarnames2.count(names, L));
    }

    @Test
    public void case128() {
        String[] names = { "k", "km", "kmn", "kmnf", "kmnfq", "kmnfqq", "kmnfqqd", "kmnfqqda", "kmnfqqdad", "kmnfqqdads", "kmnfqqdadsd", "kmnfqqdadsdj", "kmnfqqdadsdjd", "kmnfqqdadsdjdv", "kmnfqqdadsdjdvn", "kmnfqqdadsdjdvna", "kmnfqqdadsdjdvnak", "kmnfqqdadsdjdvnakd", "kmnfqqdadsdjdvnakdf", "kmnfqqdadsdjdvnakdfy", "kmnfqqdadsdjdvnakdfyb", "kmnfqqdadsdjdvnakdfybt", "kmnfqqdadsdjdvnakdfybtl", "kmnfqqdadsdjdvnakdfybtll", "kmnfqqdadsdjdvnakdfybtlle", "kmnfqqdadsdjdvnakdfybtllev", "kmnfqqdadsdjdvnakdfybtllevr", "kmnfqqdadsdjdvnakdfybtllevrx", "kmnfqqdadsdjdvnakdfybtllevrxj", "kmnfqqdadsdjdvnakdfybtllevrxjs", "kmnfqqdadsdjdvnakdfybtllevrxjsl", "kmnfqqdadsdjdvnakdfybtllevrxjsll", "kmnfqqdadsdjdvnakdfybtllevrxjsllt", "kmnfqqdadsdjdvnakdfybtllevrxjsllti", "kmnfqqdadsdjdvnakdfybtllevrxjslltij", "kmnfqqdadsdjdvnakdfybtllevrxjslltijk", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkz", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzi", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzin", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinn", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinno", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnof", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofm", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmk", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmke", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmkew", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmkewr", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmkewrc", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmkewrcj", "kmnfqqdadsdjdvnakdfybtllevrxjslltijkzinnofmkewrcjg" };
        int L = 45;
        assertEquals(254251200, similarnames2.count(names, L));
    }

    @Test
    public void case129() {
        String[] names = { "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl", "abcdefghijklm", "abcdefghijklmn", "abcdefghijklmno", "abcdefghijklmnop", "abcdefghijklmnopq", "abcdefghijklmnopqr", "abcdefghijklmnopqrs", "abcdefghijklmnopqrst", "abcdefghijklmnopqrsta", "abcdefghijklmnopqrstaa", "abcdefghijklmnopqrstaaa", "abcdefghijklmnopqrstaaaa", "abcdefghijklmnopqrstaaaaa", "abcdefghijklmnopqrstaaaaaa", "abcdefghijklmnopqrstaaaaaaa", "abcdefghijklmnopqrstaaaaaaaa" };
        int L = 24;
        assertEquals(491400, similarnames2.count(names, L));
    }

    @Test
    public void case130() {
        String[] names = { "a", "aa", "aaa", "aaaa" };
        int L = 4;
        assertEquals(1, similarnames2.count(names, L));
    }

}
