public class pass_by_value_and_pass_by_reference {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int result = sum(arr);
        System.out.println("Modified value of arr[0]: " + arr[0]);
        System.out.println("Returned value: " + result);
        // System.out.println(arr);
        int subtract=sub(10,5);
        System.out.println("value of subtract is" + subtract);
    }

    public static int sum(int[] arr) { // call by reference and orignal value will be change
        arr[0] = 5;
        return arr[0];
    }

    public static int sub(int n1, int n2) //orignal value not change
    {
        int sub=n1-n2;
        return sub;
    }
}
