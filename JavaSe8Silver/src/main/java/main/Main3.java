package main;

public class Main3 {
  public void hello(String name) throws SampleException {
    if (name == null) {
      throw new SampleException();
    }
    if ("".equals(name)) {
      throw new TestException();
    }
  }
}

class SampleException extends Exception{}
class TestException extends RuntimeException {}
