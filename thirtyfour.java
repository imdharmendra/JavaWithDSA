/* Input a string from the user. Create a new string called ‘result’
in which you will replace the letter ‘e’ in the original string with letter ‘i’. */
package Java;
import java.util.*;

public class thirtyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner (System.in);
		     String str = sc.next();
		     String result = "";


		     for(int i=0; i<str.length(); i++) {
		       if(str.charAt(i) == 'e') {
		         result += 'i';
		       } else {
		         result += str.charAt(i);
		       }
		     }

		System.out.println(result);
	}

}
