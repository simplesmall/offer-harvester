package cn.forthee.sort;

import java.util.Arrays;

/**
 * Author by 简小
 * Created on lucky 2020/9/16  10:17.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 3, 6, 8, 10, 6};
        System.out.println(Arrays.toString(nums));
        int[] result = mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] nums, int low, int high) {
        // 是否只剩下最后一个元素,是则直接返回
        if (low >= high) return nums;

        // 从中间将数组分成两个部分
        int mid = low + (high - low) / 2;
        // 递归排序左右两半
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        // 合并排好序的左右两半
        int[] result = merge(nums, low, mid, high);
        return result;
    }

    public static void sort(int[] nums, int low, int hight) {

    }

    public static int[] merge(int[] nums, int low, int mid, int high) {
        // 复制一份留作排序对照
        int[] copy = nums.clone();
        int left = low, start = low, right = mid + 1;
        while (left <= high) {
            if (start > mid) {
                nums[left++] = copy[right++];
            } else if (right > high) {
                nums[left++] = copy[start++];
            } else if (copy[right] < copy[start]) {
                nums[left++] = copy[right++];
            } else {
                nums[left++] = copy[start++];
            }
        }
        return nums;
    }
}

