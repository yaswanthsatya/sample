package com.handson.clctns;

import java.util.*;

public class Sortbyrank implements Comparator<LabEx6>
{
	@Override
	public int compare(LabEx6 a, LabEx6 b) 
	{
		// TODO Auto-generated method stub
		return b.rank - a.rank;
	} 
}
