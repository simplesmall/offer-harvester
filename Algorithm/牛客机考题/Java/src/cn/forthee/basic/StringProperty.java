package cn.forthee.basic;


import java.util.Objects;

class CloneTest implements Cloneable{
    public String Jerry =  "Jerry Boss";
    public String Tom =  "Employee Tom";
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneTest cloneTest = (CloneTest) o;
        return Objects.equals(Jerry, cloneTest.Jerry) &&
                Objects.equals(Tom, cloneTest.Tom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Jerry, Tom);
    }
}
public class StringProperty {
    public static void main(String[] args) {
        String a = "abc";
        String b = a;
        System.out.println("a="+a+"\tb="+b+'\n');
        System.out.println("a==b\t"+(a==b));
        System.out.println("a.equals(b)\t"+a.equals(b)+'\n');

        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1= " +str1+'\t'+"str2="+str2);
        System.out.println("str1 == str2\t"+(str1 == str2));
        System.out.println("str1.equals(str2)\t"+str1.equals(str2)+'\n');

        Integer  ina = 129;
        Integer  inb = 129;
        System.out.println("129 ==129\t"+(ina == inb));
        System.out.println("127 == 127 \t"+(127 == 127));
        System.out.println("ina.equals(inb)\t"+ina.equals(inb)+'\n');

        String strLenTest = "Hello world";
        System.out.println(strLenTest+"'s length is : "+strLenTest.length());

        StringBuffer strBuf = new StringBuffer("StringBufferTest");
        System.out.println(strBuf.append("'\t'+DEMO can append?")+"\n");

        Object obj = new Object();
        System.out.println(obj.getClass());
    }
}
