package com.handson.clsandmthds;

public class AppUser 
{
	String name, pas;
	String url="https://userprompt.java.com";
	String fname="User Prompt";
	//Scanner in=new Scanner(System.in);
	//System.out.println("enter the databse detail and file name: ");
	//url=in.next();
	//	fname=in.next();
	{
		System.out.println("this databse url is: \n"+url+" and file name is: " + fname);
	}
	
	AppUser(String name, String pas) {
		// TODO Auto-generated method stub
		this.name=name;
		this.pas=pas;
	
	}
	void output() {
		System.out.println("Username is : "+name+" and password: "+pas);
	}
}
