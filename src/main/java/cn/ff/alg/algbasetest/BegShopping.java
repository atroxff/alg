package cn.ff.alg.algbasetest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 * 对于每组数据，第一行是两个整数n(1<=n<=100000)表示物品的数量和V（1<=V<=1000000），
 * 表示小易最多能拿的总价值，
 * 第二行n个整数，a1,a2..an.(1<=ai<=1000)表示每个物品的价值
 * 最多能拿到多少件物品？
 */
public class BegShopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int nowValue = v;
        int nowCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > nowValue) {
                break;
            }else{
                nowValue = nowValue - a[i];
                nowCount++;
            }
        }
        System.out.println(nowCount);
    }
}
