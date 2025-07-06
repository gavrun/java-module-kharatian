package example;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Infrastructure
		try {
			System.out.println("Creating users..");
			makeFailure();
		} catch (CustomUncheckedException exu) {
            System.err.println("Unexpected runtime error: " + exu.getMessage());
        }
		
		// Business logic
		try {
			createUser("Test");
			
			createUser("Te");
			
		} catch (CustomCheckedException ex) {
			// TODO: handle exception
			System.err.println("Validation failed: " + ex.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Somthing went wrong: " + e.getMessage());
		} finally {
			System.out.println("Creating users completed");
		}
	}
	
	public static void createUser(String username) throws CustomCheckedException {
		if (username == null || username.trim().isEmpty()) {
			throw new CustomCheckedException("User cannot be empty");
		}
		if (username.length() < 3) {
			throw new CustomCheckedException("User name \""  + username + "\" must be at least 3 char long"); 
		}
		System.out.println("User \"" + username + "\" registered successfully");
	}
	
	public static void makeFailure() {
		throw new CustomUncheckedException("Connection lost. Retrying..");
	}

}
