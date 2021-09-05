package com.taemin.webcrawler.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberTest {

	@Test
	void create() {
		Number number = new Number("1");
		assertThat(number.value());
	}

	@Test
	void createRangeError() {
		assertThatThrownBy(() -> {
			new Number("10");
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void createStringError() {
		assertThatThrownBy(() -> {
			new Number("a");
		}).isInstanceOf(IllegalArgumentException.class);
	}
}
