package cn.forthee.DataType.Chapter1.SymbolCal;

/**
 * @author 简小
 * @create 2020-09-12 20:04
 * 流程控制
 */
public class FlowControl {
    public static void main(String[] args) {
        // for cycle using case
        for (int i = 0; i < 5; i++) {
            System.out.print("\nNow the item value is : " + i);
            if (i == 3) {
                System.out.println(choosenMenu(i));
            }
            // If using case
            if (isOdd(i)) {
                System.out.print(" And " + i + " is Odd number...");
            }
        }

        whileTest();

        dowhileTest();

    }

    private static void dowhileTest() {
        // do-while using will run at least once no matter what the "while" condition is
        int initNum = 0;
        do {
            System.out.println("Do while testig, now the item is: " + initNum);
            initNum++;
        } while (initNum < 0);
    }

    public static void whileTest() {
        int initNum = 0;
        while (initNum < 4) {
            System.out.println("Now is while testing,the item value is : " + initNum);
            initNum++;
        }
    }

    // 是否是偶数
    public static boolean isOdd(int val) {
        return (val % 2 == 0) ? true : false;
    }

    // switch-case using case
    public static String choosenMenu(int chooseNum) {
        switch (chooseNum) {
            case 1:
                return "麻辣花椰菜";
            case 2:
                return "酸甜番茄酱";
            default:
                return "随意牛肉面";
        }
    }

}

