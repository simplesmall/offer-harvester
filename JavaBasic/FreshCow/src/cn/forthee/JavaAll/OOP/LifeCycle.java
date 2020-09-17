package cn.forthee.JavaAll.OOP;

/**
 * @author 简小
 * @create 2020-09-17 23:05
 * 对象创建顺序
 */
public class LifeCycle {
    private static String staticField = getStaticField();

    public static String getStaticField() {
        System.out.println("Get static field ...");
        String staticField = "staticField";
        return staticField;
    }

    static {
        System.out.println("static code block out , staic value is : " + staticField);
    }

    private String field = getField();

    public String getField() {
        System.out.println("Get field...");
        String field = "normal field";
        return field;
    }

    {
        System.out.println("normal code block out,value is : " + field);
    }

    public static void main(String[] args) {
        LifeCycle lifeCycle = new LifeCycle();
        System.out.println(lifeCycle.staticField);
    }
}
