package cn.forthee.DataType.Charter2.ArrayPart;

/**
 * @author 简小
 * @create 2020-09-12 23:11
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

        String[][] strs = new String[][]{{"aa"}, {"bb", "cc"}, {"ddd"}};

        int[] intTest[] = {{1}, {2}, {3}};
    }
}
