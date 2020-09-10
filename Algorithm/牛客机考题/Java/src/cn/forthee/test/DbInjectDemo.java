package cn.forthee.test;

public class DbInjectDemo {
    public static void main(String[] args) {
        String name = "root";
        String pwd = "root' or '1'='1";
        String sql = "select * from user where username= "+name+" and password="+pwd+"'";
        /*
        * select * from user where username= root and password=root'or '1'='1'
        * 单引号闭合形成 '1' = '1'达到攻击效果
        * */
        System.out.println(sql);
    }
}
