package cn.forthee.JavaAll.OOP;

/**
 * @author 简小
 * @create 2020-09-17 23:44
 * 初始化构造函数
 */
public class InitConstructor {
    public static void main(String[] args) {
        Apple noApple = new Apple();
        Apple numApple = new Apple(2);
        Apple greenApple = new Apple("green");
        Apple fullApple = new Apple(3, "red");
    }

    public static class Apple {
        int num;
        String color;

        public Apple() {
            System.out.println("无参构造函数");
        }

        public Apple(int num) {
            // 默认调用自身的构造函数
            this(num, "red");
            System.out.println("传入num 构造函数");
        }

        public Apple(String color) {
            this(1, color);
            System.out.println("传入color 构造函数");
        }

        public Apple(int num, String color) {
            this.num = num;
            this.color = color;
            System.out.println("两个参数的构造函数");
        }
    }
}

