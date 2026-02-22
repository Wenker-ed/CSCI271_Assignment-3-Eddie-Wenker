/*************************************************************************
* Assignment 3 (Question 3) CSCI 271-001 Spring 2026
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
        int maxValue = max(A, count);
        System.out.println("The maximum value in the array is: " + maxValue);
    }
    
    /*****************************<max>****************************
    * Description: Recursively finds the maximum value in an array.
    *   
    * Parameters: A - the array of integers, n - the number of elements to consider.
    *
    * Pre: The array and the number of elements exist.
    *
    * Post: The maximum value in the array is returned.
    *
    * Returns: The maximum value in the array.
    *
    * Called by: main method.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int max(int A[], int n) {
        System.out.println("This is one run (0 is base case): " + n);
        // Base case: if reach the last element, return it
        if (n == 0) {
            return A[n];
        }
        // Recursive case: find the max of the rest of the array 
        int maxOfRest = max(A, n - 1);
        if (A[n] > maxOfRest) {
            return A[n];
        } else {
            return maxOfRest;
        }
    }
}

