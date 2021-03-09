package com.example.demo.study3;


public class Study {

	private int reply;

	public int get(int req, StreamObserver<SampleEntity> responseObserver) {

		OrdersRepository ordersRepository = new OrdersRepository();
		SampleRepository sampleRepository = new SampleRepository();

		int entity1 = ordersRepository.findById(req);
		int entity2 = sampleRepository.findById(entity1);

		if (entity1 == 0 || entity2 == 0) {
			throw new NullPointerException("引数の値が不正です");
		} else {
		reply = entity1;
		}

		responseObserver.onNext(reply);
        responseObserver.onCompleted();

        return reply;
	}

	public int submethod() {
		int num1 = 5;
		int num2 = 5;

		int result = calc(num1, num2);

		return result;
	}

	public int submethod2(int num_1, int num_2) {
		int num1 = num_1;
		int num2 = num_2;

		int result = calc(num1, num2);

		return result;
	}

	public int calc(int num1, int num2) {
		return num1 + num2;
	}

	public String strJoin(String str_1, String str_2, String str_3, String str_4, String str_5, String str_6) {

		String str1 = strJoin1(str_1, str_2);
		String str2 = strJoin2(str_3, str_4);
		String str3 = strJoin3(str_5, str_6);

		return str1 + str2 + str3;
	}

	public String strJoin1(String str1, String str2) {
		return str1 + str2;
	}

	public String strJoin2(String str3, String str4) {
		return str3 + str4;
	}

	public String strJoin3(String str5, String str6) {
		return str5 + str6;
	}

}
