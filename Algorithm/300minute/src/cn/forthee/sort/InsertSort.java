package cn.forthee.sort;

import java.util.Arrays;

/**
 * Author by 简小
 * Created on lucky 2020/9/16  9:59.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 4, 2, 1, 8, 6, 10, 9};
        System.out.println("Origin data : " + Arrays.toString(nums));
        insertSort(nums);
        System.out.println("Sorted data : " + Arrays.toString(nums));

    }

    public static int[] insertSort(int[] nums) {
        for (int i = 1, j, current; i < nums.length; i++) {
            current = nums[i];
            for (j = i - 1; j >= 0 && nums[j] > current; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = current;
        }
        return nums;
    }
}
