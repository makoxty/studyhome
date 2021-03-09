package main;

public class Main7 {

  public int divide(int x, int y) {
    if (y == 0) throw new IllegalArgumentException("y is zero");

    return x / y;
  }

}
