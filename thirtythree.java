//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
package Java;
import java.util.*;

public class thirtythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int item =sc.nextInt();
		String arr[]= new String[item];
		int tolength =0;
		
		for(int i=0; i<item; i++) {
			arr[i]= sc.next();
			tolength += arr[i].length();
		}
		System.out.print(tolength);
	}

}
