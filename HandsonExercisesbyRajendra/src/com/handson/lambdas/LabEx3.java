package com.handson.lambdas;

@FunctionalInterface
interface TwoElementPredicate<T>
{
	Boolean strFunc(T sValue1,T sValue2);
}
@FunctionalInterface
interface CarPredicate<T>
{
	Boolean carPrice(T price1,T price2);	
}
@FunctionalInterface
interface EmployeePredicate<T>
{
	Boolean empSalary(T salary1,T salary2);
}

public class LabEx3 
{
	
	
	
}
