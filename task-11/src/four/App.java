package four;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bad example of implementing NamePrinter
		
//		Thread alpha = new Thread(new NamePrinterBad("Alpha"));
//        Thread beta = new Thread(new NamePrinterBad("Beta"));

//        alpha.start();
//        beta.start();
		
		System.out.println("Main begin");
		
		// Shared monitor
		NamePrinter.startWith("Beta");
		
		Thread thread1 = new Thread(new NamePrinter("Alpha", "Beta"));
		Thread thread2 = new Thread(new NamePrinter("Beta", "Alpha"));
		
		thread1.start();
		thread2.start();
		
		// Main waits
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException ei) {
			// TODO: handle exception
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Main end");
	}

}
