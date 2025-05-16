//Make a function to multiply 2 numbers and return the product.
import java.util.*;

public class sixteen {
	
	public static int Product(int a, int b){
		int ans= a*b;
		return ans;
	}	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("enter first number : ");
		int a= sc.nextInt();
		System.out.print("enter second number : ");
		int b= sc.nextInt();		
		System.out.println("Product of a*b : "+ Product(a,b));		
	}
}
