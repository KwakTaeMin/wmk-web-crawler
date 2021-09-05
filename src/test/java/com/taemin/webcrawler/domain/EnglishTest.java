package com.taemin.webcrawler.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EnglishTest {

	@Test
	void create() {
		English english = new English("a");
		assertThat(english.value()).isEqualTo("a");
	}

	@Test
	void createLengthError() {
		assertThatThrownBy(() -> {
			new English("abc");
		}).isInstanceOf(IllegalArgumentException.class);
	}

}
