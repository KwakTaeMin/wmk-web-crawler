package com.taemin.webcrawler.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

@Component
public class WebScraper {

	private static final int TIME_OUT = 50000;

	private Document document;

	public WebScraper(String url) throws IOException {
		this.document = Jsoup.connect(url).timeout(TIME_OUT).get();
	}

	public String scrap() {
		return document.html();
	}

	public String scrapWithoutTag() {
		return document.text();
	}
}
