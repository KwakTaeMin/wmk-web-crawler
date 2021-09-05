package com.taemin.webcrawler.domain;

public class English {

	private static final int LENGTH = 1;

	private String english;

	public English(String text) {
		validate(text);
		this.english = text;
	}

	public String value() {
		return this.english;
	}

	private void validate(String text) {
		if (text.length() != LENGTH) {
			throw new IllegalArgumentException("영어의 길이는 1이 아닙니다.");
		}
	}

}
