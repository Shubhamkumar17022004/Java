import java.util.Scanner;

public class avrg {
    public static void main(String[] args) {
        String subj1, subj2, subj3, subj4, subj5;
        int subj6, subj7, subj8, subj9, subj10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 5 subject name");
        subj1 = sc.nextLine();
        subj2 = sc.nextLine();
        subj3 = sc.nextLine();
        subj4 = sc.nextLine();
        subj5 = sc.nextLine();

        System.out.print("Enter the marks obtained in" + "\n" + subj1 + "\n");
        subj6 = sc.nextInt();
        System.out.print("Enter the marks obtained in " + "\n" + subj2 + "\n");
        subj7 = sc.nextInt();
        System.out.print("Enter the marks obtained in " + "\n" + subj3 + "\n");
        subj8 = sc.nextInt();
        System.out.print("Enter the marks obtained in " + "\n" + subj4 + "\n");
        subj9 = sc.nextInt();
        System.out.print("Enter the marks obtained in " + "\n" + subj5 + "\n");
        subj10 = sc.nextInt();

        int sum=subj6+subj7+subj8+subj9+subj10;
        float averg=sum/5;
        System.out.println(averg);
        // System.out.println(average);

       
       
       
       
    }
}
