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
    
    public static int recursiveLength(String str) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        // Recursive case: return 1 + length of the substring excluding the first character
        return 1 + recursiveLength(str.substring(1));
    }
}//Calculate Running Time!