package com.taemin.webcrawler.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.taemin.webcrawler.util.NumberConverter;

public class Numbers {

	private static final String SPLIT_UNIT = "";

	private List<Number> numbers;

	public Numbers(String text) {
		this.numbers = toList(text);
	}

	private List<Number> toList(String text) {
		String converted = NumberConverter.convert(text.trim());
		return Arrays.stream(converted.split(SPLIT_UNIT))
			.map(Number::new)
			.sorted()
			.collect(Collectors.toList());

	}

	public List<Number> getNumbers() {
		return Collections.unmodifiableList(this.numbers);
	}

	public Number pop() {
		if(!this.numbers.isEmpty()) {
			Number popNumber = this.numbers.get(0);
			this.numbers.remove(0);
			return popNumber;
		}
		return null;
	}

	public boolean isEmpty() {
		return this.numbers.isEmpty();
	}

}
