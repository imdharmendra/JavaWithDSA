//Print the number pyramid pattern.
public class thirteen {
	
	public static void main(String[]args) {
		
		int n=5;
		for(int i=1; i<=n; i++) {
			int spaces= n-i;
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+ " ");
			}
			System.out.print("\n");
		}
		
	}
}
