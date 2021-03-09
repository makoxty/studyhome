package com.example.demo.study4;

import org.springframework.beans.factory.annotation.Autowired;

public class SampleEntityRepository {

	@Autowired
	SampleEntity entity;

	public SampleEntity serch(int _id) {

		SampleEntity result = get(_id);

	return result;

	}

	public SampleEntity get(int _id) {

		entity.setId(_id);
		entity.setName("aaa");

		return entity;

	}

}
