package three;

public class NamePrinterBad implements Runnable {
	
	// Name
	private final String thisName;
	
	private static final Object LOCK = new Object();
	
    private static volatile String currentTurn = "Alpha"; 
    
    private static final int MAX_PRINTS = 10;
    private static int totalPrints = 0;

	public NamePrinterBad(String thisName) {
		// TODO Auto-generated constructor stub
		this.thisName = thisName;
	}
	
	@Override
	public void run() {
		while (totalPrints < MAX_PRINTS * 2) {
			synchronized (LOCK) {
				while (!currentTurn.equals(thisName)) {
					if (totalPrints >= MAX_PRINTS * 2) {
						LOCK.notifyAll();
                        return;
					}
					
					try {
						LOCK.wait();
					} catch (Exception ei) {
						// TODO: handle exception
						Thread.currentThread().interrupt();
						return;
					}
				}
				
				// Print name
				System.out.println(thisName);
                totalPrints++;
                
                if (this.thisName.equals("Alpha")) {
                	currentTurn = "Beta";
				} else {
					currentTurn = "Alpha";
				}
                
                LOCK.notifyAll();
			}
		}
	}

}
