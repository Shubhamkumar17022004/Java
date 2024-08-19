import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        maxm(n1, n2, n3);
        minm(n1,n2,n3);
    }

    public static void maxm(int n1, int n2, int n3)
    {
        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println(n1+" "+"is greater");
            }
            else{
                System.out.println(n3+" "+"is greater");
            }
        }
        else if(n2>n3)
        {
            System.out.println(n2 + "is Greater");
        }
        else{
            System.out.println(n3 +" " +" is greater");
        }
    }

    public static void minm(int n1, int n2, int n3)
    {
        int minm=(n1>n2)?(n1>n3 ? n3 : n1) : (n2>n3 ? n3 : n1);
        System.out.println(" minm number is"+ " " +minm);
    }
}
