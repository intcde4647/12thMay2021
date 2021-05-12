package com.cts.demo.withGenerics;

public class Main {

	public static void main(String[] args) {
		MyNumber<Integer> obj1=new MyNumber<>(1);
		System.out.println(obj1.getObj());
		MyNumber<Float> obj2=new MyNumber<>(1.2f);
        System.out.println(obj2.getObj());
        MyNumber<String> obj3=new MyNumber<>("CTS");
        System.out.println(obj3.getObj());
	}

}
