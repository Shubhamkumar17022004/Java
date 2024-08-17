import java.util.Scanner;
public class returnn{
    public static void main(String[] args) {
        int store=sum(); 
        System.out.println(store);
    }
    public static int sum()
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no 1");
        int num1=in.nextInt();

        System.out.println("Enter the no 2");
        int num2=in.nextInt();

        int sum=num1+num2;
        // System.out.println("The sum = " + sum);

        return sum;
    }
}
