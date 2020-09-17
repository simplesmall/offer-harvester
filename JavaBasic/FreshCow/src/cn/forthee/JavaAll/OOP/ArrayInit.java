package cn.forthee.JavaAll.OOP;

/**
 * @author 简小
 * @create 2020-09-17 23:21
 */
public class ArrayInit {
    public static void main(String[] args) {
        int[] intsOne = {1, 2, 12, 23};

        System.out.println("sum(intsOne) : " + sum());
        System.out.println("sum(intsOne) : " + sum(1));
        System.out.println("sum(intsOne) : " + sum(1, 4));
        System.out.println("sum(intsOne) : " + sum(new int[]{2, 4, 6}));
        System.out.println("sum(intsOne) : " + sum(intsOne));

        // value domain
        {
            int outer = 999;
            {
                int inner = 111;
                System.out.println("Inner outer : " + outer);
                System.out.println("Inner inner : " + inner);
            }
            System.out.println("Outer outer : " + outer);
        }

        Apple apple = new Apple();
        System.out.println(apple.num);
        // 都可以执行,只是this 指向跳转的问题
        apple.eatApple();
        apple.eatApple().eatApple();
        System.out.println(apple.num);
    }

    // 数组可变参数函数调用
    public static int sum(int... nums) {
        int sum = 0;
        for (int num :
                nums) {
            sum += num;
        }
        return sum;
    }

    // this 指向
    public static class Apple {
        int num;

        Apple eatApple() {
            this.num++;
            return this;
        }
    }
}
