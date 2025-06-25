package six.poly;

import java.util.Scanner;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        ExtendedUser user = new ExtendedUser();
        
        user.getUserInfo(scanner);

        scanner.close();
        
	}

}
