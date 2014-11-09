package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class DigitsSwapTest {
  DigitsSwap digitsswap = new DigitsSwap();

  @Test
  public void case1() {
    String x = "123";
    String y = "321";
    int swaps = 2;
    assertEquals("39483", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case2() {
    String x = "4531";
    String y = "1332";
    int swaps = 0;
    assertEquals("6035292", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case3() {
    String x = "13425";
    String y = "87694";
    int swaps = 99;
    assertEquals("1476187680", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case4() {
    String x = "2872876342876443222";
    String y = "2309482482304823423";
    int swaps = 5;
    assertEquals("6669566046086333877050194232995188906", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case5() {
    String x = "940948";
    String y = "124551";
    int swaps = 4893846;
    assertEquals("133434353148", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case6() {
    String x = "4614232";
    String y = "8168576";
    int swaps = 1;
    assertEquals("37866921973632", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case7() {
    String x = "9954312";
    String y = "4341138";
    int swaps = 1;
    assertEquals("46278912087056", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case8() {
    String x = "493198650286";
    String y = "524865090061";
    int swaps = 69656315;
    assertEquals("258913698078598524407446", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case9() {
    String x = "260661849";
    String y = "337882913";
    int swaps = 4;
    assertEquals("88578661588126537", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case10() {
    String x = "476361542";
    String y = "797372601";
    int swaps = 553689940;
    assertEquals("386140970899455642", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case11() {
    String x = "920014607";
    String y = "677773359";
    int swaps = 1;
    assertEquals("623561632755702913", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case12() {
    String x = "6660380125094";
    String y = "9835120164061";
    int swaps = 456302416;
    assertEquals("66114435687200959941726734", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case13() {
    String x = "139880";
    String y = "977838";
    int swaps = 2;
    assertEquals("168704363040", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case14() {
    String x = "33496";
    String y = "91099";
    int swaps = 1;
    assertEquals("3051624904", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case15() {
    String x = "249925533";
    String y = "574380880";
    int swaps = 1;
    assertEquals("152386107989009040", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case16() {
    String x = "99722828907815";
    String y = "26124258626539";
    int swaps = 33784985;
    assertEquals("2857219685158148717910271085", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case17() {
    String x = "9119762952003";
    String y = "5181953252586";
    int swaps = 233609756;
    assertEquals("47289665732789876615529758", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case18() {
    String x = "41969825549125";
    String y = "78393967997693";
    int swaps = 7;
    assertEquals("3496825168144843525272127485", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case19() {
    String x = "58254416163";
    String y = "35532825361";
    int swaps = 7;
    assertEquals("2129476176141483689443", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case20() {
    String x = "562915";
    String y = "336492";
    int swaps = 345500226;
    assertEquals("195392045680", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case21() {
    String x = "39634";
    String y = "68875";
    int swaps = 75406607;
    assertEquals("2736780750", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case22() {
    String x = "544442930778";
    String y = "630382520372";
    int swaps = 5;
    assertEquals("343210742886137730809416", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case23() {
    String x = "83211325";
    String y = "95122264";
    int swaps = 3;
    assertEquals("7935158709435900", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case24() {
    String x = "60053106";
    String y = "65004549";
    int swaps = 0;
    assertEquals("3903725071579194", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case25() {
    String x = "5168314849207";
    String y = "2607056738492";
    int swaps = 1;
    assertEquals("13624165540916274212575844", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case26() {
    String x = "357983022367";
    String y = "555402606111";
    int swaps = 9;
    assertEquals("198824822807187969260737", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case27() {
    String x = "38301";
    String y = "69038";
    int swaps = 0;
    assertEquals("2644224438", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case28() {
    String x = "489307478371";
    String y = "908345014562";
    int swaps = 3;
    assertEquals("444476768551859599772492", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case29() {
    String x = "66767719162";
    String y = "82765139959";
    int swaps = 5;
    assertEquals("5526039954044037786288", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case30() {
    String x = "74442792";
    String y = "37315785";
    int swaps = 7;
    assertEquals("2782701200651690", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case31() {
    String x = "515951064";
    String y = "530891347";
    int swaps = 1;
    assertEquals("273914551364363208", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case32() {
    String x = "22810315522";
    String y = "97482363035";
    int swaps = 3;
    assertEquals("2576618094619200503270", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case33() {
    String x = "225910850790";
    String y = "834104859254";
    int swaps = 1;
    assertEquals("194415278486784344710660", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case34() {
    String x = "8279617719";
    String y = "2341753324";
    int swaps = 368637198;
    assertEquals("19613042954111525956", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case35() {
    String x = "2456807743136301904293148205593287";
    String y = "4814355268929594505880132227031337";
    int swaps = 3;
    assertEquals("12611042219257837716126148256025093490033577543892642928878825834719", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case36() {
    String x = "2378379391828018486093008763565839483976";
    String y = "4586155196454253268266394562535661446268";
    int swaps = 17;
    assertEquals("11327149934936224176650158228054836385842272040494590854643258163604217132790148", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case37() {
    String x = "6151760024336282343436847398008805";
    String y = "6436392198234023198989135142538928";
    int swaps = 9;
    assertEquals("39596547221895878067943674691147409147054305792678122059339399261040", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case38() {
    String x = "819359798014";
    String y = "755509282450";
    int swaps = 6;
    assertEquals("619276153921191048012540", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case39() {
    String x = "515908387269381033";
    String y = "248015413735856908";
    int swaps = 22021478;
    assertEquals("128194343764000510241187718054898814", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case40() {
    String x = "1789415666667140612149523415231688277126";
    String y = "9494603624588121498245299838698662382627";
    int swaps = 7;
    assertEquals("17068281351964785978530133001423405376640329982332943028947804500516595823890002", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case41() {
    String x = "18020892820";
    String y = "25276787816";
    int swaps = 2;
    assertEquals("457301549038017881120", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case42() {
    String x = "500072552148";
    String y = "846898355155";
    int swaps = 10;
    assertEquals("437558413409963082113910", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case43() {
    String x = "6721499030350";
    String y = "1678364419557";
    int swaps = 4;
    assertEquals("11776092136922110759354950", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case44() {
    String x = "888152324666290";
    String y = "693119955560594";
    int swaps = 3;
    assertEquals("616553661362525123851493776260", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case45() {
    String x = "753912881860249022154442504212";
    String y = "679554034122982278583944698566";
    int swaps = 27;
    assertEquals("512354186363241358366803489945083704281937558761500525359992", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case46() {
    String x = "36471321638328601260546793";
    String y = "27881638761723785858733108";
    int swaps = 8;
    assertEquals("1016880215142688907599665102050021959699284024254194", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case47() {
    String x = "69157334220127702410373959720286708183036202841837";
    String y = "88170488136789555663008823065097228294482725847395";
    int swaps = 3062712;
    assertEquals("6098018701664206934388219362926466174088672573419192054298658183496015648325209630928894470434422495", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case48() {
    String x = "2143104079081407953823210407590";
    String y = "5120989173307660289899942087873";
    int swaps = 26;
    assertEquals("10977447729853728650103776863586284106287677975929961163350010", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case49() {
    String x = "719160336221432605496082740760";
    String y = "829385156688987079158639453823";
    int swaps = 14;
    assertEquals("597483408143268919303561591317524398017030253652299938501360", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case50() {
    String x = "5328164677964192631597";
    String y = "4261762534075531888017";
    int swaps = 5109239;
    assertEquals("22810030456788916560707525774461311990813149", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case51() {
    String x = "3354272672201175918178669926658403783";
    String y = "8125762161157485649843253832706801195";
    int swaps = 9;
    assertEquals("27263176942478869926052310519258435569640047559765492200090768606616920685", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case52() {
    String x = "834031790352912617015229051836886166704989";
    String y = "398756486878095690013558017746707412183571";
    int swaps = 5154630;
    assertEquals("332575721601415582925408193117868012130631832023957530786045993263837367975156095719", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case53() {
    String x = "102788597134713712753445514126633008138169801";
    String y = "193936554050655189622505252067280068306437052";
    int swaps = 16249851;
    assertEquals("20042403874085250264791344577089311078638541295798233511925854449892166917642059020193852", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case54() {
    String x = "9185659265";
    String y = "7321228887";
    int swaps = 234571835;
    assertEquals("67366289716981106055", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case55() {
    String x = "253099511123397233";
    String y = "948439249057476630";
    int swaps = 14;
    assertEquals("243775210887385027474689533893463590", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case56() {
    String x = "45103958962576385930251577941785788423";
    String y = "54130417721313151505122155389284275840";
    int swaps = 12;
    assertEquals("2441766033291988052423211188211366318809051987659176325678356771296375139060", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case57() {
    String x = "58410334067556098357904874023541664529124";
    String y = "99376587897716501326057449061190421970933";
    int swaps = 10;
    assertEquals("5847163225424430422645845010955165916859886738503118356259681980683243287459952692", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case58() {
    String x = "3959883951362881981334392721761730602";
    String y = "8607209543256088157579237279363810687";
    int swaps = 3;
    assertEquals("34083578829587992824431270046511610749726655868536536027065447018622543574", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case59() {
    String x = "956154138509213352904857330303211081872892";
    String y = "502825581249882717950340153423294924904498";
    int swaps = 29;
    assertEquals("502352864029558480928041368674007568139629695888209511074368216898525321033333845816", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case60() {
    String x = "317198832933283402012107668058895732220023";
    String y = "368772879592913081920247581007169303730432";
    int swaps = 31;
    assertEquals("117054287775487967026044409949075647774178395019380953694259700305906376250603329526", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case61() {
    String x = "671307036319561510973081517179498";
    String y = "901850892808514736168086571028355";
    int swaps = 7297393;
    assertEquals("605545544110202290027216730868181586313337160034244296957402665790", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case62() {
    String x = "332337301487898979195896933141";
    String y = "757634638342789014073494568989";
    int swaps = 461698;
    assertEquals("261910310115920824077543357026098772785864958164583509764449", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case63() {
    String x = "36936200651619735006518272";
    String y = "15225869835505815073415641";
    int swaps = 2;
    assertEquals("596603373103475884480826727648127693505358117092352", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case64() {
    String x = "810552583278527";
    String y = "897631598954952";
    int swaps = 701171837;
    assertEquals("728145463520905335696253093554", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case65() {
    String x = "772837541829689816375410122854";
    String y = "577344918387971143529155679023";
    int swaps = 9;
    assertEquals("446291913227647381697536423433890294858141626664716220691642", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case66() {
    String x = "944435802949835043525777440411";
    String y = "540286814764987386280980496828";
    int swaps = 99832167;
    assertEquals("511945997557284556717870188778185439537049117000057025516308", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case67() {
    String x = "14818221466938136452";
    String y = "60103873314561219180";
    int swaps = 44112133;
    assertEquals("890662031617225109218712042873957834300", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case68() {
    String x = "89810325032263";
    String y = "36158219397213";
    int swaps = 305143302;
    assertEquals("3432209315223093706419033019", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case69() {
    String x = "45032978011474399676209623035196792756824630918";
    String y = "16840379622730730736467401244634502016937915244";
    int swaps = 42;
    assertEquals("758445739252367468795962408876729975892624975540612366292091191657116727458297112514798572872", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case70() {
    String x = "38703446718121231110891097745167839313963";
    String y = "65207170671754817521753100050078649148089";
    int swaps = 11;
    assertEquals("2523849051106860784691182174889271785662136775446327509449109269036514032152466707", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case71() {
    String x = "66063803694204436918911863509108226897789305";
    String y = "43977435833361047427157227036098964029032247";
    int swaps = 19;
    assertEquals("2962582226820584985560922944903205918682448124406832542158129766102558612887444610218335", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case72() {
    String x = "133435216988414573027770200864501573279114033";
    String y = "158305102510406489562221747860021392415406681";
    int swaps = 6108143;
    assertEquals("21222825131459292056868858549465092699092278939110496015081284749095437783654920041949173", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case73() {
    String x = "8938984399697725232833857";
    String y = "9813512086553953548503508";
    int swaps = 230949553;
    assertEquals("87722831447951064865071001677439124187315745340006", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case74() {
    String x = "6602216501773835132194230148661387944354427756";
    String y = "8907098673201535654681585332876964632105870037";
    int swaps = 4;
    assertEquals("59416697170526115743954086490517208091748230736198603236986264999998588848751282999641546972", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case75() {
    String x = "71165349534377091540071237733391588802443367661481";
    String y = "45968719167637127947182488162048594449945321743190";
    int swaps = 692104578;
    assertEquals("3271380733190164781780579074341413733094272891059214690705707017048655994555597091657631496206159380", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case76() {
    String x = "59877487832193744435132809034944398538123898510618";
    String y = "58772823669651380761603104315895457446775268891980";
    int swaps = 10;
    assertEquals("3519274056313641522061472684305242471930272391427350538079223891218816987864110044747912789125043640", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case77() {
    String x = "90229267360521711532668158694662881687897905826971";
    String y = "75164499615560750795685370752304985800977447592322";
    int swaps = 0;
    assertEquals("6782037731832262386162897476335259877567039897092844107701827564574381433336453563507718698280116662", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case78() {
    String x = "30437808812749193620720053577443386445924424253";
    String y = "43402372077617567908574256588285276733569445969";
    int swaps = 299900361;
    assertEquals("1350967281080151524151852569940843332773924282863411121201624589586118382400995676040116686157", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case79() {
    String x = "48372691004563646763914750055886981560604786403410";
    String y = "84361056867678945102867077462296564069629126470824";
    int swaps = 30;
    assertEquals("4080771547682559700751462201079462588794015396438736190830650499148590336078284423602188199807867840", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case80() {
    String x = "51798029897477539129611498697482582561937132068993";
    String y = "81134824914394952167251807574291844812846731585426";
    int swaps = 24;
    assertEquals("4202647558372567303170920964990963921853282337179326667374263961984850170749984821794955323645885308", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case81() {
    String x = "90466758115119076344572656296532163490565065332660";
    String y = "22005205610494026640726685100213843508705356302993";
    int swaps = 14;
    assertEquals("2022125217347415820697067453224465746948042767465271889979432616312219880545395075180875167298651380", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case82() {
    String x = "20251183374671946128257784206505607244405066263175";
    String y = "45489981277921829799006425351978491987969564744865";
    int swaps = 236049554;
    assertEquals("1026001941633846147524025439885404639709611032711455028116720466281759188468507881341167029380829375", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case83() {
    String x = "43457751337965340249804261561050487081728011910323";
    String y = "92818756264743705437380568268126624302051058013828";
    int swaps = 22;
    assertEquals("4053327635479871853636802755241934125931021404290162471109668555105220365082802695413877882275446444", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case84() {
    String x = "389162213856689357695770025930376152595355";
    String y = "566852102689625886616712524927004908100173";
    int swaps = 20;
    assertEquals("220721312140014941273979544843177695508486962036222526348088403357235272762452592375", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case85() {
    String x = "66623675256667864558004422865099938715199852310738";
    String y = "25969311912468089504686733173134277336553609563329";
    int swaps = 47771503;
    assertEquals("1769839438603872944672018419806090711678451949297556087107988142090057451325254707721055656573996392", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case86() {
    String x = "74717996522370976956993581896184534641521754838523";
    String y = "43200085288710863222708474344460553721908880916786";
    int swaps = 9;
    assertEquals("3273361161269041982024922827841480667261515572637337299393537561065451019161377663280183315630147078", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case87() {
    String x = "14676401884946409291243997766793945469868267586824";
    String y = "35662649242966225652957443492133733054512856018927";
    int swaps = 8;
    assertEquals("543390328457892858146997314103107409493974568734729339872989858731327153581486949830200909959817848", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case88() {
    String x = "77630293992229494846342833783759149176252286155962";
    String y = "98906406635418844732432512495068541919232229175099";
    int swaps = 469994272;
    assertEquals("7704218180767957172350600808538620854136457891319064541710248325459400029986864103263888007982756938", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case89() {
    String x = "80684550860546293256357285489286888599429987831306";
    String y = "33408376605207368794808572429201501400574775283597";
    int swaps = 19;
    assertEquals("2708708145519470829277904384117589522824297755101474426134695909847636809195988246538626717429637882", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case90() {
    String x = "1019160143479690755494209733770531264246";
    String y = "4352711496598784029058262969839570120765";
    int swaps = 3;
    assertEquals("5455512893217106424046471609461046675444719510204981996736258938695222346668190", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case91() {
    String x = "55880194567718363383596119439192607093873086830685";
    String y = "69860563896059917548841170256880534375606109879537";
    int swaps = 15;
    assertEquals("3943745774396953126317369755686898955853721498377289278852579783195921890251274201166587826465192845", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case92() {
    String x = "86914270864970131199959356143954550372243058030654";
    String y = "28848177809000204542168466628852769216076005584439";
    int swaps = 13;
    assertEquals("2513120739485252176849004352452303802457109563240750497221405298805581535064465044176244449647393106", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case93() {
    String x = "41155429240576044755918446510499587548602627315959";
    String y = "69740847208860239137933125620617705612261055331257";
    int swaps = 15;
    assertEquals("3042093878802958004174971363190848980937056240217192475422360867004193904313940164053136193547630463", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case94() {
    String x = "62809493141430487328239850835158371609053142015904";
    String y = "36052423850532973749888097307612428639835109625485";
    int swaps = 15;
    assertEquals("2285377934524843673132549291037993525501679974163854056819422898774039108125852152056524104113713440", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case95() {
    String x = "10469685222178599296950625231610221035500801644909";
    String y = "55140215163082564245211505172373098449505124060199";
    int swaps = 17;
    assertEquals("775653346967032102441779805127614131189831252055388266380335162210704367540578401433359773607876891", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case96() {
    String x = "40857910269095991147513984344017417509581270967884";
    String y = "25135147246481486660979934140762286238937376413032";
    int swaps = 16;
    assertEquals("1037811564398583434159893032724970055632367255884874184833912412994534917954297921345053942791064288", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case97() {
    String x = "37520760868943933007072373159181838884721267083419";
    String y = "92113511081244505530890728059891153790744721462711";
    int swaps = 15;
    assertEquals("3456332847007367998131951733802258687562775476594776425980963707321407617601587896572823094534888909", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case98() {
    String x = "74685859721972352796528357359791038286156918929884";
    String y = "18617314975981552267379472493742196799462773129712";
    int swaps = 85738815;
    assertEquals("1394400553588070173336889281703623367358122162585391629671222056191758453771202185200604146245113408", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case99() {
    String x = "42564153232929795942902531904759088285441475";
    String y = "71490607311860316841526043069563528506564225";
    int swaps = 15;
    assertEquals("3043818609286140754860828883087563317537443859693386055808626121557598922756864566231875", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case100() {
    String x = "80301437092522842858272203910154459926903568895691";
    String y = "52078781833517251582408153358579924416926852012829";
    int swaps = 26;
    assertEquals("4190377987230655673641680466033095902901884188141969002885961841654331200892780068352355345583141279", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case101() {
    String x = "38545910061871710779360344965980386431431207484939";
    String y = "51573285979375019846213907280920942066461364589744";
    int swaps = 23;
    assertEquals("1988330148685237253759841476152196956402977812031605785741049925764423684638302739230359925942338566", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case102() {
    String x = "50233223989397552958970410382732356072966427596076";
    String y = "85025784192529302260925165474921971643175552908399";
    int swaps = 24;
    assertEquals("4420145550674001604625462597892407256348846125609468793536878048399547417310450206418329724975772324", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case103() {
    String x = "653628412669143468438474646638061169058111";
    String y = "283490819387470763926989517007126943022233";
    int swaps = 361476832;
    assertEquals("185374599749566978297644650996913051724100655377463697934773077136789939073165589863", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case104() {
    String x = "5992656634888835137374061946243013583747123";
    String y = "4082860781651405790539484388074332086469777";
    int swaps = 3;
    assertEquals("25376997517675892640036299344832478321831505323842872791633311159942187541420550201571", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case105() {
    String x = "56710852";
    String y = "18058360";
    int swaps = 1;
    assertEquals("1050671725722720", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case106() {
    String x = "9";
    String y = "1";
    int swaps = 1000000000;
    assertEquals("9", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case107() {
    String x = "92345678910111213141516171819202122232425262728293";
    String y = "93233343536373839404142434445464748495051525354553";
    int swaps = 1000000000;
    assertEquals("8609696405949383656039808453846562975449226785797484526899591504258033152563108242253058424567056029", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case108() {
    String x = "38573829212345678545785423462342345678987651";
    String y = "23454365656556436543636456546456456456456546";
    int swaps = 1000000000;
    assertEquals("955924407521172119711731242184852555837311155159719816006239058084250823900372839457896", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case109() {
    String x = "1181111171111112345899911111111199999911199999";
    String y = "1181111171111112345899911111111199999911199999";
    int swaps = 1000000000;
    assertEquals("1395023598523463306969148075892302579724716637077838657244716534866828657785485440177600001", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case110() {
    String x = "12345678999999999999999999999999999999999999999999";
    String y = "12345678987654321111111111111111111111111111111111";
    int swaps = 999999999;
    assertEquals("152415789818625211424157899999999999999999999999986282578892345678888888888888888888888888888888889", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case111() {
    String x = "123456789123456789";
    String y = "123456789123456789";
    int swaps = 100000000;
    assertEquals("15241578780673678515622620750190521", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case112() {
    String x = "23492873498729384298734928374987293874298734";
    String y = "87349872938429873492837498729387429873459834";
    int swaps = 1000000000;
    assertEquals("2291918490749025449253745432255490645910946397401309228674891036792230341451865922050156", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case113() {
    String x = "99999999999999999999999999999999999999999999999999";
    String y = "99999999999999999999999999999999999999999999999999";
    int swaps = 1000000000;
    assertEquals("9999999999999999999999999999999999999999999999999800000000000000000000000000000000000000000000000001", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case114() {
    String x = "123";
    String y = "999";
    int swaps = 100;
    assertEquals("183677", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case115() {
    String x = "56710852";
    String y = "18058360";
    int swaps = 165;
    assertEquals("1050690426221700", digitsswap.maximalProduct(x, y, swaps));
  }

  @Test
  public void case116() {
    String x = "24";
    String y = "11";
    int swaps = 4;
    assertEquals("264", digitsswap.maximalProduct(x, y, swaps));
  }

}
