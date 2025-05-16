
import java.util.*;

public class seventeen {
	
	public static int Factorial(int n) {
		int factorial=1;
		if(n<0) {
			System.out.println("please enter a valid number");
		}else {
			for(int i=1; i<=n; i++) {
				factorial*=i;
			}
		}
		return factorial;		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.print("Factorial of n is : "+ Factorial(n));
	}

}
