//Write a function that takes in the radius as input and returns the circumference of a circle.
package Java;
import java.util.*;

public class twentyone {
	
	public static double Cir(double r) {
		return 2 * 3.17 * r;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a radius : ");
		int r=sc.nextInt();
		System.out.print("Circumference of r is : " + Cir(r));
		
	}

}
