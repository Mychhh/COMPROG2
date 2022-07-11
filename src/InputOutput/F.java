package InputOutput;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class F 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("PrintStreamSample.txt");
		
		if(!f.exists()) 
		{
			f.createNewFile();
		}
		
		PrintStream fileWriter = new PrintStream(f);
		
		fileWriter.println("Hello there, I am here.");
	}

}
