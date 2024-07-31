import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        {
            char ch;
            System.out.println("Enter the any character to found its ascii value");
            Scanner sc=new Scanner(System.in);
            ch=sc.next().charAt(0);
            int a=ch;
            System.out.println(a);
        }
    }
}
