package six.encap;

public class ChildClass extends BaseClass {

	public ChildClass(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	public void printNumber() {
        System.out.println("The number is: " + getNumber());
    }

}
