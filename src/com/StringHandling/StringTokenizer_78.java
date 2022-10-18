package com.StringHandling;

import java.util.StringTokenizer;

public class StringTokenizer_78 {
	public static void main(String[] args) {
		StringTokenizer st =
					//		new StringTokenizer("Hari Narit");
							new StringTokenizer("Hri narit", "a");
				//			new StringTokenizer("Hr Narit", "a", true);
							
		System.out.println("Num of tokens: " +st.countTokens());
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
