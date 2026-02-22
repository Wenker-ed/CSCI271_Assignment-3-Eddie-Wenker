/*************************************************************************
* Assignment 3 (Question 1) CSCI 271-001 Spring 2026
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

public class Assignment3Q1_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        input.close();

        int length = recursiveLength(s);
        System.out.println("Length of the string \"" + s + "\" is: " + length);
    }
    
    /*****************************<recursiveLength>****************************
    * Description: Recursively calculates the length of a string.
    *   
    * Parameters: str - the string whose length is to be calculated.
    *
    * Pre: The string exists.
    *
    * Post: The length of the string is returned.
    *
    * Returns: The length of the string.
    *
    * Called by: main method.
    * Calls: It calls itself recursively.
    ************************************************************************/
    public static int recursiveLength(String str) {
        int runTime = str.length();
        System.out.println("This is one run (0 is base case): " + runTime);
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Recursive case: return 1 + length of the substring excluding the first character
        return 1 + recursiveLength(str.substring(1));
    }
}//Calculate Running Time!