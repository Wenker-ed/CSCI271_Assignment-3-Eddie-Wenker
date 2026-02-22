import java.util.Scanner;

public class Assignment3Q6_Eddie_Wenker {

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
        
        int sum = sumEven(A, 0);
        System.out.println("The sum of the even numbers in the array is: " + sum);
        input.close();
    }

    public static int sumEven(int A[], int n) {
        // Base case: if the array is empty, return 0
        if (n == A.length - 1) {
            return 0;
        }

        // Recursive case: check the last element and recurse on the rest
        int sum = 0;
        if (A[n] % 2 == 0) {
            sum = A[n];
        }
        return sum + sumEven(A, n + 1);
    }
}
