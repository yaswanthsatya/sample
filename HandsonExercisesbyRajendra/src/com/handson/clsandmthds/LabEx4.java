package com.handson.clsandmthds;

import java.util.*;
public class LabEx4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		int n=sc.nextInt();
		System.out.println("Enter Number of Columns:");
		int m=sc.nextInt();
		int i,j;
		int mat1[][]=new int[n][m];
		int mat2[][]=new int[n][m];
		int res[][]=new int[n][m];
		System.out.print("Enter the elements of  first matrix");
		for(i=0; i<n; i++)
	       {
	           for(j=0; j<m; j++)
	           {
	               mat1[i][j] = sc.nextInt();
	           }
	       }
		   
	       System.out.print("Enter Matrix 2 Elements : ");
	       for(i=0; i<n; i++)
	       {
	           for(j=0; j<m; j++)
	           {
	               mat2[i][j] = sc.nextInt();
	           }
	       }
	       for(i=0; i<n; i++)
	       {
	           for(j=0; j<m; j++)
	           {
	               res[i][j] = mat1[i][j] + mat2[i][j];
	           }
	       }
		   System.out.print("The Resultant Matrix will be :\n");
	       for(i=0; i<n; i++)
	       {
	           for(j=0; j<m; j++)
	           {
	               System.out.print(res[i][j]+ " ");
	           }
	           System.out.println();
	       }
	   }
	}
