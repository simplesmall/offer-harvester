package cn.forthee.JavaAll.Interface;

/**
 * Author by 简小
 * Created on lucky 2020/9/22  9:32.
 */
public class Rat implements Animal {
    public Rat() {
    }

    @Override
    public void bark() {
        System.out.println("老鼠格叽格叽..");
    }

    @Override
    public void eat() {
        System.out.println("老鼠偷吃小米");
    }

    public static void main(String[] args) {
        // 抽象类不能实例化,只能实例化具体的类
        Cat cat = new Cat() {
            @Override
            public void bark() {
                System.out.println("兔子吃草嘻嘻嘻");
            }

            @Override
            void run() {
                System.out.println("兔子跑起来哗啦啦");
            }
        };
        cat.run();
        cat.bark();
        System.out.println(cat.CatName);
        System.out.println(cat.getStatic());
        Rat rat = new Rat();
        rat.bark();
    }
}
