package cn.forthee.DataType.Chapter4.OOup;

/**
 * @author 简小
 * @create 2020-09-13 23:21
 * 方法重载
 */
public class FuncReload {
    /**
     * 两同一不同: 同一个类中,同样的函数名 ,参数列表不同: 参数个数,参数类型
     *
     * @param args
     */
    public static void main(String[] args) {
        int intVal = 12;
        int intVal2 = 34;
        float floatVal = 3.14159f;
        double doubleVal = 12.45566778;

        sum(intVal, intVal2);
        sum(intVal, floatVal);
        sum(floatVal, doubleVal);
    }

    public static void sum(int i, int j) {
        System.out.println("INT " + i + " + " + j + " = " + (i + j));
    }

    public static void sum(int i, float j) {
        System.out.println("INT-FLOAT " + i + " + " + j + " = " + (i + j));
    }

    public static void sum(float i, double j) {
        System.out.println("FLOAT-DOUBLE " + i + " + " + j + " = " + (i + j));
    }
}
