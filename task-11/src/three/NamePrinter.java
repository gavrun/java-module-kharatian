package three;

public class NamePrinter implements Runnable {

	// Name
	private final String thisName;
    private final String otherName;
    
    // Shared state
    private static final Object LOCK = new Object();
    private static volatile String currentTurn;
    
    // Termination condition
    private static final int MAX_PRINTS = 10;
    private static int totalPrints = 0;
    
    // Initialize turn
    public static void startWith(String turn) {
        if (turn != null && !turn.isBlank()) {
        	currentTurn = turn;
		}
    }
    
    public NamePrinter(String thisName, String otherName) {
		// TODO Auto-generated constructor stub
    	this.thisName = thisName;
    	this.otherName = otherName;
	}
    
    @Override
    public void run() {
    	while (totalPrints < MAX_PRINTS * 2) {
			synchronized (LOCK) {
				// Check term
				if (totalPrints >= MAX_PRINTS * 2) {
					LOCK.notifyAll();
					break;
				}
				
				// Check turn
				while (!currentTurn.equals(thisName)) {
					try {
						LOCK.wait();
					} catch (InterruptedException ei) {
						// TODO: handle exception
						Thread.currentThread().interrupt();
						return;
					}
				}
			
				// Print name
				if (totalPrints >= MAX_PRINTS * 2) {
					break;
				}
				System.out.println(thisName);
				totalPrints++;
				
				// Change turn
				currentTurn = otherName;
				
				// Wake up
				LOCK.notifyAll();
			}
			
			// Delay
            try {
                Thread.sleep(100);
            } catch (InterruptedException ei) {
                Thread.currentThread().interrupt();
                return;
            }
		}
    }
    
}
