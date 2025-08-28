package com.Preparation;

public class StringBufferExample {

	// without changing memory we need to convert the STRING. & CONVERT TO STRING post operation
	public static void main(String[] args) {

		String s = "abc";
		String s1 = s+"def";
		System.out.println(s+s1);  //   -----  ??
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb); // empty
		System.out.println("capacity: "+sb.capacity());	// cap: 16
		
		StringBuffer sb1 = new StringBuffer(3);
		System.out.println("sb1 capacity: "+sb1.capacity());	//cap: 3
		
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb2 capacity: "+sb2.capacity());	// cap: 3+16
		
		String fileText = "ETF_JPM_NAV.csv";
		String[] strArray = fileText.split("_");
		String name = strArray[0];
		
		String fullFileNameSplit = makeFileName(name);
		System.out.println("SBFilenameSplit: "+fullFileNameSplit);
//		
//		
//		String fullFileName = makeFileName(fileName);
//		System.out.println("SBFileName: "+ fullFileName);
//		
//		String fileFormat = getFileExtension(strArray);
//		System.out.println("fileFormat: "+fileFormat);
		
		StringBuilder sb4 = new StringBuilder("22334455667");
		System.out.println("sb4 = "+sb4);
		sb4.insert(2,'-');
		System.out.println("sb char=" + sb4);
		sb4.insert(5, '=');
		System.out.println("sb char=" + sb4);
		
		StringBuffer sb5 = new StringBuffer("aabb ccdd eeff");
		System.out.println("sb5="+sb5);
		sb5.setCharAt(3, '-');
		System.out.println("sb5="+sb5);
		
		
		StringBuffer sb6 = new StringBuffer("java training day 25");
		System.out.println("sb6="+sb6);
		StringBuffer sbval = sb6.delete(0, 5);
		System.out.println("sbval="+sbval);
		
		System.out.println("String Buffer reverse operation");
		StringBuffer sb7 = new StringBuffer("abc");
		System.out.println("sb7= "+sb7);
		sb7.reverse();
		System.out.println("after reverse: "+sb7);
		
	}
	
	static String getFileExtension(String[] arr){
		return arr[1];
	}
	
	//add "US" to end of the file name with ".txt" format 
	static String makeFileName(String name) {
		StringBuilder sb = new StringBuilder(name);
		sb.append("_US")	// correct / no? _US or _ , US ????
			.append(".")
			.append("txt");
		return sb.toString();	//convert to string and return
	}

	
	
		
}
