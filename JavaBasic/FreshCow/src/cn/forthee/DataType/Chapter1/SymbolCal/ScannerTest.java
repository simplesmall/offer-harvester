package cn.forthee.DataType.Chapter1.SymbolCal;

import java.util.Scanner;

/**
 * @author 简小
 * @create 2020-09-12 22:01
 * Scanner 类的简单使用
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一些文字: ");
        String next = scanner.next();
        System.out.println(next);

        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("请输入体重");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.println("你觉得自己帅吗?(true/false)");
        boolean isHandsome = scanner.nextBoolean();
        System.out.println(isHandsome);

        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        System.out.println("请输入你的性别：(男/女)");
        String gender = scanner.next();
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);
    }
}
