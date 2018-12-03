import java.util.Scanner;
import java.io.File;
import java.util.Scanner;
public class TTK_Create {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the desire User name: ");
	String userName = input.nextLine();
	userName = userName + " .txt";

	TTK_User user = new TTK_User(userName, userName);


 }

}
