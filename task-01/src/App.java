import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // 1
        System.out.println("Print strings line by line:");
        System.out.println("Me");
        System.out.println("learn");
        System.out.println("code");
        System.out.println("Java.");

        // 2
        System.out.println("Calculate expressions:");
        double result1 = (46 + 10) * ((double)10 / 3); 
        int result2 = 29 * 4 * -15;
        System.out.println(result1);
        System.out.println(result2);

        // 3
        System.out.println("Calculate numbers:");
        double number = 10500;
        double result3 = (number / 10) / 10;
        System.out.println(result3);

        // 4
        System.out.println("Calculate floating point numbers:");
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result4 = a * b * c;
        System.out.println(result4);

        // 5
        System.out.println("Read and print integers from input:");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);

        // 6
        System.out.println("Check parity and range of a number:");
        int bValue = scanner.nextInt();
        if (bValue % 2 != 0) {
            System.out.println("Odd");
        } else if (bValue > 100) {
            System.out.println("Out of bounds");
        } else {
            System.out.println("Even");
        }

        scanner.close();
        
    }
}
