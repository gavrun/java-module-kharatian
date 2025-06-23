import java.util.Random;

public class ArrayUtils {

	/**
	 * Class does something with arrays
	 * @param param_name
	 * @param param_name
	 */
	
	public static boolean isSortedAscending(int[] array) {
        
		// Arrays with 0 or 1 elements considered sorted
		if (array == null || array.length < 2) {
            return true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
	
	public static void swapFirstAndLastIndex(int[] array) {
		// No need to swap
		if (array == null || array.length < 2) {
            return; 
        }

        int temp = array[0];
        
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
	
	public static int findFirstUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return array[i];
            }
        }
        return -1;
    }
	
	// Merge Sort
	public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }
	
	// Merge
	public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        // Merge temporary arrays back 
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
	
	public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // 0..99
        }
        return array;
    }
	
//	public static void printArray(int[] array) {
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if (i != array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }

}
