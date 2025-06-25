package six.absclass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		
		Client client = new Client("John", "Doe", "Bank of America");
        Staff worker = new Staff("Jane", "Smith", "Chase Bank");
     
        client.printInfo();
        System.out.println();
        worker.printInfo();
        System.out.println();
        
	}

}
