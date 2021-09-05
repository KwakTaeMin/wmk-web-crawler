package com.taemin.webcrawler.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.taemin.webcrawler.domain.CrawlerType;
import com.taemin.webcrawler.dto.ResultResponse;
import com.taemin.webcrawler.service.WebCrawlerService;

@Controller
public class WebCrawlerController {

	@Autowired
	WebCrawlerService webCrawlerService;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/crawling")
	public ResponseEntity<ResultResponse> outputCrawling(@RequestParam(name = "url") String url,
		@RequestParam(name = "type") CrawlerType type, @RequestParam(name = "unit") int unit) throws IOException {
		ResultResponse resultResponse = webCrawlerService.getResult(url, type, unit);
		return ResponseEntity.ok().body(resultResponse);
	}
}
