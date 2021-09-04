package com.taemin.webcrawler.dto;

import java.util.List;

public class OutputResponse {

	private List<String> share;
	private String rest;

	public OutputResponse(List<String> share, String rest) {
		this.share = share;
		this.rest = rest;
	}

	public List<String> getShare() {
		return share;
	}

	public String getRest() {
		return rest;
	}
}
