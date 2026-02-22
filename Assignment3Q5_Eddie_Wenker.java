import java.util.Scanner;

public class Assignment3Q5_Eddie_Wenker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        String reversed = reverseString(s);
        System.out.println(s + " reversed is " + reversed);

        input.close();
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";
        }
        // Recursive case: return the last character + reverse of the substring excluding the last character
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
    
}
