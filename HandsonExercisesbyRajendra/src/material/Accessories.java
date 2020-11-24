package material;

import stock.Inventory;

public class Accessories extends Inventory 
{
	static int lowerOrderQuantity=5;
	int accessQuantity;
	static int totalAccessQuantity;
	public Accessories(int accessQuantity) 
	{
		totalAccessQuantity+=accessQuantity;
	}
	public static void accessCheck(int accessCount) 
	{
		if(accessCount<=totalAccessQuantity)
		{
			System.out.println("The Accessories Quantity is available");
			totalAccessQuantity-=accessCount;
		}else 
		{
			System.out.println("The Accessories Quantity is not available");
		}
		requestForMaterial(totalAccessQuantity);
	}
	public static void requestForMaterial(int Quantity) 
	{
		if(Quantity<=lowerOrderQuantity)
		{
			System.out.println("Request For Material in Accessories");
		}
	}

}
