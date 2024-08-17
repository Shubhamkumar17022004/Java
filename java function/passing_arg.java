// import java.util.Scanner;

public class passing_arg {
    public static void main(String[] args) {
        // int a=2,b=10;  //here we can declare the datatype then we pass the value
        int store=sum(10, 20); //This way we can pass value directly 
        System.out.println(store);
    }

    public static int sum(int n1,int n2)   //here we shoud write int if we pass in value or whaever value we are passing
    { 
        int sum=n1+n2;
        return sum;
    }
 }
