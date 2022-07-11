package prelim;

import java.util.Scanner;

public class Sample {
	private static String itemName;
	private static int itemQuantity;
	private static double itemPrice,amountDue;

	
	
	public static void main(String[] args) {
		
		Sample i = new Sample();
		
		i.readInput();

		
		
	}
	//itemName setters 
	public void setitemName(String newItemName) {
		itemName = newItemName;
	}
	//totalCost setters
	public void setTotalCost(int quantity, double price) {
		itemQuantity = quantity;
		itemPrice = price;
		
	}
	//itemName getters
	public  String getitemName() {
		return itemName;
	}
	//totalCost getters
	public double getTotalCost() {
		amountDue = itemQuantity * itemPrice;
		return amountDue;
	}
	
	public static void readInput() {
		
		Sample i = new Sample();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name of the item you are purchasing : ");
		System.out.print("->");
		String Name = s.nextLine();
	    
		System.out.println("Enter the Quantity and Price separated by space : ");
    	String sampleString = s.nextLine();
    	//To scan integers separated with whitespace from a single line input
    	String [] stringArrays = sampleString.split("\\s+");
    	
    	//To split integers from white spaces & storing it in a string array
    	int[] intArray = new int[stringArrays.length-1];
    	
    	//declaring int arrays to store int from string array
    	for (int a =  0; a < stringArrays.length -1; a++) {
    		String numberAsString = stringArrays[a];
    		intArray[0] = Integer.parseInt(numberAsString);
    		System.out.println(intArray[a]);
    	}

		i.setitemName(Name);  
		
		

	}
	
    public static void writeOutput() {
    	
    	Sample i = new Sample();
    	
        System.out.println("You are purchasing " + i.itemQuantity + " " + i.getitemName() + "(s) at " + i.itemPrice + " each.");
        System.out.printf("Amount Due is %.2f", i.getTotalCost());
	}


}
