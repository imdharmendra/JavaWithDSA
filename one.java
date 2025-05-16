//Print the sum of first n natural numbers.
import java.util.Scanner;

public class one {
	 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter a number : ");
		int n= sc.nextInt();
		int sum =0;		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.print("Sum of first n natural numbers : " +sum);
	}
}
