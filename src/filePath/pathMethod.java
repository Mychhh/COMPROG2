package filePath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class pathMethod {

	public static void main(String[] args) {
//index of the path                       0       1          2 		
//number of elements                 0    1       2          3	
		Path filePath =  Paths.get("C:\\Java\\Documents\\Hotdog.txt");
		
//Returns the String implementation of the path 		
		System.out.println("String representation of the path     : " + filePath.toString());
		
//Returns the last item in the sequence of name elements in the file or directory 		
		System.out.println("The last item in the sequence is      : " + filePath.getFileName());
		
//Returns the number of name elements in the path		
		System.out.println("The number of elements in the path is : " + filePath.getNameCount());
		
//Returns the name in the position of the path specified by the integer parameter
		System.out.println("The index 2 of a path is              : " + filePath.getName(2));
		
	}

}
