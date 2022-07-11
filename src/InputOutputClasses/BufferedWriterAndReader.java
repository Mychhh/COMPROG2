package InputOutputClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterAndReader {

	public static void main(String[] args) {

// Copying data 
		try {
		    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Java\\Documents\\Hotdog-Copy.txt"));
		    BufferedReader br = new BufferedReader(new FileReader("C:\\Java\\Documents\\Hotdog.txt"));
		    
		    String s;
		    
		    while((s = br.readLine()) != null)
		    {
		        bw.write( s + "\n");
		    }
		    br.close();
		    bw.close();
		}catch(Exception ex){
		    return;
		} 
	}

}
