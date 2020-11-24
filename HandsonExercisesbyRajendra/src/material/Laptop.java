package material;

import stock.Inventory;

public class Laptop extends Inventory 
{
	static int lowerOrderQuantity=3;
	int lapQuantity;
    static int totalLapQuantity;
	public Laptop(int lapQuantity)
	{
		totalLapQuantity+=lapQuantity;
	}
	public static void lapCheck(int lapiCount) 
	{
		if(lapiCount<=totalLapQuantity)
		{
			System.out.println("The Laptop Quantity is available");
			Laptop.totalLapQuantity-=lapiCount;
		}else 
		{
			System.out.println("The Laptop Quantity is not available");
		}
		requestForMaterial(Laptop.totalLapQuantity);
	}
	public static void requestForMaterial(int Quantity) 
	{
		if(Quantity<=lowerOrderQuantity)
		{
			System.out.println("Request For Material in Laptop");
		}
	}
}
