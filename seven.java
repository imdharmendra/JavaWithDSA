//Print the half pyramid pattern with numbers.
public class seven {
	
	public static void main(String[]args) {
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");				
			}
			System.out.print("\n");
		}
	}

}
