package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class GeneticCrossoverTest {
  double DELTA = 1.0e-09;
  GeneticCrossover geneticcrossover = new GeneticCrossover();

  @Test
  public void case1() {
    String p1a = "AaaAA";
    String p1b = "AaaAA";
    String p2a = "AaaAA";
    String p2b = "AaaAA";
    int[] dom = { 1, 2, 3, 4, 5 };
    int[] rec = { -1, -2, -3, -4, -5 };
    int[] dependencies = { -1, -1, -1, -1, 1 };
    assertEquals(-5.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -5.0);
  }

  @Test
  public void case2() {
    String p1a = "AbegG";
    String p1b = "ABEgG";
    String p2a = "aBEgg";
    String p2b = "abegG";
    int[] dom = { 5, 5, 5, 5, 5 };
    int[] rec = { 1, 1, 1, 1, 1 };
    int[] dependencies = { -1, 0, 1, 2, 3 };
    assertEquals(14.25, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 14.25);
  }

  @Test
  public void case3() {
    String p1a = "KfHvzgnogzAdQRRpvksg";
    String p1b = "kFHVZGNoGZADqRrPvksg";
    String p2a = "kfHvZgnogzAdQrrpvksG";
    String p2b = "kFhVzgnOGzADQRrPvKsG";
    int[] dom = { 68, -88, 74, -69, -53, -75, 86, -46, -74, 10, 19, -90, -83, -73, -93, -37, 68, 62, 99, -40 };
    int[] rec = { 59, 86, -5, -60, 92, 76, 74, 96, -55, -72, -71, -45, -2, -5, -61, -6, 86, 49, 66, 37 };
    int[] dependencies = { -1, -1, 1, -1, 3, 3, 2, 3, 5, 8, -1, -1, 5, -1, 8, 4, -1, -1, 10, 7 };
    assertEquals(2.671875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 2.671875);
  }

  @Test
  public void case4() {
    String p1a = "cIyRjclfOrpqHMsLTwHpgwyfwcYxtok";
    String p1b = "CIYrjClFORPqhmSltWHpgwyfWcYXtOk";
    String p2a = "CiYrJcLFOrpQhMSLtwhpgwYfwCYXTOK";
    String p2b = "CIyRjcLForpqhMsLTwhpgwyfWCYXtOK";
    int[] dom = { -3, 97, -61, -94, -62, 87, 20, 31, 93, -46, -79, -1, 23, 86, -98, 7, -7, 6, -14, 30, -38, -23, 38, 67, 22, 29, 13, 52, -41, -65, 92 };
    int[] rec = { 82, 61, 43, 98, 99, 81, -69, -35, -73, -73, 35, 2, -89, -13, 18, 89, -28, -56, 28, 27, -15, -71, 18, 83, 57, -48, 97, -66, 23, 49, -40 };
    int[] dependencies = { -1, -1, 0, -1, 1, 4, 4, 6, -1, 1, -1, 8, -1, 1, 0, -1, -1, 1, -1, -1, 7, 18, -1, -1, 20, -1, -1, 8, -1, 2, -1 };
    assertEquals(288.75, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 288.75);
  }

  @Test
  public void case5() {
    String p1a = "DTdCUVqUJJuYuRgFrqmCBButeBtNgPMeah";
    String p1b = "dTDCUVQujjUYurgfrqMCBbUtebTnGpMEAH";
    String p2a = "DtdcUvquJJuYUrGFrQMCbbUtebTNgPMeAh";
    String p2b = "DTdcUvquJjUYURGFrQMCBButEbTNGPmeah";
    int[] dom = { 65, 50, 13, -21, -70, 16, 11, -30, 1, -60, -84, 79, -62, 59, 35, -71, -90, 51, -44, 72, -14, -71, 35, -35, 12, -72, 30, -27, 91, 74, 55, 91, -12, -57 };
    int[] rec = { 92, 63, -42, 42, -37, 69, 52, -12, -22, 19, -94, -86, 59, 13, 29, 7, -34, -6, -92, 25, -3, 30, 43, 35, 78, -26, 26, 20, -5, -43, 37, -91, 87, -60 };
    int[] dependencies = { -1, 0, 0, -1, -1, 4, 5, -1, -1, 4, 0, 9, -1, 9, 8, 9, 4, 6, -1, -1, -1, -1, -1, 3, 7, -1, 17, 15, -1, -1, -1, 2, 15, -1 };
    assertEquals(85.6875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 85.6875);
  }

  @Test
  public void case6() {
    String p1a = "anjGZnfqgvXuPmCxcAEhicXHKkdOqKBP";
    String p1b = "aNJGzNFQgvxuPmcxcAeHicxhKKDOQKBp";
    String p2a = "AnjGZnFQgvXUpMcxcAeHiCxhkKDoQkBP";
    String p2b = "ANJGZNfqGvXupMCxcAeHiCxhKKDoqKbp";
    int[] dom = { -83, -39, 69, -90, 22, -24, 38, -31, 1, 63, -43, 8, -53, 68, -95, 43, 97, -29, 73, -99, 76, -91, 45, -46, -25, -14, 85, 63, -89, -55, 2, 26 };
    int[] rec = { -96, -71, 53, 36, 87, 35, 39, -95, -42, -36, 8, 13, -17, 19, 69, -70, 29, -7, -66, 91, -33, -10, 22, 47, -83, 39, 45, -84, -46, 54, -43, 61 };
    int[] dependencies = { -1, 0, 1, -1, -1, 3, 0, 1, -1, -1, -1, 0, 3, 6, 1, -1, -1, 16, 4, -1, 6, -1, 17, 9, 12, 14, 0, -1, 23, 26, -1, 9 };
    assertEquals(-379.8125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -379.8125);
  }

  @Test
  public void case7() {
    String p1a = "XyMpdnVsbinDvqBpcWGDLfsmQtZpeirvTmoRmBASfqqrFS";
    String p1b = "xYmpdnVsBINdvQBPCwgDlFSmQTzpEIrVtmoRmbaSfqQRfS";
    String p2a = "XYMpdnvsBINdVQbpCWgDlfSMqTzPeIrVTMOrmbaSfQqrFs";
    String p2b = "XYMpDnVSBIndvQBPCWGDlFsMqtzpEiRVTMORMBASFqQrfS";
    int[] dom = { -82, -35, -51, 52, 87, 25, 8, 27, -12, -10, -63, -36, -95, -35, -98, 95, -76, 7, 36, -35, 92, 23, -94, -31, -30, 36, 51, -49, -19, -3, 19, 32, 58, 82, -36, -87, -54, -17, -40, 32, -91, -56, 0, -16, 70, 42 };
    int[] rec = { -36, 77, 90, 50, 83, 66, -94, -66, -22, -83, -86, -89, -55, -3, -51, 18, -41, -91, 91, 32, -25, -60, 5, 79, 100, 85, 60, 98, 55, 95, -67, -46, -26, 48, -64, 16, -36, -95, -54, 19, 96, 79, 78, -91, -12, 35 };
    int[] dependencies = { -1, -1, 1, -1, 3, -1, -1, 1, 3, 5, 4, 0, -1, -1, 2, 8, 5, 4, -1, 10, 11, 14, 3, -1, 15, -1, 7, -1, 8, -1, -1, 15, -1, -1, 30, -1, 26, 26, -1, -1, -1, -1, -1, 31, 0, 3 };
    assertEquals(-356.875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -356.875);
  }

  @Test
  public void case8() {
    String p1a = "lVnStRUdYXlMwiaSaZoZnhqWJKsUFIiRuXpvP";
    String p1b = "lVNStRudYxLmWIAsazoZNhQwJksufiiRUxpVp";
    String p2a = "lVnsTRUdYxlMWIaSAZOZNHQwJKSUfiIRUxPvp";
    String p2b = "LvNsTrUdyXLMWiasaZOznhQWJksUfIIruXPvp";
    int[] dom = { 3, -68, 43, 44, -42, -27, 23, -34, -90, 71, 32, 4, 80, 30, 22, 13, 89, -23, -84, -82, -79, 5, 4, 28, -51, 100, 83, -41, -26, 72, -67, -71, -60, -16, -4, -98, -13 };
    int[] rec = { 18, -2, 33, -12, 9, -12, -67, 78, 100, 4, 27, 40, 78, -32, 47, -55, -13, 51, -2, -67, 12, 78, 74, 93, 86, 61, -34, 56, 80, 98, -81, 50, -45, -54, 14, 14, -75 };
    int[] dependencies = { -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 7, 10, 11, -1, 1, 13, 4, -1, 16, -1, 19, 8, -1, 17, 8, -1, 13, -1, 11, -1, -1, 8, -1, -1, -1, -1, -1 };
    assertEquals(-22.875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -22.875);
  }

  @Test
  public void case9() {
    String p1a = "OWxdnfZiyuININiqdKAKsmYewDeoIe";
    String p1b = "OwXDnFZiyuINInIQdKaKSmYEWDeOIe";
    String p2a = "owXdNfzIYuINiniQdKaksmyewdEoIe";
    String p2b = "OwXDnfZIYuInINIQdKAksmyewDEOIE";
    int[] dom = { 29, -60, 55, 3, -46, -14, -67, 12, -12, -11, -12, 84, 77, 27, 68, 57, -32, -32, 41, -41, 14, 97, 62, 34, 1, -86, -46, -15, 51, -3 };
    int[] rec = { -65, 80, 13, 7, 67, -59, -84, -48, 30, -27, 29, -74, 75, -72, 75, 14, -95, 30, -47, -65, 88, -100, -11, 24, 75, 3, 21, 28, -83, -37 };
    int[] dependencies = { -1, 0, 1, -1, 3, 4, 3, -1, 3, -1, 6, -1, -1, 0, -1, -1, 14, 14, -1, -1, -1, -1, -1, 15, 9, -1, -1, -1, 0, 15 };
    assertEquals(129.8125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 129.8125);
  }

  @Test
  public void case10() {
    String p1a = "uOnxffmtNAkCqQOnOjCN";
    String p1b = "uonXFfMTnAkcqQOnojcN";
    String p2a = "UonxFFmTNaKcQQOnOjcn";
    String p2b = "UoNxfFmTnAKcQqonojcN";
    int[] dom = { 95, -5, -76, 62, 23, 11, 33, 47, -27, 34, 99, 41, -66, 79, 15, 4, 15, 1, -58, -14 };
    int[] rec = { -26, -76, -100, -41, 12, -48, -11, -23, -71, -75, 63, 94, 22, -89, -86, -39, 9, 86, -66, 37 };
    int[] dependencies = { -1, -1, -1, 0, -1, 2, 3, -1, 7, -1, 7, 1, -1, 5, 4, -1, 10, -1, -1, 14 };
    assertEquals(117.5, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 117.5);
  }

  @Test
  public void case11() {
    String p1a = "AUyohSdztemGgce";
    String p1b = "AUyoHSdZTeMgGCe";
    String p2a = "AuyOhsDZtemgGCe";
    String p2b = "aUYOHsdZTeMggce";
    int[] dom = { -62, 27, -24, 43, -5, 4, 81, -20, -7, -76, -97, 11, -90, 54, 68 };
    int[] rec = { 12, -59, 79, -76, 18, 35, 89, 84, 9, -3, -7, -29, 87, 56, -28 };
    int[] dependencies = { -1, -1, -1, -1, 3, -1, -1, -1, 0, -1, 1, 7, 5, 2, 1 };
    assertEquals(-2.75, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -2.75);
  }

  @Test
  public void case12() {
    String p1a = "HgcQzaWRDlsFBPLoThiLievELeKVpZycDbKVZBzN";
    String p1b = "hgCqZAWRDlSfbPloThILIevElekVPZycDBKvZBzN";
    String p2a = "hGCqzaWrDlSFBPloTHilieVeLeKvPzYCdbKVzBzn";
    String p2b = "HGcQZAWrdlsfBPLOthiLIEVelEkvPzYCdBKvZbzN";
    int[] dom = { 81, 24, 25, 15, -39, 55, -99, 10, 94, -40, 28, -18, 32, 28, 89, -92, 22, -91, 11, -67, -78, -97, -9, 54, 99, -60, 75, 57, 8, 59, 100, -85, 84, 56, 67, 4, 51, -62, 70, -81 };
    int[] rec = { 74, -65, 74, -40, -81, 56, -54, 86, -97, 52, -51, -8, -7, -62, -1, -5, -80, 100, -13, -67, 49, 25, 27, -12, -14, -56, 38, -67, -60, 9, -53, 38, -93, -5, 84, 20, -74, 30, -99, -10 };
    int[] dependencies = { -1, -1, -1, 0, 0, -1, 1, -1, -1, -1, -1, -1, 5, 0, -1, 9, -1, 10, 3, 13, 9, 20, 16, -1, -1, -1, 10, 11, -1, 26, 18, 3, -1, -1, 11, 34, -1, -1, -1, -1 };
    assertEquals(481.96875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 481.96875);
  }

  @Test
  public void case13() {
    String p1a = "fOai";
    String p1b = "Foai";
    String p2a = "fOAI";
    String p2b = "FOAi";
    int[] dom = { 96, 21, -34, -81 };
    int[] rec = { 77, -2, 20, 25 };
    int[] dependencies = { -1, 0, -1, -1 };
    assertEquals(44.5, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 44.5);
  }

  @Test
  public void case14() {
    String p1a = "uNxXkdrSUnBBAOFjbuoAvKFOGBQRLaVKufWy";
    String p1b = "UnxXKdRSUNbBaofjbuoAVKfoGbqRLAVKufWy";
    String p2a = "unxxkDrSunbBAoFjbUoaVkfOgBQrlavKufWY";
    String p2b = "UNXXKdRsuNbbaofJbUOAVkFoGBqRLavkUFwY";
    int[] dom = { -62, -87, 28, -43, 52, 17, -55, -3, 89, 60, 3, 60, -6, -88, -54, 33, -1, 91, 77, 57, 86, -43, 86, -38, -77, 19, -47, -99, 77, 18, 45, 7, -100, 23, 22, -36 };
    int[] rec = { 31, 55, -49, -96, 97, -95, 67, 56, -28, -20, 20, 60, 13, 23, 23, 77, 85, -96, 23, 27, -22, 68, 65, 15, 9, 33, -74, -36, 48, 8, -7, -55, 4, -8, -79, -83 };
    int[] dependencies = { -1, -1, 0, -1, -1, 0, 2, 4, -1, 5, 5, -1, 8, -1, 7, 12, 7, 4, 13, -1, 11, -1, 17, 9, -1, 14, 24, -1, -1, 5, -1, -1, -1, 12, 5, -1 };
    assertEquals(235.1953125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 235.1953125);
  }

  @Test
  public void case15() {
    String p1a = "HUWWWE";
    String p1b = "huwwwe";
    String p2a = "hUWwWE";
    String p2b = "HUWwWE";
    int[] dom = { -47, -75, 15, 66, -96, 25 };
    int[] rec = { 77, -36, 32, -78, -82, 57 };
    int[] dependencies = { -1, 0, 1, 2, -1, -1 };
    assertEquals(-157.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -157.0);
  }

  @Test
  public void case16() {
    String p1a = "sd";
    String p1b = "sD";
    String p2a = "sd";
    String p2b = "SD";
    int[] dom = { -10, 19 };
    int[] rec = { 8, -63 };
    int[] dependencies = { -1, -1 };
    assertEquals(-2.5, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -2.5);
  }

  @Test
  public void case17() {
    String p1a = "ihXuCkQrbZPsDqCCRlXJaWOHomPkEhFwORNWv";
    String p1b = "iHxUcKqRBZpSdqccRlxjaWOhOMPKEHFwORnWV";
    String p2a = "IHXUckQRbzPsDqcCrlxJAWOhOmPKEHFworNWV";
    String p2b = "iHxucKqRBZPSdQCCRlxJAWoHoMpKehfwoRNWV";
    int[] dom = { -85, 63, -71, 31, 26, 80, 80, 12, 86, -15, -72, -89, -89, 63, -25, -45, 23, 10, 66, -22, 42, 43, 78, -43, 0, 83, -69, -95, -73, 66, -14, -4, 73, 80, -100, -27, -43 };
    int[] rec = { -11, 88, -57, 1, 36, -61, -54, -32, 54, -8, -34, 4, 22, 2, -100, -22, 45, -98, -52, -13, 4, -1, -73, -65, -6, 5, -74, -36, 31, 61, 0, -56, 64, -46, 67, -35, 47 };
    int[] dependencies = { -1, 0, 1, 2, 2, 2, -1, 1, 2, 4, -1, 3, -1, 3, 4, -1, -1, -1, -1, 18, -1, 15, 14, -1, 12, 10, 23, -1, 23, 23, -1, 8, 4, -1, 1, -1, 22 };
    assertEquals(-316.8828125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -316.8828125);
  }

  @Test
  public void case18() {
    String p1a = "QNJpEefFc";
    String p1b = "QnJPeEFfC";
    String p2a = "qnjPeEfFC";
    String p2b = "QNJpEefFc";
    int[] dom = { 44, 35, -40, 29, 34, 65, -76, -58, -34 };
    int[] rec = { 43, -32, 60, 94, 50, -88, 26, 45, -84 };
    int[] dependencies = { -1, 0, -1, 1, 1, 3, -1, -1, -1 };
    assertEquals(-32.265625, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -32.265625);
  }

  @Test
  public void case19() {
    String p1a = "cqLcmmPzuFoKUIePt";
    String p1b = "CqLCmmpZuFOKUiEpT";
    String p2a = "CqLcMMPZuFOkuIepT";
    String p2b = "CQlcMmPZUFokuIepT";
    int[] dom = { 46, 20, -24, 47, 94, 36, 86, 28, 66, -43, 92, 45, -85, 29, 0, -64, -70 };
    int[] rec = { -41, 13, 34, 68, 22, -2, -59, -39, 59, -43, 3, -90, 43, 60, -63, -72, 66 };
    int[] dependencies = { -1, -1, -1, -1, -1, 2, 3, -1, -1, -1, -1, 0, 8, 4, -1, -1, -1 };
    assertEquals(221.25, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 221.25);
  }

  @Test
  public void case20() {
    String p1a = "FpOEVgfrDLOiTD";
    String p1b = "FpOEvgfRdLOiTd";
    String p2a = "fPoeVgfrDLOITd";
    String p2b = "fPoEvGfRDloiTd";
    int[] dom = { 15, 5, -54, 48, -11, 65, -83, -6, -5, 54, 79, -5, -88, -64 };
    int[] rec = { -62, -66, -23, 22, 39, -60, 66, 57, -26, -66, -56, 20, 79, -82 };
    int[] dependencies = { -1, -1, -1, 0, -1, 4, -1, -1, -1, -1, 6, -1, -1, 2 };
    assertEquals(-82.375, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -82.375);
  }

  @Test
  public void case21() {
    String p1a = "RJPzhPoNZTWLWX";
    String p1b = "rjPzhpONzTwlWX";
    String p2a = "RjpZHpoNzTwlwX";
    String p2b = "rJpzHpoNzTwlwX";
    int[] dom = { 75, 3, 8, -95, -50, 0, -37, 42, 92, 97, 9, -14, 95, 73 };
    int[] rec = { -45, -20, -68, -12, 1, -92, 52, -24, 65, 62, -93, -54, -7, 5 };
    int[] dependencies = { -1, -1, -1, -1, 3, 4, 3, 0, -1, -1, 6, -1, 5, 8 };
    assertEquals(77.25, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 77.25);
  }

  @Test
  public void case22() {
    String p1a = "PlGYQqpIVyQZluePDXsjhbcPMqQdPZMEhgVihi";
    String p1b = "PlgyQqpIvYQzlUEpDXsJHBcpMQQDpZMehGVIhi";
    String p2a = "plGYqqpIvyqzluePdXSjhBCpMQqDpZmeHGvIhI";
    String p2b = "plGYqqpivyqZluEPDXSjhbcpmQQDpzMehgvIhi";
    int[] dom = { -18, 10, 38, -5, 19, -71, -72, 4, -48, 62, -80, -68, 61, -50, 63, 37, -9, -47, -94, 85, 21, 21, -80, 7, 6, 71, -60, -22, 90, -88, 67, 78, -57, -74, -12, -48, 83, 52 };
    int[] rec = { 10, -39, -56, 26, -41, 1, 88, 36, 95, 64, 29, 79, 87, -68, 27, -80, 14, 66, -54, -100, -13, -19, -88, 72, 55, -37, -72, 73, 84, -74, -27, 73, -31, 22, -2, -1, -48, 44 };
    int[] dependencies = { -1, -1, 1, -1, -1, 3, -1, -1, -1, 4, -1, 7, -1, -1, 8, -1, -1, -1, 0, 7, -1, 1, -1, 20, -1, 24, -1, 2, 0, -1, 0, -1, 2, -1, 14, -1, 14, 5 };
    assertEquals(-33.25, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -33.25);
  }

  @Test
  public void case23() {
    String p1a = "FKUsAij";
    String p1b = "FKusaIj";
    String p2a = "FkUsAIj";
    String p2b = "FKUsAiJ";
    int[] dom = { 63, -31, -80, -45, 33, -55, 7 };
    int[] rec = { -68, 50, 74, -31, 98, 41, -96 };
    int[] dependencies = { -1, 0, -1, 2, -1, -1, 4 };
    assertEquals(-121.5, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -121.5);
  }

  @Test
  public void case24() {
    String p1a = "ntTrzcjofSsXUvPmpLNuXkpGrhuykkijuJzJuRIUGf";
    String p1b = "NttRzcjofsSxuVpMpLNuxkPgRHUYkkiJujZjurIuGF";
    String p2a = "NTTRzCJOFsSXUVpmplnuxkpgrhUyKkiJUjZJURIugf";
    String p2b = "NtTrzcjOFssXUVPmpLnuXkPgRHUyKkIJUjZJUriuGF";
    int[] dom = { -57, 75, -98, -82, -10, -64, -73, 49, -100, -5, 88, 49, 87, 14, -27, -47, 94, 39, -33, 58, -54, 90, -40, -85, -52, -44, 40, 0, 97, 87, 35, -50, -50, 97, -77, 10, 23, 67, 5, 75, 9, -50 };
    int[] rec = { 78, -21, -50, 67, -16, -94, 96, -100, 70, -25, 95, -92, -16, 25, -44, -81, -14, -22, -18, 1, -45, 64, 4, -49, 2, -11, 18, 83, 54, 63, 79, 38, -71, -66, 79, -4, 77, 95, -14, -10, 90, 52 };
    int[] dependencies = { -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, 4, -1, 1, -1, 5, -1, 12, -1, 9, -1, -1, -1, 14, -1, 11, -1, 17, -1, -1, 8, 24, -1, -1, -1, 28, -1, -1, 23, -1, 6, -1, 21 };
    assertEquals(-30.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -30.0);
  }

  @Test
  public void case25() {
    String p1a = "BiSqpkKBFKccSH";
    String p1b = "BIsqPkKBfkCCSh";
    String p2a = "bisqpkkbFKCCSH";
    String p2b = "bisQpKKBfkccSh";
    int[] dom = { 50, 88, -2, -35, 11, 31, 35, -76, 81, -23, 43, 62, -96, 75 };
    int[] rec = { -12, -39, 88, 75, -13, 53, -100, 46, -56, 65, -69, 60, 84, -81 };
    int[] dependencies = { -1, 0, 1, 1, -1, 2, 5, -1, -1, -1, 7, -1, 3, -1 };
    assertEquals(274.875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 274.875);
  }

  @Test
  public void case26() {
    String p1a = "akPVWMajUBrPvPcFcEKjZtH";
    String p1b = "AKpvWmAjubrPVpCfcekjzTH";
    String p2a = "akpVWmAJuBrpVPCfCekjZTh";
    String p2b = "AkpvWmAjUBRPVpCFCEKJztH";
    int[] dom = { -85, -89, 85, -5, 43, -83, 10, 52, -63, 4, -11, -94, 50, 69, -37, -30, -22, 83, -80, 70, 48, -32, 72 };
    int[] rec = { -27, 72, -93, -29, 6, 83, -32, -98, -97, 21, -84, 45, 27, -20, -39, 36, -81, 41, -4, -57, 40, 9, 5 };
    int[] dependencies = { -1, 0, -1, 2, 2, -1, 5, 0, -1, 7, 0, -1, 4, 5, 12, -1, -1, -1, 11, 0, -1, 15, 13 };
    assertEquals(-276.0625, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -276.0625);
  }

  @Test
  public void case27() {
    String p1a = "lnHzViLziyuSCgslGhYfA";
    String p1b = "lnhzVilziYUscgsLgHYFA";
    String p2a = "lNhzviLZiyusCGSLgHyfA";
    String p2b = "lnhzvIlZIYUscgsLGHyFa";
    int[] dom = { 46, 62, -39, 82, -78, 4, 6, 13, -30, -14, -71, -91, 83, 45, -88, 13, 6, 39, 100, -100, 5 };
    int[] rec = { 64, -14, 73, -95, 26, -47, 42, 91, 89, -53, -26, 93, -7, 91, 93, 74, -10, -60, 39, 77, -19 };
    int[] dependencies = { -1, -1, 1, 1, 1, 0, 2, -1, 1, 4, 0, -1, 7, -1, -1, -1, -1, -1, 13, -1, -1 };
    assertEquals(212.875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 212.875);
  }

  @Test
  public void case28() {
    String p1a = "mtIx";
    String p1b = "MtiX";
    String p2a = "mtix";
    String p2b = "mtIx";
    int[] dom = { 9, 27, 97, 2 };
    int[] rec = { 78, -49, 10, -33 };
    int[] dependencies = { -1, 0, -1, 1 };
    assertEquals(36.75, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 36.75);
  }

  @Test
  public void case29() {
    String p1a = "erkBIACcHUiE";
    String p1b = "eRKBIAcChUIE";
    String p2a = "ERKbiAccHUie";
    String p2b = "ErKBIaCchUIe";
    int[] dom = { -99, 10, 23, 9, 28, 78, -81, 27, -38, 4, -35, -43 };
    int[] rec = { 21, -71, 79, -92, -60, 70, -59, -57, -53, -2, 84, -48 };
    int[] dependencies = { -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 8, 1 };
    assertEquals(-151.9375, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -151.9375);
  }

  @Test
  public void case30() {
    String p1a = "yLJkCSHTxzUqMIysrtuUDiWzinkOOSZBlVmuotPWMDoTJBGa";
    String p1b = "YljkcShTxZuQmiYSRtUUdIWZiNkoOsZBLvmuOTpwMDoTJbgA";
    String p2a = "yLJkCsHTXzUQmiysrtuuDiWzInKOosZBlVmuOTPwMdoTjBgA";
    String p2b = "YljkcSHTXZUQMiYSrTuUdiWZiNkOoSZBLvMuoTPwMdOtjbGa";
    int[] dom = { -85, 69, 39, 23, 98, -16, 67, -17, 29, 90, 20, 14, -8, 47, 77, -23, 56, 24, -89, -88, -25, 31, 61, -60, -49, 38, -24, -73, -98, 54, -71, -58, 31, 15, -77, 22, -44, -68, -72, 3, -24, 88, -78, -12, -47, 66, -29, 60 };
    int[] rec = { -53, -81, -80, 78, 86, -13, -96, -96, 82, 77, 0, -24, -98, 23, -20, 99, 73, -47, -21, 60, 80, 26, -50, -29, 82, -93, -63, 32, 82, 0, -87, 77, -86, -63, 12, -48, 15, -31, -21, -75, -96, 27, 35, -84, -1, -7, 1, -44 };
    int[] dependencies = { -1, 0, -1, -1, 2, -1, -1, -1, 4, -1, -1, 8, -1, 12, 4, 10, -1, 14, -1, 14, 9, 11, -1, -1, 12, 9, 8, 16, -1, 14, -1, 16, -1, 22, 32, 18, -1, -1, 37, -1, -1, 37, 2, 22, -1, -1, -1, -1 };
    assertEquals(-62.140625, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -62.140625);
  }

  @Test
  public void case31() {
    String p1a = "hsubYTzAUVqRnmYAOYJFvJcCuvtTnxAXEklJdEfLWsK";
    String p1b = "HsuBytzauvQrnmyaoyjfvJcCuVTTnXaxEKlJDefLwsk";
    String p2a = "hSUBYTZAuVQRnMYaOyJFVJCCuVTTNxAXeKlJDeFLwsK";
    String p2b = "hSuBYtZAUVQrnMYaoyJfVjCCuVTTNXaxeKLJdeFLwSk";
    int[] dom = { -57, 46, -44, 23, -64, -41, 40, -52, 34, 28, -35, -1, -11, -36, 6, -94, 40, 21, -76, -45, -68, 21, -29, 60, 80, -71, -73, -86, -38, -46, 59, 84, 93, -15, 86, 78, 35, -15, 63, -38, -34, -32, 54 };
    int[] rec = { -61, -37, 56, 52, 79, -61, 32, 87, 23, -44, 69, -78, -2, -42, -37, -52, 63, 42, 78, 94, 66, 76, 38, -3, 15, 74, 59, -41, -4, 78, -99, 82, 94, -72, 31, 46, -2, 58, 82, 64, -71, -23, -64 };
    int[] dependencies = { -1, 0, -1, -1, 0, -1, 3, -1, -1, 0, 8, 1, -1, -1, 5, -1, 1, -1, -1, 12, 9, -1, 18, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, 26, 7, -1, -1, -1, -1, 33, -1, 34, 15 };
    assertEquals(-47.5, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -47.5);
  }

  @Test
  public void case32() {
    String p1a = "cXcWhwzIDECmWNlXRKpGESsJorHaEXaTHFVnAxEjVqxRg";
    String p1b = "cXCwhwZidEcmWnLxRkPgEssjorhAExaTHfVNAxEjvQxrG";
    String p2a = "cxCWhwZiDeCMwnlXRkpGEssJOrhaexAThFvNAXeJvQxrG";
    String p2b = "CXcwHwziDecMWNLXRkPGESSjOrhAEXAthFvnAxeJVqXrg";
    int[] dom = { -5, -64, 20, 73, -28, -48, -76, 47, -90, 83, -88, 59, -56, 16, -22, -23, 32, 10, 37, -90, 96, -61, -30, -69, 66, -61, -77, 9, 11, -6, 95, -59, -32, -17, -94, 95, -9, -55, -9, 25, -43, 85, 12, -34, 11 };
    int[] rec = { -93, 76, 17, -97, -18, -100, -82, 4, 89, 44, -18, -50, 80, -63, 94, -86, -42, 89, -80, -98, 99, -95, -28, 14, -30, 26, 87, -37, -43, -2, 28, -86, -29, 20, 16, -95, 60, 14, -99, -30, 28, 91, 72, 41, 6 };
    int[] dependencies = { -1, -1, 1, 0, 1, -1, 5, -1, 2, -1, 2, -1, -1, 2, -1, 7, 10, 8, 3, -1, 17, -1, 20, -1, 12, -1, 16, 16, -1, -1, 28, 1, -1, 8, 11, 3, 34, -1, 16, -1, -1, -1, -1, -1, 7 };
    assertEquals(-471.8125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -471.8125);
  }

  @Test
  public void case33() {
    String p1a = "dpAiNGgNZuC";
    String p1b = "dPAiNgGnZUc";
    String p2a = "DPAIngGNZUC";
    String p2b = "DPainggnzUc";
    int[] dom = { 91, -75, 48, -94, 43, 32, 27, 8, -51, 29, 97 };
    int[] rec = { 58, -95, -99, -32, 11, 78, -67, 26, -1, 26, -19 };
    int[] dependencies = { -1, -1, -1, -1, 3, -1, -1, -1, 5, -1, -1 };
    assertEquals(170.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 170.0);
  }

  @Test
  public void case34() {
    String p1a = "qzFyaqbHlrCgcStlxdpYRKBr";
    String p1b = "qZFyAqBHLrcgcSTlXDpYrKBR";
    String p2a = "QZfYAQBHLrCGCStLxDpyRKBr";
    String p2b = "QzfYAqBhlRcgCSTlxDPyRkbr";
    int[] dom = { 26, 66, 97, 25, 70, -6, -59, 72, 63, -7, 27, 77, 7, -16, 36, -22, -61, -25, -36, 21, 27, -5, 6, -53 };
    int[] rec = { 5, 36, 72, 54, 34, -17, -98, -94, 91, 32, -94, 48, 35, -6, 35, 80, 44, 53, 5, 10, -31, -17, 38, -71 };
    int[] dependencies = { -1, -1, -1, -1, 2, -1, 2, -1, 2, -1, 0, 4, -1, 8, 5, 12, 9, -1, -1, -1, -1, 0, -1, 4 };
    assertEquals(441.875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 441.875);
  }

  @Test
  public void case35() {
    String p1a = "sRVbepJFBjuHshoikrrgGmYDuawb";
    String p1b = "SRVbepjFBJUHSHOIKrrGGMYduAWb";
    String p2a = "sRVbEpJfbJUhShOikrRGGmYDUAwb";
    String p2b = "srvBEPjfBjUHShoiKrrgGMYDUaWB";
    int[] dom = { -87, -91, -9, -48, -64, -32, 63, -24, 83, 29, 80, 91, 0, -60, 94, -21, 97, -27, -100, 55, -2, 85, -76, -26, 87, -71, -5, -23 };
    int[] rec = { -72, -19, 19, -68, -31, -90, 99, 25, 8, -94, 75, 63, -16, 68, 74, 83, 10, -98, -84, 59, -4, 44, -19, 69, -43, -18, 91, 100 };
    int[] dependencies = { -1, -1, 0, 1, -1, -1, 1, 2, -1, -1, 8, 8, -1, 0, -1, -1, -1, 16, 4, 0, -1, 8, 8, 5, 22, -1, -1, -1 };
    assertEquals(180.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 180.0);
  }

  @Test
  public void case36() {
    String p1a = "PorxCynpmN";
    String p1b = "PORXCYnpMN";
    String p2a = "POrxCynPmn";
    String p2b = "poRxCYNPmN";
    int[] dom = { 32, 43, -15, -57, -63, -61, -42, -23, 57, 45 };
    int[] rec = { -46, -8, -91, 13, -85, -4, 43, 95, -55, -38 };
    int[] dependencies = { -1, 0, -1, 0, -1, 2, -1, 2, 2, -1 };
    assertEquals(-53.8125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -53.8125);
  }

  @Test
  public void case37() {
    String p1a = "FBtIhFoPeRilDAEPv";
    String p1b = "FbtIhfOPeRILdaEPV";
    String p2a = "FBTiHFoPERildAepV";
    String p2b = "fBTihFopERiLdaEpV";
    int[] dom = { 21, 95, -22, -9, -25, -59, 68, -40, -99, -12, 80, 9, -86, 4, 92, 72, -13 };
    int[] rec = { 92, 58, -94, 53, -40, -37, -38, -53, 6, -17, 19, -30, 36, 13, -13, 19, 66 };
    int[] dependencies = { -1, 0, 0, 0, 2, -1, -1, 3, -1, 2, -1, -1, 3, 3, -1, -1, 13 };
    assertEquals(58.25, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 58.25);
  }

  @Test
  public void case38() {
    String p1a = "dtQNFcJfhngfpKrJ";
    String p1b = "DTQnFCjfhnGfpKrJ";
    String p2a = "dtQNfcjfhNgFPkrJ";
    String p2b = "dTQnFCJfhNgFPkrj";
    int[] dom = { -92, -73, -22, -16, -90, 93, -24, -40, -90, 82, 28, 29, 89, -56, 47, 9 };
    int[] rec = { -83, 1, -57, 35, -64, -19, -69, -82, 17, -34, 17, 30, 22, 3, 46, 5 };
    int[] dependencies = { -1, -1, 0, 1, 0, 2, 2, 0, 3, 7, -1, -1, -1, -1, 0, -1 };
    assertEquals(-240.8125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -240.8125);
  }

  @Test
  public void case39() {
    String p1a = "OrZzyLO";
    String p1b = "orZzylo";
    String p2a = "OrZZYlo";
    String p2b = "orZZYLO";
    int[] dom = { -37, -38, -80, 83, 6, 55, -46 };
    int[] rec = { -38, -27, -38, -78, -38, -4, -49 };
    int[] dependencies = { -1, 0, 1, 1, 1, 0, -1 };
    assertEquals(-235.8125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -235.8125);
  }

  @Test
  public void case40() {
    String p1a = "ImlnyEqLhUlenuyJm";
    String p1b = "imLnYeqlhUlENuYjm";
    String p2a = "imLNyEQlHUlenuyJM";
    String p2b = "IMlnyEqlhuleNuyJM";
    int[] dom = { 88, -46, 61, -88, -26, 96, -51, -34, -74, -10, 55, -100, -70, 78, -86, 38, 25 };
    int[] rec = { -11, -79, -7, -15, 84, 25, 48, -84, 57, -58, -35, -12, 96, 19, -71, 26, -3 };
    int[] dependencies = { -1, 0, -1, 1, 3, -1, -1, -1, -1, -1, 7, -1, -1, 12, -1, 0, -1 };
    assertEquals(-16.375, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -16.375);
  }

  @Test
  public void case41() {
    String p1a = "sSZreCXIGWMuOtEOPfQKmtfZdYyMmbTsaUyxkmwaFeBJJhOLOx";
    String p1b = "SSZrECXIGWmUoTEoPFqkMtFzdYyMmbtsauYxKMWAFEbJJHoLOX";
    String p2a = "SSZrECXIgWmuOTeopFQkMTFzDyyMmBtsAuYxkmWAfEBJJHOlOX";
    String p2b = "sszrecxIgwMuoTeoPFqKMtfZDYYmMBTsauYXkMwAFEbjjHolOx";
    int[] dom = { -95, 28, 22, 89, -22, -64, -68, 81, -80, 81, -54, -39, -78, 25, -95, 8, -9, 44, 11, -35, 64, -10, -51, 20, 58, 3, -61, 64, -90, 88, 9, 67, 66, 73, -94, -54, 73, 95, -1, 70, -71, 89, 71, 7, -24, -9, 89, 3, 1, 56 };
    int[] rec = { 60, 43, -27, 7, -59, 92, 45, -21, 75, -66, -8, -74, 69, 2, 45, -17, -79, 32, -6, 54, 59, -49, -58, -24, 62, 96, -16, -88, -46, -67, -6, -91, -5, -86, 6, 79, 32, -76, -93, -45, 29, 59, -5, 63, 16, 70, 72, 96, 97, -45 };
    int[] dependencies = { -1, 0, 0, -1, -1, -1, -1, -1, 3, -1, 6, -1, -1, 0, 2, 0, 0, 16, 13, 4, 3, 9, 9, 15, -1, -1, 19, 6, -1, 22, 11, -1, -1, -1, -1, 33, 33, -1, -1, 6, -1, 16, 10, -1, 2, -1, 31, -1, -1, 48 };
    assertEquals(105.96875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 105.96875);
  }

  @Test
  public void case42() {
    String p1a = "NTBwsj";
    String p1b = "NTBWsJ";
    String p2a = "NTbWSJ";
    String p2b = "nTbwsj";
    int[] dom = { 39, -41, -27, 89, 81, -41 };
    int[] rec = { 74, 69, 86, -78, -55, -59 };
    int[] dependencies = { -1, -1, -1, -1, 0, 4 };
    assertEquals(-21.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -21.0);
  }

  @Test
  public void case43() {
    String p1a = "BdlbAbbhUeSaTpKcrxQZZUQYgnIAzwcpAjSjtsRajSYIGvO";
    String p1b = "BDLBaBbhuesatpkCRXQZzuQYGNiazWCPaJSJtsRAJSyIgvo";
    String p2a = "bDLBABBhuEsatPkcrxqZzuQygniazwCpaJsjTsRaJSYigVo";
    String p2b = "BdLbAbbhuesAtpkCrxqzZUqYGniAzwCpaJSJtsRaJSYIGVo";
    int[] dom = { 5, 66, 30, 96, -18, -61, -97, 88, 62, 92, 68, 76, 14, 69, -40, -13, -38, 33, 57, 3, -98, 84, 32, 99, -54, -19, -37, 15, -28, 49, 85, -78, -85, -42, 24, -1, 94, -57, 23, 39, -16, -35, 31, -54, 85, 56, -7 };
    int[] rec = { 5, 57, 47, 64, 77, -53, -79, -46, 19, 89, -14, 45, 1, 94, -23, 72, 38, 25, 60, 22, 67, 26, -25, 63, -55, 63, -93, -69, -17, -35, -21, 61, 40, 5, 14, 39, -45, 83, 18, 12, 40, -26, 75, 88, 61, -57, 68 };
    int[] dependencies = { -1, -1, -1, 0, 0, -1, 1, 2, -1, 7, 0, 1, 0, -1, -1, -1, -1, 4, -1, 5, -1, 8, -1, 8, 22, 0, 20, -1, 8, -1, -1, -1, -1, 17, 19, 14, -1, -1, -1, -1, 29, 30, 29, 40, 19, 32, 41 };
    assertEquals(722.875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 722.875);
  }

  @Test
  public void case44() {
    String p1a = "SznnSEsOPjugdhYbehFnzzbKMEiTeERfQgyswuq";
    String p1b = "szNnseSOpjUGDHyBeHfNZzbkMeItEeRFqGysWUq";
    String p2a = "sznnSESopjugdhYbeHfnzZBkMEItEERfqgySWuQ";
    String p2b = "szNNsesOPJugDHybEHFnZZbkmEIteerFqGyswuq";
    int[] dom = { -73, -6, -2, -37, 38, -16, -4, 15, 47, 45, -100, -18, -35, 43, -13, 85, 49, -87, -75, -68, -99, -58, 92, 75, 37, -47, 8, -97, 99, -47, -38, -47, -77, -40, 13, -67, 85, -30, -1 };
    int[] rec = { -61, 43, -57, 44, 91, 42, -15, 90, 46, -28, -3, -81, -89, -80, -81, 13, 32, 16, 57, 64, 20, -53, -60, 27, 24, -97, -44, 10, 98, -55, -9, -54, 83, 57, -87, 95, 32, 76, -25 };
    int[] dependencies = { -1, 0, -1, -1, -1, 3, 2, 1, -1, 6, 3, -1, 10, 2, -1, 3, 1, -1, -1, 17, -1, -1, 14, 16, 19, -1, 8, 4, -1, -1, -1, 30, 13, -1, -1, -1, -1, -1, 16 };
    assertEquals(-281.59375, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -281.59375);
  }

  @Test
  public void case45() {
    String p1a = "dxc";
    String p1b = "DxC";
    String p2a = "dxC";
    String p2b = "dXc";
    int[] dom = { 74, 78, 56 };
    int[] rec = { 77, -98, 40 };
    int[] dependencies = { -1, 0, -1 };
    assertEquals(73.5, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 73.5);
  }

  @Test
  public void case46() {
    String p1a = "BAqcQvVMrcxjaEimC";
    String p1b = "baqcQVVmrcXJAeIMc";
    String p2a = "baqCqvvMRCxJaEimc";
    String p2b = "bAQcqvvMrCXJaEIMC";
    int[] dom = { 11, -55, 79, 63, 97, 95, -9, -16, -66, -69, 37, 36, -95, -40, -6, 71, -29 };
    int[] rec = { 33, -45, -6, -40, 72, 99, -23, 99, -7, 36, -64, 7, 5, 13, 64, -7, -62 };
    int[] dependencies = { -1, 0, 1, 2, -1, 0, -1, -1, 2, 1, -1, -1, -1, 2, 13, -1, 13 };
    assertEquals(161.046875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 161.046875);
  }

  @Test
  public void case47() {
    String p1a = "tAZLGIDAuSumCsgejrqCjkFXljl";
    String p1b = "TazlgiDAusumcSGEJrqcJKFxLJL";
    String p2a = "TAZlGIDAuSumcsGEjrqcjKFxljl";
    String p2b = "tazLgidaUSuMCsGejrqcjkfxlJL";
    int[] dom = { 34, -6, -54, -51, 79, 81, -28, 56, -1, -78, -90, 26, -72, 35, 90, -28, -66, -32, 30, 12, 86, 33, 37, 90, -33, 20, 34 };
    int[] rec = { 50, -45, -8, -43, 2, -53, -78, 5, -52, -63, 74, 84, 38, 6, 13, -83, 67, -37, 22, 49, -18, 24, 57, 74, 41, -38, -67 };
    int[] dependencies = { -1, 0, -1, -1, -1, -1, 5, 4, 2, -1, -1, 6, 7, 12, 12, -1, 10, -1, 11, 7, -1, 10, -1, -1, -1, -1, 21 };
    assertEquals(270.28125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 270.28125);
  }

  @Test
  public void case48() {
    String p1a = "yEGSoMnYcuGi";
    String p1b = "yEGsOmnYcugI";
    String p2a = "yegsoMnycugI";
    String p2b = "yeGSomnYcugI";
    int[] dom = { 40, 43, -7, -11, 57, 64, -94, 86, 7, -68, -25, 66 };
    int[] rec = { -97, -56, 94, 94, -75, -38, 41, -13, -42, 3, -14, -76 };
    int[] dependencies = { -1, 0, -1, -1, -1, -1, 4, 0, 4, -1, -1, -1 };
    assertEquals(-79.75, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -79.75);
  }

  @Test
  public void case49() {
    String p1a = "zcD";
    String p1b = "zCd";
    String p2a = "zcD";
    String p2b = "ZCD";
    int[] dom = { -58, -10, -37 };
    int[] rec = { 24, -62, 63 };
    int[] dependencies = { -1, -1, 1 };
    assertEquals(-52.0, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -52.0);
  }

  @Test
  public void case50() {
    String p1a = "ZwUEGUuIoVWWuaifiKp";
    String p1b = "zwueGUUiOvWWUaIfIkP";
    String p2a = "zWuEguUioVwWuaIFiKP";
    String p2b = "ZwUeGuuIOVwwuaIfIkp";
    int[] dom = { 59, -39, -40, -19, -67, -22, 79, -57, 87, -12, 66, 30, -12, 39, -74, 38, -98, -69, 83 };
    int[] rec = { -58, 54, 93, -10, -2, -2, 66, -32, -89, -70, -22, -67, -42, 27, -87, 50, -83, -81, 84 };
    int[] dependencies = { -1, 0, -1, -1, -1, 0, -1, 6, 1, 0, 4, 3, 11, 9, 8, 11, -1, -1, -1 };
    assertEquals(-147.78125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -147.78125);
  }

  @Test
  public void case51() {
    String p1a = "VnNFtwk";
    String p1b = "vNNFTwK";
    String p2a = "vNnFtWk";
    String p2b = "VnnfTwk";
    int[] dom = { 94, -72, -99, -65, -87, -6, 78 };
    int[] rec = { -82, -3, -39, 70, -4, 2, -56 };
    int[] dependencies = { -1, 0, -1, 1, -1, -1, 1 };
    assertEquals(-183.3125, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * -183.3125);
  }

  @Test
  public void case52() {
    String p1a = "YeadtsFrALaXRukoqWdCikAa";
    String p1b = "YeaDTsfRALAXRUkoqWDCIkaa";
    String p2a = "yEADtsFRaLaXrUkoQwDCIKAa";
    String p2b = "yeAdtSfRALaXrukoQwDCIkaA";
    int[] dom = { 80, -67, 64, 82, -3, -20, 75, -86, -41, -82, -63, 35, 86, 57, 12, 66, -22, 25, -93, -23, 90, 3, -50, 60 };
    int[] rec = { 79, 58, 96, -48, -100, 40, 44, -58, 11, -98, 88, 81, 56, -77, 70, 59, 28, 46, -79, -58, -83, 35, -3, 70 };
    int[] dependencies = { 5, 2, 0, 1, 0, -1, 4, 3, 3, 4, -1, -1, -1, -1, 5, -1, 21, 22, -1, 13, -1, 7, 7, -1 };
    assertEquals(395.6875, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 395.6875);
  }

  @Test
  public void case53() {
    String p1a = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String p1b = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String p2a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String p2b = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    int[] dom = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
    int[] rec = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] dependencies = { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48 };
    assertEquals(8.881784197001252e-16, geneticcrossover.cross(p1a, p1b, p2a, p2b, dom, rec, dependencies), DELTA * 8.881784197001252e-16);
  }

}
