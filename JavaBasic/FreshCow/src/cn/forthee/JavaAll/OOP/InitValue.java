package cn.forthee.JavaAll.OOP;

/**
 * @author 简小
 * @create 2020-09-17 22:54
 * 默认初始化值
 */
public class InitValue {
    int intVal;
    char charVal;
    String strVal;
    short shortVal;
    double douVal;
    float floVal;
    boolean boolVal;
    byte byteVal;

    int ints[];
    int[] intsOne;

    public static void main(String[] args) {
        InitValue initObj = new InitValue();
        System.out.println("各类型元素初始值: ");
        System.out.println("intVal : " + initObj.intVal);
        System.out.println("charVal : " + initObj.charVal);
        System.out.println("strVal : " + initObj.strVal);
        System.out.println("shortVal : " + initObj.shortVal);
        System.out.println("douVal : " + initObj.douVal);
        System.out.println("floVal : " + initObj.floVal);
        System.out.println("boolVal : " + initObj.boolVal);
        System.out.println("byteVal : " + initObj.byteVal);
        System.out.println("intsVal : " + initObj.ints);
        System.out.println("intsOneVal : " + initObj.intsOne);
    }
}
