package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class HillWalkerTest {
  HillWalker hillwalker = new HillWalker();

  @Test
  public void case1() {
    String[] landscape = { "AD", "JG" };
    int threshold = 3;
    int timeToDark = 10000;
    assertEquals(9, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case2() {
    String[] landscape = { "AD", "JG" };
    int threshold = 3;
    int timeToDark = 29;
    assertEquals(6, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case3() {
    String[] landscape = { 
        "AABCDE", 
        "GJIHGF", 
        "MKLMNO", 
        "STSRQP", 
        "YUVWXY", 
        "edcbaZ" };
    int threshold = 6;
    int timeToDark = 36;
    assertEquals(30, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case4() {
    String[] landscape = { "BCDE", "AJKF", "AIHG", "AAAA", "AOMK", "AQSI", "ACEG" };
    int threshold = 5;
    int timeToDark = 14;
    assertEquals(10, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case5() {
    String[] landscape = { "BCDE", "AJKF", "AIHG", "AAAA", "AOMK", "AQSI", "ACEG" };
    int threshold = 5;
    int timeToDark = 57;
    assertEquals(18, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case6() {
    String[] landscape = { "ABCDEFK" };
    int threshold = 3;
    int timeToDark = 1000;
    assertEquals(5, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case7() {
    String[] landscape = { "gb", "Yd", "ZY", "bd", "fd", "cc", "ZV", "ZX", "WZ", "TR", "NO", "QS", "WY", "dd", "ff", "hl", "km", "gg", "cf", "df", "WX", "VW", "VZ", "UW", "PY" };
    int threshold = 6;
    int timeToDark = 72;
    assertEquals(32, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case8() {
    String[] landscape = { "kdZYYZYVUVUWdZXUVdgdbXQ", "geddceYRSUVcbbXSTbfdcYS", "gfedcZXUUWeeecYUVZbedWT", "hebbZZYYXYbggcbZXbcZZWR", "fYVYYWYcbWWZcefbceZXYWU", "ZYWTVXbYXXWVYdbYZYbYTSV", "cdZUUVRSXZZZbXSSVYXUSRV", "cbZXUROOTbcbYXUQQTVUTVQ", "fbbZVSPNQXZYcbWRSUVTVZe", "cZYYVQPOQTXZcdcYXXXXYen", "SVXTPRPOOTVYdfefedbXchj", "URSRNMURPRXbWbeikcccZgb" };
    int threshold = 8;
    int timeToDark = 136;
    assertEquals(36, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case9() {
    String[] landscape = { "WXYbTOVdW", "XYZYUTUVY", "UUWXVTTWY", "RRSVWVVVZ", "VTSUVVXZb", "TSRSWYddW", "POSWYdebd", "PUWZdbZXX", "SXddYVSTV", "YedYUUUTR", "fecYWXXVU", "dfdbbZYYe", "cYbcYYbZY", "XXYUTWWVU", "YWSNPSRPN", "USPOKOOLK" };
    int threshold = 4;
    int timeToDark = 283;
    assertEquals(31, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case10() {
    String[] landscape = { "fg" };
    int threshold = 10;
    int timeToDark = 272;
    assertEquals(32, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case11() {
    String[] landscape = { "S", "l", "b", "c", "Q", "O" };
    int threshold = 8;
    int timeToDark = 281;
    assertEquals(18, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case12() {
    String[] landscape = { "Q", "f", "S", "S", "f", "m", "n", "S", "H" };
    int threshold = 4;
    int timeToDark = 349;
    assertEquals(16, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case13() {
    String[] landscape = { "ORURXckjn", "RPTbXcikk", "RWZVSYihk", "bcbTRYdhl", "VZXTUXZXZ", "YVTXVZVXW", "TUbffZUQN", "MYgdhZMIJ" };
    int threshold = 8;
    int timeToDark = 161;
    assertEquals(39, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case14() {
    String[] landscape = { "TRRVUXefk", "bSNMOWcff", "bRPNNQZip", "XSRUTVcfj", "WbZQPXZbV", "XdYSRWVOP", "feedVVcZR", "XhfdZZefg" };
    int threshold = 4;
    int timeToDark = 50;
    assertEquals(28, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case15() {
    String[] landscape = { "WKNW" };
    int threshold = 5;
    int timeToDark = 272;
    assertEquals(22, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case16() {
    String[] landscape = { "Sc", "eb", "Ub" };
    int threshold = 10;
    int timeToDark = 112;
    assertEquals(28, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case17() {
    String[] landscape = { "PWRS", "cYUW", "ifWb" };
    int threshold = 7;
    int timeToDark = 287;
    assertEquals(34, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case18() {
    String[] landscape = { "qjbV", "lgfY", "ehcX", "YYcT" };
    int threshold = 4;
    int timeToDark = 327;
    assertEquals(42, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case19() {
    String[] landscape = { "QUdbgjhiURMTUdLFKKQcqlNeo", "WngjQHgPijnXflPIZfptVWsYK", "pjsbPRHSqfLSRTecXXVYXWijh", "oopmVZMThTRRTemggTWKWMdWR", "NMkogcMZcigkNmrhgcdQGYORb", "ULgSbPdifUOTOSZTTYQOcYVbl", "ioOhodUkfcNYMRehdZYTZhPNH", "SQjpfmckiheUjhniXKfUcXXfp", "KIclrnqeekcregLLKYVNbdPYr", "cTLSrZeZXjkeniVJcpncknbhk", "ibXWOnWdPdicjpcqhZYTrcZng", "UNSeZbpMMjrYRKeQkZNdsqoZP", "lUnSYQbWPSLcckRihTgTotSQp", "SWZiVdQTMTdbTVpUefRgSfOWq", "XSogPQdZYbQSkqmpZZjKMbPjs", "ZURZXRNRMFYlorhZnkVMYiYXl", "WYWeRRMJdSdrieWONZSZroUYZ", "oPTXgkheVpofRjXPhglmdlgdN", "MeUcOhrcRlfcXVLWjighUUnmO", "eUebkUNjjrPPMUQZYKHgoptXd", "nOknpmhZdfdNWMUnggQViggYk", "hQQlpjmhXbTIXUmoXTeZZYgVg", "kbhmheZOoQDQSUcQXXXgfUgfj", "mPiVKNHLgoTSYjOTWVnQXoQZn", "ZVHVcRYUnbiYjqmKJkbQrOOOF" };
    int threshold = 4;
    int timeToDark = 34;
    assertEquals(20, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case20() {
    String[] landscape = { "hfoOPIIkorVDeOhRZfoUfkjVk", "XqZmeMNTgqXLKLVMinXKXnlgu", "hXpZceVNWjnhXSbegcKfRVidj", "kcnTXkKXpcRdbZfVKJbPUqZTp", "gjVTmdeRLZOZWedhoRcYQekQf", "SiTXVZcXfjUOTblRYijkkcXUi", "KbflmldpgYOQUpYNVTcUJJRco", "dSUWMVnjgSUheiTLHbYQjRVZR", "VdggQjXgcWLhtjgnYQSdUdPZL", "ijVRmPgZUNSOUnjmPiSVghMSc", "ghrjTmNbUKUMfePRQjRPcTiVR", "ZiqnUMNYeghlXbgTQQQMjrpjn", "pbmRQiXiqXnSLdNgPZcpZernS", "QVKJkgTZVWiPbfgijefkhfmlX", "PHJOLcbbdbZLihOmodjnVRWkW", "WYbLRWKWfdkhYdbilopmmXbVT", "rUJMOOLMLdXkmTfWmoSSISQKZ", "NfjLJhTKbVkhUThoSYWMHVQmZ", "MMbeVcIVomfLZeiPLZeUYLdbQ", "SolfcSTTekmVhpgnZRThcVMIL", "fXhioOYWcbdllhRiWWnWbkYfS", "hinUicfSWOWUdQXQLdTRSfXin", "qhjUfRkkWjSYjdfSKYNKWPVWd", "OdWKHeXjokPNiqZORWQigPZcT", "lWLOMJSrZXnXTekqmjWYecLfd" };
    int threshold = 8;
    int timeToDark = 42;
    assertEquals(33, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case21() {
    String[] landscape = { "qQMZbNjWliROSYoMPifKIFWii", "KPSUhSimegbeYZTTKimcXiSHN", "jRgRPOQOQYWLknMJQXYejQbcJ", "QOYThNQmrRgchYJHekfljXhnp", "NKhiQUksdkiYMZUglXdYYhnhl", "SkYmbmuZrqXmibQcVbioqYMjk", "hhbjlemYelTdkmPdPdTNidSPY", "SPbNfgVLoUQfnZSOOSipgTSml", "eefkQYmgNjQhmNQYXWYUKdQdb", "OemRNUhYPhoTMIVnomfRbWMPj", "cpoklhQdTWnMbqTXcccOMRNYX", "oppfQhObQfiiZScYMegfLEVOI", "fRndZWeNmcRWOgTNffnPVPHTb", "XUcgeljiWdmWZfNnpqclNJkfQ", "IPotWVMOfoUdpPYipucVMblmg", "VjfbddUhmfUoYNYmYmoojtjjp", "NhccSgObOgjWZbSbfjsnsrdVW", "mLVOSTSSTSRZYYZfpswSdlNRH", "hMLdciblXVRUXXjfmgcmbKOTE", "UYVfnPPPehiWWVgieiWMJfbhK", "jhSbfeZZbfflPnTmTKKimTWYJ", "WgYhOKcggYPigeqkbhSZbZLZN", "khRdVSTijjcQgSlfVinneZPTX", "OhsWNHOZQPbmRXcnYZglQiopl", "KhgggkRcSKbWeckjbksRTryZn" };
    int threshold = 6;
    int timeToDark = 42;
    assertEquals(42, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case22() {
    String[] landscape = { "WXObkWReJhgeKJoRXKKNJbWho", "MYoQPdeePVUZTgkhLGWekhTfg", "QKdPfmjefXRISPjRObglbTnPl", "lgKSVnNXghkNUTblpTkcikfXf", "hgjYPfVMfrVNKXrWdMXomqnVN", "pccngULXbmkTYqYbcNQgmVUVc", "fjibjlphcceXfbmfULdomSjcT", "cWLZTjlWjemqqfWgNQfOINVbQ", "NYeYOeKUORemWVSSKfieMLceR", "MfkZSKTKGFKjjXlnYlpfNcoUH", "LnWTjZfbSLVnXcpkbSYZTcdYY", "bUZYWYgWJdfmilqNNlfONjnqq", "boSOXiNVmWNPcRLRQndMNcZRb", "sjUcdXdlSSOinbUUMhpiVmYjh", "cTgTNZWXkcNgqXILYUgYVgpmQ", "dibVnSTfcTKegOIMienblTibT", "rYSmllceNHPHfRkmScNVGYgfO", "SWPXYljkYjNJJckcSdeIHKYNW", "WYOQmUlqUOZIZpUcfnYWRLgnO", "LHGcOcVckRXgObYlTKeVTopLl", "IYQeQWNPHbTSdNbdlpUfpZNcW", "ibbeiUMGXSiiieYQNRVQKMQQO", "fimotTgVOXTMblckLUOWfYXdd", "mTZSdoRhPXkhYhXfPLLcmPbRF", "ELLlWGITWeNcWJXfininNJcOS" };
    int threshold = 10;
    int timeToDark = 40;
    assertEquals(24, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case23() {
    String[] landscape = { "ZNVmVVcnVcYpolRKKeZTNQZiR", "jRLbYNOhcKkUlRcMljSGVdiow", "KTPjnjWLcqNOWUcUgkPfUdfhp", "QGRVnVUYUJbQJOONQPRYdmbbd", "lOVOVioeMSlgbNUZbllYMcOUW", "edlUghcQLMfnVPfXPUYRNVdWf", "LdilomVHSTQNGdZJPikeRPXhS", "YkkWOOJOUQYZeLWchPioXZkYQ", "TSYZgdWPJWngTQHkkOWoUUjUS", "khZpkNfmZlpZkXYPTbPjnnjUm", "WmVgldSdYoeNiPYiRfUKgXSeY", "XTpmdZQScSdiWOdjddOLSfNZe", "hmdjSSTgdZUnrVRmSYUZhikbo", "ncfcSgWiSeQciirqnXXgTYgXo", "glTSPhkTcjRfmQgWcZNUcjqUI", "fXQbXOLUdWeWTNcjfQRfqjoff", "mfXkYbJZlegmWhScQUbpTcpeo", "SQKhSecROlbLlPOjoieehXMYp", "PKPUqSPUiQOZeWbYjUMjQVfbp", "dKZsifibkXZklrqTSeiNOMZpo", "lkgiceQPbXjfbRhYYYeecNOWU", "VlbcWMDciWmjmpUJSQJPcgUOf", "ZRmRXjONfkRepdNMPTIVnhdVL", "OhnZhibSXIWOhfegQRlSfYdQN", "ZXIiWghkVmJeRjvQlbVcMPjjZ" };
    int threshold = 9;
    int timeToDark = 36;
    assertEquals(25, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case24() {
    String[] landscape = { "fWOOQWbZYTbcRMPcbYWSLIMTQ", "eeXWUWcXQYYVWTSVeeZZUPSPU", "XbdSSWURTRTUTRWWVZZeVUSVU", "YWRQRQWUORWZSZcWUUZcbWWVN", "cbTQSbZbYYedcbceWTYcbUTSO", "UVUVbXZZfhigbbfeYYeihXQRR", "PQRVebZbfghiebdYVdkheVVYY", "UPQVcgeZghiecXWZeeeZTWWcj", "YXRXejhcZeffVUVXdgdUWVfhk", "fVTXdgfWXXXWXZYVcbYXTchmo", "VVZehcXXPTcbUYZbUXZbbijko", "bZfheYWZWVbZXVcUSZZZffgec", "WfgcXUZZYVYXWTWVWbdbUTTVV", "WdbUPUZZSSSWYZUWcdbcVTSPU", "TYTWUWWRSQWcXUXdhehgfXRZW", "VRWXdXQRNRUZcWWXckngXXfde", "OXbecbWOMMSbbVSTeifhdYbce", "YVcieVZVSTVXURUVYecYbedXW", "YXcbYbZfcZYbdcYccbXYXZYZX", "UYZWUZdegXWchgcbbddbgeYZg", "eccYdYZigZUZddccgYcidbbWZ", "licZdZYWcdYZYbXcdcdZcZUWW", "kkZXWbVSWdgdbTVebZWbZeYRU", "ZdXXeecYYdfdTTWWSPRbjibUO", "RTZYhjYcedYWRPRLGHTYgndOS" };
    int threshold = 5;
    int timeToDark = 30;
    assertEquals(31, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case25() {
    String[] landscape = { "VUWVWOSSPPOXRQPTOLRUWTYfe", "VWSXXWSTSUZVUQORTSYWTTVdX", "dccdWSUXWYbZZRNQQccbVQUUT", "gfccVRUUXdgbUTRMOScfXRXVN", "bcjgYQQVddefcZZUQWZZWcUSW", "UXfhYSRSdfggdifYbZcYYXXVb", "cchdXTRTcigVZhleVbXYXTSbb", "ZhebZUQTfeXRUggcbbXTTVZbW", "fcfcYTQXdfdWYgfYZbTRYZZXU", "keWXRQXVbjedgfcbXZXXWdZVb", "ggZQNTVYceighXRWgbbhdXZWZ", "WcYVUYZcijijhWTWYedbZVWdW", "OTcfhibZcjlhfebXZdYSQRWWU", "LPVemibTZjiYVYbfcXYSLMQVW", "LPUZgidcZbYQPUYZceYSNNQWe", "ZWTYdggdheTOOTWZebUTUXWYU", "XYbWYZdghfZVVTWfbVZXYcbUY", "WVVVVbgcZfdbbdebYcbXYgYTY", "XbWXbdidYcbefZVWbdbWWZYYb", "eXXSUbgfXWVcYYXSSXWXeXTYh", "XZbYUXdZWRUXbUSVWXWbZTPPW", "WccXZZbfVVYeUTSSZcYYWWRQL", "fZYYWVYdhcbZWRWURYbUVTQTS", "XVPVeccjjjfXQUURRSYcTVZdg", "YPMRZdmjndbYZTSVXUWZVZcim" };
    int threshold = 6;
    int timeToDark = 49;
    assertEquals(29, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case26() {
    String[] landscape = { "peZVRUbYdiZOKRSSTcbghkpdS", "ddWSUdcbiZUWSSXVROSbeddXP", "kZSSXbfgeecUQTRTRPRVQVbVO", "fgZYWXbeebUTSRVXTVWROUTVi", "gfhXTWXXbXWXYYcWWXYXSQUfo", "dgYWUOQTWbXcdXNRVVbVQSXgg", "bZYVQOMQbfccTQQPNTXbYZcce", "XccUWURUbdfdYTQQQVeYcbZZV", "cbWYYXXcghbWYbeWXceYYVXZU", "ZZXWedXdeZYZXbYebdddTSZbe", "ZbXYYZbZbccfbcYUXYXbXTXch", "iYTVYYWYYXYXbZbXPSXYbebVS", "gdXUWYXZZSSUUSXbZSTbfbTUP", "bdddeeecYZSRRWWcYWWYYXTLI", "RYYcZfklfUUSUWbdgZUXcXRNO", "SWZVXdifcWVYdcYgibRVdfTOS", "SbfgbcfYUUWhieZYYUXZZXQOM", "XgkcefgcUZdehbWWWXZceZRMS", "fhddYefddcecUVfdeeegXXWWU", "dYVVTTZdYTZcWVYeecgZXYcXc", "gZXUOPbheYcbRPUWVWYYXZbdb", "jgZXWXbggbddVRQUUWXdeWRSV", "cdihcZZXWdkdWVYZYSRWXVQQR", "XdffhbTSUYdigZTbcXRUdgeWO", "LYheWXRSSTehfRNYffcbiihYW" };
    int threshold = 4;
    int timeToDark = 42;
    assertEquals(41, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case27() {
    String[] landscape = { "KUZfgjdXUVZgeZRWhmcSdbZcf", "WVfklhdYbXWVXXZYbbbccZYfc", "VeihhhgfXRQSRXcYYcYccYXXX", "cecWTWccXSQXcZYdYUceTSZXZ", "YVQRQTcdVXbdeVdjebZVUWXgZ", "fZRSRSZYUTdddYdhhegeUWeej", "fZUQRTYZWXdccebedghdYYZZd", "QTTWWXYYekmhZZbdZdcbWWdjc", "PRXbYcfejnjebYbffZYXZdeci", "PRccZbbdhihZYYVVbXSUYXSXh", "PYbZWUYcffWUYYVVTRSVYTRSU", "SUUROWbccWVXZWXTUUZdUQSXT", "STSTVVYccWSRUUORQWcYUVXWf", "POXcYVdZUbUUVRPOUUZWXbcgn", "PRYYVWZYZYYVTTTXYYTXdiied", "YZbddbfcYeXRRVgiZSXciifch", "ZYdeedcdcbWWZdgcYbcZUedgk", "deZXVbcZfbXccfgXWfhYSXfhk", "lcZYYZbZZYVWedXWXcfVTWeil", "dhkZYffeYROVVZYUPSYXWgkhb", "gkfdfgkcQOTVYUVOJOZdhniWZ", "fdfbbhfcUXdhbUSPNRYcbedbX", "VWebUWVTXZhgbZVUUXWRTYdWc", "WXdcUNPQUgfbYUYZdeWUYcZXd", "VUgeQRQRWYdVUVYZdUcYXbdYc" };
    int threshold = 4;
    int timeToDark = 30;
    assertEquals(10, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case28() {
    String[] landscape = { "RTbWXQTgkffcXYfYOMQUghWWb", "SVbeVSYedbfecfZXSSPSbddYT", "SdicVWciebZdfedVVRPQTYYZb", "eifbZhicXbicccXZUTPTUWXcb", "dYYcgceiddegZYdWPQZVURbZd", "YWbbbYbZbZebdcXUTYbdWSTei", "SXYZTSUVXccXWTZcWbjeURWcd", "VVQSUTVTbgdZVUUXegfeWXYWW", "TRNNXYTUZgZTYWYecZfeZUTYZ", "SQPUYXTWebXXTWfhdXUbeVTTd", "SPUegWSVSYXSTWceWTUYZXTWZ", "XVYdWXWUTSUTYdZWbbVZbbfdc", "XTccVTWSPWZXYTVcZbYVbihgc", "ZcfcYRQRTXeeUPWZZWWZcbcde", "egheRMMOXbeeVUVWVVUVbZWZj", "kldVTQNWXVYcedbbWRNVcTOZk", "lihbYVVXZTSemibUQTUWXRRbY", "lidbecTWZXWcjibVQOSZVRTbj", "XdZXVVVUWcheidXSOPWYTUWel", "YXQTYSWYbcdegZPOPXcXYVXfk", "iYQRTUWcfZSZZWUNUdfcTPYeY", "gbSTbXcjdTSXYbXWUZebTQRUV", "khYdfhfeeUUWdhdWZbdYSRPVf", "mefhhcZebYUZgfdYUYgYSTYeX", "keXgfZYddRSXWdhVNRbYRXddd" };
    int threshold = 10;
    int timeToDark = 32;
    assertEquals(21, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case29() {
    String[] landscape = { "VZddgfbcbYZecWTSTVVVVZfgf", "cddeddffdbZYWWUUVXZYXXZcb", "fdbXWdgffZUTTVXUUZebVUVXX", "fcVRSXcdZUSSUWVTUZccXTTUS", "fbVSTVXYWSQQSUSQRXbZXVTQM", "ebWUUWYYWROQSRPPRUVWWUTPL", "eZVVYYccXTSSSSRSTTTTTUTRP", "ZYWWYcdcYYYZXUUVUTSSVWVUV", "VTUWXbcddeebYWVVTSUVWWXYb", "PQRTWbdfhhfcZWVTSTVWXWXbZ", "OPRTWZdhigcZYXUUTUWZYWXXV", "ORUVYZbehfYWVVVVVVYZZYXVT", "STWYYYbgifYTUUVXWWWXZdZVT", "TWXXYcgjjfYWWYZZXTSTXZYWV", "VWWVYdilidZcdeebVROPRVVUY", "YZYXXbghgbbeghfbUOMNQSSVY", "dcbZZbddbZZcgiheWPMPTUUWX", "XYbbZXWXZbYbeikhbUSUWYXYZ", "RTXYWTRUZcdbbfiiebYbbYYYY", "SVWURPPUcfecZYZccbbZYXWWY", "XYYVTRTWZefebXUUUVTUVTUYd", "dcZZXXXWYdffdcVRQQQSSUVZf", "bZbddbZYYceccZWTRSUVWXZcf", "bYZdfebXZdcXVWVTVZZZbZZde", "cbYbggbXbcbUPRVUUZebZbXWd" };
    int threshold = 4;
    int timeToDark = 40;
    assertEquals(30, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case30() {
    String[] landscape = { "VceZRTdhfdYRMMQSTTSUXXWTM", "bdbXVXdfebXTRRTUUUWXXWURQ", "dcbXWXZdbYXYYYWUVbdbYWVWZ", "ZZZYYXYYWWbdcZWUWZcdbZbcf", "WWYcZXWVUWZcbWRQSWZccdffc", "WXbbbYVUVYbYWTPNRUXZYbege", "XYYXWXXXZbZZYVRRSTVVWZefi", "bZZXWVWXYZcecYWUSUUUXdggg", "ddbZXWXVWXcddbWUWVUXcegeZ", "bcbYXYZXVVWXbZVTTWYbdfebW", "ZbbYYZYWVWUUWWUTVYZbdcZWV", "XYZYYbbWWVUVWWVWZZbbZYWVS", "bbYWZbZXWVWZbbZZbdcbXVWVT", "bZXXXYXWWZZZcccbbccYWXYXX", "edZWUWXXXXYYXbZbcZWWYZYYZ", "dcWSVWWVVUUUVXZccZXWWXWXd", "ZXUUVVUUSRRRVYbccYWVUUXbY", "XWVWWSQQSRRTWYYZZWVWYYZWW", "UUWXWSPRTUUTVWXVTVYddcXWV", "TUUUUUVVVUTUVXVTSUbghcWXc", "RQRTVXZZVVUUVUVTRUZffZWYe", "RRQSWbZYXXYXTUUTSUYccbYYW", "XTQSXZZYbdbWUTVTTUWYZYWUR", "YSPUZbbcddbWTTSRRTWXVVVTQ", "cUQUccbbdedXSOPPPTVWWRTVS" };
    int threshold = 7;
    int timeToDark = 46;
    assertEquals(29, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case31() {
    String[] landscape = { "bcZbdgeYVPLMQWdfefZSSVWYg", "YXYbeecYVQNOUceccZVTUUVZc", "VVWYcecXTQPSZccZWUTRSTVYd", "WVXZZccYTRTYcccYSRQOQUXYZ", "VWYbZZbZXWYbdeZVTRQQSVYZY", "ZbccZXYZXXcecZZYXWVUVYYWY", "effbXXXWWXbccccccdZYYXWUP", "dddZXVXXUWbdefgffecbYXVSQ", "WVWYWWWTUWYehhgffedcZWTQR", "RSVXZXTRRTZegedddddcYWRPO", "RSWbZWTRQTXddbYYcdcYWUSNJ", "QTYbZWURRRUYbYWXXbbZWTPLJ", "TWYZZZXSOPSXXXVUVYcZWTRON", "VXXXYXVTRQTWUSUVUWXWUTTVV", "VTUVWVVVWWVURRTUVVVTRSTUW", "SSSUVWWWWXXVSQSVWYWTRSRSR", "UWYVUVVWVXYVRRSTXZYVTTSPO", "bbYYVUVVWXWWVSRUWbZXWWUQP", "bbbYWUUWWVXXWUUVYbcbbZWSQ", "cbZZXTSVXXXWVXWVYbbeedYUR", "fcYXWSTXbYWXXXWWXYdefcWVW", "fZWWVTTYcbYYZZYXXcfedZXXX", "cYVVVTUXZZbcddZZcfecXVYZW", "bWUVUUVWbccddbcffecWRTWYX", "cWSRTSTVYedcdeceedZTRRSUb" };
    int threshold = 3;
    int timeToDark = 48;
    assertEquals(32, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case32() {
    String[] landscape = { "YXXVWZZZXZdbXZdfcZdeZbcce", "XYWWYccXXZZWXZcbZbdbYXbcd", "UUVYZcbZZbWUWWWXYYXVTVYZb", "WWWXYXYbcYWWWWVVWWSQRSWYV", "ZYYWUVXXXXYbZYWVUPOOPRVWV", "XWVUUUVVUWbdcXWWSOMMOSXZZ", "RQTTSUWVVWXZXWVVUQMNQVbee", "RQRSTVWXYXVVVVVVUTSQSWdhg", "QSRRTUVYbZVTTUVVTSRRUZefi", "NOSUUTTVYZXUSVXTQQQUYcedd", "LOTXXTRVYYVTUXXTRQSWZecZT", "PRVXWUVXZYTPTWVTSTUXbccVS", "VVWWUVXZbXSRQSTSSUXYZZXUU", "ZYWXYWWXXVUSRQQQUWXXXVWUP", "bYZbbXWWVWXVTTTTUVWVXYVSR", "bZbecZXUUYZYYbZXVTTWYYWVT", "bZcecYVUWZbZbddXTSUWWWWWc", "dccbXWWYbZYYbbYVTTTUUUWcb", "hgdYVWYcbXXYYYWTTTTSUWYYZ", "hfbXXYbcbZYWXWVSSUUVVVWWW", "fcbYXbdbbcZXWWTSSTUUTSSUS", "gfdbbcbbdebXWUSSTUSSTTSSP", "fffdbcbbccbYVTTUWVSTWVUTS", "YceebZYWYbcbZWUVVTSUXYWWZ", "SYdcYbXTTbggdWTVVRQSVXZZb" };
    int threshold = 3;
    int timeToDark = 35;
    assertEquals(28, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case33() {
    String[] landscape = { "hcVXYWTQPQTXcgfbXVVUUWWVR", "cYXWXYVVTSTWccZWTUVVTVXVT", "ebXXZZYYVUUWWVSPRTUTVXXVR", "dZZYYYXWVUVWUPNPRTUTTVVTQ", "VWYcZXWVTTUUSQPPRUUTSSTQO", "SVYcdcYYVUTUVTSSRSUVVSQRN", "PSYfihebWUWXYXWWUUXYWVURP", "PTbfiieYUUYbZZXVWYZYWUTSU", "TYdffebVTWZbbZYZYXWUTSQSW", "TZeedXUUWYbXXbcbZVSQOORWZ", "VYddXTRTWYXVWYdcYUTRPPSZe", "WYZZURRTVWWUWZcdZWVUUSVcf", "VWWVTSTUWXWWXZecYYYWUUWbc", "TTUSTTUWXWVSUZbZYYWUUTXbd", "STUWXWVWWVRRUZZWVVXWUXZce", "TWXbcZVVVWVUWXZYWYbbYYZce", "RSXbcYVUWYYYYXYbdedbbYYbb", "OQUXXVUXYZbbZYZdfffdbZZbb", "PRTUVVVXccccYWYcdedbbbbZY", "TVWVWVWbcbbZXUVYZZZZXZbYb", "cZYYXVXbZWWVUVWXWWXZbdcYX", "edcZXWWXXWXXXWYYXXZdeecXR", "cedbXXXXYbbbZZYYbbbbefdYT", "bcddbXVVYcZXZcZbddbbeeecZ", "bZdgdYVTTYXSWdecfhfZbfedc" };
    int threshold = 10;
    int timeToDark = 42;
    assertEquals(33, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case34() {
    String[] landscape = { "YVmddcZNlqQZiXOfLJKmXhfOb", "XgoQLcoqSghUdUhdcThgVgTTi", "hstRSVRjQeXkqUntpmeedmdWo", "eijniXPlWXpVeVksjooeoZchp", "jdqoUfrflgmlYiPKgfhgnUjsT", "cVZYhUObmRloSiVSYlnkUSNQp", "ibNWghMcfRQPNbVUShlXLZNdl", "qggpZXVUWVhbWJJZQVfPIbdks", "cokYNNcoSnfhmXPOdQPTULicM", "STcXikcWVYgsjXSdTWRTijTiV", "GXhskZSOZOdSWcbNMhlmQKkqW", "PQWendbSbUeXYQgjekRgTQbMb", "LKRcMfkicUZUinXlbhWWngQLJ", "JgWechUclifgSJePgoenoiZLL", "mpQkhULLZKYTYTKPTmSYmmSGK", "qjRgLgidZKFiXXbjnYWgNcWQH", "kinfjRcfgScNWOSqWRZRLQRLE", "hkQQMftbQKgSXYgkigeTiVIWc", "jdRQQlohNIJPYdhcnrjQHPUWr", "eSdRoqfXbVHTgcgOTfTWOXVRT", "pmdYXgcObQXNedliSTWhQZXkn", "mrUkgPJSPGRbcjhQXUfVZYViO", "TVWVQWUkPKKSfTWUWRmZRjbjL", "jSLQhhbgbTLfmsTQkjfflWhiL", "knspVTntpopXocjRPqYjPIgXN" };
    int threshold = 4;
    int timeToDark = 54;
    assertEquals(24, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case35() {
    String[] landscape = { "gPgNgmsgltgjfnkpheTZiQLcJ", "TfSjkmhZUbUKdiTgUYjVjQXij", "ZKWkelbSRjOIdoefRhRmYZPnn", "irUSMVoWlhRIjpgWSNSfVXbSn", "OVgejQPobXVTQMUOJWlZnUNWO", "UYbhQIfViThdPPhiSZTgfZdNn", "OcOfcXVfSRXUZiWgimZSdTJVb", "nbXYWkTQhpVKQhfcNWcgQGRbg", "VVdnTbXQRULIMXXUMXbgfYMQO", "WmtYblQhldXlUeQUZfbjiMgLJ", "vTYNjoRORdcpXUdbLRlnlTYJR", "mjUUhZYYXMXkipSgUUXUhObnV", "mTZbZTKXlbgkOVcLjmiZchVSn", "GZWMQfYmokSROLSNbYneecVbP", "XObLVMchiTLdPQPLWnochkXVp", "NWkUIRKLMLRRfefhpUQMQgfWp", "drkKHPQLWOYefRVeihMUiTdlp", "PPVMXOjOdiYeQdifbkcUZYfsQ", "PPLkToehSVSgnmYnPbRmRYbIi", "HYXYQQeQPfrkkeSZeKcZVUUXR", "RXijdPSfUqoXOjSQdNeWWeOdN", "QmTRIZbPjhhQkMZZYRfTTSTkM", "YPhYbYbpVhNblUXTMTiQfcdjR", "UlVZMfeLWKSUeiSlmWgSbYkTN", "RMRlRROMGRifLOWqZWMZqolMI" };
    int threshold = 21;
    int timeToDark = 56;
    assertEquals(32, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case36() {
    String[] landscape = { "pWcZkWNhpPhVddSWiNMlgKfcn", "WYcZKgeYXMWnhRWeWUgZZjUhK", "ifYgpWVcdTdPkcXTTMPVTTYZU", "fULnXWQNXlbOOhkpeOIiMdZLF", "VfQgcWdZpiMYcRcqonXeWQTRK", "UNMSlObjjWjdiojYlichNUceK", "XfUQRZPlprRXeUhWQcRfcUSkR", "mRgOPMPPhoiRVccgphkRSgfNe", "QllMigkfbVYTXglhhfVNTLPTj", "qdKQbkUXbPUUlRJJURXcTdUVq", "TQcPRlrobkZhhNXUZdogpdiXl", "bfPMYXmplROlknPhXjofYprbM", "cMVfplnjnYSiWIiPUUeOotiWV", "PfovsljZblUThegjNYRZoogiq", "ifgWnnkXeOPpXVRcUkUfeOUps", "MZdRUgjZYQhMhPLeeOgWNORjT", "kZkXiRZZZlKMRgkgVifJLcVUg", "NifTNeZWjVSQfVjQoVPcNiUhT", "QjTVYlZfXbebUiUTcolOSMoVG", "gYfPgSLJfcLONZQcgkfWOeelO", "PRNlkYVgWHFRWRgbfRHMlSikr", "VVdfUbNRgocLSfnbhmUbMWYbX", "bbdiOffPPhkZTdVeWjXhrZGgj", "PXUQOjVOckkVVdhLSMmWLgUIe", "OLYJLOVSTXhMZrbPIjpPROfcK" };
    int threshold = 11;
    int timeToDark = 84;
    assertEquals(41, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case37() {
    String[] landscape = { "jeckdROZjokmdZJUhZUjichNM", "nnpsOhthcRdUUbZQhnSTIglVj", "VYfOmdjefbUSYmeUbJShVQnks", "TWlfVcWVZgcjYjWPGXQTXNhru", "oSiScVOiUSQXigkMKdYSHPeld", "gkigkegcWVPPZsoMhpqdQgjiL", "qZZfVicnQYLJUQepRjqjUgRdc", "iOekghZUfUSYJkSEZbhXiPJYs", "nVljZUQQRhTbVTKNLJbdShXPf", "lboMenfleMZcYkfWVqRUZQeTT", "pdfdQOgelohQZfQSnnhZlcPUp", "RipjlWSVpjQfORMceedlMfVmv", "nZeZdcSUleVfhfVUgVjcRScVM", "gWXqefONOUlefcneRiWKSobKD", "qrWQmRHbmtmmicVeSSGJMKcgX", "gbTfYOdeSVdUeckjndUIHXlfS", "LkidUkdjjVYTmSMQXWbPdqoPH", "njqsbRUUTnldJbOeWTPMPNXTN", "YmZfhTIQeYZnYRMkYTKKhdVeM", "TjZWVRiOVbUjfUhiPSXppeQJe", "pdbfldKHUiZPfrTXcRPbXYSIk", "dYjVNUIPeYMYbNbYLSZVQVeWH", "YmeXSlMLiejYRmmfRNVZmlbbk", "QYdkpnWPRMOcejjTJisZfXWhn", "djZreKedQKhelTFZrXhhonshp" };
    int threshold = 11;
    int timeToDark = 58;
    assertEquals(44, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case38() {
    String[] landscape = { "sehhcNGIHjVIkejiZPjmOYgiM", "oWdpVNUOWYfpSdsbKXmXUTNJE", "OMPLUTijRJWnYilfoTZVTVJMg", "MXYcULSPgqQUhgUhPfoiieUbg", "cNTnRYNJLYYUkkmlfmoqoPfQR", "LVqjmdcMZYYdYpwempbbhUWQO", "NTUoWeYkefqPggonbmkPPNRTL", "IcfeoVVedijfNnleXUUKDHQOR", "NcblXjmbMQeekbhePXSYJKOJc", "RMgecbQhpUReSjfjpUbcQUlhh", "oQKokbYUlhhLgRoqfZnndZpgo", "ZmbprlUMiobfPohocfklkhniu", "OOqggVVhfXQKSWfmkVbUUhlnm", "lShfUgokPeLMYYZeTUdVZccbi", "PUiXmcgbKYMkVPlffrPjSifUS", "WUiVhQTdTHjOcnWlegifhphno", "STPNKPmYccfTPYhkUeblocdou", "TNTcWfoWXPZUQJWXmhcmdOJlo", "bNKZhZhUMfQeMGIgqliVOdeXL", "WiQbTbmWOfpkfRIWlPHfWfMJc", "WLRJeSMLYTiXcgXNQHLKnpMWo", "VeNPYbhYkRgXbmlhdWWjvjZqU", "ZhcNlnNdhldWnheYinbTepmis", "meicjcqSOVnnpXVTgXbfUnkRM", "YQHjVWmXlgjhcNcjKOXIQjnYh" };
    int threshold = 17;
    int timeToDark = 58;
    assertEquals(44, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case39() {
    String[] landscape = { "gYSPYbVbdWTcWPXbZWWOTTdWL", "feTXbcbcXWecYYbZeeZXWVRSU", "eYbWdeZYcifdcbYdkhYVXYVSR", "TVVWcYUZhjccfbVUUYVUUbXUX", "NONYYVZcYXehZVVUTSRUXbeXP", "LNTTZWUXZbgbdbWUWTTYZcXVQ", "MNUXXYXXehfgffcWZbYXYVcbc", "MRUbbWbfiffZceZXXYdZYZbei", "RUbZXbedbZdfccWUZddZVWZbg", "VVSXcdgbUYefhbVWbbdcdbYWR", "hdZXZYWZZdYbZVXYYddeYZcWZ", "ljdZTRSTXbZWXWddfikbWdbed", "olbXVRRXYZZVXeilgfbdcXYfd", "lgfZUTSZhXUYehdZhbYbYRYei", "kiggcYbecYSXhdVVUcZXTSTcl", "kfcbecbcZTOVccWTYceYYWWWZ", "hXPSUcfhgYTRUUXWZgbZfZPPT", "dYTQRXgeefeYVSTWccWVYVOOX", "SXXWSUYgijgebURZYUTTTRSSS", "RPZVOQbighjgdXZbVZbTUbYSR", "KSSUUUdikjffYYXUXecbchYVb", "QTbWUceileUSYYYURWbXVbeZZ", "RZUSVXeffbTSTZfdWUUVZXZgY", "bcUVVcXZihVQSWccWZWUWUXZg", "YddWdbehijcQOWYTXdZSSQOdc" };
    int threshold = 12;
    int timeToDark = 92;
    assertEquals(32, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case40() {
    String[] landscape = { "eWZSRZjkekhbRLTORcTOWZchi", "fcSUVemijljbTTPPUXURTWXbe", "fdXVceikfijdVRORYYbXWYcbX", "gfXUXZcdggghcYWUbZXdbYXUO", "fYUTUYYfeXchiYUYWXZWWZbZV", "STSOOQXdZSZfZWXWWUSbZYZck", "cVQPMNbgYVTSRXeZUTZfgXZmk", "ZbVLMTWdXPPNVdYXZdYYXWXfl", "ZYQOOVcXXURVXZbdbVTSSQVbi", "UWRUWZcZXZUWXcdXbcXUPOTYf", "ZVVRTfcYefYUZdcefZTPPSWVT", "gYRSUYdbijdZcfeYcZROORTSO", "cXSUbbWZghihggYXVYXUVWPKN", "RWYUUXTbfcfdbcZXWZZdbXPOQ", "bYZZWVXXYbbfbWcTVYbfYWTOM", "UYdbebUTXZbYZcbWRTecbSPPO", "gbbebVVYZZXYXdfdWURXbVPNO", "ZdcZXWYbZXWPXciebSVVVUTRT", "VbcdeWchbSTWSbfkhXQXWSUVT", "bbgjfcfkYSVWXVdheVVXWVWXh", "cfbfiggfeYXbTYbbZWUWXYcYb", "UYYbegegddZYbbXdcfcZZURUW", "RWccbdZTSWXXZXehffgeZTNSZ", "TWVWWSUVQQQZccbccccgVSRRS", "WbWTXUUZRJTbiZVYchbZcVPTQ" };
    int threshold = 3;
    int timeToDark = 63;
    assertEquals(32, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case41() {
    String[] landscape = { "HQVdUWbfYeXchfYfXYZWWfbUX", "TRTWXWdcbeihbYXcYROWYUXgl", "PQSYdXXYbgiggYXVUSQQTZZdj", "NRTWYXVdkhfgdXYdXXSRSUYYb", "JQdbTRdihiddcehbXWWWZcUXW", "UVYcYbegddXbhjdXUZVYYVZVb", "dgZXXdgZZYYbZZefZTTRVXZZW", "jcXTWdVYbTSSRbeZWVRRVXXVb", "igXUZYVUURPRXWbVPPQTSbZZc", "fecVTWbZRUWXUTWWTQNSbXZcb", "ZWYZUTTUVSXbYVbbYUUYdcXVT", "XbbXRSSTRTXUXYWfecYgjeWSc", "fdURSUSXYWbYRTZdhZbegfXXd", "PVZTYcZZXbcXUQYdXZYVWYXbc", "OQUbYYZTYZVRLQUXcbSRWebcc", "OTWUWZWTVXTPPPYbZTWWZcfch", "ZbdcbXXcXYbZZXeeZUTVXXXdl", "hjhcSSXVWcefbbgkZTQNRXWXd", "kfebSRUVRVYcVTgfcWPPTWTSR", "fbcYbZVXXRSRQVbeZcXSXSVUM", "dXbYUXYYXSNNPTcbdfcZWYUVV", "YYUWWZYeYQQTbcUVYVXWURRcj", "YVXYcUbfcWSYfbTQNVUWUVYel", "UXZcWXXbYVQTSVVRQUbejhkke", "ijVbeSVVRXSKOUTUZVfhiokki" };
    int threshold = 7;
    int timeToDark = 66;
    assertEquals(7, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case42() {
    String[] landscape = { "XbYYUUVdUUVPMYjjlmbcfbVcZ", "OTUVYVVTTRSUTUccdebWXUSbi", "LOTVUQUURQZYVUVZUUbYbXWYe", "LPVVTQPUUWbcbddXRRWcebXYY", "OSWZVSQPTfijhiheVPSXcbZbe", "YZWRRPMOWekifffWVUORVXbbc", "VYWTTNMUbeecWZXYWTOOWeYZT", "ccYYVPPUdbWUXVbYdZTTYWYWY", "edbcWNRUWXRTXbegjeZZZYWch", "WUWZXWQSVbYTSZghhffhcTTSW", "dVXgiVURXhfRQXcebcedXRLQP", "VZbddcVTUdcWUXcXceXWUUSNM", "XcccdgYYZdcZYdbWfgYSWYWVP", "ebZdjhhfeZbfffZXficZXTQSV", "bccYegbdeYVTbhWQXZbdZYUSW", "fYYZcZbZWbVTXZWTQRUXXVXYc", "gdbgdZTXbYVSZYYXUSVWbhcYU", "kjihhbTWVXYVWVZdVXZefZZTX", "hjmocZXSTRUYYXWXUcifYVZfZ", "nonheeYTUWTVbecSRXhZVXfgl", "ojgdcdcZdZSUZdUTUUWcWZfkp", "dgbZfdYficTQWXYTRWZUVZjli", "ZbZccYcedZYUPOPXYWTRWhklh", "bcXUVXdgbecXRNSTXTOOUbfgm", "gfSMPVefXdhYXTOTOQOKKVVbm" };
    int threshold = 22;
    int timeToDark = 55;
    assertEquals(27, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case43() {
    String[] landscape = { "YZVZhXXhihdWSWfYedZSUVirt", "YdbZYVZdgbSQYfcggfbVRThpo", "XXYfcUYeeVPQWgfejiZVWYeeh", "SdfbYZYeXTVTZfhkjdbbXXdfR", "WWZfbUURWVPVYcfdYVYVYkhYR", "ecYVZbUTTSXVSTXVRYWYhlnYS", "YYUYYWVSRVTUSXWUTXYbejiiY", "YUXYUQPOSVYYVWcbYUUbcZghe", "RRZcVLNUQWggebYYYZYVTcfeg", "MTddWTROPTbhZTTQXedYfefkj", "SWYbZZYUQSYVZWOSYecfhhhdh", "dgZSWZdYSRVUUYSUcgccfebZV", "kdYVYZYYURTVTSUUVZgfdcUWb", "eZTZXXVTRQTcYRSVZZdeWUYTW", "TPSUXRPOTWYdcWTUVZYXYWRQM", "POPVVUQPSVXfeVVRUWWVWWRQO", "PVVUQSYWRTdfcTNQTQTZXSUVd", "VcbVVYVWXWVVXUOQUUXRVZVWZ", "WcdZeeeZZZVUUSPXbURTVUVcc", "UdZXfhZTYYXTUSRZYVSOVYYfn", "WcdbdZPRPWXVUZbcVSTTTXiqp", "TehdSMRQRRVXcddYTQVVUcjmp", "YdeWLKPYSRVWUZZSSVWZffidb", "bbZRJJQWZTVWWXWRQZeihbYWO", "RTTSMMRQWYVVQUYWTcmkicQRT" };
    int threshold = 8;
    int timeToDark = 55;
    assertEquals(31, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case44() {
    String[] landscape = { "CbPfhPdOYOXrtLmifpwvsWnlY", "JJdVLZolRLMckTYgfZswjZimM", "MMJOWljofdpXXKMhVMlejPhnn", "pTYTNNQgdSlTPRZTOdZPdVUlm", "loXUPZjYSXieWOlplfjiKTOUI", "miQibUXQUVXmdUpkhUOTJOKhM", "jgYkMMgdoQchcNZWMTMSWNcjn", "iSVmTRTUkmoUHUPYUZScideqS", "lfTVfVYoRhTlQWkgdeYYWjlYV", "npTZULLNfTUiqSXPGYZmkehMV", "TSdSRQLgfWhdKXYTPKLZZoQfY", "VqQJHIipibNMceVjTSjOnRdlp", "RWjQSPKmtZhclVmTfjckbXpcb", "KbXiOILNjrghoXNLXjhhchYTX", "PSNUTWgfYcSnbYeTodYblRMZm", "UVjMHYnRZflPfoYQLYWjoYQob", "SogPXTQTThjmWObOOKeffhQTl", "gPeZOegbbYUZXcijjLhgcbNjX", "RmOZXVdhPIWddcrnRPPNKVUor", "PdsObjcPeVQRMZWeOTkdKWbor", "pZbmWeRbOJOPTYQTlflUJIlcL", "WhlPgrUIgZYgQOUMTTgiOUdbI", "PNRTTfbbZUTbjmbNQPdXkUVKH", "OPfNZpRKIWSmVdOdNKLScOSIf", "WTXOVKLlRbtkVoSEfNEeUZWhT" };
    int threshold = 5;
    int timeToDark = 6359;
    assertEquals(2, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case45() {
    String[] landscape = { "NXrYLiRkWbfcKXLUlpcmPMYgL", "SUlXQIIgrUOefXIUcMJXLTkLk", "PTdYgVMXdcdjiYMIMTNRinWTH", "IWPMNRRjRcbUcOZXfWfiUYjcQ", "VbXTVMZUVSeSKLgVMORGcgcdc", "TPXOUbmWbTLTIJjgNUfUROLJS", "IWLgcKcehOdlceiZflmfQJRSj", "nXfdgWMiQVmrfTPZdcRJjoWln", "cRZoNGgPcmbdcPjdLXRPZckrY", "jbifcRYTihTbShkidYhmkckRT", "pjqRZNWqYbOgdimPigSZcdOcZ", "ggTfOSRYlPOOZmYUTQjRiXYdo", "kfgQiLKRdWPLVoZKikSdVfXXo", "SgTTJIJYjZORTcjipcQbidlgf", "MgXhSbncgORZfqZTYRKVmdkeS", "RPiUOXedPKiZomfWXNTXQhbNJ", "RWlVIZWSeQIPXgNjSIQfdTPUT", "gdUkPZUkiUhWXWQNceOUJdiPH", "JSXhXZVSJXSiTZmjRhRTSYPOl", "PfUVWNXMLNhMbdhiSdNjPYKmw", "iVZmcSJPlSRWViWQUQVhQILPe", "eSNSfdSVmlldXNKjqVdlhNSbX", "MRYXWQfTidOickUgjbhhfcUkq", "gSHRQUKhSNKgrTNiVNTNdMNjq", "iQbLDLSITnoTkNKVlWfNCPKIQ" };
    int threshold = 7;
    int timeToDark = 9814;
    assertEquals(27, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case46() {
    String[] landscape = { "mPqokhpcoXHEYQhMDcWJROJnw", "WgjoSgnVNcRVLYYTiPFZUlVSl", "MXhhPZgiYLUlhYjcYTlPgXmcm", "egXjncpeVVidgVjZXVPIcdmfd", "WmffePWidkepYhTWecWRJTPTn", "NmtghSejltggOXYjcgjVkPebK", "TcjohnVdQUmQPdXdbZlWknVdX", "gVkfogSQNRbUXOKfqrVKJbRNd", "oNYeMeRMcWLddfTgrgVXNVPNX", "fONRMNTlSWZpdSTUdYhLdhSXp", "PfTeQSUUphZZTeZVXbWffgqUK", "lbOSYNkWgehgRJYNSUXYncgYG", "fNibPTkWdPOglSYglXMOPgRiP", "LOTjnhmjPIMgnZYMkkNfhlRVR", "KLQgpjhiejmeUZjRcWdldTfVJ", "VjfhPUddnrtmQhjXbiVUcjleJ", "bZPWfdkddrredbTSmXTLkiWYM", "oYQLgTlmdRoXOUXrSRXclMdfL", "egZjYhtkPKSfdMIbfdmWdThjW", "VPOWQOniKVOQZfPMOWLlqqrZY", "YMQdfuoYYjidoOFENNdlVhcRE", "RekkVgqfmvmshRTNQNfcLgpMC", "TKNZluknSfsSipUiYYVORekOK", "LIGhbRlSWWOknmOUiZVheSeTo", "WmUTNQPlRKlWrWNLIeXYjrLRo" };
    int threshold = 6;
    int timeToDark = 6652;
    assertEquals(38, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case47() {
    String[] landscape = { "LnegOIlYGZXRiQlvxVmqSQLPi", "IkeYmgnTMFfhoklprpijlNHLe", "OHZflikMfTRdiphmrnmbQlWZP", "oZMQTQORUXofNONchpoiVQmgc", "oiXeokmmXokYKUTQMSYRdOXXm", "kRXoqdbpWiiXSZeegRQbOWNkm", "JiZUdUbbeUPNJLjteVmmekWjl", "NNTNdQjkVJZTJNklffbZnrtbp", "GQOQitiljhXMHIkUeUddsmocI", "bLdmmWklsqQMIPKYmYdRjVmoe", "WNTcZObUmoPSihXlRWfPRQpZr", "bQdbPTZWNJmViNSQQQOLQTgnn", "WNYVeWcbZXdnlPLgeLbcWbgcQ", "VUNUUQWdOXSnQfZNYWSjqpXVS", "fhRLYnQSXijVTefnPLMmZXlPG", "VjRcpSZQjiMefgZgXPmXiTjYJ", "sodbWjgXSdcULZXbmbSScmjoQ", "djYPdZPGbVYLRZXfTcdTeUbIl", "cOLLhehZUdPbSWUKjZOSLnOLS", "UVWhgYTQdigbTQNkMUkPktnQK", "lmdOcklPQSfqbQYMFTiVestWI", "bjNXfOLNemcVkeNNHLleqgjpe", "QUgXjWPbeiWnsZWSKTWnmgXos", "bSlunffbjknhMbXcRJJRPSWnY", "UdepfpYJceSgiROmJTIDbhPIX" };
    int threshold = 36;
    int timeToDark = 5823;
    assertEquals(49, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case48() {
    String[] landscape = { "QYkUoReZmgMMgqnkrruTRWcsZ", "lcRYbYYjNUksiignvUkcLSjdp", "hXMjSVVWPRhqkUMiirdgMOfRK", "qQNjVfnlXVrljYOUfTiTPQfUh", "TgscedUUXdnhRgVMTkfjcUfWf", "WSSkXgdLgeeOWmYbohliVTmjm", "NPkcdWUXPiWNTSlobkPRMbkos", "MkdTdZKciUPZjdmXgbQJUdYQG", "QhlkTNbUXXfUgmWXgZPMZUZHR", "ZcniJGRNRhSTNegmUTfbNLGEJ", "WYVdLTLYPeWgnfgmsWVMegjOK", "rYnVJdNORYdkcQdjkkNRmgLOd", "ocojUYTIfPhhRQccVObVYjRQO", "IQenViNLPPVbJjdYkdUVOLQJW", "ERgQoeSgNhQidPcVLSUiibipV", "GZggYmjZcfTnffTfTSebRiVfS", "LXrbhsZLNPNTmQLORIIhceWSd", "gTglUWcXeMVQbJSWkNUSOlXbe", "chciYlhRLJfgdYYQZcReSRehL", "PdOeppmmiWUYopggfhndYgfNc", "egUchWUXYkmWoefQLXRSPMTfV", "UUmrMePbWNJnoTePIiZbMTojd", "QXmfdLQbkfUedZORPggNTXUXX", "OLgZiOXOUPOTQHdTLSLjgoUbZ", "blXsVGBcMidJIlXTLFkPdOobI" };
    int threshold = 32;
    int timeToDark = 6469;
    assertEquals(47, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case49() {
    String[] landscape = { "xesTtFSGvRmWwKpzNCcXXojyf", "yoYjtQUSyGzmchoMjeoMGJJOQ", "wPzXcHsvtXMmglUQHEAZXZkYR", "ywOLALwMEGhCGAjXShgiwngDL", "dZmlqFUJAPLUCVDPqdUtzzaCO", "eiPzUbprjNUUKBLUMJVVQRZAY", "CWVSadOIlAknSxeAxeAubdHyO", "fBcbVXhxndRQczLmiBnQuUAUj", "LiGUGxRSiCsCBBkTtcjMXzxck", "BGOnqUnUJruaMKSoNQiUPLhLm", "HbvkzonsDwtjdiJslFdzCoCSr", "kKgzPMLJPDgmNjNzngyiNkuwr", "bccOlBecJEXQPJQeDmBLXnDpp", "IrSiMNWaMVZexZxVaLkGFsmqc", "VuRvplvQkPjKbIoyPmXSSxwvf", "nPWSOFasyTocrAzmKbLirLXwg", "IuznsiwxsKpqhWhHezZrSpMlm", "PTmtqjKTWvUbQZmXRdJLxUViA", "yhmZKnzkUdiRNOqJKaHQnLBIq", "ZSlepzGuOcLMDovQgQYtLKFFm", "FncOBrhthSiltudMQBDnLDkny", "oDUnmTwUZKAZBBtfspiPzwkSc", "yCAeyKnNwTNhVRSFdyneDxxaV", "NzSqaxLygVwlxEizrsehvdjni", "QYWybckMbKQXSfCBdGBctMIwD" };
    int threshold = 37;
    int timeToDark = 600;
    assertEquals(50, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case50() {
    String[] landscape = { "wiygcCqFbiBTsMZpHuNfsbYGW", "jiAgFuhgykTZnqnLdiNgEuOZS", "IohWTythiNJrnCypuQVSLkbXd", "MZrxxOPCAdnaKFxCbstlUrdHU", "gSXGQINLzyZltcUPWkevVcnJI", "HyhrFuQTTTHRauDbIArGSogiP", "NXVQlBKvBzJqpWCyETbbHIBtp", "krjzxNgtGzvBZuzJXBbfaseNU", "BmSmFagVJhysUZMyMVtyjaYRA", "YkKWfddQIqEJaFZLEvKesIBHM", "rclFhESKAsvSSBoHHnYNYzjCM", "bpcolJCVzKfkGSDTmoSHNMeGY", "YvpGpFYmKKIctXZzXwRxZJBWU", "XsRZqhZttonCZOBHpwiFtSLnY", "deWwHoYBpZmNpGZyZKmEkKMZo", "tdqrQIIahCbTaEFmkIOyxZXMD", "cQlSJPQMmdemOLhlNuSbHeXAS", "VdAEWeVpMhFwRkycXKBWNOMeF", "FqypYPtnUZbdxqwpEfYRAEqnP", "dojaIJNSckQVilbIilISUquaL", "HfsCBZxhrEviANvZaCWhpxKYI", "huYXXzCdKYgMxUeIUDKMlilvs", "fLRGZyMuTqmMXMMmxBYIsgqwk", "AcmtDAYVuiFgCmjjyTKGpNHxq", "tFuzeDsYqnfEtZKUkiFaWiFfb" };
    int threshold = 7;
    int timeToDark = 7552;
    assertEquals(48, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case51() {
    String[] landscape = { "mlIqhIjnhmlOkctxXoOimrXXZ", "gmOmGsnWmhHmjbqvaMdBbbszx", "MJMmRqTuHzdyVALKJiGYxPszZ", "mLGNXYHWBEKISxSuPshdsCDSM", "ZpblMzILtgyOSQfdmPHQmMbGE", "gkvuIqEhQOhvBgVQRdAuCcNrt", "EvuAlHbJyKbVvfIXmaqhTWrdD", "eaEyKGYVghaGqbyTtZNTUeIyV", "grjyCxQoRGrwEErDQaQMTWGXt", "yONNRQJGIphpbEJgUXmHtOTyI", "kxMpABuPaynUezjaxSNErZRuo", "lhIRNglqkFyJqREmofkJSvePx", "tsUBXQslCTKMZfxWWbRXlNlzm", "plrSQyvRUZBLyctZPLdVbfyob", "UUSGMCjTZSZJvYqKUsPsAVOlJ", "zIOiFVyxQgwriaWvijbLXHseH", "aukKVjUPnyjmEkuTANCqPOBww", "AcRIgmppFckKfjZplaueddidy", "IXHLYfpOCZmUirqHLyasQcGxW", "JpundXsyxFlEMVXLwcfMNEJXt", "ZptISMNqENfbvRVfyVFKkixxG", "lJeTMiAhgLfuRBifzzRETHJgZ", "WCrOhxRZtbMKgYIIKuaMPgXAx", "HmkIMBeMMsxPEblMjyxXUldWk", "UJTpPdzgCuqEpVMTaSLxHoeyx" };
    int threshold = 21;
    int timeToDark = 1000;
    assertEquals(44, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case52() {
    String[] landscape = { "PaXKPlQjUDQfrroiQXoqNtwiW", "WmqicHfqIzHQEqsDlgVtptGtU", "GaGYvabBxXheRPueRUrCjRFnY", "NvKbpvKWJtdvugHXbAkYRfdtH", "lNCCRPPqVSpNdEXkOYDubYpnX", "GfOuNanIurUZTWcLnbsBrehuR", "pDNkDZSzDhNBQFRsIesBAHFgC", "teDOefMdAqWsgRJXixzhLoFWU", "eueEDIWpAIsreUEOzYwRgmQer", "lfAGPQKHxUmJUKnDaYvwjSPCI", "ZKPXaolwKgBQYhXghevoHvbch", "ODLeZpnQVCQwIpAzkvmCoGFFr", "qEIVgYwAdptYOIAWWsGrBkJve", "JzUUdxpgTGOugUdYQqyfNvMVB", "FALKlBgTjERkZcSahZlwquaaK", "pHcpPkNxfiALnfiloRCcVFagL", "pmaPCBccOGPPEFtVVLykVMmwN", "CbPPpLyzluiTjRsrHBlbVSJWf", "zMpzdJfmaSKfDgdUlJvuZQkfq", "ErJQzosFzvsbGUwcLkKEJlERf", "lKbUsuLkfAGHrSNCPKbDFdxAb", "UVAlNHhZREUfXvFCPMmPszIVL", "ORlpCcubjwjzuaPVvpVfjQyHf", "vkrmGpBTbznzYFRGUthTefoBm", "DuWlSqvfTrGbbdoZllzeUCttt" };
    int threshold = 6;
    int timeToDark = 6441;
    assertEquals(15, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case53() {
    String[] landscape = { "olkHMhWyYXxywIXfvOsiNfNjE", "cpeNxMiqEamFYdOLIVGtcmNDL", "XtkeWSmcbUWnGAdFYEgeFaxCX", "PcFZGtrWwetQxHtYzcScojyem", "mkzObLMyPgrkwxpCzfTIcWrKu", "qEXeAtuctJeNyDRLRUpRCdvSx", "zjRYswuwALrFImHChLXxwKYiR", "bQSVbcnhGuGQWuAYuqtPoGivP", "JpIomiFIBsauGEUCqRltDJyGr", "THikKmTyVWmUfUygAKRqRcReh", "llVQkBRgSLIayokyCivmHbsEc", "yoFCYXBUCQhVmGMjTjFDQhnkD", "fmlmrJtmmBJUndhZbbeYsefdZ", "bexdBNVkUeWLqvOuMlriqEMUm", "qBMasnadqpmnccGPXtIQJgdfr", "TiwhUNnNwWphABHXyjeGwZEOK", "IuvtviODJqxqbukVZjbkgcpLb", "mqJYmqNyyqWQYmvxJfkhyxILP", "tLhppvnCIvIqISFwFqcOIygZD", "MZcjtOevGVmDIPXkKhsWpOFss", "CTLuCZFNdzjsjftLMmhxbIrGn", "DvTpNXObMTSRtmDjMXpKjsjSB", "dSWCwDCMbaWfrTDkQyEOmFFDi", "ZOeLiiMmrKIUWliXfEYUXWgbu", "yYDtbXgKZjehhHQENnVtxqWPZ" };
    int threshold = 42;
    int timeToDark = 6900;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case54() {
    String[] landscape = { "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAz" };
    int threshold = 52;
    int timeToDark = 120148;
    assertEquals(50, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case55() {
    String[] landscape = { "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAy", "AyAyAyAyAyAyAyAyAyAyAyAyA", "yAyAyAyAyAyAyAyAyAyAyAyAz" };
    int threshold = 52;
    int timeToDark = 120149;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case56() {
    String[] landscape = { "cCs", "UVP" };
    int threshold = 51;
    int timeToDark = 1183;
    assertEquals(44, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case57() {
    String[] landscape = { "AyAAAyAAAyz", "AyAyAyAyAyZ", "AyAyAyAyAyA", "AyAyAyAyAyA", "AAAyAAAyAAA" };
    int threshold = 52;
    int timeToDark = 2600;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case58() {
    String[] landscape = { "AAAAAA", "yyyyyA", "AAAAAA", "Ayyyyy", "AAAAAA", "yyyyyA", "zZAAAA" };
    int threshold = 52;
    int timeToDark = 2600;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case59() {
    String[] landscape = { "AAAAAAAAA", "yyyyyyyyA", "AAAAAAAAA", "Ayyyyyyyy", "AAAAAAAAA", "yyyyyyyyA", "AAAAAAAAA", "Ayyyyyyyy", "AAAAAAAZz" };
    int threshold = 52;
    int timeToDark = 2600;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case60() {
    String[] landscape = { "AyAAAyAAA", "AyAyAyAyA", "AyAyAyAyA", "AyAyAyAyZ", "AAAyAAAyz" };
    int threshold = 52;
    int timeToDark = 2600;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case61() {
    String[] landscape = { "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAaZYXWVUTSRQPONM", "AAAAAAAAAAbaZYXWVUTSRQPOL", "AAAAAAAAAAcbaZYXWVUTSRQPK", "AAAAAAAAAAdcbaZYXWVUTSRQJ", "AAAAAAAAAAedcbaZYXWVUTSRI", "AAAAAAAAAAfedcbaZYXWVUTSH", "AAAAAAAAAAgfedcbaZYXWVUTG", "AAAAAAAAAAhgfedcbaZYXWVUF", "AAAAAAAAAAihgfedcbaZYXWVE", "AAAAAAAAAAjihgfedcbaZYXWD", "AAAAAAAAAAkjihgfedcbaZYXC", "AAAAAAAAAAlkjihgfedcbaZYB", "AAAAAAAAAAmnopqrstuvwxyzA" };
    int threshold = 52;
    int timeToDark = 1000000;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case62() {
    String[] landscape = { "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAabcdefghijklm", "AAAAAAAAAAAAZabcdefghijkN", "AAAAAAAAAAAAYZabcdefghijo", "AAAAAAAAAAAAXYZabcdefghip", "AAAAAAAAAAAAWXYZabcdefghq", "AAAAAAAAAAAAVWXYZabcdefgr", "AAAAAAAAAAAAUVWXYZabcdefs", "AAAAAAAAAAAATUVWXYZabcdet", "AAAAAAAAAAAASTUVWXYZabcdu", "AAAAAAAAAAAARSTUVWXYZabcv", "AAAAAAAAAAAAQRSTUVWXYZabw", "AAAAAAAAAAAAPQRSTUVWXYZax", "AAAAAAAAAAAAOPQRSTUVWXYZy", "AAAAAAAAAAAANOPQRSTUVWXYz", "AAAAAAAAAAAAMLKJIHGFEDCBA" };
    int threshold = 52;
    int timeToDark = 1000000;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case63() {
    String[] landscape = { "aZYWUSRQPONMaZYXWVTRQPONM", "baZXVTSRQPOLbaZYXWUSRQPOL", "cbaYWUTSRQPKcbaZYXVTSRQPK", "dcbZXVUTSRQJdcbaZYWUTSRQJ", "edcaYWVUTSRIedcbaZXVUTSRI", "gfecaYXWVUTGgfedcbZXWVUTG", "hgfdbZYXWVUFhgfedcaYXWVUF", "ihgecaZYXWVEihgfedbZYXWVE", "jihfdbaZYXWDjihgfecaZYXWD", "kjigecbaZYXCkjihgfdbaZYXC", "lkjhfdcbaZYBlkjihgecbaZYB", "mnoqsuvwxyzAmnopqrtvwxyzA", "aZYWUSRQPONMaZYXWVTRQPONM", "baZXVTSRQPOLbaZYXWUSRQPOL", "cbaYWUTSRQPKcbaZYXVTSRQPK", "dcbZXVUTSRQJdcbaZYWUTSRQJ", "edcaYWVUTSRIedcbaZXVUTSRI", "fedbZXWVUTSHfedcbaYWVUTSH", "gfecaYXWVUTGgfedcbZXWVUTG", "hgfdbZYXWVUFhgfedcaYXWVUF", "ihgecaZYXWVEihgfedbZYXWVE", "jihfdbaZYXWDjihgfecaZYXWD", "kjigecbaZYXCkjihgfdbaZYXC", "lkjhfdcbaZYBlkjihgecbaZYB", "mnoqsuvwxyzAmnopqrtvwxyzA" };
    int threshold = 52;
    int timeToDark = 1000000;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case64() {
    String[] landscape = { "TRRVUXefk", "bSNMOWcff", "bRPNNQZip", "XSRUTVcfj", "WbZQPXZbV", "XdYSRWVOP", "feedVVcZR", "XhfdZZefg" };
    int threshold = 4;
    int timeToDark = 50;
    assertEquals(28, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case65() {
    String[] landscape = { "aaaaaaaaaaaaaaaaaaaaaaaab", "dcccccccccccccccccccccccc", "eeeeeeeeeeeeeeeeeeeeeeeef", "hgggggggggggggggggggggggg", "iiiiiiiiiiiiiiiiiiiiiiiij", "lkkkkkkkkkkkkkkkkkkkkkkkk", "mmmmmmmmmmmmmmmmmmmmmmmmn", "poooooooooooooooooooooooo", "qqqqqqqqqqqqqqqqqqqqqqqqr", "tssssssssssssssssssssssss", "uuuuuuuuuuuuuuuuuuuuuuuuv", "xwwwwwwwwwwwwwwwwwwwwwwww", "yyyyyyyyyyyyyyyyyyyyyyyyz", "BAAAAAAAAAAAAAAAAAAAAAAAA", "CCCCCCCCCCCCCCCCCCCCCCCCD", "FEEEEEEEEEEEEEEEEEEEEEEEE", "GGGGGGGGGGGGGGGGGGGGGGGGH", "JIIIIIIIIIIIIIIIIIIIIIIII", "KKKKKKKKKKKKKKKKKKKKKKKKL", "NMMMMMMMMMMMMMMMMMMMMMMMM", "OOOOOOOOOOOOOOOOOOOOOOOOP", "RQQQQQQQQQQQQQQQQQQQQQQQQ", "SSSSSSSSSSSSSSSSSSSSSSSST", "VUUUUUUUUUUUUUUUUUUUUUUUU", "WWWWWWWWWWWWWWWWWWWWWWWWX" };
    int threshold = 1;
    int timeToDark = 647;
    assertEquals(50, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case66() {
    String[] landscape = { "BCDE", "AJKF", "AIHG", "AAAA", "AOMK", "AQSI", "ACEG" };
    int threshold = 5;
    int timeToDark = 14;
    assertEquals(10, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case67() {
    String[] landscape = { "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "zyxzyzaethzyxzyzaethplabc", "abcdefghijklmnopqrstuvabc" };
    int threshold = 32;
    int timeToDark = 256;
    assertEquals(51, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

  @Test
  public void case68() {
    String[] landscape = { "AAAD" };
    int threshold = 3;
    int timeToDark = 100;
    assertEquals(3, hillwalker.highestPoint(landscape, threshold, timeToDark));
  }

}
