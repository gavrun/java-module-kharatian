package six.poly;

import java.util.Scanner;

public class ExtendedUser extends User {

	public ExtendedUser() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void getUserInfo(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Your name is: " + name);
    }

}
