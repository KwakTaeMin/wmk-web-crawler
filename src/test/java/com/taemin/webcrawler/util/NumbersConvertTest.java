package com.taemin.webcrawler.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumbersConvertTest {

	@Test
	void convert() {
		String expect = NumberConverter.convert("123409!@#%%5ab1232412sofowej");
		assertThat(expect).isEqualTo("12340951232412");
	}
}
