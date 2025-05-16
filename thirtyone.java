//For a given matrix of N x M, print its transpose.
import java.util.*;

public class thirtyone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the rows of array : ");
		int rows =sc.nextInt();
		System.out.print("Enter the cols of array : ");
		int cols =sc.nextInt();
		
		int [][] numbers = new int[rows][cols];
		
		for(int i =0; i<rows; i++) {
			for(int j =0; j<cols; j++) {
				numbers[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		  System.out.println("The transpose is : ");

		for(int j=0; j<cols; j++) {
			for(int i=0; i<rows; i++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}

	}

}
