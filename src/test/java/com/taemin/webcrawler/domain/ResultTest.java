package com.taemin.webcrawler.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResultTest {

	Englishes englishes;
	Numbers numbers;

	@BeforeEach
	void setUp() {
		englishes = new Englishes("dacb9516BACD");
		numbers = new Numbers("dacb9516BACD");
	}

	@Test
	void create() {
		Result result = new Result(englishes, numbers, 5);
		assertThat(result.getShare().size()).isEqualTo(2);
		for (String s : result.getShare()) {
			assertThat(s.length()).isEqualTo(5);
			System.out.println(s);
		}
		assertThat(result.getRest().length()).isEqualTo(2);
		System.out.println(result.getRest());
	}
}
