package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class a_InputStream 
{

	public static void main(String[] args) throws IOException
	{
		//Representing the file 
		File file = new File("Hello_World.txt");
		
		//this creates a new file if the given file does not exist
		if(!file.exists()) 
		{
			file.createNewFile();
		}
		
		//Reading text from the file using FileInputStream		
		FileInputStream fis = new FileInputStream(file);
		
		int i = fis.read();
		
		while(!(i==-1)) 
		{			
			char c = (char)i;
			
			System.out.print(c);
			
			i = fis.read();
		}
		
		fis.close();
	}

}
