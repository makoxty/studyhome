package com.example.demo.study2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

class MockitoTargetTest extends MockitoTarget {

	@Spy
	private MockitoTarget mockitoTarget;

	@BeforeEach
	void setUp() throws Exception {
		 MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void appendStrTest() {
		StringBuilder sb = new StringBuilder();


		// 期待値
		String[] actual = new String[]{"東京都", "男性","未婚"};

		assertThat(actual, arrayContaining("東京都", "男性","未婚"));
	}

	@Test
	void getTest() {

		//実行
		doReturn("bbb").when(mockitoTarget).appendStr(any());
		String expected = mockitoTarget.get();

		// 期待値
		String actual = "bbb";

		verify(mockitoTarget).appendStr(any());

		assertThat(expected, is(actual));

	}

	@Test
	void getooTest() {

		when(mockitoTarget.getoo()).thenReturn("bbb");

		String actual = mockitoTarget.getoo();

		// 期待値
		String expected = "bbb";

		assertThat(expected, is(actual));
	}

	@Test
	void getDependerTest() throws Exception {

		MockitoTarget mt = new MockitoTarget();
		Field field = mt.getClass().getDeclaredField("depender");
		field.setAccessible(true);
        String depender = "aaa";

        // private変数に値を設定
        field.set(mt, depender);

        // 期待値
        String expected = "aaa";

        String actual = mt.getDepender();

        assertThat(expected, is(actual));
	}

}
