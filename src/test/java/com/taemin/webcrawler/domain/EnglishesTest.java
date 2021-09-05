package com.taemin.webcrawler.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EnglishesTest {

	@Test
	void create() {
		Englishes englishes = new Englishes("1937jdozA921amdB1zb");
		String actual = "";
		String expected = "AaBbddjmozz";
		for (English english : englishes.getEnglishs()) {
			actual += english.value();
		}

		assertThat(englishes.getEnglishs().size()).isEqualTo(11);
		assertThat(expected).isEqualTo(actual);
	}

	@Test
	void pop() {
		Englishes englishes = new Englishes("1937jdozA921amdB1zb");
		assertThat(englishes.getEnglishs().size()).isEqualTo(11);
		assertThat(englishes.pop().value()).isEqualTo("A");
		assertThat(englishes.getEnglishs().size()).isEqualTo(10);
	}

}
