package cn.forthee.DataType.Chapter1.SymbolCal;

/**
 * @author 简小
 * @create 2020-09-12 19:56
 * 三元运算符
 */
public class TernaryCal {
    public static void main(String[] args) {
        // 三元运算符可以嵌套使用
        /*
         * 凡是可以使用三元的一定可以写成 if-else 结构,反之不成立
         * */
        String ternaryResult = 1 > 2 ? "1 > 2" : 2 > 3 ? " 2 > 3" : "2 <= 3";

        // Express  ternary by if-else,same as upper
        if (1 > 2) {
            ternaryResult = "1 > 2";
        } else if (2 > 3) {
            ternaryResult = "2 > 3";
        } else {
            ternaryResult = "2 <= 3";
        }

        System.out.println("Ternary operator out is : " + ternaryResult);
    }
}
