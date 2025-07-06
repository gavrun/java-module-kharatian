import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileUtils {
	// Read all lines from file
	// Return list of strings
	public static List<String> readFile(Path path) {
		try {
			return Files.readAllLines(path, StandardCharsets.UTF_8); // has buffer, force UTF-8
		} catch (IOException eio) {
			// TODO: handle exception
			System.err.println("Failed to read file: " + path);
			eio.printStackTrace();
			
			return new ArrayList<>();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Somethign went wrong");
            e.printStackTrace();
            
			return new ArrayList<>(); // empty list on error
		}
	}
	
	// Append lines to file, try-with-resources
	// Return nothing
	public static void appendToFile(Path path, String lines) {
		try (BufferedWriter writer = Files.newBufferedWriter(
											path, 
											StandardCharsets.UTF_8,
											StandardOpenOption.CREATE, StandardOpenOption.APPEND)
				) {
			if (lines != null) {
				writer.write(lines);
				writer.newLine();
			}
			else {
				System.err.println("Null string passed for: " + path); // log magic 
				writer.newLine();
			}
			
		} catch (IOException eio) {
			// TODO: handle exception
			System.err.println("Failed to write to file: " + path);
			eio.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Somethign went wrong");
            e.printStackTrace();
		}
	}
	
	// Merge files, append strings of one file to another
	// Return nothing, create new file, overwrite file
	public static void mergeFiles(Path pathFile1, Path pathFile2, Path outFile3) {
		// Read
		List<String> lines1 = readFile(pathFile1);
		List<String> lines2 = readFile(pathFile2);
		
		// Combine
		List<String> lines3 = new ArrayList<String>();
		lines3.addAll(lines1);
		lines3.addAll(lines2);
		
		// Create file, overwrite
		try {
			Files.deleteIfExists(outFile3);
		} catch (IOException eio) {
			// TODO: handle exception
			System.err.println("Failed to create file: " + outFile3);
			eio.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Somethign went wrong");
            e.printStackTrace();
		}
		
		// Write 
		for (Iterator iterator = lines3.iterator(); iterator.hasNext();) {
			String line = (String) iterator.next(); // type safe ?
			appendToFile(outFile3, line);
		}
//		for (String line : lines3) {
//	        appendToFile(outFile3, line);
//	    }
	}
	
	// Awk all non-alphanumeric chars aka sanitize 
	// Return nothing, overwrite file
	public static void sanitizeFile(Path path) {
		List<String> lines = readFile(path);
		
		// Business model
		final String sanitizeChars = "\\$"; // escape metachar $N capturing group
		final String sanitizePattern = "[^a-zA-Z0-9]";
		List<String> linesSanitized = new ArrayList<String>();
		
		for (String line : lines) {
			String sanitized = line.replaceAll(sanitizePattern, sanitizeChars);
			linesSanitized.add(sanitized);
		}
		
		// Write
		try {
			Files.write(
					path, 
					linesSanitized, 
					StandardCharsets.UTF_8, 
					StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException eio) {
			// TODO: handle exception
			System.err.println("Failed to create file: " + path);
			eio.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Somethign went wrong");
            e.printStackTrace();
		}
	}
	
}
