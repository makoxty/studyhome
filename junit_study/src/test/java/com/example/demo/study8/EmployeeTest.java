package com.example.demo.study8;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest extends Employee {

  @BeforeEach
  void setUp() throws Exception {
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void loadTest() {
    InputStream input = getClass().getResourceAsStream("Employee.txt");
    List<Employee> actual = Employee.load(input);

    assertThat(actual.size(), is(1));
    Employee actualEmployee = actual.get(0);
    assertThat(actualEmployee.getFirstName(), is("Ichiro"));
    assertThat(actualEmployee.getLastName(), is("Tanaka"));
    assertThat(actualEmployee.getEmail(), is("ichiro@example.com"));
  }
}
