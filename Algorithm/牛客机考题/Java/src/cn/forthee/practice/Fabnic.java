<<<<<<< HEAD:Algorithm/牛客机考题/Java/src/cn/forthee/practice/Fabnic.java
package cn.forthee.practice;

public class Fabnic {
    public static int Fab(int n){
        if (n<3){
            return 1;
        }
        return Fab(n-1)+Fab(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fab(6 ));
    }
}
=======
public class Fabnic {
    public static int Fab(int n){
        if (n<3){
            return 1;
        }
        return Fab(n-1)+Fab(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fab(6 ));
    }
}
>>>>>>> fffc461ebf8617325a19b4ff2f4afceaa046a502:Algorithm/牛客机考题/Java/src/Fabnic.java
