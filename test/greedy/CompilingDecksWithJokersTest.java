package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class CompilingDecksWithJokersTest {
  CompilingDecksWithJokers compilingdeckswithjokers = new CompilingDecksWithJokers();

  @Test
  public void case1() {
    int[] cards = { 10, 15 };
    int jokers = 3;
    assertEquals(13, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case2() {
    int[] cards = { 1, 2, 3 };
    int jokers = 4;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case3() {
    int[] cards = { 1 };
    int jokers = 5;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case4() {
    int[] cards = { 2, 3, 4, 5, 6 };
    int jokers = 4;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case5() {
    int[] cards = { 123, 76, 117, 59 };
    int jokers = 89;
    assertEquals(112, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case6() {
    int[] cards = { 1000 };
    int jokers = 1000;
    assertEquals(2000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case7() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(510000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case8() {
    int[] cards = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int jokers = 1000;
    assertEquals(1020, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case9() {
    int[] cards = { 226122832, 189005257, 189156969, 236469917, 256021284, 198044647, 205010994, 248049174, 178890212, 179064641, 205487139, 181900883, 219085859, 194404080, 180119514, 175328654, 176680847, 219902799, 214484673, 226685686, 184943334, 244938159, 226671718, 232300525, 217741358, 198257030, 182016553, 218493681, 210887836, 254883164, 233331681, 196181103, 181327118, 185685373, 189721110, 208014083, 188970297, 214101097, 211243656, 226812722, 245703580, 236080919, 200802807, 189449256, 236569874, 187225989, 233477105, 187225898, 204877564, 176866378 };
    int jokers = 150562962;
    assertEquals(191896735, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case10() {
    int[] cards = { 127490265, 131350675, 127055297, 127381463, 129728253, 129769197, 130054235, 131490848, 126676483, 128992029, 129344019, 129075751, 127871041, 125966312, 131069111, 131017321, 131724623, 127822714, 126558220, 131406680, 127104487, 131512075, 127908054, 129985109, 126776004, 130873382, 130416930, 129521658, 131121732, 129651155, 126665720, 132095055, 129405544, 127593091, 128962469, 127124470, 127839697, 130567731, 129610791, 128931675, 129840068, 129660562, 129735329, 126880153, 126365408, 128155917, 131013958, 130050586, 128156413, 125995706 };
    int jokers = 307811391;
    assertEquals(131649910, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case11() {
    int[] cards = { 397157650, 401763389, 377539577, 382674971, 409157007, 350626705, 391704216, 376731407, 429871158, 422479397, 384109904, 360087755, 406847761, 339825184, 348395178, 360308857, 350252980, 415483110, 410340562, 377821676, 380857829, 410044716, 432419527, 365303240, 373796197, 343600730, 350762028, 383767361, 359621086, 370668226, 422236301, 367721016, 377683186, 421459044, 417019420, 415631229, 347593161, 397119051, 353205700, 378240715, 336531190, 343196302, 402810367, 370406824, 374699564, 345629280, 423260198, 347851277, 385662711, 431488090 };
    int jokers = 209929623;
    assertEquals(363161135, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case12() {
    int[] cards = { 288414605, 249535639, 265085490, 249855079, 114768747, 160773068, 230462420, 125402273, 158004624, 128232675, 83674890, 104824240, 223016818, 158066994, 106001106, 141704808, 292468649, 211120042, 138775770, 100585989, 250173419, 282988145, 177324768, 242301648, 102709616, 221539988, 181208043, 93270699, 125701670, 218437878, 214876042, 104245589, 125943255, 231228521, 188913227, 109173310, 279584494, 218986278, 254659547, 178744013, 238973967, 144766106, 120739747, 252601293, 181866574, 282716215, 183027159, 144582742, 230079542, 102724496 };
    int jokers = 237188236;
    assertEquals(113401241, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case13() {
    int[] cards = { 209774944, 293946777, 316822315, 181018667, 145186229, 224492093, 272083203, 192705843, 226577257, 215805665, 174187722, 222038443, 301884072, 223208726, 142773929, 190200452, 205403967, 323157462, 192842678, 265437535, 193927228, 131569912, 277825888, 236306011, 122924277, 244295593, 325779930, 186992275, 162663740, 226970846, 323793307, 326989652, 231005652, 304486798, 199534279, 226469133, 131620501, 273482487, 177676671, 227116288, 324803591, 163312572, 295207875, 263944811, 179210189, 290773049, 140639012, 274981149, 304089725, 234177510 };
    int jokers = 301071063;
    assertEquals(162896266, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case14() {
    int[] cards = { 2, 0, 4, 0, 3, 4, 2, 4, 1, 5, 1, 5, 3, 4, 1, 0, 0, 3, 5, 0, 3, 2, 1, 4, 3, 0, 4, 5, 0, 3, 0, 5, 5, 1, 2, 4, 5, 4, 3, 0, 5, 3, 1, 0, 4, 2, 0, 3, 3, 3 };
    int jokers = 76;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case15() {
    int[] cards = { 4, 2, 2, 3, 3, 3, 2, 1, 4, 4, 2, 3, 1, 1, 1, 2, 4, 4, 1, 1, 3, 4, 4, 1, 4, 3, 4, 4, 3, 3, 2, 2, 3, 1, 4, 3, 4, 1, 3, 3, 2, 4, 2, 1, 1, 2, 4, 3, 3, 4 };
    int jokers = 18;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case16() {
    int[] cards = { 4, 1, 3, 3, 3, 2, 3, 2, 1, 3, 2, 4, 3, 1, 2, 3, 1, 2, 2, 4, 4, 1, 1, 1, 1, 1, 2, 4, 3, 2, 2, 3, 1, 4, 1, 2, 2, 1, 2, 4, 4, 3, 2, 2, 2, 4, 1, 2, 1, 1 };
    int jokers = 15;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case17() {
    int[] cards = { 1, 3, 3, 1, 2, 3, 1, 3, 4, 2, 4, 2, 4, 1, 2, 1, 1, 4, 4, 3, 2, 1, 4, 1, 4, 3, 3, 2, 1, 4, 3, 2, 2, 4, 3, 3, 2, 3, 2, 3, 4, 2, 4, 1, 1, 3, 1, 4, 4, 4 };
    int jokers = 13;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case18() {
    int[] cards = { 2, 2, 3 };
    int jokers = 4;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case19() {
    int[] cards = { 2, 2, 4 };
    int jokers = 3;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case20() {
    int[] cards = { 2, 2, 4 };
    int jokers = 5;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case21() {
    int[] cards = { 100011, 100007, 100017, 100002, 100006, 100006, 100017, 100008, 100001, 100011, 100017, 100012, 100010, 100000, 100004, 100005, 100017, 100015, 100016, 100002, 100014, 100001, 100005, 100014, 100011, 100006, 100015, 100005, 100006, 100010, 100009, 100007, 100016, 100004, 100003, 100002, 100017, 100000, 100016, 100012, 100007, 100015, 100009, 100002, 100002, 100009, 100001, 100000, 100006, 100017 };
    int jokers = 18;
    assertEquals(100002, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case22() {
    int[] cards = { 123, 1, 117, 59 };
    int jokers = 112;
    assertEquals(60, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case23() {
    int[] cards = { 72758362, 212587823, 301878381, 451868829, 419074050, 267428994, 161862087, 44749444, 293029662, 444733919, 354441902, 407043072, 442865955, 293877114, 222393384, 337756703, 188134334, 191465061, 166093226, 286040587, 178342222, 73429757, 306115229, 39263870, 48811625, 194610556, 503522, 29463368, 373862487, 276906089, 365681222, 68866761, 90951059, 332365344, 472331027, 56043135, 148882766, 415877458, 282100099, 143644527, 273972203, 85612165, 128248131 };
    int jokers = 162364615;
    assertEquals(29966890, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case24() {
    int[] cards = { 71374736, 183246581, 465707283, 250757476, 487592230, 429226927, 265955904, 77010571, 64849987, 393826940, 229448607, 260035883, 161724, 462955484, 79607454, 422485554, 71883965, 458922557, 87769405, 354959286, 200946241, 352578182, 426853272, 426962826, 55631258 };
    int jokers = 165310340;
    assertEquals(55792982, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case25() {
    int[] cards = { 369096882, 364629999, 263620532, 324512826, 247393767, 233076917, 288933670, 75313813, 366433555, 2626617, 18089890, 499353805, 364673496, 467223586, 449496785, 178345952, 459815175, 18011873, 470207698, 116570073, 312413740, 200929854, 450539448, 18079840, 39721474, 40325591, 456309511, 172296488, 421548025, 365159073, 374217019, 147077760, 387580340, 138053467 };
    int jokers = 249166680;
    assertEquals(18936073, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case26() {
    int[] cards = { 139104651, 386592291, 180841723, 234027238, 478479116, 300748770, 362528448, 10191600, 478073974, 153655516, 248717274, 87513983, 151995197 };
    int jokers = 369406659;
    assertEquals(97705583, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case27() {
    int[] cards = { 224772158, 40820874, 466288682, 250395384, 195692656, 430739639, 35578402, 186814934, 158450033, 485308632, 354718624, 397313719, 233703207, 249228332, 298904843, 379510572, 126542226, 253675183, 455224091, 463437752, 324960327, 67196300, 409186398, 486628686, 359313900, 464616868, 329105330, 104000985, 48078270, 24727051, 447134673, 452940985, 173005577, 436833671, 59805630, 231433790, 198356914, 129275925, 129859678, 131657009 };
    int jokers = 291148040;
    assertEquals(49734865, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case28() {
    int[] cards = { 202778588, 260230729, 368612237, 189377375, 203319103, 45418676, 485638632, 393577366, 325388255, 351916184, 341789432, 2225367, 392152812, 246364039, 70645248, 260946853, 14227171, 290940430, 187986140, 155696562, 70808350, 150765352, 119367547, 423884135, 62434626, 303452619, 435741793, 420799581, 8277198, 267638105, 206928422, 251698920, 419629458, 80811568, 448130290 };
    int jokers = 360318567;
    assertEquals(10502565, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case29() {
    int[] cards = { 370030363, 299625991, 471912318, 494097071, 24453085, 388852790, 263770156, 276842956, 313337006, 352481129, 414534328, 340238769, 121982647, 98232089, 11829362, 52677454, 337912724, 258940885, 257291623, 387246319, 486878938, 485596353, 406605519 };
    int jokers = 391867701;
    assertEquals(36282447, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case30() {
    int[] cards = { 6, 10, 2, 5, 2, 5, 5, 9, 5, 10, 4, 2 };
    int jokers = 4;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case31() {
    int[] cards = { 8, 4, 10, 8, 7, 3, 3, 4, 10, 10, 7, 9, 10, 7, 2 };
    int jokers = 3;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case32() {
    int[] cards = { 8, 10, 8, 10, 2, 4, 6, 6, 2, 7, 9, 5, 3, 4, 7, 4, 8, 9, 3 };
    int jokers = 8;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case33() {
    int[] cards = { 3, 3, 7, 5, 7, 2, 4, 8, 5, 10, 4, 9, 5, 9, 4, 2, 8, 4 };
    int jokers = 15;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case34() {
    int[] cards = { 5, 5, 4, 5, 5, 4, 3, 6, 6, 8, 9, 9, 5 };
    int jokers = 0;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case35() {
    int[] cards = { 10, 8, 4, 6, 2, 6, 5, 8, 3, 9, 7, 6, 10, 6, 5, 6, 5 };
    int jokers = 14;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case36() {
    int[] cards = { 10, 5, 5, 2, 6, 3, 4, 8, 5, 5 };
    int jokers = 10;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case37() {
    int[] cards = { 5, 10, 4, 3, 4, 4, 8, 7, 2, 3, 7, 9, 10, 4 };
    int jokers = 4;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case38() {
    int[] cards = { 6, 2, 7, 10, 2, 2, 3, 4, 7, 8, 10, 5 };
    int jokers = 19;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case39() {
    int[] cards = { 3, 7, 8, 2, 3, 5, 9, 10, 4, 5, 4, 3, 5, 3, 7, 2 };
    int jokers = 12;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case40() {
    int[] cards = { 150421142, 162364615, 72758362, 212587823, 301878381, 451868829, 419074050, 267428994, 161862087, 44749444, 293029662, 444733919, 354441902, 407043072, 442865955, 293877114, 222393384, 337756703, 188134334, 191465061, 166093226, 286040587, 178342222, 73429757, 306115229, 39263870, 48811625, 194610556, 503522, 29463368, 373862487, 276906089, 365681222, 68866761, 90951059, 332365344, 472331027, 56043135, 148882766, 415877458, 282100099, 143644527, 273972203, 85612165, 128248131, 491545273, 165310340, 71374736, 183246581, 465707283 };
    int jokers = 0;
    assertEquals(503522, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case41() {
    int[] cards = { 250757476, 487592230, 429226927, 265955904, 77010571, 64849987, 393826940, 229448607, 260035883, 161724, 462955484, 79607454, 422485554, 71883965, 458922557, 87769405, 354959286, 200946241, 352578182, 426853272, 426962826, 55631258, 183824532, 249166680, 369096882, 364629999, 263620532, 324512826, 247393767, 233076917, 288933670, 75313813, 366433555, 2626617, 18089890, 499353805, 364673496, 467223586, 449496785, 178345952, 459815175, 18011873, 470207698, 116570073, 312413740, 200929854, 450539448, 18079840, 39721474, 40325591 };
    int jokers = 0;
    assertEquals(161724, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case42() {
    int[] cards = { 456309511, 172296488, 421548025, 365159073, 374217019, 147077760, 387580340, 138053467, 334941761, 369406659, 139104651, 386592291, 180841723, 234027238, 478479116, 300748770, 362528448, 10191600, 478073974, 153655516, 248717274, 87513983, 151995197, 20256037, 291148040, 224772158, 40820874, 466288682, 250395384, 195692656, 430739639, 35578402, 186814934, 158450033, 485308632, 354718624, 397313719, 233703207, 249228332, 298904843, 379510572, 126542226, 253675183, 455224091, 463437752, 324960327, 67196300, 409186398, 486628686, 359313900 };
    int jokers = 0;
    assertEquals(10191600, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case43() {
    int[] cards = { 464616868, 329105330, 104000985, 48078270, 24727051, 447134673, 452940985, 173005577, 436833671, 59805630, 231433790, 198356914, 129275925, 129859678, 131657009, 288343983, 360318567, 202778588, 260230729, 368612237, 189377375, 203319103, 45418676, 485638632, 393577366, 325388255, 351916184, 341789432, 2225367, 392152812, 246364039, 70645248, 260946853, 14227171, 290940430, 187986140, 155696562, 70808350, 150765352, 119367547, 423884135, 62434626, 303452619, 435741793, 420799581, 8277198, 267638105, 206928422, 251698920, 419629458 };
    int jokers = 0;
    assertEquals(2225367, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case44() {
    int[] cards = { 150126752, 53706184, 132515414, 406609022, 252475770, 466417688, 390188571, 233331028, 246781146, 364782551, 244552115, 42485675, 492650007, 459782893, 34260287, 498868937, 426617796, 168572581, 59754856, 315078555, 247601980, 481359151, 473367518, 285436470, 421227039, 425308957, 192539854, 48585807, 354914513, 273647338, 263369326, 242668221, 318364659, 425130609, 321276792, 93848065, 444377078, 234171760, 17537445, 356093369, 65226884, 11665674, 0, 446754349, 129707541, 270681672, 392983158, 433791942, 307590232, 421892245 };
    int jokers = 0;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case45() {
    int[] cards = { 3728340, 200899445, 47688159, 472381214, 475490869, 80343482, 116583085, 218551273, 103767569, 404224739, 200869487, 214588266, 373162426, 399764476, 333817231, 194407759, 363194957, 31658485, 175603317, 137972072, 342690858, 39789605, 205306389, 460571438, 297486704, 369455037, 232165730, 241218871, 408001929, 313551197, 355757270, 32727491, 214391198, 6310276, 319470829, 358811187, 9847071, 424059924, 239326376, 292507276, 126745147, 41079510, 320364, 147946233, 320351, 115028984, 68858272, 474537799, 460551917, 127376004 };
    int jokers = 17;
    assertEquals(320366, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case46() {
    int[] cards = { 499999997, 500000000, 499999995, 500000000, 499999995, 499999996, 499999993, 499999995, 499999993, 499999994, 499999997, 499999998, 499999993, 499999993, 499999993, 499999996, 499999993, 499999996, 499999996, 500000000, 499999993, 499999993, 499999995, 499999994, 500000000, 499999995, 499999997, 499999993, 500000000, 500000000, 499999998, 499999995, 499999998, 499999995, 499999997, 499999999, 499999995, 499999995, 499999998, 499999996, 499999997, 499999994, 500000000, 499999999, 499999999, 499999999, 500000000, 499999993, 499999997, 499999997 };
    int jokers = 33;
    assertEquals(499999995, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case47() {
    int[] cards = { 483377682, 483382290, 498765432, 483377150, 483379338, 483374318, 498765432, 498765432, 483378026, 483381781, 483380812, 483388741, 483362966, 483372988, 483375302, 498765432, 483379637, 483364204, 483382169, 498765432, 498765432, 498765432, 483363010, 483363580, 498765432, 483365711, 483383171, 498765432, 498765432, 483359372, 498765432, 483363516, 483375743, 483378755, 498765432, 498765432, 498765432, 483378059, 483376210, 498765432, 498765432, 483376712, 483377199, 483378236, 498765432, 498765432, 498765432, 483367848, 483370042, 498765432 };
    int jokers = 500000000;
    assertEquals(499521289, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case48() {
    int[] cards = { 1, 4, 6, 6, 6, 6 };
    int jokers = 10000;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case49() {
    int[] cards = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int jokers = 10;
    assertEquals(11, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case50() {
    int[] cards = { 2, 3, 4, 5, 6 };
    int jokers = 4;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case51() {
    int[] cards = { 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(750000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case52() {
    int[] cards = { 3, 3, 3 };
    int jokers = 100000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case53() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(600000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case54() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(510000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case55() {
    int[] cards = { 6, 6, 6, 6, 6, 6 };
    int jokers = 6;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case56() {
    int[] cards = { 100, 10, 1 };
    int jokers = 100;
    assertEquals(11, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case57() {
    int[] cards = { 1, 1 };
    int jokers = 100;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case58() {
    int[] cards = { 22222, 33333, 22222, 33333, 55555, 66666, 77777, 88888, 99999, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(37036, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case59() {
    int[] cards = { 5, 0, 8, 5, 415, 0, 9 };
    int jokers = 51515;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case60() {
    int[] cards = { 0, 0 };
    int jokers = 1;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case61() {
    int[] cards = { 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1 };
    int jokers = 500000000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case62() {
    int[] cards = { 1, 1, 1, 1000000 };
    int jokers = 1000000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case63() {
    int[] cards = { 490000001, 490000002, 490000003, 490000007, 500000000 };
    int jokers = 500000000;
    assertEquals(592000002, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case64() {
    int[] cards = { 59475, 68237, 56303, 87177, 92318, 90893, 65164, 61990, 67419, 65088, 91487, 99098, 63518, 94527, 56230, 88558, 81539, 82852, 53553, 96136, 51615, 61983, 93885, 92770, 92583, 91693, 86938, 66345, 88199, 92828, 81734, 65583, 79829, 69544, 93576, 95937, 96011, 86793, 85734, 54050, 57488, 58443, 89607, 65462, 95583, 67724, 89369, 72568, 80958, 54313 };
    int jokers = 1000000;
    assertEquals(62544, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case65() {
    int[] cards = { 3, 3, 4 };
    int jokers = 10000000;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case66() {
    int[] cards = { 40877, 18411599, 6314998, 26420500, 19111493, 15676828, 11443566, 29269926, 26881114, 24390608, 5687885, 28060565, 23211157, 16776519, 9931117, 489527, 2986015, 11906174, 4812519, 5419692, 32293827, 14560188, 3890294, 152541, 291124, 12344854, 17368737, 18659852, 19658846, 19835315, 5430659, 21660822, 14726687, 11503386, 1863393, 19852264, 25589999, 26220103, 16983895, 9864318, 28616891, 23739567, 31228034, 30242001, 17619981, 4650008, 15095577, 7687867, 28168241, 6847396 };
    int jokers = 500000000;
    assertEquals(193418, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case67() {
    int[] cards = { 5 };
    int jokers = 5;
    assertEquals(10, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case68() {
    int[] cards = { 500000000 };
    int jokers = 500000000;
    assertEquals(1000000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case69() {
    int[] cards = { 18823, 127123, 1271, 1277, 51726, 5775, 1773, 1884, 1751, 3717, 4661, 38192, 128771, 1883199, 1773 };
    int jokers = 19889;
    assertEquals(1945, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case70() {
    int[] cards = { 1000, 1000, 1000 };
    int jokers = 10000000;
    assertEquals(1500, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case71() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 496000000, 496000000, 496000000, 496000000, 496000000, 496000000, 496000000, 496000000, 500000000, 500000000, 500000000, 499999999, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 496000000, 496000000, 496000000, 496000000, 496000000, 496000000, 496000000, 494543534, 500000000, 500000000, 500000000, 499999999 };
    int jokers = 500000000;
    assertEquals(509875989, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case72() {
    int[] cards = { 500000000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int jokers = 15;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case73() {
    int[] cards = { 500000000, 499999996, 499999999, 460000001 };
    int jokers = 494534686;
    assertEquals(613633670, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case74() {
    int[] cards = { 4, 4, 4, 4 };
    int jokers = 1000;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case75() {
    int[] cards = { 1, 1, 1, 7 };
    int jokers = 8;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case76() {
    int[] cards = { 2, 2, 8 };
    int jokers = 10;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case77() {
    int[] cards = { 1, 1, 1, 1, 1, 1 };
    int jokers = 500000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case78() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 500000000, 499999999, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 100000001, 100000000, 99999999, 99999998, 123456789, 87654321, 123, 234, 345, 456, 567, 678, 789, 11, 13, 100000000, 456345234, 45454, 35353, 987, 876, 765, 654, 543, 432, 321, 0 };
    int jokers = 499999999;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case79() {
    int[] cards = { 2, 2, 2, 3, 3, 3, 15000, 10000 };
    int jokers = 1000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case80() {
    int[] cards = { 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000, 3442342, 123123123, 342334, 2342343, 4334344, 3434231, 34343434, 1, 1, 500000000 };
    int jokers = 500000000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case81() {
    int[] cards = { 0, 0, 0, 0, 0, 500000000 };
    int jokers = 500000000;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case82() {
    int[] cards = { 0, 0 };
    int jokers = 10;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case83() {
    int[] cards = { 4, 5 };
    int jokers = 1;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case84() {
    int[] cards = { 1, 4, 6, 6, 6, 6 };
    int jokers = 1000000;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case85() {
    int[] cards = { 1 };
    int jokers = 5;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case86() {
    int[] cards = { 1, 2, 3, 4 };
    int jokers = 9999;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case87() {
    int[] cards = { 10, 8, 6, 561, 21 };
    int jokers = 20;
    assertEquals(12, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case88() {
    int[] cards = { 0, 0 };
    int jokers = 100000;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case89() {
    int[] cards = { 500000000, 400000000, 30, 20, 25 };
    int jokers = 455445445;
    assertEquals(37, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case90() {
    int[] cards = { 1, 1, 6, 7, 1, 1 };
    int jokers = 1000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case91() {
    int[] cards = { 3, 3, 3 };
    int jokers = 3;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case92() {
    int[] cards = { 1, 2 };
    int jokers = 10000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case93() {
    int[] cards = { 1, 2, 3 };
    int jokers = 10000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case94() {
    int[] cards = { 500000000, 18, 9, 7, 12, 15, 3, 1, 2, 1, 0 };
    int jokers = 500000000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case95() {
    int[] cards = { 0 };
    int jokers = 1;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case96() {
    int[] cards = { 2257151, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 39485105, 33929299 };
    int jokers = 46143145;
    assertEquals(36186450, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case97() {
    int[] cards = { 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999 };
    int jokers = 499999996;
    assertEquals(509999998, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case98() {
    int[] cards = { 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(666666666, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case99() {
    int[] cards = { 2, 3, 4, 5, 6 };
    int jokers = 5;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case100() {
    int[] cards = { 2, 2, 2 };
    int jokers = 100;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case101() {
    int[] cards = { 1, 1, 4 };
    int jokers = 8;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case102() {
    int[] cards = { 1, 2, 3 };
    int jokers = 4;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case103() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 499999999;
    assertEquals(509999999, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case104() {
    int[] cards = { 1, 1, 1, 2 };
    int jokers = 10;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case105() {
    int[] cards = { 3, 1, 1 };
    int jokers = 4;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case106() {
    int[] cards = { 1000, 1000, 1000, 1000 };
    int jokers = 1000000;
    assertEquals(1333, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case107() {
    int[] cards = { 5, 3, 2, 1 };
    int jokers = 10000000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case108() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 490000000, 490000000, 490000000, 490000000, 490000000, 490000000, 490000000, 490000000, 490000000, 490000000, 480000000, 480000000, 480000000, 480000000, 480000000, 480000000, 480000000, 480000000, 480000000, 480000000, 470000000, 470000000, 470000000, 470000000, 470000000, 470000000, 470000000, 470000000, 470000000, 470000000, 460000000, 460000000, 460000000, 460000000, 460000000, 460000000, 460000000, 460000000, 460000000, 460000000 };
    int jokers = 475000000;
    assertEquals(485833333, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case109() {
    int[] cards = { 3, 4, 5, 6 };
    int jokers = 10000;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case110() {
    int[] cards = { 100, 101, 100000 };
    int jokers = 300;
    assertEquals(201, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case111() {
    int[] cards = { 1, 2 };
    int jokers = 10;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case112() {
    int[] cards = { 4, 4, 4 };
    int jokers = 100000;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case113() {
    int[] cards = { 200000000, 200000001, 200000002, 200000003 };
    int jokers = 200000000;
    assertEquals(250000001, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case114() {
    int[] cards = { 33, 23, 14 };
    int jokers = 41;
    assertEquals(35, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case115() {
    int[] cards = { 1, 500000000 };
    int jokers = 500000000;
    assertEquals(500000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case116() {
    int[] cards = { 5, 6, 7 };
    int jokers = 100;
    assertEquals(9, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case117() {
    int[] cards = { 2, 2 };
    int jokers = 100;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case118() {
    int[] cards = { 40, 40, 40 };
    int jokers = 3;
    assertEquals(41, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case119() {
    int[] cards = { 3, 3, 3, 3, 3 };
    int jokers = 5;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case120() {
    int[] cards = { 500000000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int jokers = 500000000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case121() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(571428571, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case122() {
    int[] cards = { 3741, 2358, 21789, 537, 34812, 2751 };
    int jokers = 2718;
    assertEquals(2788, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case123() {
    int[] cards = { 200, 300, 400 };
    int jokers = 111111;
    assertEquals(450, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case124() {
    int[] cards = { 10000, 9999, 9998, 9997, 9997, 9995, 9996, 9995, 9993, 9991, 9989, 9980, 9979, 9980, 9500, 8990, 10000, 10000 };
    int jokers = 9000;
    assertEquals(10409, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case125() {
    int[] cards = { 10, 8, 6, 561, 21, 50000000, 10035435 };
    int jokers = 56146540;
    assertEquals(12, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case126() {
    int[] cards = { 4, 4, 4, 4 };
    int jokers = 50000000;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case127() {
    int[] cards = { 999999, 10001, 999, 765, 100001 };
    int jokers = 50;
    assertEquals(815, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case128() {
    int[] cards = { 7, 7, 7, 7, 7 };
    int jokers = 7;
    assertEquals(8, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case129() {
    int[] cards = { 10, 15 };
    int jokers = 300;
    assertEquals(25, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case130() {
    int[] cards = { 10, 10, 10 };
    int jokers = 1000;
    assertEquals(15, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case131() {
    int[] cards = { 8, 8 };
    int jokers = 8;
    assertEquals(12, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case132() {
    int[] cards = { 1, 0, 0 };
    int jokers = 2;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case133() {
    int[] cards = { 5, 5, 5, 5, 5 };
    int jokers = 5000000;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case134() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 411172541, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 491876541, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(508060981, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case135() {
    int[] cards = { 10, 10, 10, 10, 10, 10 };
    int jokers = 1000;
    assertEquals(12, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case136() {
    int[] cards = { 10000000, 10000001, 20000003 };
    int jokers = 50000000;
    assertEquals(20000001, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case137() {
    int[] cards = { 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 0 };
    int jokers = 500000000;
    assertEquals(50000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case138() {
    int[] cards = { 4, 4, 4, 4 };
    int jokers = 4;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case139() {
    int[] cards = { 0, 250000000, 500000000 };
    int jokers = 500000000;
    assertEquals(250000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case140() {
    int[] cards = { 2, 2 };
    int jokers = 2;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case141() {
    int[] cards = { 3, 3, 3 };
    int jokers = 20;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case142() {
    int[] cards = { 0, 0 };
    int jokers = 1000;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case143() {
    int[] cards = { 5, 5, 5 };
    int jokers = 10;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case144() {
    int[] cards = { 7 };
    int jokers = 20;
    assertEquals(27, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case145() {
    int[] cards = { 3, 1, 6, 7 };
    int jokers = 500000000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case146() {
    int[] cards = { 3, 3, 3, 3 };
    int jokers = 4;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case147() {
    int[] cards = { 10, 10, 10, 10 };
    int jokers = 99999;
    assertEquals(13, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case148() {
    int[] cards = { 10, 10, 10 };
    int jokers = 500000000;
    assertEquals(15, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case149() {
    int[] cards = { 4, 4, 4, 10, 10 };
    int jokers = 20;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case150() {
    int[] cards = { 1, 1 };
    int jokers = 4;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case151() {
    int[] cards = { 50, 50, 50, 50, 50 };
    int jokers = 400000000;
    assertEquals(62, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case152() {
    int[] cards = { 3, 3, 4, 5 };
    int jokers = 10;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case153() {
    int[] cards = { 36629216, 37215528, 37379060, 40873980, 49646416, 69909134, 80835680, 82426872 };
    int jokers = 2000000;
    assertEquals(37741268, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case154() {
    int[] cards = { 200000000, 200000001, 200000002, 200000003, 200000004 };
    int jokers = 200000000;
    assertEquals(240000002, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case155() {
    int[] cards = { 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000, 50000000 };
    int jokers = 500000000;
    assertEquals(51020408, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case156() {
    int[] cards = { 1000, 1000, 1000, 1000, 1000 };
    int jokers = 1000;
    assertEquals(1200, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case157() {
    int[] cards = { 100000000, 100000000 };
    int jokers = 100000000;
    assertEquals(150000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case158() {
    int[] cards = { 2, 3, 4, 5, 6 };
    int jokers = 999;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case159() {
    int[] cards = { 1, 2 };
    int jokers = 100;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case160() {
    int[] cards = { 1, 2, 3, 5, 500000000 };
    int jokers = 500000000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case161() {
    int[] cards = { 10, 11, 12, 13, 14, 15, 16 };
    int jokers = 10;
    assertEquals(14, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case162() {
    int[] cards = { 1, 1, 1, 2, 2 };
    int jokers = 5;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case163() {
    int[] cards = { 250000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(506410256, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case164() {
    int[] cards = { 7, 7, 7, 8, 8, 9, 9, 10, 16 };
    int jokers = 1000;
    assertEquals(9, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case165() {
    int[] cards = { 5, 3, 2, 4, 5, 76, 84, 3 };
    int jokers = 0;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case166() {
    int[] cards = { 6, 6, 6, 100 };
    int jokers = 500000000;
    assertEquals(9, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case167() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(522727272, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case168() {
    int[] cards = { 10, 10, 10 };
    int jokers = 15;
    assertEquals(15, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case169() {
    int[] cards = { 100, 101, 100, 999, 9999, 4258, 44457, 77787, 787, 454, 787878 };
    int jokers = 19959782;
    assertEquals(150, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case170() {
    int[] cards = { 1, 1, 1, 1, 15 };
    int jokers = 60;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case171() {
    int[] cards = { 2, 2 };
    int jokers = 24;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case172() {
    int[] cards = { 3, 3, 4 };
    int jokers = 5;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case173() {
    int[] cards = { 0 };
    int jokers = 5;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case174() {
    int[] cards = { 1, 1, 20 };
    int jokers = 100;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case175() {
    int[] cards = { 499999999, 499999999, 499999999, 499999999, 499999999 };
    int jokers = 499999999;
    assertEquals(599999998, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case176() {
    int[] cards = { 1, 1, 3 };
    int jokers = 4;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case177() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 0 };
    int jokers = 500000000;
    assertEquals(500000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case178() {
    int[] cards = { 500000000, 400000000, 200000000, 100000000, 300000000 };
    int jokers = 500000000;
    assertEquals(300000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case179() {
    int[] cards = { 450000000, 450000100, 450000200, 450000300, 450001000, 450000900, 450000800, 450000700, 450000600, 450000500, 450000400, 450000350, 450002000 };
    int jokers = 500000;
    assertEquals(450039065, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case180() {
    int[] cards = { 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 499999999, 299999999, 399999999 };
    int jokers = 499999999;
    assertEquals(519999998, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case181() {
    int[] cards = { 1, 2 };
    int jokers = 500000000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case182() {
    int[] cards = { 0 };
    int jokers = 0;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case183() {
    int[] cards = { 1, 2 };
    int jokers = 3;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case184() {
    int[] cards = { 9, 9, 9, 9 };
    int jokers = 12;
    assertEquals(12, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case185() {
    int[] cards = { 0, 0, 10 };
    int jokers = 4;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case186() {
    int[] cards = { 100, 100, 100, 100 };
    int jokers = 40;
    assertEquals(110, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case187() {
    int[] cards = { 1, 1, 10 };
    int jokers = 3;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case188() {
    int[] cards = { 3, 4, 5 };
    int jokers = 6;
    assertEquals(6, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case189() {
    int[] cards = { 1, 1, 2, 3 };
    int jokers = 1000000;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case190() {
    int[] cards = { 2, 3, 3 };
    int jokers = 100000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case191() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 123456;
    assertEquals(500002469, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case192() {
    int[] cards = { 1, 1, 1, 4 };
    int jokers = 9;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case193() {
    int[] cards = { 5, 5 };
    int jokers = 10;
    assertEquals(10, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case194() {
    int[] cards = { 100, 100 };
    int jokers = 5;
    assertEquals(102, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case195() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(520833333, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case196() {
    int[] cards = { 5000000, 5000000, 4000000, 6000000, 7000000, 4567868, 453212, 3578694, 97897898, 45645678, 14725725 };
    int jokers = 499999999;
    assertEquals(4015953, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case197() {
    int[] cards = { 2, 3, 5 };
    int jokers = 4;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case198() {
    int[] cards = { 101, 102, 103 };
    int jokers = 3;
    assertEquals(103, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case199() {
    int[] cards = { 400000000, 400000003, 500000000, 4123455, 43343334, 43343334, 43341334, 43143334, 13343334, 23343334, 41343334, 13343334, 43343334, 443433478, 500000000, 89898898, 12343, 35355445, 766776, 35155445, 35055445, 37355445, 343434, 899878 };
    int jokers = 500000000;
    assertEquals(355777, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case200() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(512195121, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case201() {
    int[] cards = { 5, 6, 7, 8, 9, 10 };
    int jokers = 3;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case202() {
    int[] cards = { 1, 5, 5, 100, 100 };
    int jokers = 1000000;
    assertEquals(5, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case203() {
    int[] cards = { 4, 5, 6 };
    int jokers = 6;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case204() {
    int[] cards = { 2, 2, 2, 2 };
    int jokers = 1000;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case205() {
    int[] cards = { 1, 1 };
    int jokers = 100000;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case206() {
    int[] cards = { 50, 51 };
    int jokers = 1;
    assertEquals(51, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case207() {
    int[] cards = { 3, 3, 3 };
    int jokers = 10000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case208() {
    int[] cards = { 10, 10, 10 };
    int jokers = 20;
    assertEquals(15, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case209() {
    int[] cards = { 2, 3, 4 };
    int jokers = 5;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case210() {
    int[] cards = { 0 };
    int jokers = 13;
    assertEquals(13, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case211() {
    int[] cards = { 1, 1, 1, 1, 2 };
    int jokers = 1000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case212() {
    int[] cards = { 9, 10, 11, 12 };
    int jokers = 200;
    assertEquals(14, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case213() {
    int[] cards = { 4, 5, 6 };
    int jokers = 100;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case214() {
    int[] cards = { 1, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(500000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case215() {
    int[] cards = { 3, 4 };
    int jokers = 10;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case216() {
    int[] cards = { 1, 1 };
    int jokers = 1000000;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case217() {
    int[] cards = { 2, 4, 4, 4 };
    int jokers = 5000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case218() {
    int[] cards = { 300000000, 300000001, 300000002, 300000003, 300000004, 300000005, 300000006, 300000007, 300000008, 300000009, 400000000, 400000000, 400000000, 400000000, 400000000, 400000000, 400000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000, 300000000 };
    int jokers = 450000000;
    assertEquals(310000001, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case219() {
    int[] cards = { 234, 4532, 111, 17, 909, 645, 34235, 3421, 9, 22, 13454 };
    int jokers = 4503;
    assertEquals(24, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case220() {
    int[] cards = { 10, 10, 10 };
    int jokers = 10;
    assertEquals(13, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case221() {
    int[] cards = { 50, 50, 50, 50, 50, 60 };
    int jokers = 400000000;
    assertEquals(62, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case222() {
    int[] cards = { 1, 0, 0 };
    int jokers = 1000;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case223() {
    int[] cards = { 0, 1, 2 };
    int jokers = 0;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case224() {
    int[] cards = { 2, 2 };
    int jokers = 1000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case225() {
    int[] cards = { 123456789, 321654987, 333444555, 111222333, 222333444, 444555666, 444333222, 333222111, 111999888 };
    int jokers = 344355366;
    assertEquals(173339505, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case226() {
    int[] cards = { 481964, 375105, 805739, 494426, 302932, 149913, 361663, 64287, 984870, 909404, 26350, 750888, 315721, 670733, 901153, 793373, 94615, 300103, 552318, 55672, 737067, 498846, 860779, 931250, 290060, 787433, 91462, 831000, 560442, 120440, 548133, 682104, 736278, 170808, 27905, 165389, 213774, 136093, 929046, 806588, 23102, 474996, 147068, 734272, 804011, 282090, 562751, 417517, 294102, 445616 };
    int jokers = 324324543;
    assertEquals(38678, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case227() {
    int[] cards = { 0, 0, 1 };
    int jokers = 2;
    assertEquals(0, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case228() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 5000;
    assertEquals(500000833, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case229() {
    int[] cards = { 1, 1, 1 };
    int jokers = 1000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case230() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1 };
    int jokers = 500000000;
    assertEquals(1, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case231() {
    int[] cards = { 2 };
    int jokers = 5;
    assertEquals(7, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case232() {
    int[] cards = { 100, 101, 102, 103, 10000 };
    int jokers = 700;
    assertEquals(135, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case233() {
    int[] cards = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int jokers = 10000;
    assertEquals(111, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case234() {
    int[] cards = { 2, 2, 4 };
    int jokers = 5000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case235() {
    int[] cards = { 2, 2 };
    int jokers = 10000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case236() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(510869565, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case237() {
    int[] cards = { 3, 3, 7 };
    int jokers = 3;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case238() {
    int[] cards = { 3, 3, 3, 4 };
    int jokers = 3;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case239() {
    int[] cards = { 1, 1, 3, 4 };
    int jokers = 4;
    assertEquals(2, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case240() {
    int[] cards = { 4, 4 };
    int jokers = 10;
    assertEquals(8, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case241() {
    int[] cards = { 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(545454545, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case242() {
    int[] cards = { 100, 100, 2, 3, 4, 9, 111, 3, 999 };
    int jokers = 10000;
    assertEquals(4, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case243() {
    int[] cards = { 1, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000, 500000000 };
    int jokers = 500000000;
    assertEquals(500000000, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case244() {
    int[] cards = { 383282690, 44683266, 185210335, 146366464, 495417444, 408214433, 460439854, 362414541, 139280080, 361045535, 191805158, 431673452, 265028925, 430096963, 413205721, 348357544, 342142447, 14574873, 93549435, 286274760, 401686631, 263247611, 222254232, 142314231, 350905186, 214252401, 356214249, 87940568, 98274149, 89149868, 420762639, 269163709, 386554827, 13529006, 86973200, 279117279, 17245894, 204545747, 160832692, 355627440, 345232484, 193647446, 422992375, 340967896, 215862898, 147514360, 484588979, 36508969, 132133122, 324901874 };
    int jokers = 16926604;
    assertEquals(20758792, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case245() {
    int[] cards = { 200000000, 210000000, 220000000, 230000000, 240000000, 200000000, 200000000, 200000000, 200000000, 200000000, 200000000, 200000000, 200000000, 200000000, 200200000, 200000000, 200000000, 200000000, 380006000, 400000000, 490000111 };
    int jokers = 432555666;
    assertEquals(215014285, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case246() {
    int[] cards = { 1, 102 };
    int jokers = 50000;
    assertEquals(103, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case247() {
    int[] cards = { 2, 2, 2 };
    int jokers = 10000;
    assertEquals(3, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case248() {
    int[] cards = { 10, 10, 15 };
    int jokers = 12;
    assertEquals(15, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

  @Test
  public void case249() {
    int[] cards = { 10, 10, 10, 20 };
    int jokers = 6;
    assertEquals(12, compilingdeckswithjokers.maxCompleteDecks(cards, jokers));
  }

}
