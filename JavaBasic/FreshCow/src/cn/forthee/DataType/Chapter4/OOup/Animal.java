package cn.forthee.DataType.Chapter4.OOdown;

/**
 * @author 简小
 * @create 2020-09-13 18:55
 * Animal test class
 */
public class Animal {
    String name;
    int age;
    Float weight;

    public void bark(){
        System.out.println("The determied Animal is barking ... ");
    }
    @Override
    public String toString() {
        return "Name " + this.name + " Age " + this.age + " Weight " + this.weight;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Animal() {
        System.out.println("默认无参的构造函数自动执行...");
    }
}
