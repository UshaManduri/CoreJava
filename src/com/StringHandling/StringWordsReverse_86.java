package com.StringHandling;

public class StringWordsReverse_86 {
	public static String reverseStringWords(String s) {
		String[] stringWords = s.split(" ");
		String resultString = "";
		for (int i = stringWords.length - 1; i>=0; i--) {
			resultString += stringWords[i] +" ";
		}
		return resultString;
	}
}
