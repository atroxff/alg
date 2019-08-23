package cn.ff.alg.realtest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/11
 * 士兵排成队列
 * 将军能看到某个士兵当且仅当他的身高严格大于他前面的所有士兵。
 * 问将军一共能看到多少个士兵。
 */
public class SoldierQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            int arr[] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println(fun(arr));
        }
    }

    private static int fun(int[] arr) {
        int c = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
                c++;
            }
        }
        return c;
    }
}
