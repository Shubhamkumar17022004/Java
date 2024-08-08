import java.util.Scanner;

class switchh{
    public static void main(String[] args)
    {
        int n;
        // System.out println("Enter the number");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(n);
        switch(n)
        {
            case 1:
            System.out.println("monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;
            
            default:
            System.out.println("wrong input");
        }
    }

}