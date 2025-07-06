import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		List<String> valueNames = List.of("John", "Charlie", "Alice", "Bob", "John", "Alex", "David", "Alexander", "Charlie");
		
		Collection<String> valueNamesOrd = CollectionUtils.addToSetUnordered(valueNames);
		System.out.println(valueNamesOrd);
		
		Collection<String> valueNamesUnOrd = CollectionUtils.addToSetOrdered(valueNames);
		System.out.println(valueNamesUnOrd);
		System.out.println();
		
		// 2
		final Integer ELEMENTS_NUM = 1000000;
		final Integer ACCESS_TIMES = 1000;
		
		// warm up JVM to prevent optimization
		ListUtils.fillListMeasured(new ArrayList<>(), 10000);
		ListUtils.fillListMeasured(new LinkedList<>(), 10000);
		
		// ArrayList
		List<String> arrayList = new ArrayList<>();
		Long filltimeAL = ListUtils.fillListMeasured(arrayList, ELEMENTS_NUM);
		Long accesstimeAL = ListUtils.accessListRandomMeasured(arrayList, ACCESS_TIMES);
		
		// LinkedList
		List<String> linkedList = new LinkedList<>();
		Long filltimeLL = ListUtils.fillListMeasured(linkedList, ELEMENTS_NUM);
		Long accesstimeLL = ListUtils.accessListRandomMeasured(linkedList, ACCESS_TIMES);
		
		// Measurements
		System.out.println("ArrayList fill time:   " + filltimeAL + " ns");
        System.out.println("ArrayList access time: " + accesstimeAL + " ns");
        System.out.println("LinkedList fill time:   " + filltimeLL + " ns");
        System.out.println("LinkedList access time: " + accesstimeLL + " ns");
        System.out.println();
        
        // 3
        // User POJO class fully defined for Map<User, Integer>
        // User naive class for Map<String, Integer> alternatively Object not overridden, scoreMap.put("Alice", 1200);
        
        // 4
        
        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");
        
        // Assign scores
        Map<User, Integer> scoreMap = new HashMap<>();
        scoreMap.put(user1, 1200);
        scoreMap.put(user2, 950);
        scoreMap.put(user3, 1450);
        
        // Read name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String inputName = scanner.nextLine();
        
        // Search user
        User searchUser = new User(inputName);
        
        if (scoreMap.containsKey(searchUser)) {
			Integer score = scoreMap.get(searchUser);
			System.out.println("User: " + inputName + ", Score: " + score);
		} else {
			System.out.println("User not found");
		}
        
        scanner.close();
	}

}
