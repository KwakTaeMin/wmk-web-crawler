package com.taemin.webcrawler.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberConverter {

	private static final String reg = "[0-9]";
	private static final Pattern numberPattern = Pattern.compile(reg);

	public static String convert(String text) {
		String result = "";
		Matcher matcher = numberPattern.matcher(text);
		while(matcher.find()) {
			result += matcher.group();
		}
		return result;
	}
}
