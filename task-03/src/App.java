
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1

		Study study = new Study("Learnign Java!");

		System.out.println(study.printCourse());

		// 2

		Car car1 = new Car("Red");
		car1.setName("Byd");
		printCarInfo(car1);

		Car car2 = new Car("Blue", 1300.0);
		car2.setName("Audi");
		printCarInfo(car2);

		Car car3 = new Car();
		car3.setName("Lada");
		printCarInfo(car3);

		// 3

		House house1 = new House();
		house1.setPropsAll("House of Horror", 5, 2010);
		printHouseInfo(house1);

		House house2 = new House();
		house2.setPropsAll("Zinger Hourse", 10, 2000);
		printHouseInfo(house2);

		// 4

		Tree tree1 = new Tree("Pine", 10);
		printTreeInfo(tree1);

		Tree tree2 = new Tree("Oak", 50, false);
		printTreeInfo(tree2);

		Tree tree3 = new Tree();
		if (tree3.ifCtorPrint()) {
			System.out.println("Default Ctor has been triggered and did nothing.");
		}
		printTreeInfo(tree3);

	}

	// 2
	public static void printCarInfo(Car car) {
		System.out.println("Car: " + car.getName());
		System.out.println("Color: " + car.getColor());
		System.out.println("Weight: " + car.getWeight());
		System.out.println();
	}

	// 3
	public static void printHouseInfo(House house) {
		System.out.println("House: " + house.getName());
		System.out.println("Number of stories: " + house.getFloors());
		System.out.println("Year of construction: " + house.getYearBuilt());
		System.out.println("House age: " + house.getAgeBuilt() + " years");
		System.out.println();
	}

	// 4
	public static void printTreeInfo(Tree tree) {
		System.out.println("Tree: " + tree.getName());
		System.out.println("Tree Age: " + tree.getAge());
		System.out.println("Still alive: " + (tree.isAlive() ? "Yes" : "No"));
		System.out.println();
	}

}
