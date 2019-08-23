package cn.ff.alg.algbasetest;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/6
 * 题目描述：（斐波那契数列）
 * 有一楼梯共m级，刚开始时你在第一级，若每次只能跨上一级或二级，要走上第m级，共有多少走法？
 * 注：规定从一级到一级有0种走法。
 */
public class ShangTaiJie {
    public static void main(String[] args) {

        int m=4;
        System.out.println(fn(m));
    }


    //递归法   1级0，2级1，3级2
    private static int fn(int n) {
        if(n==1)return 0;
        if(n==2)return 1;
        if(n==3)return 2;

        return fn(n - 1) + fn(n - 2);
    }
}
