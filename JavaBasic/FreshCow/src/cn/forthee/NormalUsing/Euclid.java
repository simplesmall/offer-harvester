package cn.forthee.NormalUsing;

/**
 * Author by 简小
 * Created on lucky 2020/9/10  10:01.
 */
public class Euclid {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(2, 4));
    }
}
