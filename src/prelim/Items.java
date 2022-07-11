package prelim;

import java.util.Scanner;

public class Items {

	private static String itemName;
	private static int itemQuantity;
	private static double itemPrice,amountDue;

	public static void main(String[] args) {
		
		Items i = new Items();
		
		i.readInput();
		i.writeOutput();
				
	}
	//itemName setters 
	public void setitemName(String newItemName) {
		itemName = newItemName;
	}
	//totalCost
	public void setTotalCost(int quantity, double price) {
		itemQuantity = quantity;
		itemPrice = price;
	}
	//itemName getters
	public  String getitemName() {
		return itemName;
	}
	//totalCost
	public double getTotalCost() {
		amountDue = itemQuantity * itemPrice;		
		return amountDue;
	}
	
	public static void readInput() {
		
		Items i = new Items();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name of the item you are purchasing : ");
		System.out.print("->");
		String Name = s.nextLine();
	    
		System.out.println("Enter the quantity and price separated by space : ");
		System.out.print("->");
		int Quantity = s.nextInt();
		double Price  = s.nextDouble();
		
		i.setitemName(Name);  
		i.setTotalCost(Quantity, Price);

	}
	
    public static void writeOutput() {
    	
    	Items i = new Items();
    	
        System.out.println("You are purchasing " + i.itemQuantity + " " + i.getitemName() + "(s) at " + i.itemPrice + " each.");
        System.out.printf("Amount Due is %.2f", i.getTotalCost());
	}

}
