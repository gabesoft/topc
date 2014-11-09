package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CatAndRabbitTest {
    CatAndRabbit catandrabbit = new CatAndRabbit();

    @Test
    public void case1() {
        String tiles = "#..";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case2() {
        String tiles = ".#.";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case3() {
        String tiles = "###";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case4() {
        String tiles = "#..##.#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case5() {
        String tiles = "...";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case6() {
        String tiles = "###...####....###...####....";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case7() {
        String tiles = "#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case8() {
        String tiles = "..................................................";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case9() {
        String tiles = "##################################################";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case10() {
        String tiles = ".................................................#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case11() {
        String tiles = "#.................................................";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case12() {
        String tiles = "#................................................#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case13() {
        String tiles = ".#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case14() {
        String tiles = ".#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case15() {
        String tiles = "..#..#..#..#..#..#..#..#..#..#..#..#..#..#..#..#..";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case16() {
        String tiles = "..#..#..#..#..#..#..#..#..#..#..#..#..#..#..#..";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case17() {
        String tiles = "...#...#...#...#...#...#...#...#...#...#...#...";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case18() {
        String tiles = "...#...#...#...#...#...#...#...#...#...#...";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case19() {
        String tiles = "#...#.##.##.#...##...#..#..#..##...#..##...#..#.#.";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case20() {
        String tiles = "...##...#..##.###.#..##...#.#...#..#..#.#..#...##";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case21() {
        String tiles = "#..#.##...#.#...##...#.#..#..#.###...##.###..#...#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case22() {
        String tiles = "####...#..#.####.#..#...#..###..#.#...#.#.#..#...";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case23() {
        String tiles = "#................##.##########.................##";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case24() {
        String tiles = ".....................###....................###.#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case25() {
        String tiles = ".........###..#####........................#######";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case26() {
        String tiles = "######..###...............##.............##";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case27() {
        String tiles = "###.................##..####...................##";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case28() {
        String tiles = "########..........#...######.........############";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case29() {
        String tiles = "...#.............................#...........#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case30() {
        String tiles = "#................####.....###...................#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case31() {
        String tiles = "##.......#..................#.....................";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case32() {
        String tiles = "#................#..........####.............####";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case33() {
        String tiles = "######################..#.......###....#.######";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case34() {
        String tiles = "######.##....###.........#.....................##";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case35() {
        String tiles = "##...................##.............##.###.....###";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case36() {
        String tiles = ".....#.................###.....................#.";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case37() {
        String tiles = "..................#.#......#.....................#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case38() {
        String tiles = "...#..#########....###..........................##";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case39() {
        String tiles = "###..............###.................##..###...#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case40() {
        String tiles = ".....##.............######..........#######..##";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case41() {
        String tiles = ".....#................#..##.......................";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case42() {
        String tiles = "##..#............#........########......########";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case43() {
        String tiles = ".....................##..#......#.................";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case44() {
        String tiles = "#..........#####.......###..####................#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case45() {
        String tiles = ".....................#..#...........#..........";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case46() {
        String tiles = "#..#..........#...............#...................";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case47() {
        String tiles = "############...........##............#....###...";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case48() {
        String tiles = "#...............######...#...........####.......#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case49() {
        String tiles = "#................#......#....#..................#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case50() {
        String tiles = "####.......#.............#....####..............";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case51() {
        String tiles = "...................#................##.......#....";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case52() {
        String tiles = "....##..........#...................#.........##";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case53() {
        String tiles = "#############.........##......##..........###.....";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case54() {
        String tiles = "#.............#......#..............#.....";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case55() {
        String tiles = "#...................#................#.....#......";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case56() {
        String tiles = ".##.########..###########.########...#########";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case57() {
        String tiles = "#######.###....#####.......###..##";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case58() {
        String tiles = "##.#####................................######";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case59() {
        String tiles = "##.#..#.......##..........................###..#.#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case60() {
        String tiles = "########################..####................";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case61() {
        String tiles = "#########";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case62() {
        String tiles = "#############.....#.................#..........#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case63() {
        String tiles = "##.######.##########......................###";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case64() {
        String tiles = "................#######.###.....#######";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case65() {
        String tiles = ".#..........########.############..........####";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case66() {
        String tiles = "###########.###.###########................##....#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case67() {
        String tiles = "#############..####.######..#######...#####";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case68() {
        String tiles = "#..###........##...#..............##.....##..####";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case69() {
        String tiles = "#########.####################.##########";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case70() {
        String tiles = "###########........##.................############";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case71() {
        String tiles = "##.########.##################..#########.#...###";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case72() {
        String tiles = "##....############################....#####";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case73() {
        String tiles = "##...#...........................#.....#.........#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case74() {
        String tiles = ".########..............##########.#.#...###......";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case75() {
        String tiles = "#...#########...........................######.";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case76() {
        String tiles = "#.########...############.....#..........#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case77() {
        String tiles = "#############..##.......####################.....#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case78() {
        String tiles = "..#................#.....#.....................#..";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case79() {
        String tiles = "....................#.######..#....######....##";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case80() {
        String tiles = ".............####.....######.#.####.##.......##";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case81() {
        String tiles = "##..##############..#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case82() {
        String tiles = "##....####......########.............##########";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case83() {
        String tiles = "#####..########.........#################";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case84() {
        String tiles = "###...................##.......###.########";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case85() {
        String tiles = "####...###################....###";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case86() {
        String tiles = ".";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case87() {
        String tiles = ".........................#........................";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case88() {
        String tiles = "###...#.##.....#...";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case89() {
        String tiles = "#....#..";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case90() {
        String tiles = ".#...";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case91() {
        String tiles = "..#...";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case92() {
        String tiles = "..#..#..#..";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case93() {
        String tiles = "####...............##############";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case94() {
        String tiles = "#.#..#....#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case95() {
        String tiles = "#.#..#...#";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case96() {
        String tiles = "#...";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case97() {
        String tiles = "###...####....###.......";
        assertEquals("Rabbit", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case98() {
        String tiles = "#.";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case99() {
        String tiles = "#...#.#";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case100() {
        String tiles = "...#.";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case101() {
        String tiles = "..#....";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case102() {
        String tiles = ".#.#.";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

    @Test
    public void case103() {
        String tiles = "..#...#..#..";
        assertEquals("Cat", catandrabbit.getWinner(tiles));
    }

}
