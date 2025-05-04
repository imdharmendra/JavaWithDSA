//Get Bit
//Get the 3rd bit (position = 2) of a number n (n = 0101)
package Java;

public class thirtyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //0101
		int position=2;
		int bitmask = 1<<position;
		
		if((bitmask &n)==0) {
			System.out.println("bit was zero");
		}
		else {
			System.out.println("bit was one");
		}

	}

}
