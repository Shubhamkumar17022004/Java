// import java.util.Scanner;

import java.util.Scanner;

class how_to_create_array {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        System.out.println("These are example of array declaration" + " " + ar[4]);

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println("Example of an static array" + arr[i]);
        }

        
 //DYNAMIC ARRAY EXAMPLE


        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        size = sc.nextInt();
        int a[] = new int[size];

        for (int j = 0; j < size; j++) {
            a[j] = sc.nextInt();
        }
        System.out.println("printed array element");

        for (int k = 0; k < size; k++) {
            System.out.println(a[k]);
        }
    }
}