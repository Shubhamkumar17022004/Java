// Kunal is allowed to go out with his friends only on the even days of a given month.
//  Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class KunalKushwahLoop03QuestionNo_27 {
    public static void main(String[] args) {
        int yr;
        String month;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        yr = sc.nextInt();
        
        // Determine if it's a leap year
        boolean isLeapYear = (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0);

        // Prompt user for month
        System.out.println("Enter the month to see when you can go out (e.g., jan, feb, mar):");
        month = sc.next().toLowerCase(); // Convert month to lowercase to avoid case sensitivity issues

        int daysInMonth = 0;

        // Determine the number of days in the given month
        switch (month) {
            case "jan": case "mar": case "may": case "jul": case "aug": case "oct": case "dec":
                daysInMonth = 31;
                break;
            case "apr": case "jun": case "sep": case "nov":
                daysInMonth = 30;
                break;
            case "feb":
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                System.out.println("Please enter a valid month.");
                return; // Exit the program if the month is invalid
        }

        int count = 0;

        // Count the even days
        for (int i = 1; i <= daysInMonth; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("In " + month + ", Kunal can go out on " + count + " days.");
    }
}

