//Update Bit
//Update the 2nd bit (position = 1) of a number n to 1 (n = 0101)
import java.util.*;

public class fourty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 0 or 1 : ");
		int operation =sc.nextInt();
		
		int n=5; 
		int position = 1;	
		int bitmask =1<<position;
		
		if(operation ==1) {
			int newNumber= bitmask | n;
			System.out.println(newNumber);
		}else {
			int newbitmask = ~(bitmask);
			int newNumber = newbitmask & n;
			System.out.println(newNumber);
		}
		
	}

}
