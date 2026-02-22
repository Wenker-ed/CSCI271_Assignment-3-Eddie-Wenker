import java.util.Scanner;

public class Assignment3Q4_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to count digits in: ");
        long N = input.nextLong();
        System.out.println("Enter the digit to count: ");
        int D = input.nextInt();

        int howMany = howManyDigits(N, D);
        System.out.println("The digit " + D + " occurs " + howMany + " times in " + N);
        input.close();
    }
    
    public static int howManyDigits(long N, int D) {
        int count = 0;
        // Base case: if N is 0, return 0
        if (N == 0) {
            return 0;
        }
        // Recursive case: check the last digit and recurse on the rest
        int lastDigit = (int)(N % 10);
        if (lastDigit == D) {
            count = 1;
        }
        return count + howManyDigits(N / 10, D);
    }
    
}
