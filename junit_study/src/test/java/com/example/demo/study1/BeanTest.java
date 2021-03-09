package com.example.demo.study1;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.demo.study1.Bean;


class BeanTest extends Bean {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Bean bean = new Bean();
		bean.setNum1(1);
		bean.setNum2(2);

		// 期待値
		int expected = 3;

		int actual = bean.getNum1() + bean.getNum2();

		assertThat(expected, is(actual));

	}

	@Test
	void test2() {

		Bean bean = Mockito.mock(Bean.class);

		when(bean.getNum1()).thenReturn(1);

		int num1 = bean.getNum1();

		assertThat(num1, is(1));
	}

	@Test
	void test3() {
		Bean bean = Mockito.spy(Bean.class);

		doReturn(5).when(bean).tasizan(anyInt(), anyInt());

		int num1 = bean.keisan();

		assertThat(num1, is(5));
	}
}
