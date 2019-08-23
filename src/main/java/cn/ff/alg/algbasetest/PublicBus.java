package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 *
 * 题目描述
 * 一个公交车经过n个站点，乘客从前门上车，从后门下车。
 * 现在统计了在第i个站，下车人数a[i]，以及上车人数b[i]。
 * 问公交车运行时候车上最多有多少乘客
 */
public class PublicBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] up = new int[n];
        int[] down= new int[n];
        for (int i = 0; i < n; i++) {
            down[i]=sc.nextInt();
            up[i]=sc.nextInt();
        }

        System.out.println(maxPeople(up,down));
    }

    private static int maxPeople(int[] up, int[] down) {
        int max = 0;
        int now = 0;
        for (int i = 0; i < up.length; i++) {
            now = now + up[i] - down[i];
            if(now>max) max=now;
        }
        return max;
    }


}
