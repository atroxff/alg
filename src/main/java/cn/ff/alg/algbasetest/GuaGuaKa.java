package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 *
 * 婴儿米粉每盒里都有一张刮刮卡，凭3个刮刮卡可以兑换一盒同等价位的米粉
 * 对于初始买入的n盒米粉，最后一共能拿到多少盒米粉。
 */
public class GuaGuaKa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int sum = n;
        int k = n;
        while (k >= 3) {
            sum = sum + k / 3;
            k = k % 3 + k / 3;
        }
        System.out.println(sum);

    }
}
