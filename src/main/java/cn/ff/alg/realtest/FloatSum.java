package cn.ff.alg.realtest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 *
 * 有一个分数序列 2/1,3/2,5/3,8/5,13/8,21/13,.... 求这个分数序列的前n项之和。
 */
public class FloatSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int m = in.nextInt();
            System.out.printf("%.4f",fn(m));
            System.out.println();
        }
    }

    private static double fn(int m) {
        double a = 2;
        double b = 1;
        double sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += a / b;
            double t = a;
            a = a + b;
            b = t;
        }
        return sum;
    }
}
