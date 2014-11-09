package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SurroundingGameEasyTest {
    SurroundingGameEasy surroundinggameeasy = new SurroundingGameEasy();

    @Test
    public void case1() {
        String[] cost = { "21", "12" };
        String[] benefit = { "21", "12" };
        String[] stone = { ".o", "o." };
        assertEquals(4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case2() {
        String[] cost = { "99", "99" };
        String[] benefit = { "11", "11" };
        String[] stone = { ".o", "o." };
        assertEquals(-14, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case3() {
        String[] cost = { "888", "888", "888" };
        String[] benefit = { "000", "090", "000" };
        String[] stone = { "...", ".o.", "..." };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case4() {
        String[] cost = { "4362", "4321" };
        String[] benefit = { "5329", "5489" };
        String[] stone = { "...o", "..o." };
        assertEquals(22, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case5() {
        String[] cost = { "5413", "4323", "8321", "5490" };
        String[] benefit = { "0432", "7291", "3901", "2310" };
        String[] stone = { "ooo.", "o..o", "...o", "oooo" };
        assertEquals(-12, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case6() {
        String[] cost = { "1243", "2234", "3213", "3210" };
        String[] benefit = { "0010", "7226", "2725", "0654" };
        String[] stone = { "o.o.", "..oo", "o.oo", "..o." };
        assertEquals(7, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case7() {
        String[] cost = { "5153", "4295", "3150", "1254" };
        String[] benefit = { "9210", "7336", "9882", "0070" };
        String[] stone = { "..o.", ".o.o", "...o", "ooo." };
        assertEquals(-1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case8() {
        String[] cost = { "6969", "5900", "4070", "0089" };
        String[] benefit = { "5172", "4872", "0298", "1211" };
        String[] stone = { ".oo.", "oo.o", "oooo", "oo.o" };
        assertEquals(11, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case9() {
        String[] cost = { "31", "23", "21", "02", "10", "51", "22", "62", "14" };
        String[] benefit = { "46", "56", "13", "85", "51", "34", "83", "52", "26" };
        String[] stone = { "oo", "oo", "oo", "oo", "oo", "oo", "oo", "oo", "oo" };
        assertEquals(39, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case10() {
        String[] cost = { "1109", "0119", "0019", "1209", "0109", "0101", "1009" };
        String[] benefit = { "0100", "0100", "1001", "0110", "1111", "0010", "0101" };
        String[] stone = { "oooo", "ooo.", "oooo", ".oo.", "oooo", "o.oo", "oooo" };
        assertEquals(-33, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case11() {
        String[] cost = { "020", "021", "000" };
        String[] benefit = { "201", "340", "243" };
        String[] stone = { "...", "...", "..." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case12() {
        String[] cost = { "65039525", "59471226", "59259239", "56016429", "51293382", "71356479", "95829444", "42226122" };
        String[] benefit = { "02945784", "05216198", "08552337", "79734106", "67879530", "51689987", "06540308", "40375225" };
        String[] stone = { "...o..o.", "...o...o", "...ooooo", ".o....oo", "o.o...o.", "..o.....", "o.oooo.o", "......oo" };
        assertEquals(-11, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case13() {
        String[] cost = { "30", "66", "85", "91", "99", "13", "59", "69", "19" };
        String[] benefit = { "83", "50", "30", "50", "84", "92", "85", "47", "00" };
        String[] stone = { "oo", "o.", ".o", "oo", "oo", "oo", "oo", ".o", "o." };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case14() {
        String[] cost = { "6801", "5200", "9810", "5911", "7801", "9811", "2300", "9911" };
        String[] benefit = { "0101", "2100", "2100", "2020", "0202", "2121", "1001", "1012" };
        String[] stone = { "....", "....", "....", "....", "....", "....", "....", "...." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case15() {
        String[] cost = { "941500253", "401153144", "302524050", "050413211", "422343520", "432343353", "445320303" };
        String[] benefit = { "711101000", "110111111", "110910010", "010010111", "001141311", "000100111", "011110121" };
        String[] stone = { "o.ooooooo", "ooooooo.o", "ooooooooo", "o.ooooooo", ".o.oooo.o", "oo..ooo..", ".ooo..ooo" };
        assertEquals(-74, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case16() {
        String[] cost = { "132", "251" };
        String[] benefit = { "402", "031" };
        String[] stone = { ".o.", "..." };
        assertEquals(-3, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case17() {
        String[] cost = { "456412624", "156610205", "663114840", "253061413" };
        String[] benefit = { "212101320", "231331201", "322122411", "022322030" };
        String[] stone = { "o....o...", "o......o.", "..o..o.o.", ".o....o.." };
        assertEquals(-15, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case18() {
        String[] cost = { "4191150", "8832425", "9880658", "8255196", "7023983", "0107423" };
        String[] benefit = { "1101011", "1111311", "0100011", "0131000", "0011001", "0011100" };
        String[] stone = { "ooooooo", "ooo.ooo", "ooooooo", "ooooooo", "ooooooo", "ooooooo" };
        assertEquals(-152, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case19() {
        String[] cost = { "056343", "231520", "251364" };
        String[] benefit = { "446414", "002031", "535605" };
        String[] stone = { "..o...", "......", "......" };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case20() {
        String[] cost = { "05110", "22552", "55134", "20221" };
        String[] benefit = { "30222", "30055", "33165", "83132" };
        String[] stone = { "oo..o", "oo.oo", "o....", "oo..." };
        assertEquals(9, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case21() {
        String[] cost = { "981285080", "935327406" };
        String[] benefit = { "032554012", "233402253" };
        String[] stone = { "o.o..o...", "oooo..o.o" };
        assertEquals(-19, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case22() {
        String[] cost = { "372423321", "246456546", "114472574" };
        String[] benefit = { "012340213", "043011633", "010110212" };
        String[] stone = { "...o.....", ".o......o", "o.o....o." };
        assertEquals(-12, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case23() {
        String[] cost = { "2219", "3134", "0130", "0213", "3034", "2003" };
        String[] benefit = { "3120", "1312", "0121", "3030", "2211", "3003" };
        String[] stone = { "oooo", "o.oo", "oooo", "oo.o", "o.o.", "oooo" };
        assertEquals(-9, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case24() {
        String[] cost = { "22000", "03020", "44001", "30202", "31200" };
        String[] benefit = { "11510", "01617", "00828", "24380", "36606" };
        String[] stone = { "oooo.", ".o..o", ".oo..", "ooooo", "oo..." };
        assertEquals(28, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case25() {
        String[] cost = { "02925", "78272", "47651", "81861", "56889", "66519", "80118", "44688" };
        String[] benefit = { "11102", "12121", "20001", "02201", "10112", "10111", "01022", "02010" };
        String[] stone = { "oooo.", ".oooo", "..o.o", "..ooo", "oo..o", "ooo..", "oo.oo", ".oooo" };
        assertEquals(-106, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case26() {
        String[] cost = { "530422", "122320", "311330", "044322", "321020", "304210", "220224" };
        String[] benefit = { "112800", "202000", "010001", "210400", "212220", "002010", "000122" };
        String[] stone = { "oo.ooo", "o.o.oo", "oo.oo.", "o..ooo", "ooooo.", "oo.o.o", "oooooo" };
        assertEquals(-22, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case27() {
        String[] cost = { "100000020", "602191555", "552465464", "404313064", "416264636", "435350435", "040305363", "425405632" };
        String[] benefit = { "110010100", "001100100", "111011010", "101110011", "101010000", "101000110", "011001111", "010110100" };
        String[] stone = { "oo.oooo..", ".oo.ooooo", "ooooooooo", "ooooo.ooo", "ooo..oooo", "ooooo.ooo", "oooo.oooo", "oooo.o.oo" };
        assertEquals(-168, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case28() {
        String[] cost = { "9136787", "7678310", "2801884", "2675428", "7891014", "4103473", "2442414", "4857745", "0107712", "4340780" };
        String[] benefit = { "8489948", "8220328", "4602686", "1652264", "3387593", "0021736", "1605726", "8605236", "6717951", "1918694" };
        String[] stone = { ".o.o..o", "..o....", ".....o.", "....o..", "oo.....", "ooo..o.", "..o..o.", "o...o..", ".......", "o..ooo." };
        assertEquals(-7, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case29() {
        String[] cost = { "444400", "043013", "420002", "241332", "321024", "344031", "301040", "013334", "124042" };
        String[] benefit = { "105070", "907345", "240226", "219020", "725291", "204020", "603001", "520220", "501601" };
        String[] stone = { "o.ooo.", "oooooo", "ooo.oo", "oooooo", "o.ooo.", "oooo.o", "o...o.", "oo.o.o", "ooo.oo" };
        assertEquals(44, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case30() {
        String[] cost = { "051223142", "054123130", "000545054" };
        String[] benefit = { "121200221", "100221121", "010110121" };
        String[] stone = { "..o....o.", "...o..oo.", "...o.o..." };
        assertEquals(-11, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case31() {
        String[] cost = { "29142", "54339", "30530", "55951" };
        String[] benefit = { "00210", "34423", "30022", "66105" };
        String[] stone = { "ooooo", "ooooo", "ooooo", "ooooo" };
        assertEquals(-34, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case32() {
        String[] cost = { "0540683152", "8509832234", "5576580206", "4287801181", "3781788564", "3631661283", "7868734435" };
        String[] benefit = { "0121212020", "0120201102", "0101100022", "2022202110", "2110221022", "2121200202", "1102121221" };
        String[] stone = { "oooo.ooo.o", "ooooo.ooo.", "ooo.oooooo", "oooooooooo", "oooo..oooo", "oooooooo.o", ".ooo..oooo" };
        assertEquals(-179, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case33() {
        String[] cost = { "9101001", "1901000", "0111010", "0019001", "0110611", "0111090", "1000119", "0001100" };
        String[] benefit = { "3933476", "6496075", "4919930", "5597044", "9470597", "8721719", "2323045", "9256348" };
        String[] stone = { "..ooooo", "ooo.o.o", "..o.o..", "ooo...o", ".ooo.o.", "oo.ooo.", "ooo.o.o", "o.ooo.." };
        assertEquals(133, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case34() {
        String[] cost = { "6020", "3244" };
        String[] benefit = { "9354", "5294" };
        String[] stone = { "....", "..o." };
        assertEquals(5, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case35() {
        String[] cost = { "161781", "374053", "367765", "773041", "726337", "593115", "517200", "061274", "615675" };
        String[] benefit = { "462347", "404037", "510057", "543569", "410257", "536049", "942349", "905259", "255058" };
        String[] stone = { "..o...", "ooooo.", "......", ".o.o..", "o..o..", ".o...o", ".o....", "ooo...", "...ooo" };
        assertEquals(-6, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case36() {
        String[] cost = { "14333430", "13233112", "00203483", "42535324", "52115515", "04411503", "31441172", "34224015", "24204235" };
        String[] benefit = { "80190517", "83485922", "20204472", "52805379", "55738006", "07911462", "50341659", "88762407", "97716123" };
        String[] stone = { ".o.oo.oo", "o.oo.oo.", ".ooooo.o", "oo.o..oo", "o.o..o.o", "o....o..", "ooooo..o", ".oo.ooo.", ".oooo.o." };
        assertEquals(111, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case37() {
        String[] cost = { "056605342", "077954522", "375555435", "877140030", "224578568", "118944930", "377353818", "804170517" };
        String[] benefit = { "100100101", "010110001", "100101101", "011110011", "110000011", "101000111", "001100100", "100010000" };
        String[] stone = { "..oo.oooo", "o.ooooo.o", ".o.o.o..o", "o.o.ooo.o", ".ooo..ooo", ".oooo..oo", "ooo.oooo.", "ooo...ooo" };
        assertEquals(-189, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case38() {
        String[] cost = { "1011000110", "0110101011", "1001090001", "0011061100", "0110111000", "0000000000", "1101000010" };
        String[] benefit = { "0101110101", "0100100000", "0001101011", "1101011110", "0100111001", "0111000000", "0111110000" };
        String[] stone = { "..........", "...o....o.", "o.........", ".......o.o", ".o.......o", "........o.", ".o.oo.o..." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case39() {
        String[] cost = { "9645764785495892", "6767963417295829", "8995999428979943" };
        String[] benefit = { "1123231333440135", "2253605303640215", "2323652703626504" };
        String[] stone = { "oo.ooo..ooooo.oo", "ooo.oo..o.o..o.o", "o.ooooo.oo.ooooo" };
        assertEquals(-101, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case40() {
        String[] cost = { "011110000111900", "100101001101900" };
        String[] benefit = { "372375122000665", "444452266340343" };
        String[] stone = { "..oo....o.o....", "..o.oo..o.o...." };
        assertEquals(27, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case41() {
        String[] cost = { "451050", "402452", "555335" };
        String[] benefit = { "442113", "624306", "623306" };
        String[] stone = { "...ooo", "o.o.oo", "......" };
        assertEquals(3, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case42() {
        String[] cost = { "132121632113036", "235633205564506" };
        String[] benefit = { "323460017142005", "530031122067570" };
        String[] stone = { "o....oooo.o...o", "o.o.o..o.o..o.o" };
        assertEquals(-8, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case43() {
        String[] cost = { "010", "233", "303" };
        String[] benefit = { "210", "100", "500" };
        String[] stone = { "..o", "o..", "ooo" };
        assertEquals(-2, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case44() {
        String[] cost = { "344123422304", "213131101102" };
        String[] benefit = { "325352211104", "360330415003" };
        String[] stone = { ".o...o....o.", "......o.o.o." };
        assertEquals(4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case45() {
        String[] cost = { "99302391491", "46935134054", "80234274572" };
        String[] benefit = { "22487503810", "57048025200", "06000070104" };
        String[] stone = { "o.oo.ooooo.", "oooooooo.oo", "ooooooooooo" };
        assertEquals(-35, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case46() {
        String[] cost = { "142649871", "908489046" };
        String[] benefit = { "412401432", "035535410" };
        String[] stone = { "oo.o...oo", "...ooo.oo" };
        assertEquals(-22, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case47() {
        String[] cost = { "05303430451653356164", "02430502320043522566", "34202215024555163566" };
        String[] benefit = { "00231325004161326553", "16066653033452360503", "20541220223042361455" };
        String[] stone = { "......o.............", "....................", "...........o........" };
        assertEquals(-6, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case48() {
        String[] cost = { "903", "238" };
        String[] benefit = { "400", "215" };
        String[] stone = { "o..", "..." };
        assertEquals(-5, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case49() {
        String[] cost = { "203", "446", "400", "314", "564", "032", "613", "043", "163", "232", "353", "142", "211", "061" };
        String[] benefit = { "205", "233", "540", "214", "152", "250", "451", "131", "045", "424", "312", "148", "040", "543" };
        String[] stone = { "ooo", "ooo", "o.o", "ooo", "oo.", "oo.", "o.o", ".oo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(6, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case50() {
        String[] cost = { "666", "921", "620", "002", "015", "636", "533", "114", "406", "505", "553", "339", "130", "802", "001", "250" };
        String[] benefit = { "902", "155", "600", "531", "124", "424", "612", "587", "766", "263", "226", "643", "577", "104", "751", "172" };
        String[] stone = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(35, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case51() {
        String[] cost = { "821", "219", "005", "909", "117", "022", "326", "821", "018", "000", "221", "120", "910", "203", "906", "102", "300", "607", "622" };
        String[] benefit = { "921", "936", "172", "572", "037", "290", "714", "281", "202", "762", "848", "106", "107", "210", "974", "610", "725", "441", "403" };
        String[] stone = { ".o.", "ooo", "ooo", "ooo", ".o.", "oo.", "oo.", "ooo", "..o", ".oo", "ooo", ".o.", "...", "..o", "ooo", "o.o", ".o.", ".oo", "oo." };
        assertEquals(56, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case52() {
        String[] cost = { "54", "20", "12", "12", "11", "45", "95", "12" };
        String[] benefit = { "01", "00", "01", "10", "01", "10", "10", "01" };
        String[] stone = { "o.", "..", "o.", "o.", ".o", "o.", "oo", "oo" };
        assertEquals(-24, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case53() {
        String[] cost = { "62", "52", "44", "24", "51", "12", "05", "62", "03", "41", "11", "26", "61", "24", "42", "33", "11", "15" };
        String[] benefit = { "51", "23", "40", "04", "05", "42", "03", "32", "02", "30", "40", "15", "33", "33", "11", "02", "80", "20" };
        String[] stone = { "..", "..", "..", "..", "..", "o.", "..", "..", "o.", "o.", "o.", "o.", "o.", ".o", "..", ".o", ".o", ".o" };
        assertEquals(-7, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case54() {
        String[] cost = { "213", "000", "167", "143", "400", "100", "012", "331", "204" };
        String[] benefit = { "331", "210", "131", "323", "211", "102", "223", "222", "010" };
        String[] stone = { "..o", "...", ".o.", "...", ".oo", "oo.", "o..", "o..", "oo." };
        assertEquals(-3, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case55() {
        String[] cost = { "220", "312", "223", "133", "312", "232", "022", "732", "322", "012", "000", "020", "102", "321", "211" };
        String[] benefit = { "033", "210", "135", "432", "412", "101", "221", "253", "335", "221", "044", "453", "442", "221", "234" };
        String[] stone = { "ooo", "o.o", "oo.", "ooo", "o.o", "ooo", ".oo", "ooo", "ooo", "ooo", "ooo", "o..", "ooo", "ooo", "ooo" };
        assertEquals(32, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case56() {
        String[] cost = { "91", "11", "11", "00", "00", "10", "01", "10", "11", "90", "10", "11", "11", "10", "01" };
        String[] benefit = { "31", "44", "01", "10", "42", "02", "41", "33", "04", "34", "42", "30", "02", "10", "00" };
        String[] stone = { "oo", "oo", "o.", "o.", "..", "o.", "oo", "o.", ".o", "..", ".o", "oo", ".o", "o.", "oo" };
        assertEquals(14, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case57() {
        String[] cost = { "046", "103", "885", "047", "163", "682", "823", "557" };
        String[] benefit = { "202", "193", "110", "130", "311", "183", "020", "030" };
        String[] stone = { "ooo", "ooo", ".o.", "oo.", "ooo", "..o", ".oo", ".o." };
        assertEquals(-12, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case58() {
        String[] cost = { "022", "222", "111", "213", "000", "212", "100", "110", "221", "122" };
        String[] benefit = { "201", "351", "701", "830", "617", "364", "604", "212", "707", "653" };
        String[] stone = { "...", "...", "...", "...", "...", "...", "..o", "...", "...", "..." };
        assertEquals(4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case59() {
        String[] cost = { "00302230021310430", "43030101244141241", "32233001340131020", "11412032201333311", "00210302124030403", "30140200334040104", "41301002241241220", "00443401202010314" };
        String[] benefit = { "02131212024200020", "10000000030440402", "04432003402340034", "13200012403140201", "22140031044403110", "13000243324040033", "42000023030442342", "20430323300111132" };
        String[] stone = { ".................", "....o........o..o", ".................", "......o......o...", ".........o.......", "..........o...o..", ".......o.........", "..........o......" };
        assertEquals(-5, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case60() {
        String[] cost = { "99636513", "47505337", "55242031", "00630032", "47464435", "64306622" };
        String[] benefit = { "92090090", "19109209", "21910901", "92092291", "29219009", "10911912" };
        String[] stone = { "oooooooo", "oooo.ooo", "oooooo.o", "oo.ooooo", "oo.ooooo", "oooooooo" };
        assertEquals(11, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case61() {
        String[] cost = { "5423210", "0343628", "6332566", "1464304", "2010255", "6654046", "2131644", "1152960", "4454100", "3131503", "6341365", "3156629", "5025222", "2310003", "1004310", "4636650", "4651316", "5233115", "1565224", "9412406" };
        String[] benefit = { "1255174", "2075705", "4714420", "4402350", "2603058", "7116506", "7437072", "4622538", "1058128", "1007781", "8707440", "0662280", "0221440", "0043307", "1702670", "3250043", "0601106", "5045600", "2202143", "3153400" };
        String[] stone = { "..o.ooo", "oo.oo.o", "o.o.o.o", "o...o.o", "o.o....", "oooo.o.", "..oo.o.", ".oo.ooo", "ooooo..", "..oo..o", "....oo.", ".oo.o..", "oo..o.o", ".o.ooo.", ".....oo", "o.o..oo", "o.ooo..", "oo..o.o", "o.oo.o.", "o......" };
        assertEquals(4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case62() {
        String[] cost = { "03154921211", "11411252123", "40612521150", "43030845531", "51554413121", "52150212454", "53223445454", "15253301034", "51540350555", "51514301351", "45555334363", "34051501214", "21535035351", "05115140252", "54213553030", "24302344524", "62023554550", "54444014543", "45414532551" };
        String[] benefit = { "05203010334", "04600000435", "13463000050", "01510030320", "43202030326", "01306133232", "13261310214", "03500122503", "42201000300", "02506000532", "05240041550", "05324100454", "00624001564", "04000002332", "06213002154", "05101001011", "06410000454", "14303013653", "01004003556" };
        String[] stone = { "ooo...o...o", "o.ooo.o..oo", "oo.oo...ooo", ".o.ooo.o...", "ooo.ooo....", "..ooooo.o.o", "..oooo..o.o", "o.ooo..oooo", "o.oo...ooo.", "..o.oo.oooo", "..o.oooo.oo", "o...o...o..", "ooooooo.oo.", "...o.oo...o", "...o.....oo", "o..o..ooooo", "oo..ooooo..", ".o.oo.o....", ".oooo..o..o" };
        assertEquals(-93, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case63() {
        String[] cost = { "120105", "944420", "153960", "261500", "852443", "311635" };
        String[] benefit = { "100441", "461100", "115523", "203354", "525600", "336244" };
        String[] stone = { "o..oo.", "o...o.", ".oo.o.", "..oo..", ".oo..o", "o.o..." };
        assertEquals(-1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case64() {
        String[] cost = { "214375145683180154", "737555352757147461", "884303063583707855", "054053634721804786" };
        String[] benefit = { "849262484237895466", "260943162952265696", "294611036992012439", "969965096410613903" };
        String[] stone = { "oooooooooooooo.ooo", ".ooooo.ooooo.ooo.o", "ooooooooooo.oooooo", ".oooo.ooo....o.ooo" };
        assertEquals(61, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case65() {
        String[] cost = { "6284465766", "5601372878", "8211870512", "6048434512", "5476575822", "7670360345", "5126375610", "0781451366", "5664357761", "2106020432", "6613788001", "4277715158", "7708258533", "0541814028", "3004857374", "8632895585", "3705423072", "7675665885" };
        String[] benefit = { "9020011120", "1002093311", "3111130312", "3132210100", "3232313133", "0000002002", "9130301132", "1313392203", "0013133203", "1133130233", "0120112332", "1030321233", "9213203300", "2313392223", "2230133130", "0332131002", "1231012133", "0112131021" };
        String[] stone = { "ooooooo.oo", "oooooooooo", "oooooooooo", "oooooooooo", "oo.ooooooo", ".oooooo.oo", "oooooooooo", "oooooooooo", "oooooooooo", "oooooooooo", "oooooooooo", "oooooooooo", "oooooooooo", ".ooooooooo", "oooooooooo", "oooooooo.o", "oo.ooooooo", "oooooooooo" };
        assertEquals(-417, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case66() {
        String[] cost = { "930153313304900", "013045534220015", "500192401142204", "051004034102040", "232352323143444", "133343305454344", "454003455401504", "134305253545592" };
        String[] benefit = { "120010210011112", "210111101210000", "021012221020121", "202012002222121", "210101111001000", "201022202210002", "011210000200202", "211010120112012" };
        String[] stone = { "oo...o....o.oo.", "oo..o.oooo.oooo", ".o....oo...oooo", "o......oo..ooo.", "o..oo......o.o.", "..ooo.o.o......", ".o.oo.o...o.oo.", "oo.o....o.o.o.." };
        assertEquals(-85, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case67() {
        String[] cost = { "414231425", "242424132", "315052606", "261512122", "405072502", "141307051", "424110704", "030304042", "513051515", "052422230", "304090515", "231320062", "316262403", "142515250", "123022305", "120628141", "516022525", "252516241" };
        String[] benefit = { "010011011", "000000011", "011000101", "101001011", "100111101", "100100001", "100101900", "110100010", "011100011", "110100001", "011111101", "110110001", "001000110", "100101111", "100000100", "101011901", "110010100", "010100100" };
        String[] stone = { "..o..o.o.", "..o.....o", ".o.o.oooo", ".o.o.....", ".oooooo..", ".o..o.oo.", ".ooooo...", "..o...o..", "ooo.ooooo", "...oo....", "oo.oo....", ".oo..oooo", "......o..", ".........", "o...o.oo.", ".....o...", ".o.o.....", "..o...o.o" };
        assertEquals(-124, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case68() {
        String[] cost = { "21505222", "21310001", "43044421", "62500241", "14442124", "26425111", "21335020", "02041032", "31204251", "56020244", "25421202", "14534122", "42120031", "12225231", "00251105", "40552455" };
        String[] benefit = { "10012001", "13381221", "11222303", "11323133", "21221032", "32122313", "11113122", "23121130", "33333203", "31200331", "01121201", "12303122", "20012132", "00122230", "32332323", "23033320" };
        String[] stone = { "........", "........", "........", "........", "..o.....", "o.......", "........", "..o.....", "........", "........", "........", "........", "........", "........", "........", "........" };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case69() {
        String[] cost = { "02311220232212", "13023101320303", "21220100203000", "31022102301320" };
        String[] benefit = { "42147707742300", "05604022774510", "77300100471132", "23340072110313" };
        String[] stone = { ".....o........", "..............", "......o.......", ".............." };
        assertEquals(5, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case70() {
        String[] cost = { "27989287669079893", "49667341091931619", "98095016828821899", "16324339225884091", "91006597245780987", "31824934778269995", "79659901760268165", "12677261760939458" };
        String[] benefit = { "80111212702220217", "00110114121122080", "00210160020121921", "02100612121206201", "12012010002162112", "01131221212922222", "21120000027002020", "13110201161010100" };
        String[] stone = { ".ooo..oooooooo.oo", "ooooooo.o.ooooooo", "oo.ooo...o.o.oooo", "oo.oooo.oo.o.o..o", "o.o...oooo...o.oo", "oooooo.oo....o...", "..o..oooo...ooooo", ".o..oo...oo.oo..." };
        assertEquals(-294, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case71() {
        String[] cost = { "900101101110", "110001011010", "100010111100", "110190100100", "000110100001", "011111011011", "001101011111", "011111011000", "111010101000", "000001101100" };
        String[] benefit = { "100100000009", "001101109001", "101011000110", "110019111110", "109100110101", "111101100009", "100101019110", "100011100111", "110009111111", "019110000001" };
        String[] stone = { "ooo.....o..o", ".o.o...ooo..", ".oo..o...o..", "..oo....o.o.", "o.oo.....o..", "ooo...o.....", ".oooo.o....o", ".o..o.o.oo.o", ".ooo.o.o....", "..o.oo.o...o" };
        assertEquals(44, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case72() {
        String[] cost = { "9953024283609461", "1677142353725322", "5333256216444435", "7375407249231357", "1645653332067002", "4434866409431127", "6466137053113910", "8002364422627164", "6762183510255711", "5953595277527666", "1734911466203910", "6702227310365632", "4150144025555563", "1620001727551635", "2701625713309126", "6446573511475455", "0636461704411004" };
        String[] benefit = { "2200432211123343", "3032223400324221", "4014002173022131", "3214441203334311", "4202331111312304", "4012401353020322", "0314322034304303", "3213343053319032", "2300322303123204", "1214241330004032", "3303102361223014", "4114044434144412", "1110910440304422", "0102901221433011", "3404214140414130", "3313000210340032", "4134104133221420" };
        String[] stone = { ".ooooo.oo...oooo", "o.oooo.ooooo.oo.", "ooo.ooo.oooooooo", "oooooooo.ooooo.o", ".oo.oo.o.oo.ooo.", "oooooo.oo.ooo.oo", "oooo.ooo.oo.oo.o", ".o....ooooo.oooo", "oo.oooooooooo.oo", "oooo.ooooo..o.oo", "ooooooo.ooooo.o.", "oooo.ooooo..oooo", "oooooooo...ooo.o", "o.ooooo..oooo.oo", ".oo..oo.oooo..oo", "oooooo.ooooo...o", ".ooooo.oo.oooooo" };
        assertEquals(-259, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case73() {
        String[] cost = { "04016562", "24112696", "14051540", "45530092", "22362211", "41465190" };
        String[] benefit = { "94433114", "25125001", "31131202", "02431443", "43452013", "55005535" };
        String[] stone = { "..o.ooo.", "..oo.oo.", ".o.o...o", "ooooo.o.", ".oo.o.oo", ".ooooooo" };
        assertEquals(-24, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case74() {
        String[] cost = { "13120021223", "13003312003", "23210022313", "11323033122", "01212010310", "32223111301", "23223213303", "33110222322", "11133030011" };
        String[] benefit = { "33041151011", "05022151000", "10213050400", "00021033100", "13001044401", "04304120300", "01100001011", "04223122401", "13104051500" };
        String[] stone = { ".....oo.ooo", "oo.oo.o....", "oo.ooooo.oo", ".o....oo.oo", ".oooooo.oo.", ".oo..o..o.o", ".....o..oo.", ".ooooo..o.o", ".oo.ooo..o." };
        assertEquals(7, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case75() {
        String[] cost = { "6330047", "3030812", "4421122", "2122104", "2413324", "3313134", "1314113", "4422040", "2001440", "0301403", "2234030", "9013440", "0000343", "2440302", "1013821", "0213221", "2342214", "4130007" };
        String[] benefit = { "3142133", "2020233", "6442115", "5336006", "6201354", "4665014", "2553530", "0033533", "0225413", "4241132", "4051121", "4164130", "5546453", "2315446", "5541623", "0033554", "1132311", "0335323" };
        String[] stone = { ".o.....", ".......", ".....o.", ".o....o", ".......", "...o..o", ".......", "o.....o", "...o...", ".o..o..", ".o.....", "...o...", "....o..", "......o", "...o...", "..o....", ".....o.", "......." };
        assertEquals(6, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case76() {
        String[] cost = { "2022331220200103", "0303022331332203", "3131003233301003", "2111113011233000", "1120300020131100", "3310131332023300", "3132000322211102", "2211103111220001", "0332313021003002" };
        String[] benefit = { "0424045512003240", "0221524123332400", "2324525505325340", "4304403242452121", "0041432143253020", "3513104510413442", "3014103205410105", "4224532044252433", "1243435333541332" };
        String[] stone = { "..o...o...o.....", "..o.o...........", ".......o....o...", ".o.ooo.o...o....", "o...o..o..oo.o..", "o..oo.........oo", "..o.oo.....o....", ".o.o.o.....ooo..", "o...o.o...oo.o.." };
        assertEquals(82, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case77() {
        String[] cost = { "32213113313303113112", "23233300123012122305", "01103111002221033012", "02013102120120033210", "03021303033321112011", "12302133101011220012", "31002111111233300121", "11312210312302131220", "02100300113133322209", "20110331103310000131", "31103330210033033002", "12132032322030212302", "32310110001122130319", "01000212121311231313" };
        String[] benefit = { "26218616222673229837", "43628894823445616678", "90554732932495062259", "13080011271112505247", "50971153157304687480", "68561916228248800013", "22310809160739781822", "84090541731480238004", "67300008641596320265", "15315466551754096801", "01584162343997123188", "04390215529482563568", "06661347988000387758", "03044940771132649161" };
        String[] stone = { "ooooo.oooooo.oooo.oo", "oooooooooooooooooooo", "oo..oooooooooooooooo", "ooooo.oooooo.oooooo.", "ooooooooooooooooooo.", "oooooo.ooooooooooooo", "o.oooo.ooooooooooooo", "oooooooooooo..oooooo", "ooooooooooooooooo.oo", "oooooooooooooooo.ooo", "ooooo.oooooooooooooo", ".ooooooooooooooooo.o", ".ooooooooooooooooooo", "oooooooooooooo.ooooo" };
        assertEquals(714, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case78() {
        String[] cost = { "030103323233", "220301126030", "222223510201", "230100201013", "325000610102", "025313130110", "110001500310", "122281412300", "105120022210" };
        String[] benefit = { "060242145205", "136024342302", "553444662053", "005446330000", "545322663444", "245364053521", "032532251501", "633650246204", "640440544200" };
        String[] stone = { "o..o...o....", ".o.o.oo.oo.o", "oo...o..oooo", ".o.oo..o...o", ".oo.o.....oo", "ooo..o.o.o..", "...o....o.oo", "..oo.......o", "oo.oo.oooo.." };
        assertEquals(85, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case79() {
        String[] cost = { "940914451071", "311911677372", "950743254452", "462602264420", "910940556344", "166763371264", "950276524336", "913506445057", "655963601453", "662026261524", "716170102031", "171940204435", "901903312237" };
        String[] benefit = { "561533172206", "146564621177", "700466144234", "764633141413", "403166333262", "062244641507", "553110716633", "307406230425", "733605237224", "266510206444", "012021403607", "251006351304", "057630710133" };
        String[] stone = { "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "oooooooooooo", "ooo.oooooooo" };
        assertEquals(-71, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case80() {
        String[] cost = { "9046134313412610743", "0454794557011773797", "5200416205927050345", "0059025517451201776", "5650752244406155313", "1965375302316012220", "1304420262263556729", "4162045722492614706", "0263614714710303041", "7001027552047250534", "6571532236762291026", "0716530641704204365" };
        String[] benefit = { "2434311410023002330", "0311421434401242320", "4134000221113143002", "2423234024021034403", "3112040130343034420", "1311044233011123401", "4124141421412140004", "4421041140212401041", "1013221320302102420", "4044203244403310414", "0320414240021021022", "4100413001031114243" };
        String[] stone = { ".o........oo......o", ".....o.o..o........", "..................o", "...o..o....ooo.....", "....o.....oo.......", ".......ooo..o..o...", "o..................", ".................o.", "...o..oo...........", "..oo.........o.....", ".ooo.....o..o......", "o.............o...." };
        assertEquals(-28, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case81() {
        String[] cost = { "5256050665", "1323593053", "3732507167", "0720510635", "0445794610", "5200757525", "6611223163", "2505391624", "5046545720", "0426724167", "7712396502", "2215370542", "3306646702", "6407794120", "1473723652" };
        String[] benefit = { "6208926783", "0420500515", "7590309204", "4840743354", "1172755909", "5855237398", "5815830515", "5274612560", "8603312508", "6188178684", "7596817843", "4432588183", "6053744673", "1401751936", "1850291676" };
        String[] stone = { ".o.....o..", "o.o......o", "..o.......", "ooo.....o.", "o.o.ooo...", ".....o....", "o....oo...", "..o.o...oo", "........o.", "....oo....", "....ooo...", ".o........", "....oo....", "...o...o..", ".....oo.o." };
        assertEquals(42, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case82() {
        String[] cost = { "2421241141", "3010242023", "1132021024", "1140120310", "4213314020", "4010102144", "1020121130", "1442013123", "4410423232", "1124040010", "3313043010", "0234323404", "0333241201", "3214303024", "1333221244", "0230421034", "2003042444", "1344144223" };
        String[] benefit = { "0142455352", "0034345124", "1052254005", "5015511045", "2255234401", "2025123205", "1052415041", "0405155323", "5541453500", "4514134030", "0541121131", "0250214520", "5031502005", "4523524102", "5533145454", "1033042354", "5135540033", "5544332031" };
        String[] stone = { "o.oooooo.o", "oooo.o..oo", "oooooooo.o", ".ooooooooo", "oooooooo.o", "o.o.ooooo.", "oooooooooo", "oooooooooo", "o.oo.o.oo.", ".oo.oo.o.o", "oo.ooooooo", "oo.oooooo.", "oooooooooo", "oo.ooooo.o", "oooooooooo", ".oo.oooooo", ".ooo.ooooo", "oooo.ooo.o" };
        assertEquals(144, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case83() {
        String[] cost = { "725859108322335", "225379440611573", "677859668635607", "388209615173137", "674069041775876", "315269860433573", "608819888616431", "637259083838711", "816769165024253", "842889000537613", "351489127003125", "177128144574765", "358629206757655", "227469688130433", "412449807125660", "401649322803450", "361739155147137", "262609652377845", "565219062152133" };
        String[] benefit = { "021010001100410", "110010111001011", "011000001101191", "019400101000000", "111000100000000", "110010000111001", "123000000020111", "000101031100310", "112011516001110", "000010110010000", "010000003116100", "110110111111021", "111011111000011", "111011003007111", "010616000101111", "101700100002000", "110001010100001", "001114030110030", "500101111110000" };
        String[] stone = { ".oo.ooo...o.o..", "..o.o....o...o.", "oooo..oo.o.o..o", "o.ooo.oo..oo.o.", "o..ooo.oooo....", "...o.ooo.ooooo.", ".o.....o..ooooo", "..o..o..o..o.oo", ".o...o.o..oo...", "..oo.oo..o.oo.o", "oo...o..o..oo.o", "o..o..ooo.o..o.", "o..o.oo.o..oo.o", ".ooo.o.o....o..", "..o...oo.o....o", "o..oo.oo..o.oo.", "ooo.o..o.oooo.o", "o....o.o..oo.o.", "oo.o..oooo.oo.o" };
        assertEquals(-501, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case84() {
        String[] cost = { "338068506663", "690348487401", "423554074869", "168858549308", "563340971640", "010703996268", "064045427327", "778165224387", "957471562571", "451166646243" };
        String[] benefit = { "211022111000", "211111220200", "121000012100", "201012200002", "112020200101", "000212212111", "211222210120", "002001121011", "210221200010", "100110200102" };
        String[] stone = { "oooo.o.ooooo", ".o.oooo.oooo", "oooo.ooooooo", "ooooooo.ooo.", "ooooooooo.oo", "o.oooooooo.o", "o.oooooooooo", ".o..oooo.ooo", "ooo...o.oo.o", "ooo..ooooooo" };
        assertEquals(-328, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case85() {
        String[] cost = { "98770193600", "82945895286", "50939168632", "96697238622", "66331438796", "89437885945", "29445619161", "87387659727", "95577658106", "53999797974", "48655286294", "03540665902", "66574260941" };
        String[] benefit = { "23020213332", "33220101101", "00232023003", "03113102310", "03323102032", "00213013302", "00211221003", "11230013102", "30101310233", "01321311301", "30210221120", "00010002002", "02002302323" };
        String[] stone = { "ooo.ooo....", ".o..oo..o..", "o.ooo.oo.oo", "o..o..ooooo", "oooooo.o.o.", ".oo..oooooo", "ooo..o.o.o.", ".ooooo.oooo", ".o..ooo.oo.", "o......o.o.", "o..o..ooo.o", "....o.oooo.", ".o.o....ooo" };
        assertEquals(-312, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case86() {
        String[] cost = { "012243312032330", "421340332410020", "021014142123042", "431031412240041", "001111330211322", "112303004420344", "031221410344024", "102120121032403", "010041141042030", "444330122440201", "332201210214322", "341300330444043" };
        String[] benefit = { "293396375726097", "989369573066070", "338080042805206", "560771679597622", "786715885410664", "003922630746547", "863581558635080", "362580165028589", "683546728317846", "748171678701330", "882224980318742", "896443032918665" };
        String[] stone = { "...............", "..o...........o", ".o........o....", ".o....o...o....", "...o.o...o..oo.", ".o.o........o..", "....o..........", "........o..o...", ".oo..o..o......", "...o......o...o", "..o.........o.o", "o.o........oo.o" };
        assertEquals(100, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case87() {
        String[] cost = { "953549431960208", "664221662659112", "499173902885597", "852759439192395", "904404733400139", "402597160201087", "860500837142172", "844697811909370", "347973942240057", "946880911742126", "764741404980412", "963490951126705" };
        String[] benefit = { "054510410254003", "214312504424200", "403124335101340", "044314302515152", "015104520104045", "225130055500042", "101434113214420", "512121545521523", "023510140313044", "121151353010552", "545454323431440", "034250512412022" };
        String[] stone = { "o...o..oooo.o.o", "oooooo.oo..oooo", "oooooo....oo.oo", "ooooo.o.oooooo.", "oooooooooo..ooo", ".ooo.o..ooo.oo.", "ooo..ooo.o.oo..", ".ooo.oo..ooo.o.", "oo.o.oo.oo...oo", ".o.ooooo..o..oo", "ooo.oooooo.o.oo", "o...o..oooo.o.o" };
        assertEquals(-231, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case88() {
        String[] cost = { "011011111000", "910100110110", "100101010110", "110011001001", "001011000100", "101111110000", "010110011110", "101010010100", "101110100100", "000001011011", "901111010000", "111100011010", "010001101011", "001001010110", "011101001011", "111110000100", "111001010101", "010111101011" };
        String[] benefit = { "844003129342", "133201012110", "901123049243", "122040434203", "902032129241", "114222024041", "901230239320", "242410233142", "944031209410", "012421332020", "910044249040", "240211301043", "910122349232", "343431113203", "940030339121", "404332402101", "921334339322", "334341231110" };
        String[] stone = { "ooo.o.oooooo", "ooo.ooo.oooo", "ooooooooo.oo", "ooooooo..o.o", "o.o.oooooooo", "oo.ooo.o..oo", ".o.oo.ooo.oo", ".ooooooooo.o", "oo.ooooooooo", "o.oooooooooo", "oooooo...ooo", "ooooooooo.oo", "oooooo.ooooo", "ooooo.ooooo.", "oo.ooooo.ooo", "oooooo.ooooo", "ooooo.ooooo.", "ooooooooo.oo" };
        assertEquals(390, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case89() {
        String[] cost = { "78438741605310", "33302571108002", "40542043387128", "65600881002457", "40718243734235", "88457125670028", "81007305807766", "70167201656410", "23866040608603", "61107818708276", "11173501808205", "28320280356024", "55225130600161", "66105021408471", "61880065710052" };
        String[] benefit = { "22110110200022", "12220200010112", "01002122111202", "02012111021111", "01220012001022", "20101121001211", "00000012100221", "01211100220202", "22000132202110", "02012210101211", "20002022002112", "22110000201020", "12202120200011", "02020210200011", "01000002111102" };
        String[] stone = { "o...o.o...o...", ".....o.o.oo...", "..ooo.o....o.o", "o.o..oo.o.....", ".o..o...o.....", "..o..o....o...", "..o.o.........", ".....o...oo.o.", ".oo......o....", "......oo..o...", ".o........o...", ".o...o........", "....o.....oo..", ".ooo.o.....oo.", "...o......oo.o" };
        assertEquals(-166, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case90() {
        String[] cost = { "2850160849", "5865067549", "3218164208", "0547327859", "2940857235", "3891613935", "2403594567", "8702957601", "4945639108", "3412832704", "1231196267", "4457661134", "1241790958", "2606721356", "4147764053", "4937517964", "9722406172", "7465587416", "9340324436", "1238995331" };
        String[] benefit = { "8116836304", "5010548383", "6422211612", "1360532087", "0550026417", "5278351778", "6065653054", "2086066872", "3623333202", "8717610673", "6585002747", "1881343317", "4410737323", "5564188153", "3217786701", "1783434574", "3486878308", "5887057501", "0811576260", "5312778247" };
        String[] stone = { "o..o....o.", "o..o...ooo", "o...o..oo.", "o.........", "......o...", "...oo.....", "..o.o...o.", "o....oo.o.", "o.oo.ooo.o", "..o.......", "..oo.oo..o", "o.....o..o", "..o...oo..", "...oo..o..", ".......o..", ".oo....o.o", "o........o", "..........", "o.o..oo.o.", ".o....o..o" };
        assertEquals(12, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case91() {
        String[] cost = { "336203546510564561", "240534462062544124", "430530564360333641", "605025164546434216", "512544020355511122", "610424436432255602", "441545360034251113", "145344311563511164", "131122355315163156", "565446421246653605", "066624536051031221", "466625212014225201", "630641006463060442", "130013541004153001", "110044030024301225", "154162631351215500", "433651604502510151", "260630112546130206", "135232102403321302", "245331243346250513" };
        String[] benefit = { "111101011101911101", "110090000111010111", "001100111101010010", "111010110110100111", "910011110090011011", "100100000101110001", "100111010001101011", "101001901000110190", "011000100011110110", "111011110011000100", "101010101010910001", "111091001010000111", "111000011001110001", "110001110110111010", "910110011191111001", "011001011011001010", "011000010100001101", "011101901111010091", "010101010110011010", "000111110011000111" };
        String[] stone = { "ooooo.ooooo.oooo.o", "ooooo.o.o.ooo.oooo", "oooo.ooooo.ooooooo", "oo.ooooooooooooooo", "oooooooo.oooooo.oo", "oooooooo.oooo.oooo", "oooooo.ooo.ooooooo", "oooooo.oo.ooo..ooo", "ooooooooo.ooooooo.", "oooooooooooooooooo", "o.ooooooooooooo.oo", "..ooooooo.oo..oooo", "oo.oooooo.oo.ooooo", "o.oooooo.ooooooooo", "ooo..oooo.oooo.ooo", "ooooo.oooooooooooo", "ooooooo..ooo.ooooo", "oooooooooooooooooo", "ooooooooooooo.ooo.", "ooooooooo.ooooo.oo" };
        assertEquals(-647, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case92() {
        String[] cost = { "13212312111", "02232232310", "11232320220", "00122002330", "03223002012", "12203210000", "30222033320", "30003103102", "21331231100", "21100300332", "01022301221", "32100023022", "31002332131", "10220232000", "00013520313" };
        String[] benefit = { "15324704830", "33906182827", "53204887037", "13386622831", "91647793814", "42743357028", "47034602844", "35732183657", "26355758167", "34358000439", "82858539195", "18595245010", "56070120064", "73815111533", "41897770136" };
        String[] stone = { ".o.oo......", "...oo......", "o...o......", ".........o.", "o.........o", "....o......", "...........", "...........", "...........", "...........", "...........", ".....o.....", "...........", ".......o...", "..........." };
        assertEquals(24, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case93() {
        String[] cost = { "5327312105", "7424647317", "5613135715", "7615166704", "2372746617", "0442765006", "1350244275", "0765023743", "0757311331", "5643124474", "2463266001", "4140376472" };
        String[] benefit = { "3506213065", "0012153420", "4133230320", "4462205142", "2602444264", "0324012135", "4421005364", "5311531060", "6011461245", "0642211243", "2466050163", "6664643362" };
        String[] stone = { "ooo.ooooo.", "...ooooo..", "..o.o.o.o.", "....o.oooo", ".o.ooo.oo.", "o.oooo.ooo", "o....o.ooo", ".........o", "..o..oooo.", "oo..o.o.oo", "..oooo....", ".oo.oo..o." };
        assertEquals(-5, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case94() {
        String[] cost = { "02334012104", "00040040000", "02021030040", "03013034310", "22243040020", "02244244004", "03000024302", "23001031403", "02022443330", "00043343100", "22234021104", "41002010432", "04021323302", "04340324200", "12010030204", "31444022000", "33401341400" };
        String[] benefit = { "90000011100", "91100100100", "90010011111", "90000001000", "90001100110", "90011011111", "91000111110", "91110001001", "90100011100", "90111000100", "90010110000", "10010100110", "90011000011", "90110010011", "90111100101", "91101011010", "91001001100" };
        String[] stone = { ".ooo....ooo", "o...o.o.o..", "o..oo.ooooo", "ooo..o..oo.", "..oooo..o..", "..o..ooooo.", "o.oo...oo..", "oo......o..", ".....oo.o..", ".ooo...o...", "o.oo.ooooo.", "o.o........", "...o...oo.o", "oo...o.o..o", "..oo.......", "....o.o..o.", "...oo..o..." };
        assertEquals(-26, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case95() {
        String[] cost = { "800182271585152208", "624372370727460371", "226506716008810743", "548411380585558325", "501464626504238288", "850526557143230000", "286203863583860734", "642455116467334078", "348332821674017573", "632013357375274624", "185808460881463607", "410470785846773486", "360406700075525603", "381431842424217280", "403740837513388226", "744874482517115343", "284005386534584201", "584715735361736243" };
        String[] benefit = { "524054606451246164", "066652505023624203", "207015340041516541", "253665073056211503", "260074306712156352", "550312741022327156", "746000640603451561", "107666175070051073", "752031100642753425", "322301134022704013", "352004271504621517", "656064674073507275", "700017237342210547", "156143354046467417", "140041433442103045", "476346360040561105", "532053450343153601", "503160725073464321" };
        String[] stone = { "oo....oo...oo.o...", ".o.....o..ooo.oo.o", "ooooo.oo.o..o...o.", ".ooo.o.o...o.o.o.o", "o..o.o...o..oo..o.", ".oooo.o...o......o", "o.o.o.......o..o..", "ooooo.o...o..oo.oo", "....oo..o.....o...", ".o.o...o...o.ooo..", ".o...o.o..o.o..oo.", "....ooo...o.....oo", ".o......ooo.....oo", ".o.oo.oo...oo.o..o", ".....oo....o..oooo", "...o....ooo.oo.oo.", ".o...oo.ooo..o..o.", "..o..ooo..o.oooo.." };
        assertEquals(-68, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case96() {
        String[] cost = { "30602425106063055", "60414400611020050", "15144006023361310", "35104131402552116", "63653631140640114", "30536042115334463", "10443640511213223", "60225220652363151", "02304011445160244", "25241013205653545", "66240256560543210", "04312431624145032" };
        String[] benefit = { "13022223130031230", "23020010033003101", "13003032320101112", "10022031101230301", "03232030201220102", "20322121013113202", "20303100023112121", "23013000003211110", "02100112303300002", "21000021321123323", "30303113113311033", "02021211111132101" };
        String[] stone = { "oooooooo.oooooooo", "oo...oo.o...o.ooo", "o.oo.ooooooo...oo", "oooooo.ooooooooo.", "oo.ooooooo.ooo..o", "ooooooooo...o..oo", ".o.oo.oooooooo.oo", "ooo.oo.o.oooooooo", "oooo..ooooooo...o", "oooooo.o..oo..oo.", "oooooo.oooo.ooo..", "...oo...oo..ooo.o" };
        assertEquals(-204, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case97() {
        String[] cost = { "9209912222002", "0201920210222", "2121010022101", "1021121021212", "9229212011021", "0029911120202", "9100122222222", "9220900020122", "1021912221120", "9209200220001", "9022912101100", "0209911220122", "9109222012221", "2120900022011", "2119212020120", "2009202100222", "9220011111210" };
        String[] benefit = { "0232413330230", "3122311220110", "0021020020202", "2102233321210", "2332023110031", "0033152001201", "0203220313121", "3100102201302", "1010300203022", "2023301221300", "2311011133031", "0210101311010", "1030313200111", "0104310220022", "1302323133003", "1102232031201", "0020303111020" };
        String[] stone = { "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooo.ooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo" };
        assertEquals(-133, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case98() {
        String[] cost = { "1341262605", "4566331210", "4655492609", "4556235500", "4420133346", "4252355650", "1643505315", "6062004450", "6461561320", "2116006063" };
        String[] benefit = { "8143033390", "0463449204", "7301331291", "4091119120", "9400131394", "4490036344", "6411142280", "2063339430", "6021231383", "1470418142" };
        String[] stone = { ".o..ooo..o", "ooo..o....", "oooo.....o", "oooooo.oo.", "o....o.o.o", "oooo....oo", ".o...o..oo", "oo.oo..o..", "ooo..oo.oo", ".oooooo..o" };
        assertEquals(2, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case99() {
        String[] cost = { "41554204433103003251", "43013434239005134243", "13255200424403322532", "53021020050430104540", "30451432145053040301", "34203213438315022310", "52045331442205142215", "54323400223052032201", "01342551042141045350", "25134345131331054102", "21542423432521422041", "35552334525025112423", "04422240521333022400", "32501411231125203455", "00542414532234133341", "50340155304443141502", "55511004501255210554", "45130012332352124152", "53155122550150453244", "33823415305243051435" };
        String[] benefit = { "29612803003812549766", "85490338455095002104", "00563886449752930791", "82001270231910924983", "16383313095746677984", "50440569826386791768", "02494669200507460124", "51047701375705149338", "42447055005885553624", "08552977142737682448", "03686455445981120864", "36866290243277214331", "69688456293954137257", "55160363423283282612", "08016111209639520258", "46059185198538648898", "80907467010773338395", "88620588404883060957", "05722217312140970254", "50547709187151654880" };
        String[] stone = { "oooooooooo.ooooooooo", "oooo.ooooooooooooooo", ".ooooooooo.ooooooooo", "oooooooooooooooooooo", "oo..ooooooooooo.oooo", "ooooooooooooo.oooooo", "o.oo.oooooo.oooooooo", "ooooooooo.oooooooooo", "oooooooooooooooooooo", "oooooooooooooooooooo", "ooooooooooooooo.oooo", "oo.oooo.oooooooooooo", "ooooooooooooooo..ooo", "oooooooo.ooo.oo.oooo", "oooooooooooooooooooo", "oo.oooooooo.ooo.oooo", "oooooooooooooo.ooooo", "oooooooooooooooooooo", "ooooooooooo.oooooooo", "oooo..oooooooooo.ooo" };
        assertEquals(732, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case100() {
        String[] cost = { "2211129001600022011", "0100010120202001200", "1022100002112100211", "1020020102110211222", "2112220212412112022", "1222010101101111102", "2002001220111112122", "2210122122212021201", "0112100220012121210", "0202012020221212112", "9222221010110100121", "0022210111011011020", "2222212110022022221", "2011021211221211220", "7110021222121011102", "2100222110222020020", "2001226211211101112", "2120221211220111100", "0111210222010202222", "0202100102212211122" };
        String[] benefit = { "2541345405322041053", "3513023301313051515", "1442421541121053434", "5310341513143344030", "5500054230411430345", "3035215252250230235", "3054230200533000354", "4400511551535520013", "4424133212012005500", "5303342521344222121", "2312245144021530114", "1031405430344101308", "2011223222110122130", "2543005322052455445", "1330100024445030110", "1143104201854205521", "2020344155325100332", "3421034105146141151", "0304342024540130410", "4355550354353011303" };
        String[] stone = { ".o.oooo.ooo.oo..o.o", "o..o..ooo.ooooo.o..", "o..ooooo.ooooo.oooo", "oooooooo.oo..o.oooo", "oo.oo.oooo.ooo.oooo", "oooooooooo.ooooo...", "oo.o.ooooooooo..o.o", "oooo..o.oooo....oo.", "o.ooo.o...ooo..oooo", "ooo.oo...o...oooooo", ".ooooo.o..ooooo.ooo", "oooooooooo.oo..oooo", ".oo..ooooo.o.oo.oo.", "o.o.ooooooo....o.oo", "o.o.....o.oo.oo....", "..ooo....o.o..oooo.", ".ooo.o.oo..o...oooo", ".oooo.ooo.oooooo.oo", "ooo..o.oo.ooo.ooooo", "oo.oooooo....o.oooo" };
        assertEquals(353, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case101() {
        String[] cost = { "33022655146563663120", "13051446469346220103", "61005501309561214536", "14415456209600065503", "16553066239543422056", "63333130228631623626", "54003541309124456033", "53342331509362143261", "46411126151256160316", "53221500328045253236", "34664436129153326026", "56630402368632611160", "56103514649154433524", "44466606069646204326", "51620651539454512516", "40403555518553363051", "24100205139461356436", "50020340309124562025", "20001535349353662315" };
        String[] benefit = { "04411230200240040320", "41411222113130442123", "13043140203420331113", "02440213030303322440", "00402242210131310422", "23434424400132312344", "22424041300314012312", "40310333000100322324", "03303311413342211240", "01302044400104142211", "03034233104241124343", "03002100302104130010", "31434430010313340112", "00342444430102034200", "03224320404213121330", "13444031113431212320", "03003004322233012110", "03110033444141442003", "44400433240233314341" };
        String[] stone = { "o.oo.oooo.....ooo.oo", "....o..ooooooooo..o.", "..oo.oo..oo.oo..o...", "..o.oo..o..oooo.ooo.", ".oo.ooo.oooo..oo....", ".o.oo.........o.o..o", ".ooo.o....o.oo..oo..", "o...o........o....o.", "oo..o.oo....o.oo....", "ooo.oo.o...oooo.o...", ".oooo.oo..o......o.o", "oo.o.o.o.o..o.o.o...", "oooo..oo.ooo.oo....o", "o.o...oooo..oo.oo.o.", ".....ooo...o....o...", "oo.ooo.oo...o.oo.oo.", "...o.ooo..ooo.o..o.o", "o.o..oooo..oo....o..", "..o.ooooo.oo..o....." };
        assertEquals(-253, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case102() {
        String[] cost = { "63233312132313030123", "02122211513201001021", "12211100033133101333", "42031132030223115312", "42321132122000233111", "01201212630120013212", "10010103333300212120", "00125003403310215220", "12000313103302222332", "23000222112133100130", "30012032131300021332", "42220311013321321020", "23315030212133118013", "00230002310223232212", "93222132522130121110", "53010132032223302032", "11120323102031034231", "00023002111311210133", "22135231000212005023" };
        String[] benefit = { "10213300310321210202", "02021300230213300302", "21211200200110302112", "23332300220131302112", "13011201132321011203", "10002003130313032310", "00011032123231131320", "02010302100021310301", "03003002330103031202", "01021303000200110202", "21221310330111313301", "11012201022113003321", "32113202210112010000", "20110301201231013011", "22230020112022001101", "30102330230121221002", "33012100230022000302", "11030322100110211013", "12303303100202003313" };
        String[] stone = { ".........o..o.......", "..........o.........", "....................", "....................", "oo..................", "......o........o....", "........o....o......", "....................", "....................", "....................", "....................", "..........oo..o.....", "...............o....", ".....o..............", ".....o..o...........", "....................", "..o.................", ".......o............", "...................." };
        assertEquals(-15, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case103() {
        String[] cost = { "13622231310403055402", "26041040312642255423", "04664140510112455411", "16131550136664643335", "55526406033405431405", "04045041354210040363", "03414333232616201203", "51012565434240326012", "40443014660244423065", "25504466636152004014", "63252030564151341525", "52335621521544564245", "35652015340200040452", "53511034432611224350", "42513415215453154352", "44332210005012545545", "52605362653255000033", "50462031546145261621", "14553003544610022564", "21531330314132320621" };
        String[] benefit = { "00221366604142326451", "26554644313401212364", "42125112231032050521", "51364346614363625515", "06644132246266012041", "56546421165602115110", "06466064433234360412", "46204344233110631652", "05365365343650621506", "45521315240216251400", "20424104206444140560", "14304446263324441402", "06451364311346365330", "26216152666512526553", "11113425621402010113", "32121036563245234513", "05610544412104042560", "66663661150461233260", "64303341555350300253", "15520034645301256410" };
        String[] stone = { "o..oo..o..o.oo...ooo", "..o.......o.ooo.oo..", "o.oo.o...oo.ooo.....", "oooo...oo...ooo.o.oo", ".o..oo.o..oo.o.o.o.o", "o..o.o..ooo...o.....", "...o.oo...ooo.o.oooo", "...o.o...o.o..o.o.oo", ".o..ooo.o....oo.o...", "o..o..o.o..oo..o.oo.", ".o....oooo.....o....", "o.oo.oo...o..o...o..", "...oo.ooo.o..oo..o.o", "o..oo..o.o.oo.o...oo", "o...o.oo........o.o.", "o...o.....o...oo...o", "oo..o...oo.o.o..ooo.", "o.o.oo....oo.oooo.o.", "...o.oo.oo..oo.....o", "..o.o.oooooo..oo.oo." };
        assertEquals(41, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case104() {
        String[] cost = { "1121912029202020112", "0120092221111029102", "0921207212081201910", "1082001010009011121", "2212211292022910222", "1220011212021191200", "9202202010920201111", "1122211001122021120", "2122001822212212190", "0219112220122010011", "1212902207200100011", "0100090000002118120", "2922109222192202802", "2080002001129221120", "0220021090220912121", "0002011002122092200", "9212112011922110120", "0121121102110112112", "1211002901101122282", "2019002220121201100" };
        String[] benefit = { "1113553343150142314", "5444555341121020253", "2201532301435221141", "3454141351142320313", "4105555150004222033", "0315015443132233014", "9355203045500032243", "3204141324400253101", "3100031210151531422", "0231254525431144443", "3010240043455303210", "2214120301023514141", "5515334152020333200", "5444113041233533453", "0420544555224102414", "5403052514324425450", "3310415105203201023", "1403432421431550512", "4511353022211453144", "1113204505131032530" };
        String[] stone = { "ooooo.ooooo.oooo.oo", "o.oooo..o...ooooo.o", ".o.oo..ooooo.oooooo", "o.o.o.ooo.ooooo.ooo", ".oo.oooo.ooo..ooooo", "...oooo..oo.o.ooo.o", "oooo.oo....ooo.o.oo", "ooo.o...oooo..ooooo", "...oooo.o.oooooooo.", ".oo.oo.oooooooooooo", "oooo..oo.oooo.ooooo", "oo.oo.ooooooooooooo", "oo.oooo.oooooooo.oo", "ooooo.ooo.oooo.ooo.", "ooo.o.ooooooo.ooooo", "oo.oooooooooooooooo", "ooooooo.ooooooooooo", "ooooooooooooooooooo", "ooooooooooooo.oo.oo", ".oo.oooooooo.o.oooo" };
        assertEquals(328, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case105() {
        String[] cost = { "52001036372642276516", "36154122251247311705", "60743344669120221770", "52456522764012414524", "12640532155072115755", "01530617761325126533", "07441042042044363342", "24042700562143674515", "36541517446171007166", "12045207711676626551", "26225536714342407427", "52726293434773240605", "34735627627223577073", "00150677764663407504", "41742211646455321400", "30524055210731151670", "57702146473551462650", "15147405064147917202", "30443371747224174602", "14013276376567277541" };
        String[] benefit = { "20715770230615113750", "27516207225071613737", "23326663453260175221", "45533105064371746765", "56770402761560151431", "26655302340027051266", "10264162533006161374", "06366771620003742143", "56001256300242666134", "15754524277525506420", "11000116770003456715", "64263341763154044230", "27740364501274612614", "76330105746237156011", "32256074103670433263", "67726076150153072525", "30042740261276103231", "16514410276025151155", "20465422345410474423", "33134417356142444322" };
        String[] stone = { "..o.................", "....................", "...............o....", "...o................", "....................", "....................", "....................", "....................", "....................", "....................", "....................", "..................o.", "....................", "....................", "....................", ".o.......o.........o", ".................o..", "...o................", "....................", "...................." };
        assertEquals(22, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case106() {
        String[] cost = { "8289431994753310030", "9479401895920141002", "8093422795915132042", "9289441995745152043", "9499255990952043310", "9299410995854431020", "8099223985921103535", "9299232992825155105", "9299404994903141433", "7268250993950021034", "8189102993923425534", "9478020982951015412", "9396244965912101552", "9199425991711024445", "9379302842932555115", "9469304995933354321", "1299552995714345043", "6399453994924253245", "9067402891935002134" };
        String[] benefit = { "0000535352532430462", "0206650121263113266", "0000322163602032324", "0102424632540416423", "0206552210664625216", "0306336605251610033", "0406542022666640224", "0005653025324621036", "0405454006123564156", "0201432443660153154", "0005613550166113512", "0500245254625446343", "0203555556656356006", "0105412045103014242", "0403351654141440533", "0102522054256524003", "0102554212363345431", "0405002463520123652", "0001205262663623425" };
        String[] stone = { "...ooooo..ooo.oooo.", "oo.o.oo.o.ooo.oooo.", ".oooooooo.ooooo.oo.", "o.ooooooooooooooooo", ".ooo.ooooo.ooooooo.", "oooooo..o.o...oo.oo", "o.oo.o.o.o..ooooooo", "o.oo.ooo.oooooo..oo", "ooo.ooooooooooo...o", "oo..ooooooo..o.o.oo", ".oo..ooooooooo.oo.o", "o.oo.oo..o.o.ooooo.", "o.o..oooooooo...o..", "...ooo...oo..o.oooo", "..o.ooo.o.ooo.oo.oo", "oooooooo.oo.o....oo", "ooo.oo.ooooo.oooo..", "ooo.oooo..oo.o.oooo", "..o.o.ooo.ooo.o..oo" };
        assertEquals(-341, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case107() {
        String[] cost = { "0421460105518588401", "7364555604746586008", "5503206815560051536", "8582206254630384122", "2816003682633681432", "3522121656804583185", "3436272663302452215", "4370708247872141021", "3082882428264355025", "7778333830787143686", "5208630670371810718", "1250601053520844150", "1241304137260331144", "5102031330735206123", "0676157021821477762", "1032622234005510853", "0056623573102526475", "2755384270508263760", "5760286815433017201", "8856351413320011703" };
        String[] benefit = { "1204110211102210111", "2122011121012220310", "1222212022021101122", "2221110021000122000", "1116100212110221011", "1211002211021112021", "0110221200220021201", "2011201001202290122", "2120212212200201111", "2211320121100122320", "1102220200010302122", "2222020220222031202", "2022111211002112022", "8111112212201212421", "0102122000022112111", "0202202021221012011", "2110201212041026002", "2201220001000110510", "0100011111100222222", "0012022222212032220" };
        String[] stone = { "ooooooooooooooooooo", "o.ooooooooooooooooo", "ooooooooooooooooooo", ".ooooooo.oooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooo.ooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooo.ooooo", ".oooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooo.ooo", "ooooooooooooooooooo" };
        assertEquals(-882, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case108() {
        String[] cost = { "0768878019546200615", "6036802102442883256", "2553266370314847807", "0540126367718177185", "6788830356781405544", "8105075851147477775", "4276430165567627060", "6124414150076853940", "4001175731350472678", "4770221458102781244", "8341141714280557724", "6164638218504320118", "8978712044824283045", "3850341127866536142", "7826213318634752361", "8544787277816765787", "8061503744138722760", "6413252362027032723", "3345672464287502600", "8231116677174146673" };
        String[] benefit = { "9701305930230050823", "0482060743891000102", "2121305025121030034", "7403701840050001303", "0243431991761000966", "0116001490911300641", "0816201610050032104", "1581661084681015305", "0311106230430005220", "0112010120120312137", "0030200584181220512", "6494401032820001889", "1614700496302001500", "0803121591076101223", "0983831871552050354", "7809632290020100618", "1996701861162000306", "4480560234683101521", "0391315710340916912", "0343851350540016004" };
        String[] stone = { "o.ooo.ooo.ooo.oo.oo", "oooooooo.oooooooooo", "ooooooo.oooooo.oooo", "oo.oooooooooooooooo", "ooooooooooooooo.ooo", "ooooooooooooooooooo", "o.oooooooooooooo...", "ooooooooooooooooooo", ".oooooooo..ooo.oooo", "o.oo.oo.ooooooooooo", "oooooooo.oooooooooo", "oo.oooooooooooooooo", "ooooooooooooooooooo", "ooo.ooooooooooooooo", "oooo..oooooooooooo.", "oooooooooooo.oooooo", "oooooooooooooooo.oo", "oooo.oooooooooooooo", "ooooooooooooo.ooooo", "oo.oooooooooo.ooooo" };
        assertEquals(-392, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case109() {
        String[] cost = { "5413", "4323", "8321", "5490" };
        String[] benefit = { "0432", "7291", "3901", "2310" };
        String[] stone = { "ooo.", "o..o", "...o", "oooo" };
        assertEquals(-12, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case110() {
        String[] cost = { "4362", "4321" };
        String[] benefit = { "5329", "5489" };
        String[] stone = { "...o", "..o." };
        assertEquals(22, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case111() {
        String[] cost = { "999", "888", "777" };
        String[] benefit = { "999", "999", "999" };
        String[] stone = { "...", "..o", ".o." };
        assertEquals(12, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case112() {
        String[] cost = { "888", "888", "888" };
        String[] benefit = { "000", "090", "000" };
        String[] stone = { "...", ".o.", "..." };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case113() {
        String[] cost = { "21", "12" };
        String[] benefit = { "21", "12" };
        String[] stone = { ".o", "o." };
        assertEquals(4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case114() {
        String[] cost = { "111", "111", "111" };
        String[] benefit = { "111", "111", "111" };
        String[] stone = { "ooo", "ooo", "ooo" };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case115() {
        String[] cost = { "4362", "4321" };
        String[] benefit = { "5329", "5489" };
        String[] stone = { "..o.", "...." };
        assertEquals(-4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case116() {
        String[] cost = { "123", "123", "123" };
        String[] benefit = { "123", "123", "123" };
        String[] stone = { "...", "o.o", "..." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case117() {
        String[] cost = { "11", "11" };
        String[] benefit = { "11", "11" };
        String[] stone = { "..", ".o" };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case118() {
        String[] cost = { "12", "21" };
        String[] benefit = { "12", "21" };
        String[] stone = { ".o", ".." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case119() {
        String[] cost = { "111", "111", "111" };
        String[] benefit = { "111", "119", "111" };
        String[] stone = { "...", ".o.", "..." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case120() {
        String[] cost = { "5413", "4323", "8321", "5490" };
        String[] benefit = { "0432", "7291", "3901", "2310" };
        String[] stone = { "ooo.", "o.oo", ".o.o", "oooo" };
        assertEquals(6, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case121() {
        String[] cost = { "111", "111", "111" };
        String[] benefit = { "000", "090", "000" };
        String[] stone = { ".o.", "...", "..." };
        assertEquals(-1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case122() {
        String[] cost = { "00", "00" };
        String[] benefit = { "99", "99" };
        String[] stone = { "oo", "oo" };
        assertEquals(36, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case123() {
        String[] cost = { "888", "888", "888" };
        String[] benefit = { "111", "191", "111" };
        String[] stone = { "...", ".o.", "..." };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case124() {
        String[] cost = { "212", "212", "212" };
        String[] benefit = { "212", "212", "212" };
        String[] stone = { "..o", ".o.", "..." };
        assertEquals(0, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case125() {
        String[] cost = { "111", "111", "111" };
        String[] benefit = { "111", "111", "111" };
        String[] stone = { "...", "o..", ".o." };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case126() {
        String[] cost = { "111", "111" };
        String[] benefit = { "999", "999" };
        String[] stone = { "o..", "..." };
        assertEquals(8, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case127() {
        String[] cost = { "91", "19", "91", "19", "91" };
        String[] benefit = { "19", "91", "19", "91", "19" };
        String[] stone = { ".o", "o.", ".o", "o.", ".o" };
        assertEquals(45, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case128() {
        String[] cost = { "11", "11" };
        String[] benefit = { "22", "22" };
        String[] stone = { "..", "o." };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case129() {
        String[] cost = { "5413", "4323", "8321", "5490" };
        String[] benefit = { "0432", "7291", "3901", "2310" };
        String[] stone = { "....", "o...", ".o..", "o..." };
        assertEquals(9, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case130() {
        String[] cost = { "98", "75" };
        String[] benefit = { "22", "56" };
        String[] stone = { "..", ".o" };
        assertEquals(1, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case131() {
        String[] cost = { "123", "246" };
        String[] benefit = { "354", "458" };
        String[] stone = { "o..", "oo." };
        assertEquals(5, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case132() {
        String[] cost = { "111", "111" };
        String[] benefit = { "999", "999" };
        String[] stone = { ".o.", "..." };
        assertEquals(8, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case133() {
        String[] cost = { "5555555555", "5555555555" };
        String[] benefit = { "9999919199", "9999991999" };
        String[] stone = { ".....o.o..", "......o..." };
        assertEquals(-3, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case134() {
        String[] cost = { "11111", "11111", "11111" };
        String[] benefit = { "11131", "11131", "11131" };
        String[] stone = { "ooo..", "oooo.", "oooo." };
        assertEquals(4, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case135() {
        String[] cost = { "24214214279842374983", "24214214279842374983", "24214214279842374983", "24214214279842374983" };
        String[] benefit = { "21421797237478247388", "21421797237478247388", "21421797237478247388", "21421797237478247388" };
        String[] stone = { ".oo.oo.ooooooooooooo", "....................", "...............ooooo", "ooooooooooooooooo..." };
        assertEquals(11, surroundinggameeasy.score(cost, benefit, stone));
    }

    @Test
    public void case136() {
        String[] cost = { "212", "123" };
        String[] benefit = { "215", "125" };
        String[] stone = { ".o.", "o.." };
        assertEquals(2, surroundinggameeasy.score(cost, benefit, stone));
    }

}
