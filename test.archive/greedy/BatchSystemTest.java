package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class BatchSystemTest {
  BatchSystem batchsystem = new BatchSystem();

  @Test
  public void case1() {
    int[] duration = { 400, 100, 100, 100 };
    String[] user = { "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor" };
    assertArrayEquals(new int[] { 3, 1, 2, 0 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case2() {
    int[] duration = { 200, 200, 200 };
    String[] user = { "Gil", "Sarah", "Warrick" };
    assertArrayEquals(new int[] { 0, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case3() {
    int[] duration = { 100, 200, 50 };
    String[] user = { "Horatio Caine", "horatio caine", "YEAAAAAAH" };
    assertArrayEquals(new int[] { 2, 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case4() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1, 2, 3 };
    String[] user = { "X", "X", "X", "X", "Y", "Y", "Y" };
    assertArrayEquals(new int[] { 4, 5, 6, 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case5() {
    int[] duration = { 4, 4, 4, 4, 5, 5, 5, 5, 3, 3, 3, 3, 3 };
    String[] user = { "X", "x", "X", "x", "X", "x", "X", "x", "X", "x", "X", "x", "X" };
    assertArrayEquals(new int[] { 1, 3, 5, 7, 9, 11, 0, 2, 4, 6, 8, 10, 12 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case6() {
    int[] duration = { 409266933, 334294512, 374858518, 334294512, 334294512, 334294512, 897422581, 334294512, 897422581, 334294512, 410796098, 767293783, 769374442, 897422581, 199564812, 451915392, 897422581, 897422581, 769374442, 334294512, 334294512, 769374442, 334294512, 897422581, 46657114, 897422581, 119380066, 897422581, 897422581, 897422581, 769374442, 769374442, 275135858, 191207668, 2080659, 287637398, 897422581, 769374442, 334294512, 697857769, 168899841, 897422581, 334294512, 897422581, 897422581, 34711091, 334294512, 769374442, 897422581 };
    String[] user = { "wyAkOxGQVFqUOENESdgwkEloXm", "hopKfGIsTfkWSQlJnTOEKpFiGcHdkZnsrpwnZg", "srKzHSQEdMyZDrIgaURKtqkXwfv fGhfPXTWgA", "lsCicxwEHLcHAyPz", "SKDZtw mHqb", "WkCgjdesWPJawJLyWtbVxigARaqVjqyfhiuae", "vOMQfTpIDEJxyGFDqbKBkGWgWUXcwAGuLryxNFo", "kfGjOBQtkQ", "vzYewEESoRyzOWfyfCffjLONWnKk", "AKpBVFMjMNkBPVqRheQRTAKwOWDQgpOR", "Kxm", "zEtDZGewxWhqrRnCkbEzLkrrDe", "SdzpcUvvUcyKKK", "fZmaORPpaCBXk", "hdIWPeANoqqkc", "Kxm", "rCjxOq", "fFKkIyoJWhlejGbphDa", "vavQwWDMWdeuJRrymeJ", "AYqPM", "nNHai", "YPAMJTbWZtOAZaDPvUjHdszpxB", "KtNBGzNENDotaAgXrAdBPWUzsrEMbfdNQgfDp", "buzueMagGxnoTSvGzxxornbahz", "DqGbaLz", "HrcPpBjaHufENhpawkRQjMqKXQjQyPqdFOdunDNHWuCnzPznm", "srKzHSQEdMyZDrIgaURKtqkXwfv fGhfPXTWgA", "QfLTxkAQHtEqzmpWKaOryJyEGywd", "JuSxcxtgOvtbIrBPvfxdrdIyhpohleShYNxzOwkQmCJ", "hxnD", "pIbvyycYmeDEeiI", "JLUeyevSAjSExvMpSz", "srKzHSQEdMyZDrIgaURKtqkXwfv fGhfPXTWgA", "wyAkOxGQVFqUOENESdgwkEloXm", "zEtDZGewxWhqrRnCkbEzLkrrDe", "DqGbaLz", "fyiwhgMGvYTajW", "ydfRrNZVNrGBrWvrgbxfJaLzjpdnZzwdhpYhYKHCjBJfwSHPMD", "oZoabkvHdqZhppviohpfoaTXKK", "hdIWPeANoqqkc", "wyAkOxGQVFqUOENESdgwkEloXm", "LDKIyahAGMZSsOkqQeJdEPnPNfHcxxkvlAZDFcyIkEoFhBZo", "DHiQZcWvBzYfKEYCALrPhzBHdvKSxAgewzIFOdc", "ULDaYylvFdKzQpLEMKWLmkadNhysGvWohkbwZrIZlhNEbMtgUC", "MKjHu", "Kxm", "sBHTcctuoiYYorjGcRbHfjFrJWCDBClOMZiFdg", "VnGEodS viFKvu", "KkxFwrmZKC" };
    assertArrayEquals(new int[] { 1, 3, 4, 5, 7, 9, 19, 20, 22, 24, 35, 38, 42, 46, 0, 33, 40, 2, 26, 32, 11, 34, 12, 18, 21, 30, 31, 37, 47, 6, 8, 10, 15, 45, 13, 14, 39, 16, 17, 23, 25, 27, 28, 29, 36, 41, 43, 44, 48 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case7() {
    int[] duration = { 42863029, 53617987, 24970877, 77828097, 51242, 55488287, 73174032, 28915543, 15040792, 8564629, 126792019, 45755106, 5574621, 34144659, 6808793, 65263189, 12446121, 126792019, 54239800, 14708377, 14322709, 77261063, 183031197, 78906834, 60701818, 12136954, 35933873, 80535700 };
    String[] user = { "NpkqAVxmmBTG", "qStmLcbnwszsWZHlRvHQWNfgTpSMoAum", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "NpkqAVxmmBTG", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "qStmLcbnwszsWZHlRvHQWNfgTpSMoAum", "nFCmErdwLoOlMboKzYUpVk", "nFCmErdwLoOlMboKzYUpVk", "uRcQ APlZwDtUSTaX", "DCQWnZjdLlyQXztQdXV", "NpkqAVxmmBTG", "nFCmErdwLoOlMboKzYUpVk", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "uRcQ APlZwDtUSTaX", "uRcQ APlZwDtUSTaX", "lOTlDHrMelXxAWGNId", "X", "RXptLFPnszhbJluuKmTLjmmwrPQWjCD tSgGYfGaia", "NpkqAVxmmBTG", "NpkqAVxmmBTG", "nFCmErdwLoOlMboKzYUpVk", "lOTlDHrMelXxAWGNId", "uRcQ APlZwDtUSTaX", "RXptLFPnszhbJluuKmTLjmmwrPQWjCD tSgGYfGaia", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "uRcQ APlZwDtUSTaX", "RXptLFPnszhbJluuKmTLjmmwrPQWjCD tSgGYfGaia" };
    assertArrayEquals(new int[] { 1, 6, 2, 4, 5, 13, 25, 7, 8, 12, 21, 10, 17, 0, 3, 11, 19, 20, 9, 14, 15, 23, 26, 16, 22, 18, 24, 27 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case8() {
    int[] duration = { 441825673, 244918056, 441825673, 405717035, 424519077, 424519077, 441825673, 424519077, 424519077, 424519077, 424519077, 179601021, 441825673, 424519077, 349512799, 424519077, 75006278, 424519077, 424519077, 424519077, 424519077, 405717035, 424519077, 441825673, 424519077, 441825673, 137940649, 424519077, 441825673, 441825673, 424519077, 156468505, 405717035, 405717035, 268050572, 424519077, 286578428, 406674754, 424519077, 424519077, 441825673, 424519077, 405717035, 405717035, 441825673 };
    String[] user = { "kEbNgRoaYpPjrkYBRExChbwRyW", "KiYjsWZdaXqdllKLhcnCaqrLyuRc", "nBWHCOwC", "VCogrbGwiuLbDjcwDsEkQSNiymFSSD", "NMjMcVFBuMMbLQwaIwayKiHaOhHZyxKylzrCllL", "ydeeu vhnVgTRkUNGLiANhUeLrLQUGQE", "pXagXUUYxVNimyNwXpOUdfiHfEWTUIbiJBeQdwGuvtZeTmbIH", "AdiSdWuMTrSVHWoTnyZxkqXHg", "MrPOTbPsCAOlqDudBem", "adHIKyNAUoFvtXOaFvMeMGRRAcGWKntslBtnGbBgNletp", "GCqlsvfxxNeTggXtEd", "KiYjsWZdaXqdllKLhcnCaqrLyuRc", "JcVSfHQSwvygJZCECixeSAWfG mC", "qCyIyvSbGKbzqHdhSgPGUcamyfUTnTisUQtYrOecymlIlnN", "PBQwxgo LghRxff", "PVEsDF", "PBQwxgo LghRxff", "gMKrhjKuro", "SYL c", "vWUGOBziaVYmWTeTBIZczprEzfkc", "sBDcKXoM", "aEQgwOPbFHabSEcegcHufTWkLx AUZBzSD", "TQmdbrocqrpkQYkpcewXZZAE", "PJzSvQHHDGAeZPkCEgQNUgdGmaoKPjHrwgfAoPL", "ICQLiFRLNVNhpLQpxjwujqhXRWSGDCymveoVcXh", "QZMytDECxiOdXaIXlKPsDDnFBDfhFTXLoMVzVvlQj", "bhaXxbcNUQBIALtirFReeQYlfy", "CAoXBiltRqxTCajgZdbFXQpdaLTrIigujiFipoDmFlmqxdlNa", "ZBxJsIwygKTrHTxTqccZmCx", "pITWZBGDP", "uIwyLgxgWkKUyyKXkYikZDNFMQqCVlbMQQgSmlIDcLTxFdXqZ", "H nGkVqSuqohSvHrue", "GGrkNawdolKtaDykzSkVSgCNhTfLQtQZNUnlbEwkvyvd", "oGSoaYGReugFyqZPbYISZjzEmWjoycXGSSTYaPjinyVS", "H nGkVqSuqohSvHrue", "TgbcrnUqSIzYpIwXGHEILiLEhiFDdWzQuLbjexgTxvnEpxZ", "bhaXxbcNUQBIALtirFReeQYlfy", "cfUISNgvIeciLCCDeUBqqVZUdeHboKgTWyeeUFGDw", "rBHDqvGnHTuNjvAlwSBUBTvupENLlt", "qrXUilrbBOpSRPENCCufG", "mkLVDzWXZTOnZEfvBEo", "kDotewskIhkyZYbwpGOZjzUAMKWCWqxduOO", "jzHXPgiDURMntiwTzSfwYfkyiWoqkHepgafhNHPkFItexD", "bvlCWtfjMXGbNNxMLkGPkzWllwRBlgLSuqJxfjZbyFVUMPq", "dyiNSdxZfNiFDagIfTyXcrSgfnbYCuUKfssVedRsGxgYcZNVSZ" };
    assertArrayEquals(new int[] { 3, 21, 32, 33, 42, 43, 37, 1, 11, 4, 5, 7, 8, 9, 10, 13, 14, 16, 15, 17, 18, 19, 20, 22, 24, 26, 36, 27, 30, 31, 34, 35, 38, 39, 41, 0, 2, 6, 12, 23, 25, 28, 29, 40, 44 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case9() {
    int[] duration = { 527710087, 192375347, 897134532, 187053572, 287230606, 90424703, 429091247, 319605024, 992666831, 191405751, 527710087, 96628869, 187053572, 178993578, 187053572, 2074789, 410730960, 6114598, 237685496, 897134532, 260885799, 137166315, 117385756, 5136624, 294607339, 109486223, 224301343, 43369676, 149845161, 397135097, 44750633, 473600917, 429091247, 102380439, 85766052, 187053572, 163025740, 187053572 };
    String[] user = { "HQZcYHfTMYlK", "ypGggmlOIHQhbwWVaCjJMonbhkQOCwDkDJEiNiGEQqhbVY", "SoQNRoKKi", "oMZL", "gBNuehyhSVYTQ hZT", "mvm", "AiFDY qmhuUsaVfCfIZHKrfTsqqLWUten", "PlnrQSSVNrUIiJrFcoZ", "WfOBAkzTgPfBITghtHznWNeJpJLioPfeaKXentucBu", "TjGQQDGkjsLpElYtdxBAYVrfnPS", "gCMgAdHxxJzv", "mvm", "TXnxlixviRpwLkcVhUpWoZplbnXaCZvAKTFEigOOE", "KoIxFLDmFyX tdODPqHEeyzwlXBUDIMUvuQSxmsNINFHhXJwtJ", "ohKNjGjWOBUEdhNhToUFiwqn", "mquYIGfohdCNA ph", "CvcoT", "gBNuehyhSVYTQ hZT", "TjGQQDGkjsLpElYtdxBAYVrfnPS", "vjSEYKlsqHKTxoawlEACrrjLieNpuiuLKbNh", "yfGhwksCfAahXerJqAqDgNwuuvuTEeYTXnjXWgGyV", "JxoOEU", "gBNuehyhSVYTQ hZT", "JxoOEU", "KoIxFLDmFyX tdODPqHEeyzwlXBUDIMUvuQSxmsNINFHhXJwtJ", "PlnrQSSVNrUIiJrFcoZ", "xyAWGphBlcVqyYiqfIueaWbpFp", "mquYIGfohdCNA ph", "yfGhwksCfAahXerJqAqDgNwuuvuTEeYTXnjXWgGyV", "qMmiwaaUdCccugf", "JxoOEU", "ODlqPMxseUfFocYkLNKjeEFBXLkwBNrRzryhTQYGVjXkP", "aBjgzFsSOACFwjHCOxGjuePQgmOONptUKjmMcjJMiqQydgMNK", "mquYIGfohdCNA ph", "mquYIGfohdCNA ph", "IuKuWCkXmlbjvJZkQuLQjBnLsOfocXRFUXOeZgxzNZ", "mquYIGfohdCNA ph", "pYrGKnEfpJDhTNhOskP EntOBc" };
    assertArrayEquals(new int[] { 3, 5, 11, 12, 14, 21, 23, 30, 35, 37, 1, 26, 15, 27, 33, 34, 36, 29, 4, 17, 22, 16, 20, 28, 6, 7, 25, 9, 18, 32, 13, 24, 31, 0, 10, 2, 19, 8 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case10() {
    int[] duration = { 814882383, 485893153, 965594450, 872101191, 965594450, 872101191, 965594450, 146006165, 127652484, 335417402, 872101191, 676868672, 57218808, 726095026, 872101191, 965594450, 872101191, 485893153, 872101191, 741724609, 872101191, 872101191, 872101191, 96217357, 872101191, 872101191, 872101191, 872101191, 485893153, 485893153 };
    String[] user = { "oQCSxcXvvbgQImLvuIrrDqapyJGHQisE", "TUWxFsuLYijlBUI", "baDrIlNb", "DPKyvopSnSRaYMfbbkGmoGKqFO", "wKPmjboRzPXGRbOmixDlEDpiNxmfizTEOuEBEMPSrbwPvOzqbf", "JhEcahvaGzFHaDShfHaTyNNDhtXvtANDEERKhLItHURFi", "pZKwDksGWocIeVOokFHhhaatiPOyBE", "rWcoL", "kynIdTaSOncawh", "ORDTSjDXido", "rRDRhFMTQPAehdAkVBKdtnM", "VnaXglAZDmeunaxxJbVlDHXJ FXcfoVlyFeDDzBLJsdCoqt", "oQCSxcXvvbgQImLvuIrrDqapyJGHQisE", "rWcoL", "yTeaCBMdzVaTbxvpkXmdiiXqJJlrtKwvJ", "XeSekrhB", "lOUizfYRVxdgbKglQzEbWVWQDoqROlvkPNfoUPIqFoG", "WVmcHHUZnmkMeMkKHxWUC", "sDhxmdjYW", "kynIdTaSOncawh", "ptBQXvlTHphxNkxHGRrzwLO", "SfCAmOHquJWxiumHADdKyuJYPn", "JtfdJtNwuxNfXibwLuzpHJPfR", "kynIdTaSOncawh", "qkHYlZwhepSOZciYwfLmUGagEQCtpYyMbd", "ychacrHdiHokzCQvgWaCLYcGZbtkwHBBCUWnndqKrHQcc", "pfPZSuoorVFxJoHCkikX", "qoZdchRR", "SjtinGNxhoXrTohwJQGdysonnWQQ", "dxogiCgSZMEpk" };
    assertArrayEquals(new int[] { 9, 1, 17, 28, 29, 11, 0, 12, 3, 5, 7, 13, 10, 14, 16, 18, 20, 21, 22, 24, 25, 26, 27, 2, 4, 6, 8, 19, 23, 15 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case11() {
    int[] duration = { 5516227, 59442338, 95857486, 193481631, 463201307, 194107271, 918007936, 890002296, 954338819, 2151647, 690739, 85268448, 398753806, 223881259, 917309417, 18700830, 13261733, 223993998, 51322996, 21824407, 36330883, 41339813, 15142793, 954338819, 223993998, 585126165, 202056852, 61912034, 8216091, 741376486, 743363169, 226024957, 967074288, 104658292, 239478403, 389833173, 174507257, 240444331 };
    String[] user = { "mMzdObRMWixNfMwkuZEVzkakqGbbcHpnONMTx", "PYImQIuelWoCUWsMb", "EazRmDbVkDawbLStqoMhLWeCTG", "JfptiDDxUuWmMLsqiMqZJaPGyROCFpBrzjhQKy", "xpWHIggUUwrNwGobtHMzrdqEuvEvItM", "mMzdObRMWixNfMwkuZEVzkakqGbbcHpnONMTx", "qHYJyXvUuErmtXN", "VqjmIuHTfLMSMZqEFrdKtFHTDbpdiLjAhMbvlMLQGM", "QSbnJlLRrzjULpGIrNSJcDoeLEUZHIjCBV", "PYImQIuelWoCUWsMb", "mHJSNRftWKPhoLFtbqxZSfqnxzaUdYryCKkZdopxR", "dxNzqkVEzmiPJCaaDEBzGcTPN", "tRcBLFPMYRZt", "WuxvzjmZFFx", "k a", "mHJSNRftWKPhoLFtbqxZSfqnxzaUdYryCKkZdopxR", "JfptiDDxUuWmMLsqiMqZJaPGyROCFpBrzjhQKy", "UQOwso", "EazRmDbVkDawbLStqoMhLWeCTG", "mjpbWMEqEJgHIsUlyHaYvCXSQnMczSUgUOnshJKreFpB", "qHYJyXvUuErmtXN", "PYImQIuelWoCUWsMb", "PYImQIuelWoCUWsMb", "lWiq", "OyzlCb", "iSVMiRLvRoSmaYmCPdEfWsBgaSeYaTbCwyxPWBURVsKBs", "mjpbWMEqEJgHIsUlyHaYvCXSQnMczSUgUOnshJKreFpB", "dxNzqkVEzmiPJCaaDEBzGcTPN", "PYImQIuelWoCUWsMb", "EMKkYxxnvBUAtVHXyoWH", "eFRooqpHCAImebPRsjBeOSyk", "mMzdObRMWixNfMwkuZEVzkakqGbbcHpnONMTx", "GFeY", "mHJSNRftWKPhoLFtbqxZSfqnxzaUdYryCKkZdopxR", "mMzdObRMWixNfMwkuZEVzkakqGbbcHpnONMTx", "upfvydkCjjaBzXOmxsSXBhAilhJvV", "xpWHIggUUwrNwGobtHMzrdqEuvEvItM", "tRcBLFPMYRZt" };
    assertArrayEquals(new int[] { 10, 15, 33, 1, 9, 21, 22, 28, 2, 18, 11, 27, 3, 16, 13, 19, 26, 17, 24, 35, 25, 4, 36, 12, 37, 0, 5, 31, 34, 29, 30, 7, 14, 6, 20, 8, 23, 32 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case12() {
    int[] duration = { 11612374, 5934001, 590408754, 13911414, 253619009, 94556232, 643916021, 159522705, 100493787, 41952335, 117778403, 220207872, 162593760, 36628723, 161325093, 218857053, 809265807, 23413373, 30095683, 174743378, 62589066, 4378797, 142649547, 266121126, 17050782, 485371399, 119770385, 20770739, 8211261, 38036764, 223103352, 11685929, 223103352, 268934888, 282830958, 195460500, 408379011, 435625098 };
    String[] user = { "FUdOvPJMCEJRTgMdiGasaHyf", "ppsWNWaxEHmRhvwlQAGRviBTQTwZKYJljAvKhlt FGQotfynIP", "XQ", "ppsWNWaxEHmRhvwlQAGRviBTQTwZKYJljAvKhlt FGQotfynIP", "MeQcLAkKnMXzGXnVbxeyQMGwbmHWEbQTGQBh", "MeQcLAkKnMXzGXnVbxeyQMGwbmHWEbQTGQBh", "ooKumUFmqCCVePMqmgVZsAcdWZil", "qMRMRgFLCnqc", "qMRMRgFLCnqc", "WhfTlIq ts", "qMRMRgFLCnqc", "xAnZwLZH", "MeQcLAkKnMXzGXnVbxeyQMGwbmHWEbQTGQBh", "uxyfpiblahwZPUUwKDv", "uxyfpiblahwZPUUwKDv", "XQ", "eIgdYonmKBGbjGYlEqXbjJkSBQQm", "ppsWNWaxEHmRhvwlQAGRviBTQTwZKYJljAvKhlt FGQotfynIP", "qLpbMXgOpwr", "aMtCseqJORRoldKChGUlcA iDzrgH", "qLpbMXgOpwr", "uxyfpiblahwZPUUwKDv", "aMtCseqJORRoldKChGUlcA iDzrgH", "qMRMRgFLCnqc", "ppsWNWaxEHmRhvwlQAGRviBTQTwZKYJljAvKhlt FGQotfynIP", "WhfTlIq ts", "FTWnDELGXXbITsgPoVZ", "uxyfpiblahwZPUUwKDv", "qLpbMXgOpwr", "aQexCUgAfofBKDYXrcALGKNUtl", "nNttkKDoObPVNCppAwqzk", "FUdOvPJMCEJRTgMdiGasaHyf", "ViQefsij", "aQexCUgAfofBKDYXrcALGKNUtl", "qLpbMXgOpwr", "qLpbMXgOpwr", "xmPRbHIdsnlFYRoGWqbp", "MeQcLAkKnMXzGXnVbxeyQMGwbmHWEbQTGQBh" };
    assertArrayEquals(new int[] { 0, 31, 1, 3, 17, 24, 26, 11, 13, 14, 21, 27, 30, 32, 29, 33, 19, 22, 36, 9, 25, 18, 20, 28, 34, 35, 6, 7, 8, 10, 23, 2, 15, 16, 4, 5, 12, 37 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case13() {
    int[] duration = { 326331265, 184086814, 745732929, 495458967, 161682413, 204811612, 2970677, 462546848, 923800429, 238745099, 81582470, 570870402, 32123942, 687924860, 464301885, 142481439, 833683894, 570870402, 361589155, 851185088, 666694871, 112857001, 631546568, 553040865, 316308546, 868111413, 23309867, 256011190, 238745099, 250660050, 325914662, 152758542, 151538285, 491785824, 104829112, 182303665, 979346478, 225264014, 402987651, 234277808, 143217045, 881381350, 236567882, 547228381, 873162820, 103611382, 3652446, 581383597 };
    String[] user = { "TyZvKdFfpmyMxzMVCxHOLnXCCW", "BqkyuaIonksEQAX", "MYyrUUxKTBIsvgNYJsiREfJx", "MNerSoDcx", "TyZvKdFfpmyMxzMVCxHOLnXCCW", "CGsAAe VJzeRYJbQqisYYLcp", "kwADHpnpFcBzNKhQ", "okOJHDrm", "zbwSWXsdhfbbuJvszlOcCphRSkeuZjHPFhkvTr", "BWptUSVtoaANVWwsarMjgBFa", "oyR", "IHkmYFZpZmj", "lyVBtrosraWzKXixCnzAQOwcHTwgOVIdIBPRU", "oyR", "TyZvKdFfpmyMxzMVCxHOLnXCCW", "kwADHpnpFcBzNKhQ", "veRV", "KQOLQDLmleOGLdLvienmULGZzLhdWgqhnqG", "okOJHDrm", "lyVBtrosraWzKXixCnzAQOwcHTwgOVIdIBPRU", "rBhmZELVPRWzfJlBWXWgIt", "VLcSiefaGVLboDLnrUyLYMfUtXQQAmF", "pbqHMfXovXcDvIjEkcTXzIiyTKK", "DVt", "FZPZsEhVjgrdSURtJRXb Hi", "CRUrlzYvx", "okOJHDrm", "BLqLjuArspnGBbMSAfFrdguwduJXVzWx", "rwynggDcGkkkCHoVFjEXhhTAogXrQZvku", "WgAXegcReJfyzQoHuLTdoxWBkrJngcZpX", "BLqLjuArspnGBbMSAfFrdguwduJXVzWx", "pgLKShnxvIiJdDqQXHThrigftViiQKbuYEHB", "JDhXlnEGSEwuWosHOAolI", "ANMrgCdNDANfPWidKp", "y", "JDhXlnEGSEwuWosHOAolI", "PFYtSfVtyirRuNeFEomUTZFwYBYn", "JDhXlnEGSEwuWosHOAolI", "LwJtJfORSOSTKCRWUqIUBSEDMMyMnYW", "BqkyuaIonksEQAX", "UWsvNbssRastOoXXccVj", "NSoVjLaNucyCiofQTWxHwSOBTSgfJnHk", "VLcSiefaGVLboDLnrUyLYMfUtXQQAmF", "SqJKpobDsmLMpNWvEvVzHPDMuJzevnfGpRadbp", "LsGoUEazrEzHCQalHTsIcUnHgCvYxDdLJYTPRz", "ZhpXW", "ANMrgCdNDANfPWidKp", "VLcSiefaGVLboDLnrUyLYMfUtXQQAmF" };
    assertArrayEquals(new int[] { 45, 34, 40, 6, 15, 31, 5, 9, 28, 29, 24, 38, 1, 39, 33, 46, 3, 43, 23, 32, 35, 37, 11, 17, 27, 30, 22, 20, 2, 10, 13, 16, 7, 18, 26, 25, 44, 41, 12, 19, 8, 21, 42, 47, 0, 4, 14, 36 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case14() {
    int[] duration = { 267240730, 315464684, 342140715, 441231238, 510706256, 632614089, 47478587, 267240730, 441231238, 315464684, 885875550, 154005446, 221505754, 277933184, 627138716, 799265852, 893132540, 47478587, 581020610, 529312011, 441231238, 666682841, 224341083, 67500308, 203544953, 194824170, 76419314, 277933184, 600527888, 262172675, 194824170, 70445779, 51397446, 262172675, 893132540, 435978481, 657419957, 893132540, 521642530, 70445779, 277933184, 958643697, 817609125, 221505754, 571154305, 581020610, 893132540, 70445779, 224341083, 715903222 };
    String[] user = { "flj", "d", "vHrmtKfgPeyJRNHtdVho ctcPfXlwfuszRKYFLO", "VnUCPPwvlsMygFNEbPCmVngGyKWlGiZfrgANudEQardMNmxu", "WnejwDrRqdzCARDhLGnPjsoVxPTxX", "gBClwOFdSRIisIHTxuxpfPJvsmYemEhdfY", "TCAaRodsUKEWZKyrOcIdvGvTAdrWgXdv", "oJQHRbnAjt", "wpulnBPUiF cKTKzZt", "hcARnlQhKfOExPlIjzhCllA", "IMLlarSzPAgLdFDuVTvrOjZkdkEpWvgSi", "hfydqCmOS", "yqADBbXBgUWHwNgJwAKKXeRUligqURQafQWI", "UAzqbjQOcGS", "iZFOjPsayEPCeQXUVgtNNEKRUPmLyqOqk", "RmTYDWEAKaRYRpAyKqwCBlgonOeqzhRibqSgJcUQwJjOrDcq", "siptgdtdVZMeXIuMrNukEDADUuG", "wFPApxDoJzwzNnvAWXYZZoVseRUxiCZmfyBAQADrjbA", "pYqnCRjAwwByjJZPIwJHslLwnypUhFxAmeHgNqHQlzAKjTsUtm", "HIzELhWLV", "ehxIYSTpUFBQcMNsgtiRuG", "m", "xLHmfwRCqU", "hfydqCmOS", "kjbEBxCwKVKYuVZvQiWoAIdZqDElqDFmJHyLnTOTgn", "EVEMiyCRDPABijLYVADLwIjkllZETSOfHtLArsYTTPvRZmqZpI", "YHR", "tGMNrORHNXNrqXiNoz", "lKhqHGXqhdoOGNiBsLafHXLsdjqMCrBwIxioRP", "NXzroUctEhr", "AquyCHSkBJNrglnyWqGrbbS", "rNVJFwEnKXILghllWjMRMFfakx", "XmLdFymGJlIQzLUO", "NDUA", "knYGETowa", "RTpcFClTwgwAHghWVqm", "QIPkVLsKNnMFeyKXmuYuUepPFRbCiZBLP", "uMMnrNKCyBOyvCLCTeBkAQKXiwjxcPNmEUqoBQNcYsFvwQjz", "NBDzqECnHIJYZzDwGAhQLZBXQUvXEn", "uNzFYLjWgQOCImZkYRgHQtBsgttrdhiQSyaDLozK", "eOxJDWtgjBPRqmMU", "SRhpDgQrsZJkrYYXKjgzrpqbgBaOyrXi", "ygbWeUhUSkWCQsyYRdHLxEGdqgZxnhqtPMqKxnJcVOQnU", "KtskQOxNdNB", "Qrma", "SMMRiLHstYkkiKsCyAhehrFvkXXJJCcHGDrRNpTX", "deIlRdbjXRRZDGd", "HDQMMQGQaPgPqLDV", "MLnYcbHhLmCiKZOOBpSCKXBWMYVnzeQRYadFKRsoFOMiLMn", "FRkmgMToYWmEGejOukpSlFJRKHKBMaIKipDiq" };
    assertArrayEquals(new int[] { 6, 17, 32, 31, 39, 47, 26, 25, 30, 24, 11, 23, 12, 43, 22, 48, 29, 33, 0, 7, 13, 27, 40, 1, 9, 2, 35, 3, 8, 20, 4, 38, 19, 44, 18, 45, 28, 14, 5, 36, 21, 49, 15, 42, 10, 16, 34, 37, 46, 41 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case15() {
    int[] duration = { 9983165, 47763451, 224304452, 423149970, 640611654, 137443782, 47763451, 88944795, 224304452, 135354569, 320106791, 16352903, 213989643, 22378990, 325479445, 224304452, 159822772, 224304452, 47763451, 336857766, 233814587, 54975011, 521609988, 224304452, 656964557, 224304452, 20503234, 821965997, 174413398, 27260217, 321501947, 159822772, 17699315, 26703250, 549817894, 135359657, 107146663, 3360886, 224304452, 10314809 };
    String[] user = { "JFh aFcbZAYHlDrAKykhsgaOxErpfxdIqEjOWjElAXiQIoi", "EWEMSFAmtpnkfQomKOywmMmuOfPt", "kPvztgclyzdnwyBpdjvNUsgWuPoXWlphNqs", "PhtcXiQlsaJTEPLySZOLbbUKnsPipVdkFixDtTYRUYCyyR", "WlUzHeslgSk", "oOYNW", "fjFqYypQuyuDy", "ChUFVYPaeXVCrRDKJhKQmAs", "vAcQIizrjLWdwNQQMqJnHTaRFP", "ufuZNhtCjmsVkWTb", "yTYpRRrTZCOuXTWHYE", "WlUzHeslgSk", "klZpJYntGEWlpMpJAIhUzFrqsnaBYQFtcozGWCnCrePXG", "oOYNW", "JFh aFcbZAYHlDrAKykhsgaOxErpfxdIqEjOWjElAXiQIoi", "ajFinmEBwZZfJThpWkhHFAyHimhahHVPizl", "TvfnosGAdkidEKfTqAANIYYcaunzAarRtT", "sWLpmctXWoDmczzAm AecxjTYrlhsBmUctfYNMNLtMUVvmBcw", "NBWJTDcmxcvmAzEfITInQxZEirn", "yTYpRRrTZCOuXTWHYE", "PhtcXiQlsaJTEPLySZOLbbUKnsPipVdkFixDtTYRUYCyyR", "CWFzhfGkcHhadFIRxg", "ufuZNhtCjmsVkWTb", "vWEifALpzlvmHzYoJXEYddTaMdGsOeFjxlaRpmWgqO", "xkBnuEXIjpuNR", "qgMqft", "atiABBtmtwyYYGjOSQcGxrIDCWeMAsmpqUmyTdePQYUvPtntMB", "IARBUXFgpFBOnxyMsnZRCshh gqRbMed", "CWFzhfGkcHhadFIRxg", "atiABBtmtwyYYGjOSQcGxrIDCWeMAsmpqUmyTdePQYUvPtntMB", "JFh aFcbZAYHlDrAKykhsgaOxErpfxdIqEjOWjElAXiQIoi", "NkrUaCRuEopojMaJumtJKhT", "DfzYEeQazWzluZfsTQDODDaLvrINMZYmDo", "DfzYEeQazWzluZfsTQDODDaLvrINMZYmDo", "EOSAezPEBgdbdDHIfVbjlhrmQZUcEOn", "ChUFVYPaeXVCrRDKJhKQmAs", "EOSAezPEBgdbdDHIfVbjlhrmQZUcEOn", "DfzYEeQazWzluZfsTQDODDaLvrINMZYmDo", "j", "klZpJYntGEWlpMpJAIhUzFrqsnaBYQFtcozGWCnCrePXG" };
    assertArrayEquals(new int[] { 1, 6, 18, 26, 29, 32, 33, 37, 5, 13, 16, 31, 2, 7, 35, 8, 12, 39, 15, 17, 23, 25, 38, 21, 28, 0, 14, 30, 3, 20, 4, 11, 9, 22, 10, 19, 24, 34, 36, 27 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case16() {
    int[] duration = { 113496745, 202378524, 402534726, 95790372, 222828414, 49353166, 172878352, 447436881, 517827569, 179010389, 432034898, 604913250, 87085681, 441690602, 72145985, 98984803, 604913250, 118015425, 283100033, 119778296, 58498554, 157476369, 217102158, 41768069, 301281953, 509122878, 35637029, 385156553, 163222648, 162078225, 604913250, 491416505, 205326082, 241146493, 604913250, 219756697, 303631297, 96200249, 218679630 };
    String[] user = { "BGFnNHQLFMpwfoQCKwcPNohCIgb", "MsJWqiltGYSRnaZjlzisXv", "MsJWqiltGYSRnaZjlzisXv", "mo", "OiEAABiVtLVHCBHdo", "jckJHlYFeMHfjcrOIQlFMgrsSKKdPAZYuOfghkrXxJFJ", "zBHICmiQbcavJLuPcPwyuZxwOIMrKRpKxspW", "WqdPoeXiIYVEQLGFAwuqMJKCeawvLfQAzbEtEk", "KcWkNugTksUxsBdHlEFdjealmKEkYf", "dliGp", "zBHICmiQbcavJLuPcPwyuZxwOIMrKRpKxspW", "OXHQBdfdAuSXnDbEtmzXZ kV", "KcWkNugTksUxsBdHlEFdjealmKEkYf", "W", "BaqtUsTEIXOnEvUNFcUNJyTeYWnehapFzcFnAoyZ", "OiEAABiVtLVHCBHdo", "km", "BaqtUsTEIXOnEvUNFcUNJyTeYWnehapFzcFnAoyZ", "OiEAABiVtLVHCBHdo", "jckJHlYFeMHfjcrOIQlFMgrsSKKdPAZYuOfghkrXxJFJ", "dliGp", "WqdPoeXiIYVEQLGFAwuqMJKCeawvLfQAzbEtEk", "jckJHlYFeMHfjcrOIQlFMgrsSKKdPAZYuOfghkrXxJFJ", "BaqtUsTEIXOnEvUNFcUNJyTeYWnehapFzcFnAoyZ", "ryNcfOaaZWmZqFcpxKKeGPGlNvHwHqgFOdfwqDXdSpaeTdm", "mo", "BaqtUsTEIXOnEvUNFcUNJyTeYWnehapFzcFnAoyZ", "lURQigB", "W", "dliGp", "HKSYCrcFehjOpTHNBRoCCESy", "BGFnNHQLFMpwfoQCKwcPNohCIgb", "dliGp", "BaqtUsTEIXOnEvUNFcUNJyTeYWnehapFzcFnAoyZ", "gIxqcWcFCoOgrwLJxUBGZADrlDpXueNHiiixSKD", "lURQigB", "ryNcfOaaZWmZqFcpxKKeGPGlNvHwHqgFOdfwqDXdSpaeTdm", "BaqtUsTEIXOnEvUNFcUNJyTeYWnehapFzcFnAoyZ", "jckJHlYFeMHfjcrOIQlFMgrsSKKdPAZYuOfghkrXxJFJ" };
    assertArrayEquals(new int[] { 0, 31, 1, 2, 3, 25, 4, 15, 18, 5, 19, 22, 38, 6, 10, 7, 21, 8, 12, 9, 20, 29, 32, 11, 13, 28, 14, 17, 23, 26, 33, 37, 16, 24, 36, 27, 35, 30, 34 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case17() {
    int[] duration = { 661381545, 53883406, 291604585, 69544289, 101357655, 435125598, 331843733, 60937920, 331843733, 310867685, 751250437, 741493148, 595620498, 404087577, 118867295, 167769853, 825900398, 632494231, 70314948, 970045880, 595620498, 660666209, 29655656, 97697309, 672935375, 687950803, 261000545, 167331171, 30903748, 264383274, 123110535, 331843733, 294926811, 537176261, 331843733, 9089102, 435125598 };
    String[] user = { "nAK", "QkZJvFUxWLrvsGJRGesrqMQqwCDdzdMOGHntsbZxuHJA", "AyZzvSZYQdoxSWq", "BBgtzrJbimiKyFpnoYjkGN", "tJWbezcpjOMxTecpDvGFAnVTXwwYYtPrRYKrlHBdyenbOZbLk", "gKdOJuidyAymZXzXvFxPky", "hzdwPLgRpZrOyBBbkwHFOVTehawoEeIwrIczCiXeOEBQ", "MFHnOscHPYdZmLnbgTMDwirasCkEmNPbPHTJmjPAwbPMkD", "ZjNqSqMf", "BBgtzrJbimiKyFpnoYjkGN", "QkZJvFUxWLrvsGJRGesrqMQqwCDdzdMOGHntsbZxuHJA", "gFaDpRzamIYfXAkCuHPqVGhyYpEBHYXHUrn", "wtxWPGexAHaDxbWOpKLNybPODtIChGdmEPziNtHmxw", "ljDGUAnxHAsrCWqMEflHAsSxhiCJyiQJrjeQJUeVWJgRVTQBl", "ljDGUAnxHAsrCWqMEflHAsSxhiCJyiQJrjeQJUeVWJgRVTQBl", "MFHnOscHPYdZmLnbgTMDwirasCkEmNPbPHTJmjPAwbPMkD", "RKLAgjQiJ sgFuwuooYacNDNpDDHqduDhZzUzXxjsQkhEyVq", "UNWIPYlfQUQgonInhbfQUyhWCJZgVtmyHon", "Ore", "hzvSjioYltfewPNPzneAHdosDyXVDcnQcnNMGqWkTCYO", "etPVygbszTYrmqNVXrYhiqINigjOqTIOJMOeaNl", "ksRJwiSSwnrUx", "AowbAUEzYwgvlyeDUaev", "tJWbezcpjOMxTecpDvGFAnVTXwwYYtPrRYKrlHBdyenbOZbLk", "kmlvMtoiFoIjwypfQBvjYpSsfDRuL", "kzpHUsDAOX", "uFkbBoQLyYGiVPsKkbOJrLdryEPR", "Ore", "OpnPIPRgiDiKWGORuSSHezMDwx", "LDfVQFigHSofFkjMBqZ", "czvvHKvZV oiWUtk", "LtBqMIBJzkXItmDFxgnazVXajTVgm", "AyZzvSZYQdoxSWq", "XpGSpodXtVnkGCdpmaVk", "unopTJZaJKrmZzqwRPhwZshwyOJK", "AyZzvSZYQdoxSWq", "rTxXBBubrlgkXVGyKx" };
    assertArrayEquals(new int[] { 22, 28, 30, 4, 23, 7, 15, 18, 27, 26, 29, 6, 8, 31, 34, 3, 9, 5, 36, 13, 14, 33, 2, 32, 35, 12, 20, 17, 21, 0, 24, 25, 11, 1, 10, 16, 19 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case18() {
    int[] duration = { 660294428, 49353061, 78897857, 106679814, 116672955, 513073063, 841320925, 485205424, 327682818, 303077073, 11175435, 498478459, 188620531, 27404255, 58435082, 609518508, 236763459, 48726776, 135349616, 203498834, 133958915, 90889247, 860554162, 836654840, 913775678, 47377219, 164928947, 251445307, 781660001, 218952110, 781660001, 348549294, 27208336, 945204728, 46470164, 324241179, 486978199, 540116217, 318955368, 105575421, 770934897, 550513800, 63440149, 47220379, 647703929, 199485356, 226925990, 354646547, 291599242, 263711878 };
    String[] user = { "pWYiBXAOOBgXQQighnBGLFTDHryGrsBqxkCWgIOdnJOLZNNnh", "G dRWdWfilUN", "zaukxbwCUevtwXOOtXgaIZBUuuFNYvKSecWZF", "LcHLmvTEFIgyoMnMuonYZWENijsPsuHOwWQACEGt", "G dRWdWfilUN", "RsCAhYfjqUrqLXQTMkmlODGHQfH", "BpzmFkLQkHPYDwOYCTA", "wfw", "wygpKtoNEylmoGuSksgIQeQJGLjfBcPqT EQhI", "RfHTlkMhRlWjcVinovNCNmfrevoIdv", "lWkJuSIGtVgPbidajUewnO", "lWkJuSIGtVgPbidajUewnO", "G dRWdWfilUN", "cdRYvyTHObAwDtwAtTgClmPgKDN", "JMGhRLNdFHfCGShkRc", "SApsRFRGN", "mKhEoG fPGuM", "wfw", "cdRYvyTHObAwDtwAtTgClmPgKDN", "joCoXEIWoQvinOvqUsWQCmUxIaegfufyhYjAqI", "joCoXEIWoQvinOvqUsWQCmUxIaegfufyhYjAqI", "JMGhRLNdFHfCGShkRc", "BcmGulYATZZPSwjFvNQsmGbF IqyRj", "UnArziJjKvrlCcxtfFLKXeCjtFGIVyya", "SdLOykdnMByqXslWuUewCPTyveyMZCIXPwZVk", "ZmkRJFQnLddnhjlBKsJElzVKJJqtuyaZIZTCEUSviqHXrpB", "cdRYvyTHObAwDtwAtTgClmPgKDN", "pWYiBXAOOBgXQQighnBGLFTDHryGrsBqxkCWgIOdnJOLZNNnh", "mvTJCTxsUxIltBfkDzWtDaofkgJWLLFBtA", "RgDLWpmvxkwRoy dwhbqwicMSiVJFaXLxbxCdFiOSHfMPkz", "keByZwHyEosjDKwmmLiKuATnHGUCvJR", "pdrGUNeUOUtUbZfEVpguBROFskuBXcPzsMnaJpssmqO", "LcHLmvTEFIgyoMnMuonYZWENijsPsuHOwWQACEGt", "IhvWYBJo", "SApsRFRGN", "joCoXEIWoQvinOvqUsWQCmUxIaegfufyhYjAqI", "pdrGUNeUOUtUbZfEVpguBROFskuBXcPzsMnaJpssmqO", "zaukxbwCUevtwXOOtXgaIZBUuuFNYvKSecWZF", "Z", "BcmGulYATZZPSwjFvNQsmGbF IqyRj", "scVIorsJFJiafqTWVcNqszKcXjCkXBBKIJnTyd", "laeGepDsiCdxkv", "LcHLmvTEFIgyoMnMuonYZWENijsPsuHOwWQACEGt", "pWYiBXAOOBgXQQighnBGLFTDHryGrsBqxkCWgIOdnJOLZNNnh", "ZmkRJFQnLddnhjlBKsJElzVKJJqtuyaZIZTCEUSviqHXrpB", "NbTOB", "joCoXEIWoQvinOvqUsWQCmUxIaegfufyhYjAqI", "ZCvUzMboHQaHmSDWukfMgMYGFXbGiDBzJQqn", "CcsXOwKWcppT", "mKhEoG fPGuM" };
    assertArrayEquals(new int[] { 14, 21, 3, 32, 42, 45, 29, 48, 9, 38, 8, 13, 18, 26, 1, 4, 12, 47, 16, 49, 10, 11, 5, 7, 17, 41, 2, 37, 15, 34, 25, 44, 40, 28, 30, 31, 36, 23, 6, 19, 20, 35, 46, 24, 33, 0, 27, 43, 22, 39 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case19() {
    int[] duration = { 693967409, 74369724, 70653046, 768090693, 457524257, 56738441, 70653046, 822442824, 693967409, 375013368, 318611165, 886896129, 82510889, 146355325, 292171543, 768090693, 457524257, 64543368, 146355325, 268201090, 70653046, 146355325, 189323167, 70653046, 20162507, 457524257, 32475189, 768090693, 146355325, 55976577, 70653046, 768090693, 227636184, 70653046, 457524257, 768090693, 146355325 };
    String[] user = { "zIORPcqg", "VKFXkTOxEumGS AKEul", "WhinUoPnvrPdbCWAInUegmBAieWQbRsDecgAHsqDTXYwN", "pHWPgsWHm", "YoPcaEgUatoiDiPmxMrWCrlgZuXDOwljdLNGhDKptk", "yXzmtEIBwLsLuSQWqQIjwcmYIGGJtItkEStBUaImWCVBy", "cdSGSyGbGnYPqJKG", "HiTdBPEJplEQSnCZsmyIDJZh", "kfTZDLjwG", "DlNKpsnPjT", "VKFXkTOxEumGS AKEul", "mZoTJbh", "DlNKpsnPjT", "JAZzwqYxZFpppYKAzYukpmoBW", "yXzmtEIBwLsLuSQWqQIjwcmYIGGJtItkEStBUaImWCVBy", "xWDTzhJjZzkIehPjp", "DtTVlyuGLksckZCHUGdrmkTUNaVtnj", "VKFXkTOxEumGS AKEul", "FYlgkQEvlpdUYtYgqnvNMjFEgdDXEqznByFjADryTI", "GZqXpEoDERpZQgFPKpVUL", "eeWkYJkoPzFVHg", "rDdFxRDrsRLHb", "GZqXpEoDERpZQgFPKpVUL", "daoluJ", "yXzmtEIBwLsLuSQWqQIjwcmYIGGJtItkEStBUaImWCVBy", "lbXTxJGfGmCwZJUPqeUlQTvCoDcTcpLypQdnC", "yXzmtEIBwLsLuSQWqQIjwcmYIGGJtItkEStBUaImWCVBy", "AqNeWRWSTChkTepKykojfqz", "rVPbhyYDaQF", "yXzmtEIBwLsLuSQWqQIjwcmYIGGJtItkEStBUaImWCVBy", "WhcUvWCztNtAmFxHgzxnSAIjLlh", "dAmbpXSOzneMMVKkSyaOzDPPcHVWJRQDnQDEAXrLSDwqDB", "UJrjLTUJjRDJoZZUrnjxFpuFZnKSvnSSSNegSoFq", "JMbFJPNgSfdgeesQscEyTvMWK", "RjqZltQBwDIPNKyTmStkvVFaVXVwzCKxNRuJpvWWXehCx", "BmUeksnHelduwCNXvqzXyjoPOIpTUnHgWJYpcJvUMrz", "fGqgg" };
    assertArrayEquals(new int[] { 2, 6, 20, 23, 30, 33, 13, 18, 21, 28, 36, 32, 1, 10, 17, 4, 5, 14, 24, 26, 29, 9, 12, 16, 19, 22, 25, 34, 0, 8, 3, 15, 27, 31, 35, 7, 11 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case20() {
    int[] duration = { 2129401, 351481613, 101946039, 529844611, 16726777, 252743004, 5603392, 255082861, 685550812, 70870060, 235754117, 4976511, 396853428, 712173864, 30038739, 972985641, 43728600, 30297065, 543309176, 817498677, 545933439, 111385317, 118672816, 324707683, 14579016, 751876330, 255082861, 141436525, 19328744, 210883398, 791952763, 789261780, 137664836, 997231122, 454454349, 255483209 };
    String[] user = { "LdgqhdxzqBZWLzGvLModWDENuRjSSFKjpagzLu", "LdgqhdxzqBZWLzGvLModWDENuRjSSFKjpagzLu", "DGQLgrkZGVhHCjMOpFXclpZtV", "HcWGrXyVOOjvRaGLSUoBTKSWNzYwZmmMIU", "DGQLgrkZGVhHCjMOpFXclpZtV", "DUDbiyYhLbPEkmEkcCXQn", "QXZtHJEKDVMMPeNmIvPIPGwFmGQjgKoOhgpvasUSIlnMq", "HYAhfXivnCJXxIXNWRGuXSbeJFFKeCzF", "AMERDRKlqvcvGcZmyKUMuIuIdK", "YCkhU uyjLXgdGTvnidWLAlhxWvwdVWInIFpMZBiLxNXa", "JPiBIzRhwjXqjIhiaBtnpxKRNMmzbOTAH", "DUDbiyYhLbPEkmEkcCXQn", "GyThnc tXnrOntkBLhMfYqHTEKfDba", "rcpglSsFDIGDAGvHtJhfbSUoUNgJFfp", "QXZtHJEKDVMMPeNmIvPIPGwFmGQjgKoOhgpvasUSIlnMq", "TXhRSIvKHAGXtjdgyTjYIQYuXk", "YCkhU uyjLXgdGTvnidWLAlhxWvwdVWInIFpMZBiLxNXa", "YCkhU uyjLXgdGTvnidWLAlhxWvwdVWInIFpMZBiLxNXa", "cJQmNpLGPBjZLHugLWoiadxLWJrvMHQEkoEziLip", "vryvhCXJguTDPKNcTTBBJmVXoCJ", "ScCfkLukbeHRefzpyHS", "YCkhU uyjLXgdGTvnidWLAlhxWvwdVWInIFpMZBiLxNXa", "IsiGfZaxaWukhZiNKlVvlmoWCbcpnGg", "LdgqhdxzqBZWLzGvLModWDENuRjSSFKjpagzLu", "dHzyqWHlqm", "RtQVrDOr Z", "bSirBNgFOXn", "QXZtHJEKDVMMPeNmIvPIPGwFmGQjgKoOhgpvasUSIlnMq", "JPiBIzRhwjXqjIhiaBtnpxKRNMmzbOTAH", "HcWGrXyVOOjvRaGLSUoBTKSWNzYwZmmMIU", "rCmWPSVzdOOMreCsDOzhmaghkYpIqrxK", "XcCeszMHxHcJgpazDdRoXvakIlIJAAqRfUNcG", "HcWGrXyVOOjvRaGLSUoBTKSWNzYwZmmMIU", "xTma", "DUDbiyYhLbPEkmEkcCXQn", "PUMLWeoiXljTSbDOQOgst" };
    assertArrayEquals(new int[] { 24, 2, 4, 22, 6, 14, 27, 7, 10, 28, 26, 35, 9, 16, 17, 21, 12, 18, 20, 0, 1, 23, 8, 5, 11, 34, 13, 25, 31, 30, 19, 3, 29, 32, 15, 33 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case21() {
    int[] duration = { 59461742, 25364248, 85353541, 83056769, 23288629, 10641990, 696332806, 25438476, 163958940, 19618710, 211288193, 667217864, 269502292, 105607639, 7903264, 36662033, 47912398, 116369662, 259749347, 18928398, 3737245, 79859210, 210198905, 27292654, 14017805, 14276017, 948954814, 12414295, 76022711, 2634830, 14448157, 50690054, 647274080, 41876476, 124648696, 152415861, 66428582, 860467380, 345452683, 957151220, 26858470, 8196406, 84910120 };
    String[] user = { "cTdpEAPoiupjpSAqbOzuh", "jBYjiNeSmKoMtPipmQUEUQrmRatWjLjlQ", "cTdpEAPoiupjpSAqbOzuh", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "h", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "EqTshiBDAelIhDeFymIMTHTUsPtZZgZjRQsFU", "cTdpEAPoiupjpSAqbOzuh", "EqTshiBDAelIhDeFymIMTHTUsPtZZgZjRQsFU", "hJxoWIlvWGnPgcctoijQ", "AQ", "EMynkhybSzmZnVqSpyQdahueFpLAbyyJElCfKelDiMXTS", "EMynkhybSzmZnVqSpyQdahueFpLAbyyJElCfKelDiMXTS", "cTdpEAPoiupjpSAqbOzuh", "cTdpEAPoiupjpSAqbOzuh", "hJxoWIlvWGnPgcctoijQ", "h", "EMynkhybSzmZnVqSpyQdahueFpLAbyyJElCfKelDiMXTS", "cTdpEAPoiupjpSAqbOzuh", "cTdpEAPoiupjpSAqbOzuh", "MgCnXBICnrGKrY", "jBYjiNeSmKoMtPipmQUEUQrmRatWjLjlQ", "EqTshiBDAelIhDeFymIMTHTUsPtZZgZjRQsFU", "hJxoWIlvWGnPgcctoijQ", "dTyXsDUhpAlZfSrJceKytiLOrKHHwDvzHFOwwgqgApuYfmw", "EMynkhybSzmZnVqSpyQdahueFpLAbyyJElCfKelDiMXTS", "cTdpEAPoiupjpSAqbOzuh", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "zDxcJmDrlVZwpLwZPoRKtxIrviIhlGkVJHLRKlcUz", "mQgjqFAgpSqAgGZJHGQXEFKrTrZnfz", "cTdpEAPoiupjpSAqbOzuh", "EMynkhybSzmZnVqSpyQdahueFpLAbyyJElCfKelDiMXTS", "SvYhHvVlYxyiKrjEOwSeLhLSBBngYlsALlCr", "cTdpEAPoiupjpSAqbOzuh", "GCOHKsC", "SvYhHvVlYxyiKrjEOwSeLhLSBBngYlsALlCr", "utiMpYjYhdojcWrhUalgAmPqlYFYsuaWhWzo", "jBYjiNeSmKoMtPipmQUEUQrmRatWjLjlQ", "dTyXsDUhpAlZfSrJceKytiLOrKHHwDvzHFOwwgqgApuYfmw", "cTdpEAPoiupjpSAqbOzuh" };
    assertArrayEquals(new int[] { 1, 23, 40, 3, 4, 5, 7, 29, 30, 31, 22, 12, 13, 14, 19, 27, 34, 8, 10, 24, 35, 38, 0, 2, 9, 15, 16, 20, 21, 28, 33, 36, 42, 32, 11, 17, 25, 37, 6, 18, 26, 41, 39 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case22() {
    int[] duration = { 186680329, 411587930, 718414692, 48046355, 185637603, 13794839, 33379136, 540190827, 37793563, 239720398, 500788025, 917390136, 42676223, 188413989, 163802396, 411587930, 13794839, 347248342, 728604816, 718414692, 151533011, 363541575, 28363808, 718414692, 917390136, 573544262, 917390136, 902444447, 902444447, 293051148, 937660719, 599828210, 173238726, 371166350, 13794839, 557151987, 937660719, 13794839, 937660719, 74546808, 443707310 };
    String[] user = { "qmYwBQQKpif", "ZCYGtCWerOyeqaKyuEdDceUmEgSWaHckC", "AsopfFoPc", "ZkEEoaCHaWIouktAolBTZyLVhAoWlCUDhcJFhWAHnhHyBGDXrk", "UTEq AnvMlY", "NIZQBmDdJPCHOOCGcFqtRSLSDAFOeEiPuQhpzFpnZXM", "UTEq AnvMlY", "cvTpjTwfKduWEvQpLFLNAVNSxZ", "qmYwBQQKpif", "UTEq AnvMlY", "WdhaAxzmaWepurltOkJpORotjHSbyyIhcQgitZcdPfju", "oixIsbguqLJE", "pZpIR WJIn", "cvTpjTwfKduWEvQpLFLNAVNSxZ", "hgRAyZxqSFAteWrDnQedcXzFgSFoeAcJdQJSLfJJs", "yGziFUsfkQBuHdLWidGMASicEIjzhMkL", "JmArzzqcpBtyWyLkpBkksocXmxtKynInANdSFcGLMFRIJR", "ZhTtYMRjEVHwXDhwtQBXCNZbpq", "aZOLmHHLQgZOMbjBJvVicpjmSWnFdJrEfADVfCCZ", "YYtgvjmbVvQGWEgIJIGfckCnVv", "RUWuqQBMxsTjeknPNwBTcRKjSRvQFEKVQJmdSizWhF", "ZkEEoaCHaWIouktAolBTZyLVhAoWlCUDhcJFhWAHnhHyBGDXrk", "WdhaAxzmaWepurltOkJpORotjHSbyyIhcQgitZcdPfju", "ruLfbzOHsTWFUuGWd", "JazO Lpwpd", "lNaTWynPHKZBqRiGgPYXUXDOSEpjezLuFHdDRqYoGkVaCxKQU", "vxMxgbhZiUnVxwctQGmLnGdbAwt", "jdzHRsmpVKGkwOECJkbapbloTotthatkBfFUfPZ", "onnfmhXlGvVaQTVCZoLlaVOQMqYYnVwTPMoXqsBYv", "WdhaAxzmaWepurltOkJpORotjHSbyyIhcQgitZcdPfju", "ByJYsNCpMhFmtgZoYYSIg CsUZjCZdwOLvDZX", "aIcdejilTSagiiHDEtAPEkhzGOJwcqvouUaficNVuTCS", "hgRAyZxqSFAteWrDnQedcXzFgSFoeAcJdQJSLfJJs", "ZhTtYMRjEVHwXDhwtQBXCNZbpq", "hulaAETBnBbttbWWmyukiEmSSHuceae", "pZpIR WJIn", "LNauktDiRrcHPvZobOSqtKPDXpemuNrKWGuJjt", "IN GLPbvSCWNsQeuHftJsDuJkvCDeqePCxsAUjh", "cD", "hgRAyZxqSFAteWrDnQedcXzFgSFoeAcJdQJSLfJJs", "UTEq AnvMlY" };
    assertArrayEquals(new int[] { 5, 16, 34, 37, 20, 0, 8, 1, 3, 21, 14, 32, 39, 15, 25, 12, 35, 31, 2, 17, 33, 19, 23, 7, 13, 18, 10, 22, 29, 4, 6, 9, 40, 27, 28, 11, 24, 26, 30, 36, 38 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case23() {
    int[] duration = { 484072059, 491276724, 131060600, 429904482, 429904482, 429904482, 272768388, 301442117, 430804789, 128462365, 505077242, 187707104, 429904482, 377302200, 323153874, 65774558, 97767377, 36051543, 311527642, 429904482, 429904482, 239354624, 81290784, 187707104, 187707104, 208333031, 81290784, 37666764, 274504156, 301563658, 392237718, 27033786, 429904482, 429904482, 19147985, 89939727, 9017757, 118799591, 377302200, 429904482, 187707104, 375770769, 636962938, 310962902, 429904482, 131060600, 274504156, 272768388 };
    String[] user = { "GHcUGbCcmeDHCpSIiMMmpLQrIa", "qqahysnNJtjcgDKFdTebhrJCsTtZpItHRaT", "icxlffeWVaoKudMrwIQXgKsReBBXAKNzYjIp", "rCXDmEdD QKxrhzQKCzBedSS", "gIYGpYsHaxeaYlgzQqCCprBczRxzuPcayfWgqtF", "jYRmLnmUCrkklAQIE", "TKGZfPNZVgwoMrjvIExqAOLjqGBdouMEapMaaiPaQZc", "mRhhcXP umLUV", "KwGvb qsM", "mRhhcXP umLUV", "TeQHcOuck n", "LtvR", "qjSANFJmxdqIbwoQAPikrJZkVuTJXC", "PRWsVGDWCX", "npelQQI", "hpk", "Jydjziym", "LISSkgBhnMIAFzRuiaRnTbXagylvpLgyIemX", "hpk", "dqCnaSOofPnqCtiogkPGdOFsOENjp", "daJpsGMfLPlcBVzfremwPoveeoiqCrhDMiqkLoWQDibg", "KVpoFXbvdLMZftaMhsLYCDORgGaH", "wAEZlVXAeVAasmlzrCjPzJNtcsRouZbHhlCksYORg", "BYaBMJPLDPLaaqKkZ", "XbXpPWSFOHFNSadQWpkARqOCY", "JfWPFzbfrphMwRejXQFxhLdQGqSOZpWpA", "uHFrCSCtMyYYEmOFFEVqHWI", "naCAicdudWCPLwiTIvSZivevPkxBYq", "jNwJmIixNaHhRdDqPPxSMOOCCrcLBRwWkbS", "Bt", "naCAicdudWCPLwiTIvSZivevPkxBYq", "XCdlFFAbkiFPblFfZMjCJBNKDbXroy", "zEmMsOqlQgfZFnTQICPD", "UROGsroYLtNIeDrJxYotEbLyYyLQNuzzYfsTQYfjwVjFoyYD", "KVpoFXbvdLMZftaMhsLYCDORgGaH", "Jydjziym", "XCdlFFAbkiFPblFfZMjCJBNKDbXroy", "KVpoFXbvdLMZftaMhsLYCDORgGaH", "MOyDHkpwlgvjS", "wQaBQQFea", "RpYdGbzurYdE", "HmLDqqgPu", "GgXGRmEEDIEMnClDAbOFddKcHcuWHJmaQjK", "fFAnjqHf IkEACPpALYwWopAQO", "ppVEzqDpBDCEpjaooAbJLJs", "DYuYrUl", "THanoSYBMzwABmmLgZKfkB", "QqcJTIrfzuzUPAuQzVPILaiCLzjpWVxY" };
    assertArrayEquals(new int[] { 17, 31, 36, 22, 26, 2, 45, 11, 16, 35, 23, 24, 40, 25, 6, 47, 28, 46, 29, 43, 14, 41, 13, 15, 18, 21, 34, 37, 38, 3, 4, 5, 7, 9, 12, 19, 20, 27, 30, 32, 33, 39, 44, 8, 0, 1, 10, 42 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case24() {
    int[] duration = { 12413009, 13157212, 6764146, 4675604, 11092176, 14975295, 5307873, 17997639, 1998179, 2588011, 466576, 63849809, 14273466, 3454029, 14133794, 9884594, 13295313, 35639721, 62450289, 941257, 5382594, 7810535, 8319571, 96838982, 7455683, 8383966, 20704366, 4581913, 4184367, 8301733, 1761380, 1111828 };
    String[] user = { "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "xJlgmwYwSqLPqLSnkmsPMN", "xJlgmwYwSqLPqLSnkmsPMN", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "xJlgmwYwSqLPqLSnkmsPMN", "xJlgmwYwSqLPqLSnkmsPMN", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "xJlgmwYwSqLPqLSnkmsPMN", "xJlgmwYwSqLPqLSnkmsPMN", "mVNarLRSmvzrptUqSEJdEXjEfrbfYaoUjJsGizHAcO", "mVNarLRSmvzrptUqSEJdEXjEfrbfYaoUjJsGizHAcO", "xJlgmwYwSqLPqLSnkmsPMN", "mVNarLRSmvzrptUqSEJdEXjEfrbfYaoUjJsGizHAcO", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "xJlgmwYwSqLPqLSnkmsPMN", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "lfgIUMmCVUMVITxSwfJPiDWeSKJtvrQiExRMmwldnhMRNEMiM", "xJlgmwYwSqLPqLSnkmsPMN", "lfgIUMmCVUMVITxSwfJPiDWeSKJtvrQiExRMmwldnhMRNEMiM", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp", "xJlgmwYwSqLPqLSnkmsPMN", "rkEuoAYiuADWxprYSJvP", "xJlgmwYwSqLPqLSnkmsPMN", "xJlgmwYwSqLPqLSnkmsPMN", "lfgIUMmCVUMVITxSwfJPiDWeSKJtvrQiExRMmwldnhMRNEMiM", "mVNarLRSmvzrptUqSEJdEXjEfrbfYaoUjJsGizHAcO", "xJlgmwYwSqLPqLSnkmsPMN", "lfgIUMmCVUMVITxSwfJPiDWeSKJtvrQiExRMmwldnhMRNEMiM", "xJlgmwYwSqLPqLSnkmsPMN", "ZXKTyqpqkZUvqwTyWoSLCutXaHGKNDDryp" };
    assertArrayEquals(new int[] { 0, 3, 6, 7, 8, 15, 17, 21, 31, 1, 2, 4, 5, 9, 10, 13, 16, 19, 22, 24, 25, 28, 30, 11, 12, 14, 27, 18, 20, 26, 29, 23 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case25() {
    int[] duration = { 115552680, 103032720, 56997557, 233271595, 88258312, 470150479, 29995118, 295855692, 103032720, 103032720, 46088615, 5665071, 103032720, 1684318, 103032720, 103032720, 470150479, 308507717, 103032720, 103032720, 103032720, 165444212, 343651758, 14774408, 103032720, 103032720, 103032720, 32730045, 103032720, 133764776, 657331992, 103032720, 17469600, 42516473, 343651758, 103032720, 15366223, 44985191, 103032720, 103032720, 138771982, 103032720, 103032720, 27786202, 24108282, 103032720, 362502660, 518560010, 47796066, 470150479 };
    String[] user = { "RzqoMUAQRumIlMGPBKfcRUlZsTYJnwngsmlc", "fdqHosycVe", "vfdsVOILjhtIVbpZBMsEs", "RzqoMUAQRumIlMGPBKfcRUlZsTYJnwngsmlc", "RWbOcTayXSTlcxSUNW", "fzzeIcEddxQm", "lFIEhwYOMTc DLdOXvARGLENRGeSCezHRZkTMpyKdWxpXO", "ZQKSHEBHvrllyJUSsPTNDKkPtjuhsiNXNHqbLDOLaZPoR", "QGWBTuvLflpayIjKYYtkyYsBNXuTFtZkCVomNHUc", "YBGDPZvOPwINLbIDclFhBhScpxjUxZQPTlajvRFsIL", "vZHEzrbmnMrqYOUXY", "vfdsVOILjhtIVbpZBMsEs", "XgZFYOsXtacSTcO", "lFIEhwYOMTc DLdOXvARGLENRGeSCezHRZkTMpyKdWxpXO", "bKSlfvdIVKFLEcTjNALbHTx", "pUMYsTFtgLcxbFZETdLPc", "OdVcOYLHSsBb", "RzqoMUAQRumIlMGPBKfcRUlZsTYJnwngsmlc", "Babl", "EyKOenWH", "XtKjD", "ZKEoisUOAjMYYmhgElghBcRztDWCYZpe", "cujJoIHZyGAso", "RWbOcTayXSTlcxSUNW", "CjyQXaOykswNMTVUwl", "wNWMleLeIumnFNUUoqPlJnpv", "PTsicUJMmTdgSEbcpUbUkgEjsoduQAlGVlpNFCTefaLcSVIlAQ", "vEPHsqvpDhdEtfHxsgFnQavfCPesQNCMOuoeWIBiSYh", "paWdUqbHLsNDnuSFAKNONYiPVeQZtyHrFaiQTTyX", "lFIEhwYOMTc DLdOXvARGLENRGeSCezHRZkTMpyKdWxpXO", "g", "DlYfkCQuhSBvtSfZfFiCFHRQgK", "vZHEzrbmnMrqYOUXY", "vEPHsqvpDhdEtfHxsgFnQavfCPesQNCMOuoeWIBiSYh", "TjhkBptfFbuzkSLwqFaJUVtcTxy", "tAHwrJNeFpkgmUVszvMZjqpmMDwyFlPcgRg", "vZHEzrbmnMrqYOUXY", "vfdsVOILjhtIVbpZBMsEs", "tgCNfpJNaKll", "urx C", "IPYaIluqFmn", "q P", "cQhfgODlRJiurL XHiB", "vEPHsqvpDhdEtfHxsgFnQavfCPesQNCMOuoeWIBiSYh", "vZHEzrbmnMrqYOUXY", "WqQfsOvYyeLMVUFuneQjfKodGaDsHGbyCjOaUPlFXETJLf", "vfdsVOILjhtIVbpZBMsEs", "IPYaIluqFmn", "ZQKSHEBHvrllyJUSsPTNDKkPtjuhsiNXNHqbLDOLaZPoR", "LgyakbyBReckVBwTryVeOXlQpbHPM" };
    assertArrayEquals(new int[] { 1, 4, 23, 8, 9, 10, 32, 36, 44, 12, 14, 15, 18, 19, 20, 24, 25, 26, 27, 33, 43, 28, 31, 35, 38, 39, 41, 42, 45, 6, 13, 29, 21, 7, 48, 22, 34, 2, 11, 37, 46, 5, 16, 49, 0, 3, 17, 30, 40, 47 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case26() {
    int[] duration = { 443953034, 379020081 };
    String[] user = { "onQiiYoMFAEZd", "onQiiYoMFAEZd" };
    assertArrayEquals(new int[] { 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case27() {
    int[] duration = { 301290848, 408788248 };
    String[] user = { "SqrQlagPRyxmRkIVnkmgDBhwYaPfLMiL", "rkFVSrCHDmWNdjIjGSGKJXRc" };
    assertArrayEquals(new int[] { 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case28() {
    int[] duration = { 24522151 };
    String[] user = { "kbtSYzvVCzwcBhF" };
    assertArrayEquals(new int[] { 0 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case29() {
    int[] duration = { 232742883, 232742883 };
    String[] user = { "EfHfMyWVMOCYnufgLBIFgSdUcKYFNCzeVBL", "NadSDSJtfYvqXVuzS" };
    assertArrayEquals(new int[] { 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case30() {
    int[] duration = { 123530238, 286902899, 636808861 };
    String[] user = { "EjqYXofsHgjPDOzWn", "UTOuQ", "EjqYXofsHgjPDOzWn" };
    assertArrayEquals(new int[] { 1, 0, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case31() {
    int[] duration = { 26, 61, 51, 34, 20, 50, 61, 44, 6, 25, 59, 9, 59, 53, 28, 13, 15, 58, 51, 59, 27, 53, 35, 51, 37, 52, 59, 3, 59, 5, 21, 51, 51, 10, 25, 58, 59, 35, 53, 17, 54, 1, 53, 61 };
    String[] user = { "gPpGYYpyxCxwnOGuMaOHeHjwq", "RZtzzLWGSJUdwEikqHMdhVIopsyl", "HmqyJzZrdEWDtEf lNGPUSrzotpKkrahn", "zjAlReiKnrNRwKqfQt", "WLX", "hPYtD", "lZMQbnsfKzLMJrtoBAhA", "QqcGFUuEvyiwRUVYGOLXuSIXBlnEeFprwrMQjqARerBjzSqUB", "hPYtD", "gPpGYYpyxCxwnOGuMaOHeHjwq", "MMjqRqPXyIqnAVjAzTIhyXeZPauOtnkSi", "QqcGFUuEvyiwRUVYGOLXuSIXBlnEeFprwrMQjqARerBjzSqUB", "f Wq", "pAULCloOjpYPflXQagngeHDEQq", "waKMstbLtOstptqJrDCdjMcJVtSaqrwKyPshz", "TyzCPqSEPowqJVvHhvi", "zjAlReiKnrNRwKqfQt", "BHpmMmiQDzLTcjuTAfhOvhEvyxBurRquFbtpccwpsJNKhVJTS", "ffkBKcyfzxRuNzc", "PDQI", "WLX", "XBFf WKRfDLrGQNyDunEnWWEDQATrZIalKbNdrUpYwGCN", "kKnJSLYgQObDDhqITuAMNC", "DBRcBONoOlUgIGgHpzuRapCtcFXCBMIGmahRRz", "TyzCPqSEPowqJVvHhvi", "phowKrazhFFx", "kjrJiqRxVbxHQMuvkXSFvBHIntHGWGYxUptSTVmdFSBVHY", "TyzCPqSEPowqJVvHhvi", "jIKAXGgCJesgkgxDYJhONlBjlz", "WLX", "lKlxeMvMgWssWsQXXiG", "cHAlASeNNKbfGQAAZ", "csMOyMnnbHfedJyHoijOh", "zjAlReiKnrNRwKqfQt", "waKMstbLtOstptqJrDCdjMcJVtSaqrwKyPshz", "RGOTBKMmdQGftckmfWUvDbpGfCuuifi", "RaGXabqiHzqXmEosTbuQlfzbqGzsmNsuyOXM", "lKlxeMvMgWssWsQXXiG", "UBoYuyndMWGhSEhldAebUSEOWmVykcJbDcMHFbRvsfbkP", "kKnJSLYgQObDDhqITuAMNC", "PTTVDhrfEMqRfpIrGY", "BHpmMmiQDzLTcjuTAfhOvhEvyxBurRquFbtpccwpsJNKhVJTS", "jOecnbXwfzFjdTWUmKKEwgehOQECPMSun", "cTNZSELYEAkOjPbyUOFMxDsOCKtVpPzWvdncUhvHnq" };
    assertArrayEquals(new int[] { 0, 9, 2, 18, 23, 31, 32, 4, 20, 29, 22, 39, 25, 7, 11, 13, 14, 34, 15, 24, 27, 21, 38, 42, 40, 5, 8, 30, 37, 35, 3, 16, 33, 10, 12, 17, 41, 19, 26, 28, 36, 1, 6, 43 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case32() {
    int[] duration = { 52, 59, 60, 55, 19, 56, 5, 23, 57, 2, 51, 56, 18, 51, 55, 55, 60, 60, 40, 53, 13, 51 };
    String[] user = { "wBlavVXhpVzZqWpTjzwVKXnGAzzIpOUmlroCb", "qNLxGyhPfAx", "xieHmtlWOiycvPiLnCJQGHbnChPlSqVEt", "MUfQcWmNweTwdSkeLZhpXouBExCwdMTwuuvhfCPWamigNIsn", "BeVkDiFrsltyVNRabeHtgEiPCFhAKIZEHxmlhjtP", "KoK YtKJK", "hvnjspoupmvRMAsuQvSScGtGTUrsHks", "BeVkDiFrsltyVNRabeHtgEiPCFhAKIZEHxmlhjtP", "GYBGI", "JYBLGwdIYsSFyxGdZWewfHnHFWmwtVciVzaVtvKkBjCXMi", "hvnjspoupmvRMAsuQvSScGtGTUrsHks", "GaCxQfvWxBjGljeghJhJnljCrNUBEk", "BeVkDiFrsltyVNRabeHtgEiPCFhAKIZEHxmlhjtP", "NKMCwsawkrcWjDoAzcyxiHzgXcPsoLDLwzDtmHj", "jiDNdgOMBapUYfsjpsQdlZuQfDkanPMtdWKEiw", "Eelz", "IkszPaXTM", "GRPGPXybN", "JYBLGwdIYsSFyxGdZWewfHnHFWmwtVciVzaVtvKkBjCXMi", "kNhSWhe", "JYBLGwdIYsSFyxGdZWewfHnHFWmwtVciVzaVtvKkBjCXMi", "nCZPfIgUCXZyXmPBDZMKEkzdqtkRLit" };
    assertArrayEquals(new int[] { 13, 21, 0, 19, 3, 9, 18, 20, 14, 15, 5, 6, 10, 11, 8, 1, 2, 4, 7, 12, 16, 17 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case33() {
    int[] duration = { 55, 56, 53, 61, 55, 56, 29, 55, 59, 60, 55, 61, 59, 60, 58, 51, 61, 51, 56, 59, 55, 51, 58, 56, 61, 59, 55, 56, 27, 54, 51, 51, 51, 51, 60, 61, 54, 55, 51 };
    String[] user = { "NeEoYuZyjkZMnFDUOgflXjPN", "FSvBIUHboPOaPTquXXItrctxcSmleSuYPcBb", "jKOEVRQNstnUwIxSA", "DjWBIxMwMtjKZNqyetNdcnJiYMZT", "tyFuggVQnwmlYmmARBtOcfGvHz", "QEqCyeBZo", "nNCgPPHWQEjJQhnpr", "JGxNhplSfUCjkjKqCMQlLJwvPzireaaBbDelEIHJR", "nEJppMiBFnXJcKUF xokYTVhMzrRgHYuzVIWNDfMCkRi", "nTaMDENkPHLvNzpBhRpKETXPWFdLcwPUoEBNzgz", "yyiDLREORUdOFSFI", "GhyfZrLLUrFGqiVmcirK", "PQmiHITaStHXvwDmHXgfjHXdeNkcg", "YGwITmICWscTIzIciIVGZqhpnwSuJgQOSDgAlK", "J", "OyQIWBnqHGPBzBCaaisVdJgVcySpuIAkARCQOMC", "CFflcBGPd", "dtVkK lDZMVogTdGmWyDCqwzJOVdDLMP", "iXdlgDGCQOcRrndezJbwiIseOewNTNjUQGhL", "NQKnUynJPsfUx", "EIv", "PYyNuGsHckfXuueKAOPlvZaNVDiXSatfYTp", "CiOAUmvdPNDVOnSzUzUZSrvjpKuoMkJsSRtnWanoYkMkZ", "HUjLhPPlhZl", "OuzfalrUPuGnQYcONzxKnQWrMFhBlTEZoysK", "pDWNQPhaRXHjtOkDIUcGujUlQTYHFYIYYKo", "XMHZxOGsGYLoxZqCCZrMKznXMPElUHLzPIhgF", "Kt", "nNCgPPHWQEjJQhnpr", "HqDflPeQvSbaPinMeEBlpuCarEagAD", "NwQdxaclwWaTqVyMd", "wSoyYdqAKDSWYAzPtpGKoBkLEanhMdXyHzJaaH", "LcNTSlYYvgIGxGgIjrdQHHgtRvnIdFhzoL", "vJLYoRJglrzhKBCDGYTKqvDtOABtbRztCllJgwMfGlp", "cubgJUoFoHxHeiPJdnLQWUUqfkkCtHddvLzBPQVKMLvHn", "UTkyYeDphkZKgWOvTCVYOzwiGR", "qEjYgnMrSzZGmogdwBDXdwekxT", "zXgJGGLQoGaxTruBeCcyowcbKRgkUjndUjhAzSIojJgZq", "iTsvBZfRGeZWmyrAAZRKqzWlOUDMRThOkgFW" };
    assertArrayEquals(new int[] { 15, 17, 21, 30, 31, 32, 33, 38, 2, 29, 36, 0, 4, 7, 10, 20, 26, 37, 1, 5, 6, 28, 18, 23, 27, 14, 22, 8, 12, 19, 25, 9, 13, 34, 3, 11, 16, 24, 35 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case34() {
    int[] duration = { 60, 56, 24, 49, 22, 23, 4, 30, 53, 58, 28, 29, 37, 57, 54, 60, 30, 28, 56, 52, 57, 55, 57, 10, 27, 58, 60, 30, 19, 53, 59, 52, 18, 53, 51, 58, 32, 6 };
    String[] user = { "MRedWgJltXUpcbwBbCsgYjYzJJiKojXarmsr", "narFaekiMgFeqpKCiGWIkv", "XhlFMPvgXMFmrBJSCoMbeAypYLjPfEFzpUpULjrn", "H", "JEZJKEhyacSxDfKfoEQYCDX", "BqYjARpbUrIhyiAyUD", "H", "BqYjARpbUrIhyiAyUD", "YzpABGkAievdbEqLmNp", "qO", "XjVylPPzzqQNFZxortABlgxaXsKqnrnVYUWNzkMO", "yajRrpgUwtyT", "ZsZndKiL", "SarloXkbfwvMhJEDLZwkiIojBlxGVIWMhetW", "IQvMnKYFqoWAJftrvLPnzbesf", "BKVF", "JEZJKEhyacSxDfKfoEQYCDX", "XjVylPPzzqQNFZxortABlgxaXsKqnrnVYUWNzkMO", "QFgNwcrZACZsqArBKErRzadmExOVIK", "OsJnpQHoqgxLePcPFCcuJtkeIidsZifKoZrjbzrdzEKaDZbE", "Dnf q", "gMSWtYwCQNbZuKbtGydyljoGAaqkLByExqaeVuPRGs", "QD", "XhlFMPvgXMFmrBJSCoMbeAypYLjPfEFzpUpULjrn", "XhlFMPvgXMFmrBJSCoMbeAypYLjPfEFzpUpULjrn", "vJcmBIjmUmsxI", "cvxAqkBFntneCIkOqmlJEe", "yajRrpgUwtyT", "ZsZndKiL", "KcIGRMcZCenNdLrbRljMCMUp gG", "feJoXnezFigvvXTOUmIOiQdfysyiCX MiXPovL", "dMHWfREZgUUTtujssuct", "hqiKaFSF", "LEbGBNmxSZuIIxeROqPJqjJQLDTztAnCdAQH", "fKLhLbCrGMHHgBVtYshosPLDuvbTPYnDfcRur", "uqO", "hqiKaFSF", "hqiKaFSF" };
    assertArrayEquals(new int[] { 34, 4, 16, 19, 31, 3, 6, 5, 7, 8, 29, 33, 14, 21, 1, 10, 17, 12, 28, 18, 32, 36, 37, 13, 20, 22, 9, 25, 35, 11, 27, 30, 0, 15, 26, 2, 23, 24 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case35() {
    int[] duration = { 57, 11, 18, 53, 9, 20, 24, 60, 56, 28, 31, 35, 54, 57, 2, 59, 52, 59, 52, 19, 18, 5, 53, 11, 37, 58, 35, 46, 2, 9, 52, 53, 50, 52, 45, 42, 13 };
    String[] user = { "VsOkShdCYqFBXosxnfdnrvEjGsrUJvTnmWNOE", "CgEAyDGbsrLFxwDo", "doNDGPwKFAPKZvDiQLE", "sAcITEFCOFIwOEPQepoyjGDPgfjiCVjMazTg", "ilBDjXEBXNsbqNTGbbtLKeEkcxotQsIBXnIbKaqCwTDixQ", "RpOxlCPjjQNO", "yKfqbUdmOQSWthxhUyGBuDQEGKor", "MYNTFDtpQwcuDRhmlVkJBCmgGZsHBlNOAvDdYejqajmtnaUu", "sPdYfoucNZFGvkDjgOtpzO", "SzNJKLIvpXyyoSLhdSJaRKPrLiFBCWXJdOXQW", "doNDGPwKFAPKZvDiQLE", "yKfqbUdmOQSWthxhUyGBuDQEGKor", "WWGEEbsuRXxMtbfpYbvbmGDowqfYDfUCogctMJFg", "EuRQMcZInGxerdzWbaoBJCjqoMKqXXSeHwaPXBprrpbjAdcdRI", "cPCN", "tsDUNSZTqt", "bOMLSzmawBBCWReLPRaBrqfzUChVPNUTHEmZQNfVE", "mwUnsBplOTWekQ", "pCMEbXSWdhpZlsUboBuTuT", "SzNJKLIvpXyyoSLhdSJaRKPrLiFBCWXJdOXQW", "gDR", "SzNJKLIvpXyyoSLhdSJaRKPrLiFBCWXJdOXQW", "K", "doNDGPwKFAPKZvDiQLE", "gDR", "prsHqKvQQqMBvoRvFMIDdKhfFgfRBOepJklFithpD", "RpOxlCPjjQNO", "ilBDjXEBXNsbqNTGbbtLKeEkcxotQsIBXnIbKaqCwTDixQ", "QUchUXGJgDFFqXyTWVhDoFLAfGCTm", "bOMLSzmawBBCWReLPRaBrqfzUChVPNUTHEmZQNfVE", "xgJejzbqObReGKJANvfQmuURcAlbNrgbBvAiUdoMvgwFnM", "tPIuLHGLqpdNWwdJojcfxzNUPbxjwxKeKMSHnVHWOfOkelqDh", "cPCN", "pWTfKVkXxDrKRrBwDlAXhYCAtQapyvAHdCokndwKtNqGz", "QUchUXGJgDFFqXyTWVhDoFLAfGCTm", "CgEAyDGbsrLFxwDo", "QUchUXGJgDFFqXyTWVhDoFLAfGCTm" };
    assertArrayEquals(new int[] { 9, 19, 21, 14, 32, 18, 30, 33, 1, 35, 3, 22, 31, 12, 4, 27, 5, 26, 20, 24, 8, 0, 13, 25, 6, 11, 15, 17, 2, 10, 23, 7, 28, 34, 36, 16, 29 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case36() {
    int[] duration = { 40688094, 6633759, 644541, 9193792, 22948116, 13759832, 6212822, 3771602, 1541735, 10331153, 10069035, 4910302, 12277230, 6841619, 6635926, 1190456, 20609713, 9078751, 32904221, 2838525, 9925538, 3411330, 622316, 839411, 278619, 3894107, 7900507 };
    String[] user = { "XOlEltdAcaERXMSYCwCxOCrWUvRodPuQOlHbTxwiwlyfWhfWU", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "UsMlRiCBDdQVlparMRlqTukckaOQu", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "h yTGESKRYJMrhFRtKuPYTguslklvLqIV", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "UsMlRiCBDdQVlparMRlqTukckaOQu", "UsMlRiCBDdQVlparMRlqTukckaOQu", "UsMlRiCBDdQVlparMRlqTukckaOQu", "UsMlRiCBDdQVlparMRlqTukckaOQu", "h yTGESKRYJMrhFRtKuPYTguslklvLqIV", "XOlEltdAcaERXMSYCwCxOCrWUvRodPuQOlHbTxwiwlyfWhfWU", "XOlEltdAcaERXMSYCwCxOCrWUvRodPuQOlHbTxwiwlyfWhfWU", "UsMlRiCBDdQVlparMRlqTukckaOQu", "h yTGESKRYJMrhFRtKuPYTguslklvLqIV", "UsMlRiCBDdQVlparMRlqTukckaOQu", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "UsMlRiCBDdQVlparMRlqTukckaOQu", "UsMlRiCBDdQVlparMRlqTukckaOQu", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "dcpnyeDyYQHsCNyCPGuWxAqecxVf", "UsMlRiCBDdQVlparMRlqTukckaOQu", "UsMlRiCBDdQVlparMRlqTukckaOQu" };
    assertArrayEquals(new int[] { 0, 15, 16, 1, 3, 5, 6, 7, 8, 9, 20, 23, 24, 2, 10, 11, 12, 13, 17, 19, 21, 22, 25, 26, 4, 14, 18 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case37() {
    int[] duration = { 3812610, 18954055, 3236121, 11176516, 6082104, 7317633, 12261667, 1442231, 1636674, 4346723, 15137875, 9585876, 111942968, 2462534, 49347502, 5778831, 8930520, 46064580, 2568167, 69607526, 128184829, 15302198, 4282114, 30558682, 13472115, 482406621, 46362716 };
    String[] user = { "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "yusYYQNII", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "yusYYQNII", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "yusYYQNII", "yusYYQNII", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "yusYYQNII", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "yusYYQNII", "yusYYQNII", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "yusYYQNII", "HgmsRSjUAtrifkXxyqWXfITnEyscfydHjiDzNIxxlIxGritKyQ", "HYEnmCQOaRilcrFCBQGegNKEbUN", "yusYYQNII" };
    assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 13, 16, 18, 21, 22, 24, 25, 3, 12, 14, 15, 17, 19, 20, 23, 26 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case38() {
    int[] duration = { 6676714, 284294, 1949465, 39116294, 31086332, 12496718, 4948745, 1441526, 2959764, 31632699, 1734879, 3024202, 6852109, 679821, 21907005, 77107653, 9073506, 30282613, 6312487, 12980229, 4760317, 9596933, 9861534, 6774550, 32540426, 24114316, 8871687, 6358660, 11721217, 9655998, 72366857, 14697449, 716665594, 4740796, 34328322, 6981009, 4933748, 14873043, 627584, 17001922, 7899012, 3775548, 7833241 };
    String[] user = { "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "AGFLNpdrBqpEO", "lhDJssVIGbQJjPonUAgisfjOmXYaVWScEkBLCfoYFF", "twvZgBTcMReHCRazSsAqDCNQrWSMWTDEiSxbt", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "AGFLNpdrBqpEO", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "lhDJssVIGbQJjPonUAgisfjOmXYaVWScEkBLCfoYFF", "aIEUSZBtmUadk", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "twvZgBTcMReHCRazSsAqDCNQrWSMWTDEiSxbt", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "WbCkoIYpnwHsBmcLgPExsKBZWjjsdiZczz", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "lhDJssVIGbQJjPonUAgisfjOmXYaVWScEkBLCfoYFF", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "AGFLNpdrBqpEO", "IegVYgpvYlthyhVRjHIXMNWtbTrXeugZjAZ", "WbCkoIYpnwHsBmcLgPExsKBZWjjsdiZczz", "RSAspFmlhpQYysWprAhdCFBOoDBqrgjRYRpcjKGPXdkJQ", "WbCkoIYpnwHsBmcLgPExsKBZWjjsdiZczz", "tyQsPRRpUDwXolVnbsywLaQHZC", "RSAspFmlhpQYysWprAhdCFBOoDBqrgjRYRpcjKGPXdkJQ", "twvZgBTcMReHCRazSsAqDCNQrWSMWTDEiSxbt", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "WbCkoIYpnwHsBmcLgPExsKBZWjjsdiZczz", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "WbCkoIYpnwHsBmcLgPExsKBZWjjsdiZczz", "WbCkoIYpnwHsBmcLgPExsKBZWjjsdiZczz", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb", "snJUlZzduInqKpJFQrurhEgCUyyYUqJb" };
    assertArrayEquals(new int[] { 0, 1, 2, 7, 10, 11, 12, 20, 21, 22, 23, 35, 36, 38, 41, 42, 3, 9, 27, 4, 14, 25, 5, 17, 34, 6, 8, 13, 16, 18, 24, 26, 28, 15, 19, 29, 31, 37, 39, 40, 30, 33, 32 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case39() {
    int[] duration = { 98626860, 69403766, 441554451, 15184175, 46011590, 51191091, 16966685, 6694756, 313342229, 248539942, 4801375, 94170143, 481131223, 34444759, 55089569, 14486262, 432207565, 109880188, 297614879, 572376866, 185084630, 1213344, 73725788, 37678396, 32673761, 297199994, 73803176, 17984891, 81625307, 6943081, 14530071, 141127361, 867206, 96623459, 389125931, 55852784 };
    String[] user = { "MPtFUKPvqjlkQERBQpXnyzCFhqlGdWRhGKCXsOMwvFuP", "HzhAcwhqoKxsTkcnikJnCtezHJ", "wUiAOaJUCecJAErGnGbHhLpApoGSpuPaSLPJrYRRYpX", "ikzwRAqKHGLYSrGcaBwEKUzjCr hAXBVKlLrjS", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "tRJrYfmrwFeXsTgyddxoBqDgoRdOrnmDPzcjWaADypBntrOlF", "MPtFUKPvqjlkQERBQpXnyzCFhqlGdWRhGKCXsOMwvFuP", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "SJVfGxZk", "HzhAcwhqoKxsTkcnikJnCtezHJ", "wUiAOaJUCecJAErGnGbHhLpApoGSpuPaSLPJrYRRYpX", "HzhAcwhqoKxsTkcnikJnCtezHJ", "ikzwRAqKHGLYSrGcaBwEKUzjCr hAXBVKlLrjS", "HzhAcwhqoKxsTkcnikJnCtezHJ", "MPtFUKPvqjlkQERBQpXnyzCFhqlGdWRhGKCXsOMwvFuP", "tRJrYfmrwFeXsTgyddxoBqDgoRdOrnmDPzcjWaADypBntrOlF", "MPtFUKPvqjlkQERBQpXnyzCFhqlGdWRhGKCXsOMwvFuP", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "ikzwRAqKHGLYSrGcaBwEKUzjCr hAXBVKlLrjS", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "ikzwRAqKHGLYSrGcaBwEKUzjCr hAXBVKlLrjS", "HzhAcwhqoKxsTkcnikJnCtezHJ", "HzhAcwhqoKxsTkcnikJnCtezHJ", "wUiAOaJUCecJAErGnGbHhLpApoGSpuPaSLPJrYRRYpX", "MPtFUKPvqjlkQERBQpXnyzCFhqlGdWRhGKCXsOMwvFuP" };
    assertArrayEquals(new int[] { 12, 0, 9, 18, 20, 35, 1, 4, 5, 6, 7, 10, 11, 13, 15, 17, 21, 22, 23, 24, 26, 27, 28, 29, 30, 32, 33, 3, 16, 25, 31, 8, 19, 2, 14, 34 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case40() {
    int[] duration = { 115869572, 23265430, 8020045, 88339652, 43909738, 13566008, 118740572, 119502771, 73185074, 35655134, 73867973, 29581832, 87307850, 57479439, 53132029, 26642813, 84188803, 29312561, 56191352, 66002700, 651582184, 2170393, 6383440, 14544239, 8949247, 17521706, 351901221, 21775115, 397358287, 91284789, 16089387, 87576407, 14507205, 36017054, 63730794, 27814552, 766374, 47369847, 18095783, 11712556, 13092145, 32042458, 4131710 };
    String[] user = { "tJQLQIh", "tJQLQIh", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "SzvWHjPveliDtyUcyllGSKHLNx", "CRZhfPyhb", "SzvWHjPveliDtyUcyllGSKHLNx", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "tJQLQIh", "CRZhfPyhb", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "tJQLQIh", "CRZhfPyhb", "tJQLQIh", "tJQLQIh", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "vmJaXrtwxFyqtcElTrmEmWvmvOApRtEsYJHHeSJxvarqk", "tJQLQIh", "vmJaXrtwxFyqtcElTrmEmWvmvOApRtEsYJHHeSJxvarqk", "tJQLQIh", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "vmJaXrtwxFyqtcElTrmEmWvmvOApRtEsYJHHeSJxvarqk", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh", "tJQLQIh", "tJQLQIh", "SzvWHjPveliDtyUcyllGSKHLNx", "tJQLQIh" };
    assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 11, 12, 14, 15, 18, 19, 21, 22, 23, 25, 27, 29, 30, 33, 36, 38, 39, 40, 42, 3, 6, 7, 9, 10, 13, 17, 24, 31, 32, 34, 37, 41, 26, 28, 35, 8, 16, 20 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case41() {
    int[] duration = { 293848425, 83823899, 785579894, 609202425, 72498024, 953141947, 81231383, 725400629, 357819977, 66069932, 11756033, 92912183, 402089285, 90983373, 10744225, 83823899, 908068174, 785579894, 860592216, 725400629, 78470448, 81231383, 16911163, 506535708, 254038657, 293848425, 66069932, 170467759, 254038657, 368190056, 761189246, 278716966, 816462912, 506535708, 402089285, 908068174, 908068174, 81231383, 128523624, 72498024, 293848425, 254038657, 177397275, 81231383, 357819977, 750445021, 746036232, 402089285, 153978133, 70395811 };
    String[] user = { "WOpxiQCqIFUbjqStPiGOBeAZPjXSAykmQONSByyNy", "WmIG mqKXPondh", "umEMxQlFQHxelUFkIJPRbInRdFCjvDMUYqzjFlGfO", "gmxEamqgYYSqgEHSpFTN YdbbJZKyCMVJfSPzNioYZDC", "ob", "rAxWthCCWqJvI", "JbdFbeHlgMnUW MKnaYyaBtNXOR", "jeIrGXHFZBhtYTcCDWVFoHkdw", "gePAMNCXmv", "PWcQYyShIsFFwmOjzGYlmXkXrW", "NlDFFRskObhoyRIFhxWsoYFBsqbmXpiAdVruoUSfYPKTB", "GuJjoMcuEbDTajeMrHxjdnrpMzvapf", "pqfviYVaEN", "xKKAImPxlgfETcJFvjZvQDmJQFWXkfWSAgNeviII", "yjOSddyCKRXvuKvQ", "tJpFiH", "rkpjUqKOjaMlJxGcXuhmDCMnkVveVsbegLSdXIU", "BQdxZYimGQftXlLdvMDMOCQXfrUfkvCwBne", "YARD Ee", "DRrJfDekNBPLJtjDxklLTIdfCCSB", "hjvNRRpqx ufVmARxrWDjipLgLWmqdEiBTzBXaXLfykfTf", "sBIhiyRIEFJMqjmYsFmFhxjvZG", "SFwwopqOisfmYLUGBeIhHithinPIFVXbWqiAGVBwMtEdrVsZ", "TLgiSVuqXEYzzOsfqIayUbsjOLCJRhklWyuDnfYXG", "lOqPZSItgSkbTGNjDNnDBcuuoHuL evSQxyKexmKYR", "StHwzaGxKGmdYnruIZtoiLdmgJBiOLpZWvqknJgrXITdTFrbk", "nzvlhHNnvz", "vPRuPIwMWsBMlGvswCzFbFERB", "EDIPfGvOaTwOivGehfaPxrTAYiQFPuYICxMhWaDZ", "UytwEOia", "Y o", "bp", "tPvQbK", "dgPryVntzAlFYeGFGqWRJselvpMoAlQHYdtQaeDYuLlXED", "u", "utaHswECbbCcdywyjgiczGjVYYpMZnubeNiikIwypvqx", "mTcqTCfLpbVyc", "VbzQFuRHuWZFtbeXGsErgzyWHSOtrHzrtWQcCOOlMlRO", "lvus", "cgCzmqhaoPneXOelVgFpptqtDwMfDEDVRGr", "xXNksAJhRusOyDFYI", "eXrXARuDfLWAsqUEwaPWJSwV", "GqSRQaerjozvLiSncAJIqkIriFpyYnDRIqZQtmKSfvc", "wQeTUcKbDXwfWVTEfGTJLfJeAXidTIaoxSPqsuzKsXLEIBuo", "r aHzMNPPIqhyNYSbIeaCJqxGbcNzcVCKFnYZDmbTuRJvacvA", "yjOSddyCKRXvuKvQ", "TgaEZttZM", "JRWxBYjzWVvAZzFKsWrzoJnLpeZXrdPWugTAyaPLdjVMRons", "soTlHVVpRd", "AGKFTBMcmYxkQXZmSg" };
    assertArrayEquals(new int[] { 10, 22, 9, 26, 49, 4, 39, 20, 6, 21, 37, 43, 1, 15, 13, 11, 38, 48, 27, 42, 24, 28, 41, 31, 0, 25, 40, 8, 44, 29, 12, 34, 47, 23, 33, 3, 7, 19, 46, 14, 45, 30, 2, 17, 32, 18, 16, 35, 36, 5 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case42() {
    int[] duration = { 527444978, 894751929, 146401866, 390381598, 439368905, 678014085, 439368905, 643168952, 421747876, 332276657, 370697923, 239858333, 654049749, 509997973, 8251100, 630583401, 585097120, 266051760, 544236631, 653446225, 649427133, 630583401, 654049749, 863411896, 79273297, 144472775, 531517786, 664799080, 654049749, 775699669, 465984559, 648997752, 422531036, 421747876, 635649429, 829155840, 940608115, 774333679, 683884305, 384603767, 700365049, 422531036, 146401866, 608269468, 527155738, 544236631, 630583401, 816059917, 114155068, 2363178 };
    String[] user = { "rBfnaLWXBmfsvxiejtJiOFXXMPOV", "KqmmBKszvVzfsxOgrbtv", "akYfVJdlfHDYwYCuxnbEaqhuEkNeGKbRnUGonME", "nyjtumQQDVJHMRneeSzAeoKerB", "YYgQfZaUwUuBXXTgibyMh", "BUakwiGoCifARdna", "nUhSAdjlNICgpjeUCEg MHt", "aHckkZDoXQcSNwyI", "aANgZHLwBlqqdAcqKIUSckGpunhYJnfiKLxYPbrDaAm", "hKChVTCsnEvlZLFcda ULuWjRCGLQyjXGcoaSbEeOfrfjwfF", "oGmLJdltAIKwbYEaZPkP", "dHbHnQsIJHoyFqEUhPKrzQryHaxTYNPmgTmtVkHjzeOHZe", "vrsxljqrtNktpXeL", "cJCHdubBPtAzhoConOSpfuuylVsRPUXDDKNdwqJbWGZRTX", "fOSeFrfvshyQTHHPVHZJQOmewVarwpTk", "eBigQCelTTckZeXSzbWnzxymAuHTebKHE", "PmuvDaczwKXgqqaXJFFQHIMmtNSP", "vsHdompcWywKIUtIoDUMwUlhQarauW", "PGBgLu", "RdjbvRubaeMDwXPZE", "LbMFqsbZ", "MIpWICAaOqTLk BULtxiYpUv", "VkVrunwUTtVenAixyrfqKM", "HKJpWBTEZuddTiuACaELQXyBOxqSBJesoTso", "xOtkaZKanMGLBHBjtwbHfiYOuuMKWgeHbZMkvZgnBuQZKg", "KqCyFUXkYWBiRxwMMqOHVNlPSNJURCgzVEPtxpvasvZ", "BWgxC LpgAcl", "PysZPFYTDtiZDrvqKcBHZoxAfIphtk", "hAyeehBZeUvjKoJkKeov", "AeaRShFRFoLUMOBjdpHgjss", "tnnk", "dWTXquiBbq", "qFig", "YNIIYXHMKsNxpC", "WOfnyqhFra", "oECkSWNeLWMJraDcHVIPkwuMHCRWeMzCtLAMazUl", "hSvwswBEUgvxwKLcgNiDmkkrWKPbzFteqeFa", "vYlMJpRrGWKFbYmUlczTKDSxckQRAtviyMJJKAFB", "cKGJqYVLRWoYaApFHMFftp", "dQ", "LBxXXMUvmcvSY IzWavOdVb", "ySySJScOBPlgsXpnOc", "JIFkRlMzkTiIRyhVeIlEeaTRItoULUCoZwtbpCtFHVlFug", "srEVbxKklaBnmTiqBTAkkmIBnTRUzwoExVrKNFiNFCsYRJWtYr", "jOLsLIAT", "lIzoslJJwg", "Cy", "JqnfvMzrxUZvFcK CNpdHsqSRgEfpI", "MeFo", "ZtoCtjvdBg" };
    assertArrayEquals(new int[] { 49, 14, 24, 48, 25, 2, 42, 11, 17, 9, 10, 39, 3, 8, 33, 32, 41, 4, 6, 30, 13, 44, 0, 26, 18, 45, 16, 43, 15, 21, 46, 34, 7, 31, 20, 19, 12, 22, 28, 27, 5, 38, 40, 37, 29, 47, 35, 23, 1, 36 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case43() {
    int[] duration = { 756786678, 848824846, 667293895, 929295841, 782067546, 49489314, 317219883, 440662926, 317219883, 575485822, 279706533, 705052843, 239084977, 98281630, 667293895, 777916999, 15585598, 756786678, 926080432, 288281292, 21225944, 302459622, 877343765, 44445561, 437723273, 35936402, 50919534, 846616695, 245668790, 339583968, 85018736, 877343765, 418309233, 697592107, 865712996, 531612781, 711891170, 519620896, 62721827, 19298512, 442200589, 703419181, 516192966, 410291628, 239084977, 738613205, 992622234, 759126533, 485386550 };
    String[] user = { "ZaLEFFDEpFTOfqRMONMW", "jCOcOpkbEOqknsDVQTQrB", "zWaQrZtblQfSArDsbcyfDSNTohCyrtkcFEYlr", "HdINDMKwMwwZkCYBBAiikrNLTbArqs", "oIieDmglwdrPXcBRuoTDXuzCmFTunJvWYvdePTl", "YhiZfoYPUsFjQmNMSQnKAYuwLEsZIkjc", "VqhjwbBs nhUOPzqzJGraUFg", "xcXhnMuWunhJo", "mgubmFSxbAHjpIqVrgWmUUOOuFlfJagYqUWhuqduSA", "isLyMWZHdUiUsMmWsaCTYYSvqWWxDFILoutILj", "iMUDunlJHuSSE", "OfeJgzgFkjpmGaitvUgDFIVcbGiHawsdYIVZALjOgk", "vDmwZXFzyyvlGRPEDlGJRsOWximhOqZjKFPMgkGJPtzjUwEkH", "hKo", "QzpyUtFqACb", "FWgZIgZOeloXSNMEVelyklWMgRydvH", "SUAfGpseLBlffZ", "ltRJrleLMBAfjycNf", "wBgJzeRJzUfnAJOgeGkYtaSK", "VPvxxpoKEZvUyokCWatqDPHoriAXzFJMS", "qLnBaIaKVFxrLoqnknQcZZEAQQqnzbnADbeUeYjLdjfipNUW", "mRHE", "WjLkXgFNUyJmoODFPiGloRWWmJUqyGkDHswMekhQvLYmAC", "srioyqciuIdnRpXuOypJ", "SNzGZzVRVNmYgzLFRyYWEhrosdQQYPZEneAcGMjWyIvQqjibGQ", "cScWoFJyUUjPQFlJLEnURBcpUBNxFDMYNYBdnvrxrEdKEqhZoe", "YhiZfoYPUsFjQmNMSQnKAYuwLEsZIkjc", "CEsXJmDEirCBOhUbOTlLrLm", "isLyMWZHdUiUsMmWsaCTYYSvqWWxDFILoutILj", "IuqnQcHE iipnyZIMONXerfPGSnhCz", "RLAVPnVUkiajbCfDw", "mjNLmyrSwzwXVvalq", "KFYVeqmSLWDlyNmStJms", "PibcrBwxYGSIAMFEnGbcoTlndSbbzYuEjBkFSzXKT", "HUXSSyRBkEDrOXKZsRCyxoprTAPBTEvSrWsyuXaznXFcPee", "JwCrNFhZbmvAhjyTaseykLgTilTgemYJIAHFTKsns", "rPTnvxNQThMweuhtRFrXtyDLUCv", "fplpaHsFaOhFilsgbCnpYLAzulmyjIzgJjHvJkptWub", "IwITicNVStfohNOKQBP", "SUAfGpseLBlffZ", "xpYeKVEDiuTPHSLNPiAKjqYrVQpSNNkMf", "gYoZgYYnizEqKttdUyyDSMNi", "RLAVPnVUkiajbCfDw", "FjAFVuBJLIONVl", "SS", "dEOGWWvHNcoHrFqYdMrgMVtuqLtCCaImpDajrVpsrZGR", "RSmFPQgSIbpEsuAcbivuhvcJqrrYejOvbWiEOFuXzkp", "ASCNUEhIrWNfGZDrAzyErnpdFZFGhAZFdpApDxxH", "NJ b" };
    assertArrayEquals(new int[] { 20, 16, 39, 25, 23, 38, 13, 5, 26, 12, 44, 10, 19, 21, 6, 8, 29, 43, 32, 24, 7, 40, 48, 37, 35, 30, 42, 2, 14, 33, 41, 11, 36, 45, 0, 17, 47, 15, 4, 9, 28, 27, 1, 34, 22, 31, 18, 3, 46 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case44() {
    int[] duration = { 253342139, 253342139, 796514431, 796514431, 436412488, 969674966, 657522206, 497940602, 372923648, 796514431, 796514431, 120828955, 436412488, 497940602, 657522206, 436412488, 969674966, 436412488, 253342139, 994795618, 912258175, 436412488, 796514431, 657522206, 994795618, 913807624, 497940602, 912258175, 994795618, 796514431, 436412488, 497940602, 497940602, 796514431, 45051643, 497940602, 436412488, 184734726, 975800254, 436412488, 126781776, 796514431, 796514431, 912258175, 436412488, 436412488, 784940240, 309630712, 436412488, 475922363 };
    String[] user = { "sfpAUURrBjglVjMcTKkDnLhvHoDiSfKgJ", "GUuBBg Zt", "tyqBmfUyramBaah", "CWilzIMAniqFvGwUaPutat", "QGHabDZSWLLHdhEogKRzXhVTTR", "sjgsgiakPNjYTafzphCZtSbVVZQENHFEuNsSuIEBfixmlDsZEb", "urdFWHesFmIjSpEBSHpuZ", "tS QCHlCKVeAHnApUtNQqUcSIpxgaWTEAlGZgcfS", "QqSYnMwmZoxppJOqVlQPZfQVAsgFqfMCWxcaMtLbkA", "AJzNN NGOIVYidzv", "DcTpCbFVaWrtHzuPs", "QqSYnMwmZoxppJOqVlQPZfQVAsgFqfMCWxcaMtLbkA", "ILwggHcnIxfoLNuhuKBZfcMcAbGhQuaEDDqbWfppwYMVfoI", "czRryCxsCAZsSkBesQKyeNST", "KuQaUAoiBXySyHcNpFXnELKltUfu", "TmWIvfOULBRqvFKMynXR", "FwWuGVsbECrvjurKaqzy", "oQRvmNWBQjZZFbxAoAMCVGPNFveGjYNkOIcPKwALHAy", "xhOijSooqpagwRXikkGc", "pjISBgaRUWPIEJUuDDNeOfbwDRTQQTUCmnzpdDXys", "eRzpOxlrFECzRjHUBITVP", "sozRtkTGUjXfGHqRSKlolNqJDPnMeqGUopHEwGHWuKBwOs", "baLYVRsrxhBkDNtpLNiCXgIidOP", "ooaHHTjQIiwCbVmVE MCvXdHO", "SvbRgqPMjmZGqADzRLhXjDUttMLducBgUS", "HbKfpiPbyQpwHErnvUOcjlFdD", "lBabPyupjDlvmgupdsRO", "ZLbOVTmKgfSdkClxsURCImkRnFWtyvxsCDXNvNGp", "UGbI", "Qu", "APGKwDedJgWD", "jmQRoOomWavuILRnYRjodrwFItSVoRn", "CyHqGyaYAukDc", "TpLtfNfyOF SnRmZivxybEXYEykyCSjqOI", "uOMTWwIYrw qmxIGaiWtAdNFprPgKBgykbVW", "rtdAWBMcZeWYIBdpSqvEPJ zWh", "CytVGANAMgQknlLFMCxDqVqoLWCmnDrprCFwRiFsqy", "rZAfuUImzSLREYsxWJw", "iZSvRMmBeCqjsnQJIIiHRVn", "ZspkrkAQSVeYFtfrHekyeWLhyKvuSgtYKxRNrC", "pyYFG", "MXOOHtVfRsXovAyPXSrdrDyHVNXTvUbGmyDZwurlXd", "exWAkXhzPtmLfjbeykntbLtxSzQXYgPMxWsCUvtqkEPsm", "evHVKuvEqgR", "kgAWsLvYNLNtwEgoIcoykluUJCUHENyRhcVHQdLzWSeqhU", "jUYREJrmKHDaXmFVzR", "rZAfuUImzSLREYsxWJw", "pyYFG", "MqzefcAYnVSXifaELqiRNrmPxl", "QqSYnMwmZoxppJOqVlQPZfQVAsgFqfMCWxcaMtLbkA" };
    assertArrayEquals(new int[] { 34, 0, 1, 18, 4, 12, 15, 17, 21, 30, 36, 39, 40, 47, 44, 45, 48, 7, 13, 26, 31, 32, 35, 6, 14, 23, 2, 3, 9, 10, 22, 29, 33, 41, 42, 20, 27, 43, 25, 5, 8, 11, 49, 16, 37, 46, 38, 19, 24, 28 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case45() {
    int[] duration = { 113067893, 745218956, 551900134, 996091870, 877677713, 10021734, 443913382, 10021734, 10021734, 10021734, 877677713, 664411330, 664411330, 745218956, 10021734, 10021734, 10021734, 664411330, 113067893, 443913382, 397764080, 10021734, 378247429, 10021734, 877677713, 551900134, 10021734, 10021734, 10021734, 10021734, 10021734, 745218956, 551900134, 10021734, 551900134, 443913382, 10021734, 10021734, 10021734, 10021734, 528684926, 551900134, 877677713, 877677713, 551900134, 10021734, 10021734, 10021734, 996091870 };
    String[] user = { "YNG", "qZ", "D ib", "NOOqDUjkWMUyfBXaEAFATaGpBlwofvyeHrdDwvrlyRtZqXQ", "jCukyH", "I", "heIMYIUUvueZrUu", "VWJTUMhLBQQlGpcu", "thMncCoJFRfRSkAhlMJMblAXCTyrGxrFXjl", "pLIXYwPPfNlhDDmrqChhbPTGVA", "LfOAP", "rJXaSADwAgGbnrAFtiNcynmGoCS", "aZeqyWARrrShwbyklcqklcksxtQjECEfrha", "A", "wqpSHmwPOqnaQevvqeECmTmxEpsGQxFptPvImtm", "a", "oFIveE", "ASNkGYWIXDomJtMSWBXUAJRyTGMnptJOKNTgfDtScuiOnhDiK", "YlwiUrM", "aHuuYQOrPuDDqBDZVATEtTBcv", "swtKCzRWdE", "WcEUXlVvmoJLF jA", "WfCkknrkyiumdgeCKMUBKEXomZ", "uTRgUTBwoFtMqoLMUgIgZMPfyNlmjnashdrEm", "hhbgLXIwkM", "YWTybbBrQDxoNKwxZcXBWKOg", "qXusarYEuaUYCwpwUSq", "VW iNgZagSZYCLpFNvOmTasNPvhRMHYyWdah", "HYLPgKZgNfgJO", "MvQviGRmWwiLbClWOjoygNFqjLYdrN", "GJYlfI", "TsxsQXvNBqmNnEOFFJeAbcUAhFntlDTFVTwswEHdAlRRulQL", "TrMOmnVAcVwfm DxECByCjmHlbq", "iiDOyiOszgAqOg", "RoshYmztDVJKuWVevDHhuHk SWnEcwJT", "QiEoXljRWRz", "wDIShX", "Lcqp", "ojDnZmBdLodUXLKPPxHKGIjdzOxgA", "CsmieJjBENagFZnn", "dAWUiYozDqmgqKCnsHRptEFeFHPeaFFXXpAF", "InOCTfELkbAGMXluCsUYJWqESxhbIVkjqFRgulOktfMuf", "oYG", "n", "DInoPexOXdiB", "ItvFrJnOLZqcZvATeuJyaChQFcCsX", "kQyJDOCcMrtvnMnfzPWPDnvEFoafyTwcDp", "nIoQWTdmdBhBNmYlrPPEBt", "vYXyCJZaH RfgtsehDi" };
    assertArrayEquals(new int[] { 5, 7, 8, 9, 14, 15, 16, 21, 23, 26, 27, 28, 29, 30, 33, 36, 37, 38, 39, 45, 46, 47, 0, 18, 22, 20, 6, 19, 35, 40, 2, 25, 32, 34, 41, 44, 11, 12, 17, 1, 13, 31, 4, 10, 24, 42, 43, 3, 48 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case46() {
    int[] duration = { 330410606, 809378329, 831473806, 2777732, 57081450, 389823393, 394732393, 327632874, 88555735, 549851563, 401655467, 845215343, 583198321, 113927915, 457693510, 215271018, 583198321, 457693510, 330410606, 413623332, 631790184, 282552985, 549851563, 922228337, 924729767, 763522944, 664808523, 188815172, 389823393, 924729767, 86503346, 212952338, 144639820, 207050911, 664808523, 227762572, 555228912, 149364084, 413623332, 268878338, 331075043, 972172061, 144639820, 555228912, 547582988, 835141650, 457693510, 394732393, 443089605 };
    String[] user = { "wNwShbgFHq", "tOdEEZlKtKNDgmKefuCNLsNmgmqXkQuMVWNMoXTBKav", "ruitxGPPzizseBhirWcUVtaWwhlgo", "ZyzdCbFEJFBWGJB", "uAOEyZxT", "NpyxwsbSdmJzCTGFYPpQ", "UOUbEMmgMYfQiCBuM", "ZyzdCbFEJFBWGJB", "EgLdygGRSBegKTGmYq", "QwzqgoUXEOZKyNnEWmAT", "rQOdhmdiIRbmjbMSHcdrkJJvkY", "LgqWDEUyQMkXeqtwvqbYDnQEkkkG", "jOe qnaVpxlWXxBQEceSIPm", "HwXxGoW", "DwpiekdjNomBHgXTiaLubKwjkZHUxoQhvQFrxhumjOvkmaiOh", "HYtULAwruAkmSCIFFj", "RDzZrZJ", "GIqZYbfgdXBKcxtSVBnbAaAvydqQ", "owGDBwbOiOXgYfNbxrBsRdArCmWUpdLy", "SCpaWnxNFWsYFvZhIcStBqBeuEksoBwAoAvAtihvp", "gaC OASuprQjHOYYowPUJxlxYjnfmUeMsdKBvBSXsbkaizczR", "scdihmBGLwUHvaUrtCnSiLv", "eBWcbMCRpWPkTnQQnpBanZIaiIVsseBAelzmOsuaRFAA", "MyzrtISvNIALfmkKXkyabLetTdoCkD", "PyumvCnsMKQvAcZSJRewZsklzJQmMwoxzfsaftFluZZYBj", "Jgy", "WPEoayV", "JZPyshmSykEmYuY", "ZOCzrriOzzYDIhpKJY", "PtgNwjUnGPLSbVnbZBgLWHSlntVOZVKtWKjcfV", "scdihmBGLwUHvaUrtCnSiLv", "QOTMMqBao", "xJKUWVCbZmwcQQrIFndiDMhBIuVsOp", "KllmaDYypuyUZdlyvOZpaYkKbVCWAKyZhjWMuc", "zPhPqRkezafwudVNhHCDNtWvvXmShMQuGIZJvtevuPXtqKpH", "SoWJkiRKdJftkpWmpCsYsXCVH", "RltgSRTVRkfWLhaFzkwgWZRNHbtOQfKBhmVikmuVpaOspq", "UejkhKccxpR", "TsVniZZTljOvvzAJNhRefZKaVnrvthEgtq", "JZPyshmSykEmYuY", "YpYSfhNSfIHqNgQLLETCuHuGFVCaVjD", "kIFcjMXNRPPJLJuEUiXrylfFTPbCZUSOyHAfxqdLWZjE", "upvlESnnekMgHsIMLNhZnpDOZWzSvCpoGQJplnlAz", "MAmVdnyIkyGSZurGfAQTatrQKfgVWrTXON", "KllmaDYypuyUZdlyvOZpaYkKbVCWAKyZhjWMuc", "fPEISTvBZNwKakxhlZQcnDOZpJlidixozluzT", "ECJlnGoVyCcrrk", "qLKptDCUcWnBZDBaQFjZSEbwoyzZDUwnHywdvOqK", "cXYnWR vkUQrPVZxnWYOllIONlJSXnLlOfLSSBxwIlgXmR" };
    assertArrayEquals(new int[] { 4, 8, 13, 32, 42, 37, 31, 15, 35, 0, 3, 7, 18, 40, 21, 30, 5, 28, 6, 47, 10, 19, 38, 48, 14, 17, 27, 39, 46, 9, 22, 36, 43, 12, 16, 20, 26, 34, 33, 44, 25, 1, 2, 45, 11, 23, 24, 29, 41 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case47() {
    int[] duration = { 119324562, 995603723, 149254570, 995603723, 119324562, 995603723, 232395571, 902822785, 119324562, 995603723, 232395571, 995603723, 59349937, 679333861, 902450472, 679333861, 119324562, 902450472, 119324562, 902450472, 203523773, 119324562, 149254570, 891856672, 995603723, 119324562, 149254570, 232395571, 995603723, 10593800, 232395571, 995603723, 902450472, 232395571, 40909082, 149254570, 59974625, 995603723, 28871798, 902450472, 119324562, 108345488, 149254570, 119324562, 902450472, 232395571, 995603723, 232395571, 149254570 };
    String[] user = { "uJCxqyyzSmsYshQefTQMuJPNH", "fVhkyGerPwomkzdxYeuCDiXFMgzJLWbi", "RCyxhdwmqcJxPjXDLjymmzDAjpleqSDaxvoqTLQeItLdnvsEKI", "KhyTxdnsnPqascQb", "bfrIoWoyHwM", "m", "kOfBFwCEEPSmrawNgnwJAYOaYVCMSKXt", "qGEtXCAZeJNxzQfxBAbilYcY", "RGghTljxsLmwLvQBQuxiExStoSEMEgzngPwBsthkAAPUUxicsd", "mSUahMaVktUpgLvw", "zRkFIJsFpmlcNLtzDwdnzTTtKZUIKcunUYv", "KkQxwTQVxfqjzHsYGgbynEzl", "dWAVVrASkyuKcEtbgqyycGALRhslRuVBHkSvqpVSNIEIE", "SjGQsCfbviXSxvDTXwquUFZaFIUiHX", "GmAtwCinQhSOgvhZqZMxwEqbLMmATzDipVlGvCSECjUycj", "fEfvwOezEjt", "cvnazSjUaxQaUQtBpGXMdfopGpKQOBJmanPPjQ", "GIaZPtoqRmHgjAlCHprknhioTrhDqIQVzduygMdCDIcdCkm", "VDOZPgB FtCAVIvdvlIYgpLbADXnuffSgRaG", "XdoEcbEpWFNauauViHzRNuTvcb", "IyFGbiEHObWLXTSRcvMZTpHBAkRGvBmRexoGbkgjpE", "ClhtssBvSPjXSBmPFGQXvAmhkMOpuaKxkzZqiRukNmp", "bqWFOAenMxqqYNgtFiMCiCPZYugWxuZCXYNucGRTuC", "RqjgqefWQElwjFkIkWgvDQmRudPoqfWrIfokbLY", "pbiriRyAiajdAlEcnCifmxcBx", "vaBroWoKQFOKEtaLEZoXNHwjOYdHfmDMPtQyFiqQm", "CaaKCjPGImAaSIRuDRWvZtzVoSjCzEqdjEynomWH", "ZqeYlQhzlrhJcCnLLSUHzsdelQUzjIoQfRLjdfmGPojJH", "LCbtXnz jOLXMeBNMzYdKzeF", "RqjgqefWQElwjFkIkWgvDQmRudPoqfWrIfokbLY", "QodjhJFzYPkWdKkY", "ulrUQIrlSOOQoEaCZoLMzeGAXQIbXHJqefYdr", "cVJzhAEheGcpshCKGgTDevevdzkmoCMWJN", "sk", "iOlZxDSjDaLIMQRMQJvZpbMaJSBUTLGzNhUdbNjAchQoW", "FOTXvRaHMHipDCNHgRTZvCdAyfIPeUomdeTePoTTiF", "dWAVVrASkyuKcEtbgqyycGALRhslRuVBHkSvqpVSNIEIE", "PeoSmMCGJpsewZdIEkPvebOaUnDQKgSe", "IyFGbiEHObWLXTSRcvMZTpHBAkRGvBmRexoGbkgjpE", "lDVNofkyxDyowRrBNrM", "XxS RNNkjFHaqaVJf", "iOlZxDSjDaLIMQRMQJvZpbMaJSBUTLGzNhUdbNjAchQoW", "kRMdLdWExzKkPMZbuOSolOHiVlR", "JklhgnFxwZhZRNqeDpxaVrEwMrdvylDndnpyEFmmMcaiSStVi", "hManBXIuUIwkFnqOWNtKpuBnuwzFkQcgHwzqQiryOVwhzus", "nnSGldUeSClwDKLLVDeWDvaIrfeXVNcYePiNuEAGDMT", "SJMfvfIfaKHorPAMWxfe", "kRAdelxwRbideCMFcFMFohe", "qRqmcxczkAPqlArVwoLfqOsNORmLJTpoRoQbrxRmVIvfllUTu" };
    assertArrayEquals(new int[] { 0, 4, 8, 12, 36, 16, 18, 21, 25, 40, 43, 2, 22, 26, 34, 41, 35, 42, 48, 6, 10, 20, 38, 27, 30, 33, 45, 47, 13, 15, 14, 17, 19, 23, 29, 32, 39, 44, 7, 1, 3, 5, 9, 11, 24, 28, 31, 37, 46 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case48() {
    int[] duration = { 973082329, 378695273, 423750250, 693892671, 552992937, 244737981, 285697360, 909304035, 328477156, 96953714, 423750250, 18252393, 988637265, 958166365, 212939714, 416680254, 958218235, 509004797, 247740855, 413937251, 695558440, 403511066, 209874127, 324127983, 423750250, 956774712, 731148943, 209874127, 413937251, 566265445, 956948791, 581430689, 310057777, 114175572, 416680254, 909304035, 930386114, 18252393, 526759132, 18252393, 212939714, 324127983, 413937251, 690003259, 209874127, 947576274, 285697360, 413937251, 717994402 };
    String[] user = { "KmaoExxbStCgidNmpy", "Ppquso BbTMdzvfvk", "YdDl", "LKKGcqVLcFdpXVWur", "OPLj", "YKuZUcT", "uhoqYlhpLniAYCNQnDQsQPqvYFDbzUUohf", "PIPClXEvoEUgbXhFQQkYwivICuPHojeFskJWt", "MnaLASUjVdhaLPubgtXLZLVxIOvZCHms", "tmcDJFLzGfyjzAssiszlxeqJBoeotjnGASbtPJEMNMBaEUby", "WRdBNSLu", "vy", "OEfQBwilKcBQEioGDEkoNXYHQCTCKBuaFRH", "bZjGRovOMPpQwQUHRTr", "vmbbMKzpAHKtJgCQQMiLARlKPmOxTpkVHPNYeOjkYYmorwkk", "lqatJvlTgdbtpNlxjdHxkFZREttupYnndKWTpuAseQGelvYbjk", "HDKogWCzdZsmKG OCklwunWhpHbdL", "UsqlediLROydnzOGvgiiTvAzGbH", "myCTihTBiwfwkqsHbjHxQlsfPG", "yfVoWVzybJziWxBMJiNHBpIUPffsAUHGiMwJT", "isdDuQXYRKnLHkUGVaLtqfJlrxNZCSTIWDuoiinpEOSxuIG", "zo", "vrfoJNlikmjgRnEccQTyaRyv", "QPvrya", "xqftgPbbFEwuTrDlpCrWSllUAs sgPH", "vYnKBJnRNiEVEIsIWMSskYtiHXMcBMO", "rCmSsWFGmXbRnbmuhqvbf", "OzOCmVkNgydqxp", "cXbwhxNpqaJBJEYSHsgMvSDTEcxSvAF", "SWSRPU oP", "rjJvBZGbOlPeBRZJrljCkKkSdiLxmKtxcFXqKsLXriCqYbThc", "qqqNuamDKcygS", "IQbQJI", "OHvFvjLhSLWhkeETCgB", "entzXRvJfiEUSpbWe IoiNrOQhpYuogoEe", "TUkOI JwYwwEIIDTbyICMekj", "ewChEuQIOHhQTwjFZbeClZPyONmuhBcIOGlCfKplmA", "fXsdRcgMniXtPhdWoz", "eGWSgPhbDopNX", "Kv", "kuIpUfPwAabvjeW", "IHkCVRqzLMJZoaZshifVWXSVtJxARRbSedCbJyQJJUDONMZ", "T RfXwVXtijoswqOO", "CkooshmKgpfuQlGOkYjJVJScnbGCPozOpojzMSMdNEACKtyAh", "IxXFdagpRMLsUPwIBDHqjDPOJRS", "MLRSDKsrMoLUfdKUoLYxHhuysvcGfAHPpOiULWkmhdXfAjV", "MGZnDsvhOhEbRKJPJsijMqYGTvbozqBEruOQwpva", "QuRBWQzBcuoMthDRRjvcFlKbWWOvgWpwMVj", "atfJVyKqJOtktHpINfxgXmrnUpc vtxLwLEGtGfxyXIuDcb" };
    assertArrayEquals(new int[] { 11, 37, 39, 9, 33, 22, 27, 44, 14, 40, 5, 18, 6, 46, 32, 23, 41, 8, 1, 21, 19, 28, 42, 47, 15, 34, 2, 10, 24, 17, 38, 4, 29, 31, 43, 3, 20, 48, 26, 7, 35, 36, 45, 25, 30, 13, 16, 0, 12 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case49() {
    int[] duration = { 266899541, 871480672, 668969550, 822452286, 669094921, 258742569, 258742569, 871480672, 807947868, 669094921, 674838322, 674838322, 894335486, 505188298, 807947868, 669094921, 668969550, 894335486, 894335486, 258742569, 258742569, 674838322, 669094921, 871480672, 674838322, 258742569, 258742569, 669094921, 258742569, 807947868, 807947868, 258742569, 258742569, 871480672, 258742569, 894335486, 668969550, 669094921, 668969550, 246396095, 668969550, 668969550, 258742569, 258742569, 871480672, 258742569, 674838322, 258742569, 258742569 };
    String[] user = { "sYMwBhljelrJkgmlFdTqv", "eajYirhenoPgjhVabcFvGhICTkmvc", "XJFBw", "sXnAAPv VwWVJhcfSPFSMpMxODnbnoQgUcqDvOGJtgBbxkp", "BEzdiFmRSnmCkMOAypnJTNdrcvsyMpNXUljTKnkubHEdF", "ogURFeOMhOdszKjGGwzBaYwlHckiqGLOPMVAXfAhBn", "qCuHoBXBTncryDaazKipuwtVVcvZiamamayyBBDNRBakhOsnim", "whGGmdDuDNdMZqIuQIEQgJAWAlrrjYnqUUHviKwUpPSR", "MBRHYPdCLONpyAguXxaAzjBCpTZCLsZvlAR", "sGqWHkqSHNulSuOFiAhFCIlzrnK", "EDojNKphPbtqGrJjbrNEboNGiKQmihyWiIEgBXVRmIO", "yTMtyJVlKSsjeGNAs", "kAIk", "IKVQkAOtFINmcRkCVQOabuGbmi", "AclNcHFDmKAIWmj PoUsesnSUXogPCsADZRZmBlsxdHhf", "vdKvTuLkfQPXAJTNYXpvjgPG", "acdFxIyfGJQhfKmudapbSeBEhdrURpaWdnpp", "AqmjGtWEKjuCLqqrGBtFQyeAtVnDsyBCxbvRGo", "qjrahWdkqe", "C", "nUfqFIEcburCxnlAB", "pGCFNweJgdsooqnmBaPKKXRqiLagMeYt", "ZDOtnlmlvqZRKZZhtZWlYrNDEnzWIbSKVM", "KUWcpiiSmpJHrOjdQrPRxlqLFXjDm", "nlrRswcpdStcYl", "moRrHxLGLmmJMpBRNaWFMDrAyYaPcQzpZtJHSNfkWv", "OzHBZvFACLtrrarizdfwyPFtHYuhcVAasNffkTL", "KykTrBceV", "EWdGmOgrXEyJQYCiFgSUfnJqnEQMGzwBkq", "FilarYFjXVcspAjWYnPDPMtACpTNJGjQHTmhFbDAiupOWcFV", "vaIykgETaSOsRlPQdPigxQUVRDFlolaol", "hLaNnHoFBFYVqebuSnFtmY RfmIl", "eghniRZIMkNdBgBwTtHtCQvxfdSaDHcbgRWOyAQcG", "vJpqsOJruZPXnyhThxKLarQUxj", "SzqpfHRqcFrFloKgpHdRclwzZEsETQarjCPtIcT", "fPdOYJBMRQV", "pXBvXFYwhypHfaZVrpaMstvisYeyHWsmsWDugVVrOBxOgtd", "mKbWuubCKGJutCcxOHAchoadjGYAYpzbpmuYdOypH", "KwVvfBijLixjfzRYTFRHoFOjZRQZR", "KBmfvJsQWPTJRubKBzXAztafZpCODdlKwMNX", "xGCcTrRTjZYJhxljV", "hJBesYHlxpSSZeQAmzkoBRqISHLtagxGFLRWHvzrJZgsRdS", "BCFxtpXxXIsiCesCLMChEjxpQrxcHKGvKugm", "aJZlHYIMupRvJAKarLQpBqIpz", "DIuJQdBTdfxPCyrfjmeYfiFOOMhKAswuON", "kvBmnEBPsEJExsFR", "KVoFInVUXyhZopTxLjJMSOKBRJbwHKIZo", "EmhDgydNWgWySszAMGIkkEcoJjMkewGHfgaG", "taUNVYzzPleXrjOFcGqSu" };
    assertArrayEquals(new int[] { 39, 5, 6, 19, 20, 25, 26, 28, 31, 32, 34, 42, 43, 45, 47, 48, 0, 13, 2, 16, 36, 38, 40, 41, 4, 9, 15, 22, 27, 37, 10, 11, 21, 24, 46, 8, 14, 29, 30, 3, 1, 7, 23, 33, 44, 12, 17, 18, 35 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case50() {
    int[] duration = { 796692227, 184711122, 267247509, 200950478, 530037914, 969034480, 99556261, 655807262, 730919076, 267247509, 611349681, 238996159, 671764424, 267247509, 822087088, 271760411, 526922953, 271760411, 284028076, 11874160, 570403070, 730919076, 981601909, 267247509, 673091064, 267247509, 592584620, 636210286, 267247509, 284028076, 184711122, 981601909, 184711122, 78486270, 526922953, 852474287, 526922953, 271760411, 238996159, 592584620, 267247509, 828010183, 200950478, 619294280, 796692227, 636210286, 588491976, 730919076, 99556261 };
    String[] user = { "uuqPEMkwyoOmNVUKoNCsFVvmKsxOEtlrly", "ZDWbYnPvInCOPGmLIopBtUyIbrWikXwPMzegLJpBTQ", "pKeEPqdWAthxpZEKfsSeoImiCDkvX", "rYKHtbIyLkeUgcqlQaPIrPERtCLdJbTvsiHDC", "gGnQQlFtVbScUxPyVjGzCesEwqFIOBHPtoCudVYheoKlDme", "xTYzSdfToC", "zO", "nNyoDQTQUdqpPtPoEIynsFhcc", "XAUQlQmjViutSwAPhgseTFDKALFmkYraohk", "WtICcUjCSQegRt", "ymTvPnzgFXjjvSSFE", "zvwoAlRKdRJsLl", "rtJRMDkiDLeEQxYdIHSGAuoZQlxyKEVcMaDJvgUwi", "pDTBMmLmMKNViRcyTJzXYmAVMvtmalJvuEAfQGNxqjcwAubw", "DBIrZyWGEzLfekAWZlnWYF", "HzgUGLSHFzBXFzCbmfevFVInUgVTzcI VecX", "gPCpDpllEMZRqhELASuThKBBcOavInFdnIqHiusCERbZQtgUED", "nOtruEExpYFXFkmNvxpRdT", "OUEROvLljsStSHigkWDdYSWheUfgMHrv", "xaBJtdZldiHIJzzhrDWK", "nmtPoTAkZa", "MekGWZAoNgQXZQggTYOmkXxhArCMobpGzzEpcYL", "RXIqmSmGCitGizPZuh", "Jxba", "AEOzeMlmDvKre", "qulEoBcMXAfEZUmPJRbAQzsWRHzea", "yehpDFiaNYfObmnvzsMfftYZMmibjKYuczTioanYjtdAsKV", "HiRfm", "rUBkBAly", "WcEKe", "q", "EsamAGbxxAySSuycaseYOTzPTpufrsSPECcJYZ", "UMgWIefBxJsVaBpgpUZe", "iTnBClVzGnWcbOlaMNgprhqCBYhBzrpazXVIDwTurfIbRhStPf", "NckBgpAlyXMlpmMWKdfBlYWKEZmMscB", "EYWpgGsJWuxvKmnNAVasUcta", "eaVOihVnODzMfpepOZAuoAlyW", "avOi", "plyBmLAdwhOKrIknDbWmJZZrn", "SOJYiHpenxgVcImikcQhReOpiADZklwyULLLgXVN", "XlTnkHrJRQsJzNxTbbleMxITwTNopnEidBwrLhSRanK", "vauhUssRNmOyQVDJ", "NRwbsdFkQSccPqEbeiXVp", "iYwoitoSshyIQkmsBOjDKIMUptMgTBmb YqnJuZ", "qVTjmlIZDsHWmwqwUuDypmhPWgOOxqbxUULMyUESeXeA", "So", "ZkxgTTjpArGDwgjfkbVYoMMYTSSfBULY", "EXBrJwLMF", "AStHJQwFdbOfLhxGKf" };
    assertArrayEquals(new int[] { 19, 33, 6, 48, 1, 30, 32, 3, 42, 11, 38, 2, 9, 13, 23, 25, 28, 40, 15, 17, 37, 18, 29, 16, 34, 36, 4, 20, 46, 26, 39, 10, 43, 27, 45, 7, 12, 24, 8, 21, 47, 0, 44, 14, 41, 35, 5, 22, 31 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case51() {
    int[] duration = { 227815223, 757120222, 757120222, 838540828, 757120222, 757120222, 730040335, 730040335, 730040335, 902251569, 730040335, 227815223, 297043621, 902251569, 765416474, 227815223, 227815223, 227815223, 838540828, 902251569, 411158376, 902251569, 270913156, 953238351, 765416474, 730040335, 730040335, 270913156, 757120222, 902251569, 6631947, 838540828, 765416474, 227815223, 751692705, 838540828, 90089480, 838540828, 90089480, 953238351, 953238351, 520642245, 838540828, 838540828, 984403775, 757120222, 953238351, 757120222, 765416474 };
    String[] user = { "lyuwUjBTaLCTZavyhYzMzc", "HOceZqqPFHHWOzqfKEzQzfwpKfnzXldZBdLRWOxSXeD", "kBYFhIAJfxVIlEpLlwvbjQSoWuZOtWJBmXtTVLUuCqjvy", "vCNUcJcaTMPolwwOHuPIEwvo", "eQlrgPDQkVhJwWtmLWttU", "FRNqrMKV", "qxRevyfFJxVyLkroyWcG", "TaLHPcpwGAJEVQdzyBDzQgusvLwITmB", "auUqfRjBTHgbHpCgenSRxnCDlQQMVMmScubieKkYIgFv", "qXgqiYOtklABdDvjZdUNRMuWJ", "ObdzjGqVXEOBcQPnMuOEKnrMdidbjkppkhjoFqnYwukHLaqJ", "xbreSb", "QZSRhpSzKQmIG", "LbAlkDEEOEGwkGMenAz", "rIpPAQMqcltotLsjmWUrwbWLodaDoxhxCYAbSEXlYzqnFzcIFW", "qNwrACTqBbalcPXwMaFSrvmbPUUnYtcnEwTSlGq", "wntiVIugXjEGUZJcaVEtAML", "GDMVFtvoUNcOS", "KmhTJOus", "kQGTzxUKXcmLIQtCFizeIZTDWzXtewaQfrtLetJbQkHKqug", "d", "pKVjRUvuyWAnkElQidqFrTODymPPq", "qMVifrYBoItMYBOSkl", "OfVIbNYFAEFAqFZq", "zuBgBkroZrntaKkiBgwVDDgyenmUtG", "TYvPYlDcSzUGgPNnDiWKlNIQDYpSSEAebHxFbY", "kJiUr", "OJEFBIvy kCxpzpUqeWKennBEAAa", "qdAZVZYWdQrKucSxzrPkgV", "WpIpidYiTKMnJjJNbxEKRFqCFliygrySqPf", "GLTNecvnR", "ddiPchpULCgiLLNWasY", "xHwCOOpYWcYlmPqlSuEgXyOttocLbuZqJ", "UMkShbrjZvfKqvIlCanvJfNFiy", "wEklRWtlVgIoJNiHZnSnhtSoipsDFOokIo", "cHaPU", "ZDJKDMkiZrWnYtCnqHfqDQFrVbmrEadf", "EwuQ", "AGZWpPJyV", "cauciiumZLhqh", "tHDAlUHxsNnReDC", "ov", "WVPRPDVaFVJTjQiKyHMCqbfBcuxbalQlkbHqVj", "ZlAIteWeMYcZFsBLrmBJ", "kRowtpRjyithlBTZNRajgkALcxhmKbBVKZr", "PvlEHhpGeSubW UZZtIqwzuljKczliDinX", "WxwdAxYXPzwNO", "uvocWvRqt", "gjMrMamyYENfbrVdsAzIMICNZOB" };
    assertArrayEquals(new int[] { 30, 36, 38, 0, 11, 15, 16, 17, 33, 22, 27, 12, 20, 41, 6, 7, 8, 10, 25, 26, 34, 1, 2, 4, 5, 28, 45, 47, 14, 24, 32, 48, 3, 18, 31, 35, 37, 42, 43, 9, 13, 19, 21, 29, 23, 39, 40, 46, 44 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case52() {
    int[] duration = { 352890402, 449499404, 155371475, 664643748, 475997399, 832318298, 143631096, 719562689, 379369123, 616488015, 315253769, 282399408, 471232471, 832318298, 661012478, 272616962, 609599981, 89368540, 315253769, 539228726, 155371475, 719562689, 396191507, 832318298, 683567512, 134498498, 719562689, 832318298, 832318298, 405151996, 616488015, 227166101, 980011416, 3089807, 545927882, 719562689, 765731639, 832318298, 719562689, 361664599, 719562689, 449499404, 224826249, 472856919, 616488015, 405151996, 449499404, 471232471, 349750736, 891147617 };
    String[] user = { "ZVv", "DQpjdudxKvkRSZ", "nKqJIeQTMfquZOOyAIwQPsWylRWOVjGhdDr", "FJoXEwWIIvoCPdSXc", "cFZOFjPxOshqYsBcyJdynhLqgkVpejRcXeZErtACfljVlfUy", "MxZyOmNFRVCpJyMJVHbFACnjbKxJpgDslnAFLkorLFYANem", "xuxKYQRzPOmoappqnSXhqhLPqALq", "socUmLVvsHCVhYIMFAROyGeRZqle", "cFZOFjPxOshqYsBcyJdynhLqgkVpejRcXeZErtACfljVlfUy", "OSfYLcWhVtLzNXmgjLQVGcSb", "EvIVrvmwZBNYxyeJTSNDoYFYb", "XMCEIvdWcZqoDjVveaCknJCjvaFeHaZzQgxXPnrLfI", "xuoltMUZkkMlOCcLdNCadRLgUvZAKdAxdLTdSsXQ", "UzKXrZxb MC", "lQnuMseyaMEXnUbHOXcqrpLYYdyBMiA", "XOC", "WjAdnRvAu", "dPALT", "tfZXl", "xirNPCmwIBSZA", "vUUx SXEAySpLEukAi", "ZgKWxrjaxtBxehOUbnjQZQWWjcfQugwYKpNXvdGK", "EqYWUplqKGGJavcltBAhBaeApX", "VxzbUeeDiWZBNXmGJHbFDLjnMjbSnzEfYVqBApgMIZKzYA", "tViZzTp", "nAfswmInmMLCcCooFdyaAI", "BGanLWzjDmGP", "ZDNIjIrbTuTyNSqWynedz", "kuDMfuu", "LRQqZyBJmOpqG", "mmpRmyN JHpwY", "nAfswmInmMLCcCooFdyaAI", "ZdZjKVxsfHrLh", "XMCEIvdWcZqoDjVveaCknJCjvaFeHaZzQgxXPnrLfI", "DCfHQLWtKPwaPvmaUhSFDwfIIFEALUVRyCibgcv", "bGLWJOxhnSdkVKBGRCKPMkA", "xnbcpFrnIyXRTLfuisuACQmzrzKXsfLZDpNtjPUMf", "v", "EpuSpLrshfZNNZWrSHwEtLBdtFSXSaxlTWqIhhCSRR", "D", "XZWUlhstaqTVRYErcymaGGJyyxrTTTuIxPLbhT", "wVtYTepaojmstJ", "xxBFcuBMEpLIYpsrtKQFJWfTorEQxTfMLaVTZtPcxnGeaW", "xuxKYQRzPOmoappqnSXhqhLPqALq", "ACpRcwyy", "uLTfpsfkZfjsiQgZGnpFqtGaBSItvsmbF", "NppzKLXhdnwYTPyiXzIZMuBFHvEjikYsaePiFpEvhGEKZOu", "UgqXmqvoaAWUjWi vTizFcDfkZOCe", "YFsnxDzdkc", "dlmpvuorBqFWDRFRjHyAWglHRGEukHQRmzXjcKXIrGolMtn" };
    assertArrayEquals(new int[] { 17, 2, 20, 42, 15, 11, 33, 10, 18, 48, 0, 25, 31, 39, 22, 29, 45, 1, 41, 46, 12, 47, 19, 34, 16, 6, 43, 9, 30, 44, 14, 3, 24, 7, 21, 26, 35, 38, 40, 36, 5, 13, 23, 27, 28, 37, 4, 8, 49, 32 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case53() {
    int[] duration = { 177224413, 670317914, 38370919, 55669100, 243340673, 486541089, 243340673, 670317914, 243340673, 243340673, 177224413, 243340673, 243340673, 670317914, 945497100, 177224413, 243340673, 734608396, 670317914, 734608396, 177224413, 192671344, 243340673, 243340673, 177224413, 734608396, 177224413, 670317914, 734608396, 243340673, 192671344, 670317914, 243340673, 243340673, 243340673, 127362480, 177224413, 38370919, 243340673, 243340673, 734608396, 177224413, 542955434, 243340673, 243340673, 243340673, 243340673, 243340673, 243340673, 192671344 };
    String[] user = { "walhtbGgYyVuPsIfNykzBh", "IhAkfDzQHEqXgsUyVETpJSqGbbSsRCUuhbJsyGwdjASl", "Bg", "kadXCiXX", "JzMGIOBL", "TYFCwWntfUdAeGpIOLojURQKZdqE", "QGXOnaxpWcROaRcGRJbxHbW", "HfCQoNtPgUIuOMmWndUAxrYkIvr", "IReJEhUrGZoYmiUrkoFPncMBge", "ICmSigwCKIMAETSZdqVSuZHdcNu", "nVLDty", "tWlSDcdDhvAfO", "BSkuHAiMYDQYspzUazCRiGtvdMPwViWJYVyeMNsFSs", "PUDTLRyDkAe", "LWITFbRNsdQmOYkVFnZpkKWmAyxEoGwLzZZtotdPEDFOtUGuyv", "kkNtbOxIKhhLsaO", "uZYyiesePoGPMBMZg", "aX", "PHWJiElBMCDBHjZXlWAdeUIEEkoejIkqRpDROBGKz", "CFAnyxJF", "NWKaAONvLdECQ UkfywTbPVgXzjrIJfhfbNvVFvFFJbVy", "FFBBJvHbNjchnBEyBiHMPRNPDlSqaEoDL", "SelxaZXdOsibJlbUWFYElLVlSzIxsLJYQuJLUxQPGzBSVIO", "gbthxcjBxFIjlOAexeVeBnOgFfpUrNMJ", "riLZmSC", "CThJWgDlWZ kNucqZwkbHV", "BKaJCwDzAdMvuOWXoufZWL", "pJqSskYnCKbkr", "gWNoTTWDnwIrQ", "IHVXXDZiM", "vIrpUenUwArHIgizsybWZLmxzHfKZRcuuhuI", "TVMhPtYDTFJDuVmuKtWhuVGaREEgbPtAsgMYEu", "mTCbsjKDwrzWOFx", "vmqkHXVtZiOHnvikohhCIwvHsjPuSvVbwBjHZzltMtGhDO", "XPgCZAUltuvNNJUEQKDuHTxoWwgePkIQBkkmVDGpcyEzhVCmmP", "jVIudOlyeOlhrQsAovXintmuMLefeptkOeikoKHtrxtSUIaRU", "aaQyvUQAWbDcI", "aepiQCOQjQVWvelHxrAbAbEOwdxIxLcFmJAXkNBVNnXYcNEWTX", "qAQniJoEdYhLSLMXGYRPvdYMmnFkkPjHQv", "cPhrgraAHFaFsGrFiUW", "MSxhfHozy", "dQIXiEQnNcTnglrYBBMACLnnTGHuJwXKCuA", "jVIudOlyeOlhrQsAovXintmuMLefeptkOeikoKHtrxtSUIaRU", "Y", "uEBKoROhWazlycsFRtVImaG", "TSzEHLrnHqwWlpbyIMzgWrMoB", "EFoaXYmeolYrNnjOWvCEwoTcrgTDsMRgoCZVpeEzQROaMcgDlh", "XSYHNDdUAgW", "dVejThDySHzrDvSSEojPu", "F" };
    assertArrayEquals(new int[] { 2, 37, 3, 0, 10, 15, 20, 24, 26, 36, 41, 21, 30, 49, 4, 6, 8, 9, 11, 12, 16, 22, 23, 29, 32, 33, 34, 38, 39, 43, 44, 45, 46, 47, 48, 5, 1, 7, 13, 18, 27, 31, 35, 42, 17, 19, 25, 28, 40, 14 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case54() {
    int[] duration = { 432017485, 370287452, 107462318, 599141841, 734049849, 916419582, 257020177, 257020177, 940527221, 257020177, 257020177, 938746598, 320019051, 169733238, 342063422, 351499130, 351499130, 155628872, 51393356, 577775256, 569369955, 819769171, 351499130, 569369955, 950703420, 42467256, 281163616, 828808285, 823106432, 355479453, 950703420, 569369955, 257445017, 715158479, 6742090, 320019051, 419611339, 663377282, 619051154, 916419582, 6742090, 483264913, 148691658, 543845143, 268829195, 950703420, 501106173, 257020177, 773444285, 355479453 };
    String[] user = { "GQYgdaVRNtoSvbFeDmKPzxhjHCDjAwtLedhnSlHekKQgApilcR", "NIogjRZNCYzPPSxiTvjsfODhfDzkcuzpPEdctQbZimd", "gGlYNztKkStwiRAlCVaIhZqsuACmchjwJidSnKTdhoY", "igBEUxLcydhnUf", "jTEowMyWiLjgjbYt", "GIiDAIMjOkRwjY", "QfxYFIbi", "hgNNOpjRoMqDVRwbXNTpEvEuygWvzBASKxmLqxsYxtgudTPz", "ozpqnqfHTmtwBGUhkyGzJy", "HMLOFvrFVJibvmNAlHiphWEHaqsUEnDeKKw", "a msULLMcTpzdeUuanEsDAqQBH", "pMKimWkIirfyCqbtLTgLXtD", "wyrChLutRQymVtxlirCAasrJnETqQaHboYCNaaDJiOhLE", "IJzsNeNJgeCtqAupbjFZoDYkrDirtNvVVYZPWXine", "dshlnBepxivEOhHFSjaOxthRvlWjnucGxoNmYM", "KdOoaVklcAqxCciOfNcZtApgFWz", "tK", "qM", "ztuthoZqhChrSrXasewkSBkdAKDVRSAkeCZjCRan", "PVUoNzmmNRwdLbzJMHT", "ePxIynGwAOuiljRUKzIDzwitYJUHdBtkBVu", "TcYeGVUMSbwkEjwDriuEiWQyYvQqHqdha", "zCiupwRevxkikdGLzGowbOnHjDR", "MyUnMJkszZwiYNIrEFUV", "iZLoVvi", "jZdDQ", "patYGjBodejR", "ZrfVQYarcOMculTWBuKYwO", "IULmMkNaFrRqRhBwpEdCImbPqcCffXlbPk", "vsTyebSEIXkeFuOYlzDcQWl", "yyASuTm", "GjbtortwuIicyApAfpQsMqtWzkjystOPIG", "IuprFLwdjEXjFSxRMStwLMvLEqXjDEogrAEM", "mGorddmgUmTQDmEDToHr", "fgMvPNrcRtaSszfUMriXMCKdQUTLRbaqXySMEuAXeXrolk", "nLgWiYq", "qVPRChClrCxjfqtIJFhpcvERQismaTnSxTdCulAMrKDihTM", "FPhxcSgsrBnEIsnctHNFnevDMfKLxgjXqil", "yGUXKaMiBpBAVBsZGc", "jFqHhqU", "yatTD FnVFrm", "LK", "hzhDUSAWFQKFWLMHOo GIBj", "ipkdeYIerkHfxiwRmFkHl", "gGlYNztKkStwiRAlCVaIhZqsuACmchjwJidSnKTdhoY", "XmqYkMStCcjVwX", "jZdDQ", "MR nrdsVzOW", "KIUDwjnQFXiAkHiopRiX", "uOJKgJKDIQ" };
    assertArrayEquals(new int[] { 34, 40, 18, 42, 17, 13, 6, 7, 9, 10, 47, 32, 26, 12, 35, 14, 15, 16, 22, 29, 49, 1, 2, 44, 36, 0, 41, 25, 46, 43, 20, 23, 31, 19, 3, 38, 37, 33, 4, 48, 21, 28, 27, 5, 39, 11, 8, 24, 30, 45 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case55() {
    int[] duration = { 595284902, 80024636, 595284902, 214070747, 595284902, 197805011, 276708541, 276708541, 276708541, 127441403, 127441403, 127441403, 127441403, 903781856, 595284902, 78903530, 127441403, 276708541, 86593455, 127441403, 990375311, 744896372, 127441403, 990375311, 990375311, 58531417, 127441403, 127441403, 196683905, 990375311, 127441403, 595284902, 793833120, 990375311, 990375311, 793833120, 276708541, 595284902, 127441403, 595284902, 595284902, 127441403, 127441403, 990375311, 62637794, 990375311, 990375311, 990375311, 276708541 };
    String[] user = { "aUnOKyAebyihJOMGMUprfaCaTWY", "CqWMiXURoUZJExKbpLIdTBifocFtQVUUvnWToXahMVrEQhlg", "wmRoBAYvqtkkvaOEtpjyFMAKKozl", "sGbwbfurzmHmZqlJAJylZGxVuy", "qnVnWZQYgJyHqVScHzhvyOIP", "mNUvCtAQxlKmoXKPjLNCVIRNtPqGcNjmryVvxqb", "BOFnhtbbFQhVI", "xMEDXndgeeCxIgRcwgmbhSgBCkuQnWYVNOsyrmYGkageTkjSAP", "jFYddmpdKyWNymcxXSiEUqaHrKDvfILJaChRmfmc", "JVrW", "DjRmvPpsqOqWkNGllqCD", "YoLrmac", "vtjtFRpFkmdQOFqocHhypsfNNlvXZPTxNey", "NvUzqS", "GUcrqzsaVYijvhlvdoxVKtlrjwFHRlMcNQQxiRh", "mNUvCtAQxlKmoXKPjLNCVIRNtPqGcNjmryVvxqb", "ZsWbTqZYZwMfqeTsCQjfCHCZyieY", "CtiKuSygkfmhGfgPyEwwctBYucanHjnNeFt", "NvUzqS", "torcpcqoRkXNeSTIkwAxclQqzjLsZSTSbDHVYCmEgXUkpOXy", "W", "mzDuLiUGHxTXfMRgyHsx", "BwsehELAfeGYsfckBbDsdSFPaCjACqpwMu", "cxQVphiDRnaJMsOXnhrTZEZAgNrrTRPgpeMxvSkQt", "RFojPQqFftYhLsQzgMEiGFWFGNWEduh", "iHeeVmEhWbkWUWcHBRmNPtSijRGIQmrtngtANEEDnyqxrPKF", "wnCCndztdEwghnpRM", "ZHjLExomAIle", "CqWMiXURoUZJExKbpLIdTBifocFtQVUUvnWToXahMVrEQhlg", "KjzuuaWTKvySakrwiUfDlKcNEBTxzeLpkoWofFGKExNAPVX", "ZVAdEiFTZSyPxSaaozgznZoyXfcgTUvAjoJkOwvJZ", "klVQqyrdhCicIG GCPClpfvyycBZPC", "KXr", "wIbqayJZmhOVKrImHF", "YHvNcQdGyYGIGPYgmmu", "ELcpSAPD TiGbMqWEt", "feGRDXUERSVxukZjzFEVEsiOACZXZsPnGjdugZXvoiobfLcR", "MGIyDAopMGIEnpobmHKw", "pZKnXZjbVPGJsZtBiIWQIlQsdwTpDYrjXFlsVnjrlyuNm", "Xnv", "ZLfZnJhLzydvkTRwGgTcqQbaWOkw", "aXkhigNeEtdBkbQFPRYiNzEVSCvYymLI", "cs GUFClCNeohTFCPvKdCxaWYKgnYGiGFMwqyIGdKHfy", "klrPijcCZJfXNclCY", "sGbwbfurzmHmZqlJAJylZGxVuy", "zOKadfSrUuKASgQkrcIPLonnZabuEwhGrowUyoxAQe", "nfTapctDTnpsoytuMiKIiz", "bEuJNfRBaXLyYduWOfCMBcPRzCzlUrolC", "UXILsrQOkbpqPkRzQyUKvFFIAXppD" };
    assertArrayEquals(new int[] { 25, 9, 10, 11, 12, 16, 19, 22, 26, 27, 30, 38, 41, 42, 1, 28, 3, 44, 5, 15, 6, 7, 8, 17, 36, 48, 0, 2, 4, 14, 31, 37, 39, 40, 21, 32, 35, 13, 18, 20, 23, 24, 29, 33, 34, 43, 45, 46, 47 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case56() {
    int[] duration = { 944962185, 602611619, 83196337, 770204211, 975934358, 665791523, 542580753, 430067266, 784897237, 268267616, 819932551, 159182746, 388420939, 892628233, 944962185, 614323229, 902697020, 369467138, 471463741, 95352124, 105789178, 361375092, 678841528, 621016741, 178999099, 539842607, 927165759, 998728693, 608962664, 994674988, 473315181, 2204283, 784897237, 614323229, 35061961, 42174727, 123388749, 994674988, 614323229, 892628233, 81674245, 764957199, 998728693, 418354990, 361375092, 503674840, 41226035, 537240895, 457478315 };
    String[] user = { "YcrFsGbWQrBkEQmzniqEgDE", "T YHHWNmKDJThPMLTXLSvCmvH", "seiMVtdbzMBXnzlHEbnShcUbVZAiRPwdzemcmoLuIcylzN", "TVafdFWsKeIcjfXbLEj", "AobswgbXXAdjrmUbFgobaTZfPGKyb", "vvQtroylMwjMUaSSxkqeQuprUftzBmbPxXCQ", "XGPXaebDLOTSMRrbV", "FCtpuKZjkIfqzLbdXZbiCRdRVeMHFHnKdsuJUw", "QAjLrJmSpmtWEohImJEi", "p", "hCRzDuGczcPWQaJjHmCYKLARqhDHlOZbs", "TmhbFbPhytOWnMXFXdthGavgWKElAkvjRiQzAxajjGQbdGC", "DGbwjkepUZdlxCNdpWSfnLW", "LUBfiRdwXONqmzblJONoHjZnDJWoSVWHxMgTfVAUPFAvLD", "udvBJrBlv", "XKEZCikYKc", "GsPSEbLaXmKPrLByxWQbSEcPimFPxfG", "FXLooYiYWgMZberqNNgVopdAjOIlYsMDZxfRVwnInAEPKUE", "EACtZlCIPdiPP", "cRKAzvIKdOYykSzqDWguXBqhsSjpTiXeWdIwTtgJpoVSyQwaoM", "Z LFqvAgdLP", "StzUMvObfMEYOjnYtzHAFzaNiEvIzDhgkKUiFCEgKtwBaq", "h r", "CWLGdiaVqPowcYbwtWZmKxX", "WmbyzkmmEwNzXjQhUaQWXSya", "IUcuARgzfRElrKauaCTfctUoQJrqU", "TCskMwaBBJwkSfAtdmt", "UlTnTKDywxiFhqeelMPSj", "rTj", "Xa", "TWLyyvcwmWlnwpnG", "Xdruo rsUwhuBniURURhQIiGmCAaXUQgwFTAxmGb", "VIqYITs", "xGVGfbdviyKpXODcrhEnRkesXvSGmBAMZAuMsCxYTqXfoI", "kSwBJCIWfrpdlIkww", "kkjjoNfOFSouXmn", "UazZjsnlYNsKBnGamILfgwPLjNbsPARRsq yWN", "ztMXHAePXaJJBszVDhlhUsrLNhkhdsWRrenEykYZ", "oCrJEPFlvfqPIwQDGGFLGQlYAzfuBbOFtdMQjcSohadjrl", "MeIcx qDUmIcaIEbYAxgZyZsPlwUiXj", "UazZjsnlYNsKBnGamILfgwPLjNbsPARRsq yWN", "YbxlPPgaanvYPJcqQsbhKRCChleGmHMGtjIQUloNfamFJZBg", "EbnRO", "ODxjprCeeJdUFbzgtGbsFPVkv", "WcyPSahmakDBTUeoYtsvNKRREOVyQIrnkUdittouuR", "OeKEkzFDS", "ZylOJTbzxgkjuVIxvVQPiwENrIUEuhERTbPTQVvYvmuMWVhw", "UlTJYfdTjRcLnYBhfZNXPvaNgXOvhWnOZU", "Xdruo rsUwhuBniURURhQIiGmCAaXUQgwFTAxmGb" };
    assertArrayEquals(new int[] { 34, 46, 35, 2, 19, 20, 11, 24, 36, 40, 9, 21, 44, 17, 12, 43, 7, 31, 48, 18, 30, 45, 47, 25, 6, 1, 28, 15, 33, 38, 23, 5, 22, 41, 3, 8, 32, 10, 13, 39, 16, 26, 0, 14, 4, 29, 37, 27, 42 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case57() {
    int[] duration = { 659355400, 828142034, 670029616, 103187317, 959613556, 451310091, 858992566, 550009166, 702483108, 452723942, 890975755, 36227779, 8248959, 702483108, 629009424, 593433034, 365059287, 858992566, 550009166, 890975755, 184201342, 858992566, 301015528, 147940644, 36227779, 890975755, 776638506, 430273155, 600963464, 576366960, 451310091, 629009424, 858992566, 553199804, 640822715, 229231100, 640822715, 867189344, 662559771, 451310091, 522057884, 416012774, 593433034, 396818931, 468188861, 593433034, 491696372, 890975755, 405528652, 598237853 };
    String[] user = { "kEVy", "pzMLuCOTLRqhHe", "DtWeBXmTHrEHMsSXLRnKndy", "FzPwaRooicoWADvSMrmK", "oZPbmbOktyIOhkIHEHkUoUyevXRqA", "TNbqojCmqyTmbwOoIArsiud", "HNoiVQtxCJKfsLOqeHouMeuUTRteX", "zFDxqFUiNlNAhkcelAolEtVLUNZTfLjItubcPKCRtoM", "KEXPecTxLjZeLWbLeTJfJCrEbkfloDXtdMRdjFObGCKyr", "cAOuYQDx", "zSlEGvZpFGDaTkhFayIZGS", "dBEhKNf", "AhgBmkccaP", "DkaobaPYFGYvRIMlsEhmNAKjleo", "ycXQfKHUszJi", "jnRhUuMYfejNOmBCwzQDSxukvbPxBkROElHlDCoutWWRDmV", "kglQnjnhMiLGvXTmuyEPJyDvle", "NLSptibQuaHkSqxgcIbkrdchX", "yYowZCvckDvETxuzUTLk", "hn NhCjfSVVkfdSyPClFRrpNkgfalMXyziBqNDpwCV", "zUTChPiW csaeFJJRkXMVz", "LnOvYEQBOsvJltfcNdKSAAVEHzxmE", "MyGnBQSoBOgkaLLLnwtAaYT", "XPUynCaMMxZkFSAJsCWuReTpHOPwoDIxfIJnGRWmi", "tkRQxZfAnAmrIrrFEiVwYCDsiFOPZBWVijQFUpfzBGDM", "RrD", "Yl", "aAsVhzv", "ZJ", "rLBspymzuHctEeRlfvXPqhBTmnBzEKEfHbQXFFhEMIZER", "iqCXzgkCSgHcejHLJbEg YehGgbOEvaJEpSYljjoDEJwdOr", "OGiZLKbXIzKLEtSduAInJhwxkxrnbicOeq", "FlNZm", "KtvLojiVZDGCkqwhirZyOctDmGqmXqgtabiGOYVNgUA", "mBqbvuSYDztyKnlqIbDxlzokPQOmDgOQIfxLKgTlStDE", "NOX", "noJmnWrFFUgiDBuxAtYsKndSsbIpwoEFHIVMuoLAl", "ISVBydFDAIkRYoZXscbKkNGloo", "zPpcPwjvQCuvMsdKYFonkllmZwGtgehE", "ocB", "KiLmbTKiOMDddqgJhrUFePPQHmJyPjrqAo", "NvjGPwEQonQnkRnBMTQ", "zDFVsTh", "sgANyzuycRD", "QUfezFPj", "azAWXioXgVnDTStJOzuTPqvVtCLJjTCoCElCuUgV", "OTIPbYyYbLfptYrkcnMkWyxTW", "UIkoI", "sZTINqfDZNRKbaUkvnrWJ", "WHXUcZABptEqeJYe" };
    assertArrayEquals(new int[] { 12, 11, 24, 3, 23, 20, 35, 22, 16, 43, 48, 41, 27, 5, 30, 39, 9, 44, 46, 40, 7, 18, 33, 29, 15, 42, 45, 49, 28, 14, 31, 34, 36, 0, 38, 2, 8, 13, 26, 1, 6, 17, 21, 32, 37, 10, 19, 25, 47, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case58() {
    int[] duration = { 738037342, 448997242, 492170679, 620444107, 540126951, 654460572, 738037342, 372557423, 657606240, 492170679, 738037342, 654460572, 503263567, 372557423, 372557423, 928388099, 540126951, 928388099, 467945440, 326895158, 976327999, 128798186, 654460572, 738037342, 654460572, 450622017, 654460572, 326895158, 475032155, 541480979, 492170679, 488965438, 326895158, 928388099, 738037342, 492170679, 450622017, 654460572, 326895158, 492170679, 81839749, 654460572, 620444107, 541480979, 805114142, 738037342, 541480979, 492170679, 620444107, 372557423 };
    String[] user = { "iPQJrgNqnFrXyeFXBfZjAyrouImLHXXQYGCAHHUzjgefONQ", "jaFaFOGLEqPzYL", "iWbaOcQZApnwGbITVSNfNuaMcqsNwDvjWqAiHOXalF", "FSaByynOkyDeNgYnGsQXcltLikzmrq", "WJRNFEGNCIYIyofBDphnnGKENTSPFtlEDEJpfTsgPhxNpZnHec", "OuTHCLpgQtTSCzwxXkHiGKyZSJrbmVoFHxqWEYAqlQiimhUdCO", "rVY", "gTWiXuneKccoUUSulcpbLS", "fwEdaaelHdotlbxtDgtEWQj", "xmsgAvZGWplVDhfMqxFgnhIMbxDy", "jcUuJTyDejcP", "yfEgjVynFiWCEiLOqUhIYEFaXuuWCdpDzLuI", "VvqQdCctpxdpeKJLsn", "er", "XdylqLfcsNfqr", "ODdHFmdnjmViLAWeIbTaaEbOXPZjSgDPpqxgpVvMUvKkxgk", "UTXYbEYyrfHCMsXtmjkWeXNUYxORwBBxwMX", "F", "tcdPsiKgZqkCqeWMEogplTsJOPqGpEuNHUGOhFa", "tYlrsSCHwNvrTSswCt", "ymBawVxlwlVZtXJPeKZPukhgOVyBmtwcQFGDLJ", "rOofQGBvfEMDRtiYqkxRqShyTvLlvDuYIMcECZTdDIefeO", "ef", "FvaGpJBHnzOQpxGWD", "bFxDxifYnrQgIjgTOJiahHkLR NIPko", "UFXUzXyyWafINNfWaSuEDDGHyIJQ", "hNsfPFuEFlHBshwrCetESlAkIftdbWYth", "WIcVoWjnwJjyiaXcNzdQsuBYPbOUNWYPJawtfFMXAAlpmoJZ", "plJkhcdRffvXpO", "kZa", "KSvLHoSUqaEwwet", "LtvxInbUPgvAIKbihjVzENluPPTRzJwE", "e", "yiOkFlcqRZoaYltYtnxgwkfyLoVimPVHIWSg", "FdbyYuoxRPuBKYXrGjv", "BYOvNgCXXzFDaoteEwrbqkouKjgWvXnltFATcqSebzRIPdna", "LwnPmPUTDYbcHqgzFkxjGhrOqPBVuXhjbVzsmjvKZvMmpZxdxU", "PcVHAxBtnccPIKeuKkDnrGXBviWVJBIWxRryWkAvN", "FqysTOO DPFTdFBEq", "xlzGSdQbeHuBcDFDmclUQZgGStthybFZuXSURhZyFyJesg", "JAFJVsyvHuEfOygAvNbThlTx", "ksYNKcOKXbkLaBFoWQATvpUQtpPQ", "XtQPQxVacCwsGXAPLLPukgrmop", "bGxWWXNoFjnpGD", "kpLsLFoBjyWSLLriwQhvPtsSnXMSZOToktvdSzgtSI", "mmMEISxozUcdhf", "aVScBUnyvLMTBMLVoXPxLSVWmYKRvOppjgW", "qzGcqjVBpOwrYHjmAmatBJUJQExprAmIWXEtLGgbn", "KgSWjfpYczZhskpeWreU", "VvU" };
    assertArrayEquals(new int[] { 40, 21, 19, 27, 32, 38, 7, 13, 14, 49, 1, 25, 36, 18, 28, 31, 2, 9, 30, 35, 39, 47, 12, 4, 16, 29, 43, 46, 3, 42, 48, 5, 11, 22, 24, 26, 37, 41, 8, 0, 6, 10, 23, 34, 45, 44, 15, 17, 33, 20 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case59() {
    int[] duration = { 865508817, 808875204, 5121261, 865508817, 651939500, 5121261, 670211113, 388013274, 808875204, 865508817, 865508817, 963235385, 23320720, 963235385, 5121261, 5121261, 575916341, 363612916, 865508817, 285723523, 742127079, 782236885, 388013274, 412808309, 186814160, 963235385, 963235385, 963235385, 808875204, 79497348, 670211113, 865508817, 5121261, 782236885, 388013274, 206226175, 865508817, 670211113, 963235385, 742127079, 670211113, 963235385, 808875204, 23320720, 575916341, 808875204, 963235385, 130297385, 782236885 };
    String[] user = { "WvSWrsSvAmEPQo", "IxTtUPPYkFMaItlXVsuovWReG", "ofVOkZA BjBTHOrzkrjNqm", "M", "aMVXdrrWoLExxaqlSIdAEbtZdTStMz", "WTMjcDiAnLxlDkMBtHVm", "XSAGutRzGsNegrmatWFtusMPJLLodXhnMPbljQU", "dMNJozoIn", "McMzQQhjxWYqKd", "upbvCgbsfRsjxCkKAK", "TbSXbsERJOIOZFGfsONzWGFGnvEIpdRC", "MstUaAQtawkFkTtDjcyWYvYdvNYFtBDKlnukOLwNIDKAifFc", "hU", "rEbQXUzevPZLwJYokOZsJibJlmNNXHNQpjdiMBpqBDo", "gNJmHKetAT", "DaXtez DDnAK", "h F", "EPltgovCkNaoZSZCUDrRCBEYmpuGztpgQIFwKfKG", "TOyOdMOhZpnXUEYf", "PCdaVxjQoFeqoZzpzsAgNOGwSvjBQtKOTSKJpmx", "AycxHfDJIReKwhBMgLJxfpYmGLzNCXahZdLXgk", "votuJBMTAKlfdGG", "WYOSunAlcUCyGBZhuriBPomJWUckMKFJfnJXjvPvDprPmlnF", "EPltgovCkNaoZSZCUDrRCBEYmpuGztpgQIFwKfKG", "EPltgovCkNaoZSZCUDrRCBEYmpuGztpgQIFwKfKG", "LRMx", "aCzpLWwIbkDuQcJrqMEurxFOAJAgVAqxkiCR", "gV", "PNfoKAM", "ghRXHi", "z", "yXXvreqLLHaNslTfQvtbrvot", "KV HLzh", "MGQX", "CtaXwAfPgZokaaKVxiBmvkmPXUYGd", "ghRXHi", "nUOTKYqbldQFuHBaDZDgqKARplWXzWFx", "YeoVuGRzFjdVOUwqoJMMteakJaSIOwjUWtTfkCpjZEnT", "EtsMQrWBTtzhxCoH", "FgETOlPFiVivwaDwooPxAHZwacWJRcmUtilPLs", "IPMJIoVCVmKMegJqYAKUCQTwDrPqlcZXhfdBVMURmSAyUWZTlM", "BmjFNbPtwJNPTXKYIwZwscMFdDZbAfHvZKcquqEJBELenAjCO", "LD", "GpAprOhztxGw", "KnprMyvTp mPPrOvTHUIYMdbInpfsTHgblKiwWfaBTluOP", "sVJsnOhWhsSHwdsPynWWJnzXEJhfZSfPPUVOWunYf", "BLgTUnTkfSupSrjAIAkJW WEKcssVgaDeBHTvrn", "aMVXdrrWoLExxaqlSIdAEbtZdTStMz", "jfwunDYVyZbJokuNHcECaiBxVOqmPuym" };
    assertArrayEquals(new int[] { 2, 5, 14, 15, 32, 12, 43, 19, 29, 35, 7, 22, 34, 16, 44, 6, 30, 37, 40, 20, 39, 4, 47, 21, 33, 48, 1, 8, 28, 42, 45, 0, 3, 9, 10, 18, 31, 36, 11, 13, 17, 23, 24, 25, 26, 27, 38, 41, 46 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case60() {
    int[] duration = { 516143034, 56423572, 56423572, 56423572, 56423572, 154823522, 56423572, 399153234, 399153234, 56423572, 399153234, 476894196, 56423572, 476894196, 399153234, 399153234, 399153234, 476894196, 56423572, 399153234, 399153234, 244329712, 56423572, 399153234, 476894196, 56423572, 399153234, 399153234, 21300934, 56423572, 399153234, 399153234, 15599170, 399153234, 399153234, 56423572, 56423572, 56423572, 399153234, 56423572, 56423572, 399153234, 399153234, 56423572, 35122638, 56423572, 40824402, 399153234, 476894196 };
    String[] user = { "mFRnXchCOYaOjOMrqEfpKTTQPctuLLlXpl", "WXIqmnsR", "VjgUskgfjcIcezubJRWFWbA", "PyKYphwME CGvmhozWGChYlBBgRkgBsDizJzsKN", "tFFZDHOeGIZJ UV", "HrjlLNgzOKBSamhxNvzzIxlGSRVpKmWhKbpyRXQPofod kfwE", "ObDeOdebBSTPtNyLvMGrCWAPfBMNJCcMAFgNcPwvy", "fbIEOZXMNMomcUkkWIPD", "jmJk aTyCPC", "HArDxoMIWM", "msGwTvgJSbFXFEDlXmBOwTerx", "KvBHeXglEFrWuMKzvnAICFGMYskkGN", "ZzZwKmPfkCIPeARdmTIgmkls", "iEbtFrpzlSExaVWkFoTXnkrs", "DZfOCOrAsJmIMQSrwxOjcRFwFRzCQMZeVvjRfmlW", "pniMnvNfmmnsvEkTKeZEXnhjnqIuMYqvkUIDzkAPGiuERocu", "cbvliAnkDhPAeUdDGsXawgGFCooKeJfMPaBRlCGiq IdEePyT", "zEfydISqnIwqaxDdpdbmAW", "TijVQNAmVCCrbQZQuxS", "YZZmbbBxFLAhphacfGzKkNeTgBsrJqeqzWJomQRXqfwqrS", "lGmyvtSWCtnVSdbcGjnUesRgjhdPWMFEPioeQhkaKuPTUk", "HrjlLNgzOKBSamhxNvzzIxlGSRVpKmWhKbpyRXQPofod kfwE", "dCQvvjfmXgeeYgXrcwaVGcDTOdUv", "qnmq", "GXYKoIRNzCUhEYrHRxBqEjapXbLZmmVJLpeKHBExOlhaQUp", "FOHkrYDbTAGMgchpqqDkqkomrahcbre", "vLFLUlhdZuBrTTCvzYlSUkvzEp", "rhmZhTScMTbfti", "RRoFHQqoWAApXp", "JQpRPEijDpkfuHxLcItfTYStQ qW", "uP PLOLoLHJELanCfEiB", "tfBPHLPtFHwCdANbjSkqKStYYjMjMDowGkHKhtgPsQqiCBH", "yolVzsqJ", "DjWOFOOdWZXgvIzOSr", "yojUnBWLNBpvJofRtYhKozbrUBPTH UbMBFE", "OGraTwdxLfQoAWwvOMzFJnYHnWYZDLcLuyGUrCoikODfTyBc", "Mx", "xKEmnaEljnjefqdmjMwJaTBYaJQ", "xRVpWeDAOQpLJYeuXdBF", "aejYPALGzOPBq gml", "KEALuofxItoThOVJbUXrZ YcBRKQ", "nGYiCSaWUjTuiAu ZzkfkrniVdhsWRQgnMHVkK", "tmRkqanKPLDSdFCPyZSnnkvvCwxNaSEGYbxN", "rziiicVWAumFZjOxSaRUFCljtSTVsIiGxgoXmnkuYPAbYbxqU", "RRoFHQqoWAApXp", "hJjeQDJIFeOTzrONdPZ wcEC", "yolVzsqJ", "ECHLjsBREhVZWrsjEgum", "QyJDOqqZvUgZjDHSIXx" };
    assertArrayEquals(new int[] { 1, 2, 3, 4, 6, 9, 12, 18, 22, 25, 28, 44, 29, 32, 46, 35, 36, 37, 39, 40, 43, 45, 5, 21, 7, 8, 10, 14, 15, 16, 19, 20, 23, 26, 27, 30, 31, 33, 34, 38, 41, 42, 47, 11, 13, 17, 24, 48, 0 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case61() {
    int[] duration = { 200, 200, 200 };
    String[] user = { "Gil", "Sarah", "Warrick" };
    assertArrayEquals(new int[] { 0, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case62() {
    int[] duration = { 1000000000, 1000000000, 10000000, 1000000000, 1000000000, 1000000000, 100000000, 1000000000, 1000000000, 10000000, 1000000000, 1000000000, 100000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "rohan rock", "Rohan rock", "A", "sd d", "eg", "be", "bea", "rohan rock", "Rohan rock", "A", "sd d", "eg", "be", "bea", "bea", "rohan rock", "Rohan rock", "A", "sd d", "eg", "be", "bea", "dvef", "A", "sd d", "eg", "be", "bea", "Rohan rock", "A", "sd d", "eg", "be", "bea", "dvef", "A", "sd d", "eg", "be", "bea", "A", "A", "A", "A", "A", "A", "dvef", "A", "sd d", "eg" };
    assertArrayEquals(new int[] { 0, 7, 15, 22, 34, 46, 1, 8, 16, 28, 5, 12, 20, 26, 32, 38, 6, 13, 14, 21, 27, 33, 39, 3, 10, 18, 24, 30, 36, 48, 4, 11, 19, 25, 31, 37, 49, 2, 9, 17, 23, 29, 35, 40, 41, 42, 43, 44, 45, 47 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case63() {
    int[] duration = { 100, 200, 300, 400, 100, 300, 400, 200, 300, 400, 100, 200, 300, 400, 100, 300, 400, 200, 300, 400, 100, 200, 300, 400, 100, 300, 400, 200, 300, 400, 100, 200, 300, 400, 100, 300, 400, 200, 300, 400, 100, 200, 300, 400, 100, 300, 400, 200, 300, 400 };
    String[] user = { "B", "C", "B", "A", "B", "C", "A", "A", "A", "C", "A", "B", "B", "B", "C", "B", "A", "B", "C", "A", "A", "A", "C", "A", "B", "B", "B", "C", "B", "A", "B", "C", "A", "A", "A", "C", "A", "B", "B", "B", "C", "B", "A", "B", "C", "A", "A", "A", "C", "A" };
    assertArrayEquals(new int[] { 1, 5, 9, 14, 18, 22, 27, 31, 35, 40, 44, 48, 0, 2, 4, 11, 12, 13, 15, 17, 24, 25, 26, 28, 30, 37, 38, 39, 41, 43, 3, 6, 7, 8, 10, 16, 19, 20, 21, 23, 29, 32, 33, 34, 36, 42, 45, 46, 47, 49 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case64() {
    int[] duration = { 590140164, 99, 383017257, 883976895, 319375103, 682576103, 375009764, 288333004, 838736965, 114562290, 904892228, 766508744, 123877118, 255420486, 533381667, 911904136, 25987, 176084340, 299076676, 3, 3851, 326369912, 852650319, 511270699, 578980773, 133640415, 969274030, 29272687, 454073972, 900836499, 690076706, 577775976, 345750577, 781509788, 851610436, 863215623, 258275629, 888553943, 29067551, 875638799, 676925025, 992562289, 378943170, 111392053, 121077193, 442380607, 657658467, 39668965, 851412184, 817319589 };
    String[] user = { "R", "N", "W", "Q", "P", "A", "B", "Z", "B", "C", "W", "X", "L", "N", "F", "T", "E", "D", "R", "W", "O", "Y", "A", "B", "L", "W", "L", "J", "F", "W", "H", "Z", "N", "W", "G", "O", "H", "H", "I", "H", "M", "V", "X", "X", "A", "S", "S", "K", "V", "X" };
    assertArrayEquals(new int[] { 16, 38, 27, 47, 9, 17, 4, 21, 1, 13, 32, 40, 34, 20, 35, 7, 31, 3, 0, 18, 15, 14, 28, 45, 46, 5, 22, 44, 12, 24, 26, 6, 8, 23, 41, 48, 11, 42, 43, 49, 30, 36, 37, 39, 2, 10, 19, 25, 29, 33 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case65() {
    int[] duration = { 500, 200, 100, 400, 300, 200, 500, 1000 };
    String[] user = { "a", "b", "b", "c", "b", "a", "d", "e" };
    assertArrayEquals(new int[] { 3, 6, 1, 2, 4, 0, 5, 7 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case66() {
    int[] duration = { 100, 200, 300, 400, 500 };
    String[] user = { "f", "v", "f", "v", "f" };
    assertArrayEquals(new int[] { 1, 3, 0, 2, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case67() {
    int[] duration = { 100, 200, 100, 500, 150, 100, 105, 145, 145, 125, 165, 125, 1222, 1254 };
    String[] user = { "a", "b", "c", "d", "a", "a", "b", "a", "c", "d", "e", "a", "a", "b" };
    assertArrayEquals(new int[] { 10, 2, 8, 3, 9, 1, 6, 13, 0, 4, 5, 7, 11, 12 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case68() {
    int[] duration = { 12, 213, 154, 56, 123, 45 };
    String[] user = { "a", "b", "c", "a", "c", "b" };
    assertArrayEquals(new int[] { 0, 3, 1, 5, 2, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case69() {
    int[] duration = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    String[] user = { "a", "b", "c", "d", "e", "f", "g", "a", "b", "c" };
    assertArrayEquals(new int[] { 3, 4, 5, 6, 0, 7, 1, 8, 2, 9 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case70() {
    int[] duration = { 100, 200, 50 };
    String[] user = { "Horatio Caine", "horatio caine", "YEAAAAAAH" };
    assertArrayEquals(new int[] { 2, 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case71() {
    int[] duration = { 400, 100, 100, 100 };
    String[] user = { "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor" };
    assertArrayEquals(new int[] { 3, 1, 2, 0 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case72() {
    int[] duration = { 10, 10, 10, 10, 10, 10, 20 };
    String[] user = { "a", "a", "a", "a", "a", "a", "b" };
    assertArrayEquals(new int[] { 6, 0, 1, 2, 3, 4, 5 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case73() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "d" };
    assertArrayEquals(new int[] { 10, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case74() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "A", "A", "A", "A", "A", "B" };
    assertArrayEquals(new int[] { 5, 0, 1, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case75() {
    int[] duration = { 1, 1, 1, 1 };
    String[] user = { "B", "B", "A", "A" };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case76() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "b", "C", "d", "e", "f", "G", "G", "G", "h", "P", "b", "C", "d", "e", "f", "G", "G", "G", "h", "a", "b", "C", "d", "P", "f", "G", "G", "P", "h", "a", "P", "C", "d", "e", "f", "G", "G", "G", "h", "a", "P", "C", "d", "e", "f", "G", "G", "G", "h" };
    assertArrayEquals(new int[] { 1, 11, 21, 0, 20, 30, 40, 4, 14, 34, 44, 2, 12, 22, 32, 42, 3, 13, 23, 33, 43, 5, 15, 25, 35, 45, 9, 19, 29, 39, 49, 10, 24, 28, 31, 41, 6, 7, 8, 16, 17, 18, 26, 27, 36, 37, 38, 46, 47, 48 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case77() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 900000000 };
    String[] user = { "a", "a", "a", "a", "a", "b" };
    assertArrayEquals(new int[] { 5, 0, 1, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case78() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 10 };
    String[] user = { "b", "b", "b", "b", "b", "b", "a", "a", "a", "a", "a", "a", "c" };
    assertArrayEquals(new int[] { 12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case79() {
    int[] duration = { 100, 200, 100, 100, 100, 500, 100, 400 };
    String[] user = { "radhakr", "nik", "radhakr", "radha", "nik", "sun", "radhakr", "radhakr" };
    assertArrayEquals(new int[] { 3, 1, 4, 5, 0, 2, 6, 7 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case80() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "a", "a", "b" };
    assertArrayEquals(new int[] { 3, 0, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case81() {
    int[] duration = { 22, 22 };
    String[] user = { "bbb", "aaa" };
    assertArrayEquals(new int[] { 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case82() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "b", "c", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case83() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 100, 100, 1000 };
    String[] user = { "a", "a", "a", "a", "a", "z", "x", "s" };
    assertArrayEquals(new int[] { 5, 6, 7, 0, 1, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case84() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 5000000, 5000000, 5000000, 1000000000, 1000000000, 1000000000, 999999999, 999999999, 999999999, 888888888, 888888888, 888888888 };
    String[] user = { "A", "S", "D", "A", "S", "D", "D", "S", "A", "D", "S", "A", "D", "S", "A" };
    assertArrayEquals(new int[] { 0, 3, 8, 11, 14, 1, 4, 7, 10, 13, 2, 5, 6, 9, 12 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case85() {
    int[] duration = { 2, 1 };
    String[] user = { "a", "a" };
    assertArrayEquals(new int[] { 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case86() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "a", "a", "a" };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case87() {
    int[] duration = { 1, 100, 2 };
    String[] user = { "a", "a", "b" };
    assertArrayEquals(new int[] { 2, 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case88() {
    int[] duration = { 100, 100, 100, 100, 100 };
    String[] user = { "e", "d", "c", "b", "a" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case89() {
    int[] duration = { 4, 2, 4, 2, 5, 6 };
    String[] user = { "aaaa", "bbbb", "ffff", "bbbb", "cccc", "eeee" };
    assertArrayEquals(new int[] { 0, 1, 3, 2, 4, 5 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case90() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1 };
    String[] user = { "a", "a", "a", "b" };
    assertArrayEquals(new int[] { 3, 0, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case91() {
    int[] duration = { 1, 10, 100 };
    String[] user = { "A", "V", "A" };
    assertArrayEquals(new int[] { 1, 0, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case92() {
    int[] duration = { 200, 200, 200 };
    String[] user = { "Warrick", "Sarah", "Gil" };
    assertArrayEquals(new int[] { 0, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case93() {
    int[] duration = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    String[] user = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "ax" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case94() {
    int[] duration = { 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100, 400, 100, 100, 100 };
    String[] user = { "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor" };
    assertArrayEquals(new int[] { 3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 1, 2, 5, 6, 9, 10, 13, 14, 17, 18, 21, 22, 25, 26, 29, 30, 33, 34, 37, 38, 0, 4, 8, 12, 16, 20, 24, 28, 32, 36 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case95() {
    int[] duration = { 1, 1, 1, 1, 1 };
    String[] user = { "a", "e", "d", "c", "b" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case96() {
    int[] duration = { 100, 50, 50, 50, 70 };
    String[] user = { "b", "a", "a", "a", "c" };
    assertArrayEquals(new int[] { 4, 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case97() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
    assertArrayEquals(new int[] { 0, 10, 20, 30, 40, 1, 11, 21, 31, 41, 2, 12, 22, 32, 42, 3, 13, 23, 33, 43, 4, 14, 24, 34, 44, 5, 15, 25, 35, 45, 6, 16, 26, 36, 46, 7, 17, 27, 37, 47, 8, 18, 28, 38, 48, 9, 19, 29, 39, 49 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case98() {
    int[] duration = { 1, 1, 1, 1, 4 };
    String[] user = { "Rodrigo", "Rodrigo", "Rodrigo", "Rodrigo", "Mac" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case99() {
    int[] duration = { 400, 100, 100, 101 };
    String[] user = { "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor" };
    assertArrayEquals(new int[] { 3, 1, 2, 0 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case100() {
    int[] duration = { 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999 };
    String[] user = { "a", "a", "b", "b", "b", "c", "d", "e", "f", "f" };
    assertArrayEquals(new int[] { 5, 6, 7, 0, 1, 8, 9, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case101() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 11, 1000000000, 1000000000 };
    String[] user = { "a", "a", "a", "a", "c", "c", "a" };
    assertArrayEquals(new int[] { 4, 5, 0, 1, 2, 3, 6 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case102() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "b", "c", "q", "w", "e", "r", "t", "y", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "Q", "W", "E", "R", "T", "Y", "A", "S", "D", "F", "GH", "Z", "X", "C", "V", "B", "N", "A", "DD", "F", "OOOOOOO" };
    assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 26, 27, 28, 29, 30, 31, 32, 33, 35, 36, 38, 39, 40, 41, 42, 43, 44, 46, 48, 0, 12, 1, 25, 2, 23, 34, 45, 37, 47 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case103() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 100000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Axw", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax", "Axx Ax" };
    assertArrayEquals(new int[] { 23, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case104() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "nimam", "nimam", "nimam", "nimama" };
    assertArrayEquals(new int[] { 3, 0, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case105() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1, 1 };
    String[] user = { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "Z", "M" };
    assertArrayEquals(new int[] { 40, 41, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case106() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
    String[] user = { "a", "a", "a", "a", "b", "b", "c" };
    assertArrayEquals(new int[] { 6, 4, 5, 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case107() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 123, 242, 123, 123 };
    String[] user = { "s", "s", "s", "s", "a", "a", "c", "v" };
    assertArrayEquals(new int[] { 6, 7, 4, 5, 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case108() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 999999998, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 999999999, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 999999997 };
    String[] user = { "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "d", "d", "d", "d", "d", "d", "d", "d", "d", "d", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
    assertArrayEquals(new int[] { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case109() {
    int[] duration = { 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20, 10, 20 };
    String[] user = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "ax" };
    assertArrayEquals(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case110() {
    int[] duration = { 2, 2, 1 };
    String[] user = { "A", "A", "B" };
    assertArrayEquals(new int[] { 2, 0, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case111() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 123, 321, 123 };
    String[] user = { "a", "a", "a", "a", "s", "f", "c" };
    assertArrayEquals(new int[] { 4, 6, 5, 0, 1, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case112() {
    int[] duration = { 1000000000, 1000000000, 999999999, 7, 5, 1000000000 };
    String[] user = { "a", "a", "b", "b", "b", "a" };
    assertArrayEquals(new int[] { 2, 3, 4, 0, 1, 5 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case113() {
    int[] duration = { 400, 100, 100, 199 };
    String[] user = { "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor" };
    assertArrayEquals(new int[] { 3, 1, 2, 0 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case114() {
    int[] duration = { 200, 400, 200 };
    String[] user = { "a", "b", "a" };
    assertArrayEquals(new int[] { 0, 2, 1 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case115() {
    int[] duration = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 123, 123, 123, 3 };
    String[] user = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "sdf", "sc", "cs", "ad" };
    assertArrayEquals(new int[] { 41, 38, 39, 40, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case116() {
    int[] duration = { 1, 2, 3, 4 };
    String[] user = { "a", "b", "a", "c" };
    assertArrayEquals(new int[] { 1, 0, 2, 3 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case117() {
    int[] duration = { 100, 100, 100, 100, 100, 100, 100, 100 };
    String[] user = { "Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Taylor", "A A", "A B", "B A", "C A" };
    assertArrayEquals(new int[] { 0, 3, 4, 5, 6, 7, 1, 2 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case118() {
    int[] duration = { 50, 50, 100, 100, 100, 200 };
    String[] user = { "aaa", "aaa", "bbb", "bbb", "bbb", "aaa" };
    assertArrayEquals(new int[] { 0, 1, 5, 2, 3, 4 }, batchsystem.schedule(duration, user));
  }

  @Test
  public void case119() {
    int[] duration = { 10, 10 };
    String[] user = { "z", "a" };
    assertArrayEquals(new int[] { 0, 1 }, batchsystem.schedule(duration, user));
  }

}
