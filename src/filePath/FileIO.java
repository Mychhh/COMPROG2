package filePath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		String[] Name = {"Michael, Miguel, Mark"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
			writer.write("Writing to a file\n");
			
			for(String name : Name)
			{
				writer.write("\n" + name);
			}
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
		   
			String line;
			
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
		    reader.close();
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}

	}

}
