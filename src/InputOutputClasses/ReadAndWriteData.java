package InputOutputClasses;

import java.io.IOException;

public class ReadAndWriteData {

	public static void main(String[] args) {
	
		try 
		{
//we have to input a data with a length of 20bytes	
		   int[] data = new int[20]; 

		   System.out.println("Enter a data");
		   
//System.in will let us input data in the console
//and we will read it, because we use .read
//which will be stored in int[] data
		   
		   for (int i = 0; i < data.length; i++)
		   {
			   data[i] = System.in.read();
		   }
		   
		   System.out.println("\nInput Collected\n");
//we will output the data using System.out.write() in a for loop;		    
		   for (int i = 0; i < data.length; i++)
		   {
		      System.out.write(data[i]);
		   }
//I dont know what the fuck is the use of this flush but this is essential		   
		   System.out.flush();
		
		}
		   catch (IOException ex)
		   {
		   System.out.println(ex);
		   }

	}

}
