
public class Airplane {

	// 2
	
	private Wing wing;
	
	public Airplane(double wingWeight) {
		// TODO Auto-generated constructor stub
		this.wing = new Wing(wingWeight);
	}
	
	public Wing getWing() {
        return wing;
    }
	
	// 1
	
	public static class Wing {
		
		private double weight;

		public Wing(double weight) {
			// TODO Auto-generated constructor stub
			this.weight = weight;
		}
		
		public double getWeight() {
            return weight;
        }
	}

}
