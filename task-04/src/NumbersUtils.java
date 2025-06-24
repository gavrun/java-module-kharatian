
public class NumbersUtils {

	/**
	 * Class does something with numbers
	 * @param param_name
	 * @param param_name
	 */
	
	public static void printOddNumbersInRange(int start, int end) {
		
		if (start > end) {
			System.out.println("Ewww, wrong range order.");
			return;
		}
		
		System.out.println("Odd:");
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void printDivisibleNumbers(int start, int end) {
	        
		System.out.println("Divisible by 3:");
//		for (int i = start; i <= end; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Divisible by 5:");
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Divisible by 3 and 5:");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
	
	public static boolean isSumEqual(int a, int b, int c) {
        return (a + b) == c;
    }
	
	public static boolean isIncreasingOrder(int first, int second, int third) {
        return (second > first) && (third > second);
    }
	
	public static boolean isThreeAtEdges(int[] array) {
        if (array == null || array.length < 2) {
            System.out.println("Ewww, array length must be at least 2.");
            return false;
        }

        return array[0] == 3 || array[array.length - 1] == 3;
    }
	
	public static boolean containsOneOrThree(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Ewww, array is empty.");
            return false;
        }

        for (int number : array) {
            if (number == 1 || number == 3) {
                return true;
            }
        }
        return false;
    }
	
}
