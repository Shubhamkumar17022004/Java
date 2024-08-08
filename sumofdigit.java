import java.util.Scanner;

public class sumofdigit {
  public static void main(String[] args) {
    int n,no,sum=0;
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    while (n!=0) {
        no=n%10;
        sum=sum+no;
        n=n/10;
    }
    System.out.println(sum);
  }  
}
