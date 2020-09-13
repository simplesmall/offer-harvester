package cn.forthee.DataType.Chapter4.OOup;

/**
 * @author 简小
 * @create 2020-09-13 23:30
 * 可变参数
 */
public class VariableParam {
    public static void main(String[] args) {
        int age = 12;
        float weight = 3.23234f;
        String str = "Hello";
        String[] strs = new String[]{"Fruit", "Juice", "Rice"};

        show();
        show(age);
        show(str);
        show(strs);
        show(age, strs);
        show(weight, strs);
    }

    public static void show() {
        System.out.println("No params show: NULL");
    }

    public static void show(int intVal) {
        System.out.println("INT params show:" + intVal);
    }

    public static void show(String str) {
        System.out.println("STRING params show:");
    }

    public static void show(String[] strs) {
        System.out.println("STRING[] params show:");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
    }

    // Method one
    public static void show(int age, String[] strs) {
        System.out.println("\n\nINT + STRING[] params show:");
        System.out.println("Age value is : " + age + "\n");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
    }

    // Method two
    public static void show(float age, String... strs) {
        System.out.println("\n\nFLOAT + STRING... params show:");
        System.out.println("Age value is : " + age + "");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
    }
}
