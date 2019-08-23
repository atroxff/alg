package cn.ff.alg.algbasetest;

import java.util.Scanner;

/**
 * @author hefeng
 * @version 1.0
 * @Date 2019/3/12
 *
 * 假设小赛站的楼层距离地面N米，
 * 球从小赛手里自由落下，每次落地后反跳回原高度的一半；再落下，再反跳回原高度的一半。
 * 小赛和三个小朋友站在不同的楼层，同时放下手中的小球，
 * 当小球全部落到地面不跳时，求4个小球一共经过了多少米？
 *
 */
public class XiaoQiuDeJuLi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int sum = distance(a) + distance(b) + distance(c) + distance(d);
        System.out.println(sum);

    }

    private static int distance(int n) {
        if(n==1)return 1;
        return 3*n/2 + distance(n / 2);
    }
}
