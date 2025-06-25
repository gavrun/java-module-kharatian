package six.intclass;

public class Client extends Person implements BankRole {
	
	private String bankName;

	public Client(String firstName, String lastName, String bankName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		this.bankName = bankName;
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
//		return null;
		return bankName;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

		System.out.println("Client Info:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Bank: " + bankName);
	}

}
