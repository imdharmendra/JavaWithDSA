//Set Bit
//Set the 2nd bit position = 1 of a number n (n = 0101)
package Java;

public class thirtyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; 
		int position = 1;
		int bitmask =1<<position;
		
		int newNumber= bitmask | n;
		System.out.println(newNumber);

	}

}
