package com.durgasoft.core;

class ThreadScope extends ThreadLocal<String> {

	@Override
	protected String initialValue() {
		return "No Data Available ";
	}
}
class A {
	public void m1() {
		System.out.println("m1(): ThreadScope "+Thread1.threadscope.get());
		System.out.println("m1(): ThreadScope "+Thread2.threadscope.get());
	}
	public void m2() {
		System.out.println("m2(): ThreadScope "+Thread2.threadscope.get());
		
		System.out.println("m2(): ThreadScope "+Thread1.threadscope.get());
	}
}
class Thread1 extends Thread {
	
	static ThreadScope threadscope=new ThreadScope();
	
	A a;
	Thread1(A a)
	{
		this.a=a;
	}
	@Override
	public void run() {
		
		threadscope.set("AAA");
		a.m1();
	}

}

class Thread2 extends Thread{
	
	static ThreadScope threadscope=new ThreadScope();
	A a;
	Thread2(A a)
	{
		this.a=a;
	}
	
	@Override
	public void run() {
		
		threadscope.set("BBB");
		a.m2();
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		t1.start();
		t2.start();
		
		//a.m1();
		//a.m2();

	}
}
