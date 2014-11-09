package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class DoorsGameTest {
    DoorsGame doorsgame = new DoorsGame();

    @Test
    public void case1() {
        String doors = "ABCD";
        int trophy = 2;
        assertEquals(3, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case2() {
        String doors = "ABCC";
        int trophy = 2;
        assertEquals(-2, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case3() {
        String doors = "ABABAB";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case4() {
        String doors = "ABAPDCAA";
        int trophy = 5;
        assertEquals(-4, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case5() {
        String doors = "MOCFDCE";
        int trophy = 3;
        assertEquals(5, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case6() {
        String doors = "ABCCDE";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case7() {
        String doors = "ACC";
        int trophy = 2;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case8() {
        String doors = "ABCDEFGHIJKLMNOP";
        int trophy = 7;
        assertEquals(13, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case9() {
        String doors = "ABCDEFGHIJKLMNOP";
        int trophy = 8;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case10() {
        String doors = "ABCDEFGHIJKLMNOP";
        int trophy = 9;
        assertEquals(-14, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case11() {
        String doors = "ABCDEFGHIJKLMNOP";
        int trophy = 10;
        assertEquals(-12, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case12() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP";
        int trophy = 16;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case13() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP";
        int trophy = 8;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case14() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP";
        int trophy = 9;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case15() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP";
        int trophy = 25;
        assertEquals(-14, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case16() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP";
        int trophy = 24;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case17() {
        String doors = "PNKCMCHKPBAGAOHACNGAFEPOKGABHMBKHNHJBAHKLPDOJLNPFC";
        int trophy = 40;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case18() {
        String doors = "ABCDEF";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case19() {
        String doors = "PDBGECCBAGBE";
        int trophy = 10;
        assertEquals(-4, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case20() {
        String doors = "JKANOBFNGPHOCLBCJCAKEPEIPKAICPKECKKKDPEADMCPDAMIAP";
        int trophy = 20;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case21() {
        String doors = "JOJJJOOJJOOJOJJJOJJJOOJJONNJJJJJNJJJJNJNNNJJJNNNJJ";
        int trophy = 25;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case22() {
        String doors = "NIAEGMBJOKPCLHDFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
        int trophy = 15;
        assertEquals(-2, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case23() {
        String doors = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIJELFBHNOMCPDGAK";
        int trophy = 35;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case24() {
        String doors = "JPJPHGFJMIEELJKBOPNGABCEDBCHJAEPDKGIBCMIEFDIPFGNLO";
        int trophy = 25;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case25() {
        String doors = "JMPLADFNIKODPMECJGIB";
        int trophy = 10;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case26() {
        String doors = "PHHNBBNHGPNFIOHHFOJBEHOJOLKMDHDLEPDMLIAAPAAHHDHAJK";
        int trophy = 25;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case27() {
        String doors = "KDHHFIMECBHDBINLLKPLALALDKKAOJPPPLAOKLLPIOKEGIPIAP";
        int trophy = 15;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case28() {
        String doors = "FJLNGJMGCENHEAFBFLHAMBMKDKBBKEJMOJBBKOMMJOMJBBMIKD";
        int trophy = 20;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case29() {
        String doors = "HNJDJEMJCMEHFPIMKKOLGNBINBABIGAIGGDNGNAGDLNNAIBANB";
        int trophy = 20;
        assertEquals(-14, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case30() {
        String doors = "DHODKMNBNDKOHIKKNHHKMPJLFGACBAPEIKKIA";
        int trophy = 20;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case31() {
        String doors = "ABDFBBLBACJJFDDDLCDJFMJMPNHCEOGKNAEI";
        int trophy = 20;
        assertEquals(13, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case32() {
        String doors = "HHPDLALMJNOEACMKGDMGNMHPFCEBILCJDB";
        int trophy = 17;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case33() {
        String doors = "JNJMEEMBBKNCPCNKKMNMEBPKNGIDDHHAGOAAIHGFHLGFFODDLL";
        int trophy = 25;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case34() {
        String doors = "GIMOCNAPDLKLDFJDHFHLFKJKFJDKKBLLKJDDJDDLFBDEFLKEKB";
        int trophy = 8;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case35() {
        String doors = "OJHBPEKMNFCLDLCDGCLAIAADDDACICCGFFGKAICKLKIFKKDDII";
        int trophy = 9;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case36() {
        String doors = "NCJIFEHPGDBKHODHKADHBOMHMABLDBOALDDHLDDMHBOLMKAHLO";
        int trophy = 8;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case37() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case38() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 2;
        assertEquals(3, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case39() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 3;
        assertEquals(5, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case40() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 4;
        assertEquals(7, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case41() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 5;
        assertEquals(9, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case42() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 6;
        assertEquals(11, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case43() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 7;
        assertEquals(13, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case44() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 8;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case45() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 9;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case46() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 10;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case47() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 11;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case48() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 12;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case49() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 13;
        assertEquals(-14, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case50() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 14;
        assertEquals(-12, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case51() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 15;
        assertEquals(-10, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case52() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 16;
        assertEquals(-8, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case53() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 17;
        assertEquals(-6, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case54() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 18;
        assertEquals(-4, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case55() {
        String doors = "LBKPFOANFCACMDHGIEJK";
        int trophy = 19;
        assertEquals(-2, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case56() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case57() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 2;
        assertEquals(3, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case58() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 3;
        assertEquals(5, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case59() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 4;
        assertEquals(5, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case60() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 5;
        assertEquals(7, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case61() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 6;
        assertEquals(7, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case62() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 7;
        assertEquals(9, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case63() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 8;
        assertEquals(9, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case64() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 9;
        assertEquals(11, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case65() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 10;
        assertEquals(13, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case66() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 11;
        assertEquals(13, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case67() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 12;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case68() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 13;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case69() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 14;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case70() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 15;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case71() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 16;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case72() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 17;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case73() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 18;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case74() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 19;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case75() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 20;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case76() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 21;
        assertEquals(-14, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case77() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 22;
        assertEquals(-12, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case78() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 23;
        assertEquals(-12, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case79() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 24;
        assertEquals(-10, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case80() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 25;
        assertEquals(-8, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case81() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 26;
        assertEquals(-8, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case82() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 27;
        assertEquals(-8, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case83() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 28;
        assertEquals(-8, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case84() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 29;
        assertEquals(-6, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case85() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 30;
        assertEquals(-4, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case86() {
        String doors = "ACFAPCKKBNNLOOLOJKAAKGCCMHIDHDEI";
        int trophy = 31;
        assertEquals(-2, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case87() {
        String doors = "ACFAPCKKBNNLLLLOJKAAKGCCMHIDHDEI";
        int trophy = 13;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case88() {
        String doors = "ACFAPCKKBNNLLLLOJKAAKGCCMHIDHDEI";
        int trophy = 14;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case89() {
        String doors = "ACFAPCKKBNNLLLLOJKAAKGCCMHIDHDEI";
        int trophy = 15;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case90() {
        String doors = "ACFAPCKKBNNLLLLOJKAAKGCCMHIDHDEI";
        int trophy = 16;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case91() {
        String doors = "DOLPHINIGLE";
        int trophy = 4;
        assertEquals(7, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case92() {
        String doors = "DOLPHINIGLE";
        int trophy = 7;
        assertEquals(-8, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case93() {
        String doors = "DOLPHINIGLE";
        int trophy = 6;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case94() {
        String doors = "DOLPHINIGLE";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case95() {
        String doors = "ABCDE";
        int trophy = 3;
        assertEquals(-4, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case96() {
        String doors = "ABCCD";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case97() {
        String doors = "ABCCDEFG";
        int trophy = 3;
        assertEquals(5, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case98() {
        String doors = "OP";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case99() {
        String doors = "PP";
        int trophy = 1;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case100() {
        String doors = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII";
        int trophy = 37;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case101() {
        String doors = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII";
        int trophy = 1;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case102() {
        String doors = "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII";
        int trophy = 49;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case103() {
        String doors = "ABGAABCD";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case104() {
        String doors = "ABCEFABD";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case105() {
        String doors = "ABCDEFGHIJKLMOPEFGHIJKLMOPHIJKLMOAAAAAAAALLMOPEFGH";
        int trophy = 25;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case106() {
        String doors = "ABDCEFGHIJKLMNOPOPAKBJMNFEHI";
        int trophy = 14;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case107() {
        String doors = "ABCDDDDDAPABCDDDDAPABCDDABDAPABCDDDEAPABCDDDDDAP";
        int trophy = 25;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case108() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP";
        int trophy = 15;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case109() {
        String doors = "AAABCD";
        int trophy = 2;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case110() {
        String doors = "ABCDEHPABCDLMNO";
        int trophy = 7;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case111() {
        String doors = "ABAC";
        int trophy = 2;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case112() {
        String doors = "IPMOFECNMELGIGELPEPLDLLFFPNKHELNDBLCNAMMAGCDHKDJEE";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case113() {
        String doors = "AJHIDDENMLBJEFFPODFGLMNGHEIJFJBMNLBCDDEDAGFE";
        int trophy = 23;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case114() {
        String doors = "AB";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case115() {
        String doors = "ABCDEDEFGHK";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case116() {
        String doors = "ABCDEFCBA";
        int trophy = 6;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case117() {
        String doors = "ABCDEFGHIJKLABCDEFGHIJKLMN";
        int trophy = 12;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case118() {
        String doors = "ABCDEFGHIJKLMNPPNMLKJIHGFEDCBA";
        int trophy = 16;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case119() {
        String doors = "CCCCCCCCCCCCCCABAPDCAACCCCCCCDDDDDDDDDDDCCCCCCCCCC";
        int trophy = 25;
        assertEquals(-4, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case120() {
        String doors = "ABCA";
        int trophy = 3;
        assertEquals(-2, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case121() {
        String doors = "OCAJBBLJLDGLMHMOJEONMGHHODCNIDLLGPDKNJIFP";
        int trophy = 14;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case122() {
        String doors = "ABCDAB";
        int trophy = 4;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case123() {
        String doors = "ADBCIFGFGDE";
        int trophy = 7;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case124() {
        String doors = "ABCDBCDEF";
        int trophy = 4;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case125() {
        String doors = "ABCDEFGHIJKLMNOLKJIHGFEDCBA";
        int trophy = 7;
        assertEquals(13, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case126() {
        String doors = "ADCCB";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case127() {
        String doors = "ABCDEFGHIJKLMNOAAAAAABCDEFGHIJKLMNOP";
        int trophy = 18;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case128() {
        String doors = "DOEBMGOCAJBBLJLDGLMHMOJEONMGHHODCNIDLLGPDKN";
        int trophy = 34;
        assertEquals(-14, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case129() {
        String doors = "AAAAAAACCCCCCCCCCAAABBDEFHIJKLMOPACBBBBBBBB";
        int trophy = 25;
        assertEquals(11, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case130() {
        String doors = "ABABC";
        int trophy = 2;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case131() {
        String doors = "ABCDAAAE";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case132() {
        String doors = "ABAPDEACCCCAAABCDFHIJKLAABB";
        int trophy = 13;
        assertEquals(11, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case133() {
        String doors = "ABCDECDE";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case134() {
        String doors = "PCGDPBNCCHMGNHIJOGFCCOGGIAEAFNOOJHAMCDHFPCDGIAOFNM";
        int trophy = 24;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case135() {
        String doors = "ABCDEFGHIIIIIIIIABCDEFGHIJKLMNOP";
        int trophy = 10;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case136() {
        String doors = "ABCABCD";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case137() {
        String doors = "ABCDEFGHIJKLMNOPPONMLKJIHGFEDCBAPMNABCDJKIPMED";
        int trophy = 8;
        assertEquals(15, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case138() {
        String doors = "ABCDEFGHIJKLMNABCDEFGHIJKLMNOP";
        int trophy = 14;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case139() {
        String doors = "ABDEDEC";
        int trophy = 4;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case140() {
        String doors = "AAAAAAAA";
        int trophy = 7;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case141() {
        String doors = "DABCD";
        int trophy = 4;
        assertEquals(-2, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case142() {
        String doors = "ABCDEFGABCD";
        int trophy = 7;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case143() {
        String doors = "ABDEDECFG";
        int trophy = 4;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case144() {
        String doors = "ABA";
        int trophy = 2;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case145() {
        String doors = "NGLEEBOCEBBNMHAJOBBBMHOBOHKMLGPIMKMALLCPMEMILMC";
        int trophy = 32;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case146() {
        String doors = "ABCDCDEFG";
        int trophy = 4;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case147() {
        String doors = "ABGHIIHGCDEF";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case148() {
        String doors = "ABCBCDE";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case149() {
        String doors = "ABCDEC";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case150() {
        String doors = "DEPIPJIMAJMAKCHDKJDOLLEHIHFEEDNDGBGBCEDFKMEPLIPOML";
        int trophy = 41;
        assertEquals(-12, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case151() {
        String doors = "AAAAADBAC";
        int trophy = 7;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case152() {
        String doors = "AAAAAAA";
        int trophy = 2;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case153() {
        String doors = "ABCDEDCE";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case154() {
        String doors = "ABCDDEFGHI";
        int trophy = 4;
        assertEquals(7, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case155() {
        String doors = "ABCDEFGHIJJIH";
        int trophy = 10;
        assertEquals(-6, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case156() {
        String doors = "ABACBA";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case157() {
        String doors = "BCDEFGHIJKLMNONOHIJKJOCBCBDJA";
        int trophy = 15;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case158() {
        String doors = "ABA";
        int trophy = 1;
        assertEquals(1, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case159() {
        String doors = "ABDCFGFGDE";
        int trophy = 7;
        assertEquals(-6, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case160() {
        String doors = "ABCAB";
        int trophy = 2;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case161() {
        String doors = "ABCCEFPD";
        int trophy = 5;
        assertEquals(-6, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case162() {
        String doors = "ABCCBDE";
        int trophy = 3;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case163() {
        String doors = "ABPAKLABKLAKLFEKLALBKGKLHG";
        int trophy = 10;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case164() {
        String doors = "ABCDEABPPPP";
        int trophy = 5;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case165() {
        String doors = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPAB";
        int trophy = 25;
        assertEquals(0, doorsgame.determineOutcome(doors, trophy));
    }

    @Test
    public void case166() {
        String doors = "AIKMMJPEECBOMKDNCMIMBBHGGAHCJHCGFALADHOPFDNCBMGMNM";
        int trophy = 5;
        assertEquals(7, doorsgame.determineOutcome(doors, trophy));
    }

}
