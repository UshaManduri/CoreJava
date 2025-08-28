package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8StreamsExample {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg","","abcd");
		System.out.println("List:"+strings);
		Long count = getCountEmptyStringUsingJava7(strings);
		System.out.println("empty string count: "+count);
		
		int countLen = getCountLenghtJava7(strings);
		System.out.println("count of lenght of 3 strings is "+countLen);
	
		String mergedString = mergeStringwithPipe(strings, " | ");
		System.out.println("merged String: "+mergedString);
	
		System.out.println("************java 8***********");
		
		System.out.println("List: "+strings);
		
		//find out how many strings are empty
		long lng = strings.stream()
				.filter(str -> str.isEmpty())
				.count();
		System.out.println("empty string count 2 in J8: "+lng);
		
		long leng = strings.stream().filter(str -> str.length() ==3).count();
		System.out.println("strings length =3 in J8= "+leng);
		
		String mergedStr = strings.stream().filter(str -> !str.isEmpty())
						.collect(Collectors.joining(" || "));
		System.out.println("merged str in J8: "+mergedStr);
		
		
	}
	
	private static String mergeStringwithPipe(List<String> strings, String separator) {
		StringBuilder sb = new StringBuilder();
		for(String str : strings) {
			if(!str.isEmpty()) {
				sb.append(str);
				sb.append(separator);
			}
		}
		return sb.toString();
	}

	private static int getCountLenghtJava7(List<String> strings) {
		int count = 0;
		for(String str : strings) {
			if(str.length() == 3) {
				count++;
			}
		}
		return 0;
	}

	public static long getCountEmptyStringUsingJava7(List<String> s) {
		
		int count = 0;
		for(String str : s) {
			if(str.isEmpty()) {
				count++;
			}
		}
		return count;
	}

}
