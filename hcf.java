import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        int no1,no2,temp=1;
        System.out.println("Enter the number to find its hcf");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();
        int store=(no1>no2)?no2:no1;
        // System.out.println(store);
        for(int i=1;i<=store;i++)
        {
            if(no1%i==0 && no2%i==0)
            {
                temp=i;
            }
        }
        System.out.println(temp);
    }
}
