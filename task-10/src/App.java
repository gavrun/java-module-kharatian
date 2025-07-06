import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Clean up and create files
		
		Path file1 = Paths.get("file1.txt");
		Path file2 = Paths.get("file2.txt");
		Path file3 = Paths.get("file3.txt");
		
		try {
			Files.deleteIfExists(file1);
			Files.deleteIfExists(file2);
			Files.deleteIfExists(file3);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Ooops");
		}
		
		FileUtils.appendToFile(file1, "Line 0001");
		FileUtils.appendToFile(file1, "Line 0002");
		FileUtils.appendToFile(file2, "Line 0003");
		FileUtils.appendToFile(file2, "Line 0004");
		
		
		// 1
		System.out.println("Reading: " + file1.toString());
		FileUtils.readFile(file1).forEach(System.out::println);
		System.out.println();
		
		// 2
		System.out.println("Appending to: " + file1.toString());
		FileUtils.appendToFile(file1, "This line was added.");
		FileUtils.readFile(file1).forEach(System.out::println);
		System.out.println();
		
		// 3
		System.out.println("Merging: " + file1.toString() + " with " + file2.toString() + " into " + file3.toString());
		FileUtils.mergeFiles(file1, file2, file3);
		FileUtils.readFile(file3).forEach(System.out::println);
		System.out.println();
		
		// 4
		System.out.println("Sanitizing: " + file1.toString());
		FileUtils.sanitizeFile(file1);
		FileUtils.readFile(file1).forEach(System.out::println);
		
	}

}
