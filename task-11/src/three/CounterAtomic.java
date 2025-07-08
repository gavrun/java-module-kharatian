package three;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic implements Counter {
	
	private final AtomicInteger count = new AtomicInteger(0);

	public CounterAtomic() {
		// TODO Auto-generated constructor stub
	}

	// Auto-generating getter setter does not work
	
	@Override
    public int getCount() {
        return count.get();
    }
	
	@Override
	public void setCount(int count) {
		this.count.set(count); // not atomic, safe
	}
	
	// Method with non-blocking atomic increment
    @Override
    public void increment() {
        count.incrementAndGet();
    }
    
}
