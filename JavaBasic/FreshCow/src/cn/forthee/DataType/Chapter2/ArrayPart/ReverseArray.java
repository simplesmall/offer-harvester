package cn.forthee.DataType.Chapter2.ArrayPart;

/**
 * @author 简小
 * @create 2020-09-13 0:11
 * 数组反转
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 4, 6, 7, 8};
        System.out.println("初始数组:");
        showArray(ints);

        //方法一：
        for (int i = 0, j = ints.length - 1; i < j; i++, j--) {
            int temp = ints[i];
            ints[i] = ints[j];
            ints[j] = temp;
        }

        System.out.println("\n\n反转后的数组:");
        showArray(ints);

        //方法二：
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }

        System.out.println("\n\n再次反转后的数组:");
        showArray(ints);
    }

    public static void showArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }
}
