package com.example.demo.study5;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class FooBusinessLogicTest extends FooBusinessLogic {

	@Spy
	FooBusinessLogic fooBusinessLogic;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("true版")
	@Test
	void executeTest() {

		doReturn(true).when(fooBusinessLogic).isAnyCondition();

		// 期待値
		boolean expected = true;

		// 実行
		boolean actual = fooBusinessLogic.isAnyCondition();

		// doSomethingが呼ばれても何もしない
		doNothing().when(fooBusinessLogic).doSomething();

		// 比較
		assertThat(actual, is(expected));
	}

	@DisplayName("false版")
	@Test
	void executeTest2() {

		doReturn(false).when(fooBusinessLogic).isAnyCondition();

		// 期待値
		boolean expected = false;

		// 実行
		boolean actual = fooBusinessLogic.isAnyCondition();

		// doSomethingが呼ばれても何もしない
		doNothing().when(fooBusinessLogic).doOtherthing();

		// 比較
		assertThat(actual, is(expected));
	}

}
