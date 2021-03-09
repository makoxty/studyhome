package com.example.demo.study2;

public class MockitoTarget {

	private String depender;

	public String appendStr(String... strs) {
		StringBuilder sb = new StringBuilder();
		for(String str : strs) {
			sb.append(str);
		}
		return sb.toString();
	}

	public String get() {
		String str = null;
		return appendStr(str);
	}

	public String getoo() {
		return "aaa";
	}

	public String getDepender() {
		return this.depender;
	}

}
