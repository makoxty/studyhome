package com.example.demo.study9;

import java.util.HashMap;
import java.util.Map;

public class Service {

  private Map contents = new HashMap();

  public Service() {
      genContents();
  }

  // ControllerクラスのgetContentメソッドの中で使用
  public String getContentById(Integer id) {
      String content;
      content = contents.get(id).toString();
      return content;
  }

  public void genContents() {
      for(int i = 0; i < 10; i++) {
          contents.put(i, "Content" + i);
      }
  }

}
