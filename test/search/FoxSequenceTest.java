package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FoxSequenceTest {
    FoxSequence foxsequence = new FoxSequence();

    @Test
    public void case1() {
        int[] seq = { 1, 3, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case2() {
        int[] seq = { 1, 2, 3, 4, 5, 4, 3, 2, 2, 2, 3, 4, 5, 6, 4 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case3() {
        int[] seq = { 3, 6, 9, 1, 9, 5, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case4() {
        int[] seq = { 1, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case5() {
        int[] seq = { 1, 3, 4, 3, 1, 1, 1, 1, 3, 4, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case6() {
        int[] seq = { 6, 1, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case7() {
        int[] seq = { 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case8() {
        int[] seq = { 20, 19 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case9() {
        int[] seq = { 5, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case10() {
        int[] seq = { 7, 8 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case11() {
        int[] seq = { 1, 2, 1, 2, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case12() {
        int[] seq = { 3, 5, 8 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case13() {
        int[] seq = { 12, 18, 12 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case14() {
        int[] seq = { 30, 99, 30, 99 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case15() {
        int[] seq = { 55, 99, 65, 65 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case16() {
        int[] seq = { 34, 45, 56, 9 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case17() {
        int[] seq = { 3, 2000, 1, 1998, 2 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case18() {
        int[] seq = { 1, 2000, 3, 4, 3 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case19() {
        int[] seq = { 500, 501, 1, 3, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case20() {
        int[] seq = { 123, 456, 345, 789, 678 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case21() {
        int[] seq = { 862, 1923, 37, 1845, 943 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case22() {
        int[] seq = { 5, 901, 899, 902, 901 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case23() {
        int[] seq = { 2000, 2000, 2000, 2000, 2000 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case24() {
        int[] seq = { 1, 1, 1, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case25() {
        int[] seq = { 1, 1, 3, 3, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case26() {
        int[] seq = { 300, 400, 500, 600, 700 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case27() {
        int[] seq = { 12, 45, 46, 45, 49 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case28() {
        int[] seq = { 812, 1423, 1422, 1734, 1982 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case29() {
        int[] seq = { 1, 2, 1, 2, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case30() {
        int[] seq = { 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case31() {
        int[] seq = { 1, 2, 3, 2, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case32() {
        int[] seq = { 5, 4, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case33() {
        int[] seq = { 9, 9, 6, 9, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case34() {
        int[] seq = { 6, 9, 9, 9, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case35() {
        int[] seq = { 6, 9, 9, 12, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case36() {
        int[] seq = { 6, 9, 6, 6, 9 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case37() {
        int[] seq = { 6, 9, 6, 9, 9 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case38() {
        int[] seq = { 1293, 1413, 1533, 1334, 1485, 1310 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case39() {
        int[] seq = { 1507, 1561, 1394, 1422, 1299, 1176 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case40() {
        int[] seq = { 830, 1022, 1001, 1001, 1064, 843 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case41() {
        int[] seq = { 1194, 1350, 1175, 1000, 1047, 1020 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case42() {
        int[] seq = { 624, 859, 593, 605, 617, 520 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case43() {
        int[] seq = { 135, 333, 531, 729, 927, 1125, 1323, 1521, 1719, 1917, 1767, 1779, 1791, 1803, 1815, 1827, 1839, 1662, 1485, 1308, 1131 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case44() {
        int[] seq = { 160, 278, 396, 514, 632, 750, 596, 442, 288, 134, 134, 134, 134, 134, 408, 682, 956, 912, 868, 824, 780 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case45() {
        int[] seq = { 565, 816, 1067, 1318, 1569, 1820, 1747, 1674, 1601, 1528, 1455, 1382, 1309, 1236, 1163, 1090, 1017, 944, 944, 966, 988, 1010, 1032, 1054, 1076, 1098, 1120, 1142, 1164, 1186, 1208, 1230, 1252, 1274, 1296, 1318, 1340, 1362, 1384, 1406, 1428, 1450, 1322, 1194 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case46() {
        int[] seq = { 848, 866, 884, 902, 836, 770, 704, 638, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 605, 638, 671, 704, 737, 770, 803, 836, 869, 902, 935, 968, 1001, 1034, 1067, 1100, 1133, 1166, 1199, 1180, 1161, 1142, 1123, 1104 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case47() {
        int[] seq = { 898, 1040, 1182, 1324, 1466, 1411, 1356, 1301, 1246, 1191, 1136, 1136, 1136, 1136, 1136, 1136, 1136, 1136, 1136, 1136, 1136, 1136, 1360, 1354, 1348, 1342, 1336, 1330, 1324, 1318, 1312, 1306, 1300, 1294 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case48() {
        int[] seq = { 455, 500, 545, 590, 635, 680, 725, 770, 815, 860, 905, 950, 995, 1040, 1085, 959, 833, 707, 581, 581, 581, 581, 581, 581, 581, 581, 581, 581, 581, 581, 581, 581, 581, 739, 897, 1055, 1213, 1371, 1529, 1687, 1845, 1715, 1585, 1455, 1325, 1195, 1065, 935 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case49() {
        int[] seq = { 935, 1085, 1235, 1385, 1098, 811, 811, 811, 846, 881, 916, 951, 986, 1021, 1056, 1091, 1126, 1161, 1196, 1231, 1266, 1301, 1336, 1371, 1308, 1245, 1182, 1119, 1056, 993, 930, 867, 804, 741, 678, 615 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case50() {
        int[] seq = { 637, 674, 711, 748, 785, 822, 859, 896, 933, 970, 1007, 1044, 1081, 1118, 1155, 1192, 1229, 1266, 1303, 1340, 1377, 1287, 1197, 1107, 1107, 1229, 1127 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case51() {
        int[] seq = { 1395, 1516, 1637, 1758, 1573, 1388, 1203, 1018, 833, 648, 463, 278, 93, 93, 93, 203, 313, 423, 533, 643, 753, 863, 973, 1083, 1193, 1303, 1413, 1523, 1486, 1449 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case52() {
        int[] seq = { 802, 816, 830, 844, 858, 872, 886, 900, 914, 928, 942, 956, 935, 914, 893, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 872, 1056, 1240, 1424, 1608, 1590, 1572 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case53() {
        int[] seq = { 372, 451, 530, 609, 688, 767, 846, 925, 1004, 985, 966, 947, 928, 909, 890, 871, 852, 833, 814, 795, 776, 776, 852, 928, 1004, 1080, 1156, 1232, 1308, 1384, 1460, 1536, 1373, 1210, 1047, 884, 721 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case54() {
        int[] seq = { 1343, 1353, 1363, 1373, 1383, 1393, 1403, 1413, 1423, 1433, 1443, 1453, 1463, 1473, 1483, 1493, 1503, 1430, 1357, 1284, 1211, 1138, 1065, 992, 919, 919, 919, 1107, 1295, 1483, 1671, 1859, 1842, 1825, 1808, 1791, 1774, 1757, 1740, 1723, 1706, 1689 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case55() {
        int[] seq = { 980, 1174, 1368, 1562, 1756, 1950, 1706, 1462, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1218, 1395, 1340, 1285, 1230, 1175, 1120, 1065, 1010 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case56() {
        int[] seq = { 1340, 1439, 1538, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1394, 1405, 1416, 1427, 1438, 1449, 1460, 1321, 1182, 1043, 904, 765, 626 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case57() {
        int[] seq = { 168, 255, 342, 429, 516, 603, 690, 777, 864, 951, 1038, 1125, 1212, 1299, 1044, 789, 534, 534, 534, 534, 534, 534, 534, 735, 936, 1137, 1338, 1539, 1740, 1587, 1434, 1281, 1128, 975, 822, 669, 516 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case58() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case59() {
        int[] seq = { 1, 2000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2000, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case60() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 46, 47, 46 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case61() {
        int[] seq = { 1, 2000, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980, 1979, 1978, 1977, 1976, 1975, 1974, 1973, 1972, 1971, 1970, 1969, 1968, 1967, 1966, 1965, 1964, 1963, 1962, 1961, 1960, 1959, 1958, 1957, 1956, 1955, 1954, 1955, 1954 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case62() {
        int[] seq = { 1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 46 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case63() {
        int[] seq = { 1999, 2000, 1999, 2000, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980, 1979, 1978, 1977, 1976, 1975, 1974, 1973, 1972, 1971, 1970, 1969, 1968, 1967, 1966, 1965, 1964, 1963, 1962, 1961, 1960, 1959, 1958, 1957, 1956, 1955, 1954 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case64() {
        int[] seq = { 2000, 1967, 1934, 1901, 1868, 1835, 1802, 1769, 1736, 1703, 1670, 1637, 1604, 1571, 1538, 1505, 1472, 1439, 1406, 1373, 1340, 1307, 1274, 1241, 1208, 1175, 1142, 1109, 1076, 1043, 1010, 977, 944, 911, 878, 845, 812, 779, 746, 713, 680, 647, 614, 581, 548, 515, 482, 449, 416, 383 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case65() {
        int[] seq = { 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616, 616 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case66() {
        int[] seq = { 3, 37, 71, 105, 139, 173, 207, 241, 275, 309, 343, 377, 411, 445, 479, 513, 547, 581, 615, 649, 683, 717, 751, 785, 819, 853, 887, 921, 955, 989, 1023, 1057, 1091, 1125, 1159, 1193, 1227, 1261, 1295, 1329, 1363, 1397, 1431, 1465, 1499, 1533, 1567, 1601, 1635, 1669 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case67() {
        int[] seq = { 460, 491, 522, 553, 584, 615, 646, 677, 708, 739, 770, 801, 832, 863, 894, 925, 956, 987, 1018, 1049, 1080, 1111, 1142, 1173, 1204, 1235, 1266, 1297, 1328, 1301, 1274, 1247, 1220, 1193, 1166, 1139, 1112, 1085, 1058, 1031, 1004, 977, 950, 923, 896, 869, 842, 815, 788, 761 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case68() {
        int[] seq = { 1888, 1889, 1890, 1853, 1816, 1779, 1742, 1705, 1668, 1631, 1594, 1557, 1520, 1483, 1446, 1409, 1372, 1335, 1298, 1261, 1224, 1187, 1150, 1113, 1076, 1039, 1002, 965, 928, 891, 854, 817, 780, 743, 706, 669, 632, 595, 558, 521, 484, 447, 410, 373, 336, 299, 262, 225, 188, 151 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case69() {
        int[] seq = { 1474, 1477, 1480, 1483, 1486, 1489, 1492, 1495, 1498, 1501, 1504, 1507, 1510, 1513, 1516, 1519, 1522, 1525, 1528, 1531, 1534, 1537, 1540, 1543, 1546, 1549, 1552, 1555, 1558, 1561, 1564, 1567, 1570, 1573, 1576, 1579, 1582, 1585, 1588, 1591, 1594, 1597, 1600, 1603, 1606, 1609, 1612, 1615, 1618, 563 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case70() {
        int[] seq = { 398, 429, 460, 491, 522, 553, 584, 615, 646, 677, 708, 739, 770, 801, 832, 863, 894, 925, 956, 987, 1018, 1049, 1080, 1111, 1142, 1173, 1204, 1235, 1266, 1239, 1212, 1185, 1158, 1131, 1104, 1077, 1050, 1023, 1023, 1023, 1023, 1023, 1023, 1023, 1023, 1023, 1023, 1023, 1023, 1023 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case71() {
        int[] seq = { 264, 295, 326, 357, 388, 419, 450, 481, 512, 543, 574, 605, 636, 667, 698, 729, 760, 791, 822, 795, 768, 741, 714, 687, 660, 633, 606, 579, 552, 525, 525, 525, 525, 525, 525, 525, 525, 525, 525, 525, 525, 525, 568, 611, 654, 697, 740, 783, 826, 869 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case72() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 12 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case73() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 431 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case74() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 192 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case75() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 1013 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case76() {
        int[] seq = { 500, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case77() {
        int[] seq = { 1280, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case78() {
        int[] seq = { 1066, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case79() {
        int[] seq = { 969, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case80() {
        int[] seq = { 923, 969, 1015, 1061, 1594, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case81() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1412, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case82() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 599, 1141, 1092, 1043, 994, 945, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case83() {
        int[] seq = { 923, 969, 1015, 1061, 1107, 1153, 1199, 1245, 1291, 1337, 1288, 1239, 1190, 1141, 1092, 1043, 994, 483, 896, 847, 847, 847, 847, 900, 953, 1006, 1059, 1112, 1165, 1218, 1271, 1324, 1377, 1430, 1483, 1536, 1589, 1541, 1493, 1445, 1397, 1349, 1301, 1253, 1205, 1157, 1109, 1061, 1013, 965 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case84() {
        int[] seq = { 1933, 1807, 1681, 1555, 1429, 1303, 1177, 1051, 925, 771, 617, 463, 309, 155, 155, 155, 155, 280, 405, 530, 655, 780, 905, 1030, 1155, 1280, 1405, 1530, 1655, 1780, 1905, 1667, 1429, 1191, 953, 715 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case85() {
        int[] seq = { 1331, 1447, 1563, 1679, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1795, 1753, 1711, 1669, 1627, 1585, 1543, 1501, 1459, 1417, 1375 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case86() {
        int[] seq = { 1699, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657, 1657 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case87() {
        int[] seq = { 846, 1329, 1037, 745, 453, 161, 170, 179, 188, 197, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206, 206 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case88() {
        int[] seq = { 1815, 1815, 1815, 1815, 1815, 1815, 1815, 1815, 1815, 1815, 1815, 1694, 1573, 1452, 1331, 1210, 1089, 968, 847, 726, 605, 484, 363, 363, 363, 363, 363, 363, 363, 363, 308, 253, 198, 143, 88, 181, 274, 367, 460, 553, 646, 739, 832, 925, 1018, 1111, 1204, 1297, 1390, 1483 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case89() {
        int[] seq = { 1736, 1610, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1484, 1487, 1490, 1493, 1496, 1499, 1502, 1505, 1037, 569, 569, 569, 569, 569, 569, 569, 569 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case90() {
        int[] seq = { 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014, 1014 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case91() {
        int[] seq = { 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 735, 843, 951, 530, 109, 109, 109, 109, 109, 109, 109, 109 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case92() {
        int[] seq = { 1437, 968, 499, 30, 123, 216, 309, 379, 449, 519, 589, 659, 729, 799, 869, 939, 1009, 1079, 1149, 1219, 1289, 1359, 1429, 1499, 1569, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639, 1639 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case93() {
        int[] seq = { 33, 91, 149, 207, 265, 323, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 381, 360, 339, 318, 297, 276, 255, 234, 213, 192, 171, 171, 171 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case94() {
        int[] seq = { 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 157, 427, 697, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967, 967 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case95() {
        int[] seq = { 1846, 1678, 1510, 1342, 1265, 1188, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case96() {
        int[] seq = { 1082, 1108, 1134, 1160, 1186, 1229, 1272, 1315, 1358, 1401, 1444, 1487, 1530, 1573, 1616, 1389, 1162, 935, 708, 481, 613, 745, 877, 1009, 1141, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1273, 1415, 1557, 1699, 1841, 1983 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case97() {
        int[] seq = { 65, 65, 65, 65, 65, 65, 97, 129, 161, 193, 225, 257, 289, 289, 289, 197, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case98() {
        int[] seq = { 65, 65, 65, 65, 65, 65, 97, 129, 161, 193, 225, 257, 289, 289, 289, 197, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case99() {
        int[] seq = { 1183, 1270, 1357, 1444, 1531, 1618, 1705, 1792, 1514, 1826, 1650, 1474, 1298, 1122, 946, 992, 1038, 1084, 1130, 1176, 1222, 1268, 1268, 1268, 1268, 1268, 1268, 1268, 1268, 1268, 1268, 1268 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case100() {
        int[] seq = { 1478, 1105, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 732, 508, 284, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case101() {
        int[] seq = { 1056, 1179, 1302, 1425, 1430, 1435, 1440, 1445, 1450, 1455, 1460, 1465, 1470, 1475, 1480, 1485, 1490, 1495, 1500, 1505, 1510, 1515, 1520, 1525, 1530, 1388, 1246, 1246, 1246, 1246, 1246, 1246, 1303, 1360, 1417, 1474, 1531, 1588, 1645, 1645, 1645, 1645, 1645, 1645, 1645, 1645, 1645, 1645, 1645, 1645 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case102() {
        int[] seq = { 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1, 2000, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case103() {
        int[] seq = { 3, 1999, 2, 2000, 1, 2000, 1, 2000, 2, 2000, 1, 2000, 2, 1999, 2, 1998, 3, 1999, 2, 2000, 3, 1998, 3, 1998, 3, 1998, 3, 2000, 2, 1999, 2, 2000, 1, 1998, 1, 1998, 2, 1999, 2, 1998, 2, 1999, 3, 2000, 2, 1998, 3, 1999, 2, 1999 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case104() {
        int[] seq = { 833, 736, 1952, 396, 782, 794, 1671 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case105() {
        int[] seq = { 500, 1345, 1122, 707, 1355 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case106() {
        int[] seq = { 1611, 1127, 870, 1407, 1483, 1411, 770 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case107() {
        int[] seq = { 55, 1356, 1779, 562, 1411, 1464, 1530, 541, 938, 1286, 1775, 1539, 1741, 16, 876, 651, 625, 1301, 1346, 431, 1094, 334, 85, 1382, 1168, 251, 1078, 1952, 1325, 737, 463, 17, 896, 651, 476, 1628, 955, 1059, 1306, 775, 76, 8, 873, 318, 759, 352, 1548, 141 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case108() {
        int[] seq = { 1742, 56, 1325, 289, 1796, 650, 1987, 275, 2, 1743, 705, 1269, 1287, 948, 887, 1643, 1542, 1269, 1836, 1129, 1331, 1281, 1962, 1413, 1486, 1937, 811, 1726, 728, 1927, 1473, 1724, 1692, 140, 426, 1845, 130, 1234, 727, 28, 1272, 307, 1872, 452, 1120, 1194 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case109() {
        int[] seq = { 745, 852, 69, 1525, 794, 1231, 1560, 1142, 540, 390, 1535, 259, 1393, 239, 1052, 137, 93, 604, 37, 1299, 928, 762, 1758, 365, 1342, 757, 621, 1513, 438, 275, 1506, 1717, 349, 511, 848, 840, 192, 1270, 1646, 815, 1570, 1545, 363, 1215, 1033 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case110() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1451, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case111() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1451, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case112() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1001, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case113() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1051, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case114() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1451, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case115() {
        int[] seq = { 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1450, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 1451, 1400, 1350, 1300, 1250, 1200, 1150, 1100, 1050 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case116() {
        int[] seq = { 1, 3, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case117() {
        int[] seq = { 6, 1, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case118() {
        int[] seq = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case119() {
        int[] seq = { 1, 3, 4, 3, 1, 1, 1, 1, 3, 4, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case120() {
        int[] seq = { 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case121() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case122() {
        int[] seq = { 2, 2, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case123() {
        int[] seq = { 10, 10, 9, 9, 10, 11, 10 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case124() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 8, 9, 10, 11, 8, 5, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case125() {
        int[] seq = { 5, 4, 3, 4, 5, 6, 5, 4, 3, 4, 5, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case126() {
        int[] seq = { 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case127() {
        int[] seq = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case128() {
        int[] seq = { 1, 2, 1, 2, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case129() {
        int[] seq = { 1, 2, 1, 2, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case130() {
        int[] seq = { 9, 6, 3, 1, 9, 5, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case131() {
        int[] seq = { 1, 4, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case132() {
        int[] seq = { 1999, 2000, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 1999, 2000, 1999 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case133() {
        int[] seq = { 2, 1, 2, 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case134() {
        int[] seq = { 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case135() {
        int[] seq = { 3, 2, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case136() {
        int[] seq = { 3, 6, 4, 4, 4, 8 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case137() {
        int[] seq = { 1, 2, 4, 3, 4, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case138() {
        int[] seq = { 1184, 361, 235, 1314, 386 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case139() {
        int[] seq = { 50 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case140() {
        int[] seq = { 1, 2, 3, 4, 5, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case141() {
        int[] seq = { 1, 2, 2, 3, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case142() {
        int[] seq = { 3, 1, 1, 1, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case143() {
        int[] seq = { 10, 11, 12, 13, 11, 9, 9, 12, 15, 11, 8 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case144() {
        int[] seq = { 1, 3, 5, 7, 4 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case145() {
        int[] seq = { 2, 1, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case146() {
        int[] seq = { 3, 6, 9, 1, 9, 5, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case147() {
        int[] seq = { 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case148() {
        int[] seq = { 2, 2, 1, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case149() {
        int[] seq = { 3, 3, 2, 3, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case150() {
        int[] seq = { 1, 3, 5, 4, 1, 3, 5, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case151() {
        int[] seq = { 2, 3, 2, 3, 2, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case152() {
        int[] seq = { 1, 2, 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case153() {
        int[] seq = { 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case154() {
        int[] seq = { 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case155() {
        int[] seq = { 3, 2, 1, 2, 2, 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case156() {
        int[] seq = { 6, 5, 3, 1, 7, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case157() {
        int[] seq = { 3, 2, 3, 2, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case158() {
        int[] seq = { 1, 2, 1, 5, 3 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case159() {
        int[] seq = { 3, 3, 2, 2, 4, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case160() {
        int[] seq = { 1, 2, 3, 3, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case161() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case162() {
        int[] seq = { 2, 3, 4, 5, 6, 5, 4, 3, 4, 5, 6, 5, 4, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case163() {
        int[] seq = { 2, 2, 1, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case164() {
        int[] seq = { 1, 2, 3, 4, 5, 4, 3, 3, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case165() {
        int[] seq = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case166() {
        int[] seq = { 1, 20, 40, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 20, 40, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case167() {
        int[] seq = { 1, 2, 3, 4 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case168() {
        int[] seq = { 3, 2, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case169() {
        int[] seq = { 2, 2, 2, 2, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case170() {
        int[] seq = { 1, 2, 3, 5, 8, 7 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case171() {
        int[] seq = { 1094, 1891, 302, 1256, 1851, 182 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case172() {
        int[] seq = { 5, 6, 5, 3, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case173() {
        int[] seq = { 10 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case174() {
        int[] seq = { 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case175() {
        int[] seq = { 3, 1, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case176() {
        int[] seq = { 4, 5, 4, 4, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case177() {
        int[] seq = { 7, 5, 4, 3, 3, 4, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case178() {
        int[] seq = { 1, 2, 3, 3, 4, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case179() {
        int[] seq = { 7, 7, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case180() {
        int[] seq = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case181() {
        int[] seq = { 1, 5, 1, 1, 2, 3, 4, 5, 4, 3, 2, 1, 43 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case182() {
        int[] seq = { 1, 2, 2, 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case183() {
        int[] seq = { 1, 2, 3, 2, 1, 1, 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case184() {
        int[] seq = { 10, 10, 9, 9, 10, 9 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case185() {
        int[] seq = { 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case186() {
        int[] seq = { 3, 2, 1, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case187() {
        int[] seq = { 3, 6, 9, 1, 1, 9 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case188() {
        int[] seq = { 1, 2, 3, 4, 3, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 6 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case189() {
        int[] seq = { 1, 3, 5, 7, 5, 3, 3, 3, 5, 7 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case190() {
        int[] seq = { 1000, 1100, 1000, 1100, 1200, 1300, 1400 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case191() {
        int[] seq = { 5, 4, 2, 4, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case192() {
        int[] seq = { 1, 2, 1, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case193() {
        int[] seq = { 4 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case194() {
        int[] seq = { 1, 10, 9, 9, 8, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case195() {
        int[] seq = { 10, 9, 8, 7, 6, 7, 8, 9, 9, 9, 9, 8, 7, 6, 5, 6, 7, 8, 9, 10 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case196() {
        int[] seq = { 1, 2, 3, 3, 2, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case197() {
        int[] seq = { 1, 2, 10, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case198() {
        int[] seq = { 1, 2, 1, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case199() {
        int[] seq = { 1, 3, 8, 10, 3, 4, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case200() {
        int[] seq = { 1, 2, 1, 2, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case201() {
        int[] seq = { 1, 2, 3, 2, 1, 2, 3, 2, 1, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case202() {
        int[] seq = { 2, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case203() {
        int[] seq = { 3, 3, 3, 2, 1, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case204() {
        int[] seq = { 7, 7, 7, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case205() {
        int[] seq = { 3, 6, 8, 11, 15, 16 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case206() {
        int[] seq = { 2, 2, 1, 3, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case207() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case208() {
        int[] seq = { 10, 20, 10, 20, 10 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case209() {
        int[] seq = { 1, 2, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case210() {
        int[] seq = { 1, 2, 2, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case211() {
        int[] seq = { 1, 2, 2, 3, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case212() {
        int[] seq = { 1, 3, 3, 5, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case213() {
        int[] seq = { 1, 7, 6, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case214() {
        int[] seq = { 1, 2, 3, 5, 7, 7, 8, 7 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case215() {
        int[] seq = { 2, 1, 2, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case216() {
        int[] seq = { 1, 3, 5, 7, 4, 6, 4, 2 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case217() {
        int[] seq = { 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case218() {
        int[] seq = { 1, 3, 6, 4, 2, 2, 8, 12, 7, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case219() {
        int[] seq = { 2, 2, 1, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case220() {
        int[] seq = { 1, 3, 5, 6, 7, 7, 7, 8, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case221() {
        int[] seq = { 5, 4, 4, 5, 4 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case222() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case223() {
        int[] seq = { 1, 3, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case224() {
        int[] seq = { 4, 3, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case225() {
        int[] seq = { 1, 3, 5, 7, 4, 1, 1, 1, 1, 3, 5, 7, 5, 3, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case226() {
        int[] seq = { 1, 2, 3, 5, 7, 7, 7, 8, 9, 11, 13 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case227() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case228() {
        int[] seq = { 6, 1, 6, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case229() {
        int[] seq = { 3, 3, 2, 1, 1, 2, 3, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case230() {
        int[] seq = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 1, 1, 1, 1, 2, 3, 4, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case231() {
        int[] seq = { 1, 3, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1, 3, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case232() {
        int[] seq = { 1, 3, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7, 7 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case233() {
        int[] seq = { 1, 2, 3, 2, 1, 1, 2, 3, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case234() {
        int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case235() {
        int[] seq = { 1, 2, 5, 2, 1, 2, 5, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case236() {
        int[] seq = { 1, 2, 4, 3, 2, 3, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case237() {
        int[] seq = { 5, 4, 2, 2, 3, 2 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case238() {
        int[] seq = { 1, 2, 3, 3, 3, 4, 5, 5 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case239() {
        int[] seq = { 1, 2, 4, 5, 4, 3, 3, 3, 4, 5, 4, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case240() {
        int[] seq = { 1, 5, 1, 5, 1 };
        assertEquals("YES", foxsequence.isValid(seq));
    }

    @Test
    public void case241() {
        int[] seq = { 5, 4, 3, 3, 4, 3 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

    @Test
    public void case242() {
        int[] seq = { 6, 4, 1, 1, 2, 1 };
        assertEquals("NO", foxsequence.isValid(seq));
    }

}
