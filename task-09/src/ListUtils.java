import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListUtils {

	// Fill list with elements
	public static void fillList(List<String> list, Integer size) {
		for (int i = 0; i < size; i++) {
			list.add("Item " + i);
		}
	}
	
	// Access elements
	public static void accessListRandom(List<String> list, Integer times) {
		Random random = new Random();
		Integer size = list.size();
		
		Integer dummy = 0; // prevent optimization
		
		for (int i = 0; i < times; i++) {
			String s = list.get(random.nextInt(size));
			
			dummy += s.length(); // prevent optimization
		}
//		if (dummy == 0) System.out.println("Dummy: " + dummy);
	}
	
	// Fill list with elements and measure time taken
	public static Long fillListMeasured(List<String> list, Integer size) {
		Long start = System.nanoTime();
		fillList(list, size);
		return System.nanoTime() - start;
	}
	
	// Access elements and measure time taken
	public static Long accessListRandomMeasured(List<String> list, Integer times) {
		Long start = System.nanoTime();
		accessListRandom(list, times);
		return System.nanoTime() - start;
	}
}
