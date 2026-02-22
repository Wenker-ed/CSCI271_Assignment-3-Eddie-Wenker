/*************************************************************************
* Assignment 3 (Question 4) CSCI 271-001 Spring 2026
*
* Author: Eddie Wenker
* OS: Windows 11
* Compiler: javac 21.0.9
* Date: February 21, 2026
*
* Purpose
* This program uses a Fraction class to perform arithmetic operations
* on fractions including addition, subtraction, multiplication, division,
* negation, and exponentiation. It also simplifies fractions and handles
* special cases like zero and infinity.
**************************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Eddie Wenker
*************************************************************************/

import java.util.Scanner;

public class Assignment3Q4_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long N = 3124587134762173548L; // Example number to count digits in

        System.out.println("Enter a number to count digits in: ");
        long userN = input.nextLong();

        System.out.println("Enter the digit to count: ");
        int D = input.nextInt();

        int userHowMany = howManyDigits(userN, D);
        System.out.println("The digit " + D + " occurs " + userHowMany + " times in " + userN + "\n");

        int howMany = howManyDigits(N, D);
        System.out.println("The digit " + D + " occurs " + howMany + " times in " + N);

        input.close();
    }
    
    /*****************************<howManyDigits>****************************
    * Description: Recursively counts the occurrences of a digit in a number.
    *   
    * Parameters: N - the number to search in, D - the digit to count.
    *
    * Pre: The number and digit exist.
    *
    * Post: The count of occurrences is returned.
    *
    * Returns: The number of times the digit occurs in the number.
    *
    * Called by: main method.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int howManyDigits(long N, int D) {
        int count = 0;
        long runTime = String.valueOf(N).length();
        if (N > 0) { // The length of N will still be greater than for base case, so this will run until N is reduced to 0 (base case)
            System.out.println("This is one run (0 is base case): " + runTime);
        }
        // Base case: if N is 0, return 0
        else {
            System.out.println("Base case reached: " + N);
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
