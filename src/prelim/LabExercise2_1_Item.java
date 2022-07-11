package prelim;

import java.util.Scanner;

// Object  
class LabExercise2_1_Item {
	
	//This is Encapsulation
	
	private String itemName;
	private double itemPrice,amountDue; //Attributes
	private int itemQuantity;
	
	private double totalCost;

	void setItemName(String newItemName) {
		itemName = newItemName;
	}
	
	void setTotalCost(int itemQuantity, double itemPrice) {
		totalCost = itemQuantity * itemPrice;
	}
	
	String getitemName() {
		return itemName;
	}
	
	double gettotalCost() {
		return totalCost;
	}
	
	void writeOutput() {
		System.out.println("You are purchasing "+ itemQuantity +" "+ itemName + "(s) at " + itemPrice +" each");
	}

	
}
