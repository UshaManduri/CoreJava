package com.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Java8Examples {

	public static void multiply(List<Integer> list1) {
        System.out.println("Multiplication");
         list1.stream().forEach(l -> {
             for(int i = 0 ; i <= 10; i++) {
                  System.out.println(l + " * " + i + " = " +  l * i + " ");
             }
             System.out.println("-----------------------------");
         });
    }
    
    public static void addition(List<Integer> list1) {
        System.out.println("Addition");
        list1.stream().forEach(l -> {
             for(int i = 0 ; i <= 10; i++) {
                  System.out.println(l + " + " + i + " = " +  (l+i) + " ");
             }
             System.out.println("-----------------------------");
        });
    }
    
    public static void subtraction(List<Integer> list1) {
        System.out.println("Subtraction");
        list1.stream().forEach(l -> {
             for(int i = 0 ; i <= 10; i++) {
                  System.out.println(l + " - " + i + " = " + (l-i) + " ");
             }
             System.out.println("-----------------------------");
        });
    }
     
    
    public static void main(String args[]) {
     List<String> list = Arrays.asList("hello", "hi", "hello", "test");
     list.stream().filter(l -> l.length() > 2).distinct().map(String::toUpperCase).forEach(System.out::println);
     
     List<Integer> list1 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 24, 25, 26, 27, 28, 29, 30);
     List<Integer> list2 = list1.stream().map(l -> l*2).collect(Collectors.toList());
     
     Scanner scan = new Scanner(System.in);
     String input = scan.nextLine();
     System.out.println(input);
     
     
    }
}
