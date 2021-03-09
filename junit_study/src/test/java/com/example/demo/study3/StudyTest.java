package com.example.demo.study3;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

class StudyTest {

	@Mock
	private OrdersRepository ordersRepository;

	@Mock
	private SampleRepository sampleRepository;

	@Mock
	private StreamObserver responseObserver;

	@Spy
	private Study study;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("正常系")
	@Test
	void StudyTest001() {

//		Study study = new Study();
//		StreamObserver responseObserver = new StreamObserver();
//
//		when(ordersRepository.findById(anyInt())).thenReturn(5);
//		when(sampleRepository.findById(anyInt())).thenReturn(6);
//
//		int expeted = study.get(anyInt(), responseObserver);
//
//		assertThat(expeted, is(5));
	}

	@DisplayName("異常系")
	@Test
	void StudyTest002() {
		Study study = new Study();
		StreamObserver responseObserver = new StreamObserver();

		try {
			when(ordersRepository.findById(anyInt())).thenReturn(0);
			when(sampleRepository.findById(anyInt())).thenReturn(6);
			int result = study.get(anyInt(), responseObserver);
			fail();
		} catch (NullPointerException expeted) {
			assertThat(expeted.getMessage(), equalTo("引数の値が不正です"));
		}
	}

	@DisplayName("異常系")
	@Test
	void StudyTest003() {
		Study study = new Study();
		StreamObserver responseObserver = new StreamObserver();

		try {
			when(ordersRepository.findById(anyInt())).thenReturn(6);
			when(sampleRepository.findById(anyInt())).thenReturn(0);
			int result = study.get(anyInt(), responseObserver);
			fail();
		} catch (NullPointerException expeted) {
			assertThat(expeted.getMessage(), equalTo("引数の値が不正です"));
		}
	}

	@Test
	void submethod1Test() {

		Study study = new Study();

		// 実行
		int expeted = study.submethod();

		// 期待値
		int actual = 10;

		assertThat(actual, is(expeted));
	}

	@Test
	void submethod2Test() {

		Study study = new Study();

		// 期待値
		int expeted = 3;

		// 実行
		int actual = study.submethod2(1, 2);

		assertThat(actual, is(expeted));

	}

	@Test
	void calcTest() {

		Study study = new Study();

		// 期待値
		int expeted = 10;

		// 実行
		int actual = study.calc(5, 5);

		assertThat(actual, is(expeted));
	}

	@Test
	void submethod2MockVerTest() {

		doReturn(10).when(study).calc(anyInt(), anyInt());

		// 期待値
		int expected = 10;

		// 実行
		int actual = study.submethod2(anyInt(), anyInt());

		assertThat(actual, is(expected));
	}

	@Test
	void strJoinTest() {

		String expected1 = "aaabbb";
		String expected2 = "cccddd";
		String expected3 = "eeefff";

		doReturn(expected1).when(study).strJoin1(anyString(), anyString());
		doReturn(expected2).when(study).strJoin2(anyString(), anyString());
		doReturn(expected3).when(study).strJoin3(anyString(), anyString());

		// 期待値

		String expected4 = expected1 + expected2 + expected3;

		// 実行
		String actual4 = study.strJoin(anyString(), anyString(), anyString(), anyString(), anyString(), anyString());

		// 実行
		assertThat(expected4, is(actual4));
	}
}
