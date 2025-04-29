/*Two numbers are entered by the user, x and n.
 Write a function to find the value of one number raised to the power of another i.e. x power n. */
package Java;
import java.util.*;

public class twentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter x : ");
		int x= sc.nextInt();
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int res= 1;
		
		for(int i =0; i<n; i++) {
			res*=x;
		}
		System.out.print(res);
		
		
	}

}
