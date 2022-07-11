package InputOutputClasses;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Name your txt file : ");
		String txtFile = s.nextLine();
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(txtFile));
			
			System.out.print("type anything in your txt file : ");
			String typeAny = s.nextLine();
			
			writer.write(typeAny);
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 

	}
//check the output in your folder
}
