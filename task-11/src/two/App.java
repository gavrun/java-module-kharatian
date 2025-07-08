package two;

import one.NumberPrinter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int THREAD_COUNT = 10;
		Thread[] threads = new Thread[THREAD_COUNT];
		
		// Thread lifecycle: NEW, RUNNABLE, .., TERMINATED
		
		// Create threads and print initial state
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads[i] = new Thread(new NumberPrinter(i));
			
			System.out.println("Thread-" + i + " state BEFORE start: " + threads[i].getState());
		}
		
		// Start threads and immediately print state
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads[i].start();
			
			System.out.println("Thread-" + i + " state AFTER start: " + threads[i].getState());
		}
		
		// Wait for all threads to finish
		for (Thread thread : threads) {
			try {
				thread.join(); // main finishes earlier
			} catch (InterruptedException ei) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		}
		
		// Print final state
		for (int i = 0; i < THREAD_COUNT; i++) {
			
			System.out.println("Thread-" + i + " state AFTER join: " + threads[i].getState());
		}
		
	}

}
