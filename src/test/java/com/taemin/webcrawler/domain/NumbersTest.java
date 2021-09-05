package com.taemin.webcrawler.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumbersTest {

	@Test
	void create() {
		Numbers numbers = new Numbers("1234skjd0085ha");
		assertThat(numbers.getNumbers().size()).isEqualTo(8);
		String actual = "";
		String expected = "00123458";
		for (Number number : numbers.getNumbers()) {
			actual += String.valueOf(number.value());
		}
		assertThat(expected).isEqualTo(actual);
	}

	@Test
	void pop() {
		Numbers numbers = new Numbers("1234skjd0085ha");
		assertThat(numbers.pop().value()).isEqualTo(0);
		assertThat(numbers.getNumbers().size()).isEqualTo(7);
	}
}
