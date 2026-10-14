public class IT24102711Lab8Q2 {
    public static void main(String[] args) {
        // Initialize arrays A and B
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Calculate A + B and store in C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print array contents
        System.out.println("A Array Contents:");
        printArray(A);

        System.out.println("\nB Array Contents:");
        printArray(B);

        System.out.println("\n\nC Array Contents (A + B):");
        printArray(C);
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}