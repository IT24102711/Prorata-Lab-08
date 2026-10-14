import java.util.Scanner;

public class IT24102711Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        System.out.println("Enter 6 Positive Numbers:");

        // Input validation loop
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = scanner.nextInt();

            if (input <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = input;
                count++;
            }
        }

        // Find maximum number
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print array contents
        System.out.println("\nArray Contents:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Print maximum number
        System.out.println("\nThe Maximum Number Entered: " + max);

        scanner.close();
    }
}