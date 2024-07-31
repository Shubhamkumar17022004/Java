import java.util.*;
// import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check wether it is odd or even");
        int store = sc.nextInt();
        if (store % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.print("odd");
        }
    }
}