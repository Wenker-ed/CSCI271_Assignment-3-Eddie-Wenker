/*************************************************************************
* Assignment 3 (Question 4) CSCI 271-001 Spring 2026
*
* Author: Eddie Wenker
* OS: Windows 11
* Compiler: javac 21.0.9
* Date: February 21, 2026
*
* Purpose
* This program uses a function to recursively count the occurrences of a digit in a number.
* It prompts the user to enter a number and a digit, then displays how many times that
* digit occurs in the number by calling the recursive function howManyDigits
* with the number and digit as arguments. It also demonstrates the function with a predefined number.
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
        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        long N = 3124587134762173548L; // Example number to count digits in

        System.out.println("Enter a number to count digits in: "); // Prompt the user to enter a number
        long userN = input.nextLong(); // Read the user's input as a long integer and store it in variable userN

        System.out.println("Enter the digit to count: "); // Prompt the user to enter a digit to count in the number
        int D = input.nextInt(); // Read the user's input as an integer and store it in variable D (the digit to count)

        int userHowMany = howManyDigits(userN, D); // Call the recursive function to count the occurrences of the digit
        // in the user's number and store the result in variable userHowMany
        System.out.println("The digit " + D + " occurs " + userHowMany + " times in " + userN + "\n"); // Print the result of counting the digit in the user's number

        int howMany = howManyDigits(N, D); // Call the recursive function to count the occurrences of the digit
        //  in the example number N and store the result in variable howMany
        System.out.println("The digit " + D + " occurs " + howMany + " times in " + N); // Print the result of counting the digit in the example number N

        input.close(); // No more input is needed, so close the Scanner
    }
    
    /*****************************<howManyDigits>****************************
    * Description: Recursively counts the occurrences of a digit in a number.
    *   
    * Parameters: long N - the number to search in, int D - the digit to count.
    *
    * Pre: The number and digit exist.
    *
    * Post: The count of occurrences is returned.
    *
    * Returns: The number of times the digit occurs in the number.
    *
    * Called by: main.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int howManyDigits(long N, int D) {
        int count = 0; // Initialize a counter to keep track of the occurrences of the digit D in the number N

        // Base case: if N is 0 (entire N has been searched), return 0
        if (N == 0) {
            return 0; // At this point, the count of occurrences is calculated from the recursive calls, so return 0 to stop recursing.
        }

        // Recursive case: check the last digit and recurse on the rest
        int lastDigit = (int)(N % 10); // Get the last digit of N as an integer by taking the remainder when N is divided by 10
        if (lastDigit == D) { // if the last digit matches the digit we are counting
            count++; // increment the count
        }
        return count + howManyDigits(N / 10, D); // Return the count for this digit of N plus the count from the rest of the number (N divided by 10 removes the last digit)
        // n is the number of digits in N, and each recursive call reduces the number of digits by 1 until it reaches 0 (base case).
        // The work inside each call is constant time.
        // The number of recursive calls is equal to the number of digits in N, leading to a time complexity of O(n).
        // T(n) = T(n-1) + O(1)
        // = T(0) + O(n)
        // = O(n)
    }
    
}
