/*Input an email from the user. You have to create a username from the email
by deleting the part that comes after ‘@’. Display that username to the user.*/
import java.util.*;

public class thirtyfive {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String email = sc.next();
		String username = "";
		
		for( int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				break;
			}
			else {
				username += email.charAt(i);
			}
		}
		System.out.println(username);
	}

}
