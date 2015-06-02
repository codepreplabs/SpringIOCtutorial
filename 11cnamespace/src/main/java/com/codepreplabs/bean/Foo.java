package com.codepreplabs.bean;

public class Foo {

	private Baz baz;
	private Bar bar;
	private String email;

	public Foo() {
		// TODO Auto-generated constructor stub
	}

	public Foo(Baz baz, Bar bar, String email) {
		super();
		this.baz = baz;
		this.bar = bar;
		this.email = email;
	}

	public Baz getBaz() {
		return baz;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
