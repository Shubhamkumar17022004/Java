public class prime {
    public static void main(String[] args) {
        int store = checkprime(10);
        System.out.println(store);
    }

    public static int checkprime(int n1) {
        int count = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                return 1; // prime number
            } else {
                return 0; // not prime
            }
        
    }

}
