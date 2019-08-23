package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/8
 * n a b x
 * 现有一个序号为 x 的零件，它是由 n 个序号在[a,b]区间内的零件组合而成，
 * 求n 个序号在[a,b]区间内的零件组合为 x 零件的概率
 *
 * 总组合数 (b-a)`n
 * 可能数
 */
public class LingJianZuHe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();

        int count = fun(n, a, b, x);//所有可行解
        int sum = 1;
        for (int i = 0;i<n;i++ ) {
            sum=sum*(b-a+1);
        }
        System.out.printf("%.4f", count * 1.00 / sum);
    }

    private static int fun(int n, int a, int b, int x) {
        while (n >= 0 && x >= 0) {
            if(n==0&&x==0)
                return 1;
            else
            {
                int count=0;
                for(int i=a;i<=b;i++)//递归
                {
                    count+=fun(n-1,a,b,x-i);
                }
                return count;
            }
        }
        return 0;
    }
}
