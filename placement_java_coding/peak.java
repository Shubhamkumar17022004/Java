import java.util.Scanner;
import java.util.Arrays;

class peak {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the element size");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of an element");
        size = sc.nextInt();
        int[] arr = new int[size];
        int store[] = peak(arr, size);
        System.out.print(Arrays.toString(store));
        int length = store.length;
        int store1 = mainlogic(store, length);
        System.out.println("Index value is"+ " " +store1);
    }

    public static int[] peak(int[] arr, int s) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s; i++) {
            System.out.println("Enter the element");

            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int mainlogic(int[] store, int n) {
        // System.out.println(store);
        if (n == 1) {
            return 0;
        } else if (store[0] > store[0 + 1]) {
            return 0;
        } else if (store[n - 1] > store[n - 2]) {
            return n - 1;
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (store[i] > store[i + 1] && store[i] > store[i - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}