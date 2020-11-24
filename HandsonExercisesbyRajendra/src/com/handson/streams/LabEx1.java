package com.handson.streams;

import java.util.*;



public class LabEx1 
{
	public static void main(String[] args) 
	{
    List<String> words = Arrays.asList("hello", "thanks", "alas", "Bang on", "yeah", "ouch", "wow");
    words.stream().forEach(e-> System.out.println("  "+e));
	}
}
