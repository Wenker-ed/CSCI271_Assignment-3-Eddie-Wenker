import java.util.Scanner;

public class Assignment3Q3_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int A[] = new int[100]; // Create an array to store the entered numbers

        while (true) 
        {
            System.out.print("Enter an integer or ('q' to quit): ");
            String line = input.nextLine();

            if (line.equals("q")) {
                break;
            }

            int num = Integer.parseInt(line);
            A[count] = num; // Store the entered number in the array
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(i + ": " + A[i]);
        }

        input.close();
        int maxValue = max(A, 0);
        System.out.println("The maximum value in the array is: " + maxValue);
    }
    
    public static int max(int A[], int n) {
        // Base case: if reach the last element, return it
        if (n == A.length - 1) {
            return A[n];
        }
        // Recursive case: find the max of the rest of the array 
        int maxOfRest = max(A, n + 1);
        if (A[n] > maxOfRest) {
            return A[n];
        } else {
            return maxOfRest;
        }
    }
}

