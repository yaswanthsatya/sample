package com.handson.clsandmthds;

public class Calculator {
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    double diff(double num1, double num2)
    {
        return num2-num1;
    }
    double  mul(int num1, double num2)
    {
        return num1*num2;
    }
    double div(double num1, int num2)
    {
        return num1/num2;
    }
    public static void main(String[] args) 
    {    
    	Calculator obj = new Calculator();
    	
    	int add = obj.add(10, 20);
    	double dif = obj.diff(10, 20);
    	double mul = obj.mul(1, 4) ;
    	double div = obj.div(12, 4);
    	
        System.out.println("Sum :"+add);
        
        System.out.println("diff:"+dif);
  
        System.out.println("mul :"+mul);
        
        System.out.println("Div: "+div);
    }
}
