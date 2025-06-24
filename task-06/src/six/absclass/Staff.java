package six.absclass;

public class Staff extends Person {
	
	private String bankName;
	
	public Staff(String firstName, String lastName, String bankName) {
		super(firstName, lastName);
        this.bankName = bankName;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("Bank Staff Info:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Bank: " + bankName);
	}

//	public String getBankName() {
//        return bankName;
//    }
}
