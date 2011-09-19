package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class PoetryTest {
  Poetry poetry = new Poetry();

  @Test
  public void case1() {
    String[] poem = { "I hope this problem", "is a whole lot better than", "this stupid haiku" };
    assertEquals("abc", poetry.rhymeScheme(poem));
  }

  @Test
  public void case2() {
    String[] poem = { "     ", "Measure your height", "AND WEIGHT      ", "said the doctor", "", "And make sure to take your pills", "   to   cure   your    ills", "Every", "DAY" };
    assertEquals(" aab ccde", poetry.rhymeScheme(poem));
  }

  @Test
  public void case3() {
    String[] poem = { "One bright day in the middle of the night", "Two dead boys got up to fight", "Back to back they faced each other", "Drew their swords and shot each other", "", "A deaf policeman heard the noise", "And came to arrest the two dead boys", "And if you dont believe this lie is true", "Ask the blind man he saw it too" };
    assertEquals("aabb cdef", poetry.rhymeScheme(poem));
  }

  @Test
  public void case4() {
    String[] poem = { "", "", "", "" };
    assertEquals("    ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case5() {
    String[] poem = { "Ay Bee See Dee Ee Ef Gee", "Aitch Eye Jay Kay El Em En Oh Pee", "Kew Ar Ess Tee You Vee", "Double You Eks Wye and Zee", "Now I know myy Ay Bee Sees", "Next time wont you sing with me" };
    assertEquals("aaaabc", poetry.rhymeScheme(poem));
  }

  @Test
  public void case6() {
    String[] poem = { "There once was a lady named Bright", "Whose speed was much faster than light", "   She set out one day", "   In a relative way", "And came back on the previous night" };
    assertEquals("aabba", poetry.rhymeScheme(poem));
  }

  @Test
  public void case7() {
    String[] poem = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five", "Twenty six", "Twenty seven", "Twenty eight", "Twenty nine", "Thirty", "Thirty one", "Thirty two", "Thirty three", "Thirty four", "Thirty five", "Thirty six", "Thirty seven", "Thirty eight", "Thirty nine", "Forty", "Forty one", "Forty two", "Forty three", "Forty four", "Forty five", "Forty six", "Forty seven", "Forty eight", "Forty nine", "Fifty" };
    assertEquals("abcdaefgaffahhhhhhhiabcdaefgajabcdaefgakabcdaefgal", poetry.rhymeScheme(poem));
  }

  @Test
  public void case8() {
    String[] poem = { "oNE thInG to NoTe", "is tHAAT     we ShouLD NOT be", "    iN thsi plACE for TOO long", "or theyll kill u" };
    assertEquals("aabc", poetry.rhymeScheme(poem));
  }

  @Test
  public void case9() {
    String[] poem = { "    " };
    assertEquals(" ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case10() {
    String[] poem = { "Sleep", "Slep", "Slop", "Slee", "Eep", "EEP", "Slope", "E" };
    assertEquals("abcdaaee", poetry.rhymeScheme(poem));
  }

  @Test
  public void case11() {
    String[] poem = { "I am a ball", "But only in the fall", "All", "The time" };
    assertEquals("aaab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case12() {
    String[] poem = { "This poem has uppercase letters", "In its rhyme scheme", "Alpha", "Blaster", "Cat", "Desert", "Elephant", "Frog", "Gulch", "Horse", "Ireland", "Jam", "Krispy Kreme", "Loofah", "Moo", "Narf", "Old", "Pink", "Quash", "Rainbow", "Star", "Tour", "Uvula", "Very", "Will", "Xmas", "Young", "Zed", "deception", "comic", "grout", "oval", "cable", "rob", "steal", "steel", "weak" };
    assertEquals("abcdefghibjkblmnopqrstcuvwxyzABCbDEFG", poetry.rhymeScheme(poem));
  }

  @Test
  public void case13() {
    String[] poem = { " ", "     ", "This poem", "         ", " ", " ", "", "Has lots of blank lines", " ", "      ", "                                            ", "         ", " ", "              ", "                                                  ", "  in      it           " };
    assertEquals("  a    b       c", poetry.rhymeScheme(poem));
  }

  @Test
  public void case14() {
    String[] poem = { "Cheese", "Is the favorite meal of the day" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case15() {
    String[] poem = { "His favorite fruit is the blueberry", "  because it is very yummy", "  even  though sometimes it is expensive", "and he thinks it belongs in a tree" };
    assertEquals("abcd", poetry.rhymeScheme(poem));
  }

  @Test
  public void case16() {
    String[] poem = { "too bad   your", "     solution went   sour" };
    assertEquals("aa", poetry.rhymeScheme(poem));
  }

  @Test
  public void case17() {
    String[] poem = { " ", " ziumiiuiiaipdglvaqxeoa  ioqeffxjclvaanirhve", " iv qio   apeuuhixaeaishbariuitoiu", "", "", "towveiiqciaogwdvogisaimqioifxwxedauenqqe ", " ", "oaeodfassqeogeosueuuaiiiiafjuotwvh   ", "", "", "oalugjuaeaigxcxupeahiexrwoaeisvlenponezuueu", "luus  ", " ewqefoahziieuuchimutovehacoiikdkoomruiiaegiij  ", "", "  ", "  juixmamnpzwunfeof" };
    assertEquals(" ab  a c  def  g", poetry.rhymeScheme(poem));
  }

  @Test
  public void case18() {
    String[] poem = { "", "oeafyazwsiy ptvaxkexfdsddufsprouieouwcaaidiznzeujy", "ccolbeiizoaeaaeliiaibnkeeenphhooiaoezuaxurldaphwpr", "", " ", "", "", " gxiojqjsdvieapewuiiauogiwmcpmhipogfwimacumhifckly", "", "        ", "", "bi", "", "rneqzaveeuojckasgzsf  mukoimeb ", "  ", " xosqdoinoacafum avbteoroabaeosizuohiliiaihenufuyx", "   ", "", "yoacziuefoiosiruuoizpuos     ", " jnefwikazoeviojbuetecptgopjaky", "uiauinubwocavaavsemzvfeouzhveiwvileuml   irf", "", "la   sobd", "nueeoezuugksfwdebzuaurbotoiy  ", "", " " };
    assertEquals(" ab    c   d e f  ghi jk  ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case19() {
    String[] poem = { "yzey ", "  ynupmkeerioaorlpajiuequzojoetoug ", "ayewebxnhuoaouowhrfmsajdabhujwxstaceazf", " ", "  ie    bgdaauuqbduaaieimdpwuouhxugp  kauujy", "", " ", "   vgemizxgeooddwrakurooka   iaiwapokejnmhiliigg  ", "  aedaaezgeoaffuewciuuuctieoivzicajoubiixmrwsuarr", "", "     itsxacihqaeurceiohoiuicdfelxaep", " omvee  nizeaepaueeecooiemoneaaqthminiufiiquocz  ", "    ", " ", "tfonwcoiaiacpnemxaeokmubeiwewawnieszebdhtidiw ", "ouaifqsusssolqseixkdslepoaeciiieuoze", "  yuq", "   prakwelaseeoam ", "  uaiimvalesqfanncuukzzaowaeuzuhalkwaodoasawidiuo ", "" };
    assertEquals("abc d  ef gh  ijklm ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case20() {
    String[] poem = { " ", "", "", "esfekqvibacouohhutkswveiagroy  eeuyiieowufuktehogz", " ", "liqemz", "esekbibnarxwdefkiorgfxuwnsdqtuidonomaxvviqeuo  ", " aegvvikwuabaabqzsuzooguoeeikegdoy     ", " suovvifthmnzuapixu sclfatcuevesiniheoageualurb no", "  cu", "  ", "jamqwaiokzoihcafiuzlolazbtuiooeuslmpk        ", "  ixzdedzaqieusqkoeziloanbgvmouaniqe  azeamaycpxiw", " ", "    owaucopbe", "yneijeehndkqnuculinbeiaohgqrhagapcuaaeumnemuaoezrg", "yuzaobmusnebaouijjieoojpqurfeyfiouoerfrtiuuonvpzk ", "  auiosiecrgdojtxifiocagiauqxslameduaxagfxy", " ", "  ewmceehpkofk  ietjiimrebwkzakoaejhaunioja  whag ", "", "lvuiksecouubfsqjpnooieletukva", "    " };
    assertEquals("   a bcdef gh ijkl m n ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case21() {
    String[] poem = { " yaoanvwdgaefzzcijebupvvmkqoekdtff ", "iotnevct ", " ", "aelbulluaeguuqertqalizu xgmaoaobtieuejbokeiahjahs", " ", "yafojoumooewienzeiowixrubexueozpoxqeuobhhsuomr", "", "xpbgqcezuueusnxuubwqujuloooahiee ", "    eacpmicsuugeiapr  ", "boluiuaerswrgfxesvtoqwhieaaaesiouusxbsuibsiomuk ", "      ", " ", "  ", " ", "", "", " riuvauuvrruoanughhoopzvaaaojnpuieaviuua ", "  ", " ", "   ", "diuuonaieiigeiieheukuoevrrejianueilqookjvxip    ux", " upzuucov   ", "   anxkrapakzuwiomuiioogq  ", "aiozilnauorojeroeuiibjrzarrnuawxuzxugbeivmi    ohh", "gsjonxeuvauoawocbeumoeasy ef", "nfhhafxaeoleqbseotexoeaeixoipuvisemiqwooneicbgta ", "iiu ", " duuualfeucazioionpimielhltxubwevhoiuuo", "", " guacuaoxwfuwuhpgkooeacveejctalilfccjoeod", " geeiauuffpceoqlaaequdxqaiohf pak     ghhie", "", "   whariakbnauesbgbiiueiei ybjebaeuajuieieclvp", "" };
    assertEquals("ab c d efg      h   ijklmnop qr s ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case22() {
    String[] poem = { "  ", "  xbeoneezoal", "", "", "", " oaiqegagnwxju ", "", "", "ueagkgaanffeeupoociieztmaxdor", "tkfknoulbvsninoricwxujurkfaaexcrvdorjejuixeorgz ", " yzewos ", "", " ", "   izkiupehauiupweeauoenaazsiuomrxyyja     ", " ", "", "", "  wiuihbueseqmdxblaxuoeitlo", "", "caraiutohaufpiotfevfdsoziuauiidnuxzaedeexwxohauvoj", "oibqpooaioupthevii yifuevjpiupewxlikqejkmeneha   ", "weeermtttuivufleeiouleaadrbbnaoaerueuay", " ", "", " ", "  uuxquoovaozriuzz", "avwueeouuhieduibnvinaooocl   oiirioppaeuufae nhpi ", "    uliouioamppeoibcfrakg   ojrkouiouuuurkieiu  is", " ", "", "iueuvijiaaszp  ", "", "   ", "    axofsjwacueqkufieuoacuzksoaoufprulisicwp  bjib", " zmvxsrzxjeopcpaafkieaaaegaeuhzipetteutokcttwnpix ", "  ndeazatuwbuejbcfiilveeqhw    ", " ", "" };
    assertEquals(" a   b  cde  f   g hfi   jkl  m  nop  ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case23() {
    String[] poem = { "  mqdugixui ", " ", "  uildiogeiooiucaltfukeffrxpuuzuuqoekaeay     opb ", " ", "", "", "  fcieaiwvotuolaib   nxoaiuawquqesuqoedy yangiwzlm", "", " ", " ", "   iilieiadgolabaszwnioqhuizxoo yoziocvijv ebpi ", " ", "     ", "hizaioluiudl   ", "  ", "fkpzwagludhoaeorgpbb   ", " cahofeulpjixijbo    miayiusomagfh ", "   ", "", "", "", "  ", "  ", "", "", "  " };
    assertEquals("a b   c   d  e fg         ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case24() {
    String[] poem = { "", "", " ", "vzfovmeadgsoesihxiiiolnbjsiuhecesrkiw ", " uioozigoepfeoianuivdbjoatdfeovegvicweuioeomoqwti ", "utbiluejtjioebodiocpaopikt  ", "oiiexiojaejdhkosxzzxoqiaxsurefxiporetqameofeoelnqa", " avuxoaioqniraoebeaaubuhbuoqir auy  azaomegqammmnf", "  u", "  ", " ", "  yoraibdpmurvaukinpououwixciivieagesfhejcqky    u", "", "   ", " ynbaaoeohoivnpleeuuaj", "onjgtzaxmapueu", "  ", " falvdhbqasxefeaaapimeig      culiftkecenaoafoicy ", " ezovuodbcogaiozpjcvwopaaciuvdlonuuogueohelimnmy  ", " veutacurmaolaoeuxfiaieis", "", " ", "   uusiudhduqnzosioaroamafo  ", " yihziqwaaceuciuaefezoujoprpumriuzirzaigkuzdkajdei", "", " mossavazxanrqwmvsnlwgoumfbohgdow riiumewy  ", "", "  iieivughieaujlsuxiiu kivzhoouoqrijagubvga   u", "iuizhvlnxjkaooakuaupeiau ", "onhnwooiueieteoswqdkieuexrlgeaerixzoy", " tuihiuixqe ctuxbmedmimragaeuieuenveu", " ujiqholqslzkiapfctbiuw     ", "", "", " inmriloiodaklahficaheuginxsok dvowejtemoehloip ", "oekumvvqouvxuooauhevizjovhseuawzembamhacnpnclu ", "", "    " };
    assertEquals("   abcdef  f  gh ijk  lm n fopqr  sf  ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case25() {
    String[] poem = { "   ", " kqeearejnzasudekijugxmodbul", "araasosqiwumdy", "lwpoafawqlreqodiduyeiernzradbogbagiuuiu    ", " ", "yenzpcraknwuwouabhlcusqdotibodheoeurtuexeoidjgaz u", "   ", "", "aezbvcegnob " };
    assertEquals(" abc d  e", poetry.rhymeScheme(poem));
  }

  @Test
  public void case26() {
    String[] poem = { "zdiqaiaaenaeaouapaaueouqjneubeiponosisutuubage" };
    assertEquals("a", poetry.rhymeScheme(poem));
  }

  @Test
  public void case27() {
    String[] poem = { "        tvonlapcaadweueeiiaphzadoanhuhoqedb oluird", " oeuawofrjaufdrlouijesupirhlehcojehkoufeflanouavca", "", "   ", " zuupaqxr", " ", "  aieeekikairmoxalisajtzgugoqaax ", "", " qootuiepkaaoieabtuofiuwmciuojbvdaxaag ", "", "", " ", "", "hjdoziueaaajuqa", " ", "  ", " auuondonofawz", "  inqxqqxfmh   yuqverssirolmi", "  yuewuikfuaxbnuzeaeidocfd", "ul ", "", "hvieoqjwfzifgozfouzvebkoefaoaqoaeclkowfoihoocmuj i", "lvniliawwleuceoxlvmodrlksioeekoufoijjufqw ", "ihxaujircruoqukaouusxrwiroomazamiy", "eifuovhniqcocaoxtuqakfsehbzstemaio ", "igtsanzeuaviweq", "       exueorogpofzwfmwrojeketur uowakonojzowor gu", "vkedgtrrkucs  naulemiunrouuvidaogwfceopqrflommen u", " epuaopefpesdjotiriqumzaosesajozqiuxieeojeaxufoey", " ", "  kzdoxrdteubzfaefjnupdlfckxulodvuiqx   ", "bneefdioeotbrhzlniqutmjlilt", "pjiodumeeoqobttnxyalhogvdomeefoha  " };
    assertEquals("ab  c d e    b  fghi gjklmnno pqb", poetry.rhymeScheme(poem));
  }

  @Test
  public void case28() {
    String[] poem = { "ykeoufoiipeafpoezigiupugbuboespgaeosf   ", " mfuujiuqoaxaiawbdenuinoulqdoeuhqhelio zzqe xroina", "", "", "eoamsuoroameshagrkouqiueigkvhiuauodtmignmsjnaeubed", "  aimkiruaxakbmimieuiiivhouetucolxidway", "", "   uoatueimudleueszstxtvieqosewefdqmougi  orwkuobu", "osefuauwseuaawdmqatpafojwpkaupldgoopofooaavkerpi  ", " ", "", "yuioupououqovaooeeutbjjhay     ", "uqwcmeuinlreseaazqnuuxcieilzqisiocdzupaj  ", "  yiogufqpvwmqnehxaenctiueugikotuooreuai     ", "", " jaigiaaiuquuxwbjriauscnzbfpeimyycfioczeeiptoe", "  ", " meamcrniuorzcwosejxamlaovfn   ", "  ", "", "", "xqwdoxoiaiouduzieiobagvhtxvilzuxidvrroiuoeleqiawv ", " btrepzfiwougvatlsderahlqiu  ", "", "qqiaeiacugnooiuualknsmmfqgcoy", "  kepqoeuknokwogivmbloelfiaaasjmpiraoupxcanouzq   ", "", "ysqoavjeouxceuiuy", "iohzooavduiipredqiijeahjitnaeonskoejhnzwvhewaor od", " ", "vlouvrtaxohw", "", " ", "   i" };
    assertEquals("ab  cd ef  dgh i j   kl mn op q  f", poetry.rhymeScheme(poem));
  }

  @Test
  public void case29() {
    String[] poem = { " aioimoxabufo   ", "  diilbblmrsfeeucqwikiiazhxeorpxgsewwheuuanrsgityy", "   azaiiaerefevpijiznha", "  hwxrtbueauakegbetuejsuaueeukv ", "eafearpeaieoudaaojaeeloukoonitwweadviyiucjvivyidvn", "", " ueoophcmiuwqfuuoaptueejrcigpahujoaadoeflhudzjaom", "", "", "", "  ", "luiaomzeatmadikduabaeeaehunxgiuoaaes", "", " ", "   amdboihaelhaeiuikejfeoauboosemooy     yuhwiah", "", "  auainpwemijcv", "uaioiufretouqghlactlpssqbeakb        ", "ttxukafxuuraquzarlubkkdonvioxeesaguhxmmumaeaeizaia", "avoeuogbqogciklhaavrcngstuielidelacwue ", "  yeelouhbxowtaoeahsjrihxftfttkvcrxurojacrurouryyp", "    ", "   ", "", " ", "  ", "       vuuvmosxiya", " ", "oiiczezkerkeneeiiefoooxxxtljidluqpilaohhabenay ", "", "" };
    assertEquals("abcde f    g  h ijklm     n o  ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case30() {
    String[] poem = { "    ihtinadcuoooaaoaaejzgamuxuyaaouozobonarm fuhy ", " ", " ", " ", "oazuuxqr", "", "  awigwpmoaualeouafituxkaxjzniaxzbeiipnzozamia    ", "", "   ", "", "    ", "", "  ", "  e ", "", "", "", "iaqtaoluovhdextdemwqmeeuoomaigejiuo oegpahlulnprls", "       ", "", "oueeauhaaokkoaoeoaiibvakdl roemixkogagvg   xhoake", " yuvimxfbgcuafhdeuolveumuauweluxa ", " ", "oqoiphiauuo ", "mmqiievpwlorouibn " };
    assertEquals("a   b c      d   e  df gh", poetry.rhymeScheme(poem));
  }

  @Test
  public void case31() {
    String[] poem = { " ", "", " ", "", " ", "ydutarnmcueaegieeocuiy", "ietgiueduoe  apaajaevanuaozdmqjo   vqehzleioxbv", "", "  fiqiuxhuoriaaxopqlnooamfxviyqipgbouejitxm    ", "", "tidhiienaoepkeuscwnkwawiotvbanaiuouay fem ", " gsipxdzerizakewsleueeaazmjgqamxlhpvrkewjekbgoucav", "qapwaimmokeaotbaepa  neonawuoneidvwzrisxotyemhiy ", " aunfuioojsueiatkowixrhuaeneuguahy ", "  cbxeoutoewiojmipeeqecwkrocsrdzqhhojbi ", "", " usnjcguumuaceldwjoguuleievoafbxjhiiewaaup", "  ", "beoq", "   aaloooezejkzcrlomiaoeeueaworlxhshguougskshecbo", "   ", "klrekfeioluoufozhavlaaogeh uqseimkoo kzae ", " ", "      ", "zieaoeotaijeixiwuooxzeedkmogedguooiiraseozr ", "nauilbuxhoamoobqrreejhniooakzaohmjlirjaftuozeu iz", "xol", " ", "  ", "   bazek   qgzfzniaqoop   ", "  jddepaoasaeefrv ", " oufhaarcueegijevefexgbuieeh", "itouuuhaieemoinamaaoimwiuqoaarooeije  ", "", "kzduklv  uiuuarav  ", "", " ", "  " };
    assertEquals("     ab c defgh i jk l  mno  pqrs e   ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case32() {
    String[] poem = { " veoijowgxuqoeeoan  bauukuuaebbeiespulkotxenoen ay", " ", " ", "xumoopgxkudauipuloeuy  srgsuioukoppgbsevajnes", "", "", "lofgwvseo   ", "bxkcagwueegoeunof ", " bioupouwfdsjiesimqeoisvauhxmumidflwiauivjbelao ", "", " ", "", "   iiexodtaedorojoueoigjlqhbvjiugueou", "ufuiehiwtqqeuikaodggiaqeamncpdkjlmnajlbiiiy    ", " " };
    assertEquals("a  b  cde   fg ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case33() {
    String[] poem = { "ieeupsueauiowzaseaeuxrc", "  ", "", "ccxhqiueuaiuuifaihxulaoeubuenliiehioa snlwuofeqeoy", " cfduuoarladevazueilauumhockaogtviripavxugeaob ruu", "", "  ", " ", "    xwmeixzdjbizrzduioovetifaoaedotouaeeolnih", "   ", " uioilvwnjktzeiovubbaxaekefuoujoeoqeonoatuhho tuc ", "    jwmotouiwfiyoiuuidoacnuimebaaaeeuauoiha   ", "lwpexiouggoxixxjlauaoaumoudehatvespbaliitaihy     ", "yhecpgqaiuevpiwowtaauzmf  rlosheeieku azdodiiodza ", "", "ijlvprqoz ", "    ", "", " dxdaereackroktvxqiiowexxuiuhqnaehii  ", " olrnuubxlamicmondniqcaoexcewrj geoe  ", "  ", "", "", "", "  ", "", "psjovfieiaabkqoehqpitauqaoczuuon ", " ", " oegrluonnzueotooleteofrauqzeannegfoaqsoi  ", " ", "", " ", " ", "uuizoruvequdugavwammolundihrjofhmbuvqmoeepenjdeuo", "   adfixybulelwevvgeoimm ", "qiimnuobbauenlatpkejobptoau ", " vhzemmagaakuiaopakpldeihxxaiaiaadniomaoa      ", " ", "novoogbkwcbhuipeeigriiiemfinreszhsneouluuuzir aizv", "", "", "uexeelivtuuoioeduaiafroetoiveikobiiearacmgtfzrfueu" };
    assertEquals("a  bc   d efgf h  ij      k l    mnop q  r", poetry.rhymeScheme(poem));
  }

  @Test
  public void case34() {
    String[] poem = { "  ", "  ", "", "     eilaejhihdlogueqfqeuwaxceoinpuudfuscbezzfck", "     ", "  xnezofaouzqzpoootaodeeiaihsu ", "", "", " yrzdhiteuehuciuvmaqnomoiozabag ", "  xhgaaaivovaqevsdswkuonuifpcwlafeayau", " ", "", "zbubrccuxizrpfqoritezai", "          ", "    azkohikevoa ", "saraorauos  efaeajtiaifcenoiea  dzlmiphdo  rocxegv", "  ", "   ", "  ", "   ", "", "   ", "", "", " lkpotoxopucoiiuabiaujuxgafanceaurwouitlsjiewunda ", "ywotvuziwkaueeuldanedrogcurwvuaohoeaedtmkyiq", " ", "uio ", "xuueihaggsgiaxaaogcainadkfuuusigeuiuuiqeuzuacwnnui", "", "    juacnjlwfulcefvofofeahcbnxfzofezaep    ", "", "qaomacvgocnhdrddogvwdwquimegeaiiietsoovoyefarkqsfu", "", "leuixnoehxsuuiadoqkorcbuuuxo hkvvfduehignrfikuo   ", " ", "   issfevejaiviovgqf", "enpqreiefuuuraxueuuugoieeunwkgeoweqcmrelbqnoh", "viaeluuzluecvrvuiiaigudhjhw ", "     uaahqjrnuholqekuoedgsneaunlgmuiokioeae ", " zpuocqxaazwkpouuuowusexaoiiobu  yyy ium ", "  eeadoosuvuooookuaiaboteouinowfmoeeppxldmhlsji   ", "", "", "ramdebdbgplugipoeaecbuefdojhkvuoawox   zmieedy sqa", "      ", "yojqqsj ", " ", "", "" };
    assertEquals("   a b  cd  e fg        hi jk l b m nopqrs  h t   ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case35() {
    String[] poem = { " rwqgawtuzheoaeumeiinuoaedfes  zimaouaoqoewyxuisre", "", "", "xwxtoafnifougomivhlgukoeajaiomuefxfpejouaebovcx ", " ", "", "" };
    assertEquals("a  b   ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case36() {
    String[] poem = { "", "  ", " rizomtageeadalvavsouritifkudjawcirmseeeuzaiacuhum", "xuduoaxioaqukieuoiiwnicau", "", " uhekwxxdmueojozaiowqxuponrrieaemmfjijivnshfuaopa", " ", "    ", "  rdonorouihphoafxaakhqcvoeozmotszpirz", "anokozuuwpfi  ywijzdcakkojdeliaudeuzxoobbspnoyx  ", "     uezqaaoirxjubeoilaridce  utmhva   ", "      rbevfikeuiviaoohaokibpuqjxueayeeazhfud ", " rvxkikeonwafsclamu", "   ", "weg ", " iamqunletaufretfrgzgvnnuouqui  ", "dbamdveiddeiixacbuouphtiauuaoiouy  yxuu ", "", " eibubwidcrozxjvmfoowjaizwnqexecja lhetwvibnzadilr", "vfiofoooqouuikeuahuucy     ", "", "", "", "   uiuhuenuudvavtjebdeuujgajopphb  ", "", " dnaxskbfaqwuevoex", " xbooigaucruaeoocdouoqoueieesuduiigqejfpiobicqu   ", "yngleprgieteiizeoaejxoieuidoitiqpkuhkhoibehceoj ", " cenv shurzouakgwigpfuhalwouxeihwh ykgjfeawrahu", " ", " ", "sublaqueuengh", "     rfgeuvkujou   uzqixcoamlibfaiogtfralewi giots", "   eua", " ngkmufklzptfabqseoacnreihsdotiraovuisaaiooge a", " ", " ", "dadqqaaazgsueoujwaaanxkiotciniifrkunemhao", "", "", "", "  ", " uthsbeamncosm   fquzwrjkwr ucvlshateafomauoomai  ", "    " };
    assertEquals("  ab c  decfg hij kl   m ngog  pqrc  s    t ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case37() {
    String[] poem = { " ", "", "eiowhuoqgozuhnwfawofen", "aievekolkeuuijjamrfaguwizkeiaddpehoivlocanie", " ", "  ", "sxfkoomrataqkuiurowzuineiouoiaahcquloheuhedexh ", "    ", "  ", "  ipledeonoedtpvsikveuwuuzekxjvvwujubiearfofvur", "trjziidoaovsbtliladkupolxlreotfouirwdaioozcmacen" };
    assertEquals("  ab  c  da", poetry.rhymeScheme(poem));
  }

  @Test
  public void case38() {
    String[] poem = { "", "  ", "", " ", "      ", "    ioacnmmeuuagfrcvqtkeaupxfzaaenow  zfpkaiqemuo ", "ycnjleemlurxsifuuwt ", " ", " fuiiqxqeihkoheinv   reaocsiceiz", "  uxui", "", " ubuoiljkxinbbrvfdbioapoavtuokqwz odx ", "uavapbdbrmkihey ", "eeeucanrotcngwpccrkeeictshueezdaajoxconzlqeiqt", "xetguueikiuwvatvzntpoeeuueicoay", " " };
    assertEquals("     ab cd efgh ", poetry.rhymeScheme(poem));
  }

  @Test
  public void case39() {
    String[] poem = { "     ", " bnadnkeegaiehwukoluomkget   alnpsftwlxbibcxhzhvd" };
    assertEquals(" a", poetry.rhymeScheme(poem));
  }

  @Test
  public void case40() {
    String[] poem = { "  worupcoiiueimauauqotvauegubaoszjiqvgwgiiieqdabac", " huy", "", "eveuhwix    plsfgueahalaaupatekoithxkoeuxovtcqriin", "   baufoozjuoaoqataviiisafmxleeiwimruqabqzqoddo", " ", "  uzuaukrqanoguoy  ", "", "", "yiucdohxuourpataaoizcnbc fowolodpm ", " ", "", "        ", "", " ", "uidearrmjaiiuouveaelwgsrpusfoteaivuwnxaieoai      " };
    assertEquals("ab cd e  f     g", poetry.rhymeScheme(poem));
  }

  @Test
  public void case41() {
    String[] poem = { " doufxivoqpbvuwbtaoabmdezdu    ipir citusd  ahey ", " eteoamsgwxooscrkoeaslxlwioisneudeu   elms seaj  ", " oaeumade eawozejerueaoencoeoraoquajupiev os   e ", "uinwijgjuojniaieseaiceosoudpulaesuqauppo a i a e ", " udahuiounjzfmtey eonaa   jay yiuuaio  owig   i  ", "oebgebiqeuae  smgetud yo  ysidimigtaoinmvo  yex  ", "   yjaeuxqsgaaomdamviagurrleudouoofmuq       xlco ", "uzuaoolaitniujauwvujvbrqauaxasczxooeivilkd  qo  o ", "aziau qvwhlapvrjexaifioroijtoutpeoxapmeu aaquza e ", " yuasehosekirauznisauky  you iitbaeebupaaw  nkic ", "gaaaeeqnowbiobdsujtsnjlhpj   ooajeouiao o  eobhe ", "aoaeeuvucsrplmtaseckfootdagezaiphndeivndhiap ybe ", "iumaiavsauwzao ovoaxzxoixhroloi iirmsefnuouald yo ", " juw  icaauosaqeaoiolrdzqchsrizeaivjuh  thaopide ", " onbuohg kauunuaueliouuuebtaieuaxzcrugwokeeiajcua ", " urajaabmzioehaeouqusapbiieqlauiokxivpbotuhxeejx ", " npgqhogbskarxmurqxnqzaeaoiod yvuiaiaeoo  yaiseaf ", "   fabcqu iiaal baagjaoy   qmvptedmdosiu       wo ", "oes sioxfloaquigi aiauieakjveeieiobwuuonuwqve u e ", "ykdijapufbgoetr     gnkcauuzgalauhiaeixfiafhhniov ", " uioiicdvoeouiuaaxzzdiipvmaxixaqqeouaamjoiautxil ", "yeginacitduwoswrdonbkbpejjguta  mdbjeioecvuueaay ", "gahkqaukseuoenleuairhcbqfienzliqeiuwifzufjumcesb ", "yheuedazroaaeioexmcuhevzeavhhficigsee  uq  uq ey ", " amjfeialfkeweei weahqpjajujwaxliqo   hewoviap  o ", "  hevudeniilugorr  iaequpuusqrsbaqeqc  iubax diot ", "qefkaokilefivaawiumekihiemutulufzesuoaubvgoum  ox ", "idoiacgbaepknipneq ecoevigmvbtvuvenaioeoit  kugi ", "olmerimmlbwsajusanaaxuaiotaqaszxi agg   uvgape wu ", "  kokuieupnhgzioiauilrhqnutwinzrd    khbige  uovs ", "oqzfodouaxcwitwpiiwr muooetuebpobfdqxplzdaeqgn  ya", "wledjgozudilfmaiasuiuoobidcxxciy iveoiootuoavaq  ", "  daxonaoujubenjcdzujivhaaekevjnuuuaoeoonf  oeo u ", "trlokuijnuuzkxezxadauuddco    hiiakz mi vo  vhzeu ", "  yaiaaacziuajgafesaieewnpilerueeipeaoacuiobzi   ", "obojuueivuwpaxderwaaidouqekheoitnctma iq    o  o ", "  utitaaeeioesawgcgiaeareuavnergojaelld  lxeom  a ", "   ieva apaujuolpmgacucaifazcezqvixxhudaztuueoou ", "  xukohoaimahafrpovwwscbgnahxtomohbvuqtsouioeeer ", " samh upocoslgisao yerxaljiraxuuoiglq  u  a   odn ", "  usiitpiawtaualrtvozuhpwiiivudpumbnug fiaawkc   ", "yieaaznrilz  eicz  qnoijgajaae  qdiqxitjeoalu  un ", "ooafiemht sjgjaueiwodkpnwqlqoiounwiaceiakemeqesio ", "aiaesqi eeiuotmvxopgagrofoulsiueeuhnuwicruda se  ", "djqcaamdeouuoqtowazhiqaqaaeevuuoqlieeiin npvpom  ", "aqooeiaeorbruqgognnokmrpdqaleogznoguotfviikaueruw ", "ynpfqmaixqgx      ekicadtoozeaxebdsiilip    ne   " };
    assertEquals("abccdeffcgccfchijfcklmnafopdqrstqudfsvwxyzAcBCc", poetry.rhymeScheme(poem));
  }

  @Test
  public void case42() {
    String[] poem = { "ykeveqtiqoopndd zhniadufuinihvirjhouaqiasulkiuko ", "oicaiaihbooplmgiozcuxi aeoaaielfthzifiijout  aja ", "   eneoiazmoecoiighucejirujianruuoohkqfgzuae    o ", "cjef   kdafzvqauheaauodskozoiscugkfuqikdvlafmaz  ", "   yeankuimwivoaoasmkalkplaoumuuuei ja viiigvg i ", "nouodvdatecuooiioliloxmevdio ziisukoauksdpegupqr ", "gveaheabakixxwxurnaiy  jiqoqza  hittz    ou  eiy ", "spiaijuz    zebdehmiuc     avfaeataaogaugguex  aj ", "yfduv qieotzoajrlludo iouejxutsy ageki ikxvxizi o ", " aepwlojagfip  ydke      yebuuegnvibmo etva  gva ", "xuameaotaehzohluxihgudovirbkxchne yuxtg yit hti  ", "futitacezeflqekxtibjiaarokflohqenaqadeuuolsp  act ", "  ffvjgjjloj yumieaxeciwsegeohisudajlzjegjc   eek ", "  xjudenoqjshunilrvoelckil  ocrnweujuuhapooldxboa ", "ydsdegtoecaeiijisuwrbuiw  oeazowzi shndijouugik e ", " quuaaekuldcuccawoiadeinazkcgxzjggwjieituhzeo u  ", " iqtcogotmixuoauomlug sweocwkbmuexqsxxwg u cee ni ", "nvioaziooaprwjoiolvuuzevmbauweieqxkoulizdpahexal ", "xuwlpcuepeza nbiuw  ueejrpgqbokmxfgogaorhpiiqji i ", " buuncrjojcpaqmoanvvka iuquaawujmley snrqe pcboop ", "yzoeidgitiizeinfujttsjfstaoomiaueofooipellio  so ", "  oieatgveucwirxuteiurdtteorrofeme ydlzbco    ee ", " yapduo wouijexuvqwqleaexrei       gouu yguy    a ", "npgexllixaoeqeboedhlr pa ldoaehdemewbiex cozeeu  ", " hdojatnuuajuaaiokpnsduwtreuxroz     tioamkvawrbi ", " epbmsueuae mmstikvacibevelquusiuioogonxwd  enpvc ", "geuolapaejkjalsdeveehazqukqlxxzwf   qnmuqrv  al e ", "sveiozobovljivxwqoeiravpnifhigniegoveaehaolev if ", "taqidiiodheneizenuoelb   sqfihaie   aabu hkkibtm ", "     yuwfueefquliajfiskintu     brtoaheehagsaa   ", "  qjwdwaakoakgpsapekoieipworxmuapmxrauuuekdf u  e ", "jaqpezpbuuagulnadutuumiiucziuzhiarojioaepccrw i a ", "ueiabhaeqaoemoaaeu yaiquifveoiiouio o   fxifu  xo ", " nilbuooclodbcy    hnaonoeeoicojuwonaojj    e odi ", "rciaovwxlotpaetxjcp lwxdciozossxpjabuiitmcnir u e ", "ujaneaia fuossadgooooeootwotahlonmauigkdiuel fac ", " oioueiuuvdffdwmebriauqirwopnaebgz   ozdugw vo   ", "     qgrbihdnbebfaiohuidy oh      eiuzxoocu     i ", " yszoaaveuahoournawpercui yiuabjiuevelherauogz rye", " zoajeafm   doouqjaahzuethausaneplouiqkxqoxi   ig ", "cwoieunxiooownseroeoaeojalfaepfagebuoeat ondx yyy", "esecermotaiasilcuiteumnii azioikueeaaou oaulraew ", "iooarlueeeievczpcieekeoaoeerjzbxeidujuiialiellwdo ", "yliewliupgadoiozoeaambauma uruddqwioepoieptuaouy " };
    assertEquals("abacdefgabdhijkldmdnaobpdqkrstkbadkuadvwxyaz", poetry.rhymeScheme(poem));
  }

  @Test
  public void case43() {
    String[] poem = { " mhorejafnciisjoems    fpjiweeugkovoaoowuuoarahzn ", "aoewzkholrujihuuxipidgazaiodqodexouuf   ezm   ep ", "  ely ougooueqrieopxaobqpeuxupiuezauovxgeauio a  ", "yglleatogvkguucrguaeoy  ahvaxuwxmeuiares  ucen cu ", "ydtcubudaitthjbaaeagxazzaeflhm  sceiiiaef    axfm ", "ohhmmwuluteigsjeuiwiwzgwixrgvlmlmivgqlgunxorh pan ", "izpopbatuaaoaoswctpuhawcmkigifpqleuhuniooqquruhoj ", "obuaqejmiadeizzhwaawoey  obiooemsieiilhunoqn uiun ", "uaeaobuooxfbtpqahmoafioooe      xxqkcvevoihe ung ", "earijfhubeikaxujnuixoeeaioixqgameaixeoeaguo  ddew ", "maliakoaziihxlcvioldboqoejetiriubkey em   nejx   ", "yoolniejaqdifeueewgulocpqsfaqmensavwjeod  yehaey ", "qimw     oougmohtnaltojnczkwebavjzokiutdgaosanijc ", " eueeaooubi oazluaseimvrdfcwfiaebiq aivnah  uoum ", "    agrlpbsiokdcid  meeraeupb wqiixnuoa  uu  e   ", "wucirsfwbforxlfoqjiizdjauuaedqenuqug tejrlqvbcgxl ", " pceqiouewdvnoexey qipuwbuwcnpuscmiuciougaaoke   ", "  ej       yaefrm yzozfrroioeavanluua    eaabztg ", " ovekviganbshazxwokewziipesvehemmqz oj jealbocn  ", "lmzetuvkquqasirvsucxkxiugnbdwuaonm  uow iaieio yu ", "iuuswealualeftacaeusuuaboriueokuxekw oeqfazsh ii ", "qe  uhwaucdeawowiviramuxepoqshudlwezmlqcouipq de ", "yebolwx  adhvfrkpaiq eacgikiaesxoooweipiuii yeray ", " ewrpwscisahuee jzibugaeutmlqul  wviixoiren efp o ", "yeuiugnouufvwrbueicah eolhx  mhieeikoou yeigoooz ", "  yeunuoseiaqmttetwmoncvfrqozzop     ey nteeq i  ", "ymnrapaequloeaivqevbsuioiwighhqdpeaojukkoihlgvlru ", "ywdahizuriiieonoakzu kwojuioqaqubrewp  xno eocioq ", "  gucoauiik goi vikioeadqotatqeas    sqrcoilvd lo ", "bisduloeawzaienncueuiiiiuhiuuaiphk   auemvwuoi  u ", "yauiriiaqiuejilauouuuieauswwiuefoogy yihavikjv en ", "   ygeoolteikipoxoaieciaccezmlipeoseoobuaqbieuo u ", "celaiuadgoaesluollrptepaie  exauturnaiiuiewopo   ", "veazujgid    dkuieerciaxnioaugwnelaoeataqir bda  ", "   oeoegtkouoajfivaunoiuraqwvqfwuiuke oifh   eoa ", " uommkqeoudrwkae   dwaowkceotcfaxdxeeu so cag xey ", "  oroiduietzlniva gpofoliisoeaamsowaaivhd yihd  u ", "viejoezevsgooojeocxoqum mwrkhaev urt yiiwjaduhy o ", "yqvtiauatfzoenixuotjuwoduaacuurm sopidaaza  yulaq ", "piopaoboifauvimuoucpuoiclky adjjqcpnf  wpuiy ma  ", " bacqiqmhmniuoxflpsuitutrvusbdqoqrhhajmxxihoe  ga ", "          xoxo tvcisroamsleuqmoerfb eeoouize  iv ", "evaobsujpaelvvqdegikgpsoedeecaeoiakgdgwabtpexnho ", "mhjidpnudeeiewvehn       yiientcoluvceu      oy ", "ywiaahadiwliislmuuoqxaeemiebteojexeuqzfy bxkeba e ", "bdfcieulnirnacaoaauineafowwekcuqielsfzxkamfbmef  ", "  ocbekomxljeoioidxilamazauiy  noxgedbeuqaueup ug ", " yucuwajntpdofmaubeekueuuzanaahaeiicabxzjuokiijjy ", "oc      yeu eeierrixxiedqedounroj  zoeeewaabf uwu " };
    assertEquals("abcdefghijklmnopoqrdsotuvwdxudyduczAduBccCuDoEFGd", poetry.rhymeScheme(poem));
  }

  @Test
  public void case44() {
    String[] poem = { "venth blxnnmethaviuelipgf pe  qaeej  ci i al fe i ", "dazaumsiwink          xaodeuit eevgaownz vom     ", "oeiojamumumqzaliedetiassonhnfbiazmi  loxufnaloy ", " vpeqneakengqauuzkurqo gasvdouhparuiaoaioy  u mo ", " edpeficusphoxxiukzmoowuiieuorugmudtouh    xfeeq ", " luieesueokaepouuvqboaqmv iawiwa       oakdn a  u ", "aeejimihaeijfauuujobvmevhuaotnunmkcued  voqkiep  ", "ioiweaiifuvkeuuedijptiorudaoegtqiokulitihifuey or ", "    ogovaie  apxqnwuuqvpqiaaieu wmuneeoed uzuoy  ", "   asifneouojeleovkbeiwxuuqingusvsolrer af   meek ", "oqoiuofhvekotimtneshuzxodaauwsviblijaasscjqnob ni ", "wqolw  xieuicuhvaefavrueveekafllmmzei noeinta sa ", "   lmakiieqbblwmiautooiiqaeingauvmjy ywulopr  uin ", "jxavao aohnokla otptenvpooxearnkzjhihlliuh   e uy ", " yieqoiubuxqujhpvkebosjuwee nwsofaoebqodlwoo ew o ", "coaeiooiixniqaiibolreq     fo i    olddaoxp ot ay ", " ykaeuguanovfghmufhhekkaziefrenkozavaaugl tug    ", " ankezaforcieohuujxozwaarqpbaeaxgg  ece   yop  na ", " poncotsovrjavfwuxum  opp  yehaiaoaxiwrxiuoio o  ", "oeuqacpxvujueeprevlcaqeneiabcoy  re euxninwanahma ", "wradgocurneeu   eh   wqfgxigigupuanmhdeorioey  oz ", "   aescosuiuaiouvpoagqoad   ubu tu yirooul acgon ", " hqigiuipmibdeeuo emsaiejd  o uecxabto wzshikeuux ", "kkauuaoiaboolcgqziai vvrujxgknengrueo   uiuiagy ", "aga dwaoukoaauereieuiauboeasuophkea  uhy opvrwjcy ", "ulosacieffoiefiexicuioikalacovzaa  duluanmbhoo as ", " iiaaeceausgoouomeiixjufz  npitvtieeouuibuudauioh ", "ytucwurfgsaovufkabdaoaiiaeeamqs yuhljceqeorfibhf ", "  notioqooxqnelugaleel lbffawihhgoidwxxiucl aadc ", "yqeneietlpoauuupzoxoudidh   ieafksa  duf yahdiv  ", " ozooijtazgi  wiotil huaaopveqi   dnahn umualj i ", "  beujaecioeiuob odfzxniuty ieioboqe eaxeexrihhu ", " tdziakoztpkwsunuuhkuesienxeeiuidickheevuctxiaefy ", "  seoehsdxeeoanezqukiiuaausoiibuiuoqriry   feuehi ", "aiioeuaatnpaeuohoexihv         atiiciixcjjues yta ", "oeo   mosewawiaioueoslgavoa  yqexmhj  zxmoli oy a " };
    assertEquals("abcdefghijaklmdnokdkpqrstuvwxyafzakk", poetry.rhymeScheme(poem));
  }

  @Test
  public void case45() {
    String[] poem = { "    qokbiuazaotqttgdupsioumk     bplauxoky izuvsq ", "oixukapcluurvniiivittacoazbgnenuasuvo lse   veoeo ", " mpoizmwiicabmiajgudeoeosoarnwaetotiaegxpaoeanb  ", "ubuqpvueaeupnzvpvoebevlosiaivewzaa i   yuuoeor   ", "oaiuiie  ehti enfessexeelwukfufelo zebobuieqaodoi ", "  iaealwbapaolobojareftloc  yufrporioir  aiua    ", "eeeu gberodui   asuwou  hvueiaooiofeesd  mikckk e ", " ioaeehroqurujzesiqlaoweualee uiizeiohaxnety  ya ", "   dojioecogzauqdbbabtzkij vfiukokroujlo uchxzu e ", " he yupixo  oadfvelifaneddpjzaosmi     yaachfau ", "orpoowd yrpouexjobiaatauacmiuooqobuxibhakejedatuy ", "ogequdicgiiofqttbauiaoiuemjla uuumecpttanavofhy  ", " unhndaceiiiewkearauce ooepkieve uiioweouojguy e ", "  aiqrhtxapeuuoamqsjdws osaelkeo     jiekslo szow ", "  fzncuootxevgogaoaaq   iimuxdemi     imh   iciuu ", " ynwzeuafizoovgmazofiidajgcioaajjzejjehoy aiexg o ", " fez ctzofeszdi mfi    hgttiukxy      agaofgboahl ", "   pdqrfboijueealgbqjcoztioa    bbi   nluaouptie ", " sieuaqy healdnqqeuaboeiofnewucjumihrwuotaiessuog ", "loagiflf kvhopkigfvbhsmxaeunbivafaeheolmesafuou  ", "    aqhvhiiiisochmiaiofien   i ikiabmbweeiot  yo ", "  yaaksmjoonqsxwgkalniipuj  xuuooundcuedlidraeeiu ", "  ejzok zudwagnemiapeoep u  qaqgxfibvpiisiaopk   ", "    tcafmoex ihogziegtflioeselaigwnwvhoeivcoy  eu ", "cjopgaidseaedumtaapzfo afibeaxmhoshkzlmdlohcokbob ", "  bckuizoesurhoneupaunnciwaaq ihio   i  oui ix o ", "        yamsuqs cweinaosjicupo   iy  llu  uy ihd ", "woso  kiorbidsiiupubpbjozaoiabtzaszzruowvuoooij  ", "   qkkciibguuwpxmqbadoesscoxqeaeitauim e    i a  ", "ouuideauieuesebioelulvpuiozeueoszidorlszmtcy ueg ", " esewnxprle iuexidoburzlqadujmnijroiuziecuaplv   ", "    ywoeeaeif ynfuxhikmctzvovieaezgrdjiujldomom  ", " vjgcavoaziauibiictvhvhuikpeuiia mooeivxmwchgteuu ", "iwue egoucxoulioarw okhfuwxokrjpwiazeckaziirimdfo ", "  uhtv uoue  iuiui apuckdipnna iudu vxbaewoos  ae ", "  txaauuuvtewmzqihozim oe mxim     ubplaonuh e   ", "xdgqugsewhifcl ximy        doabk apsf  uettfgy   ", " mzlwwsweakaxeiuaz  wug  yvboodsnomejf  a u o eiy ", "kok nsztaxoae bcefsa   fbidrunuxkjuupdlaatjpeou  ", "  ozmouorioievtrubduieveiqm  zubbugeeantu  qjmaww ", "   qvnupbjqg zphgfi   edgj  peiczk euy yofavmlay ", "ivpatngggbjeoujhnelsgqf eobcoegte  txxuuiiaeabe  ", "saauvzrpascleebsly  cuwaoisoitutusakwexcewvuuuei ", "odeerurtoeiujscptolgekjexmamliispmnoraokgg  u ygu ", "  imjaeetsumueeextsxmabbarxsaaxldcbaqafbu  yyla ", " imgk  glcluetkeji   ibetkaaxivd   azuzveojx baxu ", "reeuonupccefiiokurcntfoazwfkwhgldotjtivuuuok  ie ", "bbhsazbmix vwsgemzisipaxearedjzqauzl uwewpij gosi " };
    assertEquals("abcdefghgijkglmnopqrnstuvnwxhyzABnCgDEFGHgIJhJpK", poetry.rhymeScheme(poem));
  }

  @Test
  public void case46() {
    String[] poem = { "wdumwumoaweriaguooievzaxwzxjhdaoobieubwvf  ynol   ", "unijiuctabsiuidetldreaj   lzejeioreeqhtbiuvn uouw ", "  iuaiomiouauuiemmzuovedw yogoauoeaedaqohckano  a ", "pfgzpiuganeeidxhqxsuaueepauizoocna ikjdmiivkudy o ", "i   winnnudvprmeqfqpuiknigqdlqoeiseoddauo        ", " anueuj ajo  jgpaajxakuq  oecw    uksqiwl   equoe ", "gafuexpiaokgvwiultmpti bdgnznnoiijmturt  uz  icx ", " lepbaeoegakub       yuawuj iaeuuqhubouackujejii ", "roivaetfwor  rekivzzmanruws  jaxirdqq  emmueouoik ", " aamimugstkisogiopqzpaopicodw  lemuauoikrlot e qe ", "    xokpiurvbocoijwolbbiwqlagpchaoqf vnukdzhoobhu ", "  qliupdigauzhbcwehuaiioaiuttkavcr ivuetg u ya ab ", "aueuvqsqueheoexuaxpmleonoialpa eubrqkeahouuicilwi ", "maeaoruzaavuomauauapcnealaoowuc ykivoiema kgaqai ", "ytiuiiiujioeeoxoeogsieeomb     roeoierkj eo vu   ", "aqoguqxo     aaooiietpaaolflagptu  iocilkbfrfp i ", " eoeuoguja  jiicixaiquxuegboasjaeaihcgmiiese  u e ", " qi aolqxzzubdmabvubwn  erwgqodlnheuonzugiuabu u ", "jikedgrifeexiumoooeroio   azojeauojuounrro  i  ic ", "amjaxioogxnuuaeeperiowiwgdruxovajnutpcw  mkoo    ", "luauicebbvfhweiikhudvoznsieooditsteeripeadoslitsp ", "eakirgjqezoedubeokcbxoileuicihupgbiioqanbaobpi   ", "  uembcoosfvh  ilbuokoxwee dnzu   yofauhvq a eeou ", " aiplotxus yilueqrsuocxzgffvowfnev    ieurqixvow ", "cjnofuaauonfaoufaoeccpqxhgeaunalangojvnlttqkfkby ", "       rheb hdjgpzhsaqhlqjeupieaipkiux ya    e e ", "     eichjiunepejgvy aiksdahrifbumnouorooio esa e ", "  ubrucmoaua    afupa qtoqieoz vteutbmh cusetg  u ", "  sjcviwakfuhofkos iauesafuaiiaoiilwaipu    yyo ", "   xaunw ri  izejdeotcilqaaizulecfaarewnea     a ", " qqoauoueuuweuvseaxhduunovxunaudtombieiu  xoi  e ", "sluuuooovvgiaupilousf   yaiqupuetwodoue oey  i ", "  aigpfduirbjsitwfeazdwzksgng   hiuojjhqiy auoaw ", " ucnuiuiosahpudvuwwviawhgbaogvdufuwrr maeisqz piy ", "seuaedipoimiszf ausekdwuze iaezaomooexaud o   eu ", " ahkenouiesdovtlimoquejzizeiwzmuuatmhneliohtstol ", "suonbduwzuaeaiapuoeuudeuioxualseeevbenseggieic ri ", "   sifjfdvhxotafwiuuuujnjzguo ma mivazfndoitcga i ", "fhjujureooy jvpzaeipgdouwiiieoviexdqgpe   trzil  " };
    assertEquals("abcdefghijklmnkmjkopqmrstjjkucjmvwxammy", poetry.rhymeScheme(poem));
  }

  @Test
  public void case47() {
    String[] poem = { "opwajlok nucmeooobaoufuzadaigioeaeibioosiuioejwue ", "aubocittadivzpszooanueuewrauiczhtxockab  uesb i  ", "douaodfuitjaogitwjmendosiuokoumoiesbnwcoho   rhux ", "qolxemalzoauqujermein   nuiuxuphfenxdupzouj  e  a ", "ihxevvevlgtjhemcvvoumoeindawy     lobzfciitjiy   ", "odbjpwxvezl ytsmba dosbaehiuboaplslurievgs      e ", "leahlfkleauisikeerbxbqilprgzq  zaupbipqa  qeuhqi ", "jeuvieokimioufuwveooohkhauijlaieomkado ieyyioi ", "  qtiopdxuoevuvuhjtiahni uafuuauuqiecbgtkuop awiy ", "jldjxoeoregeefxjssnxz aejeaieofuaooeu    liaeumpf ", "   aeoeax     xtuvtort iiaoakajiinfrbejat   yurav ", " peqiidusaauvdnaegdftaivaidjvag qjaridna  maf  a ", "ylbahiijibuifuucuuvazx vomuuwpejzy yuosgpokua uq ", " iiuunxpxduopooeieosafoufy  igubto  xratmaib  mey ", " folaenvgkmw cotazuafietaiszpl  awkisoamy    e ey ", " uxuuudlbqamagofeaahfipxelxwuicauuwaoptapf  oeejy ", "pwrarapbaiuveuziku dfjuiquzxoeppaqsrfuf  on ynho ", "   waaeoixqfap yhiuwedoiqlwpaivxthebszlufu be    ", "aifupialsoai  ftwfoeutlexenoeoeoaxaiehkges    koj ", "vfjojiacsaqtiudsoaomxugivozaozii aa uimcoiiiui i ", "curjsgonubopddznuoiazuxueo   aiaiivoroeiw fmuuj e ", "ilouuwkedbxungjnjtueldireuetdadrcnnocauq   yeeaqn ", "ngfoppncocewquepxsituuheo  ylhapuwjtfbthijzgxioug ", "zemhubtieuao abpooicuioatfrov we   ujksgiooarjiuv ", "afemjhhgqeohiiatwcowiraiuqrf yevoaplanimw   lfe  ", " ynuanihpckuiqjzu ausxcuoaeeaubvcnsitubekilcbaco ", " voohzbpeobcaxixgvrxq maueopxaeclta nisuumdieu e ", " giaapauxl   juoivv yimgovuau a  unszfhequu nsagq ", "emqcmexgmtixejiaeq  aeozunexbcavvfhaeqxtooa   oil ", "uioempofodkaceouiogiieaunt  yuquitpaiqrdam  iay a ", "o    edzubdbefowejntljxipeexgekifaah  ueainemgpui ", "buaioadbwppaqhtaooqmeokiuuhzuxhpaudb soqky  e   i ", "ticolpkldabillcqhidjimqswluoetvibbeawauioloy  is ", "  yfbkeuuere zkfuvuzgxiaicxatxaa    niedina a ueu ", "     rfuiuuxuxrkzpxdsleeijxmdetnoe   xuxgw icxy i ", "   eizvakgrguahtwrtitoiiaiuiuucaizmujodaj   ux a ", "yfucuuauqnocuwhoeuooiiuawlxuglaef ftirdomaatu otz ", " yuehihzwxszuvomno qazfaiwhoozirwfbpqfeoetrwgeuu ", "nogfenuh   bcweqoklfeuuuoiear  cbozoeiho  eiardiy ", "ofeelouvuorsfeofxmdumeapuopezdlipruesuuuooijpdanq ", " nodoa  uuoiw abpioorwsyy  txieuqejuxni ieqy    ", "dkuruociiiclenipebieiehisuboemu iieoilrqvvugmgeli ", "fknuwpqjmmaafqrgaaeaakfamrinrjspeeaabnoiapg  ypuu ", " uvhhrgguiifabee  waufdkphaxuuoadfgecljbaahiaog e ", "   oceuuoxizfzkgmzkxaoaeau u uo rxqu yuimooaoif  ", " qeaavdtiefuidfdtfy jxouzanicdgpjlmxjzuovxwwbuciu ", "     axliiadacuxkkfee ktevbouaauaodf yay yi awon " };
    assertEquals("abcdefbgehidjkklmfnbfopqfmfrsdtbuvbdwxeyzbAfBCD", poetry.rhymeScheme(poem));
  }

  @Test
  public void case48() {
    String[] poem = { " ckiqoomxeaaaenmeaawrdoeqzpoupssnnlahii   hhbfa  ", "     eqeqeiiojmeodulawiouvouauiufp aodmaauuxuaoes ", "a  akrqutmdemzarjoiehnaonajnuepneqe kvupciy ihpy ", "zbivzlteeeweaa  ieiooo erosoejieuhic   juhy ysiu ", "oidioacqxoioekavpaizcwouvksniuuaouqsa  vse twiz  ", "    oaemcklwuezadzcschxjveboeexarmcepe  e   eojp ", "uieexcuvisqoroa   unaxjneawloeeopaug  rfeamy     ", "  yzuion ioxezecaueqaeaaeoaizcsiumgoaw   aaii e  ", "wcneaeejoindaoesaeaholiasadgaaatjnaoffoe ru ciy  ", "  jisxeeseh yuvgeqrhizaodeasaismiitrfkraxemuy cfo ", " kxaummxjuvlsrmejuvtujen cwouneke    yeo gofgku  ", " iiduu   eenaoatukoogoiefjcsieaaueuzadggafaieaiy ", "  rstnaoiojaobaiokeauegtcdoaiugokmp iam    a ic  ", "ueerwenxqiv pdxuiakejpqobioamdemxoewj ldguua   a ", "yaaoauarusawi eitipfnaxuruoraaar maiofzoluvtjjgl ", "efpeuloelcxbvoxbuuodgzg  hihpuadeoasaok qsu yujs ", "iosackqreqcjoxcu  hkkcigqkouoi u  ezy  oszemdfmu ", "  uqbvmsnqpaavaareoksljahvzgexaaoecwaebia  i yoy ", "lncu   teoeqobeopeahfeh  eoeabzikslomlcgkitaa    ", " cfouzis kteetmaijbuataohla  yaoeuieaimawiaxia o ", "   yunuss lucrugiujorewjiqwvaiqtrlhsed  oklfiau  ", "ihf aofuevhsgarkoztioduiooweutjacvmiemzi cajh uj ", "kidrnoagozbfuiaplzqvbick    ouaoavxcy  yncnnu  a ", "yfbtiufdoaut abkbodabakxailaoknoscaoxjsegdabxeeo ", "  gaorpwaz  aqp vkoamc iaedqfxkiioiagiouato   oti ", " iaojgispaceugtxtngakmievugiioy   af kbzboe  aob ", " hudocmncifaeaxihupijeoeqiupumueouuediiuq btoo a ", "cazuexeonoektvavpbkkcuqadcaieeuohgsuuiegxujoibtcp ", " jgoteioaoe  eulotmaodapahmouihvuonooopatmo ad  a ", " ahkubkoiomaibancr  rguaeoijkoozagufgiziaolai ouy ", "      upuhaixbeoomigfcebbassxcwleatgpmao  eyy ", "  uevpeniourwanfprvnbaxaaapoxi uqdq oz   i  petx ", " obaefalmhoesbeeajkmchuseaugu apgaghvurbf wiqwtuy ", "qtdjqungfiesoiwieeiwhlsjeluagdoasmgsiweokiuhj a  ", " hoaoraniqemnwoiuinzenhloxnwvvrgeeaihqgpqzifj    ", "   xoiaucwewaeequahaenqpubieuooaicagoiiu   im   o ", "uaomezt  tulde iue   eaugtaoqatiqhaebtlepikeeiu e ", "  yailoaztutgxl    ioojeqea   xiy eaiveskku  kaoa ", "    beidgiaoaomgzoouibglcfei bi otf puooe yvcsa  ", "     yxieooizrjbuiahosrfhaeot wke aihin ujvsuvau ", "yinhuuooharoxaeseoiioooe  ygasekeiiat   yietuui a ", "     iwafahlgokxieuiazeinzuia   osaeises avkiev e ", "ksexepeoaeniquiaaoeomdiquozeugkdceaiioesht jiu me ", "etbageuwhuvzqwde   yorgppeoiesiul odeoaueh    ioq ", " uoqpmxthlpeauluua   xabekbpehulfjpzsiagv  adei u " };
    assertEquals("abcdefghijklmanokpqjrsatuvawaxyzAaBjhCaDahhEk", poetry.rhymeScheme(poem));
  }

  @Test
  public void case49() {
    String[] poem = { "uwaaoueiemtbhpunagipuxaouowisio  ieae uoanjqeekaj ", " yoeunakgioisoutebqfiihnaotnothrs mzquviunopw    ", "xuikroahoukzrvugu     uprugaxpuceeisgucu du i  u ", " hokvaaexgacgnppngpainpcsarzi  eainuaku ua ykpad ", "vguiriudaqvueoiraavaaazoikigusluooaor  juy bqne  ", "uekqifndtupvi  ilndfo  kcuuouilgehbmuuuuaxh i    ", "  foxeeazhiuaogwl  qait sjiucuoz yqaioura xu yxce ", "xloubxouiqy ielqxopauiiozcwekaukgnisauvardy   aq ", "kaoeoicquxdeduwidoovurjtocpooeboi isy   of    fu ", " ipoaawam  oanxoooingeibipzbucaqugjxfgqmxgugzux  ", "vripsm  dekjlmxafri  pihezneice pacf yvjuais  day ", "   ipgtaaeoo lu chloproeaetaqsuuuavneruqam qselz ", "    aqidozeweghgmoeausiapaoavdawxeotoa  a        ", "lofbeavo  wuuoihelojtienuaozoolnsks  ggiapbbx u o ", "  uegurwwuaioznpmceraooaaavhfduaosaiixeuareatuvw ", "ueiaiaizttuaoroin i  parljogaoneauuiiumli rxay  o ", "   yeorwemieroeteeuarlgequueapivomeuaw    or  ucz ", "o uoduqheeiwecabeqousholzralritmouuieqihi  bhel  ", "xxo ut    fuezeiipsusiziauiuggcrkqefiuckcoujsfxf ", "   afrgdeidlqeaai    opierouadhcaaouoqziy a   af ", "   uomhquevpknouoeui    vlefbrjiilouix ertieukv u ", "uo  oalwewuautovolo ocawirocdjpiaeiqaiokdhe iuoo ", "  ieumueeabiukpweqeeacjouibwutuxeoukofwouy   ux o ", "bueiu  aouaubo wfef evgxamfoqunjklagonaxw a      ", "    ugzbkwuuueoonemjjnxviinikepi   kpgawlu aiafe ", "joiogxzwbdunukehqboc orjr usqs nuqeil  zkleiv ax ", "euhsliedikwo    jhgireaassdaqfssitfelondrxumd  oe ", "qxteenppiaxzevzngqileompqcjwhiwfielrahdrn vo o  o ", "dodiljuvdeutd ioamuie  tpdqej eoneiio meosu  ee  ", " knihmeiuqlgoauburizaiehoozvfmiufkagujioaeaelae a ", "  xismoxqvgzamoalisf  rvaeegoidmootosoecrts  ie  ", "u zqjksam  igi   meoadnagivgkiqfmpxiuoeomjomf  i ", " zmueabinuafeagiazgcwniec   aakivoioendereotuuipo ", " oaiecjeebgooagegxombd akieiaursumteaosoxfe  iny ", " yeowffzhoesoiieieeaibiaiioieigpeeoihkfior eai it ", "  eanzgeodgjiicapzpupvrmeubmsiaeocitapac aizi    ", "uibmgsfulqjanoeola      evehoipp     yu   exxbff ", "odisueta               wluqshpn ocknooeby  i  he ", "  biumalexllzvpocbuosjdhzuay iiwombimr iisq hnxoo ", " gvzihquahicigfmjdqaqajzguobvbeauqoigvu uxkkajap ", " ueooujtqjuszvodmiaeesi     fgeoleeailg    ypo e ", "geactiy  iosepauvizaaoovirjuceuvwieogbocxfri i ob ", " cqahjcuomaalltmeuovoroosopoegoegmt    euoviroih ", " upuoavlavxaepxeetzkdojahnezqnneiai upoggc ey    ", "o        wiaovvceshoinnhuflkbsabosionlkelvjeuaury ", " ezbzxitaqocqroeeqgxaoos  apsdadljfaui   u coua i " };
    assertEquals("abcdefegchijklmlnopqcrlkestlukvflwxfyezAeBCDEf", poetry.rhymeScheme(poem));
  }

  @Test
  public void case50() {
    String[] poem = { "a", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "ax", "ay", "az", "ea", "eb", "ec", "ed", "ee", "ef", "eg", "eh", "ei", "ej", "ek", "el", "em", "en", "eo", "ep", "eq", "er", "es", "et", "eu", "ev", "ew", "ex" };
    assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX", poetry.rhymeScheme(poem));
  }

  @Test
  public void case51() {
    String[] poem = { "This poem has uppercase letters", "In its rhyme scheme", "Alpha", "Blaster", "Cat", "Desert", "Elephant", "Frog", "Gulch", "Horse", "Ireland", "Jam", "Krispy Kreme", "Loofah", "Moo", "Narf", "Old", "Pink", "Quash", "Rainbow", "Star", "Tour", "Uvula", "Very", "Will", "Xmas", "Young", "Zed", "deception", "comic", "grout", "oval", "cable", "rob", "steal", "steel", "weak" };
    assertEquals("abcdefghibjkblmnopqrstcuvwxyzABCbDEFG", poetry.rhymeScheme(poem));
  }

  @Test
  public void case52() {
    String[] poem = { "your", "byour" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case53() {
    String[] poem = { "spying", "sing" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case54() {
    String[] poem = { "     solution went   sour", "too bad   yyour" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case55() {
    String[] poem = { "axy", "exy" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case56() {
    String[] poem = { "saaaaab", "saaab", "gaaaaab", "gaaab", "a", "your", "sour", "our" };
    assertEquals("ababcddd", poetry.rhymeScheme(poem));
  }

  @Test
  public void case57() {
    String[] poem = { "exy", "axy" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case58() {
    String[] poem = { "This poem has uppercase letters", "In its rhyme scheme", "Alpha", "Blaster", "Cat", "Desert", "Elephant", "Frog", "Gulch", "Horse", "Ireland", "Jam", "Krispy Kreme", "Loofah", "Moo", "Narf", "Old", "Pink", "Quash", "Rainbow", "Star", "Tour", "Uvula", "Very", "Will", "Xmas", "Young", "Zed", "deception", "comic", "grout", "oval", "cable", "rob", "steal", "steel", "weak" };
    assertEquals("abcdefghibjkblmnopqrstcuvwxyzABCbDEFG", poetry.rhymeScheme(poem));
  }

  @Test
  public void case59() {
    String[] poem = { "your", "byour" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case60() {
    String[] poem = { "spying", "sing" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case61() {
    String[] poem = { "     solution went   sour", "too bad   yyour" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case62() {
    String[] poem = { "axy", "exy" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case63() {
    String[] poem = { "saaaaab", "saaab", "gaaaaab", "gaaab", "a", "your", "sour", "our" };
    assertEquals("ababcddd", poetry.rhymeScheme(poem));
  }

  @Test
  public void case64() {
    String[] poem = { "exy", "axy" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case65() {
    String[] poem = { "This poem has uppercase letters", "In its rhyme scheme", "Alpha", "Blaster", "Cat", "Desert", "Elephant", "Frog", "Gulch", "Horse", "Ireland", "Jam", "Krispy Kreme", "Loofah", "Moo", "Narf", "Old", "Pink", "Quash", "Rainbow", "Star", "Tour", "Uvula", "Very", "Will", "Xmas", "Young", "Zed", "deception", "comic", "grout", "oval", "cable", "rob", "steal", "steel", "weak" };
    assertEquals("abcdefghibjkblmnopqrstcuvwxyzABCbDEFG", poetry.rhymeScheme(poem));
  }

  @Test
  public void case66() {
    String[] poem = { "your", "byour" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case67() {
    String[] poem = { "spying", "sing" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case68() {
    String[] poem = { "     solution went   sour", "too bad   yyour" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case69() {
    String[] poem = { "axy", "exy" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

  @Test
  public void case70() {
    String[] poem = { "saaaaab", "saaab", "gaaaaab", "gaaab", "a", "your", "sour", "our" };
    assertEquals("ababcddd", poetry.rhymeScheme(poem));
  }

  @Test
  public void case71() {
    String[] poem = { "exy", "axy" };
    assertEquals("ab", poetry.rhymeScheme(poem));
  }

}
