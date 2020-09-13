package cn.forthee.DataType.Chapter3;

import java.util.Arrays;

/**
 * @author 简小
 * @create 2020-09-13 12:54
 */
public class ArrayErr {
    public static void main(String[] args) {
        //Case 1: 数组越界 ArrayIndexOutOfBoundsException
        int[] intOne = new int[]{1, 2, 3};
        // 下面循环条件不能 <= Index只有0~2 即 0 ~ length-1
        //        for (int i = 0; i <= intOne.length; i++) {
        for (int i = 0; i < intOne.length; i++) {
            System.out.print(intOne[i]);
        }

        //Case 2: 空指针 NullPointerException

        // 2.1
        int[] intTwo = new int[]{0, 1, 2};
        intTwo = null;
        // 因为上面的赋值语句已经将外层置为NULL
        // System.out.println(intTwo[0]);

        // 2.2
        int[][] intThree = new int[3][];
        System.out.println(intThree[1]);
        // 外层初始化为null,调用null[index] 出错
        // System.out.println(intThree[1][0]);

        // 2.3
        // 所有将外层置为Null并调用Obj.method 方式调用Arrays方法的其他情况
        String[] strs = new String[]{"AAA", "BBB", "CCC"};
        strs[0] = null;
        // System.out.println(strs[0].toString());

    }
}
