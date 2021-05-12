package com.cts.demo.withGenerics;

public class MyNumber<T> {

	private T obj;

	public MyNumber(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
