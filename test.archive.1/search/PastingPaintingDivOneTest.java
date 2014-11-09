package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class PastingPaintingDivOneTest {
    PastingPaintingDivOne pastingpaintingdivone = new PastingPaintingDivOne();

    @Test
    public void case1() {
        String[] clipboard = { "..G", "R..", "BG." };
        int T = 3;
        assertArrayEquals(new long[] { 3L, 4L, 3L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case2() {
        String[] clipboard = { "." };
        int T = 1000000000;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case3() {
        String[] clipboard = { "RGB" };
        int T = 100000;
        assertArrayEquals(new long[] { 100000L, 100000L, 100000L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case4() {
        String[] clipboard = { "RB.", ".G." };
        int T = 100;
        assertArrayEquals(new long[] { 100L, 1L, 100L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case5() {
        String[] clipboard = { "R...", "....", "....", "...R" };
        int T = 2;
        assertArrayEquals(new long[] { 4L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case6() {
        String[] clipboard = { "..........G..........", ".........G.G.........", "........G...G........", ".......G.....G.......", "......G..B.B..G......", ".....G...B.B...G.....", "....G...........G....", "...G...R.....R...G...", "..G.....RRRRRR....G..", ".G..........RR.....G.", "GGGGGGGGGGGGGGGGGGGGG" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 2000000018L, 17000000048L, 2000000005L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case7() {
        String[] clipboard = { ".............", ".R.R.R.......", ".R.R.R.R.....", ".R.R.RRRR....", ".R.R...R.....", ".............", ".GGGG.G.R....", ".G....G.R.G..", ".GGGG.G.GGGG.", "....G.G...G..", ".GGGG.G...G.." };
        int T = 114514;
        assertArrayEquals(new long[] { 1030645L, 687124L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case8() {
        String[] clipboard = { "B..BBBBBBBBBBBBB.................BBBBBBBBBBBBBB...", ".B....BBBBBBBBBB................BB....BBB..BBB....", "B.B......BBBBBBBB..............B.B...B..B...B.....", ".B.B......B..BB..................B....B....B......", "B.B.........B..B...B...........B..................", "B..BBBBBBBBBBBB.B.B...........B.BBBBBBBBBBBB......", ".BBBB.......BBBB..B..........B.B.......BBBBBB.....", ".B...BBBBBBBBBB...............BBBBBBBBBBBBB.......", "B.................................................", ".B.........................B......................", "B...........................B.....................", ".............................B....................", ".............................B....................", ".................B................................", "...............BBBB...............................", "...............BBB.B..............................", "............BBBB..BB..............................", "............BB.....B...................B..........", "...........BB................B....................", "..........BB.................B....................", ".........BBB.........BBB..BBB.....................", "........BBBB......BB.BBB....B.....................", "..........BBB...BBB....B..B.......................", "............BBBBB.BBBBBBB.........................", "........B........BB.BBBBB......B..B...............", "......B.B..BB..BBBBBB.B.B.B...B..B.B..............", ".......B..B....................B.BB...............", "......B..B.....................B..................", ".....B..B.....BBBBBBBBBBBBBBBB...B................", "........BBBBBBBBBBBBBBBBBBBBBBBB..B..............B", ".......B.......................................BB.", "........BB..BBBBB......BB.BBBBBBBB...........B.B..", "..........BBBBBBBBBBBBBBBB..BBBBBBBB........B.....", "..........................................B...B...", ".........................................B..BB....", ".......................................B.....BB...", "B.....................................BB.B.B...BBB", ".BB.BB................................B.B.........", ".......BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB..........", ".................................................." };
        int T = 810;
        assertArrayEquals(new long[] { 0L, 0L, 65878L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case9() {
        String[] clipboard = { "B.G.B..GR.R..G.G..R..RGRBG......RB", ".BGB..R.GB.BG....GR..G.R.....BRB.R", ".GB.B...BG...GR.G..B..B.GRRBBBB.BB", "G..BRG...GB...B.G.G.....BBG..RR...", "BGG.....BGB..R.G.BBR..BR.BB..B.BR.", "B.B.R..BRB.R.B.BB.BRBGB.RR.RR.GG.B", "....RR.GR.B..GG....B.R..G..RB....G", ".GB.G..B.GR..G.B.....GR.GBRR..B.R.", "..R.R.GG.BB...BR.B.RR.BR...R..G...", ".B.B.......RBB.B...R.R....R..R....", ".R.B.R.RB.GG.B..GBRBRB...BR.R..G.G", "RR.BB..BR..GRG....G...RBB....R.GRR", ".R.......R.BG.GR....RBGR.GR.R..B.G", "...G....R...GGG.....RBRB.G.RRR.GRB", "G........RBB..BG.GGB.G..B...B..R..", ".B.GGR...B...BR..BB...GR...G..GG.G", "B.G...R.RRRR.G.......GGRG....RR...", ".GRR.G..G.BBG.B..R..G.R..BR.RGRG..", "B....G..BB...B.B....B....B......B.", ".....B...G.G...GRR.....RB..GRR...R", "R.GBGRBBRRB.....R......B......RR..", "BGG...GBB.R.G.GG.BG..G....R..GG..B", ".RRR.B.G.RRR.R.GRB...G...RB.B.....", ".RR....B.BG...G.........B.....R.R.", "GGG...G.....GBR...GG.B.B.R...GG.R.", "...GB.BGB.....BG.B.G.....G........", ".B...GR..GRRGR.GBGG....BG..R.R...B", "RB....RRR.B.R........B..B.B..BR...", "...GGR.RRB.BGG...G.B...B.R.RG.G.G.", ".R...GRB..G....G..BBRG.B......GRB.", ".RG.B.B.G...R.GB..R...RBRG..G.BBG.", "RB.R.G.GB.GGB.....GR.G.GR..G......", "R..BGGBBR.RGG...RBG.R.BR...GBRBBBB", "GBG...B..GGRRGRRRB..B..BR.B....RBR", "...G.B.B.GB.G.RG.G...GGG.R.B..R..R", "B.RB.B.RB...BG..RGGR...B..B...G...", "..B..B.R...RG....RBR..R...GR..R.BR", "G.R..R..G..BB..B.R.....G.RGG.....R", "B..BB.G...G.GB..R........R.G....B.", ".G.B.GGB...G.G.G..BRR..RGB.B......", ".B.R..R..B.R.R...G.BB.G.B.G....GGB", "G..RGRRBG......B.B..G.BBRB...B.G..", ".B....B.R.RBRRG.R.R..RB.BBRRR.RBBB", "....R.RR..GR.GBB.BG.G.G.GR.B.B...." };
        int T = 270216263;
        assertArrayEquals(new long[] { 6485190738L, 6485190730L, 7025623261L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case10() {
        String[] clipboard = { "...G.........BR.B..R..R....GRG.", "....BG..G.BRR...GR..R..G...RB.G", ".B.RB.....GRBBG..BB....GR.GB.B.", ".RBB.....R....R.GR.BR.G....BRR.", "GR.RB..BB.G..G...RR.B.BGR.BGGG.", ".R..R.GRG...G.GRGGBG...G.R.G...", "...G.R.G.BBRR.....RB.R.........", "...BRRG.R.G.....BRG......G.B...", "..G.B.....RB.R....BG..G...BBR.R", ".........R.....G.G...GB.G..G.GB" };
        int T = 472504414;
        assertArrayEquals(new long[] { 6615061849L, 6142557443L, 3780035361L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case11() {
        String[] clipboard = { ".B....G..G..R...BG.BGGG.GR....RB.......BR.RR", "B.B.RBG....B.B..BBB..G.G.B....G..B...GRR....", ".GRGRGRG...BG..GB.RGB..RR...G....RRR...GG...", "R.G.R.R.B..GG.G......G..BRBG...R.G..GRR..R.G", "..BB.RG.B...GBG...BGR.RR.B.R.R....BR.R.R....", ".BR.BG..RR.G..R.R...RB......BGB.G.RG...BBR..", ".RR..G......R.GR.BRG..R.BG.GBB..BG.R.GB.BBG.", "G..G..R...BR.GBB..G.G...B.R..B..BG.G..B.BR.G", ".B.....B.....G...R...GB..B...B....B..BG..R..", "..........G.BGG....RB..B.GRG.G.G...RB.B.....", "BGB.......BRG....B....B.B.G...BRG..B.BR..GBR", "....BR.R...B..G.R...GB..R...GGGG.B...BGRGBG.", "..R..B..G..R...G.R.....R..B.G.....GB.B.R..RG", "..B.B.RG..GGG......BGG.....BB....BB.GG.R..GG", "BG.R.B....GRRGR..BGBG..B......R..GG.....GG..", "R...RB.R..RR..B.R.....B.R.G.RBRGR...R.B.BGR.", ".B......BG.R....G.BGRRRB.RBG....RG.GBBBG.GGR", ".BRG..R...B.....BGB.GGR.RG.......BR....GB...", "BG...G.......R.....R..GG.GBRRBR..B.B.G.G...B", "R.BB.G..G..B..R.BB...BGG.BG..G.R.GR..RG.GGGG", "GB.GRRBR...BG.BG.RR...RB.B.RB.B.RB..R.......", "G.........RR.G..R....RBR.....R.BGG..BB.BRB..", ".B.......G.B...GG...R...G.....G.RGR...GR...B", ".....GG.B.G.BB.G.R..G..R..BR.GB..GB.G..G..GG", "..G....G......B...............BR..BG.GG..BG.", "RGBRG...BBR...BR..R.G.RBRGR..RGRGG.B.G.R...R", ".GG.R..GR...RGG........RR..B.....G.B..RG.BBG", "BR..........R..G........GGRRGR..R.BBG..GBR..", "GBG.GGGGR.G..GG.GG.R...GRGBG.B.BGGGG..RBG...", ".B.GGR.B..GR....RR..BBGGG.R.R.G.B...R.......", "G...R........RBR..B.RR....BB.RGBG.G....BR.BB", "B..G.R.RRGR..BBRG.B...GB...R..B.B......B....", ".B...G.R..B..B.BG.RGB.BGG.BRRBB...BG...G....", "BRRGGBB.RRBR...G.R.G..B....R...G.R.GR.......", "B..GG.....R.BRR..R..BR.BR...G..R.GR..B..GR.B", ".......B..GRR..R.R..........G...RGG....G....", "BB....RR.GB....GBG...RB..BGB...G.....R....R.", "BGR.RRB.RR.RB..GR.GB.BG...GGR..RBG..G...B...", "..G.R.G.GG.B.......G...G...GGG.RRB..........", "...GBR.RR.R.B.RR..........GG......BG..BR..B.", "....GG.........B..B....BG..R.BGGR...B.G..G..", "R.RG......B..RB......RRGG....BBGB..B....R.GB", ".RG...BG.B......B...RRRG.R..B.......G.BGRG.B", "..G.R.RG.G.G..R.B..B.....RRG...R.....GB.B.RG", "..GG.RG..B...R....R..B...GBR..B..G.RGB......", ".B..R..BB.....RR.BBR....R.R.RG..R.RBR..BBR.G", "G..BR..B......BR...B......BBR.....BG........" };
        int T = 589159523;
        assertArrayEquals(new long[] { 14728988636L, 18263945818L, 18853105306L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case12() {
        String[] clipboard = { ".....B....B.G.....RB..B......R", "...G..RG.BR.B.R.G.BG.BBG...R..", ".RB....B.RR...RRB..BGB...RG..G", "....RBG..GBR...GBR.BRBB.B.R...", "B.B....B....GG..BG.......GB.RR", "..GR....GR.GR.G..R....BGG.G.B.", "G.BB.BBR....GR.RR...GG....G..B", "R.RBBG.....G..GRGG.BR.GB...RG.", "R...GB.R.B....BGR.B.BG.GBB....", "RG..BGGR.BG..GR.G..RGR...G....", ".R...R.R.R..RB..G..........BGB", "BR..B.......B.RG....R...BB....", "........BRRRB.B..R.RBRG.B..G..", "G.B....BG.G...RB....GBRBR.GG..", "G........B..GRRBG.B.RG.R..G...", "G.G.....B.G.RG....BG.........B", ".GB.....R.G..RRR...R...R.BRRG.", "..BG.R...BBR......R..BGBGGGRR.", "B..GGGG....R.BBB.RBG.....GRGR.", ".R.G.B.B....GG.G.R.....G......", ".G..RBB...GBGRBGGBR.RG.GR..BG.", "GB.GRB.G..B.RGR.R..GRGG.R...B.", "GR...BGB...G..RRR.....R......R", "R..GG..R.RBRGG.R.....GRG......", "BR.....GRB......RB...R..GGB..B", "BG..BBR....G.....R..R....RR..G", ".G.....RR.RR.B..RG.BGB.....R.." };
        int T = 728463635;
        assertArrayEquals(new long[] { 13840809256L, 11655418362L, 13840809288L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case13() {
        String[] clipboard = { ".BG.G..BG.......B.BR.BG...B.G.RB.", "...BGR.BB.R..B.RR...GB.G...RGGR.G", "GRR.GB.RGR..BGB..G....B...BG...GG", "..GB.GB.BR.B...GBB.GB.GR.BRG.RR.B", "GR.R.B.B.....B......B..RG.RBRR.R.", ".B.R...R.GGG......GRR.GRR..GBR...", "R...R.GB.BG..BR......BG.GGGRB.GG.", ".R...R.B.GGB.BRGGG...GRRG....RG..", "R....BBR.G..BR....G.G.RBB.G...B..", ".GB.GGB....B.B..RB..G.BRGGR..R..R", "G..G.B....R.G...G...R.......RR..G", "G.R.....BRB..R.G......G....BG...G" };
        int T = 635369207;
        assertArrayEquals(new long[] { 8895168980L, 8895169004L, 9530538174L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case14() {
        String[] clipboard = { "G..GR.B.B..RG...GRB...BGRGRG....R......G", "BB..R.B.GRGG.B...G..RG.....GGBG..RBBGGRG", ".G.G....R.GGRR.G...RR....G..R..G.RGG....", ".GR...B...B.G.GB.RG..B....B..RRRB.....GR", "RB.G..GR..BBR..RRGB.R.GR.B..R...B...BGBB", "RG.RGB...G.....G.RR.G.GBRGGG...G....G..B", ".....G..B...G.GG.GBB.BB..B.BR.B..BBB....", "RGBG.BB...BB.G...B........G.......B.....", "R..R..GR.B..G.....G..GBBGR..RRRGRBR.....", ".BRB....GGG.RRRB..G......RBBR.GG...G.GBG", "R.B....G......R...R.RG.B...G.G.R...G.R.G", "..GR..RRB.G...RRG.RG.GRR..B....BR.B.RR..", "BG...R.B....RGR.R.G.BRG.RB.B....B..G...B", "....B..R..G..R.B...RGR.B...G..R......RG.", "..GG..G....BGBG...BR..R....B......GG..B.", ".G..R.G..R.RBG..BRBBR.....R...GBGBRG....", "BR....B.G.....R...B.B..RB..BG.....B.R...", ".BBB...G..BG..GGG..G...BR.....R..B..GGB.", ".BG.RB.R.RR..G.G.G.GBB.B...R..B.B....B.G", "...RRBBBR.G.GB..RR...RGBGR....G........G", "..RB..GG.GGGR.....RR....GBB.RB..B..BG.B.", "GRR.R..BB....B.B.R...G.B.G..GB.R..RR.GB.", "GRB...B.G..GR.RRRR....BG..BB.GR.G...BB.B", "B...G.G.GR.G...R.GRBR...GG.R.B...RBG....", "....BRG....GB..G...B.GG.....BBR.GRGRGB..", "...RBRG..G..RG..B.RR......R.GBG.GB....RG", "...RR..BGGB.GR......B...GRGR.R.R...B...B", "B...BGG....GB.GRB.B...BB.....GG..R..GRR.", "..B...G...R.B..R..B.BRG...BG.B.GGGBB.R.R", ".G.B.GR.GBG..B...B...GRB.R.R...B.B.RGG..", ".BB...R..RR.G..GRR....G..BB.RB........B.", ".........GB.RG..R..R...B......G.RR.R..BR" };
        int T = 31179904;
        assertArrayEquals(new long[] { 592418515L, 935397470L, 592418518L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case15() {
        String[] clipboard = { "..BBB.GG..R.R.R", ".BG.BB..BG.R..G", "...B.GR....GRGB", "..GBGR.R.......", ".B.GB.G.BBRGB..", "..RG.RR.R....GB", ".GGB.R..G...GB.", "R...BB.BR....B.", ".G..RG..R..BGRG", "......B.....GR.", ".BBGGBB.GBB..B.", "RBR..B.RRB...R.", ".GB..G.G.G.R.RR", ".....BRRG.BR.GB", "RB.R.R.RRR..BB." };
        int T = 24814237;
        assertArrayEquals(new long[] { 148885482L, 297770879L, 248142423L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case16() {
        String[] clipboard = { "R.G..G...G.RBG.G.G..B.G.G..B.B.G...BG.G.B.", "GB..GG.GR..R.RGR.G.G.GBG.GG..G..B.GG......", ".R..BG..R.........G...BR...B..G.B.B.B...RB", "G..BB.G....BGG.......B......R.B.R...GBRBB.", "RR.GRRRBBRG.R......GRR.G..RR.RR.B..R..R.R.", ".BR..BBG.R...RB.BBR.G..R.G..G...G..GBRRG..", ".RG.R..R..R..G..R...B..RR..GR..G.GR..GGGB.", "B......RBGR.R..R...GR.G...G.B...GG..G..G.G", ".G.RB......G.GR.....RBGR...RR.GGBR....B.R.", ".GG.....GBG...BGGG...BG..B....RG.......GGB", ".BG...B....R.G.G....G.RBGRR..R.G.G.....GGB", "G.B..RRG..BG..GGGBRBGR..R...BR.RR.R.GRR...", "BRR.......B.RB.BBR.BRG..G..GR...RG.GG..GR.", ".B..BGBBBGRRBRB.....B.B.BR.GB..GG...R.B...", ".G.B.R....B..R.GR....B.B.....G.BBG.R..G...", "....BR.R.GG...G...B.GRBRG...BBB....GB.B...", "..G...B...B.G....B...B..G....RGGGG.G.B.B.R", ".B.GG....BRRGG...........BRRRR..G..B..BG..", "G..R.....B.GGGBRB.R.R..G.G....RGG....BGG..", "BG.B....B.BRB..B.GB..GBGBG..B....G......R.", "BG..B...B.G...RR.R..RR.....R......GG....G.", "RRRR.GG.B...RG.R..RGGGG.....R......GBGB..B", "..G.R.GB..B...G..BBRB.GRGB.BG....R.RB.RB.B", ".......B.B.....G..R..GGB.RG.BB.G.G....G.RG", "....B..BRGG...GGGB.GG..R.G.RB....BR..GGG.G", "..B.G..G.B.R.R.G...........R.RR.......R..G", "...B..R.G...G.BG.B.B....R.B.B..R.GGB......", "BG.B..GG.GB.G..BG........G...BBR...B...B..", "B.G..R.B.B......BBGG....B.BB....G.R.GB.GRR", ".GB.R.R..RRRRB...R....G..RRBGB.R....R..RGG", ".R.GR.R....G.BR.RR.RG.B.B....BB...B.....R.", "...R..G.R....R...G..B.BBB.RB.....B........", "GG..R..R...G..RBR...B.R...GRRRRG.B.RGG..G.", "...R...B......BB..RR.R.GGBG.G.G...GRB..B.G", "...BR....GB..GBGG.R.B.G......BG.R...RB..G.", "RR..G..G.GG..GR........GRB.....G...G.....R", "...BB.G.RG.....G.G.R.GG.G.........RG..RR.G", ".BRRBBBR.B.B......R..G.B.R...RBRRG.....GRR", "....GB.GG......RGG.RB...G..RRB.B...BR.GR..", "......RRRG.G...BGGGR..R.G..G.R.BGGR..B....", "G.R...R.B....G.R.B.B.....G....GR....RRBR.B", ".BRB..RR.R..GBRBR..B.GG.G..G..G........RRR", "...RB...B.BB..R.......G.GGG.GB..RR..G.....", "..BR.R.GGGG.GRG.GBR..R.R.GRGR.RB.GBG.RB...", "..GG.G.G..B..RB.....R.G.G..BB.G.BBR....GRB", ".GR........B....B.....GB...RB.R.GR..G.....", "GB....G...G....RR...GGGB..BRRRG.R.B......B" };
        int T = 745640541;
        assertArrayEquals(new long[] { 16404092451L, 27588700619L, 20877935654L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case17() {
        String[] clipboard = { "..R.B.RGRG...BGB.R.B.G.GR..BG.", "GR..GG.RB.BGR.GG..GG..R..R...B", "...B..G.B..R..G..RRB.R...GG.G.", "R.G.G...........R...R.B....R..", "RB...........G.BGRGB.........R", "R..GGBB.R...R...R...RGR....B..", "R.R...G.B..B....GR.R...R..G.R.", "..GRR.B..G.R.B.....R.R....GG.G", ".G.GG..GGR..GGR.GGG......G.B.R", ".......GR..BRR...R...R.G.R.B..", ".GR........B...GG.G..B.BGGBB..", ".G..R.G...GRBBG.G..B..B.B.RG..", "R...RB..BB.RBB....GB.GR..B....", ".GBR..G....B.R.G.RBBB.B.......", "B.B.R.G...B.B.RBR.R.R..R.R....", "G....RRRBRRRB..BR......G.B....", "BB...R.R.GR..B.R..G.B..RB...R.", ".R.GB.BB....G.G.G.RB.B..RBB..G", "RBG.R.GB.R.GG.R.G.BG.GR..R.RB." };
        int T = 208734934;
        assertArrayEquals(new long[] { 3339759099L, 3757228948L, 2713554268L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case18() {
        String[] clipboard = { "RBG..G.R.R..G..RB.........B..B....GGB", ".GG.RRG.GBBR..GGG.GB..........BB....R", ".BR.G.GGGGG.RR.R.B.BBR........RRG.R..", ".G.B.R....R...GGB......B.B..G.GR.G...", "...RRBB.R.RGBG.GRBG........R..BGGG...", "R......GBR.G...BBR.G..R..B....G.R.R..", "B..GRG......GB..B.B.R..B...G.RRG..B.B", ".B..B.R..RR.....B.G...GB.BR.R.G..B.B.", "B.B..GB....R.......BGBB..B.G.........", ".BR..BG..R...B.R.G....G..B..RGG.B..BG", ".R....B...GG...G.G...R.R.RR...G.....R", "BR....GB.B.BG.GG.GG.RB.G.GG.GG.B..R.G", "..R.B.B.BR....R...GGRRRR.GBGRR..G....", ".RG.......G..RB.B..GRR.GBG.GRB...BRR.", ".G.....R.....G..GR..G.R...G....GRR.B.", "R...B.....B.R......RGRG...GGG.R....R.", ".R.GRGBRR...B.BBG...B..R.G..B.B...G..", ".BB.....G..B.G....GB..R....G.BB.GG..G", ".B...RR.GR.R.GBBRBB.B.B.B...RR.G.R.GR", ".....G.R...BRR..RRB.B.RG..BR...GR..B.", "..BR.R.....B.G...BR.RB.....GG.BR..B..", "....R.B..RG.GG.GBG..GG.B.GB...BG.BB.B", "B.B.B.R..B..R.......B....B.G.BG.G...B", ".R.G.GR.........BB....B..B.GRR.G.RG..", "..BBBR.GB.BG..BG..BG..GR....R..BR.BBR", "RB....R..G..RR.B.B....G.G.RR....BBG.R", "...B..BGR.BB..R..G.GB.....R..BR......", "....G.....R.R..R.....RBG...GGB.BB.B.G", "BB.B..BG..R..BB.R..G....R.GB.R.GR.B.G", "..G.GBB.RB.RG......G.BRG....G.G....GG", ".BR...GB.G.B...GG.BBBRG....B.B.BG..BR", "BG..GB..R.B.G.GR...RG.G....RB.G.R..G.", "RGGRG......B.G....G..G.R....G..B.R..G", "GGG..BGG..BG..R..G..BRBGRBGRBGGBBRG..", ".R.....R..R.B...BB.........RR.....R.G", ".B...BRRRRR.R...........R.RR..RG.G.B.", "..RB.RG.R...B..R...RB.G...RGB.G.B.R.." };
        int T = 296345729;
        assertArrayEquals(new long[] { 6519606380L, 5334223502L, 8594026534L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case19() {
        String[] clipboard = { "RG...BG..B", "...GBBB.BR", "..B.....RR", ".R.....RBG", "GGG.BRGR..", ".RGB.....B", "R...B.R...", "..BG...R..", "B.RG..RB.G", "GBG...R.B.", "..R.R.BBGB", "....R..G..", "GB.R..G...", ".R........", "GB....RB..", ".BB..BR...", "R..G...G..", "..BBRBG.BG", "....G.....", ".BB..G....", "GRB.B...RB", ".GB.RR.RGB", "..R.R...BG", "GGB..BB.BG", ".GRBB.RBBB", "..B..G....", "BR.B.....G", "G......B.B", "G.R....G..", "RBBBR...G.", ".......BG.", "B.G..BBB.B", ".GG...BGB.", "R..R.....G", "...GB..GGG", "..G.GR...G", "R..BRR....", "....R.GG.B", "..GRR.....", ".G...GR.B.", "GR.GG...G.", "B....RRG.R", "...RG.GBG.", "..........", "B.....R...", ".....B..R.", ".BG.G.....", ".RGR..B.G.", "...RBRBR.R", ".R....RBBB" };
        int T = 715276935;
        assertArrayEquals(new long[] { 12159707979L, 13590261864L, 15020815748L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case20() {
        String[] clipboard = { "..BGB.BR.B.G.B...B..RR", "R....G..BGGB..B.......", "...G..GG..GG..G...G.BB", ".BR.R....BG..BRRRBG...", "RR...GRG...B...B.BBB.R", ".....G..G.RRR...RBG.B.", ".GR.....RG..B.....G.BG", "BRRGR....G....BR..BBG.", "G.GB...BR.B..R...R...R", "..G.R...GR.RG...G....B" };
        int T = 348957297;
        assertArrayEquals(new long[] { 2442701132L, 3838530297L, 4187487596L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case21() {
        String[] clipboard = { "G.....G..BBRGG", "G.BGB..BB..GRR", "G.G....RG.G..G", "RB.BRRB...BBRG", "..BB..G...R...", "RG....G.G....R", "B...B...BBBG.G", "....B..R......", ".G....R....BR.", ".GB.R.RBR.G...", "..BBR.BB.....B", "RR..G..GR..R.R", "RBRG.G.RR.....", ".R...R.R.R...B", "B.BB...G....GB", "........G.G...", "..B.G.GGG..B..", "R.B..BB.G.B...", "B......BRGRBRB", ".BGR..G..R..BR", ".R.G..GB..RB..", "...BR.GB......", ".B.GG......BB.", "..GR.G....RR..", "RBGG.G.B..R...", "G..R...GBG..B.", "..R.G..R.G....", ".GG.....R...GG", "B...BG...G.BB.", "G.B..B...GG.BB", "G....B....R...", "BBRB.GB.B.RBG.", "..RRGBGG...R.R", "RGR.G.RBG.G...", "R..RGRG.G.G.B.", "...B..R.G.GG.B", "....R.BGR..BRG", ".BR..B.RGG..B." };
        int T = 922480324;
        assertArrayEquals(new long[] { 13837204975L, 17527126294L, 14759685305L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case22() {
        String[] clipboard = { "BG...GGBRRG", "RGG..B.G.G.", "......B.G..", "R.....R.R.R", ".R.B.G.G...", "RG..R..G..G", ".B..GB....B", "BR.B......R", "R...BRB....", "R..GG.R.GB.", ".RB...BGR..", "...RG.G...B", "..BG.RR.RBR", "..BR.R.....", "RB.BRRGG.GB", "G..GB.R.B..", ".G...R..G.B", "..GB.B..R..", "B......RG..", ".BR.GG.....", "B...B.RRBGR", ".BRRB.BRRG.", "GR..R..BR.R", "BB.........", "...B.GB.GGG", "G....R..RB.", "B..GGR.RB.R", "G....RBB...", "...G.RG...R", ".GB...B..GG", ".G......G.R", ".G.BBG.BG..", "..GR...R..R" };
        int T = 338657954;
        assertArrayEquals(new long[] { 4402553485L, 5079869395L, 4402553475L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case23() {
        String[] clipboard = { ".G..BB..G.R...RG....B..RB.B.RG......B.BR....", ".G...G.BRGG.BG.BG...B..B.GG...B...GRRB..B.RR", "...RB.RRB..RG.GG........G..B......GBGBG..G..", "B.B..RGBG.RBBR.GRR..BBR...R...GRRBB..B.G.B..", ".B........GG.G.GG...GGG.BR.R...B........RGBG", ".......RB.....B..B.GR.......R......B.G..RGB.", "......B..GR.BR..R..G.GBB.BRG..B.RR.R.....RRB", "RRG.G.RBBBGB...RG...R.G..GRB..GG.RRR.RR..B.R", "...G.B...R.......B.BR.......B.GG........R...", "R.....B.B......R........RBR.B.RGG....BGGG..B", "R.BR..G.G..G.BGB..G..B..G.B..R...........B.R", "GG..RB..B..B.B.GR.G....B.BB....R.B..B..R....", "..R..RBR.GR...G.B..BRG..B.BBGB..G.....R.....", "..BRG.R..GG.GB.GG.....G......B.R.R.RRRRGRB.B" };
        int T = 652579194;
        assertArrayEquals(new long[] { 9788688072L, 12399004802L, 12399004834L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case24() {
        String[] clipboard = { "...B.GG.RR..R.G....BRG.R....G.B.B", "G.R.RBGR.BGG.GGB....GR..BBB...R..", "...G....GR.GR.R.GBGRBG.BGBR......", "B..B...RB..GG..B.B.R..GG......G..", "BRG.G....RR.G.B.GGB......B..RR.GB", ".GR.BGRG.GG......BR....BR...G.R..", ".G....B.BG.B.....RRB.B...GGGRBG..", "..BG...RG..GR...RRG..RBG...G..B..", "...B..GRRBGR.BR.....G..GG.G..R.BB", "RR.RG..B.RR.B.BBB..RB.R.RB...G...", "R.G.G..R...GBR...R.B.R.......BRGB", "...........RR.B..BR..BBR.........", "R.B.R..B..BBBGB....GBRBBRG.......", ".RG......G.G.G.R..BG.BGGBGG.B....", "..BRR.B....G..G.G..BB.R...R.B.R.B", "R....G..GB..GGG.GB.B...RBG..RRB..", "......R.GR...BR..RGGG..BBBRGGB.B.", "..GG..G.G.GBRB.R.GRGBB.....GBBGBR", "BB....B..BBR.B....G..B....G.B...B", "RGBB...G.BR.RBB.RR...GBRB.B...R.G", "..GR.G..G....R....B........B.RR.R", ".G.RB.......B.....GGG..BRRG..GBRG", "..BRRB.G.R...BB....R..B.G..R.....", ".G....GRB.R..BGBR.BR.R.B.G....R.G", "..B.B..BGGGRG.B.R..G...RG...G..G.", "..G.....G...B...B..G..B....R.G..R", "R.RBR..BRGB.B..G..R.B...R.RB.....", ".BG..BR..RBGGRBRRG..BBR..BGG.GG.R", ".....BG..BR......RG....B.....G...", "G..R..GB...G...G.GG...GR.R.......", "R....G..RG.......R.BGG.....BBR.R.", "....R....G.G...B.G...R.R.RB.G....", "..GGRB.GR...RB.B.GG....RB..R.B.RR", "GBR.GG..GB..GBBRBBRGB..R.......G.", "GGRBBB....G...RGR..BR.GR..RR...R.", "..B...BRB.G...B..B..B.GR.B.GR.G..", "RG.G..........RRB.....G.GBG..RR..", "R.B..BGB.G......G...G..G.RRRB.G..", "..GGGRR...BB.BB.B...R.B...G.GGR.G", "...BRGRRGRG...BR.G...R.BB..R..G.R", "..R.....R.RR..B...GG.R..GBGGG...G", "B.RBGG..B.....BGR.G.R.G.R...BG.G.", "R..RG..BB..BB..GRR.G.RB.R..B.RR..", ".GRBB.RR.R..GBB.R.G.RB...B..RR.BR", "R.B..B.BR..GB......G..R..R...G.BG", ".....BG.RR...R.RGR.RB.G.B...GB...", "R.G.....BR.....G.RBR.GB........BR" };
        int T = 1930771;
        assertArrayEquals(new long[] { 61785054L, 48269697L, 34754328L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case25() {
        String[] clipboard = { "..B....B.R.R..BR....RR.....R.G.B" };
        int T = 885082;
        assertArrayEquals(new long[] { 5310492L, 885082L, 3540328L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case26() {
        String[] clipboard = { "B...B.GBBRG...BGR.BRR", ".GBRG...RRG..GGB.R...", "G...B....RR...B.G..R." };
        int T = 447530629;
        assertArrayEquals(new long[] { 2685183779L, 3132714406L, 3132714406L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case27() {
        String[] clipboard = { ".", "G", ".", ".", ".", ".", "B", "G", ".", ".", "G", "B", ".", "B", ".", ".", ".", "B", ".", ".", "R", "G", ".", ".", ".", ".", ".", ".", "B", "R", "R", ".", ".", ".", "R", "G", ".", ".", ".", "." };
        int T = 296719044;
        assertArrayEquals(new long[] { 1186876176L, 1483595220L, 1483595220L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case28() {
        String[] clipboard = { "BBR....B..G.R", "..B.RBGR..B..", "..B.G....BBG.", "B..GB.R....B.", "BR...RR.GB...", "BG...BR.B.G.B", "G.B...B.....B", "GB..B.B...BG.", ".G.....B..RRG", "R..B.B.RG.RB.", "BRBB....RBGRG", ".......G.BGGR", "..R.....GBGR.", "B..GG.GG...R.", "R..R.G.B..B..", ".RRG..G.RG...", "..G.B..BR...G", "G.......RB..B", "B..B....BR..B", "G.GGBG.RB..GB", "..RG..G...R.R", "..R...GG.B..B", ".GR........RR", ".R..GBRG..R.R", "B.B.R.R.RR.BB", "G..B.BBB.....", ".B...RB.B...G", "...G....G.GG.", "...R..B..G.G.", "....B...G...G", ".....G..BB...", "..R.GR..R....", ".B.G.G.G..RBB", "G..R...RGRGB.", "RR..GR.GB.B.G", "........RR...", "B......R.....", "..BB...RR.B.G", "B....R.GB.R.G", ".G....B..B.G.", "R.G.G..G.R..G", "....G...RB.G.", "G..BRG..R....", "R...G.GG.R...", "G......RB..RB", "....B..G..BGG" };
        int T = 495549088;
        assertArrayEquals(new long[] { 8919883700L, 7433236453L, 11397629166L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case29() {
        String[] clipboard = { "..RBRB...B.BR.R..R....R.BB.", "BRGR.G.RRG.BG....B.G...G...", "B..GB......RRB...B........B", "RRG.G....BG...RB.BBGB.GG..G", ".......RG...B.....R.R.BRR..", "....R.B...B.B..GR.GGRR...B.", "BBR..R.GB...BGG...R..G...B.", ".RB...B...R....RB.RBB.G..GB", "R.....G..BG....B....R..B..G", "...G...R.GG.......B..BB..G.", ".BB.GB.RR..G...BGB.R.GRRR.B", "...R......G.B.....RBBR..B..", "..R..G.GG..G.GR..RR.GGG...G", "B..BGGR.....R.R....G.RB.RBB", "....G.R..RR.G.G............", "G.....BG....R..BB.....G.BB.", ".B....R....R..B.R..B.....G.", "...G.B.GB..RRBRG.RR..BBB...", "..R..G..R.....R.B.GRB.GB..B", ".B...GRB....R.RB.....R.RBGR", "G......B.....GRR.R...B.....", ".B.G....B.R...B.RRGB.RR...B", "R.BBG.RBB....B...GB...RG...", ".....G.BGR..RRR.R...GRBG..R", ".....R.R.B..RB..B..GG...BRB", "BRBR....R.R.R.BG..BR.....B.", "BR..GB.BGG.G.......R.G..GRR" };
        int T = 776167839;
        assertArrayEquals(new long[] { 13971021289L, 8537846371L, 17075692674L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case30() {
        String[] clipboard = { "..RRRGR.RG.B.G.GR.R..R.GBG..", "RBB.R.R......B..G..R..R...G.", ".......R....R...B..RRG.R.BB.", ".R.G.BBG........R.G....R.RG.", "R.RGBGGGRB.B.G.....R......B.", "BG....R..G.R......BRR..G..BG", "G.BGG.GG..RB..B..G.BB.GG.RG.", ".....BG.R....RB.BGB.RB.GG..G", "...RB..G.R......G.B...BBBB.R" };
        int T = 639308840;
        assertArrayEquals(new long[] { 9589632638L, 5753779626L, 5114470767L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case31() {
        String[] clipboard = { "G.R.RBB.R.BB.R.GG", "GR...R.BGBR......", "..B......R...RR..", "BBGR.G...B.G..B.G", ".BR.R.G.GB...GG.G", "RGB.GGR.B.GB.....", "...G....BB.RBR.R.", "B....G...R......R", "G......R.GRB....R", "G.G.GBRRBR..RB..G", "..G.RR..G..G..G..", "B.G.RG.BG.BB.RGG.", ".BRRG.B.B.B.GG.G.", "..B.B..G...G..R..", ".GGRR...G...RBGB.", "R..GG..G.GG..GGBG", ".......B.G..B..RG", "......G....BB.BB.", "..RGR....B.......", "...R..GR....G...B", "R.G.G..G...R..GRR", "GRG...R..BGR..R..", "GG.RGBB..........", "..BBGRR.R..RRBGB.", ".GBG..BG..R.RRBB.", "..BRRBRGB.GBR.RR.", ".RG.G.RR..R...B..", "B.R.RG.R...R..RRR", ".B.G..B....BR.G..", "GGBG..B..R.B.GB..", ".G..R.B.BR..BGR.B", ".B.......G....RRR", "..G........G.G...", "RBRG..G..GR.RB...", "..B........GRG..R", "R...RG....G....RR", ".....GRR.G.B.G..G", "B..GGGG.G.R.RBBB.", "RG.G.....B......B", ".G..B..R...G...G." };
        int T = 765691629;
        assertArrayEquals(new long[] { 14548141115L, 15313832774L, 10719682948L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case32() {
        String[] clipboard = { "...RR...B...GRB..B..GR", "GGB..G.R.BRGRB..G.G..R", "..GB..G..BRGG...RRB.RR", ".G...BB.B.GRR.RRBRB...", ".B..G.R.GG.RBBGB.....B", "GB..BGR...B.....GG.BB.", "BGB..G...B...R.G......", "..B.G...G.R..B.G.BGB..", ".G..R..R......G....GR.", "...RRR.BG..RB.BG..RB..", "BB...B.B...B....B.....", "...B.BGR..GR......R...", ".....B.B.......RBBR..G", ".R.G.GB...B.R.GB.....R", "..R.R..B..BRR..G.....B", ".RR..BG.......R.....GB", "..R.GR.G...B..R.BR.B..", "RR...B.....R..BRG.B.BB", ".R.B..BG..BG.RG.B.G.RG", "..B.BR.RGG.BG..R.RRRGR", "BRBRBB..BB....BG.R..R.", "......B.....G...B.R..B", "G.R..GR.G..BG......G.G", "G..B...G..R.R.R.......", ".RB.R.B...B..BB.R.GB..", ".....B..RR.GR.....B..B", ".B.R.GG..R.GRG..R.....", ".R..B..B.B..R.GG....G.", "..RB...R..G.......B...", "...B.B.....GB..R..R.G.", ".G.....R....R.R...R...", ".B.GB........B........", "B..B...G..BRRRGG..BGG.", ".BBG....RR....B..G...R" };
        int T = 424925033;
        assertArrayEquals(new long[] { 7223725758L, 5948950617L, 9773275964L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case33() {
        String[] clipboard = { "...R.B...G....B...G", ".RGBB.GR.G..R.BRRBB", ".G.G.BB.G....GGGBB.", "B..G.G...G.BG..B..G", "G.R..R...G.........", ".RG...GGR...GR...B.", ".BRR..BG.B..B..GGG.", "...RR...BBGR......G", "........GB.B.......", "R..R...B.RR.GRRGBR.", "......R.G...GRB....", ".GR..RG.B.R.GR.R..B", "B.BB..RGGGBBG..B.BR", "..B.RR....GGB..R...", "....G..B........GRG", "...RGG.....GR...B..", "..R..B.R.RRB...RR.B", "B.R...G....R.B.....", "G.R.R.........R...B", "........B.GR...RR.B", "..R.BR.GRG.R......G", "B.BG...GG...R.G....", ".BB.RR.G.....BR...G", ".R..G....GB.....B.B", "G...B...G....G..B..", "..R.R.BR.R.G....GGG", "..RR.........B..R.G", "G..G..RR..B.GGB.B.R", "..R....RG....G.....", "B..BBB...B..B.RR..R", "....B..GG.B..RBB...", "..........B...G..RB" };
        int T = 271369638;
        assertArrayEquals(new long[] { 4070544723L, 3799175072L, 4884653606L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case34() {
        String[] clipboard = { "..", ".R", ".B" };
        int T = 846824491;
        assertArrayEquals(new long[] { 846824491L, 0L, 846824491L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case35() {
        String[] clipboard = { "BB.BRRR.RRR....R.", "BR....BB..RG...G.", "RG.BBBB..R..B...G", ".GRG.RB..R...B...", "..BG.RR..G..G..BR", "G.B...R...GR.R.G.", "...RGG.GR.RG...R.", ".G..BG.GR.G.B..GR", "GB.R..B...GRG..R.", "G.......GB...B...", ".GB.G.G.R.......R", "....G..RG.B...B.R", "R.....R.B.....GR.", "G.R.RG....BB.G.G.", ".RB.GB...RRG..GRB", ".B..GRBGG...BGB..", ".RB..G..B.G.....G", "B...R..BGBB....R.", "..GBB..GBGRGR.RGG", "RRB.BB..G..G..B.R", "..R..GGRBBGGGB.R.", "G.....BR....RG..R", "....B.BG....B.BGB", ".GBRB.B.G.R......", ".BR..RGBGB.......", ".G.RG.G.R..B.BG..", "R..B.B.G...GGR..B", "....GR.B...R.B...", "......G.B..B.RB..", "G.RR....BRBG...G.", "RR.RRGB....RB...B", ".BRB.RGBB..G.BGGG", "...GBBB....BB..B.", ".B.R..R..G..B.B.B", ".RRR..GG.G.B..RB.", ".R...BR....G...BB", "BB..B......R.....", "RGR.G.G.G..RB..BG" };
        int T = 661825469;
        assertArrayEquals(new long[] { 15221985924L, 9265556734L, 9927382212L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case36() {
        String[] clipboard = { "GB.RB.G....R..RBG.BGBG.R..G.B.B...GB.R...B", "R..BRR...B..B..R.RR.BGBB.B.G..G.R..B...B..", ".G.G..R.....R.BRR..BG..GB.GB.G.R.B....G...", ".G.B..R.G.GG.R.GG..G..B.R...G.GR..BB....G.", "B.B.G.BB..R.......BG....BB...G...B.R.BBG.R", "....BG..GGB..B.GGR....G....GR.R.B..G...GR.", "....GG..RG....RB......BG...........R..R.B.", "BGGB.RB.....BRBR........BBRGB...BG..R...B.", "R.GR.RB......G..G.GR...G..GRG....BB.BRGBB.", "..G......BB...B..GB.B.......R.B.....B.BB.G", ".G.BGGR.B.R.RG.G...R.BG.GB.BG...R...R.G...", "GGR....B..B.B.RRR.......B.BB....B.GG.....B", "R....R...B.G.BB..R....G...B..G....R..R.R.R", ".GGRB.GR.B.G..RG......B.....GB.G.RRB.GBBR.", ".GRR.RBR.R.BBBBGG..........R..R.RRGG.BG.G.", ".BRGBG.BR.G...RBGG.RGG..RBB.BBG.B..B.R.BR.", ".R...B.BG.R.G.RGRGGG..G...GGGR.R.BGBGRGGR.", "RB..RRGR.RG.......BG...G.B...BB.B...RR...G", "......B.GRB.B..G..R..B.GG.G..GG.R......R.R", ".GR.GR.BR...RB.G.G.BG.B...BB......B.....B.", "....R.G....G.RR..R..G.B.G..RGGG..R..G.GG.B", "GRBBRBR.RGR.G.....R.B.BGBGBR.RB.....GGG.G.", ".R..RGBB.RR..GRR.G.RB....GB....G.G.B.R.B..", "G.......R....GG...G.BB.B...B.G.G....B.R.B.", "G.R.....G.R.B.BGGBRBGB......GRBRG.....BBRR", "B.RB.B...RB.B......GGG.R....RR....G.RG.G..", ".........BR.RB..GRG.B..G....B.R...G..R.BB.", "..R...BR.G.G..B.R.R.R.R..R.RBBG.RR.....G.G", "R.....R..R.....RGBG.GG.........G.......G..", "R.G.RGR..R..RG......G....RGG.RRRB...G.BG.G", ".RRB.GB...BRGB...GR.....R...R..GGBBBR..GBB" };
        int T = 614640554;
        assertArrayEquals(new long[] { 11678170859L, 14751373693L, 15366014204L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case37() {
        String[] clipboard = { ".R..R.", "GBGR.R", "..RR..", ".BR.B.", ".GB...", "GB....", ".BR.GB", "G...G.", "..BG..", "......", "BB..B.", "B.R..G", "..G...", ".R..B.", "GR.G..", "G.GR..", ".B...G", "B.....", ".GBGBG", "BGBB..", "..RG..", "RG...B", "RBGGBG", "R....R", "R.B..B", ".BBR..", "..G.G.", ".G...R", "G.GRRR", "...R.G", "..R.GG", "......", "GB.GB.", "R...G.", "GG...R", ".RR.BB", "GRR.R.", "BG....", "RB.G..", "BRRG..", ".R..G.", "RBG.BR", ".RB..B", ".B.G..", "BGR.R.", "G.B.B.", ".G..B.", "B..G..", "R.R.B.", "......" };
        int T = 725893162;
        assertArrayEquals(new long[] { 11614290628L, 11614290643L, 13066076962L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case38() {
        String[] clipboard = { "G.GBB.G.RGGB.....R.G..." };
        int T = 860358260;
        assertArrayEquals(new long[] { 1720716520L, 5162149560L, 2581074780L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case39() {
        String[] clipboard = { "GBBGRRG.BRGBRGR", "GBBBBBRGR..GR.G", "RBRRBRRBBBB.R..", "GRBR.B.GBG.R.R.", "B.BRBR.RRBBBRBB", "GRR.RB.GGRB..GG", "GGGR.GRRR.R.BGG", "RRR.RB.RRRBR.R.", "BBB.G.GG.B.BRGG", "GB..RRBRBRRB.BR", "BRGRBBRRBRBGGBB", "B.BR.RRBBR.RRGG", ".G.BBBRGRRGRBRB", "GR..BRB...G..RR", "BRRRR.RRBRBRGG.", "BG.BBGRBGR.G.B.", "RB..B.GR.R.RG.G", "RGG..RB.GBBBG..", "RBGBG..BGRR.GG.", "B.B.BGR.R..G.GG", "..GG.RGGBRGGBBB", "RGGBRR.GB.GG.R.", ".GB.RGBGRRBBRGB", "BRRRBGR.RGRB...", "BB...BRRBGRBR.G", "BRG.GBBG.GGBRRR", "RG.GBGBB.BG.BG.", "GRBGBRBR.GBRB.R", "GGR..R.RBRBR.RG", "RB.RBGRGG.RB..G", "R.G.B.GRBBRGRGR" };
        int T = 190339112;
        assertArrayEquals(new long[] { 3235765048L, 2664747683L, 2664747706L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case40() {
        String[] clipboard = { "..RRG.G.B.GRRG.", "BR.GGRRB.R.GRBB", "BG.G..GBGR.B.BR", "GB.RGRRRGRGR.B.", ".GGG.RG.B.RBR.R", "RGG.RGGRBG..RG.", "RBRRBG.R..GGGGR", "GG.G.RBGGBRRR.." };
        int T = 448575672;
        assertArrayEquals(new long[] { 4037181078L, 3588605409L, 1794302706L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case41() {
        String[] clipboard = { "R.R.R.RRRRRRRG.RB.BGBGBGB.GGBGR.BBBB.BBR.B", "BRRBGBB..R.GB..GR.RBRBGRB.BRR.BB.RRGRG.GG." };
        int T = 430486245;
        assertArrayEquals(new long[] { 6457293685L, 4304862455L, 6887779928L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case42() {
        String[] clipboard = { ".GBBB.R..GG.", "B.GGG.RGR..R", "RBBRRRRBG.RB", "RRRGGGR.BG.B", "RGBRB.B.G.GG", "GBGRRRGRRB.B", "GB.R..GGG.BG", "BRB...GBBRGG", "RRGG.GBBR.R.", "RGG...RGR.BG", "GBGGGG.GRGRG", "BBBGRBB.GGBR", "RRBGB.BRR..B", "GRBBBRGRBRBR", "GR.GGRBRRG.B", "BR.RGRBBBB.B", "RBGBGRBG.R.R", "B..BB.RGBGRB", "RBGR.BGBBBGB", "GB.BBGR.BRGR", "RGGG.BBRBBRR", "RBGGGRBBBBB.", "RBG.GRRGGG.B", "..GGRRGG..G.", "..BBGRRRG...", ".GG.GGBBRBBG", ".RBR.RG....R", ".GRBGGRGRGGG", ".RGRBBGG.G.R", "RBBBBB.GRGBG" };
        int T = 870041947;
        assertArrayEquals(new long[] { 15660755133L, 10440503480L, 8700419567L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case43() {
        String[] clipboard = { "RG..GRRBBGBGR..BGGBRB.G.BB.BGBR.RRGGGBG.RG", ".GBBB.GGG.B.RR.BBBR.G.GRR.BBRBR...GGBG.RGB", "B.B.BBGBB..GGGBBB.G.GBGBRBBR...BRRBRRG.GRG", "GB...G.BBRGGRB...RR..RR..RBR.BBR.BBBRB.RGB", "R.BG..GBB..RRGBRR..R.G.GRBRGGRRBRBRBBGRBGB", "BRRR.B.RBGGBGB.BBBRRRG.BGBBGGGG.GGG.G.G.B.", "RG.BB.B.B.R.RRBGGGRRRGBBBGBB.RBG.GB.B.G...", "GR..B..B.BB.B...BGRBRGRB.BBRB....GGBRBBBRB", "RGRGRB.G.B.GRBGBB.GGRBGGR.R..B..RGBBGG....", "GBBB..R.GB.GRBGRRGBRBRBRRG.R.B.GGBR..RG...", "GBGGGG..BRGGRBB.RGGRGG....B.RG.GGR.BBBBBGB", ".RBBR.RG.RRR.GBG.GBGG.RRGBR.RRGBBBGRRGBGGG", "RBG...BGBRB.RRRBGBGB..RB.RBBGRR..GGRGGBGGG", "RGRG...GRBRGBRGBG.RRR...RGGBBGG.GB.B.GGBG.", "GBGRGR.BBRBRBRGRRBG.R.BBBB.RGRR.BBRRGGRRBB", "BRBBRRGGRBBBG.RRG.BRB.RRR.GBBBGGRR.R.BGRRG", "G..BGG..BG.RRRRRBRRRG.B.RBR..RG..BBGRBRG.R", "B.RRG..R.GGRGBRRRGRBBGGRRRRBGBGGB.RRGBG..B", "GBBR.RRR.GRR...BRGG.G.RR.R..GGRRRBBRBBRBGG", "GRR.BB.GGRBRRBBGBGBGG..BBB...G..GBRR....RR" };
        int T = 796116956;
        assertArrayEquals(new long[] { 12737871534L, 19106807181L, 16718456343L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case44() {
        String[] clipboard = { "BRB..B.GB..RBG...RG.GBBR.RG...", "RG..GGR.B.GGRBRGG.GRGBBG..GBRR", "BGBRGRRRGR.BBG.BR.RRGBR.GGG.RG", "RBGR...RBGR..RGG..BBG..R.RBRR.", "GG.RBRG.RBRRBBGGR.B.RG.RR.RBGR", "..G.RBG.GBGBGGRB.BGR.RR...RGBB", "GR..GBGG.BRRGBGGGRBRBGRGGGBGRB", "BBRBG.RGRBBG.GBRRG.R.GRBRBR.GB", "GB.BRRGBG.G..B.BGBB.BBBRRB...G", "GBG...GRGB...GGBGGBBRRGRB..BB.", ".BRRRBBRBR.G.BRGBRGB.RRBR.BGBG", "GR.GR.GBB..R..BG.B.BGGG.GBBBG.", "R.GBBR....R.R.GBG.G.RBBRBRR.GB", "BGB.RGB..GRG.B.BGG.B.....RRGBB", "BRR.BGBRBGR..RG.GRB..GRBRBBG.G", "RBGG.RGRGR..R...BBRR.GGGGGGBRG", "...RGBGGRGRGGR.GG.R.BGGGG.GBBG", "B.BBR.RRBRBG..GRG.RR.BGRRR.BRG", ".GBRB..G.G.GB.RGRBB.BG..GB.G.R", ".R.RRGGGGGGGGRRRR..GGBRRGG.BRG", "GBRBRR.R.BGGRRB.RG.GRRRGRRBRR.", "GR...BR..RGBBRBGBBGGGRBGR..BBG", "RBBRGRR.G.GRGRBRRRRBGRGRRRBRRG", "RRG....GGB.BBB.BBBB.BR..BRGG.B", "GGGRBR.G.BGR.BRRBRRBRR.GBG..R.", "G.BB.GRRBBGBGBRB.GBRRBGR.R.GR.", "B.BRBRBGR.RB..G.G.GRG.GRRRR..B", "GRB.GBB.GGBB.G.RBGB..B.RB.GGRR", "R.BBRBRBRBBRBB.RB.G..RGR.GB.G.", "RRBBR.B..GGRB.GR..RGB.B.RGBB.R", "BRG.RBBRR.RGRGB.GGR.GRB.RRBRRR", "GRBRBBBGBB.R.GRGRBGGGGG.RBG..B", "BR.GBGGGRRRRBRR.R.RGBBGRG.BGR.", ".RG.BGBG...GBRRBRBGRB.G.GBGRB." };
        int T = 850650392;
        assertArrayEquals(new long[] { 16162357767L, 21266260106L, 14461056955L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case45() {
        String[] clipboard = { "BGG.B.G.GR.GRGRBRB....R...GBBBG.RGBGBRBGR", "RG.RG.RGB..RBGRRBGR.RBB.GBRBGRRG.BRG.GBRR", "GRGBR..RBRBB.BB..R.G.BRB.R.R.B.RB.R.GR..B", ".BRB.R.BGGBB..RRG..RBRRRG..B.BGRB.BRGBBG.", "RBRGGGGGR.B.R.RBGRGBBG.GB.R....GBG..GGGBG", "GGR.RRGR.GBBRGBGBBBGBGR.BGGR.RRRRBRGRGR.G" };
        int T = 263715982;
        assertArrayEquals(new long[] { 3955739793L, 3955739786L, 4219455766L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case46() {
        String[] clipboard = { "GB.RBBGGG...G.GGRRBGGRGGBBB..B.BB", "B.RGR..BG.RBGRB..BR.GBGR.RBBBRGG.", "..R.B.RBGR.RGR.BGGBR..G.B.RBBGRB.", "RR.RBB..B..B.RGB.GRRGRRRBRG.GBBRG", "..G..GBB.BBGRRRRGGRGG.R.G.R.RBB..", "RRRBR.BR.B.RRG.RBRBG.BBBBBGGBGGBR", "BG.BG.BRR.GGGBGBRGRBGGGGBRR.GRBGG", "GGGBR..BGB...RG.RGBRBG.GGRRG.BRBG", ".RBGRGRRGBBB...RBGBGGR.G.GR.GB.G.", "RRBBG....GBRGG.BBGGB.G.B..GBBGG.B", "B.BGGRB.GGB.RRBBGBRBBB.BBR.GG.GRG", ".BR.B.GBGRGRGGBBBRRR..GBBGRGRRBR.", ".RB.BBRRRBG.RB.RGR.B.G.BBGBGGBRR.", "GGBG.R.R.GR.G..GR.GBRRRRBBBGB.BRR", "GBG.B.BGGBG.RRBG.RG..GBRBRGGRGG.B", "BRG.R.RRB.BB.BRG.G.GGRRGBBGGGGBBR", "RGGRRG.BRGR...BGRRR..GRRG..GGBGB.", "BGR.RGGRBB.BB.RGB.R.BGRRRBR..RR.B", ".GRRB.GG.BGG..B.GR..BRRB..GRRBBGR", "GR...R..B.BRRGRGGBRG..G.RGRBBRG.R", "R.R..BRBRBG.G..G.B.BRB.RBGGGGB..B", ".RGRRGBBB...GG.BR.B.GGR.BGG.GRR..", "BB..RBBGR..GRGBBRRRGBG...G.B.R.GG", "GBRBB..R.GRBGBBBBGRBBGBBRBB.GGB..", ".GBRRG.B.GRG.GBBG...GBGG.RRB.BBBG", "BGBRR.GB.BGRRG.G.BBRR.GR.RGBRGGGB", "BR.RRRBR.R.B...BRG.BRR.RRGB.BBGBG", "GBB.BGGR.RBB.RR.BBRB.GR.G..RBRRRR", ".BRB..G.....GGRRR.RG.GRR.RRGGRRRB", "RGB..BGGBG..GGRGG.B.RRBBGGR.BBGRR", ".G.G....GRGGBRRRR.RBR.GGBRRBRRB.G", "..GRRBGGRR..RBR..BRR.BRGG..GBRBRB", "G.GR.RGRGGRG.BGGBBRBRBBGB.BR.GG.G", "RG.BBRGRBBB.RGR...BRBBG..RGRGB.BR", "RGB.BG.GRBRBGG.RR.B.GGRBBRBB.BBGB", "R.B.BRB...RRBBBGBGR.BB....B.GG.GR", ".B.BBRGBRGRGBGRG..R.BG.GBGRGBGGBB", "BGRRRR.BBBBGGR.RGBBRGG..BR..RGRRB", "G.RBBR.G.RBGRR.GGBRG.RRRB.GB.RRRR", "..GGB.G.GGGBR.RBRG.RBBG.BBGBGRR..", ".RGB.RGB.RBGRRGGRBGBRB.B.R..RRRRG", "...G.G.BG.B..GGBGGGRGGBBGGBRGG..." };
        int T = 218421855;
        assertArrayEquals(new long[] { 4586859361L, 5897390509L, 5242124953L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case47() {
        String[] clipboard = { "GGBGRG.BRB.R.BGBRRBB.GBB.", "..BRRGG..RB..BRGRBGR.BB.R", "BRBGGGRR.B...BRBRR.B.GG.G", "R.BGRG.RGGB.BBRR.BRRGBGBG", "GGR.RBG.GGB.BRB...BRRBRBR", "RG.GRG.GGRR.G.BB.BBB.RGRB", "GG..B.GBBGBGB.R.B..B.GB..", "GBGG.RR.RBR..BRRGGBBR.GB.", ".RGGB..RRR..GRRGGBG.RRBGR", "B...RBB.RR.BGGGB..GG.R..." };
        int T = 599256141;
        assertArrayEquals(new long[] { 4794049187L, 5992561470L, 8389586046L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case48() {
        String[] clipboard = { "RG.RRRRB.BB.GB", "RBR.RGBRR.B.GR", "RB.BRBBBG..RB.", "BBGG.RGGRBGB.B" };
        int T = 521930154;
        assertArrayEquals(new long[] { 4175441240L, 1565790471L, 3131580937L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case49() {
        String[] clipboard = { ".B.BBBBGRBBB..B", "BGBBBRGB.BRRRGR", "..B...RRRG.G.GB", "GB.RBBRGBRG.RRR", "RRRBG.BB.G.RRRR", "GRRBRG.RBB.BG.G", "RGBGBRGBRR..BGG", "RG..GR..BR..GBG" };
        int T = 83361744;
        assertArrayEquals(new long[] { 416808752L, 416808744L, 1000340958L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case50() {
        String[] clipboard = { "BRG...G.RBBRB.RBBBGBRRR..GBGRR.G.G.BRGGR..RGB...G", "R..GGRGGR..RG.B..GBRGGRGGRR.RGRGGG.B..GGRBBGB.RRG", "..GBGB.GRRG.BR..G..RBB.BGBRBBG.GGGRG.RBBRR.BG..RR", "GG.BBR...RGBBB.RBBGBBBB.GB.BGBRB.BB.G.B...GRR.BR.", "GRGGBG.BGB.G.GRBG.RBGRRRRRG.RBG.R.R.BRRRR..B.GGGB", "BBBB..BRR.BB.B..BBBRGRGRBBBRRR.B.RRB.BGBBBBGRGGGB", "..GGR.B.BGB.B.GGR.BRRR.R.BRB.R..GGRBGGB.GBB.BBRRR", "GBGGBB..G.GBRR.BRBBRR.G..RGB.GBRRGRBBGBBB.BRRBBBG", "BR.RG.RBGG.RBR...GRBRG.BG.RR.RBBBRGBBG.B.RBRR.GGR", "RRRB.GGRR.GGBBBGR.BGRRG..RRR.GB.GGGG..B.R.RRB.RGG", "RBRG.GBRGBRGRGR.R.GRGGGBBGR.GBGRBGRBGRG.GRRR.GG..", "BGRRG..RBGGRBGR.GB.G.RGBB.BGBBB..B..RG.RB..B.RRR.", "RBRRB.RR.RGBGGB.RGGGGGRR...GRRBGGG.GGGG.RRRGGB..B", "..RGRBB..GGB.R.GBB.BR..R..R..RRRG....BBGR.GB..RGB", "B.BGBRRBRRRGGB.GRBGRGRGGGG..G.BRRGB.GG..BGRBG.RGR", "BGRGGR.GRGB.GRBRRB.B.BGR.GR.GG.RRBGGRG.G.G.RRBBGR", "GGGBBBRGBRGGBB...GB.BGG...RG..RRGGGBGRG.RG.B.BGBG", "GGRRBGRG.RG.RG..BGRRG.G.RGGBBBGRR.BBGG.GG.G.BBRR.", "R.BRBGRGG.BB.G.RG.RRR..GGR..BBG.RBGGGRRR.RBGRR.GR", ".R..GB.BGBRGRBG.GBBBGBRG..BRB.GRB.G.GGG.GBG...RBR", "GRGRR.G.GRGRGBGBGGB...RRRGGRR...BRB.RRGGGGBRG.BRB", "GGRR.R.GGG.GGG.BRRGRR.GB...RR.BGB.BGBRB.BG..BGGRB", ".BGRRBB.RRG.G..GG.R.G.RRG..RGBR.BRGRGRBRBGR.RGRBG", "G.RBBG.B.B.BBGR..BR.RBGBB.BBBGRG.GGRRGG.BRBRB..RB", ".B..GRG...BBGBB..GR...GB.RGR...RRBRGRBGRBRBBGGBRB", ".BRGG.BGG.GBRG..RRGBRBG.GG.BRR..G.R..RB.RG.R.RR.B", "RGBGG.BRBGRG..B.BGR.BBGG.GGBRG.BGBGRBRR..G.BBRGRB", "R.G..GB.RGRG.RGBBB.BRG..G.B.RGGB.RGRBG.BBRRR.BGB.", "RBGB.BB.G...RB.RGRGG.G.GRGRBBRGR.GG.R.RGRBBB.GBG.", "RRBRBBBB.BGBRB.GBRGRRRGBBGRGGRRB.BBBB.RGGR.R.BRB.", "RBBRR.BBGB.GB.RGRRGR.RGRRRBBBGBGGB.BGRBBBRRRRRRGR", "BGRG.BRBBRGBBBRGR.G.BGBG.BRRB..R.R.GBR.G.RR.R...B", "RRBBBBR.R.BB.GRBR.GBGRR..BG.BRBBB.R...GRRBRGRRRRB", "GRRB.R....R.GGBB.BB.GGBG.BR..BB..B..RGRBB.GG.GBR.", ".....R..BBRBB.RBBGRGBRRRGBGGRBB.GBRGRRRRBB..RB..G", ".RBBB.R.G..GG.RR.GRBBGRGR.R..GRBBRGBRRGBGGBR.BRGG", "RR.RRG.G.G.GGGBBB.GBRBRRG.RGB.BGGRR.BR..RGGBR.GRR", "RR.B.RRB.RBRG..BRR.B...B.RGRGG.G..GG.RRB..BB..GGG", "BRGBGG..G.RRBRB.RG.BGR..GG..BR.B.BBGBBGGRB.RRGRB.", "RGBRG....G.G.BRBR.BRRRRGR.R.GBR.BRG..RBRRGGGBRGRG", "RGG..BBBGG.G.BGBBGB.R.BGB.GR..GBBRGR.R.BGBGGRG.R.", "BRGBB...GGBRRG.BRBBGRGGRBGR.RGGRGRRBRR.RRBR.GG.RG", ".BRRGRRBRGBGRB.RRGBGGGGB.GRB.G.RG..GRGGGGR.R.B.R.", "BR.RRRR.B.GRGRGBB..RB.RBBG...R.BBBGGRG...GRGBR.RR", "RGBRBB.B...BRRRBRBB.GGGBBBRRGGRRGGR.B.BRGGBBGGGBB", "G.RGBGG..B.BBRGB.BRB...BGBRGBBBB.BRBB..GB.BRG.BR.", "R.GBGG.GB.BBRGRRRGRRRB..B..B.RR...GGRBGB.RR.G..GB", ".GRRR.B.G.GGGR.GBGRR.RB.BGR..B..RBR..B..BGBGRBGGB", ".GGGRBB.RBB.RBBBBRG.GG.RBR.G.GGR..RBBRRRRBR.RGGR.", "R..RRGR.GBRBBB.G.GBRGGR.BBGGBGRBB.RBRRRGBRB.RRRRG" };
        int T = 243196493;
        assertArrayEquals(new long[] { 9727860485L, 7539092058L, 6323109576L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case51() {
        String[] clipboard = { "BGBG...R.B", "GR.BBBRBGB", ".GGG...G.R", "RBBGB.GR..", "R..GRRR.RG", "R.RG.B..BR", "BGRG.GGR.G", ".BGB.RRBB.", "...B.GGGBG", ".BGR.BRR..", "RBRGGBBBRG", "GBBRRGRGBG", ".GGBG.R.BG", ".BBRGRBBRR", ".B.G...G.R", "BGR.B.GGRG", "GR.GBGBGGB", "BG.RRRBRB.", "BBGR.GBRB.", ".G.BBBRRB.", "BB.BRRBRRB", "GBGRR.G.BG", "B.BRR.BG..", "B.GBB.BBGG", "BR...B.RGB", "GBGRBB..B.", ".BBRGBB.R.", "BRBBG.GBBR", "GRG..BRGRR", ".GGRG..RBG", ".BBRB...BB", "BR.RGGRGR.", "RBRRRRBRRR", "G.BBBGGGBR", ".B.RBBBGR.", ".BBRG.R.GB", "GRRBRRBGRG", "...GBGB.GR", "BBRRR.BBR.", "GGRRGB.R..", "BGGBBRGG.." };
        int T = 548157903;
        assertArrayEquals(new long[] { 5481579145L, 7126052840L, 14800263487L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case52() {
        String[] clipboard = { "G..RBB..B.B", ".GGG.RG.BR.", "BBR.R.G..GB", "B.B.B.BRGRB", "BRRBRGBRBBB", "...G..RRG.G", "GGRB..GRG.G", "BBR..GBB.BB", "RGG..G.GRG.", "BBGRRG...RR", "BBRGRBG.B..", "B...R.B...R", "BB..RRRGRBR", "B.GRGG.RBGR", "R.GGGBRBRGB", "RRRR.RR.GGB", "BGB..RG.RGG", "G.GRR.BG.GR", "BGRRG....GB", "R.RGBGGGGR.", "BG.R.GRG..R", "RRGRG.B.GG.", ".BGG.RRR.RB", "GRRRG..R.RB", "BBB.BR.G.GG", "B.BGBRB.RBB" };
        int T = 237625976;
        assertArrayEquals(new long[] { 1901007895L, 1663381915L, 4752519580L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case53() {
        String[] clipboard = { ".GBBGB.BRGB.B.GR.RBB.", ".BBBRGBBR.B..RB.BRBRR", "..GRRRGRBBRR..G.GBGBR", "R.GGBGR..BB..BGRRB.GG", "GRB.BR.....BGB.BBBRGR", "BBBGGRR.G.GBGB....GB.", "R.BRGG.GGRGBRRRRGB..B", ".BB.G.BGGGBRBGR.BRBBG", "B..GR.BGB.G.BRRGRRRRR", "RGRGG..BGB...RRB.GGRG", "GR.RGRR.R.BRRBB.G.RBR", "GRGGR.BBRRG.BB.R.....", "BB.BGGBG.GR..GBGR.BGB", ".RGBBRR.BBB.RB.RRRGRB", "BRB.GGRGB.GB.BRR.GB.R", "BRR..R.G.G.RGBBGB.RGG", "GRBBBR.RGRBBRG...R..G", "G.BGG.R.GB.GRGR.GGBBB", "GBBG.R..RGR.GRGGRRBB.", "GGB.GGGRBG.BRRGBRBRGG", "R.RGGGRG.RGBRRBB.BRBR", "BGRRGGBR.BBRB.BGBG.BB", "RBGR.BBB.BRGGBGRRBBRG", "RRRGG.BGBG.BR..RGGGR.", "RRBRGG.BGRGG.BBB.RBGG", "GGBBRRB.BGG.RGBGGR..G", "GBRGRBRRR.RGBG.GBG..B", ".BRBBG.BBGGR.GGGGRRGR", ".G...RGGGBB.GRRRRRGG.", "GGBRGG...BGG.RGGBGBGB", "G.BBBRGRBGGGRRBB.RGGR", "BRGRG.RR..GBB.B.GGBBG" };
        int T = 263153760;
        assertArrayEquals(new long[] { 3420999072L, 4999921649L, 4999921633L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case54() {
        String[] clipboard = { "BBRR.R.BGGRB..GR.RBGGR", ".RBBGB..RR.BGG.RRRGRBB", "BBBBGRRGRBRRRRBGGGBR.B", "RGRRRGBGGGRGGRB.BBG.GB", "GRRRGB.BGRRG..RG.RBRG.", "RB.RRBGBG.RR.GRB.BBBBR", "BGB.GBGBR.BRG.RRG.G..R" };
        int T = 922248395;
        assertArrayEquals(new long[] { 10144732384L, 7377987193L, 8300235591L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case55() {
        String[] clipboard = { "BRB.RBBG..B..GRG..R.B.", ".GBRG..RRG.B..RBRRB.B.", "RG.GBRR..RGGGBGGGRRRGG", "BGR.GR..BB..GB.GBRBRBR", "G.RGBRRGBBG.B.GRRGGGRB", "GBBGG..BRRBGRBBBGGGR.G", "GRGR.R..GR.BRRGRB..RBB", ".GBB.GB..GBRGR.GGBG.RB", "B..GB...BGR.RRGRG.B...", "BG.B.G.BRBBGR.GRBRG.B.", "BBB.R.RGGR.BBB.B.GGGBB", "RB.RBGBRBBB...BGBB..B.", "GG.B..BRB.GRB.RGRRGBRB", "BGGGGRGRBRGGGBBB.GG..R", "RGBGGRG.G.BGBGGGGGGRGG", ".GG..R...G.RRG.BRRGBR.", "RG.BBBRRRG..R.BRBGGBRR", "GB.RRBBBBG.BGBG..B.GBR", "G.GGB..BR...R.BBBGGR.G", "R.BBBGRBG.GG.G.RGBGGR.", "..BRB.RGGBBRBRRRBR..B.", "BRB..BRG.GGGBBBBBBRRRR", "R..BBGGRR.R..B.GBRGRGB", ".R.R.GG.GG..R.R.R.BGGB", "BRRRB.RRGBBRGBBBB..GG.", "G.B..RBBGRRGG..RRRRRGG", "RBR.GGRBGGRBGRBBGBB.BR", "RR..GRRRBRGGG.G..BG.BG", "GBRG..RRGB.BBBR.GG.BBB", ".B.BBRRBB...GRBB..RG.G", "RGR.GBRRRR..BRRBRR..BB", "RB.R.GBRR.RBR.G.B..G.B" };
        int T = 175602365;
        assertArrayEquals(new long[] { 2985240400L, 3160842766L, 2985240422L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case56() {
        String[] clipboard = { ".BRRR.GRB.BBR.RGRRBR.GRBRGG.", ".RR..GR.BBR.BG...BRBB..RB.RG", "GBR.BRGRBBR.RRBGBRB.GGGRB.G.", "RGBGBBRG.GRR.R.RG.BRRBG..G.B", "..GGGRBBB.RR.GRBRG.G.GRGRB.B", "RRR.GB.RRG...R..RRRR..G.GGGR", ".RB.BGGRBRBBG.RGGR.BRRB.R.RG", "RRG.RRBB.B.GRBR.B..GRGRGRRBG", "GGGGG..GB..RRG.RRBRR.R.RB.BB", ".R..BBGRGBGBG..RRGGRBRR.RBBG", "BBRR.B.RRGBGG.G..RB.B.RB.BGR", "BBRR...R.GGGG.GB.B.RGG.B.BBG", "RBR..R.RRBR.RRR..RBBGGR..RGB", "G.GRBBGRG..BGG.RRG.RGGRRB.RB", "BRR..GRRRB...GRGGB....B.BBGR", "GB.BBBRRGR.GRRRRB.BGR.GBB.BR", "BB.BRGB..RBBBRBRB.RGBGRGGBB.", "GGRR...GRRRRG..RR.GGBR.R..R.", "..GGRRRGBGRBBBBR.BBBBR.RG.B.", "BRBRGRB.GBG..GBR.GRGBBBR.BRG", "RR...B..RBBB.BGGBGBR.GRG...R", "RRRGGRGRBBR.GBBBRRGRRGBGR.GR" };
        int T = 105185223;
        assertArrayEquals(new long[] { 2419260351L, 1262222829L, 1367408072L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case57() {
        String[] clipboard = { "BGGBRRR.GGBRGGRGBB.B..RBR.G.B.R..GGB.B.RGB", "B.RGGR.B.GR.G.R.BGB.GBGBRGRRG.BRGRR.BBGBGG", "R..B...GGG..R.BBGRBBBB.RBBRG.RRBB.R.R.RBG.", "BGR..GBG.BB.R...GGGGRGB..BRBGRB.B.B.RRRBGB", "GGB.BB.G.GG.BRRR.GG.RR.BR..GRGGG.B.GBRGGR.", "BGB.R.BGGGRB..RRGGBGG.BB.RG..R.RRBBGGRBRB.", "B.GRBGGBRGRGBRGRB.GGGRB.B.R..BRGBRB.GBR..R", "..RBG..RBBR..R....GG.BB.B..R.GGR.RRRGR.BBB", "BRBBG.BBRGRGG.BRRGRBBRR.BRRRGB.B.GB.BBGGRB", "R.BBR.RB.GBBGBGBRG..B..GBG.GBBB.G.RR...GRR", "RG.GGRRBBRR.BB..BGBRBGG.RGGRRRBRGRRBBB.G.R", "GRBRR.R.GGRB.GRGG.GB.BGRRGG....G.R.BBRBGRR", "BGGBGRBRGBG.GRGGBBRBG.GRR.BBGRG.B..GRGGG.B", "GGB.BB..G.BBGGGRRB...G.....GBGGBBRR.RRBRRB", "..BB.BB.BRR.GGBGGG.R.GBB.GBGGB.BR.BG.RB.RG", ".BR...RG..B.GBGBGRB.BGBBGBGGR.RBGBGB.GRRBG", ".BBGBBG.GRRR.BR..G.GGBBBB..B.RRGR...BRRR..", "BB.GB.GBB..G.R.RG.G..RRB.RR.R..RBRBBB..RBR", "GG..GRGG.RRRBBBGR.GG..BGBRGGGG.BBGBBBRRBBG", "RR.RB....BRR..RGRBGGGB..RBBBRB.RGB.RG.RB.G", "BBRRRGGRB.GBBBRR...BBGG.GBRRBGBBBRRG.RRG.R", "RRBGBG.RBRGBGRRRBB.BB.GRRGG.BR.BRRG..RGGBG", "BGR.GRRRRRBGRR.GR.R..RGRGRB.R.R.BBBGBBGB..", "R.GR.RG.BBRR.RB..G.GG.GBGRGGGR.B.B.GRGR.GG", "G.G.R..RRRG.GBRGGBRBRR.RR.RR..GBB.G.BGGRR.", "GBRBGBRGGGGG.RBGGGRR.RBG.RRGRG.RRG.BBRG.R.", ".BRBR.R.R.BB.R.RRG....BGBG.B..GGGR.GBBBRB.", "BGRGG.GBR.BR.BGGR.GBBGBBBR.B.GBR.BB.RGG..B", "BB..G......B.GGBBR.R.RRRBGB.B.G.RGRBGRBGG.", "G..BBBGBGBR.G.RGBB.RBBR.G.GBGBBRGRG.RGGBRB", "BGB.RBBBGBBG.RG.GG...G..BR..GRGBRGRGBR..BG", "GG.BBBR.GBRR.BRG.RBGBG.GRG.BRBRRR.BBRBBBRB", ".GBGRRGG.GRG.R..BBRGG.B.RG.BGBRG.GBBR.R.RR", "B..RBB.RRR.GG.GGGR...R..RGBBBBR.B.RRBRBGR.", "B.R.GBGGBR.....RRRGRG.BGGB.GGGRGBR.G.R.GG.", ".RBR..BGBB.RRB..G.BBRBR.RG...BRR..RBBRB..G", "..R.BGR..RG.B..R.RGGR.RBB.BGB..BGRB.G.GGRR", ".BG.BB.GRGGBRR.R...GBBGGBB.RB.BR.R.BGRR..B", "BRGG..R..GR.GB.GRGBGRR...R.G..GG.RBBBBBR.B", "RRRGRG.RGBBBGBG...GGGGRRGRGGGBRGRBRGBGRBGR", "RGB..GG.B.GR..GGGR..GRRGGG..B.RRRBGBBGB.RR", ".G.BG.GGB.BRB.GGRR.GBGBBRG.BRGR.GRGRR.R.GB", "RG.BGBGBG.GGRBB.R.RB.GBRRB.B..BBBG.GBGGBGR", "GBGBBBRG.B.RBGBB.RGBB.GGGGBRGRG.RGB.RG.BRR", "R..RRRGRR.BBGGBRB.....BBB.GRBGGRG.BR..BGRR", "BRGBBRGG.GG..GRBGGGRBBG.RRBBGGBBRBGGBGGGB.", "GGR.BBR.RGRRB.GB.BGRB.RB..BBGBBRBGGRGGG.GR" };
        int T = 14768970;
        assertArrayEquals(new long[] { 354455857L, 413531804L, 531683537L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case58() {
        String[] clipboard = { "R.R.RBG.BBGRGBGRGGRBGGRRGRBRGRRGGGG", ".GB.BBG.B.BR.RBBRRBGG.B.R.BRRRBBBBB", "RG.B.GGGRG.GBR.BGRR.G.BG.G.RBB.RRBR", "RB.GR..GRGBGBRR..GB.GRRGG....GR.BBG", "RGR..BBR.GG.GBRGB.GBBRBRBR.RGBRRRRR", "G.RBRRB.RRB..GGRRBBGGRGBB.B.BGRGBBB", "BB...RG..BRBRR.R..GBBGRGRRRBR.B.RR.", "B.BGB..R.RRGGR.RGGR.RRBRRRRGBRGRRGB", "BBGGGRRRGRB.RGGBGBR.R.RBRRRBGRBRB..", "R..GRR.RRBR.R.BRBB...B.BRBG..BRBGBG", "..R.BBGRBRR.BB..RRGGRR.GBRBRGBRB.RB", "RGB.GBGR.B.R.R.BGGGR.BG.GRGGRGBBGRB", ".B.GGRG.G.....R.GGRRRBR.BGBRBRBRRBR", "BGBGGRRGR.BGBBGRRRBGRGRR.G.GBBRGRR.", ".GBBB.R..R.GBG.GGBG.RRBB..RR.G.RRBB", "RG..R.BB.B..BBRBBB..BR.RG.GRG.B.GGB", ".BGBBR.GGBBGGGGBB.RB.GRRB..GRBRRBBB", "GGBGB.GR.BGRRGB..G..B.B.R...G.BBRBB", "B.B.....BGGGBG.BBBRBBGGG.....BGBBB.", "BB.G.BBBB.RGGBGRB.GGRGGBBG.R.G.G.BR", "G.R..RR.BRB..GBR.B..G..B.B.RGBBB.GG", "GRRR....B.RGRRGGB...RG.RGGBR..GRG.G", "B..R.GBGGR.RRR.BGGG.BRRGRBGG..R.B.G", "GGRBGR.R.R..GBRRBGBRRGGRRBB.RBRGBRB", "BRBGBRRGBBRRGB.BR.RBBRGBRGG.BB.BRB.", ".BRGBBRR.R..GGRRB.BGBG.BRG.BGGG.G.R", "BR.B..G.GB.B.GR...GBRBBG.BBRGGGBR.B", "RRBGRGBBBBG.GBGG.RGRG.RBBBRRG.G.R.R" };
        int T = 339269938;
        assertArrayEquals(new long[] { 6785399070L, 8142478786L, 6106859196L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case59() {
        String[] clipboard = { ".RB..GBBR.B.GRG.GGBBGB", ".R.GB.G...GRGRRRBGB..G", "B.B......R.GRBBBGRR.RR", "BRRRG..GGB.GG.BR.GGBGG", "BGRGRGG.R..RGG..GBRRRB", "RRB.BRG.RBBBBRBB.BBRGB", "R.GBRBRGRRBRB.G..RGGR.", ".BG.BGR..G.B.GRBB.GRRR", "GG..RGRGBR.G.BBBBRGGRB", "BGRR.R.BRRRGR.GGGBGRBB", "GBBBRG.BB.BR.BG.GRBR.G", "GRGB..RGGR.R.R.GBB.G.R", "RBGGRB.B.BG.R.BGR.B.BR", "GB.BB.B.BGG.B.RR.RRRBG", "..RRRBG.BBG..RGBRGRG.R", ".GG.BRRGBBGRGRRRRGR...", ".BRGBBRRR.RBBGGRRR.GB.", "GG.GGRR.RGR.RGBB.RRB.B", "GRG.RBGGB.GGRG.RR..RGR", "RBGG.RRR.GRBBRRRR..G.G", "B.GRB.GRGRG.G.R.BGBG..", "BRR.R.R.RGRBBGGBRGGRBB", "BBGB.RB.RB....B....BBB", "GBGBB.BRBR..G.GGRGRGG.", "RR..RBG.R.GBB..BGGRG..", ".GBGRR.RRBRGB.B..G..BG", ".GBRGB.R..GBB.BRBGR.RG", "GBRGGGRR.BRG..G..GB..B", ".B...GRBB.GRGGBBGR.GGG", "RB..BGB.GRG.B..RB.GRRR" };
        int T = 457839992;
        assertArrayEquals(new long[] { 5036240118L, 9614640024L, 8698960025L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case60() {
        String[] clipboard = { "GBR.RRGBBRGB...GRB.G.", "G.B.RBGRRBGGR.GBBBRRG", "BRR.BRR.GGRGRR.GG.GB.", "GR.GBRR.RBG...GBGGGGR", "RR.B.BRGBBBGG.BBR...R", "...GBR..R.G.RRG.GBGG.", "GR.G.G.GGRGBBGRRBB.BG", "RG.GGBGG..BGGRBBBB..R" };
        int T = 49730576;
        assertArrayEquals(new long[] { 497305792L, 447575238L, 397844645L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case61() {
        String[] clipboard = { "B..B.BB.GRGBGGR", "BBGR.BGRG..RBBG", "RR.B..BR.B..RR.", "RBGB.GRG.RBRBGR", "..G.G.G.BRRBG.G", ".RBRBGRGBRRB.RB", "RR.R.BBBGBBG.B.", "..GG.G.R.R.GGRR" };
        int T = 834786794;
        assertArrayEquals(new long[] { 6678294383L, 5008720787L, 5843507589L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case62() {
        String[] clipboard = { ".RRGGGGBGRRGR.GR.RGGBR..GRRRGG.RRRBRGG", "RBBGRBB.GGR.G.GBB.B..RBBGGBR.GGR.GR.RG", "GBBBR.BGRRR..RRB..BBBR.R.BBB.RGRR.RG.R", "BGBGBRBB..GRB.G..R.RGG.GBR.G.RRBGB.RGB", "GGRRGBRBRR.R.G.BBG..RGRBB....R.GGB.B.R", "R..BBG.RRR.RBGG.GG.BBBGRRBGBBB.GGGRRBG", ".R.GB.BBB.BBBG.RGBBGGGB.BRR.R...G.B..R", ".BRGRR.GR..GBG.BR.G.GRR..RRRRGRRGGGBRB", "B.GRRG.RBRGG.....GRGBG.BR..GBGRRBGG.GB", "RGGB.RRGGRGRGG.BB.GGRGGBBBRGR.RGGG.BRR", "GR.BRGBGGRB.GBGBBGGG.RGBRBB.GBG.BBBR..", "RGGRRRBG.GBRGGRG..GBGRGRGGBGGB.BGGB..B", "RRBGBBGR..BG.GBG.BGRBRRR.GR.R.GBGGGGGR", "BRBGRR..GRGRRBRRGBRG.B.RBG.BBGBGBR.BBB", "GGRBGRBRR.RGB.R.GBBRGG.B.BB...RRBB....", ".BRB.RBRR.RB.GGG.RG.BR...RGRB.G.GRRB.R", "RGGGBBRRB.RB.G...BRG.GG.RBRBGBBB..BRRB", ".B.GRBBGGGG.BRRBBBRRB.BGB.GBB.RGRBRRRR", "GBBBGGRGB..RRGR...BBRR..GB.BGB.G..GGBB", "..B..BRRRBGGB..RBGR.B.BGGR.B.B.RG.R.BB", "RBRRBG.RG.BRG.GGBBRRBGRRG.GB..GBRGRG.R", "RBRG.GGRBRR.GR.BB.RGRRGG.GG.BRBBR..G.R", "G..R.GGB..BBG.G..BR..RRG..GRBRGGBGBRGB", "BB.R..B.BG.G..BBR.G.GRGG.RBB..GGBBRGBG", "GGRGRBB.BGGGBG..RR.RGRG.BB.B..B.GG..GR", "BG.GBRBB.BGGGBBRBRGRBRRGG..GRBR.GBBB.R", ".GB..BBRRGR.BGB.RRRBRGRRGBBGBGRBRBGBBB", ".R.RRRBG..BRGRRGRRGRB.RBRRGBGGGGBB.RG.", ".RBGBBBBBGRR.GR...R.GGRGBGRR..GRR.BRB.", ".RGGBRGR.R.BBGB.RRBBRRGRRBGRGR...BRBBB", "B.G.GRBBGGRBRGGB..GRBGGBGBRRB.GBB..R.G", "G.RR.R.GG...R.RR.BB.GBGBRRRG.GRBBGBGRB", "RG.GB.BR....GBGB.R.GBBRRR.B.R.GB.BGRBG", ".B..G.GRRGRBRGG.B.GRBGGGBBB...GBGRBGB.", ".BRB.GRB.RB.B.B.BRG.RGR.RBB.B.RRBRG.RR", "BGG.RB.B.RBR.R.BGR.RBR.BR..RB.RGG.RGRB", ".GBR..G.BRRGRGBGGGBBRBGBRBG.GGRR.GGR..", "GG..GGB.RBG.R.GGRGGRBG.G.BG.RRBR.BG.BB", ".R.GBRGGR.GBGRBBRGBBBRGG.G.G.BBGRG.RRB", "..G.BG.BBBBGGGR..BR.RGR.BB.GG.R.BR.RBG", "RRBGB.RGRBBGGGBG..RG..GBRBG.G.RBGR.GRB", "R..RGBB.R.BBBGBRRGBGR..RRGBB..G.RGR..." };
        int T = 870024498;
        assertArrayEquals(new long[] { 27840784414L, 25230710930L, 15660441467L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case63() {
        String[] clipboard = { "R.RR.RR.RBBGBBGRBBBBRGBGG.RGB.G.GGB.GB.G.BBR", "BG.BRG.GGRRRRRB.GGGRRGG.RGRRRB..R.BRR..GBG.B", ".GGB.GBR.GGG.BBBRBRG.BBGR.G..BBBGBG.BBG.BBGR", "BG..RGGGRG.GRRG.RBB.G.RRRBB.GGB.GG....RGBRGG", ".G.RBRBRRRBRBRBBRR.BRRGG..RGRB.RRRBGGR.BRRB.", "B..RRRRBB.RGG..BBGBGGRB..GGRGGGRGBRBRRR.RBRG", "BBRR.G.GGRRGG.BBB.B..G..BG..RR..RGRG..BB.G.G", "RB.R.GBGBGBRGG..BG..GGR...BGRGGBB.BBRBBGR.G.", ".BGRG.B.RRGRBBRG.BGGBBG..GRRRRGGB.BRGBG.R.BB", "...GBGGGG.GBRRGB.BBBRGBBRBBB.RGB..BGG.BGBB.R", "G.RRBG.RGG.GBGRGGB.GBRG.BBBB.R.BRRGB..RBBRRR", "GRG.B.R.RG..R.R.G......BBGRRRR.BG..B.BRBBBRR", "BGRRRRBGRGGGGGR.RBBB...RBBBR.R.RBBR.BB.RR.GR", ".R.GBR.G.R.GG.RR.GBRGBGBGGGR.GBRGBB.BGRR..B.", "GRRRGGGRBRG.BRR.G.GR..BB.G..BGBR.GRG.RGGBGGB", "R.G.GGGGR.GB..BBR.B.GRGGB.GRBR.RG..R.RGB.GBG", "B.BGB.BGBRRB.G.GGR.B.GGGGBRRGRRRRRRRGB.BBBRG", ".RGBRGRBB.RRR..BBRGB.BBG.BB.GRR.BB.GGG.RRRBB", "RRRG.BRG.BR.BBRBB.GBBRRRGGRGGB.BRGG.RRRRR.RG", "R.GR.GBBBRGBBGB.RGGGRR.RB.R.BB.GBRR.GRB.RBGG", "RG.BRB..BBGR.B..RBRRBG..RB.RB.R.RBBR....B..B", "RBBGGGBGG...BRB.RR..RRBG.RR..GG.RBGGBG..BGRR", "BBRGBG.GRBBB.GG..GBRGBBGBBRBRGBRRGR.RRGR.RRB", "GGGBBBGBB.R.RBBB.RGRGRG.G.GB.BBR.GGR..RGBR.R", "B..RBB.BBRGB..RRBBBG..RBGGBB.BG.R.GRBGGBB.BG", "RRGRBG.RGBG..BR.BGGGR..RG.BGGRRGGGRRGB.GRGG.", ".BG.BGRB.B.GRBRB.BGB.RRRRRBRRBBRBGBG.BGRG.BR", "GBGRR..RG.B.RBGRG.GGGG.BRGG.BG.BGRR.RRRGRR.B", "BGGGRBRBGBBB.B.R..BBGRBBRRB.G..GRRGRRRRB.R.G", ".G.BRG.BBB..R.....R.G.B.GB...GGGBRG.BGR.BGBG", ".GBBRGGR.BRB..GB.RBB.GG.R.BGRBB..B.GGG.GB...", "RRGB.BRR.RBB.RR...GR.GBBRBBBGRBB.RBBGR.BRBB.", "R.RGBB.G.GR.R.GBGGRB.BB.GGGGB.R..BG.B...RRR.", "BBGGBB.BR..RR.BR.GG.GRGRRGBGRGRBBGR..BGG.GG.", ".BBRRBBBBRGGG.BGBRBBG..GRBR..GGR.BGGRBRBGBRR", ".BRBGBRBG.B.RG.BBRRRR.RGGRGBGB.GRR.GR.GRGB.B", "GB.BRRBRRBR.GBGRG.RBRBRR.RB.GB..RRBG.GGRBB.B", "G.GRBBRBBRBRR..GGGBGB.G.RRBGGRBGR..RB.RG.RBB", "GRGRR.RGB..RGBRGRR..GR.GBB...R.R.B.BRGG.BBGB", "B.RRGBRG.GB.G....RGGG..G.GR.BRBRRGRR.BGGRBRR" };
        int T = 289206841;
        assertArrayEquals(new long[] { 7808585268L, 7519378392L, 8676205771L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case64() {
        String[] clipboard = { "..BRBRBRR.GGGGBG", "B..B.GGGR.BG..RR", "R.BGGRGGGBBGG.G.", ".BGGGGG.GBRG..GG", "BRGRBR.BG.RB.GGR", "BR...BRRBB.RGB.R", "GGR..RRR.G.RB.BG", "BR.BB.RBGGBR.GGR", "GGG.RG.GRRRB.GRG", ".B.G.B.RRRBGGGGG", ".BRGBB.BGGR.RBBR", ".R.B.BBBRGG.BBRR", "BBG.B..RRBRRGRGB", "B....GRGG.....RG", "RRRGB.GRGR.BBBBB", "RBBGG.BRGRB...B.", "R.RB...RBRBGB..G", "BBRGBGG.G.GR.GGG", "RBRGG.GGRRR.GGG.", "G.GR..BBGGRB..RR", "R.BGBBBRBGG.GB.R", "GGBGBBB.GGGRGBGB", "RRRRG...GBRBBG.R", "BBR.RGGBGBBBG.BR", ".G.RBRB..BRRBGR.", "..BRRRGBRRRGB.G.", ".RRB.RRBGBBRGBRB", "GRRB..RB.GBGRGGB", "BGGGGGBGBGBRBBGG", "RRRRBBRRGRRBBBRG", "RBRBGRBGRBBR.RRR", ".G.GRR..RR.BG.RB", "RGGGRGBR..BG.B.B", "BR.RRBRGRGG.G.GR", "BBGRGR.RBBGBGBB.", "B.R.B.R.B....G.R", "R.RRG.GG.G.R..G.", "BB.BBGBBB.BBRGGG", "BBBB.BBBG.GBGBBG", "B.BRGRBRBBR.BRBG", "BBR.R.RGGRRG.R.R", "BG.B.RGGRR..G.RB", "GG..RR..BRRGGG..", "B.G.GBBBR.BR.RBB" };
        int T = 438602558;
        assertArrayEquals(new long[] { 8772051352L, 5701833473L, 11403666714L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case65() {
        String[] clipboard = { "B..BG.GGRGRGB.G...BR.R.B..G.BBBBGBG.BGGBBGBB.", "RBBBB.B..RBGG.BR.GGGR.BBR.RG.GRRRBGGBRGBBBRRB", "GBG.B.BR..RGBRRGBGRGBBGG.GR.BBBRR.BBRG.BR.B..", "BRG.B.GG.R.B.BGGRRGB.GR.RG..GG.BR.BRGGBGGRB.B", "GBRB.BBBGGBGBB..B.GGRRRBGB.RB.GGGRGGRG.GGGBB.", "G.GG.RB.BG.R..GR.BGRRBBGBBBGG..GRBG.RRBGGG.BR", "B.RBGRG....GRBR..BR.GGGRBRGBRRRR..G.B.BBGGR..", "GGBGRGB.BBG.RGRBGGB.RBRGGGBBRGRG.G...RR..RG.R", ".R.RRBGBGRRBBGRGGG.R.B.RBBRBR.BB.B.BR.GRGRG.." };
        int T = 783370335;
        assertArrayEquals(new long[] { 5483592445L, 15667406811L, 18800888146L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case66() {
        String[] clipboard = { "R.RGBB.GGGGBG.B.BGBRGGRGG.G.B.G..BBGGG.", "GGBRBRG.GBGBBBG.BBRR.RB..GBRRRRBBGG...G", "GRG..BB.BG.G..R.RR..BR.R.G..RBBBGGRGG.B", "GRR.RGBBBBRGR.BGRGRGG.GBBRBRRGBB.RGB..R", "RGRB.BBGGR..BRG....G...BGGBGGR.BBBGG.B." };
        int T = 622472535;
        assertArrayEquals(new long[] { 4357307786L, 13071923278L, 8714615532L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case67() {
        String[] clipboard = { "GRR.RB.G.BRGBGRGBGGGR..RBG", "RR.RG.RR.RBBB.GBGGBBRRRRBG", "..GRBGGR.BGRRGBBRGB.GRGG.G", "GRGGBB.BBBB.R...RG.RGRBRB.", "GGBR..BBRRR.B.BGB.GBRB.GRG", ".BBRRRRBGRB.B.R.BBGBGGGG..", "R.GGGR..BRB.RRGGRR.BRG...G", "GB..RBR.RBRRBG....GGB.GR.B", "BGGRBRB.RBBG.RB..B.RRBRRRR", "BBBGGBGBR.B.BGG.G..BG.G..B", "GBGBGBB.G..RGR.GRGGGBRRGBG", ".RRG.RBGRRB.BGBBR.GG...BGG", "GR.G.GGGR.RRG..GB..GB..RBG", "BR.BBR.GBRRRGRBGG.G..BGRGB", "BBRBR.GBG.BGRRGBRBGGGGRGRB", "B..BGGGRGBGRB.BGR.RR.G.RGB", ".BB.GGRG.RRRR.B.R.BGBB.GRG", "....RG.GGRRR..G.BR..G.GGBG", "GRG..RGR.GGGGGGBGRRBBR.GBR", "BGBRRBGBB.RBG..GB..GGGG..R", "BB.BRGRR.BRRGRGB.BR.RR..BR", "RGRBRB.RGGRR..G.R.BBBRBGBG", "BGGRBR.GRRBB.RRR.G.R.BB.GB", ".RRGGRGGRBGBBBBG.GBGGGBGG.", "BRGBG.BBRGGRBRG.G...RBGRRG", "B.RR.BBR.RRG.RRGB..RR.GGB.", "RGRRBBRGB.RRRRBGBBGGRBBB.G", "RBB.RGBGBBRBG..G.RB.R.BG..", "RR.RR.BRB..RGGGRBRR.RBGGRB", "G.GR.GRGRGGRBBRGBBRBB.B.RR", "BG.GRRRGGBRBBGRGRBBGR.GGG.", "BRRRRG.BRRRBGRRRGBGG.BG.B.", "RGBRRRR..B.BGR.RBBB.RGR..B", "RGGRB..R.R...GBBGR.B.GRG.R" };
        int T = 668647266;
        assertArrayEquals(new long[] { 16047534650L, 12035651066L, 11367003766L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case68() {
        String[] clipboard = { "B.BRR.BGB", "BBBBBR.BG", ".BBBBBGRG", "GBBRBG.RG", "G.GBRR..G", ".GG.GG..R", "RGBBBRBRB", "GBGGG.G..", "GBBR.RBBR", "..RGRR.GR", "RR.BG..GG", "G.BR..BRG", "RBB.RGG.B" };
        int T = 508726536;
        assertArrayEquals(new long[] { 3561085778L, 3561085779L, 3561085786L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case69() {
        String[] clipboard = { "RG....G...BG..G.G.........R..G..", ".....RB.....G..RG...R..GRG......", ".....G.B....B.....B..B..B.RB.R..", "....RB..R.........RBB..B...G.R..", "....B.....G....BG..B....G.G..G.G", ".........G.B.GR.....B....G......", ".RG....R....G..R...R.B....GB....", "RGR...........R..BB.R..R.BB...B.", "...RG..........G.BGB.....R.R.G..", "...RRBR....G..G.G.....B....R.G.R", "R.....G.G.GGB.G.R......G.......B", ".R..R........B.R.GG.GG.BBG.B.B..", ".G........G.........RG......RR..", ".BGRR..B....B...B....B.BR.B.....", ".......RG...R..BR...............", "..GG..R...R............R........" };
        int T = 513998305;
        assertArrayEquals(new long[] { 7195976355L, 8737971270L, 5139983136L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case70() {
        String[] clipboard = { "G..B", "G..R", "GBRB", ".GB.", "RRGB", "....", "B...", "....", "....", "GR..", "GR..", "G...", "....", "B..B", "....", "..R.", "...G", "....", "G..B", "....", ".GB.", "G...", "....", "RR..", ".BG.", "G..G", "B...", ".B..", "R...", ".B..", "....", "....", "B..G", "....", "B..G", "RB.G", "G...", ".R..", "G...", "....", "..RB", "G.G.", ".B.B", ".R.R", "....", "....", ".R.R" };
        int T = 577633371;
        assertArrayEquals(new long[] { 6931600460L, 9242133944L, 5198700353L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case71() {
        String[] clipboard = { ".B....", "B..B..", "..RB..", "GG..G.", "GG....", "GBBB..", "......", "......", "RRG...", "...G.G", "B....R", "....BB", "R...BB", "......", "BR...B", "......", ".....G", "...B..", ".B....", "....R.", "...B.G", "R.R...", "..GG..", "....R.", "...G..", "......", "B.....", "..G.G.", "B.GGB.", "BBB...", "...R..", "....R.", ".B.R..", ".B..R.", "..R.GB", "......", "R...B.", "G.....", "...R..", "..GB.R", ".B...G", "....RG", "....B." };
        int T = 428171886;
        assertArrayEquals(new long[] { 4709890761L, 4709890767L, 6850750204L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case72() {
        String[] clipboard = { "G.GR.......RG..BR.", "..B..R.....G.G.B..", "G.................", "R...R..B.R.RB..RB.", "G......GB.B.GG.B..", "..G......B..B...B.", "..R....R.RR.....GR", ".....B..B.G....R.G", "R.......GB.G..B...", "...B....R.B.B.B...", ".....BGG.R........", ".R.......B....B...", "..GR...GRB.RB..G..", "..G..G...R........", "......G......B.G.G", "....G....B..RR....", "..GB......R..R....", "..G.G...G.R.....G.", "B.R.G...GB..R.G...", "...BG...R.....RGG.", "B..B..G......BR...", "..G..G....R.RR...R", "R.G..........G.BBG", "....B.......BG....", "G.B.B..B....B.....", "B.R....R....R.B...", "......R..G...B..R." };
        int T = 411037483;
        assertArrayEquals(new long[] { 6165562325L, 4521412411L, 6165562312L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case73() {
        String[] clipboard = { "...", "G.G", "R..", "..." };
        int T = 982892280;
        assertArrayEquals(new long[] { 982892280L, 1965784560L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case74() {
        String[] clipboard = { ".R.B..", "R.B..R", ".R.R..", "..B..R", ".R..R.", "..B...", ".B.B.G", "B.....", "B.B.GG", "......" };
        int T = 791405227;
        assertArrayEquals(new long[] { 4748431364L, 791405232L, 3957026139L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case75() {
        String[] clipboard = { ".....G....R..R", "BG...R.B.B....", "B.....G.B....G", "..R.B.BR....RG", ".B..BBR.....G.", "GBGB..........", ".........G...B" };
        int T = 342159896;
        assertArrayEquals(new long[] { 1710799483L, 1368639595L, 3079439072L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case76() {
        String[] clipboard = { "G............R...B....G.", "R.G........B............", "......B.......BB........", "...R...B....B.......B.B.", "RB.B.BR........B........", ".G.B...GR.BRB..R.GB.RR.R", "GR.B.............R..GR..", "GG....B..G.........B.G.G", "BB..R.......R..R..GG.GB.", "R......R.R.BRB.G.GG.GG..", ".......R..R.R...........", "..............BBR.....RR", ".R.............GB...BR..", ".BB..GR...BB...B.....G..", "..B.....R.....B.........", ".........B..G..R........", "R..G.R..G...G......RR.B.", ".G........G....R....G...", "..G.........RBG.RB..R...", ".B.G...B..........GR....", "..G...B.RB......RB..R.G.", "GB.......B.G.....G......", "...R....G.R.G...B.B...G.", ".G...R.R.B..RG.....B..G.", "....R......G..GR...B...G", "....RGR....R..BB..B...G.", ".RGGGR.R.R...GB..G..R..R" };
        int T = 102745984;
        assertArrayEquals(new long[] { 1643935888L, 1335697892L, 1643935869L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case77() {
        String[] clipboard = { ".......BB.....GG", "..R......BR.....", "B.B...B...B..G..", "G.B.....B......R", "....G...........", "...R...RR......." };
        int T = 1841872;
        assertArrayEquals(new long[] { 9209363L, 7367490L, 12893106L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case78() {
        String[] clipboard = { "..R..........R.R........RB...B.....", ".B.R.BGB...G.BG...G....BB......G...", ".GR..BRB.B..RBG...R.......RRR...BR.", "...B.BB..G...G....BR..R......R..R..", ".R.BGG....R....B.B.RGB..R.B..BR..G.", "....R...G....B....GGR..............", "..G..R.B.....RG.R.B...RR....B....B.", ".B.GGG...G.G.B...BR...BB..R.GR.....", "....GG.G..BG...R.G.B.G...G.......G.", ".....R..B...RBRR..B..R.G.B....RG...", "R..B.B.......G.G....GR.GG.....R....", ".B..GR......BR.....B........R....RR", ".B.....B.B..GB.RB..BB.RRRR...G.RR..", ".B.....G...BGBG..R...R..B..G..RBB.R", ".......R.R..........G.R.R.......B..", ".....B.B..GR.G..RRB..BB........GG..", "..R....G....B..B.R.....BG...R..R..B", ".R...R...B..G..B.........G...B.....", "...R.R..B.BG...........R...RGG.B...", ".B..G....R...BR...B....G.....GB.GG.", "..GG.....G....BBB.....BR.B.......G.", "B..R.GB....BG...GG.BRBG.B.B..G.....", "G..G...G...G...RG.R...G..G.RB.....B", ".......G.BG.R....GGG.......R.BB....", "B........GB.....B..BRB...G.BB......", "R...G.R.....B....G......G.BG.......", "B.BR.....G...R...R.B...R...G...G..B", "...G.....G.....GG.G.R.............B", "..GGR...B...BB..B........G.R....R..", "..G...B..BR..G.BB..G..RR...R..G....", ".RR.R..R.B...G.....GR...G.R..G.GB..", "...R....R.B...G..BR.....RB.......B.", ".RGB....RBB....B...........R.......", ".R....RG........G...........BR.....", ".......B..R.....G...G.G..RB........", "...B.G..R.......B..G..GG......G....", "G...G.BR....R..G.......R..GG.BG..G.", "R.GB...R.B....RR..RB......G.RG...GB", "B.................B..B....B.RB..R..", "GB.G......GBR.....R...RR...R..B.RR.", "..G...B.RRB.......G.R.....B..R.....", ".G........B.R.B.RGR.GRGRGG....R.G..", "G.G.G.......B..RR...........R..G..." };
        int T = 818769224;
        assertArrayEquals(new long[] { 18012923298L, 18012923291L, 22106769398L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case79() {
        String[] clipboard = { "BBBBBGRBBBRBGRRRBRGRBRBBGGBGGGR", "GGRBBBRBGGRRRBRRBBGBBGBBGBBBGRB", "GGBBGBGGBRRBRRGRBGGRGGGBRRGGGRR", "BGBRRBRRGBGBGGGGRGGRRRGRRBBGRGR", "GBBGGBRBRGBRBRBBGBBGGBGGBGRBBRG", "BBGBRRBBBBGRBRGGGGBGBRBBBBBBBGG", "BGBGBBRBRRRBBGBBRRGRBBGBBBRRBBB", "GBRBBRBRRGGRBBGBRRGBBBGGRBRGBGG", "GRGGRGBRGRBGRRGRGBGRGBRBBRBRBBR", "RGGBGRGBBRBRRGRBBGRBRRGBGGBRGRG", "RGRGGRRBBRBRGRRRBRBRRGRRRRRBGGB", "RBBRRBRBGBRGBBRGRGBRRRRRRGGRBRG", "RGRBGBBBRGBBGBBGGRBBRBRGGRRRRGR", "RGRGBGGGRBRGBRGGGRGGBGGRGGBBGRB", "BRBBGGBGRRGGRBRBRGRRRGGBBRBRBRG", "RBBRRRBBRRBGBRBRGGGGGBBGRBBBGGR", "GRGBGRRGGGBGBBBGGRBGRRRGRRGGRRR" };
        int T = 12620659;
        assertArrayEquals(new long[] { 189310046L, 176689380L, 227172027L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case80() {
        String[] clipboard = { "RBRGBRRGGRGRBGBGGRRRRGGRRRGGRBBGGRBG", "RRGRBBRRRRBGBGRGGGRRGGRGRBGRRRBGBGRB", "BGBBRRRRGGGRRBGGRGBBBRBBRBRBBBBBBGBR", "GGRBBGRBBGRRRBRRGGBRBBRRRGRGRRGBGRGR", "BBBGBRRRBRGRRGGRGRRRBGBBBGGBGRRGBGRB", "GGGBBGBRBBRRGGRBBRRBRRRGBRRBBGBBRRRB", "GGGBRRBGRBGGBBRRRGBBBRGRRBGBRRRBRGRB", "GBGGBBBRRBBGGRRRGRGRGRGBBRGBBGRBRRRR", "GBRBRGRRGBRRRRRGRGGRGBGBGGRGRBRBGGRR", "RGBGGRBRBBRGBRGGBGGBGBBGBGBGGBBRGGGR", "BRGGRGBRBRRBBBBGGGGGBRBBBGGBRRBRRBGG", "BGBBBRRGBBGGGBGBRRRGBGGRBGBBRRRGRGRG", "BBGGBRRGBBRGRGRBBRBRBBBRGGGBGGGGGBGB", "RGGBBRRGRGRGRRRGBBRBBBGGGRGGRGRBRRBB", "GBRRRGGGBGGBBGGBRRRRBRGBGBBGBGGGRBRR", "RRRBGBBGRGBGBBRGBGRRRBGRBBRGRRBRRRGG", "GGBRGBBGBBRRBBRBGBBRBGBBGGGRBGGBGGGG", "RRGGBBGRRRBRGGGGBGBRBBBRRBRBRBRBGRRB", "BRBGGBGGBGGRBGGBGBBGGRBRBGBGBRRBGGGR", "RBGBBRGGBBBRBBBRGRGGGGRBGRGBGRRGBGRR", "RRGBGGRBRBGBGRGRRBBGGBBGGRBGGGGGRRGR", "GBGRBBGGBGBBBGRBBBBRBGBGBGBGBRGGGGGR", "BRBRRRRBBRRRBRRGRRBRRGBRBGBRGBBBRBGR", "GBRGGBGBRBRRGRBBGBBRBRGRBGBGBBBRRRBG", "RBGGRGBGGBGGGGBRGRBBGBBRBGRRBBRBGGGR", "RRRBGBRGRGRGRRRBGGGGRGBBBRBGRGBGBGGG", "GBGGRBRBGBRRRGBGRRRBRGBRGRGGGRGGRBRB", "RRBBBBBRBRRRGRGBRRRRRGGGGGRGGGGRBBBR", "GRGRBBBRRBBGGRBRGRGRGBBRBBBBBBGBBGBR", "BBRBBBBRRGRGBRGGBBGGBRRBGRGBBBBBBGGB", "GGGBGGBGGBRRGRBGBGBRRRRRRRGRBRBRBBBG" };
        int T = 679413087;
        assertArrayEquals(new long[] { 16985327519L, 17664740609L, 10191196664L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case81() {
        String[] clipboard = { "BGBGBBBGRBRBBRBRGGGBGGGGBGG", "RGBRBRBRRBGBGBBRGBGRGRGRGGG", "GRGGRBGRGGBGGRRGGRBRRGBGRGR", "BBBGGBRGBRBGGBRBBRRBRBGBGBB", "BGBBBBBGBBGGRBGGRBRRRRBRBGR", "RRRGGBGBGGBRBBBRRGRRRBGRRGB", "GRGBRGRGRGBBBRBBBGRBRBGBBRB", "GGRRGRRRRRGGGRBBRRRRBRBGRBG", "RBRBGRBBGRGGGBRGBGGGRRGGBBG", "GBBRBGGGGRRBGRRRRGBRGRGBGGG", "GBGGRBRBBRGRGRBBGBGRBGRGBGG", "BBRBGRGBBBBRGBBRBGRRRGRGBGR", "RGBGGBBBRGBGRRBGBRRBGRRGRGG", "BGBGRGBGBBGRGRBBBBRRRRRRRBR", "RGRBRGRGRGBRBGBRBGBGGBGBRGR", "RRGRGGRGBGBRGRRRGBGRRRBGBGG", "GRBRGRGBGRRRBRBRGBBRRBGBBBB", "RGRBRBBGGGBBRRRRRRRBBBBGBRG", "RGGRGBBRBBRGBBGBBRGBGBGRRBB", "BRRGRRRBBRRRRRGGBRRRBRGRGRR", "BRBRGRRBBRBRRRBRRRBGRRRGGBR", "RGRRGGRBRBRGRGGRBBGGGBGBBGG", "BGRGGBGRBBRBRGBGRRGRBRBRGBR", "GRGRRGBBRBGBRRBRGRRRBBGRRBR", "BRBGBGRGRGGBRGBBBRBGRGBRGGG", "GBBRRGGRBGRRRBRRBGGBRBGGBBG", "BBGRRGRRBGGBGBRGRBBGBRRBRRB", "GRBRRRRGGGGBGRBBRBGGGGBBRGB", "GBRRRGRBGGRGBBBGBBGRBRGBRBR", "BRGBBGRBBRRGGRBBBGGGBBBGGBB", "BBGRBGGGGRRRGRGGBRRRBBRGRRB", "RBRGRGRRGGGBRRGGRBGGBBBRRBR", "BGRBGRBRRGRGBGGGRGBGGBGRRRR", "GBBRGBGRRRBBGRRBGGGGBGGRRBG", "BGBGRGGBRGBBBRGGRBBRBGRRRGG", "GRBGGBRBRGGGBGRRBGRGBGGBBBG", "GRRRRGBGRRRBRBGGGRRGRRRRBGR", "RGBBBRRGGBRRBBGRBBRGGRGBRRG", "BGGGGGBBBBGGRRBRGGGBGGBBBGB", "GBBBRBGGGRGRBBRBRRGGBBBRRRR", "RRBRGRBGBBRRGGBGRBBGGRBRRBG", "BGBGGBRRRGRRBBGBRBGRRGBBGGR", "BGRRRBRGGGBBBBRBBGRRGBGRBGR", "RGGRGBGGRBGRRGGGRBRBBGGGGBB", "RBGBGGRBRGRGBGGGGGRBRRGRRBR", "GBGBGRBBBRGRBRGGBBRRGBGGRBG", "RGRGBRBGBGGRBRRGRRGBBBGGRGR", "BRBRRBBBBBRRRBBBBGRGRBRBGRR", "RBBGBBBRRGRGGRGBGRGGRRBGGBR", "RRRBRBGRRRBBBRBBGRGGRGGRGGB" };
        int T = 642127884;
        assertArrayEquals(new long[] { 13484686009L, 17337453290L, 17979581159L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case82() {
        String[] clipboard = { "RRRGBBBGGGGGBGBRBRRBRGGRBGGBBBBBBGRBRBRBBGGBRRRBB", "BRBRGRBBGBGRBGGBRBRRBBRGRGRGRGRRGRBGRGRGGBRGGGRRR", "RRBGBRBGBGRGRRGGGRRGGBBBRBBGGRRBRGBGRBRGGBRRGRGBR", "GBGGGRRBBBGGBRRBRBBBRBBRGBRRRGRRRBBRRBBGRRRGRRRBB", "GBBBBGBGBGGBRGGGBRGBGRGGGRBBGGGBBGRRGGBGGGRBBRRRB", "RRRBBGBBRBBBGGBGBRBBBRRRBGRRRBRGGGRGGBBGRGRBGBGBG", "GRBRGBGGRRBBGBGRGGGRRRBBBRGGGBBGGBRRBBGBBBBGRRBBG", "GGRGRBBGRGGGGRRGBBBGBRRGBBBRGRRBGRRRRBBBRBBGRGRBR", "RGBBGGBGGRGGBGGGRBGRGBGRGBBRRBGBRBGBRRGRRGBGBBRGG", "BBGGGGGBGBBBRBGBRRGRGGGGGRBGBGBRBRGGRBBRRGGBBGRBB", "BBGGGRBRGBBRRBBGBRBRBRBBBGBRGBBBGRBRGBBRBBBBBGGBR", "GRRGBRBRBRRRGRBGBRBGRGGGRBRRBBBGRBGGRGBRGBGRRBGRR", "RBBGGRRGBBGBGRBBGGRGGBGRGGBBBBBGGGGGBBGGBGBBGRBBB", "BBBGRGGRGGRRBRRBBRRBGRRRRBRGRGRGGRBGBBRRRGGBGGGGR" };
        int T = 929910696;
        assertArrayEquals(new long[] { 16738392722L, 17668303437L, 23247767617L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case83() {
        String[] clipboard = { "BGRBRBRGBBRRGGGG", "GRRRGRRGGBGBRRRG", "GBBRBBRGRRGGRBBB", "RGGRGBGRBRRBGRGG", "RGBBBBBRRRBBBBRG", "BRBRRGBGBBRRBBGR", "GRBBGGGRRRGGGGRR", "BBGBGRRGRRRBGBBR", "BRRBRBGBBBRGRRGB", "GBBRRBRRGRBGGRRG", "RBRGRGRRBBRGBBBG", "RGRGRRGGGGBBRBRR", "RBGGGRRRBGRRBGBG", "GBRRGBRGBBGRGGBB", "BBRGRRRGRRGGBRRR", "RRBRGRBGGBGRBRRB", "RGRBRGGBBRBBGRRR", "GBBGGGGRGRRGRGGG", "BRRGBBRBGBBGGGRR", "BBGGBRRRRRGRBGRB", "BRGBGGGRBRGBBRRG", "GGRGBRBRGBGGRRGG", "GRGRGGRBGGRGGBBR", "BGGRGRBRBGRGGRBG", "RGBBGRGRRGRBGRBG", "RRBRRRBGBGBRRRRR", "GRBBBRRRBGBRGBGR", "RRRBRRGGRRGGRGRR", "RGGGRBBBBGGRGBRR", "BGRRGBRRRRBRGRGG", "GRGGRGRRGGBGGRRB", "BGBGGGRBRGGRBRRR", "BGRRGBGRRBGRRGGB", "GGGBRRGBGRBBGRGB", "GRRRBBBBBRRRGRRG", "GBBRRBBRBBRRGBBG", "BGBRBBGGGBGRGGBR", "BGRRBGRBRBGBRBBR", "BGGRRGGBBBBRBGBB", "GGRRBGGRRGRGRBBB", "BGGBGGGGRGRRRGBG", "GRGBRGRBBRRRGRBB", "BRRGBBGBRRRGBBGG", "GRBRBRRGBRGRRRGG", "RBGGBRBBRBGRBBGB" };
        int T = 567554078;
        assertArrayEquals(new long[] { 9648419577L, 12486189933L, 11918635830L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case84() {
        String[] clipboard = { "RRRGBRRGBGBG", "BRBRGRBBGBBR", "RGRRBRBRRBRB", "RBRGBRGRRGRR", "RRBRGGBBRBGG", "GGBGGBGGRGGB", "GGRRGRGRRRRR", "BGGGGGGRBGRG", "BBBRRBGBRRRG", "BGRRBRBRRBGR", "GRBGRGBGRRRR", "BGBRRGGGGBBR", "RGGGRBRGBBBB", "RBRRBBRGGRBR", "BBGRBGGRGRGG" };
        int T = 953793258;
        assertArrayEquals(new long[] { 9537932640L, 6676552858L, 8584139364L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case85() {
        String[] clipboard = { "BGGBGGRRRRGBRB", "GBGGBGBRGGRRGB", "RBGGBGRGRGRRBB", "BBRGGGBRBBBGBR", "BBGBRRBRBRGRBR", "RRRBRRRGRRRRGG", "GGGGBBGGBRRBBB", "BGBGBRBGBBGGGG", "BBBRRBRGBBGRGB", "RBRRBBBRBGBGGR", "RBGGBRBGGRBGRB" };
        int T = 472099603;
        assertArrayEquals(new long[] { 4248896466L, 3304697264L, 3776796872L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case86() {
        String[] clipboard = { "BGRBGRRGGBGGBRGGR", "BGGBRBGRGBRBBBBRB", "RBGBBGGGRBBBRRGRG", "BGGRGBGGRGGRRGRRB", "GBGGBBRBBRGBBGRRB", "BRRGRRGGGGRGRRGRB", "BRBBGRBGBBRRGBGGR", "RRBRBRGGBBBGGRRGG", "GRGRRRRGRRRRGRGBG", "BGGBBGGBRGRGBGRGR", "GBRRBGGBBGBRRRBRG", "RRGGGBRBRGGGBRRBG", "GRBRRRGRGGBRRGRGG", "RBRRBGBGBRBGRRRGG", "BBBRRBGRRBRRGBRRG", "BGRRBRBRRBRRRRRBB", "RGGRBGGBBRRRBRRRB", "RGRRRGBRGGGBRRRGB", "GRBBRBRRGGGGRRRRB", "BRRRBGRBRGRGRBBGG", "BBGRBBGBGBRGRRRGR", "RBGBRBRRBGRBBBRGR", "BGRRBRRBRGBBBRBGB", "GGRRRGRBBGRRBRGBB", "GBRRBRBRRRRRBBGRB", "BGBGGRRGRGBBBBRGG", "RBBGBRRRGBGBRRGBR", "BGRBBRGGGRGBBBGRB", "GBGRBRRGBRGRBBRBG", "RGGGBRBRGRRRRBGBR", "RBBBRGBRBRRRRGBRR" };
        int T = 342595117;
        assertArrayEquals(new long[] { 5138926946L, 5481522014L, 5481522019L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case87() {
        String[] clipboard = { "RBRRGBGGRGGBRGGGGGBBRGB", "BBGBRRGBRGRRGBRGBBRRBRG", "RBBBBBRBRRBBBGBBRBBRBGG", "GBBRGBGBGRBBRGBRBRGRGRG", "RRGRGGBBRBRRRBBGBBGRBGB", "GBRBRGRRBRRBGBRBGRBRGRR", "RGRGRBRBRBBBRGRGRRRGBGG", "RGGRRRBRRGBRGRRRBGRRGGG", "RRRRBBGRRBBBGBBGGBRGRGR", "RGGBGBRGRRBRBBBGBBGGBBB", "GBGBGGRBRRRGGGRBBBRBGBR", "GRBRGGRGGGGBBGGRRGRBBGR", "BGGRGBRRGGGGRRGGGBBGGBR", "GGRRRGGBGBRBRRBRBGGRBGR", "GBRBRRGGRGRGGGGRBGGRBBB", "BGRBBGGGBRGRRGRRRBRGRGB", "BRGGBRBRBGRRBBBRGGGGBGG", "GBGRGRGBBGBRRGRRGBBGRRR", "GGBBRGGBBGBBGGBBRGGRRRG", "RGBGGGGRBRRGBBBBRBGBGRR", "RBBGGBBRGGRRGBGRGRBGBGR", "GRGBGRBRGGBBRRGBRRBRRGB", "BGBRRRGBBGBBBBBGGBGBGGR", "GRRGBRBBRBBGBRRGBBRRBBR", "GGGBBBRBRGRRBGGBGGGGGBG", "BBRBRBGRGGRRRGBBRRBRBGR", "GGGBGGGBBGBBBBBRGBRRGRB", "BGBGRRGRRRBBBBRRRGGBRRR", "RRBBGBGGRGGGRBGRRRRBBBG", "GGGGGRBRBRGGRGGGGRRGRRR", "RGRRBGGRRGGGGGGRGRBGBGG", "BGRRGBRBRGRBGRBGGBRGRRR", "GRRBBBGBGGGRBBGRRGGGBRG", "BRBRBRBBRBGRBBBGGBGGRBG", "BRRGRGBRRBGGBRGGGBRRGGR", "BGRBRGGBRRGGBRBGBGRGGRR", "GGRRRBBBRBBRRRGGBGGBGBB", "GRGBBGRGRRRBGRRRBGGGBRR", "GGBRRRGRRRBRGRBGGBRRGBR", "BGRRGBGBGRGGGBRBRRGGBRB", "BRGGBGRRRRGGGRRRRRBBGRG", "BRGGGBBGGRRGBGBBBBGGRGR", "BBRBRRBGRGBBBRBBGRBRRBR", "GBGBBRRRRRGBGBRGGBGRRGB", "BRBBBRBRGGRBBBRBGRGBGGG", "RGBRRRRBGGBRRRGBGBBRGGR" };
        int T = 523432208;
        assertArrayEquals(new long[] { 8898347879L, 15179534369L, 11515508886L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case88() {
        String[] clipboard = { "BRGRGRBGR", "GGGGGBRGR", "GBRRBBBGG", "BBRBRRBBR", "GRRGBGBRR", "GRRGRRBBB", "BBGRBBGGB", "BGRRBRGGR", "GBRRBRBRB", "GGGRRGRRG", "BBBRBRBRB", "BGGBRGRRB", "GGGRBBBGG", "RRGBRGGBG", "BRBRBBRGG", "BBRGBBRBG", "GBBRGGRGR", "GBBRRRGRG", "GBGRGGRRB", "RRBGGBBRR", "BBGGGBGRG", "BGRBGGRBG", "BBGRBGGGB", "GGRBBBBRG", "RRRBRRBBR", "RBGGRRRBG", "GGGRRBBGB", "GRBGGRGGR", "GGBRGRRGB", "BGBGBGRBG", "RRRBGBBRB", "BBGBBGGRB", "RGGRBRRRG", "GGGGGGRGG", "RBRGBBBGB", "RGBRBGRGB", "BGBGGGRBG", "BGRGGBBRB", "BBRBGBBGB", "RBRGGRRBB", "RRBRBBBBG", "GBRBBRGRR", "GBBBGGBGB", "RRRRBBBRG", "RBBGGBRGG", "GBBGGRGRR", "GRRGGRGRB", "BBBRBBGGR", "BGGBRBGGB", "BGGRRBGRB" };
        int T = 211155339;
        assertArrayEquals(new long[] { 3378485546L, 4645417591L, 4223106917L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case89() {
        String[] clipboard = { "..RR..", ".....R", "RR....", "....RR", "..R...", ".R..RR", "......", "....RR", ".....R", ".R..R.", "R.....", "R.R...", "R.....", "...RRR", "......", "R....R", "..RRR.", ".RR..R", "...RR.", ".RR...", "R.R...", "R.R...", "R.R..R", ".R..R.", ".....R", "RR....", ".R.RR.", "....R.", "R.RR.R" };
        int T = 61673903;
        assertArrayEquals(new long[] { 1850217141L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case90() {
        String[] clipboard = { "R.RR....RR..R.R...RR............", "R.......R................RRR..R.", ".RR....R..R..R............R.....", ".R.......RRRR........RRR.RR..R..", ".RR..R...RR.......R....R...R..R.", ".....R.R.RRRR..................R", "...............R..RR......RR.RR.", "............R...RRRR..R.RR.R.R..", ".....RR..........R....R.......R.", "...R......RR.R..RR......R.RRR..R", "........R..RR...................", ".RR..RR.....R..R...........R.R..", "..RR....RR...R...RR..R.R.....R..", "..R...R.R....R.R....R......R....", ".R.RR..R......R.R..R......R.....", "RRR..RR..RR.....R............R..", ".....R.........R.....RR.....R.R.", "R...R.R.......................RR", ".................R..R..R....R.R.", "...R..R.....................R...", ".RR...R............RR.....R...RR", "..R........R.R.R.....RR....RRR..", ".RR......R.R.....R.RR.......R...", ".......RR..R.....R..........R...", "...R....R........R...R...R......", ".R.........R.R.R.RR.R.....R.....", "......RR.....R..RR..R...........", ".RR.R..........R.R...R.R.R......", "R...RRR......R..............RR..", "......R..............R........R.", ".R....RR..R..RR...R.R....R...R.R", "..R.R..R..R.......R..R.......R..", "......RR................R......R", "RR.....RRR....R.R.......R.......", "RRRR.......R.R..........R...R...", "...R...R..RR.....R...RR.R...R...", "....R..R.RRRR.....R..R.......R..", ".....R.....R..........RR....R.RR", ".R..R......R...R..RRR.R.R.R....R", "R.....R..R....R....RRR.R........", ".........R...RR..R.....R.R....R.", "R...R...RR..........RR....R...R.", ".R........RR......RR..R.RR......", "...........RR...RR.R.R...R......", "R....R.....R......RR.R.....R...." };
        int T = 298299260;
        assertArrayEquals(new long[] { 19687752089L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case91() {
        String[] clipboard = { ".......R..RRR.R..R...R.RR..", ".................R....RR...", "...RR...RRR.R...RR.R.......", "......RR.RR...R.......R.R.R", ".........RR.RR.....R....R..", "...R....R..R........RRR...R", "..R........R.R..R..........", "R.....R...R.R.R....R..R.R..", "......R.......R....R..R..R.", ".R.......R.................", ".........R....R.RRR...RR.R.", "..RR....R.........R...RR.R." };
        int T = 697071097;
        assertArrayEquals(new long[] { 21609204123L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case92() {
        String[] clipboard = { "...R.R", "..R...", ".....R", ".RRR..", "R.R..." };
        int T = 70046735;
        assertArrayEquals(new long[] { 490327148L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case93() {
        String[] clipboard = { ".R...RR..", "...R.....", "R........", ".....R.R.", "RR.R....R", "R.R.R....", "...R....R", "R.R......", "...R.RR.R", "RR.....R.", "..R..R.R.", ".R..R.R..", ".......R.", ".R.RR.R..", "..R.R....", "R..R.RR.R", ".....R...", "...RR....", ".R...R.R.", "....R....", "...R..R.R", ".RR.....R", "...R.R...", "R..RR....", "R..R.RR..", "...R.....", "....R..RR", "..RR.R..R", ".R.R.R...", ".........", ".R.....RR", "......R..", ".R.R.R..R", ".R.RRRRR.", "......R.R", ".........", "......R..", "..RR.R...", "...R.....", "...R..R..", "......RR." };
        int T = 486955633;
        assertArrayEquals(new long[] { 19478225446L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case94() {
        String[] clipboard = { ".B...B....", "B.........", "....B..B..", "....B.B.B.", "..B..BB.BB" };
        int T = 494880709;
        assertArrayEquals(new long[] { 0L, 0L, 3464164973L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case95() {
        String[] clipboard = { "B....BBBB..B.BB..B.B.B..B.......B.B.BBB....B.B", ".....B.......B..B...B..........BB....B.B.B..B.", ".B....B...........BB..B......BBBBB..B.....B.BB", "B.B......B...B.B....BB....BB.B..B.BB...BB.B.B.", "....B.B.B..............B.BB......B.BBB......BB", "...B.........B..B...BB....B..B.B.B........BBB.", ".BB....BBB..........B.BB.BB...B..B...BBBB..B..", "BB.B.B.....B...B.......B.....B.B.B.........B..", ".B..........BBB.BB...........B....B.B.B.......", "BB.B.......B...BB...B...B....B......B...B...B.", "..B.......B...........B..B....B...B......B....", "......B...BB..B..B....B...B..B..B......B..B...", "....B.B...B...B.B.........B...B.B..BB..B......", "B.......B..B...B..B.B....BB.B.......B..B.B....", "B.B...BBB....B.B..B.....BB......B....B..B...B.", "........BB..BB........B..BB.B....BB...........", "..............B.B..B...B........B............B", ".....B...B.B.........BBB............BB.B......", "..B......B.........B.......B.B...BB...........", ".B........B.B..BB.......B..........BBB........", "........B....BB...B...B.....B..B....B...B..BBB", "...B.BB....B..B..B....B.B..B..BB..B...........", ".......BB...B.BBB..B......B.....BB............", "...B............BB....B.......B......BBB......", "..B....B......B...B.....B.......B.B..B.B..B..B", "...B.B.B..............B.B.B..B....BB........B.", "..B.B..B..B.....B........B.B...BBB...B.......B", "B.........B...B..B....B.BB......B..B..B.....B.", ".....B......B......B.B.....BBBBBBBB....B......", ".....B....B...B..B...B..BB.BBB..B...BB.....B.B", ".............BB..B....BBB.......B..B.....B..B.", "...BB....B.........BB.B...B..B.B..B.....B.....", ".B....B...B..B........BB...B....BBB...B...B..B", "....B.....B.B.B....B.....BB.......B...........", "..BBB........B.........B......B.B..BB.......B.", "..B...B..B..B..B.....B....BBB.........B...B...", ".BBB..B.........BB..B...B..BB.B............B.B", ".BBBB............................BB.B..B......", "B..B..B..BBBB.B..B...BB...B.B..BBB..B.BBB.....", "..........B......B.B....BB...BBBB...B.BB.B....", ".B........B....B...B....B..........B....B...B.", "B...B....B.....B.B....BB....B..B..BBB...BB....", ".B..B...B...B....B.BB.BBB.BB...B.BBBB.BB......" };
        int T = 395359709;
        assertArrayEquals(new long[] { 0L, 0L, 33605576720L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case96() {
        String[] clipboard = { "....B.B......B.B.........", "......B.BB...........B...", "B....BBB...B.B.B.B...B..B", ".B.......B........B......", "....B..........B..B.....B", ".....B.....B.B....B....B.", "...................B.BB..", "BBB..B..B.......B..B.B...", ".B...B.BB.BB.....BB......", "......B.B............B...", "...B...B.B.BBB...BBBB....", "............B......B....B", ".........B.......B.......", ".......B.B...B.BB........", ".BB...B.BB.......B.......", "......BB..B......B...BB..", "B..........B...B.BBB.B...", ".........B.B.BB.....B....", "B..B...B..B..B.B.B.......", "B....B.B.BB.BBB..........", "...BB..B..B....B.........", "B.B...B.B...BB..B....B...", "..B.BB..........B....B...", "...B..B..BB.....B.B..B..B", "B........BB....B...BB....", "BB.B.....B..B.B.BB.....B.", "B..B......B.........BB..." };
        int T = 121168022;
        assertArrayEquals(new long[] { 0L, 0L, 5694897372L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case97() {
        String[] clipboard = { "G.........G....G.", ".G....G.G.G.GG.G.", "..G.G.GGG...G.G..", "GG...G....G.G..G.", "....GG....G....GG", "G.G.....G.....GG.", ".G...G.GG..G.....", "...G............G", ".......GGGGGG..G.", "G....GG..........", "GG...G..G..G..G.G", "...G.......GGG...", ".....G..G.G...G..", ".....G....G..GG..", "......G.G.......G", "G..G..G.G......G.", ".GGGG....G......G", ".G......G........", "..G..G.GG..GG....", "G................", "GG.GG......GG....", "........G..G..G..", "....G..G..G......", ".......GGGG..GG..", ".................", "..G........GG.G.G", "..G..G....G...G..", "..G.G...GGG.G..GG", "....G...GG.G...G.", "......G..........", ".G....G......GG..", "............G...G", "G............G...", "...GGG...G..G...G", ".....G...........", "G...G.G........GG", ".G.G......GG.G...", "G.....G.GG.G.G.G.", ".G...............", "G....G.GG........" };
        int T = 693960753;
        assertArrayEquals(new long[] { 0L, 34698038000L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case98() {
        String[] clipboard = { "...", "G..", "...", "G..", "..G", "...", "...", ".GG", ".G.", "GG.", "GG.", "..G", "...", ".G.", "..G", "...", "...", "...", "G..", "..G", ".G.", "GG.", "...", "...", "GG.", "...", "..G", "...", "G..", "G..", "..G", "G..", "GG.", "...", "..." };
        int T = 430243975;
        assertArrayEquals(new long[] { 0L, 9035123483L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case99() {
        String[] clipboard = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int T = 50811507;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case100() {
        String[] clipboard = { "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int T = 881374234;
        assertArrayEquals(new long[] { 0L, 0L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case101() {
        String[] clipboard = { "G" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 0L, 1000000000L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case102() {
        String[] clipboard = { "B", "R", ".", ".", ".", "G", "R", "B", ".", ".", "G", ".", ".", ".", "G", "G", "G", "B", ".", ".", ".", "G", "B", "." };
        int T = 1000000000;
        assertArrayEquals(new long[] { 2000000000L, 6000000000L, 4000000000L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case103() {
        String[] clipboard = { "G", ".", "B", ".", ".", "R", "R", "B", ".", ".", ".", "G", "B", "G" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 2000000000L, 3000000000L, 3000000000L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case104() {
        String[] clipboard = { "B.GGBG.G..RG.R.RR." };
        int T = 999999997;
        assertArrayEquals(new long[] { 3999999988L, 4999999985L, 1999999994L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case105() {
        String[] clipboard = { "RBGGGBGGRBRRRBRBRBGGGBGRBBRRGBBRBBGGRRRGBRGBBGGRGR", "GRGBRGRGGGRBGBBBRBBBGBBRGRRRRBGRGGRGGGRGGBRGBRRGGG", "GRGBBGGGRBRBGGBGRBRRRGRGBRRBGBGBBBGBBBRBBRGRBGBGBR", "RGGBBRGRGGRRBBGBRBGBBRRBGBRGGBRBRGRBBBGBBRBBBBRRGB", "BGGBGRRBBRRBRBBRGBRRGRBBGGGGBBGRGGGGBGGGBBRGRGGBGR", "GGRBBBRRGRBRBGRRRRRGRGRGRGBBBBGRGBRBRRRBRGGGBGRGGB", "BBGGRGBGBRGBRGGBRBGGBBGBGBRBBBBGBBRRRGGBGRRRBRRBBB", "BBRBGRBRRRBGBRBGBGGGGBBBRBRBGRRBRBGBBRBBRGRBRGRRRR", "BRGBGRBRBBGGGRBGRBBRRRGBBGGBBRGGGRGGGGRRRRRBRRBGGR", "GRBRRGBGRRGRBRRBBBGRBBRBBBGGRBRBBBBBRRGRRRRGGBGGRB", "GGGRBGBRRBBBBGBRRGGBRBRGGRRGBBRRGGGRGRRRBRGBGGRRRG", "GBBBBGGRGGRRBGBBGGRBRGBRGBRRGGRRGRRRRRGRRBGBGGRRRG", "RRBGGGRRGGRRRBBBBRRRBBGGBGGGBGRGBBGGGBGGGRGGBBBBRB", "RRBRBGBBRRRGRGRGBBRRRBGRRGRGGRBRGRRBBBGRGGGBGGBBBG", "RRRBGBGGRRGRBGGGRBRRRBGGGGGGGRRBRGGBRBRRBGBGRRBBBR", "GRBGBRBGGBRBGRGRGGBBBBBBBRGGGBGGGBGRRBGBRRGRBBGRRR", "RRGRGRRRBBBRBRRBGBRRGGRGBGBBGGGGBBRRBGRBRBBRRGBBRR", "GRRRRGGGGGRBGRBRRBBBGGGBBBRGRRGGGBRRRGRBRRRBGRBGGR", "GGRRGBBGRRGGBRBRRRGBBBGRRGGGBBBBGBRBGBRBBGBBRBRGGG", "RRBGRGGRBGRGGBRGBRBRBRGBBBBRBBRBRBGBGBGGGRGRBBBBRB", "RGGGBGBBGRBBBRBGGRGBBBRBBGBBGRBRBGBGGBRBBRBBBRBBRR", "GRRBBGGRBBBGBGGGBBGGBBBBRGGBGRRBRGBGBRGBBGRBGGGBBB", "RBRGGGRGGGGGRBGGBGRRGRRRRRGRBRGGRBRRBGGGBRGRBRRBGG", "BGRGRRRGBBBBGRGRBBBGGRRBGGGRBRRRBBRBBBRBGBBRRRRRRB", "BRRRBGGGGBRBGRBRRGBGBBGGRGRRRRRRRGBBBGBRBGBRBBGRGR", "RRBGGRBGGRRBRGRBGRRGGRRBRGGGBBRGRRGBBGGBGGBGBRBGGB", "BBBGGRRBRRGGGRBBRRRRBRGBRGRBRRRGGBRRGBRGRBRBBBGRBG", "RGRBGRRBRGGGRRRGBBBRGBRBRGGGBGBGRGBBGBBRBGRBRRGGGG", "GGGBGGRBBRBGBGGRGGRBRRBBRBGGGBRBBBRRBGBRRGRBRRRGRB", "RRBRRGGRBGGRBRBBBBGGRBBGBBGGRBRRGBBBRBGRGBGRGRBGGG", "BRRBRBBBRRGBRBGRGRGRGRBBRBGGRRGBGGGGBRBRRRRRBBBGRB", "BGBRBBRBRBRGBRBRGGGBBBBRBRGBBBGGGGRBGBRGGBBRBRGGRB", "BRGBRBBRRRRBRRBGGBRRRBBBGBRBRRGGRRRBBGGRRRRGBRBGBR", "BRGBBRBBRBGGGGRGRBBRBGRRRRBBRBBGGRGGGGGRRRGBGRGBGB", "BGGBGBBGGBRGBGBBGGRRBGBBBRGBRBGGRBGBBGGGGRGBRRRGGR", "GGBBRRRBBBRRRGGGGRGRGBBBGBGGRRRBBBRGGBRBRRRRGGRGGB", "GGGGGRGGGGRRGBGGGGRBGGGGBGBGBRRBGRGRBGBBRGGGGGRRRG", "GBRGRGRBBRBGGBBRGGRBRBRGBGBRBBRBBBRBBBRGBRBRGGRGRB", "GBBRRBGBGRRRGBBBBRGGRGBRRRRGGRBGBBGRRBBBRBBRRBBGRB", "BBBGBRGGGRRGBBRGBBBRRRBGRRBRBGGBBRRRBBRBRGBBBRRGBG", "RRRRRGGBGRRGRRGGRRGBRGGGBBGGGGRBGGGRGRGGBGGRRBGRGR", "GGGRRRRGBGRGBBGBRRRBRBBRGBBGRGRRRGGBRRGGBGBRRBRBGG", "GRGBBRRBGBBBBGBRGRRRBBGGBRRRGBRBRGBGGGRRGBBBBGRBGR", "RBBBBGGGRBBGGRGBGRGRBRRRBBRRRGGGGGRGBBBBRRBRGBBGRG", "RBRGRGGRRRRBBBGGGGBBBGRBGRRGGBRGRRRBRRBRBGGBGBRGRG", "GRGGGGBRBRRGBBRBBRRBBGRRGGBGBBGBGRGGRGGGGGGBRRGRGR", "RGRBBRGGGBGRGGGBGBRBRRGBRGGRGBGRBGRRGGBBRBBRGRBBGR", "RBGBRBBBBGBGGRGBRGRRGBBRGBRRBBRBBGGRBRRBGRGGGGBBGG", "RGRGGBGRGGGRGGGGBRRBBGGRRRRBBGGGGGRRGGGBGBGBGRBRRB", "GGRRRRBBRGGRRBBBGGGBRBGBRBBGBRGBBGRGGBRRBBBGRGRRBG" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 34000000797L, 36000000806L, 29000000798L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case106() {
        String[] clipboard = { "BBRGBGBBBRBRBRBBGBGRRRRBGBBRGGRRGRBRGBGBRBGBGGBGGR", "BGBGGGGRBRBRGRGGBRBBBGRGBBGRBBRRBRRGGRGRRGBGGBBGRR", "RGGRRBRRGBRRBBRBGBRGRRGRBGBBGGGBBRGRBBGGRRBGRBRGBR", "BGBRRRBGGBBRGGRGGGBRBGGRRGGGBGRGRRRBGGBGRGBRBRBBRB", "BGBRRGRRRGGGBRRBRRRGGGGGGRRRRBBGBGRRBBGRGBBBRGGRGG", "RBRRBGGRGBRRGBBBGBGBRRBBBBRGBRRRGRRGBGGRBGBBRBGRBG", "BGRBBBRRGBGRRBRBRGBBGGRRRRRRBGBRBRGRGRGBBBGBRRRGBB", "BRBGBRGBGGRBRRBGRBRGGGGRBBGGRRRRRBGBGBRBBGRBRRRGRR", "BGGRGRGGBBBBGBRRGGBBRBRRGBBGGRBGBBRRBRRRRBGBBGGGRG", "GGRRBBRBGBBBGRGRRGRGRRGGRRRBGGRRRGBRGGGRGGGGRRBGGG", "RBRBRGRGGGGBBRRGRRGGBGRGRGGGRGRBGRGRGGGGGGBBRBBGGG", "BBRRBRGBRGGRBGBGRBBBBGRBGGGBRGRRRRRRGBGBGRBGRRRRRG", "BRBBRGBRRGBBRRBRBGGRBGRBGRGBBBGBRBGGRBGBRRGBGRGGBB", "GGRBGRRGGRBBBBGGBGGBBGRGGRGRGBBGRBBGGRGBBGRBBBGBBG", "BRGGGBGBGBGRRGRGRGGBRRGBRBGGGGBGBBRBRBGRGRRGBBGRGR", "GRGRRBGBGGGRRGGGRRRBBBRBRRRRGBGRRGGBBGBRBGRBGBBBGG", "RBRRBRBBRRBRGRBGRGBGRRGBRGGRRBGGRBBGRBRBRGBBRGBRRG", "BRBRGGGGRGGRRBRRBGRGGGBBGGBGRBBBBBGGGGGBGBBGBGGBBR", "BBBRBRBGRBBBGRBGGGGGGGRRRBGBRBRBGRRGRRBBGBBGBRRGBB", "RBBBGGRGBRRBRBBBRRBRBRRGGBRRGGRRGBGBBRBGBBGRRRGBRB", "RBRBBGBBBBRGGGBGBRGRBRGRGGRBBGGBRBBRBGGGGBBRRRGBGG", "RBBRBBRRGGBGRGBRRRGGGGBRBBGGBBBGBBGGBGRBGRGRBGGRBG", "RGBBBBRGBGBRRGGRRBRBGGBBGRBBBRRBBRBBRBBRRRBBBGGRRB", "BBBRGBGRRBBBRGGBRRRBGGBBGRGGBBGRRRBRGBGBRGGBBGRGBG", "RRBGBGRRRGBRGRGBGGRRGGBGRGRGBBRBRRRBBRRBRBRRRRRRGB", "BGBGGGBBBBRRGGGGBBRBBBGGRRRGGBGGRGBRBBBRRBGGRRGRGG", "RRGRGGGBGRBGGGGBGGGGBRGGBBRRBBGRRRGBRGBRBBGRGRGRGR", "RRRGBBBBBRBBBBRBRGBBGBBGRBBGGBBBBRBGRBGRGBGBRBGBRR", "RGRGRGGGGBGGBRGGRBRBRBRGGBGRRRBBBGBGBGGBGGGGBRRGBG", "BBGBGRBBBRGGBRGBRGGGBGBGRBBRGBGRGBGGBBGBRRBBGRGGGB", "RGGRGGBGRBRGRBBRGRBRRBGBGBBRRBRGBGGRRGRRRRBBBGRGRG", "RGBGRRGGRGGBGGBRGBGGGBRRGRRGGGGRRBRRBBRRRBBRBGGGGR", "GGRRBBGRBBGRBGBBGRRGGBGBGGRGGGBGGRBBGGGRRGGBGRBBBR", "BBGGRBGBGBBRRRGGRRRBGGGRGRGBBGGGBRRBGGRRGRBGRRGRRB", "GGGBRGRRGBRRBRBBRGBGRBRRGBBBBRBGBRRGGBRRGRGBRBBBRG", "BRRBGRRBBBRGBBGRRRRGBRRRGRRBBRGRBRBBRGGGRGGBRBGBGR", "GGGBGGRRGRGRGBBBGGBBBGRBRGGBRGBRBRBRBRGBBGRBRGBRGR", "RRBBRRGRBRRGRRRBBGBGGGBGRBGRRBRBRBBBRGBBGGRRBRBGRB", "GBRGRBBBBRGGGRBBGRRRBGRGGGGBGRGGGBGGGBBGBBRBRRBBGG", "BGGBBGGRGBGGBGGBBBRRRBGRRBGGRRBRGRGGGBRGRBGBRGGBGB", "RRRBGGGBBBBBRBGRGRGBBBBRBGBBRRBBBGGGGRBGGRGGRRGBRG", "GBRGBGBBBRBGBBBGRBRBBRBRBBRBRBBBGRRBGGBRGRBGRRRGRB", "RBGBBRBGRBRGBGRGBBGGGGGRGBRBRRGBBRRBGBGGRGBRBRBGGR", "BRBBRGRRRBBBRBRGBBRRGGRBGBBGRBBGBGGRGGBBBBRRRBRGGG", "BRRRRGGRRRRBRBRRGGRGGRBBBRRBGBBGGRBBGRBBBRGGGRGBBG", "GRBBBGBGGGRBBRRRRBRBGRRBBBGBGBBGRBRRGBBGGRBBGGBRRB", "RBRBRGRGBRRGGRBRRBRBRBBGGBGGBRBRGRGBRBGBGBRGGRRGGB", "GRGRBGGRGBBBBRGRRGGRRBGBRBRGRRGGBGGRBBRRRBBRGRGGBB", "BBGRRGRRRGBGRRBBRGBBBRRRGBBRRRRGGGRBGGRRRGBGRBGBRG", "RBBGBRGBGGGBGBRGBBGBBRBRRRRBGBGGRBGGRRGGRRBBGRRBRB" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 34000000780L, 25000000821L, 40000000800L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case107() {
        String[] clipboard = { "GGBBGBGGRRBBGBRRBBGRGBBGRBBGGGBGBRRGBRGBGGGRRBRGRG", "GBBRBRGBGGGBGBGRBRRRBGGGBRGGBRRRGRGGGBRRGRBGGBGGGG", "BBRBBGGGGRGBBRGBBBBBRGGBGRRGGBRBRGGGRGGBBGBBRGBRRG", "RRBRBRBGGBBGRRBGRRGRRGGBBRGGRBGBRGBRRGBGGBRGBRGGRR", "RGBBGRBBBGGRGBBBBGGGBRGRBBBRRGRGGGBGBRRGRGGRGRRRGB", "RRRBBRBBRGBRBGGGBGGBGGGGRRRBGBGGBBGGBBRRBGBBBRBBRR", "BRGGBRGGRBRBBRBBGRGBBGGBGRGRGBGRGRBRBRGGGGBGBGRGBB", "RBBRRBGBGGRBGBGRRGRGBRBBGRGGBBGRRBBGBRBRBGGBBBBRBR", "RRBGGRGRGRGBRBGRGRBBGGBBRGBBBBBRRRGRBGBBBGGRBRBRBB", "BBRBRBRRBBRBGGRBRGGGBRBGBGRRBBRRBBGRBRGRRBRRBRRBRG", "BRGRBBBBBGGGGRBBGRBGBBRBRRBGGRBGGGRRRGBGGGGBGGBRRG", "BBBBRRRGBRBGRGGGBBGBRRRBBRBGBGGGGRBGRRGGRGRRGRRRGR", "BRBBBRRRBRRBBRRRRGBGRRGRBBGBRRRBBGBRBRGBBBRRRBRBGG", "GRBBRGBBRGRBGRRBGRRBRRRGBBGBRBBGGRGRBRBBGBGBGGBRRR", "GGGBGGBBGGBBGGRBRBRRBGRBBRBBRRBGBBBBBRGRBRRBRRRRGB", "GGBBBBRBRGGRRBGBBBBGBRGBBRBGGBRGRBGGGRGBGGRGGRBRRR", "GRGBRGGGBGGBGRBRBBGGBGRRBBGRRRRRBGGRGRRGRRGBBBRGGR", "GBRRBBGGBBGGRRGGGGRRBGBBGBBGRRRGGBBBBBBGBBBGGGBBGB", "GGBBBBRRGGBGRRRRBBBBRGBGGBRGRGRGRRRGRBBRRBBRBRBBBR", "RBRGGBBRBGBRRRGGBRRGBBBBRGGGGBBGGRGGGGGBRBBGGBGBRG", "GGRGBRGBBGRRBGBRRBGGBRGRGRGGGGGBBBRGRRGRBRGRBGRGGB", "GBBBRRBBBRGRBRBBRBBGRGRGBBBGGRBGBGRBBBGGBRRGBRGGBB", "RBBBRGBGBRBRGGBRBBRGGGGRRBBRRRRGBGRBGGGRGRBRBGRRBB", "BBRRBBBBGBBBRGGGBGGRBBBBRBGRRRBRRGGGRBGGGGGBRRGRRB", "BRRRRBRGGRRGGBGBRBGGRGRRBGRGGGGRRRGGRGRBGBBGRGRBRB", "RBRRBRBRGGBRRRRBGRBGGGRBBBBGGRGGRBGRRBRBRGRBRBRBBB", "GBRRGGBBGRGBGGRRBRBRBGBGGGBGBRRRGGBBRRRGRRRRRBGRBR", "GBRGRGRRRGBRRGBRRBGBRGGGGRRBBRRBBBGRGRRGBRRGRBRRRR", "GRGRBBGBBBGBBGBBBRGRGRRGBBRRGGGGRBGGBGRRGGBGRRBGRG", "RBGGBGBBRGBGRRGBGRBRRRRGBRGRBRRGRGBGRBBRRRBRGRRRGR", "GBRGRGBBRRGGGRRRBRGGBBGBRGGBRRBGRGBGBBRGRGGGRBBGRG", "BGBGRBRGRBGRRRGRRBBBGRRGRRRRBBGGGBBRGBBGGGRRRRBGGR", "RGRGBRRBGGRBBGBBRRRGGRGRRGGRBBGBBBRBGBRGRRBRGBBRGG", "RGGBGBBBGBRBRRGBRBRBRRGBBGBGRBBBBRRRBGGBRGRBGBRRGR", "BRBGBRGBGGRBRBBBGGBGRRBRGGGGRRBBBGRRGGBBRGRGGBGGRG", "GGGRBGGRRRRBGRBGGBRRBBRGRRRRBBRBRRGRGBGRGRBGGRRBRG", "BRRRGRBGBBGRGRGBRRBRGGBGRGRBRBRGBBRRGGRGRRBRRGBBBB", "RRGBBBBBGRGRGGGRRRBGBGRGGBBGRBRGBRRRGRBGRBBRGBGBBR", "RGGBRRGRRGBRRBRBRBGBBRBGGGBRGGBRRRBBGGRGRRGBGBGGBR", "GRGBGRGBBBGBRBRRRRGGBBGRGGBBRGBBGRRGBGGGRBGGGGBRRR", "BGBBGBGGBRGGGRGRGRBRRRRRRGGBBGGRRRRGGGRRRRGRGBBGGB", "GRRRGBBRGGGRGRRRGGRRBBGRRRBRRBRRRBRBBGRRRGRRGBBBGG", "GGBRRRGBGBGGGRBGGGGBBRRRBRRGRBBRRBRBBRRGBBGRBBRGGB", "RRRGRBBRBGBBGRGRBBGBBBRBBGGRBGBGRGRGRBBRGBRBRRBBBB", "BRRGGRBGBBBGGGRBGRGBGGBGGGRRBRBGRBGRGBBRBRGRRRBGBB", "RGGGGBRRRBRBGBGGGGGRGGRBRGRRRBRBGGBRGRRBRBRRRGBGGB", "RBGBBGGBBRGRBBGRRGBBGRGGRGBGGGBRRBRRBRGBRGBBGGRBGG", "BGBBRGRRRBBGBRRRBBBBGRRBRBGGRBRRGRRBGGGRRRGGRBRRBG", "BBBGRBRBRRGRBRRGBRBBGBGBGRGGGBGBGBBRGRGGBRRBRBBBBR", "BGBRBBGBGBGBRGBGBRGGRBGGBGRGGGGRRRRBBGRGRRRGGRBBGB" };
        int T = 1;
        assertArrayEquals(new long[] { 846L, 827L, 827L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case108() {
        String[] clipboard = { "BRBRBBGBGBGRRGGGBGGGGGBBRGGBBBBRBGRRBBBGBRGRRRRGRB", "RRRRGRRGRBGRRRRGRGRRGGRGRBBGRGGRRRRBRRBGBBRGGRGBGR", "GGBRRRBBRRBRBRBGGGBGRGRGGBBGRBBBRRGGRBRGRBBBGGGRGG", "RRGBRRRRGBRRRBGGGGBBBBRRBBGRRBGRRRBBRGBBBRGGBRBRGR", "RRGRGRRRGBGGRBRRRBGGGBGBRRRRRRRRBBGRGGGRRGBBRBRRGB", "GBRGRBGRRRRRGRRRGGRGRRGBRRRBGGGGBGRGGRGGRGBBBBBBBR", "RBRBGRRBGBGGBRBBGGBBBGRGGGGRRBRBRBBRGBGGBRGRRRBRGR", "BRRRBBRGGRBRRBRRRGGRRBGRRRGRGBBBRBRBRGBGGRRGBRGGRR", "RRGRRBBGGBBRRBGBBGGBBBGBRBGGGGBGGRBGBGBRGBBRRGBRBB", "RRGGBBRBGGBRBRRGGGBRGRRBBRBBRGBRRGGGRGRRBGRRRGBGRB", "RGBBRRBGGGRRRBRGGGGRGBGBBBBGGBRBGRRGGBGRRBRGGGBRRB", "BGRBRBGBBBRRRBBGRGGBRBGBBRRRRBRRBGRRBGRGGGGBRBBBBG", "BBBRBRRBBBBRGRBGBBGRRRGRRGBGBBRGGGRGGBGGBGGRRRRGRB", "RBRGGRBGBGGRGRBBRRBRGGRGBRGRBRGBRGGBBBGRBGBRBGRGRG", "GGGRRBBGGRBRRGGGGGGRGRGRBBBGGBRGGRBRGGGBRBRRRBRBRG", "RRRBBRRRRRBGGGBGBBBBGBBRGRRBGGGRRBGRBBBBGBBGGRRBGG", "BBGBRGRBBBGBRBRBGGRGBRRGRBBBGBBRRGGGBBBRBGRGGGGRGB", "GRBRBRRGBBBRBRGBGGBRBBRBRRGBRRBRRRRBRRBRGRGBRGGBRG", "BGGBBGRGGBBRBBRGRBRGRBGGGGRRRRBGBBBRBGRRBBGGRBBGBR", "GGBRBBRBGGRBBGBGGRGRGBBBGRRGGBRBRBBGRRGGGRBGRGGGRG", "BGRRBBGBGRRBRBBGGGBBBGRBBGRRRRBRGRRRBBRRBRBGGRRBBR", "GBBGBGBRBGRRGRGBRBBBRGRRRBRRRBRGRGBBBGBBGGGRGBGBBB", "RGBGRBRRGBGGBGGGGRRRGBGBGBBGGRRGRRGRBBRRGGRBRRGRGR", "RRRBGBRGRRBGGGRRGRRGBGRBBRBRRBRBGRGBRBGGRGRGGBRBRR", "BRRGGRRBGGRRGRBBBBRGRBGRRGBBBBGBRBGBGGRRRRGBRRBGGB", "RBBBRBRBBGGGBRGBGRBGGBGRGBRBGRRGGBBGBBBGGBRGRBRRBB", "RBBGGBBBBGGRBGBRBRBRGRRGRBGRBRRBGRBRRGGGGBRGGGGRBR", "BBRRBRBBGGBGBRGRRRRRRBBGBRGRRBBBRBBRRBBGRGBRRBGRGR", "GBGGRRRGRBGGRRGRRBGGGBGBGGBRRRGBGBGRGGGBBGBGRRBRGB", "BBBRBGBRRRBBBGBBRRRBBRBGRBRBBRRRRBRGRRBGBBGBRBGGGG", "RRRGRRBGGGBBRBRGBBBRBBBGRGGBRBRBRRBGBGRGBGBBBRRBGB", "BRGBRGRBRGRRBRBGRGBBGGRGBBGBRGRGBBRRRGGBRBRBGRBBBG", "GRRRGBBGBRGRBGRGGRGGGBGGGGGBRRRBBBRBBGGBRRGGRRRRRG", "GRRBBGGRBRBBRBBBBRGRBBBBGRBRRBRRRGRRRGGBBGBBGBRBRR", "RRBGBRGRGRRBRBGRBBBGGGRBBRBRRGRGGGBRRBGBBRGBBBGRBG", "GRRBBBBBRRBBGGGRGGRBGRBBRRGGGBGRRRRBBRGRBBGGRBBRGR", "RGBBRGBGRBRGGGRBRGRRBBBGGBBRBBBGBRGBBGRRGBBRBBGBGR", "RRRBGRRGRBBRRBBGGRRGRRBRBGBBBGGGRGGGBBRBBGBRRGBRGB", "RGGGGRGBBRRBRGGBGRRGRGRBRGBBRGRBRRGGBBRGBGGBRGGRBB", "RGGBBRBRBBGBBGRBGBBRGGBBGRRGBGBGRBBGBBBGGGBBGGBRRR", "BGRBGRRBBRRRBGBGGGGBGGBGRBBBGBRBRBRRBBRGGBRGGGBGBR", "RBGGGRRBRGGBRGRBRGRRRRGGBBBRGRGBBGBRBBRGGGRBBBBBGG", "BGRRRGGRRBRRRRBGRBRRGRGGBRRGBBRRRBGGGBRRGGBBBRBRRB", "GBGBGRRBRBRBGGGRGBGGRGRGRRGGGBRGGRRBBGBBGGBBRGGBBR", "BBBRGRGGRBGGRRGRBGRBRGBBBBBGRRRRGGBBGRRRRGRRRBRRBB", "BGBGRGGGRBGRRRGBBBGGBRBGGGBGGRBRBGGGGGGRBRGRGRRBGR", "BRBRGBBBRGGBRGGBBBRRBBGGGGRRBRRGBRGGBGBGBBGRBBBRRR", "BBGBRBBRBBBGRBRGGBRBGGGGRRGRRBRBGRGRGBGBGGRGBRRGGG", "RBBGBBRGBGRRGRGGBBBBGRBBGBRBBGRGRRRBGBGBGBGRRGGGGR", "BGBBGGBBRGGRBBBRBRGBRRGGGRRBRBBGBGGRBGRRGBBRGGGBBG" };
        int T = 1;
        assertArrayEquals(new long[] { 860L, 804L, 836L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case109() {
        String[] clipboard = { ".RG.R.B.G.BGGRRRG.GBRB.G.RBBG.RR.RGGB..B.GB.B", "RRR.RBRGGR.GGR.GR.RRB.GR.B.RBBBRBBRR.BGRBG.GG", "BBR.GRRRBG.RBGRG.R.RBRGG.BGRRRGB.G.RBGBGGGBR.", ".GRG..GGRBR...BRRR.GB..GGGBRG..BR.GGRB..GG.RR", "B..BRBBG.BR..RBBB..RB..BB.R.....B..BBBR.R.G.B", "GGBG.BBG.R.RRRR.BR..GRRRBR.GGGBGG.RGG...RGBRR", "GG.BG.BG.G.BRGGGBBGGR..G..BB.RGB.BGGBGBR.R.RR", "BGRR.BRRGBBRB.GBRBRRR.GRGRRGGRR..RRG.....GRBB", "B.RB.G..GRGRBGBGGGBBRR.R.GB.R..RGRB.GB..BRRRB", "GGGBGRRB..R.G.GGG.GBRRRR.GRRBRRBBR.GG.BB..BBR", "BRBBG.R.G.B.RB.GG..RBRR.GRGRBR..G.GR.GR.GRG.G", "..RGR.B.GBR.BRRRBG.BGRBBGGRBRG..R..RRRGG.BBBG", "G..B.B.RGGBG.GGBRB.B.GB..R.BBR.GR.BB.G.BRGBGR", "GRR.RGBRRGBG.GRRBB.RBBBGBB.RGRRRB..GGGGGGB.BG", "RBGGR.GBR.B.GBRRBBGRGGRRG..RBG.GRGR.B.GGGGBG.", "GGRB.RRGRRGRRRBRBGBRGRRGBBBB.BRBBB.RB.RG..RBG", ".RGBR.....RGB.GBRBGBBGBGB.B.BBBRGGGRRBBGBR.BB", "RB..GRBGBGR..BGBGBBGR.GR..GBBRRG..GRBG.R..G.G", "RRBBB.RGB.RBGR...BBRBBGBBBBRBGG.GRGBGRB.BBG.B", "BGGG.GRBR.G.RB.BGRBBGRB.B.G.BGBRBG.BGGB.GR.G.", "B.G...RRG.R.R.G...RGB.GGBBRRGGB...R..G.B.B.G.", "G..BB..B.RRGBRB.G.GBRBBB.GGG.B..GGRGR.RBRRBGG", "RG..BRG.GRGG.R.R.R..RRBRGGB.GBBGGRGGRRRBR.BBG", "G.GGRR..GRRB.RRBRGRRR...RGBBRGGG.RBB...RRG.RR", "B..GBB.RGB.GRBBGB.GRGRBG..BRB.GRGR..GBRRR.BRR", "RGRR.RBRRGRBRRGBGRG.G..RBRRBBR.BGGR.BBG.G.RG.", "BGBRG.B.R.BR.RBB.GBGGBR....RGR.G.GRBRRGB..R.G", "RBB.BBBRRR.RBRGGRRB.GGRRBR.G.GBRB.RGRBBBBGRRG", "RG.RG.BRR....GGGRBBRRGGRGGBBBG.GRBRRBBRGGR..G", "BBBGBBGGBR.RGBGB.R.GGRGBGGBBBGGGBGGG.GGRBG.BB", ".RGRGRBBG.RR.RG.RBR.GB.BG.BRR.GB.BGB.GRBGGRB.", "B.BG..RGG.BG.BBRRR.GR.G..BGGRB.GRRBBGBGGRGBRB", "BRGGB.RGR.GB..GGBBBBR.GB.BRGB...GRBGBG..GB.GB" };
        int T = 22;
        assertArrayEquals(new long[] { 1050L, 985L, 1020L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case110() {
        String[] clipboard = { "G..BGGBR.RGBB.GGGB.B.R...RGGRRBG.R", "GRGR.RBB..GR.RBRRRR.BRRGGBRG.GR.RG", ".BBR.R...GRBGG...RB....BBG.RRGBBR.", "BR.GR.R.RBR.G.RR.GGBRGGBRGGGBGRBGR", "G.BRRRR.BR.GRBBRGG..RBB.BB.G.BRRR.", "B.B.BRB.BGRR.BBBGGBGRB.BRBBGB.B.GB" };
        int T = 23;
        assertArrayEquals(new long[] { 309L, 429L, 300L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case111() {
        String[] clipboard = { ".R", "BG", "RB", "R.", "GR", "R.", "G.", "BG", "B.", "B.", "R.", ".B", "BR", "RG", "BB", "RG", "BR", "GR", ".G" };
        int T = 24;
        assertArrayEquals(new long[] { 195L, 100L, 171L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case112() {
        String[] clipboard = { ".BBB.BB.RRBBR.GBBR.GGRRGGRRBRRB.GRGB..", "RGRGRBB.GR.BR.GG.B.B...GBRRRRRRBGB.G.R", "BGGG...GRGRGGGGG.BRG.RBBG.RGG..BG...GR", ".GRR..RB.BBBBBGRGRBBRB.R.RRGBRG.BRBRRB", "B.B.GGGG..RBG.G.G..G..B....GRBBR.BG..R", "GBBRRRRRR.RRRGGB.RG.G.BRB..BBGG..BBGR.", "R.RG..BGGR.BGBBG.B.B.RGRR..GGRR.BBRBR.", "GGG.GGGB.GR.GBGBBG....G.RG.B.GB.G.G.GR", "B.RRBGGBR..GGG.B.BBRRBGR.BG..BRRBRG.GB", "B.RRB.G.G.RRGGR.B.RBRBBRG.RBRGB..BGR..", "BB..B.GRB..GRRGBGGRRGBG.RB..GB.B...GGG", "GRGBR.GRRGRGRRG..BG.G.BGG.RRGGG.GBGRRR", ".G..RB.BRRRGGB..GGGBRGBBGGBRBR...RRRGR", "B.GGGGGGRRBBBBG.BRRGB.RR...BGG.BGRGBRR", "BRR.B.B.R.GRBBGRG..G.GBR..RG.RGG.GGR.R", "G.R.BBGRBRR.BRRGBRG.G..BGRBB..R.RBBGR.", "...GBR.B..BGRB.BGRGBRBRBBGR..RGR.BBRB.", "GRBBR.BG.B..BGBGRBBBBR...BR.RB.BGGGGRR", "..R.BBGRRGBGBR.RR.RBGBRGGGB..BGBBB.BGG", "RRBGGGRBGBRRR.GBBGBRB.RBGRBG.G.BGGR.G.", "G.BRGBR.BGGGR.BRRRG.GRR.BBBG.BRBGGB.RG", "R..GGBB.BRBRRB.BB.G.BGRG..GR..BG.R.RGG", "B.GBBG.RBB..BG...GGGG.RGGBBRGRRRBRBBG.", ".RBGRGRBGGGBGBR.BBRRGRGRRRRRGG..BGBBGR", "B.R.G.B.BGRGRBRRG.BBRGRBB.GBR.BRRGBBGB", "GBGRR..RGR...B.GGBGRB..BRRRBR.BGGB.BBG", ".RRG.BG.RGBGG.B.GBBGG.BRRGBR..GGGR.G.B", "BRRRBG.RB.R.BGBR.BRG.RBRG.BGB.B..BGGGR", ".B.B.B.GRR.BBBRG.GRGB.B.GRR.RRBBRRBGRG", "R.R.RRRRG.BB..GBRGRRRRRBR.G.BRB.G.RBGG", "BRG.GBRB..GRB.RGG.RB.BGR.RRGG.B.B.BBR.", "GB.GR.GBRRRBRBGRGGR.R.GBB.GBBBRRRRGGBR", "GRBBB.B.RGRBGBRG.GGRR.BRBB.GR.RR.R..G." };
        int T = 25;
        assertArrayEquals(new long[] { 898L, 944L, 1027L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case113() {
        String[] clipboard = { "B.RBRG..B", "G.RBBBBGG", "R.G.B.BGG", "BBRBBBBGR", "RRB.BGB.R", "RBGRRGR..", "B.BGBR.B.", "GR.GGBBG.", "BB..GRGRR", "RBBGBBRB.", "...G.BB.G", "BBRRRBGGG", "B.GRBBGBB", "GGR.R.BBR", ".GBB..GBR", "GRB..BRB.", "GGR.BR.RG", "BBRGGGBB.", "GGBRGBGRG", ".RB...RBR", "....BGB.B", ".R.BRGBGB", "GGGBBG.GG", "RR..GRR.G", "..BBB...G", "B.GGRBGB.", "G.GRGB.GR", "B..BR.R.R", "RB..BBBB.", "RBGGGBGGR", "BRRB..BGR", "RB.R.G.BR", "GG.GGRG.R", ".RBRGBBB.", ".B.GRGGGG", "GR..RR.BR", "GRBGRGGRR", ".GGBRG.BG", "BBBGRRRRG", "B.BRBB.BG", "GB.RGB.GR", "...G.B.GG", "RBBGG.R..", "GBGBGBRB.", "BBGRBRGB.", "GR.BGRBG.", ".BBR.BRGB", "GBBBRGBRB", "GBRRBB.RG", ".RG.RBRGB" };
        int T = 26;
        assertArrayEquals(new long[] { 490L, 665L, 678L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case114() {
        String[] clipboard = { "GBGB", "GB.R", "RRGG", "BRR.", "GG.R", "RR.B", "RRGG" };
        int T = 27;
        assertArrayEquals(new long[] { 88L, 115L, 84L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case115() {
        String[] clipboard = { ".GB.GBRGR.G.RGB..RGRBGRB...RBRGRR..GGG", ".RBB..GGRRGBBRGRB.GBBGBG.RRRRRG.R...R.", ".RRB.BBB..R.GG.RBRRGBR.BRRBR.BRGG.BR.G", "BBRGBBBR..RBGBGGB.RBRBB.R.GR.RBBGBGRBB", "BBG..RBBG.RGGGR..RBRRG..GGGGBGRBBGRRB.", ".BR.RGGG.RG..GB..G...R.B.RGG.G.BRGB..B", ".R.GB.R.BRGRGBRGRRRG.G....B.BGBRGBGBBB", ".G..GBRBBB...RGGG.GGR...BG.BGG.RBB.GG.", ".GRRBRBGRG..R..RGBRB...BB.RRR.GRGBR...", "BGR.BG.GGG.BGRG.R.RBGRBRGRBBGRGBRR.G.B", ".RRGB..RBRB..BGRRR.GBG.R.GG.B..R..BBRB", "R..R..RBBGGBG.RRG..BGGGR.G.G..RGB.R.RR", "RR.RRG.RGB.GRRGB....G..BBBBRRG.B.G.B.B", ".GGRG..GRRGBRRBBGBRG...R.BG.G.B.G..GGG", "BBB.G.BBBGRBBBBR.RRGRGRRRRG.GRGBR.....", "RBGRR...BBBG..B.RRG.RRRBBRR.BGGBRRBRRG", "GB.BGBRGBB..RRR.GGRG.RGR.GGGG..R.BG.RG", "BBBG.RBB.GGRRG..GBGGGR.GRR..R.G..RRBBB", "GBBB.RBRR.BBGB..RGB.RGRG.GB.BBBGBGRRGB", "RBRRRBGGBBBGRRBGB.B.RG.RB.RBR.BGRBBRGB", "...RBRGBR..BRR..R.BBGBRG.RRRGGGRGB..BB" };
        int T = 28;
        assertArrayEquals(new long[] { 890L, 707L, 698L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case116() {
        String[] clipboard = { "RBBGGRBGRGR.BBRBGGGGBBRB", "RRBGGBBGBGBG.BBGGBR.BBRB", "G.R.B.BRGGB.B..BRBGG.BGG", "GG.RGRGGRRG.R..R.RGB.GBG", "G.BRG..RG..B.RBRBGBBGGGG", "RB..RBRGGB.GGRBRG...B.G.", ".BBRR.GG.GBBGGRBGRG.BRBR", "G.R.R.B.G.G.RRBBBBGBB.RG", "..BGBRBG.RRRBGRBRB..B.GG", "BRGBRR...BBRBBG.BB.RRBBR", "BGGRBG.BG..GGGB.R.RBBR..", ".G.BB.GGBRRRR.RG.B.G..RG", ".G.BR..R.GGGG.RGGBGG.R..", "GBRRRGBBB..GRGR.BBGGB.RR", "R..BG.GGRBR.RB.GG...GRRR", "RBRBRRBGRGRGRRGR.BR.GGRB", ".B.BBRGG.BGBG.GRG.RR.B..", "RBBB.B.RB.GGGG..R.R.RBRG", "G.RGGRR.RG.RBGGBBRBR..BB", "B.BR.BRRGR.GGRGGG.GG..G.", "GB.BRB.BGGRRGRBGBG...G.G", "G.RBGGBBGBB.RGG.G.G.R..B", "..BRBRB.BRG..RG...R.BBG.", "RRR.RRRGGGB.GBBRBGBRBBRG", "BG..BRB.BRR..GRBRGR.RRBG" };
        int T = 29;
        assertArrayEquals(new long[] { 603L, 667L, 649L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case117() {
        String[] clipboard = { "GBRBBBR..BRGB.R..BRGR.R..BGR.BB.BBB..BGB.B..B.BRRG", "BR.B.RR..RRBRBBRR.BB..R.BBRBBR.G.BGGBBRB.GBBBBBGR.", "BB.GG.G.B..RRB.GGGRG..BB.RBR....G.BR..BR..RBGRGRB.", "RRRBRB.RB.RR..RGRGBBR.RR.BG.RGBGB.RR..B.RBRRGR.BBR", "B..RRGB..BBBBGR.GGGRGGGGRBGGRR.BB...G.GBBR..RRRGBR", ".B.GG.GRBBBGG.R.G.BGG.RG...B.BB..R.R.RRBB.BRBG.BRG" };
        int T = 30;
        assertArrayEquals(new long[] { 608L, 267L, 947L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case118() {
        String[] clipboard = { "RG.BR.RRBB.R.", "GB.RR.GGBGBBR", "...RR..BGBGGG", ".RBGBB..B.BGR", "GG.RRBRGRG..B", ".B..BBG.GG.GR", "BGGGRB..GGRB.", "BB.G..RB.R.BB", "RGBGG.G.G.GBB", "GBGGR.RRB..BG", "GRRB.B..GRBGG", "B.G.BRG.BBGRR", "RGB.R..BBR.RG", ".B.B.RBGRB.RR", "RRRBRGGGRGR.B", ".B...GRRG.BRB", "RR.RBRB.BRGGG", "RGGRBRRRGGGBB", "BBBGRB.RBRGBB", "G.G.BBB.BG.RG", "B.RG.GGRRGBGB", "RGRGR.GGGG.B.", ".BBRBBGRB.G.R", ".RGBRGGG....R", "RBR..GB.BBG.G", "BB.GRRRRRG..B", "RG..BB..GGBGB", "BBB.RG.BRB.BR", "GGB..GB..BR..", "RBRBBBG..RRRG", "RR.B.RB.GB.B.", "RRGRGGRRGRGR.", "RRG.R.RB.RB.G", "BBBRGGR.GBG..", "G.GR.G.GR...G", "G.GBR.B.BBRG.", "G.GB.RBBBRRRB", ".BRBGBRRGRGRB", "G.G.R..BRBGBG", ".BB.BBB.BGBBR", "GRG...G.GGRBR", "R.G.GRBRBBBB." };
        int T = 31;
        assertArrayEquals(new long[] { 886L, 622L, 602L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case119() {
        String[] clipboard = { ".G.BR.GBB..R.BGBRGRBG", "G.RG.RRBGRBG...GGGRGR", "RGGRR.B.RGRGRBRRG.BRG", "RRGR.G.RRR.B.RBRG.RR.", "RBBB.BBGG..BGRBBGRRRB", "..RGBGGRGRG.GRRG..B.G", "RBRGB.RRG..BBG.RRRBBB", "RBRGRRBGGRRGG.BG.RBR.", ".BB.RGBBG.B..RRBBGR..", "R.R.RG.RB....GG.BRRRB", "BGGB.R.RRBRR..RGBBBBG", ".BGGGBGRRGRRRBBB.....", "BRRG..GBRBBRRGGGGRBRG", "B.R....R.BRGG.BR.BRGR", ".GBGGG.RBRB.BR.GBGBGG", "R...BRRRR.RBG.G.RGB.G", "G.BB..G.G.GB.RBR.RBRG", ".BBBBGGGBRGG....GBR.R", "GGRRG.GR.G.GBBBG.BB.G", "GRRB.GRBGGR.BRBRBRRGR", "B.RGBRGG...RB.BG.R.GB", "G.RRRBBGGGRG...GRG.GB", "RR.B.RBG.RGGGB.RGB.B.", "G.GRBRG.BBRBGRGBG.RB.", "R....GGGR.GBBG.GGRG.." };
        int T = 32;
        assertArrayEquals(new long[] { 672L, 660L, 558L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case120() {
        String[] clipboard = { "RG.BB.B.BBRB", "GGBRBRRGGGBR", "BR.GBBRGBR..", "RBRR.R.GRRR.", "RGBRRRGGRRRB", "....RB.BBBRG", "GBGR.RRRR..G", "GRB.GB.B.G.G", ".BBR.BGR.RRB", "BGBR.R.BR.G.", ".GGGGBGB.G.R", "BBRGGBGG.G..", "G.RG.GBRRGBB", "..G..RGB..GB", "..RBR..GBRBB", ".GBBB.BGGRGB", "BRBRB.B.G.R.", "GRBGBGR.GRG.", ".RRRGGRGRGG.", "GBGGBBG.R.GG", "GB.RR.BBGR.B", "G...RR.G.GBG", "R.BG.BRB.BRR", "BB.GGGBBR...", "RG..RRBGBG.G", "..R...GGGG.R", "G.BGBBGGB.RB", "GGGR.R.RGBR.", "..RRGBR.BG.G", "RGG.RB..BRBB", "..B.BBRGB..R", "RBR..RGBR.GG", "BGBBRR.GR.BG", "R.BG.RRR..BB", "BBGGGGGB...B", "GRR.BR.GR..B", "R.GB.RBGRR.R", ".GGGRB.BR.BG", "GBBG..R.B.R.", "BGRR..GR.GR.", ".R..BRGBGBBG", ".GRBRRRRGGR.", "BBBR.RG.BGR.", "..BBB.B.RGRG", "GGRB.RGBG.G.", "..RRRRBRRRBR" };
        int T = 33;
        assertArrayEquals(new long[] { 588L, 842L, 875L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case121() {
        String[] clipboard = { "R.G..GGBBGRG.GGRGRG.G.RRBG.G", "GGRRGBGRGB.BRBRBGGGRB.RG.R.B", "GGBBGR.RB..RGGR.GBG.G.GGGBRB", ".GB.GGGB.RBBBB.RGBGGGBRR.GBB", "RRGB.BRB.GB.BGR.B..GR.R..GG.", "GR.RGGBG.GBB.GR.BRBGB..BGRB.", "GR.G...RGBBB.BRR.GRBBB.BGGG.", ".R..BG.BB.BBGGRR.GGG.BBRRBRG", "..BBBGBR.BBGGGR.RRGB.BRBB.BR", "BBG...RBRRGB..B..B..RG.BB.GR", "B..B.BB.RRBR.G.RGGRGGBRG.RGB", "RB.GRRBG.GGBGGBRG...GGRRGBR.", "GR.GR.G.BRRBGR.BGRGB..B..BBR", "BB.RRGGBGBBGB.BBGGRRRRGBRRRR", "BB.GRRGG..G.R..BRGBR.BRRRGBR", "R.RB...BBG.B..BRGRBGGG..RG..", ".RGRBGGBBG.GRBRG.GR.GG.B.B.B", "..RGBGB.G.RG...RR.GRRR.RRG.B", "RG.BBBRBBRGRGGBG...B.GG.BGBB", "GBRBG.GBGRRR.BRBRGBRGGRBB.RG", "..GBB.B.RGB.R.R.BRG.BRB....G", ".BBBRR..G.BGBGR..RGRRBRBR.GG", "BBRRRRBRRRB.B..R.B.BGBG.GBRB", "GR.RGRRGRRRBRBGGR.BRRRG..GGG", "GRR.RG.RBBG.BR.BRBBGRR...GG.", "GR..BRB.RRBGBR.G...RBGBBB.RB", "G.GGRGR.BBB.R.GGBRBRB.BBGG..", "G.R..BG.GGR.RGG.BRR...GGGGBR", "GRGG.B...RRRR..RBBRRRBG..BBG" };
        int T = 34;
        assertArrayEquals(new long[] { 676L, 1162L, 788L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case122() {
        String[] clipboard = { "BBG.GRGB.RBR.B.RB.BRRRRRGB..RGGGGRR.RG.G.R.R", "G.RG.BB.BRB.RRRBGBBR.GGBGRBRBBR.BRBBG.GBB.RG", "B.G.GBGGRRB..RGBBGGBBRB...RGRRRBG..BBBRBGB..", "BGBBBGGR.BRBG.G...RRB..BRR.G.GGRGGR.RG..R..G", ".B.RB.BGBGGGBBG.GRGRB.R.RGGBR.R.GRBG.RBGGBG.", "RGRRGG.G.GBR.BRB..RR.GBGGGGRR..G.R..B.GRBB.R", ".BRRBR..BG..BBG.BGGB.RBBRRRBRR.GBRRR.BGBBG.B", ".RRRRBRGRRGBRGGGR..BGRB.BG.BGRRR.G.GGBRGG.GB", "BR.GR..B..RGBGGBRBGBR..BRR.RG.BBBRGBGRRRR.BB", ".BRRR.RRBGGGGRRGRB.GB..BGBBGR..B.BG...GRGGGG", "GGBRB.GGGBBBGG...R..R.GGBGBR.G.RR.R..B.R.RGG", "BBGGG..B.G.GGGBRRBBR.RGRRGGGRR.R..RGBBRG.BGB", "BB.BR.RGGBRG.RBBBB.RGGB.BGBRGBGBBBRRGGGGB.R.", "BB..BRBBRGRRBRRBBG..BB.BBRGBB.GB.BRGGRRRBGGG", "BRRBBRRG.RR..RRB.BBRRR.B.GRRRR.RBRRBB.GGBB.B", ".GG.RR.R.RBG.BGRBGRBRRR.GB..BRG.RGGRGRRB.G..", "RRRG.BGRGRRGRRRG.GBRRBRBB.GGB.G..G.RBB.RGBBB", "BGGGGGGRBG.RR.GR.R.GB.R.RBBGRRRG.RR.RRRGRBRB", "BBGRRBB.RGBRGRRGB..RBG.GGG.GGGRB.RGBBB.GGGRB", ".GRRRB.RBGRRR.RB.BG...RGBGRG.BRG.GGBRG..BGBB", ".RG.GGGGGGGBR.BRGRB..G.RRGG.BG..B.BBRBG.RBB.", "GGBR.R.RGBRBRR.G.GBB..GBRRRGGBGR.GGRBBGBRB..", "RRG.RBBBGGRBGRGBRGBRGBR.R.RRGG.BRBB.RB.BR.G.", "RGB.B.BGG..R.B.GBGRR..GR..BR.GR.B.G.GG..GRRG", "GBRG.B.R.GG.B.G.RBGBB.RRB.GB.BB..BG..G.GB.G.", "RB.B.BGRRBBGBBGR.RGB.RRG.RB.RGB.RGB.G.GBBBBR", ".GGRGR.B.GB.GRR.BG.G.BGRBRGRBBGGR.BGRG.G..R.", "G.GRGGGBBGRBGGB.BGBGB.G.GR.B.BBGBBBB.RRRBBGG", ".BB.B.GGBGGRBBB.RRGBG.R.B.GGRB.BGGGBGRB.B.BB", "RRGRR.RBR.B....GGGB.BBBRRBGGRBRRBBRRG.B..R..", "GBB.RB.GR..B.BR.RGBGRB....BR.GBRGGR.BGRGGRGB", "...RRBGGRBGGR.RBG.RBRR.BRG.GGBBG.RB.GBGBRG.B", "BBRG.GBGGR.BGB..GBGBR.BRBGGGGB.RGGGG.RGGRRBR", "RBRBB.GBG.G.GGRGBRB..BRGBBGR.R.R.GRBBRBRBRG.", "R.RRGGBGBGB..GR.RR.RBGG...RBGB.GGR.BG...R..G", "BRGBR.B.BRGBBGGBRGBBGRG.BBBRRBR.RB.GRRRR.G..", "BB.GR...BG.RGRG.BRRG.BGRRG.BBRGRRB.GGRBRRRGR", "RRRB.G.GG.GG.GB.BBRRR.GG..RG.B.BBR..BBRRBB.R", "BGRBBBGGR..BGB.BGGB..B.GB.GG.BGBRR.RRBGRRGRG", "GGRGGB.BGB.RGRGGBRR.G.GGGRBG..B.GRBR..G.B.BB", "..BGRRRBBB.BGRBRRGR.BRBB.R.GGBGR.R...RBRBRGG", "R.BG.R.G..R...R.R.GBG.G.BGG.BRGBRBGGRRBRGR.R", "RBGGBBBGRRGGRR.BB..G.R.B.BRBRB.B..GBRG.R..B.", "BRR..RBGG.BBBRGRBRBG.BRG.G..GBGRGBRBRRR..BGG", "RRBRGRBB...RGG.GGRG.RG.B.BGBRRBBBB.GRG...GRG" };
        int T = 35;
        assertArrayEquals(new long[] { 1833L, 1470L, 1610L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case123() {
        String[] clipboard = { "RGBGBR.RGRRGBBGB.BBG.R..BG.RGGRGBB.GGRBG", "RG.RGBG..BBR.RGBRR.RBBB.RGGRBR.G.BBGG.RG", "RRBRBR.B.GGRRBRRGGRBGRGBRRB.B.GR.BG..GRR", "GBBBBRGRBR..B.BG..GGBBGBB.GBRBRGRRG.G..G", ".B.RRGR.GR.G.....RR.R..G.RRB.GGBGRG.GB..", "RRRBGB..RGGRRGRRBR.GRBBRR.RRRR.BBBRRRRR.", "GBBBR....RRGBGRGRRR....B.RBBBRGB.B..RGGB", ".GGGRR..RB.R.B.RB.BGBRG.BRRGGGRGBBR.G..B", "BRBRBBRB.GGGGR.R.BBRBBR.R.RBBGG.B.B.G.BG", "RRGG.BBBGG.GRGGRB.GBR..G.GRB.B.G.G..BG.G", ".R..BB..GGRRRRRBGRRGGRGRGBRRBRBRRBGGR.GR", ".R.GBBRBBRBRB..G...R.GGB..BRB....BB.GBB.", "RGBGBBBBGBG.R.RR...GGGG.GRRBGBRBBBRRR.BR", "GGBGBRGBGGRR..GBBRG.B.GRGR..GR.B.GBBGRRG", "BRRBRRR.RBGGRRBBBRRBG.RGG.BGBBRRGBBRGBGG", ".BG.R.R.BBBGRGRR.G.BR...R.BR.GRBGGGRGB.G", "G.RBRGBG.BRBGRGGRGRR.RRGG.BGRG.....RGB.G", "G..RGRRBGRR.BGRRGGGBBBR..GRGGB.R.BGR..RR", "BGBGR.G..BRB.GGG.GRBRBGGBGGGRBB.RB.B..G.", ".GRRRGRGGBBGRRRB.BB...GBR.RGB.GRGRRGBB.G", "G.RGB.GR.RRBB..BGRRGBB.BGGBBGG.R.GGRGB.B", "...R.GBBGGR.RR.BBBBBRBBBBRBRBR..GBGRRGBR", "G..GRGRGBG.BBR.BGR.GRRBBBBRGR..BGG.B.GBB", "G.B..B.BR.RBG.BBBGRG.BGBRGBGG.RGBRG.GGRG", "RB.GBBB.RBBGRRGR.BRBGBBGGGBGRRB.BB.RRRBG", "GGBRGBR..BRGGB..RG.BG..B..GRRGRGBGGBG.R.", "B.RRG.BR.RGRGRRBBGBBBGGBR.RGGB.GR.RR.RBB" };
        int T = 36;
        assertArrayEquals(new long[] { 1162L, 1240L, 948L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case124() {
        String[] clipboard = { "RB.R..GRR.BBRBB..GGGGBGG.B", "BB.BG.B.GBRR..G..RBB..RRRR", ".BGBRBRRR.R..R.RRRGBGGRB..", "BRR..G.G..BBGBRR.BBRBG.BB.", "BG.BG.GB.BRRRRGR..BB.R..RG" };
        int T = 37;
        assertArrayEquals(new long[] { 437L, 278L, 471L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case125() {
        String[] clipboard = { ".G.RGGRGRGRBRBB.BBBRG.BGR..", ".GRBRRGBRBRR.RGGGBBBG.BBGGB", "RGB..B.RG..GGGR.RBGG..R.RRG", "GR..BG.G.BRBGBG.BR.B.GGGGGB", "BB..BGRBB.R.BG.GR..R..GGRBG", "RRG.R.GBRRBBGR.GG...BGG.GG.", "GBG...RBBR.G.G.BBRGRB.GRG.G", "BRBBRG.RR.BRB.BGGBBGRRRRBBR", "RB.BGR..RGBGR.GBGB.GGRR.RBG", ".GBRB.GBRRGGRB.R.G.RGBBBRG.", "B..BRRRRBGGRBGRBRR.BGRRR.RB", ".RBRRRRR.GGGR.RGB..RBRRB..R", "G..G...RRG.GGBBBRGGG.GBG.B.", "..BRG.GR.BGBG.GBBBGB..GRGBR", "BBBB.BRGR..GBG.GBBG.GB.GGR.", ".GB.RBBBGGGGBB.G.BBGR.B.RBG", ".R.B.B.BRRRB.RRRB.BBB.BBRR.", "BBBR.GG.BBGRRG.BBGRGG..G.GG", "BB..RRBB.GG.G.GB.GRGGB..BBB", "GG.GGGBRGG.RG..RG.B.RGGGGRB", "G.BB..BBBBR..RBR.RBRBGBGG.B", "RBB.GGRBBGB.G.BBBGR.RR..RGG", "BGB.BB..BBRBGGGBRG..G..GGBR", "B.BB.BB.RRBGBR.BBG.GBBRB.RB", "RBGB..BGGB.BGGBB.BGR.GBB..B", ".B.RBRR.GG.R.RGB.GRB.BGGRRB", "GBBRBGBRRRRRGBRB.BBR.RR.BR.", "BBRRBG.BB.RBBG.RB.R..RG.B..", "R.RRRRGB.BBRGBBR.GRGGRG.RBG", "..G..B.RR.GRR...BBR.B..GBR.", "GBR.G.RBRBGRB.RGGRGGBBBRBRR", "BRR.GRRB..BBGG.GBB.B.GRBGB.", ".G.RGGGGR.G.GGBG.BBRRG.R.G.", ".GRRRBBB.GG..GGR.BRGGB.G.GG", "GBB.RRR.BGBG.BRGGGGRRGGBBBG", "GGRBG.RBRBGGBR.RBRGBRBRGGGB", "..RR.B.R..GGBGBGB.BGBG.BBBR", "G.GBGRRG.RGBB.BBGRRRRRBRGRR", "R.B.RGGB.GGBRGGGGGBBGRRGGG.", "GRRRRBR.BRGBBGB.RRRGGR.BRBG", ".RGR.GGGBGRGBRGBRGB.GBGG.RB", ".B..GGRG.GBGRGGRRR.RR.GBBBG", ".G.G..RBGRRBBR.BRBGG.G.GRRB", "BBB...BG..GBBGR.BBGG.RGB.GG", "GRG.RRR..BBGG.BRR..RGRBG.GR", "B.RBBGB.RGBGGG.BGRRBR.G..RR", "RG.BGGGB.B.RGBRGG.GRRBG.GGR", ".GR.GGGB.R.R.R.RBGG.BRGRGRG", "R..RBBBBR.GBBGGGRGBRBRB.RGR" };
        int T = 38;
        assertArrayEquals(new long[] { 1037L, 1347L, 1598L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case126() {
        String[] clipboard = { "...", "BRG", "BRG", "BR.", ".BG", "..B", "BBB", "BRG", ".B.", "R.R", "B.G", "BGR", "GGG", ".RR", "BG.", "G.G" };
        int T = 39;
        assertArrayEquals(new long[] { 86L, 202L, 393L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case127() {
        String[] clipboard = { "R.R.GGRGRGRGBRGGB.BGGBGB.", "BRGGGGG..B.GGRBRRBG..BBBG", "R.GBBBG.GRBBGGRB.GB.R.BBG", ".GRG..RRGGGBRBR.RRGBBBRRG", "GB..GBRRRGGBRRB.BGRBGB.GG", "R.R.RG.RGGG.GG...B.GGBR.B", "BG.G....RG.GGRGR.RR.BG.B.", "GGGBR.RGBR.BRRR.B..GRRR..", "GGGGGGRB.B.BRRGBGBBB.B.BR", "G.BBG.B.GBRBRRGGR.RGGBG.R", "GBGRBGR.BGR.RG...BR..GGRR", "GGR.BBGGBB.R.RB.BGBGGRBGR", "BGG.RBBGBRGRB.RBRGGG.BRGG", "GRG.GBRBRRB.BRGG.BR.RG..R", "BG.BGBRGR.RRGGRRR.GRGRGGB", "RBB..RGGGBG.GRR..GRBGG...", "RB..G.GB.RRRGGGG.RRRGRGRB", ".BB..R.BBG..BGGBRRG.G.B..", "R.GB...G..GGBB..R.BGBBBGR", "G.GB.BB.GG..GRGRBG....BRB", "R...RR.RGGR.GBG..GRRBRGG.", "RRBBRBGGRBG.G.GRG.GG.RB.R", "GG.GBB..GBR...BBB.RGRRGBB", ".RGBRBBGR..BBRGBRGGGR.BBB", "..BBGG.BRRGBB.RGBGR..BGBB", "GBB.RR.BGBG..GBGG.GBG.GGG", "BGRGB.RBBRB.BRGGGRG.GB..R", "RR.RRGG.BGRBG.RB.GRR..BG.", "BBRBGRGBBGRGB..B.GGGBBBG.", "GGBBG.GG.BR.GRBR.R..RRRGB", "RBRBR.GRBRRBGRBG.BB.RBGGR", "BBGG.R.GBBGBG.B.R.GB..GBG", "GGBRGBGBG...BRG.BRBGRGB.G", "BGRGRRR..BGRBG.RGG.RG.GRG", "..RRBGGBGG.RB..GGBGGR.G.B", "BRRBG.RGGGG.GRR.GG.BB.RGG", "RGRRB.R.GG.R.BBGRBB..BRB.", ".GGGR..R..BGBG.BRBGGRR.RR", "BRBBB.B.GGRGG.BGBGGBB.RBG", "G.B.GRRRBGGBBGB.BBGRRGBRR" };
        int T = 40;
        assertArrayEquals(new long[] { 997L, 1422L, 1012L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case128() {
        String[] clipboard = { "RBBGRGBRRRB..G..GRGR.RBRBB.GRBRBRRRRBBG..BG.GGB", "RRG.B.G.BRRBBRR..BGGBGG.RGGGBRRGRGGRG..B..RGBB.", "GR..BB.B.B.B..BBRRGRBBBBGGGB.BB.G.R.GB.B.RR.BBB", "RGBR.R..GR..RR.B..B.RGRGRB.RRBGR.GRGRG.GGB..RR.", ".GR.GGBRRGBRBBG..RGG...G.R.B.BBGRR.RG.B.GRBBBRG", ".RGBGRB.BB.RBB..RGR.GGB.GBRRB.BBGRBBRB.BRR..BRG", "RGGRGB.BBR.G.RRBBBGR..RGRRRB..G...BR.GR.B..B..R", ".RBRGGRRG.GBGGRRBRRR.BBGR.RGGG.GBBGGG.R.GR..BR.", "RRBG..G..BBGG.RRGGG.BBR.GB.BRB.RRB.RG.BGG..GRBG", "RRGGRGRRGBB.R.R..RBGRGRRBR.RB.B.BBB.G..GGB.GRBB", "B..GRR.B.GRR.BGRBBB.GRRG...R.BGBB.BRBGRBBRB.GG.", ".BRRBGG.B.RGRB.RGBG.R.GRG.G.BBRBRBBRR.BR.G.RG.G", "..R.GB.R.RGBRRBBG.BRRRBRGRR.BGGRBG.B.R.G.RBRRGB", "RR.GR.G.BRB.B.B..R..R.RG.GGR..GGG..RGG..RGGGGBG", "..B.B.GRGGRBRRRG..GR.RB.R.BG.BBB.R.RGRRR.BGGGR.", ".BRB.GBR.RRGRG..RGRRR.B.R.GGGGBRRB.G.BGG...GRGG", "BRGGR.RRBRB..RGBGGGBG....G.G.BB.RBR.R.B.RRRBRR.", "BRGG.RGB.R..RGRRBRB.GRGRBR.RGBRRBGRGBG..BRG.G..", "B.RBB.G.RGRB.G.RRRRBRGB..R..GBGGRG.G.BGGBGBRG.B", "BRBGGGBR..RRB.GGGBGGB...BGB...B..BGGB.RGBR.G.GR", "G.GRRRRBGBBGB.BBBBRRBG.RBGG.GRBBGR.GBG..BRB.BRG", "G...B..GGRBG..R.GR.BRR..GRGB.RRGR.G.B.BGBRBBRGR", "BG.BB..RGRRGG..GRGGGGB.BB.G.BBG.RRGR.GGGRRR.RB.", "BG..B.RBRRRR.RBRRRBBBRB.R.B.RG.G..BBBRBBBRGR.BG", "BGGBGGGR.G.B.RRRGRGR.B.RB..GGRB.BRBG...GBRR.RRR" };
        int T = 41;
        assertArrayEquals(new long[] { 1612L, 1028L, 1327L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case129() {
        String[] clipboard = { "RR.B.", ".BGBG", "BBRBR", "..GBR", "BGGGB", "RGBRG", "GRBBR", "RR.GG", "..BBB", "GRGR.", "BBB..", "G..R.", "R.GB.", "RB.RB", "B.RBB", ".RB.G", "GBBRG", "BGRB.", "R.BGG", ".RR..", "RG..G", "R.GGB", ".GRRB", "BB.BG", "BG.R.", ".BGGB", "RBGRB", "GG...", "BG..R", "R.BBR", "BR.RB", "GBGR.", "R...R", "GGG.B", "RGGBB", "BR..B", ".RGGB", "RBGBR", "RRBBG" };
        int T = 42;
        assertArrayEquals(new long[] { 710L, 423L, 764L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case130() {
        String[] clipboard = { ".B.BRRRGGGRRG...GRRBR.RRRB.G.R.RGR", "B.B.RGRRBG.GR.BBB.BB.RG.RGGGRRG..B", "BG..G.BRRBGG..BRRBRG.GBRGG...G.G.." };
        int T = 43;
        assertArrayEquals(new long[] { 659L, 448L, 398L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case131() {
        String[] clipboard = { "GBBRBBB.GG", "..RR...RGG", ".G.B.R.BB.", "GBGR.RR.G.", ".GBB.BBG.G", "B...RG.BRG", "R.BR.GGBB.", ".GBGBGRRB.", "...R.BRBRR", "BG.G.B.GRG", "BRG..GGGBG", "RGRBR.RG..", "BBGBR..R.G", "RR.RG.BRRB", "G.B.BRGGG.", "GG..R..GRB", ".BGBG..B.B", "B..GRGGRBG", "GBBGG.....", ".GGBGBGRRR", "RBBGGBB.R.", "BGBRBRR.GB", ".BRGR..BRR", "GGGBR.GG.B", "G.GBRGGBG.", "BR.BBR...B", "GGG.BBBBR.", "BG.RR..BR.", ".R..BBGRGB", "RGR..GB.GR", "G..GGB.R.G", ".B.RRGBBR.", ".RBBRBG.GG", "RG..BRRGG.", "RBGB.R.R.R", "G.BRRG.BG.", ".BR.BR.GRG", "GBRGG.RGR.", "BG.BBRG.BB", "GRR.BR.BRB", "..BRBGGBRR", "G.B.GR.RRB", "GBRB.GBB.G", ".BBGRRG..G", "BGRBB...BB", "RGGRB.BGGG", "GBBG..BB.B", "GBR..GRRRR", "B.BBBBBG.G" };
        int T = 44;
        assertArrayEquals(new long[] { 648L, 1233L, 1060L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case132() {
        String[] clipboard = { "G..GR.GBBGRBB.GG.GG.GRBBGGBR.G.G.B.BGRRBB", "GGG.R..BB.GGGG.GRBGR.RGRRR.RRBGBG.GR.BRBR", "BGBRGBRGRGRRRRGGGRGRRRBB.RGGGGBGRGBRBBG.B", "RGRR.GR.R........R.BRR.R..BGRGGRB.BRBGBB.", ".BGGRGBRGB.RRGG.GB..GB.R.RG.RBGG.GB.B.R.B", "G.G.BBRRBRGGGB.G.B.R.GGBRRRRGRGBRBBRRBB.R", "RGGBBGRRRR.R.RBRRGGRBB.R.BR..BGB.BBG.RB.B", "B.GBBBB..R.BGGGGGGB.G.RG.RGRB.RRGGG..GBR.", "..GB.GBGR.RRRRRB.RGBB.R.B.BRB.G.BGB.GRR.G", "G.GB.BGRG.RGBRGBGRRBRG.GBB..BGRBGBBRGRBR.", ".RRB.RRGGGR.BRGB.RBBB...BB..GR.RBRR.R..BB", "..BRRBRG..RRR.BBRGBGGGRRR..RG.GB.G.BBB.R.", "R.RR..RGRRBR.BBBRBRRGGRBBBG..GGB.GGBRB.BG", ".RGRBR.RG...G.R.RB.GRBRBBR.RBRBRBR..R.GBG", "B...GRGRGBRR.BGBR.GGGGBR.RRRGBBRR..RGBBBR", "G.RBGB.GBR.RRRBBBGRG.GRR..RGRB..BB.GRBBRR", "G.RBBBRBGGRBGG.R..GBGR..R.B.RBRBGBBGG.G..", "R.R.B..GGR.RG.BBRGBG.RRGB.BGGGRG.BBG.RBGB", "RRBRB.RR.BB..G.G.B.B.GBBR.R..BGBG.GRBG.GG", ".GGGRGBBGGG.BRRGRBGRGBBGBRRB.GB.R..BR.R.R", "BBR.GGR.GB.BGBRRBGRR.BB..RBRRGB.G.GRGGBB.", "RR.GGRGR...BBRR.BG..GRGG.G.BRB.BG.GBGBRRG", "...GRGBBRRGBBR.GG.GRRR.GRGRR.RBG.BGB..RBR", "...RG.BGGBR.BGBBBRRRB.GR.BGG.BG..B.BR.RBR" };
        int T = 45;
        assertArrayEquals(new long[] { 1075L, 1409L, 1176L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case133() {
        String[] clipboard = { ".B.BRGGGR.RGRRRG.RBRBGR.GGG.B.R.BRBGBGG.", "G.RB.R.RGG.BB.RB.G..RGBRGBBRBGRRGBGGB.GB", "GBGBR..R..BGRRRRGG...R..GRRRBGBBGRBG.G.G", "G..GRRRRBGBRG.B.GG..RB.BGGR.G..BRBRGRRGG", ".BGBRGRGB..RRGR.BBGRBBGBRGB..RBRBBBBR.BR", "BRBGR.RGBRGBG.BBBRB.R.GBGRRG.GGBG.BRBR..", "..BGBRGGGBBR..RB..R..RR.RR.BBRRRG.BRRBGR", "GB.BBGRRBGBGG..GG...BGR..BBRBB.RGRRBRRGB", "R.....GRGBR.GBRR.GGGGR.BRRRGB.BGGBBB.GGB", ".BBG.B.RRB.GGBRRRRRGBR...B.BGBGB.BBG.RB." };
        int T = 46;
        assertArrayEquals(new long[] { 762L, 1064L, 659L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case134() {
        String[] clipboard = { "BGRR.RRG.BR.GB.B.RR.BRG.GRRBR.GRR..B.RB", "G.BR.RGBGR..RBGGGRRBB..BRBBG.BBBG.GRGBG", "RRRG.RGRRRGRR...GRR..BRGGGB.RRR.GGRBBRR", "RG.B..GBBB.GG.RBBB.BBBBR.RB.B.RBRRRBBBG", "GB..RGGR.RG.GRRBBR.BRG.GB.G.GBB..BB.GR.", "GRBGBB.GBBG.BRR.RR.GGRRGGGBB.G.RGGRR..B", "BGGBB.RR.G.BGGGR.RRB.GR.GR....B..RRR.GB", "R.RR...BRGBG.GGRBRGBR.RRR.R.GR..GBB..GG", "RBB.RB.GB..BBBGRG.GGR.GGR.GBR..G.BGBGGR", "RRBGR.RGRG.BRBBB.RBB.RGBGG.GBR.GGB.RGRG", "R....RBRR.R.B..GGG.RRBGBGGG..RR.BBRGGGG", ".R.BBR..RB..R.RB.RGBGBGBGGG.GRRGG.RG.RB", ".BGG...BBGRG.GG.G....RRGR.G.B.GB.R.RB.G", "RRBR.GR.RGBG.RG.RRBRBBR.GBGRBG.R.GBG.B." };
        int T = 47;
        assertArrayEquals(new long[] { 1461L, 693L, 757L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case135() {
        String[] clipboard = { "B.BGGR.R.B.GBGBBBGGGRRRGGRB.G.BG.GG", "G.BBR.....R.BB..BB..G.GBGRGGGRGG...", "GBRB..BBR.BB.RGBRRGBRGGGBG.G.RG.GRR", ".BRRRR.BRGRBBG.GBR..BBRRR.GGGBBRR.B", "BRGR.G.BGBBGGR.BRBRRGRBRRBGRGGBB.RR", "GRBG.RBRB.B.B.BG.RG.R.BB.BRBGB..G.G", "GGG.RG.G.BRR.GR.GBRB.GR.GRBBGR.R.GG", "BBG.BBG.BBGRGGBB..GB...GRBB.GG.RRBR", "RGGRR.RGB..R.G.BR.GG.BG.BR.RBBB..RG", "GRGRGBBR....G.B....GRR..G.BGB.B.BG.", "BBR.B.B...RRRG.RBB.B..BB...GRR.BBRG", "GG.B.GBR..BGGGBRG..BB.RRGRRBRR.GBBG", "B..BBRB.BRBGBGGBBB..RG.G.GRR.BRB.RG" };
        int T = 48;
        assertArrayEquals(new long[] { 607L, 1165L, 864L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case136() {
        String[] clipboard = { "RB.BRG.GGBBB.RRR.B.G.B.RBR.B.B.RR.RG.RRGRRRB", ".BBGBBBGGGGRBGGGRR.GBGG.GGG...BBR.G.BRGGGGGG", "BBRBBBRRBGGBBGRBR.G...B..B.BR.R.B.B..BB...GR", ".GGGB.RBRR.RBGGGRB.B.G..B.GGB.B.BR.B...BBRGB", "GBBBGR..GRG.BBBRRBGGGGRGBBBBGRGG.B..G.BBGGBR", ".GBRGRBRBR.GRRB.RGRBBRG...B...BBGBB.R..BBGGR", ".BGBG.GGR.GBRGGB.GBRBB.RG.BBRGR.GBB.BBBRR.RR", "BBBBRR.GGBR.BG.BRBBR.GR.RGGGB.RGBGG.GBRBB.RG", "G.GRBBRBBB..RBBGGRB.B.RGBRBRBB.GRG.BBRRGBBGR", "BR.BB.G.RB.GBGGB..RRB.BGRB.R.R.GG.BRRR.GRG.R", "GB..B.BGGBGGB.BB.GR.BGBGBG..G.RGR.GGGBB..BR.", "BGGGR..RG.RRR..RB.RBRBBBG..BRBBGB.RRBBR..RBG", "GBGRGRBGRRRB.BB.RRBG.B.GRBRB.BBR..G.BBRBGRBB", ".R.BG.R..B.GBBGGRRGRRBRGRB.BG.RBRBBGR.G..GGR", ".RGBBRGRR..GB..B.RGG.BGRG.G..RGGRRRBGBR..RBG", "G.G.R..B..RR.RBBGBBGRBRBR.GRGBRBBG.RB.RGBRR.", "R.BGBGBGGBRG......GG.RRBG.RRG.RR.GR.GRBRRGGB", "RGB...RR.R.BBGRR..RBBB.BBRBBR.RGBR.GB.B.GR.B", ".RR.BBGG..RRG.RGGBGRRG.BRBBBBB.GRBG.GR.RBRG.", "R.RRGGG.BBBBG.GBRRB.B.B.RB..GG.R..B..B.B.B.B", "BBB.GG.RR.GRG..GBBG.BG.GRRGG.BGBBRRRGRGBGG.B", ".G....B.GGGRRGGGGBGBBRGBGR.GGRRGBGG..RBG...R", "RGB.GGGGG.R.RBGG.BRGBGBBRR.GB.GR.BR.RRRB.BGG", "R.R.BGGG..R.GR..RRG...RBBRB.RBRB.BBBBGBBBBGG", "RBBR.RBGGRBBBRBRR..GRBRBRRBB.GRR.BBR.RRB.BGG", ".GRGGRRBRRBBGRBBRGGRB.GR.BRBBBRR.GBG.B.GRG..", "..RGBRRR..RRB..R.BB.RBRG.GRRRRR.BB..RGGRB.GB", "RBB.BG.GR.R.BBBGBRGBR.RBR.GRBBBGR.RRBBBG.BBB", ".GRGGBG..BRB.GR.GRGRBGGB.G..BBR..GGBGGRRBGG." };
        int T = 49;
        assertArrayEquals(new long[] { 1691L, 1239L, 1703L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case137() {
        String[] clipboard = { "GGBBBBGRBG.GB..GR..G.GBBR.G.BBB..G.B.BR...RBB", "GRBGR.R.RBB.GGRBR.GB.BGB..BB.GG.GGGG.G.RGG.G.", ".G.RRB..B..GRR.GBRBBBRB.RRGBRGR.RGR.BGGBBBG..", "GBRGGBRRGBBBBG.G.B.RBBBG.RRGBR.R.RRGRGGGBB.BB", "BBRBRGBG.BBRGR..GRG.GGGGGGRGB.BRGB.GRBBRG.GBG", "R..G.BBG.B.RR.GRGRGBBGBRBGRRBRB.RGG..BBBGGG.G", "R.GG.B.G.GR.GGR.B..RBGG.R..GB.BRR..BRG.BRGBRG", "..RGRRRGRGRR.RR.BGRR.G.GBRGRRB..GBBR.R..BB.RR", "GR.R...BR.RRGRRRB..RBB.RGGBBGGRG.R...BBBR....", "BGRBGBRR.BRRBBRBRBR.GGR.RBRGR..GG.GR.BBBBGB.R", "RGRBB..RRGGBRRGBBGR.G.RR..BBG.BGBBRRRBRB.BGRR", "GRRBGRBGRGGBBBRGBGR..BRGRGGRBGBGRBGB.RRRRGBB.", "GRGGRRBGRRGBGBRGRGRG..BBBGRGBB...RGRGBGGRBRBG", "R.RGRRRB.BGBR.BRGBR.B.RRR..GRRGBRRBR.BGGGBGBR", "RR.GGRB.R.B.G.B.RG.GGGBBG.BBR.GBGB.BGRRBGBB.G", "G.BRBRBR.GBRRGBGGG.G..GRR..BRRR.GGGGRBRB..RBB", "B.GB.RRBBGRBRRG.G.R.RRRBG.RBRGG..GBBRBBBRG..B", ".G.B...RB.BBBB..BBBRRBGB.G...RGB...G..RR.GG.R", "BBBGGBRRR.GBRGR.R.RR..RGGGBRGGG...GRRGGG..GG.", "RG.RGRGG...B.RRBG.G.BRRGGBB..G.BG.RGGRR.BBRRG", "R..B...RGGGR.GR.GGBG.B.GGGR..B.RR..BRBGBRGBGR", "BRB.B.GRBBRRB.B.R.B.BR.G..G.BBBGBGG..RBBGG.B.", ".RBG.R.GG..RRRBRR..R.GGRBBB.B.GGRG.BRRR.BBR.B", "B.RRGGR.BB.G.R.G..G...BB.BGG.GRGBBBRGRG.B.BBR", ".RGBG.RRRG.BRBRRB.BB.R.GB.BGR.BRB..B..GB..GRR", "BRGBBRBG.GRGB.BG..R.GBBBBGBRRRBGBGGGB.R.GGBBR", "GRGR.GBGBR.R..RBRGRBRRG.B.BG.GB.BGG..BBBRGRBG", "G.G.R.B.GR.R.G.R.B.GBRGR.GRBRG.BG.RBBGRRGR.R.", "GRG.RRRGRGGR..GG.RGGBGRBBB.GG.BRGBG.RGGRGBGG.", "..RRRGBGG.RG.GBGBBGBB.BRRBGRBGR.GGRBRBBB.BBRB", "..R..GR.GBB..BGBGGG.BR..BGGG.BRBGRBG..RGRRGG.", "RBGBBG.B..GG..BBG.GRGRGR.GBGRR.BG..R...RRGBGR", ".RGR.BGBG.GRGGBRRBGBBB.RR.G..G.RRBRGRBRB.GBGR", ".G.R..GB.G.GB.R.B.GR..RRGBBRBGBR.RBRRBRR..GBR", "GRBR.G.GBBBB.GRGG.GG..R.RRB.BB.BRRR.RRGBRRGBG", ".BBRBG..BRB.BGGGG.GBG.B.GGB.BRRBRG..G..GR.RBB", "BRBGRBBRGRRGBG.GRGG.BGGR...GRRBRRBBBR..GRRBRB", "GRBGRGR.BB.GBRB.GRRGG.RRGGRRG.R..GRGRR.RRGB.R", "RR.BR.BB.RR..BR.R..RBRG.GBRBGRBR.RBGG.RBRGBRB", "GBRRBBGRBB.GBGR.GGB...GGBGB.GG.GBG..R.R.GRRGB", "GRRBRBB.GB.R.BGG.RGBRB.BBB.BB.GBRRRB.B.RBBBBG", "BG.RGRGRGRG.R.R..R.RRBRBG.BG.RR.BBRRRRG.G.B..", "BBRGGRBBBBGRRR.G.BRB...BRGR....BBR.BBBRG.BGGB" };
        int T = 50;
        assertArrayEquals(new long[] { 1628L, 2272L, 2236L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case138() {
        String[] clipboard = { "R.G.GBGGBGG.BG.BRBBBGBR", "GGGBBG.RRGG.BRGG.R.GGR.", ".GRBBR...RGGBGBRBB.BR.R", "..GBBRGRB.BBG.GB.G.B.GG", "B.RBG.G..RBRGBRGBBRRGBB", "GRRGBBR.R.G.R.BBGBGGB.G", "BRRBBGRBBRRB.GB....B...", "RBRBGR.B..GRBBR.GGRBGGR", "GRB..BGG.BGBGBRG..RR.G.", "RR.GR.G..G...BRG..RRGRR", "RG..GRRGB.RGRRRRRRG.GR.", "BB..G.B.GGR.GBRR.BGB.RB" };
        int T = 51;
        assertArrayEquals(new long[] { 485L, 735L, 734L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case139() {
        String[] clipboard = { "..", "RB", "GR", "R.", "GR", "G.", "BR", "RB", "BB", "G.", "RR", "GR" };
        int T = 52;
        assertArrayEquals(new long[] { 213L, 260L, 158L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case140() {
        String[] clipboard = { "RRRR..G.R", ".BBRR.RBG", "R.G.B..R.", "RG..G..RB", ".RRRRRRBR", ".R..BR.G.", "RGGGRGBBR", "BG.G.GRB.", ".RR.GRRGR", "B.RGBG.GG", "G.RRGBBG.", ".GBRRBGB.", "GR..GRBBG", "GR...BBGB", "RBGRRGGR.", "R..R.RBGR", ".B.GBRRGG", "RRR.BB..G", "BRRRRGBRR", "RGR.GRRG.", "GGBGBR..B", ".GBGR.BBG", ".R.GBBG.G", "GRR.BG..G", "RG.RG.BGR", "..GGR.R..", "RB..RRG..", "B.GBGBB..", "...GBGRRR", "RG.G.B.GB", "BBB...RGB", "BGGR..BRR", "RG.BRBGRG", "RBBBBBBGR", "R.RG.RRBR", "BGG.B.BG.", ".GBBGBRRR", ".BBRGB.G.", "BG.BGGGGR", "BBG..G.GR", "GBBRRRR.G", "RB.GBRGGB", ".GGR.GGGB", "GBBR.BBRR" };
        int T = 53;
        assertArrayEquals(new long[] { 1586L, 747L, 731L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case141() {
        String[] clipboard = { ".....R.BGGRRRBGBGRBBB.G.G.GGRG", "RBRGBRGGGG..R.RGBRGBBBRRBB.RRR", "B.RGBRRB.B.RBGB..BG.R.B.G.G.BR", "..G.B..GBG.BRBB.RBB.G.RBGRRB.G", "RRGBG.R.GGRRR.RR.GBRRBRRBG.GB.", "GB.G.BRRRRRRGGBRG.G.GGGGB.RGB.", "RG.GGB.BB....RGR.BBRB.BR.RBRGB", ".G.R.GBG...GBGBGB.R.G.GBR.BBBB", "R.GRG.G..RBBBGBGR..R.RGRGR..RR", "RRRRBGB...BRBRBR.GBG.R.GBBBRGR", ".BB..R.RGGGRB.BBR...RRB.G.R.RG", "RG...R..RBG.B.RBRGBGG.RR..RB..", ".B.B..B.BG..BRGBBRRRG.RRRGBBRR", "RR..G.BGRRB.RBBBG.R.GRRRGRGBBB", "GBGRBBG.GBG.RR.GBG.RGBGR.BGBBR", "G.GBGB..G.GG.GB.B.RGB.BRGRGRBR", "GGG.GBBRBR.BBG.RG.BBBRGB.BR...", "G.BBG.BRRG.BBBRRRRGG.RGBRB..BR", "R.R.GGGGRBG.R.GGG.GRR.GBBBRG..", ".GRGGBRBRRBR.RR.BGGGBBBBR.B..R", "GR.GRGGGBBBRRRGGGBRRRRG..RGB..", "R.RB.BRBBBG.R.RBRRBB.GBRBGRRRB", "G.RG...GBBRGRGGBGGBGBBGRBBGG.R", "RRBBRB.GRGGGB.B.B.RBGRRRG.RB..", "B.BBGRBB.GBB.BGBGG.BRRRRGGRBBR", "RGRR.BRRGRBR.BGRR.BB..RRBGGG.R", "RR.R..BG.GGRBBRG..BR....G..R.G", "RG.G.B...GG.GB.R.GB.G...GGRGRG", "R.G.B.GB..RRRG.GRGRRBBRGR.GGRG", ".GBGGB.GGBBR.BGBRGBBB.RR.RBGBG", "..B.R..R.GB.GRB.GG.BBBBB..R.RG", "RRGGR..RRGB.GRRBRGGG.BBB.GRRRR", "RG.RRBG.G.G.RGGBRGGG.BG.RR.GGB", "RG.RBRBRBB.B.GBBRBRG...BRB.RR.", "G..BG.BG.GGBBGR..GGGRRG.BR.G.G", "GGGRGR....GGB.B..G.RBG...GG.RG" };
        int T = 54;
        assertArrayEquals(new long[] { 1993L, 1517L, 913L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case142() {
        String[] clipboard = { "GBBBB..R.BG.G.RBG.GGRG", "BRBRRGG..GBBRGB.RGBBGG", ".BG.RGRRBRGGBGGB..BBRG", "GG.G...RBG.GR.R.GRGGBB", ".G.G..BGBRGRRBBG.G.GB.", "RBBBG.R.G.GGBBG..RRRGB", "RBG.B.G..R.G.R.GRR..BG", ".BRRRGRBBGR.GGRBG.RBGR", "BR.RBGRB..G.BBGB..BGRG", "RGBRGBGBGRBBBBGGR..RGB", ".RBBGRR.G....RBRBGBGGG", "RGBG.R......B..RBG.GBB", ".RBRBGGR..B.BRRGRRRRRR", "GB.RGGGBBGRRB.BGRBG..G", "BR.GG.B..G.G.R.BGBGBBG", "..RGRBB.RGRBRGGBGB.B.G", "..GGRG.G.G.BR.R.G.BRB.", "GRG.GR.BRBG..G....RRBR", "GRBGBG...BG.GGRB.GRBGG", ".B.RGRR.BGR.B.RR.GBBBR", "BRGBGBBGGB.R.G.RR.R.RB", "GGB.BGBGR...G.BRGGGBRB", ".BB.GGR.G.GG.BGGBRR.GB", "RB.BG..G.BRG.BRRGBG.RR", "GGGBG.GRRRGBGRG.B.BBBG", "..GBGRBB.GR..RGGRGGBGR", ".GRBBRBGGRG.RB.GB.B.GG", "R.BB.BR.RGBRGRB.GB..RG" };
        int T = 55;
        assertArrayEquals(new long[] { 877L, 1245L, 1056L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case143() {
        String[] clipboard = { "RR.RBB.B.RGBBGBGGR.RG.R.GBG", "RRGRR.R.B.BBBGRB.G.BR.BGGGG", ".B.GGBBGRG.GBG.BRB.BG.BRBBR", "RBBG.RGGG.B.GBRBR..R..BB.RR", "R.GB.RBBGR..GBR..R.RB.RR.BG", "R..GB.G.G.GG.B..GGBRGRRRRRR", "RBBGBRGRBR.RBGGBRBR..BGRBR.", "GB.BRBRR.RRG.BRGRB.RB.RRRGB", "BGGG.RRRG..B.RBR..BGR.GRRGB", ".BRBR.BR.R.BGRBGG..GBGRG.R.", ".B.GB.BBRRRRB...GB.G.B.RR..", "R.BG..R.B.BR.RBBBR...G.BRRR", "BRGRGGGBB.RG.RGRGRB.RRRGG.R", "B.GB.GGGB..RG.BRRBG..G.BR.B", ".GG.R.G.RRRG.RGG..GRRGR...B", "..RBRGBG.GRRB.GBG.BB...GGB.", "BRRBRBBB.G..RB.GGBGRBR..RBG", ".GGRBR.GRRBG.GBG.RR..GG.B.R", "RB...G.G.BRBG.BB.RG.BBBRBBR", "G.GRB.RG.G.RGGRG.RRRGBB.RGR", "BRRR.BBBBGRRRR..G.B...G.GB.", "B.BGR.G..GG.GR.GG.R.GRGRGR.", "GBRB.BBB.RGRB.BBRRBBBGBBR.B", "R..BR.RBRRBGRBBBBBGBRBGGBBB", ".GBBB.GBBGGRBGBBRRR.RBBBR..", "GBG.B.G..BR..RGGBRGGRRGGRGB", "GBGBR.BGRR.G.G.R.G.GG.R.BGR" };
        int T = 56;
        assertArrayEquals(new long[] { 1285L, 1049L, 1274L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case144() {
        String[] clipboard = { "GGGG", "BB.R", "B.RG", ".BBR", ".BR.", "G.G.", "RB..", "..BG", ".GR.", ".GRG" };
        int T = 57;
        assertArrayEquals(new long[] { 64L, 460L, 177L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case145() {
        String[] clipboard = { "GBR.BRG.BRGRBRGGRBGGRR.G.", ".GBBR.GGBG.G.RB.RR.GRRG..", "GBRGBRBRRRGR...RG.B..RR.G", "G..GGR.BRRBGRRRGR.GB.GRRB", "BBBGG.GB.RRBBGGRGBBGRBRGG", "RG.BG.RRBB.RBB.GRRB.BRG..", ".R.G.RGBB.BGBG..RRB.G.RRR", "GRBRBRB.G.BGGG..G.R..RB.B", ".R..R.BBGR..GGRBG.RGRBRRR", "R.GGRBRG.B.GBG..RGBB.R.GG", ".B.BGRBBRBGB.G.RGB.B.RGR.", "B...BRGRR.G.GGBGGBR.RRGGR", "B.RGG.GRRGRGGRR.BGGBBG.G.", "RGRGRBRB.B.BB.GBBRRGB.R..", ".GGGGRGRBB.RBRGGRRR.GGRRB", "G.R.B..GB.G.RRB.GG...G.R.", "BG.GRBB.....BRRG.GR.GRGBR", "RBRGBGG...BBBRBRGGRBRGRR.", "BB..RRGGGGB.G.G.GRRRBG...", "GBR.GGGBB.RRRG.GRB.RRRR..", "R.B..GRR.B.G.BBB.GB.BRGGG", "R.BRR..BGRRGRB...R.BRBRGR", "GBR.B.RB.GRGGBGRGR.RBB.B.", "GRGRGBBGBGR.....GBRBGRBG.", "BGRB..GGRR.BB.GR.BBR.GGBG", "B..BG.RGRRBR.GRRBBBRGRRGR", ".BRBRBRGBR.R.RBRRB.RBRGRG", "R.B...GGRRBB...R..G..G..G", "GG.RBGRG.B.RGBBRGG.BR.BGR", "..GRRGG...GGRBBRG.RBR.BG.", ".RBBRR.BR.RGRGBB.RRRRBRGB", "B....RBRR...B.BRBG.BG.GB.", "GGGGR..GR..BGBR.BR.BGRGG.", "R.RGGGG.GG.B.BBRBBBBRBR.G", ".RR.BR.GGG.GG.BBGGBGRBBGG", "G.GRRGR..B..GG.GGB.GGRRGR", "B.GGBBB.BBR.RG.GG.G.GRG.R", "BBBRG.G.R.GRRRBG.GGR.GG.G", "GB.RBRBBBRBBBRGB.G.RGR..G", "RBGR..B.R..BBR.GR.BBGR.R.", "RR.GR.RBRBBRRBG.RRBBBRBB.", "BB.GGGG.BRGRBB.BRBRRRRGBB", ".RBR.G.G..R.RB.RRR.GBB.GG", "BBG.BRR.GG.G.B..G..GG.G.R", "...GR.BGBR.BGGBB.RGRB..R.", "BBBRBBGBB.RGRB.GB.BGGB.R.", "GGBRR..BBGGRGB.R..RBGGRRG", "RB..RR...GGRBRBB.R.BBR.RB", "RBGRGGR..GGBBRR.GBGBRBGG.", "RGRBGG.GRBGG.GB.R..RGRB.." };
        int T = 58;
        assertArrayEquals(new long[] { 1909L, 1818L, 1628L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case146() {
        String[] clipboard = { "RGRRRGR.RR.R.BR.GBGGRRRBBGBGRBRRG", "RBR.R.GGGB..RGR.BBBGB.BGGG.G.RBRG", ".GGR.GR.B.RRBRB..B.GRRRBGBGGGGRRG", "RRB.BBGRGGRGRG.RRGBRBBRGG.....GG.", "..BRRR.GGRRRGGR.GRRGBRBBBGRRRBRRB", "R.R..RBRRB.BRGRG.GBRGRRBRGRRB.RRR", "B.GR.G.GG..GBRBRBR.BG.BBGBBB.RR..", "GR.R.GBB.G..RBR.BRRRRBRG.B.GBBB..", "GRBGGRGRGGRRGBRBBBGRGRRGGGBRG.GGB", "G.BG.RGBGBBB.G.RBGB.GRBG...RGBRB.", "BRBGBGB.R.BGR.RGGRG.RGB.GRR.RB.R.", "R.G.RB..RGGBGGBRB.GRGRR.G.RGBGB.R", "RBGRR.RBRRB.RRB.G.G.BBG..R.BGBGB.", ".GBGGRGRBBB.GGB..GBRGGBRGGG.BRGRG", "..BR..GRRR..R.BGGGGGR.GGBGBG.RGB.", "R.R.BRGR...RBG.B..RRBGGRR.R..BBBB", "R.RBGBB.BG.RBRGR.RRGRBRBGBB.RGRRR", ".RRR.B.BBRGRBGBGRGB.BGG.R.R.RRBGB", "BRG.GBB..B.RRBR.GRB.BBBGBBBBG.RRB", "RRG.B.R.GB.R.RRGRBGRBGRBBGRBBG.GB", "GBBGBR.B.RR.RRR.RBBB..GRRR..BRRGB", "GRRGRGGBGBG.RGGBGBRR.G.GRGBGGBGR.", "RRRGG.BGRBBGBGRRRBRBR....BGB.B.BG", "GBGRBGBRR.BRRGRG.GG...BB.B.GB.G..", "BG.BGGR.GR.G.GBBRGR.GBGRR...BBBB.", "GRBB.GB.RRRGRG.RGBGGGG.G...GG.R.G", "RRGB.BRG.BGR.RBGRBGR.B.BBGRBRRR..", "GBGBRGRRGRGBR.RRR.RRGRGRGGG.GRGBR", "BBG.GG.G.RRB..R.GGRRGRGRBRBR...BB", "B..G.RB.GRRBRRRBRGRB.BBB.BG.B..GR", "GGR.BBBRRRB.RBBRGRR.B..RR.RBBRBRB", "GBGR.BBR.GR.RB.GGRG.BBG.RGBG.GGGG", "G.B.GRGBRGBRG.RG.R.BBGBBRB.GG..GR", "B.RG.RRRBR.GGB..RRGRGR.GR..B.RB..", "G.G.RRRRGB.BBBR...B.GGGRG.B...RG.", "GB.GGRBRBRBBBG.GBBB.GGRRG..RGRR.R", "GGBRBRGRBGB.BBBRRRB.G.RGB.GB.BRG.", "RGRBBRRGGBBBBRBBGRBRB.G.RRGRGR.RG", "G..RRRG.B.B.GRGB.BBR.GR.B..RRG...", "BGBGR..BRRBG.GGBRG..RG.RGGBBGGGRG", "GG.GBRG.BB..R.BGR.G.R.BR.GGG..BGG" };
        int T = 59;
        assertArrayEquals(new long[] { 2209L, 1995L, 1331L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case147() {
        String[] clipboard = { ".R.R.BBRBBGG.GGR.GBRBRBR..RGBRG", "GG.G.BBBB..RR.GRRGBR.RRGGRGRRBR", "GGGRGB.GGRRR.G.BBBG.BBBG.B.G.RG", ".BRGGBRGRR..GRBGGBBRGRGBR..R.G.", "RRBGGBBB.RR..BGRR..BR.RB.GBRRB.", "RRR..BRG..GGB...BGBRGBRGBGR..G.", "RBRGG.R..RRR.BG..GGRB.RG....BG.", "BGBRBR.RBGGGBRGGBG.R.GRRG.B.R.B", "G..R.RB.B.GBR.BBBRRB.BGGBGR.RRB", "RBGGGGGGBB.GGBGBRBRR.BRGRBRG.R.", "BBR..GB.RRBB.RGG.RBGR...G.BBRRR", ".BGGBR.B..GGBGBRGBBRBGGBGGG.BGB", "..BRGGRB..BB..GGBGGGGBGRR.BGBBG", "RGRBGRGRG.GGBGRB.B.RG.R.BRB.B.G", "RB.BRRG.GBRBGG.B.GRGBBR.GG.BRBG", ".BB.GGRBBRRGRBRGBBRBGG..RBGBGGB", "BRRG..GBRRGBGRRGR.BGGRBBR..GGGB", "..RRGGB.G.B.RGRRG..BG.GRB.GBGGB", "..R...GBBBRRBRG.B.B..R.RBGGGB.G", "RBR.BGGGRR..RBB.BRGB.BBBBBB.R.B", "RRRRBR.BG.BRGBGBB.B.B.G...R.GRB", "RGG.B.G.BRRRBR.GGRGRGBB.RG.RG..", ".BBGBBR...RR..RGGBGRGGR..BR..R.", ".BRGG.GRGRRRG.RBB.BGBR.G..BR.R.", ".RGG.BGRG.RB.GB..GRGRB.GB.BG.RB", ".BRGRBBRRRBRRG.B.RRG..RRR.GG...", "GRBR.RGRRB.BGR.RB..G.GB..BRGGBB", "R.BBG.GGRBB..R.BBRBBGRR.BBBR.B.", "RBRGGRBBRGBR.BGGBRBGRGBRRGRRRGB", "GBGRR.GRG.RB.R.BR.G.R.GGR.RR.BR", "BGRG.BGRBGRB...GBGG..RBBBRRBRGB", "BRRRBGRR.BBR..BGRB..RBBGBRG.GRB", "RGRRR.GGRBBGBBBRBGB.R.RB.RBGBGR", "RR.G..RRRBRRBRRGGBBB.BGGRRRG.GG", "BRGGGGBRB.RBB.RRBRRRRB.BGG.BRRB", "RBR.RG...RBBBBBG.BBG..GG.B..RB.", "BB.BRGG.GB.RBBBRGB.BBBR.RGB..GG", "RGGG.RRG...G.GR.BGGGGBGBBB.BGGB", ".B...RRRBRGGG.RGGRR.B.RGB.RB.GR", "B...RGBB.GRRGRGBBBR.RBBRGB.BG.B", "BRBG..RBRB.B.GB.G.GBGBRBGBRB.GR", "GRBGBGBGRRBRRRBGBGRBGRRB.R.RRBB", "GGBBGB.RR..G.B.RGGGBG.R.RGRRRB.", ".GR.BR..RBGBGRRG.GGRBGR.B..BGGG", ".RRGBRGGR..B.GBGGGBG.RR.GBR.RRR", "GBGRG.B.B.GBRG.BBGGGRBRBBG..GG.", "R.G.RRRG.RGGG.B.GRG.GR.RG...G.G", ".RRBBB.G.GGGBGGGR.GBGG.RBBBBRG.", ".RBRBB..RR..R..GG.BGB...RG.RRRB", "GR..BR..G...GG..GB.RR.RB..RGRRR" };
        int T = 60;
        assertArrayEquals(new long[] { 2553L, 1793L, 1861L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case148() {
        String[] clipboard = { "R.GB.R.RRGRRGRBGRGBBR.BR.", "RBRBGGB.GGRRRBBGGRR.BGRBB", ".GGGGB.RG.GR.RRG.BR.BRRRB", "GR.R.RGBBR.RGG..GRR.BG.RB", ".R.R.GRGR.R.GGRGRRRBGBRBR", ".GG.G.R..GB..G..BRGG.R.RB", "BRRGR.RGRRRGB..BRRRR.BGGR", "R...RRGBG..GGRRGB.RB.BRR.", "GRGBBBRR.GBGBBBBR..B.GRBB", "GRBBRBRGGB.BBBB...BBRG.R.", "RGB.B..G.GGGRGRR.B.GGGR.R" };
        int T = 61;
        assertArrayEquals(new long[] { 1120L, 738L, 436L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case149() {
        String[] clipboard = { "R.RRB.RGBGBBB.RG..RG....", "BRGR.RBR..BBBBRRBBGGGGG.", "R.BGBBRBG..BRGBRGG.GRGGR", "BG.BBBG.RRG..GB.BG..GGBR", "BGGRG.B.RRBBRRRRGRB...BB", "BB.GBRRG....RR..BBGR.BRG", "B.GRG.B.RRGBB.BRBR.R.B.B", "R.R.RGRBBB.RRBGGG.RR...R", "RRGRR.RGR.BRBG.GB.BGGRBR", "GG..RBGBRBGRRGBRBBRRG..R", "RG..GG.RR.R.BRG.GRGR..BG", "GBGGBB.G.RGGB.GGGGBRGG.G", "R.BRBR.B..BRRBB.B.RRRG.B", "GGRGRRBBBRGBBRRRB.RR.BRG", "GRBRGRR.BB.BBRGRG.RBRRRG", "BGGBR.BR.R.G.BRRG.BBRR..", "BRRGBRBRBRGB..GGBRR.R.GR", ".GRGRG.....RBGGBBGRGBGRB", "G.B.GGGGGBR.GBBG..B..GBB" };
        int T = 62;
        assertArrayEquals(new long[] { 892L, 926L, 997L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case150() {
        String[] clipboard = { "BRGGGR.GBBBGBG.R..BB.BB.G", ".RBB....GGGR.GRBBR.BR.GRB", "B.RB.GGGRR.GRGGB..GBG.G..", ".R.GRGRGGBGG..B.RGG.GGGGR", ".GG.RBRG....BRBB.BG.RBGBB", "GR.B.G.G..RRGRGGR.R.R.B..", "BGBG..G.GBGGRRRB..G.GBB.R", "GG..R...RBB.BBBGBRR.BGB.R", "GG.GGGB.RBGG..BBB.B..G..B", "GBG.G.RRBG.BGRGRBGBGBG.B.", ".RRBR.GBGBRRRGG.RGRRGGB.B", ".BBRRBGGGRGG.R.GGR..GBR.G", "GB.GGBRRGGGRRBR.BBG.RGBB.", "GB.B.B.RB...RRG.BG.R..GBB", "B.BRRBBR.R.RB.BG.B.B..R.G", ".RBRGRRBRRGRB.BGBRGGRRBGR", "BGBB..G..GBRBBG.BG.RRBB.B", ".RR.GGRRB.GBRRBG.G.GGBGGG", "GBGR..R.RRRGGRGBRB.G.RB.B", "RRGRRRR.GG..B..RBGBR.GBBR", "BGR..B.GRR.B.BRGBRRRR.G.R", "GRRBGGRBGRRRGRRBRRGBB.RRB", "..G.BRBRGBGRRRRBGRBBGRBGR", "GB...G.BRR.GRBRRRGRBRBGGB", "GR.RB.RGG.BRBRRG.BGB.GGGG", "..GBGBBBBRRBRGBGBB.R.RBBR", "RR.RR.GB.BBBB..RRR.G.B..R", "BGRRR.RBBB.G.GG..GBRRRGR.", "BGBR.BGGB.RGRRBGGR..BR.GR", "GBGRBB.BGR..B.GRRBBRG.BBG", ".RB.RGBRBGBRG.RRG..G.BB.R", ".GRRG.B.RRBRBRR...BGGBG.R", "RBBG.BGBR...RB.RBRB.G.RGG", "BG.GGBGB.RBRRBB.GRBB.BBGG", ".R.G.BGG.BBBGGGB..GRRRRG.", "RGRR.R.G.BRR.R.BGBGRRGB..", "RGBB.B.RGRR.G.GRGRRBRGGBR", "GGR..G.B.GR.GR.RBGGGGGBGG", "G.RBBR.GRB.G.B..RGRR.R.GB", "G.BGBGGR.BR.BGGB.GGG...BB", "BB.RBRBBRGG..RGGGRB.RBB.R" };
        int T = 63;
        assertArrayEquals(new long[] { 1085L, 1935L, 1988L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case151() {
        String[] clipboard = { "BGGBRBRGB.BGR.GGB.GR.RGB", ".BBRRRBGBRRG.G.G.G.BBG..", "BGGRB...RGRBRGGG.R..BBGG", "RGGBRGGRR.GGR.BGG.RGRGGB", ".GGRBBBG.GRBB..RGR...RBR", "BBBRR.BGRBGB.GR.GGBRR.GB", "B.GGG.BG..GRBBGBBRR.RGR.", "RBBBGBBR.BRRBB..BRGRB.BB", "BBBGG.RGG.GR.BGGB.B..G.B", "...RR.GRBBRGB.BGBRBGGRBR", "R.R..G..GRBRRBRRR..G.B.G", ".GGG..R..GBGRG.BGBRB.BR.", "GGGB.RR..RGBBRGR.R.RGGBB" };
        int T = 64;
        assertArrayEquals(new long[] { 732L, 974L, 850L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case152() {
        String[] clipboard = { "BGBRB..GRGGRBRRBBRBR.RG..G..GG..R", "R.BBBRBGBGRG.B..G...B.RBB.BBBGRG.", ".BRBGGGBBBRGB.RGRBGB..GBGBB..BRRG", "R.GGBGGRBRRRRB..GGRGGB...GGBGG.RR", ".GRBGRGBR..R.B.RR.R..GB.GRGGGRR..", "RG.BGGGBB...R..BR.RRBGRGRBGBB.GGG", "RB.B.G.G.GGRGG.GGGR.RRGR..BRBRB..", ".GGRGGBB.GBG.RBG.RG...GRRBBBGBGGG", "BRGGGBGRB.B.GRBBRBGRBG.BBB.GRG.GG", "RGGGBBG.BRBB.BRG..GBRG.BG....R.BB", "GGRRGRG.GBR.R.BGRBRBGRBG.BBB..BGR", ".G.BGBBGRB.RGGRBBGRRBGRB.B.GRRGGR", "B.GB.RR.GGGGGRGRBBB.G..B..BB.GBGB", ".RGGBGRGRG..R.GR.R.RGG.RRRRBRB..B", "RBGBRRBBGGRRRGGRRRB.B.GRGRRR..BGR", "GG.RGRRBBGG.B.B.RGG.G.G.BB..GGGRR", "GRBR.G.BGRBBBB.BGBGRB.BBRRRG.RBRR", "GGRBGBB.RBRGG.BRRRRRBBB.BR..RRBBB", "BGBRGGGGBGB.R.R.G.G.GGRRBG.B.RBRR", "G.GBRBBBBBGRGBRGBRBGGBR.RGGGG.GGG", "GBGBBBBRGG..RGRGBRGBRGRRRRRR.RR.B", ".B.BB.B.R..B..RBRBR..G.GGR.GBRRRG", "RR..B.RR.R..RGGG.BRBGGRBG.BRG.G..", "BG...BBR.B.GG.BR...R.BG.BGBG.GBBB", "BBGRG.GRBG.R..RG.RB.BGRGBGG.GR.GR", "B.RGGBBGBRGRB.BR.G.RRGBRGBRRGGGBR", "B.RRGB.G..B.BBBGB..GGRRRG.R.GB.GB", "RRBBRRGBBGBGG..BG..RRGB.B.RRG.GRG", ".GR.RGB.GBGBBR.GBRB.GGGB.RBG..BRG", "GBGGBBR.GRRG.BRR.BBRGRR.RR.BBGB..", "GGBRBR.GR.BG.....GB.GBRRR.R....GG", ".RB.R....R.RGBBB.RBGRG.BR.BGBG..R", "..B.R..B.GB.BBBRBB.GRBG.R...GG..G" };
        int T = 65;
        assertArrayEquals(new long[] { 1611L, 1709L, 1688L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case153() {
        String[] clipboard = { "B.GRB..G.GRBG..BRBGB.BBR.BR.B..BR.RGBRBRRBR.BRB..B", "BBG.RBGGBRB.BRGBGBB.GBGB.RBB..B.RBRBRBBRR.GGG.RR.R", "R.RGRGRGBBRBBBBBBGGRRB.RBBG.R.BRGGBGGRBRR.B.BRRB..", "B.GGGB.GGBGGR.BGRBG.RG..G.GR...GBBGBB.GGRRRBG...BB", "G.G..B..RRG.BR.BBBBGB.RG.BBG.R.....RR.GRGG..BGBB..", "GRBB.R.RGRG.BGRRG.R.GGRBGB.R..R.B.GRGG..R.BGGRB.GG", "GRG.R.BG.RGR...GR.BBB.R.GGR.RBBGB...BGGRRR.GG..GR.", "GBG.GRG.B.BB.GRRB.BRGR.RRBRB.RRGGGRGBBRBBBB.GB.BRR", "BGBRGR.RRRRBGB.BBG..R.RBBGRBRRG.RRGBB..GG.GB.G.G.G", "RRBBBRB.RRRG.G..RR..RR.BG.BRB.GBBGG.RRBGGGRRGRGGB.", ".B.BG.GGRRRB.RBBG..RRBBG.RRBRGBR.B..G.BB.BBR...GBB", "RRBBRG.RR.RGGBB.B.R.R.RRBGBGGBG.RBGGRBG..GGRBRBGBB", "BB..RGG.G.G.RBRBGG..BB.GGRRG.BBBRB.BG..BB.BGR.RRBB", ".G.GRRRG..RRGGR.G..RGRRRR.BRRRGRBB.GR...GRRBB.BBB.", ".GRBGRGBGGBGGRRGBGB...GRR.RRRGB.B.BGBBBBRGG.RBBGR.", "RB..GRGGRGBBRGGRRGGBGGB..BRG.GBRGRGBGRBRBBRBBR.RRB", ".GR.GR.B.GGGBBR.GBRG.RRGRRR.BB...BRBGGG.BBBB.RGG.G", "GB.BGG..B.GRBG..R.R.BR.BBRBGBRR.GBGGGRBRBGRR.BGR.B", "RRBBGRRRBBRBRGBB.BG...B...GG.RB.BBRGRBG.G.RGBG.RGB", ".BBG...G.RRRB.RR.BBRB.BG.BRGBGRB.B.BGBGRRBBRBBRBB.", "GB.G.RRGBGRRGBRRGR.RB..BRBG..BBBRG.RBGRRBRRR.RGB.B", ".GGBG.RBRBB..B.R..BGG.G.GG.G...GGGGBBGB.RGG..GBGBB", "B.RBRRB.R.B..GRRGGR.RBG...RGGBR.RGR.BBGR....GGGRRB", "GG..RB.R.GBGRBR..BBGB.BRBG.GRGGR..GG.GRGB.BRBGBR.B", "BRBB..GB..R.BGGGG..BB.B.GRBGR..G.BGB..RBGRRRB.RRRR", ".B.GGRGR.BRR.GBRRBRGBGB.RR.RBGB.B.BBRRRGRR.BG.BRRR", "GGGGGRRB.GB.RBR.RBRGGGBBR.G..BGRBG..RBRBR..G.GB..B", "BRBGGBG.BRG.RBRGRGRGGBRBGG..R.BGRBBBGRBBBG..BBGBBR", "BBB.G.GBB..BGB....BB.BBR.RB.RG.BBR..RBR.RRBGBGRG.R", "..RRGGBG.BBGG..GGR....RGRBBBBGRBG.BGBGB..GBBBRRB.R", ".RR.RGRBR.RBB.G.BGRB.GRGRB..G.RGBGRGG.BR.....RRBRR", "GR.BBG..GRBG.G.G.GGRGBBBBGGGGBGGBGR.BRBRBRGRG.GBBG", "BGRBBGRRRRGR.BGRG.RB.BRG.RRBRG..RB..G.BR.GRR.G.R.B", "R.GGBG.RRBRGBG.GBG..RGBGGG..R.GBRB.B.BBB.GB.RR.R..", "RBG.BGRGR...GR.B.RBG.GRG.RRRRGRG..G..BRBGGB..BGBB.", "RB.RB.BR.BBBB..RBGB.GR.BG.GGG..B.GBBRG.G.BGRBGGRBR", ".GG.GBGRRRR....BGBGG.G.BBRBR.R.BBG.RB...B.GB..BG.G", "GGGBGBBGBGBRRRBBBRR.GR.B.BRG.BBBR.GGGR.GRGBRBB.BR.", ".GGGBGB..RRBBGRBBBG.GB.BGBGBRRG.GBRBBGRRBBBGGRRGRG", "...R.BRR..RRRBBRRGGRRG.BR.BBGGG.BG.BBB.RB.GBGGGBGB", "RRBBR..GRRRGBB..BBBBGRBRRBGB.RRRRG..BR..BG.BRGBRRB", "G.GBG.G.BG.BGGG...BG.BRBGR..RRRR.BB.GGB.GRRGBBBG.B", "RBBBG.B.GR.BRGBGRG.RB.R.G..RGRB.GRRRR.GGR.BBRG.GBR", "RG.RBBR.RBRBGBGG.RBGGGRGGGGBGRBG.BRGGB.B..RGR.RBG.", "R.RBBBBGB.GRGRR.GB.B.G.BGG.R.G.BGRRBRB.RB..RBB.RGB", "BRRGG..BBBGBBG..GGR.BBRGGBBRGBBR.RGBRBRRGRBB.B.BR.", "G.RG.BB.RGBB...GBBRGBGGGRRGGG.BG.BBRGGBGG..R.BGRR.", "BGRRBRRRG.RRBGGRG.RRBRGBGRBGGG.GBRGBRBBRGGBGBG.B.G", "RB..RRGBGB.GR..GGRBGBBGG..BGBRRG.RRRGB.G.GGBGGB.RR", "G.RBG..R.BGGGRGRB.BGGGG.R.GBG.RRGGRB.R.GRRR..B.RRG" };
        int T = 994;
        assertArrayEquals(new long[] { 33554L, 28597L, 37596L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case154() {
        String[] clipboard = { "BG...GBR.GB.BGBBBG.GRB.R..R.RGBBGR.RR.GB.BRBGGGR.B", "RR.GR..BB.GBGBGGGGGGRRRRGR.BRR.BGBGGRBB.BRB.GRRGRR", "BB.B..RRRBR.R..R.GR.BR.BGG.G.GR.GRB..BRRGBGRRGB.BR", ".BGG.RG.GRR.BR.RG.GRG.G..RGGBBR..B.RGRBRR.GRGB.BGR", "GBGG..BGGBGRBGGR..G.R....RRG...GRBBG.RGRRGGGBGRRGG", ".GBRRG.GR..BGGB.GGB.G..BBGRB..B.GG.BGBGRRBBRBBG.BB", "BBB..BBGRRGGRG.R.RGRG.BGB.RGB.BB.RRBRGGR...R.GR..G", "RBBGGRBBBBBBRBBGGGGBBR.RGBBRBG..BGGGBG.BBBBBRB.G.B", "RR.GBB.RGGRRRGGBR.B..GGB.GRB.GGGBGGB.BBGBG.BBRRBR.", "GG....BBRGBRBG...R.GG.R.BB..GBGGR.GRBRGB..BRRBG.GG", "BRRBBBB.BBBR..GRGR.RB.B..RRB..RRGGRBBBGR..RGG.BBRG", "BBBGRRGGRGBGGBR.B.RRBGR.GBGBBRB.B.RRB.RRBBBRRRRRG.", "RBRRR.BBG.B.GG.BGRRRGGRGBGG..GRRBGBBB.BBG.GBB.R.GB", "RG.G..GRRBRRGGBRB.GR.R....R.GGBRB.RBGGBBGRBGGBRR.B", "RR.GBRRBRG..BRRGR.GG.RBRGGBGGRGRBBB.RRR.RB..B..BGB", "BB..RR..RGB..B.RGRB.BBR..BR.GGGBR.R.RBG.GBGR.GRRRB", "..RRBGRG.GRBRB.G.RBGRBR...RRGBBR..R.BGBRRB.GRBB.GG", ".BR.B.BG..GB.GRR..R..GBGBGBRGBGGGR...RG.RB.GB.R.BB", "B..GRR.G.GRGRBBB.RBB.GBB.BBRR.R.BBBBRBBGRGB.BBGB.B", "GRR.G...RGG.BRGGGB.BGR.BBRGBRBB.RG.BBGGGRRRBGGBR.R", "BBGR.RB.GB.BB.BBR...B.BGBGBRGBRRB..G.BB.B.RRB.BGRB", "RGRB.GR..GRGRBB.BG.BRGR.GBRBGBR.B..BBRBBBGR..RBR.B", ".G.B.GBRBGBBGBGGGRBR..BGGG.BGGGGG..GGB.R.G.RBB.RG.", "BB.RRR.RR.G..RGGBRGGBR.GRR.B.RRRGB...RRBGRBG.B.GRR", "..GG.GBRRGB..GR.GRR.BR.BR.RBRGGRRRRR.GB.RGRG.BRBBB", "..BR.BRR.BGBRRBRGBG.BGBGBGGGBRBG.BRRBGRRGBBGG.RR.R", "BRBGBG.BG.BBRR.RBGB..B.B..B.GG.B.RGG..R...GBR.R.BG", "GRRBGRBBRRR.BBB..R.G.RGB.RRGBB.GBBRGRBG.BRGGBGRB.B", "G.BRGGBRBRR.RGG.GGBGGRBBR.RG...GGG.BB.GBBG.RRGG.GG", ".G.BGBBBBBGGRB.RB.RBG.RR....BB..GBB.GB.RR.BGR.R..R", "GR.RBG.BB.G.RG...B..RG..BGGRRGG.BBRBG.BRRRRG.BGRGR", "RRRR.BBGGGB..BR..BGBGGRRRR.RBGRBB.RRG.BBR.GGG.R.BB", "B..B.G.RBGRRRGGBGGRGGGBBRRGRGBRG.G.B.RRBRR.BBGRBRR", "RGRGB.RRBGG.RR..BRBBBGG.RRRR.BB.RGGGBRRGRBGR.B..GR", "R.G.BR...BBRRRRGBB.RBBBG.BRBBGGRGRGBGBGGBRGGRBBBG.", "BB.GRRB.BR..GGBRBBB.R.RG.R.BGBRGR.GRRGRRRB..RGBGBG", "RG..GG.GGG.BBGGRRBG.RG.B.GG.GBBB.RBGGGR.RRBGRRGBB.", "R.B.BBBGBR.RG.GRGRBRGR...RGB.RBG.GR.BRGGRRRB..GR..", "GBBGGGGGG.GRBR.RB.R.BRRBRB.BRGGRGBGB.BRBBBGBGBBGBG", "GB.BB.BBGGGBR.RGGGGRGBGBGBGGG.BR.GGBGRGR...B.R.GB.", ".RGR.GBBR.G...RB.GBGBGR.GBRGRR..GBG...R..BRG.RR.G.", "GGB..RRBRBGRBR.BRRBR.GBGGBBGRB.GRG..RGR.GBBR..R..G", "BB.BRRRGRRGBBGBRBRGBBR.B.RG.RRRBGB.RBG...RRG...RB.", "RRRRBBBGBR..R.GRGRGG.BGRB.B.GG.GBBBRBGG.BBB.BRGG.R", ".R.GG.G...GR..R.RR.RGGR..BR..RBGG.GBBBBRGGBG..RRBG", "B.GRBRBGRBGG.GBGBBRRG.BGGR.BR.R..B.R.BBBBRBGR.BBRB", ".RGRRGGRBR.G..RGGR.BRR..GGBB.GGGGRBRRBBG.RRRRRGRRR", "R.RRRB.GBGRGBRRR..BGRBRGRG.GB.RBG..GR.B..B.R.GGGGB", ".BGGGGBGBRGB.GBBG.RGBB.G.GR.R.GRGBGGBRRRG.R..GR.B.", "RRRG..RBGRG..G.GRGBRBR.BBR.R.RBRGGBRBG..GR.GRR..GG" };
        int T = 993;
        assertArrayEquals(new long[] { 37515L, 29590L, 33537L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case155() {
        String[] clipboard = { ".R.RBG.GGGGGG.R.GG....G..GRRBGR..GRGGRGGBBGGRGGG.B", "..RBBG..G.GBBBRRRBR.RRGR......R.GBBG.GB.R.RGRGRBRR", "BGGBB.RRGB...BBB.RGRGR.GG.GGRGGBR.BGR.RBBB.RGG.BRR", ".RBRG.R..RB.G.GRR.BRBGBB.RB.BR.BGBRGRBBRBGBR.GRRGB", ".R.GBBBGRBBBRRBRBGGBBG..GRBBR.RR.BRGGGB.GGR.R.RBG.", "BBRR.RRB.BRRBGG.G..RG.GB.GR..GBBGGRG.GR.RRRRBGRR.G", "BGB.RBGRGGBGGGG.RB.G......BGB..RR.BRBRR.BRBGRR.GBB", "BGRGGGRR.GRBBRRR.R..G.GG.RBRGGGG.GRR.RB..BBGRRB.G.", "B.GGGB.G..RGGGGRBGBGGGGRB.RRGB..BBBG..R.R.R.GG.GGR", "RGRRGRGBBBRRRBR.BRBGGGRRGG.BBRGBRR.GRBBRRBBRBGG..R", "BG..RRG.GG.BRGGRBGRG.BRBGBRG..RRBBGRGGBRRRBBRBR..G", "RBG.BBRGBGBGGBBRGG.G.BRBGBRB.BR..B.GBGRG.BRGBGB.RB", ".GRBGRRG.R.B..BBBBGBBRRGBR..RRRBR.RRB.GBGGBGGRBRRG", "RBGRRRBGGGRR...G.RG..GG.RBBBBG.RB.RGRBG.BRRG.BBBBB", "RGBRGBG.RBG.BGBGRBR.GB.R.RR.RGRRRBGBR..RG....RBRGR", "B.G..GRBGR.GB..GBBG..GGGG.B.RRR.GBGBRRG..BBBRR.RBG", "RBBG.RGGGR.BRBG.RR..GBG.GG.RRGRGGB.BGRBGRRRRR.R.GG", ".GGR.G.GG.RG.RBBBRRGRRRRR.RBRBRRRGRGRB.GBBBRB.BRRB", "R...G.RRGBBRBRBGRBB.BGGGBR.BRB.G.BGBG.BB.BBRGGG.B.", "GGRR.GBGB.G.BR.GRGRRRRR.GGBRGRRBBGGR..GRBGGRBBRBGB", "G.BRR..RGB.GR.G..RRB.GGGRRRRG.B.B.GR..RRGRRG.RRG.R", "GB.RRBRB..RGGRRR.RG...R.BBGRBRGBG.BRGGRB.GBRGRGRRR", "BRGRBBBRGB.GRB.GBR.BR.GRR....BRG.G.GGB.R.GRBB.GGGG", ".RG...BRRBGB..BGGGBGG..GG.R.BGG.R.R.GGRGB.RB..RBBB", ".B.B..G..BBG.BRGGR.GR.GBRBB.RRRBR.B..BBR..RRGRRGRB", "GRRG..BBBBBGGRR.....GGR..BBGRBRRG..GBR.RR..BBRRBB.", "RRR.BBBR.RBBGRGGRGRRBRGBGGB...BGGBGGGGRBBRRBRG.BGB", "..GRGRRBGGGG...BG..BRRBBGRGBRB.GB.GR...BGRBG.BG.GG", "B..GRBRG.GGRG.R.RBGR.RB.BBRB.R.RGBRR.G..RRR.B.B.RB", "GG.GGBG...R.GRBRRBRBRBGBBBBGBBBRRRBGGBGB.RRBG.BRGB", "B.RBBBRGBBGGRB.R.RRRGG.GB.RRGGBRGGRRBRGGRGR.GRG.G.", "RGGGBBBR.GG.GG.G..RGGB.....BBRGRGB.RBRGGBGGRBB..B.", "GGRR.RGBBRBBB.BGR.RR.R.RBBRGRBG.BGB...RRBRBB.B.BRG", "RB.GBRBGRBG.BB.BG.BRR.BGGRBGR.GRBG.R.GGGRR.GR.BGR.", "GBGBGRRB..BGBGBRGGB.BGBRGBRGGRRRGGGGBBBGGBGG.GBBRR", "BRBBBB.G.RBBG...GBGGBGG.GGRBR.B..B.GR.RGRRRG.GBBBB", ".B.RBRB.B.R.GBGG.R..R..GR.G.BR..B.B..RG..RGRB.GBBR", "GG...GB.RGR.GRBGGG.BRRBGBR.GB.B..RGGRGGGBRRG.GRRBR", "B.RG.GGB.RRG.R.GRRBBBB..BR.RB.....R.RRRBGRBBRBRRBG", "...RGRR.R.BBGBBGBBRBGRRRGRBGGGB.BBRGRGG.RBR..BR.G.", "G..BRBRBBRGG.GRG..RBR.RB..BB.BRGR.RBR.BGGRGGBBBRGG", ".BGBB..RGB.RRBGR..BBGG.GBB.BGRBGBG..BGGRR.BB.BGGRG", "G..R.G.BG..BGGGRG.RGBGBRB.RG.GRRR.GGRGR.R.BGRRGGR.", "GBB.GRB.B....BRR.GRRRRB.BRBBBRGB..GBBGRB.RB.GRBBRB", "B.BBR.BGBBGRBGG.GR.B.BBRR.G.GB.BBG.GRGRRR.R.RR.GRB", "BG.G.R..BRG.RBRBRRBGRBRRG.B.BGBBRGRBB...B.R.BG.BGB", "G.BBBGRGGB...G.BBRBG.BBBBRRBBR..BB.RG.BGBBRRBGGBRG", "B.GGRGB.BBGBR.GRR...RGRGBBBRRRB.GR.BG.BGGRG.GBBGRB", "BBRRRBRG.RGRBBGB....GBBBGBGBRBGGG.BBGRR...GRGRGGRR", "RBB..B.RBB.GGGRGRBR.RR....GBGGR.GGGRB...BG...G..BG" };
        int T = 992;
        assertArrayEquals(new long[] { 27586L, 43407L, 29550L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case156() {
        String[] clipboard = { "R.RBGB.RRRBBRRB.GGBGB.R.BRG.GBRBBBGBR.GG.B.BBRRB..", ".BGGG.GBR.BBG.GG.G..RGG.B.BBBB.RG.RB.B.RRRBRGB..BR", "GG.RGB.G.BBRRG.G.BBRGBR.R.BRRRGRBG..GGRB.GRRBGRBRG", "RBRBGG.GGR.BRG.RBRB.G.RGBGBGGG...R.G.RB..BBR.GRRGG", ".BBBGRR..RGRBBBG.BRRRGBRRG.R.BGGR.B.B.RRBBBRRRBGB.", "BB..RB.GRR..G.B.BB.BBG.GRBGB..B.GBB.BRRG.G..BR.R.B", "GB.R.GBRR.RRRGGGGR.GGGGGGBRRR..BGBRBG..RGGRG..BGR.", "B.GG..RGBGRG.RRGBBB.G.GG.GRGB.RGGBRG.GGRGR...GRRBG", "BRR..GB.BBBRBGBRR...R.BGGR.GB....BGGGBG.GB.BBB.BGR", ".B.G..R..B.GBRBRGGRRRRGR.G.R.G.RRR.GGGBR.BRG.RRGR.", "GGBB..BRGBGRGG..RRGRRRBRR..RRBGBGGGGGGBG..GB.R.B.R", "GBBBR..RGBG..G....BBG....BGG.GBGG.BB.RGGGRGR..RG.R", ".RRRR.GBRGBRRGG.R.BRBBBGG..B.GRGBGRGGGBGG..R.B.GBR", "RGBGBBBB....GBBBGGGGBG.GBR...RG..RGRBB.G...B.RRGBR", "..BRR..RR.GRR.RBBG.B.RGRGBG.R...RBRRGRBB.GBRBRGGRR", "RGR.BGB.BGBG...RG.GG..GR.BGB..B.BR..GBGBGBBRRB.R.G", "BRRRGB.RGBGGGG..GB..GGBRGRRRRG.GRB.RR.G.BBGGR.G.RG", "G.BRB...RRGRG.GBRR..RB.BGG...GRR..GBBBR.GG.G.RBR.R", "GRRBGRGBGGBR.RRBRB.RR.GGGRBRGRG.BBBRGBB..GB.GBBGRB", "B.GGBG.G.R.BRBRGRRRRBRB.GBRR.BRGBBGGRBRB.RRR..R..B", "BBGGGRBG..GR.RR.BG.BRG.GR...RG..RG.BBGRR.GBGBGRBRB", "RGRBRGB..RR.BBG.B..R..RBRRRRRRGR.RRBGGG.G..RGRB.BG", "G.B...BRBBB.B.GB.RB.RBGRGRGBRRRBGGBBBRRR.R.B.B.RGR", "GRG.GBBR.RR.BR.....GBBGG.BB.BBBBRBRGBGGRGRRG.B..BB", ".G.RBGGBGBGBRR.RRRBRBBBRGRGGRBB.GRBRBBBRGG..G.B.RB", "GBGGRR.R.G.RBRB.G.RR.RGBRGBBRRRBRRGRR.RBGBRRGGB..R", ".G.GBGGB.R..BR.RGRRBBBGG.GB..R.G.GB..G..RGRRBBB.BB", "BRBRB.G.RRBBBGGBGBB.R.B...RRB.GBBG.G.BB.GBRGR.GRGB", "R.RR.BGB.GGG..R.G.RBRBRGGB.GB.G..RGBRGRB.....BR.G.", "GGB.GRB...R.RRRBB..BRBB.BGBRRGR.GRBBBRRRGGG.RRGRRR", "GGGRBR.G.RR..BRRG...BGGGGGBG.GG.B.GRG.G.B.GB.GG.RR", "..R.GGRGRG.RGR.GRRRG.G.BG...B...B.R.RRB.G.RGRRGGGG", ".GGBGG..RBB.BRBRR.B.BRR..GB..RR.RR.G.RR.BG..RBBGRG", "GG..RBR.RBBBB.RGR.BB.RRBBRRRRGR.RGRGGB.BRBGGGRRR..", "RBBBRGB.B.RB..BBGBB.R..GRBBGRG.GGG...GRGBGRRRRBBRG", "RBBGRGBB.B.GRRRGR.RBR.GR.GR.RBB...B.GGBGRBGRB.G...", "GBR.R.BR.BGGB..BBR.RBGBR..RGBB.RBBGRBG.G.GB.RB..B.", "BRBGBBBBR.RR.BRGBGBRR.RGBRBGRR.GBGRBRRB.GG.BGGGRRB", "RRGRBB.RR.BRRRRRG.R..RG.G.GRBBBBGB.B.RB.B.GBRRGRRG", "RGG.RRRGRBBRRRBBBRB.R..B.BB.B..GRGGG.RBBB.R.GR.RRG", "RB.RRGGGGG.BBBR.GBGGBGRB..RGRBRBRRR.BGGBGBRBRRBBRG", ".BGR.RGG.B.GG.RRB.GRRGGRGRGBR.RBBBBB.....RGBR.R.G.", "BRBRR.BGGR..R.BG..GGRG.G..BRRG.B...RBRBGBGB.BG.RG.", "GRBB.GB.B.RBBBBRGBRR.RGRG..GBB.BRRRG..BBRBGGGGR.BR", "G.GB.RBRGRGB.R.RR.BG.RBRGG.GR.GRBB.G.RB.RRBGG.GBR.", "RRGRRBRRBB.R.R.RB..RRB.BB.RBR.GG.BBG..GG.BBR.BRGRG", ".BR...RRBG..G.BG.GG.BB...BB.RBBBBR.R.R.B..R.R....G", "BGBGGBRGBRGGRRR.RBRRGR..BG..GG....R.RG...BB.BBG.B.", "BGRRBG....RBBG.RGGBG.GB....R.GB.B.BBRRBR.B.RG..RG.", "GG.BBGB.GB.GGGB.RRGRRR.BBR.RRGR.BGGBGRG.BBBR.BRGGR" };
        int T = 991;
        assertArrayEquals(new long[] { 29574L, 34442L, 35452L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case157() {
        String[] clipboard = { "BBBGR.RG.BBBG..GRRGRGBGR..RBR.GBBR.RGG.G..GRBGGRBR", "GBGBR..RG..R.RRBRGG.B.RBRBR.GRGBRRGGR.RBGBGBBBBGB.", "RG.RRBBGGRBBB.G.R.GGR..BBG.BBGR.GBR..GBBB..GGGRGBG", "BRBR.R.GB.RG.RBR.GB.RGR.BGRG..RR.R.RGBG..RRRRGR.G.", "BG..GGRRGGBBRGBRBRBGRG..B.BRRBRGRGBGR.BGGRB.B.R.G.", ".B.B.BGRB.R...BG..G.R..GBB..R.RBBGRR.GRGRG..R.GRR.", "GB..BB.G.GGBR.GRG.B..RR..BBRB.B..RR.RR.GRGBGR.BB.B", "RGG..R.B..R.BBG.BR.RGGR.GB.RGGRGRBG.R.RRBG.BBR.G..", "GRGBBBBRBBG.R...RGRR.GB.GRGBG..BR.R.GRGRBG.BRRRB.G", ".RGR.GG..GBRGRRBR..R.RBRB.BBGG.BG.R..RG.GR.GBGG..B", ".GBBBGGR.GBRG..BB.BBB..R.GBBRG.BRRRG.GRB.BRGBBR.BB", "GB.RG.BBRGGGBRGR.R.GBBBGRB.GRR..RB.RGRBGGGB.RB..RB", "RBGG.RRBGGRR.BRR.G..G...R.....RRRGGBGBGRGB.B..B...", "...B...RBG....RBRRGBBR.GB.BBRBRBGBGRRRRRRRGRRRB.BG", "G.RBGGGGR.RG.R.GRRG.BBGGBGBGB.G.BBG.BGRB.GGGBRR.GR", "GGRRRB....RGRRBRGRR.B.BBBR.R.RGRGB.RGG.GGB...R...R", ".RRBRRG.BR...RBB.RR.B...GBGBRGRGRGGB.R.....BRB.BG.", "GGB.GB..B.RGGGBR.B.GGBRGBBR.G.R.RBBG.BGBGRG.BGRR.B", "GRGBBBBB.GRG..BGB.BRBBGGR.GG..RBBRBBBG.BG.RG.R.GG.", "B.GBB.RR.GBB.GG.GB.R.BGBR.GGBGR.BR.BRBRGG..B.B.R..", "B.BBRGGG.RR.GGR.GBR.RBBGRGGB.BBBR.RGRB.BRGBGBBRGBB", "RBGBRRRRBRGR.GGBGGRGR.GB.GGRBBBGGGBG.RG.BGBGGBBRBG", "G.GB.G.B.R.BGRGGG.G.RBGR...BGRBBRGR..RB.BR.R.G.GGG", "..BRBGGR..G.RRGRGGGGGRGR.RGBBGRB.RRRBBGGGRRR.BBBRR", "GGRRGGGRG..BB.BBGG.R.GBBGGBBBR.R.BG.RRR...GR.R..R.", ".GRG.BBG...BGRGRBBGBBGBBGBRGRB.RRR..GRB.RBRRBR.R.R", "R.GGG.RGBGRGBR.R.B.RGBB..RRBBRRRGG..BRRRBRGR...B.R", "GBRBGGGGGBG..GGR.RBGRGGG.BB..BRG..RR.GGRGRBRBBBG.B", "RBRGBRR.GGRBGBRG.RG.RRGBGGGR.G.RRRBBG.BGRGB.RRRBGB", "GRGGRR.R.GB.RG.RRGGRBG.B.RGRRBRB.R.GBGGR.RR.G..BB.", "RBBG.R.GG.RBB..BG..BBB..R.BRGBGB.BGRBR.GGRGRRRRB.B", "GG..BGGRR....GB.R.BRGGG.BRRB.BRBRR.BGBRB.RRRRBRB.G", "BBGBBRR.GGRR..GB.GRRR.BG.B.GBRR.GBRR..B..RR.GGR.RR", "BR..G.BRGGGRRR.RRGB.BGGBG..GBGBB.B.BG.RR..RBRRGRGB", "R.RGG..RBRBGRB.BBGBRBBRBGRBG..BGGGR.BRG.G..R.B.GGG", "G..G.BRR.BG.RGR.GBBB..BRG..GGR.RBRRGGB.G.GRGG.GBRR", "RGGRBG..B.RRRG.BGR.G.RB.B.GGB.GRGRBBR.RRBBB..R.GB.", "B..RRBGG.GR..RG..BB.RGGBB.G.GRGRGRG.RRR.RGGRBG.GRG", "G.BRGGRBGGGRR.GG.RRBGGB.B.G.B.RG.G.RG.BBRRBGRBB.BR", "GG.GG.B.BRRBBB..RRRGRBGRRRRG.G.BR..BRRBRGGBRGBB..B", "RGRB.GRRRR.RGB.RGR.GRBBBGRG.B.BB.GRG.GRGGB.BGBGB..", "RGGGGBBRBGB.GRGR.BB.GBBBR.BRBBBRG.BB.RR..RGRGGGGGG", ".G.BGG..BB..G.BGB.BBR.GRG.R.BB..G.BR.G.G.RG.R.G.BB", "BB.GBRG..BGG.RB.B..RR.G.R.B.R...GG.BRG.GGRBRGGR..B", "G.BGRRGB.G.RBR...GRRG.G.RGR.RBB.BRR.RR.GRBGGGGR.RB", "G.BGBGGGGGRRB..BBB.RBRRGGGGBGBRGRGRBG.BB.BGBG...RB", "RGG..G.GRBBBBG.B..BG.RRBR.....BB.GBGBBGBBGB.GBGGBR", "BG.RR.RBR.RR..B.BGB..GG.GGBBGB.GRR.BGRGGRB.GB.GBGG", "GRGRGRGBGB.RBG.RG...BBBRRRRBRBGBBGRRGGBRB.BGGRR.R.", "RR..RGGRB..RGGGBGGG.GGRRGBGB..BRRBRGGB.B.RGRGGR..B" };
        int T = 990;
        assertArrayEquals(new long[] { 30485L, 40410L, 29459L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case158() {
        String[] clipboard = { "R.................................................", "..................................................", "..................................................", "...R..............................................", "..................................................", ".....G............................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".............R....................................", "..................................................", "...............R..................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".......................R..........................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int T = 5;
        assertArrayEquals(new long[] { 20L, 2L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case159() {
        String[] clipboard = { "R.................................................", "..................................................", "..................................................", "...R..............................................", "..................................................", ".....G............................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".............R....................................", "..................................................", "...............R..................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".......................R..........................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................." };
        int T = 10000;
        assertArrayEquals(new long[] { 10021L, 2L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case160() {
        String[] clipboard = { "R.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................B" };
        int T = 49;
        assertArrayEquals(new long[] { 49L, 0L, 49L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case161() {
        String[] clipboard = { "R.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................B" };
        int T = 50;
        assertArrayEquals(new long[] { 50L, 0L, 49L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case162() {
        String[] clipboard = { "B.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".......................B..........................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................B" };
        int T = 25;
        assertArrayEquals(new long[] { 0L, 0L, 73L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case163() {
        String[] clipboard = { "B.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".......................B..........................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................B" };
        int T = 26;
        assertArrayEquals(new long[] { 0L, 0L, 75L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case164() {
        String[] clipboard = { "B.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".......................B..........................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................B" };
        int T = 27;
        assertArrayEquals(new long[] { 0L, 0L, 76L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case165() {
        String[] clipboard = { "B.................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", "..................................................", ".................................................B" };
        int T = 50;
        assertArrayEquals(new long[] { 0L, 0L, 99L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case166() {
        String[] clipboard = { "..........G..........", ".........G.G.........", "........G...G........", ".......G.....G.......", "......G..B.B..G......", ".....G...B.B...G.....", "....G...........G....", "...G...R.....R...G...", "..G.....RRRRRR....G..", ".G..........RR.....G.", "GGGGGGGGGGGGGGGGGGGGG" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 2000000018L, 17000000048L, 2000000005L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case167() {
        String[] clipboard = { "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB", "RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGB" };
        int T = 1000;
        assertArrayEquals(new long[] { 59616L, 15660L, 15660L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case168() {
        String[] clipboard = { "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR...", "R.R.GBBGR......RBGRGRGBRGRBRGRGRR..." };
        int T = 1000000000;
        assertArrayEquals(new long[] { 42000000370L, 9000000205L, 5000000115L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case169() {
        String[] clipboard = { "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "GRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" };
        int T = 1000000000;
        assertArrayEquals(new long[] { 98000002401L, 1000000000L, 0L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case170() {
        String[] clipboard = { "RGB", "GBR", "BRG" };
        int T = 1;
        assertArrayEquals(new long[] { 3L, 3L, 3L }, pastingpaintingdivone.countColors(clipboard, T));
    }

    @Test
    public void case171() {
        String[] clipboard = { "R", "G", "B", ".", "B" };
        int T = 1;
        assertArrayEquals(new long[] { 1L, 1L, 2L }, pastingpaintingdivone.countColors(clipboard, T));
    }

}
