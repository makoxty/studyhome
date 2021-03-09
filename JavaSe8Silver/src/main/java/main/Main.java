package main;

import sub.Sample;

public class Main {

  public static void main() {
    Sample a = new Sample(10, "a");
    Sample b = new Sample(10, "b");
    System.out.println(a.equals(b));
  }

}
