package com.handson.streams;

import java.util.Arrays;
import java.util.List;

public class LabEx2 
{
	public static void main(String[] args) 
	{
	    List<String> words = Arrays.asList("hello", "thanks", "alas", "Bang on", "yeah", "ouch", "wow");
	   // words.stream().forEach(e-> System.out.println(e));
		words.stream().forEach(System.out::println);
	}
}
