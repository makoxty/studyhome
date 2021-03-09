package com.example.demo.study4;

public class SpyPattern {

	public int getEntity(int reqId) {

		SampleEntityRepository repositoy = new SampleEntityRepository();

		SampleEntity entity  = repositoy.serch(reqId);

			try {
				if(entity.getId() == 0 && entity.getName().equals("bbb")) {
				throw new Exception();
			}
				}catch (Exception e) {
				e.printStackTrace();
			}
			return entity.getId();
	}
}