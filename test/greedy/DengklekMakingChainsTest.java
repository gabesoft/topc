package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class DengklekMakingChainsTest {
    DengklekMakingChains dengklekmakingchains = new DengklekMakingChains();

    @Test
    public void case1() {
        String[] chains = { ".15", "7..", "402", "..3" };
        assertEquals(19, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case2() {
        String[] chains = { "..1", "7..", "567", "24.", "8..", "234" };
        assertEquals(36, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case3() {
        String[] chains = { "...", "..." };
        assertEquals(0, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case4() {
        String[] chains = { "16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111" };
        assertEquals(28, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case5() {
        String[] chains = { "..1", "3..", "2..", ".7." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case6() {
        String[] chains = { "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46" };
        assertEquals(58, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case7() {
        String[] chains = { "...", ".0." };
        assertEquals(0, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case8() {
        String[] chains = { ".4." };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case9() {
        String[] chains = { "..9", "1.1", "2.2", "8.." };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case10() {
        String[] chains = { "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "..." };
        assertEquals(0, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case11() {
        String[] chains = { "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000" };
        assertEquals(0, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case12() {
        String[] chains = { "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999" };
        assertEquals(1350, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case13() {
        String[] chains = { "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case14() {
        String[] chains = { "65.", "12.", ".68", "..2", ".82", "0.4", "..0", ".15", ".41", "4.7", ".1.", "1.1", "8.6", "4.5", "..6", "6.1", "811", "83.", "...", "...", "...", ".46", "8..", ".1.", "260", "7.3", "..4", "4..", "4..", "66.", "708", "6.." };
        assertEquals(59, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case15() {
        String[] chains = { "3..", "90.", "..9", "30.", "7..", "5.4", "7.2", "9.0", ".6.", ".0.", ".42", "..1", "12.", "...", "..5", "..9", "..3" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case16() {
        String[] chains = { "663", "...", "..1", "67.", "355", ".0.", "5.1", ".32", "1..", "8.6", "..8", "..6", ".67", "...", "07.", "37.", "58.", ".2.", "..0", "60.", "3.6" };
        assertEquals(54, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case17() {
        String[] chains = { "9..", ".81", ".48", "222", "694", "1.6" };
        assertEquals(46, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case18() {
        String[] chains = { "..9", "...", "0.4", "32.", "6..", "6..", ".4.", "3..", ".81", "22.", "5.2", "21.", "890", ".53", "8..", "...", "..8", ".4.", "9..", "4.5", ".0.", ".6.", "738", "..5", "8.0", "5.1", "6..", "974", ".1.", "1..", ".8.", "1..", "749", "..1", "...", "..3", "...", "39.", "9.0", "0.." };
        assertEquals(96, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case19() {
        String[] chains = { "2..", "131", ".77", "075", "...", "...", "..8", ".75", "523", "7.4", "4.2", "3.6", "9..", ".1.", ".97", "282", "61.", "3..", "9.1", "..3", "..7", ".4.", "...", "..1", "..1", "50.", ".80", "2.6", "3..", "83.", "..6", "6.3", ".03", "1..", ".3." };
        assertEquals(66, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case20() {
        String[] chains = { "6.4", "...", "3.7", "..7", "8.." };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case21() {
        String[] chains = { "89.", "431", "0.9", ".49", "42.", ".86", "07.", "...", "54.", "2..", "...", "7.1", "79.", "7.5" };
        assertEquals(39, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case22() {
        String[] chains = { ".6.", "636", "5.9", "..0", "...", ".9.", ".11", "...", "9.4", "5..", "503", "192", "7..", ".63", ".45", "652", "67." };
        assertEquals(70, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case23() {
        String[] chains = { "59.", "8..", "...", ".26", "..1", ".3.", "25.", "6.7", "9..", "508", "85.", "..7", "4.4", ".0.", "..9" };
        assertEquals(36, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case24() {
        String[] chains = { "..8", ".17", ".4.", "...", "8.2", "..2", "5.5", "..3", "77.", ".4.", "...", ".76", ".90", "...", ".82", ".2.", "..8", ".7.", ".95", "...", "3..", ".6.", "45.", "97.", "9.4", "4.9", "88.", "..3", ".5.", "101", "...", "9.1", "95." };
        assertEquals(32, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case25() {
        String[] chains = { "9..", "8..", "8.1", ".39", ".09", "1.3", "...", "...", "3..", "..2", "...", "..4", "02.", "...", "..0", "1..", "..9", "1.8", "7..", ".9.", "1..", ".48", ".10", "93.", "0.7", ".44", "65.", "2.6", "...", "4.3", ".5." };
        assertEquals(24, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case26() {
        String[] chains = { "4..", "244", "3.6", "193", ".4.", "8..", ".7.", "...", "...", "..5", "0.1" };
        assertEquals(37, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case27() {
        String[] chains = { ".36", "..5", "...", "..0", "83.", ".94", "95.", "..3", "72.", ".87", "9.5", "04.", ".10", "...", "12.", "50.", "62.", "..9", "...", "2.4", "..0", "..8", "0.0", "6.1", "799", "1.8", ".76", ".8.", "0..", ".3.", "..1", "08.", "9.9", "97.", "...", "359", "..6", "90." };
        assertEquals(73, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case28() {
        String[] chains = { "3..", "588", ".51", "...", "541", "003", ".81", "3..", "165", "..9", "6.8", "2.3", ".68", "9..", ".10", "...", ".66", "723", ".8.", "6..", "61.", "303", "9.5", "8.2", "..7", "..1", "9.3", ".34", ".7.", "0..", "777" };
        assertEquals(108, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case29() {
        String[] chains = { "79.", "..7", "..9", "8..", "4.5", "0.4", "811", "..6", "8..", "...", "..6", "3.0", "4.9" };
        assertEquals(35, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case30() {
        String[] chains = { "3.6" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case31() {
        String[] chains = { ".2.", "87.", ".94", "..7", ".28", ".29", "4..", "280", "..3", "2..", "...", "3.1", "7.8", ".66", "40.", "...", "6.." };
        assertEquals(38, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case32() {
        String[] chains = { "741", "4..", "..5", ".9.", "4.3", "58." };
        assertEquals(30, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case33() {
        String[] chains = { "9..", "...", "...", "3.7", "1..", "...", "998", ".5." };
        assertEquals(42, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case34() {
        String[] chains = { "697", "..4", "4.5", "29.", ".86", "74.", ".90", "...", "...", "..0" };
        assertEquals(47, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case35() {
        String[] chains = { "4..", ".3.", "140", "..0", ".4.", "..2", "64.", "011", "7.5", ".79", "3.7", "820", "7..", "..7", "...", ".36", ".8.", "168", "69.", ".41", ".0.", ".69", "0.8", "48.", "8..", "612", "6.8", "804", ".9.", "14.", "...", "8..", "9.3", "...", "2.4", ".7.", "..0", ".17", "6.7", "...", ".4.", ".3." };
        assertEquals(84, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case36() {
        String[] chains = { ".9.", "10." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case37() {
        String[] chains = { "3.3", "...", "..6", "637", "18.", "...", "5.8", "9.4", "970", "...", "6..", ".7.", ".2.", "..5", ".60", "088", "...", "593", "..4", "2..", ".80", "4.4" };
        assertEquals(82, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case38() {
        String[] chains = { ".12", ".7.", ".65", "8.0", "18.", "4..", "..8", "40.", "91.", "3.3", "8..", "...", "67.", ".6.", "2.3", ".79", "..5", "9.8", "9.5", "...", "1..", "145", "3.2", "0..", ".7.", "6.4", "1..", "42.", "...", "14.", "89.", "..7", "..1", ".27" };
        assertEquals(43, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case39() {
        String[] chains = { "0..", ".8.", ".5.", "6..", ".89", "...", "603", "8..", ".1.", "5..", "5..", "1.9", "..6", ".0.", "6.1", "..4", "0.." };
        assertEquals(34, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case40() {
        String[] chains = { ".14", "41.", "...", "99.", "2..", ".56", "...", "...", "3.7", "..8", "437", "6..", "...", "...", "23.", "...", "397", ".1.", "..5", "..4", "7..", "24.", "...", "197", "1..", "707", "9.6", ".3.", "73.", ".87", "...", "49." };
        assertEquals(97, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case41() {
        String[] chains = { ".5.", ".0.", ".80", "3..", "3.2", "7..", "35." };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case42() {
        String[] chains = { ".19", ".2.", "3.8", "90.", ".52", "4.2", ".5.", ".86", "..6", "106", "3..", ".9.", "68.", "6..", "9.2", "08.", "81.", ".84", ".3.", "3.1", "3..", "366", "7.1", "5.5", "..7", "2..", "...", ".04", "82.", "19." };
        assertEquals(50, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case43() {
        String[] chains = { "24.", ".7.", "0..", "829", ".9.", "849", ".7.", "..4", "743", "8.2", "...", "9.7", ".85", "71.", ".34" };
        assertEquals(76, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case44() {
        String[] chains = { "9.2", "7..", "716", "888", "27.", "04.", "3..", "..2", "632", ".2.", ".7.", "..2", ".8.", "..2", "5.8", "214", "997", "18.", "7..", ".2.", ".72", ".4.", "...", ".96", "5.3", "315", ".94", "93.", "2..", ".97" };
        assertEquals(118, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case45() {
        String[] chains = { ".4.", ".6.", ".9.", "8.6", "6.1", "..8", ".41", ".8.", ".1.", "618", "79.", "..8", "95.", "226", ".75", ".55", ".2.", "..8", "652", "888", "..4", "9.6", "...", "..1", ".1.", "844", ".2.", "9..", "..6", "...", ".17", "1..", "0.4", ".9.", "..0", "19.", "02.", "..4" };
        assertEquals(106, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case46() {
        String[] chains = { "..6", ".03", "...", "6.0", "0..", ".8.", "..3", "...", "5.3", ".77", "69.", "9.2", "45.", "...", "017", "..3", "32.", "392", "..5", ".0.", "...", "169", "..8", "91.", "429", ".6.", "723", "207", "..7", "..5", "0..", "94.", "..8", ".84", "853", "2.5", "...", ".4.", "...", "043", "80.", "442", "135", "...", ".84", ".0.", "410", "6.1" };
        assertEquals(150, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case47() {
        String[] chains = { "97.", "239", ".0.", ".8.", ".52", ".80", "..1", "..5", "42.", "8..", "0..", "..9", "...", "8..", "..7", ".4.", "5.7", "..9", ".23", "1.0", ".93", "..2", "...", "28.", "...", "...", "...", "78.", ".9.", ".46", "9.1", ".41", "..9", ".6.", ".97", "..2" };
        assertEquals(46, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case48() {
        String[] chains = { ".1.", ".37", ".80", "...", "7..", "145", "67.", "92.", ".55", "...", "61.", ".93", ".0.", "2.9", "0..", "501", "..5", "..0", "..6", ".71", "...", "5..", "...", ".1.", "...", ".4.", "...", ".21", "345", "..8", "..9", "..8", "96.", "..7", ".78", "324", ".48", "1..", "5..", "..1", ".84", "...", ".7.", "109" };
        assertEquals(77, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case49() {
        String[] chains = { "2.6", "54.", "71.", "779", ".4.", ".0.", ".68", "098", "3.6", "9.6", "14.", "..9", "..3", ".72", "0..", ".5.", ".5.", "...", "..4", "870", "17.", "67.", ".6.", "..8", "3..", "4.4", ".4.", "8.5", "6.." };
        assertEquals(82, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case50() {
        String[] chains = { "...", "28.", "35.", "7..", "3.4", "..3", ".0.", "..2", "...", ".58", "...", "981", "6.0", "167", "377", ".2.", "5..", ".76", ".52", ".64", "73.", "99.", ".45", ".9.", "80.", "52.", "6.9", "...", "46.", "2.3", "..3", ".60", "..2", "...", ".4.", "...", "..3", "..." };
        assertEquals(80, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case51() {
        String[] chains = { "...", "0.9", "52.", "...", "...", "83.", "...", "45.", ".67", "3.5", "753", ".9.", "2.3", "44.", ".1.", "930", "8.4", "6.7", "055", "...", "8.0", "0.3", ".10", ".4.", ".7.", "9..", "482" };
        assertEquals(75, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case52() {
        String[] chains = { "4.5", "3.4" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case53() {
        String[] chains = { "8.7", "07.", ".87", "8.1", "184", "3.6", ".76", ".2.", ".1.", "8.8", "95.", "38.", "...", "7.3", "996", ".4.", ".1.", "..8", "06.", "..6", "..8", "532", "08.", "9.." };
        assertEquals(76, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case54() {
        String[] chains = { ".7.", "32.", ".46", "890", ".08", ".02", ".49", "381", "0..", ".96", "..1", "..8" };
        assertEquals(49, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case55() {
        String[] chains = { ".2.", "22.", "33.", "99.", "...", "3..", "88.", ".16", ".1.", ".79", "..3", "111", "..3", ".35", "4.9", "780", "904", "..7", "3.6", "7..", "0..", "292", "..6", ".1.", "6..", "87.", ".88", "1.6", "..2", "379", "2.7", "07.", ".3.", "31.", "982", "3..", "0.9", "...", "912", ".40", "974", ".5.", ".1.", "512", ".4.", "92.", "2.9", ".54", "957", "..8" };
        assertEquals(177, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case56() {
        String[] chains = { "44.", "5..", "...", "55.", "26.", "393", "...", "...", "49.", ".05", "73.", "3.5", ".7.", ".6.", "16.", "531", "3.." };
        assertEquals(42, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case57() {
        String[] chains = { "40.", "540", "..0", ".5." };
        assertEquals(13, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case58() {
        String[] chains = { ".8.", "1..", "0.4", ".1.", "4.4", "914", "372", "4..", "7..", "..4", "..3", "8.0", "..6", ".0.", "4.1", ".85", ".3.", ".16", "3.4", "664", ".81", "...", ".7.", "27.", "3.8", "437", "...", "323", "8.7", "0.9", "200", "09.", ".0.", "3..", "2.9", "...", ".41", "6..", "7.9", "8.3" };
        assertEquals(88, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case59() {
        String[] chains = { "4.6", "89.", ".9.", "04.", ".36", "55.", "...", ".58", ".93", ".3.", "9.0", "..0", "..4", ".63", "6.." };
        assertEquals(30, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case60() {
        String[] chains = { "101" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case61() {
        String[] chains = { "7.8" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case62() {
        String[] chains = { "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46" };
        assertEquals(58, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case63() {
        String[] chains = { "5.5" };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case64() {
        String[] chains = { "7.9" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case65() {
        String[] chains = { "1.2" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case66() {
        String[] chains = { "8.9" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case67() {
        String[] chains = { "16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111", "8.9" };
        assertEquals(31, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case68() {
        String[] chains = { "487", "482", "220", "149", "237", "097", "000", "161", "533", "943", "749", "875", "075", "164", "396", "588", "16.", "841", "368", "0.1", "30.", "598", "10.", "512", "805", "820", "617", "645", "458", "637", "298", "89.", "837", "5.0", "5.0", "178", "872", ".21", "033", "832", "950", "210", "377", "381", "866", "108", "8.4", "718", "2.2", "901" };
        assertEquals(572, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case69() {
        String[] chains = { "9.8" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case70() {
        String[] chains = { "9.9", "123" };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case71() {
        String[] chains = { "123", "..1" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case72() {
        String[] chains = { "123", "456", "2.2", "1..", "..1" };
        assertEquals(24, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case73() {
        String[] chains = { "..1", "3..", "2..", ".7." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case74() {
        String[] chains = { "444", "..7" };
        assertEquals(19, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case75() {
        String[] chains = { "111", "8.8", "9.9" };
        assertEquals(20, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case76() {
        String[] chains = { "16.", "9.8", ".24", ".52", "3.1", "532", "4.4", "111" };
        assertEquals(29, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case77() {
        String[] chains = { "5.6", "102", ".7." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case78() {
        String[] chains = { "..5", "2..", "7.6" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case79() {
        String[] chains = { "111" };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case80() {
        String[] chains = { ".9.", "123" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case81() {
        String[] chains = { "1.1" };
        assertEquals(1, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case82() {
        String[] chains = { "..1" };
        assertEquals(1, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case83() {
        String[] chains = { "123", "1.." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case84() {
        String[] chains = { "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "999", "777", "364", "224", ".97", "87." };
        assertEquals(138, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case85() {
        String[] chains = { "111", "1.." };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case86() {
        String[] chains = { "555", "4.5", "21.", ".01", "6.7" };
        assertEquals(26, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case87() {
        String[] chains = { "111", ".11", "11.", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case88() {
        String[] chains = { "0.0", "1.1", "2.2", "3.3", "4.4", "5.5", "6.6", "7.7", "8.8", "9.9" };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case89() {
        String[] chains = { "234", "435", "111", "...", "7.9", "44.", "23.", "3..", "..3", ".23", "..3" };
        assertEquals(41, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case90() {
        String[] chains = { "9.9", "8.8", "7.7", "6.6", "5.5", "4.4", "3.3", "2.2", "1.1" };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case91() {
        String[] chains = { "9.9" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case92() {
        String[] chains = { "1.9", "111" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case93() {
        String[] chains = { "...", "..." };
        assertEquals(0, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case94() {
        String[] chains = { ".9.", ".1." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case95() {
        String[] chains = { "5.6" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case96() {
        String[] chains = { "123", "1.9" };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case97() {
        String[] chains = { ".99" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case98() {
        String[] chains = { "7.3" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case99() {
        String[] chains = { "010", ".7." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case100() {
        String[] chains = { "..1", "9.8", "567", "24.", "8.6", ".42" };
        assertEquals(34, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case101() {
        String[] chains = { "111", "111", "1.1" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case102() {
        String[] chains = { ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".1.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0." };
        assertEquals(1, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case103() {
        String[] chains = { "7.4", "..1", "5.." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case104() {
        String[] chains = { "5.3", "123" };
        assertEquals(11, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case105() {
        String[] chains = { "111", "6.." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case106() {
        String[] chains = { "122", "..1", "2..", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case107() {
        String[] chains = { "111", ".9.", "11.", ".11" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case108() {
        String[] chains = { "16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111" };
        assertEquals(28, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case109() {
        String[] chains = { "9.6", "..1", "8.." };
        assertEquals(14, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case110() {
        String[] chains = { "..1", "123" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case111() {
        String[] chains = { "12.", ".12", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12." };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case112() {
        String[] chains = { "...", ".6.", "111", "1.." };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case113() {
        String[] chains = { "3.4" };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case114() {
        String[] chains = { "1.1", "1.1" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case115() {
        String[] chains = { ".15", "7..", "..3", "402", "9.9" };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case116() {
        String[] chains = { "123", ".2." };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case117() {
        String[] chains = { "9.9", "9.9", "9.9", "9.9" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case118() {
        String[] chains = { ".9.", ".91" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case119() {
        String[] chains = { "7.7" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case120() {
        String[] chains = { ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case121() {
        String[] chains = { "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "1..", "2..", "3..", "4..", "5..", "6..", "7..", "8..", "9..", "..1", "..2", "..3", "..4", "..5" };
        assertEquals(136, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case122() {
        String[] chains = { ".7.", ".1." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case123() {
        String[] chains = { "111", "222", "333", "444", "555", "1.1", "1.9", "9.1", "5.5" };
        assertEquals(63, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case124() {
        String[] chains = { "4.6" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case125() {
        String[] chains = { "123", "..5" };
        assertEquals(11, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case126() {
        String[] chains = { "111", "1.1" };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case127() {
        String[] chains = { "3.2", "3.4", "2.." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case128() {
        String[] chains = { "9.6", "44.", "..4" };
        assertEquals(14, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case129() {
        String[] chains = { "..1", "2..", "888", "4.7", "4.7" };
        assertEquals(35, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case130() {
        String[] chains = { "123" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case131() {
        String[] chains = { "..9" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case132() {
        String[] chains = { "123", "123" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case133() {
        String[] chains = { "111", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case134() {
        String[] chains = { ".9.", "11.", "111", ".11" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case135() {
        String[] chains = { "5.9", "9.1" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case136() {
        String[] chains = { "9.8", "8.9", "2..", "..3" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case137() {
        String[] chains = { "7.6", "8.1" };
        assertEquals(14, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case138() {
        String[] chains = { "1.1", "2.2", "3.3", "8.8", "9.9", "111", "11.", "1..", "..2", ".22", ".3." };
        assertEquals(20, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case139() {
        String[] chains = { ".9.", "000", "000", ".01", "10.", "000", "000", "010", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case140() {
        String[] chains = { "9.8", "111" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case141() {
        String[] chains = { "111", "5.2", "5..", "..1" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case142() {
        String[] chains = { "9.6" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case143() {
        String[] chains = { "32." };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case144() {
        String[] chains = { ".9.", "111" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case145() {
        String[] chains = { "1.5" };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case146() {
        String[] chains = { "..1", ".2.", "2.3" };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case147() {
        String[] chains = { "4.4" };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case148() {
        String[] chains = { "..1", "7..", "567", "24.", "8..", "234" };
        assertEquals(36, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case149() {
        String[] chains = { "5.3" };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case150() {
        String[] chains = { ".11" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case151() {
        String[] chains = { "111", ".9.", "11.", "..1" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case152() {
        String[] chains = { "123", "8.9" };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case153() {
        String[] chains = { ".15", "7..", "402", "..3", "9.9" };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case154() {
        String[] chains = { "9.9", "9.9", "1.3", "4.2" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case155() {
        String[] chains = { "111", ".7." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case156() {
        String[] chains = { "9.9", "11." };
        assertEquals(11, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case157() {
        String[] chains = { "1.4", "1.6" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case158() {
        String[] chains = { ".9.", "3.7" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case159() {
        String[] chains = { "..9", "999" };
        assertEquals(36, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case160() {
        String[] chains = { "99." };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case161() {
        String[] chains = { "111", "222" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case162() {
        String[] chains = { ".7." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case163() {
        String[] chains = { "..3", "4..", ".5." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case164() {
        String[] chains = { "999", "9.9", "..9", "1.." };
        assertEquals(45, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case165() {
        String[] chains = { "1.." };
        assertEquals(1, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case166() {
        String[] chains = { "3.2" };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case167() {
        String[] chains = { "1.2", "..2" };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case168() {
        String[] chains = { "6.8", "111", "7.6" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case169() {
        String[] chains = { "123", "456", "2.2", "2..", "..2" };
        assertEquals(25, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case170() {
        String[] chains = { "2.1" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case171() {
        String[] chains = { "1.5", "3.6" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case172() {
        String[] chains = { ".1." };
        assertEquals(1, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case173() {
        String[] chains = { "999", ".99" };
        assertEquals(45, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case174() {
        String[] chains = { "..5", "3..", "8.9", "9.8" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case175() {
        String[] chains = { ".2.", ".1." };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case176() {
        String[] chains = { "..7", "123" };
        assertEquals(13, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case177() {
        String[] chains = { ".1.", ".2." };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case178() {
        String[] chains = { "5.7", "1.6" };
        assertEquals(11, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case179() {
        String[] chains = { "79." };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case180() {
        String[] chains = { "111", "..1", "1..", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case181() {
        String[] chains = { ".5." };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case182() {
        String[] chains = { ".9.", "11.", "111", ".11", "23.", "123", "2.2", "91.", "11.", "2.9", "9.8", "238", "944", "2..", "191", "101", "...", "123", "322", "12.", "12.", "12.", "21.", "123", "43.", "23." };
        assertEquals(90, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case183() {
        String[] chains = { "333", "1.." };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case184() {
        String[] chains = { "3..", "333" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case185() {
        String[] chains = { "111", "5.5", "2..", "..1" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case186() {
        String[] chains = { "8.7", "123", "9.0", "0.2" };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case187() {
        String[] chains = { "9.9", "9.9" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case188() {
        String[] chains = { "..1", "111" };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case189() {
        String[] chains = { "123", "456", "..1" };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case190() {
        String[] chains = { "111", "111", "111", "..8", "9.9" };
        assertEquals(26, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case191() {
        String[] chains = { "999", ".7.", ".7." };
        assertEquals(27, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case192() {
        String[] chains = { "..1", "9.9", "3.." };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case193() {
        String[] chains = { "5.6", "..7" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case194() {
        String[] chains = { "5.8" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case195() {
        String[] chains = { "111", "3.4", "1.3", "2.4" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case196() {
        String[] chains = { ".1.", "000", ".0." };
        assertEquals(1, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case197() {
        String[] chains = { ".5.", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case198() {
        String[] chains = { "2.3" };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case199() {
        String[] chains = { "999", "9.9" };
        assertEquals(36, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case200() {
        String[] chains = { "1.3", "5.7" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case201() {
        String[] chains = { "111", "9.9", "1.1" };
        assertEquals(13, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case202() {
        String[] chains = { "9.9", "000", "1..", "..1" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case203() {
        String[] chains = { "999", "..7" };
        assertEquals(34, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case204() {
        String[] chains = { "1.1", "1.1", "1.1", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case205() {
        String[] chains = { "6.7" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case206() {
        String[] chains = { "111", "6.4", "5.1" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case207() {
        String[] chains = { "9.8", "7..", "..7", "4.4" };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case208() {
        String[] chains = { "8.9", ".43", "43." };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case209() {
        String[] chains = { "1.1", "1.1", "9.9", "8.." };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case210() {
        String[] chains = { "1.1", "2.2" };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case211() {
        String[] chains = { "222", "9.9", "5.1", "1.4" };
        assertEquals(20, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case212() {
        String[] chains = { "5.2", "6.." };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case213() {
        String[] chains = { "532", "7.." };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case214() {
        String[] chains = { "9.7", "8.1", "8.2" };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case215() {
        String[] chains = { "6.9", "1.2" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case216() {
        String[] chains = { "5.." };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case217() {
        String[] chains = { "..3", "1..", "5.9", "777" };
        assertEquals(31, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case218() {
        String[] chains = { "13." };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case219() {
        String[] chains = { "111", "111", ".9.", ".1.", "1..", "..1" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case220() {
        String[] chains = { "999", "99." };
        assertEquals(45, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case221() {
        String[] chains = { "2.9" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case222() {
        String[] chains = { "9.1" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case223() {
        String[] chains = { "956", "482", "168", "314", "849", "207", "060", "705", "673", "849", "265", "774", "579", "830", "223", "671", "554", "026", "061", "117", "300", "483", "012", "903", "885", "770", "893", "074", "783", "710", "083", "450", "145", "620", "356", "667", "677", "191", "627", "276", "513", "995", "926", "532", "444", "279", "237", "315", "785", "832" };
        assertEquals(664, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case224() {
        String[] chains = { "12." };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case225() {
        String[] chains = { "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999" };
        assertEquals(1350, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case226() {
        String[] chains = { "1..", "23.", "456", "..1", ".77" };
        assertEquals(34, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case227() {
        String[] chains = { "...", ".7.", "211" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case228() {
        String[] chains = { "5.3", "4.4" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case229() {
        String[] chains = { "16.", "9.9", ".24", "52.", "8.8", "532", "4.4", "111", "...", "..." };
        assertEquals(30, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case230() {
        String[] chains = { "..2" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case231() {
        String[] chains = { ".9.", "123", "1.." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case232() {
        String[] chains = { "9.9", "111" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case233() {
        String[] chains = { "9.9", "111", "1.1" };
        assertEquals(13, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case234() {
        String[] chains = { "9.9", "111", "8.8" };
        assertEquals(20, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case235() {
        String[] chains = { "9.9", "3.." };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case236() {
        String[] chains = { "111", "3.5" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case237() {
        String[] chains = { "6.6" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case238() {
        String[] chains = { "1.9" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case239() {
        String[] chains = { "3..", "..4", "7.7", "9.2" };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case240() {
        String[] chains = { "9.9", "8.7", "2..", "..3", "010" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case241() {
        String[] chains = { "333", "2..", "777" };
        assertEquals(32, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case242() {
        String[] chains = { "1..", "3.9", "402", "..1" };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case243() {
        String[] chains = { "0.0", "9.9", "9.9" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case244() {
        String[] chains = { "9..", "..1", "3.2" };
        assertEquals(11, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case245() {
        String[] chains = { "402", "..3" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case246() {
        String[] chains = { "111", "222", "333", "444", "555", "1.1", "5.5", "9.9" };
        assertEquals(59, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case247() {
        String[] chains = { "..8", "8.9", "123", "5.." };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case248() {
        String[] chains = { "111", "9.." };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case249() {
        String[] chains = { "9.9", "111", "9.9" };
        assertEquals(21, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case250() {
        String[] chains = { "123", ".45" };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case251() {
        String[] chains = { "111", ".9.", "..1", "1.." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case252() {
        String[] chains = { "23." };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case253() {
        String[] chains = { ".22" };
        assertEquals(4, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case254() {
        String[] chains = { "1.3", "3.4" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case255() {
        String[] chains = { "..1", "111", "11." };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case256() {
        String[] chains = { "9.." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case257() {
        String[] chains = { "..1", "8.7", "1.1", "9.9", "9.7", "123" };
        assertEquals(24, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case258() {
        String[] chains = { "1..", "..1" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case259() {
        String[] chains = { ".9.", ".2." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case260() {
        String[] chains = { ".8.", "..9", "9..", "..." };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case261() {
        String[] chains = { "111", "3.6" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case262() {
        String[] chains = { "9.8", "51." };
        assertEquals(14, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case263() {
        String[] chains = { "13.", "9.9", ".24", "22.", "3.1", "532", "4.4", "111" };
        assertEquals(28, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case264() {
        String[] chains = { "111", "11." };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case265() {
        String[] chains = { "111", "7.3" };
        assertEquals(10, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case266() {
        String[] chains = { "3.3", "11.", "..1", "111", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case267() {
        String[] chains = { "..8", "9.9" };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case268() {
        String[] chains = { "6.5" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case269() {
        String[] chains = { "6.3" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case270() {
        String[] chains = { ".9.", "999" };
        assertEquals(27, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case271() {
        String[] chains = { "6..", "3.9" };
        assertEquals(15, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case272() {
        String[] chains = { ".9.", "...", "023", "111" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case273() {
        String[] chains = { "5.4", "4.5", "222" };
        assertEquals(16, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case274() {
        String[] chains = { "2.3", "111" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case275() {
        String[] chains = { "...", "..0", "..1", "..2", "..3", "..4", "..5", "..6", "..7", "..8", ".1.", ".10", ".11", ".12", ".13", ".14", ".15", ".16", ".17", ".18", ".2.", ".20", ".21", ".22", ".23", ".24", ".25", ".26", ".27", ".28", ".3.", ".30", ".31", ".32", ".33", ".34", ".35", ".36", ".37", ".38", ".4.", ".40", ".41", ".42", ".43", ".44", ".45", ".46", ".47", ".48" };
        assertEquals(12, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case276() {
        String[] chains = { "3.." };
        assertEquals(3, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case277() {
        String[] chains = { "666", "4.5", "..3" };
        assertEquals(25, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case278() {
        String[] chains = { "222" };
        assertEquals(6, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case279() {
        String[] chains = { "..1", "111", "1..", ".9." };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case280() {
        String[] chains = { "...", ".7.", "211", "..1" };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case281() {
        String[] chains = { "...", "...", "000", "8.7" };
        assertEquals(8, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case282() {
        String[] chains = { "15.", "9.2" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case283() {
        String[] chains = { "1.2", ".9.", "6.9", "1.1", "111", "147", "8.8", "9.8", "7.5", "5..", ".7.", ".77" };
        assertEquals(38, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case284() {
        String[] chains = { ".13", "9.9", "14." };
        assertEquals(14, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case285() {
        String[] chains = { "8.9", "1.9" };
        assertEquals(17, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case286() {
        String[] chains = { "16.", "9.8", ".24", "52.", "3.1", "532", "9.9", "111" };
        assertEquals(31, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case287() {
        String[] chains = { "..3", "3..", "9.7", "777" };
        assertEquals(33, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case288() {
        String[] chains = { "9.8", "7..", "..5", "444" };
        assertEquals(27, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case289() {
        String[] chains = { "3.3", "2.2" };
        assertEquals(5, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case290() {
        String[] chains = { "6.6", "333", "2.5" };
        assertEquals(20, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case291() {
        String[] chains = { "1.9", "9.1" };
        assertEquals(18, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case292() {
        String[] chains = { "1.9", "9.1", "999" };
        assertEquals(45, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case293() {
        String[] chains = { "34." };
        assertEquals(7, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case294() {
        String[] chains = { "2.2" };
        assertEquals(2, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case295() {
        String[] chains = { ".11", "11.", "5.3", "6.3" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case296() {
        String[] chains = { "1.1", "8.7" };
        assertEquals(9, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case297() {
        String[] chains = { "123", "456", "1.." };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case298() {
        String[] chains = { "7.9", "1.1", "138", ".20" };
        assertEquals(22, dengklekmakingchains.maxBeauty(chains));
    }

    @Test
    public void case299() {
        String[] chains = { "16.", "9.9", ".24", "22.", "3.1", "532", "4.4", "111" };
        assertEquals(29, dengklekmakingchains.maxBeauty(chains));
    }

}
