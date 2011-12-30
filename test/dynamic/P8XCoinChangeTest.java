package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class P8XCoinChangeTest {
  P8XCoinChange p8xcoinchange = new P8XCoinChange();

  @Test
  public void case1() {
    long coins_sum = 4L;
    long[] values = { 1L, 3L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case2() {
    long coins_sum = 4L;
    long[] values = { 1L, 2L, 4L };
    assertEquals(4, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case3() {
    long coins_sum = 3L;
    long[] values = { 1L, 5L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case4() {
    long coins_sum = 11L;
    long[] values = { 1L, 2L, 6L };
    assertEquals(9, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case5() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000L, 1000000000000000000L };
    assertEquals(997005, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case6() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case7() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L };
    assertEquals(285987, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case8() {
    long coins_sum = 892343554312566841L;
    long[] values = { 1L, 2048L, 8192L, 32768L, 131072L, 524288L, 1048576L, 4194304L, 8388608L, 33554432L, 134217728L, 536870912L, 2147483648L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(386433, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case9() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2048L, 8192L, 32768L, 131072L, 524288L, 1048576L, 4194304L, 8388608L, 134217728L, 536870912L, 2147483648L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 562949953421312L, 1125899906842624L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 72057594037927936L, 288230376151711744L, 576460752303423488L };
    assertEquals(461985, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case10() {
    long coins_sum = 794077075818381371L;
    long[] values = { 1L, 3739947L };
    assertEquals(445639, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case11() {
    long coins_sum = 826704128490047981L;
    long[] values = { 1L, 53115319959L };
    assertEquals(564281, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case12() {
    long coins_sum = 371087304920622001L;
    long[] values = { 1L, 17344970L };
    assertEquals(455666, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case13() {
    long coins_sum = 50463142594525664L;
    long[] values = { 1L, 57967614580L };
    assertEquals(870541, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case14() {
    long coins_sum = 600608899338702194L;
    long[] values = { 1L, 1374577539357733L };
    assertEquals(437, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case15() {
    long coins_sum = 116963120548827250L;
    long[] values = { 1L, 343630958L, 107900120812L };
    assertEquals(563721, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case16() {
    long coins_sum = 982367743136081554L;
    long[] values = { 1L, 89432L, 14462490871808L };
    assertEquals(159471, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case17() {
    long coins_sum = 107091545825355141L;
    long[] values = { 1L, 167226L, 990566358740650698L };
    assertEquals(171049, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case18() {
    long coins_sum = 282088911387953409L;
    long[] values = { 1L, 6788L, 517856615032L, 3624996305224L };
    assertEquals(810003, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case19() {
    long coins_sum = 722298191075244383L;
    long[] values = { 1L, 13L, 871L, 407141049791346L };
    assertEquals(104365, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case20() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case21() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case22() {
    long coins_sum = 1L;
    long[] values = { 1L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case23() {
    long coins_sum = 1L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case24() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(490662, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case25() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L };
    assertEquals(140863, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case26() {
    long coins_sum = 576460752303423488L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(957812, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case27() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(373416, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case28() {
    long coins_sum = 1099511627775L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(924011, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case29() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(288413, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case30() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(454585, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case31() {
    long coins_sum = 864691128455135231L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(150389, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case32() {
    long coins_sum = 768614336404564650L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(854768, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case33() {
    long coins_sum = 384006026849324749L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(473183, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case34() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 576460752303423488L };
    assertEquals(844555, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case35() {
    long coins_sum = 864691128455135231L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 576460752303423488L };
    assertEquals(128072, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case36() {
    long coins_sum = 768614336404564650L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 576460752303423488L };
    assertEquals(524414, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case37() {
    long coins_sum = 999999999999999998L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 36028797018963968L };
    assertEquals(253449, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case38() {
    long coins_sum = 972777519512027135L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 36028797018963968L };
    assertEquals(71569, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case39() {
    long coins_sum = 704639813478093135L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 36028797018963968L };
    assertEquals(964159, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case40() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 36028797018963968L };
    assertEquals(541902, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case41() {
    long coins_sum = 999999999999999952L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 999999999876005888L };
    assertEquals(799220, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case42() {
    long coins_sum = 999999999876005887L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 999999999876005888L };
    assertEquals(832036, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case43() {
    long coins_sum = 930616611603961851L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 999999999876005888L };
    assertEquals(435446, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case44() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 999999999876005888L };
    assertEquals(841383, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case45() {
    long coins_sum = 999999999999999960L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(798907, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case46() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(783715, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case47() {
    long coins_sum = 532619647796537964L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(697763, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case48() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(715700, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case49() {
    long coins_sum = 999999999999999948L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(112193, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case50() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(118936, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case51() {
    long coins_sum = 317491580039291644L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(293914, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case52() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(249358, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case53() {
    long coins_sum = 999999999999999900L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L };
    assertEquals(651583, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case54() {
    long coins_sum = 999999999876005887L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L };
    assertEquals(832036, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case55() {
    long coins_sum = 746446317393153666L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L };
    assertEquals(730308, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case56() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L };
    assertEquals(9651, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case57() {
    long coins_sum = 864691128455135231L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(197457, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case58() {
    long coins_sum = 768614336404564650L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(481141, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case59() {
    long coins_sum = 999999999999999907L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(141474, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case60() {
    long coins_sum = 999999778148319231L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(335894, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case61() {
    long coins_sum = 977538679201230219L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(738067, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case62() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(78222, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case63() {
    long coins_sum = 999999999999999931L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 128L, 256L, 1024L, 262144L, 1048576L, 2097152L, 16777216L, 67108864L, 268435456L, 536870912L, 4294967296L, 17179869184L, 34359738368L, 137438953472L, 274877906944L };
    assertEquals(503016, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case64() {
    long coins_sum = 999999778148319231L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 128L, 256L, 1024L, 262144L, 1048576L, 2097152L, 16777216L, 67108864L, 268435456L, 536870912L, 4294967296L, 17179869184L, 34359738368L, 137438953472L, 274877906944L };
    assertEquals(199122, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case65() {
    long coins_sum = 951665288661125601L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 128L, 256L, 1024L, 262144L, 1048576L, 2097152L, 16777216L, 67108864L, 268435456L, 536870912L, 4294967296L, 17179869184L, 34359738368L, 137438953472L, 274877906944L };
    assertEquals(797066, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case66() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 128L, 256L, 1024L, 262144L, 1048576L, 2097152L, 16777216L, 67108864L, 268435456L, 536870912L, 4294967296L, 17179869184L, 34359738368L, 137438953472L, 274877906944L };
    assertEquals(709624, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case67() {
    long coins_sum = 999999999999999975L;
    long[] values = { 1L, 3L, 9L, 27L, 81L, 243L, 729L, 2187L, 6561L, 19683L, 59049L, 177147L, 531441L, 1594323L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 3486784401L, 10460353203L, 31381059609L, 94143178827L, 282429536481L, 847288609443L, 2541865828329L, 7625597484987L, 22876792454961L, 68630377364883L, 205891132094649L, 617673396283947L, 1853020188851841L, 5559060566555523L, 16677181699666569L, 50031545098999707L, 150094635296999121L, 450283905890997363L };
    assertEquals(177442, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case68() {
    long coins_sum = 900567811781994725L;
    long[] values = { 1L, 3L, 9L, 27L, 81L, 243L, 729L, 2187L, 6561L, 19683L, 59049L, 177147L, 531441L, 1594323L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 3486784401L, 10460353203L, 31381059609L, 94143178827L, 282429536481L, 847288609443L, 2541865828329L, 7625597484987L, 22876792454961L, 68630377364883L, 205891132094649L, 617673396283947L, 1853020188851841L, 5559060566555523L, 16677181699666569L, 50031545098999707L, 150094635296999121L, 450283905890997363L };
    assertEquals(483121, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case69() {
    long coins_sum = 52012464408636662L;
    long[] values = { 1L, 3L, 9L, 27L, 81L, 243L, 729L, 2187L, 6561L, 19683L, 59049L, 177147L, 531441L, 1594323L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 3486784401L, 10460353203L, 31381059609L, 94143178827L, 282429536481L, 847288609443L, 2541865828329L, 7625597484987L, 22876792454961L, 68630377364883L, 205891132094649L, 617673396283947L, 1853020188851841L, 5559060566555523L, 16677181699666569L, 50031545098999707L, 150094635296999121L, 450283905890997363L };
    assertEquals(311507, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case70() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 3L, 9L, 27L, 81L, 243L, 729L, 2187L, 6561L, 19683L, 59049L, 177147L, 531441L, 1594323L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 3486784401L, 10460353203L, 31381059609L, 94143178827L, 282429536481L, 847288609443L, 2541865828329L, 7625597484987L, 22876792454961L, 68630377364883L, 205891132094649L, 617673396283947L, 1853020188851841L, 5559060566555523L, 16677181699666569L, 50031545098999707L, 150094635296999121L, 450283905890997363L };
    assertEquals(103349, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case71() {
    long coins_sum = 999999999999999953L;
    long[] values = { 1L, 27L, 729L, 6561L, 59049L, 531441L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 94143178827L, 847288609443L, 2541865828329L, 22876792454961L, 617673396283947L, 1853020188851841L, 5559060566555523L, 50031545098999707L };
    assertEquals(138316, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case72() {
    long coins_sum = 950599356880994432L;
    long[] values = { 1L, 27L, 729L, 6561L, 59049L, 531441L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 94143178827L, 847288609443L, 2541865828329L, 22876792454961L, 617673396283947L, 1853020188851841L, 5559060566555523L, 50031545098999707L };
    assertEquals(420226, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case73() {
    long coins_sum = 21061720032623053L;
    long[] values = { 1L, 27L, 729L, 6561L, 59049L, 531441L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 94143178827L, 847288609443L, 2541865828329L, 22876792454961L, 617673396283947L, 1853020188851841L, 5559060566555523L, 50031545098999707L };
    assertEquals(834075, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case74() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 27L, 729L, 6561L, 59049L, 531441L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 94143178827L, 847288609443L, 2541865828329L, 22876792454961L, 617673396283947L, 1853020188851841L, 5559060566555523L, 50031545098999707L };
    assertEquals(351226, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case75() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L };
    assertEquals(584929, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case76() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L };
    assertEquals(260663, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case77() {
    long coins_sum = 267754604216822856L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L };
    assertEquals(424956, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case78() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L };
    assertEquals(120803, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case79() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 1000000L, 10000000L, 1000000000L, 10000000000000L, 1000000000000000000L };
    assertEquals(109423, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case80() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 1000000L, 10000000L, 1000000000L, 10000000000000L, 1000000000000000000L };
    assertEquals(351400, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case81() {
    long coins_sum = 834276793962526140L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 1000000L, 10000000L, 1000000000L, 10000000000000L, 1000000000000000000L };
    assertEquals(138878, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case82() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 10L, 100L, 1000L, 10000L, 1000000L, 10000000L, 1000000000L, 10000000000000L, 1000000000000000000L };
    assertEquals(253158, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case83() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000L, 1000000000000L, 1000000000000000000L };
    assertEquals(999993, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case84() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 1000000L, 1000000000000L, 1000000000000000000L };
    assertEquals(999994, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case85() {
    long coins_sum = 537780465300950383L;
    long[] values = { 1L, 1000000L, 1000000000000L, 1000000000000000000L };
    assertEquals(788557, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case86() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1000000L, 1000000000000L, 1000000000000000000L };
    assertEquals(999994, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case87() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000L, 1000000000000000000L };
    assertEquals(11, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case88() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 1000000L, 1000000000000000000L };
    assertEquals(9, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case89() {
    long coins_sum = 803899682987868064L;
    long[] values = { 1L, 1000000L, 1000000000000000000L };
    assertEquals(271297, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case90() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1000000L, 1000000000000000000L };
    assertEquals(9, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case91() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000L, 1000000000000000000L };
    assertEquals(997005, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case92() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 1000000000L, 1000000000000000000L };
    assertEquals(997003, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case93() {
    long coins_sum = 606545956564853446L;
    long[] values = { 1L, 1000000000L, 1000000000000000000L };
    assertEquals(544139, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case94() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1000000000L, 1000000000000000000L };
    assertEquals(997003, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case95() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case96() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case97() {
    long coins_sum = 998314406445935577L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case98() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case99() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case100() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case101() {
    long coins_sum = 618385295295078395L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case102() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case103() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case104() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case105() {
    long coins_sum = 497513063888566044L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case106() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1000000000000000000L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case107() {
    long coins_sum = 999999999999999984L;
    long[] values = { 1L, 247L, 61009L, 15069223L, 3722098081L, 919358226007L, 227081481823729L, 56089126010461063L };
    assertEquals(53638, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case108() {
    long coins_sum = 953515142177838070L;
    long[] values = { 1L, 247L, 61009L, 15069223L, 3722098081L, 919358226007L, 227081481823729L, 56089126010461063L };
    assertEquals(584017, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case109() {
    long coins_sum = 470572283927716542L;
    long[] values = { 1L, 247L, 61009L, 15069223L, 3722098081L, 919358226007L, 227081481823729L, 56089126010461063L };
    assertEquals(201658, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case110() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 247L, 61009L, 15069223L, 3722098081L, 919358226007L, 227081481823729L, 56089126010461063L };
    assertEquals(53638, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case111() {
    long coins_sum = 999999999999999912L;
    long[] values = { 1L, 247L, 61009L, 227081481823729L, 56089126010461063L };
    assertEquals(880947, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case112() {
    long coins_sum = 953515142177838070L;
    long[] values = { 1L, 247L, 61009L, 227081481823729L, 56089126010461063L };
    assertEquals(384182, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case113() {
    long coins_sum = 177975680171468453L;
    long[] values = { 1L, 247L, 61009L, 227081481823729L, 56089126010461063L };
    assertEquals(46973, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case114() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 247L, 61009L, 227081481823729L, 56089126010461063L };
    assertEquals(880947, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case115() {
    long coins_sum = 999999999999999941L;
    long[] values = { 1L, 31679L, 1003559041L, 31791746859839L };
    assertEquals(880732, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case116() {
    long coins_sum = 999977605729375905L;
    long[] values = { 1L, 31679L, 1003559041L, 31791746859839L };
    assertEquals(856920, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case117() {
    long coins_sum = 94831665988106189L;
    long[] values = { 1L, 31679L, 1003559041L, 31791746859839L };
    assertEquals(381334, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case118() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 31679L, 1003559041L, 31791746859839L };
    assertEquals(880732, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case119() {
    long coins_sum = 999999999999999935L;
    long[] values = { 1L, 31679L, 1003559041L };
    assertEquals(856489, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case120() {
    long coins_sum = 999999999145816779L;
    long[] values = { 1L, 31679L, 1003559041L };
    assertEquals(103284, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case121() {
    long coins_sum = 205600300092288021L;
    long[] values = { 1L, 31679L, 1003559041L };
    assertEquals(435825, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case122() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 31679L, 1003559041L };
    assertEquals(856489, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case123() {
    long coins_sum = 999999999999999962L;
    long[] values = { 1L, 8L, 64L, 512L, 4096L, 32768L, 262144L, 2097152L, 16777216L, 134217728L, 1073741824L, 8589934592L, 68719476736L, 549755813888L, 4398046511104L, 35184372088832L, 281474976710656L, 2251799813685248L, 18014398509481984L, 144115188075855872L };
    assertEquals(603167, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case124() {
    long coins_sum = 864691128455135231L;
    long[] values = { 1L, 8L, 64L, 512L, 4096L, 32768L, 262144L, 2097152L, 16777216L, 134217728L, 1073741824L, 8589934592L, 68719476736L, 549755813888L, 4398046511104L, 35184372088832L, 281474976710656L, 2251799813685248L, 18014398509481984L, 144115188075855872L };
    assertEquals(473949, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case125() {
    long coins_sum = 295516293042314003L;
    long[] values = { 1L, 8L, 64L, 512L, 4096L, 32768L, 262144L, 2097152L, 16777216L, 134217728L, 1073741824L, 8589934592L, 68719476736L, 549755813888L, 4398046511104L, 35184372088832L, 281474976710656L, 2251799813685248L, 18014398509481984L, 144115188075855872L };
    assertEquals(655907, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case126() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 8L, 64L, 512L, 4096L, 32768L, 262144L, 2097152L, 16777216L, 134217728L, 1073741824L, 8589934592L, 68719476736L, 549755813888L, 4398046511104L, 35184372088832L, 281474976710656L, 2251799813685248L, 18014398509481984L, 144115188075855872L };
    assertEquals(741166, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case127() {
    long coins_sum = 999999999999999971L;
    long[] values = { 1L, 8L, 64L, 262144L, 16777216L, 134217728L, 1073741824L, 549755813888L, 35184372088832L, 2251799813685248L, 18014398509481984L };
    assertEquals(738610, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case128() {
    long coins_sum = 990791918021509119L;
    long[] values = { 1L, 8L, 64L, 262144L, 16777216L, 134217728L, 1073741824L, 549755813888L, 35184372088832L, 2251799813685248L, 18014398509481984L };
    assertEquals(859106, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case129() {
    long coins_sum = 32343804927701537L;
    long[] values = { 1L, 8L, 64L, 262144L, 16777216L, 134217728L, 1073741824L, 549755813888L, 35184372088832L, 2251799813685248L, 18014398509481984L };
    assertEquals(560562, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case130() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 8L, 64L, 262144L, 16777216L, 134217728L, 1073741824L, 549755813888L, 35184372088832L, 2251799813685248L, 18014398509481984L };
    assertEquals(555400, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case131() {
    long coins_sum = 999999999999999923L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case132() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case133() {
    long coins_sum = 146219590731370472L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case134() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case135() {
    long coins_sum = 999999999999999929L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case136() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case137() {
    long coins_sum = 231963059287664034L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case138() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 576460752303423488L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case139() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1073741824L };
    assertEquals(319782, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case140() {
    long coins_sum = 999999999339134975L;
    long[] values = { 1L, 1073741824L };
    assertEquals(319781, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case141() {
    long coins_sum = 722022250370902437L;
    long[] values = { 1L, 1073741824L };
    assertEquals(433606, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case142() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 1073741824L };
    assertEquals(319782, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case143() {
    long coins_sum = 999999999999999919L;
    long[] values = { 1L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case144() {
    long coins_sum = 999999999999999999L;
    long[] values = { 1L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case145() {
    long coins_sum = 62865477134988074L;
    long[] values = { 1L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case146() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case147() {
    long coins_sum = 999999999999999971L;
    long[] values = { 1L, 3L, 9L, 18L, 54L, 162L, 486L, 1458L, 4374L, 13122L, 39366L, 118098L, 236196L, 708588L, 2125764L, 6377292L, 19131876L, 57395628L, 172186884L, 516560652L, 1549681956L, 3099363912L, 9298091736L, 27894275208L, 83682825624L, 251048476872L, 753145430616L, 2259436291848L, 4518872583696L, 13556617751088L, 40669853253264L, 122009559759792L, 366028679279376L, 1098086037838128L, 3294258113514384L, 9882774340543152L, 29648323021629456L, 88944969064888368L, 266834907194665104L, 800504721583995312L };
    assertEquals(237049, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case148() {
    long coins_sum = 800504721583995311L;
    long[] values = { 1L, 3L, 9L, 18L, 54L, 162L, 486L, 1458L, 4374L, 13122L, 39366L, 118098L, 236196L, 708588L, 2125764L, 6377292L, 19131876L, 57395628L, 172186884L, 516560652L, 1549681956L, 3099363912L, 9298091736L, 27894275208L, 83682825624L, 251048476872L, 753145430616L, 2259436291848L, 4518872583696L, 13556617751088L, 40669853253264L, 122009559759792L, 366028679279376L, 1098086037838128L, 3294258113514384L, 9882774340543152L, 29648323021629456L, 88944969064888368L, 266834907194665104L, 800504721583995312L };
    assertEquals(847068, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case149() {
    long coins_sum = 183377243716561553L;
    long[] values = { 1L, 3L, 9L, 18L, 54L, 162L, 486L, 1458L, 4374L, 13122L, 39366L, 118098L, 236196L, 708588L, 2125764L, 6377292L, 19131876L, 57395628L, 172186884L, 516560652L, 1549681956L, 3099363912L, 9298091736L, 27894275208L, 83682825624L, 251048476872L, 753145430616L, 2259436291848L, 4518872583696L, 13556617751088L, 40669853253264L, 122009559759792L, 366028679279376L, 1098086037838128L, 3294258113514384L, 9882774340543152L, 29648323021629456L, 88944969064888368L, 266834907194665104L, 800504721583995312L };
    assertEquals(246424, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case150() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 3L, 9L, 18L, 54L, 162L, 486L, 1458L, 4374L, 13122L, 39366L, 118098L, 236196L, 708588L, 2125764L, 6377292L, 19131876L, 57395628L, 172186884L, 516560652L, 1549681956L, 3099363912L, 9298091736L, 27894275208L, 83682825624L, 251048476872L, 753145430616L, 2259436291848L, 4518872583696L, 13556617751088L, 40669853253264L, 122009559759792L, 366028679279376L, 1098086037838128L, 3294258113514384L, 9882774340543152L, 29648323021629456L, 88944969064888368L, 266834907194665104L, 800504721583995312L };
    assertEquals(980913, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case151() {
    long coins_sum = 999999999999999983L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(955900, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case152() {
    long coins_sum = 999999778148319231L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(335894, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case153() {
    long coins_sum = 342815399047068438L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(632816, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case154() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
    assertEquals(78222, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case155() {
    long coins_sum = 999999999999999916L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(288413, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case156() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(454585, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case157() {
    long coins_sum = 298381222125583538L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(344669, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case158() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(288413, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case159() {
    long coins_sum = 999999999999999905L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(204024, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case160() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(480318, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case161() {
    long coins_sum = 98737712034666454L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(350000, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case162() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L };
    assertEquals(346088, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case163() {
    long coins_sum = 999999999999999906L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108964663296L, 134217929326592L, 268435858653184L, 536871717306368L, 1073743434612736L, 2147486869225472L, 4294973738450944L, 8589947476901888L, 17179894953803776L, 34359789907607552L, 68719579815215104L, 137439159630430208L, 274878319260860416L, 549756638521720832L };
    assertEquals(121517, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case164() {
    long coins_sum = 549756638521720831L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108964663296L, 134217929326592L, 268435858653184L, 536871717306368L, 1073743434612736L, 2147486869225472L, 4294973738450944L, 8589947476901888L, 17179894953803776L, 34359789907607552L, 68719579815215104L, 137439159630430208L, 274878319260860416L, 549756638521720832L };
    assertEquals(132860, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case165() {
    long coins_sum = 434751498639224554L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108964663296L, 134217929326592L, 268435858653184L, 536871717306368L, 1073743434612736L, 2147486869225472L, 4294973738450944L, 8589947476901888L, 17179894953803776L, 34359789907607552L, 68719579815215104L, 137439159630430208L, 274878319260860416L, 549756638521720832L };
    assertEquals(682279, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case166() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108964663296L, 134217929326592L, 268435858653184L, 536871717306368L, 1073743434612736L, 2147486869225472L, 4294973738450944L, 8589947476901888L, 17179894953803776L, 34359789907607552L, 68719579815215104L, 137439159630430208L, 274878319260860416L, 549756638521720832L };
    assertEquals(36852, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case167() {
    long coins_sum = 999999999999999913L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(159710, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case168() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(433402, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case169() {
    long coins_sum = 803218207212681569L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(80489, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case170() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(629853, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case171() {
    long coins_sum = 999999999999999984L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(865544, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case172() {
    long coins_sum = 576460752303423487L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(433402, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case173() {
    long coins_sum = 404852872769667478L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(278243, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case174() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 8L, 16L, 32L, 64L, 128L, 1024L, 4096L, 8192L, 32768L, 131072L, 262144L, 524288L, 1048576L, 4194304L, 8388608L, 16777216L, 33554432L, 134217728L, 1073741824L, 2147483648L, 4294967296L, 34359738368L, 137438953472L, 274877906944L, 1099511627776L, 2199023255552L, 8796093022208L, 17592186044416L, 70368744177664L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L };
    assertEquals(629853, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case175() {
    long coins_sum = 999999999999999905L;
    long[] values = { 1L, 2L, 6L, 12L, 36L, 72L, 216L, 432L, 1296L, 2592L, 7776L, 15552L, 46656L, 93312L, 279936L, 559872L, 1679616L, 3359232L, 10077696L, 20155392L, 60466176L, 120932352L, 362797056L, 725594112L, 2176782336L, 4353564672L, 13060694016L, 26121388032L, 78364164096L, 156728328192L, 470184984576L, 940369969152L, 2821109907456L, 5642219814912L, 16926659444736L, 33853318889472L, 101559956668416L, 203119913336832L, 609359740010496L, 1218719480020992L };
    assertEquals(367377, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case176() {
    long coins_sum = 999349973617213439L;
    long[] values = { 1L, 2L, 6L, 12L, 36L, 72L, 216L, 432L, 1296L, 2592L, 7776L, 15552L, 46656L, 93312L, 279936L, 559872L, 1679616L, 3359232L, 10077696L, 20155392L, 60466176L, 120932352L, 362797056L, 725594112L, 2176782336L, 4353564672L, 13060694016L, 26121388032L, 78364164096L, 156728328192L, 470184984576L, 940369969152L, 2821109907456L, 5642219814912L, 16926659444736L, 33853318889472L, 101559956668416L, 203119913336832L, 609359740010496L, 1218719480020992L };
    assertEquals(70662, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case177() {
    long coins_sum = 232380175608002620L;
    long[] values = { 1L, 2L, 6L, 12L, 36L, 72L, 216L, 432L, 1296L, 2592L, 7776L, 15552L, 46656L, 93312L, 279936L, 559872L, 1679616L, 3359232L, 10077696L, 20155392L, 60466176L, 120932352L, 362797056L, 725594112L, 2176782336L, 4353564672L, 13060694016L, 26121388032L, 78364164096L, 156728328192L, 470184984576L, 940369969152L, 2821109907456L, 5642219814912L, 16926659444736L, 33853318889472L, 101559956668416L, 203119913336832L, 609359740010496L, 1218719480020992L };
    assertEquals(601681, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case178() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 6L, 12L, 36L, 72L, 216L, 432L, 1296L, 2592L, 7776L, 15552L, 46656L, 93312L, 279936L, 559872L, 1679616L, 3359232L, 10077696L, 20155392L, 60466176L, 120932352L, 362797056L, 725594112L, 2176782336L, 4353564672L, 13060694016L, 26121388032L, 78364164096L, 156728328192L, 470184984576L, 940369969152L, 2821109907456L, 5642219814912L, 16926659444736L, 33853318889472L, 101559956668416L, 203119913336832L, 609359740010496L, 1218719480020992L };
    assertEquals(455586, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case179() {
    long coins_sum = 999999999999999920L;
    long[] values = { 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L };
    assertEquals(71661, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case180() {
    long coins_sum = 973160803270655999L;
    long[] values = { 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L };
    assertEquals(926310, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case181() {
    long coins_sum = 59761772267073074L;
    long[] values = { 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L };
    assertEquals(827393, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case182() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L };
    assertEquals(70295, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case183() {
    long coins_sum = 999999999999999932L;
    long[] values = { 1L, 2L, 8L, 64L, 1024L, 32768L, 2097152L, 268435456L, 68719476736L, 35184372088832L, 36028797018963968L };
    assertEquals(588091, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case184() {
    long coins_sum = 972777519512027135L;
    long[] values = { 1L, 2L, 8L, 64L, 1024L, 32768L, 2097152L, 268435456L, 68719476736L, 35184372088832L, 36028797018963968L };
    assertEquals(392253, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case185() {
    long coins_sum = 66615556803654685L;
    long[] values = { 1L, 2L, 8L, 64L, 1024L, 32768L, 2097152L, 268435456L, 68719476736L, 35184372088832L, 36028797018963968L };
    assertEquals(753200, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case186() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 8L, 64L, 1024L, 32768L, 2097152L, 268435456L, 68719476736L, 35184372088832L, 36028797018963968L };
    assertEquals(572489, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case187() {
    long coins_sum = 999999999999999959L;
    long[] values = { 1L, 20L, 380L, 6840L, 116280L, 1860480L, 27907200L, 390700800L, 5079110400L, 60949324800L, 670442572800L, 6704425728000L, 60339831552000L, 482718652416000L, 3379030566912000L, 20274183401472000L, 101370917007360000L, 405483668029440000L };
    assertEquals(129323, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case188() {
    long coins_sum = 810967336058879999L;
    long[] values = { 1L, 20L, 380L, 6840L, 116280L, 1860480L, 27907200L, 390700800L, 5079110400L, 60949324800L, 670442572800L, 6704425728000L, 60339831552000L, 482718652416000L, 3379030566912000L, 20274183401472000L, 101370917007360000L, 405483668029440000L };
    assertEquals(341332, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case189() {
    long coins_sum = 638492057954221624L;
    long[] values = { 1L, 20L, 380L, 6840L, 116280L, 1860480L, 27907200L, 390700800L, 5079110400L, 60949324800L, 670442572800L, 6704425728000L, 60339831552000L, 482718652416000L, 3379030566912000L, 20274183401472000L, 101370917007360000L, 405483668029440000L };
    assertEquals(426156, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case190() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 20L, 380L, 6840L, 116280L, 1860480L, 27907200L, 390700800L, 5079110400L, 60949324800L, 670442572800L, 6704425728000L, 60339831552000L, 482718652416000L, 3379030566912000L, 20274183401472000L, 101370917007360000L, 405483668029440000L };
    assertEquals(582250, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case191() {
    long coins_sum = 999999999999999964L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 513536L, 1027072L, 2054144L, 4108288L, 8216576L, 16433152L, 32866304L, 65732608L, 131465216L, 262930432L, 263719223296L, 527438446592L, 1054876893184L, 2109753786368L, 4219507572736L, 8439015145472L, 16878030290944L, 33756060581888L, 67512121163776L, 135024242327552L, 135429315054534656L, 270858630109069312L, 541717260218138624L };
    assertEquals(369902, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case192() {
    long coins_sum = 541717260218138623L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 513536L, 1027072L, 2054144L, 4108288L, 8216576L, 16433152L, 32866304L, 65732608L, 131465216L, 262930432L, 263719223296L, 527438446592L, 1054876893184L, 2109753786368L, 4219507572736L, 8439015145472L, 16878030290944L, 33756060581888L, 67512121163776L, 135024242327552L, 135429315054534656L, 270858630109069312L, 541717260218138624L };
    assertEquals(93366, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case193() {
    long coins_sum = 159409910175096157L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 513536L, 1027072L, 2054144L, 4108288L, 8216576L, 16433152L, 32866304L, 65732608L, 131465216L, 262930432L, 263719223296L, 527438446592L, 1054876893184L, 2109753786368L, 4219507572736L, 8439015145472L, 16878030290944L, 33756060581888L, 67512121163776L, 135024242327552L, 135429315054534656L, 270858630109069312L, 541717260218138624L };
    assertEquals(20178, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case194() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 513536L, 1027072L, 2054144L, 4108288L, 8216576L, 16433152L, 32866304L, 65732608L, 131465216L, 262930432L, 263719223296L, 527438446592L, 1054876893184L, 2109753786368L, 4219507572736L, 8439015145472L, 16878030290944L, 33756060581888L, 67512121163776L, 135024242327552L, 135429315054534656L, 270858630109069312L, 541717260218138624L };
    assertEquals(570454, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case195() {
    long coins_sum = 999999999999999939L;
    long[] values = { 1L, 3L, 6L, 18L, 36L, 108L, 216L, 648L, 1296L, 3888L, 7776L, 7776000054432L, 15552000108864L, 46656000326592L, 93312000653184L, 279936001959552L, 559872003919104L, 1679616011757312L, 3359232023514624L, 10077696070543872L, 20155392141087744L, 60466176423263232L, 120932352846526464L, 362797058539579392L, 725594117079158784L };
    assertEquals(294623, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case196() {
    long coins_sum = 725594117079158783L;
    long[] values = { 1L, 3L, 6L, 18L, 36L, 108L, 216L, 648L, 1296L, 3888L, 7776L, 7776000054432L, 15552000108864L, 46656000326592L, 93312000653184L, 279936001959552L, 559872003919104L, 1679616011757312L, 3359232023514624L, 10077696070543872L, 20155392141087744L, 60466176423263232L, 120932352846526464L, 362797058539579392L, 725594117079158784L };
    assertEquals(982183, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case197() {
    long coins_sum = 104354787914347054L;
    long[] values = { 1L, 3L, 6L, 18L, 36L, 108L, 216L, 648L, 1296L, 3888L, 7776L, 7776000054432L, 15552000108864L, 46656000326592L, 93312000653184L, 279936001959552L, 559872003919104L, 1679616011757312L, 3359232023514624L, 10077696070543872L, 20155392141087744L, 60466176423263232L, 120932352846526464L, 362797058539579392L, 725594117079158784L };
    assertEquals(862112, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case198() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 3L, 6L, 18L, 36L, 108L, 216L, 648L, 1296L, 3888L, 7776L, 7776000054432L, 15552000108864L, 46656000326592L, 93312000653184L, 279936001959552L, 559872003919104L, 1679616011757312L, 3359232023514624L, 10077696070543872L, 20155392141087744L, 60466176423263232L, 120932352846526464L, 362797058539579392L, 725594117079158784L };
    assertEquals(97328, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case199() {
    long coins_sum = 999999999999999935L;
    long[] values = { 1L, 2L, 6L, 30L, 210L, 2310L, 30030L, 510510L, 9699690L, 223092870L, 6469693230L, 200560490130L, 7420738134810L, 304250263527210L, 13082761331670030L, 614889782588491410L };
    assertEquals(345399, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case200() {
    long coins_sum = 614889782588491409L;
    long[] values = { 1L, 2L, 6L, 30L, 210L, 2310L, 30030L, 510510L, 9699690L, 223092870L, 6469693230L, 200560490130L, 7420738134810L, 304250263527210L, 13082761331670030L, 614889782588491410L };
    assertEquals(330906, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case201() {
    long coins_sum = 14340184788107032L;
    long[] values = { 1L, 2L, 6L, 30L, 210L, 2310L, 30030L, 510510L, 9699690L, 223092870L, 6469693230L, 200560490130L, 7420738134810L, 304250263527210L, 13082761331670030L, 614889782588491410L };
    assertEquals(958841, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case202() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 2L, 6L, 30L, 210L, 2310L, 30030L, 510510L, 9699690L, 223092870L, 6469693230L, 200560490130L, 7420738134810L, 304250263527210L, 13082761331670030L, 614889782588491410L };
    assertEquals(269865, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case203() {
    long coins_sum = 999999999999999933L;
    long[] values = { 1L, 3L, 12L, 72L, 576L, 6912L, 96768L, 1741824L, 34836480L, 836075520L, 25082265600L, 802632499200L, 30500034969600L, 1281001468723200L, 56364064623820800L };
    assertEquals(245074, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case204() {
    long coins_sum = 958189098604953599L;
    long[] values = { 1L, 3L, 12L, 72L, 576L, 6912L, 96768L, 1741824L, 34836480L, 836075520L, 25082265600L, 802632499200L, 30500034969600L, 1281001468723200L, 56364064623820800L };
    assertEquals(359538, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case205() {
    long coins_sum = 341082553858208507L;
    long[] values = { 1L, 3L, 12L, 72L, 576L, 6912L, 96768L, 1741824L, 34836480L, 836075520L, 25082265600L, 802632499200L, 30500034969600L, 1281001468723200L, 56364064623820800L };
    assertEquals(626037, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case206() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 3L, 12L, 72L, 576L, 6912L, 96768L, 1741824L, 34836480L, 836075520L, 25082265600L, 802632499200L, 30500034969600L, 1281001468723200L, 56364064623820800L };
    assertEquals(654708, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case207() {
    long coins_sum = 999999999999999955L;
    long[] values = { 1L, 5L, 30L, 240L, 1920L, 11520L, 92160L, 184320L, 552960L, 5529600L, 16588800L, 116121600L, 812851200L, 4877107200L, 24385536000L, 121927680000L, 975421440000L, 3901685760000L, 7803371520000L, 23410114560000L, 187280916480000L, 1123685498880000L, 10113169489920000L, 101131694899200000L };
    assertEquals(604345, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case208() {
    long coins_sum = 910185254092799999L;
    long[] values = { 1L, 5L, 30L, 240L, 1920L, 11520L, 92160L, 184320L, 552960L, 5529600L, 16588800L, 116121600L, 812851200L, 4877107200L, 24385536000L, 121927680000L, 975421440000L, 3901685760000L, 7803371520000L, 23410114560000L, 187280916480000L, 1123685498880000L, 10113169489920000L, 101131694899200000L };
    assertEquals(891830, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case209() {
    long coins_sum = 90843034567204188L;
    long[] values = { 1L, 5L, 30L, 240L, 1920L, 11520L, 92160L, 184320L, 552960L, 5529600L, 16588800L, 116121600L, 812851200L, 4877107200L, 24385536000L, 121927680000L, 975421440000L, 3901685760000L, 7803371520000L, 23410114560000L, 187280916480000L, 1123685498880000L, 10113169489920000L, 101131694899200000L };
    assertEquals(916581, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case210() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 5L, 30L, 240L, 1920L, 11520L, 92160L, 184320L, 552960L, 5529600L, 16588800L, 116121600L, 812851200L, 4877107200L, 24385536000L, 121927680000L, 975421440000L, 3901685760000L, 7803371520000L, 23410114560000L, 187280916480000L, 1123685498880000L, 10113169489920000L, 101131694899200000L };
    assertEquals(178937, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case211() {
    long coins_sum = 999999999999999984L;
    long[] values = { 1L, 5L, 50L, 700L, 10500L, 315000L, 4410000L, 13230000L, 26460000L, 79380000L, 158760000L, 317520000L, 5397840000L, 10795680000L, 86365440000L, 863654400000L, 13818470400000L, 41455411200000L, 82910822400000L, 1243662336000000L, 4974649344000000L, 84569038848000000L };
    assertEquals(754723, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case212() {
    long coins_sum = 930259427327999999L;
    long[] values = { 1L, 5L, 50L, 700L, 10500L, 315000L, 4410000L, 13230000L, 26460000L, 79380000L, 158760000L, 317520000L, 5397840000L, 10795680000L, 86365440000L, 863654400000L, 13818470400000L, 41455411200000L, 82910822400000L, 1243662336000000L, 4974649344000000L, 84569038848000000L };
    assertEquals(76406, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case213() {
    long coins_sum = 153994180618891442L;
    long[] values = { 1L, 5L, 50L, 700L, 10500L, 315000L, 4410000L, 13230000L, 26460000L, 79380000L, 158760000L, 317520000L, 5397840000L, 10795680000L, 86365440000L, 863654400000L, 13818470400000L, 41455411200000L, 82910822400000L, 1243662336000000L, 4974649344000000L, 84569038848000000L };
    assertEquals(599986, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case214() {
    long coins_sum = 999999999999999989L;
    long[] values = { 1L, 5L, 50L, 700L, 10500L, 315000L, 4410000L, 13230000L, 26460000L, 79380000L, 158760000L, 317520000L, 5397840000L, 10795680000L, 86365440000L, 863654400000L, 13818470400000L, 41455411200000L, 82910822400000L, 1243662336000000L, 4974649344000000L, 84569038848000000L };
    assertEquals(58547, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case215() {
    long coins_sum = 1000L;
    long[] values = { 1L, 1001L, 2002L, 4004L, 8008L, 16016L, 32032L, 64064L, 128128L, 256256L, 512512L, 1025024L, 2050048L, 4100096L, 8200192L, 16400384L, 32800768L, 65601536L, 131203072L, 262406144L, 524812288L, 1049624576L, 2099249152L, 4198498304L, 8396996608L, 16793993216L, 33587986432L, 67175972864L, 134351945728L, 268703891456L, 537407782912L, 1074815565824L, 2149631131648L, 4299262263296L, 8598524526592L, 17197049053184L, 34394098106368L, 68788196212736L, 137576392425472L, 275152784850944L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case216() {
    long coins_sum = 1000L;
    long[] values = { 1L, 501L, 1002L, 2004L, 4008L, 8016L, 16032L, 32064L, 64128L, 128256L, 256512L, 513024L, 1026048L, 2052096L, 4104192L, 8208384L, 16416768L, 32833536L, 65667072L, 131334144L, 262668288L, 525336576L, 1050673152L, 2101346304L, 4202692608L, 8405385216L, 16810770432L, 33621540864L, 67243081728L, 134486163456L, 268972326912L, 537944653824L, 1075889307648L, 2151778615296L, 4303557230592L, 8607114461184L, 17214228922368L, 34428457844736L, 68856915689472L, 137713831378944L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case217() {
    long coins_sum = 1000L;
    long[] values = { 1L, 1000L, 2000L, 4000L, 8000L, 16000L, 32000L, 64000L, 128000L, 256000L, 512000L, 1024000L, 2048000L, 4096000L, 8192000L, 16384000L, 32768000L, 65536000L, 131072000L, 262144000L, 524288000L, 1048576000L, 2097152000L, 4194304000L, 8388608000L, 16777216000L, 33554432000L, 67108864000L, 134217728000L, 268435456000L, 536870912000L, 1073741824000L, 2147483648000L, 4294967296000L, 8589934592000L, 17179869184000L, 34359738368000L, 68719476736000L, 137438953472000L, 274877906944000L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case218() {
    long coins_sum = 1000L;
    long[] values = { 1L, 999L, 1998L, 3996L, 7992L, 15984L, 31968L, 63936L, 127872L, 255744L, 511488L, 1022976L, 2045952L, 4091904L, 8183808L, 16367616L, 32735232L, 65470464L, 130940928L, 261881856L, 523763712L, 1047527424L, 2095054848L, 4190109696L, 8380219392L, 16760438784L, 33520877568L, 67041755136L, 134083510272L, 268167020544L, 536334041088L, 1072668082176L, 2145336164352L, 4290672328704L, 8581344657408L, 17162689314816L, 34325378629632L, 68650757259264L, 137301514518528L, 274603029037056L };
    assertEquals(2, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case219() {
    long coins_sum = 1000000007L;
    long[] values = { 1L, 1000000009L, 3000000027L, 9000000081L, 27000000243L, 81000000729L, 243000002187L, 729000006561L, 2187000019683L, 6561000059049L, 19683000177147L, 59049000531441L, 177147001594323L, 531441004782969L, 1594323014348907L, 4782969043046721L, 14348907129140163L, 43046721387420489L, 129140164162261467L, 387420492486784401L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case220() {
    long coins_sum = 1000000007L;
    long[] values = { 1L, 1000000008L, 2000000016L, 4000000032L, 8000000064L, 16000000128L, 32000000256L, 64000000512L, 128000001024L, 256000002048L, 512000004096L, 1024000008192L, 2048000016384L, 4096000032768L, 8192000065536L, 16384000131072L, 32768000262144L, 65536000524288L, 131072001048576L, 262144002097152L, 524288004194304L, 1048576008388608L, 2097152016777216L, 4194304033554432L, 8388608067108864L, 16777216134217728L, 33554432268435456L, 67108864536870912L, 134217729073741824L, 268435458147483648L, 536870916294967296L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case221() {
    long coins_sum = 1000L;
    long[] values = { 1L, 1000000007L, 3000000021L, 9000000063L, 27000000189L, 81000000567L, 243000001701L, 729000005103L, 2187000015309L, 6561000045927L, 19683000137781L, 59049000413343L, 177147001240029L, 531441003720087L, 1594323011160261L, 4782969033480783L, 14348907100442349L, 43046721301327047L, 129140163903981141L, 387420491711943423L };
    assertEquals(1, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case222() {
    long coins_sum = 1000000007L;
    long[] values = { 1L, 96453452L, 289360356L, 868081068L, 2604243204L, 7812729612L, 23438188836L, 70314566508L, 210943699524L, 632831098572L, 1898493295716L, 5695479887148L, 17086439661444L, 51259318984332L, 153777956952996L, 461333870858988L, 1384001612576964L, 4152004837730892L, 12456014513192676L, 37368043539578028L, 112104130618734084L, 336312391856202252L };
    assertEquals(28, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case223() {
    long coins_sum = 748919379254831498L;
    long[] values = { 1L, 33732L, 1135756440L, 37917228749400L };
    assertEquals(495478, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case224() {
    long coins_sum = 999991073807926199L;
    long[] values = { 1L, 33732L, 1135756440L, 37917228749400L };
    assertEquals(807240, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case225() {
    long coins_sum = 999866573231201566L;
    long[] values = { 1L, 1000L, 951000L, 1014717000L, 1033996623000L, 1102240400118000L, 999732042907026000L };
    assertEquals(64228, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case226() {
    long coins_sum = 999732042907025999L;
    long[] values = { 1L, 1000L, 951000L, 1014717000L, 1033996623000L, 1102240400118000L, 999732042907026000L };
    assertEquals(881148, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case227() {
    long coins_sum = 998731772723277869L;
    long[] values = { 1L, 72L, 4824L, 260496L, 19016208L, 1140972480L, 63894458880L, 5111556710400L, 306693402624000L, 20241764573184000L, 991846464086016000L };
    assertEquals(673248, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case228() {
    long coins_sum = 991846464086015999L;
    long[] values = { 1L, 72L, 4824L, 260496L, 19016208L, 1140972480L, 63894458880L, 5111556710400L, 306693402624000L, 20241764573184000L, 991846464086016000L };
    assertEquals(478775, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case229() {
    long coins_sum = 991170129704342844L;
    long[] values = { 1L, 13L, 273L, 3549L, 53235L, 585585L, 8198190L, 147567420L, 3098915820L, 52681568940L, 790223534100L, 9482682409200L, 237067060230000L, 2370670602300000L, 40301400239100000L, 967233605738400000L };
    assertEquals(495217, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case230() {
    long coins_sum = 967233605738399999L;
    long[] values = { 1L, 13L, 273L, 3549L, 53235L, 585585L, 8198190L, 147567420L, 3098915820L, 52681568940L, 790223534100L, 9482682409200L, 237067060230000L, 2370670602300000L, 40301400239100000L, 967233605738400000L };
    assertEquals(513718, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case231() {
    long coins_sum = 957912303391563248L;
    long[] values = { 1L, 5L, 35L, 140L, 700L, 1400L, 4200L, 33600L, 134400L, 1209600L, 10886400L, 65318400L, 195955200L, 587865600L, 2351462400L, 7054387200L, 56435097600L, 338610585600L, 677221171200L, 6772211712000L, 40633270272000L, 81266540544000L, 568865783808000L, 1137731567616000L, 4550926270464000L, 27305557622784000L, 136527788113920000L, 955694516797440000L };
    assertEquals(266515, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case232() {
    long coins_sum = 955694516797439999L;
    long[] values = { 1L, 5L, 35L, 140L, 700L, 1400L, 4200L, 33600L, 134400L, 1209600L, 10886400L, 65318400L, 195955200L, 587865600L, 2351462400L, 7054387200L, 56435097600L, 338610585600L, 677221171200L, 6772211712000L, 40633270272000L, 81266540544000L, 568865783808000L, 1137731567616000L, 4550926270464000L, 27305557622784000L, 136527788113920000L, 955694516797440000L };
    assertEquals(168139, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case233() {
    long coins_sum = 945982684066719310L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 80L, 480L, 960L, 4800L, 14400L, 86400L, 432000L, 3456000L, 10368000L, 41472000L, 207360000L, 1244160000L, 6220800000L, 12441600000L, 49766400000L, 298598400000L, 1492992000000L, 7464960000000L, 37324800000000L, 74649600000000L, 373248000000000L, 1492992000000000L, 7464960000000000L, 44789760000000000L, 313528320000000000L, 940584960000000000L };
    assertEquals(668259, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case234() {
    long coins_sum = 940584959999999999L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 80L, 480L, 960L, 4800L, 14400L, 86400L, 432000L, 3456000L, 10368000L, 41472000L, 207360000L, 1244160000L, 6220800000L, 12441600000L, 49766400000L, 298598400000L, 1492992000000L, 7464960000000L, 37324800000000L, 74649600000000L, 373248000000000L, 1492992000000000L, 7464960000000000L, 44789760000000000L, 313528320000000000L, 940584960000000000L };
    assertEquals(170273, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case235() {
    long coins_sum = 997319226872914842L;
    long[] values = { 1L, 3L, 15L, 90L, 180L, 720L, 1440L, 2880L, 23040L, 46080L, 184320L, 552960L, 3317760L, 13271040L, 53084160L, 106168320L, 212336640L, 1061683200L, 2123366400L, 8493465600L, 42467328000L, 169869312000L, 679477248000L, 1358954496000L, 2717908992000L, 5435817984000L, 16307453952000L, 32614907904000L, 97844723712000L, 684913065984000L, 1369826131968000L, 4109478395904000L, 32875827167232000L, 98627481501696000L, 197254963003392000L, 986274815016960000L };
    assertEquals(296583, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case236() {
    long coins_sum = 986274815016959999L;
    long[] values = { 1L, 3L, 15L, 90L, 180L, 720L, 1440L, 2880L, 23040L, 46080L, 184320L, 552960L, 3317760L, 13271040L, 53084160L, 106168320L, 212336640L, 1061683200L, 2123366400L, 8493465600L, 42467328000L, 169869312000L, 679477248000L, 1358954496000L, 2717908992000L, 5435817984000L, 16307453952000L, 32614907904000L, 97844723712000L, 684913065984000L, 1369826131968000L, 4109478395904000L, 32875827167232000L, 98627481501696000L, 197254963003392000L, 986274815016960000L };
    assertEquals(962431, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case237() {
    long coins_sum = 993470422441072172L;
    long[] values = { 1L, 4L, 16L, 64L, 128L, 384L, 768L, 2304L, 11520L, 46080L, 92160L, 368640L, 2580480L, 7741440L, 30965760L, 185794560L, 743178240L, 2972712960L, 8918138880L, 44590694400L, 178362777600L, 356725555200L, 713451110400L, 2140353331200L, 6421059993600L, 12842119987200L, 51368479948800L, 102736959897600L, 205473919795200L, 616421759385600L, 1232843518771200L, 2465687037542400L, 9862748150169600L, 19725496300339200L, 39450992600678400L, 118352977802035200L, 236705955604070400L, 473411911208140800L, 946823822416281600L };
    assertEquals(766974, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case238() {
    long coins_sum = 946823822416281599L;
    long[] values = { 1L, 4L, 16L, 64L, 128L, 384L, 768L, 2304L, 11520L, 46080L, 92160L, 368640L, 2580480L, 7741440L, 30965760L, 185794560L, 743178240L, 2972712960L, 8918138880L, 44590694400L, 178362777600L, 356725555200L, 713451110400L, 2140353331200L, 6421059993600L, 12842119987200L, 51368479948800L, 102736959897600L, 205473919795200L, 616421759385600L, 1232843518771200L, 2465687037542400L, 9862748150169600L, 19725496300339200L, 39450992600678400L, 118352977802035200L, 236705955604070400L, 473411911208140800L, 946823822416281600L };
    assertEquals(245654, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case239() {
    long coins_sum = 956730439666828340L;
    long[] values = { 1L, 2L, 4L, 8L, 56L, 224L, 448L, 896L, 7168L, 14336L, 57344L, 114688L, 229376L, 917504L, 1835008L, 3670016L, 11010048L, 55050240L, 220200960L, 880803840L, 2642411520L, 10569646080L, 42278584320L, 84557168640L, 338228674560L, 676457349120L, 1352914698240L, 2705829396480L, 10823317585920L, 21646635171840L, 64939905515520L, 129879811031040L, 389639433093120L, 779278866186240L, 3117115464744960L, 15585577323724800L, 31171154647449600L, 155855773237248000L, 467567319711744000L, 935134639423488000L };
    assertEquals(959009, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case240() {
    long coins_sum = 935134639423487999L;
    long[] values = { 1L, 2L, 4L, 8L, 56L, 224L, 448L, 896L, 7168L, 14336L, 57344L, 114688L, 229376L, 917504L, 1835008L, 3670016L, 11010048L, 55050240L, 220200960L, 880803840L, 2642411520L, 10569646080L, 42278584320L, 84557168640L, 338228674560L, 676457349120L, 1352914698240L, 2705829396480L, 10823317585920L, 21646635171840L, 64939905515520L, 129879811031040L, 389639433093120L, 779278866186240L, 3117115464744960L, 15585577323724800L, 31171154647449600L, 155855773237248000L, 467567319711744000L, 935134639423488000L };
    assertEquals(256601, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case241() {
    long coins_sum = 964563991928143931L;
    long[] values = { 1L, 4L, 16L, 32L, 160L, 480L, 1920L, 11520L, 23040L, 69120L, 207360L, 414720L, 1658880L, 3317760L, 6635520L, 13271040L, 79626240L, 159252480L, 318504960L, 955514880L, 1911029760L, 5733089280L, 22932357120L, 45864714240L, 137594142720L, 275188285440L, 550376570880L, 2201506283520L, 11007531417600L, 44030125670400L, 88060251340800L, 176120502681600L, 528361508044800L, 1056723016089600L, 2113446032179200L, 8453784128716800L, 16907568257433600L, 33815136514867200L, 135260546059468800L, 946823822416281600L };
    assertEquals(838830, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case242() {
    long coins_sum = 946823822416281599L;
    long[] values = { 1L, 4L, 16L, 32L, 160L, 480L, 1920L, 11520L, 23040L, 69120L, 207360L, 414720L, 1658880L, 3317760L, 6635520L, 13271040L, 79626240L, 159252480L, 318504960L, 955514880L, 1911029760L, 5733089280L, 22932357120L, 45864714240L, 137594142720L, 275188285440L, 550376570880L, 2201506283520L, 11007531417600L, 44030125670400L, 88060251340800L, 176120502681600L, 528361508044800L, 1056723016089600L, 2113446032179200L, 8453784128716800L, 16907568257433600L, 33815136514867200L, 135260546059468800L, 946823822416281600L };
    assertEquals(368049, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case243() {
    long coins_sum = 964542439179135108L;
    long[] values = { 1L, 2L, 8L, 24L, 48L, 144L, 288L, 1440L, 2880L, 14400L, 57600L, 172800L, 518400L, 1036800L, 3110400L, 6220800L, 12441600L, 62208000L, 248832000L, 497664000L, 1990656000L, 7962624000L, 39813120000L, 79626240000L, 238878720000L, 477757440000L, 1911029760000L, 3822059520000L, 11466178560000L, 103195607040000L, 206391214080000L, 412782428160000L, 1651129712640000L, 4953389137920000L, 9906778275840000L, 19813556551680000L, 39627113103360000L, 118881339310080000L, 475525357240320000L, 951050714480640000L };
    assertEquals(986882, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case244() {
    long coins_sum = 951050714480639999L;
    long[] values = { 1L, 2L, 8L, 24L, 48L, 144L, 288L, 1440L, 2880L, 14400L, 57600L, 172800L, 518400L, 1036800L, 3110400L, 6220800L, 12441600L, 62208000L, 248832000L, 497664000L, 1990656000L, 7962624000L, 39813120000L, 79626240000L, 238878720000L, 477757440000L, 1911029760000L, 3822059520000L, 11466178560000L, 103195607040000L, 206391214080000L, 412782428160000L, 1651129712640000L, 4953389137920000L, 9906778275840000L, 19813556551680000L, 39627113103360000L, 118881339310080000L, 475525357240320000L, 951050714480640000L };
    assertEquals(103584, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case245() {
    long coins_sum = 996692608371552143L;
    long[] values = { 1L, 2L, 6L, 24L, 120L, 240L, 480L, 1920L, 5760L, 23040L, 69120L, 138240L, 552960L, 1105920L, 4423680L, 13271040L, 26542080L, 53084160L, 159252480L, 318504960L, 1911029760L, 11466178560L, 22932357120L, 91729428480L, 642105999360L, 2568423997440L, 5136847994880L, 15410543984640L, 30821087969280L, 61642175938560L, 184926527815680L, 369853055631360L, 1479412222525440L, 2958824445050880L, 5917648890101760L, 41423542230712320L, 82847084461424640L, 248541253384273920L, 497082506768547840L, 994165013537095680L };
    assertEquals(513133, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case246() {
    long coins_sum = 994165013537095679L;
    long[] values = { 1L, 2L, 6L, 24L, 120L, 240L, 480L, 1920L, 5760L, 23040L, 69120L, 138240L, 552960L, 1105920L, 4423680L, 13271040L, 26542080L, 53084160L, 159252480L, 318504960L, 1911029760L, 11466178560L, 22932357120L, 91729428480L, 642105999360L, 2568423997440L, 5136847994880L, 15410543984640L, 30821087969280L, 61642175938560L, 184926527815680L, 369853055631360L, 1479412222525440L, 2958824445050880L, 5917648890101760L, 41423542230712320L, 82847084461424640L, 248541253384273920L, 497082506768547840L, 994165013537095680L };
    assertEquals(869166, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case247() {
    long coins_sum = 976795027249243562L;
    long[] values = { 1L, 2L, 4L, 8L, 40L, 80L, 240L, 720L, 3600L, 21600L, 64800L, 324000L, 1944000L, 7776000L, 23328000L, 93312000L, 186624000L, 373248000L, 1119744000L, 4478976000L, 13436928000L, 26873856000L, 134369280000L, 268738560000L, 537477120000L, 1074954240000L, 2149908480000L, 6449725440000L, 19349176320000L, 38698352640000L, 77396705280000L, 541776936960000L, 1083553873920000L, 2167107747840000L, 4334215495680000L, 8668430991360000L, 26005292974080000L, 52010585948160000L, 312063515688960000L, 936190547066880000L };
    assertEquals(182732, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case248() {
    long coins_sum = 936190547066879999L;
    long[] values = { 1L, 2L, 4L, 8L, 40L, 80L, 240L, 720L, 3600L, 21600L, 64800L, 324000L, 1944000L, 7776000L, 23328000L, 93312000L, 186624000L, 373248000L, 1119744000L, 4478976000L, 13436928000L, 26873856000L, 134369280000L, 268738560000L, 537477120000L, 1074954240000L, 2149908480000L, 6449725440000L, 19349176320000L, 38698352640000L, 77396705280000L, 541776936960000L, 1083553873920000L, 2167107747840000L, 4334215495680000L, 8668430991360000L, 26005292974080000L, 52010585948160000L, 312063515688960000L, 936190547066880000L };
    assertEquals(769403, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case249() {
    long coins_sum = 953009499393806963L;
    long[] values = { 1L, 3L, 6L, 12L, 48L, 96L, 576L, 1728L, 3456L, 6912L, 20736L, 41472L, 82944L, 165888L, 331776L, 1658880L, 4976640L, 14929920L, 59719680L, 119439360L, 597196800L, 1791590400L, 3583180800L, 10749542400L, 42998169600L, 214990848000L, 859963392000L, 1719926784000L, 8599633920000L, 17199267840000L, 34398535680000L, 206391214080000L, 412782428160000L, 825564856320000L, 1651129712640000L, 4953389137920000L, 19813556551680000L, 79254226206720000L, 237762678620160000L, 951050714480640000L };
    assertEquals(96579, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case250() {
    long coins_sum = 951050714480639999L;
    long[] values = { 1L, 3L, 6L, 12L, 48L, 96L, 576L, 1728L, 3456L, 6912L, 20736L, 41472L, 82944L, 165888L, 331776L, 1658880L, 4976640L, 14929920L, 59719680L, 119439360L, 597196800L, 1791590400L, 3583180800L, 10749542400L, 42998169600L, 214990848000L, 859963392000L, 1719926784000L, 8599633920000L, 17199267840000L, 34398535680000L, 206391214080000L, 412782428160000L, 825564856320000L, 1651129712640000L, 4953389137920000L, 19813556551680000L, 79254226206720000L, 237762678620160000L, 951050714480640000L };
    assertEquals(159689, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case251() {
    long coins_sum = 998430557452411015L;
    long[] values = { 1L, 2L, 8L, 32L, 64L, 128L, 256L, 512L, 2560L, 7680L, 23040L, 46080L, 92160L, 276480L, 1105920L, 2211840L, 8847360L, 26542080L, 106168320L, 424673280L, 849346560L, 1698693120L, 15288238080L, 61152952320L, 122305904640L, 489223618560L, 1467670855680L, 2935341711360L, 5870683422720L, 11741366845440L, 70448201072640L, 140896402145280L, 563585608581120L, 2254342434324480L, 6763027302973440L, 13526054605946880L, 27052109211893760L, 54104218423787520L, 324625310542725120L, 973875931628175360L };
    assertEquals(276398, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case252() {
    long coins_sum = 973875931628175359L;
    long[] values = { 1L, 2L, 8L, 32L, 64L, 128L, 256L, 512L, 2560L, 7680L, 23040L, 46080L, 92160L, 276480L, 1105920L, 2211840L, 8847360L, 26542080L, 106168320L, 424673280L, 849346560L, 1698693120L, 15288238080L, 61152952320L, 122305904640L, 489223618560L, 1467670855680L, 2935341711360L, 5870683422720L, 11741366845440L, 70448201072640L, 140896402145280L, 563585608581120L, 2254342434324480L, 6763027302973440L, 13526054605946880L, 27052109211893760L, 54104218423787520L, 324625310542725120L, 973875931628175360L };
    assertEquals(915531, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case253() {
    long coins_sum = 961320341778342848L;
    long[] values = { 1L, 2L, 10L, 30L, 150L, 300L, 1200L, 2400L, 4800L, 14400L, 28800L, 57600L, 288000L, 576000L, 2304000L, 9216000L, 18432000L, 73728000L, 221184000L, 663552000L, 1327104000L, 5308416000L, 31850496000L, 95551488000L, 191102976000L, 764411904000L, 1528823808000L, 6115295232000L, 18345885696000L, 36691771392000L, 73383542784000L, 220150628352000L, 440301256704000L, 1320903770112000L, 3962711310336000L, 15850845241344000L, 31701690482688000L, 95105071448064000L, 475525357240320000L, 951050714480640000L };
    assertEquals(245264, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case254() {
    long coins_sum = 951050714480639999L;
    long[] values = { 1L, 2L, 10L, 30L, 150L, 300L, 1200L, 2400L, 4800L, 14400L, 28800L, 57600L, 288000L, 576000L, 2304000L, 9216000L, 18432000L, 73728000L, 221184000L, 663552000L, 1327104000L, 5308416000L, 31850496000L, 95551488000L, 191102976000L, 764411904000L, 1528823808000L, 6115295232000L, 18345885696000L, 36691771392000L, 73383542784000L, 220150628352000L, 440301256704000L, 1320903770112000L, 3962711310336000L, 15850845241344000L, 31701690482688000L, 95105071448064000L, 475525357240320000L, 951050714480640000L };
    assertEquals(353165, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case255() {
    long coins_sum = 990816844392053228L;
    long[] values = { 1L, 2L, 10L, 20L, 80L, 160L, 640L, 1280L, 5120L, 15360L, 30720L, 61440L, 122880L, 614400L, 1228800L, 8601600L, 17203200L, 86016000L, 172032000L, 344064000L, 1032192000L, 4128768000L, 16515072000L, 66060288000L, 264241152000L, 1321205760000L, 5284823040000L, 10569646080000L, 42278584320000L, 84557168640000L, 169114337280000L, 338228674560000L, 676457349120000L, 4735201443840000L, 18940805775360000L, 37881611550720000L, 75763223101440000L, 151526446202880000L, 303052892405760000L, 909158677217280000L };
    assertEquals(822679, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case256() {
    long coins_sum = 909158677217279999L;
    long[] values = { 1L, 2L, 10L, 20L, 80L, 160L, 640L, 1280L, 5120L, 15360L, 30720L, 61440L, 122880L, 614400L, 1228800L, 8601600L, 17203200L, 86016000L, 172032000L, 344064000L, 1032192000L, 4128768000L, 16515072000L, 66060288000L, 264241152000L, 1321205760000L, 5284823040000L, 10569646080000L, 42278584320000L, 84557168640000L, 169114337280000L, 338228674560000L, 676457349120000L, 4735201443840000L, 18940805775360000L, 37881611550720000L, 75763223101440000L, 151526446202880000L, 303052892405760000L, 909158677217280000L };
    assertEquals(162208, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case257() {
    long coins_sum = 525046566973369290L;
    long[] values = { 1L, 4L, 8L, 16L, 64L, 128L, 512L, 2048L, 4096L, 8192L, 24576L, 98304L, 294912L, 589824L, 4128768L, 8257536L, 16515072L, 33030144L, 99090432L, 297271296L, 1189085184L, 2378170368L, 11890851840L, 23781703680L, 95126814720L, 190253629440L, 1141521776640L, 2283043553280L, 4566087106560L, 13698261319680L, 68491306598400L, 273965226393600L, 1095860905574400L, 3287582716723200L, 9862748150169600L, 19725496300339200L, 39450992600678400L, 78901985201356800L, 236705955604070400L, 473411911208140800L };
    assertEquals(219519, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case258() {
    long coins_sum = 946823822416281599L;
    long[] values = { 1L, 4L, 8L, 16L, 64L, 128L, 512L, 2048L, 4096L, 8192L, 24576L, 98304L, 294912L, 589824L, 4128768L, 8257536L, 16515072L, 33030144L, 99090432L, 297271296L, 1189085184L, 2378170368L, 11890851840L, 23781703680L, 95126814720L, 190253629440L, 1141521776640L, 2283043553280L, 4566087106560L, 13698261319680L, 68491306598400L, 273965226393600L, 1095860905574400L, 3287582716723200L, 9862748150169600L, 19725496300339200L, 39450992600678400L, 78901985201356800L, 236705955604070400L, 473411911208140800L };
    assertEquals(796175, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case259() {
    long coins_sum = 279086739617847446L;
    long[] values = { 1L, 2L, 6L, 12L, 24L, 120L, 240L, 480L, 3360L, 6720L, 13440L, 26880L, 80640L, 322560L, 1935360L, 7741440L, 15482880L, 61931520L, 123863040L, 247726080L, 495452160L, 990904320L, 2972712960L, 8918138880L, 17836277760L, 35672555520L, 142690222080L, 285380444160L, 1426902220800L, 2853804441600L, 8561413324800L, 25684239974400L, 51368479948800L, 205473919795200L, 410947839590400L, 1643791358361600L, 3287582716723200L, 6575165433446400L, 19725496300339200L, 39450992600678400L };
    assertEquals(137723, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case260() {
    long coins_sum = 986274815016959999L;
    long[] values = { 1L, 2L, 6L, 12L, 24L, 120L, 240L, 480L, 3360L, 6720L, 13440L, 26880L, 80640L, 322560L, 1935360L, 7741440L, 15482880L, 61931520L, 123863040L, 247726080L, 495452160L, 990904320L, 2972712960L, 8918138880L, 17836277760L, 35672555520L, 142690222080L, 285380444160L, 1426902220800L, 2853804441600L, 8561413324800L, 25684239974400L, 51368479948800L, 205473919795200L, 410947839590400L, 1643791358361600L, 3287582716723200L, 6575165433446400L, 19725496300339200L, 39450992600678400L };
    assertEquals(68450, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case261() {
    long coins_sum = 838118120615566916L;
    long[] values = { 1L, 2L, 4L, 12L, 36L, 72L, 144L, 288L, 576L, 2304L, 4608L, 23040L, 69120L, 207360L, 414720L, 829440L, 1658880L, 3317760L, 6635520L, 33177600L, 66355200L, 132710400L, 398131200L, 1194393600L, 2388787200L, 4777574400L, 14332723200L, 28665446400L, 57330892800L, 171992678400L, 343985356800L, 687970713600L, 2063912140800L, 6191736422400L, 12383472844800L, 24766945689600L, 49533891379200L, 99067782758400L, 594406696550400L, 1188813393100800L };
    assertEquals(81289, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case262() {
    long coins_sum = 999792063597772799L;
    long[] values = { 1L, 2L, 4L, 12L, 36L, 72L, 144L, 288L, 576L, 2304L, 4608L, 23040L, 69120L, 207360L, 414720L, 829440L, 1658880L, 3317760L, 6635520L, 33177600L, 66355200L, 132710400L, 398131200L, 1194393600L, 2388787200L, 4777574400L, 14332723200L, 28665446400L, 57330892800L, 171992678400L, 343985356800L, 687970713600L, 2063912140800L, 6191736422400L, 12383472844800L, 24766945689600L, 49533891379200L, 99067782758400L, 594406696550400L, 1188813393100800L };
    assertEquals(132836, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case263() {
    long coins_sum = 354239397783100078L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 48L, 96L, 480L, 960L, 1920L, 7680L, 23040L, 46080L, 92160L, 368640L, 737280L, 1474560L, 2949120L, 11796480L, 23592960L, 47185920L, 94371840L, 188743680L, 754974720L, 1509949440L, 3019898880L, 6039797760L, 24159191040L, 48318382080L, 96636764160L, 193273528320L, 386547056640L, 773094113280L, 1546188226560L, 3092376453120L, 12369505812480L, 24739011624960L, 74217034874880L, 148434069749760L, 296868139499520L };
    assertEquals(337818, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case264() {
    long coins_sum = 999851893834383359L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 48L, 96L, 480L, 960L, 1920L, 7680L, 23040L, 46080L, 92160L, 368640L, 737280L, 1474560L, 2949120L, 11796480L, 23592960L, 47185920L, 94371840L, 188743680L, 754974720L, 1509949440L, 3019898880L, 6039797760L, 24159191040L, 48318382080L, 96636764160L, 193273528320L, 386547056640L, 773094113280L, 1546188226560L, 3092376453120L, 12369505812480L, 24739011624960L, 74217034874880L, 148434069749760L, 296868139499520L };
    assertEquals(633376, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case265() {
    long coins_sum = 537073322163348587L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 22020096L, 44040192L, 88080384L, 176160768L, 352321536L, 704643072L, 1409286144L, 2818572288L, 8455716864L, 16911433728L, 50734301184L, 101468602368L, 202937204736L, 405874409472L, 811748818944L, 2435246456832L, 4870492913664L, 9740985827328L };
    assertEquals(51825, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case266() {
    long coins_sum = 999999864047665151L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 22020096L, 44040192L, 88080384L, 176160768L, 352321536L, 704643072L, 1409286144L, 2818572288L, 8455716864L, 16911433728L, 50734301184L, 101468602368L, 202937204736L, 405874409472L, 811748818944L, 2435246456832L, 4870492913664L, 9740985827328L };
    assertEquals(913276, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case267() {
    long coins_sum = 489638469252280122L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 603979776L, 1207959552L, 2415919104L, 4831838208L, 9663676416L, 19327352832L, 57982058496L, 115964116992L, 231928233984L, 463856467968L, 927712935936L, 1855425871872L };
    assertEquals(989159, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case268() {
    long coins_sum = 999998472478261247L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 603979776L, 1207959552L, 2415919104L, 4831838208L, 9663676416L, 19327352832L, 57982058496L, 115964116992L, 231928233984L, 463856467968L, 927712935936L, 1855425871872L };
    assertEquals(972473, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case269() {
    long coins_sum = 693677326943462970L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 192L, 384L, 768L, 1536L, 3072L, 6144L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 402653184L, 1610612736L, 3221225472L, 6442450944L, 12884901888L, 51539607552L, 103079215104L, 206158430208L, 412316860416L, 824633720832L, 1649267441664L, 3298534883328L };
    assertEquals(688220, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case270() {
    long coins_sum = 999997029369249791L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 192L, 384L, 768L, 1536L, 3072L, 6144L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 402653184L, 1610612736L, 3221225472L, 6442450944L, 12884901888L, 51539607552L, 103079215104L, 206158430208L, 412316860416L, 824633720832L, 1649267441664L, 3298534883328L };
    assertEquals(896394, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case271() {
    long coins_sum = 78837083869472337L;
    long[] values = { 1L, 2L, 4L, 12L, 24L, 48L, 96L, 192L, 384L, 768L, 1536L, 3072L, 6144L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 402653184L, 805306368L, 1610612736L, 3221225472L, 6442450944L, 12884901888L, 25769803776L, 51539607552L, 103079215104L, 206158430208L, 412316860416L, 824633720832L };
    assertEquals(822003, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case272() {
    long coins_sum = 999999503270412287L;
    long[] values = { 1L, 2L, 4L, 12L, 24L, 48L, 96L, 192L, 384L, 768L, 1536L, 3072L, 6144L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 402653184L, 805306368L, 1610612736L, 3221225472L, 6442450944L, 12884901888L, 25769803776L, 51539607552L, 103079215104L, 206158430208L, 412316860416L, 824633720832L };
    assertEquals(866881, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case273() {
    long coins_sum = 255000062226331761L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 48L, 96L, 192L, 384L, 768L, 1536L, 3072L, 6144L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 402653184L, 805306368L, 1610612736L, 3221225472L, 6442450944L, 12884901888L, 25769803776L, 51539607552L, 103079215104L, 206158430208L, 412316860416L, 824633720832L };
    assertEquals(331140, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case274() {
    long coins_sum = 999999503270412287L;
    long[] values = { 1L, 2L, 4L, 8L, 16L, 48L, 96L, 192L, 384L, 768L, 1536L, 3072L, 6144L, 12288L, 24576L, 49152L, 98304L, 196608L, 393216L, 786432L, 1572864L, 3145728L, 6291456L, 12582912L, 25165824L, 50331648L, 100663296L, 201326592L, 402653184L, 805306368L, 1610612736L, 3221225472L, 6442450944L, 12884901888L, 25769803776L, 51539607552L, 103079215104L, 206158430208L, 412316860416L, 824633720832L };
    assertEquals(748276, p8xcoinchange.solve(coins_sum, values));
  }

  @Test
  public void case275() {
    long coins_sum = 1000000000000000000L;
    long[] values = { 1L, 2L };
    assertEquals(499989, p8xcoinchange.solve(coins_sum, values));
  }

}
