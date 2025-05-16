//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;

public class ninteen {
	
	public static int SUM(int n) {
		int sum=0;
		for(int i=0; i<=n; i++) {
			if(i%2!=0) {
				sum= sum+i;
			}
		}
		return sum;		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.print("Sum of all odd number of n : "+SUM(n));
	}

}
