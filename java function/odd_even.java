public class odd_even {
    public static void main(String[] args) {
        int store=oddevencheck(5);
        System.out.println(store);
    }

    public static int oddevencheck(int n1)
    {
        if(n1%2==0)
        {
            return 1; //true
        }
        else{
            return 0;    //false   
          }
    }
}
