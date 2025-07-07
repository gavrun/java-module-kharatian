package two;

public class CounterSynced implements Counter {
	
	private int count = 0;

	public CounterSynced() {
		// TODO Auto-generated constructor stub
	}

	// Auto-generated
	@Override
	public synchronized int getCount() {
		return count;
	}

	// Auto-generated
	@Override
	public synchronized void setCount(int count) {
		this.count = count;
	}
	
	// Method synchronized
	@Override
    public synchronized void increment() {
        count++;
    }

}
