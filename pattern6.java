public class pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
        //     for (int k = 1; k <= 2*i-1; k++) uncomment this and comment upper and lower comment for
        //     *
        //    *  *
        //  *   *  *
                System.out.print("*");
                // System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
