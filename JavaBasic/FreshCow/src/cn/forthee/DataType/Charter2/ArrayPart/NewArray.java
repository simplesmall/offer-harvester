package cn.forthee.DataType.Charter2.ArrayPart;

/**
 * @author 简小
 * @create 2020-09-12 22:18
 * 一维数组
 */
public class NewArray {
    public static void main(String[] args) {
        String[] strings = {"Hello", "Fruit", "pet"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        int[] refInt = {1, 2, 3, 4};

        int[] ints = new int[]{1, 2, 3};
        // 错误示例
        // int[] ints = new int[3]{1, 2, 3};

        int[] counter = new int[10];
        // 错误示例
        //int[10] counter = new int[10];
        //int[] counter = new int[];


        System.out.println(refInt.length);
        System.out.println(ints.length);
        System.out.println(counter.length);

        System.out.println();

        // 一位数组内存解析
        // 初始化数组根据数据类型赋值为null
        String[] str = new String[4];
        // 分别赋值
        str[1] = "xiaofang";
        str[2] = "xiaohua";
        // 重新指向,再次创建新对象,再次赋值为null
        str = new String[3];
        System.out.println(str[0]);

    }
}
