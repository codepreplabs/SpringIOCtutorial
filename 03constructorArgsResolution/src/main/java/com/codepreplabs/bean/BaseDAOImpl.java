package com.codepreplabs.bean;

public class BaseDAOImpl implements BaseDAO {

	private int years;
	private String answer;

	public BaseDAOImpl() {

	}

	/*
	 * To explicitly name the constructor we can use the annotation
	 * 
	 * @ConstructorProperties({"years", "answer"})
	 */
	public BaseDAOImpl(int years, String answer) {
		super();
		this.setYears(years);
		this.setAnswer(answer);
	}

	public void save() {

		System.out.println("The value of years is: " + years
				+ " and the answer is " + answer);
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
