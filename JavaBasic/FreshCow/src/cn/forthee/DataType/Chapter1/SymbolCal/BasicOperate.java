package cn.forthee.DataType.Chapter1.SymbolCal;

/**
 * @author 简小
 * @create 2020-09-12 17:22
 * 基本运算符 + %
 */
public class BasicOperate {
    public static void main(String[] args) {
        //    Add
        int page = 12;
        int pageSelf = 5;

        System.out.println("page source value:" + page);

        //      Same as below line to add 1
        int pageAddOne = page + 1;
        System.out.println("pageAddOne: " + pageAddOne);

        int pageAddFront = ++page;
        System.out.println("pageAddFront: " + pageAddFront);

        //      Infact now the page value is equal to ++page BUt don't send to pageAddBack
        int pageAddBack = page++;
        System.out.println("pageAddBack: " + pageAddBack);
        System.out.println("pageAddBack page value: " + page);

        System.out.println("page value after add back: " + page + '\n');

        System.out.println("######完美分隔符#####\n");

        System.out.println("pageSelf init value: " + pageSelf);

        // %
        int remainder = page % pageSelf;
        System.out.println("remainder of " + page + " % " + pageSelf + " = " + remainder);


    }
}
