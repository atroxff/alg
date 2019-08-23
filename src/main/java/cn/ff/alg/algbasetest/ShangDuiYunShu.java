package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/7
 *
 * 输入的第一行包含一个整数n，表示包括首都在内的王国的城市数
 * 接下来n-1行，描述王国的高速路（王国的高速路一定是n-1条）
 * 每行三个整数Pi, Qi, Di，表示城市Pi和城市Qi之间有一条高速路，长度为Di千米。
 *
 */
public class ShangDuiYunShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int a[][] = new int[n][n];
        int maxInt = cost(100*9);//此距离表示城市不通
        //初始化数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    a[i][j]=0;
                }else{
                    a[i][j]=maxInt;
                }
            }
        }
        //填入路程
        for (int i = 0; i < n - 1; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int v=in.nextInt();
            a[start-1][end-1]=v;
            a[end-1][start-1]=v;
        }
        int max = 0;
        //补全所有可能路程
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    a[i][j] = Math.min(a[i][k] + a[k][j], a[i][j]);
                    a[j][i] = a[i][j];
                }
            }
        }
        max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i][j]==maxInt)continue;
                max=Math.max(max,a[i][j]);
            }
        }
        System.out.println(cost(max));
    }
    private static int  cost(int n) {//n km路费
        int c = n * (n + 1) / 2 + n * 10;
        return c;
    }
}
