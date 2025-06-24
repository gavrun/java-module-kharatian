import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		
		NumbersUtils.printOddNumbersInRange(1, 99);
		
		// 2
		
		NumbersUtils.printDivisibleNumbers(1, 100);
		
		// 3
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int firstNum = scanner.nextInt();
		System.out.print("Enter 2nd number: ");
		int secondNum = scanner.nextInt();
		System.out.print("Enter 3rd number: ");
		int thirdNum = scanner.nextInt();
		
		boolean test1 = NumbersUtils.isSumEqual(firstNum, secondNum, thirdNum);
		System.out.println("Sum of two equals to third: " + test1);
		
//		scanner.close();
		
		// 4
				
		System.out.print("Enter 1st number: ");
		int firstNum2 = scanner.nextInt();
		System.out.print("Enter 2nd number: ");
		int secondNum2 = scanner.nextInt();
		System.out.print("Enter 3rd number: ");
		int thirdNum2 = scanner.nextInt();
		
		boolean test2 = NumbersUtils.isIncreasingOrder(firstNum2, secondNum2, thirdNum2);
		System.out.println("Numbers in increasing order: " + test2);
		
//		scanner.close();
		
		// 5
		
		int[] array = {3, -3, 7, 1, 5, 4, 3};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		
		boolean test3 = NumbersUtils.isThreeAtEdges(array);
		System.out.println("Three is at first or last index: " + test3);
		
		// 6
		
		boolean test4 = NumbersUtils.containsOneOrThree(array);
		System.out.println("Three or five: " + test4);
		
		int[] array2 = {2, 4, 5, -6, 5, 7};
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
		System.out.println();
		
		boolean test5 = NumbersUtils.containsOneOrThree(array2);
		System.out.println("Three or five: " + test5);
		
		// 7
		
		int[] array3 = {1, 3, 5, 7, 9};
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ", ");
		}
		System.out.println();
		
		System.out.println("Array sorted ASC ?");
		if (ArrayUtils.isSortedAscending(array3)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
		
		// 8
		
		System.out.print("Enter array length: ");
		int length = scanner.nextInt();
		while (length <= 0) {
            System.out.println("Array length must be positive. Setting default: 1");
            length = 1;
        }
		int[] array4 = new int[length];
		System.out.println("Input number to the array: ");
		for (int i = 0; i < length; i++) {
			array4[i] = scanner.nextInt();
        }
		System.out.print("Result (formatted): [");
		for (int i = 0; i < (array4.length - 1); i++) {
			System.out.print(array4[i] + ", ");
//			if (i != length - 1) {
//                System.out.print(", ");
//            }
		}
		System.out.println(array4[array4.length - 1] + "]");
		
		// 9
		
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + ", ");
		}
		System.out.println();
		ArrayUtils.swapFirstAndLastIndex(array4);
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + ", ");
		}
		System.out.println();
		
		// 10
		
		int[] array5 = {1, 2, 3, 1, 2, 4};
		for (int i = 0; i < array5.length; i++) {
			System.out.print(array5[i] + ", ");
		}
		System.out.println();
		
		int unique = ArrayUtils.findFirstUnique(array5);
		if (unique == -1) {
			System.out.println("No unique values");
		} else {
			System.out.println("Unique: " + unique);
		}
		
		// 11
		
        System.out.print("Enter array length: ");
		int length2 = scanner.nextInt();
		while (length2 <= 1) {
            System.out.println("Too short to sort. Setting default: 2");
            length2 = 2;
        }
		int[] array6 = ArrayUtils.generateRandomArray(length2);
		for (int i = 0; i < array6.length; i++) {
			System.out.print(array6[i] + ", ");
		}
		System.out.println();
		
		ArrayUtils.mergeSort(array6, 0, array6.length - 1);
		
		System.out.println("Sorted.");
		for (int i = 0; i < array6.length; i++) {
			System.out.print(array6[i] + ", ");
		}
		
		scanner.close();
		
		// 12
	}
}
