/*************************************************************************
* Assignment 3 (Question 1) CSCI 271-001 Spring 2026
*
* Author: Eddie Wenker
* OS: Windows 11
* Compiler: javac 21.0.9
* Date: February 21, 2026
*
* Purpose
* This program uses a function to recursively calculate the length of a string. 
* It prompts the user to enter a string and then displays the length of that string
* by calling the recursive function recursiveLength with the string as an argument.
*
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

public class Assignment3Q1_Eddie_Wenker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String s = input.nextLine(); // Read the entire line of input as a string and store it in variable s
        input.close(); // No more input is needed, so close the Scanner

        int length = recursiveLength(s); // Call the recursive function to find the length of the string and store the result in variable length
        System.out.println("Length of the string \"" + s + "\" is: " + length); // Print the length of the string
    }
    
    /*****************************<recursiveLength>****************************
    * Description: Recursively calculates the length of a string.
    *   
    * Parameters: string str - the string whose length is to be calculated.
    *
    * Pre: The string exists (it can be zero-length).
    *
    * Post: The length of the string is returned.
    *
    * Returns: The length of the string.
    *
    * Called by: main.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int recursiveLength(String str) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0; // At this point, the length of the string is calculated from the recursive calls, so return 0 to stop recursing.
        }

        // Recursive case: return 1 + length of the substring excluding the first character (n-1)
        return 1 + recursiveLength(str.substring(1));
        // n is the length of the string, and each recursive call reduces the length by 1 until it reaches 0 (base case).
        // The work inside each call is constant time.
        // The number of recursive calls is equal to the length of the string, leading to a time complexity of O(n).
        // T(n) = T(n-1) + O(1)
        // = T(0) + O(n)
        // = O(n)
    }
}