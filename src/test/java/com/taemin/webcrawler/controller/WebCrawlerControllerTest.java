package com.taemin.webcrawler.controller;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class WebCrawlerControllerTest {

	@LocalServerPort
	int port;

	@BeforeEach
	void setUp() {
		RestAssured.port = port;
	}

	@Test
	void outputCrawlingTest() {
		ExtractableResponse<Response> output = outputRequest();
		assertThat(output.statusCode()).isEqualTo(HttpStatus.OK.value());
	}

	ExtractableResponse<Response> outputRequest() {
		return RestAssured
			.given().log().all()
			.when().get("/crawling?url=naver.com&type=TEXT&unit=10")
			.then().log().all()
			.extract();
	}
}
