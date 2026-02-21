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
    
    public static int OccurrencesCount(String str, char c) {
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