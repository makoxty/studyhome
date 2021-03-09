package com.example.demo.study1;

public class Bean {

	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int tasizan(int num1, int num2) {
		return num1 + num2;
	}

	public int hikizan(int num1, int num2) {
		return num1 - num2;
	}

	public int kakezan(int num1, int num2) {
		return num1 * num2;
	}

	public int warizan(int num1, int num2) {
		return num1 / num2;
	}

	public int keisan() {
		int result = tasizan(1, 2);
		return result;
	}

}
