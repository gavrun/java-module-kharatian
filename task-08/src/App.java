
public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Unchecked exception
//		throwCustomUncheckedException(); // Uncomment to crash immediately
		
		try {
//			throwCustomUncheckedException(); // Uncomment to catch
			
			throwCustomCheckedException();
			throwCustomUncheckedException();
			
		} catch (CustomCheckedException exc) {
			// TODO: handle exception
			System.err.println("Caught checked exception: " + exc.getMessage());
		} catch (CustomUncheckedException exu) {
			// TODO: handle exception
			System.err.println("Caught unchecked exception: " + exu.getMessage());
		} catch (Exception ex) {
			// TODO: handle exception
			System.err.println("Somthing went wrong: " + ex.getMessage());
		} finally {
			System.out.println("Finally block executed after handling exception");
		}
		
	}
	
	//
	public static void throwCustomCheckedException() throws CustomCheckedException {
		throw new CustomCheckedException("Custom checked exception has been thrown");
	}
	
	//
	public static void throwCustomUncheckedException() throws CustomUncheckedException {
		throw new CustomUncheckedException("Custom unchecked exceptoin has been thrown");
	}

}
