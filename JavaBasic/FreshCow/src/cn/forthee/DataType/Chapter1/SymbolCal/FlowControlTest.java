package cn.forthee.DataType.Chapter1.SymbolCal;

/**
 * @author 简小
 * @create 2020-09-12 20:25
 */
public class FlowControlTest {
    public static void main(String[] args) {
        System.out.println("#####矩形\n");
        drawRectangle();

        System.out.println("\n####三角形\n");
        drawTriangle();

        System.out.println("\n####乘法表\n");
        multiTable();

        System.out.println("\n####质数\n");
        int primeInput = 100;
        System.out.println(primeInput + " 以内的质数有: ");
        System.out.println(primeNum(primeInput));
    }

    // 判断一个数是否是质素
    public static boolean isPrimeNum(int val) {
        if (val < 2) {
            return false;
        }
        if (val == 2 || val == 3) {
            return true;
        } else {
            // 除去 1 和 参数本身,从2开始到输入值开方,检验是否能除尽
            for (int i = 2; i <= (int) Math.sqrt(val); i++) {
                if (val % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    // 指定数字之内的质数
    public static String primeNum(int target) {
        String result = "";
        for (int i = 1; i <= target; i++) {
            if (isPrimeNum(i)) {
                result += (i + ", ");
            }
        }
        return result;
    }

    // 绘制乘法表
    public static void multiTable() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + "x" + (i + 1) + "=" + ((i + 1) * (j + 1)) + "\t");
            }
            System.out.println();
        }
    }

    // 绘制三角形
    public static void drawTriangle() {
        System.out.println("\t\t行\t列");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print((i > 2 ? "\t" : "\t\t") + (i + 1) + "\t" + (6 - i) + "\n");
        }
    }

    // 测试画矩形
    public static void drawRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
