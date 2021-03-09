package main;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class Main7Test extends Main7 {

  private Main7 main7 = new Main7();

  @BeforeEach
  void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @DisplayName("正常系")
  @Test
  void divideTest01() {

    // 期待値
    int expected = 3;

    // 実行
    int actual = main7.divide(6, 2);

    // 検証
    assertEquals(expected, actual);
  }

  @DisplayName("異常系")
  @Test
  void divideTest02() {
    // 実行
    try {
      int actual = main7.divide(1, 0);
      fail();
    } catch (IllegalArgumentException expected) {
      assertThat(expected.getMessage(), equalTo("y is zero"));
    }
  }
}