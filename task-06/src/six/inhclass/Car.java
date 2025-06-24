package six.inhclass;

public class Car {

	public String model;
	public char color;
	public float speed;
	public int weight;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String model, int weight, char color, float speed) {
		this.model = model;
		this.weight = weight;
		this.color = color;
		this.speed = speed;
	}

	public void outPut() {
        System.out.println("Weight of " + model + " is " + weight + " kg.");
        System.out.println("Car color is " + color + " and speed is " + speed + " km/h.");
    }
}
