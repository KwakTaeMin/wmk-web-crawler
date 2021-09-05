package com.taemin.webcrawler.dto;

import java.util.List;

import com.taemin.webcrawler.domain.Result;

public class ResultResponse {

	private List<String> share;
	private String rest;

	public ResultResponse(List<String> share, String rest) {
		this.share = share;
		this.rest = rest;
	}

	public List<String> getShare() {
		return share;
	}

	public String getRest() {
		return rest;
	}

	public static ResultResponse toResultResponse(Result result) {
		return new ResultResponse(result.getShare(), result.getRest());
	}
}
