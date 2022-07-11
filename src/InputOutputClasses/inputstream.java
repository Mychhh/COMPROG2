package InputOutputClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class inputstream {

	public static void main(String[] args) {
		
		//-1 means end of input
		try
		{
			InputStream input = new FileInputStream("Output.txt");
			while(true)
			{
				int data = input.read();
				if (data == -1)
				{
		             System.out.println("\nEnd of stream");
		             break;
				}
				else
				{
					System.out.write(data);
				}
				System.out.flush();
			}
		}	
		catch (IOException ex)		
		{
			System.out.println(ex);
		}
	
	}

}
