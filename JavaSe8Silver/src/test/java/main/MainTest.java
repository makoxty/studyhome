package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import sub.Sample;

public class MainTest {

  @Spy
  private Main main;

  @Spy
  private Main2 main2;

  @Spy
  private Sample sample;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @After
  public void tearDown() throws Exception {
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
