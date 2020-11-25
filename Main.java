import java.Arrays;
import java.lang.reflect.Array;

class gnomeSort {
    void gnomeSort(int[] nums) {
        int i = 1;
        int j = 2;

        while (i < nums.length) {
            if (nums[n - 1] <= nums[i]) {
                i = j;
                j++;
            } else {
                int tmp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }
        }
    }

    // Method to test above
    public static void main(String args[]) {
        gnomeSort ob = new gnomeSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Array.toString(nums));
        ob.gnomeSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Array.toString(nums));
    }
}

