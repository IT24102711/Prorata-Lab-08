import java.util.Scanner;

public class IT24102711Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        System.out.println("Enter Student IDs for 8 students:");

        // Input validation loop for student IDs
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int studentId = scanner.nextInt();

            if (studentId <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = studentId;
                count++;
            }
        }

        // Ask user to enter a Student ID to search
        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = scanner.nextInt();

        // Search for the student ID
        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        // Display search result
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();
    }
}