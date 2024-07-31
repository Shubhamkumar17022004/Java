import java.util.Scanner;

public class vowelandconst {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter the any character");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        // System.out.println(ch);
        if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                || (ch == 'a' || ch == 'e' || ch == 'e' || ch == 'o' || ch == 'u')) {
            System.out.println("It's vowl");
        } else {
            System.out.println("const");
        }
    }

}
