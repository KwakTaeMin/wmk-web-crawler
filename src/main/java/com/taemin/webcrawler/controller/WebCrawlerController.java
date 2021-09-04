package com.taemin.webcrawler.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taemin.webcrawler.domain.CrawlerType;
import com.taemin.webcrawler.dto.OutputResponse;

@RestController
@RequestMapping("/crawling")
public class WebCrawlerController {

	@GetMapping()
	public ResponseEntity<OutputResponse> outputCrawling(@RequestParam(name = "url") String url,
		@RequestParam(name = "type") CrawlerType type, @RequestParam(name = "unit") int unit) {
		List<String> share = new ArrayList<>();
		String rest = "";
		OutputResponse outputResponse = new OutputResponse(share, rest);
		return ResponseEntity.ok().body(outputResponse);
	}
}
