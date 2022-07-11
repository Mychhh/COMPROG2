package prelim;

import java.util.Scanner;

public class LabExercise2 {
//Main
	public static void main(String[] args) {
		
		LabExercise2_1_Item item = new LabExercise2_1_Item();
				
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name of the item you are purchasing : ");
		String iName = s.nextLine();
		item.setItemName(iName);
		
		System.out.print("Enter the Quantity                            : ");
		int Qnum = s.nextInt();
		System.out.print("Enter the Item Price                          : ");
		double iPrice = s.nextDouble();
		item.setTotalCost(Qnum, iPrice);
		
		String newItemName = item.getitemName();
		double amountdue = item.gettotalCost();
		
		item.writeOutput();

		
	}
	
}
