package material;

import java.util.*;

public class Order 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<Laptop>lapi=new ArrayList<>();
		lapi.add(new Laptop(4));
		lapi.add(new Laptop(8));
		lapi.add(new Laptop(16));
		lapi.add(new Laptop(7));
		lapi.add(new Laptop(12));
		
		List<Accessories>accessList=new ArrayList<>();
		accessList.add(new Accessories(12));
		accessList.add(new Accessories(11));
		accessList.add(new Accessories(10));
		accessList.add(new Accessories(13));
		accessList.add(new Accessories(14));
		accessList.add(new Accessories(15));
		accessList.add(new Accessories(16));
		accessList.add(new Accessories(17));
		accessList.add(new Accessories(18));
		accessList.add(new Accessories(19));
		System.out.println("Enter the number of Laptops required");
		int lapiCount=sc.nextInt();
		System.out.println("total number of lapis available"+Laptop.totalLapQuantity);
		System.out.println("Enter the number of Accessories required");
		int accessCount=sc.nextInt();
		Laptop.lapCheck(lapiCount);
		Accessories.accessCheck(accessCount);
		sc.close();
	}
}
