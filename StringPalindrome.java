import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String originalString = sc.nextLine();

        // Convert the string to lowercase to make the check case-insensitive
        String lowerCaseString = originalString.toLowerCase();

        // Initialize a variable to store the result
        String result = "is a palindrome.";

        // Check each character from the start and the end of the string
        int length = lowerCaseString.length();
        for (int i = 0; i < length / 2; i++) {
            if (lowerCaseString.charAt(i) != lowerCaseString.charAt(length - i - 1)) {
                result = "is not a palindrome.";
                break;
            }
        }

        // Output the result
        System.out.println(originalString + " " + result);

        // Close the scanner
        sc.close();
    }
}
