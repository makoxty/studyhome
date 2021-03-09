package main;

import java.util.ArrayList;
import java.util.List;

public class Main6 {

  public String main6() {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.remove(1);

    return list.get(1);

  }

}
