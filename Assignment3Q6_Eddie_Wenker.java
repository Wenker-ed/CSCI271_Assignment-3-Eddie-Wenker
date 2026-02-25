/*************************************************************************
* Assignment 3 (Question 6) CSCI 271-001 Spring 2026
*
* Author: Eddie Wenker
* OS: Windows 11
* Compiler: javac 21.0.9
* Date: February 21, 2026
*
* Purpose
* This program uses a function to recursively calculate the sum of even numbers in an array.
* It prompts the user to enter integers until they choose to quit, storing the integers in an
* array, and then displays the sum of the even numbers in that array by calling the recursive function sumEven
* with the array and the number of elements as arguments.
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
        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        int count = 0; // Variable to keep track of the number of integers entered
        int A[] = new int[100]; // Create an array to store the entered numbers

        while (true) // start a while loop to continuously prompt the user for input until they choose to quit
        {
            System.out.print("Enter an integer or ('q' to quit): "); // Prompt the user to enter an integer or 'q' to quit
            String line = input.nextLine();// Read the user's input as a string and store it in variable line

            if (line.equals("q")) { // If the user enters 'q', break out of the loop to stop accepting input
                break;
            }

            int num = Integer.parseInt(line);// Convert the entered string to an integer and store it in variable num
            A[count] = num; // Store the entered number in the array at the index corresponding to the count
            count++; // Increment the count to keep track of how many integers have been entered
        }
        
        int sum = sumEven(A, count); // Call the recursive function to calculate the sum of even numbers in the array and store the result in variable sum
        System.out.println("The sum of the even numbers in the array is: " + sum); // Print the sum of the even numbers in the array to the user
        input.close(); // No more input is needed, so close the Scanner
    }

    /*****************************<sumEven>****************************
    * Description: Recursively calculates the sum of even numbers in an array.
    *   
    * Parameters: int array A - the array of integers, int n - the number of elements to consider.
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
        // Base case: reaches n = 0 which means the entire array has been searched, return 0
        if (n == 0) {
            return 0; // At this point, the sum of even numbers is calculated from the recursive calls, so return 0 to stop recursing.
        }

        // Recursive case: start at last number in array and recurse through all elements, checking each for being even, if so add to sum
        int sum = 0; // Initialize a variable to keep track of the sum of even numbers in the array
        if (A[n - 1] % 2 == 0) { // if the last number in the current recursive call is even
            sum = A[n - 1]; // add the last number to the sum
        }
        return sum + sumEven(A, n - 1); // Return the sum for this element of the array plus the sum from the rest of the array (n-1)
        // n is the number of elements in the array, and each recursive call reduces the number of elements by 1 until it reaches 0 (base case).
        // The work inside each call is constant time.
        // The number of recursive calls is equal to the number of elements in the array, leading to a time complexity of O(n).
        // T(n) = T(n-1) + O(1)
        // = T(0) + O(n)
        // = O(n)
    }
}
