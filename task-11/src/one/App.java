package one;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int THREAD_COUNT = 10;
		Thread[] threads = new Thread[THREAD_COUNT];
				
		// Create and start threads 
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads[i] = new Thread(new NumberPrinter(i));
			
			threads[i].start();
		}
		
		// Wait for all threads to finish
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException ei) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		}
		
	}

}
