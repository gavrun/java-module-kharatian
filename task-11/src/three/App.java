package three;

import java.util.concurrent.CountDownLatch;

public class App {

	private static final int THREAD_COUNT = 100;
    private static final int INCREMENTS_PER_THREAD = 1000;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runTest("Naive (not synchronized)", new CounterNaive());
		
        runTest("Synchronized", new CounterSynced());
        
        runTest("AtomicInteger", new CounterAtomic());
	}
	
	// Test logic
	private static void runTest(String label, Counter counter) {
		Thread[] threads = new Thread[THREAD_COUNT];
		
		// Synchronization aid
		CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
		
		long start = System.nanoTime();
		
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads[i] = new Thread( () -> {
				for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
					counter.increment();
				}
				latch.countDown(); // signal that this thread is done
			});
			threads[i].start();
		}
		
//		for (Thread thread : threads) {
//			thread.start();
//		}
		
//		for (Thread thread : threads) {
//			try {
//				thread.join();
//			} catch (InterruptedException ei) {
//				// TODO: handle exception
//				Thread.currentThread().interrupt();
//			}
//		}
		
		try {
            latch.await(); // wait for all threads to complete
        } catch (InterruptedException ei) {
            Thread.currentThread().interrupt();
        }
		
		long end = System.nanoTime();
		
		System.out.println(label + " method final count: " + counter.getCount() + "\n  Execution time: " + (end - start) + " ns");
	}

}
