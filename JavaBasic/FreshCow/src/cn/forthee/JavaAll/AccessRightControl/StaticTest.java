package cn.forthee.JavaAll.AccessRightControl;

/**
 * @author 简小
 * @create 2020-09-17 22:41
 */
public class StaticTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eat();

        Fruit fruit = new Fruit();
        fruit.eat();
    }
}

class Fruit {
    private String name;
    float sales;

    public Fruit() {
        System.out.println("默认父类空值构造函数");
    }
    public void eat(){
        System.out.println("eat fruit..");
    }
}

class Apple extends Fruit {
    private float weight;

    public Apple() {
        super();
        System.out.println("Apple 子类中的构造函数");
    }

    @Override
    public void eat() {
        System.out.println("eat Apple...");
    }
}