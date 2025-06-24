package six.intclass;

public class Staff extends Person implements BankRole {
	
	private String bankName;

	public Staff(String firstName, String lastName, String bankName) {
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
		System.out.println("Bank Staff Info:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Bank: " + bankName);
	}

}
