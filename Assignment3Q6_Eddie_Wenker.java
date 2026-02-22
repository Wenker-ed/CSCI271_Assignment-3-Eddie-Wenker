/*************************************************************************
* Assignment 3 (Question 6) CSCI 271-001 Spring 2026
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
        
        int sum = sumEven(A, count);
        System.out.println("The sum of the even numbers in the array is: " + sum);
        input.close();
    }

    /*****************************<sumEven>****************************
    * Description: Recursively calculates the sum of even numbers in an array.
    *   
    * Parameters: A - the array of integers, n - the number of elements to consider.
    *
    * Pre: The array and the number of elements exist.
    *
    * Post: The sum of even numbers is returned.
    *
    * Returns: The sum of even numbers in the array.
    *
    * Called by: main method.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int sumEven(int A[], int n) {
        System.out.println("This is one run (0 is base case): " + n);
        // Base case: reaches the first element in the array
        if (n == 0) {
            return 0;
        }

        // Recursive case: start at last number in array and recurse through all elements, checking each for being even, if so add to sum
        int sum = 0;
        if (A[n - 1] % 2 == 0) {
            sum = A[n - 1];
        }
        return sum + sumEven(A, n - 1);
    }
}
