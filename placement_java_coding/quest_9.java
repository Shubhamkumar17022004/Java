import java.util.Arrays;

public class quest_9 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        int maxLength = 1;
        int currentLength = 1;

        // Step 2: Traverse the sorted array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // If it's the same as the previous element, skip it
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                // If it's consecutive, increment the current sequence length
                currentLength++;
            } else {
                // If it's not consecutive, reset the current sequence length
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // After the loop, check the last sequence
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));
    }
}
