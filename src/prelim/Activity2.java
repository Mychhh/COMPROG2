package prelim;
import java.util.Scanner;
public class Activity2 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		num =  s.nextInt();
		System.out.println();//Space
		
		showNumberPlus10(num);
		showNumberPlus100(num);
		showNumberPlus1000(num);
		
}
		
	static int  showNumberPlus10 (int num1) {
		int num2 =  10;
		int total = num1 + num2;
		System.out.println(num1 + " plus " + num2 + " is    : " + total );
		return num1;
	}
	static int  showNumberPlus100 (int num1) {
		int num2 =  100;
		int total = num1 + num2;
		System.out.println(num1 + " plus " + num2 + " is   : " + total );
		return num1;
	}
	static int  showNumberPlus1000 (int num1) {
		int num2 =  1000;
		int total = num1 + num2;
		System.out.println(num1 + " plus " + num2 + " is  : " + total );
		return num1;
	}

}