package main;

public class Main8 {

  public String appendString(String str1, String str2) {

    StringBuffer sb1 = new StringBuffer(str1);

    sb1.append(str2);

    return sb1.toString();

  }

}
