package com.handson.inhrtnc;

import java.util.*;

public class Currency
{
	static Map<Integer,Integer>note;
	static Map<Integer,Integer>coin;
	Currency(Map<Integer, Integer> note, Map<Integer, Integer> coin)
	{
		this.note=note;
		this.coin=coin;
	}
	public static Map<Integer, Integer> getCoin()
	{
		return note;
	}
	public static Map<Integer, Integer> getNote()
	{
		return coin;
	}
}

class Dollar extends Currency
{
	int noteValue;
	int coinValue;
	double totalAmount;
	public Dollar(Map<Integer, Integer> note, Map<Integer, Integer> coin)
	{
		super(note,coin);
	}
	public int totalCoin(Map<Integer, Integer> coin)
	{
		for(Integer value:getCoin().keySet())
		{
			noteValue=noteValue+value*(getCoin().get(value));
		}
		return noteValue;
	}
	public int totalNote(Map<Integer, Integer> note)
	{
		for(Integer value:getNote().keySet())
		{
			coinValue=coinValue+value*(getNote().get(value));
		}
		return coinValue;
	}
	public double compute(int totalDollar, int totalcents)
	{
		totalAmount=(totalDollar+(totalcents*0.01))*50;
		return totalAmount;
	}
	public void print()
	{
		System.out.printf("The Amount Donated %.2f\n",totalAmount);
	}


}
class Rupee extends Currency
{
	int noteValue;
	int coinValue;
	double totalAmount;
	public Rupee(Map<Integer, Integer> note, Map<Integer, Integer> coin)
	{
		super(note, coin);
	}
	public int totalCoin(Map<Integer, Integer> coin)
	{
		for(Integer value:getCoin().keySet())
		{
			noteValue=noteValue+value*(getCoin().get(value));
		}
		return noteValue;
	}
	public int totalNote(Map<Integer, Integer> note)
	{
		for(Integer value:getNote().keySet())
		{
			coinValue=coinValue+value*(getNote().get(value));
		}
		return coinValue;
	}
	public double compute(int totalRupee, int totalPaise)
	{
		totalAmount=(totalRupee+(totalPaise*0.01));
		return totalAmount;
	}
	public void print()
	{
		System.out.printf("The Amount Donated %.2f\n",totalAmount);
	}


}
class Pound extends Currency
{
	int noteValue;
	int coinValue;
	double totalAmount;
	public Pound(Map<Integer, Integer> note, Map<Integer, Integer> coin)
	{
		super(note, coin);
	}
	public int totalCoin(Map<Integer, Integer> coin)
	{
		for(Integer value:getCoin().keySet())
		{
			noteValue=noteValue+value*(getCoin().get(value));
		}
		return noteValue;
	}
	public int totalNote(Map<Integer, Integer> note)
	{
		for(Integer value:getNote().keySet())
		{
			coinValue=coinValue+value*(getNote().get(value));
		}
		return coinValue;
	}
	public double compute(int totalPound, int totalPence)
	{
		totalAmount=(totalPound+(totalPence*0.01))*50;
		return totalAmount;
	}
	public void print()
	{
		System.out.printf("The Amount Donated %.2f\n",totalAmount);
	}
}




