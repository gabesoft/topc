package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class YetAnotherORProblemTest {
  YetAnotherORProblem yetanotherorproblem = new YetAnotherORProblem();

  @Test
  public void case1() {
    long[] R = { 3L, 5L };
    assertEquals(15, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case2() {
    long[] R = { 3L, 3L, 3L };
    assertEquals(16, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case3() {
    long[] R = { 1L, 128L };
    assertEquals(194, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case4() {
    long[] R = { 26L, 74L, 25L, 30L };
    assertEquals(8409, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case5() {
    long[] R = { 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L };
    assertEquals(161955037, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case6() {
    long[] R = { 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L, 1000000000000000000L };
    assertEquals(990348470, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case7() {
    long[] R = { 1L, 1L };
    assertEquals(3, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case8() {
    long[] R = { 1L, 2L };
    assertEquals(5, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case9() {
    long[] R = { 1L, 3L };
    assertEquals(6, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case10() {
    long[] R = { 1L, 100000000000000L };
    assertEquals(998650011, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case11() {
    long[] R = { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L };
    assertEquals(11, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case12() {
    long[] R = { 486211148307164070L, 501974443494127483L, 546109314111885682L, 25345366503733289L, 467109698224593900L, 773245526169189607L, 255302906723634372L, 396294198631725069L, 502394460171932757L, 925946187501080508L };
    assertEquals(969176119, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case13() {
    long[] R = { 850341934789835835L, 140906788628005596L, 867764780898644033L, 662426890409338628L, 133999403774198975L, 698982670257830763L, 642352388451400490L, 696393751092254370L, 239102317172067966L, 247872578895163570L };
    assertEquals(743496776, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case14() {
    long[] R = { 937508594066117248L, 980092273090134188L, 677010200342741556L, 365028454416048405L, 143563413081327338L, 615967991662629691L, 278038892600093731L, 145633846551401351L, 191144690724546952L, 278872880611125588L };
    assertEquals(679561707, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case15() {
    long[] R = { 894046344715134069L, 347687198792039840L, 719538930376619224L, 99075637843956381L, 335722352840844417L, 512845350869404159L, 600849075685463247L, 553506913669576251L, 654932379060027147L, 8593902250271113L };
    assertEquals(11875638, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case16() {
    long[] R = { 683066667926680470L, 556248935248633525L, 453474558769328097L, 475065863843290951L, 850745313582021854L, 204929657709514607L, 764975648555601843L, 523551236768895619L, 606238530649926101L, 269225426653479939L };
    assertEquals(988699198, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case17() {
    long[] R = { 937928638053108520L, 440742153764585425L, 631901608425066777L, 409375337491295697L, 55821926214613369L, 216039497982178404L, 980928693082282013L, 97866237585466160L, 108946666999987281L, 367722142884809048L };
    assertEquals(251942611, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case18() {
    long[] R = { 112245628696232905L, 392790401510825741L, 747015484314669905L, 267403993190812779L, 180598810636772899L, 78249002023528552L, 43678818172702840L, 587096233706243036L, 697285092765355726L, 533508901985030046L };
    assertEquals(91153622, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case19() {
    long[] R = { 82L, 52L, 85L, 86L };
    assertEquals(50421, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case20() {
    long[] R = { 602L, 13L, 803L, 935L };
    assertEquals(2144657, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case21() {
    long[] R = { 602L, 737L, 700L };
    assertEquals(778636, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case22() {
    long[] R = { 286L, 820L, 288L };
    assertEquals(347619, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case23() {
    long[] R = { 781L, 583L, 619L, 108L };
    assertEquals(3605293, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case24() {
    long[] R = { 751L, 858L, 276L, 281L };
    assertEquals(4191859, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case25() {
    long[] R = { 987L, 437L };
    assertEquals(37515, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case26() {
    long[] R = { 528L, 118L, 923L, 500L };
    assertEquals(2862567, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case27() {
    long[] R = { 550L, 41L };
    assertEquals(5423, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case28() {
    long[] R = { 249L, 870L, 81L, 48L };
    assertEquals(621007, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case29() {
    long[] R = { 531115030899290881L, 947601149273011713L, 991349567020840193L };
    assertEquals(704948445, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case30() {
    long[] R = { 514701342182032257L, 551137292578942401L };
    assertEquals(168651770, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case31() {
    long[] R = { 571879271664657217L, 768393171830683393L, 664062644097263361L, 355743360981049217L };
    assertEquals(956595861, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case32() {
    long[] R = { 281942348671178177L, 296524174576598401L, 621221659367249793L, 789309979030026113L };
    assertEquals(484600327, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case33() {
    long[] R = { 52814234944074561L, 167665818550075009L };
    assertEquals(199513113, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case34() {
    long[] R = { 754547046746258817L, 759330137062651777L };
    assertEquals(673512845, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case35() {
    long[] R = { 682980468448377345L, 193548385845690337L, 489415678812105025L, 900842041599889025L };
    assertEquals(573655195, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case36() {
    long[] R = { 956152983057168257L, 685066470136012289L, 423533785513627777L, 801762889749067777L };
    assertEquals(535218139, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case37() {
    long[] R = { 529582270537187201L, 737236092366456321L, 678115500642184705L, 646531872293652225L };
    assertEquals(469886763, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case38() {
    long[] R = { 30820494264921173L, 123529810047987905L, 239192881194985601L };
    assertEquals(972375168, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case39() {
    long[] R = { 610672758913349377L, 682130155468148225L, 355306369015803905L, 568446742487323201L, 602170999880562177L, 545440606274798529L };
    assertEquals(374282364, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case40() {
    long[] R = { 94663704934456193L, 11022267787787255L, 623270779903079425L, 718053191054786561L, 757284307425175553L, 838510416841380481L };
    assertEquals(519589403, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case41() {
    long[] R = { 370823944597555393L, 959817906078117505L, 661926524832346497L, 375339575752686529L, 854592808273831553L, 967989738817605505L, 10180887591681565L };
    assertEquals(420329606, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case42() {
    long[] R = { 548786640528232257L, 230468608997888577L, 291036470589611457L, 602010944762470401L, 989934578970582145L, 535510500688701185L };
    assertEquals(360900708, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case43() {
    long[] R = { 990989409908369793L, 369219186497175873L, 672493243651861377L, 64729355504270945L, 266672080077714145L, 927428625227020417L };
    assertEquals(489971662, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case44() {
    long[] R = { 484205650146120513L, 994843496676061697L, 81080301795162577L, 586634036715579137L, 907819667623232769L, 661522450006260481L, 598838517595794817L };
    assertEquals(361203554, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case45() {
    long[] R = { 467779822377700545L, 777699403526018305L, 913949833525302145L, 222652993249928161L, 226651140659680513L, 447964742094548737L };
    assertEquals(807307128, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case46() {
    long[] R = { 270842110321156353L, 32222913565892465L, 280500068910451201L, 216571934306577185L, 996770687519372929L, 383226433576174273L, 212193546213289345L };
    assertEquals(315590430, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case47() {
    long[] R = { 583243144536534401L, 602075641395925761L, 550178961838258625L, 646240318537363585L, 203794790548301185L, 518030629532349825L };
    assertEquals(619847316, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case48() {
    long[] R = { 915198356369810305L, 547981906165575745L, 552660027899496065L, 559744664424480129L, 694182369981934593L };
    assertEquals(105822572, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case49() {
    long[] R = { 953464322231618433L, 424597586603095105L, 802766948182089729L, 986508967365234177L, 655558074561796993L, 792713312977855361L, 290227543890245633L, 574678888784088321L, 781981828042526977L };
    assertEquals(42732412, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case50() {
    long[] R = { 19564963732824793L, 731320615399862913L, 374075907989330881L, 862559090482217089L, 449728360128615617L, 480016004369430721L, 767331865069813377L, 966052224255870337L, 972090874302522881L, 275638593717801985L };
    assertEquals(755106812, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case51() {
    long[] R = { 415624240298450369L, 155434710298624225L, 77234208294951537L, 955025955104481409L, 576829691483942017L, 996346446483722881L, 839069545243658497L, 236466444963801537L, 844176723060579329L };
    assertEquals(108049657, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case52() {
    long[] R = { 226764098559482657L, 804264921332996865L, 292962656324613249L, 895831173544852481L, 866397406014807297L, 304505006815591873L, 98475309119277265L, 724127577618571521L, 716709661493862657L };
    assertEquals(552108928, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case53() {
    long[] R = { 434259918875988225L, 177260966212917537L, 217991183696925825L, 835315432368728833L, 390254167392124609L, 230841016457116289L, 715981789964010497L, 641381713093305857L };
    assertEquals(867282434, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case54() {
    long[] R = { 310273763549385985L, 285078427524640961L, 846272581803176577L, 353299536964801089L, 294726449174559681L, 482375751789420609L, 93212649453745745L, 709085599163968897L, 827528090227223681L };
    assertEquals(559247321, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case55() {
    long[] R = { 36357859193478113L, 946275254206211841L, 705497036630788225L, 173248715244439073L, 616460779730903169L, 589606117646702849L, 331601022376007297L, 981886988381499137L, 410992156039859265L, 632952779397591937L };
    assertEquals(805058687, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case56() {
    long[] R = { 856453635950069121L, 919588957759670145L, 446024376193420737L, 725091595753653505L, 237062425568849601L, 60738596790608665L, 625002368978720513L, 293297730890701441L, 69185693980055809L, 601897409503310337L };
    assertEquals(839797796, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case57() {
    long[] R = { 230336259972718785L, 225746599601057025L, 722781284958371201L, 222501611105992545L, 148521421203463137L, 522397652544219329L, 420355024778754497L, 788430747170501249L, 15142121967169687L };
    assertEquals(250831300, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case58() {
    long[] R = { 4085864728089251L, 537317396930776833L, 975085695935915649L, 798440260017564673L, 501316123965390913L, 927487449637385729L, 490944664383960769L, 940511086234745729L, 395148759760898561L, 134517657051514529L };
    assertEquals(688870764, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case59() {
    long[] R = { 67108864L, 33554432L, 4503599627370496L, 4503599627370496L, 1099511627776L, 8589934592L, 4096L, 65536L, 68719476736L, 8L };
    assertEquals(611826201, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case60() {
    long[] R = { 4194304L, 2251799813685248L, 268435456L, 1125899906842624L, 1125899906842624L, 16777216L, 140737488355328L, 2147483648L, 1024L };
    assertEquals(63444929, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case61() {
    long[] R = { 1048576L, 536870912L, 35184372088832L, 536870912L, 34359738368L, 32768L, 268435456L, 35184372088832L };
    assertEquals(636970334, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case62() {
    long[] R = { 1099511627776L, 524288L, 8388608L, 8L, 16L, 67108864L, 33554432L, 131072L };
    assertEquals(983884892, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case63() {
    long[] R = { 144115188075855872L, 65536L, 8589934592L, 4096L, 72057594037927936L, 8388608L, 33554432L, 262144L, 65536L };
    assertEquals(276635641, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case64() {
    long[] R = { 268435456L, 8L, 524288L, 288230376151711744L, 32768L, 33554432L, 17592186044416L, 2147483648L };
    assertEquals(517162972, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case65() {
    long[] R = { 1024L, 1073741824L, 137438953472L, 17179869184L, 8589934592L, 33554432L, 262144L, 512L };
    assertEquals(964350662, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case66() {
    long[] R = { 134217728L, 512L, 2097152L, 1L, 4L, 1073741824L, 16777216L, 281474976710656L, 32L, 2199023255552L };
    assertEquals(606433757, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case67() {
    long[] R = { 1L, 16777216L, 1125899906842624L, 36028797018963968L, 33554432L, 18014398509481984L, 17592186044416L, 274877906944L, 8192L };
    assertEquals(593553735, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case68() {
    long[] R = { 137438953472L, 4294967296L, 65536L, 64L, 140737488355328L, 128L, 256L, 256L, 512L, 576460752303423488L };
    assertEquals(698154063, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case69() {
    long[] R = { 130L, 8796126580736L, 4096L, 274877906944L };
    assertEquals(787531764, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case70() {
    long[] R = { 2199023255556L, 132104L, 2147483648L, 17592186044736L };
    assertEquals(984712403, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case71() {
    long[] R = { 35184372089344L, 18014432936361984L, 16388L, 9895671758976L, 576462951326744592L, 8L, 633318697598978L, 4644337115987968L, 144115188210073600L, 262144L };
    assertEquals(847226242, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case72() {
    long[] R = { 1099511631872L, 32L, 70918768427008L, 276220084224L };
    assertEquals(841342628, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case73() {
    long[] R = { 8796093022225L, 1024L, 9007233614479360L };
    assertEquals(729701138, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case74() {
    long[] R = { 262145L, 2199031644160L, 576478344489533504L, 2147483648L, 545259520L, 262144L, 4503600709509120L, 1048577L, 3298534883360L, 8589937666L };
    assertEquals(301765921, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case75() {
    long[] R = { 1125899906842624L, 4504699139014720L, 144396663054663680L, 68719509504L, 1266637395200000L, 262144L, 1052928L, 1126999418486784L, 289356276058562592L };
    assertEquals(563322887, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case76() {
    long[] R = { 139586437121L, 562949957648896L, 72057594574798848L, 562949953421312L, 2129920L };
    assertEquals(37654930, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case77() {
    long[] R = { 2162752L, 20266232682905604L, 9007199254741056L, 17179877376L, 1143494240371712L };
    assertEquals(84241184, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case78() {
    long[] R = { 18014402808643712L, 2147483776L };
    assertEquals(232733171, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case79() {
    long[] R = { 1024L, 18014948265295872L, 268437504L, 144115188075855872L, 549756862464L };
    assertEquals(396661272, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case80() {
    long[] R = { 137438953472L, 70377334112776L, 281749854617608L, 576495936675512352L };
    assertEquals(86732404, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case81() {
    long[] R = { 2251812832804864L, 1125899906842624L };
    assertEquals(933283462, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case82() {
    long[] R = { 144115188344291328L, 135172L, 36033469943382018L, 576460752303423488L, 36310340715151360L, 34360803328L };
    assertEquals(456994935, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case83() {
    long[] R = { 9007199254740992L, 145241087982698496L, 540431955284459520L, 585467951558164480L, 24769797950537728L, 360287970189639680L };
    assertEquals(901394256, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case84() {
    long[] R = { 613615449229230080L, 351280770934898688L, 38280596832649216L, 9007199254740992L, 2251799813685248L, 153122387330596864L, 9007199254740992L, 81064793292668928L };
    assertEquals(416673946, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case85() {
    long[] R = { 657525545596092416L, 36028797018963968L, 164381386399023104L, 93449692267937792L, 216172782113783808L, 585467951558164480L, 36028797018963968L };
    assertEquals(465320915, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case86() {
    long[] R = { 686798943174000640L, 109212290963734528L, 72057594037927936L, 41658296553177088L, 612489549322387456L, 592223350999220224L, 42784196460019712L, 797137134044577792L };
    assertEquals(901096207, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case87() {
    long[] R = { 288230376151711744L, 145241087982698496L, 144115188075855872L, 173388585653764096L, 117093590311632896L, 584342051651321856L, 4503599627370496L, 216172782113783808L };
    assertEquals(984638509, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case88() {
    long[] R = { 324259173170675712L, 288230376151711744L, 12384898975268864L, 144115188075855872L, 792633534417207296L, 612489549322387456L, 144115188075855872L };
    assertEquals(368605550, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case89() {
    long[] R = { 36028797018963968L, 65302194596872192L, 40532396646334464L, 4503599627370496L, 622622648483971072L, 594475150812905472L, 292733975779082240L, 666532744850833408L };
    assertEquals(110082755, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case90() {
    long[] R = { 794885334230892544L, 229683580995895296L, 22517998136852480L, 4503599627370496L, 20266198323167232L, 184647584722190336L, 22517998136852480L, 594475150812905472L };
    assertEquals(297645102, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case91() {
    long[] R = { 290482175965396992L, 874824227616718848L, 4503599627370496L, 866942928268820480L, 604608249974489088L, 596726950626590720L, 157625986957967360L, 450359962737049600L, 12384898975268864L };
    assertEquals(724193785, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case92() {
    long[] R = { 290482175965396992L, 731834939447705600L, 292733975779082240L, 216172782113783808L, 433471464134410240L, 648518346341351424L };
    assertEquals(125301651, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case93() {
    long[] R = { 9147936743096320L, 67108864L, 2256197860196352L, 18084767253659648L, 720857432535859200L, 9007199321849856L, 34359738368L, 2684354560L, 8661237760L };
    assertEquals(751423767, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case94() {
    long[] R = { 18874368L, 4483950051328L, 67108864L, 72128237660012544L, 281474976710656L, 2200096997376L, 18155136015663104L, 144186656331661312L, 70368744177664L, 11399775212535808L };
    assertEquals(178118816, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case95() {
    long[] R = { 18014398509481984L, 16777216L, 144185730900426752L, 4299161600L, 6755536880009216L, 4415226380288L, 9895613038592L, 144115224583077888L, 216172782131609600L, 4503608217305088L };
    assertEquals(209449825, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case96() {
    long[] R = { 288802259704217600L, 281475043819520L, 5066549581840384L, 283753054208L, 1125899973951488L, 2256249399803904L, 2289187772432384L, 144115188621115392L, 145523662471036928L, 70514773065728L };
    assertEquals(328377439, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case97() {
    long[] R = { 4194304L, 9042383626829824L, 362592546561458176L, 270532608L, 288230376151711744L, 72057594037927936L, 289074826853744640L, 148618968091852800L, 4194304L };
    assertEquals(763980195, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case98() {
    long[] R = { 45317746130419712L, 612489549326581760L, 12582912L, 144115188075855872L, 1048576L, 576478348784435200L, 649784985078726656L, 2147483648L, 76703030677864448L, 581597670632587264L };
    assertEquals(474517515, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case99() {
    long[] R = { 180146218477813760L, 576460889746571264L, 4503608257150976L, 35433480192L, 1688854155231232L, 281474978807808L, 577586652344483840L, 5075519619989504L, 288230376151711744L, 5070964807172096L };
    assertEquals(562296830, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case100() {
    long[] R = { 35185466802176L, 268435456L, 171807080448L, 288305169249075200L, 67108864L, 288236973775126528L, 36178330600341504L, 18014399583223808L, 22536827273478144L, 72567901650944L };
    assertEquals(576500105, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case101() {
    long[] R = { 549755813888L, 11267795161448448L, 216172784261267456L, 598142916493312L, 17626612891648L, 1116693594112L, 4294967296L, 144396663052566528L, 19140401512316928L, 9570698963976192L };
    assertEquals(640085266, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case102() {
    long[] R = { 11258999068426240L, 8589934592L, 18014399314788352L, 18014403341320192L, 162694735595569152L, 36046406451986432L, 4948083343360L, 2322238653071360L, 585467951561310208L, 19791754559488L };
    assertEquals(479198810, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case103() {
    long[] R = { 43997644980224L, 8797300981760L, 288230376151711744L, 1301821918281728L, 73341892342841344L, 5629499536310272L, 72198331543060480L, 9147937279967232L, 9007199254740992L, 288793330416877568L };
    assertEquals(713200500, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case104() {
    long[] R = { 564222337482752L, 1407374883553280L, 18155136132055040L, 2253998837989376L, 268435456L, 4503668355235840L, 2251801961168896L, 9007199791611904L, 36028797153181696L };
    assertEquals(390194980, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case105() {
    long[] R = { 290517403287158784L, 1660004859904L, 2674023049723904L, 2260598121299968L, 4503737066323968L, 18014398509481984L, 612489549391593472L, 72057594037927936L, 34359738368L, 2233382993920L };
    assertEquals(860842665, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case106() {
    long[] R = { 70892126208L, 72057594574798848L, 2251816993554432L, 35184376283136L, 576460752303423488L, 288230383670001664L, 36301214580736L, 426619369947136L, 4294967296L };
    assertEquals(718980453, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case107() {
    long[] R = { 70371059433472L, 9020393394274304L, 4194304L, 328784797390340096L, 937874828558336000L, 176093659136000L, 108095187149914112L, 2339146563584L, 72128237660012544L };
    assertEquals(263015795, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case108() {
    long[] R = { 18014399591612416L, 17729625063424L, 2251801961168896L, 2147483648L, 2199023321088L, 1073750016L, 33554432L, 108086391056891904L, 8796093022208L };
    assertEquals(378210287, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case109() {
    long[] R = { 72057594037927936L, 17592454483968L, 281475043819520L, 1125899906842624L, 4194304L, 65536L, 69793218560L, 1024L, 4202496L, 70368744177664L };
    assertEquals(131409824, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case110() {
    long[] R = { 144115188075855872L, 4303355904L, 4400195043328L, 17596489400320L, 68719476736L, 131072L, 34359742464L, 10240L, 1073741824L };
    assertEquals(142603706, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case111() {
    long[] R = { 4503668615282688L, 17314086912L, 570425344L, 140738025228288L, 2748779134976L, 8798240505856L, 558345748480L, 36028797018963968L, 562949953486848L };
    assertEquals(581583272, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case112() {
    long[] R = { 2269392536600576L, 2147491840L, 17594333528064L, 4503599628423168L, 562949986979840L, 144115188075855872L, 288230513590665216L, 21474836480L };
    assertEquals(389230807, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case113() {
    long[] R = { 576460752303423488L, 36028797018963968L, 17592739692544L, 75497472L, 18295873487241216L, 563224831393792L, 68992106496L, 576460752303423488L, 134217728L, 2251799822073856L };
    assertEquals(25722158, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case114() {
    long[] R = { 2199023255552L, 18014398509481984L, 20266198323167232L, 36028797018963968L, 1125899915231232L, 4503603922337792L, 274880135168L, 8796101935104L };
    assertEquals(95103521, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case115() {
    long[] R = { 2048L, 18014398509481984L, 2251799813685248L, 549755813888L, 72842645340160L, 8796093022208L, 137440002048L, 2253998836957184L };
    assertEquals(80522044, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case116() {
    long[] R = { 549755813888L, 1125899906875392L, 17408L, 68719493120L, 2814749767106560L, 9007199254740992L, 13510798883160064L, 140874927341568L, 72057594079870976L };
    assertEquals(586749071, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case117() {
    long[] R = { 35184372154368L, 146366987893735424L, 34896613376L, 10133099161583616L, 281474976776192L, 69793218560L, 576460754450907136L, 16384L, 409600L, 1024L };
    assertEquals(532751987, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case118() {
    long[] R = { 1000000000000000000L, 999999999999999989L, 999999999999999965L, 1000000000000000000L, 999999999999999993L, 999999999999999982L, 999999999999999956L, 999999999999999957L, 999999999999999995L };
    assertEquals(69929909, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case119() {
    long[] R = { 146366987893735424L, 999999999999999989L, 576460752303423487L, 1000000000000000000L, 10133099161583616L, 999999999999999982L, 576460752303423490L, 999999999999999957L, 12384898975268864L, 576460752303423488L };
    assertEquals(575448435, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case120() {
    long[] R = { 576460752303423488L, 288230376151711744L, 144115188075855872L, 72057594037927936L, 36028797018963968L, 18014398509481984L, 9007199254740992L, 4503599627370496L, 2251799813685248L, 1125899906842624L };
    assertEquals(219370084, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case121() {
    long[] R = { 576460752303423488L, 1111111111111111L, 144115188075855872L, 72057594037927936L, 36028797018963968L, 18014398509481984L, 9007199254740992L, 4503599627370496L, 2251799813685248L, 1125899906842624L };
    assertEquals(318732939, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case122() {
    long[] R = { 576460752303423488L, 288230376151711744L, 144115188075855872L, 72057594037927936L, 36028797018963968L, 18014398509481984L, 9007199254740992L, 4503599627370496L };
    assertEquals(431422661, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case123() {
    long[] R = { 612499275440640769L, 732381150095815937L, 144115188075855872L, 72057594037927936L, 36028797018963968L, 18014398509481984L, 9007199254740992L, 4503599627370496L, 2251799813685248L };
    assertEquals(224412639, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case124() {
    long[] R = { 576460752303423488L, 288230376151711744L, 231045964591683585L, 344699701299547521L, 36028797018963968L, 18014398509481984L, 9007199254740992L, 4503599627370496L, 2251799813685248L, 1125899906842624L };
    assertEquals(533995859, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case125() {
    long[] R = { 1000000000L, 1000000000L };
    assertEquals(420352509, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case126() {
    long[] R = { 12345678987456526L, 4587546231587956L, 56485231524856975L, 53216548951235687L, 5689745213698521L, 99999999999999999L, 25487546321597856L, 1265489856423154L, 56213548756425879L, 21358777456225876L };
    assertEquals(200091287, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case127() {
    long[] R = { 99988877766655544L, 99988877766655544L, 99988877766655544L, 88877766655544L, 99855544L, 99988877766655544L, 998887776665554L, 999888777655544L, 99988877766655544L, 99988817766655544L };
    assertEquals(420816458, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case128() {
    long[] R = { 1000000000000000000L, 999999999999999999L, 999999999999999999L, 1000000000000000000L, 999999999999999999L, 999999999999999999L, 1000000000000000000L, 999999999999999999L, 999999999999999999L, 1000000000000000000L };
    assertEquals(990309104, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case129() {
    long[] R = { 100000000000000L, 100000000000000000L, 100000000000000000L, 1000000000000000000L, 100000000000000L, 100000000000000L, 100000000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L };
    assertEquals(959835785, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case130() {
    long[] R = { 698592418393878689L, 41176158769631317L, 5928437347348326L, 627483485536712L, 56556167864743L, 1612168692743L, 232947913547L, 41334996277L, 3447279799L, 459298488L };
    assertEquals(747758942, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case131() {
    long[] R = { 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L, 576460752303423488L };
    assertEquals(161955037, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case132() {
    long[] R = { 528108405744583338L, 883492515133062955L, 830551664052244655L, 187638468590969912L, 709640913966518229L, 384525565537843774L, 863679694317552710L, 23364825948747538L, 102901477313730040L, 396366775498890592L };
    assertEquals(467327797, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case133() {
    long[] R = { 100000000000000001L, 100000000000000002L, 100000000000000003L, 100000000000000004L, 100000000000000005L, 100000000000000006L, 100000000000000007L, 100000000000000008L, 100000000000000009L, 100000000000000010L };
    assertEquals(673187124, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case134() {
    long[] R = { 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L, 40000000000000L };
    assertEquals(927135074, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case135() {
    long[] R = { 10000000001230020L, 1000000000132020L, 100010000100100L, 200303000100230020L };
    assertEquals(372675200, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case136() {
    long[] R = { 1382875696L, 1843654050L, 1436430328L, 951656720L, 120033498L };
    assertEquals(620810307, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case137() {
    long[] R = { 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L, 576460752303423487L };
    assertEquals(720959825, yetanotherorproblem.countSequences(R));
  }

  @Test
  public void case138() {
    long[] R = { 718875778883073113L, 902657733719666992L, 100147082697904823L, 918454075161672321L, 206480380521277765L, 861227749240591490L, 582528414116888542L, 189470114334510366L, 144328622062251997L, 585226965461233378L };
    assertEquals(163076795, yetanotherorproblem.countSequences(R));
  }

}