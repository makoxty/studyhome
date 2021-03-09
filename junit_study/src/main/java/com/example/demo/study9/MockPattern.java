package com.example.demo.study9;

public class MockPattern {

  private Service service;

  public String getContent(int id) {
    String content = service.getContentById(id);
    return content;
  }

}
