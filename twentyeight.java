//Take an array of numbers as input and check if it is an array sorted in ascending order. 
import java.util.*;

public class twentyeight {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int nums[]= new int [size];
		
		for(int i=0; i<size; i++) {
			nums[i]=sc.nextInt();
		}
		
		boolean isAssending =true;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]>nums[i+1]) {
				isAssending=false;
			}
		}
		if(isAssending) {
			System.out.print("Array is sorted in assending order");
		}else {
			System.out.print("Array is not sorted in assending order");
		}
		
	}

}
