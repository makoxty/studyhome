package main;

import sub.Sample;

public class Main2 {

  Sample s = new Sample();

  public String main2() {

    s.setValue("hello");

  return s.getValue();

  }

  public int main3() {
    int result = s.method(2, 3);
    return result;
  }

}
