package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Main4Test extends Main4 {

  @Mock
  private Main4 main4;

  @BeforeEach
  void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void main4Test() {
    when(main4.main4()).thenReturn("Hello");

    String actual = main4.main4();

    String expected = "Hello";

    assertEquals(expected, actual);
  }

}
