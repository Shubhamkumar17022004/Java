import java.util.Scanner;

public class armstrong_between {
    public static void main(String[] args) {
        int r1, r2, rev;
        System.out.println("enter the  range from r1 to r2");
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        for (int i = r1; i <= r2; i++) {
            int store = 0;
            int temp = i;
            while (temp != 0) {
                rev = temp % 10;
                store = store + rev * rev * rev;
                temp = temp / 10;
            }
            if (i == store) {
                System.out.println("Armstrong numbers are" +" " +i);
            }
        }
    }
}
