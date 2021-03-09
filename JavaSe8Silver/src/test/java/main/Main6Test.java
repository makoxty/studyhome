package main;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Main6Test extends Main6 {

  @Mock
  private List<String> list;

  @Mock
  private Main6 main6;

  @BeforeEach
  void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void main6Test() {
    when(list.get(1)).thenReturn("H");

    String expected = "H";

    String actual = main6.main6();

    assertEquals(expected, actual);
  }

}
