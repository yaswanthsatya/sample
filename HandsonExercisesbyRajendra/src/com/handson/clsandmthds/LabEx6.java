package com.handson.clsandmthds;

import java.util.*;
public class LabEx6 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String stringArray[] = {"yash ", "eswar", " ram", " David", " Rajendra", " raja", " vinit", " Maria"," Ganesh"," akhil"};
	      StringBuffer sb = new StringBuffer();
	   for(int i = 0; i < stringArray.length; i++) {
	         sb.append(stringArray[i]);
	      }
	      String str = sb.toString();
	      System.out.println(str);
	   }
	}

