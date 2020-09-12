package cn.forthee.DataType.Charter2.ArrayPart;

/**
 * @author 简小
 * @create 2020-09-12 23:11
 * 二维数组
 */
public class TwoDimentionArray {
    public static void main(String[] args) {
        // 静态初始化
        int[][] intTwo = new int[][]{{11}, {22, 33}, {33, 44, 55}};
        // 静态初始化
        int[][] ints = new int[4][4];
        int[][] intOne = new int[4][];
        // 类型推断
        int[] initThree[] = {{1}, {2}, {3}};

        // 错误方式
        // String[][] strOne = new String[][4];
        // String[4][5] strTwo = new String[][];
        // String[][] strThree = new String[4][3]{{"1"},{"2","3"},{"4"}};

        String[][] strs = new String[][]{{"aa"}, {"bb", "cc"}, {"ddd"}};

        // Traverse two dimention arrays
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length; j++) {
                System.out.print(strs[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n#####二维数组内存解析==>初始化\n");
        // 二维数组内存解析
        // 初始化
        int[][] initOne = new int[4][3];
        for (int i = 0; i < initOne.length; i++) {
            for (int j = 0; j < initOne[i].length; j++) {
                System.out.print(initOne[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        // 外层初始化为null,内存不能调用,否则出错.
        int[][] initTwo = new int[4][];
        System.out.println("initTwo[0] value is : "+initTwo[0]);

        System.out.println("\n#####赋值操作\n");

        int[] Arr1,Arr2;
        Arr1 = new int[]{1,3,5,4};
        // 赋值操作
        Arr2 = Arr1;
        for (int i = 0; i < Arr2.length; i++) {
            System.out.println(Arr2[i]);
        }
        // 复制操作
        int[] Arr3= new int[Arr1.length];
        for (int i = 0; i < Arr1.length; i++) {
            Arr3[i] = Arr1[i];
        }

        System.out.println("\n#####复制操作\n");
        System.out.println("Arr3 is show below : ");
        for (int i = 0; i < Arr3.length; i++) {
            System.out.println(Arr3[i]);
        }
    }
}
