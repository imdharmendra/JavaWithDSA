// Write a function enter 3 numbers from the user to print their average.
import java.util.*;

public class eighteen {
	
	public static int average(int a, int b, int c) {
		int avg= (a+b+c)/3;
		return avg;
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers a, b, c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("Average is : "+ average(a, b, c));
		
	}

}
