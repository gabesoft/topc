package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MixingColorsTest {
    MixingColors mixingcolors = new MixingColors();

    @Test
    public void case1() {
        int[] colors = { 1, 7, 3 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case2() {
        int[] colors = { 10 };
        assertEquals(1, mixingcolors.minColors(colors));
    }

    @Test
    public void case3() {
        int[] colors = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        assertEquals(4, mixingcolors.minColors(colors));
    }

    @Test
    public void case4() {
        int[] colors = { 534, 251, 76, 468, 909, 410, 264, 387, 102, 982, 199, 111, 659, 386, 151 };
        assertEquals(10, mixingcolors.minColors(colors));
    }

    @Test
    public void case5() {
        int[] colors = { 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        assertEquals(9, mixingcolors.minColors(colors));
    }

    @Test
    public void case6() {
        int[] colors = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912 };
        assertEquals(30, mixingcolors.minColors(colors));
    }

    @Test
    public void case7() {
        int[] colors = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 999999999, 1000000000, 15 };
        assertEquals(30, mixingcolors.minColors(colors));
    }

    @Test
    public void case8() {
        int[] colors = { 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 16, 32, 64, 128, 256, 512, 1024, 2048, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 999999999, 1000000000, 15 };
        assertEquals(27, mixingcolors.minColors(colors));
    }

    @Test
    public void case9() {
        int[] colors = { 145807200, 364805925, 12371716, 27287585, 15012100, 190249128, 43009218, 233769536, 65094327, 27480096, 24425730, 21179392, 305722240, 110696832, 56348280, 129085580, 713176, 94628004, 26749800, 35146650, 121107420, 137798064, 8252640, 60151368, 64794600, 51017472, 228875760, 172884294, 4479744, 54462144 };
        assertEquals(27, mixingcolors.minColors(colors));
    }

    @Test
    public void case10() {
        int[] colors = { 337012624, 22288140, 23425784, 36966150, 136332420, 44801740, 267181558, 153089811, 320468568, 62501140, 236314092, 261021720, 16485480, 193137675, 36338400, 42806088, 12529306, 10978020, 122306037, 581835696, 20996976, 107601024, 145988622, 17592024, 33851250, 467909970, 290171220, 412544720, 196277600, 50446080, 7760000, 98682704, 24666120, 281905664, 28838205, 904000, 66313344, 235261572, 26904304, 18142740, 259840, 624167862, 578214312 };
        assertEquals(30, mixingcolors.minColors(colors));
    }

    @Test
    public void case11() {
        int[] colors = { 64301400, 77348889, 153291900, 29711220, 527230096, 7826520, 83320448, 1260612, 50713344, 83675228, 458727032, 22762380, 60138800, 34132920, 409229184, 12528405, 440436717, 3452766, 90081750, 424541304, 35454996, 28625088, 63357525, 529520474, 16221744, 445822455, 155287976, 81711900, 228577980, 390646200, 189478800, 12498400, 173252730, 95801726, 28131840, 16348160, 29070965, 100777040 };
        assertEquals(29, mixingcolors.minColors(colors));
    }

    @Test
    public void case12() {
        int[] colors = { 93257325, 121275, 115203408, 150669848, 284593550, 44847600, 27270975, 313285207, 78614640, 3124968 };
        assertEquals(10, mixingcolors.minColors(colors));
    }

    @Test
    public void case13() {
        int[] colors = { 216106000, 239726844, 128881634, 397432035, 2257600, 234008864, 92305200, 261327584, 229098012, 138012160, 20612480, 41733216, 108366192, 269959095, 24555328, 62512632, 223494726, 156568797, 354131250, 34672400, 439441093, 7154056, 7282944, 14195580, 22365440, 13304192, 6566000, 47927488, 325010916, 5660460, 23997024, 106159840, 236554560, 290827728, 339646680, 308683368, 11331859, 300724800, 73570248, 233766000, 75369276, 8005504, 49865068, 192423360, 54309591, 167699140, 61146042, 410045316 };
        assertEquals(29, mixingcolors.minColors(colors));
    }

    @Test
    public void case14() {
        int[] colors = { 1755, 321230448, 637229490, 33848340, 444566100, 66060576, 7785936, 166005379, 61785801, 139766736, 406915067, 24681000, 30555658, 93679872, 24583984, 3995860, 20579020, 22162140, 39401024, 2382912, 101230920, 197190000, 46449693 };
        assertEquals(23, mixingcolors.minColors(colors));
    }

    @Test
    public void case15() {
        int[] colors = { 13479774, 60067623, 741195750, 54335502, 469676460, 197086466, 36340080, 130529490, 216999750 };
        assertEquals(9, mixingcolors.minColors(colors));
    }

    @Test
    public void case16() {
        int[] colors = { 5629078, 19780200, 133849680, 408667350, 4965888, 13071912, 54009706, 133622720, 56028500, 60210840, 531443478, 57539580, 80671914, 98772674, 9220136 };
        assertEquals(10, mixingcolors.minColors(colors));
    }

    @Test
    public void case17() {
        int[] colors = { 55644859, 42836584, 92204805, 34711578, 41604186, 19001304, 243685848, 299115, 63871920, 93420600, 137826480, 456456, 8305880, 470085, 369222592, 31791168, 7966877, 19646177, 84377496, 84144115, 369562824, 63572955, 10455307, 19339472, 91914094, 193312299, 81946584, 82245555, 120089603, 91865920, 19234739, 61623728, 92099371, 64347437, 116875177, 16217650, 357626235, 6702699, 49013763, 27210995, 79062248, 72887448, 15401814, 251426155, 110670722, 9365167, 94784786, 85660992, 167731825, 364638765 };
        assertEquals(16, mixingcolors.minColors(colors));
    }

    @Test
    public void case18() {
        int[] colors = { 15319850, 3849480, 115716276, 6376071, 74679648, 35336712, 408621044, 70410600, 107525992, 68341735, 101479326, 409055996, 41580687, 67689568, 509049962, 470955932, 37799303, 477330715, 103371616, 13427668, 35753728, 44631725, 440417788, 438028915, 101318127, 510152467, 83788476, 445439528, 513515454, 13860386, 438630666, 515817280, 414371038, 412246609, 41940734 };
        assertEquals(8, mixingcolors.minColors(colors));
    }

    @Test
    public void case19() {
        int[] colors = { 60022292, 120251010, 43831590, 431149545, 96771213, 13342066, 6293394, 132216816, 36039549, 49184271, 459059174, 66312582, 7515945, 427377819, 433247867, 508798489, 11244256, 432045760, 462895764, 95826852, 469187846, 507580066, 94673695, 81345284, 12139099, 127129817, 68333174, 471223030, 1222843, 477515108, 429947218 };
        assertEquals(7, mixingcolors.minColors(colors));
    }

    @Test
    public void case20() {
        int[] colors = { 213262080, 275965485, 14460213, 140499438, 18432366, 27727050, 292267843, 167300388, 501069891, 24883711, 142834907, 153380881, 360866221, 482670893, 480643516, 285824978, 6484113, 428485385, 434690968, 297206390, 405618627, 86778549, 477801609, 231583487, 337999207, 29746267, 201869988, 412314215, 161103285, 219220938, 225704795, 148999242, 215281553, 82429678, 407883602, 70607835, 99649408, 208321077, 279855896, 138226047, 76232319, 367038780, 12473764, 345710787, 299234023, 493088231, 269489852, 471358488, 418487030, 89051684 };
        assertEquals(6, mixingcolors.minColors(colors));
    }

    @Test
    public void case21() {
        int[] colors = { 277907058, 104465540, 190394820, 432099200, 975600, 536562436, 311983684, 346192576, 190305076, 225302448, 503140802, 536193524, 70450354, 34142262, 311860404, 157231874, 433040752, 104130164, 379871238, 224605504, 71048770, 466048326, 156355058, 33954502, 258723190, 346855472, 466204598, 278815874, 502510386, 258289542 };
        assertEquals(5, mixingcolors.minColors(colors));
    }

    @Test
    public void case22() {
        int[] colors = { 112943168, 4825365, 3660009, 168056694, 158609880, 213858102, 116572501, 155445553, 113580476, 210300895, 265245080, 267946353, 155029709, 172881507, 109885609, 171151263, 55033415, 217486883, 100457991, 95780626, 57697966, 151668772, 213995210, 97191662, 175779466, 263268452, 8288764, 260501645, 92448763, 51257170, 54118331 };
        assertEquals(5, mixingcolors.minColors(colors));
    }

    @Test
    public void case23() {
        int[] colors = { 249573184, 60544, 36293376, 608918464, 715879552, 715888640, 249611200, 643993792, 679629568, 679657344, 608941888, 643988544, 214501568, 36251520, 214557760 };
        assertEquals(4, mixingcolors.minColors(colors));
    }

    @Test
    public void case24() {
        int[] colors = { 490778475, 146959704, 208059708, 106692355, 151086000, 172767168, 12281616, 13361920, 258587462, 49875000, 25595150, 155508822, 160367446, 171664736, 63124630, 227586942, 103451388, 250558024 };
        assertEquals(11, mixingcolors.minColors(colors));
    }

    @Test
    public void case25() {
        int[] colors = { 133408671, 130155480, 10435392, 163514160, 9721569, 37924600, 52707732, 833419044, 58953600, 118363140, 12999600, 3623550, 92319008, 841971876, 825795013, 54907952, 871258588, 69883280, 133515686, 863637309, 78683542, 111471796, 881436834, 51579882, 10143750, 47642649, 57843278, 11371128, 934144310 };
        assertEquals(12, mixingcolors.minColors(colors));
    }

    @Test
    public void case26() {
        int[] colors = { 22500660, 57090, 1667017, 6803160, 6167070, 96570540, 148860432, 97450496, 297108, 40588912, 17410500, 9981411, 2717840, 8462890, 17637712, 220127932, 97395970, 5935754, 97168790, 219237138, 37891808, 219255824, 3151705, 35403006, 7212359 };
        assertEquals(13, mixingcolors.minColors(colors));
    }

    @Test
    public void case27() {
        int[] colors = { 71737008, 393331168, 13593987, 54878628, 5508048, 168298884, 154497140, 144681408, 41549664, 15919200, 99469744, 70637160, 159729280, 1908640, 56131076, 225599600, 218146332, 139510851, 10184275, 15726528, 45519587, 223653324, 54360560, 63117399, 198887524, 73522616, 78557243, 182867616, 119847964, 230877884, 118009752, 236047464, 228311119, 78935760, 181028132, 146748291, 125560640, 218002552, 215115772, 2888580, 127125963, 191741363, 170138112, 32764743, 39374279, 238485972, 97351075, 167386615, 245807551, 2543036 };
        assertEquals(14, mixingcolors.minColors(colors));
    }

    @Test
    public void case28() {
        int[] colors = { 208386012, 185378523, 6292393, 7868826, 178108344, 231960960, 81929342, 2492721, 16929000, 373625796, 138135842, 7294176, 9423876, 42552675, 121445280, 202614342, 202093685, 218752157, 209513126, 184398865, 192198465, 122603064, 252105346, 79965519, 26284387, 49372409, 168983484, 146015526, 207283095, 105420843, 113726511, 171209357 };
        assertEquals(15, mixingcolors.minColors(colors));
    }

    @Test
    public void case29() {
        int[] colors = { 18806580, 18559520, 102075600, 526040202, 11607219, 184587830, 23080926, 555433875, 191721664, 71029348, 72655440, 173190760, 513767100, 54331200, 38363578, 57498012, 53038692, 169583638, 449565932, 35909748, 4462584 };
        assertEquals(16, mixingcolors.minColors(colors));
    }

    @Test
    public void case30() {
        int[] colors = { 386387676, 41748882, 415746900, 25090560, 571751565, 503903808, 85792850, 107012325, 221677392, 76937168, 56079640, 241314066, 250864068, 40315596, 52808580, 11335500, 66458592, 646040413, 678570649, 116579612, 19577994, 115932738, 87512573, 328349964, 492951752, 426108878, 96422746, 914021593, 462620116, 435031110, 211077896, 25893490, 514113116, 997317443, 175912266, 948422819, 745936287, 770300173, 130171592, 144811454, 19963860, 520548868, 131621270, 431558996, 771559405, 664136775, 465026330, 692142178, 57224840 };
        assertEquals(18, mixingcolors.minColors(colors));
    }

    @Test
    public void case31() {
        int[] colors = { 59599020, 169043836, 105512, 2008216, 164673900, 557805300, 228548392, 280417280, 11108448, 18312868, 16115368, 441314000, 26710048, 1020270, 164738960, 454530, 352189248, 181962438, 198174818, 489261864, 13361594, 180021020, 367695332, 351431214, 336039046, 524124748, 156626538, 489645226, 59569284, 686741860, 394978346, 26610696, 22835610, 356717956, 89932260, 353428002, 287365128, 523988430, 533226724, 71613998, 506129640, 418406756, 513021310, 490155952, 437631746, 427004318, 749365066, 114370888, 460762380 };
        assertEquals(18, mixingcolors.minColors(colors));
    }

    @Test
    public void case32() {
        int[] colors = { 6338514, 301845180, 374106312, 336220480, 16318276, 229145040, 4661536, 5522760, 99558564, 345458916, 152145000, 107302500, 124262613, 1612800, 33560482, 8646120, 547883, 112090044, 21033012, 14899770, 14133408, 166294316, 336784920, 85449696, 166909522, 6876153, 42417265, 44015729, 233789680, 370177173, 151588968, 348473016, 336618295, 12001138, 138894708, 475479619, 422190664, 132904253, 1621848, 93599240, 166349394, 152153904, 430568352, 129081972, 343151326, 345969871, 54624024, 117882118 };
        assertEquals(19, mixingcolors.minColors(colors));
    }

    @Test
    public void case33() {
        int[] colors = { 846423, 105197092, 270930009, 378560610, 277538184, 10062640, 99168608, 61653420, 63616000, 72067452, 84454370, 19077672, 108319050, 2272140, 353016560, 141727498, 74461602, 201867228, 206663076, 426122000, 397638218, 268282888, 126827266, 102401514, 225605516, 335074102, 9789799, 66425812, 343402548, 426626154, 319823642, 362806167, 372455995, 357888540, 379675080, 337624038, 55787312, 75147478, 57415908, 56685235, 64436312, 165744316, 283423016, 166144482, 301356142, 282414662, 385812772, 125902204 };
        assertEquals(20, mixingcolors.minColors(colors));
    }

    @Test
    public void case34() {
        int[] colors = { 34927200, 97202232, 9562520, 568428, 9834156, 87500, 40506818, 796080, 27572202, 16317252, 251589222, 277559765, 36910080, 139674920, 9204650, 85986672, 63223488, 5080620, 42556590, 455518440, 243235424, 37460076, 121793686, 288329279, 118700400, 19448896, 74418130, 75946582, 358208136, 107653334, 83783242, 473272728, 168885682, 82988026, 343503407, 299332987, 107740442, 139596004, 8708038, 16047860, 422730376, 74865847, 358123332, 303291129, 7637230, 211835678, 11894120, 7908702, 128336920, 209170120 };
        assertEquals(21, mixingcolors.minColors(colors));
    }

    @Test
    public void case35() {
        int[] colors = { 6491925, 343454736, 569855520, 46518528, 269774595, 1964690, 98215182, 5407367, 35956440, 17617000, 455626080, 135587100, 12306000, 379885800, 1861110, 549290, 100060992, 153041350, 27120680, 178996608, 4916445, 92885160, 382179325, 99265206, 112261099, 377246125, 76828979, 605938838, 270274217, 276258838, 383513099, 286834539, 11773946, 367706601, 307480270, 25276894, 285558265, 253891880, 96621685, 331220440, 319660578, 274139764, 403146413, 305624230, 188490339, 255848378, 307526579 };
        assertEquals(22, mixingcolors.minColors(colors));
    }

    @Test
    public void case36() {
        int[] colors = { 53504, 71556660, 127532252, 1144800, 59268672, 89040, 105523836, 23693256, 265320, 107227120, 302701482, 15297756, 360255720, 46455482, 38219181, 66624810, 49213120, 90423200, 123182495, 166973940, 26520060, 203456400, 54364640, 39063080, 69084244, 140747172, 132561278, 54317616, 175869876, 263846792, 118478242, 110830218, 218111492, 267317444, 11917216, 389954885, 123127375, 263793288, 81696783, 174782548, 74060927, 94808938, 20167279, 200332432, 165848596, 24703016, 91251803 };
        assertEquals(23, mixingcolors.minColors(colors));
    }

    @Test
    public void case37() {
        int[] colors = { 62686140, 165949152, 13090350, 36146544, 170081940, 7183323, 22604192, 24854812, 25514112, 50898603, 501925872, 383698476, 23208255, 146694240, 216166832, 156645180, 8329167, 27028323, 155652216, 281398581, 130254900, 44448000, 6877248, 3041280, 379703779, 58408338, 388268387, 295511189, 55924114, 17061587, 56897260, 160019771, 13542723, 487047159, 16665180, 512682268, 514667608, 148601627, 529068304, 42858027, 136103221, 596845, 170534393, 15149695, 156109589, 504209808, 536193024, 401220640, 499122649, 21163694 };
        assertEquals(24, mixingcolors.minColors(colors));
    }

    @Test
    public void case38() {
        int[] colors = { 211273700, 14961456, 7488612, 113463756, 41970348, 227222512, 703102410, 554446704, 7771008, 243349092, 5747511, 158559247, 2443980, 11126700, 47351260, 313369595, 31444686, 193968984, 204579232, 93990600, 449615430, 25921566, 8377188, 11784825, 31991808, 10905156, 86637745, 144393231, 29000272, 14386120, 303985026, 119161956, 255570996, 61633488, 56196868, 147650360, 142550337, 177301396, 44308060, 97367937, 36944085, 271436119, 115743488, 33384792, 223387704, 165325731, 747048064, 313766663, 744703920, 394134662 };
        assertEquals(25, mixingcolors.minColors(colors));
    }

    @Test
    public void case39() {
        int[] colors = { 417936384, 28188580, 519616864, 25744012, 49249924, 132321834, 378662830, 9196320, 46376112, 117568320, 84358480, 191400756, 25962816, 29900325, 57065988, 25248720, 14442610, 346496084, 75106500, 106625120, 11547756, 118485224, 309044685, 172976076, 415533048, 1334070, 405062145, 122889798, 392990877, 511588961, 430277073, 459679073, 60990105, 51549941, 419639033, 359604849, 80362664, 405383313, 4462437, 48950084, 74003180, 282924176, 3958604, 198754136, 215567384, 122414989, 221410132, 109304232, 57556308, 388532216 };
        assertEquals(26, mixingcolors.minColors(colors));
    }

    @Test
    public void case40() {
        int[] colors = { 999999978, 999999980, 999999955, 999999974, 999999995, 999999986, 999999957, 999999983, 999999965, 999999992, 999999987, 999999991, 999999956, 999999971, 999999985, 999999959, 999999963, 999999979, 999999964, 999999993, 999999970, 999999994, 999999977, 999999981, 999999958, 999999972, 999999997, 999999984, 999999952, 999999996, 999999989, 999999973, 999999953, 999999990, 999999988, 999999976, 999999966, 999999982, 999999961, 999999967, 999999975, 999999951, 1000000000, 999999954, 999999999, 999999960, 999999962, 999999968, 999999969, 999999998 };
        assertEquals(8, mixingcolors.minColors(colors));
    }

    @Test
    public void case41() {
        int[] colors = { 999999979, 999999901, 999999985, 999999965, 999999937, 999999951, 999999953, 999999989, 999999925, 999999963, 999999943, 999999991, 999999927, 999999915, 999999981, 999999967, 999999977, 999999969, 999999983, 999999913, 999999987, 999999905, 999999971, 999999929, 999999959, 999999949, 999999909, 999999907, 999999961, 999999995, 999999903, 999999945, 999999939, 999999941, 999999931, 999999975, 999999933, 999999973, 999999917, 999999999, 999999955, 999999957, 999999947, 999999935, 999999921, 999999911, 999999993, 999999997, 999999919, 999999923 };
        assertEquals(7, mixingcolors.minColors(colors));
    }

    @Test
    public void case42() {
        int[] colors = { 1000000000 };
        assertEquals(1, mixingcolors.minColors(colors));
    }

    @Test
    public void case43() {
        int[] colors = { 999999999 };
        assertEquals(1, mixingcolors.minColors(colors));
    }

    @Test
    public void case44() {
        int[] colors = { 1 };
        assertEquals(1, mixingcolors.minColors(colors));
    }

    @Test
    public void case45() {
        int[] colors = { 567432, 567772, 567126, 567381, 567296, 567058, 567177, 567721, 567653, 567143, 567245, 567585, 567755, 567228, 567551, 567347, 567534, 567568, 567194, 567602, 567211, 567670, 567109, 567738, 567891, 567687, 567619, 567262, 567160, 567075, 567806, 567279, 567330, 567704, 567466, 567313, 567857, 567517, 567789, 567500, 567636, 567483, 567415, 567398, 567092, 567449, 567840, 567364, 567874, 567823 };
        assertEquals(12, mixingcolors.minColors(colors));
    }

    @Test
    public void case46() {
        int[] colors = { 567891215, 567691244, 567891040, 567691237, 567889244, 567891039, 567871236, 567891035, 567691236, 567889239, 567889237, 567891037, 567889242, 567891222, 567691241, 567889240, 567691235, 567871240, 567871235, 567691240, 567891036, 567891218, 567891044, 567871241, 567871243, 567889243, 567891041, 567871238, 567691238, 567891042, 567891219, 567891038, 567871244, 567891221, 567891223, 567691243, 567889241, 567889235, 567691242, 567691239, 567889238, 567871239, 567891224, 567891217, 567891043, 567891216, 567871242, 567889236, 567871237, 567891220 };
        assertEquals(11, mixingcolors.minColors(colors));
    }

    @Test
    public void case47() {
        int[] colors = { 665111111, 666651115, 666511111, 665111114, 666666653, 666666514, 511111113, 666665112, 665111115, 666666511, 666665115, 511111115, 665111112, 666666652, 651111115, 666666654, 666666656, 651111116, 666665113, 511111114, 511111116, 511111111, 666511112, 511111112, 651111112, 666651113, 651111113, 666666651, 665111116, 665111113, 666651112, 666666516, 666511116, 666511113, 666666513, 666511115, 666666515, 666665111, 651111114, 666666512, 666651116, 666665114, 666651111, 666511114, 666666655, 651111111, 666651114, 666665116 };
        assertEquals(14, mixingcolors.minColors(colors));
    }

    @Test
    public void case48() {
        int[] colors = { 531329352, 531329362, 888761882, 885191088, 888408022, 888765421, 888761873, 888765399, 885191087, 888765095, 888765097, 853021850, 888729702, 888761871, 888408000, 888765092, 531329350, 888765425, 885191074, 888765431, 885191083, 853021830, 853021835, 853021852, 885191095, 853021825, 888408012, 531329339, 888761859, 531329349, 888729699, 531329337, 888761869, 888408002, 888765077, 888765408, 853021843, 888729692, 888761866, 888729695, 888765086, 885191102, 888729700, 888407999, 888765102, 888729691, 888765412, 888408003 };
        assertEquals(15, mixingcolors.minColors(colors));
    }

    @Test
    public void case49() {
        int[] colors = { 10 };
        assertEquals(1, mixingcolors.minColors(colors));
    }

    @Test
    public void case50() {
        int[] colors = { 3, 24, 27 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case51() {
        int[] colors = { 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        assertEquals(9, mixingcolors.minColors(colors));
    }

    @Test
    public void case52() {
        int[] colors = { 39420801, 943379588, 344900872, 732714761, 328631181, 179056916, 531224153, 829958808, 812264836, 41244830, 142352927, 189708578, 371706275, 623557541, 825093671, 931324971, 443627012, 263729327, 181743284, 62589879, 760650170, 946802747, 359419198, 361527239, 759116745, 349897143, 339426126, 649947917, 58190417, 537056466, 857589717, 257428054, 900910553, 881594842, 845572794, 865359711, 85197243, 886691173, 846651241, 107211754, 906610286, 726429168, 994918101, 236964341, 409847017, 552754168, 752729087 };
        assertEquals(10, mixingcolors.minColors(colors));
    }

    @Test
    public void case53() {
        int[] colors = { 1, 5, 10, 11, 15 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case54() {
        int[] colors = { 1920, 224, 112, 60, 1836, 124, 31, 99, 3, 5, 6 };
        assertEquals(8, mixingcolors.minColors(colors));
    }

    @Test
    public void case55() {
        int[] colors = { 3, 7, 15, 11 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case56() {
        int[] colors = { 15, 55, 56 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case57() {
        int[] colors = { 5, 10, 15 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case58() {
        int[] colors = { 257, 259, 261, 263, 185, 186, 187, 188, 189, 190, 191, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 2048, 2049, 2050, 2051, 2052, 2053, 2054, 2055, 3072, 3073, 3074, 3075, 3076, 3077, 3078, 3079 };
        assertEquals(7, mixingcolors.minColors(colors));
    }

    @Test
    public void case59() {
        int[] colors = { 3, 5, 6 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case60() {
        int[] colors = { 5, 8, 13, 16, 21 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case61() {
        int[] colors = { 5, 2, 7 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case62() {
        int[] colors = { 1, 6, 7 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case63() {
        int[] colors = { 2, 5, 7 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case64() {
        int[] colors = { 12, 3, 15 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case65() {
        int[] colors = { 8, 9, 10, 11, 20, 21, 22, 23 };
        assertEquals(4, mixingcolors.minColors(colors));
    }

    @Test
    public void case66() {
        int[] colors = { 1, 4, 5, 8, 13 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case67() {
        int[] colors = { 7, 56, 63 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case68() {
        int[] colors = { 7, 3 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case69() {
        int[] colors = { 1, 7, 6 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case70() {
        int[] colors = { 15, 6, 9 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case71() {
        int[] colors = { 3, 4, 7 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case72() {
        int[] colors = { 3, 5, 9 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case73() {
        int[] colors = { 10, 1, 11 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case74() {
        int[] colors = { 3, 12, 15 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case75() {
        int[] colors = { 1, 10, 11 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case76() {
        int[] colors = { 28, 31, 3 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case77() {
        int[] colors = { 1, 2, 1020, 1021, 1022, 1023 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case78() {
        int[] colors = { 2, 7, 5 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case79() {
        int[] colors = { 61440, 61455, 15 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case80() {
        int[] colors = { 3, 14, 13 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case81() {
        int[] colors = { 536870913, 536870914, 536870916, 536870920, 536870928, 536870944, 536870976, 536871040, 536871168, 536871424, 536871936, 536872960, 536875008, 536879104, 536887296, 536903680, 536936448, 537001984, 537133056, 537395200, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870911 };
        assertEquals(30, mixingcolors.minColors(colors));
    }

    @Test
    public void case82() {
        int[] colors = { 36, 18, 9 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case83() {
        int[] colors = { 380717, 160934, 1330708, 935579, 368707, 761434, 688173, 771042, 347089, 98482, 643736, 58849, 1238231, 1231025, 1185387, 333878, 870725, 421551, 1127739, 714595, 1293477, 449174, 1377547, 497214, 737414, 78065, 887539, 891142, 1239432, 195763, 205371, 865921, 1306688, 157331, 15613, 729007, 618515, 881534, 1347522, 607706, 1059282, 133311, 1115729, 36030, 1310291, 1245437, 1002835, 1305487 };
        assertEquals(21, mixingcolors.minColors(colors));
    }

    @Test
    public void case84() {
        int[] colors = { 49, 50, 52, 56, 57, 9 };
        assertEquals(5, mixingcolors.minColors(colors));
    }

    @Test
    public void case85() {
        int[] colors = { 1, 6, 7, 8, 9 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case86() {
        int[] colors = { 1, 7, 15, 9, 14 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case87() {
        int[] colors = { 185, 186, 187, 188, 189, 190, 191, 257, 259, 261, 263 };
        assertEquals(5, mixingcolors.minColors(colors));
    }

    @Test
    public void case88() {
        int[] colors = { 1, 3, 13, 14, 15 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case89() {
        int[] colors = { 9, 8 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case90() {
        int[] colors = { 3, 7 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case91() {
        int[] colors = { 10, 21, 15, 22, 275, 14, 75, 82, 14324234, 78322348, 123091, 89328942, 7272723, 727265, 81827378, 81278735, 89894, 97482847, 183781321, 787184, 8781378, 891283 };
        assertEquals(21, mixingcolors.minColors(colors));
    }

    @Test
    public void case92() {
        int[] colors = { 2, 5, 10, 9, 50, 1, 6, 8 };
        assertEquals(5, mixingcolors.minColors(colors));
    }

    @Test
    public void case93() {
        int[] colors = { 1, 2, 3, 10 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case94() {
        int[] colors = { 1, 1000, 1001 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case95() {
        int[] colors = { 31, 19, 10 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case96() {
        int[] colors = { 2, 4, 6, 8, 10 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case97() {
        int[] colors = { 7, 1 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case98() {
        int[] colors = { 27, 18, 23, 8, 1, 13, 4 };
        assertEquals(4, mixingcolors.minColors(colors));
    }

    @Test
    public void case99() {
        int[] colors = { 3, 7, 11, 15 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case100() {
        int[] colors = { 2, 10, 5, 15, 7 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case101() {
        int[] colors = { 15, 12, 14, 13 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case102() {
        int[] colors = { 6, 3, 5 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case103() {
        int[] colors = { 2, 5, 7, 8 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case104() {
        int[] colors = { 1, 4, 5 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case105() {
        int[] colors = { 1, 2, 3, 40 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case106() {
        int[] colors = { 15, 1, 9, 7 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case107() {
        int[] colors = { 19, 23, 27, 31 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case108() {
        int[] colors = { 15, 3855, 3840 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case109() {
        int[] colors = { 1024, 1025, 1026, 1027 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case110() {
        int[] colors = { 12, 13, 14, 15 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case111() {
        int[] colors = { 127, 15, 112 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case112() {
        int[] colors = { 32768, 1, 2, 3 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case113() {
        int[] colors = { 24, 25, 26, 27 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case114() {
        int[] colors = { 7, 1, 6 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case115() {
        int[] colors = { 30, 5, 9999, 1, 1111, 2, 4, 5555, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 116, 17, 18, 100, 22, 200, 2000, 200000, 45670, 98938, 78372, 111111, 300000, 500000, 600000, 700000, 899999, 1000000000 };
        assertEquals(20, mixingcolors.minColors(colors));
    }

    @Test
    public void case116() {
        int[] colors = { 14130, 5094, 15189, 9428 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case117() {
        int[] colors = { 32, 28, 24, 20, 16 };
        assertEquals(4, mixingcolors.minColors(colors));
    }

    @Test
    public void case118() {
        int[] colors = { 9, 11, 13, 15 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case119() {
        int[] colors = { 478363971, 1, 2049, 1024, 953534433, 1000000000, 999997952, 11 };
        assertEquals(7, mixingcolors.minColors(colors));
    }

    @Test
    public void case120() {
        int[] colors = { 7, 4, 3 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case121() {
        int[] colors = { 986302238, 997740989, 907976911, 987283421, 906124794, 977539877, 980646951, 907092123 };
        assertEquals(8, mixingcolors.minColors(colors));
    }

    @Test
    public void case122() {
        int[] colors = { 6, 1 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case123() {
        int[] colors = { 6, 1, 7 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case124() {
        int[] colors = { 1024, 1023, 1021 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case125() {
        int[] colors = { 31, 20, 11 };
        assertEquals(2, mixingcolors.minColors(colors));
    }

    @Test
    public void case126() {
        int[] colors = { 1, 5, 13 };
        assertEquals(3, mixingcolors.minColors(colors));
    }

    @Test
    public void case127() {
        int[] colors = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 3, 6, 12, 24, 48, 96, 192, 384, 768, 1536, 3072, 6144, 12288, 24576, 49152, 98304, 196608, 393216 };
        assertEquals(30, mixingcolors.minColors(colors));
    }

    @Test
    public void case128() {
        int[] colors = { 37, 21, 13, 10, 18, 34 };
        assertEquals(4, mixingcolors.minColors(colors));
    }

    @Test
    public void case129() {
        int[] colors = { 15, 224, 7, 240, 56, 52, 44, 28 };
        assertEquals(6, mixingcolors.minColors(colors));
    }

}
