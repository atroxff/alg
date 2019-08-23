package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 *
 * 经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化
 * 第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
 */

public class GuShen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(value(n));
        System.out.println(value1(n));
    }

    //累加法
    private static int value1(int n) {
        int price=1;//股本价值
        int downdate=3;//第一次跌的日期
        int step=3;//跌停日期间隔步长
        for (int i = 2; i <= n; i++) {
            if (downdate == i) {
                price--;
                downdate=downdate+step;
                step++;
            }else{
                price++;
            }
        }
        return price;
    }
    //公式法
    private static int value(int n) {
        int k=  (int)(Math.sqrt(9+8*(n-1))-3)/2;
        int sum = k*(k+1)/2;
        int price = sum-k+(n-sum-k);
        return price;
    }
}
