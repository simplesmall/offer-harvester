package cn.forthee.JavaAll.Interface;

/**
 * Author by 简小
 * Created on lucky 2020/9/22  9:33.
 * Abstract class
 */
abstract class Cat implements Animal{
    static String CatName = "From parend period";
    String getStatic(){
        return "来自静态方法取到的静态变量 : "+this.CatName;
    }
    public void eat() {
        System.out.println("兔子吃草嘻嘻嘻 来自父类");
    }

    abstract void run();

    public Cat() {
    }
}

