package com.taemin.webcrawler.util;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WebScraperTest {

	@Autowired
	WebScraper webScraper;

	@BeforeEach
	void setUp() throws IOException {
		webScraper = new WebScraper("https://www.naver.com/");
	}

	@Test
	void scrap() {
		String scrapText = webScraper.scrap();
		assertThat(scrapText).isNotNull();
		System.out.println(scrapText);
	}

	@Test
	void scrapWithoutTag() {
		String scrapText = webScraper.scrapWithoutTag();
		assertThat(scrapText).isNotNull();
		System.out.println(scrapText);
	}
}
