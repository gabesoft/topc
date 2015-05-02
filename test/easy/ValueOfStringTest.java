package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ValueOfStringTest {
    ValueOfString valueofstring = new ValueOfString();

    @Test
    public void case1() {
        String s = "babca";
        assertEquals(35, valueofstring.findValue(s));
    }

    @Test
    public void case2() {
        String s = "zz";
        assertEquals(104, valueofstring.findValue(s));
    }

    @Test
    public void case3() {
        String s = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(6201, valueofstring.findValue(s));
    }

    @Test
    public void case4() {
        String s = "topcoder";
        assertEquals(558, valueofstring.findValue(s));
    }

    @Test
    public void case5() {
        String s = "charlie";
        assertEquals(297, valueofstring.findValue(s));
    }

    @Test
    public void case6() {
        String s = "valueofstring";
        assertEquals(1502, valueofstring.findValue(s));
    }

    @Test
    public void case7() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(6201, valueofstring.findValue(s));
    }

    @Test
    public void case8() {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        assertEquals(11187, valueofstring.findValue(s));
    }

    @Test
    public void case9() {
        String s = "a";
        assertEquals(1, valueofstring.findValue(s));
    }

    @Test
    public void case10() {
        String s = "b";
        assertEquals(2, valueofstring.findValue(s));
    }

    @Test
    public void case11() {
        String s = "z";
        assertEquals(26, valueofstring.findValue(s));
    }

    @Test
    public void case12() {
        String s = "itwasthebestoftimesitwastheworstoftimesitwastheage";
        assertEquals(23206, valueofstring.findValue(s));
    }

    @Test
    public void case13() {
        String s = "ofwisdomitwastheageoffoolishnessitwastheepochofbel";
        assertEquals(20393, valueofstring.findValue(s));
    }

    @Test
    public void case14() {
        String s = "iefitwastheepochofincredulityitwastheseasonoflight";
        assertEquals(20660, valueofstring.findValue(s));
    }

    @Test
    public void case15() {
        String s = "itwastheseasonofdarknessitwasthespringofhopeitwast";
        assertEquals(22276, valueofstring.findValue(s));
    }

    @Test
    public void case16() {
        String s = "hewinterofdespairwehadeverythingbeforeuswehadnothi";
        assertEquals(20124, valueofstring.findValue(s));
    }

    @Test
    public void case17() {
        String s = "ngbeforeuswewereallgoingdirecttoheavenwewereallgoi";
        assertEquals(19714, valueofstring.findValue(s));
    }

    @Test
    public void case18() {
        String s = "ngdirecttheotherwayinshorttheperiodwassofarlikethe";
        assertEquals(21097, valueofstring.findValue(s));
    }

    @Test
    public void case19() {
        String s = "presentperiodthatsomeofitsnoisiestauthoritiesinsis";
        assertEquals(22556, valueofstring.findValue(s));
    }

    @Test
    public void case20() {
        String s = "tedonitsbeingreceivedforgoodorforevilinthesuperlat";
        assertEquals(20182, valueofstring.findValue(s));
    }

    @Test
    public void case21() {
        String s = "ivedegreeofcomparisononlytherewereakingwithalargej";
        assertEquals(19402, valueofstring.findValue(s));
    }

    @Test
    public void case22() {
        String s = "awandaqueenwithaplainfaceonthethroneofenglandthere";
        assertEquals(18478, valueofstring.findValue(s));
    }

    @Test
    public void case23() {
        String s = "wereakingwithalargejawandaqueenwithafairfaceonthet";
        assertEquals(18599, valueofstring.findValue(s));
    }

    @Test
    public void case24() {
        String s = "hroneoffranceinbothcountriesitwasclearerthancrysta";
        assertEquals(20826, valueofstring.findValue(s));
    }

    @Test
    public void case25() {
        String s = "ltothelordsofthestatepreservesofloavesandfishestha";
        assertEquals(21337, valueofstring.findValue(s));
    }

    @Test
    public void case26() {
        String s = "tthingsingeneralweresettledforeveritwastheyearofou";
        assertEquals(21648, valueofstring.findValue(s));
    }

    @Test
    public void case27() {
        String s = "rlordonethousandsevenhundredandseventyfivespiritua";
        assertEquals(21762, valueofstring.findValue(s));
    }

    @Test
    public void case28() {
        String s = "lrevelationswereconcededtoenglandatthatfavouredper";
        assertEquals(19759, valueofstring.findValue(s));
    }

    @Test
    public void case29() {
        String s = "iodasatthismrssouthcotthadrecentlyattainedherfivea";
        assertEquals(20915, valueofstring.findValue(s));
    }

    @Test
    public void case30() {
        String s = "ndtwentiethblessedbirthdayofwhomapropheticprivatei";
        assertEquals(20691, valueofstring.findValue(s));
    }

    @Test
    public void case31() {
        String s = "nthelifeguardshadheraldedthesublimeappearancebyann";
        assertEquals(17219, valueofstring.findValue(s));
    }

    @Test
    public void case32() {
        String s = "ouncingthatarrangementsweremadefortheswallowingupo";
        assertEquals(20876, valueofstring.findValue(s));
    }

    @Test
    public void case33() {
        String s = "flondonandwestminstereventhecocklaneghosthadbeenla";
        assertEquals(18832, valueofstring.findValue(s));
    }

    @Test
    public void case34() {
        String s = "idonlyarounddozenofyearsafterrappingoutitsmessages";
        assertEquals(21857, valueofstring.findValue(s));
    }

    @Test
    public void case35() {
        String s = "asthespiritsofthisveryyearlastpastsupernaturallyde";
        assertEquals(23665, valueofstring.findValue(s));
    }

    @Test
    public void case36() {
        String s = "ficientinoriginalityrappedouttheirsmeremessagesint";
        assertEquals(20608, valueofstring.findValue(s));
    }

    @Test
    public void case37() {
        String s = "heearthlyorderofeventshadlatelycometotheenglishcro";
        assertEquals(20200, valueofstring.findValue(s));
    }

    @Test
    public void case38() {
        String s = "wnandpeoplefromacongressofbritishsubjectsinamerica";
        assertEquals(19529, valueofstring.findValue(s));
    }

    @Test
    public void case39() {
        String s = "whichstrangetorelatehaveprovedmoreimportanttothehu";
        assertEquals(21637, valueofstring.findValue(s));
    }

    @Test
    public void case40() {
        String s = "manracethananycommunicationsyetreceivedthroughanyo";
        assertEquals(20784, valueofstring.findValue(s));
    }

    @Test
    public void case41() {
        String s = "fthechickensofthecocklanebroodfrancelessfavouredon";
        assertEquals(18065, valueofstring.findValue(s));
    }

    @Test
    public void case42() {
        String s = "thewholeastomattersspiritualthanhersisteroftheshie";
        assertEquals(22046, valueofstring.findValue(s));
    }

    @Test
    public void case43() {
        String s = "ldandtridentrolledwithexceedingsmoothnessdownhillm";
        assertEquals(20087, valueofstring.findValue(s));
    }

    @Test
    public void case44() {
        String s = "akingpapermoneyandspendingitundertheguidanceofherc";
        assertEquals(18436, valueofstring.findValue(s));
    }

    @Test
    public void case45() {
        String s = "hristianpastorssheentertainedherselfbesideswithsuc";
        assertEquals(21060, valueofstring.findValue(s));
    }

    @Test
    public void case46() {
        String s = "hhumaneachievementsassentencingayouthtohavehishand";
        assertEquals(19772, valueofstring.findValue(s));
    }

    @Test
    public void case47() {
        String s = "scutoffhistonguetornoutwithpincersandhisbodyburned";
        assertEquals(22042, valueofstring.findValue(s));
    }

    @Test
    public void case48() {
        String s = "alivebecausehehadnotkneeleddownintheraintodohonour";
        assertEquals(19050, valueofstring.findValue(s));
    }

    @Test
    public void case49() {
        String s = "toadirtyprocessionofmonkswhichpassedwithinhisviewa";
        assertEquals(21791, valueofstring.findValue(s));
    }

    @Test
    public void case50() {
        String s = "tadistanceofsomefiftyorsixtyyardsitislikelyenought";
        assertEquals(22741, valueofstring.findValue(s));
    }

    @Test
    public void case51() {
        String s = "hatrootedinthewoodsoffranceandnorwaythereweregrowi";
        assertEquals(21439, valueofstring.findValue(s));
    }

    @Test
    public void case52() {
        String s = "ngtreeswhenthatsuffererwasputtodeathalreadymarkedb";
        assertEquals(20890, valueofstring.findValue(s));
    }

    @Test
    public void case53() {
        String s = "ythewoodmanfatetocomedownandbesawnintoboardstomake";
        assertEquals(20584, valueofstring.findValue(s));
    }

    @Test
    public void case54() {
        String s = "acertainmovableframeworkwithasackandaknifeinitterr";
        assertEquals(18995, valueofstring.findValue(s));
    }

    @Test
    public void case55() {
        String s = "ibleinhistoryitislikelyenoughthatintheroughouthous";
        assertEquals(22263, valueofstring.findValue(s));
    }

    @Test
    public void case56() {
        String s = "esofsometillersoftheheavylandsadjacenttoparisthere";
        assertEquals(20162, valueofstring.findValue(s));
    }

    @Test
    public void case57() {
        String s = "wereshelteredfromtheweatherthatverydayrudecartsbes";
        assertEquals(21782, valueofstring.findValue(s));
    }

    @Test
    public void case58() {
        String s = "patteredwithrusticmiresnuffedaboutbypigsandroosted";
        assertEquals(21514, valueofstring.findValue(s));
    }

    @Test
    public void case59() {
        String s = "inbypoultrywhichthefarmerdeathhadalreadysetapartto";
        assertEquals(20901, valueofstring.findValue(s));
    }

    @Test
    public void case60() {
        String s = "behistumbrilsoftherevolutionbutthatwoodmanandthatf";
        assertEquals(21592, valueofstring.findValue(s));
    }

    @Test
    public void case61() {
        String s = "armerthoughtheyworkunceasinglyworksilentlyandnoone";
        assertEquals(22258, valueofstring.findValue(s));
    }

    @Test
    public void case62() {
        String s = "heardthemastheywentaboutwithmuffledtreadtheratherf";
        assertEquals(20679, valueofstring.findValue(s));
    }

    @Test
    public void case63() {
        String s = "orasmuchastoentertainanysuspicionthattheywereawake";
        assertEquals(22095, valueofstring.findValue(s));
    }

    @Test
    public void case64() {
        String s = "aaabbc";
        assertEquals(47, valueofstring.findValue(s));
    }

    @Test
    public void case65() {
        String s = "y";
        assertEquals(25, valueofstring.findValue(s));
    }

    @Test
    public void case66() {
        String s = "abcabc";
        assertEquals(56, valueofstring.findValue(s));
    }

    @Test
    public void case67() {
        String s = "mmm";
        assertEquals(117, valueofstring.findValue(s));
    }

    @Test
    public void case68() {
        String s = "mamzmmwijfqpoaiponqoerjq";
        assertEquals(5033, valueofstring.findValue(s));
    }

    @Test
    public void case69() {
        String s = "jfjjfjjjjfjjfjfjjfjjjfjfj";
        assertEquals(4634, valueofstring.findValue(s));
    }

    @Test
    public void case70() {
        String s = "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
        assertEquals(57500, valueofstring.findValue(s));
    }

    @Test
    public void case71() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals(1225, valueofstring.findValue(s));
    }

    @Test
    public void case72() {
        String s = "abc";
        assertEquals(14, valueofstring.findValue(s));
    }

    @Test
    public void case73() {
        String s = "bbbcccdddaaazzz";
        assertEquals(1440, valueofstring.findValue(s));
    }

    @Test
    public void case74() {
        String s = "acdgknz";
        assertEquals(368, valueofstring.findValue(s));
    }

}
