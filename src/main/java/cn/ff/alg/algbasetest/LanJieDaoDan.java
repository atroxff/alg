package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 *
 * 导弹拦截系统,
 * 虽然它的第一发炮弹能够到达任意的高度，
 * 但是以后每一发炮弹都不能高于等于前一发的高度
 *
 * 第一行输入测试数据组数N（1<=N<=10）
 * 接下来一行输入这组测试数据共有多少个导弹m（1<=m<=20）
 * 接下来行输入导弹依次飞来的高度，所有高度值均是大于0的正整数。
 *
 *
 * 求最大递减子数列长度
 */
public class LanJieDaoDan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            int[] a = new int[m];
            for (int j = 0; j < m; j++) {
                a[j] = in.nextInt();
            }
            System.out.println(core(a));
        }
    }

    private static int core(int[] arr) {
        //389 207 155 300 299 170 158 65
        int n = arr.length;
        int[] dp = new int[n];
        //求出以每个元素结尾的最长递减子序列
        //动态规划 备忘录
        dp[0] = 1;
        for(int i=1; i<arr.length; i++){//以arr[i]为子序列末元素 i=1 2 3...
            int max = 0;
            for(int j=i-1; j>=0; j--){//向前查找
                if(arr[j] > arr[i] && dp[j] > max){//前者>当前值 且 最大值>max 更新最大值
                        max = dp[j];
                }
            }
            dp[i] = max+1;//更新i值最优解
        }
        int max = 0;
        for(int i=0; i<dp.length; i++){
            if(dp[i] > max)
                max = dp[i];
        }
        return max;
    }
}
