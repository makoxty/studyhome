package com.example.demo.study6;

interface InterfaceTest {
	public String method(String name);
}

public class RamdaSample {

	public static void main(String[] args) {
		InterfaceTest h = name -> {
			return "Hello" + name;
		};
		System.out.println(h.method("World!"));

	}
}
