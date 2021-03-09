package com.example.demo.study4;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

class SpyPatternTest extends SpyPattern {

	@Mock
	private SampleEntityRepository repositoy;

	@Mock
	private SampleEntity entity;

	@Spy
	private SpyPattern spyPattern;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getEntityTest() {

		// 何を返していいかわからない
		when(repositoy.serch(anyInt())).thenReturn(entity);
	}

}
