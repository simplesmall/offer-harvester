package cn.forthee.DataType.Chapter3;

import java.util.Arrays;

/**
 * @author 简小
 * @create 2020-09-13 12:00
 * Array 常用工具方法  equals sort fill binarySearch
 */
public class ArrayTools {
    public static void main(String[] args) {
        String[] strsOne = new String[]{"Bill", "Cat", "Carrit"};
        String[] strsTwo = new String[]{"Bill", "Cat", "Carrit"};

        System.out.println("Init Array value out : " + Arrays.toString(strsOne));

        // equals
        boolean equals = Arrays.equals(strsOne, strsTwo);
        System.out.println("Arrays.equals(strsOne, strsTwo) : " + equals);

        // sort
        Arrays.sort(strsOne);
        System.out.println(Arrays.toString(strsOne));

     /*   String[][] ints = new String[][]{{"a,c,b"},{"f","e","d"},{"h","y","j"}};
        System.out.println(Arrays.toString(ints));
//        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));*/
        // fill 填充数组中所有的元素值为fil第二参数
        Arrays.fill(strsOne, "ADD");
        System.out.println(Arrays.toString(strsOne));

        // binary search
        int[] source = new int[]{23, 12, 3, 25, 77, 11, 100, 35, 78, 9};
        System.out.println("Natural array is : " + Arrays.toString(source));
        Arrays.sort(source);
        System.out.println("After sort, Array is : " + Arrays.toString(source));
        int index = Arrays.binarySearch(source, 12);
        System.out.println(index);
    }
}
