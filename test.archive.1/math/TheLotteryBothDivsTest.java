package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheLotteryBothDivsTest {
    double DELTA = 1.0e-09;
    TheLotteryBothDivs thelotterybothdivs = new TheLotteryBothDivs();

    @Test
    public void case1() {
        String[] goodSuffixes = { "4" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case2() {
        String[] goodSuffixes = { "4", "7" };
        assertEquals(0.2, thelotterybothdivs.find(goodSuffixes), DELTA * 0.2);
    }

    @Test
    public void case3() {
        String[] goodSuffixes = { "47", "47" };
        assertEquals(0.01, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01);
    }

    @Test
    public void case4() {
        String[] goodSuffixes = { "47", "58", "4747", "502" };
        assertEquals(0.021, thelotterybothdivs.find(goodSuffixes), DELTA * 0.021);
    }

    @Test
    public void case5() {
        String[] goodSuffixes = { "000000000" };
        assertEquals(1.0e-09, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0e-09);
    }

    @Test
    public void case6() {
        String[] goodSuffixes = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        assertEquals(1.0, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0);
    }

    @Test
    public void case7() {
        String[] goodSuffixes = { "8542861", "1954", "6", "523", "000000000", "5426", "8" };
        assertEquals(0.201100101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.201100101);
    }

    @Test
    public void case8() {
        String[] goodSuffixes = { "612829", "752829", "981832829", "413", "51829", "3829", "62385829", "747829", "8960", "914383829", "6749829", "730829", "696829", "91392829", "50458829", "459829", "351829", "4005", "829", "307", "64", "64829", "35829", "0883", "0859829", "501711829", "81829", "13829", "743829", "94829", "244829", "4370829", "46757829", "829", "62810", "700829", "462039829", "93082829", "2071829", "37588", "356829", "837612829", "5670829", "478829", "856443829", "4829", "2829", "829", "10829", "768475829" };
        assertEquals(0.01332, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01332);
    }

    @Test
    public void case9() {
        String[] goodSuffixes = { "99555", "76", "259775455", "84455", "26", "455", "6055", "3", "8", "3", "1", "55", "17398755", "6155", "60455", "47", "8", "55", "050146755", "6269355", "37", "55", "7", "155", "443494955", "9", "5435455", "88169055", "434955", "8714155", "0111255", "7", "859155", "5266755", "16755", "5", "93", "4555", "77", "17655", "305755", "1", "55", "441046055", "555", "2", "040635555", "45", "55", "255" };
        assertEquals(0.72, thelotterybothdivs.find(goodSuffixes), DELTA * 0.72);
    }

    @Test
    public void case10() {
        String[] goodSuffixes = { "212", "397321", "537444", "981", "7322187", "48882187", "2187", "041591", "52187", "1449", "32633", "2187", "846", "577", "16597", "983", "06034", "082187", "9854", "980941", "466005", "6007", "586", "8753", "2902187", "2388", "18100", "58200", "8136", "53645", "32187", "236", "2187", "6011", "931", "10902", "354", "71115", "910925", "1657", "2187", "322443", "76352187", "93", "252187", "68141", "11", "24050", "697508", "7526" };
        assertEquals(0.030008, thelotterybothdivs.find(goodSuffixes), DELTA * 0.030008);
    }

    @Test
    public void case11() {
        String[] goodSuffixes = { "44742080", "44742080", "844742080", "8758355", "444742080", "302975431", "544742080", "088460", "44742080", "244742080", "044742080", "044742080", "44742080", "0908211", "944742080", "44742080", "744742080", "44742080", "844742080", "744742080", "244742080", "844742080", "744742080", "44742080", "44742080", "374781", "18851731", "644742080", "44742080", "44742080", "81292918", "44742080", "44742080", "44742080", "430530161", "844742080", "44742080", "644742080", "44742080", "285978596", "44742080", "944742080", "496648035", "644742080", "44742080", "521215", "915806253", "644742080", "244742080", "44742080" };
        assertEquals(3.235e-06, thelotterybothdivs.find(goodSuffixes), DELTA * 3.235e-06);
    }

    @Test
    public void case12() {
        String[] goodSuffixes = { "6712752", "6089", "79", "565", "65", "52697", "082752", "700294", "707349", "2752", "62752", "80647", "2442752", "6104820", "59442752", "2752", "4232", "771", "631254", "658272752", "352", "662752", "82752", "566302752", "2752", "594482752", "979", "11262752", "52", "12752", "14", "4776", "112752", "42752", "90565", "1362662", "3902777", "5912298", "725852752", "4308", "2892752", "92752", "81", "112", "46102", "7146406", "79", "3008032", "957667", "1105150" };
        assertEquals(0.0524347, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0524347);
    }

    @Test
    public void case13() {
        String[] goodSuffixes = { "85950", "81770", "95677", "34091", "3155374", "92300", "39835", "96782", "155374", "13315", "54870", "355374", "08558", "33291", "86185", "09820", "70970", "56499", "05800", "76855374", "19314", "70178", "74063", "86198", "93203", "10492", "10489", "92943", "23322", "46518", "83646", "94326", "78541", "88482", "34202", "55374", "49405", "16052", "67324", "90326", "075355374", "90650", "47264", "68833", "44444", "12464", "04026", "95956", "90941", "5355374" };
        assertEquals(0.00044, thelotterybothdivs.find(goodSuffixes), DELTA * 0.00044);
    }

    @Test
    public void case14() {
        String[] goodSuffixes = { "7987", "959687", "82487", "68", "87", "32055387", "864937187", "1296987", "587", "4715187", "221582587", "7752287", "387", "687", "87", "787", "287", "166687", "2987", "8797587", "9787", "20818887", "7787", "16787", "88186187", "4335787", "5288387", "587", "89787", "987", "20687", "622887", "56787", "171455587", "4", "62187", "74887", "2763487", "451794587", "87", "17", "9987", "48221987", "587", "87", "87", "174287", "1", "87", "45024887" };
        assertEquals(0.23, thelotterybothdivs.find(goodSuffixes), DELTA * 0.23);
    }

    @Test
    public void case15() {
        String[] goodSuffixes = { "112", "23554", "733698", "59253698", "02193698", "43698", "3698", "517463698", "63698", "4433", "1213698", "23698", "013698", "3698", "8724", "5513698", "05743698", "156687", "5", "1", "624315", "3698", "983583698", "1", "2613698", "3698", "2396", "49640", "955073698", "95973698", "67344", "7383698", "3698", "3698", "645093698", "0893698", "873698", "53698", "3698", "803698", "1203698", "6633698", "77033698", "892463698", "54216", "8", "7", "82663698", "40033698", "570253698" };
        assertEquals(0.40134, thelotterybothdivs.find(goodSuffixes), DELTA * 0.40134);
    }

    @Test
    public void case16() {
        String[] goodSuffixes = { "7127902", "3391099", "77", "0649", "9107902", "7324317", "82457802", "7202", "57102", "42059", "5594617", "088007", "3997", "3538", "02", "682602", "70", "989102", "379927", "02", "751802", "502", "16", "6702", "1802", "36363", "9996102", "402", "800662902", "05375", "02", "802194702", "1507202", "764442302", "802", "55997", "2141494", "90192402", "26180002", "59602", "402", "02", "02", "7770", "46380", "52891", "1484502", "16102", "849361202", "79702" };
        assertEquals(0.0403624, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0403624);
    }

    @Test
    public void case17() {
        String[] goodSuffixes = { "2", "2", "21", "523589311", "0", "073", "49929311", "636", "5542", "461", "359", "31269311", "23", "2", "559", "657", "17239311", "2977", "217", "41", "8", "967", "0390", "788", "858319311", "54", "6", "602", "31", "5263", "0", "9311", "493", "399311", "0831", "406", "1", "29649311", "3", "22", "519311", "0", "5605", "45", "6803", "79", "088", "81", "049", "5442" };
        assertEquals(0.6362, thelotterybothdivs.find(goodSuffixes), DELTA * 0.6362);
    }

    @Test
    public void case18() {
        String[] goodSuffixes = { "91443519", "91443519", "91443519", "91443519", "391443519", "66583", "91443519", "991443519", "691443519", "97858", "191443519", "491443519", "2915848", "91443519", "091443519", "34454957", "691443519", "91443519", "191443519", "91443519", "91443519", "91443519", "91443519", "291443519", "091443519", "391443519", "52662227", "91443519", "891443519", "860986", "391443519", "91443519", "391443519", "4645566", "91443519", "91443519", "91443519", "091443519", "591443519", "91443519", "91443519", "91443519", "91443519", "591443519", "591443519", "491443519", "4634654", "291443519", "8874169", "91443519" };
        assertEquals(2.143e-05, thelotterybothdivs.find(goodSuffixes), DELTA * 2.143e-05);
    }

    @Test
    public void case19() {
        String[] goodSuffixes = { "627073", "328692", "7453908", "873107", "817740", "366773276", "0083583", "816482", "983624", "553840", "653416", "818976", "26773276", "785171", "268129", "9985072", "664267", "276773276", "976653", "590231", "7308021", "537447", "76773276", "6773276", "716773276", "8173368", "6815935", "766382", "2913257", "8410148", "744443", "173729", "2706486", "042743", "0565496", "107324", "1878681", "298988", "214462", "7176486", "560114", "3519760", "6773276", "554160", "9251235", "438971", "302661", "557751", "359113", "000804" };
        assertEquals(3.05e-05, thelotterybothdivs.find(goodSuffixes), DELTA * 3.05e-05);
    }

    @Test
    public void case20() {
        String[] goodSuffixes = { "480252399", "80252399", "0405", "480252399", "80252399", "780252399", "780252399", "480252399", "80252399", "90589061", "80252399", "80252399", "699039994", "80252399", "80252399", "80252399", "23036", "880252399", "980252399", "80252399", "580252399", "80252399", "180252399", "980252399", "480252399", "7290236", "80252399", "80252399", "480252399", "580252399", "80252399", "80252399", "80252399", "080252399", "80252399", "580252399", "80252399", "480252399", "80252399", "61848", "80252399", "4217", "448728", "780252399", "742578", "80252399", "80252399", "480252399", "980252399", "144511" };
        assertEquals(0.000223121, thelotterybothdivs.find(goodSuffixes), DELTA * 0.000223121);
    }

    @Test
    public void case21() {
        String[] goodSuffixes = { "697349230", "39230", "69230", "9230", "9230", "2279230", "313679230", "7509230", "249230", "649230", "06379230", "79230", "661529230", "49230", "3259230", "9", "67239230", "109230", "9230", "87", "9230", "19230", "639230", "6989230", "129230", "9230", "486209230", "19230", "579230", "5339230", "39479230", "41109230", "20939230", "949230", "849230", "979139230", "649230", "9230", "479230", "2289230", "999230", "9230", "19230", "9230", "029939230", "4010", "549230", "89230", "809230", "989230" };
        assertEquals(0.1102, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1102);
    }

    @Test
    public void case22() {
        String[] goodSuffixes = { "2217991", "952217991", "182217991", "32217991", "9788494", "742217991", "5903011", "2650705", "622217991", "9502820", "2240741", "9016177", "412217991", "12217991", "52217991", "12217991", "5929254", "8412799", "02217991", "2217991", "8632601", "62217991", "3514904", "8870450", "602217991", "4147181", "2217991", "2217991", "2217991", "3844585", "92217991", "0112075", "2217991", "2217991", "02217991", "32217991", "792217991", "4012543", "1540934", "2217991", "12217991", "7736286", "42217991", "22217991", "2217991", "02217991", "2217991", "112217991", "102217991", "0104422" };
        assertEquals(1.9e-06, thelotterybothdivs.find(goodSuffixes), DELTA * 1.9e-06);
    }

    @Test
    public void case23() {
        String[] goodSuffixes = { "451", "67346433", "209", "36433", "646", "072", "970", "759", "405098433", "77797433", "894433", "480591433", "49433", "48392433", "4433", "664", "86433", "101", "0740433", "433", "585433", "009", "7146433", "043994433", "669", "988", "433", "3433", "433", "42433", "992", "576433", "391", "488", "433", "997433", "6396433", "307", "695", "18433", "945386433", "1433", "204", "857", "712", "035", "096576433", "1433", "252433", "338" };
        assertEquals(0.022, thelotterybothdivs.find(goodSuffixes), DELTA * 0.022);
    }

    @Test
    public void case24() {
        String[] goodSuffixes = { "6042720", "3042720", "94042720", "062042720", "413042720", "7042720", "29042720", "9808", "8042720", "3042720", "392042720", "042720", "3042720", "5042720", "0042720", "042720", "9042720", "00042720", "3042720", "3042720", "042720", "042720", "8042720", "7042720", "042720", "2331", "64042720", "8042720", "03042720", "368042720", "592042720", "47042720", "71042720", "41042720", "042720", "16042720", "20042720", "4042720", "74042720", "65042720", "042720", "3042720", "88042720", "82326", "86042720", "042720", "2042720", "52042720", "2042720", "0042720" };
        assertEquals(0.000211, thelotterybothdivs.find(goodSuffixes), DELTA * 0.000211);
    }

    @Test
    public void case25() {
        String[] goodSuffixes = { "59987091", "0380445", "7286125", "73541047", "707286125", "3152010", "07286125", "087286125", "7286125", "497286125", "4035074", "7286125", "607286125", "5684974", "91306689", "7286125", "7286125", "3604383", "23021034", "31053763", "78441251", "037286125", "77286125", "4168226", "47286125", "72589434", "85804148", "1657062", "37286125", "9588059", "67286125", "7286125", "0811034", "93607109", "307286125", "1911797", "2609189", "57286125", "57286125", "7286125", "7286125", "227286125", "7286125", "447286125", "057286125", "7286125", "07286125", "1905824", "9700281", "07286125" };
        assertEquals(1.49e-06, thelotterybothdivs.find(goodSuffixes), DELTA * 1.49e-06);
    }

    @Test
    public void case26() {
        String[] goodSuffixes = { "5915184", "93177584", "553884", "2366184", "51", "9865384", "38284", "53", "11", "84", "21735384", "84", "84", "286684", "98984", "782984", "74", "6343884", "6671684", "04052884", "97484", "08083084", "01", "627284", "51984", "984", "79384", "8184", "895947684", "88184", "684", "684", "4984", "78", "22", "05754584", "3284", "371384", "01", "9356984", "8284", "444284", "10835784", "042392884", "0484", "84", "2071684", "84", "632684", "61484" };
        assertEquals(0.08, thelotterybothdivs.find(goodSuffixes), DELTA * 0.08);
    }

    @Test
    public void case27() {
        String[] goodSuffixes = { "65957749", "0", "70", "49", "4907749", "45949", "91", "6071049", "8", "6349", "2449149", "149", "49", "049", "5949", "06", "6", "47", "2149", "80983249", "49", "449497149", "2", "40149", "8549", "49", "812233149", "9", "49", "5549", "49", "53", "5349", "524271749", "9041149", "49", "24314749", "22", "29618849", "5149", "5", "0749", "270512849", "69", "6", "177436949", "49", "10249", "0", "00949" };
        assertEquals(0.63, thelotterybothdivs.find(goodSuffixes), DELTA * 0.63);
    }

    @Test
    public void case28() {
        String[] goodSuffixes = { "60482", "82", "212", "17552", "232", "72", "42", "772632", "74172", "14972", "92", "12", "931412", "11451182", "42", "90380372", "440322", "6927272", "46710642", "9652", "370562", "3958642", "583011892", "8122", "63827262", "832", "555402", "6392762", "720272", "8231652", "098503022", "32", "455362", "752", "2572", "9442", "980122", "70436672", "798762", "09612", "1692", "47372", "0586942", "0457852", "2", "8692", "478172", "772", "94622", "37823542" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case29() {
        String[] goodSuffixes = { "645048595", "048595", "4048595", "51048595", "048595", "500048595", "514048595", "048595", "048595", "048595", "252048595", "048595", "048595", "744048595", "048595", "963048595", "841048595", "048595", "048595", "0048595", "048595", "3048595", "048595", "9048595", "1048595", "048595", "048595", "338048595", "62048595", "6048595", "1048595", "048595", "493048595", "629048595", "40048595", "169048595", "048595", "50048595", "679048595", "95048595", "048595", "6048595", "048595", "261048595", "048595", "5048595", "71048595", "18048595", "5048595", "8048595" };
        assertEquals(1.0e-06, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0e-06);
    }

    @Test
    public void case30() {
        String[] goodSuffixes = { "45", "61875", "01732175", "7655", "945", "45", "7299585", "98945", "335", "62260795", "875", "600249155", "6", "5", "6", "00554555", "57895", "25", "84015", "7895", "5", "5", "2943605", "25", "795", "5531035", "4", "025", "4858445", "502073225", "4", "8", "5975", "7", "5", "55", "4", "5", "835", "10167115", "925", "5375", "445", "5", "75", "8456105", "704215", "65", "186265", "043185295" };
        assertEquals(0.5, thelotterybothdivs.find(goodSuffixes), DELTA * 0.5);
    }

    @Test
    public void case31() {
        String[] goodSuffixes = { "224742001", "637408420", "637408420", "637408420", "503159138", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "267666558", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "479889935", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "238675896", "949787040", "637408420", "637408420", "637408420", "773405091", "637408420", "637408420", "637408420", "874001187", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420", "637408420" };
        assertEquals(9.0e-09, thelotterybothdivs.find(goodSuffixes), DELTA * 9.0e-09);
    }

    @Test
    public void case32() {
        String[] goodSuffixes = { "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939", "207387939" };
        assertEquals(1.0e-09, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0e-09);
    }

    @Test
    public void case33() {
        String[] goodSuffixes = { "5", "5", "2", "9", "7", "6", "6", "6", "7", "7", "8", "5", "5", "0", "3", "6", "7", "4", "8", "1", "6", "1", "3", "1", "0", "4", "4", "3", "1", "1", "5", "8", "7", "5", "3", "7", "0", "4", "3", "2", "6", "8", "6", "1", "3", "8", "1", "4", "5", "3" };
        assertEquals(1.0, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0);
    }

    @Test
    public void case34() {
        String[] goodSuffixes = { "4914434", "292792", "39982", "663", "18750", "7754", "9877", "50", "057243", "495441", "16716049", "98702", "112784", "58614", "4258", "71410173", "4", "046075", "7179", "1", "4", "643", "19376377", "503157", "5208816", "20859144", "9", "40635506", "34", "357910892", "3869", "49259", "1", "26678554", "9953626", "93353", "7726312", "64816837", "564820588", "0251301", "176", "069", "45", "8", "68", "816907", "35", "8578", "050146703", "7226" };
        assertEquals(0.433235342, thelotterybothdivs.find(goodSuffixes), DELTA * 0.433235342);
    }

    @Test
    public void case35() {
        String[] goodSuffixes = { "854536313", "763537320", "215957861", "601132244", "488893430", "732123669", "025200853", "467292541", "478149664", "659735439", "070382615", "754315212", "162183808", "652183657", "408004383", "591580625", "629642148", "412946718", "609394088", "541449981", "053016137", "086089714", "803518851", "597859643", "737320641", "899934756", "808846028", "343263398", "750868141", "156292900", "760199602", "892648009", "423263125", "844118915", "158129291", "656777815", "420027529", "660250186", "324050586", "420803029", "166122096", "446302152", "731875835", "056579771", "009001918", "618995447", "634514155", "309082119", "983577060", "497911243" };
        assertEquals(5.0e-08, thelotterybothdivs.find(goodSuffixes), DELTA * 5.0e-08);
    }

    @Test
    public void case36() {
        String[] goodSuffixes = { "2", "852111", "1", "2" };
        assertEquals(0.2, thelotterybothdivs.find(goodSuffixes), DELTA * 0.2);
    }

    @Test
    public void case37() {
        String[] goodSuffixes = { "9", "7", "6", "02", "81", "2" };
        assertEquals(0.41, thelotterybothdivs.find(goodSuffixes), DELTA * 0.41);
    }

    @Test
    public void case38() {
        String[] goodSuffixes = { "4", "6", "4", "4", "4", "4", "4", "4", "3", "2", "4", "4", "4", "4", "5", "4", "1", "4", "4", "4", "4", "1", "4", "4", "4", "5" };
        assertEquals(0.6, thelotterybothdivs.find(goodSuffixes), DELTA * 0.6);
    }

    @Test
    public void case39() {
        String[] goodSuffixes = { "996", "358", "300", "178", "993", "734", "422", "6178", "990", "418", "614", "836", "608" };
        assertEquals(0.012, thelotterybothdivs.find(goodSuffixes), DELTA * 0.012);
    }

    @Test
    public void case40() {
        String[] goodSuffixes = { "24", "17", "16", "30", "3117", "10", "69", "17", "27417", "17", "15", "54", "53", "17", "95", "60", "27", "74" };
        assertEquals(0.13, thelotterybothdivs.find(goodSuffixes), DELTA * 0.13);
    }

    @Test
    public void case41() {
        String[] goodSuffixes = { "0", "3", "9", "1", "6", "4", "8", "6", "6", "4", "4", "4", "9", "4", "3", "4", "1", "6", "9", "3", "9", "4", "2", "8", "9", "1", "9", "1", "4", "1", "5", "4", "4", "9", "2", "1", "9", "2", "4", "4", "3" };
        assertEquals(0.9, thelotterybothdivs.find(goodSuffixes), DELTA * 0.9);
    }

    @Test
    public void case42() {
        String[] goodSuffixes = { "859", "324", "595", "907", "613", "5929", "932", "402", "174929", "439", "500", "9929", "929", "039", "667", "929", "929", "929", "929", "541", "98929", "678", "032", "382929", "929", "387", "22929", "531", "175" };
        assertEquals(0.018, thelotterybothdivs.find(goodSuffixes), DELTA * 0.018);
    }

    @Test
    public void case43() {
        String[] goodSuffixes = { "77", "4", "64", "778617", "1497517", "59416617", "5117", "17", "07517", "57227717", "682", "522", "50", "9", "218117", "24", "43357317", "9317", "517917" };
        assertEquals(0.232, thelotterybothdivs.find(goodSuffixes), DELTA * 0.232);
    }

    @Test
    public void case44() {
        String[] goodSuffixes = { "75888", "156", "186", "15145", "4998", "05117", "75888", "53462", "275888", "598", "28956", "575888", "651", "0292", "190", "8646", "285", "610", "1947", "793", "23205", "075888", "9775", "0548", "82596", "9382", "75888", "6320", "575888", "575888", "8946", "75888", "71455", "52215", "75888", "959", "5464", "475888", "77748" };
        assertEquals(0.0101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0101);
    }

    @Test
    public void case45() {
        String[] goodSuffixes = { "1", "1", "2", "2", "2", "0", "2", "7", "2", "0", "3", "5", "7", "9", "2", "0", "5", "7", "8", "7", "8", "0", "2", "0", "4", "7", "4", "2", "2", "4", "2", "2" };
        assertEquals(0.9, thelotterybothdivs.find(goodSuffixes), DELTA * 0.9);
    }

    @Test
    public void case46() {
        String[] goodSuffixes = { "0" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case47() {
        String[] goodSuffixes = { "859258807" };
        assertEquals(1.0e-09, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0e-09);
    }

    @Test
    public void case48() {
        String[] goodSuffixes = { "04", "30", "08", "01", "40", "48", "03", "02", "12", "28", "43", "06", "46", "17", "18", "25", "45", "16", "14", "44", "31", "22", "33", "21", "47", "20", "49", "36", "27", "41", "00", "13", "10", "37", "11", "34", "07", "24", "26", "29", "32", "19", "15", "05", "09", "23", "39", "38", "42", "35" };
        assertEquals(0.5, thelotterybothdivs.find(goodSuffixes), DELTA * 0.5);
    }

    @Test
    public void case49() {
        String[] goodSuffixes = { "89999", "49", "49999", "099", "6", "899", "79", "299", "8", "1", "09999", "69999", "2999", "29999", "99999", "7999", "19999", "29", "79999", "0999", "499", "599", "4999", "89", "4", "799", "699", "09", "1999", "199", "5", "7", "399", "69", "0", "5999", "8999", "6999", "59", "3", "19", "2", "59999", "39999", "3999", "39" };
        assertEquals(1.0, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0);
    }

    @Test
    public void case50() {
        String[] goodSuffixes = { "8542861", "1954", "6", "523", "000000000", "5426", "8" };
        assertEquals(0.201100101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.201100101);
    }

    @Test
    public void case51() {
        String[] goodSuffixes = { "2", "32", "42" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case52() {
        String[] goodSuffixes = { "123", "23", "3" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case53() {
        String[] goodSuffixes = { "4747", "47", "47474747", "0000", "4747" };
        assertEquals(0.0101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0101);
    }

    @Test
    public void case54() {
        String[] goodSuffixes = { "75", "0", "275", "40275", "43275", "343275", "40275", "50050050", "5005" };
        assertEquals(0.1101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1101);
    }

    @Test
    public void case55() {
        String[] goodSuffixes = { "1", "2", "1", "47" };
        assertEquals(0.21, thelotterybothdivs.find(goodSuffixes), DELTA * 0.21);
    }

    @Test
    public void case56() {
        String[] goodSuffixes = { "4747", "47" };
        assertEquals(0.01, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01);
    }

    @Test
    public void case57() {
        String[] goodSuffixes = { "1", "11" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case58() {
        String[] goodSuffixes = { "47", "58", "4747", "502" };
        assertEquals(0.021, thelotterybothdivs.find(goodSuffixes), DELTA * 0.021);
    }

    @Test
    public void case59() {
        String[] goodSuffixes = { "0", "010", "0002", "00", "000", "0", "011" };
        assertEquals(0.1011, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1011);
    }

    @Test
    public void case60() {
        String[] goodSuffixes = { "4", "44", "444", "4444", "44444", "444444", "4444444", "44444444", "444444444" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case61() {
        String[] goodSuffixes = { "0122" };
        assertEquals(0.0001, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0001);
    }

    @Test
    public void case62() {
        String[] goodSuffixes = { "211", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        assertEquals(1.0, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0);
    }

    @Test
    public void case63() {
        String[] goodSuffixes = { "1", "11", "111", "11", "1" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case64() {
        String[] goodSuffixes = { "1", "222", "243", "3243", "44243", "133243" };
        assertEquals(0.102, thelotterybothdivs.find(goodSuffixes), DELTA * 0.102);
    }

    @Test
    public void case65() {
        String[] goodSuffixes = { "1", "11", "111", "1111", "11111", "111111", "11111111", "1111111", "111111111", "11111", "111111", "111" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case66() {
        String[] goodSuffixes = { "436", "65464", "645645", "6456", "64564", "64564", "645645", "76575" };
        assertEquals(0.001131, thelotterybothdivs.find(goodSuffixes), DELTA * 0.001131);
    }

    @Test
    public void case67() {
        String[] goodSuffixes = { "99", "9", "999" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case68() {
        String[] goodSuffixes = { "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111" };
        assertEquals(0.001, thelotterybothdivs.find(goodSuffixes), DELTA * 0.001);
    }

    @Test
    public void case69() {
        String[] goodSuffixes = { "1121", "11" };
        assertEquals(0.0101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0101);
    }

    @Test
    public void case70() {
        String[] goodSuffixes = { "1", "1" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case71() {
        String[] goodSuffixes = { "0001" };
        assertEquals(0.0001, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0001);
    }

    @Test
    public void case72() {
        String[] goodSuffixes = { "23", "24", "323" };
        assertEquals(0.02, thelotterybothdivs.find(goodSuffixes), DELTA * 0.02);
    }

    @Test
    public void case73() {
        String[] goodSuffixes = { "1", "2", "1" };
        assertEquals(0.2, thelotterybothdivs.find(goodSuffixes), DELTA * 0.2);
    }

    @Test
    public void case74() {
        String[] goodSuffixes = { "4", "74", "674", "8674" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case75() {
        String[] goodSuffixes = { "84", "4" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case76() {
        String[] goodSuffixes = { "012", "112", "212", "312", "12" };
        assertEquals(0.01, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01);
    }

    @Test
    public void case77() {
        String[] goodSuffixes = { "4", "44", "444", "4444" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case78() {
        String[] goodSuffixes = { "1234", "23" };
        assertEquals(0.0101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0101);
    }

    @Test
    public void case79() {
        String[] goodSuffixes = { "47", "4747", "47" };
        assertEquals(0.01, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01);
    }

    @Test
    public void case80() {
        String[] goodSuffixes = { "4", "14", "14" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case81() {
        String[] goodSuffixes = { "47", "5458", "5447", "58", "4747", "502", "47", "58" };
        assertEquals(0.021, thelotterybothdivs.find(goodSuffixes), DELTA * 0.021);
    }

    @Test
    public void case82() {
        String[] goodSuffixes = { "7", "47" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case83() {
        String[] goodSuffixes = { "47", "27", "37" };
        assertEquals(0.03, thelotterybothdivs.find(goodSuffixes), DELTA * 0.03);
    }

    @Test
    public void case84() {
        String[] goodSuffixes = { "1", "21", "31", "41", "51", "61", "71", "81", "91", "12", "13", "14", "15" };
        assertEquals(0.14, thelotterybothdivs.find(goodSuffixes), DELTA * 0.14);
    }

    @Test
    public void case85() {
        String[] goodSuffixes = { "1", "1", "1", "11", "111", "21", "2543", "24357", "137", "2627", "256", "2456", "25", "256", "2", "23", "2", "1", "1", "34", "1", "123", "32", "32", "32", "12", "341", "123", "432", "23", "23", "23", "42", "1234", "1455555", "145555555", "14555", "14555", "123", "123", "1234", "452", "14555555", "256666666" };
        assertEquals(0.232320112, thelotterybothdivs.find(goodSuffixes), DELTA * 0.232320112);
    }

    @Test
    public void case86() {
        String[] goodSuffixes = { "8542861", "1954", "6", "523", "000000000", "5426", "8", "881954", "01010101", "111000", "666", "195" };
        assertEquals(0.202101111, thelotterybothdivs.find(goodSuffixes), DELTA * 0.202101111);
    }

    @Test
    public void case87() {
        String[] goodSuffixes = { "111", "1" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case88() {
        String[] goodSuffixes = { "0", "00", "000", "0000" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case89() {
        String[] goodSuffixes = { "111111111" };
        assertEquals(1.0e-09, thelotterybothdivs.find(goodSuffixes), DELTA * 1.0e-09);
    }

    @Test
    public void case90() {
        String[] goodSuffixes = { "123455", "223455", "323455", "123455", "2355", "1545", "748678" };
        assertEquals(0.000204, thelotterybothdivs.find(goodSuffixes), DELTA * 0.000204);
    }

    @Test
    public void case91() {
        String[] goodSuffixes = { "05", "5" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case92() {
        String[] goodSuffixes = { "70000", "0" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case93() {
        String[] goodSuffixes = { "26", "6" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case94() {
        String[] goodSuffixes = { "7", "177", "277" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case95() {
        String[] goodSuffixes = { "6477", "5478", "477", "77", "7" };
        assertEquals(0.1001, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1001);
    }

    @Test
    public void case96() {
        String[] goodSuffixes = { "21", "1" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case97() {
        String[] goodSuffixes = { "05" };
        assertEquals(0.01, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01);
    }

    @Test
    public void case98() {
        String[] goodSuffixes = { "0", "00", "000" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case99() {
        String[] goodSuffixes = { "8542861", "1954", "523", "000000000", "5426", "6", "8" };
        assertEquals(0.201100101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.201100101);
    }

    @Test
    public void case100() {
        String[] goodSuffixes = { "88", "8" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case101() {
        String[] goodSuffixes = { "2", "20", "200", "2000", "02", "03", "002", "034", "03", "09", "009" };
        assertEquals(0.1321, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1321);
    }

    @Test
    public void case102() {
        String[] goodSuffixes = { "0" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case103() {
        String[] goodSuffixes = { "0000", "000", "00", "0", "00", "000", "0000", "00000", "0000001" };
        assertEquals(0.1000001, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1000001);
    }

    @Test
    public void case104() {
        String[] goodSuffixes = { "4563", "56" };
        assertEquals(0.0101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.0101);
    }

    @Test
    public void case105() {
        String[] goodSuffixes = { "5", "55", "555", "5555" };
        assertEquals(0.1, thelotterybothdivs.find(goodSuffixes), DELTA * 0.1);
    }

    @Test
    public void case106() {
        String[] goodSuffixes = { "3", "343", "3437", "34378" };
        assertEquals(0.10011, thelotterybothdivs.find(goodSuffixes), DELTA * 0.10011);
    }

    @Test
    public void case107() {
        String[] goodSuffixes = { "347", "47", "247" };
        assertEquals(0.01, thelotterybothdivs.find(goodSuffixes), DELTA * 0.01);
    }

    @Test
    public void case108() {
        String[] goodSuffixes = { "47", "58", "4729", "502", "58999", "589" };
        assertEquals(0.02211, thelotterybothdivs.find(goodSuffixes), DELTA * 0.02211);
    }

    @Test
    public void case109() {
        String[] goodSuffixes = { "1", "22", "32", "42", "52", "62", "11111111" };
        assertEquals(0.15, thelotterybothdivs.find(goodSuffixes), DELTA * 0.15);
    }

    @Test
    public void case110() {
        String[] goodSuffixes = { "36", "436", "536", "7636", "51", "61", "71", "812", "912", "34", "35", "9" };
        assertEquals(0.162, thelotterybothdivs.find(goodSuffixes), DELTA * 0.162);
    }

    @Test
    public void case111() {
        String[] goodSuffixes = { "123", "1" };
        assertEquals(0.101, thelotterybothdivs.find(goodSuffixes), DELTA * 0.101);
    }

    @Test
    public void case112() {
        String[] goodSuffixes = { "0000", "000", "00", "0", "00", "000", "0000", "00001", "0000010" };
        assertEquals(0.10001, thelotterybothdivs.find(goodSuffixes), DELTA * 0.10001);
    }

}
