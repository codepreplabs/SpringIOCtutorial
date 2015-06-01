package com.codepreplabs.bean;

import com.codepreplabs.to.BaseTO;

public class BaseDAOImpl {

	BaseTO baseTO;

	public BaseDAOImpl() {

	}

	public BaseDAOImpl(BaseTO baseTO) {
		super();
		this.baseTO = baseTO;
	}

	public void save() {
		System.out.println("Performing save operation!");
		System.out.println(baseTO.getMessage());
	}

	public BaseTO getBaseTO() {
		return baseTO;
	}

	public void setBaseTO(BaseTO baseTO) {
		this.baseTO = baseTO;
	}

}
