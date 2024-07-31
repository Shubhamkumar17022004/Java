import java.util.Scanner;

public class greatest3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 no");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       int greatest= (a>b) ? (a>c ? a: b):(c>b ? c:b );
        System.out.println(greatest);
    }
}
