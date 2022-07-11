package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class b_OutputStream 
{

	public static void main(String[] args) throws IOException 
	{
		//Representing the file 
		File file = new File("Hello_Dear.txt");
				
		//this creates a new file if the given file does not exist
		if(!file.exists()) 
		{
			file.createNewFile();
		}
				
		//Writing text from the txt.file using FileOutputStream		
		FileOutputStream fos = new FileOutputStream(file);
				
		String TextToBeWritten = "Hello there, how are you. I'm under the waterr. Please help mee.. AhhhhhHHHhhHhHh..";
		
		fos.write(TextToBeWritten.getBytes());
		
		fos.flush();
		
		fos.close();		
	}

}
