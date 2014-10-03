package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class FoxAndMp3EasyTest {
    FoxAndMp3Easy foxandmp3easy = new FoxAndMp3Easy();

    @Test
    public void case1() {
        int n = 3;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case2() {
        int n = 10;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case3() {
        int n = 16;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case4() {
        int n = 32;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case5() {
        int n = 109;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case6() {
        int n = 1000;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "1000.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case7() {
        int n = 1;
        assertArrayEquals(new String[] { "1.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case8() {
        int n = 114;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case9() {
        int n = 87;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case10() {
        int n = 127;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case11() {
        int n = 29;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case12() {
        int n = 43;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case13() {
        int n = 67;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case14() {
        int n = 511;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case15() {
        int n = 1;
        assertArrayEquals(new String[] { "1.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case16() {
        int n = 17;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case17() {
        int n = 148;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case18() {
        int n = 62;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case19() {
        int n = 35;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case20() {
        int n = 567;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case21() {
        int n = 143;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case22() {
        int n = 43;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case23() {
        int n = 127;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case24() {
        int n = 1;
        assertArrayEquals(new String[] { "1.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case25() {
        int n = 120;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case26() {
        int n = 112;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case27() {
        int n = 102;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case28() {
        int n = 21;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case29() {
        int n = 256;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case30() {
        int n = 10;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case31() {
        int n = 12;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case32() {
        int n = 160;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case33() {
        int n = 46;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case34() {
        int n = 4;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case35() {
        int n = 29;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case36() {
        int n = 5;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case37() {
        int n = 55;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case38() {
        int n = 942;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case39() {
        int n = 52;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "6.mp3", "7.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case40() {
        int n = 17;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case41() {
        int n = 8;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case42() {
        int n = 135;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case43() {
        int n = 3;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case44() {
        int n = 10;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case45() {
        int n = 104;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case46() {
        int n = 116;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case47() {
        int n = 114;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case48() {
        int n = 131;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case49() {
        int n = 46;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case50() {
        int n = 60;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case51() {
        int n = 1;
        assertArrayEquals(new String[] { "1.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case52() {
        int n = 45;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case53() {
        int n = 88;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case54() {
        int n = 133;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case55() {
        int n = 40;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case56() {
        int n = 979;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case57() {
        int n = 117;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case58() {
        int n = 6;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case59() {
        int n = 109;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case60() {
        int n = 111;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case61() {
        int n = 27;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case62() {
        int n = 1;
        assertArrayEquals(new String[] { "1.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case63() {
        int n = 19;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case64() {
        int n = 57;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case65() {
        int n = 640;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case66() {
        int n = 46;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case67() {
        int n = 2;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case68() {
        int n = 103;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case69() {
        int n = 10;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case70() {
        int n = 10;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case71() {
        int n = 8;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case72() {
        int n = 9;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case73() {
        int n = 382;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case74() {
        int n = 4;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case75() {
        int n = 21;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case76() {
        int n = 91;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case77() {
        int n = 59;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case78() {
        int n = 7;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case79() {
        int n = 141;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "15.mp3", "16.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case80() {
        int n = 101;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case81() {
        int n = 37;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case82() {
        int n = 132;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case83() {
        int n = 42;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case84() {
        int n = 13;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case85() {
        int n = 32;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case86() {
        int n = 821;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case87() {
        int n = 34;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case88() {
        int n = 20;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case89() {
        int n = 93;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case90() {
        int n = 2;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case91() {
        int n = 123;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case92() {
        int n = 40;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case93() {
        int n = 577;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case94() {
        int n = 123;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case95() {
        int n = 142;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "15.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case96() {
        int n = 150;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case97() {
        int n = 79;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case98() {
        int n = 18;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case99() {
        int n = 128;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case100() {
        int n = 3;
        assertArrayEquals(new String[] { "1.mp3", "2.mp3", "3.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case101() {
        int n = 136;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case102() {
        int n = 146;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case103() {
        int n = 135;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case104() {
        int n = 59;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case105() {
        int n = 1;
        assertArrayEquals(new String[] { "1.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case106() {
        int n = 43;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case107() {
        int n = 31;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case108() {
        int n = 48;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case109() {
        int n = 49;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case110() {
        int n = 50;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case111() {
        int n = 51;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "6.mp3", "7.mp3", "8.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case112() {
        int n = 52;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "6.mp3", "7.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case113() {
        int n = 300;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case114() {
        int n = 100;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case115() {
        int n = 999;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case116() {
        int n = 500;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case117() {
        int n = 501;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case118() {
        int n = 151;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case119() {
        int n = 888;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case120() {
        int n = 701;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3" }, foxandmp3easy.playList(n));
    }

    @Test
    public void case121() {
        int n = 70;
        assertArrayEquals(new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3" }, foxandmp3easy.playList(n));
    }

}
