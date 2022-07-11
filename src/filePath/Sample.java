package filePath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws IOException {
	Scanner s =  new Scanner(System.in);
		
		System.out.println("Hello, User");
		System.out.println("To register press : X ");
		System.out.println("To log-in   press : Y ");
		char xy = s.next().charAt(0);
		System.out.println();
		
		if(xy == 'X') 
		{
			System.out.println("Register Now!");
			System.out.print("Username : ");
			String userName = s.next();
			System.out.print("Password : ");
			String passWord = s.next();
			
		  //This will store the value of Username and Password	
			String records = userName + passWord;
			
			FileWriter writer =  new FileWriter("C:/Java/Documents/records.txt");
			writer.write(records);
			writer.close();
			
			System.out.println("\nSuccesfully Registered!");
		}
		
		else if(xy == 'Y') 
		{
			System.out.println("Log-in Now!");
			System.out.print("Username : ");
			String userName = s.next();
			System.out.print("Password : ");
			String passWord = s.next();
			System.out.println();
			
			String records = userName + passWord;
			
			FileInputStream file = new FileInputStream("C:/Java/Documents/records.txt");
			Scanner scan = new Scanner(file);
			
			//Chael_26
			//P@ssW0rd
			String existingRecords = "";
			
			//this will read the value inside a text file that i am going to compare with user input
			//while the textFile has next line it will run
			while(scan.hasNextLine()) 
			{	
			//I will concatenate the value inside of a records.txt file to a variable existingRecords	
    		existingRecords = existingRecords.concat(scan.nextLine());
			}
			
			if(records.equals(existingRecords)) 
			{
				System.out.println("Succesfully Logged in");
			}
			else 
			{
				System.out.println("Incorrect Username and Password");
			}      
		}

	}

}
