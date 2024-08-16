// Write a program to print the sum of negative numbers, sum of positive even numbers
//  and the sum of positive odd numbers from a list of numbers (N) entered by the user.
//   The list terminates when the user enters a zero.

import java.util.Scanner;

public class kunalkushwah_loop03_questionno_28 {
    public static void main(String[] args) {
        int num, sumNegative = 0, sumEven = 0, sumOdd = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (positive or negative). Enter 0 to terminate:");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                sumNegative += num;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumEven);
        System.out.println("Sum of positive odd numbers: " + sumOdd);
    }
}
