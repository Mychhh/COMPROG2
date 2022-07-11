package InputOutputClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_Reading_and_Writing_a_File {

	public static void main(String[] args) throws IOException {
		
// create a file object for the current location
		File newFile = new File ("newFile.txt");
//we will create a text file here		
		try 
		{
		   // trying to create a file based on the object
		      boolean value = newFile.createNewFile();
		   // the value of boolean is true if the system created a new file    
		      
		      if (value) 
		      {
		        System.out.println("The new file is created.");
		      }
		      else 
		      {
		        System.out.println("The file already exists.");
		      }
		      
		}
		catch(Exception e) 
	    {
		      e.getStackTrace();
		}
		
//Delete a file		
		boolean value = newFile.delete();
//we will delete the text file that we have made earlier		
	    if(value) 
	    {
	      System.out.println("The File is deleted.");
	    }
	    else 
	    {
	      System.out.println("The File is not deleted.");
	    }

//File Create, Read, and Write
	    char[] array = new char[100];
		String data = "Hello World";
//we will automatically create again a new file here because we write and read a text 
//which will be stored to a new textfile that we have assigned " newFile.txt " 
		try 
		{
			FileWriter FW = new FileWriter("newFile.txt");
			FileReader FR = new FileReader("newFile.txt");
			
			FW.write(data); 
		    FR.read(array);
		    
		    FW.close();
		    FR.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
//it will delete a file again just like what we do earlier	
		if(value) 
	    {
		System.out.println("The File is deleted.");
	    }
		else 
		{
		System.out.println("The File is not deleted.");
		}
		

	}

}
