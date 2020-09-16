package cn.forthee.sort;

import java.util.Arrays;

/**
 * Author by 简小
 * Created on lucky 2020/9/16  9:39.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 9, 5, 3, 7, 11, 6};
        System.out.println("Origin data out is : " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("After bubble sort out is : " + Arrays.toString(nums));
    }

    // 冒泡排序
    public static void bubbleSort(int[] nums) {
        // 设置标志位表示是否更改过
        boolean hasChange = true;
        for (int i = 0; i < nums.length - 1 && hasChange; i++) {
            // 每次开始比较初始化标志位为false
            hasChange = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    // 数据比较中有改变位置说明还未出完排序,改变标志位
                    hasChange = true;
                }
            }
        }
    }

    // 交换算法交换部分
    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}
