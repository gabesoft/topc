package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SegmentTreeTest {

    @Test
    public void case0() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        SegmentTree tree = new SegmentTree(nums);

        assertEquals(90, tree.sumRange(5, 13));
        tree.update(7, 100);
        assertEquals(182, tree.sumRange(5, 13));
    }
}
