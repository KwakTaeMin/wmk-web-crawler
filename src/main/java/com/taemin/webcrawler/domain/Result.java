package com.taemin.webcrawler.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Result {

	private Englishes englishes;
	private Numbers numbers;
	private int div;
	private List<String> share;
	private String rest;

	public Result(Englishes englishes, Numbers numbers, int div) {
		this.share = new ArrayList<>();
		this.englishes = englishes;
		this.numbers = numbers;
		this.div = div;
		setShareAndRest();
	}

	public List<String> getShare() {
		return this.share;
	}

	public String getRest() {
		return this.rest;
	}

	private void setShareAndRest() {
		String fullString = makeFullString();
		int currentIndex = 0;
		for (int index = 0; index + div < fullString.length(); index = index + div) {
			this.share.add(fullString.substring(index, index + div));
			currentIndex = index;
		}
		this.rest = fullString.substring(currentIndex + div, fullString.length());
	}

	private String makeFullString() {
		String fullString = "";
		while (!this.englishes.isEmpty() || !this.numbers.isEmpty()) {
			fullString += makeString();
		}
		return fullString;
	}

	private String makeString() {
		String string = "";
		English english = getEnglish();
		Number number = getNumber();
		if (Objects.nonNull(english)) {
			string += english.value();
		}
		if (Objects.nonNull(number)) {
			string += number.value();
		}
		return string;
	}

	private English getEnglish() {
		return this.englishes.pop();
	}

	private Number getNumber() {
		return this.numbers.pop();
	}

}
