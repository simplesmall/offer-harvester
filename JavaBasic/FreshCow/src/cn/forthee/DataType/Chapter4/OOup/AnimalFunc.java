package cn.forthee.DataType.Chapter4.OOup;

/**
 * @author 简小
 * @create 2020-09-13 18:59
 * 对象内存解析 + equals
 */
public class AnimalFunc {
    public static void main(String[] args) {
        Animal animalOne = new Animal();
        Animal animalTwo = new Animal();

        System.out.println("animalOne.equals(animalTwo) : " + animalOne.equals(animalTwo));

        Animal animalThree = animalOne;

        System.out.println("animalOne == animalThree : " + (animalOne == animalThree));
        System.out.println("animalOne.equals(animalThree) : " + animalOne.equals(animalThree) + '\n');

        animalOne.setName("ANIMALONE");
        animalOne.setAge(23);
        System.out.println("Obj init and set params : " + animalOne.toString());

        animalThree.setWeight((float) 500.0);
        System.out.println("animalThree.setWeight : " + animalOne.toString());

        animalOne.setWeight((float) 3.14159);
        System.out.println("animalOne.setWeight : " + animalOne.toString());

        // 匿名对象 创建一个新对象的时候没有显示赋值给一个变量就是匿名对象
        new Animal().bark();
    }
}
