//Clear Bit
//Clear the 3rd bit (position = 2) of a number n (n = 0101)
public class thirtynine {

	public static void main(String[] args) {
		
		int n=5; //0101
		int position = 2;
		int bitmask =1<<position;
		int notbitmask =~bitmask;
		
		int newNumber= notbitmask & n;
		System.out.println(newNumber);

	}

}
