/*************************************************************************
* Assignment 3 (Question 2) CSCI 271-001 Spring 2026
*
* Author: Eddie Wenker
* OS: Windows 11
* Compiler: javac 21.0.9
* Date: February 21, 2026
*
* Purpose
* This program uses a function to recursively count the occurrences of a character in a string.
* It prompts the user to enter a string and a character, then displays how many times that 
* character occurs in the string by calling the recursive function OccurrencesCount 
* with the string and character as arguments.
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

public class Assignment3Q2_Eddie_Wenker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String s = input.nextLine(); // Read the entire line of input as a string and store it in variable s

        System.out.print("Enter a character: "); // Prompt the user to enter a character
        char c = input.next().charAt(0); // Read the next input as a string and get the first character of that string, storing it in variable c
        input.close(); // No more input is needed, so close the Scanner

        int Occurrences = OccurrencesCount(s, c); // Call the recursive function to count the occurrences of the character in the string and store the result in variable Occurrences
        System.out.println("\'" + c + "\' occurs " + Occurrences + " times in \"" + s + "\"");
    }
    
    /*****************************<OccurrencesCount>****************************
    * Description: Recursively counts the occurrences of a character in a string.
    *   
    * Parameters: string str - the string to search in, char c - the character to count.
    *
    * Pre: The string and character exist.
    *
    * Post: The count of occurrences as an integer is returned.
    *
    * Returns: The number of times the character occurs in the string.
    *
    * Called by: main.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int OccurrencesCount(String str, char c) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0; // At this point, the count of occurrences is calculated from the recursive calls, so return 0 to stop recusing.
        }
        // if the string is not empty, check if the first character matches the character we are counting
        int count = 0; // Initialize the character count to 0 for this call
        if (str.charAt(0) == c) {
            count++; // increment the count
        }
        // Recursive case: return the count for this character plus the count from the rest of the string
        return count + OccurrencesCount(str.substring(1), c);
        // n is the length of the string, and each recursive call reduces the length by 1 until it reaches 0 (base case).
        // The work inside each call is constant time.
        // The number of recursive calls is equal to the length of the string, leading to a time complexity of O(n).
        // T(n) = T(n-1) + O(1)
        // = T(0) + O(n)
        // = O(n)
    }

}
