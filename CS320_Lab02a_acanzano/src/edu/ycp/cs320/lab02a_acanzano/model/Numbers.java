package edu.ycp.cs320.lab02a_acanzano.model;

public class Numbers {
	private double first, second, third;
	public Numbers() {
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public double getFirst() {
		return first;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public double getSecond() {
		return second;
	}
	
	public void setThird(int third) {
		this.third = third;
	}

	public double getThird() {
		return third;
	}
	
	public double isAdd() {
		return first + second + third;
	}

	public double isMultiply() {
		return first*second;
	}

}
