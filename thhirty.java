//Take a matrix as input from the user. search for the given number x and print the indices at which it occur.
import java.util.*;

public class thhirty {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of cols : ");
		int cols = sc.nextInt();
		int [][] numbers= new int [rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				numbers[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		System.out.print("Enter a value to search : ");
		int x = sc.nextInt();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(numbers[i][j]==x) {
					System.out.print("value found at: " + i +", " + j);
				}
			}
		}

	}

}
