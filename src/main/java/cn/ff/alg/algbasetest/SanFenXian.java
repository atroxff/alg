package cn.ff.alg.algbasetest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 *
 * 输入数据包含两行。
 *
 * 第一行第一个数为n(1≤n≤2*105)， 表示A队进球数，接下来n个正整数表示A队每次进球的投篮位置ai(1≤ai≤2*109)。
 *
 * 第二行第一个数为m(1≤m≤2*105)，表示B队进球数，接下来m个正整数表示B队每次进球的投篮位置bi(1≤bi≤2*109)。
 * 一个整数，表示A队得分减去B队得分的最大值
 */

public class SanFenXian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int m = in.nextInt();
        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i]=in.nextInt();
        }
        System.out.println(maxScore(a, b, n, m));
    }

    private static long maxScore(long[] a, long[] b, int anum, int bnum) {


        Arrays.sort(a);
        Arrays.sort(b);
        //d是ab中的某个值，遍历得到最大值
        int j = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < anum; i++) {
            for (; j < bnum; j++) {
                if (b[j] >= a[i]) {
                    break;
                }
            }
            int left = (anum - i) * 3 - (bnum - j) * 3 + (i * 2 - j * 2);
            if (left > max)
                max = left;
        }
        //d比a，b数组小  a，b都是三分球
        int right = anum * 3 - bnum * 3;
        if (right > max)
            max = right;
        //d比a，b数组大  a，b都是两分球
        int mid = anum * 2 - bnum * 2;
        if (mid > max)
            max = mid;
        return max;

    }
}
