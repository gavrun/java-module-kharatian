package six.poly;

import java.util.Scanner;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public void getUserInfo(Scanner scanner) {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }

}
