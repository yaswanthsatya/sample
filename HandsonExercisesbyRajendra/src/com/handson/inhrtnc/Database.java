package com.handson.inhrtnc;

final class Oracle
{
	String name;
	String password;
	String url;
	public Oracle(String name, String password, String url) 
	{
		this.name=name;
		this.password=password;
		this.url=url;
	}
	@Override
	public String toString() 
	{
		return "Name: "+this.name+" Password: "+this.password+" URL: "+this.url;
	}
}
final class SQLServer
{
	String name;
	String password;
	String url;
	public SQLServer(String name, String password, String url) 
	{
		this.name=name;
		this.password=password;
		this.url=url;
	}
	@Override
	public String toString() 
	{
		return "Name: "+this.name+" Password: "+this.password+" URL: "+this.url;
	}
}
final class Mysql
{
	String name;
	String password;
	String url;
	public Mysql(String name, String password, String url)
	{
		this.name=name;
		this.password=password;
		this.url=url;
	}
	@Override
	public String toString() 
	{
		return "Name: "+this.name+" Password: "+this.password+" URL: "+this.url;
	}

}
public class Database
{

	public static void main(String[] args) 
	{
		Object arr[]=new Object[10];
		try
		{
		arr[0]=new Oracle("AAA","pswd:aaa1!","https://www.tutorialspoint.com");
		arr[1]=new Oracle("BBB", "pswd:aaa1!", "https://www.git.com");
		arr[2]=new Oracle("CCC","pswd:aaa1!","https://www.javatpoint.com");
		arr[3]=new SQLServer("DDD","pswd:aw56!","https://www.javabrains.io");
		arr[4]=new SQLServer("EEE","pswd:gua6!","https://www.hotmail.com");
		arr[5]=new SQLServer("FFF","pswd:aw56!","https://www.outlook.com");
		arr[6]=new Mysql("GGG","pswd:kujk!","https://www.teams.com");
		arr[7]=new Mysql("HHH","pswd:aaa1!","https://www.onedrive.com");
		arr[8]=new Mysql("III","pswd:aaa1!","https://www.email.com");
		arr[9]=new Mysql("JJJ","pswd:aaa1!","https://www.gmail.com");
		
		arr[10]= new Oracle("ABC","pswd:gueaw56!","https://www.outlook.com");
		for(Object obj:arr)
			System.out.println(obj.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("it is mentioned in the question not to create more than 10 objects");
		}


	}
}
