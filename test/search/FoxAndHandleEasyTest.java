package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FoxAndHandleEasyTest {
  FoxAndHandleEasy foxandhandleeasy = new FoxAndHandleEasy();

  @Test
  public void case1() {
    String S = "Ciel";
    String T = "CieCiell";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case2() {
    String S = "Ciel";
    String T = "FoxCiel";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case3() {
    String S = "FoxCiel";
    String T = "FoxFoxCielCiel";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case4() {
    String S = "FoxCiel";
    String T = "FoxCielCielFox";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case5() {
    String S = "Ha";
    String T = "HaHaHaHa";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case6() {
    String S = "TheHandleCanBeVeryLong";
    String T = "TheHandleCanBeVeryLong";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case7() {
    String S = "Long";
    String T = "LongLong";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case8() {
    String S = "hFVvzbvASpRyHNXXoGHe";
    String T = "NxjozJgpEPXrDJaBJmtjessBysMuMZzawDHEFqAQ";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case9() {
    String S = "UxuJUtGhPW";
    String T = "yCqiAekNxXkzlPBTpBOy";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case10() {
    String S = "LDybFtrIbfBFfKBfxM";
    String T = "LDybFtrIbfBFfKBfxMLDybFtrIbfBFfKBfxM";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case11() {
    String S = "wSoinsWghfObLqESjxBOJCW";
    String T = "xwzBtBWANgrWaqdFjkRthQHdbblnTmELOqiFOPjAWRJSWu";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case12() {
    String S = "JAls";
    String T = "JJAlsAls";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case13() {
    String S = "rTpAlQGrtefWMTrTZy";
    String T = "borGsyQhKqeFiXgGJEVoVebcfHAKjNRcDWey";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case14() {
    String S = "uYvlOGCRRczMSihxOT";
    String T = "uYuYvlOGCRRczMSihxOTvlOGCRRczMSihxOT";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case15() {
    String S = "XYvaBPTNvXqwPefLTPcxSUmFpsSRgoKO";
    String T = "aycvOfyvNAwwXXygofwyBnfzrjFIhYDJTrllTPYlnVzAtcLTBk";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case16() {
    String S = "pPytXgYywR";
    String T = "pPytXpPytXgYywRgYywR";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case17() {
    String S = "MQcziP";
    String T = "MmrcKkmXCnWk";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case18() {
    String S = "bNhQYQeGbDxVlDt";
    String T = "bNhQYQeGbDxVbNhQYQeGbDxVlDtlDt";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case19() {
    String S = "ycBdMJBjEKCgMNj";
    String T = "ycycBdMJBjEKCgMNjBdMJBjEKCgMNj";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case20() {
    String S = "UzIWynjLPXcJTbpiUATLQiu";
    String T = "UzUzIWynjLPXcJTbpiUATLQiuIWynjLPXcJTbpiUATLQiu";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case21() {
    String S = "bnfhlZNTL";
    String T = "StUVnEKRvksBNrzaQO";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case22() {
    String S = "RaPsuHyHGooAAUxkgy";
    String T = "RaPsuRaPsuHyHGooAAUxkgyHyHGooAAUxkgy";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case23() {
    String S = "eTpbJbUCvmNwYkRzmRNn";
    String T = "eTpbJeTpbJbUCvmNwYkRzmRNnbUCvmNwYkRzmRNn";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case24() {
    String S = "cuPkDxawiXvpHulqZxLdSkwTJf";
    String T = "XPZunVHFdCLjJxJJOOcdASCCCnjCwnRtWqCfrZlknXOLqqEHbw";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case25() {
    String S = "DvnjrjMtleRFjTZRrUMNLzfMqAwxeYADmOCqjrdVHPTkymVn";
    String T = "DvnjrjMtleRFjTZRrUMNLzfMqAwxeYADDvnjrjMtleRFjTZRrU";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case26() {
    String S = "hjDPyWn";
    String T = "hjDPyWhjDPyWnn";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case27() {
    String S = "Jg";
    String T = "JgJg";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case28() {
    String S = "arLuYFNkxThJH";
    String T = "arLuYFNkarLuYFNkxThJHxThJH";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case29() {
    String S = "WktNgcmAhtTHElFyfzSzkipDAONrQHtuDYxDMewB";
    String T = "WktNgcmAhtTHElFyfzSzkipDAOWktNgcmAhtTHElFyfzSzkipD";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case30() {
    String S = "nFLwEWBWmTXVcfFiav";
    String T = "nFLwEWBWmTXVcfFnFLwEWBWmTXVcfFiaviav";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case31() {
    String S = "fSKHxVXYBaCVCk";
    String T = "jQoxFvwcRdnENElwCXeGowzBVMcg";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case32() {
    String S = "FrorgDvkfBvfhhYfvDiWIQmLWwkAzVKRWpMRfrxMEtOJCjHOQ";
    String T = "FrorgDvkfBvfhhYfvDiWIQmLWwkAzVKRWpMFrorgDvkfBvfhhY";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case33() {
    String S = "PIV";
    String T = "PPIVIV";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case34() {
    String S = "cBeCFvCvorv";
    String T = "cBeCFvCvocBeCFvCvorvrv";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case35() {
    String S = "MoXhdxjsBPkJBrme";
    String T = "MMoXhdxjsBPkJBrmeoXhdxjsBPkJBrme";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case36() {
    String S = "c";
    String T = "cc";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case37() {
    String S = "EAjpjSfZHMamvnvf";
    String T = "EAjpjSfZHMamEAjpjSfZHMamvnvfvnvf";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case38() {
    String S = "jynQxSpTsRpBpYkbgrv";
    String T = "jynQxSpTsRjynQxSpTsRpBpYkbgrvpBpYkbgrv";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case39() {
    String S = "ZbwF";
    String T = "ZbwFZbwF";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case40() {
    String S = "qHoyzJthpvFILWqhKuTDQoRv";
    String T = "qHoyzJtqHoyzJthpvFILWqhKuTDQoRvhpvFILWqhKuTDQoRv";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case41() {
    String S = "to";
    String T = "ttoo";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case42() {
    String S = "kBWObooPnAuepHComaarpcttwmBKkKZsOEyvzotxTfZHT";
    String T = "kBWObooPnAuepHComaarpcttwhBKkKZsOEyvzokBWObooPnAue";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case43() {
    String S = "PPwmrvATBOo";
    String T = "PPPPwmrvATBOowmrvATBOo";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case44() {
    String S = "pgxddyEDzu";
    String T = "pgxddyEDzpgxddyEDxuu";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case45() {
    String S = "xgsxWYvwE";
    String T = "xgsxgsxWYvwExWYvwE";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case46() {
    String S = "ZSHhTmuzEeTX";
    String T = "ZSZSHhTmuzEeTXHhTmuzEeTX";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case47() {
    String S = "ypeBRbNEbKhUBLmpcEAHQyeH";
    String T = "hjLrTxeFuhVcyMxJBoYUqbeQkZznUGvjRWhzhqebQSHGNWXY";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case48() {
    String S = "iYYoPiUnV";
    String T = "iYYoPiUniYYoPiUnVV";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case49() {
    String S = "ngkROIWfqZCkRWLClftaqTulw";
    String T = "ngkROIWfqZCkngkROIWfqZCkRWLClftaqTulwRWLClftaqTulw";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case50() {
    String S = "JFslIQJ";
    String T = "JFslIQJFslIQJJ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case51() {
    String S = "TcFyOKFXncWnALZNCHliQ";
    String T = "TcFyOKFXncWTcFyOKFXncWnALZNCHliQnALZNCHliQ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case52() {
    String S = "GAHkNIPSqLnUoSkSsXkslELRgGWVCLjMwUioav";
    String T = "GAHkNIPGAHkNIPSqLnUoSkSsXzslELRgGWVCLjMwUioavSqLnU";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case53() {
    String S = "xzoSMRhvY";
    String T = "xzxzoSMRhvYoSMRhvY";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case54() {
    String S = "GrwD";
    String T = "GGrwDrwD";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case55() {
    String S = "RdmnQjaPCtnYoVTohK";
    String T = "RdmRdmnQjaPCtnYoVTohKnQjaPCtnYoVTohK";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case56() {
    String S = "RhogLmQpAncgjVvmFdvokUDv";
    String T = "RhogLmQpAncgjVvmFdRhogLmQpAncgjVvmFdvokUDvvokUDv";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case57() {
    String S = "URfAoWsHdAIOHMjGRRYZamJz";
    String T = "URfAoWsHdAIOHMjGURfAoWsHdAIOHMjGRRYZamJzRRYZamJz";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case58() {
    String S = "PmFxEgQciVoLImjzanGsr";
    String T = "PmFxEgQciVoLImPmFxEgQciVoLImjzanGsrjzanGsr";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case59() {
    String S = "tfIuAVHhapXWnZJXMRFnvmOOG";
    String T = "tfIuAVHhaptfIuAVHhspXWnZJXMRFnvmOOGXWnZJXMRFnvmOOG";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case60() {
    String S = "XUxkagZPoLDyTpwO";
    String T = "XUxkagXUxkagZPoLDyTpwOZPoLDyTpwO";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case61() {
    String S = "bOYBElRTEQKV";
    String T = "bOYBElRTEbOYBElRTEQKVQKVfasa";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case62() {
    String S = "omyajO";
    String T = "omyomyajOajO";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case63() {
    String S = "thGyEsrQnJaqniOEkJF";
    String T = "thGyEsrQnJaqniOEkJthGyEsrQnJaqniOEkJFfF";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case64() {
    String S = "KGkFbRLpWCKbfY";
    String T = "KGkFbRLKGkFbRLpWCKbfYpWCKbfY";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case65() {
    String S = "XsEebTMoFjEuPnvY";
    String T = "XsEebTMXsEebTMoFjEuPnvYoFjEuPnvY";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case66() {
    String S = "lSNpQOF";
    String T = "lSNplSNpQOFQqOF";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case67() {
    String S = "hwwJ";
    String T = "hwwhwwJJ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case68() {
    String S = "ttlSRdnuAmFCbbvr";
    String T = "ttlSRdnuAmttlSsRdnuAmFCbvrFCbvr";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case69() {
    String S = "suOMmymXWfYWVbCVwEfWKKwiXSqHTAFMxCvAmNyQqELmSUgpz";
    String T = "suOMmsuOMmymXWfYwVbCVwEWKKwiXSqHTAFMxCvAmNyQqELmSU";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case70() {
    String S = "ALkgOiBSKGEFTJOHohrzPrTWw";
    String T = "ALkgOiBSKGEFTJOHOhrzPALkgOiBSKGEFTJOHOhrzPrTWwrTWw";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case71() {
    String S = "jfmmHevkm";
    String T = "jfmmHevkjfmmHevkmm";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case72() {
    String S = "qAHVK";
    String T = "qqAHVKAHVK";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case73() {
    String S = "cKDGFVkYnkVBgOYc";
    String T = "DvxAJhJxmsXJcwLlzXWzGXFrJjotvzSX";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case74() {
    String S = "KNPZgbQRPmmADdKoSsGiAYR";
    String T = "KNPZgbKNPZgbQRPmmaDdKoSsGiAYRQRPmmADdKoSsGiAYR";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case75() {
    String S = "dRAxu";
    String T = "ddRAxuRAxu";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case76() {
    String S = "B";
    String T = "BB";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case77() {
    String S = "IqHPemjgCMYKLE";
    String T = "IqHPIqHPemjgCMYCqSKLEemjgCMYCqSKLE";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case78() {
    String S = "oWJmSQfdbxP";
    String T = "oWJmSoWJmSQfdbxPQfdbxP";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case79() {
    String S = "IabWpRy";
    String T = "IabIabWpRyWpRy";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case80() {
    String S = "uPCrYCglqb";
    String T = "uPCuPCrYCgyqbrYCglqb";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case81() {
    String S = "QVLfcjQiVuZBZuZnOKN";
    String T = "ohBdVVQBmslPIJtMAzbPKtNwlJQhdmOJpwCZgQ";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case82() {
    String S = "iuTLiGk";
    String T = "iuTLiiuTLiGkGk";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case83() {
    String S = "xBdKqjWzZ";
    String T = "xBdKqxBdKqjWzZjWzZ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case84() {
    String S = "fulYPoKmIjYrnuSpwvNdJYO";
    String T = "fulfulYPoKmIjYrnuSpwvNdJYOYPoKmIjYrnuSpwvNdJYO";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case85() {
    String S = "MzohGiOxUipmgbZ";
    String T = "MzohGiOxUipmgBZMzohGiOxUipmgBZ";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case86() {
    String S = "hnTRXASWIsKEdZ";
    String T = "hnTRXAShnTRXASWIsKEdZWIsKEdZ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case87() {
    String S = "zhtbirWrNPTsxY";
    String T = "zhtbirWrNPTsxzhtbirWrNPTsxYY";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case88() {
    String S = "EjSiNBduCutXaZHiobZ";
    String T = "EjSiNEjSiNBduCutXaZHiobZBduCutXaZHiobZ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case89() {
    String S = "ulS";
    String T = "uulSlS";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case90() {
    String S = "JYUcqyKhPIPc";
    String T = "ZMpqAkMcewPVBEhogFMzAzAM";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case91() {
    String S = "KVFsnTmKPZTesVqoNHIzWbQ";
    String T = "KVFsnTmKPKVFsnTmKPZTesVqoNHIzWbQZTesVqoNHIzWbQ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case92() {
    String S = "bCvpJO";
    String T = "bCbCvpJOvpJO";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case93() {
    String S = "JECwIKmw";
    String T = "JLihdLPkhHrcGGAi";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case94() {
    String S = "ueGVe";
    String T = "uueGVeeGVe";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case95() {
    String S = "ctaqUhfk";
    String T = "ctaqUhfctaqUhfkk";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case96() {
    String S = "fJQTnS";
    String T = "fJQTfJQTnSnS";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case97() {
    String S = "NUvvcXZoDjIKUkyFVqSfvH";
    String T = "NUvvcXZoDjIKUkyFVqNUvvcXZoDjIKUkyFVqSfvHSfvH";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case98() {
    String S = "ffmpRiAJmSqEtuVoOwMCKNSxt";
    String T = "ffmpRiAJmSffmpRiAJmSqEtuVoOwMCKNSxtqEtuVoOwMCKNSxt";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case99() {
    String S = "QNVKqJliyXMqsaX";
    String T = "QNVKqJlQNVKqJliyXMqsaXiyXMqsaX";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case100() {
    String S = "SibGX";
    String T = "SibSibGXGX";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case101() {
    String S = "eidpQ";
    String T = "eeidpQidpQ";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case102() {
    String S = "tYYkCIisW";
    String T = "SwnGkHszqHclAJpIQe";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case103() {
    String S = "OseaqAuzBofqRf";
    String T = "OseaOseaqAuzBofqRfqAuzBofqRf";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case104() {
    String S = "tiqVddQwEuJYYxnSDZtyGPohhDu";
    String T = "tiqVddQwEutiqVddQwEuJYYxnSDZtyGPohhDuJYYxnSDZtyGPo";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case105() {
    String S = "tbeJm";
    String T = "BFrDoOEkCW";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case106() {
    String S = "abCvoNWbcpZwxeNk";
    String T = "abCvoNWbcabCvoNWbcpZwleNkpZwleNk";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case107() {
    String S = "VZrsLLsHmcyClpYWF";
    String T = "VZVZrsLLsHmcyClPYWFrsLLsHmcyClPYWf";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case108() {
    String S = "A";
    String T = "aa";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case109() {
    String S = "A";
    String T = "AA";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case110() {
    String S = "aa";
    String T = "aaaaaaaaaa";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case111() {
    String S = "aa";
    String T = "tttt";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case112() {
    String S = "ABC";
    String T = "CBACBA";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case113() {
    String S = "KanKan";
    String T = "KKanKananKan";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case114() {
    String S = "FOX";
    String T = "FFOOXX";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case115() {
    String S = "aba";
    String T = "ababaa";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case116() {
    String S = "abaa";
    String T = "abaabaaa";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case117() {
    String S = "fff";
    String T = "ffffff";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case118() {
    String S = "Hoge";
    String T = "HoHogege";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case119() {
    String S = "LOWCASE";
    String T = "LOWLOWCASECASE";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case120() {
    String S = "hola";
    String T = "hola";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case121() {
    String S = "Yes";
    String T = "YYeess";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case122() {
    String S = "AAB";
    String T = "AABAA";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case123() {
    String S = "ab";
    String T = "abba";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case124() {
    String S = "FoxCiel";
    String T = "leiCxoFFoxCiel";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case125() {
    String S = "abcab";
    String T = "abcabcabab";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case126() {
    String S = "bab";
    String T = "bababb";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case127() {
    String S = "az";
    String T = "Azaz";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case128() {
    String S = "abbab";
    String T = "abbabbabab";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case129() {
    String S = "aaa";
    String T = "bbbbbb";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case130() {
    String S = "Fox";
    String T = "AbcFox";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case131() {
    String S = "ciel";
    String T = "cicielle";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case132() {
    String S = "BABB";
    String T = "BABBABBB";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case133() {
    String S = "abcdabc";
    String T = "abcdabcdabcabc";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case134() {
    String S = "AAA";
    String T = "AAAAAA";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case135() {
    String S = "FAF";
    String T = "FAFAFF";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case136() {
    String S = "TheHandleCanBeVeryLong";
    String T = "TheHandleCanTheHandleCanBeVeryLongBeVeryLong";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case137() {
    String S = "abc";
    String T = "cdecde";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case138() {
    String S = "abc";
    String T = "aabcbc";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case139() {
    String S = "ciel";
    String T = "cielciels";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case140() {
    String S = "LaL";
    String T = "LaLaLL";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case141() {
    String S = "hai";
    String T = "hahiai";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case142() {
    String S = "abc";
    String T = "aabbcc";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case143() {
    String S = "rRoObBiInN";
    String T = "RROobBIiNN";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case144() {
    String S = "fox";
    String T = "ffooxx";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case145() {
    String S = "hola";
    String T = "holahola";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case146() {
    String S = "abca";
    String T = "abcabcaa";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case147() {
    String S = "cciel";
    String T = "cccielciel";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case148() {
    String S = "CielCielCielCielCielCielCielCielCielCiel";
    String T = "Ciel";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case149() {
    String S = "FAF";
    String T = "FAFAFB";
    assertEquals("No", foxandhandleeasy.isPossible(S, T));
  }

  @Test
  public void case150() {
    String S = "abb";
    String T = "abbabb";
    assertEquals("Yes", foxandhandleeasy.isPossible(S, T));
  }

}
