package six.absclass;

public class Client extends Person {
	
	private String bankName;

	public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("Client Info:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Bank: " + bankName);
	}

//	public String getBankName() {
//        return bankName;
//    }
}
