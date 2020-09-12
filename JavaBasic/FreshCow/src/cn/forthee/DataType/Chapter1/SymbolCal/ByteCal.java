package cn.forthee.DataType.Chapter1.SymbolCal;

/**
 * @author 简小
 * @create 2020-09-12 18:13"
 * 位运算
 *  可用于进制转换及两个数的值交换 + 数值转换左右移 >> <<  & | ^
 *  左移增大 右移减小  与 全真为真  或 全假才假  异或 不同为真
 */
public class ByteCal {

    public static void exchangeTwo(int a, int b) {
        // Method1: using other temp number
        /*int c = 0;
        c = a;
        a = b;
        b = c;*/

        // Method2: using byte calculate
        // 一个数异或任何一个数偶数次值不变
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("In method a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int j = 256;
        System.out.println("j >> 3: " + (j >> 3));
        int i = 21;
        i = -21;
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 27 :" + (i << 27));

        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));

        System.out.println("\n#####完美分隔符#####\n");

        int a = 12, b = 5;
        System.out.println("a = " + a + " b = " + b);
        exchangeTwo(a, b);
        System.out.println("a = " + a + " b = " + b);
    }
}
