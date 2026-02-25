/*************************************************************************
* Assignment 3 (Question 5) CSCI 271-001 Spring 2026
*
* Author: Eddie Wenker
* OS: Windows 11
* Compiler: javac 21.0.9
* Date: February 21, 2026
*
* Purpose
* This program uses a function to recursively reverse a string. 
* It prompts the user to enter a string and then displays the reversed string
* by calling the recursive function reverseString with the string as an argument.
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

public class Assignment3Q5_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.println("Enter a string: "); // Prompt the user to enter a string
        String s = input.nextLine(); // Read the entire line of input as a string and store it in variable s

        String reversed = reverseString(s); // Call the recursive function to reverse the string and store the result in variable reversed
        System.out.println(s + " reversed: " + reversed); // Print the original string and the reversed string

        input.close(); // No more input is needed, so close the Scanner
    }

    /*****************************<reverseString>****************************
    * Description: Recursively reverses a string.
    *   
    * Parameters: string str - the string to reverse.
    *
    * Pre: The string exists (can be empty).
    *
    * Post: The reversed string is returned.
    *
    * Returns: The reversed string.
    *
    * Called by: main.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static String reverseString(String str) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";// At this point, the reversed string is determined from the recursive calls, so return an empty string to stop recusing.
        }

        // Recursive case: return the last character + reverse of the substring excluding the last character (n-1)
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        // n is the length of the string, and each recursive call reduces the length by 1 until it reaches 0 (base case).
        // The work inside each call is constant time.
        // The number of recursive calls is equal to the length of the string, leading to a time complexity of O(n).
        // T(n) = T(n-1) + O(1)
        // = T(0) + O(n)
        // = O(n)
    }
    
}
