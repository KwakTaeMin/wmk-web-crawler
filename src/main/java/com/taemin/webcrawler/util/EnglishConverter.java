package com.taemin.webcrawler.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishConverter {

	private static final String reg = "[a-zA-Z]";
	private static final Pattern englishPattern = Pattern.compile(reg);

	public static String convert(String text) {
		String result = "";
		Matcher matcher = englishPattern.matcher(text);
		while(matcher.find()) {
			result += matcher.group();
		}
		return result;
	}
}
