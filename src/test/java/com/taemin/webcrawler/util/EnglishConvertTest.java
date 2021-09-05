package com.taemin.webcrawler.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EnglishConvertTest {

	@Test
	void convert() {
		String expect = EnglishConverter.convert("123409!@#%%5ab1232412sofowej");
		assertThat(expect).isEqualTo("absofowej");
	}
}
