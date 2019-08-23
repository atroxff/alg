package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 *
 * 有n个格子，从左到右放成一排，编号为1-n。
 * 共有m次操作，有3种操作类型：
 * 1.修改一个格子的权值，
 * 2.求连续一段格子权值和，
 * 3.求连续一段格子的最大值。
 * 对于每个2、3操作输出你所求出的结果。
 */
public class FangGeGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }

        while (in.hasNext()) {
            int opt = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            switch (opt) {
                case 1:
                    arr[a] = b;
                    break;
                case 2:
                    int sum = sumA2B(arr, a, b);
                    System.out.println(sum);
                    break;
                case 3:
                    int max = maxA2B(arr, a, b);
                    System.out.println(max);
                    break;
                default:
                    System.out.println("opt is invalid");
            }
        }
    }

    private static int maxA2B(int[] arr, int a, int b) {
        int max = 0;
        for (int i = a; i <= b; i++) {
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }

    private static int sumA2B(int[] arr, int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
