import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int a, b,result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number first then enter the power");
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
             result = a*result;
        }
        System.out.println(result);
    }
}
