package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class WolfDelaymasterTest {
  WolfDelaymaster wolfdelaymaster = new WolfDelaymaster();

  @Test
  public void case1() {
    String str = "wolf";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case2() {
    String str = "wwolfolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case3() {
    String str = "wolfwwoollffwwwooolllfffwwwwoooollllffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case4() {
    String str = "flowolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case5() {
    String str = "o";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case6() {
    String str = "fo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case7() {
    String str = "lfw";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case8() {
    String str = "llwl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case9() {
    String str = "ofwff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case10() {
    String str = "fwwloo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case11() {
    String str = "llwolow";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case12() {
    String str = "flffwwff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case13() {
    String str = "lllfoffff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case14() {
    String str = "ffwffwwoow";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case15() {
    String str = "wflolwfolwo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case16() {
    String str = "wlwwlfolflow";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case17() {
    String str = "ofwwoooffwlll";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case18() {
    String str = "wwfwfllwowolfl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case19() {
    String str = "ollooolwoofwwwf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case20() {
    String str = "ooffwffflfwlwwol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case21() {
    String str = "wofowlwlolllfolof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case22() {
    String str = "llfoowfoofffooolof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case23() {
    String str = "wlwwwflwfoolwwwwwol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case24() {
    String str = "wlwofwfwlfffowollofo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case25() {
    String str = "ofowfffwllooooflowfwl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case26() {
    String str = "owwoolwowfwlflllwwlwol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case27() {
    String str = "wlowloffowoowwofwlwwlol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case28() {
    String str = "wolwllloloolfowoffolwlfo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case29() {
    String str = "lflwfoolowoofwwffooffflwo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case30() {
    String str = "wowflwfofloolwoolwwflflflo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case31() {
    String str = "olwllfofofowwfofofofwwoffof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case32() {
    String str = "llfollfloowllwfllolfoloflflo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case33() {
    String str = "owloowllowfofwowowfllfflfoool";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case34() {
    String str = "owfwllwfwloolwfwlwofwowoowwffl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case35() {
    String str = "owoofffwoloffwooflolwlwwfofoflo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case36() {
    String str = "oowlooolwwfwwfwfowloolwllowoffwl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case37() {
    String str = "owlwlfollfwwfoffololwfoowlwloflof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case38() {
    String str = "ofolowlwwoowfowlfwowwwowoofoolwlff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case39() {
    String str = "lowwffllwlofllwwwfwowofoowlolfloowo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case40() {
    String str = "wfollwlwoolwlolwowloowlflfwfwofflfow";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case41() {
    String str = "olfowwwflofowlwwofofwwoowowlfwllfwflf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case42() {
    String str = "oowfflloowwolwwwlfwofoolwwwwwwfwfffowo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case43() {
    String str = "wolfwlfwllfoofofllfwffwfowwfowflfflolll";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case44() {
    String str = "wolffwlfllfflwlowwwlwoffflowflfwfowwoooo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case45() {
    String str = "loofwwwfooolffwlwoowwwwwfoofwowwollffowoo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case46() {
    String str = "oofoolllowwlfllofwofwfololllflflfoollwwflo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case47() {
    String str = "loooofwfflwwflolloolofwfoowlwolfwfowwllwooo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case48() {
    String str = "wlolfwfffflffwfowfowlfwwwolowolfolwolffofwfo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case49() {
    String str = "wlwoloolooffowwwlwwowlwoflflwwlwlflfoowlfowow";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case50() {
    String str = "offwllfllffwlwlffwowfwwlolooofolofwoolwwlfoooo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case51() {
    String str = "wfolwwlwolwfffwofoffowlolflfoffoofolfwfwolflwwl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case52() {
    String str = "woffffllfowwlfwffloffooolfoflfflfflwfoflfffowlfl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case53() {
    String str = "folfffolwlllowwlllloloowlllfwooowlwwwfwlllllooolo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case54() {
    String str = "fofflwllwooowowwwllllwlwllwwlwwfwwfwofwwfolowlolwo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case55() {
    String str = "wwwwwwwwwwwwoooooooooooollllllllllllffffffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case56() {
    String str = "wwwwoooollllffffwwwwwwwooooooolllllllfffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case57() {
    String str = "wwwwwwwwwwoooooooooollllllllllffffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case58() {
    String str = "wwwwoooollllffffwwwwwwwwoooooooollllllllffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case59() {
    String str = "wwwooolllfffwwwwoooollllffffwwwwoooollllffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case60() {
    String str = "wwwwwwwwwooooooooolllllllllfffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case61() {
    String str = "wwoollffwwoollffwwoollffwwwwwooooolllllfffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case62() {
    String str = "wwwwwwwwwooooooooolllllllllfffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case63() {
    String str = "wwwwwwwwwwoooooooooollllllllllffffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case64() {
    String str = "wwoollffwwwwoooollllffffwolf";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case65() {
    String str = "wwwwwooooolllllfffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case66() {
    String str = "wwwwwwwwwooooooooolllllllllfffffffffwolf";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case67() {
    String str = "wwwwoooollllffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case68() {
    String str = "wwwwwwwwoooooooollllllllffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case69() {
    String str = "wwwwwooooolllllfffffwolfwwwwwwoooooollllllffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case70() {
    String str = "wwwwwwwooooooolllllllfffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case71() {
    String str = "wwwwwooooolllllfffffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case72() {
    String str = "wwwwwwoooooollllllffffffwwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case73() {
    String str = "wwwwoooollllffffwwwwwwoooooollllllffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case74() {
    String str = "wwwwwwwwwwoooooooooollllllllllffffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case75() {
    String str = "wwwwwooooolllllfffffwwwooolllfffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case76() {
    String str = "wwwwwwoooooollllllffffffwolfwwwwwooooolllllfffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case77() {
    String str = "wwwwwwoooooollllllffffffwwwwoooollllffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case78() {
    String str = "wwwwoooollllffffwwwooolllfffwwwwwooooolllllfffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case79() {
    String str = "wwwwwwwwwwoooooooooollllllllllffffffffffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case80() {
    String str = "wwoollffwwwwwwwwoooooooollllllllffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case81() {
    String str = "wolfwwwwwwwwoooooooollllllllffffffffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case82() {
    String str = "wwwwwwoooooollllllffffffwwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case83() {
    String str = "wwwooolllfffwwwwwwoooooollllllffffffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case84() {
    String str = "wwwwwwwwwooooooooolllllllllfffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case85() {
    String str = "wwwwwooooolllllfffffwwwwwwwooooooolllllllfffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case86() {
    String str = "wwoollffwwwwwwwwwwoooooooooollllllllllffffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case87() {
    String str = "wwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case88() {
    String str = "wwwwwwwooooooolllllllfffffffwwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case89() {
    String str = "wwoollffwwwwwwwwwooooooooolllllllllfffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case90() {
    String str = "wwwwwwwooooooolllllllfffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case91() {
    String str = "wolfwwoollffwwwwoooollllffffwwwwwooooolllllfffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case92() {
    String str = "wwwooolllfffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case93() {
    String str = "wwwwwwwwoooooooollllllllffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case94() {
    String str = "wwwooolllfffwwwwwwwwwooooooooolllllllllfffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case95() {
    String str = "wwwwwooooolllllfffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case96() {
    String str = "wwwooolllfffwwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case97() {
    String str = "wwwwwooooolllllfffffwwwwwwwooooooolllllllfffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case98() {
    String str = "wwwwwwwwwooooooooolllllllllfffffffffwolf";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case99() {
    String str = "wwoollffwwwwoooollllffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case100() {
    String str = "wwwwwooooolllllfffffwwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case101() {
    String str = "wwwooolllfffwwwwwwoooooollllllffffffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case102() {
    String str = "wwwwwooooolllllfffffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case103() {
    String str = "wwwwwwwwoooooooollllllllffffffff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case104() {
    String str = "wwoollffwwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case105() {
    String str = "wwoollffwwwwwwoooooollllllffffffwwwooolllfff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case106() {
    String str = "wwwooolllff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case107() {
    String str = "wwoollfff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case108() {
    String str = "ffwwooll";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case109() {
    String str = "wolfwolf";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case110() {
    String str = "wolfwolfwwoollffwolfwwwooolllff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case111() {
    String str = "wofl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case112() {
    String str = "wolfwol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case113() {
    String str = "wol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case114() {
    String str = "wwooollllllfff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case115() {
    String str = "w";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case116() {
    String str = "wlof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case117() {
    String str = "wolfwwwwww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case118() {
    String str = "wolff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case119() {
    String str = "llll";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case120() {
    String str = "wwolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case121() {
    String str = "wlofwlof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case122() {
    String str = "wo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case123() {
    String str = "woowllff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case124() {
    String str = "wwoollff";
    assertEquals("VALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case125() {
    String str = "wwwwwwwww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case126() {
    String str = "fwolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case127() {
    String str = "flwo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case128() {
    String str = "ooo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case129() {
    String str = "flow";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case130() {
    String str = "wwwww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case131() {
    String str = "wwolfwoolfwollfwolff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case132() {
    String str = "wwwwoooollllf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case133() {
    String str = "wwww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case134() {
    String str = "fwol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case135() {
    String str = "wwwwwooooolllllfffffwwwolfwwooooooolllllllfffffff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case136() {
    String str = "wwolfwoollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case137() {
    String str = "wolfwoolfwwollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case138() {
    String str = "wowollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case139() {
    String str = "wolfwo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case140() {
    String str = "olfw";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case141() {
    String str = "wwwwwwww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case142() {
    String str = "wollfwwoolff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case143() {
    String str = "woolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case144() {
    String str = "wfol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case145() {
    String str = "wolfw";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case146() {
    String str = "llffwwoo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case147() {
    String str = "oolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case148() {
    String str = "wwwolllllllf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case149() {
    String str = "wwoollf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case150() {
    String str = "wwwwooollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case151() {
    String str = "wwwwwolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case152() {
    String str = "wwfollof";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case153() {
    String str = "wwwoollllffffff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case154() {
    String str = "ww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case155() {
    String str = "wolfwolfwwolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case156() {
    String str = "wwwwww";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case157() {
    String str = "wwwolfoollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case158() {
    String str = "wwllooff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case159() {
    String str = "olfwolf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case160() {
    String str = "wolfl";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case161() {
    String str = "wolfwwoo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case162() {
    String str = "wolw";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case163() {
    String str = "wwowoolllfff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case164() {
    String str = "www";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case165() {
    String str = "wolllfff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case166() {
    String str = "wolfwwwwoooollllff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case167() {
    String str = "wwwoollffwoollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case168() {
    String str = "woolllfff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case169() {
    String str = "wlfo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case170() {
    String str = "wolffwol";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case171() {
    String str = "wolwolff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case172() {
    String str = "wwooollffwwollff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case173() {
    String str = "wolfwwoollffwwwooolllfffwwwwoooollllfff";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case174() {
    String str = "woollf";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

  @Test
  public void case175() {
    String str = "oooo";
    assertEquals("INVALID", wolfdelaymaster.check(str));
  }

}
