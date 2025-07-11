package two;

public class NumberPrinter implements Runnable {
	
	private final int NUM_COUNT = 25;
	
	private final int id;
	
	public NumberPrinter(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	// Worker that prints numbers from 0 to X
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < NUM_COUNT; i++) {
			System.out.println("Thread-" + id + ": " + i);
			
			// Optional delay to make RUNNABLE state observable
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException ei) {
//				// TODO: handle exception
//				Thread.currentThread().interrupt();
//			}
		}
	}

}