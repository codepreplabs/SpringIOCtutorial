package com.codepreplabs.bean;

public class OuterBean {

	private InnerBean innerBean;

	public OuterBean() {

	}

	public OuterBean(InnerBean innerBean) {
		super();
		this.innerBean = innerBean;
	}

	public InnerBean getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(InnerBean innerBean) {
		this.innerBean = innerBean;
	}

}
