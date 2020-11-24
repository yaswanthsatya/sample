 package com.handson.clsandmthds;

import java.io.*;
class Student1
{
	String name;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	Marks m=new Marks();
	Student1(String name,int id,int eng,int math,int sci)
	{
		setName(name);
		m.setRegNo(id);
		m.setMarksInEng(eng);
		m.setMarksInMaths(math);
		m.setMarksInScience(sci);
	}
} // end of student class
class Marks
{
	int regNo;
	int MarksInEng;
	int MarksInMaths;
	int MarksInScience;
	public int getRegNo() 
	{
		return regNo;
	}
	public void setRegNo(int regNo) 
	{
		this.regNo = regNo;
	}
	public int getMarksInEng() 
	{
		return MarksInEng;
	}
	public void setMarksInEng(int marksInEng) 
	{
		MarksInEng = marksInEng;
	}
	public int getMarksInMaths()
	{
		return MarksInMaths;
	}
	public void setMarksInMaths(int marksInMaths)
	{
		MarksInMaths = marksInMaths;
	}
	public int getMarksInScience() 
	{
		return MarksInScience;
	}
	public void setMarksInScience(int marksInScience)
	{
		MarksInScience = marksInScience;
	}
}
public class LabEx1
{
    public Student1[] ascReg(Student1 stu[])
	{
		for(int i=0;i<stu.length-1;i++)
		{
			for(int j=i+1;j<stu.length;j++)
			{
				if(stu[i].m.getRegNo()>stu[j].m.getRegNo())
				{
					Student1 t=stu[i];
					stu[i]=stu[j];
					stu[j]=t;
				}
			}
		}
		for(int i=0;i<stu.length;i++)
		{
			System.out.println("Student regNo: "+stu[i].m.getRegNo()+" Name: "+stu[i].getName());
		}
		return stu;
	}
    public void highPercent(Student1 stu[]) {
    	int maxpercent=0;
    	String name="";
    	int regNo=0;
    	int percent=0;
    	for(int i=0;i<stu.length;i++) {
    	    percent=(stu[i].m.getMarksInEng()+stu[i].m.getMarksInMaths()+stu[i].m.getMarksInScience())/3;
    		if(percent>maxpercent) {
    			maxpercent=percent;
    			name=stu[i].getName();
    			regNo=stu[i].m.getRegNo();
    		}
    	}
    	System.out.println("Student with highest percentage:\nName: "+name+"  regNo: "+regNo+" Percentage: "+percent);    	
    }
    public void highInMath(Student1 stu[]) {
    	int max=0;
    	String name="";
    	int regNo=0;
    	for(int i=0;i<stu.length;i++) {
    	    if(stu[i].m.getMarksInMaths()>max) {
    			max=stu[i].m.MarksInMaths;
    			name=stu[i].getName();
    			regNo=stu[i].m.getRegNo();
    		}
    	}
    	System.out.println("Student with highest marks in Math:\nName:"+name+" regNo:"+regNo+" Math marks:"+max);
    }
    public void mathSci(Student1 stu[]) {
    	int bmarks[]=new int[5];
    	for(int i=0;i<stu.length;i++)
		{
		   bmarks[i]=stu[i].m.getMarksInMaths()+stu[i].m.getMarksInScience();
		}
    	for(int i=0;i<stu.length-1;i++)
		{
			for(int j=i+1;j<stu.length;j++)
			{
				if(bmarks[i]>bmarks[j])
				{
					Student1 t=stu[i];
					stu[i]=stu[j];
					stu[j]=t;
				}
			}
		}
		for(int i=0;i<stu.length;i++)
		{
			System.out.println("Math&Science: "+(stu[i].m.getMarksInMaths()+stu[i].m.getMarksInScience())+" Student regNo: "+stu[i].m.getRegNo()+" Name: "+stu[i].getName());
		}	
    }
    public void rank(Student1 stu[]) {
    	int percentage[]=new int[5];
    	for(int i=0;i<stu.length;i++)
		{
    		int marks=stu[i].m.getMarksInEng()+stu[i].m.getMarksInMaths()+stu[i].m.getMarksInScience();
    	    percentage[i]=marks/3;
		}
    	for(int i=0;i<stu.length-1;i++)
		{
			for(int j=i+1;j<stu.length;j++)
			{
				if(percentage[i]>percentage[j])
				{
					Student1 t=stu[i];
					stu[i]=stu[j];
					stu[j]=t;
				}
			}
		}
    	for(int i=0,j=5;i<stu.length;i++,j--)
		{
    		int marks=stu[i].m.getMarksInEng()+stu[i].m.getMarksInMaths()+stu[i].m.getMarksInScience();
    	    System.out.println("regNo:"+stu[i].m.getRegNo()+" Name:"+stu[i].getName()+" Total marks:"+marks+" Percentage:"+marks/3+" Rank:"+j);
		}
    }
public static void main(String args[])
{
	Student1 stu[]=new Student1[5];
    stu[0]=new Student1("Pragnya",105,80,90,95);
    stu[1]=new Student1("yash",102,85,98,85);
	 stu[2]=new Student1("john",101,70,82,92);
	 stu[3]=new Student1("Radha",103,86,97,78);
	 stu[4]=new Student1("Ishitha",104,84,88,86);
	
	 LabEx1 obj=new LabEx1();
	 obj.ascReg(stu);
	 obj.highPercent(stu);
	 obj.highInMath(stu);
	 obj.mathSci(stu);
	 obj.rank(stu);
}
}
