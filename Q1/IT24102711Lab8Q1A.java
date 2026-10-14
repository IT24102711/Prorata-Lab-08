import java.util.Scanner;

public class IT24102711Lab8Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");

        // Input numbers into the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");

        // Print the array in reverse order
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        scanner.close();
    }
}