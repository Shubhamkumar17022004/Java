public class pattern4 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) // outer loop
        {
            for (int j = 5; j >= i; j--) // inner loop
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


