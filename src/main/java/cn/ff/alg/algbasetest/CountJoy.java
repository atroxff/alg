package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 */
public class CountJoy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();//n=4
            int m = in.nextInt();
            int k = in.nextInt();
            if (n == 0 && m == 0 && k == 0) break;
            int i = 0;
            int step = 2 * n - 2;//截取循环出现的子串
            int joy[] = new int[step];
            while (true) {
                i++;
                if (i % 7 == 0 || String.valueOf(i).indexOf('7') != -1) {//7倍数++
                    if (i % step == 0) {
                        joy[step-1]++;
                    }else{
                        joy[(i%step)-1]++;
                    }
                }
                if (m == 1 && joy[0] == k) {
                    break;
                }
                if (m == n && joy[n-1] == k) {
                    break;
                }
                if (joy[m - 1] + joy[step - m + 1] == k && m != 1 && m != n) {
                    break;
                }
            }
            System.out.println(i);
        }
        in.close();

    }
}
