package com.taemin.webcrawler.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.taemin.webcrawler.domain.CrawlerType;
import com.taemin.webcrawler.domain.Englishes;
import com.taemin.webcrawler.domain.Numbers;
import com.taemin.webcrawler.domain.Result;
import com.taemin.webcrawler.dto.ResultResponse;
import com.taemin.webcrawler.util.WebScraper;

@Service
public class WebCrawlerService {

	public ResultResponse getResult(String url, CrawlerType type, int unit) throws IOException {
		WebScraper webScraper = new WebScraper(url);
		String scrap = "";
		if (type.equals(CrawlerType.TEXT)) {
			scrap = webScraper.scrap();
		} else if (type.equals(CrawlerType.HTML_EXCEPT)) {
			scrap = webScraper.scrapWithoutTag();
		}
		Englishes englishes = new Englishes(scrap);
		Numbers numbers = new Numbers(scrap);
		Result result = new Result(englishes, numbers, unit);
		return ResultResponse.toResultResponse(result);
	}
}
