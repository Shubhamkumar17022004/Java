// public class MergeSortedArrays {
//     public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int[] mergedArray = new int[n1 + n2];

//         int i = 0; // Pointer for arr1
//         int j = 0; // Pointer for arr2
//         int k = 0; // Pointer for mergedArray

//         // Traverse both arrays and add smaller element to mergedArray
//         while (i < n1 && j < n2) {
//             if (arr1[i] < arr2[j]) {
//                 mergedArray[k++] = arr1[i++];
//             } else {
//                 mergedArray[k++] = arr2[j++];
//             }
//         }

//         // If there are remaining elements in arr1, append them
//         while (i < n1) {
//             mergedArray[k++] = arr1[i++];
//         }

//         // If there are remaining elements in arr2, append them
//         while (j < n2) {
//             mergedArray[k++] = arr2[j++];
//         }

//         return mergedArray;
//     }

//     public static void main(String[] args) {
//         int[] array1 = {1, 3, 5, 7};
//         int[] array2 = {2, 4, 6, 8};

//         int[] mergedArray = mergeSortedArrays(array1, array2);

//         // Print the merged array
//         System.out.print("Merged Array: ");
//         for (int num : mergedArray) {
//             System.out.print(num + " ");
//         }
//     }
// }

import java.util.Arrays;

public class quest_10 {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5 };
        int[] array2 = { 2, 84, 6 };

        // Create the merged array
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from array1
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from array2
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Print the sorted merged array
        System.out.println("Sorted Merged Array:");
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
    }
}
