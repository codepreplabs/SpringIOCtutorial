package com.codepreplabs.bean;

public abstract class Singleton {

	public abstract Prototype getPrototype();

	public void doSomething() {

		getPrototype().foo();
	}

	public void doSomethingelse() {
		getPrototype().bar();
	}

}
