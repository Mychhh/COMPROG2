package prelim;

public class Activity1 {

	public static void main(String[] args) {
		
		int faveNumber = 26; 
		String  faceCartChar = "Toph Beifong";
		char mi = 'D';
		char mii = 'R';
		char[] nickNameArray = {'c','h','a','e','l'};
		
		System.out.println(faveNumber + " is my favourite number.");
		System.out.println("I Love " + faceCartChar + " !");
		System.out.println("My name is Michael " + mi + mii +" Pabaya." );
		System.out.print("You can call me " );
		
		for (int i = 0; i < nickNameArray.length; i++) {
			System.out.print(nickNameArray[i]); // This for loop will print all the value inside an array
		}

/*		
		//The valueof() method converts data in to a readable form
		String nName = String.valueOf(nickNameArray);
		
		System.out.println(faveNumber + " is my favourite number.");
		System.out.println("I Love " + faceCartChar + "!");
		System.out.println("My name is Michael " + mi + mii +". Pabaya" );
		System.out.println("You can call me " + nName );
		                                      //you can also type nickNameArray[index] one by one
*/	
	}
}