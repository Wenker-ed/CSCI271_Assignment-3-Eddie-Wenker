/*************************************************************************
* Assignment 3 (Question 2) CSCI 271-001 Spring 2026
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

public class Assignment3Q2_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        input.close();

        int Occurrences = OccurrencesCount(s, c);
        System.out.println("\'" + c + "\' occurs " + Occurrences + " times in \"" + s + "\"");
    }
    
    /*****************************<OccurrencesCount>****************************
    * Description: Recursively counts the occurrences of a character in a string.
    *   
    * Parameters: str - the string to search in, c - the character to count.
    *
    * Pre: The string and character exist.
    *
    * Post: The count of occurrences is returned.
    *
    * Returns: The number of times the character occurs in the string.
    *
    * Called by: main method.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int OccurrencesCount(String str, char c) {
        int runTime = str.length();
        System.out.println("This is one run (0 is base case): " + runTime);
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        // Recursive case: check the first character and add the count from the rest of the string
        int count = 0;
        if (str.charAt(0) == c) {
            count++;
        }
        return count + OccurrencesCount(str.substring(1), c);
    }

    public static String recursiveReverse(String str) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";
        }
        // Recursive case: return the last character + reverse of the substring excluding the last character
        return str.charAt(str.length() - 1) + recursiveReverse(str.substring(0, str.length() - 1));
    }
}//Calculate Running Time!