package cn.forthee.basic;

public class DataTypeErr {
    public static void main(String[] args) {
        /*
        * 直接写 float f = 3.4报错,因为3.4为双精度,应该初始化为double
        * */
        float f = (float) 3.4;
        System.out.println(f);
        short s = 1;
        /*
        * s = s + 1 一样的,类型转换,因为1是int型的
        * */
        s = (short) (s+1);
        s+=1;
        System.out.println(s);
        //        按位与和逻辑与
        System.out.println(1&1);
        // 逻辑与
        System.out.println(1 == 1 & 1<2);
        // 短路与
        System.out.println(2 > 3 && 3 < 4);
        System.out.println("############Integer对象###########");
        Integer a=3,b=3,c=129,d=129;
        System.out.println(a == b);
        System.out.println(c==d);
    }
}
