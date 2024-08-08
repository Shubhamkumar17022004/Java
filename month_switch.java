import java.util.Scanner;

public class month_switch {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the any number between 1 to 12 to find particular mont");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("jan");
            break;

            // case 1:
            // System.out.println("jan");
            // break;

            // case 1:
            // System.out.println("jan");
            // break;

            case 2:
            System.out.println("jan");
            break;

            case 3:
            System.out.println("march");
            break;

            case 4:
            System.out.println("a");
            break;

            case 5:
            System.out.println("june");
            break;

            case 6:
            System.out.println("july");
            break;

            case 7:
            System.out.println("aug");
            break;

            case 8:
            System.out.println("sept");
            break;

            case 9:
            System.out.println("oct");
            break;

            case 11:
            System.out.println("nov");
            break;

            case 12:
            System.out.println("Dec");
            break;

            default:
            System.out.print("you Enter incorrect");
        }
    }
}
