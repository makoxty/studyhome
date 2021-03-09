package main;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import sub.Sample;

class Main2Test extends Main2 {

  @Spy
  private Main main;

  @Spy
  private Main2 main2;

  @Spy
  private Sample sample;

  @BeforeEach
  void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void main2Test() {

    doReturn("Hello World").when(sample).getValue();

    // 期待値
    String expected = "Hello World";

    // 実行
    String actual = main2.main2();

    assertEquals(expected, actual);
  }
}
