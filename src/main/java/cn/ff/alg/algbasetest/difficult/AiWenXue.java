package cn.ff.alg.algbasetest.difficult;

import java.util.Arrays;
import java.util.Scanner;

/** ??????
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 *
 * 写诗歌
 * 输入
 * 第一行一个整数n，表示小赛想创作诗歌的字数的集合大小。
 * 接下来n行，其中第i行为一个数a[i]，表示这首诗歌可以是a[i]个字。
 * 第二行一个整数m，表示小赛可以构想出m种不同长度短句的个数。
 * 接下来m行，其中第i行为两个整数b[i],c[i]，其中b[i]表示小赛可以创作出长度为b[i]的短句，对应的c[i]表示创作这种长度短句所消耗的时间
 */
public class AiWenXue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }

        int m=in.nextInt();
        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=in.nextInt();
            c[i]=in.nextInt();
        }

        solve(a, b, c);
    }

    //局部最优，贪心算法
    private static void solve(int[] a, int[] b, int[] c) {
        Arrays.sort(a);//从小到大
        int t=0;
        double[] p = new double[b.length];
        for (int i = 0; i < b.length - 1; i++) {
            p[i] = (double) c[i] / b[i];
        }
        //从小到大对a中的进行贪心算法
//        for (int i = 0; i <= a.length; i++) {
//            int bm = a[i] / b[0];
//            while(bm > 0){
//
//            }
//        }
    }
}
