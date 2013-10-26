package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MafiaTest {
  Mafia mafia = new Mafia();

  @Test
  public void case1() {
    int[] guilt = { 500, 500, 500, 500 };
    String[] responses = { "ADCb", "bADC", "CbAD", "DCbA" };
    int playerIndex = 1;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case2() {
    int[] guilt = { 500, 500, 500, 500, 501 };
    String[] responses = { "ADCbE", "bADCE", "CbADE", "DCbAE", "EDCbA" };
    int playerIndex = 1;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case3() {
    int[] guilt = { 500, 500, 500, 500, 500, 500 };
    String[] responses = { "cccccc", "BBBBBB", "dddddd", "FFFFFF", "GGGGGG", "hhhhhh" };
    int playerIndex = 0;
    assertEquals(1, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case4() {
    int[] guilt = { 501, 499, 499, 499 };
    String[] responses = { "ABCD", "zfAg", "ESAS", "atsm" };
    int playerIndex = 0;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case5() {
    int[] guilt = { 800 };
    String[] responses = { "E" };
    int playerIndex = 0;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case6() {
    int[] guilt = { 643, 457, 642, 710, 595, 631, 566, 634 };
    String[] responses = { "APOSIfjf", "ewFOJWeJ", "jElLLoSS", "GeOSSmff", "zWSTsOuu", "fmfOPPsa", "MSoPPWXn", "FeojwFAM" };
    int playerIndex = 5;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case7() {
    int[] guilt = { 643, 457, 642, 710, 595, 631, 566, 635 };
    String[] responses = { "APOSIfjf", "ewFOJWeJ", "jElLLoSS", "GeOSSmff", "zWSTsOuu", "fmfOPPsa", "MSoPPWXn", "FeojwFAM" };
    int playerIndex = 5;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case8() {
    int[] guilt = { 547, 393, 781, 790, 416, 765, 705 };
    String[] responses = { "eBwTTIm", "PYPwjcJ", "fEeJYNe", "KzaxVFU", "rjUckkx", "EOWvFjh", "AZvbtdd" };
    int playerIndex = 1;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case9() {
    int[] guilt = { 554, 460, 715, 702, 761, 670 };
    String[] responses = { "SarsvS", "NhIizk", "WVBxrB", "ZLYXVL", "EjgycP", "LmRslJ" };
    int playerIndex = 1;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case10() {
    int[] guilt = { 356 };
    String[] responses = { "l" };
    int playerIndex = 0;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case11() {
    int[] guilt = { 751 };
    String[] responses = { "Z" };
    int playerIndex = 0;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case12() {
    int[] guilt = { 428, 790, 450 };
    String[] responses = { "mRb", "vGn", "aeV" };
    int playerIndex = 2;
    assertEquals(1, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case13() {
    int[] guilt = { 627, 529, 733, 356, 600, 330, 405 };
    String[] responses = { "ZuUkYDJ", "krAoSLI", "yOFKbhV", "QllkKHB", "kHEkJIL", "vvAynMC", "LbBxiLD" };
    int playerIndex = 1;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case14() {
    int[] guilt = { 750, 606, 637, 419, 329, 486, 488, 601, 446 };
    String[] responses = { "ZfgGKNVet", "kpaKsOXWV", "YyWqHcVqc", "oCXvgBjTP", "vMqYxVAhT", "WBVDRINRF", "CYmluNwBu", "JhyLxLwWa", "lXgMajIyZ" };
    int playerIndex = 8;
    assertEquals(4, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case15() {
    int[] guilt = { 683, 746, 534, 670, 499, 436, 605, 459, 756, 542, 357, 670, 324, 645 };
    String[] responses = { "iXIfpiSVyjgbiE", "ouImHKfHiKHBhO", "ZZLIBWvNrAofeN", "gNkVsMdboieNCX", "JHHDCvXXTjyusA", "jeRMgPsXPoCfbV", "dhRdfNPgHWPNqC", "UjwwKZRaFClgTF", "pqQkIFfqVmvPWH", "xPBKIpEQUJUjxN", "XgxNZvAdGfuSoY", "xYmpNlhqCOoILQ", "xOXaxUYizVTlue", "vFmhaqVjhVsoPv" };
    int playerIndex = 9;
    assertEquals(7, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case16() {
    int[] guilt = { 660 };
    String[] responses = { "r" };
    int playerIndex = 0;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case17() {
    int[] guilt = { 366, 314, 377, 494, 780, 734, 763, 571, 410, 795, 640, 318, 531, 638, 662 };
    String[] responses = { "siweefbDkmhWknV", "VsomDfjvXfQjJDc", "wpEmPpIGuEwJpWz", "xEQFmTmIsblEmhL", "klJuTbYPkOhpwts", "DvqaSAlVPGoWQqi", "rXxrGmrffvLOdKi", "spLGkVMnVphOzZj", "jPMTXbylHFgIzYI", "DEWMEkvOaRWOecv", "bfZDCyMerxeonXK", "KztPyHtOYakHGqK", "kMWxDGTOwQUFSGU", "RDzVnpFfPfAnYJw", "hGOtXcMdEnkgeqB" };
    int playerIndex = 8;
    assertEquals(7, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case18() {
    int[] guilt = { 329, 582, 521, 389, 358, 676, 561, 793, 348, 310, 566, 699, 301, 594, 515, 723 };
    String[] responses = { "oeBdfwhLuNyBrnkd", "YOJBPgZqTJYzIRKh", "LWDfrkSWgfoycweU", "vqdfpHHurxgmCFCc", "QCXPKTBXhKBbyVOu", "BdYawCkvBuqoLtBE", "VPbYkFksBBNADbco", "zivzpIwWQyVYFLAH", "SNxQKqbkuZFlSIxF", "OrbuxZIPYJRisicb", "nORWuhtFPeyoiFEX", "WSaXPjJuYgekLyBN", "UnheqJNctkydBnSI", "DvyQVLbjqafFlhpq", "uUGAPmLSbyRQUeUp", "KSenbwyGywlnooOw" };
    int playerIndex = 9;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case19() {
    int[] guilt = { 640, 446, 434, 446, 750, 760 };
    String[] responses = { "ULnTvp", "tcjIbD", "YjAWKI", "aRSWcF", "uufCoO", "POxhCL" };
    int playerIndex = 0;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case20() {
    int[] guilt = { 403, 779, 725, 301 };
    String[] responses = { "lqXO", "CvTl", "MStm", "DKEL" };
    int playerIndex = 2;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case21() {
    int[] guilt = { 503, 551, 323 };
    String[] responses = { "GBO", "LRg", "Qsy" };
    int playerIndex = 0;
    assertEquals(1, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case22() {
    int[] guilt = { 777, 440, 385, 364, 497, 475 };
    String[] responses = { "fqSvLz", "ZdyWaq", "FaiJgk", "WIUUjz", "mpUszn", "EXzPln" };
    int playerIndex = 5;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case23() {
    int[] guilt = { 671, 456, 724 };
    String[] responses = { "teB", "FGZ", "abc" };
    int playerIndex = 0;
    assertEquals(1, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case24() {
    int[] guilt = { 403, 320, 592, 369, 498, 443, 518 };
    String[] responses = { "pXcVGEC", "XEApDeG", "wgWUihL", "zrAayUv", "uelDQSe", "WEKrofH", "hrmsqIg" };
    int playerIndex = 4;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case25() {
    int[] guilt = { 515, 393, 529, 395, 425, 649, 590, 517, 753, 553, 334 };
    String[] responses = { "mqRAdbHULUN", "yjTIpouwruN", "OTCzQjxzwGA", "EiNLcHshYbp", "lJrjsMDRSSu", "UbRXquWFHDx", "hYvJjKQpYDh", "RLAsoHgljYE", "KfsXVfdgXfZ", "wLIXpgdNuzO", "pEebffRiiEm" };
    int playerIndex = 10;
    assertEquals(5, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case26() {
    int[] guilt = { 580, 778, 473, 774, 608, 434, 592, 739, 503, 371, 421, 406, 389 };
    String[] responses = { "PZgLUnZyZLFVF", "RzxLGkNYUqQKu", "qaFZaTyTxQBeT", "UpdhoulbGzben", "wJXEQaOjDvhUj", "QmAZoLucyRRbT", "CRkNYjhbIqtRN", "qBNFfKaOpVxJg", "DatAsZaggcYRM", "afVFWGFprGiiR", "JjaRaGORLWGQb", "MRhVwjyHFCdOR", "MsXOKAlGtaebH" };
    int playerIndex = 4;
    assertEquals(5, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case27() {
    int[] guilt = { 685, 357, 417, 570, 335 };
    String[] responses = { "yrIme", "kwCxZ", "esttA", "WDVDo", "nxcPP" };
    int playerIndex = 4;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case28() {
    int[] guilt = { 475 };
    String[] responses = { "m" };
    int playerIndex = 0;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case29() {
    int[] guilt = { 693, 683, 734, 572, 411, 793, 397, 577, 702, 376 };
    String[] responses = { "QeBQlAEKkn", "RYxvSkIAMx", "EgmuUKlmpQ", "kUAoRfbtXL", "lrYcteVnKh", "rZhGtnURRk", "iKcWMxabDf", "RjfCEeeUDP", "SaSloHYDtn", "uYUNNOwhmu" };
    int playerIndex = 9;
    assertEquals(5, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case30() {
    int[] guilt = { 432, 442, 401, 664, 388, 325, 423, 462, 729, 444, 523, 359 };
    String[] responses = { "qQjPRJwZcdNl", "tLJiSPsYsLFz", "gbLuTPTNIFOR", "npWiAIiVhoNV", "DDcTklmJpuhZ", "BhHfPyazLeTS", "ROqvVSKEoqlt", "MUyEQwSwXUCd", "kRcQUXzACelB", "GnPQdqdjxybn", "ZDJHcIcESjfp", "IzfquYipHOYs" };
    int playerIndex = 1;
    assertEquals(6, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case31() {
    int[] guilt = { 686, 605, 793 };
    String[] responses = { "DQv", "LNj", "pSs" };
    int playerIndex = 0;
    assertEquals(1, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case32() {
    int[] guilt = { 569, 570, 528, 480, 420 };
    String[] responses = { "lNxwA", "Bepsl", "EzQon", "zsKkP", "tRjuS" };
    int playerIndex = 4;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case33() {
    int[] guilt = { 319, 580, 676, 349, 633 };
    String[] responses = { "MxyPc", "WYwDH", "bqKOD", "PQCgj", "jeWxZ" };
    int playerIndex = 2;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case34() {
    int[] guilt = { 798, 793, 759, 630, 581, 694, 472, 568, 696, 470, 779, 313, 326, 597, 686, 332 };
    String[] responses = { "NIWLRRCurjiAkypT", "miezcEvtIZbacBAr", "iZEYtcSgFNAuDmyA", "ffYGwlMfiswRgBrx", "VUVuTRErXEzncGYG", "vhkApWknabllOXwn", "iPDMefAZfqsDcFZH", "EFTucXrRQHWBkxwR", "gzOwYzbEXqbyalHd", "IjJBVHCaMJdmOHFV", "ZOjKNfElRdwlqNxG", "uJmCNGSHbWMMiynu", "pdrNMsyVnofZmpLh", "RmuvkDjeknFQyWyl", "jCmtQMKGkpKUZvXL", "MbubuwtTjbDBQWtF" };
    int playerIndex = 2;
    assertEquals(5, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case35() {
    int[] guilt = { 478, 588, 669, 759, 345, 794, 516, 342, 654, 306, 332, 465, 554, 633, 387 };
    String[] responses = { "puPwxDPDTxZbmNP", "IvRHZHFLHponuGj", "SlilWnFUTYiCZrF", "inrwBKoLVzqTOFp", "YdGZhCyFmOJPgPE", "nDLvXowZGLcPKwa", "AARTailcpUqyvbQ", "WxVKbiGfumrSZyl", "szfxJIdHRqgmheA", "yrxiISymwdVdKXS", "NhJTEnBVOrpKQCs", "QbnoDBIUOtdPpsn", "EwiTgqCMTstabXP", "HhxEUNPNNDpVvry", "CNLaNLWPsRDhIBR" };
    int playerIndex = 1;
    assertEquals(7, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case36() {
    int[] guilt = { 740, 561, 575, 456 };
    String[] responses = { "NcCP", "HBTO", "LrqH", "GSUd" };
    int playerIndex = 3;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case37() {
    int[] guilt = { 399, 575, 775, 310, 460, 625, 705, 689 };
    String[] responses = { "hgjuHsSO", "CTmdTTzF", "MfuMUERj", "SihrSetp", "acFDkWBb", "HEfJiFdB", "KnOzDigq", "OVRbCUcp" };
    int playerIndex = 6;
    assertEquals(4, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case38() {
    int[] guilt = { 346, 342, 695, 557, 559, 605, 379, 759, 392, 594, 553, 674, 695 };
    String[] responses = { "tAzOTjADWSzoc", "sfhKMgIiHpQfz", "pZpDsPxbDMGah", "rdpWfhKdOWFXa", "flWOVqHVXvGCZ", "ssmtyxfulygxQ", "EOGcoDQocbKHr", "yBoVTIvxAOEJF", "xcrSlIkdMtRCr", "YBGKvGpOfTzaC", "JYjPiuZYYnbTC", "rOKOasChMuMEp", "sPyCiXIqlzimf" };
    int playerIndex = 12;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case39() {
    int[] guilt = { 624, 593, 349, 307, 749, 464, 735, 563, 311, 530, 705, 345, 513, 352, 724 };
    String[] responses = { "fQxZqRmUtdrMveb", "AhdcbzMqQRTFrsE", "nhVYTdjwOGyJvgj", "lEFisazNnEJSUxa", "wdmjewNanrmOMGn", "oTDxzSDykRWSiFC", "yzXBVmvPUvyjCqR", "fAPwBgUFDCIwujJ", "khpktOtHGpcgicB", "ouJUHgLQkOtlZjP", "KuvnJqSujwJQrtD", "kgDNUqMLRcexTGX", "pwzACqPgRdFDYmI", "RSUjFBoUjyYUhxD", "pORHAKQtcqsrJGo" };
    int playerIndex = 3;
    assertEquals(7, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case40() {
    int[] guilt = { 569, 554, 494, 526, 670, 552, 479, 515, 313, 545, 677, 303 };
    String[] responses = { "vusviBhVLqpB", "EAgKUeqxhtSs", "yrXYFROybgPk", "LGUofpjIocRR", "apxWdNzsCpft", "ZoOzvpwqVFhf", "jmlDQKzBihAR", "LqkmbNdrdzwz", "GkVsZnYpWPFR", "yIeudjTKXyTL", "VqgUNeJXWzvN", "VpJlzJNbohAA" };
    int playerIndex = 0;
    assertEquals(5, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case41() {
    int[] guilt = { 704, 537, 538, 692, 668, 537, 626 };
    String[] responses = { "iGHkxBo", "DJxDemk", "sBzYCvo", "QiIOCWQ", "FhIVfYd", "LqjCwoA", "wfGwznA" };
    int playerIndex = 4;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case42() {
    int[] guilt = { 487, 727 };
    String[] responses = { "SP", "XR" };
    int playerIndex = 1;
    assertEquals(1, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case43() {
    int[] guilt = { 377, 407, 498, 310, 677, 652, 608, 670, 498, 381, 611, 429, 625, 421, 600, 375 };
    String[] responses = { "ErXwBQbwYrCLlkIZ", "iwFMNjkwQXNEdQFM", "FnXHESthgwCmecKD", "LJzaMemIiPXSvRzo", "cfsPRwRcurtKzpqy", "KrglEEjgwPZRmlCm", "uwpCNhEcnLjWYZSw", "KHYrCkouwvXpFhuR", "aQWxmGUZvxjZWnau", "VKVUznxSgHUVSiKH", "eNLtlRvEidNTzAPV", "FOmSHFYNnVvztjVs", "qioUYcujJNnGYuMZ", "gFlMjKBARhmzzWdl", "JdpsDUJiXKjtaxTq", "DHoJDDyjnDXLVOwv" };
    int playerIndex = 2;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case44() {
    int[] guilt = { 525, 352, 734, 518, 775, 562, 483, 318, 511, 492, 316, 495, 458, 332, 615 };
    String[] responses = { "vOTKXjfoASVTYMY", "dafDJeNUhFFxCMm", "ZqtFAeGyLzjhstg", "dHankeHLTdLbNQK", "gRnJozhyQOkXWzD", "VTfhIVcMvNCVctC", "CqurLZFllcCPQkz", "qKNqzeelCLzZzyK", "WFHfCHAnEHgDbAq", "LNDtcMLsuLIkuPv", "WBiFzdcuDvjjvNO", "EslhbLDMMSGifnz", "zsxZrCcKLSCmNir", "kUAxdNzByHeKLMS", "canczUTMBqkHBBA" };
    int playerIndex = 14;
    assertEquals(6, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case45() {
    int[] guilt = { 486, 692, 456, 724, 408, 546, 565, 532, 337, 659, 307, 799, 763, 371, 493, 644 };
    String[] responses = { "hTGRGMbhGnMiJLQa", "eZIijWnYeVzAFvcd", "zNUJBpUWQpholgAJ", "mzdCwJTDthLEAFBV", "cLhwAdEecxwdBTqv", "QtNldYlzDnqzmmUS", "nfCmZUgFFHYwozqK", "sXJHLIMbOfYGOEHD", "qrrcKoPbFInVVDHB", "ImblLGBRKONxKkvG", "hMQCUaUqqOPUypvU", "geUEoWTjORaAgLdI", "lVCJqFeCiFucSWmW", "jZahVLAmCkQExDlX", "zKShmVzrrUgGOrCI", "eVmvBeUFfNBcasNP" };
    int playerIndex = 4;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case46() {
    int[] guilt = { 407, 327, 355, 469, 622, 313 };
    String[] responses = { "JEMmJG", "nYaPBc", "xGbTit", "egIVlC", "RRWWVt", "MArNrV" };
    int playerIndex = 1;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case47() {
    int[] guilt = { 586, 394, 427, 713, 419, 693, 707, 641 };
    String[] responses = { "FLGrKOes", "QMUJtdNW", "GpcQBrdi", "xcTtYRUC", "Ephbcquo", "mLfifhbq", "oqrfzOjR", "IcXFyybx" };
    int playerIndex = 3;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case48() {
    int[] guilt = { 300, 300, 300, 700, 700, 700 };
    String[] responses = { "fgfaZZ", "fgfZZa", "fgfZaZ", "aaaZaa", "zzzZzz", "zzzZzz" };
    int playerIndex = 4;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case49() {
    int[] guilt = { 300, 300, 300, 300, 300, 300 };
    String[] responses = { "ZZaZzz", "ZZaZZZ", "ZZaaAA", "eeeeee", "ffffff", "gggggg" };
    int playerIndex = 3;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case50() {
    int[] guilt = { 800, 800, 800, 800, 800, 800, 800, 800 };
    String[] responses = { "zzzzzzzZ", "zzzzzzzZ", "aaaaaZZa", "aaaaaaZZ", "aaaaaZaZ", "zzzzzzzZ", "zzzzzzzZ", "aaaaaaZZ" };
    int playerIndex = 7;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case51() {
    int[] guilt = { 800, 800, 800, 800, 800, 800, 800, 800 };
    String[] responses = { "ZZaZzzzD", "aZZGzYzz", "ZaZZzzzz", "eeeeeeee", "eeeeeeee", "eeeeeeee", "eeeeeeee", "eeeeeeee" };
    int playerIndex = 3;
    assertEquals(4, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case52() {
    int[] guilt = { 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800 };
    String[] responses = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    int playerIndex = 7;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case53() {
    int[] guilt = { 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800 };
    String[] responses = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    int playerIndex = 6;
    assertEquals(7, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case54() {
    int[] guilt = { 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800 };
    String[] responses = { "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "zzzzzzzYAAAAAAAA", "zzzzzzYCAAAAAAAA", "zzzzzZACAAAAAAAA", "zzzzZAACAAAAAAAA", "zzzZAAACAAAAAAAA", "zzZAAAACAAAAAAAA", "zZAAAAACAAAAAAAA", "AAAAAAAAAAAAAAAA" };
    int playerIndex = 7;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case55() {
    int[] guilt = { 643, 457, 642, 710, 595, 631, 566, 634 };
    String[] responses = { "APOSIfjf", "ewFOJWeJ", "jElLLoSS", "GeOSSmff", "zWSTsOuu", "fmfOPPsa", "MSoPPWXn", "FeojwFAM" };
    int playerIndex = 5;
    assertEquals(3, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case56() {
    int[] guilt = { 800 };
    String[] responses = { "E" };
    int playerIndex = 0;
    assertEquals(0, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case57() {
    int[] guilt = { 399, 399, 399, 399, 399, 399, 399, 399, 399, 399, 399, 399, 399, 399, 399, 399 };
    String[] responses = { "AaBbCcDdEeFfGgHh", "ZzXxVvDdFfGgHhYy", "RrTtHhUuJjIiOoPp", "kKuUiIlLfFnNdDeE", "AaBbCcDdEeFfGgHh", "ZzXxVvDdFfGgHhYy", "RrTtHhUuJjIiOoPp", "kKuUiIlLfFnNdDeE", "AaBbCcDdEeFfGgHh", "ZzXxVvDdFfGgHhYy", "RrTtHhUuJjIiOoPp", "kKuUiIlLfFnNdDeE", "AaBbCcDdEeFfGgHh", "ZzXxVvDdFfGgHhYy", "RrTtHhUuJjIiOoPp", "kKuUiIlLfFnNdDeE" };
    int playerIndex = 1;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case58() {
    int[] guilt = { 643, 457, 642, 710, 595, 631, 566, 634, 643, 457, 642, 710, 596, 631, 566, 632 };
    String[] responses = { "APOSASKjklsawIoA", "APOSASKjklsawIoA", "AbsakluauiyqwAQu", "mdkslajkalwAKJsH", "ASsamdnjkaHKJAhQ", "fmfOPPsafmfOPPsa", "MSoPPWXnMSoPPWXn", "FeojwFAMFeojwFAM", "APOSIfjfAPOSIfjf", "ewFOJWeJewFOJWeJ", "jElLLoSSjElLLoSS", "GeOSSmffGeOSSmff", "zWSTsOuuzWSTsOuu", "fmfTPPsafmfOPPsa", "MSoQPWXnMSoPPWXn", "FeoSwFsaFeojwFAM" };
    int playerIndex = 5;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case59() {
    int[] guilt = { 642, 710, 595, 631, 566, 634, 457, 642, 710, 595, 631, 467, 563, 666, 555, 456 };
    String[] responses = { "aposLFJFaposLFJF", "EWfojwEjaposLFJF", "JeillOssaposLFJF", "ZwstsOUUaposLFJF", "fmfoppSAaposLFJF", "msOPPWXnaposLFJF", "fEOJwFamaposLFJF", "gEosswffaposLFJF", "ZwstsOUUaposLFJF", "fmfoppSAaposLFJF", "msOPPWXnaposLFJF", "fEOJwFamaposLFJF", "aposLFJFaposLFJF", "EWfojwEjaposLFJF", "JeillOssaposLFJF", "gEosswffaposLFJF" };
    int playerIndex = 4;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case60() {
    int[] guilt = { 501, 499, 499, 499 };
    String[] responses = { "ABCD", "zfAg", "ESAS", "atsm" };
    int playerIndex = 0;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case61() {
    int[] guilt = { 300, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800, 800 };
    String[] responses = { "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ", "zZZZZZZZZZZZZZZZ" };
    int playerIndex = 0;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case62() {
    int[] guilt = { 400, 300, 800, 341, 398, 678, 734, 398, 543, 333, 763, 333, 444, 555, 666, 543 };
    String[] responses = { "ADCbLLLLLLLLLLLL", "bADCLLLLLLLLLLLL", "CbADLLLLLLLLLLLL", "DCbALLLLLLLLLLLL", "kacdLLLLLLLLLLLL", "AEDFLLLLLLLLLLLL", "DFDFLLLLLLLLLLLL", "QWERLLLLLLLLLLLL", "DFDDLLLLLLLLLLLL", "CVBNLLLLLLLLLLLL", "IOERLLLLLLLLLLLL", "POIULLLLLLLLLLLL", "FGJKLLLLLLLLLLLL", "LKASLLLLLLLLLLLL", "FDFDLLLLLLLLLLLL", "ASaaLLLLLLLLLLLL" };
    int playerIndex = 7;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case63() {
    int[] guilt = { 300, 400, 500, 600, 700, 800, 301, 302, 303, 304, 302, 401, 304, 400, 312, 333 };
    String[] responses = { "aNgUlDliDyemxpgD", "aNgUlDliDyemxpgD", "aguguDliDyemxpgD", "aNgUlDliDyqexpgD", "aguUlDliDyemxfgD", "aNgUlDliDlllxpgD", "aNgUlDliDyedxpgD", "LPLUlSliDyemxpgD", "aNgUlDliDyemxpgD", "aNgUlDliDyFmxpgD", "aNgUlDliDyemxpgD", "aNgUlDliDyemxpgD", "TTttlDliDyemxpgD", "aNgUlKlopyelxpgD", "alkRTggiDyemxpgD", "wNgUlDliDyemcpgD" };
    int playerIndex = 7;
    assertEquals(8, mafia.play(guilt, responses, playerIndex));
  }

  @Test
  public void case64() {
    int[] guilt = { 500, 500, 500, 500 };
    String[] responses = { "Aaaa", "aAAA", "aaaA", "AAaa" };
    int playerIndex = 1;
    assertEquals(2, mafia.play(guilt, responses, playerIndex));
  }

}
