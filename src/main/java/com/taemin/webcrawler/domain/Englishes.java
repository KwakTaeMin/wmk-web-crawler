package com.taemin.webcrawler.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.taemin.webcrawler.util.EnglishConverter;

public class Englishes {

	private static final String SPLIT_UNIT = "";

	private List<English> englishs;

	public Englishes(String text) {
		this.englishs = toList(text);
	}

	private List<English> toList(String text) {
		String converted = EnglishConverter.convert(text.trim());
		return Arrays.stream(converted.split(SPLIT_UNIT))
			.sorted(String.CASE_INSENSITIVE_ORDER)
			.map(English::new)
			.collect(Collectors.toList());
	}

	public List<English> getEnglishs() {
		return Collections.unmodifiableList(this.englishs);
	}

	public English pop() {
		if(!this.englishs.isEmpty()) {
			English popEnglish = this.englishs.get(0);
			this.englishs.remove(0);
			return popEnglish;
		}
		return null;
	}

	public boolean isEmpty() {
		return this.englishs.isEmpty();
	}
}
