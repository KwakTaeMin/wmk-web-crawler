package com.taemin.webcrawler.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taemin.webcrawler.domain.CrawlerType;
import com.taemin.webcrawler.dto.ResultResponse;
import com.taemin.webcrawler.service.WebCrawlerService;

@RestController
@RequestMapping("/crawling")
public class WebCrawlerController {

	@Autowired
	WebCrawlerService webCrawlerService;

	@GetMapping()
	public ResponseEntity<ResultResponse> outputCrawling(@RequestParam(name = "url") String url,
		@RequestParam(name = "type") CrawlerType type, @RequestParam(name = "unit") int unit) throws IOException {
		ResultResponse resultResponse = webCrawlerService.getResult(url, type, unit);
		return ResponseEntity.ok().body(resultResponse);
	}
}
