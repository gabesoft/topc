package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PowerCollectorTest {
  PowerCollector powercollector = new PowerCollector();

  @Test
  public void case1() {
    String N = "1";
    assertEquals("1", powercollector.countPowers(N));
  }

  @Test
  public void case2() {
    String N = "10";
    assertEquals("4", powercollector.countPowers(N));
  }

  @Test
  public void case3() {
    String N = "100";
    assertEquals("13", powercollector.countPowers(N));
  }

  @Test
  public void case4() {
    String N = "1000";
    assertEquals("41", powercollector.countPowers(N));
  }

  @Test
  public void case5() {
    String N = "10000";
    assertEquals("125", powercollector.countPowers(N));
  }

  @Test
  public void case6() {
    String N = "100000";
    assertEquals("367", powercollector.countPowers(N));
  }

  @Test
  public void case7() {
    String N = "1000000";
    assertEquals("1111", powercollector.countPowers(N));
  }

  @Test
  public void case8() {
    String N = "10000000";
    assertEquals("3395", powercollector.countPowers(N));
  }

  @Test
  public void case9() {
    String N = "100000000";
    assertEquals("10491", powercollector.countPowers(N));
  }

  @Test
  public void case10() {
    String N = "1000000000";
    assertEquals("32670", powercollector.countPowers(N));
  }

  @Test
  public void case11() {
    String N = "10000000000";
    assertEquals("102231", powercollector.countPowers(N));
  }

  @Test
  public void case12() {
    String N = "100000000000";
    assertEquals("320990", powercollector.countPowers(N));
  }

  @Test
  public void case13() {
    String N = "1000000000000";
    assertEquals("1010196", powercollector.countPowers(N));
  }

  @Test
  public void case14() {
    String N = "10000000000000";
    assertEquals("3184138", powercollector.countPowers(N));
  }

  @Test
  public void case15() {
    String N = "100000000000000";
    assertEquals("10046921", powercollector.countPowers(N));
  }

  @Test
  public void case16() {
    String N = "1000000000000000";
    assertEquals("31723592", powercollector.countPowers(N));
  }

  @Test
  public void case17() {
    String N = "10000000000000000";
    assertEquals("100216745", powercollector.countPowers(N));
  }

  @Test
  public void case18() {
    String N = "100000000000000000";
    assertEquals("316694005", powercollector.countPowers(N));
  }

  @Test
  public void case19() {
    String N = "36";
    assertEquals("9", powercollector.countPowers(N));
  }

  @Test
  public void case20() {
    String N = "1000000000000000000";
    assertEquals("1001003332", powercollector.countPowers(N));
  }

  @Test
  public void case21() {
    String N = "2199023255552";
    assertEquals("1496144", powercollector.countPowers(N));
  }

  @Test
  public void case22() {
    String N = "98765432187654321";
    assertEquals("314733995", powercollector.countPowers(N));
  }

  @Test
  public void case23() {
    String N = "88888888888888888";
    assertEquals("298590714", powercollector.countPowers(N));
  }

  @Test
  public void case24() {
    String N = "71717171717171717";
    assertEquals("268218034", powercollector.countPowers(N));
  }

  @Test
  public void case25() {
    String N = "576460752303423488";
    assertEquals("760085356", powercollector.countPowers(N));
  }

  @Test
  public void case26() {
    String N = "576460752303423489";
    assertEquals("760085356", powercollector.countPowers(N));
  }

  @Test
  public void case27() {
    String N = "576460752303423487";
    assertEquals("760085355", powercollector.countPowers(N));
  }

  @Test
  public void case28() {
    String N = "687200388";
    assertEquals("27140", powercollector.countPowers(N));
  }

  @Test
  public void case29() {
    String N = "936110805";
    assertEquals("31620", powercollector.countPowers(N));
  }

  @Test
  public void case30() {
    String N = "656449788";
    assertEquals("26534", powercollector.countPowers(N));
  }

  @Test
  public void case31() {
    String N = "278707968";
    assertEquals("17382", powercollector.countPowers(N));
  }

  @Test
  public void case32() {
    String N = "480149050";
    assertEquals("22735", powercollector.countPowers(N));
  }

  @Test
  public void case33() {
    String N = "912111010";
    assertEquals("31216", powercollector.countPowers(N));
  }

  @Test
  public void case34() {
    String N = "99304405";
    assertEquals("10455", powercollector.countPowers(N));
  }

  @Test
  public void case35() {
    String N = "775208921";
    assertEquals("28804", powercollector.countPowers(N));
  }

  @Test
  public void case36() {
    String N = "885693852";
    assertEquals("30766", powercollector.countPowers(N));
  }

  @Test
  public void case37() {
    String N = "121731885";
    assertEquals("11557", powercollector.countPowers(N));
  }

  @Test
  public void case38() {
    String N = "38324423";
    assertEquals("6549", powercollector.countPowers(N));
  }

  @Test
  public void case39() {
    String N = "162564109";
    assertEquals("13326", powercollector.countPowers(N));
  }

  @Test
  public void case40() {
    String N = "165948320";
    assertEquals("13463", powercollector.countPowers(N));
  }

  @Test
  public void case41() {
    String N = "399394232";
    assertEquals("20757", powercollector.countPowers(N));
  }

  @Test
  public void case42() {
    String N = "877398903";
    assertEquals("30623", powercollector.countPowers(N));
  }

  @Test
  public void case43() {
    String N = "141211836";
    assertEquals("12434", powercollector.countPowers(N));
  }

  @Test
  public void case44() {
    String N = "750490913";
    assertEquals("28347", powercollector.countPowers(N));
  }

  @Test
  public void case45() {
    String N = "738924655";
    assertEquals("28131", powercollector.countPowers(N));
  }

  @Test
  public void case46() {
    String N = "686678221";
    assertEquals("27130", powercollector.countPowers(N));
  }

  @Test
  public void case47() {
    String N = "207042284";
    assertEquals("15013", powercollector.countPowers(N));
  }

  @Test
  public void case48() {
    String N = "891362005010843013";
    assertEquals("945085342", powercollector.countPowers(N));
  }

  @Test
  public void case49() {
    String N = "948109531949661697";
    assertEquals("974694852", powercollector.countPowers(N));
  }

  @Test
  public void case50() {
    String N = "219116072012441625";
    assertEquals("468703669", powercollector.countPowers(N));
  }

  @Test
  public void case51() {
    String N = "34684278340628421";
    assertEquals("186564952", powercollector.countPowers(N));
  }

  @Test
  public void case52() {
    String N = "402596504242004229";
    assertEquals("635246089", powercollector.countPowers(N));
  }

  @Test
  public void case53() {
    String N = "735928620977808553";
    assertEquals("858768792", powercollector.countPowers(N));
  }

  @Test
  public void case54() {
    String N = "967639384006961027";
    assertEquals("984679033", powercollector.countPowers(N));
  }

  @Test
  public void case55() {
    String N = "385330919810226815";
    assertEquals("621480713", powercollector.countPowers(N));
  }

  @Test
  public void case56() {
    String N = "213701209863625600";
    assertEquals("462878572", powercollector.countPowers(N));
  }

  @Test
  public void case57() {
    String N = "919815404676557696";
    assertEquals("960045871", powercollector.countPowers(N));
  }

  @Test
  public void case58() {
    String N = "82445632911393680";
    assertEquals("287570707", powercollector.countPowers(N));
  }

  @Test
  public void case59() {
    String N = "507034236367319424";
    assertEquals("712863671", powercollector.countPowers(N));
  }

  @Test
  public void case60() {
    String N = "778612105045962624";
    assertEquals("883313131", powercollector.countPowers(N));
  }

  @Test
  public void case61() {
    String N = "213165238134857760";
    assertEquals("462298001", powercollector.countPowers(N));
  }

  @Test
  public void case62() {
    String N = "921029276804327936";
    assertEquals("960678930", powercollector.countPowers(N));
  }

  @Test
  public void case63() {
    String N = "552065572305274688";
    assertEquals("743834449", powercollector.countPowers(N));
  }

  @Test
  public void case64() {
    String N = "10424720949497908";
    assertEquals("102321287", powercollector.countPowers(N));
  }

  @Test
  public void case65() {
    String N = "656046857759866240";
    assertEquals("810839167", powercollector.countPowers(N));
  }

  @Test
  public void case66() {
    String N = "40721664333540416";
    assertEquals("202141866", powercollector.countPowers(N));
  }

  @Test
  public void case67() {
    String N = "239200131475964768";
    assertEquals("489704145", powercollector.countPowers(N));
  }

  @Test
  public void case68() {
    String N = "99999887887776765";
    assertEquals("316693826", powercollector.countPowers(N));
  }

  @Test
  public void case69() {
    String N = "922337203685477580";
    assertEquals("961360572", powercollector.countPowers(N));
  }

  @Test
  public void case70() {
    String N = "1000000000000000000";
    assertEquals("1001003332", powercollector.countPowers(N));
  }

  @Test
  public void case71() {
    String N = "505447028499293770";
    assertEquals("711747448", powercollector.countPowers(N));
  }

  @Test
  public void case72() {
    String N = "999999999999999999";
    assertEquals("1001003331", powercollector.countPowers(N));
  }

  @Test
  public void case73() {
    String N = "99999887887776765";
    assertEquals("316693826", powercollector.countPowers(N));
  }

  @Test
  public void case74() {
    String N = "922337203685477580";
    assertEquals("961360572", powercollector.countPowers(N));
  }

  @Test
  public void case75() {
    String N = "1000000000000000000";
    assertEquals("1001003332", powercollector.countPowers(N));
  }

  @Test
  public void case76() {
    String N = "505447028499293770";
    assertEquals("711747448", powercollector.countPowers(N));
  }

  @Test
  public void case77() {
    String N = "999999999999999999";
    assertEquals("1001003331", powercollector.countPowers(N));
  }

}
