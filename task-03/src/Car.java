
public class Car {
	
	private String name;
	private String color;
	private double weight;
	
	public Car() {
		this.name = "Not defined";
		this.color = "Not defined";
		this.weight = 0.0;
	}
	
	public Car(String color) {
		this.name = color;
		this.color = "Not defined";
		this.weight = 0.0;
	}
	
	public Car(String color, double weight) {
		this.name = color;
		this.color = "Not defined";
		this.weight = weight;
	}
	
//	private void pringInfo() {
//		System.out.println("Name: " + name);
//		System.out.println("Color: " + name);
//		System.out.println("Weight: " + name);
//		System.out.println();
//	}
	
	public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
    
    public void setName(String name) {
        this.name = name;
    }
	
}
