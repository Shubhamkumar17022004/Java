import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("you enter the number" + a + " " + b);

        System.out.println(
                "please provide what operation you want to perform for addition press 1 for subtaction press 2 and for mult 3 and for divie press 4");
        int input = sc.nextInt();
        if (input == 1) {
            int sum = a + b;
            System.out.println(sum);
        } else if (input == 2) {
            int sub = a - b;
            System.out.println(sub);
        } else if (input == 3) {
            int mul = a * b;
            System.out.println(mul);
        } else {
            int div = a / b;
            System.out.println(div);
        }
    }

}