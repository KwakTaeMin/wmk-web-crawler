package com.taemin.webcrawler.domain;

public class Number implements Comparable {

	private static final int MIN_NUMBER = 0;
	private static final int MAX_NUMBER = 9;

	private int number;

	public Number(String number) {
		int parseNumber = Integer.parseInt(number);
		validate(parseNumber);
		this.number = parseNumber;
	}

	public int value() {
		return this.number;
	}

	private void validate(int number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException("Number는 0보다 크고 9보다 작아야합니다.");
		}
	}

	@Override
	public int compareTo(Object other) {
		if(other instanceof Number) {
			Number otherNumber = (Number)other;
			return this.number - otherNumber.number;
		}
		throw new IllegalArgumentException("Number는 숫자가 아닙니다.");
	}

}
