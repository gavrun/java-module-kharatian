
public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		
//		Airplane.Wing wing1 = new Airplane.Wing(1500.5);
//        System.out.println("First wing weight: " + wing1.getWeight() + " kg");
        
//        Airplane.Wing wing2 = new Airplane.Wing(1700.75);
//        System.out.println("Second wing weight: " + wing2.getWeight() + " kg");
		
		// 2
		
		Airplane airplane1 = new Airplane(1500.5);
        System.out.println("First airplane's wing weight: " + airplane1.getWing().getWeight() + " kg");
        
        Airplane airplane2 = new Airplane(1700.75);
        System.out.println("Second airplane's wing weight: " + airplane2.getWing().getWeight() + " kg");
        
	}

}
