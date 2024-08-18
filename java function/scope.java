public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String sh="shubham";
        random(a,b);
        {
            //BLOCK LEVEL SCOPE

            // int c=78;
            // int d=99;
             a=100;
             System.out.println(a); //output 100

             sh= "Monu";
             System.out.println(sh);
            //VALUES INITIALISED IN THIS BLOCK,WILL REMAIN IN BLOCK CAN'T USE OUTSIDE THE BLOCK
        }
        System.out.println(a);  // output 100
        System.out.println(sh); //GUESS OUTPUT ??
    }
    static void random(int n1,int n2)
    { 
        int num=67;      /* HERE THIS NUM IS AN FUNCTIONAL SCOPE THIS NUM CAN'T ACCESS OUTSIDE THE FUNCTION */
        System.out.println(num);
    }
}
