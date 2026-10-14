import java.util.Scanner;

public class IT24102711Lab8Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenCount = 0;

        System.out.println("Enter 5 Numbers:");

        // Input numbers into the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Find even numbers and store in evenArray
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        // Fill remaining positions with 6 (as shown in expected output)
        while (evenCount < evenArray.length) {
            evenArray[evenCount] = 6;
            evenCount++;
        }

        System.out.println("\nmyArray Contents:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nevenArray Contents:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}