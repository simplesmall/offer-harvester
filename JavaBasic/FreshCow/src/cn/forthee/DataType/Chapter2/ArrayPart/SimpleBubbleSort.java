package cn.forthee.DataType.Chapter2.ArrayPart;

/**
 * @author 简小
 * @create 2020-09-13 0:29
 * 手写简单冒泡排序
 */
public class SimpleBubbleSort {
    public static void main(String[] args) {
        int[] source = new int[]{1, 4, 5, 3, 2, 6, 23, 88, 33, 9, 100};
        showArray(source);

        // bubble sort kernel code
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - 1; j++) {
                if (source[j] > source[j + 1]) {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter bubble sort : ");
        showArray(source);
    }

    public static void showArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }
    }
}
