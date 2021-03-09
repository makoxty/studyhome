package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Main5Test extends Main5 {

  Main5 main5 = new Main5();

  @BeforeEach
  void setUp() throws Exception {
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void main5Test() {

    // 変更に弱いコード

    List<String> expceted = new ArrayList<>();
    expceted.add("D");
    expceted.add("A");
    expceted.add("B");
    expceted.add("C");

    List<String> actual = main5.main5();

    assertEquals(expceted, actual);

  }
}
