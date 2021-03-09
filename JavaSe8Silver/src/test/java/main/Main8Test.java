package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class Main8Test {

  @BeforeEach
  void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void appendStringTest() {

    Main8 main8 = new Main8();

    // 期待値
    String expected = "Hello World";

    // 実行
    String actual = main8.appendString("Hello ", "World");

    // 検証
    assertEquals(actual, expected);
  }

  @Test
  void appendStringTest02() {
    Main8 main8 = mock(Main8.class);
    StringBuilder sb = mock(StringBuilder.class);

    when(sb.append(anyString())).thenReturn("");
    // 期待値
    String expected = "Hello World";

        // 実行
    String actual = main8.appendString("Hello ", "World");

    // 検証
    assertEquals(actual, expected);

  }

}
