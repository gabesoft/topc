package topc.easy;

import java.text.*;
import java.util.*;
import java.io.*;

// SRM 583 Division II Level Two - 550
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12610&rd=15503
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+583
public class IDNumberVerification {
  public String verify(String id, String[] regionCodes) {
    String region = id.substring(0, 6);
    String birthday = id.substring(6, 14);
    String code = id.substring(14, 17);
    String checksum = id.substring(17, 18);

    if (!validRegion(regionCodes, region)) { return "Invalid"; }
    if (!validBirthday(birthday)) { return "Invalid"; }
    if (!validChecksum(id)) { return "Invalid"; }

    String gender = validCode(code);

    return gender == null ? "Invalid" : gender;
  }

  private boolean validChecksum(String id) {
    long pow = 2;
    long n = 0;

    for (int i = 16; i > -1; i--) {
      int k = id.charAt(i) - '0';
      n += k * pow;
      pow *= 2;
    }


    for (int c = 0; c < 11; c++) {
      if ((c + n) % 11 == 1) {
        if (c == 10) {
          return id.charAt(17) == 'X';
        } else {
          return id.charAt(17) == (c + '0');
        }
      }
    }

    return false;
  }

  private String validCode(String code) {
    int n = Integer.parseInt(code);

    if (n == 0) { return null; }

    return n % 2 == 1 ? "Male" : "Female";
  }

  private boolean validBirthday(String birthday) {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
    Date date = null;
    Calendar cal = Calendar.getInstance();

    try {
      date = formatter.parse(birthday);
    } catch(ParseException e){
      return false;
    }

    cal.setTime(date);
    int month = cal.get(Calendar.MONTH) + 1;
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int year = cal.get(Calendar.YEAR);

    int y = Integer.parseInt(birthday.substring(0, 4));
    int m = Integer.parseInt(birthday.substring(4, 6));
    int d = Integer.parseInt(birthday.substring(6, 8));

    return month == m && day == d && year == y && y <= 2011 && y >= 1900;
  }

  private boolean validRegion(String[] codes, String code) {
    for (int i = 0; i < codes.length; i++) {
      if (codes[i].equals(code)) {
        return true;
      }
    }
    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
