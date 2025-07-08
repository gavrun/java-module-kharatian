package three;

public class CounterNaive implements Counter {

	private int count = 0;
	
	public CounterNaive() {
		// TODO Auto-generated constructor stub
	}

	// Auto-generated 
	@Override
	public int getCount() {
		return count;
	}

	// Auto-generated 
	@Override
	public void setCount(int count) {
		this.count = count;
	}

	// Method not synchronized, not safe example
	@Override
	public void increment() {
        count++;
    }
	
}
