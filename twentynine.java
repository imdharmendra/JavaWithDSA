////Take an 2D array as input from the user and print them on the screen.
import java.util.*;

public class twentynine {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of cols : ");
		int cols= sc.nextInt();
		int[][] numbers = new int [rows][cols];
		
		for(int i =0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				numbers[i][j]= sc.nextInt();
			}		
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
