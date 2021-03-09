package main;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Main3Test extends Main3 {

  @Mock
  private Main3 main3;

  @BeforeEach
  void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void helloTest1() {

    // 実行
    try {
      doThrow(new SampleException()).when(main3).hello(null);
    } catch (SampleException e) {
      e.printStackTrace();
    }
  }

  @Test
  void helloTest2() {

    // 実行
    try {
      doThrow(new SampleException()).when(main3).hello("");
    } catch (SampleException e) {
      e.printStackTrace();
    }
  }

}
