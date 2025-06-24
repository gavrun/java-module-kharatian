package six.inhclass;

public class Truck extends Car {
	
	private int wheels;
    private int maxWeight;

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String model, int weight, char color, float speed, int wheels, int maxWeight) {
		super(model, weight, color, speed);
		// TODO Auto-generated constructor stub
		this.wheels = wheels;
        this.maxWeight = maxWeight;
	}
	
	public void newWheels(int wheels) {
        this.wheels = wheels;
        System.out.println("The new number of wheels is: " + this.wheels);
    }
	
	public void truckInfo() {
        outPut();
        System.out.println("Number of wheels: " + wheels);
        System.out.println("Maximum weight: " + maxWeight + " kg.");
    }

}
