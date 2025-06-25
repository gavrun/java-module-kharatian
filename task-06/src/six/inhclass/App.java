package six.inhclass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck truck = new Truck("Volvo FH", 8000, 'W', 120.5f, 18, 25000);
		
		truck.truckInfo();
		System.out.println();
		
		truck.newWheels(22);
		
	}

}
