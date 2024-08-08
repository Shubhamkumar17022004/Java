public class pattern11_alpha {
    public static void main(String[] args) {
        char count='A';
        for (char i = 'A'; i <= 'F'; i++) {
            for (char j = 'A'; j <= i; j++) {
                
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
