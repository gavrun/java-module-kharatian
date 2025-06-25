package six.intclass;

import six.intclass.Client;
import six.intclass.Staff;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2
		
		Client client = new Client("John", "Doe", "Bank of America");
        Staff worker = new Staff("Jane", "Smith", "Chase Bank");
     
        client.printInfo();
        System.out.println();
        worker.printInfo();
        System.out.println();
        
        printBankName(client);
        printBankName(worker);
	}
	
	public static void printBankName(BankRole role) {
        System.out.println("Bank for role: " + role.getBankName());
    }

}
