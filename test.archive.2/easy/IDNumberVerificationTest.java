package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class IDNumberVerificationTest {
  IDNumberVerification idnumberverification = new IDNumberVerification();

  @Test
  public void case1() {
    String id = "441323200312060636";
    String[] regionCodes = { "441323" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case2() {
    String id = "321669197204300886";
    String[] regionCodes = { "610111", "659004" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case3() {
    String id = "230231198306900162";
    String[] regionCodes = { "230231" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case4() {
    String id = "341400198407260005";
    String[] regionCodes = { "341400" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case5() {
    String id = "520381193206090891";
    String[] regionCodes = { "532922", "520381" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case6() {
    String id = "542500201106110300";
    String[] regionCodes = { "510129", "330521", "152528", "632822", "211081", "532530", "340521", "440401", "230903", "130802", "542500", "621002" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case7() {
    String id = "410222196212140076";
    String[] regionCodes = { "410222", "610100", "500225", "211100", "450330", "340811", "530626", "131081", "450107", "420112" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case8() {
    String id = "210711200001220738";
    String[] regionCodes = { "445321", "152530", "420303", "320581", "341002", "520425", "320504", "210711", "410301", "522600", "640121", "360881", "430412", "230231", "370104", "410204", "420506", "370202", "341600", "610630", "110117", "410411", "370784", "360302", "340202", "542523", "441621", "320924", "360500", "210502", "441401", "140181", "230828", "140723" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case9() {
    String id = "350600194103210619";
    String[] regionCodes = { "450703", "350600", "350602", "350122", "450332", "130204", "532527", "150782", "511824", "310101", "532600", "220382" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case10() {
    String id = "370682191505290724";
    String[] regionCodes = { "542223", "610600", "211005", "220112", "350481", "150124", "510701", "410900", "350111", "330281", "340304", "652800", "513432", "513430", "370302", "522422", "370682", "350702", "513227", "654223", "131123", "623027", "130632", "610304", "445202", "370100", "371423", "450200", "210401", "131182", "522633", "350123", "513230", "320381", "360728", "450221", "341525", "370202", "330900", "131125", "320105", "440513", "130681", "210303", "430224" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case11() {
    String id = "320311195510080120";
    String[] regionCodes = { "341600", "130500", "532331", "371202", "430822", "450400", "441827", "131124", "360723", "330624", "420000", "650201", "232700", "320804", "513232", "340801", "611025", "140823", "622926", "632626", "230902", "632802", "410401", "330328", "654221", "150205", "451000", "411521", "210302", "520329", "341125", "320311", "350921", "440811", "513436", "150622" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case12() {
    String id = "45128120050628067X";
    String[] regionCodes = { "445322", "130984", "330101", "350724", "513300", "530500", "654003", "640522", "350105", "623001", "150782", "469005", "411282", "320200", "320925", "361127", "451281", "330400", "341324", "511321", "330110", "130604", "371626", "620900", "510401", "210521", "140401", "445200", "230302", "340703", "431026", "330825", "360728", "141121", "510183", "511301", "440204", "652223", "320500", "500112", "450722", "530124", "513329" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case13() {
    String id = "450226191301030784";
    String[] regionCodes = { "510901", "445101", "340604", "410801", "450226", "421002", "654002", "430381", "130683", "650204", "230112", "640221", "411624", "620824", "640301", "542128", "469029", "430525" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case14() {
    String id = "141100199510230649";
    String[] regionCodes = { "210502", "411501", "141100", "410482", "210624", "610122", "530821", "430523", "360781", "131000" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case15() {
    String id = "41120219910804071X";
    String[] regionCodes = { "140981", "511681", "430204", "420505", "320324", "341301", "640181", "451123", "440705", "411202", "640423", "431128", "220500", "520325", "533102", "230522", "431025", "511522" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case16() {
    String id = "44405619350217028X";
    String[] regionCodes = { "371301", "610403", "520102", "120225", "321183", "340102", "532500", "532600", "450326", "540102", "360602", "140900", "130923", "513423", "370832", "440511" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case17() {
    String id = "620829195310030243";
    String[] regionCodes = { "530122", "110104", "360721", "411602", "652901", "620200", "610826", "230221", "152500", "410411", "140801", "440800", "620921", "451481", "513426", "321000", "360400", "320381", "141000", "211103", "350421", "141181", "420921", "510726", "310000", "360122", "150429", "652200" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case18() {
    String id = "313937191406010252";
    String[] regionCodes = { "370725", "341302", "500241", "640100", "653226" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case19() {
    String id = "57473419490226027X";
    String[] regionCodes = { "620400", "411103", "340503", "540123", "140781", "654223", "451222", "210323", "370401", "220582", "141000", "640302", "210911", "632221", "511303", "340401", "370102", "360700", "340207", "420527", "420115", "530825", "410205", "450100", "450981", "150422", "431023" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case20() {
    String id = "152961193509120225";
    String[] regionCodes = { "542334", "450681", "130728", "422802", "440203", "469029", "130900", "130724", "141121", "230281", "150921", "330104", "520381", "210283", "632622", "230822", "360402", "623026", "451221", "411104", "150901", "440804", "440205", "340121", "450901", "621226", "141081", "522222", "440000", "511381", "340311", "361128", "230127", "350203", "320600" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case21() {
    String id = "350425245406180780";
    String[] regionCodes = { "220401", "130533", "210900", "431002", "652700", "220181", "360401", "441781", "441481", "510823", "350425", "610327", "510722", "430901", "360822", "431101", "500118", "510703", "222424", "513425", "141182", "341723", "150206", "341103", "540100", "430702" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case22() {
    String id = "361101435707150182";
    String[] regionCodes = { "130227", "510923", "141130", "361101", "360102", "131121", "370801", "141002", "500112", "431122", "340402", "360000", "433100", "513232", "110109", "411503", "330482", "441581", "430901", "210311", "530421", "610700" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case23() {
    String id = "330103030006150930";
    String[] regionCodes = { "510601", "410202", "420106", "654323", "450000", "340208", "231024", "110109", "430201", "441422", "320101", "230621", "420302", "511802", "321084", "341800", "340702", "360733", "430401", "211021", "130638", "321002", "621026", "542226", "451000", "220322", "532524", "532928", "542335", "410304", "210703", "371311", "330103", "360921", "341503", "130183", "370500", "620923", "510114", "130130", "150124", "542122", "533325", "360725", "522731", "510132", "431281", "152222" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case24() {
    String id = "430103377805150220";
    String[] regionCodes = { "410711", "130403", "150901", "130224", "610111", "632522", "420205", "430103", "310000" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case25() {
    String id = "532531592305210236";
    String[] regionCodes = { "542423", "231223", "340103", "321084", "120225", "430702", "431024", "511028", "210181", "511800", "140929", "632721", "370105", "451202", "510124", "532531", "130525", "152221", "653121", "421003", "430202", "510107", "530128", "510114", "320501", "510422", "230108", "331121", "410701", "542231", "310112", "500101", "469024", "130201", "445224", "513329", "371701", "421202", "321203", "150921" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case26() {
    String id = "34182520016417010X";
    String[] regionCodes = { "653122", "530630", "152200", "140321", "210311", "371100", "330881", "350105", "522726", "341825", "500230", "630104", "530102", "652824", "320381", "511112", "500108", "360521", "330621", "511302", "441424", "522627", "450981", "420804", "210682", "350500", "511113", "420205" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case27() {
    String id = "350823194634020182";
    String[] regionCodes = { "410702", "513332", "532329", "232721", "150702", "370611", "350926", "371724", "469007", "411224", "350823", "320303", "360900", "210682", "610422", "410102", "653101", "610901", "510300", "530428", "451000", "131082", "370682", "520382" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case28() {
    String id = "120114196374240817";
    String[] regionCodes = { "511681", "420300", "330282", "410505", "440305", "411523", "371002", "510682", "120114", "320104", "330300", "411282" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case29() {
    String id = "360827198592250873";
    String[] regionCodes = { "222404", "530802", "371323", "150430", "140200", "150922", "512022", "131128", "360924", "330522", "152501", "360827", "440802", "511523", "320701", "350982" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case30() {
    String id = "230502200993080921";
    String[] regionCodes = { "340701", "230502", "350305", "450123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case31() {
    String id = "441702190208570437";
    String[] regionCodes = { "620101", "211421", "320602", "441702", "150823", "451100", "410900", "131127", "450521", "430922", "420202", "440301", "130524", "340721", "450223" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case32() {
    String id = "620725198811910460";
    String[] regionCodes = { "620725", "210603", "220421", "530802", "230705", "340122", "410703", "620123", "150928" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case33() {
    String id = "130533193502610245";
    String[] regionCodes = { "130533", "130632" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case34() {
    String id = "330206199509450247";
    String[] regionCodes = { "610821", "360400", "430903", "533323", "150300", "230129", "220181", "320481", "431001", "150923", "230811", "530423", "211202", "340222", "130426", "440304", "330381", "530112", "530624", "350501", "370900", "500112", "330206", "430401", "330182", "341800", "230502", "441882", "430122", "230100", "430304", "350782", "530800", "320206", "451402", "320200", "140801", "532324" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case35() {
    String id = "411222194802000278";
    String[] regionCodes = { "532930", "150821", "231085", "152501", "411222" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case36() {
    String id = "130722190309100006";
    String[] regionCodes = { "130722", "441401", "370000" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case37() {
    String id = "430726194608070008";
    String[] regionCodes = { "653130", "210282", "370601", "220382", "530111", "440111", "450203", "421381", "370826", "653125", "511621", "140222", "320381", "430726", "532501", "451025", "360722", "130431", "632626", "620300", "350982", "421125", "610431", "310114", "530922", "632802", "411222", "211122", "340504", "610402", "451302", "540126", "360681", "370901", "140425", "411082", "610825", "350122", "440700" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case38() {
    String id = "350111199502050004";
    String[] regionCodes = { "141023", "430405", "150100", "610625", "522625", "450401", "152531", "350481", "110228", "210104", "430221", "130629", "370601", "340400", "513400", "140322", "620402", "522731", "231200", "340303", "350902", "330185", "140830", "431024", "542231", "371422", "430101", "511823", "360430", "420822", "411224", "513337", "542226", "360202", "431124", "360222", "640501", "350403", "350723", "430301", "530823", "450325", "542527", "420804", "152528", "230716", "350111", "522627", "420981" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case39() {
    String id = "620921195201200009";
    String[] regionCodes = { "513437", "431123", "130703", "370601", "211421", "340621", "230381", "620921", "360103", "542430", "450405" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case40() {
    String id = "330281194703090000";
    String[] regionCodes = { "522423", "330621", "330481", "371481", "520114", "370403", "441400", "320506", "230811", "231225", "610926", "210501", "441422", "371701", "431081", "611001", "320211", "130627", "610327", "610430", "420683", "513338", "430202", "653024", "140802", "130900", "230229", "370724", "350722", "230700", "440507", "430721", "630103", "530626", "441301", "320282", "540122", "610116", "430522", "513200", "320200", "513431", "330281", "421224", "610304", "130128", "511112", "610700", "230621" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case41() {
    String id = "220702190204230130";
    String[] regionCodes = { "441283", "510703", "530113", "610624", "532924", "510182", "511526", "152223", "530125", "220702", "513230", "522634" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case42() {
    String id = "532331200708230080";
    String[] regionCodes = { "210202", "522401", "451424", "360881", "230227", "130604", "370522", "542522", "231004", "513300", "469003", "371402", "420684", "451227", "330105", "620000", "653126", "220724", "520300", "420112", "440923", "652929", "522428", "441401", "653100", "530501", "411102", "542623", "542325", "130824", "410725", "410222", "341503", "370481", "220401", "331102", "340521", "310104", "654026", "622900", "532331", "500225", "130183", "410225", "610300", "360729" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case43() {
    String id = "320826194208020820";
    String[] regionCodes = { "230126", "361023", "320505", "430723", "420112", "410600", "420981", "511401", "540124", "451421", "640423", "230828", "371581", "141002", "532328", "230381", "220681", "120114", "610823", "350521", "341003", "431229", "230881", "371724", "320903", "371326", "371325", "340104", "120111", "512001", "420682", "542231", "360402", "530629", "210282", "130524", "620401", "230805", "530325", "320826", "530000" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case44() {
    String id = "410726194106230035";
    String[] regionCodes = { "469000", "410726", "542624", "360421", "110116", "361028", "430981", "230707", "330522", "360821", "610124", "110113", "150921", "211421", "220382", "410782" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case45() {
    String id = "433125195210190363";
    String[] regionCodes = { "620121", "510725", "433125", "230129", "411729", "130202", "321202", "130128", "652701", "522626", "330601", "620102", "530322", "652325", "320124", "420106", "441523", "360281", "130636" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case46() {
    String id = "370900200903040159";
    String[] regionCodes = { "511900", "220102", "320400", "450481", "140723", "230183", "211422", "530000", "430304", "130527", "150929", "340203", "231226", "530111", "510301", "370900", "330322", "220800", "621001", "652101", "230223", "360423", "511525", "140522" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case47() {
    String id = "540126192607160993";
    String[] regionCodes = { "610200", "430124", "620982", "450802", "140921", "441800", "610702", "540126", "130983", "440803", "410201", "520123", "500235" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case48() {
    String id = "620701196902070227";
    String[] regionCodes = { "441827", "230604", "150100", "420607", "420106", "211081", "522624", "532600", "654223", "360427", "150000", "330322", "530602", "152500", "140901", "640423", "110113", "620701", "530126", "430802", "441623", "350701", "150581", "410927" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case49() {
    String id = "23012519761215012X";
    String[] regionCodes = { "320826", "441823", "450221", "140402", "340603", "150802", "430811", "532523", "360423", "210411", "511501", "532801", "450102", "511402", "450321", "640100", "520401", "522423", "430623", "230125", "330103", "530702", "371625", "211404", "152222", "431230", "440500", "451321", "451281", "430721", "220581", "140311", "410306", "410821", "130132", "451021", "350526", "420702", "130582", "652927", "513323", "320901", "150624", "220323", "654002", "450304", "361123", "653124", "210204", "130121" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case50() {
    String id = "320621193107030271";
    String[] regionCodes = { "421081", "421222", "430181", "320206", "350600", "320901", "130601", "533300", "632822", "451324", "610527", "210323", "341003", "410404", "451027", "231002", "330824", "341400", "210803", "533124", "620123", "410311", "110115", "542527", "141024", "210726", "150784", "450481", "211223", "331002", "210600", "653129", "140500", "411322", "411625", "510129", "320621", "530828", "513432", "420205", "421000", "320503" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case51() {
    String id = "410221189910150173";
    String[] regionCodes = { "220204", "654027", "141000", "350622", "610102", "430623", "450601", "410221", "421003", "140624", "610582", "320582", "341181", "451121", "222406", "431023", "652200", "451026", "632222", "120102", "511502", "441900", "611025", "422827", "210502", "421001", "140501", "430221", "120000", "440308", "210203" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case52() {
    String id = "441825190010120967";
    String[] regionCodes = { "469027", "341221", "140827", "511323", "441825", "120000", "130633", "140122", "361129", "340405", "230701", "220382", "510923", "532600", "130530", "440803", "530500", "150206", "622926", "130726", "440605", "341101", "330303", "340700", "131022", "130900", "450421", "533400", "230881", "210921", "370103", "370704", "430725", "510801", "150782", "610424", "440114" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case53() {
    String id = "110117201102160195";
    String[] regionCodes = { "650000", "510504", "542229", "430281", "451000", "513434", "431001", "522727", "370612", "130983", "422827", "310116", "620522", "130706", "610526", "653100", "141129", "530800", "130523", "411121", "341001", "650106", "532500", "620523", "320811", "542421", "632723", "370126", "610481", "420624", "110117", "460108", "441801", "620102", "450801" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case54() {
    String id = "130634201204120933";
    String[] regionCodes = { "410802", "530421", "532929", "445323", "440902", "350629", "350502", "652701", "542227", "130522", "130634", "210100", "320982", "441423", "410183", "530702", "410421", "431128", "131123", "360502", "511724", "632823", "469003", "130424", "320623", "130125", "640302", "652900", "140722", "510104", "530601", "650101", "520382", "230502" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case55() {
    String id = "411329200800050616";
    String[] regionCodes = { "542301", "231223", "120223", "411329" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case56() {
    String id = "510122195401130444";
    String[] regionCodes = { "340123", "371101", "130133", "630103", "653124", "120223", "130702", "440204", "513233", "130927", "510122", "652900", "330482", "450921", "450204", "110109", "654003", "220401", "510823", "360104", "530400", "410503", "532324", "130126", "320111", "411502", "630104" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case57() {
    String id = "542327194112280118";
    String[] regionCodes = { "542327" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case58() {
    String id = "220721198913190564";
    String[] regionCodes = { "410185", "320101", "140828", "220721", "540122", "150921", "411426" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case59() {
    String id = "621223198502000501";
    String[] regionCodes = { "530502", "522200", "621223", "220201", "610400", "130200", "410500", "431124", "370303", "530427", "433127", "653125", "542300", "654201", "621124", "410301", "632726", "340208", "420324", "441881", "350681", "220700", "360701", "120223", "430501", "640502", "441424", "430124" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case60() {
    String id = "220283194502010518";
    String[] regionCodes = { "421123", "623023", "530822", "450423", "520323", "120112", "451202", "141100", "360281", "520103", "150822", "150501", "130925", "530922", "441800", "640121", "320281", "360734", "220700", "522400", "370827", "310000", "230128", "511901", "371083", "141032", "429004", "341225", "220283", "654301", "510403" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case61() {
    String id = "411300191302280027";
    String[] regionCodes = { "320701", "150823", "440903", "130900", "530324", "430511", "441825", "411300", "513233", "632122", "211303", "542324", "421127", "510115" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case62() {
    String id = "520382199502290292";
    String[] regionCodes = { "510900", "350481", "632623", "530128", "410103", "419000", "210703", "530629", "320923", "430412", "520382", "330523", "150524", "341701" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case63() {
    String id = "451028192802000951";
    String[] regionCodes = { "320924", "513426", "371522", "140821", "451026", "450404", "341525", "511721", "210782", "511522", "632822", "130629", "140824", "370303", "542322", "230124", "654225", "331102", "430621", "431022", "211321", "510184", "230622", "513422", "632324", "320321", "330105", "451028", "321324", "220323", "530623", "410821", "220182", "513321", "420529", "360426", "140225", "430821", "360826" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case64() {
    String id = "450327200802010734";
    String[] regionCodes = { "450327", "451023", "130205", "421123", "652723", "610330", "510703", "220521", "520302", "610404", "330400", "341721", "320500", "410601", "231223", "445101", "150921", "230103", "650103", "522624", "441400", "522300", "441421", "341182", "620502", "530800", "210103", "130532", "220102", "410311", "360924", "511526", "230503", "513329", "451226", "320401", "340703", "230111", "510422", "440301", "411527", "430204", "410581", "341722", "632323", "520100", "371521" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case65() {
    String id = "530326191602290964";
    String[] regionCodes = { "320202", "331000", "411501", "120102", "530326", "361122", "610801" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case66() {
    String id = "442000200002300016";
    String[] regionCodes = { "530900", "370830", "140222", "513429", "530800", "140121", "654226", "350100", "341222", "370703", "450703", "331082", "450226", "330683", "340202", "520381", "420325", "500115", "130426", "430121", "360827", "210400", "530921", "632626", "230702", "654323", "140122", "610926", "152501", "442000", "450421", "341203", "210112", "130982", "410801", "211321", "210711", "533400", "131121" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case67() {
    String id = "421001191111000637";
    String[] regionCodes = { "650000", "421001", "230501", "140203", "150424", "141181", "522723" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case68() {
    String id = "52263419731101009X";
    String[] regionCodes = { "440523", "653224", "469022", "522636", "220582", "540124", "410327", "370181", "520300", "430405", "411501", "350205", "441721", "150782", "140931", "532625", "140411", "130205", "131081", "420102", "445200", "440111", "222402", "440201", "522634", "411329", "340000", "420107", "130981", "411503", "511025", "630101", "530602", "350924", "451021", "513332", "530823", "430623", "150926", "500230", "411103" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case69() {
    String id = "450224199809300064";
    String[] regionCodes = { "371625", "410928", "411422", "610301", "450800", "441302", "640401", "530126", "370104", "430304", "130627", "542300", "610424", "371701", "450703", "440222", "520301", "450224", "370125", "610724", "330301", "440982", "440106", "340801", "330300", "622921", "610727", "340404", "210802", "450108", "530424", "370883", "370321", "650000", "421003", "130684", "620822", "371423" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case70() {
    String id = "451122199004310962";
    String[] regionCodes = { "131123", "530601", "530128", "141024", "610116", "130729", "620501", "231224", "210301", "445224", "451227", "370784", "451122", "230505", "140721", "511922", "542332", "340822", "150221", "654226", "130625", "330411", "440201", "130681", "659000", "533321", "420505", "620721" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case71() {
    String id = "450400190805000768";
    String[] regionCodes = { "330402", "450400", "320982", "331024" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case72() {
    String id = "510502191310010699";
    String[] regionCodes = { "623001", "331023", "410305", "330922", "410224", "130733", "130202", "532927", "500200", "340621", "429004", "510502", "652927", "654025", "610326", "360827", "130203", "230129", "420581", "450226", "411424", "441225", "450126", "211221", "450329", "230406", "360281", "330602", "350105", "341701", "420981", "150726" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case73() {
    String id = "320211199508310161";
    String[] regionCodes = { "320211", "350201", "310118", "131127", "230221", "320982", "150624" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case74() {
    String id = "141182197801320922";
    String[] regionCodes = { "640422", "411424", "320925", "110000", "150627", "440703", "150429", "431028", "530821", "370105", "371327", "621225", "441700", "211324", "620422", "340111", "120106", "140400", "511701", "654324", "320503", "320281", "431123", "341100", "230126", "130927", "341401", "141182", "510626", "533323", "431024", "371601", "130822", "440404", "440282", "431230", "230501", "511801", "433125", "211322" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case75() {
    String id = "532525190002290444";
    String[] regionCodes = { "130601", "410100", "513426", "130301", "130527", "652328", "320125", "420701", "341100", "220203", "441602", "450127", "330801", "430423", "620924", "654023", "220281", "110102", "321284", "340102", "611001", "640202", "500000", "532823", "140300", "141032", "620823", "532900", "430501", "130207", "513432", "130638", "330601", "341004", "532525", "350426" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case76() {
    String id = "230307200002290110";
    String[] regionCodes = { "420300", "140227", "410101", "230307", "542429", "130638", "421087", "530421", "110102" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case77() {
    String id = "62012319240507058X";
    String[] regionCodes = { "620123" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case78() {
    String id = "230231198306900162";
    String[] regionCodes = { "230231" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case79() {
    String id = "321669197204300886";
    String[] regionCodes = { "610111", "659004" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case80() {
    String id = "341400198407260005";
    String[] regionCodes = { "341400" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case81() {
    String id = "330881198904290018";
    String[] regionCodes = { "330881" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case82() {
    String id = "441323200002000638";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case83() {
    String id = "441323200312060006";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case84() {
    String id = "620123190002290589";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case85() {
    String id = "34140019000228001X";
    String[] regionCodes = { "341400" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case86() {
    String id = "441323200002290639";
    String[] regionCodes = { "441323" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case87() {
    String id = "100000189602290013";
    String[] regionCodes = { "100000" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case88() {
    String id = "441323190000060636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case89() {
    String id = "441323200300060639";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case90() {
    String id = "123456190001121116";
    String[] regionCodes = { "123456" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case91() {
    String id = "123456200002299991";
    String[] regionCodes = { "123456" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case92() {
    String id = "300000190802290478";
    String[] regionCodes = { "300000" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case93() {
    String id = "62012319240507058X";
    String[] regionCodes = { "620123" };
    assertEquals("Female", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case94() {
    String id = "123456100002251113";
    String[] regionCodes = { "123456" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case95() {
    String id = "320404199213182219";
    String[] regionCodes = { "320404" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case96() {
    String id = "62012319240007058X";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case97() {
    String id = "441323201312060630";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case98() {
    String id = "111111200002290011";
    String[] regionCodes = { "111111" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case99() {
    String id = "11111119000229100X";
    String[] regionCodes = { "111111" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case100() {
    String id = "441323200314000636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case101() {
    String id = "441323199504310636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case102() {
    String id = "441323190002290636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case103() {
    String id = "441323200312000633";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case104() {
    String id = "123456000001019998";
    String[] regionCodes = { "123456" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case105() {
    String id = "441323200802000636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case106() {
    String id = "620123188605070582";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case107() {
    String id = "62012319230229058X";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case108() {
    String id = "123456195305001239";
    String[] regionCodes = { "123456" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case109() {
    String id = "123456190001001114";
    String[] regionCodes = { "123456" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case110() {
    String id = "999999192404310580";
    String[] regionCodes = { "999999" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case111() {
    String id = "320404200002292210";
    String[] regionCodes = { "320404" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case112() {
    String id = "441323200314060636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case113() {
    String id = "441323200300000636";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case114() {
    String id = "123456199001000534";
    String[] regionCodes = { "123456" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case115() {
    String id = "44132320070229063X";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case116() {
    String id = "620123192405000581";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case117() {
    String id = "100000200008310012";
    String[] regionCodes = { "100000" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case118() {
    String id = "441323200402290638";
    String[] regionCodes = { "441323" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case119() {
    String id = "62012319240508058X";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case120() {
    String id = "44132320031131063X";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case121() {
    String id = "441323200312060636";
    String[] regionCodes = { "441323" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case122() {
    String id = "620123192400070580";
    String[] regionCodes = { "620123" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case123() {
    String id = "100000200002300016";
    String[] regionCodes = { "441323", "100000" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case124() {
    String id = "123123195006211232";
    String[] regionCodes = { "123123" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case125() {
    String id = "666666200002290016";
    String[] regionCodes = { "666666" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case126() {
    String id = "520381190002290897";
    String[] regionCodes = { "520381" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case127() {
    String id = "123456194402291237";
    String[] regionCodes = { "123456", "654321" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case128() {
    String id = "441323201212060633";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case129() {
    String id = "441323200301000638";
    String[] regionCodes = { "441323" };
    assertEquals("Invalid", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case130() {
    String id = "100000200002291113";
    String[] regionCodes = { "100000" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

  @Test
  public void case131() {
    String id = "441323200308310639";
    String[] regionCodes = { "441323" };
    assertEquals("Male", idnumberverification.verify(id, regionCodes));
  }

}
