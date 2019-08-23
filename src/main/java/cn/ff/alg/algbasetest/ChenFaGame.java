package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 */
public class ChenFaGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int t = in.nextInt();
        int value[] = new int[n * t + 1];
        int tmp = 1;
        value[1] = 1;
        int sum=1;
        for (int i = 2; i <= n * t; i++) {
            value[i]=value[i-1]+tmp;
            if(value[i]>=k){
                value[i] %= k;
            }
            tmp++;
            if (i % n == 1) {
                sum += value[i];
            }
        }
        System.out.println(sum);
    }
}
