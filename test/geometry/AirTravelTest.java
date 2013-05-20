package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class AirTravelTest {
  double DELTA = 1.0e-09;
  AirTravel airtravel = new AirTravel();

  @Test
  public void case1() {
    int[] latitude = { 0, 0, 70 };
    int[] longitude = { 90, 0, 45 };
    String[] canTravel = { "2", "0 2", "0 1" };
    int origin = 0;
    int destination = 1;
    assertEquals(10612.237799994255, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 10612.237799994255);
  }

  @Test
  public void case2() {
    int[] latitude = { 0, 0, 70 };
    int[] longitude = { 90, 0, 45 };
    String[] canTravel = { "1 2", "0 2", "0 1" };
    int origin = 0;
    int destination = 1;
    assertEquals(6283.185307179586, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 6283.185307179586);
  }

  @Test
  public void case3() {
    int[] latitude = { 0, 30, 60 };
    int[] longitude = { 25, -130, 78 };
    String[] canTravel = { "1 2", "0 2", "1 2" };
    int origin = 0;
    int destination = 0;
    assertEquals(0.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA);
  }

  @Test
  public void case4() {
    int[] latitude = { 0, 20, 55 };
    int[] longitude = { -20, 85, 42 };
    String[] canTravel = { "1", "0", "0" };
    int origin = 0;
    int destination = 2;
    assertEquals(-1.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * -1.0);
  }

  @Test
  public void case5() {
    int[] latitude = { 77, 32, -63, -45, -29, -72, -62, 29, -77, -50, -84 };
    int[] longitude = { 4, -51, 67, -66, -21, -13, -70, -85, -81, 17, -25 };
    String[] canTravel = { "0 1 6 7 9 10", "2 3 4 8", "0 1 3 5 6 10", "1 5 6 9 10", "0 1 5 10", "2 3 6 8", "0 1 2 5 7 8", "0 1 4 5 6 8", "3 10", "2 8 9", "0 2 3 10" };
    int origin = 8;
    int destination = 8;
    assertEquals(0.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA);
  }

  @Test
  public void case6() {
    int[] latitude = { 53, 17, 0, -87, -53, -73, 88, 62, -69, -9, 76, -32, -72, -2, -72, -72 };
    int[] longitude = { -84, -67, -67, -7, 69, -83, -42, 29, 35, 25, 19, -1, 69, -44, -10, -65 };
    String[] canTravel = { "3 4 7 10", "4 5 8 9 10 14", "2 7 9 11", "0 2 3 4 6 7 8 11 12 14", "2 3 4 5 7 8 9 10 11 14", "0 1 3 4 5 6 13 14 15", "0 3 4 6 7 8 9 10 12 13 14", "2 3 4 6 9 10 11 12 13 15", "0 3 6 11 14 15", "0 2 4 5 6 9 10 11 15", "2 3 4 7 9 10 11 12 13 14 15", "0 3 4 5 7 8 12 13", "1 2 4 6 8 12 15", "1 2 5 8 9 10 13", "3 4 6 9 10 11 13 14 15", "1 2 3 9 12 13 14" };
    int origin = 15;
    int destination = 8;
    assertEquals(2476.4572913155125, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 2476.4572913155125);
  }

  @Test
  public void case7() {
    int[] latitude = { 88, 17, -80, 39, 55, 56 };
    int[] longitude = { 29, -13, -29, -16, 0, -45 };
    String[] canTravel = { "0 2", "1 2 5", "0 2 4", "1 2 3", "0 1 2 3", "2 3 5" };
    int origin = 2;
    int destination = 1;
    assertEquals(12239.008429056397, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 12239.008429056397);
  }

  @Test
  public void case8() {
    int[] latitude = { 66, 26, -11, -32, 48, -27, -32, 78, -7, 89, 0, -27, 18, 27, 7, -7, 61, -11, 71, -8 };
    int[] longitude = { 82, -74, -55, 89, -47, 50, 48, 35, -61, -60, -25, 59, -49, 54, -51, -43, -64, 21, -37, 32 };
    String[] canTravel = { "0 7 9 10 12 15", "0 1 5 6 8 9 10 13 16 17 18", "1 3 5 7 8 10 11 12 19", "0 4 7 8 9 10 11 15 16 17 19", "0 1 2 4 5 8 10 11 12 15 18", "4 6 7 9 10 11 12 17 19", "1 2 3 7 10 11 12 13 17", "1 2 5 10 12 19", "1 2 4 5 6 7 8 9 10 11 13 18", "4 10 12 14 15 16 17 19", "0 4 5 6 9 12 13 14 16", "3 6 7 10 13 16 17 18", "0 1 2 4 7 14 15 16 18", "1 3 4 6 7 9 10 11 13 16 17 19", "0 2 3 4 8 11 12 15 16 19", "0 2 4 5 7 11 14 15 17 19", "1 2 3 9 10 14 17 18", "0 1 2 3 4 5 8 10 11 12 15 18", "0 7 11 14 16", "0 3 4 7 8 12 14 16 17 18" };
    int origin = 5;
    int destination = 3;
    assertEquals(2409.5245773235165, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 2409.5245773235165);
  }

  @Test
  public void case9() {
    int[] latitude = { 52, -20, 86 };
    int[] longitude = { -9, -90, -24 };
    String[] canTravel = { "0 1 2", "2", "1" };
    int origin = 2;
    int destination = 0;
    assertEquals(-1.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * -1.0);
  }

  @Test
  public void case10() {
    int[] latitude = { -20, 43, 20, 82, 89 };
    int[] longitude = { 63, 55, -82, 79, 18 };
    String[] canTravel = { "0 1 3", "0 1", "1 2 3", "0 1", "1 2 3 4" };
    int origin = 1;
    int destination = 1;
    assertEquals(0.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA);
  }

  @Test
  public void case11() {
    int[] latitude = { -5, 27, -37, -86, -42, 77, 39, -46, -14, -41, 1, 27, -68, 33, 85, -19 };
    int[] longitude = { 35, 47, 26, 80, 20, 22, -9, 14, 50, -63, -76, -34, -89, -15, 22, 71 };
    String[] canTravel = { "1 2 3 8 10 11 13 14 15", "0 3 9 13 14 15", "0 2 9 11 14", "0 1 4 7 9 11 12 13 14 15", "3 4 6 7 9 12", "0 3 8 9 11 13", "1 5 9 10 13 14", "0 1 9 10 12 13 15", "0 2 3 6 7 9 11 12", "1 3 4 5 7 8 10 11 14", "1 2 8 10 11 14", "0 1 6 8 10 11 12 13 15", "1 2 3 5 6 10 12 14 15", "1 2 3 5 6 8 9 10 13 14", "5 8 11", "1 6 7 8 9 10 11 12 15" };
    int origin = 15;
    int destination = 15;
    assertEquals(0.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA);
  }

  @Test
  public void case12() {
    int[] latitude = { 60, -66, 60, -31, 53, -4, -23, -33, -42, 88, -33, -35, -78, 0, -49, -15 };
    int[] longitude = { -18, 45, 90, 61, -40, 90, 68, 12, -48, 80, 65, -8, -37, 59, -48, -8 };
    String[] canTravel = { "0 2 3 6 8 9 10 14 15", "2 3 5 6 7 9 10 12", "0 3 4 5 8 10 11 13 14 15", "1 2 5 7 9 14", "0 3 5 6 7 8 14", "0 1 4 6 10 11 13 14", "2 4 5 6 8 9 10 12 13 14", "6 8 12 13 14", "0 2 5 6 7 8 10 11 14 15", "0 1 2 3 4 5 6 11 13 14 15", "0 2 3 4 5 6 7 8 10 13", "0 3 4 7 8 9 11 13 14 15", "1 2 4 6 7 8 9 12 13 15", "0 2 3 5 7 8 9 11", "0 1 5 6 7 10 11 12 13 15", "5 6 9 11 13" };
    int origin = 3;
    int destination = 7;
    assertEquals(2877.9825503801253, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 2877.9825503801253);
  }

  @Test
  public void case13() {
    int[] latitude = { -40, 73, -47, 56 };
    int[] longitude = { 52, -4, -7, 4 };
    String[] canTravel = { "1 3", "1 2 3", "1 2 3", "1 2 3" };
    int origin = 3;
    int destination = 1;
    assertEquals(1208.401739001028, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 1208.401739001028);
  }

  @Test
  public void case14() {
    int[] latitude = { -28, -71, -40, -30, 26, 38, -53 };
    int[] longitude = { 17, 85, 26, 73, -49, -71, -22 };
    String[] canTravel = { "1 3 5 6", "2 3 4", "0 1 2 4", "0 3 4", "0 1 3 4 5 6", "1 2 3 4 6", "1 6" };
    int origin = 1;
    int destination = 1;
    assertEquals(0.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA);
  }

  @Test
  public void case15() {
    int[] latitude = { 46, 20, 35, 77, -7, -72, 25, -78, -29, 47, -87, -67, 57 };
    int[] longitude = { 23, 44, -56, -58, -61, 6, 73, -84, 62, 90, -46, -86, -77 };
    String[] canTravel = { "3 4 6 10 12", "1 2 4 12", "5 6 8", "0 5 6 7 9 11 12", "4 6 7 8 12", "1 2 3 4 6 7 8 12", "0 4 5 7 9", "1 2 3 4 5 7 10 12", "3 8 11", "0 1 4 5 8 10", "0 1 3 5 6 7 9 10 11 12", "0 3 5 6 7 8 9 10 12", "1 4 5 8 9 11 12" };
    int origin = 9;
    int destination = 8;
    assertEquals(5591.335303331194, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 5591.335303331194);
  }

  @Test
  public void case16() {
    int[] latitude = { 22, -20, 10, 21, 84, 46 };
    int[] longitude = { 9, 22, -52, -11, -4, -66 };
    String[] canTravel = { "0 1 2 5", "2 5", "2 3 5", "1 4 5", "0 2", "1 4" };
    int origin = 1;
    int destination = 0;
    assertEquals(14417.45623332333, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 14417.45623332333);
  }

  @Test
  public void case17() {
    int[] latitude = { 16, -8 };
    int[] longitude = { -81, -31 };
    String[] canTravel = { "0", "0" };
    int origin = 1;
    int destination = 1;
    assertEquals(0.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA);
  }

  @Test
  public void case18() {
    int[] latitude = { -82, -14, -9, -29, -13, 58, 63, 16, 15, 74, -58, -74, 66, 80, 39, 57, 79, -51, 24 };
    int[] longitude = { -81, 1, 84, -31, -14, -48, -7, 90, -59, 88, -6, -8, 28, -45, 58, -51, -70, 63, -25 };
    String[] canTravel = { "3 7 9 11 14 18", "0 1 2 5 6 7 9 13 14 16 18", "4 6 7 9 11 13 14 15 17 18", "0 1 3 6 7 8 12 13 14 16 18", "2 4 6 8 12 17", "0 2 6 7 8 10 13 14 16 18", "1 3 4 5 7 9 10 13", "2 3 4 5 6 11 13 14 17", "3 5 9 11 12 13 14 15 18", "1 2 3 4 5 7 8 11 12 13 18", "2 3 6 7 10 13 14 15 16 17", "0 1 2 4 5 6 9 10 13 16 17 18", "4 6 7 16 17 18", "2 4 7 8 10 13 14 15 16 17", "0 7 10 12 15 17 18", "1 2 4 5 6 7 8 10 11 13 14", "0 2 3 4 5 6 7 8 10 11 12 13 14 15", "0 2 3 4 5 7 8 9 10 11 12 13 15 18", "1 2 3 4 7 9 11 12 15 16" };
    int origin = 9;
    int destination = 16;
    assertEquals(1993.8025338562802, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 1993.8025338562802);
  }

  @Test
  public void case19() {
    int[] latitude = { -17, 50, -62, -3, -39, 89, -46, -36, 68, -30, -76 };
    int[] longitude = { -14, 64, 25, 46, 76, -77, -70, -57, -29, 79, -23 };
    String[] canTravel = { "0 4 10", "0 1 2 5 9", "0 1 2 3 5 6 7 8 9", "5 6 8 9", "0 2 5 6 7 8", "1 2 3 6", "0 1 5 10", "0 1 2 3 4 5 7 9 10", "1 3 5 6 7 8 9 10", "1 2 3 4 5 6", "1 2 4 8" };
    int origin = 1;
    int destination = 7;
    assertEquals(11962.040343248767, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 11962.040343248767);
  }

  @Test
  public void case20() {
    int[] latitude = { 2, -87, 74, -13 };
    int[] longitude = { 86, 83, -29, 30 };
    String[] canTravel = { "1 3", "0 2", "1", "0" };
    int origin = 2;
    int destination = 0;
    assertEquals(17723.943245668233, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 17723.943245668233);
  }

  @Test
  public void case21() {
    int[] latitude = { -50, 34, 78, 87, -8, -32 };
    int[] longitude = { -42, 1, -1, 17, 5, 42 };
    String[] canTravel = { "0 1", "0 4", "0 1 2 3 5", "1 2 5", "0 1 2 4", "2 3 4" };
    int origin = 3;
    int destination = 5;
    assertEquals(8326.810439923662, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 8326.810439923662);
  }

  @Test
  public void case22() {
    int[] latitude = { 19, -40, 46, -37, -7, 2, 79, -22, 14, -30, -54 };
    int[] longitude = { 22, 86, -90, 65, 73, 16, -88, -7, -20, -4, 6 };
    String[] canTravel = { "1 2 4 5 8 10", "0 3 4 6 7 9", "0 3 6 7 9", "0 1 2 4 6 10", "0 4 5 6 7 8 9 10", "2 6 7 9 10", "5 6 8 9", "2 4 7 8 9 10", "1 2 4 5 7 9", "2 3 4 6 7 8 9", "3 7 9 10" };
    int origin = 5;
    int destination = 8;
    assertEquals(4961.110536291824, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 4961.110536291824);
  }

  @Test
  public void case23() {
    int[] latitude = { -52, -45, 19, -77, -47, -13, 0 };
    int[] longitude = { -31, 78, -38, -23, 15, 52, -66 };
    String[] canTravel = { "1", "0 2 4", "0 1 2 3 5", "0 6", "6", "0 1 4 6", "0 1 2 3 4" };
    int origin = 3;
    int destination = 2;
    assertEquals(7953.897459943442, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 7953.897459943442);
  }

  @Test
  public void case24() {
    int[] latitude = { -45, -75, -29, 46, 35, -43, 13, -82, -76, 7 };
    int[] longitude = { 29, -46, -29, -6, -82, 60, 12, -84, 55, -14 };
    String[] canTravel = { "1 4 5 7 8", "2 4 5 7 8", "4 6 7 9", "2 3 8", "0 2 3 4 9", "1 2 4 5 7 8", "3 6 7 9", "3 4 5 6 8 9", "0 2 6 9", "1 4 6 7 9" };
    int origin = 4;
    int destination = 7;
    assertEquals(9622.559067480373, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 9622.559067480373);
  }

  @Test
  public void case25() {
    int[] latitude = { 83, -72, -9, -46, 56, 86, 60, -26, 77, -1, 72, 6, 2, 25, -85, 37, 17, 67, -61, -75 };
    int[] longitude = { -33, -34, -52, -84, -9, -46, 32, -72, -66, 50, 8, -24, 80, 54, -10, -84, -76, -55, -87, -48 };
    String[] canTravel = { "1 3 7 8 14 15 16 19", "0 1 2 8 10 12 14 15 18 19", "0 1 2 3 4 11 12 13 14 15 17 18", "0 1 5 7 8 9 10 12 18 19", "0 3 5 7 11 12 13 15 17 19", "0 1 3 6 8 12 13 16 18 19", "0 1 3 5 6 8 9 12 13 14 16 17", "0 6 11 15 17", "1 4 5 7 8 9 10 11 13 17 18 19", "0 1 2 4 5 8 9 11 17", "0 3 4 6 10 11 13 15 16 17", "1 2 4 6 7 8 9 10 13 14 16 17 18", "0 1 2 3 5 8 9 10 11 12 14 15 16 19", "3 5 7 8 10 11 13 14", "3 4 6 9 10 11 12 13 14 17 19", "0 4 5 6 7 11 13 14 15 18", "0 1 2 5 6 10 11 16 17", "1 4 13 17 18 19", "1 2 3 4 5 6 8 9 10 11 12 13 17 18", "0 1 3 5 11 12 14 15 16 17 19" };
    int origin = 14;
    int destination = 9;
    assertEquals(6039.205135480922, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 6039.205135480922);
  }

  @Test
  public void case26() {
    int[] latitude = { 41, -63, -82, 47, 24, -10, -20, -25, -49, 37, 39, -33, 57, 63, 61, 0, 59, -23, 64 };
    int[] longitude = { 84, -59, -26, -78, -77, 57, 43, -49, 74, 16, 60, 85, 72, -40, -76, 0, 35, 83, -73 };
    String[] canTravel = { "1 7 11 14 15 18", "1 3 7 8 10 11 14", "0 2 3 4 5 7 8 9 10 13 14 15 16 17 18", "0 1 3 5 7 9 10 15 16 17 18", "0 3 5 6 7 9 10 11 12 14", "1 2 4 5 7 8 9 10 11 14 15", "0 2 5 6 7 12 15", "1 2 3 4 5 7 13 14 16 17 18", "1 2 3 4 8 10 12 13 15 18", "1 5 7 9 10 11 16 17", "0 2 3 4 6 12 13 17 18", "0 1 2 3 4 5 6 8 9 10 12 14 15 16 17 18", "0 1 2 6 7 8 15 16 17 18", "1 2 3 4 5 6 8 12 13 15 17", "0 1 2 3 4 5 7 9 13 14 15 17 18", "1 3 7 12 13 15 17 18", "3 8 12 13 15 18", "2 3 6 8 12 13 14 15 17", "1 3 5 6 7 10 11 12 13 15" };
    int origin = 3;
    int destination = 9;
    assertEquals(4627.749316573995, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 4627.749316573995);
  }

  @Test
  public void case27() {
    int[] latitude = { -11, 37, -4, 68, -50, -4, -88, 81, -56, -41 };
    int[] longitude = { 50, -8, 11, 44, 70, 57, 26, -43, -42, -73 };
    String[] canTravel = { "1 2 3 6 8", "1 3 4 9", "0 1 2 4 5 6 7", "1 2 3 5 7 8", "3 5 6 7", "0 2 4 5 6 7 8 9", "2 6 7 8 9", "1 6 8 9", "1 4 6 7", "0 5 9" };
    int origin = 1;
    int destination = 5;
    assertEquals(8004.663144446447, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 8004.663144446447);
  }

  @Test
  public void case28() {
    int[] latitude = { 0, 0, 70 };
    int[] longitude = { 90, 0, 45 };
    String[] canTravel = { "1 2", "0 2", "0 1" };
    int origin = 0;
    int destination = 1;
    assertEquals(6283.185307179586, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 6283.185307179586);
  }

  @Test
  public void case29() {
    int[] latitude = { 0, 30, 60 };
    int[] longitude = { 25, -130, 78 };
    String[] canTravel = { "1 2", "0 2", "1 2" };
    int origin = 0;
    int destination = 1;
    assertEquals(9893.231024871204, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 9893.231024871204);
  }

  @Test
  public void case30() {
    int[] latitude = { 0, 0, 70 };
    int[] longitude = { 90, 0, 45 };
    String[] canTravel = { "2", "0 2", "0 1" };
    int origin = 0;
    int destination = 1;
    assertEquals(10612.237799994255, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * 10612.237799994255);
  }

  @Test
  public void case31() {
    int[] latitude = { 0, 20, 55 };
    int[] longitude = { -20, 85, 42 };
    String[] canTravel = { "1", "0", "0" };
    int origin = 0;
    int destination = 2;
    assertEquals(-1.0, airtravel.shortestTrip(latitude, longitude, canTravel, origin, destination), DELTA * -1.0);
  }

}
