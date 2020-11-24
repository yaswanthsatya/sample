package com.handson.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LabEx3 
{
	public static void main(String[] args)
	{
	    List<String> words = Arrays.asList("hello", "thanks", "alas", "Bang on", "yeah", "ouch", "wow","hi");
		System.out.println(words.stream().map(e->e+"!").collect(Collectors.toList()));
        System.out.println(words.stream().map(e->e.replace("i", "eye")).collect(Collectors.toList()));
        System.out.println(words.stream().map(String::toUpperCase).collect(Collectors.toList()));
	}
}
