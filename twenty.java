//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class twenty {

	public static void Greatest(int a, int b) {
		if(a>b) {
			System.out.println("A is greater");
		}else {
			System.out.println("B is greater");
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a and b : ");
		int a=sc.nextInt();
		int b=sc.nextInt();		
		Greatest(a,b);

	}

}
